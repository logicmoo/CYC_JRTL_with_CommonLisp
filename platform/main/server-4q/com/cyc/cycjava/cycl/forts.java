package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.forts";
  public static final String myFingerPrint = "47a6760ac485dc04bd675a1e4bcbcea0939054120725b20de7a998053e7d76d4";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLSymbol $dtp_fort_id_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12211L)
  private static SubLSymbol $cfasl_opcode_fort_id_index$;
  private static final SubLSymbol $sym0$FORT_P;
  private static final SubLList $list1;
  private static final SubLString $str2$Return_T_iff_OBJECT_is_a_first_or;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$FORT_EL_FORMULA;
  private static final SubLList $list5;
  private static final SubLString $str6$Return_the_EL_formula_for_any_FOR;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLString $str10$mapping_Cyc_FORTs;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw13$DONE;
  private static final SubLSymbol $sym14$TABLE_VAR;
  private static final SubLSymbol $sym15$DO_LIST;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$DO_KB_SUID_TABLE;
  private static final SubLSymbol $kw18$PROGRESS_MESSAGE;
  private static final SubLSymbol $sym19$MESSAGE;
  private static final SubLSymbol $sym20$TOTAL;
  private static final SubLSymbol $sym21$SOFAR;
  private static final SubLSymbol $sym22$CLET;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym26$DO_FORTS;
  private static final SubLSymbol $sym27$CINC;
  private static final SubLSymbol $sym28$NOTE_PERCENT_PROGRESS;
  private static final SubLString $str29$Iterate_over_all_HL_FORT_datastru;
  private static final SubLSymbol $sym30$DO_FORTS_TABLES;
  private static final SubLSymbol $sym31$FORT_COUNT;
  private static final SubLString $str32$Return_the_total_number_of_FORTs_;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$TRUE;
  private static final SubLInteger $int35$500;
  private static final SubLSymbol $sym36$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str37$_S_was_not_a_FORT;
  private static final SubLSymbol $sym38$REMOVE_FORT;
  private static final SubLString $str39$Remove_FORT_from_the_KB_;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$FORT_ID_INDEX;
  private static final SubLSymbol $sym42$FORT_ID_INDEX_P;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$PRINT_FORT_ID_INDEX;
  private static final SubLSymbol $sym48$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$FORT_ID_INDEX_CONSTANTS;
  private static final SubLSymbol $sym51$_CSETF_FORT_ID_INDEX_CONSTANTS;
  private static final SubLSymbol $sym52$FORT_ID_INDEX_NARTS;
  private static final SubLSymbol $sym53$_CSETF_FORT_ID_INDEX_NARTS;
  private static final SubLSymbol $kw54$CONSTANTS;
  private static final SubLSymbol $kw55$NARTS;
  private static final SubLString $str56$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw57$BEGIN;
  private static final SubLSymbol $sym58$MAKE_FORT_ID_INDEX;
  private static final SubLSymbol $kw59$SLOT;
  private static final SubLSymbol $kw60$END;
  private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD;
  private static final SubLString $str62$Constant_Index_;
  private static final SubLString $str63$Nart_Index_;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$PROGN;
  private static final SubLSymbol $sym66$CHECK_TYPE;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$PWHEN;
  private static final SubLSymbol $sym70$VALID_FORT_;
  private static final SubLSymbol $sym71$FIF;
  private static final SubLSymbol $sym72$CONSTANT_P;
  private static final SubLSymbol $sym73$CONSTANT_INTERNAL_ID;
  private static final SubLSymbol $sym74$NART_ID;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$FII;
  private static final SubLSymbol $sym77$DO_FORT_ID_INDEX_CONSTANTS;
  private static final SubLSymbol $sym78$DO_FORT_ID_INDEX_NARTS;
  private static final SubLSymbol $sym79$DO_FORT_ID_INDEX;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$ID;
  private static final SubLSymbol $sym82$DO_ID_INDEX;
  private static final SubLSymbol $sym83$DO_FII_GET_CONSTANTS;
  private static final SubLSymbol $sym84$FIND_CONSTANT_BY_INTERNAL_ID;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$ID;
  private static final SubLSymbol $sym87$DO_FII_GET_NARTS;
  private static final SubLSymbol $sym88$FIND_NART_BY_ID;
  private static final SubLInteger $int89$99;
  private static final SubLSymbol $sym90$CFASL_INPUT_FORT_ID_INDEX;
  private static final SubLSymbol $sym91$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD;
  private static final SubLSymbol $kw92$SKIP;
  private static final SubLString $str93$Checking_that_forts_iterators_wor;
  private static final SubLSymbol $kw94$EXHAUSTED;
  private static final SubLSymbol $sym95$_EXIT;
  private static final SubLSymbol $kw96$ERROR;
  private static final SubLString $str97$FORTS_ITERATOR_exhausted_before_D;
  private static final SubLSymbol $kw98$INDEX;
  private static final SubLString $str99$FORTS_ITERATOR_returned_non_fort_;
  private static final SubLSymbol $kw100$CANDIDATE;
  private static final SubLString $str101$FORTS_ITERATOR_and_DO_FORTS_diffe;
  private static final SubLSymbol $kw102$FORT;
  private static final SubLString $str103$The_FORTS_iterator_has_more_value;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 771L)
  public static SubLObject fort_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) || NIL != nart_handles.nart_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1002L)
  public static SubLObject non_fort_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == fort_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1070L)
  public static SubLObject list_of_fort_p(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( $sym0$FORT_P, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1151L)
  public static SubLObject fort_el_formula(final SubLObject fort)
  {
    enforceType( fort, $sym0$FORT_P );
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return fort;
    }
    return narts_high.nart_el_formula( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1386L)
  public static SubLObject new_forts_iterator()
  {
    return iteration.new_iterator_iterator( ConsesLow.list( constant_handles.new_constants_iterator(), nart_handles.new_narts_iterator() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1673L)
  public static SubLObject do_forts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    var = current.first();
    current = current.rest();
    final SubLObject progress_message = current.isCons() ? current.first() : $str10$mapping_Cyc_FORTs;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list9 );
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      if( NIL == conses_high.member( current_$1, $list11, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == progress_message )
    {
      final SubLObject table_var = $sym14$TABLE_VAR;
      return ConsesLow.list( $sym15$DO_LIST, ConsesLow.list( table_var, $list16, $kw13$DONE, done ), ConsesLow.listS( $sym17$DO_KB_SUID_TABLE, ConsesLow.list( var, table_var, $kw18$PROGRESS_MESSAGE, NIL, $kw13$DONE,
          done ), ConsesLow.append( body, NIL ) ) );
    }
    final SubLObject message = $sym19$MESSAGE;
    final SubLObject total = $sym20$TOTAL;
    final SubLObject sofar = $sym21$SOFAR;
    return ConsesLow.list( $sym22$CLET, ConsesLow.list( ConsesLow.list( message, progress_message ), reader.bq_cons( total, $list23 ), reader.bq_cons( sofar, $list24 ) ), ConsesLow.list( $sym25$NOTING_PERCENT_PROGRESS,
        message, ConsesLow.listS( $sym26$DO_FORTS, ConsesLow.list( var, NIL, $kw13$DONE, done ), ConsesLow.list( $sym27$CINC, sofar ), ConsesLow.list( $sym28$NOTE_PERCENT_PROGRESS, sofar, total ), ConsesLow.append( body,
            NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2889L)
  public static SubLObject do_forts_tables()
  {
    return ConsesLow.list( constant_handles.do_constants_table(), nart_handles.do_narts_table() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3057L)
  public static SubLObject fort_count()
  {
    return Numbers.add( constant_handles.constant_count(), nart_handles.nart_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3197L)
  public static SubLObject random_fort(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym34$TRUE );
    }
    final SubLObject fort_count = fort_count();
    if( fort_count.numG( ZERO_INTEGER ) )
    {
      final SubLObject constant_threshold = constant_handles.constant_count();
      SubLObject v_answer;
      SubLObject candidate;
      for( v_answer = NIL; NIL == v_answer; v_answer = candidate )
      {
        final SubLObject fort_type_indicator = random.random( fort_count );
        candidate = ( fort_type_indicator.numL( constant_threshold ) ? constants_high.random_constant( UNPROVIDED ) : narts_high.random_nart( UNPROVIDED ) );
        if( NIL != candidate && NIL != Functions.funcall( test, candidate ) )
        {
        }
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3784L)
  public static SubLObject sample_forts(SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int35$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym34$TRUE );
    }
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL != allow_repeatsP )
    {
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        result = ConsesLow.cons( random_fort( test ), result );
      }
      return result;
    }
    SubLObject result;
    for( result = set_contents.new_set_contents( n, Symbols.symbol_function( EQL ) ); set_contents.set_contents_size( result ).numL( n ); result = set_contents.set_contents_add( random_fort( test ), result, Symbols
        .symbol_function( EQL ) ) )
    {
    }
    return set_contents.set_contents_element_list( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4353L)
  public static SubLObject fort_index(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_low.constant_index( fort );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return narts_low.nart_index( fort );
    }
    Errors.error( $str37$_S_was_not_a_FORT, fort );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4583L)
  public static SubLObject reset_fort_index(final SubLObject fort, final SubLObject new_index)
  {
    assert NIL != fort_p( fort ) : fort;
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_low.reset_constant_index( fort, new_index );
    }
    return narts_low.reset_nart_index( fort, new_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4862L)
  public static SubLObject clear_fort_index(final SubLObject fort)
  {
    return reset_fort_index( fort, kb_indexing_datastructures.new_simple_index() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5009L)
  public static SubLObject fort_internal_id(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.constant_internal_id( fort );
    }
    return number_utilities.f_1_( Numbers.minus( nart_handles.nart_id( fort ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5154L)
  public static SubLObject fort_external_id(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.constant_external_id( fort );
    }
    return number_utilities.f_1_( Numbers.minus( nart_handles.nart_id( fort ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5299L)
  public static SubLObject valid_fortP(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constant_handles.valid_constantP( fort, UNPROVIDED );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return nart_handles.valid_nartP( fort, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5581L)
  public static SubLObject valid_fort_robustP(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constant_handles.valid_constant_robustP( fort );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return nart_handles.valid_nart_robustP( fort );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5882L)
  public static SubLObject invalid_fortP(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constant_handles.invalid_constantP( fort, UNPROVIDED );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return narts_high.invalid_nartP( fort, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6113L)
  public static SubLObject invalid_fort_robustP(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constant_handles.invalid_constant_robustP( fort );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return narts_high.invalid_nart_robustP( fort );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6425L)
  public static SubLObject remove_fort(final SubLObject fort)
  {
    enforceType( fort, $sym0$FORT_P );
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.remove_constant( fort );
    }
    return narts_high.remove_nart( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject fort_id_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_fort_id_index( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject fort_id_index_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $fort_id_index_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject fort_id_index_constants(final SubLObject v_object)
  {
    assert NIL != fort_id_index_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject fort_id_index_narts(final SubLObject v_object)
  {
    assert NIL != fort_id_index_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject _csetf_fort_id_index_constants(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != fort_id_index_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject _csetf_fort_id_index_narts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != fort_id_index_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject make_fort_id_index(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $fort_id_index_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw54$CONSTANTS ) )
      {
        _csetf_fort_id_index_constants( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$NARTS ) )
      {
        _csetf_fort_id_index_narts( v_new, current_value );
      }
      else
      {
        Errors.error( $str56$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject visit_defstruct_fort_id_index(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw57$BEGIN, $sym58$MAKE_FORT_ID_INDEX, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw59$SLOT, $kw54$CONSTANTS, fort_id_index_constants( obj ) );
    Functions.funcall( visitor_fn, obj, $kw59$SLOT, $kw55$NARTS, fort_id_index_narts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$END, $sym58$MAKE_FORT_ID_INDEX, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6955L)
  public static SubLObject visit_defstruct_object_fort_id_index_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_fort_id_index( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7050L)
  public static SubLObject print_fort_id_index(final SubLObject fort_id_index, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( fort_id_index, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, fort_id_index, T, T );
      streams_high.write_string( $str62$Constant_Index_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( fort_id_index_constants( fort_id_index ), stream );
      streams_high.write_string( $str63$Nart_Index_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( fort_id_index_narts( fort_id_index ), stream );
      print_macros.print_unreadable_object_postamble( stream, fort_id_index, NIL, NIL );
    }
    return fort_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7413L)
  public static SubLObject with_fort_id_index_index_and_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id_index_var = NIL;
    SubLObject id_var = NIL;
    SubLObject fort = NIL;
    SubLObject fort_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    id_index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    id_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    fort = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    fort_id_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym65$PROGN, ConsesLow.listS( $sym66$CHECK_TYPE, fort, $list67 ), ConsesLow.listS( $sym66$CHECK_TYPE, fort_id_index, $list68 ), ConsesLow.list( $sym69$PWHEN, ConsesLow.list(
          $sym70$VALID_FORT_, fort ), ConsesLow.listS( $sym22$CLET, ConsesLow.list( ConsesLow.list( id_index_var, ConsesLow.list( $sym71$FIF, ConsesLow.list( $sym72$CONSTANT_P, fort ), ConsesLow.list(
              $sym50$FORT_ID_INDEX_CONSTANTS, fort_id_index ), ConsesLow.list( $sym52$FORT_ID_INDEX_NARTS, fort_id_index ) ) ), ConsesLow.list( id_var, ConsesLow.list( $sym71$FIF, ConsesLow.list( $sym72$CONSTANT_P,
                  fort ), ConsesLow.list( $sym73$CONSTANT_INTERNAL_ID, fort ), ConsesLow.list( $sym74$NART_ID, fort ) ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7907L)
  public static SubLObject new_fort_id_index()
  {
    final SubLObject fort_id_index = make_fort_id_index( UNPROVIDED );
    _csetf_fort_id_index_constants( fort_id_index, new_fort_id_index_constants() );
    _csetf_fort_id_index_narts( fort_id_index, new_fort_id_index_narts() );
    return fort_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8257L)
  public static SubLObject fort_id_index_count(final SubLObject fort_id_index)
  {
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    return Numbers.add( id_index.id_index_count( fort_id_index_constants( fort_id_index ) ), id_index.id_index_count( fort_id_index_narts( fort_id_index ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8555L)
  public static SubLObject fort_id_index_emptyP(final SubLObject fort_id_index)
  {
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    return Equality.eq( fort_id_index_count( fort_id_index ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8705L)
  public static SubLObject fort_id_index_lookup(final SubLObject fort_id_index, final SubLObject fort)
  {
    SubLObject v_answer = NIL;
    assert NIL != fort_p( fort ) : fort;
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    if( NIL != valid_fortP( fort ) )
    {
      final SubLObject v_id_index = ( NIL != constant_handles.constant_p( fort ) ) ? fort_id_index_constants( fort_id_index ) : fort_id_index_narts( fort_id_index );
      final SubLObject id = ( NIL != constant_handles.constant_p( fort ) ) ? constants_high.constant_internal_id( fort ) : nart_handles.nart_id( fort );
      v_answer = id_index.id_index_lookup( v_id_index, id, UNPROVIDED );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8993L)
  public static SubLObject fort_id_index_enter(final SubLObject fort_id_index, final SubLObject fort, final SubLObject v_object)
  {
    assert NIL != fort_p( fort ) : fort;
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    if( NIL != valid_fortP( fort ) )
    {
      final SubLObject v_id_index = ( NIL != constant_handles.constant_p( fort ) ) ? fort_id_index_constants( fort_id_index ) : fort_id_index_narts( fort_id_index );
      final SubLObject id = ( NIL != constant_handles.constant_p( fort ) ) ? constants_high.constant_internal_id( fort ) : nart_handles.nart_id( fort );
      id_index.id_index_enter( v_id_index, id, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9260L)
  public static SubLObject fort_id_index_remove(final SubLObject fort_id_index, final SubLObject fort)
  {
    assert NIL != fort_p( fort ) : fort;
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    if( NIL != valid_fortP( fort ) )
    {
      final SubLObject v_id_index = ( NIL != constant_handles.constant_p( fort ) ) ? fort_id_index_constants( fort_id_index ) : fort_id_index_narts( fort_id_index );
      final SubLObject id = ( NIL != constant_handles.constant_p( fort ) ) ? constants_high.constant_internal_id( fort ) : nart_handles.nart_id( fort );
      id_index.id_index_remove( v_id_index, id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9495L)
  public static SubLObject clear_fort_id_index(final SubLObject fort_id_index)
  {
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    id_index.clear_id_index( fort_id_index_constants( fort_id_index ) );
    id_index.clear_id_index( fort_id_index_narts( fort_id_index ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9773L)
  public static SubLObject optimize_fort_id_index(final SubLObject fort_id_index)
  {
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    id_index.optimize_id_index( fort_id_index_constants( fort_id_index ), UNPROVIDED );
    id_index.optimize_id_index( fort_id_index_narts( fort_id_index ), UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10136L)
  public static SubLObject fort_id_index_optimized_p(final SubLObject fort_id_index)
  {
    assert NIL != fort_id_index_p( fort_id_index ) : fort_id_index;
    return makeBoolean( NIL != id_index.id_index_optimized_p( fort_id_index_constants( fort_id_index ) ) && NIL != id_index.id_index_optimized_p( fort_id_index_narts( fort_id_index ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10499L)
  public static SubLObject new_fort_id_index_constants()
  {
    return id_index.new_id_index( constants_high.new_constant_internal_id_threshold(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10622L)
  public static SubLObject new_fort_id_index_narts()
  {
    return id_index.new_id_index( nart_handles.new_nart_id_threshold(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10714L)
  public static SubLObject do_fort_id_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fort = NIL;
    SubLObject value = NIL;
    SubLObject fort_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    fort = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    fort_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list75 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list75 );
      if( NIL == conses_high.member( current_$2, $list11, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject fii = $sym76$FII;
    return ConsesLow.list( $sym22$CLET, ConsesLow.list( ConsesLow.list( fii, fort_id_index ) ), ConsesLow.listS( $sym77$DO_FORT_ID_INDEX_CONSTANTS, ConsesLow.list( fort, value, fii, $kw13$DONE, done ), ConsesLow.append(
        body, NIL ) ), ConsesLow.listS( $sym78$DO_FORT_ID_INDEX_NARTS, ConsesLow.list( fort, value, fii, $kw13$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11269L)
  public static SubLObject do_fort_id_index_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constant = NIL;
    SubLObject value = NIL;
    SubLObject fort_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    constant = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    fort_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      if( NIL == conses_high.member( current_$3, $list11, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym81$ID;
    return ConsesLow.list( $sym82$DO_ID_INDEX, ConsesLow.list( id, value, ConsesLow.list( $sym83$DO_FII_GET_CONSTANTS, fort_id_index ), $kw13$DONE, done ), ConsesLow.list( $sym22$CLET, ConsesLow.list( ConsesLow.list(
        constant, ConsesLow.list( $sym84$FIND_CONSTANT_BY_INTERNAL_ID, id ) ) ), ConsesLow.listS( $sym69$PWHEN, constant, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11622L)
  public static SubLObject do_fii_get_constants(final SubLObject fort_id_index)
  {
    return fort_id_index_constants( fort_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11768L)
  public static SubLObject do_fort_id_index_narts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject nart = NIL;
    SubLObject value = NIL;
    SubLObject fort_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    nart = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    fort_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      if( NIL == conses_high.member( current_$4, $list11, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym86$ID;
    return ConsesLow.list( $sym82$DO_ID_INDEX, ConsesLow.list( id, value, ConsesLow.list( $sym87$DO_FII_GET_NARTS, fort_id_index ), $kw13$DONE, done ), ConsesLow.list( $sym22$CLET, ConsesLow.list( ConsesLow.list( nart,
        ConsesLow.list( $sym88$FIND_NART_BY_ID, id ) ) ), ConsesLow.listS( $sym69$PWHEN, nart, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12077L)
  public static SubLObject do_fii_get_narts(final SubLObject fort_id_index)
  {
    return fort_id_index_narts( fort_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12345L)
  public static SubLObject cfasl_output_object_fort_id_index_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_fort_id_index( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12476L)
  public static SubLObject cfasl_output_fort_id_index(final SubLObject fort_id_index, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_fort_id_index$.getGlobalValue(), stream );
    final SubLObject count = fort_id_index_count( fort_id_index );
    cfasl.cfasl_output( count, stream );
    SubLObject idx = do_fii_get_constants( fort_id_index );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw92$SKIP ) )
    {
      final SubLObject idx_$5 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$5, $kw92$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$5 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject value;
        SubLObject fort;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          value = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( value ) || NIL == id_index.id_index_skip_tombstones_p( $kw92$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( value ) )
            {
              value = $kw92$SKIP;
            }
            fort = constants_high.find_constant_by_internal_id( id );
            if( NIL != fort )
            {
              cfasl.cfasl_output( fort, stream );
              cfasl.cfasl_output( value, stream );
            }
          }
        }
      }
      final SubLObject idx_$6 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$6 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$6 );
        SubLObject id2 = NIL;
        SubLObject value2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            value2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject fort2 = constants_high.find_constant_by_internal_id( id2 );
            if( NIL != fort2 )
            {
              cfasl.cfasl_output( fort2, stream );
              cfasl.cfasl_output( value2, stream );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    idx = do_fii_get_narts( fort_id_index );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw92$SKIP ) )
    {
      final SubLObject idx_$7 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$7, $kw92$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$7 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject value;
        SubLObject fort;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          value = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( value ) || NIL == id_index.id_index_skip_tombstones_p( $kw92$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( value ) )
            {
              value = $kw92$SKIP;
            }
            fort = nart_handles.find_nart_by_id( id );
            if( NIL != fort )
            {
              cfasl.cfasl_output( fort, stream );
              cfasl.cfasl_output( value, stream );
            }
          }
        }
      }
      final SubLObject idx_$8 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$8 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$8 );
        SubLObject id2 = NIL;
        SubLObject value2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            value2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject fort2 = nart_handles.find_nart_by_id( id2 );
            if( NIL != fort2 )
            {
              cfasl.cfasl_output( fort2, stream );
              cfasl.cfasl_output( value2, stream );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return fort_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12832L)
  public static SubLObject cfasl_input_fort_id_index(final SubLObject stream)
  {
    final SubLObject count = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject fort_id_index = NIL;
    fort_id_index = new_fort_id_index();
    SubLObject i;
    SubLObject fort;
    SubLObject value;
    for( i = NIL, i = ZERO_INTEGER; i.numL( count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      fort = cfasl.cfasl_input_object( stream );
      value = cfasl.cfasl_input_object( stream );
      fort_id_index_enter( fort_id_index, fort, value );
    }
    return fort_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13257L)
  public static SubLObject verify_do_forts_macro_iteration_equivalence()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject index = ZERO_INTEGER;
    final SubLObject iter = new_forts_iterator();
    final SubLObject message = $str93$Checking_that_forts_iterators_wor;
    final SubLObject total = fort_count();
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
        SubLObject cdolist_list_var = do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw92$SKIP ) )
          {
            final SubLObject idx_$9 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$9, $kw92$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$9 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              SubLObject candidate;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw92$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw92$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  index = Numbers.add( index, ONE_INTEGER );
                  candidate = iteration.iteration_next_without_values( iter, $kw94$EXHAUSTED );
                  if( NIL == fort_p( candidate ) )
                  {
                    if( candidate == $kw94$EXHAUSTED )
                    {
                      return ConsesLow.list( $kw96$ERROR, $str97$FORTS_ITERATOR_exhausted_before_D, $kw98$INDEX, index );
                    }
                    return ConsesLow.list( $kw96$ERROR, $str99$FORTS_ITERATOR_returned_non_fort_, $kw100$CANDIDATE, candidate, $kw98$INDEX, index );
                  }
                  else if( !candidate.eql( fort ) )
                  {
                    return ConsesLow.list( $kw96$ERROR, $str101$FORTS_ITERATOR_and_DO_FORTS_diffe, $kw100$CANDIDATE, candidate, $kw102$FORT, fort, $kw98$INDEX, index );
                  }
                }
              }
            }
            final SubLObject idx_$10 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$10 ) || NIL == id_index.id_index_skip_tombstones_p( $kw92$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$10 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$10 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$10 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw92$SKIP ) ) ? NIL : $kw92$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw92$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  index = Numbers.add( index, ONE_INTEGER );
                  final SubLObject candidate2 = iteration.iteration_next_without_values( iter, $kw94$EXHAUSTED );
                  if( NIL == fort_p( candidate2 ) )
                  {
                    if( candidate2 == $kw94$EXHAUSTED )
                    {
                      return ConsesLow.list( $kw96$ERROR, $str97$FORTS_ITERATOR_exhausted_before_D, $kw98$INDEX, index );
                    }
                    return ConsesLow.list( $kw96$ERROR, $str99$FORTS_ITERATOR_returned_non_fort_, $kw100$CANDIDATE, candidate2, $kw98$INDEX, index );
                  }
                  else if( !candidate2.eql( fort2 ) )
                  {
                    return ConsesLow.list( $kw96$ERROR, $str101$FORTS_ITERATOR_and_DO_FORTS_diffe, $kw100$CANDIDATE, candidate2, $kw102$FORT, fort2, $kw98$INDEX, index );
                  }
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
        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
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
    final SubLObject exhausted = iteration.iteration_next_without_values( iter, $kw94$EXHAUSTED );
    if( $kw94$EXHAUSTED != exhausted )
    {
      return ConsesLow.list( $kw96$ERROR, $str103$The_FORTS_iterator_has_more_value, $kw98$INDEX, index, $kw100$CANDIDATE, exhausted );
    }
    return NIL;
  }

  public static SubLObject declare_forts_file()
  {
    SubLFiles.declareFunction( me, "fort_p", "FORT-P", 1, 0, false );
    new $fort_p$UnaryFunction();
    SubLFiles.declareFunction( me, "non_fort_p", "NON-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_fort_p", "LIST-OF-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_el_formula", "FORT-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "new_forts_iterator", "NEW-FORTS-ITERATOR", 0, 0, false );
    SubLFiles.declareMacro( me, "do_forts", "DO-FORTS" );
    SubLFiles.declareFunction( me, "do_forts_tables", "DO-FORTS-TABLES", 0, 0, false );
    SubLFiles.declareFunction( me, "fort_count", "FORT-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "random_fort", "RANDOM-FORT", 0, 1, false );
    SubLFiles.declareFunction( me, "sample_forts", "SAMPLE-FORTS", 0, 3, false );
    SubLFiles.declareFunction( me, "fort_index", "FORT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_fort_index", "RESET-FORT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_fort_index", "CLEAR-FORT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_internal_id", "FORT-INTERNAL-ID", 1, 0, false );
    new $fort_internal_id$UnaryFunction();
    SubLFiles.declareFunction( me, "fort_external_id", "FORT-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_fortP", "VALID-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_fort_robustP", "VALID-FORT-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_fortP", "INVALID-FORT?", 1, 0, false );
    new $invalid_fortP$UnaryFunction();
    SubLFiles.declareFunction( me, "invalid_fort_robustP", "INVALID-FORT-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_fort", "REMOVE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_print_function_trampoline", "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_p", "FORT-ID-INDEX-P", 1, 0, false );
    new $fort_id_index_p$UnaryFunction();
    SubLFiles.declareFunction( me, "fort_id_index_constants", "FORT-ID-INDEX-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_narts", "FORT-ID-INDEX-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fort_id_index_constants", "_CSETF-FORT-ID-INDEX-CONSTANTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fort_id_index_narts", "_CSETF-FORT-ID-INDEX-NARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_fort_id_index", "MAKE-FORT-ID-INDEX", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_fort_id_index", "VISIT-DEFSTRUCT-FORT-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_fort_id_index_method", "VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_fort_id_index", "PRINT-FORT-ID-INDEX", 3, 0, false );
    SubLFiles.declareMacro( me, "with_fort_id_index_index_and_id", "WITH-FORT-ID-INDEX-INDEX-AND-ID" );
    SubLFiles.declareFunction( me, "new_fort_id_index", "NEW-FORT-ID-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_count", "FORT-ID-INDEX-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_emptyP", "FORT-ID-INDEX-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_lookup", "FORT-ID-INDEX-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_enter", "FORT-ID-INDEX-ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_remove", "FORT-ID-INDEX-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_fort_id_index", "CLEAR-FORT-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "optimize_fort_id_index", "OPTIMIZE-FORT-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_id_index_optimized_p", "FORT-ID-INDEX-OPTIMIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_fort_id_index_constants", "NEW-FORT-ID-INDEX-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_fort_id_index_narts", "NEW-FORT-ID-INDEX-NARTS", 0, 0, false );
    SubLFiles.declareMacro( me, "do_fort_id_index", "DO-FORT-ID-INDEX" );
    SubLFiles.declareMacro( me, "do_fort_id_index_constants", "DO-FORT-ID-INDEX-CONSTANTS" );
    SubLFiles.declareFunction( me, "do_fii_get_constants", "DO-FII-GET-CONSTANTS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_fort_id_index_narts", "DO-FORT-ID-INDEX-NARTS" );
    SubLFiles.declareFunction( me, "do_fii_get_narts", "DO-FII-GET-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_fort_id_index_method", "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_fort_id_index", "CFASL-OUTPUT-FORT-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_fort_id_index", "CFASL-INPUT-FORT-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "verify_do_forts_macro_iteration_equivalence", "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_forts_file()
  {
    $dtp_fort_id_index$ = SubLFiles.defconstant( "*DTP-FORT-ID-INDEX*", $sym41$FORT_ID_INDEX );
    $cfasl_opcode_fort_id_index$ = SubLFiles.defconstant( "*CFASL-OPCODE-FORT-ID-INDEX*", $int89$99 );
    return NIL;
  }

  public static SubLObject setup_forts_file()
  {
    utilities_macros.register_cyc_api_function( $sym0$FORT_P, $list1, $str2$Return_T_iff_OBJECT_is_a_first_or, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym4$FORT_EL_FORMULA, $list5, $str6$Return_the_EL_formula_for_any_FOR, $list7, $list8 );
    utilities_macros.register_cyc_api_macro( $sym26$DO_FORTS, $list9, $str29$Iterate_over_all_HL_FORT_datastru );
    access_macros.register_macro_helper( $sym30$DO_FORTS_TABLES, $sym26$DO_FORTS );
    utilities_macros.register_cyc_api_function( $sym31$FORT_COUNT, NIL, $str32$Return_the_total_number_of_FORTs_, NIL, $list33 );
    utilities_macros.register_cyc_api_function( $sym38$REMOVE_FORT, $list5, $str39$Remove_FORT_from_the_KB_, $list7, $list40 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function( $sym48$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list49 );
    Structures.def_csetf( $sym50$FORT_ID_INDEX_CONSTANTS, $sym51$_CSETF_FORT_ID_INDEX_CONSTANTS );
    Structures.def_csetf( $sym52$FORT_ID_INDEX_NARTS, $sym53$_CSETF_FORT_ID_INDEX_NARTS );
    Equality.identity( $sym41$FORT_ID_INDEX );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function( $sym61$VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD ) );
    access_macros.register_macro_helper( $sym77$DO_FORT_ID_INDEX_CONSTANTS, $sym79$DO_FORT_ID_INDEX );
    access_macros.register_macro_helper( $sym83$DO_FII_GET_CONSTANTS, $sym77$DO_FORT_ID_INDEX_CONSTANTS );
    access_macros.register_macro_helper( $sym78$DO_FORT_ID_INDEX_NARTS, $sym79$DO_FORT_ID_INDEX );
    access_macros.register_macro_helper( $sym87$DO_FII_GET_NARTS, $sym78$DO_FORT_ID_INDEX_NARTS );
    cfasl.register_cfasl_input_function( $cfasl_opcode_fort_id_index$.getGlobalValue(), $sym90$CFASL_INPUT_FORT_ID_INDEX );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function( $sym91$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_forts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_forts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_forts_file();
  }
  static
  {
    me = new forts();
    $dtp_fort_id_index$ = null;
    $cfasl_opcode_fort_id_index$ = null;
    $sym0$FORT_P = makeSymbol( "FORT-P" );
    $list1 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str2$Return_T_iff_OBJECT_is_a_first_or = makeString( "Return T iff OBJECT is a first order reified term (FORT)." );
    $list3 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym4$FORT_EL_FORMULA = makeSymbol( "FORT-EL-FORMULA" );
    $list5 = ConsesLow.list( makeSymbol( "FORT" ) );
    $str6$Return_the_EL_formula_for_any_FOR = makeString( "Return the EL formula for any FORT." );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "FORT-P" ) ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSP" ) ) );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping Cyc FORTs" ) ), makeSymbol( "&KEY" ), makeSymbol(
        "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str10$mapping_Cyc_FORTs = makeString( "mapping Cyc FORTs" );
    $list11 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw12$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw13$DONE = makeKeyword( "DONE" );
    $sym14$TABLE_VAR = makeUninternedSymbol( "TABLE-VAR" );
    $sym15$DO_LIST = makeSymbol( "DO-LIST" );
    $list16 = ConsesLow.list( makeSymbol( "DO-FORTS-TABLES" ) );
    $sym17$DO_KB_SUID_TABLE = makeSymbol( "DO-KB-SUID-TABLE" );
    $kw18$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $sym19$MESSAGE = makeUninternedSymbol( "MESSAGE" );
    $sym20$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym21$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym22$CLET = makeSymbol( "CLET" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT-COUNT" ) ) );
    $list24 = ConsesLow.list( ZERO_INTEGER );
    $sym25$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym26$DO_FORTS = makeSymbol( "DO-FORTS" );
    $sym27$CINC = makeSymbol( "CINC" );
    $sym28$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $str29$Iterate_over_all_HL_FORT_datastru = makeString(
        "Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the FORT.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts as soon as DONE becomes non-nil." );
    $sym30$DO_FORTS_TABLES = makeSymbol( "DO-FORTS-TABLES" );
    $sym31$FORT_COUNT = makeSymbol( "FORT-COUNT" );
    $str32$Return_the_total_number_of_FORTs_ = makeString( "Return the total number of FORTs." );
    $list33 = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $sym34$TRUE = makeSymbol( "TRUE" );
    $int35$500 = makeInteger( 500 );
    $sym36$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str37$_S_was_not_a_FORT = makeString( "~S was not a FORT" );
    $sym38$REMOVE_FORT = makeSymbol( "REMOVE-FORT" );
    $str39$Remove_FORT_from_the_KB_ = makeString( "Remove FORT from the KB." );
    $list40 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym41$FORT_ID_INDEX = makeSymbol( "FORT-ID-INDEX" );
    $sym42$FORT_ID_INDEX_P = makeSymbol( "FORT-ID-INDEX-P" );
    $list43 = ConsesLow.list( makeSymbol( "CONSTANTS" ), makeSymbol( "NARTS" ) );
    $list44 = ConsesLow.list( makeKeyword( "CONSTANTS" ), makeKeyword( "NARTS" ) );
    $list45 = ConsesLow.list( makeSymbol( "FORT-ID-INDEX-CONSTANTS" ), makeSymbol( "FORT-ID-INDEX-NARTS" ) );
    $list46 = ConsesLow.list( makeSymbol( "_CSETF-FORT-ID-INDEX-CONSTANTS" ), makeSymbol( "_CSETF-FORT-ID-INDEX-NARTS" ) );
    $sym47$PRINT_FORT_ID_INDEX = makeSymbol( "PRINT-FORT-ID-INDEX" );
    $sym48$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE" );
    $list49 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FORT-ID-INDEX-P" ) );
    $sym50$FORT_ID_INDEX_CONSTANTS = makeSymbol( "FORT-ID-INDEX-CONSTANTS" );
    $sym51$_CSETF_FORT_ID_INDEX_CONSTANTS = makeSymbol( "_CSETF-FORT-ID-INDEX-CONSTANTS" );
    $sym52$FORT_ID_INDEX_NARTS = makeSymbol( "FORT-ID-INDEX-NARTS" );
    $sym53$_CSETF_FORT_ID_INDEX_NARTS = makeSymbol( "_CSETF-FORT-ID-INDEX-NARTS" );
    $kw54$CONSTANTS = makeKeyword( "CONSTANTS" );
    $kw55$NARTS = makeKeyword( "NARTS" );
    $str56$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw57$BEGIN = makeKeyword( "BEGIN" );
    $sym58$MAKE_FORT_ID_INDEX = makeSymbol( "MAKE-FORT-ID-INDEX" );
    $kw59$SLOT = makeKeyword( "SLOT" );
    $kw60$END = makeKeyword( "END" );
    $sym61$VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD" );
    $str62$Constant_Index_ = makeString( "Constant Index:" );
    $str63$Nart_Index_ = makeString( "Nart Index:" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "ID-INDEX-VAR" ), makeSymbol( "ID-VAR" ), makeSymbol( "FORT" ), makeSymbol( "FORT-ID-INDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym65$PROGN = makeSymbol( "PROGN" );
    $sym66$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list67 = ConsesLow.list( makeSymbol( "FORT-P" ) );
    $list68 = ConsesLow.list( makeSymbol( "FORT-ID-INDEX-P" ) );
    $sym69$PWHEN = makeSymbol( "PWHEN" );
    $sym70$VALID_FORT_ = makeSymbol( "VALID-FORT?" );
    $sym71$FIF = makeSymbol( "FIF" );
    $sym72$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym73$CONSTANT_INTERNAL_ID = makeSymbol( "CONSTANT-INTERNAL-ID" );
    $sym74$NART_ID = makeSymbol( "NART-ID" );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "VALUE" ), makeSymbol( "FORT-ID-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym76$FII = makeUninternedSymbol( "FII" );
    $sym77$DO_FORT_ID_INDEX_CONSTANTS = makeSymbol( "DO-FORT-ID-INDEX-CONSTANTS" );
    $sym78$DO_FORT_ID_INDEX_NARTS = makeSymbol( "DO-FORT-ID-INDEX-NARTS" );
    $sym79$DO_FORT_ID_INDEX = makeSymbol( "DO-FORT-ID-INDEX" );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "VALUE" ), makeSymbol( "FORT-ID-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym81$ID = makeUninternedSymbol( "ID" );
    $sym82$DO_ID_INDEX = makeSymbol( "DO-ID-INDEX" );
    $sym83$DO_FII_GET_CONSTANTS = makeSymbol( "DO-FII-GET-CONSTANTS" );
    $sym84$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol( "FIND-CONSTANT-BY-INTERNAL-ID" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "NART" ), makeSymbol( "VALUE" ), makeSymbol( "FORT-ID-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym86$ID = makeUninternedSymbol( "ID" );
    $sym87$DO_FII_GET_NARTS = makeSymbol( "DO-FII-GET-NARTS" );
    $sym88$FIND_NART_BY_ID = makeSymbol( "FIND-NART-BY-ID" );
    $int89$99 = makeInteger( 99 );
    $sym90$CFASL_INPUT_FORT_ID_INDEX = makeSymbol( "CFASL-INPUT-FORT-ID-INDEX" );
    $sym91$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD" );
    $kw92$SKIP = makeKeyword( "SKIP" );
    $str93$Checking_that_forts_iterators_wor = makeString( "Checking that forts iterators work." );
    $kw94$EXHAUSTED = makeKeyword( "EXHAUSTED" );
    $sym95$_EXIT = makeSymbol( "%EXIT" );
    $kw96$ERROR = makeKeyword( "ERROR" );
    $str97$FORTS_ITERATOR_exhausted_before_D = makeString( "FORTS-ITERATOR exhausted before DO-FORTS" );
    $kw98$INDEX = makeKeyword( "INDEX" );
    $str99$FORTS_ITERATOR_returned_non_fort_ = makeString( "FORTS-ITERATOR returned non-fort!" );
    $kw100$CANDIDATE = makeKeyword( "CANDIDATE" );
    $str101$FORTS_ITERATOR_and_DO_FORTS_diffe = makeString( "FORTS-ITERATOR and DO-FORTS differ in which FORT they think is next" );
    $kw102$FORT = makeKeyword( "FORT" );
    $str103$The_FORTS_iterator_has_more_value = makeString( "The FORTS iterator has more values than DO-FORTS." );
  }

  public static final class $fort_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $fort_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return fort_p( arg1 );
    }
  }

  public static final class $fort_internal_id$UnaryFunction
      extends
        UnaryFunction
  {
    public $fort_internal_id$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORT-INTERNAL-ID" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return fort_internal_id( arg1 );
    }
  }

  public static final class $invalid_fortP$UnaryFunction
      extends
        UnaryFunction
  {
    public $invalid_fortP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INVALID-FORT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return invalid_fortP( arg1 );
    }
  }

  public static final class $fort_id_index_native
      extends
        SubLStructNative
  {
    public SubLObject $constants;
    public SubLObject $narts;
    private static final SubLStructDeclNative structDecl;

    public $fort_id_index_native()
    {
      this.$constants = CommonSymbols.NIL;
      this.$narts = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $fort_id_index_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$constants;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$narts;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$constants = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$narts = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $fort_id_index_native.class, $sym41$FORT_ID_INDEX, $sym42$FORT_ID_INDEX_P, $list43, $list44, new String[] { "$constants", "$narts"
      }, $list45, $list46, $sym47$PRINT_FORT_ID_INDEX );
    }
  }

  public static final class $fort_id_index_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $fort_id_index_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORT-ID-INDEX-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return fort_id_index_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 411 ms
 * 
 */