package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_speech_act
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_speech_act";
  public static final String myFingerPrint = "c368fcaa825558eef44601a6dbe00d15a0ffe16986e462a86f538549d223665c";
  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 811L)
  private static SubLSymbol $pph_forces$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$DECLARATIVE;
  private static final SubLSymbol $kw2$TEXT;
  private static final SubLSymbol $kw3$ANY;
  private static final SubLSymbol $kw4$EITHER;

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 944L)
  public static SubLObject get_pph_forces_list()
  {
    return conses_high.copy_list( $pph_forces$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 1160L)
  public static SubLObject pph_force_p(final SubLObject obj)
  {
    return subl_promotions.memberP( obj, $pph_forces$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 1260L)
  public static SubLObject generate_speech_act(final SubLObject cycl, final SubLObject speaker, final SubLObject addressee, SubLObject force, SubLObject agr_pred, SubLObject language_mt, SubLObject domain_mt,
      SubLObject mode)
  {
    if( force == UNPROVIDED )
    {
      force = $kw1$DECLARATIVE;
    }
    if( agr_pred == UNPROVIDED )
    {
      agr_pred = pph_utilities.pph_present_tense_pred();
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw2$TEXT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_speaker$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_addressee$.currentBinding( thread );
    try
    {
      pph_vars.$pph_speaker$.bind( speaker, thread );
      pph_vars.$pph_addressee$.bind( addressee, thread );
      final SubLObject nl_preds = ( NIL != agr_pred ) ? ConsesLow.list( agr_pred ) : $kw3$ANY;
      ans = pph_main.generate_text_wXsentential_force( cycl, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_addressee$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_speaker$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 2165L)
  public static SubLObject pph_current_addressee_p(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.equal( cycl, pph_vars.$pph_addressee$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 2287L)
  public static SubLObject pph_current_addressee()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return pph_vars.$pph_addressee$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 2347L)
  public static SubLObject pph_current_speaker_p(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.equal( cycl, pph_vars.$pph_speaker$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 2431L)
  public static SubLObject pph_addressee_known_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return forts.fort_p( pph_vars.$pph_addressee$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 2509L)
  public static SubLObject pph_speaker_known_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return forts.fort_p( pph_vars.$pph_speaker$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 2583L)
  public static SubLObject pph_discourse_participant_p(final SubLObject cycl)
  {
    return makeBoolean( NIL != pph_current_addressee_p( cycl ) || NIL != pph_current_speaker_p( cycl ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-speech-act.lisp", position = 2717L)
  public static SubLObject pph_discourse_participants_knownP(SubLObject mode)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw4$EITHER;
    }
    final SubLObject addressee_knownP = pph_addressee_known_p();
    final SubLObject speaker_knownP = pph_speaker_known_p();
    if( NIL != addressee_knownP && NIL != speaker_knownP )
    {
      return T;
    }
    if( $kw4$EITHER == mode && ( NIL != addressee_knownP || NIL != speaker_knownP ) )
    {
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_pph_speech_act_file()
  {
    SubLFiles.declareFunction( me, "get_pph_forces_list", "GET-PPH-FORCES-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_force_p", "PPH-FORCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_speech_act", "GENERATE-SPEECH-ACT", 3, 5, false );
    SubLFiles.declareFunction( me, "pph_current_addressee_p", "PPH-CURRENT-ADDRESSEE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_current_addressee", "PPH-CURRENT-ADDRESSEE", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_current_speaker_p", "PPH-CURRENT-SPEAKER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_addressee_known_p", "PPH-ADDRESSEE-KNOWN-P", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_speaker_known_p", "PPH-SPEAKER-KNOWN-P", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_discourse_participant_p", "PPH-DISCOURSE-PARTICIPANT-P", 1, 0, false );
    new $pph_discourse_participant_p$UnaryFunction();
    SubLFiles.declareFunction( me, "pph_discourse_participants_knownP", "PPH-DISCOURSE-PARTICIPANTS-KNOWN?", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_pph_speech_act_file()
  {
    $pph_forces$ = SubLFiles.defconstant( "*PPH-FORCES*", $list0 );
    return NIL;
  }

  public static SubLObject setup_pph_speech_act_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_speech_act_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_speech_act_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_speech_act_file();
  }
  static
  {
    me = new pph_speech_act();
    $pph_forces$ = null;
    $list0 = ConsesLow.list( makeKeyword( "NONE" ), makeKeyword( "DECLARATIVE" ), makeKeyword( "INTERROGATIVE" ), makeKeyword( "QUESTION" ), makeKeyword( "IMPERATIVE" ), makeKeyword( "DEFAULT" ) );
    $kw1$DECLARATIVE = makeKeyword( "DECLARATIVE" );
    $kw2$TEXT = makeKeyword( "TEXT" );
    $kw3$ANY = makeKeyword( "ANY" );
    $kw4$EITHER = makeKeyword( "EITHER" );
  }

  public static final class $pph_discourse_participant_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $pph_discourse_participant_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PPH-DISCOURSE-PARTICIPANT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pph_discourse_participant_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 29 ms
 * 
 */