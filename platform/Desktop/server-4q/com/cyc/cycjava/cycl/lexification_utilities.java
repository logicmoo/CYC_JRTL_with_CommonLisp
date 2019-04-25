package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexification_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexification_utilities";
  public static final String myFingerPrint = "4726a48153d58acdb611e5671afc8f11282aefc377590f12c8806f63139e370b";
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 1528L)
  public static SubLSymbol $lex_none$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 1790L)
  public static SubLSymbol $lex_always$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 1858L)
  public static SubLSymbol $lex_basic$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 1914L)
  public static SubLSymbol $lex_warning$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 1984L)
  public static SubLSymbol $lex_detailed$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2066L)
  public static SubLSymbol $lex_verbose$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2153L)
  public static SubLSymbol $lex_very_detailed$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2238L)
  public static SubLSymbol $lex_very_verbose$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2328L)
  public static SubLSymbol $lex_most_detailed$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2418L)
  public static SubLSymbol $lex_most_verbose$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2508L)
  public static SubLSymbol $lex_all$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2577L)
  public static SubLSymbol $lex_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2661L)
  public static SubLSymbol $lexification_check_max_days$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2778L)
  public static SubLSymbol $lexification_reviewer$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 3155L)
  public static SubLSymbol $num_predicate_examples$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 3270L)
  private static SubLSymbol $lex_white_space_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 3393L)
  private static SubLSymbol $lex_punctuation_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 19325L)
  private static SubLSymbol $keyword_for_pos_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20069L)
  private static SubLSymbol $precise_keyword_for_pos_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20883L)
  private static SubLSymbol $keyword_for_pred_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 21184L)
  private static SubLSymbol $precise_keyword_for_pred_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 22851L)
  private static SubLSymbol $pluralize_word_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23151L)
  private static SubLSymbol $singularize_word_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23354L)
  private static SubLSymbol $basic_preds_for_part_of_speech_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23828L)
  private static SubLSymbol $find_root_wordform_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 26635L)
  private static SubLSymbol $is_abbreviation_predicate_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 27311L)
  private static SubLSymbol $examples_for_pred_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 49631L)
  private static SubLSymbol $terrorist_attack_lexification_worksP$;
  private static final SubLSymbol $sym0$_LEXIFICATION_CHECK_MAX_DAYS_;
  private static final SubLInteger $int1$30;
  private static final SubLSymbol $sym2$_LEXIFICATION_REVIEWER_;
  private static final SubLSymbol $sym3$FORT_P;
  private static final SubLSymbol $sym4$_NUM_PREDICATE_EXAMPLES_;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PWHEN;
  private static final SubLSymbol $sym8$__;
  private static final SubLSymbol $sym9$_LEX_TRACE_LEVEL_;
  private static final SubLSymbol $sym10$FORMAT;
  private static final SubLSymbol $sym11$_TRACE_OUTPUT_;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$LEX_TRACE;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$CCONCATENATE;
  private static final SubLString $str17$Warning__;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$PUNLESS;
  private static final SubLSymbol $sym24$LEX_WARN;
  private static final SubLString $str25$____assertion_failed___a______;
  private static final SubLSymbol $sym26$QUOTE;
  private static final SubLList $list27;
  private static final SubLString $str28$Finding_unlexified_terms___;
  private static final SubLSymbol $sym29$DO_CONSTANTS;
  private static final SubLSymbol $sym30$UNLEXIFIED_;
  private static final SubLString $str31$Looking_for_unlexified_FORTs_crea;
  private static final SubLString $str32$_in_last_;
  private static final SubLString $str33$_days___;
  private static final SubLString $str34$cdolist;
  private static final SubLSymbol $sym35$INDEXED_TERM_P;
  private static final SubLSymbol $sym36$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const37$EverythingPSC;
  private static final SubLObject $const38$termDoesntNeedLexification;
  private static final SubLObject $const39$instancesDontNeedLexification;
  private static final SubLObject $const40$quotedInstancesDontNeedLexificati;
  private static final SubLSymbol $sym41$STRINGP;
  private static final SubLSymbol $kw42$SKIP;
  private static final SubLObject $const43$termStrings;
  private static final SubLObject $const44$and;
  private static final SubLObject $const45$conceptuallyRelated;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLObject $const49$TemporaryLexicalAssertionsMt;
  private static final SubLString $str50$char__a_next__a_next_next__a_run_;
  private static final SubLList $list51;
  private static final SubLString $str52$_Mt;
  private static final SubLString $str53$_G;
  private static final SubLString $str54$General_;
  private static final SubLString $str55$_;
  private static final SubLString $str56$___;
  private static final SubLString $str57$__;
  private static final SubLObject $const58$multiWordString;
  private static final SubLObject $const59$Know_TheWord;
  private static final SubLObject $const60$MassNoun;
  private static final SubLObject $const61$EnglishMt;
  private static final SubLString $str62$;
  private static final SubLSymbol $sym63$INTEGERP;
  private static final SubLInteger $int64$3600;
  private static final SubLInteger $int65$24;
  private static final SubLSymbol $kw66$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym67$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym68$_;
  private static final SubLSymbol $sym69$NUM_PREDICATE_EXTENT_INDEX;
  private static final SubLObject $const70$CycLReifiableDenotationalTerm;
  private static final SubLObject $const71$EnglishLexiconMt;
  private static final SubLSymbol $sym72$KEYWORD_FOR_POS;
  private static final SubLObject $const73$ProperNoun;
  private static final SubLSymbol $kw74$PROPER_NOUN;
  private static final SubLObject $const75$Determiner;
  private static final SubLSymbol $kw76$DET;
  private static final SubLObject $const77$Pronoun;
  private static final SubLSymbol $kw78$PRONOUN;
  private static final SubLObject $const79$Noun;
  private static final SubLSymbol $kw80$NOUN;
  private static final SubLObject $const81$Verb;
  private static final SubLSymbol $kw82$VERB;
  private static final SubLObject $const83$Adjective;
  private static final SubLSymbol $kw84$ADJECTIVE;
  private static final SubLObject $const85$Adverb;
  private static final SubLSymbol $kw86$ADVERB;
  private static final SubLObject $const87$Preposition;
  private static final SubLSymbol $kw88$PREP;
  private static final SubLObject $const89$Conjunction;
  private static final SubLSymbol $kw90$CONJ;
  private static final SubLSymbol $sym91$_KEYWORD_FOR_POS_CACHING_STATE_;
  private static final SubLInteger $int92$256;
  private static final SubLInteger $int93$100;
  private static final SubLSymbol $sym94$PRECISE_KEYWORD_FOR_POS;
  private static final SubLSymbol $kw95$MASS_NOUN;
  private static final SubLObject $const96$CountNoun;
  private static final SubLSymbol $kw97$SIMPLE_NOUN;
  private static final SubLObject $const98$AgentiveNoun;
  private static final SubLSymbol $kw99$AGENTIVE_NOUN;
  private static final SubLObject $const100$GerundiveNoun;
  private static final SubLSymbol $kw101$GERUNDIVE_NOUN;
  private static final SubLObject $const102$DeVerbalNoun;
  private static final SubLSymbol $kw103$DEVERBAL_NOUN;
  private static final SubLObject $const104$AuxVerb;
  private static final SubLSymbol $kw105$AUX;
  private static final SubLSymbol $sym106$_PRECISE_KEYWORD_FOR_POS_CACHING_STATE_;
  private static final SubLSymbol $sym107$KEYWORD_FOR_PRED;
  private static final SubLSymbol $sym108$_KEYWORD_FOR_PRED_CACHING_STATE_;
  private static final SubLSymbol $sym109$PRECISE_KEYWORD_FOR_PRED;
  private static final SubLSymbol $sym110$_PRECISE_KEYWORD_FOR_PRED_CACHING_STATE_;
  private static final SubLString $str111$invalid_formula____a__;
  private static final SubLObject $const112$Individual;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$PLURALIZE_WORD;
  private static final SubLSymbol $sym115$_PLURALIZE_WORD_CACHING_STATE_;
  private static final SubLInteger $int116$2048;
  private static final SubLInteger $int117$1024;
  private static final SubLSymbol $sym118$SINGULARIZE_WORD;
  private static final SubLSymbol $sym119$_SINGULARIZE_WORD_CACHING_STATE_;
  private static final SubLSymbol $sym120$BASIC_PREDS_FOR_PART_OF_SPEECH;
  private static final SubLSymbol $sym121$_BASIC_PREDS_FOR_PART_OF_SPEECH_CACHING_STATE_;
  private static final SubLInteger $int122$64;
  private static final SubLSymbol $sym123$FIND_ROOT_WORDFORM;
  private static final SubLSymbol $sym124$_FIND_ROOT_WORDFORM_CACHING_STATE_;
  private static final SubLSymbol $kw125$ALL;
  private static final SubLObject $const126$AllLexicalMicrotheoryPSC;
  private static final SubLSymbol $sym127$IS_ABBREVIATION_PREDICATE;
  private static final SubLObject $const128$arg2Isa;
  private static final SubLList $list129;
  private static final SubLList $list130;
  private static final SubLObject $const131$InferencePSC;
  private static final SubLSymbol $sym132$_IS_ABBREVIATION_PREDICATE_CACHING_STATE_;
  private static final SubLInteger $int133$128;
  private static final SubLInteger $int134$40;
  private static final SubLObject $const135$properNameStrings;
  private static final SubLSymbol $sym136$EXAMPLES_FOR_PRED;
  private static final SubLString $str137$examples_for_pred__a__a___;
  private static final SubLSymbol $sym138$_EXAMPLES_FOR_PRED_CACHING_STATE_;
  private static final SubLObject $const139$examples_Positive;
  private static final SubLList $list140;
  private static final SubLSymbol $kw141$GAF;
  private static final SubLSymbol $kw142$DEFAULT;
  private static final SubLString $str143$try_lex_assert__s_in_MT__a__;
  private static final SubLObject $const144$toBeReviewedBy;
  private static final SubLObject $const145$ist;
  private static final SubLObject $const146$BookkeepingMt;
  private static final SubLString $str147$try_lex_assert_now__s_in_MT__a__;
  private static final SubLObject $const148$DeadTerm;
  private static final SubLString $str149$DeadTerm;
  private static final SubLObject $const150$preferredTermStrings;
  private static final SubLSymbol $kw151$ANY;
  private static final SubLSymbol $sym152$ASSERTION_P;
  private static final SubLSymbol $sym153$PPH_STRING_TO_CYCL;
  private static final SubLSymbol $sym154$CYCL_FORMULAIC_SENTENCE_P;
  private static final SubLSymbol $sym155$_EXIT;
  private static final SubLObject $const156$nameableCollection;
  private static final SubLObject $const157$comment;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLList $list161;
  private static final SubLList $list162;
  private static final SubLList $list163;
  private static final SubLList $list164;
  private static final SubLObject $const165$HeadInitialMultiWordPhrasePred;
  private static final SubLObject $const166$isa;
  private static final SubLSymbol $kw167$BREADTH;
  private static final SubLSymbol $kw168$QUEUE;
  private static final SubLSymbol $kw169$STACK;
  private static final SubLSymbol $sym170$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw171$ERROR;
  private static final SubLString $str172$_A_is_not_a__A;
  private static final SubLSymbol $sym173$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw174$CERROR;
  private static final SubLString $str175$continue_anyway;
  private static final SubLSymbol $kw176$WARN;
  private static final SubLString $str177$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str178$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str179$attempting_to_bind_direction_link;
  private static final SubLList $list180;
  private static final SubLString $str181$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLList $list182;
  private static final SubLObject $const183$HeadFinalMultiWordPhrasePred;
  private static final SubLList $list184;
  private static final SubLObject $const185$HeadMedialMultiWordPhrasePred;
  private static final SubLSymbol $kw186$INITIAL;
  private static final SubLSymbol $kw187$FINAL;
  private static final SubLSymbol $kw188$MEDIAL;
  private static final SubLString $str189$word__a_usage___a__;
  private static final SubLString $str190$Setting_new_guessed_headword_to__;
  private static final SubLSymbol $sym191$CYCL_STRING__;
  private static final SubLSymbol $sym192$POSSIBLY_LEXIFY_TERRORIST_ATTACK;
  private static final SubLObject $const193$definiteDescriptions;
  private static final SubLSymbol $kw194$DONE;
  private static final SubLList $list195;
  private static final SubLObject $const196$TerrorismLexicalMt;
  private static final SubLSymbol $kw197$FORWARD;
  private static final SubLList $list198;
  private static final SubLList $list199;
  private static final SubLSymbol $kw200$PROBLEM_STORE;
  private static final SubLList $list201;

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2896L)
  public static SubLObject lexification_reviewer()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $lexification_reviewer$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 2970L)
  public static SubLObject set_lexification_reviewer(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cyclist && !assertionsDisabledInClass && NIL == forts.fort_p( cyclist ) )
    {
      throw new AssertionError( cyclist );
    }
    $lexification_reviewer$.setDynamicValue( cyclist, thread );
    return $lexification_reviewer$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 3698L)
  public static SubLObject lex_trace(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject format_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    format_spec = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym7$PWHEN, ConsesLow.list( $sym8$__, $sym9$_LEX_TRACE_LEVEL_, level ), ConsesLow.listS( $sym10$FORMAT, $sym11$_TRACE_OUTPUT_, format_spec, ConsesLow.append( args, NIL ) ), $list12 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 4208L)
  public static SubLObject lex_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    format_spec = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym14$LEX_TRACE, $list15, ConsesLow.list( $sym16$CCONCATENATE, $str17$Warning__, format_spec ), ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 4440L)
  public static SubLObject lex_debug(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    form = current.first();
    final SubLObject optional_forms;
    current = ( optional_forms = current.rest() );
    return ConsesLow.listS( $sym7$PWHEN, $list19, form, ConsesLow.append( optional_forms, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 4776L)
  public static SubLObject lex_if_level(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject trace_level = NIL;
    SubLObject form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    trace_level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    form = current.first();
    final SubLObject optional_forms;
    current = ( optional_forms = current.rest() );
    return ConsesLow.listS( $sym7$PWHEN, $list19, form, ConsesLow.append( optional_forms, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 5141L)
  public static SubLObject lex_debug_out(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    format_spec = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym14$LEX_TRACE, $list21, format_spec, ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 5345L)
  public static SubLObject lex_debug_on(SubLObject trace_level)
  {
    if( trace_level == UNPROVIDED )
    {
      trace_level = $lex_verbose$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $lex_trace_level$.setDynamicValue( trace_level, thread );
    return $lex_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 5614L)
  public static SubLObject lex_assertion(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym23$PUNLESS, expression, ConsesLow.list( $sym24$LEX_WARN, $str25$____assertion_failed___a______, ConsesLow.list( $sym26$QUOTE, expression ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 6150L)
  public static SubLObject do_unlexified_terms(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    var = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str28$Finding_unlexified_terms___;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list27 );
    current = current.rest();
    final SubLObject allow_termstringsP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list27 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym29$DO_CONSTANTS, ConsesLow.list( var, message ), ConsesLow.listS( $sym7$PWHEN, ConsesLow.list( $sym30$UNLEXIFIED_, var, allow_termstringsP ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 6751L)
  public static SubLObject unlexified_terms_for_cyclist(final SubLObject cyclist, SubLObject max_days, SubLObject check_termstringsP)
  {
    if( max_days == UNPROVIDED )
    {
      max_days = $lexification_check_max_days$.getGlobalValue();
    }
    if( check_termstringsP == UNPROVIDED )
    {
      check_termstringsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject unlexified_forts = NIL;
    final SubLObject start_date = n_universal_days_ago( max_days );
    final SubLObject todays_date = universal_time_to_universal_date( Time.get_universal_time() );
    final SubLObject list_var;
    final SubLObject cyclist_forts = list_var = kb_utilities.constants_created_between( start_date, todays_date, cyclist );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str31$Looking_for_unlexified_FORTs_crea, new SubLObject[] { format_nil.format_nil_s_no_copy( cyclist ), $str32$_in_last_, format_nil
          .format_nil_d_no_copy( max_days ), $str33$_days___
      } ) ) ? Sequences.cconcatenate( $str31$Looking_for_unlexified_FORTs_crea, new SubLObject[] { format_nil.format_nil_s_no_copy( cyclist ), $str32$_in_last_, format_nil.format_nil_d_no_copy( max_days ),
        $str33$_days___
      } ) : $str34$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject fort = NIL;
        fort = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL != unlexifiedP( fort, check_termstringsP ) )
          {
            unlexified_forts = ConsesLow.cons( fort, unlexified_forts );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          fort = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return unlexified_forts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 7680L)
  public static SubLObject lexification_not_neededP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( fort ) : fort;
    SubLObject not_neededP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
      if( NIL != kb_mapping_utilities.pred_values( fort, $const38$termDoesntNeedLexification, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        not_neededP = T;
      }
      else if( NIL != isa.isa_anyP( fort, kb_mapping_utilities.pred_refs( $const39$instancesDontNeedLexification, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        not_neededP = T;
      }
      else if( NIL != isa.quoted_isa_anyP( fort, kb_mapping_utilities.pred_refs( $const40$quotedInstancesDontNeedLexificati, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        not_neededP = T;
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return not_neededP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 8254L)
  public static SubLObject unlexifiedP(final SubLObject fort, SubLObject allow_termstringsP)
  {
    if( allow_termstringsP == UNPROVIDED )
    {
      allow_termstringsP = NIL;
    }
    assert NIL != kb_indexing_datastructures.indexed_term_p( fort ) : fort;
    SubLObject is_unlexified = NIL;
    if( NIL == lexification_not_neededP( fort ) )
    {
      is_unlexified = Types.sublisp_null( lexicon_utilities.lexifications_for_term( fort, allow_termstringsP, ONE_INTEGER, UNPROVIDED ) );
    }
    return is_unlexified;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 9026L)
  public static SubLObject lexifiedP(final SubLObject fort, SubLObject allow_termstringsP)
  {
    if( allow_termstringsP == UNPROVIDED )
    {
      allow_termstringsP = NIL;
    }
    return makeBoolean( NIL == unlexifiedP( fort, allow_termstringsP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 9204L)
  public static SubLObject generalization_is_lexifiedP(final SubLObject v_term)
  {
    SubLObject lexified = NIL;
    if( NIL != pph_utilities.pph_relationP( v_term ) )
    {
      if( NIL == lexified )
      {
        SubLObject csome_list_var = pph_utilities.pph_all_genl_relations( v_term );
        SubLObject genl_relation = NIL;
        genl_relation = csome_list_var.first();
        while ( NIL == lexified && NIL != csome_list_var)
        {
          if( NIL == lexicon_utilities.missing_generation_assertion( genl_relation ) )
          {
            lexified = genl_relation;
          }
          csome_list_var = csome_list_var.rest();
          genl_relation = csome_list_var.first();
        }
      }
      if( NIL == lexified )
      {
        SubLObject csome_list_var = genl_predicates.all_genl_inverses( v_term, UNPROVIDED, UNPROVIDED );
        SubLObject genl_relation = NIL;
        genl_relation = csome_list_var.first();
        while ( NIL == lexified && NIL != csome_list_var)
        {
          if( NIL == lexicon_utilities.missing_generation_assertion( genl_relation ) )
          {
            lexified = genl_relation;
          }
          csome_list_var = csome_list_var.rest();
          genl_relation = csome_list_var.first();
        }
      }
    }
    return Values.values( list_utilities.sublisp_boolean( lexified ), lexified );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 9871L)
  public static SubLObject get_unlexified_terms(SubLObject allow_termstringsP, SubLObject max_num)
  {
    if( allow_termstringsP == UNPROVIDED )
    {
      allow_termstringsP = NIL;
    }
    if( max_num == UNPROVIDED )
    {
      max_num = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject max_count = ( NIL != max_num ) ? max_num : forts.fort_count();
    SubLObject term_list = NIL;
    final SubLObject idx = constant_handles.do_constants_table();
    final SubLObject mess = $str28$Finding_unlexified_terms___;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
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
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$2 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$2, $kw42$SKIP ) )
        {
          final SubLObject idx_$3 = idx_$2;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw42$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject v_term;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              v_term = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( v_term ) || NIL == id_index.id_index_skip_tombstones_p( $kw42$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( v_term ) )
                {
                  v_term = $kw42$SKIP;
                }
                if( NIL != unlexifiedP( v_term, allow_termstringsP ) && !count.numGE( max_count ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                  term_list = ConsesLow.cons( v_term, term_list );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$4 = idx_$2;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) || NIL == id_index.id_index_skip_tombstones_p( $kw42$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$4 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$4 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$4 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw42$SKIP ) ) ? NIL : $kw42$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject v_term2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw42$SKIP ) || NIL == id_index.id_index_tombstone_p( v_term2 ) )
              {
                if( NIL != unlexifiedP( v_term2, allow_termstringsP ) && !count.numGE( max_count ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                  term_list = ConsesLow.cons( v_term2, term_list );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
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
    return term_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 10349L)
  public static SubLObject get_termstring_assertions_for_cyclist(SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLObject mt = lexical_mt_for_cyclist( cyclist );
    return kb_mapping.gather_predicate_extent_index( $const43$termStrings, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 10695L)
  public static SubLObject lexical_mt_for_cyclist(SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLObject mt = inference_kernel.new_cyc_query( ConsesLow.listS( $const44$and, ConsesLow.listS( $const45$conceptuallyRelated, cyclist, $list46 ), $list47 ), $const37$EverythingPSC, $list48 ).first();
    return ( NIL != mt ) ? mt : $const49$TemporaryLexicalAssertionsMt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 11118L)
  public static SubLObject acronym_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.upper_case_p( v_char ) || NIL != Characters.digit_char_p( v_char, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 11684L)
  public static SubLObject regroup_acronyms(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_length = Sequences.length( string );
    final SubLObject new_string = Strings.make_string( old_length, UNPROVIDED );
    SubLObject run_len = ZERO_INTEGER;
    SubLObject new_index = MINUS_ONE_INTEGER;
    SubLObject end_var_$6;
    SubLObject end_var;
    SubLObject index;
    SubLObject v_char;
    SubLObject next_char;
    SubLObject next_next_char;
    for( end_var = ( end_var_$6 = Sequences.length( string ) ), index = NIL, index = ZERO_INTEGER; !index.numGE( end_var_$6 ); index = number_utilities.f_1X( index ) )
    {
      v_char = Strings.sublisp_char( string, index );
      next_char = string_utilities.char_at( string, Numbers.add( index, ONE_INTEGER ) );
      next_next_char = string_utilities.char_at( string, Numbers.add( index, TWO_INTEGER ) );
      if( !v_char.eql( Characters.CHAR_space ) || NIL == acronym_char_p( next_char ) || ( !next_next_char.eql( Characters.CHAR_space ) && next_next_char != NIL ) || !run_len.numE( ONE_INTEGER ) )
      {
        new_index = Numbers.add( new_index, ONE_INTEGER );
        Strings.set_char( new_string, new_index, v_char );
      }
      if( $lex_trace_level$.getDynamicValue( thread ).numGE( $lex_very_verbose$.getGlobalValue() ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str50$char__a_next__a_next_next__a_run_, new SubLObject[] { v_char, next_char, next_next_char, run_len, new_index
        } );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      if( NIL != acronym_char_p( v_char ) )
      {
        run_len = Numbers.add( run_len, ONE_INTEGER );
      }
      else
      {
        run_len = ZERO_INTEGER;
      }
    }
    return string_utilities.trim_sides( new_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 13222L)
  public static SubLObject phrase_from_term(final SubLObject v_term, SubLObject retain_caseP)
  {
    if( retain_caseP == UNPROVIDED )
    {
      retain_caseP = NIL;
    }
    SubLObject phrase = ( NIL != constant_handles.constant_p( v_term ) ) ? regroup_acronyms( kb_utilities.string_for_unlexified_term( v_term, UNPROVIDED ) )
        : pph_main.generate_phrase( v_term, $list51, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == cyc_individual_constantP( v_term ) && NIL == retain_caseP )
    {
      phrase = Strings.string_downcase( phrase, UNPROVIDED, UNPROVIDED );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 13876L)
  public static SubLObject cyc_individual_constantP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject is_individual = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
      if( NIL == fort_types_interface.fort_types( v_term, UNPROVIDED ) )
      {
        is_individual = T;
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return is_individual;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 14268L)
  public static SubLObject phrase_for_mt(final SubLObject mt)
  {
    SubLObject mt_phrase = phrase_from_term( mt, T );
    mt_phrase = string_utilities.strip_trailer( mt_phrase, $str52$_Mt );
    if( NIL != string_utilities.ends_with( mt_phrase, $str53$_G, UNPROVIDED ) )
    {
      mt_phrase = Sequences.cconcatenate( $str54$General_, string_utilities.strip_trailer( mt_phrase, $str53$_G ) );
    }
    mt_phrase = string_utilities.string_substitute( $str55$_, $str56$___, mt_phrase, UNPROVIDED );
    mt_phrase = string_utilities.string_substitute( $str55$_, $str57$__, mt_phrase, UNPROVIDED );
    return string_utilities.trim_whitespace( mt_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 14995L)
  public static SubLObject lexification_for_mt(final SubLObject mt)
  {
    final SubLObject tokenized_phrase = string_utilities.string_tokenize( phrase_for_mt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ConsesLow.list( $const58$multiWordString, tokenized_phrase, $const59$Know_TheWord, $const60$MassNoun, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 15358L)
  public static SubLObject lexify_mts(final SubLObject mt_list)
  {
    SubLObject cdolist_list_var = mt_list;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject formula = lexification_for_mt( mt );
      try_lex_assert( formula, $const61$EnglishMt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 15669L)
  public static SubLObject skip_mt_lexificationP(final SubLObject mt)
  {
    final SubLObject tokenized_phrase = string_utilities.string_tokenize( phrase_for_mt( mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject skipP = NIL;
    if( NIL == skipP )
    {
      SubLObject csome_list_var = tokenized_phrase;
      SubLObject word = NIL;
      word = csome_list_var.first();
      while ( NIL == skipP && NIL != csome_list_var)
      {
        if( NIL == list_utilities.proper_list_p( nl_trie.nl_trie_search( word, UNPROVIDED, UNPROVIDED ) ) && NIL == string_utilities.is_numericP( word ) )
        {
          skipP = T;
        }
        csome_list_var = csome_list_var.rest();
        word = csome_list_var.first();
      }
    }
    return skipP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 16308L)
  public static SubLObject all_specifiedP(final SubLObject list)
  {
    SubLObject unspecified = NIL;
    if( NIL == unspecified )
    {
      SubLObject csome_list_var = list;
      SubLObject item = NIL;
      item = csome_list_var.first();
      while ( NIL == unspecified && NIL != csome_list_var)
      {
        if( NIL == item || item.equal( $str62$ ) )
        {
          unspecified = T;
        }
        csome_list_var = csome_list_var.rest();
        item = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == unspecified );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 16818L)
  public static SubLObject universal_date_to_universal_time(final SubLObject yyyymmdd)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( yyyymmdd ) : yyyymmdd;
    thread.resetMultipleValues();
    final SubLObject month = numeric_date_utilities.decode_universal_date( yyyymmdd );
    final SubLObject day = thread.secondMultipleValue();
    final SubLObject year = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Time.encode_universal_time( ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, month, day, year, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 17127L)
  public static SubLObject universal_time_to_universal_date(final SubLObject universal_time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return numeric_date_utilities.encode_universal_date( day, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 17461L)
  public static SubLObject n_universal_days_ago(final SubLObject num_days)
  {
    final SubLObject today_seconds = Time.get_universal_time();
    final SubLObject seconds_per_day = Numbers.multiply( $int64$3600, $int65$24 );
    final SubLObject previous_seconds = Numbers.subtract( today_seconds, Numbers.multiply( num_days, seconds_per_day ) );
    return universal_time_to_universal_date( previous_seconds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 17769L)
  public static SubLObject extract_integer(final SubLObject numeric_string, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject value = v_default;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw66$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym67$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject num = reader.parse_integer( numeric_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != num )
          {
            value = num;
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw66$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 18054L)
  public static SubLObject sort_by_pred_usage(final SubLObject list)
  {
    return Sort.stable_sort( list, Symbols.symbol_function( $sym68$_ ), Symbols.symbol_function( $sym69$NUM_PREDICATE_EXTENT_INDEX ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 18330L)
  public static SubLObject most_specific_arg1_constraint(final SubLObject pred)
  {
    return most_specific_argn_constraint( pred, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 18500L)
  public static SubLObject most_specific_argn_constraint(final SubLObject pred, final SubLObject arg_pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constraint = $const70$CycLReifiableDenotationalTerm;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
      final SubLObject constraints = Sequences.remove( $const70$CycLReifiableDenotationalTerm, cardinality_estimates.sort_by_generality_estimate( kb_accessors.argn_isa( pred, arg_pos, UNPROVIDED ), UNPROVIDED ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != constraints )
      {
        constraint = constraints.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 19073L)
  public static SubLObject get_relation_argument_type(final SubLObject relation, SubLObject position)
  {
    return most_specific_argn_constraint( relation, position );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 19325L)
  public static SubLObject clear_keyword_for_pos()
  {
    final SubLObject cs = $keyword_for_pos_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 19325L)
  public static SubLObject remove_keyword_for_pos(final SubLObject pos, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $keyword_for_pos_caching_state$.getGlobalValue(), ConsesLow.list( pos, lexical_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 19325L)
  public static SubLObject keyword_for_pos_internal(final SubLObject pos, final SubLObject lexical_mt)
  {
    if( NIL != lexicon_accessors.genl_posP( pos, $const73$ProperNoun, lexical_mt ) )
    {
      return $kw74$PROPER_NOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const75$Determiner, lexical_mt ) )
    {
      return $kw76$DET;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const77$Pronoun, lexical_mt ) )
    {
      return $kw78$PRONOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const79$Noun, lexical_mt ) )
    {
      return $kw80$NOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const81$Verb, lexical_mt ) )
    {
      return $kw82$VERB;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const83$Adjective, lexical_mt ) )
    {
      return $kw84$ADJECTIVE;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const85$Adverb, lexical_mt ) )
    {
      return $kw86$ADVERB;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const87$Preposition, lexical_mt ) )
    {
      return $kw88$PREP;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const89$Conjunction, lexical_mt ) )
    {
      return $kw90$CONJ;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 19325L)
  public static SubLObject keyword_for_pos(final SubLObject pos, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    SubLObject caching_state = $keyword_for_pos_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym72$KEYWORD_FOR_POS, $sym91$_KEYWORD_FOR_POS_CACHING_STATE_, $int92$256, EQL, TWO_INTEGER, $int93$100 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pos, lexical_mt );
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
        if( pos.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && lexical_mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( keyword_for_pos_internal( pos, lexical_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos, lexical_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20069L)
  public static SubLObject clear_precise_keyword_for_pos()
  {
    final SubLObject cs = $precise_keyword_for_pos_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20069L)
  public static SubLObject remove_precise_keyword_for_pos(final SubLObject pos, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $precise_keyword_for_pos_caching_state$.getGlobalValue(), ConsesLow.list( pos, lexical_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20069L)
  public static SubLObject precise_keyword_for_pos_internal(final SubLObject pos, final SubLObject lexical_mt)
  {
    assert NIL != forts.fort_p( pos ) : pos;
    if( NIL != lexicon_accessors.genl_posP( pos, $const60$MassNoun, lexical_mt ) )
    {
      return $kw95$MASS_NOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const96$CountNoun, lexical_mt ) )
    {
      return $kw97$SIMPLE_NOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const98$AgentiveNoun, lexical_mt ) )
    {
      return $kw99$AGENTIVE_NOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const100$GerundiveNoun, lexical_mt ) )
    {
      return $kw101$GERUNDIVE_NOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const102$DeVerbalNoun, lexical_mt ) )
    {
      return $kw103$DEVERBAL_NOUN;
    }
    if( NIL != lexicon_accessors.genl_posP( pos, $const104$AuxVerb, lexical_mt ) )
    {
      return $kw105$AUX;
    }
    return keyword_for_pos( pos, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20069L)
  public static SubLObject precise_keyword_for_pos(final SubLObject pos, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    SubLObject caching_state = $precise_keyword_for_pos_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym94$PRECISE_KEYWORD_FOR_POS, $sym106$_PRECISE_KEYWORD_FOR_POS_CACHING_STATE_, $int92$256, EQL, TWO_INTEGER, $int93$100 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pos, lexical_mt );
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
        if( pos.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && lexical_mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( precise_keyword_for_pos_internal( pos, lexical_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos, lexical_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20883L)
  public static SubLObject clear_keyword_for_pred()
  {
    final SubLObject cs = $keyword_for_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20883L)
  public static SubLObject remove_keyword_for_pred(final SubLObject pred, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $keyword_for_pred_caching_state$.getGlobalValue(), ConsesLow.list( pred, lexical_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20883L)
  public static SubLObject keyword_for_pred_internal(final SubLObject pred, final SubLObject lexical_mt)
  {
    return keyword_for_pos( lexicon_accessors.pos_of_pred( pred ), lexical_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 20883L)
  public static SubLObject keyword_for_pred(final SubLObject pred, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    SubLObject caching_state = $keyword_for_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym107$KEYWORD_FOR_PRED, $sym108$_KEYWORD_FOR_PRED_CACHING_STATE_, $int92$256, EQL, TWO_INTEGER, $int93$100 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, lexical_mt );
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
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && lexical_mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( keyword_for_pred_internal( pred, lexical_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, lexical_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 21184L)
  public static SubLObject clear_precise_keyword_for_pred()
  {
    final SubLObject cs = $precise_keyword_for_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 21184L)
  public static SubLObject remove_precise_keyword_for_pred(final SubLObject pred, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $precise_keyword_for_pred_caching_state$.getGlobalValue(), ConsesLow.list( pred, lexical_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 21184L)
  public static SubLObject precise_keyword_for_pred_internal(final SubLObject pred, final SubLObject lexical_mt)
  {
    return precise_keyword_for_pos( lexicon_accessors.pos_of_pred( pred ), lexical_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 21184L)
  public static SubLObject precise_keyword_for_pred(final SubLObject pred, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const71$EnglishLexiconMt;
    }
    SubLObject caching_state = $precise_keyword_for_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym109$PRECISE_KEYWORD_FOR_PRED, $sym110$_PRECISE_KEYWORD_FOR_PRED_CACHING_STATE_, $int92$256, EQL, TWO_INTEGER, $int93$100 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, lexical_mt );
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
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && lexical_mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( precise_keyword_for_pred_internal( pred, lexical_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, lexical_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 21522L)
  public static SubLObject invalid_formulaP(final SubLObject formula, final SubLObject mt)
  {
    SubLObject status = NIL;
    if( NIL == wff.el_wffP( formula, mt, UNPROVIDED ) )
    {
      status = wff.explanation_of_why_not_wff( formula, mt, UNPROVIDED );
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 21825L)
  public static SubLObject invalid_lexificationP(final SubLObject formula, final SubLObject mt)
  {
    SubLObject status = invalid_formulaP( formula, mt );
    if( NIL != status )
    {
      status = PrintLow.format( NIL, $str111$invalid_formula____a__, status );
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 22175L)
  public static SubLObject lex_pos_for_keyword(final SubLObject pos_keyword)
  {
    return lexicon_accessors.pos_for_keyword( pos_keyword, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 22336L)
  public static SubLObject parts_of_speech(final SubLObject word_form)
  {
    SubLObject pos_list = lexicon_accessors.pos_of_string( word_form, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == pos_list )
    {
      SubLObject csome_list_var = lexicon_accessors.denots_of_string( word_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject denot = NIL;
      denot = csome_list_var.first();
      while ( NIL == pos_list && NIL != csome_list_var)
      {
        if( NIL != isa.isa_in_any_mtP( denot, $const112$Individual ) )
        {
          pos_list = $list113;
        }
        csome_list_var = csome_list_var.rest();
        denot = csome_list_var.first();
      }
    }
    return pos_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 22851L)
  public static SubLObject clear_pluralize_word()
  {
    final SubLObject cs = $pluralize_word_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 22851L)
  public static SubLObject remove_pluralize_word(final SubLObject word, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pluralize_word_caching_state$.getGlobalValue(), ConsesLow.list( word, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 22851L)
  public static SubLObject pluralize_word_internal(final SubLObject word, final SubLObject mt)
  {
    return morphology.pluralize_string( morphology.find_stem( word, $kw80$NOUN ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 22851L)
  public static SubLObject pluralize_word(final SubLObject word, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $pluralize_word_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym114$PLURALIZE_WORD, $sym115$_PLURALIZE_WORD_CACHING_STATE_, $int116$2048, EQUAL, TWO_INTEGER, $int117$1024 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word, mt );
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
        if( word.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pluralize_word_internal( word, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23151L)
  public static SubLObject clear_singularize_word()
  {
    final SubLObject cs = $singularize_word_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23151L)
  public static SubLObject remove_singularize_word(final SubLObject word, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $singularize_word_caching_state$.getGlobalValue(), ConsesLow.list( word, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23151L)
  public static SubLObject singularize_word_internal(final SubLObject word, final SubLObject mt)
  {
    return morphology.plural_noun_to_sg( word, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23151L)
  public static SubLObject singularize_word(final SubLObject word, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $singularize_word_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym118$SINGULARIZE_WORD, $sym119$_SINGULARIZE_WORD_CACHING_STATE_, $int116$2048, EQUAL, TWO_INTEGER, $int117$1024 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word, mt );
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
        if( word.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( singularize_word_internal( word, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23354L)
  public static SubLObject clear_basic_preds_for_part_of_speech()
  {
    final SubLObject cs = $basic_preds_for_part_of_speech_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23354L)
  public static SubLObject remove_basic_preds_for_part_of_speech(final SubLObject pos_keyword)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $basic_preds_for_part_of_speech_caching_state$.getGlobalValue(), ConsesLow.list( pos_keyword ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23354L)
  public static SubLObject basic_preds_for_part_of_speech_internal(final SubLObject pos_keyword)
  {
    return conses_high.intersection( lexicon_utilities.preds_for_keyword( pos_keyword ), lexicon_vars.$root_form_speech_parts$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23354L)
  public static SubLObject basic_preds_for_part_of_speech(final SubLObject pos_keyword)
  {
    SubLObject caching_state = $basic_preds_for_part_of_speech_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym120$BASIC_PREDS_FOR_PART_OF_SPEECH, $sym121$_BASIC_PREDS_FOR_PART_OF_SPEECH_CACHING_STATE_, $int122$64, EQ, ONE_INTEGER, TWELVE_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pos_keyword, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( basic_preds_for_part_of_speech_internal( pos_keyword ) ) );
      memoization_state.caching_state_put( caching_state, pos_keyword, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23828L)
  public static SubLObject clear_find_root_wordform()
  {
    final SubLObject cs = $find_root_wordform_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23828L)
  public static SubLObject remove_find_root_wordform(final SubLObject wordform)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $find_root_wordform_caching_state$.getGlobalValue(), ConsesLow.list( wordform ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23828L)
  public static SubLObject find_root_wordform_internal(final SubLObject wordform)
  {
    final SubLObject word_units_to_check = ConsesLow.append( lexicon_accessors.words_of_stringXpos( wordform, $kw82$VERB, UNPROVIDED, UNPROVIDED, UNPROVIDED ), lexicon_accessors.words_of_stringXpos( wordform, $kw80$NOUN,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ), lexicon_cache.words_of_string( wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject root = NIL;
    if( NIL == root )
    {
      SubLObject csome_list_var;
      SubLObject word_unit;
      for( csome_list_var = word_units_to_check, word_unit = NIL, word_unit = csome_list_var.first(); NIL == root && NIL != csome_list_var; root = lexicon_cache.ordered_strings_of_word_unit( word_unit,
          lexicon_vars.$root_form_speech_parts$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).first(), csome_list_var = csome_list_var.rest(), word_unit = csome_list_var.first() )
      {
      }
    }
    if( NIL == root )
    {
      SubLObject csome_list_var = lexicon_cache.words_of_string( wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject word_unit = NIL;
      word_unit = csome_list_var.first();
      while ( NIL == root && NIL != csome_list_var)
      {
        final SubLObject label = cb_utilities.cb_string_for_fort( word_unit );
        root = Strings.string_downcase( string_utilities.string_upto( label, Characters.CHAR_hyphen ), UNPROVIDED, UNPROVIDED );
        csome_list_var = csome_list_var.rest();
        word_unit = csome_list_var.first();
      }
    }
    if( NIL == root )
    {
      root = wordform;
    }
    return root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 23828L)
  public static SubLObject find_root_wordform(final SubLObject wordform)
  {
    SubLObject caching_state = $find_root_wordform_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym123$FIND_ROOT_WORDFORM, $sym124$_FIND_ROOT_WORDFORM_CACHING_STATE_, $int116$2048, EQUAL, ONE_INTEGER, $int117$1024 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, wordform, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( find_root_wordform_internal( wordform ) ) );
      memoization_state.caching_state_put( caching_state, wordform, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 24804L)
  public static SubLObject lexified_phrases_for_term(final SubLObject v_term, SubLObject include_preds)
  {
    if( include_preds == UNPROVIDED )
    {
      include_preds = $kw125$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject phrases = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_language_mt$.bind( $const126$AllLexicalMicrotheoryPSC, thread );
      phrases = Sequences.remove_duplicates( pph_methods_lexicon.all_phrases_for_term( v_term, include_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUALP ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_language_mt$.rebind( _prev_bind_0, thread );
    }
    return phrases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 25255L)
  public static SubLObject nonplural_lexified_phrases_for_term(final SubLObject v_term)
  {
    return lexified_phrases_for_term( v_term, lexicon_vars.$root_form_speech_parts$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 25496L)
  public static SubLObject join_words(final SubLObject word_list)
  {
    return string_utilities.bunge( word_list, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 25693L)
  public static SubLObject has_vowel(final SubLObject string)
  {
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( string ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL != morphology.vowel_charP( Strings.sublisp_char( string, i ), T ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 25892L)
  public static SubLObject guess_stem(final SubLObject wordform, SubLObject pos_keyword)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = $kw97$SIMPLE_NOUN;
    }
    SubLObject stem = morphology.find_stem( wordform, UNPROVIDED );
    if( stem.equalp( wordform ) && NIL == lexicon_cache.words_of_string( wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject test_stem = stem;
      final SubLObject pcase_var = pos_keyword;
      if( pcase_var.eql( $kw82$VERB ) )
      {
        test_stem = morphology.inflected_verb_to_infinitive( wordform );
      }
      else if( pcase_var.eql( $kw97$SIMPLE_NOUN ) )
      {
        test_stem = morphology.plural_noun_to_sg( wordform, UNPROVIDED );
      }
      if( NIL != has_vowel( test_stem ) )
      {
        stem = test_stem;
      }
    }
    return stem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 26635L)
  public static SubLObject clear_is_abbreviation_predicate()
  {
    final SubLObject cs = $is_abbreviation_predicate_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 26635L)
  public static SubLObject remove_is_abbreviation_predicate(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $is_abbreviation_predicate_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 26635L)
  public static SubLObject is_abbreviation_predicate_internal(final SubLObject pred)
  {
    return fi.fi_ask_int( ConsesLow.listS( $const44$and, ConsesLow.listS( $const128$arg2Isa, pred, $list129 ), $list130 ), $const131$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 26635L)
  public static SubLObject is_abbreviation_predicate(final SubLObject pred)
  {
    SubLObject caching_state = $is_abbreviation_predicate_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym127$IS_ABBREVIATION_PREDICATE, $sym132$_IS_ABBREVIATION_PREDICATE_CACHING_STATE_, $int133$128, EQL, ONE_INTEGER, $int134$40 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( is_abbreviation_predicate_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 26986L)
  public static SubLObject get_abbreviation_predicates()
  {
    SubLObject abbrev_preds = NIL;
    SubLObject cdolist_list_var = genl_predicates.all_spec_preds( $const135$properNameStrings, UNPROVIDED, UNPROVIDED );
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != is_abbreviation_predicate( pred ) )
      {
        abbrev_preds = ConsesLow.cons( pred, abbrev_preds );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return abbrev_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 27311L)
  public static SubLObject clear_examples_for_pred()
  {
    final SubLObject cs = $examples_for_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 27311L)
  public static SubLObject remove_examples_for_pred(final SubLObject pred, SubLObject num)
  {
    if( num == UNPROVIDED )
    {
      num = $num_predicate_examples$.getGlobalValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $examples_for_pred_caching_state$.getGlobalValue(), ConsesLow.list( pred, num ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 27311L)
  public static SubLObject examples_for_pred_internal(final SubLObject pred, final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( $lex_trace_level$.getDynamicValue( thread ), $lex_verbose$.getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str137$examples_for_pred__a__a___, pred, num );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    final SubLObject positive_examples = positive_examples_for_pred( pred );
    SubLObject examples = list_utilities.first_n( num, positive_examples );
    SubLObject got_enoughP;
    SubLObject real_examples;
    SubLObject real_example;
    for( got_enoughP = list_utilities.lengthGE( examples, num, UNPROVIDED ), real_examples = NIL, real_example = NIL, real_examples = real_examples_for_pred( pred ), real_example = real_examples
        .first(); NIL != real_example && NIL == got_enoughP; real_example = real_examples.first() )
    {
      if( NIL == subl_promotions.memberP( real_example, examples, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
      {
        examples = ConsesLow.cons( real_example, examples );
        got_enoughP = list_utilities.lengthGE( examples, num, UNPROVIDED );
      }
      real_examples = real_examples.rest();
    }
    return Sequences.nreverse( examples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 27311L)
  public static SubLObject examples_for_pred(final SubLObject pred, SubLObject num)
  {
    if( num == UNPROVIDED )
    {
      num = $num_predicate_examples$.getGlobalValue();
    }
    SubLObject caching_state = $examples_for_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym136$EXAMPLES_FOR_PRED, $sym138$_EXAMPLES_FOR_PRED_CACHING_STATE_, $int92$256, EQL, TWO_INTEGER, $int93$100 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, num );
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
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && num.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( examples_for_pred_internal( pred, num ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, num ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 28225L)
  public static SubLObject positive_examples_for_pred(final SubLObject pred)
  {
    SubLObject examples = other_positive_examples_for_pred( pred );
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt( pred, $const139$examples_Positive, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject formula_text = NIL;
    formula_text = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject formula = reader.read_from_string_ignoring_errors( formula_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject phrase = ( NIL != el_utilities.el_formula_p( formula ) ) ? cycl_utilities.formula_arg2( formula, UNPROVIDED ) : NIL;
      if( phrase.isString() )
      {
        final SubLObject item_var = phrase;
        if( NIL == conses_high.member( item_var, examples, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          examples = ConsesLow.cons( item_var, examples );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      formula_text = cdolist_list_var.first();
    }
    return examples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 28815L)
  public static SubLObject other_positive_examples_for_pred(final SubLObject pred)
  {
    SubLObject examples = NIL;
    SubLObject cdolist_list_var = $list140;
    SubLObject example_pred = NIL;
    example_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$7 = kb_mapping_utilities.pred_values_in_any_mt( pred, example_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject formula = NIL;
      formula = cdolist_list_var_$7.first();
      while ( NIL != cdolist_list_var_$7)
      {
        final SubLObject phrase = cycl_utilities.formula_arg2( formula, UNPROVIDED );
        if( phrase.isString() )
        {
          final SubLObject item_var = phrase;
          if( NIL == conses_high.member( item_var, examples, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            examples = ConsesLow.cons( item_var, examples );
          }
        }
        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
        formula = cdolist_list_var_$7.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      example_pred = cdolist_list_var.first();
    }
    return examples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 29271L)
  public static SubLObject real_examples_for_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject examples = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$9 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw141$GAF, NIL, NIL );
                SubLObject done_var_$10 = NIL;
                final SubLObject token_var_$11 = NIL;
                while ( NIL == done_var_$10)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$11 );
                  final SubLObject valid_$12 = makeBoolean( !token_var_$11.eql( assertion ) );
                  if( NIL != valid_$12 && NIL != assertions_high.gaf_assertionP( assertion ) )
                  {
                    final SubLObject phrase = assertions_high.gaf_arg2( assertion );
                    if( phrase.isString() )
                    {
                      examples = ConsesLow.cons( phrase, examples );
                    }
                  }
                  done_var_$10 = makeBoolean( NIL == valid_$12 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$9, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$8, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return examples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 29642L)
  public static SubLObject try_lex_assert(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw142$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( $lex_trace_level$.getDynamicValue( thread ), $lex_verbose$.getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str143$try_lex_assert__s_in_MT__a__, formula, mt );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    final SubLObject ok = misc_kb_utilities.try_assert( formula, mt, strength, direction );
    if( NIL != ok && NIL != forts.fort_p( lexification_reviewer() ) )
    {
      misc_kb_utilities.try_assert( ConsesLow.list( $const144$toBeReviewedBy, ConsesLow.list( $const145$ist, mt, formula ), lexification_reviewer() ), $const146$BookkeepingMt, UNPROVIDED, UNPROVIDED );
    }
    return ok;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 30107L)
  public static SubLObject try_lex_assert_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw142$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( $lex_trace_level$.getDynamicValue( thread ), $lex_verbose$.getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str147$try_lex_assert_now__s_in_MT__a__, formula, mt );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    final SubLObject ok = misc_kb_utilities.try_assert_now( formula, mt, strength, direction );
    if( NIL != ok && NIL != forts.fort_p( lexification_reviewer() ) )
    {
      misc_kb_utilities.try_assert( ConsesLow.list( $const144$toBeReviewedBy, ConsesLow.list( $const145$ist, mt, formula ), lexification_reviewer() ), $const146$BookkeepingMt, UNPROVIDED, UNPROVIDED );
    }
    return ok;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 30771L)
  public static SubLObject lex_string_tokenize(final SubLObject phrase, SubLObject separate_punctuationP)
  {
    if( separate_punctuationP == UNPROVIDED )
    {
      separate_punctuationP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return standard_tokenization.tokenize_sentence( lex_remove_final_punctuation( phrase ), $lex_white_space_chars$.getDynamicValue( thread ), ( NIL != separate_punctuationP ) ? $lex_punctuation_chars$.getDynamicValue(
        thread ) : NIL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 31239L)
  public static SubLObject lex_remove_final_punctuation(SubLObject phrase)
  {
    for( final SubLThread thread = SubLProcess.currentSubLThread(); NIL != string_utilities.non_empty_stringP( phrase ) && NIL != conses_high.member( string_utilities.last_char( phrase ), $lex_punctuation_chars$
        .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ); phrase = string_utilities.strip_final( phrase, UNPROVIDED ) )
    {
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 31564L)
  public static SubLObject lex_find_word_in_string(final SubLObject wordstring, final SubLObject string)
  {
    return Sequences.position( wordstring, lex_string_tokenize( string, UNPROVIDED ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 31694L)
  public static SubLObject lex_describe_term(final SubLObject v_term, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject description = NIL;
    if( lexical_mt.isString() )
    {
      lexical_mt = misc_kb_utilities.fort_for_string( lexical_mt );
    }
    final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_language_mt$.bind( lexical_mt, thread );
      description = string_utilities.unquote_string( pph_main.generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      pph_vars.$pph_language_mt$.rebind( _prev_bind_0, thread );
    }
    return description;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 32356L)
  public static SubLObject lex_fort_for_string(final SubLObject fort_label)
  {
    final SubLObject fort = misc_kb_utilities.fort_for_string( fort_label );
    if( !fort.eql( $const148$DeadTerm ) || NIL != string_utilities.substringP( $str149$DeadTerm, fort_label, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return fort;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 32706L)
  public static SubLObject lex_arity_in_any_mt(final SubLObject v_term)
  {
    final SubLObject v_arity = arity.arity( v_term );
    return ( NIL != v_arity ) ? v_arity : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 32901L)
  public static SubLObject loose_lexification_phrases_for_term(final SubLObject v_term)
  {
    SubLObject phrases = NIL;
    SubLObject cdolist_list_var = lexicon_utilities.loose_lexifications_for_term( v_term );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.gaf_assertionP( assertion ) )
      {
        final SubLObject item_var = assertions_high.gaf_arg2( assertion );
        if( NIL == conses_high.member( item_var, phrases, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
        {
          phrases = ConsesLow.cons( item_var, phrases );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return phrases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 33346L)
  public static SubLObject preferred_loose_lexification_phrase_for_term(final SubLObject v_term)
  {
    final SubLObject phrase = kb_mapping_utilities.fpred_value_in_any_mt( v_term, $const150$preferredTermStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 33589L)
  public static SubLObject proper_lexification_phrases_for_term(final SubLObject v_term)
  {
    SubLObject phrases = NIL;
    SubLObject cdolist_list_var = lexicon_utilities.proper_lexifications_for_term( v_term );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$14 = phrases_from_semantic_assertion( assertion, UNPROVIDED );
      SubLObject phrase = NIL;
      phrase = cdolist_list_var_$14.first();
      while ( NIL != cdolist_list_var_$14)
      {
        final SubLObject item_var = phrase;
        if( NIL == conses_high.member( item_var, phrases, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          phrases = ConsesLow.cons( item_var, phrases );
        }
        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
        phrase = cdolist_list_var_$14.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return phrases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 34041L)
  public static SubLObject phrases_from_semantic_assertion(final SubLObject assertion, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw151$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject phrases = NIL;
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
      try
      {
        lexicon_vars.$lexicon_lookup_mt$.bind( assertions_high.assertion_mt( assertion ), thread );
        final SubLObject air_pred = assertions_high.gaf_arg0( assertion );
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached( air_pred );
        final SubLObject v_term = lexicon_utilities.term_from_nl_assertion( assertion );
        if( NIL != pos_arg )
        {
          final SubLObject pos = assertions_high.gaf_arg( assertion, pos_arg );
          final SubLObject pos_preds = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
          SubLObject cdolist_list_var = pph_utilities.pph_filter_preds( nl_preds, pos_preds, UNPROVIDED );
          SubLObject pred = NIL;
          pred = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject phrase = pph_data_structures.pph_phrase_output_item_string( pph_methods_lexicon.generate_phrase_from_as( assertion, v_term, ConsesLow.list( pred ), NIL, UNPROVIDED, UNPROVIDED ) );
            if( NIL != phrase )
            {
              final SubLObject item_var = phrase;
              if( NIL == conses_high.member( item_var, phrases, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
              {
                phrases = ConsesLow.cons( item_var, phrases );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
          }
        }
        else
        {
          final SubLObject var = pph_data_structures.pph_phrase_output_item_string( pph_methods_lexicon.generate_phrase_from_as( assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          if( NIL != var )
          {
            final SubLObject item_var2 = var;
            if( NIL == conses_high.member( item_var2, phrases, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
            {
              phrases = ConsesLow.cons( item_var2, phrases );
            }
          }
        }
      }
      finally
      {
        lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
      }
    }
    return Mapping.mapcar( $sym153$PPH_STRING_TO_CYCL, phrases );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 35395L)
  public static SubLObject phrases_from_lexification_sentence(final SubLObject sentence, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw151$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_grammar.cycl_formulaic_sentence_p( sentence ) : sentence;
    final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
    try
    {
      pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
      pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
      pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
      try
      {
        final SubLObject air_pred = cycl_utilities.formula_arg0( sentence );
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached( air_pred );
        SubLObject phrases = ConsesLow.list( phrase_from_lexification_sentence( sentence, nl_preds ) );
        if( NIL != pos_arg )
        {
          final SubLObject pos = cycl_utilities.formula_arg( sentence, pos_arg, UNPROVIDED );
          final SubLObject pos_preds = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
          SubLObject cdolist_list_var = pph_utilities.pph_filter_preds( nl_preds, pos_preds, UNPROVIDED );
          SubLObject pred = NIL;
          pred = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject var = phrase_from_lexification_sentence( sentence, ConsesLow.list( pred ) );
            if( NIL != var )
            {
              final SubLObject item_var = var;
              if( NIL == conses_high.member( item_var, phrases, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
              {
                phrases = ConsesLow.cons( item_var, phrases );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
          }
        }
        else
        {
          final SubLObject var2 = phrase_from_lexification_sentence( sentence, nl_preds );
          if( NIL != var2 )
          {
            final SubLObject item_var2 = var2;
            if( NIL == conses_high.member( item_var2, phrases, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
            {
              phrases = ConsesLow.cons( item_var2, phrases );
            }
          }
        }
        return Values.values( list_utilities.last_one( phrases ), conses_high.butlast( phrases, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          pph_macros.destroy_new_pph_phrases();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
        }
      }
    }
    finally
    {
      pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
      pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
      pph_macros.$new_pph_phrases$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 36342L)
  public static SubLObject phrase_from_lexification_sentence(final SubLObject sentence, final SubLObject nl_preds)
  {
    return pph_string.pph_string_to_cycl( pph_data_structures.pph_phrase_output_item_string( pph_methods_lexicon.generate_phrase_from_lexification_sentence( sentence, nl_preds, NIL, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 36545L)
  public static SubLObject is_nameable_entityP(final SubLObject v_term)
  {
    return makeBoolean( NIL != is_nameable_individualP( v_term ) || NIL != is_nameable_collectionP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 37016L)
  public static SubLObject is_nameable_individualP(final SubLObject v_term)
  {
    return isa.isa_in_any_mtP( v_term, $const112$Individual );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 37535L)
  public static SubLObject is_nameable_collectionP(final SubLObject v_term)
  {
    return list_utilities.sublisp_boolean( fi.fi_ask_int( ConsesLow.list( $const156$nameableCollection, v_term ), $const37$EverythingPSC, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 37960L)
  public static SubLObject lex_empty_stringP(final SubLObject string)
  {
    return makeBoolean( NIL != string_utilities.empty_string_p( string ) || NIL == string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 38185L)
  public static SubLObject clear_lexification_caches()
  {
    clear_keyword_for_pos();
    clear_precise_keyword_for_pos();
    clear_is_abbreviation_predicate();
    clear_examples_for_pred();
    clear_pluralize_word();
    clear_singularize_word();
    clear_find_root_wordform();
    clear_is_abbreviation_predicate();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 38554L)
  public static SubLObject string_for_fort(final SubLObject fort)
  {
    return ( NIL != forts.valid_fortP( fort ) ) ? cb_utilities.cb_fort_display_string( fort ) : $str62$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 38992L)
  public static SubLObject string_for_field(final SubLObject field_value)
  {
    return ( NIL != field_value ) ? string_utilities.to_string( field_value ) : $str62$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 39153L)
  public static SubLObject is_relationalP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject relationalP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
      if( NIL != fort_types_interface.predicateP( v_term ) || NIL != fort_types_interface.functionP( v_term ) )
      {
        relationalP = T;
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return relationalP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 39416L)
  public static SubLObject is_functionalP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject functionalP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
      if( NIL != fort_types_interface.functionP( v_term ) )
      {
        functionalP = T;
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return functionalP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 39640L)
  public static SubLObject get_term_comments(final SubLObject v_term)
  {
    final SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt( v_term, $const157$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject double_newline = Strings.make_string( TWO_INTEGER, Characters.CHAR_newline );
    SubLObject formatted_comments = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject list_var = NIL;
      SubLObject comment = NIL;
      SubLObject i = NIL;
      list_var = comments;
      comment = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), comment = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        if( i.numG( ZERO_INTEGER ) )
        {
          streams_high.write_string( double_newline, stream, UNPROVIDED, UNPROVIDED );
        }
        streams_high.write_string( Sequences.substitute( Characters.CHAR_space, Characters.CHAR_newline, comment, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), stream, UNPROVIDED, UNPROVIDED );
      }
      formatted_comments = streams_high.get_output_stream_string( stream );
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
    return formatted_comments;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 40247L)
  public static SubLObject likely_has_part_of_speechP(final SubLObject part_of_speech, final SubLObject wordform, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject ok = subl_promotions.memberP( part_of_speech, lexicon_accessors.pos_of_string( wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    SubLObject indicator_suffixes = NIL;
    if( part_of_speech.eql( $const83$Adjective ) )
    {
      indicator_suffixes = $list158;
    }
    else if( part_of_speech.eql( $const85$Adverb ) )
    {
      indicator_suffixes = $list159;
    }
    else if( part_of_speech.eql( $const79$Noun ) )
    {
      indicator_suffixes = $list160;
    }
    else if( part_of_speech.eql( $const81$Verb ) )
    {
      indicator_suffixes = $list161;
    }
    else if( part_of_speech.eql( $const100$GerundiveNoun ) )
    {
      indicator_suffixes = $list162;
    }
    else if( part_of_speech.eql( $const98$AgentiveNoun ) )
    {
      indicator_suffixes = $list163;
    }
    if( NIL == ok )
    {
      SubLObject csome_list_var = indicator_suffixes;
      SubLObject suffix = NIL;
      suffix = csome_list_var.first();
      while ( NIL == ok && NIL != csome_list_var)
      {
        if( NIL != string_utilities.ends_with( wordform, suffix, UNPROVIDED ) )
        {
          ok = T;
        }
        csome_list_var = csome_list_var.rest();
        suffix = csome_list_var.first();
      }
    }
    return ok;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 41835L)
  public static SubLObject likely_adverbP(final SubLObject wordform, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return likely_has_part_of_speechP( $const85$Adverb, wordform, lexical_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 42097L)
  public static SubLObject likely_adjectiveP(final SubLObject wordform, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return likely_has_part_of_speechP( $const83$Adjective, wordform, lexical_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 42368L)
  public static SubLObject likely_nounP(final SubLObject wordform, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return likely_has_part_of_speechP( $const79$Noun, wordform, lexical_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 42623L)
  public static SubLObject likely_verbP(final SubLObject wordform, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return likely_has_part_of_speechP( $const81$Verb, wordform, lexical_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 42878L)
  public static SubLObject word_unit_part_of_speech_usage(final SubLObject word_unit, final SubLObject part_of_speech)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject usage = ZERO_INTEGER;
    if( NIL != kb_indexing_datastructures.indexed_term_p( word_unit ) && NIL != kb_indexing_datastructures.indexed_term_p( part_of_speech ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
        usage = Sequences.length( virtual_indexing.assertions_mentioning_terms( ConsesLow.list( word_unit, part_of_speech ), UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return usage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 43490L)
  public static SubLObject wordform_part_of_speech_usage(final SubLObject wordform, final SubLObject part_of_speech)
  {
    SubLObject usage = ZERO_INTEGER;
    SubLObject cdolist_list_var = lexicon_accessors.words_of_stringXspeech_part( wordform, part_of_speech, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject word_unit = NIL;
    word_unit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      usage = Numbers.add( usage, word_unit_part_of_speech_usage( word_unit, part_of_speech ) );
      cdolist_list_var = cdolist_list_var.rest();
      word_unit = cdolist_list_var.first();
    }
    return usage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 43951L)
  public static SubLObject headword_usage(final SubLObject word_unit, SubLObject speech_part, SubLObject position)
  {
    if( speech_part == UNPROVIDED )
    {
      speech_part = $kw151$ANY;
    }
    if( position == UNPROVIDED )
    {
      position = $kw151$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym36$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const37$EverythingPSC, thread );
      if( NIL != subl_promotions.memberP( position, $list164, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject node_var = $const165$HeadInitialMultiWordPhrasePred;
        final SubLObject _prev_bind_0_$16 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
        final SubLObject _prev_bind_1_$17 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
        try
        {
          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const166$isa ), thread );
          sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            SubLObject node_var_$18 = node_var;
            final SubLObject deck_type = $kw169$STACK;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym170$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw171$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw174$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str175$continue_anyway, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw176$WARN ) )
                    {
                      Errors.warn( $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str177$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str175$continue_anyway, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const166$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const166$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$18, UNPROVIDED );
                        while ( NIL != node_var_$18)
                        {
                          final SubLObject tt_node_var = node_var_$18;
                          SubLObject cdolist_list_var;
                          final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const166$isa ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          SubLObject iteration_state_$30;
                                          for( iteration_state_$30 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$30 ); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next( iteration_state_$30 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$30 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject pred;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    pred = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred ) )
                                                      {
                                                        count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred ) );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject pred2 = NIL;
                                                  pred2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred2 ) )
                                                      {
                                                        count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred2 ) );
                                                      }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    pred2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$23, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$30 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$22, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                {
                                  SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  SubLObject instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = instance_tuple;
                                    SubLObject link_node = NIL;
                                    SubLObject mt2 = NIL;
                                    SubLObject tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    mt2 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol;
                                              final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred ) )
                                                    {
                                                      count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred ) );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var_$34 = sol;
                                                SubLObject pred2 = NIL;
                                                pred2 = csome_list_var_$34.first();
                                                while ( NIL != csome_list_var_$34)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred2 ) )
                                                    {
                                                      count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred2 ) );
                                                    }
                                                  }
                                                  csome_list_var_$34 = csome_list_var_$34.rest();
                                                  pred2 = csome_list_var_$34.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$25, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$24, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list180 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$35;
                                final SubLObject new_list = cdolist_list_var_$35 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$35.first();
                                while ( NIL != cdolist_list_var_$35)
                                {
                                  final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject pred3;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        pred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, pred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred3,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred3 ) )
                                          {
                                            count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred3 ) );
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var3 = sol2;
                                      SubLObject pred4 = NIL;
                                      pred4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred4 ) )
                                          {
                                            count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred4 ) );
                                          }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        pred4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$26, thread );
                                  }
                                  cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                                  generating_fn = cdolist_list_var_$35.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$21, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$21, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                          SubLObject cdolist_list_var2;
                          final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const166$isa ) ) );
                          SubLObject module_var2 = NIL;
                          module_var2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            final SubLObject _prev_bind_0_$27 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node2 = function_terms.naut_to_nart( node_var_$18 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    SubLObject iteration_state2;
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      final SubLObject tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                      {
                                        final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                          SubLObject iteration_state_$31;
                                          for( iteration_state_$31 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$31 ); iteration_state_$31 = dictionary_contents.do_dictionary_contents_next( iteration_state_$31 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$31 );
                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                  SubLObject basis_object3;
                                                  SubLObject state3;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  SubLObject csome_list_var4 = sol3;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$29, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$31 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$28, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$36;
                                final SubLObject new_list2 = cdolist_list_var_$36 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn2 = NIL;
                                generating_fn2 = cdolist_list_var_$36.first();
                                while ( NIL != cdolist_list_var_$36)
                                {
                                  final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    final SubLObject sol4;
                                    final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                      SubLObject basis_object4;
                                      SubLObject state4;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      SubLObject csome_list_var5 = sol4;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var5.first();
                                      while ( NIL != csome_list_var5)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var5 = csome_list_var5.rest();
                                        node_vars_link_node4 = csome_list_var5.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$30, thread );
                                  }
                                  cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                  generating_fn2 = cdolist_list_var_$36.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$22, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$27, thread );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            module_var2 = cdolist_list_var2.first();
                          }
                          node_var_$18 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$26, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$20, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$20, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str181$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$19, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$19, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$18, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$18, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$17, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$17, thread );
          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$16, thread );
        }
      }
      if( NIL != subl_promotions.memberP( position, $list182, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject node_var = $const183$HeadFinalMultiWordPhrasePred;
        final SubLObject _prev_bind_0_$33 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
        final SubLObject _prev_bind_1_$23 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
        try
        {
          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const166$isa ), thread );
          sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            SubLObject node_var_$19 = node_var;
            final SubLObject deck_type = $kw169$STACK;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym170$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw171$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw174$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str175$continue_anyway, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw176$WARN ) )
                    {
                      Errors.warn( $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str177$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str175$continue_anyway, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const166$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const166$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$19, UNPROVIDED );
                        while ( NIL != node_var_$19)
                        {
                          final SubLObject tt_node_var = node_var_$19;
                          SubLObject cdolist_list_var;
                          final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const166$isa ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject _prev_bind_0_$38 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          SubLObject iteration_state_$32;
                                          for( iteration_state_$32 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$32 ); iteration_state_$32 = dictionary_contents.do_dictionary_contents_next( iteration_state_$32 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$32 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject pred;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    pred = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred ) )
                                                      {
                                                        count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred ) );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject pred2 = NIL;
                                                  pred2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred2 ) )
                                                      {
                                                        count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred2 ) );
                                                      }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    pred2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$40, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$32 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$39, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                {
                                  SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  SubLObject instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = instance_tuple;
                                    SubLObject link_node = NIL;
                                    SubLObject mt2 = NIL;
                                    SubLObject tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    mt2 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol;
                                              final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred ) )
                                                    {
                                                      count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred ) );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var_$35 = sol;
                                                SubLObject pred2 = NIL;
                                                pred2 = csome_list_var_$35.first();
                                                while ( NIL != csome_list_var_$35)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred2 ) )
                                                    {
                                                      count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred2 ) );
                                                    }
                                                  }
                                                  csome_list_var_$35 = csome_list_var_$35.rest();
                                                  pred2 = csome_list_var_$35.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$42, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$41, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list180 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$37;
                                final SubLObject new_list = cdolist_list_var_$37 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$37.first();
                                while ( NIL != cdolist_list_var_$37)
                                {
                                  final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject pred3;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        pred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, pred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred3,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred3 ) )
                                          {
                                            count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred3 ) );
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var3 = sol2;
                                      SubLObject pred4 = NIL;
                                      pred4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred4 ) )
                                          {
                                            count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred4 ) );
                                          }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        pred4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$43, thread );
                                  }
                                  cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                  generating_fn = cdolist_list_var_$37.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$27, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$38, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                          SubLObject cdolist_list_var2;
                          final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const166$isa ) ) );
                          SubLObject module_var2 = NIL;
                          module_var2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node2 = function_terms.naut_to_nart( node_var_$19 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    SubLObject iteration_state2;
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      final SubLObject tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                      {
                                        final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                          SubLObject iteration_state_$33;
                                          for( iteration_state_$33 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$33 ); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next( iteration_state_$33 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$33 );
                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                  SubLObject basis_object3;
                                                  SubLObject state3;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  SubLObject csome_list_var4 = sol3;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$46, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$33 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$45, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$38;
                                final SubLObject new_list2 = cdolist_list_var_$38 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn2 = NIL;
                                generating_fn2 = cdolist_list_var_$38.first();
                                while ( NIL != cdolist_list_var_$38)
                                {
                                  final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    final SubLObject sol4;
                                    final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                      SubLObject basis_object4;
                                      SubLObject state4;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      SubLObject csome_list_var5 = sol4;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var5.first();
                                      while ( NIL != csome_list_var5)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var5 = csome_list_var5.rest();
                                        node_vars_link_node4 = csome_list_var5.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$47, thread );
                                  }
                                  cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                  generating_fn2 = cdolist_list_var_$38.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$28, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$44, thread );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            module_var2 = cdolist_list_var2.first();
                          }
                          node_var_$19 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$27, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$26, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$37, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str181$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$25, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$36, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$24, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$35, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
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
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$34, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$23, thread );
          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$33, thread );
        }
      }
      if( NIL != subl_promotions.memberP( position, $list184, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject node_var = $const185$HeadMedialMultiWordPhrasePred;
        final SubLObject _prev_bind_0_$50 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
        final SubLObject _prev_bind_1_$29 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
        try
        {
          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const166$isa ), thread );
          sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            SubLObject node_var_$20 = node_var;
            final SubLObject deck_type = $kw169$STACK;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$30 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym170$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw171$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw174$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str175$continue_anyway, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw176$WARN ) )
                    {
                      Errors.warn( $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str177$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str175$continue_anyway, $str172$_A_is_not_a__A, tv_var, $sym173$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const166$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const166$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$32 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const166$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$20, UNPROVIDED );
                        while ( NIL != node_var_$20)
                        {
                          final SubLObject tt_node_var = node_var_$20;
                          SubLObject cdolist_list_var;
                          final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const166$isa ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject _prev_bind_0_$55 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          SubLObject iteration_state_$34;
                                          for( iteration_state_$34 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$34 ); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next( iteration_state_$34 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$34 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject pred;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    pred = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred ) )
                                                      {
                                                        count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred ) );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject pred2 = NIL;
                                                  pred2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred2 ) )
                                                      {
                                                        count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred2 ) );
                                                      }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    pred2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$57, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$34 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$56, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                {
                                  SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  SubLObject instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = instance_tuple;
                                    SubLObject link_node = NIL;
                                    SubLObject mt2 = NIL;
                                    SubLObject tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    mt2 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol;
                                              final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred ) )
                                                    {
                                                      count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred ) );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var_$36 = sol;
                                                SubLObject pred2 = NIL;
                                                pred2 = csome_list_var_$36.first();
                                                while ( NIL != csome_list_var_$36)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred2 ) )
                                                    {
                                                      count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred2 ) );
                                                    }
                                                  }
                                                  csome_list_var_$36 = csome_list_var_$36.rest();
                                                  pred2 = csome_list_var_$36.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$59, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$58, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list180 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$39;
                                final SubLObject new_list = cdolist_list_var_$39 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const166$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$39.first();
                                while ( NIL != cdolist_list_var_$39)
                                {
                                  final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject pred3;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        pred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, pred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred3,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred3 ) )
                                          {
                                            count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred3 ) );
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var3 = sol2;
                                      SubLObject pred4 = NIL;
                                      pred4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred4 ) )
                                          {
                                            count = Numbers.add( count, headword_usage_for_pred( word_unit, speech_part, pred4 ) );
                                          }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        pred4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$60, thread );
                                  }
                                  cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                  generating_fn = cdolist_list_var_$39.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$33, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$55, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                          SubLObject cdolist_list_var2;
                          final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const166$isa ) ) );
                          SubLObject module_var2 = NIL;
                          module_var2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            final SubLObject _prev_bind_0_$61 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node2 = function_terms.naut_to_nart( node_var_$20 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    SubLObject iteration_state2;
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      final SubLObject tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                      {
                                        final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                          SubLObject iteration_state_$35;
                                          for( iteration_state_$35 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$35 ); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next( iteration_state_$35 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$35 );
                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                  SubLObject basis_object3;
                                                  SubLObject state3;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  SubLObject csome_list_var4 = sol3;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$63, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$35 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$62, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$40;
                                final SubLObject new_list2 = cdolist_list_var_$40 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn2 = NIL;
                                generating_fn2 = cdolist_list_var_$40.first();
                                while ( NIL != cdolist_list_var_$40)
                                {
                                  final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    final SubLObject sol4;
                                    final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                      SubLObject basis_object4;
                                      SubLObject state4;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      SubLObject csome_list_var5 = sol4;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var5.first();
                                      while ( NIL != csome_list_var5)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var5 = csome_list_var5.rest();
                                        node_vars_link_node4 = csome_list_var5.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str178$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$64, thread );
                                  }
                                  cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                  generating_fn2 = cdolist_list_var_$40.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$34, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$61, thread );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            module_var2 = cdolist_list_var2.first();
                          }
                          node_var_$20 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$28, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$32, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$54, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str181$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$31, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$53, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$30, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$52, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values5 = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values5 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$65, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$51, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values6 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values6 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$29, thread );
          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$50, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 45003L)
  public static SubLObject headword_usage_for_pred(final SubLObject word_unit, final SubLObject speech_part, final SubLObject pred)
  {
    final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached( pred );
    final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached( pred );
    if( !wu_arg.isInteger() )
    {
      return ZERO_INTEGER;
    }
    if( speech_part == $kw151$ANY )
    {
      return kb_indexing.num_gaf_arg_index( word_unit, wu_arg, pred, UNPROVIDED );
    }
    if( !pos_arg.isInteger() )
    {
      return ZERO_INTEGER;
    }
    if( NIL != lexicon_accessors.speech_partP( speech_part, UNPROVIDED ) )
    {
      SubLObject count = ZERO_INTEGER;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, wu_arg, pred ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, wu_arg, pred );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw141$GAF, NIL, NIL );
              SubLObject done_var_$106 = NIL;
              final SubLObject token_var_$107 = NIL;
              while ( NIL == done_var_$106)
              {
                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$107 );
                final SubLObject valid_$108 = makeBoolean( !token_var_$107.eql( as ) );
                if( NIL != valid_$108 && NIL != lexicon_accessors.genl_posP( assertions_high.gaf_arg( as, pos_arg ), speech_part, UNPROVIDED ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                }
                done_var_$106 = makeBoolean( NIL == valid_$108 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      return count;
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 45816L)
  public static SubLObject most_frequent_headword(final SubLObject phrase_words, SubLObject ignore_capitalized_words)
  {
    if( ignore_capitalized_words == UNPROVIDED )
    {
      ignore_capitalized_words = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject position;
    final SubLObject last_position = position = number_utilities.f_1_( Sequences.length( phrase_words ) );
    SubLObject max_usage = ZERO_INTEGER;
    SubLObject list_var = NIL;
    SubLObject word = NIL;
    SubLObject i = NIL;
    list_var = phrase_words;
    word = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), word = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      SubLObject usage = ZERO_INTEGER;
      final SubLObject word_position = i.isZero() ? $kw186$INITIAL : ( i.eql( last_position ) ? $kw187$FINAL : $kw188$MEDIAL );
      if( NIL == lexicon_accessors.closed_lexical_class_stringP( word, UNPROVIDED ) && ( NIL == ignore_capitalized_words || NIL == initial_capitalizedP( word ) ) )
      {
        SubLObject cdolist_list_var = lexicon_cache.words_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject word_unit = NIL;
        word_unit = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          usage = Numbers.add( usage, ONE_INTEGER );
          SubLObject cdolist_list_var_$109 = lexicon_accessors.pos_of_stringXword( word, word_unit, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject pos = NIL;
          pos = cdolist_list_var_$109.first();
          while ( NIL != cdolist_list_var_$109)
          {
            usage = Numbers.add( usage, headword_usage( word_unit, pos, word_position ) );
            cdolist_list_var_$109 = cdolist_list_var_$109.rest();
            pos = cdolist_list_var_$109.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word_unit = cdolist_list_var.first();
        }
        if( $lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( $lex_trace_level$.getDynamicValue( thread ), $lex_verbose$.getGlobalValue() ) ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str189$word__a_usage___a__, i, usage );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        if( usage.numGE( max_usage ) )
        {
          if( $lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( $lex_trace_level$.getDynamicValue( thread ), $lex_verbose$.getGlobalValue() ) ) )
          {
            PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str190$Setting_new_guessed_headword_to__, word );
            streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
          }
          position = i;
          max_usage = usage;
        }
      }
    }
    return position;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 47298L)
  public static SubLObject initial_capitalizedP(final SubLObject word)
  {
    assert NIL != Types.stringp( word ) : word;
    final SubLObject first_letter = string_utilities.first_char( word );
    return Characters.upper_case_p( first_letter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 47514L)
  public static SubLObject most_likely_headword(final SubLObject phrase_words)
  {
    return most_frequent_headword( phrase_words, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 48015L)
  public static SubLObject other_lexified_phrases_for_term(final SubLObject cyc_term, final SubLObject lex_phrase)
  {
    final SubLObject all_other_phrases = Sequences.remove( lex_phrase, lexified_phrases_for_term( cyc_term, UNPROVIDED ), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject other_phrases = list_utilities.remove_if_not( Symbols.symbol_function( $sym41$STRINGP ), all_other_phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Sort.sort( other_phrases, $sym191$CYCL_STRING__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 49798L)
  public static SubLObject possibly_lexify_terrorist_attack(final SubLObject attack, SubLObject problem_store)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject skipP = makeBoolean( NIL == $terrorist_attack_lexification_worksP$.getGlobalValue() );
    if( NIL == skipP )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const61$EnglishMt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        skipP = kb_mapping_utilities.some_pred_value( attack, $const193$definiteDescriptions, ONE_INTEGER, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != skipP ) ? $kw194$DONE : lexify_terrorist_attack( attack, problem_store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 50170L)
  public static SubLObject lexify_terrorist_attack(final SubLObject attack, SubLObject problem_store)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject strings = NIL;
    SubLObject time = ZERO_INTEGER;
    SubLObject lexifications = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    final SubLObject _prev_bind_0 = pph_vars.$pph_use_indexical_datesP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_use_indexical_datesP$.bind( NIL, thread );
      lexifications = terrorist_attack_lexifications( attack, problem_store );
    }
    finally
    {
      pph_vars.$pph_use_indexical_datesP$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = lexifications;
    SubLObject lex_info = NIL;
    lex_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = lex_info;
      SubLObject string = NIL;
      SubLObject assertion_el_set = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
      string = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
      assertion_el_set = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject lex_sentence = NIL;
        lex_sentence = ConsesLow.list( $const193$definiteDescriptions, attack, string );
        if( NIL != ke.ke_assert_now( lex_sentence, $const196$TerrorismLexicalMt, $kw142$DEFAULT, $kw197$FORWARD ) )
        {
          strings = ConsesLow.cons( string, strings );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list195 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex_info = cdolist_list_var.first();
    }
    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    return Values.values( strings, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 50879L)
  public static SubLObject terrorist_attack_lexifications(final SubLObject attack, SubLObject problem_store)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    thread.resetMultipleValues();
    final SubLObject sentence = terrorist_attack_lexification_query_args( attack, problem_store );
    final SubLObject mt = thread.secondMultipleValue();
    final SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    results = ask_utilities.query_template( $list198, sentence, mt, query_properties );
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 51277L)
  public static SubLObject terrorist_attack_lexification_query_args(final SubLObject attack, SubLObject problem_store)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject sentence = kb_query.kbq_query_arguments( terrorist_attack_lexification_kbq(), UNPROVIDED );
    final SubLObject mt = thread.secondMultipleValue();
    final SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = $list199;
    SubLObject arg_pos = NIL;
    arg_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sentence = el_utilities.replace_formula_arg_position( arg_pos, attack, sentence );
      cdolist_list_var = cdolist_list_var.rest();
      arg_pos = cdolist_list_var.first();
    }
    conses_high.putf( query_properties, $kw200$PROBLEM_STORE, problem_store );
    return Values.values( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-utilities.lisp", position = 51717L)
  public static SubLObject terrorist_attack_lexification_kbq()
  {
    return narts_high.find_nart( $list201 );
  }

  public static SubLObject declare_lexification_utilities_file()
  {
    SubLFiles.declareFunction( me, "lexification_reviewer", "LEXIFICATION-REVIEWER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_lexification_reviewer", "SET-LEXIFICATION-REVIEWER", 1, 0, false );
    SubLFiles.declareMacro( me, "lex_trace", "LEX-TRACE" );
    SubLFiles.declareMacro( me, "lex_warn", "LEX-WARN" );
    SubLFiles.declareMacro( me, "lex_debug", "LEX-DEBUG" );
    SubLFiles.declareMacro( me, "lex_if_level", "LEX-IF-LEVEL" );
    SubLFiles.declareMacro( me, "lex_debug_out", "LEX-DEBUG-OUT" );
    SubLFiles.declareFunction( me, "lex_debug_on", "LEX-DEBUG-ON", 0, 1, false );
    SubLFiles.declareMacro( me, "lex_assertion", "LEX-ASSERTION" );
    SubLFiles.declareMacro( me, "do_unlexified_terms", "DO-UNLEXIFIED-TERMS" );
    SubLFiles.declareFunction( me, "unlexified_terms_for_cyclist", "UNLEXIFIED-TERMS-FOR-CYCLIST", 1, 2, false );
    SubLFiles.declareFunction( me, "lexification_not_neededP", "LEXIFICATION-NOT-NEEDED?", 1, 0, false );
    SubLFiles.declareFunction( me, "unlexifiedP", "UNLEXIFIED?", 1, 1, false );
    SubLFiles.declareFunction( me, "lexifiedP", "LEXIFIED?", 1, 1, false );
    SubLFiles.declareFunction( me, "generalization_is_lexifiedP", "GENERALIZATION-IS-LEXIFIED?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_unlexified_terms", "GET-UNLEXIFIED-TERMS", 0, 2, false );
    SubLFiles.declareFunction( me, "get_termstring_assertions_for_cyclist", "GET-TERMSTRING-ASSERTIONS-FOR-CYCLIST", 0, 1, false );
    SubLFiles.declareFunction( me, "lexical_mt_for_cyclist", "LEXICAL-MT-FOR-CYCLIST", 0, 1, false );
    SubLFiles.declareFunction( me, "acronym_char_p", "ACRONYM-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "regroup_acronyms", "REGROUP-ACRONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_from_term", "PHRASE-FROM-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_individual_constantP", "CYC-INDIVIDUAL-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_for_mt", "PHRASE-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "lexification_for_mt", "LEXIFICATION-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "lexify_mts", "LEXIFY-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "skip_mt_lexificationP", "SKIP-MT-LEXIFICATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_specifiedP", "ALL-SPECIFIED?", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_date_to_universal_time", "UNIVERSAL-DATE-TO-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_time_to_universal_date", "UNIVERSAL-TIME-TO-UNIVERSAL-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "n_universal_days_ago", "N-UNIVERSAL-DAYS-AGO", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_integer", "EXTRACT-INTEGER", 1, 1, false );
    SubLFiles.declareFunction( me, "sort_by_pred_usage", "SORT-BY-PRED-USAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "most_specific_arg1_constraint", "MOST-SPECIFIC-ARG1-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "most_specific_argn_constraint", "MOST-SPECIFIC-ARGN-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_relation_argument_type", "GET-RELATION-ARGUMENT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_keyword_for_pos", "CLEAR-KEYWORD-FOR-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_keyword_for_pos", "REMOVE-KEYWORD-FOR-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "keyword_for_pos_internal", "KEYWORD-FOR-POS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "keyword_for_pos", "KEYWORD-FOR-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_precise_keyword_for_pos", "CLEAR-PRECISE-KEYWORD-FOR-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_precise_keyword_for_pos", "REMOVE-PRECISE-KEYWORD-FOR-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "precise_keyword_for_pos_internal", "PRECISE-KEYWORD-FOR-POS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "precise_keyword_for_pos", "PRECISE-KEYWORD-FOR-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_keyword_for_pred", "CLEAR-KEYWORD-FOR-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_keyword_for_pred", "REMOVE-KEYWORD-FOR-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "keyword_for_pred_internal", "KEYWORD-FOR-PRED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "keyword_for_pred", "KEYWORD-FOR-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_precise_keyword_for_pred", "CLEAR-PRECISE-KEYWORD-FOR-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_precise_keyword_for_pred", "REMOVE-PRECISE-KEYWORD-FOR-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "precise_keyword_for_pred_internal", "PRECISE-KEYWORD-FOR-PRED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "precise_keyword_for_pred", "PRECISE-KEYWORD-FOR-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "invalid_formulaP", "INVALID-FORMULA?", 2, 0, false );
    SubLFiles.declareFunction( me, "invalid_lexificationP", "INVALID-LEXIFICATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "lex_pos_for_keyword", "LEX-POS-FOR-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "parts_of_speech", "PARTS-OF-SPEECH", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_pluralize_word", "CLEAR-PLURALIZE-WORD", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pluralize_word", "REMOVE-PLURALIZE-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "pluralize_word_internal", "PLURALIZE-WORD-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pluralize_word", "PLURALIZE-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_singularize_word", "CLEAR-SINGULARIZE-WORD", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_singularize_word", "REMOVE-SINGULARIZE-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "singularize_word_internal", "SINGULARIZE-WORD-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "singularize_word", "SINGULARIZE-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_basic_preds_for_part_of_speech", "CLEAR-BASIC-PREDS-FOR-PART-OF-SPEECH", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_basic_preds_for_part_of_speech", "REMOVE-BASIC-PREDS-FOR-PART-OF-SPEECH", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_preds_for_part_of_speech_internal", "BASIC-PREDS-FOR-PART-OF-SPEECH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_preds_for_part_of_speech", "BASIC-PREDS-FOR-PART-OF-SPEECH", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_find_root_wordform", "CLEAR-FIND-ROOT-WORDFORM", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_find_root_wordform", "REMOVE-FIND-ROOT-WORDFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "find_root_wordform_internal", "FIND-ROOT-WORDFORM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "find_root_wordform", "FIND-ROOT-WORDFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "lexified_phrases_for_term", "LEXIFIED-PHRASES-FOR-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "nonplural_lexified_phrases_for_term", "NONPLURAL-LEXIFIED-PHRASES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_words", "JOIN-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "has_vowel", "HAS-VOWEL", 1, 0, false );
    SubLFiles.declareFunction( me, "guess_stem", "GUESS-STEM", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_is_abbreviation_predicate", "CLEAR-IS-ABBREVIATION-PREDICATE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_is_abbreviation_predicate", "REMOVE-IS-ABBREVIATION-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "is_abbreviation_predicate_internal", "IS-ABBREVIATION-PREDICATE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "is_abbreviation_predicate", "IS-ABBREVIATION-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_abbreviation_predicates", "GET-ABBREVIATION-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_examples_for_pred", "CLEAR-EXAMPLES-FOR-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_examples_for_pred", "REMOVE-EXAMPLES-FOR-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "examples_for_pred_internal", "EXAMPLES-FOR-PRED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "examples_for_pred", "EXAMPLES-FOR-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "positive_examples_for_pred", "POSITIVE-EXAMPLES-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "other_positive_examples_for_pred", "OTHER-POSITIVE-EXAMPLES-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "real_examples_for_pred", "REAL-EXAMPLES-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "try_lex_assert", "TRY-LEX-ASSERT", 2, 2, false );
    SubLFiles.declareFunction( me, "try_lex_assert_now", "TRY-LEX-ASSERT-NOW", 2, 2, false );
    SubLFiles.declareFunction( me, "lex_string_tokenize", "LEX-STRING-TOKENIZE", 1, 1, false );
    SubLFiles.declareFunction( me, "lex_remove_final_punctuation", "LEX-REMOVE-FINAL-PUNCTUATION", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_find_word_in_string", "LEX-FIND-WORD-IN-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "lex_describe_term", "LEX-DESCRIBE-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "lex_fort_for_string", "LEX-FORT-FOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_arity_in_any_mt", "LEX-ARITY-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "loose_lexification_phrases_for_term", "LOOSE-LEXIFICATION-PHRASES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "preferred_loose_lexification_phrase_for_term", "PREFERRED-LOOSE-LEXIFICATION-PHRASE-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "proper_lexification_phrases_for_term", "PROPER-LEXIFICATION-PHRASES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "phrases_from_semantic_assertion", "PHRASES-FROM-SEMANTIC-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "phrases_from_lexification_sentence", "PHRASES-FROM-LEXIFICATION-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "phrase_from_lexification_sentence", "PHRASE-FROM-LEXIFICATION-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "is_nameable_entityP", "IS-NAMEABLE-ENTITY?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_nameable_individualP", "IS-NAMEABLE-INDIVIDUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_nameable_collectionP", "IS-NAMEABLE-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_empty_stringP", "LEX-EMPTY-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_lexification_caches", "CLEAR-LEXIFICATION-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "string_for_fort", "STRING-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "string_for_field", "STRING-FOR-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "is_relationalP", "IS-RELATIONAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_functionalP", "IS-FUNCTIONAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_comments", "GET-TERM-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "likely_has_part_of_speechP", "LIKELY-HAS-PART-OF-SPEECH?", 2, 1, false );
    SubLFiles.declareFunction( me, "likely_adverbP", "LIKELY-ADVERB?", 1, 1, false );
    SubLFiles.declareFunction( me, "likely_adjectiveP", "LIKELY-ADJECTIVE?", 1, 1, false );
    SubLFiles.declareFunction( me, "likely_nounP", "LIKELY-NOUN?", 1, 1, false );
    SubLFiles.declareFunction( me, "likely_verbP", "LIKELY-VERB?", 1, 1, false );
    SubLFiles.declareFunction( me, "word_unit_part_of_speech_usage", "WORD-UNIT-PART-OF-SPEECH-USAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "wordform_part_of_speech_usage", "WORDFORM-PART-OF-SPEECH-USAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "headword_usage", "HEADWORD-USAGE", 1, 2, false );
    SubLFiles.declareFunction( me, "headword_usage_for_pred", "HEADWORD-USAGE-FOR-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "most_frequent_headword", "MOST-FREQUENT-HEADWORD", 1, 1, false );
    SubLFiles.declareFunction( me, "initial_capitalizedP", "INITIAL-CAPITALIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "most_likely_headword", "MOST-LIKELY-HEADWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "other_lexified_phrases_for_term", "OTHER-LEXIFIED-PHRASES-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_lexify_terrorist_attack", "POSSIBLY-LEXIFY-TERRORIST-ATTACK", 1, 1, false );
    SubLFiles.declareFunction( me, "lexify_terrorist_attack", "LEXIFY-TERRORIST-ATTACK", 1, 1, false );
    SubLFiles.declareFunction( me, "terrorist_attack_lexifications", "TERRORIST-ATTACK-LEXIFICATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "terrorist_attack_lexification_query_args", "TERRORIST-ATTACK-LEXIFICATION-QUERY-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "terrorist_attack_lexification_kbq", "TERRORIST-ATTACK-LEXIFICATION-KBQ", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_lexification_utilities_file()
  {
    $lex_none$ = SubLFiles.defconstant( "*LEX-NONE*", ZERO_INTEGER );
    $lex_always$ = SubLFiles.defconstant( "*LEX-ALWAYS*", ZERO_INTEGER );
    $lex_basic$ = SubLFiles.defconstant( "*LEX-BASIC*", ONE_INTEGER );
    $lex_warning$ = SubLFiles.defconstant( "*LEX-WARNING*", ONE_INTEGER );
    $lex_detailed$ = SubLFiles.defconstant( "*LEX-DETAILED*", TWO_INTEGER );
    $lex_verbose$ = SubLFiles.defconstant( "*LEX-VERBOSE*", THREE_INTEGER );
    $lex_very_detailed$ = SubLFiles.defconstant( "*LEX-VERY-DETAILED*", FOUR_INTEGER );
    $lex_very_verbose$ = SubLFiles.defconstant( "*LEX-VERY-VERBOSE*", FIVE_INTEGER );
    $lex_most_detailed$ = SubLFiles.defconstant( "*LEX-MOST-DETAILED*", SIX_INTEGER );
    $lex_most_verbose$ = SubLFiles.defconstant( "*LEX-MOST-VERBOSE*", SEVEN_INTEGER );
    $lex_all$ = SubLFiles.defconstant( "*LEX-ALL*", NINE_INTEGER );
    $lex_trace_level$ = SubLFiles.defvar( "*LEX-TRACE-LEVEL*", $lex_basic$.getGlobalValue() );
    $lexification_check_max_days$ = SubLFiles.deflexical( "*LEXIFICATION-CHECK-MAX-DAYS*", ( maybeDefault( $sym0$_LEXIFICATION_CHECK_MAX_DAYS_, $lexification_check_max_days$, $int1$30 ) ) );
    $lexification_reviewer$ = SubLFiles.defvar( "*LEXIFICATION-REVIEWER*", NIL );
    $num_predicate_examples$ = SubLFiles.deflexical( "*NUM-PREDICATE-EXAMPLES*", ( maybeDefault( $sym4$_NUM_PREDICATE_EXAMPLES_, $num_predicate_examples$, THREE_INTEGER ) ) );
    $lex_white_space_chars$ = SubLFiles.defparameter( "*LEX-WHITE-SPACE-CHARS*", string_utilities.whitespace_chars() );
    $lex_punctuation_chars$ = SubLFiles.defparameter( "*LEX-PUNCTUATION-CHARS*", $list5 );
    $keyword_for_pos_caching_state$ = SubLFiles.deflexical( "*KEYWORD-FOR-POS-CACHING-STATE*", NIL );
    $precise_keyword_for_pos_caching_state$ = SubLFiles.deflexical( "*PRECISE-KEYWORD-FOR-POS-CACHING-STATE*", NIL );
    $keyword_for_pred_caching_state$ = SubLFiles.deflexical( "*KEYWORD-FOR-PRED-CACHING-STATE*", NIL );
    $precise_keyword_for_pred_caching_state$ = SubLFiles.deflexical( "*PRECISE-KEYWORD-FOR-PRED-CACHING-STATE*", NIL );
    $pluralize_word_caching_state$ = SubLFiles.deflexical( "*PLURALIZE-WORD-CACHING-STATE*", NIL );
    $singularize_word_caching_state$ = SubLFiles.deflexical( "*SINGULARIZE-WORD-CACHING-STATE*", NIL );
    $basic_preds_for_part_of_speech_caching_state$ = SubLFiles.deflexical( "*BASIC-PREDS-FOR-PART-OF-SPEECH-CACHING-STATE*", NIL );
    $find_root_wordform_caching_state$ = SubLFiles.deflexical( "*FIND-ROOT-WORDFORM-CACHING-STATE*", NIL );
    $is_abbreviation_predicate_caching_state$ = SubLFiles.deflexical( "*IS-ABBREVIATION-PREDICATE-CACHING-STATE*", NIL );
    $examples_for_pred_caching_state$ = SubLFiles.deflexical( "*EXAMPLES-FOR-PRED-CACHING-STATE*", NIL );
    $terrorist_attack_lexification_worksP$ = SubLFiles.deflexical( "*TERRORIST-ATTACK-LEXIFICATION-WORKS?*", NIL );
    return NIL;
  }

  public static SubLObject setup_lexification_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_LEXIFICATION_CHECK_MAX_DAYS_ );
    utilities_macros.register_html_state_variable( $sym2$_LEXIFICATION_REVIEWER_ );
    utilities_macros.register_html_interface_variable( $sym2$_LEXIFICATION_REVIEWER_ );
    subl_macro_promotions.declare_defglobal( $sym4$_NUM_PREDICATE_EXAMPLES_ );
    memoization_state.note_globally_cached_function( $sym72$KEYWORD_FOR_POS );
    memoization_state.note_globally_cached_function( $sym94$PRECISE_KEYWORD_FOR_POS );
    memoization_state.note_globally_cached_function( $sym107$KEYWORD_FOR_PRED );
    memoization_state.note_globally_cached_function( $sym109$PRECISE_KEYWORD_FOR_PRED );
    memoization_state.note_globally_cached_function( $sym114$PLURALIZE_WORD );
    memoization_state.note_globally_cached_function( $sym118$SINGULARIZE_WORD );
    memoization_state.note_globally_cached_function( $sym120$BASIC_PREDS_FOR_PART_OF_SPEECH );
    memoization_state.note_globally_cached_function( $sym123$FIND_ROOT_WORDFORM );
    memoization_state.note_globally_cached_function( $sym127$IS_ABBREVIATION_PREDICATE );
    memoization_state.note_globally_cached_function( $sym136$EXAMPLES_FOR_PRED );
    access_macros.register_external_symbol( $sym192$POSSIBLY_LEXIFY_TERRORIST_ATTACK );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexification_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexification_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexification_utilities_file();
  }
  static
  {
    me = new lexification_utilities();
    $lex_none$ = null;
    $lex_always$ = null;
    $lex_basic$ = null;
    $lex_warning$ = null;
    $lex_detailed$ = null;
    $lex_verbose$ = null;
    $lex_very_detailed$ = null;
    $lex_very_verbose$ = null;
    $lex_most_detailed$ = null;
    $lex_most_verbose$ = null;
    $lex_all$ = null;
    $lex_trace_level$ = null;
    $lexification_check_max_days$ = null;
    $lexification_reviewer$ = null;
    $num_predicate_examples$ = null;
    $lex_white_space_chars$ = null;
    $lex_punctuation_chars$ = null;
    $keyword_for_pos_caching_state$ = null;
    $precise_keyword_for_pos_caching_state$ = null;
    $keyword_for_pred_caching_state$ = null;
    $precise_keyword_for_pred_caching_state$ = null;
    $pluralize_word_caching_state$ = null;
    $singularize_word_caching_state$ = null;
    $basic_preds_for_part_of_speech_caching_state$ = null;
    $find_root_wordform_caching_state$ = null;
    $is_abbreviation_predicate_caching_state$ = null;
    $examples_for_pred_caching_state$ = null;
    $terrorist_attack_lexification_worksP$ = null;
    $sym0$_LEXIFICATION_CHECK_MAX_DAYS_ = makeSymbol( "*LEXIFICATION-CHECK-MAX-DAYS*" );
    $int1$30 = makeInteger( 30 );
    $sym2$_LEXIFICATION_REVIEWER_ = makeSymbol( "*LEXIFICATION-REVIEWER*" );
    $sym3$FORT_P = makeSymbol( "FORT-P" );
    $sym4$_NUM_PREDICATE_EXAMPLES_ = makeSymbol( "*NUM-PREDICATE-EXAMPLES*" );
    $list5 = ConsesLow.list( new SubLObject[] { Characters.CHAR_period, Characters.CHAR_semicolon, Characters.CHAR_comma, Characters.CHAR_colon, Characters.CHAR_quotation, Characters.CHAR_exclamation,
      Characters.CHAR_question, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_percent, Characters.CHAR_caret, Characters.CHAR_asterisk
    } );
    $list6 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "FORMAT-SPEC" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym7$PWHEN = makeSymbol( "PWHEN" );
    $sym8$__ = makeSymbol( ">=" );
    $sym9$_LEX_TRACE_LEVEL_ = makeSymbol( "*LEX-TRACE-LEVEL*" );
    $sym10$FORMAT = makeSymbol( "FORMAT" );
    $sym11$_TRACE_OUTPUT_ = makeSymbol( "*TRACE-OUTPUT*" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "*TRACE-OUTPUT*" ) ) );
    $list13 = ConsesLow.list( makeSymbol( "FORMAT-SPEC" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym14$LEX_TRACE = makeSymbol( "LEX-TRACE" );
    $list15 = ConsesLow.list( makeSymbol( "MAX" ), makeSymbol( "*LEX-TRACE-LEVEL*" ), makeSymbol( "*LEX-BASIC*" ) );
    $sym16$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $str17$Warning__ = makeString( "Warning: " );
    $list18 = ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "&REST" ), makeSymbol( "OPTIONAL-FORMS" ) );
    $list19 = ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "*LEX-TRACE-LEVEL*" ), makeSymbol( "*LEX-VERBOSE*" ) );
    $list20 = ConsesLow.list( makeSymbol( "TRACE-LEVEL" ), makeSymbol( "FORM" ), makeSymbol( "&REST" ), makeSymbol( "OPTIONAL-FORMS" ) );
    $list21 = ConsesLow.list( makeSymbol( "MAX" ), makeSymbol( "*LEX-TRACE-LEVEL*" ), makeSymbol( "*LEX-VERBOSE*" ) );
    $list22 = ConsesLow.list( makeSymbol( "EXPRESSION" ) );
    $sym23$PUNLESS = makeSymbol( "PUNLESS" );
    $sym24$LEX_WARN = makeSymbol( "LEX-WARN" );
    $str25$____assertion_failed___a______ = makeString( "*** assertion failed: ~a ***~%" );
    $sym26$QUOTE = makeSymbol( "QUOTE" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "Finding unlexified terms..." ) ), makeSymbol( "ALLOW-TERMSTRINGS?" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str28$Finding_unlexified_terms___ = makeString( "Finding unlexified terms..." );
    $sym29$DO_CONSTANTS = makeSymbol( "DO-CONSTANTS" );
    $sym30$UNLEXIFIED_ = makeSymbol( "UNLEXIFIED?" );
    $str31$Looking_for_unlexified_FORTs_crea = makeString( "Looking for unlexified FORTs created by " );
    $str32$_in_last_ = makeString( " in last " );
    $str33$_days___ = makeString( " days..." );
    $str34$cdolist = makeString( "cdolist" );
    $sym35$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym36$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const37$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const38$termDoesntNeedLexification = constant_handles.reader_make_constant_shell( makeString( "termDoesntNeedLexification" ) );
    $const39$instancesDontNeedLexification = constant_handles.reader_make_constant_shell( makeString( "instancesDontNeedLexification" ) );
    $const40$quotedInstancesDontNeedLexificati = constant_handles.reader_make_constant_shell( makeString( "quotedInstancesDontNeedLexification" ) );
    $sym41$STRINGP = makeSymbol( "STRINGP" );
    $kw42$SKIP = makeKeyword( "SKIP" );
    $const43$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $const44$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const45$conceptuallyRelated = constant_handles.reader_make_constant_shell( makeString( "conceptuallyRelated" ) );
    $list46 = ConsesLow.list( makeSymbol( "?MT" ) );
    $list47 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), makeSymbol( "?MT" ), constant_handles.reader_make_constant_shell( makeString(
        "GeneralLexiconMt" ) ) ) );
    $list48 = ConsesLow.list( makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?MT" ) ) );
    $const49$TemporaryLexicalAssertionsMt = constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertionsMt" ) );
    $str50$char__a_next__a_next_next__a_run_ = makeString( "char=~a next=~a next-next=~a run-len=~a new-index=~a~%" );
    $list51 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) );
    $str52$_Mt = makeString( " Mt" );
    $str53$_G = makeString( " G" );
    $str54$General_ = makeString( "General " );
    $str55$_ = makeString( " " );
    $str56$___ = makeString( " - " );
    $str57$__ = makeString( " -" );
    $const58$multiWordString = constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) );
    $const59$Know_TheWord = constant_handles.reader_make_constant_shell( makeString( "Know-TheWord" ) );
    $const60$MassNoun = constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) );
    $const61$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $str62$ = makeString( "" );
    $sym63$INTEGERP = makeSymbol( "INTEGERP" );
    $int64$3600 = makeInteger( 3600 );
    $int65$24 = makeInteger( 24 );
    $kw66$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym67$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym68$_ = makeSymbol( ">" );
    $sym69$NUM_PREDICATE_EXTENT_INDEX = makeSymbol( "NUM-PREDICATE-EXTENT-INDEX" );
    $const70$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell( makeString( "CycLReifiableDenotationalTerm" ) );
    $const71$EnglishLexiconMt = constant_handles.reader_make_constant_shell( makeString( "EnglishLexiconMt" ) );
    $sym72$KEYWORD_FOR_POS = makeSymbol( "KEYWORD-FOR-POS" );
    $const73$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $kw74$PROPER_NOUN = makeKeyword( "PROPER-NOUN" );
    $const75$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $kw76$DET = makeKeyword( "DET" );
    $const77$Pronoun = constant_handles.reader_make_constant_shell( makeString( "Pronoun" ) );
    $kw78$PRONOUN = makeKeyword( "PRONOUN" );
    $const79$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $kw80$NOUN = makeKeyword( "NOUN" );
    $const81$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $kw82$VERB = makeKeyword( "VERB" );
    $const83$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $kw84$ADJECTIVE = makeKeyword( "ADJECTIVE" );
    $const85$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $kw86$ADVERB = makeKeyword( "ADVERB" );
    $const87$Preposition = constant_handles.reader_make_constant_shell( makeString( "Preposition" ) );
    $kw88$PREP = makeKeyword( "PREP" );
    $const89$Conjunction = constant_handles.reader_make_constant_shell( makeString( "Conjunction" ) );
    $kw90$CONJ = makeKeyword( "CONJ" );
    $sym91$_KEYWORD_FOR_POS_CACHING_STATE_ = makeSymbol( "*KEYWORD-FOR-POS-CACHING-STATE*" );
    $int92$256 = makeInteger( 256 );
    $int93$100 = makeInteger( 100 );
    $sym94$PRECISE_KEYWORD_FOR_POS = makeSymbol( "PRECISE-KEYWORD-FOR-POS" );
    $kw95$MASS_NOUN = makeKeyword( "MASS-NOUN" );
    $const96$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $kw97$SIMPLE_NOUN = makeKeyword( "SIMPLE-NOUN" );
    $const98$AgentiveNoun = constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) );
    $kw99$AGENTIVE_NOUN = makeKeyword( "AGENTIVE-NOUN" );
    $const100$GerundiveNoun = constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) );
    $kw101$GERUNDIVE_NOUN = makeKeyword( "GERUNDIVE-NOUN" );
    $const102$DeVerbalNoun = constant_handles.reader_make_constant_shell( makeString( "DeVerbalNoun" ) );
    $kw103$DEVERBAL_NOUN = makeKeyword( "DEVERBAL-NOUN" );
    $const104$AuxVerb = constant_handles.reader_make_constant_shell( makeString( "AuxVerb" ) );
    $kw105$AUX = makeKeyword( "AUX" );
    $sym106$_PRECISE_KEYWORD_FOR_POS_CACHING_STATE_ = makeSymbol( "*PRECISE-KEYWORD-FOR-POS-CACHING-STATE*" );
    $sym107$KEYWORD_FOR_PRED = makeSymbol( "KEYWORD-FOR-PRED" );
    $sym108$_KEYWORD_FOR_PRED_CACHING_STATE_ = makeSymbol( "*KEYWORD-FOR-PRED-CACHING-STATE*" );
    $sym109$PRECISE_KEYWORD_FOR_PRED = makeSymbol( "PRECISE-KEYWORD-FOR-PRED" );
    $sym110$_PRECISE_KEYWORD_FOR_PRED_CACHING_STATE_ = makeSymbol( "*PRECISE-KEYWORD-FOR-PRED-CACHING-STATE*" );
    $str111$invalid_formula____a__ = makeString( "invalid formula:~%~a~%" );
    $const112$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $list113 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) );
    $sym114$PLURALIZE_WORD = makeSymbol( "PLURALIZE-WORD" );
    $sym115$_PLURALIZE_WORD_CACHING_STATE_ = makeSymbol( "*PLURALIZE-WORD-CACHING-STATE*" );
    $int116$2048 = makeInteger( 2048 );
    $int117$1024 = makeInteger( 1024 );
    $sym118$SINGULARIZE_WORD = makeSymbol( "SINGULARIZE-WORD" );
    $sym119$_SINGULARIZE_WORD_CACHING_STATE_ = makeSymbol( "*SINGULARIZE-WORD-CACHING-STATE*" );
    $sym120$BASIC_PREDS_FOR_PART_OF_SPEECH = makeSymbol( "BASIC-PREDS-FOR-PART-OF-SPEECH" );
    $sym121$_BASIC_PREDS_FOR_PART_OF_SPEECH_CACHING_STATE_ = makeSymbol( "*BASIC-PREDS-FOR-PART-OF-SPEECH-CACHING-STATE*" );
    $int122$64 = makeInteger( 64 );
    $sym123$FIND_ROOT_WORDFORM = makeSymbol( "FIND-ROOT-WORDFORM" );
    $sym124$_FIND_ROOT_WORDFORM_CACHING_STATE_ = makeSymbol( "*FIND-ROOT-WORDFORM-CACHING-STATE*" );
    $kw125$ALL = makeKeyword( "ALL" );
    $const126$AllLexicalMicrotheoryPSC = constant_handles.reader_make_constant_shell( makeString( "AllLexicalMicrotheoryPSC" ) );
    $sym127$IS_ABBREVIATION_PREDICATE = makeSymbol( "IS-ABBREVIATION-PREDICATE" );
    $const128$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $list129 = ConsesLow.list( makeSymbol( "?CONSTRAINT" ) );
    $list130 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?CONSTRAINT" ), constant_handles.reader_make_constant_shell( makeString(
        "Abbreviation" ) ) ) );
    $const131$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym132$_IS_ABBREVIATION_PREDICATE_CACHING_STATE_ = makeSymbol( "*IS-ABBREVIATION-PREDICATE-CACHING-STATE*" );
    $int133$128 = makeInteger( 128 );
    $int134$40 = makeInteger( 40 );
    $const135$properNameStrings = constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) );
    $sym136$EXAMPLES_FOR_PRED = makeSymbol( "EXAMPLES-FOR-PRED" );
    $str137$examples_for_pred__a__a___ = makeString( "examples-for-pred(~a ~a)~%" );
    $sym138$_EXAMPLES_FOR_PRED_CACHING_STATE_ = makeSymbol( "*EXAMPLES-FOR-PRED-CACHING-STATE*" );
    $const139$examples_Positive = constant_handles.reader_make_constant_shell( makeString( "examples-Positive" ) );
    $list140 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "exampleSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "examplePredSentence" ) ), constant_handles
        .reader_make_constant_shell( makeString( "exampleAssertions" ) ) );
    $kw141$GAF = makeKeyword( "GAF" );
    $kw142$DEFAULT = makeKeyword( "DEFAULT" );
    $str143$try_lex_assert__s_in_MT__a__ = makeString( "try-lex-assert ~s in MT ~a~%" );
    $const144$toBeReviewedBy = constant_handles.reader_make_constant_shell( makeString( "toBeReviewedBy" ) );
    $const145$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const146$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $str147$try_lex_assert_now__s_in_MT__a__ = makeString( "try-lex-assert-now ~s in MT ~a~%" );
    $const148$DeadTerm = constant_handles.reader_make_constant_shell( makeString( "DeadTerm" ) );
    $str149$DeadTerm = makeString( "DeadTerm" );
    $const150$preferredTermStrings = constant_handles.reader_make_constant_shell( makeString( "preferredTermStrings" ) );
    $kw151$ANY = makeKeyword( "ANY" );
    $sym152$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym153$PPH_STRING_TO_CYCL = makeSymbol( "PPH-STRING-TO-CYCL" );
    $sym154$CYCL_FORMULAIC_SENTENCE_P = makeSymbol( "CYCL-FORMULAIC-SENTENCE-P" );
    $sym155$_EXIT = makeSymbol( "%EXIT" );
    $const156$nameableCollection = constant_handles.reader_make_constant_shell( makeString( "nameableCollection" ) );
    $const157$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $list158 = ConsesLow.list( makeString( "worthy" ), makeString( "ous" ), makeString( "ical" ), makeString( "less" ), makeString( "like" ), makeString( "able" ), makeString( "ible" ), makeString( "ic" ) );
    $list159 = ConsesLow.list( makeString( "ly" ) );
    $list160 = ConsesLow.list( makeString( "ability" ), makeString( "ism" ), makeString( "ness" ), makeString( "ation" ), makeString( "ion" ), makeString( "ity" ) );
    $list161 = ConsesLow.list( makeString( "ify" ), makeString( "ize" ) );
    $list162 = ConsesLow.list( makeString( "ing" ) );
    $list163 = ConsesLow.list( makeString( "or" ), makeString( "er" ) );
    $list164 = ConsesLow.list( makeKeyword( "ANY" ), makeKeyword( "INITIAL" ) );
    $const165$HeadInitialMultiWordPhrasePred = constant_handles.reader_make_constant_shell( makeString( "HeadInitialMultiWordPhrasePred" ) );
    $const166$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw167$BREADTH = makeKeyword( "BREADTH" );
    $kw168$QUEUE = makeKeyword( "QUEUE" );
    $kw169$STACK = makeKeyword( "STACK" );
    $sym170$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw171$ERROR = makeKeyword( "ERROR" );
    $str172$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym173$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw174$CERROR = makeKeyword( "CERROR" );
    $str175$continue_anyway = makeString( "continue anyway" );
    $kw176$WARN = makeKeyword( "WARN" );
    $str177$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str178$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str179$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list180 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str181$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $list182 = ConsesLow.list( makeKeyword( "ANY" ), makeKeyword( "FINAL" ) );
    $const183$HeadFinalMultiWordPhrasePred = constant_handles.reader_make_constant_shell( makeString( "HeadFinalMultiWordPhrasePred" ) );
    $list184 = ConsesLow.list( makeKeyword( "ANY" ), makeKeyword( "MEDIAL" ) );
    $const185$HeadMedialMultiWordPhrasePred = constant_handles.reader_make_constant_shell( makeString( "HeadMedialMultiWordPhrasePred" ) );
    $kw186$INITIAL = makeKeyword( "INITIAL" );
    $kw187$FINAL = makeKeyword( "FINAL" );
    $kw188$MEDIAL = makeKeyword( "MEDIAL" );
    $str189$word__a_usage___a__ = makeString( "word ~a usage: ~a~%" );
    $str190$Setting_new_guessed_headword_to__ = makeString( "Setting new guessed headword to ~S~%" );
    $sym191$CYCL_STRING__ = makeSymbol( "CYCL-STRING-<" );
    $sym192$POSSIBLY_LEXIFY_TERRORIST_ATTACK = makeSymbol( "POSSIBLY-LEXIFY-TERRORIST-ATTACK" );
    $const193$definiteDescriptions = constant_handles.reader_make_constant_shell( makeString( "definiteDescriptions" ) );
    $kw194$DONE = makeKeyword( "DONE" );
    $list195 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "ASSERTION-EL-SET" ) );
    $const196$TerrorismLexicalMt = constant_handles.reader_make_constant_shell( makeString( "TerrorismLexicalMt" ) );
    $kw197$FORWARD = makeKeyword( "FORWARD" );
    $list198 = ConsesLow.list( makeSymbol( "?STRING" ), makeSymbol( "?SET" ) );
    $list199 = ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, ONE_INTEGER ), ConsesLow.list( TWO_INTEGER, TWO_INTEGER, TWO_INTEGER, TWO_INTEGER ) );
    $kw200$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $list201 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TestQueryFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLGIT-LexifyTerroristAttack" ) ) );
  }
}
/*
 * 
 * Total time: 7691 ms synthetic
 */