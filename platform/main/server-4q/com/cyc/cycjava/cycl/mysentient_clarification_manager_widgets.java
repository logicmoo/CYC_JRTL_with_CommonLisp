/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-CLARIFICATION-MANAGER-WIDGETS
 *  source file: /cyc/top/cycl/mysentient-clarification-manager-widgets.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class mysentient_clarification_manager_widgets extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_clarification_manager_widgets() {
    }

    public static final SubLFile me = new mysentient_clarification_manager_widgets();






    public static final SubLObject set_max_clarification_questions(SubLObject max) {
        SubLSystemTrampolineFile.checkType(max, NON_NEGATIVE_INTEGER_P);
        $max_clarification_questions$.setGlobalValue(max);
        return NIL;
    }

    /**
     * What's the maximum number of clarification questions to generate in one go?
     */
    public static final SubLObject max_clarification_questions() {
        return $max_clarification_questions$.getGlobalValue();
    }

    /**
     * Execute clarification strategies (excluding ones that are executed elsewhere).
     *
     * @return listp of up to MAX-NUMBER mysentient-clarification-question-spec-p's
     */
    public static final SubLObject mysentient_cm_execute_strategies(SubLObject utterance_peg, SubLObject user, SubLObject session_mt, SubLObject generation_mt, SubLObject max_number) {
        SubLSystemTrampolineFile.checkType(utterance_peg, FORT_P);
        SubLSystemTrampolineFile.checkType(user, FORT_P);
        SubLSystemTrampolineFile.checkType(session_mt, MICROTHEORY_P);
        SubLSystemTrampolineFile.checkType(generation_mt, MICROTHEORY_P);
        SubLSystemTrampolineFile.checkType(max_number, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject question_specs = NIL;
            SubLObject strategies_that_return_yes_no_questions = list($const9$SuggestApplicableSubtopics_Clarif, $const10$AskProfilingQuestionBasedOnSubExp);
            SubLObject rest = NIL;
            for (rest = strategies_that_return_yes_no_questions; !((NIL != subl_promotions.non_positive_integer_p(max_number)) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject strategy = rest.first();
                    SubLObject new_question_specs = execute_strategy_that_returns_yes_no_questions(strategy, utterance_peg, user, session_mt, generation_mt, max_number);
                    max_number = subtract(max_number, length(new_question_specs));
                    question_specs = append(question_specs, new_question_specs);
                }
            }
            return question_specs;
        }
    }

    public static final SubLObject execute_strategy_that_returns_yes_no_questions(SubLObject strategy, SubLObject utterance_peg, SubLObject user, SubLObject session_mt, SubLObject generation_mt, SubLObject max_number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = candidate_clarification_questions(utterance_peg, strategy, session_mt, list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, max_number));
                SubLObject confidence = myse_cm_strategy_default_confidence(strategy, session_mt);
                SubLObject question_specs = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_speaker$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_addressee$.currentBinding(thread);
                    try {
                        pph_vars.$pph_speaker$.bind(pph_vars.$pph_speaker$.getDynamicValue(thread), thread);
                        pph_vars.$pph_addressee$.bind(user, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject _prev_bind_0_1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                {
                                    SubLObject reuseP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    try {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                {
                                                    SubLObject new_or_reused = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject _prev_bind_0_3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                            {
                                                                SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                {
                                                                    SubLObject _prev_bind_0_4 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                    try {
                                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                                        {
                                                                            final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                                                            try {
                                                                                {
                                                                                    SubLObject cdolist_list_var = sentences;
                                                                                    SubLObject sentence = NIL;
                                                                                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject question_spec = yes_no_question_cycl_to_clarification_question_spec(sentence, generation_mt, session_mt, confidence);
                                                                                            question_specs = cons(question_spec, question_specs);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_4, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_3, thread);
                                                        }
                                                    }
                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                    } finally {
                        pph_vars.$pph_addressee$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_speaker$.rebind(_prev_bind_0, thread);
                    }
                }
                mysentient_utilities.filter_unacceptable_mysentient_nl_strings(question_specs, symbol_function(MYSENTIENT_CLARIFICATION_QUESTION_SPEC_QUESTION_PPH));
                return question_specs;
            }
        }
    }

    public static final SubLObject yes_no_question_cycl_to_clarification_question_spec(SubLObject question_cycl, SubLObject generation_mt, SubLObject session_mt, SubLObject confidence) {
        {
            SubLObject question_pph = pph_question.generate_question(question_cycl, generation_mt, session_mt, UNPROVIDED, UNPROVIDED);
            SubLObject yes_choice = list(question_cycl, $$$yes);
            SubLObject no_choice = list(el_utilities.make_unary_formula($$not, question_cycl), $$$no);
            SubLObject choices = list(yes_choice, no_choice);
            return make_clarification_question_spec(question_cycl, question_pph, confidence, choices, $str_alt24$applicable_subtopic);
        }
    }

    public static final SubLObject myse_cm_strategy_default_confidence(SubLObject strategy, SubLObject session_mt) {
        return mysentient_utilities.myse_strategy_default_confidence(strategy, session_mt, $mys_cm_arbitrary_confidence$.getGlobalValue());
    }

    /**
     * Generate questions asking the user to disambiguate between the multiple interpretations of ambiguous sub-expressions
     * of their utterance UTTERANCE-PEG.
     *
     * @return listp of up to MAX-NUMBER mysentient-clarification-question-spec-p's
     */
    public static final SubLObject mysentient_cm_generate_disambiguation_clarifications(SubLObject utterance_peg, SubLObject utterance_is_questionP, SubLObject session_mt, SubLObject generation_mt, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = THREE_INTEGER;
        }
        SubLSystemTrampolineFile.checkType(utterance_peg, CYCL_TERM_P);
        SubLSystemTrampolineFile.checkType(utterance_is_questionP, BOOLEANP);
        SubLSystemTrampolineFile.checkType(session_mt, MICROTHEORY_P);
        SubLSystemTrampolineFile.checkType(generation_mt, MICROTHEORY_P);
        SubLSystemTrampolineFile.checkType(max_number, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject question_specs = NIL;
            {
                SubLObject true_disambiguation_strategies = list($const27$SubPegDisambiguation_Clarificatio, $const28$UtteranceDisambiguation_Clarifica);
                SubLObject new_question_specs = execute_disambiguation_strategies(utterance_peg, true_disambiguation_strategies, utterance_is_questionP, session_mt, generation_mt, max_number, TWO_INTEGER);
                max_number = subtract(max_number, length(new_question_specs));
                question_specs = append(question_specs, new_question_specs);
            }
            if (NIL != subl_promotions.positive_integer_p(max_number)) {
                {
                    SubLObject other_disambiguation_strategies = list($const29$ProposeSentenceFromPartialParseIn);
                    SubLObject new_question_specs = execute_disambiguation_strategies(utterance_peg, other_disambiguation_strategies, utterance_is_questionP, session_mt, generation_mt, max_number, ONE_INTEGER);
                    question_specs = append(question_specs, new_question_specs);
                }
            }
            return question_specs;
        }
    }

    public static final SubLObject execute_disambiguation_strategies(SubLObject utterance_peg, SubLObject disambiguation_strategies, SubLObject utterance_is_questionP, SubLObject session_mt, SubLObject generation_mt, SubLObject max_number, SubLObject min_answer_choices) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_var = $sym34$_WHAT;
                SubLObject result = NIL;
                SubLObject done_count = ZERO_INTEGER;
                SubLObject rest = NIL;
                for (rest = disambiguation_strategies; !(done_count.numGE(max_number) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject strategy = rest.first();
                        SubLObject question_answers_dictionary = execute_disambiguation_strategy_int(utterance_peg, strategy, el_var, session_mt, subtract(max_number, done_count));
                        SubLObject confidence = myse_cm_strategy_default_confidence(strategy, session_mt);
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(question_answers_dictionary));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_question = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject answers = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject ambiguous_expression = cycl_utilities.formula_arg1(v_question, UNPROVIDED);
                                    SubLObject generate_as_questionP = generate_disambiguation_options_as_questionsP(ambiguous_expression, utterance_is_questionP);
                                    SubLObject expression_string = mysentient_user_profile_manager_widgets.mention_string(ambiguous_expression, session_mt);
                                    SubLObject question_pph = cconcatenate($str_alt35$What_did_you_mean_by__, new SubLObject[]{ expression_string, $str_alt36$__ });
                                    SubLObject nl_preds_for_answer_pphs = nl_preds_for_expression_peg_clarification(ambiguous_expression, session_mt, generate_as_questionP);
                                    SubLObject force = (NIL != generate_as_questionP) ? ((SubLObject) ($INTERROGATIVE)) : $DEFAULT;
                                    SubLObject answer_choices = make_clarification_answer_choices(v_question, el_var, answers, session_mt, generation_mt, nl_preds_for_answer_pphs, force, expression_string);
                                    if (NIL != list_utilities.lengthL(answer_choices, min_answer_choices, UNPROVIDED)) {
                                        mysentient_utilities.myselog_warn(cconcatenate($str_alt39$Suppressing_disambiguation_of_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ambiguous_expression), $str_alt40$_because_there_are_less_than_, format_nil.format_nil_s_no_copy(min_answer_choices), $str_alt41$_successfully_paraphrased_answer_ }));
                                    } else {
                                        {
                                            SubLObject question_spec = make_clarification_question_spec(v_question, question_pph, confidence, answer_choices, $$$disambiguation);
                                            result = cons(question_spec, result);
                                            done_count = add(done_count, ONE_INTEGER);
                                        }
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     *
     *
     * @return dictionary-p mapping disambiguation question to a list of its answers
     */
    public static final SubLObject execute_disambiguation_strategy_int(SubLObject utterance_peg, SubLObject strategy, SubLObject el_var, SubLObject session_mt, SubLObject max_number) {
        return execute_strategy_that_returns_merged_questions_and_answers(strategy, utterance_peg, dictionary.new_dictionary(symbol_function(EQUAL), max(max_number, FIVE_INTEGER)), el_var, session_mt, max_number, UNPROVIDED);
    }

    public static final SubLObject execute_strategy_that_returns_merged_questions_and_answers(SubLObject strategy, SubLObject utterance_peg, SubLObject question_answers_dictionary, SubLObject el_var, SubLObject session_mt, SubLObject max_number, SubLObject answer_arg) {
        if (answer_arg == UNPROVIDED) {
            answer_arg = TWO_INTEGER;
        }
        {
            SubLObject sentences = candidate_clarification_questions(utterance_peg, strategy, session_mt, list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER));
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                {
                    SubLObject v_answer = cycl_utilities.formula_arg(sentence, answer_arg, UNPROVIDED);
                    SubLObject v_question = el_utilities.replace_formula_arg(answer_arg, el_var, sentence);
                    if (dictionary.dictionary_length(question_answers_dictionary).numL(max_number) || (NIL != dictionary_utilities.dictionary_has_keyP(question_answers_dictionary, v_question))) {
                        dictionary_utilities.dictionary_push(question_answers_dictionary, v_question, v_answer);
                    }
                }
            }
        }
        return question_answers_dictionary;
    }

    public static final SubLObject generate_disambiguation_options_as_questionsP(SubLObject ambiguous_expression, SubLObject entire_utterance_is_questionP) {
        return makeBoolean((NIL != entire_utterance_is_questionP) && (NIL != utterance_peg_p(ambiguous_expression)));
    }

    public static final SubLObject utterance_peg_p(SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $const43$LinguisticExpressionPeg_CompleteU);
    }

    /**
     * Get the customer-defined redirects that apply based on UTTERANCE-PEG, sorted by topic.
     *
     * @return listp; each of whose elements is a doubleton? of the form (TOPIC REDIRECTS);
    where TOPIC is a doubleton? of the form (TOPIC-CYCL TOPIC-NL)
    where TOPIC-CYCL is a cycl-term-p
    TOPIC-NL is a stringp; a natural-language paraphrase of TOPIC-CYCL
    REDIRECTS is a listp of triple? of the form (URL-STRING LINK-TEXT CONFIDENCE)
    where URL-STRING is a stringp
    LINK-TEXT is a stringp
    CONFIDENCE is a numberp between 0 and 1
     * @unknown (applicable-user-redirects #$MyS-HowMuchShouldIFeedMyDogExpPeg #$MySeAnswersSession-DaveS-001 #$MySeGenerationMt-DaveS)
    => (((#$Dog ``dog'')
    ((``www.purina.com/puppy-chow.html'' ``Buy tasty dog food!'' 0.9)
    (``www.aspca.com/spay-or-neuter.html'' ``Have you considered spaying or neutering your pet?'' 0.65))))
     */
    public static final SubLObject applicable_user_redirects(SubLObject utterance_peg, SubLObject session_mt, SubLObject generation_mt, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(utterance_peg, CYCL_TERM_P);
            SubLSystemTrampolineFile.checkType(session_mt, MICROTHEORY_P);
            SubLSystemTrampolineFile.checkType(generation_mt, MICROTHEORY_P);
            {
                SubLObject redirects = get_applicable_user_redirects_as_quadruples(utterance_peg, session_mt, max_number);
                SubLObject result_dict = dictionary.new_dictionary(symbol_function(EQUAL), ONE_INTEGER);
                SubLObject result = NIL;
                {
                    SubLObject cdolist_list_var = redirects;
                    SubLObject redirect = NIL;
                    for (redirect = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , redirect = cdolist_list_var.first()) {
                        {
                            SubLObject datum = redirect;
                            SubLObject current = datum;
                            SubLObject topic = NIL;
                            SubLObject redirect_minus_topic = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt44);
                            topic = current.first();
                            current = current.rest();
                            redirect_minus_topic = current;
                            dictionary_utilities.dictionary_push(result_dict, topic, redirect_minus_topic);
                        }
                    }
                }
                {
                    SubLObject topics = NIL;
                    SubLObject redirects_for_topics = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(result_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject topic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject redirects_for_topic = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            topics = cons(topic, topics);
                            redirects_for_topics = cons(redirects_for_topic, redirects_for_topics);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    thread.resetMultipleValues();
                    {
                        SubLObject topics_paraphrased = mysentient_utilities.filter_unacceptable_mysentient_nl_strings(pph_main.generate_disambiguation_phrases(topics, $NONE, $ANY, generation_mt, session_mt, UNPROVIDED, UNPROVIDED), symbol_function(SECOND));
                        SubLObject removed_indices = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject filtered_redirects = copy_list(redirects_for_topics);
                            SubLObject cdolist_list_var = removed_indices;
                            SubLObject index = NIL;
                            for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                                filtered_redirects = list_utilities.delete_nth(index, filtered_redirects);
                            }
                            result = list_utilities.make_pair_list(topics_paraphrased, filtered_redirects);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject get_applicable_user_redirects_as_quadruples(SubLObject utterance_peg, SubLObject session_mt, SubLObject max_number) {
        {
            SubLObject strategy = $const53$SuggestUserRedirects_Clarificatio;
            SubLObject sentences = candidate_clarification_questions(utterance_peg, strategy, session_mt, list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, max_number));
            SubLObject confidence = myse_cm_strategy_default_confidence(strategy, session_mt);
            SubLObject redirects = Mapping.mapcar(symbol_function(FORMULA_ARG1), sentences);
            SubLObject quadruples = NIL;
            SubLObject cdolist_list_var = redirects;
            SubLObject redirect = NIL;
            for (redirect = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , redirect = cdolist_list_var.first()) {
                {
                    SubLObject triple = redirect_to_topic_url_linktext_triple(redirect, session_mt);
                    if (NIL != triple) {
                        quadruples = cons(list_utilities.snoc(confidence, triple), quadruples);
                    }
                }
            }
            return nreverse(quadruples);
        }
    }

    public static final SubLObject redirect_to_topic_url_linktext_triple(SubLObject redirect, SubLObject mt) {
        {
            SubLObject query_result = mysentient_utilities.myse_query_template($list_alt55, list($$and, listS($$userRedirectURL, redirect, $list_alt58), listS($$userRedirectLinkText, redirect, $list_alt60), listS($$userRedirectMainTopic, redirect, $list_alt62)), mt, $list_alt63);
            return NIL != list_utilities.non_empty_list_p(query_result) ? ((SubLObject) (query_result.first())) : NIL;
        }
    }

    /**
     * Salient Descriptor strategies that have been implemented in the KB
     */
    // deflexical
    private static final SubLSymbol $mysentient_in_kb_salient_descriptor_strategies$ = makeSymbol("*MYSENTIENT-IN-KB-SALIENT-DESCRIPTOR-STRATEGIES*");

    /**
     * in-code Salient Descriptor tactics for the :FORT seed term type that we don't use because they have been reimplemented as in-KB strategies
     */
    // deflexical
    private static final SubLSymbol $mysentient_deprecated_in_code_salient_descriptor_tactics$ = makeSymbol("*MYSENTIENT-DEPRECATED-IN-CODE-SALIENT-DESCRIPTOR-TACTICS*");

    /**
     * Tell the Clarification Manager not to use the SD tactic TACTIC.
     */
    public static final SubLObject mysentient_cm_turn_off_salient_descriptor_tactic(SubLObject tactic) {
        {
            SubLObject pcase_var = tactic;
            if (pcase_var.eql(QUOTE) || pcase_var.eql(RKF_SD_PROMPTER_SUGGESTION)) {
                {
                    SubLObject item_var = RKF_SD_PROMPTER_SUGGESTION;
                    if (NIL == member(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                        $mysentient_deprecated_in_code_salient_descriptor_tactics$.setGlobalValue(cons(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue()));
                    }
                }
                $mysentient_in_kb_salient_descriptor_strategies$.setGlobalValue(delete($const66$RequiredSalientDescriptorsOnSubPe, delete($const67$StrongSalientDescriptorsOnSubPegs, $mysentient_in_kb_salient_descriptor_strategies$.getGlobalValue(), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else
                if (pcase_var.eql(QUOTE) || pcase_var.eql(RKF_SD_PROMPTER_ANALOGIZE)) {
                    {
                        SubLObject item_var = RKF_SD_PROMPTER_ANALOGIZE;
                        if (NIL == member(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                            $mysentient_deprecated_in_code_salient_descriptor_tactics$.setGlobalValue(cons(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue()));
                        }
                    }
                } else
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(RKF_SD_PROMPTER_RULES_FOR_TERM)) {
                        {
                            SubLObject item_var = RKF_SD_PROMPTER_RULES_FOR_TERM;
                            if (NIL == member(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                                $mysentient_deprecated_in_code_salient_descriptor_tactics$.setGlobalValue(cons(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue()));
                            }
                        }
                    } else
                        if (pcase_var.eql(QUOTE) || pcase_var.eql(RKF_SD_PROMPTER_INDUCED)) {
                            {
                                SubLObject item_var = RKF_SD_PROMPTER_INDUCED;
                                if (NIL == member(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                                    $mysentient_deprecated_in_code_salient_descriptor_tactics$.setGlobalValue(cons(item_var, $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue()));
                                }
                            }
                        } else {
                            Errors.warn($str_alt71$Clarification_Manager_was_told_no, tactic);
                            return NIL;
                        }



        }
        return tactic;
    }

    /**
     * What information should we ask the user for?
     *
     * @return listp; each of whose elements is a triple? of the form (QUERY VAR-CHOICES-PAIRS PARAPHRASE);
    where QUERY is a CycL query to ask the user,
    VAR-CHOICES-PAIRS is a (usually singleton) listp of doubleton? of the form (VAR CHOICES)
    where VAR is a free variable that appears in QUERY
    CHOICES is a listp of doubleton? of the form (CHOICE CHOICE-PPH)
    where CHOICE is a CycL sentence in which VAR is replaced by a fully-bound denotational term
    CHOICE-PPH is a stringp; a natural-language paraphrase of that denotational term
    PARAPHRASE is a stringp; a natural-language paraphrase of QUERY
     * @unknown (clarification-prompts-for-more-info #$PeterWagner
    #$MySTestSessionForPeterWagner001
    #$MySTestSessionForPeterWagner001Mt
    #$PeterWagnerUserProfileMt
    #$EnglishMt)
    => (((#$and (#$isa ?FACET #$AnimalTypeByMaturity)
    (#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> ?FACET))
    ``What maturity is your dog?''
    (((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$JuvenileAnimal) ``young animal'')
    ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$AdultAnimal) ``adult'')))
    ((#$and (#$isa ?BREED #$DogTypeByBreed)
    (#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> ?BREED))
    ``What breed is your dog?''
    (((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Terrier-FoxSmooth) ``Smooth Fox terrier'')
    ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Terrier-Lakeland) ``Lakeland terrier'')
    ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Terrier-Cairn) ``Cairn terrier'')
    ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Maltese-TheDog) ``Maltese'')
    ...)))
     */
    public static final SubLObject clarification_prompts_for_more_info(SubLObject user, SubLObject session, SubLObject session_mt, SubLObject user_profile_mt, SubLObject generation_mt, SubLObject max_questions) {
        if (max_questions == UNPROVIDED) {
            max_questions = ONE_INTEGER;
        }
        SubLSystemTrampolineFile.checkType(user, FORT_P);
        SubLSystemTrampolineFile.checkType(session, FORT_P);
        SubLSystemTrampolineFile.checkType(session_mt, MICROTHEORY_P);
        SubLSystemTrampolineFile.checkType(generation_mt, MICROTHEORY_P);
        {
            SubLObject utterance_peg = mysentient_user_profile_manager_widgets.get_most_recent_utterance_peg(session, session_mt);
            SubLObject question_specs = NIL;
            SubLObject sd_execution_functions = $list_alt72;
            SubLObject rest = NIL;
            for (rest = sd_execution_functions; !((NIL != subl_promotions.non_positive_integer_p(max_questions)) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject function = rest.first();
                    SubLObject new_question_specs = funcall(function, utterance_peg, user, session_mt, generation_mt, max_questions);
                    max_questions = subtract(max_questions, length(new_question_specs));
                    question_specs = append(question_specs, new_question_specs);
                }
            }
            return question_specs;
        }
    }

    public static final SubLObject mysentient_cm_execute_salient_descriptor_tactics_in_code(SubLObject utterance_peg, SubLObject user, SubLObject session_mt, SubLObject generation_mt, SubLObject max_questions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mysentient_utilities.myselog_info(cconcatenate($str_alt77$About_to_execute_Salient_Descript, format_nil.format_nil_s_no_copy(session_mt)));
            {
                SubLObject question_specs = NIL;
                SubLObject sd_candidates = mysentient_cm_sd_candidates(utterance_peg, session_mt);
                SubLSystemTrampolineFile.checkType($mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue(), NON_DOTTED_LIST_P);
                {
                    SubLObject tactics_for_seed_term_type = list_utilities.ordered_set_difference(rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_for_seed_term_type($FORT), $mysentient_deprecated_in_code_salient_descriptor_tactics$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
                    SubLObject tactics_table_copy = copy_tree(rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.getDynamicValue(thread));
                    {
                        SubLObject _prev_bind_0 = rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.currentBinding(thread);
                        try {
                            rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.bind(list_utilities.alist_enter(tactics_table_copy, $FORT, tactics_for_seed_term_type, symbol_function(EQ)), thread);
                            {
                                SubLObject prompts = NIL;
                                SubLObject confidence = $mys_cm_arbitrary_confidence$.getGlobalValue();
                                SubLObject rest = NIL;
                                for (rest = sd_candidates; !((NIL != prompts) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject sd_candidate = rest.first();
                                        prompts = mysentient_salient_descriptor_questions_for_term(sd_candidate, session_mt, max_questions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                question_specs = sd_question_specs_to_clarification_question_specs(prompts, generation_mt, user, session_mt, confidence);
                            }
                        } finally {
                            rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return question_specs;
            }
        }
    }

    /**
     * Specifies a query for identifying entities to call the Salient Descriptor on.  The query contains an indexical for the info transfer.
     */
    // deflexical
    private static final SubLSymbol $mysentient_cm_identify_sd_candidates_query_spec$ = makeSymbol("*MYSENTIENT-CM-IDENTIFY-SD-CANDIDATES-QUERY-SPEC*");

    public static final SubLObject mysentient_cm_sd_candidates(SubLObject utterance_peg, SubLObject session_mt) {
        {
            SubLObject query_sentence = mysentient_utilities.mysentient_query_sentence_from_query_spec_and_utterance_peg($mysentient_cm_identify_sd_candidates_query_spec$.getGlobalValue(), utterance_peg);
            SubLObject free_vars = el_utilities.sentence_free_variables(query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject number_of_free_vars = length(free_vars);
            SubLObject query_properties = mysentient_utilities.mysentient_query_properties_for_query_spec($mysentient_cm_identify_sd_candidates_query_spec$.getGlobalValue());
            if (NIL == number_utilities.onep(number_of_free_vars)) {
                mysentient_utilities.myselog_error(cconcatenate($str_alt81$Was_expecting_exactly_one_free_va, new SubLObject[]{ format_nil.format_nil_s_no_copy($mysentient_cm_identify_sd_candidates_query_spec$.getGlobalValue()), $str_alt82$__but_found_, format_nil.format_nil_s_no_copy(number_of_free_vars), $str_alt83$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt84$Query_sentence__, format_nil.format_nil_s_no_copy(query_sentence), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt85$Free_vars__, format_nil.format_nil_s_no_copy(free_vars) }));
                return NIL;
            }
            {
                SubLObject free_var = free_vars.first();
                return mysentient_utilities.myse_query_variable(free_var, query_sentence, session_mt, query_properties);
            }
        }
    }

    public static final SubLObject mysentient_cm_execute_salient_descriptor_strategies(SubLObject utterance_peg, SubLObject user, SubLObject session_mt, SubLObject generation_mt, SubLObject max_number) {
        mysentient_utilities.myselog_info(cconcatenate($str_alt86$About_to_execute_Salient_Descript, new SubLObject[]{ format_nil.format_nil_s_no_copy(utterance_peg), $str_alt87$_in_, format_nil.format_nil_s_no_copy(session_mt) }));
        {
            SubLObject question_cycls = NIL;
            SubLObject question_specs = NIL;
            SubLObject rest = NIL;
            for (rest = $mysentient_in_kb_salient_descriptor_strategies$.getGlobalValue(); !((NIL != subl_promotions.non_positive_integer_p(max_number)) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject strategy = rest.first();
                    SubLObject new_question_cycls = execute_salient_descriptor_strategy(strategy, utterance_peg, session_mt, max_number);
                    max_number = subtract(max_number, length(new_question_cycls));
                    question_cycls = append(question_cycls, new_question_cycls);
                    question_specs = append(question_specs, sd_question_cycls_to_clarification_question_specs(question_cycls, user, session_mt, generation_mt, strategy));
                }
            }
            return question_specs;
        }
    }

    public static final SubLObject execute_salient_descriptor_strategy(SubLObject strategy, SubLObject utterance_peg, SubLObject session_mt, SubLObject max_number) {
        {
            SubLObject questions = candidate_clarification_questions(utterance_peg, strategy, session_mt, list($MAX_TRANSFORMATION_DEPTH, TWO_INTEGER, $MAX_TIME, $int$45, $MAX_NUMBER, max_number));
            SubLObject unbound_questions = NIL;
            SubLObject cdolist_list_var = questions;
            SubLObject v_question = NIL;
            for (v_question = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_question = cdolist_list_var.first()) {
                unbound_questions = cons(rkf_salient_descriptor.rkf_sd_existentially_unbind(v_question), unbound_questions);
            }
            return nreverse(unbound_questions);
        }
    }

    public static final SubLObject sd_question_cycls_to_clarification_question_specs(SubLObject question_cycls, SubLObject user, SubLObject session_mt, SubLObject generation_mt, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject questions_specs = NIL;
                SubLObject strategy_confidence = myse_cm_strategy_default_confidence(strategy, session_mt);
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_speaker$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_addressee$.currentBinding(thread);
                    try {
                        pph_vars.$pph_speaker$.bind(pph_vars.$pph_speaker$.getDynamicValue(thread), thread);
                        pph_vars.$pph_addressee$.bind(user, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject _prev_bind_0_7 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                {
                                    SubLObject reuseP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    try {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_8 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                {
                                                    SubLObject new_or_reused = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject _prev_bind_0_9 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                            {
                                                                SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                {
                                                                    SubLObject _prev_bind_0_10 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                    try {
                                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                                        {
                                                                            final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                                                            try {
                                                                                {
                                                                                    SubLObject cdolist_list_var = question_cycls;
                                                                                    SubLObject question_cycl = NIL;
                                                                                    for (question_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , question_cycl = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject confidence = strategy_confidence;
                                                                                            SubLObject question_spec = NIL;
                                                                                            SubLObject error = NIL;
                                                                                            try {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_11 = Errors.$error_handler$.currentBinding(thread);
                                                                                                    try {
                                                                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                                                        try {
                                                                                                            question_spec = sd_question_cycl_to_clarification_question_spec(question_cycl, session_mt, generation_mt, confidence);
                                                                                                        } catch (Throwable catch_var) {
                                                                                                            Errors.handleThrowable(catch_var, NIL);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        Errors.$error_handler$.rebind(_prev_bind_0_11, thread);
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable ccatch_env_var) {
                                                                                                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                                                            }
                                                                                            if (NIL != error) {
                                                                                                mysentient_utilities.myselog_warn(format(NIL, error));
                                                                                            } else {
                                                                                                questions_specs = cons(question_spec, questions_specs);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_10, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_7, thread);
                            }
                        }
                    } finally {
                        pph_vars.$pph_addressee$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_speaker$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(questions_specs);
            }
        }
    }

    /**
     * This should be called with PPH memoization and with PPH addressee already bound to the user
     */
    public static final SubLObject sd_question_cycl_to_clarification_question_spec(SubLObject question_cycl, SubLObject session_mt, SubLObject generation_mt, SubLObject confidence) {
        SubLSystemTrampolineFile.checkType(question_cycl, $sym91$EL_SENTENCE_ASKABLE_);
        {
            SubLObject vars = el_utilities.sentence_free_variables(question_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == list_utilities.singletonP(vars)) {
                Errors.error($str_alt92$Can_only_handle_SD_questions_with, question_cycl);
            }
            {
                SubLObject answer_choice_examples = mysentient_rkf_sd_examples(question_cycl, NIL, session_mt, NIL, $int$999999);
                if (NIL == list_utilities.non_empty_list_p(answer_choice_examples)) {
                    Errors.error($str_alt94$Failed_to_produce_answer_choices_, question_cycl);
                }
                {
                    SubLObject answer_choice_terms = Mapping.mapcar(RKF_SD_EXAMPLE_TERM, answer_choice_examples);
                    SubLObject question_pph = pph_question.generate_question(question_cycl, generation_mt, session_mt, UNPROVIDED, UNPROVIDED);
                    if (NIL != mysentient_utilities.mysentient_nl_generation_string_unacceptableP(question_pph)) {
                        Errors.error($str_alt96$Suppressing_Salient_Descriptor_qu, question_cycl, question_pph);
                    }
                    {
                        SubLObject nl_preds = nl_preds_for_general_clarification_answer_choice_generation();
                        SubLObject var = vars.first();
                        SubLObject paraphrased_choices = make_clarification_answer_choices(question_cycl, var, answer_choice_terms, session_mt, generation_mt, nl_preds, UNPROVIDED, UNPROVIDED);
                        if (NIL == paraphrased_choices) {
                            Errors.error($str_alt97$Suppressing_Salient_Descriptor_qu, question_cycl, answer_choice_terms);
                        }
                        return make_clarification_question_spec(question_cycl, question_pph, confidence, paraphrased_choices, $str_alt98$prompt_for_info);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param SD-QUESTION-SPECS:
     * 		listp of mysentient-salient-descriptor-question-spec-p;
     * @return listp of mysentient-clarification-question-spec-p; the given question specs with paraphrases inserted for each piece of CycL,
    and each replacement option replaced by a sentence to assert if that choice is chosen
     */
    public static final SubLObject sd_question_specs_to_clarification_question_specs(SubLObject sd_question_specs, SubLObject generation_mt, SubLObject user, SubLObject session_mt, SubLObject confidence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_speaker$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_addressee$.currentBinding(thread);
                    try {
                        pph_vars.$pph_speaker$.bind(pph_vars.$pph_speaker$.getDynamicValue(thread), thread);
                        pph_vars.$pph_addressee$.bind(user, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject _prev_bind_0_14 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                {
                                    SubLObject reuseP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    try {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_15 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                {
                                                    SubLObject new_or_reused = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject _prev_bind_0_16 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                            {
                                                                SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                {
                                                                    SubLObject _prev_bind_0_17 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                    try {
                                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                                        {
                                                                            final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                                                            try {
                                                                                {
                                                                                    SubLObject cdolist_list_var = sd_question_specs;
                                                                                    SubLObject sd_question_spec = NIL;
                                                                                    for (sd_question_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sd_question_spec = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject clarification_question_spec = sd_question_spec_to_clarification_question_spec(sd_question_spec, generation_mt, session_mt, confidence);
                                                                                            if (NIL != clarification_question_spec) {
                                                                                                result = cons(clarification_question_spec, result);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_17, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_14, thread);
                            }
                        }
                    } finally {
                        pph_vars.$pph_addressee$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_speaker$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     * This should be called with PPH memoization and with PPH addressee already bound to the user
     */
    public static final SubLObject sd_question_spec_to_clarification_question_spec(SubLObject sd_question_spec, SubLObject generation_mt, SubLObject session_mt, SubLObject confidence) {
        {
            SubLObject datum = sd_question_spec;
            SubLObject current = datum;
            SubLObject prompt = NIL;
            SubLObject var_choices_pairs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt99);
            prompt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt99);
            var_choices_pairs = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == list_utilities.singletonP(var_choices_pairs)) {
                    mysentient_utilities.myselog_error(cconcatenate($str_alt100$SD_question_spec_, new SubLObject[]{ format_nil.format_nil_s_no_copy(NIL), $str_alt101$_doesn_t_have_exactly_one_free_va }));
                } else {
                    {
                        SubLObject var_choices_pair = var_choices_pairs.first();
                        SubLObject prompt_pph = pph_question.generate_question(prompt, generation_mt, session_mt, UNPROVIDED, UNPROVIDED);
                        if (NIL != mysentient_utilities.mysentient_nl_generation_string_unacceptableP(prompt_pph)) {
                            mysentient_utilities.mysentient_warn_about_unacceptable_string_filtering(prompt_pph, prompt);
                        } else {
                            {
                                SubLObject datum_20 = var_choices_pair;
                                SubLObject current_21 = datum_20;
                                SubLObject var = NIL;
                                SubLObject choices = NIL;
                                destructuring_bind_must_consp(current_21, datum_20, $list_alt102);
                                var = current_21.first();
                                current_21 = current_21.rest();
                                destructuring_bind_must_consp(current_21, datum_20, $list_alt102);
                                choices = current_21.first();
                                current_21 = current_21.rest();
                                if (NIL == current_21) {
                                    {
                                        SubLObject nl_preds = nl_preds_for_general_clarification_answer_choice_generation();
                                        SubLObject paraphrased_choices = make_clarification_answer_choices(prompt, var, choices, session_mt, generation_mt, nl_preds, UNPROVIDED, UNPROVIDED);
                                        if (NIL == paraphrased_choices) {
                                            return NIL;
                                        } else {
                                            return make_clarification_question_spec(prompt, prompt_pph, confidence, paraphrased_choices, $str_alt98$prompt_for_info);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_20, $list_alt102);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt99);
            }
        }
        return NIL;
    }

    /**
     * Precisify the interpretation of the user's question UTTERANCE-PEG to more-easily-answerable questions, and generate NL for them.
     * This is basically an ask on the predicate #$candidateClarificationQuestion with
     * the strategy #$SuggestMorePreciseVersionsOfUnboundQuery-ClarificationStrategy, plus NL generation.
     *
     * @unknown (clarification-options-for-utterance #$MyS-HowBigIsAfghanistanExpPeg #$SomeSessionMt #$SomeGenerationMt)
    => ((#$clarifiedPegInterpretations #$MyS-HowBigIsAfghanistanExpPeg ?WHAT)
    ``Which of the following questions did you mean to ask?''
    0.85
    (((#$clarifiedPegInterpretations #$MyS-HowBigIsAfghanistanExpPeg (#$numberOfInhabitants #$Afghanistan ?SIZE))
    ``What is the population of Afghanistan?'')
    ((#$clarifiedPegInterpretations #$MyS-HowBigIsAfghanistanExpPeg
    (#$areaOfRegion (#$TerritoryFn #$Afghanistan) ?SIZE))
    ``What is the area of Afghanistan?'')))
     */
    public static final SubLObject clarification_options_for_utterance(SubLObject utterance_peg, SubLObject session_mt, SubLObject generation_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(utterance_peg, FORT_P);
            SubLSystemTrampolineFile.checkType(session_mt, MICROTHEORY_P);
            SubLSystemTrampolineFile.checkType(generation_mt, MICROTHEORY_P);
            thread.resetMultipleValues();
            {
                SubLObject answer_choices = utterance_has_clarification_options(utterance_peg, session_mt);
                SubLObject v_question = thread.secondMultipleValue();
                SubLObject confidence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject question_pph = $str_alt103$Which_of_the_following_questions_;
                    SubLObject clarification_answer_choices = NIL;
                    if (NIL == list_utilities.empty_list_p(answer_choices)) {
                        {
                            SubLObject el_var = cycl_utilities.formula_arg2(v_question, UNPROVIDED);
                            SubLObject nl_preds_for_answer_pphs = nl_preds_for_expression_peg_clarification(utterance_peg, session_mt, T);
                            clarification_answer_choices = make_clarification_answer_choices(v_question, el_var, answer_choices, session_mt, generation_mt, nl_preds_for_answer_pphs, $INTERROGATIVE, UNPROVIDED);
                        }
                    }
                    return make_clarification_question_spec(v_question, question_pph, confidence, clarification_answer_choices, $str_alt104$clarification_options);
                }
            }
        }
    }

    public static final SubLObject make_clarification_answer_choices(SubLObject v_question, SubLObject variable, SubLObject answer_choices, SubLObject session_mt, SubLObject generation_mt, SubLObject nl_preds, SubLObject force, SubLObject original_string) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (force == UNPROVIDED) {
            force = $NONE;
        }
        if (original_string == UNPROVIDED) {
            original_string = NIL;
        }
        mysentient_utilities.myselog_info(cconcatenate($str_alt110$About_to_make_clarification_answe, new SubLObject[]{ format_nil.format_nil_s_no_copy(answer_choices), $str_alt111$_to_the_question_, format_nil.format_nil_s_no_copy(v_question) }));
        {
            SubLObject forbidden_paraphrases = (original_string.isString()) ? ((SubLObject) (list(original_string))) : NIL;
            SubLObject paraphrased_answer_choices = mysentient_utilities.filter_unacceptable_mysentient_nl_strings(pph_main.generate_disambiguation_phrases(answer_choices, force, nl_preds, generation_mt, session_mt, $TEXT, forbidden_paraphrases), symbol_function(SECOND));
            SubLObject sentence_paraphrase_pairs = NIL;
            if (NIL == paraphrased_answer_choices) {
                mysentient_utilities.myselog_warn(cconcatenate($str_alt113$Failed_to_paraphrase_any_of_, format_nil.format_nil_s_no_copy(answer_choices)));
            }
            {
                SubLObject cdolist_list_var = paraphrased_answer_choices;
                SubLObject paraphrased_answer_choice = NIL;
                for (paraphrased_answer_choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , paraphrased_answer_choice = cdolist_list_var.first()) {
                    {
                        SubLObject datum = paraphrased_answer_choice;
                        SubLObject current = datum;
                        SubLObject answer_choice = NIL;
                        SubLObject paraphrase = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt114);
                        answer_choice = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt114);
                        paraphrase = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject sentence = cycl_utilities.expression_subst(answer_choice, variable, v_question, symbol_function(EQ), UNPROVIDED);
                                SubLObject sentence_paraphrase_pair = list(sentence, paraphrase);
                                sentence_paraphrase_pairs = cons(sentence_paraphrase_pair, sentence_paraphrase_pairs);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt114);
                        }
                    }
                }
            }
            sentence_paraphrase_pairs = nreverse(sentence_paraphrase_pairs);
            mysentient_utilities.myselog_info(cconcatenate($str_alt115$Made_clarification_answer_choices, format_nil.format_nil_s_no_copy(sentence_paraphrase_pairs)));
            return sentence_paraphrase_pairs;
        }
    }

    public static final SubLObject make_clarification_question_spec(SubLObject semantics, SubLObject output_text, SubLObject confidence, SubLObject options_with_pph, SubLObject type) {
        return list(semantics, output_text, confidence, options_with_pph, type);
    }

    public static final SubLObject mysentient_clarification_question_spec_p(SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED))) {
            {
                SubLObject datum = v_object;
                SubLObject current = datum;
                SubLObject first = NIL;
                SubLObject second = NIL;
                SubLObject third = NIL;
                SubLObject fourth = NIL;
                SubLObject fifth = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt116);
                first = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt116);
                second = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt116);
                third = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt116);
                fourth = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt116);
                fifth = current.first();
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean(((((NIL != el_utilities.el_formula_p(first)) && second.isString()) && third.isNumber()) && (NIL != list_utilities.list_of_type_p(MYSENTIENT_CLARIFICATION_ANSWER_CHOICE_P, fourth))) && fifth.isString());
                } else {
                    cdestructuring_bind_error(datum, $list_alt116);
                }
            }
        } else {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject mysentient_clarification_answer_choice_p(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && (NIL != cycl_grammar.cycl_term_p(v_object.first()))) && second(v_object).isString());
    }

    public static final SubLObject mysentient_clarification_question_spec_question_cycl(SubLObject question_spec) {
        return question_spec.first();
    }

    public static final SubLObject mysentient_clarification_question_spec_question_pph(SubLObject question_spec) {
        return second(question_spec);
    }

    public static final SubLObject mysentient_clarification_question_spec_confidence(SubLObject question_spec) {
        return third(question_spec);
    }

    public static final SubLObject mysentient_clarification_question_spec_answer_choices(SubLObject question_spec) {
        return fourth(question_spec);
    }

    public static final SubLObject mysentient_clarification_question_spec_type(SubLObject question_spec) {
        return fifth(question_spec);
    }

    public static final SubLObject utterance_has_clarification_options(SubLObject utterance_peg, SubLObject session_mt) {
        {
            SubLObject strategy = $const118$SuggestMorePreciseVersionsOfUnbou;
            SubLObject sentences = candidate_clarification_questions(utterance_peg, strategy, session_mt, list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER));
            SubLObject confidence = myse_cm_strategy_default_confidence(strategy, session_mt);
            if (NIL != list_utilities.empty_list_p(sentences)) {
                return values(sentences, NIL, $float$1_0);
            } else {
                {
                    SubLObject first_sentence = sentences.first();
                    SubLObject v_question = el_utilities.replace_formula_arg(TWO_INTEGER, $sym34$_WHAT, first_sentence);
                    SubLObject answers = Mapping.mapcar(symbol_function(FORMULA_ARG2), sentences);
                    return values(answers, v_question, confidence);
                }
            }
        }
    }

    public static final SubLObject candidate_clarification_questions(SubLObject utterance_peg, SubLObject strategy, SubLObject session_mt, SubLObject query_properties) {
        {
            SubLObject var = $sym121$_X;
            return mysentient_utilities.myse_query_variable(var, el_utilities.make_ternary_formula($$candidateClarificationQuestion, utterance_peg, strategy, var), session_mt, query_properties);
        }
    }

    // deflexical
    private static final SubLSymbol $nl_preds_for_general_clarification_answer_choice_generation$ = makeSymbol("*NL-PREDS-FOR-GENERAL-CLARIFICATION-ANSWER-CHOICE-GENERATION*");

    public static final SubLObject nl_preds_for_general_clarification_answer_choice_generation() {
        if (NIL == $nl_preds_for_general_clarification_answer_choice_generation$.getGlobalValue()) {
            $nl_preds_for_general_clarification_answer_choice_generation$.setGlobalValue($list_alt123);
        }
        return $nl_preds_for_general_clarification_answer_choice_generation$.getGlobalValue();
    }

    /**
     *
     *
     * @return LISTP of NL preds to use for generating clarifications for EXPRESSION-PEG.
     */
    public static final SubLObject nl_preds_for_expression_peg_clarification(SubLObject expression_peg, SubLObject session_mt, SubLObject generate_as_questionP) {
        if (generate_as_questionP == UNPROVIDED) {
            generate_as_questionP = NIL;
        }
        return $DEFAULT;
    }

    // defparameter
    private static final SubLSymbol $mysentient_salient_descriptor_time_cutoff$ = makeSymbol("*MYSENTIENT-SALIENT-DESCRIPTOR-TIME-CUTOFF*");

    /**
     *
     *
     * @param MAX-QUESTIONS
     * 		integerp; the maximum number of questions to generate before stopping
     * @param MAX-EXAMPLES
     * 		integerp; the maximum number of sample replacements to generate for any free variable in any question
     * @param MAX-TIME
     * 		integerp; the maximum number of seconds this function should take before returning whatever answers it's managed to accumulate so far.
     * @return 0 LISTP of MySentient Salient Descriptor question specs,
    representing things Cyc wants to know about TERM.
     * @return 1 KEYWORDP: the reason the function halted - either :DONE, :MAX-TIME, or :MAX-QUESTIONS
     */
    public static final SubLObject mysentient_salient_descriptor_questions_for_term(SubLObject v_term, SubLObject session_mt, SubLObject max_questions, SubLObject max_examples, SubLObject max_time, SubLObject require_examplesP) {
        if (max_questions == UNPROVIDED) {
            max_questions = ONE_INTEGER;
        }
        if (max_examples == UNPROVIDED) {
            max_examples = $int$999999;
        }
        if (max_time == UNPROVIDED) {
            max_time = FIFTEEN_INTEGER;
        }
        if (require_examplesP == UNPROVIDED) {
            require_examplesP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(max_questions, POSITIVE_INTEGER_P);
            mysentient_utilities.myselog_info(cconcatenate($str_alt126$Trying_to_get_Salient_Descriptor_, new SubLObject[]{ format_nil.format_nil_s_no_copy(v_term), $str_alt87$_in_, format_nil.format_nil_s_no_copy(session_mt) }));
            {
                SubLObject question_specs = NIL;
                SubLObject start_time = get_universal_time();
                SubLObject prompt = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.bind(min($mysentient_salient_descriptor_time_cutoff$.getDynamicValue(thread), integerDivide(max_time, TWO_INTEGER)), thread);
                        {
                            SubLObject prompter = rkf_salient_descriptor_datastructures.new_rkf_salient_descriptor_prompter(v_term, session_mt);
                            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $kw127$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_, NIL);
                            prompt = rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_next(prompter, UNPROVIDED);
                            while (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
                                {
                                    SubLObject knowledge_gap_formula = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_formula(prompt);
                                    SubLObject prompt_formula = rkf_salient_descriptor.rkf_sd_remove_nonassertible_conjuncts(knowledge_gap_formula);
                                    SubLSystemTrampolineFile.checkType(prompt_formula, $sym91$EL_SENTENCE_ASKABLE_);
                                    {
                                        SubLObject vars = el_utilities.sentence_free_variables(prompt_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL == list_utilities.singletonP(vars)) {
                                            mysentient_utilities.myselog_warn(cconcatenate($str_alt128$Can_only_handle_SD_prompts_with_e, format_nil.format_nil_s_no_copy(prompt_formula)));
                                        } else {
                                            {
                                                SubLObject var = vars.first();
                                                SubLObject salient_property_sentence = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_salient_property_sentence(prompt);
                                                SubLObject examples = mysentient_rkf_sd_examples(knowledge_gap_formula, v_term, session_mt, salient_property_sentence, max_examples);
                                                if ((NIL != require_examplesP) && (NIL == list_utilities.non_empty_list_p(examples))) {
                                                    mysentient_utilities.myselog_warn(cconcatenate($str_alt129$Suppressing_SD_prompt_because_I_c, format_nil.format_nil_s_no_copy(prompt_formula)));
                                                } else {
                                                    {
                                                        SubLObject example_terms = (examples.isList()) ? ((SubLObject) (Mapping.mapcar(RKF_SD_EXAMPLE_TERM, examples))) : NIL;
                                                        SubLObject var_option = make_mysentient_salient_descriptor_var_option(var, example_terms);
                                                        SubLObject question_spec = make_mysentient_salient_descriptor_question_spec(prompt_formula, list(var_option));
                                                        utilities_macros.add_result_to_partial_results_accumulator(question_spec);
                                                        question_specs = cons(question_spec, question_specs);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL != list_utilities.lengthGE(question_specs, max_questions, UNPROVIDED)) {
                                    prompt = $MAX_QUESTIONS;
                                } else
                                    if (subtract(get_universal_time(), start_time).numGE(max_time)) {
                                        prompt = $MAX_TIME;
                                        mysentient_utilities.myselog_info(cconcatenate($str_alt131$Hit_the_, new SubLObject[]{ format_nil.format_nil_a_no_copy(max_time), $str_alt132$_second_time_limit_trying_to_get_, format_nil.format_nil_s_no_copy(v_term) }));
                                    } else {
                                        prompt = rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_next(prompter, UNPROVIDED);
                                    }

                            } 
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.rebind(_prev_bind_0, thread);
                    }
                }
                mysentient_utilities.myselog_info(cconcatenate($str_alt133$Got_the_following_Salient_Descrip, new SubLObject[]{ format_nil.format_nil_s_no_copy(v_term), $str_alt134$__, format_nil.format_nil_s_no_copy(question_specs) }));
                {
                    SubLObject halt_reason = prompt;
                    return values(question_specs, halt_reason);
                }
            }
        }
    }

    public static final SubLObject mysentient_rkf_sd_examples(SubLObject knowledge_gap_formula, SubLObject v_term, SubLObject session_mt, SubLObject salient_property_sentence, SubLObject max_examples) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_ok_to_generate_examplesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_salient_descriptor.$rkf_examples_to_show$.currentBinding(thread);
                    SubLObject _prev_bind_2 = rkf_salient_descriptor.$rkf_example_instances_backchain_level$.currentBinding(thread);
                    SubLObject _prev_bind_3 = rkf_salient_descriptor.$rkf_example_instances_wff_checkP$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_ok_to_generate_examplesP$.bind(T, thread);
                        rkf_salient_descriptor.$rkf_examples_to_show$.bind(max_examples, thread);
                        rkf_salient_descriptor.$rkf_example_instances_backchain_level$.bind(ZERO_INTEGER, thread);
                        rkf_salient_descriptor.$rkf_example_instances_wff_checkP$.bind(NIL, thread);
                        {
                            SubLObject include_types = $list_alt135;
                            {
                                SubLObject _prev_bind_0_22 = rkf_salient_descriptor.$rkf_example_not_known_false_time_cutoff$.currentBinding(thread);
                                try {
                                    rkf_salient_descriptor.$rkf_example_not_known_false_time_cutoff$.bind(ONE_INTEGER, thread);
                                    result = rkf_salient_descriptor.rkf_sd_examples(knowledge_gap_formula, v_term, session_mt, salient_property_sentence, NIL, include_types, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    rkf_salient_descriptor.$rkf_example_not_known_false_time_cutoff$.rebind(_prev_bind_0_22, thread);
                                }
                            }
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_example_instances_wff_checkP$.rebind(_prev_bind_3, thread);
                        rkf_salient_descriptor.$rkf_example_instances_backchain_level$.rebind(_prev_bind_2, thread);
                        rkf_salient_descriptor.$rkf_examples_to_show$.rebind(_prev_bind_1, thread);
                        rkf_macros.$rkf_ok_to_generate_examplesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject make_mysentient_salient_descriptor_question_spec(SubLObject query_formula, SubLObject var_options) {
        return list(query_formula, var_options);
    }

    public static final SubLObject mysentient_salient_descriptor_question_spec_p(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != el_utilities.possibly_sentence_p(v_object.first()))) && (NIL != list_utilities.list_of_type_p(MYSENTIENT_SALIENT_DESCRIPTOR_VAR_OPTION_P, second(v_object))));
    }

    public static final SubLObject mysentient_salient_descriptor_question_spec_query_formula(SubLObject question_spec) {
        return el_utilities.copy_expression(question_spec.first());
    }

    public static final SubLObject mysentient_salient_descriptor_question_spec_query_var_options(SubLObject question_spec) {
        return copy_tree(second(question_spec));
    }

    public static final SubLObject make_mysentient_salient_descriptor_var_option(SubLObject var, SubLObject candidates) {
        return list(var, candidates);
    }

    public static final SubLObject mysentient_salient_descriptor_var_option_p(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != cycl_variables.el_varP(v_object.first()))) && second(v_object).isList());
    }

    public static final SubLObject mysentient_salient_descriptor_var_option_var(SubLObject var_option) {
        return var_option.first();
    }

    public static final SubLObject mysentient_salient_descriptor_var_option_candidates(SubLObject var_option) {
        return copy_list(second(var_option));
    }

    public static final SubLObject declare_mysentient_clarification_manager_widgets_file() {
        declareFunction("set_max_clarification_questions", "SET-MAX-CLARIFICATION-QUESTIONS", 1, 0, false);
        declareFunction("max_clarification_questions", "MAX-CLARIFICATION-QUESTIONS", 0, 0, false);
        declareFunction("mysentient_cm_execute_strategies", "MYSENTIENT-CM-EXECUTE-STRATEGIES", 5, 0, false);
        declareFunction("execute_strategy_that_returns_yes_no_questions", "EXECUTE-STRATEGY-THAT-RETURNS-YES-NO-QUESTIONS", 6, 0, false);
        declareFunction("yes_no_question_cycl_to_clarification_question_spec", "YES-NO-QUESTION-CYCL-TO-CLARIFICATION-QUESTION-SPEC", 4, 0, false);
        declareFunction("myse_cm_strategy_default_confidence", "MYSE-CM-STRATEGY-DEFAULT-CONFIDENCE", 2, 0, false);
        declareFunction("mysentient_cm_generate_disambiguation_clarifications", "MYSENTIENT-CM-GENERATE-DISAMBIGUATION-CLARIFICATIONS", 4, 1, false);
        declareFunction("execute_disambiguation_strategies", "EXECUTE-DISAMBIGUATION-STRATEGIES", 7, 0, false);
        declareFunction("execute_disambiguation_strategy_int", "EXECUTE-DISAMBIGUATION-STRATEGY-INT", 5, 0, false);
        declareFunction("execute_strategy_that_returns_merged_questions_and_answers", "EXECUTE-STRATEGY-THAT-RETURNS-MERGED-QUESTIONS-AND-ANSWERS", 6, 1, false);
        declareFunction("generate_disambiguation_options_as_questionsP", "GENERATE-DISAMBIGUATION-OPTIONS-AS-QUESTIONS?", 2, 0, false);
        declareFunction("utterance_peg_p", "UTTERANCE-PEG-P", 1, 0, false);
        declareFunction("applicable_user_redirects", "APPLICABLE-USER-REDIRECTS", 3, 1, false);
        declareFunction("get_applicable_user_redirects_as_quadruples", "GET-APPLICABLE-USER-REDIRECTS-AS-QUADRUPLES", 3, 0, false);
        declareFunction("redirect_to_topic_url_linktext_triple", "REDIRECT-TO-TOPIC-URL-LINKTEXT-TRIPLE", 2, 0, false);
        declareFunction("mysentient_cm_turn_off_salient_descriptor_tactic", "MYSENTIENT-CM-TURN-OFF-SALIENT-DESCRIPTOR-TACTIC", 1, 0, false);
        declareFunction("clarification_prompts_for_more_info", "CLARIFICATION-PROMPTS-FOR-MORE-INFO", 5, 1, false);
        declareFunction("mysentient_cm_execute_salient_descriptor_tactics_in_code", "MYSENTIENT-CM-EXECUTE-SALIENT-DESCRIPTOR-TACTICS-IN-CODE", 5, 0, false);
        declareFunction("mysentient_cm_sd_candidates", "MYSENTIENT-CM-SD-CANDIDATES", 2, 0, false);
        declareFunction("mysentient_cm_execute_salient_descriptor_strategies", "MYSENTIENT-CM-EXECUTE-SALIENT-DESCRIPTOR-STRATEGIES", 5, 0, false);
        declareFunction("execute_salient_descriptor_strategy", "EXECUTE-SALIENT-DESCRIPTOR-STRATEGY", 4, 0, false);
        declareFunction("sd_question_cycls_to_clarification_question_specs", "SD-QUESTION-CYCLS-TO-CLARIFICATION-QUESTION-SPECS", 5, 0, false);
        declareFunction("sd_question_cycl_to_clarification_question_spec", "SD-QUESTION-CYCL-TO-CLARIFICATION-QUESTION-SPEC", 4, 0, false);
        declareFunction("sd_question_specs_to_clarification_question_specs", "SD-QUESTION-SPECS-TO-CLARIFICATION-QUESTION-SPECS", 5, 0, false);
        declareFunction("sd_question_spec_to_clarification_question_spec", "SD-QUESTION-SPEC-TO-CLARIFICATION-QUESTION-SPEC", 4, 0, false);
        declareFunction("clarification_options_for_utterance", "CLARIFICATION-OPTIONS-FOR-UTTERANCE", 3, 0, false);
        declareFunction("make_clarification_answer_choices", "MAKE-CLARIFICATION-ANSWER-CHOICES", 5, 3, false);
        declareFunction("make_clarification_question_spec", "MAKE-CLARIFICATION-QUESTION-SPEC", 5, 0, false);
        declareFunction("mysentient_clarification_question_spec_p", "MYSENTIENT-CLARIFICATION-QUESTION-SPEC-P", 1, 0, false);
        declareFunction("mysentient_clarification_answer_choice_p", "MYSENTIENT-CLARIFICATION-ANSWER-CHOICE-P", 1, 0, false);
        declareFunction("mysentient_clarification_question_spec_question_cycl", "MYSENTIENT-CLARIFICATION-QUESTION-SPEC-QUESTION-CYCL", 1, 0, false);
        declareFunction("mysentient_clarification_question_spec_question_pph", "MYSENTIENT-CLARIFICATION-QUESTION-SPEC-QUESTION-PPH", 1, 0, false);
        declareFunction("mysentient_clarification_question_spec_confidence", "MYSENTIENT-CLARIFICATION-QUESTION-SPEC-CONFIDENCE", 1, 0, false);
        declareFunction("mysentient_clarification_question_spec_answer_choices", "MYSENTIENT-CLARIFICATION-QUESTION-SPEC-ANSWER-CHOICES", 1, 0, false);
        declareFunction("mysentient_clarification_question_spec_type", "MYSENTIENT-CLARIFICATION-QUESTION-SPEC-TYPE", 1, 0, false);
        declareFunction("utterance_has_clarification_options", "UTTERANCE-HAS-CLARIFICATION-OPTIONS", 2, 0, false);
        declareFunction("candidate_clarification_questions", "CANDIDATE-CLARIFICATION-QUESTIONS", 4, 0, false);
        declareFunction("nl_preds_for_general_clarification_answer_choice_generation", "NL-PREDS-FOR-GENERAL-CLARIFICATION-ANSWER-CHOICE-GENERATION", 0, 0, false);
        declareFunction("nl_preds_for_expression_peg_clarification", "NL-PREDS-FOR-EXPRESSION-PEG-CLARIFICATION", 2, 1, false);
        declareFunction("mysentient_salient_descriptor_questions_for_term", "MYSENTIENT-SALIENT-DESCRIPTOR-QUESTIONS-FOR-TERM", 2, 4, false);
        declareFunction("mysentient_rkf_sd_examples", "MYSENTIENT-RKF-SD-EXAMPLES", 5, 0, false);
        declareFunction("make_mysentient_salient_descriptor_question_spec", "MAKE-MYSENTIENT-SALIENT-DESCRIPTOR-QUESTION-SPEC", 2, 0, false);
        declareFunction("mysentient_salient_descriptor_question_spec_p", "MYSENTIENT-SALIENT-DESCRIPTOR-QUESTION-SPEC-P", 1, 0, false);
        declareFunction("mysentient_salient_descriptor_question_spec_query_formula", "MYSENTIENT-SALIENT-DESCRIPTOR-QUESTION-SPEC-QUERY-FORMULA", 1, 0, false);
        declareFunction("mysentient_salient_descriptor_question_spec_query_var_options", "MYSENTIENT-SALIENT-DESCRIPTOR-QUESTION-SPEC-QUERY-VAR-OPTIONS", 1, 0, false);
        declareFunction("make_mysentient_salient_descriptor_var_option", "MAKE-MYSENTIENT-SALIENT-DESCRIPTOR-VAR-OPTION", 2, 0, false);
        declareFunction("mysentient_salient_descriptor_var_option_p", "MYSENTIENT-SALIENT-DESCRIPTOR-VAR-OPTION-P", 1, 0, false);
        declareFunction("mysentient_salient_descriptor_var_option_var", "MYSENTIENT-SALIENT-DESCRIPTOR-VAR-OPTION-VAR", 1, 0, false);
        declareFunction("mysentient_salient_descriptor_var_option_candidates", "MYSENTIENT-SALIENT-DESCRIPTOR-VAR-OPTION-CANDIDATES", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mysentient_clarification_manager_widgets_file() {
        deflexical("*MYS-CM-ARBITRARY-CONFIDENCE*", NIL != boundp($mys_cm_arbitrary_confidence$) ? ((SubLObject) ($mys_cm_arbitrary_confidence$.getGlobalValue())) : $float$0_8);
        deflexical("*MAX-CLARIFICATION-QUESTIONS*", NIL != boundp($max_clarification_questions$) ? ((SubLObject) ($max_clarification_questions$.getGlobalValue())) : FIVE_INTEGER);
        deflexical("*MYSENTIENT-IN-KB-SALIENT-DESCRIPTOR-STRATEGIES*", NIL);
        deflexical("*MYSENTIENT-DEPRECATED-IN-CODE-SALIENT-DESCRIPTOR-TACTICS*", NIL);
        deflexical("*MYSENTIENT-CM-IDENTIFY-SD-CANDIDATES-QUERY-SPEC*", $$IdentifySDCandidates_CMQuerySpec);
        deflexical("*NL-PREDS-FOR-GENERAL-CLARIFICATION-ANSWER-CHOICE-GENERATION*", NIL);
        defparameter("*MYSENTIENT-SALIENT-DESCRIPTOR-TIME-CUTOFF*", $int$40);
        return NIL;
    }

    public static final SubLObject setup_mysentient_clarification_manager_widgets_file() {
                subl_macro_promotions.declare_defglobal($mys_cm_arbitrary_confidence$);
        subl_macro_promotions.declare_defglobal($max_clarification_questions$);
        utilities_macros.register_cyc_api_function(MAX_CLARIFICATION_QUESTIONS, NIL, $str_alt5$What_s_the_maximum_number_of_clar, NIL, $list_alt6);
        utilities_macros.register_cyc_api_function(MYSENTIENT_CM_EXECUTE_STRATEGIES, $list_alt12, $str_alt13$Execute_clarification_strategies_, $list_alt14, $list_alt15);
        utilities_macros.register_cyc_api_function(MYSENTIENT_CM_GENERATE_DISAMBIGUATION_CLARIFICATIONS, $list_alt31, $str_alt32$Generate_questions_asking_the_use, $list_alt33, $list_alt15);
        utilities_macros.register_cyc_api_function(APPLICABLE_USER_REDIRECTS, $list_alt49, $str_alt50$Get_the_customer_defined_redirect, $list_alt51, $list_alt52);
        utilities_macros.register_cyc_api_function(CLARIFICATION_PROMPTS_FOR_MORE_INFO, $list_alt74, $str_alt75$What_information_should_we_ask_th, $list_alt76, $list_alt15);
        utilities_macros.register_cyc_api_function(CLARIFICATION_OPTIONS_FOR_UTTERANCE, $list_alt106, $str_alt107$Precisify_the_interpretation_of_t, $list_alt108, $list_alt109);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $mys_cm_arbitrary_confidence$ = makeSymbol("*MYS-CM-ARBITRARY-CONFIDENCE*");

    public static final SubLFloat $float$0_8 = makeDouble(0.8);

    public static final SubLSymbol $max_clarification_questions$ = makeSymbol("*MAX-CLARIFICATION-QUESTIONS*");



    private static final SubLSymbol MAX_CLARIFICATION_QUESTIONS = makeSymbol("MAX-CLARIFICATION-QUESTIONS");

    static private final SubLString $str_alt5$What_s_the_maximum_number_of_clar = makeString("What's the maximum number of clarification questions to generate in one go?");

    static private final SubLList $list_alt6 = list(makeSymbol("NON-NEGATIVE-INTEGER-P"));





    public static final SubLObject $const9$SuggestApplicableSubtopics_Clarif = constant_handles.reader_make_constant_shell(makeString("SuggestApplicableSubtopics-ClarificationStrategy"));

    public static final SubLObject $const10$AskProfilingQuestionBasedOnSubExp = constant_handles.reader_make_constant_shell(makeString("AskProfilingQuestionBasedOnSubExpressions-ClarificationStrategy"));

    private static final SubLSymbol MYSENTIENT_CM_EXECUTE_STRATEGIES = makeSymbol("MYSENTIENT-CM-EXECUTE-STRATEGIES");

    static private final SubLList $list_alt12 = list(makeSymbol("UTTERANCE-PEG"), makeSymbol("USER"), makeSymbol("SESSION-MT"), makeSymbol("GENERATION-MT"), makeSymbol("MAX-NUMBER"));

    static private final SubLString $str_alt13$Execute_clarification_strategies_ = makeString("Execute clarification strategies (excluding ones that are executed elsewhere).\n   @return listp of up to MAX-NUMBER mysentient-clarification-question-spec-p\'s");

    static private final SubLList $list_alt14 = list(list(makeSymbol("UTTERANCE-PEG"), makeSymbol("FORT-P")), list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("SESSION-MT"), makeSymbol("MICROTHEORY-P")), list(makeSymbol("GENERATION-MT"), makeSymbol("MICROTHEORY-P")), list(makeSymbol("MAX-NUMBER"), makeSymbol("NON-NEGATIVE-INTEGER-P")));

    static private final SubLList $list_alt15 = list(list(makeSymbol("LIST"), makeSymbol("MYSENTIENT-CLARIFICATION-QUESTION-SPEC-P")));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    static private final SubLString $str_alt18$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");



    private static final SubLSymbol MYSENTIENT_CLARIFICATION_QUESTION_SPEC_QUESTION_PPH = makeSymbol("MYSENTIENT-CLARIFICATION-QUESTION-SPEC-QUESTION-PPH");

    static private final SubLString $$$yes = makeString("yes");

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    static private final SubLString $$$no = makeString("no");

    static private final SubLString $str_alt24$applicable_subtopic = makeString("applicable_subtopic");





    public static final SubLObject $const27$SubPegDisambiguation_Clarificatio = constant_handles.reader_make_constant_shell(makeString("SubPegDisambiguation-ClarificationStrategy"));

    public static final SubLObject $const28$UtteranceDisambiguation_Clarifica = constant_handles.reader_make_constant_shell(makeString("UtteranceDisambiguation-ClarificationStrategy"));

    public static final SubLObject $const29$ProposeSentenceFromPartialParseIn = constant_handles.reader_make_constant_shell(makeString("ProposeSentenceFromPartialParseInfo-ClarificationStrategy"));

    private static final SubLSymbol MYSENTIENT_CM_GENERATE_DISAMBIGUATION_CLARIFICATIONS = makeSymbol("MYSENTIENT-CM-GENERATE-DISAMBIGUATION-CLARIFICATIONS");

    static private final SubLList $list_alt31 = list(makeSymbol("UTTERANCE-PEG"), makeSymbol("UTTERANCE-IS-QUESTION?"), makeSymbol("SESSION-MT"), makeSymbol("GENERATION-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MAX-NUMBER"), THREE_INTEGER));

    static private final SubLString $str_alt32$Generate_questions_asking_the_use = makeString("Generate questions asking the user to disambiguate between the multiple interpretations of ambiguous sub-expressions\n   of their utterance UTTERANCE-PEG.\n   @return listp of up to MAX-NUMBER mysentient-clarification-question-spec-p\'s");

    static private final SubLList $list_alt33 = list(list(makeSymbol("UTTERANCE-PEG"), makeSymbol("CYCL-TERM-P")), list(makeSymbol("UTTERANCE-IS-QUESTION?"), makeSymbol("BOOLEANP")), list(makeSymbol("SESSION-MT"), makeSymbol("MICROTHEORY-P")), list(makeSymbol("GENERATION-MT"), makeSymbol("MICROTHEORY-P")), list(makeSymbol("MAX-NUMBER"), makeSymbol("NON-NEGATIVE-INTEGER-P")));

    static private final SubLSymbol $sym34$_WHAT = makeSymbol("?WHAT");

    static private final SubLString $str_alt35$What_did_you_mean_by__ = makeString("What did you mean by '");

    static private final SubLString $str_alt36$__ = makeString("'?");





    static private final SubLString $str_alt39$Suppressing_disambiguation_of_ = makeString("Suppressing disambiguation of ");

    static private final SubLString $str_alt40$_because_there_are_less_than_ = makeString(" because there are less than ");

    static private final SubLString $str_alt41$_successfully_paraphrased_answer_ = makeString(" successfully-paraphrased answer choices");

    static private final SubLString $$$disambiguation = makeString("disambiguation");

    public static final SubLObject $const43$LinguisticExpressionPeg_CompleteU = constant_handles.reader_make_constant_shell(makeString("LinguisticExpressionPeg-CompleteUtterance"));

    static private final SubLList $list_alt44 = cons(makeSymbol("TOPIC"), makeSymbol("REDIRECT-MINUS-TOPIC"));







    private static final SubLSymbol APPLICABLE_USER_REDIRECTS = makeSymbol("APPLICABLE-USER-REDIRECTS");

    static private final SubLList $list_alt49 = list(makeSymbol("UTTERANCE-PEG"), makeSymbol("SESSION-MT"), makeSymbol("GENERATION-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MAX-NUMBER"), TEN_INTEGER));

    static private final SubLString $str_alt50$Get_the_customer_defined_redirect = makeString("Get the customer-defined redirects that apply based on UTTERANCE-PEG, sorted by topic.\n   @return listp; each of whose elements is a doubleton? of the form (TOPIC REDIRECTS);\n                    where TOPIC is a doubleton? of the form (TOPIC-CYCL TOPIC-NL)\n                            where TOPIC-CYCL is a cycl-term-p\n                                  TOPIC-NL is a stringp; a natural-language paraphrase of TOPIC-CYCL\n                          REDIRECTS is a listp of triple? of the form (URL-STRING LINK-TEXT CONFIDENCE)\n                            where URL-STRING is a stringp\n                                  LINK-TEXT is a stringp\n                                  CONFIDENCE is a numberp between 0 and 1\n   @example (applicable-user-redirects #$MyS-HowMuchShouldIFeedMyDogExpPeg #$MySeAnswersSession-DaveS-001 #$MySeGenerationMt-DaveS)\n            => (((#$Dog ``dog\'\')\n                 ((``www.purina.com/puppy-chow.html\'\' ``Buy tasty dog food!\'\' 0.9)\n                  (``www.aspca.com/spay-or-neuter.html\'\' ``Have you considered spaying or neutering your pet?\'\' 0.65))))");

    static private final SubLList $list_alt51 = list(list(makeSymbol("UTTERANCE-PEG"), makeSymbol("CYCL-TERM-P")), list(makeSymbol("SESSION-MT"), makeSymbol("MICROTHEORY-P")), list(makeSymbol("GENERATION-MT"), makeSymbol("MICROTHEORY-P")));

    static private final SubLList $list_alt52 = list(list(makeSymbol("LIST"), makeSymbol("DOUBLETON?")));

    public static final SubLObject $const53$SuggestUserRedirects_Clarificatio = constant_handles.reader_make_constant_shell(makeString("SuggestUserRedirects-ClarificationStrategy"));



    static private final SubLList $list_alt55 = list(makeSymbol("?TOPIC"), makeSymbol("?URL"), makeSymbol("?LINKTEXT"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$userRedirectURL = constant_handles.reader_make_constant_shell(makeString("userRedirectURL"));

    static private final SubLList $list_alt58 = list(makeSymbol("?URL"));

    public static final SubLObject $$userRedirectLinkText = constant_handles.reader_make_constant_shell(makeString("userRedirectLinkText"));

    static private final SubLList $list_alt60 = list(makeSymbol("?LINKTEXT"));

    public static final SubLObject $$userRedirectMainTopic = constant_handles.reader_make_constant_shell(makeString("userRedirectMainTopic"));

    static private final SubLList $list_alt62 = list(makeSymbol("?TOPIC"));

    static private final SubLList $list_alt63 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);



    private static final SubLSymbol RKF_SD_PROMPTER_SUGGESTION = makeSymbol("RKF-SD-PROMPTER-SUGGESTION");

    public static final SubLObject $const66$RequiredSalientDescriptorsOnSubPe = constant_handles.reader_make_constant_shell(makeString("RequiredSalientDescriptorsOnSubPegs-ClarificationStrategy"));

    public static final SubLObject $const67$StrongSalientDescriptorsOnSubPegs = constant_handles.reader_make_constant_shell(makeString("StrongSalientDescriptorsOnSubPegs-ClarificationStrategy"));

    private static final SubLSymbol RKF_SD_PROMPTER_ANALOGIZE = makeSymbol("RKF-SD-PROMPTER-ANALOGIZE");

    private static final SubLSymbol RKF_SD_PROMPTER_RULES_FOR_TERM = makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM");

    private static final SubLSymbol RKF_SD_PROMPTER_INDUCED = makeSymbol("RKF-SD-PROMPTER-INDUCED");

    static private final SubLString $str_alt71$Clarification_Manager_was_told_no = makeString("Clarification Manager was told not to use the tactic ~S, which is not a known tactic.  Ignoring.");

    static private final SubLList $list_alt72 = list(makeSymbol("MYSENTIENT-CM-EXECUTE-SALIENT-DESCRIPTOR-STRATEGIES"), makeSymbol("MYSENTIENT-CM-EXECUTE-SALIENT-DESCRIPTOR-TACTICS-IN-CODE"));

    private static final SubLSymbol CLARIFICATION_PROMPTS_FOR_MORE_INFO = makeSymbol("CLARIFICATION-PROMPTS-FOR-MORE-INFO");

    static private final SubLList $list_alt74 = list(makeSymbol("USER"), makeSymbol("SESSION"), makeSymbol("SESSION-MT"), makeSymbol("USER-PROFILE-MT"), makeSymbol("GENERATION-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MAX-QUESTIONS"), ONE_INTEGER));

    static private final SubLString $str_alt75$What_information_should_we_ask_th = makeString("What information should we ask the user for?\n   @return listp; each of whose elements is a triple? of the form (QUERY VAR-CHOICES-PAIRS PARAPHRASE);\n                    where QUERY is a CycL query to ask the user,\n                          VAR-CHOICES-PAIRS is a (usually singleton) listp of doubleton? of the form (VAR CHOICES)\n                            where VAR is a free variable that appears in QUERY\n                                  CHOICES is a listp of doubleton? of the form (CHOICE CHOICE-PPH)\n                                    where CHOICE is a CycL sentence in which VAR is replaced by a fully-bound denotational term\n                                          CHOICE-PPH is a stringp; a natural-language paraphrase of that denotational term\n                          PARAPHRASE is a stringp; a natural-language paraphrase of QUERY\n   @example (clarification-prompts-for-more-info #$PeterWagner\n                                                 #$MySTestSessionForPeterWagner001\n                                                 #$MySTestSessionForPeterWagner001Mt\n                                                 #$PeterWagnerUserProfileMt\n                                                 #$EnglishMt)\n            => (((#$and (#$isa ?FACET #$AnimalTypeByMaturity)\n                        (#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> ?FACET))\n                 ``What maturity is your dog?\'\'\n                 (((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$JuvenileAnimal) ``young animal\'\')\n                  ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$AdultAnimal) ``adult\'\')))\n                ((#$and (#$isa ?BREED #$DogTypeByBreed)\n                        (#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> ?BREED))\n                 ``What breed is your dog?\'\'\n                 (((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Terrier-FoxSmooth) ``Smooth Fox terrier\'\')\n                  ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Terrier-Lakeland) ``Lakeland terrier\'\')\n                  ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Terrier-Cairn) ``Cairn terrier\'\')\n                  ((#$isa #<(#$NaiveReferentFn #$MyS-MyDogPeg)> #$Maltese-TheDog) ``Maltese\'\')\n                  ...)))");

    static private final SubLList $list_alt76 = list(list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("SESSION"), makeSymbol("FORT-P")), list(makeSymbol("SESSION-MT"), makeSymbol("MICROTHEORY-P")), list(makeSymbol("GENERATION-MT"), makeSymbol("MICROTHEORY-P")));

    static private final SubLString $str_alt77$About_to_execute_Salient_Descript = makeString("About to execute Salient Descriptor tactics in code in ");





    public static final SubLObject $$IdentifySDCandidates_CMQuerySpec = constant_handles.reader_make_constant_shell(makeString("IdentifySDCandidates-CMQuerySpec"));

    static private final SubLString $str_alt81$Was_expecting_exactly_one_free_va = makeString("Was expecting exactly one free variable in the query spec ");

    static private final SubLString $str_alt82$__but_found_ = makeString(", but found ");

    static private final SubLString $str_alt83$_ = makeString(".");

    static private final SubLString $str_alt84$Query_sentence__ = makeString("Query sentence: ");

    static private final SubLString $str_alt85$Free_vars__ = makeString("Free vars: ");

    static private final SubLString $str_alt86$About_to_execute_Salient_Descript = makeString("About to execute Salient Descriptor strategies for ");

    static private final SubLString $str_alt87$_in_ = makeString(" in ");



    public static final SubLInteger $int$45 = makeInteger(45);



    static private final SubLSymbol $sym91$EL_SENTENCE_ASKABLE_ = makeSymbol("EL-SENTENCE-ASKABLE?");

    static private final SubLString $str_alt92$Can_only_handle_SD_questions_with = makeString("Can only handle SD questions with exactly one free variable.  Got: ~S");

    public static final SubLInteger $int$999999 = makeInteger(999999);

    static private final SubLString $str_alt94$Failed_to_produce_answer_choices_ = makeString("Failed to produce answer choices for Salient Descriptor question ~S");

    private static final SubLSymbol RKF_SD_EXAMPLE_TERM = makeSymbol("RKF-SD-EXAMPLE-TERM");

    static private final SubLString $str_alt96$Suppressing_Salient_Descriptor_qu = makeString("Suppressing Salient Descriptor question because of failure to acceptably paraphrase it: ~S -> ~S");

    static private final SubLString $str_alt97$Suppressing_Salient_Descriptor_qu = makeString("Suppressing Salient Descriptor question because of failure to paraphrase any of the answer choices.~%Question: ~S~%Answers: ~S");

    static private final SubLString $str_alt98$prompt_for_info = makeString("prompt_for_info");

    static private final SubLList $list_alt99 = list(makeSymbol("PROMPT"), makeSymbol("VAR-CHOICES-PAIRS"));

    static private final SubLString $str_alt100$SD_question_spec_ = makeString("SD question spec ");

    static private final SubLString $str_alt101$_doesn_t_have_exactly_one_free_va = makeString(" doesn't have exactly one free variable");

    static private final SubLList $list_alt102 = list(makeSymbol("VAR"), makeSymbol("CHOICES"));

    static private final SubLString $str_alt103$Which_of_the_following_questions_ = makeString("Which of the following questions did you mean to ask?");

    static private final SubLString $str_alt104$clarification_options = makeString("clarification_options");

    private static final SubLSymbol CLARIFICATION_OPTIONS_FOR_UTTERANCE = makeSymbol("CLARIFICATION-OPTIONS-FOR-UTTERANCE");

    static private final SubLList $list_alt106 = list(makeSymbol("UTTERANCE-PEG"), makeSymbol("SESSION-MT"), makeSymbol("GENERATION-MT"));

    static private final SubLString $str_alt107$Precisify_the_interpretation_of_t = makeString("Precisify the interpretation of the user\'s question UTTERANCE-PEG to more-easily-answerable questions, and generate NL for them.\n   This is basically an ask on the predicate #$candidateClarificationQuestion with\n   the strategy #$SuggestMorePreciseVersionsOfUnboundQuery-ClarificationStrategy, plus NL generation.\n   @example (clarification-options-for-utterance #$MyS-HowBigIsAfghanistanExpPeg #$SomeSessionMt #$SomeGenerationMt)\n            => ((#$clarifiedPegInterpretations #$MyS-HowBigIsAfghanistanExpPeg ?WHAT)\n                ``Which of the following questions did you mean to ask?\'\'\n                0.85\n                (((#$clarifiedPegInterpretations #$MyS-HowBigIsAfghanistanExpPeg (#$numberOfInhabitants #$Afghanistan ?SIZE))\n                  ``What is the population of Afghanistan?\'\')\n                 ((#$clarifiedPegInterpretations #$MyS-HowBigIsAfghanistanExpPeg\n                   (#$areaOfRegion (#$TerritoryFn #$Afghanistan) ?SIZE))\n                  ``What is the area of Afghanistan?\'\')))");

    static private final SubLList $list_alt108 = list(list(makeSymbol("UTTERANCE-PEG"), makeSymbol("FORT-P")), list(makeSymbol("SESSION-MT"), makeSymbol("MICROTHEORY-P")), list(makeSymbol("GENERATION-MT"), makeSymbol("MICROTHEORY-P")));

    static private final SubLList $list_alt109 = list(makeSymbol("MYSENTIENT-CLARIFICATION-QUESTION-SPEC-P"));

    static private final SubLString $str_alt110$About_to_make_clarification_answe = makeString("About to make clarification answer choices for the answer choices ");

    static private final SubLString $str_alt111$_to_the_question_ = makeString(" to the question ");



    static private final SubLString $str_alt113$Failed_to_paraphrase_any_of_ = makeString("Failed to paraphrase any of ");

    static private final SubLList $list_alt114 = list(makeSymbol("ANSWER-CHOICE"), makeSymbol("PARAPHRASE"));

    static private final SubLString $str_alt115$Made_clarification_answer_choices = makeString("Made clarification answer choices: ");

    static private final SubLList $list_alt116 = list(makeSymbol("FIRST"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("FOURTH"), makeSymbol("FIFTH"));

    private static final SubLSymbol MYSENTIENT_CLARIFICATION_ANSWER_CHOICE_P = makeSymbol("MYSENTIENT-CLARIFICATION-ANSWER-CHOICE-P");

    public static final SubLObject $const118$SuggestMorePreciseVersionsOfUnbou = constant_handles.reader_make_constant_shell(makeString("SuggestMorePreciseVersionsOfUnboundQuery-ClarificationStrategy"));

    public static final SubLFloat $float$1_0 = makeDouble(1.0);



    static private final SubLSymbol $sym121$_X = makeSymbol("?X");

    public static final SubLObject $$candidateClarificationQuestion = constant_handles.reader_make_constant_shell(makeString("candidateClarificationQuestion"));

    static private final SubLList $list_alt123 = list(constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell(makeString("infinitive")), constant_handles.reader_make_constant_shell(makeString("regularDegree")), constant_handles.reader_make_constant_shell(makeString("properNameStrings")));

    public static final SubLInteger $int$40 = makeInteger(40);



    static private final SubLString $str_alt126$Trying_to_get_Salient_Descriptor_ = makeString("Trying to get Salient Descriptor questions for ");

    public static final SubLSymbol $kw127$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_ = makeKeyword("SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?");

    static private final SubLString $str_alt128$Can_only_handle_SD_prompts_with_e = makeString("Can only handle SD prompts with exactly one free variable.  Got: ");

    static private final SubLString $str_alt129$Suppressing_SD_prompt_because_I_c = makeString("Suppressing SD prompt because I couldn't generate examples: ");

    private static final SubLSymbol $MAX_QUESTIONS = makeKeyword("MAX-QUESTIONS");

    static private final SubLString $str_alt131$Hit_the_ = makeString("Hit the ");

    static private final SubLString $str_alt132$_second_time_limit_trying_to_get_ = makeString(" second time limit trying to get Salient Descriptor questions for ");

    static private final SubLString $str_alt133$Got_the_following_Salient_Descrip = makeString("Got the following Salient Descriptor questions for ");

    static private final SubLString $str_alt134$__ = makeString(": ");

    static private final SubLList $list_alt135 = list(makeKeyword("CONSTRAINT-MATCHER"));

    private static final SubLSymbol MYSENTIENT_SALIENT_DESCRIPTOR_VAR_OPTION_P = makeSymbol("MYSENTIENT-SALIENT-DESCRIPTOR-VAR-OPTION-P");

    // // Initializers
    public void declareFunctions() {
        declare_mysentient_clarification_manager_widgets_file();
    }

    public void initializeVariables() {
        init_mysentient_clarification_manager_widgets_file();
    }

    public void runTopLevelForms() {
        setup_mysentient_clarification_manager_widgets_file();
    }
}

