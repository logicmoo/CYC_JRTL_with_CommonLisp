package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_error
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_error";
  public static final String myFingerPrint = "16eb1103062a03c558dbb77732f8de27e56c51079829716e0ca9e03e441c4d25";
  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 763L)
  private static SubLSymbol $pph_min_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 811L)
  public static SubLSymbol $pph_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2093L)
  public static SubLSymbol $suspend_pph_sanity_checkingP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2254L)
  public static SubLSymbol $pph_break_on_errorP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2424L)
  public static SubLSymbol $pph_error_handling_onP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4373L)
  public static SubLSymbol $suspend_pph_type_checkingP$;
  private static final SubLSymbol $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$PWHEN;
  private static final SubLSymbol $sym4$FORCE_FORMAT;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$CLET;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$PIF;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$PROGN;
  private static final SubLSymbol $sym11$CATCH_ERROR_MESSAGE;
  private static final SubLSymbol $sym12$STRINGP;
  private static final SubLSymbol $sym13$PUNLESS;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$WARN;
  private static final SubLSymbol $sym16$CCONCATENATE;
  private static final SubLSymbol $sym17$TRUNCATE_PPH_ERROR_MESSAGE;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$NEW_FORMAT_STRING;
  private static final SubLSymbol $sym21$FORMAT_NIL;
  private static final SubLString $str22$_PPH_error_level__S___a;
  private static final SubLSymbol $sym23$PPH_HANDLE_ERROR;
  private static final SubLSymbol $sym24$LIST;
  private static final SubLSymbol $sym25$PPH_ERROR;
  private static final SubLSymbol $sym26$CERROR;
  private static final SubLString $str27$continue_anyway;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$PCASE_FEATURE;
  private static final SubLSymbol $kw31$CYC_MAINT;
  private static final SubLSymbol $sym32$COR;
  private static final SubLSymbol $sym33$_SUSPEND_PPH_TYPE_CHECKING__;
  private static final SubLString $str34$_S_is_not_a__S;
  private static final SubLSymbol $sym35$QUOTE;
  private static final SubLSymbol $sym36$LIST_OF_TYPE_P;
  private static final SubLString $str37$_S_is_not_a_list_of__S;
  private static final SubLSymbol $sym38$NULL;
  private static final SubLSymbol $sym39$PPH_CHECK_TYPE;

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 944L)
  public static SubLObject pph_trace(SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != level )
    {
      pph_set_trace_level( level );
    }
    else
    {
      pph_cinc_trace_level();
    }
    return $pph_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1094L)
  public static SubLObject pph_untrace()
  {
    return pph_set_trace_level( $pph_min_trace_level$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1178L)
  public static SubLObject pph_set_trace_level(final SubLObject level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !level.isInteger() )
    {
      return $pph_trace_level$.getDynamicValue( thread );
    }
    if( level.numL( $pph_min_trace_level$.getGlobalValue() ) )
    {
      $pph_trace_level$.setDynamicValue( $pph_min_trace_level$.getGlobalValue(), thread );
    }
    else
    {
      $pph_trace_level$.setDynamicValue( level, thread );
    }
    return $pph_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1441L)
  public static SubLObject pph_cinc_trace_level()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $pph_trace_level$.setDynamicValue( Numbers.add( $pph_trace_level$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return $pph_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1536L)
  public static SubLObject pph_trace_level_exceeds_minimumP(final SubLObject level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject recursion_depth = pph_vars.current_generation_level().isPositive() ? number_utilities.f_1_( pph_vars.current_generation_level() ) : ZERO_INTEGER;
    final SubLObject adjusted_trace_level = Numbers.subtract( $pph_trace_level$.getDynamicValue( thread ), recursion_depth );
    final SubLObject exceedsP = Numbers.numGE( adjusted_trace_level, level );
    return exceedsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1892L)
  public static SubLObject pph_note(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym3$PWHEN, ConsesLow.list( $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level ), ConsesLow.listS( $sym4$FORCE_FORMAT, T, format_str, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2152L)
  public static SubLObject pph_sanity_checking_suspendedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $suspend_pph_sanity_checkingP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2351L)
  public static SubLObject pph_break_on_errorP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $pph_break_on_errorP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2479L)
  public static SubLObject with_pph_error_handling(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject error_message = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    error_message = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym6$CLET, $list7, ConsesLow.list( $sym8$PIF, $list9, reader.bq_cons( $sym10$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym10$PROGN, ConsesLow.listS(
          $sym11$CATCH_ERROR_MESSAGE, ConsesLow.list( error_message ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym3$PWHEN, ConsesLow.list( $sym12$STRINGP, error_message ), ConsesLow.list( $sym13$PUNLESS,
              $list14, ConsesLow.listS( $sym15$WARN, ConsesLow.listS( $sym16$CCONCATENATE, ConsesLow.list( $sym17$TRUNCATE_PPH_ERROR_MESSAGE, error_message ), $list18 ), $list19 ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 3185L)
  public static SubLObject pph_error(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject new_format_string = $sym20$NEW_FORMAT_STRING;
    return ConsesLow.list( $sym6$CLET, ConsesLow.list( ConsesLow.list( new_format_string, ConsesLow.list( $sym21$FORMAT_NIL, $str22$_PPH_error_level__S___a, level, format_str ) ) ), ConsesLow.list(
        $sym23$PPH_HANDLE_ERROR, new_format_string, reader.bq_cons( $sym24$LIST, ConsesLow.append( args, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 3473L)
  public static SubLObject pph_handle_error(final SubLObject format_string, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $pph_error_handling_onP$.getDynamicValue( thread ) )
    {
      Functions.apply( $sym26$CERROR, ConsesLow.listS( $str27$continue_anyway, format_string, args ) );
    }
    else if( NIL == suppress_pph_warningsP() )
    {
      Functions.apply( $sym15$WARN, reader.bq_cons( format_string, args ) );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    return $pph_error_handling_onP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4008L)
  public static SubLObject suppress_pph_warningsP()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4128L)
  public static SubLObject pph_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym3$PWHEN, ConsesLow.list( $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level ), ConsesLow.listS( $sym13$PUNLESS, $list14, ConsesLow.listS( $sym15$WARN, format_str, ConsesLow.append( args,
        NIL ) ), $list28 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4430L)
  public static SubLObject pph_check_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym30$PCASE_FEATURE, ConsesLow.list( $kw31$CYC_MAINT, ConsesLow.list( $sym13$PUNLESS, ConsesLow.list( $sym32$COR, $sym33$_SUSPEND_PPH_TYPE_CHECKING__, ConsesLow.list( pred, v_object ) ),
          ConsesLow.list( $sym25$PPH_ERROR, ONE_INTEGER, ConsesLow.list( $sym21$FORMAT_NIL, $str34$_S_is_not_a__S, v_object, ConsesLow.list( $sym35$QUOTE, pred ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4652L)
  public static SubLObject pph_check_list_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym30$PCASE_FEATURE, ConsesLow.list( $kw31$CYC_MAINT, ConsesLow.list( $sym13$PUNLESS, ConsesLow.list( $sym32$COR, $sym33$_SUSPEND_PPH_TYPE_CHECKING__, ConsesLow.list( $sym36$LIST_OF_TYPE_P,
          ConsesLow.list( $sym35$QUOTE, pred ), v_object ) ), ConsesLow.list( $sym25$PPH_ERROR, ONE_INTEGER, ConsesLow.list( $sym21$FORMAT_NIL, $str37$_S_is_not_a_list_of__S, v_object, ConsesLow.list( $sym35$QUOTE,
              pred ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4903L)
  public static SubLObject pph_check_type_if_non_null(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym30$PCASE_FEATURE, ConsesLow.list( $kw31$CYC_MAINT, ConsesLow.list( $sym13$PUNLESS, ConsesLow.list( $sym38$NULL, v_object ), ConsesLow.list( $sym39$PPH_CHECK_TYPE, v_object, pred ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    return NIL;
  }

  public static SubLObject declare_pph_error_file()
  {
    SubLFiles.declareFunction( me, "pph_trace", "PPH-TRACE", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_untrace", "PPH-UNTRACE", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_set_trace_level", "PPH-SET-TRACE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_cinc_trace_level", "PPH-CINC-TRACE-LEVEL", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_trace_level_exceeds_minimumP", "PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?", 1, 0, false );
    SubLFiles.declareMacro( me, "pph_note", "PPH-NOTE" );
    SubLFiles.declareFunction( me, "pph_sanity_checking_suspendedP", "PPH-SANITY-CHECKING-SUSPENDED?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_break_on_errorP", "PPH-BREAK-ON-ERROR?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_pph_error_handling", "WITH-PPH-ERROR-HANDLING" );
    SubLFiles.declareMacro( me, "pph_error", "PPH-ERROR" );
    SubLFiles.declareFunction( me, "pph_handle_error", "PPH-HANDLE-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "suppress_pph_warningsP", "SUPPRESS-PPH-WARNINGS?", 0, 0, false );
    SubLFiles.declareMacro( me, "pph_warn", "PPH-WARN" );
    SubLFiles.declareMacro( me, "pph_check_type", "PPH-CHECK-TYPE" );
    SubLFiles.declareMacro( me, "pph_check_list_type", "PPH-CHECK-LIST-TYPE" );
    SubLFiles.declareMacro( me, "pph_check_type_if_non_null", "PPH-CHECK-TYPE-IF-NON-NULL" );
    return NIL;
  }

  public static SubLObject init_pph_error_file()
  {
    $pph_min_trace_level$ = SubLFiles.defconstant( "*PPH-MIN-TRACE-LEVEL*", ZERO_INTEGER );
    $pph_trace_level$ = SubLFiles.defparameter( "*PPH-TRACE-LEVEL*", $pph_min_trace_level$.getGlobalValue() );
    $suspend_pph_sanity_checkingP$ = SubLFiles.defparameter( "*SUSPEND-PPH-SANITY-CHECKING?*", T );
    $pph_break_on_errorP$ = SubLFiles.defparameter( "*PPH-BREAK-ON-ERROR?*", NIL );
    $pph_error_handling_onP$ = SubLFiles.defparameter( "*PPH-ERROR-HANDLING-ON?*", NIL );
    $suspend_pph_type_checkingP$ = SubLFiles.defparameter( "*SUSPEND-PPH-TYPE-CHECKING?*", T );
    return NIL;
  }

  public static SubLObject setup_pph_error_file()
  {
    access_macros.register_macro_helper( $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, $list1 );
    access_macros.register_macro_helper( $sym23$PPH_HANDLE_ERROR, $sym25$PPH_ERROR );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_error_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_error_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_error_file();
  }
  static
  {
    me = new pph_error();
    $pph_min_trace_level$ = null;
    $pph_trace_level$ = null;
    $suspend_pph_sanity_checkingP$ = null;
    $pph_break_on_errorP$ = null;
    $pph_error_handling_onP$ = null;
    $suspend_pph_type_checkingP$ = null;
    $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_ = makeSymbol( "PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?" );
    $list1 = ConsesLow.list( makeSymbol( "PPH-NOTE" ), makeSymbol( "PPH-WARN" ), makeSymbol( "PPH-ERROR" ) );
    $list2 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym3$PWHEN = makeSymbol( "PWHEN" );
    $sym4$FORCE_FORMAT = makeSymbol( "FORCE-FORMAT" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR-MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$CLET = makeSymbol( "CLET" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONTINUE-CERROR?*" ), NIL ), ConsesLow.list( makeSymbol( "*PPH-ERROR-HANDLING-ON?*" ), T ) );
    $sym8$PIF = makeSymbol( "PIF" );
    $list9 = ConsesLow.list( makeSymbol( "PPH-BREAK-ON-ERROR?" ) );
    $sym10$PROGN = makeSymbol( "PROGN" );
    $sym11$CATCH_ERROR_MESSAGE = makeSymbol( "CATCH-ERROR-MESSAGE" );
    $sym12$STRINGP = makeSymbol( "STRINGP" );
    $sym13$PUNLESS = makeSymbol( "PUNLESS" );
    $list14 = ConsesLow.list( makeSymbol( "SUPPRESS-PPH-WARNINGS?" ) );
    $sym15$WARN = makeSymbol( "WARN" );
    $sym16$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym17$TRUNCATE_PPH_ERROR_MESSAGE = makeSymbol( "TRUNCATE-PPH-ERROR-MESSAGE" );
    $list18 = ConsesLow.list( makeString( "~% Top-level CycL: ~S" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-TOP-LEVEL-CYCL" ) ) );
    $sym20$NEW_FORMAT_STRING = makeUninternedSymbol( "NEW-FORMAT-STRING" );
    $sym21$FORMAT_NIL = makeSymbol( "FORMAT-NIL" );
    $str22$_PPH_error_level__S___a = makeString( "(PPH error level ~S) ~a" );
    $sym23$PPH_HANDLE_ERROR = makeSymbol( "PPH-HANDLE-ERROR" );
    $sym24$LIST = makeSymbol( "LIST" );
    $sym25$PPH_ERROR = makeSymbol( "PPH-ERROR" );
    $sym26$CERROR = makeSymbol( "CERROR" );
    $str27$continue_anyway = makeString( "continue anyway" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "*ERROR-OUTPUT*" ) ) );
    $list29 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "PRED" ) );
    $sym30$PCASE_FEATURE = makeSymbol( "PCASE-FEATURE" );
    $kw31$CYC_MAINT = makeKeyword( "CYC-MAINT" );
    $sym32$COR = makeSymbol( "COR" );
    $sym33$_SUSPEND_PPH_TYPE_CHECKING__ = makeSymbol( "*SUSPEND-PPH-TYPE-CHECKING?*" );
    $str34$_S_is_not_a__S = makeString( "~S is not a ~S" );
    $sym35$QUOTE = makeSymbol( "QUOTE" );
    $sym36$LIST_OF_TYPE_P = makeSymbol( "LIST-OF-TYPE-P" );
    $str37$_S_is_not_a_list_of__S = makeString( "~S is not a list of ~S" );
    $sym38$NULL = makeSymbol( "NULL" );
    $sym39$PPH_CHECK_TYPE = makeSymbol( "PPH-CHECK-TYPE" );
  }
}
/*
 * 
 * Total time: 103 ms
 * 
 */