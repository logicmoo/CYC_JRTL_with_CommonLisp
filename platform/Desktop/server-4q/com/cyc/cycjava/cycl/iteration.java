package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class iteration
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.iteration";
  public static final String myFingerPrint = "a88134f42506e1e7401358fb69407f82e18bc51c973877839ceeac2afa576248";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLSymbol $dtp_iterator$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1961L)
  private static SubLSymbol $within_print_iterator$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54087L)
  public static SubLSymbol $xform_fn_param_do_not_pass$;
  private static final SubLSymbol $sym0$ITERATOR;
  private static final SubLSymbol $sym1$ITERATOR_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_ITERATOR;
  private static final SubLSymbol $sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$IT_STATE;
  private static final SubLSymbol $sym10$_CSETF_IT_STATE;
  private static final SubLSymbol $sym11$IT_DONE;
  private static final SubLSymbol $sym12$_CSETF_IT_DONE;
  private static final SubLSymbol $sym13$IT_NEXT;
  private static final SubLSymbol $sym14$_CSETF_IT_NEXT;
  private static final SubLSymbol $sym15$IT_FINALIZE;
  private static final SubLSymbol $sym16$_CSETF_IT_FINALIZE;
  private static final SubLSymbol $kw17$STATE;
  private static final SubLSymbol $kw18$DONE;
  private static final SubLSymbol $kw19$NEXT;
  private static final SubLSymbol $kw20$FINALIZE;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_ITERATOR;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD;
  private static final SubLString $str27$_DONE_;
  private static final SubLString $str28$_;
  private static final SubLSymbol $sym29$TRUE;
  private static final SubLSymbol $sym30$HL_STORE_ITERATOR_NEXT;
  private static final SubLSymbol $sym31$FILTER_ITERATOR_NEXT;
  private static final SubLSymbol $sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT;
  private static final SubLSymbol $sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER;
  private static final SubLSymbol $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL;
  private static final SubLString $str35$_NEXT;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $sym39$ITERATOR_VAR;
  private static final SubLSymbol $sym40$CLET;
  private static final SubLSymbol $sym41$DO_ITERATOR;
  private static final SubLSymbol $sym42$DONE_VAR;
  private static final SubLSymbol $sym43$VALID;
  private static final SubLSymbol $sym44$UNTIL;
  private static final SubLSymbol $sym45$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym46$ITERATION_NEXT;
  private static final SubLSymbol $sym47$PWHEN;
  private static final SubLSymbol $sym48$CSETQ;
  private static final SubLSymbol $sym49$COR;
  private static final SubLSymbol $sym50$CNOT;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$INVALID_TOKEN;
  private static final SubLSymbol $kw54$PROGRESS_MESSAGE;
  private static final SubLSymbol $sym55$NOTING_PROGRESS;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$ITERATOR_VAR;
  private static final SubLSymbol $sym61$DONE_VAR;
  private static final SubLSymbol $sym62$TOKEN_VAR;
  private static final SubLSymbol $sym63$VALID;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$COUNT;
  private static final SubLSymbol $sym66$NEW_DONE;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$__;
  private static final SubLSymbol $sym69$PROGN;
  private static final SubLSymbol $sym70$CINC;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$COPY_TREE;
  private static final SubLSymbol $sym73$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym74$FALSE;
  private static final SubLSymbol $sym75$NULL;
  private static final SubLSymbol $sym76$ITERATE_NON_NULL_SINGLETON_NEXT;
  private static final SubLSymbol $sym77$INTEGERP;
  private static final SubLSymbol $sym78$NUMBERP;
  private static final SubLSymbol $sym79$ITERATE_NUMBER_DONE;
  private static final SubLSymbol $sym80$ITERATE_NUMBER_NEXT;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$ITERATE_LIST_NEXT;
  private static final SubLSymbol $sym83$LISTP;
  private static final SubLSymbol $sym84$ITERATE_LIST_DONE;
  private static final SubLSymbol $sym85$LIST_ITERATOR_P;
  private static final SubLSymbol $sym86$ITERATE_INFERENCE_LIST_NEXT;
  private static final SubLSymbol $sym87$ITERATE_INFERENCE_LIST_DONE;
  private static final SubLSymbol $sym88$INFERENCE_LIST_ITERATOR_P;
  private static final SubLSymbol $sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER;
  private static final SubLSymbol $sym90$ALIST_P;
  private static final SubLSymbol $sym91$CONS_TO_TUPLE;
  private static final SubLSymbol $sym92$VECTORP;
  private static final SubLSymbol $sym93$DEFAULT_ITERATOR_DONE_P;
  private static final SubLSymbol $sym94$ITERATE_VECTOR_NEXT;
  private static final SubLList $list95;
  private static final SubLSymbol $kw96$UNINITIALIZED;
  private static final SubLSymbol $sym97$ITERATE_VECTOR_INDEX_NEXT;
  private static final SubLSymbol $sym98$STRINGP;
  private static final SubLSymbol $sym99$SEQUENCEP;
  private static final SubLString $str100$_S_was_not_a_sequence;
  private static final SubLSymbol $sym101$HASH_TABLE_P;
  private static final SubLSymbol $sym102$ITERATOR_HASH_TABLE_DONE;
  private static final SubLSymbol $sym103$ITERATOR_HASH_TABLE_NEXT;
  private static final SubLSymbol $kw104$KEY;
  private static final SubLSymbol $kw105$VALUE;
  private static final SubLList $list106;
  private static final SubLList $list107;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym110$FILE_FORM_ITERATOR_DONE_;
  private static final SubLSymbol $sym111$FILE_FORM_ITERATOR_NEXT;
  private static final SubLSymbol $sym112$FILE_FORM_ITERATOR_FINALIZE;
  private static final SubLSymbol $kw113$INPUT;
  private static final SubLSymbol $kw114$EOF;
  private static final SubLList $list115;
  private static final SubLSymbol $kw116$CLOSED;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$LAZY_ITERATOR_DONE;
  private static final SubLSymbol $sym119$LAZY_ITERATOR_NEXT;
  private static final SubLList $list120;
  private static final SubLString $str121$_A_is_not_a_well_formed_uninitial;
  private static final SubLSymbol $sym122$CYC_API_EVAL;
  private static final SubLSymbol $sym123$CONSP;
  private static final SubLSymbol $sym124$ITERATE_INDIRECT_FINALIZE;
  private static final SubLSymbol $sym125$ITERATE_INDIRECT_NEXT;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$ITERATE_FACTORY_FINALIZE;
  private static final SubLSymbol $sym128$ITERATE_FACTORY_NEXT;
  private static final SubLSymbol $kw129$START;
  private static final SubLList $list130;
  private static final SubLSymbol $kw131$CONSTRUCT;
  private static final SubLList $list132;
  private static final SubLSymbol $kw133$SUBITERATE;
  private static final SubLSymbol $sym134$META_ITERATOR_ITERATOR_DONE;
  private static final SubLSymbol $sym135$META_ITERATOR_ITERATOR_NEXT;
  private static final SubLSymbol $sym136$META_ITERATOR_ITERATOR_FINALIZE;
  private static final SubLSymbol $kw137$EXHAUSTED;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$ITERATOR_ITERATOR_DONE;
  private static final SubLSymbol $sym140$ITERATOR_ITERATOR_NEXT;
  private static final SubLSymbol $sym141$ITERATOR_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym142$ROTATING_ITERATOR_ITERATOR_DONE;
  private static final SubLSymbol $sym143$ROTATING_ITERATOR_ITERATOR_NEXT;
  private static final SubLSymbol $sym144$ROTATING_ITERATOR_ITERATOR_FINALIZE;
  private static final SubLString $str145$;
  private static final SubLString $str146$invalid_lazy_iterator_found_in_me;
  private static final SubLString $str147$in_make_rotating_iterator_iterato;
  private static final SubLList $list148;
  private static final SubLSymbol $kw149$INITIAL;
  private static final SubLSymbol $sym150$REUSABLE_ITERATOR_DONE;
  private static final SubLSymbol $sym151$REUSABLE_ITERATOR_NEXT;
  private static final SubLSymbol $sym152$REUSABLE_ITERATOR_FINALIZE;
  private static final SubLList $list153;
  private static final SubLSymbol $kw154$REUSE;
  private static final SubLString $str155$Unknown_mode___a_;
  private static final SubLSymbol $sym156$REUSABLE_ITERATOR_FROM_ITERATOR_DONE;
  private static final SubLSymbol $sym157$REUSABLE_ITERATOR_FROM_ITERATOR_NEXT;
  private static final SubLSymbol $sym158$REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLSymbol $kw161$RESET;
  private static final SubLSymbol $sym162$RESET_REUSABLE_ITERATOR;
  private static final SubLSymbol $sym163$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE;
  private static final SubLSymbol $sym164$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT;
  private static final SubLSymbol $sym165$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE;
  private static final SubLList $list166;
  private static final SubLSymbol $sym167$FILTER_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym168$FILTER_AND_TRANSFORM_ITERATOR_NEXT;
  private static final SubLList $list169;
  private static final SubLList $list170;
  private static final SubLString $str171$YOU_SHALL_NOT_PASS;
  private static final SubLSymbol $sym172$XFORM_ITERATOR_DONE;
  private static final SubLSymbol $sym173$XFORM_ITERATOR_NEXT;
  private static final SubLSymbol $sym174$XFORM_ITERATOR_FINALIZE;
  private static final SubLList $list175;
  private static final SubLSymbol $sym176$ITERATE_XML_TOKEN_NEXT;
  private static final SubLSymbol $sym177$XML_TOKEN_ITERATOR_P;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_iterator( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject iterator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $iterator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject it_state(final SubLObject v_object)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject it_done(final SubLObject v_object)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject it_next(final SubLObject v_object)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject it_finalize(final SubLObject v_object)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject _csetf_it_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject _csetf_it_done(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject _csetf_it_next(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject _csetf_it_finalize(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != iterator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject make_iterator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $iterator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$STATE ) )
      {
        _csetf_it_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$DONE ) )
      {
        _csetf_it_done( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$NEXT ) )
      {
        _csetf_it_next( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$FINALIZE ) )
      {
        _csetf_it_finalize( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject visit_defstruct_iterator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_ITERATOR, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$STATE, it_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$DONE, it_done( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$NEXT, it_next( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$FINALIZE, it_finalize( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_ITERATOR, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1840L)
  public static SubLObject visit_defstruct_object_iterator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_iterator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2090L)
  public static SubLObject print_iterator(final SubLObject iterator, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( iterator, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, iterator, T, T );
      final SubLObject _prev_bind_0 = $within_print_iterator$.currentBinding( thread );
      try
      {
        $within_print_iterator$.bind( T, thread );
        if( NIL != it_done( iterator ) && NIL == lazy_iterator_uninitializedP( iterator ) && NIL != iteration_done( iterator ) )
        {
          streams_high.write_string( $str27$_DONE_, stream, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        $within_print_iterator$.rebind( _prev_bind_0, thread );
      }
      if( NIL != it_next( iterator ) )
      {
        streams_high.write_string( iterator_type_name( iterator ), stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str28$_, stream, UNPROVIDED, UNPROVIDED );
      }
      print_macros.print_unreadable_object_postamble( stream, iterator, T, T );
    }
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2564L)
  public static SubLObject new_iterator(final SubLObject state, final SubLObject done, final SubLObject next, SubLObject finalize)
  {
    if( finalize == UNPROVIDED )
    {
      finalize = Symbols.symbol_function( $sym29$TRUE );
    }
    final SubLObject iterator = make_iterator( UNPROVIDED );
    _csetf_it_state( iterator, state );
    _csetf_it_done( iterator, done );
    _csetf_it_next( iterator, next );
    _csetf_it_finalize( iterator, finalize );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3925L)
  public static SubLObject iteration_done(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    return Functions.funcall( it_done( iterator ), it_state( iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4116L)
  public static SubLObject iteration_next_funcall(final SubLObject next_func, final SubLObject next_state)
  {
    if( next_func.eql( $sym30$HL_STORE_ITERATOR_NEXT ) )
    {
      return hl_interface_infrastructure.hl_store_iterator_next( next_state );
    }
    if( next_func.eql( $sym31$FILTER_ITERATOR_NEXT ) )
    {
      return filter_iterator_next( next_state );
    }
    if( next_func.eql( $sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT ) )
    {
      return filter_iterator_without_values_next( next_state );
    }
    return Functions.funcall( next_func, next_state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4508L)
  public static SubLObject iteration_next(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != iterator_p( iterator ) : iterator;
    final SubLObject quitP = Functions.funcall( it_done( iterator ), it_state( iterator ) );
    SubLObject next_state = it_state( iterator );
    SubLObject next_item = NIL;
    SubLObject validP = NIL;
    if( NIL == quitP )
    {
      thread.resetMultipleValues();
      final SubLObject raw_item = iteration_next_funcall( it_next( iterator ), next_state );
      final SubLObject raw_state = thread.secondMultipleValue();
      final SubLObject halted_prematurely = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      next_state = raw_state;
      if( NIL == halted_prematurely )
      {
        next_item = raw_item;
        validP = T;
      }
    }
    if( !next_state.eql( it_state( iterator ) ) )
    {
      _csetf_it_state( iterator, next_state );
    }
    return subl_promotions.values2( next_item, validP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5219L)
  public static SubLObject iteration_next_without_values(final SubLObject iterator, SubLObject invalid_token)
  {
    if( invalid_token == UNPROVIDED )
    {
      invalid_token = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != iterator_p( iterator ) : iterator;
    final SubLObject quitP = Functions.funcall( it_done( iterator ), it_state( iterator ) );
    SubLObject next_state = it_state( iterator );
    SubLObject next_item = NIL;
    SubLObject validP = NIL;
    if( NIL == quitP )
    {
      thread.resetMultipleValues();
      final SubLObject raw_item = iteration_next_funcall( it_next( iterator ), next_state );
      final SubLObject raw_state = thread.secondMultipleValue();
      final SubLObject halted_prematurely = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      next_state = raw_state;
      if( NIL == halted_prematurely )
      {
        next_item = raw_item;
        validP = T;
      }
    }
    if( !next_state.eql( it_state( iterator ) ) )
    {
      _csetf_it_state( iterator, next_state );
    }
    return ( NIL != validP ) ? next_item : invalid_token;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6007L)
  public static SubLObject iteration_next_without_values_macro_helper(final SubLObject iterator, SubLObject invalid_token)
  {
    if( invalid_token == UNPROVIDED )
    {
      invalid_token = NIL;
    }
    return iteration_next_without_values( iterator, invalid_token );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6218L)
  public static SubLObject iteration_finalize(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    return Functions.funcall( it_finalize( iterator ), it_state( iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6361L)
  public static SubLObject iterator_type_name(final SubLObject iterator)
  {
    return string_utilities.post_remove( string_utilities.function_to_string( it_next( iterator ) ), $str35$_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6716L)
  public static SubLObject iteration_state_peek(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    return it_state( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6985L)
  public static SubLObject iteration_next_peek(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    return it_next( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7255L)
  public static SubLObject do_iterator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list36 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list36 );
      if( NIL == conses_high.member( current_$1, $list37, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw18$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !iterator.isSymbol() )
    {
      final SubLObject iterator_var = $sym39$ITERATOR_VAR;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( iterator_var, iterator ) ), ConsesLow.listS( $sym41$DO_ITERATOR, ConsesLow.list( var, iterator_var, $kw18$DONE, done ), ConsesLow.append( body,
          NIL ) ) );
    }
    final SubLObject done_var = $sym42$DONE_VAR;
    final SubLObject valid = $sym43$VALID;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( done_var, done ) ), ConsesLow.list( $sym44$UNTIL, done_var, ConsesLow.list( $sym45$CMULTIPLE_VALUE_BIND, ConsesLow.list( var, valid ), ConsesLow
        .list( $sym46$ITERATION_NEXT, iterator ), ConsesLow.listS( $sym47$PWHEN, valid, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym48$CSETQ, done_var, ( NIL != done ) ? ConsesLow.list( $sym49$COR, ConsesLow
            .list( $sym50$CNOT, valid ), done ) : ConsesLow.list( $sym50$CNOT, valid ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8032L)
  public static SubLObject do_iterator_without_values_progress(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
      if( NIL == conses_high.member( current_$2, $list52, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
    }
    final SubLObject invalid_token_tail = cdestructuring_bind.property_list_member( $kw53$INVALID_TOKEN, current );
    final SubLObject invalid_token = ( NIL != invalid_token_tail ) ? conses_high.cadr( invalid_token_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw18$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw54$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym55$NOTING_PROGRESS, progress_message, ConsesLow.listS( $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( var, iterator, $kw53$INVALID_TOKEN, invalid_token, $kw18$DONE, done ),
        $list56, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8530L)
  public static SubLObject do_iterator_without_values(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      if( NIL == conses_high.member( current_$3, $list58, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
    }
    final SubLObject invalid_token_tail = cdestructuring_bind.property_list_member( $kw53$INVALID_TOKEN, current );
    final SubLObject invalid_token = ( NIL != invalid_token_tail ) ? conses_high.cadr( invalid_token_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw18$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( var, iterator, $kw53$INVALID_TOKEN, invalid_token, $kw18$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8913L)
  public static SubLObject do_iterator_without_values_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      if( NIL == conses_high.member( current_$4, $list58, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
    }
    final SubLObject invalid_token_tail = cdestructuring_bind.property_list_member( $kw53$INVALID_TOKEN, current );
    final SubLObject invalid_token = ( NIL != invalid_token_tail ) ? conses_high.cadr( invalid_token_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw18$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !iterator.isSymbol() )
    {
      final SubLObject iterator_var = $sym60$ITERATOR_VAR;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( iterator_var, iterator ) ), ConsesLow.listS( $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( var, iterator_var, $kw53$INVALID_TOKEN,
          invalid_token, $kw18$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    final SubLObject done_var = $sym61$DONE_VAR;
    final SubLObject token_var = $sym62$TOKEN_VAR;
    final SubLObject valid = $sym63$VALID;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( done_var, done ), ConsesLow.list( token_var, invalid_token ) ), ConsesLow.list( $sym44$UNTIL, done_var, ConsesLow.list( $sym40$CLET, ConsesLow.list(
        ConsesLow.list( var, ConsesLow.list( $sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, iterator, token_var ) ), ConsesLow.list( valid, ConsesLow.list( $sym50$CNOT, ConsesLow.list( EQ, token_var, var ) ) ) ),
        ConsesLow.listS( $sym47$PWHEN, valid, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym48$CSETQ, done_var, ( NIL != done ) ? ConsesLow.list( $sym49$COR, ConsesLow.list( $sym50$CNOT, valid ), done )
            : ConsesLow.list( $sym50$CNOT, valid ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10097L)
  public static SubLObject do_n_iterator_objects(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject n = NIL;
    SubLObject iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    n = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list64 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list64 );
      if( NIL == conses_high.member( current_$5, $list37, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw18$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject count = $sym65$COUNT;
    final SubLObject new_done = $sym66$NEW_DONE;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( reader.bq_cons( count, $list67 ), ConsesLow.list( new_done, ConsesLow.list( $sym49$COR, done, ConsesLow.list( $sym68$__, count, n ) ) ) ), ConsesLow.list(
        $sym41$DO_ITERATOR, ConsesLow.list( var, iterator, $kw18$DONE, new_done ), reader.bq_cons( $sym69$PROGN, ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym70$CINC, count ), ConsesLow.list( $sym47$PWHEN,
            ConsesLow.list( $sym49$COR, done, ConsesLow.list( $sym68$__, count, n ) ), ConsesLow.listS( $sym48$CSETQ, new_done, $list71 ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10607L)
  public static SubLObject map_iterator(final SubLObject function, final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject item = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        Functions.funcall( function, item );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10793L)
  public static SubLObject copy_iterator(final SubLObject iterator, SubLObject copy_function)
  {
    if( copy_function == UNPROVIDED )
    {
      copy_function = $sym72$COPY_TREE;
    }
    assert NIL != iterator_p( iterator ) : iterator;
    assert NIL != Types.function_spec_p( copy_function ) : copy_function;
    final SubLObject state = it_state( iterator );
    final SubLObject done = it_done( iterator );
    final SubLObject next = it_next( iterator );
    final SubLObject finalize = it_finalize( iterator );
    final SubLObject new_state = Functions.funcall( copy_function, state );
    return new_iterator( new_state, done, next, finalize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11258L)
  public static SubLObject iterator_value_list(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject value = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        result = ConsesLow.cons( value, result );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11464L)
  public static SubLObject generic_producer(final SubLObject iterator, final SubLObject action, SubLObject suspend)
  {
    if( suspend == UNPROVIDED )
    {
      suspend = Symbols.symbol_function( $sym74$FALSE );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != iterator_p( iterator ) : iterator;
    if( NIL != suspend && !suspend.eql( Symbols.symbol_function( $sym74$FALSE ) ) )
    {
      while ( NIL != Functions.funcall( suspend ))
      {
      }
    }
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject item = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        Functions.funcall( action, item );
        if( NIL != suspend && !suspend.eql( Symbols.symbol_function( $sym74$FALSE ) ) )
        {
          while ( NIL != Functions.funcall( suspend ))
          {
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12121L)
  public static SubLObject new_null_iterator()
  {
    return new_list_iterator( NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12470L)
  public static SubLObject new_singleton_iterator(final SubLObject item)
  {
    if( NIL == item )
    {
      return new_list_iterator( ConsesLow.list( item ) );
    }
    return new_iterator( item, $sym75$NULL, $sym76$ITERATE_NON_NULL_SINGLETON_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12878L)
  public static SubLObject iterate_non_null_singleton_next(final SubLObject state)
  {
    return subl_promotions.values3( state, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12982L)
  public static SubLObject new_integer_iterator(SubLObject start, SubLObject end, SubLObject delta)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( delta == UNPROVIDED )
    {
      delta = ONE_INTEGER;
    }
    assert NIL != Types.integerp( start ) : start;
    assert NIL != Types.integerp( delta ) : delta;
    return new_number_iterator( start, end, delta );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13495L)
  public static SubLObject new_number_iterator(SubLObject start, SubLObject end, SubLObject delta)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( delta == UNPROVIDED )
    {
      delta = ONE_INTEGER;
    }
    assert NIL != Types.numberp( start ) : start;
    assert NIL != Types.numberp( delta ) : delta;
    if( NIL != end && !assertionsDisabledSynth && NIL == Types.numberp( end ) )
    {
      throw new AssertionError( end );
    }
    return new_iterator( make_iterator_number_state( start, end, delta ), $sym79$ITERATE_NUMBER_DONE, $sym80$ITERATE_NUMBER_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14228L)
  public static SubLObject make_iterator_number_state(final SubLObject start, final SubLObject end, final SubLObject delta)
  {
    return ConsesLow.list( start, delta, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14526L)
  public static SubLObject iterate_number_done(final SubLObject state)
  {
    SubLObject current_$6 = NIL;
    SubLObject delta = NIL;
    SubLObject end = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list81 );
    current_$6 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list81 );
    delta = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list81 );
    end = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list81 );
      return NIL;
    }
    if( NIL == end )
    {
      return NIL;
    }
    if( delta.isPositive() )
    {
      return Numbers.numGE( current_$6, end );
    }
    if( delta.isNegative() )
    {
      return Numbers.numLE( current_$6, end );
    }
    return Numbers.numE( current_$6, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14789L)
  public static SubLObject iterate_number_next(final SubLObject state)
  {
    SubLObject current_$7 = NIL;
    SubLObject delta = NIL;
    SubLObject end = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list81 );
    current_$7 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list81 );
    delta = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list81 );
    end = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject next = current_$7;
      final SubLObject update = Numbers.add( current_$7, delta );
      ConsesLow.rplaca( state, update );
      return subl_promotions.values3( next, state, NIL );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list81 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15026L)
  public static SubLObject list_iterator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != iterator_p( v_object ) && it_next( v_object ) == $sym82$ITERATE_LIST_NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15257L)
  public static SubLObject new_list_iterator(final SubLObject list)
  {
    assert NIL != Types.listp( list ) : list;
    return new_iterator( make_iterator_list_state( list ), $sym84$ITERATE_LIST_DONE, $sym82$ITERATE_LIST_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15482L)
  public static SubLObject get_list_iterator_list(final SubLObject iterator)
  {
    assert NIL != list_iterator_p( iterator ) : iterator;
    return it_state( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15674L)
  public static SubLObject list_iterator_size(final SubLObject list_iterator)
  {
    return Sequences.length( get_list_iterator_list( list_iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15856L)
  public static SubLObject make_iterator_list_state(final SubLObject list)
  {
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16040L)
  public static SubLObject iterate_list_done(final SubLObject state)
  {
    return Types.sublisp_null( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16107L)
  public static SubLObject iterate_list_next(final SubLObject state)
  {
    final SubLObject next = state.first();
    final SubLObject update = state.rest();
    return subl_promotions.values3( next, update, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16244L)
  public static SubLObject inference_list_iterator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != iterator_p( v_object ) && it_next( v_object ) == $sym86$ITERATE_INFERENCE_LIST_NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16668L)
  public static SubLObject new_inference_list_iterator(final SubLObject list)
  {
    assert NIL != Types.listp( list ) : list;
    return new_iterator( make_inference_iterator_list_state( list ), $sym87$ITERATE_INFERENCE_LIST_DONE, $sym86$ITERATE_INFERENCE_LIST_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16933L)
  public static SubLObject get_inference_list_iterator_list(final SubLObject iterator)
  {
    assert NIL != inference_list_iterator_p( iterator ) : iterator;
    return it_state( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17145L)
  public static SubLObject inference_list_iterator_size(final SubLObject list_iterator)
  {
    return Sequences.length( get_inference_list_iterator_list( list_iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17347L)
  public static SubLObject make_inference_iterator_list_state(final SubLObject list)
  {
    if( NIL != inference_trampolines.expression_has_inference_excepted_assertionP_iteration_helper( list ) )
    {
    }
    return Sequences.remove_if( $sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER, list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18124L)
  public static SubLObject iterate_inference_list_done(final SubLObject state)
  {
    return Types.sublisp_null( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18201L)
  public static SubLObject iterate_inference_list_next(final SubLObject state)
  {
    final SubLObject next = state.first();
    final SubLObject update = state.rest();
    return subl_promotions.values3( next, update, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18348L)
  public static SubLObject new_alist_iterator(final SubLObject alist)
  {
    assert NIL != list_utilities.alist_p( alist ) : alist;
    return new_indirect_iterator( new_list_iterator( alist ), $sym91$CONS_TO_TUPLE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18727L)
  public static SubLObject new_vector_iterator(final SubLObject vector)
  {
    assert NIL != Types.vectorp( vector ) : vector;
    return new_iterator( make_iterator_vector_state( vector ), $sym93$DEFAULT_ITERATOR_DONE_P, $sym94$ITERATE_VECTOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19214L)
  public static SubLObject make_iterator_vector_state(final SubLObject vector)
  {
    final SubLObject current = ZERO_INTEGER;
    return ConsesLow.list( current, vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19450L)
  public static SubLObject iterate_vector_next(final SubLObject state)
  {
    SubLObject current_$8 = NIL;
    SubLObject vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list95 );
    current_$8 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list95 );
    vector = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject next = Vectors.aref( vector, current_$8 );
      SubLObject update = Numbers.add( ONE_INTEGER, current_$8 );
      if( update.numE( Sequences.length( vector ) ) )
      {
        update = $kw18$DONE;
        ConsesLow.set_nth( ONE_INTEGER, state, $kw96$UNINITIALIZED );
      }
      ConsesLow.rplaca( state, update );
      return subl_promotions.values2( next, state );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list95 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19805L)
  public static SubLObject new_vector_index_iterator(final SubLObject vector)
  {
    assert NIL != Types.vectorp( vector ) : vector;
    return new_iterator( make_iterator_vector_index_state( vector ), $sym93$DEFAULT_ITERATOR_DONE_P, $sym97$ITERATE_VECTOR_INDEX_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20205L)
  public static SubLObject make_iterator_vector_index_state(final SubLObject vector)
  {
    final SubLObject current = ZERO_INTEGER;
    return ConsesLow.list( current, vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20521L)
  public static SubLObject iterate_vector_index_next(final SubLObject state)
  {
    SubLObject current_$9 = NIL;
    SubLObject vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list95 );
    current_$9 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list95 );
    vector = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject next_id = current_$9;
      final SubLObject next_value = Vectors.aref( vector, current_$9 );
      final SubLObject next = ConsesLow.list( next_id, next_value );
      SubLObject update = Numbers.add( ONE_INTEGER, current_$9 );
      if( update.numE( Sequences.length( vector ) ) )
      {
        update = $kw18$DONE;
        ConsesLow.set_nth( ONE_INTEGER, state, $kw96$UNINITIALIZED );
      }
      ConsesLow.rplaca( state, update );
      return subl_promotions.values2( next, state );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list95 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20975L)
  public static SubLObject new_string_iterator(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return new_list_iterator( string_utilities.string_to_char_list( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21329L)
  public static SubLObject new_sequence_iterator(SubLObject sequence, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != Types.sequencep( sequence ) : sequence;
    if( !start.numE( ZERO_INTEGER ) || NIL != end )
    {
      sequence = Sequences.subseq( sequence, start, end );
    }
    if( sequence.isList() )
    {
      return new_list_iterator( sequence );
    }
    if( sequence.isVector() )
    {
      return new_vector_iterator( sequence );
    }
    if( sequence.isString() )
    {
      return new_string_iterator( sequence );
    }
    return Errors.error( $str100$_S_was_not_a_sequence, sequence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21986L)
  public static SubLObject new_hash_table_iterator(final SubLObject hash_table)
  {
    assert NIL != Types.hash_table_p( hash_table ) : hash_table;
    return new_iterator( make_iterator_hash_table_state( hash_table ), $sym102$ITERATOR_HASH_TABLE_DONE, $sym103$ITERATOR_HASH_TABLE_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22393L)
  public static SubLObject new_hash_table_keys_iterator(final SubLObject hash_table)
  {
    assert NIL != Types.hash_table_p( hash_table ) : hash_table;
    return new_list_iterator( hash_table_utilities.hash_table_keys( hash_table ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22600L)
  public static SubLObject new_hash_table_values_iterator(final SubLObject hash_table)
  {
    assert NIL != Types.hash_table_p( hash_table ) : hash_table;
    return new_list_iterator( hash_table_utilities.hash_table_values( hash_table ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22813L)
  public static SubLObject make_iterator_hash_table_state(final SubLObject hash_table)
  {
    final SubLObject current = hash_table_utilities.hash_table_keys( hash_table );
    final SubLObject key_value_tuple = ConsesLow.list( $kw104$KEY, $kw105$VALUE );
    return ConsesLow.list( current, hash_table, key_value_tuple );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23341L)
  public static SubLObject iterator_hash_table_done(final SubLObject state)
  {
    SubLObject current_$10 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list106 );
    current_$10 = state.first();
    final SubLObject rest;
    final SubLObject current = rest = state.rest();
    return Types.sublisp_null( current_$10 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23486L)
  public static SubLObject iterator_hash_table_next(final SubLObject state)
  {
    SubLObject current_$11 = NIL;
    SubLObject hash_table = NIL;
    SubLObject key_value_tuple = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list107 );
    current_$11 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list107 );
    hash_table = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list107 );
    key_value_tuple = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$12;
      final SubLObject datum_$12 = current_$12 = current_$11;
      SubLObject next_key = NIL;
      SubLObject rest_keys = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$12, $list108 );
      next_key = current_$12.first();
      current_$12 = ( rest_keys = current_$12.rest() );
      final SubLObject next_value = Hashtables.gethash( next_key, hash_table, UNPROVIDED );
      final SubLObject update = rest_keys;
      ConsesLow.set_nth( ZERO_INTEGER, key_value_tuple, next_key );
      ConsesLow.set_nth( ONE_INTEGER, key_value_tuple, next_value );
      if( NIL == update )
      {
        ConsesLow.set_nth( ONE_INTEGER, state, $kw96$UNINITIALIZED );
      }
      ConsesLow.rplaca( state, update );
      return subl_promotions.values3( key_value_tuple, state, NIL );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list107 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23996L)
  public static SubLObject new_file_form_iterator(final SubLObject filename, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != Types.stringp( filename ) : filename;
    assert NIL != subl_promotions.non_negative_integer_p( start ) : start;
    if( NIL != end && !assertionsDisabledSynth && NIL == subl_promotions.non_negative_integer_p( end ) )
    {
      throw new AssertionError( end );
    }
    return new_iterator( make_file_form_iterator_state( filename, start, end ), $sym110$FILE_FORM_ITERATOR_DONE_, $sym111$FILE_FORM_ITERATOR_NEXT, $sym112$FILE_FORM_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24608L)
  public static SubLObject make_file_form_iterator_state(final SubLObject filename, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    SubLObject index = ZERO_INTEGER;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
    try
    {
      stream_macros.$stream_requires_locking$.bind( NIL, thread );
      stream = compatibility.open_text( filename, $kw113$INPUT );
    }
    finally
    {
      stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
    }
    SubLObject i;
    SubLObject form;
    for( i = NIL, i = ZERO_INTEGER; i.numL( start ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      form = reader.read( stream, NIL, $kw114$EOF, UNPROVIDED );
      if( form == $kw114$EOF )
      {
        doneP = T;
      }
      else
      {
        index = Numbers.add( index, ONE_INTEGER );
      }
    }
    final SubLObject state = ConsesLow.list( stream, index, end, doneP );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25052L)
  public static SubLObject file_form_iterator_doneP(final SubLObject state)
  {
    SubLObject stream = NIL;
    SubLObject index = NIL;
    SubLObject end = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list115 );
    stream = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list115 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list115 );
    end = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list115 );
    doneP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != doneP || ( NIL != end && index.numGE( end ) ) || !stream.isStream() || NIL == streams_high.open_stream_p( stream ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list115 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25287L)
  public static SubLObject file_form_iterator_next(final SubLObject state)
  {
    SubLObject stream = NIL;
    SubLObject index = NIL;
    SubLObject end = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list115 );
    stream = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list115 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list115 );
    end = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list115 );
    doneP = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list115 );
      return NIL;
    }
    final SubLObject form = reader.read( stream, NIL, $kw114$EOF, UNPROVIDED );
    if( form == $kw114$EOF )
    {
      streams_high.close( stream, UNPROVIDED );
      stream = $kw116$CLOSED;
      doneP = T;
      ConsesLow.set_nth( ZERO_INTEGER, state, stream );
      ConsesLow.set_nth( THREE_INTEGER, state, doneP );
      return subl_promotions.values3( NIL, state, T );
    }
    index = Numbers.add( index, ONE_INTEGER );
    ConsesLow.set_nth( ONE_INTEGER, state, index );
    return subl_promotions.values3( form, state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25742L)
  public static SubLObject file_form_iterator_finalize(final SubLObject state)
  {
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list117 );
    stream = state.first();
    final SubLObject rest;
    final SubLObject current = rest = state.rest();
    if( stream.isStream() && NIL != streams_high.open_stream_p( stream ) )
    {
      streams_high.close( stream, UNPROVIDED );
      stream = $kw116$CLOSED;
      ConsesLow.set_nth( ZERO_INTEGER, state, stream );
      ConsesLow.set_nth( THREE_INTEGER, state, T );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26082L)
  public static SubLObject new_lazy_iterator(final SubLObject constructor, final SubLObject arg_forms)
  {
    assert NIL != Types.function_spec_p( constructor ) : constructor;
    assert NIL != Types.listp( arg_forms ) : arg_forms;
    final SubLObject lazy_iterator = new_iterator( NIL, Symbols.symbol_function( $sym118$LAZY_ITERATOR_DONE ), Symbols.symbol_function( $sym119$LAZY_ITERATOR_NEXT ), UNPROVIDED );
    _csetf_it_state( lazy_iterator, ConsesLow.list( lazy_iterator, constructor, arg_forms ) );
    return lazy_iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27110L)
  public static SubLObject lazy_iterator_uninitializedP(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    return Equality.eq( it_done( iterator ), Symbols.symbol_function( $sym118$LAZY_ITERATOR_DONE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27327L)
  public static SubLObject lazy_iterator_valid_uninitializedP(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    if( !it_state( iterator ).isCons() || !it_done( iterator ).eql( Symbols.symbol_function( $sym118$LAZY_ITERATOR_DONE ) ) || !it_next( iterator ).eql( Symbols.symbol_function( $sym119$LAZY_ITERATOR_NEXT ) ) )
    {
      return NIL;
    }
    if( iterator.eql( it_state( iterator ).first() ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27755L)
  public static SubLObject initialize_lazy_iterator(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lazy_iterator = NIL;
    SubLObject constructor = NIL;
    SubLObject arg_forms = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list120 );
    lazy_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list120 );
    constructor = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list120 );
    arg_forms = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == $within_print_iterator$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == lazy_iterator_valid_uninitializedP( lazy_iterator ) )
      {
        Errors.error( $str121$_A_is_not_a_well_formed_uninitial, lazy_iterator );
      }
      final SubLObject args = Mapping.mapcar( $sym122$CYC_API_EVAL, arg_forms );
      SubLObject iterator = Functions.apply( constructor, args );
      SubLObject doneP = NIL;
      while ( NIL == doneP)
      {
        if( NIL != lazy_iterator_valid_uninitializedP( iterator ) )
        {
          iterator = initialize_lazy_iterator( it_state( iterator ) );
        }
        else
        {
          doneP = T;
        }
      }
      _csetf_it_state( lazy_iterator, it_state( iterator ) );
      _csetf_it_done( lazy_iterator, it_done( iterator ) );
      _csetf_it_next( lazy_iterator, it_next( iterator ) );
      _csetf_it_finalize( lazy_iterator, it_finalize( iterator ) );
      return lazy_iterator;
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list120 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28762L)
  public static SubLObject lazy_iterator_done(final SubLObject state)
  {
    assert NIL != Types.consp( state ) : state;
    return iteration_done( initialize_lazy_iterator( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28996L)
  public static SubLObject lazy_iterator_next(final SubLObject state)
  {
    assert NIL != Types.consp( state ) : state;
    return iteration_next( initialize_lazy_iterator( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29235L)
  public static SubLObject new_indirect_iterator(final SubLObject iterator, SubLObject transform, SubLObject finalize)
  {
    if( transform == UNPROVIDED )
    {
      transform = Symbols.symbol_function( IDENTITY );
    }
    if( finalize == UNPROVIDED )
    {
      finalize = $sym124$ITERATE_INDIRECT_FINALIZE;
    }
    assert NIL != iterator_p( iterator ) : iterator;
    assert NIL != Types.function_spec_p( transform ) : transform;
    return new_iterator( make_iterator_indirect_state( iterator, transform ), $sym93$DEFAULT_ITERATOR_DONE_P, $sym125$ITERATE_INDIRECT_NEXT, finalize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29798L)
  public static SubLObject make_iterator_indirect_state(final SubLObject iterator, final SubLObject transform)
  {
    return ConsesLow.list( iterator, misc_utilities.function_spec_function( transform ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30090L)
  public static SubLObject iterate_indirect_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_$14 = NIL;
    SubLObject transform = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list126 );
    current_$14 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list126 );
    transform = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list126 );
      return NIL;
    }
    thread.resetMultipleValues();
    SubLObject next = iteration_next( current_$14 );
    final SubLObject valid = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == valid )
    {
      final SubLObject update = $kw18$DONE;
      ConsesLow.rplaca( state, update );
      ConsesLow.rplacd( state, NIL );
      return subl_promotions.values3( NIL, state, T );
    }
    if( !Symbols.symbol_function( IDENTITY ).eql( transform ) )
    {
      next = Functions.funcall( transform, next );
    }
    return subl_promotions.values3( next, state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30569L)
  public static SubLObject iterate_indirect_finalize(final SubLObject state)
  {
    final SubLObject current = state.first();
    return ( NIL != iterator_p( current ) ) ? iteration_finalize( current ) : T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30738L)
  public static SubLObject new_factory_iterator(final SubLObject constructors, SubLObject data, SubLObject finalize)
  {
    if( data == UNPROVIDED )
    {
      data = NIL;
    }
    if( finalize == UNPROVIDED )
    {
      finalize = $sym127$ITERATE_FACTORY_FINALIZE;
    }
    assert NIL != Types.listp( constructors ) : constructors;
    return new_iterator( make_iterator_factory_state( constructors, data ), $sym93$DEFAULT_ITERATOR_DONE_P, $sym128$ITERATE_FACTORY_NEXT, finalize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31235L)
  public static SubLObject make_iterator_factory_state(final SubLObject constructors, final SubLObject data)
  {
    final SubLObject current = $kw96$UNINITIALIZED;
    final SubLObject mode = $kw129$START;
    return ConsesLow.list( current, mode, constructors, data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31610L)
  public static SubLObject iterate_factory_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    while ( true)
    {
      SubLObject current_$15 = NIL;
      SubLObject mode = NIL;
      SubLObject constructors = NIL;
      SubLObject data = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( state, state, $list130 );
      current_$15 = state.first();
      SubLObject current = state.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, state, $list130 );
      mode = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, state, $list130 );
      constructors = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, state, $list130 );
      data = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pcase_var = mode;
        if( pcase_var.eql( $kw129$START ) )
        {
          final SubLObject update = $kw96$UNINITIALIZED;
          final SubLObject new_mode = $kw131$CONSTRUCT;
          ConsesLow.set_nth( ZERO_INTEGER, state, update );
          ConsesLow.set_nth( ONE_INTEGER, state, new_mode );
        }
        else if( pcase_var.eql( $kw131$CONSTRUCT ) )
        {
          if( NIL == constructors )
          {
            final SubLObject update = $kw96$UNINITIALIZED;
            final SubLObject new_mode = $kw18$DONE;
            ConsesLow.set_nth( ZERO_INTEGER, state, update );
            ConsesLow.set_nth( ONE_INTEGER, state, new_mode );
            ConsesLow.set_nth( THREE_INTEGER, state, $kw96$UNINITIALIZED );
          }
          else
          {
            SubLObject current_$16;
            final SubLObject datum_$16 = current_$16 = constructors;
            SubLObject next_constructor = NIL;
            SubLObject rest_constructors = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$16, $list132 );
            next_constructor = current_$16.first();
            current_$16 = ( rest_constructors = current_$16.rest() );
            final SubLObject update2 = Functions.apply( next_constructor, data );
            final SubLObject new_mode2 = $kw133$SUBITERATE;
            ConsesLow.set_nth( ZERO_INTEGER, state, update2 );
            ConsesLow.set_nth( ONE_INTEGER, state, new_mode2 );
            ConsesLow.set_nth( TWO_INTEGER, state, rest_constructors );
          }
        }
        else
        {
          if( pcase_var.eql( $kw18$DONE ) )
          {
            return subl_promotions.values3( NIL, state, T );
          }
          assert NIL != iterator_p( current_$15 ) : current_$15;
          thread.resetMultipleValues();
          final SubLObject next = iteration_next( current_$15 );
          final SubLObject valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            return subl_promotions.values3( next, state, NIL );
          }
          final SubLObject update3 = $kw96$UNINITIALIZED;
          final SubLObject new_mode3 = $kw131$CONSTRUCT;
          ConsesLow.set_nth( ZERO_INTEGER, state, update3 );
          ConsesLow.set_nth( ONE_INTEGER, state, new_mode3 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( state, $list130 );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32979L)
  public static SubLObject iterate_factory_finalize(final SubLObject state)
  {
    SubLObject current_$18 = NIL;
    SubLObject mode = NIL;
    SubLObject constructors = NIL;
    SubLObject data = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list130 );
    current_$18 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list130 );
    mode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list130 );
    constructors = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list130 );
    data = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ( NIL != iterator_p( current_$18 ) ) ? iteration_finalize( current_$18 ) : T;
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list130 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33211L)
  public static SubLObject new_meta_iterator_iterator(final SubLObject meta_iterator)
  {
    assert NIL != iterator_p( meta_iterator ) : meta_iterator;
    final SubLObject state = make_meta_iterator_iterator_state( meta_iterator );
    return new_iterator( state, $sym134$META_ITERATOR_ITERATOR_DONE, $sym135$META_ITERATOR_ITERATOR_NEXT, $sym136$META_ITERATOR_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33735L)
  public static SubLObject make_meta_iterator_iterator_state(final SubLObject meta_iterator)
  {
    final SubLObject state = ConsesLow.list( $kw137$EXHAUSTED, meta_iterator );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33884L)
  public static SubLObject meta_iterator_iterator_done(final SubLObject state)
  {
    SubLObject object_iterator = NIL;
    SubLObject meta_iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list138 );
    object_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list138 );
    meta_iterator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( ( object_iterator == $kw137$EXHAUSTED || NIL != iteration_done( object_iterator ) ) && ( meta_iterator == $kw137$EXHAUSTED || NIL != iteration_done( meta_iterator ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list138 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34183L)
  public static SubLObject meta_iterator_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject object_iterator = NIL;
    SubLObject meta_iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list138 );
    object_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list138 );
    meta_iterator = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list138 );
      return NIL;
    }
    if( NIL != iterator_p( object_iterator ) )
    {
      thread.resetMultipleValues();
      final SubLObject next_item = iteration_next( object_iterator );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != validP )
      {
        return subl_promotions.values3( next_item, state, NIL );
      }
      ConsesLow.set_nth( ZERO_INTEGER, state, $kw137$EXHAUSTED );
      return meta_iterator_iterator_next( state );
    }
    else
    {
      if( NIL == iterator_p( meta_iterator ) )
      {
        return subl_promotions.values3( NIL, state, T );
      }
      thread.resetMultipleValues();
      final SubLObject next_object_iterator = iteration_next( meta_iterator );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != validP )
      {
        ConsesLow.set_nth( ZERO_INTEGER, state, next_object_iterator );
        return meta_iterator_iterator_next( state );
      }
      ConsesLow.set_nth( ONE_INTEGER, state, $kw137$EXHAUSTED );
      return subl_promotions.values3( NIL, state, T );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35253L)
  public static SubLObject meta_iterator_iterator_finalize(final SubLObject state)
  {
    SubLObject object_iterator = NIL;
    SubLObject meta_iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list138 );
    object_iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list138 );
    meta_iterator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != iterator_p( object_iterator ) )
      {
        return iteration_finalize( object_iterator );
      }
      if( NIL != iterator_p( meta_iterator ) )
      {
        return iteration_finalize( meta_iterator );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list138 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35557L)
  public static SubLObject new_iterator_iterator(final SubLObject iterators)
  {
    assert NIL != Types.listp( iterators ) : iterators;
    if( NIL == iterators )
    {
      return new_null_iterator();
    }
    if( NIL != list_utilities.singletonP( iterators ) )
    {
      return iterators.first();
    }
    final SubLObject state = make_iterator_iterator_state( iterators );
    return new_iterator( state, $sym139$ITERATOR_ITERATOR_DONE, $sym140$ITERATOR_ITERATOR_NEXT, $sym141$ITERATOR_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36107L)
  public static SubLObject get_iterator_iterator_iterators(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    final SubLObject state = it_state( iterator );
    if( NIL != list_utilities.singletonP( state ) )
    {
      return ConsesLow.list( state );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36388L)
  public static SubLObject make_iterator_iterator_state(final SubLObject iterators)
  {
    SubLObject cdolist_list_var = iterators;
    SubLObject iterator = NIL;
    iterator = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != iterator_p( iterator ) : iterator;
      cdolist_list_var = cdolist_list_var.rest();
      iterator = cdolist_list_var.first();
    }
    return iterators;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36535L)
  public static SubLObject iterator_iterator_done(final SubLObject state)
  {
    if( NIL == state )
    {
      return T;
    }
    if( state.isCons() )
    {
      SubLObject cdolist_list_var = state;
      SubLObject iterator = NIL;
      iterator = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == iteration_done( iterator ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        iterator = cdolist_list_var.first();
      }
      return T;
    }
    return iteration_done( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36947L)
  public static SubLObject iterator_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject working_state = state;
    SubLObject next = NIL;
    SubLObject valid_nextP = NIL;
    SubLObject premature_endP = NIL;
    while ( NIL == valid_nextP && NIL == premature_endP)
    {
      final SubLObject current = working_state.first();
      if( NIL != iteration_done( current ) )
      {
        working_state = working_state.rest();
        premature_endP = Types.sublisp_null( working_state );
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject value = iteration_next( current );
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == validP )
        {
          continue;
        }
        next = value;
        valid_nextP = T;
      }
    }
    return subl_promotions.values3( next, working_state, premature_endP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37517L)
  public static SubLObject iterator_iterator_finalize(final SubLObject state)
  {
    SubLObject cdolist_list_var = state;
    SubLObject iterator = NIL;
    iterator = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      iteration_finalize( iterator );
      cdolist_list_var = cdolist_list_var.rest();
      iterator = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37643L)
  public static SubLObject new_rotating_iterator_iterator(final SubLObject iterators)
  {
    assert NIL != Types.listp( iterators ) : iterators;
    if( NIL == iterators )
    {
      return new_null_iterator();
    }
    if( NIL != list_utilities.singletonP( iterators ) )
    {
      return iterators.first();
    }
    return new_iterator( make_rotating_iterator_iterator_state( iterators ), $sym142$ROTATING_ITERATOR_ITERATOR_DONE, $sym143$ROTATING_ITERATOR_ITERATOR_NEXT, $sym144$ROTATING_ITERATOR_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38308L)
  public static SubLObject validate_iterators(final SubLObject iterators, SubLObject where_message)
  {
    if( where_message == UNPROVIDED )
    {
      where_message = $str145$;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( iterators ) : iterators;
    SubLObject cdolist_list_var = iterators;
    SubLObject iterator = NIL;
    iterator = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != iterator_p( iterator ) : iterator;
      if( NIL == $within_print_iterator$.getDynamicValue( thread ) && NIL != lazy_iterator_uninitializedP( iterator ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread )
          && NIL == lazy_iterator_valid_uninitializedP( iterator ) )
      {
        Errors.error( $str146$invalid_lazy_iterator_found_in_me, where_message, iterator );
      }
      cdolist_list_var = cdolist_list_var.rest();
      iterator = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38760L)
  public static SubLObject get_rotating_iterator_iterator_iterators(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    return conses_high.second( it_state( iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38992L)
  public static SubLObject make_rotating_iterator_iterator_state(final SubLObject iterators)
  {
    validate_iterators( iterators, $str147$in_make_rotating_iterator_iterato );
    return ConsesLow.list( ZERO_INTEGER, iterators );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39163L)
  public static SubLObject rotating_iterator_iterator_done(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject index = NIL;
    SubLObject iterators = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list148 );
    index = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list148 );
    iterators = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list148 );
      return NIL;
    }
    if( NIL == iterators )
    {
      return T;
    }
    if( NIL != $within_print_iterator$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = iterators;
    SubLObject iterator = NIL;
    iterator = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == iteration_done( iterator ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      iterator = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39489L)
  public static SubLObject rotating_iterator_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject index = NIL;
    SubLObject iterators = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list148 );
    index = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list148 );
    iterators = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject premature_endP = Types.sublisp_null( iterators );
      SubLObject next = NIL;
      if( NIL != list_utilities.lengthLE( iterators, index, UNPROVIDED ) )
      {
        index = ZERO_INTEGER;
      }
      while ( NIL == next && NIL == premature_endP)
      {
        final SubLObject current_$19 = ConsesLow.nth( index, iterators );
        if( NIL != iteration_done( current_$19 ) )
        {
          iteration_finalize( current_$19 );
          iterators = Sequences.delete( current_$19, iterators, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL == iterators )
          {
            premature_endP = T;
          }
          else
          {
            if( NIL == list_utilities.lengthLE( iterators, index, UNPROVIDED ) )
            {
              continue;
            }
            index = ZERO_INTEGER;
          }
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject value = iteration_next( current_$19 );
          final SubLObject validP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL == validP )
          {
            continue;
          }
          next = value;
          index = Numbers.add( index, ONE_INTEGER );
        }
      }
      ConsesLow.set_nth( ZERO_INTEGER, state, index );
      ConsesLow.set_nth( ONE_INTEGER, state, iterators );
      return subl_promotions.values3( next, state, premature_endP );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list148 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40308L)
  public static SubLObject rotating_iterator_iterator_finalize(final SubLObject state)
  {
    SubLObject index = NIL;
    SubLObject iterators = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list148 );
    index = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list148 );
    iterators = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject cdolist_list_var = iterators;
      SubLObject iterator = NIL;
      iterator = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        iteration_finalize( iterator );
        cdolist_list_var = cdolist_list_var.rest();
        iterator = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list148 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40520L)
  public static SubLObject new_reusable_iterator(final SubLObject state, final SubLObject done, final SubLObject next, SubLObject finalize)
  {
    if( finalize == UNPROVIDED )
    {
      finalize = Symbols.symbol_function( $sym29$TRUE );
    }
    final SubLObject new_state = ConsesLow.list( state, NIL, $kw149$INITIAL, done, next, finalize );
    return new_iterator( new_state, $sym150$REUSABLE_ITERATOR_DONE, $sym151$REUSABLE_ITERATOR_NEXT, $sym152$REUSABLE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41603L)
  public static SubLObject reusable_iterator_done(final SubLObject state)
  {
    SubLObject real_state = NIL;
    SubLObject queue = NIL;
    SubLObject mode = NIL;
    SubLObject done = NIL;
    SubLObject next = NIL;
    SubLObject finalize = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list153 );
    real_state = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    queue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    mode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    next = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    finalize = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list153 );
      return NIL;
    }
    final SubLObject pcase_var = mode;
    if( pcase_var.eql( $kw149$INITIAL ) )
    {
      return Functions.funcall( done, real_state );
    }
    if( pcase_var.eql( $kw154$REUSE ) )
    {
      return Types.sublisp_null( real_state );
    }
    Errors.warn( $str155$Unknown_mode___a_, mode );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41949L)
  public static SubLObject reusable_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject real_state = NIL;
    SubLObject queue = NIL;
    SubLObject mode = NIL;
    SubLObject done = NIL;
    SubLObject next = NIL;
    SubLObject finalize = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list153 );
    real_state = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    queue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    mode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    next = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    finalize = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list153 );
      return NIL;
    }
    final SubLObject pcase_var = mode;
    if( pcase_var.eql( $kw149$INITIAL ) )
    {
      SubLObject working_state = real_state;
      SubLObject value = NIL;
      SubLObject valid_nextP = NIL;
      SubLObject premature_endP = NIL;
      while ( NIL == valid_nextP && NIL == premature_endP)
      {
        if( NIL != Functions.funcall( done, working_state ) )
        {
          premature_endP = T;
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject next_value = Functions.funcall( next, working_state );
          final SubLObject new_real_state = thread.secondMultipleValue();
          final SubLObject doneP = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          working_state = new_real_state;
          if( NIL != doneP )
          {
            premature_endP = T;
          }
          else
          {
            valid_nextP = T;
            value = next_value;
          }
        }
      }
      ConsesLow.set_nth( ZERO_INTEGER, state, working_state );
      if( NIL != valid_nextP )
      {
        ConsesLow.set_nth( ONE_INTEGER, state, ConsesLow.nconc( queue, ConsesLow.list( value ) ) );
      }
      return subl_promotions.values3( value, state, premature_endP );
    }
    if( pcase_var.eql( $kw154$REUSE ) )
    {
      ConsesLow.set_nth( ZERO_INTEGER, state, real_state.rest() );
      return subl_promotions.values3( real_state.first(), state, NIL );
    }
    Errors.warn( $str155$Unknown_mode___a_, mode );
    return subl_promotions.values3( NIL, NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42944L)
  public static SubLObject reusable_iterator_finalize(final SubLObject state)
  {
    SubLObject real_state = NIL;
    SubLObject queue = NIL;
    SubLObject mode = NIL;
    SubLObject done = NIL;
    SubLObject next = NIL;
    SubLObject finalize = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list153 );
    real_state = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    queue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    mode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    next = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list153 );
    finalize = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list153 );
      return NIL;
    }
    final SubLObject pcase_var = mode;
    if( pcase_var.eql( $kw149$INITIAL ) )
    {
      return Functions.funcall( finalize, real_state );
    }
    if( pcase_var.eql( $kw154$REUSE ) )
    {
      return T;
    }
    Errors.warn( $str155$Unknown_mode___a_, mode );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43282L)
  public static SubLObject new_reusable_iterator_from_iterator(final SubLObject iterator)
  {
    return new_reusable_iterator( iterator, $sym156$REUSABLE_ITERATOR_FROM_ITERATOR_DONE, $sym157$REUSABLE_ITERATOR_FROM_ITERATOR_NEXT, $sym158$REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43532L)
  public static SubLObject reusable_iterator_from_iterator_done(final SubLObject state)
  {
    return iteration_done( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43628L)
  public static SubLObject reusable_iterator_from_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject next = iteration_next( state );
    final SubLObject validP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return subl_promotions.values3( next, state, makeBoolean( NIL == validP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43806L)
  public static SubLObject reusable_iterator_from_iterator_finalize(final SubLObject state)
  {
    return iteration_finalize( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43910L)
  public static SubLObject new_reusable_list_iterator(final SubLObject list)
  {
    return new_reusable_iterator( list, $sym84$ITERATE_LIST_DONE, $sym82$ITERATE_LIST_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44054L)
  public static SubLObject reset_reusable_iterator(final SubLObject iterator)
  {
    assert NIL != iterator_p( iterator ) : iterator;
    final SubLObject state = it_state( iterator );
    final SubLObject pcase_var;
    final SubLObject mode = pcase_var = ConsesLow.nth( TWO_INTEGER, state );
    if( pcase_var.eql( $kw149$INITIAL ) )
    {
      finish_reusable_iterator( iterator );
      final SubLObject queue = ConsesLow.nth( ONE_INTEGER, state );
      ConsesLow.set_nth( ZERO_INTEGER, state, queue );
      ConsesLow.set_nth( TWO_INTEGER, state, $kw154$REUSE );
    }
    else if( pcase_var.eql( $kw154$REUSE ) )
    {
      final SubLObject queue = ConsesLow.nth( ONE_INTEGER, state );
      ConsesLow.set_nth( ZERO_INTEGER, state, queue );
    }
    else
    {
      Errors.warn( $str155$Unknown_mode___a_, mode );
    }
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44656L)
  public static SubLObject finish_reusable_iterator(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject dummy = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
      }
    }
    iteration_finalize( iterator );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44847L)
  public static SubLObject do_reusable_iterator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
    iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$20 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list159 );
      current_$20 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list159 );
      if( NIL == conses_high.member( current_$20, $list160, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$20 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list159 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw18$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject reset_tail = cdestructuring_bind.property_list_member( $kw161$RESET, current );
    final SubLObject reset = ( NIL != reset_tail ) ? conses_high.cadr( reset_tail ) : T;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym69$PROGN, ConsesLow.listS( $sym41$DO_ITERATOR, ConsesLow.list( var, iterator, $kw18$DONE, done ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym47$PWHEN, reset, ConsesLow.list(
        $sym162$RESET_REUSABLE_ITERATOR, iterator ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45069L)
  public static SubLObject map_reusable_iterator(final SubLObject function, final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject item = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        Functions.funcall( function, item );
      }
    }
    reset_reusable_iterator( iterator );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45209L)
  public static SubLObject new_reusable_iterator_cartesian_iterator(final SubLObject reusable_iterators)
  {
    final SubLObject state = reusable_iterator_cartesian_iterator_state( reusable_iterators );
    return ( NIL != state ) ? new_iterator( state, $sym163$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE, $sym164$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT, $sym165$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE )
        : new_null_iterator();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45735L)
  public static SubLObject reusable_iterator_cartesian_iterator_state(final SubLObject iterators)
  {
    SubLObject nullP = NIL;
    if( NIL == nullP )
    {
      SubLObject csome_list_var = iterators;
      SubLObject iterator = NIL;
      iterator = csome_list_var.first();
      while ( NIL == nullP && NIL != csome_list_var)
      {
        if( NIL != iteration_done( iterator ) )
        {
          reset_reusable_iterator( iterator );
          nullP = iteration_done( iterator );
        }
        csome_list_var = csome_list_var.rest();
        iterator = csome_list_var.first();
      }
    }
    return ( NIL != nullP ) ? NIL : ConsesLow.list( Sequences.reverse( iterators ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46127L)
  public static SubLObject reusable_iterator_cartesian_iterator_done(final SubLObject state)
  {
    SubLObject reverse_iterators = NIL;
    SubLObject reverse_result = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list166 );
    reverse_iterators = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list166 );
    reverse_result = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return all_iterators_doneP( reverse_iterators );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list166 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46337L)
  public static SubLObject all_iterators_doneP(final SubLObject iterators)
  {
    SubLObject not_doneP = NIL;
    if( NIL == not_doneP )
    {
      SubLObject csome_list_var = iterators;
      SubLObject iterator = NIL;
      iterator = csome_list_var.first();
      while ( NIL == not_doneP && NIL != csome_list_var)
      {
        if( NIL == iteration_done( iterator ) )
        {
          not_doneP = T;
        }
        csome_list_var = csome_list_var.rest();
        iterator = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == not_doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46541L)
  public static SubLObject reusable_iterator_cartesian_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject reverse_iterators = NIL;
    SubLObject reverse_result = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list166 );
    reverse_iterators = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list166 );
    reverse_result = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list166 );
      return NIL;
    }
    if( NIL == reverse_result )
    {
      reverse_result = ConsesLow.make_list( Sequences.length( reverse_iterators ), UNPROVIDED );
      SubLObject list_var = NIL;
      SubLObject iterator = NIL;
      SubLObject num = NIL;
      list_var = reverse_iterators;
      iterator = list_var.first();
      for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), iterator = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
      {
        ConsesLow.set_nth( num, reverse_result, iteration_next_without_values( iterator, UNPROVIDED ) );
      }
      ConsesLow.set_nth( ONE_INTEGER, state, reverse_result );
      return subl_promotions.values3( Sequences.reverse( reverse_result ), state, NIL );
    }
    SubLObject update_finishedP = NIL;
    SubLObject list_var2 = NIL;
    SubLObject iterator2 = NIL;
    SubLObject num2 = NIL;
    list_var2 = reverse_iterators;
    iterator2 = list_var2.first();
    for( num2 = ZERO_INTEGER; NIL == update_finishedP && NIL != list_var2; list_var2 = list_var2.rest(), iterator2 = list_var2.first(), num2 = Numbers.add( ONE_INTEGER, num2 ) )
    {
      if( NIL != iteration_done( iterator2 ) )
      {
        reset_reusable_iterator( iterator2 );
      }
      else
      {
        update_finishedP = T;
      }
      thread.resetMultipleValues();
      SubLObject next = iteration_next( iterator2 );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == validP )
      {
        reset_reusable_iterator( iterator2 );
        next = iteration_next_without_values( iterator2, UNPROVIDED );
        update_finishedP = NIL;
      }
      ConsesLow.set_nth( num2, reverse_result, next );
    }
    ConsesLow.set_nth( ONE_INTEGER, state, reverse_result );
    return subl_promotions.values3( Sequences.reverse( reverse_result ), state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47679L)
  public static SubLObject reusable_iterator_cartesian_iterator_finalize(final SubLObject state)
  {
    SubLObject reverse_iterators = NIL;
    SubLObject reverse_result = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list166 );
    reverse_iterators = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list166 );
    reverse_result = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject cdolist_list_var = reverse_iterators;
      SubLObject iterator = NIL;
      iterator = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        iteration_finalize( iterator );
        cdolist_list_var = cdolist_list_var.rest();
        iterator = cdolist_list_var.first();
      }
      return T;
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list166 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47934L)
  public static SubLObject new_filter_iterator(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args)
  {
    if( filter_args == UNPROVIDED )
    {
      filter_args = NIL;
    }
    assert NIL != iterator_p( input_iterator ) : input_iterator;
    assert NIL != Types.function_spec_p( filter_method ) : filter_method;
    assert NIL != Types.listp( filter_args ) : filter_args;
    return new_iterator( make_filter_iterator_state( input_iterator, filter_method, filter_args ), $sym93$DEFAULT_ITERATOR_DONE_P, $sym31$FILTER_ITERATOR_NEXT, $sym167$FILTER_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48628L)
  public static SubLObject new_filter_iterator_without_values(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token)
  {
    if( filter_args == UNPROVIDED )
    {
      filter_args = NIL;
    }
    if( invalid_token == UNPROVIDED )
    {
      invalid_token = NIL;
    }
    assert NIL != iterator_p( input_iterator ) : input_iterator;
    assert NIL != Types.function_spec_p( filter_method ) : filter_method;
    assert NIL != Types.listp( filter_args ) : filter_args;
    return new_iterator( make_filter_iterator_without_values_state( input_iterator, filter_method, filter_args, invalid_token ), $sym93$DEFAULT_ITERATOR_DONE_P, $sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT,
        $sym167$FILTER_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49427L)
  public static SubLObject new_filter_and_transform_iterator(final SubLObject input_iterator, final SubLObject filter_and_transform_method, SubLObject filter_and_transform_args)
  {
    if( filter_and_transform_args == UNPROVIDED )
    {
      filter_and_transform_args = NIL;
    }
    assert NIL != iterator_p( input_iterator ) : input_iterator;
    assert NIL != Types.function_spec_p( filter_and_transform_method ) : filter_and_transform_method;
    assert NIL != Types.listp( filter_and_transform_args ) : filter_and_transform_args;
    return new_iterator( make_filter_and_tranform_iterator_state( input_iterator, filter_and_transform_method, filter_and_transform_args ), $sym93$DEFAULT_ITERATOR_DONE_P, $sym168$FILTER_AND_TRANSFORM_ITERATOR_NEXT,
        $sym167$FILTER_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50138L)
  public static SubLObject make_filter_iterator_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args)
  {
    return ConsesLow.list( input_iterator, filter_method, filter_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50468L)
  public static SubLObject make_filter_iterator_without_values_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args, final SubLObject invalid_token)
  {
    return ConsesLow.list( input_iterator, filter_method, filter_args, invalid_token );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50686L)
  public static SubLObject make_filter_and_tranform_iterator_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args)
  {
    return ConsesLow.list( input_iterator, filter_method, filter_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50874L)
  public static SubLObject filter_iterator_finalize(final SubLObject state)
  {
    SubLObject current_$21 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list106 );
    current_$21 = state.first();
    final SubLObject rest;
    final SubLObject current = rest = state.rest();
    if( NIL != iterator_p( current_$21 ) )
    {
      iteration_finalize( current_$21 );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51076L)
  public static SubLObject filter_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_$22 = NIL;
    SubLObject filter_method = NIL;
    SubLObject filter_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list169 );
    current_$22 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list169 );
    filter_method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list169 );
    filter_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject v_answer = NIL;
      SubLObject done = NIL;
      SubLObject invalid = NIL;
      while ( NIL == done)
      {
        thread.resetMultipleValues();
        final SubLObject next = iteration_next( current_$22 );
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          if( NIL == Functions.apply( filter_method, next, filter_args ) )
          {
            continue;
          }
          v_answer = next;
          done = T;
        }
        else
        {
          final SubLObject update = $kw18$DONE;
          iteration_finalize( current_$22 );
          ConsesLow.rplaca( state, update );
          ConsesLow.rplacd( state, NIL );
          done = T;
          invalid = T;
        }
      }
      return subl_promotions.values3( v_answer, state, invalid );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list169 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51821L)
  public static SubLObject filter_iterator_without_values_next(final SubLObject state)
  {
    SubLObject current_$23 = NIL;
    SubLObject filter_method = NIL;
    SubLObject filter_args = NIL;
    SubLObject invalid_token = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list170 );
    current_$23 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list170 );
    filter_method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list170 );
    filter_args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list170 );
    invalid_token = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject v_answer = NIL;
      SubLObject done = NIL;
      SubLObject invalid = NIL;
      while ( NIL == done)
      {
        final SubLObject next = iteration_next_without_values( current_$23, invalid_token );
        final SubLObject valid = makeBoolean( !next.eql( invalid_token ) );
        if( NIL != valid )
        {
          if( NIL == Functions.apply( filter_method, next, filter_args ) )
          {
            continue;
          }
          v_answer = next;
          done = T;
        }
        else
        {
          final SubLObject update = $kw18$DONE;
          iteration_finalize( current_$23 );
          ConsesLow.rplaca( state, update );
          ConsesLow.rplacd( state, NIL );
          done = T;
          invalid = T;
        }
      }
      return subl_promotions.values3( v_answer, state, invalid );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list170 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52647L)
  public static SubLObject filter_and_transform_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_$24 = NIL;
    SubLObject filter_method = NIL;
    SubLObject filter_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list169 );
    current_$24 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list169 );
    filter_method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list169 );
    filter_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject v_answer = NIL;
      SubLObject done = NIL;
      SubLObject invalid = NIL;
      while ( NIL == done)
      {
        thread.resetMultipleValues();
        final SubLObject next = iteration_next( current_$24 );
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          thread.resetMultipleValues();
          final SubLObject transformed_next = Functions.apply( filter_method, next, filter_args );
          final SubLObject passed_filterP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL == passed_filterP )
          {
            continue;
          }
          v_answer = transformed_next;
          done = T;
        }
        else
        {
          final SubLObject update = $kw18$DONE;
          iteration_finalize( current_$24 );
          ConsesLow.rplaca( state, update );
          ConsesLow.rplacd( state, NIL );
          done = T;
          invalid = T;
        }
      }
      return subl_promotions.values3( v_answer, state, invalid );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list169 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53497L)
  public static SubLObject default_iterator_done_p(final SubLObject state)
  {
    return Equality.eq( $kw18$DONE, Sequences.elt( state, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53647L)
  public static SubLObject test_iterate_once(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    SubLObject v_answer = NIL;
    SubLObject valid;
    for( SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != doneP ) )
    {
      thread.resetMultipleValues();
      final SubLObject obj = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        v_answer = obj;
        doneP = T;
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53871L)
  public static SubLObject test_iterate_all(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject doneP = NIL;
    SubLObject total = ZERO_INTEGER;
    SubLObject valid;
    for( SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != doneP ) )
    {
      thread.resetMultipleValues();
      final SubLObject obj = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        total = Numbers.add( total, ONE_INTEGER );
      }
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54349L)
  public static SubLObject new_transform_iterator(final SubLObject iterator, final SubLObject xform_fn, SubLObject param)
  {
    if( param == UNPROVIDED )
    {
      param = $xform_fn_param_do_not_pass$.getGlobalValue();
    }
    return new_iterator( make_xform_iterator_state( iterator, xform_fn, param ), $sym172$XFORM_ITERATOR_DONE, $sym173$XFORM_ITERATOR_NEXT, $sym174$XFORM_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54745L)
  public static SubLObject make_xform_iterator_state(final SubLObject iterator, final SubLObject xform_fn, final SubLObject param)
  {
    return ConsesLow.list( iterator, xform_fn, param );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54855L)
  public static SubLObject xform_iterator_done(final SubLObject state)
  {
    final SubLObject iterator = state.first();
    return iteration_done( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54982L)
  public static SubLObject xform_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iterator = NIL;
    SubLObject xform_fn = NIL;
    SubLObject param = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list175 );
    iterator = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list175 );
    xform_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list175 );
    param = current.first();
    current = current.rest();
    if( NIL == current )
    {
      thread.resetMultipleValues();
      SubLObject value = iteration_next( iterator );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != validP )
      {
        if( $xform_fn_param_do_not_pass$.getGlobalValue().eql( param ) )
        {
          value = Functions.funcall( xform_fn, value );
        }
        else
        {
          value = Functions.funcall( xform_fn, value, param );
        }
      }
      return subl_promotions.values3( value, state, makeBoolean( NIL == validP ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list175 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55408L)
  public static SubLObject xml_token_iterator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != iterator_p( v_object ) && it_next( v_object ) == $sym176$ITERATE_XML_TOKEN_NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55659L)
  public static SubLObject xml_token_iterator_peek(final SubLObject token_iterator)
  {
    assert NIL != xml_token_iterator_p( token_iterator ) : token_iterator;
    final SubLObject state = it_state( token_iterator );
    return xml_parsing_utilities.xml_token_iterator_state_peek( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55943L)
  public static SubLObject iterator_size_exhaustive(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  public static SubLObject declare_iteration_file()
  {
    SubLFiles.declareFunction( me, "iterator_print_function_trampoline", "ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "iterator_p", "ITERATOR-P", 1, 0, false );
    new $iterator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "it_state", "IT-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "it_done", "IT-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "it_next", "IT-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "it_finalize", "IT-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_it_state", "_CSETF-IT-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_it_done", "_CSETF-IT-DONE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_it_next", "_CSETF-IT-NEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_it_finalize", "_CSETF-IT-FINALIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_iterator", "MAKE-ITERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_iterator", "VISIT-DEFSTRUCT-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_iterator", "PRINT-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_iterator", "NEW-ITERATOR", 3, 1, false );
    SubLFiles.declareFunction( me, "iteration_done", "ITERATION-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "iteration_next_funcall", "ITERATION-NEXT-FUNCALL", 2, 0, false );
    SubLFiles.declareFunction( me, "iteration_next", "ITERATION-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "iteration_next_without_values", "ITERATION-NEXT-WITHOUT-VALUES", 1, 1, false );
    SubLFiles.declareFunction( me, "iteration_next_without_values_macro_helper", "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER", 1, 1, false );
    SubLFiles.declareFunction( me, "iteration_finalize", "ITERATION-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterator_type_name", "ITERATOR-TYPE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "iteration_state_peek", "ITERATION-STATE-PEEK", 1, 0, false );
    SubLFiles.declareFunction( me, "iteration_next_peek", "ITERATION-NEXT-PEEK", 1, 0, false );
    SubLFiles.declareMacro( me, "do_iterator", "DO-ITERATOR" );
    SubLFiles.declareMacro( me, "do_iterator_without_values_progress", "DO-ITERATOR-WITHOUT-VALUES-PROGRESS" );
    SubLFiles.declareMacro( me, "do_iterator_without_values", "DO-ITERATOR-WITHOUT-VALUES" );
    SubLFiles.declareMacro( me, "do_iterator_without_values_internal", "DO-ITERATOR-WITHOUT-VALUES-INTERNAL" );
    SubLFiles.declareMacro( me, "do_n_iterator_objects", "DO-N-ITERATOR-OBJECTS" );
    SubLFiles.declareFunction( me, "map_iterator", "MAP-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_iterator", "COPY-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "iterator_value_list", "ITERATOR-VALUE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_producer", "GENERIC-PRODUCER", 2, 1, false );
    SubLFiles.declareFunction( me, "new_null_iterator", "NEW-NULL-ITERATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "new_singleton_iterator", "NEW-SINGLETON-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_non_null_singleton_next", "ITERATE-NON-NULL-SINGLETON-NEXT", 1, 0, false );
    new $iterate_non_null_singleton_next$UnaryFunction();
    SubLFiles.declareFunction( me, "new_integer_iterator", "NEW-INTEGER-ITERATOR", 0, 3, false );
    SubLFiles.declareFunction( me, "new_number_iterator", "NEW-NUMBER-ITERATOR", 0, 3, false );
    SubLFiles.declareFunction( me, "make_iterator_number_state", "MAKE-ITERATOR-NUMBER-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "iterate_number_done", "ITERATE-NUMBER-DONE", 1, 0, false );
    new $iterate_number_done$UnaryFunction();
    SubLFiles.declareFunction( me, "iterate_number_next", "ITERATE-NUMBER-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "list_iterator_p", "LIST-ITERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_list_iterator", "NEW-LIST-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_list_iterator_list", "GET-LIST-ITERATOR-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "list_iterator_size", "LIST-ITERATOR-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_list_state", "MAKE-ITERATOR-LIST-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_list_done", "ITERATE-LIST-DONE", 1, 0, false );
    new $iterate_list_done$UnaryFunction();
    SubLFiles.declareFunction( me, "iterate_list_next", "ITERATE-LIST-NEXT", 1, 0, false );
    new $iterate_list_next$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_list_iterator_p", "INFERENCE-LIST-ITERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_inference_list_iterator", "NEW-INFERENCE-LIST-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_inference_list_iterator_list", "GET-INFERENCE-LIST-ITERATOR-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_list_iterator_size", "INFERENCE-LIST-ITERATOR-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_inference_iterator_list_state", "MAKE-INFERENCE-ITERATOR-LIST-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_inference_list_done", "ITERATE-INFERENCE-LIST-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_inference_list_next", "ITERATE-INFERENCE-LIST-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_alist_iterator", "NEW-ALIST-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_vector_iterator", "NEW-VECTOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_vector_state", "MAKE-ITERATOR-VECTOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_vector_next", "ITERATE-VECTOR-NEXT", 1, 0, false );
    new $iterate_vector_next$UnaryFunction();
    SubLFiles.declareFunction( me, "new_vector_index_iterator", "NEW-VECTOR-INDEX-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_vector_index_state", "MAKE-ITERATOR-VECTOR-INDEX-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_vector_index_next", "ITERATE-VECTOR-INDEX-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_string_iterator", "NEW-STRING-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sequence_iterator", "NEW-SEQUENCE-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "new_hash_table_iterator", "NEW-HASH-TABLE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_hash_table_keys_iterator", "NEW-HASH-TABLE-KEYS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_hash_table_values_iterator", "NEW-HASH-TABLE-VALUES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_hash_table_state", "MAKE-ITERATOR-HASH-TABLE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterator_hash_table_done", "ITERATOR-HASH-TABLE-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterator_hash_table_next", "ITERATOR-HASH-TABLE-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_file_form_iterator", "NEW-FILE-FORM-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_file_form_iterator_state", "MAKE-FILE-FORM-ITERATOR-STATE", 1, 2, false );
    SubLFiles.declareFunction( me, "file_form_iterator_doneP", "FILE-FORM-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "file_form_iterator_next", "FILE-FORM-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "file_form_iterator_finalize", "FILE-FORM-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lazy_iterator", "NEW-LAZY-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "lazy_iterator_uninitializedP", "LAZY-ITERATOR-UNINITIALIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_iterator_valid_uninitializedP", "LAZY-ITERATOR-VALID-UNINITIALIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_lazy_iterator", "INITIALIZE-LAZY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_iterator_done", "LAZY-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_iterator_next", "LAZY-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_indirect_iterator", "NEW-INDIRECT-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_iterator_indirect_state", "MAKE-ITERATOR-INDIRECT-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "iterate_indirect_next", "ITERATE-INDIRECT-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_indirect_finalize", "ITERATE-INDIRECT-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_factory_iterator", "NEW-FACTORY-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_iterator_factory_state", "MAKE-ITERATOR-FACTORY-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "iterate_factory_next", "ITERATE-FACTORY-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_factory_finalize", "ITERATE-FACTORY-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_meta_iterator_iterator", "NEW-META-ITERATOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_meta_iterator_iterator_state", "MAKE-META-ITERATOR-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_iterator_iterator_done", "META-ITERATOR-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_iterator_iterator_next", "META-ITERATOR-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_iterator_iterator_finalize", "META-ITERATOR-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_iterator_iterator", "NEW-ITERATOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_iterator_iterator_iterators", "GET-ITERATOR-ITERATOR-ITERATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_iterator_state", "MAKE-ITERATOR-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterator_iterator_done", "ITERATOR-ITERATOR-DONE", 1, 0, false );
    new $iterator_iterator_done$UnaryFunction();
    SubLFiles.declareFunction( me, "iterator_iterator_next", "ITERATOR-ITERATOR-NEXT", 1, 0, false );
    new $iterator_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "iterator_iterator_finalize", "ITERATOR-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_rotating_iterator_iterator", "NEW-ROTATING-ITERATOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "validate_iterators", "VALIDATE-ITERATORS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_rotating_iterator_iterator_iterators", "GET-ROTATING-ITERATOR-ITERATOR-ITERATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_rotating_iterator_iterator_state", "MAKE-ROTATING-ITERATOR-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "rotating_iterator_iterator_done", "ROTATING-ITERATOR-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "rotating_iterator_iterator_next", "ROTATING-ITERATOR-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rotating_iterator_iterator_finalize", "ROTATING-ITERATOR-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_reusable_iterator", "NEW-REUSABLE-ITERATOR", 3, 1, false );
    SubLFiles.declareFunction( me, "reusable_iterator_done", "REUSABLE-ITERATOR-DONE", 1, 0, false );
    new $reusable_iterator_done$UnaryFunction();
    SubLFiles.declareFunction( me, "reusable_iterator_next", "REUSABLE-ITERATOR-NEXT", 1, 0, false );
    new $reusable_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "reusable_iterator_finalize", "REUSABLE-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_reusable_iterator_from_iterator", "NEW-REUSABLE-ITERATOR-FROM-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "reusable_iterator_from_iterator_done", "REUSABLE-ITERATOR-FROM-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "reusable_iterator_from_iterator_next", "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "reusable_iterator_from_iterator_finalize", "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_reusable_list_iterator", "NEW-REUSABLE-LIST-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_reusable_iterator", "RESET-REUSABLE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "finish_reusable_iterator", "FINISH-REUSABLE-ITERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_reusable_iterator", "DO-REUSABLE-ITERATOR" );
    SubLFiles.declareFunction( me, "map_reusable_iterator", "MAP-REUSABLE-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_reusable_iterator_cartesian_iterator", "NEW-REUSABLE-ITERATOR-CARTESIAN-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "reusable_iterator_cartesian_iterator_state", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "reusable_iterator_cartesian_iterator_done", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE", 1, 0, false );
    new $reusable_iterator_cartesian_iterator_done$UnaryFunction();
    SubLFiles.declareFunction( me, "all_iterators_doneP", "ALL-ITERATORS-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "reusable_iterator_cartesian_iterator_next", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT", 1, 0, false );
    new $reusable_iterator_cartesian_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "reusable_iterator_cartesian_iterator_finalize", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_filter_iterator", "NEW-FILTER-ITERATOR", 2, 1, false );
    SubLFiles.declareFunction( me, "new_filter_iterator_without_values", "NEW-FILTER-ITERATOR-WITHOUT-VALUES", 2, 2, false );
    SubLFiles.declareFunction( me, "new_filter_and_transform_iterator", "NEW-FILTER-AND-TRANSFORM-ITERATOR", 2, 1, false );
    SubLFiles.declareFunction( me, "make_filter_iterator_state", "MAKE-FILTER-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_filter_iterator_without_values_state", "MAKE-FILTER-ITERATOR-WITHOUT-VALUES-STATE", 4, 0, false );
    SubLFiles.declareFunction( me, "make_filter_and_tranform_iterator_state", "MAKE-FILTER-AND-TRANFORM-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "filter_iterator_finalize", "FILTER-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_iterator_next", "FILTER-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_iterator_without_values_next", "FILTER-ITERATOR-WITHOUT-VALUES-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_and_transform_iterator_next", "FILTER-AND-TRANSFORM-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "default_iterator_done_p", "DEFAULT-ITERATOR-DONE-P", 1, 0, false );
    new $default_iterator_done_p$UnaryFunction();
    SubLFiles.declareFunction( me, "test_iterate_once", "TEST-ITERATE-ONCE", 1, 0, false );
    SubLFiles.declareFunction( me, "test_iterate_all", "TEST-ITERATE-ALL", 1, 0, false );
    SubLFiles.declareFunction( me, "new_transform_iterator", "NEW-TRANSFORM-ITERATOR", 2, 1, false );
    SubLFiles.declareFunction( me, "make_xform_iterator_state", "MAKE-XFORM-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "xform_iterator_done", "XFORM-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "xform_iterator_next", "XFORM-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_p", "XML-TOKEN-ITERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_peek", "XML-TOKEN-ITERATOR-PEEK", 1, 0, false );
    SubLFiles.declareFunction( me, "iterator_size_exhaustive", "ITERATOR-SIZE-EXHAUSTIVE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_iteration_file()
  {
    $dtp_iterator$ = SubLFiles.defconstant( "*DTP-ITERATOR*", $sym0$ITERATOR );
    $within_print_iterator$ = SubLFiles.defparameter( "*WITHIN-PRINT-ITERATOR*", NIL );
    $xform_fn_param_do_not_pass$ = SubLFiles.defconstant( "*XFORM-FN-PARAM-DO-NOT-PASS*", Symbols.make_symbol( $str171$YOU_SHALL_NOT_PASS ) );
    return NIL;
  }

  public static SubLObject setup_iteration_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), Symbols.symbol_function( $sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$IT_STATE, $sym10$_CSETF_IT_STATE );
    Structures.def_csetf( $sym11$IT_DONE, $sym12$_CSETF_IT_DONE );
    Structures.def_csetf( $sym13$IT_NEXT, $sym14$_CSETF_IT_NEXT );
    Structures.def_csetf( $sym15$IT_FINALIZE, $sym16$_CSETF_IT_FINALIZE );
    Equality.identity( $sym0$ITERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), Symbols.symbol_function( $sym26$VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD ) );
    access_macros.register_macro_helper( $sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL );
    access_macros.register_macro_helper( $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, $list59 );
    utilities_macros.note_funcall_helper_function( $sym110$FILE_FORM_ITERATOR_DONE_ );
    utilities_macros.note_funcall_helper_function( $sym111$FILE_FORM_ITERATOR_NEXT );
    utilities_macros.note_funcall_helper_function( $sym112$FILE_FORM_ITERATOR_FINALIZE );
    utilities_macros.note_funcall_helper_function( $sym134$META_ITERATOR_ITERATOR_DONE );
    utilities_macros.note_funcall_helper_function( $sym135$META_ITERATOR_ITERATOR_NEXT );
    utilities_macros.note_funcall_helper_function( $sym136$META_ITERATOR_ITERATOR_FINALIZE );
    utilities_macros.note_funcall_helper_function( $sym172$XFORM_ITERATOR_DONE );
    utilities_macros.note_funcall_helper_function( $sym173$XFORM_ITERATOR_NEXT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_iteration_file();
  }

  @Override
  public void initializeVariables()
  {
    init_iteration_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_iteration_file();
  }
  static
  {
    me = new iteration();
    $dtp_iterator$ = null;
    $within_print_iterator$ = null;
    $xform_fn_param_do_not_pass$ = null;
    $sym0$ITERATOR = makeSymbol( "ITERATOR" );
    $sym1$ITERATOR_P = makeSymbol( "ITERATOR-P" );
    $list2 = ConsesLow.list( makeSymbol( "STATE" ), makeSymbol( "DONE" ), makeSymbol( "NEXT" ), makeSymbol( "FINALIZE" ) );
    $list3 = ConsesLow.list( makeKeyword( "STATE" ), makeKeyword( "DONE" ), makeKeyword( "NEXT" ), makeKeyword( "FINALIZE" ) );
    $list4 = ConsesLow.list( makeSymbol( "IT-STATE" ), makeSymbol( "IT-DONE" ), makeSymbol( "IT-NEXT" ), makeSymbol( "IT-FINALIZE" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-IT-STATE" ), makeSymbol( "_CSETF-IT-DONE" ), makeSymbol( "_CSETF-IT-NEXT" ), makeSymbol( "_CSETF-IT-FINALIZE" ) );
    $sym6$PRINT_ITERATOR = makeSymbol( "PRINT-ITERATOR" );
    $sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ITERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ITERATOR-P" ) );
    $sym9$IT_STATE = makeSymbol( "IT-STATE" );
    $sym10$_CSETF_IT_STATE = makeSymbol( "_CSETF-IT-STATE" );
    $sym11$IT_DONE = makeSymbol( "IT-DONE" );
    $sym12$_CSETF_IT_DONE = makeSymbol( "_CSETF-IT-DONE" );
    $sym13$IT_NEXT = makeSymbol( "IT-NEXT" );
    $sym14$_CSETF_IT_NEXT = makeSymbol( "_CSETF-IT-NEXT" );
    $sym15$IT_FINALIZE = makeSymbol( "IT-FINALIZE" );
    $sym16$_CSETF_IT_FINALIZE = makeSymbol( "_CSETF-IT-FINALIZE" );
    $kw17$STATE = makeKeyword( "STATE" );
    $kw18$DONE = makeKeyword( "DONE" );
    $kw19$NEXT = makeKeyword( "NEXT" );
    $kw20$FINALIZE = makeKeyword( "FINALIZE" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_ITERATOR = makeSymbol( "MAKE-ITERATOR" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD" );
    $str27$_DONE_ = makeString( " DONE " );
    $str28$_ = makeString( " " );
    $sym29$TRUE = makeSymbol( "TRUE" );
    $sym30$HL_STORE_ITERATOR_NEXT = makeSymbol( "HL-STORE-ITERATOR-NEXT" );
    $sym31$FILTER_ITERATOR_NEXT = makeSymbol( "FILTER-ITERATOR-NEXT" );
    $sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT = makeSymbol( "FILTER-ITERATOR-WITHOUT-VALUES-NEXT" );
    $sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER = makeSymbol( "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER" );
    $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL = makeSymbol( "DO-ITERATOR-WITHOUT-VALUES-INTERNAL" );
    $str35$_NEXT = makeString( "-NEXT" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ITERATOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list37 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw38$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $sym39$ITERATOR_VAR = makeUninternedSymbol( "ITERATOR-VAR" );
    $sym40$CLET = makeSymbol( "CLET" );
    $sym41$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $sym42$DONE_VAR = makeUninternedSymbol( "DONE-VAR" );
    $sym43$VALID = makeUninternedSymbol( "VALID" );
    $sym44$UNTIL = makeSymbol( "UNTIL" );
    $sym45$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym46$ITERATION_NEXT = makeSymbol( "ITERATION-NEXT" );
    $sym47$PWHEN = makeSymbol( "PWHEN" );
    $sym48$CSETQ = makeSymbol( "CSETQ" );
    $sym49$COR = makeSymbol( "COR" );
    $sym50$CNOT = makeSymbol( "CNOT" );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ITERATOR" ), makeSymbol( "&KEY" ), makeSymbol( "INVALID-TOKEN" ), makeSymbol( "DONE" ), makeSymbol( "PROGRESS-MESSAGE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list52 = ConsesLow.list( makeKeyword( "INVALID-TOKEN" ), makeKeyword( "DONE" ), makeKeyword( "PROGRESS-MESSAGE" ) );
    $kw53$INVALID_TOKEN = makeKeyword( "INVALID-TOKEN" );
    $kw54$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $sym55$NOTING_PROGRESS = makeSymbol( "NOTING-PROGRESS" );
    $list56 = ConsesLow.list( makeSymbol( "NOTE-PROGRESS" ) );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ITERATOR" ), makeSymbol( "&KEY" ), makeSymbol( "INVALID-TOKEN" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list58 = ConsesLow.list( makeKeyword( "INVALID-TOKEN" ), makeKeyword( "DONE" ) );
    $list59 = ConsesLow.list( new SubLObject[] { makeSymbol( "DO-ITERATOR-WITHOUT-VALUES" ), makeSymbol( "DO-FINAL-INDEX-FROM-SPEC" ), makeSymbol( "DO-ITERATOR-WITHOUT-VALUES-PROGRESS" ), makeSymbol(
        "DO-GAF-ARG-INDEX" ), makeSymbol( "DO-PREDICATE-EXTENT-INDEX" ), makeSymbol( "DO-NART-ARG-INDEX" ), makeSymbol( "DO-FUNCTION-EXTENT-INDEX" ), makeSymbol( "DO-PREDICATE-RULE-INDEX" ), makeSymbol(
            "DO-ISA-RULE-INDEX" ), makeSymbol( "DO-QUOTED-ISA-RULE-INDEX" ), makeSymbol( "DO-GENLS-RULE-INDEX" ), makeSymbol( "DO-GENL-MT-RULE-INDEX" ), makeSymbol( "DO-EXCEPTION-RULE-INDEX" ), makeSymbol(
                "DO-PRAGMA-RULE-INDEX" ), makeSymbol( "DO-UNBOUND-PREDICATE-RULE-INDEX" ), makeSymbol( "DO-MT-INDEX" ), makeSymbol( "DO-OTHER-INDEX" ), makeSymbol( "DO-TERM-INDEX" )
    } );
    $sym60$ITERATOR_VAR = makeUninternedSymbol( "ITERATOR-VAR" );
    $sym61$DONE_VAR = makeUninternedSymbol( "DONE-VAR" );
    $sym62$TOKEN_VAR = makeUninternedSymbol( "TOKEN-VAR" );
    $sym63$VALID = makeUninternedSymbol( "VALID" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "N" ), makeSymbol( "ITERATOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym65$COUNT = makeUninternedSymbol( "COUNT" );
    $sym66$NEW_DONE = makeUninternedSymbol( "NEW-DONE" );
    $list67 = ConsesLow.list( ZERO_INTEGER );
    $sym68$__ = makeSymbol( ">=" );
    $sym69$PROGN = makeSymbol( "PROGN" );
    $sym70$CINC = makeSymbol( "CINC" );
    $list71 = ConsesLow.list( T );
    $sym72$COPY_TREE = makeSymbol( "COPY-TREE" );
    $sym73$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym74$FALSE = makeSymbol( "FALSE" );
    $sym75$NULL = makeSymbol( "NULL" );
    $sym76$ITERATE_NON_NULL_SINGLETON_NEXT = makeSymbol( "ITERATE-NON-NULL-SINGLETON-NEXT" );
    $sym77$INTEGERP = makeSymbol( "INTEGERP" );
    $sym78$NUMBERP = makeSymbol( "NUMBERP" );
    $sym79$ITERATE_NUMBER_DONE = makeSymbol( "ITERATE-NUMBER-DONE" );
    $sym80$ITERATE_NUMBER_NEXT = makeSymbol( "ITERATE-NUMBER-NEXT" );
    $list81 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "DELTA" ), makeSymbol( "END" ) );
    $sym82$ITERATE_LIST_NEXT = makeSymbol( "ITERATE-LIST-NEXT" );
    $sym83$LISTP = makeSymbol( "LISTP" );
    $sym84$ITERATE_LIST_DONE = makeSymbol( "ITERATE-LIST-DONE" );
    $sym85$LIST_ITERATOR_P = makeSymbol( "LIST-ITERATOR-P" );
    $sym86$ITERATE_INFERENCE_LIST_NEXT = makeSymbol( "ITERATE-INFERENCE-LIST-NEXT" );
    $sym87$ITERATE_INFERENCE_LIST_DONE = makeSymbol( "ITERATE-INFERENCE-LIST-DONE" );
    $sym88$INFERENCE_LIST_ITERATOR_P = makeSymbol( "INFERENCE-LIST-ITERATOR-P" );
    $sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER = makeSymbol( "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?-ITERATION-HELPER" );
    $sym90$ALIST_P = makeSymbol( "ALIST-P" );
    $sym91$CONS_TO_TUPLE = makeSymbol( "CONS-TO-TUPLE" );
    $sym92$VECTORP = makeSymbol( "VECTORP" );
    $sym93$DEFAULT_ITERATOR_DONE_P = makeSymbol( "DEFAULT-ITERATOR-DONE-P" );
    $sym94$ITERATE_VECTOR_NEXT = makeSymbol( "ITERATE-VECTOR-NEXT" );
    $list95 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "VECTOR" ) );
    $kw96$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym97$ITERATE_VECTOR_INDEX_NEXT = makeSymbol( "ITERATE-VECTOR-INDEX-NEXT" );
    $sym98$STRINGP = makeSymbol( "STRINGP" );
    $sym99$SEQUENCEP = makeSymbol( "SEQUENCEP" );
    $str100$_S_was_not_a_sequence = makeString( "~S was not a sequence" );
    $sym101$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $sym102$ITERATOR_HASH_TABLE_DONE = makeSymbol( "ITERATOR-HASH-TABLE-DONE" );
    $sym103$ITERATOR_HASH_TABLE_NEXT = makeSymbol( "ITERATOR-HASH-TABLE-NEXT" );
    $kw104$KEY = makeKeyword( "KEY" );
    $kw105$VALUE = makeKeyword( "VALUE" );
    $list106 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $list107 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "HASH-TABLE" ), makeSymbol( "KEY-VALUE-TUPLE" ) );
    $list108 = ConsesLow.cons( makeSymbol( "NEXT-KEY" ), makeSymbol( "REST-KEYS" ) );
    $sym109$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym110$FILE_FORM_ITERATOR_DONE_ = makeSymbol( "FILE-FORM-ITERATOR-DONE?" );
    $sym111$FILE_FORM_ITERATOR_NEXT = makeSymbol( "FILE-FORM-ITERATOR-NEXT" );
    $sym112$FILE_FORM_ITERATOR_FINALIZE = makeSymbol( "FILE-FORM-ITERATOR-FINALIZE" );
    $kw113$INPUT = makeKeyword( "INPUT" );
    $kw114$EOF = makeKeyword( "EOF" );
    $list115 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "INDEX" ), makeSymbol( "END" ), makeSymbol( "DONE?" ) );
    $kw116$CLOSED = makeKeyword( "CLOSED" );
    $list117 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $sym118$LAZY_ITERATOR_DONE = makeSymbol( "LAZY-ITERATOR-DONE" );
    $sym119$LAZY_ITERATOR_NEXT = makeSymbol( "LAZY-ITERATOR-NEXT" );
    $list120 = ConsesLow.list( makeSymbol( "LAZY-ITERATOR" ), makeSymbol( "CONSTRUCTOR" ), makeSymbol( "ARG-FORMS" ) );
    $str121$_A_is_not_a_well_formed_uninitial = makeString( "~A is not a well formed uninitialized lazy iterator" );
    $sym122$CYC_API_EVAL = makeSymbol( "CYC-API-EVAL" );
    $sym123$CONSP = makeSymbol( "CONSP" );
    $sym124$ITERATE_INDIRECT_FINALIZE = makeSymbol( "ITERATE-INDIRECT-FINALIZE" );
    $sym125$ITERATE_INDIRECT_NEXT = makeSymbol( "ITERATE-INDIRECT-NEXT" );
    $list126 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "TRANSFORM" ) );
    $sym127$ITERATE_FACTORY_FINALIZE = makeSymbol( "ITERATE-FACTORY-FINALIZE" );
    $sym128$ITERATE_FACTORY_NEXT = makeSymbol( "ITERATE-FACTORY-NEXT" );
    $kw129$START = makeKeyword( "START" );
    $list130 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "MODE" ), makeSymbol( "CONSTRUCTORS" ), makeSymbol( "DATA" ) );
    $kw131$CONSTRUCT = makeKeyword( "CONSTRUCT" );
    $list132 = ConsesLow.cons( makeSymbol( "NEXT-CONSTRUCTOR" ), makeSymbol( "REST-CONSTRUCTORS" ) );
    $kw133$SUBITERATE = makeKeyword( "SUBITERATE" );
    $sym134$META_ITERATOR_ITERATOR_DONE = makeSymbol( "META-ITERATOR-ITERATOR-DONE" );
    $sym135$META_ITERATOR_ITERATOR_NEXT = makeSymbol( "META-ITERATOR-ITERATOR-NEXT" );
    $sym136$META_ITERATOR_ITERATOR_FINALIZE = makeSymbol( "META-ITERATOR-ITERATOR-FINALIZE" );
    $kw137$EXHAUSTED = makeKeyword( "EXHAUSTED" );
    $list138 = ConsesLow.list( makeSymbol( "OBJECT-ITERATOR" ), makeSymbol( "META-ITERATOR" ) );
    $sym139$ITERATOR_ITERATOR_DONE = makeSymbol( "ITERATOR-ITERATOR-DONE" );
    $sym140$ITERATOR_ITERATOR_NEXT = makeSymbol( "ITERATOR-ITERATOR-NEXT" );
    $sym141$ITERATOR_ITERATOR_FINALIZE = makeSymbol( "ITERATOR-ITERATOR-FINALIZE" );
    $sym142$ROTATING_ITERATOR_ITERATOR_DONE = makeSymbol( "ROTATING-ITERATOR-ITERATOR-DONE" );
    $sym143$ROTATING_ITERATOR_ITERATOR_NEXT = makeSymbol( "ROTATING-ITERATOR-ITERATOR-NEXT" );
    $sym144$ROTATING_ITERATOR_ITERATOR_FINALIZE = makeSymbol( "ROTATING-ITERATOR-ITERATOR-FINALIZE" );
    $str145$ = makeString( "" );
    $str146$invalid_lazy_iterator_found_in_me = makeString( "invalid lazy iterator found in meta-iterator ~A ~A" );
    $str147$in_make_rotating_iterator_iterato = makeString( "in make-rotating-iterator-iterator-state" );
    $list148 = ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "ITERATORS" ) );
    $kw149$INITIAL = makeKeyword( "INITIAL" );
    $sym150$REUSABLE_ITERATOR_DONE = makeSymbol( "REUSABLE-ITERATOR-DONE" );
    $sym151$REUSABLE_ITERATOR_NEXT = makeSymbol( "REUSABLE-ITERATOR-NEXT" );
    $sym152$REUSABLE_ITERATOR_FINALIZE = makeSymbol( "REUSABLE-ITERATOR-FINALIZE" );
    $list153 = ConsesLow.list( makeSymbol( "REAL-STATE" ), makeSymbol( "QUEUE" ), makeSymbol( "MODE" ), makeSymbol( "DONE" ), makeSymbol( "NEXT" ), makeSymbol( "FINALIZE" ) );
    $kw154$REUSE = makeKeyword( "REUSE" );
    $str155$Unknown_mode___a_ = makeString( "Unknown mode: ~a." );
    $sym156$REUSABLE_ITERATOR_FROM_ITERATOR_DONE = makeSymbol( "REUSABLE-ITERATOR-FROM-ITERATOR-DONE" );
    $sym157$REUSABLE_ITERATOR_FROM_ITERATOR_NEXT = makeSymbol( "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT" );
    $sym158$REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE = makeSymbol( "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE" );
    $list159 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ITERATOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), ConsesLow.list( makeSymbol( "RESET" ), T ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list160 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "RESET" ) );
    $kw161$RESET = makeKeyword( "RESET" );
    $sym162$RESET_REUSABLE_ITERATOR = makeSymbol( "RESET-REUSABLE-ITERATOR" );
    $sym163$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE = makeSymbol( "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE" );
    $sym164$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT = makeSymbol( "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT" );
    $sym165$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE = makeSymbol( "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE" );
    $list166 = ConsesLow.list( makeSymbol( "REVERSE-ITERATORS" ), makeSymbol( "REVERSE-RESULT" ) );
    $sym167$FILTER_ITERATOR_FINALIZE = makeSymbol( "FILTER-ITERATOR-FINALIZE" );
    $sym168$FILTER_AND_TRANSFORM_ITERATOR_NEXT = makeSymbol( "FILTER-AND-TRANSFORM-ITERATOR-NEXT" );
    $list169 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "FILTER-METHOD" ), makeSymbol( "FILTER-ARGS" ) );
    $list170 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "FILTER-METHOD" ), makeSymbol( "FILTER-ARGS" ), makeSymbol( "INVALID-TOKEN" ) );
    $str171$YOU_SHALL_NOT_PASS = makeString( "YOU SHALL NOT PASS" );
    $sym172$XFORM_ITERATOR_DONE = makeSymbol( "XFORM-ITERATOR-DONE" );
    $sym173$XFORM_ITERATOR_NEXT = makeSymbol( "XFORM-ITERATOR-NEXT" );
    $sym174$XFORM_ITERATOR_FINALIZE = makeSymbol( "XFORM-ITERATOR-FINALIZE" );
    $list175 = ConsesLow.list( makeSymbol( "ITERATOR" ), makeSymbol( "XFORM-FN" ), makeSymbol( "PARAM" ) );
    $sym176$ITERATE_XML_TOKEN_NEXT = makeSymbol( "ITERATE-XML-TOKEN-NEXT" );
    $sym177$XML_TOKEN_ITERATOR_P = makeSymbol( "XML-TOKEN-ITERATOR-P" );
  }

  public static final class $iterator_native
      extends
        SubLStructNative
  {
    public SubLObject $state;
    public SubLObject $done;
    public SubLObject $next;
    public SubLObject $finalize;
    private static final SubLStructDeclNative structDecl;

    public $iterator_native()
    {
      this.$state = CommonSymbols.NIL;
      this.$done = CommonSymbols.NIL;
      this.$next = CommonSymbols.NIL;
      this.$finalize = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $iterator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$state;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$done;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$next;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$finalize;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$state = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$done = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$next = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$finalize = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $iterator_native.class, $sym0$ITERATOR, $sym1$ITERATOR_P, $list2, $list3, new String[] { "$state", "$done", "$next", "$finalize"
      }, $list4, $list5, $sym6$PRINT_ITERATOR );
    }
  }

  public static final class $iterator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterator_p( arg1 );
    }
  }

  public static final class $iterate_non_null_singleton_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterate_non_null_singleton_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATE-NON-NULL-SINGLETON-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterate_non_null_singleton_next( arg1 );
    }
  }

  public static final class $iterate_number_done$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterate_number_done$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATE-NUMBER-DONE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterate_number_done( arg1 );
    }
  }

  public static final class $iterate_list_done$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterate_list_done$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATE-LIST-DONE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterate_list_done( arg1 );
    }
  }

  public static final class $iterate_list_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterate_list_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATE-LIST-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterate_list_next( arg1 );
    }
  }

  public static final class $iterate_vector_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterate_vector_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATE-VECTOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterate_vector_next( arg1 );
    }
  }

  public static final class $iterator_iterator_done$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterator_iterator_done$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATOR-ITERATOR-DONE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterator_iterator_done( arg1 );
    }
  }

  public static final class $iterator_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $iterator_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITERATOR-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return iterator_iterator_next( arg1 );
    }
  }

  public static final class $reusable_iterator_done$UnaryFunction
      extends
        UnaryFunction
  {
    public $reusable_iterator_done$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REUSABLE-ITERATOR-DONE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return reusable_iterator_done( arg1 );
    }
  }

  public static final class $reusable_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $reusable_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REUSABLE-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return reusable_iterator_next( arg1 );
    }
  }

  public static final class $reusable_iterator_cartesian_iterator_done$UnaryFunction
      extends
        UnaryFunction
  {
    public $reusable_iterator_cartesian_iterator_done$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return reusable_iterator_cartesian_iterator_done( arg1 );
    }
  }

  public static final class $reusable_iterator_cartesian_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $reusable_iterator_cartesian_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return reusable_iterator_cartesian_iterator_next( arg1 );
    }
  }

  public static final class $default_iterator_done_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $default_iterator_done_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DEFAULT-ITERATOR-DONE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return default_iterator_done_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 643 ms synthetic
 */