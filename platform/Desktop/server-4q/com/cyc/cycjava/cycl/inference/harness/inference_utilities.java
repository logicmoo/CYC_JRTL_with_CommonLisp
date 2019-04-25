package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.tcp_server_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.kb_cleanup;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.butler.alchemy_export;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_utilities";
  public static final String myFingerPrint = "9a29cd0aaadb981fe6ce3eb96dbff98316bd1bc44507dc2b812657daca31f88b";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 17151L)
  private static SubLSymbol $unsatisfied_cnfs_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 30835L)
  private static SubLSymbol $answerability_statuses$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 41376L)
  private static SubLSymbol $count_hl_supports_in_hypothetical_contextsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 41560L)
  private static SubLSymbol $count_deduced_assertions_in_hypothetical_contextsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 66712L)
  private static SubLSymbol $gather_required_vocab_set$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 66855L)
  private static SubLSymbol $gather_required_vocab_trace$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 69756L)
  private static SubLSymbol $kbq_query_set_inference_vocab_set$;
  private static final SubLSymbol $sym0$START_SPARQL_SERVER;
  private static final SubLSymbol $sym1$START_EXTERNAL_SPARQL_PROCESS;
  private static final SubLSymbol $kw2$SPARQL;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$ALL;
  private static final SubLSymbol $kw5$NONE;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLString $str8$Unhandled_inference_property__S;
  private static final SubLSymbol $kw9$INFERENCE_MODE;
  private static final SubLSymbol $kw10$MAX_NUMBER;
  private static final SubLSymbol $kw11$MAX_STEP;
  private static final SubLSymbol $kw12$MAX_TIME;
  private static final SubLSymbol $kw13$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw14$BLOCK_;
  private static final SubLSymbol $kw15$BROWSABLE_;
  private static final SubLSymbol $kw16$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw17$CONTINUABLE_;
  private static final SubLSymbol $kw18$FORGET_EXTRA_RESULTS_;
  private static final SubLSymbol $kw19$FORWARD_MAX_TIME;
  private static final SubLSymbol $kw20$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw21$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw22$MIN_RULE_UTILITY;
  private static final SubLSymbol $kw23$METRICS;
  private static final SubLSymbol $kw24$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLSymbol $kw25$RETURN;
  private static final SubLSymbol $kw26$ALLOW_ABNORMALITY_CHECKING_;
  private static final SubLSymbol $kw27$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw29$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw30$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw31$ALLOWED_MODULES;
  private static final SubLSymbol $kw32$ALLOWED_RULES;
  private static final SubLSymbol $kw33$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw34$EVENTS;
  private static final SubLSymbol $kw35$FORBIDDEN_RULES;
  private static final SubLSymbol $kw36$PROBLEM_STORE;
  private static final SubLSymbol $kw37$RESULT_UNIQUENESS;
  private static final SubLSymbol $kw38$TRANSITIVE_CLOSURE_MODE;
  private static final SubLSymbol $kw39$PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw40$PROOF_SPEC;
  private static final SubLSymbol $kw41$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw42$ABDUCTION_ALLOWED_;
  private static final SubLSymbol $kw43$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw44$COMPLETENESS_MINIMIZATION_ALLOWED_;
  private static final SubLSymbol $kw45$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw46$DIRECTION;
  private static final SubLSymbol $kw47$EQUALITY_REASONING_DOMAIN;
  private static final SubLSymbol $kw48$EQUALITY_REASONING_METHOD;
  private static final SubLSymbol $kw49$EVALUATE_SUBL_ALLOWED_;
  private static final SubLSymbol $kw50$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw51$MAX_PROBLEM_COUNT;
  private static final SubLSymbol $kw52$NEGATION_BY_FAILURE_;
  private static final SubLSymbol $kw53$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw54$PROBLEM_STORE_NAME;
  private static final SubLSymbol $kw55$REMOVAL_ALLOWED_;
  private static final SubLSymbol $kw56$REWRITE_ALLOWED_;
  private static final SubLSymbol $kw57$TRANSFORMATION_ALLOWED_;
  private static final SubLString $str58$Unhandled_problem_store_property_;
  private static final SubLSymbol $kw59$POS;
  private static final SubLSymbol $sym60$HL_VAR_;
  private static final SubLObject $const61$sentenceTruth;
  private static final SubLString $str62$Got_more_than_2_answers_for__a_wh;
  private static final SubLSymbol $kw63$SKIP;
  private static final SubLSymbol $sym64$SINGLETON_;
  private static final SubLObject $const65$True;
  private static final SubLObject $const66$False;
  private static final SubLString $str67$No_true_answer_for__a;
  private static final SubLString $str68$No_false_answer_for__a;
  private static final SubLSymbol $sym69$INFERENCE_ANSWER_JUSTIFICATION_TO_TRUE_TMS_DEDUCTION_SPEC;
  private static final SubLSymbol $sym70$INFERENCE_ANSWER_JUSTIFICATION_TO_FALSE_TMS_DEDUCTION_SPEC;
  private static final SubLSymbol $sym71$INFERENCE_ANSWER__;
  private static final SubLSymbol $sym72$FIRST;
  private static final SubLSymbol $kw73$UNSPECIFIED;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$EL_VAR_;
  private static final SubLSymbol $kw76$BINDINGS;
  private static final SubLSymbol $kw77$HL;
  private static final SubLSymbol $kw78$NEG;
  private static final SubLSymbol $kw79$SPLIT;
  private static final SubLSymbol $sym80$SATISFIED_PROBLEM_;
  private static final SubLSymbol $sym81$INFERENCE_P;
  private static final SubLSymbol $sym82$THINKING_TASK_P;
  private static final SubLString $str83$Inference__A_is_not_controlled_by;
  private static final SubLSymbol $sym84$PROBLEM_P;
  private static final SubLSymbol $sym85$SINGLE_CLAUSE_PROBLEM_QUERY_P;
  private static final SubLSymbol $sym86$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym87$CYC_VAR_;
  private static final SubLSymbol $sym88$QUERY_STATIC_PROPERTIES_P;
  private static final SubLList $list89;
  private static final SubLString $str90$new_continuable_antecedent_infere;
  private static final SubLSymbol $kw91$TAB_DELIMITED;
  private static final SubLSymbol $kw92$OUTPUT;
  private static final SubLSymbol $sym93$STRINGP;
  private static final SubLString $str94$Unable_to_open__S;
  private static final SubLSymbol $sym95$OUTPUT_STREAM_P;
  private static final SubLSymbol $kw96$XML;
  private static final SubLSymbol $kw97$ALCHEMY;
  private static final SubLString $str98$Output_format__S_is_not_supported;
  private static final SubLString $str99$_A_C;
  private static final SubLString $str100$__;
  private static final SubLString $str101$__;
  private static final SubLList $list102;
  private static final SubLSymbol $kw103$NON_TRIVIAL;
  private static final SubLSymbol $kw104$UNKNOWN;
  private static final SubLSymbol $kw105$MAINTAIN_TERM_WORKING_SET_;
  private static final SubLSymbol $kw106$ANSWERABLE;
  private static final SubLSymbol $kw107$EXHAUST_TOTAL;
  private static final SubLSymbol $kw108$UNANSWERABLE;
  private static final SubLSymbol $sym109$QUERY_LITERAL_ANSWERABILITY_STATUS;
  private static final SubLList $list110;
  private static final SubLSymbol $kw111$PREFERRED;
  private static final SubLSymbol $kw112$DISPREFERRED;
  private static final SubLSymbol $kw113$GROSSLY_DISPREFERRED;
  private static final SubLSymbol $kw114$DISALLOWED;
  private static final SubLSymbol $kw115$DOOMED;
  private static final SubLString $str116$unexpected_preference_level__s;
  private static final SubLSymbol $sym117$QUERY_TERM_ARG_POSITION_ANSWERABILITY_STATUS;
  private static final SubLSymbol $sym118$QUERY_LITERAL_ANSWERABILITY_STATUS_ASYNCH;
  private static final SubLSymbol $sym119$HANDLE_ANSWERABILITY_RESULT_TUPLE;
  private static final SubLSymbol $sym120$DNF_LITERALS;
  private static final SubLSymbol $sym121$QUERY_LITERAL_SET_ANSWERABILITY_STATUS_VIA_CALLBACK;
  private static final SubLSymbol $sym122$LISTP;
  private static final SubLSymbol $sym123$CALLBACK_P;
  private static final SubLSymbol $sym124$BOOLEANP;
  private static final SubLFloat $float125$0_01;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym128$INFERENCE_ANSWER_ARGUMENT_STRENGTH;
  private static final SubLObject $const129$HypotheticalContext;
  private static final SubLSymbol $kw130$HYPOTHETICAL_MT_SUPPORT_COUNT;
  private static final SubLSymbol $sym131$INFERENCE_ANSWER_P;
  private static final SubLSymbol $sym132$PROBLEM_STORE_P;
  private static final SubLObject $const133$AbsoluteCycProblemStoreFn;
  private static final SubLObject $const134$CycInferenceFn;
  private static final SubLObject $const135$Computer;
  private static final SubLSymbol $kw136$DENOT;
  private static final SubLObject $const137$InferencePSC;
  private static final SubLString $str138$Couldn_t_find_a_term_representing;
  private static final SubLObject $const139$isa;
  private static final SubLList $list140;
  private static final SubLObject $const141$nameString;
  private static final SubLObject $const142$CycImageFn;
  private static final SubLObject $const143$BaseKB;
  private static final SubLObject $const144$MtSpace;
  private static final SubLObject $const145$MtTimeDimFn;
  private static final SubLObject $const146$cycProblemStoreLinkCount;
  private static final SubLObject $const147$cycProblemStoreProblemCount;
  private static final SubLObject $const148$cycProblemStoreProofCount;
  private static final SubLSymbol $sym149$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLObject $const150$inferenceStartTime;
  private static final SubLObject $const151$SecondsDuration;
  private static final SubLObject $const152$inferenceTimeToFirstAnswer;
  private static final SubLObject $const153$inferenceTimeToLastAnswer;
  private static final SubLObject $const154$inferenceAnswerCount;
  private static final SubLObject $const155$inferenceBindings;
  private static final SubLSymbol $sym156$QUERY_LITERAL_REMOVAL_COST;
  private static final SubLSymbol $sym157$ATOMIC_SENTENCE_;
  private static final SubLObject $const158$bridgingPredicateForPredicate;
  private static final SubLSymbol $kw159$GAF;
  private static final SubLList $list160;
  private static final SubLList $list161;
  private static final SubLSymbol $sym162$COL;
  private static final SubLSymbol $sym163$ARG1;
  private static final SubLSymbol $kw164$BREADTH;
  private static final SubLSymbol $kw165$QUEUE;
  private static final SubLSymbol $kw166$STACK;
  private static final SubLSymbol $sym167$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw168$ERROR;
  private static final SubLString $str169$_A_is_not_a__A;
  private static final SubLSymbol $sym170$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw171$CERROR;
  private static final SubLString $str172$continue_anyway;
  private static final SubLSymbol $kw173$WARN;
  private static final SubLString $str174$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const175$genls;
  private static final SubLObject $const176$rdf_type;
  private static final SubLString $str177$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str178$attempting_to_bind_direction_link;
  private static final SubLString $str179$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym180$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const181$EverythingPSC;
  private static final SubLObject $const182$logicalResultSetCardinalityWRTVal;
  private static final SubLSymbol $kw183$TRUE;
  private static final SubLObject $const184$meaningSentenceOfSchema;
  private static final SubLSymbol $kw185$IMPOSSIBLE;
  private static final SubLList $list186;
  private static final SubLSymbol $kw187$COMPLETE;
  private static final SubLList $list188;
  private static final SubLList $list189;
  private static final SubLSymbol $kw190$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw191$DONE;
  private static final SubLSymbol $sym192$CLAUSE_VAR;
  private static final SubLSymbol $sym193$INDEX_VAR;
  private static final SubLSymbol $sym194$CLET;
  private static final SubLSymbol $sym195$DO_CONTEXTUALIZED_CLAUSE_LITERALS;
  private static final SubLSymbol $kw196$INDEX;
  private static final SubLSymbol $sym197$CLAUSE_WITHOUT_LITERAL;
  private static final SubLSymbol $sym198$CONTEXTUALIZED_DNF_CLAUSE_P;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$VARIABLE_P;
  private static final SubLSymbol $sym201$MEMOIZED_LITERAL_REMOVAL_OPTIONS;
  private static final SubLSymbol $kw202$TACTICAL;
  private static final SubLSymbol $kw203$JOIN_ORDERED;
  private static final SubLSymbol $sym204$PROOF_P;
  private static final SubLSymbol $sym205$HASH_TABLE_P;
  private static final SubLSymbol $kw206$REMOVAL;
  private static final SubLSymbol $kw207$RESTRICTION;
  private static final SubLList $list208;
  private static final SubLSymbol $kw209$TRANSFORMATION;
  private static final SubLSymbol $sym210$FORT_P;
  private static final SubLString $str211$__added__S;
  private static final SubLSymbol $sym212$GATHER_REQUIRED_VOCAB_HANDLER;
  private static final SubLSymbol $sym213$GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT;
  private static final SubLSymbol $kw214$PROGRESS_MESSAGE;
  private static final SubLString $str215$Gathering_vocab_from_KBQ_inferenc;
  private static final SubLSymbol $kw216$OUTLIER_TIMEOUT;
  private static final SubLSymbol $kw217$OVERRIDING_QUERY_PROPERTIES;
  private static final SubLSymbol $kw218$ADDITIONAL_ARGS;
  private static final SubLList $list219;
  private static final SubLString $str220$___a___a__a__;
  private static final SubLSymbol $sym221$PROBLEM_STORE_LINK_ID_MAP;
  private static final SubLSymbol $sym222$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $kw223$ROOT;
  private static final SubLSymbol $sym224$PROBLEM_SUID;
  private static final SubLSymbol $sym225$QUERY_ANSWERABILITY_STATUS;
  private static final SubLSymbol $kw226$TEST;
  private static final SubLSymbol $kw227$OWNER;
  private static final SubLSymbol $kw228$CLASSES;
  private static final SubLSymbol $kw229$KB;
  private static final SubLSymbol $kw230$FULL;
  private static final SubLSymbol $kw231$WORKING_;
  private static final SubLList $list232;
  private static final SubLObject $list233;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 863L)
  public static SubLObject sparql_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.add( system_parameters.$base_tcp_port$.getDynamicValue( thread ), system_parameters.$sparql_port_offset$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 1049L)
  public static SubLObject start_external_sparql_process(final SubLObject port)
  {
    Functions.funcall( $sym0$START_SPARQL_SERVER, port );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 1346L)
  public static SubLObject allowed_rules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( $kw4$ALL == v_object || NIL != assertion_utilities.list_of_rule_assertion_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 1487L)
  public static SubLObject forbidden_rules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( $kw5$NONE == v_object || NIL != assertion_utilities.list_of_rule_assertion_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 1610L)
  public static SubLObject openness_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $list6 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 1692L)
  public static SubLObject answerability_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $list7 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 1791L)
  public static SubLObject inference_input_property_lookup(final SubLObject inference, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( NIL != inference_datastructures_enumerated_types.query_property_p( property ) )
    {
      return inference_datastructures_inference.inference_input_query_property( inference, property, v_default );
    }
    Errors.error( $str8$Unhandled_inference_property__S, property );
    return v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 2126L)
  public static SubLObject inference_property_lookup(final SubLObject inference, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( NIL != inference_datastructures_enumerated_types.inference_resource_constraint_p( property ) )
    {
      if( property.eql( $kw9$INFERENCE_MODE ) )
      {
        return inference_datastructures_inference.inference_mode( inference );
      }
      if( property.eql( $kw10$MAX_NUMBER ) )
      {
        return inference_datastructures_inference.inference_max_number( inference );
      }
      if( property.eql( $kw11$MAX_STEP ) )
      {
        return inference_datastructures_inference.inference_max_step( inference );
      }
      if( property.eql( $kw12$MAX_TIME ) )
      {
        return inference_datastructures_inference.inference_max_time( inference );
      }
      Errors.warn( $str8$Unhandled_inference_property__S, property );
      return v_default;
    }
    else if( NIL != inference_datastructures_enumerated_types.inference_dynamic_property_p( property ) )
    {
      if( property.eql( $kw13$ANSWER_LANGUAGE ) )
      {
        return inference_datastructures_inference.inference_answer_language( inference );
      }
      if( property.eql( $kw14$BLOCK_ ) )
      {
        return inference_datastructures_inference.inference_blockingP( inference );
      }
      if( property.eql( $kw15$BROWSABLE_ ) )
      {
        return inference_datastructures_inference.inference_browsableP( inference );
      }
      if( property.eql( $kw16$CACHE_INFERENCE_RESULTS_ ) )
      {
        return inference_datastructures_inference.inference_cache_resultsP( inference );
      }
      if( property.eql( $kw17$CONTINUABLE_ ) )
      {
        return inference_datastructures_inference.inference_continuableP( inference );
      }
      if( property.eql( $kw18$FORGET_EXTRA_RESULTS_ ) )
      {
        return inference_datastructures_inference.inference_forget_extra_resultsP( inference );
      }
      if( property.eql( $kw19$FORWARD_MAX_TIME ) )
      {
        return inference_datastructures_inference.inference_forward_max_time( inference );
      }
      if( property.eql( $kw20$MAX_PROOF_DEPTH ) )
      {
        return inference_datastructures_inference.inference_max_proof_depth( inference );
      }
      if( property.eql( $kw21$MAX_TRANSFORMATION_DEPTH ) )
      {
        return inference_datastructures_inference.inference_max_transformation_depth( inference );
      }
      if( property.eql( $kw22$MIN_RULE_UTILITY ) )
      {
        return inference_datastructures_inference.inference_min_rule_utility( inference );
      }
      if( property.eql( $kw23$METRICS ) )
      {
        return inference_datastructures_inference.inference_metrics_template( inference );
      }
      if( property.eql( $kw24$PROBABLY_APPROXIMATELY_DONE ) )
      {
        return inference_datastructures_inference.inference_probably_approximately_done( inference );
      }
      if( property.eql( $kw25$RETURN ) )
      {
        return inference_datastructures_inference.inference_return_type( inference );
      }
      Errors.warn( $str8$Unhandled_inference_property__S, property );
      return v_default;
    }
    else if( NIL != inference_datastructures_enumerated_types.inference_static_property_p( property ) )
    {
      if( property.eql( $kw26$ALLOW_ABNORMALITY_CHECKING_ ) )
      {
        return inference_datastructures_inference.inference_allow_abnormality_checkingP( inference );
      }
      if( property.eql( $kw27$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ ) )
      {
        return inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP( inference );
      }
      if( property.eql( $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_ ) )
      {
        return inference_datastructures_inference.inference_allow_hl_predicate_transformationP( inference );
      }
      if( property.eql( $kw29$ALLOW_INDETERMINATE_RESULTS_ ) )
      {
        return inference_datastructures_inference.inference_allow_indeterminate_resultsP( inference );
      }
      if( property.eql( $kw30$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ ) )
      {
        return inference_datastructures_inference.inference_allow_unbound_predicate_transformationP( inference );
      }
      if( property.eql( $kw31$ALLOWED_MODULES ) )
      {
        return inference_datastructures_inference.inference_allowed_modules( inference );
      }
      if( property.eql( $kw32$ALLOWED_RULES ) )
      {
        return inference_datastructures_inference.inference_allowed_rules( inference );
      }
      if( property.eql( $kw33$DISJUNCTION_FREE_EL_VARS_POLICY ) )
      {
        return inference_datastructures_inference.inference_disjunction_free_el_vars_policy( inference );
      }
      if( property.eql( $kw34$EVENTS ) )
      {
        return inference_datastructures_inference.inference_events( inference );
      }
      if( property.eql( $kw35$FORBIDDEN_RULES ) )
      {
        return inference_datastructures_inference.inference_forbidden_rules( inference );
      }
      if( property.eql( $kw36$PROBLEM_STORE ) )
      {
        return inference_datastructures_inference.inference_problem_store( inference );
      }
      if( property.eql( $kw37$RESULT_UNIQUENESS ) )
      {
        return inference_datastructures_inference.inference_result_uniqueness_criterion( inference );
      }
      if( property.eql( $kw38$TRANSITIVE_CLOSURE_MODE ) )
      {
        return inference_datastructures_inference.inference_transitive_closure_mode( inference );
      }
      if( property.eql( $kw38$TRANSITIVE_CLOSURE_MODE ) )
      {
        return inference_datastructures_inference.inference_transitive_closure_mode( inference );
      }
      Errors.warn( $str8$Unhandled_inference_property__S, property );
      return v_default;
    }
    else if( NIL != inference_datastructures_enumerated_types.strategy_property_p( property ) )
    {
      final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy( inference );
      if( property.eql( $kw39$PRODUCTIVITY_LIMIT ) )
      {
        return inference_datastructures_strategy.strategy_productivity_limit( strategy );
      }
      if( property.eql( $kw40$PROOF_SPEC ) )
      {
        return inference_datastructures_strategy.strategy_proof_spec( strategy );
      }
      if( property.eql( $kw41$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT ) )
      {
        return inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit( strategy );
      }
      Errors.warn( $str8$Unhandled_inference_property__S, property );
      return v_default;
    }
    else
    {
      if( NIL != inference_datastructures_enumerated_types.problem_store_property_p( property ) )
      {
        final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
        return problem_store_property_lookup( store, property, v_default );
      }
      Errors.error( $str8$Unhandled_inference_property__S, property );
      return v_default;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 6812L)
  public static SubLObject problem_store_property_lookup(final SubLObject store, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( property.eql( $kw42$ABDUCTION_ALLOWED_ ) )
    {
      return inference_datastructures_problem_store.problem_store_abduction_allowedP( store );
    }
    if( property.eql( $kw43$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ ) )
    {
      return inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP( store );
    }
    if( property.eql( $kw44$COMPLETENESS_MINIMIZATION_ALLOWED_ ) )
    {
      return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP( store );
    }
    if( property.eql( $kw45$COMPUTE_ANSWER_JUSTIFICATIONS_ ) )
    {
      return inference_datastructures_problem_store.problem_store_compute_answer_justificationsP( store );
    }
    if( property.eql( $kw46$DIRECTION ) )
    {
      return inference_datastructures_problem_store.problem_store_direction( store );
    }
    if( property.eql( $kw47$EQUALITY_REASONING_DOMAIN ) )
    {
      return inference_datastructures_problem_store.problem_store_equality_reasoning_domain( store );
    }
    if( property.eql( $kw48$EQUALITY_REASONING_METHOD ) )
    {
      return inference_datastructures_problem_store.problem_store_equality_reasoning_method( store );
    }
    if( property.eql( $kw49$EVALUATE_SUBL_ALLOWED_ ) )
    {
      return inference_datastructures_problem_store.problem_store_evaluate_subl_allowedP( store );
    }
    if( property.eql( $kw50$INTERMEDIATE_STEP_VALIDATION_LEVEL ) )
    {
      return inference_datastructures_problem_store.problem_store_intermediate_step_validation_level( store );
    }
    if( property.eql( $kw51$MAX_PROBLEM_COUNT ) )
    {
      return inference_datastructures_problem_store.problem_store_max_problem_count( store );
    }
    if( property.eql( $kw52$NEGATION_BY_FAILURE_ ) )
    {
      return inference_datastructures_problem_store.problem_store_negation_by_failureP( store );
    }
    if( property.eql( $kw53$NEW_TERMS_ALLOWED_ ) )
    {
      return inference_datastructures_problem_store.problem_store_new_terms_allowedP( store );
    }
    if( property.eql( $kw54$PROBLEM_STORE_NAME ) )
    {
      return inference_datastructures_problem_store.problem_store_name( store );
    }
    if( property.eql( $kw55$REMOVAL_ALLOWED_ ) )
    {
      return inference_datastructures_problem_store.problem_store_removal_allowedP( store );
    }
    if( property.eql( $kw56$REWRITE_ALLOWED_ ) )
    {
      return inference_datastructures_problem_store.problem_store_rewrite_allowedP( store );
    }
    if( property.eql( $kw57$TRANSFORMATION_ALLOWED_ ) )
    {
      return inference_datastructures_problem_store.problem_store_transformation_allowedP( store );
    }
    Errors.warn( $str58$Unhandled_problem_store_property_, property );
    return v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 8619L)
  public static SubLObject single_literal_backchain_required_problemP(final SubLObject problem)
  {
    SubLObject result = NIL;
    if( NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
    {
      final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence( problem );
      final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt( problem );
      if( NIL != inference_trampolines.inference_backchain_required_asentP( asent, mt ) )
      {
        result = T;
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 9013L)
  public static SubLObject find_previous_inference_problem_by_el_asent(final SubLObject el_asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = $kw59$POS;
    }
    final SubLObject store = inference_worker.currently_active_problem_store();
    if( NIL != store )
    {
      final SubLObject inference = inference_datastructures_problem_store.earliest_problem_store_inference( store );
      if( NIL != inference )
      {
        final SubLObject mt = inference_datastructures_inference.inference_first_hl_query_mt( inference );
        if( NIL != mt )
        {
          final SubLObject asent = variables.canonicalize_default_el_vars( el_asent );
          final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( asent, sense, mt );
          final SubLObject free_hl_vars = ( NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP( store ) ) ? variables.sort_hl_variable_list( cycl_utilities
              .expression_gather( asent, $sym60$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) : NIL;
          return inference_datastructures_problem_store.find_problem_by_query( store, query, free_hl_vars );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 9780L)
  public static SubLObject inference_requires_argumentationP(final SubLObject inference)
  {
    final SubLObject el_query = inference_datastructures_inference.inference_el_query( inference );
    if( NIL != el_utilities.el_formula_p( el_query ) && NIL != cycl_utilities.atomic_sentence_with_pred_p( el_query, $const61$sentenceTruth ) )
    {
      final SubLObject pcase_var;
      final SubLObject answer_count = pcase_var = inference_datastructures_inference.inference_answer_count( inference );
      if( pcase_var.eql( ZERO_INTEGER ) || pcase_var.eql( ONE_INTEGER ) )
      {
        return NIL;
      }
      if( pcase_var.eql( TWO_INTEGER ) )
      {
        return T;
      }
      Errors.error( $str62$Got_more_than_2_answers_for__a_wh, inference );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 10508L)
  public static SubLObject inference_true_and_false_answers(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject true_answer = NIL;
    SubLObject false_answer = NIL;
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$1 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject v_bindings;
        SubLObject binding;
        SubLObject pcase_var;
        SubLObject value;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
            assert NIL != list_utilities.singletonP( v_bindings ) : v_bindings;
            binding = v_bindings.first();
            value = ( pcase_var = bindings.variable_binding_value( binding ) );
            if( pcase_var.eql( $const65$True ) )
            {
              true_answer = v_answer;
            }
            else if( pcase_var.eql( $const66$False ) )
            {
              false_answer = v_answer;
            }
            else
            {
              Errors.error( $str62$Got_more_than_2_answers_for__a_wh, inference );
            }
          }
        }
      }
      final SubLObject idx_$2 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$2 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject v_bindings2 = inference_datastructures_inference.inference_answer_bindings( v_answer2 );
            assert NIL != list_utilities.singletonP( v_bindings2 ) : v_bindings2;
            final SubLObject binding2 = v_bindings2.first();
            final SubLObject pcase_var2;
            final SubLObject value2 = pcase_var2 = bindings.variable_binding_value( binding2 );
            if( pcase_var2.eql( $const65$True ) )
            {
              true_answer = v_answer2;
            }
            else if( pcase_var2.eql( $const66$False ) )
            {
              false_answer = v_answer2;
            }
            else
            {
              Errors.error( $str62$Got_more_than_2_answers_for__a_wh, inference );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == true_answer )
    {
      Errors.error( $str67$No_true_answer_for__a, inference );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == false_answer )
    {
      Errors.error( $str68$No_false_answer_for__a, inference );
    }
    return Values.values( true_answer, false_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 11431L)
  public static SubLObject inference_argumentation_result(final SubLObject inference)
  {
    return inference_perform_argumentation( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 11866L)
  public static SubLObject inference_perform_argumentation(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject true_answer = inference_true_and_false_answers( inference );
    final SubLObject false_answer = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject true_justifications = inference_datastructures_inference.inference_answer_justifications( true_answer );
    final SubLObject false_justifications = inference_datastructures_inference.inference_answer_justifications( false_answer );
    final SubLObject true_tms_deduction_specs = Mapping.mapcar( $sym69$INFERENCE_ANSWER_JUSTIFICATION_TO_TRUE_TMS_DEDUCTION_SPEC, true_justifications );
    final SubLObject false_tms_deduction_specs = Mapping.mapcar( $sym70$INFERENCE_ANSWER_JUSTIFICATION_TO_FALSE_TMS_DEDUCTION_SPEC, false_justifications );
    final SubLObject tms_deduction_specs = ConsesLow.append( true_tms_deduction_specs, false_tms_deduction_specs );
    final SubLObject tv = argumentation.perform_tms_deduction_spec_argumentation( tms_deduction_specs );
    return tv;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 12634L)
  public static SubLObject inference_some_proof_uses_removal_moduleP(final SubLObject inference, final SubLObject hl_module)
  {
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$3 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject cdolist_list_var;
        SubLObject justification;
        SubLObject cdolist_list_var_$4;
        SubLObject proof;
        SubLObject cdolist_list_var_$5;
        SubLObject subproof;
        SubLObject proof_hl_module;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
            justification = NIL;
            justification = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cdolist_list_var_$4 = inference_datastructures_inference.inference_answer_justification_proofs( justification );
              proof = NIL;
              proof = cdolist_list_var_$4.first();
              while ( NIL != cdolist_list_var_$4)
              {
                cdolist_list_var_$5 = inference_datastructures_proof.all_proof_subproofs( proof );
                subproof = NIL;
                subproof = cdolist_list_var_$5.first();
                while ( NIL != cdolist_list_var_$5)
                {
                  if( NIL != inference_worker_removal.removal_proof_p( subproof ) )
                  {
                    proof_hl_module = inference_worker.content_proof_hl_module( subproof );
                    if( hl_module.eql( proof_hl_module ) )
                    {
                      return T;
                    }
                  }
                  cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                  subproof = cdolist_list_var_$5.first();
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                proof = cdolist_list_var_$4.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              justification = cdolist_list_var.first();
            }
          }
        }
      }
      final SubLObject idx_$4 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$4 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( v_answer2 );
            SubLObject justification2 = NIL;
            justification2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              SubLObject cdolist_list_var_$6 = inference_datastructures_inference.inference_answer_justification_proofs( justification2 );
              SubLObject proof2 = NIL;
              proof2 = cdolist_list_var_$6.first();
              while ( NIL != cdolist_list_var_$6)
              {
                SubLObject cdolist_list_var_$7 = inference_datastructures_proof.all_proof_subproofs( proof2 );
                SubLObject subproof2 = NIL;
                subproof2 = cdolist_list_var_$7.first();
                while ( NIL != cdolist_list_var_$7)
                {
                  if( NIL != inference_worker_removal.removal_proof_p( subproof2 ) )
                  {
                    final SubLObject proof_hl_module2 = inference_worker.content_proof_hl_module( subproof2 );
                    if( hl_module.eql( proof_hl_module2 ) )
                    {
                      return T;
                    }
                  }
                  cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                  subproof2 = cdolist_list_var_$7.first();
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                proof2 = cdolist_list_var_$6.first();
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              justification2 = cdolist_list_var2.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 12966L)
  public static SubLObject inference_some_proof_uses_transformation_moduleP(final SubLObject inference, final SubLObject hl_module)
  {
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$9 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$9, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$9 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject cdolist_list_var;
        SubLObject justification;
        SubLObject cdolist_list_var_$10;
        SubLObject proof;
        SubLObject cdolist_list_var_$11;
        SubLObject subproof;
        SubLObject proof_hl_module;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
            justification = NIL;
            justification = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cdolist_list_var_$10 = inference_datastructures_inference.inference_answer_justification_proofs( justification );
              proof = NIL;
              proof = cdolist_list_var_$10.first();
              while ( NIL != cdolist_list_var_$10)
              {
                cdolist_list_var_$11 = inference_datastructures_proof.all_proof_subproofs( proof );
                subproof = NIL;
                subproof = cdolist_list_var_$11.first();
                while ( NIL != cdolist_list_var_$11)
                {
                  if( NIL != inference_worker_transformation.transformation_proof_p( subproof ) )
                  {
                    proof_hl_module = inference_worker.content_proof_hl_module( subproof );
                    if( hl_module.eql( proof_hl_module ) )
                    {
                      return T;
                    }
                  }
                  cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                  subproof = cdolist_list_var_$11.first();
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                proof = cdolist_list_var_$10.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              justification = cdolist_list_var.first();
            }
          }
        }
      }
      final SubLObject idx_$10 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$10 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$10 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( v_answer2 );
            SubLObject justification2 = NIL;
            justification2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              SubLObject cdolist_list_var_$12 = inference_datastructures_inference.inference_answer_justification_proofs( justification2 );
              SubLObject proof2 = NIL;
              proof2 = cdolist_list_var_$12.first();
              while ( NIL != cdolist_list_var_$12)
              {
                SubLObject cdolist_list_var_$13 = inference_datastructures_proof.all_proof_subproofs( proof2 );
                SubLObject subproof2 = NIL;
                subproof2 = cdolist_list_var_$13.first();
                while ( NIL != cdolist_list_var_$13)
                {
                  if( NIL != inference_worker_transformation.transformation_proof_p( subproof2 ) )
                  {
                    final SubLObject proof_hl_module2 = inference_worker.content_proof_hl_module( subproof2 );
                    if( hl_module.eql( proof_hl_module2 ) )
                    {
                      return T;
                    }
                  }
                  cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                  subproof2 = cdolist_list_var_$13.first();
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                proof2 = cdolist_list_var_$12.first();
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              justification2 = cdolist_list_var2.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 13271L)
  public static SubLObject inference_removal_modules_used_in_proofs(final SubLObject inference)
  {
    SubLObject hl_modules = NIL;
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$15 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$15, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$15 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject cdolist_list_var;
        SubLObject justification;
        SubLObject cdolist_list_var_$16;
        SubLObject proof;
        SubLObject cdolist_list_var_$17;
        SubLObject subproof;
        SubLObject proof_hl_module;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
            justification = NIL;
            justification = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cdolist_list_var_$16 = inference_datastructures_inference.inference_answer_justification_proofs( justification );
              proof = NIL;
              proof = cdolist_list_var_$16.first();
              while ( NIL != cdolist_list_var_$16)
              {
                cdolist_list_var_$17 = inference_datastructures_proof.all_proof_subproofs( proof );
                subproof = NIL;
                subproof = cdolist_list_var_$17.first();
                while ( NIL != cdolist_list_var_$17)
                {
                  if( NIL != inference_worker_removal.removal_proof_p( subproof ) )
                  {
                    proof_hl_module = inference_worker.content_proof_hl_module( subproof );
                    hl_modules = ConsesLow.cons( proof_hl_module, hl_modules );
                  }
                  cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                  subproof = cdolist_list_var_$17.first();
                }
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                proof = cdolist_list_var_$16.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              justification = cdolist_list_var.first();
            }
          }
        }
      }
      final SubLObject idx_$16 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$16 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$16 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( v_answer2 );
            SubLObject justification2 = NIL;
            justification2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              SubLObject cdolist_list_var_$18 = inference_datastructures_inference.inference_answer_justification_proofs( justification2 );
              SubLObject proof2 = NIL;
              proof2 = cdolist_list_var_$18.first();
              while ( NIL != cdolist_list_var_$18)
              {
                SubLObject cdolist_list_var_$19 = inference_datastructures_proof.all_proof_subproofs( proof2 );
                SubLObject subproof2 = NIL;
                subproof2 = cdolist_list_var_$19.first();
                while ( NIL != cdolist_list_var_$19)
                {
                  if( NIL != inference_worker_removal.removal_proof_p( subproof2 ) )
                  {
                    final SubLObject proof_hl_module2 = inference_worker.content_proof_hl_module( subproof2 );
                    hl_modules = ConsesLow.cons( proof_hl_module2, hl_modules );
                  }
                  cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                  subproof2 = cdolist_list_var_$19.first();
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                proof2 = cdolist_list_var_$18.first();
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              justification2 = cdolist_list_var2.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return list_utilities.fast_delete_duplicates( hl_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 13643L)
  public static SubLObject categorize_inference_answers_via_rules(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rules_to_answer_map = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$21 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$21, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$21 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject cdolist_list_var;
        SubLObject justification;
        SubLObject rules;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
            justification = NIL;
            justification = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              rules = inference_datastructures_inference.inference_answer_justification_rules( justification );
              dictionary_utilities.dictionary_push( rules_to_answer_map, rules, v_answer );
              cdolist_list_var = cdolist_list_var.rest();
              justification = cdolist_list_var.first();
            }
          }
        }
      }
      final SubLObject idx_$22 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$22 ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$22 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$22 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$22 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw63$SKIP ) ) ? NIL : $kw63$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject v_answer2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) || NIL == id_index.id_index_tombstone_p( v_answer2 ) )
          {
            SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( v_answer2 );
            SubLObject justification2 = NIL;
            justification2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              final SubLObject rules2 = inference_datastructures_inference.inference_answer_justification_rules( justification2 );
              dictionary_utilities.dictionary_push( rules_to_answer_map, rules2, v_answer2 );
              cdolist_list_var2 = cdolist_list_var2.rest();
              justification2 = cdolist_list_var2.first();
            }
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    SubLObject answer_lists = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( rules_to_answer_map ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      SubLObject answers = thread.secondMultipleValue();
      thread.resetMultipleValues();
      answers = Sequences.nreverse( answers );
      answer_lists = ConsesLow.cons( answers, answer_lists );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    answer_lists = Sort.sort( answer_lists, $sym71$INFERENCE_ANSWER__, Symbols.symbol_function( $sym72$FIRST ) );
    return answer_lists;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 14434L)
  public static SubLObject unsatisfied_cnfs_for_rule(final SubLObject rule, final SubLObject hl_bindings, SubLObject unbound_var_max, SubLObject mt, SubLObject problem_store)
  {
    if( unbound_var_max == UNPROVIDED )
    {
      unbound_var_max = $kw5$NONE;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( problem_store == UNPROVIDED )
    {
      problem_store = $kw73$UNSPECIFIED;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject subbed_rule_formula = unsatisfied_cnf_subbed_rule_formula_from_bindings( rule, hl_bindings, mt );
    final SubLObject new_problem_storeP = makeBoolean( NIL == inference_datastructures_problem_store.valid_problem_store_p( problem_store ) );
    SubLObject ans = NIL;
    if( NIL != new_problem_storeP )
    {
      problem_store = inference_datastructures_problem_store.new_problem_store( UNPROVIDED );
    }
    try
    {
      if( NIL != el_utilities.el_implication_p( subbed_rule_formula ) && NIL == unsatisfied_cnf_rejectP( subbed_rule_formula, mt, ConsesLow.list( $kw36$PROBLEM_STORE, problem_store ) ) )
      {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args( subbed_rule_formula, UNPROVIDED );
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
        antecedent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
        consequent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != cycl_utilities.expression_find_if( $sym75$EL_VAR_, consequent, UNPROVIDED, UNPROVIDED ) || NIL == inference_kernel.new_cyc_query( consequent, mt, ConsesLow.list( $kw36$PROBLEM_STORE,
              problem_store ) ) )
          {
            final SubLObject inference_static_properties = ConsesLow.list( $kw36$PROBLEM_STORE, problem_store, $kw37$RESULT_UNIQUENESS, $kw76$BINDINGS );
            final SubLObject inference = inference_kernel.new_continuable_inference( antecedent, mt, inference_static_properties );
            final SubLObject inference_dynamic_properties = ConsesLow.list( new SubLObject[] { $kw13$ANSWER_LANGUAGE, $kw77$HL, $kw16$CACHE_INFERENCE_RESULTS_, NIL, $kw18$FORGET_EXTRA_RESULTS_, T, $kw10$MAX_NUMBER,
              ONE_INTEGER, $kw12$MAX_TIME, unsatisfied_cnfs_time_cutoff()
            } );
            if( NIL != inference_datastructures_inference.continuable_inference_p( inference ) )
            {
              thread.resetMultipleValues();
              final SubLObject v_bindings = inference_kernel.continue_inference( inference, inference_dynamic_properties );
              final SubLObject exit_condition = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL == inference_datastructures_enumerated_types.inference_error_suspend_status_p( exit_condition ) && NIL != unsatisfied_cnfs_ok_inference_result_p( v_bindings, exit_condition ) )
              {
                final SubLObject root_mapped_problem = inference_datastructures_inference.inference_root_mapped_problem( inference );
                final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy( inference );
                final SubLObject subproblem_paths = unsatisfied_td_subproblem_paths( root_mapped_problem, strategy );
                final SubLObject contextualized_cnfs = reconstruct_partially_satisfied_el_cnfs_from_td_subpaths( inference, subproblem_paths, consequent, mt );
                inference_datastructures_inference.destroy_inference( inference );
                ans = inference_czer.decontextualize_clauses( filter_unsatisfied_cnfs( contextualized_cnfs, unbound_var_max ), mt );
              }
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list74 );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != new_problem_storeP )
        {
          inference_datastructures_problem_store.destroy_problem_store( problem_store );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 17209L)
  public static SubLObject unsatisfied_cnfs_time_cutoff()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $unsatisfied_cnfs_time_cutoff$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 17382L)
  public static SubLObject unsatisfied_cnf_subbed_rule_formula_from_bindings(final SubLObject rule, final SubLObject hl_bindings, final SubLObject mt)
  {
    SubLObject cnf_copy = conses_high.copy_tree( assertions_high.assertion_cnf( rule ) );
    final SubLObject el_vars = assertions_high.assertion_el_variables( rule );
    SubLObject ans = NIL;
    if( NIL != hl_bindings )
    {
      cnf_copy = bindings.napply_bindings( hl_bindings, cnf_copy );
    }
    ans = uncanonicalizer.cnf_el_formula( cnf_copy, mt, el_vars );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 17802L)
  public static SubLObject unsatisfied_cnf_rejectP(final SubLObject el_implication, final SubLObject mt, final SubLObject inference_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( el_implication, UNPROVIDED );
    SubLObject antecedent = NIL;
    SubLObject consequent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
    antecedent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
    consequent = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject rejectedP = unsatisfied_cnf_reject_knownP( consequent, mt, inference_properties );
      thread.resetMultipleValues();
      final SubLObject cnf = clausifier.cnf_clausal_form( el_implication, mt );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == rejectedP )
      {
        SubLObject csome_list_var = cnf;
        SubLObject clause = NIL;
        clause = csome_list_var.first();
        while ( NIL == rejectedP && NIL != csome_list_var)
        {
          SubLObject open_asents = NIL;
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var = clauses.neg_lits( clause );
          SubLObject lit = NIL;
          lit = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject sense = $kw78$NEG;
            if( NIL == rejectedP )
            {
              if( NIL != term.open_termP( lit, $sym75$EL_VAR_ ) )
              {
                open_asents = ConsesLow.cons( lit, open_asents );
              }
              else
              {
                rejectedP = unsatisfied_cnf_reject_knownP( el_utilities.make_negation( lit ), new_mt, inference_properties );
              }
            }
            index_var = Numbers.add( index_var, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
          }
          index_var = ZERO_INTEGER;
          cdolist_list_var = clauses.pos_lits( clause );
          lit = NIL;
          lit = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject sense = $kw59$POS;
            if( NIL == rejectedP )
            {
              if( NIL != term.open_termP( lit, $sym75$EL_VAR_ ) )
              {
                open_asents = ConsesLow.cons( lit, open_asents );
              }
              else
              {
                rejectedP = unsatisfied_cnf_reject_knownP( el_utilities.make_negation( lit ), new_mt, inference_properties );
              }
            }
            index_var = Numbers.add( index_var, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
          }
          csome_list_var = csome_list_var.rest();
          clause = csome_list_var.first();
        }
      }
      return rejectedP;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list74 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 19363L)
  public static SubLObject unsatisfied_cnf_reject_knownP(final SubLObject el_formula, final SubLObject mt, final SubLObject inference_properties)
  {
    return makeBoolean( NIL != el_utilities.closedP( el_formula, $sym75$EL_VAR_ ) && NIL != inference_kernel.new_cyc_query( el_formula, mt, inference_properties ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 19550L)
  public static SubLObject unsatisfied_cnfs_ok_inference_result_p(final SubLObject v_bindings, final SubLObject exit_condition)
  {
    return makeBoolean( NIL == v_bindings && NIL == inference_datastructures_enumerated_types.inference_error_suspend_status_p( exit_condition ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 19763L)
  public static SubLObject filter_unsatisfied_cnfs(final SubLObject cnfs, final SubLObject unbound_var_max)
  {
    if( !unbound_var_max.isInteger() )
    {
      return cnfs;
    }
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.lengthLE( list_utilities.tree_gather( cnf, $sym75$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED ), unbound_var_max, UNPROVIDED ) )
      {
        ans = ConsesLow.cons( cnf, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 20022L)
  public static SubLObject unsatisfied_td_subproblem_paths(final SubLObject root_mapped_problem, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem( root_mapped_problem );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( root_problem );
        SubLObject basis_object;
        SubLObject state_$23;
        SubLObject link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject mapped_supporting_problem;
        SubLObject supporting_problem;
        SubLObject cdolist_list_var_$24;
        SubLObject subpath;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$23 = NIL, state_$23 = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state_$23 ); state_$23 = set_contents.do_set_contents_update_state( state_$23 ) )
        {
          link = set_contents.do_set_contents_next( basis_object, state_$23 );
          if( NIL != set_contents.do_set_contents_element_validP( state_$23, link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( link, $kw79$SPLIT ) && NIL != partially_satisfied_split_link_p(
              link, strategy ) )
          {
            link_var = link;
            cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link_var );
            mapped_supporting_problem = NIL;
            mapped_supporting_problem = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link_var, mapped_supporting_problem ) )
              {
                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem( mapped_supporting_problem );
                if( NIL == satisfied_problemP( supporting_problem, strategy ) )
                {
                  cdolist_list_var_$24 = unsatisfied_td_subproblem_paths( mapped_supporting_problem, strategy );
                  subpath = NIL;
                  subpath = cdolist_list_var_$24.first();
                  while ( NIL != cdolist_list_var_$24)
                  {
                    ans = ConsesLow.cons( ConsesLow.cons( root_mapped_problem, subpath ), ans );
                    cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                    subpath = cdolist_list_var_$24.first();
                  }
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              mapped_supporting_problem = cdolist_list_var.first();
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    if( NIL == ans )
    {
      ans = ConsesLow.list( ConsesLow.list( root_mapped_problem ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 21053L)
  public static SubLObject satisfied_problemP_internal(final SubLObject problem, final SubLObject strategy)
  {
    if( NIL != inference_worker.good_problem_p( problem, strategy ) )
    {
      return T;
    }
    if( NIL == inference_worker.no_good_problem_p( problem, strategy ) && NIL != inference_worker.potentially_possible_problem_p( problem, strategy ) )
    {
      final SubLObject problem_query = inference_datastructures_problem.problem_query( problem );
      final SubLObject problem_store = inference_datastructures_problem.problem_store( problem );
      final SubLObject v_properties = ConsesLow.list( $kw36$PROBLEM_STORE, problem_store );
      final SubLObject problem_query_formula = inference_czer.problem_query_formula( problem_query );
      final SubLObject recursive_query_result = inference_kernel.new_cyc_query( problem_query_formula, NIL, v_properties );
      return list_utilities.sublisp_boolean( recursive_query_result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 21053L)
  public static SubLObject satisfied_problemP(final SubLObject problem, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return satisfied_problemP_internal( problem, strategy );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym80$SATISFIED_PROBLEM_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym80$SATISFIED_PROBLEM_, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym80$SATISFIED_PROBLEM_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( problem, strategy );
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
        if( problem.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && strategy.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( satisfied_problemP_internal( problem, strategy ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( problem, strategy ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 21684L)
  public static SubLObject partially_satisfied_split_link_p(final SubLObject link, final SubLObject strategy)
  {
    SubLObject found_satisfiedP = NIL;
    SubLObject found_unsatisfiedP = NIL;
    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link );
    SubLObject supporting_mapped_problem = NIL;
    supporting_mapped_problem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link, supporting_mapped_problem ) )
      {
        final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
        if( NIL != satisfied_problemP( supporting_problem, strategy ) )
        {
          found_satisfiedP = T;
        }
        else
        {
          found_unsatisfiedP = T;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      supporting_mapped_problem = cdolist_list_var.first();
    }
    return makeBoolean( NIL != found_satisfiedP && NIL != found_unsatisfiedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 22103L)
  public static SubLObject reconstruct_partially_satisfied_el_cnfs_from_td_subpaths(final SubLObject inference, final SubLObject td_subpaths, final SubLObject consequent, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject antecedent_cnfs = NIL;
    SubLObject ans = NIL;
    thread.resetMultipleValues();
    SubLObject consequent_cnfs = clausifier.cnf_clausal_form( consequent, mt );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    consequent_cnfs = inference_czer.contextualize_clauses( consequent_cnfs, new_mt, UNPROVIDED );
    SubLObject neg_lits = NIL;
    SubLObject pos_lits = NIL;
    SubLObject cdolist_list_var = td_subpaths;
    SubLObject td_subpath = NIL;
    td_subpath = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject bu_subpath = Sequences.nreverse( td_subpath );
      final SubLObject mapped_terminal_problem = bu_subpath.first();
      final SubLObject terminal_problem = inference_datastructures_problem_link.mapped_problem_problem( mapped_terminal_problem );
      SubLObject hl_dnfs = inference_datastructures_problem.problem_query( terminal_problem );
      SubLObject cdolist_list_var_$26 = bu_subpath;
      SubLObject mapped_problem = NIL;
      mapped_problem = cdolist_list_var_$26.first();
      while ( NIL != cdolist_list_var_$26)
      {
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( mapped_problem );
        hl_dnfs = bindings.apply_bindings_backwards( variable_map, hl_dnfs );
        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
        mapped_problem = cdolist_list_var_$26.first();
      }
      SubLObject cdolist_list_var_$27 = hl_dnfs;
      SubLObject hl_dnf = NIL;
      hl_dnf = cdolist_list_var_$27.first();
      while ( NIL != cdolist_list_var_$27)
      {
        neg_lits = ConsesLow.append( neg_lits, clauses.neg_lits( hl_dnf ) );
        pos_lits = ConsesLow.append( pos_lits, clauses.pos_lits( hl_dnf ) );
        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
        hl_dnf = cdolist_list_var_$27.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      td_subpath = cdolist_list_var.first();
    }
    final SubLObject cnf = clauses.make_clause( neg_lits, pos_lits );
    final SubLObject el_bindings = inference_datastructures_inference.inference_el_bindings( inference );
    SubLObject cdolist_list_var2;
    antecedent_cnfs = ( cdolist_list_var2 = ConsesLow.cons( bindings.apply_bindings_backwards( el_bindings, cnf ), antecedent_cnfs ) );
    SubLObject antecedent_cnf = NIL;
    antecedent_cnf = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject antecedent_neg_lits = clauses.neg_lits( antecedent_cnf );
      final SubLObject antecedent_pos_lits = clauses.pos_lits( antecedent_cnf );
      SubLObject cdolist_list_var_$28 = consequent_cnfs;
      SubLObject consequent_cnf = NIL;
      consequent_cnf = cdolist_list_var_$28.first();
      while ( NIL != cdolist_list_var_$28)
      {
        final SubLObject consequent_neg_lits = clauses.neg_lits( consequent_cnf );
        final SubLObject consequent_pos_lits = clauses.pos_lits( consequent_cnf );
        ans = ConsesLow.cons( clauses.make_clause( ConsesLow.append( antecedent_pos_lits, consequent_neg_lits ), ConsesLow.append( antecedent_neg_lits, consequent_pos_lits ) ), ans );
        cdolist_list_var_$28 = cdolist_list_var_$28.rest();
        consequent_cnf = cdolist_list_var_$28.first();
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      antecedent_cnf = cdolist_list_var2.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 23764L)
  public static SubLObject inference_thinking_task_abort(final SubLObject inference, final SubLObject thinking)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != process_utilities.thinking_task_p( thinking ) : thinking;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !inference_datastructures_inference.inference_control_process( inference ).eql( process_utilities.thinking_thread( thinking ) ) )
    {
      Errors.error( $str83$Inference__A_is_not_controlled_by, inference, thinking );
    }
    try
    {
      inference_strategist.inference_abort( inference );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        process_utilities.thinking_stop( thinking );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 24471L)
  public static SubLObject new_continuable_inference_from_problem(final SubLObject problem, SubLObject scoped_vars, SubLObject query_static_properties)
  {
    if( scoped_vars == UNPROVIDED )
    {
      scoped_vars = NIL;
    }
    if( query_static_properties == UNPROVIDED )
    {
      query_static_properties = NIL;
    }
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return new_continuable_inference_from_problem_query( inference_datastructures_problem.problem_query( problem ), scoped_vars, query_static_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 24813L)
  public static SubLObject new_continuable_inference_from_problem_query(final SubLObject query, SubLObject scoped_vars, SubLObject query_static_properties)
  {
    if( scoped_vars == UNPROVIDED )
    {
      scoped_vars = NIL;
    }
    if( query_static_properties == UNPROVIDED )
    {
      query_static_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_problem_query.single_clause_problem_query_p( query ) : query;
    final SubLObject list_var = scoped_vars;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != cycl_variables.cyc_varP( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != inference_datastructures_enumerated_types.query_static_properties_p( query_static_properties ) : query_static_properties;
    thread.resetMultipleValues();
    final SubLObject dnfs = inference_czer.decontextualize_clauses_with_best_mt( query );
    final SubLObject mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    assert NIL != list_utilities.singletonP( dnfs ) : dnfs;
    final SubLObject dnf = dnfs.first();
    return inference_kernel.new_continuable_inference_from_dnf( dnf, mt, scoped_vars, query_static_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 25323L)
  public static SubLObject new_continuable_antecedent_inference(final SubLObject asent, final SubLObject mt, final SubLObject rule, final SubLObject store, final SubLObject query_static_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject consequent_problem = NIL;
    final SubLObject transformation_inference = removal_modules_known_antecedent_rule.removal_known_antecedent_rule_inference( asent, mt, rule, store, $list89 );
    final SubLObject query_dynamic_properties = removal_modules_known_antecedent_rule.removal_known_antecedent_rule_dynamic_properties( asent );
    consequent_problem = inference_datastructures_inference.inference_root_problem( transformation_inference );
    inference_kernel.continue_inference( transformation_inference, query_dynamic_properties );
    inference_datastructures_inference.destroy_inference( transformation_inference );
    final SubLObject antecedent_problem = inference_worker_transformation.transformed_problem_using_rule( consequent_problem, rule );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == antecedent_problem )
    {
      Errors.error( $str90$new_continuable_antecedent_infere, rule, store );
    }
    final SubLObject inference = new_continuable_inference_from_problem( antecedent_problem, NIL, query_static_properties );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 26750L)
  public static SubLObject inference_output_answers_to_file(final SubLObject inference, final SubLObject filename, SubLObject output_format, SubLObject direction, SubLObject xml_spec, SubLObject cycl_prefixP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw91$TAB_DELIMITED;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw92$OUTPUT;
    }
    if( xml_spec == UNPROVIDED )
    {
      xml_spec = NIL;
    }
    if( cycl_prefixP == UNPROVIDED )
    {
      cycl_prefixP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject successP = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, direction );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str94$Unable_to_open__S, filename );
      }
      final SubLObject stream_$29 = stream;
      inference_output_answers( inference, stream_$29, output_format, xml_spec, cycl_prefixP );
      successP = T;
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
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 28783L)
  public static SubLObject inference_output_answers(final SubLObject inference, SubLObject stream, SubLObject output_format, SubLObject xml_spec, SubLObject cycl_prefixP)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( output_format == UNPROVIDED )
    {
      output_format = $kw91$TAB_DELIMITED;
    }
    if( xml_spec == UNPROVIDED )
    {
      xml_spec = NIL;
    }
    if( cycl_prefixP == UNPROVIDED )
    {
      cycl_prefixP = T;
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != streams_high.output_stream_p( stream ) : stream;
    final SubLObject pcase_var = output_format;
    if( pcase_var.eql( $kw91$TAB_DELIMITED ) )
    {
      return inference_output_answers_tab_delimited( inference, stream, cycl_prefixP );
    }
    if( pcase_var.eql( $kw96$XML ) )
    {
      return inference_output_answers_xml( inference, stream, xml_spec, cycl_prefixP );
    }
    if( pcase_var.eql( $kw97$ALCHEMY ) )
    {
      return alchemy_export.inference_output_answers_alchemy( inference, stream );
    }
    return Errors.error( $str98$Output_format__S_is_not_supported );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 29680L)
  public static SubLObject inference_output_answers_tab_delimited(final SubLObject inference, final SubLObject stream, final SubLObject cycl_prefixP)
  {
    SubLObject cdolist_list_var;
    final SubLObject free_el_vars = cdolist_list_var = inference_datastructures_inference.inference_free_el_vars( inference );
    SubLObject el_var = NIL;
    el_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str99$_A_C, el_var, Characters.CHAR_tab );
      cdolist_list_var = cdolist_list_var.rest();
      el_var = cdolist_list_var.first();
    }
    PrintLow.format( stream, $str100$__ );
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$30 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$30, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$30 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject el_bindings;
        SubLObject cdolist_list_var2;
        SubLObject el_var2;
        SubLObject value;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            el_bindings = inference_kernel.inference_answer_el_bindings( v_answer );
            cdolist_list_var2 = free_el_vars;
            el_var2 = NIL;
            el_var2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              value = format_nil.format_nil_s( bindings.variable_lookup( el_var2, el_bindings ) );
              if( NIL == cycl_prefixP )
              {
                value = string_utilities.remove_substring( value, $str101$__ );
              }
              PrintLow.format( stream, $str99$_A_C, value, Characters.CHAR_tab );
              cdolist_list_var2 = cdolist_list_var2.rest();
              el_var2 = cdolist_list_var2.first();
            }
            PrintLow.format( stream, $str100$__ );
          }
        }
      }
      final SubLObject idx_$31 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$31 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$31 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject el_bindings2 = inference_kernel.inference_answer_el_bindings( v_answer2 );
            SubLObject cdolist_list_var3 = free_el_vars;
            SubLObject el_var3 = NIL;
            el_var3 = cdolist_list_var3.first();
            while ( NIL != cdolist_list_var3)
            {
              SubLObject value2 = format_nil.format_nil_s( bindings.variable_lookup( el_var3, el_bindings2 ) );
              if( NIL == cycl_prefixP )
              {
                value2 = string_utilities.remove_substring( value2, $str101$__ );
              }
              PrintLow.format( stream, $str99$_A_C, value2, Characters.CHAR_tab );
              cdolist_list_var3 = cdolist_list_var3.rest();
              el_var3 = cdolist_list_var3.first();
            }
            PrintLow.format( stream, $str100$__ );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 30343L)
  public static SubLObject inference_output_answers_xml(final SubLObject inference, final SubLObject stream, final SubLObject xml_spec, final SubLObject cycl_prefixP)
  {
    final SubLObject free_el_vars = inference_datastructures_inference.inference_free_el_vars( inference );
    final SubLObject xml_spec_used = ( NIL != xml_spec ) ? xml_spec : xml_utilities.get_default_xml_spec_for_el_vars( free_el_vars );
    SubLObject el_bindings = NIL;
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$32 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$32, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$32 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject item_var;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            item_var = inference_kernel.inference_answer_el_bindings( v_answer );
            if( NIL == conses_high.member( item_var, el_bindings, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              el_bindings = ConsesLow.cons( item_var, el_bindings );
            }
          }
        }
      }
      final SubLObject idx_$33 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$33 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$33 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject item_var2 = inference_kernel.inference_answer_el_bindings( v_answer2 );
            if( NIL == conses_high.member( item_var2, el_bindings, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              el_bindings = ConsesLow.cons( item_var2, el_bindings );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return xml_utilities.query_bindings_to_xml_stream( el_bindings, xml_spec_used, TWO_INTEGER, stream, cycl_prefixP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 31023L)
  public static SubLObject answerability_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $answerability_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 31177L)
  public static SubLObject query_answerability_status(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject status = query_answerability_status_int( sentence, mt, query_properties );
    if( status == $kw103$NON_TRIVIAL )
    {
      return $kw104$UNKNOWN;
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 31522L)
  public static SubLObject query_answerability_status_int(final SubLObject sentence, final SubLObject mt, SubLObject query_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    query_properties = conses_high.copy_list( query_properties );
    query_properties = conses_high.putf( query_properties, $kw10$MAX_NUMBER, ONE_INTEGER );
    query_properties = conses_high.remf( query_properties, $kw17$CONTINUABLE_ );
    query_properties = conses_high.remf( query_properties, $kw105$MAINTAIN_TERM_WORKING_SET_ );
    thread.resetMultipleValues();
    final SubLObject result = inference_trivial.new_cyc_trivial_query( sentence, mt, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return $kw106$ANSWERABLE;
    }
    if( $kw107$EXHAUST_TOTAL == halt_reason )
    {
      return $kw108$UNANSWERABLE;
    }
    if( $kw103$NON_TRIVIAL == halt_reason )
    {
      return $kw103$NON_TRIVIAL;
    }
    return $kw104$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 32192L)
  public static SubLObject query_literal_answerability_status(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_tuples = NIL;
    thread.resetMultipleValues();
    final SubLObject dnf_clauses = clausifier.dnf_clausal_form( sentence, mt );
    final SubLObject dnf_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result_tuples = query_literal_independent_answerability_status( dnf_clauses, dnf_mt, query_properties );
    result_tuples = refine_query_literal_answerability_status( result_tuples, dnf_clauses, dnf_mt );
    return result_tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 32782L)
  public static SubLObject query_literal_independent_answerability_status(final SubLObject dnf_clauses, final SubLObject dnf_mt, final SubLObject query_properties)
  {
    SubLObject result_tuples = NIL;
    SubLObject cdolist_list_var = dnf_clauses;
    SubLObject dnf_clause = NIL;
    dnf_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$34 = clauses.neg_lits( dnf_clause );
      SubLObject asent = NIL;
      asent = cdolist_list_var_$34.first();
      while ( NIL != cdolist_list_var_$34)
      {
        final SubLObject sense = $kw78$NEG;
        final SubLObject literal = el_utilities.asent_and_sense_to_literal( asent, sense );
        final SubLObject answerability_status = query_answerability_status( literal, dnf_mt, query_properties );
        result_tuples = ConsesLow.cons( ConsesLow.list( literal, answerability_status ), result_tuples );
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
        asent = cdolist_list_var_$34.first();
      }
      index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$35 = clauses.pos_lits( dnf_clause );
      asent = NIL;
      asent = cdolist_list_var_$35.first();
      while ( NIL != cdolist_list_var_$35)
      {
        final SubLObject sense = $kw59$POS;
        final SubLObject literal = el_utilities.asent_and_sense_to_literal( asent, sense );
        final SubLObject answerability_status = query_answerability_status( literal, dnf_mt, query_properties );
        result_tuples = ConsesLow.cons( ConsesLow.list( literal, answerability_status ), result_tuples );
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
        asent = cdolist_list_var_$35.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      dnf_clause = cdolist_list_var.first();
    }
    return Sequences.nreverse( result_tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 33433L)
  public static SubLObject refine_query_literal_answerability_status(final SubLObject result_tuples, final SubLObject dnf_clauses, final SubLObject dnf_mt)
  {
    SubLObject new_result_tuples = NIL;
    SubLObject cdolist_list_var = result_tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject literal = NIL;
      SubLObject answerability_status = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
      literal = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
      answerability_status = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( answerability_status == $kw108$UNANSWERABLE )
        {
          SubLObject shared_vars = NIL;
          final SubLObject literal_vars = list_utilities.tree_gather( literal, $sym75$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject asent = el_utilities.literal_atomic_sentence( literal );
          final SubLObject sense = el_utilities.literal_sense( literal );
          final SubLObject other_lits = other_independently_answerable_lits( dnf_clauses, result_tuples, asent, sense );
          SubLObject cdolist_list_var_$36 = literal_vars;
          SubLObject var = NIL;
          var = cdolist_list_var_$36.first();
          while ( NIL != cdolist_list_var_$36)
          {
            if( NIL != list_utilities.tree_find( var, other_lits, UNPROVIDED, UNPROVIDED ) )
            {
              shared_vars = ConsesLow.cons( var, shared_vars );
            }
            cdolist_list_var_$36 = cdolist_list_var_$36.rest();
            var = cdolist_list_var_$36.first();
          }
          if( NIL != shared_vars )
          {
            final SubLObject pcase_var;
            final SubLObject preference_level = pcase_var = preference_modules.el_literal_preference_level_wrt_modules( asent, sense, shared_vars, dnf_mt );
            if( !pcase_var.eql( $kw111$PREFERRED ) )
            {
              if( pcase_var.eql( $kw112$DISPREFERRED ) )
              {
                tuple = ConsesLow.list( literal, $kw104$UNKNOWN );
              }
              else if( pcase_var.eql( $kw113$GROSSLY_DISPREFERRED ) || pcase_var.eql( $kw114$DISALLOWED ) || pcase_var.eql( $kw115$DOOMED ) )
              {
                tuple = ConsesLow.list( literal, $kw106$ANSWERABLE );
              }
              else
              {
                Errors.error( $str116$unexpected_preference_level__s, preference_level );
              }
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list110 );
      }
      new_result_tuples = ConsesLow.cons( tuple, new_result_tuples );
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_result_tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 34891L)
  public static SubLObject other_independently_answerable_lits(final SubLObject dnf_clauses, final SubLObject result_tuples, final SubLObject asent, final SubLObject sense)
  {
    SubLObject other_lits = NIL;
    SubLObject cdolist_list_var = dnf_clauses;
    SubLObject dnf_clause = NIL;
    dnf_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$37 = clauses.neg_lits( dnf_clause );
      SubLObject other_asent = NIL;
      other_asent = cdolist_list_var_$37.first();
      while ( NIL != cdolist_list_var_$37)
      {
        final SubLObject other_sense = $kw78$NEG;
        if( !asent.equal( other_asent ) || !sense.equal( other_sense ) )
        {
          final SubLObject other_literal = el_utilities.asent_and_sense_to_literal( other_asent, other_sense );
          final SubLObject answerability_list = list_utilities.alist_lookup( result_tuples, other_literal, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          final SubLObject answerability = answerability_list.first();
          if( $kw106$ANSWERABLE == answerability )
          {
            other_lits = ConsesLow.cons( other_literal, other_lits );
          }
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
        other_asent = cdolist_list_var_$37.first();
      }
      index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$38 = clauses.pos_lits( dnf_clause );
      other_asent = NIL;
      other_asent = cdolist_list_var_$38.first();
      while ( NIL != cdolist_list_var_$38)
      {
        final SubLObject other_sense = $kw59$POS;
        if( !asent.equal( other_asent ) || !sense.equal( other_sense ) )
        {
          final SubLObject other_literal = el_utilities.asent_and_sense_to_literal( other_asent, other_sense );
          final SubLObject answerability_list = list_utilities.alist_lookup( result_tuples, other_literal, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          final SubLObject answerability = answerability_list.first();
          if( $kw106$ANSWERABLE == answerability )
          {
            other_lits = ConsesLow.cons( other_literal, other_lits );
          }
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
        other_asent = cdolist_list_var_$38.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      dnf_clause = cdolist_list_var.first();
    }
    return Sequences.nreverse( other_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 35612L)
  public static SubLObject query_term_substitution_answerability_status(final SubLObject terms, final SubLObject token, final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    SubLObject result_tuples = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject substituted_sentence = cycl_utilities.expression_subst( v_term, token, sentence, UNPROVIDED, UNPROVIDED );
      final SubLObject answerability_status = query_answerability_status( substituted_sentence, mt, query_properties );
      result_tuples = ConsesLow.cons( ConsesLow.list( v_term, answerability_status ), result_tuples );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( result_tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 36351L)
  public static SubLObject query_term_arg_position_answerability_status(final SubLObject terms, final SubLObject arg_position, final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject token = cycl_utilities.formula_arg_position( sentence, arg_position, UNPROVIDED );
    return query_term_substitution_answerability_status( terms, token, sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 36722L)
  public static SubLObject query_literal_answerability_status_asynch(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLObject unwrapped_sentence = el_utilities.el_remove_outermost_existentials( sentence );
    if( NIL != el_utilities.el_conjunction_p( unwrapped_sentence ) )
    {
      query_literal_set_answerability_status_via_callback( cycl_utilities.formula_args( unwrapped_sentence, UNPROVIDED ), make_callback( Symbols.symbol_function( $sym119$HANDLE_ANSWERABILITY_RESULT_TUPLE ), UNPROVIDED ),
          mt, query_properties, T );
    }
    else
    {
      query_literal_set_answerability_status_via_callback( Mapping.mapcan( $sym120$DNF_LITERALS, clausifier.dnf_clausal_form( unwrapped_sentence, mt ), EMPTY_SUBL_OBJECT_ARRAY ), make_callback( Symbols.symbol_function(
          $sym119$HANDLE_ANSWERABILITY_RESULT_TUPLE ), UNPROVIDED ), mt, query_properties, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 37479L)
  public static SubLObject query_literal_set_answerability_status_via_callback(final SubLObject literals, final SubLObject callback, SubLObject mt, SubLObject query_properties, SubLObject conjunctionsP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    if( conjunctionsP == UNPROVIDED )
    {
      conjunctionsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( literals ) : literals;
    assert NIL != callback_p( callback ) : callback;
    assert NIL != Types.booleanp( conjunctionsP ) : conjunctionsP;
    query_properties = conses_high.copy_list( query_properties );
    SubLObject unknown_count = Sequences.length( literals );
    SubLObject unknowns = set_utilities.construct_set_contents_from_list( literals, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject still_unknowns = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQUAL ) );
    final SubLObject global_timeout = conses_high.getf( query_properties, $kw12$MAX_TIME, NIL );
    SubLObject iterative_timeout = $float125$0_01;
    SubLObject timed_out = NIL;
    final SubLObject total_time = NIL;
    SubLObject result_tuples = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
    try
    {
      thread.throwStack.push( tag );
      final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
      try
      {
        subl_macro_promotions.$within_with_timeout$.bind( T, thread );
        SubLObject timer = NIL;
        try
        {
          final SubLObject _prev_bind_0_$39 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( global_timeout, tag );
            while ( NIL == set_contents.set_contents_emptyP( unknowns ))
            {
              query_properties = conses_high.putf( query_properties, $kw12$MAX_TIME, iterative_timeout );
              final SubLObject set_contents_var = unknowns;
              SubLObject basis_object;
              SubLObject state;
              SubLObject literal;
              SubLObject status;
              SubLObject dwimmed_status;
              SubLObject result;
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                literal = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, literal ) )
                {
                  status = query_answerability_status_int( literal, mt, query_properties );
                  if( status == $kw104$UNKNOWN )
                  {
                    still_unknowns = set_contents.set_contents_add( literal, still_unknowns, Symbols.symbol_function( EQUAL ) );
                  }
                  else
                  {
                    dwimmed_status = ( status == $kw103$NON_TRIVIAL ) ? $kw104$UNKNOWN : status;
                    result = ConsesLow.list( literal, dwimmed_status );
                    result_tuples = ConsesLow.cons( result, result_tuples );
                    invoke_callback( callback, result );
                    unknown_count = Numbers.subtract( unknown_count, ONE_INTEGER );
                  }
                }
              }
              iterative_timeout = Numbers.multiply( TEN_INTEGER, iterative_timeout );
              unknowns = still_unknowns;
              still_unknowns = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQUAL ) );
            }
            if( NIL != conjunctionsP )
            {
              thread.resetMultipleValues();
              final SubLObject dnf_clauses = clausifier.dnf_clausal_form( simplifier.conjoin( literals, UNPROVIDED ), mt );
              final SubLObject dnf_mt = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject cdolist_list_var;
              final SubLObject refined_result_tuples = cdolist_list_var = refine_query_literal_answerability_status( result_tuples, dnf_clauses, dnf_mt );
              SubLObject refined_result_tuple = NIL;
              refined_result_tuple = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = refined_result_tuple;
                SubLObject lit = NIL;
                SubLObject new_status = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
                lit = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
                new_status = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  final SubLObject old_status = list_utilities.alist_lookup( result_tuples, lit, Symbols.symbol_function( EQUAL ), NIL ).first();
                  if( NIL != old_status && !old_status.eql( new_status ) )
                  {
                    invoke_callback( callback, refined_result_tuple );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list126 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                refined_result_tuple = cdolist_list_var.first();
              }
            }
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$39, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
          }
        }
      }
      finally
      {
        subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      timed_out = Errors.handleThrowable( ccatch_env_var, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( total_time, timed_out, set_contents.set_contents_size( unknowns ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 39874L)
  public static SubLObject handle_answerability_result_tuple(final SubLObject literal, final SubLObject status)
  {
    if( NIL != task_processor.task_process_pool_p( task_processor.get_task_process_pool_for_process( Threads.current_process() ) ) )
    {
      task_processor.post_task_info_processor_partial_results( ConsesLow.list( literal, status ) );
    }
    return print_high.print( ConsesLow.list( literal, status ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 40155L)
  public static SubLObject callback_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && v_object.first().isFunctionSpec() && conses_high.second( v_object ).isList() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 40393L)
  public static SubLObject make_callback(final SubLObject method, SubLObject data)
  {
    if( data == UNPROVIDED )
    {
      data = NIL;
    }
    assert NIL != Types.function_spec_p( method ) : method;
    assert NIL != Types.listp( data ) : data;
    return ConsesLow.list( method, data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 40541L)
  public static SubLObject invoke_callback(final SubLObject callback, SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    assert NIL != callback_p( callback ) : callback;
    final SubLObject method = callback_method( callback );
    final SubLObject callback_data = callback_data( callback );
    return Functions.apply( method, ConsesLow.append( args, callback_data ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 40787L)
  public static SubLObject callback_method(final SubLObject callback)
  {
    return callback.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 40868L)
  public static SubLObject callback_data(final SubLObject callback)
  {
    return conses_high.second( callback );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 40936L)
  public static SubLObject inference_answer_argument_strength(final SubLObject inference_answer)
  {
    SubLObject max_strength = ZERO_INTEGER;
    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( inference_answer );
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject just_strength = hl_justification_strength( inference_datastructures_inference.inference_answer_justification_supports( just ) );
      max_strength = Numbers.max( max_strength, just_strength );
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return max_strength;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 41758L)
  public static SubLObject hl_justification_strength(final SubLObject hl_justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject strength = ONE_INTEGER;
    SubLObject strength_reasons = NIL;
    final SubLObject hypothetical_mt_supports = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = hl_supports.hl_justification_expand( hl_justification );
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mt = arguments.support_mt( support );
      if( NIL != hlmt.hlmt_p( mt ) && ( NIL == arguments.hl_support_p( support ) || NIL != $count_hl_supports_in_hypothetical_contextsP$.getDynamicValue( thread ) ) && ( NIL == assertion_handles.assertion_p( support )
          || NIL != assertions_high.asserted_assertionP( support ) || NIL != $count_deduced_assertions_in_hypothetical_contextsP$.getDynamicValue( thread ) ) && NIL != isa.isaP( hlmt.hlmt_monad_mt( mt ),
              $const129$HypotheticalContext, UNPROVIDED, UNPROVIDED ) )
      {
        set.set_add( support, hypothetical_mt_supports );
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    if( NIL == set.set_emptyP( hypothetical_mt_supports ) )
    {
      final SubLObject hypothetical_mt_support_count = set.set_size( hypothetical_mt_supports );
      strength = Numbers.add( strength, hypothetical_mt_support_count );
      strength_reasons = ConsesLow.cons( ConsesLow.list( $kw130$HYPOTHETICAL_MT_SUPPORT_COUNT, hypothetical_mt_support_count ), strength_reasons );
    }
    return Values.values( strength, Sequences.nreverse( strength_reasons ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 42856L)
  public static SubLObject inference_expanded_justification(final SubLObject inference)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    SubLObject support_set = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQUAL ) );
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$41 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$41, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$41 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject set_contents_var;
        SubLObject sub_supports;
        SubLObject basis_object;
        SubLObject state;
        SubLObject support;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw63$SKIP;
            }
            sub_supports = ( set_contents_var = inference_answer_expanded_justification_guts( v_answer ) );
            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
            {
              support = set_contents.do_set_contents_next( basis_object, state );
              if( NIL != set_contents.do_set_contents_element_validP( state, support ) )
              {
                support_set = set_contents.set_contents_add( support, support_set, Symbols.symbol_function( EQUAL ) );
              }
            }
          }
        }
      }
      final SubLObject idx_$42 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$42 ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$42 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$42 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$42 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw63$SKIP ) ) ? NIL : $kw63$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject v_answer2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) || NIL == id_index.id_index_tombstone_p( v_answer2 ) )
          {
            final SubLObject set_contents_var2;
            final SubLObject sub_supports2 = set_contents_var2 = inference_answer_expanded_justification_guts( v_answer2 );
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject support2;
            for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2, set_contents_var2 ); NIL == set_contents
                .do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
            {
              support2 = set_contents.do_set_contents_next( basis_object2, state2 );
              if( NIL != set_contents.do_set_contents_element_validP( state2, support2 ) )
              {
                support_set = set_contents.set_contents_add( support2, support_set, Symbols.symbol_function( EQUAL ) );
              }
            }
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return arguments.sort_supports( set_contents.set_contents_element_list( support_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 43514L)
  public static SubLObject inference_answer_expanded_justification(final SubLObject v_answer)
  {
    assert NIL != inference_datastructures_inference.inference_answer_p( v_answer ) : v_answer;
    final SubLObject support_set = inference_answer_expanded_justification_guts( v_answer );
    return arguments.sort_supports( set_contents.set_contents_element_list( support_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 43844L)
  public static SubLObject inference_answer_completely_expanded_justification(final SubLObject v_answer)
  {
    assert NIL != inference_datastructures_inference.inference_answer_p( v_answer ) : v_answer;
    final SubLObject support_set = inference_answer_expanded_justification_guts( v_answer );
    return arguments.sort_supports( hl_supports.hl_justification_complete_backward_theory( set_contents.set_contents_element_list( support_set ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 44267L)
  public static SubLObject inference_answer_expanded_justification_guts(final SubLObject v_answer)
  {
    SubLObject support_set = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQUAL ) );
    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
    SubLObject inf_just = NIL;
    inf_just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_contents_var;
      final SubLObject sub_supports = set_contents_var = inference_answer_justification_expanded_supports_guts( inf_just );
      SubLObject basis_object;
      SubLObject state;
      SubLObject support;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        support = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, support ) )
        {
          support_set = set_contents.set_contents_add( support, support_set, Symbols.symbol_function( EQUAL ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      inf_just = cdolist_list_var.first();
    }
    return support_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 44695L)
  public static SubLObject inference_answer_justification_expanded_supports_guts(final SubLObject inf_just)
  {
    final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports( inf_just );
    final SubLObject expanded_justification = hl_supports.hl_justification_expand( supports );
    return expanded_justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 44946L)
  public static SubLObject cycl_term_for_problem_store(SubLObject problem_store)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = inference_datastructures_problem_store.most_recent_problem_store();
    }
    assert NIL != inference_datastructures_problem_store.problem_store_p( problem_store ) : problem_store;
    final SubLObject image = cycl_term_for_image();
    return ( NIL != image ) ? czer_main.canonicalize_term( el_utilities.make_binary_formula( $const133$AbsoluteCycProblemStoreFn, image, inference_datastructures_problem_store.problem_store_suid( problem_store ) ),
        UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 45385L)
  public static SubLObject cycl_term_for_inference(SubLObject inference)
  {
    if( inference == UNPROVIDED )
    {
      inference = latest_inference();
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject problem_store = cycl_term_for_problem_store( inference_datastructures_inference.inference_problem_store( inference ) );
    return ( NIL != problem_store ) ? czer_main.canonicalize_term( el_utilities.make_binary_formula( $const134$CycInferenceFn, inference_datastructures_inference.inference_suid( inference ), problem_store ), UNPROVIDED )
        : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 45828L)
  public static SubLObject cycl_term_for_machine(SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    final SubLObject machine_name = Environment.get_machine_name( UNPROVIDED );
    final SubLObject v_term = lexicon_accessors.typed_denots_of_string( machine_name, $const135$Computer, NIL, $kw136$DENOT, NIL, NIL, $const137$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
    if( NIL != warnP && NIL == cycl_grammar.cycl_denotational_term_p( v_term ) )
    {
      Errors.warn( $str138$Couldn_t_find_a_term_representing, machine_name );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 46474L)
  public static SubLObject ensure_term_for_machine(final SubLObject mt, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject term_for_machine = cycl_term_for_machine( NIL );
    if( NIL == cycl_grammar.cycl_denotational_term_p( term_for_machine ) )
    {
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( NIL, thread );
        operation_communication.set_the_cyclist( cyclist );
        final SubLObject machine_name = Environment.get_machine_name( UNPROVIDED );
        final SubLObject term_name = string_utilities.make_valid_constant_name( machine_name, T );
        term_for_machine = ke.ke_create_now( term_name, UNPROVIDED );
        ke.ke_assert_now( ConsesLow.listS( $const139$isa, term_for_machine, $list140 ), mt, UNPROVIDED, UNPROVIDED );
        ke.ke_assert_now( ConsesLow.list( $const141$nameString, term_for_machine, machine_name ), mt, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
    }
    return term_for_machine;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 47109L)
  public static SubLObject cycl_term_for_image()
  {
    final SubLObject machine = cycl_term_for_machine( UNPROVIDED );
    return ( NIL != machine ) ? czer_main.canonicalize_term( el_utilities.make_binary_formula( $const142$CycImageFn, machine, control_vars.cyc_image_id() ), UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 47417L)
  public static SubLObject assert_problem_store_data(SubLObject problem_store, SubLObject monad_mt, SubLObject cyclist)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = inference_datastructures_problem_store.most_recent_problem_store();
    }
    if( monad_mt == UNPROVIDED )
    {
      monad_mt = $const143$BaseKB;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_problem_store.problem_store_p( problem_store ) : problem_store;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( NIL, thread );
      operation_communication.set_the_cyclist( cyclist );
      final SubLObject problem_store_term = cycl_term_for_problem_store( problem_store );
      final SubLObject mt = hlmt_czer.canonicalize_hlmt( ConsesLow.list( $const144$MtSpace, monad_mt, ConsesLow.list( $const145$MtTimeDimFn, date_utilities.indexical_now() ) ) );
      if( NIL != cycl_grammar.cycl_denotational_term_p( problem_store_term ) )
      {
        ke.ke_assert( ConsesLow.list( $const146$cycProblemStoreLinkCount, problem_store_term, inference_datastructures_problem_store.problem_store_link_count( problem_store ) ), mt, UNPROVIDED, UNPROVIDED );
        ke.ke_assert( ConsesLow.list( $const147$cycProblemStoreProblemCount, problem_store_term, inference_datastructures_problem_store.problem_store_problem_count( problem_store ) ), mt, UNPROVIDED, UNPROVIDED );
        ke.ke_assert( ConsesLow.list( $const148$cycProblemStoreProofCount, problem_store_term, inference_datastructures_problem_store.problem_store_proof_count( problem_store ) ), mt, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 47417L)
  public static SubLObject assert_inference_data(SubLObject inference, SubLObject monad_mt, SubLObject cyclist)
  {
    if( inference == UNPROVIDED )
    {
      inference = latest_inference();
    }
    if( monad_mt == UNPROVIDED )
    {
      monad_mt = $const143$BaseKB;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( NIL, thread );
      operation_communication.set_the_cyclist( cyclist );
      final SubLObject inference_term = cycl_term_for_inference( inference );
      final SubLObject mt = hlmt_czer.canonicalize_hlmt( ConsesLow.list( $const144$MtSpace, monad_mt, ConsesLow.list( $const145$MtTimeDimFn, date_utilities.indexical_now() ) ) );
      assert NIL != cycl_grammar.cycl_denotational_term_p( inference_term ) : inference_term;
      final SubLObject start_time = date_utilities.universal_time_to_cycl_date( inference_datastructures_inference.inference_start_universal_time( inference ) );
      ke.ke_assert_now( ConsesLow.list( $const150$inferenceStartTime, inference_term, start_time ), $const143$BaseKB, UNPROVIDED, UNPROVIDED );
      if( NIL != inference_datastructures_inference.inference_has_some_answerP( inference ) )
      {
        final SubLObject time_to_first_answer = ConsesLow.list( $const151$SecondsDuration, inference_datastructures_inference.inference_first_answer_elapsed_time( inference ) );
        final SubLObject time_to_last_answer = ConsesLow.list( $const151$SecondsDuration, inference_datastructures_inference.inference_last_answer_elapsed_time( inference ) );
        ke.ke_assert_now( ConsesLow.list( $const152$inferenceTimeToFirstAnswer, inference_term, time_to_first_answer ), $const143$BaseKB, UNPROVIDED, UNPROVIDED );
        ke.ke_assert_now( ConsesLow.list( $const153$inferenceTimeToLastAnswer, inference_term, time_to_last_answer ), mt, UNPROVIDED, UNPROVIDED );
      }
      assert_inference_bindings( inference, inference_term, mt );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 49536L)
  public static SubLObject assert_inference_bindings(final SubLObject inference, final SubLObject inference_term, final SubLObject mt)
  {
    final SubLObject answer_count = inference_datastructures_inference.inference_answer_count( inference );
    if( ZERO_INTEGER.eql( answer_count ) || answer_count.numG( TEN_INTEGER ) )
    {
      ke.ke_assert_now( ConsesLow.list( $const154$inferenceAnswerCount, inference_term, answer_count ), mt, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      SubLObject binding_sets = NIL;
      final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
      {
        final SubLObject idx_$43 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$43, $kw63$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$43 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject inference_answer;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            inference_answer = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( inference_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( inference_answer ) )
              {
                inference_answer = $kw63$SKIP;
              }
              binding_sets = ConsesLow.cons( inference_datastructures_inference.inference_answer_bindings( inference_answer ), binding_sets );
            }
          }
        }
        final SubLObject idx_$44 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$44 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$44 );
          SubLObject id2 = NIL;
          SubLObject inference_answer2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              inference_answer2 = Hashtables.getEntryValue( cdohash_entry );
              binding_sets = ConsesLow.cons( inference_datastructures_inference.inference_answer_bindings( inference_answer2 ), binding_sets );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      ke.ke_assert_now( ConsesLow.list( $const155$inferenceBindings, inference_term, bindings.kbify_inference_set_of_binding_sets( binding_sets ) ), mt, UNPROVIDED, UNPROVIDED );
    }
    return inference_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 50125L)
  public static SubLObject latest_inference()
  {
    final SubLObject latest_store = inference_datastructures_problem_store.most_recent_problem_store();
    if( NIL != latest_store )
    {
      return inference_datastructures_problem_store.latest_problem_store_inference( latest_store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 50317L)
  public static SubLObject query_literal_removal_cost(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.atomic_sentenceP( literal ) : literal;
    final SubLObject allowed_modules_spec = conses_high.getf( query_properties, $kw31$ALLOWED_MODULES, $kw4$ALL );
    SubLObject hl_literal = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      hl_literal = cycl_utilities.expression_sublis_hl_variables( verbosifier.el_relations_out( literal, mt, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return query_literal_removal_cost_internal( hl_literal, sense, mt, allowed_modules_spec, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 50959L)
  public static SubLObject query_literal_removal_cost_internal(final SubLObject hl_literal, final SubLObject sense, final SubLObject mt, final SubLObject allowed_modules_spec, SubLObject seen)
  {
    if( seen == UNPROVIDED )
    {
      seen = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cost = ZERO_INTEGER;
    if( NIL == set.set_memberP( hl_literal, seen ) )
    {
      set.set_add( hl_literal, seen );
      SubLObject rewritten_literals = NIL;
      final SubLObject arg0 = el_utilities.literal_arg0( hl_literal, UNPROVIDED );
      cost = literal_removal_cost( hl_literal, sense, mt, allowed_modules_spec );
      if( NIL != kb_indexing_datastructures.indexed_term_p( arg0 ) )
      {
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          final SubLObject pred_var = $const158$bridgingPredicateForPredicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg0, TWO_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg0, TWO_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw159$GAF, NIL, NIL );
                  SubLObject done_var_$45 = NIL;
                  final SubLObject token_var_$46 = NIL;
                  while ( NIL == done_var_$45)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$46 );
                    final SubLObject valid_$47 = makeBoolean( !token_var_$46.eql( gaf ) );
                    if( NIL != valid_$47 )
                    {
                      final SubLObject bridging_pred = assertions_high.gaf_arg1( gaf );
                      final SubLObject el_arg_pos_map = assertions_high.gaf_arg3( gaf );
                      final SubLObject bridged_args = ConsesLow.make_list( arity.min_arity( bridging_pred ), NIL );
                      SubLObject bridged_literal = el_utilities.make_formula( bridging_pred, bridged_args, UNPROVIDED );
                      SubLObject cdolist_list_var = el_utilities.el_set_items( el_arg_pos_map );
                      SubLObject arg_pos_pair = NIL;
                      arg_pos_pair = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        SubLObject current;
                        final SubLObject datum = current = el_utilities.el_list_items( arg_pos_pair );
                        SubLObject bridging_argnum = NIL;
                        SubLObject argnum = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list160 );
                        bridging_argnum = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list160 );
                        argnum = current.first();
                        current = current.rest();
                        if( NIL == current )
                        {
                          bridged_literal = el_utilities.nreplace_formula_arg( bridging_argnum, el_utilities.literal_arg( hl_literal, argnum, UNPROVIDED ), bridged_literal );
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum, $list160 );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg_pos_pair = cdolist_list_var.first();
                      }
                      if( NIL == cycl_utilities.expression_find( NIL, bridged_literal, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                      {
                        final SubLObject item_var = bridged_literal;
                        if( NIL == conses_high.member( item_var, rewritten_literals, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          rewritten_literals = ConsesLow.cons( item_var, rewritten_literals );
                        }
                      }
                    }
                    done_var_$45 = makeBoolean( NIL == valid_$47 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( hl_literal, $list161 );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject col = list_utilities.alist_lookup_without_values( v_bindings, $sym162$COL, UNPROVIDED, UNPROVIDED );
        final SubLObject arg2 = list_utilities.alist_lookup_without_values( v_bindings, $sym163$ARG1, UNPROVIDED, UNPROVIDED );
        final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
          SubLObject node_var = col;
          final SubLObject deck_type = $kw166$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$51 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym167$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw168$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str169$_A_is_not_a__A, tv_var, $sym170$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw171$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str172$continue_anyway, $str169$_A_is_not_a__A, tv_var, $sym170$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw173$WARN ) )
                  {
                    Errors.warn( $str169$_A_is_not_a__A, tv_var, $sym170$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str174$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str172$continue_anyway, $str169$_A_is_not_a__A, tv_var, $sym170$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$54 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_8 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const175$genls ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const175$genls ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const175$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const175$genls ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$53 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$55 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const175$genls ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                      while ( NIL != node_var)
                      {
                        final SubLObject spec = node_var;
                        if( NIL != collection_has_rdf_type_cardinality_estimateP( spec ) )
                        {
                          final SubLObject item_var2 = el_utilities.make_binary_formula( $const176$rdf_type, arg2, spec );
                          if( NIL == conses_high.member( item_var2, rewritten_literals, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                          {
                            rewritten_literals = ConsesLow.cons( item_var2, rewritten_literals );
                          }
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const175$genls ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$60 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$60 ) )
                                    {
                                      final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$60, thread );
                                        SubLObject iteration_state_$62;
                                        for( iteration_state_$62 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$62 ); iteration_state_$62 = dictionary_contents.do_dictionary_contents_next( iteration_state_$62 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$62 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str177$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$55, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$62 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$54, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str178$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$64;
                              final SubLObject new_list = cdolist_list_var_$64 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$64.first();
                              while ( NIL != cdolist_list_var_$64)
                              {
                                final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var2 = sol2;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str177$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$56, thread );
                                }
                                cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                                generating_fn = cdolist_list_var_$64.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$54, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$53, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var = cdolist_list_var2.first();
                        }
                        node_var = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$55, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$53, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$52, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str179$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_8, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_7, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$54, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$52, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$51, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$51, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$50, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$49, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        }
      }
      SubLObject cdolist_list_var3 = rewritten_literals;
      SubLObject rewritten_literal = NIL;
      rewritten_literal = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        cost = Numbers.add( cost, query_literal_removal_cost_internal( rewritten_literal, sense, mt, allowed_modules_spec, seen ) );
        cdolist_list_var3 = cdolist_list_var3.rest();
        rewritten_literal = cdolist_list_var3.first();
      }
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 52600L)
  public static SubLObject collection_has_rdf_type_cardinality_estimateP(final SubLObject spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject foundP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym180$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const181$EverythingPSC, thread );
      SubLObject ls = NIL;
      final SubLObject pred_var = $const182$logicalResultSetCardinalityWRTVal;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( spec, FIVE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( spec, FIVE_INTEGER, pred_var );
        SubLObject done_var = foundP;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw159$GAF, $kw183$TRUE, NIL );
              SubLObject done_var_$67 = foundP;
              final SubLObject token_var_$68 = NIL;
              while ( NIL == done_var_$67)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$68 );
                final SubLObject valid_$69 = makeBoolean( !token_var_$68.eql( assertion ) );
                if( NIL != valid_$69 )
                {
                  ls = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                  SubLObject sentence = NIL;
                  final SubLObject pred_var_$70 = $const184$meaningSentenceOfSchema;
                  if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( ls, ONE_INTEGER, pred_var_$70 ) )
                  {
                    final SubLObject iterator_var_$71 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( ls, ONE_INTEGER, pred_var_$70 );
                    SubLObject done_var_$68 = foundP;
                    final SubLObject token_var_$69 = NIL;
                    while ( NIL == done_var_$68)
                    {
                      final SubLObject final_index_spec_$74 = iteration.iteration_next_without_values_macro_helper( iterator_var_$71, token_var_$69 );
                      final SubLObject valid_$70 = makeBoolean( !token_var_$69.eql( final_index_spec_$74 ) );
                      if( NIL != valid_$70 )
                      {
                        SubLObject final_index_iterator_$76 = NIL;
                        try
                        {
                          final_index_iterator_$76 = kb_mapping_macros.new_final_index_iterator( final_index_spec_$74, $kw159$GAF, $kw183$TRUE, NIL );
                          SubLObject done_var_$69 = foundP;
                          final SubLObject token_var_$70 = NIL;
                          while ( NIL == done_var_$69)
                          {
                            final SubLObject assertion_$79 = iteration.iteration_next_without_values_macro_helper( final_index_iterator_$76, token_var_$70 );
                            final SubLObject valid_$71 = makeBoolean( !token_var_$70.eql( assertion_$79 ) );
                            if( NIL != valid_$71 )
                            {
                              sentence = assertions_high.gaf_arg( assertion_$79, TWO_INTEGER );
                              if( NIL != el_utilities.el_formula_with_operator_p( sentence, $const176$rdf_type ) )
                              {
                                foundP = T;
                              }
                            }
                            done_var_$69 = makeBoolean( NIL == valid_$71 || NIL != foundP );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values = Values.getValuesAsVector();
                            if( NIL != final_index_iterator_$76 )
                            {
                              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator_$76 );
                            }
                            Values.restoreValuesFromVector( _values );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
                          }
                        }
                      }
                      done_var_$68 = makeBoolean( NIL == valid_$70 || NIL != foundP );
                    }
                  }
                }
                done_var_$67 = makeBoolean( NIL == valid_$69 || NIL != foundP );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != foundP );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 53071L)
  public static SubLObject literal_removal_cost(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    return tactic_specs_total_cost( some_literal_removal_options_int( literal, sense, mt, allowed_modules_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 53320L)
  public static SubLObject some_literal_removal_options(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    return list_utilities.sublisp_boolean( some_literal_removal_options_int( literal, sense, mt, allowed_modules_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 53599L)
  public static SubLObject literal_removal_completeness(final SubLObject literal, final SubLObject sense, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject strongest_completeness = $kw185$IMPOSSIBLE;
    final SubLObject _prev_bind_0 = inference_macros.$controlling_inferences$.currentBinding( thread );
    final SubLObject _prev_bind_2 = inference_macros.$controlling_strategy$.currentBinding( thread );
    try
    {
      inference_macros.$controlling_inferences$.bind( ConsesLow.cons( NIL, inference_macros.$controlling_inferences$.getDynamicValue( thread ) ), thread );
      inference_macros.$controlling_strategy$.bind( NIL, thread );
      SubLObject cdolist_list_var;
      final SubLObject tactic_specs = cdolist_list_var = some_literal_removal_options_int( literal, sense, mt, UNPROVIDED );
      SubLObject tactic_spec = NIL;
      tactic_spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = tactic_spec;
        SubLObject hl_module = NIL;
        SubLObject productivity = NIL;
        SubLObject completeness = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
        hl_module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
        productivity = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
        completeness = current.first();
        current = current.rest();
        if( NIL == current )
        {
          strongest_completeness = inference_datastructures_enumerated_types.max2_completeness( strongest_completeness, completeness );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list186 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        tactic_spec = cdolist_list_var.first();
      }
      if( $kw187$COMPLETE != strongest_completeness )
      {
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0_$83 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_1_$84 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          if( NIL != removal_modules_true_sentence.removal_complete_asentP( literal ) )
          {
            strongest_completeness = $kw187$COMPLETE;
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$84, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$83, thread );
        }
      }
    }
    finally
    {
      inference_macros.$controlling_strategy$.rebind( _prev_bind_2, thread );
      inference_macros.$controlling_inferences$.rebind( _prev_bind_0, thread );
    }
    return strongest_completeness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 54599L)
  public static SubLObject some_literal_removal_options_int(final SubLObject literal, final SubLObject sense, final SubLObject mt, SubLObject allowed_modules_spec)
  {
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tactic_specs = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      tactic_specs = memoized_literal_removal_options( literal, sense, allowed_modules_spec );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return tactic_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 54889L)
  public static SubLObject tactic_specs_total_cost(final SubLObject tactic_specs)
  {
    SubLObject total_productivity = ZERO_INTEGER;
    SubLObject cdolist_list_var = tactic_specs;
    SubLObject tactic_spec = NIL;
    tactic_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tactic_spec;
      SubLObject hl_module = NIL;
      SubLObject productivity = NIL;
      SubLObject completeness = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      productivity = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      completeness = current.first();
      current = current.rest();
      if( NIL == current )
      {
        total_productivity = inference_datastructures_enumerated_types.productivity_X( total_productivity, productivity );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list186 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic_spec = cdolist_list_var.first();
    }
    return inference_datastructures_enumerated_types.cost_for_productivity( total_productivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 55295L)
  public static SubLObject do_contextualized_clause_focal_literals(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject focal_asent_var = NIL;
    SubLObject focal_mt_var = NIL;
    SubLObject focal_sense_var = NIL;
    SubLObject non_focal_clause_var = NIL;
    SubLObject clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    focal_asent_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    focal_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    focal_sense_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    non_focal_clause_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    clause = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$85 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list188 );
      current_$85 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list188 );
      if( NIL == conses_high.member( current_$85, $list189, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$85 == $kw190$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list188 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw191$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject clause_var = $sym192$CLAUSE_VAR;
    final SubLObject index_var = $sym193$INDEX_VAR;
    return ConsesLow.list( $sym194$CLET, ConsesLow.list( ConsesLow.list( clause_var, clause ) ), ConsesLow.list( $sym195$DO_CONTEXTUALIZED_CLAUSE_LITERALS, ConsesLow.list( focal_asent_var, focal_mt_var, focal_sense_var,
        clause_var, $kw196$INDEX, index_var, $kw191$DONE, done ), ConsesLow.listS( $sym194$CLET, ConsesLow.list( ConsesLow.list( non_focal_clause_var, ConsesLow.list( $sym197$CLAUSE_WITHOUT_LITERAL, clause_var,
            focal_sense_var, index_var ) ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 56041L)
  public static SubLObject join_ordered_committed_literal(final SubLObject dnf_clause, SubLObject allowed_modules_spec)
  {
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    assert NIL != inference_datastructures_problem_query.contextualized_dnf_clause_p( dnf_clause ) : dnf_clause;
    SubLObject committed_contextualized_asent = misc_utilities.uninitialized();
    SubLObject committed_sense = misc_utilities.uninitialized();
    SubLObject committed_preference = preference_modules.$max_preference_level$.getGlobalValue();
    SubLObject committed_productivity = number_utilities.positive_infinity();
    final SubLObject max_preference_level = join_ordered_max_preference_level( dnf_clause, UNPROVIDED );
    SubLObject candidate_sense = $kw78$NEG;
    SubLObject index_var = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.neg_lits( dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject candidate_mt = NIL;
      SubLObject candidate_asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject non_focal_clause = clauses.clause_without_literal( dnf_clause, candidate_sense, index_var );
        if( NIL == tactician_chooses_to_throw_away_asent_mt_senseP( candidate_asent, candidate_mt, candidate_sense ) )
        {
          final SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent( candidate_mt, candidate_asent );
          final SubLObject shared_vars = common_hl_variables( candidate_contextualized_asent, non_focal_clause );
          final SubLObject candidate_preference = literal_removal_preference_level( candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec );
          final SubLObject candidate_productivity = literal_removal_productivity( candidate_asent, candidate_sense, candidate_mt, allowed_modules_spec );
          if( NIL == magic_wand_tactic_specP( candidate_productivity, candidate_preference, max_preference_level ) && NIL != tactician_deems_join_ordered_analysis_betterP( candidate_productivity, candidate_preference,
              ONE_INTEGER, committed_productivity, committed_preference, ONE_INTEGER ) )
          {
            committed_contextualized_asent = candidate_contextualized_asent;
            committed_sense = candidate_sense;
            committed_preference = candidate_preference;
            committed_productivity = candidate_productivity;
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    candidate_sense = $kw59$POS;
    index_var = ZERO_INTEGER;
    cdolist_list_var = clauses.pos_lits( dnf_clause );
    contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject candidate_mt = NIL;
      SubLObject candidate_asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject non_focal_clause = clauses.clause_without_literal( dnf_clause, candidate_sense, index_var );
        if( NIL == tactician_chooses_to_throw_away_asent_mt_senseP( candidate_asent, candidate_mt, candidate_sense ) )
        {
          final SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent( candidate_mt, candidate_asent );
          final SubLObject shared_vars = common_hl_variables( candidate_contextualized_asent, non_focal_clause );
          final SubLObject candidate_preference = literal_removal_preference_level( candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec );
          final SubLObject candidate_productivity = literal_removal_productivity( candidate_asent, candidate_sense, candidate_mt, allowed_modules_spec );
          if( NIL == magic_wand_tactic_specP( candidate_productivity, candidate_preference, max_preference_level ) && NIL != tactician_deems_join_ordered_analysis_betterP( candidate_productivity, candidate_preference,
              ONE_INTEGER, committed_productivity, committed_preference, ONE_INTEGER ) )
          {
            committed_contextualized_asent = candidate_contextualized_asent;
            committed_sense = candidate_sense;
            committed_preference = candidate_preference;
            committed_productivity = candidate_productivity;
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    return Values.values( committed_contextualized_asent, committed_sense, committed_preference, committed_productivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 58269L)
  public static SubLObject join_ordered_max_preference_level(final SubLObject dnf_clause, SubLObject allowed_modules_spec)
  {
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    SubLObject max_preference = preference_modules.$max_preference_level$.getGlobalValue();
    SubLObject max_foundP = NIL;
    SubLObject candidate_sense = $kw78$NEG;
    SubLObject index_var = ZERO_INTEGER;
    SubLObject rest;
    SubLObject contextualized_asent;
    SubLObject current;
    SubLObject datum;
    SubLObject candidate_mt;
    SubLObject candidate_asent;
    SubLObject non_focal_clause;
    SubLObject candidate_contextualized_asent;
    SubLObject shared_vars;
    SubLObject candidate_preference;
    for( rest = NIL, rest = clauses.neg_lits( dnf_clause ); NIL == max_foundP && NIL != rest; rest = rest.rest() )
    {
      contextualized_asent = rest.first();
      datum = ( current = contextualized_asent );
      candidate_mt = NIL;
      candidate_asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        non_focal_clause = clauses.clause_without_literal( dnf_clause, candidate_sense, index_var );
        if( $kw111$PREFERRED != max_preference && NIL == tactician_chooses_to_throw_away_asent_mt_senseP( candidate_asent, candidate_mt, candidate_sense ) )
        {
          candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent( candidate_mt, candidate_asent );
          shared_vars = common_hl_variables( candidate_contextualized_asent, non_focal_clause );
          candidate_preference = literal_removal_preference_level( candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec );
          if( NIL != preference_modules.preference_level_G( candidate_preference, max_preference ) )
          {
            max_preference = candidate_preference;
            max_foundP = Equality.eq( $kw111$PREFERRED, max_preference );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
    }
    candidate_sense = $kw59$POS;
    index_var = ZERO_INTEGER;
    for( rest = NIL, rest = clauses.pos_lits( dnf_clause ); NIL == max_foundP && NIL != rest; rest = rest.rest() )
    {
      contextualized_asent = rest.first();
      datum = ( current = contextualized_asent );
      candidate_mt = NIL;
      candidate_asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
      candidate_asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        non_focal_clause = clauses.clause_without_literal( dnf_clause, candidate_sense, index_var );
        if( $kw111$PREFERRED != max_preference && NIL == tactician_chooses_to_throw_away_asent_mt_senseP( candidate_asent, candidate_mt, candidate_sense ) )
        {
          candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent( candidate_mt, candidate_asent );
          shared_vars = common_hl_variables( candidate_contextualized_asent, non_focal_clause );
          candidate_preference = literal_removal_preference_level( candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec );
          if( NIL != preference_modules.preference_level_G( candidate_preference, max_preference ) )
          {
            max_preference = candidate_preference;
            max_foundP = Equality.eq( $kw111$PREFERRED, max_preference );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
    }
    return max_preference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 59297L)
  public static SubLObject tactician_chooses_to_throw_away_asent_mt_senseP(final SubLObject candidate_asent, final SubLObject candidate_mt, final SubLObject candidate_sense)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 59489L)
  public static SubLObject common_hl_variables(final SubLObject expression1, final SubLObject expression2)
  {
    final SubLObject vars1 = list_utilities.tree_gather( expression1, Symbols.symbol_function( $sym200$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject vars2 = list_utilities.tree_gather( expression2, Symbols.symbol_function( $sym200$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject common_vars = conses_high.intersection( vars1, vars2, Symbols.symbol_function( EQL ), UNPROVIDED );
    return variables.sort_hl_variable_list( common_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 59788L)
  public static SubLObject memoized_literal_removal_options_internal(final SubLObject asent, final SubLObject sense, SubLObject allowed_modules_spec)
  {
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    return inference_worker_removal.literal_removal_options( asent, sense, allowed_modules_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 59788L)
  public static SubLObject memoized_literal_removal_options(final SubLObject asent, final SubLObject sense, SubLObject allowed_modules_spec)
  {
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_literal_removal_options_internal( asent, sense, allowed_modules_spec );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym201$MEMOIZED_LITERAL_REMOVAL_OPTIONS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym201$MEMOIZED_LITERAL_REMOVAL_OPTIONS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym201$MEMOIZED_LITERAL_REMOVAL_OPTIONS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( asent, sense, allowed_modules_spec );
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
        if( asent.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( sense.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && allowed_modules_spec.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_literal_removal_options_internal( asent, sense, allowed_modules_spec ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( asent, sense, allowed_modules_spec ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 60012L)
  public static SubLObject literal_removal_preference_level(final SubLObject asent, final SubLObject sense, final SubLObject shared_vars, SubLObject mt, SubLObject allowed_modules_spec)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preference_level = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != variables.fully_bound_p( asent ) && NIL != variables.fully_bound_p( mt ) )
      {
        preference_level = $kw111$PREFERRED;
      }
      else if( NIL == shared_vars )
      {
        preference_level = $kw111$PREFERRED;
      }
      else if( $kw187$COMPLETE == literal_removal_completeness( asent, sense, mt ) )
      {
        preference_level = $kw111$PREFERRED;
      }
      else
      {
        preference_level = preference_modules.literal_preference_level_wrt_modules( asent, sense, shared_vars, $kw202$TACTICAL );
        if( NIL != preference_modules.preference_level_L( preference_level, $kw114$DISALLOWED ) && NIL == memoized_literal_removal_options( asent, sense, allowed_modules_spec ) )
        {
          preference_level = $kw114$DISALLOWED;
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return preference_level;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 61038L)
  public static SubLObject literal_removal_productivity(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( allowed_modules_spec == UNPROVIDED )
    {
      allowed_modules_spec = $kw4$ALL;
    }
    return inference_datastructures_enumerated_types.productivity_for_number_of_children( literal_removal_cost( literal, sense, mt, allowed_modules_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 61290L)
  public static SubLObject magic_wand_tactic_specP(final SubLObject productivity, final SubLObject preference_level, final SubLObject max_sibling_preference_level)
  {
    return makeBoolean( NIL != inference_datastructures_enumerated_types.productivity_E( ZERO_INTEGER, productivity ) && NIL != inference_tactician_utilities.under_magic_wand_max_preference_levelP( preference_level )
        && NIL != preference_modules.preference_level_L( preference_level, max_sibling_preference_level ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 61576L)
  public static SubLObject tactician_deems_join_ordered_analysis_betterP(final SubLObject candidate_productivity, final SubLObject candidate_preference, final SubLObject candidate_literal_count,
      final SubLObject committed_productivity, final SubLObject committed_preference, final SubLObject committed_literal_count)
  {
    return inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP( candidate_productivity, candidate_preference, $kw203$JOIN_ORDERED, candidate_literal_count, committed_productivity,
        committed_preference, $kw203$JOIN_ORDERED, committed_literal_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 62079L)
  public static SubLObject current_query_properties()
  {
    final SubLObject inference = inference_macros.current_controlling_inference();
    if( NIL != inference )
    {
      return inference_datastructures_enumerated_types.inference_input_non_default_query_properties( inference );
    }
    return inference_trivial.current_trivial_query_properties();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 62322L)
  public static SubLObject inference_literal_to_supports_map(final SubLObject inference, final SubLObject proof, SubLObject literal_to_proofs_map, SubLObject variable_map, SubLObject supported_asents)
  {
    if( literal_to_proofs_map == UNPROVIDED )
    {
      literal_to_proofs_map = NIL;
    }
    if( variable_map == UNPROVIDED )
    {
      variable_map = NIL;
    }
    if( supported_asents == UNPROVIDED )
    {
      supported_asents = NIL;
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    if( NIL != literal_to_proofs_map && !assertionsDisabledInClass && NIL == Types.hash_table_p( literal_to_proofs_map ) )
    {
      throw new AssertionError( literal_to_proofs_map );
    }
    if( !literal_to_proofs_map.isHashtable() )
    {
      literal_to_proofs_map = Hashtables.make_hash_table( inference_datastructures_problem_store.problem_store_proof_count( inference_datastructures_inference.inference_problem_store( inference ) ), EQUAL, UNPROVIDED );
    }
    final SubLObject proof_direct_subproofs = inference_datastructures_proof.proof_direct_subproofs( proof );
    final SubLObject proof_supported_problem = inference_datastructures_proof.proof_supported_problem( proof );
    final SubLObject problem_query = inference_datastructures_problem.problem_query( proof_supported_problem );
    if( proof_supported_problem.eql( inference_datastructures_inference.inference_root_problem( inference ) ) && NIL == variable_map )
    {
      variable_map = inference_datastructures_inference.inference_el_bindings( inference );
    }
    if( NIL != inference_datastructures_problem.single_literal_problem_p( proof_supported_problem ) && NIL == proof_direct_subproofs && ( ( NIL != inference_modules.hl_module_p( inference_datastructures_proof.proof_type(
        proof ) ) && inference_modules.hl_module_type( inference_datastructures_proof.proof_type( proof ) ) == $kw206$REMOVAL ) || inference_datastructures_proof.proof_type( proof ) == $kw207$RESTRICTION ) )
    {
      SubLObject cdolist_list_var = problem_query;
      SubLObject contextualized_clause = NIL;
      contextualized_clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject sense = $kw78$NEG;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var_$86 = clauses.neg_lits( contextualized_clause );
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var_$86.first();
        while ( NIL != cdolist_list_var_$86)
        {
          SubLObject current;
          final SubLObject datum = current = contextualized_asent;
          SubLObject mt = NIL;
          SubLObject asent = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
          mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
          asent = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject item_var;
            asent = ( item_var = bindings.apply_bindings_backwards( variable_map, asent ) );
            if( NIL == conses_high.member( item_var, supported_asents, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              supported_asents = ConsesLow.cons( item_var, supported_asents );
            }
            SubLObject cdolist_list_var_$87 = supported_asents;
            SubLObject supported_asent = NIL;
            supported_asent = cdolist_list_var_$87.first();
            while ( NIL != cdolist_list_var_$87)
            {
              SubLObject cdolist_list_var_$88 = inference_datastructures_proof.proof_supports( proof );
              SubLObject support = NIL;
              support = cdolist_list_var_$88.first();
              while ( NIL != cdolist_list_var_$88)
              {
                hash_table_utilities.pushnew_hash( supported_asent, support, literal_to_proofs_map, EQUAL );
                SubLObject cdolist_list_var_$89 = hl_supports.hl_justify_expanded( support );
                SubLObject just = NIL;
                just = cdolist_list_var_$89.first();
                while ( NIL != cdolist_list_var_$89)
                {
                  hash_table_utilities.pushnew_hash( supported_asent, just, literal_to_proofs_map, EQUAL );
                  cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                  just = cdolist_list_var_$89.first();
                }
                cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                support = cdolist_list_var_$88.first();
              }
              cdolist_list_var_$87 = cdolist_list_var_$87.rest();
              supported_asent = cdolist_list_var_$87.first();
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list208 );
          }
          index_var = Numbers.add( index_var, ONE_INTEGER );
          cdolist_list_var_$86 = cdolist_list_var_$86.rest();
          contextualized_asent = cdolist_list_var_$86.first();
        }
        sense = $kw59$POS;
        index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var_$90 = clauses.pos_lits( contextualized_clause );
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var_$90.first();
        while ( NIL != cdolist_list_var_$90)
        {
          SubLObject current;
          final SubLObject datum = current = contextualized_asent;
          SubLObject mt = NIL;
          SubLObject asent = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
          mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
          asent = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject item_var;
            asent = ( item_var = bindings.apply_bindings_backwards( variable_map, asent ) );
            if( NIL == conses_high.member( item_var, supported_asents, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              supported_asents = ConsesLow.cons( item_var, supported_asents );
            }
            SubLObject cdolist_list_var_$91 = supported_asents;
            SubLObject supported_asent = NIL;
            supported_asent = cdolist_list_var_$91.first();
            while ( NIL != cdolist_list_var_$91)
            {
              SubLObject cdolist_list_var_$92 = inference_datastructures_proof.proof_supports( proof );
              SubLObject support = NIL;
              support = cdolist_list_var_$92.first();
              while ( NIL != cdolist_list_var_$92)
              {
                hash_table_utilities.pushnew_hash( supported_asent, support, literal_to_proofs_map, EQUAL );
                SubLObject cdolist_list_var_$93 = hl_supports.hl_justify_expanded( support );
                SubLObject just = NIL;
                just = cdolist_list_var_$93.first();
                while ( NIL != cdolist_list_var_$93)
                {
                  hash_table_utilities.pushnew_hash( supported_asent, just, literal_to_proofs_map, EQUAL );
                  cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                  just = cdolist_list_var_$93.first();
                }
                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                support = cdolist_list_var_$92.first();
              }
              cdolist_list_var_$91 = cdolist_list_var_$91.rest();
              supported_asent = cdolist_list_var_$91.first();
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list208 );
          }
          index_var = Numbers.add( index_var, ONE_INTEGER );
          cdolist_list_var_$90 = cdolist_list_var_$90.rest();
          contextualized_asent = cdolist_list_var_$90.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_clause = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject sub_proof_variable_map = variable_map;
      if( NIL != inference_modules.hl_module_p( inference_datastructures_proof.proof_type( proof ) ) && inference_modules.hl_module_type( inference_datastructures_proof.proof_type( proof ) ) == $kw209$TRANSFORMATION )
      {
        sub_proof_variable_map = bindings.apply_bindings( inference_worker_transformation.transformation_link_bindings( inference_datastructures_proof.proof_link( proof ) ), variable_map );
        sub_proof_variable_map = bindings.apply_bindings_backwards( inference_datastructures_problem_link.mapped_problem_variable_map( inference_worker_transformation.transformation_link_supporting_mapped_problem(
            inference_datastructures_proof.proof_link( proof ) ) ), sub_proof_variable_map );
      }
      SubLObject cdolist_list_var2 = problem_query;
      SubLObject contextualized_clause2 = NIL;
      contextualized_clause2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject sense2 = $kw78$NEG;
        SubLObject index_var2 = ZERO_INTEGER;
        SubLObject cdolist_list_var_$94 = clauses.neg_lits( contextualized_clause2 );
        SubLObject contextualized_asent2 = NIL;
        contextualized_asent2 = cdolist_list_var_$94.first();
        while ( NIL != cdolist_list_var_$94)
        {
          SubLObject current2;
          final SubLObject datum2 = current2 = contextualized_asent2;
          SubLObject mt2 = NIL;
          SubLObject asent2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list208 );
          mt2 = current2.first();
          current2 = current2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list208 );
          asent2 = current2.first();
          current2 = current2.rest();
          if( NIL == current2 )
          {
            final SubLObject item_var2;
            asent2 = ( item_var2 = bindings.apply_bindings_backwards( variable_map, asent2 ) );
            if( NIL == conses_high.member( item_var2, supported_asents, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              supported_asents = ConsesLow.cons( item_var2, supported_asents );
            }
            SubLObject cdolist_list_var_$95 = inference_datastructures_proof.proof_direct_subproofs( proof );
            SubLObject subproof = NIL;
            subproof = cdolist_list_var_$95.first();
            while ( NIL != cdolist_list_var_$95)
            {
              literal_to_proofs_map = inference_literal_to_supports_map( inference, subproof, literal_to_proofs_map, sub_proof_variable_map, supported_asents );
              cdolist_list_var_$95 = cdolist_list_var_$95.rest();
              subproof = cdolist_list_var_$95.first();
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum2, $list208 );
          }
          index_var2 = Numbers.add( index_var2, ONE_INTEGER );
          cdolist_list_var_$94 = cdolist_list_var_$94.rest();
          contextualized_asent2 = cdolist_list_var_$94.first();
        }
        sense2 = $kw59$POS;
        index_var2 = ZERO_INTEGER;
        SubLObject cdolist_list_var_$96 = clauses.pos_lits( contextualized_clause2 );
        contextualized_asent2 = NIL;
        contextualized_asent2 = cdolist_list_var_$96.first();
        while ( NIL != cdolist_list_var_$96)
        {
          SubLObject current2;
          final SubLObject datum2 = current2 = contextualized_asent2;
          SubLObject mt2 = NIL;
          SubLObject asent2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list208 );
          mt2 = current2.first();
          current2 = current2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list208 );
          asent2 = current2.first();
          current2 = current2.rest();
          if( NIL == current2 )
          {
            final SubLObject item_var2;
            asent2 = ( item_var2 = bindings.apply_bindings_backwards( variable_map, asent2 ) );
            if( NIL == conses_high.member( item_var2, supported_asents, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              supported_asents = ConsesLow.cons( item_var2, supported_asents );
            }
            SubLObject cdolist_list_var_$97 = inference_datastructures_proof.proof_direct_subproofs( proof );
            SubLObject subproof = NIL;
            subproof = cdolist_list_var_$97.first();
            while ( NIL != cdolist_list_var_$97)
            {
              literal_to_proofs_map = inference_literal_to_supports_map( inference, subproof, literal_to_proofs_map, sub_proof_variable_map, supported_asents );
              cdolist_list_var_$97 = cdolist_list_var_$97.rest();
              subproof = cdolist_list_var_$97.first();
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum2, $list208 );
          }
          index_var2 = Numbers.add( index_var2, ONE_INTEGER );
          cdolist_list_var_$96 = cdolist_list_var_$96.rest();
          contextualized_asent2 = cdolist_list_var_$96.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        contextualized_clause2 = cdolist_list_var2.first();
      }
    }
    return literal_to_proofs_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 65763L)
  public static SubLObject problem_store_forts(final SubLObject problem_store)
  {
    final SubLObject result_set = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index( problem_store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
    {
      final SubLObject idx_$98 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$98, $kw63$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$98 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw63$SKIP;
            }
            set_utilities.set_add_all( list_utilities.tree_gather( inference_datastructures_problem.problem_query( problem ), Symbols.symbol_function( $sym210$FORT_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), result_set );
          }
        }
      }
      final SubLObject idx_$99 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$99 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$99 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            set_utilities.set_add_all( list_utilities.tree_gather( inference_datastructures_problem.problem_query( problem2 ), Symbols.symbol_function( $sym210$FORT_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED ),
                result_set );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return set.set_element_list( result_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 66912L)
  public static SubLObject gather_required_vocab_handler(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_object ) && NIL == set.set_memberP( v_object, $gather_required_vocab_set$.getDynamicValue( thread ) ) && NIL == kb_cleanup.ephemeral_termP( v_object ) )
    {
      set.set_add( v_object, $gather_required_vocab_set$.getDynamicValue( thread ) );
      if( NIL != $gather_required_vocab_trace$.getDynamicValue( thread ) )
      {
        format_nil.force_format( $gather_required_vocab_trace$.getDynamicValue( thread ), $str211$__added__S, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return v_object;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 67293L)
  public static SubLObject gather_supports_required_vocab(final SubLObject supports, SubLObject accumulator, SubLObject trace_stream)
  {
    if( accumulator == UNPROVIDED )
    {
      accumulator = NIL;
    }
    if( trace_stream == UNPROVIDED )
    {
      trace_stream = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == accumulator )
    {
      accumulator = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    }
    final SubLObject _prev_bind_0 = $gather_required_vocab_set$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $gather_required_vocab_trace$.currentBinding( thread );
    try
    {
      $gather_required_vocab_set$.bind( accumulator, thread );
      $gather_required_vocab_trace$.bind( trace_stream, thread );
      cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), supports, T, UNPROVIDED );
    }
    finally
    {
      $gather_required_vocab_trace$.rebind( _prev_bind_2, thread );
      $gather_required_vocab_set$.rebind( _prev_bind_0, thread );
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 67771L)
  public static SubLObject gather_inference_required_vocab(final SubLObject inference, SubLObject accumulator)
  {
    if( accumulator == UNPROVIDED )
    {
      accumulator = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == accumulator )
    {
      accumulator = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    }
    final SubLObject _prev_bind_0 = $gather_required_vocab_set$.currentBinding( thread );
    try
    {
      $gather_required_vocab_set$.bind( accumulator, thread );
      final SubLObject el_query = inference_datastructures_inference.inference_el_query( inference );
      final SubLObject hl_query = inference_datastructures_inference.inference_hl_query( inference );
      final SubLObject mt = inference_datastructures_inference.inference_mt( inference );
      final SubLObject explicit_supports = inference_datastructures_inference.inference_all_answer_supports( inference );
      thread.resetMultipleValues();
      final SubLObject backward_theory = hl_supports.hl_justification_complete_backward_theory( explicit_supports, mt, UNPROVIDED, UNPROVIDED );
      final SubLObject intermediate_hl_supports = thread.secondMultipleValue();
      thread.resetMultipleValues();
      cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), el_query, T, UNPROVIDED );
      cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), hl_query, T, UNPROVIDED );
      cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), mt, T, UNPROVIDED );
      final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw63$SKIP ) )
      {
        final SubLObject idx_$100 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$100, $kw63$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$100 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject v_answer;
          SubLObject v_bindings;
          SubLObject cdolist_list_var;
          SubLObject justification;
          SubLObject supports;
          SubLObject cdolist_list_var_$101;
          SubLObject proof;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            v_answer = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw63$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( v_answer ) )
              {
                v_answer = $kw63$SKIP;
              }
              v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
              cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), v_bindings, T, UNPROVIDED );
              cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
              justification = NIL;
              justification = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                supports = inference_datastructures_inference.inference_answer_justification_supports( justification );
                cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), supports, T, UNPROVIDED );
                cdolist_list_var_$101 = inference_datastructures_inference.inference_answer_justification_proofs( justification );
                proof = NIL;
                proof = cdolist_list_var_$101.first();
                while ( NIL != cdolist_list_var_$101)
                {
                  cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                  proof = cdolist_list_var_$101.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                justification = cdolist_list_var.first();
              }
            }
          }
        }
        final SubLObject idx_$101 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$101 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$101 );
          SubLObject id2 = NIL;
          SubLObject v_answer2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              v_answer2 = Hashtables.getEntryValue( cdohash_entry );
              final SubLObject v_bindings2 = inference_datastructures_inference.inference_answer_bindings( v_answer2 );
              cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), v_bindings2, T, UNPROVIDED );
              SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( v_answer2 );
              SubLObject justification2 = NIL;
              justification2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                final SubLObject supports2 = inference_datastructures_inference.inference_answer_justification_supports( justification2 );
                cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), supports2, T, UNPROVIDED );
                SubLObject cdolist_list_var_$102 = inference_datastructures_inference.inference_answer_justification_proofs( justification2 );
                SubLObject proof2 = NIL;
                proof2 = cdolist_list_var_$102.first();
                while ( NIL != cdolist_list_var_$102)
                {
                  cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                  proof2 = cdolist_list_var_$102.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                justification2 = cdolist_list_var2.first();
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      SubLObject cdolist_list_var3 = backward_theory;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), assertions_high.assertion_cons( assertion ), T, UNPROVIDED );
        cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), assertions_high.assertion_mt( assertion ), T, UNPROVIDED );
        cdolist_list_var3 = cdolist_list_var3.rest();
        assertion = cdolist_list_var3.first();
      }
      cdolist_list_var3 = intermediate_hl_supports;
      SubLObject hl_support = NIL;
      hl_support = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        cycl_utilities.expression_map( Symbols.symbol_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER ), hl_support, T, UNPROVIDED );
        cdolist_list_var3 = cdolist_list_var3.rest();
        hl_support = cdolist_list_var3.first();
      }
    }
    finally
    {
      $gather_required_vocab_set$.rebind( _prev_bind_0, thread );
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 69821L)
  public static SubLObject gather_vocab_required_for_kbq_query_set(final SubLObject query_spec_set, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject trace_stream)
  {
    if( outlier_timeout == UNPROVIDED )
    {
      outlier_timeout = NIL;
    }
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    if( trace_stream == UNPROVIDED )
    {
      trace_stream = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vocab_set = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject rule_set = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
    $kbq_query_set_inference_vocab_set$.setDynamicValue( vocab_set, thread );
    final SubLObject _prev_bind_0 = $gather_required_vocab_trace$.currentBinding( thread );
    try
    {
      $gather_required_vocab_trace$.bind( trace_stream, thread );
      kbq_query_run.run_kbq_query_spec_set_and_process_inferences( query_spec_set, $sym213$GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT, ConsesLow.list( $kw214$PROGRESS_MESSAGE, $str215$Gathering_vocab_from_KBQ_inferenc,
          $kw216$OUTLIER_TIMEOUT, outlier_timeout, $kw217$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $kw218$ADDITIONAL_ARGS, ConsesLow.list( vocab_set, rule_set ) ) );
    }
    finally
    {
      $gather_required_vocab_trace$.rebind( _prev_bind_0, thread );
    }
    return Values.values( vocab_set, rule_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 70549L)
  public static SubLObject gather_vocab_required_for_kbq_query_set_int(final SubLObject kbq, final SubLObject inferences, final SubLObject additional_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject vocab_set = NIL;
    SubLObject rule_set = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( additional_args, additional_args, $list219 );
    vocab_set = additional_args.first();
    SubLObject current = additional_args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, additional_args, $list219 );
    rule_set = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject before = set.set_size( vocab_set );
      SubLObject cdolist_list_var = inferences;
      SubLObject inference = NIL;
      inference = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject el_kbq = cycl_utilities.hl_to_el( kbq );
        format_nil.force_format( $gather_required_vocab_trace$.getDynamicValue( thread ), $str220$___a___a__a__, numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ), el_kbq, inference_datastructures_inference
            .inference_cumulative_time( inference ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        gather_inference_required_vocab( inference, vocab_set );
        gather_inference_successful_rules( inference, rule_set );
        cdolist_list_var = cdolist_list_var.rest();
        inference = cdolist_list_var.first();
      }
      final SubLObject after = set.set_size( vocab_set );
      return Numbers.subtract( after, before );
    }
    cdestructuring_bind.cdestructuring_bind_error( additional_args, $list219 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 71129L)
  public static SubLObject gather_inference_successful_rules(final SubLObject inference, SubLObject accumulator)
  {
    if( accumulator == UNPROVIDED )
    {
      accumulator = NIL;
    }
    final SubLObject successful_rules = inference_datastructures_inference.inference_transformation_rules_in_answers( inference );
    if( NIL != accumulator )
    {
      set_utilities.set_add_all( successful_rules, accumulator );
    }
    return set_utilities.construct_set_from_list( successful_rules, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-utilities.lisp", position = 71579L)
  public static SubLObject problem_store_link_id_map(final SubLObject store, SubLObject starting_id, SubLObject ending_id)
  {
    if( starting_id == UNPROVIDED )
    {
      starting_id = ZERO_INTEGER;
    }
    if( ending_id == UNPROVIDED )
    {
      ending_id = NIL;
    }
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    assert NIL != subl_promotions.non_negative_integer_p( starting_id ) : starting_id;
    if( NIL != ending_id && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( ending_id ) )
    {
      throw new AssertionError( ending_id );
    }
    final SubLObject link_limit = ( NIL != ending_id ) ? ending_id : inference_datastructures_problem_store.problem_store_historical_link_count( store );
    SubLObject link_map = NIL;
    if( starting_id.numL( link_limit ) )
    {
      SubLObject end_var;
      SubLObject link_suid;
      SubLObject link;
      SubLObject parent_problem;
      SubLObject child_problems;
      for( end_var = link_limit, link_suid = NIL, link_suid = starting_id; !link_suid.numGE( end_var ); link_suid = number_utilities.f_1X( link_suid ) )
      {
        link = inference_datastructures_problem_store.find_problem_link_by_id( store, link_suid );
        if( NIL != link )
        {
          parent_problem = inference_datastructures_problem_link.problem_link_supported_problem( link );
          child_problems = inference_datastructures_problem_link.problem_link_supporting_problems( link );
          link_map = ConsesLow.cons( ConsesLow.listS( link_suid, ( NIL != parent_problem ) ? inference_datastructures_problem.problem_suid( parent_problem ) : $kw223$ROOT, Mapping.mapcar( Symbols.symbol_function(
              $sym224$PROBLEM_SUID ), child_problems ) ), link_map );
        }
      }
    }
    return Values.values( Sequences.nreverse( link_map ), link_limit );
  }

  public static SubLObject declare_inference_utilities_file()
  {
    SubLFiles.declareFunction( me, "sparql_port", "SPARQL-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "start_external_sparql_process", "START-EXTERNAL-SPARQL-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "allowed_rules_spec_p", "ALLOWED-RULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "forbidden_rules_spec_p", "FORBIDDEN-RULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "openness_p", "OPENNESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "answerability_p", "ANSWERABILITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_input_property_lookup", "INFERENCE-INPUT-PROPERTY-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_property_lookup", "INFERENCE-PROPERTY-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "problem_store_property_lookup", "PROBLEM-STORE-PROPERTY-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "single_literal_backchain_required_problemP", "SINGLE-LITERAL-BACKCHAIN-REQUIRED-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "find_previous_inference_problem_by_el_asent", "FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_requires_argumentationP", "INFERENCE-REQUIRES-ARGUMENTATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_true_and_false_answers", "INFERENCE-TRUE-AND-FALSE-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_argumentation_result", "INFERENCE-ARGUMENTATION-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_perform_argumentation", "INFERENCE-PERFORM-ARGUMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_some_proof_uses_removal_moduleP", "INFERENCE-SOME-PROOF-USES-REMOVAL-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_some_proof_uses_transformation_moduleP", "INFERENCE-SOME-PROOF-USES-TRANSFORMATION-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_modules_used_in_proofs", "INFERENCE-REMOVAL-MODULES-USED-IN-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "categorize_inference_answers_via_rules", "CATEGORIZE-INFERENCE-ANSWERS-VIA-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "unsatisfied_cnfs_for_rule", "UNSATISFIED-CNFS-FOR-RULE", 2, 3, false );
    SubLFiles.declareFunction( me, "unsatisfied_cnfs_time_cutoff", "UNSATISFIED-CNFS-TIME-CUTOFF", 0, 0, false );
    SubLFiles.declareFunction( me, "unsatisfied_cnf_subbed_rule_formula_from_bindings", "UNSATISFIED-CNF-SUBBED-RULE-FORMULA-FROM-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "unsatisfied_cnf_rejectP", "UNSATISFIED-CNF-REJECT?", 3, 0, false );
    SubLFiles.declareFunction( me, "unsatisfied_cnf_reject_knownP", "UNSATISFIED-CNF-REJECT-KNOWN?", 3, 0, false );
    SubLFiles.declareFunction( me, "unsatisfied_cnfs_ok_inference_result_p", "UNSATISFIED-CNFS-OK-INFERENCE-RESULT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "filter_unsatisfied_cnfs", "FILTER-UNSATISFIED-CNFS", 2, 0, false );
    SubLFiles.declareFunction( me, "unsatisfied_td_subproblem_paths", "UNSATISFIED-TD-SUBPROBLEM-PATHS", 2, 0, false );
    SubLFiles.declareFunction( me, "satisfied_problemP_internal", "SATISFIED-PROBLEM?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "satisfied_problemP", "SATISFIED-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "partially_satisfied_split_link_p", "PARTIALLY-SATISFIED-SPLIT-LINK-P", 2, 0, false );
    SubLFiles.declareFunction( me, "reconstruct_partially_satisfied_el_cnfs_from_td_subpaths", "RECONSTRUCT-PARTIALLY-SATISFIED-EL-CNFS-FROM-TD-SUBPATHS", 4, 0, false );
    SubLFiles.declareFunction( me, "inference_thinking_task_abort", "INFERENCE-THINKING-TASK-ABORT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_continuable_inference_from_problem", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM", 1, 2, false );
    SubLFiles.declareFunction( me, "new_continuable_inference_from_problem_query", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "new_continuable_antecedent_inference", "NEW-CONTINUABLE-ANTECEDENT-INFERENCE", 5, 0, false );
    SubLFiles.declareFunction( me, "inference_output_answers_to_file", "INFERENCE-OUTPUT-ANSWERS-TO-FILE", 2, 4, false );
    SubLFiles.declareFunction( me, "inference_output_answers", "INFERENCE-OUTPUT-ANSWERS", 1, 4, false );
    SubLFiles.declareFunction( me, "inference_output_answers_tab_delimited", "INFERENCE-OUTPUT-ANSWERS-TAB-DELIMITED", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_output_answers_xml", "INFERENCE-OUTPUT-ANSWERS-XML", 4, 0, false );
    SubLFiles.declareFunction( me, "answerability_status_p", "ANSWERABILITY-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "query_answerability_status", "QUERY-ANSWERABILITY-STATUS", 1, 2, false );
    SubLFiles.declareFunction( me, "query_answerability_status_int", "QUERY-ANSWERABILITY-STATUS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "query_literal_answerability_status", "QUERY-LITERAL-ANSWERABILITY-STATUS", 1, 2, false );
    SubLFiles.declareFunction( me, "query_literal_independent_answerability_status", "QUERY-LITERAL-INDEPENDENT-ANSWERABILITY-STATUS", 3, 0, false );
    SubLFiles.declareFunction( me, "refine_query_literal_answerability_status", "REFINE-QUERY-LITERAL-ANSWERABILITY-STATUS", 3, 0, false );
    SubLFiles.declareFunction( me, "other_independently_answerable_lits", "OTHER-INDEPENDENTLY-ANSWERABLE-LITS", 4, 0, false );
    SubLFiles.declareFunction( me, "query_term_substitution_answerability_status", "QUERY-TERM-SUBSTITUTION-ANSWERABILITY-STATUS", 3, 2, false );
    SubLFiles.declareFunction( me, "query_term_arg_position_answerability_status", "QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS", 3, 2, false );
    SubLFiles.declareFunction( me, "query_literal_answerability_status_asynch", "QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH", 3, 0, false );
    SubLFiles.declareFunction( me, "query_literal_set_answerability_status_via_callback", "QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK", 2, 3, false );
    SubLFiles.declareFunction( me, "handle_answerability_result_tuple", "HANDLE-ANSWERABILITY-RESULT-TUPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "callback_p", "CALLBACK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_callback", "MAKE-CALLBACK", 1, 1, false );
    SubLFiles.declareFunction( me, "invoke_callback", "INVOKE-CALLBACK", 1, 1, false );
    SubLFiles.declareFunction( me, "callback_method", "CALLBACK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "callback_data", "CALLBACK-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_argument_strength", "INFERENCE-ANSWER-ARGUMENT-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justification_strength", "HL-JUSTIFICATION-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_expanded_justification", "INFERENCE-EXPANDED-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_expanded_justification", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_completely_expanded_justification", "INFERENCE-ANSWER-COMPLETELY-EXPANDED-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_expanded_justification_guts", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_expanded_supports_guts", "INFERENCE-ANSWER-JUSTIFICATION-EXPANDED-SUPPORTS-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_term_for_problem_store", "CYCL-TERM-FOR-PROBLEM-STORE", 0, 1, false );
    SubLFiles.declareFunction( me, "cycl_term_for_inference", "CYCL-TERM-FOR-INFERENCE", 0, 1, false );
    SubLFiles.declareFunction( me, "cycl_term_for_machine", "CYCL-TERM-FOR-MACHINE", 0, 1, false );
    SubLFiles.declareFunction( me, "ensure_term_for_machine", "ENSURE-TERM-FOR-MACHINE", 1, 1, false );
    SubLFiles.declareFunction( me, "cycl_term_for_image", "CYCL-TERM-FOR-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "assert_problem_store_data", "ASSERT-PROBLEM-STORE-DATA", 0, 3, false );
    SubLFiles.declareFunction( me, "assert_inference_data", "ASSERT-INFERENCE-DATA", 0, 3, false );
    SubLFiles.declareFunction( me, "assert_inference_bindings", "ASSERT-INFERENCE-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "latest_inference", "LATEST-INFERENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "query_literal_removal_cost", "QUERY-LITERAL-REMOVAL-COST", 2, 2, false );
    SubLFiles.declareFunction( me, "query_literal_removal_cost_internal", "QUERY-LITERAL-REMOVAL-COST-INTERNAL", 4, 1, false );
    SubLFiles.declareFunction( me, "collection_has_rdf_type_cardinality_estimateP", "COLLECTION-HAS-RDF-TYPE-CARDINALITY-ESTIMATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_removal_cost", "LITERAL-REMOVAL-COST", 2, 2, false );
    SubLFiles.declareFunction( me, "some_literal_removal_options", "SOME-LITERAL-REMOVAL-OPTIONS", 2, 2, false );
    SubLFiles.declareFunction( me, "literal_removal_completeness", "LITERAL-REMOVAL-COMPLETENESS", 2, 1, false );
    SubLFiles.declareFunction( me, "some_literal_removal_options_int", "SOME-LITERAL-REMOVAL-OPTIONS-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "tactic_specs_total_cost", "TACTIC-SPECS-TOTAL-COST", 1, 0, false );
    SubLFiles.declareMacro( me, "do_contextualized_clause_focal_literals", "DO-CONTEXTUALIZED-CLAUSE-FOCAL-LITERALS" );
    SubLFiles.declareFunction( me, "join_ordered_committed_literal", "JOIN-ORDERED-COMMITTED-LITERAL", 1, 1, false );
    SubLFiles.declareFunction( me, "join_ordered_max_preference_level", "JOIN-ORDERED-MAX-PREFERENCE-LEVEL", 1, 1, false );
    SubLFiles.declareFunction( me, "tactician_chooses_to_throw_away_asent_mt_senseP", "TACTICIAN-CHOOSES-TO-THROW-AWAY-ASENT-MT-SENSE?", 3, 0, false );
    SubLFiles.declareFunction( me, "common_hl_variables", "COMMON-HL-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "memoized_literal_removal_options_internal", "MEMOIZED-LITERAL-REMOVAL-OPTIONS-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "memoized_literal_removal_options", "MEMOIZED-LITERAL-REMOVAL-OPTIONS", 2, 1, false );
    SubLFiles.declareFunction( me, "literal_removal_preference_level", "LITERAL-REMOVAL-PREFERENCE-LEVEL", 3, 2, false );
    SubLFiles.declareFunction( me, "literal_removal_productivity", "LITERAL-REMOVAL-PRODUCTIVITY", 2, 2, false );
    SubLFiles.declareFunction( me, "magic_wand_tactic_specP", "MAGIC-WAND-TACTIC-SPEC?", 3, 0, false );
    SubLFiles.declareFunction( me, "tactician_deems_join_ordered_analysis_betterP", "TACTICIAN-DEEMS-JOIN-ORDERED-ANALYSIS-BETTER?", 6, 0, false );
    SubLFiles.declareFunction( me, "current_query_properties", "CURRENT-QUERY-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_literal_to_supports_map", "INFERENCE-LITERAL-TO-SUPPORTS-MAP", 2, 3, false );
    SubLFiles.declareFunction( me, "problem_store_forts", "PROBLEM-STORE-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_required_vocab_handler", "GATHER-REQUIRED-VOCAB-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_supports_required_vocab", "GATHER-SUPPORTS-REQUIRED-VOCAB", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_inference_required_vocab", "GATHER-INFERENCE-REQUIRED-VOCAB", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_vocab_required_for_kbq_query_set", "GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET", 1, 3, false );
    SubLFiles.declareFunction( me, "gather_vocab_required_for_kbq_query_set_int", "GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "gather_inference_successful_rules", "GATHER-INFERENCE-SUCCESSFUL-RULES", 1, 1, false );
    SubLFiles.declareFunction( me, "problem_store_link_id_map", "PROBLEM-STORE-LINK-ID-MAP", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_inference_utilities_file()
  {
    $unsatisfied_cnfs_time_cutoff$ = SubLFiles.defparameter( "*UNSATISFIED-CNFS-TIME-CUTOFF*", TEN_INTEGER );
    $answerability_statuses$ = SubLFiles.deflexical( "*ANSWERABILITY-STATUSES*", $list102 );
    $count_hl_supports_in_hypothetical_contextsP$ = SubLFiles.defparameter( "*COUNT-HL-SUPPORTS-IN-HYPOTHETICAL-CONTEXTS?*", NIL );
    $count_deduced_assertions_in_hypothetical_contextsP$ = SubLFiles.defparameter( "*COUNT-DEDUCED-ASSERTIONS-IN-HYPOTHETICAL-CONTEXTS?*", NIL );
    $gather_required_vocab_set$ = SubLFiles.defparameter( "*GATHER-REQUIRED-VOCAB-SET*", NIL );
    $gather_required_vocab_trace$ = SubLFiles.defparameter( "*GATHER-REQUIRED-VOCAB-TRACE*", NIL );
    $kbq_query_set_inference_vocab_set$ = SubLFiles.defparameter( "*KBQ-QUERY-SET-INFERENCE-VOCAB-SET*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_utilities_file()
  {
    utilities_macros.note_funcall_helper_function( $sym1$START_EXTERNAL_SPARQL_PROCESS );
    tcp_server_utilities.register_tcp_server_type( $kw2$SPARQL, $list3, UNPROVIDED );
    memoization_state.note_memoized_function( $sym80$SATISFIED_PROBLEM_ );
    access_macros.register_external_symbol( $sym109$QUERY_LITERAL_ANSWERABILITY_STATUS );
    access_macros.register_external_symbol( $sym117$QUERY_TERM_ARG_POSITION_ANSWERABILITY_STATUS );
    access_macros.register_external_symbol( $sym118$QUERY_LITERAL_ANSWERABILITY_STATUS_ASYNCH );
    access_macros.register_external_symbol( $sym121$QUERY_LITERAL_SET_ANSWERABILITY_STATUS_VIA_CALLBACK );
    access_macros.register_external_symbol( $sym128$INFERENCE_ANSWER_ARGUMENT_STRENGTH );
    access_macros.register_external_symbol( $sym156$QUERY_LITERAL_REMOVAL_COST );
    memoization_state.note_memoized_function( $sym201$MEMOIZED_LITERAL_REMOVAL_OPTIONS );
    utilities_macros.note_funcall_helper_function( $sym212$GATHER_REQUIRED_VOCAB_HANDLER );
    utilities_macros.note_funcall_helper_function( $sym213$GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT );
    access_macros.register_external_symbol( $sym221$PROBLEM_STORE_LINK_ID_MAP );
    generic_testing.define_test_case_table_int( $sym225$QUERY_ANSWERABILITY_STATUS, ConsesLow.list( new SubLObject[] { $kw226$TEST, NIL, $kw227$OWNER, NIL, $kw228$CLASSES, NIL, $kw229$KB, $kw230$FULL, $kw231$WORKING_, T
    } ), $list232 );
    generic_testing.define_test_case_table_int( $sym109$QUERY_LITERAL_ANSWERABILITY_STATUS, ConsesLow.list( new SubLObject[] { $kw226$TEST, NIL, $kw227$OWNER, NIL, $kw228$CLASSES, NIL, $kw229$KB, $kw230$FULL,
      $kw231$WORKING_, T
    } ), $list233 );
    return NIL;
  }

  private static SubLObject _constant_233_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ), ONE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?X" ),
            FIVE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ), ONE_INTEGER ), makeKeyword(
                "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?X" ), FIVE_INTEGER ), makeKeyword( "ANSWERABLE" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
          makeSymbol( "?Y" ), ONE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?X" ), FIVE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?Y" ), ONE_INTEGER ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?X" ), FIVE_INTEGER ), makeKeyword( "UNANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), ONE_INTEGER, makeSymbol( "?X" ) ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?X" ), FIVE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "greaterThan" ) ), ONE_INTEGER, makeSymbol( "?X" ) ), makeKeyword( "UNANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?X" ), FIVE_INTEGER ), makeKeyword( "UNANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                      constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
                                          constant_handles.reader_make_constant_shell( makeString( "ThirdOrderCollection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ),
                                              makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                                                  "?X" ), constant_handles.reader_make_constant_shell( makeString( "ThirdOrderCollection" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list(
                                                          ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                              makeString( "isa" ) ), makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString( "ThirdOrderCollection" ) ) ), ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell(
                                                                          makeString( "ThirdOrderCollection" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                              .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow
                                                                                  .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                      constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Z" ), constant_handles.reader_make_constant_shell(
                                                                                          makeString( "ThirdOrderCollection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ),
                                                                                              makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Z" ), constant_handles.reader_make_constant_shell(
                                                                                                      makeString( "ThirdOrderCollection" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                          constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ),
                                                                                                          makeKeyword( "UNANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "ThirdOrderCollection" ) ) ), ConsesLow.list(
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
                                                                                                                          makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ),
                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "ThirdOrderCollection" ) ) ),
                                                                                                                              makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol(
                                                                                                                                      "?Y" ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                                                          .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "equalSymbols" ) ), makeSymbol( "?Y" ), constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "ThirdOrderCollection" ) ) ),
                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list(
                                                                                                                                                      ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "equalSymbols" ) ),
                                                                                                                                                          makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell(
                                                                                                                                                              makeString( "ThirdOrderCollection" ) ) ), makeKeyword(
                                                                                                                                                                  "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "isa" ) ), makeSymbol( "?X" ),
                                                                                                                                                                      makeSymbol( "?Y" ) ), makeKeyword(
                                                                                                                                                                          "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                              .list( ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "and" ) ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "equalSymbols" ) ),
                                                                                                                                                                                          makeSymbol( "?Z" ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "ThirdOrderCollection" ) ) ),
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "isa" ) ), makeSymbol(
                                                                                                                                                                                              "?X" ), makeSymbol(
                                                                                                                                                                                                  "?Y" ) ) ) ), ConsesLow
                                                                                                                                                                                                      .list( ConsesLow.list(
                                                                                                                                                                                                          ConsesLow.list(
                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                          "equalSymbols" ) ),
                                                                                                                                                                                                              makeSymbol(
                                                                                                                                                                                                                  "?Z" ),
                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                          "ThirdOrderCollection" ) ) ),
                                                                                                                                                                                                          makeKeyword(
                                                                                                                                                                                                              "ANSWERABLE" ) ),
                                                                                                                                                                                                          ConsesLow.list(
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                  "isa" ) ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "?X" ),
                                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                                          "?Y" ) ),
                                                                                                                                                                                                              makeKeyword(
                                                                                                                                                                                                                  "UNANSWERABLE" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
          makeSymbol( "?X" ), makeInteger( 212 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?Y" ), makeInteger( 212 ) ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "different" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "equalSymbols" ) ), makeSymbol( "?X" ), makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "equalSymbols" ) ), makeSymbol( "?Y" ), makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "different" ) ),
                          makeSymbol( "?X" ), makeSymbol( "?Y" ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ), makeInteger( 212 ) ), ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "different" ) ), makeSymbol( "?X" ), makeInteger( 212 ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ), makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "different" ) ), makeSymbol( "?X" ), makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                              .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
                                                  makeSymbol( "?X" ), makeInteger( 212 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?X" ), makeSymbol(
                                                      "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ),
                                                          makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ),
                                                              makeSymbol( "?X" ), makeSymbol( "?Y" ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                  .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
                                                                      makeSymbol( "?Y" ), makeInteger( 212 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?X" ),
                                                                          makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "equalSymbols" ) ), makeSymbol( "?Y" ), makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), makeKeyword( "ANSWERABLE" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
          makeSymbol( "?Z" ), makeInteger( 212 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list(
              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?Z" ), makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list(
                  constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), makeKeyword( "UNANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?TIME" ),
                          constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "laterThan" ) ), makeSymbol( "?TIME" ), makeSymbol(
                              "?LATER" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?TIME" ), constant_handles
                                  .reader_make_constant_shell( makeString( "Now" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "laterThan" ) ), makeSymbol( "?TIME" ), makeSymbol( "?LATER" ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?LATER" ),
                                              constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "laterThan" ) ), makeSymbol(
                                                  "?TIME" ), makeSymbol( "?LATER" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
                                                      makeSymbol( "?LATER" ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list(
                                                          constant_handles.reader_make_constant_shell( makeString( "laterThan" ) ), makeSymbol( "?TIME" ), makeSymbol( "?LATER" ) ), makeKeyword( "ANSWERABLE" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
          makeSymbol( "?WHENEVER" ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "laterThan" ) ), makeSymbol( "?TIME" ),
              makeSymbol( "?LATER" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?WHENEVER" ), constant_handles
                  .reader_make_constant_shell( makeString( "Now" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "laterThan" ) ), makeSymbol(
                      "?TIME" ), makeSymbol( "?LATER" ) ), makeKeyword( "UNANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?DATE" ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ),
                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeSymbol( "?EVENT" ), makeSymbol( "?DATE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                              constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?DATE" ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ), makeKeyword(
                                  "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeSymbol( "?EVENT" ), makeSymbol( "?DATE" ) ),
                                      makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                          constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?EVENT" ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ),
                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeSymbol( "?EVENT" ), makeSymbol( "?DATE" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?EVENT" ), constant_handles.reader_make_constant_shell( makeString(
                                                  "Now" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeSymbol(
                                                      "?EVENT" ), makeSymbol( "?DATE" ) ), makeKeyword( "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                          makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?WHENEVER" ), constant_handles
                                                              .reader_make_constant_shell( makeString( "Now" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeSymbol(
                                                                  "?EVENT" ), makeSymbol( "?DATE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                      "equalSymbols" ) ), makeSymbol( "?WHENEVER" ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ), makeKeyword( "ANSWERABLE" ) ),
                                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeSymbol( "?EVENT" ), makeSymbol(
                                                                          "?DATE" ) ), makeKeyword( "UNANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                              makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ),
                                                                                  makeInteger( 212 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
                                                                                      constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                          constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ), makeInteger( 212 ) ),
                                                                                          makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                              makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), makeKeyword(
                                                                                                  "ANSWERABLE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                      makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ),
                                                                                                          makeSymbol( "?X" ), makeInteger( 212 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Event" ) ) ) ) ),
                                                                                                      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "equalSymbols" ) ), makeSymbol( "?X" ), makeInteger( 212 ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list(
                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "Event" ) ) ), makeKeyword( "ANSWERABLE" ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_utilities_file();
  }
  static
  {
    me = new inference_utilities();
    $unsatisfied_cnfs_time_cutoff$ = null;
    $answerability_statuses$ = null;
    $count_hl_supports_in_hypothetical_contextsP$ = null;
    $count_deduced_assertions_in_hypothetical_contextsP$ = null;
    $gather_required_vocab_set$ = null;
    $gather_required_vocab_trace$ = null;
    $kbq_query_set_inference_vocab_set$ = null;
    $sym0$START_SPARQL_SERVER = makeSymbol( "START-SPARQL-SERVER" );
    $sym1$START_EXTERNAL_SPARQL_PROCESS = makeSymbol( "START-EXTERNAL-SPARQL-PROCESS" );
    $kw2$SPARQL = makeKeyword( "SPARQL" );
    $list3 = ConsesLow.list( makeKeyword( "EXTERNAL" ), makeSymbol( "START-EXTERNAL-SPARQL-PROCESS" ) );
    $kw4$ALL = makeKeyword( "ALL" );
    $kw5$NONE = makeKeyword( "NONE" );
    $list6 = ConsesLow.list( makeKeyword( "OPEN" ), makeKeyword( "CLOSED" ) );
    $list7 = ConsesLow.list( makeKeyword( "ANSWERABLE" ), makeKeyword( "UNANSWERABLE" ) );
    $str8$Unhandled_inference_property__S = makeString( "Unhandled inference property ~S" );
    $kw9$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw10$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw11$MAX_STEP = makeKeyword( "MAX-STEP" );
    $kw12$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw13$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw14$BLOCK_ = makeKeyword( "BLOCK?" );
    $kw15$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw16$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw17$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw18$FORGET_EXTRA_RESULTS_ = makeKeyword( "FORGET-EXTRA-RESULTS?" );
    $kw19$FORWARD_MAX_TIME = makeKeyword( "FORWARD-MAX-TIME" );
    $kw20$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw21$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw22$MIN_RULE_UTILITY = makeKeyword( "MIN-RULE-UTILITY" );
    $kw23$METRICS = makeKeyword( "METRICS" );
    $kw24$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $kw25$RETURN = makeKeyword( "RETURN" );
    $kw26$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" );
    $kw27$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $kw29$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw30$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $kw31$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $kw32$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $kw33$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw34$EVENTS = makeKeyword( "EVENTS" );
    $kw35$FORBIDDEN_RULES = makeKeyword( "FORBIDDEN-RULES" );
    $kw36$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw37$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $kw38$TRANSITIVE_CLOSURE_MODE = makeKeyword( "TRANSITIVE-CLOSURE-MODE" );
    $kw39$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $kw40$PROOF_SPEC = makeKeyword( "PROOF-SPEC" );
    $kw41$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" );
    $kw42$ABDUCTION_ALLOWED_ = makeKeyword( "ABDUCTION-ALLOWED?" );
    $kw43$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw44$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $kw45$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw46$DIRECTION = makeKeyword( "DIRECTION" );
    $kw47$EQUALITY_REASONING_DOMAIN = makeKeyword( "EQUALITY-REASONING-DOMAIN" );
    $kw48$EQUALITY_REASONING_METHOD = makeKeyword( "EQUALITY-REASONING-METHOD" );
    $kw49$EVALUATE_SUBL_ALLOWED_ = makeKeyword( "EVALUATE-SUBL-ALLOWED?" );
    $kw50$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw51$MAX_PROBLEM_COUNT = makeKeyword( "MAX-PROBLEM-COUNT" );
    $kw52$NEGATION_BY_FAILURE_ = makeKeyword( "NEGATION-BY-FAILURE?" );
    $kw53$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw54$PROBLEM_STORE_NAME = makeKeyword( "PROBLEM-STORE-NAME" );
    $kw55$REMOVAL_ALLOWED_ = makeKeyword( "REMOVAL-ALLOWED?" );
    $kw56$REWRITE_ALLOWED_ = makeKeyword( "REWRITE-ALLOWED?" );
    $kw57$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $str58$Unhandled_problem_store_property_ = makeString( "Unhandled problem store property ~S" );
    $kw59$POS = makeKeyword( "POS" );
    $sym60$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $const61$sentenceTruth = constant_handles.reader_make_constant_shell( makeString( "sentenceTruth" ) );
    $str62$Got_more_than_2_answers_for__a_wh = makeString( "Got more than 2 answers for ~a where #$True and #$False were expected to be the only possible answers" );
    $kw63$SKIP = makeKeyword( "SKIP" );
    $sym64$SINGLETON_ = makeSymbol( "SINGLETON?" );
    $const65$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const66$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $str67$No_true_answer_for__a = makeString( "No true answer for ~a" );
    $str68$No_false_answer_for__a = makeString( "No false answer for ~a" );
    $sym69$INFERENCE_ANSWER_JUSTIFICATION_TO_TRUE_TMS_DEDUCTION_SPEC = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-TO-TRUE-TMS-DEDUCTION-SPEC" );
    $sym70$INFERENCE_ANSWER_JUSTIFICATION_TO_FALSE_TMS_DEDUCTION_SPEC = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-TO-FALSE-TMS-DEDUCTION-SPEC" );
    $sym71$INFERENCE_ANSWER__ = makeSymbol( "INFERENCE-ANSWER-<" );
    $sym72$FIRST = makeSymbol( "FIRST" );
    $kw73$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $list74 = ConsesLow.list( makeSymbol( "ANTECEDENT" ), makeSymbol( "CONSEQUENT" ) );
    $sym75$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $kw76$BINDINGS = makeKeyword( "BINDINGS" );
    $kw77$HL = makeKeyword( "HL" );
    $kw78$NEG = makeKeyword( "NEG" );
    $kw79$SPLIT = makeKeyword( "SPLIT" );
    $sym80$SATISFIED_PROBLEM_ = makeSymbol( "SATISFIED-PROBLEM?" );
    $sym81$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym82$THINKING_TASK_P = makeSymbol( "THINKING-TASK-P" );
    $str83$Inference__A_is_not_controlled_by = makeString( "Inference ~A is not controlled by the thread of thinking task ~A." );
    $sym84$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $sym85$SINGLE_CLAUSE_PROBLEM_QUERY_P = makeSymbol( "SINGLE-CLAUSE-PROBLEM-QUERY-P" );
    $sym86$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym87$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $sym88$QUERY_STATIC_PROPERTIES_P = makeSymbol( "QUERY-STATIC-PROPERTIES-P" );
    $list89 = ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "MODULE-TYPE" ), makeKeyword( "REMOVAL" ) ) );
    $str90$new_continuable_antecedent_infere = makeString( "new-continuable-antecedent-inference could not find the transformed problem for ~s in ~s" );
    $kw91$TAB_DELIMITED = makeKeyword( "TAB-DELIMITED" );
    $kw92$OUTPUT = makeKeyword( "OUTPUT" );
    $sym93$STRINGP = makeSymbol( "STRINGP" );
    $str94$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym95$OUTPUT_STREAM_P = makeSymbol( "OUTPUT-STREAM-P" );
    $kw96$XML = makeKeyword( "XML" );
    $kw97$ALCHEMY = makeKeyword( "ALCHEMY" );
    $str98$Output_format__S_is_not_supported = makeString( "Output format ~S is not supported." );
    $str99$_A_C = makeString( "~A~C" );
    $str100$__ = makeString( "~%" );
    $str101$__ = makeString( "#$" );
    $list102 = ConsesLow.list( makeKeyword( "ANSWERABLE" ), makeKeyword( "UNANSWERABLE" ), makeKeyword( "UNKNOWN" ) );
    $kw103$NON_TRIVIAL = makeKeyword( "NON-TRIVIAL" );
    $kw104$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw105$MAINTAIN_TERM_WORKING_SET_ = makeKeyword( "MAINTAIN-TERM-WORKING-SET?" );
    $kw106$ANSWERABLE = makeKeyword( "ANSWERABLE" );
    $kw107$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $kw108$UNANSWERABLE = makeKeyword( "UNANSWERABLE" );
    $sym109$QUERY_LITERAL_ANSWERABILITY_STATUS = makeSymbol( "QUERY-LITERAL-ANSWERABILITY-STATUS" );
    $list110 = ConsesLow.list( makeSymbol( "LITERAL" ), makeSymbol( "ANSWERABILITY-STATUS" ) );
    $kw111$PREFERRED = makeKeyword( "PREFERRED" );
    $kw112$DISPREFERRED = makeKeyword( "DISPREFERRED" );
    $kw113$GROSSLY_DISPREFERRED = makeKeyword( "GROSSLY-DISPREFERRED" );
    $kw114$DISALLOWED = makeKeyword( "DISALLOWED" );
    $kw115$DOOMED = makeKeyword( "DOOMED" );
    $str116$unexpected_preference_level__s = makeString( "unexpected preference level ~s" );
    $sym117$QUERY_TERM_ARG_POSITION_ANSWERABILITY_STATUS = makeSymbol( "QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS" );
    $sym118$QUERY_LITERAL_ANSWERABILITY_STATUS_ASYNCH = makeSymbol( "QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH" );
    $sym119$HANDLE_ANSWERABILITY_RESULT_TUPLE = makeSymbol( "HANDLE-ANSWERABILITY-RESULT-TUPLE" );
    $sym120$DNF_LITERALS = makeSymbol( "DNF-LITERALS" );
    $sym121$QUERY_LITERAL_SET_ANSWERABILITY_STATUS_VIA_CALLBACK = makeSymbol( "QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK" );
    $sym122$LISTP = makeSymbol( "LISTP" );
    $sym123$CALLBACK_P = makeSymbol( "CALLBACK-P" );
    $sym124$BOOLEANP = makeSymbol( "BOOLEANP" );
    $float125$0_01 = makeDouble( 0.01 );
    $list126 = ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "NEW-STATUS" ) );
    $sym127$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym128$INFERENCE_ANSWER_ARGUMENT_STRENGTH = makeSymbol( "INFERENCE-ANSWER-ARGUMENT-STRENGTH" );
    $const129$HypotheticalContext = constant_handles.reader_make_constant_shell( makeString( "HypotheticalContext" ) );
    $kw130$HYPOTHETICAL_MT_SUPPORT_COUNT = makeKeyword( "HYPOTHETICAL-MT-SUPPORT-COUNT" );
    $sym131$INFERENCE_ANSWER_P = makeSymbol( "INFERENCE-ANSWER-P" );
    $sym132$PROBLEM_STORE_P = makeSymbol( "PROBLEM-STORE-P" );
    $const133$AbsoluteCycProblemStoreFn = constant_handles.reader_make_constant_shell( makeString( "AbsoluteCycProblemStoreFn" ) );
    $const134$CycInferenceFn = constant_handles.reader_make_constant_shell( makeString( "CycInferenceFn" ) );
    $const135$Computer = constant_handles.reader_make_constant_shell( makeString( "Computer" ) );
    $kw136$DENOT = makeKeyword( "DENOT" );
    $const137$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $str138$Couldn_t_find_a_term_representing = makeString( "Couldn't find a term representing this machine based on its name ~S." );
    $const139$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list140 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Computer" ) ) );
    $const141$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $const142$CycImageFn = constant_handles.reader_make_constant_shell( makeString( "CycImageFn" ) );
    $const143$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const144$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $const145$MtTimeDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) );
    $const146$cycProblemStoreLinkCount = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreLinkCount" ) );
    $const147$cycProblemStoreProblemCount = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblemCount" ) );
    $const148$cycProblemStoreProofCount = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProofCount" ) );
    $sym149$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $const150$inferenceStartTime = constant_handles.reader_make_constant_shell( makeString( "inferenceStartTime" ) );
    $const151$SecondsDuration = constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) );
    $const152$inferenceTimeToFirstAnswer = constant_handles.reader_make_constant_shell( makeString( "inferenceTimeToFirstAnswer" ) );
    $const153$inferenceTimeToLastAnswer = constant_handles.reader_make_constant_shell( makeString( "inferenceTimeToLastAnswer" ) );
    $const154$inferenceAnswerCount = constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerCount" ) );
    $const155$inferenceBindings = constant_handles.reader_make_constant_shell( makeString( "inferenceBindings" ) );
    $sym156$QUERY_LITERAL_REMOVAL_COST = makeSymbol( "QUERY-LITERAL-REMOVAL-COST" );
    $sym157$ATOMIC_SENTENCE_ = makeSymbol( "ATOMIC-SENTENCE?" );
    $const158$bridgingPredicateForPredicate = constant_handles.reader_make_constant_shell( makeString( "bridgingPredicateForPredicate" ) );
    $kw159$GAF = makeKeyword( "GAF" );
    $list160 = ConsesLow.list( makeSymbol( "BRIDGING-ARGNUM" ), makeSymbol( "ARGNUM" ) );
    $list161 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "BIND" ),
        makeSymbol( "ARG1" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COL" ) ) );
    $sym162$COL = makeSymbol( "COL" );
    $sym163$ARG1 = makeSymbol( "ARG1" );
    $kw164$BREADTH = makeKeyword( "BREADTH" );
    $kw165$QUEUE = makeKeyword( "QUEUE" );
    $kw166$STACK = makeKeyword( "STACK" );
    $sym167$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw168$ERROR = makeKeyword( "ERROR" );
    $str169$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym170$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw171$CERROR = makeKeyword( "CERROR" );
    $str172$continue_anyway = makeString( "continue anyway" );
    $kw173$WARN = makeKeyword( "WARN" );
    $str174$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const175$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const176$rdf_type = constant_handles.reader_make_constant_shell( makeString( "rdf-type" ) );
    $str177$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str178$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str179$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym180$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const181$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const182$logicalResultSetCardinalityWRTVal = constant_handles.reader_make_constant_shell( makeString( "logicalResultSetCardinalityWRTValue" ) );
    $kw183$TRUE = makeKeyword( "TRUE" );
    $const184$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell( makeString( "meaningSentenceOfSchema" ) );
    $kw185$IMPOSSIBLE = makeKeyword( "IMPOSSIBLE" );
    $list186 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "PRODUCTIVITY" ), makeSymbol( "COMPLETENESS" ) );
    $kw187$COMPLETE = makeKeyword( "COMPLETE" );
    $list188 = ConsesLow.list( ConsesLow.list( makeSymbol( "FOCAL-ASENT-VAR" ), makeSymbol( "FOCAL-MT-VAR" ), makeSymbol( "FOCAL-SENSE-VAR" ), makeSymbol( "NON-FOCAL-CLAUSE-VAR" ), makeSymbol( "CLAUSE" ), makeSymbol(
        "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list189 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw190$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw191$DONE = makeKeyword( "DONE" );
    $sym192$CLAUSE_VAR = makeUninternedSymbol( "CLAUSE-VAR" );
    $sym193$INDEX_VAR = makeUninternedSymbol( "INDEX-VAR" );
    $sym194$CLET = makeSymbol( "CLET" );
    $sym195$DO_CONTEXTUALIZED_CLAUSE_LITERALS = makeSymbol( "DO-CONTEXTUALIZED-CLAUSE-LITERALS" );
    $kw196$INDEX = makeKeyword( "INDEX" );
    $sym197$CLAUSE_WITHOUT_LITERAL = makeSymbol( "CLAUSE-WITHOUT-LITERAL" );
    $sym198$CONTEXTUALIZED_DNF_CLAUSE_P = makeSymbol( "CONTEXTUALIZED-DNF-CLAUSE-P" );
    $list199 = ConsesLow.list( makeSymbol( "CANDIDATE-MT" ), makeSymbol( "CANDIDATE-ASENT" ) );
    $sym200$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym201$MEMOIZED_LITERAL_REMOVAL_OPTIONS = makeSymbol( "MEMOIZED-LITERAL-REMOVAL-OPTIONS" );
    $kw202$TACTICAL = makeKeyword( "TACTICAL" );
    $kw203$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
    $sym204$PROOF_P = makeSymbol( "PROOF-P" );
    $sym205$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $kw206$REMOVAL = makeKeyword( "REMOVAL" );
    $kw207$RESTRICTION = makeKeyword( "RESTRICTION" );
    $list208 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $kw209$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $sym210$FORT_P = makeSymbol( "FORT-P" );
    $str211$__added__S = makeString( "~%added ~S" );
    $sym212$GATHER_REQUIRED_VOCAB_HANDLER = makeSymbol( "GATHER-REQUIRED-VOCAB-HANDLER" );
    $sym213$GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT = makeSymbol( "GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET-INT" );
    $kw214$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $str215$Gathering_vocab_from_KBQ_inferenc = makeString( "Gathering vocab from KBQ inferences" );
    $kw216$OUTLIER_TIMEOUT = makeKeyword( "OUTLIER-TIMEOUT" );
    $kw217$OVERRIDING_QUERY_PROPERTIES = makeKeyword( "OVERRIDING-QUERY-PROPERTIES" );
    $kw218$ADDITIONAL_ARGS = makeKeyword( "ADDITIONAL-ARGS" );
    $list219 = ConsesLow.list( makeSymbol( "VOCAB-SET" ), makeSymbol( "RULE-SET" ) );
    $str220$___a___a__a__ = makeString( "~&~a: ~a ~a~%" );
    $sym221$PROBLEM_STORE_LINK_ID_MAP = makeSymbol( "PROBLEM-STORE-LINK-ID-MAP" );
    $sym222$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $kw223$ROOT = makeKeyword( "ROOT" );
    $sym224$PROBLEM_SUID = makeSymbol( "PROBLEM-SUID" );
    $sym225$QUERY_ANSWERABILITY_STATUS = makeSymbol( "QUERY-ANSWERABILITY-STATUS" );
    $kw226$TEST = makeKeyword( "TEST" );
    $kw227$OWNER = makeKeyword( "OWNER" );
    $kw228$CLASSES = makeKeyword( "CLASSES" );
    $kw229$KB = makeKeyword( "KB" );
    $kw230$FULL = makeKeyword( "FULL" );
    $kw231$WORKING_ = makeKeyword( "WORKING?" );
    $list232 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Dog" ) ),
        makeSymbol( "?X" ) ) ), makeKeyword( "ANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "likesAsFriend" ) ), constant_handles
            .reader_make_constant_shell( makeString( "Dog" ) ), makeSymbol( "?X" ) ) ), makeKeyword( "UNANSWERABLE" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "performsActsOfType-Percentage" ) ), makeSymbol( "?AGENT" ), makeSymbol( "?COL1" ), makeSymbol( "?COL2" ), makeSymbol( "?RATIO" ) ) ), makeKeyword( "UNKNOWN" ) ), ConsesLow.list( ConsesLow
                    .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ratioOfCollectionToDifferentiatedCollection" ) ), makeSymbol( "?MOD" ), makeSymbol( "?COLL" ), makeSymbol( "?DIFF" ),
                        makeSymbol( "?CARD-DIFF" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER ) ), makeKeyword(
                            "UNKNOWN" ) ) );
    $list233 = _constant_233_initializer();
  }
}
/*
 * 
 * Total time: 1938 ms synthetic
 */