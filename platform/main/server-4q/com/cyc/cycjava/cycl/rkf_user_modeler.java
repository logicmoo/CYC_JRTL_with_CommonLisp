package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_user_modeler
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_user_modeler";
  public static final String myFingerPrint = "05c73f81acc1a5e4156d9e72de767dc5e7e322ab827c444863c4d3b89edc0692";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-user-modeler.lisp", position = 785L)
  private static SubLSymbol $rkf_user_definition_mt$;
  private static final SubLObject $const0$CyclistsMt;
  private static final SubLObject $const1$InferencePSC;
  private static final SubLList $list2;
  private static final SubLObject $const3$and;
  private static final SubLList $list4;
  private static final SubLObject $const5$languageSpoken;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLObject $const9$languageAvailableForUIAInteractio;
  private static final SubLSymbol $kw10$SUPPORTED;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-user-modeler.lisp", position = 845L)
  public static SubLObject rkf_user_modeler_supported_language_prompts_for_user(final SubLObject user)
  {
    final SubLObject mt = $const1$InferencePSC;
    final SubLObject pairs = ask_utilities.ask_template( $list2, ConsesLow.listS( $const3$and, $list4, ConsesLow.listS( $const5$languageSpoken, user, $list6 ), $list7 ), mt, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject supported_prompts = NIL;
    SubLObject all_prompts = NIL;
    SubLObject cdolist_list_var = pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject language = NIL;
      SubLObject prompt_string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
      language = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
      prompt_string = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != backward.removal_ask( ConsesLow.list( $const9$languageAvailableForUIAInteractio, language ), mt, UNPROVIDED, UNPROVIDED ) )
        {
          supported_prompts = ConsesLow.cons( ConsesLow.list( language, prompt_string, $kw10$SUPPORTED ), supported_prompts );
        }
        else
        {
          all_prompts = ConsesLow.cons( pair, all_prompts );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return ConsesLow.append( supported_prompts, all_prompts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-user-modeler.lisp", position = 2077L)
  public static SubLObject rkf_user_modeler_language_prompt_language(final SubLObject language_prompt)
  {
    return language_prompt.first();
  }

  public static SubLObject declare_rkf_user_modeler_file()
  {
    SubLFiles.declareFunction( me, "rkf_user_modeler_supported_language_prompts_for_user", "RKF-USER-MODELER-SUPPORTED-LANGUAGE-PROMPTS-FOR-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_user_modeler_language_prompt_language", "RKF-USER-MODELER-LANGUAGE-PROMPT-LANGUAGE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_user_modeler_file()
  {
    $rkf_user_definition_mt$ = SubLFiles.deflexical( "*RKF-USER-DEFINITION-MT*", $const0$CyclistsMt );
    return NIL;
  }

  public static SubLObject setup_rkf_user_modeler_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_user_modeler_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_user_modeler_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_user_modeler_file();
  }
  static
  {
    me = new rkf_user_modeler();
    $rkf_user_definition_mt$ = null;
    $const0$CyclistsMt = constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) );
    $const1$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list2 = ConsesLow.list( makeSymbol( "?LANGUAGE" ), makeSymbol( "?PROMPT-STRING" ) );
    $const3$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list4 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "languagePostedOnUIA" ) ), makeSymbol( "?LANGUAGE" ) );
    $const5$languageSpoken = constant_handles.reader_make_constant_shell( makeString( "languageSpoken" ) );
    $list6 = ConsesLow.list( makeSymbol( "?LANGUAGE" ) );
    $list7 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "languagePromptForUIA" ) ), makeSymbol( "?LANGUAGE" ), makeSymbol( "?PROMPT-STRING" ) ) );
    $list8 = ConsesLow.list( makeSymbol( "LANGUAGE" ), makeSymbol( "PROMPT-STRING" ) );
    $const9$languageAvailableForUIAInteractio = constant_handles.reader_make_constant_shell( makeString( "languageAvailableForUIAInteractions" ) );
    $kw10$SUPPORTED = makeKeyword( "SUPPORTED" );
  }
}
/*
 * 
 * Total time: 72 ms
 * 
 */