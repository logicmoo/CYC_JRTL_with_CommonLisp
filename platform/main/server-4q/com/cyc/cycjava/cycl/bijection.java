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
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
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

public final class bijection
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.bijection";
  public static final String myFingerPrint = "632cbf9f999b989008992d9b5d114ddb86ffde9ebe74a664e4abfd7417f92e57";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1927L)
  private static SubLSymbol $bijection_high_water_mark$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1980L)
  private static SubLSymbol $bijection_low_water_mark$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLSymbol $dtp_bijection$;
  private static final SubLInteger $int0$40;
  private static final SubLInteger $int1$30;
  private static final SubLSymbol $sym2$BIJECTION;
  private static final SubLSymbol $sym3$BIJECTION_P;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$BIJECTION_SIZE;
  private static final SubLSymbol $sym12$_CSETF_BIJECTION_SIZE;
  private static final SubLSymbol $sym13$BIJECTION_DATABASE;
  private static final SubLSymbol $sym14$_CSETF_BIJECTION_DATABASE;
  private static final SubLSymbol $sym15$BIJECTION_INVERSE_DATABASE;
  private static final SubLSymbol $sym16$_CSETF_BIJECTION_INVERSE_DATABASE;
  private static final SubLSymbol $sym17$BIJECTION_TEST;
  private static final SubLSymbol $sym18$_CSETF_BIJECTION_TEST;
  private static final SubLSymbol $kw19$SIZE;
  private static final SubLSymbol $kw20$DATABASE;
  private static final SubLSymbol $kw21$INVERSE_DATABASE;
  private static final SubLSymbol $kw22$TEST;
  private static final SubLString $str23$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw24$BEGIN;
  private static final SubLSymbol $sym25$MAKE_BIJECTION;
  private static final SubLSymbol $kw26$SLOT;
  private static final SubLSymbol $kw27$END;
  private static final SubLSymbol $sym28$VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD;
  private static final SubLSymbol $kw29$ALIST;
  private static final SubLSymbol $kw30$HASHTABLE;
  private static final SubLSymbol $kw31$UNKNOWN;
  private static final SubLString $str32$Corrupted_bijection__unsupported_;
  private static final SubLString $str33$Malformed_bijection_;
  private static final SubLSymbol $sym34$VALID_HASH_TEST_P;
  private static final SubLSymbol $sym35$INTEGERP;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw39$DONE;
  private static final SubLSymbol $sym40$BIJECTION_VAR;
  private static final SubLSymbol $sym41$CLET;
  private static final SubLSymbol $sym42$PCASE;
  private static final SubLSymbol $sym43$DO_BIJECTION_STYLE;
  private static final SubLSymbol $sym44$DO_ALIST;
  private static final SubLSymbol $sym45$DO_BIJECTION_DATABASE;
  private static final SubLSymbol $sym46$DO_HASH_TABLE;
  private static final SubLSymbol $sym47$OTHERWISE;
  private static final SubLSymbol $sym48$BIJECTION_STYLE_ERROR;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$BIJECTION_VAR;
  private static final SubLSymbol $sym51$DO_BIJECTION_INVERSE_DATABASE;
  private static final SubLSymbol $sym52$DO_BIJECTION;
  private static final SubLList $list53;
  private static final SubLString $str54$_S______S__;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject bijection_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject bijection_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $bijection_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject bijection_size(final SubLObject v_object)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject bijection_database(final SubLObject v_object)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject bijection_inverse_database(final SubLObject v_object)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject bijection_test(final SubLObject v_object)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject _csetf_bijection_size(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject _csetf_bijection_database(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject _csetf_bijection_inverse_database(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject _csetf_bijection_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != bijection_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject make_bijection(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $bijection_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$SIZE ) )
      {
        _csetf_bijection_size( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$DATABASE ) )
      {
        _csetf_bijection_database( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$INVERSE_DATABASE ) )
      {
        _csetf_bijection_inverse_database( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$TEST ) )
      {
        _csetf_bijection_test( v_new, current_value );
      }
      else
      {
        Errors.error( $str23$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject visit_defstruct_bijection(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw24$BEGIN, $sym25$MAKE_BIJECTION, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw19$SIZE, bijection_size( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw20$DATABASE, bijection_database( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw21$INVERSE_DATABASE, bijection_inverse_database( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw22$TEST, bijection_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$END, $sym25$MAKE_BIJECTION, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2333L)
  public static SubLObject visit_defstruct_object_bijection_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_bijection( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2532L)
  public static SubLObject bijection_style(final SubLObject v_bijection)
  {
    final SubLObject database = bijection_database( v_bijection );
    if( database.isList() )
    {
      return $kw29$ALIST;
    }
    if( database.isHashtable() )
    {
      return $kw30$HASHTABLE;
    }
    return $kw31$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2935L)
  public static SubLObject bijection_style_error(final SubLObject v_bijection)
  {
    return Errors.error( $str32$Corrupted_bijection__unsupported_, bijection_style( v_bijection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3087L)
  public static SubLObject bijection_lookup_alist_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found)
  {
    final SubLObject test = bijection_test( v_bijection );
    final SubLObject alist = bijection_database( v_bijection );
    final SubLObject pair = conses_high.assoc( key, alist, test, UNPROVIDED );
    return ( NIL != pair ) ? Values.values( pair.rest(), T ) : Values.values( not_found, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3417L)
  public static SubLObject bijection_enter_alist_style(final SubLObject v_bijection, final SubLObject key, final SubLObject value)
  {
    final SubLObject test = bijection_test( v_bijection );
    final SubLObject alist = bijection_database( v_bijection );
    final SubLObject key_pair = conses_high.assoc( key, alist, test, UNPROVIDED );
    final SubLObject value_pair = conses_high.rassoc( value, alist, test, UNPROVIDED );
    if( NIL != key_pair && NIL != value_pair )
    {
      if( NIL == Functions.funcall( test, key, value_pair.first() ) || NIL == Functions.funcall( test, key_pair.rest(), value ) )
      {
        ConsesLow.rplacd( key_pair, value );
        _csetf_bijection_database( v_bijection, list_utilities.delete_first( value_pair, alist, UNPROVIDED ) );
      }
    }
    else if( NIL != key_pair )
    {
      ConsesLow.rplacd( key_pair, value );
    }
    else if( NIL != value_pair )
    {
      ConsesLow.rplaca( value_pair, key );
    }
    else
    {
      _csetf_bijection_database( v_bijection, conses_high.acons( key, value, alist ) );
      _csetf_bijection_size( v_bijection, Numbers.add( bijection_size( v_bijection ), ONE_INTEGER ) );
      if( bijection_size( v_bijection ).numG( $bijection_high_water_mark$.getGlobalValue() ) )
      {
        make_hashtable_bijection_from_alist( v_bijection );
      }
    }
    return Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4277L)
  public static SubLObject bijection_remove_alist_style(final SubLObject v_bijection, final SubLObject key)
  {
    final SubLObject test = bijection_test( v_bijection );
    final SubLObject alist = bijection_database( v_bijection );
    final SubLObject key_pair = conses_high.assoc( key, alist, test, UNPROVIDED );
    SubLObject value = NIL;
    if( NIL != key_pair )
    {
      _csetf_bijection_database( v_bijection, list_utilities.delete_first( key_pair, alist, UNPROVIDED ) );
      value = key_pair.rest();
      _csetf_bijection_size( v_bijection, Numbers.subtract( bijection_size( v_bijection ), ONE_INTEGER ) );
    }
    return Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4684L)
  public static SubLObject bijection_inverse_lookup_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found)
  {
    final SubLObject test = bijection_test( v_bijection );
    final SubLObject alist = bijection_database( v_bijection );
    final SubLObject pair = conses_high.rassoc( value, alist, test, UNPROVIDED );
    return ( NIL != pair ) ? Values.values( pair.first(), T ) : Values.values( not_found, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4971L)
  public static SubLObject bijection_inverse_enter_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key)
  {
    return bijection_enter_alist_style( v_bijection, key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5105L)
  public static SubLObject bijection_inverse_remove_alist_style(final SubLObject v_bijection, final SubLObject value)
  {
    final SubLObject test = bijection_test( v_bijection );
    final SubLObject alist = bijection_database( v_bijection );
    final SubLObject value_pair = conses_high.rassoc( value, alist, test, UNPROVIDED );
    SubLObject key = NIL;
    if( NIL != value_pair )
    {
      _csetf_bijection_database( v_bijection, list_utilities.delete_first( value_pair, alist, UNPROVIDED ) );
      key = value_pair.first();
      _csetf_bijection_size( v_bijection, Numbers.subtract( bijection_size( v_bijection ), ONE_INTEGER ) );
    }
    return Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5526L)
  public static SubLObject make_hashtable_bijection_from_alist(final SubLObject v_bijection)
  {
    final SubLObject test = bijection_test( v_bijection );
    final SubLObject old_database = bijection_database( v_bijection );
    final SubLObject new_database = list_utilities.alist_to_hash_table( old_database, test );
    final SubLObject new_inverse = list_utilities.alist_to_reverse_hash_table( old_database, test );
    _csetf_bijection_database( v_bijection, new_database );
    _csetf_bijection_inverse_database( v_bijection, new_inverse );
    return v_bijection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5953L)
  public static SubLObject bijection_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found)
  {
    return Hashtables.gethash( key, bijection_database( v_bijection ), not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6155L)
  public static SubLObject bijection_enter_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject value)
  {
    final SubLObject table = bijection_database( v_bijection );
    final SubLObject inverse = bijection_inverse_database( v_bijection );
    Hashtables.sethash( key, table, value );
    Hashtables.sethash( value, inverse, key );
    _csetf_bijection_size( v_bijection, Hashtables.hash_table_count( table ) );
    return Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6499L)
  public static SubLObject bijection_remove_hashtable_style(final SubLObject v_bijection, final SubLObject key)
  {
    final SubLObject table = bijection_database( v_bijection );
    final SubLObject value = Hashtables.gethash( key, table, UNPROVIDED );
    return ( NIL != value ) ? bijection_remove_hashtable_style_int( v_bijection, key, value ) : Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6760L)
  public static SubLObject bijection_inverse_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found)
  {
    return Hashtables.gethash( value, bijection_inverse_database( v_bijection ), not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6921L)
  public static SubLObject bijection_inverse_enter_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key)
  {
    return bijection_enter_hashtable_style( v_bijection, key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7063L)
  public static SubLObject bijection_inverse_remove_hashtable_style(final SubLObject v_bijection, final SubLObject value)
  {
    final SubLObject inverse = bijection_inverse_database( v_bijection );
    final SubLObject key = Hashtables.gethash( value, inverse, UNPROVIDED );
    return ( NIL != key ) ? bijection_remove_hashtable_style_int( v_bijection, key, value ) : Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7348L)
  public static SubLObject bijection_remove_hashtable_style_int(final SubLObject v_bijection, final SubLObject key, final SubLObject value)
  {
    final SubLObject table = bijection_database( v_bijection );
    final SubLObject inverse = bijection_inverse_database( v_bijection );
    final SubLObject table_removedP = Hashtables.remhash( key, table );
    final SubLObject inverse_removedP = Hashtables.remhash( value, inverse );
    if( NIL != table_removedP && NIL != inverse_removedP )
    {
      _csetf_bijection_size( v_bijection, Hashtables.hash_table_count( table ) );
      if( bijection_size( v_bijection ).numL( $bijection_low_water_mark$.getGlobalValue() ) )
      {
        make_alist_bijection_from_hashtable( v_bijection );
      }
    }
    else if( NIL != table_removedP || NIL != inverse_removedP )
    {
      Errors.error( $str33$Malformed_bijection_ );
    }
    return Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7984L)
  public static SubLObject make_alist_bijection_from_hashtable(final SubLObject v_bijection)
  {
    final SubLObject old_database = bijection_database( v_bijection );
    final SubLObject new_database = hash_table_utilities.hash_table_to_alist( old_database );
    _csetf_bijection_database( v_bijection, new_database );
    _csetf_bijection_inverse_database( v_bijection, NIL );
    return v_bijection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8288L)
  public static SubLObject new_bijection(SubLObject test, SubLObject size)
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
    final SubLObject v_bijection = make_bijection( UNPROVIDED );
    clear_bijection( v_bijection );
    _csetf_bijection_test( v_bijection, test );
    if( size.numG( $bijection_high_water_mark$.getGlobalValue() ) )
    {
      _csetf_bijection_database( v_bijection, Hashtables.make_hash_table( size, test, UNPROVIDED ) );
      _csetf_bijection_inverse_database( v_bijection, Hashtables.make_hash_table( size, test, UNPROVIDED ) );
    }
    return v_bijection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9240L)
  public static SubLObject clear_bijection(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    _csetf_bijection_size( v_bijection, ZERO_INTEGER );
    _csetf_bijection_database( v_bijection, NIL );
    _csetf_bijection_inverse_database( v_bijection, NIL );
    return v_bijection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9563L)
  public static SubLObject bijection_empty_p(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    return Numbers.zerop( bijection_size( v_bijection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9949L)
  public static SubLObject non_empty_bijection_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != bijection_p( v_object ) && NIL == bijection_empty_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10131L)
  public static SubLObject bijection_lookup(final SubLObject v_bijection, final SubLObject key, SubLObject not_found)
  {
    if( not_found == UNPROVIDED )
    {
      not_found = NIL;
    }
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return bijection_lookup_alist_style( v_bijection, key, not_found );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return bijection_lookup_hashtable_style( v_bijection, key, not_found );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10697L)
  public static SubLObject bijection_inverse_lookup(final SubLObject v_bijection, final SubLObject value, SubLObject not_found)
  {
    if( not_found == UNPROVIDED )
    {
      not_found = NIL;
    }
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return bijection_inverse_lookup_alist_style( v_bijection, value, not_found );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return bijection_inverse_lookup_hashtable_style( v_bijection, value, not_found );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11260L)
  public static SubLObject bijection_enter(final SubLObject v_bijection, final SubLObject key, final SubLObject value)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return bijection_enter_alist_style( v_bijection, key, value );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return bijection_enter_hashtable_style( v_bijection, key, value );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11751L)
  public static SubLObject bijection_inverse_enter(final SubLObject v_bijection, final SubLObject value, final SubLObject key)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return bijection_inverse_enter_alist_style( v_bijection, value, key );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return bijection_inverse_enter_hashtable_style( v_bijection, value, key );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12214L)
  public static SubLObject bijection_remove(final SubLObject v_bijection, final SubLObject key)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return bijection_remove_alist_style( v_bijection, key );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return bijection_remove_hashtable_style( v_bijection, key );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12643L)
  public static SubLObject bijection_inverse_remove(final SubLObject v_bijection, final SubLObject value)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return bijection_inverse_remove_alist_style( v_bijection, value );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return bijection_inverse_remove_hashtable_style( v_bijection, value );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13104L)
  public static SubLObject new_bijection_iterator(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject database = bijection_database( v_bijection );
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return iteration.new_alist_iterator( database );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return iteration.new_hash_table_iterator( database );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13614L)
  public static SubLObject do_bijection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject v_bijection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    v_bijection = current.first();
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
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw39$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject bijection_var = $sym40$BIJECTION_VAR;
    return ConsesLow.list( $sym41$CLET, ConsesLow.list( ConsesLow.list( bijection_var, v_bijection ) ), ConsesLow.list( $sym42$PCASE, ConsesLow.list( $sym43$DO_BIJECTION_STYLE, bijection_var ), ConsesLow.list(
        $kw29$ALIST, ConsesLow.listS( $sym44$DO_ALIST, ConsesLow.list( key, value, ConsesLow.list( $sym45$DO_BIJECTION_DATABASE, bijection_var ), $kw39$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
            $kw30$HASHTABLE, ConsesLow.listS( $sym46$DO_HASH_TABLE, ConsesLow.list( key, value, ConsesLow.list( $sym45$DO_BIJECTION_DATABASE, bijection_var ), $kw39$DONE, done ), ConsesLow.append( body, NIL ) ) ),
        ConsesLow.list( $sym47$OTHERWISE, ConsesLow.list( $sym48$BIJECTION_STYLE_ERROR, bijection_var ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14519L)
  public static SubLObject do_bijection_inverse(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject value = NIL;
    SubLObject key = NIL;
    SubLObject v_bijection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    v_bijection = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list49 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list49 );
      if( NIL == conses_high.member( current_$2, $list37, UNPROVIDED, UNPROVIDED ) )
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw39$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject bijection_var = $sym50$BIJECTION_VAR;
    return ConsesLow.list( $sym41$CLET, ConsesLow.list( ConsesLow.list( bijection_var, v_bijection ) ), ConsesLow.list( $sym42$PCASE, ConsesLow.list( $sym43$DO_BIJECTION_STYLE, bijection_var ), ConsesLow.list(
        $kw29$ALIST, ConsesLow.listS( $sym44$DO_ALIST, ConsesLow.list( key, value, ConsesLow.list( $sym45$DO_BIJECTION_DATABASE, bijection_var ), $kw39$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
            $kw30$HASHTABLE, ConsesLow.listS( $sym46$DO_HASH_TABLE, ConsesLow.list( value, key, ConsesLow.list( $sym51$DO_BIJECTION_INVERSE_DATABASE, bijection_var ), $kw39$DONE, done ), ConsesLow.append( body,
                NIL ) ) ), ConsesLow.list( $sym47$OTHERWISE, ConsesLow.list( $sym48$BIJECTION_STYLE_ERROR, bijection_var ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15262L)
  public static SubLObject do_bijection_style(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    return bijection_style( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15427L)
  public static SubLObject do_bijection_database(final SubLObject v_bijection)
  {
    return bijection_database( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15547L)
  public static SubLObject do_bijection_inverse_database(final SubLObject v_bijection)
  {
    return bijection_inverse_database( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15683L)
  public static SubLObject bijection_keys(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return list_utilities.alist_keys( bijection_database( v_bijection ) );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return hash_table_utilities.hash_table_keys( bijection_database( v_bijection ) );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16237L)
  public static SubLObject bijection_values(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return list_utilities.alist_values( bijection_database( v_bijection ) );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return hash_table_utilities.hash_table_keys( bijection_inverse_database( v_bijection ) );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16654L)
  public static SubLObject bijection_to_alist(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      return Values.values( conses_high.copy_tree( bijection_database( v_bijection ) ), bijection_test( v_bijection ) );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return hash_table_utilities.hash_table_to_alist( bijection_database( v_bijection ) );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17023L)
  public static SubLObject bijection_to_hashtable(final SubLObject v_bijection)
  {
    assert NIL != bijection_p( v_bijection ) : v_bijection;
    final SubLObject pcase_var = bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      final SubLObject alist = bijection_database( v_bijection );
      final SubLObject test = bijection_test( v_bijection );
      return Values.values( list_utilities.alist_to_hash_table( alist, test ), list_utilities.alist_to_reverse_hash_table( alist, test ) );
    }
    if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      return Values.values( bijection_database( v_bijection ), bijection_inverse_database( v_bijection ) );
    }
    return bijection_style_error( v_bijection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17520L)
  public static SubLObject print_bijection_contents(final SubLObject v_bijection, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLObject pcase_var = do_bijection_style( v_bijection );
    if( pcase_var.eql( $kw29$ALIST ) )
    {
      SubLObject cdolist_list_var = do_bijection_database( v_bijection );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject key = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
        key = current.first();
        current = ( value = current.rest() );
        PrintLow.format( stream, $str54$_S______S__, key, value );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    else if( pcase_var.eql( $kw30$HASHTABLE ) )
    {
      final SubLObject cdohash_table = do_bijection_database( v_bijection );
      SubLObject key2 = NIL;
      SubLObject value2 = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key2 = Hashtables.getEntryKey( cdohash_entry );
          value2 = Hashtables.getEntryValue( cdohash_entry );
          PrintLow.format( stream, $str54$_S______S__, key2, value2 );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    else
    {
      bijection_style_error( v_bijection );
    }
    return NIL;
  }

  public static SubLObject declare_bijection_file()
  {
    SubLFiles.declareFunction( me, "bijection_print_function_trampoline", "BIJECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "bijection_p", "BIJECTION-P", 1, 0, false );
    new $bijection_p$UnaryFunction();
    SubLFiles.declareFunction( me, "bijection_size", "BIJECTION-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_database", "BIJECTION-DATABASE", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_database", "BIJECTION-INVERSE-DATABASE", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_test", "BIJECTION-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bijection_size", "_CSETF-BIJECTION-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bijection_database", "_CSETF-BIJECTION-DATABASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bijection_inverse_database", "_CSETF-BIJECTION-INVERSE-DATABASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bijection_test", "_CSETF-BIJECTION-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_bijection", "MAKE-BIJECTION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_bijection", "VISIT-DEFSTRUCT-BIJECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_bijection_method", "VISIT-DEFSTRUCT-OBJECT-BIJECTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "bijection_style", "BIJECTION-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_style_error", "BIJECTION-STYLE-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_lookup_alist_style", "BIJECTION-LOOKUP-ALIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_enter_alist_style", "BIJECTION-ENTER-ALIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_remove_alist_style", "BIJECTION-REMOVE-ALIST-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_lookup_alist_style", "BIJECTION-INVERSE-LOOKUP-ALIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_enter_alist_style", "BIJECTION-INVERSE-ENTER-ALIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_remove_alist_style", "BIJECTION-INVERSE-REMOVE-ALIST-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_hashtable_bijection_from_alist", "MAKE-HASHTABLE-BIJECTION-FROM-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_lookup_hashtable_style", "BIJECTION-LOOKUP-HASHTABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_enter_hashtable_style", "BIJECTION-ENTER-HASHTABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_remove_hashtable_style", "BIJECTION-REMOVE-HASHTABLE-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_lookup_hashtable_style", "BIJECTION-INVERSE-LOOKUP-HASHTABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_enter_hashtable_style", "BIJECTION-INVERSE-ENTER-HASHTABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_remove_hashtable_style", "BIJECTION-INVERSE-REMOVE-HASHTABLE-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "bijection_remove_hashtable_style_int", "BIJECTION-REMOVE-HASHTABLE-STYLE-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "make_alist_bijection_from_hashtable", "MAKE-ALIST-BIJECTION-FROM-HASHTABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_bijection", "NEW-BIJECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "clear_bijection", "CLEAR-BIJECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_empty_p", "BIJECTION-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_bijection_p", "NON-EMPTY-BIJECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_lookup", "BIJECTION-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "bijection_inverse_lookup", "BIJECTION-INVERSE-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "bijection_enter", "BIJECTION-ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_enter", "BIJECTION-INVERSE-ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "bijection_remove", "BIJECTION-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "bijection_inverse_remove", "BIJECTION-INVERSE-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_bijection_iterator", "NEW-BIJECTION-ITERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_bijection", "DO-BIJECTION" );
    SubLFiles.declareMacro( me, "do_bijection_inverse", "DO-BIJECTION-INVERSE" );
    SubLFiles.declareFunction( me, "do_bijection_style", "DO-BIJECTION-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "do_bijection_database", "DO-BIJECTION-DATABASE", 1, 0, false );
    SubLFiles.declareFunction( me, "do_bijection_inverse_database", "DO-BIJECTION-INVERSE-DATABASE", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_keys", "BIJECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_values", "BIJECTION-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_to_alist", "BIJECTION-TO-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "bijection_to_hashtable", "BIJECTION-TO-HASHTABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "print_bijection_contents", "PRINT-BIJECTION-CONTENTS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_bijection_file()
  {
    $bijection_high_water_mark$ = SubLFiles.deflexical( "*BIJECTION-HIGH-WATER-MARK*", $int0$40 );
    $bijection_low_water_mark$ = SubLFiles.deflexical( "*BIJECTION-LOW-WATER-MARK*", $int1$30 );
    $dtp_bijection$ = SubLFiles.defconstant( "*DTP-BIJECTION*", $sym2$BIJECTION );
    return NIL;
  }

  public static SubLObject setup_bijection_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_bijection$.getGlobalValue(), Symbols.symbol_function( $sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list10 );
    Structures.def_csetf( $sym11$BIJECTION_SIZE, $sym12$_CSETF_BIJECTION_SIZE );
    Structures.def_csetf( $sym13$BIJECTION_DATABASE, $sym14$_CSETF_BIJECTION_DATABASE );
    Structures.def_csetf( $sym15$BIJECTION_INVERSE_DATABASE, $sym16$_CSETF_BIJECTION_INVERSE_DATABASE );
    Structures.def_csetf( $sym17$BIJECTION_TEST, $sym18$_CSETF_BIJECTION_TEST );
    Equality.identity( $sym2$BIJECTION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_bijection$.getGlobalValue(), Symbols.symbol_function( $sym28$VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD ) );
    access_macros.register_macro_helper( $sym43$DO_BIJECTION_STYLE, $sym52$DO_BIJECTION );
    access_macros.register_macro_helper( $sym45$DO_BIJECTION_DATABASE, $sym52$DO_BIJECTION );
    access_macros.register_macro_helper( $sym51$DO_BIJECTION_INVERSE_DATABASE, $sym52$DO_BIJECTION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_bijection_file();
  }

  @Override
  public void initializeVariables()
  {
    init_bijection_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_bijection_file();
  }
  static
  {
    me = new bijection();
    $bijection_high_water_mark$ = null;
    $bijection_low_water_mark$ = null;
    $dtp_bijection$ = null;
    $int0$40 = makeInteger( 40 );
    $int1$30 = makeInteger( 30 );
    $sym2$BIJECTION = makeSymbol( "BIJECTION" );
    $sym3$BIJECTION_P = makeSymbol( "BIJECTION-P" );
    $list4 = ConsesLow.list( makeSymbol( "SIZE" ), makeSymbol( "DATABASE" ), makeSymbol( "INVERSE-DATABASE" ), makeSymbol( "TEST" ) );
    $list5 = ConsesLow.list( makeKeyword( "SIZE" ), makeKeyword( "DATABASE" ), makeKeyword( "INVERSE-DATABASE" ), makeKeyword( "TEST" ) );
    $list6 = ConsesLow.list( makeSymbol( "BIJECTION-SIZE" ), makeSymbol( "BIJECTION-DATABASE" ), makeSymbol( "BIJECTION-INVERSE-DATABASE" ), makeSymbol( "BIJECTION-TEST" ) );
    $list7 = ConsesLow.list( makeSymbol( "_CSETF-BIJECTION-SIZE" ), makeSymbol( "_CSETF-BIJECTION-DATABASE" ), makeSymbol( "_CSETF-BIJECTION-INVERSE-DATABASE" ), makeSymbol( "_CSETF-BIJECTION-TEST" ) );
    $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "BIJECTION-PRINT-FUNCTION-TRAMPOLINE" );
    $list10 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "BIJECTION-P" ) );
    $sym11$BIJECTION_SIZE = makeSymbol( "BIJECTION-SIZE" );
    $sym12$_CSETF_BIJECTION_SIZE = makeSymbol( "_CSETF-BIJECTION-SIZE" );
    $sym13$BIJECTION_DATABASE = makeSymbol( "BIJECTION-DATABASE" );
    $sym14$_CSETF_BIJECTION_DATABASE = makeSymbol( "_CSETF-BIJECTION-DATABASE" );
    $sym15$BIJECTION_INVERSE_DATABASE = makeSymbol( "BIJECTION-INVERSE-DATABASE" );
    $sym16$_CSETF_BIJECTION_INVERSE_DATABASE = makeSymbol( "_CSETF-BIJECTION-INVERSE-DATABASE" );
    $sym17$BIJECTION_TEST = makeSymbol( "BIJECTION-TEST" );
    $sym18$_CSETF_BIJECTION_TEST = makeSymbol( "_CSETF-BIJECTION-TEST" );
    $kw19$SIZE = makeKeyword( "SIZE" );
    $kw20$DATABASE = makeKeyword( "DATABASE" );
    $kw21$INVERSE_DATABASE = makeKeyword( "INVERSE-DATABASE" );
    $kw22$TEST = makeKeyword( "TEST" );
    $str23$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw24$BEGIN = makeKeyword( "BEGIN" );
    $sym25$MAKE_BIJECTION = makeSymbol( "MAKE-BIJECTION" );
    $kw26$SLOT = makeKeyword( "SLOT" );
    $kw27$END = makeKeyword( "END" );
    $sym28$VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-BIJECTION-METHOD" );
    $kw29$ALIST = makeKeyword( "ALIST" );
    $kw30$HASHTABLE = makeKeyword( "HASHTABLE" );
    $kw31$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str32$Corrupted_bijection__unsupported_ = makeString( "Corrupted bijection; unsupported style ~S.~%" );
    $str33$Malformed_bijection_ = makeString( "Malformed " );
    $sym34$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $sym35$INTEGERP = makeSymbol( "INTEGERP" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "BIJECTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list37 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw38$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw39$DONE = makeKeyword( "DONE" );
    $sym40$BIJECTION_VAR = makeUninternedSymbol( "BIJECTION-VAR" );
    $sym41$CLET = makeSymbol( "CLET" );
    $sym42$PCASE = makeSymbol( "PCASE" );
    $sym43$DO_BIJECTION_STYLE = makeSymbol( "DO-BIJECTION-STYLE" );
    $sym44$DO_ALIST = makeSymbol( "DO-ALIST" );
    $sym45$DO_BIJECTION_DATABASE = makeSymbol( "DO-BIJECTION-DATABASE" );
    $sym46$DO_HASH_TABLE = makeSymbol( "DO-HASH-TABLE" );
    $sym47$OTHERWISE = makeSymbol( "OTHERWISE" );
    $sym48$BIJECTION_STYLE_ERROR = makeSymbol( "BIJECTION-STYLE-ERROR" );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "KEY" ), makeSymbol( "BIJECTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$BIJECTION_VAR = makeUninternedSymbol( "BIJECTION-VAR" );
    $sym51$DO_BIJECTION_INVERSE_DATABASE = makeSymbol( "DO-BIJECTION-INVERSE-DATABASE" );
    $sym52$DO_BIJECTION = makeSymbol( "DO-BIJECTION" );
    $list53 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $str54$_S______S__ = makeString( "~S <-> ~S~%" );
  }

  public static final class $bijection_native
      extends
        SubLStructNative
  {
    public SubLObject $size;
    public SubLObject $database;
    public SubLObject $inverse_database;
    public SubLObject $test;
    private static final SubLStructDeclNative structDecl;

    public $bijection_native()
    {
      this.$size = CommonSymbols.NIL;
      this.$database = CommonSymbols.NIL;
      this.$inverse_database = CommonSymbols.NIL;
      this.$test = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $bijection_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$size;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$database;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$inverse_database;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$test;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$size = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$database = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$inverse_database = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$test = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $bijection_native.class, $sym2$BIJECTION, $sym3$BIJECTION_P, $list4, $list5, new String[] { "$size", "$database", "$inverse_database", "$test"
      }, $list6, $list7, $sym8$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $bijection_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $bijection_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "BIJECTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return bijection_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 224 ms
 * 
 */