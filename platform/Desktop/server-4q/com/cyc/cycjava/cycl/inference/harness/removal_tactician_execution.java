package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_tactician_execution
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution";
  public static final String myFingerPrint = "04be76b85e98b5daa1bfdd184a00027d3f6d575705957b0ab978c1b7192bede7";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 3953L)
  private static SubLSymbol $removal_strategy_does_not_activate_disallowed_tacticsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 5916L)
  public static SubLSymbol $removal_strategy_removal_tactic_iterativity_enabledP$;
  private static final SubLSymbol $sym0$REMOVAL_STRATEGY_DONE_;
  private static final SubLSymbol $kw1$UNINTERESTING;
  private static final SubLSymbol $kw2$DONE;
  private static final SubLString $str3$_s_says_it_s_done__but_its_R_box_;
  private static final SubLSymbol $sym4$REMOVAL_STRATEGY_DO_ONE_STEP;
  private static final SubLSymbol $kw5$SELECT_BEST_STRATEGEM;
  private static final SubLSymbol $sym6$REMOVAL_STRATEGY_P;
  private static final SubLSymbol $kw7$SET_ASIDE;
  private static final SubLSymbol $kw8$THROW_AWAY;
  private static final SubLSymbol $sym9$STRATEGEM_P;
  private static final SubLSymbol $kw10$INTERESTING;
  private static final SubLString $str11$removal_tactician_does_not_handle;
  private static final SubLString $str12$_S_was_an_unexpected_strategem;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 904L)
  public static SubLObject removal_strategy_doneP(final SubLObject strategy)
  {
    return makeBoolean( NIL != removal_tactician_datastructures.removal_strategy_no_strategems_activeP( strategy ) && NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 1181L)
  public static SubLObject removal_strategy_do_one_step(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result;
    for( result = $kw1$UNINTERESTING; $kw1$UNINTERESTING == result; result = removal_strategy_do_one_step_int( strategy ) )
    {
    }
    if( NIL != control_vars.$inference_debugP$.getDynamicValue( thread ) && $kw2$DONE == result && NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP( strategy ) )
    {
      Errors.cerror( $str3$_s_says_it_s_done__but_its_R_box_, strategy );
    }
    return Equality.eq( $kw2$DONE, result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 1606L)
  public static SubLObject removal_strategy_do_one_step_int(final SubLObject strategy)
  {
    SubLObject result = NIL;
    if( NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP( strategy ) )
    {
      inference_tactician.strategy_reconsider_set_asides( strategy );
      result = $kw1$UNINTERESTING;
    }
    else if( NIL != inference_tactician.strategy_doneP( strategy ) )
    {
      result = $kw2$DONE;
    }
    else
    {
      final SubLObject strategem = removal_strategy_select_best_strategem( strategy );
      if( NIL != strategem )
      {
        if( NIL != inference_datastructures_tactic.invalid_tactic_p( strategem ) )
        {
          result = $kw1$UNINTERESTING;
        }
        else
        {
          result = inference_tactician.strategy_execute_strategem( strategy, strategem );
        }
      }
      else
      {
        result = $kw2$DONE;
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 2359L)
  public static SubLObject removal_strategy_select_best_strategem(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw5$SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 2665L)
  public static SubLObject removal_strategy_default_select_best_strategem(final SubLObject strategy)
  {
    removal_strategy_quiesce( strategy );
    if( NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP( strategy ) )
    {
      return removal_tactician_datastructures.removal_strategy_pop_strategem( strategy );
    }
    if( NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP( strategy ) )
    {
      return inference_datastructures_strategy.strategy_answer_link( strategy );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 3096L)
  public static SubLObject removal_strategy_quiesce(final SubLObject strategy)
  {
    assert NIL != removal_tactician.removal_strategy_p( strategy ) : strategy;
    while ( true)
    {
      final SubLObject candidate_strategem = removal_tactician_datastructures.removal_strategy_peek_strategem( strategy );
      if( NIL == candidate_strategem )
      {
        return NIL;
      }
      final SubLObject reason = removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_strategem( strategy, candidate_strategem );
      if( NIL == reason )
      {
        return candidate_strategem;
      }
      final SubLObject pcase_var = reason;
      if( pcase_var.eql( $kw7$SET_ASIDE ) )
      {
        removal_tactician_datastructures.removal_strategy_note_strategem_set_aside( strategy, candidate_strategem );
      }
      else if( pcase_var.eql( $kw8$THROW_AWAY ) )
      {
        removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away( strategy, candidate_strategem );
      }
      removal_tactician_datastructures.removal_strategy_pop_strategem( strategy );
      removal_tactician_motivation.removal_strategy_strategically_deactivate_strategem( strategy, candidate_strategem );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 4076L)
  public static SubLObject removal_strategy_execute_strategem(final SubLObject strategy, final SubLObject strategem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != removal_tactician.removal_strategy_p( strategy ) : strategy;
    assert NIL != inference_tactician.strategem_p( strategem ) : strategem;
    SubLObject result = $kw1$UNINTERESTING;
    if( NIL != inference_tactician.executable_strategem_p( strategem ) )
    {
      final SubLObject problem = inference_tactician.strategem_problem( strategem );
      removal_tactician_motivation.removal_strategy_deactivate_strategem( strategy, strategem );
      removal_strategy_execute_tactic( strategy, strategem );
      removal_tactician_motivation.removal_strategy_possibly_deactivate_problem( strategy, problem );
      result = $kw10$INTERESTING;
    }
    else if( NIL != inference_worker.logical_tactic_p( strategem ) )
    {
      if( NIL == $removal_strategy_does_not_activate_disallowed_tacticsP$.getDynamicValue( thread ) || NIL == inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP( strategem, strategy ) )
      {
        removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_link_head( strategy, strategem );
        final SubLObject problem = inference_tactician.strategem_problem( strategem );
        removal_tactician_motivation.removal_strategy_deactivate_strategem( strategy, strategem );
        inference_tactician.strategy_possibly_execute_tactic( strategy, strategem );
        removal_tactician_motivation.removal_strategy_possibly_deactivate_problem( strategy, problem );
        result = $kw10$INTERESTING;
      }
    }
    else
    {
      if( NIL != inference_worker_transformation.transformation_link_p( strategem ) )
      {
        return Errors.error( $str11$removal_tactician_does_not_handle, strategem );
      }
      if( NIL == inference_worker_answer.answer_link_p( strategem ) )
      {
        return Errors.error( $str12$_S_was_an_unexpected_strategem, strategem );
      }
      final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem( strategem );
      removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem( strategy, root_problem );
      inference_worker.possibly_propagate_answer_link( strategem );
      result = $kw10$INTERESTING;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6173L)
  public static SubLObject removal_strategy_execute_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    if( NIL != inference_worker.content_tactic_p( tactic ) )
    {
      return removal_strategy_execute_content_tactic( strategy, tactic );
    }
    return removal_strategy_execute_meta_structural_tactic( strategy, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6425L)
  public static SubLObject removal_strategy_execute_content_tactic(final SubLObject strategy, final SubLObject content_tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $removal_strategy_removal_tactic_iterativity_enabledP$.getDynamicValue( thread ) && NIL != inference_worker_removal.removal_tactic_p( content_tactic ) )
    {
      inference_tactician.strategy_execute_tactic( strategy, content_tactic );
      if( NIL != inference_datastructures_tactic.tactic_in_progressP( content_tactic ) )
      {
        removal_tactician_motivation.removal_strategy_reactivate_executable_strategem( strategy, content_tactic );
      }
    }
    else
    {
      removal_strategy_execute_executable_strategem( strategy, content_tactic );
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6966L)
  public static SubLObject removal_strategy_execute_meta_structural_tactic(final SubLObject strategy, final SubLObject meta_structural_tactic)
  {
    return removal_strategy_execute_executable_strategem( strategy, meta_structural_tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 7154L)
  public static SubLObject removal_strategy_execute_executable_strategem(final SubLObject strategy, final SubLObject strategem)
  {
    final SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP( strategem );
    if( NIL != already_in_progressP )
    {
      removal_tactician_motivation.removal_strategy_reactivate_executable_strategem( strategy, strategem );
    }
    inference_tactician.strategy_execute_tactic( strategy, strategem );
    if( NIL == already_in_progressP && NIL != inference_datastructures_tactic.tactic_in_progressP( strategem ) )
    {
      removal_tactician_motivation.removal_strategy_reactivate_executable_strategem( strategy, strategem );
    }
    return strategem;
  }

  public static SubLObject declare_removal_tactician_execution_file()
  {
    SubLFiles.declareFunction( me, "removal_strategy_doneP", "REMOVAL-STRATEGY-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_do_one_step", "REMOVAL-STRATEGY-DO-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_do_one_step_int", "REMOVAL-STRATEGY-DO-ONE-STEP-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_select_best_strategem", "REMOVAL-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_default_select_best_strategem", "REMOVAL-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_quiesce", "REMOVAL-STRATEGY-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_execute_strategem", "REMOVAL-STRATEGY-EXECUTE-STRATEGEM", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_execute_tactic", "REMOVAL-STRATEGY-EXECUTE-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_execute_content_tactic", "REMOVAL-STRATEGY-EXECUTE-CONTENT-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_execute_meta_structural_tactic", "REMOVAL-STRATEGY-EXECUTE-META-STRUCTURAL-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_strategy_execute_executable_strategem", "REMOVAL-STRATEGY-EXECUTE-EXECUTABLE-STRATEGEM", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_tactician_execution_file()
  {
    $removal_strategy_does_not_activate_disallowed_tacticsP$ = SubLFiles.defparameter( "*REMOVAL-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS?*", T );
    $removal_strategy_removal_tactic_iterativity_enabledP$ = SubLFiles.defparameter( "*REMOVAL-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*", T );
    return NIL;
  }

  public static SubLObject setup_removal_tactician_execution_file()
  {
    utilities_macros.note_funcall_helper_function( $sym0$REMOVAL_STRATEGY_DONE_ );
    utilities_macros.note_funcall_helper_function( $sym4$REMOVAL_STRATEGY_DO_ONE_STEP );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_tactician_execution_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_tactician_execution_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_tactician_execution_file();
  }
  static
  {
    me = new removal_tactician_execution();
    $removal_strategy_does_not_activate_disallowed_tacticsP$ = null;
    $removal_strategy_removal_tactic_iterativity_enabledP$ = null;
    $sym0$REMOVAL_STRATEGY_DONE_ = makeSymbol( "REMOVAL-STRATEGY-DONE?" );
    $kw1$UNINTERESTING = makeKeyword( "UNINTERESTING" );
    $kw2$DONE = makeKeyword( "DONE" );
    $str3$_s_says_it_s_done__but_its_R_box_ = makeString( "~s says it's done, but its R-box is nonempty" );
    $sym4$REMOVAL_STRATEGY_DO_ONE_STEP = makeSymbol( "REMOVAL-STRATEGY-DO-ONE-STEP" );
    $kw5$SELECT_BEST_STRATEGEM = makeKeyword( "SELECT-BEST-STRATEGEM" );
    $sym6$REMOVAL_STRATEGY_P = makeSymbol( "REMOVAL-STRATEGY-P" );
    $kw7$SET_ASIDE = makeKeyword( "SET-ASIDE" );
    $kw8$THROW_AWAY = makeKeyword( "THROW-AWAY" );
    $sym9$STRATEGEM_P = makeSymbol( "STRATEGEM-P" );
    $kw10$INTERESTING = makeKeyword( "INTERESTING" );
    $str11$removal_tactician_does_not_handle = makeString( "removal tactician does not handle transformation link ~a" );
    $str12$_S_was_an_unexpected_strategem = makeString( "~S was an unexpected strategem" );
  }
}
/*
 * 
 * Total time: 46 ms
 * 
 */