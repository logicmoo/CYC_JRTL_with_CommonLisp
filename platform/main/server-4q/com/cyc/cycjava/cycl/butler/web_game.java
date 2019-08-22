package com.cyc.cycjava.cycl.butler;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.html_utilities.html_string;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.pph_data_structures;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_iterators;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class web_game extends SubLTranslatedFile {
    public static final SubLFile me = new web_game();

    public static final String myName = "com.cyc.cycjava.cycl.butler.web_game";

    public static final String myFingerPrint = "50c1d3a92358ada1bbafffd0553da7b4586c60df6b349ff6ad791eb0c67df625";

    // defparameter
    // Definitions
    // The MT where we go looking for sentences to ask the users.
    private static final SubLSymbol $web_game_default_domain_mt$ = makeSymbol("*WEB-GAME-DEFAULT-DOMAIN-MT*");

    // defparameter
    /**
     * The MT where we go looking for received answers and will store future
     * answers.
     */
    private static final SubLSymbol $web_game_default_evaluation_mt$ = makeSymbol("*WEB-GAME-DEFAULT-EVALUATION-MT*");

    // defparameter
    // The default query to try for the quiescence data.
    private static final SubLSymbol $web_game_questions_query$ = makeSymbol("*WEB-GAME-QUESTIONS-QUERY*");

    // defparameter
    /**
     * The alternate query to fill up whatever the quiescence data could not find.
     */
    private static final SubLSymbol $web_game_alternate_questions_query$ = makeSymbol("*WEB-GAME-ALTERNATE-QUESTIONS-QUERY*");

    // defparameter
    // We try to return this many answers by default.
    private static final SubLSymbol $web_game_default_max_number$ = makeSymbol("*WEB-GAME-DEFAULT-MAX-NUMBER*");

    // deflexical
    // The variable that contains the result for the question to ask the user.
    private static final SubLSymbol $question_to_ask_variable$ = makeSymbol("*QUESTION-TO-ASK-VARIABLE*");

    // deflexical
    // The template name element that we will replace with the user-alias.
    private static final SubLSymbol $question_to_ask_user_template_name$ = makeSymbol("*QUESTION-TO-ASK-USER-TEMPLATE-NAME*");

    // deflexical
    private static final SubLSymbol $evaluation_predicate_variable$ = makeSymbol("*EVALUATION-PREDICATE-VARIABLE*");

    // deflexical
    private static final SubLSymbol $evaluation_timestamp_variable$ = makeSymbol("*EVALUATION-TIMESTAMP-VARIABLE*");

    // deflexical
    private static final SubLSymbol $evaluation_information_set_variable$ = makeSymbol("*EVALUATION-INFORMATION-SET-VARIABLE*");

    // deflexical
    // The variable that contains the result for the goal type of the question.
    private static final SubLSymbol $evaluation_goaltype_variable$ = makeSymbol("*EVALUATION-GOALTYPE-VARIABLE*");

    // defparameter
    // See also BeliefCalculator.java
    private static final SubLSymbol $maximum_belief_for_question$ = makeSymbol("*MAXIMUM-BELIEF-FOR-QUESTION*");

    // defparameter
    // See also BeliefCalculator.java
    private static final SubLSymbol $maximum_votes_for_question$ = makeSymbol("*MAXIMUM-VOTES-FOR-QUESTION*");

    // deflexical
    // The query that we employ to get multiple choice iterators.
    private static final SubLSymbol $web_game_choice_questions_query$ = makeSymbol("*WEB-GAME-CHOICE-QUESTIONS-QUERY*");

    // deflexical
    /**
     * The list of queries that we will work over for the question generation task.
     */
    private static final SubLSymbol $web_game_master_query_set$ = makeSymbol("*WEB-GAME-MASTER-QUERY-SET*");









    // defparameter
    /**
     * When a DICTIONARY-P, the a map of HL external ID strings to internal IDs
     * which allow the recipient of the message to use the short IDs rather than the
     * long ones.
     */
    private static final SubLSymbol $web_game_terms_identification_tracking$ = makeSymbol("*WEB-GAME-TERMS-IDENTIFICATION-TRACKING*");

    // deflexical
    private static final SubLSymbol $web_game_choice_placeholder_in_sentence$ = makeSymbol("*WEB-GAME-CHOICE-PLACEHOLDER-IN-SENTENCE*");

    // deflexical
    public static final SubLSymbol $web_game_recording_mt$ = makeSymbol("*WEB-GAME-RECORDING-MT*");

    // deflexical
    private static final SubLSymbol $web_game_agent_identification_token$ = makeSymbol("*WEB-GAME-AGENT-IDENTIFICATION-TOKEN*");

    // deflexical
    private static final SubLSymbol $web_game_large_example_question_set$ = makeSymbol("*WEB-GAME-LARGE-EXAMPLE-QUESTION-SET*");

    private static final SubLObject $$MachineLearningSpindleCollectorMt = reader_make_constant_shell(makeString("MachineLearningSpindleCollectorMt"));

    private static final SubLObject $$SuggestedSentencesMt = reader_make_constant_shell(makeString("SuggestedSentencesMt"));

    private static final SubLObject $const2$WebGame_QuiescenceData_WithGoalTy = reader_make_constant_shell(makeString("WebGame-QuiescenceData-WithGoalType-Sets-NoInOrAbduction"));

    private static final SubLObject $const3$WebGame_UnevaluatedSentences_With = reader_make_constant_shell(makeString("WebGame-UnevaluatedSentences-WithGoalType-NoAbOrInduction-NEW"));

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLSymbol GET_QUESTIONS_TO_ASK_USER = makeSymbol("GET-QUESTIONS-TO-ASK-USER");

    public static final SubLSymbol ASCII_STRING_P = makeSymbol("ASCII-STRING-P");





    public static final SubLSymbol $sym9$_ = makeSymbol("<");





    private static final SubLObject $const12$KnowledgeAcquisitionGoal_Verifyin = reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus"));

    private static final SubLObject $const13$KnowledgeAcquisitionGoal_Verifyin = reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingInduction"));



    public static final SubLSymbol DESTROY_INFERENCE_AND_PROBLEM_STORE = makeSymbol("DESTROY-INFERENCE-AND-PROBLEM-STORE");



    public static final SubLSymbol $sym17$_SENTENCE = makeSymbol("?SENTENCE");

    public static final SubLString $$$Boris = makeString("Boris");

    public static final SubLSymbol $sym19$_OUTPUT = makeSymbol("?OUTPUT");

    public static final SubLSymbol $sym20$_TIME = makeSymbol("?TIME");

    public static final SubLSymbol $sym21$_EVAL_SET = makeSymbol("?EVAL-SET");



    public static final SubLSymbol $sym23$_GOAL_TYPE = makeSymbol("?GOAL-TYPE");

    private static final SubLObject $const24$KnowledgeAcquisitionGoal_Verifyin = reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation"));

    private static final SubLObject $const25$KnowledgeAcquisitionGoal_Verifyin = reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingAbduction"));

    private static final SubLObject $const26$KnowledgeAcquisitionGoal_Verifyin = reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKBContent"));

    public static final SubLString $str27$Unknown_question_type__A____dont_ = makeString("Unknown question type ~A -- dont know what to do.");



    private static final SubLObject $$TrueCycLSentence = reader_make_constant_shell(makeString("TrueCycLSentence"));

    private static final SubLObject $$FalseCycLSentence = reader_make_constant_shell(makeString("FalseCycLSentence"));

    public static final SubLSymbol $sym31$QUESTION_STILL_NEEDS_TO_BE_ASKED_OF_USER_ = makeSymbol("QUESTION-STILL-NEEDS-TO-BE-ASKED-OF-USER?");













    private static final SubLList $list38 = list(list(list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")))), T), list(list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(new SubLObject[]{ reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")) })), NIL), list(list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(new SubLObject[]{ reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")) })), NIL), list(list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")))), T));

    private static final SubLObject $const39$WebGame_MultipleChoiceSentences_W = reader_make_constant_shell(makeString("WebGame-MultipleChoiceSentences-WithGoalType"));

    private static final SubLSymbol GET_ITERATOR_FOR_QUESTIONS_TO_ASK = makeSymbol("GET-ITERATOR-FOR-QUESTIONS-TO-ASK");

    private static final SubLSymbol QUESTIONS_TO_ASK_ITERATOR_DONE = makeSymbol("QUESTIONS-TO-ASK-ITERATOR-DONE");

    private static final SubLSymbol QUESTIONS_TO_ASK_ITERATOR_NEXT = makeSymbol("QUESTIONS-TO-ASK-ITERATOR-NEXT");

    private static final SubLSymbol QUESTIONS_TO_ASK_ITERATOR_FINALIZE = makeSymbol("QUESTIONS-TO-ASK-ITERATOR-FINALIZE");

    private static final SubLList $list44 = list(makeSymbol("INFERENCE-ITERATOR"), makeSymbol("COUNTER"), makeSymbol("DOMAIN-MT"));

    private static final SubLSymbol $sym45$_SET = makeSymbol("?SET");

    private static final SubLSymbol GET_TOPICAL_ITERATOR_FOR_QUESTIONS_TO_ASK = makeSymbol("GET-TOPICAL-ITERATOR-FOR-QUESTIONS-TO-ASK");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLSymbol TOPICAL_QUESTIONS_TO_ASK_ITERATOR_DONE = makeSymbol("TOPICAL-QUESTIONS-TO-ASK-ITERATOR-DONE");

    private static final SubLSymbol TOPICAL_QUESTIONS_TO_ASK_ITERATOR_NEXT = makeSymbol("TOPICAL-QUESTIONS-TO-ASK-ITERATOR-NEXT");

    private static final SubLSymbol TOPICAL_QUESTIONS_TO_ASK_ITERATOR_FINALIZE = makeSymbol("TOPICAL-QUESTIONS-TO-ASK-ITERATOR-FINALIZE");

    private static final SubLList $list52 = list(makeSymbol("QUESTION-ITERATOR"), makeSymbol("TOPICS-FILTER"), makeSymbol("COUNTER"));

    public static final SubLList $list53 = list(makeSymbol("TYPE"), makeSymbol("QUESTIONS"), makeSymbol("RESPONSES"), makeSymbol("TOPICS"), makeSymbol("SET"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLString $str55$Malformed_topics_filter_expressio = makeString("Malformed topics filter expression ~A.");

    private static final SubLString $str56$Implementation_error__overlooked_ = makeString("Implementation error: overlooked case in matching filter expression ~A.");

    private static final SubLSymbol $sym57$TOPIC_MATCHES_TOPICS_FILTER_ = makeSymbol("TOPIC-MATCHES-TOPICS-FILTER?");

    private static final SubLList $list58 = list(list(list(list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule"))))), T), list(list(reader_make_constant_shell(makeString("Entertainment-Topic")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule"))))), NIL), list(list(list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule"))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("or")), reader_make_constant_shell(makeString("Entertainment-Topic")), reader_make_constant_shell(makeString("Ailments-Topic"))))), T), list(list(reader_make_constant_shell(makeString("Ailments-Topic")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("or")), reader_make_constant_shell(makeString("Entertainment-Topic")), reader_make_constant_shell(makeString("Ailments-Topic"))))), NIL), list(list(list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Entertainment-Topic"))), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Ailments-Topic"))))), T), list(list(reader_make_constant_shell(makeString("Ailments-Topic")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Entertainment-Topic"))), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Ailments-Topic"))))), NIL));

    private static final SubLSymbol $sym59$TOPIC_LIST_MATCHES_TOPICS_FILTER_ = makeSymbol("TOPIC-LIST-MATCHES-TOPICS-FILTER?");

    private static final SubLList $list60 = list(list(list(list(list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule")))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule"))))), T), list(list(list(reader_make_constant_shell(makeString("Entertainment-Topic"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule"))))), NIL), list(list(list(list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule")))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("or")), reader_make_constant_shell(makeString("Entertainment-Topic")), reader_make_constant_shell(makeString("Ailments-Topic"))))), T), list(list(list(reader_make_constant_shell(makeString("Ailments-Topic"))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("or")), reader_make_constant_shell(makeString("Entertainment-Topic")), reader_make_constant_shell(makeString("Ailments-Topic"))))), NIL), list(list(list(list(reader_make_constant_shell(makeString("GoalOfVerifyingPredPopHypothesisAboutTopicFn")), reader_make_constant_shell(makeString("NounCompoundRule")))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Entertainment-Topic"))), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Ailments-Topic"))))), T), list(list(list(reader_make_constant_shell(makeString("Ailments-Topic"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Entertainment-Topic"))), list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("Ailments-Topic"))))), NIL));

    private static final SubLSymbol QUESTION_TOPICS_INFORMATION_FOR_PREDICATE = makeSymbol("QUESTION-TOPICS-INFORMATION-FOR-PREDICATE");



    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    private static final SubLObject $const64$FactFactoryVerificationSentencesM = reader_make_constant_shell(makeString("FactFactoryVerificationSentencesMt"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$FACToryVerificationPredForTopicFn = reader_make_constant_shell(makeString("FACToryVerificationPredForTopicFn"));

    private static final SubLList $list67 = list(reader_make_constant_shell(makeString("Thing")));

    private static final SubLSymbol $question_topics_information_for_predicate_caching_state$ = makeSymbol("*QUESTION-TOPICS-INFORMATION-FOR-PREDICATE-CACHING-STATE*");

    private static final SubLSymbol TITLE_FOR_QUESTION_TOPIC = makeSymbol("TITLE-FOR-QUESTION-TOPIC");



    private static final SubLObject $$TopicMt = reader_make_constant_shell(makeString("TopicMt"));

    private static final SubLObject $$topicTitle = reader_make_constant_shell(makeString("topicTitle"));

    private static final SubLList $list73 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLString $$$General = makeString("General");

    private static final SubLSymbol $title_for_question_topic_caching_state$ = makeSymbol("*TITLE-FOR-QUESTION-TOPIC-CACHING-STATE*");

    private static final SubLSymbol EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC = makeSymbol("EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC");

    private static final SubLSymbol $external_identification_for_question_topic_caching_state$ = makeSymbol("*EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC-CACHING-STATE*");

    private static final SubLSymbol EXTERNAL_IDENTIFICATION_FOR_CHOICE = makeSymbol("EXTERNAL-IDENTIFICATION-FOR-CHOICE");

    private static final SubLSymbol $external_identification_for_choice_caching_state$ = makeSymbol("*EXTERNAL-IDENTIFICATION-FOR-CHOICE-CACHING-STATE*");

    private static final SubLSymbol GENERATE_XML_FILE_OF_QUESTIONS_TO_ASK = makeSymbol("GENERATE-XML-FILE-OF-QUESTIONS-TO-ASK");



    private static final SubLString $str82$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol GENERATE_XML_FILE_OF_TOPICAL_QUESTIONS_TO_ASK = makeSymbol("GENERATE-XML-FILE-OF-TOPICAL-QUESTIONS-TO-ASK");

    private static final SubLSymbol COMPUTE_TOPICAL_QUESTIONS_TO_ASK = makeSymbol("COMPUTE-TOPICAL-QUESTIONS-TO-ASK");

    private static final SubLList $list85 = list(makeSymbol("TYPE"), makeSymbol("SENTENCES"), makeSymbol("&OPTIONAL"), makeSymbol("RESPONSES"), makeSymbol("TOPIC-INFOS"), makeSymbol("CHOICE-SET"));

    private static final SubLSymbol GET_TOPIC_QUESTIONS_COUNT = makeSymbol("GET-TOPIC-QUESTIONS-COUNT");

    private static final SubLSymbol $sym87$_ = makeSymbol(">");



    private static final SubLSymbol GENERATE_STRIPED_XML_FOR_QUESTION_TO_ASK_USER = makeSymbol("GENERATE-STRIPED-XML-FOR-QUESTION-TO-ASK-USER");

    private static final SubLString $str90$Generating_striped_XML_____ = makeString("Generating striped XML ....");

    private static final SubLList $list91 = cons(makeSymbol("PREDICATE"), makeSymbol("TIMES"));

    private static final SubLSymbol $sym92$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol GENERATE_STRIPED_QUESTION_LIST_ITERATOR_TO_ASK_USER = makeSymbol("GENERATE-STRIPED-QUESTION-LIST-ITERATOR-TO-ASK-USER");

    private static final SubLString $str94$Generating_striped_list_iterator_ = makeString("Generating striped list iterator ....");

    private static final SubLSymbol GET_QUESTIONS_TO_ASK_USER_IN_XML = makeSymbol("GET-QUESTIONS-TO-ASK-USER-IN-XML");



    private static final SubLList $list97 = list(list(makeSymbol("*WEB-GAME-TERMS-IDENTIFICATION-TRACKING*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))));

    private static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");

    private static final SubLString $$$askingQuestions = makeString("askingQuestions");

    private static final SubLString $str100$http___www_opencyc_org_xml_asking = makeString("http://www.opencyc.org/xml/askingQuestions.dtd");



    private static final SubLString $$$questionSets = makeString("questionSets");

    private static final SubLString $$$questionSet = makeString("questionSet");

    private static final SubLObject $const104$KnowledgeAcquisitionGoal_Falsifyi = reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-FalsifyingLies"));

    private static final SubLString $str105$Dont_know_how_to_handle_question_ = makeString("Dont know how to handle question set type ~A.");

    private static final SubLString $str106$Falsifying_Lies_are_not_supported = makeString("Falsifying-Lies are not supported yet; skipped ~D.~%");

    private static final SubLSymbol $sym107$_VALUE = makeSymbol("?VALUE");

    private static final SubLString $$$choiceQuestion = makeString("choiceQuestion");

    private static final SubLString $$$prologue = makeString("prologue");

    private static final SubLString $str110$Please_complete_the_following_sen = makeString("Please complete the following sentence ....");

    private static final SubLString $$$incompleteSentence = makeString("incompleteSentence");

    private static final SubLString $$$questions = makeString("questions");

    private static final SubLString $$$epilogue = makeString("epilogue");

    private static final SubLString $str114$I_ve_narrowed_down_the_choices_to = makeString("I've narrowed down the choices to these.");

    public static final SubLString $str115$I_ve_narrowed_down_the_choices_to = makeString("I've narrowed down the choices to one of these.");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str117$_____ = makeString("_____");





    private static final SubLString $$$entryType = makeString("entryType");

    private static final SubLString $$$multiple = makeString("multiple");

    private static final SubLString $$$single = makeString("single");

    private static final SubLString $$$choices = makeString("choices");

    private static final SubLList $list124 = cons(makeSymbol("CHOICE"), makeSymbol("RENDERING"));

    private static final SubLString $$$suid = makeString("suid");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$choice = makeString("choice");

    private static final SubLString $$$readingQuestion = makeString("readingQuestion");

    private static final SubLString $str129$I_am_thinking_of_a_sentence_____ = makeString("I am thinking of a sentence ....");

    private static final SubLString $str130$Because_I_read_it_on_the_web_ = makeString("Because I read it on the web.");

    private static final SubLString $$$abductiveQuestion = makeString("abductiveQuestion");

    private static final SubLString $str132$Because_I_am_guessing_ = makeString("Because I am guessing.");

    private static final SubLString $$$hypothesizedQuestion = makeString("hypothesizedQuestion");

    private static final SubLString $str134$Because_I_think_it_might_be_true_ = makeString("Because I think it might be true.");

    private static final SubLString $$$kbQuestion = makeString("kbQuestion");

    private static final SubLString $str136$Because_someone_told_me_so_ = makeString("Because someone told me so.");



    private static final SubLString $$$ruleQuestion = makeString("ruleQuestion");

    private static final SubLString $str139$I_have_an_idea__if_I_am_right_it_ = makeString("I have an idea; if I am right it would mean that ....");

    private static final SubLString $$$ruleText = makeString("ruleText");

    private static final SubLString $str141$Because_if_I_am_right_it_would_me = makeString("Because if I am right it would mean: ");

    private static final SubLString $$$question = makeString("question");

    private static final SubLString $$$topics = makeString("topics");

    private static final SubLList $list144 = list(makeSymbol("TOPIC"), makeSymbol("TITLE"));

    private static final SubLString $$$topic = makeString("topic");

    private static final SubLString $$$text = makeString("text");

    private static final SubLString $$$responses = makeString("responses");

    private static final SubLString $str148$_ = makeString(",");

    private static final SubLString $$$T = makeString("T");

    private static final SubLString $$$F = makeString("F");

    private static final SubLObject $$SkippedCycLSentence = reader_make_constant_shell(makeString("SkippedCycLSentence"));

    private static final SubLString $$$S = makeString("S");

    private static final SubLObject $$UnclearCycLSentence = reader_make_constant_shell(makeString("UnclearCycLSentence"));

    private static final SubLString $$$N = makeString("N");

    private static final SubLString $str155$Dont_know_how_to_deal_with_respon = makeString("Dont know how to deal with response ~A");

    private static final SubLSymbol NOTE_USER_EVALUATIONS_OF_SENTENCES = makeSymbol("NOTE-USER-EVALUATIONS-OF-SENTENCES");

    private static final SubLList $list157 = list(makeSymbol("HL-EXTERNAL"), makeSymbol("PREDICATE"));

    private static final SubLSymbol NOTE_USER_EVALUATION_OF_SENTENCE = makeSymbol("NOTE-USER-EVALUATION-OF-SENTENCE");

    private static final SubLObject $$CycLPropositionalSentence = reader_make_constant_shell(makeString("CycLPropositionalSentence"));

    private static final SubLString $str160$Term__A_does_not_denote_a_valid_e = makeString("Term ~A does not denote a valid evaluation predicate");

    private static final SubLObject $$evaluationOfAs = reader_make_constant_shell(makeString("evaluationOfAs"));

    private static final SubLObject $$EvaluationOfByOnFn = reader_make_constant_shell(makeString("EvaluationOfByOnFn"));

    private static final SubLObject $$MtWithFocalContentSentenceFn = reader_make_constant_shell(makeString("MtWithFocalContentSentenceFn"));

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    private static final SubLObject $$SubCollectionNamedFn = reader_make_constant_shell(makeString("SubCollectionNamedFn"));

    private static final SubLList $list167 = list(reader_make_constant_shell(makeString("Person")));

    private static final SubLSymbol NOTE_GOAL_CATEGORY_FOR_SENTENCE = makeSymbol("NOTE-GOAL-CATEGORY-FOR-SENTENCE");

    private static final SubLObject $$goalCategoryForAgent = reader_make_constant_shell(makeString("goalCategoryForAgent"));

    private static final SubLObject $$Cyc = reader_make_constant_shell(makeString("Cyc"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym172$_TV = makeSymbol("?TV");

    private static final SubLObject $$knows = reader_make_constant_shell(makeString("knows"));

    private static final SubLObject $$sentenceTruth = reader_make_constant_shell(makeString("sentenceTruth"));

    private static final SubLList $list175 = list(makeSymbol("?TV"));

    public static final SubLList $list176 = list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal")));

    private static final SubLSymbol LOAD_USER_EVALUATED_SENTENCES = makeSymbol("LOAD-USER-EVALUATED-SENTENCES");



    private static final SubLString $$$Loading_webgame_results_from_ = makeString("Loading webgame results from ");

    private static final SubLString $str180$_____ = makeString(" ....");







    private static final SubLList $list184 = list(makeSymbol("BELIEF"), makeSymbol("SENTENCE-ID"));

    private static final SubLString $str185$Could_not_store_result__A____erro = makeString("Could not store result ~A -- error ~A.~%");

    private static final SubLSymbol LOAD_AND_SUBMIT_EVALUATED_SENTENCES_FROM_FILE = makeSymbol("LOAD-AND-SUBMIT-EVALUATED-SENTENCES-FROM-FILE");

    private static final SubLObject $$FACTory_WebGame = reader_make_constant_shell(makeString("FACTory-WebGame"));

    private static final SubLSymbol RECORD_CONSENSUS_SENTENCE_EVALUATION = makeSymbol("RECORD-CONSENSUS-SENTENCE-EVALUATION");

    private static final SubLObject $const189$sentenceAssignedStatusViaInfoStor = reader_make_constant_shell(makeString("sentenceAssignedStatusViaInfoStore"));







    private static final SubLObject $$RidiculousCycLSentence = reader_make_constant_shell(makeString("RidiculousCycLSentence"));



    private static final SubLObject $$UninterestingCycLSentence = reader_make_constant_shell(makeString("UninterestingCycLSentence"));



    private static final SubLObject $$PlausibleCycLSentence = reader_make_constant_shell(makeString("PlausibleCycLSentence"));



    private static final SubLObject $$ImplausibleCycLSentence = reader_make_constant_shell(makeString("ImplausibleCycLSentence"));





    private static final SubLObject $list202 = _constant_202_initializer();

    public static SubLObject get_questions_to_ask_user(final SubLObject user_alias, SubLObject domain_mt, SubLObject evaluation_mt, SubLObject max_number) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        if (evaluation_mt == UNPROVIDED) {
            evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
        }
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != unicode_strings.ascii_string_p(user_alias) : "unicode_strings.ascii_string_p(user_alias) " + "CommonSymbols.NIL != unicode_strings.ascii_string_p(user_alias) " + user_alias;
        assert NIL != hlmt.possibly_hlmt_p(domain_mt) : "hlmt.possibly_hlmt_p(domain_mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(domain_mt) " + domain_mt;
        assert NIL != hlmt.possibly_hlmt_p(evaluation_mt) : "hlmt.possibly_hlmt_p(evaluation_mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(evaluation_mt) " + evaluation_mt;
        assert NIL != subl_promotions.positive_integer_p(max_number) : "subl_promotions.positive_integer_p(max_number) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(max_number) " + max_number;
        SubLObject sentences = NIL;
        SubLObject found = ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject seen_sentences = get_bindings_dictionary_for_questions_to_ask_user(user_alias, domain_mt, evaluation_mt, max_number);
        final SubLObject question_types = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(seen_sentences)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sentence = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject eval_info = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject sorted_info = Sort.sort(eval_info, symbol_function($sym9$_), symbol_function(FIRST));
            final SubLObject responses = Mapping.mapcar(symbol_function(SECOND), sorted_info);
            final SubLObject question_type = dictionary.dictionary_lookup(question_types, sentence, $const12$KnowledgeAcquisitionGoal_Verifyin);
            if (NIL != question_still_needs_to_be_asked_of_userP(question_type, responses)) {
                sentences = cons(list(question_type, list(sentence), responses), sentences);
                found = add(found, ONE_INTEGER);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (found.numL(max_number)) {
            SubLObject cdolist_list_var;
            final SubLObject alt_bindings = cdolist_list_var = get_alternate_bindings_for_questions_to_ask_user(user_alias, domain_mt, evaluation_mt, subtract(max_number, found));
            SubLObject alt_binding_set = NIL;
            alt_binding_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_question = extract_question_to_ask_from_alt_binding_set(alt_binding_set);
                final SubLObject question_type2 = extract_goal_type_from_alt_binding_set(alt_binding_set);
                sentences = cons(list(question_type2, list(v_question)), sentences);
                found = add(found, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                alt_binding_set = cdolist_list_var.first();
            } 
        }
        return list_utilities.randomize_list(sentences);
    }

    public static SubLObject get_alternate_bindings_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt, final SubLObject number) {
        return inference_kernel.new_cyc_query(get_alternate_query_for_questions_to_ask_user(user_alias, domain_mt, evaluation_mt), domain_mt, get_alternate_query_properties_for_questions_to_ask_user(number));
    }

    public static SubLObject package_sentence_for_question_to_be_asked_of_user(final SubLObject v_question, final SubLObject question_type, final SubLObject domain_mt) {
        if ($const13$KnowledgeAcquisitionGoal_Verifyin.eql(question_type)) {
            SubLTrampolineFile.enforceType(v_question, EL_IMPLICATION_P);
            final SubLObject examples = example_finder.example_consequents_for_rule(v_question, domain_mt, UNPROVIDED, UNPROVIDED);
            return cons(v_question, examples);
        }
        return list(v_question);
    }

    public static SubLObject get_bindings_dictionary_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = get_query_for_questions_to_ask_user(user_alias, domain_mt, evaluation_mt);
        final SubLObject question_sentences = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject question_types = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject query_properties = get_query_properties_for_questions_to_ask_user(max_number);
        final SubLObject static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(query_properties);
        final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
        final SubLObject inference = inference_kernel.new_continuable_inference(query, domain_mt, static_properties);
        final SubLObject inference_iterator = inference_iterators.new_inference_iterator(inference, dynamic_properties, DESTROY_INFERENCE_AND_PROBLEM_STORE);
        SubLObject done_var;
        SubLObject valid;
        for (SubLObject doneP = done_var = NIL; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = iteration.iteration_next(inference_iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject v_question = extract_question_to_ask_from_binding_set(v_bindings);
                final SubLObject question_type = extract_goal_type_from_binding_set(v_bindings);
                final SubLObject eval_info = extract_evaluation_information_set_from_binding_set(v_bindings);
                if (dictionary.dictionary_length(question_sentences).numG($web_game_default_max_number$.getDynamicValue(thread))) {
                    doneP = T;
                } else {
                    dictionary.dictionary_enter(question_sentences, v_question, eval_info);
                    dictionary.dictionary_enter(question_types, v_question, question_type);
                }
            }
        }
        return values(question_sentences, question_types);
    }

    public static SubLObject get_query_properties_for_questions_to_ask_user(final SubLObject max_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = kb_query.kbq_query_properties($web_game_questions_query$.getDynamicValue(thread));
        return putf(copy_list(v_properties), $MAX_NUMBER, max_number);
    }

    public static SubLObject get_alternate_query_properties_for_questions_to_ask_user(final SubLObject max_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return get_query_properties_with_max_number_override($web_game_alternate_questions_query$.getDynamicValue(thread), max_number);
    }

    public static SubLObject get_query_properties_with_max_number_override(final SubLObject v_term, final SubLObject max_number) {
        final SubLObject v_properties = kb_query.kbq_query_properties(v_term);
        return putf(copy_list(v_properties), $MAX_NUMBER, max_number);
    }

    public static SubLObject get_alternate_query_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_query.kbq_sentence($web_game_alternate_questions_query$.getDynamicValue(thread));
    }

    public static SubLObject get_query_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subst(user_alias, $question_to_ask_user_template_name$.getGlobalValue(), kb_query.kbq_sentence($web_game_questions_query$.getDynamicValue(thread)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject extract_question_to_ask_from_alt_binding_set(final SubLObject binding_set) {
        return extract_question_to_ask_from_binding_set(binding_set);
    }

    public static SubLObject extract_question_to_ask_from_binding_set(final SubLObject binding_set) {
        return bindings.variable_lookup($question_to_ask_variable$.getGlobalValue(), binding_set);
    }

    public static SubLObject extract_evaluation_information_from_binding_set(final SubLObject binding_set) {
        final SubLObject predicate = bindings.variable_lookup($evaluation_predicate_variable$.getGlobalValue(), binding_set);
        final SubLObject timestamp = bindings.variable_lookup($evaluation_timestamp_variable$.getGlobalValue(), binding_set);
        return list(timestamp, predicate);
    }

    public static SubLObject extract_evaluation_information_set_from_binding_set(final SubLObject binding_set) {
        final SubLObject eval_set = bindings.variable_lookup($evaluation_information_set_variable$.getGlobalValue(), binding_set);
        return Mapping.mapcar(REST, eval_set.rest());
    }

    public static SubLObject extract_goal_type_from_binding_set(final SubLObject binding_set) {
        return bindings.variable_lookup($evaluation_goaltype_variable$.getGlobalValue(), binding_set);
    }

    public static SubLObject extract_goal_type_from_alt_binding_set(final SubLObject binding_set) {
        return bindings.variable_lookup($evaluation_goaltype_variable$.getGlobalValue(), binding_set);
    }

    public static SubLObject question_still_needs_to_be_asked_of_userP(final SubLObject question_type, final SubLObject responses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject belief = NIL;
        if (question_type.eql($const12$KnowledgeAcquisitionGoal_Verifyin) || question_type.eql($const13$KnowledgeAcquisitionGoal_Verifyin)) {
            belief = integerDivide($maximum_belief_for_question$.getDynamicValue(thread), TWO_INTEGER);
        } else
            if (question_type.eql($const24$KnowledgeAcquisitionGoal_Verifyin)) {
                belief = integerDivide($maximum_belief_for_question$.getDynamicValue(thread), TWO_INTEGER);
            } else
                if (question_type.eql($const25$KnowledgeAcquisitionGoal_Verifyin)) {
                    belief = integerDivide($maximum_belief_for_question$.getDynamicValue(thread), FOUR_INTEGER);
                } else
                    if (question_type.eql($const26$KnowledgeAcquisitionGoal_Verifyin)) {
                        belief = round(multiply(FOUR_INTEGER, divide($maximum_belief_for_question$.getDynamicValue(thread), FIVE_INTEGER)), UNPROVIDED);
                    } else {
                        Errors.error($str27$Unknown_question_type__A____dont_, question_type);
                    }



        SubLObject list_var = NIL;
        SubLObject predicate = NIL;
        SubLObject vote = NIL;
        list_var = responses;
        predicate = list_var.first();
        for (vote = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , predicate = list_var.first() , vote = add(ONE_INTEGER, vote)) {
            assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
            if (vote.numGE($maximum_votes_for_question$.getDynamicValue(thread))) {
                return NIL;
            }
            SubLObject modified = NIL;
            final SubLObject amount = (vote.numLE(integerDivide($maximum_votes_for_question$.getDynamicValue(thread), TWO_INTEGER))) ? TWO_INTEGER : ONE_INTEGER;
            final SubLObject pcase_var = predicate;
            if (pcase_var.eql($$TrueCycLSentence)) {
                belief = add(belief, amount);
                modified = T;
            } else
                if (pcase_var.eql($$FalseCycLSentence)) {
                    belief = subtract(belief, amount);
                    modified = T;
                }

            if ((NIL != modified) && (NIL != belief_value_has_reached_certaintyP(belief))) {
                return NIL;
            }
        }
        return makeBoolean(NIL == belief_value_has_reached_certaintyP(belief));
    }

    public static SubLObject belief_value_has_reached_certaintyP(final SubLObject belief) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((!belief.isPositive()) || belief.numG($maximum_belief_for_question$.getDynamicValue(thread)));
    }

    public static SubLObject get_iterator_for_questions_to_ask(SubLObject domain_mt, SubLObject max_number, SubLObject topics_filter) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        if (topics_filter == UNPROVIDED) {
            topics_filter = NIL;
        }
        SubLObject iterators = NIL;
        SubLObject cdolist_list_var = $web_game_master_query_set$.getGlobalValue();
        SubLObject query_term = NIL;
        query_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject query = get_questions_query_sentence_with_topics_filtering(query_term, topics_filter);
            final SubLObject query_properties = get_query_properties_with_max_number_override(query_term, max_number);
            final SubLObject static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(query_properties);
            final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
            final SubLObject inference = inference_kernel.new_continuable_inference(query, domain_mt, static_properties);
            final SubLObject inference_iterator = inference_iterators.new_inference_iterator(inference, dynamic_properties, DESTROY_INFERENCE_AND_PROBLEM_STORE);
            iterators = cons(inference_iterator, iterators);
            cdolist_list_var = cdolist_list_var.rest();
            query_term = cdolist_list_var.first();
        } 
        final SubLObject master_iterator = iteration.new_rotating_iterator_iterator(iterators);
        return iteration.new_iterator(make_questions_to_ask_iterator_state(master_iterator, max_number, domain_mt), QUESTIONS_TO_ASK_ITERATOR_DONE, QUESTIONS_TO_ASK_ITERATOR_NEXT, QUESTIONS_TO_ASK_ITERATOR_FINALIZE);
    }

    public static SubLObject get_questions_query_sentence_with_topics_filtering(final SubLObject query_term, final SubLObject topics_filter) {
        final SubLObject sentence = kb_query.kbq_sentence(query_term);
        if (NIL != list_utilities.sublisp_boolean(topics_filter)) {
        }
        return sentence;
    }

    public static SubLObject make_questions_to_ask_iterator_state(final SubLObject inference_iterator, final SubLObject answer_count, final SubLObject domain_mt) {
        return list(inference_iterator, answer_count, domain_mt);
    }

    public static SubLObject questions_to_ask_iterator_next(SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = state;
        SubLObject inference_iterator = NIL;
        SubLObject counter = NIL;
        SubLObject domain_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        inference_iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        counter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        domain_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject alt_binding_set = iteration.iteration_next(inference_iterator);
            final SubLObject item_validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject v_question = extract_question_to_ask_from_alt_binding_set(alt_binding_set);
            final SubLObject question_type = extract_goal_type_from_alt_binding_set(alt_binding_set);
            final SubLObject responses = NIL;
            final SubLObject choices = bindings.variable_lookup($sym45$_SET, alt_binding_set);
            final SubLObject topics = extract_question_topics_from_question(v_question, domain_mt);
            if (NIL != item_validP) {
                counter = subtract(counter, ONE_INTEGER);
                state = make_questions_to_ask_iterator_state(inference_iterator, counter, domain_mt);
            }
            return values(list(question_type, list(v_question), responses, topics, choices), state, makeBoolean(NIL == item_validP));
        }
        cdestructuring_bind_error(datum, $list44);
        return NIL;
    }

    public static SubLObject questions_to_ask_iterator_done(final SubLObject state) {
        SubLObject inference_iterator = NIL;
        SubLObject counter = NIL;
        SubLObject domain_mt = NIL;
        destructuring_bind_must_consp(state, state, $list44);
        inference_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list44);
        counter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list44);
        domain_mt = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list44);
            return NIL;
        }
        if (!counter.isPositive()) {
            return T;
        }
        return iteration.iteration_done(inference_iterator);
    }

    public static SubLObject questions_to_ask_iterator_finalize(final SubLObject state) {
        SubLObject inference_iterator = NIL;
        SubLObject counter = NIL;
        SubLObject domain_mt = NIL;
        destructuring_bind_must_consp(state, state, $list44);
        inference_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list44);
        counter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list44);
        domain_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(inference_iterator);
        }
        cdestructuring_bind_error(state, $list44);
        return NIL;
    }

    public static SubLObject get_topical_iterator_for_questions_to_ask(SubLObject topics_filter, SubLObject domain_mt, SubLObject max_number) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        if (NIL != fort_types_interface.list_of_collections_p(topics_filter)) {
            topics_filter = list($$not, cons($$or, topics_filter));
        }
        final SubLObject question_iterator = get_iterator_for_questions_to_ask(domain_mt, $most_positive_fixnum$.getGlobalValue(), UNPROVIDED);
        return iteration.new_iterator(make_topical_questions_to_ask_iterator_state(question_iterator, topics_filter, max_number), TOPICAL_QUESTIONS_TO_ASK_ITERATOR_DONE, TOPICAL_QUESTIONS_TO_ASK_ITERATOR_NEXT, TOPICAL_QUESTIONS_TO_ASK_ITERATOR_FINALIZE);
    }

    public static SubLObject make_topical_questions_to_ask_iterator_state(final SubLObject question_iterator, final SubLObject topics_filter, final SubLObject counter) {
        return list(question_iterator, topics_filter, counter);
    }

    public static SubLObject topical_questions_to_ask_iterator_done(final SubLObject state) {
        SubLObject question_iterator = NIL;
        SubLObject topics_filter = NIL;
        SubLObject counter = NIL;
        destructuring_bind_must_consp(state, state, $list52);
        question_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list52);
        topics_filter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list52);
        counter = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list52);
            return NIL;
        }
        if (!counter.isPositive()) {
            return T;
        }
        return iteration.iteration_done(question_iterator);
    }

    public static SubLObject topical_questions_to_ask_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject question_iterator = NIL;
        SubLObject topics_filter = NIL;
        SubLObject counter = NIL;
        destructuring_bind_must_consp(state, state, $list52);
        question_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list52);
        topics_filter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list52);
        counter = current.first();
        current = current.rest();
        if (NIL == current) {
            while (NIL == iteration.iteration_done(question_iterator)) {
                thread.resetMultipleValues();
                final SubLObject result = iteration.iteration_next(question_iterator);
                final SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    SubLObject current_$2;
                    final SubLObject datum_$1 = current_$2 = result;
                    SubLObject type = NIL;
                    SubLObject questions = NIL;
                    SubLObject responses = NIL;
                    SubLObject topics = NIL;
                    SubLObject v_set = NIL;
                    destructuring_bind_must_consp(current_$2, datum_$1, $list53);
                    type = current_$2.first();
                    current_$2 = current_$2.rest();
                    destructuring_bind_must_consp(current_$2, datum_$1, $list53);
                    questions = current_$2.first();
                    current_$2 = current_$2.rest();
                    destructuring_bind_must_consp(current_$2, datum_$1, $list53);
                    responses = current_$2.first();
                    current_$2 = current_$2.rest();
                    destructuring_bind_must_consp(current_$2, datum_$1, $list53);
                    topics = current_$2.first();
                    current_$2 = current_$2.rest();
                    destructuring_bind_must_consp(current_$2, datum_$1, $list53);
                    v_set = current_$2.first();
                    current_$2 = current_$2.rest();
                    if (NIL == current_$2) {
                        if (NIL == topics_fail_topics_filterP(topics, topics_filter)) {
                            counter = subtract(counter, ONE_INTEGER);
                            return values(result, make_topical_questions_to_ask_iterator_state(question_iterator, topics_filter, counter), NIL);
                        }
                        continue;
                    } else {
                        cdestructuring_bind_error(datum_$1, $list53);
                    }
                }
            } 
        } else {
            cdestructuring_bind_error(state, $list52);
        }
        return values(NIL, state, T);
    }

    public static SubLObject topics_fail_topics_filterP(final SubLObject topics, final SubLObject topics_filter) {
        if (NIL != list_utilities.singletonP(topics)) {
            return topic_fails_topics_filterP(topics.first(), topics_filter);
        }
        return topic_list_fails_fopics_filterP(topics, topics_filter);
    }

    public static SubLObject topic_fails_topics_filterP(final SubLObject topic, final SubLObject topics_filter) {
        return makeBoolean(NIL == topic_matches_topics_filterP(topic, topics_filter));
    }

    public static SubLObject topic_matches_topics_filterP(final SubLObject topic, final SubLObject topics_filter) {
        final SubLObject hl_topic = czer_main.canonicalize_term(topic, UNPROVIDED);
        return topic_matches_topics_filter_expression(hl_topic, topics_filter);
    }

    public static SubLObject topic_list_fails_fopics_filterP(final SubLObject topic_list, final SubLObject topics_filter) {
        return makeBoolean(NIL == topic_list_matches_topics_filterP(topic_list, topics_filter));
    }

    public static SubLObject topic_list_matches_topics_filterP(final SubLObject topic_list, final SubLObject topics_filter) {
        final SubLObject topic_set = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = topic_list;
        SubLObject topic = NIL;
        topic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(czer_main.canonicalize_term(topic, UNPROVIDED), topic_set);
            cdolist_list_var = cdolist_list_var.rest();
            topic = cdolist_list_var.first();
        } 
        return topic_set_matches_topics_filter_expression(topic_set, topics_filter);
    }

    public static SubLObject topic_set_matches_topics_filter_expression(final SubLObject topic_set, final SubLObject expression) {
        if (NIL != forts.fort_p(expression)) {
            return set.set_memberP(expression, topic_set);
        }
        if (expression.isCons()) {
            if (NIL != narts_high.naut_p(expression)) {
                return set.set_memberP(narts_high.find_nart(expression), topic_set);
            }
            final SubLObject pcase_var = expression.first();
            if (pcase_var.eql($$and)) {
                SubLObject result = T;
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var = expression.rest();
                    SubLObject item = NIL;
                    item = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        result = makeBoolean((NIL != result) && (NIL != topic_set_matches_topics_filter_expression(topic_set, item)));
                        doneP = makeBoolean(NIL == result);
                        csome_list_var = csome_list_var.rest();
                        item = csome_list_var.first();
                    } 
                }
                return result;
            }
            if (pcase_var.eql($$not)) {
                return makeBoolean(NIL == topic_set_matches_topics_filter_expression(topic_set, second(expression)));
            }
            if (pcase_var.eql($$or)) {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var;
                    SubLObject item;
                    for (csome_list_var = expression.rest(), item = NIL, item = csome_list_var.first(); (NIL == doneP) && (NIL != csome_list_var); result = doneP = makeBoolean((NIL != result) || (NIL != topic_set_matches_topics_filter_expression(topic_set, item))) , csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                    }
                }
                return result;
            }
            Errors.error($str55$Malformed_topics_filter_expressio, expression);
        } else {
            Errors.error($str56$Implementation_error__overlooked_, expression);
        }
        return NIL;
    }

    public static SubLObject topic_matches_topics_filter_expression(final SubLObject topic, final SubLObject expression) {
        if (NIL != forts.fort_p(expression)) {
            return equal(topic, expression);
        }
        if (expression.isCons()) {
            if (NIL != narts_high.naut_p(expression)) {
                return equal(topic, narts_high.find_nart(expression));
            }
            final SubLObject pcase_var = expression.first();
            if (pcase_var.eql($$and)) {
                SubLObject result = T;
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var = expression.rest();
                    SubLObject item = NIL;
                    item = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        result = makeBoolean((NIL != result) && (NIL != topic_matches_topics_filter_expression(topic, item)));
                        doneP = makeBoolean(NIL == result);
                        csome_list_var = csome_list_var.rest();
                        item = csome_list_var.first();
                    } 
                }
                return result;
            }
            if (pcase_var.eql($$not)) {
                return makeBoolean(NIL == topic_matches_topics_filter_expression(topic, second(expression)));
            }
            if (pcase_var.eql($$or)) {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var;
                    SubLObject item;
                    for (csome_list_var = expression.rest(), item = NIL, item = csome_list_var.first(); (NIL == doneP) && (NIL != csome_list_var); result = doneP = makeBoolean((NIL != result) || (NIL != topic_matches_topics_filter_expression(topic, item))) , csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                    }
                }
                return result;
            }
            Errors.error($str55$Malformed_topics_filter_expressio, expression);
        } else {
            Errors.error($str56$Implementation_error__overlooked_, expression);
        }
        return NIL;
    }

    public static SubLObject topical_questions_to_ask_iterator_finalize(final SubLObject state) {
        SubLObject question_iterator = NIL;
        SubLObject topics_filter = NIL;
        SubLObject counter = NIL;
        destructuring_bind_must_consp(state, state, $list52);
        question_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list52);
        topics_filter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list52);
        counter = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(question_iterator);
        }
        cdestructuring_bind_error(state, $list52);
        return NIL;
    }

    public static SubLObject extract_question_topics_from_question(final SubLObject v_question, final SubLObject domain_mt) {
        final SubLObject predicate = extract_topical_predicate_from_question(v_question);
        final SubLObject topics = question_topics_information_for_predicate(predicate, domain_mt);
        SubLObject topics_and_labels = NIL;
        SubLObject cdolist_list_var = topics;
        SubLObject topic = NIL;
        topic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            topics_and_labels = cons(list(topic, title_for_question_topic(topic, domain_mt)), topics_and_labels);
            cdolist_list_var = cdolist_list_var.rest();
            topic = cdolist_list_var.first();
        } 
        return topics_and_labels;
    }

    public static SubLObject extract_topical_predicate_from_question(final SubLObject v_question) {
        final SubLObject predicate = cycl_utilities.formula_arg0(v_question);
        return predicate;
    }

    public static SubLObject clear_question_topics_information_for_predicate() {
        final SubLObject cs = $question_topics_information_for_predicate_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_question_topics_information_for_predicate(final SubLObject predicate, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($question_topics_information_for_predicate_caching_state$.getGlobalValue(), list(predicate, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject question_topics_information_for_predicate_internal(final SubLObject predicate, final SubLObject domain_mt) {
        final SubLObject topic_token = $TOPIC;
        final SubLObject sentence = list($$ist_Asserted, $const64$FactFactoryVerificationSentencesM, list($$isa, predicate, list($$FACToryVerificationPredForTopicFn, topic_token)));
        SubLObject topics = ask_utilities.query_variable(topic_token, sentence, domain_mt, UNPROVIDED);
        if (NIL == topics) {
            topics = $list67;
        }
        return topics;
    }

    public static SubLObject question_topics_information_for_predicate(final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject caching_state = $question_topics_information_for_predicate_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUESTION_TOPICS_INFORMATION_FOR_PREDICATE, $question_topics_information_for_predicate_caching_state$, NIL, EQL, TWO_INTEGER, TWENTY_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(question_topics_information_for_predicate_internal(predicate, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_title_for_question_topic() {
        final SubLObject cs = $title_for_question_topic_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_title_for_question_topic(final SubLObject topic, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($title_for_question_topic_caching_state$.getGlobalValue(), list(topic, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject title_for_question_topic_internal(final SubLObject topic, final SubLObject domain_mt) {
        final SubLObject label_token = $LABEL;
        final SubLObject sentence = list($$ist_Asserted, $$TopicMt, list($$topicTitle, topic, label_token));
        final SubLObject labels = ask_utilities.query_variable(label_token, sentence, domain_mt, $list73);
        if (NIL != labels) {
            return labels.first();
        }
        return $$$General;
    }

    public static SubLObject title_for_question_topic(final SubLObject topic, final SubLObject domain_mt) {
        SubLObject caching_state = $title_for_question_topic_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TITLE_FOR_QUESTION_TOPIC, $title_for_question_topic_caching_state$, NIL, EQL, TWO_INTEGER, TWENTY_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(topic, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (topic.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(title_for_question_topic_internal(topic, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(topic, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_external_identification_for_question_topic() {
        final SubLObject cs = $external_identification_for_question_topic_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_external_identification_for_question_topic(final SubLObject topic) {
        return memoization_state.caching_state_remove_function_results_with_args($external_identification_for_question_topic_caching_state$.getGlobalValue(), list(topic), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject external_identification_for_question_topic_internal(final SubLObject topic) {
        return kb_utilities.hl_external_id_string(topic);
    }

    public static SubLObject external_identification_for_question_topic(final SubLObject topic) {
        SubLObject caching_state = $external_identification_for_question_topic_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC, $external_identification_for_question_topic_caching_state$, NIL, EQL, ONE_INTEGER, TWENTY_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, topic, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(external_identification_for_question_topic_internal(topic)));
            memoization_state.caching_state_put(caching_state, topic, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_external_identification_for_choice() {
        final SubLObject cs = $external_identification_for_choice_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_external_identification_for_choice(final SubLObject choice) {
        return memoization_state.caching_state_remove_function_results_with_args($external_identification_for_choice_caching_state$.getGlobalValue(), list(choice), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject external_identification_for_choice_internal(final SubLObject choice) {
        return kb_utilities.hl_external_id_string(choice);
    }

    public static SubLObject external_identification_for_choice(final SubLObject choice) {
        SubLObject caching_state = $external_identification_for_choice_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(EXTERNAL_IDENTIFICATION_FOR_CHOICE, $external_identification_for_choice_caching_state$, NIL, EQL, ONE_INTEGER, TWENTY_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, choice, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(external_identification_for_choice_internal(choice)));
            memoization_state.caching_state_put(caching_state, choice, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject generate_xml_file_of_questions_to_ask(final SubLObject xml_filename, SubLObject domain_mt, SubLObject max_number) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject question_iterator = get_iterator_for_questions_to_ask(domain_mt, max_number, UNPROVIDED);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(xml_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str82$Unable_to_open__S, xml_filename);
            }
            final SubLObject xml_stream = stream;
            generate_xml_for_question_sets_to_ask_user(question_iterator, xml_stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return xml_filename;
    }

    public static SubLObject generate_xml_file_of_topical_questions_to_ask(final SubLObject xml_filename, final SubLObject topics_filter, SubLObject domain_mt, SubLObject max_number) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject topical_iterator = get_topical_iterator_for_questions_to_ask(topics_filter, domain_mt, max_number);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(xml_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str82$Unable_to_open__S, xml_filename);
            }
            final SubLObject xml_stream = stream;
            generate_xml_for_question_sets_to_ask_user(topical_iterator, xml_stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return xml_filename;
    }

    public static SubLObject compute_topical_questions_to_ask(SubLObject topics_filter, SubLObject domain_mt, SubLObject max_number) {
        if (topics_filter == UNPROVIDED) {
            topics_filter = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicates_seen = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject iterator_var = get_topical_iterator_for_questions_to_ask(topics_filter, domain_mt, max_number);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject v_question = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = v_question;
                SubLObject type = NIL;
                SubLObject sentences = NIL;
                destructuring_bind_must_consp(current, datum, $list85);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list85);
                sentences = current.first();
                current = current.rest();
                final SubLObject responses = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list85);
                current = current.rest();
                final SubLObject topic_infos = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list85);
                current = current.rest();
                final SubLObject choice_set = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list85);
                current = current.rest();
                if (NIL == current) {
                    final SubLObject sentence = sentences.first();
                    final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
                    SubLObject queue = dictionary.dictionary_lookup(predicates_seen, predicate, UNPROVIDED);
                    if (NIL == queue) {
                        queue = queues.create_queue(UNPROVIDED);
                        dictionary.dictionary_enter(predicates_seen, predicate, queue);
                    }
                    queues.enqueue(v_question, queue);
                } else {
                    cdestructuring_bind_error(datum, $list85);
                }
            }
        }
        return predicates_seen;
    }

    public static SubLObject get_topic_questions_count(final SubLObject predicates_seen) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject counts = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(predicates_seen)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject queue = thread.secondMultipleValue();
            thread.resetMultipleValues();
            counts = cons(cons(predicate, queues.queue_size(queue)), counts);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(counts, symbol_function($sym87$_), symbol_function(CDR));
    }

    public static SubLObject generate_striped_xml_for_question_to_ask_user(final SubLObject topical_questions, final SubLObject filename_template, SubLObject count_limits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject task_queue = compute_predicate_estimates_for_questions(topical_questions);
        final SubLObject total = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject counter = ZERO_INTEGER;
        SubLObject questions = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str90$Generating_striped_XML_____);
                while (NIL == queues.queue_empty_p(task_queue)) {
                    final SubLObject task = queues.dequeue(task_queue);
                    SubLObject current;
                    final SubLObject datum = current = task;
                    SubLObject predicate = NIL;
                    SubLObject times = NIL;
                    destructuring_bind_must_consp(current, datum, $list91);
                    predicate = current.first();
                    current = times = current.rest();
                    final SubLObject queue = dictionary.dictionary_lookup(topical_questions, predicate, UNPROVIDED);
                    final SubLObject v_question = queues.dequeue(queue);
                    questions = cons(v_question, questions);
                    counter = add(counter, ONE_INTEGER);
                    if (counter.numGE(count_limits.first())) {
                        questions = nreverse(questions);
                        final SubLObject filename = format(NIL, filename_template, count_limits.first());
                        SubLObject stream = NIL;
                        try {
                            final SubLObject _prev_bind_0_$3 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(filename, $OUTPUT);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$3, thread);
                            }
                            if (!stream.isStream()) {
                                Errors.error($str82$Unable_to_open__S, filename);
                            }
                            final SubLObject s = stream;
                            generate_xml_for_question_sets_to_ask_user(iteration.new_list_iterator(questions), s);
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        count_limits = count_limits.rest();
                        if (NIL == count_limits) {
                            return topical_questions;
                        }
                        questions = nreverse(questions);
                    }
                    times = subtract(times, ONE_INTEGER);
                    if (times.isPositive()) {
                        rplacd(task, times);
                        queues.enqueue(task, task_queue);
                    }
                    note_percent_progress(counter, total);
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return topical_questions;
    }

    public static SubLObject generate_striped_question_list_iterator_to_ask_user(final SubLObject topical_questions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject task_queue = compute_predicate_estimates_for_questions(topical_questions);
        final SubLObject total = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject counter = ZERO_INTEGER;
        SubLObject questions = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str94$Generating_striped_list_iterator_);
                while (NIL == queues.queue_empty_p(task_queue)) {
                    final SubLObject task = queues.dequeue(task_queue);
                    SubLObject current;
                    final SubLObject datum = current = task;
                    SubLObject predicate = NIL;
                    SubLObject times = NIL;
                    destructuring_bind_must_consp(current, datum, $list91);
                    predicate = current.first();
                    current = times = current.rest();
                    final SubLObject queue = dictionary.dictionary_lookup(topical_questions, predicate, UNPROVIDED);
                    final SubLObject v_question = queues.dequeue(queue);
                    questions = cons(v_question, questions);
                    counter = add(counter, ONE_INTEGER);
                    times = subtract(times, ONE_INTEGER);
                    if (times.isPositive()) {
                        rplacd(task, times);
                        queues.enqueue(task, task_queue);
                    }
                    note_percent_progress(counter, total);
                } 
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return values(iteration.new_list_iterator(nreverse(questions)), total);
    }

    public static SubLObject compute_predicate_estimates_for_questions(final SubLObject topical_questions) {
        final SubLObject keys = dictionary.dictionary_keys(topical_questions);
        SubLObject total = ZERO_INTEGER;
        final SubLObject task_queue = queues.create_queue(UNPROVIDED);
        SubLObject estimates = NIL;
        SubLObject cdolist_list_var = keys;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject queue = dictionary.dictionary_lookup(topical_questions, key, UNPROVIDED);
            final SubLObject size = queues.queue_size(queue);
            total = add(total, size);
            estimates = cons(cons(key, size), estimates);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        cdolist_list_var = Sort.sort(estimates, symbol_function($sym87$_), CDR);
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            queues.enqueue(tuple, task_queue);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return values(task_queue, total);
    }

    public static SubLObject get_questions_to_ask_user_in_xml(final SubLObject user_alias, SubLObject domain_mt, SubLObject evaluation_mt, SubLObject max_number) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        if (evaluation_mt == UNPROVIDED) {
            evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
        }
        if (max_number == UNPROVIDED) {
            max_number = $web_game_default_max_number$.getDynamicValue();
        }
        final SubLObject questions = get_questions_to_ask_user(user_alias, domain_mt, evaluation_mt, max_number);
        return generate_xml_for_questions_to_ask_user(questions);
    }

    public static SubLObject generate_xml_for_questions_to_ask_user(final SubLObject questions) {
        SubLObject xml = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            generate_xml_for_question_sets_to_ask_user(iteration.new_list_iterator(questions), stream);
            xml = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return xml;
    }

    public static SubLObject with_web_game_external_identification_tracking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list97, append(body, NIL));
    }

    public static SubLObject track_webgame_external_identificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_p($web_game_terms_identification_tracking$.getDynamicValue(thread));
    }

    public static SubLObject get_webgame_tracked_external_identification(final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tracker = $web_game_terms_identification_tracking$.getDynamicValue(thread);
        SubLObject suid = dictionary.dictionary_lookup(tracker, external_id, MINUS_ONE_INTEGER);
        SubLObject foundP = T;
        if (suid.isNegative()) {
            suid = dictionary.dictionary_length(tracker);
            foundP = NIL;
            dictionary.dictionary_enter(tracker, external_id, suid);
        }
        return values(suid, foundP);
    }

    public static SubLObject write_xml_compliant_html_string(final SubLObject string, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$html_stream$.bind(stream, thread);
            result = html_string(string, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_stream$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject generate_xml_for_question_sets_to_ask_user(final SubLObject question_set, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iteration.iterator_p(question_set) : "iteration.iterator_p(question_set) " + "CommonSymbols.NIL != iteration.iterator_p(question_set) " + question_set;
        final SubLObject _prev_bind_0 = $web_game_terms_identification_tracking$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            $web_game_terms_identification_tracking$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
            xml_vars.$xml_stream$.bind(stream, thread);
            xml_utilities.generate_valid_xml_header(stream);
            xml_utilities.generate_xml_header_entry_for_dtd($$$askingQuestions, $str100$http___www_opencyc_org_xml_asking, stream);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$askingQuestions, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$questionSets, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    generate_xml_for_question_set_to_ask_user(question_set);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$questionSets);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$askingQuestions);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            $web_game_terms_identification_tracking$.rebind(_prev_bind_0, thread);
        }
        return question_set;
    }

    public static SubLObject generate_xml_for_question_set_to_ask_user(final SubLObject question_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lies = ZERO_INTEGER;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$questionSet, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject v_question = iteration.iteration_next(question_set);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = v_question;
                            SubLObject type = NIL;
                            SubLObject sentences = NIL;
                            destructuring_bind_must_consp(current, datum, $list85);
                            type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list85);
                            sentences = current.first();
                            current = current.rest();
                            final SubLObject responses = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list85);
                            current = current.rest();
                            final SubLObject topic_infos = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list85);
                            current = current.rest();
                            final SubLObject choice_set = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list85);
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != list_utilities.sublisp_boolean(choice_set)) {
                                    final SubLObject choices = choice_set.rest();
                                    generate_xml_for_one_choice_question_to_ask_user(type, sentences, choices, topic_infos, responses);
                                } else {
                                    final SubLObject pcase_var = type;
                                    if (pcase_var.eql($const12$KnowledgeAcquisitionGoal_Verifyin)) {
                                        generate_xml_for_one_reading_question_to_ask_user(type, sentences, topic_infos, responses);
                                    } else
                                        if (pcase_var.eql($const24$KnowledgeAcquisitionGoal_Verifyin)) {
                                            generate_xml_for_one_hypothesized_question_to_ask_user(type, sentences, topic_infos, responses);
                                        } else
                                            if (pcase_var.eql($const25$KnowledgeAcquisitionGoal_Verifyin)) {
                                                generate_xml_for_one_abductive_question_to_ask_user(type, sentences, topic_infos, responses);
                                            } else
                                                if (pcase_var.eql($const26$KnowledgeAcquisitionGoal_Verifyin)) {
                                                    generate_xml_for_one_kb_question_to_ask_user(type, sentences, topic_infos, responses);
                                                } else
                                                    if (pcase_var.eql($const13$KnowledgeAcquisitionGoal_Verifyin)) {
                                                        generate_xml_for_one_rule_question_to_ask_user(type, sentences, topic_infos, responses);
                                                    } else
                                                        if (pcase_var.eql($const104$KnowledgeAcquisitionGoal_Falsifyi)) {
                                                            lies = add(lies, ONE_INTEGER);
                                                        } else {
                                                            Errors.error($str105$Dont_know_how_to_handle_question_, type);
                                                        }





                                }
                            } else {
                                cdestructuring_bind_error(datum, $list85);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$questionSet);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (lies.isPositive()) {
            Errors.warn($str106$Falsifying_Lies_are_not_supported, lies);
        }
        return list_utilities.sublisp_boolean(question_set);
    }

    public static SubLObject generate_xml_for_one_choice_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject choices, final SubLObject topic_infos, SubLObject responses) {
        if (responses == UNPROVIDED) {
            responses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$choiceQuestion, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    final SubLObject pattern = sentences.first();
                    try {
                        final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$prologue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str110$Please_complete_the_following_sen, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$prologue);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    thread.resetMultipleValues();
                    final SubLObject question_template = compute_question_template_from_example_sentences(pattern, choices);
                    final SubLObject choices_generations = thread.secondMultipleValue();
                    final SubLObject successP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$incompleteSentence, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_xml_compliant_html_string(question_template, xml_vars.$xml_stream$.getDynamicValue(thread));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$incompleteSentence);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$questions, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                SubLObject cdolist_list_var = choices;
                                SubLObject choice = NIL;
                                choice = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject sentence = list_utilities.tree_substitute(pattern, $web_game_choice_placeholder_in_sentence$.getGlobalValue(), choice);
                                    generate_xml_for_one_question_to_ask_user(sentence, type, topic_infos, responses);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    choice = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$questions);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                    final SubLObject allow_multipleP = determine_whether_multiple_entry_from_pattern(pattern);
                    generate_xml_for_choices_to_pick_from(choices_generations, allow_multipleP);
                    try {
                        final SubLObject _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$epilogue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string(NIL != allow_multipleP ? $str114$I_ve_narrowed_down_the_choices_to : $str115$I_ve_narrowed_down_the_choices_to, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$21, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$26, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$epilogue);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$choiceQuestion);
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return type;
    }

    public static SubLObject compute_question_template_from_example_sentences(final SubLObject pattern, final SubLObject choices) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_position = cycl_utilities.arg_positions_dfs($web_game_choice_placeholder_in_sentence$.getGlobalValue(), pattern, UNPROVIDED).first();
        SubLObject choices_generation = NIL;
        SubLObject last_output = NIL;
        SubLObject failed_on = NIL;
        SubLObject last_output_list = NIL;
        SubLObject cdolist_list_var = choices;
        SubLObject choice = NIL;
        choice = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = list_utilities.tree_substitute(pattern, $web_game_choice_placeholder_in_sentence$.getGlobalValue(), choice);
            thread.resetMultipleValues();
            final SubLObject text = pph_main.generate_text_wXsentential_force(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject predicate = thread.secondMultipleValue();
            final SubLObject justification = thread.thirdMultipleValue();
            final SubLObject output_list = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            SubLObject current_output = NIL;
            SubLObject cdolist_list_var_$33 = output_list;
            SubLObject output_item = NIL;
            output_item = cdolist_list_var_$33.first();
            while (NIL != cdolist_list_var_$33) {
                if (formula_position.equal(pph_data_structures.pph_phrase_output_item_arg_position(output_item))) {
                    choices_generation = cons(cons(choice, pph_data_structures.pph_phrase_output_item_string(output_item)), choices_generation);
                } else {
                    current_output = cons(pph_data_structures.pph_phrase_output_item_string(output_item), current_output);
                }
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                output_item = cdolist_list_var_$33.first();
            } 
            if ((NIL != last_output) && (!last_output.equal(current_output))) {
                failed_on = cons(choice, failed_on);
            }
            last_output = current_output;
            last_output_list = output_list;
            cdolist_list_var = cdolist_list_var.rest();
            choice = cdolist_list_var.first();
        } 
        SubLObject template_generation = NIL;
        if (NIL == failed_on) {
            SubLObject string_parts = NIL;
            final SubLObject dot_position = subtract(length(last_output_list), ONE_INTEGER);
            SubLObject list_var = NIL;
            SubLObject output_item2 = NIL;
            SubLObject index = NIL;
            list_var = last_output_list;
            output_item2 = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , output_item2 = list_var.first() , index = add(ONE_INTEGER, index)) {
                if (ZERO_INTEGER.numL(index) && index.numL(dot_position)) {
                    string_parts = cons($$$_, string_parts);
                }
                if (formula_position.equal(pph_data_structures.pph_phrase_output_item_arg_position(output_item2))) {
                    string_parts = cons($str117$_____, string_parts);
                } else {
                    string_parts = cons(pph_data_structures.pph_phrase_output_item_string(output_item2), string_parts);
                }
            }
            template_generation = apply(symbol_function(CCONCATENATE), nreverse(string_parts));
        } else {
            final SubLObject _prev_bind_0 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_blanks_for_varsP$.bind(T, thread);
                template_generation = pph_main.generate_text_wXsentential_force(pattern, $INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_0, thread);
            }
        }
        return values(template_generation, nreverse(choices_generation), sublisp_null(failed_on));
    }

    public static SubLObject determine_whether_multiple_entry_from_pattern(final SubLObject pattern) {
        return T;
    }

    public static SubLObject generate_xml_for_choices_to_pick_from(final SubLObject choice_generations, SubLObject allow_multipleP) {
        if (allow_multipleP == UNPROVIDED) {
            allow_multipleP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attributes = list($$$entryType, NIL != allow_multipleP ? $$$multiple : $$$single);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$choices, attributes, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject cdolist_list_var = choice_generations;
                    SubLObject choice_generation = NIL;
                    choice_generation = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = choice_generation;
                        SubLObject choice = NIL;
                        SubLObject rendering = NIL;
                        destructuring_bind_must_consp(current, datum, $list124);
                        choice = current.first();
                        current = rendering = current.rest();
                        SubLObject choice_attributes = NIL;
                        thread.resetMultipleValues();
                        final SubLObject id = get_external_identification_for_choice(choice);
                        final SubLObject suid = thread.secondMultipleValue();
                        final SubLObject foundP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != foundP) {
                            choice_attributes = list($$$suid, suid);
                        } else {
                            choice_attributes = list($$$id, id, $$$suid, suid);
                        }
                        try {
                            final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$choice, choice_attributes, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    write_xml_compliant_html_string(rendering, xml_vars.$xml_stream$.getDynamicValue(thread));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$choice);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        choice_generation = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$choices);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return choice_generations;
    }

    public static SubLObject get_external_identification_for_choice(final SubLObject choice) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = external_identification_for_choice(choice);
        thread.resetMultipleValues();
        final SubLObject suid = get_webgame_tracked_external_identification(id);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(id, suid, foundP);
    }

    public static SubLObject generate_xml_for_one_reading_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses) {
        if (responses == UNPROVIDED) {
            responses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$readingQuestion, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$40 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$prologue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$41 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$41, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$41, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$40, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$prologue);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$43 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$questions, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                SubLObject cdolist_list_var = sentences;
                                SubLObject sentence = NIL;
                                sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    generate_xml_for_one_question_to_ask_user(sentence, type, topic_infos, responses);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sentence = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$44, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$42, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$43, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$questions);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$epilogue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str130$Because_I_read_it_on_the_web_, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$43, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$epilogue);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$readingQuestion);
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return type;
    }

    public static SubLObject generate_xml_for_one_abductive_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses) {
        if (responses == UNPROVIDED) {
            responses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$abductiveQuestion, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$52 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$54 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$prologue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$54, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$53, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$prologue);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$questions, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                SubLObject cdolist_list_var = sentences;
                                SubLObject sentence = NIL;
                                sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    generate_xml_for_one_question_to_ask_user(sentence, type, topic_infos, responses);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sentence = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$57, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$55, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$56, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$questions);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$59 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$56 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$epilogue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str132$Because_I_am_guessing_, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$60, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$56, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$59, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$epilogue);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$52, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$abductiveQuestion);
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return type;
    }

    public static SubLObject generate_xml_for_one_hypothesized_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses) {
        if (responses == UNPROVIDED) {
            responses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$hypothesizedQuestion, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$66 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$67 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$prologue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$67 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$67, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$67, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$66, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$prologue);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$69 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$68 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$questions, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$70 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                SubLObject cdolist_list_var = sentences;
                                SubLObject sentence = NIL;
                                sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    generate_xml_for_one_question_to_ask_user(sentence, type, topic_infos, responses);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sentence = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$70, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$68, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$69, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$questions);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$72 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$69 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$epilogue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$73 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str134$Because_I_think_it_might_be_true_, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$73, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$69, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$72, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$epilogue);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$65, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$hypothesizedQuestion);
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return type;
    }

    public static SubLObject generate_xml_for_one_kb_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses) {
        if (responses == UNPROVIDED) {
            responses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$kbQuestion, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$78 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$79 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$80 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$prologue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$80 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$80, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$80, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$79, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$prologue);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$82 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$questions, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$83 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                SubLObject cdolist_list_var = sentences;
                                SubLObject sentence = NIL;
                                sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    generate_xml_for_one_question_to_ask_user(sentence, type, topic_infos, responses);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sentence = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$83, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$81, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$82, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$questions);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$85 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$82 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$epilogue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str136$Because_someone_told_me_so_, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$86, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$82, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$85, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$epilogue);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$78, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$kbQuestion);
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return type;
    }

    public static SubLObject generate_xml_for_one_rule_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses) {
        if (responses == UNPROVIDED) {
            responses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = sentences.first();
        final SubLObject examples = sentences.rest();
        final SubLObject rule_text = pph_main.generate_text_wXsentential_force(rule, $DECLARATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject attributes = list($$$id, kb_utilities.hl_external_id_string(rule));
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$ruleQuestion, attributes, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$91 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$92 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$prologue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$93 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str139$I_have_an_idea__if_I_am_right_it_, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$93, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$92, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$prologue);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$ruleText, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_xml_compliant_html_string(rule_text, xml_vars.$xml_stream$.getDynamicValue(thread));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$ruleText);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$98 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$questions, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$99 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                SubLObject cdolist_list_var = examples;
                                SubLObject sentence = NIL;
                                sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    generate_xml_for_one_question_to_ask_user(sentence, type, responses, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sentence = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$99, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$95, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$98, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$questions);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$epilogue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_string($str141$Because_if_I_am_right_it_would_me, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_xml_compliant_html_string(rule_text, xml_vars.$xml_stream$.getDynamicValue(thread));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$96, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$epilogue);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$91, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$ruleQuestion);
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return type;
    }

    public static SubLObject generate_xml_for_one_question_to_ask_user(final SubLObject sentence, final SubLObject type, final SubLObject topic_infos, SubLObject responses) {
        if (responses == UNPROVIDED) {
            responses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attributes = (($const12$KnowledgeAcquisitionGoal_Verifyin.eql(type) || $const26$KnowledgeAcquisitionGoal_Verifyin.eql(type)) || $const24$KnowledgeAcquisitionGoal_Verifyin.eql(type)) ? list($$$id, kb_utilities.hl_external_id_string(sentence)) : NIL;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$question, attributes, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != topic_infos) {
                        try {
                            final SubLObject _prev_bind_0_$109 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$110 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$topics, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$110 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = topic_infos;
                                    SubLObject topic_info = NIL;
                                    topic_info = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = topic_info;
                                        SubLObject topic = NIL;
                                        SubLObject title = NIL;
                                        destructuring_bind_must_consp(current, datum, $list144);
                                        topic = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list144);
                                        title = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            thread.resetMultipleValues();
                                            final SubLObject id = get_external_identification_for_question_topic(topic);
                                            final SubLObject suid = thread.secondMultipleValue();
                                            final SubLObject foundP = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            final SubLObject topic_attribute = (NIL != foundP) ? list($$$suid, suid) : list($$$suid, suid, $$$id, id);
                                            try {
                                                final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$111 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$topic, topic_attribute, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        write_xml_compliant_html_string(title, xml_vars.$xml_stream$.getDynamicValue(thread));
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$111, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$111, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$topic);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list144);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        topic_info = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$110, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$110, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$109, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$topics);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                            }
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$115 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$112 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$text, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$116 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                write_xml_compliant_html_string(pph_main.generate_text_wXsentential_force(sentence, $DECLARATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), xml_vars.$xml_stream$.getDynamicValue(thread));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$116, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$112, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$115, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$text);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$118 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$113 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$responses, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$119 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                generate_xml_for_responses_to_question_set_to_ask(responses, xml_vars.$xml_stream$.getDynamicValue(thread));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$119, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$113, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$118, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$120 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$responses);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$108, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$question);
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return sentence;
    }

    public static SubLObject get_external_identification_for_question_topic(final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = external_identification_for_question_topic(topic);
        thread.resetMultipleValues();
        final SubLObject suid = get_webgame_tracked_external_identification(id);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(id, suid, foundP);
    }

    public static SubLObject generate_xml_for_responses_to_question_set_to_ask(final SubLObject responses, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        SubLObject list_var = NIL;
        SubLObject response = NIL;
        SubLObject response_num = NIL;
        list_var = responses;
        response = list_var.first();
        for (response_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , response = list_var.first() , response_num = add(ONE_INTEGER, response_num)) {
            if (!response_num.isZero()) {
                write_string($str148$_, stream, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject pcase_var = response;
            if (pcase_var.eql($$TrueCycLSentence)) {
                write_string($$$T, stream, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($$FalseCycLSentence)) {
                    write_string($$$F, stream, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($$SkippedCycLSentence)) {
                        write_string($$$S, stream, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($$UnclearCycLSentence)) {
                            write_string($$$N, stream, UNPROVIDED, UNPROVIDED);
                        } else {
                            Errors.error($str155$Dont_know_how_to_deal_with_respon, response);
                        }



        }
        return responses;
    }

    public static SubLObject note_user_evaluations_of_sentences(final SubLObject user_alias, final SubLObject evaluations, SubLObject evaluation_mt) {
        if (evaluation_mt == UNPROVIDED) {
            evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
        }
        SubLObject successful_evaluations = ZERO_INTEGER;
        SubLObject cdolist_list_var = evaluations;
        SubLObject evaluation = NIL;
        evaluation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = evaluation;
            SubLObject hl_external = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list157);
            hl_external = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list157);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sentence = kb_utilities.find_object_by_hl_external_id_string(hl_external);
                if (NIL != note_user_evaluation_of_sentence(sentence, user_alias, predicate, evaluation_mt)) {
                    successful_evaluations = add(successful_evaluations, ONE_INTEGER);
                }
            } else {
                cdestructuring_bind_error(datum, $list157);
            }
            cdolist_list_var = cdolist_list_var.rest();
            evaluation = cdolist_list_var.first();
        } 
        return successful_evaluations;
    }

    public static SubLObject note_user_evaluation_of_sentence(final SubLObject sentence, final SubLObject user_alias, final SubLObject evaluation, SubLObject evaluation_mt) {
        if (evaluation_mt == UNPROVIDED) {
            evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == genls.genlP(evaluation, $$CycLPropositionalSentence, evaluation_mt, UNPROVIDED))) {
            Errors.error($str160$Term__A_does_not_denote_a_valid_e, evaluation);
        }
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature(list($$evaluationOfAs, list($$EvaluationOfByOnFn, list($$MtWithFocalContentSentenceFn, list($$Quote, sentence)), list($$SomeFn, listS($$SubCollectionNamedFn, user_alias, $list167)), get_universal_time()), list($$MtWithFocalContentSentenceFn, list($$Quote, sentence)), evaluation), evaluation_mt, T);
        final SubLObject reason = thread.secondMultipleValue();
        final SubLObject repairs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return successP;
    }

    public static SubLObject note_goal_category_for_sentence(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $web_game_default_domain_mt$.getDynamicValue();
        }
        return rkf_assertion_utilities.rkf_assert_with_implicature(listS($$goalCategoryForAgent, $$Cyc, list($$thereExists, $sym172$_TV, list($$knows, $$Cyc, listS($$sentenceTruth, sentence, $list175))), $list176), domain_mt, T);
    }

    public static SubLObject load_user_evaluated_sentences(final SubLObject filename, SubLObject recording_mt) {
        if (recording_mt == UNPROVIDED) {
            recording_mt = $web_game_recording_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str82$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            SubLObject doneP = NIL;
            final SubLObject limit = file_length(s);
            final SubLObject message = cconcatenate($$$Loading_webgame_results_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(filename), $str180$_____ });
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    while (NIL == doneP) {
                        final SubLObject contents = read(s, NIL, $EOF, NIL);
                        doneP = makeBoolean(($EOF == contents) || ($DONE == contents.first()));
                        if (NIL == doneP) {
                            SubLObject error = NIL;
                            SubLObject successP = NIL;
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$125 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        SubLObject current;
                                        final SubLObject datum = current = contents;
                                        SubLObject belief = NIL;
                                        SubLObject sentence_id = NIL;
                                        destructuring_bind_must_consp(current, datum, $list184);
                                        belief = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list184);
                                        sentence_id = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            final SubLObject sentence = kb_utilities.find_object_by_hl_external_id_string(sentence_id);
                                            record_consensus_sentence_evaluation(belief, sentence, recording_mt, UNPROVIDED);
                                        } else {
                                            cdestructuring_bind_error(datum, $list184);
                                        }
                                        successP = T;
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$125, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL == successP) {
                                Errors.warn($str185$Could_not_store_result__A____erro, contents, error);
                            }
                            note_percent_progress(file_position(s, UNPROVIDED), limit);
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$126 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$126, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return filename;
    }

    public static SubLObject load_and_submit_evaluated_sentences_from_file(final SubLObject filename, SubLObject recording_mt, SubLObject to) {
        if (recording_mt == UNPROVIDED) {
            recording_mt = $web_game_recording_mt$.getGlobalValue();
        }
        if (to == UNPROVIDED) {
            to = NIL;
        }
        return NIL;
    }

    public static SubLObject record_consensus_sentence_evaluation(final SubLObject belief_token, final SubLObject sentence, SubLObject recording_mt, SubLObject record_nowP) {
        if (recording_mt == UNPROVIDED) {
            recording_mt = $web_game_recording_mt$.getGlobalValue();
        }
        if (record_nowP == UNPROVIDED) {
            record_nowP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_belief = map_keyword_sentence_belief_to_fort_belief(belief_token);
        if (NIL != forts.fort_p(sentence_belief)) {
            thread.resetMultipleValues();
            final SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature(list($const189$sentenceAssignedStatusViaInfoStor, sentence, sentence_belief, $web_game_agent_identification_token$.getGlobalValue()), recording_mt, record_nowP);
            final SubLObject reason = thread.secondMultipleValue();
            final SubLObject repairs = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return successP;
        }
        return NIL;
    }

    public static SubLObject map_keyword_sentence_belief_to_fort_belief(final SubLObject keyword) {
        if (keyword.eql($TRUE)) {
            return $$TrueCycLSentence;
        }
        if (keyword.eql($FALSE)) {
            return $$FalseCycLSentence;
        }
        if (keyword.eql($NONSENSE)) {
            return $$RidiculousCycLSentence;
        }
        if (keyword.eql($OBSCURE)) {
            return $$UninterestingCycLSentence;
        }
        if (keyword.eql($PROBABLY_TRUE)) {
            return $$PlausibleCycLSentence;
        }
        if (keyword.eql($PROBABLY_FALSE)) {
            return $$ImplausibleCycLSentence;
        }
        if (keyword.eql($PROBABLY_NONSENSE)) {
            return $$SkippedCycLSentence;
        }
        return $PROBLEM;
    }

    public static SubLObject get_web_game_large_example_question_set(SubLObject orderedP) {
        if (orderedP == UNPROVIDED) {
            orderedP = T;
        }
        return NIL != orderedP ? $web_game_large_example_question_set$.getGlobalValue() : list_utilities.randomize_list($web_game_large_example_question_set$.getGlobalValue());
    }

    public static SubLObject declare_web_game_file() {
        declareFunction(me, "get_questions_to_ask_user", "GET-QUESTIONS-TO-ASK-USER", 1, 3, false);
        declareFunction(me, "get_alternate_bindings_for_questions_to_ask_user", "GET-ALTERNATE-BINDINGS-FOR-QUESTIONS-TO-ASK-USER", 4, 0, false);
        declareFunction(me, "package_sentence_for_question_to_be_asked_of_user", "PACKAGE-SENTENCE-FOR-QUESTION-TO-BE-ASKED-OF-USER", 3, 0, false);
        declareFunction(me, "get_bindings_dictionary_for_questions_to_ask_user", "GET-BINDINGS-DICTIONARY-FOR-QUESTIONS-TO-ASK-USER", 3, 1, false);
        declareFunction(me, "get_query_properties_for_questions_to_ask_user", "GET-QUERY-PROPERTIES-FOR-QUESTIONS-TO-ASK-USER", 1, 0, false);
        declareFunction(me, "get_alternate_query_properties_for_questions_to_ask_user", "GET-ALTERNATE-QUERY-PROPERTIES-FOR-QUESTIONS-TO-ASK-USER", 1, 0, false);
        declareFunction(me, "get_query_properties_with_max_number_override", "GET-QUERY-PROPERTIES-WITH-MAX-NUMBER-OVERRIDE", 2, 0, false);
        declareFunction(me, "get_alternate_query_for_questions_to_ask_user", "GET-ALTERNATE-QUERY-FOR-QUESTIONS-TO-ASK-USER", 3, 0, false);
        declareFunction(me, "get_query_for_questions_to_ask_user", "GET-QUERY-FOR-QUESTIONS-TO-ASK-USER", 3, 0, false);
        declareFunction(me, "extract_question_to_ask_from_alt_binding_set", "EXTRACT-QUESTION-TO-ASK-FROM-ALT-BINDING-SET", 1, 0, false);
        declareFunction(me, "extract_question_to_ask_from_binding_set", "EXTRACT-QUESTION-TO-ASK-FROM-BINDING-SET", 1, 0, false);
        declareFunction(me, "extract_evaluation_information_from_binding_set", "EXTRACT-EVALUATION-INFORMATION-FROM-BINDING-SET", 1, 0, false);
        declareFunction(me, "extract_evaluation_information_set_from_binding_set", "EXTRACT-EVALUATION-INFORMATION-SET-FROM-BINDING-SET", 1, 0, false);
        declareFunction(me, "extract_goal_type_from_binding_set", "EXTRACT-GOAL-TYPE-FROM-BINDING-SET", 1, 0, false);
        declareFunction(me, "extract_goal_type_from_alt_binding_set", "EXTRACT-GOAL-TYPE-FROM-ALT-BINDING-SET", 1, 0, false);
        declareFunction(me, "question_still_needs_to_be_asked_of_userP", "QUESTION-STILL-NEEDS-TO-BE-ASKED-OF-USER?", 2, 0, false);
        declareFunction(me, "belief_value_has_reached_certaintyP", "BELIEF-VALUE-HAS-REACHED-CERTAINTY?", 1, 0, false);
        declareFunction(me, "get_iterator_for_questions_to_ask", "GET-ITERATOR-FOR-QUESTIONS-TO-ASK", 0, 3, false);
        declareFunction(me, "get_questions_query_sentence_with_topics_filtering", "GET-QUESTIONS-QUERY-SENTENCE-WITH-TOPICS-FILTERING", 2, 0, false);
        declareFunction(me, "make_questions_to_ask_iterator_state", "MAKE-QUESTIONS-TO-ASK-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "questions_to_ask_iterator_next", "QUESTIONS-TO-ASK-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "questions_to_ask_iterator_done", "QUESTIONS-TO-ASK-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "questions_to_ask_iterator_finalize", "QUESTIONS-TO-ASK-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "get_topical_iterator_for_questions_to_ask", "GET-TOPICAL-ITERATOR-FOR-QUESTIONS-TO-ASK", 1, 2, false);
        declareFunction(me, "make_topical_questions_to_ask_iterator_state", "MAKE-TOPICAL-QUESTIONS-TO-ASK-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "topical_questions_to_ask_iterator_done", "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "topical_questions_to_ask_iterator_next", "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "topics_fail_topics_filterP", "TOPICS-FAIL-TOPICS-FILTER?", 2, 0, false);
        declareFunction(me, "topic_fails_topics_filterP", "TOPIC-FAILS-TOPICS-FILTER?", 2, 0, false);
        declareFunction(me, "topic_matches_topics_filterP", "TOPIC-MATCHES-TOPICS-FILTER?", 2, 0, false);
        declareFunction(me, "topic_list_fails_fopics_filterP", "TOPIC-LIST-FAILS-FOPICS-FILTER?", 2, 0, false);
        declareFunction(me, "topic_list_matches_topics_filterP", "TOPIC-LIST-MATCHES-TOPICS-FILTER?", 2, 0, false);
        declareFunction(me, "topic_set_matches_topics_filter_expression", "TOPIC-SET-MATCHES-TOPICS-FILTER-EXPRESSION", 2, 0, false);
        declareFunction(me, "topic_matches_topics_filter_expression", "TOPIC-MATCHES-TOPICS-FILTER-EXPRESSION", 2, 0, false);
        declareFunction(me, "topical_questions_to_ask_iterator_finalize", "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "extract_question_topics_from_question", "EXTRACT-QUESTION-TOPICS-FROM-QUESTION", 2, 0, false);
        declareFunction(me, "extract_topical_predicate_from_question", "EXTRACT-TOPICAL-PREDICATE-FROM-QUESTION", 1, 0, false);
        declareFunction(me, "clear_question_topics_information_for_predicate", "CLEAR-QUESTION-TOPICS-INFORMATION-FOR-PREDICATE", 0, 0, false);
        declareFunction(me, "remove_question_topics_information_for_predicate", "REMOVE-QUESTION-TOPICS-INFORMATION-FOR-PREDICATE", 2, 0, false);
        declareFunction(me, "question_topics_information_for_predicate_internal", "QUESTION-TOPICS-INFORMATION-FOR-PREDICATE-INTERNAL", 2, 0, false);
        declareFunction(me, "question_topics_information_for_predicate", "QUESTION-TOPICS-INFORMATION-FOR-PREDICATE", 2, 0, false);
        declareFunction(me, "clear_title_for_question_topic", "CLEAR-TITLE-FOR-QUESTION-TOPIC", 0, 0, false);
        declareFunction(me, "remove_title_for_question_topic", "REMOVE-TITLE-FOR-QUESTION-TOPIC", 2, 0, false);
        declareFunction(me, "title_for_question_topic_internal", "TITLE-FOR-QUESTION-TOPIC-INTERNAL", 2, 0, false);
        declareFunction(me, "title_for_question_topic", "TITLE-FOR-QUESTION-TOPIC", 2, 0, false);
        declareFunction(me, "clear_external_identification_for_question_topic", "CLEAR-EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 0, 0, false);
        declareFunction(me, "remove_external_identification_for_question_topic", "REMOVE-EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 1, 0, false);
        declareFunction(me, "external_identification_for_question_topic_internal", "EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC-INTERNAL", 1, 0, false);
        declareFunction(me, "external_identification_for_question_topic", "EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 1, 0, false);
        declareFunction(me, "clear_external_identification_for_choice", "CLEAR-EXTERNAL-IDENTIFICATION-FOR-CHOICE", 0, 0, false);
        declareFunction(me, "remove_external_identification_for_choice", "REMOVE-EXTERNAL-IDENTIFICATION-FOR-CHOICE", 1, 0, false);
        declareFunction(me, "external_identification_for_choice_internal", "EXTERNAL-IDENTIFICATION-FOR-CHOICE-INTERNAL", 1, 0, false);
        declareFunction(me, "external_identification_for_choice", "EXTERNAL-IDENTIFICATION-FOR-CHOICE", 1, 0, false);
        declareFunction(me, "generate_xml_file_of_questions_to_ask", "GENERATE-XML-FILE-OF-QUESTIONS-TO-ASK", 1, 2, false);
        declareFunction(me, "generate_xml_file_of_topical_questions_to_ask", "GENERATE-XML-FILE-OF-TOPICAL-QUESTIONS-TO-ASK", 2, 2, false);
        declareFunction(me, "compute_topical_questions_to_ask", "COMPUTE-TOPICAL-QUESTIONS-TO-ASK", 0, 3, false);
        declareFunction(me, "get_topic_questions_count", "GET-TOPIC-QUESTIONS-COUNT", 1, 0, false);
        declareFunction(me, "generate_striped_xml_for_question_to_ask_user", "GENERATE-STRIPED-XML-FOR-QUESTION-TO-ASK-USER", 3, 0, false);
        declareFunction(me, "generate_striped_question_list_iterator_to_ask_user", "GENERATE-STRIPED-QUESTION-LIST-ITERATOR-TO-ASK-USER", 1, 0, false);
        declareFunction(me, "compute_predicate_estimates_for_questions", "COMPUTE-PREDICATE-ESTIMATES-FOR-QUESTIONS", 1, 0, false);
        declareFunction(me, "get_questions_to_ask_user_in_xml", "GET-QUESTIONS-TO-ASK-USER-IN-XML", 1, 3, false);
        declareFunction(me, "generate_xml_for_questions_to_ask_user", "GENERATE-XML-FOR-QUESTIONS-TO-ASK-USER", 1, 0, false);
        declareMacro(me, "with_web_game_external_identification_tracking", "WITH-WEB-GAME-EXTERNAL-IDENTIFICATION-TRACKING");
        declareFunction(me, "track_webgame_external_identificationsP", "TRACK-WEBGAME-EXTERNAL-IDENTIFICATIONS?", 0, 0, false);
        declareFunction(me, "get_webgame_tracked_external_identification", "GET-WEBGAME-TRACKED-EXTERNAL-IDENTIFICATION", 1, 0, false);
        declareFunction(me, "write_xml_compliant_html_string", "WRITE-XML-COMPLIANT-HTML-STRING", 1, 1, false);
        declareFunction(me, "generate_xml_for_question_sets_to_ask_user", "GENERATE-XML-FOR-QUESTION-SETS-TO-ASK-USER", 1, 1, false);
        declareFunction(me, "generate_xml_for_question_set_to_ask_user", "GENERATE-XML-FOR-QUESTION-SET-TO-ASK-USER", 1, 0, false);
        declareFunction(me, "generate_xml_for_one_choice_question_to_ask_user", "GENERATE-XML-FOR-ONE-CHOICE-QUESTION-TO-ASK-USER", 4, 1, false);
        declareFunction(me, "compute_question_template_from_example_sentences", "COMPUTE-QUESTION-TEMPLATE-FROM-EXAMPLE-SENTENCES", 2, 0, false);
        declareFunction(me, "determine_whether_multiple_entry_from_pattern", "DETERMINE-WHETHER-MULTIPLE-ENTRY-FROM-PATTERN", 1, 0, false);
        declareFunction(me, "generate_xml_for_choices_to_pick_from", "GENERATE-XML-FOR-CHOICES-TO-PICK-FROM", 1, 1, false);
        declareFunction(me, "get_external_identification_for_choice", "GET-EXTERNAL-IDENTIFICATION-FOR-CHOICE", 1, 0, false);
        declareFunction(me, "generate_xml_for_one_reading_question_to_ask_user", "GENERATE-XML-FOR-ONE-READING-QUESTION-TO-ASK-USER", 3, 1, false);
        declareFunction(me, "generate_xml_for_one_abductive_question_to_ask_user", "GENERATE-XML-FOR-ONE-ABDUCTIVE-QUESTION-TO-ASK-USER", 3, 1, false);
        declareFunction(me, "generate_xml_for_one_hypothesized_question_to_ask_user", "GENERATE-XML-FOR-ONE-HYPOTHESIZED-QUESTION-TO-ASK-USER", 3, 1, false);
        declareFunction(me, "generate_xml_for_one_kb_question_to_ask_user", "GENERATE-XML-FOR-ONE-KB-QUESTION-TO-ASK-USER", 3, 1, false);
        declareFunction(me, "generate_xml_for_one_rule_question_to_ask_user", "GENERATE-XML-FOR-ONE-RULE-QUESTION-TO-ASK-USER", 3, 1, false);
        declareFunction(me, "generate_xml_for_one_question_to_ask_user", "GENERATE-XML-FOR-ONE-QUESTION-TO-ASK-USER", 3, 1, false);
        declareFunction(me, "get_external_identification_for_question_topic", "GET-EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 1, 0, false);
        declareFunction(me, "generate_xml_for_responses_to_question_set_to_ask", "GENERATE-XML-FOR-RESPONSES-TO-QUESTION-SET-TO-ASK", 1, 1, false);
        declareFunction(me, "note_user_evaluations_of_sentences", "NOTE-USER-EVALUATIONS-OF-SENTENCES", 2, 1, false);
        declareFunction(me, "note_user_evaluation_of_sentence", "NOTE-USER-EVALUATION-OF-SENTENCE", 3, 1, false);
        declareFunction(me, "note_goal_category_for_sentence", "NOTE-GOAL-CATEGORY-FOR-SENTENCE", 1, 1, false);
        declareFunction(me, "load_user_evaluated_sentences", "LOAD-USER-EVALUATED-SENTENCES", 1, 1, false);
        declareFunction(me, "load_and_submit_evaluated_sentences_from_file", "LOAD-AND-SUBMIT-EVALUATED-SENTENCES-FROM-FILE", 1, 2, false);
        declareFunction(me, "record_consensus_sentence_evaluation", "RECORD-CONSENSUS-SENTENCE-EVALUATION", 2, 2, false);
        declareFunction(me, "map_keyword_sentence_belief_to_fort_belief", "MAP-KEYWORD-SENTENCE-BELIEF-TO-FORT-BELIEF", 1, 0, false);
        declareFunction(me, "get_web_game_large_example_question_set", "GET-WEB-GAME-LARGE-EXAMPLE-QUESTION-SET", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_web_game_file() {
        defparameter("*WEB-GAME-DEFAULT-DOMAIN-MT*", $$MachineLearningSpindleCollectorMt);
        defparameter("*WEB-GAME-DEFAULT-EVALUATION-MT*", $$SuggestedSentencesMt);
        defparameter("*WEB-GAME-QUESTIONS-QUERY*", $const2$WebGame_QuiescenceData_WithGoalTy);
        defparameter("*WEB-GAME-ALTERNATE-QUESTIONS-QUERY*", $const3$WebGame_UnevaluatedSentences_With);
        defparameter("*WEB-GAME-DEFAULT-MAX-NUMBER*", $int$50);
        deflexical("*QUESTION-TO-ASK-VARIABLE*", $sym17$_SENTENCE);
        deflexical("*QUESTION-TO-ASK-USER-TEMPLATE-NAME*", $$$Boris);
        deflexical("*EVALUATION-PREDICATE-VARIABLE*", $sym19$_OUTPUT);
        deflexical("*EVALUATION-TIMESTAMP-VARIABLE*", $sym20$_TIME);
        deflexical("*EVALUATION-INFORMATION-SET-VARIABLE*", $sym21$_EVAL_SET);
        deflexical("*EVALUATION-GOALTYPE-VARIABLE*", $sym23$_GOAL_TYPE);
        defparameter("*MAXIMUM-BELIEF-FOR-QUESTION*", TEN_INTEGER);
        defparameter("*MAXIMUM-VOTES-FOR-QUESTION*", TEN_INTEGER);
        deflexical("*WEB-GAME-CHOICE-QUESTIONS-QUERY*", $const39$WebGame_MultipleChoiceSentences_W);
        deflexical("*WEB-GAME-MASTER-QUERY-SET*", list($web_game_alternate_questions_query$.getDynamicValue(), $web_game_choice_questions_query$.getGlobalValue()));
        deflexical("*QUESTION-TOPICS-INFORMATION-FOR-PREDICATE-CACHING-STATE*", NIL);
        deflexical("*TITLE-FOR-QUESTION-TOPIC-CACHING-STATE*", NIL);
        deflexical("*EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC-CACHING-STATE*", NIL);
        deflexical("*EXTERNAL-IDENTIFICATION-FOR-CHOICE-CACHING-STATE*", NIL);
        defparameter("*WEB-GAME-TERMS-IDENTIFICATION-TRACKING*", NIL);
        deflexical("*WEB-GAME-CHOICE-PLACEHOLDER-IN-SENTENCE*", $sym107$_VALUE);
        deflexical("*WEB-GAME-RECORDING-MT*", $const64$FactFactoryVerificationSentencesM);
        deflexical("*WEB-GAME-AGENT-IDENTIFICATION-TOKEN*", $$FACTory_WebGame);
        deflexical("*WEB-GAME-LARGE-EXAMPLE-QUESTION-SET*", $list202);
        return NIL;
    }

    public static SubLObject setup_web_game_file() {
        register_external_symbol(GET_QUESTIONS_TO_ASK_USER);
        define_test_case_table_int($sym31$QUESTION_STILL_NEEDS_TO_BE_ASKED_OF_USER_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list38);
        register_external_symbol(GET_ITERATOR_FOR_QUESTIONS_TO_ASK);
        register_external_symbol(GET_TOPICAL_ITERATOR_FOR_QUESTIONS_TO_ASK);
        define_test_case_table_int($sym57$TOPIC_MATCHES_TOPICS_FILTER_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list58);
        define_test_case_table_int($sym59$TOPIC_LIST_MATCHES_TOPICS_FILTER_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list60);
        memoization_state.note_globally_cached_function(QUESTION_TOPICS_INFORMATION_FOR_PREDICATE);
        memoization_state.note_globally_cached_function(TITLE_FOR_QUESTION_TOPIC);
        memoization_state.note_globally_cached_function(EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC);
        memoization_state.note_globally_cached_function(EXTERNAL_IDENTIFICATION_FOR_CHOICE);
        register_external_symbol(GENERATE_XML_FILE_OF_QUESTIONS_TO_ASK);
        register_external_symbol(GENERATE_XML_FILE_OF_TOPICAL_QUESTIONS_TO_ASK);
        register_external_symbol(COMPUTE_TOPICAL_QUESTIONS_TO_ASK);
        register_external_symbol(GET_TOPIC_QUESTIONS_COUNT);
        register_external_symbol(GENERATE_STRIPED_XML_FOR_QUESTION_TO_ASK_USER);
        register_external_symbol(GENERATE_STRIPED_QUESTION_LIST_ITERATOR_TO_ASK_USER);
        register_external_symbol(GET_QUESTIONS_TO_ASK_USER_IN_XML);
        register_external_symbol(NOTE_USER_EVALUATIONS_OF_SENTENCES);
        register_external_symbol(NOTE_USER_EVALUATION_OF_SENTENCE);
        register_external_symbol(NOTE_GOAL_CATEGORY_FOR_SENTENCE);
        register_external_symbol(LOAD_USER_EVALUATED_SENTENCES);
        register_external_symbol(LOAD_AND_SUBMIT_EVALUATED_SENTENCES_FROM_FILE);
        register_external_symbol(RECORD_CONSENSUS_SENTENCE_EVALUATION);
        return NIL;
    }

    private static SubLObject _constant_202_initializer() {
        return list(new SubLObject[]{ list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("Pain-PhysiologicalCondition")), reader_make_constant_shell(makeString("OralHerpes")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingInduction")), list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("father")), makeSymbol("?A"), makeSymbol("?B")), list(reader_make_constant_shell(makeString("spouse")), makeSymbol("?B"), makeSymbol("?C"))), list(reader_make_constant_shell(makeString("mother")), makeSymbol("?A"), makeSymbol("?C"))), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("father")), reader_make_constant_shell(makeString("GeorgeWBush")), reader_make_constant_shell(makeString("GeorgeHWBush"))), list(reader_make_constant_shell(makeString("spouse")), reader_make_constant_shell(makeString("GeorgeHWBush")), reader_make_constant_shell(makeString("BarbaraBush")))), list(reader_make_constant_shell(makeString("mother")), reader_make_constant_shell(makeString("GeorgeWBush")), reader_make_constant_shell(makeString("BarbaraBush")))), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("father")), reader_make_constant_shell(makeString("ChelseaClinton")), reader_make_constant_shell(makeString("BillClinton"))), list(reader_make_constant_shell(makeString("spouse")), reader_make_constant_shell(makeString("BillClinton")), reader_make_constant_shell(makeString("HillaryClinton")))), list(reader_make_constant_shell(makeString("mother")), reader_make_constant_shell(makeString("ChelseaClinton")), reader_make_constant_shell(makeString("HillaryClinton"))))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation")), list(list(reader_make_constant_shell(makeString("agentTypeUsesArtifactType")), reader_make_constant_shell(makeString("MedicalGeneticist")), reader_make_constant_shell(makeString("PageOfPaper-IBO")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("Fever")), reader_make_constant_shell(makeString("Measles")))), list(reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Diphtheria")), reader_make_constant_shell(makeString("Larynx")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Rubella")), reader_make_constant_shell(makeString("Eye")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("ChlamydiaTrachomatisInfection")), reader_make_constant_shell(makeString("Urethra")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("Cough-AilmentCondition")), reader_make_constant_shell(makeString("Psittacosis")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Arbovirus")), reader_make_constant_shell(makeString("YellowFever")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Bacterium")), reader_make_constant_shell(makeString("StomachFlu")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Staphylococcus")), reader_make_constant_shell(makeString("Fever")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("ViralPneumonia")), reader_make_constant_shell(makeString("WholeBody")))), list(reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Herpes-Virus")), reader_make_constant_shell(makeString("Influenza")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Constipation")), reader_make_constant_shell(makeString("LargeIntestine")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Streptococcus")), reader_make_constant_shell(makeString("Tonsillitis")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("indicatedDrug")), reader_make_constant_shell(makeString("ChestCold")), list(reader_make_constant_shell(makeString("LeafFn")), reader_make_constant_shell(makeString("TeaPlant"))))), list(reader_make_constant_shell(makeString("FalseCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Swelling-Condition")), reader_make_constant_shell(makeString("Throat")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Malaria")), reader_make_constant_shell(makeString("Kidney")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("FatigueCondition")), reader_make_constant_shell(makeString("HepatitisC-Infection")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("Fever")), reader_make_constant_shell(makeString("BacterialPneumonia")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("PseudomonasPseudomallei")), reader_make_constant_shell(makeString("Infection")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Infection")), reader_make_constant_shell(makeString("PlantEpidermis")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Bacterium")), reader_make_constant_shell(makeString("AilmentCondition")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("indicatedDrug")), reader_make_constant_shell(makeString("HepatitisC-Infection")), reader_make_constant_shell(makeString("DrugProduct")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("Jaundice")), reader_make_constant_shell(makeString("HepatitisA-Infection")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Bacterium")), reader_make_constant_shell(makeString("Syphilis")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("indicatedDrug")), reader_make_constant_shell(makeString("ChlamydiaTrachomatisInfection")), reader_make_constant_shell(makeString("DrugSubstance")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Protozoan")), reader_make_constant_shell(makeString("Malaria")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("Fever")), reader_make_constant_shell(makeString("TyphusFeverGroup")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Leprosy")), reader_make_constant_shell(makeString("Nerve")))), list(reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Infection")), reader_make_constant_shell(makeString("Heart")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Virus")), reader_make_constant_shell(makeString("DengueFever")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("indicatedDrug")), reader_make_constant_shell(makeString("LassaFever")), reader_make_constant_shell(makeString("DrugSubstance")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("HepatitisC-Infection")), reader_make_constant_shell(makeString("WholeBody")))), list(reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Glanders-Infection")), reader_make_constant_shell(makeString("Joint-AnimalBodyPart")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")), reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("EscherichiaColi")), reader_make_constant_shell(makeString("Infection")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Virus")), reader_make_constant_shell(makeString("WesternEquineEncephalitis")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Tuberculosis")), reader_make_constant_shell(makeString("Meninges")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Virus")), reader_make_constant_shell(makeString("SevereAcuteRespiratorySyndrome")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Virus")), reader_make_constant_shell(makeString("CommonCold")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Bacterium")), reader_make_constant_shell(makeString("CholeraInfection")))), list(reader_make_constant_shell(makeString("TrueCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Acne")), reader_make_constant_shell(makeString("Gland")))), list(reader_make_constant_shell(makeString("SkippedCycLSentence")), reader_make_constant_shell(makeString("UnclearCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Mosquito")), reader_make_constant_shell(makeString("Fever")))), list(reader_make_constant_shell(makeString("FalseCycLSentence")), reader_make_constant_shell(makeString("FalseCycLSentence")))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation")), list(list(reader_make_constant_shell(makeString("properPhysicalPartTypes")), reader_make_constant_shell(makeString("TruckTractor")), reader_make_constant_shell(makeString("Radiator-VehiclePart"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation")), list(list(reader_make_constant_shell(makeString("properPhysicalPartTypes")), reader_make_constant_shell(makeString("TruckTractor")), reader_make_constant_shell(makeString("VehicleBrakeSystem"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation")), list(list(reader_make_constant_shell(makeString("agentTypeUsesArtifactType")), reader_make_constant_shell(makeString("MedicalGeneticist")), reader_make_constant_shell(makeString("MeasuringDevice"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Virus")), reader_make_constant_shell(makeString("DengueHemorrhagicFever"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Virus")), reader_make_constant_shell(makeString("CytomegaloVirusInfection"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("pathogenCausesConditionType")), reader_make_constant_shell(makeString("Bacterium")), list(reader_make_constant_shell(makeString("InfectionDueToFn")), reader_make_constant_shell(makeString("Anthrax-Bacterium")))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("AthletesFoot")), reader_make_constant_shell(makeString("Foot-AnimalBodyPart"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("AthletesFoot")), reader_make_constant_shell(makeString("SoleOfFoot"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Swelling-Condition")), reader_make_constant_shell(makeString("Abdomen"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("conditionAffectsPartType")), reader_make_constant_shell(makeString("Shingles-Ailment")), reader_make_constant_shell(makeString("Nerve"))))), list(reader_make_constant_shell(makeString("KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus")), list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("ViralPneumonia")), reader_make_constant_shell(makeString("Infection"))))) });
    }

    @Override
    public void declareFunctions() {
        declare_web_game_file();
    }

    @Override
    public void initializeVariables() {
        init_web_game_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_web_game_file();
    }

    
}

/**
 * Total time: 2021 ms
 */
