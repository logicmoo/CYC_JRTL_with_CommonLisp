package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_writer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subloop_writer";
  public static final String myFingerPrint = "6920982fea837b23df3dd47bcb75eb0baf4749cb20771f30acc7714c32005182";
  private static final SubLSymbol $sym0$SUBLOOP_WRITER;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$INDENT_INCREMENT;
  private static final SubLSymbol $sym4$INDENT_NUM;
  private static final SubLSymbol $sym5$OUTSTREAM;
  private static final SubLSymbol $sym6$OPEN_FN;
  private static final SubLSymbol $sym7$INSTANCE_COUNT;
  private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS;
  private static final SubLSymbol $sym9$ISOLATED_P;
  private static final SubLSymbol $sym10$INSTANCE_NUMBER;
  private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE;
  private static final SubLSymbol $sym12$INCREASE_INDENT;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD;
  private static final SubLSymbol $sym16$SUBLOOP_WRITER_INCREASE_INDENT_METHOD;
  private static final SubLSymbol $sym17$DECREASE_INDENT;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD;
  private static final SubLString $str20$__Cannot_assign_negative_indentat;
  private static final SubLSymbol $sym21$SUBLOOP_WRITER_DECREASE_INDENT_METHOD;
  private static final SubLSymbol $sym22$SET_INDENT_INCREMENT;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD;
  private static final SubLSymbol $sym26$INTEGERP;
  private static final SubLSymbol $sym27$PLUSP;
  private static final SubLSymbol $sym28$SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD;
  private static final SubLSymbol $sym29$TEXT_WRITER;
  private static final SubLSymbol $sym30$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS;
  private static final SubLSymbol $sym31$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE;
  private static final SubLSymbol $sym32$INITIALIZE;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLSymbol $sym36$OPEN_TEXT;
  private static final SubLSymbol $sym37$TEXT_WRITER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym38$SET_STREAM;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLSymbol $sym42$STREAMP;
  private static final SubLSymbol $sym43$TEXT_WRITER_SET_STREAM_METHOD;
  private static final SubLSymbol $sym44$SET_STREAM_FROM_FILE_NAME;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $kw47$OUTPUT;
  private static final SubLSymbol $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLSymbol $sym49$TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD;
  private static final SubLSymbol $sym50$FLUSH;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLSymbol $sym53$TEXT_WRITER_FLUSH_METHOD;
  private static final SubLSymbol $sym54$CLOSE;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLSymbol $sym57$TEXT_WRITER_CLOSE_METHOD;
  private static final SubLSymbol $sym58$PRINT_OBJECT;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLString $str62$_A;
  private static final SubLSymbol $sym63$TEXT_WRITER_PRINT_OBJECT_METHOD;
  private static final SubLSymbol $sym64$PRINT_STRING;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLSymbol $sym68$STRINGP;
  private static final SubLSymbol $sym69$TEXT_WRITER_PRINT_STRING_METHOD;
  private static final SubLSymbol $sym70$PRINT_LINE;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
  private static final SubLSymbol $sym73$TEXT_WRITER_PRINT_LINE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject get_subloop_writer_indent_increment(final SubLObject v_subloop_writer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_subloop_writer, FOUR_INTEGER, $sym3$INDENT_INCREMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject set_subloop_writer_indent_increment(final SubLObject v_subloop_writer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_subloop_writer, value, FOUR_INTEGER, $sym3$INDENT_INCREMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject get_subloop_writer_indent_num(final SubLObject v_subloop_writer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_subloop_writer, THREE_INTEGER, $sym4$INDENT_NUM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject set_subloop_writer_indent_num(final SubLObject v_subloop_writer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_subloop_writer, value, THREE_INTEGER, $sym4$INDENT_NUM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject get_subloop_writer_outstream(final SubLObject v_subloop_writer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_subloop_writer, TWO_INTEGER, $sym5$OUTSTREAM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject set_subloop_writer_outstream(final SubLObject v_subloop_writer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_subloop_writer, value, TWO_INTEGER, $sym5$OUTSTREAM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject get_subloop_writer_open_fn(final SubLObject v_subloop_writer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_subloop_writer, ONE_INTEGER, $sym6$OPEN_FN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject set_subloop_writer_open_fn(final SubLObject v_subloop_writer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_subloop_writer, value, ONE_INTEGER, $sym6$OPEN_FN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject subloop_reserved_initialize_subloop_writer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject subloop_reserved_initialize_subloop_writer_instance(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym6$OPEN_FN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym5$OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue( thread ) );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym4$INDENT_NUM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym3$INDENT_INCREMENT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
  public static SubLObject subloop_writer_p(final SubLObject v_subloop_writer)
  {
    return classes.subloop_instanceof_class( v_subloop_writer, $sym0$SUBLOOP_WRITER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2149L)
  public static SubLObject subloop_writer_increase_indent_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_subloop_writer_method = NIL;
    final SubLObject indent_increment = get_subloop_writer_indent_increment( self );
    SubLObject indent_num = get_subloop_writer_indent_num( self );
    try
    {
      thread.throwStack.push( $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD );
      try
      {
        indent_num = Numbers.add( indent_num, indent_increment );
        Dynamic.sublisp_throw( $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_indent_increment( self, indent_increment );
          set_subloop_writer_indent_num( self, indent_num );
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
      catch_var_for_subloop_writer_method = Errors.handleThrowable( ccatch_env_var, $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_subloop_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2282L)
  public static SubLObject subloop_writer_decrease_indent_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_subloop_writer_method = NIL;
    final SubLObject indent_increment = get_subloop_writer_indent_increment( self );
    SubLObject indent_num = get_subloop_writer_indent_num( self );
    try
    {
      thread.throwStack.push( $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD );
      try
      {
        final SubLObject new_indent_num = Numbers.subtract( indent_num, indent_increment );
        if( ZERO_INTEGER.numG( new_indent_num ) )
        {
          Errors.warn( $str20$__Cannot_assign_negative_indentat );
        }
        else
        {
          indent_num = new_indent_num;
        }
        Dynamic.sublisp_throw( $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_indent_increment( self, indent_increment );
          set_subloop_writer_indent_num( self, indent_num );
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
      catch_var_for_subloop_writer_method = Errors.handleThrowable( ccatch_env_var, $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_subloop_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2537L)
  public static SubLObject subloop_writer_set_indent_increment_method(final SubLObject self, final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_subloop_writer_method = NIL;
    SubLObject indent_increment = get_subloop_writer_indent_increment( self );
    try
    {
      thread.throwStack.push( $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD );
      try
      {
        assert NIL != Types.integerp( num ) : num;
        assert NIL != Numbers.plusp( num ) : num;
        indent_increment = num;
        Dynamic.sublisp_throw( $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_indent_increment( self, indent_increment );
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
      catch_var_for_subloop_writer_method = Errors.handleThrowable( ccatch_env_var, $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_subloop_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2709L)
  public static SubLObject subloop_reserved_initialize_text_writer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2709L)
  public static SubLObject subloop_reserved_initialize_text_writer_instance(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym6$OPEN_FN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym5$OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue( thread ) );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym4$INDENT_NUM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SUBLOOP_WRITER, $sym3$INDENT_INCREMENT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2709L)
  public static SubLObject text_writer_p(final SubLObject text_writer)
  {
    return classes.subloop_instanceof_class( text_writer, $sym29$TEXT_WRITER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2930L)
  public static SubLObject text_writer_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    SubLObject indent_increment = get_subloop_writer_indent_increment( self );
    SubLObject indent_num = get_subloop_writer_indent_num( self );
    SubLObject open_fn = get_subloop_writer_open_fn( self );
    try
    {
      thread.throwStack.push( $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        object.object_initialize_method( self );
        open_fn = Symbols.symbol_function( $sym36$OPEN_TEXT );
        indent_num = ZERO_INTEGER;
        indent_increment = TWO_INTEGER;
        Dynamic.sublisp_throw( $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_indent_increment( self, indent_increment );
          set_subloop_writer_indent_num( self, indent_num );
          set_subloop_writer_open_fn( self, open_fn );
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
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3110L)
  public static SubLObject text_writer_set_stream_method(final SubLObject self, final SubLObject out_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    SubLObject outstream = get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        assert NIL != Types.streamp( out_stream ) : out_stream;
        outstream = out_stream;
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_outstream( self, outstream );
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
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3257L)
  public static SubLObject text_writer_set_stream_from_file_name_method(final SubLObject self, final SubLObject filename, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = $kw47$OUTPUT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    SubLObject outstream = get_subloop_writer_outstream( self );
    final SubLObject open_fn = get_subloop_writer_open_fn( self );
    try
    {
      thread.throwStack.push( $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          outstream = Functions.funcall( open_fn, filename, direction );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_outstream( self, outstream );
          set_subloop_writer_open_fn( self, open_fn );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3463L)
  public static SubLObject text_writer_flush_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    final SubLObject outstream = get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        streams_high.finish_output( outstream );
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_outstream( self, outstream );
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
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3558L)
  public static SubLObject text_writer_close_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    final SubLObject outstream = get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        methods.funcall_instance_method_with_0_args( self, $sym50$FLUSH );
        streams_high.close( outstream, UNPROVIDED );
        Dynamic.sublisp_throw( $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_outstream( self, outstream );
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
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3685L)
  public static SubLObject text_writer_print_object_method(final SubLObject self, final SubLObject v_object, final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    final SubLObject indent_num = get_subloop_writer_indent_num( self );
    final SubLObject outstream = get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        final SubLObject string = PrintLow.format( NIL, $str62$_A, v_object );
        if( NIL != indent )
        {
          string_utilities.indent( outstream, indent_num );
        }
        streams_high.write_string( string, outstream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_indent_num( self, indent_num );
          set_subloop_writer_outstream( self, outstream );
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
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3904L)
  public static SubLObject text_writer_print_string_method(final SubLObject self, final SubLObject string, final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    final SubLObject indent_num = get_subloop_writer_indent_num( self );
    final SubLObject outstream = get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        if( NIL != indent )
        {
          string_utilities.indent( outstream, indent_num );
        }
        streams_high.write_string( string, outstream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_indent_num( self, indent_num );
          set_subloop_writer_outstream( self, outstream );
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
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 4102L)
  public static SubLObject text_writer_print_line_method(final SubLObject self, final SubLObject string, final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_writer_method = NIL;
    final SubLObject indent_num = get_subloop_writer_indent_num( self );
    final SubLObject outstream = get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        if( NIL != indent )
        {
          string_utilities.indent( outstream, indent_num );
        }
        streams_high.write_line( string, outstream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_subloop_writer_indent_num( self, indent_num );
          set_subloop_writer_outstream( self, outstream );
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
      catch_var_for_text_writer_method = Errors.handleThrowable( ccatch_env_var, $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_writer_method;
  }

  public static SubLObject declare_subloop_writer_file()
  {
    SubLFiles.declareFunction( me, "get_subloop_writer_indent_increment", "GET-SUBLOOP-WRITER-INDENT-INCREMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_subloop_writer_indent_increment", "SET-SUBLOOP-WRITER-INDENT-INCREMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_subloop_writer_indent_num", "GET-SUBLOOP-WRITER-INDENT-NUM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_subloop_writer_indent_num", "SET-SUBLOOP-WRITER-INDENT-NUM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_subloop_writer_outstream", "GET-SUBLOOP-WRITER-OUTSTREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_subloop_writer_outstream", "SET-SUBLOOP-WRITER-OUTSTREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_subloop_writer_open_fn", "GET-SUBLOOP-WRITER-OPEN-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_subloop_writer_open_fn", "SET-SUBLOOP-WRITER-OPEN-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_subloop_writer_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_subloop_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_writer_p", "SUBLOOP-WRITER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_writer_increase_indent_method", "SUBLOOP-WRITER-INCREASE-INDENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_writer_decrease_indent_method", "SUBLOOP-WRITER-DECREASE-INDENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_writer_set_indent_increment_method", "SUBLOOP-WRITER-SET-INDENT-INCREMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_text_writer_class", "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_text_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "text_writer_p", "TEXT-WRITER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "text_writer_initialize_method", "TEXT-WRITER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "text_writer_set_stream_method", "TEXT-WRITER-SET-STREAM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "text_writer_set_stream_from_file_name_method", "TEXT-WRITER-SET-STREAM-FROM-FILE-NAME-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "text_writer_flush_method", "TEXT-WRITER-FLUSH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "text_writer_close_method", "TEXT-WRITER-CLOSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "text_writer_print_object_method", "TEXT-WRITER-PRINT-OBJECT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "text_writer_print_string_method", "TEXT-WRITER-PRINT-STRING-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "text_writer_print_line_method", "TEXT-WRITER-PRINT-LINE-METHOD", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_writer_file()
  {
    return NIL;
  }

  public static SubLObject setup_subloop_writer_file()
  {
    classes.subloop_new_class( $sym0$SUBLOOP_WRITER, $sym1$OBJECT, NIL, T, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$SUBLOOP_WRITER, NIL );
    classes.subloop_note_class_initialization_function( $sym0$SUBLOOP_WRITER, $sym8$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$SUBLOOP_WRITER, $sym11$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE );
    subloop_reserved_initialize_subloop_writer_class( $sym0$SUBLOOP_WRITER );
    methods.methods_incorporate_instance_method( $sym12$INCREASE_INDENT, $sym0$SUBLOOP_WRITER, $list13, NIL, $list14 );
    methods.subloop_register_instance_method( $sym0$SUBLOOP_WRITER, $sym12$INCREASE_INDENT, $sym16$SUBLOOP_WRITER_INCREASE_INDENT_METHOD );
    methods.methods_incorporate_instance_method( $sym17$DECREASE_INDENT, $sym0$SUBLOOP_WRITER, $list13, NIL, $list18 );
    methods.subloop_register_instance_method( $sym0$SUBLOOP_WRITER, $sym17$DECREASE_INDENT, $sym21$SUBLOOP_WRITER_DECREASE_INDENT_METHOD );
    methods.methods_incorporate_instance_method( $sym22$SET_INDENT_INCREMENT, $sym0$SUBLOOP_WRITER, $list13, $list23, $list24 );
    methods.subloop_register_instance_method( $sym0$SUBLOOP_WRITER, $sym22$SET_INDENT_INCREMENT, $sym28$SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD );
    classes.subloop_new_class( $sym29$TEXT_WRITER, $sym0$SUBLOOP_WRITER, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym29$TEXT_WRITER, NIL );
    classes.subloop_note_class_initialization_function( $sym29$TEXT_WRITER, $sym30$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym29$TEXT_WRITER, $sym31$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE );
    subloop_reserved_initialize_text_writer_class( $sym29$TEXT_WRITER );
    methods.methods_incorporate_instance_method( $sym32$INITIALIZE, $sym29$TEXT_WRITER, $list33, NIL, $list34 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym32$INITIALIZE, $sym37$TEXT_WRITER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym38$SET_STREAM, $sym29$TEXT_WRITER, $list13, $list39, $list40 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym38$SET_STREAM, $sym43$TEXT_WRITER_SET_STREAM_METHOD );
    methods.methods_incorporate_instance_method( $sym44$SET_STREAM_FROM_FILE_NAME, $sym29$TEXT_WRITER, $list13, $list45, $list46 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym44$SET_STREAM_FROM_FILE_NAME, $sym49$TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym50$FLUSH, $sym29$TEXT_WRITER, $list13, NIL, $list51 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym50$FLUSH, $sym53$TEXT_WRITER_FLUSH_METHOD );
    methods.methods_incorporate_instance_method( $sym54$CLOSE, $sym29$TEXT_WRITER, $list13, NIL, $list55 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym54$CLOSE, $sym57$TEXT_WRITER_CLOSE_METHOD );
    methods.methods_incorporate_instance_method( $sym58$PRINT_OBJECT, $sym29$TEXT_WRITER, $list13, $list59, $list60 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym58$PRINT_OBJECT, $sym63$TEXT_WRITER_PRINT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym64$PRINT_STRING, $sym29$TEXT_WRITER, $list13, $list65, $list66 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym64$PRINT_STRING, $sym69$TEXT_WRITER_PRINT_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym70$PRINT_LINE, $sym29$TEXT_WRITER, $list13, $list65, $list71 );
    methods.subloop_register_instance_method( $sym29$TEXT_WRITER, $sym70$PRINT_LINE, $sym73$TEXT_WRITER_PRINT_LINE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_writer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_writer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_writer_file();
  }
  static
  {
    me = new subloop_writer();
    $sym0$SUBLOOP_WRITER = makeSymbol( "SUBLOOP-WRITER" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "OPEN-FN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "OUTSTREAM" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), makeSymbol( "*STANDARD-OUTPUT*" ) ), ConsesLow.list( makeSymbol( "INDENT-NUM" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
            makeSymbol( "INDENT-INCREMENT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INCREASE-INDENT" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DECREASE-INDENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INDENT-INCREMENT" ),
          ConsesLow.list( makeSymbol( "INTEGER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-STREAM" ), ConsesLow.list( makeSymbol( "STREAM" ) ), makeKeyword(
              "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FLUSH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLOSE" ), NIL,
                  makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT-OBJECT" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "INDENT" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT-STRING" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "INDENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT-LINE" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "INDENT" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym3$INDENT_INCREMENT = makeSymbol( "INDENT-INCREMENT" );
    $sym4$INDENT_NUM = makeSymbol( "INDENT-NUM" );
    $sym5$OUTSTREAM = makeSymbol( "OUTSTREAM" );
    $sym6$OPEN_FN = makeSymbol( "OPEN-FN" );
    $sym7$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym8$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-CLASS" );
    $sym9$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym10$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym11$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-INSTANCE" );
    $sym12$INCREASE_INDENT = makeSymbol( "INCREASE-INDENT" );
    $list13 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDENT-NUM" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "INDENT-NUM" ), makeSymbol( "INDENT-INCREMENT" ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD" );
    $sym16$SUBLOOP_WRITER_INCREASE_INDENT_METHOD = makeSymbol( "SUBLOOP-WRITER-INCREASE-INDENT-METHOD" );
    $sym17$DECREASE_INDENT = makeSymbol( "DECREASE-INDENT" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-INDENT-NUM" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "INDENT-NUM" ), makeSymbol(
        "INDENT-INCREMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( ">" ), ZERO_INTEGER, makeSymbol( "NEW-INDENT-NUM" ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString(
            "~%Cannot assign negative indentation" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDENT-NUM" ), makeSymbol( "NEW-INDENT-NUM" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "SELF" ) ) );
    $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD" );
    $str20$__Cannot_assign_negative_indentat = makeString( "~%Cannot assign negative indentation" );
    $sym21$SUBLOOP_WRITER_DECREASE_INDENT_METHOD = makeSymbol( "SUBLOOP-WRITER-DECREASE-INDENT-METHOD" );
    $sym22$SET_INDENT_INCREMENT = makeSymbol( "SET-INDENT-INCREMENT" );
    $list23 = ConsesLow.list( makeSymbol( "NUM" ) );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NUM" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NUM" ), makeSymbol( "PLUSP" ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDENT-INCREMENT" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD" );
    $sym26$INTEGERP = makeSymbol( "INTEGERP" );
    $sym27$PLUSP = makeSymbol( "PLUSP" );
    $sym28$SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD = makeSymbol( "SUBLOOP-WRITER-SET-INDENT-INCREMENT-METHOD" );
    $sym29$TEXT_WRITER = makeSymbol( "TEXT-WRITER" );
    $sym30$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-CLASS" );
    $sym31$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-INSTANCE" );
    $sym32$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list33 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "OPEN-FN" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
        "OPEN-TEXT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDENT-NUM" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDENT-INCREMENT" ), TWO_INTEGER ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $sym36$OPEN_TEXT = makeSymbol( "OPEN-TEXT" );
    $sym37$TEXT_WRITER_INITIALIZE_METHOD = makeSymbol( "TEXT-WRITER-INITIALIZE-METHOD" );
    $sym38$SET_STREAM = makeSymbol( "SET-STREAM" );
    $list39 = ConsesLow.list( makeSymbol( "OUT-STREAM" ) );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OUT-STREAM" ), makeSymbol( "STREAMP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "OUTSTREAM" ), makeSymbol(
        "OUT-STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $sym42$STREAMP = makeSymbol( "STREAMP" );
    $sym43$TEXT_WRITER_SET_STREAM_METHOD = makeSymbol( "TEXT-WRITER-SET-STREAM-METHOD" );
    $sym44$SET_STREAM_FROM_FILE_NAME = makeSymbol( "SET-STREAM-FROM-FILE-NAME" );
    $list45 = ConsesLow.list( makeSymbol( "FILENAME" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeKeyword( "OUTPUT" ) ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "ENSURE-PRIVATE-STREAM" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "OUTSTREAM" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "OPEN-FN" ),
        makeSymbol( "FILENAME" ), makeSymbol( "DIRECTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $kw47$OUTPUT = makeKeyword( "OUTPUT" );
    $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $sym49$TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD = makeSymbol( "TEXT-WRITER-SET-STREAM-FROM-FILE-NAME-METHOD" );
    $sym50$FLUSH = makeSymbol( "FLUSH" );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "FINISH-OUTPUT" ), makeSymbol( "OUTSTREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $sym53$TEXT_WRITER_FLUSH_METHOD = makeSymbol( "TEXT-WRITER-FLUSH-METHOD" );
    $sym54$CLOSE = makeSymbol( "CLOSE" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FLUSH" ) ) ), ConsesLow.list( makeSymbol( "CLOSE" ),
        makeSymbol( "OUTSTREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $sym57$TEXT_WRITER_CLOSE_METHOD = makeSymbol( "TEXT-WRITER-CLOSE-METHOD" );
    $sym58$PRINT_OBJECT = makeSymbol( "PRINT-OBJECT" );
    $list59 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "INDENT" ) );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~A" ), makeSymbol( "OBJECT" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "INDENT" ), ConsesLow.list( makeSymbol( "INDENT" ), makeSymbol( "OUTSTREAM" ), makeSymbol( "INDENT-NUM" ) ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
            makeSymbol( "STRING" ), makeSymbol( "OUTSTREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $str62$_A = makeString( "~A" );
    $sym63$TEXT_WRITER_PRINT_OBJECT_METHOD = makeSymbol( "TEXT-WRITER-PRINT-OBJECT-METHOD" );
    $sym64$PRINT_STRING = makeSymbol( "PRINT-STRING" );
    $list65 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "INDENT" ) );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "INDENT" ), ConsesLow.list( makeSymbol(
        "INDENT" ), makeSymbol( "OUTSTREAM" ), makeSymbol( "INDENT-NUM" ) ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeSymbol( "STRING" ), makeSymbol( "OUTSTREAM" ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "SELF" ) ) );
    $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $sym68$STRINGP = makeSymbol( "STRINGP" );
    $sym69$TEXT_WRITER_PRINT_STRING_METHOD = makeSymbol( "TEXT-WRITER-PRINT-STRING-METHOD" );
    $sym70$PRINT_LINE = makeSymbol( "PRINT-LINE" );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "INDENT" ), ConsesLow.list( makeSymbol(
        "INDENT" ), makeSymbol( "OUTSTREAM" ), makeSymbol( "INDENT-NUM" ) ) ), ConsesLow.list( makeSymbol( "WRITE-LINE" ), makeSymbol( "STRING" ), makeSymbol( "OUTSTREAM" ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "SELF" ) ) );
    $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-WRITER-METHOD" );
    $sym73$TEXT_WRITER_PRINT_LINE_METHOD = makeSymbol( "TEXT-WRITER-PRINT-LINE-METHOD" );
  }
}
/*
 * 
 * Total time: 223 ms
 * 
 */