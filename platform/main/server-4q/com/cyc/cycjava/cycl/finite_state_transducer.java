package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
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

public final class finite_state_transducer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.finite_state_transducer";
  public static final String myFingerPrint = "d0c68a9ff1dda9d757748fb4a5c9c46de202be54d6272fa7290991bbc3bd6b2b";
  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLSymbol $dtp_finite_state_transducer$;
  private static final SubLSymbol $sym0$FINITE_STATE_TRANSDUCER;
  private static final SubLSymbol $sym1$FINITE_STATE_TRANSDUCER_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_FST;
  private static final SubLSymbol $sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$FST_INITIAL_STATE;
  private static final SubLSymbol $sym10$_CSETF_FST_INITIAL_STATE;
  private static final SubLSymbol $sym11$FST_FINAL_STATES;
  private static final SubLSymbol $sym12$_CSETF_FST_FINAL_STATES;
  private static final SubLSymbol $sym13$FST_MACHINE_TABLE;
  private static final SubLSymbol $sym14$_CSETF_FST_MACHINE_TABLE;
  private static final SubLSymbol $sym15$FST_TOKEN_BUILDER;
  private static final SubLSymbol $sym16$_CSETF_FST_TOKEN_BUILDER;
  private static final SubLSymbol $sym17$FST_INPUT;
  private static final SubLSymbol $sym18$_CSETF_FST_INPUT;
  private static final SubLSymbol $sym19$FST_CURRENT_TOKEN_INDEX;
  private static final SubLSymbol $sym20$_CSETF_FST_CURRENT_TOKEN_INDEX;
  private static final SubLSymbol $sym21$FST_CURRENT_STATE;
  private static final SubLSymbol $sym22$_CSETF_FST_CURRENT_STATE;
  private static final SubLSymbol $sym23$FST_MEMORY;
  private static final SubLSymbol $sym24$_CSETF_FST_MEMORY;
  private static final SubLSymbol $sym25$FST_INDEXED_OUTPUT;
  private static final SubLSymbol $sym26$_CSETF_FST_INDEXED_OUTPUT;
  private static final SubLSymbol $kw27$INITIAL_STATE;
  private static final SubLSymbol $kw28$FINAL_STATES;
  private static final SubLSymbol $kw29$MACHINE_TABLE;
  private static final SubLSymbol $kw30$TOKEN_BUILDER;
  private static final SubLSymbol $kw31$INPUT;
  private static final SubLSymbol $kw32$CURRENT_TOKEN_INDEX;
  private static final SubLSymbol $kw33$CURRENT_STATE;
  private static final SubLSymbol $kw34$MEMORY;
  private static final SubLSymbol $kw35$INDEXED_OUTPUT;
  private static final SubLString $str36$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw37$BEGIN;
  private static final SubLSymbol $sym38$MAKE_FINITE_STATE_TRANSDUCER;
  private static final SubLSymbol $kw39$SLOT;
  private static final SubLSymbol $kw40$END;
  private static final SubLSymbol $sym41$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD;
  private static final SubLString $str42$__FST___S_;
  private static final SubLSymbol $sym43$FST_OUTPUT;
  private static final SubLSymbol $sym44$INTEGERP;
  private static final SubLString $str45$Invalid_final_states__a;
  private static final SubLSymbol $sym46$LISTP;
  private static final SubLSymbol $sym47$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym48$CAR;
  private static final SubLSymbol $sym49$SEQUENCEP;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$PROGN;
  private static final SubLSymbol $sym52$FST_INITIALIZE;
  private static final SubLSymbol $sym53$CDO;
  private static final SubLSymbol $sym54$FST_MATCH_INTERNAL;
  private static final SubLSymbol $sym55$NULL;
  private static final SubLSymbol $sym56$VECTOR;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$EMIT;
  private static final SubLSymbol $kw59$REMEMBER;
  private static final SubLSymbol $kw60$BACKUP;
  private static final SubLString $str61$Invalid_FST_command__a;
  private static final SubLSymbol $sym62$VECTORP;
  private static final SubLSymbol $sym63$FST_ACTION_P;
  private static final SubLString $str64$Invalid_FST_action_list__a;

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject finite_state_transducer_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_fst( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject finite_state_transducer_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $finite_state_transducer_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_initial_state(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_final_states(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_machine_table(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_token_builder(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_input(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_current_token_index(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_current_state(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_memory(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject fst_indexed_output(final SubLObject v_object)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_initial_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_final_states(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_machine_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_token_builder(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_input(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_current_token_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_current_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_memory(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject _csetf_fst_indexed_output(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != finite_state_transducer_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject make_finite_state_transducer(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $finite_state_transducer_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw27$INITIAL_STATE ) )
      {
        _csetf_fst_initial_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$FINAL_STATES ) )
      {
        _csetf_fst_final_states( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$MACHINE_TABLE ) )
      {
        _csetf_fst_machine_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$TOKEN_BUILDER ) )
      {
        _csetf_fst_token_builder( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$INPUT ) )
      {
        _csetf_fst_input( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$CURRENT_TOKEN_INDEX ) )
      {
        _csetf_fst_current_token_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$CURRENT_STATE ) )
      {
        _csetf_fst_current_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$MEMORY ) )
      {
        _csetf_fst_memory( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$INDEXED_OUTPUT ) )
      {
        _csetf_fst_indexed_output( v_new, current_value );
      }
      else
      {
        Errors.error( $str36$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject visit_defstruct_finite_state_transducer(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw37$BEGIN, $sym38$MAKE_FINITE_STATE_TRANSDUCER, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw27$INITIAL_STATE, fst_initial_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw28$FINAL_STATES, fst_final_states( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw29$MACHINE_TABLE, fst_machine_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw30$TOKEN_BUILDER, fst_token_builder( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw31$INPUT, fst_input( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw32$CURRENT_TOKEN_INDEX, fst_current_token_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw33$CURRENT_STATE, fst_current_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw34$MEMORY, fst_memory( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw35$INDEXED_OUTPUT, fst_indexed_output( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$END, $sym38$MAKE_FINITE_STATE_TRANSDUCER, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
  public static SubLObject visit_defstruct_object_finite_state_transducer_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_finite_state_transducer( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3319L)
  public static SubLObject print_fst(final SubLObject fst, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str42$__FST___S_, fst_token_builder( fst ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3530L)
  public static SubLObject fst_output_start(final SubLObject fst)
  {
    return fst_indexed_output( fst ).first().rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3733L)
  public static SubLObject fst_output_end(final SubLObject fst)
  {
    return conses_high.last( fst_indexed_output( fst ), UNPROVIDED ).first().rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3937L)
  public static SubLObject new_finite_state_transducer(final SubLObject initial_state, final SubLObject final_states, final SubLObject state_table_list, SubLObject token_builder)
  {
    if( token_builder == UNPROVIDED )
    {
      token_builder = $sym43$FST_OUTPUT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( initial_state ) : initial_state;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != list_utilities.find_if_not( $sym44$INTEGERP, final_states, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str45$Invalid_final_states__a, final_states );
    }
    assert NIL != Types.listp( state_table_list ) : state_table_list;
    assert NIL != Types.function_spec_p( token_builder ) : token_builder;
    final SubLObject fst = make_finite_state_transducer( UNPROVIDED );
    final SubLObject machine_table = Vectors.make_vector( Numbers.add( max_state( state_table_list ), ONE_INTEGER ), UNPROVIDED );
    SubLObject cdolist_list_var = Sequences.reverse( state_table_list );
    SubLObject quadruple = NIL;
    quadruple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      machine_table_set( machine_table, quadruple.first(), conses_high.second( quadruple ), conses_high.third( quadruple ), conses_high.fourth( quadruple ) );
      cdolist_list_var = cdolist_list_var.rest();
      quadruple = cdolist_list_var.first();
    }
    _csetf_fst_initial_state( fst, initial_state );
    _csetf_fst_final_states( fst, final_states );
    _csetf_fst_machine_table( fst, machine_table );
    _csetf_fst_token_builder( fst, token_builder );
    return fst;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 5549L)
  public static SubLObject fst_output(final SubLObject fst)
  {
    return Mapping.mapcar( $sym48$CAR, fst_indexed_output( fst ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 5720L)
  public static SubLObject fst_match(final SubLObject fst, final SubLObject sequence)
  {
    assert NIL != finite_state_transducer_p( fst ) : fst;
    assert NIL != Types.sequencep( sequence ) : sequence;
    fst_initialize( fst, sequence );
    fst_run( fst );
    return ( NIL != fst_final_state_p( fst ) ) ? Functions.funcall( fst_token_builder( fst ), fst ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 6234L)
  public static SubLObject fst_do_match(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject match = NIL;
    SubLObject sequence = NIL;
    SubLObject fst = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    match = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    sequence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    fst = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym51$PROGN, ConsesLow.list( $sym52$FST_INITIALIZE, fst, sequence ), ConsesLow.listS( $sym53$CDO, ConsesLow.list( ConsesLow.list( match, ConsesLow.list( $sym54$FST_MATCH_INTERNAL, fst ),
          ConsesLow.list( $sym54$FST_MATCH_INTERNAL, fst ) ) ), ConsesLow.list( ConsesLow.list( $sym55$NULL, match ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 6541L)
  public static SubLObject fst_match_global(final SubLObject fst, final SubLObject sequence)
  {
    assert NIL != finite_state_transducer_p( fst ) : fst;
    assert NIL != Types.sequencep( sequence ) : sequence;
    SubLObject matches = NIL;
    fst_initialize( fst, sequence );
    SubLObject match;
    for( match = NIL, match = fst_match_internal( fst ); NIL != match; match = fst_match_internal( fst ) )
    {
      matches = ConsesLow.cons( match, matches );
    }
    return list_utilities.list2vector( Sequences.nreverse( matches ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 6994L)
  public static SubLObject fst_initialize(final SubLObject fst, final SubLObject sequence)
  {
    _csetf_fst_input( fst, sequence.isList() ? Functions.apply( $sym56$VECTOR, sequence ) : sequence );
    _csetf_fst_current_token_index( fst, ZERO_INTEGER );
    _csetf_fst_current_state( fst, fst_initial_state( fst ) );
    _csetf_fst_indexed_output( fst, NIL );
    return fst;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 7529L)
  public static SubLObject fst_match_internal(final SubLObject fst)
  {
    _csetf_fst_current_state( fst, fst_initial_state( fst ) );
    _csetf_fst_indexed_output( fst, NIL );
    fst_run( fst );
    return ( NIL != fst_final_state_p( fst ) ) ? Functions.funcall( fst_token_builder( fst ), fst ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 8057L)
  public static SubLObject fst_run(final SubLObject fst)
  {
    final SubLObject length = Sequences.length( fst_input( fst ) );
    SubLObject machine_table_value = NIL;
    while ( !fst_current_token_index( fst ).numGE( length ) && NIL != fst_current_state( fst ) && NIL == fst_final_state_p( fst ))
    {
      machine_table_value = machine_table_get( fst_machine_table( fst ), fst_current_state( fst ), fst_current_token( fst ) );
      SubLObject cdolist_list_var = machine_table_value.first();
      SubLObject action = NIL;
      action = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        fst_execute( fst, action );
        cdolist_list_var = cdolist_list_var.rest();
        action = cdolist_list_var.first();
      }
      _csetf_fst_current_state( fst, machine_table_value.rest() );
      _csetf_fst_current_token_index( fst, Numbers.add( fst_current_token_index( fst ), ONE_INTEGER ) );
    }
    if( NIL != fst_current_state( fst ) && fst_current_token_index( fst ).eql( length ) )
    {
      machine_table_value = machine_table_get( fst_machine_table( fst ), fst_current_state( fst ), $kw40$END );
      if( NIL != machine_table_value )
      {
        SubLObject cdolist_list_var = machine_table_value.first();
        SubLObject action = NIL;
        action = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          fst_execute( fst, action );
          cdolist_list_var = cdolist_list_var.rest();
          action = cdolist_list_var.first();
        }
        _csetf_fst_current_state( fst, machine_table_value.rest() );
        _csetf_fst_current_token_index( fst, Numbers.add( fst_current_token_index( fst ), ONE_INTEGER ) );
      }
    }
    _csetf_fst_indexed_output( fst, Sequences.nreverse( fst_indexed_output( fst ) ) );
    return fst;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10031L)
  public static SubLObject fst_current_token(final SubLObject fst)
  {
    return Vectors.aref( fst_input( fst ), fst_current_token_index( fst ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10224L)
  public static SubLObject fst_final_state_p(final SubLObject fst)
  {
    return conses_high.member( fst_current_state( fst ), fst_final_states( fst ), EQL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10454L)
  public static SubLObject fst_action_p(final SubLObject v_object)
  {
    return conses_high.member( v_object, $list57, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10620L)
  public static SubLObject fst_execute(final SubLObject fst, final SubLObject command)
  {
    if( command.eql( $kw58$EMIT ) )
    {
      return fst_emit( fst );
    }
    if( command.eql( $kw59$REMEMBER ) )
    {
      return fst_remember( fst );
    }
    if( command.eql( $kw60$BACKUP ) )
    {
      return fst_backup( fst );
    }
    Errors.error( $str61$Invalid_FST_command__a, command );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 11146L)
  public static SubLObject fst_emit(final SubLObject fst)
  {
    final SubLObject token = fst_current_token( fst );
    final SubLObject modified_token = ( token.isInteger() && NIL != unicode_strings.ascii_char_code_p( token ) ) ? Characters.code_char( token )
        : ( token.isInteger() ? unicode_strings.utf8_vector_to_utf8_string( unicode_strings.to_utf8_vector( token ) ) : token );
    _csetf_fst_indexed_output( fst, ConsesLow.cons( ConsesLow.cons( modified_token, fst_current_token_index( fst ) ), fst_indexed_output( fst ) ) );
    return fst;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 11687L)
  public static SubLObject fst_remember(final SubLObject fst)
  {
    _csetf_fst_memory( fst, Numbers.subtract( fst_current_token_index( fst ), ONE_INTEGER ) );
    return fst;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 11973L)
  public static SubLObject fst_backup(final SubLObject fst)
  {
    _csetf_fst_current_token_index( fst, fst_memory( fst ) );
    return fst;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 12253L)
  public static SubLObject machine_table_set(final SubLObject table, final SubLObject start_state, final SubLObject label, final SubLObject actions, final SubLObject end_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.vectorp( table ) : table;
    assert NIL != Types.integerp( start_state ) : start_state;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != list_utilities.find_if_not( $sym63$FST_ACTION_P, actions, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str64$Invalid_FST_action_list__a, actions );
    }
    assert NIL != Types.listp( actions ) : actions;
    assert NIL != Types.integerp( end_state ) : end_state;
    Vectors.set_aref( table, start_state, ConsesLow.cons( ConsesLow.cons( label, ConsesLow.cons( actions, end_state ) ), Vectors.aref( table, start_state ) ) );
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 13052L)
  public static SubLObject machine_table_get(final SubLObject table, final SubLObject start_state, final SubLObject item)
  {
    SubLObject action_table;
    SubLObject label_value_pair;
    for( action_table = Vectors.aref( table, start_state ), label_value_pair = action_table.first(); NIL != label_value_pair && NIL == key_matches( label_value_pair.first(), item ); label_value_pair = action_table
        .first() )
    {
      action_table = action_table.rest();
    }
    return label_value_pair.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 13684L)
  public static SubLObject key_matches(final SubLObject label, SubLObject item)
  {
    if( item.isInteger() && NIL != unicode_strings.ascii_char_code_p( item ) )
    {
      item = Characters.code_char( item );
    }
    return ( NIL != item && label.isFunction() && !item.eql( $kw40$END ) ) ? Functions.funcall( label, item ) : Equality.equalp( label, item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 14226L)
  public static SubLObject max_state(final SubLObject machine_table_specification)
  {
    assert NIL != Types.listp( machine_table_specification ) : machine_table_specification;
    SubLObject max = ZERO_INTEGER;
    SubLObject cdolist_list_var = machine_table_specification;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( entry.first().numG( max ) )
      {
        max = entry.first();
      }
      if( conses_high.last( entry, UNPROVIDED ).first().numG( max ) )
      {
        max = conses_high.last( entry, UNPROVIDED ).first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return max;
  }

  public static SubLObject declare_finite_state_transducer_file()
  {
    SubLFiles.declareFunction( me, "finite_state_transducer_print_function_trampoline", "FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "finite_state_transducer_p", "FINITE-STATE-TRANSDUCER-P", 1, 0, false );
    new $finite_state_transducer_p$UnaryFunction();
    SubLFiles.declareFunction( me, "fst_initial_state", "FST-INITIAL-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_final_states", "FST-FINAL-STATES", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_machine_table", "FST-MACHINE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_token_builder", "FST-TOKEN-BUILDER", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_input", "FST-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_current_token_index", "FST-CURRENT-TOKEN-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_current_state", "FST-CURRENT-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_memory", "FST-MEMORY", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_indexed_output", "FST-INDEXED-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_initial_state", "_CSETF-FST-INITIAL-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_final_states", "_CSETF-FST-FINAL-STATES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_machine_table", "_CSETF-FST-MACHINE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_token_builder", "_CSETF-FST-TOKEN-BUILDER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_input", "_CSETF-FST-INPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_current_token_index", "_CSETF-FST-CURRENT-TOKEN-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_current_state", "_CSETF-FST-CURRENT-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_memory", "_CSETF-FST-MEMORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fst_indexed_output", "_CSETF-FST-INDEXED-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_finite_state_transducer", "MAKE-FINITE-STATE-TRANSDUCER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_finite_state_transducer", "VISIT-DEFSTRUCT-FINITE-STATE-TRANSDUCER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_finite_state_transducer_method", "VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-TRANSDUCER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_fst", "PRINT-FST", 1, 2, false );
    SubLFiles.declareFunction( me, "fst_output_start", "FST-OUTPUT-START", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_output_end", "FST-OUTPUT-END", 1, 0, false );
    SubLFiles.declareFunction( me, "new_finite_state_transducer", "NEW-FINITE-STATE-TRANSDUCER", 3, 1, false );
    SubLFiles.declareFunction( me, "fst_output", "FST-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_match", "FST-MATCH", 2, 0, false );
    SubLFiles.declareMacro( me, "fst_do_match", "FST-DO-MATCH" );
    SubLFiles.declareFunction( me, "fst_match_global", "FST-MATCH-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "fst_initialize", "FST-INITIALIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "fst_match_internal", "FST-MATCH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_run", "FST-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_current_token", "FST-CURRENT-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_final_state_p", "FST-FINAL-STATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_action_p", "FST-ACTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_execute", "FST-EXECUTE", 2, 0, false );
    SubLFiles.declareFunction( me, "fst_emit", "FST-EMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_remember", "FST-REMEMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_backup", "FST-BACKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "machine_table_set", "MACHINE-TABLE-SET", 5, 0, false );
    SubLFiles.declareFunction( me, "machine_table_get", "MACHINE-TABLE-GET", 3, 0, false );
    SubLFiles.declareFunction( me, "key_matches", "KEY-MATCHES", 2, 0, false );
    SubLFiles.declareFunction( me, "max_state", "MAX-STATE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_finite_state_transducer_file()
  {
    $dtp_finite_state_transducer$ = SubLFiles.defconstant( "*DTP-FINITE-STATE-TRANSDUCER*", $sym0$FINITE_STATE_TRANSDUCER );
    return NIL;
  }

  public static SubLObject setup_finite_state_transducer_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_finite_state_transducer$.getGlobalValue(), Symbols.symbol_function(
        $sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$FST_INITIAL_STATE, $sym10$_CSETF_FST_INITIAL_STATE );
    Structures.def_csetf( $sym11$FST_FINAL_STATES, $sym12$_CSETF_FST_FINAL_STATES );
    Structures.def_csetf( $sym13$FST_MACHINE_TABLE, $sym14$_CSETF_FST_MACHINE_TABLE );
    Structures.def_csetf( $sym15$FST_TOKEN_BUILDER, $sym16$_CSETF_FST_TOKEN_BUILDER );
    Structures.def_csetf( $sym17$FST_INPUT, $sym18$_CSETF_FST_INPUT );
    Structures.def_csetf( $sym19$FST_CURRENT_TOKEN_INDEX, $sym20$_CSETF_FST_CURRENT_TOKEN_INDEX );
    Structures.def_csetf( $sym21$FST_CURRENT_STATE, $sym22$_CSETF_FST_CURRENT_STATE );
    Structures.def_csetf( $sym23$FST_MEMORY, $sym24$_CSETF_FST_MEMORY );
    Structures.def_csetf( $sym25$FST_INDEXED_OUTPUT, $sym26$_CSETF_FST_INDEXED_OUTPUT );
    Equality.identity( $sym0$FINITE_STATE_TRANSDUCER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_finite_state_transducer$.getGlobalValue(), Symbols.symbol_function(
        $sym41$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym6$PRINT_FST );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_finite_state_transducer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_finite_state_transducer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_finite_state_transducer_file();
  }
  static
  {
    me = new finite_state_transducer();
    $dtp_finite_state_transducer$ = null;
    $sym0$FINITE_STATE_TRANSDUCER = makeSymbol( "FINITE-STATE-TRANSDUCER" );
    $sym1$FINITE_STATE_TRANSDUCER_P = makeSymbol( "FINITE-STATE-TRANSDUCER-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "INITIAL-STATE" ), makeSymbol( "FINAL-STATES" ), makeSymbol( "MACHINE-TABLE" ), makeSymbol( "TOKEN-BUILDER" ), makeSymbol( "INPUT" ), makeSymbol(
        "CURRENT-TOKEN-INDEX" ), makeSymbol( "CURRENT-STATE" ), makeSymbol( "MEMORY" ), makeSymbol( "INDEXED-OUTPUT" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "INITIAL-STATE" ), makeKeyword( "FINAL-STATES" ), makeKeyword( "MACHINE-TABLE" ), makeKeyword( "TOKEN-BUILDER" ), makeKeyword( "INPUT" ), makeKeyword(
        "CURRENT-TOKEN-INDEX" ), makeKeyword( "CURRENT-STATE" ), makeKeyword( "MEMORY" ), makeKeyword( "INDEXED-OUTPUT" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "FST-INITIAL-STATE" ), makeSymbol( "FST-FINAL-STATES" ), makeSymbol( "FST-MACHINE-TABLE" ), makeSymbol( "FST-TOKEN-BUILDER" ), makeSymbol( "FST-INPUT" ),
      makeSymbol( "FST-CURRENT-TOKEN-INDEX" ), makeSymbol( "FST-CURRENT-STATE" ), makeSymbol( "FST-MEMORY" ), makeSymbol( "FST-INDEXED-OUTPUT" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-FST-INITIAL-STATE" ), makeSymbol( "_CSETF-FST-FINAL-STATES" ), makeSymbol( "_CSETF-FST-MACHINE-TABLE" ), makeSymbol( "_CSETF-FST-TOKEN-BUILDER" ),
      makeSymbol( "_CSETF-FST-INPUT" ), makeSymbol( "_CSETF-FST-CURRENT-TOKEN-INDEX" ), makeSymbol( "_CSETF-FST-CURRENT-STATE" ), makeSymbol( "_CSETF-FST-MEMORY" ), makeSymbol( "_CSETF-FST-INDEXED-OUTPUT" )
    } );
    $sym6$PRINT_FST = makeSymbol( "PRINT-FST" );
    $sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FINITE-STATE-TRANSDUCER-P" ) );
    $sym9$FST_INITIAL_STATE = makeSymbol( "FST-INITIAL-STATE" );
    $sym10$_CSETF_FST_INITIAL_STATE = makeSymbol( "_CSETF-FST-INITIAL-STATE" );
    $sym11$FST_FINAL_STATES = makeSymbol( "FST-FINAL-STATES" );
    $sym12$_CSETF_FST_FINAL_STATES = makeSymbol( "_CSETF-FST-FINAL-STATES" );
    $sym13$FST_MACHINE_TABLE = makeSymbol( "FST-MACHINE-TABLE" );
    $sym14$_CSETF_FST_MACHINE_TABLE = makeSymbol( "_CSETF-FST-MACHINE-TABLE" );
    $sym15$FST_TOKEN_BUILDER = makeSymbol( "FST-TOKEN-BUILDER" );
    $sym16$_CSETF_FST_TOKEN_BUILDER = makeSymbol( "_CSETF-FST-TOKEN-BUILDER" );
    $sym17$FST_INPUT = makeSymbol( "FST-INPUT" );
    $sym18$_CSETF_FST_INPUT = makeSymbol( "_CSETF-FST-INPUT" );
    $sym19$FST_CURRENT_TOKEN_INDEX = makeSymbol( "FST-CURRENT-TOKEN-INDEX" );
    $sym20$_CSETF_FST_CURRENT_TOKEN_INDEX = makeSymbol( "_CSETF-FST-CURRENT-TOKEN-INDEX" );
    $sym21$FST_CURRENT_STATE = makeSymbol( "FST-CURRENT-STATE" );
    $sym22$_CSETF_FST_CURRENT_STATE = makeSymbol( "_CSETF-FST-CURRENT-STATE" );
    $sym23$FST_MEMORY = makeSymbol( "FST-MEMORY" );
    $sym24$_CSETF_FST_MEMORY = makeSymbol( "_CSETF-FST-MEMORY" );
    $sym25$FST_INDEXED_OUTPUT = makeSymbol( "FST-INDEXED-OUTPUT" );
    $sym26$_CSETF_FST_INDEXED_OUTPUT = makeSymbol( "_CSETF-FST-INDEXED-OUTPUT" );
    $kw27$INITIAL_STATE = makeKeyword( "INITIAL-STATE" );
    $kw28$FINAL_STATES = makeKeyword( "FINAL-STATES" );
    $kw29$MACHINE_TABLE = makeKeyword( "MACHINE-TABLE" );
    $kw30$TOKEN_BUILDER = makeKeyword( "TOKEN-BUILDER" );
    $kw31$INPUT = makeKeyword( "INPUT" );
    $kw32$CURRENT_TOKEN_INDEX = makeKeyword( "CURRENT-TOKEN-INDEX" );
    $kw33$CURRENT_STATE = makeKeyword( "CURRENT-STATE" );
    $kw34$MEMORY = makeKeyword( "MEMORY" );
    $kw35$INDEXED_OUTPUT = makeKeyword( "INDEXED-OUTPUT" );
    $str36$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw37$BEGIN = makeKeyword( "BEGIN" );
    $sym38$MAKE_FINITE_STATE_TRANSDUCER = makeSymbol( "MAKE-FINITE-STATE-TRANSDUCER" );
    $kw39$SLOT = makeKeyword( "SLOT" );
    $kw40$END = makeKeyword( "END" );
    $sym41$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-TRANSDUCER-METHOD" );
    $str42$__FST___S_ = makeString( "#<FST: ~S>" );
    $sym43$FST_OUTPUT = makeSymbol( "FST-OUTPUT" );
    $sym44$INTEGERP = makeSymbol( "INTEGERP" );
    $str45$Invalid_final_states__a = makeString( "Invalid final states ~a" );
    $sym46$LISTP = makeSymbol( "LISTP" );
    $sym47$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym48$CAR = makeSymbol( "CAR" );
    $sym49$SEQUENCEP = makeSymbol( "SEQUENCEP" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "MATCH" ), makeSymbol( "SEQUENCE" ), makeSymbol( "FST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym51$PROGN = makeSymbol( "PROGN" );
    $sym52$FST_INITIALIZE = makeSymbol( "FST-INITIALIZE" );
    $sym53$CDO = makeSymbol( "CDO" );
    $sym54$FST_MATCH_INTERNAL = makeSymbol( "FST-MATCH-INTERNAL" );
    $sym55$NULL = makeSymbol( "NULL" );
    $sym56$VECTOR = makeSymbol( "VECTOR" );
    $list57 = ConsesLow.list( makeKeyword( "EMIT" ), makeKeyword( "REMEMBER" ), makeKeyword( "BACKUP" ) );
    $kw58$EMIT = makeKeyword( "EMIT" );
    $kw59$REMEMBER = makeKeyword( "REMEMBER" );
    $kw60$BACKUP = makeKeyword( "BACKUP" );
    $str61$Invalid_FST_command__a = makeString( "Invalid FST command ~a" );
    $sym62$VECTORP = makeSymbol( "VECTORP" );
    $sym63$FST_ACTION_P = makeSymbol( "FST-ACTION-P" );
    $str64$Invalid_FST_action_list__a = makeString( "Invalid FST action list ~a" );
  }

  public static final class $finite_state_transducer_native
      extends
        SubLStructNative
  {
    public SubLObject $initial_state;
    public SubLObject $final_states;
    public SubLObject $machine_table;
    public SubLObject $token_builder;
    public SubLObject $input;
    public SubLObject $current_token_index;
    public SubLObject $current_state;
    public SubLObject $memory;
    public SubLObject $indexed_output;
    private static final SubLStructDeclNative structDecl;

    public $finite_state_transducer_native()
    {
      this.$initial_state = CommonSymbols.NIL;
      this.$final_states = CommonSymbols.NIL;
      this.$machine_table = CommonSymbols.NIL;
      this.$token_builder = CommonSymbols.NIL;
      this.$input = CommonSymbols.NIL;
      this.$current_token_index = CommonSymbols.NIL;
      this.$current_state = CommonSymbols.NIL;
      this.$memory = CommonSymbols.NIL;
      this.$indexed_output = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $finite_state_transducer_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$initial_state;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$final_states;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$machine_table;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$token_builder;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$input;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$current_token_index;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$current_state;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$memory;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$indexed_output;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$initial_state = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$final_states = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$machine_table = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$token_builder = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$input = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$current_token_index = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$current_state = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$memory = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$indexed_output = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $finite_state_transducer_native.class, $sym0$FINITE_STATE_TRANSDUCER, $sym1$FINITE_STATE_TRANSDUCER_P, $list2, $list3, new String[] { "$initial_state", "$final_states",
        "$machine_table", "$token_builder", "$input", "$current_token_index", "$current_state", "$memory", "$indexed_output"
      }, $list4, $list5, $sym6$PRINT_FST );
    }
  }

  public static final class $finite_state_transducer_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $finite_state_transducer_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FINITE-STATE-TRANSDUCER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return finite_state_transducer_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 125 ms
 * 
 */