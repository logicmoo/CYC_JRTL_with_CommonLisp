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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_query_constructor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_query_constructor";
  public static final String myFingerPrint = "863de7e9932e18a59f0b7e615948cc9434d55ec0bfb6ff8f52c186a4c6898881";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 759L)
  private static SubLSymbol $qc_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1598L)
  private static SubLSymbol $qc_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1723L)
  private static SubLSymbol $qc_index$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLSymbol $dtp_qc_query$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLSymbol $dtp_qc_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15737L)
  public static SubLSymbol $rkf_add_object_var_map_entry_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15951L)
  public static SubLSymbol $rkf_rem_object_var_map_method_table$;
  private static final SubLString $str0$Query_Constructor_Lock;
  private static final SubLSymbol $sym1$WITH_LOCK_HELD;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_QC_ISG_;
  private static final SubLSymbol $sym4$_QC_INDEX_;
  private static final SubLSymbol $sym5$QC_QUERY;
  private static final SubLSymbol $sym6$QC_QUERY_P;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym12$QC_QUERY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$QC_QUERY_ID;
  private static final SubLSymbol $sym15$_CSETF_QC_QUERY_ID;
  private static final SubLSymbol $sym16$QC_QUERY_CYCL;
  private static final SubLSymbol $sym17$_CSETF_QC_QUERY_CYCL;
  private static final SubLSymbol $sym18$QC_QUERY_TERMS;
  private static final SubLSymbol $sym19$_CSETF_QC_QUERY_TERMS;
  private static final SubLSymbol $sym20$QC_QUERY_RETURN_TERMS;
  private static final SubLSymbol $sym21$_CSETF_QC_QUERY_RETURN_TERMS;
  private static final SubLSymbol $sym22$QC_QUERY_CONSTRAINTS;
  private static final SubLSymbol $sym23$_CSETF_QC_QUERY_CONSTRAINTS;
  private static final SubLSymbol $sym24$QC_QUERY_VAR_MAP;
  private static final SubLSymbol $sym25$_CSETF_QC_QUERY_VAR_MAP;
  private static final SubLSymbol $sym26$QC_QUERY_SCENARIO;
  private static final SubLSymbol $sym27$_CSETF_QC_QUERY_SCENARIO;
  private static final SubLSymbol $sym28$QC_QUERY_ASSUMED_TERMS;
  private static final SubLSymbol $sym29$_CSETF_QC_QUERY_ASSUMED_TERMS;
  private static final SubLSymbol $sym30$QC_QUERY_ASSUMED_CONSTRAINTS;
  private static final SubLSymbol $sym31$_CSETF_QC_QUERY_ASSUMED_CONSTRAINTS;
  private static final SubLSymbol $kw32$ID;
  private static final SubLSymbol $kw33$CYCL;
  private static final SubLSymbol $kw34$TERMS;
  private static final SubLSymbol $kw35$RETURN_TERMS;
  private static final SubLSymbol $kw36$CONSTRAINTS;
  private static final SubLSymbol $kw37$VAR_MAP;
  private static final SubLSymbol $kw38$SCENARIO;
  private static final SubLSymbol $kw39$ASSUMED_TERMS;
  private static final SubLSymbol $kw40$ASSUMED_CONSTRAINTS;
  private static final SubLString $str41$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw42$BEGIN;
  private static final SubLSymbol $sym43$MAKE_QC_QUERY;
  private static final SubLSymbol $kw44$SLOT;
  private static final SubLSymbol $kw45$END;
  private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD;
  private static final SubLSymbol $sym47$EL_FORMULA_P;
  private static final SubLSymbol $sym48$LISTP;
  private static final SubLSymbol $sym49$SM_INDEXICAL_RECORD_P;
  private static final SubLSymbol $sym50$SM_SCENARIO_P;
  private static final SubLSymbol $sym51$SM_CONSTRAINT_RECORD_P;
  private static final SubLSymbol $sym52$QC_STATE;
  private static final SubLSymbol $sym53$QC_STATE_P;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$QC_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$QC_STATE_ID;
  private static final SubLSymbol $sym61$_CSETF_QC_STATE_ID;
  private static final SubLSymbol $sym62$QC_STATE_TEXT;
  private static final SubLSymbol $sym63$_CSETF_QC_STATE_TEXT;
  private static final SubLSymbol $sym64$QC_STATE_CANDIDATES;
  private static final SubLSymbol $sym65$_CSETF_QC_STATE_CANDIDATES;
  private static final SubLSymbol $sym66$QC_STATE_QUERY;
  private static final SubLSymbol $sym67$_CSETF_QC_STATE_QUERY;
  private static final SubLSymbol $sym68$QC_STATE_INTERACTION;
  private static final SubLSymbol $sym69$_CSETF_QC_STATE_INTERACTION;
  private static final SubLSymbol $sym70$QC_STATE_PARSING_MT;
  private static final SubLSymbol $sym71$_CSETF_QC_STATE_PARSING_MT;
  private static final SubLSymbol $sym72$QC_STATE_GENERATION_MT;
  private static final SubLSymbol $sym73$_CSETF_QC_STATE_GENERATION_MT;
  private static final SubLSymbol $sym74$QC_STATE_DOMAIN_MT;
  private static final SubLSymbol $sym75$_CSETF_QC_STATE_DOMAIN_MT;
  private static final SubLSymbol $sym76$QC_STATE_DOMAIN_INTERACTION_MT;
  private static final SubLSymbol $sym77$_CSETF_QC_STATE_DOMAIN_INTERACTION_MT;
  private static final SubLSymbol $kw78$TEXT;
  private static final SubLSymbol $kw79$CANDIDATES;
  private static final SubLSymbol $kw80$QUERY;
  private static final SubLSymbol $kw81$INTERACTION;
  private static final SubLSymbol $kw82$PARSING_MT;
  private static final SubLSymbol $kw83$GENERATION_MT;
  private static final SubLSymbol $kw84$DOMAIN_MT;
  private static final SubLSymbol $kw85$DOMAIN_INTERACTION_MT;
  private static final SubLSymbol $sym86$MAKE_QC_STATE;
  private static final SubLSymbol $sym87$VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD;
  private static final SubLSymbol $sym88$STRINGP;
  private static final SubLSymbol $sym89$USER_INTERACTION_P;
  private static final SubLSymbol $sym90$HLMT_P;
  private static final SubLInteger $int91$256;
  private static final SubLSymbol $sym92$RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD;
  private static final SubLSymbol $sym93$RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD;
  private static final SubLString $str94$_;
  private static final SubLString $str95$_;
  private static final SubLString $str96$function;
  private static final SubLString $str97$_A;
  private static final SubLSymbol $sym98$SM_CONSTRAINT_RECORD_SENTENCE;
  private static final SubLObject $const99$isa;
  private static final SubLObject $const100$genls;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$SM_INDEXICAL_P;
  private static final SubLSymbol $sym103$SM_INDEXICAL_RECORD_INDEXICAL;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 965L)
  public static SubLObject with_qc_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$WITH_LOCK_HELD, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1059L)
  public static SubLObject qc_find_query_by_id(final SubLObject id)
  {
    return qc_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1224L)
  public static SubLObject qc_find_query_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject query = qc_find_query_by_id( id );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1373L)
  public static SubLObject qc_find_state_by_id(final SubLObject id)
  {
    return qc_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1449L)
  public static SubLObject qc_find_state_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject state = qc_find_state_by_id( id );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1820L)
  public static SubLObject qc_next_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $qc_isg$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1927L)
  public static SubLObject qc_add_object(final SubLObject id, final SubLObject v_object)
  {
    return dictionary.dictionary_enter( $qc_index$.getGlobalValue(), id, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2070L)
  public static SubLObject qc_rem_object(final SubLObject id)
  {
    return dictionary.dictionary_remove( $qc_index$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2200L)
  public static SubLObject qc_find_object_by_id(final SubLObject id)
  {
    return dictionary.dictionary_lookup( $qc_index$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $qc_query_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_id(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_cycl(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_terms(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_return_terms(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_constraints(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_var_map(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_scenario(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_assumed_terms(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject qc_query_assumed_constraints(final SubLObject v_object)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_cycl(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_return_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_var_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_scenario(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_assumed_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject _csetf_qc_query_assumed_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_query_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject make_qc_query(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $qc_query_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw32$ID ) )
      {
        _csetf_qc_query_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$CYCL ) )
      {
        _csetf_qc_query_cycl( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$TERMS ) )
      {
        _csetf_qc_query_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$RETURN_TERMS ) )
      {
        _csetf_qc_query_return_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$CONSTRAINTS ) )
      {
        _csetf_qc_query_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$VAR_MAP ) )
      {
        _csetf_qc_query_var_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$SCENARIO ) )
      {
        _csetf_qc_query_scenario( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$ASSUMED_TERMS ) )
      {
        _csetf_qc_query_assumed_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$ASSUMED_CONSTRAINTS ) )
      {
        _csetf_qc_query_assumed_constraints( v_new, current_value );
      }
      else
      {
        Errors.error( $str41$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject visit_defstruct_qc_query(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw42$BEGIN, $sym43$MAKE_QC_QUERY, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw32$ID, qc_query_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw33$CYCL, qc_query_cycl( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw34$TERMS, qc_query_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw35$RETURN_TERMS, qc_query_return_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw36$CONSTRAINTS, qc_query_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw37$VAR_MAP, qc_query_var_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw38$SCENARIO, qc_query_scenario( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw39$ASSUMED_TERMS, qc_query_assumed_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw40$ASSUMED_CONSTRAINTS, qc_query_assumed_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$END, $sym43$MAKE_QC_QUERY, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
  public static SubLObject visit_defstruct_object_qc_query_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_qc_query( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2970L)
  public static SubLObject qc_new_query()
  {
    final SubLObject query = make_qc_query( UNPROVIDED );
    final SubLObject id = qc_next_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_id( query, id );
      qc_add_object( id, query );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3163L)
  public static SubLObject qc_cleanup_query(final SubLObject query)
  {
    assert NIL != qc_query_p( query ) : query;
    final SubLObject id = qc_query_id( query );
    final SubLObject success = qc_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3368L)
  public static SubLObject qc_set_query_cycl(final SubLObject query, final SubLObject cycl)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != el_utilities.el_formula_p( cycl ) : cycl;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_cycl( query, cycl );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3552L)
  public static SubLObject qc_set_query_terms(final SubLObject query, final SubLObject indexical_records)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != Types.listp( indexical_records ) : indexical_records;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_terms( query, indexical_records );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3770L)
  public static SubLObject qc_add_query_return_term(final SubLObject query, final SubLObject indexical_record)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != rkf_scenario_manipulator.sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      if( NIL == conses_high.member( indexical_record, qc_query_return_terms( query ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_qc_query_return_terms( query, ConsesLow.cons( indexical_record, qc_query_return_terms( query ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4017L)
  public static SubLObject qc_rem_query_return_term(final SubLObject query, final SubLObject indexical_record)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != rkf_scenario_manipulator.sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_return_terms( query, Sequences.remove( indexical_record, qc_query_return_terms( query ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4305L)
  public static SubLObject qc_set_query_return_terms(final SubLObject query, final SubLObject indexical_records)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != Types.listp( indexical_records ) : indexical_records;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_return_terms( query, indexical_records );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4537L)
  public static SubLObject qc_set_query_constraints(final SubLObject query, final SubLObject constraint_records)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != Types.listp( constraint_records ) : constraint_records;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_constraints( query, constraint_records );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4770L)
  public static SubLObject qc_add_query_var_map_entry(final SubLObject query, final SubLObject entry)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != Types.listp( entry ) : entry;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      if( NIL == conses_high.member( entry, qc_query_var_map( query ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_qc_query_var_map( query, ConsesLow.cons( entry, qc_query_var_map( query ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4966L)
  public static SubLObject qc_rem_query_var_map(final SubLObject query)
  {
    assert NIL != qc_query_p( query ) : query;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_var_map( query, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5118L)
  public static SubLObject qc_set_query_scenario(final SubLObject query, final SubLObject v_scenario)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != rkf_scenario_manipulator.sm_scenario_p( v_scenario ) : v_scenario;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_scenario( query, v_scenario );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5323L)
  public static SubLObject qc_add_query_assumed_term(final SubLObject query, final SubLObject indexical_record)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != rkf_scenario_manipulator.sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      if( NIL == conses_high.member( indexical_record, qc_query_assumed_terms( query ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_qc_query_assumed_terms( query, ConsesLow.cons( indexical_record, qc_query_assumed_terms( query ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5572L)
  public static SubLObject qc_rem_query_assumed_term(final SubLObject query, final SubLObject indexical_record)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != rkf_scenario_manipulator.sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_assumed_terms( query, Sequences.remove( indexical_record, qc_query_assumed_terms( query ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5863L)
  public static SubLObject qc_set_query_assumed_terms(final SubLObject query, final SubLObject indexical_records)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != Types.listp( indexical_records ) : indexical_records;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_assumed_terms( query, indexical_records );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6097L)
  public static SubLObject qc_add_query_assumed_constraint(final SubLObject query, final SubLObject constraint_record)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != rkf_scenario_manipulator.sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      if( NIL == conses_high.member( constraint_record, qc_query_assumed_constraints( query ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_qc_query_assumed_constraints( query, ConsesLow.cons( constraint_record, qc_query_assumed_constraints( query ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6362L)
  public static SubLObject qc_rem_query_assumed_constraint(final SubLObject query, final SubLObject constraint_record)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != rkf_scenario_manipulator.sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_assumed_constraints( query, Sequences.remove( constraint_record, qc_query_assumed_constraints( query ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6675L)
  public static SubLObject qc_set_query_assumed_constraints(final SubLObject query, final SubLObject constraint_records)
  {
    assert NIL != qc_query_p( query ) : query;
    assert NIL != Types.listp( constraint_records ) : constraint_records;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_query_assumed_constraints( query, constraint_records );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $qc_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_id(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_text(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_candidates(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_query(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_interaction(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_parsing_mt(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_generation_mt(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_domain_mt(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject qc_state_domain_interaction_mt(final SubLObject v_object)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_text(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_candidates(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_interaction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_parsing_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_generation_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_domain_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject _csetf_qc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != qc_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject make_qc_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $qc_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw32$ID ) )
      {
        _csetf_qc_state_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw78$TEXT ) )
      {
        _csetf_qc_state_text( v_new, current_value );
      }
      else if( pcase_var.eql( $kw79$CANDIDATES ) )
      {
        _csetf_qc_state_candidates( v_new, current_value );
      }
      else if( pcase_var.eql( $kw80$QUERY ) )
      {
        _csetf_qc_state_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw81$INTERACTION ) )
      {
        _csetf_qc_state_interaction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw82$PARSING_MT ) )
      {
        _csetf_qc_state_parsing_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw83$GENERATION_MT ) )
      {
        _csetf_qc_state_generation_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw84$DOMAIN_MT ) )
      {
        _csetf_qc_state_domain_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw85$DOMAIN_INTERACTION_MT ) )
      {
        _csetf_qc_state_domain_interaction_mt( v_new, current_value );
      }
      else
      {
        Errors.error( $str41$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject visit_defstruct_qc_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw42$BEGIN, $sym86$MAKE_QC_STATE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw32$ID, qc_state_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw78$TEXT, qc_state_text( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw79$CANDIDATES, qc_state_candidates( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw80$QUERY, qc_state_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw81$INTERACTION, qc_state_interaction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw82$PARSING_MT, qc_state_parsing_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw83$GENERATION_MT, qc_state_generation_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw84$DOMAIN_MT, qc_state_domain_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw85$DOMAIN_INTERACTION_MT, qc_state_domain_interaction_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$END, $sym86$MAKE_QC_STATE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
  public static SubLObject visit_defstruct_object_qc_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_qc_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7242L)
  public static SubLObject qc_new_state()
  {
    final SubLObject state = make_qc_state( UNPROVIDED );
    final SubLObject id = qc_next_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_id( state, id );
      qc_add_object( id, state );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7436L)
  public static SubLObject qc_cleanup_state(final SubLObject state)
  {
    assert NIL != qc_state_p( state ) : state;
    final SubLObject id = qc_state_id( state );
    final SubLObject success = qc_rem_object( id );
    SubLObject cdolist_list_var = qc_state_candidates( state );
    SubLObject candidate = NIL;
    candidate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      qc_cleanup_query( candidate );
      cdolist_list_var = cdolist_list_var.rest();
      candidate = cdolist_list_var.first();
    }
    qc_cleanup_query( qc_state_query( state ) );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7775L)
  public static SubLObject qc_set_state_text(final SubLObject state, final SubLObject text)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != Types.stringp( text ) : text;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_text( state, text );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7954L)
  public static SubLObject qc_set_state_candidates(final SubLObject state, final SubLObject candidates)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != Types.listp( candidates ) : candidates;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_candidates( state, candidates );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8161L)
  public static SubLObject qc_set_state_query(final SubLObject state, final SubLObject query)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != qc_query_p( query ) : query;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_query( state, query );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8349L)
  public static SubLObject qc_set_state_interaction(final SubLObject state, final SubLObject interaction)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != user_interaction_agenda.user_interaction_p( interaction ) : interaction;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_interaction( state, interaction );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8575L)
  public static SubLObject qc_set_state_parsing_mt(final SubLObject state, final SubLObject parsing_mt)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( parsing_mt ) : parsing_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_parsing_mt( state, parsing_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8784L)
  public static SubLObject qc_set_state_generation_mt(final SubLObject state, final SubLObject generation_mt)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( generation_mt ) : generation_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_generation_mt( state, generation_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 9008L)
  public static SubLObject qc_set_state_domain_mt(final SubLObject state, final SubLObject domain_mt)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( domain_mt ) : domain_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_domain_mt( state, domain_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 9212L)
  public static SubLObject qc_set_state_domain_interaction_mt(final SubLObject state, final SubLObject domain_interaction_mt)
  {
    assert NIL != qc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( domain_interaction_mt ) : domain_interaction_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $qc_lock$.getGlobalValue() );
      _csetf_qc_state_domain_interaction_mt( state, domain_interaction_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $qc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 9476L)
  public static SubLObject qc_assumable_constraint_p(final SubLObject state, final SubLObject constraint_record)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10318L)
  public static SubLObject qc_act_new_state()
  {
    final SubLObject state = qc_new_state();
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10586L)
  public static SubLObject qc_act_new_state_with_text(final SubLObject text)
  {
    final SubLObject state = qc_act_new_state();
    qc_set_state_text( state, text );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10726L)
  public static SubLObject qc_act_note_state_interaction(final SubLObject state, final SubLObject interaction)
  {
    qc_set_state_interaction( state, interaction );
    qc_act_initialize_state_context( state );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10896L)
  public static SubLObject qc_act_note_state_query(final SubLObject state, final SubLObject query)
  {
    qc_set_state_query( state, query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 11000L)
  public static SubLObject qc_act_initialize_state_context(final SubLObject state)
  {
    if( NIL != user_interaction_agenda.user_interaction_p( qc_state_interaction( state ) ) )
    {
      final SubLObject v_agenda = user_interaction_agenda.ui_agenda( qc_state_interaction( state ) );
      qc_set_state_parsing_mt( state, user_interaction_agenda.uia_parsing_interaction_mt( v_agenda ) );
      qc_set_state_generation_mt( state, user_interaction_agenda.uia_generation_interaction_mt( v_agenda, UNPROVIDED ) );
      qc_set_state_domain_mt( state, user_interaction_agenda.uia_domain_mt( v_agenda ) );
      qc_set_state_domain_interaction_mt( state, user_interaction_agenda.uia_domain_interaction_mt( v_agenda ) );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 11584L)
  public static SubLObject qc_act_candidate_scenario_expressions(final SubLObject state, final SubLObject text)
  {
    final SubLObject parsing_mt = qc_state_parsing_mt( state );
    final SubLObject domain_interaction_mt = qc_state_domain_interaction_mt( state );
    final SubLObject candidates = rkf_scenario_manipulator.sm_extract_candidate_scenario_expressions( text, parsing_mt, domain_interaction_mt );
    return candidates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 12114L)
  public static SubLObject qc_act_initialize_scenario_from_expression(final SubLObject state, final SubLObject scenario_expression)
  {
    final SubLObject text = qc_state_text( state );
    final SubLObject interaction = qc_state_interaction( state );
    final SubLObject v_agenda = ( NIL != user_interaction_agenda.user_interaction_p( interaction ) ) ? user_interaction_agenda.ui_agenda( interaction ) : NIL;
    final SubLObject scenario_interaction_mt = ( NIL != v_agenda ) ? user_interaction_agenda.uia_ensure_scenario_interaction_mt( v_agenda ) : rkf_scenario_constructor.sc_storage_mt();
    final SubLObject parsing_mt = qc_state_parsing_mt( state );
    final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_expression( scenario_expression, text, scenario_interaction_mt, parsing_mt );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 12805L)
  public static SubLObject qc_act_initialize_query_from_scenario(final SubLObject state, final SubLObject v_scenario)
  {
    SubLObject query = qc_state_query( state );
    final SubLObject assumed_constraints = ( NIL != query ) ? qc_query_assumed_constraints( query ) : NIL;
    if( NIL == qc_query_p( query ) )
    {
      query = qc_new_query();
    }
    qc_set_query_scenario( query, v_scenario );
    final SubLObject new_terms = rkf_scenario_manipulator.sm_scenario_terms( v_scenario );
    final SubLObject new_return_terms = rkf_scenario_manipulator.sm_scenario_terms( v_scenario );
    qc_set_query_terms( query, new_terms );
    qc_set_query_return_terms( query, new_return_terms );
    final SubLObject new_constraints = rkf_scenario_manipulator.sm_scenario_constraints( v_scenario );
    SubLObject cdolist_list_var = assumed_constraints;
    SubLObject assumed_constraint = NIL;
    assumed_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( assumed_constraint, new_constraints, UNPROVIDED, UNPROVIDED ) )
      {
        qc_act_deregister_assumed_constraint( state, assumed_constraint );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assumed_constraint = cdolist_list_var.first();
    }
    qc_set_query_constraints( query, new_constraints );
    qc_compute_and_record_variables( query );
    qc_compute_and_record_query_cycl( query );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 13841L)
  public static SubLObject qc_compute_and_record_variables(final SubLObject query)
  {
    final SubLObject query_terms = qc_query_terms( query );
    final SubLObject assumed_terms = qc_query_assumed_terms( query );
    final SubLObject variable_terms = conses_high.set_difference( query_terms, assumed_terms, UNPROVIDED, UNPROVIDED );
    return rkf_compute_and_record_variables( query, variable_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 14138L)
  public static SubLObject qc_compute_set_difference(final SubLObject piece_a, final SubLObject piece_b)
  {
    return conses_high.set_difference( piece_a, piece_b, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 14243L)
  public static SubLObject qc_compute_and_record_query_cycl(final SubLObject query)
  {
    final SubLObject constraints = qc_query_constraints( query );
    final SubLObject assumed_constraints = qc_query_assumed_constraints( query );
    final SubLObject query_constraints = qc_compute_set_difference( constraints, assumed_constraints );
    final SubLObject all_terms = qc_query_terms( query );
    final SubLObject assumed_terms = qc_query_assumed_terms( query );
    final SubLObject existential_terms = conses_high.set_difference( conses_high.set_difference( all_terms, qc_query_return_terms( query ), UNPROVIDED, UNPROVIDED ), assumed_terms, UNPROVIDED, UNPROVIDED );
    final SubLObject variable_terms = all_terms;
    final SubLObject cycl = rkf_compute_cycl_from_parts( query_constraints, variable_terms, existential_terms, assumed_constraints, UNPROVIDED, UNPROVIDED );
    qc_set_query_cycl( query, cycl );
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15177L)
  public static SubLObject rkf_compute_and_record_variables(final SubLObject v_object, final SubLObject indexical_records)
  {
    rkf_rem_object_var_map( v_object );
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical( indexical_record );
      final SubLObject base = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase( indexical_record );
      final SubLObject variable = rkf_make_el_var( indexical, base );
      rkf_scenario_manipulator.sm_act_set_indexical_record_var( indexical_record, variable );
      rkf_add_object_var_map_entry( v_object, ConsesLow.list( variable, indexical_record ) );
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15737L)
  public static SubLObject rkf_add_object_var_map_entry(final SubLObject v_object, final SubLObject item)
  {
    final SubLObject method_function = Structures.method_func( v_object, $rkf_add_object_var_map_entry_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object, item );
    }
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15829L)
  public static SubLObject rkf_add_object_var_map_entry_qc_query_method(final SubLObject v_object, final SubLObject item)
  {
    return qc_add_query_var_map_entry( v_object, item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15951L)
  public static SubLObject rkf_rem_object_var_map(final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( v_object, $rkf_rem_object_var_map_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 16016L)
  public static SubLObject rkf_rem_object_var_map_qc_query_method(final SubLObject v_object)
  {
    return qc_rem_query_var_map( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 16114L)
  public static SubLObject rkf_make_el_var(final SubLObject indexical, SubLObject base)
  {
    if( base == UNPROVIDED )
    {
      base = NIL;
    }
    final SubLObject type = rkf_scenario_manipulator.sm_indexical_type( indexical );
    final SubLObject number = rkf_scenario_manipulator.sm_indexical_number( indexical );
    SubLObject basis = NIL;
    if( base.isString() )
    {
      basis = string_utilities.string_substitute( $str94$_, $str95$_, base, UNPROVIDED );
      return cycl_variables.make_el_var( basis );
    }
    if( NIL != constant_handles.constant_p( type ) )
    {
      basis = constants_high.constant_name( type );
    }
    else if( NIL != nart_handles.nart_p( type ) )
    {
      basis = ( NIL != constant_handles.constant_p( cycl_utilities.nat_arg0( type ) ) ) ? constants_high.constant_name( cycl_utilities.nat_arg0( type ) ) : $str96$function;
    }
    return cycl_variables.make_el_var( Sequences.cconcatenate( basis, new SubLObject[] { $str94$_, PrintLow.format( NIL, $str97$_A, number )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 16727L)
  public static SubLObject rkf_compute_cycl_from_parts(final SubLObject query_constraints, final SubLObject variable_terms, SubLObject existential_terms, SubLObject assumed_constraints, SubLObject insert_explicit_typesP,
      SubLObject mt)
  {
    if( existential_terms == UNPROVIDED )
    {
      existential_terms = NIL;
    }
    if( assumed_constraints == UNPROVIDED )
    {
      assumed_constraints = NIL;
    }
    if( insert_explicit_typesP == UNPROVIDED )
    {
      insert_explicit_typesP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLObject sentence_list = rkf_compute_cycl_from_terms_and_constraints( query_constraints, variable_terms, insert_explicit_typesP, mt );
    SubLObject cycl = rkf_sentence_from_conjuncts( sentence_list );
    final SubLObject assumed_sentences = ( NIL != assumed_constraints ) ? Mapping.mapcar( Symbols.symbol_function( $sym98$SM_CONSTRAINT_RECORD_SENTENCE ), assumed_constraints ) : NIL;
    SubLObject assumed_cycl = ( NIL != assumed_sentences ) ? rkf_sentence_from_conjuncts( assumed_sentences ) : NIL;
    SubLObject cdolist_list_var = variable_terms;
    SubLObject variable_term = NIL;
    variable_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical( variable_term );
      final SubLObject el_var = rkf_scenario_manipulator.sm_indexical_record_var( variable_term );
      if( NIL != subl_promotions.memberP( variable_term, existential_terms, UNPROVIDED, UNPROVIDED ) )
      {
        cycl = el_utilities.make_existential( indexical, cycl );
      }
      if( NIL != el_var )
      {
        cycl = cycl_utilities.expression_subst( el_var, indexical, cycl, UNPROVIDED, UNPROVIDED );
        assumed_cycl = cycl_utilities.expression_subst( el_var, indexical, assumed_cycl, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      variable_term = cdolist_list_var.first();
    }
    if( NIL != assumed_cycl )
    {
      cycl = el_utilities.make_implication( assumed_cycl, cycl );
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 18378L)
  public static SubLObject rkf_sentence_from_conjuncts(final SubLObject conjuncts)
  {
    return ( NIL != list_utilities.singletonP( conjuncts ) ) ? conjuncts.first() : el_utilities.make_conjunction( conjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 18530L)
  public static SubLObject rkf_compute_cycl_from_terms_and_constraints(final SubLObject query_constraints, final SubLObject variable_terms, final SubLObject insert_explicit_typesP, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject base_sentences = Mapping.mapcar( Symbols.symbol_function( $sym98$SM_CONSTRAINT_RECORD_SENTENCE ), query_constraints );
    SubLObject additional_sentences = NIL;
    if( NIL != insert_explicit_typesP )
    {
      SubLObject cdolist_list_var = variable_terms;
      SubLObject variable_term = NIL;
      variable_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical( variable_term );
        thread.resetMultipleValues();
        final SubLObject isas = rkf_scenario_manipulator.sm_term_requires_types_in_relations( indexical, base_sentences, mt );
        final SubLObject v_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != isas )
        {
          SubLObject cdolist_list_var_$1 = rkf_scenario_manipulator.sm_indexical_record_explicit_isas( variable_term );
          SubLObject v_isa = NIL;
          v_isa = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            final SubLObject tight_constraints = genls.min_cols( ConsesLow.cons( v_isa, conses_high.copy_list( isas ) ), mt, UNPROVIDED );
            if( NIL != subl_promotions.memberP( v_isa, tight_constraints, UNPROVIDED, UNPROVIDED ) )
            {
              SubLObject cdolist_list_var_$2 = tight_constraints;
              SubLObject constraint = NIL;
              constraint = cdolist_list_var_$2.first();
              while ( NIL != cdolist_list_var_$2)
              {
                final SubLObject item_var = el_utilities.make_binary_formula( $const99$isa, indexical, constraint );
                if( NIL == conses_high.member( item_var, additional_sentences, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
                {
                  additional_sentences = ConsesLow.cons( item_var, additional_sentences );
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                constraint = cdolist_list_var_$2.first();
              }
            }
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            v_isa = cdolist_list_var_$1.first();
          }
        }
        if( NIL != v_genls )
        {
          SubLObject cdolist_list_var_$3 = rkf_scenario_manipulator.sm_indexical_record_explicit_genls( variable_term );
          SubLObject genl = NIL;
          genl = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            final SubLObject tight_constraints = genls.min_cols( ConsesLow.cons( genl, conses_high.copy_list( v_genls ) ), mt, UNPROVIDED );
            if( NIL != subl_promotions.memberP( genl, tight_constraints, UNPROVIDED, UNPROVIDED ) )
            {
              SubLObject cdolist_list_var_$4 = tight_constraints;
              SubLObject constraint = NIL;
              constraint = cdolist_list_var_$4.first();
              while ( NIL != cdolist_list_var_$4)
              {
                final SubLObject item_var = el_utilities.make_binary_formula( $const100$genls, indexical, constraint );
                if( NIL == conses_high.member( item_var, additional_sentences, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
                {
                  additional_sentences = ConsesLow.cons( item_var, additional_sentences );
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                constraint = cdolist_list_var_$4.first();
              }
            }
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            genl = cdolist_list_var_$3.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        variable_term = cdolist_list_var.first();
      }
    }
    return ( NIL != additional_sentences ) ? ConsesLow.append( base_sentences, additional_sentences ) : base_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 20106L)
  public static SubLObject qc_act_initialize_query_from_cycl(final SubLObject state, final SubLObject cycl_query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject domain_interaction_mt = qc_state_domain_interaction_mt( state );
    final SubLObject generation_mt = qc_state_generation_mt( state );
    SubLObject lhs = NIL;
    SubLObject rhs = NIL;
    if( NIL != el_utilities.el_general_implication_p( cycl_query ) )
    {
      lhs = cycl_utilities.formula_arg1( cycl_query, UNPROVIDED );
      rhs = cycl_utilities.formula_arg2( cycl_query, UNPROVIDED );
    }
    else
    {
      rhs = cycl_query;
    }
    thread.resetMultipleValues();
    final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl( qc_strip_existentials( rhs ), domain_interaction_mt, generation_mt );
    final SubLObject var_map = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject query = qc_act_initialize_query_from_scenario( state, v_scenario );
    final SubLObject dont_cares = qc_identify_dont_care_irs( rhs, var_map );
    qc_set_state_query( state, query );
    SubLObject cdolist_list_var = dont_cares;
    SubLObject dont_care = NIL;
    dont_care = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      qc_act_register_dont_care( state, dont_care );
      cdolist_list_var = cdolist_list_var.rest();
      dont_care = cdolist_list_var.first();
    }
    if( NIL != lhs )
    {
      thread.resetMultipleValues();
      final SubLObject add_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl( qc_strip_existentials( lhs ), domain_interaction_mt, generation_mt );
      final SubLObject add_var_map = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var2 = rkf_scenario_manipulator.sm_scenario_constraints( add_scenario );
      SubLObject constraint = NIL;
      constraint = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$5 = add_var_map;
        SubLObject var_rec = NIL;
        var_rec = cdolist_list_var_$5.first();
        while ( NIL != cdolist_list_var_$5)
        {
          SubLObject current;
          final SubLObject datum = current = var_rec;
          SubLObject el_variable = NIL;
          SubLObject indexical_record = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
          el_variable = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
          indexical_record = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical( indexical_record );
            final SubLObject correct_indexical_record = conses_high.second( conses_high.assoc( el_variable, var_map, UNPROVIDED, UNPROVIDED ) );
            final SubLObject correct_indexical = rkf_scenario_manipulator.sm_indexical_record_indexical( correct_indexical_record );
            cycl_utilities.expression_nsubst( el_variable, indexical, rkf_scenario_manipulator.sm_constraint_record_sentence( constraint ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
            cycl_utilities.expression_nsubst( correct_indexical, el_variable, rkf_scenario_manipulator.sm_constraint_record_sentence( constraint ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
            qc_act_register_assumed_constraint( state, constraint );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list101 );
          }
          cdolist_list_var_$5 = cdolist_list_var_$5.rest();
          var_rec = cdolist_list_var_$5.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        constraint = cdolist_list_var2.first();
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22124L)
  public static SubLObject qc_identify_dont_care_irs(final SubLObject cycl_query, final SubLObject var_map)
  {
    final SubLObject dont_care_vars = qc_extract_dont_care_vars( cycl_query );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dont_care_vars;
    SubLObject dont_care_var = NIL;
    dont_care_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical_record = conses_high.second( conses_high.assoc( dont_care_var, var_map, UNPROVIDED, UNPROVIDED ) );
      result = ConsesLow.cons( indexical_record, result );
      cdolist_list_var = cdolist_list_var.rest();
      dont_care_var = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22460L)
  public static SubLObject qc_extract_dont_care_vars(final SubLObject cycl_query)
  {
    if( NIL != el_utilities.el_existential_p( cycl_query ) )
    {
      return ConsesLow.cons( cycl_utilities.sentence_arg1( cycl_query, UNPROVIDED ), qc_extract_dont_care_vars( cycl_utilities.sentence_arg2( cycl_query, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22726L)
  public static SubLObject qc_strip_existentials(final SubLObject cycl_query)
  {
    if( NIL != el_utilities.el_existential_p( cycl_query ) )
    {
      return qc_strip_existentials( cycl_utilities.sentence_arg2( cycl_query, UNPROVIDED ) );
    }
    return cycl_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22949L)
  public static SubLObject qc_act_register_query(final SubLObject state, final SubLObject query)
  {
    qc_set_state_query( state, query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 23147L)
  public static SubLObject qc_act_register_dont_care(final SubLObject state, final SubLObject dont_care)
  {
    final SubLObject query = qc_state_query( state );
    qc_rem_query_return_term( query, dont_care );
    qc_compute_and_record_query_cycl( query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 23464L)
  public static SubLObject qc_act_deregister_dont_care(final SubLObject state, final SubLObject indexical_record)
  {
    final SubLObject query = qc_state_query( state );
    qc_add_query_return_term( query, indexical_record );
    qc_compute_and_record_query_cycl( query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 23803L)
  public static SubLObject qc_act_register_assumed_term(final SubLObject state, final SubLObject indexical_record)
  {
    final SubLObject query = qc_state_query( state );
    qc_add_query_assumed_term( query, indexical_record );
    qc_rem_query_return_term( query, indexical_record );
    qc_compute_and_record_query_cycl( query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 24193L)
  public static SubLObject qc_act_deregister_assumed_term(final SubLObject state, final SubLObject indexical_record)
  {
    final SubLObject query = qc_state_query( state );
    qc_rem_query_assumed_term( query, indexical_record );
    qc_add_query_return_term( query, indexical_record );
    qc_compute_and_record_query_cycl( query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 24594L)
  public static SubLObject qc_act_register_assumed_constraint(final SubLObject state, final SubLObject constraint_record)
  {
    final SubLObject query = qc_state_query( state );
    qc_add_query_assumed_constraint( query, constraint_record );
    final SubLObject sentence = rkf_scenario_manipulator.sm_constraint_record_sentence( constraint_record );
    SubLObject cdolist_list_var;
    final SubLObject assumed_indexicals = cdolist_list_var = cycl_utilities.expression_gather( sentence, Symbols.symbol_function( $sym102$SM_INDEXICAL_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject assumed_indexical = NIL;
    assumed_indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject assumed_term = Sequences.find( assumed_indexical, qc_query_terms( query ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym103$SM_INDEXICAL_RECORD_INDEXICAL ), UNPROVIDED, UNPROVIDED );
      qc_act_register_assumed_term( state, assumed_term );
      cdolist_list_var = cdolist_list_var.rest();
      assumed_indexical = cdolist_list_var.first();
    }
    qc_compute_and_record_query_cycl( query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 25319L)
  public static SubLObject qc_act_deregister_assumed_constraint(final SubLObject state, final SubLObject constraint_record)
  {
    final SubLObject query = qc_state_query( state );
    qc_rem_query_assumed_constraint( query, constraint_record );
    final SubLObject sentence = rkf_scenario_manipulator.sm_constraint_record_sentence( constraint_record );
    final SubLObject assumed_indexicals = cycl_utilities.expression_gather( sentence, Symbols.symbol_function( $sym102$SM_INDEXICAL_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject other_assumed_sentences = Mapping.mapcar( Symbols.symbol_function( $sym98$SM_CONSTRAINT_RECORD_SENTENCE ), qc_query_assumed_constraints( query ) );
    final SubLObject other_assumed_indexicals = cycl_utilities.expression_gather( other_assumed_sentences, Symbols.symbol_function( $sym102$SM_INDEXICAL_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = assumed_indexicals;
    SubLObject assumed_indexical = NIL;
    assumed_indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( assumed_indexical, other_assumed_indexicals, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject assumed_term = Sequences.find( assumed_indexical, qc_query_terms( query ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym103$SM_INDEXICAL_RECORD_INDEXICAL ), UNPROVIDED,
            UNPROVIDED );
        qc_act_deregister_assumed_term( state, assumed_term );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assumed_indexical = cdolist_list_var.first();
    }
    qc_compute_and_record_query_cycl( query );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 26338L)
  public static SubLObject qc_act_query_cycl(final SubLObject state)
  {
    final SubLObject query = qc_state_query( state );
    return qc_query_cycl( query );
  }

  public static SubLObject declare_rkf_query_constructor_file()
  {
    SubLFiles.declareMacro( me, "with_qc_lock", "WITH-QC-LOCK" );
    SubLFiles.declareFunction( me, "qc_find_query_by_id", "QC-FIND-QUERY-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_find_query_by_id_string", "QC-FIND-QUERY-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_find_state_by_id", "QC-FIND-STATE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_find_state_by_id_string", "QC-FIND-STATE-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_next_id", "QC-NEXT-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "qc_add_object", "QC-ADD-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_rem_object", "QC-REM-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_find_object_by_id", "QC-FIND-OBJECT-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_print_function_trampoline", "QC-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_query_p", "QC-QUERY-P", 1, 0, false );
    new $qc_query_p$UnaryFunction();
    SubLFiles.declareFunction( me, "qc_query_id", "QC-QUERY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_cycl", "QC-QUERY-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_terms", "QC-QUERY-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_return_terms", "QC-QUERY-RETURN-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_constraints", "QC-QUERY-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_var_map", "QC-QUERY-VAR-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_scenario", "QC-QUERY-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_assumed_terms", "QC-QUERY-ASSUMED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_query_assumed_constraints", "QC-QUERY-ASSUMED-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_id", "_CSETF-QC-QUERY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_cycl", "_CSETF-QC-QUERY-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_terms", "_CSETF-QC-QUERY-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_return_terms", "_CSETF-QC-QUERY-RETURN-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_constraints", "_CSETF-QC-QUERY-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_var_map", "_CSETF-QC-QUERY-VAR-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_scenario", "_CSETF-QC-QUERY-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_assumed_terms", "_CSETF-QC-QUERY-ASSUMED-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_query_assumed_constraints", "_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_qc_query", "MAKE-QC-QUERY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_qc_query", "VISIT-DEFSTRUCT-QC-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_qc_query_method", "VISIT-DEFSTRUCT-OBJECT-QC-QUERY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_new_query", "QC-NEW-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "qc_cleanup_query", "QC-CLEANUP-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_set_query_cycl", "QC-SET-QUERY-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_query_terms", "QC-SET-QUERY-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_add_query_return_term", "QC-ADD-QUERY-RETURN-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_rem_query_return_term", "QC-REM-QUERY-RETURN-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_query_return_terms", "QC-SET-QUERY-RETURN-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_query_constraints", "QC-SET-QUERY-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_add_query_var_map_entry", "QC-ADD-QUERY-VAR-MAP-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_rem_query_var_map", "QC-REM-QUERY-VAR-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_set_query_scenario", "QC-SET-QUERY-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_add_query_assumed_term", "QC-ADD-QUERY-ASSUMED-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_rem_query_assumed_term", "QC-REM-QUERY-ASSUMED-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_query_assumed_terms", "QC-SET-QUERY-ASSUMED-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_add_query_assumed_constraint", "QC-ADD-QUERY-ASSUMED-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_rem_query_assumed_constraint", "QC-REM-QUERY-ASSUMED-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_query_assumed_constraints", "QC-SET-QUERY-ASSUMED-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_state_print_function_trampoline", "QC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_state_p", "QC-STATE-P", 1, 0, false );
    new $qc_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "qc_state_id", "QC-STATE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_text", "QC-STATE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_candidates", "QC-STATE-CANDIDATES", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_query", "QC-STATE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_interaction", "QC-STATE-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_parsing_mt", "QC-STATE-PARSING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_generation_mt", "QC-STATE-GENERATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_domain_mt", "QC-STATE-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_state_domain_interaction_mt", "QC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_id", "_CSETF-QC-STATE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_text", "_CSETF-QC-STATE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_candidates", "_CSETF-QC-STATE-CANDIDATES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_query", "_CSETF-QC-STATE-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_interaction", "_CSETF-QC-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_parsing_mt", "_CSETF-QC-STATE-PARSING-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_generation_mt", "_CSETF-QC-STATE-GENERATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_domain_mt", "_CSETF-QC-STATE-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_qc_state_domain_interaction_mt", "_CSETF-QC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_qc_state", "MAKE-QC-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_qc_state", "VISIT-DEFSTRUCT-QC-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_qc_state_method", "VISIT-DEFSTRUCT-OBJECT-QC-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_new_state", "QC-NEW-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "qc_cleanup_state", "QC-CLEANUP-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_text", "QC-SET-STATE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_candidates", "QC-SET-STATE-CANDIDATES", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_query", "QC-SET-STATE-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_interaction", "QC-SET-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_parsing_mt", "QC-SET-STATE-PARSING-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_generation_mt", "QC-SET-STATE-GENERATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_domain_mt", "QC-SET-STATE-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_set_state_domain_interaction_mt", "QC-SET-STATE-DOMAIN-INTERACTION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_assumable_constraint_p", "QC-ASSUMABLE-CONSTRAINT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_new_state", "QC-ACT-NEW-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "qc_act_new_state_with_text", "QC-ACT-NEW-STATE-WITH-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_act_note_state_interaction", "QC-ACT-NOTE-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_note_state_query", "QC-ACT-NOTE-STATE-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_initialize_state_context", "QC-ACT-INITIALIZE-STATE-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_act_candidate_scenario_expressions", "QC-ACT-CANDIDATE-SCENARIO-EXPRESSIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_initialize_scenario_from_expression", "QC-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_initialize_query_from_scenario", "QC-ACT-INITIALIZE-QUERY-FROM-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_compute_and_record_variables", "QC-COMPUTE-AND-RECORD-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_compute_set_difference", "QC-COMPUTE-SET-DIFFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_compute_and_record_query_cycl", "QC-COMPUTE-AND-RECORD-QUERY-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_compute_and_record_variables", "RKF-COMPUTE-AND-RECORD-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_object_var_map_entry", "RKF-ADD-OBJECT-VAR-MAP-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_object_var_map_entry_qc_query_method", "RKF-ADD-OBJECT-VAR-MAP-ENTRY-QC-QUERY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_rem_object_var_map", "RKF-REM-OBJECT-VAR-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_rem_object_var_map_qc_query_method", "RKF-REM-OBJECT-VAR-MAP-QC-QUERY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_make_el_var", "RKF-MAKE-EL-VAR", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_compute_cycl_from_parts", "RKF-COMPUTE-CYCL-FROM-PARTS", 2, 4, false );
    SubLFiles.declareFunction( me, "rkf_sentence_from_conjuncts", "RKF-SENTENCE-FROM-CONJUNCTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_compute_cycl_from_terms_and_constraints", "RKF-COMPUTE-CYCL-FROM-TERMS-AND-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "qc_act_initialize_query_from_cycl", "QC-ACT-INITIALIZE-QUERY-FROM-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_identify_dont_care_irs", "QC-IDENTIFY-DONT-CARE-IRS", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_extract_dont_care_vars", "QC-EXTRACT-DONT-CARE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_strip_existentials", "QC-STRIP-EXISTENTIALS", 1, 0, false );
    SubLFiles.declareFunction( me, "qc_act_register_query", "QC-ACT-REGISTER-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_register_dont_care", "QC-ACT-REGISTER-DONT-CARE", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_deregister_dont_care", "QC-ACT-DEREGISTER-DONT-CARE", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_register_assumed_term", "QC-ACT-REGISTER-ASSUMED-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_deregister_assumed_term", "QC-ACT-DEREGISTER-ASSUMED-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_register_assumed_constraint", "QC-ACT-REGISTER-ASSUMED-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_deregister_assumed_constraint", "QC-ACT-DEREGISTER-ASSUMED-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "qc_act_query_cycl", "QC-ACT-QUERY-CYCL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_query_constructor_file()
  {
    $qc_lock$ = SubLFiles.deflexical( "*QC-LOCK*", Locks.make_lock( $str0$Query_Constructor_Lock ) );
    $qc_isg$ = SubLFiles.deflexical( "*QC-ISG*", maybeDefault( $sym3$_QC_ISG_, $qc_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
    $qc_index$ = SubLFiles.deflexical( "*QC-INDEX*", maybeDefault( $sym4$_QC_INDEX_, $qc_index$, () -> ( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_qc_query$ = SubLFiles.defconstant( "*DTP-QC-QUERY*", $sym5$QC_QUERY );
    $dtp_qc_state$ = SubLFiles.defconstant( "*DTP-QC-STATE*", $sym52$QC_STATE );
    $rkf_add_object_var_map_entry_method_table$ = SubLFiles.deflexical( "*RKF-ADD-OBJECT-VAR-MAP-ENTRY-METHOD-TABLE*", Vectors.make_vector( $int91$256, NIL ) );
    $rkf_rem_object_var_map_method_table$ = SubLFiles.deflexical( "*RKF-REM-OBJECT-VAR-MAP-METHOD-TABLE*", Vectors.make_vector( $int91$256, NIL ) );
    return NIL;
  }

  public static SubLObject setup_rkf_query_constructor_file()
  {
    subl_macro_promotions.declare_defglobal( $sym3$_QC_ISG_ );
    subl_macro_promotions.declare_defglobal( $sym4$_QC_INDEX_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), Symbols.symbol_function( $sym12$QC_QUERY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list13 );
    Structures.def_csetf( $sym14$QC_QUERY_ID, $sym15$_CSETF_QC_QUERY_ID );
    Structures.def_csetf( $sym16$QC_QUERY_CYCL, $sym17$_CSETF_QC_QUERY_CYCL );
    Structures.def_csetf( $sym18$QC_QUERY_TERMS, $sym19$_CSETF_QC_QUERY_TERMS );
    Structures.def_csetf( $sym20$QC_QUERY_RETURN_TERMS, $sym21$_CSETF_QC_QUERY_RETURN_TERMS );
    Structures.def_csetf( $sym22$QC_QUERY_CONSTRAINTS, $sym23$_CSETF_QC_QUERY_CONSTRAINTS );
    Structures.def_csetf( $sym24$QC_QUERY_VAR_MAP, $sym25$_CSETF_QC_QUERY_VAR_MAP );
    Structures.def_csetf( $sym26$QC_QUERY_SCENARIO, $sym27$_CSETF_QC_QUERY_SCENARIO );
    Structures.def_csetf( $sym28$QC_QUERY_ASSUMED_TERMS, $sym29$_CSETF_QC_QUERY_ASSUMED_TERMS );
    Structures.def_csetf( $sym30$QC_QUERY_ASSUMED_CONSTRAINTS, $sym31$_CSETF_QC_QUERY_ASSUMED_CONSTRAINTS );
    Equality.identity( $sym5$QC_QUERY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), Symbols.symbol_function( $sym46$VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_qc_state$.getGlobalValue(), Symbols.symbol_function( $sym58$QC_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list59 );
    Structures.def_csetf( $sym60$QC_STATE_ID, $sym61$_CSETF_QC_STATE_ID );
    Structures.def_csetf( $sym62$QC_STATE_TEXT, $sym63$_CSETF_QC_STATE_TEXT );
    Structures.def_csetf( $sym64$QC_STATE_CANDIDATES, $sym65$_CSETF_QC_STATE_CANDIDATES );
    Structures.def_csetf( $sym66$QC_STATE_QUERY, $sym67$_CSETF_QC_STATE_QUERY );
    Structures.def_csetf( $sym68$QC_STATE_INTERACTION, $sym69$_CSETF_QC_STATE_INTERACTION );
    Structures.def_csetf( $sym70$QC_STATE_PARSING_MT, $sym71$_CSETF_QC_STATE_PARSING_MT );
    Structures.def_csetf( $sym72$QC_STATE_GENERATION_MT, $sym73$_CSETF_QC_STATE_GENERATION_MT );
    Structures.def_csetf( $sym74$QC_STATE_DOMAIN_MT, $sym75$_CSETF_QC_STATE_DOMAIN_MT );
    Structures.def_csetf( $sym76$QC_STATE_DOMAIN_INTERACTION_MT, $sym77$_CSETF_QC_STATE_DOMAIN_INTERACTION_MT );
    Equality.identity( $sym52$QC_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_qc_state$.getGlobalValue(), Symbols.symbol_function( $sym87$VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD ) );
    Structures.register_method( $rkf_add_object_var_map_entry_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), Symbols.symbol_function( $sym92$RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD ) );
    Structures.register_method( $rkf_rem_object_var_map_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), Symbols.symbol_function( $sym93$RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_query_constructor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_query_constructor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_query_constructor_file();
  }
  static
  {
    me = new rkf_query_constructor();
    $qc_lock$ = null;
    $qc_isg$ = null;
    $qc_index$ = null;
    $dtp_qc_query$ = null;
    $dtp_qc_state$ = null;
    $rkf_add_object_var_map_entry_method_table$ = null;
    $rkf_rem_object_var_map_method_table$ = null;
    $str0$Query_Constructor_Lock = makeString( "Query Constructor Lock" );
    $sym1$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list2 = ConsesLow.list( makeSymbol( "*QC-LOCK*" ) );
    $sym3$_QC_ISG_ = makeSymbol( "*QC-ISG*" );
    $sym4$_QC_INDEX_ = makeSymbol( "*QC-INDEX*" );
    $sym5$QC_QUERY = makeSymbol( "QC-QUERY" );
    $sym6$QC_QUERY_P = makeSymbol( "QC-QUERY-P" );
    $list7 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "CYCL" ), makeSymbol( "TERMS" ), makeSymbol( "RETURN-TERMS" ), makeSymbol( "CONSTRAINTS" ), makeSymbol( "VAR-MAP" ), makeSymbol(
        "SCENARIO" ), makeSymbol( "ASSUMED-TERMS" ), makeSymbol( "ASSUMED-CONSTRAINTS" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "CYCL" ), makeKeyword( "TERMS" ), makeKeyword( "RETURN-TERMS" ), makeKeyword( "CONSTRAINTS" ), makeKeyword( "VAR-MAP" ), makeKeyword(
        "SCENARIO" ), makeKeyword( "ASSUMED-TERMS" ), makeKeyword( "ASSUMED-CONSTRAINTS" )
    } );
    $list9 = ConsesLow.list( new SubLObject[] { makeSymbol( "QC-QUERY-ID" ), makeSymbol( "QC-QUERY-CYCL" ), makeSymbol( "QC-QUERY-TERMS" ), makeSymbol( "QC-QUERY-RETURN-TERMS" ), makeSymbol( "QC-QUERY-CONSTRAINTS" ),
      makeSymbol( "QC-QUERY-VAR-MAP" ), makeSymbol( "QC-QUERY-SCENARIO" ), makeSymbol( "QC-QUERY-ASSUMED-TERMS" ), makeSymbol( "QC-QUERY-ASSUMED-CONSTRAINTS" )
    } );
    $list10 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-QC-QUERY-ID" ), makeSymbol( "_CSETF-QC-QUERY-CYCL" ), makeSymbol( "_CSETF-QC-QUERY-TERMS" ), makeSymbol( "_CSETF-QC-QUERY-RETURN-TERMS" ), makeSymbol(
        "_CSETF-QC-QUERY-CONSTRAINTS" ), makeSymbol( "_CSETF-QC-QUERY-VAR-MAP" ), makeSymbol( "_CSETF-QC-QUERY-SCENARIO" ), makeSymbol( "_CSETF-QC-QUERY-ASSUMED-TERMS" ), makeSymbol(
            "_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS" )
    } );
    $sym11$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym12$QC_QUERY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "QC-QUERY-PRINT-FUNCTION-TRAMPOLINE" );
    $list13 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "QC-QUERY-P" ) );
    $sym14$QC_QUERY_ID = makeSymbol( "QC-QUERY-ID" );
    $sym15$_CSETF_QC_QUERY_ID = makeSymbol( "_CSETF-QC-QUERY-ID" );
    $sym16$QC_QUERY_CYCL = makeSymbol( "QC-QUERY-CYCL" );
    $sym17$_CSETF_QC_QUERY_CYCL = makeSymbol( "_CSETF-QC-QUERY-CYCL" );
    $sym18$QC_QUERY_TERMS = makeSymbol( "QC-QUERY-TERMS" );
    $sym19$_CSETF_QC_QUERY_TERMS = makeSymbol( "_CSETF-QC-QUERY-TERMS" );
    $sym20$QC_QUERY_RETURN_TERMS = makeSymbol( "QC-QUERY-RETURN-TERMS" );
    $sym21$_CSETF_QC_QUERY_RETURN_TERMS = makeSymbol( "_CSETF-QC-QUERY-RETURN-TERMS" );
    $sym22$QC_QUERY_CONSTRAINTS = makeSymbol( "QC-QUERY-CONSTRAINTS" );
    $sym23$_CSETF_QC_QUERY_CONSTRAINTS = makeSymbol( "_CSETF-QC-QUERY-CONSTRAINTS" );
    $sym24$QC_QUERY_VAR_MAP = makeSymbol( "QC-QUERY-VAR-MAP" );
    $sym25$_CSETF_QC_QUERY_VAR_MAP = makeSymbol( "_CSETF-QC-QUERY-VAR-MAP" );
    $sym26$QC_QUERY_SCENARIO = makeSymbol( "QC-QUERY-SCENARIO" );
    $sym27$_CSETF_QC_QUERY_SCENARIO = makeSymbol( "_CSETF-QC-QUERY-SCENARIO" );
    $sym28$QC_QUERY_ASSUMED_TERMS = makeSymbol( "QC-QUERY-ASSUMED-TERMS" );
    $sym29$_CSETF_QC_QUERY_ASSUMED_TERMS = makeSymbol( "_CSETF-QC-QUERY-ASSUMED-TERMS" );
    $sym30$QC_QUERY_ASSUMED_CONSTRAINTS = makeSymbol( "QC-QUERY-ASSUMED-CONSTRAINTS" );
    $sym31$_CSETF_QC_QUERY_ASSUMED_CONSTRAINTS = makeSymbol( "_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS" );
    $kw32$ID = makeKeyword( "ID" );
    $kw33$CYCL = makeKeyword( "CYCL" );
    $kw34$TERMS = makeKeyword( "TERMS" );
    $kw35$RETURN_TERMS = makeKeyword( "RETURN-TERMS" );
    $kw36$CONSTRAINTS = makeKeyword( "CONSTRAINTS" );
    $kw37$VAR_MAP = makeKeyword( "VAR-MAP" );
    $kw38$SCENARIO = makeKeyword( "SCENARIO" );
    $kw39$ASSUMED_TERMS = makeKeyword( "ASSUMED-TERMS" );
    $kw40$ASSUMED_CONSTRAINTS = makeKeyword( "ASSUMED-CONSTRAINTS" );
    $str41$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw42$BEGIN = makeKeyword( "BEGIN" );
    $sym43$MAKE_QC_QUERY = makeSymbol( "MAKE-QC-QUERY" );
    $kw44$SLOT = makeKeyword( "SLOT" );
    $kw45$END = makeKeyword( "END" );
    $sym46$VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-QC-QUERY-METHOD" );
    $sym47$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym48$LISTP = makeSymbol( "LISTP" );
    $sym49$SM_INDEXICAL_RECORD_P = makeSymbol( "SM-INDEXICAL-RECORD-P" );
    $sym50$SM_SCENARIO_P = makeSymbol( "SM-SCENARIO-P" );
    $sym51$SM_CONSTRAINT_RECORD_P = makeSymbol( "SM-CONSTRAINT-RECORD-P" );
    $sym52$QC_STATE = makeSymbol( "QC-STATE" );
    $sym53$QC_STATE_P = makeSymbol( "QC-STATE-P" );
    $list54 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "TEXT" ), makeSymbol( "CANDIDATES" ), makeSymbol( "QUERY" ), makeSymbol( "INTERACTION" ), makeSymbol( "PARSING-MT" ), makeSymbol(
        "GENERATION-MT" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "DOMAIN-INTERACTION-MT" )
    } );
    $list55 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "TEXT" ), makeKeyword( "CANDIDATES" ), makeKeyword( "QUERY" ), makeKeyword( "INTERACTION" ), makeKeyword( "PARSING-MT" ), makeKeyword(
        "GENERATION-MT" ), makeKeyword( "DOMAIN-MT" ), makeKeyword( "DOMAIN-INTERACTION-MT" )
    } );
    $list56 = ConsesLow.list( new SubLObject[] { makeSymbol( "QC-STATE-ID" ), makeSymbol( "QC-STATE-TEXT" ), makeSymbol( "QC-STATE-CANDIDATES" ), makeSymbol( "QC-STATE-QUERY" ), makeSymbol( "QC-STATE-INTERACTION" ),
      makeSymbol( "QC-STATE-PARSING-MT" ), makeSymbol( "QC-STATE-GENERATION-MT" ), makeSymbol( "QC-STATE-DOMAIN-MT" ), makeSymbol( "QC-STATE-DOMAIN-INTERACTION-MT" )
    } );
    $list57 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-QC-STATE-ID" ), makeSymbol( "_CSETF-QC-STATE-TEXT" ), makeSymbol( "_CSETF-QC-STATE-CANDIDATES" ), makeSymbol( "_CSETF-QC-STATE-QUERY" ), makeSymbol(
        "_CSETF-QC-STATE-INTERACTION" ), makeSymbol( "_CSETF-QC-STATE-PARSING-MT" ), makeSymbol( "_CSETF-QC-STATE-GENERATION-MT" ), makeSymbol( "_CSETF-QC-STATE-DOMAIN-MT" ), makeSymbol(
            "_CSETF-QC-STATE-DOMAIN-INTERACTION-MT" )
    } );
    $sym58$QC_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "QC-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list59 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "QC-STATE-P" ) );
    $sym60$QC_STATE_ID = makeSymbol( "QC-STATE-ID" );
    $sym61$_CSETF_QC_STATE_ID = makeSymbol( "_CSETF-QC-STATE-ID" );
    $sym62$QC_STATE_TEXT = makeSymbol( "QC-STATE-TEXT" );
    $sym63$_CSETF_QC_STATE_TEXT = makeSymbol( "_CSETF-QC-STATE-TEXT" );
    $sym64$QC_STATE_CANDIDATES = makeSymbol( "QC-STATE-CANDIDATES" );
    $sym65$_CSETF_QC_STATE_CANDIDATES = makeSymbol( "_CSETF-QC-STATE-CANDIDATES" );
    $sym66$QC_STATE_QUERY = makeSymbol( "QC-STATE-QUERY" );
    $sym67$_CSETF_QC_STATE_QUERY = makeSymbol( "_CSETF-QC-STATE-QUERY" );
    $sym68$QC_STATE_INTERACTION = makeSymbol( "QC-STATE-INTERACTION" );
    $sym69$_CSETF_QC_STATE_INTERACTION = makeSymbol( "_CSETF-QC-STATE-INTERACTION" );
    $sym70$QC_STATE_PARSING_MT = makeSymbol( "QC-STATE-PARSING-MT" );
    $sym71$_CSETF_QC_STATE_PARSING_MT = makeSymbol( "_CSETF-QC-STATE-PARSING-MT" );
    $sym72$QC_STATE_GENERATION_MT = makeSymbol( "QC-STATE-GENERATION-MT" );
    $sym73$_CSETF_QC_STATE_GENERATION_MT = makeSymbol( "_CSETF-QC-STATE-GENERATION-MT" );
    $sym74$QC_STATE_DOMAIN_MT = makeSymbol( "QC-STATE-DOMAIN-MT" );
    $sym75$_CSETF_QC_STATE_DOMAIN_MT = makeSymbol( "_CSETF-QC-STATE-DOMAIN-MT" );
    $sym76$QC_STATE_DOMAIN_INTERACTION_MT = makeSymbol( "QC-STATE-DOMAIN-INTERACTION-MT" );
    $sym77$_CSETF_QC_STATE_DOMAIN_INTERACTION_MT = makeSymbol( "_CSETF-QC-STATE-DOMAIN-INTERACTION-MT" );
    $kw78$TEXT = makeKeyword( "TEXT" );
    $kw79$CANDIDATES = makeKeyword( "CANDIDATES" );
    $kw80$QUERY = makeKeyword( "QUERY" );
    $kw81$INTERACTION = makeKeyword( "INTERACTION" );
    $kw82$PARSING_MT = makeKeyword( "PARSING-MT" );
    $kw83$GENERATION_MT = makeKeyword( "GENERATION-MT" );
    $kw84$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $kw85$DOMAIN_INTERACTION_MT = makeKeyword( "DOMAIN-INTERACTION-MT" );
    $sym86$MAKE_QC_STATE = makeSymbol( "MAKE-QC-STATE" );
    $sym87$VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-QC-STATE-METHOD" );
    $sym88$STRINGP = makeSymbol( "STRINGP" );
    $sym89$USER_INTERACTION_P = makeSymbol( "USER-INTERACTION-P" );
    $sym90$HLMT_P = makeSymbol( "HLMT-P" );
    $int91$256 = makeInteger( 256 );
    $sym92$RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD = makeSymbol( "RKF-ADD-OBJECT-VAR-MAP-ENTRY-QC-QUERY-METHOD" );
    $sym93$RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD = makeSymbol( "RKF-REM-OBJECT-VAR-MAP-QC-QUERY-METHOD" );
    $str94$_ = makeString( "-" );
    $str95$_ = makeString( " " );
    $str96$function = makeString( "function" );
    $str97$_A = makeString( "~A" );
    $sym98$SM_CONSTRAINT_RECORD_SENTENCE = makeSymbol( "SM-CONSTRAINT-RECORD-SENTENCE" );
    $const99$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const100$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list101 = ConsesLow.list( makeSymbol( "EL-VARIABLE" ), makeSymbol( "INDEXICAL-RECORD" ) );
    $sym102$SM_INDEXICAL_P = makeSymbol( "SM-INDEXICAL-P" );
    $sym103$SM_INDEXICAL_RECORD_INDEXICAL = makeSymbol( "SM-INDEXICAL-RECORD-INDEXICAL" );
  }

  public static final class $qc_query_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $cycl;
    public SubLObject $terms;
    public SubLObject $return_terms;
    public SubLObject $constraints;
    public SubLObject $var_map;
    public SubLObject $scenario;
    public SubLObject $assumed_terms;
    public SubLObject $assumed_constraints;
    private static final SubLStructDeclNative structDecl;

    public $qc_query_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$cycl = CommonSymbols.NIL;
      this.$terms = CommonSymbols.NIL;
      this.$return_terms = CommonSymbols.NIL;
      this.$constraints = CommonSymbols.NIL;
      this.$var_map = CommonSymbols.NIL;
      this.$scenario = CommonSymbols.NIL;
      this.$assumed_terms = CommonSymbols.NIL;
      this.$assumed_constraints = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $qc_query_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$cycl;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$terms;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$return_terms;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$constraints;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$var_map;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$scenario;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$assumed_terms;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$assumed_constraints;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$cycl = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$terms = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$return_terms = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$constraints = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$var_map = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$scenario = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$assumed_terms = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$assumed_constraints = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $qc_query_native.class, $sym5$QC_QUERY, $sym6$QC_QUERY_P, $list7, $list8, new String[] { "$id", "$cycl", "$terms", "$return_terms", "$constraints", "$var_map",
        "$scenario", "$assumed_terms", "$assumed_constraints"
      }, $list9, $list10, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $qc_query_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $qc_query_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "QC-QUERY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return qc_query_p( arg1 );
    }
  }

  public static final class $qc_state_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $text;
    public SubLObject $candidates;
    public SubLObject $query;
    public SubLObject $interaction;
    public SubLObject $parsing_mt;
    public SubLObject $generation_mt;
    public SubLObject $domain_mt;
    public SubLObject $domain_interaction_mt;
    private static final SubLStructDeclNative structDecl;

    public $qc_state_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$text = CommonSymbols.NIL;
      this.$candidates = CommonSymbols.NIL;
      this.$query = CommonSymbols.NIL;
      this.$interaction = CommonSymbols.NIL;
      this.$parsing_mt = CommonSymbols.NIL;
      this.$generation_mt = CommonSymbols.NIL;
      this.$domain_mt = CommonSymbols.NIL;
      this.$domain_interaction_mt = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $qc_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$text;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$candidates;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$query;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$interaction;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$parsing_mt;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$generation_mt;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$domain_mt;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$domain_interaction_mt;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$text = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$candidates = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$query = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$interaction = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$parsing_mt = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$generation_mt = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$domain_mt = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$domain_interaction_mt = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $qc_state_native.class, $sym52$QC_STATE, $sym53$QC_STATE_P, $list54, $list55, new String[] { "$id", "$text", "$candidates", "$query", "$interaction", "$parsing_mt",
        "$generation_mt", "$domain_mt", "$domain_interaction_mt"
      }, $list56, $list57, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $qc_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $qc_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "QC-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return qc_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 386 ms
 * 
 */