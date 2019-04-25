package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shallow_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shallow_parser";
  public static final String myFingerPrint = "a67cb851272e4a2a8c6ce91f0e0f4f92092f72d26693b092c9c3052536965054";
  private static final SubLSymbol $sym0$SHALLOW_PARSER;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$TIME;
  private static final SubLSymbol $sym4$ERROR_HANDLING;
  private static final SubLSymbol $sym5$INSTANCE_COUNT;
  private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS;
  private static final SubLSymbol $sym7$ISOLATED_P;
  private static final SubLSymbol $sym8$INSTANCE_NUMBER;
  private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE;
  private static final SubLSymbol $sym10$INITIALIZE;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD;
  private static final SubLSymbol $kw14$THROW;
  private static final SubLSymbol $sym15$SHALLOW_PARSER_INITIALIZE_METHOD;
  private static final SubLList $list16;
  private static final SubLString $str17$Invalid_error_handling_tag__a;
  private static final SubLString $str18$Invalid_timeout__a;
  private static final SubLFloat $float19$3_4028232e37;
  private static final SubLSymbol $sym20$PARSE;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD;
  private static final SubLSymbol $sym25$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str26$Shallow_Parser_timed_out_after__a;
  private static final SubLSymbol $sym27$NEW_PARSE_TREE;
  private static final SubLSymbol $sym28$SHALLOW_PARSER_PARSE_METHOD;
  private static final SubLSymbol $sym29$HANDLE_ERROR;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD;
  private static final SubLSymbol $kw34$WARN;
  private static final SubLSymbol $sym35$SHALLOW_PARSER_HANDLE_ERROR_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
  public static SubLObject get_shallow_parser_time(final SubLObject v_shallow_parser)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shallow_parser, TWO_INTEGER, $sym3$TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
  public static SubLObject set_shallow_parser_time(final SubLObject v_shallow_parser, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shallow_parser, value, TWO_INTEGER, $sym3$TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
  public static SubLObject get_shallow_parser_error_handling(final SubLObject v_shallow_parser)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shallow_parser, ONE_INTEGER, $sym4$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
  public static SubLObject set_shallow_parser_error_handling(final SubLObject v_shallow_parser, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shallow_parser, value, ONE_INTEGER, $sym4$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
  public static SubLObject subloop_reserved_initialize_shallow_parser_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
  public static SubLObject subloop_reserved_initialize_shallow_parser_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SHALLOW_PARSER, $sym4$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SHALLOW_PARSER, $sym3$TIME, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
  public static SubLObject shallow_parser_p(final SubLObject v_shallow_parser)
  {
    return classes.subloop_instanceof_class( v_shallow_parser, $sym0$SHALLOW_PARSER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 1143L)
  public static SubLObject shallow_parser_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shallow_parser_method = NIL;
    SubLObject time = get_shallow_parser_time( self );
    SubLObject error_handling = get_shallow_parser_error_handling( self );
    try
    {
      thread.throwStack.push( $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD );
      try
      {
        object.object_initialize_method( self );
        error_handling = $kw14$THROW;
        time = FIVE_INTEGER;
        Dynamic.sublisp_throw( $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shallow_parser_time( self, time );
          set_shallow_parser_error_handling( self, error_handling );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shallow_parser_method = Errors.handleThrowable( ccatch_env_var, $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shallow_parser_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 1291L)
  public static SubLObject new_shallow_parser(SubLObject error_handling, SubLObject timeout)
  {
    if( error_handling == UNPROVIDED )
    {
      error_handling = $kw14$THROW;
    }
    if( timeout == UNPROVIDED )
    {
      timeout = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( error_handling, $list16, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str17$Invalid_error_handling_tag__a, error_handling );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.non_negative_integer_p( timeout ) && NIL != timeout )
    {
      Errors.error( $str18$Invalid_timeout__a, timeout );
    }
    final SubLObject v_parser = object.new_class_instance( $sym0$SHALLOW_PARSER );
    set_shallow_parser_error_handling( v_parser, error_handling );
    if( NIL == timeout )
    {
      set_shallow_parser_time( v_parser, $float19$3_4028232e37 );
    }
    else
    {
      set_shallow_parser_time( v_parser, timeout );
    }
    return v_parser;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 2056L)
  public static SubLObject shallow_parser_parse_method(final SubLObject self, final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shallow_parser_method = NIL;
    final SubLObject time = get_shallow_parser_time( self );
    try
    {
      thread.throwStack.push( $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD );
      try
      {
        SubLObject parses = NIL;
        SubLObject error = NIL;
        SubLObject timeoutP = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym25$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
              try
              {
                thread.throwStack.push( tag );
                final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                  SubLObject timer = NIL;
                  try
                  {
                    final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                    try
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                      timer = subl_macro_promotions.with_timeout_start_timer( time, tag );
                      parses = external_interfaces.shallow_parse( text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$2, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      subl_macro_promotions.with_timeout_stop_timer( timer );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                    }
                  }
                }
                finally
                {
                  subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$1, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                timeoutP = Errors.handleThrowable( ccatch_env_var, tag );
              }
              finally
              {
                thread.throwStack.pop();
              }
              if( NIL != timeoutP )
              {
                Errors.error( $str26$Shallow_Parser_timed_out_after__a, time );
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
        catch( final Throwable ccatch_env_var2 )
        {
          error = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error )
        {
          shallow_parser_handle_error_method( self, error );
        }
        Dynamic.sublisp_throw( $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, Mapping.mapcar( $sym27$NEW_PARSE_TREE, parses ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_shallow_parser_time( self, time );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var3 )
    {
      catch_var_for_shallow_parser_method = Errors.handleThrowable( ccatch_env_var3, $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shallow_parser_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 2554L)
  public static SubLObject shallow_parser_handle_error_method(final SubLObject self, final SubLObject error)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shallow_parser_method = NIL;
    final SubLObject error_handling = get_shallow_parser_error_handling( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD );
      try
      {
        final SubLObject pcase_var = error_handling;
        if( pcase_var.eql( $kw14$THROW ) )
        {
          Errors.error( error );
        }
        else if( pcase_var.eql( $kw34$WARN ) )
        {
          Errors.warn( error );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shallow_parser_error_handling( self, error_handling );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shallow_parser_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shallow_parser_method;
  }

  public static SubLObject declare_shallow_parser_file()
  {
    SubLFiles.declareFunction( me, "get_shallow_parser_time", "GET-SHALLOW-PARSER-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shallow_parser_time", "SET-SHALLOW-PARSER-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shallow_parser_error_handling", "GET-SHALLOW-PARSER-ERROR-HANDLING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shallow_parser_error_handling", "SET-SHALLOW-PARSER-ERROR-HANDLING", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shallow_parser_class", "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shallow_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shallow_parser_p", "SHALLOW-PARSER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shallow_parser_initialize_method", "SHALLOW-PARSER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_shallow_parser", "NEW-SHALLOW-PARSER", 0, 2, false );
    SubLFiles.declareFunction( me, "shallow_parser_parse_method", "SHALLOW-PARSER-PARSE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shallow_parser_handle_error_method", "SHALLOW-PARSER-HANDLE-ERROR-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_shallow_parser_file()
  {
    return NIL;
  }

  public static SubLObject setup_shallow_parser_file()
  {
    classes.subloop_new_class( $sym0$SHALLOW_PARSER, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$SHALLOW_PARSER, NIL );
    classes.subloop_note_class_initialization_function( $sym0$SHALLOW_PARSER, $sym6$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$SHALLOW_PARSER, $sym9$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE );
    subloop_reserved_initialize_shallow_parser_class( $sym0$SHALLOW_PARSER );
    methods.methods_incorporate_instance_method( $sym10$INITIALIZE, $sym0$SHALLOW_PARSER, $list11, NIL, $list12 );
    methods.subloop_register_instance_method( $sym0$SHALLOW_PARSER, $sym10$INITIALIZE, $sym15$SHALLOW_PARSER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym20$PARSE, $sym0$SHALLOW_PARSER, $list21, $list22, $list23 );
    methods.subloop_register_instance_method( $sym0$SHALLOW_PARSER, $sym20$PARSE, $sym28$SHALLOW_PARSER_PARSE_METHOD );
    methods.methods_incorporate_instance_method( $sym29$HANDLE_ERROR, $sym0$SHALLOW_PARSER, $list30, $list31, $list32 );
    methods.subloop_register_instance_method( $sym0$SHALLOW_PARSER, $sym29$HANDLE_ERROR, $sym35$SHALLOW_PARSER_HANDLE_ERROR_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shallow_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shallow_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shallow_parser_file();
  }
  static
  {
    me = new shallow_parser();
    $sym0$SHALLOW_PARSER = makeSymbol( "SHALLOW-PARSER" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR-HANDLING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "TIME" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "TEXT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "HANDLE-ERROR" ), ConsesLow.list( makeSymbol( "ERROR" ) ), makeKeyword( "PRIVATE" ) ) );
    $sym3$TIME = makeSymbol( "TIME" );
    $sym4$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym5$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym6$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-CLASS" );
    $sym7$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym8$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym9$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-INSTANCE" );
    $sym10$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list11 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ERROR-HANDLING" ), makeKeyword( "THROW" ) ), ConsesLow.list(
        makeSymbol( "CSETQ" ), makeSymbol( "TIME" ), FIVE_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD" );
    $kw14$THROW = makeKeyword( "THROW" );
    $sym15$SHALLOW_PARSER_INITIALIZE_METHOD = makeSymbol( "SHALLOW-PARSER-INITIALIZE-METHOD" );
    $list16 = ConsesLow.list( makeKeyword( "THROW" ), makeKeyword( "WARN" ), makeKeyword( "IGNORE" ) );
    $str17$Invalid_error_handling_tag__a = makeString( "Invalid error-handling tag ~a" );
    $str18$Invalid_timeout__a = makeString( "Invalid timeout ~a" );
    $float19$3_4028232e37 = makeDouble( 3.4028232E37 );
    $sym20$PARSE = makeSymbol( "PARSE" );
    $list21 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list22 = ConsesLow.list( makeSymbol( "TEXT" ) );
    $list23 = ConsesLow.list( makeString( "@param TEXT stringp; one or more English sentences\n   @return listp; a list of shallow parses for TEXT, one for each sentence" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( makeSymbol( "PARSES" ), makeSymbol( "ERROR" ), makeSymbol( "TIMEOUT?" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol(
            "WITH-TIMEOUT" ), ConsesLow.list( makeSymbol( "TIME" ), makeSymbol( "TIMEOUT?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARSES" ), ConsesLow.list( makeSymbol( "SHALLOW-PARSE" ), makeSymbol(
                "TEXT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TIMEOUT?" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Shallow Parser timed out after ~a seconds" ), makeSymbol(
                    "TIME" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "HANDLE-ERROR" ), makeSymbol( "SELF" ), makeSymbol( "ERROR" ) ) ), ConsesLow.list( makeSymbol(
                        "RET" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW-PARSE-TREE" ) ), makeSymbol( "PARSES" ) ) ) ) );
    $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD" );
    $sym25$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str26$Shallow_Parser_timed_out_after__a = makeString( "Shallow Parser timed out after ~a seconds" );
    $sym27$NEW_PARSE_TREE = makeSymbol( "NEW-PARSE-TREE" );
    $sym28$SHALLOW_PARSER_PARSE_METHOD = makeSymbol( "SHALLOW-PARSER-PARSE-METHOD" );
    $sym29$HANDLE_ERROR = makeSymbol( "HANDLE-ERROR" );
    $list30 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list31 = ConsesLow.list( makeSymbol( "ERROR" ) );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "ERROR-HANDLING" ), ConsesLow.list( makeKeyword( "THROW" ), ConsesLow.list( makeSymbol( "ERROR" ), makeSymbol( "ERROR" ) ) ), ConsesLow
        .list( makeKeyword( "WARN" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR" ) ) ) ) );
    $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD" );
    $kw34$WARN = makeKeyword( "WARN" );
    $sym35$SHALLOW_PARSER_HANDLE_ERROR_METHOD = makeSymbol( "SHALLOW-PARSER-HANDLE-ERROR-METHOD" );
  }
}
/*
 * 
 * Total time: 118 ms
 * 
 */