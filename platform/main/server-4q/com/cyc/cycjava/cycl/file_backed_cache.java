package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_backed_cache
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.file_backed_cache";
  public static final String myFingerPrint = "e8cfe5ce638801b710bc99f3757c03657727e42b6b3334885a21fc5606070efa";
  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1130L)
  private static SubLSymbol $fbc_reset_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1272L)
  public static SubLSymbol $file_backed_cache_base_path$;
  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLSymbol $dtp_file_backed_cache$;
  private static final SubLString $str0$fbc_reset_lock;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$_FILE_BACKED_CACHE_BASE_PATH_;
  private static final SubLString $str3$data_caches_;
  private static final SubLSymbol $kw4$LEXICAL;
  private static final SubLSymbol $sym5$FILE_BACKED_CACHE;
  private static final SubLSymbol $sym6$FILE_BACKED_CACHE_P;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$PRINT_FBC;
  private static final SubLSymbol $sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$FBC_FILE_HASH_TABLE_CACHE;
  private static final SubLSymbol $sym15$_CSETF_FBC_FILE_HASH_TABLE_CACHE;
  private static final SubLSymbol $sym16$FBC_LOCAL_CACHE;
  private static final SubLSymbol $sym17$_CSETF_FBC_LOCAL_CACHE;
  private static final SubLSymbol $sym18$FBC_FILE_HASH_TABLE_PATH;
  private static final SubLSymbol $sym19$_CSETF_FBC_FILE_HASH_TABLE_PATH;
  private static final SubLSymbol $sym20$FBC_SHOULD_PRELOAD_CACHE;
  private static final SubLSymbol $sym21$_CSETF_FBC_SHOULD_PRELOAD_CACHE;
  private static final SubLSymbol $sym22$FBC_IS_FORT_CACHE;
  private static final SubLSymbol $sym23$_CSETF_FBC_IS_FORT_CACHE;
  private static final SubLSymbol $sym24$FBC_FHT_CACHE_PERCENTAGE;
  private static final SubLSymbol $sym25$_CSETF_FBC_FHT_CACHE_PERCENTAGE;
  private static final SubLSymbol $sym26$FBC_TEST;
  private static final SubLSymbol $sym27$_CSETF_FBC_TEST;
  private static final SubLSymbol $sym28$FBC_MODE;
  private static final SubLSymbol $sym29$_CSETF_FBC_MODE;
  private static final SubLSymbol $sym30$FBC_IS_BUSY;
  private static final SubLSymbol $sym31$_CSETF_FBC_IS_BUSY;
  private static final SubLSymbol $kw32$FILE_HASH_TABLE_CACHE;
  private static final SubLSymbol $kw33$LOCAL_CACHE;
  private static final SubLSymbol $kw34$FILE_HASH_TABLE_PATH;
  private static final SubLSymbol $kw35$SHOULD_PRELOAD_CACHE;
  private static final SubLSymbol $kw36$IS_FORT_CACHE;
  private static final SubLSymbol $kw37$FHT_CACHE_PERCENTAGE;
  private static final SubLSymbol $kw38$TEST;
  private static final SubLSymbol $kw39$MODE;
  private static final SubLSymbol $kw40$IS_BUSY;
  private static final SubLString $str41$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw42$BEGIN;
  private static final SubLSymbol $sym43$MAKE_FILE_BACKED_CACHE;
  private static final SubLSymbol $kw44$SLOT;
  private static final SubLSymbol $kw45$END;
  private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD;
  private static final SubLSymbol $kw47$IMAGE_INDEPENDENT_CFASL;
  private static final SubLString $str48$_FILE_BACKED_CACHE__A_;
  private static final SubLString $str49$_INVALID_FILE_BACKED_CACHE_;
  private static final SubLSymbol $sym50$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLInteger $int51$100;
  private static final SubLString $str52$Preloading_file_backed_cache_;
  private static final SubLSymbol $kw53$SKIP;
  private static final SubLSymbol $kw54$NOT_FOUND;
  private static final SubLSymbol $kw55$FBC_NOT_FOUND_VALUE;
  private static final SubLString $str56$_S_has_no_associated_file_hash_ta;
  private static final SubLSymbol $kw57$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym58$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym59$NULL;
  private static final SubLString $str60$tmp_;
  private static final SubLString $str61$The_Not_Present_Marker;

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject file_backed_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_fbc( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject file_backed_cache_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $file_backed_cache_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_file_hash_table_cache(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_local_cache(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_file_hash_table_path(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_should_preload_cache(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_is_fort_cache(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_fht_cache_percentage(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_test(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_mode(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject fbc_is_busy(final SubLObject v_object)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_file_hash_table_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_local_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_file_hash_table_path(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_should_preload_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_is_fort_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_fht_cache_percentage(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_mode(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject _csetf_fbc_is_busy(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_backed_cache_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject make_file_backed_cache(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $file_backed_cache_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw32$FILE_HASH_TABLE_CACHE ) )
      {
        _csetf_fbc_file_hash_table_cache( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$LOCAL_CACHE ) )
      {
        _csetf_fbc_local_cache( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$FILE_HASH_TABLE_PATH ) )
      {
        _csetf_fbc_file_hash_table_path( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$SHOULD_PRELOAD_CACHE ) )
      {
        _csetf_fbc_should_preload_cache( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$IS_FORT_CACHE ) )
      {
        _csetf_fbc_is_fort_cache( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$FHT_CACHE_PERCENTAGE ) )
      {
        _csetf_fbc_fht_cache_percentage( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$TEST ) )
      {
        _csetf_fbc_test( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$MODE ) )
      {
        _csetf_fbc_mode( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$IS_BUSY ) )
      {
        _csetf_fbc_is_busy( v_new, current_value );
      }
      else
      {
        Errors.error( $str41$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject visit_defstruct_file_backed_cache(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw42$BEGIN, $sym43$MAKE_FILE_BACKED_CACHE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw32$FILE_HASH_TABLE_CACHE, fbc_file_hash_table_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw33$LOCAL_CACHE, fbc_local_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw34$FILE_HASH_TABLE_PATH, fbc_file_hash_table_path( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw35$SHOULD_PRELOAD_CACHE, fbc_should_preload_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw36$IS_FORT_CACHE, fbc_is_fort_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw37$FHT_CACHE_PERCENTAGE, fbc_fht_cache_percentage( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw38$TEST, fbc_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw39$MODE, fbc_mode( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw40$IS_BUSY, fbc_is_busy( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$END, $sym43$MAKE_FILE_BACKED_CACHE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
  public static SubLObject visit_defstruct_object_file_backed_cache_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_file_backed_cache( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 2614L)
  public static SubLObject file_backed_cache_create(final SubLObject file_hash_table_path, SubLObject should_preload_cache, SubLObject is_fort_cache, SubLObject fht_cache_percentage, SubLObject test, SubLObject mode)
  {
    if( should_preload_cache == UNPROVIDED )
    {
      should_preload_cache = NIL;
    }
    if( is_fort_cache == UNPROVIDED )
    {
      is_fort_cache = NIL;
    }
    if( fht_cache_percentage == UNPROVIDED )
    {
      fht_cache_percentage = file_hash_table.$fht_cache_percentage$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw47$IMAGE_INDEPENDENT_CFASL;
    }
    final SubLObject result = make_file_backed_cache( UNPROVIDED );
    _csetf_fbc_file_hash_table_path( result, file_hash_table_path );
    _csetf_fbc_should_preload_cache( result, should_preload_cache );
    _csetf_fbc_is_fort_cache( result, is_fort_cache );
    _csetf_fbc_fht_cache_percentage( result, fht_cache_percentage );
    _csetf_fbc_test( result, test );
    _csetf_fbc_mode( result, mode );
    _csetf_fbc_is_busy( result, NIL );
    fbc_initialize( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 4105L)
  public static SubLObject print_fbc(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != file_backed_cache_p( v_object ) )
    {
      PrintLow.format( stream, $str48$_FILE_BACKED_CACHE__A_, fbc_file_hash_table_path( v_object ) );
    }
    else
    {
      PrintLow.format( stream, $str49$_INVALID_FILE_BACKED_CACHE_ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 4355L)
  public static SubLObject fbc_initialize(final SubLObject fbc)
  {
    assert NIL != file_backed_cache_p( fbc ) : fbc;
    return fbc_initialize_internal( fbc, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 4607L)
  public static SubLObject fbc_initialize_internal(final SubLObject fbc, final SubLObject preserve_local_cacheP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == preserve_local_cacheP )
    {
      _csetf_fbc_local_cache( fbc, Hashtables.make_hash_table( ZERO_INTEGER, fbc_test( fbc ), UNPROVIDED ) );
    }
    if( NIL == Filesys.probe_file( fbc_file_hash_table_path( fbc ) ) )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding( thread );
    try
    {
      file_hash_table.$fht_cache_percentage$.bind( fbc_fht_cache_percentage( fbc ), thread );
      _csetf_fbc_file_hash_table_cache( fbc, file_hash_table.open_file_hash_table_read_only( fbc_file_hash_table_path( fbc ), fbc_test( fbc ), fbc_mode( fbc ) ) );
      if( NIL == preserve_local_cacheP && NIL != fbc_should_preload_cache( fbc ) )
      {
        preload_entire_file_hash_table( fbc );
      }
    }
    finally
    {
      file_hash_table.$fht_cache_percentage$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 5492L)
  public static SubLObject file_backed_cache_reconnect(final SubLObject fbc, SubLObject file_cache_path)
  {
    if( file_cache_path == UNPROVIDED )
    {
      file_cache_path = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_backed_cache_p( fbc ) : fbc;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $fbc_reset_lock$.getGlobalValue() );
      SubLObject msg = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym50$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            _csetf_fbc_is_busy( fbc, T );
            if( NIL != file_cache_path )
            {
              _csetf_fbc_file_hash_table_path( fbc, file_cache_path );
            }
            final SubLObject preserve_local_cacheP = T;
            fbc_initialize_internal( fbc, preserve_local_cacheP );
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
        msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != msg )
      {
        Errors.warn( msg );
      }
      _csetf_fbc_is_busy( fbc, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $fbc_reset_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 6164L)
  public static SubLObject file_backed_cache_reset(final SubLObject fbc, SubLObject file_cache_path)
  {
    if( file_cache_path == UNPROVIDED )
    {
      file_cache_path = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_backed_cache_p( fbc ) : fbc;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $fbc_reset_lock$.getGlobalValue() );
      SubLObject msg = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym50$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            _csetf_fbc_is_busy( fbc, T );
            if( NIL != fbc_file_hash_table_cache( fbc ) )
            {
              file_hash_table.finalize_file_hash_table( fbc_file_hash_table_cache( fbc ) );
            }
            if( NIL != file_cache_path )
            {
              _csetf_fbc_file_hash_table_path( fbc, file_cache_path );
            }
            _csetf_fbc_file_hash_table_cache( fbc, NIL );
            _csetf_fbc_local_cache( fbc, NIL );
            fbc_initialize( fbc );
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
        msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != msg )
      {
        Errors.warn( msg );
      }
      _csetf_fbc_is_busy( fbc, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $fbc_reset_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 6999L)
  public static SubLObject file_backed_cache_finalize(final SubLObject fbc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $fbc_reset_lock$.getGlobalValue() );
      SubLObject msg = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym50$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL != fbc_file_hash_table_cache( fbc ) )
            {
              file_hash_table.finalize_file_hash_table( fbc_file_hash_table_cache( fbc ) );
            }
            _csetf_fbc_file_hash_table_cache( fbc, NIL );
            _csetf_fbc_local_cache( fbc, NIL );
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
        msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != msg )
      {
        Errors.warn( msg );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $fbc_reset_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7368L)
  public static SubLObject file_backed_cache_change_stream_buffer_size(final SubLObject fbc, final SubLObject new_stream_buffer_size)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $fbc_reset_lock$.getGlobalValue() );
      _csetf_fbc_file_hash_table_cache( fbc, file_hash_table.file_hash_table_change_stream_buffer_size( fbc_file_hash_table_cache( fbc ), new_stream_buffer_size ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $fbc_reset_lock$.getGlobalValue() );
      }
    }
    return fbc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7662L)
  public static SubLObject file_backed_cache_enable_memory_mapping(final SubLObject fbc)
  {
    file_hash_table.file_hash_table_enable_memory_mapping( fbc_file_hash_table_cache( fbc ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7815L)
  public static SubLObject file_backed_cache_memory_mappedP(final SubLObject fbc)
  {
    return file_hash_table.file_hash_table_memory_mappedP( fbc_file_hash_table_cache( fbc ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7947L)
  public static SubLObject preload_entire_file_hash_table(final SubLObject fbc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_backed_cache_p( fbc ) : fbc;
    if( !fbc_fht_cache_percentage( fbc ).numGE( $int51$100 ) )
    {
      return NIL;
    }
    if( NIL != fbc_is_fort_cache( fbc ) )
    {
      final SubLObject fht = fbc_file_hash_table_cache( fbc );
      final SubLObject message = $str52$Preloading_file_backed_cache_;
      final SubLObject total = forts.fort_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message );
          SubLObject cdolist_list_var = forts.do_forts_tables();
          SubLObject table_var = NIL;
          table_var = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject idx = table_var;
            if( NIL == id_index.id_index_objects_empty_p( idx, $kw53$SKIP ) )
            {
              final SubLObject idx_$1 = idx;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw53$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject fort;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  fort = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( fort ) )
                    {
                      fort = $kw53$SKIP;
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    file_hash_table.get_file_hash_table( fort, fht, UNPROVIDED );
                  }
                }
              }
              final SubLObject idx_$2 = idx;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) || NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$2 );
                SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$2 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$2 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw53$SKIP ) ) ? NIL : $kw53$SKIP;
                while ( id2.numL( end_id ))
                {
                  final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                  {
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    file_hash_table.get_file_hash_table( fort2, fht, UNPROVIDED );
                  }
                  id2 = Numbers.add( id2, ONE_INTEGER );
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_var = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
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
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      SubLObject continuation = NIL;
      SubLObject next;
      for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
      {
        thread.resetMultipleValues();
        final SubLObject the_key = file_hash_table.get_pristine_file_hash_table_any( fbc_file_hash_table_cache( fbc ), continuation, NIL );
        final SubLObject the_value = thread.secondMultipleValue();
        next = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != next )
        {
          final SubLObject key = the_key;
          final SubLObject val = the_value;
        }
        continuation = next;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 8658L)
  public static SubLObject file_backed_cache_lookup(final SubLObject key, final SubLObject fbc, SubLObject default_value, SubLObject recover_on_error)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = $kw54$NOT_FOUND;
    }
    if( recover_on_error == UNPROVIDED )
    {
      recover_on_error = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    while ( NIL != fbc_is_busy( fbc ))
    {
      Threads.sleep( ZERO_INTEGER );
    }
    final SubLObject val = Hashtables.gethash( key, fbc_local_cache( fbc ), $kw55$FBC_NOT_FOUND_VALUE );
    if( val != $kw55$FBC_NOT_FOUND_VALUE )
    {
      return val;
    }
    SubLObject msg = NIL;
    SubLObject result = NIL;
    final SubLObject v_file_hash_table = fbc_file_hash_table_cache( fbc );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == file_hash_table.file_hash_table_p( v_file_hash_table ) )
    {
      Errors.error( $str56$_S_has_no_associated_file_hash_ta, fbc );
    }
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym50$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          result = file_hash_table.get_file_hash_table( key, v_file_hash_table, default_value );
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
      msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != msg )
    {
      if( NIL == recover_on_error )
      {
        Errors.error( msg );
      }
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw57$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym58$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            file_hash_table.finalize_file_hash_table( v_file_hash_table );
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_2, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw57$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      fbc_initialize( fbc );
      result = file_hash_table.get_file_hash_table( key, v_file_hash_table, default_value );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 10035L)
  public static SubLObject file_backed_cache_enter(final SubLObject key, final SubLObject val, final SubLObject fbc)
  {
    while ( NIL != fbc_is_busy( fbc ))
    {
      Threads.sleep( ZERO_INTEGER );
    }
    return Hashtables.sethash( key, fbc_local_cache( fbc ), val );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 10953L)
  public static SubLObject file_backed_cache_file_hash_table_path(final SubLObject fbc)
  {
    return fbc_file_hash_table_path( fbc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 11102L)
  public static SubLObject file_backed_cache_local_cache_count(final SubLObject fbc)
  {
    return Hashtables.hash_table_count( fbc_local_cache( fbc ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 11290L)
  public static SubLObject replicate_file_backed_cache(final SubLObject fbc, final SubLObject filename, SubLObject deleted_value_fn, SubLObject source_common_symbols, SubLObject target_common_symbols,
      SubLObject temp_stem, SubLObject progress)
  {
    if( deleted_value_fn == UNPROVIDED )
    {
      deleted_value_fn = $sym59$NULL;
    }
    if( source_common_symbols == UNPROVIDED )
    {
      source_common_symbols = NIL;
    }
    if( target_common_symbols == UNPROVIDED )
    {
      target_common_symbols = NIL;
    }
    if( temp_stem == UNPROVIDED )
    {
      temp_stem = $str60$tmp_;
    }
    if( progress == UNPROVIDED )
    {
      progress = NIL;
    }
    assert NIL != file_backed_cache_p( fbc ) : fbc;
    if( NIL != utilities_macros.unprovided_argumentP( source_common_symbols ) )
    {
      source_common_symbols = cfasl.cfasl_current_common_symbols();
    }
    if( NIL != utilities_macros.unprovided_argumentP( target_common_symbols ) )
    {
      target_common_symbols = cfasl.cfasl_current_common_symbols();
    }
    return replicate_file_backed_cache_int( fbc, filename, deleted_value_fn, source_common_symbols, target_common_symbols, temp_stem, progress );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 12921L)
  public static SubLObject replicate_file_backed_cache_int(final SubLObject fbc, final SubLObject filename, final SubLObject deleted_value_fn, final SubLObject source_common_symbols,
      final SubLObject target_common_symbols, final SubLObject temp_stem, final SubLObject progress)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test_fn = fbc_test( fbc );
    final SubLObject mode_fn = fbc_mode( fbc );
    final SubLObject v_cache = fbc_local_cache( fbc );
    SubLObject additions = ZERO_INTEGER;
    SubLObject deletions = ZERO_INTEGER;
    final SubLObject not_present = Symbols.make_symbol( $str61$The_Not_Present_Marker );
    final SubLObject changes = set.new_set( Hashtables.hash_table_test( v_cache ), UNPROVIDED );
    SubLObject target_ffht = NIL;
    SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
    try
    {
      cfasl.$cfasl_common_symbols$.bind( NIL, thread );
      cfasl.cfasl_set_common_symbols_simple( target_common_symbols );
      target_ffht = file_hash_table.fast_create_file_hash_table( filename, temp_stem, test_fn, mode_fn );
    }
    finally
    {
      cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
    try
    {
      cfasl.$cfasl_common_symbols$.bind( NIL, thread );
      cfasl.cfasl_set_common_symbols_simple( source_common_symbols );
      final SubLObject table_var = fbc_file_hash_table_cache( fbc );
      utilities_macros.$progress_note$.setDynamicValue( progress, thread );
      utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.setDynamicValue( file_hash_table.file_hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
      final SubLObject _prev_bind_0_$4 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject continuation = NIL;
          SubLObject next;
          for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
          {
            thread.resetMultipleValues();
            final SubLObject the_key = file_hash_table.get_file_hash_table_any( table_var, continuation, NIL );
            final SubLObject the_value = thread.secondMultipleValue();
            next = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL != next )
            {
              final SubLObject key = the_key;
              final SubLObject value = the_value;
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              final SubLObject changed_value = Hashtables.gethash_without_values( key, v_cache, not_present );
              SubLObject final_value = NIL;
              if( not_present.eql( changed_value ) )
              {
                final_value = value;
              }
              else
              {
                set.set_add( key, changes );
                final_value = changed_value;
              }
              if( NIL != Functions.funcall( deleted_value_fn, final_value ) )
              {
                deletions = Numbers.add( deletions, ONE_INTEGER );
              }
              else
              {
                final SubLObject _prev_bind_0_$5 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
                try
                {
                  cfasl.$cfasl_common_symbols$.bind( NIL, thread );
                  cfasl.cfasl_set_common_symbols_simple( target_common_symbols );
                  file_hash_table.fast_put_file_hash_table( key, target_ffht, final_value );
                }
                finally
                {
                  cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0_$5, thread );
                }
              }
            }
            continuation = next;
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$4, thread );
      }
      SubLObject key2 = NIL;
      SubLObject local_value = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( v_cache );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key2 = Hashtables.getEntryKey( cdohash_entry );
          local_value = Hashtables.getEntryValue( cdohash_entry );
          if( NIL == set.set_memberP( key2, changes ) )
          {
            additions = Numbers.add( additions, ONE_INTEGER );
            final SubLObject _prev_bind_0_$7 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
            try
            {
              cfasl.$cfasl_common_symbols$.bind( NIL, thread );
              cfasl.cfasl_set_common_symbols_simple( target_common_symbols );
              file_hash_table.fast_put_file_hash_table( key2, target_ffht, local_value );
            }
            finally
            {
              cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0_$7, thread );
            }
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    finally
    {
      cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
    }
    file_hash_table.finalize_fast_create_file_hash_table( target_ffht, UNPROVIDED, UNPROVIDED );
    final SubLObject modifications = Numbers.subtract( set.set_size( changes ), deletions );
    return Values.values( filename, modifications, additions, deletions );
  }

  public static SubLObject declare_file_backed_cache_file()
  {
    SubLFiles.declareFunction( me, "file_backed_cache_print_function_trampoline", "FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_p", "FILE-BACKED-CACHE-P", 1, 0, false );
    new $file_backed_cache_p$UnaryFunction();
    SubLFiles.declareFunction( me, "fbc_file_hash_table_cache", "FBC-FILE-HASH-TABLE-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_local_cache", "FBC-LOCAL-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_file_hash_table_path", "FBC-FILE-HASH-TABLE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_should_preload_cache", "FBC-SHOULD-PRELOAD-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_is_fort_cache", "FBC-IS-FORT-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_fht_cache_percentage", "FBC-FHT-CACHE-PERCENTAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_test", "FBC-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_mode", "FBC-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_is_busy", "FBC-IS-BUSY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_file_hash_table_cache", "_CSETF-FBC-FILE-HASH-TABLE-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_local_cache", "_CSETF-FBC-LOCAL-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_file_hash_table_path", "_CSETF-FBC-FILE-HASH-TABLE-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_should_preload_cache", "_CSETF-FBC-SHOULD-PRELOAD-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_is_fort_cache", "_CSETF-FBC-IS-FORT-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_fht_cache_percentage", "_CSETF-FBC-FHT-CACHE-PERCENTAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_test", "_CSETF-FBC-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_mode", "_CSETF-FBC-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fbc_is_busy", "_CSETF-FBC-IS-BUSY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_file_backed_cache", "MAKE-FILE-BACKED-CACHE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_file_backed_cache", "VISIT-DEFSTRUCT-FILE-BACKED-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_file_backed_cache_method", "VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_create", "FILE-BACKED-CACHE-CREATE", 1, 5, false );
    SubLFiles.declareFunction( me, "print_fbc", "PRINT-FBC", 3, 0, false );
    SubLFiles.declareFunction( me, "fbc_initialize", "FBC-INITIALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "fbc_initialize_internal", "FBC-INITIALIZE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_reconnect", "FILE-BACKED-CACHE-RECONNECT", 1, 1, false );
    SubLFiles.declareFunction( me, "file_backed_cache_reset", "FILE-BACKED-CACHE-RESET", 1, 1, false );
    SubLFiles.declareFunction( me, "file_backed_cache_finalize", "FILE-BACKED-CACHE-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_change_stream_buffer_size", "FILE-BACKED-CACHE-CHANGE-STREAM-BUFFER-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_enable_memory_mapping", "FILE-BACKED-CACHE-ENABLE-MEMORY-MAPPING", 1, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_memory_mappedP", "FILE-BACKED-CACHE-MEMORY-MAPPED?", 1, 0, false );
    SubLFiles.declareFunction( me, "preload_entire_file_hash_table", "PRELOAD-ENTIRE-FILE-HASH-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_lookup", "FILE-BACKED-CACHE-LOOKUP", 2, 2, false );
    SubLFiles.declareFunction( me, "file_backed_cache_enter", "FILE-BACKED-CACHE-ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_file_hash_table_path", "FILE-BACKED-CACHE-FILE-HASH-TABLE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "file_backed_cache_local_cache_count", "FILE-BACKED-CACHE-LOCAL-CACHE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "replicate_file_backed_cache", "REPLICATE-FILE-BACKED-CACHE", 2, 5, false );
    SubLFiles.declareFunction( me, "replicate_file_backed_cache_int", "REPLICATE-FILE-BACKED-CACHE-INT", 7, 0, false );
    return NIL;
  }

  public static SubLObject init_file_backed_cache_file()
  {
    $fbc_reset_lock$ = SubLFiles.deflexical( "*FBC-RESET-LOCK*", Locks.make_lock( $str0$fbc_reset_lock ) );
    $file_backed_cache_base_path$ = SubLFiles.deflexical( "*FILE-BACKED-CACHE-BASE-PATH*", red_infrastructure_macros.red_def_helper( $list1.isSymbol() ? Symbols.symbol_value( $list1 ) : $list1,
        $sym2$_FILE_BACKED_CACHE_BASE_PATH_, $str3$data_caches_.isSymbol() ? Symbols.symbol_value( $str3$data_caches_ ) : $str3$data_caches_, $kw4$LEXICAL, UNPROVIDED ) );
    $dtp_file_backed_cache$ = SubLFiles.defconstant( "*DTP-FILE-BACKED-CACHE*", $sym5$FILE_BACKED_CACHE );
    return NIL;
  }

  public static SubLObject setup_file_backed_cache_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_backed_cache$.getGlobalValue(), Symbols.symbol_function( $sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list13 );
    Structures.def_csetf( $sym14$FBC_FILE_HASH_TABLE_CACHE, $sym15$_CSETF_FBC_FILE_HASH_TABLE_CACHE );
    Structures.def_csetf( $sym16$FBC_LOCAL_CACHE, $sym17$_CSETF_FBC_LOCAL_CACHE );
    Structures.def_csetf( $sym18$FBC_FILE_HASH_TABLE_PATH, $sym19$_CSETF_FBC_FILE_HASH_TABLE_PATH );
    Structures.def_csetf( $sym20$FBC_SHOULD_PRELOAD_CACHE, $sym21$_CSETF_FBC_SHOULD_PRELOAD_CACHE );
    Structures.def_csetf( $sym22$FBC_IS_FORT_CACHE, $sym23$_CSETF_FBC_IS_FORT_CACHE );
    Structures.def_csetf( $sym24$FBC_FHT_CACHE_PERCENTAGE, $sym25$_CSETF_FBC_FHT_CACHE_PERCENTAGE );
    Structures.def_csetf( $sym26$FBC_TEST, $sym27$_CSETF_FBC_TEST );
    Structures.def_csetf( $sym28$FBC_MODE, $sym29$_CSETF_FBC_MODE );
    Structures.def_csetf( $sym30$FBC_IS_BUSY, $sym31$_CSETF_FBC_IS_BUSY );
    Equality.identity( $sym5$FILE_BACKED_CACHE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_backed_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym46$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_file_backed_cache_file();
  }

  @Override
  public void initializeVariables()
  {
    init_file_backed_cache_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_file_backed_cache_file();
  }
  static
  {
    me = new file_backed_cache();
    $fbc_reset_lock$ = null;
    $file_backed_cache_base_path$ = null;
    $dtp_file_backed_cache$ = null;
    $str0$fbc_reset_lock = makeString( "fbc-reset-lock" );
    $list1 = ConsesLow.list( makeString( "application.file-backed-cache.base-path" ) );
    $sym2$_FILE_BACKED_CACHE_BASE_PATH_ = makeSymbol( "*FILE-BACKED-CACHE-BASE-PATH*" );
    $str3$data_caches_ = makeString( "data/caches/" );
    $kw4$LEXICAL = makeKeyword( "LEXICAL" );
    $sym5$FILE_BACKED_CACHE = makeSymbol( "FILE-BACKED-CACHE" );
    $sym6$FILE_BACKED_CACHE_P = makeSymbol( "FILE-BACKED-CACHE-P" );
    $list7 = ConsesLow.list( new SubLObject[] { makeSymbol( "FILE-HASH-TABLE-CACHE" ), makeSymbol( "LOCAL-CACHE" ), makeSymbol( "FILE-HASH-TABLE-PATH" ), makeSymbol( "SHOULD-PRELOAD-CACHE" ), makeSymbol(
        "IS-FORT-CACHE" ), makeSymbol( "FHT-CACHE-PERCENTAGE" ), makeSymbol( "TEST" ), makeSymbol( "MODE" ), makeSymbol( "IS-BUSY" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "FILE-HASH-TABLE-CACHE" ), makeKeyword( "LOCAL-CACHE" ), makeKeyword( "FILE-HASH-TABLE-PATH" ), makeKeyword( "SHOULD-PRELOAD-CACHE" ), makeKeyword(
        "IS-FORT-CACHE" ), makeKeyword( "FHT-CACHE-PERCENTAGE" ), makeKeyword( "TEST" ), makeKeyword( "MODE" ), makeKeyword( "IS-BUSY" )
    } );
    $list9 = ConsesLow.list( new SubLObject[] { makeSymbol( "FBC-FILE-HASH-TABLE-CACHE" ), makeSymbol( "FBC-LOCAL-CACHE" ), makeSymbol( "FBC-FILE-HASH-TABLE-PATH" ), makeSymbol( "FBC-SHOULD-PRELOAD-CACHE" ), makeSymbol(
        "FBC-IS-FORT-CACHE" ), makeSymbol( "FBC-FHT-CACHE-PERCENTAGE" ), makeSymbol( "FBC-TEST" ), makeSymbol( "FBC-MODE" ), makeSymbol( "FBC-IS-BUSY" )
    } );
    $list10 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-FBC-FILE-HASH-TABLE-CACHE" ), makeSymbol( "_CSETF-FBC-LOCAL-CACHE" ), makeSymbol( "_CSETF-FBC-FILE-HASH-TABLE-PATH" ), makeSymbol(
        "_CSETF-FBC-SHOULD-PRELOAD-CACHE" ), makeSymbol( "_CSETF-FBC-IS-FORT-CACHE" ), makeSymbol( "_CSETF-FBC-FHT-CACHE-PERCENTAGE" ), makeSymbol( "_CSETF-FBC-TEST" ), makeSymbol( "_CSETF-FBC-MODE" ), makeSymbol(
            "_CSETF-FBC-IS-BUSY" )
    } );
    $sym11$PRINT_FBC = makeSymbol( "PRINT-FBC" );
    $sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE" );
    $list13 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FILE-BACKED-CACHE-P" ) );
    $sym14$FBC_FILE_HASH_TABLE_CACHE = makeSymbol( "FBC-FILE-HASH-TABLE-CACHE" );
    $sym15$_CSETF_FBC_FILE_HASH_TABLE_CACHE = makeSymbol( "_CSETF-FBC-FILE-HASH-TABLE-CACHE" );
    $sym16$FBC_LOCAL_CACHE = makeSymbol( "FBC-LOCAL-CACHE" );
    $sym17$_CSETF_FBC_LOCAL_CACHE = makeSymbol( "_CSETF-FBC-LOCAL-CACHE" );
    $sym18$FBC_FILE_HASH_TABLE_PATH = makeSymbol( "FBC-FILE-HASH-TABLE-PATH" );
    $sym19$_CSETF_FBC_FILE_HASH_TABLE_PATH = makeSymbol( "_CSETF-FBC-FILE-HASH-TABLE-PATH" );
    $sym20$FBC_SHOULD_PRELOAD_CACHE = makeSymbol( "FBC-SHOULD-PRELOAD-CACHE" );
    $sym21$_CSETF_FBC_SHOULD_PRELOAD_CACHE = makeSymbol( "_CSETF-FBC-SHOULD-PRELOAD-CACHE" );
    $sym22$FBC_IS_FORT_CACHE = makeSymbol( "FBC-IS-FORT-CACHE" );
    $sym23$_CSETF_FBC_IS_FORT_CACHE = makeSymbol( "_CSETF-FBC-IS-FORT-CACHE" );
    $sym24$FBC_FHT_CACHE_PERCENTAGE = makeSymbol( "FBC-FHT-CACHE-PERCENTAGE" );
    $sym25$_CSETF_FBC_FHT_CACHE_PERCENTAGE = makeSymbol( "_CSETF-FBC-FHT-CACHE-PERCENTAGE" );
    $sym26$FBC_TEST = makeSymbol( "FBC-TEST" );
    $sym27$_CSETF_FBC_TEST = makeSymbol( "_CSETF-FBC-TEST" );
    $sym28$FBC_MODE = makeSymbol( "FBC-MODE" );
    $sym29$_CSETF_FBC_MODE = makeSymbol( "_CSETF-FBC-MODE" );
    $sym30$FBC_IS_BUSY = makeSymbol( "FBC-IS-BUSY" );
    $sym31$_CSETF_FBC_IS_BUSY = makeSymbol( "_CSETF-FBC-IS-BUSY" );
    $kw32$FILE_HASH_TABLE_CACHE = makeKeyword( "FILE-HASH-TABLE-CACHE" );
    $kw33$LOCAL_CACHE = makeKeyword( "LOCAL-CACHE" );
    $kw34$FILE_HASH_TABLE_PATH = makeKeyword( "FILE-HASH-TABLE-PATH" );
    $kw35$SHOULD_PRELOAD_CACHE = makeKeyword( "SHOULD-PRELOAD-CACHE" );
    $kw36$IS_FORT_CACHE = makeKeyword( "IS-FORT-CACHE" );
    $kw37$FHT_CACHE_PERCENTAGE = makeKeyword( "FHT-CACHE-PERCENTAGE" );
    $kw38$TEST = makeKeyword( "TEST" );
    $kw39$MODE = makeKeyword( "MODE" );
    $kw40$IS_BUSY = makeKeyword( "IS-BUSY" );
    $str41$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw42$BEGIN = makeKeyword( "BEGIN" );
    $sym43$MAKE_FILE_BACKED_CACHE = makeSymbol( "MAKE-FILE-BACKED-CACHE" );
    $kw44$SLOT = makeKeyword( "SLOT" );
    $kw45$END = makeKeyword( "END" );
    $sym46$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-METHOD" );
    $kw47$IMAGE_INDEPENDENT_CFASL = makeKeyword( "IMAGE-INDEPENDENT-CFASL" );
    $str48$_FILE_BACKED_CACHE__A_ = makeString( "<FILE-BACKED-CACHE ~A>" );
    $str49$_INVALID_FILE_BACKED_CACHE_ = makeString( "<INVALID FILE-BACKED-CACHE>" );
    $sym50$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $int51$100 = makeInteger( 100 );
    $str52$Preloading_file_backed_cache_ = makeString( "Preloading file-backed cache." );
    $kw53$SKIP = makeKeyword( "SKIP" );
    $kw54$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $kw55$FBC_NOT_FOUND_VALUE = makeKeyword( "FBC-NOT-FOUND-VALUE" );
    $str56$_S_has_no_associated_file_hash_ta = makeString( "~S has no associated file hash table." );
    $kw57$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym58$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym59$NULL = makeSymbol( "NULL" );
    $str60$tmp_ = makeString( "tmp/" );
    $str61$The_Not_Present_Marker = makeString( "The Not Present Marker" );
  }

  public static final class $file_backed_cache_native
      extends
        SubLStructNative
  {
    public SubLObject $file_hash_table_cache;
    public SubLObject $local_cache;
    public SubLObject $file_hash_table_path;
    public SubLObject $should_preload_cache;
    public SubLObject $is_fort_cache;
    public SubLObject $fht_cache_percentage;
    public SubLObject $test;
    public SubLObject $mode;
    public SubLObject $is_busy;
    private static final SubLStructDeclNative structDecl;

    public $file_backed_cache_native()
    {
      this.$file_hash_table_cache = CommonSymbols.NIL;
      this.$local_cache = CommonSymbols.NIL;
      this.$file_hash_table_path = CommonSymbols.NIL;
      this.$should_preload_cache = CommonSymbols.NIL;
      this.$is_fort_cache = CommonSymbols.NIL;
      this.$fht_cache_percentage = CommonSymbols.NIL;
      this.$test = CommonSymbols.NIL;
      this.$mode = CommonSymbols.NIL;
      this.$is_busy = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $file_backed_cache_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$file_hash_table_cache;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$local_cache;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$file_hash_table_path;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$should_preload_cache;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$is_fort_cache;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$fht_cache_percentage;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$test;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$mode;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$is_busy;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$file_hash_table_cache = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$local_cache = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$file_hash_table_path = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$should_preload_cache = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$is_fort_cache = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$fht_cache_percentage = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$test = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$mode = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$is_busy = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $file_backed_cache_native.class, $sym5$FILE_BACKED_CACHE, $sym6$FILE_BACKED_CACHE_P, $list7, $list8, new String[] { "$file_hash_table_cache", "$local_cache",
        "$file_hash_table_path", "$should_preload_cache", "$is_fort_cache", "$fht_cache_percentage", "$test", "$mode", "$is_busy"
      }, $list9, $list10, $sym11$PRINT_FBC );
    }
  }

  public static final class $file_backed_cache_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $file_backed_cache_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FILE-BACKED-CACHE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return file_backed_cache_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 323 ms
 * 
 */