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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_harness
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_harness";
  public static final String myFingerPrint = "21b3acfa90587f0a84528e320ee923de3d51d1c54ce57cbb1c334bd82ee3e0d6";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLSymbol $dtp_rl_module$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11424L)
  private static SubLSymbol $rl_module_store$;
  private static final SubLSymbol $sym0$RL_MODULE;
  private static final SubLSymbol $sym1$RL_MODULE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_RL_MODULE;
  private static final SubLSymbol $sym7$RL_MODULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$RLM_NAME;
  private static final SubLSymbol $sym10$_CSETF_RLM_NAME;
  private static final SubLSymbol $sym11$RLM_REQUIRED;
  private static final SubLSymbol $sym12$_CSETF_RLM_REQUIRED;
  private static final SubLSymbol $sym13$RLM_COST;
  private static final SubLSymbol $sym14$_CSETF_RLM_COST;
  private static final SubLSymbol $sym15$RLM_REFORMULATE;
  private static final SubLSymbol $sym16$_CSETF_RLM_REFORMULATE;
  private static final SubLSymbol $sym17$RLM_DOCUMENTATION;
  private static final SubLSymbol $sym18$_CSETF_RLM_DOCUMENTATION;
  private static final SubLSymbol $sym19$RLM_EXAMPLE_SOURCE;
  private static final SubLSymbol $sym20$_CSETF_RLM_EXAMPLE_SOURCE;
  private static final SubLSymbol $sym21$RLM_EXAMPLE_TARGET;
  private static final SubLSymbol $sym22$_CSETF_RLM_EXAMPLE_TARGET;
  private static final SubLSymbol $sym23$RLM_PLIST;
  private static final SubLSymbol $sym24$_CSETF_RLM_PLIST;
  private static final SubLSymbol $kw25$NAME;
  private static final SubLSymbol $kw26$REQUIRED;
  private static final SubLSymbol $kw27$COST;
  private static final SubLSymbol $kw28$REFORMULATE;
  private static final SubLSymbol $kw29$DOCUMENTATION;
  private static final SubLSymbol $kw30$EXAMPLE_SOURCE;
  private static final SubLSymbol $kw31$EXAMPLE_TARGET;
  private static final SubLSymbol $kw32$PLIST;
  private static final SubLString $str33$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw34$BEGIN;
  private static final SubLSymbol $sym35$MAKE_RL_MODULE;
  private static final SubLSymbol $kw36$SLOT;
  private static final SubLSymbol $kw37$END;
  private static final SubLSymbol $sym38$VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD;
  private static final SubLString $str39$__RL_Module__Name__________S__;
  private static final SubLString $str40$_____________Required______S__;
  private static final SubLString $str41$_____________Cost__________S__;
  private static final SubLString $str42$_____________Reformulate___S___;
  private static final SubLString $str43$__Documentation___A;
  private static final SubLString $str44$____Input_____S;
  private static final SubLString $str45$_____;
  private static final SubLString $str46$____Desired_output_____S;
  private static final SubLString $str47$__Missing__required_info__Abortin;
  private static final SubLString $str48$__Missing__cost_info__Aborting;
  private static final SubLString $str49$__Missing__reformulate_info__Abor;
  private static final SubLString $str50$__Missing__documentation_info__Ba;
  private static final SubLString $str51$__Missing__example_source_info__B;
  private static final SubLString $str52$__Missing__example_target_info__B;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$CDOLIST;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$CLET;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$CSOME;
  private static final SubLSymbol $sym60$MOD;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$_RL_MODULE_STORE_;
  private static final SubLSymbol $sym63$RL_MODULE_NAME;
  private static final SubLString $str64$RL_module_store_corrupt__clearing;
  private static final SubLString $str65$RL_module__S_already_exists_in_th;
  private static final SubLString $str66$__No_module_named__S_found_in_the;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rl_module( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rl_module_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rl_module_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_name(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_required(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_cost(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_reformulate(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_documentation(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_example_source(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_example_target(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject rlm_plist(final SubLObject v_object)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_required(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_cost(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_reformulate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_documentation(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_example_source(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_example_target(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject _csetf_rlm_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rl_module_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject make_rl_module(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rl_module_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw25$NAME ) )
      {
        _csetf_rlm_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$REQUIRED ) )
      {
        _csetf_rlm_required( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$COST ) )
      {
        _csetf_rlm_cost( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$REFORMULATE ) )
      {
        _csetf_rlm_reformulate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$DOCUMENTATION ) )
      {
        _csetf_rlm_documentation( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$EXAMPLE_SOURCE ) )
      {
        _csetf_rlm_example_source( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$EXAMPLE_TARGET ) )
      {
        _csetf_rlm_example_target( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$PLIST ) )
      {
        _csetf_rlm_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str33$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject visit_defstruct_rl_module(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw34$BEGIN, $sym35$MAKE_RL_MODULE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw25$NAME, rlm_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw26$REQUIRED, rlm_required( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw27$COST, rlm_cost( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw28$REFORMULATE, rlm_reformulate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw29$DOCUMENTATION, rlm_documentation( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw30$EXAMPLE_SOURCE, rlm_example_source( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw31$EXAMPLE_TARGET, rlm_example_target( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$SLOT, $kw32$PLIST, rlm_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$END, $sym35$MAKE_RL_MODULE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
  public static SubLObject visit_defstruct_object_rl_module_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rl_module( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4552L)
  public static SubLObject print_rl_module(final SubLObject rl_module, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str39$__RL_Module__Name__________S__, rl_module_name( rl_module ) );
    PrintLow.format( stream, $str40$_____________Required______S__, rl_module_required_function( rl_module ) );
    PrintLow.format( stream, $str41$_____________Cost__________S__, rl_module_cost_function( rl_module ) );
    PrintLow.format( stream, $str42$_____________Reformulate___S___, rl_module_reformulate_function( rl_module ) );
    return rl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 5253L)
  public static SubLObject print_rl_module_documentation(final SubLObject rl_module, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      PrintLow.format( stream, $str43$__Documentation___A, rl_module_documentation( rl_module ) );
      PrintLow.format( stream, $str44$____Input_____S, rl_module_example_source( rl_module ) );
      PrintLow.format( stream, $str45$_____ );
      PrintLow.format( stream, $str46$____Desired_output_____S, rl_module_example_target( rl_module ) );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 5641L)
  public static SubLObject new_rl_module(final SubLObject module_keyword, final SubLObject plist)
  {
    final SubLObject rl_module = make_rl_module( UNPROVIDED );
    final SubLObject required_function = conses_high.getf( plist, $kw26$REQUIRED, UNPROVIDED );
    final SubLObject cost_function = conses_high.getf( plist, $kw27$COST, UNPROVIDED );
    final SubLObject reformulate_function = conses_high.getf( plist, $kw28$REFORMULATE, UNPROVIDED );
    final SubLObject documentation = conses_high.getf( plist, $kw29$DOCUMENTATION, UNPROVIDED );
    final SubLObject example_source = conses_high.getf( plist, $kw30$EXAMPLE_SOURCE, UNPROVIDED );
    final SubLObject example_target = conses_high.getf( plist, $kw31$EXAMPLE_TARGET, UNPROVIDED );
    if( NIL == required_function )
    {
      reformulator_hub.ref_warn( ZERO_INTEGER, $str47$__Missing__required_info__Abortin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    _csetf_rlm_required( rl_module, required_function );
    if( NIL == cost_function )
    {
      reformulator_hub.ref_warn( ZERO_INTEGER, $str48$__Missing__cost_info__Aborting, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    _csetf_rlm_cost( rl_module, cost_function );
    if( NIL == reformulate_function )
    {
      reformulator_hub.ref_warn( ZERO_INTEGER, $str49$__Missing__reformulate_info__Abor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    _csetf_rlm_reformulate( rl_module, reformulate_function );
    _csetf_rlm_name( rl_module, module_keyword );
    if( NIL == documentation )
    {
      reformulator_hub.ref_warn( TWO_INTEGER, $str50$__Missing__documentation_info__Ba, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    _csetf_rlm_documentation( rl_module, documentation );
    if( NIL == example_source )
    {
      reformulator_hub.ref_warn( TWO_INTEGER, $str51$__Missing__example_source_info__B, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    _csetf_rlm_example_source( rl_module, example_source );
    if( NIL == example_target )
    {
      reformulator_hub.ref_warn( TWO_INTEGER, $str52$__Missing__example_target_info__B, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    _csetf_rlm_example_target( rl_module, example_target );
    return rl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7399L)
  public static SubLObject rl_module_name(final SubLObject rl_module)
  {
    return rlm_name( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7475L)
  public static SubLObject rl_module_required_function(final SubLObject rl_module)
  {
    return rlm_required( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7602L)
  public static SubLObject rl_module_cost_function(final SubLObject rl_module)
  {
    return rlm_cost( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7721L)
  public static SubLObject rl_module_reformulate_function(final SubLObject rl_module)
  {
    return rlm_reformulate( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7854L)
  public static SubLObject rl_module_documentation(final SubLObject rl_module)
  {
    return rlm_documentation( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7946L)
  public static SubLObject rl_module_example_source(final SubLObject rl_module)
  {
    return rlm_example_source( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8040L)
  public static SubLObject rl_module_example_target(final SubLObject rl_module)
  {
    return rlm_example_target( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8134L)
  public static SubLObject rl_module_plist(final SubLObject rl_module)
  {
    return rlm_plist( rl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8210L)
  public static SubLObject valid_rl_moduleP(final SubLObject v_object)
  {
    return makeBoolean( NIL != rl_module_p( v_object ) && NIL != constant_handles.constant_p( rl_module_name( v_object ) ) && rl_module_required_function( v_object ).isFunctionSpec() && rl_module_cost_function(
        v_object ).isFunctionSpec() && rl_module_reformulate_function( v_object ).isFunctionSpec() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8515L)
  public static SubLObject do_rl_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    module = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym54$CDOLIST, $list55, ConsesLow.listS( $sym56$CLET, ConsesLow.list( reader.bq_cons( module, $list57 ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list53 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 9017L)
  public static SubLObject some_rl_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list58 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym59$CSOME, ConsesLow.list( $sym60$MOD, $list61, done_var ), ConsesLow.listS( $sym56$CLET, ConsesLow.list( reader.bq_cons( module, $list57 ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 9364L)
  public static SubLObject declare_rl_module(final SubLObject module_constant, final SubLObject plist)
  {
    clear_rl_module_store_if_corrupt();
    final SubLObject module = new_rl_module( module_constant, plist );
    add_rl_module_to_store( module );
    return module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11467L)
  public static SubLObject rl_module_store()
  {
    return $rl_module_store$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11577L)
  public static SubLObject rl_module_names()
  {
    return Mapping.mapcar( $sym63$RL_MODULE_NAME, rl_module_store() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11667L)
  public static SubLObject rl_module_store_size()
  {
    return Sequences.length( $rl_module_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11863L)
  public static SubLObject clear_rl_module_store()
  {
    $rl_module_store$.setGlobalValue( NIL );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11948L)
  public static SubLObject clear_rl_module_store_if_corrupt()
  {
    SubLObject cdolist_list_var = rl_module_store();
    SubLObject mod = NIL;
    mod = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject rl_module = mod;
      if( NIL == valid_rl_moduleP( rl_module ) )
      {
        reformulator_hub.ref_warn( ZERO_INTEGER, $str64$RL_module_store_corrupt__clearing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        clear_rl_module_store();
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      mod = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 12341L)
  public static SubLObject get_rl_module_from_store(final SubLObject constant)
  {
    SubLObject module_found = NIL;
    if( NIL == module_found )
    {
      SubLObject csome_list_var = rl_module_store();
      SubLObject mod = NIL;
      mod = csome_list_var.first();
      while ( NIL == module_found && NIL != csome_list_var)
      {
        final SubLObject rl_module = mod;
        if( constant.eql( rl_module_name( rl_module ) ) )
        {
          module_found = rl_module;
        }
        csome_list_var = csome_list_var.rest();
        mod = csome_list_var.first();
      }
    }
    return module_found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 12750L)
  public static SubLObject add_rl_module_to_store(final SubLObject rl_module)
  {
    final SubLObject constant = rl_module_name( rl_module );
    if( NIL != get_rl_module_from_store( constant ) )
    {
      reformulator_hub.ref_warn( FIVE_INTEGER, $str65$RL_module__S_already_exists_in_th, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      remove_rl_module_from_store( constant );
    }
    $rl_module_store$.setGlobalValue( ConsesLow.cons( rl_module, $rl_module_store$.getGlobalValue() ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 13245L)
  public static SubLObject remove_rl_module_from_store(final SubLObject constant)
  {
    SubLObject others = NIL;
    SubLObject cdolist_list_var = rl_module_store();
    SubLObject mod = NIL;
    mod = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject module = mod;
      if( !constant.eql( rl_module_name( module ) ) )
      {
        others = ConsesLow.cons( module, others );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mod = cdolist_list_var.first();
    }
    if( NIL != list_utilities.same_length_p( rl_module_store(), others ) )
    {
      reformulator_hub.ref_warn( TWO_INTEGER, $str66$__No_module_named__S_found_in_the, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    $rl_module_store$.setGlobalValue( Sequences.nreverse( others ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 13820L)
  public static SubLObject rl_module_applicableP(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return Functions.funcall( rl_module_required_function( rl_module ), expression, mt, settings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 14304L)
  public static SubLObject rl_module_cost(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return Functions.funcall( rl_module_cost_function( rl_module ), expression, mt, settings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 14567L)
  public static SubLObject rl_module_reformulate(final SubLObject rl_module, final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    return Functions.funcall( rl_module_reformulate_function( rl_module ), expression, original_clause, mt, settings );
  }

  public static SubLObject declare_reformulator_module_harness_file()
  {
    SubLFiles.declareFunction( me, "rl_module_print_function_trampoline", "RL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rl_module_p", "RL-MODULE-P", 1, 0, false );
    new $rl_module_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rlm_name", "RLM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "rlm_required", "RLM-REQUIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "rlm_cost", "RLM-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "rlm_reformulate", "RLM-REFORMULATE", 1, 0, false );
    SubLFiles.declareFunction( me, "rlm_documentation", "RLM-DOCUMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rlm_example_source", "RLM-EXAMPLE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rlm_example_target", "RLM-EXAMPLE-TARGET", 1, 0, false );
    SubLFiles.declareFunction( me, "rlm_plist", "RLM-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_name", "_CSETF-RLM-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_required", "_CSETF-RLM-REQUIRED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_cost", "_CSETF-RLM-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_reformulate", "_CSETF-RLM-REFORMULATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_documentation", "_CSETF-RLM-DOCUMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_example_source", "_CSETF-RLM-EXAMPLE-SOURCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_example_target", "_CSETF-RLM-EXAMPLE-TARGET", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rlm_plist", "_CSETF-RLM-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rl_module", "MAKE-RL-MODULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rl_module", "VISIT-DEFSTRUCT-RL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rl_module_method", "VISIT-DEFSTRUCT-OBJECT-RL-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_rl_module", "PRINT-RL-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "print_rl_module_documentation", "PRINT-RL-MODULE-DOCUMENTATION", 1, 1, false );
    SubLFiles.declareFunction( me, "new_rl_module", "NEW-RL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "rl_module_name", "RL-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_required_function", "RL-MODULE-REQUIRED-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_cost_function", "RL-MODULE-COST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_reformulate_function", "RL-MODULE-REFORMULATE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_documentation", "RL-MODULE-DOCUMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_example_source", "RL-MODULE-EXAMPLE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_example_target", "RL-MODULE-EXAMPLE-TARGET", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_plist", "RL-MODULE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_rl_moduleP", "VALID-RL-MODULE?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_rl_modules", "DO-RL-MODULES" );
    SubLFiles.declareMacro( me, "some_rl_modules", "SOME-RL-MODULES" );
    SubLFiles.declareFunction( me, "declare_rl_module", "DECLARE-RL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "rl_module_store", "RL-MODULE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "rl_module_names", "RL-MODULE-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "rl_module_store_size", "RL-MODULE-STORE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_rl_module_store", "CLEAR-RL-MODULE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_rl_module_store_if_corrupt", "CLEAR-RL-MODULE-STORE-IF-CORRUPT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_rl_module_from_store", "GET-RL-MODULE-FROM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_rl_module_to_store", "ADD-RL-MODULE-TO-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_rl_module_from_store", "REMOVE-RL-MODULE-FROM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_module_applicableP", "RL-MODULE-APPLICABLE?", 4, 0, false );
    SubLFiles.declareFunction( me, "rl_module_cost", "RL-MODULE-COST", 4, 0, false );
    SubLFiles.declareFunction( me, "rl_module_reformulate", "RL-MODULE-REFORMULATE", 5, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_module_harness_file()
  {
    $dtp_rl_module$ = SubLFiles.defconstant( "*DTP-RL-MODULE*", $sym0$RL_MODULE );
    $rl_module_store$ = SubLFiles.deflexical( "*RL-MODULE-STORE*", ( maybeDefault( $sym62$_RL_MODULE_STORE_, $rl_module_store$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_reformulator_module_harness_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rl_module$.getGlobalValue(), Symbols.symbol_function( $sym7$RL_MODULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$RLM_NAME, $sym10$_CSETF_RLM_NAME );
    Structures.def_csetf( $sym11$RLM_REQUIRED, $sym12$_CSETF_RLM_REQUIRED );
    Structures.def_csetf( $sym13$RLM_COST, $sym14$_CSETF_RLM_COST );
    Structures.def_csetf( $sym15$RLM_REFORMULATE, $sym16$_CSETF_RLM_REFORMULATE );
    Structures.def_csetf( $sym17$RLM_DOCUMENTATION, $sym18$_CSETF_RLM_DOCUMENTATION );
    Structures.def_csetf( $sym19$RLM_EXAMPLE_SOURCE, $sym20$_CSETF_RLM_EXAMPLE_SOURCE );
    Structures.def_csetf( $sym21$RLM_EXAMPLE_TARGET, $sym22$_CSETF_RLM_EXAMPLE_TARGET );
    Structures.def_csetf( $sym23$RLM_PLIST, $sym24$_CSETF_RLM_PLIST );
    Equality.identity( $sym0$RL_MODULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rl_module$.getGlobalValue(), Symbols.symbol_function( $sym38$VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym62$_RL_MODULE_STORE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_module_harness_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_module_harness_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_module_harness_file();
  }
  static
  {
    me = new reformulator_module_harness();
    $dtp_rl_module$ = null;
    $rl_module_store$ = null;
    $sym0$RL_MODULE = makeSymbol( "RL-MODULE" );
    $sym1$RL_MODULE_P = makeSymbol( "RL-MODULE-P" );
    $list2 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "REQUIRED" ), makeSymbol( "COST" ), makeSymbol( "REFORMULATE" ), makeSymbol( "DOCUMENTATION" ), makeSymbol( "EXAMPLE-SOURCE" ), makeSymbol(
        "EXAMPLE-TARGET" ), makeSymbol( "PLIST" ) );
    $list3 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "REQUIRED" ), makeKeyword( "COST" ), makeKeyword( "REFORMULATE" ), makeKeyword( "DOCUMENTATION" ), makeKeyword( "EXAMPLE-SOURCE" ), makeKeyword(
        "EXAMPLE-TARGET" ), makeKeyword( "PLIST" ) );
    $list4 = ConsesLow.list( makeSymbol( "RLM-NAME" ), makeSymbol( "RLM-REQUIRED" ), makeSymbol( "RLM-COST" ), makeSymbol( "RLM-REFORMULATE" ), makeSymbol( "RLM-DOCUMENTATION" ), makeSymbol( "RLM-EXAMPLE-SOURCE" ),
        makeSymbol( "RLM-EXAMPLE-TARGET" ), makeSymbol( "RLM-PLIST" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-RLM-NAME" ), makeSymbol( "_CSETF-RLM-REQUIRED" ), makeSymbol( "_CSETF-RLM-COST" ), makeSymbol( "_CSETF-RLM-REFORMULATE" ), makeSymbol( "_CSETF-RLM-DOCUMENTATION" ),
        makeSymbol( "_CSETF-RLM-EXAMPLE-SOURCE" ), makeSymbol( "_CSETF-RLM-EXAMPLE-TARGET" ), makeSymbol( "_CSETF-RLM-PLIST" ) );
    $sym6$PRINT_RL_MODULE = makeSymbol( "PRINT-RL-MODULE" );
    $sym7$RL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RL-MODULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RL-MODULE-P" ) );
    $sym9$RLM_NAME = makeSymbol( "RLM-NAME" );
    $sym10$_CSETF_RLM_NAME = makeSymbol( "_CSETF-RLM-NAME" );
    $sym11$RLM_REQUIRED = makeSymbol( "RLM-REQUIRED" );
    $sym12$_CSETF_RLM_REQUIRED = makeSymbol( "_CSETF-RLM-REQUIRED" );
    $sym13$RLM_COST = makeSymbol( "RLM-COST" );
    $sym14$_CSETF_RLM_COST = makeSymbol( "_CSETF-RLM-COST" );
    $sym15$RLM_REFORMULATE = makeSymbol( "RLM-REFORMULATE" );
    $sym16$_CSETF_RLM_REFORMULATE = makeSymbol( "_CSETF-RLM-REFORMULATE" );
    $sym17$RLM_DOCUMENTATION = makeSymbol( "RLM-DOCUMENTATION" );
    $sym18$_CSETF_RLM_DOCUMENTATION = makeSymbol( "_CSETF-RLM-DOCUMENTATION" );
    $sym19$RLM_EXAMPLE_SOURCE = makeSymbol( "RLM-EXAMPLE-SOURCE" );
    $sym20$_CSETF_RLM_EXAMPLE_SOURCE = makeSymbol( "_CSETF-RLM-EXAMPLE-SOURCE" );
    $sym21$RLM_EXAMPLE_TARGET = makeSymbol( "RLM-EXAMPLE-TARGET" );
    $sym22$_CSETF_RLM_EXAMPLE_TARGET = makeSymbol( "_CSETF-RLM-EXAMPLE-TARGET" );
    $sym23$RLM_PLIST = makeSymbol( "RLM-PLIST" );
    $sym24$_CSETF_RLM_PLIST = makeSymbol( "_CSETF-RLM-PLIST" );
    $kw25$NAME = makeKeyword( "NAME" );
    $kw26$REQUIRED = makeKeyword( "REQUIRED" );
    $kw27$COST = makeKeyword( "COST" );
    $kw28$REFORMULATE = makeKeyword( "REFORMULATE" );
    $kw29$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $kw30$EXAMPLE_SOURCE = makeKeyword( "EXAMPLE-SOURCE" );
    $kw31$EXAMPLE_TARGET = makeKeyword( "EXAMPLE-TARGET" );
    $kw32$PLIST = makeKeyword( "PLIST" );
    $str33$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw34$BEGIN = makeKeyword( "BEGIN" );
    $sym35$MAKE_RL_MODULE = makeSymbol( "MAKE-RL-MODULE" );
    $kw36$SLOT = makeKeyword( "SLOT" );
    $kw37$END = makeKeyword( "END" );
    $sym38$VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RL-MODULE-METHOD" );
    $str39$__RL_Module__Name__________S__ = makeString( "#<RL-Module: Name:        ~S~%" );
    $str40$_____________Required______S__ = makeString( "             Required:    ~S~%" );
    $str41$_____________Cost__________S__ = makeString( "             Cost:        ~S~%" );
    $str42$_____________Reformulate___S___ = makeString( "             Reformulate: ~S>~%" );
    $str43$__Documentation___A = makeString( "~%Documentation: ~A" );
    $str44$____Input_____S = makeString( "~%~%Input: ~%~S" );
    $str45$_____ = makeString( "~%==>" );
    $str46$____Desired_output_____S = makeString( "~%~%Desired output: ~%~S" );
    $str47$__Missing__required_info__Abortin = makeString( "~%Missing :required info. Aborting" );
    $str48$__Missing__cost_info__Aborting = makeString( "~%Missing :cost info. Aborting" );
    $str49$__Missing__reformulate_info__Abor = makeString( "~%Missing :reformulate info. Aborting" );
    $str50$__Missing__documentation_info__Ba = makeString( "~%Missing :documentation info. Bad programmer!" );
    $str51$__Missing__example_source_info__B = makeString( "~%Missing :example-source info. Bad programmer!" );
    $str52$__Missing__example_target_info__B = makeString( "~%Missing :example-target info. Bad programmer!" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "MODULE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym54$CDOLIST = makeSymbol( "CDOLIST" );
    $list55 = ConsesLow.list( makeSymbol( "MOD" ), ConsesLow.list( makeSymbol( "RL-MODULE-STORE" ) ) );
    $sym56$CLET = makeSymbol( "CLET" );
    $list57 = ConsesLow.list( makeSymbol( "MOD" ) );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym59$CSOME = makeSymbol( "CSOME" );
    $sym60$MOD = makeSymbol( "MOD" );
    $list61 = ConsesLow.list( makeSymbol( "RL-MODULE-STORE" ) );
    $sym62$_RL_MODULE_STORE_ = makeSymbol( "*RL-MODULE-STORE*" );
    $sym63$RL_MODULE_NAME = makeSymbol( "RL-MODULE-NAME" );
    $str64$RL_module_store_corrupt__clearing = makeString( "RL module store corrupt; clearing..." );
    $str65$RL_module__S_already_exists_in_th = makeString( "RL module ~S already exists in the store; replacing." );
    $str66$__No_module_named__S_found_in_the = makeString( "~%No module named ~S found in the store; could not remove." );
  }

  public static final class $rl_module_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $required;
    public SubLObject $cost;
    public SubLObject $reformulate;
    public SubLObject $documentation;
    public SubLObject $example_source;
    public SubLObject $example_target;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $rl_module_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$required = CommonSymbols.NIL;
      this.$cost = CommonSymbols.NIL;
      this.$reformulate = CommonSymbols.NIL;
      this.$documentation = CommonSymbols.NIL;
      this.$example_source = CommonSymbols.NIL;
      this.$example_target = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rl_module_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$required;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$cost;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$reformulate;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$documentation;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$example_source;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$example_target;
    }

    @Override
    public SubLObject getField9()
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
      return this.$required = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$cost = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$reformulate = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$documentation = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$example_source = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$example_target = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rl_module_native.class, $sym0$RL_MODULE, $sym1$RL_MODULE_P, $list2, $list3, new String[] { "$name", "$required", "$cost", "$reformulate", "$documentation",
        "$example_source", "$example_target", "$plist"
      }, $list4, $list5, $sym6$PRINT_RL_MODULE );
    }
  }

  public static final class $rl_module_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rl_module_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RL-MODULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rl_module_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 126 ms
 * 
 */