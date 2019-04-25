package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class timing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.timing";
  public static final String myFingerPrint = "0b8c8b97a5ccad1d408f339d214b4e9834caafd5d4d13b622c041742a43cfb57";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1700L)
  private static SubLSymbol $time_testing_environment$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1837L)
  private static SubLSymbol $timing_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1976L)
  private static SubLSymbol $utilize_timing_hooks$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2065L)
  private static SubLSymbol $all_currently_active$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2224L)
  private static SubLSymbol $timed_funs$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLSymbol $dtp_timing_info$;
  private static final SubLSymbol $sym0$CLET;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$_TIMED_FUNS_;
  private static final SubLString $str8$Timing_info_cleared;
  private static final SubLString $str9$Time_testing_environment_cleared;
  private static final SubLSymbol $sym10$TIMING_INFO;
  private static final SubLSymbol $sym11$TIMING_INFO_P;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$PRINT_TIMING_INFO;
  private static final SubLSymbol $sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$TIMING_INFO_COUNT;
  private static final SubLSymbol $sym20$_CSETF_TIMING_INFO_COUNT;
  private static final SubLSymbol $sym21$TIMING_INFO_TOTAL;
  private static final SubLSymbol $sym22$_CSETF_TIMING_INFO_TOTAL;
  private static final SubLSymbol $sym23$TIMING_INFO_MAX;
  private static final SubLSymbol $sym24$_CSETF_TIMING_INFO_MAX;
  private static final SubLSymbol $kw25$COUNT;
  private static final SubLSymbol $kw26$TOTAL;
  private static final SubLSymbol $kw27$MAX;
  private static final SubLString $str28$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw29$BEGIN;
  private static final SubLSymbol $sym30$MAKE_TIMING_INFO;
  private static final SubLSymbol $kw31$SLOT;
  private static final SubLSymbol $kw32$END;
  private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD;
  private static final SubLString $str34$____TIMING_INFO__Count__S_Total__;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$LOCAL_TIMER;
  private static final SubLSymbol $sym37$RESULT;
  private static final SubLString $str38$_IN_TIMER;
  private static final SubLSymbol $sym39$PROGN;
  private static final SubLSymbol $sym40$PIF;
  private static final SubLSymbol $sym41$TIME_FUNCTION_;
  private static final SubLSymbol $sym42$QUOTE;
  private static final SubLSymbol $sym43$CTIME;
  private static final SubLSymbol $sym44$CSETQ;
  private static final SubLSymbol $sym45$MULTIPLE_VALUE_LIST;
  private static final SubLSymbol $sym46$RECORD_TIME;
  private static final SubLSymbol $sym47$RET;
  private static final SubLSymbol $sym48$VALUES_LIST;
  private static final SubLSymbol $sym49$DEFINE_PRIVATE;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$DEFTIMED_GENERIC;
  private static final SubLSymbol $sym52$DEFINE_PROTECTED;
  private static final SubLSymbol $sym53$DEFINE;
  private static final SubLSymbol $sym54$DEFINE_PUBLIC;
  private static final SubLSymbol $sym55$DEFINE_API;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2322L)
  public static SubLObject with_new_testing_environement(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$CLET, reader.bq_cons( $list1, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2854L)
  public static SubLObject timing_no_functions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3030L)
  public static SubLObject timing_all_functions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list3, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3203L)
  public static SubLObject timing_these_functions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject functions = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    functions = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( $list5, $list6, ConsesLow.list( $sym7$_TIMED_FUNS_, functions ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3430L)
  public static SubLObject report_fun(final SubLObject fun)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject timing_info = Hashtables.gethash( fun, $timing_table$.getDynamicValue( thread ), UNPROVIDED );
    return ConsesLow.cons( fun, report_time( timing_info ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3750L)
  public static SubLObject report_time(final SubLObject timing_info)
  {
    final SubLObject count = timing_info_count( timing_info );
    final SubLObject total = timing_info_total( timing_info );
    final SubLObject max = timing_info_max( timing_info );
    final SubLObject mean = Numbers.divide( total, count );
    return ConsesLow.list( mean, max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4217L)
  public static SubLObject report_timing_info(SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject accumulator = NIL;
    final SubLObject cdohash_table = $timing_table$.getDynamicValue( thread );
    SubLObject fun = NIL;
    SubLObject info = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        fun = Hashtables.getEntryKey( cdohash_entry );
        info = Hashtables.getEntryValue( cdohash_entry );
        accumulator = ConsesLow.cons( report_fun( fun ), accumulator );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    if( NIL != key )
    {
      Hashtables.sethash( key, $time_testing_environment$.getDynamicValue( thread ), accumulator );
      clear_timing_info();
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4707L)
  public static SubLObject report_time_testing_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject accumulator = NIL;
    final SubLObject cdohash_table = $time_testing_environment$.getDynamicValue( thread );
    SubLObject test_run = NIL;
    SubLObject info = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        test_run = Hashtables.getEntryKey( cdohash_entry );
        info = Hashtables.getEntryValue( cdohash_entry );
        accumulator = ConsesLow.cons( ConsesLow.cons( test_run, ConsesLow.list( info ) ), accumulator );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5042L)
  public static SubLObject clear_timing_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.clrhash( $timing_table$.getDynamicValue( thread ) );
    return $str8$Timing_info_cleared;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5287L)
  public static SubLObject clear_time_testing_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.clrhash( $time_testing_environment$.getDynamicValue( thread ) );
    return $str9$Time_testing_environment_cleared;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject timing_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_timing_info( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject timing_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $timing_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject timing_info_count(final SubLObject v_object)
  {
    assert NIL != timing_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject timing_info_total(final SubLObject v_object)
  {
    assert NIL != timing_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject timing_info_max(final SubLObject v_object)
  {
    assert NIL != timing_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject _csetf_timing_info_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != timing_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject _csetf_timing_info_total(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != timing_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject _csetf_timing_info_max(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != timing_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject make_timing_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $timing_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw25$COUNT ) )
      {
        _csetf_timing_info_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$TOTAL ) )
      {
        _csetf_timing_info_total( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$MAX ) )
      {
        _csetf_timing_info_max( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject visit_defstruct_timing_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym30$MAKE_TIMING_INFO, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw25$COUNT, timing_info_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw26$TOTAL, timing_info_total( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw27$MAX, timing_info_max( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym30$MAKE_TIMING_INFO, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5452L)
  public static SubLObject visit_defstruct_object_timing_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_timing_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5744L)
  public static SubLObject print_timing_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str34$____TIMING_INFO__Count__S_Total__, new SubLObject[] { timing_info_count( v_object ), timing_info_total( v_object ), timing_info_max( v_object )
    } );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6144L)
  public static SubLObject time_functionP(final SubLObject function_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $utilize_timing_hooks$.getDynamicValue( thread ) && ( NIL != $all_currently_active$.getDynamicValue( thread ) || NIL != subl_promotions.memberP( function_name, $timed_funs$.getDynamicValue(
        thread ), UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6426L)
  public static SubLObject record_time(final SubLObject function_name, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject timing_info = Hashtables.gethash( function_name, $timing_table$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL != timing_info )
    {
      update_timing_info( timing_info, time );
    }
    else
    {
      Hashtables.sethash( function_name, $timing_table$.getDynamicValue( thread ), new_timing_info( time ) );
    }
    return timing_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6792L)
  public static SubLObject new_timing_info(final SubLObject time)
  {
    final SubLObject timing_info = make_timing_info( UNPROVIDED );
    _csetf_timing_info_count( timing_info, ONE_INTEGER );
    _csetf_timing_info_total( timing_info, time );
    _csetf_timing_info_max( timing_info, time );
    return timing_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7135L)
  public static SubLObject update_timing_info(final SubLObject timing_info, final SubLObject time)
  {
    _csetf_timing_info_count( timing_info, Numbers.add( timing_info_count( timing_info ), ONE_INTEGER ) );
    _csetf_timing_info_total( timing_info, Numbers.add( timing_info_total( timing_info ), time ) );
    if( time.numG( timing_info_max( timing_info ) ) )
    {
      _csetf_timing_info_max( timing_info, time );
    }
    return timing_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7486L)
  public static SubLObject deftimed_generic(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject defining_form = NIL;
    SubLObject fun = NIL;
    SubLObject args = NIL;
    SubLObject stuff = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    defining_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    stuff = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject local_timer = $sym36$LOCAL_TIMER;
    final SubLObject result = $sym37$RESULT;
    final SubLObject f2 = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( fun ), $str38$_IN_TIMER ), UNPROVIDED );
    return ConsesLow.list( $sym39$PROGN, ConsesLow.listS( defining_form, fun, args, ConsesLow.append( stuff, ConsesLow.list( ConsesLow.list( $sym40$PIF, ConsesLow.list( $sym41$TIME_FUNCTION_, ConsesLow.list(
        $sym42$QUOTE, fun ) ), ConsesLow.list( $sym0$CLET, ConsesLow.list( local_timer, result ), ConsesLow.list( $sym43$CTIME, local_timer, ConsesLow.list( $sym44$CSETQ, result, ConsesLow.list(
            $sym45$MULTIPLE_VALUE_LIST, reader.bq_cons( f2, ConsesLow.append( utilities_macros.argnames_from_arglist( args ), NIL ) ) ) ) ), ConsesLow.list( $sym46$RECORD_TIME, ConsesLow.list( $sym42$QUOTE, fun ),
                local_timer ), ConsesLow.list( $sym47$RET, ConsesLow.list( $sym48$VALUES_LIST, result ) ) ), ConsesLow.list( $sym47$RET, reader.bq_cons( f2, ConsesLow.append( utilities_macros.argnames_from_arglist(
                    args ), NIL ) ) ) ) ) ) ), ConsesLow.listS( $sym49$DEFINE_PRIVATE, f2, args, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8272L)
  public static SubLObject deftimed_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fun = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    final SubLObject stuff;
    current = ( stuff = current.first() );
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DEFTIMED_GENERIC, $sym49$DEFINE_PRIVATE, fun, args, stuff, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8488L)
  public static SubLObject deftimed_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fun = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    final SubLObject stuff;
    current = ( stuff = current.first() );
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DEFTIMED_GENERIC, $sym52$DEFINE_PROTECTED, fun, args, stuff, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8625L)
  public static SubLObject deftimed(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fun = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    final SubLObject stuff;
    current = ( stuff = current.first() );
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DEFTIMED_GENERIC, $sym53$DEFINE, fun, args, stuff, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8742L)
  public static SubLObject deftimed_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fun = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    final SubLObject stuff;
    current = ( stuff = current.first() );
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DEFTIMED_GENERIC, $sym54$DEFINE_PUBLIC, fun, args, stuff, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8873L)
  public static SubLObject deftimed_api(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fun = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    fun = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    final SubLObject stuff;
    current = ( stuff = current.first() );
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DEFTIMED_GENERIC, $sym55$DEFINE_API, fun, args, stuff, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_timing_file()
  {
    SubLFiles.declareMacro( me, "with_new_testing_environement", "WITH-NEW-TESTING-ENVIRONEMENT" );
    SubLFiles.declareMacro( me, "timing_no_functions", "TIMING-NO-FUNCTIONS" );
    SubLFiles.declareMacro( me, "timing_all_functions", "TIMING-ALL-FUNCTIONS" );
    SubLFiles.declareMacro( me, "timing_these_functions", "TIMING-THESE-FUNCTIONS" );
    SubLFiles.declareFunction( me, "report_fun", "REPORT-FUN", 1, 0, false );
    SubLFiles.declareFunction( me, "report_time", "REPORT-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "report_timing_info", "REPORT-TIMING-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "report_time_testing_info", "REPORT-TIME-TESTING-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_timing_info", "CLEAR-TIMING-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_time_testing_info", "CLEAR-TIME-TESTING-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "timing_info_print_function_trampoline", "TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "timing_info_p", "TIMING-INFO-P", 1, 0, false );
    new $timing_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "timing_info_count", "TIMING-INFO-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "timing_info_total", "TIMING-INFO-TOTAL", 1, 0, false );
    SubLFiles.declareFunction( me, "timing_info_max", "TIMING-INFO-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_timing_info_count", "_CSETF-TIMING-INFO-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_timing_info_total", "_CSETF-TIMING-INFO-TOTAL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_timing_info_max", "_CSETF-TIMING-INFO-MAX", 2, 0, false );
    SubLFiles.declareFunction( me, "make_timing_info", "MAKE-TIMING-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_timing_info", "VISIT-DEFSTRUCT-TIMING-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_timing_info_method", "VISIT-DEFSTRUCT-OBJECT-TIMING-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_timing_info", "PRINT-TIMING-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "time_functionP", "TIME-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "record_time", "RECORD-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "new_timing_info", "NEW-TIMING-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "update_timing_info", "UPDATE-TIMING-INFO", 2, 0, false );
    SubLFiles.declareMacro( me, "deftimed_generic", "DEFTIMED-GENERIC" );
    SubLFiles.declareMacro( me, "deftimed_private", "DEFTIMED-PRIVATE" );
    SubLFiles.declareMacro( me, "deftimed_protected", "DEFTIMED-PROTECTED" );
    SubLFiles.declareMacro( me, "deftimed", "DEFTIMED" );
    SubLFiles.declareMacro( me, "deftimed_public", "DEFTIMED-PUBLIC" );
    SubLFiles.declareMacro( me, "deftimed_api", "DEFTIMED-API" );
    return NIL;
  }

  public static SubLObject init_timing_file()
  {
    $time_testing_environment$ = SubLFiles.defparameter( "*TIME-TESTING-ENVIRONMENT*", Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $timing_table$ = SubLFiles.defparameter( "*TIMING-TABLE*", Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $utilize_timing_hooks$ = SubLFiles.defparameter( "*UTILIZE-TIMING-HOOKS*", T );
    $all_currently_active$ = SubLFiles.defparameter( "*ALL-CURRENTLY-ACTIVE*", NIL );
    $timed_funs$ = SubLFiles.defparameter( "*TIMED-FUNS*", NIL );
    $dtp_timing_info$ = SubLFiles.defconstant( "*DTP-TIMING-INFO*", $sym10$TIMING_INFO );
    return NIL;
  }

  public static SubLObject setup_timing_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_timing_info$.getGlobalValue(), Symbols.symbol_function( $sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list18 );
    Structures.def_csetf( $sym19$TIMING_INFO_COUNT, $sym20$_CSETF_TIMING_INFO_COUNT );
    Structures.def_csetf( $sym21$TIMING_INFO_TOTAL, $sym22$_CSETF_TIMING_INFO_TOTAL );
    Structures.def_csetf( $sym23$TIMING_INFO_MAX, $sym24$_CSETF_TIMING_INFO_MAX );
    Equality.identity( $sym10$TIMING_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_timing_info$.getGlobalValue(), Symbols.symbol_function( $sym33$VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_timing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_timing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_timing_file();
  }
  static
  {
    me = new timing();
    $time_testing_environment$ = null;
    $timing_table$ = null;
    $utilize_timing_hooks$ = null;
    $all_currently_active$ = null;
    $timed_funs$ = null;
    $dtp_timing_info$ = null;
    $sym0$CLET = makeSymbol( "CLET" );
    $list1 = ConsesLow.list( makeSymbol( "*TIMING-TABLE*" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), TEN_INTEGER ) );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "*UTILIZE-TIMING-HOOKS*" ), NIL ), ConsesLow.list( makeSymbol( "*ALL-CURRENTLY-ACTIVE*" ), NIL ) );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*UTILIZE-TIMING-HOOKS*" ), T ), ConsesLow.list( makeSymbol( "*ALL-CURRENTLY-ACTIVE*" ), T ) );
    $list4 = ConsesLow.list( makeSymbol( "FUNCTIONS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list5 = ConsesLow.list( makeSymbol( "*UTILIZE-TIMING-HOOKS*" ), T );
    $list6 = ConsesLow.list( makeSymbol( "*ALL-CURRENTLY-ACTIVE*" ), NIL );
    $sym7$_TIMED_FUNS_ = makeSymbol( "*TIMED-FUNS*" );
    $str8$Timing_info_cleared = makeString( "Timing info cleared" );
    $str9$Time_testing_environment_cleared = makeString( "Time testing environment cleared" );
    $sym10$TIMING_INFO = makeSymbol( "TIMING-INFO" );
    $sym11$TIMING_INFO_P = makeSymbol( "TIMING-INFO-P" );
    $list12 = ConsesLow.list( makeSymbol( "COUNT" ), makeSymbol( "TOTAL" ), makeSymbol( "MAX" ) );
    $list13 = ConsesLow.list( makeKeyword( "COUNT" ), makeKeyword( "TOTAL" ), makeKeyword( "MAX" ) );
    $list14 = ConsesLow.list( makeSymbol( "TIMING-INFO-COUNT" ), makeSymbol( "TIMING-INFO-TOTAL" ), makeSymbol( "TIMING-INFO-MAX" ) );
    $list15 = ConsesLow.list( makeSymbol( "_CSETF-TIMING-INFO-COUNT" ), makeSymbol( "_CSETF-TIMING-INFO-TOTAL" ), makeSymbol( "_CSETF-TIMING-INFO-MAX" ) );
    $sym16$PRINT_TIMING_INFO = makeSymbol( "PRINT-TIMING-INFO" );
    $sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list18 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TIMING-INFO-P" ) );
    $sym19$TIMING_INFO_COUNT = makeSymbol( "TIMING-INFO-COUNT" );
    $sym20$_CSETF_TIMING_INFO_COUNT = makeSymbol( "_CSETF-TIMING-INFO-COUNT" );
    $sym21$TIMING_INFO_TOTAL = makeSymbol( "TIMING-INFO-TOTAL" );
    $sym22$_CSETF_TIMING_INFO_TOTAL = makeSymbol( "_CSETF-TIMING-INFO-TOTAL" );
    $sym23$TIMING_INFO_MAX = makeSymbol( "TIMING-INFO-MAX" );
    $sym24$_CSETF_TIMING_INFO_MAX = makeSymbol( "_CSETF-TIMING-INFO-MAX" );
    $kw25$COUNT = makeKeyword( "COUNT" );
    $kw26$TOTAL = makeKeyword( "TOTAL" );
    $kw27$MAX = makeKeyword( "MAX" );
    $str28$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw29$BEGIN = makeKeyword( "BEGIN" );
    $sym30$MAKE_TIMING_INFO = makeSymbol( "MAKE-TIMING-INFO" );
    $kw31$SLOT = makeKeyword( "SLOT" );
    $kw32$END = makeKeyword( "END" );
    $sym33$VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TIMING-INFO-METHOD" );
    $str34$____TIMING_INFO__Count__S_Total__ = makeString( "~&#<TIMING-INFO: Count=~S Total=~S Max=~S>~%" );
    $list35 = ConsesLow.list( makeSymbol( "DEFINING-FORM" ), makeSymbol( "FUN" ), makeSymbol( "ARGS" ), makeSymbol( "STUFF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$LOCAL_TIMER = makeUninternedSymbol( "LOCAL-TIMER" );
    $sym37$RESULT = makeUninternedSymbol( "RESULT" );
    $str38$_IN_TIMER = makeString( "-IN-TIMER" );
    $sym39$PROGN = makeSymbol( "PROGN" );
    $sym40$PIF = makeSymbol( "PIF" );
    $sym41$TIME_FUNCTION_ = makeSymbol( "TIME-FUNCTION?" );
    $sym42$QUOTE = makeSymbol( "QUOTE" );
    $sym43$CTIME = makeSymbol( "CTIME" );
    $sym44$CSETQ = makeSymbol( "CSETQ" );
    $sym45$MULTIPLE_VALUE_LIST = makeSymbol( "MULTIPLE-VALUE-LIST" );
    $sym46$RECORD_TIME = makeSymbol( "RECORD-TIME" );
    $sym47$RET = makeSymbol( "RET" );
    $sym48$VALUES_LIST = makeSymbol( "VALUES-LIST" );
    $sym49$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $list50 = ConsesLow.list( makeSymbol( "FUN" ), makeSymbol( "ARGS" ), ConsesLow.list( makeSymbol( "&REST" ), makeSymbol( "STUFF" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym51$DEFTIMED_GENERIC = makeSymbol( "DEFTIMED-GENERIC" );
    $sym52$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $sym53$DEFINE = makeSymbol( "DEFINE" );
    $sym54$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym55$DEFINE_API = makeSymbol( "DEFINE-API" );
  }

  public static final class $timing_info_native
      extends
        SubLStructNative
  {
    public SubLObject $count;
    public SubLObject $total;
    public SubLObject $max;
    private static final SubLStructDeclNative structDecl;

    public $timing_info_native()
    {
      this.$count = CommonSymbols.NIL;
      this.$total = CommonSymbols.NIL;
      this.$max = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $timing_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$count;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$total;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$max;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$count = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$total = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$max = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $timing_info_native.class, $sym10$TIMING_INFO, $sym11$TIMING_INFO_P, $list12, $list13, new String[] { "$count", "$total", "$max"
      }, $list14, $list15, $sym16$PRINT_TIMING_INFO );
    }
  }

  public static final class $timing_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $timing_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TIMING-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return timing_info_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 306 ms
 * 
 */