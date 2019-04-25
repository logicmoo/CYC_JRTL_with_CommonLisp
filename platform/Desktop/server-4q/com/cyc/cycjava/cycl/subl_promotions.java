package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_promotions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subl_promotions";
  public static final String myFingerPrint = "bf44b6091311034e4140c84b59e6c6e60269c2d4a0a5a7ef2187c20d85e6d349";
  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 830L)
  private static SubLSymbol $make_process_with_args_table$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 1054L)
  private static SubLSymbol $make_process_with_args_table_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 2386L)
  private static SubLSymbol $interrupt_process_with_args_table$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 2640L)
  private static SubLSymbol $interrupt_process_with_args_table_lock$;
  private static final SubLSymbol $sym0$_MAKE_PROCESS_WITH_ARGS_TABLE_;
  private static final SubLString $str1$MAKE_PROCESS_WITH_ARGS_TABLE;
  private static final SubLSymbol $sym2$STRINGP;
  private static final SubLSymbol $sym3$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym4$LISTP;
  private static final SubLSymbol $sym5$MAKE_PROCESS_WITH_ARGS_INTERNAL;
  private static final SubLString $str6$Unable_to_get_make_process_args_f;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_INTERRUPT_PROCESS_WITH_ARGS_TABLE_;
  private static final SubLString $str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE;
  private static final SubLSymbol $sym10$PROCESSP;
  private static final SubLSymbol $sym11$INTERRUPT_PROCESS_WITH_ARGS_INTERNAL;
  private static final SubLString $str12$Unable_to_get_interrupt_process_a;
  private static final SubLSymbol $kw13$PUBLIC;
  private static final SubLSymbol $sym14$STREAM_ACCESS_MODE_P;
  private static final SubLSymbol $sym15$NON_NEGATIVE_NUMBER_P;
  private static final SubLSymbol $sym16$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw17$PRIVATE;
  private static final SubLString $str18$_A;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$VALUES;
  private static final SubLSymbol $sym21$SYMBOLP;
  private static final SubLSymbol $sym22$ARGLIST;
  private static final SubLSymbol $sym23$SEQUENCEP;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLString $str26$_D__D__D__D__D__D;
  private static final SubLString $str27$_D__D__D__D;
  private static final SubLSymbol $kw28$INITIALIZATION_TYPE;
  private static final SubLSymbol $kw29$UNSPECIFIED;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym35$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str36$getProperty;
  private static final SubLString $str37$java_lang_System;
  private static final SubLString $str38$java_io_tmpdir;

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 1225L)
  public static SubLObject make_process_with_args(final SubLObject name, final SubLObject function, SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    assert NIL != Types.stringp( name ) : name;
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != Types.listp( args ) : args;
    if( NIL == args )
    {
      return Threads.make_process( name, function );
    }
    SubLObject new_process = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $make_process_with_args_table_lock$.getGlobalValue() );
      new_process = Threads.make_process( name, $sym5$MAKE_PROCESS_WITH_ARGS_INTERNAL );
      $make_process_with_args_table$.setGlobalValue( ConsesLow.cons( ConsesLow.list( new_process, function, args ), $make_process_with_args_table$.getGlobalValue() ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $make_process_with_args_table_lock$.getGlobalValue() );
      }
    }
    return new_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 1791L)
  public static SubLObject make_process_with_args_internal()
  {
    final SubLObject myself = Threads.current_process();
    SubLObject process_info = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $make_process_with_args_table_lock$.getGlobalValue() );
      process_info = conses_high.assoc( myself, $make_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL != process_info )
      {
        $make_process_with_args_table$.setGlobalValue( Sequences.delete( process_info, $make_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $make_process_with_args_table_lock$.getGlobalValue() );
      }
    }
    if( NIL == process_info )
    {
      return Errors.error( $str6$Unable_to_get_make_process_args_f, myself );
    }
    SubLObject current;
    final SubLObject datum = current = process_info;
    SubLObject process = NIL;
    SubLObject function = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    process = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Functions.apply( function, args );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 2826L)
  public static SubLObject interrupt_process_with_args(final SubLObject process, final SubLObject function, SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    assert NIL != Types.processp( process ) : process;
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != Types.listp( args ) : args;
    if( process.eql( Threads.current_process() ) )
    {
      Functions.apply( function, args );
      return NIL;
    }
    if( NIL == args )
    {
      return Threads.interrupt_process( process, function );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $interrupt_process_with_args_table_lock$.getGlobalValue() );
      $interrupt_process_with_args_table$.setGlobalValue( ConsesLow.cons( ConsesLow.list( process, function, args ), $interrupt_process_with_args_table$.getGlobalValue() ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $interrupt_process_with_args_table_lock$.getGlobalValue() );
      }
    }
    return Threads.interrupt_process( process, $sym11$INTERRUPT_PROCESS_WITH_ARGS_INTERNAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 3462L)
  public static SubLObject interrupt_process_with_args_internal()
  {
    final SubLObject myself = Threads.current_process();
    SubLObject process_info = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $interrupt_process_with_args_table_lock$.getGlobalValue() );
      process_info = conses_high.assoc( myself, $interrupt_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL != process_info )
      {
        $interrupt_process_with_args_table$.setGlobalValue( Sequences.delete( process_info, $interrupt_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $interrupt_process_with_args_table_lock$.getGlobalValue() );
      }
    }
    if( NIL == process_info )
    {
      return Errors.error( $str12$Unable_to_get_interrupt_process_a, myself );
    }
    SubLObject current;
    final SubLObject datum = current = process_info;
    SubLObject process = NIL;
    SubLObject function = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    process = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Functions.apply( function, args );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 4087L)
  public static SubLObject open_tcp_stream_with_timeout(final SubLObject host, final SubLObject port, SubLObject timeout, SubLObject access_mode)
  {
    if( timeout == UNPROVIDED )
    {
      timeout = NIL;
    }
    if( access_mode == UNPROVIDED )
    {
      access_mode = $kw13$PUBLIC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != stream_access_mode_p( access_mode ) : access_mode;
    SubLObject error_message = NIL;
    final SubLObject timed_out = NIL;
    SubLObject v_answer = NIL;
    if( NIL != timeout )
    {
      assert NIL != number_utilities.non_negative_number_p( timeout ) : timeout;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym16$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( access_mode == $kw17$PRIVATE )
            {
              final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding( thread );
              try
              {
                stream_macros.$stream_requires_locking$.bind( NIL, thread );
                v_answer = Tcp.open_tcp_stream( host, port, timeout );
              }
              finally
              {
                stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$1, thread );
              }
            }
            else
            {
              v_answer = Tcp.open_tcp_stream( host, port, timeout );
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
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym16$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( access_mode == $kw17$PRIVATE )
            {
              final SubLObject _prev_bind_0_$2 = stream_macros.$stream_requires_locking$.currentBinding( thread );
              try
              {
                stream_macros.$stream_requires_locking$.bind( NIL, thread );
                v_answer = Tcp.open_tcp_stream( host, port, NIL );
              }
              finally
              {
                stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$2, thread );
              }
            }
            else
            {
              v_answer = Tcp.open_tcp_stream( host, port, NIL );
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
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    if( NIL != error_message )
    {
      Errors.error( $str18$_A, error_message );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 5802L)
  public static SubLObject stream_access_mode_p(final SubLObject v_object)
  {
    return conses_high.member( v_object, $list19, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 5952L)
  public static SubLObject values_list(final SubLObject list)
  {
    return Functions.apply( Symbols.symbol_function( $sym20$VALUES ), list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 6228L)
  public static SubLObject function_symbol_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && NIL != Symbols.fboundp( v_object ) && Symbols.symbol_function( v_object ).isFunction() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 6510L)
  public static SubLObject function_symbol_arglist(final SubLObject function_symbol)
  {
    assert NIL != Types.symbolp( function_symbol ) : function_symbol;
    return Functions.funcall( $sym22$ARGLIST, function_symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 6863L)
  public static SubLObject rsublis(final SubLObject alist, final SubLObject tree, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != Types.function_spec_p( test ) : test;
    assert NIL != Types.function_spec_p( key ) : key;
    if( !Symbols.symbol_function( IDENTITY ).eql( key ) )
    {
      return rsublis_4( alist, tree, test, key );
    }
    if( !Symbols.symbol_function( EQL ).eql( test ) )
    {
      return rsublis_3( alist, tree, test );
    }
    return rsublis_2( alist, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 7365L)
  public static SubLObject nrsublis(final SubLObject alist, final SubLObject tree, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != Types.function_spec_p( test ) : test;
    assert NIL != Types.function_spec_p( key ) : key;
    if( !Symbols.symbol_function( IDENTITY ).eql( key ) )
    {
      return nrsublis_4( alist, tree, test, key );
    }
    if( !Symbols.symbol_function( EQL ).eql( test ) )
    {
      return nrsublis_3( alist, tree, test );
    }
    return nrsublis_2( alist, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 7811L)
  public static SubLObject rsublis_2(final SubLObject alist, final SubLObject tree)
  {
    SubLObject cdolist_list_var = alist;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != entry && entry.rest().eql( tree ) )
      {
        return entry.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( tree.isAtom() )
    {
      return tree;
    }
    final SubLObject tree_car = tree.first();
    final SubLObject tree_cdr = tree.rest();
    final SubLObject new_car = rsublis_2( alist, tree_car );
    final SubLObject new_cdr = rsublis_2( alist, tree_cdr );
    return list_utilities.recons( new_car, new_cdr, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 8208L)
  public static SubLObject nrsublis_2(final SubLObject alist, final SubLObject tree)
  {
    SubLObject cdolist_list_var = alist;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != entry && entry.rest().eql( tree ) )
      {
        return entry.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( tree.isAtom() )
    {
      return tree;
    }
    final SubLObject tree_car = tree.first();
    final SubLObject tree_cdr = tree.rest();
    final SubLObject new_car = nrsublis_2( alist, tree_car );
    final SubLObject new_cdr = nrsublis_2( alist, tree_cdr );
    return list_utilities.ncons( new_car, new_cdr, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 8620L)
  public static SubLObject rsublis_3(final SubLObject alist, final SubLObject tree, final SubLObject test)
  {
    SubLObject cdolist_list_var = alist;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != entry && NIL != Functions.funcall( test, entry.rest(), tree ) )
      {
        return entry.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( tree.isAtom() )
    {
      return tree;
    }
    final SubLObject tree_car = tree.first();
    final SubLObject tree_cdr = tree.rest();
    final SubLObject new_car = rsublis_3( alist, tree_car, test );
    final SubLObject new_cdr = rsublis_3( alist, tree_cdr, test );
    return list_utilities.recons( new_car, new_cdr, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 9020L)
  public static SubLObject nrsublis_3(final SubLObject alist, final SubLObject tree, final SubLObject test)
  {
    SubLObject cdolist_list_var = alist;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != entry && NIL != Functions.funcall( test, entry.rest(), tree ) )
      {
        return entry.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( tree.isAtom() )
    {
      return tree;
    }
    final SubLObject tree_car = tree.first();
    final SubLObject tree_cdr = tree.rest();
    final SubLObject new_car = nrsublis_3( alist, tree_car, test );
    final SubLObject new_cdr = nrsublis_3( alist, tree_cdr, test );
    return list_utilities.ncons( new_car, new_cdr, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 9456L)
  public static SubLObject rsublis_4(final SubLObject alist, final SubLObject tree, final SubLObject test, final SubLObject key)
  {
    final SubLObject tree_key = Functions.funcall( key, tree );
    SubLObject cdolist_list_var = alist;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != entry && NIL != Functions.funcall( test, entry.rest(), tree_key ) )
      {
        return entry.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( tree.isAtom() )
    {
      return tree;
    }
    final SubLObject tree_car = tree.first();
    final SubLObject tree_cdr = tree.rest();
    final SubLObject new_car = rsublis_4( alist, tree_car, test, key );
    final SubLObject new_cdr = rsublis_4( alist, tree_cdr, test, key );
    return list_utilities.recons( new_car, new_cdr, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 9914L)
  public static SubLObject nrsublis_4(final SubLObject alist, final SubLObject tree, final SubLObject test, final SubLObject key)
  {
    final SubLObject tree_key = Functions.funcall( key, tree );
    SubLObject cdolist_list_var = alist;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != entry && NIL != Functions.funcall( test, entry.rest(), tree_key ) )
      {
        return entry.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( tree.isAtom() )
    {
      return tree;
    }
    final SubLObject tree_car = tree.first();
    final SubLObject tree_cdr = tree.rest();
    final SubLObject new_car = nrsublis_4( alist, tree_car, test, key );
    final SubLObject new_cdr = nrsublis_4( alist, tree_cdr, test, key );
    return list_utilities.ncons( new_car, new_cdr, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 10408L)
  public static SubLObject initial_process()
  {
    final SubLObject all_processes = Threads.all_processes();
    if( NIL != all_processes )
    {
      return conses_high.last( all_processes, UNPROVIDED ).first();
    }
    final SubLObject current_process = Threads.current_process();
    if( NIL != current_process )
    {
      return current_process;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 10991L)
  public static SubLObject set_elt(final SubLObject sequence, final SubLObject index, final SubLObject value)
  {
    assert NIL != Types.sequencep( sequence ) : sequence;
    if( sequence.isList() )
    {
      ConsesLow.set_nth( index, sequence, value );
    }
    else if( sequence.isVector() )
    {
      Vectors.set_aref( sequence, index, value );
    }
    else if( sequence.isString() )
    {
      Strings.set_char( sequence, index, value );
    }
    return sequence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 11414L)
  public static SubLObject funcall_0(final SubLObject func)
  {
    return Functions.funcall( func );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 11869L)
  public static SubLObject funcall_1(final SubLObject func, final SubLObject arg1)
  {
    return Functions.funcall( func, arg1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 12065L)
  public static SubLObject funcall_2(final SubLObject func, final SubLObject arg1, final SubLObject arg2)
  {
    return Functions.funcall( func, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 12281L)
  public static SubLObject funcall_3(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3)
  {
    return Functions.funcall( func, arg1, arg2, arg3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 12514L)
  public static SubLObject funcall_4(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4)
  {
    return Functions.funcall( func, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 12763L)
  public static SubLObject elapsed_universal_time(final SubLObject past_time, SubLObject current_time)
  {
    if( current_time == UNPROVIDED )
    {
      current_time = NIL;
    }
    if( NIL == current_time )
    {
      current_time = Time.get_universal_time();
    }
    return Numbers.subtract( current_time, past_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 13246L)
  public static SubLObject ensure_physical_pathname(final SubLObject pathname)
  {
    assert NIL != Types.stringp( pathname ) : pathname;
    return pathname;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 14859L)
  public static SubLObject memberP(final SubLObject item, final SubLObject list, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    return makeBoolean( NIL != Sequences.position( item, list, test, key, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 15055L)
  public static SubLObject positive_integer_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && v_object.isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 15359L)
  public static SubLObject non_negative_integer_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && !v_object.isNegative() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 15506L)
  public static SubLObject non_positive_integer_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && !v_object.isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 15652L)
  public static SubLObject negative_integer_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && v_object.isNegative() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 15787L)
  public static SubLObject non_zero_integer_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && !v_object.isZero() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 15946L)
  public static SubLObject odd_integer_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && NIL != Numbers.oddp( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 16039L)
  public static SubLObject even_integer_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && NIL != Numbers.evenp( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 16134L)
  public static SubLObject number_in_range_p(final SubLObject v_object, final SubLObject low, final SubLObject high)
  {
    return makeBoolean( v_object.isNumber() && v_object.numGE( low ) && high.numGE( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 16274L)
  public static SubLObject tcp_stream_remote_hostname(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Tcp.$remote_hostname$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 17208L)
  public static SubLObject tcp_stream_remote_address(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = Numbers.disassemble_integer_to_fixnums( Tcp.$remote_address$.getDynamicValue( thread ) );
    SubLObject sign = NIL;
    SubLObject b0 = NIL;
    SubLObject b2 = NIL;
    SubLObject b3 = NIL;
    SubLObject b4 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    sign = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    b0 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    b2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    b3 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    b4 = current.first();
    current = current.rest();
    final SubLObject b5 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list25 );
    current = current.rest();
    final SubLObject b6 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list25 );
    current = current.rest();
    if( NIL == current )
    {
      return ( NIL != b5 ) ? PrintLow.format( NIL, $str26$_D__D__D__D__D__D, new SubLObject[] { b6, b5, b4, b3, b2, b0
      } ) : PrintLow.format( NIL, $str27$_D__D__D__D, new SubLObject[] { b4, b3, b2, b0
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 18213L)
  public static SubLObject global_initialization_type(final SubLObject global)
  {
    return Symbols.get( global, $kw28$INITIALIZATION_TYPE, $kw29$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 18599L)
  public static SubLObject initialization_type_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $list30 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 18905L)
  public static SubLObject values2(final SubLObject value1, final SubLObject value2)
  {
    return Values.values( value1, value2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 19124L)
  public static SubLObject values3(final SubLObject value1, final SubLObject value2, final SubLObject value3)
  {
    return Values.values( value1, value2, value3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 19366L)
  public static SubLObject values4(final SubLObject value1, final SubLObject value2, final SubLObject value3, final SubLObject value4)
  {
    return Values.values( value1, value2, value3, value4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-promotions.lisp", position = 19600L)
  public static SubLObject get_temp_directory()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tempdir = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw34$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym35$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject wjava_static = JavaLink.java_static( $str36$getProperty, $str37$java_lang_System, new SubLObject[] { $str38$java_io_tmpdir
          } );
          tempdir = Strings.string( wjava_static );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw34$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return tempdir;
  }

  public static SubLObject declare_subl_promotions_file()
  {
    SubLFiles.declareFunction( me, "make_process_with_args", "MAKE-PROCESS-WITH-ARGS", 2, 1, false );
    SubLFiles.declareFunction( me, "make_process_with_args_internal", "MAKE-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "interrupt_process_with_args", "INTERRUPT-PROCESS-WITH-ARGS", 2, 1, false );
    SubLFiles.declareFunction( me, "interrupt_process_with_args_internal", "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "open_tcp_stream_with_timeout", "OPEN-TCP-STREAM-WITH-TIMEOUT", 2, 2, false );
    SubLFiles.declareFunction( me, "stream_access_mode_p", "STREAM-ACCESS-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "values_list", "VALUES-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "function_symbol_p", "FUNCTION-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "function_symbol_arglist", "FUNCTION-SYMBOL-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "rsublis", "RSUBLIS", 2, 2, false );
    SubLFiles.declareFunction( me, "nrsublis", "NRSUBLIS", 2, 2, false );
    SubLFiles.declareFunction( me, "rsublis_2", "RSUBLIS-2", 2, 0, false );
    SubLFiles.declareFunction( me, "nrsublis_2", "NRSUBLIS-2", 2, 0, false );
    SubLFiles.declareFunction( me, "rsublis_3", "RSUBLIS-3", 3, 0, false );
    SubLFiles.declareFunction( me, "nrsublis_3", "NRSUBLIS-3", 3, 0, false );
    SubLFiles.declareFunction( me, "rsublis_4", "RSUBLIS-4", 4, 0, false );
    SubLFiles.declareFunction( me, "nrsublis_4", "NRSUBLIS-4", 4, 0, false );
    SubLFiles.declareFunction( me, "initial_process", "INITIAL-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "set_elt", "SET-ELT", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_0", "FUNCALL-0", 1, 0, false );
    SubLFiles.declareFunction( me, "funcall_1", "FUNCALL-1", 2, 0, false );
    SubLFiles.declareFunction( me, "funcall_2", "FUNCALL-2", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_3", "FUNCALL-3", 4, 0, false );
    SubLFiles.declareFunction( me, "funcall_4", "FUNCALL-4", 5, 0, false );
    SubLFiles.declareFunction( me, "elapsed_universal_time", "ELAPSED-UNIVERSAL-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "ensure_physical_pathname", "ENSURE-PHYSICAL-PATHNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "memberP", "MEMBER?", 2, 2, false );
    SubLFiles.declareFunction( me, "positive_integer_p", "POSITIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_negative_integer_p", "NON-NEGATIVE-INTEGER-P", 1, 0, false );
    new $non_negative_integer_p$UnaryFunction();
    SubLFiles.declareFunction( me, "non_positive_integer_p", "NON-POSITIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_integer_p", "NEGATIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_zero_integer_p", "NON-ZERO-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "odd_integer_p", "ODD-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "even_integer_p", "EVEN-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "number_in_range_p", "NUMBER-IN-RANGE-P", 3, 0, false );
    SubLFiles.declareFunction( me, "tcp_stream_remote_hostname", "TCP-STREAM-REMOTE-HOSTNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "tcp_stream_remote_address", "TCP-STREAM-REMOTE-ADDRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "global_initialization_type", "GLOBAL-INITIALIZATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "initialization_type_p", "INITIALIZATION-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "values2", "VALUES2", 2, 0, false );
    SubLFiles.declareFunction( me, "values3", "VALUES3", 3, 0, false );
    SubLFiles.declareFunction( me, "values4", "VALUES4", 4, 0, false );
    SubLFiles.declareFunction( me, "get_temp_directory", "GET-TEMP-DIRECTORY", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_subl_promotions_file()
  {
    $make_process_with_args_table$ = SubLFiles.deflexical( "*MAKE-PROCESS-WITH-ARGS-TABLE*", ( maybeDefault( $sym0$_MAKE_PROCESS_WITH_ARGS_TABLE_, $make_process_with_args_table$, NIL ) ) );
    $make_process_with_args_table_lock$ = SubLFiles.deflexical( "*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*", Locks.make_lock( $str1$MAKE_PROCESS_WITH_ARGS_TABLE ) );
    $interrupt_process_with_args_table$ = SubLFiles.deflexical( "*INTERRUPT-PROCESS-WITH-ARGS-TABLE*", ( maybeDefault( $sym8$_INTERRUPT_PROCESS_WITH_ARGS_TABLE_, $interrupt_process_with_args_table$, NIL ) ) );
    $interrupt_process_with_args_table_lock$ = SubLFiles.deflexical( "*INTERRUPT-PROCESS-WITH-ARGS-TABLE-LOCK*", Locks.make_lock( $str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE ) );
    return NIL;
  }

  public static SubLObject setup_subl_promotions_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_MAKE_PROCESS_WITH_ARGS_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym8$_INTERRUPT_PROCESS_WITH_ARGS_TABLE_ );
    SubLSpecialOperatorDeclarations.proclaim( $list24 );
    SubLSpecialOperatorDeclarations.proclaim( $list31 );
    SubLSpecialOperatorDeclarations.proclaim( $list32 );
    SubLSpecialOperatorDeclarations.proclaim( $list33 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subl_promotions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subl_promotions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subl_promotions_file();
  }
  static
  {
    me = new subl_promotions();
    $make_process_with_args_table$ = null;
    $make_process_with_args_table_lock$ = null;
    $interrupt_process_with_args_table$ = null;
    $interrupt_process_with_args_table_lock$ = null;
    $sym0$_MAKE_PROCESS_WITH_ARGS_TABLE_ = makeSymbol( "*MAKE-PROCESS-WITH-ARGS-TABLE*" );
    $str1$MAKE_PROCESS_WITH_ARGS_TABLE = makeString( "MAKE-PROCESS-WITH-ARGS-TABLE" );
    $sym2$STRINGP = makeSymbol( "STRINGP" );
    $sym3$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym4$LISTP = makeSymbol( "LISTP" );
    $sym5$MAKE_PROCESS_WITH_ARGS_INTERNAL = makeSymbol( "MAKE-PROCESS-WITH-ARGS-INTERNAL" );
    $str6$Unable_to_get_make_process_args_f = makeString( "Unable to get make-process args for ~S" );
    $list7 = ConsesLow.list( makeSymbol( "PROCESS" ), makeSymbol( "FUNCTION" ), makeSymbol( "ARGS" ) );
    $sym8$_INTERRUPT_PROCESS_WITH_ARGS_TABLE_ = makeSymbol( "*INTERRUPT-PROCESS-WITH-ARGS-TABLE*" );
    $str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE = makeString( "INTERRUPT-PROCESS-WITH-ARGS-TABLE" );
    $sym10$PROCESSP = makeSymbol( "PROCESSP" );
    $sym11$INTERRUPT_PROCESS_WITH_ARGS_INTERNAL = makeSymbol( "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL" );
    $str12$Unable_to_get_interrupt_process_a = makeString( "Unable to get interrupt-process args for ~S" );
    $kw13$PUBLIC = makeKeyword( "PUBLIC" );
    $sym14$STREAM_ACCESS_MODE_P = makeSymbol( "STREAM-ACCESS-MODE-P" );
    $sym15$NON_NEGATIVE_NUMBER_P = makeSymbol( "NON-NEGATIVE-NUMBER-P" );
    $sym16$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw17$PRIVATE = makeKeyword( "PRIVATE" );
    $str18$_A = makeString( "~A" );
    $list19 = ConsesLow.list( makeKeyword( "PUBLIC" ), makeKeyword( "PRIVATE" ) );
    $sym20$VALUES = makeSymbol( "VALUES" );
    $sym21$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym22$ARGLIST = makeSymbol( "ARGLIST", "SUBLISP" );
    $sym23$SEQUENCEP = makeSymbol( "SEQUENCEP" );
    $list24 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "MEMBER?" ) );
    $list25 = ConsesLow.list( makeSymbol( "SIGN" ), makeSymbol( "B0" ), makeSymbol( "B1" ), makeSymbol( "B2" ), makeSymbol( "B3" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "B4" ), makeSymbol( "B5" ) );
    $str26$_D__D__D__D__D__D = makeString( "~D.~D.~D.~D.~D.~D" );
    $str27$_D__D__D__D = makeString( "~D.~D.~D.~D" );
    $kw28$INITIALIZATION_TYPE = makeKeyword( "INITIALIZATION-TYPE" );
    $kw29$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $list30 = ConsesLow.list( makeKeyword( "INITIALIZER" ), makeKeyword( "WORLD" ) );
    $list31 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "VALUES2" ) );
    $list32 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "VALUES3" ) );
    $list33 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "VALUES4" ) );
    $kw34$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym35$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str36$getProperty = makeString( "getProperty" );
    $str37$java_lang_System = makeString( "java.lang.System" );
    $str38$java_io_tmpdir = makeString( "java.io.tmpdir" );
  }

  public static final class $non_negative_integer_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $non_negative_integer_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NON-NEGATIVE-INTEGER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return non_negative_integer_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 229 ms
 * 
 */