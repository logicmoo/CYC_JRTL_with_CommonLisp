package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class conflicts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.conflicts";
  public static final String myFingerPrint = "8d6e4a134aa340adec83243ae8e7e09aa85beb01e4380cab6875213bfe95aaf5";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 389L)
  private static SubLSymbol $inconsistent_support_sets$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 975L)
  public static SubLSymbol $current_conflicts$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1145L)
  public static SubLSymbol $mt_conflicts$;
  private static final SubLSymbol $sym0$CONSP;
  private static final SubLSymbol $sym1$_CURRENT_CONFLICTS_;
  private static final SubLSymbol $sym2$_MT_CONFLICTS_;
  private static final SubLSymbol $kw3$OUTPUT;
  private static final SubLString $str4$Unable_to_open__S;
  private static final SubLString $str5$_______Mode__LISP__Package__CYC__;
  private static final SubLString $str6$____;
  private static final SubLString $str7$______A;
  private static final SubLString $str8$_____SBHL_Utilities_conflicts_for;
  private static final SubLString $str9$_____This_file_is_automatically_g;
  private static final SubLString $str10$_____See_CONFLICTS_LISP_for_detai;
  private static final SubLString $str11$_________________________________;
  private static final SubLString $str12$___S;
  private static final SubLString $str13$Aborting_due_to_conflict____S;
  private static final SubLSymbol $kw14$CONFLICT;
  private static final SubLString $str15$deduction_conflict___s__a__a;
  private static final SubLSymbol $kw16$INVALID_LITERAL;
  private static final SubLString $str17$_S_is_semantically_invalid_in__S;
  private static final SubLSymbol $kw18$IGNORE;
  private static final SubLSymbol $kw19$HALT;
  private static final SubLSymbol $kw20$DEBUG;
  private static final SubLString $str21$leave_the_kb_inconsistent_for_now;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$WITH_ERROR_HANDLER;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$CLET;
  private static final SubLList $list26;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 657L)
  public static SubLObject inconsistent_support_sets()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $inconsistent_support_sets$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 732L)
  public static SubLObject clear_inconsistent_support_sets()
  {
    $inconsistent_support_sets$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 831L)
  public static SubLObject add_inconsistent_support_set(final SubLObject supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.consp( supports ) : supports;
    $inconsistent_support_sets$.setDynamicValue( ConsesLow.cons( supports, $inconsistent_support_sets$.getDynamicValue( thread ) ), thread );
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1186L)
  public static SubLObject write_current_conflicts(final SubLObject output_filename)
  {
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( output_filename, $kw3$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str4$Unable_to_open__S, output_filename );
      }
      final SubLObject s = stream;
      PrintLow.format( s, $str5$_______Mode__LISP__Package__CYC__ );
      PrintLow.format( s, $str6$____ );
      PrintLow.format( s, $str7$______A, misc_utilities.copyright_notice() );
      PrintLow.format( s, $str6$____ );
      PrintLow.format( s, $str7$______A, output_filename );
      PrintLow.format( s, $str7$______A, numeric_date_utilities.timestring( UNPROVIDED ) );
      PrintLow.format( s, $str6$____ );
      PrintLow.format( s, $str8$_____SBHL_Utilities_conflicts_for, new SubLObject[] { system_info.cyc_revision_string(), control_vars.kb_loaded(), operation_communication.kb_op_number()
      } );
      PrintLow.format( s, $str6$____ );
      PrintLow.format( s, $str9$_____This_file_is_automatically_g );
      PrintLow.format( s, $str10$_____See_CONFLICTS_LISP_for_detai );
      PrintLow.format( s, $str11$_________________________________ );
      SubLObject cdolist_list_var = $current_conflicts$.getGlobalValue();
      SubLObject conflict = NIL;
      conflict = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( s, $str12$___S, conflict );
        cdolist_list_var = cdolist_list_var.rest();
        conflict = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2047L)
  public static SubLObject conflict_abort()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$inference_debugP$.getDynamicValue( thread ) )
    {
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( NIL, thread );
        try
        {
          Errors.error( $str13$Aborting_due_to_conflict____S, inconsistent_support_sets() );
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
    Dynamic.sublisp_throw( $kw14$CONFLICT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2440L)
  public static SubLObject conflict_handler()
  {
    conflict_abort();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2508L)
  public static SubLObject handle_invalid_deduction_conflict(final SubLObject gaf, final SubLObject truth, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$conflicts_from_invalid_deductions$.getDynamicValue( thread ) )
    {
      if( NIL == control_vars.$ignore_conflictsP$.getDynamicValue( thread ) && NIL == control_vars.$suppress_conflict_noticesP$.getDynamicValue( thread ) && ( NIL == control_vars.$ignore_non_definitional_conflictsP$
          .getDynamicValue( thread ) || NIL == non_definitional_asentP( gaf ) ) )
      {
        Errors.warn( $str15$deduction_conflict___s__a__a, gaf, truth, mt );
        conflict_notify( $str15$deduction_conflict___s__a__a, gaf, truth, mt, UNPROVIDED );
      }
    }
    else
    {
      backward_results.note_inference_rejected( ConsesLow.list( $kw16$INVALID_LITERAL, $str17$_S_is_semantically_invalid_in__S, gaf, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3097L)
  public static SubLObject conflict_notify(final SubLObject format_string, final SubLObject gaf, final SubLObject truth, final SubLObject mt, SubLObject aux)
  {
    if( aux == UNPROVIDED )
    {
      aux = NIL;
    }
    if( NIL != agenda.within_agenda() )
    {
      final SubLObject pcase_var = agenda.agenda_error_mode();
      if( pcase_var.eql( $kw18$IGNORE ) )
      {
        Errors.warn( format_string, new SubLObject[] { gaf, truth, mt, aux
        } );
      }
      else if( pcase_var.eql( $kw19$HALT ) )
      {
        Errors.error( format_string, new SubLObject[] { gaf, truth, mt, aux
        } );
      }
      else if( pcase_var.eql( $kw20$DEBUG ) )
      {
        conflict_notify_int( format_string, gaf, truth, mt, aux );
      }
    }
    else
    {
      conflict_notify_int( format_string, gaf, truth, mt, aux );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3548L)
  public static SubLObject conflict_notify_int(final SubLObject format_string, final SubLObject gaf, final SubLObject truth, final SubLObject mt, final SubLObject aux)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$conflicts_from_invalid_deductions$.getDynamicValue( thread ) )
    {
      conflict_abort();
      return NIL;
    }
    return Errors.cerror( $str21$leave_the_kb_inconsistent_for_now, format_string, new SubLObject[] { gaf, truth, mt, aux
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3813L)
  public static SubLObject non_definitional_asentP(final SubLObject asent)
  {
    return makeBoolean( NIL == el_utilities.el_formula_with_any_of_operators_p( asent, $list22 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3938L)
  public static SubLObject with_conflicts_from_invalid_deductions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym23$WITH_ERROR_HANDLER, $list24, ConsesLow.listS( $sym25$CLET, $list26, ConsesLow.append( body, NIL ) ) );
  }

  public static SubLObject declare_conflicts_file()
  {
    SubLFiles.declareFunction( me, "inconsistent_support_sets", "INCONSISTENT-SUPPORT-SETS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_inconsistent_support_sets", "CLEAR-INCONSISTENT-SUPPORT-SETS", 0, 0, false );
    SubLFiles.declareFunction( me, "add_inconsistent_support_set", "ADD-INCONSISTENT-SUPPORT-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "write_current_conflicts", "WRITE-CURRENT-CONFLICTS", 1, 0, false );
    SubLFiles.declareFunction( me, "conflict_abort", "CONFLICT-ABORT", 0, 0, false );
    SubLFiles.declareFunction( me, "conflict_handler", "CONFLICT-HANDLER", 0, 0, false );
    SubLFiles.declareFunction( me, "handle_invalid_deduction_conflict", "HANDLE-INVALID-DEDUCTION-CONFLICT", 3, 0, false );
    SubLFiles.declareFunction( me, "conflict_notify", "CONFLICT-NOTIFY", 4, 1, false );
    SubLFiles.declareFunction( me, "conflict_notify_int", "CONFLICT-NOTIFY-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "non_definitional_asentP", "NON-DEFINITIONAL-ASENT?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_conflicts_from_invalid_deductions", "WITH-CONFLICTS-FROM-INVALID-DEDUCTIONS" );
    return NIL;
  }

  public static SubLObject init_conflicts_file()
  {
    $inconsistent_support_sets$ = SubLFiles.defparameter( "*INCONSISTENT-SUPPORT-SETS*", NIL );
    $current_conflicts$ = SubLFiles.deflexical( "*CURRENT-CONFLICTS*", ( maybeDefault( $sym1$_CURRENT_CONFLICTS_, $current_conflicts$, NIL ) ) );
    $mt_conflicts$ = SubLFiles.deflexical( "*MT-CONFLICTS*", ( maybeDefault( $sym2$_MT_CONFLICTS_, $mt_conflicts$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_conflicts_file()
  {
    subl_macro_promotions.declare_defglobal( $sym1$_CURRENT_CONFLICTS_ );
    subl_macro_promotions.declare_defglobal( $sym2$_MT_CONFLICTS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_conflicts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_conflicts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_conflicts_file();
  }
  static
  {
    me = new conflicts();
    $inconsistent_support_sets$ = null;
    $current_conflicts$ = null;
    $mt_conflicts$ = null;
    $sym0$CONSP = makeSymbol( "CONSP" );
    $sym1$_CURRENT_CONFLICTS_ = makeSymbol( "*CURRENT-CONFLICTS*" );
    $sym2$_MT_CONFLICTS_ = makeSymbol( "*MT-CONFLICTS*" );
    $kw3$OUTPUT = makeKeyword( "OUTPUT" );
    $str4$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str5$_______Mode__LISP__Package__CYC__ = makeString( ";; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-" );
    $str6$____ = makeString( "~%;;" );
    $str7$______A = makeString( "~%;; ~A" );
    $str8$_____SBHL_Utilities_conflicts_for = makeString( "~%;; SBHL Utilities conflicts for CycL version ~A from KB ~S.~S" );
    $str9$_____This_file_is_automatically_g = makeString( "~%;; This file is automatically generated at dump time!" );
    $str10$_____See_CONFLICTS_LISP_for_detai = makeString( "~%;; See CONFLICTS.LISP for details." );
    $str11$_________________________________ = makeString( "~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" );
    $str12$___S = makeString( "~%~S" );
    $str13$Aborting_due_to_conflict____S = makeString( "Aborting due to conflict:~%~S" );
    $kw14$CONFLICT = makeKeyword( "CONFLICT" );
    $str15$deduction_conflict___s__a__a = makeString( "deduction conflict: ~s ~a ~a" );
    $kw16$INVALID_LITERAL = makeKeyword( "INVALID-LITERAL" );
    $str17$_S_is_semantically_invalid_in__S = makeString( "~S is semantically invalid in ~S" );
    $kw18$IGNORE = makeKeyword( "IGNORE" );
    $kw19$HALT = makeKeyword( "HALT" );
    $kw20$DEBUG = makeKeyword( "DEBUG" );
    $str21$leave_the_kb_inconsistent_for_now = makeString( "leave the kb inconsistent for now and resolve the conflict later" );
    $list22 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $sym23$WITH_ERROR_HANDLER = makeSymbol( "WITH-ERROR-HANDLER" );
    $list24 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CONFLICT-HANDLER" ) );
    $sym25$CLET = makeSymbol( "CLET" );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONFLICTS-FROM-INVALID-DEDUCTIONS*" ), T ), ConsesLow.list( makeSymbol( "*IGNORE-WARNS?*" ), T ), ConsesLow.list( makeSymbol(
        "*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*" ), NIL ), ConsesLow.list( makeSymbol( "*RECORD-INCONSISTENT-SUPPORT-SETS*" ), T ) );
  }
}
/*
 * 
 * Total time: 128 ms
 * 
 */