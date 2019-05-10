package com.cyc.cycjava.cycl.rtp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_initialize
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_initialize";
  public static final String myFingerPrint = "1c6dc89ff417dd411bab235eee8170d8275d9604cf5ff268d71ac438ec67c90d";
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 802L)
  private static SubLSymbol $rtp_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 1957L)
  private static SubLSymbol $rtp_initialized$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 2096L)
  private static SubLSymbol $rtp_default_template_types$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$VALID_CONSTANT_;
  private static final SubLSymbol $sym2$_RTP_INITIALIZED_;
  private static final SubLList $list3;
  private static final SubLObject $const4$TemplateParsingMt;
  private static final SubLSymbol $kw5$INITIALIZED;
  private static final SubLSymbol $kw6$RESET;

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 1595L)
  public static SubLObject initialize_rtp_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym1$VALID_CONSTANT_, $rtp_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_rtp_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_rtp_kb_loaded();
    }
    return kb_control_vars.rtp_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 2030L)
  public static SubLObject rtp_initializedP()
  {
    return $rtp_initialized$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 2849L)
  public static SubLObject possibly_initialize_and_populate_rtp(SubLObject mt, SubLObject template_types)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( template_types == UNPROVIDED )
    {
      template_types = $rtp_default_template_types$.getDynamicValue();
    }
    return ( NIL != rtp_initializedP() ) ? NIL : initialize_and_populate_rtp( mt, template_types );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 3054L)
  public static SubLObject initialize_and_populate_rtp(SubLObject mt, SubLObject template_types)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( template_types == UNPROVIDED )
    {
      template_types = $rtp_default_template_types$.getDynamicValue();
    }
    recognition.ensure_sem_parse_initialized();
    rtp_datastructures.populate_meta_markers_from_mt( $const4$TemplateParsingMt, UNPROVIDED );
    rtp_datastructures.populate_template_category_fill_words_from_mt( $const4$TemplateParsingMt, UNPROVIDED );
    rtp_datastructures.populate_rtp_from_mt( mt, template_types );
    $rtp_initialized$.setGlobalValue( T );
    rtp_datastructures.$use_better_template_rule_sxhashP$.setGlobalValue( T );
    return $kw5$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 3463L)
  public static SubLObject initialize_and_repopulate_rtp(SubLObject mt, SubLObject template_types)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( template_types == UNPROVIDED )
    {
      template_types = $rtp_default_template_types$.getDynamicValue();
    }
    recognition.ensure_sem_parse_initialized();
    rtp_datastructures.populate_meta_markers_from_mt( $const4$TemplateParsingMt, UNPROVIDED );
    rtp_datastructures.populate_template_category_fill_words_from_mt( $const4$TemplateParsingMt, UNPROVIDED );
    rtp_datastructures.repopulate_rtp_from_mt( mt, template_types );
    $rtp_initialized$.setGlobalValue( T );
    rtp_datastructures.$use_better_template_rule_sxhashP$.setGlobalValue( T );
    return $kw5$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-initialize.lisp", position = 4000L)
  public static SubLObject reset_rtp_completely()
  {
    rtp_datastructures.reset_all_rtp_datastructure_caches();
    recognition.reset_all_recognizer_caches();
    initialize_and_populate_rtp( UNPROVIDED, UNPROVIDED );
    return $kw6$RESET;
  }

  public static SubLObject declare_rtp_initialize_file()
  {
    SubLFiles.declareFunction( me, "initialize_rtp_kb_feature", "INITIALIZE-RTP-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "rtp_initializedP", "RTP-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_initialize_and_populate_rtp", "POSSIBLY-INITIALIZE-AND-POPULATE-RTP", 0, 2, false );
    SubLFiles.declareFunction( me, "initialize_and_populate_rtp", "INITIALIZE-AND-POPULATE-RTP", 0, 2, false );
    SubLFiles.declareFunction( me, "initialize_and_repopulate_rtp", "INITIALIZE-AND-REPOPULATE-RTP", 0, 2, false );
    SubLFiles.declareFunction( me, "reset_rtp_completely", "RESET-RTP-COMPLETELY", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_rtp_initialize_file()
  {
    $rtp_core_constants$ = SubLFiles.deflexical( "*RTP-CORE-CONSTANTS*", $list0 );
    $rtp_initialized$ = SubLFiles.deflexical( "*RTP-INITIALIZED*", ( maybeDefault( $sym2$_RTP_INITIALIZED_, $rtp_initialized$, NIL ) ) );
    $rtp_default_template_types$ = SubLFiles.defparameter( "*RTP-DEFAULT-TEMPLATE-TYPES*", $list3 );
    return NIL;
  }

  public static SubLObject setup_rtp_initialize_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_RTP_INITIALIZED_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rtp_initialize_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rtp_initialize_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rtp_initialize_file();
  }
  static
  {
    me = new rtp_initialize();
    $rtp_core_constants$ = null;
    $rtp_initialized$ = null;
    $rtp_default_template_types$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMt" ) ) );
    $sym1$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym2$_RTP_INITIALIZED_ = makeSymbol( "*RTP-INITIALIZED*" );
    $list3 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termTemplate" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "termTemplate-Reln" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertTemplate-Reln" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TemporalModifierTemplate" ) ) ) );
    $const4$TemplateParsingMt = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMt" ) );
    $kw5$INITIALIZED = makeKeyword( "INITIALIZED" );
    $kw6$RESET = makeKeyword( "RESET" );
  }
}
/*
 * 
 * Total time: 21 ms
 * 
 */