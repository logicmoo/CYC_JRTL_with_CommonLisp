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
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class special_variable_state
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.special_variable_state";
  public static final String myFingerPrint = "97d6fa004e71aea76a1b2244d12bd449c86fb4a8b461f1a79d60c3993f382b0c";
  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLSymbol $dtp_special_variable_state$;
  private static final SubLSymbol $sym0$BOUND_SPECIAL_VARIABLE_P;
  private static final SubLSymbol $sym1$SPECIAL_VARIABLE_STATE;
  private static final SubLSymbol $sym2$SPECIAL_VARIABLE_STATE_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_SPECIAL_VARIABLE_STATE;
  private static final SubLSymbol $sym8$SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$SVS_VARIABLES;
  private static final SubLSymbol $sym11$_CSETF_SVS_VARIABLES;
  private static final SubLSymbol $sym12$SVS_VALUES;
  private static final SubLSymbol $sym13$_CSETF_SVS_VALUES;
  private static final SubLSymbol $kw14$VARIABLES;
  private static final SubLSymbol $kw15$VALUES;
  private static final SubLString $str16$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw17$BEGIN;
  private static final SubLSymbol $sym18$MAKE_SPECIAL_VARIABLE_STATE;
  private static final SubLSymbol $kw19$SLOT;
  private static final SubLSymbol $kw20$END;
  private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_SPECIAL_VARIABLE_STATE_METHOD;
  private static final SubLString $str22$_S_variables;
  private static final SubLSymbol $sym23$SXHASH_SPECIAL_VARIABLE_STATE_METHOD;
  private static final SubLSymbol $sym24$BOUND_SPECIAL_VARIABLE_LIST_P;
  private static final SubLSymbol $sym25$ALIST_P;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$SVS_VAR;
  private static final SubLSymbol $sym29$CLET;
  private static final SubLSymbol $sym30$POSSIBLY_WITH_SPECIAL_VARIABLE_STATE;
  private static final SubLSymbol $sym31$CPROGV;
  private static final SubLSymbol $sym32$WITH_SPECIAL_VARIABLE_STATE_VARIABLES;
  private static final SubLSymbol $sym33$WITH_SPECIAL_VARIABLE_STATE_VALUES;
  private static final SubLSymbol $sym34$ENFORCE_TYPE;
  private static final SubLList $list35;
  private static final SubLString $str36$___S____S__;

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 1567L)
  public static SubLObject bound_symbol_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && NIL != Symbols.boundp( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 1761L)
  public static SubLObject bound_special_variable_p(final SubLObject v_object)
  {
    return bound_symbol_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2064L)
  public static SubLObject bound_special_variable_list_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.non_dotted_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym0$BOUND_SPECIAL_VARIABLE_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject special_variable_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_special_variable_state( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject special_variable_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $special_variable_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject svs_variables(final SubLObject v_object)
  {
    assert NIL != special_variable_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject svs_values(final SubLObject v_object)
  {
    assert NIL != special_variable_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject _csetf_svs_variables(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != special_variable_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject _csetf_svs_values(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != special_variable_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject make_special_variable_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $special_variable_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw14$VARIABLES ) )
      {
        _csetf_svs_variables( v_new, current_value );
      }
      else if( pcase_var.eql( $kw15$VALUES ) )
      {
        _csetf_svs_values( v_new, current_value );
      }
      else
      {
        Errors.error( $str16$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject visit_defstruct_special_variable_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw17$BEGIN, $sym18$MAKE_SPECIAL_VARIABLE_STATE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw19$SLOT, $kw14$VARIABLES, svs_variables( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$SLOT, $kw15$VALUES, svs_values( obj ) );
    Functions.funcall( visitor_fn, obj, $kw20$END, $sym18$MAKE_SPECIAL_VARIABLE_STATE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2553L)
  public static SubLObject visit_defstruct_object_special_variable_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_special_variable_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2764L)
  public static SubLObject print_special_variable_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      PrintLow.format( stream, $str22$_S_variables, Sequences.length( svs_variables( v_object ) ) );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 2996L)
  public static SubLObject sxhash_special_variable_state_method(final SubLObject v_object)
  {
    return Numbers.logxor( Sxhash.sxhash( svs_variables( v_object ) ), Sxhash.sxhash( svs_values( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 3188L)
  public static SubLObject new_special_variable_state(final SubLObject special_variables)
  {
    assert NIL != bound_special_variable_list_p( special_variables ) : special_variables;
    final SubLObject svs = make_special_variable_state( UNPROVIDED );
    _csetf_svs_variables( svs, conses_high.copy_list( special_variables ) );
    _csetf_svs_values( svs, ConsesLow.make_list( Sequences.length( special_variables ), UNPROVIDED ) );
    return update_special_variable_state( svs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 3686L)
  public static SubLObject new_special_variable_state_from_alist(final SubLObject alist)
  {
    assert NIL != list_utilities.alist_p( alist ) : alist;
    final SubLObject svs = new_special_variable_state( NIL );
    SubLObject cdolist_list_var = alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject variable = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
      variable = current.first();
      current = ( value = current.rest() );
      special_variable_state_push( svs, variable, value );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return svs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 4034L)
  public static SubLObject copy_special_variable_state(final SubLObject source_svs)
  {
    assert NIL != special_variable_state_p( source_svs ) : source_svs;
    final SubLObject svs = make_special_variable_state( UNPROVIDED );
    _csetf_svs_variables( svs, conses_high.copy_list( svs_variables( source_svs ) ) );
    _csetf_svs_values( svs, conses_high.copy_tree( svs_values( source_svs ) ) );
    return svs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 4378L)
  public static SubLObject special_variable_state_variables(final SubLObject svs)
  {
    assert NIL != special_variable_state_p( svs ) : svs;
    return svs_variables( svs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 4676L)
  public static SubLObject special_variable_state_variable_value(final SubLObject svs, final SubLObject variable, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != special_variable_state_p( svs ) : svs;
    assert NIL != bound_special_variable_p( variable ) : variable;
    final SubLObject position = Sequences.position( variable, svs_variables( svs ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject value = ( NIL != position ) ? ConsesLow.nth( position, svs_values( svs ) ) : v_default;
    return Values.values( value, list_utilities.sublisp_boolean( position ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 5200L)
  public static SubLObject possibly_with_special_variable_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject svs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    svs = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( !svs.isAtom() )
    {
      final SubLObject svs_var = $sym28$SVS_VAR;
      return ConsesLow.list( $sym29$CLET, ConsesLow.list( ConsesLow.list( svs_var, svs ) ), ConsesLow.listS( $sym30$POSSIBLY_WITH_SPECIAL_VARIABLE_STATE, svs_var, ConsesLow.append( body, NIL ) ) );
    }
    return ConsesLow.listS( $sym31$CPROGV, ConsesLow.list( $sym32$WITH_SPECIAL_VARIABLE_STATE_VARIABLES, svs ), ConsesLow.list( $sym33$WITH_SPECIAL_VARIABLE_STATE_VALUES, svs ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 5694L)
  public static SubLObject with_special_variable_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject svs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    svs = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym30$POSSIBLY_WITH_SPECIAL_VARIABLE_STATE, svs, ConsesLow.listS( $sym34$ENFORCE_TYPE, svs, $list35 ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 5971L)
  public static SubLObject with_special_variable_state_variables(final SubLObject svs)
  {
    if( NIL != svs )
    {
      enforceType( svs, $sym2$SPECIAL_VARIABLE_STATE_P );
      return svs_variables( svs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 6190L)
  public static SubLObject with_special_variable_state_values(final SubLObject svs)
  {
    if( NIL != svs )
    {
      enforceType( svs, $sym2$SPECIAL_VARIABLE_STATE_P );
      return svs_values( svs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 6391L)
  public static SubLObject update_special_variable_state(final SubLObject svs)
  {
    assert NIL != special_variable_state_p( svs ) : svs;
    update_special_variable_value_list( svs_values( svs ), svs_variables( svs ) );
    return svs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 6732L)
  public static SubLObject special_variable_state_push(final SubLObject svs, final SubLObject variable, final SubLObject value)
  {
    assert NIL != special_variable_state_p( svs ) : svs;
    assert NIL != bound_special_variable_p( variable ) : variable;
    _csetf_svs_variables( svs, ConsesLow.cons( variable, svs_variables( svs ) ) );
    _csetf_svs_values( svs, ConsesLow.cons( value, svs_values( svs ) ) );
    return svs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 7063L)
  public static SubLObject update_special_variable_value_list(final SubLObject values, final SubLObject v_variables)
  {
    SubLObject rest_variables;
    SubLObject rest_values;
    SubLObject variable;
    SubLObject value;
    for( rest_variables = NIL, rest_values = NIL, rest_variables = v_variables, rest_values = values; NIL != rest_variables; rest_variables = rest_variables.rest(), rest_values = rest_values.rest() )
    {
      variable = rest_variables.first();
      value = Symbols.symbol_value( variable );
      ConsesLow.rplaca( rest_values, value );
    }
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 7419L)
  public static SubLObject show_special_variable_state(final SubLObject svs, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != special_variable_state_p( svs ) : svs;
    SubLObject rest_variables;
    SubLObject rest_values;
    SubLObject variable;
    SubLObject value;
    for( rest_variables = NIL, rest_values = NIL, rest_variables = svs_variables( svs ), rest_values = svs_values( svs ); NIL != rest_variables; rest_variables = rest_variables.rest(), rest_values = rest_values.rest() )
    {
      variable = rest_variables.first();
      value = rest_values.first();
      PrintLow.format( stream, $str36$___S____S__, variable, value );
    }
    streams_high.force_output( stream );
    return svs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/special-variable-state.lisp", position = 7997L)
  public static SubLObject nmerge_special_variable_state(final SubLObject mutate_svs, final SubLObject override_svs)
  {
    final SubLObject cprogv_var = with_special_variable_state_variables( mutate_svs );
    final ArrayList old_values = Dynamic.extract_dynamic_values( cprogv_var );
    try
    {
      Dynamic.bind_dynamic_vars( cprogv_var, with_special_variable_state_values( mutate_svs ) );
      enforceType( mutate_svs, $sym2$SPECIAL_VARIABLE_STATE_P );
      final SubLObject cprogv_var_$1 = with_special_variable_state_variables( override_svs );
      final ArrayList old_values_$2 = Dynamic.extract_dynamic_values( cprogv_var_$1 );
      try
      {
        Dynamic.bind_dynamic_vars( cprogv_var_$1, with_special_variable_state_values( override_svs ) );
        enforceType( override_svs, $sym2$SPECIAL_VARIABLE_STATE_P );
        update_special_variable_state( mutate_svs );
      }
      finally
      {
        Dynamic.rebind_dynamic_vars( cprogv_var_$1, old_values_$2 );
      }
    }
    finally
    {
      Dynamic.rebind_dynamic_vars( cprogv_var, old_values );
    }
    return mutate_svs;
  }

  public static SubLObject declare_special_variable_state_file()
  {
    SubLFiles.declareFunction( me, "bound_symbol_p", "BOUND-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "bound_special_variable_p", "BOUND-SPECIAL-VARIABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "bound_special_variable_list_p", "BOUND-SPECIAL-VARIABLE-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "special_variable_state_print_function_trampoline", "SPECIAL-VARIABLE-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "special_variable_state_p", "SPECIAL-VARIABLE-STATE-P", 1, 0, false );
    new $special_variable_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "svs_variables", "SVS-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "svs_values", "SVS-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_svs_variables", "_CSETF-SVS-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_svs_values", "_CSETF-SVS-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_special_variable_state", "MAKE-SPECIAL-VARIABLE-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_special_variable_state", "VISIT-DEFSTRUCT-SPECIAL-VARIABLE-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_special_variable_state_method", "VISIT-DEFSTRUCT-OBJECT-SPECIAL-VARIABLE-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_special_variable_state", "PRINT-SPECIAL-VARIABLE-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_special_variable_state_method", "SXHASH-SPECIAL-VARIABLE-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_special_variable_state", "NEW-SPECIAL-VARIABLE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_special_variable_state_from_alist", "NEW-SPECIAL-VARIABLE-STATE-FROM-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_special_variable_state", "COPY-SPECIAL-VARIABLE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "special_variable_state_variables", "SPECIAL-VARIABLE-STATE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "special_variable_state_variable_value", "SPECIAL-VARIABLE-STATE-VARIABLE-VALUE", 2, 1, false );
    SubLFiles.declareMacro( me, "possibly_with_special_variable_state", "POSSIBLY-WITH-SPECIAL-VARIABLE-STATE" );
    SubLFiles.declareMacro( me, "with_special_variable_state", "WITH-SPECIAL-VARIABLE-STATE" );
    SubLFiles.declareFunction( me, "with_special_variable_state_variables", "WITH-SPECIAL-VARIABLE-STATE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "with_special_variable_state_values", "WITH-SPECIAL-VARIABLE-STATE-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "update_special_variable_state", "UPDATE-SPECIAL-VARIABLE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "special_variable_state_push", "SPECIAL-VARIABLE-STATE-PUSH", 3, 0, false );
    SubLFiles.declareFunction( me, "update_special_variable_value_list", "UPDATE-SPECIAL-VARIABLE-VALUE-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "show_special_variable_state", "SHOW-SPECIAL-VARIABLE-STATE", 1, 1, false );
    SubLFiles.declareFunction( me, "nmerge_special_variable_state", "NMERGE-SPECIAL-VARIABLE-STATE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_special_variable_state_file()
  {
    $dtp_special_variable_state$ = SubLFiles.defconstant( "*DTP-SPECIAL-VARIABLE-STATE*", $sym1$SPECIAL_VARIABLE_STATE );
    return NIL;
  }

  public static SubLObject setup_special_variable_state_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), Symbols.symbol_function( $sym8$SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$SVS_VARIABLES, $sym11$_CSETF_SVS_VARIABLES );
    Structures.def_csetf( $sym12$SVS_VALUES, $sym13$_CSETF_SVS_VALUES );
    Equality.identity( $sym1$SPECIAL_VARIABLE_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), Symbols.symbol_function(
        $sym21$VISIT_DEFSTRUCT_OBJECT_SPECIAL_VARIABLE_STATE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), Symbols.symbol_function( $sym23$SXHASH_SPECIAL_VARIABLE_STATE_METHOD ) );
    access_macros.register_macro_helper( $sym32$WITH_SPECIAL_VARIABLE_STATE_VARIABLES, $sym30$POSSIBLY_WITH_SPECIAL_VARIABLE_STATE );
    access_macros.register_macro_helper( $sym33$WITH_SPECIAL_VARIABLE_STATE_VALUES, $sym30$POSSIBLY_WITH_SPECIAL_VARIABLE_STATE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_special_variable_state_file();
  }

  @Override
  public void initializeVariables()
  {
    init_special_variable_state_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_special_variable_state_file();
  }
  static
  {
    me = new special_variable_state();
    $dtp_special_variable_state$ = null;
    $sym0$BOUND_SPECIAL_VARIABLE_P = makeSymbol( "BOUND-SPECIAL-VARIABLE-P" );
    $sym1$SPECIAL_VARIABLE_STATE = makeSymbol( "SPECIAL-VARIABLE-STATE" );
    $sym2$SPECIAL_VARIABLE_STATE_P = makeSymbol( "SPECIAL-VARIABLE-STATE-P" );
    $list3 = ConsesLow.list( makeSymbol( "VARIABLES" ), makeSymbol( "VALUES" ) );
    $list4 = ConsesLow.list( makeKeyword( "VARIABLES" ), makeKeyword( "VALUES" ) );
    $list5 = ConsesLow.list( makeSymbol( "SVS-VARIABLES" ), makeSymbol( "SVS-VALUES" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-SVS-VARIABLES" ), makeSymbol( "_CSETF-SVS-VALUES" ) );
    $sym7$PRINT_SPECIAL_VARIABLE_STATE = makeSymbol( "PRINT-SPECIAL-VARIABLE-STATE" );
    $sym8$SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SPECIAL-VARIABLE-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SPECIAL-VARIABLE-STATE-P" ) );
    $sym10$SVS_VARIABLES = makeSymbol( "SVS-VARIABLES" );
    $sym11$_CSETF_SVS_VARIABLES = makeSymbol( "_CSETF-SVS-VARIABLES" );
    $sym12$SVS_VALUES = makeSymbol( "SVS-VALUES" );
    $sym13$_CSETF_SVS_VALUES = makeSymbol( "_CSETF-SVS-VALUES" );
    $kw14$VARIABLES = makeKeyword( "VARIABLES" );
    $kw15$VALUES = makeKeyword( "VALUES" );
    $str16$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw17$BEGIN = makeKeyword( "BEGIN" );
    $sym18$MAKE_SPECIAL_VARIABLE_STATE = makeSymbol( "MAKE-SPECIAL-VARIABLE-STATE" );
    $kw19$SLOT = makeKeyword( "SLOT" );
    $kw20$END = makeKeyword( "END" );
    $sym21$VISIT_DEFSTRUCT_OBJECT_SPECIAL_VARIABLE_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SPECIAL-VARIABLE-STATE-METHOD" );
    $str22$_S_variables = makeString( "~S variables" );
    $sym23$SXHASH_SPECIAL_VARIABLE_STATE_METHOD = makeSymbol( "SXHASH-SPECIAL-VARIABLE-STATE-METHOD" );
    $sym24$BOUND_SPECIAL_VARIABLE_LIST_P = makeSymbol( "BOUND-SPECIAL-VARIABLE-LIST-P" );
    $sym25$ALIST_P = makeSymbol( "ALIST-P" );
    $list26 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $list27 = ConsesLow.list( makeSymbol( "SVS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym28$SVS_VAR = makeUninternedSymbol( "SVS-VAR" );
    $sym29$CLET = makeSymbol( "CLET" );
    $sym30$POSSIBLY_WITH_SPECIAL_VARIABLE_STATE = makeSymbol( "POSSIBLY-WITH-SPECIAL-VARIABLE-STATE" );
    $sym31$CPROGV = makeSymbol( "CPROGV" );
    $sym32$WITH_SPECIAL_VARIABLE_STATE_VARIABLES = makeSymbol( "WITH-SPECIAL-VARIABLE-STATE-VARIABLES" );
    $sym33$WITH_SPECIAL_VARIABLE_STATE_VALUES = makeSymbol( "WITH-SPECIAL-VARIABLE-STATE-VALUES" );
    $sym34$ENFORCE_TYPE = makeSymbol( "ENFORCE-TYPE" );
    $list35 = ConsesLow.list( makeSymbol( "SPECIAL-VARIABLE-STATE-P" ) );
    $str36$___S____S__ = makeString( "~&~S = ~S~%" );
  }

  public static final class $special_variable_state_native
      extends
        SubLStructNative
  {
    public SubLObject $variables;
    public SubLObject $values;
    private static final SubLStructDeclNative structDecl;

    public $special_variable_state_native()
    {
      this.$variables = CommonSymbols.NIL;
      this.$values = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $special_variable_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$variables;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$values;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$variables = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$values = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $special_variable_state_native.class, $sym1$SPECIAL_VARIABLE_STATE, $sym2$SPECIAL_VARIABLE_STATE_P, $list3, $list4, new String[] { "$variables", "$values"
      }, $list5, $list6, $sym7$PRINT_SPECIAL_VARIABLE_STATE );
    }
  }

  public static final class $special_variable_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $special_variable_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SPECIAL-VARIABLE-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return special_variable_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 210 ms
 * 
 */