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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class enumerations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.enumerations";
  public static final String myFingerPrint = "283010053f94f53ce41c5c5b1fd0593362e8fd27bf73645a83f8279757b2cae3";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2638L)
  private static SubLSymbol $enumerations_initial_hashtable_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2703L)
  private static SubLSymbol $enumerations_table_update_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2797L)
  private static SubLSymbol $enumerations_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2894L)
  private static SubLSymbol $enum_values_initial_hashtable_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2958L)
  private static SubLSymbol $enum_values_table_update_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3050L)
  private static SubLSymbol $enum_values_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLSymbol $dtp_enumeration$;
  private static final SubLInteger $int0$100;
  private static final SubLString $str1$Enumerations_Table_Lock;
  private static final SubLSymbol $sym2$_ENUMERATIONS_TABLE_;
  private static final SubLInteger $int3$200;
  private static final SubLString $str4$Enum_Values_Table_Lock;
  private static final SubLSymbol $sym5$_ENUM_VALUES_TABLE_;
  private static final SubLSymbol $sym6$ENUMERATION;
  private static final SubLSymbol $sym7$ENUMERATION_P;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$PRINT_ENUMERATION;
  private static final SubLSymbol $sym13$ENUMERATION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$ENUMERATION_TYPE_NAME;
  private static final SubLSymbol $sym16$_CSETF_ENUMERATION_TYPE_NAME;
  private static final SubLSymbol $sym17$ENUMERATION_CARDINALITY;
  private static final SubLSymbol $sym18$_CSETF_ENUMERATION_CARDINALITY;
  private static final SubLSymbol $sym19$ENUMERATION_VALUES_VECTOR;
  private static final SubLSymbol $sym20$_CSETF_ENUMERATION_VALUES_VECTOR;
  private static final SubLSymbol $kw21$TYPE_NAME;
  private static final SubLSymbol $kw22$CARDINALITY;
  private static final SubLSymbol $kw23$VALUES_VECTOR;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_ENUMERATION;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD;
  private static final SubLString $str30$___S_;
  private static final SubLString $str31$__S;
  private static final SubLString $str32$_;
  private static final SubLList $list33;
  private static final SubLString $str34$enumeration;
  private static final SubLSymbol $sym35$ENUMERATION_;
  private static final SubLList $list36;
  private static final SubLString $str37$cardinality;
  private static final SubLString $str38$vector;
  private static final SubLString $str39$index;
  private static final SubLSymbol $sym40$CLET;
  private static final SubLSymbol $sym41$CDOTIMES;
  private static final SubLSymbol $sym42$CSETQ;
  private static final SubLSymbol $sym43$AREF;
  private static final SubLString $str44$DEFINE_ENUMERATION___S_is_not_a_v;
  private static final SubLString $str45$DEFINE_ENUMERATION___S_is_not_a_v;
  private static final SubLString $str46$DEFINE_ENUMERATION___S_is_not_a_v;
  private static final SubLString $str47$_VALID__SS_;
  private static final SubLSymbol $sym48$DEFCONSTANT_PRIVATE;
  private static final SubLSymbol $sym49$QUOTE;
  private static final SubLString $str50$Enumerated_values_of_type__S_;
  private static final SubLSymbol $kw51$API;
  private static final SubLSymbol $sym52$DEFINE_API;
  private static final SubLSymbol $kw53$PUBLIC;
  private static final SubLSymbol $sym54$DEFINE_PUBLIC;
  private static final SubLSymbol $kw55$PROTECTED;
  private static final SubLSymbol $sym56$DEFINE_PROTECTED;
  private static final SubLSymbol $kw57$PRIVATE;
  private static final SubLSymbol $sym58$DEFINE_PRIVATE;
  private static final SubLSymbol $sym59$DEFINE;
  private static final SubLString $str60$Returns_a_list_of_all_valid_membe;
  private static final SubLString $str61$VALID__SS;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$RET;
  private static final SubLString $str64$Return_T_iff_OBJECT_is_a_member_o;
  private static final SubLString $str65$_S_P;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$FIF;
  private static final SubLSymbol $sym69$MEMBER;
  private static final SubLSymbol $sym70$OBJECT;
  private static final SubLList $list71;
  private static final SubLString $str72$Maps_a_member_of_the__S_enumerati;
  private static final SubLString $str73$ENCODE__S;
  private static final SubLString $str74$pos;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$POSITION;
  private static final SubLSymbol $sym78$VALUE;
  private static final SubLSymbol $sym79$MUST;
  private static final SubLString $str80$_S___S_is_not_a_member_of_the__S_;
  private static final SubLString $str81$Maps_an_encoded_value_to_a_member;
  private static final SubLString $str82$DECODE__S;
  private static final SubLString $str83$element;
  private static final SubLSymbol $kw84$RETURN_TYPES;
  private static final SubLSymbol $sym85$NTH;
  private static final SubLString $str86$_S___S_is_not_a_valid_encoding_of;
  private static final SubLString $str87$Provides_a_LESSP_predicate_for_me;
  private static final SubLString $str88$_S_LESS_P;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLString $str91$_S___S_was_expected_to_be_a_membe;
  private static final SubLSymbol $sym92$VALUE1;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$VALUE2;
  private static final SubLSymbol $sym95$CDOLIST;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLString $str98$Provides_a_GREATERP_predicate_for;
  private static final SubLString $str99$_S_GREATER_P;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$PROGN;
  private static final SubLSymbol $sym102$ENUMERATIONS_INCORPORATE_DEFINITION;
  private static final SubLList $list103;
  private static final SubLString $str104$ENUMERATE_VALUES___S_is_not_a_val;
  private static final SubLString $str105$ENUMERATION_MEMBER_P___S_is_not_a;
  private static final SubLString $str106$ENUMERATION_MEMBER_P___S_is_not_k;
  private static final SubLString $str107$ENCODE_ENUMERATION___S_is_not_a_v;
  private static final SubLString $str108$ENCODE_ENUMERATION___S_is_not_kno;
  private static final SubLString $str109$ENCODE_ENUMERATION___S_has_no_mem;
  private static final SubLString $str110$ENCODE_ENUMERATION___S_is_not_a_m;
  private static final SubLString $str111$DECODE_ENUMERATION___S_is_not_a_v;
  private static final SubLString $str112$DECODE_ENUMERATION___S_is_not_kno;
  private static final SubLString $str113$DECODE_ENUMERATION___S_has_no_mem;
  private static final SubLString $str114$DECODE_ENUMERATION___S_is_not_a_v;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$ENUMERATIONS_RETRIEVE_ENUMERATION;
  private static final SubLString $str117$DO_ENUMERATION___S_does_not_evalu;
  private static final SubLString $str118$ENUMERATION_LESS_P___S_is_not_a_v;
  private static final SubLString $str119$ENUMERATION_LESS_P___S_is_not_kno;
  private static final SubLString $str120$ENUMERATION_LESS_P___S_has_no_val;
  private static final SubLString $str121$ENUMERATION_GREATER_P___S_is_not_;
  private static final SubLString $str122$ENUMERATION_GREATER_P___S_is_not_;
  private static final SubLString $str123$ENUMERATION_GREATER_P___S_has_no_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject enumeration_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_enumeration( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject enumeration_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $enumeration_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject enumeration_type_name(final SubLObject v_object)
  {
    assert NIL != enumeration_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject enumeration_cardinality(final SubLObject v_object)
  {
    assert NIL != enumeration_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject enumeration_values_vector(final SubLObject v_object)
  {
    assert NIL != enumeration_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject _csetf_enumeration_type_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != enumeration_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject _csetf_enumeration_cardinality(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != enumeration_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject _csetf_enumeration_values_vector(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != enumeration_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject make_enumeration(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $enumeration_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw21$TYPE_NAME ) )
      {
        _csetf_enumeration_type_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$CARDINALITY ) )
      {
        _csetf_enumeration_cardinality( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$VALUES_VECTOR ) )
      {
        _csetf_enumeration_values_vector( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject visit_defstruct_enumeration(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_ENUMERATION, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$TYPE_NAME, enumeration_type_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$CARDINALITY, enumeration_cardinality( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$VALUES_VECTOR, enumeration_values_vector( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_ENUMERATION, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3145L)
  public static SubLObject visit_defstruct_object_enumeration_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_enumeration( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3353L)
  public static SubLObject print_enumeration(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str30$___S_, enumeration_type_name( v_object ) );
    if( NIL != enumeration_values_vector( v_object ) )
    {
      SubLObject cdotimes_end_var;
      SubLObject index;
      for( cdotimes_end_var = enumeration_cardinality( v_object ), index = NIL, index = ZERO_INTEGER; index.numL( cdotimes_end_var ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        PrintLow.format( stream, $str31$__S, Vectors.aref( enumeration_values_vector( v_object ), index ) );
      }
    }
    PrintLow.format( stream, $str32$_ );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3769L)
  public static SubLObject with_enumeration_read_only(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enumeration = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    enumeration = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject enumeration_var = Symbols.make_symbol( $str34$enumeration );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( enumeration_var, enumeration, $sym35$ENUMERATION_, $list8, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4292L)
  public static SubLObject with_enumeration_read_write(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enumeration = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    enumeration = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject enumeration_var = Symbols.make_symbol( $str34$enumeration );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( enumeration_var, enumeration, $sym35$ENUMERATION_, $list8, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4970L)
  public static SubLObject do_enumeration_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject enumeration = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    enumeration = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject forms;
      current = ( forms = temp );
      final SubLObject enumeration_var = Symbols.make_symbol( $str34$enumeration );
      final SubLObject cardinality_var = Symbols.make_symbol( $str37$cardinality );
      final SubLObject vector_var = Symbols.make_symbol( $str38$vector );
      final SubLObject index_var = Symbols.make_symbol( $str39$index );
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( enumeration_var, enumeration ), ConsesLow.list( cardinality_var, ConsesLow.list( $sym17$ENUMERATION_CARDINALITY, enumeration_var ) ), ConsesLow
          .list( vector_var, ConsesLow.list( $sym19$ENUMERATION_VALUES_VECTOR, enumeration_var ) ), var ), ConsesLow.listS( $sym41$CDOTIMES, ConsesLow.list( index_var, cardinality_var ), ConsesLow.list( $sym42$CSETQ,
              var, ConsesLow.list( $sym43$AREF, vector_var, index_var ) ), forms ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5757L)
  public static SubLObject enumerations_retrieve_enumeration(final SubLObject enumeration_name)
  {
    if( enumeration_name.isSymbol() )
    {
      return Hashtables.gethash( enumeration_name, $enumerations_table$.getGlobalValue(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6054L)
  public static SubLObject enumeration_intern_enumeration(final SubLObject enumeration_name, final SubLObject enumeration)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $enumerations_table_update_lock$.getDynamicValue( thread ) );
      if( enumeration_name.isSymbol() && NIL != enumeration_p( enumeration ) )
      {
        Hashtables.sethash( enumeration_name, $enumerations_table$.getGlobalValue(), enumeration );
        final SubLObject cardinality = enumeration_cardinality( enumeration );
        final SubLObject vector = enumeration_values_vector( enumeration );
        SubLObject value = NIL;
        SubLObject index;
        for( index = NIL, index = ZERO_INTEGER; index.numL( cardinality ); index = Numbers.add( index, ONE_INTEGER ) )
        {
          value = Vectors.aref( vector, index );
          enumerations_intern_enumeration_by_value( value, enumeration );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $enumerations_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return enumeration;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6872L)
  public static SubLObject get_all_enumerated_types()
  {
    SubLObject enumerated_types = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $enumerations_table$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        enumerated_types = ConsesLow.cons( key, enumerated_types );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sequences.nreverse( enumerated_types );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7092L)
  public static SubLObject enumerations_delete_enumeration(final SubLObject enumeration_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $enumerations_table_update_lock$.getDynamicValue( thread ) );
      if( enumeration_name.isSymbol() )
      {
        final SubLObject enumeration = Hashtables.gethash( enumeration_name, $enum_values_table$.getGlobalValue(), UNPROVIDED );
        if( NIL != enumeration )
        {
          final SubLObject enumeration_$2 = enumeration;
          final SubLObject cardinality = enumeration_cardinality( enumeration_$2 );
          final SubLObject vector = enumeration_values_vector( enumeration_$2 );
          SubLObject value = NIL;
          SubLObject index;
          for( index = NIL, index = ZERO_INTEGER; index.numL( cardinality ); index = Numbers.add( index, ONE_INTEGER ) )
          {
            value = Vectors.aref( vector, index );
            enumerations_delete_enumeration_by_value( value, enumeration );
          }
        }
        Hashtables.remhash( enumeration_name, $enumerations_table$.getGlobalValue() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $enumerations_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7796L)
  public static SubLObject enumerations_retrieve_enumerations_by_value(final SubLObject enum_value)
  {
    return Hashtables.gethash( enum_value, $enum_values_table$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8110L)
  public static SubLObject enumerations_intern_enumeration_by_value(final SubLObject enum_value, final SubLObject enumeration)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != enumeration_p( enumeration ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $enum_values_table_update_lock$.getDynamicValue( thread ) );
        SubLObject current_enumerations = Hashtables.gethash( enum_value, $enum_values_table$.getGlobalValue(), UNPROVIDED );
        if( NIL == conses_high.member( enumeration, current_enumerations, UNPROVIDED, UNPROVIDED ) )
        {
          current_enumerations = ConsesLow.cons( enumeration, current_enumerations );
          Hashtables.sethash( enum_value, $enum_values_table$.getGlobalValue(), current_enumerations );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $enum_values_table_update_lock$.getDynamicValue( thread ) );
        }
      }
      return enumeration;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8714L)
  public static SubLObject enumerations_delete_enumeration_by_value(final SubLObject enum_value, final SubLObject enumeration)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != enumeration_p( enumeration ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $enum_values_table_update_lock$.getDynamicValue( thread ) );
        SubLObject current_enumerations = Hashtables.gethash( enum_value, $enum_values_table$.getGlobalValue(), UNPROVIDED );
        current_enumerations = Sequences.delete( enumeration, current_enumerations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != current_enumerations )
        {
          Hashtables.sethash( enum_value, $enum_values_table$.getGlobalValue(), current_enumerations );
        }
        else
        {
          Hashtables.remhash( enum_value, $enum_values_table$.getGlobalValue() );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $enum_values_table_update_lock$.getDynamicValue( thread ) );
        }
      }
      return enumeration;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9376L)
  public static SubLObject enumerations_redundant_elements_p(final SubLObject list)
  {
    SubLObject sublist;
    for( sublist = NIL, sublist = list; NIL != sublist; sublist = sublist.rest() )
    {
      if( NIL != conses_high.member( sublist.first(), sublist.rest(), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9601L)
  public static SubLObject enumerations_check_definition(final SubLObject enum_name, final SubLObject values)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !enum_name.isSymbol() || NIL == enum_name ) )
    {
      Errors.error( $str44$DEFINE_ENUMERATION___S_is_not_a_v, enum_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !values.isList() )
    {
      Errors.error( $str45$DEFINE_ENUMERATION___S_is_not_a_v, values );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != enumerations_redundant_elements_p( values ) )
    {
      Errors.error( $str46$DEFINE_ENUMERATION___S_is_not_a_v, values );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10509L)
  public static SubLObject enumerations_incorporate_definition(final SubLObject enum_name, final SubLObject values)
  {
    SubLObject enumeration = enumerations_retrieve_enumeration( enum_name );
    if( NIL != enumeration )
    {
      enumerations_delete_enumeration( enum_name );
    }
    else
    {
      enumeration = make_enumeration( UNPROVIDED );
    }
    final SubLObject enumeration_$3 = enumeration;
    SubLObject type_name = enumeration_type_name( enumeration_$3 );
    SubLObject cardinality = enumeration_cardinality( enumeration_$3 );
    SubLObject values_vector = enumeration_values_vector( enumeration_$3 );
    try
    {
      type_name = enum_name;
      cardinality = Sequences.length( values );
      if( cardinality.isZero() )
      {
        values_vector = NIL;
      }
      else
      {
        SubLObject index = ZERO_INTEGER;
        values_vector = Vectors.make_vector( cardinality, UNPROVIDED );
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          Vectors.set_aref( values_vector, index, value );
          index = Numbers.add( index, ONE_INTEGER );
          cdolist_list_var = cdolist_list_var.rest();
          value = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        _csetf_enumeration_type_name( enumeration_$3, type_name );
        _csetf_enumeration_cardinality( enumeration_$3, cardinality );
        _csetf_enumeration_values_vector( enumeration_$3, values_vector );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    enumeration_intern_enumeration( enum_name, enumeration );
    return enumeration;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11805L)
  public static SubLObject enumerations_compute_enumeration_constant_name(final SubLObject enum_name)
  {
    return Packages.intern( PrintLow.format( NIL, $str47$_VALID__SS_, enum_name ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11936L)
  public static SubLObject enumerations_expand_enumeration_constant_declaration(final SubLObject enum_name, final SubLObject values)
  {
    final SubLObject defining_form = $sym48$DEFCONSTANT_PRIVATE;
    final SubLObject var_name = enumerations_compute_enumeration_constant_name( enum_name );
    return ConsesLow.list( defining_form, var_name, ConsesLow.list( $sym49$QUOTE, conses_high.copy_list( values ) ), PrintLow.format( NIL, $str50$Enumerated_values_of_type__S_, enum_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12266L)
  public static SubLObject enumerations_get_defining_form(final SubLObject scope)
  {
    SubLObject defining_form = NIL;
    if( scope.eql( $kw51$API ) )
    {
      defining_form = $sym52$DEFINE_API;
    }
    else if( scope.eql( $kw53$PUBLIC ) )
    {
      defining_form = $sym54$DEFINE_PUBLIC;
    }
    else if( scope.eql( $kw55$PROTECTED ) )
    {
      defining_form = $sym56$DEFINE_PROTECTED;
    }
    else if( scope.eql( $kw57$PRIVATE ) )
    {
      defining_form = $sym58$DEFINE_PRIVATE;
    }
    else
    {
      defining_form = $sym59$DEFINE;
    }
    return defining_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12658L)
  public static SubLObject enumerations_expand_enum_valid_enum_list_function(final SubLObject enum_name, final SubLObject scope)
  {
    final SubLObject defining_form = enumerations_get_defining_form( scope );
    SubLObject declarations = NIL;
    final SubLObject documentation = PrintLow.format( NIL, $str60$Returns_a_list_of_all_valid_membe, enum_name );
    final SubLObject function_name = Packages.intern( PrintLow.format( NIL, $str61$VALID__SS, enum_name ), UNPROVIDED );
    final SubLObject constant_name = enumerations_compute_enumeration_constant_name( enum_name );
    if( scope == $kw51$API )
    {
      declarations = $list62;
    }
    return ConsesLow.listS( defining_form, function_name, NIL, documentation, ConsesLow.append( declarations, ConsesLow.list( ConsesLow.list( $sym63$RET, constant_name ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13279L)
  public static SubLObject enumerations_expand_predicator_function(final SubLObject enum_name, final SubLObject scope)
  {
    final SubLObject defining_form = enumerations_get_defining_form( scope );
    SubLObject declarations = NIL;
    final SubLObject documentation = PrintLow.format( NIL, $str64$Return_T_iff_OBJECT_is_a_member_o, enum_name );
    final SubLObject predicator_name = Packages.intern( PrintLow.format( NIL, $str65$_S_P, enum_name ), UNPROVIDED );
    final SubLObject constant_name = enumerations_compute_enumeration_constant_name( enum_name );
    if( scope == $kw51$API )
    {
      declarations = $list66;
    }
    return ConsesLow.listS( defining_form, predicator_name, $list67, documentation, ConsesLow.append( declarations, ConsesLow.list( ConsesLow.list( $sym63$RET, ConsesLow.listS( $sym68$FIF, ConsesLow.list( $sym69$MEMBER,
        $sym70$OBJECT, constant_name ), $list71 ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14255L)
  public static SubLObject enumerations_expand_encode_function(final SubLObject enum_name, final SubLObject scope)
  {
    final SubLObject defining_form = enumerations_get_defining_form( scope );
    SubLObject declarations = NIL;
    final SubLObject documentation = PrintLow.format( NIL, $str72$Maps_a_member_of_the__S_enumerati, enum_name );
    final SubLObject function_name = Packages.intern( PrintLow.format( NIL, $str73$ENCODE__S, enum_name ), UNPROVIDED );
    final SubLObject pos_var = Symbols.make_symbol( $str74$pos );
    final SubLObject constant_name = enumerations_compute_enumeration_constant_name( enum_name );
    if( scope == $kw51$API )
    {
      declarations = $list75;
    }
    return ConsesLow.listS( defining_form, function_name, $list76, documentation, ConsesLow.append( declarations, ConsesLow.list( ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( pos_var, ConsesLow.list(
        $sym77$POSITION, $sym78$VALUE, constant_name ) ) ), ConsesLow.list( $sym79$MUST, pos_var, $str80$_S___S_is_not_a_member_of_the__S_, ConsesLow.list( $sym49$QUOTE, function_name ), $sym78$VALUE, ConsesLow.list(
            $sym49$QUOTE, enum_name ) ), ConsesLow.list( $sym63$RET, pos_var ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15416L)
  public static SubLObject enumerations_expand_decode_function(final SubLObject enum_name, final SubLObject scope)
  {
    final SubLObject defining_form = enumerations_get_defining_form( scope );
    SubLObject declarations = NIL;
    final SubLObject documentation = PrintLow.format( NIL, $str81$Maps_an_encoded_value_to_a_member, enum_name );
    final SubLObject predicator_name = Packages.intern( PrintLow.format( NIL, $str65$_S_P, enum_name ), UNPROVIDED );
    final SubLObject function_name = Packages.intern( PrintLow.format( NIL, $str82$DECODE__S, enum_name ), UNPROVIDED );
    final SubLObject element_var = Symbols.make_symbol( $str83$element );
    final SubLObject constant_name = enumerations_compute_enumeration_constant_name( enum_name );
    if( scope == $kw51$API )
    {
      declarations = ConsesLow.list( ConsesLow.list( ConsesLow.list( $kw84$RETURN_TYPES, predicator_name ) ) );
    }
    return ConsesLow.listS( defining_form, function_name, $list76, documentation, ConsesLow.append( declarations, ConsesLow.list( ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( element_var, ConsesLow.list(
        $sym85$NTH, $sym78$VALUE, constant_name ) ) ), ConsesLow.list( $sym79$MUST, element_var, $str86$_S___S_is_not_a_valid_encoding_of, ConsesLow.list( $sym49$QUOTE, function_name ), $sym78$VALUE, ConsesLow.list(
            $sym49$QUOTE, enum_name ) ), ConsesLow.list( $sym63$RET, element_var ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16664L)
  public static SubLObject enumerations_expand_lessp_function(final SubLObject enum_name, final SubLObject scope)
  {
    final SubLObject defining_form = enumerations_get_defining_form( scope );
    SubLObject declarations = NIL;
    final SubLObject documentation = PrintLow.format( NIL, $str87$Provides_a_LESSP_predicate_for_me, enum_name );
    final SubLObject function_name = Packages.intern( PrintLow.format( NIL, $str88$_S_LESS_P, enum_name ), UNPROVIDED );
    final SubLObject predicator_name = Packages.intern( PrintLow.format( NIL, $str65$_S_P, enum_name ), UNPROVIDED );
    final SubLObject constant_name = enumerations_compute_enumeration_constant_name( enum_name );
    if( scope == $kw51$API )
    {
      declarations = $list66;
    }
    return ConsesLow.listS( defining_form, function_name, $list89, documentation, ConsesLow.append( declarations, ConsesLow.listS( ConsesLow.list( $sym79$MUST, reader.bq_cons( predicator_name, $list90 ),
        $str91$_S___S_was_expected_to_be_a_membe, ConsesLow.list( $sym49$QUOTE, predicator_name ), $sym92$VALUE1, ConsesLow.list( $sym49$QUOTE, enum_name ) ), ConsesLow.list( $sym79$MUST, reader.bq_cons( predicator_name,
            $list93 ), $str91$_S___S_was_expected_to_be_a_membe, ConsesLow.list( $sym49$QUOTE, predicator_name ), $sym94$VALUE2, ConsesLow.list( $sym49$QUOTE, enum_name ) ), ConsesLow.listS( $sym95$CDOLIST, ConsesLow
                .list( $sym78$VALUE, constant_name ), $list96 ), $list97 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18177L)
  public static SubLObject enumerations_expand_greaterp_function(final SubLObject enum_name, final SubLObject scope)
  {
    final SubLObject defining_form = enumerations_get_defining_form( scope );
    SubLObject declarations = NIL;
    final SubLObject documentation = PrintLow.format( NIL, $str98$Provides_a_GREATERP_predicate_for, enum_name );
    final SubLObject function_name = Packages.intern( PrintLow.format( NIL, $str99$_S_GREATER_P, enum_name ), UNPROVIDED );
    final SubLObject predicator_name = Packages.intern( PrintLow.format( NIL, $str65$_S_P, enum_name ), UNPROVIDED );
    final SubLObject constant_name = enumerations_compute_enumeration_constant_name( enum_name );
    if( scope == $kw51$API )
    {
      declarations = $list66;
    }
    return ConsesLow.listS( defining_form, function_name, $list89, documentation, ConsesLow.append( declarations, ConsesLow.listS( ConsesLow.list( $sym79$MUST, reader.bq_cons( predicator_name, $list90 ),
        $str91$_S___S_was_expected_to_be_a_membe, ConsesLow.list( $sym49$QUOTE, predicator_name ), $sym92$VALUE1, ConsesLow.list( $sym49$QUOTE, enum_name ) ), ConsesLow.list( $sym79$MUST, reader.bq_cons( predicator_name,
            $list93 ), $str91$_S___S_was_expected_to_be_a_membe, ConsesLow.list( $sym49$QUOTE, predicator_name ), $sym94$VALUE2, ConsesLow.list( $sym49$QUOTE, enum_name ) ), ConsesLow.listS( $sym95$CDOLIST, ConsesLow
                .list( $sym78$VALUE, constant_name ), $list100 ), $list97 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19703L)
  public static SubLObject expand_define_enumeration(final SubLObject enum_name, final SubLObject values, final SubLObject scope)
  {
    enumerations_check_definition( enum_name, values );
    enumerations_incorporate_definition( enum_name, values );
    return ConsesLow.list( new SubLObject[] { $sym101$PROGN, enumerations_expand_enumeration_constant_declaration( enum_name, values ), ConsesLow.list( $sym102$ENUMERATIONS_INCORPORATE_DEFINITION, ConsesLow.list(
        $sym49$QUOTE, enum_name ), ConsesLow.list( $sym49$QUOTE, conses_high.copy_list( values ) ) ), enumerations_expand_enum_valid_enum_list_function( enum_name, scope ), enumerations_expand_predicator_function(
            enum_name, scope ), enumerations_expand_encode_function( enum_name, scope ), enumerations_expand_decode_function( enum_name, scope ), enumerations_expand_lessp_function( enum_name, scope ),
      enumerations_expand_greaterp_function( enum_name, scope )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20977L)
  public static SubLObject define_enumeration_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    SubLObject values = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    values = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return expand_define_enumeration( enum_name, values, $kw53$PUBLIC );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22485L)
  public static SubLObject define_enumeration_api(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    SubLObject values = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    values = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return expand_define_enumeration( enum_name, values, $kw51$API );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22597L)
  public static SubLObject define_enumeration_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    SubLObject values = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    values = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return expand_define_enumeration( enum_name, values, $kw55$PROTECTED );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22721L)
  public static SubLObject define_enumeration_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    SubLObject values = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    values = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return expand_define_enumeration( enum_name, values, $kw57$PRIVATE );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22841L)
  public static SubLObject enumerate_values(final SubLObject enum_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !enum_name.isSymbol() || NIL == enum_name ) )
    {
      Errors.error( $str104$ENUMERATE_VALUES___S_is_not_a_val, enum_name );
    }
    final SubLObject enumeration = enumerations_retrieve_enumeration( enum_name );
    if( NIL != enumeration )
    {
      final SubLObject enumeration_$4 = enumeration;
      final SubLObject cardinality = enumeration_cardinality( enumeration_$4 );
      final SubLObject values_vector = enumeration_values_vector( enumeration_$4 );
      if( NIL != values_vector )
      {
        SubLObject values = NIL;
        SubLObject index;
        for( index = NIL, index = ZERO_INTEGER; index.numL( cardinality ); index = Numbers.add( index, ONE_INTEGER ) )
        {
          values = ConsesLow.cons( Vectors.aref( values_vector, index ), values );
        }
        return Sequences.nreverse( values );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23715L)
  public static SubLObject enumerate_enumerations(final SubLObject value)
  {
    final SubLObject v_enumerations = enumerations_retrieve_enumerations_by_value( value );
    SubLObject enumeration_names = NIL;
    final SubLObject list_expression = v_enumerations;
    if( NIL == list_expression )
    {
      enumeration_names = NIL;
    }
    else if( list_expression.isAtom() )
    {
      enumeration_names = ConsesLow.list( list_expression );
    }
    else if( NIL == list_expression.rest() )
    {
      final SubLObject enumeration = list_expression.first();
      enumeration_names = ConsesLow.list( enumeration_type_name( enumeration ) );
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      final SubLObject enumeration2 = list_expression.first();
      enumeration_names = ( tail_cons = ConsesLow.list( enumeration_type_name( enumeration2 ) ) );
      SubLObject cdolist_list_var = list_expression.rest();
      SubLObject enumeration3 = NIL;
      enumeration3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.list( enumeration_type_name( enumeration3 ) );
        ConsesLow.rplacd( tail_cons, result );
        tail_cons = result;
        cdolist_list_var = cdolist_list_var.rest();
        enumeration3 = cdolist_list_var.first();
      }
    }
    return enumeration_names;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24322L)
  public static SubLObject enumeration_member_p(final SubLObject enum_name, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !enum_name.isSymbol() || NIL == enum_name ) )
    {
      Errors.error( $str105$ENUMERATION_MEMBER_P___S_is_not_a, enum_name );
    }
    final SubLObject enumeration = enumerations_retrieve_enumeration( enum_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumeration )
    {
      Errors.error( $str106$ENUMERATION_MEMBER_P___S_is_not_k, enum_name );
    }
    final SubLObject enumeration_$5 = enumeration;
    final SubLObject cardinality = enumeration_cardinality( enumeration_$5 );
    final SubLObject vector = enumeration_values_vector( enumeration_$5 );
    SubLObject member_value = NIL;
    SubLObject index;
    for( index = NIL, index = ZERO_INTEGER; index.numL( cardinality ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      member_value = Vectors.aref( vector, index );
      if( member_value.eql( value ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25002L)
  public static SubLObject encode_enumeration(final SubLObject enum_name, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !enum_name.isSymbol() || NIL == enum_name ) )
    {
      Errors.error( $str107$ENCODE_ENUMERATION___S_is_not_a_v, enum_name );
    }
    final SubLObject enumeration = enumerations_retrieve_enumeration( enum_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumeration )
    {
      Errors.error( $str108$ENCODE_ENUMERATION___S_is_not_kno, enum_name );
    }
    final SubLObject enumeration_$6 = enumeration;
    final SubLObject cardinality = enumeration_cardinality( enumeration_$6 );
    final SubLObject values_vector = enumeration_values_vector( enumeration_$6 );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == values_vector )
    {
      Errors.error( $str109$ENCODE_ENUMERATION___S_has_no_mem, enum_name );
    }
    SubLObject index;
    for( index = NIL, index = ZERO_INTEGER; index.numL( cardinality ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      if( Vectors.aref( values_vector, index ).eql( value ) )
      {
        return index;
      }
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
    {
      Errors.error( $str110$ENCODE_ENUMERATION___S_is_not_a_m, value, enum_name );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26013L)
  public static SubLObject decode_enumeration(final SubLObject enum_name, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !enum_name.isSymbol() || NIL == enum_name ) )
    {
      Errors.error( $str111$DECODE_ENUMERATION___S_is_not_a_v, enum_name );
    }
    final SubLObject enumeration = enumerations_retrieve_enumeration( enum_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumeration )
    {
      Errors.error( $str112$DECODE_ENUMERATION___S_is_not_kno, enum_name );
    }
    final SubLObject enumeration_$7 = enumeration;
    final SubLObject cardinality = enumeration_cardinality( enumeration_$7 );
    final SubLObject values_vector = enumeration_values_vector( enumeration_$7 );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == values_vector )
    {
      Errors.error( $str113$DECODE_ENUMERATION___S_has_no_mem, enum_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !value.numGE( ZERO_INTEGER ) || !value.numL( cardinality ) ) )
    {
      Errors.error( $str114$DECODE_ENUMERATION___S_is_not_a_v, value, enum_name );
    }
    return Vectors.aref( values_vector, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26723L)
  public static SubLObject do_enumeration(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject enumeration_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    enumeration_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject forms;
      current = ( forms = temp );
      final SubLObject enumeration_var = Symbols.make_symbol( $str34$enumeration );
      final SubLObject cardinality_var = Symbols.make_symbol( $str37$cardinality );
      final SubLObject vector_var = Symbols.make_symbol( $str38$vector );
      final SubLObject index_var = Symbols.make_symbol( $str39$index );
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( enumeration_var, ConsesLow.list( $sym116$ENUMERATIONS_RETRIEVE_ENUMERATION, enumeration_name ) ) ), ConsesLow.list( $sym79$MUST, enumeration_var,
          $str117$DO_ENUMERATION___S_does_not_evalu, ConsesLow.list( $sym49$QUOTE, conses_high.copy_tree( enumeration_name ) ) ), ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( cardinality_var, ConsesLow
              .list( $sym17$ENUMERATION_CARDINALITY, enumeration_var ) ), ConsesLow.list( vector_var, ConsesLow.list( $sym19$ENUMERATION_VALUES_VECTOR, enumeration_var ) ), var ), ConsesLow.listS( $sym41$CDOTIMES,
                  ConsesLow.list( index_var, cardinality_var ), ConsesLow.list( $sym42$CSETQ, var, ConsesLow.list( $sym43$AREF, vector_var, index_var ) ), forms ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27825L)
  public static SubLObject enumeration_less_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !enum_name.isSymbol() || NIL == enum_name ) )
    {
      Errors.error( $str118$ENUMERATION_LESS_P___S_is_not_a_v, enum_name );
    }
    final SubLObject enumeration = enumerations_retrieve_enumeration( enum_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumeration )
    {
      Errors.error( $str119$ENUMERATION_LESS_P___S_is_not_kno, enum_name );
    }
    SubLObject value3 = NIL;
    final SubLObject enumeration_$8 = enumeration;
    final SubLObject cardinality = enumeration_cardinality( enumeration_$8 );
    final SubLObject values_vector = enumeration_values_vector( enumeration_$8 );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == values_vector )
    {
      Errors.error( $str120$ENUMERATION_LESS_P___S_has_no_val, enum_name );
    }
    SubLObject index;
    for( index = NIL, index = ZERO_INTEGER; index.numL( cardinality ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      value3 = Vectors.aref( values_vector, index );
      if( value3.eql( value1 ) )
      {
        return makeBoolean( !value3.eql( value2 ) );
      }
      if( value3.eql( value2 ) )
      {
        return NIL;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28788L)
  public static SubLObject enumeration_less_or_equal_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2)
  {
    return makeBoolean( value1.eql( value2 ) || NIL != enumeration_less_p( enum_name, value1, value2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28942L)
  public static SubLObject enumeration_greater_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !enum_name.isSymbol() || NIL == enum_name ) )
    {
      Errors.error( $str121$ENUMERATION_GREATER_P___S_is_not_, enum_name );
    }
    final SubLObject enumeration = enumerations_retrieve_enumeration( enum_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumeration )
    {
      Errors.error( $str122$ENUMERATION_GREATER_P___S_is_not_, enum_name );
    }
    SubLObject value3 = NIL;
    final SubLObject enumeration_$9 = enumeration;
    final SubLObject cardinality = enumeration_cardinality( enumeration_$9 );
    final SubLObject values_vector = enumeration_values_vector( enumeration_$9 );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == values_vector )
    {
      Errors.error( $str123$ENUMERATION_GREATER_P___S_has_no_, enum_name );
    }
    SubLObject index;
    for( index = NIL, index = ZERO_INTEGER; index.numL( cardinality ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      value3 = Vectors.aref( values_vector, index );
      if( value3.eql( value2 ) )
      {
        return makeBoolean( !value3.eql( value1 ) );
      }
      if( value3.eql( value1 ) )
      {
        return NIL;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29923L)
  public static SubLObject enumeration_greater_or_equal_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2)
  {
    return makeBoolean( value1.eql( value2 ) || NIL != enumeration_greater_p( enum_name, value1, value2 ) );
  }

  public static SubLObject declare_enumerations_file()
  {
    SubLFiles.declareFunction( me, "enumeration_print_function_trampoline", "ENUMERATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "enumeration_p", "ENUMERATION-P", 1, 0, false );
    new $enumeration_p$UnaryFunction();
    SubLFiles.declareFunction( me, "enumeration_type_name", "ENUMERATION-TYPE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "enumeration_cardinality", "ENUMERATION-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "enumeration_values_vector", "ENUMERATION-VALUES-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_enumeration_type_name", "_CSETF-ENUMERATION-TYPE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_enumeration_cardinality", "_CSETF-ENUMERATION-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_enumeration_values_vector", "_CSETF-ENUMERATION-VALUES-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "make_enumeration", "MAKE-ENUMERATION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_enumeration", "VISIT-DEFSTRUCT-ENUMERATION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_enumeration_method", "VISIT-DEFSTRUCT-OBJECT-ENUMERATION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_enumeration", "PRINT-ENUMERATION", 3, 0, false );
    SubLFiles.declareMacro( me, "with_enumeration_read_only", "WITH-ENUMERATION-READ-ONLY" );
    SubLFiles.declareMacro( me, "with_enumeration_read_write", "WITH-ENUMERATION-READ-WRITE" );
    SubLFiles.declareMacro( me, "do_enumeration_internal", "DO-ENUMERATION-INTERNAL" );
    SubLFiles.declareFunction( me, "enumerations_retrieve_enumeration", "ENUMERATIONS-RETRIEVE-ENUMERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "enumeration_intern_enumeration", "ENUMERATION-INTERN-ENUMERATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_all_enumerated_types", "GET-ALL-ENUMERATED-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "enumerations_delete_enumeration", "ENUMERATIONS-DELETE-ENUMERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerations_retrieve_enumerations_by_value", "ENUMERATIONS-RETRIEVE-ENUMERATIONS-BY-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerations_intern_enumeration_by_value", "ENUMERATIONS-INTERN-ENUMERATION-BY-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_delete_enumeration_by_value", "ENUMERATIONS-DELETE-ENUMERATION-BY-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_redundant_elements_p", "ENUMERATIONS-REDUNDANT-ELEMENTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerations_check_definition", "ENUMERATIONS-CHECK-DEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_incorporate_definition", "ENUMERATIONS-INCORPORATE-DEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_compute_enumeration_constant_name", "ENUMERATIONS-COMPUTE-ENUMERATION-CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerations_expand_enumeration_constant_declaration", "ENUMERATIONS-EXPAND-ENUMERATION-CONSTANT-DECLARATION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_get_defining_form", "ENUMERATIONS-GET-DEFINING-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerations_expand_enum_valid_enum_list_function", "ENUMERATIONS-EXPAND-ENUM-VALID-ENUM-LIST-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_expand_predicator_function", "ENUMERATIONS-EXPAND-PREDICATOR-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_expand_encode_function", "ENUMERATIONS-EXPAND-ENCODE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_expand_decode_function", "ENUMERATIONS-EXPAND-DECODE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_expand_lessp_function", "ENUMERATIONS-EXPAND-LESSP-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerations_expand_greaterp_function", "ENUMERATIONS-EXPAND-GREATERP-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_define_enumeration", "EXPAND-DEFINE-ENUMERATION", 3, 0, false );
    SubLFiles.declareMacro( me, "define_enumeration_public", "DEFINE-ENUMERATION-PUBLIC" );
    SubLFiles.declareMacro( me, "define_enumeration_api", "DEFINE-ENUMERATION-API" );
    SubLFiles.declareMacro( me, "define_enumeration_protected", "DEFINE-ENUMERATION-PROTECTED" );
    SubLFiles.declareMacro( me, "define_enumeration_private", "DEFINE-ENUMERATION-PRIVATE" );
    SubLFiles.declareFunction( me, "enumerate_values", "ENUMERATE-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerate_enumerations", "ENUMERATE-ENUMERATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "enumeration_member_p", "ENUMERATION-MEMBER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "encode_enumeration", "ENCODE-ENUMERATION", 2, 0, false );
    SubLFiles.declareFunction( me, "decode_enumeration", "DECODE-ENUMERATION", 2, 0, false );
    SubLFiles.declareMacro( me, "do_enumeration", "DO-ENUMERATION" );
    SubLFiles.declareFunction( me, "enumeration_less_p", "ENUMERATION-LESS-P", 3, 0, false );
    SubLFiles.declareFunction( me, "enumeration_less_or_equal_p", "ENUMERATION-LESS-OR-EQUAL-P", 3, 0, false );
    SubLFiles.declareFunction( me, "enumeration_greater_p", "ENUMERATION-GREATER-P", 3, 0, false );
    SubLFiles.declareFunction( me, "enumeration_greater_or_equal_p", "ENUMERATION-GREATER-OR-EQUAL-P", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_enumerations_file()
  {
    $enumerations_initial_hashtable_size$ = SubLFiles.defconstant( "*ENUMERATIONS-INITIAL-HASHTABLE-SIZE*", $int0$100 );
    $enumerations_table_update_lock$ = SubLFiles.defparameter( "*ENUMERATIONS-TABLE-UPDATE-LOCK*", Locks.make_lock( $str1$Enumerations_Table_Lock ) );
    $enumerations_table$ = SubLFiles.deflexical( "*ENUMERATIONS-TABLE*", maybeDefault( $sym2$_ENUMERATIONS_TABLE_, $enumerations_table$, () -> ( Hashtables.make_hash_table( $enumerations_initial_hashtable_size$
        .getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ) );
    $enum_values_initial_hashtable_size$ = SubLFiles.defconstant( "*ENUM-VALUES-INITIAL-HASHTABLE-SIZE*", $int3$200 );
    $enum_values_table_update_lock$ = SubLFiles.defparameter( "*ENUM-VALUES-TABLE-UPDATE-LOCK*", Locks.make_lock( $str4$Enum_Values_Table_Lock ) );
    $enum_values_table$ = SubLFiles.deflexical( "*ENUM-VALUES-TABLE*", maybeDefault( $sym5$_ENUM_VALUES_TABLE_, $enum_values_table$, () -> ( Hashtables.make_hash_table( $enum_values_initial_hashtable_size$
        .getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_enumeration$ = SubLFiles.defconstant( "*DTP-ENUMERATION*", $sym6$ENUMERATION );
    return NIL;
  }

  public static SubLObject setup_enumerations_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_ENUMERATIONS_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym5$_ENUM_VALUES_TABLE_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_enumeration$.getGlobalValue(), Symbols.symbol_function( $sym13$ENUMERATION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list14 );
    Structures.def_csetf( $sym15$ENUMERATION_TYPE_NAME, $sym16$_CSETF_ENUMERATION_TYPE_NAME );
    Structures.def_csetf( $sym17$ENUMERATION_CARDINALITY, $sym18$_CSETF_ENUMERATION_CARDINALITY );
    Structures.def_csetf( $sym19$ENUMERATION_VALUES_VECTOR, $sym20$_CSETF_ENUMERATION_VALUES_VECTOR );
    Equality.identity( $sym6$ENUMERATION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_enumeration$.getGlobalValue(), Symbols.symbol_function( $sym29$VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_enumerations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_enumerations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_enumerations_file();
  }
  static
  {
    me = new enumerations();
    $enumerations_initial_hashtable_size$ = null;
    $enumerations_table_update_lock$ = null;
    $enumerations_table$ = null;
    $enum_values_initial_hashtable_size$ = null;
    $enum_values_table_update_lock$ = null;
    $enum_values_table$ = null;
    $dtp_enumeration$ = null;
    $int0$100 = makeInteger( 100 );
    $str1$Enumerations_Table_Lock = makeString( "Enumerations Table Lock" );
    $sym2$_ENUMERATIONS_TABLE_ = makeSymbol( "*ENUMERATIONS-TABLE*" );
    $int3$200 = makeInteger( 200 );
    $str4$Enum_Values_Table_Lock = makeString( "Enum-Values Table Lock" );
    $sym5$_ENUM_VALUES_TABLE_ = makeSymbol( "*ENUM-VALUES-TABLE*" );
    $sym6$ENUMERATION = makeSymbol( "ENUMERATION" );
    $sym7$ENUMERATION_P = makeSymbol( "ENUMERATION-P" );
    $list8 = ConsesLow.list( makeSymbol( "TYPE-NAME" ), makeSymbol( "CARDINALITY" ), makeSymbol( "VALUES-VECTOR" ) );
    $list9 = ConsesLow.list( makeKeyword( "TYPE-NAME" ), makeKeyword( "CARDINALITY" ), makeKeyword( "VALUES-VECTOR" ) );
    $list10 = ConsesLow.list( makeSymbol( "ENUMERATION-TYPE-NAME" ), makeSymbol( "ENUMERATION-CARDINALITY" ), makeSymbol( "ENUMERATION-VALUES-VECTOR" ) );
    $list11 = ConsesLow.list( makeSymbol( "_CSETF-ENUMERATION-TYPE-NAME" ), makeSymbol( "_CSETF-ENUMERATION-CARDINALITY" ), makeSymbol( "_CSETF-ENUMERATION-VALUES-VECTOR" ) );
    $sym12$PRINT_ENUMERATION = makeSymbol( "PRINT-ENUMERATION" );
    $sym13$ENUMERATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ENUMERATION-PRINT-FUNCTION-TRAMPOLINE" );
    $list14 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ENUMERATION-P" ) );
    $sym15$ENUMERATION_TYPE_NAME = makeSymbol( "ENUMERATION-TYPE-NAME" );
    $sym16$_CSETF_ENUMERATION_TYPE_NAME = makeSymbol( "_CSETF-ENUMERATION-TYPE-NAME" );
    $sym17$ENUMERATION_CARDINALITY = makeSymbol( "ENUMERATION-CARDINALITY" );
    $sym18$_CSETF_ENUMERATION_CARDINALITY = makeSymbol( "_CSETF-ENUMERATION-CARDINALITY" );
    $sym19$ENUMERATION_VALUES_VECTOR = makeSymbol( "ENUMERATION-VALUES-VECTOR" );
    $sym20$_CSETF_ENUMERATION_VALUES_VECTOR = makeSymbol( "_CSETF-ENUMERATION-VALUES-VECTOR" );
    $kw21$TYPE_NAME = makeKeyword( "TYPE-NAME" );
    $kw22$CARDINALITY = makeKeyword( "CARDINALITY" );
    $kw23$VALUES_VECTOR = makeKeyword( "VALUES-VECTOR" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_ENUMERATION = makeSymbol( "MAKE-ENUMERATION" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ENUMERATION-METHOD" );
    $str30$___S_ = makeString( "#<~S:" );
    $str31$__S = makeString( " ~S" );
    $str32$_ = makeString( ">" );
    $list33 = ConsesLow.list( makeSymbol( "ENUMERATION" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str34$enumeration = makeString( "enumeration" );
    $sym35$ENUMERATION_ = makeSymbol( "ENUMERATION-" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ENUMERATION" ) ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str37$cardinality = makeString( "cardinality" );
    $str38$vector = makeString( "vector" );
    $str39$index = makeString( "index" );
    $sym40$CLET = makeSymbol( "CLET" );
    $sym41$CDOTIMES = makeSymbol( "CDOTIMES" );
    $sym42$CSETQ = makeSymbol( "CSETQ" );
    $sym43$AREF = makeSymbol( "AREF" );
    $str44$DEFINE_ENUMERATION___S_is_not_a_v = makeString( "DEFINE-ENUMERATION: ~S is not a valid enum-name.  A non null symbol was expected." );
    $str45$DEFINE_ENUMERATION___S_is_not_a_v = makeString( "DEFINE-ENUMERATION: ~S is not a valid enumeration list.  An enumeration list must be a list." );
    $str46$DEFINE_ENUMERATION___S_is_not_a_v = makeString( "DEFINE-ENUMERATION: ~S is not a valid enumeration list.  It contains redundent elements." );
    $str47$_VALID__SS_ = makeString( "*VALID-~SS*" );
    $sym48$DEFCONSTANT_PRIVATE = makeSymbol( "DEFCONSTANT-PRIVATE" );
    $sym49$QUOTE = makeSymbol( "QUOTE" );
    $str50$Enumerated_values_of_type__S_ = makeString( "Enumerated values of type ~S." );
    $kw51$API = makeKeyword( "API" );
    $sym52$DEFINE_API = makeSymbol( "DEFINE-API" );
    $kw53$PUBLIC = makeKeyword( "PUBLIC" );
    $sym54$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $kw55$PROTECTED = makeKeyword( "PROTECTED" );
    $sym56$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $kw57$PRIVATE = makeKeyword( "PRIVATE" );
    $sym58$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $sym59$DEFINE = makeSymbol( "DEFINE" );
    $str60$Returns_a_list_of_all_valid_membe = makeString( "Returns a list of all valid members of the ~S enumeration." );
    $str61$VALID__SS = makeString( "VALID-~SS" );
    $list62 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "RETURN-TYPES" ), makeSymbol( "LISTP" ) ) ) );
    $sym63$RET = makeSymbol( "RET" );
    $str64$Return_T_iff_OBJECT_is_a_member_o = makeString( "Return T iff OBJECT is a member of the ~S enumeration." );
    $str65$_S_P = makeString( "~S-P" );
    $list66 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "RETURN-TYPES" ), makeSymbol( "BOOLEANP" ) ) ) );
    $list67 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $sym68$FIF = makeSymbol( "FIF" );
    $sym69$MEMBER = makeSymbol( "MEMBER" );
    $sym70$OBJECT = makeSymbol( "OBJECT" );
    $list71 = ConsesLow.list( T, NIL );
    $str72$Maps_a_member_of_the__S_enumerati = makeString( "Maps a member of the ~S enumeration to an integer encoding." );
    $str73$ENCODE__S = makeString( "ENCODE-~S" );
    $str74$pos = makeString( "pos" );
    $list75 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "RETURN-TYPES" ), makeSymbol( "INTEGERP" ) ) ) );
    $list76 = ConsesLow.list( makeSymbol( "VALUE" ) );
    $sym77$POSITION = makeSymbol( "POSITION" );
    $sym78$VALUE = makeSymbol( "VALUE" );
    $sym79$MUST = makeSymbol( "MUST" );
    $str80$_S___S_is_not_a_member_of_the__S_ = makeString( "~S: ~S is not a member of the ~S enumeration." );
    $str81$Maps_an_encoded_value_to_a_member = makeString( "Maps an encoded value to a member of the ~S enumeration." );
    $str82$DECODE__S = makeString( "DECODE-~S" );
    $str83$element = makeString( "element" );
    $kw84$RETURN_TYPES = makeKeyword( "RETURN-TYPES" );
    $sym85$NTH = makeSymbol( "NTH" );
    $str86$_S___S_is_not_a_valid_encoding_of = makeString( "~S: ~S is not a valid encoding of the ~S enumeration." );
    $str87$Provides_a_LESSP_predicate_for_me = makeString( "Provides a LESSP predicate for members of the ~S enumeration." );
    $str88$_S_LESS_P = makeString( "~S-LESS-P" );
    $list89 = ConsesLow.list( makeSymbol( "VALUE1" ), makeSymbol( "VALUE2" ) );
    $list90 = ConsesLow.list( makeSymbol( "VALUE1" ) );
    $str91$_S___S_was_expected_to_be_a_membe = makeString( "~S: ~S was expected to be a member of the enumeration ~S." );
    $sym92$VALUE1 = makeSymbol( "VALUE1" );
    $list93 = ConsesLow.list( makeSymbol( "VALUE2" ) );
    $sym94$VALUE2 = makeSymbol( "VALUE2" );
    $sym95$CDOLIST = makeSymbol( "CDOLIST" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( EQ, makeSymbol( "VALUE" ), makeSymbol( "VALUE1" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "CNOT" ), ConsesLow.list( EQ, makeSymbol( "VALUE" ), makeSymbol( "VALUE2" ) ) ) ) ), ConsesLow.list( ConsesLow.list( EQ, makeSymbol( "VALUE" ), makeSymbol( "VALUE2" ) ), ConsesLow.list( makeSymbol( "RET" ),
            NIL ) ) ) );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str98$Provides_a_GREATERP_predicate_for = makeString( "Provides a GREATERP predicate for members of the ~S enumeration." );
    $str99$_S_GREATER_P = makeString( "~S-GREATER-P" );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( EQ, makeSymbol( "VALUE" ), makeSymbol( "VALUE2" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "CNOT" ), ConsesLow.list( EQ, makeSymbol( "VALUE" ), makeSymbol( "VALUE1" ) ) ) ) ), ConsesLow.list( ConsesLow.list( EQ, makeSymbol( "VALUE" ), makeSymbol( "VALUE1" ) ), ConsesLow.list( makeSymbol( "RET" ),
            NIL ) ) ) );
    $sym101$PROGN = makeSymbol( "PROGN" );
    $sym102$ENUMERATIONS_INCORPORATE_DEFINITION = makeSymbol( "ENUMERATIONS-INCORPORATE-DEFINITION" );
    $list103 = ConsesLow.list( makeSymbol( "ENUM-NAME" ), makeSymbol( "VALUES" ) );
    $str104$ENUMERATE_VALUES___S_is_not_a_val = makeString( "ENUMERATE-VALUES: ~S is not a valid enumeration name.  A non nil symbol was expected." );
    $str105$ENUMERATION_MEMBER_P___S_is_not_a = makeString( "ENUMERATION-MEMBER-P: ~S is not a valid enumeration name.  A non nil symbol was expected." );
    $str106$ENUMERATION_MEMBER_P___S_is_not_k = makeString( "ENUMERATION-MEMBER-P: ~S is not known to be an enumeration." );
    $str107$ENCODE_ENUMERATION___S_is_not_a_v = makeString( "ENCODE-ENUMERATION: ~S is not a valid enumeration name.  A non nil symbol was expected." );
    $str108$ENCODE_ENUMERATION___S_is_not_kno = makeString( "ENCODE-ENUMERATION: ~S is not known to be an enumeration." );
    $str109$ENCODE_ENUMERATION___S_has_no_mem = makeString( "ENCODE-ENUMERATION: ~S has no member values." );
    $str110$ENCODE_ENUMERATION___S_is_not_a_m = makeString( "ENCODE-ENUMERATION: ~S is not a member of the ~S enumeration." );
    $str111$DECODE_ENUMERATION___S_is_not_a_v = makeString( "DECODE-ENUMERATION: ~S is not a valid enumeration name.  A non nil symbol was expected." );
    $str112$DECODE_ENUMERATION___S_is_not_kno = makeString( "DECODE-ENUMERATION: ~S is not known to be an enumeration." );
    $str113$DECODE_ENUMERATION___S_has_no_mem = makeString( "DECODE-ENUMERATION: ~S has no member values." );
    $str114$DECODE_ENUMERATION___S_is_not_a_v = makeString( "DECODE-ENUMERATION: ~S is not a valid encoding for enumeration ~S." );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ENUMERATION-NAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $sym116$ENUMERATIONS_RETRIEVE_ENUMERATION = makeSymbol( "ENUMERATIONS-RETRIEVE-ENUMERATION" );
    $str117$DO_ENUMERATION___S_does_not_evalu = makeString( "DO-ENUMERATION: ~S does not evaluate to an enumeration." );
    $str118$ENUMERATION_LESS_P___S_is_not_a_v = makeString( "ENUMERATION-LESS-P: ~S is not a valid enumeration name.  A non nil symbol was expected." );
    $str119$ENUMERATION_LESS_P___S_is_not_kno = makeString( "ENUMERATION-LESS-P: ~S is not known to be an enumeration." );
    $str120$ENUMERATION_LESS_P___S_has_no_val = makeString( "ENUMERATION-LESS-P: ~S has no values." );
    $str121$ENUMERATION_GREATER_P___S_is_not_ = makeString( "ENUMERATION-GREATER-P: ~S is not a valid enumeration name.  A non nil symbol was expected." );
    $str122$ENUMERATION_GREATER_P___S_is_not_ = makeString( "ENUMERATION-GREATER-P: ~S is not known to be an enumeration." );
    $str123$ENUMERATION_GREATER_P___S_has_no_ = makeString( "ENUMERATION-GREATER-P: ~S has no values." );
  }

  public static final class $enumeration_native
      extends
        SubLStructNative
  {
    public SubLObject $type_name;
    public SubLObject $cardinality;
    public SubLObject $values_vector;
    private static final SubLStructDeclNative structDecl;

    public $enumeration_native()
    {
      this.$type_name = CommonSymbols.NIL;
      this.$cardinality = CommonSymbols.NIL;
      this.$values_vector = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $enumeration_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$cardinality;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$values_vector;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$cardinality = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$values_vector = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $enumeration_native.class, $sym6$ENUMERATION, $sym7$ENUMERATION_P, $list8, $list9, new String[] { "$type_name", "$cardinality", "$values_vector"
      }, $list10, $list11, $sym12$PRINT_ENUMERATION );
    }
  }

  public static final class $enumeration_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $enumeration_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ENUMERATION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return enumeration_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 280 ms
 * 
 */