package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_main
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.psp_main";
  public static final String myFingerPrint = "c771501bc67edce803c10a92e6ee7b82d009f8920f9dbef18d084e62196f7713";
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10298L)
  private static SubLSymbol $psp_answer_store$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLSymbol $dtp_psp_answer_accumulator$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 12590L)
  private static SubLSymbol $psp_weight_margin_of_error$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  private static SubLSymbol $ps_parse_vbar_int_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  private static SubLSymbol $ps_parse_predicative_adjp_int_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  private static SubLSymbol $ps_get_cycls_for_phrase_int_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  private static SubLSymbol $ps_get_cycls_and_constraints_for_phrase_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  private static SubLSymbol $ps_harvest_phrases_int_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 28159L)
  public static SubLSymbol $psp_reuse_chartsP$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29243L)
  private static SubLSymbol $psp_valid_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29462L)
  private static SubLSymbol $psp_valid_pos_predP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29593L)
  private static SubLSymbol $ps_parse_showing_rules_int_caching_state$;
  private static final SubLSymbol $sym0$CLEAR_PSP_CACHES;
  private static final SubLSymbol $kw1$CLEARED;
  private static final SubLSymbol $kw2$NOT_CLEARED;
  private static final SubLSymbol $kw3$ANY;
  private static final SubLSymbol $sym4$PSP_VALID_CATEGORY_;
  private static final SubLSymbol $sym5$PSP_LEXICON_P;
  private static final SubLString $str6$__Cycls_____S__Parse_tree_____S__;
  private static final SubLString $str7$_________________________________;
  private static final SubLObject $const8$adjStrings;
  private static final SubLSymbol $kw9$NONE;
  private static final SubLSymbol $sym10$PSP_VALID_POS_PRED_;
  private static final SubLSymbol $sym11$PSP_GAP_CONSTRAINT_P;
  private static final SubLObject $const12$verbStrings;
  private static final SubLSymbol $sym13$STRINGP;
  private static final SubLSymbol $sym14$BOOLEANP;
  private static final SubLObject $const15$NounPhrase;
  private static final SubLSymbol $sym16$PS_GET_CYCLS_FOR_NP;
  private static final SubLList $list17;
  private static final SubLString $str18$_return_0_and_1_LISTP_of_CycL_par;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$FORT_OR_KEYWORD_P;
  private static final SubLSymbol $sym21$PS_GET_CYCLS_FOR_PHRASE;
  private static final SubLList $list22;
  private static final SubLString $str23$_return_0_and_1_LISTP_of_CycL_par;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$BEST_ONLY;
  private static final SubLSymbol $kw27$ON;
  private static final SubLSymbol $kw28$OFF;
  private static final SubLObject $const29$CharacterString;
  private static final SubLSymbol $sym30$PS_HARVEST_NPS;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$NEW_SPAN;
  private static final SubLSymbol $sym33$CLET;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$PSP_ANSWER_ACCUMULATOR;
  private static final SubLSymbol $sym36$PSP_ANSWER_ACCUMULATOR_P;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$PPRINT_PSP_ANSWER_ACCUMULATOR;
  private static final SubLSymbol $sym42$PSP_ANSWER_ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$PSP_ANSWER_ACCUMULATOR_BEST;
  private static final SubLSymbol $sym45$_CSETF_PSP_ANSWER_ACCUMULATOR_BEST;
  private static final SubLSymbol $sym46$PSP_ANSWER_ACCUMULATOR_REST;
  private static final SubLSymbol $sym47$_CSETF_PSP_ANSWER_ACCUMULATOR_REST;
  private static final SubLSymbol $sym48$PSP_ANSWER_ACCUMULATOR_PLIST;
  private static final SubLSymbol $sym49$_CSETF_PSP_ANSWER_ACCUMULATOR_PLIST;
  private static final SubLSymbol $kw50$BEST;
  private static final SubLSymbol $kw51$REST;
  private static final SubLSymbol $kw52$PLIST;
  private static final SubLString $str53$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw54$BEGIN;
  private static final SubLSymbol $sym55$MAKE_PSP_ANSWER_ACCUMULATOR;
  private static final SubLSymbol $kw56$SLOT;
  private static final SubLSymbol $kw57$END;
  private static final SubLSymbol $sym58$VISIT_DEFSTRUCT_OBJECT_PSP_ANSWER_ACCUMULATOR_METHOD;
  private static final SubLList $list59;
  private static final SubLString $str60$__PSP_AA__;
  private static final SubLString $str61$BEST__D;
  private static final SubLString $str62$_empty_;
  private static final SubLString $str63$_REST__D;
  private static final SubLString $str64$_;
  private static final SubLSymbol $sym65$PSP_CYCL__;
  private static final SubLString $str66$Bad_PSP_answer_type___S;
  private static final SubLFloat $float67$0_1;
  private static final SubLSymbol $kw68$BEST_WEIGHT;
  private static final SubLFloat $float69$0_0;
  private static final SubLSymbol $kw70$EVERYTHING;
  private static final SubLSymbol $sym71$PSP_WEIGHT__;
  private static final SubLSymbol $sym72$PSP_CYCL_WEIGHT;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$EDGE_SET;
  private static final SubLSymbol $sym75$DONE_SPANS;
  private static final SubLSymbol $sym76$DONE_;
  private static final SubLSymbol $sym77$PUNLESS;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$MEMOIZING_NL_REFORMULATOR;
  private static final SubLSymbol $sym80$WITH_NEW_PSP_ANSWER_STORE;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$CSOME;
  private static final SubLSymbol $sym84$PSP_ACCUMULATE_ANSWERS_ONE_SET;
  private static final SubLSymbol $sym85$PWHEN;
  private static final SubLSymbol $sym86$CAND;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$CNOT;
  private static final SubLSymbol $sym89$CSETQ;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$CMULTIPLE_VALUE_SETQ;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$PSP_ACCUMULATE_ANSWERS;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$THIS_SET_CYCLS;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$DO_SET;
  private static final SubLSymbol $kw98$DONE;
  private static final SubLSymbol $sym99$PSP_GATHER_CYCLS_FROM_EDGE;
  private static final SubLSymbol $sym100$PSP_UPDATE_RESULTS_FOR_EDGE_SET_CYCLS;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$CYCL;
  private static final SubLSymbol $sym103$SPAN;
  private static final SubLSymbol $sym104$GET_PSP_EDGE_SPAN;
  private static final SubLSymbol $sym105$SET_MEMBER_;
  private static final SubLSymbol $sym106$CDOLIST;
  private static final SubLSymbol $sym107$PSP_GATHER_ONE_CYCL;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$PS_PARSE_VBAR_INT_CACHED;
  private static final SubLSymbol $sym110$MEMOIZATION_STATE_P;
  private static final SubLSymbol $kw111$CLEAR_CACHES_;
  private static final SubLSymbol $kw112$FALSE;
  private static final SubLSymbol $sym113$_PS_PARSE_VBAR_INT_CACHED_CACHING_STATE_;
  private static final SubLInteger $int114$256;
  private static final SubLSymbol $sym115$PSP_VBAR_EDGE_;
  private static final SubLObject $const116$TheVPParse;
  private static final SubLSymbol $kw117$REPLACE;
  private static final SubLSymbol $sym118$PS_PARSE_PREDICATIVE_ADJP_INT_CACHED;
  private static final SubLSymbol $sym119$_PS_PARSE_PREDICATIVE_ADJP_INT_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym120$PSP_PREDICATIVE_ADJP_EDGE_;
  private static final SubLSymbol $sym121$KEYWORDP;
  private static final SubLObject $const122$Thing;
  private static final SubLSymbol $kw123$NOUN;
  private static final SubLSymbol $sym124$PS_GET_CYCLS_FOR_PHRASE_INT_CACHED;
  private static final SubLSymbol $sym125$_PS_GET_CYCLS_FOR_PHRASE_INT_CACHED_CACHING_STATE_;
  private static final SubLObject $const126$TheSentenceSubject;
  private static final SubLSymbol $kw127$SUBJECT;
  private static final SubLSymbol $sym128$PS_GET_CYCLS_AND_CONSTRAINTS_FOR_PHRASE_CACHED;
  private static final SubLSymbol $sym129$_PS_GET_CYCLS_AND_CONSTRAINTS_FOR_PHRASE_CACHED_CACHING_STATE_;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$SUPPORT_SENTENCE;
  private static final SubLObject $const132$termPhrases_Lexical;
  private static final SubLSymbol $kw133$DENOT_GROUND;
  private static final SubLString $str134$__Weight___S__CycL___S____;
  private static final SubLFloat $float135$1_0;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$_;
  private static final SubLSymbol $sym138$CAAR;
  private static final SubLSymbol $sym139$GREATER_LENGTH_P;
  private static final SubLSymbol $sym140$CAR;
  private static final SubLSymbol $sym141$PS_HARVEST_PHRASES_INT_CACHED;
  private static final SubLSymbol $sym142$_PS_HARVEST_PHRASES_INT_CACHED_CACHING_STATE_;
  private static final SubLString $str143$__String___S__S__Weight___S__CycL;
  private static final SubLSymbol $sym144$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const145$EverythingPSC;
  private static final SubLObject $const146$SententialConstituent;
  private static final SubLSymbol $sym147$_PSP_VALID_CATEGORY__CACHING_STATE_;
  private static final SubLInteger $int148$32;
  private static final SubLSymbol $sym149$_PSP_VALID_POS_PRED__CACHING_STATE_;
  private static final SubLSymbol $sym150$PS_PARSE_SHOWING_RULES_INT;
  private static final SubLSymbol $sym151$PHRASE_STRUCTURE_PARSER_CHART_P;
  private static final SubLSymbol $kw152$LEXICAL;
  private static final SubLSymbol $sym153$_PS_PARSE_SHOWING_RULES_INT_CACHING_STATE_;
  private static final SubLSymbol $kw154$UNINITIALIZED;
  private static final SubLSymbol $sym155$PSP_EDGE_NON_BRANCHING_DESCENDENT_;
  private static final SubLSymbol $kw156$NP;
  private static final SubLSymbol $sym157$PSP_EDGE_WEIGHTIER_;
  private static final SubLList $list158;
  private static final SubLSymbol $kw159$TEST;
  private static final SubLSymbol $sym160$PS_TEST_FUNC;
  private static final SubLSymbol $kw161$OWNER;
  private static final SubLSymbol $kw162$CLASSES;
  private static final SubLList $list163;
  private static final SubLSymbol $kw164$KB;
  private static final SubLSymbol $kw165$FULL;
  private static final SubLSymbol $kw166$WORKING_;
  private static final SubLList $list167;
  private static final SubLList $list168;
  private static final SubLSymbol $sym169$PS_HARVEST_NPS_TEST_FUNC;
  private static final SubLList $list170;

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 1228L)
  public static SubLObject initialize_psp()
  {
    return psp_chart.cache_psp_frame_info();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 1389L)
  public static SubLObject clear_psp_caches()
  {
    parsing_vars.psp_clear_interface_helper_caches();
    clear_ps_harvest_phrases_int_cached();
    clear_ps_get_cycls_for_phrase_int_cached();
    clear_ps_parse_predicative_adjp_int_cached();
    clear_ps_parse_vbar_int_cached();
    clear_ps_parse_showing_rules_int();
    psp_rules.clear_psp_rules_caches();
    psp_lexicon.clear_get_default_psp_lexicon_explicit();
    nl_reformulator.clear_nl_reformulator_caches();
    parsing_utilities.clear_nl_max_floor_preds();
    np_parser.clear_npp_canonical_pos_table();
    psp_semantics.clear_psp_genl_posP();
    psp_semantics.clear_psp_head_key_for_category();
    rbp_wff.rbp_wff_clear_caches();
    return $kw1$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 2166L)
  public static SubLObject psp_possibly_clear_caches()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != parsing_vars.$psp_clear_caches_each_parseP$.getDynamicValue( thread ) )
    {
      return clear_psp_caches();
    }
    return $kw2$NOT_CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 2314L)
  public static SubLObject ps_parse_showing_rules(final SubLObject input_string, SubLObject category, SubLObject lexicon)
  {
    if( category == UNPROVIDED )
    {
      category = $kw3$ANY;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != psp_valid_categoryP( category ) : category;
    assert NIL != psp_lexicon.psp_lexicon_p( lexicon ) : lexicon;
    psp_possibly_clear_caches();
    final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_lexicon$.bind( lexicon, thread );
      final SubLObject ans_table = ps_parse_showing_rules_int( input_string, category, UNPROVIDED );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( ans_table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject tree = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject semx = thread.secondMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format( T, $str6$__Cycls_____S__Parse_tree_____S__, semx, tree );
        PrintLow.format( T, $str7$_________________________________ );
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    finally
    {
      parsing_vars.$psp_lexicon$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 2908L)
  public static SubLObject ps_parse_predicative_adjp(final SubLObject input_string, SubLObject pos_pred, SubLObject lexicon, SubLObject gap)
  {
    if( pos_pred == UNPROVIDED )
    {
      pos_pred = $const8$adjStrings;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( gap == UNPROVIDED )
    {
      gap = $kw9$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != psp_valid_pos_predP( pos_pred ) : pos_pred;
    assert NIL != psp_lexicon.psp_lexicon_p( lexicon ) : lexicon;
    assert NIL != psp_chart.psp_gap_constraint_p( gap ) : gap;
    psp_possibly_clear_caches();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$psp_gap_type_allowed$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_lexicon$.bind( lexicon, thread );
      parsing_vars.$psp_gap_type_allowed$.bind( gap, thread );
      thread.resetMultipleValues();
      final SubLObject best_$1 = ps_parse_predicative_adjp_int( input_string, pos_pred );
      final SubLObject rest_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      best = best_$1;
      rest = rest_$2;
    }
    finally
    {
      parsing_vars.$psp_gap_type_allowed$.rebind( _prev_bind_2, thread );
      parsing_vars.$psp_lexicon$.rebind( _prev_bind_0, thread );
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 3692L)
  public static SubLObject ps_parse_vbar(final SubLObject input_string, SubLObject pos_pred, SubLObject lexicon, SubLObject gap)
  {
    if( pos_pred == UNPROVIDED )
    {
      pos_pred = $const12$verbStrings;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( gap == UNPROVIDED )
    {
      gap = $kw9$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != psp_valid_pos_predP( pos_pred ) : pos_pred;
    assert NIL != psp_lexicon.psp_lexicon_p( lexicon ) : lexicon;
    assert NIL != psp_chart.psp_gap_constraint_p( gap ) : gap;
    psp_possibly_clear_caches();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$psp_gap_type_allowed$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_lexicon$.bind( lexicon, thread );
      parsing_vars.$psp_gap_type_allowed$.bind( gap, thread );
      thread.resetMultipleValues();
      final SubLObject best_$3 = ps_parse_vbar_int( input_string, pos_pred );
      final SubLObject rest_$4 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      best = best_$3;
      rest = rest_$4;
    }
    finally
    {
      parsing_vars.$psp_gap_type_allowed$.rebind( _prev_bind_2, thread );
      parsing_vars.$psp_lexicon$.rebind( _prev_bind_0, thread );
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 4385L)
  public static SubLObject ps_get_cycls_for_np(final SubLObject np, SubLObject non_trivialP, SubLObject lexicon, SubLObject gap)
  {
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( gap == UNPROVIDED )
    {
      gap = $kw9$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( np, $sym13$STRINGP );
    enforceType( non_trivialP, $sym14$BOOLEANP );
    enforceType( lexicon, $sym5$PSP_LEXICON_P );
    enforceType( gap, $sym11$PSP_GAP_CONSTRAINT_P );
    thread.resetMultipleValues();
    final SubLObject best = ps_get_cycls_for_phrase( np, $const15$NounPhrase, $kw3$ANY, non_trivialP, lexicon, gap, UNPROVIDED );
    final SubLObject rest = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 5013L)
  public static SubLObject ps_get_cycls_for_phrase(final SubLObject string, SubLObject category, SubLObject pos_pred, SubLObject non_trivialP, SubLObject lexicon, SubLObject gap, SubLObject top_level_rule_fort)
  {
    if( category == UNPROVIDED )
    {
      category = $kw3$ANY;
    }
    if( pos_pred == UNPROVIDED )
    {
      pos_pred = $kw3$ANY;
    }
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( gap == UNPROVIDED )
    {
      gap = $kw9$NONE;
    }
    if( top_level_rule_fort == UNPROVIDED )
    {
      top_level_rule_fort = $kw3$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( string, $sym13$STRINGP );
    enforceType( category, $sym4$PSP_VALID_CATEGORY_ );
    enforceType( pos_pred, $sym10$PSP_VALID_POS_PRED_ );
    enforceType( non_trivialP, $sym14$BOOLEANP );
    enforceType( lexicon, $sym5$PSP_LEXICON_P );
    enforceType( gap, $sym11$PSP_GAP_CONSTRAINT_P );
    enforceType( top_level_rule_fort, $sym20$FORT_OR_KEYWORD_P );
    psp_possibly_clear_caches();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$psp_gap_type_allowed$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_lexicon$.bind( lexicon, thread );
      parsing_vars.$psp_gap_type_allowed$.bind( gap, thread );
      thread.resetMultipleValues();
      final SubLObject best_$5 = ps_get_cycls_for_phrase_int( string, category, pos_pred, non_trivialP, top_level_rule_fort );
      final SubLObject rest_$6 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      best = best_$5;
      rest = rest_$6;
    }
    finally
    {
      parsing_vars.$psp_gap_type_allowed$.rebind( _prev_bind_2, thread );
      parsing_vars.$psp_lexicon$.rebind( _prev_bind_0, thread );
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 5991L)
  public static SubLObject inference_ps_get_cycls_for_phrase(final SubLObject string, final SubLObject term_phrases_constraint, SubLObject case_insensitiveP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    psp_possibly_clear_caches();
    final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding( thread );
    final SubLObject _prev_bind_2 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_return_mode$.bind( $kw26$BEST_ONLY, thread );
      lexicon_vars.$lexicon_lookup_mt$.bind( mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject category = psp_category_and_pos_pred_from_term_phrases_constraint( term_phrases_constraint );
      final SubLObject pos_pred = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != psp_valid_categoryP( category ) && NIL != psp_valid_pos_predP( pos_pred ) )
      {
        final SubLObject _prev_bind_0_$7 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
        try
        {
          lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( ( NIL == case_insensitiveP ) ? $kw27$ON : $kw28$OFF, thread );
          ans = ps_get_cycls_for_phrase( string, category, pos_pred, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_3, thread );
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_2, thread );
      parsing_vars.$psp_return_mode$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 6643L)
  public static SubLObject psp_category_and_pos_pred_from_term_phrases_constraint(final SubLObject term_phrases_constraint)
  {
    if( NIL != psp_valid_categoryP( term_phrases_constraint ) )
    {
      return Values.values( term_phrases_constraint, $kw3$ANY );
    }
    if( NIL != psp_valid_pos_predP( term_phrases_constraint ) )
    {
      return Values.values( $kw3$ANY, term_phrases_constraint );
    }
    if( term_phrases_constraint.eql( $const29$CharacterString ) )
    {
      return Values.values( $kw3$ANY, $kw3$ANY );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 7061L)
  public static SubLObject inference_ps_get_cycls_and_constraints_for_phrase(final SubLObject string, final SubLObject case_insensitiveP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject parses = NIL;
    psp_possibly_clear_caches();
    final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding( thread );
    final SubLObject _prev_bind_2 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_return_mode$.bind( $kw26$BEST_ONLY, thread );
      lexicon_vars.$lexicon_lookup_mt$.bind( mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( ( NIL == case_insensitiveP ) ? $kw27$ON : $kw28$OFF, thread );
      parses = ps_get_cycls_and_constraints_for_phrase( string );
    }
    finally
    {
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_4, thread );
      parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_3, thread );
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_2, thread );
      parsing_vars.$psp_return_mode$.rebind( _prev_bind_0, thread );
    }
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 7528L)
  public static SubLObject psp_hl_justify_parse(final SubLObject string, final SubLObject term_phrases_constraint, final SubLObject parse, SubLObject case_insensitiveP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    psp_possibly_clear_caches();
    final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding( thread );
    final SubLObject _prev_bind_2 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = parsing_vars.$psp_parse_to_match$.currentBinding( thread );
    final SubLObject _prev_bind_5 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_return_mode$.bind( $kw26$BEST_ONLY, thread );
      lexicon_vars.$lexicon_lookup_mt$.bind( mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
      parsing_vars.$psp_parse_to_match$.bind( ConsesLow.list( parse, term_phrases_constraint ), thread );
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( ( NIL == case_insensitiveP ) ? $kw27$ON : $kw28$OFF, thread );
      final SubLObject parses = ps_get_cycls_and_constraints_for_phrase( string );
      if( NIL != list_utilities.non_empty_list_p( parses ) )
      {
        final SubLObject parse_$8 = parses.first();
        supports = conses_high.third( parse_$8 );
      }
    }
    finally
    {
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_5, thread );
      parsing_vars.$psp_parse_to_match$.rebind( _prev_bind_4, thread );
      parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_3, thread );
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_2, thread );
      parsing_vars.$psp_return_mode$.rebind( _prev_bind_0, thread );
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 8126L)
  public static SubLObject ps_get_cycls_for_phrase_and_rule(final SubLObject string, final SubLObject rule_fort, SubLObject pos_pred, SubLObject non_trivialP, SubLObject lexicon, SubLObject gap)
  {
    if( pos_pred == UNPROVIDED )
    {
      pos_pred = $kw3$ANY;
    }
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( gap == UNPROVIDED )
    {
      gap = $kw9$NONE;
    }
    final SubLObject rule_struct = psp_rules.psp_rule_struct_for_rule_fort( rule_fort );
    final SubLObject rule_category = ( NIL != rule_struct ) ? psp_rules.psp_rule_category( rule_struct ) : $kw3$ANY;
    return ps_get_cycls_for_phrase( string, rule_category, pos_pred, non_trivialP, lexicon, gap, rule_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 8735L)
  public static SubLObject ps_harvest_nps(final SubLObject input_string, SubLObject non_trivialP, SubLObject lexicon)
  {
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = T;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    psp_possibly_clear_caches();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_lexicon$.bind( lexicon, thread );
      thread.resetMultipleValues();
      final SubLObject best_$9 = ps_harvest_phrases( input_string, $const15$NounPhrase, non_trivialP );
      final SubLObject rest_$10 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      best = best_$9;
      rest = rest_$10;
    }
    finally
    {
      parsing_vars.$psp_lexicon$.rebind( _prev_bind_0, thread );
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 9236L)
  public static SubLObject ps_harvest_nbars(final SubLObject input_string, SubLObject non_trivialP, SubLObject lexicon)
  {
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = T;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    psp_possibly_clear_caches();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_lexicon$.bind( lexicon, thread );
      thread.resetMultipleValues();
      final SubLObject best_$11 = ps_harvest_phrases( input_string, $list31, non_trivialP );
      final SubLObject rest_$12 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      best = best_$11;
      rest = rest_$12;
    }
    finally
    {
      parsing_vars.$psp_lexicon$.rebind( _prev_bind_0, thread );
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 9751L)
  public static SubLObject best_ps_parse_for_np(final SubLObject string, SubLObject pos_pred, SubLObject lexicon)
  {
    if( pos_pred == UNPROVIDED )
    {
      pos_pred = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_lexicon$.bind( lexicon, thread );
      SubLObject start_index = NIL;
      SubLObject end_index = NIL;
      SubLObject chart = NIL;
      if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), $kw9$NONE ) )
      {
        thread.resetMultipleValues();
        final SubLObject start_index_$13 = psp_find_string_in_charts( string, parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$.getDynamicValue( thread ) );
        final SubLObject end_index_$14 = thread.secondMultipleValue();
        final SubLObject chart_$15 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        start_index = start_index_$13;
        end_index = end_index_$14;
        chart = chart_$15;
      }
      if( NIL != start_index )
      {
        final SubLObject _prev_bind_0_$16 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
        final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
        final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
        try
        {
          parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
          parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
          parsing_vars.$psp_chart$.bind( chart, thread );
          psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
          final SubLObject np_edge = psp_chart.first_edge_matching_pos_pred( psp_chart.psp_np_edges(), pos_pred );
          if( NIL != np_edge )
          {
            ans = psp_chart.psp_edge_to_pph_phrase( np_edge );
          }
        }
        finally
        {
          parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
          parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
          parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0_$16, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$17 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
        final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
        try
        {
          parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
          parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
          final SubLObject chart_$16 = psp_syntax.psp_chart_for_string( string, parsing_macros.get_psp_lexicon(), $kw9$NONE, UNPROVIDED );
          final SubLObject local_state = psp_chart.psp_chart_memoization_state( chart_$16 );
          final SubLObject _prev_bind_0_$18 = memoization_state.$memoization_state$.currentBinding( thread );
          try
          {
            memoization_state.$memoization_state$.bind( local_state, thread );
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
            try
            {
              final SubLObject _prev_bind_0_$19 = parsing_vars.$psp_chart$.currentBinding( thread );
              try
              {
                parsing_vars.$psp_chart$.bind( chart_$16, thread );
                final SubLObject np_edge2 = psp_chart.first_edge_matching_pos_pred( psp_chart.psp_np_edges(), pos_pred );
                if( NIL != np_edge2 )
                {
                  ans = psp_chart.psp_edge_to_pph_phrase( np_edge2 );
                }
                if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
                {
                  psp_chart.destroy_psp_chart( UNPROVIDED );
                }
              }
              finally
              {
                parsing_vars.$psp_chart$.rebind( _prev_bind_0_$19, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
              }
            }
          }
          finally
          {
            memoization_state.$memoization_state$.rebind( _prev_bind_0_$18, thread );
          }
        }
        finally
        {
          parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
          parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0_$17, thread );
        }
      }
    }
    finally
    {
      parsing_vars.$psp_lexicon$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10488L)
  public static SubLObject psp_answer_accumulator_for_span(final SubLObject span)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject aa = dictionary.dictionary_lookup( $psp_answer_store$.getDynamicValue( thread ), span, $kw32$NEW_SPAN );
    if( $kw32$NEW_SPAN == aa )
    {
      aa = new_psp_answer_accumulator();
      dictionary.dictionary_enter( $psp_answer_store$.getDynamicValue( thread ), span, aa );
    }
    return aa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10756L)
  public static SubLObject with_new_psp_answer_store(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym33$CLET, $list34, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject psp_answer_accumulator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_psp_answer_accumulator( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject psp_answer_accumulator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $psp_answer_accumulator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject psp_answer_accumulator_best(final SubLObject v_object)
  {
    assert NIL != psp_answer_accumulator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject psp_answer_accumulator_rest(final SubLObject v_object)
  {
    assert NIL != psp_answer_accumulator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject psp_answer_accumulator_plist(final SubLObject v_object)
  {
    assert NIL != psp_answer_accumulator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject _csetf_psp_answer_accumulator_best(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != psp_answer_accumulator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject _csetf_psp_answer_accumulator_rest(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != psp_answer_accumulator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject _csetf_psp_answer_accumulator_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != psp_answer_accumulator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject make_psp_answer_accumulator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $psp_answer_accumulator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw50$BEST ) )
      {
        _csetf_psp_answer_accumulator_best( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$REST ) )
      {
        _csetf_psp_answer_accumulator_rest( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$PLIST ) )
      {
        _csetf_psp_answer_accumulator_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str53$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject visit_defstruct_psp_answer_accumulator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw54$BEGIN, $sym55$MAKE_PSP_ANSWER_ACCUMULATOR, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw56$SLOT, $kw50$BEST, psp_answer_accumulator_best( obj ) );
    Functions.funcall( visitor_fn, obj, $kw56$SLOT, $kw51$REST, psp_answer_accumulator_rest( obj ) );
    Functions.funcall( visitor_fn, obj, $kw56$SLOT, $kw52$PLIST, psp_answer_accumulator_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$END, $sym55$MAKE_PSP_ANSWER_ACCUMULATOR, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 10889L)
  public static SubLObject visit_defstruct_object_psp_answer_accumulator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_psp_answer_accumulator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 11111L)
  public static SubLObject new_psp_answer_accumulator()
  {
    return make_psp_answer_accumulator( $list59 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 11220L)
  public static SubLObject pprint_psp_answer_accumulator(final SubLObject aa, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    print_high.princ( $str60$__PSP_AA__, stream );
    if( NIL != psp_answer_accumulator_best( aa ) )
    {
      PrintLow.format( stream, $str61$BEST__D, Sequences.length( psp_answer_accumulator_best( aa ) ) );
    }
    else
    {
      print_high.princ( $str62$_empty_, stream );
    }
    if( NIL != psp_answer_accumulator_rest( aa ) )
    {
      PrintLow.format( stream, $str63$_REST__D, Sequences.length( psp_answer_accumulator_rest( aa ) ) );
    }
    print_high.princ( $str64$_, stream );
    return aa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 11639L)
  public static SubLObject psp_answer_accumulator_plist_lookup(final SubLObject aa, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return conses_high.getf( psp_answer_accumulator_plist( aa ), property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 11882L)
  public static SubLObject psp_answer_accumulator_plist_set(final SubLObject aa, final SubLObject property, final SubLObject value)
  {
    _csetf_psp_answer_accumulator_plist( aa, conses_high.putf( psp_answer_accumulator_plist( aa ), property, value ) );
    return psp_answer_accumulator_plist_lookup( aa, property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 12210L)
  public static SubLObject psp_answer_accumulator_add(final SubLObject aa, final SubLObject v_answer, final SubLObject type)
  {
    if( type.eql( $kw50$BEST ) )
    {
      if( NIL == conses_high.member( v_answer, psp_answer_accumulator_best( aa ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_psp_answer_accumulator_best( aa, ConsesLow.cons( v_answer, psp_answer_accumulator_best( aa ) ) );
      }
    }
    else if( type.eql( $kw51$REST ) )
    {
      if( NIL == subl_promotions.memberP( v_answer, psp_answer_accumulator_best( aa ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED ) )
      {
        if( NIL == conses_high.member( v_answer, psp_answer_accumulator_rest( aa ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), Symbols.symbol_function( IDENTITY ) ) )
        {
          _csetf_psp_answer_accumulator_rest( aa, ConsesLow.cons( v_answer, psp_answer_accumulator_rest( aa ) ) );
        }
      }
    }
    else
    {
      Errors.error( $str66$Bad_PSP_answer_type___S, type );
    }
    return aa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 12644L)
  public static SubLObject psp_answer_accumulator_update_best_weight(final SubLObject aa, final SubLObject weight)
  {
    final SubLObject current_best_weight = psp_answer_accumulator_best_weight( aa );
    if( NIL != psp_chart.psp_weight_G( weight, current_best_weight, $psp_weight_margin_of_error$.getGlobalValue() ) )
    {
      psp_answer_accumulator_set_best_weight( aa, weight );
    }
    return psp_answer_accumulator_best_weight( aa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 13078L)
  public static SubLObject psp_answer_accumulator_set_best_weight(final SubLObject aa, final SubLObject weight)
  {
    return psp_answer_accumulator_plist_set( aa, $kw68$BEST_WEIGHT, weight );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 13267L)
  public static SubLObject psp_answer_accumulator_best_weight(final SubLObject aa)
  {
    return psp_answer_accumulator_plist_lookup( aa, $kw68$BEST_WEIGHT, parsing_utilities.psp_weight_from_float( $float69$0_0 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 13484L)
  public static SubLObject psp_answer_accumulator_get_answers(final SubLObject aa)
  {
    SubLObject best = NIL;
    SubLObject rest = NIL;
    SubLObject cdolist_list_var = psp_semantics.sort_psp_cycls_by_weight_ascending( conses_high.copy_list( psp_answer_accumulator_best( aa ) ) );
    SubLObject psp_cycl = NIL;
    psp_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      best = ConsesLow.cons( psp_semantics.psp_cycl_cycl( psp_cycl ), best );
      cdolist_list_var = cdolist_list_var.rest();
      psp_cycl = cdolist_list_var.first();
    }
    cdolist_list_var = psp_semantics.sort_psp_cycls_by_weight_ascending( conses_high.copy_list( psp_answer_accumulator_rest( aa ) ) );
    psp_cycl = NIL;
    psp_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rest = ConsesLow.cons( psp_semantics.psp_cycl_cycl( psp_cycl ), rest );
      cdolist_list_var = cdolist_list_var.rest();
      psp_cycl = cdolist_list_var.first();
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 13912L)
  public static SubLObject psp_get_answers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $psp_answer_store$.getDynamicValue( thread ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject span = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject aa = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject span_best = psp_answer_accumulator_get_answers( aa );
      final SubLObject span_rest = thread.secondMultipleValue();
      thread.resetMultipleValues();
      best = ConsesLow.nconc( best, span_best );
      final SubLObject pcase_var = parsing_vars.$psp_return_mode$.getDynamicValue( thread );
      if( !pcase_var.eql( $kw26$BEST_ONLY ) )
      {
        if( !pcase_var.eql( $kw70$EVERYTHING ) )
        {
          rest = ConsesLow.nconc( rest, span_rest );
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 14419L)
  public static SubLObject psp_record_answers(final SubLObject span, final SubLObject new_cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject aa = psp_answer_accumulator_for_span( span );
    SubLObject best_weight = psp_answer_accumulator_best_weight( aa );
    SubLObject span_doneP = parsing_macros.parsing_timeout_time_reachedP();
    if( NIL == span_doneP )
    {
      SubLObject csome_list_var = Sort.sort( new_cycls, Symbols.symbol_function( $sym71$PSP_WEIGHT__ ), $sym72$PSP_CYCL_WEIGHT );
      SubLObject new_cycl = NIL;
      new_cycl = csome_list_var.first();
      while ( NIL == span_doneP && NIL != csome_list_var)
      {
        final SubLObject new_cycl_weight = psp_semantics.psp_cycl_weight( new_cycl );
        final SubLObject new_cycl_type = psp_answer_type( new_cycl_weight, best_weight );
        if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && new_cycl_type != $kw50$BEST )
        {
          span_doneP = T;
        }
        psp_answer_accumulator_add( aa, new_cycl, new_cycl_type );
        best_weight = psp_answer_accumulator_update_best_weight( aa, new_cycl_weight );
        csome_list_var = csome_list_var.rest();
        new_cycl = csome_list_var.first();
      }
    }
    return span_doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 15116L)
  public static SubLObject psp_answer_type(final SubLObject new_cycl_weight, final SubLObject best_weight)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw70$EVERYTHING || NIL != psp_weight_within_margin_of_errorP( new_cycl_weight, best_weight ) )
    {
      return $kw50$BEST;
    }
    return $kw51$REST;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 15337L)
  public static SubLObject psp_weight_within_margin_of_errorP(final SubLObject contender, final SubLObject champ)
  {
    return makeBoolean( NIL == psp_chart.psp_weight_G( champ, contender, $psp_weight_margin_of_error$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 15483L)
  public static SubLObject psp_no_answers_yet_p(final SubLObject span)
  {
    final SubLObject aa = psp_answer_accumulator_for_span( span );
    return Types.sublisp_null( psp_answer_accumulator_best( aa ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 15635L)
  public static SubLObject psp_do_update_results(final SubLObject span, SubLObject this_set_cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject span_doneP = NIL;
    if( NIL != this_set_cycls && NIL == span_doneP )
    {
      if( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) )
      {
        this_set_cycls = Sequences.remove_duplicates( psp_semantics.psp_reformulate_cycls( this_set_cycls ), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      span_doneP = psp_record_answers( span, this_set_cycls );
    }
    return span_doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 16093L)
  public static SubLObject psp_accumulate_answers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject edge = NIL;
    SubLObject edge_sets = NIL;
    SubLObject best = NIL;
    SubLObject rest = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
    edge = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
    edge_sets = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
    best = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
    rest = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject cycls_from_edge;
      current = ( cycls_from_edge = temp );
      final SubLObject edge_set = $sym74$EDGE_SET;
      final SubLObject done_spans = $sym75$DONE_SPANS;
      final SubLObject doneP = $sym76$DONE_;
      return ConsesLow.list( $sym77$PUNLESS, $list78, ConsesLow.list( $sym79$MEMOIZING_NL_REFORMULATOR, ConsesLow.list( $sym80$WITH_NEW_PSP_ANSWER_STORE, ConsesLow.list( $sym33$CLET, ConsesLow.list( reader.bq_cons(
          done_spans, $list81 ), reader.bq_cons( doneP, $list82 ) ), ConsesLow.list( $sym83$CSOME, ConsesLow.list( edge_set, edge_sets, doneP ), ConsesLow.listS( $sym84$PSP_ACCUMULATE_ANSWERS_ONE_SET, ConsesLow.list(
              edge, edge_set, done_spans, doneP ), ConsesLow.append( cycls_from_edge, NIL ) ), ConsesLow.list( $sym85$PWHEN, ConsesLow.list( $sym86$CAND, $list87, ConsesLow.list( $sym88$CNOT, doneP ) ), ConsesLow.listS(
                  $sym89$CSETQ, doneP, $list90 ) ) ) ), ConsesLow.listS( $sym91$CMULTIPLE_VALUE_SETQ, ConsesLow.list( best, rest ), $list92 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list73 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 16903L)
  public static SubLObject psp_accumulate_answers_one_set(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject edge = NIL;
    SubLObject edge_set = NIL;
    SubLObject done_spans = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    edge = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    edge_set = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    done_spans = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    doneP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject cycls_from_edge;
      current = ( cycls_from_edge = temp );
      final SubLObject this_set_cycls = $sym95$THIS_SET_CYCLS;
      return ConsesLow.list( $sym33$CLET, ConsesLow.list( reader.bq_cons( this_set_cycls, $list96 ) ), ConsesLow.list( $sym97$DO_SET, ConsesLow.list( edge, edge_set, $kw98$DONE, doneP ), ConsesLow.listS(
          $sym99$PSP_GATHER_CYCLS_FROM_EDGE, ConsesLow.list( edge, this_set_cycls, done_spans, doneP ), ConsesLow.append( cycls_from_edge, NIL ) ) ), ConsesLow.list( $sym100$PSP_UPDATE_RESULTS_FOR_EDGE_SET_CYCLS,
              this_set_cycls, done_spans ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 17386L)
  public static SubLObject psp_gather_cycls_from_edge(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject edge = NIL;
    SubLObject this_set_cycls = NIL;
    SubLObject done_spans = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    edge = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    this_set_cycls = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    done_spans = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    doneP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject cycls_from_edge;
      current = ( cycls_from_edge = temp );
      final SubLObject cycl = $sym102$CYCL;
      final SubLObject span = $sym103$SPAN;
      return ConsesLow.list( $sym33$CLET, ConsesLow.list( ConsesLow.list( span, ConsesLow.list( $sym104$GET_PSP_EDGE_SPAN, edge ) ) ), ConsesLow.list( $sym77$PUNLESS, ConsesLow.list( $sym105$SET_MEMBER_, span,
          done_spans ), ConsesLow.list( $sym106$CDOLIST, reader.bq_cons( cycl, ConsesLow.append( cycls_from_edge, NIL ) ), ConsesLow.list( $sym107$PSP_GATHER_ONE_CYCL, this_set_cycls, span, cycl ) ), ConsesLow.listS(
              $sym89$CSETQ, doneP, $list108 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list101 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 17825L)
  public static SubLObject psp_gather_one_cycl(final SubLObject this_set_cycls, final SubLObject span, final SubLObject cycl)
  {
    dictionary_utilities.dictionary_pushnew( this_set_cycls, span, cycl, $sym65$PSP_CYCL__, UNPROVIDED );
    return dictionary.dictionary_lookup( this_set_cycls, span, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18037L)
  public static SubLObject psp_update_results_for_edge_set_cycls(final SubLObject this_set_cycls, final SubLObject done_spans)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( this_set_cycls ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject span = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject span_cycls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject span_doneP = psp_do_update_results( span, span_cycls );
      if( NIL != span_doneP )
      {
        set.set_add( span, done_spans );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return done_spans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  public static SubLObject clear_ps_parse_vbar_int_cached()
  {
    final SubLObject cs = $ps_parse_vbar_int_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  public static SubLObject remove_ps_parse_vbar_int_cached(final SubLObject string, final SubLObject pos_pred, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $ps_parse_vbar_int_cached_caching_state$.getGlobalValue(), ConsesLow.list( string, pos_pred, environment ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  public static SubLObject ps_parse_vbar_int_cached_internal(final SubLObject string, final SubLObject pos_pred, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    SubLObject chart = NIL;
    if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_gap_type_allowed$
        .getDynamicValue( thread ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject start_index_$22 = psp_find_string_in_charts( string, parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$.getDynamicValue( thread ) );
      final SubLObject end_index_$23 = thread.secondMultipleValue();
      final SubLObject chart_$24 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      start_index = start_index_$22;
      end_index = end_index_$23;
      chart = chart_$24;
    }
    if( NIL != start_index )
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
        parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
        parsing_vars.$psp_chart$.bind( chart, thread );
        psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
        final SubLObject edge_sets = ps_parse_vbar_int_edge_sets( pos_pred );
        if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets )
        {
          parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets, Symbols.symbol_function( EQL ) ) ) );
        }
        if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
        {
          final SubLObject v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
          final SubLObject _prev_bind_0_$25 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
          try
          {
            reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state, thread );
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
            final SubLObject _prev_bind_0_$26 = memoization_state.$memoization_state$.currentBinding( thread );
            try
            {
              memoization_state.$memoization_state$.bind( local_state, thread );
              final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
              try
              {
                final SubLObject _prev_bind_0_$27 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                final SubLObject _prev_bind_1_$28 = $psp_answer_store$.currentBinding( thread );
                try
                {
                  nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                  $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                  final SubLObject done_spans = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  SubLObject doneP = NIL;
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var = edge_sets;
                    SubLObject edge_set = NIL;
                    edge_set = csome_list_var.first();
                    while ( NIL == doneP && NIL != csome_list_var)
                    {
                      final SubLObject this_set_cycls = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      final SubLObject set_contents_var = set.do_set_internal( edge_set );
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject edge;
                      SubLObject span;
                      SubLObject cdolist_list_var;
                      SubLObject cycl;
                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
                          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                      {
                        edge = set_contents.do_set_contents_next( basis_object, state );
                        if( NIL != set_contents.do_set_contents_element_validP( state, edge ) )
                        {
                          span = psp_chart.get_psp_edge_span( edge );
                          if( NIL == set.set_memberP( span, done_spans ) )
                          {
                            cdolist_list_var = ps_parse_vbar_int_edge_cycls( edge );
                            cycl = NIL;
                            cycl = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              psp_gather_one_cycl( this_set_cycls, span, cycl );
                              cdolist_list_var = cdolist_list_var.rest();
                              cycl = cdolist_list_var.first();
                            }
                            doneP = parsing_macros.parsing_timeout_time_reachedP();
                          }
                        }
                      }
                      psp_update_results_for_edge_set_cycls( this_set_cycls, done_spans );
                      if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP )
                      {
                        doneP = makeBoolean( NIL != psp_get_answers() );
                      }
                      csome_list_var = csome_list_var.rest();
                      edge_set = csome_list_var.first();
                    }
                  }
                  thread.resetMultipleValues();
                  final SubLObject best_$29 = psp_get_answers();
                  final SubLObject rest_$30 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  best = best_$29;
                  rest = rest_$30;
                }
                finally
                {
                  $psp_answer_store$.rebind( _prev_bind_1_$28, thread );
                  nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$27, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
                }
              }
            }
            finally
            {
              memoization_state.$memoization_state$.rebind( _prev_bind_0_$26, thread );
            }
          }
          finally
          {
            reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$25, thread );
          }
        }
      }
      finally
      {
        parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
        parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
        final SubLObject chart_$25 = psp_syntax.psp_chart_for_string( string, parsing_macros.get_psp_lexicon(), parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread ), UNPROVIDED );
        final SubLObject local_state2 = psp_chart.psp_chart_memoization_state( chart_$25 );
        final SubLObject _prev_bind_0_$29 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state2, thread );
          final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
          try
          {
            final SubLObject _prev_bind_0_$30 = parsing_vars.$psp_chart$.currentBinding( thread );
            try
            {
              parsing_vars.$psp_chart$.bind( chart_$25, thread );
              final SubLObject edge_sets2 = ps_parse_vbar_int_edge_sets( pos_pred );
              if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets2 )
              {
                parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets2, Symbols.symbol_function( EQL ) ) ) );
              }
              if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
              {
                final SubLObject v_memoization_state2 = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                assert NIL != memoization_state.memoization_state_p( v_memoization_state2 ) : v_memoization_state2;
                final SubLObject _prev_bind_0_$31 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
                try
                {
                  reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state2, thread );
                  final SubLObject local_state_$36 = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
                  final SubLObject _prev_bind_0_$32 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state_$36, thread );
                    final SubLObject original_memoization_process_$38 = memoization_state.memoization_state_original_process( local_state_$36 );
                    try
                    {
                      final SubLObject _prev_bind_0_$33 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$29 = $psp_answer_store$.currentBinding( thread );
                      try
                      {
                        nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                        $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                        final SubLObject done_spans2 = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        SubLObject doneP2 = NIL;
                        if( NIL == doneP2 )
                        {
                          SubLObject csome_list_var2 = edge_sets2;
                          SubLObject edge_set2 = NIL;
                          edge_set2 = csome_list_var2.first();
                          while ( NIL == doneP2 && NIL != csome_list_var2)
                          {
                            final SubLObject this_set_cycls2 = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                            final SubLObject set_contents_var2 = set.do_set_internal( edge_set2 );
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject edge2;
                            SubLObject span2;
                            SubLObject cdolist_list_var2;
                            SubLObject cycl2;
                            for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                set_contents_var2 ); NIL == doneP2 && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                            {
                              edge2 = set_contents.do_set_contents_next( basis_object2, state2 );
                              if( NIL != set_contents.do_set_contents_element_validP( state2, edge2 ) )
                              {
                                span2 = psp_chart.get_psp_edge_span( edge2 );
                                if( NIL == set.set_memberP( span2, done_spans2 ) )
                                {
                                  cdolist_list_var2 = ps_parse_vbar_int_edge_cycls( edge2 );
                                  cycl2 = NIL;
                                  cycl2 = cdolist_list_var2.first();
                                  while ( NIL != cdolist_list_var2)
                                  {
                                    psp_gather_one_cycl( this_set_cycls2, span2, cycl2 );
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    cycl2 = cdolist_list_var2.first();
                                  }
                                  doneP2 = parsing_macros.parsing_timeout_time_reachedP();
                                }
                              }
                            }
                            psp_update_results_for_edge_set_cycls( this_set_cycls2, done_spans2 );
                            if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP2 )
                            {
                              doneP2 = makeBoolean( NIL != psp_get_answers() );
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            edge_set2 = csome_list_var2.first();
                          }
                        }
                        thread.resetMultipleValues();
                        final SubLObject best_$30 = psp_get_answers();
                        final SubLObject rest_$31 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        best = best_$30;
                        rest = rest_$31;
                      }
                      finally
                      {
                        $psp_answer_store$.rebind( _prev_bind_1_$29, thread );
                        nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$33, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state_$36, original_memoization_process_$38 );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
                      }
                    }
                  }
                  finally
                  {
                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$32, thread );
                  }
                }
                finally
                {
                  reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$31, thread );
                }
              }
              if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
              {
                psp_chart.destroy_psp_chart( UNPROVIDED );
              }
            }
            finally
            {
              parsing_vars.$psp_chart$.rebind( _prev_bind_0_$30, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$29, thread );
        }
      }
      finally
      {
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  public static SubLObject ps_parse_vbar_int_cached(final SubLObject string, final SubLObject pos_pred, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    SubLObject caching_state = $ps_parse_vbar_int_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym109$PS_PARSE_VBAR_INT_CACHED, $sym113$_PS_PARSE_VBAR_INT_CACHED_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int114$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( string, pos_pred, environment );
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
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pos_pred.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && environment.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ps_parse_vbar_int_cached_internal( string, pos_pred, environment ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, pos_pred, environment ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  public static SubLObject ps_parse_vbar_int(final SubLObject string, final SubLObject pos_pred)
  {
    if( NIL != parsing_macros.bypass_psp_cachesP() )
    {
      return ps_parse_vbar_int_cached_internal( string, pos_pred, parsing_vars.psp_environmental_state() );
    }
    return ps_parse_vbar_int_cached( string, pos_pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  public static SubLObject ps_parse_vbar_int_edge_sets(final SubLObject pos_pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_edges = psp_chart.psp_input_spanning_edges( UNPROVIDED );
    final SubLObject vbar_edges = list_utilities.remove_if_not( $sym115$PSP_VBAR_EDGE_, max_edges, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject gap = parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread );
    final SubLObject filtered_edges = psp_filter_edges( vbar_edges, NIL, $kw3$ANY, ( NIL != pos_pred ) ? pos_pred : $kw3$ANY, gap, UNPROVIDED );
    final SubLObject sorted_edges = psp_sort_edges_by_weight( filtered_edges );
    return psp_edge_sets( sorted_edges, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 18348L)
  public static SubLObject ps_parse_vbar_int_edge_cycls(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, parsing_macros.$psp_sbhl_resourcing_limit$.getGlobalValue() ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      final SubLObject vbar_wrapper = $const116$TheVPParse;
      SubLObject doneP = parsing_macros.parsing_timeout_time_reachedP();
      if( NIL == doneP )
      {
        SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge( edge, T, NIL );
        SubLObject raw_cycl = NIL;
        raw_cycl = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          thread.resetMultipleValues();
          SubLObject new_cycl = psp_semantics.psp_extract_subject_semx( raw_cycl );
          final SubLObject subject_role = thread.secondMultipleValue();
          thread.resetMultipleValues();
          new_cycl = psp_semantics.psp_add_some_fn( new_cycl );
          if( NIL != subject_role )
          {
            new_cycl = psp_semantics.psp_cycl_subst( new_cycl, $kw117$REPLACE, el_utilities.make_binary_formula( vbar_wrapper, $kw117$REPLACE, subject_role ) );
          }
          cycls = psp_weight_and_add_cycl_to_cycls_for_edge( new_cycl, cycls, edge );
          doneP = parsing_macros.parsing_timeout_time_reachedP();
          csome_list_var = csome_list_var.rest();
          raw_cycl = csome_list_var.first();
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  public static SubLObject clear_ps_parse_predicative_adjp_int_cached()
  {
    final SubLObject cs = $ps_parse_predicative_adjp_int_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  public static SubLObject remove_ps_parse_predicative_adjp_int_cached(final SubLObject string, final SubLObject pos_pred, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $ps_parse_predicative_adjp_int_cached_caching_state$.getGlobalValue(), ConsesLow.list( string, pos_pred, environment ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  public static SubLObject ps_parse_predicative_adjp_int_cached_internal(final SubLObject string, final SubLObject pos_pred, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    SubLObject chart = NIL;
    if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_gap_type_allowed$
        .getDynamicValue( thread ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject start_index_$45 = psp_find_string_in_charts( string, parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$.getDynamicValue( thread ) );
      final SubLObject end_index_$46 = thread.secondMultipleValue();
      final SubLObject chart_$47 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      start_index = start_index_$45;
      end_index = end_index_$46;
      chart = chart_$47;
    }
    if( NIL != start_index )
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
        parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
        parsing_vars.$psp_chart$.bind( chart, thread );
        psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
        final SubLObject edge_sets = ps_parse_predicative_adjp_int_edge_sets( pos_pred );
        if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets )
        {
          parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets, Symbols.symbol_function( EQL ) ) ) );
        }
        if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
        {
          final SubLObject v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
          final SubLObject _prev_bind_0_$48 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
          try
          {
            reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state, thread );
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
            final SubLObject _prev_bind_0_$49 = memoization_state.$memoization_state$.currentBinding( thread );
            try
            {
              memoization_state.$memoization_state$.bind( local_state, thread );
              final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
              try
              {
                final SubLObject _prev_bind_0_$50 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                final SubLObject _prev_bind_1_$51 = $psp_answer_store$.currentBinding( thread );
                try
                {
                  nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                  $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                  final SubLObject done_spans = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  SubLObject doneP = NIL;
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var = edge_sets;
                    SubLObject edge_set = NIL;
                    edge_set = csome_list_var.first();
                    while ( NIL == doneP && NIL != csome_list_var)
                    {
                      final SubLObject this_set_cycls = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      final SubLObject set_contents_var = set.do_set_internal( edge_set );
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject edge;
                      SubLObject span;
                      SubLObject cdolist_list_var;
                      SubLObject cycl;
                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
                          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                      {
                        edge = set_contents.do_set_contents_next( basis_object, state );
                        if( NIL != set_contents.do_set_contents_element_validP( state, edge ) )
                        {
                          span = psp_chart.get_psp_edge_span( edge );
                          if( NIL == set.set_memberP( span, done_spans ) )
                          {
                            cdolist_list_var = ps_parse_predicative_adjp_int_edge_cycls( edge );
                            cycl = NIL;
                            cycl = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              psp_gather_one_cycl( this_set_cycls, span, cycl );
                              cdolist_list_var = cdolist_list_var.rest();
                              cycl = cdolist_list_var.first();
                            }
                            doneP = parsing_macros.parsing_timeout_time_reachedP();
                          }
                        }
                      }
                      psp_update_results_for_edge_set_cycls( this_set_cycls, done_spans );
                      if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP )
                      {
                        doneP = makeBoolean( NIL != psp_get_answers() );
                      }
                      csome_list_var = csome_list_var.rest();
                      edge_set = csome_list_var.first();
                    }
                  }
                  thread.resetMultipleValues();
                  final SubLObject best_$52 = psp_get_answers();
                  final SubLObject rest_$53 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  best = best_$52;
                  rest = rest_$53;
                }
                finally
                {
                  $psp_answer_store$.rebind( _prev_bind_1_$51, thread );
                  nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$50, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
                }
              }
            }
            finally
            {
              memoization_state.$memoization_state$.rebind( _prev_bind_0_$49, thread );
            }
          }
          finally
          {
            reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$48, thread );
          }
        }
      }
      finally
      {
        parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
        parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
        final SubLObject chart_$48 = psp_syntax.psp_chart_for_string( string, parsing_macros.get_psp_lexicon(), parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread ), UNPROVIDED );
        final SubLObject local_state2 = psp_chart.psp_chart_memoization_state( chart_$48 );
        final SubLObject _prev_bind_0_$52 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state2, thread );
          final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
          try
          {
            final SubLObject _prev_bind_0_$53 = parsing_vars.$psp_chart$.currentBinding( thread );
            try
            {
              parsing_vars.$psp_chart$.bind( chart_$48, thread );
              final SubLObject edge_sets2 = ps_parse_predicative_adjp_int_edge_sets( pos_pred );
              if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets2 )
              {
                parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets2, Symbols.symbol_function( EQL ) ) ) );
              }
              if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
              {
                final SubLObject v_memoization_state2 = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                assert NIL != memoization_state.memoization_state_p( v_memoization_state2 ) : v_memoization_state2;
                final SubLObject _prev_bind_0_$54 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
                try
                {
                  reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state2, thread );
                  final SubLObject local_state_$59 = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
                  final SubLObject _prev_bind_0_$55 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state_$59, thread );
                    final SubLObject original_memoization_process_$61 = memoization_state.memoization_state_original_process( local_state_$59 );
                    try
                    {
                      final SubLObject _prev_bind_0_$56 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$52 = $psp_answer_store$.currentBinding( thread );
                      try
                      {
                        nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                        $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                        final SubLObject done_spans2 = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        SubLObject doneP2 = NIL;
                        if( NIL == doneP2 )
                        {
                          SubLObject csome_list_var2 = edge_sets2;
                          SubLObject edge_set2 = NIL;
                          edge_set2 = csome_list_var2.first();
                          while ( NIL == doneP2 && NIL != csome_list_var2)
                          {
                            final SubLObject this_set_cycls2 = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                            final SubLObject set_contents_var2 = set.do_set_internal( edge_set2 );
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject edge2;
                            SubLObject span2;
                            SubLObject cdolist_list_var2;
                            SubLObject cycl2;
                            for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                set_contents_var2 ); NIL == doneP2 && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                            {
                              edge2 = set_contents.do_set_contents_next( basis_object2, state2 );
                              if( NIL != set_contents.do_set_contents_element_validP( state2, edge2 ) )
                              {
                                span2 = psp_chart.get_psp_edge_span( edge2 );
                                if( NIL == set.set_memberP( span2, done_spans2 ) )
                                {
                                  cdolist_list_var2 = ps_parse_predicative_adjp_int_edge_cycls( edge2 );
                                  cycl2 = NIL;
                                  cycl2 = cdolist_list_var2.first();
                                  while ( NIL != cdolist_list_var2)
                                  {
                                    psp_gather_one_cycl( this_set_cycls2, span2, cycl2 );
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    cycl2 = cdolist_list_var2.first();
                                  }
                                  doneP2 = parsing_macros.parsing_timeout_time_reachedP();
                                }
                              }
                            }
                            psp_update_results_for_edge_set_cycls( this_set_cycls2, done_spans2 );
                            if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP2 )
                            {
                              doneP2 = makeBoolean( NIL != psp_get_answers() );
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            edge_set2 = csome_list_var2.first();
                          }
                        }
                        thread.resetMultipleValues();
                        final SubLObject best_$53 = psp_get_answers();
                        final SubLObject rest_$54 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        best = best_$53;
                        rest = rest_$54;
                      }
                      finally
                      {
                        $psp_answer_store$.rebind( _prev_bind_1_$52, thread );
                        nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$56, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state_$59, original_memoization_process_$61 );
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
                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$55, thread );
                  }
                }
                finally
                {
                  reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$54, thread );
                }
              }
              if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
              {
                psp_chart.destroy_psp_chart( UNPROVIDED );
              }
            }
            finally
            {
              parsing_vars.$psp_chart$.rebind( _prev_bind_0_$53, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$52, thread );
        }
      }
      finally
      {
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  public static SubLObject ps_parse_predicative_adjp_int_cached(final SubLObject string, final SubLObject pos_pred, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    SubLObject caching_state = $ps_parse_predicative_adjp_int_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym118$PS_PARSE_PREDICATIVE_ADJP_INT_CACHED, $sym119$_PS_PARSE_PREDICATIVE_ADJP_INT_CACHED_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER,
          $int114$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( string, pos_pred, environment );
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
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pos_pred.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && environment.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ps_parse_predicative_adjp_int_cached_internal( string, pos_pred, environment ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, pos_pred, environment ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  public static SubLObject ps_parse_predicative_adjp_int(final SubLObject string, final SubLObject pos_pred)
  {
    if( NIL != parsing_macros.bypass_psp_cachesP() )
    {
      return ps_parse_predicative_adjp_int_cached_internal( string, pos_pred, parsing_vars.psp_environmental_state() );
    }
    return ps_parse_predicative_adjp_int_cached( string, pos_pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  public static SubLObject ps_parse_predicative_adjp_int_edge_sets(final SubLObject pos_pred)
  {
    final SubLObject max_edges = psp_chart.psp_input_spanning_edges( UNPROVIDED );
    final SubLObject adjp_edges = list_utilities.remove_if_not( $sym120$PSP_PREDICATIVE_ADJP_EDGE_, max_edges, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject filtered_edges = psp_filter_edges( adjp_edges, NIL, $kw3$ANY, ( NIL != pos_pred ) ? pos_pred : $kw3$ANY, UNPROVIDED, UNPROVIDED );
    final SubLObject sorted_edges = psp_sort_edges_by_weight( filtered_edges );
    return psp_edge_sets( sorted_edges, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 19486L)
  public static SubLObject ps_parse_predicative_adjp_int_edge_cycls(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, parsing_macros.$psp_sbhl_resourcing_limit$.getGlobalValue() ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      SubLObject doneP = parsing_macros.parsing_timeout_time_reachedP();
      final SubLObject groundP = T;
      if( NIL == doneP )
      {
        SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge( edge, T, groundP );
        SubLObject raw_cycl = NIL;
        raw_cycl = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject new_cycl = psp_process_adjp_cycl( raw_cycl );
          if( NIL == cycl_utilities.expression_find_if( Symbols.symbol_function( $sym121$KEYWORDP ), new_cycl, UNPROVIDED, UNPROVIDED ) )
          {
            cycls = psp_weight_and_add_cycl_to_cycls_for_edge( new_cycl, cycls, edge );
            doneP = parsing_macros.parsing_timeout_time_reachedP();
          }
          csome_list_var = csome_list_var.rest();
          raw_cycl = csome_list_var.first();
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20358L)
  public static SubLObject psp_process_adjp_cycl(final SubLObject raw_cycl)
  {
    final SubLObject new_cycl = psp_semantics.psp_cycl_subst( $const122$Thing, $kw123$NOUN, raw_cycl );
    return new_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  public static SubLObject clear_ps_get_cycls_for_phrase_int_cached()
  {
    final SubLObject cs = $ps_get_cycls_for_phrase_int_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  public static SubLObject remove_ps_get_cycls_for_phrase_int_cached(final SubLObject string, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject top_level_rule_fort,
      SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $ps_get_cycls_for_phrase_int_cached_caching_state$.getGlobalValue(), ConsesLow.list( string, category, pos_pred, non_trivialP,
        top_level_rule_fort, environment ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  public static SubLObject ps_get_cycls_for_phrase_int_cached_internal(final SubLObject string, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject top_level_rule_fort,
      final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    SubLObject chart = NIL;
    if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_gap_type_allowed$
        .getDynamicValue( thread ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject start_index_$68 = psp_find_string_in_charts( string, parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$.getDynamicValue( thread ) );
      final SubLObject end_index_$69 = thread.secondMultipleValue();
      final SubLObject chart_$70 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      start_index = start_index_$68;
      end_index = end_index_$69;
      chart = chart_$70;
    }
    if( NIL != start_index )
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
        parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
        parsing_vars.$psp_chart$.bind( chart, thread );
        psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
        final SubLObject edge_sets = ps_get_cycls_for_phrase_int_edge_sets( category, pos_pred, non_trivialP, top_level_rule_fort );
        if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets )
        {
          parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets, Symbols.symbol_function( EQL ) ) ) );
        }
        if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
        {
          final SubLObject v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
          final SubLObject _prev_bind_0_$71 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
          try
          {
            reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state, thread );
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
            final SubLObject _prev_bind_0_$72 = memoization_state.$memoization_state$.currentBinding( thread );
            try
            {
              memoization_state.$memoization_state$.bind( local_state, thread );
              final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
              try
              {
                final SubLObject _prev_bind_0_$73 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                final SubLObject _prev_bind_1_$74 = $psp_answer_store$.currentBinding( thread );
                try
                {
                  nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                  $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                  final SubLObject done_spans = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  SubLObject doneP = NIL;
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var = edge_sets;
                    SubLObject edge_set = NIL;
                    edge_set = csome_list_var.first();
                    while ( NIL == doneP && NIL != csome_list_var)
                    {
                      final SubLObject this_set_cycls = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      final SubLObject set_contents_var = set.do_set_internal( edge_set );
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject edge;
                      SubLObject span;
                      SubLObject cdolist_list_var;
                      SubLObject cycl;
                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
                          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                      {
                        edge = set_contents.do_set_contents_next( basis_object, state );
                        if( NIL != set_contents.do_set_contents_element_validP( state, edge ) )
                        {
                          span = psp_chart.get_psp_edge_span( edge );
                          if( NIL == set.set_memberP( span, done_spans ) )
                          {
                            cdolist_list_var = ps_get_cycls_for_phrase_int_edge_cycls( edge );
                            cycl = NIL;
                            cycl = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              psp_gather_one_cycl( this_set_cycls, span, cycl );
                              cdolist_list_var = cdolist_list_var.rest();
                              cycl = cdolist_list_var.first();
                            }
                            doneP = parsing_macros.parsing_timeout_time_reachedP();
                          }
                        }
                      }
                      psp_update_results_for_edge_set_cycls( this_set_cycls, done_spans );
                      if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP )
                      {
                        doneP = makeBoolean( NIL != psp_get_answers() );
                      }
                      csome_list_var = csome_list_var.rest();
                      edge_set = csome_list_var.first();
                    }
                  }
                  thread.resetMultipleValues();
                  final SubLObject best_$75 = psp_get_answers();
                  final SubLObject rest_$76 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  best = best_$75;
                  rest = rest_$76;
                }
                finally
                {
                  $psp_answer_store$.rebind( _prev_bind_1_$74, thread );
                  nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$73, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$74, thread );
                }
              }
            }
            finally
            {
              memoization_state.$memoization_state$.rebind( _prev_bind_0_$72, thread );
            }
          }
          finally
          {
            reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$71, thread );
          }
        }
      }
      finally
      {
        parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
        parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
        final SubLObject chart_$71 = psp_syntax.psp_chart_for_string( string, parsing_macros.get_psp_lexicon(), parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread ), UNPROVIDED );
        final SubLObject local_state2 = psp_chart.psp_chart_memoization_state( chart_$71 );
        final SubLObject _prev_bind_0_$75 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state2, thread );
          final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
          try
          {
            final SubLObject _prev_bind_0_$76 = parsing_vars.$psp_chart$.currentBinding( thread );
            try
            {
              parsing_vars.$psp_chart$.bind( chart_$71, thread );
              final SubLObject edge_sets2 = ps_get_cycls_for_phrase_int_edge_sets( category, pos_pred, non_trivialP, top_level_rule_fort );
              if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets2 )
              {
                parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets2, Symbols.symbol_function( EQL ) ) ) );
              }
              if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
              {
                final SubLObject v_memoization_state2 = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                assert NIL != memoization_state.memoization_state_p( v_memoization_state2 ) : v_memoization_state2;
                final SubLObject _prev_bind_0_$77 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
                try
                {
                  reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state2, thread );
                  final SubLObject local_state_$82 = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
                  final SubLObject _prev_bind_0_$78 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state_$82, thread );
                    final SubLObject original_memoization_process_$84 = memoization_state.memoization_state_original_process( local_state_$82 );
                    try
                    {
                      final SubLObject _prev_bind_0_$79 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$75 = $psp_answer_store$.currentBinding( thread );
                      try
                      {
                        nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                        $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                        final SubLObject done_spans2 = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        SubLObject doneP2 = NIL;
                        if( NIL == doneP2 )
                        {
                          SubLObject csome_list_var2 = edge_sets2;
                          SubLObject edge_set2 = NIL;
                          edge_set2 = csome_list_var2.first();
                          while ( NIL == doneP2 && NIL != csome_list_var2)
                          {
                            final SubLObject this_set_cycls2 = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                            final SubLObject set_contents_var2 = set.do_set_internal( edge_set2 );
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject edge2;
                            SubLObject span2;
                            SubLObject cdolist_list_var2;
                            SubLObject cycl2;
                            for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                set_contents_var2 ); NIL == doneP2 && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                            {
                              edge2 = set_contents.do_set_contents_next( basis_object2, state2 );
                              if( NIL != set_contents.do_set_contents_element_validP( state2, edge2 ) )
                              {
                                span2 = psp_chart.get_psp_edge_span( edge2 );
                                if( NIL == set.set_memberP( span2, done_spans2 ) )
                                {
                                  cdolist_list_var2 = ps_get_cycls_for_phrase_int_edge_cycls( edge2 );
                                  cycl2 = NIL;
                                  cycl2 = cdolist_list_var2.first();
                                  while ( NIL != cdolist_list_var2)
                                  {
                                    psp_gather_one_cycl( this_set_cycls2, span2, cycl2 );
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    cycl2 = cdolist_list_var2.first();
                                  }
                                  doneP2 = parsing_macros.parsing_timeout_time_reachedP();
                                }
                              }
                            }
                            psp_update_results_for_edge_set_cycls( this_set_cycls2, done_spans2 );
                            if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP2 )
                            {
                              doneP2 = makeBoolean( NIL != psp_get_answers() );
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            edge_set2 = csome_list_var2.first();
                          }
                        }
                        thread.resetMultipleValues();
                        final SubLObject best_$76 = psp_get_answers();
                        final SubLObject rest_$77 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        best = best_$76;
                        rest = rest_$77;
                      }
                      finally
                      {
                        $psp_answer_store$.rebind( _prev_bind_1_$75, thread );
                        nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$79, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state_$82, original_memoization_process_$84 );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$80, thread );
                      }
                    }
                  }
                  finally
                  {
                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$78, thread );
                  }
                }
                finally
                {
                  reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$77, thread );
                }
              }
              if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
              {
                psp_chart.destroy_psp_chart( UNPROVIDED );
              }
            }
            finally
            {
              parsing_vars.$psp_chart$.rebind( _prev_bind_0_$76, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$75, thread );
        }
      }
      finally
      {
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  public static SubLObject ps_get_cycls_for_phrase_int_cached(final SubLObject string, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject top_level_rule_fort,
      SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    SubLObject caching_state = $ps_get_cycls_for_phrase_int_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym124$PS_GET_CYCLS_FOR_PHRASE_INT_CACHED, $sym125$_PS_GET_CYCLS_FOR_PHRASE_INT_CACHED_CACHING_STATE_, NIL, EQUAL, SIX_INTEGER,
          $int114$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( string, category, pos_pred, non_trivialP, top_level_rule_fort, environment );
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
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( category.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( pos_pred.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( non_trivialP.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( top_level_rule_fort.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && environment.equal( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ps_get_cycls_for_phrase_int_cached_internal( string, category, pos_pred, non_trivialP, top_level_rule_fort,
        environment ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, category, pos_pred, non_trivialP, top_level_rule_fort, environment ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  public static SubLObject ps_get_cycls_for_phrase_int(final SubLObject string, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject top_level_rule_fort)
  {
    if( NIL != parsing_macros.bypass_psp_cachesP() )
    {
      return ps_get_cycls_for_phrase_int_cached_internal( string, category, pos_pred, non_trivialP, top_level_rule_fort, parsing_vars.psp_environmental_state() );
    }
    return ps_get_cycls_for_phrase_int_cached( string, category, pos_pred, non_trivialP, top_level_rule_fort, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  public static SubLObject ps_get_cycls_for_phrase_int_edge_sets(final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject top_level_rule_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_edges = psp_chart.psp_input_spanning_edges( UNPROVIDED );
    final SubLObject gap = parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread );
    final SubLObject filtered_edges = psp_filter_edges( max_edges, non_trivialP, category, pos_pred, gap, top_level_rule_fort );
    final SubLObject sorted_edges = psp_sort_edges_by_weight( filtered_edges );
    return psp_edge_sets( sorted_edges, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 20490L)
  public static SubLObject ps_get_cycls_for_phrase_int_edge_cycls(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, parsing_macros.$psp_sbhl_resourcing_limit$.getGlobalValue() ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      SubLObject doneP = parsing_macros.parsing_timeout_time_reachedP();
      if( NIL == doneP )
      {
        SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge( edge, UNPROVIDED, UNPROVIDED );
        SubLObject cycl = NIL;
        cycl = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject subbed_cycl = psp_semantics.psp_cycl_subst( $const126$TheSentenceSubject, $kw127$SUBJECT, cycl );
          cycls = psp_weight_and_add_cycl_to_cycls_for_edge( subbed_cycl, cycls, edge );
          doneP = parsing_macros.parsing_timeout_time_reachedP();
          csome_list_var = csome_list_var.rest();
          cycl = csome_list_var.first();
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  public static SubLObject clear_ps_get_cycls_and_constraints_for_phrase_cached()
  {
    final SubLObject cs = $ps_get_cycls_and_constraints_for_phrase_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  public static SubLObject remove_ps_get_cycls_and_constraints_for_phrase_cached(final SubLObject string, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $ps_get_cycls_and_constraints_for_phrase_cached_caching_state$.getGlobalValue(), ConsesLow.list( string, environment ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  public static SubLObject ps_get_cycls_and_constraints_for_phrase_cached_internal(final SubLObject string, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    SubLObject chart = NIL;
    if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_gap_type_allowed$
        .getDynamicValue( thread ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject start_index_$91 = psp_find_string_in_charts( string, parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$.getDynamicValue( thread ) );
      final SubLObject end_index_$92 = thread.secondMultipleValue();
      final SubLObject chart_$93 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      start_index = start_index_$91;
      end_index = end_index_$92;
      chart = chart_$93;
    }
    if( NIL != start_index )
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
        parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
        parsing_vars.$psp_chart$.bind( chart, thread );
        psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
        final SubLObject edge_sets = ps_get_cycls_and_constraints_for_phrase_edge_sets();
        if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets )
        {
          parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets, Symbols.symbol_function( EQL ) ) ) );
        }
        if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
        {
          final SubLObject v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
          final SubLObject _prev_bind_0_$94 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
          try
          {
            reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state, thread );
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
            final SubLObject _prev_bind_0_$95 = memoization_state.$memoization_state$.currentBinding( thread );
            try
            {
              memoization_state.$memoization_state$.bind( local_state, thread );
              final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
              try
              {
                final SubLObject _prev_bind_0_$96 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                final SubLObject _prev_bind_1_$97 = $psp_answer_store$.currentBinding( thread );
                try
                {
                  nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                  $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                  final SubLObject done_spans = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  SubLObject doneP = NIL;
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var = edge_sets;
                    SubLObject edge_set = NIL;
                    edge_set = csome_list_var.first();
                    while ( NIL == doneP && NIL != csome_list_var)
                    {
                      final SubLObject this_set_cycls = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      final SubLObject set_contents_var = set.do_set_internal( edge_set );
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject edge;
                      SubLObject span;
                      SubLObject cdolist_list_var;
                      SubLObject cycl;
                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
                          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                      {
                        edge = set_contents.do_set_contents_next( basis_object, state );
                        if( NIL != set_contents.do_set_contents_element_validP( state, edge ) )
                        {
                          span = psp_chart.get_psp_edge_span( edge );
                          if( NIL == set.set_memberP( span, done_spans ) )
                          {
                            cdolist_list_var = ps_get_cycls_and_constraints_for_phrase_edge_cycls( edge );
                            cycl = NIL;
                            cycl = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              psp_gather_one_cycl( this_set_cycls, span, cycl );
                              cdolist_list_var = cdolist_list_var.rest();
                              cycl = cdolist_list_var.first();
                            }
                            doneP = parsing_macros.parsing_timeout_time_reachedP();
                          }
                        }
                      }
                      psp_update_results_for_edge_set_cycls( this_set_cycls, done_spans );
                      if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP )
                      {
                        doneP = makeBoolean( NIL != psp_get_answers() );
                      }
                      csome_list_var = csome_list_var.rest();
                      edge_set = csome_list_var.first();
                    }
                  }
                  thread.resetMultipleValues();
                  final SubLObject best_$98 = psp_get_answers();
                  final SubLObject rest_$99 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  best = best_$98;
                  rest = rest_$99;
                }
                finally
                {
                  $psp_answer_store$.rebind( _prev_bind_1_$97, thread );
                  nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$96, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
                }
              }
            }
            finally
            {
              memoization_state.$memoization_state$.rebind( _prev_bind_0_$95, thread );
            }
          }
          finally
          {
            reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$94, thread );
          }
        }
      }
      finally
      {
        parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
        parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
        final SubLObject chart_$94 = psp_syntax.psp_chart_for_string( string, parsing_macros.get_psp_lexicon(), parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread ), UNPROVIDED );
        final SubLObject local_state2 = psp_chart.psp_chart_memoization_state( chart_$94 );
        final SubLObject _prev_bind_0_$98 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state2, thread );
          final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
          try
          {
            final SubLObject _prev_bind_0_$99 = parsing_vars.$psp_chart$.currentBinding( thread );
            try
            {
              parsing_vars.$psp_chart$.bind( chart_$94, thread );
              final SubLObject edge_sets2 = ps_get_cycls_and_constraints_for_phrase_edge_sets();
              if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets2 )
              {
                parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets2, Symbols.symbol_function( EQL ) ) ) );
              }
              if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
              {
                final SubLObject v_memoization_state2 = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                assert NIL != memoization_state.memoization_state_p( v_memoization_state2 ) : v_memoization_state2;
                final SubLObject _prev_bind_0_$100 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
                try
                {
                  reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state2, thread );
                  final SubLObject local_state_$105 = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
                  final SubLObject _prev_bind_0_$101 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state_$105, thread );
                    final SubLObject original_memoization_process_$107 = memoization_state.memoization_state_original_process( local_state_$105 );
                    try
                    {
                      final SubLObject _prev_bind_0_$102 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$98 = $psp_answer_store$.currentBinding( thread );
                      try
                      {
                        nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                        $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                        final SubLObject done_spans2 = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        SubLObject doneP2 = NIL;
                        if( NIL == doneP2 )
                        {
                          SubLObject csome_list_var2 = edge_sets2;
                          SubLObject edge_set2 = NIL;
                          edge_set2 = csome_list_var2.first();
                          while ( NIL == doneP2 && NIL != csome_list_var2)
                          {
                            final SubLObject this_set_cycls2 = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                            final SubLObject set_contents_var2 = set.do_set_internal( edge_set2 );
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject edge2;
                            SubLObject span2;
                            SubLObject cdolist_list_var2;
                            SubLObject cycl2;
                            for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                set_contents_var2 ); NIL == doneP2 && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                            {
                              edge2 = set_contents.do_set_contents_next( basis_object2, state2 );
                              if( NIL != set_contents.do_set_contents_element_validP( state2, edge2 ) )
                              {
                                span2 = psp_chart.get_psp_edge_span( edge2 );
                                if( NIL == set.set_memberP( span2, done_spans2 ) )
                                {
                                  cdolist_list_var2 = ps_get_cycls_and_constraints_for_phrase_edge_cycls( edge2 );
                                  cycl2 = NIL;
                                  cycl2 = cdolist_list_var2.first();
                                  while ( NIL != cdolist_list_var2)
                                  {
                                    psp_gather_one_cycl( this_set_cycls2, span2, cycl2 );
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    cycl2 = cdolist_list_var2.first();
                                  }
                                  doneP2 = parsing_macros.parsing_timeout_time_reachedP();
                                }
                              }
                            }
                            psp_update_results_for_edge_set_cycls( this_set_cycls2, done_spans2 );
                            if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP2 )
                            {
                              doneP2 = makeBoolean( NIL != psp_get_answers() );
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            edge_set2 = csome_list_var2.first();
                          }
                        }
                        thread.resetMultipleValues();
                        final SubLObject best_$99 = psp_get_answers();
                        final SubLObject rest_$100 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        best = best_$99;
                        rest = rest_$100;
                      }
                      finally
                      {
                        $psp_answer_store$.rebind( _prev_bind_1_$98, thread );
                        nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$102, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state_$105, original_memoization_process_$107 );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$103, thread );
                      }
                    }
                  }
                  finally
                  {
                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$101, thread );
                  }
                }
                finally
                {
                  reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$100, thread );
                }
              }
              if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
              {
                psp_chart.destroy_psp_chart( UNPROVIDED );
              }
            }
            finally
            {
              parsing_vars.$psp_chart$.rebind( _prev_bind_0_$99, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$104, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$98, thread );
        }
      }
      finally
      {
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  public static SubLObject ps_get_cycls_and_constraints_for_phrase_cached(final SubLObject string, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    SubLObject caching_state = $ps_get_cycls_and_constraints_for_phrase_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym128$PS_GET_CYCLS_AND_CONSTRAINTS_FOR_PHRASE_CACHED, $sym129$_PS_GET_CYCLS_AND_CONSTRAINTS_FOR_PHRASE_CACHED_CACHING_STATE_, NIL, EQUAL,
          TWO_INTEGER, $int114$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( string, environment );
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
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && environment.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ps_get_cycls_and_constraints_for_phrase_cached_internal( string, environment ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, environment ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  public static SubLObject ps_get_cycls_and_constraints_for_phrase(final SubLObject string)
  {
    if( NIL != parsing_macros.bypass_psp_cachesP() )
    {
      return ps_get_cycls_and_constraints_for_phrase_cached_internal( string, parsing_vars.psp_environmental_state() );
    }
    return ps_get_cycls_and_constraints_for_phrase_cached( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  public static SubLObject ps_get_cycls_and_constraints_for_phrase_edge_sets()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_edges = psp_chart.psp_input_spanning_edges( UNPROVIDED );
    final SubLObject gap = parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread );
    final SubLObject filtered_edges = psp_filter_edges( max_edges, T, $kw3$ANY, $kw3$ANY, gap, $kw3$ANY );
    final SubLObject sorted_edges = psp_sort_edges_by_weight( filtered_edges );
    return psp_edge_sets( sorted_edges, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 21340L)
  public static SubLObject ps_get_cycls_and_constraints_for_phrase_edge_cycls(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, parsing_macros.$psp_sbhl_resourcing_limit$.getGlobalValue() ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      SubLObject doneP = parsing_macros.parsing_timeout_time_reachedP();
      final SubLObject term_phrases_constraint = get_psp_edge_term_phrases_constraint( edge );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge( edge, UNPROVIDED, UNPROVIDED );
        SubLObject cycl = NIL;
        cycl = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject subbed_cycl = psp_adjust_cycl_weight_for_edge( psp_semantics.psp_cycl_subst( $const126$TheSentenceSubject, $kw127$SUBJECT, cycl ), edge );
          final SubLObject cycl_cycl = psp_semantics.psp_cycl_cycl( subbed_cycl );
          if( NIL == misc_utilities.initialized_p( parsing_vars.$psp_parse_to_match$.getDynamicValue( thread ) ) || NIL != psp_parse_matches_inputP( cycl_cycl, edge, parsing_vars.$psp_parse_to_match$.getDynamicValue(
              thread ) ) )
          {
            final SubLObject supports = ( NIL != misc_utilities.initialized_p( parsing_vars.$psp_parse_to_match$.getDynamicValue( thread ) ) ) ? psp_edge_gather_supports( edge ) : NIL;
            final SubLObject edge_info = ConsesLow.list( cycl_cycl, term_phrases_constraint, supports );
            psp_semantics.psp_weighted_cycl_set_cycl( subbed_cycl, edge_info );
            if( NIL == subl_promotions.memberP( subbed_cycl, cycls, Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED ) )
            {
              cycls = ConsesLow.cons( subbed_cycl, cycls );
            }
            if( NIL != misc_utilities.initialized_p( parsing_vars.$psp_parse_to_match$.getDynamicValue( thread ) ) )
            {
              doneP = T;
            }
          }
          if( NIL != parsing_macros.parsing_timeout_time_reachedP() )
          {
            doneP = T;
          }
          csome_list_var = csome_list_var.rest();
          cycl = csome_list_var.first();
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 22708L)
  public static SubLObject psp_parse_matches_inputP(final SubLObject cycl_cycl, final SubLObject edge, final SubLObject parse_to_match)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject target_cycl = NIL;
    SubLObject target_constraint = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( parse_to_match, parse_to_match, $list130 );
    target_cycl = parse_to_match.first();
    SubLObject current = parse_to_match.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, parse_to_match, $list130 );
    target_constraint = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != psp_edge_matches_target_constraintP( edge, target_constraint ) )
      {
        final SubLObject final_cycl = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate( cycl_cycl ) : cycl_cycl;
        return psp_semantics.psp_cycl_E( final_cycl, target_cycl );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( parse_to_match, $list130 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 23061L)
  public static SubLObject psp_edge_matches_target_constraintP(final SubLObject edge, final SubLObject target_constraint)
  {
    if( target_constraint.eql( $const29$CharacterString ) )
    {
      return T;
    }
    if( NIL == lexicon_accessors.speech_partP( target_constraint, UNPROVIDED ) && NIL == lexicon_accessors.speech_part_predP( target_constraint, UNPROVIDED ) )
    {
      return genls.genlP( psp_chart.get_psp_edge_category( edge ), target_constraint, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject preds = removal_modules_lexicon.preds_from_term_phrases_constraint( target_constraint );
    if( preds.isList() )
    {
      return subl_promotions.memberP( psp_chart.get_psp_edge_pos_pred( edge ), preds, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 23533L)
  public static SubLObject get_psp_edge_term_phrases_constraint(final SubLObject edge)
  {
    if( NIL != lexicon_accessors.speech_part_predP( psp_chart.get_psp_edge_pos_pred( edge ), UNPROVIDED ) )
    {
      return psp_chart.get_psp_edge_pos_pred( edge );
    }
    return $const29$CharacterString;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 23755L)
  public static SubLObject psp_edge_gather_supports(final SubLObject edge)
  {
    SubLObject supports = NIL;
    final SubLObject var;
    final SubLObject lexical_support = var = ( NIL != psp_chart.psp_lexical_edgeP( edge ) ) ? psp_edge_lexical_support( edge ) : NIL;
    if( NIL != var )
    {
      supports = ConsesLow.cons( var, supports );
    }
    SubLObject csome_list_var = psp_chart.psp_edge_dtrs( edge );
    SubLObject dtr = NIL;
    dtr = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      final SubLObject items_var = psp_edge_gather_supports( dtr );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = Vectors.aref( vector_var, element_num );
          supports = ConsesLow.cons( item, supports );
        }
      }
      else
      {
        SubLObject cdolist_list_var = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          supports = ConsesLow.cons( item2, supports );
          cdolist_list_var = cdolist_list_var.rest();
          item2 = cdolist_list_var.first();
        }
      }
      csome_list_var = csome_list_var.rest();
      dtr = csome_list_var.first();
    }
    return Sequences.delete_duplicates( supports, EQUAL, $sym131$SUPPORT_SENTENCE, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 24111L)
  public static SubLObject psp_edge_lexical_support(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_pred = psp_chart.get_psp_edge_pos_pred( edge );
    final SubLObject string = psp_chart.get_psp_edge_string( edge );
    if( NIL != pos_pred && NIL != string )
    {
      SubLObject cdolist_list_var = psp_chart.psp_edge_lookup_semx( edge, $kw133$DENOT_GROUND );
      SubLObject cycl = NIL;
      cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != cycl_utilities.expression_find( psp_semantics.psp_cycl_cycl( cycl ), parsing_vars.$psp_parse_to_match$.getDynamicValue( thread ).first(), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED ) )
        {
          return removal_modules_lexicon.make_term_phrases_support( ConsesLow.list( $const132$termPhrases_Lexical, psp_semantics.psp_cycl_cycl( cycl ), pos_pred, string ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cycl = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 24537L)
  public static SubLObject psp_weight_and_add_cycl_to_cycls_for_edge(SubLObject cycl, SubLObject cycls, final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_promotions.memberP( cycl, cycls, $sym65$PSP_CYCL__, UNPROVIDED ) )
    {
      cycl = psp_adjust_cycl_weight_for_edge( cycl, edge );
      if( NIL != parsing_vars.$psp_verboseP$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str134$__Weight___S__CycL___S____, psp_semantics.psp_weighted_cycl_weight( cycl ), cycl );
      }
      cycls = ConsesLow.cons( cycl, cycls );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 24877L)
  public static SubLObject psp_adjust_cycl_weights_for_edge(final SubLObject cycls, final SubLObject edge)
  {
    SubLObject adjusted = NIL;
    SubLObject cdolist_list_var = cycls;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      adjusted = ConsesLow.cons( psp_adjust_cycl_weight_for_edge( cycl, edge ), adjusted );
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return Sequences.nreverse( adjusted );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 25090L)
  public static SubLObject psp_adjust_cycl_weight_for_edge(SubLObject cycl, final SubLObject edge)
  {
    if( NIL == psp_semantics.psp_weighted_cycl_p( cycl ) )
    {
      cycl = psp_semantics.psp_weight_cycl( cycl, parsing_utilities.psp_weight_from_float( $float135$1_0 ) );
    }
    final SubLObject new_weight = psp_chart.psp_weight_compose_two( psp_chart.get_psp_edge_weight( edge ), psp_semantics.psp_weighted_cycl_weight( cycl ) );
    psp_semantics.psp_weighted_cycl_set_weight( cycl, new_weight );
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 25450L)
  public static SubLObject ps_harvest_phrases(final SubLObject string, SubLObject category, SubLObject non_trivialP)
  {
    if( category == UNPROVIDED )
    {
      category = $const15$NounPhrase;
    }
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    final SubLObject reformulateP = parsing_vars.$psp_reformulateP$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = parsing_vars.$psp_reformulateP$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_reformulateP$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject raw_best = ps_harvest_phrases_int( string, category, non_trivialP );
      final SubLObject raw_rest = thread.secondMultipleValue();
      thread.resetMultipleValues();
      best = psp_span_cycl_pairs_to_harvest( raw_best, reformulateP );
      rest = psp_span_cycl_pairs_to_harvest( raw_rest, reformulateP );
    }
    finally
    {
      parsing_vars.$psp_reformulateP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 25951L)
  public static SubLObject psp_span_cycl_pairs_to_harvest(final SubLObject pairs, final SubLObject reformulateP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject span_dict = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject harvest = NIL;
    SubLObject cdolist_list_var = pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject span = NIL;
      SubLObject cycl = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list136 );
      span = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list136 );
      cycl = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject possibly_reformulated_cycl = ( NIL != reformulateP ) ? psp_semantics.psp_reformulate( cycl ) : cycl;
        if( NIL != possibly_reformulated_cycl )
        {
          dictionary_utilities.dictionary_pushnew( span_dict, span, possibly_reformulated_cycl, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list136 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( span_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject span2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject cycls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      harvest = ConsesLow.cons( ConsesLow.list( span2, psp_semantics.psp_cycls_to_cycls( Sequences.nreverse( cycls ) ) ), harvest );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return psp_sort_harvest( harvest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26667L)
  public static SubLObject psp_sort_harvest(final SubLObject harvest)
  {
    final SubLObject by_start = Sort.sort( harvest, Symbols.symbol_function( $sym137$_ ), Symbols.symbol_function( $sym138$CAAR ) );
    final SubLObject by_length = Sort.stable_sort( by_start, Symbols.symbol_function( $sym139$GREATER_LENGTH_P ), Symbols.symbol_function( $sym140$CAR ) );
    return by_length;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  public static SubLObject clear_ps_harvest_phrases_int_cached()
  {
    final SubLObject cs = $ps_harvest_phrases_int_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  public static SubLObject remove_ps_harvest_phrases_int_cached(final SubLObject string, final SubLObject category, final SubLObject non_trivialP, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $ps_harvest_phrases_int_cached_caching_state$.getGlobalValue(), ConsesLow.list( string, category, non_trivialP, environment ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  public static SubLObject ps_harvest_phrases_int_cached_internal(final SubLObject string, final SubLObject category, final SubLObject non_trivialP, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best = NIL;
    SubLObject rest = NIL;
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    SubLObject chart = NIL;
    if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_gap_type_allowed$
        .getDynamicValue( thread ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject start_index_$114 = psp_find_string_in_charts( string, parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$.getDynamicValue( thread ) );
      final SubLObject end_index_$115 = thread.secondMultipleValue();
      final SubLObject chart_$116 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      start_index = start_index_$114;
      end_index = end_index_$115;
      chart = chart_$116;
    }
    if( NIL != start_index )
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
        parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
        parsing_vars.$psp_chart$.bind( chart, thread );
        psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
        final SubLObject edge_sets = ps_harvest_phrases_int_edge_sets( category, non_trivialP );
        if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets )
        {
          parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets, Symbols.symbol_function( EQL ) ) ) );
        }
        if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
        {
          final SubLObject v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
          final SubLObject _prev_bind_0_$117 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
          try
          {
            reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state, thread );
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
            final SubLObject _prev_bind_0_$118 = memoization_state.$memoization_state$.currentBinding( thread );
            try
            {
              memoization_state.$memoization_state$.bind( local_state, thread );
              final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
              try
              {
                final SubLObject _prev_bind_0_$119 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                final SubLObject _prev_bind_1_$120 = $psp_answer_store$.currentBinding( thread );
                try
                {
                  nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                  $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                  final SubLObject done_spans = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  SubLObject doneP = NIL;
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var = edge_sets;
                    SubLObject edge_set = NIL;
                    edge_set = csome_list_var.first();
                    while ( NIL == doneP && NIL != csome_list_var)
                    {
                      final SubLObject this_set_cycls = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      final SubLObject set_contents_var = set.do_set_internal( edge_set );
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject edge;
                      SubLObject span;
                      SubLObject cdolist_list_var;
                      SubLObject cycl;
                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == doneP
                          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                      {
                        edge = set_contents.do_set_contents_next( basis_object, state );
                        if( NIL != set_contents.do_set_contents_element_validP( state, edge ) )
                        {
                          span = psp_chart.get_psp_edge_span( edge );
                          if( NIL == set.set_memberP( span, done_spans ) )
                          {
                            cdolist_list_var = ps_harvest_phrases_int_edge_cycls( edge );
                            cycl = NIL;
                            cycl = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              psp_gather_one_cycl( this_set_cycls, span, cycl );
                              cdolist_list_var = cdolist_list_var.rest();
                              cycl = cdolist_list_var.first();
                            }
                            doneP = parsing_macros.parsing_timeout_time_reachedP();
                          }
                        }
                      }
                      psp_update_results_for_edge_set_cycls( this_set_cycls, done_spans );
                      if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP )
                      {
                        doneP = makeBoolean( NIL != psp_get_answers() );
                      }
                      csome_list_var = csome_list_var.rest();
                      edge_set = csome_list_var.first();
                    }
                  }
                  thread.resetMultipleValues();
                  final SubLObject best_$121 = psp_get_answers();
                  final SubLObject rest_$122 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  best = best_$121;
                  rest = rest_$122;
                }
                finally
                {
                  $psp_answer_store$.rebind( _prev_bind_1_$120, thread );
                  nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$119, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$120, thread );
                }
              }
            }
            finally
            {
              memoization_state.$memoization_state$.rebind( _prev_bind_0_$118, thread );
            }
          }
          finally
          {
            reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$117, thread );
          }
        }
      }
      finally
      {
        parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
        parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
        final SubLObject chart_$117 = psp_syntax.psp_chart_for_string( string, parsing_macros.get_psp_lexicon(), parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread ), UNPROVIDED );
        final SubLObject local_state2 = psp_chart.psp_chart_memoization_state( chart_$117 );
        final SubLObject _prev_bind_0_$121 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state2, thread );
          final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
          try
          {
            final SubLObject _prev_bind_0_$122 = parsing_vars.$psp_chart$.currentBinding( thread );
            try
            {
              parsing_vars.$psp_chart$.bind( chart_$117, thread );
              final SubLObject edge_sets2 = ps_harvest_phrases_int_edge_sets( category, non_trivialP );
              if( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) && NIL != edge_sets2 )
              {
                parsing_macros.set_parse_root_node( psp_parse_tree_generator.psp_find_or_create_node_for_edges( set_utilities.set_union( edge_sets2, Symbols.symbol_function( EQL ) ) ) );
              }
              if( NIL == parsing_macros.parsing_timeout_time_reachedP() )
              {
                final SubLObject v_memoization_state2 = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                assert NIL != memoization_state.memoization_state_p( v_memoization_state2 ) : v_memoization_state2;
                final SubLObject _prev_bind_0_$123 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
                try
                {
                  reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state2, thread );
                  final SubLObject local_state_$128 = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
                  final SubLObject _prev_bind_0_$124 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state_$128, thread );
                    final SubLObject original_memoization_process_$130 = memoization_state.memoization_state_original_process( local_state_$128 );
                    try
                    {
                      final SubLObject _prev_bind_0_$125 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$121 = $psp_answer_store$.currentBinding( thread );
                      try
                      {
                        nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw111$CLEAR_CACHES_, $kw112$FALSE ), thread );
                        $psp_answer_store$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                        final SubLObject done_spans2 = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        SubLObject doneP2 = NIL;
                        if( NIL == doneP2 )
                        {
                          SubLObject csome_list_var2 = edge_sets2;
                          SubLObject edge_set2 = NIL;
                          edge_set2 = csome_list_var2.first();
                          while ( NIL == doneP2 && NIL != csome_list_var2)
                          {
                            final SubLObject this_set_cycls2 = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
                            final SubLObject set_contents_var2 = set.do_set_internal( edge_set2 );
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject edge2;
                            SubLObject span2;
                            SubLObject cdolist_list_var2;
                            SubLObject cycl2;
                            for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                set_contents_var2 ); NIL == doneP2 && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                            {
                              edge2 = set_contents.do_set_contents_next( basis_object2, state2 );
                              if( NIL != set_contents.do_set_contents_element_validP( state2, edge2 ) )
                              {
                                span2 = psp_chart.get_psp_edge_span( edge2 );
                                if( NIL == set.set_memberP( span2, done_spans2 ) )
                                {
                                  cdolist_list_var2 = ps_harvest_phrases_int_edge_cycls( edge2 );
                                  cycl2 = NIL;
                                  cycl2 = cdolist_list_var2.first();
                                  while ( NIL != cdolist_list_var2)
                                  {
                                    psp_gather_one_cycl( this_set_cycls2, span2, cycl2 );
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    cycl2 = cdolist_list_var2.first();
                                  }
                                  doneP2 = parsing_macros.parsing_timeout_time_reachedP();
                                }
                              }
                            }
                            psp_update_results_for_edge_set_cycls( this_set_cycls2, done_spans2 );
                            if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) == $kw26$BEST_ONLY && NIL == doneP2 )
                            {
                              doneP2 = makeBoolean( NIL != psp_get_answers() );
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            edge_set2 = csome_list_var2.first();
                          }
                        }
                        thread.resetMultipleValues();
                        final SubLObject best_$122 = psp_get_answers();
                        final SubLObject rest_$123 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        best = best_$122;
                        rest = rest_$123;
                      }
                      finally
                      {
                        $psp_answer_store$.rebind( _prev_bind_1_$121, thread );
                        nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$125, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$126 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state_$128, original_memoization_process_$130 );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$126, thread );
                      }
                    }
                  }
                  finally
                  {
                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$124, thread );
                  }
                }
                finally
                {
                  reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$123, thread );
                }
              }
              if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
              {
                psp_chart.destroy_psp_chart( UNPROVIDED );
              }
            }
            finally
            {
              parsing_vars.$psp_chart$.rebind( _prev_bind_0_$122, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$127, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$121, thread );
        }
      }
      finally
      {
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( best, rest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  public static SubLObject ps_harvest_phrases_int_cached(final SubLObject string, final SubLObject category, final SubLObject non_trivialP, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    SubLObject caching_state = $ps_harvest_phrases_int_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym141$PS_HARVEST_PHRASES_INT_CACHED, $sym142$_PS_HARVEST_PHRASES_INT_CACHED_CACHING_STATE_, NIL, EQUAL, FOUR_INTEGER, $int114$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( string, category, non_trivialP, environment );
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
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( category.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( non_trivialP.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && environment.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ps_harvest_phrases_int_cached_internal( string, category, non_trivialP, environment ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, category, non_trivialP, environment ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  public static SubLObject ps_harvest_phrases_int(final SubLObject string, final SubLObject category, final SubLObject non_trivialP)
  {
    if( NIL != parsing_macros.bypass_psp_cachesP() )
    {
      return ps_harvest_phrases_int_cached_internal( string, category, non_trivialP, parsing_vars.psp_environmental_state() );
    }
    return ps_harvest_phrases_int_cached( string, category, non_trivialP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  public static SubLObject ps_harvest_phrases_int_edge_sets(final SubLObject category, final SubLObject non_trivialP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject edges = psp_chart.psp_all_complete_edges( non_trivialP );
    final SubLObject gap = parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread );
    final SubLObject pos_pred = $kw3$ANY;
    final SubLObject top_level_rule_fort = $kw3$ANY;
    final SubLObject filtered_edges = psp_filter_edges( edges, NIL, category, pos_pred, gap, top_level_rule_fort );
    final SubLObject sorted_edges = psp_sort_edges_by_weight( filtered_edges );
    return psp_edge_sets( sorted_edges, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 26842L)
  public static SubLObject ps_harvest_phrases_int_edge_cycls(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, parsing_macros.$psp_sbhl_resourcing_limit$.getGlobalValue() ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      SubLObject doneP = parsing_macros.parsing_timeout_time_reachedP();
      final SubLObject token_list = psp_token_list_from_span( psp_chart.get_psp_edge_span( edge ) );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge( edge, UNPROVIDED, UNPROVIDED );
        SubLObject cycl = NIL;
        cycl = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject subbed_cycl = psp_adjust_cycl_weight_for_edge( psp_semantics.psp_cycl_subst( $const126$TheSentenceSubject, $kw127$SUBJECT, cycl ), edge );
          final SubLObject cycl_cycl = psp_semantics.psp_cycl_cycl( subbed_cycl );
          final SubLObject span_cycl_pair = ConsesLow.list( token_list, cycl_cycl );
          psp_semantics.psp_weighted_cycl_set_cycl( subbed_cycl, span_cycl_pair );
          if( NIL == subl_promotions.memberP( subbed_cycl, cycls, Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED ) )
          {
            if( NIL != parsing_vars.$psp_verboseP$.getDynamicValue( thread ) )
            {
              PrintLow.format( T, $str143$__String___S__S__Weight___S__CycL, new SubLObject[] { psp_chart.get_psp_edge_string( edge ), token_list, psp_semantics.psp_cycl_weight( subbed_cycl ), cycl_cycl
              } );
            }
            cycls = ConsesLow.cons( subbed_cycl, cycls );
          }
          doneP = parsing_macros.parsing_timeout_time_reachedP();
          csome_list_var = csome_list_var.rest();
          cycl = csome_list_var.first();
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 28247L)
  public static SubLObject psp_find_string_in_chart(final SubLObject string, final SubLObject chart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    if( NIL != $psp_reuse_chartsP$.getDynamicValue( thread ) && NIL != psp_chart.phrase_structure_parser_chart_p( chart ) )
    {
      final SubLObject chart_strings = psp_chart.psp_string_tokenize( psp_chart.psp_chart_input_string( chart ) );
      final SubLObject strings = psp_chart.psp_string_tokenize( string );
      start_index = Sequences.search( strings, chart_strings, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      end_index = ( NIL != start_index ) ? Numbers.add( start_index, Sequences.length( strings ) ) : NIL;
    }
    return Values.values( start_index, end_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 28815L)
  public static SubLObject psp_find_string_in_charts(final SubLObject input_string, final SubLObject primary_chart, final SubLObject secondary_charts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    SubLObject matching_chart = NIL;
    if( NIL == matching_chart )
    {
      SubLObject csome_list_var = ConsesLow.cons( primary_chart, secondary_charts );
      SubLObject chart = NIL;
      chart = csome_list_var.first();
      while ( NIL == matching_chart && NIL != csome_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject start_index_$137 = psp_find_string_in_chart( input_string, chart );
        final SubLObject end_index_$138 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        start_index = start_index_$137;
        end_index = end_index_$138;
        if( NIL != start_index )
        {
          matching_chart = chart;
        }
        csome_list_var = csome_list_var.rest();
        chart = csome_list_var.first();
      }
    }
    return Values.values( start_index, end_index, matching_chart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29243L)
  public static SubLObject clear_psp_valid_categoryP()
  {
    final SubLObject cs = $psp_valid_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29243L)
  public static SubLObject remove_psp_valid_categoryP(final SubLObject obj)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $psp_valid_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( obj ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29243L)
  public static SubLObject psp_valid_categoryP_internal(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( obj == $kw3$ANY )
    {
      return T;
    }
    SubLObject okP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym144$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const145$EverythingPSC, thread );
      okP = rbp_wff.npp_genlP( obj, $const146$SententialConstituent, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29243L)
  public static SubLObject psp_valid_categoryP(final SubLObject obj)
  {
    SubLObject caching_state = $psp_valid_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym4$PSP_VALID_CATEGORY_, $sym147$_PSP_VALID_CATEGORY__CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, $int148$32 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_valid_categoryP_internal( obj ) ) );
      memoization_state.caching_state_put( caching_state, obj, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29462L)
  public static SubLObject clear_psp_valid_pos_predP()
  {
    final SubLObject cs = $psp_valid_pos_predP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29462L)
  public static SubLObject remove_psp_valid_pos_predP(final SubLObject obj)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $psp_valid_pos_predP_caching_state$.getGlobalValue(), ConsesLow.list( obj ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29462L)
  public static SubLObject psp_valid_pos_predP_internal(final SubLObject obj)
  {
    return makeBoolean( obj == $kw3$ANY || NIL != lexicon_accessors.speech_part_predP( obj, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29462L)
  public static SubLObject psp_valid_pos_predP(final SubLObject obj)
  {
    SubLObject caching_state = $psp_valid_pos_predP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym10$PSP_VALID_POS_PRED_, $sym149$_PSP_VALID_POS_PRED__CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, $int148$32 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_valid_pos_predP_internal( obj ) ) );
      memoization_state.caching_state_put( caching_state, obj, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29593L)
  public static SubLObject clear_ps_parse_showing_rules_int()
  {
    final SubLObject cs = $ps_parse_showing_rules_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29593L)
  public static SubLObject remove_ps_parse_showing_rules_int(final SubLObject input_string, final SubLObject category, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $ps_parse_showing_rules_int_caching_state$.getGlobalValue(), ConsesLow.list( input_string, category, environment ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29593L)
  public static SubLObject ps_parse_showing_rules_int_internal(final SubLObject input_string, final SubLObject category, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ans_table = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject start_index = NIL;
    SubLObject end_index = NIL;
    SubLObject chart = NIL;
    if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_gap_type_allowed$
        .getDynamicValue( thread ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject start_index_$139 = psp_find_string_in_charts( input_string, parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$.getDynamicValue( thread ) );
      final SubLObject end_index_$140 = thread.secondMultipleValue();
      final SubLObject chart_$141 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      start_index = start_index_$139;
      end_index = end_index_$140;
      chart = chart_$141;
    }
    if( NIL != start_index )
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
        parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
        parsing_vars.$psp_chart$.bind( chart, thread );
        psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
        final SubLObject max_span = psp_chart.psp_chart_max_span();
        final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue( thread );
        assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use ) : chart_to_use;
        if( max_span == $kw3$ANY )
        {
          final SubLObject pcase_var = $kw3$ANY;
          if( pcase_var.eql( $kw3$ANY ) )
          {
            final SubLObject chart_to_use_$142 = ( NIL != chart_to_use ) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue( thread );
            assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$142 ) : chart_to_use_$142;
            SubLObject iteration_state;
            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$142 ) ) ); NIL == dictionary_contents
                .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
            {
              thread.resetMultipleValues();
              final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
              final SubLObject value = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject csome_list_var = psp_chart.psp_edges_with_span( span_to_do, chart_to_use );
              SubLObject edge = NIL;
              edge = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                if( NIL != psp_chart.psp_do_edge_okP( edge, category, T ) )
                {
                  final SubLObject raw_semx = psp_semantics.psp_semantics_for_edge( edge, UNPROVIDED, UNPROVIDED );
                  final SubLObject semx = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx ) : raw_semx;
                  final SubLObject weighted = psp_adjust_cycl_weights_for_edge( semx, edge );
                  final SubLObject tree = psp_rules.psp_parse_tree_for_edge( edge );
                  final SubLObject existing = dictionary.dictionary_lookup( ans_table, tree, UNPROVIDED );
                  final SubLObject v_new = Sequences.remove_duplicates( ConsesLow.append( weighted, existing ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  dictionary.dictionary_enter( ans_table, tree, v_new );
                }
                csome_list_var = csome_list_var.rest();
                edge = csome_list_var.first();
              }
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          }
          else if( pcase_var.eql( $kw152$LEXICAL ) )
          {
            final SubLObject chart_to_use_$143 = ( NIL != chart_to_use ) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue( thread );
            assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$143 ) : chart_to_use_$143;
            SubLObject iteration_state;
            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$143 ) ) ); NIL == dictionary_contents
                .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
            {
              thread.resetMultipleValues();
              final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
              final SubLObject value = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span( span_to_do, chart_to_use );
              SubLObject edge = NIL;
              edge = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                if( NIL != psp_chart.psp_do_edge_okP( edge, category, T ) )
                {
                  final SubLObject raw_semx = psp_semantics.psp_semantics_for_edge( edge, UNPROVIDED, UNPROVIDED );
                  final SubLObject semx = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx ) : raw_semx;
                  final SubLObject weighted = psp_adjust_cycl_weights_for_edge( semx, edge );
                  final SubLObject tree = psp_rules.psp_parse_tree_for_edge( edge );
                  final SubLObject existing = dictionary.dictionary_lookup( ans_table, tree, UNPROVIDED );
                  final SubLObject v_new = Sequences.remove_duplicates( ConsesLow.append( weighted, existing ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  dictionary.dictionary_enter( ans_table, tree, v_new );
                }
                csome_list_var = csome_list_var.rest();
                edge = csome_list_var.first();
              }
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          }
        }
        else if( NIL != interval_span.interval_span_p( max_span ) )
        {
          final SubLObject pcase_var = $kw3$ANY;
          if( pcase_var.eql( $kw3$ANY ) )
          {
            SubLObject csome_list_var2 = psp_chart.psp_edges_with_span( max_span, chart_to_use );
            SubLObject edge2 = NIL;
            edge2 = csome_list_var2.first();
            while ( NIL != csome_list_var2)
            {
              if( NIL != psp_chart.psp_do_edge_okP( edge2, category, T ) )
              {
                final SubLObject raw_semx2 = psp_semantics.psp_semantics_for_edge( edge2, UNPROVIDED, UNPROVIDED );
                final SubLObject semx2 = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx2 ) : raw_semx2;
                final SubLObject weighted2 = psp_adjust_cycl_weights_for_edge( semx2, edge2 );
                final SubLObject tree2 = psp_rules.psp_parse_tree_for_edge( edge2 );
                final SubLObject existing2 = dictionary.dictionary_lookup( ans_table, tree2, UNPROVIDED );
                final SubLObject v_new2 = Sequences.remove_duplicates( ConsesLow.append( weighted2, existing2 ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                dictionary.dictionary_enter( ans_table, tree2, v_new2 );
              }
              csome_list_var2 = csome_list_var2.rest();
              edge2 = csome_list_var2.first();
            }
          }
          else if( pcase_var.eql( $kw152$LEXICAL ) )
          {
            SubLObject csome_list_var2 = psp_chart.psp_lexical_edges_with_span( max_span, chart_to_use );
            SubLObject edge2 = NIL;
            edge2 = csome_list_var2.first();
            while ( NIL != csome_list_var2)
            {
              if( NIL != psp_chart.psp_do_edge_okP( edge2, category, T ) )
              {
                final SubLObject raw_semx2 = psp_semantics.psp_semantics_for_edge( edge2, UNPROVIDED, UNPROVIDED );
                final SubLObject semx2 = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx2 ) : raw_semx2;
                final SubLObject weighted2 = psp_adjust_cycl_weights_for_edge( semx2, edge2 );
                final SubLObject tree2 = psp_rules.psp_parse_tree_for_edge( edge2 );
                final SubLObject existing2 = dictionary.dictionary_lookup( ans_table, tree2, UNPROVIDED );
                final SubLObject v_new2 = Sequences.remove_duplicates( ConsesLow.append( weighted2, existing2 ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                dictionary.dictionary_enter( ans_table, tree2, v_new2 );
              }
              csome_list_var2 = csome_list_var2.rest();
              edge2 = csome_list_var2.first();
            }
          }
        }
      }
      finally
      {
        parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
        parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
        final SubLObject chart_$142 = psp_syntax.psp_chart_for_string( input_string, parsing_macros.get_psp_lexicon(), parsing_vars.$psp_gap_type_allowed$.getDynamicValue( thread ), UNPROVIDED );
        final SubLObject local_state = psp_chart.psp_chart_memoization_state( chart_$142 );
        final SubLObject _prev_bind_0_$145 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            final SubLObject _prev_bind_0_$146 = parsing_vars.$psp_chart$.currentBinding( thread );
            try
            {
              parsing_vars.$psp_chart$.bind( chart_$142, thread );
              final SubLObject max_span2 = psp_chart.psp_chart_max_span();
              final SubLObject chart_to_use2 = parsing_vars.$psp_chart$.getDynamicValue( thread );
              assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use2 ) : chart_to_use2;
              if( max_span2 == $kw3$ANY )
              {
                final SubLObject pcase_var2 = $kw3$ANY;
                if( pcase_var2.eql( $kw3$ANY ) )
                {
                  final SubLObject chart_to_use_$144 = ( NIL != chart_to_use2 ) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue( thread );
                  assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$144 ) : chart_to_use_$144;
                  SubLObject iteration_state2;
                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$144 ) ) ); NIL == dictionary_contents
                      .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                    final SubLObject value2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject csome_list_var3 = psp_chart.psp_edges_with_span( span_to_do2, chart_to_use2 );
                    SubLObject edge3 = NIL;
                    edge3 = csome_list_var3.first();
                    while ( NIL != csome_list_var3)
                    {
                      if( NIL != psp_chart.psp_do_edge_okP( edge3, category, T ) )
                      {
                        final SubLObject raw_semx3 = psp_semantics.psp_semantics_for_edge( edge3, UNPROVIDED, UNPROVIDED );
                        final SubLObject semx3 = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx3 ) : raw_semx3;
                        final SubLObject weighted3 = psp_adjust_cycl_weights_for_edge( semx3, edge3 );
                        final SubLObject tree3 = psp_rules.psp_parse_tree_for_edge( edge3 );
                        final SubLObject existing3 = dictionary.dictionary_lookup( ans_table, tree3, UNPROVIDED );
                        final SubLObject v_new3 = Sequences.remove_duplicates( ConsesLow.append( weighted3, existing3 ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        dictionary.dictionary_enter( ans_table, tree3, v_new3 );
                      }
                      csome_list_var3 = csome_list_var3.rest();
                      edge3 = csome_list_var3.first();
                    }
                  }
                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                }
                else if( pcase_var2.eql( $kw152$LEXICAL ) )
                {
                  final SubLObject chart_to_use_$145 = ( NIL != chart_to_use2 ) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue( thread );
                  assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$145 ) : chart_to_use_$145;
                  SubLObject iteration_state2;
                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$145 ) ) ); NIL == dictionary_contents
                      .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                    final SubLObject value2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject csome_list_var3 = psp_chart.psp_lexical_edges_with_span( span_to_do2, chart_to_use2 );
                    SubLObject edge3 = NIL;
                    edge3 = csome_list_var3.first();
                    while ( NIL != csome_list_var3)
                    {
                      if( NIL != psp_chart.psp_do_edge_okP( edge3, category, T ) )
                      {
                        final SubLObject raw_semx3 = psp_semantics.psp_semantics_for_edge( edge3, UNPROVIDED, UNPROVIDED );
                        final SubLObject semx3 = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx3 ) : raw_semx3;
                        final SubLObject weighted3 = psp_adjust_cycl_weights_for_edge( semx3, edge3 );
                        final SubLObject tree3 = psp_rules.psp_parse_tree_for_edge( edge3 );
                        final SubLObject existing3 = dictionary.dictionary_lookup( ans_table, tree3, UNPROVIDED );
                        final SubLObject v_new3 = Sequences.remove_duplicates( ConsesLow.append( weighted3, existing3 ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        dictionary.dictionary_enter( ans_table, tree3, v_new3 );
                      }
                      csome_list_var3 = csome_list_var3.rest();
                      edge3 = csome_list_var3.first();
                    }
                  }
                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                }
              }
              else if( NIL != interval_span.interval_span_p( max_span2 ) )
              {
                final SubLObject pcase_var2 = $kw3$ANY;
                if( pcase_var2.eql( $kw3$ANY ) )
                {
                  SubLObject csome_list_var = psp_chart.psp_edges_with_span( max_span2, chart_to_use2 );
                  SubLObject edge = NIL;
                  edge = csome_list_var.first();
                  while ( NIL != csome_list_var)
                  {
                    if( NIL != psp_chart.psp_do_edge_okP( edge, category, T ) )
                    {
                      final SubLObject raw_semx = psp_semantics.psp_semantics_for_edge( edge, UNPROVIDED, UNPROVIDED );
                      final SubLObject semx = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx ) : raw_semx;
                      final SubLObject weighted = psp_adjust_cycl_weights_for_edge( semx, edge );
                      final SubLObject tree = psp_rules.psp_parse_tree_for_edge( edge );
                      final SubLObject existing = dictionary.dictionary_lookup( ans_table, tree, UNPROVIDED );
                      final SubLObject v_new = Sequences.remove_duplicates( ConsesLow.append( weighted, existing ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      dictionary.dictionary_enter( ans_table, tree, v_new );
                    }
                    csome_list_var = csome_list_var.rest();
                    edge = csome_list_var.first();
                  }
                }
                else if( pcase_var2.eql( $kw152$LEXICAL ) )
                {
                  SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span( max_span2, chart_to_use2 );
                  SubLObject edge = NIL;
                  edge = csome_list_var.first();
                  while ( NIL != csome_list_var)
                  {
                    if( NIL != psp_chart.psp_do_edge_okP( edge, category, T ) )
                    {
                      final SubLObject raw_semx = psp_semantics.psp_semantics_for_edge( edge, UNPROVIDED, UNPROVIDED );
                      final SubLObject semx = ( NIL != parsing_vars.$psp_reformulateP$.getDynamicValue( thread ) ) ? psp_semantics.psp_reformulate_cycls( raw_semx ) : raw_semx;
                      final SubLObject weighted = psp_adjust_cycl_weights_for_edge( semx, edge );
                      final SubLObject tree = psp_rules.psp_parse_tree_for_edge( edge );
                      final SubLObject existing = dictionary.dictionary_lookup( ans_table, tree, UNPROVIDED );
                      final SubLObject v_new = Sequences.remove_duplicates( ConsesLow.append( weighted, existing ), Symbols.symbol_function( $sym65$PSP_CYCL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      dictionary.dictionary_enter( ans_table, tree, v_new );
                    }
                    csome_list_var = csome_list_var.rest();
                    edge = csome_list_var.first();
                  }
                }
              }
              if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
              {
                psp_chart.destroy_psp_chart( UNPROVIDED );
              }
            }
            finally
            {
              parsing_vars.$psp_chart$.rebind( _prev_bind_0_$146, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$147 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$147, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$145, thread );
        }
      }
      finally
      {
        parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0, thread );
      }
    }
    return ans_table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 29593L)
  public static SubLObject ps_parse_showing_rules_int(final SubLObject input_string, final SubLObject category, SubLObject environment)
  {
    if( environment == UNPROVIDED )
    {
      environment = parsing_vars.psp_environmental_state();
    }
    SubLObject caching_state = $ps_parse_showing_rules_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym150$PS_PARSE_SHOWING_RULES_INT, $sym153$_PS_PARSE_SHOWING_RULES_INT_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int114$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( input_string, category, environment );
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
        if( input_string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( category.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && environment.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ps_parse_showing_rules_int_internal( input_string, category, environment ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( input_string, category, environment ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 30468L)
  public static SubLObject psp_filter_edges(final SubLObject edges, final SubLObject non_trivialP, final SubLObject category, final SubLObject pos_pred, SubLObject gap, SubLObject top_level_rule_fort)
  {
    if( gap == UNPROVIDED )
    {
      gap = $kw9$NONE;
    }
    if( top_level_rule_fort == UNPROVIDED )
    {
      top_level_rule_fort = $kw3$ANY;
    }
    SubLObject ans = NIL;
    SubLObject common_span = $kw154$UNINITIALIZED;
    SubLObject cdolist_list_var = edges;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject span = psp_chart.get_psp_edge_span( edge );
      if( common_span == $kw154$UNINITIALIZED )
      {
        common_span = span;
      }
      else if( !common_span.eql( span ) )
      {
        common_span = NIL;
      }
      if( ( NIL == non_trivialP || interval_span.interval_span_length( span ).numG( ONE_INTEGER ) ) && ( top_level_rule_fort == $kw3$ANY || psp_chart.psp_edge_rule_fort( edge ).eql( top_level_rule_fort ) )
          && NIL != psp_edge_meets_gap_constraintP( edge, gap ) && ( category == $kw3$ANY || NIL != psp_rules.psp_valid_constituent_typeP( psp_chart.get_psp_edge_category( edge ), category ) ) && ( pos_pred == $kw3$ANY
              || NIL != lexicon_accessors.genl_pos_predP( psp_chart.get_psp_edge_pos_pred( edge ), pos_pred, parsing_utilities.psp_lexicon_root_mt( UNPROVIDED ) ) ) )
      {
        ans = ConsesLow.cons( edge, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return psp_delete_non_branching_descendents( ans, list_utilities.sublisp_boolean( common_span ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 31402L)
  public static SubLObject psp_delete_non_branching_descendents(final SubLObject edges, final SubLObject all_one_spanP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != all_one_spanP )
    {
      return psp_delete_non_branching_descendents_internal( edges );
    }
    final SubLObject spans_to_edges = partition_psp_edges_by_span( edges );
    SubLObject filtered = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( spans_to_edges ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject span_edges = thread.secondMultipleValue();
      thread.resetMultipleValues();
      filtered = ConsesLow.nconc( filtered, psp_delete_non_branching_descendents_internal( span_edges ) );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    dictionary.clear_dictionary( spans_to_edges );
    return filtered;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 31900L)
  public static SubLObject psp_delete_non_branching_descendents_internal(final SubLObject edges)
  {
    return list_utilities.delete_subsumed_items( edges, $sym155$PSP_EDGE_NON_BRANCHING_DESCENDENT_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 32046L)
  public static SubLObject partition_psp_edges_by_span(final SubLObject edges)
  {
    final SubLObject spans_to_edges = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = edges;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_push( spans_to_edges, psp_chart.get_psp_edge_span( edge ), edge );
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return spans_to_edges;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 32266L)
  public static SubLObject psp_edge_meets_gap_constraintP(final SubLObject edge, final SubLObject gap_constraint)
  {
    if( gap_constraint.eql( $kw156$NP ) )
    {
      return psp_chart.psp_edge_has_np_gapP( edge );
    }
    if( NIL != psp_chart.psp_pp_gap_constraint_p( gap_constraint ) )
    {
      return psp_chart.psp_edge_has_pp_gapP( edge );
    }
    if( gap_constraint == $kw9$NONE )
    {
      return makeBoolean( NIL == psp_chart.psp_edge_already_has_gapP( edge ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 32597L)
  public static SubLObject psp_edge_sets(final SubLObject sorted_edges, SubLObject spans_may_differP)
  {
    if( spans_may_differP == UNPROVIDED )
    {
      spans_may_differP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == spans_may_differP )
    {
      return psp_edge_sets_internal( sorted_edges );
    }
    final SubLObject spans_to_edges = partition_psp_edges_by_span( sorted_edges );
    SubLObject sets = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( spans_to_edges ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject span_edges = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject list_var = NIL;
      SubLObject span_set = NIL;
      SubLObject i = NIL;
      list_var = psp_edge_sets_internal( Sequences.nreverse( span_edges ) );
      span_set = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), span_set = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        final SubLObject nth_set = ConsesLow.nth( i, sets );
        if( NIL == nth_set )
        {
          sets = ConsesLow.nconc( sets, ConsesLow.list( span_set ) );
        }
        else
        {
          final SubLObject set_contents_var = set.do_set_internal( span_set );
          SubLObject basis_object;
          SubLObject state;
          SubLObject this_span_edge;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
              .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            this_span_edge = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, this_span_edge ) )
            {
              set.set_add( this_span_edge, nth_set );
            }
          }
          set.clear_set( span_set );
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    dictionary.clear_dictionary( spans_to_edges );
    return sets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 33379L)
  public static SubLObject psp_edge_sets_internal(final SubLObject sorted_edges)
  {
    SubLObject sets = NIL;
    SubLObject current_set = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject standard = NIL;
    SubLObject cdolist_list_var = sorted_edges;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != set.set_emptyP( current_set ) )
      {
        set.set_add( edge, current_set );
        standard = edge;
      }
      else if( NIL != psp_chart.psp_edge_weightierP( standard, edge, $psp_weight_margin_of_error$.getGlobalValue() ) )
      {
        sets = ConsesLow.cons( current_set, sets );
        current_set = set.new_set( UNPROVIDED, UNPROVIDED );
        standard = edge;
        set.set_add( edge, current_set );
      }
      else
      {
        set.set_add( edge, current_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    if( NIL == set.set_emptyP( current_set ) )
    {
      sets = ConsesLow.cons( current_set, sets );
    }
    return Sequences.nreverse( sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 34046L)
  public static SubLObject psp_sort_edges_by_weight(final SubLObject edges)
  {
    return Sort.sort( edges, $sym157$PSP_EDGE_WEIGHTIER_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 34147L)
  public static SubLObject psp_token_list_from_span(final SubLObject span)
  {
    final SubLObject start = interval_span.interval_span_start( span );
    final SubLObject end = interval_span.interval_span_end( span );
    final SubLObject token_list = parsing_utilities.token_list_from_span( start, end );
    return token_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 34405L)
  public static SubLObject fort_or_keyword_p(final SubLObject x)
  {
    return makeBoolean( NIL != forts.fort_p( x ) || x.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 34483L)
  public static SubLObject ps_test_func(final SubLObject thing1, final SubLObject thing2)
  {
    return makeBoolean( thing1.equal( thing2 ) || NIL != conses_high.member( narts_high.nart_substitute( thing2 ), thing1, EQUAL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 35152L)
  public static SubLObject ps_harvest_nps_test_func(final SubLObject thing1, SubLObject thing2)
  {
    if( thing1.equal( thing2 ) )
    {
      return T;
    }
    SubLObject matchP = NIL;
    if( thing1.isList() )
    {
      thing2 = narts_high.nart_substitute( thing2 );
      SubLObject rest;
      SubLObject item;
      for( rest = NIL, rest = thing1; NIL == matchP && NIL != rest; rest = rest.rest() )
      {
        item = rest.first();
        if( NIL != ps_harvest_nps_items_equivP( item, thing2 ) )
        {
          matchP = T;
        }
      }
    }
    return matchP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-main.lisp", position = 35483L)
  public static SubLObject ps_harvest_nps_items_equivP(final SubLObject item1, final SubLObject item2)
  {
    if( NIL == list_utilities.doubletonP( item1 ) || NIL == list_utilities.doubletonP( item2 ) )
    {
      return NIL;
    }
    SubLObject current;
    final SubLObject datum = current = ConsesLow.list( item1, item2 );
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject token_list1 = NIL;
    SubLObject cycl_list1 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    token_list1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    cycl_list1 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
      final SubLObject temp_$150 = current.rest();
      current = current.first();
      SubLObject token_list2 = NIL;
      SubLObject cycl_list2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
      token_list2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
      cycl_list2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        current = temp_$150;
        if( NIL == current )
        {
          return makeBoolean( token_list1.equal( token_list2 ) && NIL != list_utilities.sets_equalP( cycl_list1, cycl_list2, Symbols.symbol_function( EQUAL ) ) );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum, $list158 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list158 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list158 );
    }
    return NIL;
  }

  public static SubLObject declare_psp_main_file()
  {
    SubLFiles.declareFunction( me, "initialize_psp", "INITIALIZE-PSP", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_caches", "CLEAR-PSP-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_possibly_clear_caches", "PSP-POSSIBLY-CLEAR-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_showing_rules", "PS-PARSE-SHOWING-RULES", 1, 2, false );
    SubLFiles.declareFunction( me, "ps_parse_predicative_adjp", "PS-PARSE-PREDICATIVE-ADJP", 1, 3, false );
    SubLFiles.declareFunction( me, "ps_parse_vbar", "PS-PARSE-VBAR", 1, 3, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_np", "PS-GET-CYCLS-FOR-NP", 1, 3, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_phrase", "PS-GET-CYCLS-FOR-PHRASE", 1, 6, false );
    SubLFiles.declareFunction( me, "inference_ps_get_cycls_for_phrase", "INFERENCE-PS-GET-CYCLS-FOR-PHRASE", 2, 1, false );
    SubLFiles.declareFunction( me, "psp_category_and_pos_pred_from_term_phrases_constraint", "PSP-CATEGORY-AND-POS-PRED-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_ps_get_cycls_and_constraints_for_phrase", "INFERENCE-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_hl_justify_parse", "PSP-HL-JUSTIFY-PARSE", 3, 1, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_phrase_and_rule", "PS-GET-CYCLS-FOR-PHRASE-AND-RULE", 2, 4, false );
    SubLFiles.declareFunction( me, "ps_harvest_nps", "PS-HARVEST-NPS", 1, 2, false );
    SubLFiles.declareFunction( me, "ps_harvest_nbars", "PS-HARVEST-NBARS", 1, 2, false );
    SubLFiles.declareFunction( me, "best_ps_parse_for_np", "BEST-PS-PARSE-FOR-NP", 1, 2, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_for_span", "PSP-ANSWER-ACCUMULATOR-FOR-SPAN", 1, 0, false );
    SubLFiles.declareMacro( me, "with_new_psp_answer_store", "WITH-NEW-PSP-ANSWER-STORE" );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_print_function_trampoline", "PSP-ANSWER-ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_p", "PSP-ANSWER-ACCUMULATOR-P", 1, 0, false );
    new $psp_answer_accumulator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "psp_answer_accumulator_best", "PSP-ANSWER-ACCUMULATOR-BEST", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_rest", "PSP-ANSWER-ACCUMULATOR-REST", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_plist", "PSP-ANSWER-ACCUMULATOR-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_answer_accumulator_best", "_CSETF-PSP-ANSWER-ACCUMULATOR-BEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_answer_accumulator_rest", "_CSETF-PSP-ANSWER-ACCUMULATOR-REST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_answer_accumulator_plist", "_CSETF-PSP-ANSWER-ACCUMULATOR-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_psp_answer_accumulator", "MAKE-PSP-ANSWER-ACCUMULATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_psp_answer_accumulator", "VISIT-DEFSTRUCT-PSP-ANSWER-ACCUMULATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_psp_answer_accumulator_method", "VISIT-DEFSTRUCT-OBJECT-PSP-ANSWER-ACCUMULATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_psp_answer_accumulator", "NEW-PSP-ANSWER-ACCUMULATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "pprint_psp_answer_accumulator", "PPRINT-PSP-ANSWER-ACCUMULATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_plist_lookup", "PSP-ANSWER-ACCUMULATOR-PLIST-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_plist_set", "PSP-ANSWER-ACCUMULATOR-PLIST-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_add", "PSP-ANSWER-ACCUMULATOR-ADD", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_update_best_weight", "PSP-ANSWER-ACCUMULATOR-UPDATE-BEST-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_set_best_weight", "PSP-ANSWER-ACCUMULATOR-SET-BEST-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_best_weight", "PSP-ANSWER-ACCUMULATOR-BEST-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_accumulator_get_answers", "PSP-ANSWER-ACCUMULATOR-GET-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_get_answers", "PSP-GET-ANSWERS", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_record_answers", "PSP-RECORD-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_answer_type", "PSP-ANSWER-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_weight_within_margin_of_errorP", "PSP-WEIGHT-WITHIN-MARGIN-OF-ERROR?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_no_answers_yet_p", "PSP-NO-ANSWERS-YET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_do_update_results", "PSP-DO-UPDATE-RESULTS", 2, 0, false );
    SubLFiles.declareMacro( me, "psp_accumulate_answers", "PSP-ACCUMULATE-ANSWERS" );
    SubLFiles.declareMacro( me, "psp_accumulate_answers_one_set", "PSP-ACCUMULATE-ANSWERS-ONE-SET" );
    SubLFiles.declareMacro( me, "psp_gather_cycls_from_edge", "PSP-GATHER-CYCLS-FROM-EDGE" );
    SubLFiles.declareFunction( me, "psp_gather_one_cycl", "PSP-GATHER-ONE-CYCL", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_update_results_for_edge_set_cycls", "PSP-UPDATE-RESULTS-FOR-EDGE-SET-CYCLS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_ps_parse_vbar_int_cached", "CLEAR-PS-PARSE-VBAR-INT-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ps_parse_vbar_int_cached", "REMOVE-PS-PARSE-VBAR-INT-CACHED", 2, 1, false );
    SubLFiles.declareFunction( me, "ps_parse_vbar_int_cached_internal", "PS-PARSE-VBAR-INT-CACHED-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_vbar_int_cached", "PS-PARSE-VBAR-INT-CACHED", 2, 1, false );
    SubLFiles.declareFunction( me, "ps_parse_vbar_int", "PS-PARSE-VBAR-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_vbar_int_edge_sets", "PS-PARSE-VBAR-INT-EDGE-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_vbar_int_edge_cycls", "PS-PARSE-VBAR-INT-EDGE-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ps_parse_predicative_adjp_int_cached", "CLEAR-PS-PARSE-PREDICATIVE-ADJP-INT-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ps_parse_predicative_adjp_int_cached", "REMOVE-PS-PARSE-PREDICATIVE-ADJP-INT-CACHED", 2, 1, false );
    SubLFiles.declareFunction( me, "ps_parse_predicative_adjp_int_cached_internal", "PS-PARSE-PREDICATIVE-ADJP-INT-CACHED-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_predicative_adjp_int_cached", "PS-PARSE-PREDICATIVE-ADJP-INT-CACHED", 2, 1, false );
    SubLFiles.declareFunction( me, "ps_parse_predicative_adjp_int", "PS-PARSE-PREDICATIVE-ADJP-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_predicative_adjp_int_edge_sets", "PS-PARSE-PREDICATIVE-ADJP-INT-EDGE-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_predicative_adjp_int_edge_cycls", "PS-PARSE-PREDICATIVE-ADJP-INT-EDGE-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_process_adjp_cycl", "PSP-PROCESS-ADJP-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ps_get_cycls_for_phrase_int_cached", "CLEAR-PS-GET-CYCLS-FOR-PHRASE-INT-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ps_get_cycls_for_phrase_int_cached", "REMOVE-PS-GET-CYCLS-FOR-PHRASE-INT-CACHED", 5, 1, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_phrase_int_cached_internal", "PS-GET-CYCLS-FOR-PHRASE-INT-CACHED-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_phrase_int_cached", "PS-GET-CYCLS-FOR-PHRASE-INT-CACHED", 5, 1, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_phrase_int", "PS-GET-CYCLS-FOR-PHRASE-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_phrase_int_edge_sets", "PS-GET-CYCLS-FOR-PHRASE-INT-EDGE-SETS", 4, 0, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_for_phrase_int_edge_cycls", "PS-GET-CYCLS-FOR-PHRASE-INT-EDGE-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ps_get_cycls_and_constraints_for_phrase_cached", "CLEAR-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ps_get_cycls_and_constraints_for_phrase_cached", "REMOVE-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED", 1, 1, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_and_constraints_for_phrase_cached_internal", "PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_and_constraints_for_phrase_cached", "PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED", 1, 1, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_and_constraints_for_phrase", "PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_and_constraints_for_phrase_edge_sets", "PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-EDGE-SETS", 0, 0, false );
    SubLFiles.declareFunction( me, "ps_get_cycls_and_constraints_for_phrase_edge_cycls", "PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-EDGE-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_parse_matches_inputP", "PSP-PARSE-MATCHES-INPUT?", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_matches_target_constraintP", "PSP-EDGE-MATCHES-TARGET-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_psp_edge_term_phrases_constraint", "GET-PSP-EDGE-TERM-PHRASES-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_gather_supports", "PSP-EDGE-GATHER-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_lexical_support", "PSP-EDGE-LEXICAL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_weight_and_add_cycl_to_cycls_for_edge", "PSP-WEIGHT-AND-ADD-CYCL-TO-CYCLS-FOR-EDGE", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_adjust_cycl_weights_for_edge", "PSP-ADJUST-CYCL-WEIGHTS-FOR-EDGE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_adjust_cycl_weight_for_edge", "PSP-ADJUST-CYCL-WEIGHT-FOR-EDGE", 2, 0, false );
    SubLFiles.declareFunction( me, "ps_harvest_phrases", "PS-HARVEST-PHRASES", 1, 2, false );
    SubLFiles.declareFunction( me, "psp_span_cycl_pairs_to_harvest", "PSP-SPAN-CYCL-PAIRS-TO-HARVEST", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_sort_harvest", "PSP-SORT-HARVEST", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ps_harvest_phrases_int_cached", "CLEAR-PS-HARVEST-PHRASES-INT-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ps_harvest_phrases_int_cached", "REMOVE-PS-HARVEST-PHRASES-INT-CACHED", 3, 1, false );
    SubLFiles.declareFunction( me, "ps_harvest_phrases_int_cached_internal", "PS-HARVEST-PHRASES-INT-CACHED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "ps_harvest_phrases_int_cached", "PS-HARVEST-PHRASES-INT-CACHED", 3, 1, false );
    SubLFiles.declareFunction( me, "ps_harvest_phrases_int", "PS-HARVEST-PHRASES-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "ps_harvest_phrases_int_edge_sets", "PS-HARVEST-PHRASES-INT-EDGE-SETS", 2, 0, false );
    SubLFiles.declareFunction( me, "ps_harvest_phrases_int_edge_cycls", "PS-HARVEST-PHRASES-INT-EDGE-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_find_string_in_chart", "PSP-FIND-STRING-IN-CHART", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_find_string_in_charts", "PSP-FIND-STRING-IN-CHARTS", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_valid_categoryP", "CLEAR-PSP-VALID-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_valid_categoryP", "REMOVE-PSP-VALID-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_valid_categoryP_internal", "PSP-VALID-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_valid_categoryP", "PSP-VALID-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_valid_pos_predP", "CLEAR-PSP-VALID-POS-PRED?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_valid_pos_predP", "REMOVE-PSP-VALID-POS-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_valid_pos_predP_internal", "PSP-VALID-POS-PRED?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_valid_pos_predP", "PSP-VALID-POS-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ps_parse_showing_rules_int", "CLEAR-PS-PARSE-SHOWING-RULES-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ps_parse_showing_rules_int", "REMOVE-PS-PARSE-SHOWING-RULES-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "ps_parse_showing_rules_int_internal", "PS-PARSE-SHOWING-RULES-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "ps_parse_showing_rules_int", "PS-PARSE-SHOWING-RULES-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "psp_filter_edges", "PSP-FILTER-EDGES", 4, 2, false );
    SubLFiles.declareFunction( me, "psp_delete_non_branching_descendents", "PSP-DELETE-NON-BRANCHING-DESCENDENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_delete_non_branching_descendents_internal", "PSP-DELETE-NON-BRANCHING-DESCENDENTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_psp_edges_by_span", "PARTITION-PSP-EDGES-BY-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_meets_gap_constraintP", "PSP-EDGE-MEETS-GAP-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_sets", "PSP-EDGE-SETS", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_edge_sets_internal", "PSP-EDGE-SETS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_sort_edges_by_weight", "PSP-SORT-EDGES-BY-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_token_list_from_span", "PSP-TOKEN-LIST-FROM-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_or_keyword_p", "FORT-OR-KEYWORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ps_test_func", "PS-TEST-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "ps_harvest_nps_test_func", "PS-HARVEST-NPS-TEST-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "ps_harvest_nps_items_equivP", "PS-HARVEST-NPS-ITEMS-EQUIV?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_psp_main_file()
  {
    $psp_answer_store$ = SubLFiles.defparameter( "*PSP-ANSWER-STORE*", dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $dtp_psp_answer_accumulator$ = SubLFiles.defconstant( "*DTP-PSP-ANSWER-ACCUMULATOR*", $sym35$PSP_ANSWER_ACCUMULATOR );
    $psp_weight_margin_of_error$ = SubLFiles.deflexical( "*PSP-WEIGHT-MARGIN-OF-ERROR*", $float67$0_1 );
    $ps_parse_vbar_int_cached_caching_state$ = SubLFiles.deflexical( "*PS-PARSE-VBAR-INT-CACHED-CACHING-STATE*", NIL );
    $ps_parse_predicative_adjp_int_cached_caching_state$ = SubLFiles.deflexical( "*PS-PARSE-PREDICATIVE-ADJP-INT-CACHED-CACHING-STATE*", NIL );
    $ps_get_cycls_for_phrase_int_cached_caching_state$ = SubLFiles.deflexical( "*PS-GET-CYCLS-FOR-PHRASE-INT-CACHED-CACHING-STATE*", NIL );
    $ps_get_cycls_and_constraints_for_phrase_cached_caching_state$ = SubLFiles.deflexical( "*PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED-CACHING-STATE*", NIL );
    $ps_harvest_phrases_int_cached_caching_state$ = SubLFiles.deflexical( "*PS-HARVEST-PHRASES-INT-CACHED-CACHING-STATE*", NIL );
    $psp_reuse_chartsP$ = SubLFiles.defparameter( "*PSP-REUSE-CHARTS?*", T );
    $psp_valid_categoryP_caching_state$ = SubLFiles.deflexical( "*PSP-VALID-CATEGORY?-CACHING-STATE*", NIL );
    $psp_valid_pos_predP_caching_state$ = SubLFiles.deflexical( "*PSP-VALID-POS-PRED?-CACHING-STATE*", NIL );
    $ps_parse_showing_rules_int_caching_state$ = SubLFiles.deflexical( "*PS-PARSE-SHOWING-RULES-INT-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_psp_main_file()
  {
    access_macros.register_external_symbol( $sym0$CLEAR_PSP_CACHES );
    utilities_macros.register_cyc_api_function( $sym16$PS_GET_CYCLS_FOR_NP, $list17, $str18$_return_0_and_1_LISTP_of_CycL_par, $list19, NIL );
    utilities_macros.register_cyc_api_function( $sym21$PS_GET_CYCLS_FOR_PHRASE, $list22, $str23$_return_0_and_1_LISTP_of_CycL_par, $list24, $list25 );
    access_macros.register_external_symbol( $sym30$PS_HARVEST_NPS );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_psp_answer_accumulator$.getGlobalValue(), Symbols.symbol_function(
        $sym42$PSP_ANSWER_ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list43 );
    Structures.def_csetf( $sym44$PSP_ANSWER_ACCUMULATOR_BEST, $sym45$_CSETF_PSP_ANSWER_ACCUMULATOR_BEST );
    Structures.def_csetf( $sym46$PSP_ANSWER_ACCUMULATOR_REST, $sym47$_CSETF_PSP_ANSWER_ACCUMULATOR_REST );
    Structures.def_csetf( $sym48$PSP_ANSWER_ACCUMULATOR_PLIST, $sym49$_CSETF_PSP_ANSWER_ACCUMULATOR_PLIST );
    Equality.identity( $sym35$PSP_ANSWER_ACCUMULATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_psp_answer_accumulator$.getGlobalValue(), Symbols.symbol_function(
        $sym58$VISIT_DEFSTRUCT_OBJECT_PSP_ANSWER_ACCUMULATOR_METHOD ) );
    access_macros.register_macro_helper( $sym84$PSP_ACCUMULATE_ANSWERS_ONE_SET, $sym93$PSP_ACCUMULATE_ANSWERS );
    access_macros.register_macro_helper( $sym99$PSP_GATHER_CYCLS_FROM_EDGE, $sym93$PSP_ACCUMULATE_ANSWERS );
    access_macros.register_macro_helper( $sym107$PSP_GATHER_ONE_CYCL, $sym93$PSP_ACCUMULATE_ANSWERS );
    access_macros.register_macro_helper( $sym100$PSP_UPDATE_RESULTS_FOR_EDGE_SET_CYCLS, $sym93$PSP_ACCUMULATE_ANSWERS );
    memoization_state.note_globally_cached_function( $sym109$PS_PARSE_VBAR_INT_CACHED );
    memoization_state.note_globally_cached_function( $sym118$PS_PARSE_PREDICATIVE_ADJP_INT_CACHED );
    memoization_state.note_globally_cached_function( $sym124$PS_GET_CYCLS_FOR_PHRASE_INT_CACHED );
    memoization_state.note_globally_cached_function( $sym128$PS_GET_CYCLS_AND_CONSTRAINTS_FOR_PHRASE_CACHED );
    memoization_state.note_globally_cached_function( $sym141$PS_HARVEST_PHRASES_INT_CACHED );
    memoization_state.note_globally_cached_function( $sym4$PSP_VALID_CATEGORY_ );
    memoization_state.note_globally_cached_function( $sym10$PSP_VALID_POS_PRED_ );
    memoization_state.note_globally_cached_function( $sym150$PS_PARSE_SHOWING_RULES_INT );
    generic_testing.define_test_case_table_int( $sym21$PS_GET_CYCLS_FOR_PHRASE, ConsesLow.list( new SubLObject[] { $kw159$TEST, Symbols.symbol_function( $sym160$PS_TEST_FUNC ), $kw161$OWNER, NIL, $kw162$CLASSES,
      $list163, $kw164$KB, $kw165$FULL, $kw166$WORKING_, T
    } ), $list167 );
    generic_testing.define_test_case_table_int( $sym16$PS_GET_CYCLS_FOR_NP, ConsesLow.list( new SubLObject[] { $kw159$TEST, Symbols.symbol_function( $sym160$PS_TEST_FUNC ), $kw161$OWNER, NIL, $kw162$CLASSES, $list163,
      $kw164$KB, $kw165$FULL, $kw166$WORKING_, T
    } ), $list168 );
    generic_testing.define_test_case_table_int( $sym30$PS_HARVEST_NPS, ConsesLow.list( new SubLObject[] { $kw159$TEST, Symbols.symbol_function( $sym169$PS_HARVEST_NPS_TEST_FUNC ), $kw161$OWNER, NIL, $kw162$CLASSES,
      $list163, $kw164$KB, $kw165$FULL, $kw166$WORKING_, T
    } ), $list170 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_psp_main_file();
  }

  @Override
  public void initializeVariables()
  {
    init_psp_main_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_psp_main_file();
  }
  static
  {
    me = new psp_main();
    $psp_answer_store$ = null;
    $dtp_psp_answer_accumulator$ = null;
    $psp_weight_margin_of_error$ = null;
    $ps_parse_vbar_int_cached_caching_state$ = null;
    $ps_parse_predicative_adjp_int_cached_caching_state$ = null;
    $ps_get_cycls_for_phrase_int_cached_caching_state$ = null;
    $ps_get_cycls_and_constraints_for_phrase_cached_caching_state$ = null;
    $ps_harvest_phrases_int_cached_caching_state$ = null;
    $psp_reuse_chartsP$ = null;
    $psp_valid_categoryP_caching_state$ = null;
    $psp_valid_pos_predP_caching_state$ = null;
    $ps_parse_showing_rules_int_caching_state$ = null;
    $sym0$CLEAR_PSP_CACHES = makeSymbol( "CLEAR-PSP-CACHES" );
    $kw1$CLEARED = makeKeyword( "CLEARED" );
    $kw2$NOT_CLEARED = makeKeyword( "NOT-CLEARED" );
    $kw3$ANY = makeKeyword( "ANY" );
    $sym4$PSP_VALID_CATEGORY_ = makeSymbol( "PSP-VALID-CATEGORY?" );
    $sym5$PSP_LEXICON_P = makeSymbol( "PSP-LEXICON-P" );
    $str6$__Cycls_____S__Parse_tree_____S__ = makeString( "~&Cycls:~% ~S~%Parse tree:~% ~S~%~%" );
    $str7$_________________________________ = makeString( "~%------------------------------------~%" );
    $const8$adjStrings = constant_handles.reader_make_constant_shell( makeString( "adjStrings" ) );
    $kw9$NONE = makeKeyword( "NONE" );
    $sym10$PSP_VALID_POS_PRED_ = makeSymbol( "PSP-VALID-POS-PRED?" );
    $sym11$PSP_GAP_CONSTRAINT_P = makeSymbol( "PSP-GAP-CONSTRAINT-P" );
    $const12$verbStrings = constant_handles.reader_make_constant_shell( makeString( "verbStrings" ) );
    $sym13$STRINGP = makeSymbol( "STRINGP" );
    $sym14$BOOLEANP = makeSymbol( "BOOLEANP" );
    $const15$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $sym16$PS_GET_CYCLS_FOR_NP = makeSymbol( "PS-GET-CYCLS-FOR-NP" );
    $list17 = ConsesLow.list( makeSymbol( "NP" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NON-TRIVIAL?" ), NIL ), ConsesLow.list( makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol(
        "GET-DEFAULT-PSP-LEXICON" ) ) ), ConsesLow.list( makeSymbol( "GAP" ), makeKeyword( "NONE" ) ) );
    $str18$_return_0_and_1_LISTP_of_CycL_par = makeString(
        "@return 0 and 1 LISTP of CycL parses for the noun-phrase NP.\n@param NON-TRIVIAL? boolean; Should we return parses found by lexical lookup,\nor just those that required actual parsing?" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "NP" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "NON-TRIVIAL?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "LEXICON" ), makeSymbol(
        "PSP-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "GAP" ), makeSymbol( "PSP-GAP-CONSTRAINT-P" ) ) );
    $sym20$FORT_OR_KEYWORD_P = makeSymbol( "FORT-OR-KEYWORD-P" );
    $sym21$PS_GET_CYCLS_FOR_PHRASE = makeSymbol( "PS-GET-CYCLS-FOR-PHRASE" );
    $list22 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "CATEGORY" ), makeKeyword( "ANY" ) ), ConsesLow.list( makeSymbol( "POS-PRED" ), makeKeyword( "ANY" ) ),
        ConsesLow.list( makeSymbol( "NON-TRIVIAL?" ), NIL ), ConsesLow.list( makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "GET-DEFAULT-PSP-LEXICON" ) ) ), ConsesLow.list( makeSymbol( "GAP" ), makeKeyword(
            "NONE" ) ), ConsesLow.list( makeSymbol( "TOP-LEVEL-RULE-FORT" ), makeKeyword( "ANY" ) ) );
    $str23$_return_0_and_1_LISTP_of_CycL_par = makeString(
        "@return 0 and 1 LISTP of CycL parses for STRING.\n@param NON-TRIVIAL? boolean; Should we return parses found by lexical lookup,\nor just those that required actual parsing?" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CATEGORY" ), makeSymbol( "PSP-VALID-CATEGORY?" ) ), ConsesLow.list( makeSymbol( "POS-PRED" ),
        makeSymbol( "PSP-VALID-POS-PRED?" ) ), ConsesLow.list( makeSymbol( "NON-TRIVIAL?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "LEXICON" ), makeSymbol( "PSP-LEXICON-P" ) ), ConsesLow.list(
            makeSymbol( "GAP" ), makeSymbol( "PSP-GAP-CONSTRAINT-P" ) ), ConsesLow.list( makeSymbol( "TOP-LEVEL-RULE-FORT" ), makeSymbol( "FORT-OR-KEYWORD-P" ) ) );
    $list25 = ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "LISTP" ) );
    $kw26$BEST_ONLY = makeKeyword( "BEST-ONLY" );
    $kw27$ON = makeKeyword( "ON" );
    $kw28$OFF = makeKeyword( "OFF" );
    $const29$CharacterString = constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) );
    $sym30$PS_HARVEST_NPS = makeSymbol( "PS-HARVEST-NPS" );
    $list31 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $kw32$NEW_SPAN = makeKeyword( "NEW-SPAN" );
    $sym33$CLET = makeSymbol( "CLET" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PSP-ANSWER-STORE*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) );
    $sym35$PSP_ANSWER_ACCUMULATOR = makeSymbol( "PSP-ANSWER-ACCUMULATOR" );
    $sym36$PSP_ANSWER_ACCUMULATOR_P = makeSymbol( "PSP-ANSWER-ACCUMULATOR-P" );
    $list37 = ConsesLow.list( makeSymbol( "BEST" ), makeSymbol( "REST" ), makeSymbol( "PLIST" ) );
    $list38 = ConsesLow.list( makeKeyword( "BEST" ), makeKeyword( "REST" ), makeKeyword( "PLIST" ) );
    $list39 = ConsesLow.list( makeSymbol( "PSP-ANSWER-ACCUMULATOR-BEST" ), makeSymbol( "PSP-ANSWER-ACCUMULATOR-REST" ), makeSymbol( "PSP-ANSWER-ACCUMULATOR-PLIST" ) );
    $list40 = ConsesLow.list( makeSymbol( "_CSETF-PSP-ANSWER-ACCUMULATOR-BEST" ), makeSymbol( "_CSETF-PSP-ANSWER-ACCUMULATOR-REST" ), makeSymbol( "_CSETF-PSP-ANSWER-ACCUMULATOR-PLIST" ) );
    $sym41$PPRINT_PSP_ANSWER_ACCUMULATOR = makeSymbol( "PPRINT-PSP-ANSWER-ACCUMULATOR" );
    $sym42$PSP_ANSWER_ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PSP-ANSWER-ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list43 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PSP-ANSWER-ACCUMULATOR-P" ) );
    $sym44$PSP_ANSWER_ACCUMULATOR_BEST = makeSymbol( "PSP-ANSWER-ACCUMULATOR-BEST" );
    $sym45$_CSETF_PSP_ANSWER_ACCUMULATOR_BEST = makeSymbol( "_CSETF-PSP-ANSWER-ACCUMULATOR-BEST" );
    $sym46$PSP_ANSWER_ACCUMULATOR_REST = makeSymbol( "PSP-ANSWER-ACCUMULATOR-REST" );
    $sym47$_CSETF_PSP_ANSWER_ACCUMULATOR_REST = makeSymbol( "_CSETF-PSP-ANSWER-ACCUMULATOR-REST" );
    $sym48$PSP_ANSWER_ACCUMULATOR_PLIST = makeSymbol( "PSP-ANSWER-ACCUMULATOR-PLIST" );
    $sym49$_CSETF_PSP_ANSWER_ACCUMULATOR_PLIST = makeSymbol( "_CSETF-PSP-ANSWER-ACCUMULATOR-PLIST" );
    $kw50$BEST = makeKeyword( "BEST" );
    $kw51$REST = makeKeyword( "REST" );
    $kw52$PLIST = makeKeyword( "PLIST" );
    $str53$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw54$BEGIN = makeKeyword( "BEGIN" );
    $sym55$MAKE_PSP_ANSWER_ACCUMULATOR = makeSymbol( "MAKE-PSP-ANSWER-ACCUMULATOR" );
    $kw56$SLOT = makeKeyword( "SLOT" );
    $kw57$END = makeKeyword( "END" );
    $sym58$VISIT_DEFSTRUCT_OBJECT_PSP_ANSWER_ACCUMULATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PSP-ANSWER-ACCUMULATOR-METHOD" );
    $list59 = ConsesLow.list( makeKeyword( "BEST" ), NIL, makeKeyword( "REST" ), NIL );
    $str60$__PSP_AA__ = makeString( "#<PSP-AA: " );
    $str61$BEST__D = makeString( "BEST:~D" );
    $str62$_empty_ = makeString( "(empty)" );
    $str63$_REST__D = makeString( " REST:~D" );
    $str64$_ = makeString( ">" );
    $sym65$PSP_CYCL__ = makeSymbol( "PSP-CYCL-=" );
    $str66$Bad_PSP_answer_type___S = makeString( "Bad PSP answer type: ~S" );
    $float67$0_1 = makeDouble( 0.1 );
    $kw68$BEST_WEIGHT = makeKeyword( "BEST-WEIGHT" );
    $float69$0_0 = makeDouble( 0.0 );
    $kw70$EVERYTHING = makeKeyword( "EVERYTHING" );
    $sym71$PSP_WEIGHT__ = makeSymbol( "PSP-WEIGHT->" );
    $sym72$PSP_CYCL_WEIGHT = makeSymbol( "PSP-CYCL-WEIGHT" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "EDGE" ), makeSymbol( "EDGE-SETS" ), makeSymbol( "BEST" ), makeSymbol( "REST" ) ), makeSymbol( "&BODY" ), makeSymbol( "CYCLS-FROM-EDGE" ) );
    $sym74$EDGE_SET = makeUninternedSymbol( "EDGE-SET" );
    $sym75$DONE_SPANS = makeUninternedSymbol( "DONE-SPANS" );
    $sym76$DONE_ = makeUninternedSymbol( "DONE?" );
    $sym77$PUNLESS = makeSymbol( "PUNLESS" );
    $list78 = ConsesLow.list( makeSymbol( "PARSING-TIMEOUT-TIME-REACHED?" ) );
    $sym79$MEMOIZING_NL_REFORMULATOR = makeSymbol( "MEMOIZING-NL-REFORMULATOR" );
    $sym80$WITH_NEW_PSP_ANSWER_STORE = makeSymbol( "WITH-NEW-PSP-ANSWER-STORE" );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-SET" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) );
    $list82 = ConsesLow.list( NIL );
    $sym83$CSOME = makeSymbol( "CSOME" );
    $sym84$PSP_ACCUMULATE_ANSWERS_ONE_SET = makeSymbol( "PSP-ACCUMULATE-ANSWERS-ONE-SET" );
    $sym85$PWHEN = makeSymbol( "PWHEN" );
    $sym86$CAND = makeSymbol( "CAND" );
    $list87 = ConsesLow.list( EQ, makeSymbol( "*PSP-RETURN-MODE*" ), makeKeyword( "BEST-ONLY" ) );
    $sym88$CNOT = makeSymbol( "CNOT" );
    $sym89$CSETQ = makeSymbol( "CSETQ" );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "PSP-GET-ANSWERS" ) ) ) ) );
    $sym91$CMULTIPLE_VALUE_SETQ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "PSP-GET-ANSWERS" ) ) );
    $sym93$PSP_ACCUMULATE_ANSWERS = makeSymbol( "PSP-ACCUMULATE-ANSWERS" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "EDGE" ), makeSymbol( "EDGE-SET" ), makeSymbol( "DONE-SPANS" ), makeSymbol( "DONE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "CYCLS-FROM-EDGE" ) );
    $sym95$THIS_SET_CYCLS = makeUninternedSymbol( "THIS-SET-CYCLS" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) );
    $sym97$DO_SET = makeSymbol( "DO-SET" );
    $kw98$DONE = makeKeyword( "DONE" );
    $sym99$PSP_GATHER_CYCLS_FROM_EDGE = makeSymbol( "PSP-GATHER-CYCLS-FROM-EDGE" );
    $sym100$PSP_UPDATE_RESULTS_FOR_EDGE_SET_CYCLS = makeSymbol( "PSP-UPDATE-RESULTS-FOR-EDGE-SET-CYCLS" );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "EDGE" ), makeSymbol( "THIS-SET-CYCLS" ), makeSymbol( "DONE-SPANS" ), makeSymbol( "DONE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "CYCLS-FROM-EDGE" ) );
    $sym102$CYCL = makeUninternedSymbol( "CYCL" );
    $sym103$SPAN = makeUninternedSymbol( "SPAN" );
    $sym104$GET_PSP_EDGE_SPAN = makeSymbol( "GET-PSP-EDGE-SPAN" );
    $sym105$SET_MEMBER_ = makeSymbol( "SET-MEMBER?" );
    $sym106$CDOLIST = makeSymbol( "CDOLIST" );
    $sym107$PSP_GATHER_ONE_CYCL = makeSymbol( "PSP-GATHER-ONE-CYCL" );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARSING-TIMEOUT-TIME-REACHED?" ) ) );
    $sym109$PS_PARSE_VBAR_INT_CACHED = makeSymbol( "PS-PARSE-VBAR-INT-CACHED" );
    $sym110$MEMOIZATION_STATE_P = makeSymbol( "MEMOIZATION-STATE-P" );
    $kw111$CLEAR_CACHES_ = makeKeyword( "CLEAR-CACHES?" );
    $kw112$FALSE = makeKeyword( "FALSE" );
    $sym113$_PS_PARSE_VBAR_INT_CACHED_CACHING_STATE_ = makeSymbol( "*PS-PARSE-VBAR-INT-CACHED-CACHING-STATE*" );
    $int114$256 = makeInteger( 256 );
    $sym115$PSP_VBAR_EDGE_ = makeSymbol( "PSP-VBAR-EDGE?" );
    $const116$TheVPParse = constant_handles.reader_make_constant_shell( makeString( "TheVPParse" ) );
    $kw117$REPLACE = makeKeyword( "REPLACE" );
    $sym118$PS_PARSE_PREDICATIVE_ADJP_INT_CACHED = makeSymbol( "PS-PARSE-PREDICATIVE-ADJP-INT-CACHED" );
    $sym119$_PS_PARSE_PREDICATIVE_ADJP_INT_CACHED_CACHING_STATE_ = makeSymbol( "*PS-PARSE-PREDICATIVE-ADJP-INT-CACHED-CACHING-STATE*" );
    $sym120$PSP_PREDICATIVE_ADJP_EDGE_ = makeSymbol( "PSP-PREDICATIVE-ADJP-EDGE?" );
    $sym121$KEYWORDP = makeSymbol( "KEYWORDP" );
    $const122$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $kw123$NOUN = makeKeyword( "NOUN" );
    $sym124$PS_GET_CYCLS_FOR_PHRASE_INT_CACHED = makeSymbol( "PS-GET-CYCLS-FOR-PHRASE-INT-CACHED" );
    $sym125$_PS_GET_CYCLS_FOR_PHRASE_INT_CACHED_CACHING_STATE_ = makeSymbol( "*PS-GET-CYCLS-FOR-PHRASE-INT-CACHED-CACHING-STATE*" );
    $const126$TheSentenceSubject = constant_handles.reader_make_constant_shell( makeString( "TheSentenceSubject" ) );
    $kw127$SUBJECT = makeKeyword( "SUBJECT" );
    $sym128$PS_GET_CYCLS_AND_CONSTRAINTS_FOR_PHRASE_CACHED = makeSymbol( "PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED" );
    $sym129$_PS_GET_CYCLS_AND_CONSTRAINTS_FOR_PHRASE_CACHED_CACHING_STATE_ = makeSymbol( "*PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED-CACHING-STATE*" );
    $list130 = ConsesLow.list( makeSymbol( "TARGET-CYCL" ), makeSymbol( "TARGET-CONSTRAINT" ) );
    $sym131$SUPPORT_SENTENCE = makeSymbol( "SUPPORT-SENTENCE" );
    $const132$termPhrases_Lexical = constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) );
    $kw133$DENOT_GROUND = makeKeyword( "DENOT-GROUND" );
    $str134$__Weight___S__CycL___S____ = makeString( "~&Weight: ~S~%CycL: ~S~%~%" );
    $float135$1_0 = makeDouble( 1.0 );
    $list136 = ConsesLow.list( makeSymbol( "SPAN" ), makeSymbol( "CYCL" ) );
    $sym137$_ = makeSymbol( "<" );
    $sym138$CAAR = makeSymbol( "CAAR" );
    $sym139$GREATER_LENGTH_P = makeSymbol( "GREATER-LENGTH-P" );
    $sym140$CAR = makeSymbol( "CAR" );
    $sym141$PS_HARVEST_PHRASES_INT_CACHED = makeSymbol( "PS-HARVEST-PHRASES-INT-CACHED" );
    $sym142$_PS_HARVEST_PHRASES_INT_CACHED_CACHING_STATE_ = makeSymbol( "*PS-HARVEST-PHRASES-INT-CACHED-CACHING-STATE*" );
    $str143$__String___S__S__Weight___S__CycL = makeString( "~&String: ~S ~S~%Weight: ~S~%CycL: ~S~%~%" );
    $sym144$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const145$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const146$SententialConstituent = constant_handles.reader_make_constant_shell( makeString( "SententialConstituent" ) );
    $sym147$_PSP_VALID_CATEGORY__CACHING_STATE_ = makeSymbol( "*PSP-VALID-CATEGORY?-CACHING-STATE*" );
    $int148$32 = makeInteger( 32 );
    $sym149$_PSP_VALID_POS_PRED__CACHING_STATE_ = makeSymbol( "*PSP-VALID-POS-PRED?-CACHING-STATE*" );
    $sym150$PS_PARSE_SHOWING_RULES_INT = makeSymbol( "PS-PARSE-SHOWING-RULES-INT" );
    $sym151$PHRASE_STRUCTURE_PARSER_CHART_P = makeSymbol( "PHRASE-STRUCTURE-PARSER-CHART-P" );
    $kw152$LEXICAL = makeKeyword( "LEXICAL" );
    $sym153$_PS_PARSE_SHOWING_RULES_INT_CACHING_STATE_ = makeSymbol( "*PS-PARSE-SHOWING-RULES-INT-CACHING-STATE*" );
    $kw154$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym155$PSP_EDGE_NON_BRANCHING_DESCENDENT_ = makeSymbol( "PSP-EDGE-NON-BRANCHING-DESCENDENT?" );
    $kw156$NP = makeKeyword( "NP" );
    $sym157$PSP_EDGE_WEIGHTIER_ = makeSymbol( "PSP-EDGE-WEIGHTIER?" );
    $list158 = ConsesLow.list( ConsesLow.list( makeSymbol( "TOKEN-LIST1" ), makeSymbol( "CYCL-LIST1" ) ), ConsesLow.list( makeSymbol( "TOKEN-LIST2" ), makeSymbol( "CYCL-LIST2" ) ) );
    $kw159$TEST = makeKeyword( "TEST" );
    $sym160$PS_TEST_FUNC = makeSymbol( "PS-TEST-FUNC" );
    $kw161$OWNER = makeKeyword( "OWNER" );
    $kw162$CLASSES = makeKeyword( "CLASSES" );
    $list163 = ConsesLow.list( makeSymbol( "NL-TEST-CASES" ), makeSymbol( "NL-PARSING-TEST-CASES" ) );
    $kw164$KB = makeKeyword( "KB" );
    $kw165$FULL = makeKeyword( "FULL" );
    $kw166$WORKING_ = makeKeyword( "WORKING?" );
    $list167 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "lake" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Lake" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "the lake" ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "Lake" ) ) ), ZERO_INTEGER ) ), ConsesLow.list( ConsesLow.list( makeString( "in the lake" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "SubcollectionOfWithRelationToFn" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell(
                                    makeString( "Lake" ) ) ), ONE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( makeString( "in the lake" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                        "SubcollectionOfWithRelationToFn" ) ), makeKeyword( "ACTION" ), constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), ConsesLow.list(
                                            constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), ConsesLow
                                                .list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ),
                                                    constant_handles.reader_make_constant_shell( makeString( "Lake" ) ) ), ONE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( makeString( "swam in the lake" ), makeKeyword(
                                                        "ANY" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles
                                                            .reader_make_constant_shell( makeString( "Swimming-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ),
                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                "Definite-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles
                                                                    .reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Lake" ) ) ),
                                                                TWO_INTEGER ) ) ) );
    $list168 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "furniture" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), constant_handles
        .reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "Mass-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "FurniturePiece" ) ) ), ZERO_INTEGER ) ), ConsesLow.list( ConsesLow.list( makeString( "oak furniture" ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Mass-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "SubcollectionOfWithRelationToTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "FurniturePiece" ) ), constant_handles.reader_make_constant_shell( makeString(
                            "mainConstituent" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WoodFn" ) ), constant_handles.reader_make_constant_shell( makeString( "OakTree" ) ) ) ) ),
                ZERO_INTEGER ) ), ConsesLow.list( ConsesLow.list( makeString( "new oak furniture" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell(
                        makeString( "Mass-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "FurniturePiece" ) ), constant_handles
                                .reader_make_constant_shell( makeString( "mainConstituent" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WoodFn" ) ), constant_handles
                                    .reader_make_constant_shell( makeString( "OakTree" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString(
                                        "NewArtifact" ) ) ) ), ZERO_INTEGER ) ) );
    $sym169$PS_HARVEST_NPS_TEST_FUNC = makeSymbol( "PS-HARVEST-NPS-TEST-FUNC" );
    $list170 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "jungle" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "the jungle" ) ), ConsesLow.list( ConsesLow.list( ZERO_INTEGER, ONE_INTEGER ),
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell(
                makeString( "TropicalRainForest" ) ) ), ZERO_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "in the jungle" ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER ), ConsesLow.list(
                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles
                            .reader_make_constant_shell( makeString( "TropicalRainForest" ) ) ), ONE_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "emus in the jungle" ) ), ConsesLow.list( ConsesLow.list(
                                ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), constant_handles
                                    .reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles
                                        .reader_make_constant_shell( makeString( "Plural-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ),
                                            constant_handles.reader_make_constant_shell( makeString( "Emu" ) ), constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), ConsesLow.list(
                                                constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), ConsesLow
                                                    .list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ),
                                                        constant_handles.reader_make_constant_shell( makeString( "TropicalRainForest" ) ) ), TWO_INTEGER ) ) ), ZERO_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                            makeString( "two emus in the jungle" ) ), ConsesLow.list( ConsesLow.list( ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER ), ConsesLow.list(
                                                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                    makeString( "NumericalQuant-NLAttrFn" ) ), TWO_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ),
                                                                        constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                            makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Emu" ) ), constant_handles
                                                                                .reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                    makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), ConsesLow.list(
                                                                                        constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                            "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "TropicalRainForest" ) ) ), THREE_INTEGER ) ) ),
                                                                    ZERO_INTEGER ) ) ) ) );
  }

  public static final class $psp_answer_accumulator_native
      extends
        SubLStructNative
  {
    public SubLObject $best;
    public SubLObject $rest;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $psp_answer_accumulator_native()
    {
      this.$best = CommonSymbols.NIL;
      this.$rest = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $psp_answer_accumulator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$best;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$rest;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$best = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$rest = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $psp_answer_accumulator_native.class, $sym35$PSP_ANSWER_ACCUMULATOR, $sym36$PSP_ANSWER_ACCUMULATOR_P, $list37, $list38, new String[] { "$best", "$rest", "$plist"
      }, $list39, $list40, $sym41$PPRINT_PSP_ANSWER_ACCUMULATOR );
    }
  }

  public static final class $psp_answer_accumulator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $psp_answer_accumulator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PSP-ANSWER-ACCUMULATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return psp_answer_accumulator_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2272 ms
 * 
 */