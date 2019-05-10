package com.cyc.cycjava.cycl.butler;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.pph_data_structures;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.inference_iterators;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class web_game
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.butler.web_game";
  public static final String myFingerPrint = "50c1d3a92358ada1bbafffd0553da7b4586c60df6b349ff6ad791eb0c67df625";
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 1603L)
  private static SubLSymbol $web_game_default_domain_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 1764L)
  private static SubLSymbol $web_game_default_evaluation_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 1931L)
  private static SubLSymbol $web_game_questions_query$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 2207L)
  private static SubLSymbol $web_game_alternate_questions_query$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 2531L)
  private static SubLSymbol $web_game_default_max_number$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 7816L)
  private static SubLSymbol $question_to_ask_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 7953L)
  private static SubLSymbol $question_to_ask_user_template_name$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 8628L)
  private static SubLSymbol $evaluation_predicate_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 8692L)
  private static SubLSymbol $evaluation_timestamp_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9037L)
  private static SubLSymbol $evaluation_information_set_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9378L)
  private static SubLSymbol $evaluation_goaltype_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9796L)
  private static SubLSymbol $maximum_belief_for_question$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9889L)
  private static SubLSymbol $maximum_votes_for_question$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 13264L)
  private static SubLSymbol $web_game_choice_questions_query$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 13539L)
  private static SubLSymbol $web_game_master_query_set$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25306L)
  private static SubLSymbol $question_topics_information_for_predicate_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25759L)
  private static SubLSymbol $title_for_question_topic_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26186L)
  private static SubLSymbol $external_identification_for_question_topic_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26309L)
  private static SubLSymbol $external_identification_for_choice_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 33288L)
  private static SubLSymbol $web_game_terms_identification_tracking$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 36996L)
  private static SubLSymbol $web_game_choice_placeholder_in_sentence$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 49574L)
  public static SubLSymbol $web_game_recording_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 51356L)
  private static SubLSymbol $web_game_agent_identification_token$;
  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 53060L)
  private static SubLSymbol $web_game_large_example_question_set$;
  private static final SubLObject $const0$MachineLearningSpindleCollectorMt;
  private static final SubLObject $const1$SuggestedSentencesMt;
  private static final SubLObject $const2$WebGame_QuiescenceData_WithGoalTy;
  private static final SubLObject $const3$WebGame_UnevaluatedSentences_With;
  private static final SubLInteger $int4$50;
  private static final SubLSymbol $sym5$GET_QUESTIONS_TO_ASK_USER;
  private static final SubLSymbol $sym6$ASCII_STRING_P;
  private static final SubLSymbol $sym7$POSSIBLY_HLMT_P;
  private static final SubLSymbol $sym8$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym9$_;
  private static final SubLSymbol $sym10$FIRST;
  private static final SubLSymbol $sym11$SECOND;
  private static final SubLObject $const12$KnowledgeAcquisitionGoal_Verifyin;
  private static final SubLObject $const13$KnowledgeAcquisitionGoal_Verifyin;
  private static final SubLSymbol $sym14$EL_IMPLICATION_P;
  private static final SubLSymbol $sym15$DESTROY_INFERENCE_AND_PROBLEM_STORE;
  private static final SubLSymbol $kw16$MAX_NUMBER;
  private static final SubLSymbol $sym17$_SENTENCE;
  private static final SubLString $str18$Boris;
  private static final SubLSymbol $sym19$_OUTPUT;
  private static final SubLSymbol $sym20$_TIME;
  private static final SubLSymbol $sym21$_EVAL_SET;
  private static final SubLSymbol $sym22$REST;
  private static final SubLSymbol $sym23$_GOAL_TYPE;
  private static final SubLObject $const24$KnowledgeAcquisitionGoal_Verifyin;
  private static final SubLObject $const25$KnowledgeAcquisitionGoal_Verifyin;
  private static final SubLObject $const26$KnowledgeAcquisitionGoal_Verifyin;
  private static final SubLString $str27$Unknown_question_type__A____dont_;
  private static final SubLSymbol $sym28$FORT_P;
  private static final SubLObject $const29$TrueCycLSentence;
  private static final SubLObject $const30$FalseCycLSentence;
  private static final SubLSymbol $sym31$QUESTION_STILL_NEEDS_TO_BE_ASKED_OF_USER_;
  private static final SubLSymbol $kw32$TEST;
  private static final SubLSymbol $kw33$OWNER;
  private static final SubLSymbol $kw34$CLASSES;
  private static final SubLSymbol $kw35$KB;
  private static final SubLSymbol $kw36$FULL;
  private static final SubLSymbol $kw37$WORKING_;
  private static final SubLList $list38;
  private static final SubLObject $const39$WebGame_MultipleChoiceSentences_W;
  private static final SubLSymbol $sym40$GET_ITERATOR_FOR_QUESTIONS_TO_ASK;
  private static final SubLSymbol $sym41$QUESTIONS_TO_ASK_ITERATOR_DONE;
  private static final SubLSymbol $sym42$QUESTIONS_TO_ASK_ITERATOR_NEXT;
  private static final SubLSymbol $sym43$QUESTIONS_TO_ASK_ITERATOR_FINALIZE;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$_SET;
  private static final SubLSymbol $sym46$GET_TOPICAL_ITERATOR_FOR_QUESTIONS_TO_ASK;
  private static final SubLObject $const47$not;
  private static final SubLObject $const48$or;
  private static final SubLSymbol $sym49$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_DONE;
  private static final SubLSymbol $sym50$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_NEXT;
  private static final SubLSymbol $sym51$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_FINALIZE;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLObject $const54$and;
  private static final SubLString $str55$Malformed_topics_filter_expressio;
  private static final SubLString $str56$Implementation_error__overlooked_;
  private static final SubLSymbol $sym57$TOPIC_MATCHES_TOPICS_FILTER_;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$TOPIC_LIST_MATCHES_TOPICS_FILTER_;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$QUESTION_TOPICS_INFORMATION_FOR_PREDICATE;
  private static final SubLSymbol $kw62$TOPIC;
  private static final SubLObject $const63$ist_Asserted;
  private static final SubLObject $const64$FactFactoryVerificationSentencesM;
  private static final SubLObject $const65$isa;
  private static final SubLObject $const66$FACToryVerificationPredForTopicFn;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$_QUESTION_TOPICS_INFORMATION_FOR_PREDICATE_CACHING_STATE_;
  private static final SubLSymbol $sym69$TITLE_FOR_QUESTION_TOPIC;
  private static final SubLSymbol $kw70$LABEL;
  private static final SubLObject $const71$TopicMt;
  private static final SubLObject $const72$topicTitle;
  private static final SubLList $list73;
  private static final SubLString $str74$General;
  private static final SubLSymbol $sym75$_TITLE_FOR_QUESTION_TOPIC_CACHING_STATE_;
  private static final SubLSymbol $sym76$EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC;
  private static final SubLSymbol $sym77$_EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC_CACHING_STATE_;
  private static final SubLSymbol $sym78$EXTERNAL_IDENTIFICATION_FOR_CHOICE;
  private static final SubLSymbol $sym79$_EXTERNAL_IDENTIFICATION_FOR_CHOICE_CACHING_STATE_;
  private static final SubLSymbol $sym80$GENERATE_XML_FILE_OF_QUESTIONS_TO_ASK;
  private static final SubLSymbol $kw81$OUTPUT;
  private static final SubLString $str82$Unable_to_open__S;
  private static final SubLSymbol $sym83$GENERATE_XML_FILE_OF_TOPICAL_QUESTIONS_TO_ASK;
  private static final SubLSymbol $sym84$COMPUTE_TOPICAL_QUESTIONS_TO_ASK;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$GET_TOPIC_QUESTIONS_COUNT;
  private static final SubLSymbol $sym87$_;
  private static final SubLSymbol $sym88$CDR;
  private static final SubLSymbol $sym89$GENERATE_STRIPED_XML_FOR_QUESTION_TO_ASK_USER;
  private static final SubLString $str90$Generating_striped_XML_____;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$_EXIT;
  private static final SubLSymbol $sym93$GENERATE_STRIPED_QUESTION_LIST_ITERATOR_TO_ASK_USER;
  private static final SubLString $str94$Generating_striped_list_iterator_;
  private static final SubLSymbol $sym95$GET_QUESTIONS_TO_ASK_USER_IN_XML;
  private static final SubLSymbol $sym96$CLET;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$ITERATOR_P;
  private static final SubLString $str99$askingQuestions;
  private static final SubLString $str100$http___www_opencyc_org_xml_asking;
  private static final SubLSymbol $kw101$UNINITIALIZED;
  private static final SubLString $str102$questionSets;
  private static final SubLString $str103$questionSet;
  private static final SubLObject $const104$KnowledgeAcquisitionGoal_Falsifyi;
  private static final SubLString $str105$Dont_know_how_to_handle_question_;
  private static final SubLString $str106$Falsifying_Lies_are_not_supported;
  private static final SubLSymbol $sym107$_VALUE;
  private static final SubLString $str108$choiceQuestion;
  private static final SubLString $str109$prologue;
  private static final SubLString $str110$Please_complete_the_following_sen;
  private static final SubLString $str111$incompleteSentence;
  private static final SubLString $str112$questions;
  private static final SubLString $str113$epilogue;
  private static final SubLString $str114$I_ve_narrowed_down_the_choices_to;
  private static final SubLString $str115$I_ve_narrowed_down_the_choices_to;
  private static final SubLString $str116$_;
  private static final SubLString $str117$_____;
  private static final SubLSymbol $sym118$CCONCATENATE;
  private static final SubLSymbol $kw119$INTERROGATIVE;
  private static final SubLString $str120$entryType;
  private static final SubLString $str121$multiple;
  private static final SubLString $str122$single;
  private static final SubLString $str123$choices;
  private static final SubLList $list124;
  private static final SubLString $str125$suid;
  private static final SubLString $str126$id;
  private static final SubLString $str127$choice;
  private static final SubLString $str128$readingQuestion;
  private static final SubLString $str129$I_am_thinking_of_a_sentence_____;
  private static final SubLString $str130$Because_I_read_it_on_the_web_;
  private static final SubLString $str131$abductiveQuestion;
  private static final SubLString $str132$Because_I_am_guessing_;
  private static final SubLString $str133$hypothesizedQuestion;
  private static final SubLString $str134$Because_I_think_it_might_be_true_;
  private static final SubLString $str135$kbQuestion;
  private static final SubLString $str136$Because_someone_told_me_so_;
  private static final SubLSymbol $kw137$DECLARATIVE;
  private static final SubLString $str138$ruleQuestion;
  private static final SubLString $str139$I_have_an_idea__if_I_am_right_it_;
  private static final SubLString $str140$ruleText;
  private static final SubLString $str141$Because_if_I_am_right_it_would_me;
  private static final SubLString $str142$question;
  private static final SubLString $str143$topics;
  private static final SubLList $list144;
  private static final SubLString $str145$topic;
  private static final SubLString $str146$text;
  private static final SubLString $str147$responses;
  private static final SubLString $str148$_;
  private static final SubLString $str149$T;
  private static final SubLString $str150$F;
  private static final SubLObject $const151$SkippedCycLSentence;
  private static final SubLString $str152$S;
  private static final SubLObject $const153$UnclearCycLSentence;
  private static final SubLString $str154$N;
  private static final SubLString $str155$Dont_know_how_to_deal_with_respon;
  private static final SubLSymbol $sym156$NOTE_USER_EVALUATIONS_OF_SENTENCES;
  private static final SubLList $list157;
  private static final SubLSymbol $sym158$NOTE_USER_EVALUATION_OF_SENTENCE;
  private static final SubLObject $const159$CycLPropositionalSentence;
  private static final SubLString $str160$Term__A_does_not_denote_a_valid_e;
  private static final SubLObject $const161$evaluationOfAs;
  private static final SubLObject $const162$EvaluationOfByOnFn;
  private static final SubLObject $const163$MtWithFocalContentSentenceFn;
  private static final SubLObject $const164$Quote;
  private static final SubLObject $const165$SomeFn;
  private static final SubLObject $const166$SubCollectionNamedFn;
  private static final SubLList $list167;
  private static final SubLSymbol $sym168$NOTE_GOAL_CATEGORY_FOR_SENTENCE;
  private static final SubLObject $const169$goalCategoryForAgent;
  private static final SubLObject $const170$Cyc;
  private static final SubLObject $const171$thereExists;
  private static final SubLSymbol $sym172$_TV;
  private static final SubLObject $const173$knows;
  private static final SubLObject $const174$sentenceTruth;
  private static final SubLList $list175;
  private static final SubLList $list176;
  private static final SubLSymbol $sym177$LOAD_USER_EVALUATED_SENTENCES;
  private static final SubLSymbol $kw178$INPUT;
  private static final SubLString $str179$Loading_webgame_results_from_;
  private static final SubLString $str180$_____;
  private static final SubLSymbol $kw181$EOF;
  private static final SubLSymbol $kw182$DONE;
  private static final SubLSymbol $sym183$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list184;
  private static final SubLString $str185$Could_not_store_result__A____erro;
  private static final SubLSymbol $sym186$LOAD_AND_SUBMIT_EVALUATED_SENTENCES_FROM_FILE;
  private static final SubLObject $const187$FACTory_WebGame;
  private static final SubLSymbol $sym188$RECORD_CONSENSUS_SENTENCE_EVALUATION;
  private static final SubLObject $const189$sentenceAssignedStatusViaInfoStor;
  private static final SubLSymbol $kw190$TRUE;
  private static final SubLSymbol $kw191$FALSE;
  private static final SubLSymbol $kw192$NONSENSE;
  private static final SubLObject $const193$RidiculousCycLSentence;
  private static final SubLSymbol $kw194$OBSCURE;
  private static final SubLObject $const195$UninterestingCycLSentence;
  private static final SubLSymbol $kw196$PROBABLY_TRUE;
  private static final SubLObject $const197$PlausibleCycLSentence;
  private static final SubLSymbol $kw198$PROBABLY_FALSE;
  private static final SubLObject $const199$ImplausibleCycLSentence;
  private static final SubLSymbol $kw200$PROBABLY_NONSENSE;
  private static final SubLSymbol $kw201$PROBLEM;
  private static final SubLObject $list202;

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 2639L)
  public static SubLObject get_questions_to_ask_user(final SubLObject user_alias, SubLObject domain_mt, SubLObject evaluation_mt, SubLObject max_number)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    if( evaluation_mt == UNPROVIDED )
    {
      evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
    }
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != unicode_strings.ascii_string_p( user_alias ) : user_alias;
    assert NIL != hlmt.possibly_hlmt_p( domain_mt ) : domain_mt;
    assert NIL != hlmt.possibly_hlmt_p( evaluation_mt ) : evaluation_mt;
    assert NIL != subl_promotions.positive_integer_p( max_number ) : max_number;
    SubLObject sentences = NIL;
    SubLObject found = ZERO_INTEGER;
    thread.resetMultipleValues();
    final SubLObject seen_sentences = get_bindings_dictionary_for_questions_to_ask_user( user_alias, domain_mt, evaluation_mt, max_number );
    final SubLObject question_types = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( seen_sentences ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject sentence = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject eval_info = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject sorted_info = Sort.sort( eval_info, Symbols.symbol_function( $sym9$_ ), Symbols.symbol_function( $sym10$FIRST ) );
      final SubLObject responses = Mapping.mapcar( Symbols.symbol_function( $sym11$SECOND ), sorted_info );
      final SubLObject question_type = dictionary.dictionary_lookup( question_types, sentence, $const12$KnowledgeAcquisitionGoal_Verifyin );
      if( NIL != question_still_needs_to_be_asked_of_userP( question_type, responses ) )
      {
        sentences = ConsesLow.cons( ConsesLow.list( question_type, ConsesLow.list( sentence ), responses ), sentences );
        found = Numbers.add( found, ONE_INTEGER );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    if( found.numL( max_number ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject alt_bindings = cdolist_list_var = get_alternate_bindings_for_questions_to_ask_user( user_alias, domain_mt, evaluation_mt, Numbers.subtract( max_number, found ) );
      SubLObject alt_binding_set = NIL;
      alt_binding_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject v_question = extract_question_to_ask_from_alt_binding_set( alt_binding_set );
        final SubLObject question_type2 = extract_goal_type_from_alt_binding_set( alt_binding_set );
        sentences = ConsesLow.cons( ConsesLow.list( question_type2, ConsesLow.list( v_question ) ), sentences );
        found = Numbers.add( found, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        alt_binding_set = cdolist_list_var.first();
      }
    }
    return list_utilities.randomize_list( sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 4710L)
  public static SubLObject get_alternate_bindings_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt, final SubLObject number)
  {
    return inference_kernel.new_cyc_query( get_alternate_query_for_questions_to_ask_user( user_alias, domain_mt, evaluation_mt ), domain_mt, get_alternate_query_properties_for_questions_to_ask_user( number ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 5049L)
  public static SubLObject package_sentence_for_question_to_be_asked_of_user(final SubLObject v_question, final SubLObject question_type, final SubLObject domain_mt)
  {
    if( $const13$KnowledgeAcquisitionGoal_Verifyin.eql( question_type ) )
    {
      enforceType( v_question, $sym14$EL_IMPLICATION_P );
      final SubLObject examples = example_finder.example_consequents_for_rule( v_question, domain_mt, UNPROVIDED, UNPROVIDED );
      return ConsesLow.cons( v_question, examples );
    }
    return ConsesLow.list( v_question );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 5457L)
  public static SubLObject get_bindings_dictionary_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt, SubLObject max_number)
  {
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query = get_query_for_questions_to_ask_user( user_alias, domain_mt, evaluation_mt );
    final SubLObject question_sentences = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject question_types = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject query_properties = get_query_properties_for_questions_to_ask_user( max_number );
    final SubLObject static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties( query_properties );
    final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties( query_properties );
    final SubLObject inference = inference_kernel.new_continuable_inference( query, domain_mt, static_properties );
    final SubLObject inference_iterator = inference_iterators.new_inference_iterator( inference, dynamic_properties, $sym15$DESTROY_INFERENCE_AND_PROBLEM_STORE );
    SubLObject done_var;
    SubLObject valid;
    for( SubLObject doneP = done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != doneP ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = iteration.iteration_next( inference_iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        final SubLObject v_question = extract_question_to_ask_from_binding_set( v_bindings );
        final SubLObject question_type = extract_goal_type_from_binding_set( v_bindings );
        final SubLObject eval_info = extract_evaluation_information_set_from_binding_set( v_bindings );
        if( dictionary.dictionary_length( question_sentences ).numG( $web_game_default_max_number$.getDynamicValue( thread ) ) )
        {
          doneP = T;
        }
        else
        {
          dictionary.dictionary_enter( question_sentences, v_question, eval_info );
          dictionary.dictionary_enter( question_types, v_question, question_type );
        }
      }
    }
    return Values.values( question_sentences, question_types );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 6992L)
  public static SubLObject get_query_properties_for_questions_to_ask_user(final SubLObject max_number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_properties = kb_query.kbq_query_properties( $web_game_questions_query$.getDynamicValue( thread ) );
    return conses_high.putf( conses_high.copy_list( v_properties ), $kw16$MAX_NUMBER, max_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 7207L)
  public static SubLObject get_alternate_query_properties_for_questions_to_ask_user(final SubLObject max_number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return get_query_properties_with_max_number_override( $web_game_alternate_questions_query$.getDynamicValue( thread ), max_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 7408L)
  public static SubLObject get_query_properties_with_max_number_override(final SubLObject v_term, final SubLObject max_number)
  {
    final SubLObject v_properties = kb_query.kbq_query_properties( v_term );
    return conses_high.putf( conses_high.copy_list( v_properties ), $kw16$MAX_NUMBER, max_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 7607L)
  public static SubLObject get_alternate_query_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return kb_query.kbq_sentence( $web_game_alternate_questions_query$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 8092L)
  public static SubLObject get_query_for_questions_to_ask_user(final SubLObject user_alias, final SubLObject domain_mt, final SubLObject evaluation_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.subst( user_alias, $question_to_ask_user_template_name$.getGlobalValue(), kb_query.kbq_sentence( $web_game_questions_query$.getDynamicValue( thread ) ), Symbols.symbol_function( EQUAL ),
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 8348L)
  public static SubLObject extract_question_to_ask_from_alt_binding_set(final SubLObject binding_set)
  {
    return extract_question_to_ask_from_binding_set( binding_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 8488L)
  public static SubLObject extract_question_to_ask_from_binding_set(final SubLObject binding_set)
  {
    return bindings.variable_lookup( $question_to_ask_variable$.getGlobalValue(), binding_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 8752L)
  public static SubLObject extract_evaluation_information_from_binding_set(final SubLObject binding_set)
  {
    final SubLObject predicate = bindings.variable_lookup( $evaluation_predicate_variable$.getGlobalValue(), binding_set );
    final SubLObject timestamp = bindings.variable_lookup( $evaluation_timestamp_variable$.getGlobalValue(), binding_set );
    return ConsesLow.list( timestamp, predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9108L)
  public static SubLObject extract_evaluation_information_set_from_binding_set(final SubLObject binding_set)
  {
    final SubLObject eval_set = bindings.variable_lookup( $evaluation_information_set_variable$.getGlobalValue(), binding_set );
    return Mapping.mapcar( $sym22$REST, eval_set.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9520L)
  public static SubLObject extract_goal_type_from_binding_set(final SubLObject binding_set)
  {
    return bindings.variable_lookup( $evaluation_goaltype_variable$.getGlobalValue(), binding_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9656L)
  public static SubLObject extract_goal_type_from_alt_binding_set(final SubLObject binding_set)
  {
    return bindings.variable_lookup( $evaluation_goaltype_variable$.getGlobalValue(), binding_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 9979L)
  public static SubLObject question_still_needs_to_be_asked_of_userP(final SubLObject question_type, final SubLObject responses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject belief = NIL;
    if( question_type.eql( $const12$KnowledgeAcquisitionGoal_Verifyin ) || question_type.eql( $const13$KnowledgeAcquisitionGoal_Verifyin ) )
    {
      belief = Numbers.integerDivide( $maximum_belief_for_question$.getDynamicValue( thread ), TWO_INTEGER );
    }
    else if( question_type.eql( $const24$KnowledgeAcquisitionGoal_Verifyin ) )
    {
      belief = Numbers.integerDivide( $maximum_belief_for_question$.getDynamicValue( thread ), TWO_INTEGER );
    }
    else if( question_type.eql( $const25$KnowledgeAcquisitionGoal_Verifyin ) )
    {
      belief = Numbers.integerDivide( $maximum_belief_for_question$.getDynamicValue( thread ), FOUR_INTEGER );
    }
    else if( question_type.eql( $const26$KnowledgeAcquisitionGoal_Verifyin ) )
    {
      belief = Numbers.round( Numbers.multiply( FOUR_INTEGER, Numbers.divide( $maximum_belief_for_question$.getDynamicValue( thread ), FIVE_INTEGER ) ), UNPROVIDED );
    }
    else
    {
      Errors.error( $str27$Unknown_question_type__A____dont_, question_type );
    }
    SubLObject list_var = NIL;
    SubLObject predicate = NIL;
    SubLObject vote = NIL;
    list_var = responses;
    predicate = list_var.first();
    for( vote = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), predicate = list_var.first(), vote = Numbers.add( ONE_INTEGER, vote ) )
    {
      assert NIL != forts.fort_p( predicate ) : predicate;
      if( vote.numGE( $maximum_votes_for_question$.getDynamicValue( thread ) ) )
      {
        return NIL;
      }
      SubLObject modified = NIL;
      final SubLObject amount = vote.numLE( Numbers.integerDivide( $maximum_votes_for_question$.getDynamicValue( thread ), TWO_INTEGER ) ) ? TWO_INTEGER : ONE_INTEGER;
      final SubLObject pcase_var = predicate;
      if( pcase_var.eql( $const29$TrueCycLSentence ) )
      {
        belief = Numbers.add( belief, amount );
        modified = T;
      }
      else if( pcase_var.eql( $const30$FalseCycLSentence ) )
      {
        belief = Numbers.subtract( belief, amount );
        modified = T;
      }
      if( NIL != modified && NIL != belief_value_has_reached_certaintyP( belief ) )
      {
        return NIL;
      }
    }
    return makeBoolean( NIL == belief_value_has_reached_certaintyP( belief ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 11617L)
  public static SubLObject belief_value_has_reached_certaintyP(final SubLObject belief)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( !belief.isPositive() || belief.numG( $maximum_belief_for_question$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 13762L)
  public static SubLObject get_iterator_for_questions_to_ask(SubLObject domain_mt, SubLObject max_number, SubLObject topics_filter)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    if( topics_filter == UNPROVIDED )
    {
      topics_filter = NIL;
    }
    SubLObject iterators = NIL;
    SubLObject cdolist_list_var = $web_game_master_query_set$.getGlobalValue();
    SubLObject query_term = NIL;
    query_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject query = get_questions_query_sentence_with_topics_filtering( query_term, topics_filter );
      final SubLObject query_properties = get_query_properties_with_max_number_override( query_term, max_number );
      final SubLObject static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties( query_properties );
      final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties( query_properties );
      final SubLObject inference = inference_kernel.new_continuable_inference( query, domain_mt, static_properties );
      final SubLObject inference_iterator = inference_iterators.new_inference_iterator( inference, dynamic_properties, $sym15$DESTROY_INFERENCE_AND_PROBLEM_STORE );
      iterators = ConsesLow.cons( inference_iterator, iterators );
      cdolist_list_var = cdolist_list_var.rest();
      query_term = cdolist_list_var.first();
    }
    final SubLObject master_iterator = iteration.new_rotating_iterator_iterator( iterators );
    return iteration.new_iterator( make_questions_to_ask_iterator_state( master_iterator, max_number, domain_mt ), $sym41$QUESTIONS_TO_ASK_ITERATOR_DONE, $sym42$QUESTIONS_TO_ASK_ITERATOR_NEXT,
        $sym43$QUESTIONS_TO_ASK_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 15245L)
  public static SubLObject get_questions_query_sentence_with_topics_filtering(final SubLObject query_term, final SubLObject topics_filter)
  {
    final SubLObject sentence = kb_query.kbq_sentence( query_term );
    if( NIL != list_utilities.sublisp_boolean( topics_filter ) )
    {
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 15501L)
  public static SubLObject make_questions_to_ask_iterator_state(final SubLObject inference_iterator, final SubLObject answer_count, final SubLObject domain_mt)
  {
    return ConsesLow.list( inference_iterator, answer_count, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 15663L)
  public static SubLObject questions_to_ask_iterator_next(SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = state;
    SubLObject inference_iterator = NIL;
    SubLObject counter = NIL;
    SubLObject domain_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    inference_iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    counter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    domain_mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      thread.resetMultipleValues();
      final SubLObject alt_binding_set = iteration.iteration_next( inference_iterator );
      final SubLObject item_validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject v_question = extract_question_to_ask_from_alt_binding_set( alt_binding_set );
      final SubLObject question_type = extract_goal_type_from_alt_binding_set( alt_binding_set );
      final SubLObject responses = NIL;
      final SubLObject choices = bindings.variable_lookup( $sym45$_SET, alt_binding_set );
      final SubLObject topics = extract_question_topics_from_question( v_question, domain_mt );
      if( NIL != item_validP )
      {
        counter = Numbers.subtract( counter, ONE_INTEGER );
        state = make_questions_to_ask_iterator_state( inference_iterator, counter, domain_mt );
      }
      return Values.values( ConsesLow.list( question_type, ConsesLow.list( v_question ), responses, topics, choices ), state, makeBoolean( NIL == item_validP ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 16558L)
  public static SubLObject questions_to_ask_iterator_done(final SubLObject state)
  {
    SubLObject inference_iterator = NIL;
    SubLObject counter = NIL;
    SubLObject domain_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list44 );
    inference_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list44 );
    counter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list44 );
    domain_mt = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list44 );
      return NIL;
    }
    if( !counter.isPositive() )
    {
      return T;
    }
    return iteration.iteration_done( inference_iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 16814L)
  public static SubLObject questions_to_ask_iterator_finalize(final SubLObject state)
  {
    SubLObject inference_iterator = NIL;
    SubLObject counter = NIL;
    SubLObject domain_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list44 );
    inference_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list44 );
    counter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list44 );
    domain_mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return iteration.iteration_finalize( inference_iterator );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 17031L)
  public static SubLObject get_topical_iterator_for_questions_to_ask(SubLObject topics_filter, SubLObject domain_mt, SubLObject max_number)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    if( NIL != fort_types_interface.list_of_collections_p( topics_filter ) )
    {
      topics_filter = ConsesLow.list( $const47$not, ConsesLow.cons( $const48$or, topics_filter ) );
    }
    final SubLObject question_iterator = get_iterator_for_questions_to_ask( domain_mt, Numbers.$most_positive_fixnum$.getGlobalValue(), UNPROVIDED );
    return iteration.new_iterator( make_topical_questions_to_ask_iterator_state( question_iterator, topics_filter, max_number ), $sym49$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_DONE,
        $sym50$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_NEXT, $sym51$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 18047L)
  public static SubLObject make_topical_questions_to_ask_iterator_state(final SubLObject question_iterator, final SubLObject topics_filter, final SubLObject counter)
  {
    return ConsesLow.list( question_iterator, topics_filter, counter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 18208L)
  public static SubLObject topical_questions_to_ask_iterator_done(final SubLObject state)
  {
    SubLObject question_iterator = NIL;
    SubLObject topics_filter = NIL;
    SubLObject counter = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list52 );
    question_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list52 );
    topics_filter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list52 );
    counter = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list52 );
      return NIL;
    }
    if( !counter.isPositive() )
    {
      return T;
    }
    return iteration.iteration_done( question_iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 18478L)
  public static SubLObject topical_questions_to_ask_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject question_iterator = NIL;
    SubLObject topics_filter = NIL;
    SubLObject counter = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list52 );
    question_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list52 );
    topics_filter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list52 );
    counter = current.first();
    current = current.rest();
    if( NIL == current )
    {
      while ( NIL == iteration.iteration_done( question_iterator ))
      {
        thread.resetMultipleValues();
        final SubLObject result = iteration.iteration_next( question_iterator );
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != validP )
        {
          SubLObject current_$2;
          final SubLObject datum_$1 = current_$2 = result;
          SubLObject type = NIL;
          SubLObject questions = NIL;
          SubLObject responses = NIL;
          SubLObject topics = NIL;
          SubLObject v_set = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list53 );
          type = current_$2.first();
          current_$2 = current_$2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list53 );
          questions = current_$2.first();
          current_$2 = current_$2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list53 );
          responses = current_$2.first();
          current_$2 = current_$2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list53 );
          topics = current_$2.first();
          current_$2 = current_$2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list53 );
          v_set = current_$2.first();
          current_$2 = current_$2.rest();
          if( NIL == current_$2 )
          {
            if( NIL == topics_fail_topics_filterP( topics, topics_filter ) )
            {
              counter = Numbers.subtract( counter, ONE_INTEGER );
              return Values.values( result, make_topical_questions_to_ask_iterator_state( question_iterator, topics_filter, counter ), NIL );
            }
            continue;
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list53 );
          }
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list52 );
    }
    return Values.values( NIL, state, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 19407L)
  public static SubLObject topics_fail_topics_filterP(final SubLObject topics, final SubLObject topics_filter)
  {
    if( NIL != list_utilities.singletonP( topics ) )
    {
      return topic_fails_topics_filterP( topics.first(), topics_filter );
    }
    return topic_list_fails_fopics_filterP( topics, topics_filter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 19655L)
  public static SubLObject topic_fails_topics_filterP(final SubLObject topic, final SubLObject topics_filter)
  {
    return makeBoolean( NIL == topic_matches_topics_filterP( topic, topics_filter ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 19789L)
  public static SubLObject topic_matches_topics_filterP(final SubLObject topic, final SubLObject topics_filter)
  {
    final SubLObject hl_topic = czer_main.canonicalize_term( topic, UNPROVIDED );
    return topic_matches_topics_filter_expression( hl_topic, topics_filter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 19980L)
  public static SubLObject topic_list_fails_fopics_filterP(final SubLObject topic_list, final SubLObject topics_filter)
  {
    return makeBoolean( NIL == topic_list_matches_topics_filterP( topic_list, topics_filter ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 20134L)
  public static SubLObject topic_list_matches_topics_filterP(final SubLObject topic_list, final SubLObject topics_filter)
  {
    final SubLObject topic_set = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = topic_list;
    SubLObject topic = NIL;
    topic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( czer_main.canonicalize_term( topic, UNPROVIDED ), topic_set );
      cdolist_list_var = cdolist_list_var.rest();
      topic = cdolist_list_var.first();
    }
    return topic_set_matches_topics_filter_expression( topic_set, topics_filter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 20410L)
  public static SubLObject topic_set_matches_topics_filter_expression(final SubLObject topic_set, final SubLObject expression)
  {
    if( NIL != forts.fort_p( expression ) )
    {
      return set.set_memberP( expression, topic_set );
    }
    if( expression.isCons() )
    {
      if( NIL != narts_high.naut_p( expression ) )
      {
        return set.set_memberP( narts_high.find_nart( expression ), topic_set );
      }
      final SubLObject pcase_var = expression.first();
      if( pcase_var.eql( $const54$and ) )
      {
        SubLObject result = T;
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var = expression.rest();
          SubLObject item = NIL;
          item = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            result = makeBoolean( NIL != result && NIL != topic_set_matches_topics_filter_expression( topic_set, item ) );
            doneP = makeBoolean( NIL == result );
            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
          }
        }
        return result;
      }
      if( pcase_var.eql( $const47$not ) )
      {
        return makeBoolean( NIL == topic_set_matches_topics_filter_expression( topic_set, conses_high.second( expression ) ) );
      }
      if( pcase_var.eql( $const48$or ) )
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var;
          SubLObject item;
          for( csome_list_var = expression.rest(), item = NIL, item = csome_list_var.first(); NIL == doneP && NIL != csome_list_var; result = ( doneP = makeBoolean( NIL != result
              || NIL != topic_set_matches_topics_filter_expression( topic_set, item ) ) ), csome_list_var = csome_list_var.rest(), item = csome_list_var.first() )
          {
          }
        }
        return result;
      }
      Errors.error( $str55$Malformed_topics_filter_expressio, expression );
    }
    else
    {
      Errors.error( $str56$Implementation_error__overlooked_, expression );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 21610L)
  public static SubLObject topic_matches_topics_filter_expression(final SubLObject topic, final SubLObject expression)
  {
    if( NIL != forts.fort_p( expression ) )
    {
      return Equality.equal( topic, expression );
    }
    if( expression.isCons() )
    {
      if( NIL != narts_high.naut_p( expression ) )
      {
        return Equality.equal( topic, narts_high.find_nart( expression ) );
      }
      final SubLObject pcase_var = expression.first();
      if( pcase_var.eql( $const54$and ) )
      {
        SubLObject result = T;
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var = expression.rest();
          SubLObject item = NIL;
          item = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            result = makeBoolean( NIL != result && NIL != topic_matches_topics_filter_expression( topic, item ) );
            doneP = makeBoolean( NIL == result );
            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
          }
        }
        return result;
      }
      if( pcase_var.eql( $const47$not ) )
      {
        return makeBoolean( NIL == topic_matches_topics_filter_expression( topic, conses_high.second( expression ) ) );
      }
      if( pcase_var.eql( $const48$or ) )
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var;
          SubLObject item;
          for( csome_list_var = expression.rest(), item = NIL, item = csome_list_var.first(); NIL == doneP && NIL != csome_list_var; result = ( doneP = makeBoolean( NIL != result
              || NIL != topic_matches_topics_filter_expression( topic, item ) ) ), csome_list_var = csome_list_var.rest(), item = csome_list_var.first() )
          {
          }
        }
        return result;
      }
      Errors.error( $str55$Malformed_topics_filter_expressio, expression );
    }
    else
    {
      Errors.error( $str56$Implementation_error__overlooked_, expression );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 24404L)
  public static SubLObject topical_questions_to_ask_iterator_finalize(final SubLObject state)
  {
    SubLObject question_iterator = NIL;
    SubLObject topics_filter = NIL;
    SubLObject counter = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list52 );
    question_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list52 );
    topics_filter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list52 );
    counter = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return iteration.iteration_finalize( question_iterator );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list52 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 24636L)
  public static SubLObject extract_question_topics_from_question(final SubLObject v_question, final SubLObject domain_mt)
  {
    final SubLObject predicate = extract_topical_predicate_from_question( v_question );
    final SubLObject topics = question_topics_information_for_predicate( predicate, domain_mt );
    SubLObject topics_and_labels = NIL;
    SubLObject cdolist_list_var = topics;
    SubLObject topic = NIL;
    topic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      topics_and_labels = ConsesLow.cons( ConsesLow.list( topic, title_for_question_topic( topic, domain_mt ) ), topics_and_labels );
      cdolist_list_var = cdolist_list_var.rest();
      topic = cdolist_list_var.first();
    }
    return topics_and_labels;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25127L)
  public static SubLObject extract_topical_predicate_from_question(final SubLObject v_question)
  {
    final SubLObject predicate = cycl_utilities.formula_arg0( v_question );
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25306L)
  public static SubLObject clear_question_topics_information_for_predicate()
  {
    final SubLObject cs = $question_topics_information_for_predicate_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25306L)
  public static SubLObject remove_question_topics_information_for_predicate(final SubLObject predicate, final SubLObject domain_mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $question_topics_information_for_predicate_caching_state$.getGlobalValue(), ConsesLow.list( predicate, domain_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25306L)
  public static SubLObject question_topics_information_for_predicate_internal(final SubLObject predicate, final SubLObject domain_mt)
  {
    final SubLObject topic_token = $kw62$TOPIC;
    final SubLObject sentence = ConsesLow.list( $const63$ist_Asserted, $const64$FactFactoryVerificationSentencesM, ConsesLow.list( $const65$isa, predicate, ConsesLow.list( $const66$FACToryVerificationPredForTopicFn,
        topic_token ) ) );
    SubLObject topics = ask_utilities.query_variable( topic_token, sentence, domain_mt, UNPROVIDED );
    if( NIL == topics )
    {
      topics = $list67;
    }
    return topics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25306L)
  public static SubLObject question_topics_information_for_predicate(final SubLObject predicate, final SubLObject domain_mt)
  {
    SubLObject caching_state = $question_topics_information_for_predicate_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym61$QUESTION_TOPICS_INFORMATION_FOR_PREDICATE, $sym68$_QUESTION_TOPICS_INFORMATION_FOR_PREDICATE_CACHING_STATE_, NIL, EQL, TWO_INTEGER,
          TWENTY_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( predicate, domain_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( predicate.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( question_topics_information_for_predicate_internal( predicate, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicate, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25759L)
  public static SubLObject clear_title_for_question_topic()
  {
    final SubLObject cs = $title_for_question_topic_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25759L)
  public static SubLObject remove_title_for_question_topic(final SubLObject topic, final SubLObject domain_mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $title_for_question_topic_caching_state$.getGlobalValue(), ConsesLow.list( topic, domain_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25759L)
  public static SubLObject title_for_question_topic_internal(final SubLObject topic, final SubLObject domain_mt)
  {
    final SubLObject label_token = $kw70$LABEL;
    final SubLObject sentence = ConsesLow.list( $const63$ist_Asserted, $const71$TopicMt, ConsesLow.list( $const72$topicTitle, topic, label_token ) );
    final SubLObject labels = ask_utilities.query_variable( label_token, sentence, domain_mt, $list73 );
    if( NIL != labels )
    {
      return labels.first();
    }
    return $str74$General;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 25759L)
  public static SubLObject title_for_question_topic(final SubLObject topic, final SubLObject domain_mt)
  {
    SubLObject caching_state = $title_for_question_topic_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym69$TITLE_FOR_QUESTION_TOPIC, $sym75$_TITLE_FOR_QUESTION_TOPIC_CACHING_STATE_, NIL, EQL, TWO_INTEGER, TWENTY_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( topic, domain_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( topic.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( title_for_question_topic_internal( topic, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( topic, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26186L)
  public static SubLObject clear_external_identification_for_question_topic()
  {
    final SubLObject cs = $external_identification_for_question_topic_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26186L)
  public static SubLObject remove_external_identification_for_question_topic(final SubLObject topic)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $external_identification_for_question_topic_caching_state$.getGlobalValue(), ConsesLow.list( topic ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26186L)
  public static SubLObject external_identification_for_question_topic_internal(final SubLObject topic)
  {
    return kb_utilities.hl_external_id_string( topic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26186L)
  public static SubLObject external_identification_for_question_topic(final SubLObject topic)
  {
    SubLObject caching_state = $external_identification_for_question_topic_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym76$EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC, $sym77$_EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC_CACHING_STATE_, NIL, EQL, ONE_INTEGER,
          TWENTY_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, topic, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( external_identification_for_question_topic_internal( topic ) ) );
      memoization_state.caching_state_put( caching_state, topic, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26309L)
  public static SubLObject clear_external_identification_for_choice()
  {
    final SubLObject cs = $external_identification_for_choice_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26309L)
  public static SubLObject remove_external_identification_for_choice(final SubLObject choice)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $external_identification_for_choice_caching_state$.getGlobalValue(), ConsesLow.list( choice ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26309L)
  public static SubLObject external_identification_for_choice_internal(final SubLObject choice)
  {
    return kb_utilities.hl_external_id_string( choice );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26309L)
  public static SubLObject external_identification_for_choice(final SubLObject choice)
  {
    SubLObject caching_state = $external_identification_for_choice_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym78$EXTERNAL_IDENTIFICATION_FOR_CHOICE, $sym79$_EXTERNAL_IDENTIFICATION_FOR_CHOICE_CACHING_STATE_, NIL, EQL, ONE_INTEGER, TWENTY_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, choice, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( external_identification_for_choice_internal( choice ) ) );
      memoization_state.caching_state_put( caching_state, choice, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26427L)
  public static SubLObject generate_xml_file_of_questions_to_ask(final SubLObject xml_filename, SubLObject domain_mt, SubLObject max_number)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject question_iterator = get_iterator_for_questions_to_ask( domain_mt, max_number, UNPROVIDED );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( xml_filename, $kw81$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str82$Unable_to_open__S, xml_filename );
      }
      final SubLObject xml_stream = stream;
      generate_xml_for_question_sets_to_ask_user( question_iterator, xml_stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return xml_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 26972L)
  public static SubLObject generate_xml_file_of_topical_questions_to_ask(final SubLObject xml_filename, final SubLObject topics_filter, SubLObject domain_mt, SubLObject max_number)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject topical_iterator = get_topical_iterator_for_questions_to_ask( topics_filter, domain_mt, max_number );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( xml_filename, $kw81$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str82$Unable_to_open__S, xml_filename );
      }
      final SubLObject xml_stream = stream;
      generate_xml_for_question_sets_to_ask_user( topical_iterator, xml_stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return xml_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 27591L)
  public static SubLObject compute_topical_questions_to_ask(SubLObject topics_filter, SubLObject domain_mt, SubLObject max_number)
  {
    if( topics_filter == UNPROVIDED )
    {
      topics_filter = NIL;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicates_seen = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject iterator_var = get_topical_iterator_for_questions_to_ask( topics_filter, domain_mt, max_number );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_question = iteration.iteration_next( iterator_var );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = v_question;
        SubLObject type = NIL;
        SubLObject sentences = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
        sentences = current.first();
        current = current.rest();
        final SubLObject responses = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
        current = current.rest();
        final SubLObject topic_infos = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
        current = current.rest();
        final SubLObject choice_set = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject sentence = sentences.first();
          final SubLObject predicate = cycl_utilities.formula_arg0( sentence );
          SubLObject queue = dictionary.dictionary_lookup( predicates_seen, predicate, UNPROVIDED );
          if( NIL == queue )
          {
            queue = queues.create_queue( UNPROVIDED );
            dictionary.dictionary_enter( predicates_seen, predicate, queue );
          }
          queues.enqueue( v_question, queue );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
        }
      }
    }
    return predicates_seen;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 28599L)
  public static SubLObject get_topic_questions_count(final SubLObject predicates_seen)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject counts = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( predicates_seen ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject queue = thread.secondMultipleValue();
      thread.resetMultipleValues();
      counts = ConsesLow.cons( ConsesLow.cons( predicate, queues.queue_size( queue ) ), counts );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Sort.sort( counts, Symbols.symbol_function( $sym87$_ ), Symbols.symbol_function( $sym88$CDR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 28912L)
  public static SubLObject generate_striped_xml_for_question_to_ask_user(final SubLObject topical_questions, final SubLObject filename_template, SubLObject count_limits)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject task_queue = compute_predicate_estimates_for_questions( topical_questions );
    final SubLObject total = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject counter = ZERO_INTEGER;
    SubLObject questions = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str90$Generating_striped_XML_____ );
        while ( NIL == queues.queue_empty_p( task_queue ))
        {
          final SubLObject task = queues.dequeue( task_queue );
          SubLObject current;
          final SubLObject datum = current = task;
          SubLObject predicate = NIL;
          SubLObject times = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
          predicate = current.first();
          current = ( times = current.rest() );
          final SubLObject queue = dictionary.dictionary_lookup( topical_questions, predicate, UNPROVIDED );
          final SubLObject v_question = queues.dequeue( queue );
          questions = ConsesLow.cons( v_question, questions );
          counter = Numbers.add( counter, ONE_INTEGER );
          if( counter.numGE( count_limits.first() ) )
          {
            questions = Sequences.nreverse( questions );
            final SubLObject filename = PrintLow.format( NIL, filename_template, count_limits.first() );
            SubLObject stream = NIL;
            try
            {
              final SubLObject _prev_bind_0_$3 = stream_macros.$stream_requires_locking$.currentBinding( thread );
              try
              {
                stream_macros.$stream_requires_locking$.bind( NIL, thread );
                stream = compatibility.open_text( filename, $kw81$OUTPUT );
              }
              finally
              {
                stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$3, thread );
              }
              if( !stream.isStream() )
              {
                Errors.error( $str82$Unable_to_open__S, filename );
              }
              final SubLObject s = stream;
              generate_xml_for_question_sets_to_ask_user( iteration.new_list_iterator( questions ), s );
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( stream.isStream() )
                {
                  streams_high.close( stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
            count_limits = count_limits.rest();
            if( NIL == count_limits )
            {
              return topical_questions;
            }
            questions = Sequences.nreverse( questions );
          }
          times = Numbers.subtract( times, ONE_INTEGER );
          if( times.isPositive() )
          {
            ConsesLow.rplacd( task, times );
            queues.enqueue( task, task_queue );
          }
          utilities_macros.note_percent_progress( counter, total );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return topical_questions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 30899L)
  public static SubLObject generate_striped_question_list_iterator_to_ask_user(final SubLObject topical_questions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject task_queue = compute_predicate_estimates_for_questions( topical_questions );
    final SubLObject total = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject counter = ZERO_INTEGER;
    SubLObject questions = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str94$Generating_striped_list_iterator_ );
        while ( NIL == queues.queue_empty_p( task_queue ))
        {
          final SubLObject task = queues.dequeue( task_queue );
          SubLObject current;
          final SubLObject datum = current = task;
          SubLObject predicate = NIL;
          SubLObject times = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
          predicate = current.first();
          current = ( times = current.rest() );
          final SubLObject queue = dictionary.dictionary_lookup( topical_questions, predicate, UNPROVIDED );
          final SubLObject v_question = queues.dequeue( queue );
          questions = ConsesLow.cons( v_question, questions );
          counter = Numbers.add( counter, ONE_INTEGER );
          times = Numbers.subtract( times, ONE_INTEGER );
          if( times.isPositive() )
          {
            ConsesLow.rplacd( task, times );
            queues.enqueue( task, task_queue );
          }
          utilities_macros.note_percent_progress( counter, total );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Values.values( iteration.new_list_iterator( Sequences.nreverse( questions ) ), total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 31951L)
  public static SubLObject compute_predicate_estimates_for_questions(final SubLObject topical_questions)
  {
    final SubLObject keys = dictionary.dictionary_keys( topical_questions );
    SubLObject total = ZERO_INTEGER;
    final SubLObject task_queue = queues.create_queue( UNPROVIDED );
    SubLObject estimates = NIL;
    SubLObject cdolist_list_var = keys;
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject queue = dictionary.dictionary_lookup( topical_questions, key, UNPROVIDED );
      final SubLObject size = queues.queue_size( queue );
      total = Numbers.add( total, size );
      estimates = ConsesLow.cons( ConsesLow.cons( key, size ), estimates );
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    cdolist_list_var = Sort.sort( estimates, Symbols.symbol_function( $sym87$_ ), $sym88$CDR );
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      queues.enqueue( tuple, task_queue );
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return Values.values( task_queue, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 32483L)
  public static SubLObject get_questions_to_ask_user_in_xml(final SubLObject user_alias, SubLObject domain_mt, SubLObject evaluation_mt, SubLObject max_number)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    if( evaluation_mt == UNPROVIDED )
    {
      evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
    }
    if( max_number == UNPROVIDED )
    {
      max_number = $web_game_default_max_number$.getDynamicValue();
    }
    final SubLObject questions = get_questions_to_ask_user( user_alias, domain_mt, evaluation_mt, max_number );
    return generate_xml_for_questions_to_ask_user( questions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 33052L)
  public static SubLObject generate_xml_for_questions_to_ask_user(final SubLObject questions)
  {
    SubLObject xml = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      generate_xml_for_question_sets_to_ask_user( iteration.new_list_iterator( questions ), stream );
      xml = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 33534L)
  public static SubLObject with_web_game_external_identification_tracking(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym96$CLET, $list97, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 33720L)
  public static SubLObject track_webgame_external_identificationsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_p( $web_game_terms_identification_tracking$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 33845L)
  public static SubLObject get_webgame_tracked_external_identification(final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tracker = $web_game_terms_identification_tracking$.getDynamicValue( thread );
    SubLObject suid = dictionary.dictionary_lookup( tracker, external_id, MINUS_ONE_INTEGER );
    SubLObject foundP = T;
    if( suid.isNegative() )
    {
      suid = dictionary.dictionary_length( tracker );
      foundP = NIL;
      dictionary.dictionary_enter( tracker, external_id, suid );
    }
    return Values.values( suid, foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 34242L)
  public static SubLObject write_xml_compliant_html_string(final SubLObject string, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$html_stream$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$html_stream$.bind( stream, thread );
      result = html_utilities.html_string( string, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_stream$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 34595L)
  public static SubLObject generate_xml_for_question_sets_to_ask_user(final SubLObject question_set, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != iteration.iterator_p( question_set ) : question_set;
    final SubLObject _prev_bind_0 = $web_game_terms_identification_tracking$.currentBinding( thread );
    final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      $web_game_terms_identification_tracking$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
      xml_vars.$xml_stream$.bind( stream, thread );
      xml_utilities.generate_valid_xml_header( stream );
      xml_utilities.generate_xml_header_entry_for_dtd( $str99$askingQuestions, $str100$http___www_opencyc_org_xml_asking, stream );
      xml_utilities.xml_terpri();
      try
      {
        final SubLObject _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str99$askingQuestions, NIL, NIL, NIL, $kw101$UNINITIALIZED );
          final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str102$questionSets, NIL, NIL, NIL, $kw101$UNINITIALIZED );
                final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                  generate_xml_for_question_set_to_ask_user( question_set );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$10, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$9, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$9, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str102$questionSets );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$8, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$8, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$7, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str99$askingQuestions );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_2, thread );
      $web_game_terms_identification_tracking$.rebind( _prev_bind_0, thread );
    }
    return question_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 35178L)
  public static SubLObject generate_xml_for_question_set_to_ask_user(final SubLObject question_set)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lies = ZERO_INTEGER;
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str103$questionSet, NIL, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_question = iteration.iteration_next( question_set );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              SubLObject current;
              final SubLObject datum = current = v_question;
              SubLObject type = NIL;
              SubLObject sentences = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
              type = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
              sentences = current.first();
              current = current.rest();
              final SubLObject responses = current.isCons() ? current.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
              current = current.rest();
              final SubLObject topic_infos = current.isCons() ? current.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
              current = current.rest();
              final SubLObject choice_set = current.isCons() ? current.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
              current = current.rest();
              if( NIL == current )
              {
                if( NIL != list_utilities.sublisp_boolean( choice_set ) )
                {
                  final SubLObject choices = choice_set.rest();
                  generate_xml_for_one_choice_question_to_ask_user( type, sentences, choices, topic_infos, responses );
                }
                else
                {
                  final SubLObject pcase_var = type;
                  if( pcase_var.eql( $const12$KnowledgeAcquisitionGoal_Verifyin ) )
                  {
                    generate_xml_for_one_reading_question_to_ask_user( type, sentences, topic_infos, responses );
                  }
                  else if( pcase_var.eql( $const24$KnowledgeAcquisitionGoal_Verifyin ) )
                  {
                    generate_xml_for_one_hypothesized_question_to_ask_user( type, sentences, topic_infos, responses );
                  }
                  else if( pcase_var.eql( $const25$KnowledgeAcquisitionGoal_Verifyin ) )
                  {
                    generate_xml_for_one_abductive_question_to_ask_user( type, sentences, topic_infos, responses );
                  }
                  else if( pcase_var.eql( $const26$KnowledgeAcquisitionGoal_Verifyin ) )
                  {
                    generate_xml_for_one_kb_question_to_ask_user( type, sentences, topic_infos, responses );
                  }
                  else if( pcase_var.eql( $const13$KnowledgeAcquisitionGoal_Verifyin ) )
                  {
                    generate_xml_for_one_rule_question_to_ask_user( type, sentences, topic_infos, responses );
                  }
                  else if( pcase_var.eql( $const104$KnowledgeAcquisitionGoal_Falsifyi ) )
                  {
                    lies = Numbers.add( lies, ONE_INTEGER );
                  }
                  else
                  {
                    Errors.error( $str105$Dont_know_how_to_handle_question_, type );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
              }
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$15, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str103$questionSet );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    if( lies.isPositive() )
    {
      Errors.warn( $str106$Falsifying_Lies_are_not_supported, lies );
    }
    return list_utilities.sublisp_boolean( question_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 37073L)
  public static SubLObject generate_xml_for_one_choice_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject choices, final SubLObject topic_infos, SubLObject responses)
  {
    if( responses == UNPROVIDED )
    {
      responses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str108$choiceQuestion, NIL, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          final SubLObject pattern = sentences.first();
          try
          {
            final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$prologue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str110$Please_complete_the_following_sen, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$18, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$18, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$17, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$prologue );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
            }
          }
          thread.resetMultipleValues();
          final SubLObject question_template = compute_question_template_from_example_sentences( pattern, choices );
          final SubLObject choices_generations = thread.secondMultipleValue();
          final SubLObject successP = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          try
          {
            final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str111$incompleteSentence, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                write_xml_compliant_html_string( question_template, xml_vars.$xml_stream$.getDynamicValue( thread ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$21, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$19, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$20, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str111$incompleteSentence );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str112$questions, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                SubLObject cdolist_list_var = choices;
                SubLObject choice = NIL;
                choice = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  final SubLObject sentence = list_utilities.tree_substitute( pattern, $web_game_choice_placeholder_in_sentence$.getGlobalValue(), choice );
                  generate_xml_for_one_question_to_ask_user( sentence, type, topic_infos, responses );
                  cdolist_list_var = cdolist_list_var.rest();
                  choice = cdolist_list_var.first();
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$24, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$20, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$23, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str112$questions );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
            }
          }
          final SubLObject allow_multipleP = determine_whether_multiple_entry_from_pattern( pattern );
          generate_xml_for_choices_to_pick_from( choices_generations, allow_multipleP );
          try
          {
            final SubLObject _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str113$epilogue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( ( NIL != allow_multipleP ) ? $str114$I_ve_narrowed_down_the_choices_to : $str115$I_ve_narrowed_down_the_choices_to, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED,
                    UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$27, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$21, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$26, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str113$epilogue );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values5 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str108$choiceQuestion );
        Values.restoreValuesFromVector( _values5 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 38465L)
  public static SubLObject compute_question_template_from_example_sentences(final SubLObject pattern, final SubLObject choices)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formula_position = cycl_utilities.arg_positions_dfs( $web_game_choice_placeholder_in_sentence$.getGlobalValue(), pattern, UNPROVIDED ).first();
    SubLObject choices_generation = NIL;
    SubLObject last_output = NIL;
    SubLObject failed_on = NIL;
    SubLObject last_output_list = NIL;
    SubLObject cdolist_list_var = choices;
    SubLObject choice = NIL;
    choice = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentence = list_utilities.tree_substitute( pattern, $web_game_choice_placeholder_in_sentence$.getGlobalValue(), choice );
      thread.resetMultipleValues();
      final SubLObject text = pph_main.generate_text_wXsentential_force( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject predicate = thread.secondMultipleValue();
      final SubLObject justification = thread.thirdMultipleValue();
      final SubLObject output_list = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      SubLObject current_output = NIL;
      SubLObject cdolist_list_var_$33 = output_list;
      SubLObject output_item = NIL;
      output_item = cdolist_list_var_$33.first();
      while ( NIL != cdolist_list_var_$33)
      {
        if( formula_position.equal( pph_data_structures.pph_phrase_output_item_arg_position( output_item ) ) )
        {
          choices_generation = ConsesLow.cons( ConsesLow.cons( choice, pph_data_structures.pph_phrase_output_item_string( output_item ) ), choices_generation );
        }
        else
        {
          current_output = ConsesLow.cons( pph_data_structures.pph_phrase_output_item_string( output_item ), current_output );
        }
        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
        output_item = cdolist_list_var_$33.first();
      }
      if( NIL != last_output && !last_output.equal( current_output ) )
      {
        failed_on = ConsesLow.cons( choice, failed_on );
      }
      last_output = current_output;
      last_output_list = output_list;
      cdolist_list_var = cdolist_list_var.rest();
      choice = cdolist_list_var.first();
    }
    SubLObject template_generation = NIL;
    if( NIL == failed_on )
    {
      SubLObject string_parts = NIL;
      final SubLObject dot_position = Numbers.subtract( Sequences.length( last_output_list ), ONE_INTEGER );
      SubLObject list_var = NIL;
      SubLObject output_item2 = NIL;
      SubLObject index = NIL;
      list_var = last_output_list;
      output_item2 = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), output_item2 = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        if( ZERO_INTEGER.numL( index ) && index.numL( dot_position ) )
        {
          string_parts = ConsesLow.cons( $str116$_, string_parts );
        }
        if( formula_position.equal( pph_data_structures.pph_phrase_output_item_arg_position( output_item2 ) ) )
        {
          string_parts = ConsesLow.cons( $str117$_____, string_parts );
        }
        else
        {
          string_parts = ConsesLow.cons( pph_data_structures.pph_phrase_output_item_string( output_item2 ), string_parts );
        }
      }
      template_generation = Functions.apply( Symbols.symbol_function( $sym118$CCONCATENATE ), Sequences.nreverse( string_parts ) );
    }
    else
    {
      final SubLObject _prev_bind_0 = pph_vars.$pph_blanks_for_varsP$.currentBinding( thread );
      try
      {
        pph_vars.$pph_blanks_for_varsP$.bind( T, thread );
        template_generation = pph_main.generate_text_wXsentential_force( pattern, $kw119$INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$pph_blanks_for_varsP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( template_generation, Sequences.nreverse( choices_generation ), Types.sublisp_null( failed_on ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 40808L)
  public static SubLObject determine_whether_multiple_entry_from_pattern(final SubLObject pattern)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 40983L)
  public static SubLObject generate_xml_for_choices_to_pick_from(final SubLObject choice_generations, SubLObject allow_multipleP)
  {
    if( allow_multipleP == UNPROVIDED )
    {
      allow_multipleP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject attributes = ConsesLow.list( $str120$entryType, ( NIL != allow_multipleP ) ? $str121$multiple : $str122$single );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str123$choices, attributes, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          SubLObject cdolist_list_var = choice_generations;
          SubLObject choice_generation = NIL;
          choice_generation = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = choice_generation;
            SubLObject choice = NIL;
            SubLObject rendering = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
            choice = current.first();
            current = ( rendering = current.rest() );
            SubLObject choice_attributes = NIL;
            thread.resetMultipleValues();
            final SubLObject id = get_external_identification_for_choice( choice );
            final SubLObject suid = thread.secondMultipleValue();
            final SubLObject foundP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL != foundP )
            {
              choice_attributes = ConsesLow.list( $str125$suid, suid );
            }
            else
            {
              choice_attributes = ConsesLow.list( $str126$id, id, $str125$suid, suid );
            }
            try
            {
              final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str127$choice, choice_attributes, NIL, NIL, $kw101$UNINITIALIZED );
                final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                  write_xml_compliant_html_string( rendering, xml_vars.$xml_stream$.getDynamicValue( thread ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$36, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$36, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$35, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str127$choice );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            choice_generation = cdolist_list_var.first();
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$34, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str123$choices );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return choice_generations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 41815L)
  public static SubLObject get_external_identification_for_choice(final SubLObject choice)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = external_identification_for_choice( choice );
    thread.resetMultipleValues();
    final SubLObject suid = get_webgame_tracked_external_identification( id );
    final SubLObject foundP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( id, suid, foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 42076L)
  public static SubLObject generate_xml_for_one_reading_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses)
  {
    if( responses == UNPROVIDED )
    {
      responses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str128$readingQuestion, NIL, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          try
          {
            final SubLObject _prev_bind_0_$40 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$prologue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$41 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$41, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$41, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$40, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$prologue );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$43 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str112$questions, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  generate_xml_for_one_question_to_ask_user( sentence, type, topic_infos, responses );
                  cdolist_list_var = cdolist_list_var.rest();
                  sentence = cdolist_list_var.first();
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$44, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$42, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$43, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str112$questions );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$43 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str113$epilogue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str130$Because_I_read_it_on_the_web_, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$47, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$43, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$46, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str113$epilogue );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$39, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str128$readingQuestion );
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 42599L)
  public static SubLObject generate_xml_for_one_abductive_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses)
  {
    if( responses == UNPROVIDED )
    {
      responses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str131$abductiveQuestion, NIL, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$52 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          try
          {
            final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$54 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$prologue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$54, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$54, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$53, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$prologue );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$55, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$55 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str112$questions, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  generate_xml_for_one_question_to_ask_user( sentence, type, topic_infos, responses );
                  cdolist_list_var = cdolist_list_var.rest();
                  sentence = cdolist_list_var.first();
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$57, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$55, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$56, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str112$questions );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$59 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$56 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str113$epilogue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str132$Because_I_am_guessing_, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$60, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$56, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$59, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str113$epilogue );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$61, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$52, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str131$abductiveQuestion );
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 43115L)
  public static SubLObject generate_xml_for_one_hypothesized_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses)
  {
    if( responses == UNPROVIDED )
    {
      responses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str133$hypothesizedQuestion, NIL, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          try
          {
            final SubLObject _prev_bind_0_$66 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$67 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$prologue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$67 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$67, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$67, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$66, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$prologue );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$69 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$68 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str112$questions, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$70 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  generate_xml_for_one_question_to_ask_user( sentence, type, topic_infos, responses );
                  cdolist_list_var = cdolist_list_var.rest();
                  sentence = cdolist_list_var.first();
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$70, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$68, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$69, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str112$questions );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$72 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$69 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str113$epilogue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$73 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str134$Because_I_think_it_might_be_true_, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$73, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$69, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$72, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str113$epilogue );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$74, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$65, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str133$hypothesizedQuestion );
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 43648L)
  public static SubLObject generate_xml_for_one_kb_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses)
  {
    if( responses == UNPROVIDED )
    {
      responses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str135$kbQuestion, NIL, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$78 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          try
          {
            final SubLObject _prev_bind_0_$79 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$80 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$prologue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$80 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str129$I_am_thinking_of_a_sentence_____, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$80, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$80, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$79, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$prologue );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$82 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$81 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str112$questions, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$83 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  generate_xml_for_one_question_to_ask_user( sentence, type, topic_infos, responses );
                  cdolist_list_var = cdolist_list_var.rest();
                  sentence = cdolist_list_var.first();
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$83, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$81, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$82, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str112$questions );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$85 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$82 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str113$epilogue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str136$Because_someone_told_me_so_, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$86, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$82, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$85, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str113$epilogue );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$87, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$78, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str135$kbQuestion );
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 44155L)
  public static SubLObject generate_xml_for_one_rule_question_to_ask_user(final SubLObject type, final SubLObject sentences, final SubLObject topic_infos, SubLObject responses)
  {
    if( responses == UNPROVIDED )
    {
      responses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule = sentences.first();
    final SubLObject examples = sentences.rest();
    final SubLObject rule_text = pph_main.generate_text_wXsentential_force( rule, $kw137$DECLARATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject attributes = ConsesLow.list( $str126$id, kb_utilities.hl_external_id_string( rule ) );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str138$ruleQuestion, attributes, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$91 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          try
          {
            final SubLObject _prev_bind_0_$92 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$prologue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$93 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str139$I_have_an_idea__if_I_am_right_it_, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$93, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$93, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$92, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$prologue );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str140$ruleText, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                write_xml_compliant_html_string( rule_text, xml_vars.$xml_stream$.getDynamicValue( thread ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$96, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$94, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$95, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str140$ruleText );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$98 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str112$questions, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$99 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                SubLObject cdolist_list_var = examples;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  generate_xml_for_one_question_to_ask_user( sentence, type, responses, UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  sentence = cdolist_list_var.first();
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$99, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$95, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$98, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str112$questions );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$100, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str113$epilogue, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                streams_high.write_string( $str141$Because_if_I_am_right_it_would_me, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                write_xml_compliant_html_string( rule_text, xml_vars.$xml_stream$.getDynamicValue( thread ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$102, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$96, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$101, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str113$epilogue );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$103, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$91, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values5 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str138$ruleQuestion );
        Values.restoreValuesFromVector( _values5 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 45121L)
  public static SubLObject generate_xml_for_one_question_to_ask_user(final SubLObject sentence, final SubLObject type, final SubLObject topic_infos, SubLObject responses)
  {
    if( responses == UNPROVIDED )
    {
      responses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject attributes = ( $const12$KnowledgeAcquisitionGoal_Verifyin.eql( type ) || $const26$KnowledgeAcquisitionGoal_Verifyin.eql( type ) || $const24$KnowledgeAcquisitionGoal_Verifyin.eql( type ) ) ? ConsesLow
        .list( $str126$id, kb_utilities.hl_external_id_string( sentence ) ) : NIL;
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str142$question, attributes, NIL, NIL, $kw101$UNINITIALIZED );
        final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
          if( NIL != topic_infos )
          {
            try
            {
              final SubLObject _prev_bind_0_$109 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$110 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str143$topics, NIL, NIL, NIL, $kw101$UNINITIALIZED );
                final SubLObject _prev_bind_0_$110 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                  SubLObject cdolist_list_var = topic_infos;
                  SubLObject topic_info = NIL;
                  topic_info = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    SubLObject current;
                    final SubLObject datum = current = topic_info;
                    SubLObject topic = NIL;
                    SubLObject title = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
                    topic = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
                    title = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      thread.resetMultipleValues();
                      final SubLObject id = get_external_identification_for_question_topic( topic );
                      final SubLObject suid = thread.secondMultipleValue();
                      final SubLObject foundP = thread.thirdMultipleValue();
                      thread.resetMultipleValues();
                      final SubLObject topic_attribute = ( NIL != foundP ) ? ConsesLow.list( $str125$suid, suid ) : ConsesLow.list( $str125$suid, suid, $str126$id, id );
                      try
                      {
                        final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$111 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str145$topic, topic_attribute, NIL, NIL, $kw101$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                            write_xml_compliant_html_string( title, xml_vars.$xml_stream$.getDynamicValue( thread ) );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$112, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$111, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$111, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str145$topic );
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$113, thread );
                        }
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    topic_info = cdolist_list_var.first();
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$110, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$110, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$109, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str143$topics );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
              }
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$115 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$112 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str146$text, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$116 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                write_xml_compliant_html_string( pph_main.generate_text_wXsentential_force( sentence, $kw137$DECLARATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), xml_vars.$xml_stream$
                    .getDynamicValue( thread ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$116, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$112, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$115, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str146$text );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$117, thread );
            }
          }
          try
          {
            final SubLObject _prev_bind_0_$118 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$113 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str147$responses, NIL, NIL, NIL, $kw101$UNINITIALIZED );
              final SubLObject _prev_bind_0_$119 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw101$UNINITIALIZED, thread );
                generate_xml_for_responses_to_question_set_to_ask( responses, xml_vars.$xml_stream$.getDynamicValue( thread ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$119, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$113, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$118, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str147$responses );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$120, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$108, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values5 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str142$question );
        Values.restoreValuesFromVector( _values5 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 46543L)
  public static SubLObject get_external_identification_for_question_topic(final SubLObject topic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = external_identification_for_question_topic( topic );
    thread.resetMultipleValues();
    final SubLObject suid = get_webgame_tracked_external_identification( id );
    final SubLObject foundP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( id, suid, foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 46818L)
  public static SubLObject generate_xml_for_responses_to_question_set_to_ask(final SubLObject responses, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    SubLObject list_var = NIL;
    SubLObject response = NIL;
    SubLObject response_num = NIL;
    list_var = responses;
    response = list_var.first();
    for( response_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), response = list_var.first(), response_num = Numbers.add( ONE_INTEGER, response_num ) )
    {
      if( !response_num.isZero() )
      {
        streams_high.write_string( $str148$_, stream, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject pcase_var = response;
      if( pcase_var.eql( $const29$TrueCycLSentence ) )
      {
        streams_high.write_string( $str149$T, stream, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $const30$FalseCycLSentence ) )
      {
        streams_high.write_string( $str150$F, stream, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $const151$SkippedCycLSentence ) )
      {
        streams_high.write_string( $str152$S, stream, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $const153$UnclearCycLSentence ) )
      {
        streams_high.write_string( $str154$N, stream, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        Errors.error( $str155$Dont_know_how_to_deal_with_respon, response );
      }
    }
    return responses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 47428L)
  public static SubLObject note_user_evaluations_of_sentences(final SubLObject user_alias, final SubLObject evaluations, SubLObject evaluation_mt)
  {
    if( evaluation_mt == UNPROVIDED )
    {
      evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
    }
    SubLObject successful_evaluations = ZERO_INTEGER;
    SubLObject cdolist_list_var = evaluations;
    SubLObject evaluation = NIL;
    evaluation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = evaluation;
      SubLObject hl_external = NIL;
      SubLObject predicate = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
      hl_external = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
      predicate = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject sentence = kb_utilities.find_object_by_hl_external_id_string( hl_external );
        if( NIL != note_user_evaluation_of_sentence( sentence, user_alias, predicate, evaluation_mt ) )
        {
          successful_evaluations = Numbers.add( successful_evaluations, ONE_INTEGER );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list157 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      evaluation = cdolist_list_var.first();
    }
    return successful_evaluations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 48285L)
  public static SubLObject note_user_evaluation_of_sentence(final SubLObject sentence, final SubLObject user_alias, final SubLObject evaluation, SubLObject evaluation_mt)
  {
    if( evaluation_mt == UNPROVIDED )
    {
      evaluation_mt = $web_game_default_evaluation_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == genls.genlP( evaluation, $const159$CycLPropositionalSentence, evaluation_mt, UNPROVIDED ) )
    {
      Errors.error( $str160$Term__A_does_not_denote_a_valid_e, evaluation );
    }
    thread.resetMultipleValues();
    final SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature( ConsesLow.list( $const161$evaluationOfAs, ConsesLow.list( $const162$EvaluationOfByOnFn, ConsesLow.list(
        $const163$MtWithFocalContentSentenceFn, ConsesLow.list( $const164$Quote, sentence ) ), ConsesLow.list( $const165$SomeFn, ConsesLow.listS( $const166$SubCollectionNamedFn, user_alias, $list167 ) ), Time
            .get_universal_time() ), ConsesLow.list( $const163$MtWithFocalContentSentenceFn, ConsesLow.list( $const164$Quote, sentence ) ), evaluation ), evaluation_mt, T );
    final SubLObject reason = thread.secondMultipleValue();
    final SubLObject repairs = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 49148L)
  public static SubLObject note_goal_category_for_sentence(final SubLObject sentence, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $web_game_default_domain_mt$.getDynamicValue();
    }
    return rkf_assertion_utilities.rkf_assert_with_implicature( ConsesLow.listS( $const169$goalCategoryForAgent, $const170$Cyc, ConsesLow.list( $const171$thereExists, $sym172$_TV, ConsesLow.list( $const173$knows,
        $const170$Cyc, ConsesLow.listS( $const174$sentenceTruth, sentence, $list175 ) ) ), $list176 ), domain_mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 49664L)
  public static SubLObject load_user_evaluated_sentences(final SubLObject filename, SubLObject recording_mt)
  {
    if( recording_mt == UNPROVIDED )
    {
      recording_mt = $web_game_recording_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw178$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str82$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      SubLObject doneP = NIL;
      final SubLObject limit = streams_high.file_length( s );
      final SubLObject message = Sequences.cconcatenate( $str179$Loading_webgame_results_from_, new SubLObject[] { format_nil.format_nil_a_no_copy( filename ), $str180$_____
      } );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message );
          while ( NIL == doneP)
          {
            final SubLObject contents = reader.read( s, NIL, $kw181$EOF, NIL );
            doneP = makeBoolean( $kw181$EOF == contents || $kw182$DONE == contents.first() );
            if( NIL == doneP )
            {
              SubLObject error = NIL;
              SubLObject successP = NIL;
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0_$125 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym183$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    SubLObject current;
                    final SubLObject datum = current = contents;
                    SubLObject belief = NIL;
                    SubLObject sentence_id = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
                    belief = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
                    sentence_id = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      final SubLObject sentence = kb_utilities.find_object_by_hl_external_id_string( sentence_id );
                      record_consensus_sentence_evaluation( belief, sentence, recording_mt, UNPROVIDED );
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list184 );
                    }
                    successP = T;
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$125, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              if( NIL == successP )
              {
                Errors.warn( $str185$Could_not_store_result__A____erro, contents, error );
              }
              utilities_macros.note_percent_progress( streams_high.file_position( s, UNPROVIDED ), limit );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$126 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$126, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 50813L)
  public static SubLObject load_and_submit_evaluated_sentences_from_file(final SubLObject filename, SubLObject recording_mt, SubLObject to)
  {
    if( recording_mt == UNPROVIDED )
    {
      recording_mt = $web_game_recording_mt$.getGlobalValue();
    }
    if( to == UNPROVIDED )
    {
      to = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 51439L)
  public static SubLObject record_consensus_sentence_evaluation(final SubLObject belief_token, final SubLObject sentence, SubLObject recording_mt, SubLObject record_nowP)
  {
    if( recording_mt == UNPROVIDED )
    {
      recording_mt = $web_game_recording_mt$.getGlobalValue();
    }
    if( record_nowP == UNPROVIDED )
    {
      record_nowP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence_belief = map_keyword_sentence_belief_to_fort_belief( belief_token );
    if( NIL != forts.fort_p( sentence_belief ) )
    {
      thread.resetMultipleValues();
      final SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature( ConsesLow.list( $const189$sentenceAssignedStatusViaInfoStor, sentence, sentence_belief, $web_game_agent_identification_token$
          .getGlobalValue() ), recording_mt, record_nowP );
      final SubLObject reason = thread.secondMultipleValue();
      final SubLObject repairs = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return successP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 52180L)
  public static SubLObject map_keyword_sentence_belief_to_fort_belief(final SubLObject keyword)
  {
    if( keyword.eql( $kw190$TRUE ) )
    {
      return $const29$TrueCycLSentence;
    }
    if( keyword.eql( $kw191$FALSE ) )
    {
      return $const30$FalseCycLSentence;
    }
    if( keyword.eql( $kw192$NONSENSE ) )
    {
      return $const193$RidiculousCycLSentence;
    }
    if( keyword.eql( $kw194$OBSCURE ) )
    {
      return $const195$UninterestingCycLSentence;
    }
    if( keyword.eql( $kw196$PROBABLY_TRUE ) )
    {
      return $const197$PlausibleCycLSentence;
    }
    if( keyword.eql( $kw198$PROBABLY_FALSE ) )
    {
      return $const199$ImplausibleCycLSentence;
    }
    if( keyword.eql( $kw200$PROBABLY_NONSENSE ) )
    {
      return $const151$SkippedCycLSentence;
    }
    return $kw201$PROBLEM;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/web-game.lisp", position = 52787L)
  public static SubLObject get_web_game_large_example_question_set(SubLObject orderedP)
  {
    if( orderedP == UNPROVIDED )
    {
      orderedP = T;
    }
    return ( NIL != orderedP ) ? $web_game_large_example_question_set$.getGlobalValue() : list_utilities.randomize_list( $web_game_large_example_question_set$.getGlobalValue() );
  }

  public static SubLObject declare_web_game_file()
  {
    SubLFiles.declareFunction( me, "get_questions_to_ask_user", "GET-QUESTIONS-TO-ASK-USER", 1, 3, false );
    SubLFiles.declareFunction( me, "get_alternate_bindings_for_questions_to_ask_user", "GET-ALTERNATE-BINDINGS-FOR-QUESTIONS-TO-ASK-USER", 4, 0, false );
    SubLFiles.declareFunction( me, "package_sentence_for_question_to_be_asked_of_user", "PACKAGE-SENTENCE-FOR-QUESTION-TO-BE-ASKED-OF-USER", 3, 0, false );
    SubLFiles.declareFunction( me, "get_bindings_dictionary_for_questions_to_ask_user", "GET-BINDINGS-DICTIONARY-FOR-QUESTIONS-TO-ASK-USER", 3, 1, false );
    SubLFiles.declareFunction( me, "get_query_properties_for_questions_to_ask_user", "GET-QUERY-PROPERTIES-FOR-QUESTIONS-TO-ASK-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_alternate_query_properties_for_questions_to_ask_user", "GET-ALTERNATE-QUERY-PROPERTIES-FOR-QUESTIONS-TO-ASK-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_query_properties_with_max_number_override", "GET-QUERY-PROPERTIES-WITH-MAX-NUMBER-OVERRIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_alternate_query_for_questions_to_ask_user", "GET-ALTERNATE-QUERY-FOR-QUESTIONS-TO-ASK-USER", 3, 0, false );
    SubLFiles.declareFunction( me, "get_query_for_questions_to_ask_user", "GET-QUERY-FOR-QUESTIONS-TO-ASK-USER", 3, 0, false );
    SubLFiles.declareFunction( me, "extract_question_to_ask_from_alt_binding_set", "EXTRACT-QUESTION-TO-ASK-FROM-ALT-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_question_to_ask_from_binding_set", "EXTRACT-QUESTION-TO-ASK-FROM-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_evaluation_information_from_binding_set", "EXTRACT-EVALUATION-INFORMATION-FROM-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_evaluation_information_set_from_binding_set", "EXTRACT-EVALUATION-INFORMATION-SET-FROM-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_goal_type_from_binding_set", "EXTRACT-GOAL-TYPE-FROM-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_goal_type_from_alt_binding_set", "EXTRACT-GOAL-TYPE-FROM-ALT-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "question_still_needs_to_be_asked_of_userP", "QUESTION-STILL-NEEDS-TO-BE-ASKED-OF-USER?", 2, 0, false );
    SubLFiles.declareFunction( me, "belief_value_has_reached_certaintyP", "BELIEF-VALUE-HAS-REACHED-CERTAINTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_iterator_for_questions_to_ask", "GET-ITERATOR-FOR-QUESTIONS-TO-ASK", 0, 3, false );
    SubLFiles.declareFunction( me, "get_questions_query_sentence_with_topics_filtering", "GET-QUESTIONS-QUERY-SENTENCE-WITH-TOPICS-FILTERING", 2, 0, false );
    SubLFiles.declareFunction( me, "make_questions_to_ask_iterator_state", "MAKE-QUESTIONS-TO-ASK-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "questions_to_ask_iterator_next", "QUESTIONS-TO-ASK-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "questions_to_ask_iterator_done", "QUESTIONS-TO-ASK-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "questions_to_ask_iterator_finalize", "QUESTIONS-TO-ASK-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_topical_iterator_for_questions_to_ask", "GET-TOPICAL-ITERATOR-FOR-QUESTIONS-TO-ASK", 1, 2, false );
    SubLFiles.declareFunction( me, "make_topical_questions_to_ask_iterator_state", "MAKE-TOPICAL-QUESTIONS-TO-ASK-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "topical_questions_to_ask_iterator_done", "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "topical_questions_to_ask_iterator_next", "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "topics_fail_topics_filterP", "TOPICS-FAIL-TOPICS-FILTER?", 2, 0, false );
    SubLFiles.declareFunction( me, "topic_fails_topics_filterP", "TOPIC-FAILS-TOPICS-FILTER?", 2, 0, false );
    SubLFiles.declareFunction( me, "topic_matches_topics_filterP", "TOPIC-MATCHES-TOPICS-FILTER?", 2, 0, false );
    SubLFiles.declareFunction( me, "topic_list_fails_fopics_filterP", "TOPIC-LIST-FAILS-FOPICS-FILTER?", 2, 0, false );
    SubLFiles.declareFunction( me, "topic_list_matches_topics_filterP", "TOPIC-LIST-MATCHES-TOPICS-FILTER?", 2, 0, false );
    SubLFiles.declareFunction( me, "topic_set_matches_topics_filter_expression", "TOPIC-SET-MATCHES-TOPICS-FILTER-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "topic_matches_topics_filter_expression", "TOPIC-MATCHES-TOPICS-FILTER-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "topical_questions_to_ask_iterator_finalize", "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_question_topics_from_question", "EXTRACT-QUESTION-TOPICS-FROM-QUESTION", 2, 0, false );
    SubLFiles.declareFunction( me, "extract_topical_predicate_from_question", "EXTRACT-TOPICAL-PREDICATE-FROM-QUESTION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_question_topics_information_for_predicate", "CLEAR-QUESTION-TOPICS-INFORMATION-FOR-PREDICATE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_question_topics_information_for_predicate", "REMOVE-QUESTION-TOPICS-INFORMATION-FOR-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "question_topics_information_for_predicate_internal", "QUESTION-TOPICS-INFORMATION-FOR-PREDICATE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "question_topics_information_for_predicate", "QUESTION-TOPICS-INFORMATION-FOR-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_title_for_question_topic", "CLEAR-TITLE-FOR-QUESTION-TOPIC", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_title_for_question_topic", "REMOVE-TITLE-FOR-QUESTION-TOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "title_for_question_topic_internal", "TITLE-FOR-QUESTION-TOPIC-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "title_for_question_topic", "TITLE-FOR-QUESTION-TOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_external_identification_for_question_topic", "CLEAR-EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_external_identification_for_question_topic", "REMOVE-EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "external_identification_for_question_topic_internal", "EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "external_identification_for_question_topic", "EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_external_identification_for_choice", "CLEAR-EXTERNAL-IDENTIFICATION-FOR-CHOICE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_external_identification_for_choice", "REMOVE-EXTERNAL-IDENTIFICATION-FOR-CHOICE", 1, 0, false );
    SubLFiles.declareFunction( me, "external_identification_for_choice_internal", "EXTERNAL-IDENTIFICATION-FOR-CHOICE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "external_identification_for_choice", "EXTERNAL-IDENTIFICATION-FOR-CHOICE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_xml_file_of_questions_to_ask", "GENERATE-XML-FILE-OF-QUESTIONS-TO-ASK", 1, 2, false );
    SubLFiles.declareFunction( me, "generate_xml_file_of_topical_questions_to_ask", "GENERATE-XML-FILE-OF-TOPICAL-QUESTIONS-TO-ASK", 2, 2, false );
    SubLFiles.declareFunction( me, "compute_topical_questions_to_ask", "COMPUTE-TOPICAL-QUESTIONS-TO-ASK", 0, 3, false );
    SubLFiles.declareFunction( me, "get_topic_questions_count", "GET-TOPIC-QUESTIONS-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_striped_xml_for_question_to_ask_user", "GENERATE-STRIPED-XML-FOR-QUESTION-TO-ASK-USER", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_striped_question_list_iterator_to_ask_user", "GENERATE-STRIPED-QUESTION-LIST-ITERATOR-TO-ASK-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_predicate_estimates_for_questions", "COMPUTE-PREDICATE-ESTIMATES-FOR-QUESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_questions_to_ask_user_in_xml", "GET-QUESTIONS-TO-ASK-USER-IN-XML", 1, 3, false );
    SubLFiles.declareFunction( me, "generate_xml_for_questions_to_ask_user", "GENERATE-XML-FOR-QUESTIONS-TO-ASK-USER", 1, 0, false );
    SubLFiles.declareMacro( me, "with_web_game_external_identification_tracking", "WITH-WEB-GAME-EXTERNAL-IDENTIFICATION-TRACKING" );
    SubLFiles.declareFunction( me, "track_webgame_external_identificationsP", "TRACK-WEBGAME-EXTERNAL-IDENTIFICATIONS?", 0, 0, false );
    SubLFiles.declareFunction( me, "get_webgame_tracked_external_identification", "GET-WEBGAME-TRACKED-EXTERNAL-IDENTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "write_xml_compliant_html_string", "WRITE-XML-COMPLIANT-HTML-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_xml_for_question_sets_to_ask_user", "GENERATE-XML-FOR-QUESTION-SETS-TO-ASK-USER", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_xml_for_question_set_to_ask_user", "GENERATE-XML-FOR-QUESTION-SET-TO-ASK-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_xml_for_one_choice_question_to_ask_user", "GENERATE-XML-FOR-ONE-CHOICE-QUESTION-TO-ASK-USER", 4, 1, false );
    SubLFiles.declareFunction( me, "compute_question_template_from_example_sentences", "COMPUTE-QUESTION-TEMPLATE-FROM-EXAMPLE-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_whether_multiple_entry_from_pattern", "DETERMINE-WHETHER-MULTIPLE-ENTRY-FROM-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_xml_for_choices_to_pick_from", "GENERATE-XML-FOR-CHOICES-TO-PICK-FROM", 1, 1, false );
    SubLFiles.declareFunction( me, "get_external_identification_for_choice", "GET-EXTERNAL-IDENTIFICATION-FOR-CHOICE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_xml_for_one_reading_question_to_ask_user", "GENERATE-XML-FOR-ONE-READING-QUESTION-TO-ASK-USER", 3, 1, false );
    SubLFiles.declareFunction( me, "generate_xml_for_one_abductive_question_to_ask_user", "GENERATE-XML-FOR-ONE-ABDUCTIVE-QUESTION-TO-ASK-USER", 3, 1, false );
    SubLFiles.declareFunction( me, "generate_xml_for_one_hypothesized_question_to_ask_user", "GENERATE-XML-FOR-ONE-HYPOTHESIZED-QUESTION-TO-ASK-USER", 3, 1, false );
    SubLFiles.declareFunction( me, "generate_xml_for_one_kb_question_to_ask_user", "GENERATE-XML-FOR-ONE-KB-QUESTION-TO-ASK-USER", 3, 1, false );
    SubLFiles.declareFunction( me, "generate_xml_for_one_rule_question_to_ask_user", "GENERATE-XML-FOR-ONE-RULE-QUESTION-TO-ASK-USER", 3, 1, false );
    SubLFiles.declareFunction( me, "generate_xml_for_one_question_to_ask_user", "GENERATE-XML-FOR-ONE-QUESTION-TO-ASK-USER", 3, 1, false );
    SubLFiles.declareFunction( me, "get_external_identification_for_question_topic", "GET-EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_xml_for_responses_to_question_set_to_ask", "GENERATE-XML-FOR-RESPONSES-TO-QUESTION-SET-TO-ASK", 1, 1, false );
    SubLFiles.declareFunction( me, "note_user_evaluations_of_sentences", "NOTE-USER-EVALUATIONS-OF-SENTENCES", 2, 1, false );
    SubLFiles.declareFunction( me, "note_user_evaluation_of_sentence", "NOTE-USER-EVALUATION-OF-SENTENCE", 3, 1, false );
    SubLFiles.declareFunction( me, "note_goal_category_for_sentence", "NOTE-GOAL-CATEGORY-FOR-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "load_user_evaluated_sentences", "LOAD-USER-EVALUATED-SENTENCES", 1, 1, false );
    SubLFiles.declareFunction( me, "load_and_submit_evaluated_sentences_from_file", "LOAD-AND-SUBMIT-EVALUATED-SENTENCES-FROM-FILE", 1, 2, false );
    SubLFiles.declareFunction( me, "record_consensus_sentence_evaluation", "RECORD-CONSENSUS-SENTENCE-EVALUATION", 2, 2, false );
    SubLFiles.declareFunction( me, "map_keyword_sentence_belief_to_fort_belief", "MAP-KEYWORD-SENTENCE-BELIEF-TO-FORT-BELIEF", 1, 0, false );
    SubLFiles.declareFunction( me, "get_web_game_large_example_question_set", "GET-WEB-GAME-LARGE-EXAMPLE-QUESTION-SET", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_web_game_file()
  {
    $web_game_default_domain_mt$ = SubLFiles.defparameter( "*WEB-GAME-DEFAULT-DOMAIN-MT*", $const0$MachineLearningSpindleCollectorMt );
    $web_game_default_evaluation_mt$ = SubLFiles.defparameter( "*WEB-GAME-DEFAULT-EVALUATION-MT*", $const1$SuggestedSentencesMt );
    $web_game_questions_query$ = SubLFiles.defparameter( "*WEB-GAME-QUESTIONS-QUERY*", $const2$WebGame_QuiescenceData_WithGoalTy );
    $web_game_alternate_questions_query$ = SubLFiles.defparameter( "*WEB-GAME-ALTERNATE-QUESTIONS-QUERY*", $const3$WebGame_UnevaluatedSentences_With );
    $web_game_default_max_number$ = SubLFiles.defparameter( "*WEB-GAME-DEFAULT-MAX-NUMBER*", $int4$50 );
    $question_to_ask_variable$ = SubLFiles.deflexical( "*QUESTION-TO-ASK-VARIABLE*", $sym17$_SENTENCE );
    $question_to_ask_user_template_name$ = SubLFiles.deflexical( "*QUESTION-TO-ASK-USER-TEMPLATE-NAME*", $str18$Boris );
    $evaluation_predicate_variable$ = SubLFiles.deflexical( "*EVALUATION-PREDICATE-VARIABLE*", $sym19$_OUTPUT );
    $evaluation_timestamp_variable$ = SubLFiles.deflexical( "*EVALUATION-TIMESTAMP-VARIABLE*", $sym20$_TIME );
    $evaluation_information_set_variable$ = SubLFiles.deflexical( "*EVALUATION-INFORMATION-SET-VARIABLE*", $sym21$_EVAL_SET );
    $evaluation_goaltype_variable$ = SubLFiles.deflexical( "*EVALUATION-GOALTYPE-VARIABLE*", $sym23$_GOAL_TYPE );
    $maximum_belief_for_question$ = SubLFiles.defparameter( "*MAXIMUM-BELIEF-FOR-QUESTION*", TEN_INTEGER );
    $maximum_votes_for_question$ = SubLFiles.defparameter( "*MAXIMUM-VOTES-FOR-QUESTION*", TEN_INTEGER );
    $web_game_choice_questions_query$ = SubLFiles.deflexical( "*WEB-GAME-CHOICE-QUESTIONS-QUERY*", $const39$WebGame_MultipleChoiceSentences_W );
    $web_game_master_query_set$ = SubLFiles.deflexical( "*WEB-GAME-MASTER-QUERY-SET*", ConsesLow.list( $web_game_alternate_questions_query$.getDynamicValue(), $web_game_choice_questions_query$.getGlobalValue() ) );
    $question_topics_information_for_predicate_caching_state$ = SubLFiles.deflexical( "*QUESTION-TOPICS-INFORMATION-FOR-PREDICATE-CACHING-STATE*", NIL );
    $title_for_question_topic_caching_state$ = SubLFiles.deflexical( "*TITLE-FOR-QUESTION-TOPIC-CACHING-STATE*", NIL );
    $external_identification_for_question_topic_caching_state$ = SubLFiles.deflexical( "*EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC-CACHING-STATE*", NIL );
    $external_identification_for_choice_caching_state$ = SubLFiles.deflexical( "*EXTERNAL-IDENTIFICATION-FOR-CHOICE-CACHING-STATE*", NIL );
    $web_game_terms_identification_tracking$ = SubLFiles.defparameter( "*WEB-GAME-TERMS-IDENTIFICATION-TRACKING*", NIL );
    $web_game_choice_placeholder_in_sentence$ = SubLFiles.deflexical( "*WEB-GAME-CHOICE-PLACEHOLDER-IN-SENTENCE*", $sym107$_VALUE );
    $web_game_recording_mt$ = SubLFiles.deflexical( "*WEB-GAME-RECORDING-MT*", $const64$FactFactoryVerificationSentencesM );
    $web_game_agent_identification_token$ = SubLFiles.deflexical( "*WEB-GAME-AGENT-IDENTIFICATION-TOKEN*", $const187$FACTory_WebGame );
    $web_game_large_example_question_set$ = SubLFiles.deflexical( "*WEB-GAME-LARGE-EXAMPLE-QUESTION-SET*", $list202 );
    return NIL;
  }

  public static SubLObject setup_web_game_file()
  {
    access_macros.register_external_symbol( $sym5$GET_QUESTIONS_TO_ASK_USER );
    generic_testing.define_test_case_table_int( $sym31$QUESTION_STILL_NEEDS_TO_BE_ASKED_OF_USER_, ConsesLow.list( new SubLObject[] { $kw32$TEST, NIL, $kw33$OWNER, NIL, $kw34$CLASSES, NIL, $kw35$KB, $kw36$FULL,
      $kw37$WORKING_, T
    } ), $list38 );
    access_macros.register_external_symbol( $sym40$GET_ITERATOR_FOR_QUESTIONS_TO_ASK );
    access_macros.register_external_symbol( $sym46$GET_TOPICAL_ITERATOR_FOR_QUESTIONS_TO_ASK );
    generic_testing.define_test_case_table_int( $sym57$TOPIC_MATCHES_TOPICS_FILTER_, ConsesLow.list( new SubLObject[] { $kw32$TEST, NIL, $kw33$OWNER, NIL, $kw34$CLASSES, NIL, $kw35$KB, $kw36$FULL, $kw37$WORKING_, T
    } ), $list58 );
    generic_testing.define_test_case_table_int( $sym59$TOPIC_LIST_MATCHES_TOPICS_FILTER_, ConsesLow.list( new SubLObject[] { $kw32$TEST, NIL, $kw33$OWNER, NIL, $kw34$CLASSES, NIL, $kw35$KB, $kw36$FULL, $kw37$WORKING_, T
    } ), $list60 );
    memoization_state.note_globally_cached_function( $sym61$QUESTION_TOPICS_INFORMATION_FOR_PREDICATE );
    memoization_state.note_globally_cached_function( $sym69$TITLE_FOR_QUESTION_TOPIC );
    memoization_state.note_globally_cached_function( $sym76$EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC );
    memoization_state.note_globally_cached_function( $sym78$EXTERNAL_IDENTIFICATION_FOR_CHOICE );
    access_macros.register_external_symbol( $sym80$GENERATE_XML_FILE_OF_QUESTIONS_TO_ASK );
    access_macros.register_external_symbol( $sym83$GENERATE_XML_FILE_OF_TOPICAL_QUESTIONS_TO_ASK );
    access_macros.register_external_symbol( $sym84$COMPUTE_TOPICAL_QUESTIONS_TO_ASK );
    access_macros.register_external_symbol( $sym86$GET_TOPIC_QUESTIONS_COUNT );
    access_macros.register_external_symbol( $sym89$GENERATE_STRIPED_XML_FOR_QUESTION_TO_ASK_USER );
    access_macros.register_external_symbol( $sym93$GENERATE_STRIPED_QUESTION_LIST_ITERATOR_TO_ASK_USER );
    access_macros.register_external_symbol( $sym95$GET_QUESTIONS_TO_ASK_USER_IN_XML );
    access_macros.register_external_symbol( $sym156$NOTE_USER_EVALUATIONS_OF_SENTENCES );
    access_macros.register_external_symbol( $sym158$NOTE_USER_EVALUATION_OF_SENTENCE );
    access_macros.register_external_symbol( $sym168$NOTE_GOAL_CATEGORY_FOR_SENTENCE );
    access_macros.register_external_symbol( $sym177$LOAD_USER_EVALUATED_SENTENCES );
    access_macros.register_external_symbol( $sym186$LOAD_AND_SUBMIT_EVALUATED_SENTENCES_FROM_FILE );
    access_macros.register_external_symbol( $sym188$RECORD_CONSENSUS_SENTENCE_EVALUATION );
    return NIL;
  }

  private static SubLObject _constant_202_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "symptomOfAilment" ) ), constant_handles.reader_make_constant_shell( makeString( "Pain-PhysiologicalCondition" ) ), constant_handles
            .reader_make_constant_shell( makeString( "OralHerpes" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell(
                makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingInduction" ) ), ConsesLow.list( ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "father" ) ), makeSymbol( "?A" ), makeSymbol( "?B" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "spouse" ) ), makeSymbol(
                            "?B" ), makeSymbol( "?C" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mother" ) ), makeSymbol( "?A" ), makeSymbol( "?C" ) ) ), ConsesLow.list(
                                constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "father" ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWBush" ) ), constant_handles.reader_make_constant_shell(
                                        makeString( "GeorgeHWBush" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "spouse" ) ), constant_handles.reader_make_constant_shell( makeString(
                                            "GeorgeHWBush" ) ), constant_handles.reader_make_constant_shell( makeString( "BarbaraBush" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "mother" ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWBush" ) ), constant_handles.reader_make_constant_shell( makeString( "BarbaraBush" ) ) ) ),
                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "father" ) ), constant_handles.reader_make_constant_shell( makeString( "ChelseaClinton" ) ), constant_handles.reader_make_constant_shell(
                            makeString( "BillClinton" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "spouse" ) ), constant_handles.reader_make_constant_shell( makeString(
                                "BillClinton" ) ), constant_handles.reader_make_constant_shell( makeString( "HillaryClinton" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mother" ) ),
                                    constant_handles.reader_make_constant_shell( makeString( "ChelseaClinton" ) ), constant_handles.reader_make_constant_shell( makeString( "HillaryClinton" ) ) ) ) ), ConsesLow.list(
                                        constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow
                                            .list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation" ) ), ConsesLow.list( ConsesLow.list(
                                                constant_handles.reader_make_constant_shell( makeString( "agentTypeUsesArtifactType" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalGeneticist" ) ),
                                                constant_handles.reader_make_constant_shell( makeString( "PageOfPaper-IBO" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                    "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "symptomOfAilment" ) ), constant_handles.reader_make_constant_shell(
                                                            makeString( "Fever" ) ), constant_handles.reader_make_constant_shell( makeString( "Measles" ) ) ) ), ConsesLow.list( constant_handles
                                                                .reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ),
                                                                constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                    "FalseCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                        "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                            makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "Diphtheria" ) ), constant_handles
                                                                                .reader_make_constant_shell( makeString( "Larynx" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                    "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles
                                                                                        .reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                            "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                    .reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell(
                                                                                                        makeString( "Rubella" ) ), constant_handles.reader_make_constant_shell( makeString( "Eye" ) ) ) ), ConsesLow.list(
                                                                                                            constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles
                                                                                                                .reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                                    ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                        "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                            "ChlamydiaTrachomatisInfection" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                "Urethra" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                    "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                        makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow
                                                                                                                                            .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                "symptomOfAilment" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                    makeString( "Cough-AilmentCondition" ) ), constant_handles
                                                                                                                                                        .reader_make_constant_shell( makeString( "Psittacosis" ) ) ) ),
                                                                                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                            "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                makeString( "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                    .reader_make_constant_shell( makeString(
                                                                                                                                                        "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                                                                    ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                        .reader_make_constant_shell( makeString(
                                                                                                                                                            "pathogenCausesConditionType" ) ), constant_handles
                                                                                                                                                                .reader_make_constant_shell( makeString( "Arbovirus" ) ),
                                                                                                                                                        constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                            "YellowFever" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                                .reader_make_constant_shell( makeString(
                                                                                                                                                                    "TrueCycLSentence" ) ) ) ), ConsesLow.list(
                                                                                                                                                                        constant_handles.reader_make_constant_shell(
                                                                                                                                                                            makeString(
                                                                                                                                                                                "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                                                                                        ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                                            .reader_make_constant_shell( makeString(
                                                                                                                                                                                "pathogenCausesConditionType" ) ),
                                                                                                                                                                            constant_handles.reader_make_constant_shell(
                                                                                                                                                                                makeString( "Bacterium" ) ),
                                                                                                                                                                            constant_handles.reader_make_constant_shell(
                                                                                                                                                                                makeString( "StomachFlu" ) ) ) ), ConsesLow
                                                                                                                                                                                    .list( constant_handles
                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                            makeString(
                                                                                                                                                                                                "TrueCycLSentence" ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Staphylococcus" ) ), constant_handles.reader_make_constant_shell( makeString( "Fever" ) ) ) ), ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "ViralPneumonia" ) ), constant_handles.reader_make_constant_shell( makeString( "WholeBody" ) ) ) ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                  "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Herpes-Virus" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "Influenza" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                              makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "Constipation" ) ), constant_handles.reader_make_constant_shell(
                                                  makeString( "LargeIntestine" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles
                                                      .reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                          "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Streptococcus" ) ), constant_handles.reader_make_constant_shell(
                                                                  makeString( "Tonsillitis" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list(
                                                                      constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list(
                                                                          constant_handles.reader_make_constant_shell( makeString( "indicatedDrug" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                              "ChestCold" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LeafFn" ) ), constant_handles
                                                                                  .reader_make_constant_shell( makeString( "TeaPlant" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                      "FalseCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                          "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell(
                                                                                                  makeString( "Swelling-Condition" ) ), constant_handles.reader_make_constant_shell( makeString( "Throat" ) ) ) ), ConsesLow
                                                                                                      .list( constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list(
                                                                                                          constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "Malaria" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                          makeString( "Kidney" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                              makeString( "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                      "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow
                                                                                                                                          .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                              "symptomOfAilment" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                  makeString( "FatigueCondition" ) ), constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                          "HepatitisC-Infection" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                  "TrueCycLSentence" ) ) ) ), ConsesLow.list(
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString(
                                                                                                                                                                              "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                                                                                      ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "symptomOfAilment" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "Fever" ) ), constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "BacterialPneumonia" ) ) ) ),
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "TrueCycLSentence" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "TrueCycLSentence" ) ) ) ), ConsesLow
                                                                                                                                                                                          .list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                                                                                                              ConsesLow.list( ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "pathogenCausesConditionType" ) ),
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "PseudomonasPseudomallei" ) ),
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "Infection" ) ) ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "TrueCycLSentence" ) ),
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "TrueCycLSentence" ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "Infection" ) ), constant_handles.reader_make_constant_shell( makeString( "PlantEpidermis" ) ) ) ), ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list(
                  constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Bacterium" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "AilmentCondition" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                              makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "indicatedDrug" ) ),
                                  constant_handles.reader_make_constant_shell( makeString( "HepatitisC-Infection" ) ), constant_handles.reader_make_constant_shell( makeString( "DrugProduct" ) ) ) ), ConsesLow.list(
                                      constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "symptomOfAilment" ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "Jaundice" ) ), constant_handles.reader_make_constant_shell( makeString( "HepatitisA-Infection" ) ) ) ), ConsesLow
                                                  .list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                      "FalseCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                          ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pathogenCausesConditionType" ) ), constant_handles
                                                              .reader_make_constant_shell( makeString( "Bacterium" ) ), constant_handles.reader_make_constant_shell( makeString( "Syphilis" ) ) ) ), ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                      makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                          makeString( "indicatedDrug" ) ), constant_handles.reader_make_constant_shell( makeString( "ChlamydiaTrachomatisInfection" ) ), constant_handles
                                                                              .reader_make_constant_shell( makeString( "DrugSubstance" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                  "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list(
                                                                                      constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list(
                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pathogenCausesConditionType" ) ), constant_handles
                                                                                              .reader_make_constant_shell( makeString( "Protozoan" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "Malaria" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ),
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow
                                                                                                              .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "symptomOfAilment" ) ),
                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "Fever" ) ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "TyphusFeverGroup" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list(
                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow
                                                                                                                                      .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "Leprosy" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                  makeString( "Nerve" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "FalseCycLSentence" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                  "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                                                                              ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                      "conditionAffectsPartType" ) ), constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "Infection" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "Heart" ) ) ) ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "UnclearCycLSentence" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "UnclearCycLSentence" ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Virus" ) ), constant_handles.reader_make_constant_shell( makeString( "DengueFever" ) ) ) ), ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "indicatedDrug" ) ), constant_handles.reader_make_constant_shell( makeString( "LassaFever" ) ), constant_handles.reader_make_constant_shell( makeString( "DrugSubstance" ) ) ) ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                  "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ),
                                      constant_handles.reader_make_constant_shell( makeString( "HepatitisC-Infection" ) ), constant_handles.reader_make_constant_shell( makeString( "WholeBody" ) ) ) ), ConsesLow.list(
                                          constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ),
                                          constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow
                                              .list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "Glanders-Infection" ) ),
                                                  constant_handles.reader_make_constant_shell( makeString( "Joint-AnimalBodyPart" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                      "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell(
                                                          makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                                              .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                  .reader_make_constant_shell( makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "EscherichiaColi" ) ), constant_handles.reader_make_constant_shell( makeString( "Infection" ) ) ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                  makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Virus" ) ), constant_handles
                                                                                      .reader_make_constant_shell( makeString( "WesternEquineEncephalitis" ) ) ) ), ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                              "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell(
                                                                                                          makeString( "Tuberculosis" ) ), constant_handles.reader_make_constant_shell( makeString( "Meninges" ) ) ) ),
                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ) ) ), ConsesLow.list(
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Virus" ) ),
                                                                                                          constant_handles.reader_make_constant_shell( makeString( "SevereAcuteRespiratorySyndrome" ) ) ) ), ConsesLow.list(
                                                                                                              constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ),
                                                                                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "Virus" ) ), constant_handles.reader_make_constant_shell( makeString( "CommonCold" ) ) ) ),
                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Bacterium" ) ), constant_handles.reader_make_constant_shell( makeString( "CholeraInfection" ) ) ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "Acne" ) ), constant_handles.reader_make_constant_shell( makeString( "Gland" ) ) ) ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ) ) ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                              makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Mosquito" ) ), constant_handles.reader_make_constant_shell( makeString(
                                  "Fever" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "FalseCycLSentence" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation" ) ), ConsesLow.list(
                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "properPhysicalPartTypes" ) ), constant_handles.reader_make_constant_shell( makeString(
                                              "TruckTractor" ) ), constant_handles.reader_make_constant_shell( makeString( "Radiator-VehiclePart" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                  makeString( "KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                      "properPhysicalPartTypes" ) ), constant_handles.reader_make_constant_shell( makeString( "TruckTractor" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                          "VehicleBrakeSystem" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                  "agentTypeUsesArtifactType" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalGeneticist" ) ), constant_handles
                                                                      .reader_make_constant_shell( makeString( "MeasuringDevice" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                              makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Virus" ) ), constant_handles
                                                                                  .reader_make_constant_shell( makeString( "DengueHemorrhagicFever" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                      makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell(
                                                                                              makeString( "Virus" ) ), constant_handles.reader_make_constant_shell( makeString( "CytomegaloVirusInfection" ) ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "pathogenCausesConditionType" ) ), constant_handles.reader_make_constant_shell( makeString( "Bacterium" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "InfectionDueToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Anthrax-Bacterium" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "conditionAffectsPartType" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "AthletesFoot" ) ), constant_handles.reader_make_constant_shell( makeString( "Foot-AnimalBodyPart" ) ) ) ) ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "AthletesFoot" ) ), constant_handles.reader_make_constant_shell( makeString( "SoleOfFoot" ) ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "Swelling-Condition" ) ), constant_handles.reader_make_constant_shell( makeString( "Abdomen" ) ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "conditionAffectsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "Shingles-Ailment" ) ), constant_handles.reader_make_constant_shell( makeString( "Nerve" ) ) ) ) ), ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "symptomOfAilment" ) ), constant_handles.reader_make_constant_shell( makeString( "ViralPneumonia" ) ), constant_handles.reader_make_constant_shell( makeString( "Infection" ) ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_web_game_file();
  }

  @Override
  public void initializeVariables()
  {
    init_web_game_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_web_game_file();
  }
  static
  {
    me = new web_game();
    $web_game_default_domain_mt$ = null;
    $web_game_default_evaluation_mt$ = null;
    $web_game_questions_query$ = null;
    $web_game_alternate_questions_query$ = null;
    $web_game_default_max_number$ = null;
    $question_to_ask_variable$ = null;
    $question_to_ask_user_template_name$ = null;
    $evaluation_predicate_variable$ = null;
    $evaluation_timestamp_variable$ = null;
    $evaluation_information_set_variable$ = null;
    $evaluation_goaltype_variable$ = null;
    $maximum_belief_for_question$ = null;
    $maximum_votes_for_question$ = null;
    $web_game_choice_questions_query$ = null;
    $web_game_master_query_set$ = null;
    $question_topics_information_for_predicate_caching_state$ = null;
    $title_for_question_topic_caching_state$ = null;
    $external_identification_for_question_topic_caching_state$ = null;
    $external_identification_for_choice_caching_state$ = null;
    $web_game_terms_identification_tracking$ = null;
    $web_game_choice_placeholder_in_sentence$ = null;
    $web_game_recording_mt$ = null;
    $web_game_agent_identification_token$ = null;
    $web_game_large_example_question_set$ = null;
    $const0$MachineLearningSpindleCollectorMt = constant_handles.reader_make_constant_shell( makeString( "MachineLearningSpindleCollectorMt" ) );
    $const1$SuggestedSentencesMt = constant_handles.reader_make_constant_shell( makeString( "SuggestedSentencesMt" ) );
    $const2$WebGame_QuiescenceData_WithGoalTy = constant_handles.reader_make_constant_shell( makeString( "WebGame-QuiescenceData-WithGoalType-Sets-NoInOrAbduction" ) );
    $const3$WebGame_UnevaluatedSentences_With = constant_handles.reader_make_constant_shell( makeString( "WebGame-UnevaluatedSentences-WithGoalType-NoAbOrInduction-NEW" ) );
    $int4$50 = makeInteger( 50 );
    $sym5$GET_QUESTIONS_TO_ASK_USER = makeSymbol( "GET-QUESTIONS-TO-ASK-USER" );
    $sym6$ASCII_STRING_P = makeSymbol( "ASCII-STRING-P" );
    $sym7$POSSIBLY_HLMT_P = makeSymbol( "POSSIBLY-HLMT-P" );
    $sym8$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym9$_ = makeSymbol( "<" );
    $sym10$FIRST = makeSymbol( "FIRST" );
    $sym11$SECOND = makeSymbol( "SECOND" );
    $const12$KnowledgeAcquisitionGoal_Verifyin = constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) );
    $const13$KnowledgeAcquisitionGoal_Verifyin = constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingInduction" ) );
    $sym14$EL_IMPLICATION_P = makeSymbol( "EL-IMPLICATION-P" );
    $sym15$DESTROY_INFERENCE_AND_PROBLEM_STORE = makeSymbol( "DESTROY-INFERENCE-AND-PROBLEM-STORE" );
    $kw16$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $sym17$_SENTENCE = makeSymbol( "?SENTENCE" );
    $str18$Boris = makeString( "Boris" );
    $sym19$_OUTPUT = makeSymbol( "?OUTPUT" );
    $sym20$_TIME = makeSymbol( "?TIME" );
    $sym21$_EVAL_SET = makeSymbol( "?EVAL-SET" );
    $sym22$REST = makeSymbol( "REST" );
    $sym23$_GOAL_TYPE = makeSymbol( "?GOAL-TYPE" );
    $const24$KnowledgeAcquisitionGoal_Verifyin = constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingHypothesizedInformation" ) );
    $const25$KnowledgeAcquisitionGoal_Verifyin = constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingAbduction" ) );
    $const26$KnowledgeAcquisitionGoal_Verifyin = constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKBContent" ) );
    $str27$Unknown_question_type__A____dont_ = makeString( "Unknown question type ~A -- dont know what to do." );
    $sym28$FORT_P = makeSymbol( "FORT-P" );
    $const29$TrueCycLSentence = constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) );
    $const30$FalseCycLSentence = constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) );
    $sym31$QUESTION_STILL_NEEDS_TO_BE_ASKED_OF_USER_ = makeSymbol( "QUESTION-STILL-NEEDS-TO-BE-ASKED-OF-USER?" );
    $kw32$TEST = makeKeyword( "TEST" );
    $kw33$OWNER = makeKeyword( "OWNER" );
    $kw34$CLASSES = makeKeyword( "CLASSES" );
    $kw35$KB = makeKeyword( "KB" );
    $kw36$FULL = makeKeyword( "FULL" );
    $kw37$WORKING_ = makeKeyword( "WORKING?" );
    $list38 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( new SubLObject[]
            { constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles
                .reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ),
              constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell(
                      makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) )
    } ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( new SubLObject[] { constant_handles
        .reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
            "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell(
          makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ),
      constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell(
          makeString( "UnclearCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) )
    } ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-VerifyingKnowledgeFromCorpus" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "FalseCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) ), constant_handles
                .reader_make_constant_shell( makeString( "SkippedCycLSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), constant_handles.reader_make_constant_shell(
                    makeString( "SkippedCycLSentence" ) ) ) ), T ) );
    $const39$WebGame_MultipleChoiceSentences_W = constant_handles.reader_make_constant_shell( makeString( "WebGame-MultipleChoiceSentences-WithGoalType" ) );
    $sym40$GET_ITERATOR_FOR_QUESTIONS_TO_ASK = makeSymbol( "GET-ITERATOR-FOR-QUESTIONS-TO-ASK" );
    $sym41$QUESTIONS_TO_ASK_ITERATOR_DONE = makeSymbol( "QUESTIONS-TO-ASK-ITERATOR-DONE" );
    $sym42$QUESTIONS_TO_ASK_ITERATOR_NEXT = makeSymbol( "QUESTIONS-TO-ASK-ITERATOR-NEXT" );
    $sym43$QUESTIONS_TO_ASK_ITERATOR_FINALIZE = makeSymbol( "QUESTIONS-TO-ASK-ITERATOR-FINALIZE" );
    $list44 = ConsesLow.list( makeSymbol( "INFERENCE-ITERATOR" ), makeSymbol( "COUNTER" ), makeSymbol( "DOMAIN-MT" ) );
    $sym45$_SET = makeSymbol( "?SET" );
    $sym46$GET_TOPICAL_ITERATOR_FOR_QUESTIONS_TO_ASK = makeSymbol( "GET-TOPICAL-ITERATOR-FOR-QUESTIONS-TO-ASK" );
    $const47$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $const48$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $sym49$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_DONE = makeSymbol( "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-DONE" );
    $sym50$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_NEXT = makeSymbol( "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-NEXT" );
    $sym51$TOPICAL_QUESTIONS_TO_ASK_ITERATOR_FINALIZE = makeSymbol( "TOPICAL-QUESTIONS-TO-ASK-ITERATOR-FINALIZE" );
    $list52 = ConsesLow.list( makeSymbol( "QUESTION-ITERATOR" ), makeSymbol( "TOPICS-FILTER" ), makeSymbol( "COUNTER" ) );
    $list53 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "QUESTIONS" ), makeSymbol( "RESPONSES" ), makeSymbol( "TOPICS" ), makeSymbol( "SET" ) );
    $const54$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $str55$Malformed_topics_filter_expressio = makeString( "Malformed topics filter expression ~A." );
    $str56$Implementation_error__overlooked_ = makeString( "Implementation error: overlooked case in matching filter expression ~A." );
    $sym57$TOPIC_MATCHES_TOPICS_FILTER_ = makeSymbol( "TOPIC-MATCHES-TOPICS-FILTER?" );
    $list58 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "NounCompoundRule" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NounCompoundRule" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "Entertainment-Topic" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NounCompoundRule" ) ) ) ) ), NIL ), ConsesLow
                        .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell(
                            makeString( "NounCompoundRule" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "or" ) ), constant_handles.reader_make_constant_shell( makeString( "Entertainment-Topic" ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "Ailments-Topic" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), constant_handles.reader_make_constant_shell(
                                            makeString( "Entertainment-Topic" ) ), constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                .list( constant_handles.reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                    "NounCompoundRule" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "Entertainment-Topic" ) ) ), ConsesLow.list(
                                                            constant_handles.reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ) ) ), T ),
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "Entertainment-Topic" ) ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ) ) ), NIL ) );
    $sym59$TOPIC_LIST_MATCHES_TOPICS_FILTER_ = makeSymbol( "TOPIC-LIST-MATCHES-TOPICS-FILTER?" );
    $list60 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "NounCompoundRule" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NounCompoundRule" ) ) ) ) ), T ), ConsesLow.list(
                ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Entertainment-Topic" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                        "NounCompoundRule" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NounCompoundRule" ) ) ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), constant_handles.reader_make_constant_shell(
                                    makeString( "Entertainment-Topic" ) ), constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                        constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list(
                                            constant_handles.reader_make_constant_shell( makeString( "or" ) ), constant_handles.reader_make_constant_shell( makeString( "Entertainment-Topic" ) ), constant_handles
                                                .reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                    .reader_make_constant_shell( makeString( "GoalOfVerifyingPredPopHypothesisAboutTopicFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                        "NounCompoundRule" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                            .reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "Entertainment-Topic" ) ) ), ConsesLow.list(
                                                                constant_handles.reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ) ) ),
                                                    T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), constant_handles
                                                            .reader_make_constant_shell( makeString( "Entertainment-Topic" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ),
                                                                constant_handles.reader_make_constant_shell( makeString( "Ailments-Topic" ) ) ) ) ), NIL ) );
    $sym61$QUESTION_TOPICS_INFORMATION_FOR_PREDICATE = makeSymbol( "QUESTION-TOPICS-INFORMATION-FOR-PREDICATE" );
    $kw62$TOPIC = makeKeyword( "TOPIC" );
    $const63$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $const64$FactFactoryVerificationSentencesM = constant_handles.reader_make_constant_shell( makeString( "FactFactoryVerificationSentencesMt" ) );
    $const65$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const66$FACToryVerificationPredForTopicFn = constant_handles.reader_make_constant_shell( makeString( "FACToryVerificationPredForTopicFn" ) );
    $list67 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $sym68$_QUESTION_TOPICS_INFORMATION_FOR_PREDICATE_CACHING_STATE_ = makeSymbol( "*QUESTION-TOPICS-INFORMATION-FOR-PREDICATE-CACHING-STATE*" );
    $sym69$TITLE_FOR_QUESTION_TOPIC = makeSymbol( "TITLE-FOR-QUESTION-TOPIC" );
    $kw70$LABEL = makeKeyword( "LABEL" );
    $const71$TopicMt = constant_handles.reader_make_constant_shell( makeString( "TopicMt" ) );
    $const72$topicTitle = constant_handles.reader_make_constant_shell( makeString( "topicTitle" ) );
    $list73 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $str74$General = makeString( "General" );
    $sym75$_TITLE_FOR_QUESTION_TOPIC_CACHING_STATE_ = makeSymbol( "*TITLE-FOR-QUESTION-TOPIC-CACHING-STATE*" );
    $sym76$EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC = makeSymbol( "EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC" );
    $sym77$_EXTERNAL_IDENTIFICATION_FOR_QUESTION_TOPIC_CACHING_STATE_ = makeSymbol( "*EXTERNAL-IDENTIFICATION-FOR-QUESTION-TOPIC-CACHING-STATE*" );
    $sym78$EXTERNAL_IDENTIFICATION_FOR_CHOICE = makeSymbol( "EXTERNAL-IDENTIFICATION-FOR-CHOICE" );
    $sym79$_EXTERNAL_IDENTIFICATION_FOR_CHOICE_CACHING_STATE_ = makeSymbol( "*EXTERNAL-IDENTIFICATION-FOR-CHOICE-CACHING-STATE*" );
    $sym80$GENERATE_XML_FILE_OF_QUESTIONS_TO_ASK = makeSymbol( "GENERATE-XML-FILE-OF-QUESTIONS-TO-ASK" );
    $kw81$OUTPUT = makeKeyword( "OUTPUT" );
    $str82$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym83$GENERATE_XML_FILE_OF_TOPICAL_QUESTIONS_TO_ASK = makeSymbol( "GENERATE-XML-FILE-OF-TOPICAL-QUESTIONS-TO-ASK" );
    $sym84$COMPUTE_TOPICAL_QUESTIONS_TO_ASK = makeSymbol( "COMPUTE-TOPICAL-QUESTIONS-TO-ASK" );
    $list85 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "SENTENCES" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "RESPONSES" ), makeSymbol( "TOPIC-INFOS" ), makeSymbol( "CHOICE-SET" ) );
    $sym86$GET_TOPIC_QUESTIONS_COUNT = makeSymbol( "GET-TOPIC-QUESTIONS-COUNT" );
    $sym87$_ = makeSymbol( ">" );
    $sym88$CDR = makeSymbol( "CDR" );
    $sym89$GENERATE_STRIPED_XML_FOR_QUESTION_TO_ASK_USER = makeSymbol( "GENERATE-STRIPED-XML-FOR-QUESTION-TO-ASK-USER" );
    $str90$Generating_striped_XML_____ = makeString( "Generating striped XML ...." );
    $list91 = ConsesLow.cons( makeSymbol( "PREDICATE" ), makeSymbol( "TIMES" ) );
    $sym92$_EXIT = makeSymbol( "%EXIT" );
    $sym93$GENERATE_STRIPED_QUESTION_LIST_ITERATOR_TO_ASK_USER = makeSymbol( "GENERATE-STRIPED-QUESTION-LIST-ITERATOR-TO-ASK-USER" );
    $str94$Generating_striped_list_iterator_ = makeString( "Generating striped list iterator ...." );
    $sym95$GET_QUESTIONS_TO_ASK_USER_IN_XML = makeSymbol( "GET-QUESTIONS-TO-ASK-USER-IN-XML" );
    $sym96$CLET = makeSymbol( "CLET" );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WEB-GAME-TERMS-IDENTIFICATION-TRACKING*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) );
    $sym98$ITERATOR_P = makeSymbol( "ITERATOR-P" );
    $str99$askingQuestions = makeString( "askingQuestions" );
    $str100$http___www_opencyc_org_xml_asking = makeString( "http://www.opencyc.org/xml/askingQuestions.dtd" );
    $kw101$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str102$questionSets = makeString( "questionSets" );
    $str103$questionSet = makeString( "questionSet" );
    $const104$KnowledgeAcquisitionGoal_Falsifyi = constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal-FalsifyingLies" ) );
    $str105$Dont_know_how_to_handle_question_ = makeString( "Dont know how to handle question set type ~A." );
    $str106$Falsifying_Lies_are_not_supported = makeString( "Falsifying-Lies are not supported yet; skipped ~D.~%" );
    $sym107$_VALUE = makeSymbol( "?VALUE" );
    $str108$choiceQuestion = makeString( "choiceQuestion" );
    $str109$prologue = makeString( "prologue" );
    $str110$Please_complete_the_following_sen = makeString( "Please complete the following sentence ...." );
    $str111$incompleteSentence = makeString( "incompleteSentence" );
    $str112$questions = makeString( "questions" );
    $str113$epilogue = makeString( "epilogue" );
    $str114$I_ve_narrowed_down_the_choices_to = makeString( "I've narrowed down the choices to these." );
    $str115$I_ve_narrowed_down_the_choices_to = makeString( "I've narrowed down the choices to one of these." );
    $str116$_ = makeString( " " );
    $str117$_____ = makeString( "_____" );
    $sym118$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $kw119$INTERROGATIVE = makeKeyword( "INTERROGATIVE" );
    $str120$entryType = makeString( "entryType" );
    $str121$multiple = makeString( "multiple" );
    $str122$single = makeString( "single" );
    $str123$choices = makeString( "choices" );
    $list124 = ConsesLow.cons( makeSymbol( "CHOICE" ), makeSymbol( "RENDERING" ) );
    $str125$suid = makeString( "suid" );
    $str126$id = makeString( "id" );
    $str127$choice = makeString( "choice" );
    $str128$readingQuestion = makeString( "readingQuestion" );
    $str129$I_am_thinking_of_a_sentence_____ = makeString( "I am thinking of a sentence ...." );
    $str130$Because_I_read_it_on_the_web_ = makeString( "Because I read it on the web." );
    $str131$abductiveQuestion = makeString( "abductiveQuestion" );
    $str132$Because_I_am_guessing_ = makeString( "Because I am guessing." );
    $str133$hypothesizedQuestion = makeString( "hypothesizedQuestion" );
    $str134$Because_I_think_it_might_be_true_ = makeString( "Because I think it might be true." );
    $str135$kbQuestion = makeString( "kbQuestion" );
    $str136$Because_someone_told_me_so_ = makeString( "Because someone told me so." );
    $kw137$DECLARATIVE = makeKeyword( "DECLARATIVE" );
    $str138$ruleQuestion = makeString( "ruleQuestion" );
    $str139$I_have_an_idea__if_I_am_right_it_ = makeString( "I have an idea; if I am right it would mean that ...." );
    $str140$ruleText = makeString( "ruleText" );
    $str141$Because_if_I_am_right_it_would_me = makeString( "Because if I am right it would mean: " );
    $str142$question = makeString( "question" );
    $str143$topics = makeString( "topics" );
    $list144 = ConsesLow.list( makeSymbol( "TOPIC" ), makeSymbol( "TITLE" ) );
    $str145$topic = makeString( "topic" );
    $str146$text = makeString( "text" );
    $str147$responses = makeString( "responses" );
    $str148$_ = makeString( "," );
    $str149$T = makeString( "T" );
    $str150$F = makeString( "F" );
    $const151$SkippedCycLSentence = constant_handles.reader_make_constant_shell( makeString( "SkippedCycLSentence" ) );
    $str152$S = makeString( "S" );
    $const153$UnclearCycLSentence = constant_handles.reader_make_constant_shell( makeString( "UnclearCycLSentence" ) );
    $str154$N = makeString( "N" );
    $str155$Dont_know_how_to_deal_with_respon = makeString( "Dont know how to deal with response ~A" );
    $sym156$NOTE_USER_EVALUATIONS_OF_SENTENCES = makeSymbol( "NOTE-USER-EVALUATIONS-OF-SENTENCES" );
    $list157 = ConsesLow.list( makeSymbol( "HL-EXTERNAL" ), makeSymbol( "PREDICATE" ) );
    $sym158$NOTE_USER_EVALUATION_OF_SENTENCE = makeSymbol( "NOTE-USER-EVALUATION-OF-SENTENCE" );
    $const159$CycLPropositionalSentence = constant_handles.reader_make_constant_shell( makeString( "CycLPropositionalSentence" ) );
    $str160$Term__A_does_not_denote_a_valid_e = makeString( "Term ~A does not denote a valid evaluation predicate" );
    $const161$evaluationOfAs = constant_handles.reader_make_constant_shell( makeString( "evaluationOfAs" ) );
    $const162$EvaluationOfByOnFn = constant_handles.reader_make_constant_shell( makeString( "EvaluationOfByOnFn" ) );
    $const163$MtWithFocalContentSentenceFn = constant_handles.reader_make_constant_shell( makeString( "MtWithFocalContentSentenceFn" ) );
    $const164$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $const165$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $const166$SubCollectionNamedFn = constant_handles.reader_make_constant_shell( makeString( "SubCollectionNamedFn" ) );
    $list167 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ) );
    $sym168$NOTE_GOAL_CATEGORY_FOR_SENTENCE = makeSymbol( "NOTE-GOAL-CATEGORY-FOR-SENTENCE" );
    $const169$goalCategoryForAgent = constant_handles.reader_make_constant_shell( makeString( "goalCategoryForAgent" ) );
    $const170$Cyc = constant_handles.reader_make_constant_shell( makeString( "Cyc" ) );
    $const171$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym172$_TV = makeSymbol( "?TV" );
    $const173$knows = constant_handles.reader_make_constant_shell( makeString( "knows" ) );
    $const174$sentenceTruth = constant_handles.reader_make_constant_shell( makeString( "sentenceTruth" ) );
    $list175 = ConsesLow.list( makeSymbol( "?TV" ) );
    $list176 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KnowledgeAcquisitionGoal" ) ) );
    $sym177$LOAD_USER_EVALUATED_SENTENCES = makeSymbol( "LOAD-USER-EVALUATED-SENTENCES" );
    $kw178$INPUT = makeKeyword( "INPUT" );
    $str179$Loading_webgame_results_from_ = makeString( "Loading webgame results from " );
    $str180$_____ = makeString( " ...." );
    $kw181$EOF = makeKeyword( "EOF" );
    $kw182$DONE = makeKeyword( "DONE" );
    $sym183$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list184 = ConsesLow.list( makeSymbol( "BELIEF" ), makeSymbol( "SENTENCE-ID" ) );
    $str185$Could_not_store_result__A____erro = makeString( "Could not store result ~A -- error ~A.~%" );
    $sym186$LOAD_AND_SUBMIT_EVALUATED_SENTENCES_FROM_FILE = makeSymbol( "LOAD-AND-SUBMIT-EVALUATED-SENTENCES-FROM-FILE" );
    $const187$FACTory_WebGame = constant_handles.reader_make_constant_shell( makeString( "FACTory-WebGame" ) );
    $sym188$RECORD_CONSENSUS_SENTENCE_EVALUATION = makeSymbol( "RECORD-CONSENSUS-SENTENCE-EVALUATION" );
    $const189$sentenceAssignedStatusViaInfoStor = constant_handles.reader_make_constant_shell( makeString( "sentenceAssignedStatusViaInfoStore" ) );
    $kw190$TRUE = makeKeyword( "TRUE" );
    $kw191$FALSE = makeKeyword( "FALSE" );
    $kw192$NONSENSE = makeKeyword( "NONSENSE" );
    $const193$RidiculousCycLSentence = constant_handles.reader_make_constant_shell( makeString( "RidiculousCycLSentence" ) );
    $kw194$OBSCURE = makeKeyword( "OBSCURE" );
    $const195$UninterestingCycLSentence = constant_handles.reader_make_constant_shell( makeString( "UninterestingCycLSentence" ) );
    $kw196$PROBABLY_TRUE = makeKeyword( "PROBABLY-TRUE" );
    $const197$PlausibleCycLSentence = constant_handles.reader_make_constant_shell( makeString( "PlausibleCycLSentence" ) );
    $kw198$PROBABLY_FALSE = makeKeyword( "PROBABLY-FALSE" );
    $const199$ImplausibleCycLSentence = constant_handles.reader_make_constant_shell( makeString( "ImplausibleCycLSentence" ) );
    $kw200$PROBABLY_NONSENSE = makeKeyword( "PROBABLY-NONSENSE" );
    $kw201$PROBLEM = makeKeyword( "PROBLEM" );
    $list202 = _constant_202_initializer();
  }
}
/*
 * 
 * Total time: 2021 ms
 * 
 */