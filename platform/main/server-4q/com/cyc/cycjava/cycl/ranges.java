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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ranges
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ranges";
  public static final String myFingerPrint = "33d13866a0b1b37fd8c4422c088fa78fb7ff267b9f1c44f6b737e14167d78250";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 803L)
  private static SubLSymbol $valid_range_bound_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 873L)
  private static SubLSymbol $ranges_initial_hashtable_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 932L)
  private static SubLSymbol $ranges_table_update_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1014L)
  private static SubLSymbol $ranges_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLSymbol $dtp_range$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$RANGE_BOUND_TYPE;
  private static final SubLString $str2$_S___S_is_not_a_member_of_the__S_;
  private static final SubLSymbol $sym3$ENCODE_RANGE_BOUND_TYPE;
  private static final SubLString $str4$_S___S_is_not_a_valid_encoding_of;
  private static final SubLSymbol $sym5$DECODE_RANGE_BOUND_TYPE;
  private static final SubLString $str6$_S___S_was_expected_to_be_a_membe;
  private static final SubLSymbol $sym7$RANGE_BOUND_TYPE_P;
  private static final SubLInteger $int8$100;
  private static final SubLString $str9$Ranges_Table_Lock;
  private static final SubLSymbol $sym10$_RANGES_TABLE_;
  private static final SubLSymbol $sym11$RANGE;
  private static final SubLSymbol $sym12$RANGE_P;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$PRINT_RANGE;
  private static final SubLSymbol $sym18$RANGE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$RANGE_TYPE_NAME;
  private static final SubLSymbol $sym21$_CSETF_RANGE_TYPE_NAME;
  private static final SubLSymbol $sym22$RANGE_BASE_TYPE_PREDICATE;
  private static final SubLSymbol $sym23$_CSETF_RANGE_BASE_TYPE_PREDICATE;
  private static final SubLSymbol $sym24$RANGE_ENUMERATION_TYPE;
  private static final SubLSymbol $sym25$_CSETF_RANGE_ENUMERATION_TYPE;
  private static final SubLSymbol $sym26$RANGE_LOW_BOUND;
  private static final SubLSymbol $sym27$_CSETF_RANGE_LOW_BOUND;
  private static final SubLSymbol $sym28$RANGE_HIGH_BOUND;
  private static final SubLSymbol $sym29$_CSETF_RANGE_HIGH_BOUND;
  private static final SubLSymbol $sym30$RANGE_LOW_BOUND_PREDICATE;
  private static final SubLSymbol $sym31$_CSETF_RANGE_LOW_BOUND_PREDICATE;
  private static final SubLSymbol $sym32$RANGE_HIGH_BOUND_PREDICATE;
  private static final SubLSymbol $sym33$_CSETF_RANGE_HIGH_BOUND_PREDICATE;
  private static final SubLSymbol $sym34$RANGE_LOW_BOUND_TYPE;
  private static final SubLSymbol $sym35$_CSETF_RANGE_LOW_BOUND_TYPE;
  private static final SubLSymbol $sym36$RANGE_HIGH_BOUND_TYPE;
  private static final SubLSymbol $sym37$_CSETF_RANGE_HIGH_BOUND_TYPE;
  private static final SubLSymbol $kw38$TYPE_NAME;
  private static final SubLSymbol $kw39$BASE_TYPE_PREDICATE;
  private static final SubLSymbol $kw40$ENUMERATION_TYPE;
  private static final SubLSymbol $kw41$LOW_BOUND;
  private static final SubLSymbol $kw42$HIGH_BOUND;
  private static final SubLSymbol $kw43$LOW_BOUND_PREDICATE;
  private static final SubLSymbol $kw44$HIGH_BOUND_PREDICATE;
  private static final SubLSymbol $kw45$LOW_BOUND_TYPE;
  private static final SubLSymbol $kw46$HIGH_BOUND_TYPE;
  private static final SubLString $str47$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw48$BEGIN;
  private static final SubLSymbol $sym49$MAKE_RANGE;
  private static final SubLSymbol $kw50$SLOT;
  private static final SubLSymbol $kw51$END;
  private static final SubLSymbol $sym52$VISIT_DEFSTRUCT_OBJECT_RANGE_METHOD;
  private static final SubLList $list53;
  private static final SubLString $str54$range;
  private static final SubLSymbol $sym55$RANGE_;
  private static final SubLSymbol $kw56$INCLUSIVE;
  private static final SubLSymbol $kw57$EXCLUSIVE;
  private static final SubLString $str58$_C_S___S_C;
  private static final SubLSymbol $sym59$INTEGERP;
  private static final SubLSymbol $sym60$FLOATP;
  private static final SubLSymbol $sym61$CHARACTERP;
  private static final SubLSymbol $sym62$STRINGP;
  private static final SubLSymbol $sym63$_;
  private static final SubLSymbol $sym64$_;
  private static final SubLSymbol $sym65$CHAR_;
  private static final SubLSymbol $sym66$CHAR_;
  private static final SubLSymbol $sym67$STRING_;
  private static final SubLSymbol $sym68$STRING_;
  private static final SubLSymbol $sym69$ENUMERATION_GREATER_P;
  private static final SubLSymbol $sym70$ENUMERATION_LESS_P;
  private static final SubLSymbol $sym71$__;
  private static final SubLSymbol $sym72$__;
  private static final SubLSymbol $sym73$CHAR__;
  private static final SubLSymbol $sym74$CHAR__;
  private static final SubLSymbol $sym75$STRING__;
  private static final SubLSymbol $sym76$STRING__;
  private static final SubLSymbol $sym77$ENUMERATION_GREATER_OR_EQUAL_P;
  private static final SubLSymbol $sym78$ENUMERATION_LESS_OR_EQUAL_P;
  private static final SubLString $str79$RANGES_INCORPORATE_DEFINITION___S;
  private static final SubLString $str80$RANGES_INCORPORATE_DEFINITION__co;
  private static final SubLString $str81$RANGES_INCORPORATE_DEFINITION__co;
  private static final SubLString $str82$_S_P;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$RET;
  private static final SubLSymbol $sym85$CAND;
  private static final SubLSymbol $sym86$OBJECT;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$PROGN;
  private static final SubLSymbol $sym89$RANGES_INCORPORATE_DEFINITION;
  private static final SubLSymbol $sym90$QUOTE;
  private static final SubLList $list91;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$DEFINE_INCLUSIVE_RANGE_WITH_FORM;
  private static final SubLSymbol $sym94$DEFINE;
  private static final SubLSymbol $sym95$DEFINE_API;
  private static final SubLSymbol $sym96$DEFINE_PUBLIC;
  private static final SubLSymbol $sym97$DEFINE_PROTECTED;
  private static final SubLSymbol $sym98$DEFINE_PRIVATE;
  private static final SubLSymbol $sym99$DEFINE_EXCLUSIVE_RANGE_WITH_FORM;
  private static final SubLString $str100$RANGE_MEMBER_P___S_is_not_a_valid;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 803L)
  public static SubLObject valid_range_bound_types()
  {
    return $valid_range_bound_types$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 803L)
  public static SubLObject range_bound_type_p(final SubLObject v_object)
  {
    return ( NIL != conses_high.member( v_object, $valid_range_bound_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 803L)
  public static SubLObject encode_range_bound_type(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos = Sequences.position( value, $valid_range_bound_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pos )
    {
      Errors.error( $str2$_S___S_is_not_a_member_of_the__S_, $sym3$ENCODE_RANGE_BOUND_TYPE, value, $sym1$RANGE_BOUND_TYPE );
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 803L)
  public static SubLObject decode_range_bound_type(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject element = ConsesLow.nth( value, $valid_range_bound_types$.getGlobalValue() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == element )
    {
      Errors.error( $str4$_S___S_is_not_a_valid_encoding_of, $sym5$DECODE_RANGE_BOUND_TYPE, value, $sym1$RANGE_BOUND_TYPE );
    }
    return element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 803L)
  public static SubLObject range_bound_type_less_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == range_bound_type_p( value1 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$RANGE_BOUND_TYPE_P, value1, $sym1$RANGE_BOUND_TYPE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == range_bound_type_p( value2 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$RANGE_BOUND_TYPE_P, value2, $sym1$RANGE_BOUND_TYPE );
    }
    SubLObject cdolist_list_var = $valid_range_bound_types$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value1 ) )
      {
        return makeBoolean( !value3.eql( value2 ) );
      }
      if( value3.eql( value2 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 803L)
  public static SubLObject range_bound_type_greater_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == range_bound_type_p( value1 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$RANGE_BOUND_TYPE_P, value1, $sym1$RANGE_BOUND_TYPE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == range_bound_type_p( value2 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$RANGE_BOUND_TYPE_P, value2, $sym1$RANGE_BOUND_TYPE );
    }
    SubLObject cdolist_list_var = $valid_range_bound_types$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value2 ) )
      {
        return makeBoolean( !value3.eql( value1 ) );
      }
      if( value3.eql( value1 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_range( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $range_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_type_name(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_base_type_predicate(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_enumeration_type(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_low_bound(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_high_bound(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_low_bound_predicate(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_high_bound_predicate(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_low_bound_type(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject range_high_bound_type(final SubLObject v_object)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_type_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_base_type_predicate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_enumeration_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_low_bound(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_high_bound(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_low_bound_predicate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_high_bound_predicate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_low_bound_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject _csetf_range_high_bound_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != range_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject make_range(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $range_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw38$TYPE_NAME ) )
      {
        _csetf_range_type_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$BASE_TYPE_PREDICATE ) )
      {
        _csetf_range_base_type_predicate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$ENUMERATION_TYPE ) )
      {
        _csetf_range_enumeration_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$LOW_BOUND ) )
      {
        _csetf_range_low_bound( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$HIGH_BOUND ) )
      {
        _csetf_range_high_bound( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$LOW_BOUND_PREDICATE ) )
      {
        _csetf_range_low_bound_predicate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$HIGH_BOUND_PREDICATE ) )
      {
        _csetf_range_high_bound_predicate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$LOW_BOUND_TYPE ) )
      {
        _csetf_range_low_bound_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$HIGH_BOUND_TYPE ) )
      {
        _csetf_range_high_bound_type( v_new, current_value );
      }
      else
      {
        Errors.error( $str47$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject visit_defstruct_range(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw48$BEGIN, $sym49$MAKE_RANGE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw38$TYPE_NAME, range_type_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw39$BASE_TYPE_PREDICATE, range_base_type_predicate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw40$ENUMERATION_TYPE, range_enumeration_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw41$LOW_BOUND, range_low_bound( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw42$HIGH_BOUND, range_high_bound( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw43$LOW_BOUND_PREDICATE, range_low_bound_predicate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw44$HIGH_BOUND_PREDICATE, range_high_bound_predicate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw45$LOW_BOUND_TYPE, range_low_bound_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$SLOT, $kw46$HIGH_BOUND_TYPE, range_high_bound_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw51$END, $sym49$MAKE_RANGE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1099L)
  public static SubLObject visit_defstruct_object_range_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_range( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1338L)
  public static SubLObject with_range_read_only(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject range = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    range = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject range_var = Symbols.make_symbol( $str54$range );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( range_var, range, $sym55$RANGE_, $list13, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1726L)
  public static SubLObject with_range_read_write(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject range = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    range = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject range_var = Symbols.make_symbol( $str54$range );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( range_var, range, $sym55$RANGE_, $list13, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2119L)
  public static SubLObject print_range(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject low_bound_type = range_low_bound_type( v_object );
    final SubLObject high_bound_type = range_high_bound_type( v_object );
    final SubLObject low_bound_bracket = ( low_bound_type == $kw56$INCLUSIVE ) ? Characters.CHAR_lbracket : ( ( low_bound_type == $kw57$EXCLUSIVE ) ? Characters.CHAR_lparen : Characters.CHAR_lbrace );
    final SubLObject high_bound_bracket = ( high_bound_type == $kw56$INCLUSIVE ) ? Characters.CHAR_rbracket : ( ( high_bound_type == $kw57$EXCLUSIVE ) ? Characters.CHAR_rparen : Characters.CHAR_rbrace );
    PrintLow.format( stream, $str58$_C_S___S_C, low_bound_bracket, high_bound_bracket );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2592L)
  public static SubLObject ranges_retrieve_range(final SubLObject range_name)
  {
    if( range_name.isSymbol() )
    {
      return Hashtables.gethash( range_name, $ranges_table$.getGlobalValue(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2835L)
  public static SubLObject range_intern_range(final SubLObject range_name, final SubLObject range)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $ranges_table_update_lock$.getDynamicValue( thread ) );
      if( range_name.isSymbol() && NIL != range_p( range ) )
      {
        Hashtables.sethash( range_name, $ranges_table$.getGlobalValue(), range );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $ranges_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return range;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3280L)
  public static SubLObject ranges_delete_range(final SubLObject range_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $ranges_table_update_lock$.getDynamicValue( thread ) );
      if( range_name.isSymbol() )
      {
        Hashtables.remhash( range_name, $ranges_table$.getGlobalValue() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $ranges_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3568L)
  public static SubLObject ranges_compute_base_type_predicate(final SubLObject low_bound_value, final SubLObject high_bound_value, final SubLObject given_predicate)
  {
    if( NIL != given_predicate )
    {
      return given_predicate;
    }
    if( low_bound_value.isInteger() )
    {
      if( high_bound_value.isInteger() )
      {
        return $sym59$INTEGERP;
      }
      if( high_bound_value.isDouble() )
      {
        return $sym60$FLOATP;
      }
      return NIL;
    }
    else if( low_bound_value.isDouble() )
    {
      if( high_bound_value.isDouble() )
      {
        return $sym60$FLOATP;
      }
      if( high_bound_value.isInteger() )
      {
        return $sym60$FLOATP;
      }
      return NIL;
    }
    else if( low_bound_value.isChar() )
    {
      if( high_bound_value.isChar() )
      {
        return $sym61$CHARACTERP;
      }
      return NIL;
    }
    else
    {
      if( !low_bound_value.isString() )
      {
        return NIL;
      }
      if( high_bound_value.isString() )
      {
        return $sym62$STRINGP;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4296L)
  public static SubLObject ranges_compute_exclusive_bound_predicates(final SubLObject low_bound_value, final SubLObject high_bound_value, final SubLObject given_low_bound_predicate,
      final SubLObject given_high_bound_predicate)
  {
    if( NIL != given_low_bound_predicate && NIL != given_high_bound_predicate )
    {
      return Values.values( given_low_bound_predicate, given_high_bound_predicate, NIL );
    }
    if( low_bound_value.isInteger() )
    {
      if( high_bound_value.isInteger() )
      {
        return Values.values( $sym63$_, $sym64$_, NIL );
      }
      if( high_bound_value.isDouble() )
      {
        return Values.values( $sym63$_, $sym64$_, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else if( low_bound_value.isDouble() )
    {
      if( high_bound_value.isDouble() )
      {
        return Values.values( $sym63$_, $sym64$_, NIL );
      }
      if( high_bound_value.isInteger() )
      {
        return Values.values( $sym63$_, $sym64$_, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else if( low_bound_value.isChar() )
    {
      if( high_bound_value.isChar() )
      {
        return Values.values( $sym65$CHAR_, $sym66$CHAR_, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else if( low_bound_value.isString() )
    {
      if( high_bound_value.isString() )
      {
        return Values.values( $sym67$STRING_, $sym68$STRING_, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else
    {
      final SubLObject low_bound_enumerations = enumerations.enumerate_enumerations( low_bound_value );
      final SubLObject high_bound_enumerations = enumerations.enumerate_enumerations( high_bound_value );
      final SubLObject common_enumerations = conses_high.intersection( low_bound_enumerations, high_bound_enumerations, UNPROVIDED, UNPROVIDED );
      if( NIL != list_utilities.singletonP( common_enumerations ) )
      {
        final SubLObject enumeration_type = common_enumerations.first();
        return Values.values( $sym69$ENUMERATION_GREATER_P, $sym70$ENUMERATION_LESS_P, enumeration_type );
      }
      return Values.values( NIL, NIL, NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5791L)
  public static SubLObject ranges_compute_inclusive_bound_predicates(final SubLObject low_bound_value, final SubLObject high_bound_value, final SubLObject given_low_bound_predicate,
      final SubLObject given_high_bound_predicate)
  {
    if( NIL != given_low_bound_predicate && NIL != given_high_bound_predicate )
    {
      return Values.values( given_low_bound_predicate, given_high_bound_predicate );
    }
    if( low_bound_value.isInteger() )
    {
      if( high_bound_value.isInteger() )
      {
        return Values.values( $sym71$__, $sym72$__, NIL );
      }
      if( high_bound_value.isDouble() )
      {
        return Values.values( $sym71$__, $sym72$__, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else if( low_bound_value.isDouble() )
    {
      if( high_bound_value.isDouble() )
      {
        return Values.values( $sym71$__, $sym72$__, NIL );
      }
      if( high_bound_value.isInteger() )
      {
        return Values.values( $sym71$__, $sym72$__, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else if( low_bound_value.isChar() )
    {
      if( high_bound_value.isChar() )
      {
        return Values.values( $sym73$CHAR__, $sym74$CHAR__, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else if( low_bound_value.isString() )
    {
      if( high_bound_value.isString() )
      {
        return Values.values( $sym75$STRING__, $sym76$STRING__, NIL );
      }
      return Values.values( NIL, NIL, NIL );
    }
    else
    {
      final SubLObject low_bound_enumerations = enumerations.enumerate_enumerations( low_bound_value );
      final SubLObject high_bound_enumerations = enumerations.enumerate_enumerations( high_bound_value );
      final SubLObject common_enumerations = conses_high.intersection( low_bound_enumerations, high_bound_enumerations, UNPROVIDED, UNPROVIDED );
      if( NIL != list_utilities.singletonP( common_enumerations ) )
      {
        final SubLObject enumeration_type = common_enumerations.first();
        return Values.values( $sym77$ENUMERATION_GREATER_OR_EQUAL_P, $sym78$ENUMERATION_LESS_OR_EQUAL_P, enumeration_type );
      }
      return Values.values( NIL, NIL, NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7323L)
  public static SubLObject ranges_incorporate_definition(final SubLObject enum_name, final SubLObject new_low_bound, final SubLObject new_high_bound, final SubLObject new_low_bound_type,
      final SubLObject new_high_bound_type, final SubLObject new_low_bound_predicate, final SubLObject new_high_bound_predicate, final SubLObject new_base_type_predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == range_bound_type_p( new_low_bound_type ) )
    {
      Errors.error( $str79$RANGES_INCORPORATE_DEFINITION___S, new_low_bound_type );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == range_bound_type_p( new_low_bound_type ) )
    {
      Errors.error( $str79$RANGES_INCORPORATE_DEFINITION___S, new_high_bound_type );
    }
    SubLObject range = ranges_retrieve_range( enum_name );
    if( NIL != range )
    {
      ranges_delete_range( enum_name );
    }
    else
    {
      range = make_range( UNPROVIDED );
    }
    final SubLObject range_$1 = range;
    SubLObject type_name = range_type_name( range_$1 );
    SubLObject base_type_predicate = range_base_type_predicate( range_$1 );
    SubLObject enumeration_type = range_enumeration_type( range_$1 );
    SubLObject low_bound = range_low_bound( range_$1 );
    SubLObject high_bound = range_high_bound( range_$1 );
    SubLObject low_bound_predicate = range_low_bound_predicate( range_$1 );
    SubLObject high_bound_predicate = range_high_bound_predicate( range_$1 );
    SubLObject low_bound_type = range_low_bound_type( range_$1 );
    SubLObject high_bound_type = range_high_bound_type( range_$1 );
    try
    {
      type_name = enum_name;
      base_type_predicate = ranges_compute_base_type_predicate( new_low_bound, new_high_bound, new_base_type_predicate );
      low_bound_type = new_low_bound_type;
      high_bound_type = new_high_bound_type;
      low_bound = new_low_bound;
      high_bound = new_high_bound;
      if( new_low_bound_type == $kw56$INCLUSIVE )
      {
        if( new_high_bound_type == $kw56$INCLUSIVE )
        {
          thread.resetMultipleValues();
          final SubLObject low_bound_pred = ranges_compute_inclusive_bound_predicates( new_low_bound, new_high_bound, new_low_bound_predicate, new_high_bound_predicate );
          final SubLObject high_bound_pred = thread.secondMultipleValue();
          final SubLObject enum_type = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == low_bound_pred )
          {
            Errors.error( $str80$RANGES_INCORPORATE_DEFINITION__co, enum_name );
          }
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == high_bound_pred )
          {
            Errors.error( $str81$RANGES_INCORPORATE_DEFINITION__co, enum_name );
          }
          low_bound_predicate = low_bound_pred;
          high_bound_predicate = high_bound_pred;
          enumeration_type = enum_type;
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject low_bound_pred = ranges_compute_inclusive_bound_predicates( new_low_bound, new_high_bound, new_low_bound_predicate, new_high_bound_predicate );
          final SubLObject ignore1 = thread.secondMultipleValue();
          final SubLObject enum_type = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          thread.resetMultipleValues();
          final SubLObject ignore2 = ranges_compute_exclusive_bound_predicates( new_low_bound, new_high_bound, new_low_bound_predicate, new_high_bound_predicate );
          final SubLObject high_bound_pred2 = thread.secondMultipleValue();
          final SubLObject ignore3 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == low_bound_pred )
          {
            Errors.error( $str80$RANGES_INCORPORATE_DEFINITION__co, enum_name );
          }
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == high_bound_pred2 )
          {
            Errors.error( $str81$RANGES_INCORPORATE_DEFINITION__co, enum_name );
          }
          low_bound_predicate = low_bound_pred;
          high_bound_predicate = high_bound_pred2;
          enumeration_type = enum_type;
        }
      }
      else if( new_high_bound_type == $kw56$INCLUSIVE )
      {
        thread.resetMultipleValues();
        final SubLObject low_bound_pred = ranges_compute_exclusive_bound_predicates( new_low_bound, new_high_bound, new_low_bound_predicate, new_high_bound_predicate );
        final SubLObject ignore1 = thread.secondMultipleValue();
        final SubLObject enum_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject ignore2 = ranges_compute_inclusive_bound_predicates( new_low_bound, new_high_bound, new_low_bound_predicate, new_high_bound_predicate );
        final SubLObject high_bound_pred2 = thread.secondMultipleValue();
        final SubLObject ignore3 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == low_bound_pred )
        {
          Errors.error( $str80$RANGES_INCORPORATE_DEFINITION__co, enum_name );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == high_bound_pred2 )
        {
          Errors.error( $str81$RANGES_INCORPORATE_DEFINITION__co, enum_name );
        }
        low_bound_predicate = low_bound_pred;
        high_bound_predicate = high_bound_pred2;
        enumeration_type = enum_type;
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject low_bound_pred = ranges_compute_exclusive_bound_predicates( new_low_bound, new_high_bound, new_low_bound_predicate, new_high_bound_predicate );
        final SubLObject high_bound_pred = thread.secondMultipleValue();
        final SubLObject enum_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == low_bound_pred )
        {
          Errors.error( $str80$RANGES_INCORPORATE_DEFINITION__co, enum_name );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == high_bound_pred )
        {
          Errors.error( $str81$RANGES_INCORPORATE_DEFINITION__co, enum_name );
        }
        low_bound_predicate = low_bound_pred;
        high_bound_predicate = high_bound_pred;
        enumeration_type = enum_type;
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        _csetf_range_type_name( range_$1, type_name );
        _csetf_range_base_type_predicate( range_$1, base_type_predicate );
        _csetf_range_enumeration_type( range_$1, enumeration_type );
        _csetf_range_low_bound( range_$1, low_bound );
        _csetf_range_high_bound( range_$1, high_bound );
        _csetf_range_low_bound_predicate( range_$1, low_bound_predicate );
        _csetf_range_high_bound_predicate( range_$1, high_bound_predicate );
        _csetf_range_low_bound_type( range_$1, low_bound_type );
        _csetf_range_high_bound_type( range_$1, high_bound_type );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    range_intern_range( enum_name, range );
    return range;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11560L)
  public static SubLObject ranges_generate_predicate_name(final SubLObject range)
  {
    if( NIL != range )
    {
      final SubLObject type_name = range_type_name( range );
      return Packages.intern( PrintLow.format( NIL, $str82$_S_P, type_name ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11731L)
  public static SubLObject expand_ranges_predicator(final SubLObject defining_form, final SubLObject range)
  {
    final SubLObject predicate_name = ranges_generate_predicate_name( range );
    if( NIL != predicate_name )
    {
      final SubLObject base_type_predicate = range_base_type_predicate( range );
      final SubLObject low_bound = range_low_bound( range );
      final SubLObject high_bound = range_high_bound( range );
      final SubLObject low_bound_predicate = range_low_bound_predicate( range );
      final SubLObject high_bound_predicate = range_high_bound_predicate( range );
      return ConsesLow.list( ConsesLow.list( defining_form, predicate_name, $list83, ConsesLow.list( $sym84$RET, reader.bq_cons( $sym85$CAND, ConsesLow.append( new SubLObject[] { ( NIL != base_type_predicate )
          ? ConsesLow.list( reader.bq_cons( base_type_predicate, $list83 ) )
          : NIL, ( NIL != low_bound_predicate ) ? ConsesLow.list( ConsesLow.list( low_bound_predicate, $sym86$OBJECT, low_bound ) ) : NIL, ( NIL != high_bound_predicate ) ? ConsesLow.list( ConsesLow.list(
              high_bound_predicate, $sym86$OBJECT, high_bound ) ) : NIL, ( NIL != base_type_predicate || NIL != low_bound_predicate || NIL != high_bound_predicate ) ? NIL : $list87, NIL
      } ) ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12421L)
  public static SubLObject expand_inclusive_range(final SubLObject defining_form, final SubLObject new_enum_name, final SubLObject new_low_bound_value, final SubLObject new_high_bound_value,
      final SubLObject new_greater_than_or_equal_to_predicate, final SubLObject new_less_than_or_equal_to_predicate, final SubLObject new_base_type_predicate)
  {
    final SubLObject range = ranges_incorporate_definition( new_enum_name, new_low_bound_value, new_high_bound_value, $kw56$INCLUSIVE, $kw56$INCLUSIVE, new_greater_than_or_equal_to_predicate,
        new_less_than_or_equal_to_predicate, new_base_type_predicate );
    return ConsesLow.listS( $sym88$PROGN, ConsesLow.list( new SubLObject[] { $sym89$RANGES_INCORPORATE_DEFINITION, ConsesLow.list( $sym90$QUOTE, new_enum_name ), ConsesLow.list( $sym90$QUOTE, new_low_bound_value ),
      ConsesLow.list( $sym90$QUOTE, new_high_bound_value ), $kw56$INCLUSIVE, $kw56$INCLUSIVE, ConsesLow.list( $sym90$QUOTE, new_greater_than_or_equal_to_predicate ), ConsesLow.list( $sym90$QUOTE,
          new_less_than_or_equal_to_predicate ), ConsesLow.list( $sym90$QUOTE, new_base_type_predicate )
    } ), ConsesLow.append( expand_ranges_predicator( defining_form, range ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13244L)
  public static SubLObject define_inclusive_range_with_form(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject defining_form = NIL;
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    defining_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list91 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list91 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list91 );
      current = current.rest();
      if( NIL == current )
      {
        return expand_inclusive_range( defining_form, enum_name, low_bound_value, high_bound_value, less_than_or_equal_to_predicate, greater_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13676L)
  public static SubLObject define_inclusive_range(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym93$DEFINE_INCLUSIVE_RANGE_WITH_FORM, $sym94$DEFINE, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate, less_than_or_equal_to_predicate,
            base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14106L)
  public static SubLObject define_inclusive_range_api(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym93$DEFINE_INCLUSIVE_RANGE_WITH_FORM, $sym95$DEFINE_API, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14545L)
  public static SubLObject define_inclusive_range_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym93$DEFINE_INCLUSIVE_RANGE_WITH_FORM, $sym96$DEFINE_PUBLIC, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14990L)
  public static SubLObject define_inclusive_range_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym93$DEFINE_INCLUSIVE_RANGE_WITH_FORM, $sym97$DEFINE_PROTECTED, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15441L)
  public static SubLObject define_inclusive_range_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym93$DEFINE_INCLUSIVE_RANGE_WITH_FORM, $sym98$DEFINE_PRIVATE, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15888L)
  public static SubLObject expand_exclusive_range(final SubLObject defining_form, final SubLObject new_enum_name, final SubLObject new_low_bound_value, final SubLObject new_high_bound_value,
      final SubLObject new_greater_than_or_equal_to_predicate, final SubLObject new_less_than_or_equal_to_predicate, final SubLObject new_base_type_predicate)
  {
    final SubLObject range = ranges_incorporate_definition( new_enum_name, new_low_bound_value, new_high_bound_value, $kw57$EXCLUSIVE, $kw57$EXCLUSIVE, new_greater_than_or_equal_to_predicate,
        new_less_than_or_equal_to_predicate, new_base_type_predicate );
    return ConsesLow.listS( $sym88$PROGN, ConsesLow.list( new SubLObject[] { $sym89$RANGES_INCORPORATE_DEFINITION, ConsesLow.list( $sym90$QUOTE, new_enum_name ), ConsesLow.list( $sym90$QUOTE, new_low_bound_value ),
      ConsesLow.list( $sym90$QUOTE, new_high_bound_value ), $kw57$EXCLUSIVE, $kw57$EXCLUSIVE, ConsesLow.list( $sym90$QUOTE, new_greater_than_or_equal_to_predicate ), ConsesLow.list( $sym90$QUOTE,
          new_less_than_or_equal_to_predicate ), ConsesLow.list( $sym90$QUOTE, new_base_type_predicate )
    } ), ConsesLow.append( expand_ranges_predicator( defining_form, range ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16711L)
  public static SubLObject define_exclusive_range_with_form(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject defining_form = NIL;
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    defining_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list91 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list91 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list91 );
      current = current.rest();
      if( NIL == current )
      {
        return expand_exclusive_range( defining_form, enum_name, low_bound_value, high_bound_value, less_than_or_equal_to_predicate, greater_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17143L)
  public static SubLObject define_exclusive_range(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym99$DEFINE_EXCLUSIVE_RANGE_WITH_FORM, $sym94$DEFINE, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate, less_than_or_equal_to_predicate,
            base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17573L)
  public static SubLObject define_exclusive_range_api(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym99$DEFINE_EXCLUSIVE_RANGE_WITH_FORM, $sym95$DEFINE_API, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18012L)
  public static SubLObject define_exclusive_range_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym99$DEFINE_EXCLUSIVE_RANGE_WITH_FORM, $sym96$DEFINE_PUBLIC, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18457L)
  public static SubLObject define_exclusive_range_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym99$DEFINE_EXCLUSIVE_RANGE_WITH_FORM, $sym97$DEFINE_PROTECTED, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18908L)
  public static SubLObject define_exclusive_range_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject enum_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    enum_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject low_bound_value = NIL;
    SubLObject high_bound_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    low_bound_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    high_bound_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      final SubLObject greater_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject less_than_or_equal_to_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      final SubLObject base_type_predicate = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( $sym99$DEFINE_EXCLUSIVE_RANGE_WITH_FORM, $sym98$DEFINE_PRIVATE, enum_name, ConsesLow.list( low_bound_value, high_bound_value ), greater_than_or_equal_to_predicate,
            less_than_or_equal_to_predicate, base_type_predicate );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19355L)
  public static SubLObject range_member_p(final SubLObject range_name, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == range_name || !range_name.isSymbol() ) )
    {
      Errors.error( $str100$RANGE_MEMBER_P___S_is_not_a_valid, range_name );
    }
    final SubLObject true_range = ranges_retrieve_range( range_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == true_range )
    {
      Errors.error( $str100$RANGE_MEMBER_P___S_is_not_a_valid, range_name );
    }
    final SubLObject range = true_range;
    final SubLObject low_bound = range_low_bound( range );
    final SubLObject high_bound = range_high_bound( range );
    final SubLObject low_bound_predicate = range_low_bound_predicate( range );
    final SubLObject high_bound_predicate = range_high_bound_predicate( range );
    return makeBoolean( NIL != Functions.funcall( low_bound_predicate, value, low_bound ) && NIL != Functions.funcall( high_bound_predicate, value, high_bound ) );
  }

  public static SubLObject declare_ranges_file()
  {
    SubLFiles.declareFunction( me, "valid_range_bound_types", "VALID-RANGE-BOUND-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "range_bound_type_p", "RANGE-BOUND-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_range_bound_type", "ENCODE-RANGE-BOUND-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_range_bound_type", "DECODE-RANGE-BOUND-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "range_bound_type_less_p", "RANGE-BOUND-TYPE-LESS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "range_bound_type_greater_p", "RANGE-BOUND-TYPE-GREATER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "range_print_function_trampoline", "RANGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "range_p", "RANGE-P", 1, 0, false );
    new $range_p$UnaryFunction();
    SubLFiles.declareFunction( me, "range_type_name", "RANGE-TYPE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "range_base_type_predicate", "RANGE-BASE-TYPE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "range_enumeration_type", "RANGE-ENUMERATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "range_low_bound", "RANGE-LOW-BOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "range_high_bound", "RANGE-HIGH-BOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "range_low_bound_predicate", "RANGE-LOW-BOUND-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "range_high_bound_predicate", "RANGE-HIGH-BOUND-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "range_low_bound_type", "RANGE-LOW-BOUND-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "range_high_bound_type", "RANGE-HIGH-BOUND-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_type_name", "_CSETF-RANGE-TYPE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_base_type_predicate", "_CSETF-RANGE-BASE-TYPE-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_enumeration_type", "_CSETF-RANGE-ENUMERATION-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_low_bound", "_CSETF-RANGE-LOW-BOUND", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_high_bound", "_CSETF-RANGE-HIGH-BOUND", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_low_bound_predicate", "_CSETF-RANGE-LOW-BOUND-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_high_bound_predicate", "_CSETF-RANGE-HIGH-BOUND-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_low_bound_type", "_CSETF-RANGE-LOW-BOUND-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_range_high_bound_type", "_CSETF-RANGE-HIGH-BOUND-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_range", "MAKE-RANGE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_range", "VISIT-DEFSTRUCT-RANGE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_range_method", "VISIT-DEFSTRUCT-OBJECT-RANGE-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_range_read_only", "WITH-RANGE-READ-ONLY" );
    SubLFiles.declareMacro( me, "with_range_read_write", "WITH-RANGE-READ-WRITE" );
    SubLFiles.declareFunction( me, "print_range", "PRINT-RANGE", 3, 0, false );
    SubLFiles.declareFunction( me, "ranges_retrieve_range", "RANGES-RETRIEVE-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "range_intern_range", "RANGE-INTERN-RANGE", 2, 0, false );
    SubLFiles.declareFunction( me, "ranges_delete_range", "RANGES-DELETE-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "ranges_compute_base_type_predicate", "RANGES-COMPUTE-BASE-TYPE-PREDICATE", 3, 0, false );
    SubLFiles.declareFunction( me, "ranges_compute_exclusive_bound_predicates", "RANGES-COMPUTE-EXCLUSIVE-BOUND-PREDICATES", 4, 0, false );
    SubLFiles.declareFunction( me, "ranges_compute_inclusive_bound_predicates", "RANGES-COMPUTE-INCLUSIVE-BOUND-PREDICATES", 4, 0, false );
    SubLFiles.declareFunction( me, "ranges_incorporate_definition", "RANGES-INCORPORATE-DEFINITION", 8, 0, false );
    SubLFiles.declareFunction( me, "ranges_generate_predicate_name", "RANGES-GENERATE-PREDICATE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_ranges_predicator", "EXPAND-RANGES-PREDICATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_inclusive_range", "EXPAND-INCLUSIVE-RANGE", 7, 0, false );
    SubLFiles.declareMacro( me, "define_inclusive_range_with_form", "DEFINE-INCLUSIVE-RANGE-WITH-FORM" );
    SubLFiles.declareMacro( me, "define_inclusive_range", "DEFINE-INCLUSIVE-RANGE" );
    SubLFiles.declareMacro( me, "define_inclusive_range_api", "DEFINE-INCLUSIVE-RANGE-API" );
    SubLFiles.declareMacro( me, "define_inclusive_range_public", "DEFINE-INCLUSIVE-RANGE-PUBLIC" );
    SubLFiles.declareMacro( me, "define_inclusive_range_protected", "DEFINE-INCLUSIVE-RANGE-PROTECTED" );
    SubLFiles.declareMacro( me, "define_inclusive_range_private", "DEFINE-INCLUSIVE-RANGE-PRIVATE" );
    SubLFiles.declareFunction( me, "expand_exclusive_range", "EXPAND-EXCLUSIVE-RANGE", 7, 0, false );
    SubLFiles.declareMacro( me, "define_exclusive_range_with_form", "DEFINE-EXCLUSIVE-RANGE-WITH-FORM" );
    SubLFiles.declareMacro( me, "define_exclusive_range", "DEFINE-EXCLUSIVE-RANGE" );
    SubLFiles.declareMacro( me, "define_exclusive_range_api", "DEFINE-EXCLUSIVE-RANGE-API" );
    SubLFiles.declareMacro( me, "define_exclusive_range_public", "DEFINE-EXCLUSIVE-RANGE-PUBLIC" );
    SubLFiles.declareMacro( me, "define_exclusive_range_protected", "DEFINE-EXCLUSIVE-RANGE-PROTECTED" );
    SubLFiles.declareMacro( me, "define_exclusive_range_private", "DEFINE-EXCLUSIVE-RANGE-PRIVATE" );
    SubLFiles.declareFunction( me, "range_member_p", "RANGE-MEMBER-P", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_ranges_file()
  {
    $valid_range_bound_types$ = SubLFiles.defconstant( "*VALID-RANGE-BOUND-TYPES*", $list0 );
    $ranges_initial_hashtable_size$ = SubLFiles.defconstant( "*RANGES-INITIAL-HASHTABLE-SIZE*", $int8$100 );
    $ranges_table_update_lock$ = SubLFiles.defparameter( "*RANGES-TABLE-UPDATE-LOCK*", Locks.make_lock( $str9$Ranges_Table_Lock ) );
    $ranges_table$ = SubLFiles.deflexical( "*RANGES-TABLE*", maybeDefault( $sym10$_RANGES_TABLE_, $ranges_table$, () -> ( Hashtables.make_hash_table( $ranges_initial_hashtable_size$.getGlobalValue(), UNPROVIDED,
        UNPROVIDED ) ) ) );
    $dtp_range$ = SubLFiles.defconstant( "*DTP-RANGE*", $sym11$RANGE );
    return NIL;
  }

  public static SubLObject setup_ranges_file()
  {
    enumerations.enumerations_incorporate_definition( $sym1$RANGE_BOUND_TYPE, $list0 );
    subl_macro_promotions.declare_defglobal( $sym10$_RANGES_TABLE_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_range$.getGlobalValue(), Symbols.symbol_function( $sym18$RANGE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list19 );
    Structures.def_csetf( $sym20$RANGE_TYPE_NAME, $sym21$_CSETF_RANGE_TYPE_NAME );
    Structures.def_csetf( $sym22$RANGE_BASE_TYPE_PREDICATE, $sym23$_CSETF_RANGE_BASE_TYPE_PREDICATE );
    Structures.def_csetf( $sym24$RANGE_ENUMERATION_TYPE, $sym25$_CSETF_RANGE_ENUMERATION_TYPE );
    Structures.def_csetf( $sym26$RANGE_LOW_BOUND, $sym27$_CSETF_RANGE_LOW_BOUND );
    Structures.def_csetf( $sym28$RANGE_HIGH_BOUND, $sym29$_CSETF_RANGE_HIGH_BOUND );
    Structures.def_csetf( $sym30$RANGE_LOW_BOUND_PREDICATE, $sym31$_CSETF_RANGE_LOW_BOUND_PREDICATE );
    Structures.def_csetf( $sym32$RANGE_HIGH_BOUND_PREDICATE, $sym33$_CSETF_RANGE_HIGH_BOUND_PREDICATE );
    Structures.def_csetf( $sym34$RANGE_LOW_BOUND_TYPE, $sym35$_CSETF_RANGE_LOW_BOUND_TYPE );
    Structures.def_csetf( $sym36$RANGE_HIGH_BOUND_TYPE, $sym37$_CSETF_RANGE_HIGH_BOUND_TYPE );
    Equality.identity( $sym11$RANGE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_range$.getGlobalValue(), Symbols.symbol_function( $sym52$VISIT_DEFSTRUCT_OBJECT_RANGE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ranges_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ranges_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ranges_file();
  }
  static
  {
    me = new ranges();
    $valid_range_bound_types$ = null;
    $ranges_initial_hashtable_size$ = null;
    $ranges_table_update_lock$ = null;
    $ranges_table$ = null;
    $dtp_range$ = null;
    $list0 = ConsesLow.list( makeKeyword( "INCLUSIVE" ), makeKeyword( "EXCLUSIVE" ) );
    $sym1$RANGE_BOUND_TYPE = makeSymbol( "RANGE-BOUND-TYPE" );
    $str2$_S___S_is_not_a_member_of_the__S_ = makeString( "~S: ~S is not a member of the ~S enumeration." );
    $sym3$ENCODE_RANGE_BOUND_TYPE = makeSymbol( "ENCODE-RANGE-BOUND-TYPE" );
    $str4$_S___S_is_not_a_valid_encoding_of = makeString( "~S: ~S is not a valid encoding of the ~S enumeration." );
    $sym5$DECODE_RANGE_BOUND_TYPE = makeSymbol( "DECODE-RANGE-BOUND-TYPE" );
    $str6$_S___S_was_expected_to_be_a_membe = makeString( "~S: ~S was expected to be a member of the enumeration ~S." );
    $sym7$RANGE_BOUND_TYPE_P = makeSymbol( "RANGE-BOUND-TYPE-P" );
    $int8$100 = makeInteger( 100 );
    $str9$Ranges_Table_Lock = makeString( "Ranges Table Lock" );
    $sym10$_RANGES_TABLE_ = makeSymbol( "*RANGES-TABLE*" );
    $sym11$RANGE = makeSymbol( "RANGE" );
    $sym12$RANGE_P = makeSymbol( "RANGE-P" );
    $list13 = ConsesLow.list( new SubLObject[] { makeSymbol( "TYPE-NAME" ), makeSymbol( "BASE-TYPE-PREDICATE" ), makeSymbol( "ENUMERATION-TYPE" ), makeSymbol( "LOW-BOUND" ), makeSymbol( "HIGH-BOUND" ), makeSymbol(
        "LOW-BOUND-PREDICATE" ), makeSymbol( "HIGH-BOUND-PREDICATE" ), makeSymbol( "LOW-BOUND-TYPE" ), makeSymbol( "HIGH-BOUND-TYPE" )
    } );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE-NAME" ), makeKeyword( "BASE-TYPE-PREDICATE" ), makeKeyword( "ENUMERATION-TYPE" ), makeKeyword( "LOW-BOUND" ), makeKeyword( "HIGH-BOUND" ), makeKeyword(
        "LOW-BOUND-PREDICATE" ), makeKeyword( "HIGH-BOUND-PREDICATE" ), makeKeyword( "LOW-BOUND-TYPE" ), makeKeyword( "HIGH-BOUND-TYPE" )
    } );
    $list15 = ConsesLow.list( new SubLObject[] { makeSymbol( "RANGE-TYPE-NAME" ), makeSymbol( "RANGE-BASE-TYPE-PREDICATE" ), makeSymbol( "RANGE-ENUMERATION-TYPE" ), makeSymbol( "RANGE-LOW-BOUND" ), makeSymbol(
        "RANGE-HIGH-BOUND" ), makeSymbol( "RANGE-LOW-BOUND-PREDICATE" ), makeSymbol( "RANGE-HIGH-BOUND-PREDICATE" ), makeSymbol( "RANGE-LOW-BOUND-TYPE" ), makeSymbol( "RANGE-HIGH-BOUND-TYPE" )
    } );
    $list16 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-RANGE-TYPE-NAME" ), makeSymbol( "_CSETF-RANGE-BASE-TYPE-PREDICATE" ), makeSymbol( "_CSETF-RANGE-ENUMERATION-TYPE" ), makeSymbol(
        "_CSETF-RANGE-LOW-BOUND" ), makeSymbol( "_CSETF-RANGE-HIGH-BOUND" ), makeSymbol( "_CSETF-RANGE-LOW-BOUND-PREDICATE" ), makeSymbol( "_CSETF-RANGE-HIGH-BOUND-PREDICATE" ), makeSymbol(
            "_CSETF-RANGE-LOW-BOUND-TYPE" ), makeSymbol( "_CSETF-RANGE-HIGH-BOUND-TYPE" )
    } );
    $sym17$PRINT_RANGE = makeSymbol( "PRINT-RANGE" );
    $sym18$RANGE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RANGE-PRINT-FUNCTION-TRAMPOLINE" );
    $list19 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RANGE-P" ) );
    $sym20$RANGE_TYPE_NAME = makeSymbol( "RANGE-TYPE-NAME" );
    $sym21$_CSETF_RANGE_TYPE_NAME = makeSymbol( "_CSETF-RANGE-TYPE-NAME" );
    $sym22$RANGE_BASE_TYPE_PREDICATE = makeSymbol( "RANGE-BASE-TYPE-PREDICATE" );
    $sym23$_CSETF_RANGE_BASE_TYPE_PREDICATE = makeSymbol( "_CSETF-RANGE-BASE-TYPE-PREDICATE" );
    $sym24$RANGE_ENUMERATION_TYPE = makeSymbol( "RANGE-ENUMERATION-TYPE" );
    $sym25$_CSETF_RANGE_ENUMERATION_TYPE = makeSymbol( "_CSETF-RANGE-ENUMERATION-TYPE" );
    $sym26$RANGE_LOW_BOUND = makeSymbol( "RANGE-LOW-BOUND" );
    $sym27$_CSETF_RANGE_LOW_BOUND = makeSymbol( "_CSETF-RANGE-LOW-BOUND" );
    $sym28$RANGE_HIGH_BOUND = makeSymbol( "RANGE-HIGH-BOUND" );
    $sym29$_CSETF_RANGE_HIGH_BOUND = makeSymbol( "_CSETF-RANGE-HIGH-BOUND" );
    $sym30$RANGE_LOW_BOUND_PREDICATE = makeSymbol( "RANGE-LOW-BOUND-PREDICATE" );
    $sym31$_CSETF_RANGE_LOW_BOUND_PREDICATE = makeSymbol( "_CSETF-RANGE-LOW-BOUND-PREDICATE" );
    $sym32$RANGE_HIGH_BOUND_PREDICATE = makeSymbol( "RANGE-HIGH-BOUND-PREDICATE" );
    $sym33$_CSETF_RANGE_HIGH_BOUND_PREDICATE = makeSymbol( "_CSETF-RANGE-HIGH-BOUND-PREDICATE" );
    $sym34$RANGE_LOW_BOUND_TYPE = makeSymbol( "RANGE-LOW-BOUND-TYPE" );
    $sym35$_CSETF_RANGE_LOW_BOUND_TYPE = makeSymbol( "_CSETF-RANGE-LOW-BOUND-TYPE" );
    $sym36$RANGE_HIGH_BOUND_TYPE = makeSymbol( "RANGE-HIGH-BOUND-TYPE" );
    $sym37$_CSETF_RANGE_HIGH_BOUND_TYPE = makeSymbol( "_CSETF-RANGE-HIGH-BOUND-TYPE" );
    $kw38$TYPE_NAME = makeKeyword( "TYPE-NAME" );
    $kw39$BASE_TYPE_PREDICATE = makeKeyword( "BASE-TYPE-PREDICATE" );
    $kw40$ENUMERATION_TYPE = makeKeyword( "ENUMERATION-TYPE" );
    $kw41$LOW_BOUND = makeKeyword( "LOW-BOUND" );
    $kw42$HIGH_BOUND = makeKeyword( "HIGH-BOUND" );
    $kw43$LOW_BOUND_PREDICATE = makeKeyword( "LOW-BOUND-PREDICATE" );
    $kw44$HIGH_BOUND_PREDICATE = makeKeyword( "HIGH-BOUND-PREDICATE" );
    $kw45$LOW_BOUND_TYPE = makeKeyword( "LOW-BOUND-TYPE" );
    $kw46$HIGH_BOUND_TYPE = makeKeyword( "HIGH-BOUND-TYPE" );
    $str47$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw48$BEGIN = makeKeyword( "BEGIN" );
    $sym49$MAKE_RANGE = makeSymbol( "MAKE-RANGE" );
    $kw50$SLOT = makeKeyword( "SLOT" );
    $kw51$END = makeKeyword( "END" );
    $sym52$VISIT_DEFSTRUCT_OBJECT_RANGE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RANGE-METHOD" );
    $list53 = ConsesLow.list( makeSymbol( "RANGE" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str54$range = makeString( "range" );
    $sym55$RANGE_ = makeSymbol( "RANGE-" );
    $kw56$INCLUSIVE = makeKeyword( "INCLUSIVE" );
    $kw57$EXCLUSIVE = makeKeyword( "EXCLUSIVE" );
    $str58$_C_S___S_C = makeString( "~C~S, ~S~C" );
    $sym59$INTEGERP = makeSymbol( "INTEGERP" );
    $sym60$FLOATP = makeSymbol( "FLOATP" );
    $sym61$CHARACTERP = makeSymbol( "CHARACTERP" );
    $sym62$STRINGP = makeSymbol( "STRINGP" );
    $sym63$_ = makeSymbol( ">" );
    $sym64$_ = makeSymbol( "<" );
    $sym65$CHAR_ = makeSymbol( "CHAR>" );
    $sym66$CHAR_ = makeSymbol( "CHAR<" );
    $sym67$STRING_ = makeSymbol( "STRING>" );
    $sym68$STRING_ = makeSymbol( "STRING<" );
    $sym69$ENUMERATION_GREATER_P = makeSymbol( "ENUMERATION-GREATER-P" );
    $sym70$ENUMERATION_LESS_P = makeSymbol( "ENUMERATION-LESS-P" );
    $sym71$__ = makeSymbol( ">=" );
    $sym72$__ = makeSymbol( "<=" );
    $sym73$CHAR__ = makeSymbol( "CHAR>=" );
    $sym74$CHAR__ = makeSymbol( "CHAR<=" );
    $sym75$STRING__ = makeSymbol( "STRING>=" );
    $sym76$STRING__ = makeSymbol( "STRING<=" );
    $sym77$ENUMERATION_GREATER_OR_EQUAL_P = makeSymbol( "ENUMERATION-GREATER-OR-EQUAL-P" );
    $sym78$ENUMERATION_LESS_OR_EQUAL_P = makeSymbol( "ENUMERATION-LESS-OR-EQUAL-P" );
    $str79$RANGES_INCORPORATE_DEFINITION___S = makeString( "RANGES-INCORPORATE-DEFINITION: ~S is not a legal range bound type." );
    $str80$RANGES_INCORPORATE_DEFINITION__co = makeString( "RANGES-INCORPORATE-DEFINITION: could not determine a lower bound predicate for range type ~S." );
    $str81$RANGES_INCORPORATE_DEFINITION__co = makeString( "RANGES-INCORPORATE-DEFINITION: could not determine an upper bound predicate for range type ~S." );
    $str82$_S_P = makeString( "~S-P" );
    $list83 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $sym84$RET = makeSymbol( "RET" );
    $sym85$CAND = makeSymbol( "CAND" );
    $sym86$OBJECT = makeSymbol( "OBJECT" );
    $list87 = ConsesLow.list( T );
    $sym88$PROGN = makeSymbol( "PROGN" );
    $sym89$RANGES_INCORPORATE_DEFINITION = makeSymbol( "RANGES-INCORPORATE-DEFINITION" );
    $sym90$QUOTE = makeSymbol( "QUOTE" );
    $list91 = ConsesLow.list( makeSymbol( "DEFINING-FORM" ), makeSymbol( "ENUM-NAME" ), ConsesLow.list( makeSymbol( "LOW-BOUND-VALUE" ), makeSymbol( "HIGH-BOUND-VALUE" ) ), makeSymbol( "&OPTIONAL" ), ConsesLow.list(
        makeSymbol( "GREATER-THAN-OR-EQUAL-TO-PREDICATE" ), NIL ), ConsesLow.list( makeSymbol( "LESS-THAN-OR-EQUAL-TO-PREDICATE" ), NIL ), ConsesLow.list( makeSymbol( "BASE-TYPE-PREDICATE" ), NIL ) );
    $list92 = ConsesLow.list( makeSymbol( "ENUM-NAME" ), ConsesLow.list( makeSymbol( "LOW-BOUND-VALUE" ), makeSymbol( "HIGH-BOUND-VALUE" ) ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol(
        "GREATER-THAN-OR-EQUAL-TO-PREDICATE" ), NIL ), ConsesLow.list( makeSymbol( "LESS-THAN-OR-EQUAL-TO-PREDICATE" ), NIL ), ConsesLow.list( makeSymbol( "BASE-TYPE-PREDICATE" ), NIL ) );
    $sym93$DEFINE_INCLUSIVE_RANGE_WITH_FORM = makeSymbol( "DEFINE-INCLUSIVE-RANGE-WITH-FORM" );
    $sym94$DEFINE = makeSymbol( "DEFINE" );
    $sym95$DEFINE_API = makeSymbol( "DEFINE-API" );
    $sym96$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym97$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $sym98$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $sym99$DEFINE_EXCLUSIVE_RANGE_WITH_FORM = makeSymbol( "DEFINE-EXCLUSIVE-RANGE-WITH-FORM" );
    $str100$RANGE_MEMBER_P___S_is_not_a_valid = makeString( "RANGE-MEMBER-P: ~S is not a valid range." );
  }

  public static final class $range_native
      extends
        SubLStructNative
  {
    public SubLObject $type_name;
    public SubLObject $base_type_predicate;
    public SubLObject $enumeration_type;
    public SubLObject $low_bound;
    public SubLObject $high_bound;
    public SubLObject $low_bound_predicate;
    public SubLObject $high_bound_predicate;
    public SubLObject $low_bound_type;
    public SubLObject $high_bound_type;
    private static final SubLStructDeclNative structDecl;

    public $range_native()
    {
      this.$type_name = CommonSymbols.NIL;
      this.$base_type_predicate = CommonSymbols.NIL;
      this.$enumeration_type = CommonSymbols.NIL;
      this.$low_bound = CommonSymbols.NIL;
      this.$high_bound = CommonSymbols.NIL;
      this.$low_bound_predicate = CommonSymbols.NIL;
      this.$high_bound_predicate = CommonSymbols.NIL;
      this.$low_bound_type = CommonSymbols.NIL;
      this.$high_bound_type = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $range_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$base_type_predicate;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$enumeration_type;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$low_bound;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$high_bound;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$low_bound_predicate;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$high_bound_predicate;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$low_bound_type;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$high_bound_type;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$base_type_predicate = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$enumeration_type = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$low_bound = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$high_bound = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$low_bound_predicate = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$high_bound_predicate = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$low_bound_type = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$high_bound_type = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $range_native.class, $sym11$RANGE, $sym12$RANGE_P, $list13, $list14, new String[] { "$type_name", "$base_type_predicate", "$enumeration_type", "$low_bound",
        "$high_bound", "$low_bound_predicate", "$high_bound_predicate", "$low_bound_type", "$high_bound_type"
      }, $list15, $list16, $sym17$PRINT_RANGE );
    }
  }

  public static final class $range_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $range_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RANGE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return range_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 352 ms
 * 
 */