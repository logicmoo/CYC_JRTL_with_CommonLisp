package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class new_root_tactician
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician";
  public static final String myFingerPrint = "ee220bfc58cbb88351a046ba222422e72903c9392dbb1204103bf987942dc612";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 4591L)
  public static SubLSymbol $new_root_heuristics_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 4809L)
  private static SubLSymbol $new_root_tactician_heuristics$;
  private static final SubLSymbol $kw0$NEW_ROOT;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$NEW_ROOT_STRATEGY_INITIALIZE;
  private static final SubLSymbol $sym3$NEW_ROOT_STRATEGY_P;
  private static final SubLString $str4$_a_happiness___a__a__a__;
  private static final SubLSymbol $sym5$PROBLEM_P;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw10$DONE;
  private static final SubLSymbol $sym11$DO_STRATEGIC_HEURISTICS;
  private static final SubLSymbol $sym12$PWHEN;
  private static final SubLSymbol $sym13$NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTIC_;
  private static final SubLSymbol $sym14$DO_NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTICS;
  private static final SubLString $str15$___a_heuristic___a__s___a____a___;
  private static final SubLSymbol $sym16$ABS_;
  private static final SubLSymbol $sym17$FOURTH;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 2423L)
  public static SubLObject new_root_strategy_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_strategy.strategy_p( v_object ) && $kw0$NEW_ROOT == inference_datastructures_strategy.strategy_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 2548L)
  public static SubLObject new_root_strategy_initialize(final SubLObject strategy)
  {
    final SubLObject new_root_index = inference_tactician.new_happiness_index();
    final SubLObject data = new_root_tactician_datastructures.new_new_root_strategy_data( new_root_index );
    inference_datastructures_strategy.set_strategy_data( strategy, data );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 2867L)
  public static SubLObject new_root_strategy_current_contents(final SubLObject strategy)
  {
    assert NIL != new_root_strategy_p( strategy ) : strategy;
    return inference_tactician.happiness_index_contents( new_root_tactician_datastructures.new_root_strategy_new_root_index( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 3070L)
  public static SubLObject new_root_strategy_peek_new_root(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_root_index = new_root_tactician_datastructures.new_root_strategy_new_root_index( strategy );
    SubLObject best_problem = NIL;
    while ( NIL == best_problem)
    {
      if( NIL != inference_tactician.happiness_index_empty_p( new_root_index ) )
      {
        return NIL;
      }
      thread.resetMultipleValues();
      final SubLObject candidate_problem = inference_tactician.happiness_index_peek( new_root_index );
      final SubLObject expected_happiness = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != inference_datastructures_problem.problem_invalid_p( candidate_problem ) )
      {
        inference_tactician.happiness_index_next( new_root_index );
      }
      else
      {
        final SubLObject current_happiness = new_root_strategy_new_root_happiness( candidate_problem, strategy );
        if( control_vars.$inference_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
        {
          format_nil.force_format( T, $str4$_a_happiness___a__a__a__, strategy, candidate_problem, expected_happiness, current_happiness, NIL, NIL, NIL, NIL );
        }
        if( NIL != inference_tactician.happiness_L( current_happiness, expected_happiness ) )
        {
          inference_tactician.happiness_index_next( new_root_index );
          inference_tactician.happiness_index_add( new_root_index, current_happiness, candidate_problem );
        }
        else
        {
          best_problem = candidate_problem;
        }
      }
    }
    return best_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 4211L)
  public static SubLObject new_root_strategy_add_new_root(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject new_root_index = new_root_tactician_datastructures.new_root_strategy_new_root_index( strategy );
    final SubLObject happiness = new_root_strategy_new_root_happiness( problem, strategy );
    inference_tactician.happiness_index_add( new_root_index, happiness, problem );
    inference_datastructures_strategy.strategy_note_problem_active( strategy, problem );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 5262L)
  public static SubLObject new_root_tactician_heuristics()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $new_root_heuristics_enabledP$.getDynamicValue( thread ) ) ? $new_root_tactician_heuristics$.getGlobalValue() : set_utilities.$empty_set$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 5412L)
  public static SubLObject do_new_root_tactician_strategic_heuristics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject heuristic = NIL;
    SubLObject function = NIL;
    SubLObject scaling_factor = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    heuristic = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    scaling_factor = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
      if( NIL == conses_high.member( current_$1, $list8, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw10$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym11$DO_STRATEGIC_HEURISTICS, ConsesLow.list( heuristic, function, scaling_factor, $kw10$DONE, done ), ConsesLow.listS( $sym12$PWHEN, ConsesLow.list(
        $sym13$NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTIC_, heuristic ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 5696L)
  public static SubLObject new_root_tactician_strategic_heuristicP(final SubLObject heuristic)
  {
    return set.set_memberP( heuristic, new_root_tactician_heuristics() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 5889L)
  public static SubLObject enable_new_root_tactician_strategic_heuristic(final SubLObject heuristic)
  {
    return ( NIL != new_root_tactician_strategic_heuristicP( heuristic ) ) ? set.set_add( heuristic, $new_root_tactician_heuristics$.getGlobalValue() ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 6089L)
  public static SubLObject disable_new_root_tactician_strategic_heuristic(final SubLObject heuristic)
  {
    return ( NIL != new_root_tactician_strategic_heuristicP( heuristic ) ) ? set.set_remove( heuristic, $new_root_tactician_heuristics$.getGlobalValue() ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 6295L)
  public static SubLObject new_root_strategy_new_root_happiness(final SubLObject new_root, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_problem.problem_p( new_root ) : new_root;
    assert NIL != new_root_strategy_p( strategy ) : strategy;
    SubLObject aggregate_happiness = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( inference_strategic_heuristics.strategic_heuristic_index() ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject heuristic = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject function = inference_strategic_heuristics.strategic_heuristic_function( heuristic );
      final SubLObject scaling_factor = inference_strategic_heuristics.strategic_heuristic_scaling_factor( heuristic );
      final SubLObject domain = inference_strategic_heuristics.strategic_heuristic_domain( heuristic );
      if( NIL != inference_strategic_heuristics.do_strategic_heuristics_tactic_match_p( NIL, domain ) && NIL != new_root_tactician_strategic_heuristicP( heuristic ) )
      {
        final SubLObject raw_happiness = Functions.funcall( function, strategy, new_root );
        final SubLObject scaled_happiness = number_utilities.potentially_infinite_integer_times( raw_happiness, scaling_factor );
        if( !scaled_happiness.eql( ZERO_INTEGER ) && control_vars.$inference_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) )
        {
          format_nil.force_format( T, $str15$___a_heuristic___a__s___a____a___, strategy, new_root, heuristic, scaled_happiness, raw_happiness, scaling_factor, NIL, NIL );
        }
        aggregate_happiness = number_utilities.potentially_infinite_integer_plus( aggregate_happiness, scaled_happiness );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return aggregate_happiness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 7088L)
  public static SubLObject new_root_strategy_happiness_table(final SubLObject strategy)
  {
    return new_root_tactician_datastructures.new_root_strategy_new_root_index( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician.lisp", position = 7227L)
  public static SubLObject new_root_strategy_happiness_breakdown(final SubLObject strategy, final SubLObject new_root)
  {
    return Sort.sort( conses_high.copy_list( inference_strategic_heuristics.strategic_heuristic_happiness_table( strategy, new_root, new_root_tactician_heuristics() ) ), $sym16$ABS_, Symbols.symbol_function(
        $sym17$FOURTH ) );
  }

  public static SubLObject declare_new_root_tactician_file()
  {
    SubLFiles.declareFunction( me, "new_root_strategy_p", "NEW-ROOT-STRATEGY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_root_strategy_initialize", "NEW-ROOT-STRATEGY-INITIALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_root_strategy_current_contents", "NEW-ROOT-STRATEGY-CURRENT-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_root_strategy_peek_new_root", "NEW-ROOT-STRATEGY-PEEK-NEW-ROOT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_root_strategy_add_new_root", "NEW-ROOT-STRATEGY-ADD-NEW-ROOT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_root_tactician_heuristics", "NEW-ROOT-TACTICIAN-HEURISTICS", 0, 0, false );
    SubLFiles.declareMacro( me, "do_new_root_tactician_strategic_heuristics", "DO-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTICS" );
    SubLFiles.declareFunction( me, "new_root_tactician_strategic_heuristicP", "NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "enable_new_root_tactician_strategic_heuristic", "ENABLE-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "disable_new_root_tactician_strategic_heuristic", "DISABLE-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "new_root_strategy_new_root_happiness", "NEW-ROOT-STRATEGY-NEW-ROOT-HAPPINESS", 2, 0, false );
    SubLFiles.declareFunction( me, "new_root_strategy_happiness_table", "NEW-ROOT-STRATEGY-HAPPINESS-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_root_strategy_happiness_breakdown", "NEW-ROOT-STRATEGY-HAPPINESS-BREAKDOWN", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_new_root_tactician_file()
  {
    $new_root_heuristics_enabledP$ = SubLFiles.defparameter( "*NEW-ROOT-HEURISTICS-ENABLED?*", NIL );
    $new_root_tactician_heuristics$ = SubLFiles.deflexical( "*NEW-ROOT-TACTICIAN-HEURISTICS*", set_utilities.construct_set_from_list( $list6, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_new_root_tactician_file()
  {
    inference_tactician.inference_strategy_type( $kw0$NEW_ROOT, $list1 );
    utilities_macros.note_funcall_helper_function( $sym2$NEW_ROOT_STRATEGY_INITIALIZE );
    access_macros.register_macro_helper( $sym13$NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTIC_, $sym14$DO_NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTICS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_new_root_tactician_file();
  }

  @Override
  public void initializeVariables()
  {
    init_new_root_tactician_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_new_root_tactician_file();
  }
  static
  {
    me = new new_root_tactician();
    $new_root_heuristics_enabledP$ = null;
    $new_root_tactician_heuristics$ = null;
    $kw0$NEW_ROOT = makeKeyword( "NEW-ROOT" );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "The NEW-ROOT Tactician" ), makeKeyword( "COMMENT" ), makeString( "The NEW-ROOT Tactician needs no introduction." ), makeKeyword(
        "CONSTRUCTOR" ), makeSymbol( "NEW-ROOT-STRATEGY-INITIALIZE" ), makeKeyword( "DONE?" ), makeSymbol( "NEW-ROOT-STRATEGY-DONE?" ), makeKeyword( "DO-ONE-STEP" ), makeSymbol( "NEW-ROOT-STRATEGY-DO-ONE-STEP" ),
      makeKeyword( "POSSIBLY-ACTIVATE-PROBLEM" ), makeSymbol( "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM" ), makeKeyword( "SELECT-BEST-STRATEGEM" ), makeSymbol( "NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM" ), makeKeyword(
          "EXECUTE-STRATEGEM" ), makeSymbol( "NEW-ROOT-STRATEGY-EXECUTE-STRATEGEM" ), makeKeyword( "QUIESCE" ), makeSymbol( "NEW-ROOT-STRATEGY-QUIESCE" ), makeKeyword( "PROBLEM-NOTHING-TO-DO?" ), makeSymbol(
              "NEW-ROOT-STRATEGY-NOTHING-TO-DO?" ), makeKeyword( "HAPPINESS-TABLE" ), makeSymbol( "NEW-ROOT-STRATEGY-HAPPINESS-TABLE" ), makeKeyword( "PEEK-NEXT-STRATEGEM" ), makeSymbol(
                  "NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM" ), makeKeyword( "ACTIVATE-STRATEGEM" ), makeSymbol( "NEW-ROOT-STRATEGY-ADD-NEW-ROOT" ), makeKeyword( "MOTIVATE-STRATEGEM" ), makeSymbol(
                      "NEW-ROOT-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM" ), makeKeyword( "RECONSIDER-SET-ASIDES" ), makeSymbol( "ZERO" ), makeKeyword( "THROW-AWAY-UNINTERESTING-SET-ASIDES" ), makeSymbol(
                          "ZERO" ), makeKeyword( "NEW-ARGUMENT-LINK" ), makeSymbol( "IGNORE" ), makeKeyword( "NEW-TACTIC" ), makeSymbol( "IGNORE" ), makeKeyword( "RELEVANT-TACTICS-WRT-REMOVAL" ), makeSymbol( "ERROR" ),
      makeKeyword( "SPLIT-TACTICS-POSSIBLE" ), makeSymbol( "IGNORE" ), makeKeyword( "PROBLEM-COULD-BE-PENDING" ), makeSymbol( "IGNORE" ), makeKeyword( "THROW-AWAY-PROBLEM" ), makeSymbol( "FALSE" ), makeKeyword(
          "SET-ASIDE-PROBLEM" ), makeSymbol( "FALSE" ), makeKeyword( "THROW-AWAY-TACTIC" ), makeSymbol( "FALSE" ), makeKeyword( "SET-ASIDE-TACTIC" ), makeSymbol( "FALSE" ), makeKeyword( "LINK-HEAD-MOTIVATED?" ),
      makeSymbol( "FALSE" )
    } );
    $sym2$NEW_ROOT_STRATEGY_INITIALIZE = makeSymbol( "NEW-ROOT-STRATEGY-INITIALIZE" );
    $sym3$NEW_ROOT_STRATEGY_P = makeSymbol( "NEW-ROOT-STRATEGY-P" );
    $str4$_a_happiness___a__a__a__ = makeString( "~a happiness: ~a ~a ~a~%" );
    $sym5$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $list6 = ConsesLow.list( makeKeyword( "RELEVANT-TERM" ), makeKeyword( "LITERAL-COUNT" ), makeKeyword( "SKOLEM-COUNT" ), makeKeyword( "SHALLOW-AND-CHEAP" ), makeKeyword( "OCCAMS-RAZOR" ), makeKeyword(
        "PROBLEM-RULE-HISTORICAL-UTILITY" ), makeKeyword( "PROBLEM-RULE-A-PRIORI-UTILITY" ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "HEURISTIC" ), makeSymbol( "FUNCTION" ), makeSymbol( "SCALING-FACTOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list8 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw9$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw10$DONE = makeKeyword( "DONE" );
    $sym11$DO_STRATEGIC_HEURISTICS = makeSymbol( "DO-STRATEGIC-HEURISTICS" );
    $sym12$PWHEN = makeSymbol( "PWHEN" );
    $sym13$NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTIC_ = makeSymbol( "NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC?" );
    $sym14$DO_NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTICS = makeSymbol( "DO-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTICS" );
    $str15$___a_heuristic___a__s___a____a___ = makeString( "  ~a heuristic: ~a ~s: ~a = ~a * ~a~%" );
    $sym16$ABS_ = makeSymbol( "ABS>" );
    $sym17$FOURTH = makeSymbol( "FOURTH" );
  }
}
/*
 * 
 * Total time: 65 ms
 * 
 */