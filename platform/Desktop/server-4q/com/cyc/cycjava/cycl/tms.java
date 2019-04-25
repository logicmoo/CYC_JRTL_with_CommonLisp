package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.argumentation;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tms
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.tms";
  public static final String myFingerPrint = "6c2011185a7b58dbfa01741720eb5ff18bc9217be081892774fec8ff6e68b76a";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 720L)
  public static SubLSymbol $tms_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 834L)
  private static SubLSymbol $tms_assertions_being_removed$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1468L)
  private static SubLSymbol $tms_deductions_being_removed$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2388L)
  private static SubLSymbol $tms_forts_to_kill$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7242L)
  private static SubLSymbol $tms_remove_assertion_lowP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9017L)
  private static SubLSymbol $recursive_tms_bugP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17167L)
  private static SubLSymbol $except_propagation_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31193L)
  private static SubLSymbol $use_backchain_forbidden_deduction_stale_wrt_exceptionsP_general_versionP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31470L)
  private static SubLSymbol $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46831L)
  private static SubLSymbol $circular_deductions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47001L)
  private static SubLSymbol $circular_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47083L)
  private static SubLSymbol $circular_local_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47171L)
  private static SubLSymbol $circular_target_assertion$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47259L)
  private static SubLSymbol $circular_complexity_count$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47347L)
  public static SubLSymbol $circular_complexity_count_limit$;
  private static final SubLSymbol $sym0$ASSERTION_P;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$_TMS_ASSERTIONS_BEING_REMOVED_;
  private static final SubLSymbol $sym4$ADJOIN;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEDUCTION_P;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_TMS_DEDUCTIONS_BEING_REMOVED_;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$PIF;
  private static final SubLSymbol $sym11$TMS_NOTE_DEDUCTION_BEING_REMOVED;
  private static final SubLSymbol $sym12$PROGN;
  private static final SubLSymbol $kw13$UNINITIALIZED;
  private static final SubLSymbol $sym14$KBEQ;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$ARGUMENT_P;
  private static final SubLSymbol $sym20$ASSERTED_ARGUMENT_P;
  private static final SubLSymbol $sym21$TV_P;
  private static final SubLSymbol $kw22$UNKNOWN;
  private static final SubLSymbol $sym23$DIRECTION_P;
  private static final SubLSymbol $sym24$HLMT_P;
  private static final SubLSymbol $kw25$MT;
  private static final SubLSymbol $kw26$BROAD_MT;
  private static final SubLString $str27$do_broad_mt_index;
  private static final SubLSymbol $sym28$STRINGP;
  private static final SubLSymbol $kw29$SKIP;
  private static final SubLSymbol $sym30$_EXCEPT_PROPAGATION_RULE_;
  private static final SubLSymbol $sym31$_EXCEPT_PROPAGATION_RULE__INITIALIZER;
  private static final SubLList $list32;
  private static final SubLObject $const33$BaseKB;
  private static final SubLObject $const34$except;
  private static final SubLSymbol $kw35$TRUE;
  private static final SubLSymbol $kw36$FORWARD;
  private static final SubLSymbol $kw37$BACKWARD;
  private static final SubLSymbol $kw38$EQUALITY;
  private static final SubLSymbol $sym39$CNF_P;
  private static final SubLSymbol $kw40$FALSE;
  private static final SubLString $str41$_S_was_not_an_atomic_CNF_;
  private static final SubLObject $const42$isa;
  private static final SubLList $list43;
  private static final SubLObject $const44$genls;
  private static final SubLSymbol $sym45$RULE_ASSERTION_;
  private static final SubLSymbol $sym46$RULE_HAS_EXCEPTIONS_;
  private static final SubLSymbol $sym47$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_;
  private static final SubLSymbol $sym48$LIFTING_RULE_;
  private static final SubLSymbol $sym49$INFERENCE_BACKCHAIN_FORBIDDEN_;
  private static final SubLSymbol $sym50$_EXIT;
  private static final SubLSymbol $sym51$_PRED;
  private static final SubLObject $const52$genlPreds;
  private static final SubLObject $const53$implies;
  private static final SubLObject $const54$InferencePSC;
  private static final SubLSymbol $sym55$UNBOUND_PREDICATE_RULE_P;
  private static final SubLSymbol $kw56$ALLOWED_RULES;
  private static final SubLSymbol $kw57$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $kw58$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw59$RESULT_UNIQUENESS;
  private static final SubLSymbol $kw60$PROOF;
  private static final SubLSymbol $kw61$RETURN;
  private static final SubLSymbol $kw62$SUPPORTS;
  private static final SubLSymbol $kw63$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw64$HL;
  private static final SubLSymbol $kw65$CONTINUABLE_;
  private static final SubLSymbol $kw66$PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw67$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw68$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw69$ALLOW_HL_PREDICATE_TRANSFORMATION_;
  private static final SubLString $str70$_tms_deduction_stale_wrt_exceptio;
  private static final SubLString $str71$_tms_deduction_stale_wrt_exceptio;
  private static final SubLSymbol $sym72$QUEUE_P;
  private static final SubLString $str73$Found_deduction__A_supporting_wit;
  private static final SubLString $str74$Performing_full_TMS_on_mt__S;
  private static final SubLSymbol $sym75$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym76$TMS_RECONSIDER_ASSERTION;
  private static final SubLSymbol $sym77$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const78$EverythingPSC;
  private static final SubLString $str79$Reconsidering_assertion_arguments;
  private static final SubLSymbol $sym80$SUPPORT_P;
  private static final SubLString $str81$Computing_doomed_dependents;
  private static final SubLString $str82$cdolist;
  private static final SubLSymbol $sym83$_;
  private static final SubLSymbol $sym84$ASSERTION_ID;
  private static final SubLString $str85$Precaching_indices;
  private static final SubLSymbol $sym86$TERM_INDEX;
  private static final SubLString $str87$Removing_assertions;
  private static final SubLInteger $int88$250;
  private static final SubLString $str89$Removing_circularly_supported_ass;
  private static final SubLString $str90$_____S_circularly_supported_asser;
  private static final SubLString $str91$__Removing__S;
  private static final SubLSymbol $kw92$JUST_FOUND;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 939L)
  public static SubLObject tms_any_assertion_being_removedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $tms_assertions_being_removed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1044L)
  public static SubLObject tms_assertion_being_removedP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return list_utilities.member_kbeqP( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1274L)
  public static SubLObject tms_note_assertion_being_removed(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    assertion = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym3$_TMS_ASSERTIONS_BEING_REMOVED_, ConsesLow.listS( $sym4$ADJOIN, assertion, $list5 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1528L)
  public static SubLObject tms_deduction_being_removedP(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    return list_utilities.member_kbeqP( deduction, $tms_deductions_being_removed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1758L)
  public static SubLObject tms_note_deduction_being_removed(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject deduction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    deduction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym8$_TMS_DEDUCTIONS_BEING_REMOVED_, ConsesLow.listS( $sym4$ADJOIN, deduction, $list9 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1951L)
  public static SubLObject tms_argument_being_removedP(final SubLObject argument)
  {
    return makeBoolean( NIL != deduction_handles.deduction_p( argument ) && NIL != tms_deduction_being_removedP( argument ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2173L)
  public static SubLObject tms_note_argument_being_removed(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject deduction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    deduction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym10$PIF, ConsesLow.list( $sym6$DEDUCTION_P, deduction ), ConsesLow.listS( $sym11$TMS_NOTE_DEDUCTION_BEING_REMOVED, ConsesLow.list( deduction ), ConsesLow.append( body, NIL ) ), reader
          .bq_cons( $sym12$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2602L)
  public static SubLObject tms_can_kill_forts_for_meP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return misc_utilities.initialized_p( $tms_forts_to_kill$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2694L)
  public static SubLObject tms_please_kill_this_term_for_me(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != tms_can_kill_forts_for_meP() )
    {
      if( NIL == conses_high.member( fort, $tms_forts_to_kill$.getDynamicValue( thread ), Symbols.symbol_function( $sym14$KBEQ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $tms_forts_to_kill$.setDynamicValue( ConsesLow.cons( fort, $tms_forts_to_kill$.getDynamicValue( thread ) ), thread );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2878L)
  public static SubLObject tms_killing_forts_later(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym10$PIF, $list15, reader.bq_cons( $sym12$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym2$CLET, $list16, ConsesLow.append( body, $list17 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3136L)
  public static SubLObject tms_without_forts_to_kill_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list18, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3265L)
  public static SubLObject tms_forts_to_kill()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $tms_forts_to_kill$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3348L)
  public static SubLObject tms_fort_to_killP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != misc_utilities.initialized_p( $tms_forts_to_kill$.getDynamicValue( thread ) ) && NIL != list_utilities.member_kbeqP( fort, $tms_forts_to_kill$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3490L)
  public static SubLObject tms_kill_queued_forts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject forts_to_kill = tms_forts_to_kill();
    final SubLObject _prev_bind_0 = $tms_forts_to_kill$.currentBinding( thread );
    try
    {
      $tms_forts_to_kill$.bind( $kw13$UNINITIALIZED, thread );
      SubLObject cdolist_list_var = forts_to_kill;
      SubLObject fort = NIL;
      fort = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != cyc_kernel.cyc_kill( fort ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        fort = cdolist_list_var.first();
      }
    }
    finally
    {
      $tms_forts_to_kill$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3735L)
  public static SubLObject tms_possibly_replace_asserted_argument_with_tv(final SubLObject assertion, final SubLObject tv)
  {
    final SubLObject new_asserted_argument = assertions_interface.possibly_replace_assertion_asserted_argument_with_tv( assertion, tv );
    if( NIL != new_asserted_argument )
    {
      return tms_postprocess_new_argument( assertion, new_asserted_argument, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4262L)
  public static SubLObject tms_create_asserted_argument_with_tv(final SubLObject assertion, final SubLObject tv, SubLObject pre_existing_assertionP)
  {
    if( pre_existing_assertionP == UNPROVIDED )
    {
      pre_existing_assertionP = T;
    }
    final SubLObject new_asserted_argument = ( NIL != pre_existing_assertionP ) ? assertions_interface.kb_create_asserted_argument_with_tv( assertion, tv ) : arguments.create_asserted_argument( assertion, tv );
    if( NIL != new_asserted_argument )
    {
      final SubLObject result = tms_postprocess_new_argument( assertion, new_asserted_argument, pre_existing_assertionP );
      hl_transcript_tracing.note_hlt_assert( assertion );
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4889L)
  public static SubLObject tms_add_new_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject tv, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    final SubLObject deduction = deductions_high.create_deduction_with_tv( assertion, supports, tv, v_bindings, pragmatic_support_mts );
    tms_postprocess_new_argument( assertion, deduction, UNPROVIDED );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5172L)
  public static SubLObject tms_postprocess_new_argument(final SubLObject assertion, final SubLObject argument, SubLObject pre_existing_assertionP)
  {
    if( pre_existing_assertionP == UNPROVIDED )
    {
      pre_existing_assertionP = T;
    }
    assert NIL != arguments.argument_p( argument ) : argument;
    SubLObject successfulP = NIL;
    try
    {
      tms_recompute_assertion_tv( assertion, pre_existing_assertionP, UNPROVIDED );
      after_adding.handle_after_addings( argument, assertion );
      successfulP = T;
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL == successfulP )
        {
          tms_remove_argument( argument, assertion, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return argument;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5776L)
  public static SubLObject tms_remove_argument(final SubLObject argument, final SubLObject support, SubLObject removing_the_last_asserted_argumentP)
  {
    if( removing_the_last_asserted_argumentP == UNPROVIDED )
    {
      removing_the_last_asserted_argumentP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != arguments.argument_p( argument ) : argument;
    if( NIL != arguments.valid_argument( argument, UNPROVIDED ) && NIL == tms_argument_being_removedP( argument ) )
    {
      SubLObject support_removedP = NIL;
      if( NIL != deduction_handles.deduction_p( argument ) )
      {
        final SubLObject _prev_bind_0 = $tms_deductions_being_removed$.currentBinding( thread );
        try
        {
          $tms_deductions_being_removed$.bind( conses_high.adjoin( argument, $tms_deductions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
          if( NIL == removing_the_last_asserted_argumentP || NIL == assertion_handles.assertion_p( support ) || NIL == arguments.asserted_argument_p( argument ) )
          {
            arguments.remove_argument( argument, support );
          }
          if( NIL != assertion_handles.assertion_p( support ) )
          {
            if( NIL != assertion_handles.valid_assertionP( support, UNPROVIDED ) )
            {
              support_removedP = tms_propagate_removed_argument( argument, support, removing_the_last_asserted_argumentP );
            }
            else
            {
              support_removedP = T;
            }
          }
          else if( NIL != arguments.hl_support_p( support ) )
          {
            final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support( support );
            if( NIL != kb_hl_support )
            {
              support_removedP = kb_hl_supports_high.tms_possibly_rejustify_kb_hl_support( kb_hl_support );
            }
            else
            {
              support_removedP = T;
            }
          }
        }
        finally
        {
          $tms_deductions_being_removed$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        if( NIL == removing_the_last_asserted_argumentP || NIL == assertion_handles.assertion_p( support ) || NIL == arguments.asserted_argument_p( argument ) )
        {
          arguments.remove_argument( argument, support );
        }
        if( NIL != assertion_handles.assertion_p( support ) )
        {
          if( NIL != assertion_handles.valid_assertionP( support, UNPROVIDED ) )
          {
            support_removedP = tms_propagate_removed_argument( argument, support, removing_the_last_asserted_argumentP );
          }
          else
          {
            support_removedP = T;
          }
        }
        else if( NIL != arguments.hl_support_p( support ) )
        {
          final SubLObject kb_hl_support2 = kb_hl_supports_high.find_kb_hl_support( support );
          if( NIL != kb_hl_support2 )
          {
            support_removedP = kb_hl_supports_high.tms_possibly_rejustify_kb_hl_support( kb_hl_support2 );
          }
          else
          {
            support_removedP = T;
          }
        }
      }
      return support_removedP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7298L)
  public static SubLObject tms_propagate_removed_argument(final SubLObject argument, final SubLObject assertion, final SubLObject removing_the_last_asserted_argumentP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertion_removedP = NIL;
    if( NIL != tms_can_kill_forts_for_meP() )
    {
      if( NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP() )
      {
        assertion_removedP = tms_recompute_assertion_tv( assertion, T, removing_the_last_asserted_argumentP );
        if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
        {
          try
          {
            if( NIL != assertion_removedP )
            {
              final SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding( thread );
              try
              {
                $tms_assertions_being_removed$.bind( conses_high.adjoin( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
                after_adding.handle_after_removings( argument, assertion );
              }
              finally
              {
                $tms_assertions_being_removed$.rebind( _prev_bind_0, thread );
              }
            }
            else
            {
              after_adding.handle_after_removings( argument, assertion );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != assertion_removedP )
              {
                if( NIL != assertions_high.valid_assertion( assertion, UNPROVIDED ) )
                {
                  if( NIL != tms_assertion_being_removedP( assertion ) )
                  {
                    if( NIL != $tms_remove_assertion_lowP$.getDynamicValue( thread ) )
                    {
                      tms_remove_assertion_low( assertion );
                    }
                  }
                  else
                  {
                    tms_remove_assertion_int( assertion );
                  }
                }
              }
              else if( NIL != control_vars.$check_for_circular_justs$.getDynamicValue( thread ) && NIL == some_belief_justification( assertion, UNPROVIDED ) )
              {
                tms_remove_assertion( assertion );
                assertion_removedP = T;
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
            }
          }
        }
      }
      else
      {
        final SubLObject _prev_bind_0 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding( thread );
        try
        {
          kb_hl_supports_high.$tms_kb_hl_support_queue$.bind( queues.create_queue( UNPROVIDED ), thread );
          assertion_removedP = tms_recompute_assertion_tv( assertion, T, removing_the_last_asserted_argumentP );
          if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
          {
            try
            {
              if( NIL != assertion_removedP )
              {
                final SubLObject _prev_bind_0_$1 = $tms_assertions_being_removed$.currentBinding( thread );
                try
                {
                  $tms_assertions_being_removed$.bind( conses_high.adjoin( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
                  after_adding.handle_after_removings( argument, assertion );
                }
                finally
                {
                  $tms_assertions_being_removed$.rebind( _prev_bind_0_$1, thread );
                }
              }
              else
              {
                after_adding.handle_after_removings( argument, assertion );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != assertion_removedP )
                {
                  if( NIL != assertions_high.valid_assertion( assertion, UNPROVIDED ) )
                  {
                    if( NIL != tms_assertion_being_removedP( assertion ) )
                    {
                      if( NIL != $tms_remove_assertion_lowP$.getDynamicValue( thread ) )
                      {
                        tms_remove_assertion_low( assertion );
                      }
                    }
                    else
                    {
                      tms_remove_assertion_int( assertion );
                    }
                  }
                }
                else if( NIL != control_vars.$check_for_circular_justs$.getDynamicValue( thread ) && NIL == some_belief_justification( assertion, UNPROVIDED ) )
                {
                  tms_remove_assertion( assertion );
                  assertion_removedP = T;
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
              }
            }
          }
          kb_hl_supports_high.process_tms_kb_hl_support_queue();
        }
        finally
        {
          kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = $tms_forts_to_kill$.currentBinding( thread );
      try
      {
        $tms_forts_to_kill$.bind( NIL, thread );
        if( NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP() )
        {
          assertion_removedP = tms_recompute_assertion_tv( assertion, T, removing_the_last_asserted_argumentP );
          if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
          {
            try
            {
              if( NIL != assertion_removedP )
              {
                final SubLObject _prev_bind_0_$3 = $tms_assertions_being_removed$.currentBinding( thread );
                try
                {
                  $tms_assertions_being_removed$.bind( conses_high.adjoin( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
                  after_adding.handle_after_removings( argument, assertion );
                }
                finally
                {
                  $tms_assertions_being_removed$.rebind( _prev_bind_0_$3, thread );
                }
              }
              else
              {
                after_adding.handle_after_removings( argument, assertion );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                if( NIL != assertion_removedP )
                {
                  if( NIL != assertions_high.valid_assertion( assertion, UNPROVIDED ) )
                  {
                    if( NIL != tms_assertion_being_removedP( assertion ) )
                    {
                      if( NIL != $tms_remove_assertion_lowP$.getDynamicValue( thread ) )
                      {
                        tms_remove_assertion_low( assertion );
                      }
                    }
                    else
                    {
                      tms_remove_assertion_int( assertion );
                    }
                  }
                }
                else if( NIL != control_vars.$check_for_circular_justs$.getDynamicValue( thread ) && NIL == some_belief_justification( assertion, UNPROVIDED ) )
                {
                  tms_remove_assertion( assertion );
                  assertion_removedP = T;
                }
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$5 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding( thread );
          try
          {
            kb_hl_supports_high.$tms_kb_hl_support_queue$.bind( queues.create_queue( UNPROVIDED ), thread );
            assertion_removedP = tms_recompute_assertion_tv( assertion, T, removing_the_last_asserted_argumentP );
            if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
            {
              try
              {
                if( NIL != assertion_removedP )
                {
                  final SubLObject _prev_bind_0_$6 = $tms_assertions_being_removed$.currentBinding( thread );
                  try
                  {
                    $tms_assertions_being_removed$.bind( conses_high.adjoin( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
                    after_adding.handle_after_removings( argument, assertion );
                  }
                  finally
                  {
                    $tms_assertions_being_removed$.rebind( _prev_bind_0_$6, thread );
                  }
                }
                else
                {
                  after_adding.handle_after_removings( argument, assertion );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  if( NIL != assertion_removedP )
                  {
                    if( NIL != assertions_high.valid_assertion( assertion, UNPROVIDED ) )
                    {
                      if( NIL != tms_assertion_being_removedP( assertion ) )
                      {
                        if( NIL != $tms_remove_assertion_lowP$.getDynamicValue( thread ) )
                        {
                          tms_remove_assertion_low( assertion );
                        }
                      }
                      else
                      {
                        tms_remove_assertion_int( assertion );
                      }
                    }
                  }
                  else if( NIL != control_vars.$check_for_circular_justs$.getDynamicValue( thread ) && NIL == some_belief_justification( assertion, UNPROVIDED ) )
                  {
                    tms_remove_assertion( assertion );
                    assertion_removedP = T;
                  }
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                }
              }
            }
            kb_hl_supports_high.process_tms_kb_hl_support_queue();
          }
          finally
          {
            kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind( _prev_bind_0_$5, thread );
          }
        }
        tms_kill_queued_forts();
      }
      finally
      {
        $tms_forts_to_kill$.rebind( _prev_bind_0, thread );
      }
    }
    return assertion_removedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8542L)
  public static SubLObject tms_remove_assertion_list(final SubLObject assertions)
  {
    if( NIL == assertions )
    {
      return NIL;
    }
    return tms_remove_nonempty_assertion_list( assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8748L)
  public static SubLObject tms_remove_nonempty_assertion_list(final SubLObject assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != tms_can_kill_forts_for_meP() )
    {
      SubLObject cdolist_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        tms_remove_assertion( assertion );
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = $tms_forts_to_kill$.currentBinding( thread );
      try
      {
        $tms_forts_to_kill$.bind( NIL, thread );
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion2 = NIL;
        assertion2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          tms_remove_assertion( assertion2 );
          cdolist_list_var2 = cdolist_list_var2.rest();
          assertion2 = cdolist_list_var2.first();
        }
        tms_kill_queued_forts();
      }
      finally
      {
        $tms_forts_to_kill$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9216L)
  public static SubLObject tms_remove_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      if( NIL == tms_assertion_being_removedP( assertion ) )
      {
        return tms_remove_assertion_int( assertion );
      }
      if( NIL != $recursive_tms_bugP$.getDynamicValue( thread ) && NIL != tms_assertion_being_removedP( assertion ) )
      {
        return tms_remove_assertion_low( assertion );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9657L)
  public static SubLObject tms_remove_assertion_int(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    kb_modification_event.post_kb_modify_remove_assertion_event( assertion, UNPROVIDED );
    if( NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP() )
    {
      final SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding( thread );
      try
      {
        $tms_assertions_being_removed$.bind( conses_high.adjoin( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
        final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
        if( NIL == v_arguments )
        {
          tms_remove_assertion_low( assertion );
        }
        else
        {
          final SubLObject removing_the_last_asserted_argumentP = makeBoolean( NIL != list_utilities.singletonP( v_arguments ) && NIL != arguments.asserted_argument_p( list_utilities.only_one( v_arguments ) ) );
          SubLObject cdolist_list_var = v_arguments;
          SubLObject argument = NIL;
          argument = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            tms_remove_argument( argument, assertion, removing_the_last_asserted_argumentP );
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
          }
          if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
          {
            tms_remove_assertion_low( assertion );
          }
        }
      }
      finally
      {
        $tms_assertions_being_removed$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding( thread );
      try
      {
        kb_hl_supports_high.$tms_kb_hl_support_queue$.bind( queues.create_queue( UNPROVIDED ), thread );
        final SubLObject _prev_bind_0_$8 = $tms_assertions_being_removed$.currentBinding( thread );
        try
        {
          $tms_assertions_being_removed$.bind( conses_high.adjoin( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
          final SubLObject v_arguments2 = assertions_high.assertion_arguments( assertion );
          if( NIL == v_arguments2 )
          {
            tms_remove_assertion_low( assertion );
          }
          else
          {
            final SubLObject removing_the_last_asserted_argumentP2 = makeBoolean( NIL != list_utilities.singletonP( v_arguments2 ) && NIL != arguments.asserted_argument_p( list_utilities.only_one( v_arguments2 ) ) );
            SubLObject cdolist_list_var2 = v_arguments2;
            SubLObject argument2 = NIL;
            argument2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              tms_remove_argument( argument2, assertion, removing_the_last_asserted_argumentP2 );
              cdolist_list_var2 = cdolist_list_var2.rest();
              argument2 = cdolist_list_var2.first();
            }
            if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
            {
              tms_remove_assertion_low( assertion );
            }
          }
        }
        finally
        {
          $tms_assertions_being_removed$.rebind( _prev_bind_0_$8, thread );
        }
        kb_hl_supports_high.process_tms_kb_hl_support_queue();
      }
      finally
      {
        kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10737L)
  public static SubLObject tms_remove_assertion_low(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    kb_indexing.remove_term_indices( assertion );
    forward.remqueue_forward_assertion( assertion );
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      inference_analysis.clear_transformation_rule_statistics( assertion );
    }
    if( NIL == function_terms.tou_assertionP( assertion ) || NIL == nart_handles.valid_nartP( assertions_high.gaf_arg1( assertion ), UNPROVIDED ) )
    {
      return assertions_high.remove_assertion( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11490L)
  public static SubLObject tms_remove_deduction(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
    SubLObject result = NIL;
    if( NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP() )
    {
      result = tms_remove_argument( deduction, supported_object, UNPROVIDED );
    }
    else
    {
      final SubLObject _prev_bind_0 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding( thread );
      try
      {
        kb_hl_supports_high.$tms_kb_hl_support_queue$.bind( queues.create_queue( UNPROVIDED ), thread );
        result = tms_remove_argument( deduction, supported_object, UNPROVIDED );
        kb_hl_supports_high.process_tms_kb_hl_support_queue();
      }
      finally
      {
        kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11856L)
  public static SubLObject tms_change_asserted_argument_tv(final SubLObject asserted_argument, final SubLObject assertion, final SubLObject tv)
  {
    assert NIL != arguments.asserted_argument_p( asserted_argument ) : asserted_argument;
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != enumeration_types.tv_p( tv ) : tv;
    assertions_interface.replace_assertion_asserted_argument_with_tv( assertion, tv );
    tms_recompute_assertion_tv( assertion, UNPROVIDED, UNPROVIDED );
    hl_transcript_tracing.note_hlt_assert( assertion );
    after_adding.handle_after_removings( asserted_argument, assertion );
    after_adding.handle_after_addings( asserted_argument, assertion );
    return asserted_argument;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12411L)
  public static SubLObject tms_recompute_assertion_tv(final SubLObject assertion, SubLObject pre_existing_assertionP, SubLObject removing_the_last_asserted_argumentP)
  {
    if( pre_existing_assertionP == UNPROVIDED )
    {
      pre_existing_assertionP = T;
    }
    if( removing_the_last_asserted_argumentP == UNPROVIDED )
    {
      removing_the_last_asserted_argumentP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject changedP = NIL;
    SubLObject removeP = NIL;
    if( NIL != removing_the_last_asserted_argumentP || NIL == assertion_utilities.assertion_has_argumentsP( assertion ) )
    {
      final SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding( thread );
      try
      {
        $tms_assertions_being_removed$.bind( conses_high.adjoin( assertion, $tms_assertions_being_removed$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
        tms_remove_dependents( assertion );
      }
      finally
      {
        $tms_assertions_being_removed$.rebind( _prev_bind_0, thread );
      }
      removeP = T;
    }
    else
    {
      final SubLObject old_tv = ( NIL != pre_existing_assertionP ) ? assertions_high.cyc_assertion_tv( assertion ) : $kw22$UNKNOWN;
      final SubLObject new_tv = argumentation.compute_assertion_tv( assertion );
      if( NIL == control_vars.$bootstrapping_kbP$.getDynamicValue( thread ) )
      {
        if( !old_tv.eql( new_tv ) )
        {
          if( enumeration_types.tv_truth( old_tv ).eql( enumeration_types.tv_truth( new_tv ) ) )
          {
            tms_recompute_dependents_tv( assertion );
          }
          else
          {
            tms_remove_dependents( assertion );
            changedP = T;
          }
        }
      }
    }
    if( NIL != changedP )
    {
      perform_except_propagation( assertion );
      rewrite_of_propagation.perform_rewrite_of_propagation( assertion );
      if( NIL != pre_existing_assertionP )
      {
        tms_possibly_schedule_assertion_for_forward_propagation( assertion );
      }
    }
    return removeP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13894L)
  public static SubLObject tms_change_direction(final SubLObject assertion, final SubLObject direction)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    assertions_interface.kb_set_assertion_direction( assertion, direction );
    tms_possibly_schedule_assertion_for_forward_propagation( assertion );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14248L)
  public static SubLObject tms_should_schedule_assertion_for_forward_propagationP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue( thread ) && NIL != assertions_high.forward_assertionP( assertion ) && NIL != ( ( NIL != assertions_high.rule_assertionP(
        assertion ) ) ? assertion_utilities.true_assertionP( assertion ) : makeBoolean( NIL == assertion_utilities.unknown_assertionP( assertion ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14659L)
  public static SubLObject tms_possibly_schedule_assertion_for_forward_propagation(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != tms_should_schedule_assertion_for_forward_propagationP( assertion ) )
    {
      forward.queue_forward_assertion( assertion );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14910L)
  public static SubLObject tms_recompute_dependents(final SubLObject assertion)
  {
    tms_remove_dependents( assertion );
    tms_recompute_assertion_tv( assertion, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      after_adding.handle_after_removings( argument, assertion );
      after_adding.handle_after_addings( argument, assertion );
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15210L)
  public static SubLObject tms_handle_after_addings(final SubLObject assertion)
  {
    SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      after_adding.handle_after_addings( argument, assertion );
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15420L)
  public static SubLObject tms_remove_dependents(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
    SubLObject basis_object;
    SubLObject state;
    SubLObject dependent_deduction;
    SubLObject deduction_supported_object;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      dependent_deduction = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, dependent_deduction ) && NIL != deduction_handles.valid_deductionP( dependent_deduction, UNPROVIDED ) )
      {
        deduction_supported_object = deductions_high.deduction_supported_object( dependent_deduction );
        tms_remove_argument( dependent_deduction, deduction_supported_object, UNPROVIDED );
      }
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15947L)
  public static SubLObject tms_recompute_dependents_tv(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
    SubLObject basis_object;
    SubLObject state;
    SubLObject dependent;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      dependent = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, dependent ) )
      {
        tms_recompute_deduction_tv( dependent );
      }
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16225L)
  public static SubLObject tms_recompute_deduction_tv(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    final SubLObject old_tv = arguments.argument_tv( deduction );
    final SubLObject new_tv = argumentation.compute_deduction_tv( deduction );
    if( !old_tv.eql( new_tv ) )
    {
      final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
      if( NIL != assertion_handles.assertion_p( supported_object ) )
      {
        tms_recompute_assertion_tv( supported_object, UNPROVIDED, UNPROVIDED );
      }
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16696L)
  public static SubLObject tms_remove_mt_arguments(final SubLObject mt, SubLObject deductions_onlyP)
  {
    if( deductions_onlyP == UNPROVIDED )
    {
      deductions_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( mt );
    if( pcase_var.eql( $kw25$MT ) )
    {
      if( NIL != kb_mapping_macros.do_mt_index_key_validator( mt, NIL ) )
      {
        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( mt );
        SubLObject final_index_iterator = NIL;
        try
        {
          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( assertion ) );
            if( NIL != valid )
            {
              SubLObject cdolist_list_var;
              final SubLObject v_arguments = cdolist_list_var = assertions_high.assertion_arguments( assertion );
              SubLObject argument = NIL;
              argument = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( NIL == deductions_onlyP || NIL != deduction_handles.deduction_p( argument ) )
                {
                  tms_remove_argument( argument, assertion, UNPROVIDED );
                }
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
              }
            }
            done_var = makeBoolean( NIL == valid );
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
    }
    else if( pcase_var.eql( $kw26$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( mt, NIL ) )
    {
      final SubLObject idx = assertion_handles.do_assertions_table();
      final SubLObject mess = $str27$do_broad_mt_index;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$9 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$9, $kw29$SKIP ) )
          {
            final SubLObject idx_$10 = idx_$9;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$10, $kw29$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$10 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject assertion2;
              SubLObject cdolist_list_var2;
              SubLObject v_arguments2;
              SubLObject argument2;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw29$SKIP;
                  }
                  assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion2, mt, NIL, NIL ) )
                  {
                    v_arguments2 = ( cdolist_list_var2 = assertions_high.assertion_arguments( assertion2 ) );
                    argument2 = NIL;
                    argument2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      if( NIL == deductions_onlyP || NIL != deduction_handles.deduction_p( argument2 ) )
                      {
                        tms_remove_argument( argument2, assertion2, UNPROVIDED );
                      }
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      argument2 = cdolist_list_var2.first();
                    }
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$11 = idx_$9;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$11 ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$11 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$11 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$11 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw29$SKIP ) ) ? NIL : $kw29$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion3, mt, NIL, NIL ) )
                  {
                    SubLObject cdolist_list_var3;
                    final SubLObject v_arguments3 = cdolist_list_var3 = assertions_high.assertion_arguments( assertion3 );
                    SubLObject argument3 = NIL;
                    argument3 = cdolist_list_var3.first();
                    while ( NIL != cdolist_list_var3)
                    {
                      if( NIL == deductions_onlyP || NIL != deduction_handles.deduction_p( argument3 ) )
                      {
                        tms_remove_argument( argument3, assertion3, UNPROVIDED );
                      }
                      cdolist_list_var3 = cdolist_list_var3.rest();
                      argument3 = cdolist_list_var3.first();
                    }
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                a_id2 = Numbers.add( a_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17167L)
  public static SubLObject except_propagation_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list32, $const33$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17917L)
  public static SubLObject perform_except_propagation(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL == assertion_utilities.unknown_assertionP( assertion ) )
    {
      final SubLObject clause_struc = assertions_low.assertion_clause_struc( assertion );
      if( NIL != clause_struc )
      {
        SubLObject cdolist_list_var = clause_strucs.clause_struc_assertions( clause_struc );
        SubLObject sibling_assertion = NIL;
        sibling_assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == kb_utilities.kbeq( sibling_assertion, assertion ) && assertions_high.assertion_truth( assertion ).eql( enumeration_types.inverse_truth( assertions_high.assertion_truth( sibling_assertion ) ) ) )
          {
            final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
            final SubLObject sibling_assertion_mt = assertions_high.assertion_mt( sibling_assertion );
            SubLObject excepted_assertion = NIL;
            SubLObject excepted_mt = NIL;
            SubLObject supports = NIL;
            final SubLObject sibling_genl_mtP = genl_mts.genl_mtP( assertion_mt, sibling_assertion_mt, UNPROVIDED, UNPROVIDED );
            final SubLObject sibling_spec_mtP = genl_mts.genl_mtP( sibling_assertion_mt, assertion_mt, UNPROVIDED, UNPROVIDED );
            if( NIL == sibling_genl_mtP || NIL == sibling_spec_mtP )
            {
              if( NIL != sibling_genl_mtP )
              {
                excepted_assertion = sibling_assertion;
                excepted_mt = assertion_mt;
                supports = ConsesLow.cons( removal_modules_genlmt.make_genl_mt_support( assertion_mt, sibling_assertion_mt ), supports );
              }
              else if( NIL != sibling_spec_mtP )
              {
                excepted_assertion = assertion;
                excepted_mt = sibling_assertion_mt;
                supports = ConsesLow.cons( removal_modules_genlmt.make_genl_mt_support( sibling_assertion_mt, assertion_mt ), supports );
              }
            }
            if( NIL != excepted_assertion )
            {
              if( NIL != arguments.valid_supportP( $except_propagation_rule$.getDynamicValue( thread ), UNPROVIDED ) )
              {
                supports = ConsesLow.cons( $except_propagation_rule$.getDynamicValue( thread ), supports );
              }
              supports = ConsesLow.cons( assertion, supports );
              supports = ConsesLow.cons( sibling_assertion, supports );
              final SubLObject asent = el_utilities.make_unary_formula( $const34$except, excepted_assertion );
              thread.resetMultipleValues();
              final SubLObject deduction = hl_storage_modules.hl_add_deduction_for_gaf( asent, $kw35$TRUE, excepted_mt, supports, $kw36$FORWARD );
              final SubLObject redundantP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject item_var;
              final SubLObject assertion_$13 = item_var = ( NIL != deduction_handles.deduction_p( deduction ) ) ? deductions_high.deduction_assertion( deduction ) : NIL;
              if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                result = ConsesLow.cons( item_var, result );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          sibling_assertion = cdolist_list_var.first();
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19944L)
  public static SubLObject tms_remove_deduction_for_assertion(final SubLObject assertion, final SubLObject supports, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw35$TRUE;
    }
    final SubLObject deduction = deductions_high.find_deduction( assertion, supports, truth );
    if( NIL != deduction )
    {
      tms_explicitly_remove_deduction_for_assertion( deduction );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20386L)
  public static SubLObject tms_explicitly_remove_deduction_for_assertion(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    if( NIL != deduction_handles.valid_deductionP( deduction, UNPROVIDED ) && NIL == tms_argument_being_removedP( deduction ) )
    {
      final SubLObject assertion = deductions_high.deduction_supported_object( deduction );
      if( NIL != assertion_handles.assertion_p( assertion ) )
      {
        hl_transcript_tracing.note_hlt_remove_deduction( deduction );
        return tms_remove_argument( deduction, assertion, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21038L)
  public static SubLObject tms_add_deduction_for_assertion(final SubLObject assertion, final SubLObject supports, SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw35$TRUE;
    }
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    if( NIL != tms_direct_circularity( assertion, supports ) )
    {
      return Values.values( NIL, T );
    }
    final SubLObject existing = deductions_high.find_deduction( assertion, supports, truth );
    if( NIL != existing )
    {
      return Values.values( existing, T );
    }
    final SubLObject tv = argumentation.compute_supports_tv( supports, truth );
    final SubLObject new_argument = tms_add_new_deduction( assertion, supports, tv, v_bindings, pragmatic_support_mts );
    tms_invalidate_weaker_redundant_arguments( assertion, new_argument );
    return Values.values( new_argument, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21735L)
  public static SubLObject tms_add_deduction_for_cnf(final SubLObject cnf, final SubLObject mt, final SubLObject supports, SubLObject truth, SubLObject direction, SubLObject var_names, SubLObject v_bindings,
      SubLObject pragmatic_support_mts)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw35$TRUE;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw37$BACKWARD;
    }
    if( var_names == UNPROVIDED )
    {
      var_names = NIL;
    }
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject assertion = assertions_high.find_or_create_assertion( cnf, mt, var_names, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject newly_createdP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject deduction = tms_add_deduction_for_assertion( assertion, supports, truth, v_bindings, pragmatic_support_mts );
    final SubLObject redundantP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( deduction, redundantP, newly_createdP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22189L)
  public static SubLObject tms_direct_circularity(final SubLObject assertion, final SubLObject supports)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return list_utilities.member_kbeqP( assertion, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22413L)
  public static SubLObject tms_directly_circular_deduction(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    return tms_direct_circularity( deductions_high.deduction_assertion( deduction ), deductions_high.deduction_supports( deduction ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22669L)
  public static SubLObject tms_invalidate_weaker_redundant_arguments(final SubLObject assertion, final SubLObject new_argument)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject redundant_arguments = cdolist_list_var = tms_weaker_redundant_arguments( assertion, new_argument );
    SubLObject redundant_argument = NIL;
    redundant_argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != arguments.valid_argument( redundant_argument, UNPROVIDED ) )
      {
        tms_remove_weaker_redundant_argument( redundant_argument, assertion );
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      redundant_argument = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23474L)
  public static SubLObject tms_weaker_redundant_arguments(final SubLObject assertion, final SubLObject new_argument)
  {
    SubLObject result = NIL;
    if( NIL != deduction_with_one_tou_supportP( new_argument ) )
    {
      SubLObject naut = NIL;
      SubLObject other_supports = NIL;
      SubLObject cdolist_list_var = deductions_high.deduction_supports( new_argument );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != function_terms.tou_assertionP( support ) )
        {
          naut = assertions_high.gaf_arg2( support );
        }
        else
        {
          other_supports = ConsesLow.cons( support, other_supports );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
      cdolist_list_var = assertions_high.assertion_arguments( assertion );
      SubLObject other_argument = NIL;
      other_argument = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !other_argument.eql( new_argument ) && NIL != deduction_with_one_equality_support_matchingP( other_argument, naut ) )
        {
          SubLObject weaker_supports = NIL;
          SubLObject cdolist_list_var_$14 = deductions_high.deduction_supports( other_argument );
          SubLObject weaker_support = NIL;
          weaker_support = cdolist_list_var_$14.first();
          while ( NIL != cdolist_list_var_$14)
          {
            if( NIL == equality_support_matchingP( weaker_support, naut ) )
            {
              weaker_supports = ConsesLow.cons( weaker_support, weaker_supports );
            }
            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
            weaker_support = cdolist_list_var_$14.first();
          }
          if( NIL != list_utilities.sets_equal_equalP( other_supports, weaker_supports ) )
          {
            result = ConsesLow.cons( other_argument, result );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        other_argument = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24343L)
  public static SubLObject tms_remove_weaker_redundant_argument(final SubLObject redundant_argument, final SubLObject support)
  {
    return tms_remove_argument( redundant_argument, support, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24484L)
  public static SubLObject deduction_with_one_tou_supportP(final SubLObject v_object)
  {
    if( NIL != deduction_handles.deduction_p( v_object ) )
    {
      SubLObject tou_count = ZERO_INTEGER;
      SubLObject cdolist_list_var = deductions_high.deduction_supports( v_object );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != function_terms.tou_assertionP( support ) )
        {
          tou_count = Numbers.add( tou_count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
      return number_utilities.onep( tou_count );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24731L)
  public static SubLObject deduction_with_one_equality_support_matchingP(final SubLObject v_object, final SubLObject match)
  {
    if( NIL != deduction_handles.deduction_p( v_object ) )
    {
      SubLObject count = ZERO_INTEGER;
      SubLObject cdolist_list_var = deductions_high.deduction_supports( v_object );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != equality_support_matchingP( support, match ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
      return number_utilities.onep( count );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25004L)
  public static SubLObject equality_support_matchingP(final SubLObject v_object, final SubLObject match)
  {
    return makeBoolean( NIL != arguments.hl_support_p( v_object ) && $kw38$EQUALITY == arguments.hl_support_module( v_object ) && match.equal( cycl_utilities.formula_arg1( arguments.hl_support_sentence( v_object ),
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25213L)
  public static SubLObject atomic_cnf_trivially_derivable(final SubLObject atomic_cnf, final SubLObject mt)
  {
    assert NIL != clauses.cnf_p( atomic_cnf ) : atomic_cnf;
    if( NIL != clause_utilities.pos_atomic_cnf_p( atomic_cnf ) )
    {
      final SubLObject asent = clause_utilities.atomic_cnf_asent( atomic_cnf );
      return gaf_trivially_derivable( asent, $kw35$TRUE, mt );
    }
    if( NIL != clause_utilities.neg_atomic_cnf_p( atomic_cnf ) )
    {
      final SubLObject asent = clause_utilities.atomic_cnf_asent( atomic_cnf );
      return gaf_trivially_derivable( asent, $kw40$FALSE, mt );
    }
    return Errors.error( $str41$_S_was_not_an_atomic_CNF_, atomic_cnf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25830L)
  public static SubLObject gaf_trivially_derivable(final SubLObject gaf, final SubLObject truth, final SubLObject mt)
  {
    if( truth.eql( $kw35$TRUE ) )
    {
      return true_gaf_trivially_derivable( gaf, mt );
    }
    if( truth.eql( $kw40$FALSE ) )
    {
      return false_gaf_trivially_derivable( gaf, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26107L)
  public static SubLObject true_gaf_trivially_derivable(final SubLObject gaf, final SubLObject mt)
  {
    final SubLObject pcase_var;
    final SubLObject predicate = pcase_var = el_utilities.literal_predicate( gaf, UNPROVIDED );
    if( pcase_var.eql( $const42$isa ) )
    {
      SubLObject current;
      final SubLObject datum = current = el_utilities.literal_args( gaf, UNPROVIDED );
      SubLObject arg1 = NIL;
      SubLObject arg2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      arg1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      arg2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return makeBoolean( NIL != isa.isaP( arg1, arg2, mt, UNPROVIDED ) || NIL != at_defns.defns_admitP( arg2, arg1, mt ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
    }
    else if( pcase_var.eql( $const44$genls ) )
    {
      SubLObject current;
      final SubLObject datum = current = el_utilities.literal_args( gaf, UNPROVIDED );
      SubLObject arg1 = NIL;
      SubLObject arg2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      arg1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      arg2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return genls.genlsP( arg1, arg2, mt, UNPROVIDED );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
    }
    else
    {
      final SubLObject pcase_var_$15;
      final SubLObject v_arity = pcase_var_$15 = el_utilities.literal_arity( gaf, UNPROVIDED );
      if( pcase_var_$15.eql( TWO_INTEGER ) )
      {
        SubLObject current2;
        final SubLObject datum2 = current2 = el_utilities.literal_args( gaf, UNPROVIDED );
        SubLObject arg3 = NIL;
        SubLObject arg4 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list43 );
        arg3 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list43 );
        arg4 = current2.first();
        current2 = current2.rest();
        if( NIL == current2 )
        {
          if( arg3.equal( arg4 ) && NIL != kb_accessors.reflexive_predicateP( predicate ) )
          {
            return T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum2, $list43 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26851L)
  public static SubLObject false_gaf_trivially_derivable(final SubLObject gaf, final SubLObject mt)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26948L)
  public static SubLObject tms_reconsider_assertion_deductions(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
    SubLObject deduction = NIL;
    deduction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != deduction_handles.valid_deductionP( deduction, UNPROVIDED ) )
      {
        tms_reconsider_deduction( deduction );
      }
      cdolist_list_var = cdolist_list_var.rest();
      deduction = cdolist_list_var.first();
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27432L)
  public static SubLObject tms_reconsider_assertion_dependents(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
    SubLObject basis_object;
    SubLObject state;
    SubLObject deduction;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      deduction = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) && NIL != deduction_handles.valid_deductionP( deduction, UNPROVIDED ) )
      {
        tms_reconsider_deduction( deduction );
      }
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27810L)
  public static SubLObject tms_reconsider_deduction(final SubLObject deduction)
  {
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    if( NIL != deductions_high.skolem_deduction_p( deduction ) )
    {
      return NIL;
    }
    if( NIL != tms_deduction_stale_wrt_supportsP( deduction ) )
    {
      return tms_explicitly_remove_deduction_for_assertion( deduction );
    }
    if( NIL != tms_deduction_stale_wrt_exceptionsP( deduction ) )
    {
      return tms_explicitly_remove_deduction_for_assertion( deduction );
    }
    tms_recompute_deduction_tv( deduction );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28776L)
  public static SubLObject tms_deduction_stale_wrt_supportsP(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == deduction_handles.valid_deductionP( deduction, T ) )
    {
      return T;
    }
    final SubLObject liftingP = deductions_high.lifting_deduction_p( deduction );
    final SubLObject deduction_mt = deductions_high.deduction_mt( deduction );
    SubLObject staleP = NIL;
    final SubLObject _prev_bind_0 = hl_supports.$perform_opaque_support_verification$.currentBinding( thread );
    try
    {
      hl_supports.$perform_opaque_support_verification$.bind( T, thread );
      SubLObject rest;
      SubLObject support;
      for( rest = NIL, rest = deductions_high.deduction_supports( deduction ); NIL == staleP && NIL != rest; rest = rest.rest() )
      {
        support = rest.first();
        if( NIL != stale_support( support ) || ( NIL == liftingP && NIL != stale_support_mtP( support, deduction_mt ) ) )
        {
          staleP = T;
        }
      }
    }
    finally
    {
      hl_supports.$perform_opaque_support_verification$.rebind( _prev_bind_0, thread );
    }
    return staleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29378L)
  public static SubLObject tms_deduction_stale_wrt_exceptionsP(final SubLObject deduction)
  {
    final SubLObject old_supports = deductions_high.deduction_supports( deduction );
    final SubLObject rules = list_utilities.remove_if_not( $sym45$RULE_ASSERTION_, old_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Sequences.find_if( $sym46$RULE_HAS_EXCEPTIONS_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.find_if( $sym47$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_, rules, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != deductions_high.deduction_bindings( deduction ) )
    {
      return tms_deduction_stale_wrt_exceptionsP_use_deduction_bindings_version( deduction );
    }
    if( NIL != Sequences.find_if( $sym48$LIFTING_RULE_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return tms_deduction_stale_wrt_exceptionsP_lifting_rule_version( deduction );
    }
    final SubLObject assertion = deductions_high.deduction_assertion( deduction );
    final SubLObject pred = cycl_utilities.formula_operator( assertions_high.assertion_formula( assertion ) );
    if( NIL != inference_trampolines.inference_backchain_forbiddenP( pred, assertions_high.assertion_mt( assertion ) ) )
    {
      return tms_deduction_stale_wrt_exceptionsP_backchain_forbidden_version( deduction );
    }
    return tms_deduction_stale_wrt_exceptionsP_query_version( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31034L)
  public static SubLObject tms_deduction_stale_wrt_exceptionsP_lifting_rule_version(final SubLObject deduction)
  {
    return tms_deduction_stale_wrt_exceptionsP_general_version( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31859L)
  public static SubLObject tms_deduction_stale_wrt_exceptionsP_backchain_forbidden_version(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptionsP_general_versionP$.getDynamicValue( thread ) )
    {
      return tms_deduction_stale_wrt_exceptionsP_general_version( deduction );
    }
    final SubLObject assertion = deductions_high.deduction_assertion( deduction );
    final SubLObject pred = cycl_utilities.formula_operator( assertions_high.assertion_formula( assertion ) );
    SubLObject result = NIL;
    if( NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$.getDynamicValue( thread ) && NIL != memoization_state.current_memoization_state() )
    {
      memoization_state.caching_state_clear( memoization_state.memoization_state_get_caching_state_for_function( memoization_state.current_memoization_state(), $sym49$INFERENCE_BACKCHAIN_FORBIDDEN_ ) );
    }
    final SubLObject _prev_bind_0 = kb_accessors.$suppress_backchain_forbidden_preds$.currentBinding( thread );
    try
    {
      kb_accessors.$suppress_backchain_forbidden_preds$.bind( ( NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$.getDynamicValue( thread ) ) ? ConsesLow.list( pred ) : NIL, thread );
      result = tms_deduction_stale_wrt_exceptionsP_query_version( deduction );
      if( NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$.getDynamicValue( thread ) && NIL != memoization_state.current_memoization_state() )
      {
        memoization_state.caching_state_clear( memoization_state.memoization_state_get_caching_state_for_function( memoization_state.current_memoization_state(), $sym49$INFERENCE_BACKCHAIN_FORBIDDEN_ ) );
      }
      return result;
    }
    finally
    {
      kb_accessors.$suppress_backchain_forbidden_preds$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33011L)
  public static SubLObject tms_deduction_stale_wrt_exceptionsP_query_version(final SubLObject deduction)
  {
    final SubLObject old_supports = deductions_high.deduction_supports( deduction );
    final SubLObject rules = list_utilities.remove_if_not( $sym45$RULE_ASSERTION_, old_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject assertion = deductions_high.deduction_assertion( deduction );
    final SubLObject pred = cycl_utilities.formula_operator( assertions_high.assertion_formula( assertion ) );
    final SubLObject sentence = tms_reprove_deduction_query_sentence( assertion );
    final SubLObject mt = tms_reprove_deduction_query_mt( deduction );
    final SubLObject truth = deductions_high.deduction_truth( deduction );
    final SubLObject v_properties = tms_reprove_deduction_query_properties( sentence, mt, pred, truth, rules );
    final SubLObject justifications = inference_kernel.new_cyc_query( sentence, mt, v_properties );
    SubLObject filtered_justifications = NIL;
    SubLObject cdolist_list_var = justifications;
    SubLObject justification = NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == list_utilities.member_kbeqP( assertion, justification ) && NIL == list_utilities.fast_set_difference( rules, justification, UNPROVIDED ) )
      {
        filtered_justifications = ConsesLow.cons( justification, filtered_justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    filtered_justifications = Sequences.nreverse( filtered_justifications );
    if( NIL == filtered_justifications )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34380L)
  public static SubLObject tms_reprove_deduction_query_sentence(final SubLObject assertion)
  {
    final SubLObject formula = assertions_high.assertion_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject pred = cycl_utilities.formula_operator( formula );
    SubLObject query_sentence = NIL;
    if( NIL != inference_trampolines.inference_backchain_forbiddenP( pred, mt ) )
    {
      final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
      final SubLObject new_pred_var = $sym51$_PRED;
      final SubLObject antecedent = el_utilities.make_binary_formula( $const52$genlPreds, pred, new_pred_var );
      final SubLObject consequent = el_utilities.make_formula( new_pred_var, args, UNPROVIDED );
      query_sentence = el_utilities.make_binary_formula( $const53$implies, antecedent, consequent );
    }
    else
    {
      query_sentence = formula;
    }
    return query_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34973L)
  public static SubLObject tms_reprove_deduction_query_mt(final SubLObject deduction)
  {
    final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
    if( NIL != kb_accessors.decontextualized_assertionP( supported_object ) )
    {
      return $const54$InferencePSC;
    }
    return deductions_high.deduction_mt( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35216L)
  public static SubLObject tms_reprove_deduction_query_properties(final SubLObject sentence, final SubLObject mt, final SubLObject predicate, final SubLObject truth, final SubLObject rules)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_count = Sequences.length( rules );
    final SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p( sentence );
    final SubLObject allow_unbound_predicate_transformationP = list_utilities.sublisp_boolean( Sequences.find_if( $sym55$UNBOUND_PREDICATE_RULE_P, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject allow_evaluatable_predicate_transformationP = makeBoolean( rule_count.isPositive() && ( NIL != relation_evaluation.evaluatable_predicateP( predicate, mt ) || rule_count.numG( ONE_INTEGER ) ) );
    final SubLObject allow_hl_predicate_transformationP = makeBoolean( rule_count.isPositive() && ( NIL != hl_supports.hl_predicate_p( predicate ) || rule_count.numG( ONE_INTEGER ) ) );
    SubLObject productivity_limit = NIL;
    SubLObject cdolist_list_var = rules;
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject rule_productivity_limit = forward.rule_forward_inference_productivity_limit( rule );
      if( rule_productivity_limit.isNumber() && ( NIL == productivity_limit || rule_productivity_limit.numG( productivity_limit ) ) )
      {
        productivity_limit = rule_productivity_limit;
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    if( NIL == productivity_limit )
    {
      productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff( control_vars.$forward_inference_removal_cost_cutoff$.getDynamicValue( thread ) );
    }
    return ConsesLow.list( new SubLObject[] { $kw56$ALLOWED_RULES, rules, $kw57$CONDITIONAL_SENTENCE_, conditional_sentenceP, $kw58$MAX_TRANSFORMATION_DEPTH, rule_count, $kw59$RESULT_UNIQUENESS, $kw60$PROOF,
      $kw61$RETURN, $kw62$SUPPORTS, $kw63$ANSWER_LANGUAGE, $kw64$HL, $kw65$CONTINUABLE_, NIL, $kw66$PRODUCTIVITY_LIMIT, productivity_limit, $kw67$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_,
      allow_unbound_predicate_transformationP, $kw68$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, allow_evaluatable_predicate_transformationP, $kw69$ALLOW_HL_PREDICATE_TRANSFORMATION_, allow_hl_predicate_transformationP
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37124L)
  public static SubLObject tms_deduction_stale_wrt_exceptionsP_general_version(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_worker_transformation.supports_contain_excepted_assertion_in_mtP( deductions_high.deduction_supports( deduction ), deductions_high.deduction_mt( deduction ), UNPROVIDED ) )
    {
      return T;
    }
    final SubLObject supports = deductions_high.deduction_supports( deduction );
    final SubLObject assertion = deductions_high.deduction_supported_object( deduction );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      Errors.warn( $str70$_tms_deduction_stale_wrt_exceptio, deduction_handles.deduction_id( deduction ) );
      return NIL;
    }
    final SubLObject rule = Sequences.find_if( Symbols.symbol_function( $sym45$RULE_ASSERTION_ ), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject trigger_gaf = forward_rule_propagation.first_gaf_in_supports( Sequences.remove_if( Symbols.symbol_function( $sym45$RULE_ASSERTION_ ), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    if( NIL == trigger_gaf )
    {
      Errors.warn( $str71$_tms_deduction_stale_wrt_exceptio, deduction_handles.deduction_id( deduction ), deductions_high.deduction_supported_object( deduction ) );
      return NIL;
    }
    final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$prefer_forward_skolemization$.currentBinding( thread );
    try
    {
      kb_control_vars.$within_assertion_forward_propagationP$.bind( NIL, thread );
      control_vars.$prefer_forward_skolemization$.bind( NIL, thread );
      final SubLObject environment = forward.get_forward_inference_environment();
      assert NIL != queues.queue_p( environment ) : environment;
      final SubLObject _prev_bind_0_$16 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
      final SubLObject _prev_bind_1_$17 = utilities_macros.$current_forward_problem_store$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_environment$.bind( environment, thread );
        utilities_macros.$current_forward_problem_store$.bind( NIL, thread );
        try
        {
          final SubLObject assertibles_queue = compute_assertibles_queue_for_tms_deduction_stale_wrt_exceptionsP_general_version( trigger_gaf, rule );
          SubLObject not_staleP;
          SubLObject rest;
          SubLObject hl_assertible_var;
          SubLObject assertible;
          SubLObject argument_spec;
          SubLObject hl_assertion_spec_var_$18;
          SubLObject hl_assertion_spec_var;
          SubLObject cnf;
          SubLObject mt;
          SubLObject direction;
          SubLObject variable_map;
          for( not_staleP = NIL, rest = NIL, rest = queues.do_queue_elements_queue_elements( assertibles_queue ); NIL == not_staleP && NIL != rest; rest = rest.rest() )
          {
            assertible = ( hl_assertible_var = rest.first() );
            argument_spec = hl_storage_modules.hl_assertible_argument_spec( hl_assertible_var );
            hl_assertion_spec_var = ( hl_assertion_spec_var_$18 = hl_storage_modules.hl_assertible_hl_assertion_spec( hl_assertible_var ) );
            cnf = hl_storage_modules.hl_assertion_spec_cnf( hl_assertion_spec_var_$18 );
            mt = hl_storage_modules.hl_assertion_spec_mt( hl_assertion_spec_var_$18 );
            direction = hl_storage_modules.hl_assertion_spec_direction( hl_assertion_spec_var_$18 );
            variable_map = hl_storage_modules.hl_assertion_spec_variable_map( hl_assertion_spec_var_$18 );
            if( uncanonicalizer.assertion_el_formula( assertion ).equal( uncanonicalizer.cnf_el_formula( cnf, UNPROVIDED, UNPROVIDED ) ) && assertions_high.assertion_mt( assertion ).equal( mt ) )
            {
              not_staleP = T;
            }
          }
          return makeBoolean( NIL == not_staleP );
        }
        finally
        {
          final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            forward.clear_current_forward_problem_store();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$current_forward_problem_store$.rebind( _prev_bind_1_$17, thread );
        kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0_$16, thread );
      }
    }
    finally
    {
      control_vars.$prefer_forward_skolemization$.rebind( _prev_bind_2, thread );
      kb_control_vars.$within_assertion_forward_propagationP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39610L)
  public static SubLObject compute_assertibles_queue_for_tms_deduction_stale_wrt_exceptionsP_general_version(final SubLObject trigger_gaf, final SubLObject rule)
  {
    return forward.forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached( trigger_gaf, rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40035L)
  public static SubLObject tms_deduction_stale_wrt_exceptionsP_use_deduction_bindings_version(final SubLObject deduction)
  {
    final SubLObject supports = deductions_high.deduction_supports( deduction );
    final SubLObject pragma_mts = deductions_high.deduction_pragmatic_support_mts( deduction );
    final SubLObject v_bindings = deductions_high.deduction_bindings( deduction );
    final SubLObject rule = Sequences.find_if( $sym45$RULE_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject mt = deductions_high.deduction_mt( deduction );
    if( NIL == rule )
    {
      Errors.warn( $str73$Found_deduction__A_supporting_wit, deduction, deductions_high.deduction_supported_object( deduction ) );
      return NIL;
    }
    if( NIL != indexing_utilities.rule_with_some_pragmatic_somewhereP( rule ) )
    {
      final SubLObject query_dnf = bindings.apply_bindings( v_bindings, inference_worker_transformation.forward_rule_pragmatic_dnf( rule, mt ) );
      if( NIL == inference_kernel.new_cyc_query_from_dnf( query_dnf, mt, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
    }
    if( NIL != abnormal.rule_has_exceptionsP( rule ) )
    {
      final SubLObject store = inference_datastructures_problem_store.new_problem_store( UNPROVIDED );
      final SubLObject abnormalP = abnormal.rule_bindings_abnormalP( store, rule, v_bindings, mt );
      inference_datastructures_problem_store.destroy_problem_store( store );
      if( NIL != abnormalP )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41137L)
  public static SubLObject tms_reconsider_assertion(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
    if( NIL != v_arguments )
    {
      SubLObject removed = NIL;
      if( NIL == removed )
      {
        SubLObject csome_list_var = v_arguments;
        SubLObject argument = NIL;
        argument = csome_list_var.first();
        while ( NIL == removed && NIL != csome_list_var)
        {
          if( NIL != deduction_handles.deduction_p( argument ) )
          {
            removed = tms_reconsider_deduction( argument );
          }
          csome_list_var = csome_list_var.rest();
          argument = csome_list_var.first();
        }
      }
      return removed;
    }
    tms_remove_assertion( assertion );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41788L)
  public static SubLObject tms_reconsider_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    final SubLObject monad_mt = hlmt.hlmt_monad_mt( mt );
    if( NIL != kb_indexing.broad_mtP( monad_mt ) )
    {
      final SubLObject idx = assertion_handles.do_assertions_table();
      final SubLObject mess = PrintLow.format( NIL, $str74$Performing_full_TMS_on_mt__S, mt );
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$20 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$20, $kw29$SKIP ) )
          {
            final SubLObject idx_$21 = idx_$20;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$21, $kw29$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$21 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject assertion;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw29$SKIP;
                  }
                  assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  if( NIL != hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), mt ) )
                  {
                    tms_reconsider_assertion( assertion );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$22 = idx_$20;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$22 ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$22 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$22 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$22 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw29$SKIP ) ) ? NIL : $kw29$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  if( NIL != hlmt.hlmt_equal( assertions_high.assertion_mt( assertion2 ), mt ) )
                  {
                    tms_reconsider_assertion( assertion2 );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                a_id2 = Numbers.add( a_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym75$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        kb_mapping.map_mt_index( $sym76$TMS_RECONSIDER_ASSERTION, monad_mt, NIL, NIL );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_6, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42354L)
  public static SubLObject tms_reconsider_term_gafs(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym75$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        kb_mapping.map_term_gafs( $sym76$TMS_RECONSIDER_ASSERTION, v_term, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym77$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const78$EverythingPSC, thread );
        kb_mapping.map_term_gafs( $sym76$TMS_RECONSIDER_ASSERTION, v_term, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42584L)
  public static SubLObject tms_reconsider_predicate_extent(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt )
    {
      kb_mapping.map_predicate_extent_index( $sym76$TMS_RECONSIDER_ASSERTION, pred, NIL, mt );
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym77$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const78$EverythingPSC, thread );
        kb_mapping.map_predicate_extent_index( $sym76$TMS_RECONSIDER_ASSERTION, pred, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42901L)
  public static SubLObject tms_reconsider_gaf_args(final SubLObject v_term, final SubLObject arg, SubLObject predicate, SubLObject mt)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt )
    {
      kb_mapping.map_gaf_arg_index( $sym76$TMS_RECONSIDER_ASSERTION, v_term, arg, predicate, NIL, mt );
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym77$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const78$EverythingPSC, thread );
        kb_mapping.map_gaf_arg_index( $sym76$TMS_RECONSIDER_ASSERTION, v_term, arg, predicate, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43250L)
  public static SubLObject tms_reconsider_term(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym75$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        kb_mapping.map_term( $sym76$TMS_RECONSIDER_ASSERTION, v_term );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym77$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const78$EverythingPSC, thread );
        kb_mapping.map_term( $sym76$TMS_RECONSIDER_ASSERTION, v_term );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43565L)
  public static SubLObject tms_reconsider_all_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str79$Reconsidering_assertion_arguments;
    final SubLObject total_$24 = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$25 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$25, $kw29$SKIP ) )
        {
          final SubLObject idx_$26 = idx_$25;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$26, $kw29$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$26 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw29$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != tms_reconsider_assertion( assertion ) )
                {
                  total = Numbers.add( total, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total_$24 );
              }
            }
          }
          final SubLObject idx_$27 = idx_$25;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$27 ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$27 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$27 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$27 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw29$SKIP ) ) ? NIL : $kw29$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != tms_reconsider_assertion( assertion2 ) )
                {
                  total = Numbers.add( total, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total_$24 );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43785L)
  public static SubLObject stale_support(final SubLObject support)
  {
    assert NIL != arguments.support_p( support ) : support;
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return makeBoolean( NIL == uncanonicalizer.assertion_el_formula( support ) || NIL == assertions_high.valid_assertion( support, UNPROVIDED ) );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return makeBoolean( NIL == kb_hl_supports_high.verify_kb_hl_support( support ) );
    }
    return makeBoolean( NIL == hl_supports.hl_verify( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44165L)
  public static SubLObject stale_support_mtP(final SubLObject support, final SubLObject deduction_mt)
  {
    return makeBoolean( NIL == support_mt_okP( support, deduction_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44352L)
  public static SubLObject support_mt_okP(final SubLObject support, final SubLObject deduction_mt)
  {
    final SubLObject pcase_var;
    final SubLObject support_mt = pcase_var = arguments.support_mt( support );
    if( pcase_var.eql( $const54$InferencePSC ) || pcase_var.eql( $const78$EverythingPSC ) )
    {
      return T;
    }
    return genl_mts.genl_mtP( deduction_mt, support_mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44761L)
  public static SubLObject assertion_asserted_more_specifically_deductions(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject deductions = NIL;
    if( NIL != assertions_high.deduced_assertionP( assertion ) )
    {
      final SubLObject mt = assertions_high.assertion_mt( assertion );
      SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
      SubLObject deduction = NIL;
      deduction = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != deduction_handles.deduction_p( deduction ) )
        {
          SubLObject reconsiderP;
          SubLObject rest;
          SubLObject support;
          for( reconsiderP = NIL, rest = NIL, rest = deductions_high.deduction_supports( deduction ); NIL == reconsiderP && NIL != rest; rest = rest.rest() )
          {
            support = rest.first();
            if( NIL != indexing_utilities.rule_with_some_asserted_more_specifically_pragmaticP( support, mt ) )
            {
              reconsiderP = T;
            }
          }
          if( NIL != reconsiderP )
          {
            deductions = ConsesLow.cons( deduction, deductions );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        deduction = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( deductions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45848L)
  public static SubLObject bulk_remove_assertions(final SubLObject assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject before = assertion_handles.assertion_count();
    final SubLObject doomed_assertion_set = set.new_set( Symbols.symbol_function( EQL ), Sequences.length( assertions ) );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str81$Computing_doomed_dependents, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( assertions ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = assertions;
        SubLObject ass = NIL;
        ass = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject dependent_assertion_table = assertions_low.assertion_dependencies( ass );
          SubLObject doomed = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( dependent_assertion_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              doomed = Hashtables.getEntryKey( cdohash_entry );
              value = Hashtables.getEntryValue( cdohash_entry );
              set.set_add( doomed, doomed_assertion_set );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          ass = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    SubLObject doomed_assertions = set.set_element_list( doomed_assertion_set );
    SubLObject list_var;
    doomed_assertions = ( list_var = Sort.sort( doomed_assertions, Symbols.symbol_function( $sym83$_ ), Symbols.symbol_function( $sym84$ASSERTION_ID ) ) );
    SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
    SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
    SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
    SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
    SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str85$Precaching_indices, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var2 = list_var;
        SubLObject doomed2 = NIL;
        doomed2 = csome_list_var2.first();
        while ( NIL != csome_list_var2)
        {
          cycl_utilities.assertion_map( Symbols.symbol_function( $sym86$TERM_INDEX ), doomed2, UNPROVIDED, UNPROVIDED );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var2 = csome_list_var2.rest();
          doomed2 = csome_list_var2.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
    }
    list_var = doomed_assertions;
    _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
    _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
    _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
    _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
    _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str87$Removing_assertions, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var2 = list_var;
        SubLObject doomed2 = NIL;
        doomed2 = csome_list_var2.first();
        while ( NIL != csome_list_var2)
        {
          tms_remove_assertion( doomed2 );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var2 = csome_list_var2.rest();
          doomed2 = csome_list_var2.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
    }
    final SubLObject after = assertion_handles.assertion_count();
    return Numbers.subtract( before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47557L)
  public static SubLObject remove_circularly_supported_assertions(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str89$Removing_circularly_supported_ass;
    final SubLObject total_$32 = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$33 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$33, $kw29$SKIP ) )
        {
          final SubLObject idx_$34 = idx_$33;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$34, $kw29$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$34 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw29$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != remove_if_circularly_supported_assertion( assertion, verboseP ) )
                {
                  total = Numbers.add( total, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total_$32 );
              }
            }
          }
          final SubLObject idx_$35 = idx_$33;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$35 ) || NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$35 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$35 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$35 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw29$SKIP ) ) ? NIL : $kw29$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw29$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != remove_if_circularly_supported_assertion( assertion2, verboseP ) )
                {
                  total = Numbers.add( total, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total_$32 );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    if( NIL != verboseP )
    {
      PrintLow.format( T, $str90$_____S_circularly_supported_asser, total );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47932L)
  public static SubLObject remove_if_circularly_supported_assertion(final SubLObject assertion, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    if( NIL == some_belief_justification( assertion, UNPROVIDED ) )
    {
      if( NIL != verboseP )
      {
        PrintLow.format( T, $str91$__Removing__S, assertion );
      }
      tms_remove_assertion( assertion );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48203L)
  public static SubLObject independently_deducible_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertions_high.deduced_assertionP( assertion ) && NIL != some_belief_justification( assertion, ConsesLow.list( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48507L)
  public static SubLObject some_belief_justification(final SubLObject assertion, SubLObject asserted_assertions_to_ignore)
  {
    if( asserted_assertions_to_ignore == UNPROVIDED )
    {
      asserted_assertions_to_ignore = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != assertions_high.asserted_assertionP( assertion ) && NIL == list_utilities.member_kbeqP( assertion, asserted_assertions_to_ignore ) )
    {
      return T;
    }
    if( NIL == assertions_high.assertion_arguments( assertion ) )
    {
      return NIL;
    }
    SubLObject just_found = NIL;
    final SubLObject _prev_bind_0 = $circular_deductions$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $circular_assertions$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $circular_local_assertions$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $circular_target_assertion$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $circular_complexity_count$.currentBinding( thread );
    try
    {
      $circular_deductions$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      $circular_assertions$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      $circular_local_assertions$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      $circular_target_assertion$.bind( assertion, thread );
      $circular_complexity_count$.bind( ZERO_INTEGER, thread );
      try
      {
        thread.throwStack.push( $kw92$JUST_FOUND );
        SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != deduction_handles.deduction_p( argument ) )
          {
            gather_circular_deduction( argument, asserted_assertions_to_ignore );
          }
          cdolist_list_var = cdolist_list_var.rest();
          argument = cdolist_list_var.first();
        }
        final SubLObject set_contents_var = set.do_set_internal( $circular_assertions$.getDynamicValue( thread ) );
        SubLObject basis_object;
        SubLObject state;
        SubLObject supported_assertion;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          supported_assertion = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, supported_assertion ) && NIL != assertions_high.asserted_assertionP( supported_assertion ) && NIL == list_utilities.member_kbeqP(
              supported_assertion, asserted_assertions_to_ignore ) )
          {
            mark_circular_assertion( supported_assertion );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        just_found = Errors.handleThrowable( ccatch_env_var, $kw92$JUST_FOUND );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      $circular_complexity_count$.rebind( _prev_bind_5, thread );
      $circular_target_assertion$.rebind( _prev_bind_4, thread );
      $circular_local_assertions$.rebind( _prev_bind_3, thread );
      $circular_assertions$.rebind( _prev_bind_2, thread );
      $circular_deductions$.rebind( _prev_bind_0, thread );
    }
    return just_found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49791L)
  public static SubLObject inc_circular_complexity_count(SubLObject witness)
  {
    if( witness == UNPROVIDED )
    {
      witness = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $circular_complexity_count$.setDynamicValue( Numbers.add( $circular_complexity_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    if( NIL != $circular_complexity_count_limit$.getDynamicValue( thread ) && $circular_complexity_count$.getDynamicValue( thread ).numG( $circular_complexity_count_limit$.getDynamicValue( thread ) ) )
    {
      Dynamic.sublisp_throw( $kw92$JUST_FOUND, $circular_complexity_count_limit$.getDynamicValue( thread ) );
    }
    return $circular_complexity_count$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50498L)
  public static SubLObject gather_circular_deduction(final SubLObject deduction, final SubLObject asserted_assertions_to_ignore)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == set.set_memberP( deduction, $circular_deductions$.getDynamicValue( thread ) ) )
    {
      set.set_add( deduction, $circular_deductions$.getDynamicValue( thread ) );
      inc_circular_complexity_count( deduction );
      SubLObject cdolist_list_var = deductions_high.deduction_supports( deduction );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertion_handles.assertion_p( assertion ) && NIL == set.set_memberP( assertion, $circular_assertions$.getDynamicValue( thread ) ) )
        {
          set.set_add( assertion, $circular_assertions$.getDynamicValue( thread ) );
          inc_circular_complexity_count( assertion );
          if( NIL == assertions_high.asserted_assertionP( assertion ) || NIL != list_utilities.member_kbeqP( assertion, asserted_assertions_to_ignore ) )
          {
            SubLObject cdolist_list_var_$37 = assertions_high.assertion_arguments( assertion );
            SubLObject argument = NIL;
            argument = cdolist_list_var_$37.first();
            while ( NIL != cdolist_list_var_$37)
            {
              if( NIL != deduction_handles.deduction_p( argument ) )
              {
                gather_circular_deduction( argument, asserted_assertions_to_ignore );
              }
              cdolist_list_var_$37 = cdolist_list_var_$37.rest();
              argument = cdolist_list_var_$37.first();
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51323L)
  public static SubLObject mark_circular_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( assertion.eql( $circular_target_assertion$.getDynamicValue( thread ) ) )
    {
      Dynamic.sublisp_throw( $kw92$JUST_FOUND, T );
    }
    if( NIL == set.set_memberP( assertion, $circular_local_assertions$.getDynamicValue( thread ) ) )
    {
      set.set_add( assertion, $circular_local_assertions$.getDynamicValue( thread ) );
      SubLObject cdolist_list_var = circular_deductions_with_assertion( assertion );
      SubLObject deduction = NIL;
      deduction = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != believed_circular_deductionP( deduction ) )
        {
          mark_circular_assertion( deductions_high.deduction_assertion( deduction ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        deduction = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51957L)
  public static SubLObject circular_deductions_with_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject set_contents_var = set.do_set_internal( $circular_deductions$.getDynamicValue( thread ) );
    SubLObject basis_object;
    SubLObject state;
    SubLObject deduction;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      deduction = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) && NIL != list_utilities.member_kbeqP( assertion, deductions_high.deduction_supports( deduction ) ) )
      {
        ans = ConsesLow.cons( deduction, ans );
      }
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52202L)
  public static SubLObject believed_circular_deductionP(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject witness;
    SubLObject rest;
    SubLObject support;
    for( witness = NIL, rest = NIL, rest = deductions_high.deduction_supports( deduction ); NIL == witness && NIL != rest; rest = rest.rest() )
    {
      support = rest.first();
      if( NIL != assertion_handles.assertion_p( support ) && NIL == set.set_memberP( support, $circular_local_assertions$.getDynamicValue( thread ) ) )
      {
        witness = support;
      }
    }
    return makeBoolean( NIL == witness );
  }

  public static SubLObject declare_tms_file()
  {
    SubLFiles.declareFunction( me, "tms_any_assertion_being_removedP", "TMS-ANY-ASSERTION-BEING-REMOVED?", 0, 0, false );
    SubLFiles.declareFunction( me, "tms_assertion_being_removedP", "TMS-ASSERTION-BEING-REMOVED?", 1, 0, false );
    SubLFiles.declareMacro( me, "tms_note_assertion_being_removed", "TMS-NOTE-ASSERTION-BEING-REMOVED" );
    SubLFiles.declareFunction( me, "tms_deduction_being_removedP", "TMS-DEDUCTION-BEING-REMOVED?", 1, 0, false );
    SubLFiles.declareMacro( me, "tms_note_deduction_being_removed", "TMS-NOTE-DEDUCTION-BEING-REMOVED" );
    SubLFiles.declareFunction( me, "tms_argument_being_removedP", "TMS-ARGUMENT-BEING-REMOVED?", 1, 0, false );
    SubLFiles.declareMacro( me, "tms_note_argument_being_removed", "TMS-NOTE-ARGUMENT-BEING-REMOVED" );
    SubLFiles.declareFunction( me, "tms_can_kill_forts_for_meP", "TMS-CAN-KILL-FORTS-FOR-ME?", 0, 0, false );
    SubLFiles.declareFunction( me, "tms_please_kill_this_term_for_me", "TMS-PLEASE-KILL-THIS-TERM-FOR-ME", 1, 0, false );
    SubLFiles.declareMacro( me, "tms_killing_forts_later", "TMS-KILLING-FORTS-LATER" );
    SubLFiles.declareMacro( me, "tms_without_forts_to_kill_list", "TMS-WITHOUT-FORTS-TO-KILL-LIST" );
    SubLFiles.declareFunction( me, "tms_forts_to_kill", "TMS-FORTS-TO-KILL", 0, 0, false );
    SubLFiles.declareFunction( me, "tms_fort_to_killP", "TMS-FORT-TO-KILL?", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_kill_queued_forts", "TMS-KILL-QUEUED-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "tms_possibly_replace_asserted_argument_with_tv", "TMS-POSSIBLY-REPLACE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false );
    SubLFiles.declareFunction( me, "tms_create_asserted_argument_with_tv", "TMS-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 1, false );
    SubLFiles.declareFunction( me, "tms_add_new_deduction", "TMS-ADD-NEW-DEDUCTION", 3, 2, false );
    SubLFiles.declareFunction( me, "tms_postprocess_new_argument", "TMS-POSTPROCESS-NEW-ARGUMENT", 2, 1, false );
    SubLFiles.declareFunction( me, "tms_remove_argument", "TMS-REMOVE-ARGUMENT", 2, 1, false );
    SubLFiles.declareFunction( me, "tms_propagate_removed_argument", "TMS-PROPAGATE-REMOVED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_assertion_list", "TMS-REMOVE-ASSERTION-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_nonempty_assertion_list", "TMS-REMOVE-NONEMPTY-ASSERTION-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_assertion", "TMS-REMOVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_assertion_int", "TMS-REMOVE-ASSERTION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_assertion_low", "TMS-REMOVE-ASSERTION-LOW", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_deduction", "TMS-REMOVE-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_change_asserted_argument_tv", "TMS-CHANGE-ASSERTED-ARGUMENT-TV", 3, 0, false );
    SubLFiles.declareFunction( me, "tms_recompute_assertion_tv", "TMS-RECOMPUTE-ASSERTION-TV", 1, 2, false );
    SubLFiles.declareFunction( me, "tms_change_direction", "TMS-CHANGE-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "tms_should_schedule_assertion_for_forward_propagationP", "TMS-SHOULD-SCHEDULE-ASSERTION-FOR-FORWARD-PROPAGATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_possibly_schedule_assertion_for_forward_propagation", "TMS-POSSIBLY-SCHEDULE-ASSERTION-FOR-FORWARD-PROPAGATION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_recompute_dependents", "TMS-RECOMPUTE-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_handle_after_addings", "TMS-HANDLE-AFTER-ADDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_dependents", "TMS-REMOVE-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_recompute_dependents_tv", "TMS-RECOMPUTE-DEPENDENTS-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_recompute_deduction_tv", "TMS-RECOMPUTE-DEDUCTION-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_mt_arguments", "TMS-REMOVE-MT-ARGUMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "except_propagation_ruleX_initializer", "*EXCEPT-PROPAGATION-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "perform_except_propagation", "PERFORM-EXCEPT-PROPAGATION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_deduction_for_assertion", "TMS-REMOVE-DEDUCTION-FOR-ASSERTION", 2, 1, false );
    SubLFiles.declareFunction( me, "tms_explicitly_remove_deduction_for_assertion", "TMS-EXPLICITLY-REMOVE-DEDUCTION-FOR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_add_deduction_for_assertion", "TMS-ADD-DEDUCTION-FOR-ASSERTION", 2, 3, false );
    SubLFiles.declareFunction( me, "tms_add_deduction_for_cnf", "TMS-ADD-DEDUCTION-FOR-CNF", 3, 5, false );
    SubLFiles.declareFunction( me, "tms_direct_circularity", "TMS-DIRECT-CIRCULARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "tms_directly_circular_deduction", "TMS-DIRECTLY-CIRCULAR-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_invalidate_weaker_redundant_arguments", "TMS-INVALIDATE-WEAKER-REDUNDANT-ARGUMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "tms_weaker_redundant_arguments", "TMS-WEAKER-REDUNDANT-ARGUMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "tms_remove_weaker_redundant_argument", "TMS-REMOVE-WEAKER-REDUNDANT-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "deduction_with_one_tou_supportP", "DEDUCTION-WITH-ONE-TOU-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_with_one_equality_support_matchingP", "DEDUCTION-WITH-ONE-EQUALITY-SUPPORT-MATCHING?", 2, 0, false );
    SubLFiles.declareFunction( me, "equality_support_matchingP", "EQUALITY-SUPPORT-MATCHING?", 2, 0, false );
    SubLFiles.declareFunction( me, "atomic_cnf_trivially_derivable", "ATOMIC-CNF-TRIVIALLY-DERIVABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_trivially_derivable", "GAF-TRIVIALLY-DERIVABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "true_gaf_trivially_derivable", "TRUE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "false_gaf_trivially_derivable", "FALSE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "tms_reconsider_assertion_deductions", "TMS-RECONSIDER-ASSERTION-DEDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reconsider_assertion_dependents", "TMS-RECONSIDER-ASSERTION-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reconsider_deduction", "TMS-RECONSIDER-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_deduction_stale_wrt_supportsP", "TMS-DEDUCTION-STALE-WRT-SUPPORTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_deduction_stale_wrt_exceptionsP", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_deduction_stale_wrt_exceptionsP_lifting_rule_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-LIFTING-RULE-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_deduction_stale_wrt_exceptionsP_backchain_forbidden_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-BACKCHAIN-FORBIDDEN-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_deduction_stale_wrt_exceptionsP_query_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-QUERY-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reprove_deduction_query_sentence", "TMS-REPROVE-DEDUCTION-QUERY-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reprove_deduction_query_mt", "TMS-REPROVE-DEDUCTION-QUERY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reprove_deduction_query_properties", "TMS-REPROVE-DEDUCTION-QUERY-PROPERTIES", 5, 0, false );
    SubLFiles.declareFunction( me, "tms_deduction_stale_wrt_exceptionsP_general_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_assertibles_queue_for_tms_deduction_stale_wrt_exceptionsP_general_version", "COMPUTE-ASSERTIBLES-QUEUE-FOR-TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "tms_deduction_stale_wrt_exceptionsP_use_deduction_bindings_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-USE-DEDUCTION-BINDINGS-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reconsider_assertion", "TMS-RECONSIDER-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reconsider_mt", "TMS-RECONSIDER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "tms_reconsider_term_gafs", "TMS-RECONSIDER-TERM-GAFS", 1, 1, false );
    SubLFiles.declareFunction( me, "tms_reconsider_predicate_extent", "TMS-RECONSIDER-PREDICATE-EXTENT", 1, 1, false );
    SubLFiles.declareFunction( me, "tms_reconsider_gaf_args", "TMS-RECONSIDER-GAF-ARGS", 2, 2, false );
    SubLFiles.declareFunction( me, "tms_reconsider_term", "TMS-RECONSIDER-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "tms_reconsider_all_assertions", "TMS-RECONSIDER-ALL-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "stale_support", "STALE-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "stale_support_mtP", "STALE-SUPPORT-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "support_mt_okP", "SUPPORT-MT-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "assertion_asserted_more_specifically_deductions", "ASSERTION-ASSERTED-MORE-SPECIFICALLY-DEDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "bulk_remove_assertions", "BULK-REMOVE-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_circularly_supported_assertions", "REMOVE-CIRCULARLY-SUPPORTED-ASSERTIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "remove_if_circularly_supported_assertion", "REMOVE-IF-CIRCULARLY-SUPPORTED-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "independently_deducible_assertionP", "INDEPENDENTLY-DEDUCIBLE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "some_belief_justification", "SOME-BELIEF-JUSTIFICATION", 1, 1, false );
    SubLFiles.declareFunction( me, "inc_circular_complexity_count", "INC-CIRCULAR-COMPLEXITY-COUNT", 0, 1, false );
    SubLFiles.declareFunction( me, "gather_circular_deduction", "GATHER-CIRCULAR-DEDUCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "mark_circular_assertion", "MARK-CIRCULAR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "circular_deductions_with_assertion", "CIRCULAR-DEDUCTIONS-WITH-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "believed_circular_deductionP", "BELIEVED-CIRCULAR-DEDUCTION?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_tms_file()
  {
    $tms_debugP$ = SubLFiles.defparameter( "*TMS-DEBUG?*", NIL );
    $tms_assertions_being_removed$ = SubLFiles.defparameter( "*TMS-ASSERTIONS-BEING-REMOVED*", NIL );
    $tms_deductions_being_removed$ = SubLFiles.defparameter( "*TMS-DEDUCTIONS-BEING-REMOVED*", NIL );
    $tms_forts_to_kill$ = SubLFiles.defparameter( "*TMS-FORTS-TO-KILL*", $kw13$UNINITIALIZED );
    $tms_remove_assertion_lowP$ = SubLFiles.defparameter( "*TMS-REMOVE-ASSERTION-LOW?*", NIL );
    $recursive_tms_bugP$ = SubLFiles.defparameter( "*RECURSIVE-TMS-BUG?*", NIL );
    $except_propagation_rule$ = SubLFiles.defvar( "*EXCEPT-PROPAGATION-RULE*", $kw13$UNINITIALIZED );
    $use_backchain_forbidden_deduction_stale_wrt_exceptionsP_general_versionP$ = SubLFiles.defparameter( "*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION?*", NIL );
    $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$ = SubLFiles.defparameter( "*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS-HACK?*", T );
    $circular_deductions$ = SubLFiles.defparameter( "*CIRCULAR-DEDUCTIONS*", $kw13$UNINITIALIZED );
    $circular_assertions$ = SubLFiles.defparameter( "*CIRCULAR-ASSERTIONS*", $kw13$UNINITIALIZED );
    $circular_local_assertions$ = SubLFiles.defparameter( "*CIRCULAR-LOCAL-ASSERTIONS*", $kw13$UNINITIALIZED );
    $circular_target_assertion$ = SubLFiles.defparameter( "*CIRCULAR-TARGET-ASSERTION*", $kw13$UNINITIALIZED );
    $circular_complexity_count$ = SubLFiles.defparameter( "*CIRCULAR-COMPLEXITY-COUNT*", $kw13$UNINITIALIZED );
    $circular_complexity_count_limit$ = SubLFiles.defparameter( "*CIRCULAR-COMPLEXITY-COUNT-LIMIT*", $int88$250 );
    return NIL;
  }

  public static SubLObject setup_tms_file()
  {
    utilities_macros.register_kb_variable_initialization( $sym30$_EXCEPT_PROPAGATION_RULE_, $sym31$_EXCEPT_PROPAGATION_RULE__INITIALIZER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_tms_file();
  }

  @Override
  public void initializeVariables()
  {
    init_tms_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_tms_file();
  }
  static
  {
    me = new tms();
    $tms_debugP$ = null;
    $tms_assertions_being_removed$ = null;
    $tms_deductions_being_removed$ = null;
    $tms_forts_to_kill$ = null;
    $tms_remove_assertion_lowP$ = null;
    $recursive_tms_bugP$ = null;
    $except_propagation_rule$ = null;
    $use_backchain_forbidden_deduction_stale_wrt_exceptionsP_general_versionP$ = null;
    $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$ = null;
    $circular_deductions$ = null;
    $circular_assertions$ = null;
    $circular_local_assertions$ = null;
    $circular_target_assertion$ = null;
    $circular_complexity_count$ = null;
    $circular_complexity_count_limit$ = null;
    $sym0$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$_TMS_ASSERTIONS_BEING_REMOVED_ = makeSymbol( "*TMS-ASSERTIONS-BEING-REMOVED*" );
    $sym4$ADJOIN = makeSymbol( "ADJOIN" );
    $list5 = ConsesLow.list( makeSymbol( "*TMS-ASSERTIONS-BEING-REMOVED*" ) );
    $sym6$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym8$_TMS_DEDUCTIONS_BEING_REMOVED_ = makeSymbol( "*TMS-DEDUCTIONS-BEING-REMOVED*" );
    $list9 = ConsesLow.list( makeSymbol( "*TMS-DEDUCTIONS-BEING-REMOVED*" ) );
    $sym10$PIF = makeSymbol( "PIF" );
    $sym11$TMS_NOTE_DEDUCTION_BEING_REMOVED = makeSymbol( "TMS-NOTE-DEDUCTION-BEING-REMOVED" );
    $sym12$PROGN = makeSymbol( "PROGN" );
    $kw13$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym14$KBEQ = makeSymbol( "KBEQ" );
    $list15 = ConsesLow.list( makeSymbol( "TMS-CAN-KILL-FORTS-FOR-ME?" ) );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "*TMS-FORTS-TO-KILL*" ), NIL ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "TMS-KILL-QUEUED-FORTS" ) ) );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "*TMS-FORTS-TO-KILL*" ), makeKeyword( "UNINITIALIZED" ) ) );
    $sym19$ARGUMENT_P = makeSymbol( "ARGUMENT-P" );
    $sym20$ASSERTED_ARGUMENT_P = makeSymbol( "ASSERTED-ARGUMENT-P" );
    $sym21$TV_P = makeSymbol( "TV-P" );
    $kw22$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym23$DIRECTION_P = makeSymbol( "DIRECTION-P" );
    $sym24$HLMT_P = makeSymbol( "HLMT-P" );
    $kw25$MT = makeKeyword( "MT" );
    $kw26$BROAD_MT = makeKeyword( "BROAD-MT" );
    $str27$do_broad_mt_index = makeString( "do-broad-mt-index" );
    $sym28$STRINGP = makeSymbol( "STRINGP" );
    $kw29$SKIP = makeKeyword( "SKIP" );
    $sym30$_EXCEPT_PROPAGATION_RULE_ = makeSymbol( "*EXCEPT-PROPAGATION-RULE*" );
    $sym31$_EXCEPT_PROPAGATION_RULE__INITIALIZER = makeSymbol( "*EXCEPT-PROPAGATION-RULE*-INITIALIZER" );
    $list32 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeSymbol( "?GENL-GAF" ), makeSymbol( "?SENTENCE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "assertionSentence" ) ), makeSymbol( "?SPEC-GAF" ), makeSymbol( "?SENTENCE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeSymbol( "?SPEC-GAF" ),
                makeSymbol( "?GENL-GAF" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeSymbol( "?GENL-GAF" ), makeSymbol( "?GENL-TRUTH" ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeSymbol( "?SPEC-GAF" ), makeSymbol( "?SPEC-TRUTH" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "different" ) ), makeSymbol( "?SPEC-TRUTH" ), makeSymbol( "?GENL-TRUTH" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeSymbol(
                            "?GENL-GAF" ), makeSymbol( "?GENL-MT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeSymbol( "?SPEC-GAF" ), makeSymbol( "?SPEC-MT" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), makeSymbol( "?SPEC-MT" ), makeSymbol( "?GENL-MT" ) )
    } ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), makeSymbol( "?SPEC-MT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "except" ) ), makeSymbol(
        "?GENL-GAF" ) ) ) );
    $const33$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const34$except = constant_handles.reader_make_constant_shell( makeString( "except" ) );
    $kw35$TRUE = makeKeyword( "TRUE" );
    $kw36$FORWARD = makeKeyword( "FORWARD" );
    $kw37$BACKWARD = makeKeyword( "BACKWARD" );
    $kw38$EQUALITY = makeKeyword( "EQUALITY" );
    $sym39$CNF_P = makeSymbol( "CNF-P" );
    $kw40$FALSE = makeKeyword( "FALSE" );
    $str41$_S_was_not_an_atomic_CNF_ = makeString( "~S was not an atomic CNF." );
    $const42$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list43 = ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $const44$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym45$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $sym46$RULE_HAS_EXCEPTIONS_ = makeSymbol( "RULE-HAS-EXCEPTIONS?" );
    $sym47$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_ = makeSymbol( "RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?" );
    $sym48$LIFTING_RULE_ = makeSymbol( "LIFTING-RULE?" );
    $sym49$INFERENCE_BACKCHAIN_FORBIDDEN_ = makeSymbol( "INFERENCE-BACKCHAIN-FORBIDDEN?" );
    $sym50$_EXIT = makeSymbol( "%EXIT" );
    $sym51$_PRED = makeSymbol( "?PRED" );
    $const52$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const53$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const54$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym55$UNBOUND_PREDICATE_RULE_P = makeSymbol( "UNBOUND-PREDICATE-RULE-P" );
    $kw56$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $kw57$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw58$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw59$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $kw60$PROOF = makeKeyword( "PROOF" );
    $kw61$RETURN = makeKeyword( "RETURN" );
    $kw62$SUPPORTS = makeKeyword( "SUPPORTS" );
    $kw63$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw64$HL = makeKeyword( "HL" );
    $kw65$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw66$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $kw67$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $kw68$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw69$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $str70$_tms_deduction_stale_wrt_exceptio = makeString( "(tms-deduction-stale-wrt-exceptions?-general-version (find-deduction-by-id ~A)) not yet implemented to deductions not supporting assertions" );
    $str71$_tms_deduction_stale_wrt_exceptio = makeString(
        "(tms-deduction-stale-wrt-exceptions?-general-version (find-deduction-by-id ~A)) could not find GAF assertion to repropagate against rule (supported-object=~S)" );
    $sym72$QUEUE_P = makeSymbol( "QUEUE-P" );
    $str73$Found_deduction__A_supporting_wit = makeString( "Found deduction ~A supporting with bindings but no rule?!  Aborting tms wrt exceptions." );
    $str74$Performing_full_TMS_on_mt__S = makeString( "Performing full TMS on mt ~S" );
    $sym75$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym76$TMS_RECONSIDER_ASSERTION = makeSymbol( "TMS-RECONSIDER-ASSERTION" );
    $sym77$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const78$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str79$Reconsidering_assertion_arguments = makeString( "Reconsidering assertion arguments" );
    $sym80$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $str81$Computing_doomed_dependents = makeString( "Computing doomed dependents" );
    $str82$cdolist = makeString( "cdolist" );
    $sym83$_ = makeSymbol( ">" );
    $sym84$ASSERTION_ID = makeSymbol( "ASSERTION-ID" );
    $str85$Precaching_indices = makeString( "Precaching indices" );
    $sym86$TERM_INDEX = makeSymbol( "TERM-INDEX" );
    $str87$Removing_assertions = makeString( "Removing assertions" );
    $int88$250 = makeInteger( 250 );
    $str89$Removing_circularly_supported_ass = makeString( "Removing circularly supported assertions" );
    $str90$_____S_circularly_supported_asser = makeString( "~%~%~S circularly supported assertions removed" );
    $str91$__Removing__S = makeString( "~%Removing ~S" );
    $kw92$JUST_FOUND = makeKeyword( "JUST-FOUND" );
  }
}
/*
 * 
 * Total time: 1083 ms
 * 
 */