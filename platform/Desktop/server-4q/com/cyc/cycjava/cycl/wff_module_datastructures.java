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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wff_module_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wff_module_datastructures";
  public static final String myFingerPrint = "a307e43acbf90ce65cf4b46b804cded9badb742f5474dc68807abe7925512ace";
  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLSymbol $dtp_wff_module$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3314L)
  private static SubLSymbol $wff_module_store$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4815L)
  private static SubLSymbol $wff_module_properties$;
  private static final SubLSymbol $sym0$WFF_MODULE;
  private static final SubLSymbol $sym1$WFF_MODULE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_WFF_MODULE;
  private static final SubLSymbol $sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$WFF_MOD_NAME;
  private static final SubLSymbol $sym10$_CSETF_WFF_MOD_NAME;
  private static final SubLSymbol $sym11$WFF_MOD_PLIST;
  private static final SubLSymbol $sym12$_CSETF_WFF_MOD_PLIST;
  private static final SubLSymbol $kw13$NAME;
  private static final SubLSymbol $kw14$PLIST;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_WFF_MODULE;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD;
  private static final SubLString $str21$_WFF_Module___a_;
  private static final SubLSymbol $sym22$PROPERTY_LIST_P;
  private static final SubLSymbol $kw23$FREE;
  private static final SubLSymbol $sym24$_WFF_MODULE_STORE_;
  private static final SubLInteger $int25$212;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw29$DONE;
  private static final SubLSymbol $sym30$NAME_VAR;
  private static final SubLSymbol $sym31$DO_HASH_TABLE;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$IGNORE;
  private static final SubLSymbol $sym34$WFF_MODULE_STORE;
  private static final SubLSymbol $sym35$DO_WFF_MODULES;
  private static final SubLSymbol $kw36$MODULE_TYPE;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$CAR;
  private static final SubLSymbol $sym39$WFF_MODULE_PROPERTY_LIST_P;
  private static final SubLSymbol $kw40$VIOLATION;
  private static final SubLSymbol $kw41$EXPLAIN_FUNC;
  private static final SubLSymbol $kw42$EXPLAIN_ARGS;

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject wff_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_wff_module( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject wff_module_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $wff_module_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject wff_mod_name(final SubLObject v_object)
  {
    assert NIL != wff_module_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject wff_mod_plist(final SubLObject v_object)
  {
    assert NIL != wff_module_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject _csetf_wff_mod_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != wff_module_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject _csetf_wff_mod_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != wff_module_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject make_wff_module(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $wff_module_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$NAME ) )
      {
        _csetf_wff_mod_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$PLIST ) )
      {
        _csetf_wff_mod_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject visit_defstruct_wff_module(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_WFF_MODULE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$NAME, wff_mod_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$PLIST, wff_mod_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_WFF_MODULE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
  public static SubLObject visit_defstruct_object_wff_module_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_wff_module( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1618L)
  public static SubLObject print_wff_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject name = wff_module_name( v_object );
    PrintLow.format( stream, $str21$_WFF_Module___a_, name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1791L)
  public static SubLObject new_wff_module(final SubLObject name, final SubLObject plist)
  {
    assert NIL != list_utilities.property_list_p( plist ) : plist;
    final SubLObject wff_module = allocate_wff_module( name );
    _csetf_wff_mod_plist( wff_module, plist );
    add_wff_module( wff_module );
    return wff_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2139L)
  public static SubLObject allocate_wff_module(final SubLObject name)
  {
    SubLObject wff_module = find_wff_module_by_name( name );
    if( NIL != wff_module )
    {
      remove_wff_module( wff_module );
    }
    else
    {
      wff_module = make_wff_module( UNPROVIDED );
      _csetf_wff_mod_name( wff_module, name );
    }
    _csetf_wff_mod_plist( wff_module, NIL );
    return wff_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2451L)
  public static SubLObject destroy_wff_module(final SubLObject wff_module)
  {
    remove_wff_module( wff_module );
    _csetf_wff_mod_plist( wff_module, $kw23$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2604L)
  public static SubLObject wff_module_name(final SubLObject wff_module)
  {
    assert NIL != wff_module_p( wff_module ) : wff_module;
    return wff_mod_name( wff_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2804L)
  public static SubLObject wff_module_plist(final SubLObject wff_module)
  {
    assert NIL != wff_module_p( wff_module ) : wff_module;
    return wff_mod_plist( wff_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2926L)
  public static SubLObject wff_module_property(final SubLObject wff_module, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != wff_module_p( wff_module ) : wff_module;
    final SubLObject plist = wff_module_plist( wff_module );
    return conses_high.getf( plist, property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3515L)
  public static SubLObject do_wff_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject wff_module_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    wff_module_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      if( NIL == conses_high.member( current_$1, $list27, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw28$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw29$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject name_var = $sym30$NAME_VAR;
    return ConsesLow.listS( $sym31$DO_HASH_TABLE, ConsesLow.list( name_var, wff_module_var, $list32, $kw29$DONE, done ), ConsesLow.list( $sym33$IGNORE, name_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3754L)
  public static SubLObject wff_module_store()
  {
    return $wff_module_store$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3850L)
  public static SubLObject find_wff_module_by_name(final SubLObject name)
  {
    final SubLObject wff_module = Hashtables.gethash( name, $wff_module_store$.getGlobalValue(), UNPROVIDED );
    return wff_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3990L)
  public static SubLObject add_wff_module(final SubLObject wff_module)
  {
    assert NIL != wff_module_p( wff_module ) : wff_module;
    final SubLObject name = wff_module_name( wff_module );
    Hashtables.sethash( name, $wff_module_store$.getGlobalValue(), wff_module );
    return wff_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4203L)
  public static SubLObject remove_wff_module(final SubLObject wff_module)
  {
    assert NIL != wff_module_p( wff_module ) : wff_module;
    final SubLObject name = wff_module_name( wff_module );
    Hashtables.remhash( name, $wff_module_store$.getGlobalValue() );
    return wff_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4395L)
  public static SubLObject setup_wff_module(final SubLObject name, final SubLObject type, final SubLObject plist)
  {
    SubLObject new_plist = conses_high.copy_list( plist );
    new_plist = conses_high.putf( plist, $kw36$MODULE_TYPE, type );
    final SubLObject wff_module = new_wff_module( name, new_plist );
    return wff_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4697L)
  public static SubLObject wff_module_type(final SubLObject wff_module)
  {
    return wff_module_property( wff_module, $kw36$MODULE_TYPE, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 5315L)
  public static SubLObject wff_violation_type_p(final SubLObject v_object)
  {
    return list_utilities.sublisp_boolean( find_wff_module_by_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 5573L)
  public static SubLObject wff_violation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object || ( v_object.isCons() && NIL != wff_violation_type_p( v_object.first() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 5793L)
  public static SubLObject wff_module_property_p(final SubLObject property, final SubLObject value)
  {
    if( !property.isKeyword() )
    {
      return NIL;
    }
    SubLObject value_type = NIL;
    value_type = Sequences.find( property, $wff_module_properties$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym38$CAR ), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL != value_type )
    {
      return Functions.funcall( value_type, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 6082L)
  public static SubLObject wff_module_property_list_p(final SubLObject v_object)
  {
    if( NIL == list_utilities.property_list_p( v_object ) )
    {
      return NIL;
    }
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = v_object; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      if( NIL == wff_module_property_p( property, value ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 6307L)
  public static SubLObject wff_violation_module(final SubLObject name, final SubLObject plist)
  {
    assert NIL != wff_module_property_list_p( plist ) : plist;
    final SubLObject wff_module = setup_wff_module( name, $kw40$VIOLATION, plist );
    return wff_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 8199L)
  public static SubLObject wff_violation_explanation_function(final SubLObject wff_violation_name)
  {
    return wff_module_property( find_wff_module_by_name( wff_violation_name ), $kw41$EXPLAIN_FUNC, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 8391L)
  public static SubLObject wff_violation_explanation_function_args(final SubLObject wff_violation_name)
  {
    return wff_module_property( find_wff_module_by_name( wff_violation_name ), $kw42$EXPLAIN_ARGS, NIL );
  }

  public static SubLObject declare_wff_module_datastructures_file()
  {
    SubLFiles.declareFunction( me, "wff_module_print_function_trampoline", "WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "wff_module_p", "WFF-MODULE-P", 1, 0, false );
    new $wff_module_p$UnaryFunction();
    SubLFiles.declareFunction( me, "wff_mod_name", "WFF-MOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_mod_plist", "WFF-MOD-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_wff_mod_name", "_CSETF-WFF-MOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_wff_mod_plist", "_CSETF-WFF-MOD-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_wff_module", "MAKE-WFF-MODULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_wff_module", "VISIT-DEFSTRUCT-WFF-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_wff_module_method", "VISIT-DEFSTRUCT-OBJECT-WFF-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_wff_module", "PRINT-WFF-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_wff_module", "NEW-WFF-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "allocate_wff_module", "ALLOCATE-WFF-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_wff_module", "DESTROY-WFF-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_module_name", "WFF-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_module_plist", "WFF-MODULE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_module_property", "WFF-MODULE-PROPERTY", 2, 1, false );
    SubLFiles.declareMacro( me, "do_wff_modules", "DO-WFF-MODULES" );
    SubLFiles.declareFunction( me, "wff_module_store", "WFF-MODULE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_wff_module_by_name", "FIND-WFF-MODULE-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "add_wff_module", "ADD-WFF-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_wff_module", "REMOVE-WFF-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "setup_wff_module", "SETUP-WFF-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "wff_module_type", "WFF-MODULE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_violation_type_p", "WFF-VIOLATION-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_violation_p", "WFF-VIOLATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_module_property_p", "WFF-MODULE-PROPERTY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "wff_module_property_list_p", "WFF-MODULE-PROPERTY-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_violation_module", "WFF-VIOLATION-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "wff_violation_explanation_function", "WFF-VIOLATION-EXPLANATION-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_violation_explanation_function_args", "WFF-VIOLATION-EXPLANATION-FUNCTION-ARGS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_wff_module_datastructures_file()
  {
    $dtp_wff_module$ = SubLFiles.defconstant( "*DTP-WFF-MODULE*", $sym0$WFF_MODULE );
    $wff_module_store$ = SubLFiles.deflexical( "*WFF-MODULE-STORE*", maybeDefault( $sym24$_WFF_MODULE_STORE_, $wff_module_store$, () -> ( Hashtables.make_hash_table( $int25$212, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    $wff_module_properties$ = SubLFiles.deflexical( "*WFF-MODULE-PROPERTIES*", $list37 );
    return NIL;
  }

  public static SubLObject setup_wff_module_datastructures_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_wff_module$.getGlobalValue(), Symbols.symbol_function( $sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$WFF_MOD_NAME, $sym10$_CSETF_WFF_MOD_NAME );
    Structures.def_csetf( $sym11$WFF_MOD_PLIST, $sym12$_CSETF_WFF_MOD_PLIST );
    Equality.identity( $sym0$WFF_MODULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_wff_module$.getGlobalValue(), Symbols.symbol_function( $sym20$VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym24$_WFF_MODULE_STORE_ );
    access_macros.register_macro_helper( $sym34$WFF_MODULE_STORE, $sym35$DO_WFF_MODULES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wff_module_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wff_module_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wff_module_datastructures_file();
  }
  static
  {
    me = new wff_module_datastructures();
    $dtp_wff_module$ = null;
    $wff_module_store$ = null;
    $wff_module_properties$ = null;
    $sym0$WFF_MODULE = makeSymbol( "WFF-MODULE" );
    $sym1$WFF_MODULE_P = makeSymbol( "WFF-MODULE-P" );
    $list2 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PLIST" ) );
    $list3 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "PLIST" ) );
    $list4 = ConsesLow.list( makeSymbol( "WFF-MOD-NAME" ), makeSymbol( "WFF-MOD-PLIST" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-WFF-MOD-NAME" ), makeSymbol( "_CSETF-WFF-MOD-PLIST" ) );
    $sym6$PRINT_WFF_MODULE = makeSymbol( "PRINT-WFF-MODULE" );
    $sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "WFF-MODULE-P" ) );
    $sym9$WFF_MOD_NAME = makeSymbol( "WFF-MOD-NAME" );
    $sym10$_CSETF_WFF_MOD_NAME = makeSymbol( "_CSETF-WFF-MOD-NAME" );
    $sym11$WFF_MOD_PLIST = makeSymbol( "WFF-MOD-PLIST" );
    $sym12$_CSETF_WFF_MOD_PLIST = makeSymbol( "_CSETF-WFF-MOD-PLIST" );
    $kw13$NAME = makeKeyword( "NAME" );
    $kw14$PLIST = makeKeyword( "PLIST" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_WFF_MODULE = makeSymbol( "MAKE-WFF-MODULE" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-WFF-MODULE-METHOD" );
    $str21$_WFF_Module___a_ = makeString( "[WFF Module: ~a]" );
    $sym22$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $kw23$FREE = makeKeyword( "FREE" );
    $sym24$_WFF_MODULE_STORE_ = makeSymbol( "*WFF-MODULE-STORE*" );
    $int25$212 = makeInteger( 212 );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "WFF-MODULE-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list27 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw28$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw29$DONE = makeKeyword( "DONE" );
    $sym30$NAME_VAR = makeUninternedSymbol( "NAME-VAR" );
    $sym31$DO_HASH_TABLE = makeSymbol( "DO-HASH-TABLE" );
    $list32 = ConsesLow.list( makeSymbol( "WFF-MODULE-STORE" ) );
    $sym33$IGNORE = makeSymbol( "IGNORE" );
    $sym34$WFF_MODULE_STORE = makeSymbol( "WFF-MODULE-STORE" );
    $sym35$DO_WFF_MODULES = makeSymbol( "DO-WFF-MODULES" );
    $kw36$MODULE_TYPE = makeKeyword( "MODULE-TYPE" );
    $list37 = ConsesLow.list( ConsesLow.cons( makeKeyword( "EXPLAIN-FUNC" ), makeSymbol( "SYMBOLP" ) ), ConsesLow.cons( makeKeyword( "COMMENT" ), makeSymbol( "STRINGP" ) ) );
    $sym38$CAR = makeSymbol( "CAR" );
    $sym39$WFF_MODULE_PROPERTY_LIST_P = makeSymbol( "WFF-MODULE-PROPERTY-LIST-P" );
    $kw40$VIOLATION = makeKeyword( "VIOLATION" );
    $kw41$EXPLAIN_FUNC = makeKeyword( "EXPLAIN-FUNC" );
    $kw42$EXPLAIN_ARGS = makeKeyword( "EXPLAIN-ARGS" );
  }

  public static final class $wff_module_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $wff_module_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $wff_module_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $wff_module_native.class, $sym0$WFF_MODULE, $sym1$WFF_MODULE_P, $list2, $list3, new String[] { "$name", "$plist"
      }, $list4, $list5, $sym6$PRINT_WFF_MODULE );
    }
  }

  public static final class $wff_module_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $wff_module_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "WFF-MODULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return wff_module_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 150 ms
 * 
 */