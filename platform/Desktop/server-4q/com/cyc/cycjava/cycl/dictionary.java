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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class dictionary
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.dictionary";
  public static final String myFingerPrint = "94f63653917ec9fe5df80a0a4abb09c06504c992fc3d6287c737293d62df11c8";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1952L)
  private static SubLSymbol $dictionary_high_water_mark$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2251L)
  private static SubLSymbol $dictionary_low_water_mark$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLSymbol $dtp_dictionary$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16616L)
  private static SubLSymbol $cfasl_opcode_dictionary$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19008L)
  private static SubLSymbol $cfasl_opcode_legacy_dictionary$;
  private static final SubLSymbol $sym0$DICTIONARY;
  private static final SubLSymbol $sym1$DICTIONARY_P;
  private static final SubLInteger $int2$133;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_DICTIONARY;
  private static final SubLSymbol $sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$DICTIONARY_DATABASE;
  private static final SubLSymbol $sym11$_CSETF_DICTIONARY_DATABASE;
  private static final SubLSymbol $sym12$DICTIONARY_TEST;
  private static final SubLSymbol $sym13$_CSETF_DICTIONARY_TEST;
  private static final SubLSymbol $kw14$DATABASE;
  private static final SubLSymbol $kw15$TEST;
  private static final SubLString $str16$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw17$BEGIN;
  private static final SubLSymbol $sym18$MAKE_DICTIONARY;
  private static final SubLSymbol $kw19$SLOT;
  private static final SubLSymbol $kw20$END;
  private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD;
  private static final SubLString $str22$_;
  private static final SubLString $str23$_;
  private static final SubLString $str24$_;
  private static final SubLString $str25$_size_;
  private static final SubLList $list26;
  private static final SubLSymbol $kw27$ALIST;
  private static final SubLSymbol $kw28$HASHTABLE;
  private static final SubLSymbol $kw29$UNKNOWN;
  private static final SubLString $str30$Corrupted_dictionary__unsupported;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$VALID_HASH_TEST_P;
  private static final SubLSymbol $sym34$INTEGERP;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$DO_DICTIONARY_CONTENTS;
  private static final SubLSymbol $sym37$DICTIONARY_CONTENTS;
  private static final SubLSymbol $kw38$DONE;
  private static final SubLSymbol $sym39$DO_DICTIONARY;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw43$PROGRESS_NOTE;
  private static final SubLString $str44$Mapping_dictionary___;
  private static final SubLSymbol $sym45$SO_FAR;
  private static final SubLSymbol $sym46$TOTAL;
  private static final SubLSymbol $sym47$CLET;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$DICTIONARY_LENGTH;
  private static final SubLSymbol $sym50$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym51$CINC;
  private static final SubLSymbol $sym52$NOTE_PERCENT_PROGRESS;
  private static final SubLSymbol $sym53$FUNCTION_SPEC_P;
  private static final SubLInteger $int54$61;
  private static final SubLSymbol $sym55$CFASL_INPUT_DICTIONARY;
  private static final SubLSymbol $sym56$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD;
  private static final SubLInteger $int57$64;
  private static final SubLSymbol $sym58$CFASL_INPUT_LEGACY_DICTIONARY;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject dictionary_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_dictionary( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject dictionary_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $dictionary_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject dictionary_database(final SubLObject v_object)
  {
    assert NIL != dictionary_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject dictionary_test(final SubLObject v_object)
  {
    assert NIL != dictionary_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject _csetf_dictionary_database(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != dictionary_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject _csetf_dictionary_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != dictionary_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject make_dictionary(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $dictionary_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw14$DATABASE ) )
      {
        _csetf_dictionary_database( v_new, current_value );
      }
      else if( pcase_var.eql( $kw15$TEST ) )
      {
        _csetf_dictionary_test( v_new, current_value );
      }
      else
      {
        Errors.error( $str16$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject visit_defstruct_dictionary(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw17$BEGIN, $sym18$MAKE_DICTIONARY, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw19$SLOT, $kw14$DATABASE, dictionary_database( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$SLOT, $kw15$TEST, dictionary_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw20$END, $sym18$MAKE_DICTIONARY, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2559L)
  public static SubLObject visit_defstruct_object_dictionary_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_dictionary( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2818L)
  public static SubLObject print_dictionary(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      streams_high.write_string( $str22$_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( hash_table_utilities.hash_test_to_symbol( dictionary_test( v_object ) ), stream );
      streams_high.write_string( $str23$_, stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( Symbols.symbol_name( dictionary_style( v_object ) ), stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( $str24$_, stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( $str25$_size_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( dictionary_length( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3487L)
  public static SubLObject dictionary_database_style(final SubLObject dictionary_database)
  {
    if( dictionary_database.isList() )
    {
      return $kw27$ALIST;
    }
    if( dictionary_database.isHashtable() )
    {
      return $kw28$HASHTABLE;
    }
    return $kw29$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3824L)
  public static SubLObject dictionary_style(final SubLObject v_dictionary)
  {
    return dictionary_database_style( dictionary_database( v_dictionary ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4094L)
  public static SubLObject dictionary_style_error(final SubLObject v_dictionary)
  {
    return Errors.error( $str30$Corrupted_dictionary__unsupported, dictionary_style( v_dictionary ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4601L)
  public static SubLObject dictionary_empty_alist_style(final SubLObject v_dictionary, final SubLObject alist)
  {
    return Types.sublisp_null( alist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4710L)
  public static SubLObject dictionary_size_alist_style(final SubLObject v_dictionary, final SubLObject alist)
  {
    return Sequences.length( alist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4820L)
  public static SubLObject dictionary_lookup_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found)
  {
    final SubLObject test = dictionary_test( v_dictionary );
    return list_utilities.alist_lookup( alist, key, test, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4998L)
  public static SubLObject dictionary_lookup_without_values_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found)
  {
    final SubLObject test = dictionary_test( v_dictionary );
    return list_utilities.alist_lookup_without_values( alist, key, test, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5252L)
  public static SubLObject dictionary_enter_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test = dictionary_test( v_dictionary );
    thread.resetMultipleValues();
    final SubLObject new_alist = list_utilities.alist_enter( alist, key, value, test );
    final SubLObject replacement_p = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == replacement_p )
    {
      _csetf_dictionary_database( v_dictionary, new_alist );
      if( dictionary_length( v_dictionary ).numG( $dictionary_high_water_mark$.getGlobalValue() ) )
      {
        make_hashtable_dictionary_from_alist( v_dictionary, new_alist );
      }
    }
    return key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5719L)
  public static SubLObject dictionary_remove_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test = dictionary_test( v_dictionary );
    thread.resetMultipleValues();
    final SubLObject new_alist = list_utilities.alist_delete( alist, key, test );
    final SubLObject removed_p = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != removed_p )
    {
      _csetf_dictionary_database( v_dictionary, new_alist );
    }
    return key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6005L)
  public static SubLObject dictionary_optimize_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject predicate)
  {
    final SubLObject new_database = list_utilities.alist_optimize( alist, predicate );
    _csetf_dictionary_database( v_dictionary, new_database );
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6220L)
  public static SubLObject make_hashtable_dictionary_from_alist(final SubLObject v_dictionary, final SubLObject old_database)
  {
    final SubLObject test = dictionary_test( v_dictionary );
    final SubLObject new_database = list_utilities.alist_to_hash_table( old_database, test );
    _csetf_dictionary_database( v_dictionary, new_database );
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6872L)
  public static SubLObject dictionary_empty_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable)
  {
    return hash_table_utilities.hash_table_empty_p( hashtable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7007L)
  public static SubLObject dictionary_size_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable)
  {
    return Hashtables.hash_table_count( hashtable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7139L)
  public static SubLObject dictionary_lookup_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found)
  {
    return Hashtables.gethash( key, table, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7284L)
  public static SubLObject dictionary_lookup_without_values_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found)
  {
    return Hashtables.gethash_without_values( key, table, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7459L)
  public static SubLObject dictionary_enter_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject value)
  {
    Hashtables.sethash( key, table, value );
    return key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7609L)
  public static SubLObject dictionary_remove_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key)
  {
    final SubLObject removed_p = Hashtables.remhash( key, table );
    if( NIL != removed_p && dictionary_length( v_dictionary ).numL( $dictionary_low_water_mark$.getGlobalValue() ) )
    {
      make_alist_dictionary_from_hashtable( v_dictionary, table );
    }
    return key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7925L)
  public static SubLObject dictionary_optimize_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject predicate)
  {
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8054L)
  public static SubLObject make_alist_dictionary_from_hashtable(final SubLObject v_dictionary, final SubLObject old_database)
  {
    final SubLObject new_database = hash_table_utilities.hash_table_to_alist( old_database );
    _csetf_dictionary_database( v_dictionary, new_database );
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8273L)
  public static SubLObject new_dictionary(SubLObject test, SubLObject size)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( size == UNPROVIDED )
    {
      size = ZERO_INTEGER;
    }
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    assert NIL != Types.integerp( size ) : size;
    if( test.isSymbol() )
    {
      test = Symbols.symbol_function( test );
    }
    final SubLObject v_dictionary = make_dictionary( UNPROVIDED );
    clear_dictionary( v_dictionary );
    _csetf_dictionary_test( v_dictionary, test );
    if( size.numG( $dictionary_high_water_mark$.getGlobalValue() ) )
    {
      _csetf_dictionary_database( v_dictionary, Hashtables.make_hash_table( size, test, UNPROVIDED ) );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9155L)
  public static SubLObject clear_dictionary(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    _csetf_dictionary_database( v_dictionary, NIL );
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9391L)
  public static SubLObject dictionary_length(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return dictionary_size_alist_style( v_dictionary, database );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return dictionary_size_hashtable_style( v_dictionary, database );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10088L)
  public static SubLObject dictionary_empty_p(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return dictionary_empty_alist_style( v_dictionary, database );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return dictionary_empty_hashtable_style( v_dictionary, database );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10539L)
  public static SubLObject non_empty_dictionary_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != dictionary_p( v_object ) && NIL == dictionary_empty_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10725L)
  public static SubLObject dictionary_lookup(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found)
  {
    if( not_found == UNPROVIDED )
    {
      not_found = NIL;
    }
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return dictionary_lookup_alist_style( v_dictionary, database, key, not_found );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return dictionary_lookup_hashtable_style( v_dictionary, database, key, not_found );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11382L)
  public static SubLObject dictionary_lookup_without_values(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found)
  {
    if( not_found == UNPROVIDED )
    {
      not_found = NIL;
    }
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return dictionary_lookup_without_values_alist_style( v_dictionary, database, key, not_found );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return dictionary_lookup_without_values_hashtable_style( v_dictionary, database, key, not_found );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12059L)
  public static SubLObject dictionary_enter(final SubLObject v_dictionary, final SubLObject key, final SubLObject value)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return dictionary_enter_alist_style( v_dictionary, database, key, value );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return dictionary_enter_hashtable_style( v_dictionary, database, key, value );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12607L)
  public static SubLObject dictionary_remove(final SubLObject v_dictionary, final SubLObject key)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return dictionary_remove_alist_style( v_dictionary, database, key );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return dictionary_remove_hashtable_style( v_dictionary, database, key );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13110L)
  public static SubLObject dictionary_optimize(final SubLObject v_dictionary, final SubLObject predicate)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return dictionary_optimize_alist_style( v_dictionary, database, predicate );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return dictionary_optimize_hashtable_style( v_dictionary, database, predicate );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13777L)
  public static SubLObject new_dictionary_iterator(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return iteration.new_alist_iterator( database );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return iteration.new_hash_table_iterator( database );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14294L)
  public static SubLObject do_dictionary(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject v_dictionary = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    v_dictionary = current.first();
    current = current.rest();
    final SubLObject done = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list35 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym36$DO_DICTIONARY_CONTENTS, ConsesLow.list( key, value, ConsesLow.list( $sym37$DICTIONARY_CONTENTS, v_dictionary ), $kw38$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14870L)
  public static SubLObject dictionary_contents(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    return dictionary_database( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15111L)
  public static SubLObject do_dictionary_progress(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject v_dictionary = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    v_dictionary = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list40 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list40 );
      if( NIL == conses_high.member( current_$1, $list41, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw42$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw38$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_note_tail = cdestructuring_bind.property_list_member( $kw43$PROGRESS_NOTE, current );
    final SubLObject progress_note = ( NIL != progress_note_tail ) ? conses_high.cadr( progress_note_tail ) : $str44$Mapping_dictionary___;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject so_far = $sym45$SO_FAR;
    final SubLObject total = $sym46$TOTAL;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( reader.bq_cons( so_far, $list48 ), ConsesLow.list( total, ConsesLow.list( $sym49$DICTIONARY_LENGTH, v_dictionary ) ) ), ConsesLow.list(
        $sym50$NOTING_PERCENT_PROGRESS, progress_note, ConsesLow.listS( $sym39$DO_DICTIONARY, ConsesLow.list( key, value, v_dictionary, done ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym51$CINC,
            so_far ), ConsesLow.list( $sym52$NOTE_PERCENT_PROGRESS, so_far, total ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15820L)
  public static SubLObject mapdictionary(final SubLObject v_dictionary, final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    assert NIL != Types.function_spec_p( function ) : function;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary_contents( v_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      Functions.funcall( function, key, value );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16181L)
  public static SubLObject mapdictionary_parameterized(final SubLObject v_dictionary, final SubLObject function, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    assert NIL != Types.function_spec_p( function ) : function;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary_contents( v_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      Functions.funcall( function, key, value, args );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16744L)
  public static SubLObject cfasl_output_object_dictionary_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_dictionary( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16869L)
  public static SubLObject cfasl_output_dictionary(final SubLObject v_object, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_dictionary$.getGlobalValue(), stream );
    final SubLObject test = hash_table_utilities.hash_test_to_symbol( dictionary_test( v_object ) );
    final SubLObject size = dictionary_length( v_object );
    cfasl.cfasl_output( test, stream );
    cfasl.cfasl_output( size, stream );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary_contents( v_object ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      cfasl.cfasl_output( key, stream );
      cfasl.cfasl_output( value, stream );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17270L)
  public static SubLObject cfasl_input_dictionary(final SubLObject stream)
  {
    SubLObject test = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject size = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject v_dictionary = NIL;
    SubLObject pcase_var = test;
    if( pcase_var.eql( EQ ) || pcase_var.eql( EQL ) || pcase_var.eql( EQUAL ) || pcase_var.eql( EQUALP ) )
    {
      test = Symbols.symbol_function( test );
    }
    v_dictionary = new_dictionary( test, size );
    pcase_var = dictionary_style( v_dictionary );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      cfasl_input_dictionary_content_alist_style( v_dictionary, size, stream );
    }
    else if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      cfasl_input_dictionary_content_hashtable_style( v_dictionary, size, stream );
    }
    else
    {
      cfasl_input_dictionary_content_logically( v_dictionary, size, stream );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18067L)
  public static SubLObject cfasl_input_dictionary_content_alist_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream)
  {
    SubLObject database = NIL;
    database = ConsesLow.make_list( size, NIL );
    SubLObject cons;
    SubLObject key;
    SubLObject value;
    SubLObject association;
    for( cons = NIL, cons = database; !cons.isAtom(); cons = cons.rest() )
    {
      key = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      value = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      association = NIL;
      association = ConsesLow.cons( key, value );
      ConsesLow.rplaca( cons, association );
    }
    _csetf_dictionary_database( v_dictionary, database );
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18591L)
  public static SubLObject cfasl_input_dictionary_content_hashtable_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream)
  {
    return cfasl_input_dictionary_content_logically( v_dictionary, size, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18755L)
  public static SubLObject cfasl_input_dictionary_content_logically(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream)
  {
    SubLObject i;
    SubLObject key;
    SubLObject value;
    for( i = NIL, i = ZERO_INTEGER; i.numL( size ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      key = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      value = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      dictionary_enter( v_dictionary, key, value );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19167L)
  public static SubLObject cfasl_input_legacy_dictionary(final SubLObject stream)
  {
    SubLObject v_dictionary = NIL;
    v_dictionary = new_dictionary( UNPROVIDED, UNPROVIDED );
    cfasl.cfasl_input_object( stream );
    _csetf_dictionary_database( v_dictionary, cfasl.cfasl_input_object( stream ) );
    _csetf_dictionary_test( v_dictionary, Symbols.symbol_function( cfasl.cfasl_input_object( stream ) ) );
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19609L)
  public static SubLObject dictionary_keys(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return list_utilities.alist_keys( database );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return hash_table_utilities.hash_table_keys( database );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20357L)
  public static SubLObject dictionary_values(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return list_utilities.alist_values( database );
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      return hash_table_utilities.hash_table_values( database );
    }
    return dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20816L)
  public static SubLObject dictionary_rebuild(final SubLObject v_dictionary)
  {
    assert NIL != dictionary_p( v_dictionary ) : v_dictionary;
    final SubLObject database = dictionary_database( v_dictionary );
    final SubLObject pcase_var = dictionary_database_style( database );
    if( pcase_var.eql( $kw27$ALIST ) )
    {
      return v_dictionary;
    }
    if( pcase_var.eql( $kw28$HASHTABLE ) )
    {
      hash_table_utilities.rehash( database );
      return v_dictionary;
    }
    return dictionary_style_error( v_dictionary );
  }

  public static SubLObject declare_dictionary_file()
  {
    SubLFiles.declareFunction( me, "dictionary_print_function_trampoline", "DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "dictionary_p", "DICTIONARY-P", 1, 0, false );
    new $dictionary_p$UnaryFunction();
    SubLFiles.declareFunction( me, "dictionary_database", "DICTIONARY-DATABASE", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_test", "DICTIONARY-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dictionary_database", "_CSETF-DICTIONARY-DATABASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dictionary_test", "_CSETF-DICTIONARY-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_dictionary", "MAKE-DICTIONARY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_dictionary", "VISIT-DEFSTRUCT-DICTIONARY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_dictionary_method", "VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_dictionary", "PRINT-DICTIONARY", 3, 0, false );
    SubLFiles.declareFunction( me, "dictionary_database_style", "DICTIONARY-DATABASE-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_style", "DICTIONARY-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_style_error", "DICTIONARY-STYLE-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_empty_alist_style", "DICTIONARY-EMPTY-ALIST-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "dictionary_size_alist_style", "DICTIONARY-SIZE-ALIST-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "dictionary_lookup_alist_style", "DICTIONARY-LOOKUP-ALIST-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "dictionary_lookup_without_values_alist_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "dictionary_enter_alist_style", "DICTIONARY-ENTER-ALIST-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "dictionary_remove_alist_style", "DICTIONARY-REMOVE-ALIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "dictionary_optimize_alist_style", "DICTIONARY-OPTIMIZE-ALIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_hashtable_dictionary_from_alist", "MAKE-HASHTABLE-DICTIONARY-FROM-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "dictionary_empty_hashtable_style", "DICTIONARY-EMPTY-HASHTABLE-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "dictionary_size_hashtable_style", "DICTIONARY-SIZE-HASHTABLE-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "dictionary_lookup_hashtable_style", "DICTIONARY-LOOKUP-HASHTABLE-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "dictionary_lookup_without_values_hashtable_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "dictionary_enter_hashtable_style", "DICTIONARY-ENTER-HASHTABLE-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "dictionary_remove_hashtable_style", "DICTIONARY-REMOVE-HASHTABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "dictionary_optimize_hashtable_style", "DICTIONARY-OPTIMIZE-HASHTABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_alist_dictionary_from_hashtable", "MAKE-ALIST-DICTIONARY-FROM-HASHTABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_dictionary", "NEW-DICTIONARY", 0, 2, false );
    SubLFiles.declareFunction( me, "clear_dictionary", "CLEAR-DICTIONARY", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_length", "DICTIONARY-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_empty_p", "DICTIONARY-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_dictionary_p", "NON-EMPTY-DICTIONARY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_lookup", "DICTIONARY-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "dictionary_lookup_without_values", "DICTIONARY-LOOKUP-WITHOUT-VALUES", 2, 1, false );
    SubLFiles.declareFunction( me, "dictionary_enter", "DICTIONARY-ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "dictionary_remove", "DICTIONARY-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "dictionary_optimize", "DICTIONARY-OPTIMIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_dictionary_iterator", "NEW-DICTIONARY-ITERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_dictionary", "DO-DICTIONARY" );
    SubLFiles.declareFunction( me, "dictionary_contents", "DICTIONARY-CONTENTS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_dictionary_progress", "DO-DICTIONARY-PROGRESS" );
    SubLFiles.declareFunction( me, "mapdictionary", "MAPDICTIONARY", 2, 0, false );
    SubLFiles.declareFunction( me, "mapdictionary_parameterized", "MAPDICTIONARY-PARAMETERIZED", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_dictionary_method", "CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_dictionary", "CFASL-OUTPUT-DICTIONARY", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_dictionary", "CFASL-INPUT-DICTIONARY", 1, 0, false );
    new $cfasl_input_dictionary$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_dictionary_content_alist_style", "CFASL-INPUT-DICTIONARY-CONTENT-ALIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_dictionary_content_hashtable_style", "CFASL-INPUT-DICTIONARY-CONTENT-HASHTABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_dictionary_content_logically", "CFASL-INPUT-DICTIONARY-CONTENT-LOGICALLY", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_legacy_dictionary", "CFASL-INPUT-LEGACY-DICTIONARY", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_keys", "DICTIONARY-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_values", "DICTIONARY-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "dictionary_rebuild", "DICTIONARY-REBUILD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_dictionary_file()
  {
    $dictionary_high_water_mark$ = SubLFiles.deflexical( "*DICTIONARY-HIGH-WATER-MARK*", TWELVE_INTEGER );
    $dictionary_low_water_mark$ = SubLFiles.deflexical( "*DICTIONARY-LOW-WATER-MARK*", EIGHT_INTEGER );
    $dtp_dictionary$ = SubLFiles.defconstant( "*DTP-DICTIONARY*", $sym0$DICTIONARY );
    $cfasl_opcode_dictionary$ = SubLFiles.defconstant( "*CFASL-OPCODE-DICTIONARY*", $int54$61 );
    $cfasl_opcode_legacy_dictionary$ = SubLFiles.defconstant( "*CFASL-OPCODE-LEGACY-DICTIONARY*", $int57$64 );
    return NIL;
  }

  public static SubLObject setup_dictionary_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), Symbols.symbol_function( $sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$DICTIONARY_DATABASE, $sym11$_CSETF_DICTIONARY_DATABASE );
    Structures.def_csetf( $sym12$DICTIONARY_TEST, $sym13$_CSETF_DICTIONARY_TEST );
    Equality.identity( $sym0$DICTIONARY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), Symbols.symbol_function( $sym21$VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list26 );
    SubLSpecialOperatorDeclarations.proclaim( $list31 );
    SubLSpecialOperatorDeclarations.proclaim( $list32 );
    access_macros.register_macro_helper( $sym37$DICTIONARY_CONTENTS, $sym39$DO_DICTIONARY );
    cfasl.register_cfasl_input_function( $cfasl_opcode_dictionary$.getGlobalValue(), $sym55$CFASL_INPUT_DICTIONARY );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), Symbols.symbol_function( $sym56$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_legacy_dictionary$.getGlobalValue(), $sym58$CFASL_INPUT_LEGACY_DICTIONARY );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_dictionary_file();
  }

  @Override
  public void initializeVariables()
  {
    init_dictionary_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_dictionary_file();
  }
  static
  {
    me = new dictionary();
    $dictionary_high_water_mark$ = null;
    $dictionary_low_water_mark$ = null;
    $dtp_dictionary$ = null;
    $cfasl_opcode_dictionary$ = null;
    $cfasl_opcode_legacy_dictionary$ = null;
    $sym0$DICTIONARY = makeSymbol( "DICTIONARY" );
    $sym1$DICTIONARY_P = makeSymbol( "DICTIONARY-P" );
    $int2$133 = makeInteger( 133 );
    $list3 = ConsesLow.list( makeSymbol( "DATABASE" ), makeSymbol( "TEST" ) );
    $list4 = ConsesLow.list( makeKeyword( "DATABASE" ), makeKeyword( "TEST" ) );
    $list5 = ConsesLow.list( makeSymbol( "DICTIONARY-DATABASE" ), makeSymbol( "DICTIONARY-TEST" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-DICTIONARY-DATABASE" ), makeSymbol( "_CSETF-DICTIONARY-TEST" ) );
    $sym7$PRINT_DICTIONARY = makeSymbol( "PRINT-DICTIONARY" );
    $sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "DICTIONARY-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "DICTIONARY-P" ) );
    $sym10$DICTIONARY_DATABASE = makeSymbol( "DICTIONARY-DATABASE" );
    $sym11$_CSETF_DICTIONARY_DATABASE = makeSymbol( "_CSETF-DICTIONARY-DATABASE" );
    $sym12$DICTIONARY_TEST = makeSymbol( "DICTIONARY-TEST" );
    $sym13$_CSETF_DICTIONARY_TEST = makeSymbol( "_CSETF-DICTIONARY-TEST" );
    $kw14$DATABASE = makeKeyword( "DATABASE" );
    $kw15$TEST = makeKeyword( "TEST" );
    $str16$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw17$BEGIN = makeKeyword( "BEGIN" );
    $sym18$MAKE_DICTIONARY = makeSymbol( "MAKE-DICTIONARY" );
    $kw19$SLOT = makeKeyword( "SLOT" );
    $kw20$END = makeKeyword( "END" );
    $sym21$VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD" );
    $str22$_ = makeString( "(" );
    $str23$_ = makeString( " " );
    $str24$_ = makeString( ")" );
    $str25$_size_ = makeString( " size=" );
    $list26 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "DICTIONARY-DATABASE-STYLE" ), makeSymbol( "DICTIONARY-STYLE" ), makeSymbol( "DICTIONARY-STYLE-ERROR" ) );
    $kw27$ALIST = makeKeyword( "ALIST" );
    $kw28$HASHTABLE = makeKeyword( "HASHTABLE" );
    $kw29$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str30$Corrupted_dictionary__unsupported = makeString( "Corrupted dictionary; unsupported style ~S.~%" );
    $list31 = ConsesLow.list( new SubLObject[] { makeSymbol( "INLINE" ), makeSymbol( "DICTIONARY-EMPTY-ALIST-STYLE" ), makeSymbol( "DICTIONARY-SIZE-ALIST-STYLE" ), makeSymbol( "DICTIONARY-LOOKUP-ALIST-STYLE" ),
      makeSymbol( "DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE" ), makeSymbol( "DICTIONARY-ENTER-ALIST-STYLE" ), makeSymbol( "DICTIONARY-REMOVE-ALIST-STYLE" ), makeSymbol( "DICTIONARY-OPTIMIZE-ALIST-STYLE" ),
      makeSymbol( "MAKE-HASHTABLE-DICTIONARY-FROM-ALIST" )
    } );
    $list32 = ConsesLow.list( new SubLObject[] { makeSymbol( "INLINE" ), makeSymbol( "DICTIONARY-EMPTY-HASHTABLE-STYLE" ), makeSymbol( "DICTIONARY-SIZE-HASHTABLE-STYLE" ), makeSymbol(
        "DICTIONARY-LOOKUP-HASHTABLE-STYLE" ), makeSymbol( "DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE" ), makeSymbol( "DICTIONARY-ENTER-HASHTABLE-STYLE" ), makeSymbol( "DICTIONARY-REMOVE-HASHTABLE-STYLE" ),
      makeSymbol( "DICTIONARY-OPTIMIZE-HASHTABLE-STYLE" ), makeSymbol( "MAKE-ALIST-DICTIONARY-FROM-HASHTABLE" )
    } );
    $sym33$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $sym34$INTEGERP = makeSymbol( "INTEGERP" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "DICTIONARY" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$DO_DICTIONARY_CONTENTS = makeSymbol( "DO-DICTIONARY-CONTENTS" );
    $sym37$DICTIONARY_CONTENTS = makeSymbol( "DICTIONARY-CONTENTS" );
    $kw38$DONE = makeKeyword( "DONE" );
    $sym39$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "DICTIONARY" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), ConsesLow.list( makeSymbol( "PROGRESS-NOTE" ), makeString(
        "Mapping .." ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list41 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "PROGRESS-NOTE" ) );
    $kw42$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw43$PROGRESS_NOTE = makeKeyword( "PROGRESS-NOTE" );
    $str44$Mapping_dictionary___ = makeString( "Mapping .." );
    $sym45$SO_FAR = makeUninternedSymbol( "SO-FAR" );
    $sym46$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym47$CLET = makeSymbol( "CLET" );
    $list48 = ConsesLow.list( ZERO_INTEGER );
    $sym49$DICTIONARY_LENGTH = makeSymbol( "DICTIONARY-LENGTH" );
    $sym50$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym51$CINC = makeSymbol( "CINC" );
    $sym52$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym53$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $int54$61 = makeInteger( 61 );
    $sym55$CFASL_INPUT_DICTIONARY = makeSymbol( "CFASL-INPUT-DICTIONARY" );
    $sym56$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD" );
    $int57$64 = makeInteger( 64 );
    $sym58$CFASL_INPUT_LEGACY_DICTIONARY = makeSymbol( "CFASL-INPUT-LEGACY-DICTIONARY" );
  }

  public static final class $dictionary_native
      extends
        SubLStructNative
  {
    public SubLObject $database;
    public SubLObject $test;
    private static final SubLStructDeclNative structDecl;

    public $dictionary_native()
    {
      this.$database = CommonSymbols.NIL;
      this.$test = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $dictionary_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$database;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$test;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$database = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$test = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $dictionary_native.class, $sym0$DICTIONARY, $sym1$DICTIONARY_P, $list3, $list4, new String[] { "$database", "$test"
      }, $list5, $list6, $sym7$PRINT_DICTIONARY );
    }
  }

  public static final class $dictionary_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $dictionary_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DICTIONARY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return dictionary_p( arg1 );
    }
  }

  public static final class $cfasl_input_dictionary$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_dictionary$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-DICTIONARY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_dictionary( arg1 );
    }
  }
}
/*
 * 
 * Total time: 177 ms
 * 
 */