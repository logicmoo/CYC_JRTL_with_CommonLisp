package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parallelism_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.parallelism_utilities";
  public static final String myFingerPrint = "9431b4a03c37a120b0ce510e7175000886ed3f44372077c49b3af59d0234cfdd";
  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLSymbol $dtp_parallel_iterator$;
  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 8855L)
  public static SubLSymbol $current_pariter$;
  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 9020L)
  public static SubLSymbol $current_pariter_index$;
  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 15080L)
  private static SubLSymbol $parallel_filter_method$;
  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 16178L)
  private static SubLSymbol $parallel_key_method$;
  private static final SubLSymbol $sym0$PARALLEL_ITERATOR;
  private static final SubLSymbol $sym1$PARALLEL_ITERATOR_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$PARALLEL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PARITER_SOURCE_ITERATOR;
  private static final SubLSymbol $sym10$_CSETF_PARITER_SOURCE_ITERATOR;
  private static final SubLSymbol $sym11$PARITER_FUNCTION;
  private static final SubLSymbol $sym12$_CSETF_PARITER_FUNCTION;
  private static final SubLSymbol $sym13$PARITER_SHARED_ARGS;
  private static final SubLSymbol $sym14$_CSETF_PARITER_SHARED_ARGS;
  private static final SubLSymbol $sym15$PARITER_SVS;
  private static final SubLSymbol $sym16$_CSETF_PARITER_SVS;
  private static final SubLSymbol $sym17$PARITER_WIDTH;
  private static final SubLSymbol $sym18$_CSETF_PARITER_WIDTH;
  private static final SubLSymbol $sym19$PARITER_BATCH;
  private static final SubLSymbol $sym20$_CSETF_PARITER_BATCH;
  private static final SubLSymbol $sym21$PARITER_TOTAL;
  private static final SubLSymbol $sym22$_CSETF_PARITER_TOTAL;
  private static final SubLSymbol $sym23$PARITER_SOFAR;
  private static final SubLSymbol $sym24$_CSETF_PARITER_SOFAR;
  private static final SubLSymbol $sym25$PARITER_MESSAGE;
  private static final SubLSymbol $sym26$_CSETF_PARITER_MESSAGE;
  private static final SubLSymbol $sym27$PARITER_INITIALIZER;
  private static final SubLSymbol $sym28$_CSETF_PARITER_INITIALIZER;
  private static final SubLSymbol $sym29$PARITER_REDUCER;
  private static final SubLSymbol $sym30$_CSETF_PARITER_REDUCER;
  private static final SubLSymbol $sym31$PARITER_FINAL_RESULT;
  private static final SubLSymbol $sym32$_CSETF_PARITER_FINAL_RESULT;
  private static final SubLSymbol $sym33$PARITER_LOCK;
  private static final SubLSymbol $sym34$_CSETF_PARITER_LOCK;
  private static final SubLSymbol $sym35$PARITER_BEGIN_SEMAPHORE;
  private static final SubLSymbol $sym36$_CSETF_PARITER_BEGIN_SEMAPHORE;
  private static final SubLSymbol $sym37$PARITER_FINISH_SEMAPHORE;
  private static final SubLSymbol $sym38$_CSETF_PARITER_FINISH_SEMAPHORE;
  private static final SubLSymbol $sym39$PARITER_PROCESS_POOL;
  private static final SubLSymbol $sym40$_CSETF_PARITER_PROCESS_POOL;
  private static final SubLSymbol $sym41$PARITER_PROGRESS_INDICATOR;
  private static final SubLSymbol $sym42$_CSETF_PARITER_PROGRESS_INDICATOR;
  private static final SubLSymbol $kw43$SOURCE_ITERATOR;
  private static final SubLSymbol $kw44$FUNCTION;
  private static final SubLSymbol $kw45$SHARED_ARGS;
  private static final SubLSymbol $kw46$SVS;
  private static final SubLSymbol $kw47$WIDTH;
  private static final SubLSymbol $kw48$BATCH;
  private static final SubLSymbol $kw49$TOTAL;
  private static final SubLSymbol $kw50$SOFAR;
  private static final SubLSymbol $kw51$MESSAGE;
  private static final SubLSymbol $kw52$INITIALIZER;
  private static final SubLSymbol $kw53$REDUCER;
  private static final SubLSymbol $kw54$FINAL_RESULT;
  private static final SubLSymbol $kw55$LOCK;
  private static final SubLSymbol $kw56$BEGIN_SEMAPHORE;
  private static final SubLSymbol $kw57$FINISH_SEMAPHORE;
  private static final SubLSymbol $kw58$PROCESS_POOL;
  private static final SubLSymbol $kw59$PROGRESS_INDICATOR;
  private static final SubLString $str60$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw61$BEGIN;
  private static final SubLSymbol $sym62$MAKE_PARALLEL_ITERATOR;
  private static final SubLSymbol $kw63$SLOT;
  private static final SubLSymbol $kw64$END;
  private static final SubLSymbol $sym65$VISIT_DEFSTRUCT_OBJECT_PARALLEL_ITERATOR_METHOD;
  private static final SubLSymbol $sym66$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym67$ITERATOR_P;
  private static final SubLSymbol $sym68$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym69$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym70$STRINGP;
  private static final SubLSymbol $kw71$UNINITIALIZED;
  private static final SubLString $str72$PARITER;
  private static final SubLString $str73$PARITER_begin;
  private static final SubLString $str74$PARITER_finish;
  private static final SubLString $str75$PARITER_process_;
  private static final SubLString $str76$_;
  private static final SubLSymbol $sym77$PARITER_PROCESS_METHOD;
  private static final SubLString $str78$PARITER_progress;
  private static final SubLSymbol $sym79$PARITER_PROGRESS_METHOD;
  private static final SubLSymbol $kw80$HALTED;
  private static final SubLSymbol $kw81$FINISHED;
  private static final SubLString $str82$PARITER_obtaining_items;
  private static final SubLString $str83$PARITER_reducing_final_result;
  private static final SubLString $str84$PARITER_incrementing_sofar;
  private static final SubLSymbol $kw85$KEY;
  private static final SubLSymbol $kw86$START;
  private static final SubLSymbol $sym87$_PARALLEL_FILTER_METHOD_;
  private static final SubLSymbol $sym88$_PARALLEL_KEY_METHOD_;
  private static final SubLSymbol $sym89$_;
  private static final SubLSymbol $sym90$PARALLEL_FILTER_MATCH_COUNT;
  private static final SubLInteger $int91$1000;
  private static final SubLString $str92$counting_assertions_;
  private static final SubLString $str93$_way;
  private static final SubLSymbol $sym94$ONE;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 841L)
  public static SubLObject parallel_extract_options(final SubLObject options)
  {
    return conses_high.copy_list( options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject parallel_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject parallel_iterator_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$parallel_iterator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_source_iterator(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_function(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_shared_args(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_svs(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_width(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_batch(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_total(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_sofar(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_message(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_initializer(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_reducer(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_final_result(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_lock(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_begin_semaphore(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_finish_semaphore(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_process_pool(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject pariter_progress_indicator(final SubLObject v_object)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.getField18();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_source_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_shared_args(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_svs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_width(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_batch(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_total(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_sofar(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_message(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_initializer(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_reducer(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_final_result(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_begin_semaphore(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_finish_semaphore(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_process_pool(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject _csetf_pariter_progress_indicator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parallel_iterator_p( v_object ) : v_object;
    return v_object.setField18( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject make_parallel_iterator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $parallel_iterator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw43$SOURCE_ITERATOR ) )
      {
        _csetf_pariter_source_iterator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$FUNCTION ) )
      {
        _csetf_pariter_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$SHARED_ARGS ) )
      {
        _csetf_pariter_shared_args( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$SVS ) )
      {
        _csetf_pariter_svs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$WIDTH ) )
      {
        _csetf_pariter_width( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$BATCH ) )
      {
        _csetf_pariter_batch( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$TOTAL ) )
      {
        _csetf_pariter_total( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$SOFAR ) )
      {
        _csetf_pariter_sofar( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$MESSAGE ) )
      {
        _csetf_pariter_message( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$INITIALIZER ) )
      {
        _csetf_pariter_initializer( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$REDUCER ) )
      {
        _csetf_pariter_reducer( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$FINAL_RESULT ) )
      {
        _csetf_pariter_final_result( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$LOCK ) )
      {
        _csetf_pariter_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$BEGIN_SEMAPHORE ) )
      {
        _csetf_pariter_begin_semaphore( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$FINISH_SEMAPHORE ) )
      {
        _csetf_pariter_finish_semaphore( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$PROCESS_POOL ) )
      {
        _csetf_pariter_process_pool( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$PROGRESS_INDICATOR ) )
      {
        _csetf_pariter_progress_indicator( v_new, current_value );
      }
      else
      {
        Errors.error( $str60$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject visit_defstruct_parallel_iterator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw61$BEGIN, $sym62$MAKE_PARALLEL_ITERATOR, SEVENTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw43$SOURCE_ITERATOR, pariter_source_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw44$FUNCTION, pariter_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw45$SHARED_ARGS, pariter_shared_args( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw46$SVS, pariter_svs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw47$WIDTH, pariter_width( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw48$BATCH, pariter_batch( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw49$TOTAL, pariter_total( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw50$SOFAR, pariter_sofar( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw51$MESSAGE, pariter_message( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw52$INITIALIZER, pariter_initializer( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw53$REDUCER, pariter_reducer( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw54$FINAL_RESULT, pariter_final_result( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw55$LOCK, pariter_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw56$BEGIN_SEMAPHORE, pariter_begin_semaphore( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw57$FINISH_SEMAPHORE, pariter_finish_semaphore( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw58$PROCESS_POOL, pariter_process_pool( obj ) );
    Functions.funcall( visitor_fn, obj, $kw63$SLOT, $kw59$PROGRESS_INDICATOR, pariter_progress_indicator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$END, $sym62$MAKE_PARALLEL_ITERATOR, SEVENTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 2614L)
  public static SubLObject visit_defstruct_object_parallel_iterator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_parallel_iterator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 3691L)
  public static SubLObject new_parallel_iterator(final SubLObject function, final SubLObject iterator, final SubLObject options)
  {
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != iteration.iterator_p( iterator ) : iterator;
    final SubLObject shared_args_tail = cdestructuring_bind.property_list_member( $kw45$SHARED_ARGS, options );
    final SubLObject shared_args = ( NIL != shared_args_tail ) ? conses_high.cadr( shared_args_tail ) : NIL;
    final SubLObject svs_tail = cdestructuring_bind.property_list_member( $kw46$SVS, options );
    final SubLObject svs = ( NIL != svs_tail ) ? conses_high.cadr( svs_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw47$WIDTH, options );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : TWO_INTEGER;
    final SubLObject total_tail = cdestructuring_bind.property_list_member( $kw49$TOTAL, options );
    final SubLObject total = ( NIL != total_tail ) ? conses_high.cadr( total_tail ) : NIL;
    final SubLObject batch_tail = cdestructuring_bind.property_list_member( $kw48$BATCH, options );
    SubLObject batch = ( NIL != batch_tail ) ? conses_high.cadr( batch_tail ) : ONE_INTEGER;
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw51$MESSAGE, options );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : NIL;
    final SubLObject initializer_tail = cdestructuring_bind.property_list_member( $kw52$INITIALIZER, options );
    final SubLObject initializer = ( NIL != initializer_tail ) ? conses_high.cadr( initializer_tail ) : NIL;
    final SubLObject reducer_tail = cdestructuring_bind.property_list_member( $kw53$REDUCER, options );
    final SubLObject reducer = ( NIL != reducer_tail ) ? conses_high.cadr( reducer_tail ) : NIL;
    assert NIL != subl_promotions.positive_integer_p( width ) : width;
    if( NIL == batch )
    {
      assert NIL != subl_promotions.non_negative_integer_p( total ) : total;
      batch = Numbers.max( ONE_INTEGER, Numbers.ceiling( Numbers.integerDivide( total, width ), UNPROVIDED ) );
    }
    assert NIL != subl_promotions.non_negative_integer_p( batch ) : batch;
    if( NIL != message && !assertionsDisabledSynth && NIL == Types.stringp( message ) )
    {
      throw new AssertionError( message );
    }
    final SubLObject pariter = make_parallel_iterator( UNPROVIDED );
    _csetf_pariter_source_iterator( pariter, iterator );
    _csetf_pariter_function( pariter, function );
    _csetf_pariter_shared_args( pariter, shared_args );
    _csetf_pariter_svs( pariter, svs );
    _csetf_pariter_width( pariter, width );
    _csetf_pariter_batch( pariter, batch );
    _csetf_pariter_total( pariter, total );
    _csetf_pariter_sofar( pariter, ZERO_INTEGER );
    _csetf_pariter_message( pariter, message );
    _csetf_pariter_initializer( pariter, initializer );
    _csetf_pariter_reducer( pariter, reducer );
    _csetf_pariter_final_result( pariter, $kw71$UNINITIALIZED );
    _csetf_pariter_lock( pariter, Locks.make_lock( $str72$PARITER ) );
    _csetf_pariter_begin_semaphore( pariter, Semaphores.new_semaphore( $str73$PARITER_begin, ZERO_INTEGER ) );
    _csetf_pariter_finish_semaphore( pariter, Semaphores.new_semaphore( $str74$PARITER_finish, ZERO_INTEGER ) );
    _csetf_pariter_process_pool( pariter, make_pariter_process_pool( pariter ) );
    _csetf_pariter_progress_indicator( pariter, pariter_possibly_start_progress_indicator( pariter ) );
    return pariter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 5495L)
  public static SubLObject make_pariter_process_pool(final SubLObject pariter)
  {
    final SubLObject width = pariter_width( pariter );
    final SubLObject pool = Vectors.make_vector( width, $kw71$UNINITIALIZED );
    SubLObject i;
    SubLObject name;
    SubLObject args;
    SubLObject process;
    for( i = NIL, i = ZERO_INTEGER; i.numL( width ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      name = Sequences.cconcatenate( $str75$PARITER_process_, new SubLObject[] { format_nil.format_nil_a_no_copy( i ), $str76$_, format_nil.format_nil_a_no_copy( width )
      } );
      args = ConsesLow.list( pariter, i );
      process = subl_promotions.make_process_with_args( name, $sym77$PARITER_PROCESS_METHOD, args );
      Vectors.set_aref( pool, i, process );
    }
    return pool;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 5899L)
  public static SubLObject pariter_possibly_start_progress_indicator(final SubLObject pariter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = pariter_message( pariter );
    if( message.isString() )
    {
      final SubLObject name = Sequences.copy_seq( $str78$PARITER_progress );
      final SubLObject args = ConsesLow.list( pariter, StreamsLow.$standard_output$.getDynamicValue( thread ) );
      final SubLObject progress_indicator = subl_promotions.make_process_with_args( name, $sym79$PARITER_PROGRESS_METHOD, args );
      return progress_indicator;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 6259L)
  public static SubLObject parallel_map_iterator(final SubLObject function, final SubLObject iterator, SubLObject options)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLObject pariter = new_parallel_iterator( function, iterator, options );
    SubLObject result = NIL;
    SubLObject validP = NIL;
    try
    {
      result = parallel_iterator_process( pariter );
      validP = T;
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        parallel_iterator_finalize( pariter );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return Values.values( result, validP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 6762L)
  public static SubLObject parallel_iterator_process(final SubLObject pariter)
  {
    pariter_initialize_final_result( pariter );
    pariter_signal_pool_to_begin( pariter );
    pariter_wait_for_pool_to_finish( pariter );
    return pariter_final_result( pariter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 7007L)
  public static SubLObject parallel_iterator_finalize(final SubLObject pariter)
  {
    SubLObject result = NIL;
    try
    {
      final SubLObject iterator = pariter_source_iterator( pariter );
      iteration.iteration_finalize( iterator );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        result = pariter_possibly_halt_process_pool( pariter );
        result = pariter_possibly_halt_progress_indicator( pariter );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 7350L)
  public static SubLObject pariter_initialize_final_result(final SubLObject pariter)
  {
    final SubLObject final_result = pariter_initialize_batch_result( pariter );
    final SubLObject lock = pariter_lock( pariter );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_pariter_final_result( pariter, final_result );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return final_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 7629L)
  public static SubLObject pariter_signal_pool_to_begin(final SubLObject pariter)
  {
    final SubLObject begin = pariter_begin_semaphore( pariter );
    SubLObject width;
    SubLObject i;
    for( width = pariter_width( pariter ), i = NIL, i = ZERO_INTEGER; i.numL( width ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Semaphores.semaphore_signal( begin );
    }
    return width;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 7845L)
  public static SubLObject pariter_wait_for_pool_to_finish(final SubLObject pariter)
  {
    final SubLObject finish = pariter_finish_semaphore( pariter );
    SubLObject width;
    SubLObject i;
    for( width = pariter_width( pariter ), i = NIL, i = ZERO_INTEGER; i.numL( width ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Semaphores.semaphore_wait( finish );
    }
    return width;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 8066L)
  public static SubLObject pariter_possibly_halt_process_pool(final SubLObject pariter)
  {
    final SubLObject process_pool = pariter_process_pool( pariter );
    SubLObject halted = ZERO_INTEGER;
    final SubLObject lock = pariter_lock( pariter );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject vector_var = process_pool;
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject index;
      SubLObject process;
      SubLObject haltedP;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        index = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        process = Vectors.aref( vector_var, index );
        haltedP = pariter_possibly_halt_process( process );
        Vectors.set_aref( process_pool, index, ( NIL != haltedP ) ? $kw80$HALTED : $kw81$FINISHED );
        halted = Numbers.add( halted, ( NIL != haltedP ) ? ONE_INTEGER : ZERO_INTEGER );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return halted;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 8479L)
  public static SubLObject pariter_possibly_halt_process(final SubLObject process)
  {
    if( NIL != Threads.valid_process_p( process ) )
    {
      Threads.kill_process( process );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 8612L)
  public static SubLObject pariter_possibly_halt_progress_indicator(final SubLObject pariter)
  {
    final SubLObject progress_indicator = pariter_progress_indicator( pariter );
    if( NIL != Types.processp( progress_indicator ) )
    {
      return pariter_possibly_halt_process( progress_indicator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 9084L)
  public static SubLObject current_pariter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_pariter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 9149L)
  public static SubLObject current_pariter_index()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_pariter_index$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 9226L)
  public static SubLObject current_pariter_width()
  {
    final SubLObject pariter = current_pariter();
    if( NIL != pariter )
    {
      return pariter_width( pariter );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 9360L)
  public static SubLObject pariter_process_method(final SubLObject pariter, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    final SubLObject _prev_bind_0 = $current_pariter$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $current_pariter_index$.currentBinding( thread );
    try
    {
      $current_pariter$.bind( pariter, thread );
      $current_pariter_index$.bind( index, thread );
      final SubLObject svs = pariter_svs( pariter );
      pariter_wait_to_begin( pariter );
      try
      {
        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables( svs );
        final ArrayList old_values = Dynamic.extract_dynamic_values( cprogv_var );
        try
        {
          Dynamic.bind_dynamic_vars( cprogv_var, special_variable_state.with_special_variable_state_values( svs ) );
          while ( NIL == pariter_doneP( pariter ))
          {
            final SubLObject batch_items = pariter_obtain_batch_items( pariter );
            final SubLObject batch_result = pariter_process_batch_items( pariter, batch_items );
            pariter_reduce_final_result( pariter, batch_result );
          }
          successP = T;
        }
        finally
        {
          Dynamic.rebind_dynamic_vars( cprogv_var, old_values );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          pariter_signal_finish( pariter, successP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      $current_pariter_index$.rebind( _prev_bind_2, thread );
      $current_pariter$.rebind( _prev_bind_0, thread );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 10129L)
  public static SubLObject pariter_wait_to_begin(final SubLObject pariter)
  {
    final SubLObject begin = pariter_begin_semaphore( pariter );
    return Semaphores.semaphore_wait( begin );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 10279L)
  public static SubLObject pariter_doneP(final SubLObject pariter)
  {
    return iteration.iteration_done( pariter_source_iterator( pariter ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 10380L)
  public static SubLObject pariter_obtain_batch_items(final SubLObject pariter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = pariter_source_iterator( pariter );
    final SubLObject lock = pariter_lock( pariter );
    final SubLObject whostate = $str82$PARITER_obtaining_items;
    final SubLObject batch_size = pariter_batch( pariter );
    SubLObject batch_count = ZERO_INTEGER;
    SubLObject batch_items = NIL;
    SubLObject quit_earlyP = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      while ( NIL == quit_earlyP && !batch_count.numGE( batch_size ) && NIL == iteration.iteration_done( iterator ))
      {
        thread.resetMultipleValues();
        final SubLObject batch_item = iteration.iteration_next( iterator );
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != validP )
        {
          batch_items = ConsesLow.cons( batch_item, batch_items );
          batch_count = Numbers.add( batch_count, ONE_INTEGER );
        }
        else
        {
          quit_earlyP = T;
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return Sequences.nreverse( batch_items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 11023L)
  public static SubLObject pariter_process_batch_items(final SubLObject pariter, final SubLObject batch_items)
  {
    final SubLObject function = pariter_function( pariter );
    final SubLObject shared_args = pariter_shared_args( pariter );
    SubLObject batch_result = pariter_initialize_batch_result( pariter );
    final SubLObject reducer = pariter_reducer( pariter );
    SubLObject cdolist_list_var = batch_items;
    SubLObject batch_item = NIL;
    batch_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_result = pariter_process_apply( function, batch_item, shared_args );
      batch_result = pariter_reduce_within_batch( reducer, batch_result, item_result );
      cdolist_list_var = cdolist_list_var.rest();
      batch_item = cdolist_list_var.first();
    }
    pariter_increment_sofar( pariter, Sequences.length( batch_items ) );
    return batch_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 11589L)
  public static SubLObject pariter_reduce_final_result(final SubLObject pariter, final SubLObject batch_result)
  {
    final SubLObject reducer = pariter_reducer( pariter );
    if( NIL != reducer )
    {
      final SubLObject lock = pariter_lock( pariter );
      final SubLObject whostate = $str83$PARITER_reducing_final_result;
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        SubLObject final_result = pariter_final_result( pariter );
        final_result = Functions.funcall( reducer, final_result, batch_result );
        _csetf_pariter_final_result( pariter, final_result );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 12062L)
  public static SubLObject pariter_signal_finish(final SubLObject pariter, final SubLObject successP)
  {
    return Semaphores.semaphore_signal( pariter_finish_semaphore( pariter ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 12223L)
  public static SubLObject pariter_initialize_batch_result(final SubLObject pariter)
  {
    final SubLObject initializer = pariter_initializer( pariter );
    SubLObject batch_result = NIL;
    if( NIL != initializer )
    {
      if( initializer.isFunctionSpec() )
      {
        batch_result = Functions.funcall( initializer );
      }
      else if( NIL != list_utilities.self_evaluating_form_p( initializer ) )
      {
        batch_result = initializer;
      }
      else
      {
        batch_result = eval_in_api.cyc_api_eval( initializer );
      }
    }
    return batch_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 12700L)
  public static SubLObject pariter_process_apply(final SubLObject function, final SubLObject batch_item, SubLObject shared_args)
  {
    if( shared_args == UNPROVIDED )
    {
      shared_args = NIL;
    }
    if( NIL != shared_args )
    {
      return Functions.apply( function, batch_item, shared_args );
    }
    return Functions.funcall( function, batch_item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 12902L)
  public static SubLObject pariter_reduce_within_batch(final SubLObject reducer, final SubLObject batch_result, final SubLObject item_result)
  {
    if( NIL != reducer )
    {
      return Functions.funcall( reducer, batch_result, item_result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 13056L)
  public static SubLObject pariter_increment_sofar(final SubLObject pariter, final SubLObject delta)
  {
    final SubLObject lock = pariter_lock( pariter );
    final SubLObject whostate = $str84$PARITER_incrementing_sofar;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_pariter_sofar( pariter, Numbers.add( pariter_sofar( pariter ), delta ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return delta;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 13301L)
  public static SubLObject pariter_progress_method(final SubLObject pariter, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = pariter_message( pariter );
    enforceType( message, $sym70$STRINGP );
    if( NIL != pariter_total( pariter ) )
    {
      final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        StreamsLow.$standard_output$.bind( stream, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message );
          while ( NIL == pariter_doneP( pariter ))
          {
            Threads.sleep( ONE_INTEGER );
            utilities_macros.note_percent_progress( pariter_sofar( pariter ), pariter_total( pariter ) );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
        StreamsLow.$standard_output$.rebind( _prev_bind_0, thread );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 13876L)
  public static SubLObject parallel_map_assertions(final SubLObject function, SubLObject options)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    return parallel_map_iterator( function, assertion_handles.new_assertions_iterator(), options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 14378L)
  public static SubLObject parallel_map_deductions(final SubLObject function, SubLObject options)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    return parallel_map_iterator( function, deduction_handles.new_deductions_iterator(), options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 14630L)
  public static SubLObject parallel_mapc(final SubLObject function, final SubLObject list, SubLObject options)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLObject total = Sequences.length( list );
    final SubLObject overrides = ConsesLow.list( $kw49$TOTAL, total, $kw53$REDUCER, NIL, $kw52$INITIALIZER, NIL );
    final SubLObject updated_options = list_utilities.merge_plist( options, overrides );
    final SubLObject iterator = iteration.new_list_iterator( list );
    parallel_map_iterator( function, iterator, updated_options );
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 16241L)
  public static SubLObject parallel_count_if(final SubLObject test, final SubLObject seq, SubLObject options)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLObject current;
    final SubLObject datum = current = options;
    final SubLObject key_tail = cdestructuring_bind.property_list_member( $kw85$KEY, current );
    final SubLObject key = ( NIL != key_tail ) ? conses_high.cadr( key_tail ) : IDENTITY;
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw86$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : ZERO_INTEGER;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw64$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject svs_tail = cdestructuring_bind.property_list_member( $kw46$SVS, current );
    final SubLObject svs = ( NIL != svs_tail ) ? conses_high.cadr( svs_tail ) : NIL;
    final SubLObject source_iterator = iteration.new_sequence_iterator( seq, start, end );
    final SubLObject source_svs = ( NIL != svs ) ? special_variable_state.copy_special_variable_state( svs ) : NIL;
    final SubLObject override_svs = special_variable_state.new_special_variable_state_from_alist( ConsesLow.list( reader.bq_cons( $sym87$_PARALLEL_FILTER_METHOD_, test ), reader.bq_cons( $sym88$_PARALLEL_KEY_METHOD_,
        key ) ) );
    final SubLObject extended_svs = ( NIL != source_svs ) ? special_variable_state.nmerge_special_variable_state( source_svs, override_svs ) : override_svs;
    final SubLObject source_options = parallel_extract_options( options );
    final SubLObject override_options = ConsesLow.list( $kw46$SVS, extended_svs, $kw49$TOTAL, Sequences.length( seq ), $kw52$INITIALIZER, ZERO_INTEGER, $kw53$REDUCER, $sym89$_ );
    final SubLObject parallel_options = list_utilities.merge_plist( source_options, override_options );
    final SubLObject result = parallel_map_iterator( $sym90$PARALLEL_FILTER_MATCH_COUNT, source_iterator, parallel_options );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 17205L)
  public static SubLObject parallel_filter_match_count(final SubLObject item)
  {
    return enumeration_types.boolean_to_match_count( parallel_filter_matchP( item ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 17465L)
  public static SubLObject parallel_filter_matchP(SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    item = Functions.funcall( $parallel_key_method$.getDynamicValue( thread ), item );
    return Functions.funcall( $parallel_filter_method$.getDynamicValue( thread ), item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parallelism-utilities.lisp", position = 17615L)
  public static SubLObject test_parallel_count_assertions(SubLObject width, SubLObject batch)
  {
    if( width == UNPROVIDED )
    {
      width = TWO_INTEGER;
    }
    if( batch == UNPROVIDED )
    {
      batch = $int91$1000;
    }
    final SubLObject options = ConsesLow.list( new SubLObject[] { $kw47$WIDTH, width, $kw46$SVS, NIL, $kw48$BATCH, batch, $kw49$TOTAL, assertion_handles.assertion_count(), $kw53$REDUCER, $sym89$_, $kw52$INITIALIZER,
      ZERO_INTEGER, $kw51$MESSAGE, Sequences.cconcatenate( $str92$counting_assertions_, new SubLObject[]
      { format_nil.format_nil_a_no_copy( width ), $str93$_way
      } )
    } );
    final SubLObject result = parallel_map_assertions( $sym94$ONE, options );
    return result;
  }

  public static SubLObject declare_parallelism_utilities_file()
  {
    SubLFiles.declareFunction( me, "parallel_extract_options", "PARALLEL-EXTRACT-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "parallel_iterator_print_function_trampoline", "PARALLEL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "parallel_iterator_p", "PARALLEL-ITERATOR-P", 1, 0, false );
    new $parallel_iterator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "pariter_source_iterator", "PARITER-SOURCE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_function", "PARITER-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_shared_args", "PARITER-SHARED-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_svs", "PARITER-SVS", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_width", "PARITER-WIDTH", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_batch", "PARITER-BATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_total", "PARITER-TOTAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_sofar", "PARITER-SOFAR", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_message", "PARITER-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_initializer", "PARITER-INITIALIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_reducer", "PARITER-REDUCER", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_final_result", "PARITER-FINAL-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_lock", "PARITER-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_begin_semaphore", "PARITER-BEGIN-SEMAPHORE", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_finish_semaphore", "PARITER-FINISH-SEMAPHORE", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_process_pool", "PARITER-PROCESS-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_progress_indicator", "PARITER-PROGRESS-INDICATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_source_iterator", "_CSETF-PARITER-SOURCE-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_function", "_CSETF-PARITER-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_shared_args", "_CSETF-PARITER-SHARED-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_svs", "_CSETF-PARITER-SVS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_width", "_CSETF-PARITER-WIDTH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_batch", "_CSETF-PARITER-BATCH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_total", "_CSETF-PARITER-TOTAL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_sofar", "_CSETF-PARITER-SOFAR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_message", "_CSETF-PARITER-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_initializer", "_CSETF-PARITER-INITIALIZER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_reducer", "_CSETF-PARITER-REDUCER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_final_result", "_CSETF-PARITER-FINAL-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_lock", "_CSETF-PARITER-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_begin_semaphore", "_CSETF-PARITER-BEGIN-SEMAPHORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_finish_semaphore", "_CSETF-PARITER-FINISH-SEMAPHORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_process_pool", "_CSETF-PARITER-PROCESS-POOL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pariter_progress_indicator", "_CSETF-PARITER-PROGRESS-INDICATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "make_parallel_iterator", "MAKE-PARALLEL-ITERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_parallel_iterator", "VISIT-DEFSTRUCT-PARALLEL-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_parallel_iterator_method", "VISIT-DEFSTRUCT-OBJECT-PARALLEL-ITERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_parallel_iterator", "NEW-PARALLEL-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "make_pariter_process_pool", "MAKE-PARITER-PROCESS-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_possibly_start_progress_indicator", "PARITER-POSSIBLY-START-PROGRESS-INDICATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "parallel_map_iterator", "PARALLEL-MAP-ITERATOR", 2, 1, false );
    SubLFiles.declareFunction( me, "parallel_iterator_process", "PARALLEL-ITERATOR-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "parallel_iterator_finalize", "PARALLEL-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_initialize_final_result", "PARITER-INITIALIZE-FINAL-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_signal_pool_to_begin", "PARITER-SIGNAL-POOL-TO-BEGIN", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_wait_for_pool_to_finish", "PARITER-WAIT-FOR-POOL-TO-FINISH", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_possibly_halt_process_pool", "PARITER-POSSIBLY-HALT-PROCESS-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_possibly_halt_process", "PARITER-POSSIBLY-HALT-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_possibly_halt_progress_indicator", "PARITER-POSSIBLY-HALT-PROGRESS-INDICATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "current_pariter", "CURRENT-PARITER", 0, 0, false );
    SubLFiles.declareFunction( me, "current_pariter_index", "CURRENT-PARITER-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "current_pariter_width", "CURRENT-PARITER-WIDTH", 0, 0, false );
    SubLFiles.declareFunction( me, "pariter_process_method", "PARITER-PROCESS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pariter_wait_to_begin", "PARITER-WAIT-TO-BEGIN", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_doneP", "PARITER-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_obtain_batch_items", "PARITER-OBTAIN-BATCH-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_process_batch_items", "PARITER-PROCESS-BATCH-ITEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "pariter_reduce_final_result", "PARITER-REDUCE-FINAL-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "pariter_signal_finish", "PARITER-SIGNAL-FINISH", 2, 0, false );
    SubLFiles.declareFunction( me, "pariter_initialize_batch_result", "PARITER-INITIALIZE-BATCH-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "pariter_process_apply", "PARITER-PROCESS-APPLY", 2, 1, false );
    SubLFiles.declareFunction( me, "pariter_reduce_within_batch", "PARITER-REDUCE-WITHIN-BATCH", 3, 0, false );
    SubLFiles.declareFunction( me, "pariter_increment_sofar", "PARITER-INCREMENT-SOFAR", 2, 0, false );
    SubLFiles.declareFunction( me, "pariter_progress_method", "PARITER-PROGRESS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parallel_map_assertions", "PARALLEL-MAP-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "parallel_map_deductions", "PARALLEL-MAP-DEDUCTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "parallel_mapc", "PARALLEL-MAPC", 2, 1, false );
    SubLFiles.declareFunction( me, "parallel_count_if", "PARALLEL-COUNT-IF", 2, 1, false );
    SubLFiles.declareFunction( me, "parallel_filter_match_count", "PARALLEL-FILTER-MATCH-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "parallel_filter_matchP", "PARALLEL-FILTER-MATCH?", 1, 0, false );
    SubLFiles.declareFunction( me, "test_parallel_count_assertions", "TEST-PARALLEL-COUNT-ASSERTIONS", 0, 2, false );
    return NIL;
  }

  public static SubLObject init_parallelism_utilities_file()
  {
    $dtp_parallel_iterator$ = SubLFiles.defconstant( "*DTP-PARALLEL-ITERATOR*", $sym0$PARALLEL_ITERATOR );
    $current_pariter$ = SubLFiles.defparameter( "*CURRENT-PARITER*", $kw71$UNINITIALIZED );
    $current_pariter_index$ = SubLFiles.defparameter( "*CURRENT-PARITER-INDEX*", $kw71$UNINITIALIZED );
    $parallel_filter_method$ = SubLFiles.defparameter( "*PARALLEL-FILTER-METHOD*", $kw71$UNINITIALIZED );
    $parallel_key_method$ = SubLFiles.defparameter( "*PARALLEL-KEY-METHOD*", $kw71$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_parallelism_utilities_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_parallel_iterator$.getGlobalValue(), Symbols.symbol_function( $sym7$PARALLEL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$PARITER_SOURCE_ITERATOR, $sym10$_CSETF_PARITER_SOURCE_ITERATOR );
    Structures.def_csetf( $sym11$PARITER_FUNCTION, $sym12$_CSETF_PARITER_FUNCTION );
    Structures.def_csetf( $sym13$PARITER_SHARED_ARGS, $sym14$_CSETF_PARITER_SHARED_ARGS );
    Structures.def_csetf( $sym15$PARITER_SVS, $sym16$_CSETF_PARITER_SVS );
    Structures.def_csetf( $sym17$PARITER_WIDTH, $sym18$_CSETF_PARITER_WIDTH );
    Structures.def_csetf( $sym19$PARITER_BATCH, $sym20$_CSETF_PARITER_BATCH );
    Structures.def_csetf( $sym21$PARITER_TOTAL, $sym22$_CSETF_PARITER_TOTAL );
    Structures.def_csetf( $sym23$PARITER_SOFAR, $sym24$_CSETF_PARITER_SOFAR );
    Structures.def_csetf( $sym25$PARITER_MESSAGE, $sym26$_CSETF_PARITER_MESSAGE );
    Structures.def_csetf( $sym27$PARITER_INITIALIZER, $sym28$_CSETF_PARITER_INITIALIZER );
    Structures.def_csetf( $sym29$PARITER_REDUCER, $sym30$_CSETF_PARITER_REDUCER );
    Structures.def_csetf( $sym31$PARITER_FINAL_RESULT, $sym32$_CSETF_PARITER_FINAL_RESULT );
    Structures.def_csetf( $sym33$PARITER_LOCK, $sym34$_CSETF_PARITER_LOCK );
    Structures.def_csetf( $sym35$PARITER_BEGIN_SEMAPHORE, $sym36$_CSETF_PARITER_BEGIN_SEMAPHORE );
    Structures.def_csetf( $sym37$PARITER_FINISH_SEMAPHORE, $sym38$_CSETF_PARITER_FINISH_SEMAPHORE );
    Structures.def_csetf( $sym39$PARITER_PROCESS_POOL, $sym40$_CSETF_PARITER_PROCESS_POOL );
    Structures.def_csetf( $sym41$PARITER_PROGRESS_INDICATOR, $sym42$_CSETF_PARITER_PROGRESS_INDICATOR );
    Equality.identity( $sym0$PARALLEL_ITERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parallel_iterator$.getGlobalValue(), Symbols.symbol_function(
        $sym65$VISIT_DEFSTRUCT_OBJECT_PARALLEL_ITERATOR_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym77$PARITER_PROCESS_METHOD );
    utilities_macros.note_funcall_helper_function( $sym79$PARITER_PROGRESS_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parallelism_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parallelism_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parallelism_utilities_file();
  }
  static
  {
    me = new parallelism_utilities();
    $dtp_parallel_iterator$ = null;
    $current_pariter$ = null;
    $current_pariter_index$ = null;
    $parallel_filter_method$ = null;
    $parallel_key_method$ = null;
    $sym0$PARALLEL_ITERATOR = makeSymbol( "PARALLEL-ITERATOR" );
    $sym1$PARALLEL_ITERATOR_P = makeSymbol( "PARALLEL-ITERATOR-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "SOURCE-ITERATOR" ), makeSymbol( "FUNCTION" ), makeSymbol( "SHARED-ARGS" ), makeSymbol( "SVS" ), makeSymbol( "WIDTH" ), makeSymbol( "BATCH" ), makeSymbol(
        "TOTAL" ), makeSymbol( "SOFAR" ), makeSymbol( "MESSAGE" ), makeSymbol( "INITIALIZER" ), makeSymbol( "REDUCER" ), makeSymbol( "FINAL-RESULT" ), makeSymbol( "LOCK" ), makeSymbol( "BEGIN-SEMAPHORE" ), makeSymbol(
            "FINISH-SEMAPHORE" ), makeSymbol( "PROCESS-POOL" ), makeSymbol( "PROGRESS-INDICATOR" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SOURCE-ITERATOR" ), makeKeyword( "FUNCTION" ), makeKeyword( "SHARED-ARGS" ), makeKeyword( "SVS" ), makeKeyword( "WIDTH" ), makeKeyword( "BATCH" ),
      makeKeyword( "TOTAL" ), makeKeyword( "SOFAR" ), makeKeyword( "MESSAGE" ), makeKeyword( "INITIALIZER" ), makeKeyword( "REDUCER" ), makeKeyword( "FINAL-RESULT" ), makeKeyword( "LOCK" ), makeKeyword(
          "BEGIN-SEMAPHORE" ), makeKeyword( "FINISH-SEMAPHORE" ), makeKeyword( "PROCESS-POOL" ), makeKeyword( "PROGRESS-INDICATOR" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "PARITER-SOURCE-ITERATOR" ), makeSymbol( "PARITER-FUNCTION" ), makeSymbol( "PARITER-SHARED-ARGS" ), makeSymbol( "PARITER-SVS" ), makeSymbol( "PARITER-WIDTH" ),
      makeSymbol( "PARITER-BATCH" ), makeSymbol( "PARITER-TOTAL" ), makeSymbol( "PARITER-SOFAR" ), makeSymbol( "PARITER-MESSAGE" ), makeSymbol( "PARITER-INITIALIZER" ), makeSymbol( "PARITER-REDUCER" ), makeSymbol(
          "PARITER-FINAL-RESULT" ), makeSymbol( "PARITER-LOCK" ), makeSymbol( "PARITER-BEGIN-SEMAPHORE" ), makeSymbol( "PARITER-FINISH-SEMAPHORE" ), makeSymbol( "PARITER-PROCESS-POOL" ), makeSymbol(
              "PARITER-PROGRESS-INDICATOR" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-PARITER-SOURCE-ITERATOR" ), makeSymbol( "_CSETF-PARITER-FUNCTION" ), makeSymbol( "_CSETF-PARITER-SHARED-ARGS" ), makeSymbol( "_CSETF-PARITER-SVS" ),
      makeSymbol( "_CSETF-PARITER-WIDTH" ), makeSymbol( "_CSETF-PARITER-BATCH" ), makeSymbol( "_CSETF-PARITER-TOTAL" ), makeSymbol( "_CSETF-PARITER-SOFAR" ), makeSymbol( "_CSETF-PARITER-MESSAGE" ), makeSymbol(
          "_CSETF-PARITER-INITIALIZER" ), makeSymbol( "_CSETF-PARITER-REDUCER" ), makeSymbol( "_CSETF-PARITER-FINAL-RESULT" ), makeSymbol( "_CSETF-PARITER-LOCK" ), makeSymbol( "_CSETF-PARITER-BEGIN-SEMAPHORE" ),
      makeSymbol( "_CSETF-PARITER-FINISH-SEMAPHORE" ), makeSymbol( "_CSETF-PARITER-PROCESS-POOL" ), makeSymbol( "_CSETF-PARITER-PROGRESS-INDICATOR" )
    } );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$PARALLEL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PARALLEL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PARALLEL-ITERATOR-P" ) );
    $sym9$PARITER_SOURCE_ITERATOR = makeSymbol( "PARITER-SOURCE-ITERATOR" );
    $sym10$_CSETF_PARITER_SOURCE_ITERATOR = makeSymbol( "_CSETF-PARITER-SOURCE-ITERATOR" );
    $sym11$PARITER_FUNCTION = makeSymbol( "PARITER-FUNCTION" );
    $sym12$_CSETF_PARITER_FUNCTION = makeSymbol( "_CSETF-PARITER-FUNCTION" );
    $sym13$PARITER_SHARED_ARGS = makeSymbol( "PARITER-SHARED-ARGS" );
    $sym14$_CSETF_PARITER_SHARED_ARGS = makeSymbol( "_CSETF-PARITER-SHARED-ARGS" );
    $sym15$PARITER_SVS = makeSymbol( "PARITER-SVS" );
    $sym16$_CSETF_PARITER_SVS = makeSymbol( "_CSETF-PARITER-SVS" );
    $sym17$PARITER_WIDTH = makeSymbol( "PARITER-WIDTH" );
    $sym18$_CSETF_PARITER_WIDTH = makeSymbol( "_CSETF-PARITER-WIDTH" );
    $sym19$PARITER_BATCH = makeSymbol( "PARITER-BATCH" );
    $sym20$_CSETF_PARITER_BATCH = makeSymbol( "_CSETF-PARITER-BATCH" );
    $sym21$PARITER_TOTAL = makeSymbol( "PARITER-TOTAL" );
    $sym22$_CSETF_PARITER_TOTAL = makeSymbol( "_CSETF-PARITER-TOTAL" );
    $sym23$PARITER_SOFAR = makeSymbol( "PARITER-SOFAR" );
    $sym24$_CSETF_PARITER_SOFAR = makeSymbol( "_CSETF-PARITER-SOFAR" );
    $sym25$PARITER_MESSAGE = makeSymbol( "PARITER-MESSAGE" );
    $sym26$_CSETF_PARITER_MESSAGE = makeSymbol( "_CSETF-PARITER-MESSAGE" );
    $sym27$PARITER_INITIALIZER = makeSymbol( "PARITER-INITIALIZER" );
    $sym28$_CSETF_PARITER_INITIALIZER = makeSymbol( "_CSETF-PARITER-INITIALIZER" );
    $sym29$PARITER_REDUCER = makeSymbol( "PARITER-REDUCER" );
    $sym30$_CSETF_PARITER_REDUCER = makeSymbol( "_CSETF-PARITER-REDUCER" );
    $sym31$PARITER_FINAL_RESULT = makeSymbol( "PARITER-FINAL-RESULT" );
    $sym32$_CSETF_PARITER_FINAL_RESULT = makeSymbol( "_CSETF-PARITER-FINAL-RESULT" );
    $sym33$PARITER_LOCK = makeSymbol( "PARITER-LOCK" );
    $sym34$_CSETF_PARITER_LOCK = makeSymbol( "_CSETF-PARITER-LOCK" );
    $sym35$PARITER_BEGIN_SEMAPHORE = makeSymbol( "PARITER-BEGIN-SEMAPHORE" );
    $sym36$_CSETF_PARITER_BEGIN_SEMAPHORE = makeSymbol( "_CSETF-PARITER-BEGIN-SEMAPHORE" );
    $sym37$PARITER_FINISH_SEMAPHORE = makeSymbol( "PARITER-FINISH-SEMAPHORE" );
    $sym38$_CSETF_PARITER_FINISH_SEMAPHORE = makeSymbol( "_CSETF-PARITER-FINISH-SEMAPHORE" );
    $sym39$PARITER_PROCESS_POOL = makeSymbol( "PARITER-PROCESS-POOL" );
    $sym40$_CSETF_PARITER_PROCESS_POOL = makeSymbol( "_CSETF-PARITER-PROCESS-POOL" );
    $sym41$PARITER_PROGRESS_INDICATOR = makeSymbol( "PARITER-PROGRESS-INDICATOR" );
    $sym42$_CSETF_PARITER_PROGRESS_INDICATOR = makeSymbol( "_CSETF-PARITER-PROGRESS-INDICATOR" );
    $kw43$SOURCE_ITERATOR = makeKeyword( "SOURCE-ITERATOR" );
    $kw44$FUNCTION = makeKeyword( "FUNCTION" );
    $kw45$SHARED_ARGS = makeKeyword( "SHARED-ARGS" );
    $kw46$SVS = makeKeyword( "SVS" );
    $kw47$WIDTH = makeKeyword( "WIDTH" );
    $kw48$BATCH = makeKeyword( "BATCH" );
    $kw49$TOTAL = makeKeyword( "TOTAL" );
    $kw50$SOFAR = makeKeyword( "SOFAR" );
    $kw51$MESSAGE = makeKeyword( "MESSAGE" );
    $kw52$INITIALIZER = makeKeyword( "INITIALIZER" );
    $kw53$REDUCER = makeKeyword( "REDUCER" );
    $kw54$FINAL_RESULT = makeKeyword( "FINAL-RESULT" );
    $kw55$LOCK = makeKeyword( "LOCK" );
    $kw56$BEGIN_SEMAPHORE = makeKeyword( "BEGIN-SEMAPHORE" );
    $kw57$FINISH_SEMAPHORE = makeKeyword( "FINISH-SEMAPHORE" );
    $kw58$PROCESS_POOL = makeKeyword( "PROCESS-POOL" );
    $kw59$PROGRESS_INDICATOR = makeKeyword( "PROGRESS-INDICATOR" );
    $str60$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw61$BEGIN = makeKeyword( "BEGIN" );
    $sym62$MAKE_PARALLEL_ITERATOR = makeSymbol( "MAKE-PARALLEL-ITERATOR" );
    $kw63$SLOT = makeKeyword( "SLOT" );
    $kw64$END = makeKeyword( "END" );
    $sym65$VISIT_DEFSTRUCT_OBJECT_PARALLEL_ITERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PARALLEL-ITERATOR-METHOD" );
    $sym66$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym67$ITERATOR_P = makeSymbol( "ITERATOR-P" );
    $sym68$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym69$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym70$STRINGP = makeSymbol( "STRINGP" );
    $kw71$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str72$PARITER = makeString( "PARITER" );
    $str73$PARITER_begin = makeString( "PARITER begin" );
    $str74$PARITER_finish = makeString( "PARITER finish" );
    $str75$PARITER_process_ = makeString( "PARITER process " );
    $str76$_ = makeString( "/" );
    $sym77$PARITER_PROCESS_METHOD = makeSymbol( "PARITER-PROCESS-METHOD" );
    $str78$PARITER_progress = makeString( "PARITER progress" );
    $sym79$PARITER_PROGRESS_METHOD = makeSymbol( "PARITER-PROGRESS-METHOD" );
    $kw80$HALTED = makeKeyword( "HALTED" );
    $kw81$FINISHED = makeKeyword( "FINISHED" );
    $str82$PARITER_obtaining_items = makeString( "PARITER obtaining items" );
    $str83$PARITER_reducing_final_result = makeString( "PARITER reducing final result" );
    $str84$PARITER_incrementing_sofar = makeString( "PARITER incrementing sofar" );
    $kw85$KEY = makeKeyword( "KEY" );
    $kw86$START = makeKeyword( "START" );
    $sym87$_PARALLEL_FILTER_METHOD_ = makeSymbol( "*PARALLEL-FILTER-METHOD*" );
    $sym88$_PARALLEL_KEY_METHOD_ = makeSymbol( "*PARALLEL-KEY-METHOD*" );
    $sym89$_ = makeSymbol( "+" );
    $sym90$PARALLEL_FILTER_MATCH_COUNT = makeSymbol( "PARALLEL-FILTER-MATCH-COUNT" );
    $int91$1000 = makeInteger( 1000 );
    $str92$counting_assertions_ = makeString( "counting assertions " );
    $str93$_way = makeString( "-way" );
    $sym94$ONE = makeSymbol( "ONE" );
  }

  public static final class $parallel_iterator_native
      extends
        SubLStructNative
  {
    public SubLObject $source_iterator;
    public SubLObject $function;
    public SubLObject $shared_args;
    public SubLObject $svs;
    public SubLObject $width;
    public SubLObject $batch;
    public SubLObject $total;
    public SubLObject $sofar;
    public SubLObject $message;
    public SubLObject $initializer;
    public SubLObject $reducer;
    public SubLObject $final_result;
    public SubLObject $lock;
    public SubLObject $begin_semaphore;
    public SubLObject $finish_semaphore;
    public SubLObject $process_pool;
    public SubLObject $progress_indicator;
    private static final SubLStructDeclNative structDecl;

    public $parallel_iterator_native()
    {
      this.$source_iterator = CommonSymbols.NIL;
      this.$function = CommonSymbols.NIL;
      this.$shared_args = CommonSymbols.NIL;
      this.$svs = CommonSymbols.NIL;
      this.$width = CommonSymbols.NIL;
      this.$batch = CommonSymbols.NIL;
      this.$total = CommonSymbols.NIL;
      this.$sofar = CommonSymbols.NIL;
      this.$message = CommonSymbols.NIL;
      this.$initializer = CommonSymbols.NIL;
      this.$reducer = CommonSymbols.NIL;
      this.$final_result = CommonSymbols.NIL;
      this.$lock = CommonSymbols.NIL;
      this.$begin_semaphore = CommonSymbols.NIL;
      this.$finish_semaphore = CommonSymbols.NIL;
      this.$process_pool = CommonSymbols.NIL;
      this.$progress_indicator = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $parallel_iterator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$source_iterator;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$function;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$shared_args;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$svs;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$width;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$batch;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$total;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$sofar;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$message;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$initializer;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$reducer;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$final_result;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$begin_semaphore;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$finish_semaphore;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$process_pool;
    }

    @Override
    public SubLObject getField18()
    {
      return this.$progress_indicator;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$source_iterator = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$function = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$shared_args = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$svs = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$width = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$batch = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$total = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$sofar = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$message = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$initializer = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$reducer = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$final_result = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$begin_semaphore = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$finish_semaphore = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$process_pool = value;
    }

    @Override
    public SubLObject setField18(final SubLObject value)
    {
      return this.$progress_indicator = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $parallel_iterator_native.class, $sym0$PARALLEL_ITERATOR, $sym1$PARALLEL_ITERATOR_P, $list2, $list3, new String[] { "$source_iterator", "$function", "$shared_args",
        "$svs", "$width", "$batch", "$total", "$sofar", "$message", "$initializer", "$reducer", "$final_result", "$lock", "$begin_semaphore", "$finish_semaphore", "$process_pool", "$progress_indicator"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $parallel_iterator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $parallel_iterator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PARALLEL-ITERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return parallel_iterator_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 286 ms synthetic
 */