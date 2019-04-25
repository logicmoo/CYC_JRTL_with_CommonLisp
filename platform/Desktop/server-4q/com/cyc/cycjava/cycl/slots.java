package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class slots
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.slots";
  public static final String myFingerPrint = "4a2d23291686817aab2f337e9d998cd2f3f0d5b3d7a3f58d8bce6a0ae050d63f";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLSymbol $dtp_slot$;
  private static final SubLSymbol $sym0$SLOT;
  private static final SubLSymbol $sym1$SLOT_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_SLOT;
  private static final SubLSymbol $sym7$SLOT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SLOT_NAME;
  private static final SubLSymbol $sym10$_CSETF_SLOT_NAME;
  private static final SubLSymbol $sym11$SLOT_INDEX;
  private static final SubLSymbol $sym12$_CSETF_SLOT_INDEX;
  private static final SubLSymbol $sym13$SLOT_PROTECTION;
  private static final SubLSymbol $sym14$_CSETF_SLOT_PROTECTION;
  private static final SubLSymbol $sym15$SLOT_CLASS_NAME;
  private static final SubLSymbol $sym16$_CSETF_SLOT_CLASS_NAME;
  private static final SubLSymbol $sym17$SLOT_ESSENTIAL;
  private static final SubLSymbol $sym18$_CSETF_SLOT_ESSENTIAL;
  private static final SubLSymbol $sym19$SLOT_INIT_VALUE;
  private static final SubLSymbol $sym20$_CSETF_SLOT_INIT_VALUE;
  private static final SubLSymbol $kw21$NAME;
  private static final SubLSymbol $kw22$INDEX;
  private static final SubLSymbol $kw23$PROTECTION;
  private static final SubLSymbol $kw24$CLASS_NAME;
  private static final SubLSymbol $kw25$ESSENTIAL;
  private static final SubLSymbol $kw26$INIT_VALUE;
  private static final SubLString $str27$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw28$BEGIN;
  private static final SubLSymbol $sym29$MAKE_SLOT;
  private static final SubLSymbol $kw30$SLOT;
  private static final SubLSymbol $kw31$END;
  private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD;
  private static final SubLSymbol $kw33$PUBLIC;
  private static final SubLList $list34;
  private static final SubLString $str35$slot;
  private static final SubLSymbol $sym36$SLOT_;
  private static final SubLString $str37$__SLOT__name__S__index__S__protec;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$CLET;
  private static final SubLSymbol $sym40$CDOLIST;
  private static final SubLSymbol $sym41$CSETQ;
  private static final SubLSymbol $sym42$PWHEN;
  private static final SubLString $str43$GET_;
  private static final SubLString $str44$_;
  private static final SubLString $str45$SET_;
  private static final SubLString $str46$INLINE_GET_SLOT___S_is_not_a_vali;
  private static final SubLString $str47$INLINE_GET_SLOT___S_is_not_a_vali;
  private static final SubLSymbol $sym48$GET_SLOT;
  private static final SubLSymbol $sym49$QUOTE;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$SET_SLOT;
  private static final SubLList $list52;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_slot( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $slot_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_name(final SubLObject v_object)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_index(final SubLObject v_object)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_protection(final SubLObject v_object)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_class_name(final SubLObject v_object)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_essential(final SubLObject v_object)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject slot_init_value(final SubLObject v_object)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject _csetf_slot_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject _csetf_slot_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject _csetf_slot_protection(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject _csetf_slot_class_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject _csetf_slot_essential(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject _csetf_slot_init_value(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject make_slot(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $slot_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw21$NAME ) )
      {
        _csetf_slot_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$INDEX ) )
      {
        _csetf_slot_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$PROTECTION ) )
      {
        _csetf_slot_protection( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$CLASS_NAME ) )
      {
        _csetf_slot_class_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$ESSENTIAL ) )
      {
        _csetf_slot_essential( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$INIT_VALUE ) )
      {
        _csetf_slot_init_value( v_new, current_value );
      }
      else
      {
        Errors.error( $str27$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject visit_defstruct_slot(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw28$BEGIN, $sym29$MAKE_SLOT, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw21$NAME, slot_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw22$INDEX, slot_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw23$PROTECTION, slot_protection( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw24$CLASS_NAME, slot_class_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw25$ESSENTIAL, slot_essential( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw26$INIT_VALUE, slot_init_value( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$END, $sym29$MAKE_SLOT, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 822L)
  public static SubLObject visit_defstruct_object_slot_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_slot( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 942L)
  public static SubLObject new_slot(final SubLObject name, final SubLObject index, final SubLObject class_name, SubLObject protection, SubLObject is_essential, SubLObject init_value)
  {
    if( protection == UNPROVIDED )
    {
      protection = $kw33$PUBLIC;
    }
    if( is_essential == UNPROVIDED )
    {
      is_essential = NIL;
    }
    if( init_value == UNPROVIDED )
    {
      init_value = NIL;
    }
    final SubLObject slot = make_slot( UNPROVIDED );
    _csetf_slot_name( slot, name );
    _csetf_slot_index( slot, index );
    _csetf_slot_protection( slot, protection );
    _csetf_slot_class_name( slot, class_name );
    _csetf_slot_essential( slot, is_essential );
    _csetf_slot_init_value( slot, conses_high.copy_tree( init_value ) );
    return slot;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1379L)
  public static SubLObject with_slot(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    slot = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject slot_var = Symbols.make_symbol( $str35$slot );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( slot_var, slot, $sym36$SLOT_, $list2, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1634L)
  public static SubLObject with_slot_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    slot = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject slot_var = Symbols.make_symbol( $str35$slot );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( slot_var, slot, $sym36$SLOT_, $list2, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1901L)
  public static SubLObject print_slot(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject name = slot_name( v_object );
    final SubLObject index = slot_index( v_object );
    final SubLObject protection = slot_protection( v_object );
    final SubLObject class_name = slot_class_name( v_object );
    final SubLObject essential = slot_essential( v_object );
    final SubLObject init_value = slot_init_value( v_object );
    PrintLow.format( stream, $str37$__SLOT__name__S__index__S__protec, new SubLObject[] { name, index, protection, essential, class_name, init_value
    } );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2166L)
  public static SubLObject slot_assoc(final SubLObject slot_name, final SubLObject v_slots)
  {
    SubLObject cdolist_list_var = v_slots;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject slot_$1 = slot;
      final SubLObject name = slot_name( slot_$1 );
      if( slot_name.eql( name ) )
      {
        return slot;
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2318L)
  public static SubLObject slot_assoc_by_name(final SubLObject string, final SubLObject v_slots)
  {
    SubLObject cdolist_list_var = v_slots;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject slot_$2 = slot;
      final SubLObject name = slot_name( slot_$2 );
      if( string.equal( Symbols.symbol_name( name ) ) )
      {
        return slot;
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2489L)
  public static SubLObject find_slot_index(final SubLObject slot_name, final SubLObject v_slots)
  {
    final SubLObject slot = slot_assoc( slot_name, v_slots );
    if( NIL != slot )
    {
      return slot_index( slot );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2651L)
  public static SubLObject find_slot_protection(final SubLObject slot_name, final SubLObject v_slots)
  {
    final SubLObject slot = slot_assoc( slot_name, v_slots );
    if( NIL != slot )
    {
      return slot_protection( slot );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2823L)
  public static SubLObject find_slot_class_name(final SubLObject slot_name, final SubLObject v_slots)
  {
    final SubLObject slot = slot_assoc( slot_name, v_slots );
    if( NIL != slot )
    {
      return slot_class_name( slot );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2995L)
  public static SubLObject find_slot_essential(final SubLObject slot_name, final SubLObject v_slots)
  {
    final SubLObject slot = slot_assoc( slot_name, v_slots );
    if( NIL != slot )
    {
      return slot_essential( slot );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3165L)
  public static SubLObject find_slot_init_value(final SubLObject slot_name, final SubLObject v_slots)
  {
    final SubLObject slot = slot_assoc( slot_name, v_slots );
    if( NIL != slot )
    {
      return slot_init_value( slot );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3337L)
  public static SubLObject set_slot_init_value(final SubLObject slot_name, final SubLObject v_slots, final SubLObject init_value)
  {
    final SubLObject slot = slot_assoc( slot_name, v_slots );
    if( NIL != slot )
    {
      _csetf_slot_init_value( slot, conses_high.copy_tree( init_value ) );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3544L)
  public static SubLObject cdoslots(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name_var = NIL;
    SubLObject index_var = NIL;
    SubLObject protection_var = NIL;
    SubLObject class_name_var = NIL;
    SubLObject init_value_var = NIL;
    SubLObject slots_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    name_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    protection_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    class_name_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    init_value_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    slots_form = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject slot_var = Symbols.make_symbol( $str35$slot );
      return ConsesLow.list( $sym39$CLET, reader.bq_cons( name_var, ConsesLow.append( new SubLObject[] { ( NIL != index_var ) ? ConsesLow.list( index_var ) : NIL, ( NIL != protection_var ) ? ConsesLow.list(
          protection_var ) : NIL, ( NIL != class_name_var ) ? ConsesLow.list( class_name_var ) : NIL, ( NIL != init_value_var ) ? ConsesLow.list( init_value_var ) : NIL, NIL
      } ) ), ConsesLow.listS( $sym40$CDOLIST, ConsesLow.list( slot_var, slots_form ), ConsesLow.list( $sym41$CSETQ, name_var, ConsesLow.list( $sym9$SLOT_NAME, slot_var ) ), ConsesLow.append( new SubLObject[] {
        ( NIL != index_var ) ? ConsesLow.list( ConsesLow.list( $sym41$CSETQ, index_var, ConsesLow.list( $sym11$SLOT_INDEX, slot_var ) ) ) : NIL, ( NIL != protection_var ) ? ConsesLow.list( ConsesLow.list( $sym41$CSETQ,
            protection_var, ConsesLow.list( $sym13$SLOT_PROTECTION, slot_var ) ) ) : NIL, ( NIL != class_name_var ) ? ConsesLow.list( ConsesLow.list( $sym41$CSETQ, class_name_var, ConsesLow.list( $sym15$SLOT_CLASS_NAME,
                slot_var ) ) ) : NIL, ( NIL != init_value_var ) ? ConsesLow.list( ConsesLow.list( $sym41$CSETQ, init_value_var, ConsesLow.list( $sym19$SLOT_INIT_VALUE, slot_var ) ) ) : NIL, body
      } ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4429L)
  public static SubLObject cdo_essential_slots(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name_var = NIL;
    SubLObject index_var = NIL;
    SubLObject protection_var = NIL;
    SubLObject class_name_var = NIL;
    SubLObject init_value_var = NIL;
    SubLObject slots_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    name_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    protection_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    class_name_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    init_value_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    slots_form = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject slot_var = Symbols.make_symbol( $str35$slot );
      return ConsesLow.list( $sym39$CLET, reader.bq_cons( name_var, ConsesLow.append( new SubLObject[] { ( NIL != index_var ) ? ConsesLow.list( index_var ) : NIL, ( NIL != protection_var ) ? ConsesLow.list(
          protection_var ) : NIL, ( NIL != class_name_var ) ? ConsesLow.list( class_name_var ) : NIL, ( NIL != init_value_var ) ? ConsesLow.list( init_value_var ) : NIL, NIL
      } ) ), ConsesLow.list( $sym40$CDOLIST, ConsesLow.list( slot_var, slots_form ), ConsesLow.listS( $sym42$PWHEN, ConsesLow.list( $sym17$SLOT_ESSENTIAL, slot_var ), ConsesLow.list( $sym41$CSETQ, name_var, ConsesLow
          .list( $sym9$SLOT_NAME, slot_var ) ), ConsesLow.append( new SubLObject[]
          { ( NIL != index_var ) ? ConsesLow.list( ConsesLow.list( $sym41$CSETQ, index_var, ConsesLow.list( $sym11$SLOT_INDEX, slot_var ) ) ) : NIL, ( NIL != protection_var ) ? ConsesLow.list( ConsesLow.list(
              $sym41$CSETQ, protection_var, ConsesLow.list( $sym13$SLOT_PROTECTION, slot_var ) ) ) : NIL, ( NIL != class_name_var ) ? ConsesLow.list( ConsesLow.list( $sym41$CSETQ, class_name_var, ConsesLow.list(
                  $sym15$SLOT_CLASS_NAME, slot_var ) ) ) : NIL, ( NIL != init_value_var ) ? ConsesLow.list( ConsesLow.list( $sym41$CSETQ, init_value_var, ConsesLow.list( $sym19$SLOT_INIT_VALUE, slot_var ) ) ) : NIL, body
      } ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5354L)
  public static SubLObject get_slot_accessors(final SubLObject v_slots, final SubLObject target_slot_name)
  {
    SubLObject slot_name = NIL;
    SubLObject class_name = NIL;
    SubLObject cdolist_list_var = v_slots;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slot_name( slot );
      class_name = slot_class_name( slot );
      if( slot_name.eql( target_slot_name ) )
      {
        return Values.values( Packages.intern( Sequences.cconcatenate( $str43$GET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str44$_, Symbols.symbol_name( slot_name )
        } ), UNPROVIDED ), Packages.intern( Sequences.cconcatenate( $str45$SET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str44$_, Symbols.symbol_name( slot_name )
        } ), UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5711L)
  public static SubLObject get_instance_slot_accessors(final SubLObject v_class, final SubLObject target_slot_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class );
    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class );
    thread.resetMultipleValues();
    SubLObject getter = get_slot_accessors( compiled_class_boolean_slot_access_alist, target_slot_name );
    SubLObject setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != getter && NIL != setter )
    {
      return Values.values( getter, setter );
    }
    thread.resetMultipleValues();
    getter = get_slot_accessors( compiled_class_slot_access_alist, target_slot_name );
    setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != getter && NIL != setter )
    {
      return Values.values( getter, setter );
    }
    thread.resetMultipleValues();
    getter = get_slot_accessors( compiled_instance_boolean_slot_access_alist, target_slot_name );
    setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != getter && NIL != setter )
    {
      return Values.values( getter, setter );
    }
    thread.resetMultipleValues();
    getter = get_slot_accessors( compiled_instance_slot_access_alist, target_slot_name );
    setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != getter && NIL != setter )
    {
      return Values.values( getter, setter );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6568L)
  public static SubLObject get_class_slot_accessors(final SubLObject v_class, final SubLObject target_slot_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class );
    thread.resetMultipleValues();
    SubLObject getter = get_slot_accessors( compiled_class_boolean_slot_access_alist, target_slot_name );
    SubLObject setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != getter && NIL != setter )
    {
      return Values.values( getter, setter );
    }
    thread.resetMultipleValues();
    getter = get_slot_accessors( compiled_class_slot_access_alist, target_slot_name );
    setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != getter && NIL != setter )
    {
      return Values.values( getter, setter );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7050L)
  public static SubLObject expand_inline_get_slot(final SubLObject slot_name, final SubLObject class_name, final SubLObject class_or_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == slot_name || !slot_name.isSymbol() ) )
    {
      Errors.error( $str46$INLINE_GET_SLOT___S_is_not_a_vali, slot_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == class_name || !class_name.isSymbol() ) )
    {
      Errors.error( $str47$INLINE_GET_SLOT___S_is_not_a_vali, class_name );
    }
    final SubLObject actual_class = classes.classes_retrieve_class( class_name );
    if( NIL == actual_class )
    {
      return ConsesLow.list( $sym48$GET_SLOT, class_or_instance, ConsesLow.list( $sym49$QUOTE, slot_name ) );
    }
    thread.resetMultipleValues();
    final SubLObject getter = get_instance_slot_accessors( actual_class, slot_name );
    final SubLObject setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != getter )
    {
      return ConsesLow.list( getter, class_or_instance );
    }
    ConsesLow.list( $sym48$GET_SLOT, class_or_instance, ConsesLow.list( $sym49$QUOTE, slot_name ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7776L)
  public static SubLObject inline_get_slot(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject slot_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    slot_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject class_or_instance = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
      class_or_instance = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return expand_inline_get_slot( slot_name, class_name, class_or_instance );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7919L)
  public static SubLObject expand_inline_set_slot(final SubLObject slot_name, final SubLObject class_name, final SubLObject class_or_instance, final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == slot_name || !slot_name.isSymbol() ) )
    {
      Errors.error( $str46$INLINE_GET_SLOT___S_is_not_a_vali, slot_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == class_name || !class_name.isSymbol() ) )
    {
      Errors.error( $str47$INLINE_GET_SLOT___S_is_not_a_vali, class_name );
    }
    final SubLObject actual_class = classes.classes_retrieve_class( class_name );
    if( NIL == actual_class )
    {
      return ConsesLow.list( $sym51$SET_SLOT, class_or_instance, ConsesLow.list( $sym49$QUOTE, slot_name ), new_value );
    }
    thread.resetMultipleValues();
    final SubLObject getter = get_instance_slot_accessors( actual_class, slot_name );
    final SubLObject setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != setter )
    {
      return ConsesLow.list( setter, class_or_instance, new_value );
    }
    ConsesLow.list( $sym51$SET_SLOT, class_or_instance, ConsesLow.list( $sym49$QUOTE, slot_name ), new_value );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8688L)
  public static SubLObject inline_set_slot(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject slot_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    slot_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject class_or_instance = NIL;
      SubLObject new_value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
      class_or_instance = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
      new_value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return expand_inline_set_slot( slot_name, class_name, class_or_instance, new_value );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
    }
    return NIL;
  }

  public static SubLObject declare_slots_file()
  {
    SubLFiles.declareFunction( me, "slot_print_function_trampoline", "SLOT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "slot_p", "SLOT-P", 1, 0, false );
    new $slot_p$UnaryFunction();
    SubLFiles.declareFunction( me, "slot_name", "SLOT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "slot_index", "SLOT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "slot_protection", "SLOT-PROTECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "slot_class_name", "SLOT-CLASS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "slot_essential", "SLOT-ESSENTIAL", 1, 0, false );
    SubLFiles.declareFunction( me, "slot_init_value", "SLOT-INIT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slot_name", "_CSETF-SLOT-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slot_index", "_CSETF-SLOT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slot_protection", "_CSETF-SLOT-PROTECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slot_class_name", "_CSETF-SLOT-CLASS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slot_essential", "_CSETF-SLOT-ESSENTIAL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slot_init_value", "_CSETF-SLOT-INIT-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_slot", "MAKE-SLOT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_slot", "VISIT-DEFSTRUCT-SLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_slot_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_slot", "NEW-SLOT", 3, 3, false );
    SubLFiles.declareMacro( me, "with_slot", "WITH-SLOT" );
    SubLFiles.declareMacro( me, "with_slot_private", "WITH-SLOT-PRIVATE" );
    SubLFiles.declareFunction( me, "print_slot", "PRINT-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "slot_assoc", "SLOT-ASSOC", 2, 0, false );
    SubLFiles.declareFunction( me, "slot_assoc_by_name", "SLOT-ASSOC-BY-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "find_slot_index", "FIND-SLOT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "find_slot_protection", "FIND-SLOT-PROTECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_slot_class_name", "FIND-SLOT-CLASS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "find_slot_essential", "FIND-SLOT-ESSENTIAL", 2, 0, false );
    SubLFiles.declareFunction( me, "find_slot_init_value", "FIND-SLOT-INIT-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_slot_init_value", "SET-SLOT-INIT-VALUE", 3, 0, false );
    SubLFiles.declareMacro( me, "cdoslots", "CDOSLOTS" );
    SubLFiles.declareMacro( me, "cdo_essential_slots", "CDO-ESSENTIAL-SLOTS" );
    SubLFiles.declareFunction( me, "get_slot_accessors", "GET-SLOT-ACCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_instance_slot_accessors", "GET-INSTANCE-SLOT-ACCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_class_slot_accessors", "GET-CLASS-SLOT-ACCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_inline_get_slot", "EXPAND-INLINE-GET-SLOT", 3, 0, false );
    SubLFiles.declareMacro( me, "inline_get_slot", "INLINE-GET-SLOT" );
    SubLFiles.declareFunction( me, "expand_inline_set_slot", "EXPAND-INLINE-SET-SLOT", 4, 0, false );
    SubLFiles.declareMacro( me, "inline_set_slot", "INLINE-SET-SLOT" );
    return NIL;
  }

  public static SubLObject init_slots_file()
  {
    $dtp_slot$ = SubLFiles.defconstant( "*DTP-SLOT*", $sym0$SLOT );
    return NIL;
  }

  public static SubLObject setup_slots_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_slot$.getGlobalValue(), Symbols.symbol_function( $sym7$SLOT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$SLOT_NAME, $sym10$_CSETF_SLOT_NAME );
    Structures.def_csetf( $sym11$SLOT_INDEX, $sym12$_CSETF_SLOT_INDEX );
    Structures.def_csetf( $sym13$SLOT_PROTECTION, $sym14$_CSETF_SLOT_PROTECTION );
    Structures.def_csetf( $sym15$SLOT_CLASS_NAME, $sym16$_CSETF_SLOT_CLASS_NAME );
    Structures.def_csetf( $sym17$SLOT_ESSENTIAL, $sym18$_CSETF_SLOT_ESSENTIAL );
    Structures.def_csetf( $sym19$SLOT_INIT_VALUE, $sym20$_CSETF_SLOT_INIT_VALUE );
    Equality.identity( $sym0$SLOT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_slot$.getGlobalValue(), Symbols.symbol_function( $sym32$VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_slots_file();
  }

  @Override
  public void initializeVariables()
  {
    init_slots_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_slots_file();
  }
  static
  {
    me = new slots();
    $dtp_slot$ = null;
    $sym0$SLOT = makeSymbol( "SLOT" );
    $sym1$SLOT_P = makeSymbol( "SLOT-P" );
    $list2 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "INDEX" ), makeSymbol( "PROTECTION" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "ESSENTIAL" ), makeSymbol( "INIT-VALUE" ) );
    $list3 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "INDEX" ), makeKeyword( "PROTECTION" ), makeKeyword( "CLASS-NAME" ), makeKeyword( "ESSENTIAL" ), makeKeyword( "INIT-VALUE" ) );
    $list4 = ConsesLow.list( makeSymbol( "SLOT-NAME" ), makeSymbol( "SLOT-INDEX" ), makeSymbol( "SLOT-PROTECTION" ), makeSymbol( "SLOT-CLASS-NAME" ), makeSymbol( "SLOT-ESSENTIAL" ), makeSymbol( "SLOT-INIT-VALUE" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-SLOT-NAME" ), makeSymbol( "_CSETF-SLOT-INDEX" ), makeSymbol( "_CSETF-SLOT-PROTECTION" ), makeSymbol( "_CSETF-SLOT-CLASS-NAME" ), makeSymbol( "_CSETF-SLOT-ESSENTIAL" ),
        makeSymbol( "_CSETF-SLOT-INIT-VALUE" ) );
    $sym6$PRINT_SLOT = makeSymbol( "PRINT-SLOT" );
    $sym7$SLOT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SLOT-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SLOT-P" ) );
    $sym9$SLOT_NAME = makeSymbol( "SLOT-NAME" );
    $sym10$_CSETF_SLOT_NAME = makeSymbol( "_CSETF-SLOT-NAME" );
    $sym11$SLOT_INDEX = makeSymbol( "SLOT-INDEX" );
    $sym12$_CSETF_SLOT_INDEX = makeSymbol( "_CSETF-SLOT-INDEX" );
    $sym13$SLOT_PROTECTION = makeSymbol( "SLOT-PROTECTION" );
    $sym14$_CSETF_SLOT_PROTECTION = makeSymbol( "_CSETF-SLOT-PROTECTION" );
    $sym15$SLOT_CLASS_NAME = makeSymbol( "SLOT-CLASS-NAME" );
    $sym16$_CSETF_SLOT_CLASS_NAME = makeSymbol( "_CSETF-SLOT-CLASS-NAME" );
    $sym17$SLOT_ESSENTIAL = makeSymbol( "SLOT-ESSENTIAL" );
    $sym18$_CSETF_SLOT_ESSENTIAL = makeSymbol( "_CSETF-SLOT-ESSENTIAL" );
    $sym19$SLOT_INIT_VALUE = makeSymbol( "SLOT-INIT-VALUE" );
    $sym20$_CSETF_SLOT_INIT_VALUE = makeSymbol( "_CSETF-SLOT-INIT-VALUE" );
    $kw21$NAME = makeKeyword( "NAME" );
    $kw22$INDEX = makeKeyword( "INDEX" );
    $kw23$PROTECTION = makeKeyword( "PROTECTION" );
    $kw24$CLASS_NAME = makeKeyword( "CLASS-NAME" );
    $kw25$ESSENTIAL = makeKeyword( "ESSENTIAL" );
    $kw26$INIT_VALUE = makeKeyword( "INIT-VALUE" );
    $str27$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw28$BEGIN = makeKeyword( "BEGIN" );
    $sym29$MAKE_SLOT = makeSymbol( "MAKE-SLOT" );
    $kw30$SLOT = makeKeyword( "SLOT" );
    $kw31$END = makeKeyword( "END" );
    $sym32$VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SLOT-METHOD" );
    $kw33$PUBLIC = makeKeyword( "PUBLIC" );
    $list34 = ConsesLow.list( makeSymbol( "SLOT" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str35$slot = makeString( "slot" );
    $sym36$SLOT_ = makeSymbol( "SLOT-" );
    $str37$__SLOT__name__S__index__S__protec = makeString( "#<SLOT: name=~S, index=~S, protection=~S, essential=~S, class=~S, init-value=~S>" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME-VAR" ), makeSymbol( "INDEX-VAR" ), makeSymbol( "PROTECTION-VAR" ), makeSymbol( "CLASS-NAME-VAR" ), makeSymbol( "INIT-VALUE-VAR" ), makeSymbol(
        "SLOTS-FORM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$CLET = makeSymbol( "CLET" );
    $sym40$CDOLIST = makeSymbol( "CDOLIST" );
    $sym41$CSETQ = makeSymbol( "CSETQ" );
    $sym42$PWHEN = makeSymbol( "PWHEN" );
    $str43$GET_ = makeString( "GET-" );
    $str44$_ = makeString( "-" );
    $str45$SET_ = makeString( "SET-" );
    $str46$INLINE_GET_SLOT___S_is_not_a_vali = makeString( "INLINE-GET-SLOT: ~S is not a valid slot name.  A non-nil symbol was expected." );
    $str47$INLINE_GET_SLOT___S_is_not_a_vali = makeString( "INLINE-GET-SLOT: ~S is not a valid class name.  A non-nil symbol was expected." );
    $sym48$GET_SLOT = makeSymbol( "GET-SLOT" );
    $sym49$QUOTE = makeSymbol( "QUOTE" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "SLOT-NAME" ), makeSymbol( "CLASS-NAME" ) ), makeSymbol( "CLASS-OR-INSTANCE" ) );
    $sym51$SET_SLOT = makeSymbol( "SET-SLOT" );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "SLOT-NAME" ), makeSymbol( "CLASS-NAME" ) ), makeSymbol( "CLASS-OR-INSTANCE" ), makeSymbol( "NEW-VALUE" ) );
  }

  public static final class $slot_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $index;
    public SubLObject $protection;
    public SubLObject $class_name;
    public SubLObject $essential;
    public SubLObject $init_value;
    private static final SubLStructDeclNative structDecl;

    public $slot_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$index = CommonSymbols.NIL;
      this.$protection = CommonSymbols.NIL;
      this.$class_name = CommonSymbols.NIL;
      this.$essential = CommonSymbols.NIL;
      this.$init_value = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $slot_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$index;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$protection;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$class_name;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$essential;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$init_value;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$index = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$protection = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$class_name = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$essential = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$init_value = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $slot_native.class, $sym0$SLOT, $sym1$SLOT_P, $list2, $list3, new String[] { "$name", "$index", "$protection", "$class_name", "$essential", "$init_value"
      }, $list4, $list5, $sym6$PRINT_SLOT );
    }
  }

  public static final class $slot_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $slot_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SLOT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return slot_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 212 ms
 * 
 */