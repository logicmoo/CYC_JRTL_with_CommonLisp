package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.parser";
  public static final String myFingerPrint = "19781d685a5ff35cd3b0a22b8f498b743cfe5310a061d21f74578d4ef5347369";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 873L)
  public static SubLSymbol $default_parser_timeout$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  private static SubLSymbol $charniak_parser_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3000L)
  private static SubLSymbol $charniak_available$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5798L)
  private static SubLSymbol $charniak_parse_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7415L)
  private static SubLSymbol $stanford_parser_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7673L)
  private static SubLSymbol $stanford_parser_port$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7833L)
  private static SubLSymbol $stanford_parser$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8142L)
  private static SubLSymbol $stanford_available$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9997L)
  private static SubLSymbol $stanford_parse_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10724L)
  public static SubLSymbol $aux_word_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10974L)
  private static SubLSymbol $link_parser_program_name$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11244L)
  private static SubLSymbol $link_parser_program_redfilename$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11470L)
  private static SubLSymbol $link_parser_program_inputfile$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11631L)
  private static SubLSymbol $link_parser_program_outputfile$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11795L)
  private static SubLSymbol $link_server_allow_local_start$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12011L)
  private static SubLSymbol $link_parser_server_os_process_name$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12091L)
  private static SubLSymbol $link_parser_server_proxy_process_name$;
  private static final SubLInteger $int0$10000;
  private static final SubLSymbol $sym1$PARSER;
  private static final SubLSymbol $sym2$OBJECT;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$TIMEOUT;
  private static final SubLSymbol $sym5$ERROR_HANDLING;
  private static final SubLSymbol $sym6$INSTANCE_COUNT;
  private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS;
  private static final SubLSymbol $sym8$ISOLATED_P;
  private static final SubLSymbol $sym9$INSTANCE_NUMBER;
  private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE;
  private static final SubLSymbol $sym11$INITIALIZE;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$OUTER_CATCH_FOR_PARSER_METHOD;
  private static final SubLSymbol $kw15$THROW;
  private static final SubLInteger $int16$90;
  private static final SubLSymbol $sym17$PARSER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym18$PRINT;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$OUTER_CATCH_FOR_PARSER_METHOD;
  private static final SubLSymbol $sym23$INSTANCE_P;
  private static final SubLString $str24$__A;
  private static final SubLString $str25$_Error_handling___S_;
  private static final SubLSymbol $sym26$PARSER_PRINT_METHOD;
  private static final SubLSymbol $kw27$ERROR_HANDLING;
  private static final SubLSymbol $kw28$TIMEOUT;
  private static final SubLList $list29;
  private static final SubLString $str30$Invalid_error_handling_tag__a;
  private static final SubLString $str31$Invalid_timeout__a;
  private static final SubLSymbol $sym32$HANDLE_ERROR;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$OUTER_CATCH_FOR_PARSER_METHOD;
  private static final SubLSymbol $kw36$WARN;
  private static final SubLSymbol $sym37$PARSER_HANDLE_ERROR_METHOD;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$_CHARNIAK_PARSER_HOST_;
  private static final SubLString $str40$charniakparser_cyc_com;
  private static final SubLSymbol $kw41$PARAMETER;
  private static final SubLSymbol $sym42$CHARNIAK_PARSER;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS;
  private static final SubLSymbol $sym45$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE;
  private static final SubLSymbol $kw46$UNTESTED;
  private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str48$Dogs_sleep;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$PARSE_MULTIPLE;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$PARSE_TREE_CONTEXT;
  private static final SubLSymbol $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD;
  private static final SubLString $str55$Charniak_Parser_timed_out_after__;
  private static final SubLSymbol $sym56$CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$PARSE;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$STRINGP;
  private static final SubLSymbol $sym61$PARSE_TREE_CONTEXT_P;
  private static final SubLSymbol $sym62$CHARNIAK_PARSER_PARSE_METHOD;
  private static final SubLString $str63$_charniak_cgi;
  private static final SubLSymbol $kw64$POST;
  private static final SubLSymbol $sym65$CHARNIAK_PARSE;
  private static final SubLString $str66$text;
  private static final SubLString $str67$server;
  private static final SubLSymbol $sym68$_CHARNIAK_PARSE_CACHING_STATE_;
  private static final SubLInteger $int69$500;
  private static final SubLList $list70;
  private static final SubLSymbol $kw71$DT;
  private static final SubLSymbol $kw72$WHNP;
  private static final SubLSymbol $kw73$WP;
  private static final SubLSymbol $kw74$WDT;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$_STANFORD_PARSER_HOST_;
  private static final SubLString $str77$stanfordparser_cyc_com;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$_STANFORD_PARSER_PORT_;
  private static final SubLInteger $int80$8888;
  private static final SubLSymbol $sym81$STANFORD_PARSER;
  private static final SubLSymbol $sym82$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS;
  private static final SubLSymbol $sym83$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD;
  private static final SubLString $str87$Stanford_Parser_timed_out_after__;
  private static final SubLSymbol $sym88$STANFORD_PARSER_PARSE_METHOD;
  private static final SubLSymbol $sym89$STANFORD_PARSE;
  private static final SubLSymbol $kw90$PRIVATE;
  private static final SubLSymbol $sym91$_STANFORD_PARSE_CACHING_STATE_;
  private static final SubLSymbol $kw92$AUX;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$_LINK_PARSER_PROGRAM_NAME_;
  private static final SubLString $str96$_cyc_top_data_link_server;
  private static final SubLSymbol $kw97$LEXICAL;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$_LINK_PARSER_PROGRAM_REDFILENAME_;
  private static final SubLString $str100$_cyc_top_repository_red_external_;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$_LINK_PARSER_PROGRAM_INPUTFILE_;
  private static final SubLString $str103$_dev_null;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$_LINK_PARSER_PROGRAM_OUTPUTFILE_;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$_LINK_SERVER_ALLOW_LOCAL_START_;
  private static final SubLString $str108$Link_Parser_Server;
  private static final SubLString $str109$Process_for_;
  private static final SubLString $str110$_r;
  private static final SubLSymbol $sym111$LAUNCH_LINK_PARSER_PROGRAM_LOCALLY;
  private static final SubLSymbol $sym112$LINK_PARSER;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$OPTIONS;
  private static final SubLSymbol $sym115$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS;
  private static final SubLSymbol $sym116$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$LINK_PARSER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym119$NEW_LINK_PARSER;
  private static final SubLSymbol $kw120$PUBLIC;
  private static final SubLString $str121$localhost;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD;
  private static final SubLSymbol $kw124$CONTEXT;
  private static final SubLSymbol $kw125$OPTIONS;
  private static final SubLSymbol $kw126$LEXICON;
  private static final SubLString $str127$Link_Parser_timed_out_after__a_se;
  private static final SubLSymbol $sym128$LINK_PARSER_PARSE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 988L)
  public static SubLObject get_parser_timeout(final SubLObject v_parser)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parser, TWO_INTEGER, $sym4$TIMEOUT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 988L)
  public static SubLObject set_parser_timeout(final SubLObject v_parser, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parser, value, TWO_INTEGER, $sym4$TIMEOUT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 988L)
  public static SubLObject get_parser_error_handling(final SubLObject v_parser)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parser, ONE_INTEGER, $sym5$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 988L)
  public static SubLObject set_parser_error_handling(final SubLObject v_parser, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parser, value, ONE_INTEGER, $sym5$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 988L)
  public static SubLObject subloop_reserved_initialize_parser_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 988L)
  public static SubLObject subloop_reserved_initialize_parser_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym5$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym4$TIMEOUT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 988L)
  public static SubLObject parser_p(final SubLObject v_parser)
  {
    return classes.subloop_instanceof_class( v_parser, $sym1$PARSER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1339L)
  public static SubLObject parser_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parser_method = NIL;
    SubLObject timeout = get_parser_timeout( self );
    SubLObject error_handling = get_parser_error_handling( self );
    try
    {
      thread.throwStack.push( $sym14$OUTER_CATCH_FOR_PARSER_METHOD );
      try
      {
        object.object_initialize_method( self );
        error_handling = $kw15$THROW;
        timeout = $int16$90;
        Dynamic.sublisp_throw( $sym14$OUTER_CATCH_FOR_PARSER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parser_timeout( self, timeout );
          set_parser_error_handling( self, error_handling );
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
      catch_var_for_parser_method = Errors.handleThrowable( ccatch_env_var, $sym14$OUTER_CATCH_FOR_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parser_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1483L)
  public static SubLObject parser_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parser_method = NIL;
    final SubLObject error_handling = get_parser_error_handling( self );
    try
    {
      thread.throwStack.push( $sym22$OUTER_CATCH_FOR_PARSER_METHOD );
      try
      {
        assert NIL != subloop_structures.instance_p( self ) : self;
        if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
        {
          print_high.print_not_readable( self, stream );
        }
        else
        {
          print_macros.print_unreadable_object_preamble( stream, self, NIL, NIL );
          print_high.princ( subloop_structures.class_name( subloop_structures.instance_class( self ) ), stream );
          streams_high.write_char( Characters.CHAR_space, stream );
          PrintLow.format( stream, $str25$_Error_handling___S_, error_handling );
          print_macros.print_unreadable_object_postamble( stream, self, T, T );
        }
        Dynamic.sublisp_throw( $sym22$OUTER_CATCH_FOR_PARSER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parser_error_handling( self, error_handling );
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
      catch_var_for_parser_method = Errors.handleThrowable( ccatch_env_var, $sym22$OUTER_CATCH_FOR_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parser_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1694L)
  public static SubLObject new_parser(final SubLObject v_class, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject error_handling = conses_high.getf( v_properties, $kw27$ERROR_HANDLING, $kw15$THROW );
    SubLObject timeout = conses_high.getf( v_properties, $kw28$TIMEOUT, $default_parser_timeout$.getDynamicValue( thread ) );
    if( NIL == timeout )
    {
      timeout = $default_parser_timeout$.getDynamicValue( thread );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( error_handling, $list29, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str30$Invalid_error_handling_tag__a, error_handling );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.non_negative_integer_p( timeout ) )
    {
      Errors.error( $str31$Invalid_timeout__a, timeout );
    }
    final SubLObject v_parser = object.new_class_instance( v_class );
    set_parser_error_handling( v_parser, error_handling );
    set_parser_timeout( v_parser, timeout );
    return v_parser;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2506L)
  public static SubLObject parser_handle_error_method(final SubLObject self, final SubLObject error)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parser_method = NIL;
    final SubLObject error_handling = get_parser_error_handling( self );
    try
    {
      thread.throwStack.push( $sym35$OUTER_CATCH_FOR_PARSER_METHOD );
      try
      {
        final SubLObject pcase_var = error_handling;
        if( pcase_var.eql( $kw15$THROW ) )
        {
          Errors.error( error );
        }
        else if( pcase_var.eql( $kw36$WARN ) )
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
          set_parser_error_handling( self, error_handling );
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
      catch_var_for_parser_method = Errors.handleThrowable( ccatch_env_var, $sym35$OUTER_CATCH_FOR_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parser_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2905L)
  public static SubLObject subloop_reserved_initialize_charniak_parser_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2905L)
  public static SubLObject subloop_reserved_initialize_charniak_parser_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym5$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym4$TIMEOUT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2905L)
  public static SubLObject charniak_parser_p(final SubLObject charniak_parser)
  {
    return classes.subloop_instanceof_class( charniak_parser, $sym42$CHARNIAK_PARSER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3121L)
  public static SubLObject charniak_parser_availableP(SubLObject force_check)
  {
    if( force_check == UNPROVIDED )
    {
      force_check = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != force_check || $charniak_available$.getGlobalValue() == $kw46$UNTESTED )
    {
      SubLObject error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            $charniak_available$.setGlobalValue( Equality.equalp( charniak_parse( $str48$Dogs_sleep, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $list49 ) );
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
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error )
      {
        $charniak_available$.setGlobalValue( NIL );
      }
    }
    return $charniak_available$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3660L)
  public static SubLObject force_charniak_parser_availableP()
  {
    return charniak_parser_availableP( T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3842L)
  public static SubLObject new_charniak_parser(SubLObject error_handling, SubLObject timeout)
  {
    if( error_handling == UNPROVIDED )
    {
      error_handling = $kw15$THROW;
    }
    if( timeout == UNPROVIDED )
    {
      timeout = $default_parser_timeout$.getDynamicValue();
    }
    return new_parser( $sym42$CHARNIAK_PARSER, ConsesLow.list( $kw27$ERROR_HANDLING, error_handling, $kw28$TIMEOUT, timeout ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4267L)
  public static SubLObject charniak_parser_parse_multiple_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym53$PARSE_TREE_CONTEXT );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_charniak_parser_method = NIL;
    final SubLObject timeout = get_parser_timeout( self );
    try
    {
      thread.throwStack.push( $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD );
      try
      {
        SubLObject parses = NIL;
        SubLObject error = NIL;
        SubLObject timeoutP = NIL;
        SubLObject trees = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
              try
              {
                thread.throwStack.push( tag );
                final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                  SubLObject timer = NIL;
                  try
                  {
                    final SubLObject _prev_bind_0_$3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                    try
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                      timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                      parses = charniak_parse( text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      if( NIL != timeoutP )
                      {
                        Errors.error( $str55$Charniak_Parser_timed_out_after__, timeout );
                      }
                    }
                    finally
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$3, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      subl_macro_promotions.with_timeout_stop_timer( timer );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                    }
                  }
                }
                finally
                {
                  subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$2, thread );
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
              if( NIL != error )
              {
                parser_handle_error_method( self, error );
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
        SubLObject cdolist_list_var = parses;
        SubLObject parse_expression = NIL;
        parse_expression = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          trees = ConsesLow.cons( parse_tree.new_parse_tree( retag( strip_shell( parse_expression ) ), lexicon, v_context ), trees );
          cdolist_list_var = cdolist_list_var.rest();
          parse_expression = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD, Sequences.nreverse( trees ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_parser_timeout( self, timeout );
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
      catch_var_for_charniak_parser_method = Errors.handleThrowable( ccatch_env_var3, $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_charniak_parser_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5025L)
  public static SubLObject strip_shell(final SubLObject parse_expression)
  {
    return ( NIL != conses_high.member( parse_expression.first(), $list57, EQ, UNPROVIDED ) ) ? conses_high.second( parse_expression ) : parse_expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5275L)
  public static SubLObject charniak_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym53$PARSE_TREE_CONTEXT );
    }
    assert NIL != Types.stringp( text ) : text;
    if( NIL != v_context && !assertionsDisabledInClass && NIL == context.parse_tree_context_p( v_context ) )
    {
      throw new AssertionError( v_context );
    }
    final SubLObject parse = methods.funcall_instance_method_with_3_args( self, $sym50$PARSE_MULTIPLE, Sequences.substitute( Characters.CHAR_space, Characters.CHAR_newline, text, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ), lexicon, v_context ).first();
    if( NIL != parse )
    {
      parse_tree.set_parse_tree_mother( parse, NIL );
    }
    return parse;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5798L)
  public static SubLObject clear_charniak_parse()
  {
    final SubLObject cs = $charniak_parse_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5798L)
  public static SubLObject remove_charniak_parse(final SubLObject query, SubLObject server, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( server == UNPROVIDED )
    {
      server = $charniak_parser_host$.getDynamicValue();
    }
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str63$_charniak_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw64$POST;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $charniak_parse_caching_state$.getGlobalValue(), ConsesLow.list( query, server, path, host, port, method ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5798L)
  public static SubLObject charniak_parse_internal(final SubLObject query, final SubLObject server, final SubLObject path, final SubLObject host, final SubLObject port, final SubLObject method)
  {
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str66$text, query ), ConsesLow.list( $str67$server, server ) ), path, host, port, method, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5798L)
  public static SubLObject charniak_parse(final SubLObject query, SubLObject server, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( server == UNPROVIDED )
    {
      server = $charniak_parser_host$.getDynamicValue();
    }
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str63$_charniak_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw64$POST;
    }
    SubLObject caching_state = $charniak_parse_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym65$CHARNIAK_PARSE, $sym68$_CHARNIAK_PARSE_CACHING_STATE_, $int69$500, EQUAL, SIX_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( query, server, path, host, port, method );
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
        if( query.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( server.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( path.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( host.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( port.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && method.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( charniak_parse_internal( query, server, path, host, port, method ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( query, server, path, host, port, method ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6690L)
  public static SubLObject retag(final SubLObject tree)
  {
    if( NIL != word_tree.word_expression_p( tree ) )
    {
      if( NIL != subl_promotions.memberP( word_tree.word_expression_string( tree ), $list70, EQUALP, UNPROVIDED ) )
      {
        ConsesLow.rplaca( tree, $kw71$DT );
      }
    }
    else if( NIL != word_tree.phrase_expression_p( tree ) )
    {
      if( word_tree.parse_expression_category( tree ).eql( $kw72$WHNP ) && Sequences.length( word_tree.phrase_expression_daughters( tree ) ).numG( ONE_INTEGER ) && word_tree.parse_expression_category( word_tree
          .phrase_expression_daughters( tree ).first() ).eql( $kw73$WP ) )
      {
        ConsesLow.rplaca( word_tree.phrase_expression_daughters( tree ).first(), $kw74$WDT );
      }
      SubLObject cdolist_list_var = word_tree.phrase_expression_daughters( tree );
      SubLObject daughter = NIL;
      daughter = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        retag( daughter );
        cdolist_list_var = cdolist_list_var.rest();
        daughter = cdolist_list_var.first();
      }
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7879L)
  public static SubLObject get_stanford_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == stanford_parser_p( $stanford_parser$.getDynamicValue( thread ) ) )
    {
      $stanford_parser$.setDynamicValue( new_stanford_parser( UNPROVIDED, UNPROVIDED ), thread );
    }
    return $stanford_parser$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8047L)
  public static SubLObject subloop_reserved_initialize_stanford_parser_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8047L)
  public static SubLObject subloop_reserved_initialize_stanford_parser_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym5$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym4$TIMEOUT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8047L)
  public static SubLObject stanford_parser_p(final SubLObject stanford_parser)
  {
    return classes.subloop_instanceof_class( stanford_parser, $sym81$STANFORD_PARSER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8263L)
  public static SubLObject stanford_parser_availableP(SubLObject force_check)
  {
    if( force_check == UNPROVIDED )
    {
      force_check = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != force_check || $stanford_available$.getGlobalValue() == $kw46$UNTESTED )
    {
      SubLObject error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            $stanford_available$.setGlobalValue( Equality.equalp( stanford_parse( $str48$Dogs_sleep, UNPROVIDED, UNPROVIDED ), $list84 ) );
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
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error )
      {
        $stanford_available$.setGlobalValue( NIL );
      }
    }
    return $stanford_available$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8802L)
  public static SubLObject force_stanford_parser_availableP()
  {
    return stanford_parser_availableP( T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8984L)
  public static SubLObject new_stanford_parser(SubLObject error_handling, SubLObject timeout)
  {
    if( error_handling == UNPROVIDED )
    {
      error_handling = $kw15$THROW;
    }
    if( timeout == UNPROVIDED )
    {
      timeout = $default_parser_timeout$.getDynamicValue();
    }
    return new_parser( $sym81$STANFORD_PARSER, ConsesLow.list( $kw27$ERROR_HANDLING, error_handling, $kw28$TIMEOUT, timeout ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9398L)
  public static SubLObject stanford_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym53$PARSE_TREE_CONTEXT );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_stanford_parser_method = NIL;
    final SubLObject timeout = get_parser_timeout( self );
    try
    {
      thread.throwStack.push( $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD );
      try
      {
        SubLObject parse = NIL;
        SubLObject error = NIL;
        SubLObject timeoutP = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
              try
              {
                thread.throwStack.push( tag );
                final SubLObject _prev_bind_0_$5 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                  SubLObject timer = NIL;
                  try
                  {
                    final SubLObject _prev_bind_0_$6 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                    try
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                      timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                      parse = stanford_parse( text, UNPROVIDED, UNPROVIDED );
                      if( NIL != timeoutP )
                      {
                        Errors.error( $str87$Stanford_Parser_timed_out_after__, timeout );
                      }
                    }
                    finally
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$6, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      subl_macro_promotions.with_timeout_stop_timer( timer );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                    }
                  }
                }
                finally
                {
                  subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$5, thread );
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
              if( NIL != error )
              {
                parser_handle_error_method( self, error );
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
        Dynamic.sublisp_throw( $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD, ( NIL != parse ) ? parse_tree.new_parse_tree( strip_shell( parse ), lexicon, v_context ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_parser_timeout( self, timeout );
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
      catch_var_for_stanford_parser_method = Errors.handleThrowable( ccatch_env_var3, $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_stanford_parser_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9997L)
  public static SubLObject clear_stanford_parse()
  {
    final SubLObject cs = $stanford_parse_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9997L)
  public static SubLObject remove_stanford_parse(final SubLObject string, SubLObject server, SubLObject port)
  {
    if( server == UNPROVIDED )
    {
      server = $stanford_parser_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $stanford_parser_port$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $stanford_parse_caching_state$.getGlobalValue(), ConsesLow.list( string, server, port ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9997L)
  public static SubLObject stanford_parse_internal(final SubLObject string, final SubLObject server, final SubLObject port)
  {
    final SubLObject s = subl_promotions.open_tcp_stream_with_timeout( server, port, NIL, $kw90$PRIVATE );
    SubLObject parse = NIL;
    try
    {
      print_high.princ( Sequences.substitute( Characters.CHAR_space, Characters.CHAR_newline, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), s );
      streams_high.terpri( s );
      streams_high.finish_output( s );
      parse = reader.read( s, NIL, NIL, UNPROVIDED );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    if( parse.isString() )
    {
      Errors.error( parse );
    }
    return auxify( parse );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9997L)
  public static SubLObject stanford_parse(final SubLObject string, SubLObject server, SubLObject port)
  {
    if( server == UNPROVIDED )
    {
      server = $stanford_parser_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $stanford_parser_port$.getDynamicValue();
    }
    SubLObject caching_state = $stanford_parse_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym89$STANFORD_PARSE, $sym91$_STANFORD_PARSE_CACHING_STATE_, $int69$500, EQUAL, THREE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( string, server, port );
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
          if( server.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && port.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( stanford_parse_internal( string, server, port ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, server, port ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10524L)
  public static SubLObject auxify(final SubLObject tree)
  {
    if( NIL != word_tree.word_expression_p( tree ) )
    {
      if( NIL != aux_word_p( conses_high.second( tree ) ) )
      {
        ConsesLow.rplaca( tree, $kw92$AUX );
      }
    }
    else
    {
      SubLObject cdolist_list_var = tree.rest();
      SubLObject daughter = NIL;
      daughter = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        auxify( daughter );
        cdolist_list_var = cdolist_list_var.rest();
        daughter = cdolist_list_var.first();
      }
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10885L)
  public static SubLObject aux_word_p(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.member( string, $aux_word_strings$.getDynamicValue( thread ), EQUALP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12224L)
  public static SubLObject get_link_parser_program_arglist()
  {
    return ConsesLow.list( $str110$_r, $link_parser_program_redfilename$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12331L)
  public static SubLObject launch_link_parser_program_locally(SubLObject auto_restartP)
  {
    if( auto_restartP == UNPROVIDED )
    {
      auto_restartP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject program = $link_parser_program_name$.getGlobalValue();
    final SubLObject args = get_link_parser_program_arglist();
    final SubLObject source_file = $link_parser_program_inputfile$.getGlobalValue();
    final SubLObject target_file = $link_parser_program_outputfile$.getGlobalValue();
    SubLObject successP = NIL;
    SubLObject os_process = NIL;
    for( SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean( NIL == auto_restartP ) )
    {
      try
      {
        os_process = os_process_utilities.make_os_process( $link_parser_server_os_process_name$.getGlobalValue(), program, args, source_file, target_file, StreamsLow.$standard_output$.getDynamicValue( thread ) );
        os_process_utilities.wait_until_os_process_finished( os_process );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != os_process )
          {
            os_process_utilities.destroy_os_process( os_process );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL != os_process )
      {
        successP = os_process_utilities.os_process_exit_code( os_process );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13287L)
  public static SubLObject launch_link_parser_program_locally_in_process(SubLObject auto_restartP)
  {
    if( auto_restartP == UNPROVIDED )
    {
      auto_restartP = T;
    }
    return subl_promotions.make_process_with_args( $link_parser_server_proxy_process_name$.getGlobalValue(), $sym111$LAUNCH_LINK_PARSER_PROGRAM_LOCALLY, ConsesLow.list( auto_restartP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13536L)
  public static SubLObject get_link_parser_options(final SubLObject link_parser)
  {
    return classes.subloop_get_access_protected_instance_slot( link_parser, THREE_INTEGER, $sym114$OPTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13536L)
  public static SubLObject set_link_parser_options(final SubLObject link_parser, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( link_parser, value, THREE_INTEGER, $sym114$OPTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13536L)
  public static SubLObject subloop_reserved_initialize_link_parser_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13536L)
  public static SubLObject subloop_reserved_initialize_link_parser_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym5$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSER, $sym4$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym112$LINK_PARSER, $sym114$OPTIONS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13536L)
  public static SubLObject link_parser_p(final SubLObject link_parser)
  {
    return classes.subloop_instanceof_class( link_parser, $sym112$LINK_PARSER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13703L)
  public static SubLObject link_parser_initialize_method(final SubLObject self)
  {
    parser_initialize_method( self );
    linkage.ensure_linkage_initialized();
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13830L)
  public static SubLObject new_link_parser(SubLObject options, SubLObject error_handling, SubLObject timeout)
  {
    if( options == UNPROVIDED )
    {
      options = linkage.$link_parse_options$.getDynamicValue();
    }
    if( error_handling == UNPROVIDED )
    {
      error_handling = $kw15$THROW;
    }
    if( timeout == UNPROVIDED )
    {
      timeout = $default_parser_timeout$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject host = ensure_link_server_running();
    final SubLObject port = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != host && NIL != port )
    {
      linkage.$link_parser$.setDynamicValue( host, thread );
      linkage.$link_port$.setDynamicValue( port, thread );
      final SubLObject v_parser = new_parser( $sym112$LINK_PARSER, ConsesLow.list( $kw27$ERROR_HANDLING, error_handling, $kw28$TIMEOUT, timeout ) );
      instances.set_slot( v_parser, $sym114$OPTIONS, options );
      return v_parser;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14509L)
  public static SubLObject listening_socketP(final SubLObject host, final SubLObject port)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject stream = NIL;
          try
          {
            stream = subl_promotions.open_tcp_stream_with_timeout( host, port, NIL, $kw120$PUBLIC );
            if( NIL != subl_macro_promotions.validate_tcp_connection( stream, host, port ) )
            {
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != stream )
              {
                streams_high.close( stream, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
            }
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
    catch( final Throwable ccatch_env_var )
    {
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return makeBoolean( NIL == error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14814L)
  public static SubLObject ensure_link_server_running()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject host = linkage.$link_parser$.getDynamicValue( thread );
    SubLObject port = linkage.$link_port$.getDynamicValue( thread );
    SubLObject timed_outP = NIL;
    if( NIL == linkage.link_ping( host, port, UNPROVIDED ) )
    {
      if( NIL != linkage.link_ping( $str121$localhost, linkage.$link_port$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        host = $str121$localhost;
        port = linkage.$link_port$.getDynamicValue( thread );
      }
      else if( NIL == $link_server_allow_local_start$.getGlobalValue() || NIL != listening_socketP( $str121$localhost, linkage.$link_port$.getDynamicValue( thread ) ) )
      {
        host = NIL;
        port = NIL;
      }
      else
      {
        host = $str121$localhost;
        port = linkage.$link_port$.getDynamicValue( thread );
        launch_link_parser_program_locally_in_process( T );
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try
        {
          thread.throwStack.push( tag );
          final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$within_with_timeout$.bind( T, thread );
            SubLObject timer = NIL;
            try
            {
              final SubLObject _prev_bind_0_$9 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
              try
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                timer = subl_macro_promotions.with_timeout_start_timer( TEN_INTEGER, tag );
                while ( NIL == linkage.link_ping( host, port, UNPROVIDED ))
                {
                  Threads.sleep( ONE_INTEGER );
                }
              }
              finally
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$9, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                subl_macro_promotions.with_timeout_stop_timer( timer );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
              }
            }
          }
          finally
          {
            subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != timed_outP )
        {
          host = NIL;
          port = NIL;
        }
      }
    }
    return Values.values( host, port );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15591L)
  public static SubLObject link_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym53$PARSE_TREE_CONTEXT );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_link_parser_method = NIL;
    final SubLObject options = get_link_parser_options( self );
    final SubLObject timeout = get_parser_timeout( self );
    try
    {
      thread.throwStack.push( $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD );
      try
      {
        SubLObject v_linkage = NIL;
        SubLObject error = NIL;
        SubLObject timeoutP = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
              try
              {
                thread.throwStack.push( tag );
                final SubLObject _prev_bind_0_$11 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                  SubLObject timer = NIL;
                  try
                  {
                    final SubLObject _prev_bind_0_$12 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                    try
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                      timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                      v_linkage = linkage.new_linkage( text, ConsesLow.list( $kw124$CONTEXT, v_context, $kw125$OPTIONS, options, $kw126$LEXICON, lexicon ) );
                      if( NIL != timeoutP )
                      {
                        Errors.error( $str127$Link_Parser_timed_out_after__a_se, timeout );
                      }
                    }
                    finally
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$12, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      subl_macro_promotions.with_timeout_stop_timer( timer );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                    }
                  }
                }
                finally
                {
                  subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$11, thread );
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
              if( NIL != error )
              {
                parser_handle_error_method( self, error );
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
        Dynamic.sublisp_throw( $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD, v_linkage );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_link_parser_options( self, options );
          set_parser_timeout( self, timeout );
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
      catch_var_for_link_parser_method = Errors.handleThrowable( ccatch_env_var3, $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_link_parser_method;
  }

  public static SubLObject declare_parser_file()
  {
    SubLFiles.declareFunction( me, "get_parser_timeout", "GET-PARSER-TIMEOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parser_timeout", "SET-PARSER-TIMEOUT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parser_error_handling", "GET-PARSER-ERROR-HANDLING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parser_error_handling", "SET-PARSER-ERROR-HANDLING", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parser_class", "SUBLOOP-RESERVED-INITIALIZE-PARSER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "parser_p", "PARSER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parser_initialize_method", "PARSER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parser_print_method", "PARSER-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "new_parser", "NEW-PARSER", 1, 1, false );
    SubLFiles.declareFunction( me, "parser_handle_error_method", "PARSER-HANDLE-ERROR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_charniak_parser_class", "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_charniak_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "charniak_parser_p", "CHARNIAK-PARSER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "charniak_parser_availableP", "CHARNIAK-PARSER-AVAILABLE?", 0, 1, false );
    SubLFiles.declareFunction( me, "force_charniak_parser_availableP", "FORCE-CHARNIAK-PARSER-AVAILABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "new_charniak_parser", "NEW-CHARNIAK-PARSER", 0, 2, false );
    SubLFiles.declareFunction( me, "charniak_parser_parse_multiple_method", "CHARNIAK-PARSER-PARSE-MULTIPLE-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "strip_shell", "STRIP-SHELL", 1, 0, false );
    SubLFiles.declareFunction( me, "charniak_parser_parse_method", "CHARNIAK-PARSER-PARSE-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "clear_charniak_parse", "CLEAR-CHARNIAK-PARSE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_charniak_parse", "REMOVE-CHARNIAK-PARSE", 1, 5, false );
    SubLFiles.declareFunction( me, "charniak_parse_internal", "CHARNIAK-PARSE-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "charniak_parse", "CHARNIAK-PARSE", 1, 5, false );
    SubLFiles.declareFunction( me, "retag", "RETAG", 1, 0, false );
    SubLFiles.declareFunction( me, "get_stanford_parser", "GET-STANFORD-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_stanford_parser_class", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_stanford_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "stanford_parser_p", "STANFORD-PARSER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "stanford_parser_availableP", "STANFORD-PARSER-AVAILABLE?", 0, 1, false );
    SubLFiles.declareFunction( me, "force_stanford_parser_availableP", "FORCE-STANFORD-PARSER-AVAILABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "new_stanford_parser", "NEW-STANFORD-PARSER", 0, 2, false );
    SubLFiles.declareFunction( me, "stanford_parser_parse_method", "STANFORD-PARSER-PARSE-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "clear_stanford_parse", "CLEAR-STANFORD-PARSE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_stanford_parse", "REMOVE-STANFORD-PARSE", 1, 2, false );
    SubLFiles.declareFunction( me, "stanford_parse_internal", "STANFORD-PARSE-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "stanford_parse", "STANFORD-PARSE", 1, 2, false );
    SubLFiles.declareFunction( me, "auxify", "AUXIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_word_p", "AUX-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_link_parser_program_arglist", "GET-LINK-PARSER-PROGRAM-ARGLIST", 0, 0, false );
    SubLFiles.declareFunction( me, "launch_link_parser_program_locally", "LAUNCH-LINK-PARSER-PROGRAM-LOCALLY", 0, 1, false );
    SubLFiles.declareFunction( me, "launch_link_parser_program_locally_in_process", "LAUNCH-LINK-PARSER-PROGRAM-LOCALLY-IN-PROCESS", 0, 1, false );
    SubLFiles.declareFunction( me, "get_link_parser_options", "GET-LINK-PARSER-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_link_parser_options", "SET-LINK-PARSER-OPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_link_parser_class", "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_link_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "link_parser_p", "LINK-PARSER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "link_parser_initialize_method", "LINK-PARSER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_link_parser", "NEW-LINK-PARSER", 0, 3, false );
    SubLFiles.declareFunction( me, "listening_socketP", "LISTENING-SOCKET?", 2, 0, false );
    SubLFiles.declareFunction( me, "ensure_link_server_running", "ENSURE-LINK-SERVER-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "link_parser_parse_method", "LINK-PARSER-PARSE-METHOD", 2, 2, false );
    return NIL;
  }

  public static SubLObject init_parser_file()
  {
    $default_parser_timeout$ = SubLFiles.defparameter( "*DEFAULT-PARSER-TIMEOUT*", $int0$10000 );
    $charniak_parser_host$ = SubLFiles.defparameter( "*CHARNIAK-PARSER-HOST*", red_infrastructure_macros.red_def_helper( $list38.isSymbol() ? Symbols.symbol_value( $list38 ) : $list38, $sym39$_CHARNIAK_PARSER_HOST_,
        $str40$charniakparser_cyc_com.isSymbol() ? Symbols.symbol_value( $str40$charniakparser_cyc_com ) : $str40$charniakparser_cyc_com, $kw41$PARAMETER, UNPROVIDED ) );
    $charniak_available$ = SubLFiles.deflexical( "*CHARNIAK-AVAILABLE*", $kw46$UNTESTED );
    $charniak_parse_caching_state$ = SubLFiles.deflexical( "*CHARNIAK-PARSE-CACHING-STATE*", NIL );
    $stanford_parser_host$ = SubLFiles.defparameter( "*STANFORD-PARSER-HOST*", red_infrastructure_macros.red_def_helper( $list75.isSymbol() ? Symbols.symbol_value( $list75 ) : $list75, $sym76$_STANFORD_PARSER_HOST_,
        $str77$stanfordparser_cyc_com.isSymbol() ? Symbols.symbol_value( $str77$stanfordparser_cyc_com ) : $str77$stanfordparser_cyc_com, $kw41$PARAMETER, UNPROVIDED ) );
    $stanford_parser_port$ = SubLFiles.defparameter( "*STANFORD-PARSER-PORT*", red_infrastructure_macros.red_def_helper( $list78.isSymbol() ? Symbols.symbol_value( $list78 ) : $list78, $sym79$_STANFORD_PARSER_PORT_,
        $int80$8888.isSymbol() ? Symbols.symbol_value( $int80$8888 ) : $int80$8888, $kw41$PARAMETER, UNPROVIDED ) );
    $stanford_parser$ = SubLFiles.defparameter( "*STANFORD-PARSER*", NIL );
    $stanford_available$ = SubLFiles.deflexical( "*STANFORD-AVAILABLE*", $kw46$UNTESTED );
    $stanford_parse_caching_state$ = SubLFiles.deflexical( "*STANFORD-PARSE-CACHING-STATE*", NIL );
    $aux_word_strings$ = SubLFiles.defparameter( "*AUX-WORD-STRINGS*", $list93 );
    $link_parser_program_name$ = SubLFiles.deflexical( "*LINK-PARSER-PROGRAM-NAME*", red_infrastructure_macros.red_def_helper( $list94.isSymbol() ? Symbols.symbol_value( $list94 ) : $list94,
        $sym95$_LINK_PARSER_PROGRAM_NAME_, $str96$_cyc_top_data_link_server.isSymbol() ? Symbols.symbol_value( $str96$_cyc_top_data_link_server ) : $str96$_cyc_top_data_link_server, $kw97$LEXICAL, UNPROVIDED ) );
    $link_parser_program_redfilename$ = SubLFiles.deflexical( "*LINK-PARSER-PROGRAM-REDFILENAME*", red_infrastructure_macros.red_def_helper( $list98.isSymbol() ? Symbols.symbol_value( $list98 ) : $list98,
        $sym99$_LINK_PARSER_PROGRAM_REDFILENAME_, $str100$_cyc_top_repository_red_external_.isSymbol() ? Symbols.symbol_value( $str100$_cyc_top_repository_red_external_ ) : $str100$_cyc_top_repository_red_external_,
        $kw97$LEXICAL, UNPROVIDED ) );
    $link_parser_program_inputfile$ = SubLFiles.deflexical( "*LINK-PARSER-PROGRAM-INPUTFILE*", red_infrastructure_macros.red_def_helper( $list101.isSymbol() ? Symbols.symbol_value( $list101 ) : $list101,
        $sym102$_LINK_PARSER_PROGRAM_INPUTFILE_, $str103$_dev_null.isSymbol() ? Symbols.symbol_value( $str103$_dev_null ) : $str103$_dev_null, $kw97$LEXICAL, UNPROVIDED ) );
    $link_parser_program_outputfile$ = SubLFiles.deflexical( "*LINK-PARSER-PROGRAM-OUTPUTFILE*", red_infrastructure_macros.red_def_helper( $list104.isSymbol() ? Symbols.symbol_value( $list104 ) : $list104,
        $sym105$_LINK_PARSER_PROGRAM_OUTPUTFILE_, $str103$_dev_null.isSymbol() ? Symbols.symbol_value( $str103$_dev_null ) : $str103$_dev_null, $kw97$LEXICAL, UNPROVIDED ) );
    $link_server_allow_local_start$ = SubLFiles.deflexical( "*LINK-SERVER-ALLOW-LOCAL-START*", red_infrastructure_macros.red_def_helper( $list106.isSymbol() ? Symbols.symbol_value( $list106 ) : $list106,
        $sym107$_LINK_SERVER_ALLOW_LOCAL_START_, NIL.isSymbol() ? Symbols.symbol_value( NIL ) : NIL, $kw97$LEXICAL, UNPROVIDED ) );
    $link_parser_server_os_process_name$ = SubLFiles.deflexical( "*LINK-PARSER-SERVER-OS-PROCESS-NAME*", $str108$Link_Parser_Server );
    $link_parser_server_proxy_process_name$ = SubLFiles.deflexical( "*LINK-PARSER-SERVER-PROXY-PROCESS-NAME*", Sequences.cconcatenate( $str109$Process_for_, $link_parser_server_os_process_name$.getGlobalValue() ) );
    return NIL;
  }

  public static SubLObject setup_parser_file()
  {
    classes.subloop_new_class( $sym1$PARSER, $sym2$OBJECT, NIL, T, $list3 );
    classes.class_set_implements_slot_listeners( $sym1$PARSER, NIL );
    classes.subloop_note_class_initialization_function( $sym1$PARSER, $sym7$SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym1$PARSER, $sym10$SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE );
    subloop_reserved_initialize_parser_class( $sym1$PARSER );
    methods.methods_incorporate_instance_method( $sym11$INITIALIZE, $sym1$PARSER, $list12, NIL, $list13 );
    methods.subloop_register_instance_method( $sym1$PARSER, $sym11$INITIALIZE, $sym17$PARSER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym18$PRINT, $sym1$PARSER, $list19, $list20, $list21 );
    methods.subloop_register_instance_method( $sym1$PARSER, $sym18$PRINT, $sym26$PARSER_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym32$HANDLE_ERROR, $sym1$PARSER, $list12, $list33, $list34 );
    methods.subloop_register_instance_method( $sym1$PARSER, $sym32$HANDLE_ERROR, $sym37$PARSER_HANDLE_ERROR_METHOD );
    classes.subloop_new_class( $sym42$CHARNIAK_PARSER, $sym1$PARSER, NIL, NIL, $list43 );
    classes.class_set_implements_slot_listeners( $sym42$CHARNIAK_PARSER, NIL );
    classes.subloop_note_class_initialization_function( $sym42$CHARNIAK_PARSER, $sym44$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym42$CHARNIAK_PARSER, $sym45$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE );
    subloop_reserved_initialize_charniak_parser_class( $sym42$CHARNIAK_PARSER );
    methods.methods_incorporate_instance_method( $sym50$PARSE_MULTIPLE, $sym42$CHARNIAK_PARSER, $list19, $list51, $list52 );
    methods.subloop_register_instance_method( $sym42$CHARNIAK_PARSER, $sym50$PARSE_MULTIPLE, $sym56$CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD );
    methods.methods_incorporate_instance_method( $sym58$PARSE, $sym42$CHARNIAK_PARSER, $list19, $list51, $list59 );
    methods.subloop_register_instance_method( $sym42$CHARNIAK_PARSER, $sym58$PARSE, $sym62$CHARNIAK_PARSER_PARSE_METHOD );
    memoization_state.note_globally_cached_function( $sym65$CHARNIAK_PARSE );
    classes.subloop_new_class( $sym81$STANFORD_PARSER, $sym1$PARSER, NIL, NIL, $list43 );
    classes.class_set_implements_slot_listeners( $sym81$STANFORD_PARSER, NIL );
    classes.subloop_note_class_initialization_function( $sym81$STANFORD_PARSER, $sym82$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym81$STANFORD_PARSER, $sym83$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE );
    subloop_reserved_initialize_stanford_parser_class( $sym81$STANFORD_PARSER );
    methods.methods_incorporate_instance_method( $sym58$PARSE, $sym81$STANFORD_PARSER, $list19, $list51, $list85 );
    methods.subloop_register_instance_method( $sym81$STANFORD_PARSER, $sym58$PARSE, $sym88$STANFORD_PARSER_PARSE_METHOD );
    memoization_state.note_globally_cached_function( $sym89$STANFORD_PARSE );
    classes.subloop_new_class( $sym112$LINK_PARSER, $sym1$PARSER, NIL, NIL, $list113 );
    classes.class_set_implements_slot_listeners( $sym112$LINK_PARSER, NIL );
    classes.subloop_note_class_initialization_function( $sym112$LINK_PARSER, $sym115$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym112$LINK_PARSER, $sym116$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE );
    subloop_reserved_initialize_link_parser_class( $sym112$LINK_PARSER );
    methods.methods_incorporate_instance_method( $sym11$INITIALIZE, $sym112$LINK_PARSER, $list12, NIL, $list117 );
    methods.subloop_register_instance_method( $sym112$LINK_PARSER, $sym11$INITIALIZE, $sym118$LINK_PARSER_INITIALIZE_METHOD );
    access_macros.register_external_symbol( $sym119$NEW_LINK_PARSER );
    methods.methods_incorporate_instance_method( $sym58$PARSE, $sym112$LINK_PARSER, $list19, $list51, $list122 );
    methods.subloop_register_instance_method( $sym112$LINK_PARSER, $sym58$PARSE, $sym128$LINK_PARSER_PARSE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parser_file();
  }
  static
  {
    me = new parser();
    $default_parser_timeout$ = null;
    $charniak_parser_host$ = null;
    $charniak_available$ = null;
    $charniak_parse_caching_state$ = null;
    $stanford_parser_host$ = null;
    $stanford_parser_port$ = null;
    $stanford_parser$ = null;
    $stanford_available$ = null;
    $stanford_parse_caching_state$ = null;
    $aux_word_strings$ = null;
    $link_parser_program_name$ = null;
    $link_parser_program_redfilename$ = null;
    $link_parser_program_inputfile$ = null;
    $link_parser_program_outputfile$ = null;
    $link_server_allow_local_start$ = null;
    $link_parser_server_os_process_name$ = null;
    $link_parser_server_proxy_process_name$ = null;
    $int0$10000 = makeInteger( 10000 );
    $sym1$PARSER = makeSymbol( "PARSER" );
    $sym2$OBJECT = makeSymbol( "OBJECT" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR-HANDLING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TIMEOUT" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "TEXT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "LEXICON" ), makeSymbol( "CONTEXT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HANDLE-ERROR" ), ConsesLow.list( makeSymbol( "ERROR" ) ), makeKeyword( "PRIVATE" ) ) );
    $sym4$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym5$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym6$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym7$SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSER-CLASS" );
    $sym8$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym9$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym10$SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSER-INSTANCE" );
    $sym11$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list12 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ERROR-HANDLING" ), makeKeyword( "THROW" ) ), ConsesLow.list(
        makeSymbol( "CSETQ" ), makeSymbol( "TIMEOUT" ), makeInteger( 90 ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym14$OUTER_CATCH_FOR_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSER-METHOD" );
    $kw15$THROW = makeKeyword( "THROW" );
    $int16$90 = makeInteger( 90 );
    $sym17$PARSER_INITIALIZE_METHOD = makeSymbol( "PARSER-INITIALIZE-METHOD" );
    $sym18$PRINT = makeSymbol( "PRINT" );
    $list19 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list20 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINT-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "SELF" ), makeSymbol( "STREAM" ),
        makeKeyword( "NUMBER" ), NIL, makeKeyword( "IDENTITY" ), T ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "(Error handling: ~S)" ), makeSymbol( "ERROR-HANDLING" ) ) ), ConsesLow
            .list( makeSymbol( "RET" ), NIL ) );
    $sym22$OUTER_CATCH_FOR_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSER-METHOD" );
    $sym23$INSTANCE_P = makeSymbol( "INSTANCE-P" );
    $str24$__A = makeString( "-~A" );
    $str25$_Error_handling___S_ = makeString( "(Error handling: ~S)" );
    $sym26$PARSER_PRINT_METHOD = makeSymbol( "PARSER-PRINT-METHOD" );
    $kw27$ERROR_HANDLING = makeKeyword( "ERROR-HANDLING" );
    $kw28$TIMEOUT = makeKeyword( "TIMEOUT" );
    $list29 = ConsesLow.list( makeKeyword( "THROW" ), makeKeyword( "WARN" ), makeKeyword( "IGNORE" ) );
    $str30$Invalid_error_handling_tag__a = makeString( "Invalid error-handling tag ~a" );
    $str31$Invalid_timeout__a = makeString( "Invalid timeout ~a" );
    $sym32$HANDLE_ERROR = makeSymbol( "HANDLE-ERROR" );
    $list33 = ConsesLow.list( makeSymbol( "ERROR" ) );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "ERROR-HANDLING" ), ConsesLow.list( makeKeyword( "THROW" ), ConsesLow.list( makeSymbol( "ERROR" ), makeSymbol( "ERROR" ) ) ), ConsesLow
        .list( makeKeyword( "WARN" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR" ) ) ) ) );
    $sym35$OUTER_CATCH_FOR_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSER-METHOD" );
    $kw36$WARN = makeKeyword( "WARN" );
    $sym37$PARSER_HANDLE_ERROR_METHOD = makeSymbol( "PARSER-HANDLE-ERROR-METHOD" );
    $list38 = ConsesLow.list( makeString( "external.charniak.host" ) );
    $sym39$_CHARNIAK_PARSER_HOST_ = makeSymbol( "*CHARNIAK-PARSER-HOST*" );
    $str40$charniakparser_cyc_com = makeString( "charniakparser.cyc.com" );
    $kw41$PARAMETER = makeKeyword( "PARAMETER" );
    $sym42$CHARNIAK_PARSER = makeSymbol( "CHARNIAK-PARSER" );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "TEXT" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym44$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-CLASS" );
    $sym45$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-INSTANCE" );
    $kw46$UNTESTED = makeKeyword( "UNTESTED" );
    $sym47$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str48$Dogs_sleep = makeString( "Dogs sleep" );
    $list49 = ConsesLow.list( ConsesLow.list( makeKeyword( "S1" ), ConsesLow.list( makeKeyword( "S" ), ConsesLow.list( makeKeyword( "NP" ), ConsesLow.list( makeKeyword( "NNS" ), makeString( "Dogs" ) ) ), ConsesLow.list(
        makeKeyword( "VP" ), ConsesLow.list( makeKeyword( "VBP" ), makeString( "sleep" ) ) ) ) ) );
    $sym50$PARSE_MULTIPLE = makeSymbol( "PARSE-MULTIPLE" );
    $list51 = ConsesLow.list( makeSymbol( "TEXT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "CONTEXT" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "PARSE-TREE-CONTEXT" ) ) ) ) );
    $list52 = ConsesLow.list( makeString( "@param TEXT stringp; one or more English sentences, one per line\n   @return listp; the list of most likely parses for TEXT, one for each \n     sentence/line" ), ConsesLow
        .list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "PARSES" ), makeSymbol( "ERROR" ), makeSymbol( "TIMEOUT?" ), makeSymbol( "TREES" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list(
            makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "WITH-TIMEOUT" ), ConsesLow.list( makeSymbol( "TIMEOUT" ), makeSymbol( "TIMEOUT?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARSES" ),
                ConsesLow.list( makeSymbol( "CHARNIAK-PARSE" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TIMEOUT?" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString(
                    "Charniak Parser timed out after ~a seconds" ), makeSymbol( "TIMEOUT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "HANDLE-ERROR" ), makeSymbol(
                        "SELF" ), makeSymbol( "ERROR" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PARSE-EXPRESSION" ), makeSymbol( "PARSES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                            ConsesLow.list( makeSymbol( "NEW-PARSE-TREE" ), ConsesLow.list( makeSymbol( "RETAG" ), ConsesLow.list( makeSymbol( "STRIP-SHELL" ), makeSymbol( "PARSE-EXPRESSION" ) ) ), makeSymbol(
                                "LEXICON" ), makeSymbol( "CONTEXT" ) ), makeSymbol( "TREES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "TREES" ) ) ) ) );
    $sym53$PARSE_TREE_CONTEXT = makeSymbol( "PARSE-TREE-CONTEXT" );
    $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CHARNIAK-PARSER-METHOD" );
    $str55$Charniak_Parser_timed_out_after__ = makeString( "Charniak Parser timed out after ~a seconds" );
    $sym56$CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD = makeSymbol( "CHARNIAK-PARSER-PARSE-MULTIPLE-METHOD" );
    $list57 = ConsesLow.list( makeKeyword( "S1" ), makeKeyword( "ROOT" ) );
    $sym58$PARSE = makeSymbol( "PARSE" );
    $list59 = ConsesLow.list( makeString( "@param TEXT stringp; a single English sentence\n   @return parse-tree-p; the most likely parse of TEXT" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TEXT" ),
        makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "CONTEXT" ), makeSymbol( "PARSE-TREE-CONTEXT-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE-MULTIPLE" ) ),
                ConsesLow.list( makeSymbol( "SUBSTITUTE" ), Characters.CHAR_space, Characters.CHAR_newline, makeSymbol( "TEXT" ) ), makeSymbol( "LEXICON" ), makeSymbol( "CONTEXT" ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "PWHEN" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "SET-PARSE-TREE-MOTHER" ), makeSymbol( "PARSE" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PARSE" ) ) ) );
    $sym60$STRINGP = makeSymbol( "STRINGP" );
    $sym61$PARSE_TREE_CONTEXT_P = makeSymbol( "PARSE-TREE-CONTEXT-P" );
    $sym62$CHARNIAK_PARSER_PARSE_METHOD = makeSymbol( "CHARNIAK-PARSER-PARSE-METHOD" );
    $str63$_charniak_cgi = makeString( "/charniak.cgi" );
    $kw64$POST = makeKeyword( "POST" );
    $sym65$CHARNIAK_PARSE = makeSymbol( "CHARNIAK-PARSE" );
    $str66$text = makeString( "text" );
    $str67$server = makeString( "server" );
    $sym68$_CHARNIAK_PARSE_CACHING_STATE_ = makeSymbol( "*CHARNIAK-PARSE-CACHING-STATE*" );
    $int69$500 = makeInteger( 500 );
    $list70 = ConsesLow.list( makeString( "many" ), makeString( "most" ) );
    $kw71$DT = makeKeyword( "DT" );
    $kw72$WHNP = makeKeyword( "WHNP" );
    $kw73$WP = makeKeyword( "WP" );
    $kw74$WDT = makeKeyword( "WDT" );
    $list75 = ConsesLow.list( makeString( "external.stanford.host" ) );
    $sym76$_STANFORD_PARSER_HOST_ = makeSymbol( "*STANFORD-PARSER-HOST*" );
    $str77$stanfordparser_cyc_com = makeString( "stanfordparser.cyc.com" );
    $list78 = ConsesLow.list( makeString( "external.stanford.port" ) );
    $sym79$_STANFORD_PARSER_PORT_ = makeSymbol( "*STANFORD-PARSER-PORT*" );
    $int80$8888 = makeInteger( 8888 );
    $sym81$STANFORD_PARSER = makeSymbol( "STANFORD-PARSER" );
    $sym82$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-CLASS" );
    $sym83$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-INSTANCE" );
    $list84 = ConsesLow.list( makeKeyword( "ROOT" ), ConsesLow.list( makeKeyword( "S" ), ConsesLow.list( makeKeyword( "NP" ), ConsesLow.list( makeKeyword( "NNS" ), makeString( "Dogs" ) ) ), ConsesLow.list( makeKeyword(
        "VP" ), ConsesLow.list( makeKeyword( "VBP" ), makeString( "sleep" ) ) ) ) );
    $list85 = ConsesLow.list( makeString( "@param TEXT stringp; a single English sentence\n   @return parse-tree-p; the most likely parse of TEXT" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol(
        "PARSE" ), makeSymbol( "ERROR" ), makeSymbol( "TIMEOUT?" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "WITH-TIMEOUT" ), ConsesLow
            .list( makeSymbol( "TIMEOUT" ), makeSymbol( "TIMEOUT?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "STANFORD-PARSE" ), makeSymbol( "TEXT" ) ) ), ConsesLow
                .list( makeSymbol( "PWHEN" ), makeSymbol( "TIMEOUT?" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Stanford Parser timed out after ~a seconds " ), makeSymbol( "TIMEOUT" ) ) ) ), ConsesLow.list(
                    makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "HANDLE-ERROR" ), makeSymbol( "SELF" ), makeSymbol( "ERROR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                        makeSymbol( "FWHEN" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "NEW-PARSE-TREE" ), ConsesLow.list( makeSymbol( "STRIP-SHELL" ), makeSymbol( "PARSE" ) ), makeSymbol( "LEXICON" ),
                            makeSymbol( "CONTEXT" ) ) ) ) ) );
    $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STANFORD-PARSER-METHOD" );
    $str87$Stanford_Parser_timed_out_after__ = makeString( "Stanford Parser timed out after ~a seconds " );
    $sym88$STANFORD_PARSER_PARSE_METHOD = makeSymbol( "STANFORD-PARSER-PARSE-METHOD" );
    $sym89$STANFORD_PARSE = makeSymbol( "STANFORD-PARSE" );
    $kw90$PRIVATE = makeKeyword( "PRIVATE" );
    $sym91$_STANFORD_PARSE_CACHING_STATE_ = makeSymbol( "*STANFORD-PARSE-CACHING-STATE*" );
    $kw92$AUX = makeKeyword( "AUX" );
    $list93 = ConsesLow.list( new SubLObject[] { makeString( "be" ), makeString( "am" ), makeString( "are" ), makeString( "is" ), makeString( "was" ), makeString( "were" ), makeString( "been" ), makeString( "'m" ),
      makeString( "do" ), makeString( "does" ), makeString( "did" ), makeString( "done" ), makeString( "have" ), makeString( "has" ), makeString( "had" ), makeString( "'ve" )
    } );
    $list94 = ConsesLow.list( makeString( "external.link-program.name" ) );
    $sym95$_LINK_PARSER_PROGRAM_NAME_ = makeSymbol( "*LINK-PARSER-PROGRAM-NAME*" );
    $str96$_cyc_top_data_link_server = makeString( "/cyc/top/data/link_server" );
    $kw97$LEXICAL = makeKeyword( "LEXICAL" );
    $list98 = ConsesLow.list( makeString( "external.link-program.redfilename" ) );
    $sym99$_LINK_PARSER_PROGRAM_REDFILENAME_ = makeSymbol( "*LINK-PARSER-PROGRAM-REDFILENAME*" );
    $str100$_cyc_top_repository_red_external_ = makeString( "/cyc/top/repository/red/external.redbin" );
    $list101 = ConsesLow.list( makeString( "external.link-program.inputfile" ) );
    $sym102$_LINK_PARSER_PROGRAM_INPUTFILE_ = makeSymbol( "*LINK-PARSER-PROGRAM-INPUTFILE*" );
    $str103$_dev_null = makeString( "/dev/null" );
    $list104 = ConsesLow.list( makeString( "external.link-program.outputfile" ) );
    $sym105$_LINK_PARSER_PROGRAM_OUTPUTFILE_ = makeSymbol( "*LINK-PARSER-PROGRAM-OUTPUTFILE*" );
    $list106 = ConsesLow.list( makeString( "external.link-allow-local-start" ) );
    $sym107$_LINK_SERVER_ALLOW_LOCAL_START_ = makeSymbol( "*LINK-SERVER-ALLOW-LOCAL-START*" );
    $str108$Link_Parser_Server = makeString( "Link Parser Server" );
    $str109$Process_for_ = makeString( "Process for " );
    $str110$_r = makeString( "-r" );
    $sym111$LAUNCH_LINK_PARSER_PROGRAM_LOCALLY = makeSymbol( "LAUNCH-LINK-PARSER-PROGRAM-LOCALLY" );
    $sym112$LINK_PARSER = makeSymbol( "LINK-PARSER" );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "OPTIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARSE" ), ConsesLow.list(
        makeSymbol( "TEXT" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym114$OPTIONS = makeSymbol( "OPTIONS" );
    $sym115$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-CLASS" );
    $sym116$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-INSTANCE" );
    $list117 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "ENSURE-LINKAGE-INITIALIZED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
        "SELF" ) ) );
    $sym118$LINK_PARSER_INITIALIZE_METHOD = makeSymbol( "LINK-PARSER-INITIALIZE-METHOD" );
    $sym119$NEW_LINK_PARSER = makeSymbol( "NEW-LINK-PARSER" );
    $kw120$PUBLIC = makeKeyword( "PUBLIC" );
    $str121$localhost = makeString( "localhost" );
    $list122 = ConsesLow.list( makeString( "@param TEXT stringp; a single English sentence\n   @return linkage-p; the most likely linkage for TEXT" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol(
        "LINKAGE" ), makeSymbol( "ERROR" ), makeSymbol( "TIMEOUT?" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "WITH-TIMEOUT" ),
            ConsesLow.list( makeSymbol( "TIMEOUT" ), makeSymbol( "TIMEOUT?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LINKAGE" ), ConsesLow.list( makeSymbol( "NEW-LINKAGE" ), makeSymbol( "TEXT" ),
                ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "CONTEXT" ), makeSymbol( "CONTEXT" ), makeKeyword( "OPTIONS" ), makeSymbol( "OPTIONS" ), makeKeyword( "LEXICON" ), makeSymbol( "LEXICON" ) ) ) ),
            ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TIMEOUT?" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Link Parser timed out after ~a seconds" ), makeSymbol( "TIMEOUT" ) ) ) ), ConsesLow.list(
                makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "HANDLE-ERROR" ), makeSymbol( "SELF" ), makeSymbol( "ERROR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "LINKAGE" ) ) ) );
    $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LINK-PARSER-METHOD" );
    $kw124$CONTEXT = makeKeyword( "CONTEXT" );
    $kw125$OPTIONS = makeKeyword( "OPTIONS" );
    $kw126$LEXICON = makeKeyword( "LEXICON" );
    $str127$Link_Parser_timed_out_after__a_se = makeString( "Link Parser timed out after ~a seconds" );
    $sym128$LINK_PARSER_PARSE_METHOD = makeSymbol( "LINK-PARSER-PARSE-METHOD" );
  }
}
/*
 * 
 * Total time: 600 ms synthetic
 */