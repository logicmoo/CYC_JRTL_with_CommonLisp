package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transformation_tactician_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures";
  public static final String myFingerPrint = "6ad4b0ffb58b93181d8313911c6e993da5e26c9bedeb6e22b1c5d626f18d475c";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLSymbol $dtp_transformation_strategy_data$;
  private static final SubLSymbol $kw0$TRANSFORMATION;
  private static final SubLSymbol $sym1$TRANSFORMATION_STRATEGY_DATA;
  private static final SubLSymbol $sym2$TRANSFORMATION_STRATEGY_DATA_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED;
  private static final SubLSymbol $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED;
  private static final SubLSymbol $sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING;
  private static final SubLSymbol $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING;
  private static final SubLSymbol $sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX;
  private static final SubLSymbol $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX;
  private static final SubLSymbol $sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
  private static final SubLSymbol $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
  private static final SubLSymbol $sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
  private static final SubLSymbol $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
  private static final SubLSymbol $sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
  private static final SubLSymbol $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
  private static final SubLSymbol $kw22$LINK_HEADS_MOTIVATED;
  private static final SubLSymbol $kw23$PROBLEMS_PENDING;
  private static final SubLSymbol $kw24$TRANSFORMATION_STRATEGEM_INDEX;
  private static final SubLSymbol $kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
  private static final SubLSymbol $kw26$PROBLEM_STRATEGEMS_SET_ASIDE;
  private static final SubLSymbol $kw27$PROBLEM_STRATEGEMS_THROWN_AWAY;
  private static final SubLString $str28$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw29$BEGIN;
  private static final SubLSymbol $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA;
  private static final SubLSymbol $kw31$SLOT;
  private static final SubLSymbol $kw32$END;
  private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD;
  private static final SubLSymbol $sym34$TRANSFORMATION_STRATEGY_P;
  private static final SubLSymbol $sym35$PROBLEM_P;
  private static final SubLSymbol $sym36$MOTIVATION_STRATEGEM_P;
  private static final SubLSymbol $sym37$STRATEGEM_P;
  private static final SubLSymbol $sym38$TRANSFORMATION_STRATEGEM_P;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 910L)
  public static SubLObject transformation_strategy_motivation_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, $kw0$TRANSFORMATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject transformation_strategy_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject transformation_strategy_data_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $transformation_strategy_data_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject trans_strat_data_link_heads_motivated(final SubLObject v_object)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject trans_strat_data_problems_pending(final SubLObject v_object)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject trans_strat_data_transformation_strategem_index(final SubLObject v_object)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject trans_strat_data_problem_total_strategems_active(final SubLObject v_object)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject trans_strat_data_problem_strategems_set_aside(final SubLObject v_object)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject _csetf_trans_strat_data_link_heads_motivated(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject _csetf_trans_strat_data_problems_pending(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject _csetf_trans_strat_data_transformation_strategem_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject _csetf_trans_strat_data_problem_total_strategems_active(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject _csetf_trans_strat_data_problem_strategems_set_aside(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject _csetf_trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_strategy_data_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject make_transformation_strategy_data(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $transformation_strategy_data_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw22$LINK_HEADS_MOTIVATED ) )
      {
        _csetf_trans_strat_data_link_heads_motivated( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$PROBLEMS_PENDING ) )
      {
        _csetf_trans_strat_data_problems_pending( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$TRANSFORMATION_STRATEGEM_INDEX ) )
      {
        _csetf_trans_strat_data_transformation_strategem_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE ) )
      {
        _csetf_trans_strat_data_problem_total_strategems_active( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$PROBLEM_STRATEGEMS_SET_ASIDE ) )
      {
        _csetf_trans_strat_data_problem_strategems_set_aside( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$PROBLEM_STRATEGEMS_THROWN_AWAY ) )
      {
        _csetf_trans_strat_data_problem_strategems_thrown_away( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject visit_defstruct_transformation_strategy_data(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw22$LINK_HEADS_MOTIVATED, trans_strat_data_link_heads_motivated( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw23$PROBLEMS_PENDING, trans_strat_data_problems_pending( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw24$TRANSFORMATION_STRATEGEM_INDEX, trans_strat_data_transformation_strategem_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE, trans_strat_data_problem_total_strategems_active( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw26$PROBLEM_STRATEGEMS_SET_ASIDE, trans_strat_data_problem_strategems_set_aside( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw27$PROBLEM_STRATEGEMS_THROWN_AWAY, trans_strat_data_problem_strategems_thrown_away( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
  public static SubLObject visit_defstruct_object_transformation_strategy_data_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_transformation_strategy_data( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 2898L)
  public static SubLObject transformation_strategy_p(final SubLObject v_object)
  {
    return makeBoolean( ( NIL != inference_datastructures_strategy.strategy_p( v_object ) && $kw0$TRANSFORMATION == inference_datastructures_strategy.strategy_type( v_object ) ) || NIL != abductive_tactician
        .abductive_strategy_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 3196L)
  public static SubLObject new_transformation_strategy_data(final SubLObject transformation_index)
  {
    final SubLObject data = make_transformation_strategy_data( UNPROVIDED );
    _csetf_trans_strat_data_link_heads_motivated( data, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_trans_strat_data_problems_pending( data, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_trans_strat_data_transformation_strategem_index( data, transformation_index );
    _csetf_trans_strat_data_problem_total_strategems_active( data, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_trans_strat_data_problem_strategems_set_aside( data, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_trans_strat_data_problem_strategems_thrown_away( data, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 3946L)
  public static SubLObject transformation_strategy_link_heads_motivated(final SubLObject strategy)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    final SubLObject data = inference_datastructures_strategy.strategy_data( strategy );
    return trans_strat_data_link_heads_motivated( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4248L)
  public static SubLObject transformation_strategy_problems_pending(final SubLObject strategy)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    final SubLObject data = inference_datastructures_strategy.strategy_data( strategy );
    return trans_strat_data_problems_pending( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4493L)
  public static SubLObject transformation_strategy_transformation_strategem_index(final SubLObject strategy)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    final SubLObject data = inference_datastructures_strategy.strategy_data( strategy );
    return trans_strat_data_transformation_strategem_index( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4775L)
  public static SubLObject transformation_strategy_problem_total_strategems_active(final SubLObject strategy)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    final SubLObject data = inference_datastructures_strategy.strategy_data( strategy );
    return trans_strat_data_problem_total_strategems_active( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5088L)
  public static SubLObject transformation_strategy_problem_strategems_set_aside(final SubLObject strategy)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    final SubLObject data = inference_datastructures_strategy.strategy_data( strategy );
    return trans_strat_data_problem_strategems_set_aside( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5397L)
  public static SubLObject transformation_strategy_problem_strategems_thrown_away(final SubLObject strategy)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    final SubLObject data = inference_datastructures_strategy.strategy_data( strategy );
    return trans_strat_data_problem_strategems_thrown_away( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5707L)
  public static SubLObject transformation_strategy_problem_motivatedP(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return inference_datastructures_strategy.problem_motivatedP( problem, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6000L)
  public static SubLObject transformation_strategy_link_head_motivatedP(final SubLObject strategy, final SubLObject link_head)
  {
    assert NIL != inference_tactician.motivation_strategem_p( link_head ) : link_head;
    return set.set_memberP( link_head, transformation_strategy_link_heads_motivated( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6312L)
  public static SubLObject transformation_strategy_problem_pendingP(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return set.set_memberP( problem, transformation_strategy_problems_pending( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6555L)
  public static SubLObject transformation_strategy_problem_activeP(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject index = transformation_strategy_problem_total_strategems_active( strategy );
    return Numbers.plusp( dictionary.dictionary_lookup_without_values( index, problem, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6923L)
  public static SubLObject transformation_strategy_problem_set_asideP(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    if( NIL == transformation_strategy_problem_activeP( strategy, problem ) )
    {
      final SubLObject index = transformation_strategy_problem_strategems_set_aside( strategy );
      final SubLObject v_set = dictionary.dictionary_lookup_without_values( index, problem, NIL );
      if( NIL != v_set && NIL == set.set_emptyP( v_set ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 7990L)
  public static SubLObject transformation_strategy_strategem_set_asideP(final SubLObject strategy, final SubLObject strategem)
  {
    assert NIL != inference_tactician.strategem_p( strategem ) : strategem;
    final SubLObject problem = inference_tactician.strategem_problem( strategem );
    final SubLObject index = transformation_strategy_problem_strategems_set_aside( strategy );
    final SubLObject v_set = dictionary.dictionary_lookup_without_values( index, problem, NIL );
    return makeBoolean( NIL != set.set_p( v_set ) && NIL != set.set_memberP( strategem, v_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 8481L)
  public static SubLObject transformation_strategy_strategem_thrown_awayP(final SubLObject strategy, final SubLObject strategem)
  {
    assert NIL != inference_tactician.strategem_p( strategem ) : strategem;
    final SubLObject problem = inference_tactician.strategem_problem( strategem );
    final SubLObject index = transformation_strategy_problem_strategems_thrown_away( strategy );
    final SubLObject v_set = dictionary.dictionary_lookup_without_values( index, problem, NIL );
    return makeBoolean( NIL != set.set_p( v_set ) && NIL != set.set_memberP( strategem, v_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 8939L)
  public static SubLObject transformation_strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return inference_datastructures_strategy.strategy_note_problem_motivated( strategy, problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9192L)
  public static SubLObject transformation_strategy_note_link_head_motivated(final SubLObject strategy, final SubLObject link_head)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_tactician.motivation_strategem_p( link_head ) : link_head;
    return set.set_add( link_head, transformation_strategy_link_heads_motivated( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9475L)
  public static SubLObject transformation_strategy_note_problem_pending(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return set.set_add( problem, transformation_strategy_problems_pending( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9720L)
  public static SubLObject transformation_strategy_note_problem_unpending(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return set.set_remove( problem, transformation_strategy_problems_pending( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9970L)
  public static SubLObject transformation_strategy_activate_strategem(final SubLObject strategy, final SubLObject transformation_strategem)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_tactician.transformation_strategem_p( transformation_strategem ) : transformation_strategem;
    if( NIL != inference_worker_transformation.transformation_tactic_p( transformation_strategem ) && NIL != inference_datastructures_tactic.tactic_executedP( transformation_strategem ) )
    {
      return transformation_tactician_motivation.transformation_strategy_activate_transformation_argument_links( strategy, inference_datastructures_tactic.tactic_problem( transformation_strategem ) );
    }
    SubLObject result = NIL;
    result = transformation_tactician.transformation_strategy_activate_strategem_low( strategy, transformation_strategem );
    if( NIL != result )
    {
      final SubLObject problem = inference_tactician.strategem_problem( transformation_strategem );
      final SubLObject index = transformation_strategy_problem_total_strategems_active( strategy );
      SubLObject count = dictionary.dictionary_lookup_without_values( index, problem, ZERO_INTEGER );
      count = Numbers.add( count, ONE_INTEGER );
      if( ONE_INTEGER.numE( count ) )
      {
        transformation_strategy_note_problem_unpending( strategy, problem );
      }
      dictionary.dictionary_enter( index, problem, count );
      return count;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 11587L)
  public static SubLObject transformation_strategy_note_strategem_set_aside(final SubLObject strategy, final SubLObject transformation_strategem)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_tactician.transformation_strategem_p( transformation_strategem ) : transformation_strategem;
    final SubLObject index = transformation_strategy_problem_strategems_set_aside( strategy );
    final SubLObject problem = inference_tactician.strategem_problem( transformation_strategem );
    SubLObject v_set = dictionary.dictionary_lookup_without_values( index, problem, NIL );
    if( NIL == set.set_p( v_set ) )
    {
      v_set = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
      dictionary.dictionary_enter( index, problem, v_set );
    }
    return set.set_add( transformation_strategem, v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 12181L)
  public static SubLObject transformation_strategy_clear_strategems_set_aside(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    final SubLObject index = transformation_strategy_problem_strategems_set_aside( strategy );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( index ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject problem = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject strategem_set = thread.secondMultipleValue();
      thread.resetMultipleValues();
      transformation_strategy_note_problem_unpending( strategy, problem );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    dictionary.clear_dictionary( index );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 12591L)
  public static SubLObject transformation_strategy_note_strategem_thrown_away(final SubLObject strategy, final SubLObject transformation_strategem)
  {
    assert NIL != transformation_strategy_p( strategy ) : strategy;
    assert NIL != inference_tactician.transformation_strategem_p( transformation_strategem ) : transformation_strategem;
    final SubLObject index = transformation_strategy_problem_strategems_thrown_away( strategy );
    final SubLObject problem = inference_tactician.strategem_problem( transformation_strategem );
    SubLObject v_set = dictionary.dictionary_lookup_without_values( index, problem, NIL );
    if( NIL == set.set_p( v_set ) )
    {
      v_set = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
      dictionary.dictionary_enter( index, problem, v_set );
    }
    return set.set_add( transformation_strategem, v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 13175L)
  public static SubLObject transformation_strategy_clear_set_aside_problems(final SubLObject strategy)
  {
    transformation_strategy_clear_strategems_set_aside( strategy );
    return strategy;
  }

  public static SubLObject declare_transformation_tactician_datastructures_file()
  {
    SubLFiles.declareFunction( me, "transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false );
    new $transformation_strategy_data_p$UnaryFunction();
    SubLFiles.declareFunction( me, "trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false );
    SubLFiles.declareFunction( me, "trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false );
    SubLFiles.declareFunction( me, "trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false );
    SubLFiles.declareFunction( me, "trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_transformation_strategy_data", "VISIT-DEFSTRUCT-TRANSFORMATION-STRATEGY-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_transformation_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_transformation_tactician_datastructures_file()
  {
    $dtp_transformation_strategy_data$ = SubLFiles.defconstant( "*DTP-TRANSFORMATION-STRATEGY-DATA*", $sym1$TRANSFORMATION_STRATEGY_DATA );
    return NIL;
  }

  public static SubLObject setup_transformation_tactician_datastructures_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), Symbols.symbol_function(
        $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED );
    Structures.def_csetf( $sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING, $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING );
    Structures.def_csetf( $sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX );
    Structures.def_csetf( $sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE );
    Structures.def_csetf( $sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE );
    Structures.def_csetf( $sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY );
    Equality.identity( $sym1$TRANSFORMATION_STRATEGY_DATA );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), Symbols.symbol_function(
        $sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_transformation_tactician_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_transformation_tactician_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_transformation_tactician_datastructures_file();
  }
  static
  {
    me = new transformation_tactician_datastructures();
    $dtp_transformation_strategy_data$ = null;
    $kw0$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $sym1$TRANSFORMATION_STRATEGY_DATA = makeSymbol( "TRANSFORMATION-STRATEGY-DATA" );
    $sym2$TRANSFORMATION_STRATEGY_DATA_P = makeSymbol( "TRANSFORMATION-STRATEGY-DATA-P" );
    $list3 = ConsesLow.list( makeSymbol( "LINK-HEADS-MOTIVATED" ), makeSymbol( "PROBLEMS-PENDING" ), makeSymbol( "TRANSFORMATION-STRATEGEM-INDEX" ), makeSymbol( "PROBLEM-TOTAL-STRATEGEMS-ACTIVE" ), makeSymbol(
        "PROBLEM-STRATEGEMS-SET-ASIDE" ), makeSymbol( "PROBLEM-STRATEGEMS-THROWN-AWAY" ) );
    $list4 = ConsesLow.list( makeKeyword( "LINK-HEADS-MOTIVATED" ), makeKeyword( "PROBLEMS-PENDING" ), makeKeyword( "TRANSFORMATION-STRATEGEM-INDEX" ), makeKeyword( "PROBLEM-TOTAL-STRATEGEMS-ACTIVE" ), makeKeyword(
        "PROBLEM-STRATEGEMS-SET-ASIDE" ), makeKeyword( "PROBLEM-STRATEGEMS-THROWN-AWAY" ) );
    $list5 = ConsesLow.list( makeSymbol( "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED" ), makeSymbol( "TRANS-STRAT-DATA-PROBLEMS-PENDING" ), makeSymbol( "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX" ), makeSymbol(
        "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE" ), makeSymbol( "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE" ), makeSymbol( "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED" ), makeSymbol( "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING" ), makeSymbol( "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX" ),
        makeSymbol( "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE" ), makeSymbol( "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE" ), makeSymbol(
            "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY" ) );
    $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TRANSFORMATION-STRATEGY-DATA-P" ) );
    $sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol( "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED" );
    $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol( "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED" );
    $sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol( "TRANS-STRAT-DATA-PROBLEMS-PENDING" );
    $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol( "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING" );
    $sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol( "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX" );
    $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol( "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX" );
    $sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol( "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE" );
    $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol( "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE" );
    $sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol( "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE" );
    $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol( "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE" );
    $sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol( "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY" );
    $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol( "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY" );
    $kw22$LINK_HEADS_MOTIVATED = makeKeyword( "LINK-HEADS-MOTIVATED" );
    $kw23$PROBLEMS_PENDING = makeKeyword( "PROBLEMS-PENDING" );
    $kw24$TRANSFORMATION_STRATEGEM_INDEX = makeKeyword( "TRANSFORMATION-STRATEGEM-INDEX" );
    $kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeKeyword( "PROBLEM-TOTAL-STRATEGEMS-ACTIVE" );
    $kw26$PROBLEM_STRATEGEMS_SET_ASIDE = makeKeyword( "PROBLEM-STRATEGEMS-SET-ASIDE" );
    $kw27$PROBLEM_STRATEGEMS_THROWN_AWAY = makeKeyword( "PROBLEM-STRATEGEMS-THROWN-AWAY" );
    $str28$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw29$BEGIN = makeKeyword( "BEGIN" );
    $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA = makeSymbol( "MAKE-TRANSFORMATION-STRATEGY-DATA" );
    $kw31$SLOT = makeKeyword( "SLOT" );
    $kw32$END = makeKeyword( "END" );
    $sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD" );
    $sym34$TRANSFORMATION_STRATEGY_P = makeSymbol( "TRANSFORMATION-STRATEGY-P" );
    $sym35$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $sym36$MOTIVATION_STRATEGEM_P = makeSymbol( "MOTIVATION-STRATEGEM-P" );
    $sym37$STRATEGEM_P = makeSymbol( "STRATEGEM-P" );
    $sym38$TRANSFORMATION_STRATEGEM_P = makeSymbol( "TRANSFORMATION-STRATEGEM-P" );
  }

  public static final class $transformation_strategy_data_native
      extends
        SubLStructNative
  {
    public SubLObject $link_heads_motivated;
    public SubLObject $problems_pending;
    public SubLObject $transformation_strategem_index;
    public SubLObject $problem_total_strategems_active;
    public SubLObject $problem_strategems_set_aside;
    public SubLObject $problem_strategems_thrown_away;
    private static final SubLStructDeclNative structDecl;

    public $transformation_strategy_data_native()
    {
      this.$link_heads_motivated = CommonSymbols.NIL;
      this.$problems_pending = CommonSymbols.NIL;
      this.$transformation_strategem_index = CommonSymbols.NIL;
      this.$problem_total_strategems_active = CommonSymbols.NIL;
      this.$problem_strategems_set_aside = CommonSymbols.NIL;
      this.$problem_strategems_thrown_away = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $transformation_strategy_data_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$link_heads_motivated;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$problems_pending;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$transformation_strategem_index;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$problem_total_strategems_active;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$problem_strategems_set_aside;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$problem_strategems_thrown_away;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$link_heads_motivated = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$problems_pending = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$transformation_strategem_index = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$problem_total_strategems_active = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$problem_strategems_set_aside = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$problem_strategems_thrown_away = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $transformation_strategy_data_native.class, $sym1$TRANSFORMATION_STRATEGY_DATA, $sym2$TRANSFORMATION_STRATEGY_DATA_P, $list3, $list4, new String[] {
        "$link_heads_motivated", "$problems_pending", "$transformation_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away"
      }, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $transformation_strategy_data_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $transformation_strategy_data_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TRANSFORMATION-STRATEGY-DATA-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return transformation_strategy_data_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 167 ms
 * 
 */