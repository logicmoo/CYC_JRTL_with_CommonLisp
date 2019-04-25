package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tva_strategy
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.tva_strategy";
  public static final String myFingerPrint = "dae7ebd1a5a8cede2b0f7cea2939fa0703edf030a516f70b5bdc89beef827926";
  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLSymbol $dtp_tva_strategy$;
  private static final SubLSymbol $sym0$TVA_STRATEGY;
  private static final SubLSymbol $sym1$TVA_STRATEGY_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_TVA_STRATEGY;
  private static final SubLSymbol $sym7$TVA_STRATEGY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$TVA_STRAT_INVERSE_MODE_P;
  private static final SubLSymbol $sym10$_CSETF_TVA_STRAT_INVERSE_MODE_P;
  private static final SubLSymbol $sym11$TVA_STRAT_ARGNUMS_UNIFIED;
  private static final SubLSymbol $sym12$_CSETF_TVA_STRAT_ARGNUMS_UNIFIED;
  private static final SubLSymbol $sym13$TVA_STRAT_ARGNUMS_REMAINING;
  private static final SubLSymbol $sym14$_CSETF_TVA_STRAT_ARGNUMS_REMAINING;
  private static final SubLSymbol $sym15$TVA_STRAT_TACTICS;
  private static final SubLSymbol $sym16$_CSETF_TVA_STRAT_TACTICS;
  private static final SubLSymbol $sym17$TVA_STRAT_TACTICS_CONSIDERED;
  private static final SubLSymbol $sym18$_CSETF_TVA_STRAT_TACTICS_CONSIDERED;
  private static final SubLSymbol $kw19$INVERSE_MODE_P;
  private static final SubLSymbol $kw20$ARGNUMS_UNIFIED;
  private static final SubLSymbol $kw21$ARGNUMS_REMAINING;
  private static final SubLSymbol $kw22$TACTICS;
  private static final SubLSymbol $kw23$TACTICS_CONSIDERED;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_TVA_STRATEGY;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_TVA_STRATEGY_METHOD;
  private static final SubLString $str30$__Strategy____a__;
  private static final SubLString $str31$Strategy_Inverse_Mode_____a__;
  private static final SubLString $str32$Argnums_Unified___________a__;
  private static final SubLString $str33$Argnums_Remaining_________a__;
  private static final SubLString $str34$Tactics_Considered________a____;
  private static final SubLString $str35$Strategy_Tactic__a___a__;
  private static final SubLString $str36$____;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$CDOLIST;
  private static final SubLSymbol $sym39$STRATEGY_ARGNUMS_REMAINING;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw43$DONE;
  private static final SubLSymbol $sym44$CSOME;
  private static final SubLSymbol $sym45$STRATEGY_TACTICS;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$CDR;
  private static final SubLSymbol $sym48$MEMBER;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$SUBSTRATEGY;
  private static final SubLSymbol $sym51$CDO;
  private static final SubLSymbol $sym52$CAR;
  private static final SubLSymbol $sym53$COR;
  private static final SubLSymbol $sym54$NULL;
  private static final SubLSymbol $sym55$PUNLESS;
  private static final SubLSymbol $sym56$STRATEGY_CONSIDERED_TACTIC_;
  private static final SubLSymbol $sym57$STRATEGY_UNIFIED_TACTIC_ARGNUM_;
  private static final SubLSymbol $sym58$NOTE_STRATEGY_CONSIDERED_TACTIC;
  private static final SubLSymbol $sym59$CLET;
  private static final SubLSymbol $sym60$TVA_TACTIC_ARGNUM_TO_STRATEGY_ARGNUM;
  private static final SubLSymbol $sym61$STRATEGY_INVERSE_MODE_P;
  private static final SubLSymbol $kw62$LOOKUP;
  private static final SubLSymbol $kw63$PREDICATE_EXTENT;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLObject $const66$transitiveViaArg;
  private static final SubLObject $const67$transitiveViaArgInverse;
  private static final SubLSymbol $kw68$GAF;
  private static final SubLSymbol $kw69$TRUE;
  private static final SubLSymbol $sym70$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$DO_HASH_TABLE;
  private static final SubLObject $const73$genlPreds;
  private static final SubLSymbol $kw74$DEPTH;
  private static final SubLSymbol $kw75$STACK;
  private static final SubLSymbol $kw76$QUEUE;
  private static final SubLSymbol $sym77$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw78$ERROR;
  private static final SubLString $str79$_A_is_not_a__A;
  private static final SubLSymbol $sym80$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw81$CERROR;
  private static final SubLString $str82$continue_anyway;
  private static final SubLSymbol $kw83$WARN;
  private static final SubLString $str84$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str85$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str86$attempting_to_bind_direction_link;
  private static final SubLString $str87$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw88$DEPTH_FIRST;

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject tva_strategy_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_tva_strategy( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject tva_strategy_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $tva_strategy_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject tva_strat_inverse_mode_p(final SubLObject v_object)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject tva_strat_argnums_unified(final SubLObject v_object)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject tva_strat_argnums_remaining(final SubLObject v_object)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject tva_strat_tactics(final SubLObject v_object)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject tva_strat_tactics_considered(final SubLObject v_object)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject _csetf_tva_strat_inverse_mode_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject _csetf_tva_strat_argnums_unified(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject _csetf_tva_strat_argnums_remaining(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject _csetf_tva_strat_tactics(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject _csetf_tva_strat_tactics_considered(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tva_strategy_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject make_tva_strategy(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $tva_strategy_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$INVERSE_MODE_P ) )
      {
        _csetf_tva_strat_inverse_mode_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$ARGNUMS_UNIFIED ) )
      {
        _csetf_tva_strat_argnums_unified( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$ARGNUMS_REMAINING ) )
      {
        _csetf_tva_strat_argnums_remaining( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$TACTICS ) )
      {
        _csetf_tva_strat_tactics( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$TACTICS_CONSIDERED ) )
      {
        _csetf_tva_strat_tactics_considered( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject visit_defstruct_tva_strategy(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_TVA_STRATEGY, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw19$INVERSE_MODE_P, tva_strat_inverse_mode_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw20$ARGNUMS_UNIFIED, tva_strat_argnums_unified( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$ARGNUMS_REMAINING, tva_strat_argnums_remaining( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$TACTICS, tva_strat_tactics( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$TACTICS_CONSIDERED, tva_strat_tactics_considered( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_TVA_STRATEGY, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 903L)
  public static SubLObject visit_defstruct_object_tva_strategy_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_tva_strategy( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 1094L)
  public static SubLObject print_tva_strategy(final SubLObject v_tva_strategy, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      show_tva_strategy( v_tva_strategy, stream );
    }
    else if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_tva_strategy, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_tva_strategy, T, NIL );
      print_macros.print_unreadable_object_postamble( stream, v_tva_strategy, T, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 1335L)
  public static SubLObject show_tva_strategy(final SubLObject strategy, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    PrintLow.format( stream, $str30$__Strategy____a__, strategy );
    PrintLow.format( stream, $str31$Strategy_Inverse_Mode_____a__, tva_strat_inverse_mode_p( strategy ) );
    PrintLow.format( stream, $str32$Argnums_Unified___________a__, tva_strat_argnums_unified( strategy ) );
    PrintLow.format( stream, $str33$Argnums_Remaining_________a__, tva_strat_argnums_remaining( strategy ) );
    PrintLow.format( stream, $str34$Tactics_Considered________a____, tva_strat_tactics_considered( strategy ) );
    SubLObject list_var = NIL;
    SubLObject tactic = NIL;
    SubLObject num = NIL;
    list_var = tva_strat_tactics( strategy );
    tactic = list_var.first();
    for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), tactic = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
    {
      PrintLow.format( stream, $str35$Strategy_Tactic__a___a__, num, tactic );
      tva_tactic.show_tva_tactic( tactic, stream );
      PrintLow.format( stream, $str36$____ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2002L)
  public static SubLObject new_tacticless_strategy()
  {
    return make_tva_strategy( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2093L)
  public static SubLObject new_strategy_with_tactics(final SubLObject tactics)
  {
    final SubLObject strategy = make_tva_strategy( UNPROVIDED );
    _csetf_tva_strat_tactics( strategy, tactics );
    _csetf_tva_strat_argnums_remaining( strategy, tva_inference.tva_term_argnums() );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2329L)
  public static SubLObject strategy_inverse_mode_p(final SubLObject strategy)
  {
    return tva_strat_inverse_mode_p( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2450L)
  public static SubLObject strategy_tactics(final SubLObject strategy)
  {
    return tva_strat_tactics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2533L)
  public static SubLObject strategy_considered_tactics(final SubLObject strategy)
  {
    return tva_strat_tactics_considered( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2638L)
  public static SubLObject strategy_argnums_unified(final SubLObject strategy)
  {
    return tva_strat_argnums_unified( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2737L)
  public static SubLObject strategy_argnums_remaining(final SubLObject strategy)
  {
    return tva_strat_argnums_remaining( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 2840L)
  public static SubLObject do_strategy_remaining_argnums(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argnum_var = NIL;
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    strategy = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym38$CDOLIST, ConsesLow.list( argnum_var, ConsesLow.list( $sym39$STRATEGY_ARGNUMS_REMAINING, strategy ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 3103L)
  public static SubLObject do_strategy_tactics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tactic_var = NIL;
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    tactic_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    strategy = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list40 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list40 );
      if( NIL == conses_high.member( current_$1, $list41, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw42$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw43$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym44$CSOME, ConsesLow.list( tactic_var, ConsesLow.list( $sym45$STRATEGY_TACTICS, strategy ), done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 3350L)
  public static SubLObject do_strategy_tactics_after_tactic(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tactic_var = NIL;
    SubLObject start_tactic = NIL;
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    tactic_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    start_tactic = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    strategy = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list46 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list46 );
      if( NIL == conses_high.member( current_$2, $list41, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw42$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw43$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym44$CSOME, ConsesLow.list( tactic_var, ConsesLow.list( $sym47$CDR, ConsesLow.list( $sym48$MEMBER, start_tactic, ConsesLow.list( $sym45$STRATEGY_TACTICS, strategy ) ) ), done ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 3569L)
  public static SubLObject do_strategy_remaining_tactics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tactic_var = NIL;
    SubLObject strategy_argnum_var = NIL;
    SubLObject strategy = NIL;
    SubLObject doneP_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    tactic_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    strategy_argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    strategy = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    doneP_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject substrategy = $sym50$SUBSTRATEGY;
      return ConsesLow.list( $sym51$CDO, ConsesLow.list( ConsesLow.list( substrategy, ConsesLow.list( $sym45$STRATEGY_TACTICS, strategy ), ConsesLow.list( $sym47$CDR, substrategy ) ), ConsesLow.list( tactic_var,
          ConsesLow.list( $sym52$CAR, substrategy ), ConsesLow.list( $sym52$CAR, substrategy ) ) ), ConsesLow.list( ConsesLow.list( $sym53$COR, ConsesLow.list( $sym54$NULL, substrategy ), doneP_var ) ), ConsesLow.list(
              $sym55$PUNLESS, ConsesLow.list( $sym53$COR, ConsesLow.list( $sym56$STRATEGY_CONSIDERED_TACTIC_, strategy, tactic_var ), ConsesLow.list( $sym57$STRATEGY_UNIFIED_TACTIC_ARGNUM_, strategy, tactic_var ) ),
              ConsesLow.list( $sym58$NOTE_STRATEGY_CONSIDERED_TACTIC, strategy, tactic_var ), ConsesLow.listS( $sym59$CLET, ConsesLow.list( ConsesLow.list( strategy_argnum_var, ConsesLow.list(
                  $sym60$TVA_TACTIC_ARGNUM_TO_STRATEGY_ARGNUM, tactic_var, ConsesLow.list( $sym61$STRATEGY_INVERSE_MODE_P, strategy ) ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 4569L)
  public static SubLObject tva_strategy_inverse_mode_p(final SubLObject strategy)
  {
    return strategy_inverse_mode_p( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 4683L)
  public static SubLObject tva_strategy_initial_tactic(final SubLObject strategy)
  {
    return strategy_tactics( strategy ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 4786L)
  public static SubLObject tva_strategy_tacticlessP(final SubLObject strategy)
  {
    return Types.sublisp_null( strategy_tactics( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 4885L)
  public static SubLObject strategy_considered_tacticP(final SubLObject strategy, final SubLObject tactic)
  {
    return subl_promotions.memberP( tactic, strategy_considered_tactics( strategy ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 5013L)
  public static SubLObject strategy_unified_tactic_argnumP(final SubLObject strategy, final SubLObject tactic)
  {
    return subl_promotions.memberP( tva_tactic.tva_tactic_argnum_to_strategy_argnum( tactic, strategy_inverse_mode_p( strategy ) ), strategy_argnums_unified( strategy ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 5230L)
  public static SubLObject tva_strategy_subsumes_strategy_p(final SubLObject strategy1, final SubLObject strategy2)
  {
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = strategy_tactics( strategy2 );
      SubLObject tactic2 = NIL;
      tactic2 = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        SubLObject subsumedP = NIL;
        if( NIL == subsumedP )
        {
          SubLObject csome_list_var_$3 = strategy_tactics( strategy1 );
          SubLObject tactic3 = NIL;
          tactic3 = csome_list_var_$3.first();
          while ( NIL == subsumedP && NIL != csome_list_var_$3)
          {
            if( NIL != tva_tactic.tva_tactic_subsumes_tactic_p( tactic3, tactic2, UNPROVIDED ) )
            {
              subsumedP = T;
            }
            csome_list_var_$3 = csome_list_var_$3.rest();
            tactic3 = csome_list_var_$3.first();
          }
        }
        if( NIL == subsumedP )
        {
          failP = T;
        }
        csome_list_var = csome_list_var.rest();
        tactic2 = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 5870L)
  public static SubLObject tactic_subsumed_in_strategyP(final SubLObject tactic, final SubLObject strategy)
  {
    SubLObject subsumedP = NIL;
    if( NIL == subsumedP )
    {
      SubLObject csome_list_var = strategy_tactics( strategy );
      SubLObject strat_tactic = NIL;
      strat_tactic = csome_list_var.first();
      while ( NIL == subsumedP && NIL != csome_list_var)
      {
        if( NIL != tva_tactic.tva_tactic_subsumes_tactic_p( strat_tactic, tactic, UNPROVIDED ) )
        {
          subsumedP = T;
        }
        csome_list_var = csome_list_var.rest();
        strat_tactic = csome_list_var.first();
      }
    }
    return subsumedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 6226L)
  public static SubLObject last_tactic_for_argnumP(final SubLObject strategy, final SubLObject tactic)
  {
    final SubLObject inverseP = strategy_inverse_mode_p( strategy );
    final SubLObject argnum = tva_tactic.tva_tactic_argnum_to_strategy_argnum( tactic, inverseP );
    SubLObject found_anotherP = NIL;
    if( argnum.isNumber() && NIL == found_anotherP )
    {
      SubLObject csome_list_var = conses_high.member( tactic, strategy_tactics( strategy ), UNPROVIDED, UNPROVIDED ).rest();
      SubLObject other_tactic = NIL;
      other_tactic = csome_list_var.first();
      while ( NIL == found_anotherP && NIL != csome_list_var)
      {
        final SubLObject other_tactic_argnum = tva_tactic.tva_tactic_argnum_to_strategy_argnum( other_tactic, inverseP );
        if( other_tactic_argnum.isNumber() && other_tactic_argnum.numE( argnum ) )
        {
          found_anotherP = T;
        }
        csome_list_var = csome_list_var.rest();
        other_tactic = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == found_anotherP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 6878L)
  public static SubLObject no_strategy_argnums_remainingP(final SubLObject strategy)
  {
    return Types.sublisp_null( strategy_argnums_remaining( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 7085L)
  public static SubLObject strategy_complete_p(final SubLObject strategy)
  {
    final SubLObject strategy_term_argnums = ConsesLow.append( strategy_argnums_unified( strategy ), strategy_argnums_remaining( strategy ) );
    final SubLObject uncovered_argnums = list_utilities.fast_set_difference( tva_inference.tva_term_argnums(), strategy_term_argnums, UNPROVIDED );
    return Types.sublisp_null( uncovered_argnums );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 7475L)
  public static SubLObject strategy_considered_all_tacticsP(final SubLObject strategy)
  {
    return Equality.eq( Sequences.length( strategy_tactics( strategy ) ), Sequences.length( strategy_considered_tactics( strategy ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 7639L)
  public static SubLObject strategy_unified_all_tva_asent_argsP(final SubLObject strategy)
  {
    return Types.sublisp_null( list_utilities.fast_set_difference( tva_inference.tva_term_argnums(), strategy_argnums_unified( strategy ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 7804L)
  public static SubLObject arg_matching_tactics_remain_in_strategyP(final SubLObject strategy)
  {
    final SubLObject tactics_used = strategy_considered_tactics( strategy );
    final SubLObject argnums_unified = strategy_argnums_unified( strategy );
    final SubLObject argnums_remaining = strategy_argnums_remaining( strategy );
    SubLObject foundP = NIL;
    SubLObject substrategy = NIL;
    SubLObject tactic = NIL;
    substrategy = strategy_tactics( strategy );
    tactic = substrategy.first();
    while ( NIL != substrategy && NIL == foundP)
    {
      if( NIL == strategy_considered_tacticP( strategy, tactic ) && NIL == strategy_unified_tactic_argnumP( strategy, tactic ) )
      {
        note_strategy_considered_tactic( strategy, tactic );
        final SubLObject argnum = tva_tactic.tva_tactic_argnum_to_strategy_argnum( tactic, strategy_inverse_mode_p( strategy ) );
        if( NIL != tva_tactic.tva_lookup_tactic_p( tactic ) )
        {
          foundP = T;
        }
      }
      substrategy = substrategy.rest();
      tactic = substrategy.first();
    }
    revert_strategy_argnums_and_tactics( strategy, argnums_unified, argnums_remaining, tactics_used );
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 8633L)
  public static SubLObject set_strategy_inverse_mode(final SubLObject strategy, final SubLObject inverse_modeP)
  {
    _csetf_tva_strat_inverse_mode_p( strategy, inverse_modeP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 8787L)
  public static SubLObject set_strategy_argnums_unified(final SubLObject strategy, final SubLObject argnums_unified)
  {
    _csetf_tva_strat_argnums_unified( strategy, argnums_unified );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 8936L)
  public static SubLObject set_strategy_argnums_remaining(final SubLObject strategy, final SubLObject argnums_remaining)
  {
    _csetf_tva_strat_argnums_remaining( strategy, argnums_remaining );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 9093L)
  public static SubLObject remove_tva_strategy_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    _csetf_tva_strat_tactics( strategy, Sequences.remove( tactic, tva_strat_tactics( strategy ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 9254L)
  public static SubLObject set_strategy_tactics(final SubLObject strategy, final SubLObject tactics)
  {
    _csetf_tva_strat_tactics( strategy, tactics );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 9371L)
  public static SubLObject push_tva_tactic_onto_strategy(final SubLObject tactic, final SubLObject strategy)
  {
    _csetf_tva_strat_tactics( strategy, ConsesLow.cons( tactic, tva_strat_tactics( strategy ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 9497L)
  public static SubLObject revert_strategy_argnums_and_tactics(final SubLObject strategy, final SubLObject unified, final SubLObject remaining, final SubLObject tactics_considered)
  {
    _csetf_tva_strat_argnums_unified( strategy, unified );
    _csetf_tva_strat_argnums_remaining( strategy, remaining );
    _csetf_tva_strat_tactics_considered( strategy, tactics_considered );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 9796L)
  public static SubLObject note_strategy_considered_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    _csetf_tva_strat_tactics_considered( strategy, ConsesLow.cons( tactic, tva_strat_tactics_considered( strategy ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 9933L)
  public static SubLObject add_strategy_argnum_to_remaining(final SubLObject strategy, final SubLObject argnum)
  {
    _csetf_tva_strat_argnums_remaining( strategy, ConsesLow.cons( argnum, tva_strat_argnums_remaining( strategy ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 10070L)
  public static SubLObject delete_strategy_argnum_from_remaining(final SubLObject strategy, final SubLObject argnum)
  {
    _csetf_tva_strat_argnums_remaining( strategy, Sequences.remove( argnum, tva_strat_argnums_remaining( strategy ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 10263L)
  public static SubLObject add_strategy_argnum_to_unified(final SubLObject strategy, final SubLObject argnum)
  {
    _csetf_tva_strat_argnums_unified( strategy, ConsesLow.cons( argnum, tva_strat_argnums_unified( strategy ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 10396L)
  public static SubLObject delete_strategy_argnum_from_unified(final SubLObject strategy, final SubLObject argnum)
  {
    _csetf_tva_strat_argnums_unified( strategy, Sequences.remove( argnum, tva_strat_argnums_unified( strategy ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 10584L)
  public static SubLObject note_strategy_argnum_unified(final SubLObject strategy, final SubLObject strategy_argnum)
  {
    delete_strategy_argnum_from_remaining( strategy, strategy_argnum );
    add_strategy_argnum_to_unified( strategy, strategy_argnum );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 10797L)
  public static SubLObject note_strategy_argnum_remaining(final SubLObject strategy, final SubLObject strategy_argnum)
  {
    delete_strategy_argnum_from_unified( strategy, strategy_argnum );
    add_strategy_argnum_to_remaining( strategy, strategy_argnum );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 11012L)
  public static SubLObject remove_tactics_subsumed_by_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    SubLObject result = NIL;
    SubLObject csome_list_var = strategy_tactics( strategy );
    SubLObject strat_tactic = NIL;
    strat_tactic = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      if( NIL == tva_tactic.tva_tactic_subsumes_tactic_p( tactic, strat_tactic, UNPROVIDED ) )
      {
        result = ConsesLow.cons( strat_tactic, result );
      }
      csome_list_var = csome_list_var.rest();
      strat_tactic = csome_list_var.first();
    }
    set_strategy_tactics( strategy, Sequences.nreverse( result ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 11312L)
  public static SubLObject remove_tactics_for_matching_args(final SubLObject strategy, final SubLObject sentence)
  {
    final SubLObject inverseP = strategy_inverse_mode_p( strategy );
    SubLObject cdolist_list_var = strategy_argnums_remaining( strategy );
    SubLObject argnum = NIL;
    argnum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gather_argnum = tva_utilities.determine_tva_gather_argnum( argnum, inverseP );
      if( tva_inference.tva_asent_arg( argnum ).eql( cycl_utilities.atomic_sentence_arg( sentence, gather_argnum, UNPROVIDED ) ) )
      {
        note_strategy_argnum_unified( strategy, argnum );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argnum = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 11797L)
  public static SubLObject copy_strategy_possibly_flip_argnums(final SubLObject strategy, final SubLObject pred, final SubLObject flipP)
  {
    final SubLObject new_strategy = new_tacticless_strategy();
    SubLObject tactics = NIL;
    SubLObject csome_list_var = strategy_tactics( strategy );
    SubLObject old_tactic = NIL;
    old_tactic = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      final SubLObject new_tactic = tva_tactic.copy_tva_tactic( old_tactic, flipP );
      tva_tactic.set_tva_tactic_index_pred( new_tactic, pred );
      tactics = ConsesLow.cons( new_tactic, tactics );
      csome_list_var = csome_list_var.rest();
      old_tactic = csome_list_var.first();
    }
    set_strategy_tactics( new_strategy, Sequences.nreverse( tactics ) );
    set_strategy_argnums_unified( new_strategy, NIL );
    set_strategy_argnums_remaining( new_strategy, tva_inference.tva_term_argnums() );
    set_strategy_inverse_mode( new_strategy, sbhl_search_vars.genl_inverse_mode_p() );
    return new_strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 12486L)
  public static SubLObject make_tva_simple_strategy()
  {
    final SubLObject pred = tva_inference.tva_asent_pred();
    SubLObject non_sksi_indexed_args = NIL;
    SubLObject queriable_args = NIL;
    SubLObject nonindexed_args = NIL;
    SubLObject sksi_nonqueriable_args = NIL;
    SubLObject cdolist_list_var = tva_inference.tva_term_argnums();
    SubLObject argnum = NIL;
    argnum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arg = tva_inference.tva_asent_arg( argnum );
      if( NIL != sksi_tva_utilities.sksi_gaf_arg_impossible_p( pred, arg, argnum ) && NIL != forts.fort_p( arg ) )
      {
        non_sksi_indexed_args = ConsesLow.cons( tva_tactic.new_tva_tactic( NIL, pred, NIL, argnum, arg, NIL, $kw62$LOOKUP ), non_sksi_indexed_args );
      }
      else if( NIL != gt_utilities.gt_term_p( arg ) )
      {
        queriable_args = ConsesLow.cons( tva_tactic.new_tva_tactic( NIL, pred, NIL, argnum, arg, NIL, $kw62$LOOKUP ), queriable_args );
        if( NIL == forts.fort_p( arg ) )
        {
          nonindexed_args = ConsesLow.cons( tva_tactic.new_tva_tactic( NIL, pred, NIL, argnum, arg, NIL, $kw63$PREDICATE_EXTENT ), nonindexed_args );
        }
      }
      else if( NIL == abduction.abduced_term_p( arg ) && NIL != sksi_tva_utilities.sksi_pred_and_relevance_p( pred ) )
      {
        sksi_nonqueriable_args = ConsesLow.cons( tva_tactic.new_tva_tactic( NIL, pred, NIL, argnum, arg, NIL, $kw63$PREDICATE_EXTENT ), sksi_nonqueriable_args );
      }
      else if( NIL == abduction.abduced_term_p( arg ) )
      {
        nonindexed_args = ConsesLow.cons( tva_tactic.new_tva_tactic( NIL, pred, NIL, argnum, arg, NIL, $kw63$PREDICATE_EXTENT ), nonindexed_args );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argnum = cdolist_list_var.first();
    }
    return new_strategy_with_tactics( ConsesLow.nconc( new SubLObject[] { Sequences.nreverse( non_sksi_indexed_args ), Sequences.nreverse( queriable_args ), Sequences.nreverse( nonindexed_args ), Sequences.nreverse(
        sksi_nonqueriable_args )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 14100L)
  public static SubLObject with_new_tva_strategy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject strategy_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    strategy_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym59$CLET, ConsesLow.list( reader.bq_cons( strategy_var, $list65 ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 14323L)
  public static SubLObject make_tva_default_strategy()
  {
    return make_tva_simple_strategy();
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 14436L)
  public static SubLObject insert_new_tactic_into_strategy(final SubLObject tactic, final SubLObject strategy)
  {
    final SubLObject initial_tactic = tva_strategy_initial_tactic( strategy );
    if( NIL != tva_strategy_tacticlessP( strategy ) || NIL != tva_tactic.tva_tacticL( tactic, initial_tactic ) )
    {
      push_tva_tactic_onto_strategy( tactic, strategy );
    }
    else
    {
      SubLObject tail;
      SubLObject next_tactic;
      for( tail = NIL, next_tactic = NIL, tail = strategy_tactics( strategy ), next_tactic = conses_high.second( tail ); NIL != next_tactic && NIL == tva_tactic.tva_tacticL( tactic,
          next_tactic ); next_tactic = conses_high.second( tail ) )
      {
        tail = tail.rest();
      }
      ConsesLow.rplacd( tail, ConsesLow.cons( tactic, tail.rest() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 15249L)
  public static SubLObject remove_lookup_tactic_for_argnum(final SubLObject strategy, final SubLObject argnum)
  {
    final SubLObject inverseP = strategy_inverse_mode_p( strategy );
    final SubLObject gather_argnum = tva_utilities.determine_tva_gather_argnum( argnum, inverseP );
    SubLObject disappearing_tactic = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = strategy_tactics( strategy );
      SubLObject tactic = NIL;
      tactic = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != tva_tactic.tva_lookup_tactic_p( tactic ) )
        {
          if( tva_tactic.tva_tactic_argnum( tactic ).numE( gather_argnum ) )
          {
            disappearing_tactic = tactic;
            doneP = T;
          }
        }
        else
        {
          doneP = T;
        }
        csome_list_var = csome_list_var.rest();
        tactic = csome_list_var.first();
      }
    }
    if( NIL != disappearing_tactic )
    {
      remove_tva_strategy_tactic( strategy, disappearing_tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 16032L)
  public static SubLObject tva_restrategize(final SubLObject pred, final SubLObject strategy, final SubLObject flipP)
  {
    final SubLObject new_strategy = copy_strategy_possibly_flip_argnums( strategy, pred, flipP );
    final SubLObject inverseP = strategy_inverse_mode_p( new_strategy );
    if( NIL != kb_accessors.transitive_predicateP( pred ) )
    {
      if( NIL != subl_promotions.memberP( TWO_INTEGER, tva_inference.tva_term_argnums(), UNPROVIDED, UNPROVIDED ) && NIL != tva_utilities.tva_arg_admittance_okP( pred, $const66$transitiveViaArg, pred, TWO_INTEGER,
          inverseP ) )
      {
        possibly_modify_strategy_tactics( new_strategy, $const66$transitiveViaArg, pred, pred, tva_utilities.determine_tva_gather_argnum( TWO_INTEGER, inverseP ) );
      }
      if( NIL != subl_promotions.memberP( ONE_INTEGER, tva_inference.tva_term_argnums(), UNPROVIDED, UNPROVIDED ) && NIL != tva_utilities.tva_arg_admittance_okP( pred, $const67$transitiveViaArgInverse, pred, ONE_INTEGER,
          inverseP ) )
      {
        possibly_modify_strategy_tactics( new_strategy, $const67$transitiveViaArgInverse, pred, pred, tva_utilities.determine_tva_gather_argnum( ONE_INTEGER, inverseP ) );
      }
    }
    SubLObject csome_list_var = tva_utilities.get_tva_predicates();
    SubLObject tva_pred = NIL;
    tva_pred = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      SubLObject cdolist_list_var = tva_inference.tva_term_argnums();
      SubLObject argnum = NIL;
      argnum = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$4 = tva_utilities.tva_gather_transitive_predicates_for_arg( tva_pred, pred, argnum, inverseP, UNPROVIDED );
        SubLObject trans_pred = NIL;
        trans_pred = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL == tva_utilities.tva_arg_admittance_okP( trans_pred, tva_pred, pred, argnum, inverseP ) )
          {
            return NIL;
          }
          possibly_modify_strategy_tactics( new_strategy, tva_pred, pred, trans_pred, argnum );
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          trans_pred = cdolist_list_var_$4.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum = cdolist_list_var.first();
      }
      csome_list_var = csome_list_var.rest();
      tva_pred = csome_list_var.first();
    }
    return new_strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 17958L)
  public static SubLObject possibly_modify_strategy_tactics(final SubLObject strategy, final SubLObject tva_pred, final SubLObject pred, final SubLObject trans_pred, final SubLObject argnum)
  {
    final SubLObject inverseP = strategy_inverse_mode_p( strategy );
    final SubLObject gather_argnum = tva_utilities.determine_tva_gather_argnum( argnum, inverseP );
    final SubLObject tactic_type = tva_tactic.determine_tva_tactic_type( tva_pred, trans_pred, tva_inference.tva_asent_arg( argnum ), gather_argnum );
    final SubLObject v_term = tva_inference.tva_asent_arg( argnum );
    final SubLObject new_tactic = tva_tactic.new_tva_tactic( tva_pred, pred, trans_pred, gather_argnum, v_term, NIL, tactic_type );
    if( NIL != tactic_type && NIL != tva_pred && NIL == tactic_subsumed_in_strategyP( new_tactic, strategy ) )
    {
      remove_lookup_tactic_for_argnum( strategy, argnum );
      remove_tactics_subsumed_by_tactic( strategy, new_tactic );
      tva_tactic.set_tva_tactic_cost_possible_precomputation( new_tactic, argnum );
      if( NIL != tva_tactic.sufficient_tactic_p( new_tactic ) )
      {
        insert_new_tactic_into_strategy( new_tactic, strategy );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 19281L)
  public static SubLObject add_sentence_to_justs(final SubLObject answers, final SubLObject sentence, final SubLObject mt)
  {
    if( NIL == tva_inference.tva_compute_justificationsP() )
    {
      return answers;
    }
    SubLObject just = ( NIL != assertion_handles.assertion_p( sentence ) ) ? sentence : NIL;
    if( NIL == just )
    {
      just = sksi_infrastructure_utilities.make_sksi_support( sentence, mt );
    }
    return ConsesLow.list( answers.first(), ConsesLow.cons( just, conses_high.second( answers ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 19758L)
  public static SubLObject add_subsumptions_to_justs(final SubLObject answers, final SubLObject tactic, final SubLObject sentence, final SubLObject strategy_argnum, final SubLObject mt)
  {
    if( NIL == tva_inference.tva_compute_justificationsP() )
    {
      return answers;
    }
    final SubLObject v_term = cycl_utilities.formula_arg( sentence, makeBoolean( NIL == sbhl_search_vars.genl_inverse_mode_p() ).eql( makeBoolean( NIL == tva_tactic.tva_tactic_parent_pred_inverseP( tactic ) ) )
        ? strategy_argnum
        : misc_utilities.other_binary_arg( strategy_argnum ), UNPROVIDED );
    final SubLObject justs = tva_tactic.tva_justify_subsumption( tactic, v_term, conses_high.second( answers ) );
    final SubLObject new_answers = ConsesLow.list( answers.first(), justs );
    return add_sentence_to_justs( new_answers, sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 20272L)
  public static SubLObject proceed_with_tva_strategy(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    SubLObject result = NIL;
    SubLObject substrategy = NIL;
    SubLObject tactic = NIL;
    substrategy = strategy_tactics( strategy );
    tactic = substrategy.first();
    while ( NIL != substrategy && NIL == doneP)
    {
      if( NIL == strategy_considered_tacticP( strategy, tactic ) && NIL == strategy_unified_tactic_argnumP( strategy, tactic ) )
      {
        note_strategy_considered_tactic( strategy, tactic );
        final SubLObject strategy_argnum = tva_tactic.tva_tactic_argnum_to_strategy_argnum( tactic, strategy_inverse_mode_p( strategy ) );
        note_strategy_argnum_unified( strategy, strategy_argnum );
        if( NIL == strategy_complete_p( strategy ) )
        {
          doneP = T;
        }
        else if( NIL != tva_tactic.tva_lookup_tactic_p( tactic ) )
        {
          final SubLObject argnum = tva_tactic.tva_tactic_argnum( tactic );
          final SubLObject arg = tva_tactic.tva_tactic_term( tactic );
          final SubLObject pred = tva_tactic.tva_index_pred( tactic );
          final SubLObject mt = NIL;
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg, argnum, pred_var );
            SubLObject done_var = doneP;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw68$GAF, $kw69$TRUE, NIL );
                  SubLObject done_var_$5 = doneP;
                  final SubLObject token_var_$6 = NIL;
                  while ( NIL == done_var_$5)
                  {
                    final SubLObject sentence = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                    final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( sentence ) );
                    if( NIL != valid_$7 && NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence ) )
                    {
                      thread.resetMultipleValues();
                      SubLObject answers = sentence_subsumes_tva_asent_with_strategy( sentence, strategy );
                      final SubLObject finishedP = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      doneP = finishedP;
                      if( NIL != answers )
                      {
                        answers = add_sentence_to_justs( answers, sentence, mt );
                        result = ConsesLow.cons( answers, result );
                      }
                    }
                    done_var_$5 = makeBoolean( NIL == valid_$7 || NIL != doneP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != doneP );
            }
          }
          if( NIL != sksi_tva_utilities.sksi_gaf_arg_possible_p( pred, arg, argnum ) )
          {
            final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = pred_relevance_macros.$pred$.currentBinding( thread );
            try
            {
              pred_relevance_macros.$relevant_pred_function$.bind( $sym70$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread );
              pred_relevance_macros.$pred$.bind( pred, thread );
              SubLObject rest;
              SubLObject gather_sentence_mt_pair;
              SubLObject current;
              SubLObject datum;
              SubLObject sentence2;
              SubLObject mt2;
              SubLObject answers2;
              SubLObject finishedP2;
              for( rest = NIL, rest = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( arg, argnum, pred, $kw69$TRUE ); NIL == doneP && NIL != rest; rest = rest.rest() )
              {
                gather_sentence_mt_pair = rest.first();
                datum = ( current = gather_sentence_mt_pair );
                sentence2 = NIL;
                mt2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
                sentence2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
                mt2 = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence2 ) )
                  {
                    thread.resetMultipleValues();
                    answers2 = sentence_subsumes_tva_asent_with_strategy( sentence2, strategy );
                    finishedP2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    doneP = finishedP2;
                    if( NIL != answers2 )
                    {
                      answers2 = add_sentence_to_justs( answers2, sentence2, mt2 );
                      result = ConsesLow.cons( answers2, result );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
                }
              }
            }
            finally
            {
              pred_relevance_macros.$pred$.rebind( _prev_bind_3, thread );
              pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_2, thread );
            }
          }
        }
        else if( NIL != tva_tactic.tva_precomputed_tactic_p( tactic ) )
        {
          final SubLObject argnum = tva_tactic.tva_tactic_argnum( tactic );
          final SubLObject pred2 = tva_tactic.tva_index_pred( tactic );
          if( NIL == doneP )
          {
            SubLObject catch_var = NIL;
            try
            {
              thread.throwStack.push( $kw72$DO_HASH_TABLE );
              final SubLObject cdohash_table = tva_tactic.tva_tactic_precomputation( tactic );
              SubLObject arg2 = NIL;
              SubLObject marking_var = NIL;
              final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
              try
              {
                while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                {
                  final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                  arg2 = Hashtables.getEntryKey( cdohash_entry );
                  marking_var = Hashtables.getEntryValue( cdohash_entry );
                  subl_macros.do_hash_table_done_check( doneP );
                  final SubLObject mt3 = NIL;
                  final SubLObject pred_var2 = pred2;
                  if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg2, argnum, pred_var2 ) )
                  {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg2, argnum, pred_var2 );
                    SubLObject done_var2 = doneP;
                    final SubLObject token_var2 = NIL;
                    while ( NIL == done_var2)
                    {
                      final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                      final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                      if( NIL != valid2 )
                      {
                        SubLObject final_index_iterator2 = NIL;
                        try
                        {
                          final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw68$GAF, $kw69$TRUE, NIL );
                          SubLObject done_var_$6 = doneP;
                          final SubLObject token_var_$7 = NIL;
                          while ( NIL == done_var_$6)
                          {
                            final SubLObject sentence3 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$7 );
                            final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( sentence3 ) );
                            if( NIL != valid_$8 && NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence3 ) )
                            {
                              thread.resetMultipleValues();
                              SubLObject answers3 = sentence_subsumes_tva_asent_with_strategy( sentence3, strategy );
                              final SubLObject finishedP3 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              doneP = finishedP3;
                              if( NIL != answers3 )
                              {
                                answers3 = add_subsumptions_to_justs( answers3, tactic, sentence3, strategy_argnum, mt3 );
                                result = ConsesLow.cons( answers3, result );
                              }
                            }
                            done_var_$6 = makeBoolean( NIL == valid_$8 || NIL != doneP );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if( NIL != final_index_iterator2 )
                            {
                              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                            }
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                          }
                        }
                      }
                      done_var2 = makeBoolean( NIL == valid2 || NIL != doneP );
                    }
                  }
                  if( NIL != sksi_tva_utilities.sksi_gaf_arg_possible_p( pred2, arg2, argnum ) )
                  {
                    final SubLObject _prev_bind_5 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
                    final SubLObject _prev_bind_6 = pred_relevance_macros.$pred$.currentBinding( thread );
                    try
                    {
                      pred_relevance_macros.$relevant_pred_function$.bind( $sym70$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread );
                      pred_relevance_macros.$pred$.bind( pred2, thread );
                      SubLObject rest2;
                      SubLObject gather_sentence_mt_pair2;
                      SubLObject current2;
                      SubLObject datum2;
                      SubLObject sentence4;
                      SubLObject mt4;
                      SubLObject answers4;
                      SubLObject finishedP4;
                      for( rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( arg2, argnum, pred2, $kw69$TRUE ); NIL == doneP && NIL != rest2; rest2 = rest2.rest() )
                      {
                        gather_sentence_mt_pair2 = rest2.first();
                        datum2 = ( current2 = gather_sentence_mt_pair2 );
                        sentence4 = NIL;
                        mt4 = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list71 );
                        sentence4 = current2.first();
                        current2 = current2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list71 );
                        mt4 = current2.first();
                        current2 = current2.rest();
                        if( NIL == current2 )
                        {
                          if( NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence4 ) )
                          {
                            thread.resetMultipleValues();
                            answers4 = sentence_subsumes_tva_asent_with_strategy( sentence4, strategy );
                            finishedP4 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            doneP = finishedP4;
                            if( NIL != answers4 )
                            {
                              answers4 = add_subsumptions_to_justs( answers4, tactic, sentence4, strategy_argnum, mt4 );
                              result = ConsesLow.cons( answers4, result );
                            }
                          }
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum2, $list71 );
                        }
                      }
                    }
                    finally
                    {
                      pred_relevance_macros.$pred$.rebind( _prev_bind_6, thread );
                      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_5, thread );
                    }
                  }
                }
              }
              finally
              {
                Hashtables.releaseEntrySetIterator( cdohash_iterator );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              catch_var = Errors.handleThrowable( ccatch_env_var, $kw72$DO_HASH_TABLE );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
        }
        else if( NIL != tva_tactic.tva_calculate_closure_tactic_p( tactic ) )
        {
          final SubLObject arg3 = tva_tactic.tva_tactic_term( tactic );
          final SubLObject trans_pred = tva_tactic.tva_tactic_transitive_pred( tactic );
          final SubLObject direction = tva_utilities.tva_direction_for_tva_pred( tva_tactic.tva_tactic_tva_pred( tactic ) );
          final SubLObject argnum2 = tva_tactic.tva_tactic_argnum( tactic );
          final SubLObject pred3 = tva_tactic.tva_index_pred( tactic );
          if( trans_pred.eql( $const73$genlPreds ) )
          {
            final SubLObject trans_pred_module = sbhl_module_vars.get_sbhl_module( trans_pred );
            if( NIL == doneP )
            {
              final SubLObject node_var = arg3;
              final SubLObject deck_type = ( $kw74$DEPTH == $kw74$DEPTH ) ? $kw75$STACK : $kw76$QUEUE;
              final SubLObject recur_deck = deck.create_deck( deck_type );
              SubLObject node_and_predicate_mode = NIL;
              final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                try
                {
                  final SubLObject tv_var = NIL;
                  final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                  final SubLObject _prev_bind_8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym77$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                    if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                    {
                      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                      if( pcase_var.eql( $kw78$ERROR ) )
                      {
                        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str79$_A_is_not_a__A, tv_var, $sym80$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw81$CERROR ) )
                      {
                        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str82$continue_anyway, $str79$_A_is_not_a__A, tv_var, $sym80$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw83$WARN ) )
                      {
                        Errors.warn( $str79$_A_is_not_a__A, tv_var, $sym80$SBHL_TRUE_TV_P );
                      }
                      else
                      {
                        Errors.warn( $str84$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                        Errors.cerror( $str82$continue_anyway, $str79$_A_is_not_a__A, tv_var, $sym80$SBHL_TRUE_TV_P );
                      }
                    }
                    final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                    final SubLObject _prev_bind_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                    final SubLObject _prev_bind_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    final SubLObject _prev_bind_11 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_module$.bind( trans_pred_module, thread );
                      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( trans_pred_module ), thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( trans_pred_module ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_module_vars.$sbhl_module$.bind( trans_pred_module, thread );
                      if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( arg3, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                      {
                        final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_2_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_search_direction$.bind( direction, thread );
                          sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( direction, trans_pred_module ), thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                          sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                          for( node_and_predicate_mode = ConsesLow.list( arg3, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == doneP; node_and_predicate_mode = deck.deck_pop(
                              recur_deck ) )
                          {
                            final SubLObject node_var_$17 = node_and_predicate_mode.first();
                            final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                            final SubLObject link_node = node_var_$17;
                            final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                              if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$17 ) )
                              {
                                final SubLObject mt5 = NIL;
                                final SubLObject pred_var3 = pred3;
                                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( link_node, argnum2, pred_var3 ) )
                                {
                                  final SubLObject iterator_var3 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( link_node, argnum2, pred_var3 );
                                  SubLObject done_var3 = doneP;
                                  final SubLObject token_var3 = NIL;
                                  while ( NIL == done_var3)
                                  {
                                    final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper( iterator_var3, token_var3 );
                                    final SubLObject valid3 = makeBoolean( !token_var3.eql( final_index_spec3 ) );
                                    if( NIL != valid3 )
                                    {
                                      SubLObject final_index_iterator3 = NIL;
                                      try
                                      {
                                        final_index_iterator3 = kb_mapping_macros.new_final_index_iterator( final_index_spec3, $kw68$GAF, $kw69$TRUE, NIL );
                                        SubLObject done_var_$7 = doneP;
                                        final SubLObject token_var_$8 = NIL;
                                        while ( NIL == done_var_$7)
                                        {
                                          final SubLObject sentence5 = iteration.iteration_next_without_values_macro_helper( final_index_iterator3, token_var_$8 );
                                          final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( sentence5 ) );
                                          if( NIL != valid_$9 && NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence5 ) )
                                          {
                                            thread.resetMultipleValues();
                                            SubLObject answers5 = sentence_subsumes_tva_asent_with_strategy( sentence5, strategy );
                                            final SubLObject finishedP5 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            doneP = finishedP5;
                                            if( NIL != answers5 )
                                            {
                                              answers5 = add_subsumptions_to_justs( answers5, tactic, sentence5, strategy_argnum, mt5 );
                                              result = ConsesLow.cons( answers5, result );
                                            }
                                          }
                                          done_var_$7 = makeBoolean( NIL == valid_$9 || NIL != doneP );
                                        }
                                      }
                                      finally
                                      {
                                        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                        try
                                        {
                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                          final SubLObject _values3 = Values.getValuesAsVector();
                                          if( NIL != final_index_iterator3 )
                                          {
                                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator3 );
                                          }
                                          Values.restoreValuesFromVector( _values3 );
                                        }
                                        finally
                                        {
                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
                                        }
                                      }
                                    }
                                    done_var3 = makeBoolean( NIL == valid3 || NIL != doneP );
                                  }
                                }
                                if( NIL != sksi_tva_utilities.sksi_gaf_arg_possible_p( pred3, link_node, argnum2 ) )
                                {
                                  final SubLObject _prev_bind_0_$16 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$15 = pred_relevance_macros.$pred$.currentBinding( thread );
                                  try
                                  {
                                    pred_relevance_macros.$relevant_pred_function$.bind( $sym70$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread );
                                    pred_relevance_macros.$pred$.bind( pred3, thread );
                                    SubLObject rest3;
                                    SubLObject gather_sentence_mt_pair3;
                                    SubLObject current3;
                                    SubLObject datum3;
                                    SubLObject sentence6;
                                    SubLObject mt6;
                                    SubLObject answers6;
                                    SubLObject finishedP6;
                                    for( rest3 = NIL, rest3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( link_node, argnum2, pred3, $kw69$TRUE ); NIL == doneP && NIL != rest3; rest3 = rest3.rest() )
                                    {
                                      gather_sentence_mt_pair3 = rest3.first();
                                      datum3 = ( current3 = gather_sentence_mt_pair3 );
                                      sentence6 = NIL;
                                      mt6 = NIL;
                                      cdestructuring_bind.destructuring_bind_must_consp( current3, datum3, $list71 );
                                      sentence6 = current3.first();
                                      current3 = current3.rest();
                                      cdestructuring_bind.destructuring_bind_must_consp( current3, datum3, $list71 );
                                      mt6 = current3.first();
                                      current3 = current3.rest();
                                      if( NIL == current3 )
                                      {
                                        if( NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence6 ) )
                                        {
                                          thread.resetMultipleValues();
                                          answers6 = sentence_subsumes_tva_asent_with_strategy( sentence6, strategy );
                                          finishedP6 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          doneP = finishedP6;
                                          if( NIL != answers6 )
                                          {
                                            answers6 = add_subsumptions_to_justs( answers6, tactic, sentence6, strategy_argnum, mt6 );
                                            result = ConsesLow.cons( answers6, result );
                                          }
                                        }
                                      }
                                      else
                                      {
                                        cdestructuring_bind.cdestructuring_bind_error( datum3, $list71 );
                                      }
                                    }
                                  }
                                  finally
                                  {
                                    pred_relevance_macros.$pred$.rebind( _prev_bind_1_$15, thread );
                                    pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$16, thread );
                                  }
                                }
                              }
                              final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( trans_pred_module );
                              SubLObject rest4;
                              SubLObject module_var;
                              SubLObject _prev_bind_0_$17;
                              SubLObject _prev_bind_1_$16;
                              SubLObject node;
                              SubLObject d_link;
                              SubLObject mt_links;
                              SubLObject iteration_state;
                              SubLObject mt7;
                              SubLObject tv_links;
                              SubLObject _prev_bind_0_$18;
                              SubLObject iteration_state_$28;
                              SubLObject tv;
                              SubLObject link_nodes;
                              SubLObject _prev_bind_0_$19;
                              SubLObject sol;
                              SubLObject set_contents_var;
                              SubLObject basis_object;
                              SubLObject state;
                              SubLObject node_vars_link_node;
                              SubLObject csome_list_var;
                              SubLObject node_vars_link_node2;
                              SubLObject new_list;
                              SubLObject rest_$30;
                              SubLObject generating_fn;
                              SubLObject _prev_bind_0_$20;
                              SubLObject sol2;
                              SubLObject link_nodes2;
                              SubLObject set_contents_var2;
                              SubLObject basis_object2;
                              SubLObject state2;
                              SubLObject node_vars_link_node3;
                              SubLObject csome_list_var2;
                              SubLObject node_vars_link_node4;
                              for( rest4 = NIL, rest4 = accessible_modules; NIL == doneP && NIL != rest4; rest4 = rest4.rest() )
                              {
                                module_var = rest4.first();
                                _prev_bind_0_$17 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                _prev_bind_1_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                      .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                  node = function_terms.naut_to_nart( node_var_$17 );
                                  if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                  {
                                    d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != d_link )
                                    {
                                      mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                      if( NIL != mt_links )
                                      {
                                        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == doneP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                        {
                                          thread.resetMultipleValues();
                                          mt7 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                          tv_links = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != mt_relevance_macros.relevant_mtP( mt7 ) )
                                          {
                                            _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.bind( mt7, thread );
                                              for( iteration_state_$28 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == doneP && NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state_$28 ); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next( iteration_state_$28 ) )
                                              {
                                                thread.resetMultipleValues();
                                                tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$28 );
                                                link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                {
                                                  _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                    sol = link_nodes;
                                                    if( NIL != set.set_p( sol ) )
                                                    {
                                                      set_contents_var = set.do_set_internal( sol );
                                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                          set_contents_var ); NIL == doneP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                      {
                                                        node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                        if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                            node_vars_link_node, UNPROVIDED ) )
                                                        {
                                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                          deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                        }
                                                      }
                                                    }
                                                    else if( sol.isList() )
                                                    {
                                                      if( NIL == doneP )
                                                      {
                                                        csome_list_var = sol;
                                                        node_vars_link_node2 = NIL;
                                                        node_vars_link_node2 = csome_list_var.first();
                                                        while ( NIL == doneP && NIL != csome_list_var)
                                                        {
                                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                          {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                            deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                          }
                                                          csome_list_var = csome_list_var.rest();
                                                          node_vars_link_node2 = csome_list_var.first();
                                                        }
                                                      }
                                                    }
                                                    else
                                                    {
                                                      Errors.error( $str85$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$19, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state_$28 );
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$18, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                      }
                                    }
                                    else
                                    {
                                      sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str86$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                    }
                                  }
                                  else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                  {
                                    new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                        .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                        : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                            sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                    for( rest_$30 = NIL, rest_$30 = new_list; NIL == doneP && NIL != rest_$30; rest_$30 = rest_$30.rest() )
                                    {
                                      generating_fn = rest_$30.first();
                                      _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                        link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                        if( NIL != set.set_p( sol2 ) )
                                        {
                                          set_contents_var2 = set.do_set_internal( sol2 );
                                          for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                              set_contents_var2 ); NIL == doneP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                          {
                                            node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                            if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                                UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                              deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                            }
                                          }
                                        }
                                        else if( sol2.isList() )
                                        {
                                          if( NIL == doneP )
                                          {
                                            csome_list_var2 = sol2;
                                            node_vars_link_node4 = NIL;
                                            node_vars_link_node4 = csome_list_var2.first();
                                            while ( NIL == doneP && NIL != csome_list_var2)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var2 = csome_list_var2.rest();
                                              node_vars_link_node4 = csome_list_var2.first();
                                            }
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str85$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$20, thread );
                                      }
                                    }
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$16, thread );
                                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$17, thread );
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$14, thread );
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$16, thread );
                          sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$14, thread );
                          sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$13, thread );
                        }
                      }
                      else
                      {
                        sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str87$Node__a_does_not_pass_sbhl_type_t, arg3, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                            UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_11, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_10, thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_9, thread );
                      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$13, thread );
                      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$12, thread );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_8, thread );
                    sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$11, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_7, thread );
              }
            }
          }
          else
          {
            final SubLObject mt8 = NIL;
            final SubLObject pred_var4 = pred3;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg3, argnum2, pred_var4 ) )
            {
              final SubLObject iterator_var4 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg3, argnum2, pred_var4 );
              SubLObject done_var4 = doneP;
              final SubLObject token_var4 = NIL;
              while ( NIL == done_var4)
              {
                final SubLObject final_index_spec4 = iteration.iteration_next_without_values_macro_helper( iterator_var4, token_var4 );
                final SubLObject valid4 = makeBoolean( !token_var4.eql( final_index_spec4 ) );
                if( NIL != valid4 )
                {
                  SubLObject final_index_iterator4 = NIL;
                  try
                  {
                    final_index_iterator4 = kb_mapping_macros.new_final_index_iterator( final_index_spec4, $kw68$GAF, $kw69$TRUE, NIL );
                    SubLObject done_var_$8 = doneP;
                    final SubLObject token_var_$9 = NIL;
                    while ( NIL == done_var_$8)
                    {
                      final SubLObject sentence7 = iteration.iteration_next_without_values_macro_helper( final_index_iterator4, token_var_$9 );
                      final SubLObject valid_$10 = makeBoolean( !token_var_$9.eql( sentence7 ) );
                      if( NIL != valid_$10 && NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence7 ) )
                      {
                        thread.resetMultipleValues();
                        SubLObject answers7 = sentence_subsumes_tva_asent_with_strategy( sentence7, strategy );
                        final SubLObject finishedP7 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        doneP = finishedP7;
                        if( NIL != answers7 )
                        {
                          answers7 = add_subsumptions_to_justs( answers7, tactic, sentence7, strategy_argnum, mt8 );
                          result = ConsesLow.cons( answers7, result );
                        }
                      }
                      done_var_$8 = makeBoolean( NIL == valid_$10 || NIL != doneP );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values5 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator4 )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator4 );
                      }
                      Values.restoreValuesFromVector( _values5 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_12, thread );
                    }
                  }
                }
                done_var4 = makeBoolean( NIL == valid4 || NIL != doneP );
              }
            }
            if( NIL != sksi_tva_utilities.sksi_gaf_arg_possible_p( pred3, arg3, argnum2 ) )
            {
              final SubLObject _prev_bind_13 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
              final SubLObject _prev_bind_14 = pred_relevance_macros.$pred$.currentBinding( thread );
              try
              {
                pred_relevance_macros.$relevant_pred_function$.bind( $sym70$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread );
                pred_relevance_macros.$pred$.bind( pred3, thread );
                SubLObject rest5;
                SubLObject gather_sentence_mt_pair4;
                SubLObject current4;
                SubLObject datum4;
                SubLObject sentence8;
                SubLObject mt9;
                SubLObject answers8;
                SubLObject finishedP8;
                for( rest5 = NIL, rest5 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( arg3, argnum2, pred3, $kw69$TRUE ); NIL == doneP && NIL != rest5; rest5 = rest5.rest() )
                {
                  gather_sentence_mt_pair4 = rest5.first();
                  datum4 = ( current4 = gather_sentence_mt_pair4 );
                  sentence8 = NIL;
                  mt9 = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current4, datum4, $list71 );
                  sentence8 = current4.first();
                  current4 = current4.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current4, datum4, $list71 );
                  mt9 = current4.first();
                  current4 = current4.rest();
                  if( NIL == current4 )
                  {
                    if( NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence8 ) )
                    {
                      thread.resetMultipleValues();
                      answers8 = sentence_subsumes_tva_asent_with_strategy( sentence8, strategy );
                      finishedP8 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      doneP = finishedP8;
                      if( NIL != answers8 )
                      {
                        answers8 = add_subsumptions_to_justs( answers8, tactic, sentence8, strategy_argnum, mt9 );
                        result = ConsesLow.cons( answers8, result );
                      }
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum4, $list71 );
                  }
                }
              }
              finally
              {
                pred_relevance_macros.$pred$.rebind( _prev_bind_14, thread );
                pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_13, thread );
              }
            }
            final SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator( trans_pred, arg3, direction, NIL, NIL, $kw88$DEPTH_FIRST, UNPROVIDED );
            SubLObject valid5;
            for( SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean( NIL == valid5 || NIL != doneP ) )
            {
              thread.resetMultipleValues();
              final SubLObject link_node2 = iteration.iteration_next( iterator );
              valid5 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid5 && !link_node2.equal( arg3 ) )
              {
                final SubLObject mt10 = NIL;
                final SubLObject pred_var5 = pred3;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( link_node2, argnum2, pred_var5 ) )
                {
                  final SubLObject iterator_var5 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( link_node2, argnum2, pred_var5 );
                  SubLObject done_var_$9 = doneP;
                  final SubLObject token_var5 = NIL;
                  while ( NIL == done_var_$9)
                  {
                    final SubLObject final_index_spec5 = iteration.iteration_next_without_values_macro_helper( iterator_var5, token_var5 );
                    final SubLObject valid_$11 = makeBoolean( !token_var5.eql( final_index_spec5 ) );
                    if( NIL != valid_$11 )
                    {
                      SubLObject final_index_iterator5 = NIL;
                      try
                      {
                        final_index_iterator5 = kb_mapping_macros.new_final_index_iterator( final_index_spec5, $kw68$GAF, $kw69$TRUE, NIL );
                        SubLObject done_var_$10 = doneP;
                        final SubLObject token_var_$10 = NIL;
                        while ( NIL == done_var_$10)
                        {
                          final SubLObject sentence9 = iteration.iteration_next_without_values_macro_helper( final_index_iterator5, token_var_$10 );
                          final SubLObject valid_$12 = makeBoolean( !token_var_$10.eql( sentence9 ) );
                          if( NIL != valid_$12 && NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence9 ) )
                          {
                            thread.resetMultipleValues();
                            SubLObject answers9 = sentence_subsumes_tva_asent_with_strategy( sentence9, strategy );
                            final SubLObject finishedP9 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            doneP = finishedP9;
                            if( NIL != answers9 )
                            {
                              answers9 = add_subsumptions_to_justs( answers9, tactic, sentence9, strategy_argnum, mt10 );
                              result = ConsesLow.cons( answers9, result );
                            }
                          }
                          done_var_$10 = makeBoolean( NIL == valid_$12 || NIL != doneP );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values6 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator5 )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator5 );
                          }
                          Values.restoreValuesFromVector( _values6 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_15, thread );
                        }
                      }
                    }
                    done_var_$9 = makeBoolean( NIL == valid_$11 || NIL != doneP );
                  }
                }
                if( NIL != sksi_tva_utilities.sksi_gaf_arg_possible_p( pred3, link_node2, argnum2 ) )
                {
                  final SubLObject _prev_bind_16 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
                  final SubLObject _prev_bind_17 = pred_relevance_macros.$pred$.currentBinding( thread );
                  try
                  {
                    pred_relevance_macros.$relevant_pred_function$.bind( $sym70$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread );
                    pred_relevance_macros.$pred$.bind( pred3, thread );
                    SubLObject sentence7;
                    SubLObject answers7;
                    SubLObject finishedP7;
                    SubLObject rest6;
                    SubLObject gather_sentence_mt_pair5;
                    SubLObject current5;
                    SubLObject datum5;
                    SubLObject mt11;
                    for( rest6 = NIL, rest6 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( link_node2, argnum2, pred3, $kw69$TRUE ); NIL == doneP && NIL != rest6; rest6 = rest6.rest() )
                    {
                      gather_sentence_mt_pair5 = rest6.first();
                      datum5 = ( current5 = gather_sentence_mt_pair5 );
                      sentence7 = NIL;
                      mt11 = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current5, datum5, $list71 );
                      sentence7 = current5.first();
                      current5 = current5.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current5, datum5, $list71 );
                      mt11 = current5.first();
                      current5 = current5.rest();
                      if( NIL == current5 )
                      {
                        if( NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence7 ) )
                        {
                          thread.resetMultipleValues();
                          answers7 = sentence_subsumes_tva_asent_with_strategy( sentence7, strategy );
                          finishedP7 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          doneP = finishedP7;
                          if( NIL != answers7 )
                          {
                            answers7 = add_subsumptions_to_justs( answers7, tactic, sentence7, strategy_argnum, mt11 );
                            result = ConsesLow.cons( answers7, result );
                          }
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum5, $list71 );
                      }
                    }
                  }
                  finally
                  {
                    pred_relevance_macros.$pred$.rebind( _prev_bind_17, thread );
                    pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_16, thread );
                  }
                }
              }
            }
          }
        }
        else if( NIL != tva_tactic.tva_predicate_extent_tactic_p( tactic ) )
        {
          note_strategy_argnum_remaining( strategy, strategy_argnum );
          final SubLObject pred4 = tva_tactic.tva_index_pred( tactic );
          final SubLObject mt12 = NIL;
          if( NIL != tva_utilities.tva_iterates_kb_predicate_extentP() )
          {
            final SubLObject pred_var6 = pred4;
            if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var6 ) )
            {
              final SubLObject str = NIL;
              final SubLObject _prev_bind_18 = utilities_macros.$progress_start_time$.currentBinding( thread );
              final SubLObject _prev_bind_19 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
              final SubLObject _prev_bind_20 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
              final SubLObject _prev_bind_21 = utilities_macros.$progress_notification_count$.currentBinding( thread );
              final SubLObject _prev_bind_22 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
              final SubLObject _prev_bind_23 = utilities_macros.$progress_count$.currentBinding( thread );
              final SubLObject _prev_bind_24 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
              final SubLObject _prev_bind_25 = utilities_macros.$silent_progressP$.currentBinding( thread );
              try
              {
                utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
                utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
                utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
                utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
                utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
                utilities_macros.$is_noting_progressP$.bind( T, thread );
                utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
                utilities_macros.noting_progress_preamble( str );
                final SubLObject iterator_var6 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var6 );
                SubLObject done_var5 = doneP;
                final SubLObject token_var6 = NIL;
                while ( NIL == done_var5)
                {
                  final SubLObject final_index_spec6 = iteration.iteration_next_without_values_macro_helper( iterator_var6, token_var6 );
                  final SubLObject valid6 = makeBoolean( !token_var6.eql( final_index_spec6 ) );
                  if( NIL != valid6 )
                  {
                    utilities_macros.note_progress();
                    SubLObject final_index_iterator6 = NIL;
                    try
                    {
                      final_index_iterator6 = kb_mapping_macros.new_final_index_iterator( final_index_spec6, $kw68$GAF, $kw69$TRUE, NIL );
                      SubLObject done_var_$11 = doneP;
                      final SubLObject token_var_$11 = NIL;
                      while ( NIL == done_var_$11)
                      {
                        final SubLObject sentence10 = iteration.iteration_next_without_values_macro_helper( final_index_iterator6, token_var_$11 );
                        final SubLObject valid_$13 = makeBoolean( !token_var_$11.eql( sentence10 ) );
                        if( NIL != valid_$13 && NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence10 ) )
                        {
                          thread.resetMultipleValues();
                          SubLObject answers10 = sentence_subsumes_tva_asent_with_strategy( sentence10, strategy );
                          final SubLObject finishedP10 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          doneP = finishedP10;
                          if( NIL != answers10 )
                          {
                            answers10 = add_sentence_to_justs( answers10, sentence10, mt12 );
                            result = ConsesLow.cons( answers10, result );
                          }
                        }
                        done_var_$11 = makeBoolean( NIL == valid_$13 || NIL != doneP );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values7 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator6 )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator6 );
                        }
                        Values.restoreValuesFromVector( _values7 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
                      }
                    }
                  }
                  done_var5 = makeBoolean( NIL == valid6 || NIL != doneP );
                }
                utilities_macros.noting_progress_postamble();
              }
              finally
              {
                utilities_macros.$silent_progressP$.rebind( _prev_bind_25, thread );
                utilities_macros.$is_noting_progressP$.rebind( _prev_bind_24, thread );
                utilities_macros.$progress_count$.rebind( _prev_bind_23, thread );
                utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_22, thread );
                utilities_macros.$progress_notification_count$.rebind( _prev_bind_21, thread );
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_20, thread );
                utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_19, thread );
                utilities_macros.$progress_start_time$.rebind( _prev_bind_18, thread );
              }
            }
          }
          if( NIL != tva_utilities.tva_iterates_sksi_predicate_extentP() )
          {
            SubLObject rest7;
            SubLObject gather_sentence_mt_pair6;
            SubLObject current6;
            SubLObject datum6;
            SubLObject sentence11;
            SubLObject mt13;
            SubLObject answers11;
            SubLObject finishedP11;
            for( rest7 = NIL, rest7 = sksi_sks_mapping_utilities.gather_sksi_predicate_extent_index( pred4, $kw69$TRUE ); NIL == doneP && NIL != rest7; rest7 = rest7.rest() )
            {
              gather_sentence_mt_pair6 = rest7.first();
              datum6 = ( current6 = gather_sentence_mt_pair6 );
              sentence11 = NIL;
              mt13 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current6, datum6, $list71 );
              sentence11 = current6.first();
              current6 = current6.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current6, datum6, $list71 );
              mt13 = current6.first();
              current6 = current6.rest();
              if( NIL == current6 )
              {
                if( NIL == tva_tactic.tva_tactic_term_for_sentence_is_exceptionalP( tactic, strategy_argnum, sentence11 ) )
                {
                  thread.resetMultipleValues();
                  answers11 = sentence_subsumes_tva_asent_with_strategy( sentence11, strategy );
                  finishedP11 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  doneP = finishedP11;
                  if( NIL != answers11 )
                  {
                    answers11 = add_sentence_to_justs( answers11, sentence11, mt13 );
                    result = ConsesLow.cons( answers11, result );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum6, $list71 );
              }
            }
          }
          doneP = T;
        }
        if( NIL != last_tactic_for_argnumP( strategy, tactic ) )
        {
          doneP = T;
        }
        if( NIL == doneP )
        {
          note_strategy_argnum_remaining( strategy, strategy_argnum );
        }
      }
      substrategy = substrategy.rest();
      tactic = substrategy.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/tva-strategy.lisp", position = 23076L)
  public static SubLObject sentence_subsumes_tva_asent_with_strategy(final SubLObject sentence, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tactics_used = strategy_considered_tactics( strategy );
    final SubLObject argnums_unified = strategy_argnums_unified( strategy );
    final SubLObject argnums_remaining = strategy_argnums_remaining( strategy );
    remove_tactics_for_matching_args( strategy, sentence );
    if( NIL != arg_matching_tactics_remain_in_strategyP( strategy ) )
    {
      revert_strategy_argnums_and_tactics( strategy, argnums_unified, argnums_remaining, tactics_used );
      return Values.values( NIL, NIL );
    }
    if( NIL != strategy_unified_all_tva_asent_argsP( strategy ) )
    {
      revert_strategy_argnums_and_tactics( strategy, argnums_unified, argnums_remaining, tactics_used );
      if( NIL != tva_inference.tva_return_one_answerP() )
      {
        return Values.values( ConsesLow.list( T, NIL ), T );
      }
      return Values.values( ConsesLow.list( tva_utilities.tva_unify_vars( sentence ), NIL ), NIL );
    }
    else
    {
      SubLObject doneP = NIL;
      SubLObject all_supports = NIL;
      if( ONE_INTEGER.eql( Sequences.length( strategy_tactics( strategy ) ) ) && NIL != strategy_considered_all_tacticsP( strategy ) )
      {
        final SubLObject tactic = tactics_used.first();
        final SubLObject v_term = tva_tactic.tva_sentence_arg_for_tactic( sentence, tactic );
        thread.resetMultipleValues();
        final SubLObject successP = tva_tactic.possibly_discharge_evaluatable_predicate_meta_tactic( tactic, v_term, tva_tactic.tva_tactic_tva_argnum( tactic, makeBoolean( !makeBoolean( NIL == sbhl_search_vars
            .genl_inverse_mode_p() ).eql( makeBoolean( NIL == tva_tactic.tva_tactic_parent_pred_inverseP( tactic ) ) ) ) ) );
        final SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != successP )
        {
          if( NIL != tva_inference.tva_return_one_answerP() )
          {
            return Values.values( ConsesLow.list( T, supports ), T );
          }
          return Values.values( ConsesLow.list( tva_utilities.tva_unify_vars( sentence ), supports ), NIL );
        }
      }
      else
      {
        SubLObject substrategy = NIL;
        SubLObject tactic2 = NIL;
        substrategy = strategy_tactics( strategy );
        tactic2 = substrategy.first();
        while ( NIL != substrategy && NIL == doneP)
        {
          if( NIL == strategy_considered_tacticP( strategy, tactic2 ) && NIL == strategy_unified_tactic_argnumP( strategy, tactic2 ) )
          {
            note_strategy_considered_tactic( strategy, tactic2 );
            final SubLObject strategy_argnum = tva_tactic.tva_tactic_argnum_to_strategy_argnum( tactic2, strategy_inverse_mode_p( strategy ) );
            final SubLObject v_term2 = tva_tactic.tva_sentence_arg_for_tactic( sentence, tactic2 );
            SubLObject successP2 = NIL;
            SubLObject supports2 = NIL;
            if( NIL != tva_tactic.tva_precomputed_tactic_p( tactic2 ) )
            {
              thread.resetMultipleValues();
              final SubLObject successP_$45 = tva_tactic.discharge_tva_precomputed_tactic( tactic2, v_term2, strategy_argnum, sentence );
              final SubLObject supports_$46 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              successP2 = successP_$45;
              supports2 = supports_$46;
            }
            else if( NIL != tva_tactic.tva_calculate_closure_tactic_p( tactic2 ) )
            {
              thread.resetMultipleValues();
              final SubLObject successP_$46 = tva_tactic.discharge_tva_calculate_closure_tactic( tactic2, v_term2, strategy_argnum, sentence );
              final SubLObject supports_$47 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              successP2 = successP_$46;
              supports2 = supports_$47;
            }
            else if( NIL != tva_tactic.tva_predicate_extent_tactic_p( tactic2 ) )
            {
              thread.resetMultipleValues();
              final SubLObject successP_$47 = tva_tactic.discharge_tva_predicate_extent_tactic( tactic2, v_term2, strategy_argnum, sentence );
              final SubLObject supports_$48 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              successP2 = successP_$47;
              supports2 = supports_$48;
            }
            if( NIL != successP2 )
            {
              note_strategy_argnum_unified( strategy, strategy_argnum );
              if( NIL != tva_inference.tva_return_one_answerP() && NIL != no_strategy_argnums_remainingP( strategy ) )
              {
                doneP = T;
              }
              all_supports = ConsesLow.nconc( all_supports, supports2 );
            }
            else if( NIL != last_tactic_for_argnumP( strategy, tactic2 ) )
            {
              doneP = T;
            }
          }
          substrategy = substrategy.rest();
          tactic2 = substrategy.first();
        }
      }
      if( NIL == strategy_unified_all_tva_asent_argsP( strategy ) )
      {
        revert_strategy_argnums_and_tactics( strategy, argnums_unified, argnums_remaining, tactics_used );
        return Values.values( NIL, NIL );
      }
      revert_strategy_argnums_and_tactics( strategy, argnums_unified, argnums_remaining, tactics_used );
      if( NIL != tva_inference.tva_return_one_answerP() )
      {
        return Values.values( ConsesLow.list( T, all_supports ), T );
      }
      return Values.values( ConsesLow.list( tva_utilities.tva_unify_vars( sentence ), all_supports ), NIL );
    }
  }

  public static SubLObject declare_tva_strategy_file()
  {
    SubLFiles.declareFunction( me, "tva_strategy_print_function_trampoline", "TVA-STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "tva_strategy_p", "TVA-STRATEGY-P", 1, 0, false );
    new $tva_strategy_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tva_strat_inverse_mode_p", "TVA-STRAT-INVERSE-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tva_strat_argnums_unified", "TVA-STRAT-ARGNUMS-UNIFIED", 1, 0, false );
    SubLFiles.declareFunction( me, "tva_strat_argnums_remaining", "TVA-STRAT-ARGNUMS-REMAINING", 1, 0, false );
    SubLFiles.declareFunction( me, "tva_strat_tactics", "TVA-STRAT-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "tva_strat_tactics_considered", "TVA-STRAT-TACTICS-CONSIDERED", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tva_strat_inverse_mode_p", "_CSETF-TVA-STRAT-INVERSE-MODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tva_strat_argnums_unified", "_CSETF-TVA-STRAT-ARGNUMS-UNIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tva_strat_argnums_remaining", "_CSETF-TVA-STRAT-ARGNUMS-REMAINING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tva_strat_tactics", "_CSETF-TVA-STRAT-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tva_strat_tactics_considered", "_CSETF-TVA-STRAT-TACTICS-CONSIDERED", 2, 0, false );
    SubLFiles.declareFunction( me, "make_tva_strategy", "MAKE-TVA-STRATEGY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_tva_strategy", "VISIT-DEFSTRUCT-TVA-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_tva_strategy_method", "VISIT-DEFSTRUCT-OBJECT-TVA-STRATEGY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_tva_strategy", "PRINT-TVA-STRATEGY", 3, 0, false );
    SubLFiles.declareFunction( me, "show_tva_strategy", "SHOW-TVA-STRATEGY", 1, 1, false );
    SubLFiles.declareFunction( me, "new_tacticless_strategy", "NEW-TACTICLESS-STRATEGY", 0, 0, false );
    SubLFiles.declareFunction( me, "new_strategy_with_tactics", "NEW-STRATEGY-WITH-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_inverse_mode_p", "STRATEGY-INVERSE-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_tactics", "STRATEGY-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_considered_tactics", "STRATEGY-CONSIDERED-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_argnums_unified", "STRATEGY-ARGNUMS-UNIFIED", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_argnums_remaining", "STRATEGY-ARGNUMS-REMAINING", 1, 0, false );
    SubLFiles.declareMacro( me, "do_strategy_remaining_argnums", "DO-STRATEGY-REMAINING-ARGNUMS" );
    SubLFiles.declareMacro( me, "do_strategy_tactics", "DO-STRATEGY-TACTICS" );
    SubLFiles.declareMacro( me, "do_strategy_tactics_after_tactic", "DO-STRATEGY-TACTICS-AFTER-TACTIC" );
    SubLFiles.declareMacro( me, "do_strategy_remaining_tactics", "DO-STRATEGY-REMAINING-TACTICS" );
    SubLFiles.declareFunction( me, "tva_strategy_inverse_mode_p", "TVA-STRATEGY-INVERSE-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tva_strategy_initial_tactic", "TVA-STRATEGY-INITIAL-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "tva_strategy_tacticlessP", "TVA-STRATEGY-TACTICLESS?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_considered_tacticP", "STRATEGY-CONSIDERED-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_unified_tactic_argnumP", "STRATEGY-UNIFIED-TACTIC-ARGNUM?", 2, 0, false );
    SubLFiles.declareFunction( me, "tva_strategy_subsumes_strategy_p", "TVA-STRATEGY-SUBSUMES-STRATEGY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_subsumed_in_strategyP", "TACTIC-SUBSUMED-IN-STRATEGY?", 2, 0, false );
    SubLFiles.declareFunction( me, "last_tactic_for_argnumP", "LAST-TACTIC-FOR-ARGNUM?", 2, 0, false );
    SubLFiles.declareFunction( me, "no_strategy_argnums_remainingP", "NO-STRATEGY-ARGNUMS-REMAINING?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_complete_p", "STRATEGY-COMPLETE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_considered_all_tacticsP", "STRATEGY-CONSIDERED-ALL-TACTICS?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_unified_all_tva_asent_argsP", "STRATEGY-UNIFIED-ALL-TVA-ASENT-ARGS?", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_matching_tactics_remain_in_strategyP", "ARG-MATCHING-TACTICS-REMAIN-IN-STRATEGY?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_inverse_mode", "SET-STRATEGY-INVERSE-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_argnums_unified", "SET-STRATEGY-ARGNUMS-UNIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_argnums_remaining", "SET-STRATEGY-ARGNUMS-REMAINING", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_tva_strategy_tactic", "REMOVE-TVA-STRATEGY-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_tactics", "SET-STRATEGY-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "push_tva_tactic_onto_strategy", "PUSH-TVA-TACTIC-ONTO-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "revert_strategy_argnums_and_tactics", "REVERT-STRATEGY-ARGNUMS-AND-TACTICS", 4, 0, false );
    SubLFiles.declareFunction( me, "note_strategy_considered_tactic", "NOTE-STRATEGY-CONSIDERED-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "add_strategy_argnum_to_remaining", "ADD-STRATEGY-ARGNUM-TO-REMAINING", 2, 0, false );
    SubLFiles.declareFunction( me, "delete_strategy_argnum_from_remaining", "DELETE-STRATEGY-ARGNUM-FROM-REMAINING", 2, 0, false );
    SubLFiles.declareFunction( me, "add_strategy_argnum_to_unified", "ADD-STRATEGY-ARGNUM-TO-UNIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "delete_strategy_argnum_from_unified", "DELETE-STRATEGY-ARGNUM-FROM-UNIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "note_strategy_argnum_unified", "NOTE-STRATEGY-ARGNUM-UNIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "note_strategy_argnum_remaining", "NOTE-STRATEGY-ARGNUM-REMAINING", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_tactics_subsumed_by_tactic", "REMOVE-TACTICS-SUBSUMED-BY-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_tactics_for_matching_args", "REMOVE-TACTICS-FOR-MATCHING-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_strategy_possibly_flip_argnums", "COPY-STRATEGY-POSSIBLY-FLIP-ARGNUMS", 3, 0, false );
    SubLFiles.declareFunction( me, "make_tva_simple_strategy", "MAKE-TVA-SIMPLE-STRATEGY", 0, 0, false );
    SubLFiles.declareMacro( me, "with_new_tva_strategy", "WITH-NEW-TVA-STRATEGY" );
    SubLFiles.declareFunction( me, "make_tva_default_strategy", "MAKE-TVA-DEFAULT-STRATEGY", 0, 0, false );
    SubLFiles.declareFunction( me, "insert_new_tactic_into_strategy", "INSERT-NEW-TACTIC-INTO-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_lookup_tactic_for_argnum", "REMOVE-LOOKUP-TACTIC-FOR-ARGNUM", 2, 0, false );
    SubLFiles.declareFunction( me, "tva_restrategize", "TVA-RESTRATEGIZE", 3, 0, false );
    SubLFiles.declareFunction( me, "possibly_modify_strategy_tactics", "POSSIBLY-MODIFY-STRATEGY-TACTICS", 5, 0, false );
    SubLFiles.declareFunction( me, "add_sentence_to_justs", "ADD-SENTENCE-TO-JUSTS", 3, 0, false );
    SubLFiles.declareFunction( me, "add_subsumptions_to_justs", "ADD-SUBSUMPTIONS-TO-JUSTS", 5, 0, false );
    SubLFiles.declareFunction( me, "proceed_with_tva_strategy", "PROCEED-WITH-TVA-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_subsumes_tva_asent_with_strategy", "SENTENCE-SUBSUMES-TVA-ASENT-WITH-STRATEGY", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_tva_strategy_file()
  {
    $dtp_tva_strategy$ = SubLFiles.defconstant( "*DTP-TVA-STRATEGY*", $sym0$TVA_STRATEGY );
    return NIL;
  }

  public static SubLObject setup_tva_strategy_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_tva_strategy$.getGlobalValue(), Symbols.symbol_function( $sym7$TVA_STRATEGY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$TVA_STRAT_INVERSE_MODE_P, $sym10$_CSETF_TVA_STRAT_INVERSE_MODE_P );
    Structures.def_csetf( $sym11$TVA_STRAT_ARGNUMS_UNIFIED, $sym12$_CSETF_TVA_STRAT_ARGNUMS_UNIFIED );
    Structures.def_csetf( $sym13$TVA_STRAT_ARGNUMS_REMAINING, $sym14$_CSETF_TVA_STRAT_ARGNUMS_REMAINING );
    Structures.def_csetf( $sym15$TVA_STRAT_TACTICS, $sym16$_CSETF_TVA_STRAT_TACTICS );
    Structures.def_csetf( $sym17$TVA_STRAT_TACTICS_CONSIDERED, $sym18$_CSETF_TVA_STRAT_TACTICS_CONSIDERED );
    Equality.identity( $sym0$TVA_STRATEGY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tva_strategy$.getGlobalValue(), Symbols.symbol_function( $sym29$VISIT_DEFSTRUCT_OBJECT_TVA_STRATEGY_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_tva_strategy_file();
  }

  @Override
  public void initializeVariables()
  {
    init_tva_strategy_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_tva_strategy_file();
  }
  static
  {
    me = new tva_strategy();
    $dtp_tva_strategy$ = null;
    $sym0$TVA_STRATEGY = makeSymbol( "TVA-STRATEGY" );
    $sym1$TVA_STRATEGY_P = makeSymbol( "TVA-STRATEGY-P" );
    $list2 = ConsesLow.list( makeSymbol( "INVERSE-MODE-P" ), makeSymbol( "ARGNUMS-UNIFIED" ), makeSymbol( "ARGNUMS-REMAINING" ), makeSymbol( "TACTICS" ), makeSymbol( "TACTICS-CONSIDERED" ) );
    $list3 = ConsesLow.list( makeKeyword( "INVERSE-MODE-P" ), makeKeyword( "ARGNUMS-UNIFIED" ), makeKeyword( "ARGNUMS-REMAINING" ), makeKeyword( "TACTICS" ), makeKeyword( "TACTICS-CONSIDERED" ) );
    $list4 = ConsesLow.list( makeSymbol( "TVA-STRAT-INVERSE-MODE-P" ), makeSymbol( "TVA-STRAT-ARGNUMS-UNIFIED" ), makeSymbol( "TVA-STRAT-ARGNUMS-REMAINING" ), makeSymbol( "TVA-STRAT-TACTICS" ), makeSymbol(
        "TVA-STRAT-TACTICS-CONSIDERED" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-TVA-STRAT-INVERSE-MODE-P" ), makeSymbol( "_CSETF-TVA-STRAT-ARGNUMS-UNIFIED" ), makeSymbol( "_CSETF-TVA-STRAT-ARGNUMS-REMAINING" ), makeSymbol(
        "_CSETF-TVA-STRAT-TACTICS" ), makeSymbol( "_CSETF-TVA-STRAT-TACTICS-CONSIDERED" ) );
    $sym6$PRINT_TVA_STRATEGY = makeSymbol( "PRINT-TVA-STRATEGY" );
    $sym7$TVA_STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TVA-STRATEGY-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TVA-STRATEGY-P" ) );
    $sym9$TVA_STRAT_INVERSE_MODE_P = makeSymbol( "TVA-STRAT-INVERSE-MODE-P" );
    $sym10$_CSETF_TVA_STRAT_INVERSE_MODE_P = makeSymbol( "_CSETF-TVA-STRAT-INVERSE-MODE-P" );
    $sym11$TVA_STRAT_ARGNUMS_UNIFIED = makeSymbol( "TVA-STRAT-ARGNUMS-UNIFIED" );
    $sym12$_CSETF_TVA_STRAT_ARGNUMS_UNIFIED = makeSymbol( "_CSETF-TVA-STRAT-ARGNUMS-UNIFIED" );
    $sym13$TVA_STRAT_ARGNUMS_REMAINING = makeSymbol( "TVA-STRAT-ARGNUMS-REMAINING" );
    $sym14$_CSETF_TVA_STRAT_ARGNUMS_REMAINING = makeSymbol( "_CSETF-TVA-STRAT-ARGNUMS-REMAINING" );
    $sym15$TVA_STRAT_TACTICS = makeSymbol( "TVA-STRAT-TACTICS" );
    $sym16$_CSETF_TVA_STRAT_TACTICS = makeSymbol( "_CSETF-TVA-STRAT-TACTICS" );
    $sym17$TVA_STRAT_TACTICS_CONSIDERED = makeSymbol( "TVA-STRAT-TACTICS-CONSIDERED" );
    $sym18$_CSETF_TVA_STRAT_TACTICS_CONSIDERED = makeSymbol( "_CSETF-TVA-STRAT-TACTICS-CONSIDERED" );
    $kw19$INVERSE_MODE_P = makeKeyword( "INVERSE-MODE-P" );
    $kw20$ARGNUMS_UNIFIED = makeKeyword( "ARGNUMS-UNIFIED" );
    $kw21$ARGNUMS_REMAINING = makeKeyword( "ARGNUMS-REMAINING" );
    $kw22$TACTICS = makeKeyword( "TACTICS" );
    $kw23$TACTICS_CONSIDERED = makeKeyword( "TACTICS-CONSIDERED" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_TVA_STRATEGY = makeSymbol( "MAKE-TVA-STRATEGY" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_TVA_STRATEGY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TVA-STRATEGY-METHOD" );
    $str30$__Strategy____a__ = makeString( "~%Strategy : ~a~%" );
    $str31$Strategy_Inverse_Mode_____a__ = makeString( "Strategy Inverse Mode? : ~a~%" );
    $str32$Argnums_Unified___________a__ = makeString( "Argnums Unified :        ~a~%" );
    $str33$Argnums_Remaining_________a__ = makeString( "Argnums Remaining :      ~a~%" );
    $str34$Tactics_Considered________a____ = makeString( "Tactics Considered :     ~a~%~%" );
    $str35$Strategy_Tactic__a___a__ = makeString( "Strategy Tactic ~a: ~a~%" );
    $str36$____ = makeString( "~%~%" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGNUM-VAR" ), makeSymbol( "STRATEGY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$CDOLIST = makeSymbol( "CDOLIST" );
    $sym39$STRATEGY_ARGNUMS_REMAINING = makeSymbol( "STRATEGY-ARGNUMS-REMAINING" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "TACTIC-VAR" ), makeSymbol( "STRATEGY" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list41 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw42$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw43$DONE = makeKeyword( "DONE" );
    $sym44$CSOME = makeSymbol( "CSOME" );
    $sym45$STRATEGY_TACTICS = makeSymbol( "STRATEGY-TACTICS" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "TACTIC-VAR" ), makeSymbol( "START-TACTIC" ), makeSymbol( "STRATEGY" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym47$CDR = makeSymbol( "CDR" );
    $sym48$MEMBER = makeSymbol( "MEMBER" );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "TACTIC-VAR" ), makeSymbol( "STRATEGY-ARGNUM-VAR" ), makeSymbol( "STRATEGY" ), makeSymbol( "DONE?-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$SUBSTRATEGY = makeUninternedSymbol( "SUBSTRATEGY" );
    $sym51$CDO = makeSymbol( "CDO" );
    $sym52$CAR = makeSymbol( "CAR" );
    $sym53$COR = makeSymbol( "COR" );
    $sym54$NULL = makeSymbol( "NULL" );
    $sym55$PUNLESS = makeSymbol( "PUNLESS" );
    $sym56$STRATEGY_CONSIDERED_TACTIC_ = makeSymbol( "STRATEGY-CONSIDERED-TACTIC?" );
    $sym57$STRATEGY_UNIFIED_TACTIC_ARGNUM_ = makeSymbol( "STRATEGY-UNIFIED-TACTIC-ARGNUM?" );
    $sym58$NOTE_STRATEGY_CONSIDERED_TACTIC = makeSymbol( "NOTE-STRATEGY-CONSIDERED-TACTIC" );
    $sym59$CLET = makeSymbol( "CLET" );
    $sym60$TVA_TACTIC_ARGNUM_TO_STRATEGY_ARGNUM = makeSymbol( "TVA-TACTIC-ARGNUM-TO-STRATEGY-ARGNUM" );
    $sym61$STRATEGY_INVERSE_MODE_P = makeSymbol( "STRATEGY-INVERSE-MODE-P" );
    $kw62$LOOKUP = makeKeyword( "LOOKUP" );
    $kw63$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $list64 = ConsesLow.list( makeSymbol( "STRATEGY-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAKE-TVA-DEFAULT-STRATEGY" ) ) );
    $const66$transitiveViaArg = constant_handles.reader_make_constant_shell( makeString( "transitiveViaArg" ) );
    $const67$transitiveViaArgInverse = constant_handles.reader_make_constant_shell( makeString( "transitiveViaArgInverse" ) );
    $kw68$GAF = makeKeyword( "GAF" );
    $kw69$TRUE = makeKeyword( "TRUE" );
    $sym70$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE = makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE" );
    $list71 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ) );
    $kw72$DO_HASH_TABLE = makeKeyword( "DO-HASH-TABLE" );
    $const73$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw74$DEPTH = makeKeyword( "DEPTH" );
    $kw75$STACK = makeKeyword( "STACK" );
    $kw76$QUEUE = makeKeyword( "QUEUE" );
    $sym77$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw78$ERROR = makeKeyword( "ERROR" );
    $str79$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym80$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw81$CERROR = makeKeyword( "CERROR" );
    $str82$continue_anyway = makeString( "continue anyway" );
    $kw83$WARN = makeKeyword( "WARN" );
    $str84$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str85$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str86$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str87$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw88$DEPTH_FIRST = makeKeyword( "DEPTH-FIRST" );
  }

  public static final class $tva_strategy_native
      extends
        SubLStructNative
  {
    public SubLObject $inverse_mode_p;
    public SubLObject $argnums_unified;
    public SubLObject $argnums_remaining;
    public SubLObject $tactics;
    public SubLObject $tactics_considered;
    private static final SubLStructDeclNative structDecl;

    public $tva_strategy_native()
    {
      this.$inverse_mode_p = CommonSymbols.NIL;
      this.$argnums_unified = CommonSymbols.NIL;
      this.$argnums_remaining = CommonSymbols.NIL;
      this.$tactics = CommonSymbols.NIL;
      this.$tactics_considered = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $tva_strategy_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$inverse_mode_p;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$argnums_unified;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$argnums_remaining;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$tactics;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$tactics_considered;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$inverse_mode_p = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$argnums_unified = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$argnums_remaining = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$tactics = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$tactics_considered = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $tva_strategy_native.class, $sym0$TVA_STRATEGY, $sym1$TVA_STRATEGY_P, $list2, $list3, new String[] { "$inverse_mode_p", "$argnums_unified", "$argnums_remaining",
        "$tactics", "$tactics_considered"
      }, $list4, $list5, $sym6$PRINT_TVA_STRATEGY );
    }
  }

  public static final class $tva_strategy_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $tva_strategy_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TVA-STRATEGY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return tva_strategy_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 3391 ms
 * 
 */