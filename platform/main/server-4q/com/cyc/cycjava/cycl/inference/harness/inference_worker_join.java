package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.clause_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_join
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_join";
  public static final String myFingerPrint = "ee705e0de1f70499905065f678070bdeb8d30ba466df94af23aea7f4064116db";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLSymbol $dtp_join_link_data$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16518L)
  private static SubLSymbol $join_module$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 21758L)
  private static SubLSymbol $join_productivity_scaling_factor$;
  private static final SubLSymbol $sym0$JOIN_LINK_DATA;
  private static final SubLSymbol $sym1$JOIN_LINK_DATA_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$J_LINK_DATA_JOIN_VARS;
  private static final SubLSymbol $sym10$_CSETF_J_LINK_DATA_JOIN_VARS;
  private static final SubLSymbol $sym11$J_LINK_DATA_FIRST_PROOF_INDEX;
  private static final SubLSymbol $sym12$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX;
  private static final SubLSymbol $sym13$J_LINK_DATA_SECOND_PROOF_INDEX;
  private static final SubLSymbol $sym14$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX;
  private static final SubLSymbol $kw15$JOIN_VARS;
  private static final SubLSymbol $kw16$FIRST_PROOF_INDEX;
  private static final SubLSymbol $kw17$SECOND_PROOF_INDEX;
  private static final SubLString $str18$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw19$BEGIN;
  private static final SubLSymbol $sym20$MAKE_JOIN_LINK_DATA;
  private static final SubLSymbol $kw21$SLOT;
  private static final SubLSymbol $kw22$END;
  private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD;
  private static final SubLSymbol $kw24$JOIN;
  private static final SubLSymbol $sym25$MAPPED_PROBLEM_P;
  private static final SubLSymbol $kw26$FREE;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$INDEX;
  private static final SubLSymbol $sym29$PROOF_LIST_VAR;
  private static final SubLSymbol $sym30$CLET;
  private static final SubLSymbol $sym31$JOIN_LINK_FIRST_PROOF_INDEX;
  private static final SubLSymbol $sym32$DO_DICTIONARY;
  private static final SubLSymbol $sym33$DO_LIST;
  private static final SubLSymbol $sym34$INDEX;
  private static final SubLSymbol $sym35$PROOF_LIST_VAR;
  private static final SubLSymbol $sym36$JOIN_LINK_SECOND_PROOF_INDEX;
  private static final SubLSymbol $sym37$DO_JOIN_LINK_FIRST_PROOFS;
  private static final SubLSymbol $sym38$DO_JOIN_LINK_SECOND_PROOFS;
  private static final SubLString $str39$couldn_t_find_the_join_tactic_for;
  private static final SubLSymbol $sym40$JOIN_LINK_P;
  private static final SubLSymbol $sym41$PROOF_P;
  private static final SubLString $str42$_a_was_a_rejected_proof;
  private static final SubLSymbol $sym43$HL_VAR_;
  private static final SubLSymbol $sym44$VARIABLE_BINDING_VALUE;
  private static final SubLSymbol $kw45$SKIP;
  private static final SubLSymbol $kw46$NEG;
  private static final SubLSymbol $kw47$POS;
  private static final SubLSymbol $sym48$SUBCLAUSE_SPEC_P;
  private static final SubLSymbol $sym49$JOIN_TACTIC_P;
  private static final SubLSymbol $sym50$STRATEGY_P;
  private static final SubLSymbol $kw51$TACTICAL;
  private static final SubLSymbol $kw52$DOOMED;
  private static final SubLSymbol $sym53$STRATEGIC_CONTEXT_P;
  private static final SubLSymbol $kw54$DISPREFERRED;
  private static final SubLString $str55$TVA_POS;
  private static final SubLSymbol $kw56$GROSSLY_DISPREFERRED;
  private static final SubLString $str57$DOUBLE_TVA_POS;
  private static final SubLString $str58$first_problem__;
  private static final SubLString $str59$second_problem__;
  private static final SubLString $str60$Join_tactics_like__a_must_only_ap;
  private static final SubLSymbol $sym61$PROOF_PROVEN_;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject join_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject join_link_data_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $join_link_data_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject j_link_data_join_vars(final SubLObject v_object)
  {
    assert NIL != join_link_data_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject j_link_data_first_proof_index(final SubLObject v_object)
  {
    assert NIL != join_link_data_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject j_link_data_second_proof_index(final SubLObject v_object)
  {
    assert NIL != join_link_data_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject _csetf_j_link_data_join_vars(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != join_link_data_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject _csetf_j_link_data_first_proof_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != join_link_data_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject _csetf_j_link_data_second_proof_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != join_link_data_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject make_join_link_data(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $join_link_data_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$JOIN_VARS ) )
      {
        _csetf_j_link_data_join_vars( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$FIRST_PROOF_INDEX ) )
      {
        _csetf_j_link_data_first_proof_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$SECOND_PROOF_INDEX ) )
      {
        _csetf_j_link_data_second_proof_index( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject visit_defstruct_join_link_data(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym20$MAKE_JOIN_LINK_DATA, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$JOIN_VARS, j_link_data_join_vars( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$FIRST_PROOF_INDEX, j_link_data_first_proof_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw17$SECOND_PROOF_INDEX, j_link_data_second_proof_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym20$MAKE_JOIN_LINK_DATA, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
  public static SubLObject visit_defstruct_object_join_link_data_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_join_link_data( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 2404L)
  public static SubLObject valid_join_link_data_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != join_link_data_p( v_object ) && NIL != dictionary.dictionary_p( j_link_data_first_proof_index( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 2570L)
  public static SubLObject new_join_link_data(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem)
  {
    final SubLObject data = make_join_link_data( UNPROVIDED );
    _csetf_j_link_data_join_vars( data, shared_sibling_vars( first_mapped_problem, second_mapped_problem ) );
    _csetf_j_link_data_first_proof_index( data, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_j_link_data_second_proof_index( data, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    return data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 3222L)
  public static SubLObject join_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_problem_link.problem_link_p( v_object ) && $kw24$JOIN == inference_datastructures_problem_link.problem_link_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 3397L)
  public static SubLObject maybe_new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem)
  {
    final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( supported_problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject candidate_link;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      candidate_link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, candidate_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( candidate_link, $kw24$JOIN )
          && NIL != inference_datastructures_problem_link.mapped_problem_equal( first_supporting_mapped_problem, join_link_first_mapped_problem( candidate_link ) ) && NIL != inference_datastructures_problem_link
              .mapped_problem_equal( second_supporting_mapped_problem, join_link_second_mapped_problem( candidate_link ) ) )
      {
        return candidate_link;
      }
    }
    return new_join_link( supported_problem, first_supporting_mapped_problem, second_supporting_mapped_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 4067L)
  public static SubLObject new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem)
  {
    assert NIL != inference_datastructures_problem_link.mapped_problem_p( first_supporting_mapped_problem ) : first_supporting_mapped_problem;
    assert NIL != inference_datastructures_problem_link.mapped_problem_p( second_supporting_mapped_problem ) : second_supporting_mapped_problem;
    final SubLObject link = inference_datastructures_problem_link.new_problem_link( $kw24$JOIN, supported_problem );
    final SubLObject data = new_join_link_data( first_supporting_mapped_problem, second_supporting_mapped_problem );
    inference_datastructures_problem_link.set_problem_link_data( link, data );
    inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( second_supporting_mapped_problem, link );
    inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( first_supporting_mapped_problem, link );
    inference_worker.propagate_problem_link( link );
    return link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 4863L)
  public static SubLObject destroy_join_link(final SubLObject join_link)
  {
    final SubLObject tactic = join_link_tactic_int( join_link );
    if( NIL != inference_datastructures_tactic.valid_tactic_p( tactic ) )
    {
      inference_datastructures_tactic.destroy_problem_tactic_and_backpointers( tactic );
    }
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( join_link );
    if( NIL != valid_join_link_data_p( data ) )
    {
      _csetf_j_link_data_join_vars( data, $kw26$FREE );
      dictionary.clear_dictionary( j_link_data_first_proof_index( data ) );
      _csetf_j_link_data_first_proof_index( data, $kw26$FREE );
      dictionary.clear_dictionary( j_link_data_second_proof_index( data ) );
      _csetf_j_link_data_second_proof_index( data, $kw26$FREE );
    }
    return join_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 5510L)
  public static SubLObject do_join_link_first_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bindings_var = NIL;
    SubLObject proof_var = NIL;
    SubLObject join_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    bindings_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    join_link = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject index = $sym28$INDEX;
      final SubLObject proof_list_var = $sym29$PROOF_LIST_VAR;
      return ConsesLow.list( $sym30$CLET, ConsesLow.list( ConsesLow.list( index, ConsesLow.list( $sym31$JOIN_LINK_FIRST_PROOF_INDEX, join_link ) ) ), ConsesLow.list( $sym32$DO_DICTIONARY, ConsesLow.list( bindings_var,
          proof_list_var, index ), ConsesLow.listS( $sym33$DO_LIST, ConsesLow.list( proof_var, proof_list_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 5847L)
  public static SubLObject do_join_link_second_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bindings_var = NIL;
    SubLObject proof_var = NIL;
    SubLObject join_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    bindings_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    join_link = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject index = $sym34$INDEX;
      final SubLObject proof_list_var = $sym35$PROOF_LIST_VAR;
      return ConsesLow.list( $sym30$CLET, ConsesLow.list( ConsesLow.list( index, ConsesLow.list( $sym36$JOIN_LINK_SECOND_PROOF_INDEX, join_link ) ) ), ConsesLow.list( $sym32$DO_DICTIONARY, ConsesLow.list( bindings_var,
          proof_list_var, index ), ConsesLow.listS( $sym33$DO_LIST, ConsesLow.list( proof_var, proof_list_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6172L)
  public static SubLObject join_link_join_vars(final SubLObject join_link)
  {
    return j_link_data_join_vars( inference_datastructures_problem_link.problem_link_data( join_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6298L)
  public static SubLObject join_link_first_proof_index(final SubLObject join_link)
  {
    return j_link_data_first_proof_index( inference_datastructures_problem_link.problem_link_data( join_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6468L)
  public static SubLObject join_link_second_proof_index(final SubLObject join_link)
  {
    return j_link_data_second_proof_index( inference_datastructures_problem_link.problem_link_data( join_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6641L)
  public static SubLObject join_link_first_mapped_problem(final SubLObject join_link)
  {
    return inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_link ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6798L)
  public static SubLObject join_link_second_mapped_problem(final SubLObject join_link)
  {
    return conses_high.second( inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6931L)
  public static SubLObject join_link_first_problem(final SubLObject join_link)
  {
    return inference_datastructures_problem_link.mapped_problem_problem( join_link_first_mapped_problem( join_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7063L)
  public static SubLObject join_link_second_problem(final SubLObject join_link)
  {
    return inference_datastructures_problem_link.mapped_problem_problem( join_link_second_mapped_problem( join_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7197L)
  public static SubLObject join_link_trigger_variable_map(final SubLObject join_link, final SubLObject trigger_is_firstP)
  {
    return inference_datastructures_problem_link.mapped_problem_variable_map( join_link_trigger_mapped_problem( join_link, trigger_is_firstP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7378L)
  public static SubLObject join_link_trigger_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP)
  {
    return ( NIL != trigger_is_firstP ) ? join_link_first_mapped_problem( join_link ) : join_link_second_mapped_problem( join_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7588L)
  public static SubLObject join_link_sibling_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP)
  {
    return ( NIL != trigger_is_firstP ) ? join_link_second_mapped_problem( join_link ) : join_link_first_mapped_problem( join_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7798L)
  public static SubLObject join_link_first_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings)
  {
    final SubLObject index = join_link_first_proof_index( join_link );
    final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings( proof_bindings );
    final SubLObject first_proofs = dictionary.dictionary_lookup( index, canonical_proof_bindings, UNPROVIDED );
    return first_proofs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8100L)
  public static SubLObject join_link_second_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings)
  {
    final SubLObject index = join_link_second_proof_index( join_link );
    final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings( proof_bindings );
    final SubLObject second_proofs = dictionary.dictionary_lookup( index, canonical_proof_bindings, UNPROVIDED );
    return second_proofs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8405L)
  public static SubLObject join_link_sibling_proofs_lookup(final SubLObject join_link, final SubLObject trigger_proof_bindings_wrt_supported, final SubLObject trigger_is_firstP)
  {
    return ( NIL != trigger_is_firstP ) ? join_link_second_proofs_lookup( join_link, trigger_proof_bindings_wrt_supported ) : join_link_first_proofs_lookup( join_link, trigger_proof_bindings_wrt_supported );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8724L)
  public static SubLObject join_link_shared_proof_bindings(final SubLObject join_link, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP)
  {
    final SubLObject shared_supported_vars = join_link_join_vars( join_link );
    final SubLObject trigger_to_supported_variable_map = join_link_trigger_variable_map( join_link, trigger_is_firstP );
    final SubLObject trigger_proof_bindings_wrt_supported = bindings.transfer_variable_map_to_bindings_filtered( trigger_to_supported_variable_map, trigger_proof_bindings );
    final SubLObject shared_trigger_proof_bindings_wrt_supported = bindings.filter_bindings_by_variables( trigger_proof_bindings_wrt_supported, shared_supported_vars );
    return shared_trigger_proof_bindings_wrt_supported;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 9605L)
  public static SubLObject join_link_tactic(final SubLObject join_link)
  {
    final SubLObject join_tactic = join_link_tactic_int( join_link );
    if( NIL != join_tactic )
    {
      return join_tactic;
    }
    if( NIL == inference_datastructures_problem.tactically_unexamined_problem_p( inference_datastructures_problem_link.problem_link_supported_problem( join_link ) ) )
    {
      return Errors.error( $str39$couldn_t_find_the_join_tactic_for, join_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 9910L)
  public static SubLObject join_link_tactic_int(final SubLObject join_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_link );
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( supported_problem );
    SubLObject join_tactic = NIL;
    join_tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( join_tactic, $join_module$.getDynamicValue( thread ) ) && join_link.eql( join_tactic_link( join_tactic ) ) )
      {
        return join_tactic;
      }
      cdolist_list_var = cdolist_list_var.rest();
      join_tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 10196L)
  public static SubLObject add_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_link_p( join_link ) : join_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_link_first_proof_index( join_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_push( index, canonical_bindings, proof );
    return join_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 10611L)
  public static SubLObject remove_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_link_p( join_link ) : join_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_link_first_proof_index( join_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_delete_from_value( index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED );
    return join_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 11020L)
  public static SubLObject add_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_link_p( join_link ) : join_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_link_second_proof_index( join_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_push( index, canonical_bindings, proof );
    return join_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 11414L)
  public static SubLObject remove_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_link_p( join_link ) : join_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_link_second_proof_index( join_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_delete_from_value( index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED );
    return join_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 11826L)
  public static SubLObject add_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_is_firstP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == inference_datastructures_proof.proof_provenP( trigger_proof ) )
    {
      Errors.error( $str42$_a_was_a_rejected_proof, trigger_proof );
    }
    final SubLObject shared_trigger_proof_bindings = join_link_shared_proof_bindings( join_link, inference_datastructures_proof.proof_bindings( trigger_proof ), trigger_is_firstP );
    if( NIL != trigger_is_firstP )
    {
      add_join_link_first_proof( join_link, shared_trigger_proof_bindings, trigger_proof );
    }
    else
    {
      add_join_link_second_proof( join_link, shared_trigger_proof_bindings, trigger_proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 12603L)
  public static SubLObject remove_join_link_proof_both_ways(final SubLObject join_link, final SubLObject proof, final SubLObject v_bindings)
  {
    remove_join_link_proof( join_link, proof, v_bindings, T );
    remove_join_link_proof( join_link, proof, v_bindings, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 12805L)
  public static SubLObject remove_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP)
  {
    final SubLObject shared_trigger_proof_bindings = join_link_shared_proof_bindings( join_link, trigger_proof_bindings, trigger_is_firstP );
    if( NIL != trigger_is_firstP )
    {
      remove_join_link_first_proof( join_link, shared_trigger_proof_bindings, trigger_proof );
    }
    else
    {
      remove_join_link_second_proof( join_link, shared_trigger_proof_bindings, trigger_proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 13402L)
  public static SubLObject find_or_create_join_link_supporting_mapped_problems(final SubLObject store, final SubLObject dnf_clause, final SubLObject first_supporting_problem_spec, final SubLObject supported_problem)
  {
    final SubLObject first_mapped_query = inference_datastructures_problem_query.new_problem_query_from_subclause_spec( dnf_clause, first_supporting_problem_spec );
    final SubLObject second_mapped_query = inference_datastructures_problem_query.new_problem_query_without_subclause_spec( dnf_clause, first_supporting_problem_spec );
    final SubLObject first_mapped_query_vars = cycl_utilities.expression_gather( first_mapped_query, $sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject second_mapped_query_vars = cycl_utilities.expression_gather( second_mapped_query, $sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject free_hl_vars = ( NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP( store ) ) ? conses_high.union( inference_datastructures_problem
        .problem_free_hl_vars( supported_problem ), conses_high.intersection( first_mapped_query_vars, second_mapped_query_vars, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject first_mapped_query_free_vars = conses_high.intersection( free_hl_vars, first_mapped_query_vars, UNPROVIDED, UNPROVIDED );
    final SubLObject second_mapped_query_free_vars = conses_high.intersection( free_hl_vars, second_mapped_query_vars, UNPROVIDED, UNPROVIDED );
    final SubLObject first_mapped_problem = inference_worker.find_or_create_problem( store, first_mapped_query, first_mapped_query_free_vars, UNPROVIDED );
    final SubLObject second_mapped_problem = inference_worker.find_or_create_problem( store, second_mapped_query, second_mapped_query_free_vars, UNPROVIDED );
    return Values.values( first_mapped_problem, second_mapped_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 14598L)
  public static SubLObject first_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem)
  {
    final SubLObject shared_sibling_vars = shared_sibling_vars( first_mapped_problem, second_mapped_problem );
    return bindings.apply_bindings_backwards( inference_datastructures_problem_link.mapped_problem_variable_map( first_mapped_problem ), shared_sibling_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 15093L)
  public static SubLObject second_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem)
  {
    final SubLObject shared_sibling_vars = shared_sibling_vars( first_mapped_problem, second_mapped_problem );
    return bindings.apply_bindings_backwards( inference_datastructures_problem_link.mapped_problem_variable_map( second_mapped_problem ), shared_sibling_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 15590L)
  public static SubLObject shared_sibling_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem)
  {
    SubLObject shared_vars = NIL;
    final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( first_mapped_problem );
    final SubLObject second_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( second_mapped_problem );
    SubLObject cdolist_list_var = first_variable_map;
    SubLObject variable_binding = NIL;
    variable_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject supported_var = bindings.variable_binding_value( variable_binding );
      if( NIL != subl_promotions.memberP( supported_var, second_variable_map, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym44$VARIABLE_BINDING_VALUE ) ) )
      {
        shared_vars = ConsesLow.cons( supported_var, shared_vars );
      }
      cdolist_list_var = cdolist_list_var.rest();
      variable_binding = cdolist_list_var.first();
    }
    return variables.sort_hl_variable_list( shared_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16638L)
  public static SubLObject join_tactic_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != inference_datastructures_tactic.tactic_p( v_object ) && $join_module$.getDynamicValue( thread ).eql( inference_datastructures_tactic.tactic_hl_module( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16776L)
  public static SubLObject new_join_tactic(final SubLObject join_link, final SubLObject first_supporting_problem_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem( join_link );
    final SubLObject data = ConsesLow.list( join_link, first_supporting_problem_spec );
    final SubLObject tactic = inference_datastructures_tactic.new_tactic( problem, $join_module$.getDynamicValue( thread ), data );
    final SubLObject prob = problem;
    final SubLObject store = inference_datastructures_problem.problem_store( prob );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw45$SKIP ) )
    {
      final SubLObject idx_$1 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw45$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw45$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  inference_tactician.strategy_note_new_tactic( strategy, tactic );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$2 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$2 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  inference_tactician.strategy_note_new_tactic( strategy2, tactic );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17165L)
  public static SubLObject join_tactic_link(final SubLObject join_tactic)
  {
    return inference_datastructures_tactic.tactic_data( join_tactic ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17393L)
  public static SubLObject join_tactic_first_supporting_problem_spec(final SubLObject tactic)
  {
    return conses_high.second( inference_datastructures_tactic.tactic_data( tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17531L)
  public static SubLObject join_tactic_first_problem(final SubLObject join_tactic)
  {
    final SubLObject link = join_tactic_link( join_tactic );
    if( NIL != link )
    {
      return join_link_first_problem( link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17726L)
  public static SubLObject join_tactic_second_problem(final SubLObject join_tactic)
  {
    final SubLObject link = join_tactic_link( join_tactic );
    if( NIL != link )
    {
      return join_link_second_problem( link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17909L)
  public static SubLObject join_tactic_lookahead_problems(final SubLObject join_tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject first_problem = join_tactic_first_problem( join_tactic );
    SubLObject second_problem = join_tactic_second_problem( join_tactic );
    if( NIL == first_problem || NIL == second_problem )
    {
      thread.resetMultipleValues();
      final SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems( join_tactic );
      final SubLObject second_mapped_problem = thread.secondMultipleValue();
      thread.resetMultipleValues();
      first_problem = inference_datastructures_problem_link.mapped_problem_problem( first_mapped_problem );
      second_problem = inference_datastructures_problem_link.mapped_problem_problem( second_mapped_problem );
    }
    return Values.values( first_problem, second_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 18532L)
  public static SubLObject determine_new_join_tactics(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    if( NIL != clause_utilities.binary_clause_p( dnf_clause ) && NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP( dnf_clause ) )
    {
      SubLObject doneP = NIL;
      SubLObject index = ZERO_INTEGER;
      SubLObject cdolist_list_var = clauses.neg_lits( dnf_clause );
      SubLObject contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sense = $kw46$NEG;
        if( NIL == doneP )
        {
          final SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec( sense, index );
          possibly_determine_new_join_tactic( supported_problem, first_supporting_problem_spec, dnf_clause );
          doneP = T;
        }
        index = Numbers.add( index, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_asent = cdolist_list_var.first();
      }
      index = ZERO_INTEGER;
      cdolist_list_var = clauses.pos_lits( dnf_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sense = $kw47$POS;
        if( NIL == doneP )
        {
          final SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec( sense, index );
          possibly_determine_new_join_tactic( supported_problem, first_supporting_problem_spec, dnf_clause );
          doneP = T;
        }
        index = Numbers.add( index, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_asent = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 19617L)
  public static SubLObject possibly_determine_new_join_tactic(final SubLObject supported_problem, final SubLObject first_supporting_problem_spec, final SubLObject dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != clause_utilities.subclause_spec_p( first_supporting_problem_spec ) : first_supporting_problem_spec;
    final SubLObject store = inference_datastructures_problem.problem_store( supported_problem );
    thread.resetMultipleValues();
    final SubLObject first_mapped_problem = find_or_create_join_link_supporting_mapped_problems( store, dnf_clause, first_supporting_problem_spec, supported_problem );
    final SubLObject second_mapped_problem = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject join_link = maybe_new_join_link( supported_problem, first_mapped_problem, second_mapped_problem );
    return new_join_tactic( join_link, first_supporting_problem_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 20463L)
  public static SubLObject compute_strategic_properties_of_join_tactic(final SubLObject tactic, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != join_tactic_p( tactic ) : tactic;
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    final SubLObject join_link = join_tactic_link( tactic );
    final SubLObject first_mapped_problem = join_link_first_mapped_problem( join_link );
    final SubLObject second_mapped_problem = join_link_second_mapped_problem( join_link );
    if( NIL == preference_modules.preference_level_p( inference_datastructures_tactic.tactic_preference_level( tactic ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject preference_level = compute_join_tactic_preference_level( first_mapped_problem, second_mapped_problem, $kw51$TACTICAL );
      final SubLObject justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      inference_datastructures_tactic.set_tactic_preference_level( tactic, preference_level, justification );
      if( $kw52$DOOMED == preference_level )
      {
        inference_worker.note_tactic_doomed( tactic, $kw51$TACTICAL );
      }
    }
    thread.resetMultipleValues();
    final SubLObject preference_level = compute_join_tactic_preference_level( first_mapped_problem, second_mapped_problem, strategy );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    inference_datastructures_strategy.set_tactic_strategic_preference_level( tactic, strategy, preference_level, justification );
    if( $kw52$DOOMED == preference_level )
    {
      inference_worker.note_tactic_doomed( tactic, strategy );
    }
    final SubLObject productivity = compute_join_tactic_productivity( first_mapped_problem, second_mapped_problem, strategy );
    inference_datastructures_strategy.set_tactic_strategic_productivity( tactic, strategy, productivity );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 22028L)
  public static SubLObject compute_join_tactic_productivity(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_problem_link.mapped_problem_p( first_mapped_problem ) : first_mapped_problem;
    assert NIL != inference_datastructures_problem_link.mapped_problem_p( second_mapped_problem ) : second_mapped_problem;
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem( first_mapped_problem );
    final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem( second_mapped_problem );
    final SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity( first_problem, strategy );
    final SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity( second_problem, strategy );
    final SubLObject raw_join_productivity = inference_datastructures_enumerated_types.productivity_max( first_productivity, second_productivity );
    final SubLObject join_productivity = inference_datastructures_enumerated_types.productivity_divide_number( raw_join_productivity, $join_productivity_scaling_factor$.getDynamicValue( thread ) );
    return join_productivity;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 22930L)
  public static SubLObject compute_join_tactic_preference_level(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategic_context)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_problem_link.mapped_problem_p( first_mapped_problem ) : first_mapped_problem;
    assert NIL != inference_datastructures_problem_link.mapped_problem_p( second_mapped_problem ) : second_mapped_problem;
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem( first_mapped_problem );
    final SubLObject first_problem_shared_vars = first_problem_shared_vars( first_mapped_problem, second_mapped_problem );
    final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem( second_mapped_problem );
    final SubLObject second_problem_shared_vars = second_problem_shared_vars( first_mapped_problem, second_mapped_problem );
    thread.resetMultipleValues();
    final SubLObject first_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level( first_problem, strategic_context, first_problem_shared_vars );
    final SubLObject first_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject second_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level( second_problem, strategic_context, second_problem_shared_vars );
    final SubLObject second_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( first_preference_level == $kw54$DISPREFERRED && NIL != Strings.stringE( first_justification, $str55$TVA_POS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && second_preference_level == $kw54$DISPREFERRED
        && NIL != Strings.stringE( second_justification, $str55$TVA_POS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return Values.values( $kw56$GROSSLY_DISPREFERRED, $str57$DOUBLE_TVA_POS );
    }
    if( NIL != preference_modules.preference_level_L( first_preference_level, second_preference_level ) )
    {
      final SubLObject justification = Sequences.cconcatenate( $str58$first_problem__, first_justification );
      return Values.values( first_preference_level, justification );
    }
    final SubLObject justification = Sequences.cconcatenate( $str59$second_problem__, second_justification );
    return Values.values( second_preference_level, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 24640L)
  public static SubLObject execute_join_tactic(final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems( tactic );
    final SubLObject second_mapped_problem = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject join_link = join_tactic_link( tactic );
    inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem( join_link, first_mapped_problem );
    inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem( join_link, second_mapped_problem );
    if( NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP( tactic, $kw51$TACTICAL ) )
    {
      inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics( tactic );
    }
    inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level( tactic );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 25594L)
  public static SubLObject find_or_create_join_tactic_supporting_mapped_problems(final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject query = inference_datastructures_problem.problem_query( problem );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( query ) )
    {
      Errors.error( $str60$Join_tactics_like__a_must_only_ap, tactic, query );
    }
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject dnf_clause = query.first();
    final SubLObject first_supporting_problem_spec = join_tactic_first_supporting_problem_spec( tactic );
    return find_or_create_join_link_supporting_mapped_problems( store, dnf_clause, first_supporting_problem_spec, problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26195L)
  public static SubLObject new_join_proof(final SubLObject join_link, final SubLObject subproofs_with_sub_bindings)
  {
    return inference_worker_join_ordered.new_conjunctive_proof( join_link, subproofs_with_sub_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26475L)
  public static SubLObject join_proof_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_proof.proof_p( v_object ) && $kw24$JOIN == inference_datastructures_proof.proof_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26600L)
  public static SubLObject bubble_up_proof_to_join_link(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link)
  {
    final SubLObject trigger_is_firstP = mapped_proof_is_firstP( trigger_subproof, variable_map, join_link );
    add_join_link_proof( join_link, trigger_subproof, trigger_is_firstP );
    bubble_up_proof_to_join_link_int( trigger_subproof, variable_map, join_link, trigger_is_firstP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26987L)
  public static SubLObject mapped_proof_is_firstP(final SubLObject subproof, final SubLObject proof_variable_map, final SubLObject join_link)
  {
    final SubLObject first_mapped_problem = join_link_first_mapped_problem( join_link );
    final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem( first_mapped_problem );
    final SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem( subproof );
    if( first_problem.eql( subproof_supported_problem ) )
    {
      final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( first_mapped_problem );
      if( NIL != bindings.bindings_equalP( first_variable_map, proof_variable_map ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 27527L)
  public static SubLObject bubble_up_proof_to_join_link_int(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link, final SubLObject trigger_is_firstP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject proofs = NIL;
    final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings( trigger_subproof );
    final SubLObject join_bindings = join_link_shared_proof_bindings( join_link, trigger_proof_bindings, trigger_is_firstP );
    final SubLObject sibling_proofs = list_utilities.remove_if_not( $sym61$PROOF_PROVEN_, join_link_sibling_proofs_lookup( join_link, join_bindings, trigger_is_firstP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != sibling_proofs )
    {
      final SubLObject sibling_mapped_problem = join_link_sibling_mapped_problem( join_link, trigger_is_firstP );
      final SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( sibling_mapped_problem );
      SubLObject sibling_proofs_with_bindings = NIL;
      SubLObject cdolist_list_var = sibling_proofs;
      SubLObject sibling_proof = NIL;
      sibling_proof = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings( sibling_variable_map, inference_datastructures_proof.proof_bindings( sibling_proof ) );
        sibling_proofs_with_bindings = ConsesLow.cons( ConsesLow.cons( sibling_proof, sibling_sub_proof_bindings ), sibling_proofs_with_bindings );
        cdolist_list_var = cdolist_list_var.rest();
        sibling_proof = cdolist_list_var.first();
      }
      sibling_proofs_with_bindings = Sequences.nreverse( sibling_proofs_with_bindings );
      final SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings( variable_map, trigger_proof_bindings );
      final SubLObject supporting_mapped_proof_lists_by_supporting_problem = ( NIL != trigger_is_firstP ) ? ConsesLow.list( ConsesLow.list( ConsesLow.cons( trigger_subproof, trigger_sub_proof_bindings ) ),
          sibling_proofs_with_bindings ) : ConsesLow.list( sibling_proofs_with_bindings, ConsesLow.list( ConsesLow.cons( trigger_subproof, trigger_sub_proof_bindings ) ) );
      SubLObject cdolist_list_var2;
      final SubLObject mapped_subproof_lists = cdolist_list_var2 = list_utilities.cartesian_product( supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject mapped_subproof_list = NIL;
      mapped_subproof_list = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        thread.resetMultipleValues();
        final SubLObject proof = new_join_proof( join_link, mapped_subproof_list );
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != newP )
        {
          proofs = ConsesLow.cons( proof, proofs );
        }
        else
        {
          inference_worker.possibly_note_proof_processed( trigger_subproof );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        mapped_subproof_list = cdolist_list_var2.first();
      }
      SubLObject cdolist_list_var3;
      proofs = ( cdolist_list_var3 = Sequences.nreverse( proofs ) );
      SubLObject proof2 = NIL;
      proof2 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        inference_worker.bubble_up_proof( proof2 );
        cdolist_list_var3 = cdolist_list_var3.rest();
        proof2 = cdolist_list_var3.first();
      }
    }
    return NIL;
  }

  public static SubLObject declare_inference_worker_join_file()
  {
    SubLFiles.declareFunction( me, "join_link_data_print_function_trampoline", "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "join_link_data_p", "JOIN-LINK-DATA-P", 1, 0, false );
    new $join_link_data_p$UnaryFunction();
    SubLFiles.declareFunction( me, "j_link_data_join_vars", "J-LINK-DATA-JOIN-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "j_link_data_first_proof_index", "J-LINK-DATA-FIRST-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "j_link_data_second_proof_index", "J-LINK-DATA-SECOND-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_j_link_data_join_vars", "_CSETF-J-LINK-DATA-JOIN-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_j_link_data_first_proof_index", "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_j_link_data_second_proof_index", "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "make_join_link_data", "MAKE-JOIN-LINK-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_join_link_data", "VISIT-DEFSTRUCT-JOIN-LINK-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_join_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_join_link_data_p", "VALID-JOIN-LINK-DATA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_join_link_data", "NEW-JOIN-LINK-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "join_link_p", "JOIN-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_new_join_link", "MAYBE-NEW-JOIN-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "new_join_link", "NEW-JOIN-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "destroy_join_link", "DESTROY-JOIN-LINK", 1, 0, false );
    SubLFiles.declareMacro( me, "do_join_link_first_proofs", "DO-JOIN-LINK-FIRST-PROOFS" );
    SubLFiles.declareMacro( me, "do_join_link_second_proofs", "DO-JOIN-LINK-SECOND-PROOFS" );
    SubLFiles.declareFunction( me, "join_link_join_vars", "JOIN-LINK-JOIN-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_first_proof_index", "JOIN-LINK-FIRST-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_second_proof_index", "JOIN-LINK-SECOND-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_first_mapped_problem", "JOIN-LINK-FIRST-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_second_mapped_problem", "JOIN-LINK-SECOND-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_first_problem", "JOIN-LINK-FIRST-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_second_problem", "JOIN-LINK-SECOND-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_trigger_variable_map", "JOIN-LINK-TRIGGER-VARIABLE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "join_link_trigger_mapped_problem", "JOIN-LINK-TRIGGER-MAPPED-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "join_link_sibling_mapped_problem", "JOIN-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "join_link_first_proofs_lookup", "JOIN-LINK-FIRST-PROOFS-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "join_link_second_proofs_lookup", "JOIN-LINK-SECOND-PROOFS-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "join_link_sibling_proofs_lookup", "JOIN-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false );
    SubLFiles.declareFunction( me, "join_link_shared_proof_bindings", "JOIN-LINK-SHARED-PROOF-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "join_link_tactic", "JOIN-LINK-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "join_link_tactic_int", "JOIN-LINK-TACTIC-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "add_join_link_first_proof", "ADD-JOIN-LINK-FIRST-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_link_first_proof", "REMOVE-JOIN-LINK-FIRST-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "add_join_link_second_proof", "ADD-JOIN-LINK-SECOND-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_link_second_proof", "REMOVE-JOIN-LINK-SECOND-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "add_join_link_proof", "ADD-JOIN-LINK-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_link_proof_both_ways", "REMOVE-JOIN-LINK-PROOF-BOTH-WAYS", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_link_proof", "REMOVE-JOIN-LINK-PROOF", 4, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 4, 0, false );
    SubLFiles.declareFunction( me, "first_problem_shared_vars", "FIRST-PROBLEM-SHARED-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "second_problem_shared_vars", "SECOND-PROBLEM-SHARED-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "shared_sibling_vars", "SHARED-SIBLING-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "join_tactic_p", "JOIN-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_join_tactic", "NEW-JOIN-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "join_tactic_link", "JOIN-TACTIC-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "join_tactic_first_supporting_problem_spec", "JOIN-TACTIC-FIRST-SUPPORTING-PROBLEM-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "join_tactic_first_problem", "JOIN-TACTIC-FIRST-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_tactic_second_problem", "JOIN-TACTIC-SECOND-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_tactic_lookahead_problems", "JOIN-TACTIC-LOOKAHEAD-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_new_join_tactics", "DETERMINE-NEW-JOIN-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_determine_new_join_tactic", "POSSIBLY-DETERMINE-NEW-JOIN-TACTIC", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_strategic_properties_of_join_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_join_tactic_productivity", "COMPUTE-JOIN-TACTIC-PRODUCTIVITY", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_join_tactic_preference_level", "COMPUTE-JOIN-TACTIC-PREFERENCE-LEVEL", 3, 0, false );
    SubLFiles.declareFunction( me, "execute_join_tactic", "EXECUTE-JOIN-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_join_tactic_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-TACTIC-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_join_proof", "NEW-JOIN-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "join_proof_p", "JOIN-PROOF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "bubble_up_proof_to_join_link", "BUBBLE-UP-PROOF-TO-JOIN-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "mapped_proof_is_firstP", "MAPPED-PROOF-IS-FIRST?", 3, 0, false );
    SubLFiles.declareFunction( me, "bubble_up_proof_to_join_link_int", "BUBBLE-UP-PROOF-TO-JOIN-LINK-INT", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_worker_join_file()
  {
    $dtp_join_link_data$ = SubLFiles.defconstant( "*DTP-JOIN-LINK-DATA*", $sym0$JOIN_LINK_DATA );
    $join_module$ = SubLFiles.defparameter( "*JOIN-MODULE*", inference_modules.inference_structural_module( $kw24$JOIN, UNPROVIDED ) );
    $join_productivity_scaling_factor$ = SubLFiles.defparameter( "*JOIN-PRODUCTIVITY-SCALING-FACTOR*", EIGHT_INTEGER );
    return NIL;
  }

  public static SubLObject setup_inference_worker_join_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_join_link_data$.getGlobalValue(), Symbols.symbol_function( $sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$J_LINK_DATA_JOIN_VARS, $sym10$_CSETF_J_LINK_DATA_JOIN_VARS );
    Structures.def_csetf( $sym11$J_LINK_DATA_FIRST_PROOF_INDEX, $sym12$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX );
    Structures.def_csetf( $sym13$J_LINK_DATA_SECOND_PROOF_INDEX, $sym14$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX );
    Equality.identity( $sym0$JOIN_LINK_DATA );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_join_link_data$.getGlobalValue(), Symbols.symbol_function( $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD ) );
    access_macros.register_macro_helper( $sym31$JOIN_LINK_FIRST_PROOF_INDEX, $sym37$DO_JOIN_LINK_FIRST_PROOFS );
    access_macros.register_macro_helper( $sym36$JOIN_LINK_SECOND_PROOF_INDEX, $sym38$DO_JOIN_LINK_SECOND_PROOFS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_worker_join_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_worker_join_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_worker_join_file();
  }
  static
  {
    me = new inference_worker_join();
    $dtp_join_link_data$ = null;
    $join_module$ = null;
    $join_productivity_scaling_factor$ = null;
    $sym0$JOIN_LINK_DATA = makeSymbol( "JOIN-LINK-DATA" );
    $sym1$JOIN_LINK_DATA_P = makeSymbol( "JOIN-LINK-DATA-P" );
    $list2 = ConsesLow.list( makeSymbol( "JOIN-VARS" ), makeSymbol( "FIRST-PROOF-INDEX" ), makeSymbol( "SECOND-PROOF-INDEX" ) );
    $list3 = ConsesLow.list( makeKeyword( "JOIN-VARS" ), makeKeyword( "FIRST-PROOF-INDEX" ), makeKeyword( "SECOND-PROOF-INDEX" ) );
    $list4 = ConsesLow.list( makeSymbol( "J-LINK-DATA-JOIN-VARS" ), makeSymbol( "J-LINK-DATA-FIRST-PROOF-INDEX" ), makeSymbol( "J-LINK-DATA-SECOND-PROOF-INDEX" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-J-LINK-DATA-JOIN-VARS" ), makeSymbol( "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX" ), makeSymbol( "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "JOIN-LINK-DATA-P" ) );
    $sym9$J_LINK_DATA_JOIN_VARS = makeSymbol( "J-LINK-DATA-JOIN-VARS" );
    $sym10$_CSETF_J_LINK_DATA_JOIN_VARS = makeSymbol( "_CSETF-J-LINK-DATA-JOIN-VARS" );
    $sym11$J_LINK_DATA_FIRST_PROOF_INDEX = makeSymbol( "J-LINK-DATA-FIRST-PROOF-INDEX" );
    $sym12$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX = makeSymbol( "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX" );
    $sym13$J_LINK_DATA_SECOND_PROOF_INDEX = makeSymbol( "J-LINK-DATA-SECOND-PROOF-INDEX" );
    $sym14$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX = makeSymbol( "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX" );
    $kw15$JOIN_VARS = makeKeyword( "JOIN-VARS" );
    $kw16$FIRST_PROOF_INDEX = makeKeyword( "FIRST-PROOF-INDEX" );
    $kw17$SECOND_PROOF_INDEX = makeKeyword( "SECOND-PROOF-INDEX" );
    $str18$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw19$BEGIN = makeKeyword( "BEGIN" );
    $sym20$MAKE_JOIN_LINK_DATA = makeSymbol( "MAKE-JOIN-LINK-DATA" );
    $kw21$SLOT = makeKeyword( "SLOT" );
    $kw22$END = makeKeyword( "END" );
    $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD" );
    $kw24$JOIN = makeKeyword( "JOIN" );
    $sym25$MAPPED_PROBLEM_P = makeSymbol( "MAPPED-PROBLEM-P" );
    $kw26$FREE = makeKeyword( "FREE" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "BINDINGS-VAR" ), makeSymbol( "PROOF-VAR" ), makeSymbol( "JOIN-LINK" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym28$INDEX = makeUninternedSymbol( "INDEX" );
    $sym29$PROOF_LIST_VAR = makeUninternedSymbol( "PROOF-LIST-VAR" );
    $sym30$CLET = makeSymbol( "CLET" );
    $sym31$JOIN_LINK_FIRST_PROOF_INDEX = makeSymbol( "JOIN-LINK-FIRST-PROOF-INDEX" );
    $sym32$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $sym33$DO_LIST = makeSymbol( "DO-LIST" );
    $sym34$INDEX = makeUninternedSymbol( "INDEX" );
    $sym35$PROOF_LIST_VAR = makeUninternedSymbol( "PROOF-LIST-VAR" );
    $sym36$JOIN_LINK_SECOND_PROOF_INDEX = makeSymbol( "JOIN-LINK-SECOND-PROOF-INDEX" );
    $sym37$DO_JOIN_LINK_FIRST_PROOFS = makeSymbol( "DO-JOIN-LINK-FIRST-PROOFS" );
    $sym38$DO_JOIN_LINK_SECOND_PROOFS = makeSymbol( "DO-JOIN-LINK-SECOND-PROOFS" );
    $str39$couldn_t_find_the_join_tactic_for = makeString( "couldn't find the join tactic for ~s" );
    $sym40$JOIN_LINK_P = makeSymbol( "JOIN-LINK-P" );
    $sym41$PROOF_P = makeSymbol( "PROOF-P" );
    $str42$_a_was_a_rejected_proof = makeString( "~a was a rejected proof" );
    $sym43$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $sym44$VARIABLE_BINDING_VALUE = makeSymbol( "VARIABLE-BINDING-VALUE" );
    $kw45$SKIP = makeKeyword( "SKIP" );
    $kw46$NEG = makeKeyword( "NEG" );
    $kw47$POS = makeKeyword( "POS" );
    $sym48$SUBCLAUSE_SPEC_P = makeSymbol( "SUBCLAUSE-SPEC-P" );
    $sym49$JOIN_TACTIC_P = makeSymbol( "JOIN-TACTIC-P" );
    $sym50$STRATEGY_P = makeSymbol( "STRATEGY-P" );
    $kw51$TACTICAL = makeKeyword( "TACTICAL" );
    $kw52$DOOMED = makeKeyword( "DOOMED" );
    $sym53$STRATEGIC_CONTEXT_P = makeSymbol( "STRATEGIC-CONTEXT-P" );
    $kw54$DISPREFERRED = makeKeyword( "DISPREFERRED" );
    $str55$TVA_POS = makeString( "TVA-POS" );
    $kw56$GROSSLY_DISPREFERRED = makeKeyword( "GROSSLY-DISPREFERRED" );
    $str57$DOUBLE_TVA_POS = makeString( "DOUBLE TVA-POS" );
    $str58$first_problem__ = makeString( "first problem: " );
    $str59$second_problem__ = makeString( "second problem: " );
    $str60$Join_tactics_like__a_must_only_ap = makeString( "Join tactics like ~a must only apply to singleton problem queries, but ~s was not a singleton" );
    $sym61$PROOF_PROVEN_ = makeSymbol( "PROOF-PROVEN?" );
  }

  public static final class $join_link_data_native
      extends
        SubLStructNative
  {
    public SubLObject $join_vars;
    public SubLObject $first_proof_index;
    public SubLObject $second_proof_index;
    private static final SubLStructDeclNative structDecl;

    public $join_link_data_native()
    {
      this.$join_vars = CommonSymbols.NIL;
      this.$first_proof_index = CommonSymbols.NIL;
      this.$second_proof_index = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $join_link_data_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$join_vars;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$first_proof_index;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$second_proof_index;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$join_vars = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$first_proof_index = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$second_proof_index = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $join_link_data_native.class, $sym0$JOIN_LINK_DATA, $sym1$JOIN_LINK_DATA_P, $list2, $list3, new String[] { "$join_vars", "$first_proof_index", "$second_proof_index"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $join_link_data_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $join_link_data_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "JOIN-LINK-DATA-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return join_link_data_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 246 ms
 * 
 */