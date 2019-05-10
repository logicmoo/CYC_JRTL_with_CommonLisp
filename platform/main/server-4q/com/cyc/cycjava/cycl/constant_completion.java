package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_completion
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constant_completion";
  public static final String myFingerPrint = "343128ffb056501532eaf0603c93caaa87c35b6ed0609776269ce07df9232973";
  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 636L)
  private static SubLSymbol $constant_names_in_code$;
  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1121L)
  private static SubLSymbol $bogus_constant_names_in_code$;
  private static final SubLSymbol $sym0$_CONSTANT_NAMES_IN_CODE_;
  private static final SubLSymbol $sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_;
  private static final SubLSymbol $sym2$FIND_CONSTANT;
  private static final SubLSymbol $sym3$STRING_;
  private static final SubLString $str4$Computing_bogus_constant_names_in;
  private static final SubLString $str5$The_following__A_constants_are_me;
  private static final SubLString $str6$__A__;
  private static final SubLString $str7$__;
  private static final SubLString $str8$All_constants_mentioned_in_code_a;

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1175L)
  public static SubLObject constants_mentioned_in_code()
  {
    return Sequences.delete( NIL, Mapping.mapcar( Symbols.symbol_function( $sym2$FIND_CONSTANT ), $constant_names_in_code$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1297L)
  public static SubLObject constant_mentioned_in_codeP(final SubLObject constant)
  {
    return makeBoolean( NIL != constant_handles.constant_p( constant ) && NIL != conses_high.member( constants_high.constant_name( constant ), $constant_names_in_code$.getGlobalValue(), Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1466L)
  public static SubLObject bogus_constants_mentioned_in_code()
  {
    return Sequences.delete( NIL, Mapping.mapcar( Symbols.symbol_function( $sym2$FIND_CONSTANT ), $bogus_constant_names_in_code$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1600L)
  public static SubLObject initialize_constant_names_in_code()
  {
    if( ZERO_INTEGER.numE( constant_handles.constant_count() ) )
    {
      $constant_names_in_code$.setGlobalValue( NIL );
      SubLObject cdolist_list_var = constant_handles.invalid_constant_names();
      SubLObject invalid_constant_name = NIL;
      invalid_constant_name = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        $constant_names_in_code$.setGlobalValue( ConsesLow.cons( invalid_constant_name, $constant_names_in_code$.getGlobalValue() ) );
        cdolist_list_var = cdolist_list_var.rest();
        invalid_constant_name = cdolist_list_var.first();
      }
      $constant_names_in_code$.setGlobalValue( Sort.sort( $constant_names_in_code$.getGlobalValue(), Symbols.symbol_function( $sym3$STRING_ ), UNPROVIDED ) );
    }
    return Sequences.length( $constant_names_in_code$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 2143L)
  public static SubLObject compute_bogus_constant_names_in_code()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $constant_names_in_code$.getGlobalValue() )
    {
      final SubLObject str = $str4$Computing_bogus_constant_names_in;
      final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
        $bogus_constant_names_in_code$.setGlobalValue( NIL );
        SubLObject cdolist_list_var = $constant_names_in_code$.getGlobalValue();
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject constant = constants_high.find_constant( name );
          if( NIL != constants_high.uninstalled_constant_p( constant ) )
          {
            $bogus_constant_names_in_code$.setGlobalValue( ConsesLow.cons( name, $bogus_constant_names_in_code$.getGlobalValue() ) );
          }
          cdolist_list_var = cdolist_list_var.rest();
          name = cdolist_list_var.first();
        }
        $bogus_constant_names_in_code$.setGlobalValue( Sort.sort( $bogus_constant_names_in_code$.getGlobalValue(), Symbols.symbol_function( $sym3$STRING_ ), UNPROVIDED ) );
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
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
      }
    }
    return Sequences.length( $bogus_constant_names_in_code$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 2680L)
  public static SubLObject report_constant_names_in_code_but_not_kb()
  {
    final SubLObject constant_names = constant_names_in_code_but_not_kb();
    if( NIL != constant_names )
    {
      PrintLow.format( T, $str5$The_following__A_constants_are_me, Sequences.length( constant_names ) );
      SubLObject cdolist_list_var = constant_names;
      SubLObject constant_name = NIL;
      constant_name = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( T, $str6$__A__, constant_name );
        cdolist_list_var = cdolist_list_var.rest();
        constant_name = cdolist_list_var.first();
      }
      PrintLow.format( T, $str7$__ );
    }
    else
    {
      PrintLow.format( T, $str8$All_constants_mentioned_in_code_a );
    }
    streams_high.force_output( T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 3176L)
  public static SubLObject constant_names_in_code_but_not_kb()
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = constant_handles.invalid_constant_names();
    SubLObject name = NIL;
    name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( name.isString() )
      {
        final SubLObject constant = constants_high.find_constant( name );
        if( NIL == constant || NIL != constants_high.uninstalled_constant_p( constant ) )
        {
          result = ConsesLow.cons( name, result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      name = cdolist_list_var.first();
    }
    result = Sort.sort( result, Symbols.symbol_function( $sym3$STRING_ ), UNPROVIDED );
    return result;
  }

  public static SubLObject declare_constant_completion_file()
  {
    SubLFiles.declareFunction( me, "constants_mentioned_in_code", "CONSTANTS-MENTIONED-IN-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "constant_mentioned_in_codeP", "CONSTANT-MENTIONED-IN-CODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "bogus_constants_mentioned_in_code", "BOGUS-CONSTANTS-MENTIONED-IN-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_constant_names_in_code", "INITIALIZE-CONSTANT-NAMES-IN-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_bogus_constant_names_in_code", "COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "report_constant_names_in_code_but_not_kb", "REPORT-CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "constant_names_in_code_but_not_kb", "CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_constant_completion_file()
  {
    $constant_names_in_code$ = SubLFiles.deflexical( "*CONSTANT-NAMES-IN-CODE*", ( maybeDefault( $sym0$_CONSTANT_NAMES_IN_CODE_, $constant_names_in_code$, NIL ) ) );
    $bogus_constant_names_in_code$ = SubLFiles.deflexical( "*BOGUS-CONSTANT-NAMES-IN-CODE*", ( maybeDefault( $sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_, $bogus_constant_names_in_code$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_constant_completion_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_CONSTANT_NAMES_IN_CODE_ );
    subl_macro_promotions.declare_defglobal( $sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constant_completion_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constant_completion_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constant_completion_file();
  }
  static
  {
    me = new constant_completion();
    $constant_names_in_code$ = null;
    $bogus_constant_names_in_code$ = null;
    $sym0$_CONSTANT_NAMES_IN_CODE_ = makeSymbol( "*CONSTANT-NAMES-IN-CODE*" );
    $sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_ = makeSymbol( "*BOGUS-CONSTANT-NAMES-IN-CODE*" );
    $sym2$FIND_CONSTANT = makeSymbol( "FIND-CONSTANT" );
    $sym3$STRING_ = makeSymbol( "STRING<" );
    $str4$Computing_bogus_constant_names_in = makeString( "Computing bogus constant names in code..." );
    $str5$The_following__A_constants_are_me = makeString( "The following ~A constants are mentioned in code but missing in the KB:~%" );
    $str6$__A__ = makeString( " ~A~%" );
    $str7$__ = makeString( "~%" );
    $str8$All_constants_mentioned_in_code_a = makeString( "All constants mentioned in code are good in the KB.~%" );
  }
}
/*
 * 
 * Total time: 37 ms
 * 
 */