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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shelfs
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shelfs";
  public static final String myFingerPrint = "8bdcf061171a1d02bf9d01396f9e31fbe5211b35ebb68b60bd482bdee12e4d2d";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLSymbol $dtp_shelf_info$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLSymbol $dtp_shelf$;
  private static final SubLSymbol $sym0$SHELF_INFO;
  private static final SubLSymbol $sym1$SHELF_INFO_P;
  private static final SubLInteger $int2$134;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$SHELF_INFO_KEY;
  private static final SubLSymbol $sym11$_CSETF_SHELF_INFO_KEY;
  private static final SubLSymbol $sym12$SHELF_INFO_TEST;
  private static final SubLSymbol $sym13$_CSETF_SHELF_INFO_TEST;
  private static final SubLSymbol $sym14$SHELF_INFO_COMPARE;
  private static final SubLSymbol $sym15$_CSETF_SHELF_INFO_COMPARE;
  private static final SubLSymbol $sym16$SHELF_INFO_MINOR_LIMIT;
  private static final SubLSymbol $sym17$_CSETF_SHELF_INFO_MINOR_LIMIT;
  private static final SubLSymbol $sym18$SHELF_INFO_MAJOR_LIMIT;
  private static final SubLSymbol $sym19$_CSETF_SHELF_INFO_MAJOR_LIMIT;
  private static final SubLSymbol $kw20$KEY;
  private static final SubLSymbol $kw21$TEST;
  private static final SubLSymbol $kw22$COMPARE;
  private static final SubLSymbol $kw23$MINOR_LIMIT;
  private static final SubLSymbol $kw24$MAJOR_LIMIT;
  private static final SubLString $str25$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw26$BEGIN;
  private static final SubLSymbol $sym27$MAKE_SHELF_INFO;
  private static final SubLSymbol $kw28$SLOT;
  private static final SubLSymbol $kw29$END;
  private static final SubLSymbol $sym30$VISIT_DEFSTRUCT_OBJECT_SHELF_INFO_METHOD;
  private static final SubLSymbol $sym31$SHELF;
  private static final SubLSymbol $sym32$SHELF_P;
  private static final SubLInteger $int33$135;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$PRINT_SHELF;
  private static final SubLSymbol $sym39$SHELF_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$_CSETF_SHELF_INFO;
  private static final SubLSymbol $sym42$SHELF_PAYLOAD;
  private static final SubLSymbol $sym43$_CSETF_SHELF_PAYLOAD;
  private static final SubLSymbol $sym44$SHELF_SIZE;
  private static final SubLSymbol $sym45$_CSETF_SHELF_SIZE;
  private static final SubLSymbol $kw46$INFO;
  private static final SubLSymbol $kw47$PAYLOAD;
  private static final SubLSymbol $kw48$SIZE;
  private static final SubLSymbol $sym49$MAKE_SHELF;
  private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_SHELF_METHOD;
  private static final SubLString $str51$_D_items;
  private static final SubLString $str52$__unfinalized_;
  private static final SubLString $str53$Finalizing__S_before_its_time_;
  private static final SubLString $str54$_S_has_already_been_finalized_;
  private static final SubLString $str55$Shelf__S_being_finalized_with_les;
  private static final SubLSymbol $sym56$NULL;
  private static final SubLString $str57$Finalize_it_;
  private static final SubLString $str58$_S_has_not_been_finalized_;
  private static final SubLList $list59;
  private static final SubLString $str60$do_shelf;
  private static final SubLSymbol $sym61$SHELF_VAR;
  private static final SubLSymbol $sym62$PAYLOAD;
  private static final SubLSymbol $sym63$I;
  private static final SubLSymbol $sym64$VECTOR;
  private static final SubLSymbol $sym65$DATA;
  private static final SubLSymbol $sym66$CLET;
  private static final SubLSymbol $sym67$CSETQ;
  private static final SubLSymbol $sym68$_PROGRESS_NOTE_;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$_PROGRESS_TOTAL_;
  private static final SubLSymbol $sym71$SHELF_APPROXIMATE_COUNT;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym74$PIF;
  private static final SubLSymbol $sym75$SHELF_FINALIZED_P;
  private static final SubLSymbol $sym76$VECTORP;
  private static final SubLSymbol $sym77$CDOTIMES;
  private static final SubLSymbol $sym78$LENGTH;
  private static final SubLSymbol $sym79$AREF;
  private static final SubLSymbol $sym80$PWHEN;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$PROGN;
  private static final SubLSymbol $sym83$CDOLIST;
  private static final SubLSymbol $sym84$CDAR;
  private static final SubLSymbol $sym85$CDR;
  private static final SubLSymbol $sym86$CAR;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$SHELF_VAR;
  private static final SubLSymbol $sym89$VECTOR;
  private static final SubLSymbol $sym90$LOW;
  private static final SubLSymbol $sym91$HIGH;
  private static final SubLSymbol $sym92$I;
  private static final SubLSymbol $sym93$LENGTH;
  private static final SubLSymbol $sym94$PUNLESS;
  private static final SubLSymbol $sym95$FINALIZE_SHELF;
  private static final SubLSymbol $sym96$REARRANGE_SHELF;
  private static final SubLSymbol $sym97$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym98$BSEARCH_SHELF_VECTOR_RANGE;
  private static final SubLSymbol $sym99$CDO;
  private static final SubLSymbol $sym100$_;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$CNOT;
  private static final SubLSymbol $sym103$_;
  private static final SubLSymbol $sym104$CSETF;
  private static final SubLSymbol $sym105$_;
  private static final SubLList $list106;
  private static final SubLString $str107$Ignore_the_addition_;
  private static final SubLString $str108$Attempt_to_add__S_to__S_;
  private static final SubLSymbol $sym109$ITERATOR_SHELF_DONE;
  private static final SubLSymbol $sym110$ITERATOR_SHELF_NEXT;
  private static final SubLSymbol $sym111$VECTOR;
  private static final SubLSymbol $sym112$BOOLEAN;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject shelf_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject shelf_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $shelf_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject shelf_info_key(final SubLObject v_object)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject shelf_info_test(final SubLObject v_object)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject shelf_info_compare(final SubLObject v_object)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject shelf_info_minor_limit(final SubLObject v_object)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject shelf_info_major_limit(final SubLObject v_object)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject _csetf_shelf_info_key(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject _csetf_shelf_info_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject _csetf_shelf_info_compare(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject _csetf_shelf_info_minor_limit(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject _csetf_shelf_info_major_limit(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject make_shelf_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $shelf_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw20$KEY ) )
      {
        _csetf_shelf_info_key( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$TEST ) )
      {
        _csetf_shelf_info_test( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$COMPARE ) )
      {
        _csetf_shelf_info_compare( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$MINOR_LIMIT ) )
      {
        _csetf_shelf_info_minor_limit( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$MAJOR_LIMIT ) )
      {
        _csetf_shelf_info_major_limit( v_new, current_value );
      }
      else
      {
        Errors.error( $str25$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject visit_defstruct_shelf_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw26$BEGIN, $sym27$MAKE_SHELF_INFO, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw20$KEY, shelf_info_key( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw21$TEST, shelf_info_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw22$COMPARE, shelf_info_compare( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw23$MINOR_LIMIT, shelf_info_minor_limit( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw24$MAJOR_LIMIT, shelf_info_major_limit( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$END, $sym27$MAKE_SHELF_INFO, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4054L)
  public static SubLObject visit_defstruct_object_shelf_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_shelf_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject shelf_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_shelf( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject shelf_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $shelf_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject shelf_info(final SubLObject v_object)
  {
    assert NIL != shelf_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject shelf_payload(final SubLObject v_object)
  {
    assert NIL != shelf_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject shelf_size(final SubLObject v_object)
  {
    assert NIL != shelf_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject _csetf_shelf_info(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject _csetf_shelf_payload(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject _csetf_shelf_size(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != shelf_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject make_shelf(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $shelf_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw46$INFO ) )
      {
        _csetf_shelf_info( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$PAYLOAD ) )
      {
        _csetf_shelf_payload( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$SIZE ) )
      {
        _csetf_shelf_size( v_new, current_value );
      }
      else
      {
        Errors.error( $str25$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject visit_defstruct_shelf(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw26$BEGIN, $sym49$MAKE_SHELF, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw46$INFO, shelf_info( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw47$PAYLOAD, shelf_payload( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw48$SIZE, shelf_size( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$END, $sym49$MAKE_SHELF, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject visit_defstruct_object_shelf_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_shelf( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4270L)
  public static SubLObject shelf_finalized_p(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    return makeBoolean( payload.isVector() || !payload.first().isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4478L)
  public static SubLObject print_shelf(final SubLObject shelf, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( shelf, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, shelf, T, T );
      PrintLow.format( stream, $str51$_D_items, shelf_approximate_count( shelf ) );
      if( NIL == shelf_finalized_p( shelf ) )
      {
        streams_high.write_string( $str52$__unfinalized_, stream, UNPROVIDED, UNPROVIDED );
      }
      print_macros.print_unreadable_object_postamble( stream, shelf, T, T );
    }
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4763L)
  public static SubLObject allocate_shelf(final SubLObject size, final SubLObject info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject shelf = make_shelf( UNPROVIDED );
    _csetf_shelf_info( shelf, info );
    if( NIL != size )
    {
      SubLObject vector = NIL;
      final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
      try
      {
        Storage.$current_area$.bind( Storage.get_static_area(), thread );
        vector = Vectors.make_vector( size, UNPROVIDED );
      }
      finally
      {
        Storage.$current_area$.rebind( _prev_bind_0, thread );
      }
      _csetf_shelf_payload( shelf, ConsesLow.cons( ZERO_INTEGER, vector ) );
    }
    else
    {
      _csetf_shelf_payload( shelf, ConsesLow.cons( ZERO_INTEGER, NIL ) );
    }
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5075L)
  public static SubLObject initial_add_to_shelf(final SubLObject item, final SubLObject shelf)
  {
    if( NIL != shelf_finalized_p( shelf ) )
    {
      add_to_shelf( item, shelf );
    }
    else
    {
      final SubLObject payload = shelf_payload( shelf );
      final SubLObject data = payload.rest();
      final SubLObject idx = payload.first();
      if( data.isVector() )
      {
        if( idx.numGE( Sequences.length( data ) ) )
        {
          Errors.warn( $str53$Finalizing__S_before_its_time_, shelf );
          finalize_shelf( shelf );
          add_to_shelf( item, shelf );
        }
        else
        {
          Vectors.set_aref( data, idx, item );
          ConsesLow.rplaca( payload, Numbers.add( payload.first(), ONE_INTEGER ) );
        }
      }
      else
      {
        ConsesLow.rplacd( payload, ConsesLow.cons( item, payload.rest() ) );
        ConsesLow.rplaca( payload, Numbers.add( payload.first(), ONE_INTEGER ) );
      }
    }
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5662L)
  public static SubLObject finalize_shelf(final SubLObject shelf)
  {
    if( NIL != shelf_finalized_p( shelf ) )
    {
      Errors.warn( $str54$_S_has_already_been_finalized_, shelf );
    }
    else
    {
      SubLObject payload = shelf_payload( shelf );
      final SubLObject count = payload.first();
      final SubLObject info = shelf_info( shelf );
      SubLObject data = payload.rest();
      SubLObject vector = NIL;
      if( data.isVector() )
      {
        if( count.numL( Sequences.length( data ) ) )
        {
          Errors.warn( $str55$Shelf__S_being_finalized_with_les, shelf, Sequences.length( data ) );
          vector = Vectors.make_vector( count, UNPROVIDED );
          SubLObject i;
          for( i = NIL, i = ZERO_INTEGER; i.numL( count ); i = Numbers.add( i, ONE_INTEGER ) )
          {
            Vectors.set_aref( vector, i, Vectors.aref( data, i ) );
          }
        }
        else
        {
          vector = data;
        }
      }
      else
      {
        vector = Vectors.make_vector( payload.first(), UNPROVIDED );
        SubLObject current;
        SubLObject j;
        for( current = NIL, j = NIL, current = data, j = ZERO_INTEGER; NIL != current; current = current.rest(), j = Numbers.add( j, ONE_INTEGER ) )
        {
          Vectors.set_aref( vector, j, current.first() );
        }
      }
      Sort.sort( vector, shelf_info_compare( info ), shelf_info_key( info ) );
      _csetf_shelf_payload( shelf, vector );
      payload = NIL;
      data = NIL;
      vector = NIL;
    }
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6760L)
  public static SubLObject shelf_count(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    if( NIL == shelf_finalized_p( shelf ) )
    {
      return payload.first();
    }
    if( payload.isVector() )
    {
      return list_utilities.count_if_not( Symbols.symbol_function( $sym56$NULL ), payload, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject count = ZERO_INTEGER;
    count = Numbers.add( count, conses_high.caar( payload ) );
    SubLObject cdolist_list_var = payload.rest();
    SubLObject vector = NIL;
    vector = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = Numbers.add( count, list_utilities.count_if_not( Symbols.symbol_function( $sym56$NULL ), vector, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      vector = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7145L)
  public static SubLObject shelf_approximate_count(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    if( NIL == shelf_finalized_p( shelf ) )
    {
      return payload.first();
    }
    if( payload.isVector() )
    {
      return Sequences.length( payload );
    }
    SubLObject count = ZERO_INTEGER;
    count = Numbers.add( count, conses_high.caar( payload ) );
    SubLObject cdolist_list_var = payload.rest();
    SubLObject vector = NIL;
    vector = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = Numbers.add( count, Sequences.length( vector ) );
      cdolist_list_var = cdolist_list_var.rest();
      vector = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7546L)
  public static SubLObject shelf_major_count(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    if( NIL == shelf_finalized_p( shelf ) )
    {
      return payload.first();
    }
    if( payload.isVector() )
    {
      return Sequences.length( payload );
    }
    return Sequences.length( conses_high.last( payload, UNPROVIDED ).first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7849L)
  public static SubLObject shelf_minor_count(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    if( NIL == shelf_finalized_p( shelf ) )
    {
      return ZERO_INTEGER;
    }
    if( payload.isVector() )
    {
      return ZERO_INTEGER;
    }
    SubLObject count = ZERO_INTEGER;
    SubLObject vectors;
    for( vectors = NIL, vectors = payload.rest(); NIL != vectors.rest(); vectors = vectors.rest() )
    {
      count = Numbers.add( count, Sequences.length( vectors.first() ) );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8228L)
  public static SubLObject shelf_extra_count(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    if( NIL == shelf_finalized_p( shelf ) )
    {
      return ZERO_INTEGER;
    }
    if( payload.isVector() )
    {
      return ZERO_INTEGER;
    }
    return conses_high.caar( payload );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8477L)
  public static SubLObject rearrange_shelf(final SubLObject shelf)
  {
    if( NIL == shelf_finalized_p( shelf ) )
    {
      Errors.cerror( $str57$Finalize_it_, $str58$_S_has_not_been_finalized_, shelf );
      finalize_shelf( shelf );
    }
    final SubLObject new_vector = Vectors.make_vector( shelf_count( shelf ), UNPROVIDED );
    final SubLObject payload = shelf_payload( shelf );
    SubLObject idx = ZERO_INTEGER;
    if( payload.isVector() )
    {
      SubLObject cdotimes_end_var;
      SubLObject i;
      SubLObject item;
      for( cdotimes_end_var = Sequences.length( payload ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        item = Vectors.aref( payload, i );
        if( NIL != item )
        {
          Vectors.set_aref( new_vector, idx, item );
          idx = Numbers.add( idx, ONE_INTEGER );
        }
      }
    }
    else
    {
      SubLObject cdolist_list_var = conses_high.cdar( payload );
      SubLObject item2 = NIL;
      item2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        Vectors.set_aref( new_vector, idx, item2 );
        idx = Numbers.add( idx, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        item2 = cdolist_list_var.first();
      }
      cdolist_list_var = payload.rest();
      SubLObject vector = NIL;
      vector = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdotimes_end_var2;
        SubLObject j;
        SubLObject item3;
        for( cdotimes_end_var2 = Sequences.length( vector ), j = NIL, j = ZERO_INTEGER; j.numL( cdotimes_end_var2 ); j = Numbers.add( j, ONE_INTEGER ) )
        {
          item3 = Vectors.aref( vector, j );
          if( NIL != item3 )
          {
            Vectors.set_aref( new_vector, idx, item3 );
            idx = Numbers.add( idx, ONE_INTEGER );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        vector = cdolist_list_var.first();
      }
    }
    final SubLObject info = shelf_info( shelf );
    Sort.sort( new_vector, shelf_info_compare( info ), shelf_info_key( info ) );
    _csetf_shelf_payload( shelf, new_vector );
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9470L)
  public static SubLObject tidy_shelf(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    final SubLObject vector = Vectors.make_vector( conses_high.caar( payload ), UNPROVIDED );
    SubLObject idx = ZERO_INTEGER;
    SubLObject cdolist_list_var = conses_high.cdar( payload );
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Vectors.set_aref( vector, idx, item );
      idx = Numbers.add( idx, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    final SubLObject info = shelf_info( shelf );
    Sort.sort( vector, shelf_info_compare( info ), shelf_info_key( info ) );
    _csetf_shelf_payload( shelf, ConsesLow.listS( ConsesLow.cons( ZERO_INTEGER, NIL ), vector, payload.rest() ) );
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9951L)
  public static SubLObject do_shelf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject shelf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    shelf = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str60$do_shelf;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list59 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject shelf_var = $sym61$SHELF_VAR;
      final SubLObject payload = $sym62$PAYLOAD;
      final SubLObject i = $sym63$I;
      final SubLObject vector = $sym64$VECTOR;
      final SubLObject data = $sym65$DATA;
      return ConsesLow.list( $sym66$CLET, ConsesLow.list( ConsesLow.list( shelf_var, shelf ), ConsesLow.list( payload, ConsesLow.list( $sym42$SHELF_PAYLOAD, shelf_var ) ) ), ConsesLow.list( $sym67$CSETQ,
          $sym68$_PROGRESS_NOTE_, message ), $list69, ConsesLow.list( $sym67$CSETQ, $sym70$_PROGRESS_TOTAL_, ConsesLow.list( $sym71$SHELF_APPROXIMATE_COUNT, shelf_var ) ), $list72, ConsesLow.list(
              $sym73$NOTING_PERCENT_PROGRESS, $sym68$_PROGRESS_NOTE_, ConsesLow.list( $sym74$PIF, ConsesLow.list( $sym75$SHELF_FINALIZED_P, shelf_var ), ConsesLow.list( $sym74$PIF, ConsesLow.list( $sym76$VECTORP,
                  payload ), ConsesLow.list( $sym77$CDOTIMES, ConsesLow.list( i, ConsesLow.list( $sym78$LENGTH, payload ) ), ConsesLow.listS( $sym66$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym79$AREF,
                      payload, i ) ) ), ConsesLow.listS( $sym80$PWHEN, var, ConsesLow.append( body, NIL ) ), $list81 ) ), ConsesLow.list( $sym82$PROGN, ConsesLow.listS( $sym83$CDOLIST, ConsesLow.list( var, ConsesLow
                          .list( $sym84$CDAR, payload ) ), ConsesLow.append( body, $list81 ) ), ConsesLow.list( $sym83$CDOLIST, ConsesLow.list( vector, ConsesLow.list( $sym85$CDR, payload ) ), ConsesLow.list(
                              $sym77$CDOTIMES, ConsesLow.list( i, ConsesLow.list( $sym78$LENGTH, vector ) ), ConsesLow.listS( $sym66$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym79$AREF, vector,
                                  i ) ) ), ConsesLow.listS( $sym80$PWHEN, var, ConsesLow.append( body, NIL ) ), $list81 ) ) ) ) ), ConsesLow.list( $sym82$PROGN, ConsesLow.list( $sym66$CLET, ConsesLow.list( ConsesLow
                                      .list( data, ConsesLow.list( $sym85$CDR, payload ) ) ), ConsesLow.list( $sym74$PIF, ConsesLow.list( $sym76$VECTORP, data ), ConsesLow.list( $sym77$CDOTIMES, ConsesLow.list( i,
                                          ConsesLow.list( $sym86$CAR, payload ) ), ConsesLow.listS( $sym66$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym79$AREF, payload, i ) ) ), ConsesLow.listS(
                                              $sym80$PWHEN, var, ConsesLow.append( body, NIL ) ), $list81 ) ), ConsesLow.listS( $sym83$CDOLIST, ConsesLow.list( var, data ), ConsesLow.append( body,
                                                  $list81 ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11505L)
  public static SubLObject map_shelf(final SubLObject function, final SubLObject shelf, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = $str60$do_shelf;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject payload = shelf_payload( shelf );
    utilities_macros.$progress_note$.setDynamicValue( message, thread );
    utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
    utilities_macros.$progress_total$.setDynamicValue( shelf_approximate_count( shelf ), thread );
    utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
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
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        if( NIL != shelf_finalized_p( shelf ) )
        {
          if( payload.isVector() )
          {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject item;
            for( cdotimes_end_var = Sequences.length( payload ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
            {
              item = Vectors.aref( payload, i );
              if( NIL != item )
              {
                Functions.funcall( function, item );
              }
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            }
          }
          else
          {
            SubLObject cdolist_list_var = conses_high.cdar( payload );
            SubLObject item2 = NIL;
            item2 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              Functions.funcall( function, item2 );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              cdolist_list_var = cdolist_list_var.rest();
              item2 = cdolist_list_var.first();
            }
            cdolist_list_var = payload.rest();
            SubLObject vector = NIL;
            vector = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject cdotimes_end_var2;
              SubLObject j;
              SubLObject item3;
              for( cdotimes_end_var2 = Sequences.length( vector ), j = NIL, j = ZERO_INTEGER; j.numL( cdotimes_end_var2 ); j = Numbers.add( j, ONE_INTEGER ) )
              {
                item3 = Vectors.aref( vector, j );
                if( NIL != item3 )
                {
                  Functions.funcall( function, item3 );
                }
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              }
              cdolist_list_var = cdolist_list_var.rest();
              vector = cdolist_list_var.first();
            }
          }
        }
        else
        {
          final SubLObject data = payload.rest();
          if( data.isVector() )
          {
            SubLObject cdotimes_end_var3;
            SubLObject k;
            SubLObject item4;
            for( cdotimes_end_var3 = payload.first(), k = NIL, k = ZERO_INTEGER; k.numL( cdotimes_end_var3 ); k = Numbers.add( k, ONE_INTEGER ) )
            {
              item4 = Vectors.aref( payload, k );
              if( NIL != item4 )
              {
                Functions.funcall( function, item4 );
              }
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            }
          }
          else
          {
            SubLObject cdolist_list_var2 = data;
            SubLObject item = NIL;
            item = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              Functions.funcall( function, item );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              cdolist_list_var2 = cdolist_list_var2.rest();
              item = cdolist_list_var2.first();
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11649L)
  public static SubLObject do_shelf_from(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject shelf = NIL;
    SubLObject item = NIL;
    SubLObject forwardp = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    shelf = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    forwardp = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject shelf_var = $sym88$SHELF_VAR;
      final SubLObject vector = $sym89$VECTOR;
      final SubLObject low = $sym90$LOW;
      final SubLObject high = $sym91$HIGH;
      final SubLObject i = $sym92$I;
      final SubLObject length = $sym93$LENGTH;
      return ConsesLow.list( $sym66$CLET, ConsesLow.list( ConsesLow.list( shelf_var, shelf ), var ), ConsesLow.list( $sym94$PUNLESS, ConsesLow.list( $sym75$SHELF_FINALIZED_P, shelf_var ), ConsesLow.list(
          $sym95$FINALIZE_SHELF, shelf_var ) ), ConsesLow.list( $sym94$PUNLESS, ConsesLow.list( $sym76$VECTORP, ConsesLow.list( $sym42$SHELF_PAYLOAD, shelf_var ) ), ConsesLow.list( $sym96$REARRANGE_SHELF, shelf_var ) ),
          ConsesLow.list( $sym66$CLET, ConsesLow.list( ConsesLow.list( vector, ConsesLow.list( $sym42$SHELF_PAYLOAD, shelf_var ) ), ConsesLow.list( length, ConsesLow.list( $sym78$LENGTH, vector ) ) ), ConsesLow.list(
              $sym97$CMULTIPLE_VALUE_BIND, ConsesLow.list( low, high ), ConsesLow.list( $sym98$BSEARCH_SHELF_VECTOR_RANGE, item, vector, ConsesLow.list( $sym0$SHELF_INFO, shelf_var ) ), ConsesLow.list( $sym74$PIF,
                  forwardp, ConsesLow.listS( $sym99$CDO, ConsesLow.list( ConsesLow.list( i, high, ConsesLow.listS( $sym100$_, i, $list101 ) ) ), ConsesLow.list( ConsesLow.list( $sym102$CNOT, ConsesLow.list( $sym103$_, i,
                      length ) ) ), ConsesLow.list( $sym104$CSETF, var, ConsesLow.list( $sym79$AREF, vector, i ) ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym99$CDO, ConsesLow.list( ConsesLow.list( i, low,
                          ConsesLow.listS( $sym105$_, i, $list101 ) ) ), ConsesLow.list( ConsesLow.listS( $sym103$_, i, $list106 ) ), ConsesLow.list( $sym104$CSETF, var, ConsesLow.list( $sym79$AREF, vector, i ) ),
                          ConsesLow.append( body, NIL ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list87 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12519L)
  public static SubLObject map_shelf_from(final SubLObject function, final SubLObject shelf, final SubLObject item, final SubLObject forwardp)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject elt = NIL;
    if( NIL == shelf_finalized_p( shelf ) )
    {
      finalize_shelf( shelf );
    }
    if( !shelf_payload( shelf ).isVector() )
    {
      rearrange_shelf( shelf );
    }
    final SubLObject vector = shelf_payload( shelf );
    final SubLObject length = Sequences.length( vector );
    thread.resetMultipleValues();
    final SubLObject low = bsearch_shelf_vector_range( item, vector, shelf_info( shelf ) );
    final SubLObject high = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != forwardp )
    {
      SubLObject i;
      for( i = NIL, i = high; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        elt = Vectors.aref( vector, i );
        Functions.funcall( function, elt );
      }
    }
    else
    {
      SubLObject i;
      for( i = NIL, i = low; !i.numL( ZERO_INTEGER ); i = Numbers.subtract( i, ONE_INTEGER ) )
      {
        elt = Vectors.aref( vector, i );
        Functions.funcall( function, elt );
      }
    }
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12660L)
  public static SubLObject add_to_shelf(final SubLObject item, final SubLObject shelf)
  {
    if( NIL != item )
    {
      if( NIL != shelf_finalized_p( shelf ) )
      {
        final SubLObject info = shelf_info( shelf );
        SubLObject payload = shelf_payload( shelf );
        if( !payload.isCons() )
        {
          payload = ConsesLow.list( ConsesLow.cons( ZERO_INTEGER, NIL ), payload );
          _csetf_shelf_payload( shelf, payload );
        }
        ConsesLow.rplacd( payload.first(), ConsesLow.cons( item, conses_high.cdar( payload ) ) );
        ConsesLow.rplaca( payload.first(), Numbers.add( conses_high.caar( payload ), ONE_INTEGER ) );
        final SubLObject major = shelf_info_major_limit( info );
        if( major.isFunction() )
        {
          if( NIL != Functions.funcall( major, shelf ) )
          {
            rearrange_shelf( shelf );
            return item;
          }
        }
        else if( major.isNumber() && shelf_approximate_count( shelf ).numGE( major ) )
        {
          rearrange_shelf( shelf );
          return item;
        }
        final SubLObject minor = shelf_info_minor_limit( info );
        if( minor.isFunction() )
        {
          if( NIL != Functions.funcall( minor, shelf ) )
          {
            tidy_shelf( shelf );
            return item;
          }
        }
        else if( minor.isNumber() && conses_high.caar( payload ).numGE( minor ) )
        {
          tidy_shelf( shelf );
          return item;
        }
      }
      else
      {
        initial_add_to_shelf( item, shelf );
      }
    }
    else
    {
      Errors.cerror( $str107$Ignore_the_addition_, $str108$Attempt_to_add__S_to__S_, item, shelf );
    }
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13913L)
  public static SubLObject bsearch_shelf_vector(final SubLObject item, final SubLObject vector, final SubLObject info)
  {
    final SubLObject compare = shelf_info_compare( info );
    final SubLObject test = shelf_info_test( info );
    final SubLObject key = shelf_info_key( info );
    return vector_utilities.binary_search_vector( item, vector, compare, test, key, Symbols.symbol_function( $sym56$NULL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14150L)
  public static SubLObject bsearch_shelf_vector_range(final SubLObject item, final SubLObject vector, final SubLObject info)
  {
    final SubLObject compare = shelf_info_compare( info );
    final SubLObject test = shelf_info_test( info );
    final SubLObject key = shelf_info_key( info );
    return vector_utilities.binary_search_vector_range( item, vector, compare, test, key, Symbols.symbol_function( $sym56$NULL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14401L)
  public static SubLObject delete_from_shelf(final SubLObject item, final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    final SubLObject info = shelf_info( shelf );
    if( NIL == shelf_finalized_p( shelf ) )
    {
      ConsesLow.rplacd( payload, Sequences.delete( item, payload.rest(), shelf_info_test( info ), shelf_info_key( info ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      ConsesLow.rplaca( payload, Sequences.length( payload.rest() ) );
      return item;
    }
    if( !payload.isVector() )
    {
      SubLObject cdolist_list_var = payload.rest();
      SubLObject vector = NIL;
      vector = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject idx = bsearch_shelf_vector( item, vector, info );
        if( NIL != idx )
        {
          Vectors.set_aref( vector, idx, NIL );
          return item;
        }
        cdolist_list_var = cdolist_list_var.rest();
        vector = cdolist_list_var.first();
      }
      final SubLObject extras = payload.first();
      ConsesLow.rplacd( extras, Sequences.delete( item, extras.rest(), shelf_info_test( info ), shelf_info_key( info ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      ConsesLow.rplaca( extras, Sequences.length( extras.rest() ) );
      return item;
    }
    final SubLObject idx2 = bsearch_shelf_vector( item, payload, info );
    if( NIL != idx2 )
    {
      Vectors.set_aref( payload, idx2, NIL );
      return item;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15340L)
  public static SubLObject clear_shelf(final SubLObject shelf)
  {
    if( NIL != shelf_finalized_p( shelf ) )
    {
      _csetf_shelf_payload( shelf, ConsesLow.cons( ConsesLow.cons( ZERO_INTEGER, NIL ), NIL ) );
    }
    else
    {
      _csetf_shelf_payload( shelf, ConsesLow.cons( ZERO_INTEGER, NIL ) );
    }
    return shelf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15529L)
  public static SubLObject find_in_shelf(final SubLObject item, final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    final SubLObject info = shelf_info( shelf );
    if( NIL == shelf_finalized_p( shelf ) )
    {
      return Sequences.find( item, payload.rest(), shelf_info_test( info ), shelf_info_key( info ), UNPROVIDED, UNPROVIDED );
    }
    if( !payload.isVector() )
    {
      SubLObject cdolist_list_var = payload.rest();
      SubLObject vector = NIL;
      vector = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject idx = bsearch_shelf_vector( item, vector, info );
        if( NIL != idx )
        {
          return Vectors.aref( vector, idx );
        }
        cdolist_list_var = cdolist_list_var.rest();
        vector = cdolist_list_var.first();
      }
      return Sequences.find( item, conses_high.cdar( payload ), shelf_info_test( info ), shelf_info_key( info ), UNPROVIDED, UNPROVIDED );
    }
    final SubLObject idx2 = bsearch_shelf_vector( item, payload, info );
    if( NIL != idx2 )
    {
      return Vectors.aref( payload, idx2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16224L)
  public static SubLObject shelf_ten_percent_full_p(final SubLObject shelf)
  {
    return Numbers.numGE( shelf_extra_count( shelf ), Numbers.integerDivide( shelf_major_count( shelf ), TEN_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16390L)
  public static SubLObject shelf_full_p(final SubLObject shelf)
  {
    return Numbers.numGE( shelf_minor_count( shelf ), shelf_major_count( shelf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16490L)
  public static SubLObject new_shelf_iterator(final SubLObject shelf)
  {
    assert NIL != shelf_p( shelf ) : shelf;
    return iteration.new_iterator( make_iterator_shelf_state( shelf ), $sym109$ITERATOR_SHELF_DONE, $sym110$ITERATOR_SHELF_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16787L)
  public static SubLObject make_iterator_shelf_state(final SubLObject shelf)
  {
    final SubLObject payload = shelf_payload( shelf );
    SubLObject vectors = NIL;
    if( payload.isVector() )
    {
      vectors = ConsesLow.list( payload );
    }
    else if( NIL != shelf_finalized_p( shelf ) )
    {
      vectors = ConsesLow.cons( Functions.apply( Symbols.symbol_function( $sym111$VECTOR ), conses_high.cdar( payload ) ), conses_high.copy_list( payload.rest() ) );
    }
    else
    {
      vectors = ConsesLow.list( Functions.apply( Symbols.symbol_function( $sym111$VECTOR ), payload ) );
    }
    final SubLObject initial_iterator = new_shelf_vector_iterator( vectors.first() );
    return ConsesLow.list( initial_iterator, vectors );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17755L)
  public static SubLObject new_shelf_vector_iterator(final SubLObject vector)
  {
    assert NIL != Types.vectorp( vector ) : vector;
    return iteration.new_filter_iterator( iteration.new_vector_iterator( vector ), Symbols.symbol_function( $sym112$BOOLEAN ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17908L)
  public static SubLObject iterator_shelf_done(final SubLObject state)
  {
    return makeBoolean( NIL != iteration.iteration_done( state.first() ) && NIL == conses_high.second( state ).rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18034L)
  public static SubLObject iterator_shelf_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iterator = state.first();
    SubLObject vectors = conses_high.second( state );
    while ( true)
    {
      thread.resetMultipleValues();
      final SubLObject iterator_item = iteration.iteration_next( iterator );
      final SubLObject iterator_valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != iterator_valid )
      {
        return Values.values( iterator_item, state, NIL );
      }
      if( NIL == vectors.rest() )
      {
        return Values.values( NIL, state, T );
      }
      vectors = vectors.rest();
      ConsesLow.set_nth( ONE_INTEGER, state, vectors );
      iterator = new_shelf_vector_iterator( vectors.first() );
      ConsesLow.set_nth( ZERO_INTEGER, state, iterator );
    }
  }

  public static SubLObject declare_shelfs_file()
  {
    SubLFiles.declareFunction( me, "shelf_info_print_function_trampoline", "SHELF-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "shelf_info_p", "SHELF-INFO-P", 1, 0, false );
    new $shelf_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "shelf_info_key", "SHELF-INFO-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_info_test", "SHELF-INFO-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_info_compare", "SHELF-INFO-COMPARE", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_info_minor_limit", "SHELF-INFO-MINOR-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_info_major_limit", "SHELF-INFO-MAJOR-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_info_key", "_CSETF-SHELF-INFO-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_info_test", "_CSETF-SHELF-INFO-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_info_compare", "_CSETF-SHELF-INFO-COMPARE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_info_minor_limit", "_CSETF-SHELF-INFO-MINOR-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_info_major_limit", "_CSETF-SHELF-INFO-MAJOR-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_shelf_info", "MAKE-SHELF-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_shelf_info", "VISIT-DEFSTRUCT-SHELF-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_shelf_info_method", "VISIT-DEFSTRUCT-OBJECT-SHELF-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shelf_print_function_trampoline", "SHELF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "shelf_p", "SHELF-P", 1, 0, false );
    new $shelf_p$UnaryFunction();
    SubLFiles.declareFunction( me, "shelf_info", "SHELF-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_payload", "SHELF-PAYLOAD", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_size", "SHELF-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_info", "_CSETF-SHELF-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_payload", "_CSETF-SHELF-PAYLOAD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_shelf_size", "_CSETF-SHELF-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_shelf", "MAKE-SHELF", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_shelf", "VISIT-DEFSTRUCT-SHELF", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_shelf_method", "VISIT-DEFSTRUCT-OBJECT-SHELF-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shelf_finalized_p", "SHELF-FINALIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "print_shelf", "PRINT-SHELF", 3, 0, false );
    SubLFiles.declareFunction( me, "allocate_shelf", "ALLOCATE-SHELF", 2, 0, false );
    SubLFiles.declareFunction( me, "initial_add_to_shelf", "INITIAL-ADD-TO-SHELF", 2, 0, false );
    SubLFiles.declareFunction( me, "finalize_shelf", "FINALIZE-SHELF", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_count", "SHELF-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_approximate_count", "SHELF-APPROXIMATE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_major_count", "SHELF-MAJOR-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_minor_count", "SHELF-MINOR-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_extra_count", "SHELF-EXTRA-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rearrange_shelf", "REARRANGE-SHELF", 1, 0, false );
    SubLFiles.declareFunction( me, "tidy_shelf", "TIDY-SHELF", 1, 0, false );
    SubLFiles.declareMacro( me, "do_shelf", "DO-SHELF" );
    SubLFiles.declareFunction( me, "map_shelf", "MAP-SHELF", 2, 1, false );
    SubLFiles.declareMacro( me, "do_shelf_from", "DO-SHELF-FROM" );
    SubLFiles.declareFunction( me, "map_shelf_from", "MAP-SHELF-FROM", 4, 0, false );
    SubLFiles.declareFunction( me, "add_to_shelf", "ADD-TO-SHELF", 2, 0, false );
    SubLFiles.declareFunction( me, "bsearch_shelf_vector", "BSEARCH-SHELF-VECTOR", 3, 0, false );
    SubLFiles.declareFunction( me, "bsearch_shelf_vector_range", "BSEARCH-SHELF-VECTOR-RANGE", 3, 0, false );
    SubLFiles.declareFunction( me, "delete_from_shelf", "DELETE-FROM-SHELF", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_shelf", "CLEAR-SHELF", 1, 0, false );
    SubLFiles.declareFunction( me, "find_in_shelf", "FIND-IN-SHELF", 2, 0, false );
    SubLFiles.declareFunction( me, "shelf_ten_percent_full_p", "SHELF-TEN-PERCENT-FULL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shelf_full_p", "SHELF-FULL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_shelf_iterator", "NEW-SHELF-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_shelf_state", "MAKE-ITERATOR-SHELF-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_shelf_vector_iterator", "NEW-SHELF-VECTOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "iterator_shelf_done", "ITERATOR-SHELF-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterator_shelf_next", "ITERATOR-SHELF-NEXT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_shelfs_file()
  {
    $dtp_shelf_info$ = SubLFiles.defconstant( "*DTP-SHELF-INFO*", $sym0$SHELF_INFO );
    $dtp_shelf$ = SubLFiles.defconstant( "*DTP-SHELF*", $sym31$SHELF );
    return NIL;
  }

  public static SubLObject setup_shelfs_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_shelf_info$.getGlobalValue(), Symbols.symbol_function( $sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$SHELF_INFO_KEY, $sym11$_CSETF_SHELF_INFO_KEY );
    Structures.def_csetf( $sym12$SHELF_INFO_TEST, $sym13$_CSETF_SHELF_INFO_TEST );
    Structures.def_csetf( $sym14$SHELF_INFO_COMPARE, $sym15$_CSETF_SHELF_INFO_COMPARE );
    Structures.def_csetf( $sym16$SHELF_INFO_MINOR_LIMIT, $sym17$_CSETF_SHELF_INFO_MINOR_LIMIT );
    Structures.def_csetf( $sym18$SHELF_INFO_MAJOR_LIMIT, $sym19$_CSETF_SHELF_INFO_MAJOR_LIMIT );
    Equality.identity( $sym0$SHELF_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_shelf_info$.getGlobalValue(), Symbols.symbol_function( $sym30$VISIT_DEFSTRUCT_OBJECT_SHELF_INFO_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_shelf$.getGlobalValue(), Symbols.symbol_function( $sym39$SHELF_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list40 );
    Structures.def_csetf( $sym0$SHELF_INFO, $sym41$_CSETF_SHELF_INFO );
    Structures.def_csetf( $sym42$SHELF_PAYLOAD, $sym43$_CSETF_SHELF_PAYLOAD );
    Structures.def_csetf( $sym44$SHELF_SIZE, $sym45$_CSETF_SHELF_SIZE );
    Equality.identity( $sym31$SHELF );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_shelf$.getGlobalValue(), Symbols.symbol_function( $sym50$VISIT_DEFSTRUCT_OBJECT_SHELF_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shelfs_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shelfs_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shelfs_file();
  }
  static
  {
    me = new shelfs();
    $dtp_shelf_info$ = null;
    $dtp_shelf$ = null;
    $sym0$SHELF_INFO = makeSymbol( "SHELF-INFO" );
    $sym1$SHELF_INFO_P = makeSymbol( "SHELF-INFO-P" );
    $int2$134 = makeInteger( 134 );
    $list3 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "TEST" ), makeSymbol( "COMPARE" ), makeSymbol( "MINOR-LIMIT" ), makeSymbol( "MAJOR-LIMIT" ) );
    $list4 = ConsesLow.list( makeKeyword( "KEY" ), makeKeyword( "TEST" ), makeKeyword( "COMPARE" ), makeKeyword( "MINOR-LIMIT" ), makeKeyword( "MAJOR-LIMIT" ) );
    $list5 = ConsesLow.list( makeSymbol( "SHELF-INFO-KEY" ), makeSymbol( "SHELF-INFO-TEST" ), makeSymbol( "SHELF-INFO-COMPARE" ), makeSymbol( "SHELF-INFO-MINOR-LIMIT" ), makeSymbol( "SHELF-INFO-MAJOR-LIMIT" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-SHELF-INFO-KEY" ), makeSymbol( "_CSETF-SHELF-INFO-TEST" ), makeSymbol( "_CSETF-SHELF-INFO-COMPARE" ), makeSymbol( "_CSETF-SHELF-INFO-MINOR-LIMIT" ), makeSymbol(
        "_CSETF-SHELF-INFO-MAJOR-LIMIT" ) );
    $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SHELF-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SHELF-INFO-P" ) );
    $sym10$SHELF_INFO_KEY = makeSymbol( "SHELF-INFO-KEY" );
    $sym11$_CSETF_SHELF_INFO_KEY = makeSymbol( "_CSETF-SHELF-INFO-KEY" );
    $sym12$SHELF_INFO_TEST = makeSymbol( "SHELF-INFO-TEST" );
    $sym13$_CSETF_SHELF_INFO_TEST = makeSymbol( "_CSETF-SHELF-INFO-TEST" );
    $sym14$SHELF_INFO_COMPARE = makeSymbol( "SHELF-INFO-COMPARE" );
    $sym15$_CSETF_SHELF_INFO_COMPARE = makeSymbol( "_CSETF-SHELF-INFO-COMPARE" );
    $sym16$SHELF_INFO_MINOR_LIMIT = makeSymbol( "SHELF-INFO-MINOR-LIMIT" );
    $sym17$_CSETF_SHELF_INFO_MINOR_LIMIT = makeSymbol( "_CSETF-SHELF-INFO-MINOR-LIMIT" );
    $sym18$SHELF_INFO_MAJOR_LIMIT = makeSymbol( "SHELF-INFO-MAJOR-LIMIT" );
    $sym19$_CSETF_SHELF_INFO_MAJOR_LIMIT = makeSymbol( "_CSETF-SHELF-INFO-MAJOR-LIMIT" );
    $kw20$KEY = makeKeyword( "KEY" );
    $kw21$TEST = makeKeyword( "TEST" );
    $kw22$COMPARE = makeKeyword( "COMPARE" );
    $kw23$MINOR_LIMIT = makeKeyword( "MINOR-LIMIT" );
    $kw24$MAJOR_LIMIT = makeKeyword( "MAJOR-LIMIT" );
    $str25$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw26$BEGIN = makeKeyword( "BEGIN" );
    $sym27$MAKE_SHELF_INFO = makeSymbol( "MAKE-SHELF-INFO" );
    $kw28$SLOT = makeKeyword( "SLOT" );
    $kw29$END = makeKeyword( "END" );
    $sym30$VISIT_DEFSTRUCT_OBJECT_SHELF_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SHELF-INFO-METHOD" );
    $sym31$SHELF = makeSymbol( "SHELF" );
    $sym32$SHELF_P = makeSymbol( "SHELF-P" );
    $int33$135 = makeInteger( 135 );
    $list34 = ConsesLow.list( makeSymbol( "INFO" ), makeSymbol( "PAYLOAD" ), makeSymbol( "SIZE" ) );
    $list35 = ConsesLow.list( makeKeyword( "INFO" ), makeKeyword( "PAYLOAD" ), makeKeyword( "SIZE" ) );
    $list36 = ConsesLow.list( makeSymbol( "SHELF-INFO" ), makeSymbol( "SHELF-PAYLOAD" ), makeSymbol( "SHELF-SIZE" ) );
    $list37 = ConsesLow.list( makeSymbol( "_CSETF-SHELF-INFO" ), makeSymbol( "_CSETF-SHELF-PAYLOAD" ), makeSymbol( "_CSETF-SHELF-SIZE" ) );
    $sym38$PRINT_SHELF = makeSymbol( "PRINT-SHELF" );
    $sym39$SHELF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SHELF-PRINT-FUNCTION-TRAMPOLINE" );
    $list40 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SHELF-P" ) );
    $sym41$_CSETF_SHELF_INFO = makeSymbol( "_CSETF-SHELF-INFO" );
    $sym42$SHELF_PAYLOAD = makeSymbol( "SHELF-PAYLOAD" );
    $sym43$_CSETF_SHELF_PAYLOAD = makeSymbol( "_CSETF-SHELF-PAYLOAD" );
    $sym44$SHELF_SIZE = makeSymbol( "SHELF-SIZE" );
    $sym45$_CSETF_SHELF_SIZE = makeSymbol( "_CSETF-SHELF-SIZE" );
    $kw46$INFO = makeKeyword( "INFO" );
    $kw47$PAYLOAD = makeKeyword( "PAYLOAD" );
    $kw48$SIZE = makeKeyword( "SIZE" );
    $sym49$MAKE_SHELF = makeSymbol( "MAKE-SHELF" );
    $sym50$VISIT_DEFSTRUCT_OBJECT_SHELF_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SHELF-METHOD" );
    $str51$_D_items = makeString( "~D items" );
    $str52$__unfinalized_ = makeString( " (unfinalized)" );
    $str53$Finalizing__S_before_its_time_ = makeString( "Finalizing ~S before its time." );
    $str54$_S_has_already_been_finalized_ = makeString( "~S has already been finalized." );
    $str55$Shelf__S_being_finalized_with_les = makeString( "Shelf ~S being finalized with less than expected ~D items." );
    $sym56$NULL = makeSymbol( "NULL" );
    $str57$Finalize_it_ = makeString( "Finalize it." );
    $str58$_S_has_not_been_finalized_ = makeString( "~S has not been finalized." );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "SHELF" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "do-shelf" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $str60$do_shelf = makeString( "do-shelf" );
    $sym61$SHELF_VAR = makeUninternedSymbol( "SHELF-VAR" );
    $sym62$PAYLOAD = makeUninternedSymbol( "PAYLOAD" );
    $sym63$I = makeUninternedSymbol( "I" );
    $sym64$VECTOR = makeUninternedSymbol( "VECTOR" );
    $sym65$DATA = makeUninternedSymbol( "DATA" );
    $sym66$CLET = makeSymbol( "CLET" );
    $sym67$CSETQ = makeSymbol( "CSETQ" );
    $sym68$_PROGRESS_NOTE_ = makeSymbol( "*PROGRESS-NOTE*" );
    $list69 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*PROGRESS-START-TIME*" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ) ) );
    $sym70$_PROGRESS_TOTAL_ = makeSymbol( "*PROGRESS-TOTAL*" );
    $sym71$SHELF_APPROXIMATE_COUNT = makeSymbol( "SHELF-APPROXIMATE-COUNT" );
    $list72 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*PROGRESS-SOFAR*" ), ZERO_INTEGER );
    $sym73$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym74$PIF = makeSymbol( "PIF" );
    $sym75$SHELF_FINALIZED_P = makeSymbol( "SHELF-FINALIZED-P" );
    $sym76$VECTORP = makeSymbol( "VECTORP" );
    $sym77$CDOTIMES = makeSymbol( "CDOTIMES" );
    $sym78$LENGTH = makeSymbol( "LENGTH" );
    $sym79$AREF = makeSymbol( "AREF" );
    $sym80$PWHEN = makeSymbol( "PWHEN" );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "NOTE-PERCENT-PROGRESS" ), makeSymbol( "*PROGRESS-SOFAR*" ), makeSymbol( "*PROGRESS-TOTAL*" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol(
        "*PROGRESS-SOFAR*" ) ) );
    $sym82$PROGN = makeSymbol( "PROGN" );
    $sym83$CDOLIST = makeSymbol( "CDOLIST" );
    $sym84$CDAR = makeSymbol( "CDAR" );
    $sym85$CDR = makeSymbol( "CDR" );
    $sym86$CAR = makeSymbol( "CAR" );
    $list87 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "SHELF" ), makeSymbol( "ITEM" ), makeSymbol( "FORWARDP" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym88$SHELF_VAR = makeUninternedSymbol( "SHELF-VAR" );
    $sym89$VECTOR = makeUninternedSymbol( "VECTOR" );
    $sym90$LOW = makeUninternedSymbol( "LOW" );
    $sym91$HIGH = makeUninternedSymbol( "HIGH" );
    $sym92$I = makeUninternedSymbol( "I" );
    $sym93$LENGTH = makeUninternedSymbol( "LENGTH" );
    $sym94$PUNLESS = makeSymbol( "PUNLESS" );
    $sym95$FINALIZE_SHELF = makeSymbol( "FINALIZE-SHELF" );
    $sym96$REARRANGE_SHELF = makeSymbol( "REARRANGE-SHELF" );
    $sym97$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym98$BSEARCH_SHELF_VECTOR_RANGE = makeSymbol( "BSEARCH-SHELF-VECTOR-RANGE" );
    $sym99$CDO = makeSymbol( "CDO" );
    $sym100$_ = makeSymbol( "+" );
    $list101 = ConsesLow.list( ONE_INTEGER );
    $sym102$CNOT = makeSymbol( "CNOT" );
    $sym103$_ = makeSymbol( "<" );
    $sym104$CSETF = makeSymbol( "CSETF" );
    $sym105$_ = makeSymbol( "-" );
    $list106 = ConsesLow.list( ZERO_INTEGER );
    $str107$Ignore_the_addition_ = makeString( "Ignore the addition." );
    $str108$Attempt_to_add__S_to__S_ = makeString( "Attempt to add ~S to ~S." );
    $sym109$ITERATOR_SHELF_DONE = makeSymbol( "ITERATOR-SHELF-DONE" );
    $sym110$ITERATOR_SHELF_NEXT = makeSymbol( "ITERATOR-SHELF-NEXT" );
    $sym111$VECTOR = makeSymbol( "VECTOR" );
    $sym112$BOOLEAN = makeSymbol( "BOOLEAN" );
  }

  public static final class $shelf_info_native
      extends
        SubLStructNative
  {
    public SubLObject $key;
    public SubLObject $test;
    public SubLObject $compare;
    public SubLObject $minor_limit;
    public SubLObject $major_limit;
    private static final SubLStructDeclNative structDecl;

    public $shelf_info_native()
    {
      this.$key = CommonSymbols.NIL;
      this.$test = CommonSymbols.NIL;
      this.$compare = CommonSymbols.NIL;
      this.$minor_limit = CommonSymbols.NIL;
      this.$major_limit = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $shelf_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$key;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$test;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$compare;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$minor_limit;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$major_limit;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$key = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$test = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$compare = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$minor_limit = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$major_limit = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $shelf_info_native.class, $sym0$SHELF_INFO, $sym1$SHELF_INFO_P, $list3, $list4, new String[] { "$key", "$test", "$compare", "$minor_limit", "$major_limit"
      }, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $shelf_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $shelf_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SHELF-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return shelf_info_p( arg1 );
    }
  }

  public static final class $shelf_native
      extends
        SubLStructNative
  {
    public SubLObject $info;
    public SubLObject $payload;
    public SubLObject $size;
    private static final SubLStructDeclNative structDecl;

    public $shelf_native()
    {
      this.$info = CommonSymbols.NIL;
      this.$payload = CommonSymbols.NIL;
      this.$size = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $shelf_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$info;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$payload;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$size;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$info = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$payload = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$size = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $shelf_native.class, $sym31$SHELF, $sym32$SHELF_P, $list34, $list35, new String[] { "$info", "$payload", "$size"
      }, $list36, $list37, $sym38$PRINT_SHELF );
    }
  }

  public static final class $shelf_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $shelf_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SHELF-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return shelf_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 349 ms
 * 
 */