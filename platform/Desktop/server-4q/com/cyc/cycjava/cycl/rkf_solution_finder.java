package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_solution_finder
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_solution_finder";
  public static final String myFingerPrint = "2a802afa986ae2efdd34146b9a3736ecde89b2fcc3562d3dde6055ef7d522c32";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 678L)
  private static SubLSymbol $sf_backchain_default$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 868L)
  private static SubLSymbol $sf_number_default$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 917L)
  private static SubLSymbol $sf_time_default$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 966L)
  private static SubLSymbol $sf_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 1820L)
  private static SubLSymbol $sf_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 1945L)
  private static SubLSymbol $sf_index$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLSymbol $dtp_sf_solution_set$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLSymbol $dtp_sf_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4844L)
  public static SubLSymbol $sf_typical_backchain_default$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4924L)
  public static SubLSymbol $sf_typical_number_default$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 5000L)
  public static SubLSymbol $sf_typical_time_default$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 13756L)
  private static SubLSymbol $sf_default_dynamic_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 19881L)
  private static SubLSymbol $sf_last_inference$;
  private static final SubLInteger $int0$30;
  private static final SubLString $str1$Solution_Finder_Lock;
  private static final SubLSymbol $sym2$WITH_LOCK_HELD;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$_SF_ISG_;
  private static final SubLSymbol $sym5$_SF_INDEX_;
  private static final SubLSymbol $sym6$SF_SOLUTION_SET;
  private static final SubLSymbol $sym7$SF_SOLUTION_SET_P;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym13$SF_SOLUTION_SET_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$SF_SOLUTION_SET_ID;
  private static final SubLSymbol $sym16$_CSETF_SF_SOLUTION_SET_ID;
  private static final SubLSymbol $sym17$SF_SOLUTION_SET_BINDINGS;
  private static final SubLSymbol $sym18$_CSETF_SF_SOLUTION_SET_BINDINGS;
  private static final SubLSymbol $sym19$SF_SOLUTION_SET_SUPPORTS;
  private static final SubLSymbol $sym20$_CSETF_SF_SOLUTION_SET_SUPPORTS;
  private static final SubLSymbol $kw21$ID;
  private static final SubLSymbol $kw22$BINDINGS;
  private static final SubLSymbol $kw23$SUPPORTS;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_SF_SOLUTION_SET;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_SF_SOLUTION_SET_METHOD;
  private static final SubLSymbol $sym30$LISTP;
  private static final SubLSymbol $sym31$SF_STATE;
  private static final SubLSymbol $sym32$SF_STATE_P;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$SF_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$SF_STATE_ID;
  private static final SubLSymbol $sym40$_CSETF_SF_STATE_ID;
  private static final SubLSymbol $sym41$SF_STATE_INTERACTION;
  private static final SubLSymbol $sym42$_CSETF_SF_STATE_INTERACTION;
  private static final SubLSymbol $sym43$SF_STATE_TEXT;
  private static final SubLSymbol $sym44$_CSETF_SF_STATE_TEXT;
  private static final SubLSymbol $sym45$SF_STATE_QUERY;
  private static final SubLSymbol $sym46$_CSETF_SF_STATE_QUERY;
  private static final SubLSymbol $sym47$SF_STATE_INFERENCE_PARAMS;
  private static final SubLSymbol $sym48$_CSETF_SF_STATE_INFERENCE_PARAMS;
  private static final SubLSymbol $sym49$SF_STATE_INFERENCE;
  private static final SubLSymbol $sym50$_CSETF_SF_STATE_INFERENCE;
  private static final SubLSymbol $sym51$SF_STATE_SOLUTION_QUEUE;
  private static final SubLSymbol $sym52$_CSETF_SF_STATE_SOLUTION_QUEUE;
  private static final SubLSymbol $sym53$SF_STATE_STATUS;
  private static final SubLSymbol $sym54$_CSETF_SF_STATE_STATUS;
  private static final SubLSymbol $sym55$SF_STATE_PROS_CONS;
  private static final SubLSymbol $sym56$_CSETF_SF_STATE_PROS_CONS;
  private static final SubLSymbol $sym57$SF_STATE_BINDING_INDEX;
  private static final SubLSymbol $sym58$_CSETF_SF_STATE_BINDING_INDEX;
  private static final SubLSymbol $kw59$INTERACTION;
  private static final SubLSymbol $kw60$TEXT;
  private static final SubLSymbol $kw61$QUERY;
  private static final SubLSymbol $kw62$INFERENCE_PARAMS;
  private static final SubLSymbol $kw63$INFERENCE;
  private static final SubLSymbol $kw64$SOLUTION_QUEUE;
  private static final SubLSymbol $kw65$STATUS;
  private static final SubLSymbol $kw66$PROS_CONS;
  private static final SubLSymbol $kw67$BINDING_INDEX;
  private static final SubLSymbol $sym68$MAKE_SF_STATE;
  private static final SubLSymbol $sym69$VISIT_DEFSTRUCT_OBJECT_SF_STATE_METHOD;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw73$BACKCHAIN;
  private static final SubLSymbol $kw74$NUMBER;
  private static final SubLSymbol $kw75$TIME;
  private static final SubLSymbol $sym76$CLET;
  private static final SubLSymbol $sym77$_SF_TYPICAL_BACKCHAIN_DEFAULT_;
  private static final SubLSymbol $sym78$FIRST_OF;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$_SF_TYPICAL_NUMBER_DEFAULT_;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$_SF_TYPICAL_TIME_DEFAULT_;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$PROGN;
  private static final SubLInteger $int85$64;
  private static final SubLSymbol $sym86$USER_INTERACTION_P;
  private static final SubLSymbol $sym87$STRINGP;
  private static final SubLSymbol $sym88$QC_QUERY_P;
  private static final SubLSymbol $sym89$ATOM;
  private static final SubLSymbol $kw90$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $sym91$INTEGERP;
  private static final SubLSymbol $kw92$MAX_NUMBER;
  private static final SubLSymbol $kw93$MAX_TIME;
  private static final SubLSymbol $kw94$MAX_PROOF_DEPTH;
  private static final SubLSymbol $sym95$PROPERTY_LIST_P;
  private static final SubLSymbol $sym96$QUERY_PROPERTY_P;
  private static final SubLSymbol $sym97$INFERENCE_P;
  private static final SubLSymbol $sym98$CONSP;
  private static final SubLSymbol $kw99$TAUTOLOGY;
  private static final SubLSymbol $sym100$QUERY_DYNAMIC_PROPERTY_P;
  private static final SubLSymbol $sym101$QUERY_STATIC_PROPERTY_P;
  private static final SubLSymbol $kw102$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $kw103$CONTINUABLE_;
  private static final SubLSymbol $kw104$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw105$HL;
  private static final SubLSymbol $kw106$RETURN;
  private static final SubLSymbol $kw107$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $kw108$FORGET_EXTRA_RESULTS_;
  private static final SubLSymbol $kw109$SF_RESOURCES;
  private static final SubLSymbol $kw110$KEEP_LOOKING;
  private static final SubLSymbol $kw111$ASK_QUIRK;
  private static final SubLSymbol $kw112$TRY_AGAIN;
  private static final SubLSymbol $kw113$SHOW_RESOURCES;
  private static final SubLList $list114;
  private static final SubLList $list115;
  private static final SubLList $list116;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 1168L)
  public static SubLObject with_sf_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$WITH_LOCK_HELD, $list3, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 1262L)
  public static SubLObject sf_find_solution_set_by_id(final SubLObject id)
  {
    return sf_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 1432L)
  public static SubLObject sf_find_solution_set_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject query = sf_find_solution_set_by_id( id );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 1595L)
  public static SubLObject sf_find_state_by_id(final SubLObject id)
  {
    return sf_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 1671L)
  public static SubLObject sf_find_state_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject state = sf_find_state_by_id( id );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2042L)
  public static SubLObject sf_next_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $sf_isg$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2149L)
  public static SubLObject sf_add_object(final SubLObject id, final SubLObject v_object)
  {
    return dictionary.dictionary_enter( $sf_index$.getGlobalValue(), id, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2292L)
  public static SubLObject sf_rem_object(final SubLObject id)
  {
    return dictionary.dictionary_remove( $sf_index$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2422L)
  public static SubLObject sf_find_object_by_id(final SubLObject id)
  {
    return dictionary.dictionary_lookup( $sf_index$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject sf_solution_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject sf_solution_set_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sf_solution_set_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject sf_solution_set_id(final SubLObject v_object)
  {
    assert NIL != sf_solution_set_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject sf_solution_set_bindings(final SubLObject v_object)
  {
    assert NIL != sf_solution_set_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject sf_solution_set_supports(final SubLObject v_object)
  {
    assert NIL != sf_solution_set_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject _csetf_sf_solution_set_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_solution_set_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject _csetf_sf_solution_set_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_solution_set_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject _csetf_sf_solution_set_supports(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_solution_set_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject make_sf_solution_set(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sf_solution_set_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw21$ID ) )
      {
        _csetf_sf_solution_set_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$BINDINGS ) )
      {
        _csetf_sf_solution_set_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$SUPPORTS ) )
      {
        _csetf_sf_solution_set_supports( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject visit_defstruct_sf_solution_set(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_SF_SOLUTION_SET, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$ID, sf_solution_set_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$BINDINGS, sf_solution_set_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$SUPPORTS, sf_solution_set_supports( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_SF_SOLUTION_SET, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2711L)
  public static SubLObject visit_defstruct_object_sf_solution_set_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sf_solution_set( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 2831L)
  public static SubLObject sf_new_solution_set()
  {
    final SubLObject solution_set = make_sf_solution_set( UNPROVIDED );
    final SubLObject id = sf_next_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_solution_set_id( solution_set, id );
      sf_add_object( id, solution_set );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return solution_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 3073L)
  public static SubLObject sf_cleanup_solution_set(final SubLObject solution_set)
  {
    assert NIL != sf_solution_set_p( solution_set ) : solution_set;
    final SubLObject id = sf_solution_set_id( solution_set );
    final SubLObject success = sf_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 3319L)
  public static SubLObject sf_set_solution_set_bindings(final SubLObject solution_set, final SubLObject v_bindings)
  {
    assert NIL != sf_solution_set_p( solution_set ) : solution_set;
    assert NIL != Types.listp( v_bindings ) : v_bindings;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_solution_set_bindings( solution_set, v_bindings );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return solution_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 3565L)
  public static SubLObject sf_add_solution_set_support_set(final SubLObject solution_set, final SubLObject support_set)
  {
    assert NIL != sf_solution_set_p( solution_set ) : solution_set;
    assert NIL != Types.listp( support_set ) : support_set;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      if( NIL == conses_high.member( support_set, sf_solution_set_supports( solution_set ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_sf_solution_set_supports( solution_set, ConsesLow.cons( support_set, sf_solution_set_supports( solution_set ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return solution_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sf_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_id(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_interaction(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_text(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_query(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_inference_params(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_inference(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_solution_queue(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_status(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_pros_cons(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject sf_state_binding_index(final SubLObject v_object)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_interaction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_text(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_inference_params(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_inference(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_solution_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_pros_cons(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject _csetf_sf_state_binding_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sf_state_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject make_sf_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sf_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw21$ID ) )
      {
        _csetf_sf_state_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$INTERACTION ) )
      {
        _csetf_sf_state_interaction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw60$TEXT ) )
      {
        _csetf_sf_state_text( v_new, current_value );
      }
      else if( pcase_var.eql( $kw61$QUERY ) )
      {
        _csetf_sf_state_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw62$INFERENCE_PARAMS ) )
      {
        _csetf_sf_state_inference_params( v_new, current_value );
      }
      else if( pcase_var.eql( $kw63$INFERENCE ) )
      {
        _csetf_sf_state_inference( v_new, current_value );
      }
      else if( pcase_var.eql( $kw64$SOLUTION_QUEUE ) )
      {
        _csetf_sf_state_solution_queue( v_new, current_value );
      }
      else if( pcase_var.eql( $kw65$STATUS ) )
      {
        _csetf_sf_state_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw66$PROS_CONS ) )
      {
        _csetf_sf_state_pros_cons( v_new, current_value );
      }
      else if( pcase_var.eql( $kw67$BINDING_INDEX ) )
      {
        _csetf_sf_state_binding_index( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject visit_defstruct_sf_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym68$MAKE_SF_STATE, TEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$ID, sf_state_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw59$INTERACTION, sf_state_interaction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw60$TEXT, sf_state_text( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw61$QUERY, sf_state_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw62$INFERENCE_PARAMS, sf_state_inference_params( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw63$INFERENCE, sf_state_inference( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw64$SOLUTION_QUEUE, sf_state_solution_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw65$STATUS, sf_state_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw66$PROS_CONS, sf_state_pros_cons( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw67$BINDING_INDEX, sf_state_binding_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym68$MAKE_SF_STATE, TEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 4014L)
  public static SubLObject visit_defstruct_object_sf_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sf_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 5074L)
  public static SubLObject with_different_sf_state_defaults(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list70 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list70 );
      if( NIL == conses_high.member( current_$1, $list71, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw72$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list70 );
    }
    final SubLObject backchain_tail = cdestructuring_bind.property_list_member( $kw73$BACKCHAIN, current );
    final SubLObject backchain = ( NIL != backchain_tail ) ? conses_high.cadr( backchain_tail ) : NIL;
    final SubLObject number_tail = cdestructuring_bind.property_list_member( $kw74$NUMBER, current );
    final SubLObject number = ( NIL != number_tail ) ? conses_high.cadr( number_tail ) : NIL;
    final SubLObject time_tail = cdestructuring_bind.property_list_member( $kw75$TIME, current );
    final SubLObject time = ( NIL != time_tail ) ? conses_high.cadr( time_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym76$CLET, ConsesLow.list( ConsesLow.list( $sym77$_SF_TYPICAL_BACKCHAIN_DEFAULT_, ConsesLow.listS( $sym78$FIRST_OF, backchain, $list79 ) ), ConsesLow.list( $sym80$_SF_TYPICAL_NUMBER_DEFAULT_,
        ConsesLow.listS( $sym78$FIRST_OF, number, $list81 ) ), ConsesLow.list( $sym82$_SF_TYPICAL_TIME_DEFAULT_, ConsesLow.listS( $sym78$FIRST_OF, time, $list83 ) ) ), reader.bq_cons( $sym84$PROGN, ConsesLow.append(
            body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 5544L)
  public static SubLObject sf_new_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject state = make_sf_state( UNPROVIDED );
    final SubLObject id = sf_next_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_id( state, id );
      sf_add_object( id, state );
      _csetf_sf_state_solution_queue( state, queues.create_queue( UNPROVIDED ) );
      _csetf_sf_state_binding_index( state, Hashtables.make_hash_table( $int85$64, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
      _csetf_sf_state_inference_params( state, ask_utilities.query_properties_from_legacy_ask_parameters( $sf_typical_backchain_default$.getDynamicValue( thread ), $sf_typical_number_default$.getDynamicValue( thread ),
          $sf_typical_time_default$.getDynamicValue( thread ), UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 6167L)
  public static SubLObject sf_cleanup_state(final SubLObject state)
  {
    assert NIL != sf_state_p( state ) : state;
    final SubLObject id = sf_state_id( state );
    final SubLObject success = sf_rem_object( id );
    final SubLObject solution_queue = sf_state_solution_queue( state );
    while ( NIL == queues.queue_empty_p( solution_queue ))
    {
      final SubLObject solution_set = queues.dequeue( solution_queue );
      sf_cleanup_solution_set( solution_set );
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 6579L)
  public static SubLObject sf_set_state_interaction(final SubLObject state, final SubLObject interaction)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != user_interaction_agenda.user_interaction_p( interaction ) : interaction;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_interaction( state, interaction );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 6828L)
  public static SubLObject sf_set_state_text(final SubLObject state, final SubLObject text)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != Types.stringp( text ) : text;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_text( state, text );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 7007L)
  public static SubLObject sf_set_state_query(final SubLObject state, final SubLObject query)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != rkf_query_constructor.qc_query_p( query ) : query;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_query( state, query );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 7194L)
  public static SubLObject sf_set_state_backchain(final SubLObject state, final SubLObject backchain)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != Types.atom( backchain ) : backchain;
    SubLObject v_properties = sf_state_inference_params( state );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      v_properties = conses_high.putf( v_properties, $kw90$MAX_TRANSFORMATION_DEPTH, backchain );
      _csetf_sf_state_inference_params( state, v_properties );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 7545L)
  public static SubLObject sf_set_state_number(final SubLObject state, final SubLObject number)
  {
    assert NIL != sf_state_p( state ) : state;
    if( NIL != number && !assertionsDisabledInClass && NIL == Types.integerp( number ) )
    {
      throw new AssertionError( number );
    }
    SubLObject v_properties = sf_state_inference_params( state );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      v_properties = conses_high.putf( v_properties, $kw92$MAX_NUMBER, number );
      _csetf_sf_state_inference_params( state, v_properties );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 7892L)
  public static SubLObject sf_set_state_time(final SubLObject state, final SubLObject time)
  {
    assert NIL != sf_state_p( state ) : state;
    if( NIL != time && !assertionsDisabledInClass && NIL == Types.integerp( time ) )
    {
      throw new AssertionError( time );
    }
    SubLObject v_properties = sf_state_inference_params( state );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      v_properties = conses_high.putf( v_properties, $kw93$MAX_TIME, time );
      _csetf_sf_state_inference_params( state, v_properties );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 8228L)
  public static SubLObject sf_set_state_depth(final SubLObject state, final SubLObject depth)
  {
    assert NIL != sf_state_p( state ) : state;
    if( NIL != depth && !assertionsDisabledInClass && NIL == Types.integerp( depth ) )
    {
      throw new AssertionError( depth );
    }
    SubLObject v_properties = sf_state_inference_params( state );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      v_properties = conses_high.putf( v_properties, $kw94$MAX_PROOF_DEPTH, depth );
      _csetf_sf_state_inference_params( state, v_properties );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 8575L)
  public static SubLObject sf_set_state_inference_params(final SubLObject state, final SubLObject inference_params)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != list_utilities.property_list_p( inference_params ) : inference_params;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = inference_params; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_inference_params( state, inference_params );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 8829L)
  public static SubLObject sf_set_state_inference(final SubLObject state, final SubLObject inference)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_inference( state, inference );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 9038L)
  public static SubLObject sf_clear_state_inference(final SubLObject state)
  {
    assert NIL != sf_state_p( state ) : state;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_inference( state, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 9195L)
  public static SubLObject sf_enqueue_state_solution_set(final SubLObject state, final SubLObject solution_set)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != sf_solution_set_p( solution_set ) : solution_set;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      queues.enqueue( solution_set, sf_state_solution_queue( state ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 9432L)
  public static SubLObject sf_clear_state_solution_queue(final SubLObject state)
  {
    assert NIL != sf_state_p( state ) : state;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      final SubLObject solution_queue = sf_state_solution_queue( state );
      if( NIL != queues.queue_p( solution_queue ) )
      {
        while ( NIL == queues.queue_empty_p( solution_queue ))
        {
          final SubLObject solution_set = queues.dequeue( solution_queue );
          sf_cleanup_solution_set( solution_set );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 9801L)
  public static SubLObject sf_note_status(final SubLObject state, final SubLObject status)
  {
    assert NIL != sf_state_p( state ) : state;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_status( state, status );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 9955L)
  public static SubLObject sf_set_state_pros_cons(final SubLObject state, final SubLObject pros_cons)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != Types.consp( pros_cons ) : pros_cons;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_pros_cons( state, pros_cons );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 10158L)
  public static SubLObject sf_clear_state_pros_cons(final SubLObject state)
  {
    assert NIL != sf_state_p( state ) : state;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      _csetf_sf_state_pros_cons( state, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 10316L)
  public static SubLObject sf_add_state_pro(final SubLObject state, final SubLObject argument)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != Types.consp( argument ) : argument;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      if( NIL == sf_state_pros_cons( state ) )
      {
        sf_set_state_pros_cons( state, ConsesLow.list( NIL, NIL ) );
      }
      ConsesLow.set_nth( ZERO_INTEGER, sf_state_pros_cons( state ), ConsesLow.cons( argument, ConsesLow.nth( ZERO_INTEGER, sf_state_pros_cons( state ) ) ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 10610L)
  public static SubLObject sf_add_state_con(final SubLObject state, final SubLObject argument)
  {
    assert NIL != sf_state_p( state ) : state;
    assert NIL != Types.consp( argument ) : argument;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sf_lock$.getGlobalValue() );
      if( NIL == sf_state_pros_cons( state ) )
      {
        sf_set_state_pros_cons( state, ConsesLow.list( NIL, NIL ) );
      }
      ConsesLow.set_nth( ONE_INTEGER, sf_state_pros_cons( state ), ConsesLow.cons( argument, ConsesLow.nth( ONE_INTEGER, sf_state_pros_cons( state ) ) ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sf_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 10904L)
  public static SubLObject sf_state_pros(final SubLObject state)
  {
    return ConsesLow.nth( ZERO_INTEGER, sf_state_pros_cons( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 11003L)
  public static SubLObject sf_state_cons(final SubLObject state)
  {
    return ConsesLow.nth( ONE_INTEGER, sf_state_pros_cons( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 11088L)
  public static SubLObject sf_state_cycl(final SubLObject state)
  {
    return rkf_query_constructor.qc_query_cycl( sf_state_query( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 11175L)
  public static SubLObject sf_state_halt_reason(final SubLObject state)
  {
    if( NIL != sf_state_tautology_p( state ) )
    {
      return $kw99$TAUTOLOGY;
    }
    final SubLObject inference = sf_state_inference( state );
    if( NIL != inference_datastructures_inference.suspended_inference_p( inference ) )
    {
      final SubLObject status = inference_datastructures_inference.inference_suspend_status( inference );
      return status;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 11530L)
  public static SubLObject sf_var_indexical_record(final SubLObject state, final SubLObject var)
  {
    return conses_high.second( conses_high.assoc( var, rkf_query_constructor.qc_query_var_map( sf_state_query( state ) ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 11677L)
  public static SubLObject sf_state_dynamic_inference_properties(final SubLObject state)
  {
    return list_utilities.filter_plist( sf_state_inference_params( state ), Symbols.symbol_function( $sym100$QUERY_DYNAMIC_PROPERTY_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 11828L)
  public static SubLObject sf_state_static_inference_properties(final SubLObject state)
  {
    return list_utilities.filter_plist( sf_state_inference_params( state ), Symbols.symbol_function( $sym101$QUERY_STATIC_PROPERTY_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 11976L)
  public static SubLObject sf_state_backchain(final SubLObject state)
  {
    return conses_high.getf( sf_state_inference_params( state ), $kw90$MAX_TRANSFORMATION_DEPTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12098L)
  public static SubLObject sf_state_number(final SubLObject state)
  {
    return conses_high.getf( sf_state_inference_params( state ), $kw92$MAX_NUMBER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12203L)
  public static SubLObject sf_state_time(final SubLObject state)
  {
    return conses_high.getf( sf_state_inference_params( state ), $kw93$MAX_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12304L)
  public static SubLObject sf_state_depth(final SubLObject state)
  {
    return conses_high.getf( sf_state_inference_params( state ), $kw94$MAX_PROOF_DEPTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12413L)
  public static SubLObject sf_declare_state_backchain(final SubLObject state, final SubLObject backchain)
  {
    return sf_set_state_backchain( state, backchain );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12527L)
  public static SubLObject sf_declare_state_number(final SubLObject state, final SubLObject number)
  {
    return sf_set_state_number( state, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12629L)
  public static SubLObject sf_declare_state_time(final SubLObject state, final SubLObject time)
  {
    return sf_set_state_time( state, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12723L)
  public static SubLObject sf_declare_state_depth(final SubLObject state, final SubLObject depth)
  {
    return sf_set_state_depth( state, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 12821L)
  public static SubLObject sf_declare_state_inference_params(final SubLObject state, final SubLObject v_properties)
  {
    assert NIL != list_utilities.property_list_p( v_properties ) : v_properties;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = v_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    return sf_set_state_inference_params( state, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 13000L)
  public static SubLObject sf_update_state_inference_params(final SubLObject state, final SubLObject v_properties)
  {
    assert NIL != list_utilities.property_list_p( v_properties ) : v_properties;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = v_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    return sf_set_state_inference_params( state, list_utilities.merge_plist( sf_state_inference_params( state ), v_properties ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 13230L)
  public static SubLObject sf_state_query_static_properties(final SubLObject state, final SubLObject ref_cycl)
  {
    final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p( ref_cycl );
    SubLObject query_static_properties = ask_utilities.query_static_properties_from_legacy_ask_parameters();
    query_static_properties = list_utilities.merge_plist( query_static_properties, sf_state_static_inference_properties( state ) );
    query_static_properties = conses_high.putf( query_static_properties, $kw102$CONDITIONAL_SENTENCE_, conditionalP );
    return query_static_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 14055L)
  public static SubLObject sf_state_query_dynamic_properties(final SubLObject state)
  {
    final SubLObject query_dynamic_properties = sf_state_dynamic_inference_properties( state );
    return list_utilities.merge_plist( query_dynamic_properties, $sf_default_dynamic_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 14290L)
  public static SubLObject sf_state_using_remembered_resources_p(final SubLObject state)
  {
    final SubLObject interaction = sf_state_interaction( state );
    final SubLObject v_agenda = user_interaction_agenda.ui_agenda( interaction );
    final SubLObject remembered_resources = user_interaction_agenda.uia_state_lookup( v_agenda, $kw109$SF_RESOURCES, UNPROVIDED );
    final SubLObject local_resources = sf_state_inference_params( state );
    return Equality.equal( remembered_resources, local_resources );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 14619L)
  public static SubLObject sf_status_update(final SubLObject state, final SubLObject property, final SubLObject value)
  {
    return sf_note_status( state, conses_high.putf( sf_state_status( state ), property, value ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 14765L)
  public static SubLObject sf_status_lookup(final SubLObject state, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != sf_state_p( state ) : state;
    return conses_high.getf( sf_state_status( state ), property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 14924L)
  public static SubLObject sf_status_clear(final SubLObject state, final SubLObject property)
  {
    return sf_note_status( state, conses_high.remf( sf_state_status( state ), property ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15046L)
  public static SubLObject sf_status_clear_all(final SubLObject state)
  {
    return sf_note_status( state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15127L)
  public static SubLObject sf_state_keep_looking_p(final SubLObject state)
  {
    return sf_status_lookup( state, $kw110$KEEP_LOOKING, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15227L)
  public static SubLObject sf_set_state_keep_looking(final SubLObject state, final SubLObject v_boolean)
  {
    return sf_status_update( state, $kw110$KEEP_LOOKING, v_boolean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15342L)
  public static SubLObject sf_state_ask_quirk_p(final SubLObject state)
  {
    return sf_status_lookup( state, $kw111$ASK_QUIRK, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15342L)
  public static SubLObject sf_set_state_ask_quirk(final SubLObject state, final SubLObject v_boolean)
  {
    return sf_status_update( state, $kw111$ASK_QUIRK, v_boolean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15576L)
  public static SubLObject sf_state_try_again_p(final SubLObject state)
  {
    return sf_status_lookup( state, $kw112$TRY_AGAIN, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15683L)
  public static SubLObject sf_set_state_try_again(final SubLObject state, final SubLObject v_boolean)
  {
    return sf_status_update( state, $kw112$TRY_AGAIN, v_boolean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15792L)
  public static SubLObject sf_state_show_resources_p(final SubLObject state)
  {
    return sf_status_lookup( state, $kw113$SHOW_RESOURCES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 15895L)
  public static SubLObject sf_set_state_show_resources(final SubLObject state, final SubLObject v_boolean)
  {
    return sf_status_update( state, $kw113$SHOW_RESOURCES, v_boolean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 16016L)
  public static SubLObject sf_state_tautology_p(final SubLObject state)
  {
    return sf_status_lookup( state, $kw99$TAUTOLOGY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 16107L)
  public static SubLObject sf_set_state_tautology(final SubLObject state, final SubLObject v_boolean)
  {
    return sf_status_update( state, $kw99$TAUTOLOGY, v_boolean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 16216L)
  public static SubLObject sf_act_new_state()
  {
    final SubLObject state = sf_new_state();
    sf_set_state_keep_looking( state, NIL );
    sf_set_state_try_again( state, NIL );
    sf_set_state_show_resources( state, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 16601L)
  public static SubLObject sf_act_new_state_with_text(final SubLObject text)
  {
    final SubLObject state = sf_act_new_state();
    sf_set_state_text( state, text );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 16741L)
  public static SubLObject sf_act_note_state_interaction(final SubLObject state, final SubLObject interaction)
  {
    return sf_set_state_interaction( state, interaction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 16861L)
  public static SubLObject sf_act_initialize_state_from_query(final SubLObject state, final SubLObject query)
  {
    sf_clear_state_solution_queue( state );
    sf_clear_state_inference( state );
    sf_clear_state_pros_cons( state );
    return sf_set_state_query( state, query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 17107L)
  public static SubLObject sf_act_set_state_backchain(final SubLObject state, final SubLObject backchain)
  {
    if( NIL != sf_state_inference( state ) )
    {
      sf_set_state_keep_looking( state, T );
    }
    if( NIL != sf_state_pros_cons( state ) )
    {
      sf_set_state_try_again( state, T );
    }
    return sf_set_state_backchain( state, backchain );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 17370L)
  public static SubLObject sf_act_set_state_number(final SubLObject state, final SubLObject number)
  {
    if( NIL != sf_state_inference( state ) )
    {
      sf_set_state_keep_looking( state, T );
    }
    if( NIL != sf_state_pros_cons( state ) )
    {
      sf_set_state_try_again( state, T );
    }
    return sf_set_state_number( state, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 17620L)
  public static SubLObject sf_act_set_state_time(final SubLObject state, final SubLObject time)
  {
    if( NIL != sf_state_inference( state ) )
    {
      sf_set_state_keep_looking( state, T );
    }
    if( NIL != sf_state_pros_cons( state ) )
    {
      sf_set_state_try_again( state, T );
    }
    return sf_set_state_time( state, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 17862L)
  public static SubLObject sf_act_set_state_depth(final SubLObject state, final SubLObject depth)
  {
    if( NIL != sf_state_inference( state ) )
    {
      sf_set_state_keep_looking( state, T );
    }
    if( NIL != sf_state_pros_cons( state ) )
    {
      sf_set_state_try_again( state, T );
    }
    return sf_set_state_depth( state, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 18108L)
  public static SubLObject sf_act_perform_ask(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject interaction = sf_state_interaction( state );
    final SubLObject cycl = sf_state_cycl( state );
    final SubLObject v_agenda = user_interaction_agenda.ui_agenda( interaction );
    final SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt( v_agenda );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$ask_quirkP$.currentBinding( thread );
    try
    {
      control_vars.$ask_quirkP$.bind( sf_state_ask_quirk_p( state ), thread );
      result = sf_act_perform_ask_int( state, cycl, mt );
    }
    finally
    {
      control_vars.$ask_quirkP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 19657L)
  public static SubLObject sf_act_perform_ask_int(final SubLObject state, final SubLObject ref_cycl, final SubLObject mt)
  {
    if( NIL != sf_yes_no_query_p( ref_cycl ) )
    {
      return sf_perform_yes_no_ask( state, ref_cycl, mt );
    }
    return sf_perform_find_bindings_ask( state, ref_cycl, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 20056L)
  public static SubLObject sf_yes_no_query_p(final SubLObject cycl_sentence)
  {
    return makeBoolean( NIL == el_utilities.sentence_free_variables( cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 20163L)
  public static SubLObject sf_perform_find_bindings_ask(final SubLObject state, final SubLObject ref_cycl, final SubLObject mt)
  {
    sf_set_state_show_resources( state, NIL );
    final SubLObject query_static_properties = sf_state_query_static_properties( state, ref_cycl );
    final SubLObject inference = inference_kernel.new_continuable_inference( ref_cycl, mt, query_static_properties );
    $sf_last_inference$.setGlobalValue( inference );
    if( NIL != inference_datastructures_inference.continuable_inference_p( inference ) )
    {
      sf_set_state_inference( state, inference );
      sf_continue_inference( state );
    }
    else
    {
      sf_set_state_keep_looking( state, NIL );
      sf_set_state_show_resources( state, T );
      final SubLObject pcase_var = inference_datastructures_inference.inference_status( inference );
      if( pcase_var.eql( $kw99$TAUTOLOGY ) )
      {
        sf_set_state_tautology( state, T );
        sf_set_state_pros_cons( state, $list114 );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 20991L)
  public static SubLObject sf_record_inference_results(final SubLObject state, final SubLObject results)
  {
    SubLObject cdolist_list_var = results;
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = result;
      SubLObject v_bindings = NIL;
      SubLObject support_set = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
      support_set = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject binding_index = sf_state_binding_index( state );
        final SubLObject ss_id = Hashtables.gethash( v_bindings, binding_index, UNPROVIDED );
        SubLObject solution_set = NIL;
        if( NIL != ss_id )
        {
          solution_set = sf_find_solution_set_by_id( ss_id );
        }
        if( NIL == solution_set )
        {
          if( NIL != ss_id )
          {
            Hashtables.remhash( v_bindings, binding_index );
          }
          solution_set = sf_new_solution_set();
          sf_set_solution_set_bindings( solution_set, v_bindings );
          Hashtables.sethash( v_bindings, binding_index, sf_solution_set_id( solution_set ) );
          sf_enqueue_state_solution_set( state, solution_set );
        }
        sf_add_solution_set_support_set( solution_set, support_set );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 21832L)
  public static SubLObject sf_perform_yes_no_ask(final SubLObject state, final SubLObject ref_cycl, final SubLObject mt)
  {
    final SubLObject backchain = sf_state_backchain( state );
    final SubLObject number = sf_state_number( state );
    final SubLObject time = sf_state_time( state );
    final SubLObject depth = sf_state_depth( state );
    sf_set_state_show_resources( state, NIL );
    SubLObject current;
    final SubLObject datum = current = rkf_query_utilities.rkf_truth( ref_cycl, mt, backchain, number, time, depth );
    SubLObject pros = NIL;
    SubLObject cons = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    pros = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    cons = current.first();
    current = current.rest();
    if( NIL == current )
    {
      sf_set_state_keep_looking( state, NIL );
      sf_set_state_try_again( state, NIL );
      if( NIL == pros && NIL == cons )
      {
        sf_set_state_show_resources( state, T );
      }
      sf_set_state_pros_cons( state, ConsesLow.list( pros, cons ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 22512L)
  public static SubLObject sf_act_resume_ask(final SubLObject state)
  {
    final SubLObject interaction = sf_state_interaction( state );
    final SubLObject v_agenda = user_interaction_agenda.ui_agenda( interaction );
    sf_continue_inference( state );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-solution-finder.lisp", position = 23116L)
  public static SubLObject sf_continue_inference(final SubLObject state)
  {
    final SubLObject inference = sf_state_inference( state );
    if( NIL != inference_datastructures_inference.continuable_inference_p( inference ) )
    {
      final SubLObject query_dynamic_properties = sf_state_query_dynamic_properties( state );
      final SubLObject results = inference_kernel.continue_inference( inference, query_dynamic_properties );
      if( NIL != inference_datastructures_inference.exhausted_inference_p( inference ) && NIL == inference_datastructures_inference.continuable_inference_p( inference ) )
      {
        sf_set_state_keep_looking( state, NIL );
      }
      else
      {
        sf_set_state_keep_looking( state, T );
      }
      if( NIL == results )
      {
        sf_set_state_show_resources( state, T );
      }
      sf_record_inference_results( state, results );
    }
    return state;
  }

  public static SubLObject declare_rkf_solution_finder_file()
  {
    SubLFiles.declareMacro( me, "with_sf_lock", "WITH-SF-LOCK" );
    SubLFiles.declareFunction( me, "sf_find_solution_set_by_id", "SF-FIND-SOLUTION-SET-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_find_solution_set_by_id_string", "SF-FIND-SOLUTION-SET-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_find_state_by_id", "SF-FIND-STATE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_find_state_by_id_string", "SF-FIND-STATE-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_next_id", "SF-NEXT-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "sf_add_object", "SF-ADD-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_rem_object", "SF-REM-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_find_object_by_id", "SF-FIND-OBJECT-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_solution_set_print_function_trampoline", "SF-SOLUTION-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_solution_set_p", "SF-SOLUTION-SET-P", 1, 0, false );
    new $sf_solution_set_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sf_solution_set_id", "SF-SOLUTION-SET-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_solution_set_bindings", "SF-SOLUTION-SET-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_solution_set_supports", "SF-SOLUTION-SET-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_solution_set_id", "_CSETF-SF-SOLUTION-SET-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_solution_set_bindings", "_CSETF-SF-SOLUTION-SET-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_solution_set_supports", "_CSETF-SF-SOLUTION-SET-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sf_solution_set", "MAKE-SF-SOLUTION-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sf_solution_set", "VISIT-DEFSTRUCT-SF-SOLUTION-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sf_solution_set_method", "VISIT-DEFSTRUCT-OBJECT-SF-SOLUTION-SET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_new_solution_set", "SF-NEW-SOLUTION-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "sf_cleanup_solution_set", "SF-CLEANUP-SOLUTION-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_set_solution_set_bindings", "SF-SET-SOLUTION-SET-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_add_solution_set_support_set", "SF-ADD-SOLUTION-SET-SUPPORT-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_print_function_trampoline", "SF-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_p", "SF-STATE-P", 1, 0, false );
    new $sf_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sf_state_id", "SF-STATE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_interaction", "SF-STATE-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_text", "SF-STATE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_query", "SF-STATE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_inference_params", "SF-STATE-INFERENCE-PARAMS", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_inference", "SF-STATE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_solution_queue", "SF-STATE-SOLUTION-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_status", "SF-STATE-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_pros_cons", "SF-STATE-PROS-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_binding_index", "SF-STATE-BINDING-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_id", "_CSETF-SF-STATE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_interaction", "_CSETF-SF-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_text", "_CSETF-SF-STATE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_query", "_CSETF-SF-STATE-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_inference_params", "_CSETF-SF-STATE-INFERENCE-PARAMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_inference", "_CSETF-SF-STATE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_solution_queue", "_CSETF-SF-STATE-SOLUTION-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_status", "_CSETF-SF-STATE-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_pros_cons", "_CSETF-SF-STATE-PROS-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sf_state_binding_index", "_CSETF-SF-STATE-BINDING-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sf_state", "MAKE-SF-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sf_state", "VISIT-DEFSTRUCT-SF-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sf_state_method", "VISIT-DEFSTRUCT-OBJECT-SF-STATE-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_different_sf_state_defaults", "WITH-DIFFERENT-SF-STATE-DEFAULTS" );
    SubLFiles.declareFunction( me, "sf_new_state", "SF-NEW-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "sf_cleanup_state", "SF-CLEANUP-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_interaction", "SF-SET-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_text", "SF-SET-STATE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_query", "SF-SET-STATE-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_backchain", "SF-SET-STATE-BACKCHAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_number", "SF-SET-STATE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_time", "SF-SET-STATE-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_depth", "SF-SET-STATE-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_inference_params", "SF-SET-STATE-INFERENCE-PARAMS", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_inference", "SF-SET-STATE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_clear_state_inference", "SF-CLEAR-STATE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_enqueue_state_solution_set", "SF-ENQUEUE-STATE-SOLUTION-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_clear_state_solution_queue", "SF-CLEAR-STATE-SOLUTION-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_note_status", "SF-NOTE-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_pros_cons", "SF-SET-STATE-PROS-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_clear_state_pros_cons", "SF-CLEAR-STATE-PROS-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_add_state_pro", "SF-ADD-STATE-PRO", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_add_state_con", "SF-ADD-STATE-CON", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_pros", "SF-STATE-PROS", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_cons", "SF-STATE-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_cycl", "SF-STATE-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_halt_reason", "SF-STATE-HALT-REASON", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_var_indexical_record", "SF-VAR-INDEXICAL-RECORD", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_dynamic_inference_properties", "SF-STATE-DYNAMIC-INFERENCE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_static_inference_properties", "SF-STATE-STATIC-INFERENCE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_backchain", "SF-STATE-BACKCHAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_number", "SF-STATE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_time", "SF-STATE-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_depth", "SF-STATE-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_declare_state_backchain", "SF-DECLARE-STATE-BACKCHAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_declare_state_number", "SF-DECLARE-STATE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_declare_state_time", "SF-DECLARE-STATE-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_declare_state_depth", "SF-DECLARE-STATE-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_declare_state_inference_params", "SF-DECLARE-STATE-INFERENCE-PARAMS", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_update_state_inference_params", "SF-UPDATE-STATE-INFERENCE-PARAMS", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_query_static_properties", "SF-STATE-QUERY-STATIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_query_dynamic_properties", "SF-STATE-QUERY-DYNAMIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_using_remembered_resources_p", "SF-STATE-USING-REMEMBERED-RESOURCES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_status_update", "SF-STATUS-UPDATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sf_status_lookup", "SF-STATUS-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "sf_status_clear", "SF-STATUS-CLEAR", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_status_clear_all", "SF-STATUS-CLEAR-ALL", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_state_keep_looking_p", "SF-STATE-KEEP-LOOKING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_keep_looking", "SF-SET-STATE-KEEP-LOOKING", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_ask_quirk_p", "SF-STATE-ASK-QUIRK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_ask_quirk", "SF-SET-STATE-ASK-QUIRK", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_try_again_p", "SF-STATE-TRY-AGAIN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_try_again", "SF-SET-STATE-TRY-AGAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_show_resources_p", "SF-STATE-SHOW-RESOURCES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_show_resources", "SF-SET-STATE-SHOW-RESOURCES", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_state_tautology_p", "SF-STATE-TAUTOLOGY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_set_state_tautology", "SF-SET-STATE-TAUTOLOGY", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_act_new_state", "SF-ACT-NEW-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "sf_act_new_state_with_text", "SF-ACT-NEW-STATE-WITH-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_act_note_state_interaction", "SF-ACT-NOTE-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_act_initialize_state_from_query", "SF-ACT-INITIALIZE-STATE-FROM-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_act_set_state_backchain", "SF-ACT-SET-STATE-BACKCHAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_act_set_state_number", "SF-ACT-SET-STATE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_act_set_state_time", "SF-ACT-SET-STATE-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_act_set_state_depth", "SF-ACT-SET-STATE-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_act_perform_ask", "SF-ACT-PERFORM-ASK", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_act_perform_ask_int", "SF-ACT-PERFORM-ASK-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "sf_yes_no_query_p", "SF-YES-NO-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_perform_find_bindings_ask", "SF-PERFORM-FIND-BINDINGS-ASK", 3, 0, false );
    SubLFiles.declareFunction( me, "sf_record_inference_results", "SF-RECORD-INFERENCE-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sf_perform_yes_no_ask", "SF-PERFORM-YES-NO-ASK", 3, 0, false );
    SubLFiles.declareFunction( me, "sf_act_resume_ask", "SF-ACT-RESUME-ASK", 1, 0, false );
    SubLFiles.declareFunction( me, "sf_continue_inference", "SF-CONTINUE-INFERENCE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_solution_finder_file()
  {
    $sf_backchain_default$ = SubLFiles.defconstant( "*SF-BACKCHAIN-DEFAULT*", NIL );
    $sf_number_default$ = SubLFiles.defconstant( "*SF-NUMBER-DEFAULT*", TEN_INTEGER );
    $sf_time_default$ = SubLFiles.defconstant( "*SF-TIME-DEFAULT*", $int0$30 );
    $sf_lock$ = SubLFiles.deflexical( "*SF-LOCK*", Locks.make_lock( $str1$Solution_Finder_Lock ) );
    $sf_isg$ = SubLFiles.deflexical( "*SF-ISG*", maybeDefault( $sym4$_SF_ISG_, $sf_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
    $sf_index$ = SubLFiles.deflexical( "*SF-INDEX*", maybeDefault( $sym5$_SF_INDEX_, $sf_index$, () -> ( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_sf_solution_set$ = SubLFiles.defconstant( "*DTP-SF-SOLUTION-SET*", $sym6$SF_SOLUTION_SET );
    $dtp_sf_state$ = SubLFiles.defconstant( "*DTP-SF-STATE*", $sym31$SF_STATE );
    $sf_typical_backchain_default$ = SubLFiles.defparameter( "*SF-TYPICAL-BACKCHAIN-DEFAULT*", $sf_backchain_default$.getGlobalValue() );
    $sf_typical_number_default$ = SubLFiles.defparameter( "*SF-TYPICAL-NUMBER-DEFAULT*", $sf_number_default$.getGlobalValue() );
    $sf_typical_time_default$ = SubLFiles.defparameter( "*SF-TYPICAL-TIME-DEFAULT*", $sf_time_default$.getGlobalValue() );
    $sf_default_dynamic_properties$ = SubLFiles.deflexical( "*SF-DEFAULT-DYNAMIC-PROPERTIES*", ConsesLow.list( $kw103$CONTINUABLE_, T, $kw104$ANSWER_LANGUAGE, $kw105$HL, $kw106$RETURN, $kw107$BINDINGS_AND_SUPPORTS,
        $kw108$FORGET_EXTRA_RESULTS_, NIL ) );
    $sf_last_inference$ = SubLFiles.deflexical( "*SF-LAST-INFERENCE*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_solution_finder_file()
  {
    subl_macro_promotions.declare_defglobal( $sym4$_SF_ISG_ );
    subl_macro_promotions.declare_defglobal( $sym5$_SF_INDEX_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sf_solution_set$.getGlobalValue(), Symbols.symbol_function( $sym13$SF_SOLUTION_SET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list14 );
    Structures.def_csetf( $sym15$SF_SOLUTION_SET_ID, $sym16$_CSETF_SF_SOLUTION_SET_ID );
    Structures.def_csetf( $sym17$SF_SOLUTION_SET_BINDINGS, $sym18$_CSETF_SF_SOLUTION_SET_BINDINGS );
    Structures.def_csetf( $sym19$SF_SOLUTION_SET_SUPPORTS, $sym20$_CSETF_SF_SOLUTION_SET_SUPPORTS );
    Equality.identity( $sym6$SF_SOLUTION_SET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sf_solution_set$.getGlobalValue(), Symbols.symbol_function(
        $sym29$VISIT_DEFSTRUCT_OBJECT_SF_SOLUTION_SET_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sf_state$.getGlobalValue(), Symbols.symbol_function( $sym37$SF_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list38 );
    Structures.def_csetf( $sym39$SF_STATE_ID, $sym40$_CSETF_SF_STATE_ID );
    Structures.def_csetf( $sym41$SF_STATE_INTERACTION, $sym42$_CSETF_SF_STATE_INTERACTION );
    Structures.def_csetf( $sym43$SF_STATE_TEXT, $sym44$_CSETF_SF_STATE_TEXT );
    Structures.def_csetf( $sym45$SF_STATE_QUERY, $sym46$_CSETF_SF_STATE_QUERY );
    Structures.def_csetf( $sym47$SF_STATE_INFERENCE_PARAMS, $sym48$_CSETF_SF_STATE_INFERENCE_PARAMS );
    Structures.def_csetf( $sym49$SF_STATE_INFERENCE, $sym50$_CSETF_SF_STATE_INFERENCE );
    Structures.def_csetf( $sym51$SF_STATE_SOLUTION_QUEUE, $sym52$_CSETF_SF_STATE_SOLUTION_QUEUE );
    Structures.def_csetf( $sym53$SF_STATE_STATUS, $sym54$_CSETF_SF_STATE_STATUS );
    Structures.def_csetf( $sym55$SF_STATE_PROS_CONS, $sym56$_CSETF_SF_STATE_PROS_CONS );
    Structures.def_csetf( $sym57$SF_STATE_BINDING_INDEX, $sym58$_CSETF_SF_STATE_BINDING_INDEX );
    Equality.identity( $sym31$SF_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sf_state$.getGlobalValue(), Symbols.symbol_function( $sym69$VISIT_DEFSTRUCT_OBJECT_SF_STATE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_solution_finder_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_solution_finder_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_solution_finder_file();
  }
  static
  {
    me = new rkf_solution_finder();
    $sf_backchain_default$ = null;
    $sf_number_default$ = null;
    $sf_time_default$ = null;
    $sf_lock$ = null;
    $sf_isg$ = null;
    $sf_index$ = null;
    $dtp_sf_solution_set$ = null;
    $dtp_sf_state$ = null;
    $sf_typical_backchain_default$ = null;
    $sf_typical_number_default$ = null;
    $sf_typical_time_default$ = null;
    $sf_default_dynamic_properties$ = null;
    $sf_last_inference$ = null;
    $int0$30 = makeInteger( 30 );
    $str1$Solution_Finder_Lock = makeString( "Solution Finder Lock" );
    $sym2$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list3 = ConsesLow.list( makeSymbol( "*SF-LOCK*" ) );
    $sym4$_SF_ISG_ = makeSymbol( "*SF-ISG*" );
    $sym5$_SF_INDEX_ = makeSymbol( "*SF-INDEX*" );
    $sym6$SF_SOLUTION_SET = makeSymbol( "SF-SOLUTION-SET" );
    $sym7$SF_SOLUTION_SET_P = makeSymbol( "SF-SOLUTION-SET-P" );
    $list8 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $list9 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "BINDINGS" ), makeKeyword( "SUPPORTS" ) );
    $list10 = ConsesLow.list( makeSymbol( "SF-SOLUTION-SET-ID" ), makeSymbol( "SF-SOLUTION-SET-BINDINGS" ), makeSymbol( "SF-SOLUTION-SET-SUPPORTS" ) );
    $list11 = ConsesLow.list( makeSymbol( "_CSETF-SF-SOLUTION-SET-ID" ), makeSymbol( "_CSETF-SF-SOLUTION-SET-BINDINGS" ), makeSymbol( "_CSETF-SF-SOLUTION-SET-SUPPORTS" ) );
    $sym12$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym13$SF_SOLUTION_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SF-SOLUTION-SET-PRINT-FUNCTION-TRAMPOLINE" );
    $list14 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SF-SOLUTION-SET-P" ) );
    $sym15$SF_SOLUTION_SET_ID = makeSymbol( "SF-SOLUTION-SET-ID" );
    $sym16$_CSETF_SF_SOLUTION_SET_ID = makeSymbol( "_CSETF-SF-SOLUTION-SET-ID" );
    $sym17$SF_SOLUTION_SET_BINDINGS = makeSymbol( "SF-SOLUTION-SET-BINDINGS" );
    $sym18$_CSETF_SF_SOLUTION_SET_BINDINGS = makeSymbol( "_CSETF-SF-SOLUTION-SET-BINDINGS" );
    $sym19$SF_SOLUTION_SET_SUPPORTS = makeSymbol( "SF-SOLUTION-SET-SUPPORTS" );
    $sym20$_CSETF_SF_SOLUTION_SET_SUPPORTS = makeSymbol( "_CSETF-SF-SOLUTION-SET-SUPPORTS" );
    $kw21$ID = makeKeyword( "ID" );
    $kw22$BINDINGS = makeKeyword( "BINDINGS" );
    $kw23$SUPPORTS = makeKeyword( "SUPPORTS" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_SF_SOLUTION_SET = makeSymbol( "MAKE-SF-SOLUTION-SET" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_SF_SOLUTION_SET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SF-SOLUTION-SET-METHOD" );
    $sym30$LISTP = makeSymbol( "LISTP" );
    $sym31$SF_STATE = makeSymbol( "SF-STATE" );
    $sym32$SF_STATE_P = makeSymbol( "SF-STATE-P" );
    $list33 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "INTERACTION" ), makeSymbol( "TEXT" ), makeSymbol( "QUERY" ), makeSymbol( "INFERENCE-PARAMS" ), makeSymbol( "INFERENCE" ), makeSymbol(
        "SOLUTION-QUEUE" ), makeSymbol( "STATUS" ), makeSymbol( "PROS-CONS" ), makeSymbol( "BINDING-INDEX" )
    } );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "INTERACTION" ), makeKeyword( "TEXT" ), makeKeyword( "QUERY" ), makeKeyword( "INFERENCE-PARAMS" ), makeKeyword( "INFERENCE" ),
      makeKeyword( "SOLUTION-QUEUE" ), makeKeyword( "STATUS" ), makeKeyword( "PROS-CONS" ), makeKeyword( "BINDING-INDEX" )
    } );
    $list35 = ConsesLow.list( new SubLObject[] { makeSymbol( "SF-STATE-ID" ), makeSymbol( "SF-STATE-INTERACTION" ), makeSymbol( "SF-STATE-TEXT" ), makeSymbol( "SF-STATE-QUERY" ), makeSymbol(
        "SF-STATE-INFERENCE-PARAMS" ), makeSymbol( "SF-STATE-INFERENCE" ), makeSymbol( "SF-STATE-SOLUTION-QUEUE" ), makeSymbol( "SF-STATE-STATUS" ), makeSymbol( "SF-STATE-PROS-CONS" ), makeSymbol(
            "SF-STATE-BINDING-INDEX" )
    } );
    $list36 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-SF-STATE-ID" ), makeSymbol( "_CSETF-SF-STATE-INTERACTION" ), makeSymbol( "_CSETF-SF-STATE-TEXT" ), makeSymbol( "_CSETF-SF-STATE-QUERY" ), makeSymbol(
        "_CSETF-SF-STATE-INFERENCE-PARAMS" ), makeSymbol( "_CSETF-SF-STATE-INFERENCE" ), makeSymbol( "_CSETF-SF-STATE-SOLUTION-QUEUE" ), makeSymbol( "_CSETF-SF-STATE-STATUS" ), makeSymbol( "_CSETF-SF-STATE-PROS-CONS" ),
      makeSymbol( "_CSETF-SF-STATE-BINDING-INDEX" )
    } );
    $sym37$SF_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SF-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list38 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SF-STATE-P" ) );
    $sym39$SF_STATE_ID = makeSymbol( "SF-STATE-ID" );
    $sym40$_CSETF_SF_STATE_ID = makeSymbol( "_CSETF-SF-STATE-ID" );
    $sym41$SF_STATE_INTERACTION = makeSymbol( "SF-STATE-INTERACTION" );
    $sym42$_CSETF_SF_STATE_INTERACTION = makeSymbol( "_CSETF-SF-STATE-INTERACTION" );
    $sym43$SF_STATE_TEXT = makeSymbol( "SF-STATE-TEXT" );
    $sym44$_CSETF_SF_STATE_TEXT = makeSymbol( "_CSETF-SF-STATE-TEXT" );
    $sym45$SF_STATE_QUERY = makeSymbol( "SF-STATE-QUERY" );
    $sym46$_CSETF_SF_STATE_QUERY = makeSymbol( "_CSETF-SF-STATE-QUERY" );
    $sym47$SF_STATE_INFERENCE_PARAMS = makeSymbol( "SF-STATE-INFERENCE-PARAMS" );
    $sym48$_CSETF_SF_STATE_INFERENCE_PARAMS = makeSymbol( "_CSETF-SF-STATE-INFERENCE-PARAMS" );
    $sym49$SF_STATE_INFERENCE = makeSymbol( "SF-STATE-INFERENCE" );
    $sym50$_CSETF_SF_STATE_INFERENCE = makeSymbol( "_CSETF-SF-STATE-INFERENCE" );
    $sym51$SF_STATE_SOLUTION_QUEUE = makeSymbol( "SF-STATE-SOLUTION-QUEUE" );
    $sym52$_CSETF_SF_STATE_SOLUTION_QUEUE = makeSymbol( "_CSETF-SF-STATE-SOLUTION-QUEUE" );
    $sym53$SF_STATE_STATUS = makeSymbol( "SF-STATE-STATUS" );
    $sym54$_CSETF_SF_STATE_STATUS = makeSymbol( "_CSETF-SF-STATE-STATUS" );
    $sym55$SF_STATE_PROS_CONS = makeSymbol( "SF-STATE-PROS-CONS" );
    $sym56$_CSETF_SF_STATE_PROS_CONS = makeSymbol( "_CSETF-SF-STATE-PROS-CONS" );
    $sym57$SF_STATE_BINDING_INDEX = makeSymbol( "SF-STATE-BINDING-INDEX" );
    $sym58$_CSETF_SF_STATE_BINDING_INDEX = makeSymbol( "_CSETF-SF-STATE-BINDING-INDEX" );
    $kw59$INTERACTION = makeKeyword( "INTERACTION" );
    $kw60$TEXT = makeKeyword( "TEXT" );
    $kw61$QUERY = makeKeyword( "QUERY" );
    $kw62$INFERENCE_PARAMS = makeKeyword( "INFERENCE-PARAMS" );
    $kw63$INFERENCE = makeKeyword( "INFERENCE" );
    $kw64$SOLUTION_QUEUE = makeKeyword( "SOLUTION-QUEUE" );
    $kw65$STATUS = makeKeyword( "STATUS" );
    $kw66$PROS_CONS = makeKeyword( "PROS-CONS" );
    $kw67$BINDING_INDEX = makeKeyword( "BINDING-INDEX" );
    $sym68$MAKE_SF_STATE = makeSymbol( "MAKE-SF-STATE" );
    $sym69$VISIT_DEFSTRUCT_OBJECT_SF_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SF-STATE-METHOD" );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list71 = ConsesLow.list( makeKeyword( "BACKCHAIN" ), makeKeyword( "NUMBER" ), makeKeyword( "TIME" ) );
    $kw72$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw73$BACKCHAIN = makeKeyword( "BACKCHAIN" );
    $kw74$NUMBER = makeKeyword( "NUMBER" );
    $kw75$TIME = makeKeyword( "TIME" );
    $sym76$CLET = makeSymbol( "CLET" );
    $sym77$_SF_TYPICAL_BACKCHAIN_DEFAULT_ = makeSymbol( "*SF-TYPICAL-BACKCHAIN-DEFAULT*" );
    $sym78$FIRST_OF = makeSymbol( "FIRST-OF" );
    $list79 = ConsesLow.list( makeSymbol( "*SF-TYPICAL-BACKCHAIN-DEFAULT*" ) );
    $sym80$_SF_TYPICAL_NUMBER_DEFAULT_ = makeSymbol( "*SF-TYPICAL-NUMBER-DEFAULT*" );
    $list81 = ConsesLow.list( makeSymbol( "*SF-TYPICAL-NUMBER-DEFAULT*" ) );
    $sym82$_SF_TYPICAL_TIME_DEFAULT_ = makeSymbol( "*SF-TYPICAL-TIME-DEFAULT*" );
    $list83 = ConsesLow.list( makeSymbol( "*SF-TYPICAL-TIME-DEFAULT*" ) );
    $sym84$PROGN = makeSymbol( "PROGN" );
    $int85$64 = makeInteger( 64 );
    $sym86$USER_INTERACTION_P = makeSymbol( "USER-INTERACTION-P" );
    $sym87$STRINGP = makeSymbol( "STRINGP" );
    $sym88$QC_QUERY_P = makeSymbol( "QC-QUERY-P" );
    $sym89$ATOM = makeSymbol( "ATOM" );
    $kw90$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $sym91$INTEGERP = makeSymbol( "INTEGERP" );
    $kw92$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw93$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw94$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $sym95$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym96$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
    $sym97$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym98$CONSP = makeSymbol( "CONSP" );
    $kw99$TAUTOLOGY = makeKeyword( "TAUTOLOGY" );
    $sym100$QUERY_DYNAMIC_PROPERTY_P = makeSymbol( "QUERY-DYNAMIC-PROPERTY-P" );
    $sym101$QUERY_STATIC_PROPERTY_P = makeSymbol( "QUERY-STATIC-PROPERTY-P" );
    $kw102$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw103$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw104$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw105$HL = makeKeyword( "HL" );
    $kw106$RETURN = makeKeyword( "RETURN" );
    $kw107$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $kw108$FORGET_EXTRA_RESULTS_ = makeKeyword( "FORGET-EXTRA-RESULTS?" );
    $kw109$SF_RESOURCES = makeKeyword( "SF-RESOURCES" );
    $kw110$KEEP_LOOKING = makeKeyword( "KEEP-LOOKING" );
    $kw111$ASK_QUIRK = makeKeyword( "ASK-QUIRK" );
    $kw112$TRY_AGAIN = makeKeyword( "TRY-AGAIN" );
    $kw113$SHOW_RESOURCES = makeKeyword( "SHOW-RESOURCES" );
    $list114 = ConsesLow.list( makeKeyword( "TAUTOLOGY" ), makeKeyword( "TAUTOLOGY" ) );
    $list115 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORT-SET" ) );
    $list116 = ConsesLow.list( makeSymbol( "PROS" ), makeSymbol( "CONS" ) );
  }

  public static final class $sf_solution_set_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $bindings;
    public SubLObject $supports;
    private static final SubLStructDeclNative structDecl;

    public $sf_solution_set_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$bindings = CommonSymbols.NIL;
      this.$supports = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sf_solution_set_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$bindings;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$supports;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$bindings = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$supports = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sf_solution_set_native.class, $sym6$SF_SOLUTION_SET, $sym7$SF_SOLUTION_SET_P, $list8, $list9, new String[] { "$id", "$bindings", "$supports"
      }, $list10, $list11, $sym12$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sf_solution_set_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sf_solution_set_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SF-SOLUTION-SET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sf_solution_set_p( arg1 );
    }
  }

  public static final class $sf_state_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $interaction;
    public SubLObject $text;
    public SubLObject $query;
    public SubLObject $inference_params;
    public SubLObject $inference;
    public SubLObject $solution_queue;
    public SubLObject $status;
    public SubLObject $pros_cons;
    public SubLObject $binding_index;
    private static final SubLStructDeclNative structDecl;

    public $sf_state_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$interaction = CommonSymbols.NIL;
      this.$text = CommonSymbols.NIL;
      this.$query = CommonSymbols.NIL;
      this.$inference_params = CommonSymbols.NIL;
      this.$inference = CommonSymbols.NIL;
      this.$solution_queue = CommonSymbols.NIL;
      this.$status = CommonSymbols.NIL;
      this.$pros_cons = CommonSymbols.NIL;
      this.$binding_index = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sf_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$interaction;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$text;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$query;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$inference_params;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$inference;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$solution_queue;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$status;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$pros_cons;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$binding_index;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$interaction = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$text = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$query = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$inference_params = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$inference = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$solution_queue = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$status = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$pros_cons = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$binding_index = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sf_state_native.class, $sym31$SF_STATE, $sym32$SF_STATE_P, $list33, $list34, new String[] { "$id", "$interaction", "$text", "$query", "$inference_params",
        "$inference", "$solution_queue", "$status", "$pros_cons", "$binding_index"
      }, $list35, $list36, $sym12$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sf_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sf_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SF-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sf_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 359 ms synthetic
 */