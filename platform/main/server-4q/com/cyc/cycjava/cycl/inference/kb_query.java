package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.canon_tl;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
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
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_proof_spec;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class kb_query extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "1f2f8f77798bb4a84ea2d7b9d9df50e6931844b3a61744863fc12118b651d402";
	@SubL(source = "cycl/inference/kb-query.lisp", position = 2300L)
	private static SubLSymbol $transcript_kbq_definition_assertionsP$;
	@SubL(source = "cycl/inference/kb-query.lisp", position = 24900L)
	public static SubLSymbol $use_kbq_practice_rulesP$;
	private static SubLObject $$CycLQuerySpecification;
	private static SubLSymbol $sym1$CYCL_SENTENCE_P;
	private static SubLSymbol $sym2$POSSIBLY_MT_P;
	private static SubLSymbol $sym3$QUERY_PROPERTIES_P;
	private static SubLObject $$isa;
	private static SubLList $list5;
	private static SubLList $list6;
	private static SubLSymbol $sym7$UPDATE_KBQ_DEFINITION;
	private static SubLObject $$TestVocabularyMt;
	private static SubLSymbol $sym9$UPDATE_KBQ_DEFINITION_SILENT;
	private static SubLSymbol $sym10$_EXIT;
	private static SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING;
	private static SubLObject $$EverythingPSC;
	private static SubLObject $$InferenceSentenceParameter;
	private static SubLObject $$sentenceParameterValueInSpecifica;
	private static SubLSymbol $GAF;
	private static SubLSymbol $TRUE;
	private static SubLObject $$InferenceMicrotheoryParameter;
	private static SubLObject $$microtheoryParameterValueInSpecif;
	private static SubLObject $$InferenceModeParameter;
	private static SubLObject $$inferenceModeParameterValueInSpec;
	private static SubLObject $$softwareParameterValueInSpecifica;
	private static SubLObject $$ist_Asserted;
	private static SubLObject $$BaseKB;
	private static SubLObject $$Quote;
	private static SubLObject $$EscapeQuote;
	private static SubLString $str26$Inference_Parameter__S_unknown_by;
	private static SubLObject $$InferenceAllowedRulesParameter;
	private static SubLObject $$queryPracticeRules;
	private static SubLSymbol $NON_EXPLANATORY_SENTENCE;
	private static SubLList $list30;
	private static SubLSymbol $sym31$INTEGERP;
	private static SubLSymbol $sym32$STRINGP;
	private static SubLSymbol $sym33$KB_SET_OF_BINDING_SETS_P;
	private static SubLObject $$MCQuestionNthOptionFn;
	private static SubLObject $$multipleChoiceOptionFullLabel;
	private static SubLObject $$multipleChoiceOptionIndexLabel;
	private static SubLObject $$multipleChoiceOptionPayload;
	private static SubLObject $$comment;
	private static SubLList $list39;
	private static SubLString $str40$The_template___A__passed_for_the_;
	private static SubLObject $$TemplateFromTestQueryFn;
	private static SubLList $list42;
	private static SubLObject $$formulaTemplateGloss;
	private static SubLObject $$folderContainsResource;
	private static SubLList $list45;
	private static SubLSymbol $sym46$QUOTED_SENTENCE;
	private static SubLList $list47;
	private static SubLSymbol $sym48$EL_SUBSTITUTIONS;
	private static SubLSymbol $sym49$QUESTION_TEMPLATE;
	private static SubLString $str50$The_query_specification___A__has_;
	private static SubLString $str51$The_query_specification___A__has_;
	private static SubLObject $$cycLPattern;
	private static SubLObject $$metaTemplate;
	private static SubLList $list54;
	private static SubLObject $$QuestionSuggestionTemplate_Single;
	private static SubLObject $$questionTemplateInstantiations;
	private static SubLObject $$InferenceNonExplanatorySentencePa;
	private static SubLList $list58;
	private static SubLSymbol $sym59$MT;
	private static SubLObject $$InferencePSC;
	private static SubLString $str61$The_query_specification___A__has_;
	private static SubLObject $$querySpecificationForFormulaTempl;
	private static SubLSymbol $sym63$KBQ_QUERY_PROPERTIES;
	private static SubLSymbol $ALLOWED_RULES;
	private static SubLSymbol $sym65$QUERY_PROPERTY_P;
	private static SubLObject $$MultipleChoiceKBContentTest;
	private static SubLObject $$MultipleChoiceQuerySpecification;
	private static SubLSymbol $sym68$KBQ_QUERY_SPEC_P;
	private static SubLObject $$mcQuestionNthOption;
	private static SubLSymbol $sym70$SAFE__;
	private static SubLSymbol $sym71$FIRST;
	private static SubLList $list72;
	private static SubLSymbol $MAX_TIME;
	private static SubLSymbol $FORWARD_MAX_TIME;
	private static SubLSymbol $IGNORE;
	private static SubLObject $$TheEmptySet;
	private static SubLSymbol $RESULT_UNIQUENESS;
	private static SubLSymbol $MAX_NUMBER;
	private static SubLSymbol $MAX_PROOF_DEPTH;
	private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
	private static SubLSymbol $METRICS;
	private static SubLSymbol $sym82$FORT_P;
	private static SubLObject $$TestQueryFn;
	private static SubLSymbol $SEVERE;
	private static SubLObject $$UnrunnableQuery;
	private static SubLObject $$QueryFn;
	private static SubLList $list87;
	private static SubLString $str88$___A_has_no_query_sentence_;
	private static SubLSymbol $NO_QUERY_SENTENCE;
	private static SubLString $str90$___A_has_too_many_arguments_;
	private static SubLSymbol $TOO_MANY_ARGUMENTS;
	private static SubLString $str92$;
	private static SubLSymbol $sym93$IST_SENTENCE_WITH_CHLMT_P;
	private static SubLString $str94$___A_has_more_than_one_query_sent;
	private static SubLSymbol $MORE_THAN_ONE_QUERY_SENTENCE;
	private static SubLString $str96$___A_has_no_query_Mt_;
	private static SubLSymbol $NO_QUERY_MT;
	private static SubLString $str98$___A_has_more_than_one_query_Mt_;
	private static SubLSymbol $MORE_THAN_ONE_QUERY_MT;
	private static SubLSymbol $TRANSFORMATION_ALLOWED_;
	private static SubLSymbol $BINDINGS;
	private static SubLSymbol $CONDITIONAL_SENTENCE_;
	private static SubLSymbol $sym103$PROPERTY_LIST_P;
	private static SubLSymbol $sym104$REMOVAL_ASK_QUERY_PROPERTY_P;
	private static SubLList $list105;
	private static SubLSymbol $sym106$REMOVAL_ASK_QUERY_METRIC_P;
	private static SubLSymbol $ANSWER_COUNT;
	private static SubLSymbol $TIME_TO_FIRST_ANSWER;
	private static SubLSymbol $TIME_TO_LAST_ANSWER;
	private static SubLSymbol $TOTAL_TIME;
	private static SubLSymbol $COMPLETE_TOTAL_TIME;
	private static SubLSymbol $TIME_PER_ANSWER;
	private static SubLSymbol $LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
	private static SubLString $str114$time_to_implement_metric__S;
	private static SubLSymbol $CACHE_INFERENCE_RESULTS_;
	private static SubLList $list116;
	private static SubLList $list117;
	private static SubLList $list118;
	private static SubLSymbol $sym119$EL_LIST_ITEMS;
	private static SubLList $list120;
	private static SubLSymbol $sym121$KEYWORDP;
	private static SubLObject $$InferenceParameter;
	private static SubLObject $$CycHLSupportModule;
	private static SubLSymbol $sym124$CONSTANT_P;
	private static SubLObject $$CycHLTruthValue;
	private static SubLObject $$SecondsDuration;
	private static SubLString $str127$Unit__A_can_t_be_converted_to_sec;
	private static SubLSymbol $sym128$KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE;
	private static SubLSymbol $TEST;
	private static SubLSymbol $OWNER;
	private static SubLSymbol $CLASSES;
	private static SubLSymbol $KB;
	private static SubLSymbol $FULL;
	private static SubLSymbol $WORKING_;
	private static SubLList $list135;

	@SubL(source = "cycl/inference/kb-query.lisp", position = 800L)
	public static SubLObject kbq_query_spec_p(SubLObject v_object) {
		return makeBoolean(NIL != isa.isa_in_any_mtP(v_object, $$CycLQuerySpecification) || NIL != janus.janus_operation_p(v_object));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 1000L)
	public static SubLObject kbq_assert_query_spec_definition(SubLObject query_spec, SubLObject sentence, SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt, SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs) {
		assert NIL != cycl_grammar.cycl_sentence_p(sentence) : sentence;
		if (NIL != non_explanatory_sentence && !assertionsDisabledInClass && NIL == cycl_grammar.cycl_sentence_p(non_explanatory_sentence)) {
			throw new AssertionError(non_explanatory_sentence);
		}
		assert NIL != hlmt.possibly_mt_p(mt) : mt;
		assert NIL != inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) : v_inference_parameters;
		assert NIL != hlmt.possibly_mt_p(defining_mt) : defining_mt;
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
		for (remainder = NIL, remainder = inference_parameters.remove_inference_engine_query_property_defaults(v_inference_parameters); NIL != remainder; remainder = conses_high.cddr(remainder)) {
			inference_parameter = remainder.first();
			value = conses_high.cadr(remainder);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 2300L)
	public static SubLObject kbq_assert(SubLObject sentence, SubLObject mt, SubLObject transcriptP) {
		if (transcriptP == UNPROVIDED) {
			transcriptP = $transcript_kbq_definition_assertionsP$.getDynamicValue();
		}
		return (NIL != transcriptP) ? ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED) : cyc_kernel.cyc_assert(sentence, mt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 2500L)
	public static SubLObject update_kbq_definition(SubLObject query_spec, SubLObject sentence, SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt, SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs) {
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 3000L)
	public static SubLObject update_kbq_definition_silent(SubLObject query_spec, SubLObject sentence, SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt, SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs) {
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
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject _prev_bind_0 = $transcript_kbq_definition_assertionsP$.currentBinding(thread);
		try {
			$transcript_kbq_definition_assertionsP$.bind(NIL, thread);
			return kbq_ensure_query_spec_definition(query_spec, sentence, mt, v_inference_parameters, defining_mt, non_explanatory_sentence, multiple_choice_option_specs);
		} finally {
			$transcript_kbq_definition_assertionsP$.rebind(_prev_bind_0, thread);
		}
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 3600L)
	public static SubLObject kbq_ensure_query_spec_definition(SubLObject query_spec, SubLObject sentence, SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt, SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs) {
		assert NIL != cycl_grammar.cycl_sentence_p(sentence) : sentence;
		if (NIL != non_explanatory_sentence && !assertionsDisabledInClass && NIL == cycl_grammar.cycl_sentence_p(non_explanatory_sentence)) {
			throw new AssertionError(non_explanatory_sentence);
		}
		assert NIL != hlmt.possibly_mt_p(mt) : mt;
		assert NIL != inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) : v_inference_parameters;
		assert NIL != hlmt.possibly_mt_p(defining_mt) : defining_mt;
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
		for (remainder = NIL, remainder = v_inference_parameters; NIL != remainder; remainder = conses_high.cddr(remainder)) {
			inference_parameter = remainder.first();
			value = conses_high.cadr(remainder);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 4800L)
	public static SubLObject kbq_current_query_spec_assertions_for_parameter(SubLObject query_spec, SubLObject parameter) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject assertions = NIL;
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			if ($$InferenceSentenceParameter.eql(parameter)) {
				SubLObject pred_var = $$sentenceParameterValueInSpecifica;
				if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
					SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
					SubLObject done_var = NIL;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
						if (NIL != valid) {
							SubLObject final_index_iterator = NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
								SubLObject done_var_$1 = NIL;
								SubLObject token_var_$2 = NIL;
								while (NIL == done_var_$1) {
									SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
									SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(gaf));
									if (NIL != valid_$3) {
										assertions = cons(gaf, assertions);
									}
									done_var_$1 = makeBoolean(NIL == valid_$3);
								}
							} finally {
								SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind(T, thread);
									SubLObject _values = Values.getValuesAsVector();
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
								}
							}
						}
						done_var = makeBoolean(NIL == valid);
					}
				}
			} else if ($$InferenceMicrotheoryParameter.eql(parameter)) {
				SubLObject pred_var = $$microtheoryParameterValueInSpecif;
				if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
					SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
					SubLObject done_var = NIL;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
						if (NIL != valid) {
							SubLObject final_index_iterator = NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
								SubLObject done_var_$2 = NIL;
								SubLObject token_var_$3 = NIL;
								while (NIL == done_var_$2) {
									SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
									SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(gaf));
									if (NIL != valid_$4) {
										assertions = cons(gaf, assertions);
									}
									done_var_$2 = makeBoolean(NIL == valid_$4);
								}
							} finally {
								SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind(T, thread);
									SubLObject _values2 = Values.getValuesAsVector();
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values2);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
								}
							}
						}
						done_var = makeBoolean(NIL == valid);
					}
				}
			} else if ($$InferenceModeParameter.eql(parameter)) {
				SubLObject pred_var = $$inferenceModeParameterValueInSpec;
				if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
					SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
					SubLObject done_var = NIL;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
						if (NIL != valid) {
							SubLObject final_index_iterator = NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
								SubLObject done_var_$3 = NIL;
								SubLObject token_var_$4 = NIL;
								while (NIL == done_var_$3) {
									SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
									SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
									if (NIL != valid_$5) {
										assertions = cons(gaf, assertions);
									}
									done_var_$3 = makeBoolean(NIL == valid_$5);
								}
							} finally {
								SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind(T, thread);
									SubLObject _values3 = Values.getValuesAsVector();
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values3);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
								}
							}
						}
						done_var = makeBoolean(NIL == valid);
					}
				}
			} else {
				SubLObject pred_var = $$softwareParameterValueInSpecifica;
				if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, THREE_INTEGER, pred_var)) {
					SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, THREE_INTEGER, pred_var);
					SubLObject done_var = NIL;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
						if (NIL != valid) {
							SubLObject final_index_iterator = NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
								SubLObject done_var_$4 = NIL;
								SubLObject token_var_$5 = NIL;
								while (NIL == done_var_$4) {
									SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
									SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
									if (NIL != valid_$6 && assertions_high.gaf_arg1(assertion).eql(parameter)) {
										assertions = cons(assertion, assertions);
									}
									done_var_$4 = makeBoolean(NIL == valid_$6);
								}
							} finally {
								SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind(T, thread);
									SubLObject _values4 = Values.getValuesAsVector();
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values4);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 5800L)
	public static SubLObject kbq_ensure_query_spec_sentence(SubLObject query_spec, SubLObject sentence, SubLObject defining_mt) {
		SubLObject cdolist_list_var;
		SubLObject current_sentence_assertions = cdolist_list_var = kbq_current_query_spec_assertions_for_parameter(query_spec, $$InferenceSentenceParameter);
		SubLObject sentence_assertion = NIL;
		sentence_assertion = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (!assertions_high.assertion_mt(sentence_assertion).eql(defining_mt) || !assertions_high.gaf_arg2(sentence_assertion).equal(sentence)) {
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 6500L)
	public static SubLObject kbq_assert_query_spec_sentence(SubLObject query_spec, SubLObject sentence, SubLObject defining_mt) {
		return kbq_assert(kbq_assertible_query_spec_sentence(sentence, query_spec), defining_mt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 6700L)
	public static SubLObject kbq_assertible_query_spec_sentence(SubLObject sentence, SubLObject query_spec) {
		return list($$sentenceParameterValueInSpecifica, list($$Quote, sentence), query_spec);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 6900L)
	public static SubLObject kbq_askable_query_spec_sentence(SubLObject sentence_var, SubLObject query_spec, SubLObject hlP) {
		if (hlP == UNPROVIDED) {
			hlP = NIL;
		}
		SubLObject sentence_arg = NIL;
		if (NIL != hlP) {
			sentence_arg = list($$Quote, sentence_var);
		} else {
			sentence_arg = list($$Quote, list($$EscapeQuote, sentence_var));
		}
		return list($$sentenceParameterValueInSpecifica, sentence_arg, query_spec);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 7200L)
	public static SubLObject kbq_ensure_query_spec_mt(SubLObject query_spec, SubLObject mt, SubLObject defining_mt) {
		SubLObject current_mt_assertions = kbq_current_query_spec_assertions_for_parameter(query_spec, $$InferenceMicrotheoryParameter);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 7800L)
	public static SubLObject kbq_assert_query_spec_mt(SubLObject query_spec, SubLObject mt, SubLObject defining_mt) {
		return kbq_assert(list($$microtheoryParameterValueInSpecif, mt, query_spec), defining_mt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 7900L)
	public static SubLObject kbq_ensure_query_spec_inference_parameter_value(SubLObject query_spec, SubLObject query_property, SubLObject value, SubLObject defining_mt) {
		SubLObject inference_parameter_constant = kbq_inference_parameter_from_keyword(query_property);
		SubLObject current_query_property_assertions = kbq_current_query_spec_assertions_for_parameter(query_spec, inference_parameter_constant);
		SubLObject already_knownP = NIL;
		SubLObject kb_value = kbq_encode_kb_inference_parameter_value(value, query_property);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 8800L)
	public static SubLObject kbq_assert_query_spec_inference_parameter_value(SubLObject query_spec, SubLObject query_property, SubLObject value, SubLObject defining_mt) {
		SubLObject inference_parameter_constant = kbq_inference_parameter_from_keyword(query_property);
		SubLObject kb_value = kbq_encode_kb_inference_parameter_value(value, query_property);
		if (NIL != forts.fort_p(inference_parameter_constant)) {
			return kbq_assert_query_spec_inference_parameter_value_int(query_spec, inference_parameter_constant, kb_value, defining_mt);
		}
		Errors.warn($str26$Inference_Parameter__S_unknown_by, query_property);
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 9400L)
	public static SubLObject kbq_assert_query_spec_inference_parameter_value_int(SubLObject query_spec, SubLObject inference_parameter_constant, SubLObject value, SubLObject defining_mt) {
		if ($$InferenceModeParameter.eql(inference_parameter_constant)) {
			return kbq_assert(list($$inferenceModeParameterValueInSpec, value, query_spec), defining_mt, UNPROVIDED);
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
		return kbq_assert(list($$softwareParameterValueInSpecifica, inference_parameter_constant, value, query_spec), defining_mt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 10000L)
	public static SubLObject kbq_ensure_query_spec_pragmatics(SubLObject query_spec, SubLObject non_explanatory_sentence, SubLObject defining_mt) {
		return kbq_ensure_query_spec_inference_parameter_value(query_spec, $NON_EXPLANATORY_SENTENCE, list($$Quote, non_explanatory_sentence), defining_mt);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 10300L)
	public static SubLObject kbq_assert_query_spec_pragmatics(SubLObject query_spec, SubLObject non_explanatory_sentence, SubLObject defining_mt) {
		return kbq_assert_query_spec_inference_parameter_value(query_spec, $NON_EXPLANATORY_SENTENCE, list($$Quote, non_explanatory_sentence), defining_mt);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 10500L)
	public static SubLObject kbq_ensure_multiple_choice_option_spec(SubLObject query_spec, SubLObject mc_option_spec, SubLObject defining_mt) {
		if (NIL == list_utilities.member_equalP(mc_option_spec, kbq_multiple_choice_option_specs(query_spec))) {
			SubLObject option_num = NIL;
			SubLObject full_label = NIL;
			SubLObject index_label = NIL;
			SubLObject payload = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(mc_option_spec, mc_option_spec, $list30);
			option_num = mc_option_spec.first();
			SubLObject current = mc_option_spec.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, mc_option_spec, $list30);
			full_label = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, mc_option_spec, $list30);
			index_label = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, mc_option_spec, $list30);
			payload = current.first();
			current = current.rest();
			if (NIL == current) {
				if (NIL != payload) {
					assert NIL != Types.integerp(option_num) : option_num;
					assert NIL != Types.stringp(full_label) : full_label;
					assert NIL != Types.stringp(index_label) : index_label;
					assert NIL != bindings.kb_set_of_binding_sets_p(payload) : payload;
					SubLObject existing_option = narts_high.find_nart(list($$MCQuestionNthOptionFn, query_spec, option_num));
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
				cdestructuring_bind.cdestructuring_bind_error(mc_option_spec, $list30);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 11600L)
	public static SubLObject kbq_assert_multiple_choice_option_spec(SubLObject query_spec, SubLObject mc_option_spec, SubLObject defining_mt) {
		SubLObject option_num = NIL;
		SubLObject full_label = NIL;
		SubLObject index_label = NIL;
		SubLObject payload = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(mc_option_spec, mc_option_spec, $list30);
		option_num = mc_option_spec.first();
		SubLObject current = mc_option_spec.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, mc_option_spec, $list30);
		full_label = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, mc_option_spec, $list30);
		index_label = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, mc_option_spec, $list30);
		payload = current.first();
		current = current.rest();
		if (NIL == current) {
			if (NIL != payload) {
				assert NIL != Types.integerp(option_num) : option_num;
				assert NIL != Types.stringp(full_label) : full_label;
				assert NIL != Types.stringp(index_label) : index_label;
				assert NIL != bindings.kb_set_of_binding_sets_p(payload) : payload;
				if (NIL == string_utilities.empty_string_p(full_label)) {
					kbq_assert(list($$multipleChoiceOptionFullLabel, list($$MCQuestionNthOptionFn, query_spec, option_num), full_label), defining_mt, UNPROVIDED);
				}
				if (NIL == string_utilities.empty_string_p(index_label)) {
					kbq_assert(list($$multipleChoiceOptionIndexLabel, list($$MCQuestionNthOptionFn, query_spec, option_num), index_label), defining_mt, UNPROVIDED);
				}
				kbq_assert(list($$multipleChoiceOptionPayload, list($$MCQuestionNthOptionFn, query_spec, option_num), payload), defining_mt, UNPROVIDED);
			}
		} else {
			cdestructuring_bind.cdestructuring_bind_error(mc_option_spec, $list30);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 12400L)
	public static SubLObject kbq_ensure_query_spec_comments(SubLObject query_spec, SubLObject comments, SubLObject defining_mt) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current_comment_assertions = NIL;
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			SubLObject pred_var = $$comment;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, ONE_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, ONE_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$17 = NIL;
							SubLObject token_var_$18 = NIL;
							while (NIL == done_var_$17) {
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
								SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
								if (NIL != valid_$19) {
									current_comment_assertions = cons(assertion, current_comment_assertions);
								}
								done_var_$17 = makeBoolean(NIL == valid_$19);
							}
						} finally {
							SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
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
			SubLObject current_comment = assertions_high.gaf_arg2(assertion2);
			SubLObject current_mt = assertions_high.assertion_mt(assertion2);
			if (!current_mt.eql(defining_mt) || NIL == conses_high.member(current_comment, comments, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 13300L)
	public static SubLObject kbq_assert_query_spec_comment(SubLObject query_spec, SubLObject comment, SubLObject defining_mt) {
		return kbq_assert(list($$comment, query_spec, comment), defining_mt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 13400L)
	public static SubLObject kbq_assert_template_definition(SubLObject query_spec, SubLObject template, SubLObject glosses, SubLObject folder_mt_pairs, SubLObject defining_mt) {
		SubLObject current_template = kbq_template(query_spec);
		if (NIL != current_template && NIL != template && !current_template.eql(template)) {
			Errors.error($str40$The_template___A__passed_for_the_, template, query_spec, current_template);
		}
		if (NIL != current_template) {
			template = current_template;
		}
		if (NIL == template) {
			template = el_utilities.make_el_formula($$TemplateFromTestQueryFn, list(query_spec), UNPROVIDED);
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
			SubLObject datum = current = folder_mt_pair;
			SubLObject folder = NIL;
			SubLObject mt = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
			folder = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
			mt = current.first();
			current = current.rest();
			if (NIL == current) {
				kbq_assert_template_folder(template, folder, mt);
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, $list42);
			}
			cdolist_list_var = cdolist_list_var.rest();
			folder_mt_pair = cdolist_list_var.first();
		}
		return template;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 14300L)
	public static SubLObject kbq_ensure_template_definition(SubLObject query_spec, SubLObject template, SubLObject glosses, SubLObject folder_mt_pairs, SubLObject defining_mt) {
		SubLObject current_template = kbq_template(query_spec);
		if (NIL != current_template && NIL != template && !current_template.eql(template)) {
			Errors.error($str40$The_template___A__passed_for_the_, template, query_spec, current_template);
		}
		if (NIL != current_template) {
			template = current_template;
		}
		if (NIL == template) {
			template = el_utilities.make_el_formula($$TemplateFromTestQueryFn, list(query_spec), UNPROVIDED);
		}
		kbq_ensure_template_glosses(template, glosses, defining_mt);
		kbq_ensure_template_folders(template, folder_mt_pairs);
		return template;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 15000L)
	public static SubLObject kbq_ensure_template_glosses(SubLObject template, SubLObject glosses, SubLObject defining_mt) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current_gloss_assertions = NIL;
		if (NIL != forts.fort_p(template)) {
			SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
				mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
				SubLObject pred_var = $$formulaTemplateGloss;
				if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, ONE_INTEGER, pred_var)) {
					SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, ONE_INTEGER, pred_var);
					SubLObject done_var = NIL;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
						if (NIL != valid) {
							SubLObject final_index_iterator = NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
								SubLObject done_var_$21 = NIL;
								SubLObject token_var_$22 = NIL;
								while (NIL == done_var_$21) {
									SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
									SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(assertion));
									if (NIL != valid_$23) {
										current_gloss_assertions = cons(assertion, current_gloss_assertions);
									}
									done_var_$21 = makeBoolean(NIL == valid_$23);
								}
							} finally {
								SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind(T, thread);
									SubLObject _values = Values.getValuesAsVector();
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
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
			SubLObject current_gloss = assertions_high.gaf_arg2(assertion2);
			SubLObject current_mt = assertions_high.assertion_mt(assertion2);
			if (!current_mt.eql(defining_mt) || NIL == conses_high.member(current_gloss, glosses, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 15800L)
	public static SubLObject kbq_assert_template_gloss(SubLObject template, SubLObject gloss, SubLObject defining_mt) {
		return kbq_assert(list($$formulaTemplateGloss, template, gloss), defining_mt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 16000L)
	public static SubLObject kbq_ensure_template_folders(SubLObject template, SubLObject folder_mt_pairs) {
		SubLObject cdolist_list_var;
		SubLObject current_folder_mt_pairs = cdolist_list_var = (NIL != forts.fort_p(template)) ? template_folders(template) : NIL;
		SubLObject current_folder_mt_pair = NIL;
		current_folder_mt_pair = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL == subl_promotions.memberP(current_folder_mt_pair, folder_mt_pairs, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
				SubLObject current;
				SubLObject datum = current = current_folder_mt_pair;
				SubLObject folder = NIL;
				SubLObject mt = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
				folder = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
				mt = current.first();
				current = current.rest();
				if (NIL == current) {
					ke.ke_unassert_now(list($$folderContainsResource, folder, template), mt);
				} else {
					cdestructuring_bind.cdestructuring_bind_error(datum, $list42);
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			current_folder_mt_pair = cdolist_list_var.first();
		}
		cdolist_list_var = folder_mt_pairs;
		SubLObject folder_mt_pair = NIL;
		folder_mt_pair = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL == subl_promotions.memberP(folder_mt_pair, current_folder_mt_pairs, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
				SubLObject current;
				SubLObject datum = current = folder_mt_pair;
				SubLObject folder = NIL;
				SubLObject mt = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
				folder = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
				mt = current.first();
				current = current.rest();
				if (NIL == current) {
					kbq_assert_template_folder(template, folder, mt);
				} else {
					cdestructuring_bind.cdestructuring_bind_error(datum, $list42);
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			folder_mt_pair = cdolist_list_var.first();
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 16700L)
	public static SubLObject kbq_assert_template_folder(SubLObject template, SubLObject folder, SubLObject mt) {
		return kbq_assert(list($$folderContainsResource, folder, template), mt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 16800L)
	public static SubLObject kbq_sentences(SubLObject query_spec) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list45);
		SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			SubLObject quoted_sentence = list_utilities.alist_lookup_without_values(v_bindings, $sym46$QUOTED_SENTENCE, UNPROVIDED, UNPROVIDED);
			return list(czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED));
		}
		thread.resetMultipleValues();
		success = formula_pattern_match.formula_matches_pattern(query_spec, $list47);
		v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			SubLObject el_substitutions = list_utilities.alist_lookup_without_values(v_bindings, $sym48$EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED);
			SubLObject question_template = list_utilities.alist_lookup_without_values(v_bindings, $sym49$QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED);
			return query_from_template_sentences(question_template, el_substitutions);
		}
		SubLObject sentences = conses_high.union(kb_mapping_utilities.pred_values_in_any_mt(query_spec, $$sentenceParameterValueInSpecifica, TWO_INTEGER, ONE_INTEGER, $TRUE), kb_mapping_utilities.pred_arg_values_in_any_mt(query_spec, $$softwareParameterValueInSpecifica, $$InferenceSentenceParameter, THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, $TRUE), Symbols.symbol_function(EQUAL), UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = sentences;
		SubLObject sentence = NIL;
		sentence = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			result = cons(czer_main.unquote_quoted_term(sentence, UNPROVIDED), result);
			cdolist_list_var = cdolist_list_var.rest();
			sentence = cdolist_list_var.first();
		}
		return Sequences.nreverse(result);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 17800L)
	public static SubLObject kbq_sentence(SubLObject query_spec) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list45);
		SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			SubLObject quoted_sentence = list_utilities.alist_lookup_without_values(v_bindings, $sym46$QUOTED_SENTENCE, UNPROVIDED, UNPROVIDED);
			return czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
		}
		SubLObject sentences = kbq_sentences(query_spec);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 18500L)
	public static SubLObject query_from_template_sentences(SubLObject question_template, SubLObject el_substitutions) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sentences = NIL;
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			SubLObject cycl_pattern = NIL;
			SubLObject pred_var = $$cycLPattern;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(question_template, ONE_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(question_template, ONE_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
							SubLObject done_var_$25 = NIL;
							SubLObject token_var_$26 = NIL;
							while (NIL == done_var_$25) {
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
								SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
								if (NIL != valid_$27) {
									cycl_pattern = assertions_high.gaf_arg(assertion, TWO_INTEGER);
									SubLObject sentence_pattern = czer_main.unquote_quoted_term(cycl_pattern, UNPROVIDED);
									SubLObject item_var = perform_query_from_template_substitutions(sentence_pattern, el_substitutions);
									if (NIL == conses_high.member(item_var, sentences, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
										sentences = cons(item_var, sentences);
									}
								}
								done_var_$25 = makeBoolean(NIL == valid_$27);
							}
						} finally {
							SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
			SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != meta_template) {
				SubLObject items_var = query_from_template_sentences(meta_template, el_substitutions);
				if (items_var.isVector()) {
					SubLObject vector_var = items_var;
					SubLObject backwardP_var = NIL;
					SubLObject length;
					SubLObject v_iteration;
					SubLObject element_num;
					SubLObject item_var2;
					SubLObject item;
					for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
						element_num = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
						item = (item_var2 = Vectors.aref(vector_var, element_num));
						if (NIL == conses_high.member(item_var2, sentences, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
							sentences = cons(item_var2, sentences);
						}
					}
				} else {
					SubLObject cdolist_list_var = items_var;
					SubLObject item2 = NIL;
					item2 = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						SubLObject item_var3 = item2;
						if (NIL == conses_high.member(item_var3, sentences, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 19200L)
	public static SubLObject perform_query_from_template_substitutions(SubLObject expression_template, SubLObject el_substitutions) {
		SubLObject substitutions_alist = NIL;
		SubLObject cdolist_list_var = el_utilities.el_set_items(el_substitutions);
		SubLObject el_substitution = NIL;
		el_substitution = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = el_utilities.el_list_items(el_substitution);
			SubLObject template_term = NIL;
			SubLObject actual_term = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list54);
			template_term = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list54);
			actual_term = current.first();
			current = current.rest();
			if (NIL == current) {
				substitutions_alist = list_utilities.alist_enter(substitutions_alist, template_term, actual_term, UNPROVIDED);
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, $list54);
			}
			cdolist_list_var = cdolist_list_var.rest();
			el_substitution = cdolist_list_var.first();
		}
		return (NIL != expression_template) ? cycl_utilities.expression_sublis(substitutions_alist, expression_template, Symbols.symbol_function(EQUAL), UNPROVIDED) : NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 19600L)
	public static SubLObject query_from_template_mts(SubLObject question_template, SubLObject el_substitutions) {
		if (NIL != isa.isa_in_any_mtP(question_template, $$QuestionSuggestionTemplate_Single)) {
			SubLObject instantiation = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$questionTemplateInstantiations, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			return (NIL != instantiation) ? kbq_mts(instantiation) : NIL;
		}
		SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject mts = (NIL != meta_template) ? kbq_mts(meta_template) : NIL;
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 20300L)
	public static SubLObject query_from_template_inference_params(SubLObject question_template, SubLObject el_substitutions) {
		if (NIL != isa.isa_in_any_mtP(question_template, $$QuestionSuggestionTemplate_Single)) {
			SubLObject instantiation = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$questionTemplateInstantiations, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			return (NIL != instantiation) ? kbq_inference_params(instantiation) : NIL;
		}
		SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject inference_params = (NIL != meta_template) ? kbq_inference_params(meta_template) : NIL;
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 21000L)
	public static SubLObject kbq_sentence_closedP(SubLObject query_spec) {
		return el_utilities.closedP(kbq_sentence(query_spec), UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 21100L)
	public static SubLObject kbq_sentence_openP(SubLObject query_spec) {
		return makeBoolean(NIL == kbq_sentence_closedP(query_spec));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 21200L)
	public static SubLObject kbq_pragmatics(SubLObject query_spec) {
		if (NIL == kb_indexing_datastructures.indexed_term_p(query_spec)) {
			return NIL;
		}
		SubLObject kb_value = czer_main.unquote_quoted_term(kb_mapping_utilities.pred_arg_values_in_any_mt(query_spec, $$softwareParameterValueInSpecifica, $$InferenceNonExplanatorySentencePa, THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).first(), UNPROVIDED);
		return kbq_parse_kb_inference_parameter_value(kb_value, $NON_EXPLANATORY_SENTENCE);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 21600L)
	public static SubLObject kbq_mts(SubLObject query_spec) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list47);
		SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			SubLObject el_substitutions = list_utilities.alist_lookup_without_values(v_bindings, $sym48$EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED);
			SubLObject question_template = list_utilities.alist_lookup_without_values(v_bindings, $sym49$QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED);
			return query_from_template_mts(question_template, el_substitutions);
		}
		return kb_mapping_utilities.pred_values_in_any_mt(query_spec, $$microtheoryParameterValueInSpecif, TWO_INTEGER, ONE_INTEGER, $TRUE);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 22100L)
	public static SubLObject kbq_mt(SubLObject query_spec) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list58);
		SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			SubLObject mt = list_utilities.alist_lookup_without_values(v_bindings, $sym59$MT, UNPROVIDED, UNPROVIDED);
			return mt;
		}
		SubLObject mts = kbq_mts(query_spec);
		SubLObject sentence = kbq_sentence(query_spec);
		if (NIL != el_utilities.ist_sentence_with_chlmt_p(sentence)) {
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 23000L)
	public static SubLObject kbq_canonical_mt(SubLObject query_spec) {
		SubLObject mt = kbq_mt(query_spec);
		if (NIL != mt) {
			return hlmt_czer.canonicalize_hlmt(mt);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 23100L)
	public static SubLObject kbq_comments(SubLObject query_spec) {
		SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt(query_spec, $$comment, ONE_INTEGER, TWO_INTEGER, $TRUE);
		return comments;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 23300L)
	public static SubLObject kbq_template_glosses(SubLObject query_template) {
		SubLObject glosses = kb_mapping_utilities.pred_values_in_any_mt(query_template, $$formulaTemplateGloss, ONE_INTEGER, TWO_INTEGER, $TRUE);
		return glosses;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 23600L)
	public static SubLObject kbq_template(SubLObject query_spec) {
		SubLObject template = kb_mapping_utilities.fpred_value_in_any_mt(query_spec, $$querySpecificationForFormulaTempl, TWO_INTEGER, ONE_INTEGER, $TRUE);
		return template;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 23800L)
	public static SubLObject template_folders(SubLObject template) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			SubLObject pred_var = $$folderContainsResource;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, TWO_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, TWO_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$29 = NIL;
							SubLObject token_var_$30 = NIL;
							while (NIL == done_var_$29) {
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$30);
								SubLObject valid_$31 = makeBoolean(!token_var_$30.eql(assertion));
								if (NIL != valid_$31) {
									SubLObject folder = assertions_high.gaf_arg1(assertion);
									SubLObject mt = assertions_high.assertion_mt(assertion);
									result = cons(list(folder, mt), result);
								}
								done_var_$29 = makeBoolean(NIL == valid_$31);
							}
						} finally {
							SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
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
		return Sequences.nreverse(result);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 24200L)
	public static SubLObject kbq_query_properties(SubLObject query_spec) {
		query_spec = czer_main.canonicalize_term(query_spec, UNPROVIDED);
		SubLObject inf_tuples = kbq_inference_params(query_spec);
		SubLObject query_properties = kb_inference_params_to_query_properties(inf_tuples);
		if (NIL != inference_proof_spec.use_kbq_proof_spec_tableP()) {
			query_properties = list_utilities.merge_plist(query_properties, inference_proof_spec.overriding_experimental_proof_spec_properties(query_spec));
		}
		if (NIL != use_kbq_practice_rulesP()) {
			query_properties = list_utilities.merge_plist(query_properties, overriding_query_practice_rules_properties(query_spec));
		}
		return query_properties;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 25000L)
	public static SubLObject use_kbq_practice_rulesP() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return $use_kbq_practice_rulesP$.getDynamicValue(thread);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 25100L)
	public static SubLObject overriding_query_practice_rules_properties(SubLObject query_spec) {
		SubLObject practice_rules = cb_kb_query.kbq_query_practice_rules(query_spec);
		SubLObject overriding_properties = (NIL != practice_rules) ? list($ALLOWED_RULES, practice_rules) : NIL;
		return overriding_properties;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 25300L)
	public static SubLObject kbq_query_property_value_from_keyword(SubLObject query_spec, SubLObject query_property) {
		assert NIL != inference_datastructures_enumerated_types.query_property_p(query_property) : query_property;
		SubLObject query_properties = kbq_query_properties(query_spec);
		return inference_strategist.query_property_value(query_properties, query_property);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 25600L)
	public static SubLObject kbq_allowed_rules(SubLObject query_spec) {
		return inference_strategist.query_property_value(kbq_query_properties(query_spec), $ALLOWED_RULES);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 25700L)
	public static SubLObject kbq_default_defining_mt() {
		return $$TestVocabularyMt;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 25900L)
	public static SubLObject kbq_defining_mt(SubLObject query_spec) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject candidates = NIL;
		SubLObject result = NIL;
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			SubLObject pred_var = $$sentenceParameterValueInSpecifica;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$33 = NIL;
							SubLObject token_var_$34 = NIL;
							while (NIL == done_var_$33) {
								SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$34);
								SubLObject valid_$35 = makeBoolean(!token_var_$34.eql(gaf));
								if (NIL != valid_$35) {
									SubLObject mt = assertions_high.assertion_mt(gaf);
									SubLObject item_var;
									SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
									if (NIL == conses_high.member(item_var, candidates, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
										candidates = cons(item_var, candidates);
									}
								}
								done_var_$33 = makeBoolean(NIL == valid_$35);
							}
						} finally {
							SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
			pred_var = $$microtheoryParameterValueInSpecif;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$34 = NIL;
							SubLObject token_var_$35 = NIL;
							while (NIL == done_var_$34) {
								SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
								SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(gaf));
								if (NIL != valid_$36) {
									SubLObject mt = assertions_high.assertion_mt(gaf);
									SubLObject item_var;
									SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
									if (NIL == conses_high.member(item_var, candidates, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
										candidates = cons(item_var, candidates);
									}
								}
								done_var_$34 = makeBoolean(NIL == valid_$36);
							}
						} finally {
							SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values2 = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values2);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
			pred_var = $$inferenceModeParameterValueInSpec;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$35 = NIL;
							SubLObject token_var_$36 = NIL;
							while (NIL == done_var_$35) {
								SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
								SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(gaf));
								if (NIL != valid_$37) {
									SubLObject mt = assertions_high.assertion_mt(gaf);
									SubLObject item_var;
									SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
									if (NIL == conses_high.member(item_var, candidates, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
										candidates = cons(item_var, candidates);
									}
								}
								done_var_$35 = makeBoolean(NIL == valid_$37);
							}
						} finally {
							SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values3 = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values3);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
			pred_var = $$softwareParameterValueInSpecifica;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, THREE_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, THREE_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$36 = NIL;
							SubLObject token_var_$37 = NIL;
							while (NIL == done_var_$36) {
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
								SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(assertion));
								if (NIL != valid_$38) {
									SubLObject mt = assertions_high.assertion_mt(assertion);
									SubLObject item_var;
									SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
									if (NIL == conses_high.member(item_var, candidates, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
										candidates = cons(item_var, candidates);
									}
								}
								done_var_$36 = makeBoolean(NIL == valid_$38);
							}
						} finally {
							SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values4 = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values4);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 27200L)
	public static SubLObject multiple_choice_testP(SubLObject v_object) {
		return makeBoolean(NIL != forts.fort_p(v_object) && NIL != isa.isa_in_any_mtP(v_object, $$MultipleChoiceKBContentTest));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 27300L)
	public static SubLObject multiple_choice_queryP(SubLObject v_object) {
		return makeBoolean(NIL != forts.fort_p(v_object) && NIL != isa.isa_in_any_mtP(v_object, $$MultipleChoiceQuerySpecification));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 27500L)
	public static SubLObject kbq_multiple_choice_option_specs(SubLObject query_spec) {
		return kbq_multiple_choice_option_specs_int(query_spec, NIL);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 27600L)
	public static SubLObject kbq_multiple_choice_option_spec(SubLObject query_spec, SubLObject n) {
		return kbq_multiple_choice_option_specs_int(query_spec, n).first();
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 27700L)
	public static SubLObject kbq_multiple_choice_option_specs_int(SubLObject query_spec, SubLObject specified_n) {
		assert NIL != kbq_query_spec_p(query_spec) : query_spec;
		SubLObject mc_option_spec_dict = dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED);
		if (NIL != multiple_choice_queryP(query_spec)) {
			SubLObject pred_var = $$mcQuestionNthOption;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, NIL, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, NIL, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$49 = NIL;
							SubLObject token_var_$50 = NIL;
							while (NIL == done_var_$49) {
								SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
								SubLObject valid_$51 = makeBoolean(!token_var_$50.eql(gaf));
								if (NIL != valid_$51) {
									SubLObject n = assertions_high.gaf_arg2(gaf);
									SubLObject mc_option = assertions_high.gaf_arg3(gaf);
									SubLObject full_label = kb_mapping_utilities.fpred_value(mc_option, $$multipleChoiceOptionFullLabel, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									SubLObject index_label = kb_mapping_utilities.fpred_value(mc_option, $$multipleChoiceOptionIndexLabel, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									SubLObject kb_bindings = kb_mapping_utilities.fpred_value(mc_option, $$multipleChoiceOptionPayload, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									if (NIL == specified_n || n.equal(specified_n)) {
										dictionary.dictionary_enter(mc_option_spec_dict, mc_option, list(n, full_label, index_label, kb_bindings));
									}
								}
								done_var_$49 = makeBoolean(NIL == valid_$51);
							}
						} finally {
							SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
							try {
								Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
								SubLObject _values = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values);
							} finally {
								Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
		}
		return Sort.sort(dictionary.dictionary_values(mc_option_spec_dict), Symbols.symbol_function($sym70$SAFE__), Symbols.symbol_function($sym71$FIRST));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 28600L)
	public static SubLObject kbq_assert_query_spec_inference_parameters(SubLObject query_spec, SubLObject query_properties, SubLObject defining_mt) {
		SubLObject remainder;
		SubLObject query_property;
		SubLObject value;
		for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = conses_high.cddr(remainder)) {
			query_property = remainder.first();
			value = conses_high.cadr(remainder);
			kbq_assert_query_spec_inference_parameter_value(query_spec, query_property, value, defining_mt);
		}
		return query_spec;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 28900L)
	public static SubLObject kb_inference_params_to_query_properties(SubLObject inf_tuples) {
		SubLObject result = NIL;
		SubLObject cdolist_list_var = inf_tuples;
		SubLObject tuple = NIL;
		tuple = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = tuple;
			SubLObject parameter = NIL;
			SubLObject kb_value = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
			parameter = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
			kb_value = current.first();
			current = current.rest();
			if (NIL == current) {
				SubLObject keyword = kbq_keyword_from_inference_parameter(parameter);
				SubLObject value = kbq_parse_kb_inference_parameter_value(kb_value, keyword);
				result = conses_high.putf(result, keyword, value);
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
			}
			cdolist_list_var = cdolist_list_var.rest();
			tuple = cdolist_list_var.first();
		}
		return result;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 29500L)
	public static SubLObject kbq_parse_kb_inference_parameter_value(SubLObject value, SubLObject keyword) {
		if (keyword.eql($MAX_TIME) || keyword.eql($FORWARD_MAX_TIME)) {
			return kbq_convert_time_to_seconds(value);
		}
		if (keyword.eql($NON_EXPLANATORY_SENTENCE)) {
			return czer_main.unquote_quoted_term(parameter_specification_utilities.parse_standard_parameter_value(value), UNPROVIDED);
		}
		if (!keyword.eql($ALLOWED_RULES)) {
			return parameter_specification_utilities.parse_standard_parameter_value(value);
		}
		if (NIL != el_utilities.el_list_p(value)) {
			SubLObject rules = NIL;
			SubLObject cdolist_list_var;
			SubLObject args = cdolist_list_var = cycl_utilities.formula_args(value, $IGNORE);
			SubLObject rule = NIL;
			rule = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != canon_tl.tl_termP(rule)) {
					rule = canon_tl.tl_term_to_hl(rule);
				} else if (NIL != el_utilities.ist_sentence_p(rule, UNPROVIDED)) {
					rule = czer_meta.find_assertion_cycl(rule, UNPROVIDED);
				}
				SubLObject var = rule;
				if (NIL != var) {
					rules = cons(var, rules);
				}
				cdolist_list_var = cdolist_list_var.rest();
				rule = cdolist_list_var.first();
			}
			return Sequences.nreverse(rules);
		}
		return parameter_specification_utilities.parse_standard_parameter_value(value);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 30300L)
	public static SubLObject kbq_encode_kb_inference_parameter_value(SubLObject value, SubLObject keyword) {
		if (keyword.eql($MAX_TIME) || keyword.eql($FORWARD_MAX_TIME)) {
			return value.isInteger() ? kbq_convert_seconds_to_kb_time(value) : $$TheEmptySet;
		}
		if (keyword.eql($RESULT_UNIQUENESS) || keyword.eql($NON_EXPLANATORY_SENTENCE) || keyword.eql($ALLOWED_RULES) || keyword.eql($MAX_NUMBER) || keyword.eql($MAX_PROOF_DEPTH) || keyword.eql($MAX_TRANSFORMATION_DEPTH) || keyword.eql($METRICS)) {
			return (NIL != value) ? value : $$TheEmptySet;
		}
		return parameter_specification_utilities.encode_parameter_value(value);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 30800L)
	public static SubLObject kbq_inference_params(SubLObject query_spec) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list47);
		SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			SubLObject el_substitutions = list_utilities.alist_lookup_without_values(v_bindings, $sym48$EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED);
			SubLObject question_template = list_utilities.alist_lookup_without_values(v_bindings, $sym49$QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED);
			return query_from_template_inference_params(question_template, el_substitutions);
		}
		SubLObject tuples = parameter_specification_utilities.parameter_specification_tuples(query_spec);
		if (NIL != kb_indexing_datastructures.indexed_term_p(query_spec)) {
			SubLObject tuple = inference_mode_parameter_specification_tuple(query_spec);
			SubLObject mode = conses_high.second(tuple);
			if (NIL != mode) {
				tuples = cons(tuple, tuples);
			}
			if (NIL != control_vars.$kbq_run_query_practice_modeP$.getDynamicValue(thread)) {
				SubLObject practice_rules = kb_mapping_utilities.pred_values_in_any_mt(query_spec, $$queryPracticeRules, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				if (NIL != practice_rules) {
					tuples = Sequences.delete($$InferenceAllowedRulesParameter, tuples, Symbols.symbol_function(EQL), Symbols.symbol_function($sym71$FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
					tuples = cons(list($$InferenceAllowedRulesParameter, el_utilities.make_el_list(practice_rules, UNPROVIDED)), tuples);
				}
			}
		}
		tuples = Sequences.delete($$InferenceSentenceParameter, tuples, Symbols.symbol_function(EQL), Symbols.symbol_function($sym71$FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		tuples = Sequences.delete($$InferenceMicrotheoryParameter, tuples, Symbols.symbol_function(EQL), Symbols.symbol_function($sym71$FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return tuples;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 32100L)
	public static SubLObject inference_mode_parameter_specification_tuple(SubLObject query_spec) {
		assert NIL != forts.fort_p(query_spec) : query_spec;
		SubLObject value = kb_mapping_utilities.fpred_value_in_any_mt(query_spec, $$inferenceModeParameterValueInSpec, TWO_INTEGER, ONE_INTEGER, $TRUE);
		return make_inference_mode_parameter_tuple(value);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 32400L)
	public static SubLObject make_inference_mode_parameter_tuple(SubLObject value) {
		return list($$InferenceModeParameter, value);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 32500L)
	public static SubLObject kbq_cyclist(SubLObject query) {
		if (isConstSym(query)) {
			SubLObject cyclist = bookkeeping_store.creator(query, UNPROVIDED);
			if (NIL != cyclist) {
				return cyclist;
			}
		}
		if (NIL != nart_handles.nart_p(query) && $$TestQueryFn.eql(cycl_utilities.nat_functor(query))) {
			return kbq_cyclist(cycl_utilities.nat_arg1(query, UNPROVIDED));
		}
		if (NIL != kb_indexing_datastructures.indexed_term_p(query)) {
			return kb_accessors.cyclist_with_most_assertions_about(query);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 32900L)
	public static SubLObject kbq_runnableP(SubLObject query_spec) {
		return makeBoolean(NIL == kbq_known_unrunnableP(query_spec) && $SEVERE != why_not_kbq_valid(query_spec, UNPROVIDED));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 33100L)
	public static SubLObject kbq_known_unrunnableP(SubLObject query_spec) {
		return makeBoolean(NIL != forts.fort_p(query_spec) && NIL != isa.isa_in_any_mtP(query_spec, $$UnrunnableQuery));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 33300L)
	public static SubLObject why_not_kbq_valid(SubLObject query_spec, SubLObject test_spec) {
		if (test_spec == UNPROVIDED) {
			test_spec = NIL;
		}
		if (NIL == test_spec) {
			test_spec = query_spec;
		}
		if (NIL != janus.janus_operation_p(query_spec)) {
			return Values.values(NIL, NIL, NIL);
		}
		if (NIL == el_utilities.el_formula_with_operator_p(query_spec, $$QueryFn)) {
			SubLObject result = NIL;
			SubLObject message = $str92$;
			SubLObject problem_keywords = NIL;
			SubLObject mts = kbq_mts(query_spec);
			SubLObject sentences = kbq_sentences(query_spec);
			SubLObject some_ist_sentenceP = Sequences.find_if($sym93$IST_SENTENCE_WITH_CHLMT_P, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL == list_utilities.singletonP(sentences)) {
				result = $SEVERE;
				if (Sequences.length(sentences).numE(ZERO_INTEGER)) {
					message = Sequences.cconcatenate(message, PrintLow.format(NIL, $str88$___A_has_no_query_sentence_, test_spec));
					problem_keywords = cons($NO_QUERY_SENTENCE, problem_keywords);
				} else {
					message = Sequences.cconcatenate(message, PrintLow.format(NIL, $str94$___A_has_more_than_one_query_sent, test_spec));
					problem_keywords = cons($MORE_THAN_ONE_QUERY_SENTENCE, problem_keywords);
				}
			}
			if (NIL == list_utilities.singletonP(mts)) {
				if (Sequences.length(mts).numE(ZERO_INTEGER)) {
					if (NIL == some_ist_sentenceP) {
						result = $SEVERE;
						message = Sequences.cconcatenate(message, PrintLow.format(NIL, $str96$___A_has_no_query_Mt_, test_spec));
						problem_keywords = cons($NO_QUERY_MT, problem_keywords);
					}
				} else {
					result = $SEVERE;
					message = Sequences.cconcatenate(message, PrintLow.format(NIL, $str98$___A_has_more_than_one_query_Mt_, test_spec));
					problem_keywords = cons($MORE_THAN_ONE_QUERY_MT, problem_keywords);
				}
			}
			return Values.values(result, message, Sequences.nreverse(problem_keywords));
		}
		SubLObject current;
		SubLObject datum = current = cycl_utilities.nat_args(query_spec, UNPROVIDED);
		SubLObject sentence = current.isCons() ? current.first() : NIL;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list87);
		current = current.rest();
		SubLObject parameters = current.isCons() ? current.first() : NIL;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list87);
		SubLObject rest;
		current = (rest = current.rest());
		if (NIL == sentence) {
			return Values.values($SEVERE, PrintLow.format(NIL, $str88$___A_has_no_query_sentence_, test_spec), list($NO_QUERY_SENTENCE));
		}
		if (NIL != rest) {
			return Values.values($SEVERE, PrintLow.format(NIL, $str90$___A_has_too_many_arguments_, test_spec), list($TOO_MANY_ARGUMENTS));
		}
		return Values.values(NIL, NIL, NIL);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 35900L)
	public static SubLObject kbq_removal_only_queryP(SubLObject query) {
		return makeBoolean(ZERO_INTEGER.eql(kbq_query_property_value_from_keyword(query, $MAX_TRANSFORMATION_DEPTH)) || NIL == kbq_query_property_value_from_keyword(query, $TRANSFORMATION_ALLOWED_));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 36200L)
	public static SubLObject kbq_transformation_queryP(SubLObject query) {
		return makeBoolean(NIL != kbq_query_property_value_from_keyword(query, $TRANSFORMATION_ALLOWED_) && NIL == kbq_removal_only_queryP(query));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 36500L)
	public static SubLObject kbq_trivial_queryP(SubLObject query) {
		return makeBoolean(NIL != kbq_removal_only_queryP(query) && NIL != kbq_query_run.kbq_single_literal_query_p(query) && $BINDINGS.eql(kbq_query_property_value_from_keyword(query, $RESULT_UNIQUENESS)) && NIL == kbq_query_property_value_from_keyword(query, $MAX_NUMBER) && NIL == kbq_query_property_value_from_keyword(query, $MAX_TIME) && NIL == kbq_query_property_value_from_keyword(query, $MAX_PROOF_DEPTH));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 37100L)
	public static SubLObject kbq_simple_queryP(SubLObject query) {
		return makeBoolean(NIL != kbq_removal_only_queryP(query) && NIL == kbq_trivial_queryP(query));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 37300L)
	public static SubLObject kbq_shallow_queryP(SubLObject query) {
		return makeBoolean(NIL != kbq_transformation_queryP(query) && ONE_INTEGER.eql(kbq_query_property_value_from_keyword(query, $MAX_TRANSFORMATION_DEPTH)));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 37600L)
	public static SubLObject kbq_deep_queryP(SubLObject query) {
		return makeBoolean(NIL != kbq_transformation_queryP(query) && NIL == kbq_shallow_queryP(query));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 37900L)
	public static SubLObject kbq_conditional_queryP(SubLObject query) {
		SubLObject query_properties = kbq_query_properties(query);
		return list_utilities.sublisp_boolean(inference_strategist.query_property_value(query_properties, $CONDITIONAL_SENTENCE_));
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 38000L)
	public static SubLObject new_continuable_inference_from_kbq(SubLObject query_spec, SubLObject overriding_query_properties, SubLObject substitutions) {
		if (overriding_query_properties == UNPROVIDED) {
			overriding_query_properties = NIL;
		}
		if (substitutions == UNPROVIDED) {
			substitutions = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject plist_var = overriding_query_properties;
		assert NIL != list_utilities.property_list_p(plist_var) : plist_var;
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
			property = remainder.first();
			value = conses_high.cadr(remainder);
			assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
		}
		thread.resetMultipleValues();
		SubLObject sentence = kbq_query_arguments(query_spec, substitutions);
		SubLObject mt = thread.secondMultipleValue();
		SubLObject query_properties = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
		SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(query_properties);
		return inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 38900L)
	public static SubLObject new_removal_ask_from_kbq(SubLObject query_spec, SubLObject metrics_template, SubLObject overriding_query_properties) {
		if (overriding_query_properties == UNPROVIDED) {
			overriding_query_properties = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject plist_var = overriding_query_properties;
		assert NIL != list_utilities.property_list_p(plist_var) : plist_var;
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
			property = remainder.first();
			value = conses_high.cadr(remainder);
			assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
		}
		SubLObject result = NIL;
		SubLObject metrics = NIL;
		thread.resetMultipleValues();
		SubLObject sentence = kbq_query_arguments(query_spec, UNPROVIDED);
		SubLObject mt = thread.secondMultipleValue();
		SubLObject query_properties = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
		query_properties = list_utilities.filter_plist(query_properties, Symbols.symbol_function($sym104$REMOVAL_ASK_QUERY_PROPERTY_P));
		SubLObject complete_total_time = NIL;
		SubLObject total_time = NIL;
		SubLObject sentence_clauses = NIL;
		SubLObject v_bindings = NIL;
		SubLObject free_vars = NIL;
		SubLObject time_var = Time.get_internal_real_time();
		thread.resetMultipleValues();
		SubLObject sentence_clauses_$52 = inference_czer.inference_canonicalize_ask_int(sentence, mt, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
		SubLObject v_bindings_$53 = thread.secondMultipleValue();
		SubLObject free_vars_$54 = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		sentence_clauses = sentence_clauses_$52;
		v_bindings = v_bindings_$53;
		free_vars = free_vars_$54;
		SubLObject current;
		SubLObject datum = current = clauses.pos_lits(sentence_clauses.first()).first();
		SubLObject hl_mt = NIL;
		SubLObject hl_sentence = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list105);
		hl_mt = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list105);
		hl_sentence = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject time_var_$55 = Time.get_internal_real_time();
			result = backward.removal_ask(hl_sentence, hl_mt, $TRUE, query_properties);
			total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var_$55), time_high.$internal_time_units_per_second$.getGlobalValue());
		} else {
			cdestructuring_bind.cdestructuring_bind_error(datum, $list105);
		}
		complete_total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
		metrics = removal_ask_compute_metrics(metrics_template, result, complete_total_time, total_time);
		return Values.values(result, metrics);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 40100L)
	public static SubLObject removal_ask_compute_metrics(SubLObject template, SubLObject result, SubLObject complete_total_time, SubLObject total_time) {
		SubLObject v_answer = conses_high.copy_tree(template);
		SubLObject cdolist_list_var;
		SubLObject metrics = cdolist_list_var = list_utilities.tree_gather(template, Symbols.symbol_function($sym106$REMOVAL_ASK_QUERY_METRIC_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject metric = NIL;
		metric = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject pcase_var = metric;
			if (pcase_var.eql($ANSWER_COUNT)) {
				SubLObject answer_count = Sequences.length(result);
				v_answer = conses_high.nsubst(answer_count, $ANSWER_COUNT, v_answer, Symbols.symbol_function(EQ), UNPROVIDED);
			} else if (pcase_var.eql($TIME_TO_FIRST_ANSWER)) {
				SubLObject first_answer_time = (NIL != result) ? total_time : NIL;
				v_answer = conses_high.nsubst(first_answer_time, $TIME_TO_FIRST_ANSWER, v_answer, Symbols.symbol_function(EQ), UNPROVIDED);
			} else if (pcase_var.eql($TIME_TO_LAST_ANSWER)) {
				SubLObject last_answer_time = (NIL != result) ? total_time : NIL;
				v_answer = conses_high.nsubst(last_answer_time, $TIME_TO_LAST_ANSWER, v_answer, Symbols.symbol_function(EQ), UNPROVIDED);
			} else if (pcase_var.eql($TOTAL_TIME)) {
				v_answer = conses_high.nsubst(total_time, $TOTAL_TIME, v_answer, Symbols.symbol_function(EQ), UNPROVIDED);
			} else if (pcase_var.eql($COMPLETE_TOTAL_TIME)) {
				v_answer = conses_high.nsubst(complete_total_time, $COMPLETE_TOTAL_TIME, v_answer, Symbols.symbol_function(EQ), UNPROVIDED);
			} else if (pcase_var.eql($TIME_PER_ANSWER)) {
				SubLObject answer_count = Sequences.length(result);
				SubLObject time_per_answer = NIL;
				if (total_time.isNumber() && NIL != subl_promotions.positive_integer_p(answer_count)) {
					time_per_answer = Numbers.divide(total_time, answer_count);
				}
				v_answer = conses_high.nsubst(time_per_answer, $TIME_PER_ANSWER, v_answer, Symbols.symbol_function(EQ), UNPROVIDED);
			} else if (pcase_var.eql($LATENCY_IMPROVEMENT_FROM_ITERATIVITY)) {
				SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference(total_time, total_time);
				v_answer = conses_high.nsubst(latency_improvement_from_iterativity, $LATENCY_IMPROVEMENT_FROM_ITERATIVITY, v_answer, Symbols.symbol_function(EQ), UNPROVIDED);
			} else {
				Errors.sublisp_break($str114$time_to_implement_metric__S, new SubLObject[] { metric });
			}
			cdolist_list_var = cdolist_list_var.rest();
			metric = cdolist_list_var.first();
		}
		return v_answer;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 41700L)
	public static SubLObject continue_inference_from_kbq(SubLObject inference, SubLObject query_spec, SubLObject overriding_query_properties) {
		if (overriding_query_properties == UNPROVIDED) {
			overriding_query_properties = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject plist_var = overriding_query_properties;
		assert NIL != list_utilities.property_list_p(plist_var) : plist_var;
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
			property = remainder.first();
			value = conses_high.cadr(remainder);
			assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
		}
		thread.resetMultipleValues();
		SubLObject sentence = kbq_query_arguments(query_spec, UNPROVIDED);
		SubLObject mt = thread.secondMultipleValue();
		SubLObject query_properties = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
		SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
		return inference_kernel.continue_inference(inference, query_dynamic_properties);
	}

	public static SubLObject new_cyc_query_from_kbq(SubLObject query_spec, SubLObject overriding_query_properties) {
		return new_cyc_query_from_kbq(query_spec, overriding_query_properties, NIL);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 42400L)
	public static SubLObject new_cyc_query_from_kbq(SubLObject query_spec, SubLObject overriding_query_properties, SubLObject substitutions) {
		if (overriding_query_properties == UNPROVIDED) {
			overriding_query_properties = NIL;
		}
		if (substitutions == UNPROVIDED) {
			substitutions = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject plist_var = overriding_query_properties;
		assert NIL != list_utilities.property_list_p(plist_var) : plist_var;
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
			property = remainder.first();
			value = conses_high.cadr(remainder);
			assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
		}
		SubLObject result = NIL;
		SubLObject halt_reason = NIL;
		SubLObject inference = NIL;
		SubLObject metric_values = NIL;
		SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding(thread);
		try {
			control_vars.$save_asked_queriesP$.bind(NIL, thread);
			if (NIL != janus.janus_modification_operation_p(query_spec)) {
				thread.resetMultipleValues();
				SubLObject result_$56 = janus.execute_janus_modification_operation(query_spec);
				SubLObject halt_reason_$57 = thread.secondMultipleValue();
				SubLObject inference_$58 = thread.thirdMultipleValue();
				SubLObject metric_values_$59 = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				result = result_$56;
				halt_reason = halt_reason_$57;
				inference = inference_$58;
				metric_values = metric_values_$59;
			} else {
				thread.resetMultipleValues();
				SubLObject sentence = kbq_query_arguments(query_spec, substitutions);
				SubLObject mt = thread.secondMultipleValue();
				SubLObject query_properties = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
				thread.resetMultipleValues();
				SubLObject result_$57 = inference_kernel.new_cyc_query(sentence, mt, query_properties);
				SubLObject halt_reason_$58 = thread.secondMultipleValue();
				SubLObject inference_$59 = thread.thirdMultipleValue();
				SubLObject metric_values_$60 = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				result = result_$57;
				halt_reason = halt_reason_$58;
				inference = inference_$59;
				metric_values = metric_values_$60;
			}
		} finally {
			control_vars.$save_asked_queriesP$.rebind(_prev_bind_0, thread);
		}
		return Values.values(result, halt_reason, inference, metric_values);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 43500L)
	public static SubLObject ask_multiple_choice_query_from_kbq(SubLObject query_spec, SubLObject overriding_query_properties) {
		if (overriding_query_properties == UNPROVIDED) {
			overriding_query_properties = NIL;
		}
		return new_cyc_query_from_kbq(query_spec, UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 44500L)
	public static SubLObject cache_kbq_extent(SubLObject query_spec) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject sentence = kbq_query_arguments(query_spec, UNPROVIDED);
		SubLObject mt = thread.secondMultipleValue();
		SubLObject query_properties = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (NIL == mt) {
			mt = mt_relevance_macros.inference_relevant_mt();
		}
		query_properties = conses_high.putf(query_properties, $CACHE_INFERENCE_RESULTS_, T);
		return inference_kernel.new_cyc_query(sentence, mt, query_properties);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 44900L)
	public static SubLObject kbq_query_arguments(SubLObject query_spec, SubLObject substitutions) {
		if (substitutions == UNPROVIDED) {
			substitutions = NIL;
		}
		if (NIL != el_utilities.el_formula_with_operator_p(query_spec, $$QueryFn)) {
			return query_fn_term_to_new_cyc_query_arguments(query_spec);
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(query_spec, $list116)) {
			return predicate_query_fn_term_to_new_cyc_query_arguments(query_spec);
		}
		if (NIL == janus.janus_query_operation_p(query_spec)) {
			SubLObject sentence = kbq_sentence(query_spec);
			SubLObject mt = kbq_mt(query_spec);
			SubLObject query_properties = kbq_query_properties(query_spec);
			return kbq_possibly_apply_substitutions(substitutions, sentence, mt, query_properties);
		}
		SubLObject current;
		SubLObject datum = current = encapsulation.unencapsulate(query_spec);
		SubLObject janus_op = NIL;
		SubLObject type = NIL;
		SubLObject sentence2 = NIL;
		SubLObject mt2 = NIL;
		SubLObject query_properties2 = NIL;
		SubLObject expected_result = NIL;
		SubLObject expected_halt_reason = NIL;
		SubLObject tag = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		janus_op = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		type = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		sentence2 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		mt2 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		query_properties2 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		expected_result = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		expected_halt_reason = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
		tag = current.first();
		current = current.rest();
		if (NIL == current) {
			query_properties2 = janus.dwim_janus_query_properties(query_properties2);
			return Values.values(sentence2, mt2, query_properties2);
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list117);
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 46300L)
	public static SubLObject kbq_possibly_apply_substitutions(SubLObject substitutions, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
		if (NIL != substitutions) {
			sentence = cycl_utilities.expression_sublis(substitutions, sentence, Symbols.symbol_function(EQUAL), UNPROVIDED);
			mt = cycl_utilities.expression_sublis(substitutions, mt, Symbols.symbol_function(EQUAL), UNPROVIDED);
			query_properties = conses_high.sublis(substitutions, query_properties, Symbols.symbol_function(EQUAL), UNPROVIDED);
		}
		return Values.values(sentence, mt, query_properties);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 46700L)
	public static SubLObject query_fn_term_to_new_cyc_query_arguments(SubLObject query_fn_term) {
		SubLObject current;
		SubLObject datum = current = cycl_utilities.nat_args(query_fn_term, UNPROVIDED);
		SubLObject quoted_sentence = current.isCons() ? current.first() : NIL;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list118);
		current = current.rest();
		SubLObject cycl_parameters = current.isCons() ? current.first() : $$TheEmptySet;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list118);
		current = current.rest();
		if (NIL == current) {
			SubLObject sentence = czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
			SubLObject tuples = Mapping.mapcar(Symbols.symbol_function($sym119$EL_LIST_ITEMS), el_utilities.extensional_set_elements(cycl_parameters));
			SubLObject mt = conses_high.second(conses_high.assoc($$InferenceMicrotheoryParameter, tuples, UNPROVIDED, UNPROVIDED));
			tuples = list_utilities.alist_delete(tuples, $$InferenceSentenceParameter, UNPROVIDED);
			tuples = list_utilities.alist_delete(tuples, $$InferenceMicrotheoryParameter, UNPROVIDED);
			SubLObject query_properties = kb_inference_params_to_query_properties(tuples);
			return Values.values(sentence, mt, query_properties);
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list118);
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 47800L)
	public static SubLObject predicate_query_fn_term_to_new_cyc_query_arguments(SubLObject predicate_query_fn_term) {
		SubLObject current;
		SubLObject datum = current = cycl_utilities.nat_args(predicate_query_fn_term, UNPROVIDED);
		SubLObject kappa_predicate = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list120);
		kappa_predicate = current.first();
		current = current.rest();
		SubLObject cycl_parameters = current.isCons() ? current.first() : $$TheEmptySet;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list120);
		current = current.rest();
		if (NIL == current) {
			SubLObject query_free_variables = cycl_utilities.nat_arg1(kappa_predicate, UNPROVIDED);
			SubLObject sentence = cycl_utilities.nat_arg2(kappa_predicate, UNPROVIDED);
			SubLObject tuples = Mapping.mapcar(Symbols.symbol_function($sym119$EL_LIST_ITEMS), el_utilities.extensional_set_elements(cycl_parameters));
			SubLObject mt = conses_high.second(conses_high.assoc($$InferenceMicrotheoryParameter, tuples, UNPROVIDED, UNPROVIDED));
			tuples = list_utilities.alist_delete(tuples, $$InferenceSentenceParameter, UNPROVIDED);
			tuples = list_utilities.alist_delete(tuples, $$InferenceMicrotheoryParameter, UNPROVIDED);
			SubLObject query_properties = kb_inference_params_to_query_properties(tuples);
			return Values.values(sentence, mt, query_properties);
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list120);
		return NIL;
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 49200L)
	public static SubLObject kbq_inference_parameter_from_keyword(SubLObject keyword) {
		assert NIL != Types.keywordp(keyword) : keyword;
		return parameter_specification_utilities.parameter_from_keyword(keyword, $$InferenceParameter);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 49500L)
	public static SubLObject kbq_keyword_from_inference_parameter(SubLObject parameter) {
		assert NIL != forts.fort_p(parameter) : parameter;
		return parameter_specification_utilities.keyword_from_parameter(parameter);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 49700L)
	public static SubLObject kbq_hl_support_module_from_keyword(SubLObject keyword) {
		assert NIL != Types.keywordp(keyword) : keyword;
		return subl_identifier.cyc_entity_from_sublid(keyword, $$CycHLSupportModule);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 49900L)
	public static SubLObject kbq_keyword_from_hl_support_module(SubLObject module) {
		assert isConstSym(module) : module;
		return subl_identifier.sublid_from_cyc_entity(module);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 50000L)
	public static SubLObject kbq_kb_tv_from_hl_tv(SubLObject identifier) {
		assert NIL != Types.keywordp(identifier) : identifier;
		return subl_identifier.cyc_entity_from_sublid(identifier, $$CycHLTruthValue);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 50200L)
	public static SubLObject kbq_hl_tv_from_kb_tv(SubLObject fort) {
		assert NIL != forts.fort_p(fort) : fort;
		return subl_identifier.sublid_from_cyc_entity(fort);
	}

	@SubL(source = "cycl/inference/kb-query.lisp", position = 50400L)
	public static SubLObject kbq_convert_time_to_seconds(SubLObject value) {
		if (value.isInteger()) {
			return value;
		}
		if (NIL == el_utilities.possibly_naut_p(value)) {
			return NIL;
		}
		SubLObject unit = cycl_utilities.nat_arg0(value);
		SubLObject quantity = cycl_utilities.nat_arg1(value, UNPROVIDED);
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

	@SubL(source = "cycl/inference/kb-query.lisp", position = 51000L)
	public static SubLObject kbq_convert_seconds_to_kb_time(SubLObject integer) {
		assert NIL != Types.integerp(integer) : integer;
		return el_utilities.make_formula($$SecondsDuration, list(integer), UNPROVIDED);
	}

	public static SubLObject declare_kb_query_file() {
		declareFunction("kbq_query_spec_p", "KBQ-QUERY-SPEC-P", 1, 0, false);
		declareFunction("kbq_assert_query_spec_definition", "KBQ-ASSERT-QUERY-SPEC-DEFINITION", 7, 0, false);
		declareFunction("kbq_assert", "KBQ-ASSERT", 2, 1, false);
		declareFunction("update_kbq_definition", "UPDATE-KBQ-DEFINITION", 3, 4, false);
		declareFunction("update_kbq_definition_silent", "UPDATE-KBQ-DEFINITION-SILENT", 3, 4, false);
		declareFunction("kbq_ensure_query_spec_definition", "KBQ-ENSURE-QUERY-SPEC-DEFINITION", 7, 0, false);
		declareFunction("kbq_current_query_spec_assertions_for_parameter", "KBQ-CURRENT-QUERY-SPEC-ASSERTIONS-FOR-PARAMETER", 2, 0, false);
		declareFunction("kbq_ensure_query_spec_sentence", "KBQ-ENSURE-QUERY-SPEC-SENTENCE", 3, 0, false);
		declareFunction("kbq_assert_query_spec_sentence", "KBQ-ASSERT-QUERY-SPEC-SENTENCE", 3, 0, false);
		declareFunction("kbq_assertible_query_spec_sentence", "KBQ-ASSERTIBLE-QUERY-SPEC-SENTENCE", 2, 0, false);
		declareFunction("kbq_askable_query_spec_sentence", "KBQ-ASKABLE-QUERY-SPEC-SENTENCE", 2, 1, false);
		declareFunction("kbq_ensure_query_spec_mt", "KBQ-ENSURE-QUERY-SPEC-MT", 3, 0, false);
		declareFunction("kbq_assert_query_spec_mt", "KBQ-ASSERT-QUERY-SPEC-MT", 3, 0, false);
		declareFunction("kbq_ensure_query_spec_inference_parameter_value", "KBQ-ENSURE-QUERY-SPEC-INFERENCE-PARAMETER-VALUE", 4, 0, false);
		declareFunction("kbq_assert_query_spec_inference_parameter_value", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETER-VALUE", 4, 0, false);
		declareFunction("kbq_assert_query_spec_inference_parameter_value_int", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETER-VALUE-INT", 4, 0, false);
		declareFunction("kbq_ensure_query_spec_pragmatics", "KBQ-ENSURE-QUERY-SPEC-PRAGMATICS", 3, 0, false);
		declareFunction("kbq_assert_query_spec_pragmatics", "KBQ-ASSERT-QUERY-SPEC-PRAGMATICS", 3, 0, false);
		declareFunction("kbq_ensure_multiple_choice_option_spec", "KBQ-ENSURE-MULTIPLE-CHOICE-OPTION-SPEC", 3, 0, false);
		declareFunction("kbq_assert_multiple_choice_option_spec", "KBQ-ASSERT-MULTIPLE-CHOICE-OPTION-SPEC", 3, 0, false);
		declareFunction("kbq_ensure_query_spec_comments", "KBQ-ENSURE-QUERY-SPEC-COMMENTS", 3, 0, false);
		declareFunction("kbq_assert_query_spec_comment", "KBQ-ASSERT-QUERY-SPEC-COMMENT", 3, 0, false);
		declareFunction("kbq_assert_template_definition", "KBQ-ASSERT-TEMPLATE-DEFINITION", 5, 0, false);
		declareFunction("kbq_ensure_template_definition", "KBQ-ENSURE-TEMPLATE-DEFINITION", 5, 0, false);
		declareFunction("kbq_ensure_template_glosses", "KBQ-ENSURE-TEMPLATE-GLOSSES", 3, 0, false);
		declareFunction("kbq_assert_template_gloss", "KBQ-ASSERT-TEMPLATE-GLOSS", 3, 0, false);
		declareFunction("kbq_ensure_template_folders", "KBQ-ENSURE-TEMPLATE-FOLDERS", 2, 0, false);
		declareFunction("kbq_assert_template_folder", "KBQ-ASSERT-TEMPLATE-FOLDER", 3, 0, false);
		declareFunction("kbq_sentences", "KBQ-SENTENCES", 1, 0, false);
		declareFunction("kbq_sentence", "KBQ-SENTENCE", 1, 0, false);
		declareFunction("query_from_template_sentences", "QUERY-FROM-TEMPLATE-SENTENCES", 2, 0, false);
		declareFunction("perform_query_from_template_substitutions", "PERFORM-QUERY-FROM-TEMPLATE-SUBSTITUTIONS", 2, 0, false);
		declareFunction("query_from_template_mts", "QUERY-FROM-TEMPLATE-MTS", 2, 0, false);
		declareFunction("query_from_template_inference_params", "QUERY-FROM-TEMPLATE-INFERENCE-PARAMS", 2, 0, false);
		declareFunction("kbq_sentence_closedP", "KBQ-SENTENCE-CLOSED?", 1, 0, false);
		declareFunction("kbq_sentence_openP", "KBQ-SENTENCE-OPEN?", 1, 0, false);
		declareFunction("kbq_pragmatics", "KBQ-PRAGMATICS", 1, 0, false);
		declareFunction("kbq_mts", "KBQ-MTS", 1, 0, false);
		declareFunction("kbq_mt", "KBQ-MT", 1, 0, false);
		declareFunction("kbq_canonical_mt", "KBQ-CANONICAL-MT", 1, 0, false);
		declareFunction("kbq_comments", "KBQ-COMMENTS", 1, 0, false);
		declareFunction("kbq_template_glosses", "KBQ-TEMPLATE-GLOSSES", 1, 0, false);
		declareFunction("kbq_template", "KBQ-TEMPLATE", 1, 0, false);
		declareFunction("template_folders", "TEMPLATE-FOLDERS", 1, 0, false);
		declareFunction("kbq_query_properties", "KBQ-QUERY-PROPERTIES", 1, 0, false);
		declareFunction("use_kbq_practice_rulesP", "USE-KBQ-PRACTICE-RULES?", 0, 0, false);
		declareFunction("overriding_query_practice_rules_properties", "OVERRIDING-QUERY-PRACTICE-RULES-PROPERTIES", 1, 0, false);
		declareFunction("kbq_query_property_value_from_keyword", "KBQ-QUERY-PROPERTY-VALUE-FROM-KEYWORD", 2, 0, false);
		declareFunction("kbq_allowed_rules", "KBQ-ALLOWED-RULES", 1, 0, false);
		declareFunction("kbq_default_defining_mt", "KBQ-DEFAULT-DEFINING-MT", 0, 0, false);
		declareFunction("kbq_defining_mt", "KBQ-DEFINING-MT", 1, 0, false);
		declareFunction("multiple_choice_testP", "MULTIPLE-CHOICE-TEST?", 1, 0, false);
		declareFunction("multiple_choice_queryP", "MULTIPLE-CHOICE-QUERY?", 1, 0, false);
		declareFunction("kbq_multiple_choice_option_specs", "KBQ-MULTIPLE-CHOICE-OPTION-SPECS", 1, 0, false);
		declareFunction("kbq_multiple_choice_option_spec", "KBQ-MULTIPLE-CHOICE-OPTION-SPEC", 2, 0, false);
		declareFunction("kbq_multiple_choice_option_specs_int", "KBQ-MULTIPLE-CHOICE-OPTION-SPECS-INT", 2, 0, false);
		declareFunction("kbq_assert_query_spec_inference_parameters", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETERS", 3, 0, false);
		declareFunction("kb_inference_params_to_query_properties", "KB-INFERENCE-PARAMS-TO-QUERY-PROPERTIES", 1, 0, false);
		declareFunction("kbq_parse_kb_inference_parameter_value", "KBQ-PARSE-KB-INFERENCE-PARAMETER-VALUE", 2, 0, false);
		declareFunction("kbq_encode_kb_inference_parameter_value", "KBQ-ENCODE-KB-INFERENCE-PARAMETER-VALUE", 2, 0, false);
		declareFunction("kbq_inference_params", "KBQ-INFERENCE-PARAMS", 1, 0, false);
		declareFunction("inference_mode_parameter_specification_tuple", "INFERENCE-MODE-PARAMETER-SPECIFICATION-TUPLE", 1, 0, false);
		declareFunction("make_inference_mode_parameter_tuple", "MAKE-INFERENCE-MODE-PARAMETER-TUPLE", 1, 0, false);
		declareFunction("kbq_cyclist", "KBQ-CYCLIST", 1, 0, false);
		declareFunction("kbq_runnableP", "KBQ-RUNNABLE?", 1, 0, false);
		declareFunction("kbq_known_unrunnableP", "KBQ-KNOWN-UNRUNNABLE?", 1, 0, false);
		declareFunction("why_not_kbq_valid", "WHY-NOT-KBQ-VALID", 1, 1, false);
		declareFunction("kbq_removal_only_queryP", "KBQ-REMOVAL-ONLY-QUERY?", 1, 0, false);
		declareFunction("kbq_transformation_queryP", "KBQ-TRANSFORMATION-QUERY?", 1, 0, false);
		declareFunction("kbq_trivial_queryP", "KBQ-TRIVIAL-QUERY?", 1, 0, false);
		declareFunction("kbq_simple_queryP", "KBQ-SIMPLE-QUERY?", 1, 0, false);
		declareFunction("kbq_shallow_queryP", "KBQ-SHALLOW-QUERY?", 1, 0, false);
		declareFunction("kbq_deep_queryP", "KBQ-DEEP-QUERY?", 1, 0, false);
		declareFunction("kbq_conditional_queryP", "KBQ-CONDITIONAL-QUERY?", 1, 0, false);
		declareFunction("new_continuable_inference_from_kbq", "NEW-CONTINUABLE-INFERENCE-FROM-KBQ", 1, 2, false);
		declareFunction("new_removal_ask_from_kbq", "NEW-REMOVAL-ASK-FROM-KBQ", 2, 1, false);
		declareFunction("removal_ask_compute_metrics", "REMOVAL-ASK-COMPUTE-METRICS", 4, 0, false);
		declareFunction("continue_inference_from_kbq", "CONTINUE-INFERENCE-FROM-KBQ", 2, 1, false);
		declareFunction("new_cyc_query_from_kbq", "NEW-CYC-QUERY-FROM-KBQ", 1, 2, false);
		declareFunction("ask_multiple_choice_query_from_kbq", "ASK-MULTIPLE-CHOICE-QUERY-FROM-KBQ", 1, 1, false);
		declareFunction("cache_kbq_extent", "CACHE-KBQ-EXTENT", 1, 0, false);
		declareFunction("kbq_query_arguments", "KBQ-QUERY-ARGUMENTS", 1, 1, false);
		declareFunction("kbq_possibly_apply_substitutions", "KBQ-POSSIBLY-APPLY-SUBSTITUTIONS", 4, 0, false);
		declareFunction("query_fn_term_to_new_cyc_query_arguments", "QUERY-FN-TERM-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false);
		declareFunction("predicate_query_fn_term_to_new_cyc_query_arguments", "PREDICATE-QUERY-FN-TERM-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false);
		declareFunction("kbq_inference_parameter_from_keyword", "KBQ-INFERENCE-PARAMETER-FROM-KEYWORD", 1, 0, false);
		declareFunction("kbq_keyword_from_inference_parameter", "KBQ-KEYWORD-FROM-INFERENCE-PARAMETER", 1, 0, false);
		declareFunction("kbq_hl_support_module_from_keyword", "KBQ-HL-SUPPORT-MODULE-FROM-KEYWORD", 1, 0, false);
		declareFunction("kbq_keyword_from_hl_support_module", "KBQ-KEYWORD-FROM-HL-SUPPORT-MODULE", 1, 0, false);
		declareFunction("kbq_kb_tv_from_hl_tv", "KBQ-KB-TV-FROM-HL-TV", 1, 0, false);
		declareFunction("kbq_hl_tv_from_kb_tv", "KBQ-HL-TV-FROM-KB-TV", 1, 0, false);
		declareFunction("kbq_convert_time_to_seconds", "KBQ-CONVERT-TIME-TO-SECONDS", 1, 0, false);
		declareFunction("kbq_convert_seconds_to_kb_time", "KBQ-CONVERT-SECONDS-TO-KB-TIME", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_kb_query_file() {
		$transcript_kbq_definition_assertionsP$ = defparameter("*TRANSCRIPT-KBQ-DEFINITION-ASSERTIONS?*", T);
		$use_kbq_practice_rulesP$ = defparameter("*USE-KBQ-PRACTICE-RULES?*", NIL);
		return NIL;
	}

	public static SubLObject setup_kb_query_file() {
		access_macros.register_external_symbol($sym7$UPDATE_KBQ_DEFINITION);
		access_macros.register_external_symbol($sym9$UPDATE_KBQ_DEFINITION_SILENT);
		access_macros.register_external_symbol($sym63$KBQ_QUERY_PROPERTIES);
		generic_testing.define_test_case_table_int($sym128$KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list135);
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

	static {
		me = new kb_query();
		$transcript_kbq_definition_assertionsP$ = null;
		$use_kbq_practice_rulesP$ = null;
		$$CycLQuerySpecification = makeConstSym(("CycLQuerySpecification"));
		$sym1$CYCL_SENTENCE_P = makeSymbol("CYCL-SENTENCE-P");
		$sym2$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
		$sym3$QUERY_PROPERTIES_P = makeSymbol("QUERY-PROPERTIES-P");
		$$isa = makeConstSym(("isa"));
		$list5 = ConsesLow.list(makeConstSym(("MultipleChoiceQuerySpecification")));
		$list6 = list(makeConstSym(("CycLQuerySpecification")));
		$sym7$UPDATE_KBQ_DEFINITION = makeSymbol("UPDATE-KBQ-DEFINITION");
		$$TestVocabularyMt = makeConstSym(("TestVocabularyMt"));
		$sym9$UPDATE_KBQ_DEFINITION_SILENT = makeSymbol("UPDATE-KBQ-DEFINITION-SILENT");
		$sym10$_EXIT = makeSymbol("%EXIT");
		$sym11$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
		$$EverythingPSC = makeConstSym(("EverythingPSC"));
		$$InferenceSentenceParameter = makeConstSym(("InferenceSentenceParameter"));
		$$sentenceParameterValueInSpecifica = makeConstSym(("sentenceParameterValueInSpecification"));
		$GAF = makeKeyword("GAF");
		$TRUE = makeKeyword("TRUE");
		$$InferenceMicrotheoryParameter = makeConstSym(("InferenceMicrotheoryParameter"));
		$$microtheoryParameterValueInSpecif = makeConstSym(("microtheoryParameterValueInSpecification"));
		$$InferenceModeParameter = makeConstSym(("InferenceModeParameter"));
		$$inferenceModeParameterValueInSpec = makeConstSym(("inferenceModeParameterValueInSpecification"));
		$$softwareParameterValueInSpecifica = makeConstSym(("softwareParameterValueInSpecification"));
		$$ist_Asserted = makeConstSym(("ist-Asserted"));
		$$BaseKB = makeConstSym(("BaseKB"));
		$$Quote = makeConstSym(("Quote"));
		$$EscapeQuote = makeConstSym(("EscapeQuote"));
		$str26$Inference_Parameter__S_unknown_by = makeString("Inference Parameter ~S unknown by the KB.");
		$$InferenceAllowedRulesParameter = makeConstSym(("InferenceAllowedRulesParameter"));
		$$queryPracticeRules = makeConstSym(("queryPracticeRules"));
		$NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");
		$list30 = list(makeSymbol("OPTION-NUM"), makeSymbol("FULL-LABEL"), makeSymbol("INDEX-LABEL"), makeSymbol("PAYLOAD"));
		$sym31$INTEGERP = makeSymbol("INTEGERP");
		$sym32$STRINGP = makeSymbol("STRINGP");
		$sym33$KB_SET_OF_BINDING_SETS_P = makeSymbol("KB-SET-OF-BINDING-SETS-P");
		$$MCQuestionNthOptionFn = makeConstSym(("MCQuestionNthOptionFn"));
		$$multipleChoiceOptionFullLabel = makeConstSym(("multipleChoiceOptionFullLabel"));
		$$multipleChoiceOptionIndexLabel = makeConstSym(("multipleChoiceOptionIndexLabel"));
		$$multipleChoiceOptionPayload = makeConstSym(("multipleChoiceOptionPayload"));
		$$comment = makeConstSym(("comment"));
		$list39 = list(makeSymbol("COMMENT"));
		$str40$The_template___A__passed_for_the_ = makeString("The template, ~A, passed for the query spec, ~A, is not the one known in the KB (~A).");
		$$TemplateFromTestQueryFn = makeConstSym(("TemplateFromTestQueryFn"));
		$list42 = list(makeSymbol("FOLDER"), makeSymbol("MT"));
		$$formulaTemplateGloss = makeConstSym(("formulaTemplateGloss"));
		$$folderContainsResource = makeConstSym(("folderContainsResource"));
		$list45 = list(makeConstSym(("QueryFn")), list(makeKeyword("BIND"), makeSymbol("QUOTED-SENTENCE")), makeKeyword("ANYTHING"));
		$sym46$QUOTED_SENTENCE = makeSymbol("QUOTED-SENTENCE");
		$list47 = list(makeConstSym(("QueryFromTemplateFn")), list(makeKeyword("BIND"), makeSymbol("QUESTION-TEMPLATE")), list(makeKeyword("BIND"), makeSymbol("EL-SUBSTITUTIONS")));
		$sym48$EL_SUBSTITUTIONS = makeSymbol("EL-SUBSTITUTIONS");
		$sym49$QUESTION_TEMPLATE = makeSymbol("QUESTION-TEMPLATE");
		$str50$The_query_specification___A__has_ = makeString("The query specification, ~A, has no #$InferenceSentenceParameter.");
		$str51$The_query_specification___A__has_ = makeString("The query specification, ~A, has more than one #$InferenceSentenceParameter.");
		$$cycLPattern = makeConstSym(("cycLPattern"));
		$$metaTemplate = makeConstSym(("metaTemplate"));
		$list54 = list(makeSymbol("TEMPLATE-TERM"), makeSymbol("ACTUAL-TERM"));
		$$QuestionSuggestionTemplate_Single = makeConstSym(("QuestionSuggestionTemplate-SingleOption"));
		$$questionTemplateInstantiations = makeConstSym(("questionTemplateInstantiations"));
		$$InferenceNonExplanatorySentencePa = makeConstSym(("InferenceNonExplanatorySentenceParameter"));
		$list58 = list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")), list(makeConstSym(("ist")), list(makeKeyword("BIND"), makeSymbol("MT")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING"));
		$sym59$MT = makeSymbol("MT");
		$$InferencePSC = makeConstSym(("InferencePSC"));
		$str61$The_query_specification___A__has_ = makeString("The query specification, ~A, has more than one #$InferenceMicrotheoryParameter.");
		$$querySpecificationForFormulaTempl = makeConstSym(("querySpecificationForFormulaTemplate"));
		$sym63$KBQ_QUERY_PROPERTIES = makeSymbol("KBQ-QUERY-PROPERTIES");
		$ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
		$sym65$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
		$$MultipleChoiceKBContentTest = makeConstSym(("MultipleChoiceKBContentTest"));
		$$MultipleChoiceQuerySpecification = makeConstSym(("MultipleChoiceQuerySpecification"));
		$sym68$KBQ_QUERY_SPEC_P = makeSymbol("KBQ-QUERY-SPEC-P");
		$$mcQuestionNthOption = makeConstSym(("mcQuestionNthOption"));
		$sym70$SAFE__ = makeSymbol("SAFE-<");
		$sym71$FIRST = makeSymbol("FIRST");
		$list72 = list(makeSymbol("PARAMETER"), makeSymbol("KB-VALUE"));
		$MAX_TIME = makeKeyword("MAX-TIME");
		$FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");
		$IGNORE = makeKeyword("IGNORE");
		$$TheEmptySet = makeConstSym(("TheEmptySet"));
		$RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
		$MAX_NUMBER = makeKeyword("MAX-NUMBER");
		$MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
		$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
		$METRICS = makeKeyword("METRICS");
		$sym82$FORT_P = makeSymbol("FORT-P");
		$$TestQueryFn = makeConstSym(("TestQueryFn"));
		$SEVERE = makeKeyword("SEVERE");
		$$UnrunnableQuery = makeConstSym(("UnrunnableQuery"));
		$$QueryFn = makeConstSym(("QueryFn"));
		$list87 = list(makeSymbol("&OPTIONAL"), makeSymbol("SENTENCE"), makeSymbol("PARAMETERS"), makeSymbol("&REST"), makeSymbol("REST"));
		$str88$___A_has_no_query_sentence_ = makeString("~%~A has no query sentence.");
		$NO_QUERY_SENTENCE = makeKeyword("NO-QUERY-SENTENCE");
		$str90$___A_has_too_many_arguments_ = makeString("~%~A has too many arguments.");
		$TOO_MANY_ARGUMENTS = makeKeyword("TOO-MANY-ARGUMENTS");
		$str92$ = makeString("");
		$sym93$IST_SENTENCE_WITH_CHLMT_P = makeSymbol("IST-SENTENCE-WITH-CHLMT-P");
		$str94$___A_has_more_than_one_query_sent = makeString("~%~A has more than one query sentence.");
		$MORE_THAN_ONE_QUERY_SENTENCE = makeKeyword("MORE-THAN-ONE-QUERY-SENTENCE");
		$str96$___A_has_no_query_Mt_ = makeString("~%~A has no query Mt.");
		$NO_QUERY_MT = makeKeyword("NO-QUERY-MT");
		$str98$___A_has_more_than_one_query_Mt_ = makeString("~%~A has more than one query Mt.");
		$MORE_THAN_ONE_QUERY_MT = makeKeyword("MORE-THAN-ONE-QUERY-MT");
		$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
		$BINDINGS = makeKeyword("BINDINGS");
		$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
		$sym103$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
		$sym104$REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");
		$list105 = list(makeSymbol("HL-MT"), makeSymbol("HL-SENTENCE"));
		$sym106$REMOVAL_ASK_QUERY_METRIC_P = makeSymbol("REMOVAL-ASK-QUERY-METRIC-P");
		$ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
		$TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
		$TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
		$TOTAL_TIME = makeKeyword("TOTAL-TIME");
		$COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");
		$TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");
		$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
		$str114$time_to_implement_metric__S = makeString("time to implement metric ~S");
		$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
		$list116 = listS(makeConstSym(("PredicateQueryFn")), list(makeConstSym(("Kappa")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));
		$list117 = list(makeSymbol("JANUS-OP"), makeSymbol("TYPE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"), makeSymbol("EXPECTED-RESULT"), makeSymbol("EXPECTED-HALT-REASON"), makeSymbol("TAG"));
		$list118 = list(makeSymbol("&OPTIONAL"), makeSymbol("QUOTED-SENTENCE"), list(makeSymbol("CYCL-PARAMETERS"), makeConstSym(("TheEmptySet"))));
		$sym119$EL_LIST_ITEMS = makeSymbol("EL-LIST-ITEMS");
		$list120 = list(makeSymbol("KAPPA-PREDICATE"), makeSymbol("&OPTIONAL"), list(makeSymbol("CYCL-PARAMETERS"), makeConstSym(("TheEmptySet"))));
		$sym121$KEYWORDP = makeSymbol("KEYWORDP");
		$$InferenceParameter = makeConstSym(("InferenceParameter"));
		$$CycHLSupportModule = makeConstSym(("CycHLSupportModule"));
		$sym124$CONSTANT_P = makeSymbol("CONSTANT-P");
		$$CycHLTruthValue = makeConstSym(("CycHLTruthValue"));
		$$SecondsDuration = makeConstSym(("SecondsDuration"));
		$str127$Unit__A_can_t_be_converted_to_sec = makeString("Unit ~A can't be converted to seconds.");
		$sym128$KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE = makeSymbol("KBQ-PARSE-KB-INFERENCE-PARAMETER-VALUE");
		$TEST = makeKeyword("TEST");
		$OWNER = makeKeyword("OWNER");
		$CLASSES = makeKeyword("CLASSES");
		$KB = makeKeyword("KB");
		$FULL = makeKeyword("FULL");
		$WORKING_ = makeKeyword("WORKING?");
		$list135 = list(list(list(makeConstSym(("False")), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?")), NIL), list(list(makeConstSym(("True")), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?")), T), list(list(makeKeyword("ALL"), makeKeyword("ALLOWED-RULES")), makeKeyword("ALL")), list(ConsesLow.list(list(makeConstSym(("SubLQuoteFn")), makeKeyword("ALL")), makeKeyword("ALLOWED-RULES")), makeKeyword("ALL")),
				list(list(list(makeConstSym(("SubLQuoteFn")), makeKeyword("ALL")), makeKeyword("EQUALITY-REASONING-DOMAIN")), makeKeyword("ALL")), list(list(list(makeConstSym(("TheList"))), makeKeyword("ALLOWED-RULES")), NIL), list(list(makeConstSym(("TheEmptyList")), makeKeyword("ALLOWED-RULES")), NIL));
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param query
	 * @return
	 */
	public static SubLObject kbq_query_arguments(SubLObject query) {
		return kbq_query_arguments(query, UNPROVIDED_SYM);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param kbq
	 * @param unprovided
	 * @return
	 */
	public static SubLObject new_continuable_inference_from_kbq(SubLObject kbq, SubLObject unprovided) {
		return new_continuable_inference_from_kbq(kbq, unprovided, UNPROVIDED_SYM);
	}
}
/*
 *
 * Total time: 871 ms synthetic
 */