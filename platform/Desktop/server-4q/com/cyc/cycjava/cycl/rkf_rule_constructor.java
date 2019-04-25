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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_rule_constructor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_rule_constructor";
  public static final String myFingerPrint = "e6938ffd5d4befcdfaed5adc36b1cabcc73d59619e5bfeb52e473c73c106fc7a";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 770L)
  private static SubLSymbol $rc_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1812L)
  private static SubLSymbol $rc_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1937L)
  private static SubLSymbol $rc_index$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLSymbol $dtp_rc_lhs$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLSymbol $dtp_rc_rhs$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLSymbol $dtp_rc_state$;
  private static final SubLString $str0$Rule_Constructor_Lock;
  private static final SubLSymbol $sym1$WITH_LOCK_HELD;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_RC_ISG_;
  private static final SubLSymbol $sym4$_RC_INDEX_;
  private static final SubLSymbol $sym5$RC_LHS;
  private static final SubLSymbol $sym6$RC_LHS_P;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym12$RC_LHS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$RC_LHS_ID;
  private static final SubLSymbol $sym15$_CSETF_RC_LHS_ID;
  private static final SubLSymbol $sym16$RC_LHS_NL_SENTENCE;
  private static final SubLSymbol $sym17$_CSETF_RC_LHS_NL_SENTENCE;
  private static final SubLSymbol $sym18$RC_LHS_CONSTRAINTS;
  private static final SubLSymbol $sym19$_CSETF_RC_LHS_CONSTRAINTS;
  private static final SubLSymbol $sym20$RC_LHS_TERMS;
  private static final SubLSymbol $sym21$_CSETF_RC_LHS_TERMS;
  private static final SubLSymbol $sym22$RC_LHS_CYCL;
  private static final SubLSymbol $sym23$_CSETF_RC_LHS_CYCL;
  private static final SubLSymbol $kw24$ID;
  private static final SubLSymbol $kw25$NL_SENTENCE;
  private static final SubLSymbol $kw26$CONSTRAINTS;
  private static final SubLSymbol $kw27$TERMS;
  private static final SubLSymbol $kw28$CYCL;
  private static final SubLString $str29$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw30$BEGIN;
  private static final SubLSymbol $sym31$MAKE_RC_LHS;
  private static final SubLSymbol $kw32$SLOT;
  private static final SubLSymbol $kw33$END;
  private static final SubLSymbol $sym34$VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD;
  private static final SubLSymbol $sym35$STRINGP;
  private static final SubLSymbol $sym36$LISTP;
  private static final SubLSymbol $sym37$POSSIBLY_SENTENCE_P;
  private static final SubLSymbol $sym38$RC_RHS;
  private static final SubLSymbol $sym39$RC_RHS_P;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$RC_RHS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$RC_RHS_ID;
  private static final SubLSymbol $sym47$_CSETF_RC_RHS_ID;
  private static final SubLSymbol $sym48$RC_RHS_NL_SENTENCE;
  private static final SubLSymbol $sym49$_CSETF_RC_RHS_NL_SENTENCE;
  private static final SubLSymbol $sym50$RC_RHS_CONSTRAINTS;
  private static final SubLSymbol $sym51$_CSETF_RC_RHS_CONSTRAINTS;
  private static final SubLSymbol $sym52$RC_RHS_EXISTENTIAL_TERM;
  private static final SubLSymbol $sym53$_CSETF_RC_RHS_EXISTENTIAL_TERM;
  private static final SubLSymbol $sym54$RC_RHS_CYCL;
  private static final SubLSymbol $sym55$_CSETF_RC_RHS_CYCL;
  private static final SubLSymbol $kw56$EXISTENTIAL_TERM;
  private static final SubLSymbol $sym57$MAKE_RC_RHS;
  private static final SubLSymbol $sym58$VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD;
  private static final SubLSymbol $sym59$SM_CONSTRAINT_RECORD_P;
  private static final SubLSymbol $sym60$SM_INDEXICAL_RECORD_P;
  private static final SubLSymbol $sym61$RC_STATE;
  private static final SubLSymbol $sym62$RC_STATE_P;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$RC_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$RC_STATE_ID;
  private static final SubLSymbol $sym70$_CSETF_RC_STATE_ID;
  private static final SubLSymbol $sym71$RC_STATE_TEXT;
  private static final SubLSymbol $sym72$_CSETF_RC_STATE_TEXT;
  private static final SubLSymbol $sym73$RC_STATE_INTERACTION;
  private static final SubLSymbol $sym74$_CSETF_RC_STATE_INTERACTION;
  private static final SubLSymbol $sym75$RC_STATE_IF_SCENARIO;
  private static final SubLSymbol $sym76$_CSETF_RC_STATE_IF_SCENARIO;
  private static final SubLSymbol $sym77$RC_STATE_THEN_SCENARIO;
  private static final SubLSymbol $sym78$_CSETF_RC_STATE_THEN_SCENARIO;
  private static final SubLSymbol $sym79$RC_STATE_LHS;
  private static final SubLSymbol $sym80$_CSETF_RC_STATE_LHS;
  private static final SubLSymbol $sym81$RC_STATE_RHS;
  private static final SubLSymbol $sym82$_CSETF_RC_STATE_RHS;
  private static final SubLSymbol $sym83$RC_STATE_PARSING_MT;
  private static final SubLSymbol $sym84$_CSETF_RC_STATE_PARSING_MT;
  private static final SubLSymbol $sym85$RC_STATE_GENERATION_MT;
  private static final SubLSymbol $sym86$_CSETF_RC_STATE_GENERATION_MT;
  private static final SubLSymbol $sym87$RC_STATE_DOMAIN_MT;
  private static final SubLSymbol $sym88$_CSETF_RC_STATE_DOMAIN_MT;
  private static final SubLSymbol $sym89$RC_STATE_DOMAIN_INTERACTION_MT;
  private static final SubLSymbol $sym90$_CSETF_RC_STATE_DOMAIN_INTERACTION_MT;
  private static final SubLSymbol $sym91$RC_STATE_VAR_MAP;
  private static final SubLSymbol $sym92$_CSETF_RC_STATE_VAR_MAP;
  private static final SubLSymbol $sym93$RC_STATE_EXCEPTIONS;
  private static final SubLSymbol $sym94$_CSETF_RC_STATE_EXCEPTIONS;
  private static final SubLSymbol $kw95$TEXT;
  private static final SubLSymbol $kw96$INTERACTION;
  private static final SubLSymbol $kw97$IF_SCENARIO;
  private static final SubLSymbol $kw98$THEN_SCENARIO;
  private static final SubLSymbol $kw99$LHS;
  private static final SubLSymbol $kw100$RHS;
  private static final SubLSymbol $kw101$PARSING_MT;
  private static final SubLSymbol $kw102$GENERATION_MT;
  private static final SubLSymbol $kw103$DOMAIN_MT;
  private static final SubLSymbol $kw104$DOMAIN_INTERACTION_MT;
  private static final SubLSymbol $kw105$VAR_MAP;
  private static final SubLSymbol $kw106$EXCEPTIONS;
  private static final SubLSymbol $sym107$MAKE_RC_STATE;
  private static final SubLSymbol $sym108$VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD;
  private static final SubLSymbol $sym109$USER_INTERACTION_P;
  private static final SubLSymbol $sym110$SM_SCENARIO_P;
  private static final SubLSymbol $sym111$HLMT_P;
  private static final SubLSymbol $sym112$DOUBLETON_;
  private static final SubLString $str113$If_;
  private static final SubLString $str114$__then_;
  private static final SubLSymbol $kw115$INSERT_EXPLICIT_TYPE_CONSTRAINTS;
  private static final SubLSymbol $sym116$RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD;
  private static final SubLObject $const117$ist;
  private static final SubLObject $const118$exceptWhen;
  private static final SubLObject $const119$exceptFor;
  private static final SubLList $list120;
  private static final SubLString $str121$Exceptions;
  private static final SubLString $str122$Then_Clause;
  private static final SubLSymbol $sym123$SECOND;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$INDEXED_TERM_P;
  private static final SubLSymbol $sym126$RELEVANT_MT_IS_GENL_MT;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 974L)
  public static SubLObject with_rc_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$WITH_LOCK_HELD, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1068L)
  public static SubLObject rc_find_lhs_by_id(final SubLObject id)
  {
    return rc_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1231L)
  public static SubLObject rc_find_lhs_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject lhs = rc_find_lhs_by_id( id );
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1372L)
  public static SubLObject rc_find_rhs_by_id(final SubLObject id)
  {
    return rc_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1446L)
  public static SubLObject rc_find_rhs_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject rhs = rc_find_rhs_by_id( id );
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1587L)
  public static SubLObject rc_find_state_by_id(final SubLObject id)
  {
    return rc_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1663L)
  public static SubLObject rc_find_state_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject state = rc_find_state_by_id( id );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2034L)
  public static SubLObject rc_next_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $rc_isg$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2141L)
  public static SubLObject rc_add_object(final SubLObject id, final SubLObject v_object)
  {
    return dictionary.dictionary_enter( $rc_index$.getGlobalValue(), id, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2284L)
  public static SubLObject rc_rem_object(final SubLObject id)
  {
    return dictionary.dictionary_remove( $rc_index$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2414L)
  public static SubLObject rc_find_object_by_id(final SubLObject id)
  {
    return dictionary.dictionary_lookup( $rc_index$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject rc_lhs_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject rc_lhs_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rc_lhs_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject rc_lhs_id(final SubLObject v_object)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject rc_lhs_nl_sentence(final SubLObject v_object)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject rc_lhs_constraints(final SubLObject v_object)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject rc_lhs_terms(final SubLObject v_object)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject rc_lhs_cycl(final SubLObject v_object)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject _csetf_rc_lhs_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject _csetf_rc_lhs_nl_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject _csetf_rc_lhs_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject _csetf_rc_lhs_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject _csetf_rc_lhs_cycl(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_lhs_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject make_rc_lhs(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rc_lhs_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw24$ID ) )
      {
        _csetf_rc_lhs_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$NL_SENTENCE ) )
      {
        _csetf_rc_lhs_nl_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$CONSTRAINTS ) )
      {
        _csetf_rc_lhs_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$TERMS ) )
      {
        _csetf_rc_lhs_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$CYCL ) )
      {
        _csetf_rc_lhs_cycl( v_new, current_value );
      }
      else
      {
        Errors.error( $str29$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject visit_defstruct_rc_lhs(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw30$BEGIN, $sym31$MAKE_RC_LHS, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw24$ID, rc_lhs_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw25$NL_SENTENCE, rc_lhs_nl_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw26$CONSTRAINTS, rc_lhs_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw27$TERMS, rc_lhs_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw28$CYCL, rc_lhs_cycl( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$END, $sym31$MAKE_RC_LHS, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
  public static SubLObject visit_defstruct_object_rc_lhs_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rc_lhs( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2746L)
  public static SubLObject rc_new_lhs()
  {
    final SubLObject lhs = make_rc_lhs( UNPROVIDED );
    final SubLObject id = rc_next_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_lhs_id( lhs, id );
      rc_add_object( id, lhs );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2925L)
  public static SubLObject rc_cleanup_lhs(final SubLObject lhs)
  {
    assert NIL != rc_lhs_p( lhs ) : lhs;
    final SubLObject id = rc_lhs_id( lhs );
    final SubLObject success = rc_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3127L)
  public static SubLObject rc_set_lhs_nl_sentence(final SubLObject lhs, final SubLObject nl_sentence)
  {
    assert NIL != rc_lhs_p( lhs ) : lhs;
    assert NIL != Types.stringp( nl_sentence ) : nl_sentence;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_lhs_nl_sentence( lhs, nl_sentence );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3327L)
  public static SubLObject rc_set_lhs_constraints(final SubLObject lhs, final SubLObject constraints)
  {
    assert NIL != rc_lhs_p( lhs ) : lhs;
    assert NIL != Types.listp( constraints ) : constraints;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_lhs_constraints( lhs, constraints );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3526L)
  public static SubLObject rc_set_lhs_terms(final SubLObject lhs, final SubLObject terms)
  {
    assert NIL != rc_lhs_p( lhs ) : lhs;
    assert NIL != Types.listp( terms ) : terms;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_lhs_terms( lhs, terms );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3695L)
  public static SubLObject rc_set_lhs_cycl(final SubLObject lhs, final SubLObject cycl)
  {
    assert NIL != rc_lhs_p( lhs ) : lhs;
    assert NIL != el_utilities.possibly_sentence_p( cycl ) : cycl;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_lhs_cycl( lhs, cycl );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject rc_rhs_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject rc_rhs_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rc_rhs_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject rc_rhs_id(final SubLObject v_object)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject rc_rhs_nl_sentence(final SubLObject v_object)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject rc_rhs_constraints(final SubLObject v_object)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject rc_rhs_existential_term(final SubLObject v_object)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject rc_rhs_cycl(final SubLObject v_object)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject _csetf_rc_rhs_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject _csetf_rc_rhs_nl_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject _csetf_rc_rhs_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject _csetf_rc_rhs_existential_term(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject _csetf_rc_rhs_cycl(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_rhs_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject make_rc_rhs(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rc_rhs_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw24$ID ) )
      {
        _csetf_rc_rhs_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$NL_SENTENCE ) )
      {
        _csetf_rc_rhs_nl_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$CONSTRAINTS ) )
      {
        _csetf_rc_rhs_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$EXISTENTIAL_TERM ) )
      {
        _csetf_rc_rhs_existential_term( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$CYCL ) )
      {
        _csetf_rc_rhs_cycl( v_new, current_value );
      }
      else
      {
        Errors.error( $str29$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject visit_defstruct_rc_rhs(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw30$BEGIN, $sym57$MAKE_RC_RHS, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw24$ID, rc_rhs_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw25$NL_SENTENCE, rc_rhs_nl_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw26$CONSTRAINTS, rc_rhs_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw56$EXISTENTIAL_TERM, rc_rhs_existential_term( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw28$CYCL, rc_rhs_cycl( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$END, $sym57$MAKE_RC_RHS, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
  public static SubLObject visit_defstruct_object_rc_rhs_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rc_rhs( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4122L)
  public static SubLObject rc_new_rhs()
  {
    final SubLObject rhs = make_rc_rhs( UNPROVIDED );
    final SubLObject id = rc_next_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_rhs_id( rhs, id );
      rc_add_object( id, rhs );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4301L)
  public static SubLObject rc_cleanup_rhs(final SubLObject rhs)
  {
    assert NIL != rc_rhs_p( rhs ) : rhs;
    final SubLObject id = rc_rhs_id( rhs );
    final SubLObject success = rc_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4503L)
  public static SubLObject rc_set_rhs_nl_sentence(final SubLObject rhs, final SubLObject nl_sentence)
  {
    assert NIL != rc_rhs_p( rhs ) : rhs;
    assert NIL != Types.stringp( nl_sentence ) : nl_sentence;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_rhs_nl_sentence( rhs, nl_sentence );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4704L)
  public static SubLObject rc_set_rhs_constraints(final SubLObject rhs, final SubLObject constraints)
  {
    assert NIL != rc_rhs_p( rhs ) : rhs;
    assert NIL != Types.listp( constraints ) : constraints;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_rhs_constraints( rhs, constraints );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4903L)
  public static SubLObject rc_add_rhs_constraint(final SubLObject rhs, final SubLObject constraint)
  {
    assert NIL != rc_rhs_p( rhs ) : rhs;
    assert NIL != rkf_scenario_manipulator.sm_constraint_record_p( constraint ) : constraint;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_rhs_constraints( rhs, ConsesLow.cons( constraint, rc_rhs_constraints( rhs ) ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5115L)
  public static SubLObject rc_set_rhs_existential_term(final SubLObject rhs, final SubLObject existential_term)
  {
    assert NIL != rc_rhs_p( rhs ) : rhs;
    assert NIL != rkf_scenario_manipulator.sm_indexical_record_p( existential_term ) : existential_term;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_rhs_existential_term( rhs, existential_term );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5355L)
  public static SubLObject rc_set_rhs_cycl(final SubLObject rhs, final SubLObject cycl)
  {
    assert NIL != rc_rhs_p( rhs ) : rhs;
    assert NIL != el_utilities.possibly_sentence_p( cycl ) : cycl;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_rhs_cycl( rhs, cycl );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rc_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_id(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_text(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_interaction(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_if_scenario(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_then_scenario(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_lhs(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_rhs(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_parsing_mt(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_generation_mt(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_domain_mt(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_domain_interaction_mt(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_var_map(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject rc_state_exceptions(final SubLObject v_object)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_text(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_interaction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_if_scenario(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_then_scenario(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_lhs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_rhs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_parsing_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_generation_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_domain_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_var_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject _csetf_rc_state_exceptions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rc_state_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject make_rc_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rc_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw24$ID ) )
      {
        _csetf_rc_state_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw95$TEXT ) )
      {
        _csetf_rc_state_text( v_new, current_value );
      }
      else if( pcase_var.eql( $kw96$INTERACTION ) )
      {
        _csetf_rc_state_interaction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw97$IF_SCENARIO ) )
      {
        _csetf_rc_state_if_scenario( v_new, current_value );
      }
      else if( pcase_var.eql( $kw98$THEN_SCENARIO ) )
      {
        _csetf_rc_state_then_scenario( v_new, current_value );
      }
      else if( pcase_var.eql( $kw99$LHS ) )
      {
        _csetf_rc_state_lhs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw100$RHS ) )
      {
        _csetf_rc_state_rhs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw101$PARSING_MT ) )
      {
        _csetf_rc_state_parsing_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw102$GENERATION_MT ) )
      {
        _csetf_rc_state_generation_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw103$DOMAIN_MT ) )
      {
        _csetf_rc_state_domain_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw104$DOMAIN_INTERACTION_MT ) )
      {
        _csetf_rc_state_domain_interaction_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw105$VAR_MAP ) )
      {
        _csetf_rc_state_var_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw106$EXCEPTIONS ) )
      {
        _csetf_rc_state_exceptions( v_new, current_value );
      }
      else
      {
        Errors.error( $str29$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject visit_defstruct_rc_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw30$BEGIN, $sym107$MAKE_RC_STATE, THIRTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw24$ID, rc_state_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw95$TEXT, rc_state_text( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw96$INTERACTION, rc_state_interaction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw97$IF_SCENARIO, rc_state_if_scenario( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw98$THEN_SCENARIO, rc_state_then_scenario( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw99$LHS, rc_state_lhs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw100$RHS, rc_state_rhs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw101$PARSING_MT, rc_state_parsing_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw102$GENERATION_MT, rc_state_generation_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw103$DOMAIN_MT, rc_state_domain_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw104$DOMAIN_INTERACTION_MT, rc_state_domain_interaction_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw105$VAR_MAP, rc_state_var_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$SLOT, $kw106$EXCEPTIONS, rc_state_exceptions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$END, $sym107$MAKE_RC_STATE, THIRTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
  public static SubLObject visit_defstruct_object_rc_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rc_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6014L)
  public static SubLObject rc_new_state()
  {
    final SubLObject state = make_rc_state( UNPROVIDED );
    final SubLObject id = rc_next_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_id( state, id );
      rc_add_object( id, state );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6207L)
  public static SubLObject rc_cleanup_state(final SubLObject state)
  {
    assert NIL != rc_state_p( state ) : state;
    final SubLObject id = rc_state_id( state );
    final SubLObject success = rc_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6421L)
  public static SubLObject rc_set_state_text(final SubLObject state, final SubLObject text)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != Types.stringp( text ) : text;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_text( state, text );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6600L)
  public static SubLObject rc_set_state_interaction(final SubLObject state, final SubLObject interaction)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != user_interaction_agenda.user_interaction_p( interaction ) : interaction;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_interaction( state, interaction );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6826L)
  public static SubLObject rc_set_state_if_scenario(final SubLObject state, final SubLObject v_scenario)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != rkf_scenario_manipulator.sm_scenario_p( v_scenario ) : v_scenario;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_if_scenario( state, v_scenario );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7038L)
  public static SubLObject rc_set_state_then_scenario(final SubLObject state, final SubLObject v_scenario)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != rkf_scenario_manipulator.sm_scenario_p( v_scenario ) : v_scenario;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_then_scenario( state, v_scenario );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7254L)
  public static SubLObject rc_set_state_lhs(final SubLObject state, final SubLObject lhs)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != rc_lhs_p( lhs ) : lhs;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_lhs( state, lhs );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7430L)
  public static SubLObject rc_set_state_rhs(final SubLObject state, final SubLObject rhs)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != rc_rhs_p( rhs ) : rhs;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_rhs( state, rhs );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7606L)
  public static SubLObject rc_set_state_parsing_mt(final SubLObject state, final SubLObject parsing_mt)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( parsing_mt ) : parsing_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_parsing_mt( state, parsing_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7815L)
  public static SubLObject rc_set_state_generation_mt(final SubLObject state, final SubLObject generation_mt)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( generation_mt ) : generation_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_generation_mt( state, generation_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8039L)
  public static SubLObject rc_set_state_domain_mt(final SubLObject state, final SubLObject domain_mt)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( domain_mt ) : domain_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_domain_mt( state, domain_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8243L)
  public static SubLObject rc_set_state_domain_interaction_mt(final SubLObject state, final SubLObject domain_interaction_mt)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != hlmt.hlmt_p( domain_interaction_mt ) : domain_interaction_mt;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_domain_interaction_mt( state, domain_interaction_mt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8507L)
  public static SubLObject rc_add_state_var_map_entry(final SubLObject state, final SubLObject entry)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != list_utilities.doubletonP( entry ) : entry;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_var_map( state, ConsesLow.cons( entry, rc_state_var_map( state ) ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8704L)
  public static SubLObject rc_set_state_var_map(final SubLObject state, final SubLObject var_map)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != Types.listp( var_map ) : var_map;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_var_map( state, var_map );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8896L)
  public static SubLObject rc_set_state_exceptions(final SubLObject state, final SubLObject exceptions)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != Types.listp( exceptions ) : exceptions;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      _csetf_rc_state_exceptions( state, exceptions );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9104L)
  public static SubLObject rc_add_state_exception(final SubLObject state, final SubLObject v_scenario)
  {
    assert NIL != rc_state_p( state ) : state;
    assert NIL != rkf_scenario_manipulator.sm_scenario_p( v_scenario ) : v_scenario;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rc_lock$.getGlobalValue() );
      SubLObject exceptions = rc_state_exceptions( state );
      if( NIL == conses_high.member( v_scenario, exceptions, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        exceptions = ConsesLow.cons( v_scenario, exceptions );
      }
      _csetf_rc_state_exceptions( state, exceptions );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rc_lock$.getGlobalValue() );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9408L)
  public static SubLObject rc_ensure_state_lhs(final SubLObject state)
  {
    SubLObject lhs = rc_state_lhs( state );
    if( NIL == rc_lhs_p( lhs ) )
    {
      lhs = rc_new_lhs();
      rc_set_state_lhs( state, lhs );
    }
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9614L)
  public static SubLObject rc_ensure_state_rhs(final SubLObject state)
  {
    SubLObject rhs = rc_state_rhs( state );
    if( NIL == rc_rhs_p( rhs ) )
    {
      rhs = rc_new_rhs();
      rc_set_state_rhs( state, rhs );
    }
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9807L)
  public static SubLObject rc_state_complete_lhs_p(final SubLObject state)
  {
    final SubLObject lhs = rc_state_lhs( state );
    if( NIL != rc_lhs_p( lhs ) )
    {
      return rc_lhs_cycl( lhs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9966L)
  public static SubLObject rc_rule_ready_p(final SubLObject state)
  {
    return rc_act_construct_rule_cycl( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10053L)
  public static SubLObject rc_act_new_state()
  {
    final SubLObject state = rc_new_state();
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10360L)
  public static SubLObject rc_act_new_state_with_text(final SubLObject text)
  {
    final SubLObject state = rc_act_new_state();
    rc_set_state_text( state, text );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10500L)
  public static SubLObject rc_act_new_state_with_if_then(final SubLObject if_sentence, final SubLObject then_sentence)
  {
    final SubLObject state = rc_act_new_state();
    final SubLObject lhs = rc_new_lhs();
    final SubLObject rhs = rc_new_rhs();
    rc_set_lhs_nl_sentence( lhs, if_sentence );
    rc_set_rhs_nl_sentence( rhs, then_sentence );
    rc_set_state_lhs( state, lhs );
    rc_set_state_rhs( state, rhs );
    final SubLObject text = Sequences.cconcatenate( $str113$If_, new SubLObject[] { if_sentence, $str114$__then_, then_sentence
    } );
    rc_set_state_text( state, text );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10943L)
  public static SubLObject rc_act_note_state_interaction(final SubLObject state, final SubLObject interaction)
  {
    rc_set_state_interaction( state, interaction );
    rc_act_initialize_state_context( state );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11113L)
  public static SubLObject rc_act_note_state_if_scenario(final SubLObject state, final SubLObject if_scenario)
  {
    return rc_set_state_if_scenario( state, if_scenario );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11233L)
  public static SubLObject rc_act_note_state_then_scenario(final SubLObject state, final SubLObject then_scenario)
  {
    return rc_set_state_then_scenario( state, then_scenario );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11361L)
  public static SubLObject rc_act_initialize_state_context(final SubLObject state)
  {
    if( NIL != user_interaction_agenda.user_interaction_p( rc_state_interaction( state ) ) )
    {
      final SubLObject v_agenda = user_interaction_agenda.ui_agenda( rc_state_interaction( state ) );
      rc_set_state_parsing_mt( state, user_interaction_agenda.uia_parsing_interaction_mt( v_agenda ) );
      rc_set_state_generation_mt( state, user_interaction_agenda.uia_generation_interaction_mt( v_agenda, UNPROVIDED ) );
      rc_set_state_domain_mt( state, user_interaction_agenda.uia_domain_mt( v_agenda ) );
      rc_set_state_domain_interaction_mt( state, user_interaction_agenda.uia_domain_interaction_mt( v_agenda ) );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11862L)
  public static SubLObject rc_act_lhs_constraint_nl_sentence(final SubLObject state, final SubLObject constraint_record)
  {
    final SubLObject generation_mt = rc_state_generation_mt( state );
    final SubLObject domain_mt = rc_state_domain_interaction_mt( state );
    final SubLObject lhs = rc_state_lhs( state );
    final SubLObject indexical_records = rc_lhs_terms( lhs );
    return rkf_scenario_manipulator.sm_act_constraint_record_nl_sentence( constraint_record, indexical_records, domain_mt, generation_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 12384L)
  public static SubLObject rc_act_suggest_scenarios(final SubLObject state, final SubLObject nl_sentence)
  {
    final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt( state );
    final SubLObject parsing_mt = rc_state_parsing_mt( state );
    return rkf_scenario_manipulator.sm_act_suggest_scenarios( nl_sentence, domain_interaction_mt, parsing_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 12760L)
  public static SubLObject rc_act_initialize_lhs_from_scenario(final SubLObject state)
  {
    final SubLObject lhs = rc_ensure_state_lhs( state );
    final SubLObject v_scenario = rc_state_if_scenario( state );
    final SubLObject scenario_phrase = rkf_scenario_manipulator.sm_scenario_phrase( v_scenario );
    final SubLObject constraint_records = rkf_scenario_manipulator.sm_scenario_constraints( v_scenario );
    final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms( v_scenario );
    rc_set_lhs_constraints( lhs, constraint_records );
    rc_set_lhs_terms( lhs, indexical_records );
    if( NIL != scenario_phrase )
    {
      rc_set_lhs_and_full_sentence( state, scenario_phrase );
    }
    rc_act_compute_and_record_lhs_cycl( state );
    return lhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 13378L)
  public static SubLObject rc_act_compute_and_record_lhs_cycl(final SubLObject state)
  {
    final SubLObject lhs = rc_state_lhs( state );
    final SubLObject constraint_records = rc_lhs_constraints( lhs );
    final SubLObject indexical_records = rc_lhs_terms( lhs );
    rkf_query_constructor.rkf_compute_and_record_variables( state, indexical_records );
    SubLObject cycl = NIL;
    final SubLObject mt = rc_state_domain_interaction_mt( state );
    cycl = rkf_query_constructor.rkf_compute_cycl_from_parts( constraint_records, indexical_records, NIL, NIL, $kw115$INSERT_EXPLICIT_TYPE_CONSTRAINTS, mt );
    rc_set_lhs_cycl( lhs, cycl );
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 13930L)
  public static SubLObject rc_set_lhs_and_full_sentence(final SubLObject state, final SubLObject lhs_nl_sentence)
  {
    final SubLObject lhs = rc_state_lhs( state );
    final SubLObject rhs = rc_state_rhs( state );
    final SubLObject rhs_nl_sentence = rc_rhs_nl_sentence( rhs );
    final SubLObject full_nl_sentence = Sequences.cconcatenate( $str113$If_, new SubLObject[] { lhs_nl_sentence, $str114$__then_, rhs_nl_sentence
    } );
    rc_set_lhs_nl_sentence( lhs, lhs_nl_sentence );
    rc_set_state_text( state, full_nl_sentence );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 14363L)
  public static SubLObject rkf_add_object_var_map_entry_rc_state_method(final SubLObject v_object, final SubLObject item)
  {
    return rc_add_state_var_map_entry( v_object, item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 14483L)
  public static SubLObject rc_act_suggest_rhs_constraint(final SubLObject state, final SubLObject nl_sentence)
  {
    final SubLObject lhs = rc_state_lhs( state );
    final SubLObject parsing_mt = rc_state_parsing_mt( state );
    final SubLObject semantic_mt = rc_state_domain_interaction_mt( state );
    if( NIL != rc_lhs_p( lhs ) )
    {
      final SubLObject indexical_records = rc_lhs_terms( lhs );
      final SubLObject cycl_sentences = rkf_scenario_manipulator.sm_act_suggest_constraint_cycl_from_text( nl_sentence, indexical_records, parsing_mt, semantic_mt );
      return cycl_sentences;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15004L)
  public static SubLObject rc_act_add_rhs_constraint(final SubLObject state, final SubLObject cycl_sentence)
  {
    final SubLObject rhs = rc_ensure_state_rhs( state );
    final SubLObject constraint_record = rkf_scenario_manipulator.sm_new_constraint_record( cycl_sentence );
    rc_add_rhs_constraint( rhs, constraint_record );
    rc_act_compute_and_record_rhs_cycl( state );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15290L)
  public static SubLObject rc_act_set_rhs_constraint(final SubLObject state, final SubLObject cycl_sentence)
  {
    final SubLObject rhs = rc_ensure_state_rhs( state );
    final SubLObject constraint_record = rkf_scenario_manipulator.sm_new_constraint_record( cycl_sentence );
    rc_set_rhs_constraints( rhs, ConsesLow.list( constraint_record ) );
    rc_act_compute_and_record_rhs_cycl( state );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15584L)
  public static SubLObject rc_act_suggest_rhs_existentential_type(final SubLObject state, final SubLObject indexical_phrase)
  {
    final SubLObject parsing_mt = rc_state_parsing_mt( state );
    final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt( state );
    return rkf_scenario_manipulator.sm_act_suggest_new_indexical_type( indexical_phrase, parsing_mt, domain_interaction_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15878L)
  public static SubLObject rc_act_add_existential_of_type(final SubLObject state, final SubLObject indexical_phrase, final SubLObject type)
  {
    final SubLObject indexical_number = rc_next_indexical_number_of_type( state, type );
    final SubLObject indexical = rkf_scenario_manipulator.sm_new_indexical( type, indexical_number );
    final SubLObject indexical_record = rkf_scenario_manipulator.sm_new_indexical_record( indexical, ConsesLow.list( indexical_phrase ), UNPROVIDED, UNPROVIDED );
    final SubLObject rhs = rc_state_rhs( state );
    rc_set_rhs_existential_term( rhs, indexical_record );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 16268L)
  public static SubLObject rc_act_compute_and_record_rhs_cycl(final SubLObject state)
  {
    final SubLObject rhs = rc_state_rhs( state );
    final SubLObject existential = rc_rhs_existential_term( rhs );
    final SubLObject constraint_records = rc_rhs_constraints( rhs );
    final SubLObject lhs = rc_state_lhs( state );
    SubLObject indexical_records = rc_lhs_terms( lhs );
    final SubLObject cycl = NIL;
    if( NIL != existential )
    {
      rkf_query_constructor.rkf_compute_and_record_variables( state, ConsesLow.list( existential ) );
      indexical_records = ConsesLow.cons( existential, indexical_records );
    }
    SubLObject cycl_$1 = NIL;
    cycl_$1 = rkf_query_constructor.rkf_compute_cycl_from_parts( constraint_records, indexical_records, ( NIL != existential ) ? ConsesLow.list( existential ) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    rc_set_rhs_cycl( rhs, cycl_$1 );
    final SubLObject then_scenario = rc_act_ensure_then_scenario( state );
    final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt( state );
    SubLObject cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_scenario_manipulator.sm_act_import_constraint( then_scenario, constraint_record, domain_interaction_mt );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 17228L)
  public static SubLObject rc_act_set_rhs_nl_sentence(final SubLObject state, final SubLObject rhs_nl_sentence)
  {
    final SubLObject rhs = rc_state_rhs( state );
    final SubLObject lhs = rc_state_lhs( state );
    final SubLObject lhs_nl_sentence = rc_lhs_nl_sentence( lhs );
    final SubLObject new_full_sentence = Sequences.cconcatenate( $str113$If_, new SubLObject[] { lhs_nl_sentence, $str114$__then_, rhs_nl_sentence
    } );
    rc_set_rhs_nl_sentence( rhs, rhs_nl_sentence );
    rc_set_state_text( state, new_full_sentence );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 17609L)
  public static SubLObject rc_next_indexical_number_of_type(final SubLObject state, final SubLObject type)
  {
    final SubLObject lhs = rc_state_lhs( state );
    final SubLObject terms = rc_lhs_terms( lhs );
    SubLObject number = ZERO_INTEGER;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical( v_term );
      final SubLObject indexical_type = rkf_scenario_manipulator.sm_indexical_type( indexical );
      final SubLObject indexical_number = rkf_scenario_manipulator.sm_indexical_number( indexical );
      if( type.eql( indexical_type ) )
      {
        number = Numbers.add( ONE_INTEGER, Numbers.max( number, indexical_number ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 18074L)
  public static SubLObject rc_act_construct_rule_cycl(final SubLObject state)
  {
    final SubLObject lhs = rc_state_lhs( state );
    final SubLObject lhs_cycl = rc_lhs_cycl( lhs );
    final SubLObject rhs = rc_state_rhs( state );
    final SubLObject rhs_cycl = rc_rhs_cycl( rhs );
    SubLObject rule_cycl = NIL;
    if( NIL != lhs_cycl && NIL != rhs_cycl )
    {
      rule_cycl = el_utilities.make_implication( lhs_cycl, rhs_cycl );
    }
    return rule_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 18457L)
  public static SubLObject rc_act_assert_rule(final SubLObject state)
  {
    final SubLObject rule_cycl = rc_act_construct_rule_cycl( state );
    final SubLObject assert_mt = rc_state_domain_interaction_mt( state );
    final SubLObject result = rkf_assertion_utilities.rkf_assert( rule_cycl, assert_mt, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = rc_state_exceptions( state );
    SubLObject exception = NIL;
    exception = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject except_clause = rc_act_compute_cycl_for_exception( state, exception, rule_cycl, assert_mt );
      rkf_assertion_utilities.rkf_assert( except_clause, assert_mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      exception = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 18986L)
  public static SubLObject rc_act_compute_cycl_for_exception(final SubLObject state, final SubLObject exception, final SubLObject rule_cycl, final SubLObject mt)
  {
    if( NIL != list_utilities.singletonP( rkf_scenario_manipulator.sm_scenario_terms( exception ) ) && NIL != list_utilities.singletonP( rkf_scenario_manipulator.sm_scenario_constraints( exception ) ) )
    {
      return rc_act_compute_except_for_expression( state, exception, rule_cycl, mt );
    }
    return rc_act_compute_except_when_expression( state, exception, rule_cycl, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 19388L)
  public static SubLObject rc_act_compute_except_when_expression(final SubLObject state, final SubLObject exception, SubLObject rule_cycl, final SubLObject mt)
  {
    final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints( exception );
    final SubLObject existential_terms = NIL;
    final SubLObject assumed_constraints = NIL;
    final SubLObject terms = rkf_scenario_manipulator.sm_scenario_terms( exception );
    SubLObject exception_clause = rkf_query_constructor.rkf_compute_cycl_from_parts( constraints, terms, existential_terms, assumed_constraints, UNPROVIDED, UNPROVIDED );
    if( NIL == hlmt.hlmt_equal( mt, rc_state_domain_interaction_mt( state ) ) )
    {
      rule_cycl = el_utilities.make_binary_formula( $const117$ist, mt, rule_cycl );
      exception_clause = rc_adjust_exception_clause_vars_to_foreign_rule( exception_clause, rc_state_var_map( state ) );
    }
    return el_utilities.make_binary_formula( $const118$exceptWhen, exception_clause, rule_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 20162L)
  public static SubLObject rc_act_compute_except_for_expression(final SubLObject state, final SubLObject exception, SubLObject rule_cycl, final SubLObject mt)
  {
    final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints( exception );
    final SubLObject exception_term = rc_find_the_exception_term( constraints );
    if( NIL == hlmt.hlmt_equal( mt, rc_state_domain_interaction_mt( state ) ) )
    {
      rule_cycl = el_utilities.make_binary_formula( $const117$ist, mt, rule_cycl );
    }
    return el_utilities.make_binary_formula( $const119$exceptFor, exception_term, rule_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 20597L)
  public static SubLObject rc_find_the_exception_term(final SubLObject constraints)
  {
    final SubLObject constraint = constraints.first();
    final SubLObject formula = rkf_scenario_manipulator.sm_constraint_record_sentence( constraint );
    return ( NIL != rkf_scenario_manipulator.sm_indexical_p( cycl_utilities.formula_arg1( formula, UNPROVIDED ) ) ) ? cycl_utilities.formula_arg2( formula, UNPROVIDED )
        : cycl_utilities.formula_arg1( formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 20954L)
  public static SubLObject rc_adjust_exception_clause_vars_to_foreign_rule(final SubLObject clause, final SubLObject var_map)
  {
    final SubLObject new_clause = el_utilities.copy_formula( clause );
    SubLObject cdolist_list_var = var_map;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = var;
      SubLObject el_variable = NIL;
      SubLObject indexical = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
      el_variable = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
      indexical = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject scenario_el_variable = rkf_scenario_manipulator.sm_indexical_record_var( indexical );
        if( !el_variable.eql( scenario_el_variable ) )
        {
          conses_high.nsubst( el_variable, scenario_el_variable, new_clause, UNPROVIDED, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return new_clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 21667L)
  public static SubLObject rc_act_construct_exception_scenario(final SubLObject state)
  {
    final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario( $str121$Exceptions, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject varmap = cdolist_list_var = rc_state_var_map( state );
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = variable;
      SubLObject el_variable = NIL;
      SubLObject indexical = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
      el_variable = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
      indexical = current.first();
      current = current.rest();
      if( NIL == current )
      {
        rkf_scenario_manipulator.sm_act_share_scenario_term( v_scenario, indexical );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22137L)
  public static SubLObject rc_act_add_new_exception_scenario(final SubLObject state, final SubLObject exception)
  {
    return rc_add_state_exception( state, exception );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22259L)
  public static SubLObject rc_act_exception_constraints(final SubLObject state, final SubLObject exception)
  {
    return rkf_scenario_manipulator.sm_scenario_constraints( exception );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22388L)
  public static SubLObject rc_act_ensure_then_scenario(final SubLObject state)
  {
    SubLObject v_scenario = rc_state_then_scenario( state );
    if( NIL == rkf_scenario_manipulator.sm_scenario_p( v_scenario ) )
    {
      v_scenario = rc_act_construct_then_scenario( state );
      rc_set_state_then_scenario( state, v_scenario );
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22759L)
  public static SubLObject rc_act_construct_then_scenario(final SubLObject state)
  {
    final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario( $str122$Then_Clause, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject varmap = cdolist_list_var = rc_state_var_map( state );
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = variable;
      SubLObject el_variable = NIL;
      SubLObject indexical = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
      el_variable = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
      indexical = current.first();
      current = current.rest();
      if( NIL == current )
      {
        rkf_scenario_manipulator.sm_act_share_scenario_term( v_scenario, indexical );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 23122L)
  public static SubLObject rc_act_update_then_scenario(final SubLObject state, final SubLObject then_scenario)
  {
    final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints( then_scenario );
    rc_set_rhs_constraints( rc_state_rhs( state ), constraints );
    rc_act_compute_and_record_rhs_cycl( state );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 23378L)
  public static SubLObject rc_act_initialize_rule_for_consequent(final SubLObject state, final SubLObject consequent, final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt( state );
    final SubLObject generation_mt = rc_state_generation_mt( state );
    thread.resetMultipleValues();
    final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl( consequent, domain_interaction_mt, generation_mt );
    final SubLObject var_map = thread.secondMultipleValue();
    thread.resetMultipleValues();
    rc_set_state_var_map( state, var_map );
    final SubLObject lhs = rc_ensure_state_lhs( state );
    rc_set_lhs_terms( lhs, Mapping.mapcar( $sym123$SECOND, var_map ) );
    final SubLObject rhs = rc_ensure_state_rhs( state );
    rc_set_rhs_cycl( rhs, consequent );
    rc_set_rhs_nl_sentence( rhs, phrase );
    rc_set_rhs_constraints( rhs, rkf_scenario_manipulator.sm_scenario_constraints( v_scenario ) );
    rkf_scenario_manipulator.sm_act_remove_all_constraints( v_scenario, domain_interaction_mt );
    rc_set_state_if_scenario( state, v_scenario );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 24511L)
  public static SubLObject rc_act_initialize_rule_from_cycl(final SubLObject state, final SubLObject implication_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != rc_valid_implication( implication_sentence ) )
    {
      final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt( state );
      final SubLObject generation_mt = rc_state_generation_mt( state );
      thread.resetMultipleValues();
      final SubLObject connective = el_utilities.unmake_binary_formula( implication_sentence );
      final SubLObject lhs_sentence = thread.secondMultipleValue();
      final SubLObject rhs_sentence = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl( lhs_sentence, domain_interaction_mt, generation_mt );
      final SubLObject var_map = thread.secondMultipleValue();
      thread.resetMultipleValues();
      rc_set_state_var_map( state, var_map );
      rc_set_state_if_scenario( state, v_scenario );
      final SubLObject lhs = rc_act_initialize_lhs_from_scenario( state );
      final SubLObject rhs = rc_act_initialize_rhs_from_cycl( state, rhs_sentence );
      rc_set_state_lhs( state, lhs );
      rc_set_state_rhs( state, rhs );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 25349L)
  public static SubLObject rc_valid_implication(final SubLObject cycl_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_utilities.el_implication_p( cycl_utilities.hl_to_el( cycl_sentence ) ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject connective = el_utilities.unmake_binary_formula( cycl_sentence );
    final SubLObject lhs = thread.secondMultipleValue();
    final SubLObject rhs = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( ( NIL == el_utilities.el_conjunction_p( lhs ) && NIL == el_utilities.atomic_sentenceP( lhs ) ) || NIL == el_utilities.atomic_sentenceP( rhs ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 25993L)
  public static SubLObject rc_act_initialize_rhs_from_cycl(final SubLObject state, final SubLObject cycl_sentence)
  {
    final SubLObject rhs = rc_ensure_state_rhs( state );
    final SubLObject var_map = rc_state_var_map( state );
    final SubLObject rhs_cycl = el_utilities.copy_formula( cycl_sentence );
    SubLObject cdolist_list_var = var_map;
    SubLObject var_map_entry = NIL;
    var_map_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = var_map_entry;
      SubLObject var = NIL;
      SubLObject indexical_record = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
      indexical_record = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical( indexical_record );
        cycl_utilities.expression_nsubst( indexical, var, rhs_cycl, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list124 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var_map_entry = cdolist_list_var.first();
    }
    rc_act_set_rhs_constraint( state, rhs_cycl );
    final SubLObject constraint_record = rc_rhs_constraints( rhs ).first();
    rc_act_lhs_constraint_nl_sentence( state, constraint_record );
    rc_act_compute_and_record_rhs_cycl( state );
    return rhs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 26676L)
  public static SubLObject rkf_find_assertion_for_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLObject assertions = rkf_similar_assertions_locator( sentence, mt );
    SubLObject solution = NIL;
    if( NIL == solution )
    {
      SubLObject csome_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = csome_list_var.first();
      while ( NIL == solution && NIL != csome_list_var)
      {
        final SubLObject found = czer_meta.find_assertion_cycl( sentence, assertions_high.assertion_mt( assertion ) );
        if( found.eql( assertion ) )
        {
          solution = assertion;
        }
        csome_list_var = csome_list_var.rest();
        assertion = csome_list_var.first();
      }
    }
    return solution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 27272L)
  public static SubLObject rkf_similar_assertions_locator(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject terms = list_utilities.remove_if_not( $sym125$INDEXED_TERM_P, rkf_gather_similar_assertion_terms( sentence, mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym126$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      assertions = virtual_indexing.assertions_mentioning_terms( terms, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 27613L)
  public static SubLObject rkf_gather_similar_assertion_terms(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject cnf = czer_main.el_to_hl( sentence, mt );
    return virtual_indexing.terms_for_overlap_index( cnf );
  }

  public static SubLObject declare_rkf_rule_constructor_file()
  {
    SubLFiles.declareMacro( me, "with_rc_lock", "WITH-RC-LOCK" );
    SubLFiles.declareFunction( me, "rc_find_lhs_by_id", "RC-FIND-LHS-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_find_lhs_by_id_string", "RC-FIND-LHS-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_find_rhs_by_id", "RC-FIND-RHS-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_find_rhs_by_id_string", "RC-FIND-RHS-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_find_state_by_id", "RC-FIND-STATE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_find_state_by_id_string", "RC-FIND-STATE-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_next_id", "RC-NEXT-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "rc_add_object", "RC-ADD-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_rem_object", "RC-REM-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_find_object_by_id", "RC-FIND-OBJECT-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_lhs_print_function_trampoline", "RC-LHS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_lhs_p", "RC-LHS-P", 1, 0, false );
    new $rc_lhs_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rc_lhs_id", "RC-LHS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_lhs_nl_sentence", "RC-LHS-NL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_lhs_constraints", "RC-LHS-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_lhs_terms", "RC-LHS-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_lhs_cycl", "RC-LHS-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_lhs_id", "_CSETF-RC-LHS-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_lhs_nl_sentence", "_CSETF-RC-LHS-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_lhs_constraints", "_CSETF-RC-LHS-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_lhs_terms", "_CSETF-RC-LHS-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_lhs_cycl", "_CSETF-RC-LHS-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rc_lhs", "MAKE-RC-LHS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rc_lhs", "VISIT-DEFSTRUCT-RC-LHS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rc_lhs_method", "VISIT-DEFSTRUCT-OBJECT-RC-LHS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_new_lhs", "RC-NEW-LHS", 0, 0, false );
    SubLFiles.declareFunction( me, "rc_cleanup_lhs", "RC-CLEANUP-LHS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_set_lhs_nl_sentence", "RC-SET-LHS-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_lhs_constraints", "RC-SET-LHS-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_lhs_terms", "RC-SET-LHS-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_lhs_cycl", "RC-SET-LHS-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_rhs_print_function_trampoline", "RC-RHS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_rhs_p", "RC-RHS-P", 1, 0, false );
    new $rc_rhs_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rc_rhs_id", "RC-RHS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_rhs_nl_sentence", "RC-RHS-NL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_rhs_constraints", "RC-RHS-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_rhs_existential_term", "RC-RHS-EXISTENTIAL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_rhs_cycl", "RC-RHS-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_rhs_id", "_CSETF-RC-RHS-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_rhs_nl_sentence", "_CSETF-RC-RHS-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_rhs_constraints", "_CSETF-RC-RHS-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_rhs_existential_term", "_CSETF-RC-RHS-EXISTENTIAL-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_rhs_cycl", "_CSETF-RC-RHS-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rc_rhs", "MAKE-RC-RHS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rc_rhs", "VISIT-DEFSTRUCT-RC-RHS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rc_rhs_method", "VISIT-DEFSTRUCT-OBJECT-RC-RHS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_new_rhs", "RC-NEW-RHS", 0, 0, false );
    SubLFiles.declareFunction( me, "rc_cleanup_rhs", "RC-CLEANUP-RHS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_set_rhs_nl_sentence", "RC-SET-RHS-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_rhs_constraints", "RC-SET-RHS-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_add_rhs_constraint", "RC-ADD-RHS-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_rhs_existential_term", "RC-SET-RHS-EXISTENTIAL-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_rhs_cycl", "RC-SET-RHS-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_state_print_function_trampoline", "RC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_state_p", "RC-STATE-P", 1, 0, false );
    new $rc_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rc_state_id", "RC-STATE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_text", "RC-STATE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_interaction", "RC-STATE-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_if_scenario", "RC-STATE-IF-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_then_scenario", "RC-STATE-THEN-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_lhs", "RC-STATE-LHS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_rhs", "RC-STATE-RHS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_parsing_mt", "RC-STATE-PARSING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_generation_mt", "RC-STATE-GENERATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_domain_mt", "RC-STATE-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_domain_interaction_mt", "RC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_var_map", "RC-STATE-VAR-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_exceptions", "RC-STATE-EXCEPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_id", "_CSETF-RC-STATE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_text", "_CSETF-RC-STATE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_interaction", "_CSETF-RC-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_if_scenario", "_CSETF-RC-STATE-IF-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_then_scenario", "_CSETF-RC-STATE-THEN-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_lhs", "_CSETF-RC-STATE-LHS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_rhs", "_CSETF-RC-STATE-RHS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_parsing_mt", "_CSETF-RC-STATE-PARSING-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_generation_mt", "_CSETF-RC-STATE-GENERATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_domain_mt", "_CSETF-RC-STATE-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_domain_interaction_mt", "_CSETF-RC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_var_map", "_CSETF-RC-STATE-VAR-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rc_state_exceptions", "_CSETF-RC-STATE-EXCEPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rc_state", "MAKE-RC-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rc_state", "VISIT-DEFSTRUCT-RC-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rc_state_method", "VISIT-DEFSTRUCT-OBJECT-RC-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_new_state", "RC-NEW-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "rc_cleanup_state", "RC-CLEANUP-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_text", "RC-SET-STATE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_interaction", "RC-SET-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_if_scenario", "RC-SET-STATE-IF-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_then_scenario", "RC-SET-STATE-THEN-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_lhs", "RC-SET-STATE-LHS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_rhs", "RC-SET-STATE-RHS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_parsing_mt", "RC-SET-STATE-PARSING-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_generation_mt", "RC-SET-STATE-GENERATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_domain_mt", "RC-SET-STATE-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_domain_interaction_mt", "RC-SET-STATE-DOMAIN-INTERACTION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_add_state_var_map_entry", "RC-ADD-STATE-VAR-MAP-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_var_map", "RC-SET-STATE-VAR-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_set_state_exceptions", "RC-SET-STATE-EXCEPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_add_state_exception", "RC-ADD-STATE-EXCEPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_ensure_state_lhs", "RC-ENSURE-STATE-LHS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_ensure_state_rhs", "RC-ENSURE-STATE-RHS", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_state_complete_lhs_p", "RC-STATE-COMPLETE-LHS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_rule_ready_p", "RC-RULE-READY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_new_state", "RC-ACT-NEW-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "rc_act_new_state_with_text", "RC-ACT-NEW-STATE-WITH-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_new_state_with_if_then", "RC-ACT-NEW-STATE-WITH-IF-THEN", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_note_state_interaction", "RC-ACT-NOTE-STATE-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_note_state_if_scenario", "RC-ACT-NOTE-STATE-IF-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_note_state_then_scenario", "RC-ACT-NOTE-STATE-THEN-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_initialize_state_context", "RC-ACT-INITIALIZE-STATE-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_lhs_constraint_nl_sentence", "RC-ACT-LHS-CONSTRAINT-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_suggest_scenarios", "RC-ACT-SUGGEST-SCENARIOS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_initialize_lhs_from_scenario", "RC-ACT-INITIALIZE-LHS-FROM-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_compute_and_record_lhs_cycl", "RC-ACT-COMPUTE-AND-RECORD-LHS-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_set_lhs_and_full_sentence", "RC-SET-LHS-AND-FULL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_object_var_map_entry_rc_state_method", "RKF-ADD-OBJECT-VAR-MAP-ENTRY-RC-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_suggest_rhs_constraint", "RC-ACT-SUGGEST-RHS-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_add_rhs_constraint", "RC-ACT-ADD-RHS-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_set_rhs_constraint", "RC-ACT-SET-RHS-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_suggest_rhs_existentential_type", "RC-ACT-SUGGEST-RHS-EXISTENTENTIAL-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_add_existential_of_type", "RC-ACT-ADD-EXISTENTIAL-OF-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "rc_act_compute_and_record_rhs_cycl", "RC-ACT-COMPUTE-AND-RECORD-RHS-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_set_rhs_nl_sentence", "RC-ACT-SET-RHS-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_next_indexical_number_of_type", "RC-NEXT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_construct_rule_cycl", "RC-ACT-CONSTRUCT-RULE-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_assert_rule", "RC-ACT-ASSERT-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_compute_cycl_for_exception", "RC-ACT-COMPUTE-CYCL-FOR-EXCEPTION", 4, 0, false );
    SubLFiles.declareFunction( me, "rc_act_compute_except_when_expression", "RC-ACT-COMPUTE-EXCEPT-WHEN-EXPRESSION", 4, 0, false );
    SubLFiles.declareFunction( me, "rc_act_compute_except_for_expression", "RC-ACT-COMPUTE-EXCEPT-FOR-EXPRESSION", 4, 0, false );
    SubLFiles.declareFunction( me, "rc_find_the_exception_term", "RC-FIND-THE-EXCEPTION-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_adjust_exception_clause_vars_to_foreign_rule", "RC-ADJUST-EXCEPTION-CLAUSE-VARS-TO-FOREIGN-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_construct_exception_scenario", "RC-ACT-CONSTRUCT-EXCEPTION-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_add_new_exception_scenario", "RC-ACT-ADD-NEW-EXCEPTION-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_exception_constraints", "RC-ACT-EXCEPTION-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_ensure_then_scenario", "RC-ACT-ENSURE-THEN-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_construct_then_scenario", "RC-ACT-CONSTRUCT-THEN-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_update_then_scenario", "RC-ACT-UPDATE-THEN-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_act_initialize_rule_for_consequent", "RC-ACT-INITIALIZE-RULE-FOR-CONSEQUENT", 3, 0, false );
    SubLFiles.declareFunction( me, "rc_act_initialize_rule_from_cycl", "RC-ACT-INITIALIZE-RULE-FROM-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "rc_valid_implication", "RC-VALID-IMPLICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rc_act_initialize_rhs_from_cycl", "RC-ACT-INITIALIZE-RHS-FROM-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_find_assertion_for_sentence", "RKF-FIND-ASSERTION-FOR-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_similar_assertions_locator", "RKF-SIMILAR-ASSERTIONS-LOCATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_gather_similar_assertion_terms", "RKF-GATHER-SIMILAR-ASSERTION-TERMS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_rule_constructor_file()
  {
    $rc_lock$ = SubLFiles.deflexical( "*RC-LOCK*", Locks.make_lock( $str0$Rule_Constructor_Lock ) );
    $rc_isg$ = SubLFiles.deflexical( "*RC-ISG*", maybeDefault( $sym3$_RC_ISG_, $rc_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
    $rc_index$ = SubLFiles.deflexical( "*RC-INDEX*", maybeDefault( $sym4$_RC_INDEX_, $rc_index$, () -> ( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_rc_lhs$ = SubLFiles.defconstant( "*DTP-RC-LHS*", $sym5$RC_LHS );
    $dtp_rc_rhs$ = SubLFiles.defconstant( "*DTP-RC-RHS*", $sym38$RC_RHS );
    $dtp_rc_state$ = SubLFiles.defconstant( "*DTP-RC-STATE*", $sym61$RC_STATE );
    return NIL;
  }

  public static SubLObject setup_rkf_rule_constructor_file()
  {
    subl_macro_promotions.declare_defglobal( $sym3$_RC_ISG_ );
    subl_macro_promotions.declare_defglobal( $sym4$_RC_INDEX_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rc_lhs$.getGlobalValue(), Symbols.symbol_function( $sym12$RC_LHS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list13 );
    Structures.def_csetf( $sym14$RC_LHS_ID, $sym15$_CSETF_RC_LHS_ID );
    Structures.def_csetf( $sym16$RC_LHS_NL_SENTENCE, $sym17$_CSETF_RC_LHS_NL_SENTENCE );
    Structures.def_csetf( $sym18$RC_LHS_CONSTRAINTS, $sym19$_CSETF_RC_LHS_CONSTRAINTS );
    Structures.def_csetf( $sym20$RC_LHS_TERMS, $sym21$_CSETF_RC_LHS_TERMS );
    Structures.def_csetf( $sym22$RC_LHS_CYCL, $sym23$_CSETF_RC_LHS_CYCL );
    Equality.identity( $sym5$RC_LHS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rc_lhs$.getGlobalValue(), Symbols.symbol_function( $sym34$VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rc_rhs$.getGlobalValue(), Symbols.symbol_function( $sym44$RC_RHS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list45 );
    Structures.def_csetf( $sym46$RC_RHS_ID, $sym47$_CSETF_RC_RHS_ID );
    Structures.def_csetf( $sym48$RC_RHS_NL_SENTENCE, $sym49$_CSETF_RC_RHS_NL_SENTENCE );
    Structures.def_csetf( $sym50$RC_RHS_CONSTRAINTS, $sym51$_CSETF_RC_RHS_CONSTRAINTS );
    Structures.def_csetf( $sym52$RC_RHS_EXISTENTIAL_TERM, $sym53$_CSETF_RC_RHS_EXISTENTIAL_TERM );
    Structures.def_csetf( $sym54$RC_RHS_CYCL, $sym55$_CSETF_RC_RHS_CYCL );
    Equality.identity( $sym38$RC_RHS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rc_rhs$.getGlobalValue(), Symbols.symbol_function( $sym58$VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rc_state$.getGlobalValue(), Symbols.symbol_function( $sym67$RC_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list68 );
    Structures.def_csetf( $sym69$RC_STATE_ID, $sym70$_CSETF_RC_STATE_ID );
    Structures.def_csetf( $sym71$RC_STATE_TEXT, $sym72$_CSETF_RC_STATE_TEXT );
    Structures.def_csetf( $sym73$RC_STATE_INTERACTION, $sym74$_CSETF_RC_STATE_INTERACTION );
    Structures.def_csetf( $sym75$RC_STATE_IF_SCENARIO, $sym76$_CSETF_RC_STATE_IF_SCENARIO );
    Structures.def_csetf( $sym77$RC_STATE_THEN_SCENARIO, $sym78$_CSETF_RC_STATE_THEN_SCENARIO );
    Structures.def_csetf( $sym79$RC_STATE_LHS, $sym80$_CSETF_RC_STATE_LHS );
    Structures.def_csetf( $sym81$RC_STATE_RHS, $sym82$_CSETF_RC_STATE_RHS );
    Structures.def_csetf( $sym83$RC_STATE_PARSING_MT, $sym84$_CSETF_RC_STATE_PARSING_MT );
    Structures.def_csetf( $sym85$RC_STATE_GENERATION_MT, $sym86$_CSETF_RC_STATE_GENERATION_MT );
    Structures.def_csetf( $sym87$RC_STATE_DOMAIN_MT, $sym88$_CSETF_RC_STATE_DOMAIN_MT );
    Structures.def_csetf( $sym89$RC_STATE_DOMAIN_INTERACTION_MT, $sym90$_CSETF_RC_STATE_DOMAIN_INTERACTION_MT );
    Structures.def_csetf( $sym91$RC_STATE_VAR_MAP, $sym92$_CSETF_RC_STATE_VAR_MAP );
    Structures.def_csetf( $sym93$RC_STATE_EXCEPTIONS, $sym94$_CSETF_RC_STATE_EXCEPTIONS );
    Equality.identity( $sym61$RC_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rc_state$.getGlobalValue(), Symbols.symbol_function( $sym108$VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD ) );
    Structures.register_method( rkf_query_constructor.$rkf_add_object_var_map_entry_method_table$.getGlobalValue(), $dtp_rc_state$.getGlobalValue(), Symbols.symbol_function(
        $sym116$RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_rule_constructor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_rule_constructor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_rule_constructor_file();
  }
  static
  {
    me = new rkf_rule_constructor();
    $rc_lock$ = null;
    $rc_isg$ = null;
    $rc_index$ = null;
    $dtp_rc_lhs$ = null;
    $dtp_rc_rhs$ = null;
    $dtp_rc_state$ = null;
    $str0$Rule_Constructor_Lock = makeString( "Rule Constructor Lock" );
    $sym1$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list2 = ConsesLow.list( makeSymbol( "*RC-LOCK*" ) );
    $sym3$_RC_ISG_ = makeSymbol( "*RC-ISG*" );
    $sym4$_RC_INDEX_ = makeSymbol( "*RC-INDEX*" );
    $sym5$RC_LHS = makeSymbol( "RC-LHS" );
    $sym6$RC_LHS_P = makeSymbol( "RC-LHS-P" );
    $list7 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "NL-SENTENCE" ), makeSymbol( "CONSTRAINTS" ), makeSymbol( "TERMS" ), makeSymbol( "CYCL" ) );
    $list8 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "NL-SENTENCE" ), makeKeyword( "CONSTRAINTS" ), makeKeyword( "TERMS" ), makeKeyword( "CYCL" ) );
    $list9 = ConsesLow.list( makeSymbol( "RC-LHS-ID" ), makeSymbol( "RC-LHS-NL-SENTENCE" ), makeSymbol( "RC-LHS-CONSTRAINTS" ), makeSymbol( "RC-LHS-TERMS" ), makeSymbol( "RC-LHS-CYCL" ) );
    $list10 = ConsesLow.list( makeSymbol( "_CSETF-RC-LHS-ID" ), makeSymbol( "_CSETF-RC-LHS-NL-SENTENCE" ), makeSymbol( "_CSETF-RC-LHS-CONSTRAINTS" ), makeSymbol( "_CSETF-RC-LHS-TERMS" ), makeSymbol(
        "_CSETF-RC-LHS-CYCL" ) );
    $sym11$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym12$RC_LHS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RC-LHS-PRINT-FUNCTION-TRAMPOLINE" );
    $list13 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RC-LHS-P" ) );
    $sym14$RC_LHS_ID = makeSymbol( "RC-LHS-ID" );
    $sym15$_CSETF_RC_LHS_ID = makeSymbol( "_CSETF-RC-LHS-ID" );
    $sym16$RC_LHS_NL_SENTENCE = makeSymbol( "RC-LHS-NL-SENTENCE" );
    $sym17$_CSETF_RC_LHS_NL_SENTENCE = makeSymbol( "_CSETF-RC-LHS-NL-SENTENCE" );
    $sym18$RC_LHS_CONSTRAINTS = makeSymbol( "RC-LHS-CONSTRAINTS" );
    $sym19$_CSETF_RC_LHS_CONSTRAINTS = makeSymbol( "_CSETF-RC-LHS-CONSTRAINTS" );
    $sym20$RC_LHS_TERMS = makeSymbol( "RC-LHS-TERMS" );
    $sym21$_CSETF_RC_LHS_TERMS = makeSymbol( "_CSETF-RC-LHS-TERMS" );
    $sym22$RC_LHS_CYCL = makeSymbol( "RC-LHS-CYCL" );
    $sym23$_CSETF_RC_LHS_CYCL = makeSymbol( "_CSETF-RC-LHS-CYCL" );
    $kw24$ID = makeKeyword( "ID" );
    $kw25$NL_SENTENCE = makeKeyword( "NL-SENTENCE" );
    $kw26$CONSTRAINTS = makeKeyword( "CONSTRAINTS" );
    $kw27$TERMS = makeKeyword( "TERMS" );
    $kw28$CYCL = makeKeyword( "CYCL" );
    $str29$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw30$BEGIN = makeKeyword( "BEGIN" );
    $sym31$MAKE_RC_LHS = makeSymbol( "MAKE-RC-LHS" );
    $kw32$SLOT = makeKeyword( "SLOT" );
    $kw33$END = makeKeyword( "END" );
    $sym34$VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RC-LHS-METHOD" );
    $sym35$STRINGP = makeSymbol( "STRINGP" );
    $sym36$LISTP = makeSymbol( "LISTP" );
    $sym37$POSSIBLY_SENTENCE_P = makeSymbol( "POSSIBLY-SENTENCE-P" );
    $sym38$RC_RHS = makeSymbol( "RC-RHS" );
    $sym39$RC_RHS_P = makeSymbol( "RC-RHS-P" );
    $list40 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "NL-SENTENCE" ), makeSymbol( "CONSTRAINTS" ), makeSymbol( "EXISTENTIAL-TERM" ), makeSymbol( "CYCL" ) );
    $list41 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "NL-SENTENCE" ), makeKeyword( "CONSTRAINTS" ), makeKeyword( "EXISTENTIAL-TERM" ), makeKeyword( "CYCL" ) );
    $list42 = ConsesLow.list( makeSymbol( "RC-RHS-ID" ), makeSymbol( "RC-RHS-NL-SENTENCE" ), makeSymbol( "RC-RHS-CONSTRAINTS" ), makeSymbol( "RC-RHS-EXISTENTIAL-TERM" ), makeSymbol( "RC-RHS-CYCL" ) );
    $list43 = ConsesLow.list( makeSymbol( "_CSETF-RC-RHS-ID" ), makeSymbol( "_CSETF-RC-RHS-NL-SENTENCE" ), makeSymbol( "_CSETF-RC-RHS-CONSTRAINTS" ), makeSymbol( "_CSETF-RC-RHS-EXISTENTIAL-TERM" ), makeSymbol(
        "_CSETF-RC-RHS-CYCL" ) );
    $sym44$RC_RHS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RC-RHS-PRINT-FUNCTION-TRAMPOLINE" );
    $list45 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RC-RHS-P" ) );
    $sym46$RC_RHS_ID = makeSymbol( "RC-RHS-ID" );
    $sym47$_CSETF_RC_RHS_ID = makeSymbol( "_CSETF-RC-RHS-ID" );
    $sym48$RC_RHS_NL_SENTENCE = makeSymbol( "RC-RHS-NL-SENTENCE" );
    $sym49$_CSETF_RC_RHS_NL_SENTENCE = makeSymbol( "_CSETF-RC-RHS-NL-SENTENCE" );
    $sym50$RC_RHS_CONSTRAINTS = makeSymbol( "RC-RHS-CONSTRAINTS" );
    $sym51$_CSETF_RC_RHS_CONSTRAINTS = makeSymbol( "_CSETF-RC-RHS-CONSTRAINTS" );
    $sym52$RC_RHS_EXISTENTIAL_TERM = makeSymbol( "RC-RHS-EXISTENTIAL-TERM" );
    $sym53$_CSETF_RC_RHS_EXISTENTIAL_TERM = makeSymbol( "_CSETF-RC-RHS-EXISTENTIAL-TERM" );
    $sym54$RC_RHS_CYCL = makeSymbol( "RC-RHS-CYCL" );
    $sym55$_CSETF_RC_RHS_CYCL = makeSymbol( "_CSETF-RC-RHS-CYCL" );
    $kw56$EXISTENTIAL_TERM = makeKeyword( "EXISTENTIAL-TERM" );
    $sym57$MAKE_RC_RHS = makeSymbol( "MAKE-RC-RHS" );
    $sym58$VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RC-RHS-METHOD" );
    $sym59$SM_CONSTRAINT_RECORD_P = makeSymbol( "SM-CONSTRAINT-RECORD-P" );
    $sym60$SM_INDEXICAL_RECORD_P = makeSymbol( "SM-INDEXICAL-RECORD-P" );
    $sym61$RC_STATE = makeSymbol( "RC-STATE" );
    $sym62$RC_STATE_P = makeSymbol( "RC-STATE-P" );
    $list63 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "TEXT" ), makeSymbol( "INTERACTION" ), makeSymbol( "IF-SCENARIO" ), makeSymbol( "THEN-SCENARIO" ), makeSymbol( "LHS" ), makeSymbol(
        "RHS" ), makeSymbol( "PARSING-MT" ), makeSymbol( "GENERATION-MT" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "DOMAIN-INTERACTION-MT" ), makeSymbol( "VAR-MAP" ), makeSymbol( "EXCEPTIONS" )
    } );
    $list64 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "TEXT" ), makeKeyword( "INTERACTION" ), makeKeyword( "IF-SCENARIO" ), makeKeyword( "THEN-SCENARIO" ), makeKeyword( "LHS" ), makeKeyword(
        "RHS" ), makeKeyword( "PARSING-MT" ), makeKeyword( "GENERATION-MT" ), makeKeyword( "DOMAIN-MT" ), makeKeyword( "DOMAIN-INTERACTION-MT" ), makeKeyword( "VAR-MAP" ), makeKeyword( "EXCEPTIONS" )
    } );
    $list65 = ConsesLow.list( new SubLObject[] { makeSymbol( "RC-STATE-ID" ), makeSymbol( "RC-STATE-TEXT" ), makeSymbol( "RC-STATE-INTERACTION" ), makeSymbol( "RC-STATE-IF-SCENARIO" ), makeSymbol(
        "RC-STATE-THEN-SCENARIO" ), makeSymbol( "RC-STATE-LHS" ), makeSymbol( "RC-STATE-RHS" ), makeSymbol( "RC-STATE-PARSING-MT" ), makeSymbol( "RC-STATE-GENERATION-MT" ), makeSymbol( "RC-STATE-DOMAIN-MT" ), makeSymbol(
            "RC-STATE-DOMAIN-INTERACTION-MT" ), makeSymbol( "RC-STATE-VAR-MAP" ), makeSymbol( "RC-STATE-EXCEPTIONS" )
    } );
    $list66 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-RC-STATE-ID" ), makeSymbol( "_CSETF-RC-STATE-TEXT" ), makeSymbol( "_CSETF-RC-STATE-INTERACTION" ), makeSymbol( "_CSETF-RC-STATE-IF-SCENARIO" ),
      makeSymbol( "_CSETF-RC-STATE-THEN-SCENARIO" ), makeSymbol( "_CSETF-RC-STATE-LHS" ), makeSymbol( "_CSETF-RC-STATE-RHS" ), makeSymbol( "_CSETF-RC-STATE-PARSING-MT" ), makeSymbol( "_CSETF-RC-STATE-GENERATION-MT" ),
      makeSymbol( "_CSETF-RC-STATE-DOMAIN-MT" ), makeSymbol( "_CSETF-RC-STATE-DOMAIN-INTERACTION-MT" ), makeSymbol( "_CSETF-RC-STATE-VAR-MAP" ), makeSymbol( "_CSETF-RC-STATE-EXCEPTIONS" )
    } );
    $sym67$RC_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RC-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list68 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RC-STATE-P" ) );
    $sym69$RC_STATE_ID = makeSymbol( "RC-STATE-ID" );
    $sym70$_CSETF_RC_STATE_ID = makeSymbol( "_CSETF-RC-STATE-ID" );
    $sym71$RC_STATE_TEXT = makeSymbol( "RC-STATE-TEXT" );
    $sym72$_CSETF_RC_STATE_TEXT = makeSymbol( "_CSETF-RC-STATE-TEXT" );
    $sym73$RC_STATE_INTERACTION = makeSymbol( "RC-STATE-INTERACTION" );
    $sym74$_CSETF_RC_STATE_INTERACTION = makeSymbol( "_CSETF-RC-STATE-INTERACTION" );
    $sym75$RC_STATE_IF_SCENARIO = makeSymbol( "RC-STATE-IF-SCENARIO" );
    $sym76$_CSETF_RC_STATE_IF_SCENARIO = makeSymbol( "_CSETF-RC-STATE-IF-SCENARIO" );
    $sym77$RC_STATE_THEN_SCENARIO = makeSymbol( "RC-STATE-THEN-SCENARIO" );
    $sym78$_CSETF_RC_STATE_THEN_SCENARIO = makeSymbol( "_CSETF-RC-STATE-THEN-SCENARIO" );
    $sym79$RC_STATE_LHS = makeSymbol( "RC-STATE-LHS" );
    $sym80$_CSETF_RC_STATE_LHS = makeSymbol( "_CSETF-RC-STATE-LHS" );
    $sym81$RC_STATE_RHS = makeSymbol( "RC-STATE-RHS" );
    $sym82$_CSETF_RC_STATE_RHS = makeSymbol( "_CSETF-RC-STATE-RHS" );
    $sym83$RC_STATE_PARSING_MT = makeSymbol( "RC-STATE-PARSING-MT" );
    $sym84$_CSETF_RC_STATE_PARSING_MT = makeSymbol( "_CSETF-RC-STATE-PARSING-MT" );
    $sym85$RC_STATE_GENERATION_MT = makeSymbol( "RC-STATE-GENERATION-MT" );
    $sym86$_CSETF_RC_STATE_GENERATION_MT = makeSymbol( "_CSETF-RC-STATE-GENERATION-MT" );
    $sym87$RC_STATE_DOMAIN_MT = makeSymbol( "RC-STATE-DOMAIN-MT" );
    $sym88$_CSETF_RC_STATE_DOMAIN_MT = makeSymbol( "_CSETF-RC-STATE-DOMAIN-MT" );
    $sym89$RC_STATE_DOMAIN_INTERACTION_MT = makeSymbol( "RC-STATE-DOMAIN-INTERACTION-MT" );
    $sym90$_CSETF_RC_STATE_DOMAIN_INTERACTION_MT = makeSymbol( "_CSETF-RC-STATE-DOMAIN-INTERACTION-MT" );
    $sym91$RC_STATE_VAR_MAP = makeSymbol( "RC-STATE-VAR-MAP" );
    $sym92$_CSETF_RC_STATE_VAR_MAP = makeSymbol( "_CSETF-RC-STATE-VAR-MAP" );
    $sym93$RC_STATE_EXCEPTIONS = makeSymbol( "RC-STATE-EXCEPTIONS" );
    $sym94$_CSETF_RC_STATE_EXCEPTIONS = makeSymbol( "_CSETF-RC-STATE-EXCEPTIONS" );
    $kw95$TEXT = makeKeyword( "TEXT" );
    $kw96$INTERACTION = makeKeyword( "INTERACTION" );
    $kw97$IF_SCENARIO = makeKeyword( "IF-SCENARIO" );
    $kw98$THEN_SCENARIO = makeKeyword( "THEN-SCENARIO" );
    $kw99$LHS = makeKeyword( "LHS" );
    $kw100$RHS = makeKeyword( "RHS" );
    $kw101$PARSING_MT = makeKeyword( "PARSING-MT" );
    $kw102$GENERATION_MT = makeKeyword( "GENERATION-MT" );
    $kw103$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $kw104$DOMAIN_INTERACTION_MT = makeKeyword( "DOMAIN-INTERACTION-MT" );
    $kw105$VAR_MAP = makeKeyword( "VAR-MAP" );
    $kw106$EXCEPTIONS = makeKeyword( "EXCEPTIONS" );
    $sym107$MAKE_RC_STATE = makeSymbol( "MAKE-RC-STATE" );
    $sym108$VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RC-STATE-METHOD" );
    $sym109$USER_INTERACTION_P = makeSymbol( "USER-INTERACTION-P" );
    $sym110$SM_SCENARIO_P = makeSymbol( "SM-SCENARIO-P" );
    $sym111$HLMT_P = makeSymbol( "HLMT-P" );
    $sym112$DOUBLETON_ = makeSymbol( "DOUBLETON?" );
    $str113$If_ = makeString( "If " );
    $str114$__then_ = makeString( ", then " );
    $kw115$INSERT_EXPLICIT_TYPE_CONSTRAINTS = makeKeyword( "INSERT-EXPLICIT-TYPE-CONSTRAINTS" );
    $sym116$RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD = makeSymbol( "RKF-ADD-OBJECT-VAR-MAP-ENTRY-RC-STATE-METHOD" );
    $const117$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const118$exceptWhen = constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) );
    $const119$exceptFor = constant_handles.reader_make_constant_shell( makeString( "exceptFor" ) );
    $list120 = ConsesLow.list( makeSymbol( "EL-VARIABLE" ), makeSymbol( "INDEXICAL" ) );
    $str121$Exceptions = makeString( "Exceptions" );
    $str122$Then_Clause = makeString( "Then-Clause" );
    $sym123$SECOND = makeSymbol( "SECOND" );
    $list124 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "INDEXICAL-RECORD" ) );
    $sym125$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym126$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
  }

  public static final class $rc_lhs_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $nl_sentence;
    public SubLObject $constraints;
    public SubLObject $terms;
    public SubLObject $cycl;
    private static final SubLStructDeclNative structDecl;

    public $rc_lhs_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$nl_sentence = CommonSymbols.NIL;
      this.$constraints = CommonSymbols.NIL;
      this.$terms = CommonSymbols.NIL;
      this.$cycl = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rc_lhs_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$nl_sentence;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$constraints;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$terms;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$cycl;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$nl_sentence = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$constraints = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$terms = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$cycl = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rc_lhs_native.class, $sym5$RC_LHS, $sym6$RC_LHS_P, $list7, $list8, new String[] { "$id", "$nl_sentence", "$constraints", "$terms", "$cycl"
      }, $list9, $list10, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $rc_lhs_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rc_lhs_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RC-LHS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rc_lhs_p( arg1 );
    }
  }

  public static final class $rc_rhs_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $nl_sentence;
    public SubLObject $constraints;
    public SubLObject $existential_term;
    public SubLObject $cycl;
    private static final SubLStructDeclNative structDecl;

    public $rc_rhs_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$nl_sentence = CommonSymbols.NIL;
      this.$constraints = CommonSymbols.NIL;
      this.$existential_term = CommonSymbols.NIL;
      this.$cycl = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rc_rhs_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$nl_sentence;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$constraints;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$existential_term;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$cycl;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$nl_sentence = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$constraints = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$existential_term = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$cycl = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rc_rhs_native.class, $sym38$RC_RHS, $sym39$RC_RHS_P, $list40, $list41, new String[] { "$id", "$nl_sentence", "$constraints", "$existential_term", "$cycl"
      }, $list42, $list43, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $rc_rhs_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rc_rhs_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RC-RHS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rc_rhs_p( arg1 );
    }
  }

  public static final class $rc_state_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $text;
    public SubLObject $interaction;
    public SubLObject $if_scenario;
    public SubLObject $then_scenario;
    public SubLObject $lhs;
    public SubLObject $rhs;
    public SubLObject $parsing_mt;
    public SubLObject $generation_mt;
    public SubLObject $domain_mt;
    public SubLObject $domain_interaction_mt;
    public SubLObject $var_map;
    public SubLObject $exceptions;
    private static final SubLStructDeclNative structDecl;

    public $rc_state_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$text = CommonSymbols.NIL;
      this.$interaction = CommonSymbols.NIL;
      this.$if_scenario = CommonSymbols.NIL;
      this.$then_scenario = CommonSymbols.NIL;
      this.$lhs = CommonSymbols.NIL;
      this.$rhs = CommonSymbols.NIL;
      this.$parsing_mt = CommonSymbols.NIL;
      this.$generation_mt = CommonSymbols.NIL;
      this.$domain_mt = CommonSymbols.NIL;
      this.$domain_interaction_mt = CommonSymbols.NIL;
      this.$var_map = CommonSymbols.NIL;
      this.$exceptions = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rc_state_native.structDecl;
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
      return this.$interaction;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$if_scenario;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$then_scenario;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$lhs;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$rhs;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$parsing_mt;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$generation_mt;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$domain_mt;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$domain_interaction_mt;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$var_map;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$exceptions;
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
      return this.$interaction = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$if_scenario = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$then_scenario = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$lhs = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$rhs = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$parsing_mt = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$generation_mt = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$domain_mt = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$domain_interaction_mt = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$var_map = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$exceptions = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rc_state_native.class, $sym61$RC_STATE, $sym62$RC_STATE_P, $list63, $list64, new String[] { "$id", "$text", "$interaction", "$if_scenario", "$then_scenario", "$lhs",
        "$rhs", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt", "$var_map", "$exceptions"
      }, $list65, $list66, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $rc_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rc_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RC-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rc_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 429 ms
 * 
 */