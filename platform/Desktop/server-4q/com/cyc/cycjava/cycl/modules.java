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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class modules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.modules";
  public static final String myFingerPrint = "275979802cb485ca4f7a11bbeead3ab8529bad07852cae77684b18f6fcb2f5af";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1240L)
  private static SubLSymbol $module_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1404L)
  private static SubLSymbol $system_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLSymbol $dtp_module$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4347L)
  private static SubLSymbol $module_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLSymbol $dtp_system$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12979L)
  private static SubLSymbol $system_index$;
  private static final SubLString $str0$Module_Lock;
  private static final SubLSymbol $sym1$WITH_LOCK_HELD;
  private static final SubLList $list2;
  private static final SubLString $str3$System_Lock;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$MODULE;
  private static final SubLSymbol $sym6$MODULE_P;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$PRINT_MODULE;
  private static final SubLSymbol $sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$MODULE_BASIS;
  private static final SubLSymbol $sym15$_CSETF_MODULE_BASIS;
  private static final SubLSymbol $sym16$MODULE_NAME;
  private static final SubLSymbol $sym17$_CSETF_MODULE_NAME;
  private static final SubLSymbol $sym18$MODULE_SYSTEM;
  private static final SubLSymbol $sym19$_CSETF_MODULE_SYSTEM;
  private static final SubLSymbol $sym20$MODULE_PATHNAME;
  private static final SubLSymbol $sym21$_CSETF_MODULE_PATHNAME;
  private static final SubLSymbol $sym22$MODULE_TEST_CASES;
  private static final SubLSymbol $sym23$_CSETF_MODULE_TEST_CASES;
  private static final SubLSymbol $sym24$MODULE_TEST_SUITES;
  private static final SubLSymbol $sym25$_CSETF_MODULE_TEST_SUITES;
  private static final SubLSymbol $sym26$MODULE_PROVISIONAL_P;
  private static final SubLSymbol $sym27$_CSETF_MODULE_PROVISIONAL_P;
  private static final SubLSymbol $kw28$BASIS;
  private static final SubLSymbol $kw29$NAME;
  private static final SubLSymbol $kw30$SYSTEM;
  private static final SubLSymbol $kw31$PATHNAME;
  private static final SubLSymbol $kw32$TEST_CASES;
  private static final SubLSymbol $kw33$TEST_SUITES;
  private static final SubLSymbol $kw34$PROVISIONAL_P;
  private static final SubLString $str35$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw36$BEGIN;
  private static final SubLSymbol $sym37$MAKE_MODULE;
  private static final SubLSymbol $kw38$SLOT;
  private static final SubLSymbol $kw39$END;
  private static final SubLSymbol $sym40$VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD;
  private static final SubLString $str41$_S_in__S;
  private static final SubLSymbol $sym42$SXHASH_MODULE_METHOD;
  private static final SubLSymbol $sym43$_MODULE_INDEX_;
  private static final SubLInteger $int44$1024;
  private static final SubLSymbol $sym45$STRINGP;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLSymbol $kw48$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw49$MESSAGE;
  private static final SubLString $str50$mapping_modules;
  private static final SubLSymbol $sym51$MODULE_REF;
  private static final SubLSymbol $sym52$MODULE_NAME;
  private static final SubLSymbol $sym53$SYSTEM_NAME;
  private static final SubLSymbol $sym54$PROGN;
  private static final SubLSymbol $sym55$PWHEN;
  private static final SubLSymbol $sym56$PUNLESS;
  private static final SubLSymbol $sym57$SYSTEM_P;
  private static final SubLSymbol $sym58$SYSTEM_LOOKUP;
  private static final SubLSymbol $sym59$ERROR;
  private static final SubLString $str60$_A_is_not_a_known_system_name_;
  private static final SubLSymbol $sym61$PROGRESS_CDOHASH;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym64$IGNORE;
  private static final SubLSymbol $sym65$COR;
  private static final SubLSymbol $sym66$NULL;
  private static final SubLSymbol $sym67$CAND;
  private static final SubLSymbol $sym68$MODULE_GET_INDEX;
  private static final SubLSymbol $sym69$DO_MODULES;
  private static final SubLString $str70$_A_is_not_the_name_of_a_known_sys;
  private static final SubLSymbol $sym71$SYMBOLP;
  private static final SubLSymbol $sym72$SYSTEM;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$PRINT_SYSTEM;
  private static final SubLSymbol $sym78$SYSTEM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$SYSTEM_BASIS;
  private static final SubLSymbol $sym81$_CSETF_SYSTEM_BASIS;
  private static final SubLSymbol $sym82$SYSTEM_NAME;
  private static final SubLSymbol $sym83$_CSETF_SYSTEM_NAME;
  private static final SubLSymbol $sym84$SYSTEM_DEFAULT_PATHNAME;
  private static final SubLSymbol $sym85$_CSETF_SYSTEM_DEFAULT_PATHNAME;
  private static final SubLSymbol $sym86$SYSTEM_MODULES;
  private static final SubLSymbol $sym87$_CSETF_SYSTEM_MODULES;
  private static final SubLSymbol $sym88$SYSTEM_PROVISIONAL_P;
  private static final SubLSymbol $sym89$_CSETF_SYSTEM_PROVISIONAL_P;
  private static final SubLSymbol $kw90$DEFAULT_PATHNAME;
  private static final SubLSymbol $kw91$MODULES;
  private static final SubLSymbol $sym92$MAKE_SYSTEM;
  private static final SubLSymbol $sym93$VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD;
  private static final SubLString $str94$System__S;
  private static final SubLSymbol $sym95$SXHASH_SYSTEM_METHOD;
  private static final SubLSymbol $sym96$_SYSTEM_INDEX_;
  private static final SubLSymbol $sym97$SYSTEM_GET_NAME;
  private static final SubLString $str98$_A_is_already_the_name_of_a_known;
  private static final SubLList $list99;
  private static final SubLSymbol $kw100$COMMON_LISP;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$CDOLIST;
  private static final SubLSymbol $sym104$NAME;
  private static final SubLSymbol $sym105$QUOTE;
  private static final SubLSymbol $sym106$CREATE_MODULE;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1302L)
  public static SubLObject with_module_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$WITH_LOCK_HELD, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1466L)
  public static SubLObject with_system_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$WITH_LOCK_HELD, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_module( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $module_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_basis(final SubLObject v_object)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_name(final SubLObject v_object)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_system(final SubLObject v_object)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_pathname(final SubLObject v_object)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_test_cases(final SubLObject v_object)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_test_suites(final SubLObject v_object)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject module_provisional_p(final SubLObject v_object)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject _csetf_module_basis(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject _csetf_module_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject _csetf_module_system(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject _csetf_module_pathname(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject _csetf_module_test_cases(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject _csetf_module_test_suites(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject _csetf_module_provisional_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != module_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject make_module(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $module_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw28$BASIS ) )
      {
        _csetf_module_basis( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$NAME ) )
      {
        _csetf_module_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$SYSTEM ) )
      {
        _csetf_module_system( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$PATHNAME ) )
      {
        _csetf_module_pathname( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$TEST_CASES ) )
      {
        _csetf_module_test_cases( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$TEST_SUITES ) )
      {
        _csetf_module_test_suites( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$PROVISIONAL_P ) )
      {
        _csetf_module_provisional_p( v_new, current_value );
      }
      else
      {
        Errors.error( $str35$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject visit_defstruct_module(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw36$BEGIN, $sym37$MAKE_MODULE, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw28$BASIS, module_basis( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw29$NAME, module_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw30$SYSTEM, module_system( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw31$PATHNAME, module_pathname( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw32$TEST_CASES, module_test_cases( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw33$TEST_SUITES, module_test_suites( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw34$PROVISIONAL_P, module_provisional_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$END, $sym37$MAKE_MODULE, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2784L)
  public static SubLObject visit_defstruct_object_module_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_module( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3858L)
  public static SubLObject print_module(final SubLObject module, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject module_name = module_get_name( module );
    final SubLObject system_name = module_get_system( module );
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( module, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, module, T, T );
      PrintLow.format( stream, $str41$_S_in__S, module_name, system_name );
      print_macros.print_unreadable_object_postamble( stream, module, NIL, NIL );
    }
    return module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4147L)
  public static SubLObject sxhash_module_method(final SubLObject v_object)
  {
    return Numbers.logxor( Sxhash.sxhash( module_get_name( v_object ) ), Sxhash.sxhash( module_get_system( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4478L)
  public static SubLObject module_store(final SubLObject module)
  {
    final SubLObject entry = ConsesLow.list( module_get_name( module ), module_get_system( module ) );
    SubLObject v_answer = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $module_lock$.getGlobalValue() );
      v_answer = Hashtables.sethash( entry, $module_index$.getGlobalValue(), module );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $module_lock$.getGlobalValue() );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4704L)
  public static SubLObject module_remove(final SubLObject module)
  {
    final SubLObject entry = ConsesLow.list( module_get_name( module ), module_get_system( module ) );
    SubLObject v_answer = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $module_lock$.getGlobalValue() );
      v_answer = Hashtables.remhash( entry, $module_index$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $module_lock$.getGlobalValue() );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4924L)
  public static SubLObject module_lookup(final SubLObject module_name, final SubLObject system_name)
  {
    assert NIL != Types.stringp( module_name ) : module_name;
    assert NIL != Types.stringp( system_name ) : system_name;
    final SubLObject entry = ConsesLow.list( module_name, system_name );
    final SubLObject module = Hashtables.gethash( entry, $module_index$.getGlobalValue(), UNPROVIDED );
    return module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5160L)
  public static SubLObject all_modules()
  {
    return hash_table_utilities.hash_table_values( $module_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5276L)
  public static SubLObject do_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list46 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list46 );
      if( NIL == conses_high.member( current_$1, $list47, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw48$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    }
    final SubLObject system_tail = cdestructuring_bind.property_list_member( $kw30$SYSTEM, current );
    final SubLObject system = ( NIL != system_tail ) ? conses_high.cadr( system_tail ) : NIL;
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw49$MESSAGE, current );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : $str50$mapping_modules;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject module_ref = $sym51$MODULE_REF;
    final SubLObject module_name = $sym52$MODULE_NAME;
    final SubLObject system_name = $sym53$SYSTEM_NAME;
    return ConsesLow.list( $sym54$PROGN, ConsesLow.list( $sym55$PWHEN, ConsesLow.list( $sym45$STRINGP, system ), ConsesLow.list( $sym56$PUNLESS, ConsesLow.list( $sym57$SYSTEM_P, ConsesLow.list( $sym58$SYSTEM_LOOKUP,
        system ) ), ConsesLow.list( $sym59$ERROR, $str60$_A_is_not_a_known_system_name_, system ) ) ), ConsesLow.list( $sym61$PROGRESS_CDOHASH, ConsesLow.list( module_ref, var, $list62, message ), ConsesLow.list(
            $sym63$CDESTRUCTURING_BIND, ConsesLow.list( module_name, system_name ), module_ref, ConsesLow.list( $sym64$IGNORE, module_name ), ConsesLow.listS( $sym55$PWHEN, ConsesLow.list( $sym65$COR, ConsesLow.list(
                $sym66$NULL, system ), ConsesLow.list( $sym67$CAND, system, ConsesLow.list( EQUAL, system_name, system ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6008L)
  public static SubLObject module_get_index()
  {
    return $module_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6096L)
  public static SubLObject module_new(SubLObject name, SubLObject system_name, SubLObject provisional_p, SubLObject pathname)
  {
    if( provisional_p == UNPROVIDED )
    {
      provisional_p = NIL;
    }
    if( pathname == UNPROVIDED )
    {
      pathname = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( name ) : name;
    assert NIL != Types.stringp( system_name ) : system_name;
    final SubLObject system = system_lookup( system_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == system_p( system ) )
    {
      Errors.error( $str70$_A_is_not_the_name_of_a_known_sys, system_name );
    }
    name = Strings.string_downcase( name, UNPROVIDED, UNPROVIDED );
    system_name = Strings.string_downcase( system_name, UNPROVIDED, UNPROVIDED );
    final SubLObject v_new = make_module( UNPROVIDED );
    _csetf_module_name( v_new, name );
    _csetf_module_system( v_new, system_name );
    module_store( v_new );
    system_add_module( system, v_new );
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7284L)
  public static SubLObject ensure_provisional_module(final SubLObject module_name, final SubLObject system_name, final SubLObject pathname)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8249L)
  public static SubLObject create_provisional_module(final SubLObject module_name, final SubLObject system_name, final SubLObject pathname)
  {
    return module_new( module_name, system_name, T, pathname );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8556L)
  public static SubLObject create_module(final SubLObject module_name, final SubLObject system_name)
  {
    assert NIL != Types.stringp( module_name ) : module_name;
    assert NIL != Types.stringp( system_name ) : system_name;
    return module_new( module_name, system_name, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8773L)
  public static SubLObject module_get_name(final SubLObject module)
  {
    assert NIL != module_p( module ) : module;
    return module_name( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9178L)
  public static SubLObject module_get_system(final SubLObject module)
  {
    assert NIL != module_p( module ) : module;
    return module_system( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9537L)
  public static SubLObject module_get_pathname(final SubLObject module)
  {
    assert NIL != module_p( module ) : module;
    return module_pathname( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9825L)
  public static SubLObject module_add_test_case(final SubLObject module, final SubLObject test_case_symbol)
  {
    assert NIL != module_p( module ) : module;
    assert NIL != Types.symbolp( test_case_symbol ) : test_case_symbol;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $module_lock$.getGlobalValue() );
      if( NIL == conses_high.member( test_case_symbol, module_test_cases( module ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_module_test_cases( module, ConsesLow.cons( test_case_symbol, module_test_cases( module ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $module_lock$.getGlobalValue() );
      }
    }
    return module_test_cases( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10464L)
  public static SubLObject module_remove_test_case(final SubLObject module, final SubLObject test_case_symbol)
  {
    assert NIL != module_p( module ) : module;
    assert NIL != Types.symbolp( test_case_symbol ) : test_case_symbol;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $module_lock$.getGlobalValue() );
      _csetf_module_test_cases( module, Sequences.delete( test_case_symbol, module_test_cases( module ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $module_lock$.getGlobalValue() );
      }
    }
    return module_test_cases( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10754L)
  public static SubLObject module_get_test_cases(final SubLObject module)
  {
    assert NIL != module_p( module ) : module;
    return module_test_cases( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10868L)
  public static SubLObject module_add_test_suite(final SubLObject module, final SubLObject test_suite_name)
  {
    assert NIL != module_p( module ) : module;
    assert NIL != Types.stringp( test_suite_name ) : test_suite_name;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $module_lock$.getGlobalValue() );
      if( NIL == conses_high.member( test_suite_name, module_test_suites( module ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_module_test_suites( module, ConsesLow.cons( test_suite_name, module_test_suites( module ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $module_lock$.getGlobalValue() );
      }
    }
    return module_test_suites( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11169L)
  public static SubLObject module_remove_test_suite(final SubLObject module, final SubLObject test_suite_name)
  {
    assert NIL != module_p( module ) : module;
    assert NIL != Types.stringp( test_suite_name ) : test_suite_name;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $module_lock$.getGlobalValue() );
      _csetf_module_test_suites( module, Sequences.delete( test_suite_name, module_test_suites( module ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $module_lock$.getGlobalValue() );
      }
    }
    return module_test_suites( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11514L)
  public static SubLObject module_get_test_suites(final SubLObject module)
  {
    assert NIL != module_p( module ) : module;
    return module_test_suites( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11630L)
  public static SubLObject module_get_provisional_p(final SubLObject module)
  {
    assert NIL != module_p( module ) : module;
    return module_provisional_p( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject system_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_system( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject system_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $system_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject system_basis(final SubLObject v_object)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject system_name(final SubLObject v_object)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject system_default_pathname(final SubLObject v_object)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject system_modules(final SubLObject v_object)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject system_provisional_p(final SubLObject v_object)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject _csetf_system_basis(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject _csetf_system_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject _csetf_system_default_pathname(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject _csetf_system_modules(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject _csetf_system_provisional_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != system_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject make_system(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $system_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw28$BASIS ) )
      {
        _csetf_system_basis( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$NAME ) )
      {
        _csetf_system_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw90$DEFAULT_PATHNAME ) )
      {
        _csetf_system_default_pathname( v_new, current_value );
      }
      else if( pcase_var.eql( $kw91$MODULES ) )
      {
        _csetf_system_modules( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$PROVISIONAL_P ) )
      {
        _csetf_system_provisional_p( v_new, current_value );
      }
      else
      {
        Errors.error( $str35$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject visit_defstruct_system(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw36$BEGIN, $sym92$MAKE_SYSTEM, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw28$BASIS, system_basis( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw29$NAME, system_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw90$DEFAULT_PATHNAME, system_default_pathname( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw91$MODULES, system_modules( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$SLOT, $kw34$PROVISIONAL_P, system_provisional_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$END, $sym92$MAKE_SYSTEM, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12010L)
  public static SubLObject visit_defstruct_object_system_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_system( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12657L)
  public static SubLObject print_system(final SubLObject system, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject system_name = system_get_name( system );
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( system, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, system, T, T );
      PrintLow.format( stream, $str94$System__S, system_name );
      print_macros.print_unreadable_object_postamble( stream, system, NIL, NIL );
    }
    return system;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12895L)
  public static SubLObject sxhash_system_method(final SubLObject v_object)
  {
    return Sxhash.sxhash( system_get_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13081L)
  public static SubLObject system_store(final SubLObject system)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $system_lock$.getGlobalValue() );
      if( NIL == conses_high.member( system, $system_index$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $system_index$.setGlobalValue( ConsesLow.cons( system, $system_index$.getGlobalValue() ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $system_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13191L)
  public static SubLObject system_remove(final SubLObject system)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $system_lock$.getGlobalValue() );
      $system_index$.setGlobalValue( Sequences.remove( system, $system_index$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $system_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13323L)
  public static SubLObject system_lookup(final SubLObject system_name)
  {
    assert NIL != Types.stringp( system_name ) : system_name;
    return Sequences.find( system_name, $system_index$.getGlobalValue(), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym97$SYSTEM_GET_NAME ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13471L)
  public static SubLObject all_systems()
  {
    return $system_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13526L)
  public static SubLObject system_new(SubLObject system_name, SubLObject provisional_p, SubLObject default_pathname)
  {
    if( provisional_p == UNPROVIDED )
    {
      provisional_p = NIL;
    }
    if( default_pathname == UNPROVIDED )
    {
      default_pathname = NIL;
    }
    assert NIL != Types.stringp( system_name ) : system_name;
    system_name = Strings.string_downcase( system_name, UNPROVIDED, UNPROVIDED );
    final SubLObject v_new = make_system( UNPROVIDED );
    _csetf_system_name( v_new, system_name );
    system_store( v_new );
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14363L)
  public static SubLObject ensure_provisional_system(final SubLObject system_name, final SubLObject default_pathname)
  {
    assert NIL != Types.stringp( system_name ) : system_name;
    assert NIL != Types.stringp( default_pathname ) : default_pathname;
    final SubLObject existing_system = system_lookup( system_name );
    if( NIL != system_p( existing_system ) )
    {
      return existing_system;
    }
    return create_provisional_system( system_name, default_pathname );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15032L)
  public static SubLObject create_provisional_system(final SubLObject system_name, final SubLObject default_pathname)
  {
    assert NIL != Types.stringp( system_name ) : system_name;
    assert NIL != Types.stringp( default_pathname ) : default_pathname;
    final SubLObject existing_system = system_lookup( system_name );
    if( NIL != system_p( existing_system ) )
    {
      Errors.error( $str98$_A_is_already_the_name_of_a_known, system_name );
      return NIL;
    }
    return system_new( system_name, T, default_pathname );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15561L)
  public static SubLObject create_system(final SubLObject system_name)
  {
    assert NIL != Types.stringp( system_name ) : system_name;
    return system_new( system_name, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15718L)
  public static SubLObject system_get_name(final SubLObject system)
  {
    assert NIL != system_p( system ) : system;
    return system_name( system );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16141L)
  public static SubLObject system_get_default_pathname(final SubLObject system)
  {
    assert NIL != system_p( system ) : system;
    return system_default_pathname( system );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16460L)
  public static SubLObject system_get_modules(final SubLObject system, SubLObject include_provisional_modules)
  {
    if( include_provisional_modules == UNPROVIDED )
    {
      include_provisional_modules = NIL;
    }
    assert NIL != system_p( system ) : system;
    return Sequences.reverse( system_modules( system ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17167L)
  public static SubLObject system_add_module(final SubLObject system, final SubLObject module)
  {
    assert NIL != system_p( system ) : system;
    assert NIL != module_p( module ) : module;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $system_lock$.getGlobalValue() );
      _csetf_system_modules( system, conses_high.adjoin( module, system_modules( system ), UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $system_lock$.getGlobalValue() );
      }
    }
    return system_modules( system );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17512L)
  public static SubLObject system_remove_module(final SubLObject system, final SubLObject module)
  {
    assert NIL != system_p( system ) : system;
    assert NIL != module_p( module ) : module;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $system_lock$.getGlobalValue() );
      _csetf_system_modules( system, Sequences.delete( module, system_modules( system ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $system_lock$.getGlobalValue() );
      }
    }
    return system_modules( system );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17860L)
  public static SubLObject system_get_provisional_p(final SubLObject system)
  {
    assert NIL != system_p( system ) : system;
    return system_provisional_p( system );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18123L)
  public static SubLObject system_module_names(final SubLObject system_name, SubLObject include_provisional)
  {
    if( include_provisional == UNPROVIDED )
    {
      include_provisional = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject system = system_lookup( system_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == system_p( system ) )
    {
      Errors.error( $str70$_A_is_not_the_name_of_a_known_sys, system_name );
    }
    SubLObject result = NIL;
    if( NIL != system_p( system ) )
    {
      SubLObject cdolist_list_var = system_get_modules( system, UNPROVIDED );
      SubLObject module = NIL;
      module = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( module_get_name( module ), result );
        cdolist_list_var = cdolist_list_var.rest();
        module = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21987L)
  public static SubLObject system_names(SubLObject include_provisional)
  {
    if( include_provisional == UNPROVIDED )
    {
      include_provisional = NIL;
    }
    final SubLObject all_systems = all_systems();
    return Mapping.mapcar( Symbols.symbol_function( $sym97$SYSTEM_GET_NAME ), all_systems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22656L)
  public static SubLObject note_translated_modules(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject system_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    system_name = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
      return NIL;
    }
    if( NIL != Sequences.find( $kw100$COMMON_LISP, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return $list101;
    }
    final SubLObject v_modules = system_get_modules( system_lookup( system_name ), UNPROVIDED );
    SubLObject module_names = NIL;
    SubLObject cdolist_list_var = v_modules;
    SubLObject module = NIL;
    module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject name = module_get_name( module );
      module_names = ConsesLow.cons( name, module_names );
      cdolist_list_var = cdolist_list_var.rest();
      module = cdolist_list_var.first();
    }
    module_names = Sequences.nreverse( module_names );
    return ConsesLow.list( $sym54$PROGN, $list102, ConsesLow.list( $sym103$CDOLIST, ConsesLow.list( $sym104$NAME, ConsesLow.list( $sym105$QUOTE, module_names ) ), ConsesLow.list( $sym106$CREATE_MODULE, $sym104$NAME,
        system_name ) ) );
  }

  public static SubLObject declare_modules_file()
  {
    SubLFiles.declareMacro( me, "with_module_lock", "WITH-MODULE-LOCK" );
    SubLFiles.declareMacro( me, "with_system_lock", "WITH-SYSTEM-LOCK" );
    SubLFiles.declareFunction( me, "module_print_function_trampoline", "MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "module_p", "MODULE-P", 1, 0, false );
    new $module_p$UnaryFunction();
    SubLFiles.declareFunction( me, "module_basis", "MODULE-BASIS", 1, 0, false );
    SubLFiles.declareFunction( me, "module_name", "MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "module_system", "MODULE-SYSTEM", 1, 0, false );
    SubLFiles.declareFunction( me, "module_pathname", "MODULE-PATHNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "module_test_cases", "MODULE-TEST-CASES", 1, 0, false );
    SubLFiles.declareFunction( me, "module_test_suites", "MODULE-TEST-SUITES", 1, 0, false );
    SubLFiles.declareFunction( me, "module_provisional_p", "MODULE-PROVISIONAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_module_basis", "_CSETF-MODULE-BASIS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_module_name", "_CSETF-MODULE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_module_system", "_CSETF-MODULE-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_module_pathname", "_CSETF-MODULE-PATHNAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_module_test_cases", "_CSETF-MODULE-TEST-CASES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_module_test_suites", "_CSETF-MODULE-TEST-SUITES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_module_provisional_p", "_CSETF-MODULE-PROVISIONAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "make_module", "MAKE-MODULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_module", "VISIT-DEFSTRUCT-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_module_method", "VISIT-DEFSTRUCT-OBJECT-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_module", "PRINT-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_module_method", "SXHASH-MODULE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "module_store", "MODULE-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "module_remove", "MODULE-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "module_lookup", "MODULE-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "all_modules", "ALL-MODULES", 0, 0, false );
    SubLFiles.declareMacro( me, "do_modules", "DO-MODULES" );
    SubLFiles.declareFunction( me, "module_get_index", "MODULE-GET-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "module_new", "MODULE-NEW", 2, 2, false );
    SubLFiles.declareFunction( me, "ensure_provisional_module", "ENSURE-PROVISIONAL-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "create_provisional_module", "CREATE-PROVISIONAL-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "create_module", "CREATE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "module_get_name", "MODULE-GET-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "module_get_system", "MODULE-GET-SYSTEM", 1, 0, false );
    SubLFiles.declareFunction( me, "module_get_pathname", "MODULE-GET-PATHNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "module_add_test_case", "MODULE-ADD-TEST-CASE", 2, 0, false );
    SubLFiles.declareFunction( me, "module_remove_test_case", "MODULE-REMOVE-TEST-CASE", 2, 0, false );
    SubLFiles.declareFunction( me, "module_get_test_cases", "MODULE-GET-TEST-CASES", 1, 0, false );
    SubLFiles.declareFunction( me, "module_add_test_suite", "MODULE-ADD-TEST-SUITE", 2, 0, false );
    SubLFiles.declareFunction( me, "module_remove_test_suite", "MODULE-REMOVE-TEST-SUITE", 2, 0, false );
    SubLFiles.declareFunction( me, "module_get_test_suites", "MODULE-GET-TEST-SUITES", 1, 0, false );
    SubLFiles.declareFunction( me, "module_get_provisional_p", "MODULE-GET-PROVISIONAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "system_print_function_trampoline", "SYSTEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "system_p", "SYSTEM-P", 1, 0, false );
    new $system_p$UnaryFunction();
    SubLFiles.declareFunction( me, "system_basis", "SYSTEM-BASIS", 1, 0, false );
    SubLFiles.declareFunction( me, "system_name", "SYSTEM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "system_default_pathname", "SYSTEM-DEFAULT-PATHNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "system_modules", "SYSTEM-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "system_provisional_p", "SYSTEM-PROVISIONAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_system_basis", "_CSETF-SYSTEM-BASIS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_system_name", "_CSETF-SYSTEM-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_system_default_pathname", "_CSETF-SYSTEM-DEFAULT-PATHNAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_system_modules", "_CSETF-SYSTEM-MODULES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_system_provisional_p", "_CSETF-SYSTEM-PROVISIONAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "make_system", "MAKE-SYSTEM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_system", "VISIT-DEFSTRUCT-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_system_method", "VISIT-DEFSTRUCT-OBJECT-SYSTEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_system", "PRINT-SYSTEM", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_system_method", "SXHASH-SYSTEM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "system_store", "SYSTEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "system_remove", "SYSTEM-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "system_lookup", "SYSTEM-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "all_systems", "ALL-SYSTEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "system_new", "SYSTEM-NEW", 1, 2, false );
    SubLFiles.declareFunction( me, "ensure_provisional_system", "ENSURE-PROVISIONAL-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "create_provisional_system", "CREATE-PROVISIONAL-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "create_system", "CREATE-SYSTEM", 1, 0, false );
    SubLFiles.declareFunction( me, "system_get_name", "SYSTEM-GET-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "system_get_default_pathname", "SYSTEM-GET-DEFAULT-PATHNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "system_get_modules", "SYSTEM-GET-MODULES", 1, 1, false );
    SubLFiles.declareFunction( me, "system_add_module", "SYSTEM-ADD-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "system_remove_module", "SYSTEM-REMOVE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "system_get_provisional_p", "SYSTEM-GET-PROVISIONAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "system_module_names", "SYSTEM-MODULE-NAMES", 1, 1, false );
    SubLFiles.declareFunction( me, "system_names", "SYSTEM-NAMES", 0, 1, false );
    SubLFiles.declareMacro( me, "note_translated_modules", "NOTE-TRANSLATED-MODULES" );
    return NIL;
  }

  public static SubLObject init_modules_file()
  {
    $module_lock$ = SubLFiles.deflexical( "*MODULE-LOCK*", Locks.make_lock( $str0$Module_Lock ) );
    $system_lock$ = SubLFiles.deflexical( "*SYSTEM-LOCK*", Locks.make_lock( $str3$System_Lock ) );
    $dtp_module$ = SubLFiles.defconstant( "*DTP-MODULE*", $sym5$MODULE );
    $module_index$ = SubLFiles.deflexical( "*MODULE-INDEX*", maybeDefault( $sym43$_MODULE_INDEX_, $module_index$, () -> ( Hashtables.make_hash_table( $int44$1024, Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) ) );
    $dtp_system$ = SubLFiles.defconstant( "*DTP-SYSTEM*", $sym72$SYSTEM );
    $system_index$ = SubLFiles.deflexical( "*SYSTEM-INDEX*", ( maybeDefault( $sym96$_SYSTEM_INDEX_, $system_index$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_modules_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), Symbols.symbol_function( $sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list13 );
    Structures.def_csetf( $sym14$MODULE_BASIS, $sym15$_CSETF_MODULE_BASIS );
    Structures.def_csetf( $sym16$MODULE_NAME, $sym17$_CSETF_MODULE_NAME );
    Structures.def_csetf( $sym18$MODULE_SYSTEM, $sym19$_CSETF_MODULE_SYSTEM );
    Structures.def_csetf( $sym20$MODULE_PATHNAME, $sym21$_CSETF_MODULE_PATHNAME );
    Structures.def_csetf( $sym22$MODULE_TEST_CASES, $sym23$_CSETF_MODULE_TEST_CASES );
    Structures.def_csetf( $sym24$MODULE_TEST_SUITES, $sym25$_CSETF_MODULE_TEST_SUITES );
    Structures.def_csetf( $sym26$MODULE_PROVISIONAL_P, $sym27$_CSETF_MODULE_PROVISIONAL_P );
    Equality.identity( $sym5$MODULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), Symbols.symbol_function( $sym40$VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), Symbols.symbol_function( $sym42$SXHASH_MODULE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym43$_MODULE_INDEX_ );
    access_macros.register_macro_helper( $sym68$MODULE_GET_INDEX, $sym69$DO_MODULES );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), Symbols.symbol_function( $sym78$SYSTEM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list79 );
    Structures.def_csetf( $sym80$SYSTEM_BASIS, $sym81$_CSETF_SYSTEM_BASIS );
    Structures.def_csetf( $sym82$SYSTEM_NAME, $sym83$_CSETF_SYSTEM_NAME );
    Structures.def_csetf( $sym84$SYSTEM_DEFAULT_PATHNAME, $sym85$_CSETF_SYSTEM_DEFAULT_PATHNAME );
    Structures.def_csetf( $sym86$SYSTEM_MODULES, $sym87$_CSETF_SYSTEM_MODULES );
    Structures.def_csetf( $sym88$SYSTEM_PROVISIONAL_P, $sym89$_CSETF_SYSTEM_PROVISIONAL_P );
    Equality.identity( $sym72$SYSTEM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), Symbols.symbol_function( $sym93$VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), Symbols.symbol_function( $sym95$SXHASH_SYSTEM_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym96$_SYSTEM_INDEX_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_modules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_modules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_modules_file();
  }
  static
  {
    me = new modules();
    $module_lock$ = null;
    $system_lock$ = null;
    $dtp_module$ = null;
    $module_index$ = null;
    $dtp_system$ = null;
    $system_index$ = null;
    $str0$Module_Lock = makeString( "Module Lock" );
    $sym1$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list2 = ConsesLow.list( makeSymbol( "*MODULE-LOCK*" ) );
    $str3$System_Lock = makeString( "System Lock" );
    $list4 = ConsesLow.list( makeSymbol( "*SYSTEM-LOCK*" ) );
    $sym5$MODULE = makeSymbol( "MODULE" );
    $sym6$MODULE_P = makeSymbol( "MODULE-P" );
    $list7 = ConsesLow.list( makeSymbol( "BASIS" ), makeSymbol( "NAME" ), makeSymbol( "SYSTEM" ), makeSymbol( "PATHNAME" ), makeSymbol( "TEST-CASES" ), makeSymbol( "TEST-SUITES" ), makeSymbol( "PROVISIONAL-P" ) );
    $list8 = ConsesLow.list( makeKeyword( "BASIS" ), makeKeyword( "NAME" ), makeKeyword( "SYSTEM" ), makeKeyword( "PATHNAME" ), makeKeyword( "TEST-CASES" ), makeKeyword( "TEST-SUITES" ), makeKeyword( "PROVISIONAL-P" ) );
    $list9 = ConsesLow.list( makeSymbol( "MODULE-BASIS" ), makeSymbol( "MODULE-NAME" ), makeSymbol( "MODULE-SYSTEM" ), makeSymbol( "MODULE-PATHNAME" ), makeSymbol( "MODULE-TEST-CASES" ), makeSymbol(
        "MODULE-TEST-SUITES" ), makeSymbol( "MODULE-PROVISIONAL-P" ) );
    $list10 = ConsesLow.list( makeSymbol( "_CSETF-MODULE-BASIS" ), makeSymbol( "_CSETF-MODULE-NAME" ), makeSymbol( "_CSETF-MODULE-SYSTEM" ), makeSymbol( "_CSETF-MODULE-PATHNAME" ), makeSymbol(
        "_CSETF-MODULE-TEST-CASES" ), makeSymbol( "_CSETF-MODULE-TEST-SUITES" ), makeSymbol( "_CSETF-MODULE-PROVISIONAL-P" ) );
    $sym11$PRINT_MODULE = makeSymbol( "PRINT-MODULE" );
    $sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "MODULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list13 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "MODULE-P" ) );
    $sym14$MODULE_BASIS = makeSymbol( "MODULE-BASIS" );
    $sym15$_CSETF_MODULE_BASIS = makeSymbol( "_CSETF-MODULE-BASIS" );
    $sym16$MODULE_NAME = makeSymbol( "MODULE-NAME" );
    $sym17$_CSETF_MODULE_NAME = makeSymbol( "_CSETF-MODULE-NAME" );
    $sym18$MODULE_SYSTEM = makeSymbol( "MODULE-SYSTEM" );
    $sym19$_CSETF_MODULE_SYSTEM = makeSymbol( "_CSETF-MODULE-SYSTEM" );
    $sym20$MODULE_PATHNAME = makeSymbol( "MODULE-PATHNAME" );
    $sym21$_CSETF_MODULE_PATHNAME = makeSymbol( "_CSETF-MODULE-PATHNAME" );
    $sym22$MODULE_TEST_CASES = makeSymbol( "MODULE-TEST-CASES" );
    $sym23$_CSETF_MODULE_TEST_CASES = makeSymbol( "_CSETF-MODULE-TEST-CASES" );
    $sym24$MODULE_TEST_SUITES = makeSymbol( "MODULE-TEST-SUITES" );
    $sym25$_CSETF_MODULE_TEST_SUITES = makeSymbol( "_CSETF-MODULE-TEST-SUITES" );
    $sym26$MODULE_PROVISIONAL_P = makeSymbol( "MODULE-PROVISIONAL-P" );
    $sym27$_CSETF_MODULE_PROVISIONAL_P = makeSymbol( "_CSETF-MODULE-PROVISIONAL-P" );
    $kw28$BASIS = makeKeyword( "BASIS" );
    $kw29$NAME = makeKeyword( "NAME" );
    $kw30$SYSTEM = makeKeyword( "SYSTEM" );
    $kw31$PATHNAME = makeKeyword( "PATHNAME" );
    $kw32$TEST_CASES = makeKeyword( "TEST-CASES" );
    $kw33$TEST_SUITES = makeKeyword( "TEST-SUITES" );
    $kw34$PROVISIONAL_P = makeKeyword( "PROVISIONAL-P" );
    $str35$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw36$BEGIN = makeKeyword( "BEGIN" );
    $sym37$MAKE_MODULE = makeSymbol( "MAKE-MODULE" );
    $kw38$SLOT = makeKeyword( "SLOT" );
    $kw39$END = makeKeyword( "END" );
    $sym40$VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-MODULE-METHOD" );
    $str41$_S_in__S = makeString( "~S in ~S" );
    $sym42$SXHASH_MODULE_METHOD = makeSymbol( "SXHASH-MODULE-METHOD" );
    $sym43$_MODULE_INDEX_ = makeSymbol( "*MODULE-INDEX*" );
    $int44$1024 = makeInteger( 1024 );
    $sym45$STRINGP = makeSymbol( "STRINGP" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "SYSTEM" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "mapping modules" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list47 = ConsesLow.list( makeKeyword( "SYSTEM" ), makeKeyword( "MESSAGE" ) );
    $kw48$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw49$MESSAGE = makeKeyword( "MESSAGE" );
    $str50$mapping_modules = makeString( "mapping modules" );
    $sym51$MODULE_REF = makeUninternedSymbol( "MODULE-REF" );
    $sym52$MODULE_NAME = makeUninternedSymbol( "MODULE-NAME" );
    $sym53$SYSTEM_NAME = makeUninternedSymbol( "SYSTEM-NAME" );
    $sym54$PROGN = makeSymbol( "PROGN" );
    $sym55$PWHEN = makeSymbol( "PWHEN" );
    $sym56$PUNLESS = makeSymbol( "PUNLESS" );
    $sym57$SYSTEM_P = makeSymbol( "SYSTEM-P" );
    $sym58$SYSTEM_LOOKUP = makeSymbol( "SYSTEM-LOOKUP" );
    $sym59$ERROR = makeSymbol( "ERROR" );
    $str60$_A_is_not_a_known_system_name_ = makeString( "~A is not a known system name." );
    $sym61$PROGRESS_CDOHASH = makeSymbol( "PROGRESS-CDOHASH" );
    $list62 = ConsesLow.list( makeSymbol( "MODULE-GET-INDEX" ) );
    $sym63$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym64$IGNORE = makeSymbol( "IGNORE" );
    $sym65$COR = makeSymbol( "COR" );
    $sym66$NULL = makeSymbol( "NULL" );
    $sym67$CAND = makeSymbol( "CAND" );
    $sym68$MODULE_GET_INDEX = makeSymbol( "MODULE-GET-INDEX" );
    $sym69$DO_MODULES = makeSymbol( "DO-MODULES" );
    $str70$_A_is_not_the_name_of_a_known_sys = makeString( "~A is not the name of a known system." );
    $sym71$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym72$SYSTEM = makeSymbol( "SYSTEM" );
    $list73 = ConsesLow.list( makeSymbol( "BASIS" ), makeSymbol( "NAME" ), makeSymbol( "DEFAULT-PATHNAME" ), makeSymbol( "MODULES" ), makeSymbol( "PROVISIONAL-P" ) );
    $list74 = ConsesLow.list( makeKeyword( "BASIS" ), makeKeyword( "NAME" ), makeKeyword( "DEFAULT-PATHNAME" ), makeKeyword( "MODULES" ), makeKeyword( "PROVISIONAL-P" ) );
    $list75 = ConsesLow.list( makeSymbol( "SYSTEM-BASIS" ), makeSymbol( "SYSTEM-NAME" ), makeSymbol( "SYSTEM-DEFAULT-PATHNAME" ), makeSymbol( "SYSTEM-MODULES" ), makeSymbol( "SYSTEM-PROVISIONAL-P" ) );
    $list76 = ConsesLow.list( makeSymbol( "_CSETF-SYSTEM-BASIS" ), makeSymbol( "_CSETF-SYSTEM-NAME" ), makeSymbol( "_CSETF-SYSTEM-DEFAULT-PATHNAME" ), makeSymbol( "_CSETF-SYSTEM-MODULES" ), makeSymbol(
        "_CSETF-SYSTEM-PROVISIONAL-P" ) );
    $sym77$PRINT_SYSTEM = makeSymbol( "PRINT-SYSTEM" );
    $sym78$SYSTEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SYSTEM-PRINT-FUNCTION-TRAMPOLINE" );
    $list79 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SYSTEM-P" ) );
    $sym80$SYSTEM_BASIS = makeSymbol( "SYSTEM-BASIS" );
    $sym81$_CSETF_SYSTEM_BASIS = makeSymbol( "_CSETF-SYSTEM-BASIS" );
    $sym82$SYSTEM_NAME = makeSymbol( "SYSTEM-NAME" );
    $sym83$_CSETF_SYSTEM_NAME = makeSymbol( "_CSETF-SYSTEM-NAME" );
    $sym84$SYSTEM_DEFAULT_PATHNAME = makeSymbol( "SYSTEM-DEFAULT-PATHNAME" );
    $sym85$_CSETF_SYSTEM_DEFAULT_PATHNAME = makeSymbol( "_CSETF-SYSTEM-DEFAULT-PATHNAME" );
    $sym86$SYSTEM_MODULES = makeSymbol( "SYSTEM-MODULES" );
    $sym87$_CSETF_SYSTEM_MODULES = makeSymbol( "_CSETF-SYSTEM-MODULES" );
    $sym88$SYSTEM_PROVISIONAL_P = makeSymbol( "SYSTEM-PROVISIONAL-P" );
    $sym89$_CSETF_SYSTEM_PROVISIONAL_P = makeSymbol( "_CSETF-SYSTEM-PROVISIONAL-P" );
    $kw90$DEFAULT_PATHNAME = makeKeyword( "DEFAULT-PATHNAME" );
    $kw91$MODULES = makeKeyword( "MODULES" );
    $sym92$MAKE_SYSTEM = makeSymbol( "MAKE-SYSTEM" );
    $sym93$VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SYSTEM-METHOD" );
    $str94$System__S = makeString( "System ~S" );
    $sym95$SXHASH_SYSTEM_METHOD = makeSymbol( "SXHASH-SYSTEM-METHOD" );
    $sym96$_SYSTEM_INDEX_ = makeSymbol( "*SYSTEM-INDEX*" );
    $sym97$SYSTEM_GET_NAME = makeSymbol( "SYSTEM-GET-NAME" );
    $str98$_A_is_already_the_name_of_a_known = makeString( "~A is already the name of a known system." );
    $list99 = ConsesLow.list( makeSymbol( "SYSTEM-NAME" ) );
    $kw100$COMMON_LISP = makeKeyword( "COMMON-LISP" );
    $list101 = ConsesLow.list( makeSymbol( "PROGN" ) );
    $list102 = ConsesLow.list( makeSymbol( "CREATE-SYSTEM" ), makeString( "cycl" ) );
    $sym103$CDOLIST = makeSymbol( "CDOLIST" );
    $sym104$NAME = makeSymbol( "NAME" );
    $sym105$QUOTE = makeSymbol( "QUOTE" );
    $sym106$CREATE_MODULE = makeSymbol( "CREATE-MODULE" );
  }

  public static final class $module_native
      extends
        SubLStructNative
  {
    public SubLObject $basis;
    public SubLObject $name;
    public SubLObject $system;
    public SubLObject $pathname;
    public SubLObject $test_cases;
    public SubLObject $test_suites;
    public SubLObject $provisional_p;
    private static final SubLStructDeclNative structDecl;

    public $module_native()
    {
      this.$basis = CommonSymbols.NIL;
      this.$name = CommonSymbols.NIL;
      this.$system = CommonSymbols.NIL;
      this.$pathname = CommonSymbols.NIL;
      this.$test_cases = CommonSymbols.NIL;
      this.$test_suites = CommonSymbols.NIL;
      this.$provisional_p = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $module_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$basis;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$system;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$pathname;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$test_cases;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$test_suites;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$provisional_p;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$basis = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$system = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$pathname = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$test_cases = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$test_suites = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$provisional_p = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $module_native.class, $sym5$MODULE, $sym6$MODULE_P, $list7, $list8, new String[] { "$basis", "$name", "$system", "$pathname", "$test_cases", "$test_suites",
        "$provisional_p"
      }, $list9, $list10, $sym11$PRINT_MODULE );
    }
  }

  public static final class $module_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $module_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "MODULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return module_p( arg1 );
    }
  }

  public static final class $system_native
      extends
        SubLStructNative
  {
    public SubLObject $basis;
    public SubLObject $name;
    public SubLObject $default_pathname;
    public SubLObject $modules;
    public SubLObject $provisional_p;
    private static final SubLStructDeclNative structDecl;

    public $system_native()
    {
      this.$basis = CommonSymbols.NIL;
      this.$name = CommonSymbols.NIL;
      this.$default_pathname = CommonSymbols.NIL;
      this.$modules = CommonSymbols.NIL;
      this.$provisional_p = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $system_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$basis;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$default_pathname;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$modules;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$provisional_p;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$basis = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$default_pathname = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$modules = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$provisional_p = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $system_native.class, $sym72$SYSTEM, $sym57$SYSTEM_P, $list73, $list74, new String[] { "$basis", "$name", "$default_pathname", "$modules", "$provisional_p"
      }, $list75, $list76, $sym77$PRINT_SYSTEM );
    }
  }

  public static final class $system_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $system_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SYSTEM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return system_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 564 ms
 * 
 */