package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class neural_net
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.neural_net";
  public static final String myFingerPrint = "9b5285bc073f134b3d7a5164ba132abeebf2d70341df610fe4f27fbfa162c87e";
  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLSymbol $dtp_neural_net$;
  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLSymbol $dtp_nn_input_node$;
  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 5002L)
  private static SubLSymbol $rl_tactician_neural_net_weights_list$;
  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 6564L)
  private static SubLSymbol $rl_tactician_neural_net$;
  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 8964L)
  private static SubLSymbol $test_rl_tactician_evaluate_neural_net_tolerance$;
  private static final SubLSymbol $sym0$NEURAL_NET;
  private static final SubLSymbol $sym1$NEURAL_NET_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$NN_INPUT_NODES;
  private static final SubLSymbol $sym10$_CSETF_NN_INPUT_NODES;
  private static final SubLSymbol $kw11$INPUT_NODES;
  private static final SubLString $str12$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw13$BEGIN;
  private static final SubLSymbol $sym14$MAKE_NEURAL_NET;
  private static final SubLSymbol $kw15$SLOT;
  private static final SubLSymbol $kw16$END;
  private static final SubLSymbol $sym17$VISIT_DEFSTRUCT_OBJECT_NEURAL_NET_METHOD;
  private static final SubLSymbol $sym18$CONSP;
  private static final SubLString $str19$Expected__s_to_be__a_elements_lon;
  private static final SubLFloat $float20$4_924273;
  private static final SubLSymbol $sym21$NN_INPUT_NODE;
  private static final SubLSymbol $sym22$NN_INPUT_NODE_P;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$NNIN_VALUE;
  private static final SubLSymbol $sym30$_CSETF_NNIN_VALUE;
  private static final SubLSymbol $sym31$NNIN_WEIGHTS;
  private static final SubLSymbol $sym32$_CSETF_NNIN_WEIGHTS;
  private static final SubLSymbol $kw33$VALUE;
  private static final SubLSymbol $kw34$WEIGHTS;
  private static final SubLSymbol $sym35$MAKE_NN_INPUT_NODE;
  private static final SubLSymbol $sym36$VISIT_DEFSTRUCT_OBJECT_NN_INPUT_NODE_METHOD;
  private static final SubLSymbol $sym37$NUMBERP;
  private static final SubLSymbol $sym38$NON_DOTTED_LIST_P;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$_RL_TACTICIAN_NEURAL_NET_;
  private static final SubLInteger $int41$21;
  private static final SubLFloat $float42$0_01;
  private static final SubLFloat $float43$0_03;
  private static final SubLFloat $float44$0_97;
  private static final SubLSymbol $sym45$TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE;
  private static final SubLSymbol $kw46$TEST;
  private static final SubLSymbol $kw47$OWNER;
  private static final SubLSymbol $kw48$CLASSES;
  private static final SubLSymbol $kw49$KB;
  private static final SubLSymbol $kw50$TINY;
  private static final SubLSymbol $kw51$WORKING_;
  private static final SubLList $list52;

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLObject neural_net_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLObject neural_net_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $neural_net_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLObject nn_input_nodes(final SubLObject v_object)
  {
    assert NIL != neural_net_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLObject _csetf_nn_input_nodes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != neural_net_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLObject make_neural_net(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $neural_net_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw11$INPUT_NODES ) )
      {
        _csetf_nn_input_nodes( v_new, current_value );
      }
      else
      {
        Errors.error( $str12$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLObject visit_defstruct_neural_net(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw13$BEGIN, $sym14$MAKE_NEURAL_NET, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw15$SLOT, $kw11$INPUT_NODES, nn_input_nodes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw16$END, $sym14$MAKE_NEURAL_NET, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1517L)
  public static SubLObject visit_defstruct_object_neural_net_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_neural_net( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 1845L)
  public static SubLObject new_neural_net(final SubLObject weights_list)
  {
    assert NIL != Types.consp( weights_list ) : weights_list;
    final SubLObject nn = make_neural_net( UNPROVIDED );
    SubLObject input_nodes = NIL;
    SubLObject cdolist_list_var = weights_list;
    SubLObject weights = NIL;
    weights = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node = new_nn_input_node( ZERO_INTEGER, weights );
      input_nodes = ConsesLow.cons( node, input_nodes );
      cdolist_list_var = cdolist_list_var.rest();
      weights = cdolist_list_var.first();
    }
    input_nodes = Sequences.nreverse( input_nodes );
    _csetf_nn_input_nodes( nn, input_nodes );
    return nn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 2412L)
  public static SubLObject neural_net_input_nodes(final SubLObject nn)
  {
    assert NIL != neural_net_p( nn ) : nn;
    return nn_input_nodes( nn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 2529L)
  public static SubLObject neural_net_input_node_count(final SubLObject nn)
  {
    assert NIL != neural_net_p( nn ) : nn;
    return Sequences.length( neural_net_input_nodes( nn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 2670L)
  public static SubLObject neural_net_set_inputs(final SubLObject nn, final SubLObject values)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != neural_net_p( nn ) : nn;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthE( values, neural_net_input_node_count( nn ), UNPROVIDED ) )
    {
      Errors.error( $str19$Expected__s_to_be__a_elements_lon, values, neural_net_input_node_count( nn ) );
    }
    SubLObject node = NIL;
    SubLObject node_$1 = NIL;
    SubLObject value = NIL;
    SubLObject value_$2 = NIL;
    node = neural_net_input_nodes( nn );
    node_$1 = node.first();
    value = values;
    value_$2 = value.first();
    while ( NIL != value || NIL != node)
    {
      nn_input_node_set_value( node_$1, value_$2 );
      node = node.rest();
      node_$1 = node.first();
      value = value.rest();
      value_$2 = value.first();
    }
    return nn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 3047L)
  public static SubLObject sigmoid(final SubLObject activesum)
  {
    final SubLObject slope = $float20$4_924273;
    return Numbers.invert( number_utilities.f_1X( Numbers.exp( Numbers.minus( Numbers.multiply( slope, activesum ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject nn_input_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject nn_input_node_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $nn_input_node_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject nnin_value(final SubLObject v_object)
  {
    assert NIL != nn_input_node_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject nnin_weights(final SubLObject v_object)
  {
    assert NIL != nn_input_node_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject _csetf_nnin_value(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != nn_input_node_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject _csetf_nnin_weights(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != nn_input_node_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject make_nn_input_node(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $nn_input_node_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw33$VALUE ) )
      {
        _csetf_nnin_value( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$WEIGHTS ) )
      {
        _csetf_nnin_weights( v_new, current_value );
      }
      else
      {
        Errors.error( $str12$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject visit_defstruct_nn_input_node(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw13$BEGIN, $sym35$MAKE_NN_INPUT_NODE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw15$SLOT, $kw33$VALUE, nnin_value( obj ) );
    Functions.funcall( visitor_fn, obj, $kw15$SLOT, $kw34$WEIGHTS, nnin_weights( obj ) );
    Functions.funcall( visitor_fn, obj, $kw16$END, $sym35$MAKE_NN_INPUT_NODE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4098L)
  public static SubLObject visit_defstruct_object_nn_input_node_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_nn_input_node( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4300L)
  public static SubLObject new_nn_input_node(final SubLObject value, final SubLObject weights)
  {
    assert NIL != Types.numberp( value ) : value;
    assert NIL != Types.consp( weights ) : weights;
    assert NIL != list_utilities.non_dotted_list_p( weights ) : weights;
    SubLObject cdolist_list_var = weights;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.numberp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject node = make_nn_input_node( UNPROVIDED );
    _csetf_nnin_value( node, value );
    _csetf_nnin_weights( node, weights );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4593L)
  public static SubLObject nn_input_node_value(final SubLObject node)
  {
    assert NIL != nn_input_node_p( node ) : node;
    return nnin_value( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4712L)
  public static SubLObject nn_input_node_weights(final SubLObject node)
  {
    assert NIL != nn_input_node_p( node ) : node;
    return nnin_weights( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 4823L)
  public static SubLObject nn_input_node_set_value(final SubLObject node, final SubLObject value)
  {
    assert NIL != nn_input_node_p( node ) : node;
    assert NIL != Types.numberp( value ) : value;
    _csetf_nnin_value( node, value );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 6615L)
  public static SubLObject rl_tactician_initialize_neural_net()
  {
    $rl_tactician_neural_net$.setGlobalValue( new_neural_net( $rl_tactician_neural_net_weights_list$.getGlobalValue() ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 6773L)
  public static SubLObject rl_tactician_neural_net()
  {
    if( NIL == $rl_tactician_neural_net$.getGlobalValue() )
    {
      rl_tactician_initialize_neural_net();
    }
    return $rl_tactician_neural_net$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 6931L)
  public static SubLObject rl_tactician_evaluate_neural_net(final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type)
  {
    final SubLObject nn = rl_tactician_neural_net();
    rl_tactician_set_neural_net_input_values( nn, productivity, completeness, preference_level, tactic_type );
    return rl_tactician_compute_neural_net_output( nn, tactic_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 7254L)
  public static SubLObject rl_tactician_set_neural_net_input_values(final SubLObject nn, final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type)
  {
    final SubLObject values = rl_tactician_compute_neural_net_input_values( productivity, completeness, preference_level, tactic_type );
    neural_net_set_inputs( nn, values );
    return nn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 7544L)
  public static SubLObject rl_tactician_compute_neural_net_input_values(final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type)
  {
    final SubLObject values = ConsesLow.make_list( $int41$21, ZERO_INTEGER );
    final SubLObject start = Numbers.multiply( FOUR_INTEGER, tactic_type );
    final SubLObject productivity_value = Numbers.add( $float42$0_01, number_utilities.log10( number_utilities.f_1X( number_utilities.log10( number_utilities.f_1X( productivity ) ) ) ) );
    final SubLObject completeness_or_preference_level = Numbers.max( completeness, preference_level );
    ConsesLow.set_nth( start, values, productivity_value );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( THREE_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ConsesLow.set_nth( Numbers.add( start, ONE_INTEGER, i ), values, $float43$0_03 );
    }
    ConsesLow.set_nth( Numbers.add( start, completeness_or_preference_level ), values, $float44$0_97 );
    ConsesLow.set_nth( TWENTY_INTEGER, values, $float43$0_03 );
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 8170L)
  public static SubLObject rl_tactician_compute_neural_net_output(final SubLObject nn, final SubLObject tactic_type)
  {
    SubLObject sum = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject indexes = cdolist_list_var = rl_tactician_indexes_we_care_about( tactic_type );
    SubLObject i = NIL;
    i = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject input_node = ConsesLow.nth( i, neural_net_input_nodes( nn ) );
      final SubLObject input_value = nn_input_node_value( input_node );
      final SubLObject weight = ConsesLow.nth( tactic_type, nn_input_node_weights( input_node ) );
      final SubLObject partial_sum = Numbers.multiply( input_value, weight );
      sum = Numbers.add( sum, partial_sum );
      cdolist_list_var = cdolist_list_var.rest();
      i = cdolist_list_var.first();
    }
    return sigmoid( sum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 8754L)
  public static SubLObject rl_tactician_indexes_we_care_about(final SubLObject tactic_type)
  {
    SubLObject indexes = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( FOUR_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      indexes = ConsesLow.cons( Numbers.add( i, Numbers.multiply( FOUR_INTEGER, tactic_type ) ), indexes );
    }
    indexes = ConsesLow.cons( TWENTY_INTEGER, indexes );
    return Sequences.nreverse( indexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/neural-net.lisp", position = 8964L)
  public static SubLObject test_rl_tactician_evaluate_neural_net_with_some_tolerance(final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type,
      final SubLObject expected_result)
  {
    final SubLObject actual_result = rl_tactician_evaluate_neural_net( productivity, completeness, preference_level, tactic_type );
    return number_utilities.tolerance_E( actual_result, expected_result, $test_rl_tactician_evaluate_neural_net_tolerance$.getGlobalValue() );
  }

  public static SubLObject declare_neural_net_file()
  {
    SubLFiles.declareFunction( me, "neural_net_print_function_trampoline", "NEURAL-NET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "neural_net_p", "NEURAL-NET-P", 1, 0, false );
    new $neural_net_p$UnaryFunction();
    SubLFiles.declareFunction( me, "nn_input_nodes", "NN-INPUT-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nn_input_nodes", "_CSETF-NN-INPUT-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_neural_net", "MAKE-NEURAL-NET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_neural_net", "VISIT-DEFSTRUCT-NEURAL-NET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_neural_net_method", "VISIT-DEFSTRUCT-OBJECT-NEURAL-NET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_neural_net", "NEW-NEURAL-NET", 1, 0, false );
    SubLFiles.declareFunction( me, "neural_net_input_nodes", "NEURAL-NET-INPUT-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "neural_net_input_node_count", "NEURAL-NET-INPUT-NODE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "neural_net_set_inputs", "NEURAL-NET-SET-INPUTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sigmoid", "SIGMOID", 1, 0, false );
    SubLFiles.declareFunction( me, "nn_input_node_print_function_trampoline", "NN-INPUT-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "nn_input_node_p", "NN-INPUT-NODE-P", 1, 0, false );
    new $nn_input_node_p$UnaryFunction();
    SubLFiles.declareFunction( me, "nnin_value", "NNIN-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "nnin_weights", "NNIN-WEIGHTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nnin_value", "_CSETF-NNIN-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nnin_weights", "_CSETF-NNIN-WEIGHTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_nn_input_node", "MAKE-NN-INPUT-NODE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_nn_input_node", "VISIT-DEFSTRUCT-NN-INPUT-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_nn_input_node_method", "VISIT-DEFSTRUCT-OBJECT-NN-INPUT-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_nn_input_node", "NEW-NN-INPUT-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "nn_input_node_value", "NN-INPUT-NODE-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "nn_input_node_weights", "NN-INPUT-NODE-WEIGHTS", 1, 0, false );
    SubLFiles.declareFunction( me, "nn_input_node_set_value", "NN-INPUT-NODE-SET-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "rl_tactician_initialize_neural_net", "RL-TACTICIAN-INITIALIZE-NEURAL-NET", 0, 0, false );
    SubLFiles.declareFunction( me, "rl_tactician_neural_net", "RL-TACTICIAN-NEURAL-NET", 0, 0, false );
    SubLFiles.declareFunction( me, "rl_tactician_evaluate_neural_net", "RL-TACTICIAN-EVALUATE-NEURAL-NET", 4, 0, false );
    SubLFiles.declareFunction( me, "rl_tactician_set_neural_net_input_values", "RL-TACTICIAN-SET-NEURAL-NET-INPUT-VALUES", 5, 0, false );
    SubLFiles.declareFunction( me, "rl_tactician_compute_neural_net_input_values", "RL-TACTICIAN-COMPUTE-NEURAL-NET-INPUT-VALUES", 4, 0, false );
    SubLFiles.declareFunction( me, "rl_tactician_compute_neural_net_output", "RL-TACTICIAN-COMPUTE-NEURAL-NET-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "rl_tactician_indexes_we_care_about", "RL-TACTICIAN-INDEXES-WE-CARE-ABOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "test_rl_tactician_evaluate_neural_net_with_some_tolerance", "TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-WITH-SOME-TOLERANCE", 5, 0, false );
    return NIL;
  }

  public static SubLObject init_neural_net_file()
  {
    $dtp_neural_net$ = SubLFiles.defconstant( "*DTP-NEURAL-NET*", $sym0$NEURAL_NET );
    $dtp_nn_input_node$ = SubLFiles.defconstant( "*DTP-NN-INPUT-NODE*", $sym21$NN_INPUT_NODE );
    $rl_tactician_neural_net_weights_list$ = SubLFiles.deflexical( "*RL-TACTICIAN-NEURAL-NET-WEIGHTS-LIST*", $list39 );
    $rl_tactician_neural_net$ = SubLFiles.deflexical( "*RL-TACTICIAN-NEURAL-NET*", ( maybeDefault( $sym40$_RL_TACTICIAN_NEURAL_NET_, $rl_tactician_neural_net$, NIL ) ) );
    $test_rl_tactician_evaluate_neural_net_tolerance$ = SubLFiles.deflexical( "*TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-TOLERANCE*", $float42$0_01 );
    return NIL;
  }

  public static SubLObject setup_neural_net_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), Symbols.symbol_function( $sym7$NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$NN_INPUT_NODES, $sym10$_CSETF_NN_INPUT_NODES );
    Equality.identity( $sym0$NEURAL_NET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), Symbols.symbol_function( $sym17$VISIT_DEFSTRUCT_OBJECT_NEURAL_NET_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), Symbols.symbol_function( $sym27$NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list28 );
    Structures.def_csetf( $sym29$NNIN_VALUE, $sym30$_CSETF_NNIN_VALUE );
    Structures.def_csetf( $sym31$NNIN_WEIGHTS, $sym32$_CSETF_NNIN_WEIGHTS );
    Equality.identity( $sym21$NN_INPUT_NODE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), Symbols.symbol_function( $sym36$VISIT_DEFSTRUCT_OBJECT_NN_INPUT_NODE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym40$_RL_TACTICIAN_NEURAL_NET_ );
    generic_testing.define_test_case_table_int( $sym45$TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE, ConsesLow.list( new SubLObject[] { $kw46$TEST, Symbols.symbol_function( EQUAL ), $kw47$OWNER, NIL,
      $kw48$CLASSES, NIL, $kw49$KB, $kw50$TINY, $kw51$WORKING_, T
    } ), $list52 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_neural_net_file();
  }

  @Override
  public void initializeVariables()
  {
    init_neural_net_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_neural_net_file();
  }
  static
  {
    me = new neural_net();
    $dtp_neural_net$ = null;
    $dtp_nn_input_node$ = null;
    $rl_tactician_neural_net_weights_list$ = null;
    $rl_tactician_neural_net$ = null;
    $test_rl_tactician_evaluate_neural_net_tolerance$ = null;
    $sym0$NEURAL_NET = makeSymbol( "NEURAL-NET" );
    $sym1$NEURAL_NET_P = makeSymbol( "NEURAL-NET-P" );
    $list2 = ConsesLow.list( makeSymbol( "INPUT-NODES" ) );
    $list3 = ConsesLow.list( makeKeyword( "INPUT-NODES" ) );
    $list4 = ConsesLow.list( makeSymbol( "NN-INPUT-NODES" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-NN-INPUT-NODES" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "NEURAL-NET-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "NEURAL-NET-P" ) );
    $sym9$NN_INPUT_NODES = makeSymbol( "NN-INPUT-NODES" );
    $sym10$_CSETF_NN_INPUT_NODES = makeSymbol( "_CSETF-NN-INPUT-NODES" );
    $kw11$INPUT_NODES = makeKeyword( "INPUT-NODES" );
    $str12$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw13$BEGIN = makeKeyword( "BEGIN" );
    $sym14$MAKE_NEURAL_NET = makeSymbol( "MAKE-NEURAL-NET" );
    $kw15$SLOT = makeKeyword( "SLOT" );
    $kw16$END = makeKeyword( "END" );
    $sym17$VISIT_DEFSTRUCT_OBJECT_NEURAL_NET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-NEURAL-NET-METHOD" );
    $sym18$CONSP = makeSymbol( "CONSP" );
    $str19$Expected__s_to_be__a_elements_lon = makeString( "Expected ~s to be ~a elements long." );
    $float20$4_924273 = makeDouble( 4.924273 );
    $sym21$NN_INPUT_NODE = makeSymbol( "NN-INPUT-NODE" );
    $sym22$NN_INPUT_NODE_P = makeSymbol( "NN-INPUT-NODE-P" );
    $list23 = ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "WEIGHTS" ) );
    $list24 = ConsesLow.list( makeKeyword( "VALUE" ), makeKeyword( "WEIGHTS" ) );
    $list25 = ConsesLow.list( makeSymbol( "NNIN-VALUE" ), makeSymbol( "NNIN-WEIGHTS" ) );
    $list26 = ConsesLow.list( makeSymbol( "_CSETF-NNIN-VALUE" ), makeSymbol( "_CSETF-NNIN-WEIGHTS" ) );
    $sym27$NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "NN-INPUT-NODE-PRINT-FUNCTION-TRAMPOLINE" );
    $list28 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "NN-INPUT-NODE-P" ) );
    $sym29$NNIN_VALUE = makeSymbol( "NNIN-VALUE" );
    $sym30$_CSETF_NNIN_VALUE = makeSymbol( "_CSETF-NNIN-VALUE" );
    $sym31$NNIN_WEIGHTS = makeSymbol( "NNIN-WEIGHTS" );
    $sym32$_CSETF_NNIN_WEIGHTS = makeSymbol( "_CSETF-NNIN-WEIGHTS" );
    $kw33$VALUE = makeKeyword( "VALUE" );
    $kw34$WEIGHTS = makeKeyword( "WEIGHTS" );
    $sym35$MAKE_NN_INPUT_NODE = makeSymbol( "MAKE-NN-INPUT-NODE" );
    $sym36$VISIT_DEFSTRUCT_OBJECT_NN_INPUT_NODE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-NN-INPUT-NODE-METHOD" );
    $sym37$NUMBERP = makeSymbol( "NUMBERP" );
    $sym38$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $list39 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeDouble( -0.227514 ), makeDouble( -0.395681 ), makeDouble( -0.392587 ), makeDouble( -0.304583 ), makeDouble( 0.717281 ) ), ConsesLow.list( makeDouble(
        0.466911 ), makeDouble( -1.01181 ), makeDouble( 0.515608 ), makeDouble( 0.186695 ), makeDouble( -0.173123 ) ), ConsesLow.list( makeDouble( 0.691837 ), makeDouble( -0.39004 ), makeDouble( 1.27718 ), makeDouble(
            0.0985643 ), makeDouble( -0.459222 ) ), ConsesLow.list( makeDouble( -0.14361 ), makeDouble( -0.100166 ), makeDouble( -0.409217 ), makeDouble( 0.703923 ), makeDouble( 0.0986236 ) ), ConsesLow.list( makeDouble(
                -0.558941 ), makeDouble( -0.654273 ), makeDouble( 0.875859 ), makeDouble( -0.547818 ), makeDouble( 0.464239 ) ), ConsesLow.list( makeDouble( -0.0898241 ), makeDouble( 1.16297 ), makeDouble( -0.140286 ),
                    makeDouble( 0.727112 ), makeDouble( -0.0571363 ) ), ConsesLow.list( makeDouble( 0.33211 ), makeDouble( 0.804213 ), makeDouble( -0.500794 ), makeDouble( 0.0836377 ), makeDouble( -0.119423 ) ),
      ConsesLow.list( makeDouble( -0.27839 ), makeDouble( -0.424287 ), makeDouble( 0.0972779 ), makeDouble( -0.0641412 ), makeDouble( -0.324519 ) ), ConsesLow.list( makeDouble( -0.04071 ), makeDouble( -1.03764 ),
          makeDouble( -1.1684 ), makeDouble( -0.285568 ), makeDouble( 0.322287 ) ), ConsesLow.list( makeDouble( 0.35157 ), makeDouble( -0.0978135 ), makeDouble( -0.649702 ), makeDouble( 1.0535 ), makeDouble( 0.83717 ) ),
      ConsesLow.list( makeDouble( -0.0862237 ), makeDouble( 0.22735 ), makeDouble( -1.21319 ), makeDouble( -0.531121 ), makeDouble( -0.486909 ) ), ConsesLow.list( makeDouble( 0.256012 ), makeDouble( 0.852522 ),
          makeDouble( -0.7396 ), makeDouble( 0.233292 ), makeDouble( -0.0850184 ) ), ConsesLow.list( makeDouble( 0.704154 ), makeDouble( -0.182174 ), makeDouble( 0.169152 ), makeDouble( -1.2787 ), makeDouble(
              -0.400246 ) ), ConsesLow.list( makeDouble( 0.242133 ), makeDouble( -0.671766 ), makeDouble( -1.05614 ), makeDouble( -0.0740336 ), makeDouble( -0.0432617 ) ), ConsesLow.list( makeDouble( -0.871448 ),
                  makeDouble( 0.0101277 ), makeDouble( 0.221434 ), makeDouble( -0.0241337 ), makeDouble( -0.717193 ) ), ConsesLow.list( makeDouble( -0.228881 ), makeDouble( -0.132546 ), makeDouble( -0.240634 ),
                      makeDouble( 0.935199 ), makeDouble( 0.111408 ) ), ConsesLow.list( makeDouble( 0.456088 ), makeDouble( -0.189828 ), makeDouble( 0.06841 ), makeDouble( -0.112433 ), makeDouble( -0.254772 ) ),
      ConsesLow.list( makeDouble( 0.0838212 ), makeDouble( -0.901167 ), makeDouble( 0.555404 ), makeDouble( 0.126584 ), makeDouble( -1.13132 ) ), ConsesLow.list( makeDouble( 0.927022 ), makeDouble( -0.294691 ),
          makeDouble( 0.735027 ), makeDouble( 0.42247 ), makeDouble( 0.263537 ) ), ConsesLow.list( makeDouble( 0.229667 ), makeDouble( -0.76629 ), makeDouble( 1.13279 ), makeDouble( 0.0468138 ), makeDouble(
              -0.392014 ) ), ConsesLow.list( makeDouble( 0.565153 ), makeDouble( -0.082501 ), makeDouble( 0.208606 ), makeDouble( 0.101688 ), makeDouble( -0.672053 ) )
    } );
    $sym40$_RL_TACTICIAN_NEURAL_NET_ = makeSymbol( "*RL-TACTICIAN-NEURAL-NET*" );
    $int41$21 = makeInteger( 21 );
    $float42$0_01 = makeDouble( 0.01 );
    $float43$0_03 = makeDouble( 0.03 );
    $float44$0_97 = makeDouble( 0.97 );
    $sym45$TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE = makeSymbol( "TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-WITH-SOME-TOLERANCE" );
    $kw46$TEST = makeKeyword( "TEST" );
    $kw47$OWNER = makeKeyword( "OWNER" );
    $kw48$CLASSES = makeKeyword( "CLASSES" );
    $kw49$KB = makeKeyword( "KB" );
    $kw50$TINY = makeKeyword( "TINY" );
    $kw51$WORKING_ = makeKeyword( "WORKING?" );
    $list52 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeInteger( 1000 ), ONE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble( 0.85 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger(
        2000 ), TWO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble( 0.94 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 3000 ), THREE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble( 0.24 ) ), T ), ConsesLow
            .list( ConsesLow.list( makeInteger( 4000 ), ZERO_INTEGER, ONE_INTEGER, ZERO_INTEGER, makeDouble( 0.84 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 100 ), ZERO_INTEGER, TWO_INTEGER, ZERO_INTEGER,
                makeDouble( 0.95 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 50 ), ZERO_INTEGER, THREE_INTEGER, ZERO_INTEGER, makeDouble( 0.28 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 1000 ),
                    ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble( 0.97 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 2000 ), TWO_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble( 0.87 ) ), T ), ConsesLow
                        .list( ConsesLow.list( makeInteger( 3000 ), THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble( 0.02 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4000 ), ZERO_INTEGER, ONE_INTEGER,
                            ONE_INTEGER, makeDouble( 0.97 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 100 ), ZERO_INTEGER, TWO_INTEGER, ONE_INTEGER, makeDouble( 0.91 ) ), T ), ConsesLow.list( ConsesLow.list(
                                makeInteger( 50 ), ZERO_INTEGER, THREE_INTEGER, ONE_INTEGER, makeDouble( 0.04 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 1000 ), ONE_INTEGER, ZERO_INTEGER, THREE_INTEGER,
                                    makeDouble( 0.017 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 2000 ), TWO_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble( 0.018 ) ), T ), ConsesLow.list( ConsesLow.list(
                                        makeInteger( 3000 ), THREE_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble( 0.58 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4000 ), ZERO_INTEGER, ONE_INTEGER,
                                            THREE_INTEGER, makeDouble( 0.012 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 100 ), ZERO_INTEGER, TWO_INTEGER, FOUR_INTEGER, makeDouble( 0.58 ) ), T ), ConsesLow
                                                .list( ConsesLow.list( makeInteger( 50 ), ZERO_INTEGER, THREE_INTEGER, FOUR_INTEGER, makeDouble( 0.066 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 1000 ),
                                                    ONE_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble( 0.0019 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 2000 ), TWO_INTEGER, ZERO_INTEGER, FOUR_INTEGER,
                                                        makeDouble( 0.53 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4000 ), THREE_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble( 0.05 ) ), T ), ConsesLow
                                                            .list( ConsesLow.list( makeInteger( 4000 ), ZERO_INTEGER, ONE_INTEGER, FOUR_INTEGER, makeDouble( 0.0017 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger(
                                                                100 ), ZERO_INTEGER, TWO_INTEGER, FOUR_INTEGER, makeDouble( 0.58 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 50 ), ZERO_INTEGER, THREE_INTEGER,
                                                                    FOUR_INTEGER, makeDouble( 0.066 ) ), T )
    } );
  }

  public static final class $neural_net_native
      extends
        SubLStructNative
  {
    public SubLObject $input_nodes;
    private static final SubLStructDeclNative structDecl;

    public $neural_net_native()
    {
      this.$input_nodes = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $neural_net_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$input_nodes;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$input_nodes = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $neural_net_native.class, $sym0$NEURAL_NET, $sym1$NEURAL_NET_P, $list2, $list3, new String[] { "$input_nodes"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $neural_net_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $neural_net_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NEURAL-NET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return neural_net_p( arg1 );
    }
  }

  public static final class $nn_input_node_native
      extends
        SubLStructNative
  {
    public SubLObject $value;
    public SubLObject $weights;
    private static final SubLStructDeclNative structDecl;

    public $nn_input_node_native()
    {
      this.$value = CommonSymbols.NIL;
      this.$weights = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $nn_input_node_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$value;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$weights;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$value = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$weights = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $nn_input_node_native.class, $sym21$NN_INPUT_NODE, $sym22$NN_INPUT_NODE_P, $list23, $list24, new String[] { "$value", "$weights"
      }, $list25, $list26, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $nn_input_node_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $nn_input_node_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NN-INPUT-NODE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return nn_input_node_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 165 ms
 * 
 */