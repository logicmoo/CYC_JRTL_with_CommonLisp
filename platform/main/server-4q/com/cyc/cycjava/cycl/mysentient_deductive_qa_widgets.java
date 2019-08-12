/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-DEDUCTIVE-QA-WIDGETS
 *  source file: /cyc/top/cycl/mysentient-deductive-qa-widgets.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class mysentient_deductive_qa_widgets extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_deductive_qa_widgets() {
    }

    public static final SubLFile me = new mysentient_deductive_qa_widgets();

    public static final String myName = "com.cyc.cycjava.cycl.mysentient_deductive_qa_widgets";

    // // Definitions
    /**
     * When non-NIL, stop trying the different parses for the input question as soon as we
     * get answers for one. When NIL, try them all.
     */
    // deflexical
    public static final SubLSymbol $mysentient_deductive_qa_stop_after_first_successP$ = makeSymbol("*MYSENTIENT-DEDUCTIVE-QA-STOP-AFTER-FIRST-SUCCESS?*");

    /**
     * integerp; The number of seconds after which DQA should attempt to gracefully interrupt any running inferences and return any results so far.
     */
    // deflexical
    public static final SubLSymbol $myse_dqa_inference_interrupt_time$ = makeSymbol("*MYSE-DQA-INFERENCE-INTERRUPT-TIME*");

    /**
     * integerp; The number of seconds after which DQA should forcibly abort any running inferences and return any results obtained from previous inferences.
     */
    // deflexical
    public static final SubLSymbol $myse_dqa_inference_abort_time$ = makeSymbol("*MYSE-DQA-INFERENCE-ABORT-TIME*");

    /**
     * integerp; The number of seconds after which DQA should attempt to gracefully interrupt any running paraphrases and return any results so far.
     */
    // deflexical
    public static final SubLSymbol $myse_dqa_paraphrase_interrupt_time$ = makeSymbol("*MYSE-DQA-PARAPHRASE-INTERRUPT-TIME*");

    /**
     * integerp; The number of seconds after which DQA should forcibly abort any running paraphrases and return any results obtained from previous paraphrases
     */
    // deflexical
    public static final SubLSymbol $myse_dqa_paraphrase_abort_time$ = makeSymbol("*MYSE-DQA-PARAPHRASE-ABORT-TIME*");

    // deflexical
    private static final SubLSymbol $myse_dqa_default_confidence$ = makeSymbol("*MYSE-DQA-DEFAULT-CONFIDENCE*");

    /**
     * minimum match-weight a query needs to have for it to be run by DQA
     */
    // deflexical
    private static final SubLSymbol $myse_min_query_matching_weight$ = makeSymbol("*MYSE-MIN-QUERY-MATCHING-WEIGHT*");





    /**
     * Wrapper for getting some answer to the user somehow.
     */
    public static final SubLObject perform_deductive_qa_and_explain(SubLObject sentence, SubLObject session_mt, SubLObject nl_mt, SubLObject string, SubLObject utterance_peg) {
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        if (NIL != sentence) {
            SubLTrampolineFile.checkType(sentence, CYCL_SENTENCE_P);
        }
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject start_time = get_universal_time();
            return perform_deductive_qa_and_explain_int(sentence, session_mt, nl_mt, string, utterance_peg, start_time);
        }
    }

    public static final SubLObject perform_deductive_qa_and_explain_int(SubLObject sentence, SubLObject session_mt, SubLObject nl_mt, SubLObject string, SubLObject utterance_peg, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject explanation_strings = NIL;
                SubLObject cycl_explanation_sets = NIL;
                SubLObject explanation_weights = NIL;
                SubLObject confidence = NIL;
                SubLObject remaining_query_specs = NIL;
                SubLObject confidences = NIL;
                if (NIL != explanation_info_emptyP(explanation_strings, cycl_explanation_sets, explanation_weights)) {
                    if (NIL != forts.fort_p(utterance_peg)) {
                        mysentient_utilities.myselog_info(cconcatenate($str_alt15$See_if_there_is_a_workable_CycL_s, format_nil.format_nil_a_no_copy(utterance_peg)));
                        confidence = myse_dqa_strategy_default_confidence($const16$MyS_AnswerUserQuestion_DQAStrateg, session_mt);
                        thread.resetMultipleValues();
                        {
                            SubLObject explanation_strings_1 = perform_deductive_qa_on_utterance_sentence_and_explain_int(utterance_peg, session_mt, nl_mt, start_time);
                            SubLObject cycl_explanation_sets_2 = thread.secondMultipleValue();
                            SubLObject explanation_weights_3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            explanation_strings = explanation_strings_1;
                            cycl_explanation_sets = cycl_explanation_sets_2;
                            explanation_weights = explanation_weights_3;
                        }
                        confidences = combine_confidence_and_weights(confidence, explanation_weights);
                    } else {
                        mysentient_utilities.myselog_info(cconcatenate(format_nil.format_nil_s_no_copy(NIL), $str_alt17$_is_not_a_valid_utterance_peg__so));
                    }
                }
                if (NIL != explanation_info_emptyP(explanation_strings, cycl_explanation_sets, explanation_weights)) {
                    if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                        mysentient_utilities.myselog_info(cconcatenate($str_alt18$Trying_to_see_if_the_CycL_sentenc, new SubLObject[]{ format_nil.format_nil_s_no_copy(sentence), $str_alt19$_will_get_us_somewhere_ }));
                        confidence = myse_dqa_strategy_default_confidence($const16$MyS_AnswerUserQuestion_DQAStrateg, session_mt);
                        thread.resetMultipleValues();
                        {
                            SubLObject explanation_strings_4 = perform_and_explain_deductive_qa_int(sentence, session_mt, nl_mt, NIL, start_time);
                            SubLObject cycl_explanation_sets_5 = thread.secondMultipleValue();
                            SubLObject explanation_weights_6 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            explanation_strings = explanation_strings_4;
                            cycl_explanation_sets = cycl_explanation_sets_5;
                            explanation_weights = explanation_weights_6;
                        }
                        confidences = combine_confidence_and_weights(confidence, explanation_weights);
                    } else {
                        mysentient_utilities.myselog_info(copy_seq($str_alt20$There_was_no_CycL_sentence_provid));
                    }
                }
                if ((NIL != $myse_execute_query_matching_qa_strategy$.getGlobalValue()) && (NIL != explanation_info_emptyP(explanation_strings, cycl_explanation_sets, explanation_weights))) {
                    confidence = myse_dqa_strategy_default_confidence($const21$MyS_AnswerMatchedQuery_DQAStrateg, session_mt);
                    mysentient_utilities.myselog_info(cconcatenate($str_alt22$Checking_to_see_whether_there_are, new SubLObject[]{ format_nil.format_nil_s_no_copy(string), $str_alt23$_ }));
                    {
                        SubLObject all_query_ranked_specs = identify_mysentient_parameterized_queries_matching_words(string);
                        SubLObject any_foundP = NIL;
                        SubLObject cdolist_list_var = all_query_ranked_specs;
                        SubLObject query_ranked_spec = NIL;
                        for (query_ranked_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_ranked_spec = cdolist_list_var.first()) {
                            any_foundP = T;
                            {
                                SubLObject query_spec = query_ranked_spec.first();
                                SubLObject query_weight = second(query_ranked_spec);
                                if ($myse_min_query_matching_weight$.getGlobalValue().numG(query_weight)) {
                                    mysentient_utilities.myselog_info(cconcatenate($str_alt24$Query_, new SubLObject[]{ format_nil.format_nil_s_no_copy(query_spec), $str_alt25$_had_too_low_a_weight_to_bother_w, format_nil.format_nil_s_no_copy(query_weight) }));
                                } else
                                    if (NIL != explanation_info_emptyP(explanation_strings, cycl_explanation_sets, explanation_weights)) {
                                        mysentient_utilities.myselog_info(cconcatenate($str_alt26$Trying_parameterized_query_, new SubLObject[]{ format_nil.format_nil_a_no_copy(query_spec), $str_alt23$_ }));
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject explanation_strings_7 = perform_and_explain_deductive_qa_query_int(query_spec, nl_mt, start_time);
                                            SubLObject cycl_explanation_sets_8 = thread.secondMultipleValue();
                                            SubLObject explanation_weights_9 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            explanation_strings = explanation_strings_7;
                                            cycl_explanation_sets = cycl_explanation_sets_8;
                                            explanation_weights = explanation_weights_9;
                                        }
                                        confidences = combine_confidence_and_weights(confidence, explanation_weights);
                                    } else {
                                        mysentient_utilities.myselog_info(cconcatenate($str_alt27$Save_query_spec_, new SubLObject[]{ format_nil.format_nil_a_no_copy(query_spec), $str_alt28$_for_later_ }));
                                        remaining_query_specs = cons(query_ranked_spec, remaining_query_specs);
                                    }

                            }
                        }
                        if (NIL == any_foundP) {
                            mysentient_utilities.myselog_info(copy_seq($str_alt29$No_parameterized_queries_were_fou));
                        }
                    }
                    remaining_query_specs = nreverse(remaining_query_specs);
                }
                if (NIL != explanation_info_emptyP(explanation_strings, cycl_explanation_sets, explanation_weights)) {
                    if (NIL != forts.fort_p(utterance_peg)) {
                        mysentient_utilities.myselog_info(cconcatenate($str_alt30$See_if_we_can_generate_an_appropr, new SubLObject[]{ format_nil.format_nil_a_no_copy(utterance_peg), $str_alt23$_ }));
                        confidence = myse_dqa_strategy_default_confidence($$BeResponsive_DQAStrategy, session_mt);
                        thread.resetMultipleValues();
                        {
                            SubLObject explanation_strings_10 = perform_deductive_qa_appropriate_response_query_and_explain_int(utterance_peg, session_mt, nl_mt, start_time);
                            SubLObject cycl_explanation_sets_11 = thread.secondMultipleValue();
                            SubLObject explanation_weights_12 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            explanation_strings = explanation_strings_10;
                            cycl_explanation_sets = cycl_explanation_sets_11;
                            explanation_weights = explanation_weights_12;
                        }
                        confidences = combine_confidence_and_weights(confidence, explanation_weights);
                    } else {
                        mysentient_utilities.myselog_info(copy_seq($str_alt32$There_was_no_peg_for_us_to_try_an));
                    }
                }
                if ((NIL != $default_interesting_sentence_deductive_qa_confidence$.getGlobalValue()) && (NIL != explanation_info_emptyP(explanation_strings, cycl_explanation_sets, explanation_weights))) {
                    if (NIL != forts.fort_p(utterance_peg)) {
                        mysentient_utilities.myselog_info(cconcatenate($str_alt33$See_if_we_can_generate_interestin, new SubLObject[]{ format_nil.format_nil_a_no_copy(utterance_peg), $str_alt23$_ }));
                        confidence = myse_dqa_strategy_default_confidence($const34$MyS_InterestingSentence_DQAStrate, session_mt);
                        thread.resetMultipleValues();
                        {
                            SubLObject explanation_strings_13 = perform_deductive_qa_interesting_sentence_query_and_explain_int(utterance_peg, session_mt, nl_mt, start_time);
                            SubLObject cycl_explanation_sets_14 = thread.secondMultipleValue();
                            SubLObject explanation_weights_15 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            explanation_strings = explanation_strings_13;
                            cycl_explanation_sets = cycl_explanation_sets_14;
                            explanation_weights = explanation_weights_15;
                        }
                        confidences = combine_confidence_and_weights(confidence, explanation_weights);
                    } else {
                        mysentient_utilities.myselog_info(copy_seq($str_alt35$There_was_no_peg_for_us_to_try_an));
                    }
                }
                if (confidence.isDouble()) {
                } else
                    if (NIL != explanation_info_emptyP(explanation_strings, cycl_explanation_sets, explanation_weights)) {
                        confidence = $float$0_0;
                    } else {
                        confidence = list_utilities.extremal(explanation_weights, symbol_function($sym37$_), UNPROVIDED);
                    }

                mysentient_utilities.myselog_info(format(NIL, $str_alt38$DQA_returning__A_answer_P_, length(explanation_strings), length(explanation_strings)));
                {
                    SubLObject explanation_info = list(explanation_strings, cycl_explanation_sets, confidences);
                    return values(explanation_info, confidence, remaining_query_specs);
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $dqa_confidence$ = makeSymbol("*DQA-CONFIDENCE*");

    public static final SubLObject combine_confidence_and_weights(SubLObject confidence, SubLObject weights) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject adjusted_weights = NIL;
                {
                    SubLObject _prev_bind_0 = $dqa_confidence$.currentBinding(thread);
                    try {
                        $dqa_confidence$.bind(confidence, thread);
                        adjusted_weights = Mapping.mapcar(symbol_function(COMBINE_CONFIDENCE_AND_WEIGHT), weights);
                    } finally {
                        $dqa_confidence$.rebind(_prev_bind_0, thread);
                    }
                }
                return adjusted_weights;
            }
        }
    }

    public static final SubLObject combine_confidence_and_weight(SubLObject weight) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = add($dqa_confidence$.getDynamicValue(thread), multiply(subtract(weight, $float$0_5), $float$0_1));
                if (result.numL($float$0_0)) {
                    result = $float$0_0;
                } else
                    if (result.numG($float$1_0)) {
                        result = $float$1_0;
                    }

                return result;
            }
        }
    }

    public static final SubLObject explanation_info_emptyP(SubLObject explanation_strings, SubLObject cycl_explanation_sets, SubLObject explanation_weights) {
        return makeBoolean(((NIL == explanation_strings) && (NIL == cycl_explanation_sets)) && (NIL == explanation_weights));
    }

    /**
     * Wrapper for doing ASK and answer generation together.
     */
    public static final SubLObject perform_and_explain_deductive_qa(SubLObject sentence, SubLObject session_mt, SubLObject nl_mt, SubLObject inference_properties) {
        if (inference_properties == UNPROVIDED) {
            inference_properties = NIL;
        }
        SubLTrampolineFile.checkType(sentence, CYCL_SENTENCE_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        {
            SubLObject start_time = get_universal_time();
            return perform_and_explain_deductive_qa_int(sentence, session_mt, nl_mt, inference_properties, start_time);
        }
    }

    public static final SubLObject perform_and_explain_deductive_qa_int(SubLObject sentence, SubLObject session_mt, SubLObject nl_mt, SubLObject inference_properties, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_sentence = adjust_deductive_qa_sentence_temporally(sentence, session_mt);
                SubLObject explanation_strings = NIL;
                SubLObject answers = NIL;
                SubLObject weights = NIL;
                SubLObject inference = NIL;
                try {
                    inference = perform_deductive_qa_on_sentence_int(query_sentence, session_mt, inference_properties, start_time);
                    thread.resetMultipleValues();
                    {
                        SubLObject explanation_strings_16 = explain_all_relevant_inference_answers_int(inference, nl_mt, session_mt, symbol_function(IDENTITY), start_time);
                        SubLObject answers_17 = thread.secondMultipleValue();
                        SubLObject weights_18 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        explanation_strings = explanation_strings_16;
                        answers = answers_17;
                        weights = weights_18;
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(explanation_strings, answers, weights);
            }
        }
    }

    /**
     * Wrapper for doing ASK of query and explanation together.
     */
    public static final SubLObject perform_and_explain_deductive_qa_query(SubLObject query_spec, SubLObject nl_mt) {
        SubLTrampolineFile.checkType(query_spec, FORT_P);
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        {
            SubLObject start_time = get_universal_time();
            return perform_and_explain_deductive_qa_query_int(query_spec, nl_mt, start_time);
        }
    }

    public static final SubLObject perform_and_explain_deductive_qa_query_int(SubLObject query_spec, SubLObject nl_mt, SubLObject start_time) {
        {
            SubLObject sentence = kb_query.kbq_sentence(query_spec);
            SubLObject mt = kb_query.kbq_mt(query_spec);
            SubLObject v_properties = inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query_spec));
            return perform_and_explain_deductive_qa_int(sentence, mt, nl_mt, v_properties, start_time);
        }
    }

    /**
     * Wrapper for doing the deductive QA ask on an utterance and then explaining the result.
     */
    public static final SubLObject perform_deductive_qa_appropriate_response_query_and_explain(SubLObject utterance_peg, SubLObject session_mt, SubLObject nl_mt) {
        SubLTrampolineFile.checkType(utterance_peg, FORT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        {
            SubLObject start_time = get_universal_time();
            return perform_deductive_qa_appropriate_response_query_and_explain_int(utterance_peg, session_mt, nl_mt, start_time);
        }
    }

    public static final SubLObject perform_deductive_qa_appropriate_response_query_and_explain_int(SubLObject utterance_peg, SubLObject session_mt, SubLObject nl_mt, SubLObject start_time) {
        {
            SubLObject sentence = deductive_qa_appropriate_response_query_sentence(utterance_peg);
            SubLObject v_properties = deductive_qa_appropriate_response_query_properties();
            return perform_and_explain_deductive_qa_int(sentence, session_mt, nl_mt, v_properties, start_time);
        }
    }

    /**
     * Wrapper for doing the deductive QA ask on an utterance and then explaining the result.
     */
    public static final SubLObject perform_deductive_qa_interesting_sentence_query_and_explain(SubLObject utterance_peg, SubLObject session_mt, SubLObject nl_mt) {
        SubLTrampolineFile.checkType(utterance_peg, FORT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        {
            SubLObject start_time = get_universal_time();
            return perform_deductive_qa_interesting_sentence_query_and_explain_int(utterance_peg, session_mt, nl_mt, start_time);
        }
    }

    public static final SubLObject perform_deductive_qa_interesting_sentence_query_and_explain_int(SubLObject utterance_peg, SubLObject session_mt, SubLObject nl_mt, SubLObject start_time) {
        {
            SubLObject sentence = deductive_qa_interesting_sentence_query_sentence(utterance_peg);
            SubLObject v_properties = deductive_qa_interesting_sentence_query_properties();
            return perform_and_explain_deductive_qa_int(sentence, session_mt, nl_mt, v_properties, start_time);
        }
    }

    /**
     * Wrapper for doing the deductive QA ask on the sentence of the main utterance
     * and then explaining the result.
     */
    public static final SubLObject perform_deductive_qa_on_utterance_sentence_and_explain(SubLObject utterance_peg, SubLObject session_mt, SubLObject nl_mt) {
        SubLTrampolineFile.checkType(utterance_peg, FORT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        {
            SubLObject start_time = get_universal_time();
            return perform_deductive_qa_on_utterance_sentence_and_explain_int(utterance_peg, session_mt, nl_mt, start_time);
        }
    }

    public static final SubLObject perform_deductive_qa_on_utterance_sentence_and_explain_int(SubLObject utterance_peg, SubLObject session_mt, SubLObject nl_mt, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = deductive_qa_sentences_for_peg(utterance_peg, session_mt);
                SubLObject doneP = NIL;
                SubLObject explanation_strings = NIL;
                SubLObject cycl_explanation_sets = NIL;
                SubLObject explanation_weights = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = sentences;
                        SubLObject sentence = NIL;
                        for (sentence = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sentence = csome_list_var.first()) {
                            {
                                SubLObject v_properties = deductive_qa_on_information_behind_peg_properties(sentence);
                                thread.resetMultipleValues();
                                {
                                    SubLObject strings = perform_and_explain_deductive_qa_int(sentence, session_mt, nl_mt, v_properties, start_time);
                                    SubLObject cycl_sets = thread.secondMultipleValue();
                                    SubLObject weights = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != strings) {
                                        explanation_strings = append(explanation_strings, strings);
                                        cycl_explanation_sets = append(cycl_explanation_sets, cycl_sets);
                                        explanation_weights = append(explanation_weights, weights);
                                        doneP = $mysentient_deductive_qa_stop_after_first_successP$.getGlobalValue();
                                    }
                                }
                            }
                        }
                    }
                }
                return values(explanation_strings, cycl_explanation_sets, explanation_weights);
            }
        }
    }

    /**
     *
     *
     * @return LISTP of CYCL-SENTENCE-P; best-first list of parses for UTTERANCE-PEG in SESSION-MT.
     */
    public static final SubLObject deductive_qa_sentences_for_peg(SubLObject utterance_peg, SubLObject session_mt) {
        {
            SubLObject sentences = mysentient_utilities.myse_query_variable($deductive_qa_on_information_behind_variable$.getGlobalValue(), deductive_qa_on_information_behind_peg_sentence(utterance_peg), session_mt, UNPROVIDED);
            return rank_deductive_qa_sentences_for_peg(sentences, utterance_peg);
        }
    }

    /**
     *
     *
     * @return LISTP; SENTENCES ranked by quality of parse for UTTERANCE-PEG.
     */
    public static final SubLObject rank_deductive_qa_sentences_for_peg(SubLObject sentences, SubLObject utterance_peg) {
        return sentences;
    }

    public static final SubLObject myse_dqa_strategy_default_confidence(SubLObject strategy, SubLObject session_mt) {
        return mysentient_utilities.myse_strategy_default_confidence(strategy, session_mt, $myse_dqa_default_confidence$.getGlobalValue());
    }

    /**
     * When T, reason about the existence of temporal dimension slices; otherwise, use
     * InferencePSC to bypass temporal reasoning.
     */
    // deflexical
    public static final SubLSymbol $mysentient_deductive_qa_reason_into_temporal_dimensionsP$ = makeSymbol("*MYSENTIENT-DEDUCTIVE-QA-REASON-INTO-TEMPORAL-DIMENSIONS?*");

    public static final SubLObject adjust_deductive_qa_sentence_temporally(SubLObject sentence, SubLObject session_mt) {
        if (NIL != narts_high.naut_p(session_mt)) {
            if (cycl_utilities.formula_arg0(session_mt) == $$MtSpace) {
                return sentence;
            }
        }
        if (NIL != $mysentient_deductive_qa_reason_into_temporal_dimensionsP$.getGlobalValue()) {
            return list($$ist, listS($$MtSpace, session_mt, $list_alt62), sentence);
        } else {
            return list($$ist, $$InferencePSC, sentence);
        }
    }

    /**
     * The level of detail at which we trace the SKSI calls.
     */
    // deflexical
    public static final SubLSymbol $mysentient_deductive_qa_sksi_trace_level$ = makeSymbol("*MYSENTIENT-DEDUCTIVE-QA-SKSI-TRACE-LEVEL*");

    /**
     * Perform an ask and return the appropriate objects.
     */
    public static final SubLObject perform_deductive_qa_on_sentence(SubLObject sentence, SubLObject elmt, SubLObject inference_properties) {
        if (inference_properties == UNPROVIDED) {
            inference_properties = NIL;
        }
        SubLTrampolineFile.checkType(sentence, CYCL_SENTENCE_P);
        SubLTrampolineFile.checkType(elmt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(inference_properties, LISTP);
        {
            SubLObject start_time = get_universal_time();
            return perform_deductive_qa_on_sentence_int(sentence, elmt, inference_properties, start_time);
        }
    }

    public static final SubLObject perform_deductive_qa_on_sentence_int(SubLObject sentence, SubLObject elmt, SubLObject inference_properties, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_properties = compute_deductive_qa_inference_properties(inference_properties, sentence);
                SubLObject static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties);
                SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_properties);
                SubLObject inference = inference_kernel.new_continuable_inference(sentence, elmt, static_properties);
                SubLObject potential_sksi_trace = NIL;
                mysentient_utilities.myselog_info(cconcatenate($str_alt70$Asking_sentence_, format_nil.format_nil_a_no_copy(sentence)));
                mysentient_utilities.myselog_info(cconcatenate($str_alt71$Asking_in_ELMt_, format_nil.format_nil_a_no_copy(elmt)));
                mysentient_utilities.myselog_info(cconcatenate($str_alt72$Static_properties__, format_nil.format_nil_a_no_copy(static_properties)));
                {
                    SubLObject string_stream = make_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = sksi_debugging.$sksi_trace_stream$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sksi_debugging.$sksi_trace_level$.currentBinding(thread);
                        try {
                            sksi_debugging.$sksi_trace_stream$.bind(string_stream, thread);
                            sksi_debugging.$sksi_trace_level$.bind(NIL, thread);
                            sksi_debugging.sksi_trace($mysentient_deductive_qa_sksi_trace_level$.getGlobalValue());
                            deductive_qa_continue_inference(inference, dynamic_properties, start_time);
                            sksi_debugging.sksi_untrace();
                        } finally {
                            sksi_debugging.$sksi_trace_level$.rebind(_prev_bind_1, thread);
                            sksi_debugging.$sksi_trace_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    potential_sksi_trace = get_output_stream_string(string_stream);
                }
                if (NIL != string_utilities.empty_string_p(potential_sksi_trace)) {
                    mysentient_utilities.myselog_info($str_alt73$This_inference_invoked_no_SKSI_ca);
                } else {
                    mysentient_utilities.myselog_info(potential_sksi_trace);
                }
                return inference;
            }
        }
    }

    /**
     * Modifies the :max-time property in INFERENCE-PROPERTIES to be a reasonable value
     * based on how much time is left in DQA's budget and the current time.  Also, forcibly
     * aborts the inference if it overruns its time budget by too much.
     */
    public static final SubLObject deductive_qa_continue_inference(SubLObject inference, SubLObject dynamic_properties, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject interrupt_seconds = deductive_qa_inference_interrupt_and_abort_seconds_from_now(start_time);
                SubLObject abort_seconds = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (interrupt_seconds.isPositive()) {
                    dynamic_properties = putf(dynamic_properties, $MAX_TIME, interrupt_seconds);
                    mysentient_utilities.myselog_info(cconcatenate($str_alt75$DQA_inference_remaining_time__, new SubLObject[]{ format_nil.format_nil_a_no_copy(abort_seconds), $str_alt76$s__, format_nil.format_nil_a_no_copy(interrupt_seconds), $str_alt77$s_graceful_ }));
                    {
                        SubLObject timed_outP = NIL;
                        SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            {
                                SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                    {
                                        SubLObject timer = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_19 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer = subl_macro_promotions.with_timeout_start_timer(abort_seconds, tag);
                                                    mysentient_utilities.myse_continue_inference(inference, dynamic_properties);
                                                } finally {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_19, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    subl_macro_promotions.with_timeout_stop_timer(timer);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        if (NIL != timed_outP) {
                            mysentient_utilities.myselog_info($str_alt78$This_inference_was_forcibly_abort);
                        }
                    }
                }
            }
            return inference;
        }
    }

    /**
     * Add any default deductive QA inference properties here. Will go before the
     * additional ones, so the additional ones overrule these.
     */
    // deflexical
    private static final SubLSymbol $default_deductive_qa_inference_properties$ = makeSymbol("*DEFAULT-DEDUCTIVE-QA-INFERENCE-PROPERTIES*");

    /**
     * Computes a best-guess set of inference properties, except doesn't do any special computation for :max-time.
     *
     * @unknown figure out what the properties should be
     */
    public static final SubLObject compute_deductive_qa_inference_properties(SubLObject additional_inference_properties, SubLObject sentence) {
        {
            SubLObject backchain = deductive_qa_max_transformation_depth_for_sentence(sentence);
            SubLObject v_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != backchain) {
                mysentient_utilities.myselog_info(cconcatenate($str_alt80$Max_transformation_depth_initiall, new SubLObject[]{ format_nil.format_nil_a_no_copy(backchain), $str_alt81$_via___mySentientDQAMaxTransforma }));
            } else {
                mysentient_utilities.myselog_info($str_alt82$No___mySentientDQAMaxTransformati);
            }
            {
                SubLObject remainder = NIL;
                for (remainder = $default_deductive_qa_inference_properties$.getGlobalValue(); NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        v_properties = putf(v_properties, property, value);
                    }
                }
            }
            {
                SubLObject remainder = NIL;
                for (remainder = additional_inference_properties; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        v_properties = putf(v_properties, property, value);
                    }
                }
            }
            {
                SubLObject removal_backtrack = deductive_qa_removal_backtracking_productivity_limit_for_sentence(sentence);
                if (NIL != removal_backtrack) {
                    v_properties = putf(v_properties, $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, removal_backtrack);
                }
            }
            return v_properties;
        }
    }

    /**
     *
     *
     * @return 0 integerp; the number of seconds after which an inference should be gracefully interrupted.  (i.e. :max-time)
     * @return 1 integerp; the number of seconds after which an inference should be forcibly aborted.
     */
    public static final SubLObject deductive_qa_inference_interrupt_and_abort_seconds_from_now(SubLObject start_time) {
        {
            SubLObject elapsed_seconds = subl_promotions.elapsed_universal_time(start_time, UNPROVIDED);
            SubLObject interrupt_seconds = max(ZERO_INTEGER, subtract($myse_dqa_inference_interrupt_time$.getGlobalValue(), elapsed_seconds));
            SubLObject abort_seconds = max(ZERO_INTEGER, subtract($myse_dqa_inference_abort_time$.getGlobalValue(), elapsed_seconds));
            return values(interrupt_seconds, abort_seconds);
        }
    }

    /**
     *
     *
     * @return nil or integerp; the max transformation depth that should be used for asking SENTENCE,
    unless any overriding settings are given.  A return value of NIL means 'don't override the default'.
     */
    public static final SubLObject deductive_qa_max_transformation_depth_for_sentence(SubLObject sentence) {
        sentence = czer_utilities.unwrap_if_ist_permissive(sentence, UNPROVIDED);
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return deductive_qa_max_transformation_depth_for_pred(cycl_utilities.atomic_sentence_predicate(sentence));
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or integerp; the max transformation depth that should be used for queries about PRED,
    unless any overriding settings are given.  A return value of NIL means 'don't override the default'.
     */
    public static final SubLObject deductive_qa_max_transformation_depth_for_pred(SubLObject pred) {
        if (NIL != forts.fort_p(pred)) {
            return kb_mapping_utilities.fpred_value_in_any_mt(pred, $const84$mySentientDQAMaxTransformationDep, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or integerp; the removal backtracking productivity limit that should be used for asking SENTENCE,
    unless any overriding settings are given.  A return value of NIL means `don't override the default'.
     */
    public static final SubLObject deductive_qa_removal_backtracking_productivity_limit_for_sentence(SubLObject sentence) {
        sentence = czer_utilities.unwrap_if_ist_permissive(sentence, UNPROVIDED);
        return NIL != cycl_grammar.cycl_atomic_sentence_p(sentence) ? ((SubLObject) (deductive_qa_removal_backtracking_productivity_limit_for_pred(cycl_utilities.atomic_sentence_predicate(sentence)))) : NIL;
    }

    /**
     *
     *
     * @return NIL or integerp; the removal backtracking productivity limit that should be used for queries about PRED,
    unless any overriding settings are given.  A return values of NIL measn `don't override the default'.
     */
    public static final SubLObject deductive_qa_removal_backtracking_productivity_limit_for_pred(SubLObject pred) {
        return NIL != forts.fort_p(pred) ? ((SubLObject) (kb_mapping_utilities.fpred_value_in_any_mt(pred, $const85$mySentientDQARemovalBacktrackingP, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
    }

    /**
     * Prototype for a query specification about an utterance peg.
     */
    // deflexical
    private static final SubLSymbol $deductive_qa_appropriate_response_query_spec$ = makeSymbol("*DEDUCTIVE-QA-APPROPRIATE-RESPONSE-QUERY-SPEC*");

    /**
     * Prototype for a query specification about referents mentioned in an utterance.
     */
    // deflexical
    private static final SubLSymbol $deductive_qa_interesting_sentence_query_spec$ = makeSymbol("*DEDUCTIVE-QA-INTERESTING-SENTENCE-QUERY-SPEC*");

    public static final SubLObject deductive_qa_appropriate_response_query_sentence(SubLObject peg) {
        return mysentient_utilities.mysentient_query_sentence_from_query_spec_and_utterance_peg($deductive_qa_appropriate_response_query_spec$.getGlobalValue(), peg);
    }

    public static final SubLObject deductive_qa_interesting_sentence_query_sentence(SubLObject peg) {
        return mysentient_utilities.mysentient_query_sentence_from_query_spec_and_utterance_peg($deductive_qa_interesting_sentence_query_spec$.getGlobalValue(), peg);
    }

    public static final SubLObject deductive_qa_appropriate_response_query_properties() {
        return mysentient_utilities.mysentient_query_properties_for_query_spec($deductive_qa_appropriate_response_query_spec$.getGlobalValue());
    }

    public static final SubLObject deductive_qa_interesting_sentence_query_properties() {
        return mysentient_utilities.mysentient_query_properties_for_query_spec($deductive_qa_interesting_sentence_query_spec$.getGlobalValue());
    }

    public static final SubLObject deductive_qa_on_information_behind_peg_sentence(SubLObject peg) {
        {
            SubLObject sentence = $deductive_qa_on_information_behind_peg_query$.getGlobalValue();
            return mysentient_utilities.mysentient_query_sentence_from_indexical_query_sentence_and_utterance_peg(sentence, peg);
        }
    }

    /**
     * The variable whose result will give the answer.
     */
    // deflexical
    private static final SubLSymbol $deductive_qa_on_information_behind_variable$ = makeSymbol("*DEDUCTIVE-QA-ON-INFORMATION-BEHIND-VARIABLE*");

    /**
     * The query used to get at the sentence behind the peg.
     */
    // deflexical
    private static final SubLSymbol $deductive_qa_on_information_behind_peg_query$ = makeSymbol("*DEDUCTIVE-QA-ON-INFORMATION-BEHIND-PEG-QUERY*");

    /**
     *
     *
     * @unknown figure out what these are really supposed to be.
     */
    public static final SubLObject deductive_qa_on_information_behind_peg_properties(SubLObject sentence) {
        return compute_deductive_qa_inference_properties(NIL, sentence);
    }

    /**
     * Given an inference answer and its proof, provide an explanation of the
     * answer using the proof.
     */
    public static final SubLObject explain_inference_answer_with_proof(SubLObject inference_answer, SubLObject proof, SubLObject session_mt, SubLObject nl_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(inference_answer, INFERENCE_ANSWER_P);
            SubLTrampolineFile.checkType(proof, PROOF_P);
            {
                SubLObject explanation = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$allow_utf8_in_pph_text_mode$.currentBinding(thread);
                    try {
                        pph_vars.$allow_utf8_in_pph_text_mode$.bind(T, thread);
                        explanation = pph_proof.pph_explain_inference_answer_with_proof(inference_answer, proof, nl_mt, session_mt, $TEXT);
                    } finally {
                        pph_vars.$allow_utf8_in_pph_text_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return explanation;
            }
        }
    }

    /**
     * Given an inference, explain all inference answers that are relevant.
     */
    public static final SubLObject explain_all_relevant_inference_answers(SubLObject inference, SubLObject nl_mt, SubLObject session_mt, SubLObject relevant_fn) {
        if (relevant_fn == UNPROVIDED) {
            relevant_fn = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(relevant_fn, FUNCTION_SPEC_P);
        {
            SubLObject start_time = get_universal_time();
            return explain_all_relevant_inference_answers_int(inference, nl_mt, session_mt, relevant_fn, start_time);
        }
    }

    public static final SubLObject explain_all_relevant_inference_answers_int(SubLObject inference, SubLObject nl_mt, SubLObject session_mt, SubLObject relevant_fn, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl_explanation_sets = NIL;
                SubLObject explanation_strings = NIL;
                SubLObject cycl_sentence_sets = NIL;
                SubLObject explanation_weights = NIL;
                SubLObject problem_dictionaries = NIL;
                SubLObject timed_outP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject interrupt_seconds = deductive_qa_paraphrase_interrupt_and_abort_seconds_from_now(start_time);
                    SubLObject abort_seconds = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    mysentient_utilities.myselog_info(cconcatenate($str_alt110$DQA_paraphrase_remaining_time__, new SubLObject[]{ format_nil.format_nil_a_no_copy(abort_seconds), $str_alt76$s__, format_nil.format_nil_a_no_copy(interrupt_seconds), $str_alt77$s_graceful_ }));
                    {
                        SubLObject _prev_bind_0 = pph_vars.$allow_utf8_in_pph_text_mode$.currentBinding(thread);
                        try {
                            pph_vars.$allow_utf8_in_pph_text_mode$.bind(T, thread);
                            thread.resetMultipleValues();
                            {
                                SubLObject explanation_strings_21 = pph_proof.pph_explain_all_inference_answers_for_best_proofs(inference, relevant_fn, nl_mt, session_mt, $TEXT, interrupt_seconds, abort_seconds);
                                SubLObject cycl_sentence_sets_22 = thread.secondMultipleValue();
                                SubLObject explanation_weights_23 = thread.thirdMultipleValue();
                                SubLObject problem_dictionaries_24 = thread.fourthMultipleValue();
                                SubLObject timed_outP_25 = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                explanation_strings = explanation_strings_21;
                                cycl_sentence_sets = cycl_sentence_sets_22;
                                explanation_weights = explanation_weights_23;
                                problem_dictionaries = problem_dictionaries_24;
                                timed_outP = timed_outP_25;
                            }
                        } finally {
                            pph_vars.$allow_utf8_in_pph_text_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != timed_outP) {
                    mysentient_utilities.myselog_warn($str_alt111$pph_explain_all_inference_answers);
                }
                {
                    SubLObject cdolist_list_var = cycl_sentence_sets;
                    SubLObject cycl_sentence_set = NIL;
                    for (cycl_sentence_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_sentence_set = cdolist_list_var.first()) {
                        {
                            SubLObject cycl_explanation_set = NIL;
                            SubLObject cdolist_list_var_26 = cycl_sentence_set;
                            SubLObject cycl_sentence = NIL;
                            for (cycl_sentence = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , cycl_sentence = cdolist_list_var_26.first()) {
                                if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject el_formula = uncanonicalizer.assertion_el_formula(cycl_sentence);
                                        SubLObject el_mt = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        cycl_explanation_set = cons(el_utilities.make_binary_formula($$ist_Asserted, el_formula, el_mt), cycl_explanation_set);
                                    }
                                } else
                                    if (NIL != el_utilities.el_formula_p(cycl_sentence)) {
                                        {
                                            SubLObject java_safe = cycl_utilities.hl_to_el(cycl_sentence);
                                            cycl_explanation_set = cons(java_safe, cycl_explanation_set);
                                        }
                                    }

                            }
                            cycl_explanation_set = nreverse(cycl_explanation_set);
                            cycl_explanation_sets = cons(cycl_explanation_set, cycl_explanation_sets);
                        }
                    }
                }
                cycl_explanation_sets = nreverse(cycl_explanation_sets);
                {
                    SubLObject ordered_explanations = NIL;
                    SubLObject explanation_string = NIL;
                    SubLObject explanation_string_27 = NIL;
                    SubLObject cycl_explanation_set = NIL;
                    SubLObject cycl_explanation_set_28 = NIL;
                    SubLObject explanation_weight = NIL;
                    SubLObject explanation_weight_29 = NIL;
                    SubLObject problem_dictionary = NIL;
                    SubLObject problem_dictionary_30 = NIL;
                    for (explanation_string = explanation_strings, explanation_string_27 = explanation_string.first(), cycl_explanation_set = cycl_explanation_sets, cycl_explanation_set_28 = cycl_explanation_set.first(), explanation_weight = explanation_weights, explanation_weight_29 = explanation_weight.first(), problem_dictionary = problem_dictionaries, problem_dictionary_30 = problem_dictionary.first(); !((((NIL == problem_dictionary) && (NIL == explanation_weight)) && (NIL == cycl_explanation_set)) && (NIL == explanation_string)); explanation_string = explanation_string.rest() , explanation_string_27 = explanation_string.first() , cycl_explanation_set = cycl_explanation_set.rest() , cycl_explanation_set_28 = cycl_explanation_set.first() , explanation_weight = explanation_weight.rest() , explanation_weight_29 = explanation_weight.first() , problem_dictionary = problem_dictionary.rest() , problem_dictionary_30 = problem_dictionary.first()) {
                        if (NIL == string_utilities.non_empty_stringP(explanation_string_27)) {
                            mysentient_utilities.myselog_warn(cconcatenate($str_alt113$Got_non_non_empty_string_, new SubLObject[]{ format_nil.format_nil_s_no_copy(explanation_string_27), $str_alt114$_as_answer__with_CycL_explanation, format_nil.format_nil_s_no_copy(cycl_explanation_set_28) }));
                        } else {
                            {
                                SubLObject utf8_explanation_string = explanation_string_27;
                                if (NIL == string_utilities.non_empty_stringP(utf8_explanation_string)) {
                                    mysentient_utilities.myselog_warn(cconcatenate($str_alt115$When_trying_to_convert_html_escap, new SubLObject[]{ format_nil.format_nil_s_no_copy(explanation_string_27), $str_alt116$_to_UTF8_string__got_bad_result__, format_nil.format_nil_s_no_copy(utf8_explanation_string) }));
                                } else {
                                    ordered_explanations = cons(list(utf8_explanation_string, cycl_explanation_set_28, explanation_weight_29), ordered_explanations);
                                }
                            }
                        }
                    }
                    ordered_explanations = Sort.sort(ordered_explanations, symbol_function($sym37$_), symbol_function(THIRD));
                    explanation_strings = Mapping.mapcar(FIRST, ordered_explanations);
                    cycl_explanation_sets = Mapping.mapcar(SECOND, ordered_explanations);
                    explanation_weights = Mapping.mapcar(THIRD, ordered_explanations);
                }
                return values(explanation_strings, cycl_explanation_sets, explanation_weights);
            }
        }
    }

    /**
     * Given an inference, report all inference answers that are relevant.
     */
    public static final SubLObject report_all_relevant_inference_answers(SubLObject inference, SubLObject nl_mt, SubLObject session_mt, SubLObject relevant_fn) {
        if (relevant_fn == UNPROVIDED) {
            relevant_fn = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        SubLTrampolineFile.checkType(nl_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(relevant_fn, FUNCTION_SPEC_P);
        {
            SubLObject start_time = get_universal_time();
            return report_all_relevant_inference_answers_int(inference, nl_mt, session_mt, relevant_fn, start_time);
        }
    }

    public static final SubLObject report_all_relevant_inference_answers_int(SubLObject inference, SubLObject nl_mt, SubLObject session_mt, SubLObject relevant_fn, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl_reports = NIL;
                SubLObject report_strings = NIL;
                SubLObject cycl_answers = NIL;
                SubLObject report_weights = NIL;
                SubLObject problem_dictionaries = NIL;
                SubLObject timed_outP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject interrupt_seconds = deductive_qa_paraphrase_interrupt_and_abort_seconds_from_now(start_time);
                    SubLObject abort_seconds = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    mysentient_utilities.myselog_info(cconcatenate($str_alt110$DQA_paraphrase_remaining_time__, new SubLObject[]{ format_nil.format_nil_a_no_copy(abort_seconds), $str_alt76$s__, format_nil.format_nil_a_no_copy(interrupt_seconds), $str_alt77$s_graceful_ }));
                    {
                        SubLObject _prev_bind_0 = pph_vars.$allow_utf8_in_pph_text_mode$.currentBinding(thread);
                        try {
                            pph_vars.$allow_utf8_in_pph_text_mode$.bind(T, thread);
                            thread.resetMultipleValues();
                            {
                                SubLObject report_strings_31 = pph_proof.pph_report_all_relevant_inference_answers(inference, relevant_fn, nl_mt, session_mt, $TEXT, interrupt_seconds, abort_seconds);
                                SubLObject cycl_answers_32 = thread.secondMultipleValue();
                                SubLObject report_weights_33 = thread.thirdMultipleValue();
                                SubLObject problem_dictionaries_34 = thread.fourthMultipleValue();
                                SubLObject timed_outP_35 = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                report_strings = report_strings_31;
                                cycl_answers = cycl_answers_32;
                                report_weights = report_weights_33;
                                problem_dictionaries = problem_dictionaries_34;
                                timed_outP = timed_outP_35;
                            }
                        } finally {
                            pph_vars.$allow_utf8_in_pph_text_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != timed_outP) {
                    mysentient_utilities.myselog_warn($str_alt122$pph_report_all_inference_answers_);
                }
                {
                    SubLObject cdolist_list_var = cycl_answers;
                    SubLObject cycl_answer = NIL;
                    for (cycl_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_answer = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.assertion_p(cycl_answer)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject el_formula = uncanonicalizer.assertion_el_formula(cycl_answer);
                                SubLObject el_mt = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cycl_reports = cons(el_utilities.make_binary_formula($$ist_Asserted, el_formula, el_mt), cycl_reports);
                            }
                        } else
                            if (NIL != cycl_grammar.cycl_term_p(cycl_answer)) {
                                {
                                    SubLObject java_safe = cycl_utilities.hl_to_el(cycl_answer);
                                    cycl_reports = cons(java_safe, cycl_reports);
                                }
                            }

                    }
                }
                cycl_reports = nreverse(cycl_reports);
                {
                    SubLObject ordered_reports = NIL;
                    SubLObject report_string = NIL;
                    SubLObject report_string_36 = NIL;
                    SubLObject cycl_report = NIL;
                    SubLObject cycl_report_37 = NIL;
                    SubLObject report_weight = NIL;
                    SubLObject report_weight_38 = NIL;
                    SubLObject problem_dictionary = NIL;
                    SubLObject problem_dictionary_39 = NIL;
                    for (report_string = report_strings, report_string_36 = report_string.first(), cycl_report = cycl_reports, cycl_report_37 = cycl_report.first(), report_weight = report_weights, report_weight_38 = report_weight.first(), problem_dictionary = problem_dictionaries, problem_dictionary_39 = problem_dictionary.first(); !((((NIL == problem_dictionary) && (NIL == report_weight)) && (NIL == cycl_report)) && (NIL == report_string)); report_string = report_string.rest() , report_string_36 = report_string.first() , cycl_report = cycl_report.rest() , cycl_report_37 = cycl_report.first() , report_weight = report_weight.rest() , report_weight_38 = report_weight.first() , problem_dictionary = problem_dictionary.rest() , problem_dictionary_39 = problem_dictionary.first()) {
                        if (NIL == string_utilities.non_empty_stringP(report_string_36)) {
                            mysentient_utilities.myselog_warn(cconcatenate($str_alt113$Got_non_non_empty_string_, new SubLObject[]{ format_nil.format_nil_s_no_copy(report_string_36), $str_alt123$_as_answer__with_CycL_report_, format_nil.format_nil_s_no_copy(cycl_report_37) }));
                        } else {
                            {
                                SubLObject utf8_report_string = report_string_36;
                                if (NIL == string_utilities.non_empty_stringP(utf8_report_string)) {
                                    mysentient_utilities.myselog_warn(cconcatenate($str_alt115$When_trying_to_convert_html_escap, new SubLObject[]{ format_nil.format_nil_s_no_copy(report_string_36), $str_alt116$_to_UTF8_string__got_bad_result__, format_nil.format_nil_s_no_copy(utf8_report_string) }));
                                } else {
                                    ordered_reports = cons(list(utf8_report_string, cycl_report_37, report_weight_38), ordered_reports);
                                }
                            }
                        }
                    }
                    ordered_reports = Sort.sort(ordered_reports, symbol_function($sym37$_), symbol_function(THIRD));
                    report_strings = Mapping.mapcar(FIRST, ordered_reports);
                    cycl_reports = Mapping.mapcar(SECOND, ordered_reports);
                    report_weights = Mapping.mapcar(THIRD, ordered_reports);
                }
                return values(report_strings, cycl_reports, report_weights);
            }
        }
    }

    /**
     *
     *
     * @return 0 integerp; the number of seconds after which a paraphrase should be gracefully interrupted.
     * @return 1 integerp; the number of seconds after which a paraphrase should be forcibly aborted.
     */
    public static final SubLObject deductive_qa_paraphrase_interrupt_and_abort_seconds_from_now(SubLObject start_time) {
        {
            SubLObject elapsed_seconds = subl_promotions.elapsed_universal_time(start_time, UNPROVIDED);
            SubLObject interrupt_seconds = max(ZERO_INTEGER, subtract($myse_dqa_paraphrase_interrupt_time$.getGlobalValue(), elapsed_seconds));
            SubLObject abort_seconds = max(ZERO_INTEGER, subtract($myse_dqa_paraphrase_abort_time$.getGlobalValue(), elapsed_seconds));
            return values(interrupt_seconds, abort_seconds);
        }
    }

    public static final SubLObject no_real_explanationP(SubLObject explanations) {
        return makeBoolean(((explanations.isList() && (NIL == explanations.first())) && (NIL == second(explanations))) && (NIL == third(explanations)));
    }

    // deflexical
    private static final SubLSymbol $mysentient_deductive_qa_query_folder_lock$ = makeSymbol("*MYSENTIENT-DEDUCTIVE-QA-QUERY-FOLDER-LOCK*");

    // deflexical
    private static final SubLSymbol $mysentient_deductive_qa_query_folder_initializedP$ = makeSymbol("*MYSENTIENT-DEDUCTIVE-QA-QUERY-FOLDER-INITIALIZED?*");

    // deflexical
    private static final SubLSymbol $mysentient_deductive_qa_default_query_folder$ = makeSymbol("*MYSENTIENT-DEDUCTIVE-QA-DEFAULT-QUERY-FOLDER*");

    /**
     * Initializes the inverted index with the root query folder.
     */
    public static final SubLObject identify_mysentient_deductive_qa_query_folder(SubLObject root_folder) {
        if (root_folder == UNPROVIDED) {
            root_folder = $mysentient_deductive_qa_default_query_folder$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(root_folder, FORT_P);
        {
            SubLObject lock = $mysentient_deductive_qa_query_folder_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $mysentient_deductive_qa_query_folder_initializedP$.setGlobalValue(NIL);
                inverted_index_query_library.clear_inverted_index();
                ql_index_support.index_queries_from_node(root_folder);
                $mysentient_deductive_qa_query_folder_initializedP$.setGlobalValue(T);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $mysentient_deductive_qa_query_folder_initializedP$.getGlobalValue();
    }

    /**
     * Use the Java fast check/slow recheck approach to make this relatively painless.
     */
    public static final SubLObject ensure_mysentient_deductive_qa_query_folder_initialized() {
        if (NIL == $mysentient_deductive_qa_query_folder_initializedP$.getGlobalValue()) {
            {
                SubLObject lock = $mysentient_deductive_qa_query_folder_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL == $mysentient_deductive_qa_query_folder_initializedP$.getGlobalValue()) {
                        identify_mysentient_deductive_qa_query_folder($mysentient_deductive_qa_default_query_folder$.getGlobalValue());
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
        }
        return $mysentient_deductive_qa_query_folder_initializedP$.getGlobalValue();
    }

    /**
     * Compute and rank the queries matching the words in the string.
     */
    public static final SubLObject identify_mysentient_parameterized_queries_matching_words(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        ensure_mysentient_deductive_qa_query_folder_initialized();
        mysentient_utilities.myselog_info(cconcatenate($str_alt131$Trolling_for_queries_that_match_, new SubLObject[]{ format_nil.format_nil_s_no_copy(string), $str_alt23$_ }));
        {
            SubLObject query_bundles = cae_query_search.indexed_queries_from_string_with_confidences(string, UNPROVIDED, UNPROVIDED);
            SubLObject test_query_bundles = NIL;
            SubLObject cdolist_list_var = query_bundles;
            SubLObject query_bundle = NIL;
            for (query_bundle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_bundle = cdolist_list_var.first()) {
                {
                    SubLObject datum = query_bundle;
                    SubLObject current = datum;
                    SubLObject query = NIL;
                    SubLObject confidence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    query = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    confidence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject test_query = query;
                            if (NIL != nart_handles.nart_p(query)) {
                                {
                                    SubLObject formula = narts_high.nart_el_formula(query);
                                    if ($$TemplateFromTestQueryFn == cycl_utilities.formula_arg0(formula)) {
                                        test_query = narts_high.find_nart(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                    }
                                }
                            }
                            mysentient_utilities.myselog_info(cconcatenate($str_alt134$Matched_to_test_, new SubLObject[]{ format_nil.format_nil_a_no_copy(test_query), $str_alt135$_with_confidence_, format_nil.format_nil_a_no_copy(confidence) }));
                            test_query_bundles = cons(list(test_query, confidence), test_query_bundles);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt132);
                    }
                }
            }
            return nreverse(test_query_bundles);
        }
    }

    public static final SubLObject declare_mysentient_deductive_qa_widgets_file() {
        declareFunction("perform_deductive_qa_and_explain", "PERFORM-DEDUCTIVE-QA-AND-EXPLAIN", 5, 0, false);
        declareFunction("perform_deductive_qa_and_explain_int", "PERFORM-DEDUCTIVE-QA-AND-EXPLAIN-INT", 6, 0, false);
        declareFunction("combine_confidence_and_weights", "COMBINE-CONFIDENCE-AND-WEIGHTS", 2, 0, false);
        declareFunction("combine_confidence_and_weight", "COMBINE-CONFIDENCE-AND-WEIGHT", 1, 0, false);
        declareFunction("explanation_info_emptyP", "EXPLANATION-INFO-EMPTY?", 3, 0, false);
        declareFunction("perform_and_explain_deductive_qa", "PERFORM-AND-EXPLAIN-DEDUCTIVE-QA", 3, 1, false);
        declareFunction("perform_and_explain_deductive_qa_int", "PERFORM-AND-EXPLAIN-DEDUCTIVE-QA-INT", 5, 0, false);
        declareFunction("perform_and_explain_deductive_qa_query", "PERFORM-AND-EXPLAIN-DEDUCTIVE-QA-QUERY", 2, 0, false);
        declareFunction("perform_and_explain_deductive_qa_query_int", "PERFORM-AND-EXPLAIN-DEDUCTIVE-QA-QUERY-INT", 3, 0, false);
        declareFunction("perform_deductive_qa_appropriate_response_query_and_explain", "PERFORM-DEDUCTIVE-QA-APPROPRIATE-RESPONSE-QUERY-AND-EXPLAIN", 3, 0, false);
        declareFunction("perform_deductive_qa_appropriate_response_query_and_explain_int", "PERFORM-DEDUCTIVE-QA-APPROPRIATE-RESPONSE-QUERY-AND-EXPLAIN-INT", 4, 0, false);
        declareFunction("perform_deductive_qa_interesting_sentence_query_and_explain", "PERFORM-DEDUCTIVE-QA-INTERESTING-SENTENCE-QUERY-AND-EXPLAIN", 3, 0, false);
        declareFunction("perform_deductive_qa_interesting_sentence_query_and_explain_int", "PERFORM-DEDUCTIVE-QA-INTERESTING-SENTENCE-QUERY-AND-EXPLAIN-INT", 4, 0, false);
        declareFunction("perform_deductive_qa_on_utterance_sentence_and_explain", "PERFORM-DEDUCTIVE-QA-ON-UTTERANCE-SENTENCE-AND-EXPLAIN", 3, 0, false);
        declareFunction("perform_deductive_qa_on_utterance_sentence_and_explain_int", "PERFORM-DEDUCTIVE-QA-ON-UTTERANCE-SENTENCE-AND-EXPLAIN-INT", 4, 0, false);
        declareFunction("deductive_qa_sentences_for_peg", "DEDUCTIVE-QA-SENTENCES-FOR-PEG", 2, 0, false);
        declareFunction("rank_deductive_qa_sentences_for_peg", "RANK-DEDUCTIVE-QA-SENTENCES-FOR-PEG", 2, 0, false);
        declareFunction("myse_dqa_strategy_default_confidence", "MYSE-DQA-STRATEGY-DEFAULT-CONFIDENCE", 2, 0, false);
        declareFunction("adjust_deductive_qa_sentence_temporally", "ADJUST-DEDUCTIVE-QA-SENTENCE-TEMPORALLY", 2, 0, false);
        declareFunction("perform_deductive_qa_on_sentence", "PERFORM-DEDUCTIVE-QA-ON-SENTENCE", 2, 1, false);
        declareFunction("perform_deductive_qa_on_sentence_int", "PERFORM-DEDUCTIVE-QA-ON-SENTENCE-INT", 4, 0, false);
        declareFunction("deductive_qa_continue_inference", "DEDUCTIVE-QA-CONTINUE-INFERENCE", 3, 0, false);
        declareFunction("compute_deductive_qa_inference_properties", "COMPUTE-DEDUCTIVE-QA-INFERENCE-PROPERTIES", 2, 0, false);
        declareFunction("deductive_qa_inference_interrupt_and_abort_seconds_from_now", "DEDUCTIVE-QA-INFERENCE-INTERRUPT-AND-ABORT-SECONDS-FROM-NOW", 1, 0, false);
        declareFunction("deductive_qa_max_transformation_depth_for_sentence", "DEDUCTIVE-QA-MAX-TRANSFORMATION-DEPTH-FOR-SENTENCE", 1, 0, false);
        declareFunction("deductive_qa_max_transformation_depth_for_pred", "DEDUCTIVE-QA-MAX-TRANSFORMATION-DEPTH-FOR-PRED", 1, 0, false);
        declareFunction("deductive_qa_removal_backtracking_productivity_limit_for_sentence", "DEDUCTIVE-QA-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT-FOR-SENTENCE", 1, 0, false);
        declareFunction("deductive_qa_removal_backtracking_productivity_limit_for_pred", "DEDUCTIVE-QA-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT-FOR-PRED", 1, 0, false);
        declareFunction("deductive_qa_appropriate_response_query_sentence", "DEDUCTIVE-QA-APPROPRIATE-RESPONSE-QUERY-SENTENCE", 1, 0, false);
        declareFunction("deductive_qa_interesting_sentence_query_sentence", "DEDUCTIVE-QA-INTERESTING-SENTENCE-QUERY-SENTENCE", 1, 0, false);
        declareFunction("deductive_qa_appropriate_response_query_properties", "DEDUCTIVE-QA-APPROPRIATE-RESPONSE-QUERY-PROPERTIES", 0, 0, false);
        declareFunction("deductive_qa_interesting_sentence_query_properties", "DEDUCTIVE-QA-INTERESTING-SENTENCE-QUERY-PROPERTIES", 0, 0, false);
        declareFunction("deductive_qa_on_information_behind_peg_sentence", "DEDUCTIVE-QA-ON-INFORMATION-BEHIND-PEG-SENTENCE", 1, 0, false);
        declareFunction("deductive_qa_on_information_behind_peg_properties", "DEDUCTIVE-QA-ON-INFORMATION-BEHIND-PEG-PROPERTIES", 1, 0, false);
        declareFunction("explain_inference_answer_with_proof", "EXPLAIN-INFERENCE-ANSWER-WITH-PROOF", 4, 0, false);
        declareFunction("explain_all_relevant_inference_answers", "EXPLAIN-ALL-RELEVANT-INFERENCE-ANSWERS", 3, 1, false);
        declareFunction("explain_all_relevant_inference_answers_int", "EXPLAIN-ALL-RELEVANT-INFERENCE-ANSWERS-INT", 5, 0, false);
        declareFunction("report_all_relevant_inference_answers", "REPORT-ALL-RELEVANT-INFERENCE-ANSWERS", 3, 1, false);
        declareFunction("report_all_relevant_inference_answers_int", "REPORT-ALL-RELEVANT-INFERENCE-ANSWERS-INT", 5, 0, false);
        declareFunction("deductive_qa_paraphrase_interrupt_and_abort_seconds_from_now", "DEDUCTIVE-QA-PARAPHRASE-INTERRUPT-AND-ABORT-SECONDS-FROM-NOW", 1, 0, false);
        declareFunction("no_real_explanationP", "NO-REAL-EXPLANATION?", 1, 0, false);
        declareFunction("identify_mysentient_deductive_qa_query_folder", "IDENTIFY-MYSENTIENT-DEDUCTIVE-QA-QUERY-FOLDER", 0, 1, false);
        declareFunction("ensure_mysentient_deductive_qa_query_folder_initialized", "ENSURE-MYSENTIENT-DEDUCTIVE-QA-QUERY-FOLDER-INITIALIZED", 0, 0, false);
        declareFunction("identify_mysentient_parameterized_queries_matching_words", "IDENTIFY-MYSENTIENT-PARAMETERIZED-QUERIES-MATCHING-WORDS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mysentient_deductive_qa_widgets_file() {
        deflexical("*MYSENTIENT-DEDUCTIVE-QA-STOP-AFTER-FIRST-SUCCESS?*", NIL);
        deflexical("*MYSE-DQA-INFERENCE-INTERRUPT-TIME*", TWENTY_INTEGER);
        deflexical("*MYSE-DQA-INFERENCE-ABORT-TIME*", $int$22);
        deflexical("*MYSE-DQA-PARAPHRASE-INTERRUPT-TIME*", $int$28);
        deflexical("*MYSE-DQA-PARAPHRASE-ABORT-TIME*", $int$29);
        deflexical("*MYSE-DQA-DEFAULT-CONFIDENCE*", $float$0_7);
        deflexical("*MYSE-MIN-QUERY-MATCHING-WEIGHT*", $float$0_2);
        deflexical("*MYSE-EXECUTE-QUERY-MATCHING-QA-STRATEGY*", NIL);
        deflexical("*DEFAULT-INTERESTING-SENTENCE-DEDUCTIVE-QA-CONFIDENCE*", NIL);
        defparameter("*DQA-CONFIDENCE*", $float$0_5);
        deflexical("*MYSENTIENT-DEDUCTIVE-QA-REASON-INTO-TEMPORAL-DIMENSIONS?*", T);
        deflexical("*MYSENTIENT-DEDUCTIVE-QA-SKSI-TRACE-LEVEL*", TWO_INTEGER);
        deflexical("*DEFAULT-DEDUCTIVE-QA-INFERENCE-PROPERTIES*", $list_alt79);
        deflexical("*DEDUCTIVE-QA-APPROPRIATE-RESPONSE-QUERY-SPEC*", $$MySe_AppropriateResponseQuery);
        deflexical("*DEDUCTIVE-QA-INTERESTING-SENTENCE-QUERY-SPEC*", $$MyS_InterestingSentence_DQAQuery);
        deflexical("*DEDUCTIVE-QA-ON-INFORMATION-BEHIND-VARIABLE*", $sym88$_INTERPRETATION);
        deflexical("*DEDUCTIVE-QA-ON-INFORMATION-BEHIND-PEG-QUERY*", list($$thereExists, $sym90$_PEG, list($$and, listS($$quotedIsa, $deductive_qa_on_information_behind_variable$.getGlobalValue(), $list_alt93), list($$pegCorrespondsToInfoTransfer, $sym90$_PEG, mysentient_utilities.$mysentient_utterance_peg_indexical$.getGlobalValue()), list($$parseTermForPeg, $sym90$_PEG, $deductive_qa_on_information_behind_variable$.getGlobalValue()))));
        deflexical("*MYSENTIENT-DEDUCTIVE-QA-QUERY-FOLDER-LOCK*", make_lock($$$Deductive_QA_Query_Folder_Lock));
        deflexical("*MYSENTIENT-DEDUCTIVE-QA-QUERY-FOLDER-INITIALIZED?*", NIL);
        deflexical("*MYSENTIENT-DEDUCTIVE-QA-DEFAULT-QUERY-FOLDER*", $$MySentientAuthoredPQsFolder);
        return NIL;
    }

    public static final SubLObject setup_mysentient_deductive_qa_widgets_file() {
                access_macros.register_external_symbol($myse_execute_query_matching_qa_strategy$);
        access_macros.register_external_symbol($default_interesting_sentence_deductive_qa_confidence$);
        utilities_macros.register_cyc_api_function(PERFORM_DEDUCTIVE_QA_AND_EXPLAIN, $list_alt11, $str_alt12$Wrapper_for_getting_some_answer_t, $list_alt13, $list_alt14);
        utilities_macros.register_cyc_api_function(PERFORM_AND_EXPLAIN_DEDUCTIVE_QA, $list_alt44, $str_alt45$Wrapper_for_doing_ASK_and_answer_, $list_alt46, $list_alt47);
        utilities_macros.register_cyc_api_function(PERFORM_AND_EXPLAIN_DEDUCTIVE_QA_QUERY, $list_alt50, $str_alt51$Wrapper_for_doing_ASK_of_query_an, $list_alt52, NIL);
        utilities_macros.register_cyc_api_function(PERFORM_DEDUCTIVE_QA_APPROPRIATE_RESPONSE_QUERY_AND_EXPLAIN, $list_alt54, $str_alt55$Wrapper_for_doing_the_deductive_Q, $list_alt56, NIL);
        utilities_macros.register_cyc_api_function(PERFORM_DEDUCTIVE_QA_INTERESTING_SENTENCE_QUERY_AND_EXPLAIN, $list_alt54, $str_alt55$Wrapper_for_doing_the_deductive_Q, $list_alt56, NIL);
        utilities_macros.register_cyc_api_function(PERFORM_DEDUCTIVE_QA_ON_UTTERANCE_SENTENCE_AND_EXPLAIN, $list_alt54, $str_alt59$Wrapper_for_doing_the_deductive_Q, $list_alt56, NIL);
        utilities_macros.register_cyc_api_function(PERFORM_DEDUCTIVE_QA_ON_SENTENCE, $list_alt66, $str_alt67$Perform_an_ask_and_return_the_app, $list_alt68, $list_alt69);
        utilities_macros.register_cyc_api_function(EXPLAIN_INFERENCE_ANSWER_WITH_PROOF, $list_alt100, $str_alt101$Given_an_inference_answer_and_its, $list_alt102, $list_alt103);
        utilities_macros.register_cyc_api_function(EXPLAIN_ALL_RELEVANT_INFERENCE_ANSWERS, $list_alt107, $str_alt108$Given_an_inference__explain_all_i, $list_alt109, NIL);
        utilities_macros.register_cyc_api_function(REPORT_ALL_RELEVANT_INFERENCE_ANSWERS, $list_alt107, $str_alt121$Given_an_inference__report_all_in, $list_alt109, NIL);
        utilities_macros.register_cyc_api_function(IDENTIFY_MYSENTIENT_DEDUCTIVE_QA_QUERY_FOLDER, $list_alt127, $str_alt128$Initializes_the_inverted_index_wi, $list_alt129, $list_alt130);
        utilities_macros.register_cyc_api_function(IDENTIFY_MYSENTIENT_PARAMETERIZED_QUERIES_MATCHING_WORDS, $list_alt137, $str_alt138$Compute_and_rank_the_queries_matc, $list_alt139, $list_alt140);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$22 = makeInteger(22);

    public static final SubLInteger $int$28 = makeInteger(28);

    public static final SubLInteger $int$29 = makeInteger(29);

    public static final SubLFloat $float$0_7 = makeDouble(0.7);

    public static final SubLFloat $float$0_2 = makeDouble(0.2);

    public static final SubLSymbol $myse_execute_query_matching_qa_strategy$ = makeSymbol("*MYSE-EXECUTE-QUERY-MATCHING-QA-STRATEGY*");

    public static final SubLSymbol $default_interesting_sentence_deductive_qa_confidence$ = makeSymbol("*DEFAULT-INTERESTING-SENTENCE-DEDUCTIVE-QA-CONFIDENCE*");







    private static final SubLSymbol PERFORM_DEDUCTIVE_QA_AND_EXPLAIN = makeSymbol("PERFORM-DEDUCTIVE-QA-AND-EXPLAIN");

    static private final SubLList $list_alt11 = list(makeSymbol("SENTENCE"), makeSymbol("SESSION-MT"), makeSymbol("NL-MT"), makeSymbol("STRING"), makeSymbol("UTTERANCE-PEG"));

    static private final SubLString $str_alt12$Wrapper_for_getting_some_answer_t = makeString("Wrapper for getting some answer to the user somehow.");

    static private final SubLList $list_alt13 = list(list(makeSymbol("SESSION-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SENTENCE"), list(makeSymbol("NIL-OR"), makeSymbol("CYCL-SENTENCE-P"))), list(makeSymbol("NL-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("STRING"), makeSymbol("STRINGP")));

    static private final SubLList $list_alt14 = list(list(makeSymbol("LIST"), makeSymbol("STRINGP")), makeSymbol("FLOATP"), list(makeSymbol("LIST"), makeSymbol("QUERY-SPECS")));

    static private final SubLString $str_alt15$See_if_there_is_a_workable_CycL_s = makeString("See if there is a workable CycL sentence on the peg ");

    public static final SubLObject $const16$MyS_AnswerUserQuestion_DQAStrateg = constant_handles.reader_make_constant_shell(makeString("MyS-AnswerUserQuestion-DQAStrategy"));

    static private final SubLString $str_alt17$_is_not_a_valid_utterance_peg__so = makeString(" is not a valid utterance peg, so we're aborting the DQA strategy of asking the CycL sentence associated with the peg.");

    static private final SubLString $str_alt18$Trying_to_see_if_the_CycL_sentenc = makeString("Trying to see if the CycL sentence ");

    static private final SubLString $str_alt19$_will_get_us_somewhere_ = makeString(" will get us somewhere.");

    static private final SubLString $str_alt20$There_was_no_CycL_sentence_provid = makeString("There was no CycL sentence provided to use.");

    public static final SubLObject $const21$MyS_AnswerMatchedQuery_DQAStrateg = constant_handles.reader_make_constant_shell(makeString("MyS-AnswerMatchedQuery-DQAStrategy"));

    static private final SubLString $str_alt22$Checking_to_see_whether_there_are = makeString("Checking to see whether there are parameterized queries triggered by the words in ");

    static private final SubLString $str_alt23$_ = makeString(".");

    static private final SubLString $str_alt24$Query_ = makeString("Query ");

    static private final SubLString $str_alt25$_had_too_low_a_weight_to_bother_w = makeString(" had too low a weight to bother with: ");

    static private final SubLString $str_alt26$Trying_parameterized_query_ = makeString("Trying parameterized query ");

    static private final SubLString $str_alt27$Save_query_spec_ = makeString("Save query-spec ");

    static private final SubLString $str_alt28$_for_later_ = makeString(" for later.");

    static private final SubLString $str_alt29$No_parameterized_queries_were_fou = makeString("No parameterized queries were found.");

    static private final SubLString $str_alt30$See_if_we_can_generate_an_appropr = makeString("See if we can generate an appropriate response to peg ");

    public static final SubLObject $$BeResponsive_DQAStrategy = constant_handles.reader_make_constant_shell(makeString("BeResponsive-DQAStrategy"));

    static private final SubLString $str_alt32$There_was_no_peg_for_us_to_try_an = makeString("There was no peg for us to try an appropriate response query with.");

    static private final SubLString $str_alt33$See_if_we_can_generate_interestin = makeString("See if we can generate interesting sentences about things mentioned in ");

    public static final SubLObject $const34$MyS_InterestingSentence_DQAStrate = constant_handles.reader_make_constant_shell(makeString("MyS-InterestingSentence-DQAStrategy"));

    static private final SubLString $str_alt35$There_was_no_peg_for_us_to_try_an = makeString("There was no peg for us to try an interesting sentence query with.");

    public static final SubLFloat $float$0_0 = makeDouble(0.0);

    static private final SubLSymbol $sym37$_ = makeSymbol(">");

    static private final SubLString $str_alt38$DQA_returning__A_answer_P_ = makeString("DQA returning ~A answer~P.");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol COMBINE_CONFIDENCE_AND_WEIGHT = makeSymbol("COMBINE-CONFIDENCE-AND-WEIGHT");

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    public static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol PERFORM_AND_EXPLAIN_DEDUCTIVE_QA = makeSymbol("PERFORM-AND-EXPLAIN-DEDUCTIVE-QA");

    static private final SubLList $list_alt44 = list(makeSymbol("SENTENCE"), makeSymbol("SESSION-MT"), makeSymbol("NL-MT"), makeSymbol("&OPTIONAL"), makeSymbol("INFERENCE-PROPERTIES"));

    static private final SubLString $str_alt45$Wrapper_for_doing_ASK_and_answer_ = makeString("Wrapper for doing ASK and answer generation together.");

    static private final SubLList $list_alt46 = list(list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SENTENCE-P")), list(makeSymbol("SESSION-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("NL-MT"), makeSymbol("POSSIBLY-HLMT-P")));

    static private final SubLList $list_alt47 = list(list(makeSymbol("LIST"), makeSymbol("STRINGP")), list(makeSymbol("LIST"), makeSymbol("LISTP")), list(makeSymbol("LIST"), makeSymbol("FLOATP")));



    private static final SubLSymbol PERFORM_AND_EXPLAIN_DEDUCTIVE_QA_QUERY = makeSymbol("PERFORM-AND-EXPLAIN-DEDUCTIVE-QA-QUERY");

    static private final SubLList $list_alt50 = list(makeSymbol("QUERY-SPEC"), makeSymbol("NL-MT"));

    static private final SubLString $str_alt51$Wrapper_for_doing_ASK_of_query_an = makeString("Wrapper for doing ASK of query and explanation together.");

    static private final SubLList $list_alt52 = list(list(makeSymbol("QUERY-SPEC"), makeSymbol("FORT-P")), list(makeSymbol("NL-MT"), makeSymbol("POSSIBLY-HLMT-P")));

    private static final SubLSymbol PERFORM_DEDUCTIVE_QA_APPROPRIATE_RESPONSE_QUERY_AND_EXPLAIN = makeSymbol("PERFORM-DEDUCTIVE-QA-APPROPRIATE-RESPONSE-QUERY-AND-EXPLAIN");

    static private final SubLList $list_alt54 = list(makeSymbol("UTTERANCE-PEG"), makeSymbol("SESSION-MT"), makeSymbol("NL-MT"));

    static private final SubLString $str_alt55$Wrapper_for_doing_the_deductive_Q = makeString("Wrapper for doing the deductive QA ask on an utterance and then explaining the result.");

    static private final SubLList $list_alt56 = list(list(makeSymbol("UTTERANCE-PEG"), makeSymbol("FORT-P")), list(makeSymbol("SESSION-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("NL-MT"), makeSymbol("POSSIBLY-HLMT-P")));

    private static final SubLSymbol PERFORM_DEDUCTIVE_QA_INTERESTING_SENTENCE_QUERY_AND_EXPLAIN = makeSymbol("PERFORM-DEDUCTIVE-QA-INTERESTING-SENTENCE-QUERY-AND-EXPLAIN");

    private static final SubLSymbol PERFORM_DEDUCTIVE_QA_ON_UTTERANCE_SENTENCE_AND_EXPLAIN = makeSymbol("PERFORM-DEDUCTIVE-QA-ON-UTTERANCE-SENTENCE-AND-EXPLAIN");

    static private final SubLString $str_alt59$Wrapper_for_doing_the_deductive_Q = makeString("Wrapper for doing the deductive QA ask on the sentence of the main utterance \n   and then explaining the result.");

    public static final SubLObject $$MtSpace = constant_handles.reader_make_constant_shell(makeString("MtSpace"));

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    static private final SubLList $list_alt62 = list(constant_handles.reader_make_constant_shell(makeString("AnytimePSC")));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLSymbol PERFORM_DEDUCTIVE_QA_ON_SENTENCE = makeSymbol("PERFORM-DEDUCTIVE-QA-ON-SENTENCE");

    static private final SubLList $list_alt66 = list(makeSymbol("SENTENCE"), makeSymbol("ELMT"), makeSymbol("&OPTIONAL"), makeSymbol("INFERENCE-PROPERTIES"));

    static private final SubLString $str_alt67$Perform_an_ask_and_return_the_app = makeString("Perform an ask and return the appropriate objects.");

    static private final SubLList $list_alt68 = list(list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SENTENCE-P")), list(makeSymbol("ELMT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("INFERENCE-PROPERTIES"), makeSymbol("LISTP")));

    static private final SubLList $list_alt69 = list(makeSymbol("INFERENCE-P"));

    static private final SubLString $str_alt70$Asking_sentence_ = makeString("Asking sentence ");

    static private final SubLString $str_alt71$Asking_in_ELMt_ = makeString("Asking in ELMt ");

    static private final SubLString $str_alt72$Static_properties__ = makeString("Static properties: ");

    static private final SubLString $str_alt73$This_inference_invoked_no_SKSI_ca = makeString("This inference invoked no SKSI capabilities.");



    static private final SubLString $str_alt75$DQA_inference_remaining_time__ = makeString("DQA inference remaining time: ");

    static private final SubLString $str_alt76$s__ = makeString("s (");

    static private final SubLString $str_alt77$s_graceful_ = makeString("s graceful)");

    static private final SubLString $str_alt78$This_inference_was_forcibly_abort = makeString("This inference was forcibly aborted after overrunning its time budget.");

    static private final SubLList $list_alt79 = list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("BROWSABLE?"), NIL);

    static private final SubLString $str_alt80$Max_transformation_depth_initiall = makeString("Max transformation depth initially set to ");

    static private final SubLString $str_alt81$_via___mySentientDQAMaxTransforma = makeString(" via #$mySentientDQAMaxTransformationDepthForPred");

    static private final SubLString $str_alt82$No___mySentientDQAMaxTransformati = makeString("No #$mySentientDQAMaxTransformationDepthForPred applicable, using default");

    private static final SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

    public static final SubLObject $const84$mySentientDQAMaxTransformationDep = constant_handles.reader_make_constant_shell(makeString("mySentientDQAMaxTransformationDepthForPred"));

    public static final SubLObject $const85$mySentientDQARemovalBacktrackingP = constant_handles.reader_make_constant_shell(makeString("mySentientDQARemovalBacktrackingProductivityLimitForPred"));

    public static final SubLObject $$MySe_AppropriateResponseQuery = constant_handles.reader_make_constant_shell(makeString("MySe-AppropriateResponseQuery"));

    public static final SubLObject $$MyS_InterestingSentence_DQAQuery = constant_handles.reader_make_constant_shell(makeString("MyS-InterestingSentence-DQAQuery"));

    static private final SubLSymbol $sym88$_INTERPRETATION = makeSymbol("?INTERPRETATION");

    public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

    static private final SubLSymbol $sym90$_PEG = makeSymbol("?PEG");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));

    static private final SubLList $list_alt93 = list(constant_handles.reader_make_constant_shell(makeString("CycLSentence-Askable")));

    public static final SubLObject $$pegCorrespondsToInfoTransfer = constant_handles.reader_make_constant_shell(makeString("pegCorrespondsToInfoTransfer"));

    public static final SubLObject $$parseTermForPeg = constant_handles.reader_make_constant_shell(makeString("parseTermForPeg"));







    private static final SubLSymbol EXPLAIN_INFERENCE_ANSWER_WITH_PROOF = makeSymbol("EXPLAIN-INFERENCE-ANSWER-WITH-PROOF");

    static private final SubLList $list_alt100 = list(makeSymbol("INFERENCE-ANSWER"), makeSymbol("PROOF"), makeSymbol("SESSION-MT"), makeSymbol("NL-MT"));

    static private final SubLString $str_alt101$Given_an_inference_answer_and_its = makeString("Given an inference answer and its proof, provide an explanation of the\n   answer using the proof.");

    static private final SubLList $list_alt102 = list(list(makeSymbol("INFERENCE-ANSWER"), makeSymbol("INFERENCE-ANSWER-P")), list(makeSymbol("PROOF"), makeSymbol("PROOF-P")));

    static private final SubLList $list_alt103 = list(makeSymbol("STRINGP"));





    private static final SubLSymbol EXPLAIN_ALL_RELEVANT_INFERENCE_ANSWERS = makeSymbol("EXPLAIN-ALL-RELEVANT-INFERENCE-ANSWERS");

    static private final SubLList $list_alt107 = list(makeSymbol("INFERENCE"), makeSymbol("NL-MT"), makeSymbol("SESSION-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("RELEVANT-FN"), list(makeSymbol("FUNCTION"), IDENTITY)));

    static private final SubLString $str_alt108$Given_an_inference__explain_all_i = makeString("Given an inference, explain all inference answers that are relevant.");

    static private final SubLList $list_alt109 = list(list(makeSymbol("INFERENCE"), makeSymbol("INFERENCE-P")), list(makeSymbol("NL-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SESSION-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("RELEVANT-FN"), makeSymbol("FUNCTION-SPEC-P")));

    static private final SubLString $str_alt110$DQA_paraphrase_remaining_time__ = makeString("DQA paraphrase remaining time: ");

    static private final SubLString $str_alt111$pph_explain_all_inference_answers = makeString("pph-explain-all-inference-answers-for-best-proofs timed out.");

    public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));

    static private final SubLString $str_alt113$Got_non_non_empty_string_ = makeString("Got non-non-empty-string ");

    static private final SubLString $str_alt114$_as_answer__with_CycL_explanation = makeString(" as answer, with CycL explanation ");

    static private final SubLString $str_alt115$When_trying_to_convert_html_escap = makeString("When trying to convert html-escaped string ");

    static private final SubLString $str_alt116$_to_UTF8_string__got_bad_result__ = makeString(" to UTF8 string, got bad result: ");







    private static final SubLSymbol REPORT_ALL_RELEVANT_INFERENCE_ANSWERS = makeSymbol("REPORT-ALL-RELEVANT-INFERENCE-ANSWERS");

    static private final SubLString $str_alt121$Given_an_inference__report_all_in = makeString("Given an inference, report all inference answers that are relevant.");

    static private final SubLString $str_alt122$pph_report_all_inference_answers_ = makeString("pph-report-all-inference-answers-for-best-proofs timed out.");

    static private final SubLString $str_alt123$_as_answer__with_CycL_report_ = makeString(" as answer, with CycL report ");

    static private final SubLString $$$Deductive_QA_Query_Folder_Lock = makeString("Deductive QA Query Folder Lock");

    public static final SubLObject $$MySentientAuthoredPQsFolder = constant_handles.reader_make_constant_shell(makeString("MySentientAuthoredPQsFolder"));

    private static final SubLSymbol IDENTIFY_MYSENTIENT_DEDUCTIVE_QA_QUERY_FOLDER = makeSymbol("IDENTIFY-MYSENTIENT-DEDUCTIVE-QA-QUERY-FOLDER");

    static private final SubLList $list_alt127 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ROOT-FOLDER"), makeSymbol("*MYSENTIENT-DEDUCTIVE-QA-DEFAULT-QUERY-FOLDER*")));

    static private final SubLString $str_alt128$Initializes_the_inverted_index_wi = makeString("Initializes the inverted index with the root query folder.");

    static private final SubLList $list_alt129 = list(list(makeSymbol("ROOT-FOLDER"), makeSymbol("FORT-P")));

    static private final SubLList $list_alt130 = list(makeSymbol("SYMBOLP"));

    static private final SubLString $str_alt131$Trolling_for_queries_that_match_ = makeString("Trolling for queries that match ");

    static private final SubLList $list_alt132 = list(makeSymbol("QUERY"), makeSymbol("CONFIDENCE"));

    public static final SubLObject $$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell(makeString("TemplateFromTestQueryFn"));

    static private final SubLString $str_alt134$Matched_to_test_ = makeString("Matched to test ");

    static private final SubLString $str_alt135$_with_confidence_ = makeString(" with confidence ");

    private static final SubLSymbol IDENTIFY_MYSENTIENT_PARAMETERIZED_QUERIES_MATCHING_WORDS = makeSymbol("IDENTIFY-MYSENTIENT-PARAMETERIZED-QUERIES-MATCHING-WORDS");

    static private final SubLList $list_alt137 = list(makeSymbol("STRING"));

    static private final SubLString $str_alt138$Compute_and_rank_the_queries_matc = makeString("Compute and rank the queries matching the words in the string.");

    static private final SubLList $list_alt139 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")));

    static private final SubLList $list_alt140 = list(makeSymbol("LISTP"));

    // // Initializers
    public void declareFunctions() {
        declare_mysentient_deductive_qa_widgets_file();
    }

    public void initializeVariables() {
        init_mysentient_deductive_qa_widgets_file();
    }

    public void runTopLevelForms() {
        setup_mysentient_deductive_qa_widgets_file();
    }
}

