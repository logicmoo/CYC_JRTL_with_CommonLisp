package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_macros";
  public static final String myFingerPrint = "78f3abfc327bfc08533df7d6e0a387867f39cdd51b08dd06f7920f33b1e1ccd8";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 865L)
  public static SubLSymbol $rkf_asserting_tool$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1156L)
  private static SubLSymbol $rkf_paraphrase_methods_to_skip$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1289L)
  public static SubLSymbol $rkf_speaker$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1335L)
  public static SubLSymbol $rkf_addressee$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2757L)
  public static SubLSymbol $rkf_always_generate_examplesP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2901L)
  public static SubLSymbol $rkf_ok_to_generate_examplesP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLSymbol $sym2$_RKF_ASSERTING_TOOL_;
  private static final SubLList $list3;
  private static final SubLObject $const4$Cyc;
  private static final SubLSymbol $kw5$THE_CYCLIST;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$RKF_SPEAKER;
  private static final SubLSymbol $sym8$WITH_RKF_PARAPHRASE_PARAMETERS;
  private static final SubLSymbol $sym9$RKF_ADDRESSEE;
  private static final SubLSymbol $kw10$NONE;
  private static final SubLSymbol $sym11$RKF_PARAPHRASE_METHODS_TO_SKIP;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$PROMPTER;
  private static final SubLSymbol $sym14$NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER;
  private static final SubLSymbol $sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT;
  private static final SubLSymbol $sym16$WHILE;
  private static final SubLSymbol $sym17$RKF_SALIENT_DESCRIPTOR_PROMPT_P;
  private static final SubLSymbol $sym18$CSETQ;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1014L)
  public static SubLObject rkf_with_asserting_tool_cycl(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tool_cycl = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    tool_cycl = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym2$_RKF_ASSERTING_TOOL_, tool_cycl ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1389L)
  public static SubLObject with_rkf_paraphrase_parameters(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list6, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1899L)
  public static SubLObject rkf_speaker()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $rkf_speaker$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2001L)
  public static SubLObject rkf_addressee()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = $rkf_addressee$.getDynamicValue( thread );
    if( pcase_var.eql( $kw10$NONE ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw5$THE_CYCLIST ) )
    {
      return operation_communication.the_cyclist();
    }
    return $rkf_addressee$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2208L)
  public static SubLObject rkf_paraphrase_methods_to_skip()
  {
    return $rkf_paraphrase_methods_to_skip$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2348L)
  public static SubLObject do_rkf_salient_descriptor_prompts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prompt = NIL;
    SubLObject seed_term = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    prompt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    seed_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject prompter = $sym13$PROMPTER;
      return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( prompter, ConsesLow.list( $sym14$NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER, seed_term, mt ) ), ConsesLow.list( prompt, ConsesLow.list(
          $sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter ) ) ), ConsesLow.listS( $sym16$WHILE, ConsesLow.list( $sym17$RKF_SALIENT_DESCRIPTOR_PROMPT_P, prompt ), ConsesLow.append( body, ConsesLow.list( ConsesLow
              .list( $sym18$CSETQ, prompt, ConsesLow.list( $sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 3029L)
  public static SubLObject rkf_generate_examplesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $rkf_always_generate_examplesP$.getDynamicValue( thread ) || NIL != $rkf_ok_to_generate_examplesP$.getDynamicValue( thread ) );
  }

  public static SubLObject declare_rkf_macros_file()
  {
    SubLFiles.declareMacro( me, "rkf_with_asserting_tool_cycl", "RKF-WITH-ASSERTING-TOOL-CYCL" );
    SubLFiles.declareMacro( me, "with_rkf_paraphrase_parameters", "WITH-RKF-PARAPHRASE-PARAMETERS" );
    SubLFiles.declareFunction( me, "rkf_speaker", "RKF-SPEAKER", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_addressee", "RKF-ADDRESSEE", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_paraphrase_methods_to_skip", "RKF-PARAPHRASE-METHODS-TO-SKIP", 0, 0, false );
    SubLFiles.declareMacro( me, "do_rkf_salient_descriptor_prompts", "DO-RKF-SALIENT-DESCRIPTOR-PROMPTS" );
    SubLFiles.declareFunction( me, "rkf_generate_examplesP", "RKF-GENERATE-EXAMPLES?", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_macros_file()
  {
    $rkf_asserting_tool$ = SubLFiles.defparameter( "*RKF-ASSERTING-TOOL*", NIL );
    $rkf_paraphrase_methods_to_skip$ = SubLFiles.defconstant( "*RKF-PARAPHRASE-METHODS-TO-SKIP*", $list3 );
    $rkf_speaker$ = SubLFiles.defparameter( "*RKF-SPEAKER*", $const4$Cyc );
    $rkf_addressee$ = SubLFiles.defparameter( "*RKF-ADDRESSEE*", $kw5$THE_CYCLIST );
    $rkf_always_generate_examplesP$ = SubLFiles.defparameter( "*RKF-ALWAYS-GENERATE-EXAMPLES?*", NIL );
    $rkf_ok_to_generate_examplesP$ = SubLFiles.defparameter( "*RKF-OK-TO-GENERATE-EXAMPLES?*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_macros_file()
  {
    access_macros.register_macro_helper( $sym7$RKF_SPEAKER, $sym8$WITH_RKF_PARAPHRASE_PARAMETERS );
    access_macros.register_macro_helper( $sym9$RKF_ADDRESSEE, $sym8$WITH_RKF_PARAPHRASE_PARAMETERS );
    access_macros.register_macro_helper( $sym11$RKF_PARAPHRASE_METHODS_TO_SKIP, $sym8$WITH_RKF_PARAPHRASE_PARAMETERS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_macros_file();
  }
  static
  {
    me = new rkf_macros();
    $rkf_asserting_tool$ = null;
    $rkf_paraphrase_methods_to_skip$ = null;
    $rkf_speaker$ = null;
    $rkf_addressee$ = null;
    $rkf_always_generate_examplesP$ = null;
    $rkf_ok_to_generate_examplesP$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "TOOL-CYCL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $sym2$_RKF_ASSERTING_TOOL_ = makeSymbol( "*RKF-ASSERTING-TOOL*" );
    $list3 = ConsesLow.list( makeSymbol( "GENITIVE-PARAPHRASE-METHOD" ) );
    $const4$Cyc = constant_handles.reader_make_constant_shell( makeString( "Cyc" ) );
    $kw5$THE_CYCLIST = makeKeyword( "THE-CYCLIST" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*" ) ) ), ConsesLow.list(
        makeSymbol( "*PPH-SEARCH-LIMIT*" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*" ), TWO_INTEGER, ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "*PPH-SPEAKER*" ),
            ConsesLow.list( makeSymbol( "RKF-SPEAKER" ) ) ), ConsesLow.list( makeSymbol( "*PPH-ADDRESSEE*" ), ConsesLow.list( makeSymbol( "RKF-ADDRESSEE" ) ) ), ConsesLow.list( makeSymbol(
                "*SELECT-STRING-METHODS-TO-OMIT*" ), ConsesLow.list( makeSymbol( "RKF-PARAPHRASE-METHODS-TO-SKIP" ) ) ), ConsesLow.list( makeSymbol( "*PPH-LINK-ARG0?*" ), T ) );
    $sym7$RKF_SPEAKER = makeSymbol( "RKF-SPEAKER" );
    $sym8$WITH_RKF_PARAPHRASE_PARAMETERS = makeSymbol( "WITH-RKF-PARAPHRASE-PARAMETERS" );
    $sym9$RKF_ADDRESSEE = makeSymbol( "RKF-ADDRESSEE" );
    $kw10$NONE = makeKeyword( "NONE" );
    $sym11$RKF_PARAPHRASE_METHODS_TO_SKIP = makeSymbol( "RKF-PARAPHRASE-METHODS-TO-SKIP" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROMPT" ), makeSymbol( "SEED-TERM" ), makeSymbol( "MT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym13$PROMPTER = makeUninternedSymbol( "PROMPTER" );
    $sym14$NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol( "NEW-RKF-SALIENT-DESCRIPTOR-PROMPTER" );
    $sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT" );
    $sym16$WHILE = makeSymbol( "WHILE" );
    $sym17$RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPT-P" );
    $sym18$CSETQ = makeSymbol( "CSETQ" );
  }
}
/*
 * 
 * Total time: 29 ms
 * 
 */