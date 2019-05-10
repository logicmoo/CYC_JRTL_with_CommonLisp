package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_info
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.system_info";
  public static final String myFingerPrint = "87c436ffbec68a3168168699e95f3eb1a9542207cb63010c0c9870fe77385236";
  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 504L)
  public static SubLSymbol $cyc_home_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 876L)
  public static SubLSymbol $available_cyc_features$;
  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 5037L)
  private static SubLSymbol $cycl_start_time$;
  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 5585L)
  private static SubLSymbol $subl_initial_continuation$;
  private static final SubLSymbol $sym0$_AVAILABLE_CYC_FEATURES_;
  private static final SubLSymbol $sym1$STRING_;
  private static final SubLSymbol $sym2$SYMBOL_NAME;
  private static final SubLSymbol $sym3$NOTE_TRANSLATION_FEATURE;
  private static final SubLSymbol $sym4$PROGN;
  private static final SubLSymbol $kw5$CYC_BROWSER;
  private static final SubLSymbol $kw6$CYC_BUTLER;
  private static final SubLSymbol $kw7$CYC_DATE;
  private static final SubLSymbol $kw8$CYC_EVENT;
  private static final SubLSymbol $kw9$CYC_EXTERNAL;
  private static final SubLSymbol $kw10$CYC_GRAPHER;
  private static final SubLSymbol $kw11$CYC_HTML;
  private static final SubLSymbol $kw12$CYC_JAVAFRAMEWORK;
  private static final SubLSymbol $kw13$CYC_LEXICON;
  private static final SubLSymbol $kw14$CYC_NL;
  private static final SubLSymbol $kw15$CYC_PLANNER;
  private static final SubLSymbol $kw16$CYC_PPH;
  private static final SubLSymbol $kw17$CYC_QUANT;
  private static final SubLSymbol $kw18$CYC_QUIRK;
  private static final SubLSymbol $kw19$CYC_REFORMULATOR;
  private static final SubLSymbol $kw20$CYC_REGEX;
  private static final SubLSymbol $kw21$CYC_RESEARCHCYC;
  private static final SubLSymbol $kw22$CYC_RESEARCHCYC_DEBUG;
  private static final SubLSymbol $kw23$CYC_RKF;
  private static final SubLSymbol $kw24$CYC_RTP;
  private static final SubLSymbol $kw25$CYC_SCENGEN;
  private static final SubLSymbol $kw26$CYC_SKSI;
  private static final SubLSymbol $kw27$CYC_SUBLOOP;
  private static final SubLSymbol $kw28$CYC_TESTING;
  private static final SubLSymbol $kw29$CYC_TIME;
  private static final SubLSymbol $kw30$CYC_WORDNET;
  private static final SubLSymbol $kw31$CYC_YAHOO;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$CYCORP;
  private static final SubLSymbol $sym34$CYC_REVISION_STRING;
  private static final SubLSymbol $sym35$CYC_REVISION_STRING_S1P_FORMAT;
  private static final SubLString $str36$s;
  private static final SubLSymbol $sym37$CYC_REVISION_NUMBERS;
  private static final SubLSymbol $sym38$_CYCL_START_TIME_;
  private static final SubLSymbol $sym39$CYCL_START_TIME;
  private static final SubLSymbol $sym40$_SUBL_INITIAL_CONTINUATION_;
  private static final SubLSymbol $sym41$CYC_INITIAL_CONTINUATION;
  private static final SubLString $str42$CYC;
  private static final SubLString $str43$Process_ID___D__;
  private static final SubLString $str44$System_____unknown_______A______K;
  private static final SubLString $str45$Working_Directory___A__;

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 1134L)
  public static SubLObject note_translation_feature(final SubLObject feature)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == conses_high.member( feature, $available_cyc_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $available_cyc_features$.setGlobalValue( ConsesLow.cons( feature, $available_cyc_features$.getGlobalValue() ) );
    }
    if( NIL == conses_high.member( feature, reader.$features$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      reader.$features$.setDynamicValue( ConsesLow.cons( feature, reader.$features$.getDynamicValue( thread ) ), thread );
    }
    return feature;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 1273L)
  public static SubLObject note_translation_features(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    SubLObject candidate_features = $available_cyc_features$.getGlobalValue();
    SubLObject code = NIL;
    SubLObject cdolist_list_var;
    candidate_features = ( cdolist_list_var = Sort.sort( conses_high.copy_list( candidate_features ), Symbols.symbol_function( $sym1$STRING_ ), Symbols.symbol_function( $sym2$SYMBOL_NAME ) ) );
    SubLObject feature = NIL;
    feature = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conses_high.member( feature, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
      {
        code = ConsesLow.cons( ConsesLow.list( $sym3$NOTE_TRANSLATION_FEATURE, feature ), code );
      }
      cdolist_list_var = cdolist_list_var.rest();
      feature = cdolist_list_var.first();
    }
    return reader.bq_cons( $sym4$PROGN, ConsesLow.append( Sequences.nreverse( code ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 1746L)
  public static SubLObject check_for_feature(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    feature = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != conses_high.member( feature, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2456L)
  public static SubLObject cyc_html_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2529L)
  public static SubLObject cyc_date_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2601L)
  public static SubLObject cyc_quant_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2674L)
  public static SubLObject cyc_pph_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2745L)
  public static SubLObject cyc_lexicon_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2820L)
  public static SubLObject cyc_nl_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2890L)
  public static SubLObject cyc_hpsg_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 2962L)
  public static SubLObject cyc_external_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3038L)
  public static SubLObject cyc_wordnet_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3113L)
  public static SubLObject cyc_retrieval_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3190L)
  public static SubLObject cyc_thesaurus_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3267L)
  public static SubLObject cyc_maint_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3340L)
  public static SubLObject cyc_secure_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3414L)
  public static SubLObject cyc_hitek_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3487L)
  public static SubLObject cyc_hpkb_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3559L)
  public static SubLObject cyc_qa_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3629L)
  public static SubLObject cyc_kbi_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3700L)
  public static SubLObject cyc_opencyc_feature()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3775L)
  public static SubLObject cyc_researchcyc_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 3854L)
  public static SubLObject cyc_sksi_feature()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 4033L)
  public static SubLObject matches_execution_context_p(final SubLObject location)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( system_parameters.$cyc_execution_context$.getDynamicValue( thread ), location );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 4128L)
  public static SubLObject cycorp_execution_context_p()
  {
    return matches_execution_context_p( $kw33$CYCORP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 4342L)
  public static SubLObject cyc_revision_string()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return system_version.$cyc_revision_string$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 4498L)
  public static SubLObject cyc_revision_string_s1p_format()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.cconcatenate( $str36$s, format_nil.format_nil_a_no_copy( Sequences.substitute( Characters.CHAR_p, Characters.CHAR_period, system_version.$cyc_revision_string$.getDynamicValue( thread ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 4621L)
  public static SubLObject cyc_revision_numbers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return system_version.$cyc_revision_numbers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 5080L)
  public static SubLObject reset_cycl_start_time(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    $cycl_start_time$.setGlobalValue( universal_time );
    return $cycl_start_time$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 5274L)
  public static SubLObject cycl_start_time()
  {
    return $cycl_start_time$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 5410L)
  public static SubLObject cycl_uptime()
  {
    return Numbers.subtract( Time.get_universal_time(), cycl_start_time() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 5869L)
  public static SubLObject cyc_initial_continuation(final SubLObject initialization_file, final SubLObject init_form, final SubLObject batchP, final SubLObject backgroundP)
  {
    cyc_initialization();
    return Functions.funcall( $subl_initial_continuation$.getGlobalValue(), initialization_file, init_form, list_utilities.sublisp_boolean( batchP ), list_utilities.sublisp_boolean( backgroundP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-info.lisp", position = 6527L)
  public static SubLObject cyc_initialization()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Packages.$package$.setDynamicValue( Packages.find_package( $str42$CYC ), thread );
    PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str43$Process_ID___D__, Environment.get_process_id( UNPROVIDED ) );
    PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str44$System_____unknown_______A______K, cyc_revision_string(), control_vars.kb_loaded() );
    PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str45$Working_Directory___A__, file_utilities.canonical_cyc_working_directory() );
    streams_high.force_output( StreamsLow.$terminal_io$.getDynamicValue( thread ) );
    return T;
  }

  public static SubLObject declare_system_info_file()
  {
    SubLFiles.declareFunction( me, "note_translation_feature", "NOTE-TRANSLATION-FEATURE", 1, 0, false );
    SubLFiles.declareMacro( me, "note_translation_features", "NOTE-TRANSLATION-FEATURES" );
    SubLFiles.declareMacro( me, "check_for_feature", "CHECK-FOR-FEATURE" );
    SubLFiles.declareFunction( me, "cyc_html_feature", "CYC-HTML-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_feature", "CYC-DATE-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_quant_feature", "CYC-QUANT-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_pph_feature", "CYC-PPH-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_lexicon_feature", "CYC-LEXICON-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_nl_feature", "CYC-NL-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_hpsg_feature", "CYC-HPSG-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_external_feature", "CYC-EXTERNAL-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_wordnet_feature", "CYC-WORDNET-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_retrieval_feature", "CYC-RETRIEVAL-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_thesaurus_feature", "CYC-THESAURUS-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_maint_feature", "CYC-MAINT-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_secure_feature", "CYC-SECURE-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_hitek_feature", "CYC-HITEK-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_hpkb_feature", "CYC-HPKB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_qa_feature", "CYC-QA-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_kbi_feature", "CYC-KBI-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_opencyc_feature", "CYC-OPENCYC-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_researchcyc_feature", "CYC-RESEARCHCYC-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_sksi_feature", "CYC-SKSI-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "matches_execution_context_p", "MATCHES-EXECUTION-CONTEXT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycorp_execution_context_p", "CYCORP-EXECUTION-CONTEXT-P", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_revision_string", "CYC-REVISION-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_revision_string_s1p_format", "CYC-REVISION-STRING-S1P-FORMAT", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_revision_numbers", "CYC-REVISION-NUMBERS", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_cycl_start_time", "RESET-CYCL-START-TIME", 0, 1, false );
    SubLFiles.declareFunction( me, "cycl_start_time", "CYCL-START-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "cycl_uptime", "CYCL-UPTIME", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_initial_continuation", "CYC-INITIAL-CONTINUATION", 4, 0, false );
    SubLFiles.declareFunction( me, "cyc_initialization", "CYC-INITIALIZATION", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_system_info_file()
  {
    $cyc_home_directory$ = SubLFiles.deflexical( "*CYC-HOME-DIRECTORY*", Filesys.construct_filename( NIL, NIL, NIL, T ) );
    $available_cyc_features$ = SubLFiles.deflexical( "*AVAILABLE-CYC-FEATURES*", ( maybeDefault( $sym0$_AVAILABLE_CYC_FEATURES_, $available_cyc_features$, NIL ) ) );
    $cycl_start_time$ = SubLFiles.deflexical( "*CYCL-START-TIME*", ( maybeDefault( $sym38$_CYCL_START_TIME_, $cycl_start_time$, NIL ) ) );
    $subl_initial_continuation$ = SubLFiles.deflexical( "*SUBL-INITIAL-CONTINUATION*", ( maybeDefault( $sym40$_SUBL_INITIAL_CONTINUATION_, $subl_initial_continuation$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_system_info_file()
  {
    note_translation_feature( $kw5$CYC_BROWSER );
    note_translation_feature( $kw6$CYC_BUTLER );
    note_translation_feature( $kw7$CYC_DATE );
    note_translation_feature( $kw8$CYC_EVENT );
    note_translation_feature( $kw9$CYC_EXTERNAL );
    note_translation_feature( $kw10$CYC_GRAPHER );
    note_translation_feature( $kw11$CYC_HTML );
    note_translation_feature( $kw12$CYC_JAVAFRAMEWORK );
    note_translation_feature( $kw13$CYC_LEXICON );
    note_translation_feature( $kw14$CYC_NL );
    note_translation_feature( $kw15$CYC_PLANNER );
    note_translation_feature( $kw16$CYC_PPH );
    note_translation_feature( $kw17$CYC_QUANT );
    note_translation_feature( $kw18$CYC_QUIRK );
    note_translation_feature( $kw19$CYC_REFORMULATOR );
    note_translation_feature( $kw20$CYC_REGEX );
    note_translation_feature( $kw21$CYC_RESEARCHCYC );
    note_translation_feature( $kw22$CYC_RESEARCHCYC_DEBUG );
    note_translation_feature( $kw23$CYC_RKF );
    note_translation_feature( $kw24$CYC_RTP );
    note_translation_feature( $kw25$CYC_SCENGEN );
    note_translation_feature( $kw26$CYC_SKSI );
    note_translation_feature( $kw27$CYC_SUBLOOP );
    note_translation_feature( $kw28$CYC_TESTING );
    note_translation_feature( $kw29$CYC_TIME );
    note_translation_feature( $kw30$CYC_WORDNET );
    note_translation_feature( $kw31$CYC_YAHOO );
    access_macros.register_external_symbol( $sym34$CYC_REVISION_STRING );
    access_macros.register_external_symbol( $sym35$CYC_REVISION_STRING_S1P_FORMAT );
    access_macros.register_external_symbol( $sym37$CYC_REVISION_NUMBERS );
    subl_macro_promotions.declare_defglobal( $sym38$_CYCL_START_TIME_ );
    access_macros.register_external_symbol( $sym39$CYCL_START_TIME );
    subl_macro_promotions.declare_defglobal( $sym40$_SUBL_INITIAL_CONTINUATION_ );
    $subl_initial_continuation$.setGlobalValue( Eval.get_initial_continuation() );
    Eval.set_initial_continuation( $sym41$CYC_INITIAL_CONTINUATION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_system_info_file();
  }

  @Override
  public void initializeVariables()
  {
    init_system_info_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_system_info_file();
  }
  static
  {
    me = new system_info();
    $cyc_home_directory$ = null;
    $available_cyc_features$ = null;
    $cycl_start_time$ = null;
    $subl_initial_continuation$ = null;
    $sym0$_AVAILABLE_CYC_FEATURES_ = makeSymbol( "*AVAILABLE-CYC-FEATURES*" );
    $sym1$STRING_ = makeSymbol( "STRING<" );
    $sym2$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $sym3$NOTE_TRANSLATION_FEATURE = makeSymbol( "NOTE-TRANSLATION-FEATURE" );
    $sym4$PROGN = makeSymbol( "PROGN" );
    $kw5$CYC_BROWSER = makeKeyword( "CYC-BROWSER" );
    $kw6$CYC_BUTLER = makeKeyword( "CYC-BUTLER" );
    $kw7$CYC_DATE = makeKeyword( "CYC-DATE" );
    $kw8$CYC_EVENT = makeKeyword( "CYC-EVENT" );
    $kw9$CYC_EXTERNAL = makeKeyword( "CYC-EXTERNAL" );
    $kw10$CYC_GRAPHER = makeKeyword( "CYC-GRAPHER" );
    $kw11$CYC_HTML = makeKeyword( "CYC-HTML" );
    $kw12$CYC_JAVAFRAMEWORK = makeKeyword( "CYC-JAVAFRAMEWORK" );
    $kw13$CYC_LEXICON = makeKeyword( "CYC-LEXICON" );
    $kw14$CYC_NL = makeKeyword( "CYC-NL" );
    $kw15$CYC_PLANNER = makeKeyword( "CYC-PLANNER" );
    $kw16$CYC_PPH = makeKeyword( "CYC-PPH" );
    $kw17$CYC_QUANT = makeKeyword( "CYC-QUANT" );
    $kw18$CYC_QUIRK = makeKeyword( "CYC-QUIRK" );
    $kw19$CYC_REFORMULATOR = makeKeyword( "CYC-REFORMULATOR" );
    $kw20$CYC_REGEX = makeKeyword( "CYC-REGEX" );
    $kw21$CYC_RESEARCHCYC = makeKeyword( "CYC-RESEARCHCYC" );
    $kw22$CYC_RESEARCHCYC_DEBUG = makeKeyword( "CYC-RESEARCHCYC-DEBUG" );
    $kw23$CYC_RKF = makeKeyword( "CYC-RKF" );
    $kw24$CYC_RTP = makeKeyword( "CYC-RTP" );
    $kw25$CYC_SCENGEN = makeKeyword( "CYC-SCENGEN" );
    $kw26$CYC_SKSI = makeKeyword( "CYC-SKSI" );
    $kw27$CYC_SUBLOOP = makeKeyword( "CYC-SUBLOOP" );
    $kw28$CYC_TESTING = makeKeyword( "CYC-TESTING" );
    $kw29$CYC_TIME = makeKeyword( "CYC-TIME" );
    $kw30$CYC_WORDNET = makeKeyword( "CYC-WORDNET" );
    $kw31$CYC_YAHOO = makeKeyword( "CYC-YAHOO" );
    $list32 = ConsesLow.list( makeSymbol( "FEATURE" ) );
    $kw33$CYCORP = makeKeyword( "CYCORP" );
    $sym34$CYC_REVISION_STRING = makeSymbol( "CYC-REVISION-STRING" );
    $sym35$CYC_REVISION_STRING_S1P_FORMAT = makeSymbol( "CYC-REVISION-STRING-S1P-FORMAT" );
    $str36$s = makeString( "s" );
    $sym37$CYC_REVISION_NUMBERS = makeSymbol( "CYC-REVISION-NUMBERS" );
    $sym38$_CYCL_START_TIME_ = makeSymbol( "*CYCL-START-TIME*" );
    $sym39$CYCL_START_TIME = makeSymbol( "CYCL-START-TIME" );
    $sym40$_SUBL_INITIAL_CONTINUATION_ = makeSymbol( "*SUBL-INITIAL-CONTINUATION*" );
    $sym41$CYC_INITIAL_CONTINUATION = makeSymbol( "CYC-INITIAL-CONTINUATION" );
    $str42$CYC = makeString( "CYC" );
    $str43$Process_ID___D__ = makeString( "Process ID: ~D~%" );
    $str44$System_____unknown_______A______K = makeString( "System ~:[<unknown>~;~:*~A~]~@[ KB ~D~].~%" );
    $str45$Working_Directory___A__ = makeString( "Working Directory: ~A~%" );
  }
}
/*
 * 
 * Total time: 87 ms
 * 
 */