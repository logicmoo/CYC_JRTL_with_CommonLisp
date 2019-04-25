package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_join_ordered
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered";
  public static final String myFingerPrint = "51e7490044cced5d8727e480b005acd37a5149dc455fae64272abff6dbf22c26";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLSymbol $dtp_join_ordered_link_data$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18703L)
  public static SubLSymbol $join_ordered_module$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 30475L)
  public static SubLSymbol $max_subclause_spec_cartesian_product_cardinality$;
  private static final SubLSymbol $sym0$JOIN_ORDERED_LINK_DATA;
  private static final SubLSymbol $sym1$JOIN_ORDERED_LINK_DATA_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$JO_LINK_DATA_FOCAL_PROOF_INDEX;
  private static final SubLSymbol $sym10$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX;
  private static final SubLSymbol $sym11$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX;
  private static final SubLSymbol $sym12$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX;
  private static final SubLSymbol $sym13$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX;
  private static final SubLSymbol $sym14$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX;
  private static final SubLSymbol $kw15$FOCAL_PROOF_INDEX;
  private static final SubLSymbol $kw16$NON_FOCAL_PROOF_INDEX;
  private static final SubLSymbol $kw17$RESTRICTED_NON_FOCAL_LINK_INDEX;
  private static final SubLString $str18$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw19$BEGIN;
  private static final SubLSymbol $sym20$MAKE_JOIN_ORDERED_LINK_DATA;
  private static final SubLSymbol $kw21$SLOT;
  private static final SubLSymbol $kw22$END;
  private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD;
  private static final SubLSymbol $kw24$JOIN_ORDERED;
  private static final SubLSymbol $sym25$MAPPED_PROBLEM_P;
  private static final SubLSymbol $kw26$FREE;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$INDEX;
  private static final SubLSymbol $sym29$PROOF_LIST_VAR;
  private static final SubLSymbol $sym30$CLET;
  private static final SubLSymbol $sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX;
  private static final SubLSymbol $sym32$DO_DICTIONARY;
  private static final SubLSymbol $sym33$DO_LIST;
  private static final SubLSymbol $sym34$INDEX;
  private static final SubLSymbol $sym35$PROOF_LIST_VAR;
  private static final SubLSymbol $sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw40$DONE;
  private static final SubLSymbol $sym41$LINK_VAR;
  private static final SubLSymbol $sym42$RESTRICTION_LINK;
  private static final SubLSymbol $sym43$DO_PROBLEM_ARGUMENT_LINKS;
  private static final SubLSymbol $sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM;
  private static final SubLSymbol $kw45$TYPE;
  private static final SubLSymbol $kw46$RESTRICTION;
  private static final SubLSymbol $sym47$PWHEN;
  private static final SubLSymbol $sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_;
  private static final SubLSymbol $sym49$PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$RESTRICTION_LINK;
  private static final SubLSymbol $sym52$NON_FOCAL_PROBLEM;
  private static final SubLSymbol $sym53$DO_PROBLEM_DEPENDENT_LINKS;
  private static final SubLSymbol $sym54$PROBLEM_LINK_SUPPORTED_PROBLEM;
  private static final SubLSymbol $sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_;
  private static final SubLSymbol $sym56$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS;
  private static final SubLSymbol $sym57$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS;
  private static final SubLString $str58$Could_not_find_the_tactic_for__a;
  private static final SubLSymbol $sym59$JOIN_ORDERED_LINK_P;
  private static final SubLSymbol $sym60$PROOF_P;
  private static final SubLSymbol $sym61$RESTRICTION_LINK_P;
  private static final SubLSymbol $kw62$SKIP;
  private static final SubLSymbol $sym63$PROBLEM_P;
  private static final SubLSymbol $kw64$NEG;
  private static final SubLSymbol $kw65$POS;
  private static final SubLSymbol $kw66$ANSWER;
  private static final SubLSymbol $kw67$UNION;
  private static final SubLInteger $int68$21200;
  private static final SubLString $str69$Too_many_possible_matches_to_chec;
  private static final SubLSymbol $sym70$DUPLICATES_;
  private static final SubLSymbol $sym71$HL_VAR_;
  private static final SubLSymbol $kw72$TACTICAL;
  private static final SubLSymbol $kw73$DOOMED;
  private static final SubLSymbol $sym74$STRATEGY_P;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT;
  private static final SubLSymbol $sym77$_EXIT;
  private static final SubLSymbol $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT;
  private static final SubLString $str79$Finding_or_creating_a_restricted_;
  private static final SubLString $str80$Creating_a_restricted_problem_of_;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT;
  private static final SubLSymbol $sym83$VARIABLE_P;
  private static final SubLSymbol $sym84$VARIABLE_BINDING_VARIABLE;
  private static final SubLString $str85$_a_was_a_rejected_proof;
  private static final SubLSymbol $sym86$PROOF_PROVEN_;
  private static final SubLSymbol $kw87$PREFERRED;
  private static final SubLList $list88;
  private static final SubLObject $const89$isa;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject join_ordered_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject join_ordered_link_data_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $join_ordered_link_data_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject jo_link_data_focal_proof_index(final SubLObject v_object)
  {
    assert NIL != join_ordered_link_data_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject jo_link_data_non_focal_proof_index(final SubLObject v_object)
  {
    assert NIL != join_ordered_link_data_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject jo_link_data_restricted_non_focal_link_index(final SubLObject v_object)
  {
    assert NIL != join_ordered_link_data_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject _csetf_jo_link_data_focal_proof_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != join_ordered_link_data_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject _csetf_jo_link_data_non_focal_proof_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != join_ordered_link_data_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject _csetf_jo_link_data_restricted_non_focal_link_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != join_ordered_link_data_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject make_join_ordered_link_data(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $join_ordered_link_data_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$FOCAL_PROOF_INDEX ) )
      {
        _csetf_jo_link_data_focal_proof_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$NON_FOCAL_PROOF_INDEX ) )
      {
        _csetf_jo_link_data_non_focal_proof_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$RESTRICTED_NON_FOCAL_LINK_INDEX ) )
      {
        _csetf_jo_link_data_restricted_non_focal_link_index( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject visit_defstruct_join_ordered_link_data(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym20$MAKE_JOIN_ORDERED_LINK_DATA, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$FOCAL_PROOF_INDEX, jo_link_data_focal_proof_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$NON_FOCAL_PROOF_INDEX, jo_link_data_non_focal_proof_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw17$RESTRICTED_NON_FOCAL_LINK_INDEX, jo_link_data_restricted_non_focal_link_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym20$MAKE_JOIN_ORDERED_LINK_DATA, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1492L)
  public static SubLObject visit_defstruct_object_join_ordered_link_data_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_join_ordered_link_data( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 2234L)
  public static SubLObject valid_join_ordered_link_data_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != join_ordered_link_data_p( v_object ) && NIL != dictionary.dictionary_p( jo_link_data_focal_proof_index( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 2417L)
  public static SubLObject new_join_ordered_link_data()
  {
    final SubLObject data = make_join_ordered_link_data( UNPROVIDED );
    _csetf_jo_link_data_focal_proof_index( data, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_jo_link_data_non_focal_proof_index( data, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_jo_link_data_restricted_non_focal_link_index( data, dictionary_contents.new_dictionary_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) ) );
    return data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3045L)
  public static SubLObject join_ordered_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_problem_link.problem_link_p( v_object ) && $kw24$JOIN_ORDERED == inference_datastructures_problem_link.problem_link_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3260L)
  public static SubLObject maybe_new_join_ordered_link(final SubLObject supported_problem, final SubLObject focal_supporting_mapped_problem, final SubLObject non_focal_supporting_mapped_problem)
  {
    final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( supported_problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject candidate_link;
    SubLObject candidate_mapped_problem;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      candidate_link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, candidate_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( candidate_link, $kw24$JOIN_ORDERED ) )
      {
        candidate_mapped_problem = join_ordered_link_focal_mapped_problem( candidate_link );
        if( NIL != inference_datastructures_problem_link.mapped_problem_equal( focal_supporting_mapped_problem, candidate_mapped_problem ) )
        {
          return subl_promotions.values2( candidate_link, NIL );
        }
      }
    }
    return subl_promotions.values2( new_join_ordered_link( supported_problem, focal_supporting_mapped_problem, non_focal_supporting_mapped_problem ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3970L)
  public static SubLObject new_join_ordered_link(final SubLObject supported_problem, final SubLObject focal_supporting_mapped_problem, final SubLObject non_focal_supporting_mapped_problem)
  {
    assert NIL != inference_datastructures_problem_link.mapped_problem_p( focal_supporting_mapped_problem ) : focal_supporting_mapped_problem;
    if( NIL != non_focal_supporting_mapped_problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.mapped_problem_p( non_focal_supporting_mapped_problem ) )
    {
      throw new AssertionError( non_focal_supporting_mapped_problem );
    }
    final SubLObject link = inference_datastructures_problem_link.new_problem_link( $kw24$JOIN_ORDERED, supported_problem );
    final SubLObject data = new_join_ordered_link_data();
    inference_datastructures_problem_link.set_problem_link_data( link, data );
    inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( focal_supporting_mapped_problem, link );
    if( NIL != non_focal_supporting_mapped_problem )
    {
      inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( non_focal_supporting_mapped_problem, link );
    }
    return link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 4870L)
  public static SubLObject destroy_join_ordered_link(final SubLObject join_ordered_link)
  {
    inference_worker_residual_transformation.destroy_join_ordered_link_wrt_residual_transformation_links( join_ordered_link );
    final SubLObject tactic = join_ordered_link_tactic( join_ordered_link );
    if( NIL != inference_datastructures_tactic.valid_tactic_p( tactic ) )
    {
      inference_datastructures_tactic.destroy_problem_tactic_and_backpointers( tactic );
    }
    final SubLObject data = inference_datastructures_problem_link.problem_link_data( join_ordered_link );
    if( NIL != valid_join_ordered_link_data_p( data ) )
    {
      dictionary.clear_dictionary( jo_link_data_focal_proof_index( data ) );
      _csetf_jo_link_data_focal_proof_index( data, $kw26$FREE );
      dictionary.clear_dictionary( jo_link_data_non_focal_proof_index( data ) );
      _csetf_jo_link_data_non_focal_proof_index( data, $kw26$FREE );
      dictionary_contents.clear_dictionary_contents( jo_link_data_restricted_non_focal_link_index( data ) );
      _csetf_jo_link_data_restricted_non_focal_link_index( data, $kw26$FREE );
    }
    return join_ordered_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 5770L)
  public static SubLObject do_join_ordered_link_focal_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bindings_var = NIL;
    SubLObject proof_var = NIL;
    SubLObject join_ordered_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    bindings_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    join_ordered_link = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject index = $sym28$INDEX;
      final SubLObject proof_list_var = $sym29$PROOF_LIST_VAR;
      return ConsesLow.list( $sym30$CLET, ConsesLow.list( ConsesLow.list( index, ConsesLow.list( $sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, join_ordered_link ) ) ), ConsesLow.list( $sym32$DO_DICTIONARY, ConsesLow.list(
          bindings_var, proof_list_var, index ), ConsesLow.listS( $sym33$DO_LIST, ConsesLow.list( proof_var, proof_list_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 6139L)
  public static SubLObject do_join_ordered_link_non_focal_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bindings_var = NIL;
    SubLObject proof_var = NIL;
    SubLObject join_ordered_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    bindings_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    join_ordered_link = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject index = $sym34$INDEX;
      final SubLObject proof_list_var = $sym35$PROOF_LIST_VAR;
      return ConsesLow.list( $sym30$CLET, ConsesLow.list( ConsesLow.list( index, ConsesLow.list( $sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, join_ordered_link ) ) ), ConsesLow.list( $sym32$DO_DICTIONARY, ConsesLow
          .list( bindings_var, proof_list_var, index ), ConsesLow.listS( $sym33$DO_LIST, ConsesLow.list( proof_var, proof_list_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 6502L)
  public static SubLObject do_join_ordered_link_restricted_non_focal_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject restricted_non_focal_problem_var = NIL;
    SubLObject join_ordered_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    restricted_non_focal_problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    join_ordered_link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list37 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list37 );
      if( NIL == conses_high.member( current_$1, $list38, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw39$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw40$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject link_var = $sym41$LINK_VAR;
    final SubLObject restriction_link = $sym42$RESTRICTION_LINK;
    return ConsesLow.list( $sym30$CLET, ConsesLow.list( ConsesLow.list( link_var, join_ordered_link ) ), ConsesLow.list( $sym43$DO_PROBLEM_ARGUMENT_LINKS, ConsesLow.list( restriction_link, ConsesLow.list(
        $sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, link_var ), $kw45$TYPE, $kw46$RESTRICTION, $kw40$DONE, done ), ConsesLow.list( $sym47$PWHEN, ConsesLow.list(
            $sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, restriction_link, link_var ), ConsesLow.listS( $sym30$CLET, ConsesLow.list( ConsesLow.list( restricted_non_focal_problem_var, ConsesLow.list(
                $sym49$PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM, restriction_link ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 7190L)
  public static SubLObject do_virtual_dependent_join_ordered_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject join_ordered_link_var = NIL;
    SubLObject restricted_non_focal_problem = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    join_ordered_link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    restricted_non_focal_problem = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list50 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list50 );
      if( NIL == conses_high.member( current_$2, $list38, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw39$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw40$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject restriction_link = $sym51$RESTRICTION_LINK;
    final SubLObject non_focal_problem = $sym52$NON_FOCAL_PROBLEM;
    return ConsesLow.list( $sym53$DO_PROBLEM_DEPENDENT_LINKS, ConsesLow.list( restriction_link, restricted_non_focal_problem, $kw45$TYPE, $kw46$RESTRICTION, $kw40$DONE, done ), ConsesLow.list( $sym30$CLET, ConsesLow
        .list( ConsesLow.list( non_focal_problem, ConsesLow.list( $sym54$PROBLEM_LINK_SUPPORTED_PROBLEM, restriction_link ) ) ), ConsesLow.list( $sym53$DO_PROBLEM_DEPENDENT_LINKS, ConsesLow.list( join_ordered_link_var,
            non_focal_problem, $kw45$TYPE, $kw24$JOIN_ORDERED, $kw40$DONE, done ), ConsesLow.list( $sym47$PWHEN, ConsesLow.list( $sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_, join_ordered_link_var,
                restriction_link ), ConsesLow.listS( $sym47$PWHEN, ConsesLow.list( EQ, non_focal_problem, ConsesLow.list( $sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, join_ordered_link_var ) ), ConsesLow.append( body,
                    NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8054L)
  public static SubLObject join_ordered_link_focal_proof_index(final SubLObject join_ordered_link)
  {
    return jo_link_data_focal_proof_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8269L)
  public static SubLObject join_ordered_link_non_focal_proof_index(final SubLObject join_ordered_link)
  {
    return jo_link_data_non_focal_proof_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8484L)
  public static SubLObject join_ordered_link_restricted_non_focal_link_index(final SubLObject join_ordered_link)
  {
    return jo_link_data_restricted_non_focal_link_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8665L)
  public static SubLObject join_ordered_link_triggered_restriction_link(final SubLObject join_ordered_link, final SubLObject proof)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( join_ordered_link_restricted_non_focal_link_index( join_ordered_link ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject restriction_link = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject candidate_proof = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( proof.eql( candidate_proof ) )
      {
        return restriction_link;
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9141L)
  public static SubLObject join_ordered_link_triggered_restricted_non_focal(final SubLObject join_ordered_link, final SubLObject proof)
  {
    final SubLObject triggered_restriction_link = join_ordered_link_triggered_restriction_link( join_ordered_link, proof );
    return ( NIL != triggered_restriction_link ) ? inference_datastructures_problem_link.problem_link_sole_supporting_problem( triggered_restriction_link ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9575L)
  public static SubLObject join_ordered_link_restricted_non_focal_links(final SubLObject join_ordered_link)
  {
    return dictionary_contents.dictionary_contents_keys( join_ordered_link_restricted_non_focal_link_index( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9789L)
  public static SubLObject join_ordered_link_restricted_non_focal_triggering_proof(final SubLObject join_ordered_link, final SubLObject restriction_link)
  {
    final SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index( join_ordered_link );
    final SubLObject proof = dictionary_contents.dictionary_contents_lookup_without_values( dict_contents, restriction_link, Symbols.symbol_function( EQ ), UNPROVIDED );
    if( NIL != inference_datastructures_proof.valid_proof_p( proof ) )
    {
      return proof;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10241L)
  public static SubLObject join_ordered_link_focal_mapped_problem(final SubLObject join_ordered_link)
  {
    return conses_high.last( inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10403L)
  public static SubLObject join_ordered_link_has_non_focal_mapped_problemP(final SubLObject join_ordered_link)
  {
    return list_utilities.doubletonP( inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10572L)
  public static SubLObject join_ordered_link_non_focal_mapped_problem(final SubLObject join_ordered_link)
  {
    if( NIL != join_ordered_link_non_focal_manifestedP( join_ordered_link ) )
    {
      return inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ).first();
    }
    return lazily_create_join_ordered_link_non_focal_mapped_problem( join_ordered_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10894L)
  public static SubLObject join_ordered_link_non_focal_manifestedP(final SubLObject join_ordered_link)
  {
    return list_utilities.doubletonP( inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11055L)
  public static SubLObject join_ordered_link_focal_problem(final SubLObject join_ordered_link)
  {
    return inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_focal_mapped_problem( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11219L)
  public static SubLObject join_ordered_link_non_focal_problem(final SubLObject join_ordered_link)
  {
    return inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_non_focal_mapped_problem( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11391L)
  public static SubLObject join_ordered_link_other_mapped_problem(final SubLObject join_ordered_link, final SubLObject wrong_mapped_problem)
  {
    final SubLObject other_mapped_problem = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_that_isnt( join_ordered_link, wrong_mapped_problem );
    return ( NIL != other_mapped_problem ) ? other_mapped_problem : lazily_create_join_ordered_link_non_focal_mapped_problem( join_ordered_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11882L)
  public static SubLObject join_ordered_link_focal_proofs_lookup(final SubLObject join_ordered_link, final SubLObject proof_bindings)
  {
    final SubLObject index = join_ordered_link_focal_proof_index( join_ordered_link );
    final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings( proof_bindings );
    final SubLObject focal_proofs = dictionary.dictionary_lookup_without_values( index, canonical_proof_bindings, UNPROVIDED );
    return focal_proofs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 12230L)
  public static SubLObject join_ordered_link_non_focal_proofs_lookup(final SubLObject join_ordered_link, final SubLObject proof_bindings)
  {
    final SubLObject index = join_ordered_link_non_focal_proof_index( join_ordered_link );
    final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings( proof_bindings );
    final SubLObject non_focal_proofs = dictionary.dictionary_lookup_without_values( index, canonical_proof_bindings, UNPROVIDED );
    return non_focal_proofs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 12594L)
  public static SubLObject join_ordered_link_tactic(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( supported_problem );
    SubLObject join_ordered_tactic = NIL;
    join_ordered_tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( join_ordered_tactic, $join_ordered_module$.getDynamicValue( thread ) ) && join_ordered_link.eql( join_ordered_tactic_link(
          join_ordered_tactic ) ) )
      {
        return join_ordered_tactic;
      }
      cdolist_list_var = cdolist_list_var.rest();
      join_ordered_tactic = cdolist_list_var.first();
    }
    if( NIL == inference_datastructures_problem.tactically_unexamined_problem_p( supported_problem ) )
    {
      return Errors.error( $str58$Could_not_find_the_tactic_for__a, join_ordered_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 13151L)
  public static SubLObject join_ordered_link_restricted_non_focal_linkP(final SubLObject join_ordered_link, final SubLObject restriction_link)
  {
    return list_utilities.sublisp_boolean( dictionary_contents.dictionary_contents_lookup_without_values( join_ordered_link_restricted_non_focal_link_index( join_ordered_link ), restriction_link, Symbols.symbol_function(
        EQ ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 13650L)
  public static SubLObject join_ordered_link_restricted_non_focal_count(final SubLObject join_ordered_link)
  {
    return dictionary_contents.dictionary_contents_size( join_ordered_link_restricted_non_focal_link_index( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 14038L)
  public static SubLObject add_join_ordered_link_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_ordered_link_p( join_ordered_link ) : join_ordered_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_ordered_link_focal_proof_index( join_ordered_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_pushnew( index, canonical_bindings, proof, Symbols.symbol_function( EQ ), UNPROVIDED );
    return join_ordered_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 14669L)
  public static SubLObject remove_join_ordered_link_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_ordered_link_p( join_ordered_link ) : join_ordered_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_ordered_link_focal_proof_index( join_ordered_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_delete_from_value( index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED );
    return join_ordered_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 15142L)
  public static SubLObject add_join_ordered_link_non_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_ordered_link_p( join_ordered_link ) : join_ordered_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_ordered_link_non_focal_proof_index( join_ordered_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_pushnew( index, canonical_bindings, proof, Symbols.symbol_function( EQ ), UNPROVIDED );
    return join_ordered_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 15761L)
  public static SubLObject remove_join_ordered_link_non_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof)
  {
    assert NIL != join_ordered_link_p( join_ordered_link ) : join_ordered_link;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject index = join_ordered_link_non_focal_proof_index( join_ordered_link );
    final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
    dictionary_utilities.dictionary_delete_from_value( index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED );
    return join_ordered_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 16246L)
  public static SubLObject add_join_ordered_link_restricted_non_focal_link(final SubLObject join_ordered_link, final SubLObject restriction_link, final SubLObject trigger_proof)
  {
    assert NIL != join_ordered_link_p( join_ordered_link ) : join_ordered_link;
    assert NIL != inference_worker_restriction.restriction_link_p( restriction_link ) : restriction_link;
    assert NIL != inference_datastructures_proof.proof_p( trigger_proof ) : trigger_proof;
    SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index( join_ordered_link );
    dict_contents = dictionary_contents.dictionary_contents_enter( dict_contents, restriction_link, trigger_proof, Symbols.symbol_function( EQ ) );
    _csetf_jo_link_data_restricted_non_focal_link_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ), dict_contents );
    return join_ordered_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 16844L)
  public static SubLObject remove_join_ordered_link_restricted_non_focal_link(final SubLObject join_ordered_link, final SubLObject restriction_link)
  {
    assert NIL != join_ordered_link_p( join_ordered_link ) : join_ordered_link;
    SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index( join_ordered_link );
    dict_contents = dictionary_contents.dictionary_contents_delete( dict_contents, restriction_link, Symbols.symbol_function( EQ ) );
    _csetf_jo_link_data_restricted_non_focal_link_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ), dict_contents );
    return join_ordered_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 17472L)
  public static SubLObject join_ordered_link_focal_supporting_problem_spec(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( supported_problem );
    SubLObject join_ordered_tactic = NIL;
    join_ordered_tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( join_ordered_tactic, $join_ordered_module$.getDynamicValue( thread ) ) && join_ordered_link.eql( join_ordered_tactic_link(
          join_ordered_tactic ) ) )
      {
        return join_ordered_tactic_focal_supporting_problem_spec( join_ordered_tactic );
      }
      cdolist_list_var = cdolist_list_var.rest();
      join_ordered_tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18147L)
  public static SubLObject join_ordered_link_non_focal_supporting_problem_spec(final SubLObject join_ordered_link)
  {
    final SubLObject focal_spec = join_ordered_link_focal_supporting_problem_spec( join_ordered_link );
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
    final SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause( supported_problem );
    final SubLObject non_focal_spec = clause_utilities.new_complement_subclause_spec( focal_spec, supported_clause );
    return non_focal_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18865L)
  public static SubLObject join_ordered_tactic_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != inference_datastructures_tactic.tactic_p( v_object ) && $join_ordered_module$.getDynamicValue( thread ).eql( inference_datastructures_tactic.tactic_hl_module( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19019L)
  public static SubLObject single_focal_literal_join_ordered_tactic_p(final SubLObject join_ordered_tactic)
  {
    return makeBoolean( NIL != join_ordered_tactic_p( join_ordered_tactic ) && NIL != clause_utilities.single_literal_subclause_specP( join_ordered_tactic_focal_supporting_problem_spec( join_ordered_tactic ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19278L)
  public static SubLObject new_join_ordered_tactic(final SubLObject jo_link, final SubLObject focal_supporting_problem_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != join_ordered_link_p( jo_link ) : jo_link;
    final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem( jo_link );
    final SubLObject data = ConsesLow.list( jo_link, focal_supporting_problem_spec );
    final SubLObject tactic = inference_datastructures_tactic.new_tactic( problem, $join_ordered_module$.getDynamicValue( thread ), data );
    final SubLObject prob = problem;
    final SubLObject store = inference_datastructures_problem.problem_store( prob );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw62$SKIP ) )
    {
      final SubLObject idx_$3 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw62$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
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
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw62$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw62$SKIP;
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
      final SubLObject idx_$4 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$4 );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19970L)
  public static SubLObject join_ordered_tactic_link(final SubLObject join_ordered_tactic)
  {
    return inference_datastructures_tactic.tactic_data( join_ordered_tactic ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20233L)
  public static SubLObject join_ordered_tactic_focal_supporting_problem_spec(final SubLObject join_ordered_tactic)
  {
    return conses_high.second( inference_datastructures_tactic.tactic_data( join_ordered_tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20376L)
  public static SubLObject join_ordered_tactic_subsumesP(final SubLObject subsuming_tactic, final SubLObject subsumed_tactic)
  {
    return makeBoolean( subsuming_tactic.eql( subsumed_tactic ) || ( inference_datastructures_tactic.tactic_problem( subsuming_tactic ).eql( inference_datastructures_tactic.tactic_problem( subsumed_tactic ) )
        && NIL != clause_utilities.subclause_spec_subsumesP( join_ordered_tactic_focal_supporting_problem_spec( subsuming_tactic ), join_ordered_tactic_focal_supporting_problem_spec( subsumed_tactic ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20996L)
  public static SubLObject find_or_create_join_ordered_tactic_focal_mapped_problem(final SubLObject tactic)
  {
    final SubLObject jo_link = join_ordered_tactic_link( tactic );
    if( NIL != jo_link )
    {
      return join_ordered_link_focal_mapped_problem( jo_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 21276L)
  public static SubLObject find_or_create_join_ordered_tactic_non_focal_mapped_problem(final SubLObject tactic)
  {
    final SubLObject jo_link = join_ordered_tactic_link( tactic );
    if( NIL != jo_link )
    {
      return join_ordered_link_non_focal_mapped_problem( jo_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 21568L)
  public static SubLObject join_ordered_tactic_focal_problem(final SubLObject join_ordered_tactic)
  {
    final SubLObject link = join_ordered_tactic_link( join_ordered_tactic );
    final SubLObject problem = ( NIL != link ) ? join_ordered_link_focal_problem( link ) : NIL;
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 21820L)
  public static SubLObject determine_new_join_ordered_tactics(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    determine_new_single_literal_join_ordered_tactics( supported_problem, dnf_clause );
    SubLObject multi_literal_subclause_specs = NIL;
    SubLObject cdolist_list_var = motivated_followup_multi_literal_subclause_specs_case_1( supported_problem, dnf_clause );
    SubLObject subclause_spec = NIL;
    subclause_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = subclause_spec;
      if( NIL == conses_high.member( item_var, multi_literal_subclause_specs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        multi_literal_subclause_specs = ConsesLow.cons( item_var, multi_literal_subclause_specs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subclause_spec = cdolist_list_var.first();
    }
    cdolist_list_var = motivated_followup_multi_literal_subclause_specs_case_2( supported_problem, dnf_clause );
    subclause_spec = NIL;
    subclause_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = subclause_spec;
      if( NIL == conses_high.member( item_var, multi_literal_subclause_specs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        multi_literal_subclause_specs = ConsesLow.cons( item_var, multi_literal_subclause_specs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subclause_spec = cdolist_list_var.first();
    }
    if( NIL == problem_has_a_candidate_early_removal_tacticP( supported_problem ) )
    {
      cdolist_list_var = inference_worker_removal.motivated_multi_literal_subclause_specs( dnf_clause );
      subclause_spec = NIL;
      subclause_spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = subclause_spec;
        if( NIL == conses_high.member( item_var, multi_literal_subclause_specs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          multi_literal_subclause_specs = ConsesLow.cons( item_var, multi_literal_subclause_specs );
        }
        cdolist_list_var = cdolist_list_var.rest();
        subclause_spec = cdolist_list_var.first();
      }
    }
    cdolist_list_var = Sequences.nreverse( multi_literal_subclause_specs );
    subclause_spec = NIL;
    subclause_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      determine_new_join_ordered_tactic( supported_problem, subclause_spec, dnf_clause );
      cdolist_list_var = cdolist_list_var.rest();
      subclause_spec = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 23132L)
  public static SubLObject problem_has_a_candidate_early_removal_tacticP(final SubLObject problem)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( tactic, $kw24$JOIN_ORDERED ) && NIL != inference_tactician.candidate_early_removal_tacticP( tactic ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 23411L)
  public static SubLObject determine_new_single_literal_join_ordered_tactics(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    final SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP( dnf_clause );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.neg_lits( dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sense = $kw64$NEG;
      if( NIL == some_backchain_requiredP || NIL != inference_trampolines.inference_backchain_required_contextualized_asentP( contextualized_asent ) || NIL != potentially_simplifying_asentP(
          inference_datastructures_problem_query.contextualized_asent_asent( contextualized_asent ) ) )
      {
        determine_new_single_literal_join_ordered_tactic( supported_problem, dnf_clause, sense, index );
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
      final SubLObject sense = $kw65$POS;
      if( NIL == some_backchain_requiredP || NIL != inference_trampolines.inference_backchain_required_contextualized_asentP( contextualized_asent ) || NIL != potentially_simplifying_asentP(
          inference_datastructures_problem_query.contextualized_asent_asent( contextualized_asent ) ) )
      {
        determine_new_single_literal_join_ordered_tactic( supported_problem, dnf_clause, sense, index );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 24211L)
  public static SubLObject potentially_simplifying_asentP(final SubLObject asent)
  {
    return el_utilities.potentially_solvable_evaluate_asentP( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 24653L)
  public static SubLObject determine_new_single_literal_join_ordered_tactic(final SubLObject supported_problem, final SubLObject dnf_clause, final SubLObject sense, final SubLObject index)
  {
    final SubLObject focal_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec( sense, index );
    return determine_new_join_ordered_tactic( supported_problem, focal_supporting_problem_spec, dnf_clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 24959L)
  public static SubLObject motivated_followup_multi_literal_subclause_specs_case_1(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    SubLObject subclause_specs = NIL;
    if( NIL != problem_store_followup_query_problem_p( supported_problem ) )
    {
      final SubLObject store = inference_datastructures_problem.problem_store( supported_problem );
      final SubLObject set_var = inference_datastructures_problem_store.problem_store_historical_root_problems( store );
      final SubLObject set_contents_var = set.do_set_internal( set_var );
      SubLObject basis_object;
      SubLObject state;
      SubLObject other_root_problem;
      SubLObject other_dnf_clause;
      SubLObject cdolist_list_var;
      SubLObject subclause_spec;
      SubLObject subclause;
      SubLObject item_var;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        other_root_problem = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, other_root_problem ) && !other_root_problem.eql( supported_problem ) && NIL != inference_datastructures_problem.multi_literal_problem_p(
            other_root_problem ) )
        {
          other_dnf_clause = inference_datastructures_problem.problem_sole_clause( other_root_problem );
          cdolist_list_var = matching_subclause_specs( dnf_clause, other_dnf_clause );
          subclause_spec = NIL;
          subclause_spec = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            subclause = clause_utilities.subclause_specified_by_spec( dnf_clause, subclause_spec );
            if( NIL != inference_worker_split.all_literals_connected_by_shared_varsP( subclause ) )
            {
              item_var = subclause_spec;
              if( NIL == conses_high.member( item_var, subclause_specs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                subclause_specs = ConsesLow.cons( item_var, subclause_specs );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
          }
        }
      }
    }
    return subclause_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 26152L)
  public static SubLObject problem_store_followup_query_problem_p(final SubLObject supported_problem)
  {
    return makeBoolean( NIL != inference_datastructures_problem.problem_p( supported_problem ) && inference_datastructures_problem_store.problem_store_historical_root_problem_count( inference_datastructures_problem
        .problem_store( supported_problem ) ).numGE( TWO_INTEGER ) && NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP( supported_problem, $kw66$ANSWER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 26665L)
  public static SubLObject motivated_followup_multi_literal_subclause_specs_case_2(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    SubLObject subclause_specs = NIL;
    if( NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP( dnf_clause ) && NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP( supported_problem, $kw67$UNION ) )
    {
      final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( supported_problem );
      SubLObject basis_object;
      SubLObject state;
      SubLObject union_link;
      SubLObject disjunction_problem;
      SubLObject set_contents_var_$5;
      SubLObject basis_object_$6;
      SubLObject state_$7;
      SubLObject sibling_union_link;
      SubLObject sibling_problem;
      SubLObject other_dnf_clause;
      SubLObject cdolist_list_var;
      SubLObject subclause_spec;
      SubLObject subclause;
      SubLObject item_var;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        union_link = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, union_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( union_link, $kw67$UNION ) )
        {
          disjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem( union_link );
          set_contents_var_$5 = inference_datastructures_problem.problem_argument_links( disjunction_problem );
          for( basis_object_$6 = set_contents.do_set_contents_basis_object( set_contents_var_$5 ), state_$7 = NIL, state_$7 = set_contents.do_set_contents_initial_state( basis_object_$6,
              set_contents_var_$5 ); NIL == set_contents.do_set_contents_doneP( basis_object_$6, state_$7 ); state_$7 = set_contents.do_set_contents_update_state( state_$7 ) )
          {
            sibling_union_link = set_contents.do_set_contents_next( basis_object_$6, state_$7 );
            if( NIL != set_contents.do_set_contents_element_validP( state_$7, sibling_union_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( sibling_union_link, $kw67$UNION )
                && !sibling_union_link.eql( union_link ) )
            {
              sibling_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem( sibling_union_link );
              if( !sibling_problem.eql( supported_problem ) && NIL != inference_datastructures_problem.multi_literal_problem_p( sibling_problem ) )
              {
                other_dnf_clause = inference_datastructures_problem.problem_sole_clause( sibling_problem );
                cdolist_list_var = sub_matching_subclause_specs( dnf_clause, other_dnf_clause );
                subclause_spec = NIL;
                subclause_spec = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  subclause = clause_utilities.subclause_specified_by_spec( dnf_clause, subclause_spec );
                  if( NIL != inference_worker_split.all_literals_connected_by_shared_varsP( subclause ) )
                  {
                    item_var = subclause_spec;
                    if( NIL == conses_high.member( item_var, subclause_specs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      subclause_specs = ConsesLow.cons( item_var, subclause_specs );
                    }
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  subclause_spec = cdolist_list_var.first();
                }
              }
            }
          }
        }
      }
    }
    return subclause_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 28264L)
  public static SubLObject matching_subclause_specs(final SubLObject dnf_clause, final SubLObject other_dnf_clause)
  {
    SubLObject subclause_specs = NIL;
    final SubLObject pos_lits = clauses.pos_lits( dnf_clause );
    final SubLObject neg_lits = clauses.neg_lits( dnf_clause );
    final SubLObject other_pos_lits = clauses.pos_lits( other_dnf_clause );
    final SubLObject other_neg_lits = clauses.neg_lits( other_dnf_clause );
    if( NIL != list_utilities.greater_or_same_length_p( pos_lits, other_pos_lits ) && NIL != list_utilities.greater_or_same_length_p( neg_lits, other_neg_lits ) && ( NIL != list_utilities.greater_length_p( pos_lits,
        other_pos_lits ) || NIL != list_utilities.greater_length_p( neg_lits, other_neg_lits ) ) )
    {
      final SubLObject pos_dict = matching_subclause_index_dictionary( pos_lits, other_pos_lits );
      if( NIL != pos_dict )
      {
        final SubLObject neg_dict = matching_subclause_index_dictionary( neg_lits, other_neg_lits );
        if( NIL != neg_dict )
        {
          final SubLObject positive_indices_list = matching_subclause_index_dictionary_to_indices_list( pos_dict );
          final SubLObject negative_indices_list = matching_subclause_index_dictionary_to_indices_list( neg_dict );
          SubLObject cdolist_list_var = positive_indices_list;
          SubLObject positive_indices = NIL;
          positive_indices = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$8 = negative_indices_list;
            SubLObject negative_indices = NIL;
            negative_indices = cdolist_list_var_$8.first();
            while ( NIL != cdolist_list_var_$8)
            {
              final SubLObject candidate_subclause_spec = clause_utilities.new_subclause_spec( negative_indices, positive_indices );
              final SubLObject candidate_subclause = clause_utilities.subclause_specified_by_spec( dnf_clause, candidate_subclause_spec );
              if( NIL != unification.unify( candidate_subclause, other_dnf_clause, UNPROVIDED, UNPROVIDED ) )
              {
                subclause_specs = ConsesLow.cons( candidate_subclause_spec, subclause_specs );
              }
              cdolist_list_var_$8 = cdolist_list_var_$8.rest();
              negative_indices = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            positive_indices = cdolist_list_var.first();
          }
        }
      }
    }
    return subclause_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 29741L)
  public static SubLObject matching_subclause_index_dictionary(final SubLObject lits, final SubLObject other_lits)
  {
    final SubLObject dict = dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject impossibleP = NIL;
    SubLObject list_var = NIL;
    SubLObject other_lit = NIL;
    SubLObject i = NIL;
    list_var = other_lits;
    other_lit = list_var.first();
    for( i = ZERO_INTEGER; NIL == impossibleP && NIL != list_var; list_var = list_var.rest(), other_lit = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      SubLObject list_var_$9 = NIL;
      SubLObject lit = NIL;
      SubLObject j = NIL;
      list_var_$9 = lits;
      lit = list_var_$9.first();
      for( j = ZERO_INTEGER; NIL != list_var_$9; list_var_$9 = list_var_$9.rest(), lit = list_var_$9.first(), j = Numbers.add( ONE_INTEGER, j ) )
      {
        if( NIL != unification.unify_possible( other_lit, lit ) )
        {
          dictionary_utilities.dictionary_push( dict, i, j );
        }
      }
      if( NIL == dictionary.dictionary_lookup( dict, i, UNPROVIDED ) )
      {
        impossibleP = T;
      }
    }
    if( NIL != impossibleP )
    {
      return NIL;
    }
    return dict;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 30673L)
  public static SubLObject matching_subclause_index_dictionary_to_indices_list(final SubLObject dict)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject indices_accum = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject indices = thread.secondMultipleValue();
      thread.resetMultipleValues();
      indices_accum = ConsesLow.cons( indices, indices_accum );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    if( NIL != subl_promotions.positive_integer_p( $max_subclause_spec_cartesian_product_cardinality$.getDynamicValue( thread ) ) )
    {
      final SubLObject cartesian_product_cardinality = list_utilities.cartesian_product_cardinality( indices_accum );
      if( $max_subclause_spec_cartesian_product_cardinality$.getDynamicValue( thread ).numL( list_utilities.cartesian_product_cardinality( indices_accum ) ) )
      {
        Errors.warn( $str69$Too_many_possible_matches_to_chec, cartesian_product_cardinality, inference_worker.currently_active_problem() );
        return NIL;
      }
    }
    return Sequences.delete_if( $sym70$DUPLICATES_, list_utilities.cartesian_product( indices_accum, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 31412L)
  public static SubLObject sub_matching_subclause_specs(final SubLObject dnf_clause, final SubLObject other_dnf_clause)
  {
    SubLObject pos_lit_spec = NIL;
    SubLObject neg_lit_spec = NIL;
    SubLObject subclause_specs = NIL;
    final SubLObject pos_lits = clauses.pos_lits( dnf_clause );
    final SubLObject other_pos_lits = clauses.pos_lits( other_dnf_clause );
    SubLObject list_var = NIL;
    SubLObject pos_lit = NIL;
    SubLObject index = NIL;
    list_var = pos_lits;
    pos_lit = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), pos_lit = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      SubLObject unifiesP = NIL;
      if( NIL == unifiesP )
      {
        SubLObject csome_list_var = other_pos_lits;
        SubLObject other_pos_lit = NIL;
        other_pos_lit = csome_list_var.first();
        while ( NIL == unifiesP && NIL != csome_list_var)
        {
          if( NIL != unification.unify( pos_lit, other_pos_lit, UNPROVIDED, UNPROVIDED ) )
          {
            pos_lit_spec = ConsesLow.cons( index, pos_lit_spec );
            unifiesP = T;
          }
          csome_list_var = csome_list_var.rest();
          other_pos_lit = csome_list_var.first();
        }
      }
    }
    final SubLObject neg_lits = clauses.neg_lits( dnf_clause );
    final SubLObject other_neg_lits = clauses.neg_lits( other_dnf_clause );
    list_var = NIL;
    SubLObject neg_lit = NIL;
    index = NIL;
    list_var = neg_lits;
    neg_lit = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), neg_lit = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      SubLObject unifiesP = NIL;
      if( NIL == unifiesP )
      {
        SubLObject csome_list_var = other_neg_lits;
        SubLObject other_neg_lit = NIL;
        other_neg_lit = csome_list_var.first();
        while ( NIL == unifiesP && NIL != csome_list_var)
        {
          if( NIL != unification.unify( neg_lit, other_neg_lit, UNPROVIDED, UNPROVIDED ) )
          {
            neg_lit_spec = ConsesLow.cons( index, neg_lit_spec );
            unifiesP = T;
          }
          csome_list_var = csome_list_var.rest();
          other_neg_lit = csome_list_var.first();
        }
      }
    }
    if( Numbers.add( Sequences.length( pos_lit_spec ), Sequences.length( neg_lit_spec ) ).numG( ONE_INTEGER ) )
    {
      final SubLObject subclause_spec = clause_utilities.new_subclause_spec( neg_lit_spec, pos_lit_spec );
      if( NIL == clause_utilities.total_subclause_specP( subclause_spec, dnf_clause ) )
      {
        subclause_specs = ConsesLow.cons( subclause_spec, subclause_specs );
      }
    }
    return subclause_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 32785L)
  public static SubLObject determine_new_join_ordered_tactic(final SubLObject supported_problem, final SubLObject focal_supporting_problem_spec, final SubLObject dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject store = inference_datastructures_problem.problem_store( supported_problem );
    final SubLObject focal_free_hl_vars = compute_join_ordered_problem_subclause_free_vars( supported_problem, focal_supporting_problem_spec, dnf_clause, T );
    final SubLObject focal_mapped_problem = find_or_create_join_ordered_focal_mapped_problem( store, dnf_clause, focal_supporting_problem_spec, focal_free_hl_vars );
    final SubLObject non_focal_mapped_problem = NIL;
    thread.resetMultipleValues();
    final SubLObject jo_link = maybe_new_join_ordered_link( supported_problem, focal_mapped_problem, non_focal_mapped_problem );
    final SubLObject jo_link_newP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    new_join_ordered_tactic( jo_link, focal_supporting_problem_spec );
    if( NIL != jo_link_newP )
    {
      inference_worker.propagate_problem_link( jo_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 33630L)
  public static SubLObject find_or_create_join_ordered_focal_mapped_problem(final SubLObject store, final SubLObject dnf_clause, final SubLObject focal_supporting_problem_spec, final SubLObject free_hl_vars)
  {
    return inference_worker.find_or_create_problem_from_subclause_spec( store, dnf_clause, focal_supporting_problem_spec, free_hl_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 33872L)
  public static SubLObject find_or_create_join_ordered_non_focal_mapped_problem(final SubLObject store, final SubLObject dnf_clause, final SubLObject focal_supporting_problem_spec, final SubLObject free_hl_vars)
  {
    return inference_worker.find_or_create_problem_without_subclause_spec( store, dnf_clause, focal_supporting_problem_spec, free_hl_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 34121L)
  public static SubLObject lazily_create_join_ordered_link_non_focal_mapped_problem(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == inference_datastructures_problem_store.$problem_store_modification_permittedP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    final SubLObject focal_openP = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP( join_ordered_link );
    final SubLObject store = inference_datastructures_problem_link.problem_link_store( join_ordered_link );
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
    final SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause( supported_problem );
    final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
    final SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause( focal_problem );
    final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
    final SubLObject focal_clause_wrt_supported = bindings.apply_bindings( focal_variable_map, focal_clause );
    final SubLObject focal_supporting_problem_spec = clause_utilities.subclause_spec_from_clauses( supported_clause, focal_clause_wrt_supported );
    final SubLObject non_focal_free_hl_vars = compute_join_ordered_problem_subclause_free_vars( supported_problem, focal_supporting_problem_spec, supported_clause, NIL );
    final SubLObject non_focal_supporting_mapped_problem = find_or_create_join_ordered_non_focal_mapped_problem( store, supported_clause, focal_supporting_problem_spec, non_focal_free_hl_vars );
    inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( non_focal_supporting_mapped_problem, join_ordered_link );
    if( NIL != focal_openP )
    {
      inference_datastructures_problem_link.problem_link_close_all( join_ordered_link );
      inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem( join_ordered_link, focal_mapped_problem );
    }
    inference_worker.propagate_problem_link( join_ordered_link );
    return non_focal_supporting_mapped_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 36308L)
  public static SubLObject compute_join_ordered_problem_subclause_free_vars(final SubLObject supported_problem, final SubLObject focal_supporting_problem_spec, final SubLObject dnf_clause, final SubLObject focalP)
  {
    final SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars( supported_problem );
    final SubLObject focal_subclause = clause_utilities.subclause_specified_by_spec( dnf_clause, focal_supporting_problem_spec );
    final SubLObject non_focal_subclause = clause_utilities.complement_of_subclause_specified_by_spec( dnf_clause, focal_supporting_problem_spec );
    final SubLObject focal_vars = cycl_utilities.expression_gather( focal_subclause, $sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject non_focal_vars = cycl_utilities.expression_gather( non_focal_subclause, $sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return variables.sort_hl_variable_list_memoized( conses_high.intersection( ( NIL != focalP ) ? focal_vars : non_focal_vars, conses_high.union( supported_problem_free_hl_vars, conses_high.intersection( focal_vars,
        non_focal_vars, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 37064L)
  public static SubLObject compute_strategic_properties_of_join_ordered_tactic(final SubLObject tactic, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = inference_worker.$currently_considered_tactic$.currentBinding( thread );
    try
    {
      inference_worker.$currently_considered_tactic$.bind( tactic, thread );
      final SubLObject jo_link = join_ordered_tactic_link( tactic );
      if( NIL == preference_modules.preference_level_p( inference_datastructures_tactic.tactic_preference_level( tactic ) ) )
      {
        thread.resetMultipleValues();
        final SubLObject join_ordered_preference_level = compute_join_ordered_tactic_preference_level( jo_link, $kw72$TACTICAL );
        final SubLObject preference_level_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_tactic.set_tactic_preference_level( tactic, join_ordered_preference_level, preference_level_justification );
        if( $kw73$DOOMED == join_ordered_preference_level )
        {
          inference_worker.note_tactic_doomed( tactic, $kw72$TACTICAL );
        }
      }
      thread.resetMultipleValues();
      final SubLObject preference_level = compute_join_ordered_tactic_preference_level( jo_link, strategy );
      final SubLObject justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      inference_datastructures_strategy.set_tactic_strategic_preference_level( tactic, strategy, preference_level, justification );
      if( $kw73$DOOMED == preference_level )
      {
        inference_worker.note_tactic_doomed( tactic, strategy );
      }
      final SubLObject productivity = compute_join_ordered_tactic_productivity( jo_link, strategy );
      inference_datastructures_strategy.set_tactic_strategic_productivity( tactic, strategy, productivity );
    }
    finally
    {
      inference_worker.$currently_considered_tactic$.rebind( _prev_bind_0, thread );
    }
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 38212L)
  public static SubLObject compute_join_ordered_tactic_productivity(final SubLObject jo_link, final SubLObject strategy)
  {
    assert NIL != join_ordered_link_p( jo_link ) : jo_link;
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    return inference_lookahead_productivity.memoized_problem_max_removal_productivity( join_ordered_link_focal_problem( jo_link ), strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 38571L)
  public static SubLObject compute_join_ordered_tactic_preference_level(final SubLObject jo_link, final SubLObject strategic_context)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject focal_problem = join_ordered_link_focal_problem( jo_link );
    final SubLObject shared_variables = focal_vars_shared_by_non_focal( jo_link );
    thread.resetMultipleValues();
    final SubLObject join_ordered_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level( focal_problem, strategic_context, shared_variables );
    final SubLObject preference_level_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return subl_promotions.values2( join_ordered_preference_level, preference_level_justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 39233L)
  public static SubLObject execute_join_ordered_tactic(final SubLObject tactic)
  {
    final SubLObject focal_mapped_problem = find_or_create_join_ordered_tactic_focal_mapped_problem( tactic );
    final SubLObject join_ordered_link = join_ordered_tactic_link( tactic );
    inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem( join_ordered_link, focal_mapped_problem );
    inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_join_ordered_link( join_ordered_link );
    if( NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP( tactic, $kw72$TACTICAL ) && ( NIL == inference_tactician.better_term_chosen_handlingP() || NIL == inference_datastructures_problem_store
        .problem_store_transformation_allowedP( inference_datastructures_tactic.tactic_store( tactic ) ) ) )
    {
      inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics( tactic );
    }
    consider_strategic_ramifications_of_tactic_preference_level( tactic );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40204L)
  public static SubLObject consider_strategic_ramifications_of_tactic_preference_level(final SubLObject tactic)
  {
    final SubLObject prob;
    final SubLObject problem = prob = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject store = inference_datastructures_problem.problem_store( prob );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw62$SKIP ) )
    {
      final SubLObject idx_$10 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$10, $kw62$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$10 );
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
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw62$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw62$SKIP;
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
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) && NIL != inference_datastructures_strategy.tactic_strategically_preferredP( tactic, strategy ) )
                {
                  inference_worker.possibly_note_problem_pending( inference_datastructures_tactic.tactic_problem( tactic ), strategy );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$11 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$11 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$11 );
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
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) && NIL != inference_datastructures_strategy.tactic_strategically_preferredP( tactic, strategy2 ) )
                {
                  inference_worker.possibly_note_problem_pending( inference_datastructures_tactic.tactic_problem( tactic ), strategy2 );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40550L)
  public static SubLObject join_ordered_tactic_lookahead_problem(final SubLObject join_ordered_tactic)
  {
    final SubLObject focal_mapped_problem = find_or_create_join_ordered_tactic_focal_mapped_problem( join_ordered_tactic );
    return inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40856L)
  public static SubLObject new_join_ordered_proof(final SubLObject join_ordered_link, final SubLObject subproofs_with_sub_bindings)
  {
    return new_conjunctive_proof( join_ordered_link, subproofs_with_sub_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 41183L)
  public static SubLObject join_ordered_proof_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_proof.proof_p( v_object ) && $kw24$JOIN_ORDERED == inference_datastructures_proof.proof_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 41310L)
  public static SubLObject connected_conjunction_proof_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != join_ordered_proof_p( v_object ) || NIL != inference_worker_join.join_proof_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 41440L)
  public static SubLObject new_conjunctive_proof(final SubLObject conjunctive_link, final SubLObject subproofs_with_sub_bindings)
  {
    SubLObject proof_bindings = NIL;
    SubLObject subproofs = NIL;
    SubLObject cdolist_list_var = subproofs_with_sub_bindings;
    SubLObject subproof_with_sub_bindings = NIL;
    subproof_with_sub_bindings = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = subproof_with_sub_bindings;
      SubLObject subproof = NIL;
      SubLObject sub_proof_bindings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
      subproof = current.first();
      current = ( sub_proof_bindings = current.rest() );
      proof_bindings = ConsesLow.nconc( conses_high.copy_list( sub_proof_bindings ), proof_bindings );
      subproofs = ConsesLow.cons( subproof, subproofs );
      cdolist_list_var = cdolist_list_var.rest();
      subproof_with_sub_bindings = cdolist_list_var.first();
    }
    subproofs = Sequences.nreverse( subproofs );
    proof_bindings = inference_worker.ncanonicalize_proof_bindings( proof_bindings );
    return inference_worker.propose_new_proof_with_bindings( conjunctive_link, proof_bindings, subproofs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 42237L)
  public static SubLObject compute_sibling_proof_bindings(final SubLObject trigger_proof_bindings, final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    final SubLObject trigger_to_sibling_variable_map = trigger_to_sibling_variable_map( join_ordered_link, trigger_is_focalP );
    final SubLObject sibling_proof_bindings = bindings.transfer_variable_map_to_bindings_filtered( trigger_to_sibling_variable_map, trigger_proof_bindings );
    return sibling_proof_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 42876L)
  public static SubLObject focal_to_non_focal_variable_map(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state( join_ordered_link );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        result = memoized_focal_to_non_focal_variable_map_int( join_ordered_link );
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 43129L)
  public static SubLObject memoized_focal_to_non_focal_variable_map_int_internal(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state( inference_datastructures_problem_link.problem_link_store( join_ordered_link ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        return focal_to_non_focal_variable_map_int( join_ordered_link );
      }
      finally
      {
        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 43129L)
  public static SubLObject memoized_focal_to_non_focal_variable_map_int(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_focal_to_non_focal_variable_map_int_internal( join_ordered_link );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, join_ordered_link, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_focal_to_non_focal_variable_map_int_internal( join_ordered_link ) ) );
      memoization_state.caching_state_put( caching_state, join_ordered_link, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 43393L)
  public static SubLObject focal_to_non_focal_variable_map_int(final SubLObject join_ordered_link)
  {
    final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
    final SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem( join_ordered_link );
    final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
    final SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( non_focal_mapped_problem );
    final SubLObject supported_to_non_focal_variable_map = bindings.invert_bindings( non_focal_variable_map );
    final SubLObject focal_to_non_focal_variable_map = bindings.compose_bindings_filtered( focal_variable_map, supported_to_non_focal_variable_map );
    return focal_to_non_focal_variable_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44239L)
  public static SubLObject non_focal_to_focal_variable_map(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state( join_ordered_link );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        result = memoized_non_focal_to_focal_variable_map_int( join_ordered_link );
      }
      finally
      {
        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44492L)
  public static SubLObject memoized_non_focal_to_focal_variable_map_int_internal(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state( inference_datastructures_problem_link.problem_link_store( join_ordered_link ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        return non_focal_to_focal_variable_map_int( join_ordered_link );
      }
      finally
      {
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44492L)
  public static SubLObject memoized_non_focal_to_focal_variable_map_int(final SubLObject join_ordered_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_non_focal_to_focal_variable_map_int_internal( join_ordered_link );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, join_ordered_link, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_non_focal_to_focal_variable_map_int_internal( join_ordered_link ) ) );
      memoization_state.caching_state_put( caching_state, join_ordered_link, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44756L)
  public static SubLObject non_focal_to_focal_variable_map_int(final SubLObject join_ordered_link)
  {
    return bindings.invert_bindings( focal_to_non_focal_variable_map( join_ordered_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44908L)
  public static SubLObject trigger_to_sibling_variable_map(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    return ( NIL != trigger_is_focalP ) ? focal_to_non_focal_variable_map( join_ordered_link ) : non_focal_to_focal_variable_map( join_ordered_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 45142L)
  public static SubLObject focal_bindings_to_non_focal_bindings(final SubLObject focal_restriction_bindings, final SubLObject join_ordered_link)
  {
    final SubLObject focal_to_non_focal_variable_map = focal_to_non_focal_variable_map( join_ordered_link );
    final SubLObject non_focal_restriction_bindings = bindings.transfer_variable_map_to_bindings_filtered( focal_to_non_focal_variable_map, focal_restriction_bindings );
    return non_focal_restriction_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 46239L)
  public static SubLObject non_focal_bindings_to_focal_bindings(final SubLObject non_focal_restriction_bindings, final SubLObject join_ordered_link)
  {
    final SubLObject non_focal_to_focal_variable_map = non_focal_to_focal_variable_map( join_ordered_link );
    final SubLObject focal_restriction_bindings = bindings.transfer_variable_map_to_bindings_filtered( non_focal_to_focal_variable_map, non_focal_restriction_bindings );
    return focal_restriction_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 46897L)
  public static SubLObject bubble_up_proof_to_join_ordered_link(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_ordered_link)
  {
    final SubLObject trigger_is_focalP = mapped_proof_is_focalP( trigger_subproof, variable_map, join_ordered_link );
    add_join_ordered_link_proof( join_ordered_link, trigger_subproof, trigger_is_focalP );
    if( NIL == trigger_is_focalP )
    {
      bubble_up_proof_to_join_ordered_link_int( trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP );
    }
    else
    {
      final SubLObject restricted_non_focal_mapped_problem = trigger_split_restriction( join_ordered_link, trigger_subproof );
      bubble_up_proof_to_join_ordered_link_int( trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP );
      if( NIL != restricted_non_focal_mapped_problem )
      {
        final SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem( restricted_non_focal_mapped_problem );
        final SubLObject prob;
        final SubLObject supported_problem = prob = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
        final SubLObject store = inference_datastructures_problem.problem_store( prob );
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
        if( NIL == id_index.id_index_objects_empty_p( idx, $kw62$SKIP ) )
        {
          final SubLObject idx_$16 = idx;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$16, $kw62$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$16 );
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
              if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw62$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( inference ) )
                {
                  inference = $kw62$SKIP;
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
                      inference_worker.maybe_possibly_activate_problem( strategy, restricted_non_focal_problem );
                    }
                  }
                }
              }
            }
          }
          final SubLObject idx_$17 = idx;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$17 ) )
          {
            final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$17 );
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
                      inference_worker.maybe_possibly_activate_problem( strategy2, restricted_non_focal_problem );
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
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48079L)
  public static SubLObject trigger_split_restriction(final SubLObject join_ordered_link, final SubLObject focal_problem_proof)
  {
    if( NIL == focal_problem_is_a_single_literal_backchain_requiredP( join_ordered_link ) )
    {
      return find_or_create_split_restriction_int( join_ordered_link, focal_problem_proof, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48494L)
  public static SubLObject find_split_restriction(final SubLObject join_ordered_link, final SubLObject focal_problem_proof)
  {
    return find_or_create_split_restriction_int( join_ordered_link, focal_problem_proof, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48666L)
  public static SubLObject find_or_create_split_restriction_int(final SubLObject join_ordered_link, final SubLObject focal_problem_proof, final SubLObject createP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject focal_restriction_bindings = inference_datastructures_proof.proof_bindings( focal_problem_proof );
    final SubLObject non_focal_restriction_bindings = focal_bindings_to_non_focal_bindings( focal_restriction_bindings, join_ordered_link );
    thread.resetMultipleValues();
    final SubLObject restricted_non_focal_mapped_problem = find_or_create_restricted_non_focal_problem_int( join_ordered_link, non_focal_restriction_bindings, createP );
    final SubLObject restricted_non_focal_link = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != restricted_non_focal_link )
    {
      add_join_ordered_link_restricted_non_focal_link( join_ordered_link, restricted_non_focal_link, focal_problem_proof );
    }
    return restricted_non_focal_mapped_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 49867L)
  public static SubLObject note_all_triggering_proofs_processed(final SubLObject restriction_link)
  {
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( restriction_link );
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( supported_problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject join_ordered_link;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      join_ordered_link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, join_ordered_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( join_ordered_link, $kw24$JOIN_ORDERED ) )
      {
        note_restricted_non_focal_finished( join_ordered_link, restriction_link );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50129L)
  public static SubLObject note_restricted_non_focal_finished(final SubLObject join_ordered_link, final SubLObject restriction_link)
  {
    final SubLObject proof = join_ordered_link_restricted_non_focal_triggering_proof( join_ordered_link, restriction_link );
    if( NIL != proof )
    {
      inference_worker.possibly_note_proof_processed( proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50481L)
  public static SubLObject find_or_create_restricted_non_focal_problem(final SubLObject join_ordered_link, final SubLObject non_focal_restriction_bindings)
  {
    return find_or_create_restricted_non_focal_problem_int( join_ordered_link, non_focal_restriction_bindings, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50703L)
  public static SubLObject find_restricted_non_focal_problem(final SubLObject join_ordered_link, final SubLObject non_focal_restriction_bindings)
  {
    return find_or_create_restricted_non_focal_problem_int( join_ordered_link, non_focal_restriction_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50917L)
  public static SubLObject find_or_create_restricted_non_focal_problem_int(final SubLObject join_ordered_link, final SubLObject non_focal_restriction_bindings, final SubLObject creation_allowedP)
  {
    final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_non_focal_mapped_problem( join_ordered_link ) );
    return find_or_create_restricted_problem_and_link_int( non_focal_problem, non_focal_restriction_bindings, creation_allowedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 51297L)
  public static SubLObject find_restricted_problem_and_link(final SubLObject unrestricted_problem, final SubLObject restriction_bindings)
  {
    return find_or_create_restricted_problem_and_link_int( unrestricted_problem, restriction_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 51495L)
  public static SubLObject find_or_create_restricted_problem_and_link_int(final SubLObject unrestricted_problem, final SubLObject restriction_bindings, final SubLObject creation_allowedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == restriction_bindings )
    {
      Errors.error( $str79$Finding_or_creating_a_restricted_, unrestricted_problem );
    }
    final SubLObject restricted_mapped_problem = find_or_create_restricted_problem_int( unrestricted_problem, restriction_bindings, creation_allowedP );
    SubLObject restriction_link = NIL;
    if( NIL != creation_allowedP )
    {
      restriction_link = inference_worker_restriction.maybe_new_restriction_link( unrestricted_problem, restricted_mapped_problem, restriction_bindings, UNPROVIDED, UNPROVIDED );
    }
    return subl_promotions.values2( restricted_mapped_problem, restriction_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 52287L)
  public static SubLObject find_or_create_restricted_problem(final SubLObject unrestricted_problem, final SubLObject restriction_bindings)
  {
    return find_or_create_restricted_problem_int( unrestricted_problem, restriction_bindings, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 52521L)
  public static SubLObject find_or_create_restricted_problem_int(final SubLObject unrestricted_problem, final SubLObject restriction_bindings, final SubLObject creation_allowedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == restriction_bindings )
    {
      Errors.error( $str80$Creating_a_restricted_problem_of_, unrestricted_problem );
    }
    final SubLObject query = inference_datastructures_problem.problem_query( unrestricted_problem );
    final SubLObject restricted_query = bindings.apply_bindings( restriction_bindings, query );
    final SubLObject restricted_free_hl_vars = variables.sort_hl_variable_list_memoized( cycl_utilities.expression_gather( bindings.apply_bindings( restriction_bindings, inference_datastructures_problem
        .problem_free_hl_vars( unrestricted_problem ) ), $sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject store = inference_datastructures_problem.problem_store( unrestricted_problem );
    final SubLObject restricted_mapped_problem = ( NIL != creation_allowedP ) ? inference_worker.find_or_create_problem( store, restricted_query, restricted_free_hl_vars, UNPROVIDED )
        : inference_worker.find_problem( store, restricted_query, restricted_free_hl_vars );
    return restricted_mapped_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 53551L)
  public static SubLObject focal_problem_is_a_single_literal_backchain_requiredP(final SubLObject join_ordered_link)
  {
    final SubLObject focal_problem = join_ordered_link_focal_problem( join_ordered_link );
    return makeBoolean( NIL != inference_datastructures_problem.single_literal_problem_p( focal_problem ) && NIL != inference_datastructures_problem.problem_backchain_requiredP( focal_problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 53832L)
  public static SubLObject corresponding_focal_problem(final SubLObject join_ordered_problem, final SubLObject join_ordered_link)
  {
    final SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem( join_ordered_link );
    final SubLObject non_focal_problem = ( NIL != non_focal_mapped_problem ) ? inference_datastructures_problem_link.mapped_problem_problem( non_focal_mapped_problem ) : NIL;
    if( !join_ordered_problem.eql( non_focal_problem ) )
    {
      return NIL;
    }
    final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
    if( NIL != focal_mapped_problem )
    {
      return inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 54652L)
  public static SubLObject corresponding_non_focal_problem(final SubLObject join_ordered_problem, final SubLObject join_ordered_link)
  {
    final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
    if( !join_ordered_problem.eql( focal_problem ) )
    {
      return NIL;
    }
    final SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem( join_ordered_link );
    if( NIL != non_focal_mapped_problem )
    {
      return inference_datastructures_problem_link.mapped_problem_problem( non_focal_mapped_problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 55397L)
  public static SubLObject corresponding_restricted_focal_problem(final SubLObject restriction_link, final SubLObject join_ordered_link)
  {
    final SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem( join_ordered_link );
    if( NIL != non_focal_mapped_problem )
    {
      final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem( non_focal_mapped_problem );
      final SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem( restriction_link );
      if( !unrestricted_problem.eql( non_focal_problem ) )
      {
        return NIL;
      }
      final SubLObject non_focal_restriction_bindings = inference_worker_restriction.restriction_link_bindings( restriction_link );
      final SubLObject focal_restriction_bindings = non_focal_bindings_to_focal_bindings( non_focal_restriction_bindings, join_ordered_link );
      final SubLObject restricted_focal_mapped_problem = ( NIL != focal_restriction_bindings ) ? find_restricted_focal_problem_by_bindings( join_ordered_link, focal_restriction_bindings ) : NIL;
      if( NIL != restricted_focal_mapped_problem )
      {
        return inference_datastructures_problem_link.mapped_problem_problem( restricted_focal_mapped_problem );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 56734L)
  public static SubLObject non_focal_restriction_link_with_corresponding_focal_proofP(final SubLObject restriction_link, final SubLObject join_ordered_link)
  {
    return join_ordered_link_restricted_non_focal_linkP( join_ordered_link, restriction_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 58051L)
  public static SubLObject corresponding_restricted_non_focal_problem(final SubLObject restriction_link, final SubLObject join_ordered_link)
  {
    final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
    final SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem( restriction_link );
    if( unrestricted_problem.eql( focal_problem ) )
    {
      if( NIL != join_ordered_link_non_focal_mapped_problem( join_ordered_link ) )
      {
        final SubLObject focal_restriction_bindings = inference_worker_restriction.restriction_link_bindings( restriction_link );
        final SubLObject non_focal_restriction_bindings = focal_bindings_to_non_focal_bindings( focal_restriction_bindings, join_ordered_link );
        final SubLObject restricted_non_focal_mapped_problem = ( NIL != non_focal_restriction_bindings ) ? find_restricted_non_focal_problem( join_ordered_link, non_focal_restriction_bindings ) : NIL;
        if( NIL != restricted_non_focal_mapped_problem )
        {
          return inference_datastructures_problem_link.mapped_problem_problem( restricted_non_focal_mapped_problem );
        }
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 59455L)
  public static SubLObject find_restricted_focal_problem_by_bindings(final SubLObject join_ordered_link, final SubLObject focal_restriction_bindings)
  {
    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_focal_mapped_problem( join_ordered_link ) );
    return find_restricted_problem_and_link( focal_problem, focal_restriction_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 59759L)
  public static SubLObject mapped_proof_is_focalP(final SubLObject subproof, final SubLObject proof_variable_map, final SubLObject join_ordered_link)
  {
    final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
    final SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem( subproof );
    if( focal_problem.eql( subproof_supported_problem ) )
    {
      final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
      if( NIL != bindings.bindings_equalP( focal_variable_map, proof_variable_map ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60358L)
  public static SubLObject trigger_vars_shared_by_sibling(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state( join_ordered_link );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        result = memoized_trigger_vars_shared_by_sibling_int( join_ordered_link, trigger_is_focalP );
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60645L)
  public static SubLObject memoized_trigger_vars_shared_by_sibling_int_internal(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state( inference_datastructures_problem_link.problem_link_store( join_ordered_link ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        return trigger_vars_shared_by_sibling_int( join_ordered_link, trigger_is_focalP );
      }
      finally
      {
        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60645L)
  public static SubLObject memoized_trigger_vars_shared_by_sibling_int(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_trigger_vars_shared_by_sibling_int_internal( join_ordered_link, trigger_is_focalP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( join_ordered_link, trigger_is_focalP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( join_ordered_link.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && trigger_is_focalP.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_trigger_vars_shared_by_sibling_int_internal( join_ordered_link, trigger_is_focalP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( join_ordered_link, trigger_is_focalP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60943L)
  public static SubLObject trigger_vars_shared_by_sibling_int(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    if( NIL != trigger_is_focalP )
    {
      final SubLObject tactic = join_ordered_link_tactic( join_ordered_link );
      final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
      final SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause( inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem ) );
      final SubLObject focal_supporting_problem_spec = join_ordered_tactic_focal_supporting_problem_spec( tactic );
      final SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause( inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link ) );
      final SubLObject non_focal_clause = clause_utilities.complement_of_subclause_specified_by_spec( dnf_clause, focal_supporting_problem_spec );
      final SubLObject non_focal_vars = list_utilities.tree_gather( non_focal_clause, Symbols.symbol_function( $sym83$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject focal_focal_vars = list_utilities.tree_gather( focal_clause, Symbols.symbol_function( $sym83$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject focal_vars = bindings.apply_bindings( inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem ), focal_focal_vars );
      final SubLObject shared_vars = conses_high.intersection( focal_vars, non_focal_vars, Symbols.symbol_function( EQ ), UNPROVIDED );
      final SubLObject focal_shared_vars = bindings.apply_bindings_backwards( inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem ), shared_vars );
      final SubLObject canonical_shared_vars = canonicalize_hl_variable_list( focal_shared_vars );
      return canonical_shared_vars;
    }
    final SubLObject trigger_to_sibling_variable_map = trigger_to_sibling_variable_map( join_ordered_link, trigger_is_focalP );
    return Mapping.mapcar( $sym84$VARIABLE_BINDING_VARIABLE, trigger_to_sibling_variable_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63130L)
  public static SubLObject non_focal_vars_shared_by_focal(final SubLObject join_ordered_link)
  {
    return trigger_vars_shared_by_sibling( join_ordered_link, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63264L)
  public static SubLObject focal_vars_shared_by_non_focal(final SubLObject join_ordered_link)
  {
    return trigger_vars_shared_by_sibling( join_ordered_link, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63396L)
  public static SubLObject canonicalize_hl_variable_list(final SubLObject hl_vars)
  {
    return hl_vars;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63586L)
  public static SubLObject join_ordered_link_join_vars(final SubLObject join_ordered_link)
  {
    final SubLObject trigger_vars_shared_by_sibling = trigger_vars_shared_by_sibling( join_ordered_link, T );
    final SubLObject focal_to_supported_variable_map = join_ordered_link_focal_to_supported_variable_map( join_ordered_link );
    final SubLObject join_vars = bindings.apply_bindings( focal_to_supported_variable_map, trigger_vars_shared_by_sibling );
    return join_vars;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63971L)
  public static SubLObject join_ordered_link_focal_to_supported_variable_map(final SubLObject join_ordered_link)
  {
    final SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
    return inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 64215L)
  public static SubLObject join_ordered_link_non_focal_to_supported_variable_map(final SubLObject join_ordered_link)
  {
    final SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem( join_ordered_link );
    return inference_datastructures_problem_link.mapped_problem_variable_map( non_focal_mapped_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 64475L)
  public static SubLObject add_join_ordered_link_proof(final SubLObject join_ordered_link, final SubLObject trigger_proof, final SubLObject trigger_is_focalP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == inference_datastructures_proof.proof_provenP( trigger_proof ) )
    {
      Errors.error( $str85$_a_was_a_rejected_proof, trigger_proof );
    }
    final SubLObject shared_trigger_proof_bindings = join_ordered_link_shared_proof_bindings( join_ordered_link, trigger_proof, trigger_is_focalP );
    if( NIL != trigger_is_focalP )
    {
      add_join_ordered_link_focal_proof( join_ordered_link, shared_trigger_proof_bindings, trigger_proof );
    }
    else
    {
      add_join_ordered_link_non_focal_proof( join_ordered_link, shared_trigger_proof_bindings, trigger_proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 65295L)
  public static SubLObject join_ordered_link_shared_proof_bindings(final SubLObject join_ordered_link, final SubLObject trigger_proof, final SubLObject trigger_is_focalP)
  {
    final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings( trigger_proof );
    return join_ordered_link_shared_proof_bindings_int( join_ordered_link, trigger_proof_bindings, trigger_is_focalP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 65631L)
  public static SubLObject remove_join_ordered_link_proof(final SubLObject join_ordered_link, final SubLObject trigger_proof, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_focalP)
  {
    final SubLObject shared_trigger_proof_bindings = join_ordered_link_shared_proof_bindings_int( join_ordered_link, trigger_proof_bindings, trigger_is_focalP );
    if( NIL != trigger_is_focalP )
    {
      remove_join_ordered_link_focal_proof( join_ordered_link, shared_trigger_proof_bindings, trigger_proof );
    }
    else
    {
      remove_join_ordered_link_non_focal_proof( join_ordered_link, shared_trigger_proof_bindings, trigger_proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 66299L)
  public static SubLObject remove_join_ordered_link_proof_both_ways(final SubLObject join_ordered_link, final SubLObject proof, final SubLObject v_bindings)
  {
    if( NIL != join_ordered_link_non_focal_manifestedP( join_ordered_link ) )
    {
      remove_join_ordered_link_proof( join_ordered_link, proof, v_bindings, T );
      remove_join_ordered_link_proof( join_ordered_link, proof, v_bindings, NIL );
    }
    else
    {
      remove_join_ordered_link_proof( join_ordered_link, proof, v_bindings, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 66903L)
  public static SubLObject join_ordered_link_shared_proof_bindings_int(final SubLObject join_ordered_link, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_focalP)
  {
    final SubLObject trigger_vars_shared_by_sibling = trigger_vars_shared_by_sibling( join_ordered_link, trigger_is_focalP );
    final SubLObject shared_trigger_proof_bindings = bindings.filter_bindings_by_variables( trigger_proof_bindings, trigger_vars_shared_by_sibling );
    return shared_trigger_proof_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 67573L)
  public static SubLObject join_ordered_link_sibling_proofs_lookup(final SubLObject join_ordered_link, final SubLObject sibling_proof_bindings, final SubLObject trigger_is_focalP)
  {
    return ( NIL != trigger_is_focalP ) ? join_ordered_link_non_focal_proofs_lookup( join_ordered_link, sibling_proof_bindings ) : join_ordered_link_focal_proofs_lookup( join_ordered_link, sibling_proof_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 67972L)
  public static SubLObject bubble_up_proof_to_join_ordered_link_int(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject proofs = NIL;
    final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings( trigger_subproof );
    final SubLObject sibling_proof_bindings = compute_sibling_proof_bindings( trigger_proof_bindings, join_ordered_link, trigger_is_focalP );
    final SubLObject sibling_proofs = list_utilities.remove_if_not( $sym86$PROOF_PROVEN_, join_ordered_link_sibling_proofs_lookup( join_ordered_link, sibling_proof_bindings, trigger_is_focalP ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    if( NIL != sibling_proofs )
    {
      final SubLObject sibling_mapped_problem = join_ordered_link_sibling_mapped_problem( join_ordered_link, trigger_is_focalP );
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
      final SubLObject supporting_mapped_proof_lists_by_supporting_problem = ( NIL != trigger_is_focalP ) ? ConsesLow.list( ConsesLow.list( ConsesLow.cons( trigger_subproof, trigger_sub_proof_bindings ) ),
          sibling_proofs_with_bindings ) : ConsesLow.list( sibling_proofs_with_bindings, ConsesLow.list( ConsesLow.cons( trigger_subproof, trigger_sub_proof_bindings ) ) );
      SubLObject cdolist_list_var2;
      final SubLObject mapped_subproof_lists = cdolist_list_var2 = list_utilities.cartesian_product( supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject mapped_subproof_list = NIL;
      mapped_subproof_list = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        thread.resetMultipleValues();
        final SubLObject proof = new_join_ordered_proof( join_ordered_link, mapped_subproof_list );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 70273L)
  public static SubLObject join_ordered_link_sibling_mapped_problem(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP)
  {
    return ( NIL != trigger_is_focalP ) ? join_ordered_link_non_focal_mapped_problem( join_ordered_link ) : join_ordered_link_focal_mapped_problem( join_ordered_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 70534L)
  public static SubLObject join_ordered_link_could_be_finishedP(final SubLObject jo_link, final SubLObject strategic_context)
  {
    SubLObject unfinishedP = makeBoolean( NIL == inference_worker.finished_problem_p( join_ordered_link_focal_problem( jo_link ), strategic_context ) );
    if( NIL != join_ordered_link_non_focal_manifestedP( jo_link ) )
    {
      final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( join_ordered_link_non_focal_problem( jo_link ) );
      SubLObject basis_object;
      SubLObject state;
      SubLObject restriction_link;
      SubLObject restricted_non_focal_problem;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == unfinishedP
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        restriction_link = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, restriction_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( restriction_link, $kw46$RESTRICTION )
            && NIL != non_focal_restriction_link_with_corresponding_focal_proofP( restriction_link, jo_link ) )
        {
          restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem( restriction_link );
          unfinishedP = makeBoolean( NIL == inference_worker.finished_problem_p( restricted_non_focal_problem, strategic_context ) );
        }
      }
    }
    return makeBoolean( NIL == unfinishedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 71060L)
  public static SubLObject join_ordered_link_no_goodP(final SubLObject join_ordered_link, final SubLObject consider_deepP, final SubLObject strategic_context)
  {
    return makeBoolean( NIL != join_ordered_link_no_good_case_1P( join_ordered_link, consider_deepP, strategic_context ) || NIL != join_ordered_link_no_good_case_2P( join_ordered_link, consider_deepP,
        strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 71731L)
  public static SubLObject join_ordered_link_no_good_case_1P(final SubLObject join_ordered_link, final SubLObject consider_deepP, final SubLObject strategic_context)
  {
    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_focal_mapped_problem( join_ordered_link ) );
    final SubLObject shared_vars = focal_vars_shared_by_non_focal( join_ordered_link );
    if( NIL != inference_worker.finished_problem_p( focal_problem, strategic_context ) && $kw87$PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level( focal_problem, strategic_context,
        shared_vars ) )
    {
      final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( focal_problem );
      SubLObject basis_object;
      SubLObject state;
      SubLObject argument_link;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        argument_link = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, argument_link ) && NIL == inference_worker.problem_link_no_good_wrt_dependent_join_ordered_linkP( argument_link, join_ordered_link, consider_deepP,
            strategic_context ) )
        {
          return NIL;
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 72522L)
  public static SubLObject join_ordered_link_no_good_case_2P(final SubLObject join_ordered_link, final SubLObject consider_deepP, final SubLObject strategic_context)
  {
    if( NIL != consider_deepP )
    {
      final SubLObject tactic = join_ordered_link_tactic( join_ordered_link );
      return inference_datastructures_tactic.tactic_discardedP( tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 72799L)
  public static SubLObject join_ordered_link_with_non_focal_unbound_predicateP(final SubLObject join_ordered_link)
  {
    final SubLObject non_focal_problem = join_ordered_link_non_focal_problem( join_ordered_link );
    SubLObject cdolist_list_var;
    final SubLObject non_focal_query = cdolist_list_var = inference_datastructures_problem.problem_query( non_focal_problem );
    SubLObject contextualized_clause = NIL;
    contextualized_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject sense = $kw64$NEG;
      SubLObject index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$20 = clauses.neg_lits( contextualized_clause );
      SubLObject contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$20.first();
      while ( NIL != cdolist_list_var_$20)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
          if( NIL != cycl_variables.hl_varP( pred ) && NIL != subl_promotions.memberP( pred, non_focal_vars_shared_by_focal( join_ordered_link ), UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
        contextualized_asent = cdolist_list_var_$20.first();
      }
      sense = $kw65$POS;
      index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$21 = clauses.pos_lits( contextualized_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$21.first();
      while ( NIL != cdolist_list_var_$21)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
          if( NIL != cycl_variables.hl_varP( pred ) && NIL != subl_promotions.memberP( pred, non_focal_vars_shared_by_focal( join_ordered_link ), UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
        contextualized_asent = cdolist_list_var_$21.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_clause = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 73455L)
  public static SubLObject join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(final SubLObject join_ordered_link)
  {
    final SubLObject non_focal_problem = join_ordered_link_non_focal_problem( join_ordered_link );
    SubLObject cdolist_list_var;
    final SubLObject non_focal_query = cdolist_list_var = inference_datastructures_problem.problem_query( non_focal_problem );
    SubLObject contextualized_clause = NIL;
    contextualized_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject sense = $kw64$NEG;
      SubLObject index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$22 = clauses.neg_lits( contextualized_clause );
      SubLObject contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$22.first();
      while ( NIL != cdolist_list_var_$22)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
          final SubLObject arg1 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
          final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
          if( pred.eql( $const89$isa ) && NIL != variables.variable_p( arg1 ) && NIL != variables.variable_p( arg2 ) && NIL != subl_promotions.memberP( arg2, non_focal_vars_shared_by_focal( join_ordered_link ),
              UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
        contextualized_asent = cdolist_list_var_$22.first();
      }
      sense = $kw65$POS;
      index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$23 = clauses.pos_lits( contextualized_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$23.first();
      while ( NIL != cdolist_list_var_$23)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
          final SubLObject arg1 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
          final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
          if( pred.eql( $const89$isa ) && NIL != variables.variable_p( arg1 ) && NIL != variables.variable_p( arg2 ) && NIL != subl_promotions.memberP( arg2, non_focal_vars_shared_by_focal( join_ordered_link ),
              UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
        contextualized_asent = cdolist_list_var_$23.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_clause = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_inference_worker_join_ordered_file()
  {
    SubLFiles.declareFunction( me, "join_ordered_link_data_print_function_trampoline", "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_data_p", "JOIN-ORDERED-LINK-DATA-P", 1, 0, false );
    new $join_ordered_link_data_p$UnaryFunction();
    SubLFiles.declareFunction( me, "jo_link_data_focal_proof_index", "JO-LINK-DATA-FOCAL-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "jo_link_data_non_focal_proof_index", "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "jo_link_data_restricted_non_focal_link_index", "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_jo_link_data_focal_proof_index", "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_jo_link_data_non_focal_proof_index", "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_jo_link_data_restricted_non_focal_link_index", "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "make_join_ordered_link_data", "MAKE-JOIN-ORDERED-LINK-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_join_ordered_link_data", "VISIT-DEFSTRUCT-JOIN-ORDERED-LINK-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_join_ordered_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-ORDERED-LINK-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_join_ordered_link_data_p", "VALID-JOIN-ORDERED-LINK-DATA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_join_ordered_link_data", "NEW-JOIN-ORDERED-LINK-DATA", 0, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_p", "JOIN-ORDERED-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_new_join_ordered_link", "MAYBE-NEW-JOIN-ORDERED-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "new_join_ordered_link", "NEW-JOIN-ORDERED-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "destroy_join_ordered_link", "DESTROY-JOIN-ORDERED-LINK", 1, 0, false );
    SubLFiles.declareMacro( me, "do_join_ordered_link_focal_proofs", "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS" );
    SubLFiles.declareMacro( me, "do_join_ordered_link_non_focal_proofs", "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS" );
    SubLFiles.declareMacro( me, "do_join_ordered_link_restricted_non_focal_problems", "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS" );
    SubLFiles.declareMacro( me, "do_virtual_dependent_join_ordered_links", "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS" );
    SubLFiles.declareFunction( me, "join_ordered_link_focal_proof_index", "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_non_focal_proof_index", "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_restricted_non_focal_link_index", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_triggered_restriction_link", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTION-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_triggered_restricted_non_focal", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTED-NON-FOCAL", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_restricted_non_focal_links", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_restricted_non_focal_triggering_proof", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-TRIGGERING-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_focal_mapped_problem", "JOIN-ORDERED-LINK-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_has_non_focal_mapped_problemP", "JOIN-ORDERED-LINK-HAS-NON-FOCAL-MAPPED-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_non_focal_mapped_problem", "JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_non_focal_manifestedP", "JOIN-ORDERED-LINK-NON-FOCAL-MANIFESTED?", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_focal_problem", "JOIN-ORDERED-LINK-FOCAL-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_non_focal_problem", "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_other_mapped_problem", "JOIN-ORDERED-LINK-OTHER-MAPPED-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_focal_proofs_lookup", "JOIN-ORDERED-LINK-FOCAL-PROOFS-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_non_focal_proofs_lookup", "JOIN-ORDERED-LINK-NON-FOCAL-PROOFS-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_tactic", "JOIN-ORDERED-LINK-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_restricted_non_focal_linkP", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_restricted_non_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "add_join_ordered_link_focal_proof", "ADD-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_ordered_link_focal_proof", "REMOVE-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "add_join_ordered_link_non_focal_proof", "ADD-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_ordered_link_non_focal_proof", "REMOVE-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "add_join_ordered_link_restricted_non_focal_link", "ADD-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_ordered_link_restricted_non_focal_link", "REMOVE-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_non_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-NON-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_tactic_p", "JOIN-ORDERED-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "single_focal_literal_join_ordered_tactic_p", "SINGLE-FOCAL-LITERAL-JOIN-ORDERED-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_join_ordered_tactic", "NEW-JOIN-ORDERED-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_tactic_link", "JOIN-ORDERED-TACTIC-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_tactic_focal_supporting_problem_spec", "JOIN-ORDERED-TACTIC-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_tactic_subsumesP", "JOIN-ORDERED-TACTIC-SUBSUMES?", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_join_ordered_tactic_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_join_ordered_tactic_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_tactic_focal_problem", "JOIN-ORDERED-TACTIC-FOCAL-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_new_join_ordered_tactics", "DETERMINE-NEW-JOIN-ORDERED-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_has_a_candidate_early_removal_tacticP", "PROBLEM-HAS-A-CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_new_single_literal_join_ordered_tactics", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_simplifying_asentP", "POTENTIALLY-SIMPLIFYING-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_new_single_literal_join_ordered_tactic", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTIC", 4, 0, false );
    SubLFiles.declareFunction( me, "motivated_followup_multi_literal_subclause_specs_case_1", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-1", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_followup_query_problem_p", "PROBLEM-STORE-FOLLOWUP-QUERY-PROBLEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "motivated_followup_multi_literal_subclause_specs_case_2", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-2", 2, 0, false );
    SubLFiles.declareFunction( me, "matching_subclause_specs", "MATCHING-SUBCLAUSE-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "matching_subclause_index_dictionary", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY", 2, 0, false );
    SubLFiles.declareFunction( me, "matching_subclause_index_dictionary_to_indices_list", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY-TO-INDICES-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "sub_matching_subclause_specs", "SUB-MATCHING-SUBCLAUSE-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_new_join_ordered_tactic", "DETERMINE-NEW-JOIN-ORDERED-TACTIC", 3, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_join_ordered_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-FOCAL-MAPPED-PROBLEM", 4, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_join_ordered_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-NON-FOCAL-MAPPED-PROBLEM", 4, 0, false );
    SubLFiles.declareFunction( me, "lazily_create_join_ordered_link_non_focal_mapped_problem", "LAZILY-CREATE-JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_join_ordered_problem_subclause_free_vars", "COMPUTE-JOIN-ORDERED-PROBLEM-SUBCLAUSE-FREE-VARS", 4, 0, false );
    SubLFiles.declareFunction( me, "compute_strategic_properties_of_join_ordered_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-ORDERED-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_join_ordered_tactic_productivity", "COMPUTE-JOIN-ORDERED-TACTIC-PRODUCTIVITY", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_join_ordered_tactic_preference_level", "COMPUTE-JOIN-ORDERED-TACTIC-PREFERENCE-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "execute_join_ordered_tactic", "EXECUTE-JOIN-ORDERED-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "consider_strategic_ramifications_of_tactic_preference_level", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-TACTIC-PREFERENCE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_tactic_lookahead_problem", "JOIN-ORDERED-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "new_join_ordered_proof", "NEW-JOIN-ORDERED-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_proof_p", "JOIN-ORDERED-PROOF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "connected_conjunction_proof_p", "CONNECTED-CONJUNCTION-PROOF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_conjunctive_proof", "NEW-CONJUNCTIVE-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_sibling_proof_bindings", "COMPUTE-SIBLING-PROOF-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "focal_to_non_focal_variable_map", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "memoized_focal_to_non_focal_variable_map_int_internal", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "memoized_focal_to_non_focal_variable_map_int", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "focal_to_non_focal_variable_map_int", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "non_focal_to_focal_variable_map", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "memoized_non_focal_to_focal_variable_map_int_internal", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "memoized_non_focal_to_focal_variable_map_int", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "non_focal_to_focal_variable_map_int", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "trigger_to_sibling_variable_map", "TRIGGER-TO-SIBLING-VARIABLE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "focal_bindings_to_non_focal_bindings", "FOCAL-BINDINGS-TO-NON-FOCAL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "non_focal_bindings_to_focal_bindings", "NON-FOCAL-BINDINGS-TO-FOCAL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "bubble_up_proof_to_join_ordered_link", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "trigger_split_restriction", "TRIGGER-SPLIT-RESTRICTION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_split_restriction", "FIND-SPLIT-RESTRICTION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_split_restriction_int", "FIND-OR-CREATE-SPLIT-RESTRICTION-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "note_all_triggering_proofs_processed", "NOTE-ALL-TRIGGERING-PROOFS-PROCESSED", 1, 0, false );
    SubLFiles.declareFunction( me, "note_restricted_non_focal_finished", "NOTE-RESTRICTED-NON-FOCAL-FINISHED", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_restricted_non_focal_problem", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "find_restricted_non_focal_problem", "FIND-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_restricted_non_focal_problem_int", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_restricted_problem_and_link", "FIND-RESTRICTED-PROBLEM-AND-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_restricted_problem_and_link_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-AND-LINK-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_restricted_problem", "FIND-OR-CREATE-RESTRICTED-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_restricted_problem_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "focal_problem_is_a_single_literal_backchain_requiredP", "FOCAL-PROBLEM-IS-A-SINGLE-LITERAL-BACKCHAIN-REQUIRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "corresponding_focal_problem", "CORRESPONDING-FOCAL-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "corresponding_non_focal_problem", "CORRESPONDING-NON-FOCAL-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "corresponding_restricted_focal_problem", "CORRESPONDING-RESTRICTED-FOCAL-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "non_focal_restriction_link_with_corresponding_focal_proofP", "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?", 2, 0, false );
    SubLFiles.declareFunction( me, "corresponding_restricted_non_focal_problem", "CORRESPONDING-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "find_restricted_focal_problem_by_bindings", "FIND-RESTRICTED-FOCAL-PROBLEM-BY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "mapped_proof_is_focalP", "MAPPED-PROOF-IS-FOCAL?", 3, 0, false );
    SubLFiles.declareFunction( me, "trigger_vars_shared_by_sibling", "TRIGGER-VARS-SHARED-BY-SIBLING", 2, 0, false );
    SubLFiles.declareFunction( me, "memoized_trigger_vars_shared_by_sibling_int_internal", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "memoized_trigger_vars_shared_by_sibling_int", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "trigger_vars_shared_by_sibling_int", "TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "non_focal_vars_shared_by_focal", "NON-FOCAL-VARS-SHARED-BY-FOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "focal_vars_shared_by_non_focal", "FOCAL-VARS-SHARED-BY-NON-FOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_hl_variable_list", "CANONICALIZE-HL-VARIABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_join_vars", "JOIN-ORDERED-LINK-JOIN-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_non_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-NON-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "add_join_ordered_link_proof", "ADD-JOIN-ORDERED-LINK-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_shared_proof_bindings", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_join_ordered_link_proof", "REMOVE-JOIN-ORDERED-LINK-PROOF", 4, 0, false );
    SubLFiles.declareFunction( me, "remove_join_ordered_link_proof_both_ways", "REMOVE-JOIN-ORDERED-LINK-PROOF-BOTH-WAYS", 3, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_shared_proof_bindings_int", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_sibling_proofs_lookup", "JOIN-ORDERED-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false );
    SubLFiles.declareFunction( me, "bubble_up_proof_to_join_ordered_link_int", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_sibling_mapped_problem", "JOIN-ORDERED-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_could_be_finishedP", "JOIN-ORDERED-LINK-COULD-BE-FINISHED?", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_no_goodP", "JOIN-ORDERED-LINK-NO-GOOD?", 3, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_no_good_case_1P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-1?", 3, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_no_good_case_2P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-2?", 3, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_with_non_focal_unbound_predicateP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-UNBOUND-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-ISA-UNBOUND-UNBOUND-WHERE-ARG2-IS-RESTRICTED?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_worker_join_ordered_file()
  {
    $dtp_join_ordered_link_data$ = SubLFiles.defconstant( "*DTP-JOIN-ORDERED-LINK-DATA*", $sym0$JOIN_ORDERED_LINK_DATA );
    $join_ordered_module$ = SubLFiles.defparameter( "*JOIN-ORDERED-MODULE*", inference_modules.inference_structural_module( $kw24$JOIN_ORDERED, UNPROVIDED ) );
    $max_subclause_spec_cartesian_product_cardinality$ = SubLFiles.defparameter( "*MAX-SUBCLAUSE-SPEC-CARTESIAN-PRODUCT-CARDINALITY*", $int68$21200 );
    return NIL;
  }

  public static SubLObject setup_inference_worker_join_ordered_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_join_ordered_link_data$.getGlobalValue(), Symbols.symbol_function( $sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$JO_LINK_DATA_FOCAL_PROOF_INDEX, $sym10$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX );
    Structures.def_csetf( $sym11$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX, $sym12$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX );
    Structures.def_csetf( $sym13$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX, $sym14$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX );
    Equality.identity( $sym0$JOIN_ORDERED_LINK_DATA );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_join_ordered_link_data$.getGlobalValue(), Symbols.symbol_function(
        $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD ) );
    access_macros.register_macro_helper( $sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, $sym56$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS );
    access_macros.register_macro_helper( $sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, $sym57$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS );
    memoization_state.note_memoized_function( $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT );
    memoization_state.note_memoized_function( $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT );
    access_macros.register_macro_helper( $sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, $list81 );
    memoization_state.note_memoized_function( $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_worker_join_ordered_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_worker_join_ordered_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_worker_join_ordered_file();
  }
  static
  {
    me = new inference_worker_join_ordered();
    $dtp_join_ordered_link_data$ = null;
    $join_ordered_module$ = null;
    $max_subclause_spec_cartesian_product_cardinality$ = null;
    $sym0$JOIN_ORDERED_LINK_DATA = makeSymbol( "JOIN-ORDERED-LINK-DATA" );
    $sym1$JOIN_ORDERED_LINK_DATA_P = makeSymbol( "JOIN-ORDERED-LINK-DATA-P" );
    $list2 = ConsesLow.list( makeSymbol( "FOCAL-PROOF-INDEX" ), makeSymbol( "NON-FOCAL-PROOF-INDEX" ), makeSymbol( "RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
    $list3 = ConsesLow.list( makeKeyword( "FOCAL-PROOF-INDEX" ), makeKeyword( "NON-FOCAL-PROOF-INDEX" ), makeKeyword( "RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
    $list4 = ConsesLow.list( makeSymbol( "JO-LINK-DATA-FOCAL-PROOF-INDEX" ), makeSymbol( "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" ), makeSymbol( "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX" ), makeSymbol( "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" ), makeSymbol( "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "JOIN-ORDERED-LINK-DATA-P" ) );
    $sym9$JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol( "JO-LINK-DATA-FOCAL-PROOF-INDEX" );
    $sym10$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol( "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX" );
    $sym11$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol( "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" );
    $sym12$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol( "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" );
    $sym13$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol( "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" );
    $sym14$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol( "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" );
    $kw15$FOCAL_PROOF_INDEX = makeKeyword( "FOCAL-PROOF-INDEX" );
    $kw16$NON_FOCAL_PROOF_INDEX = makeKeyword( "NON-FOCAL-PROOF-INDEX" );
    $kw17$RESTRICTED_NON_FOCAL_LINK_INDEX = makeKeyword( "RESTRICTED-NON-FOCAL-LINK-INDEX" );
    $str18$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw19$BEGIN = makeKeyword( "BEGIN" );
    $sym20$MAKE_JOIN_ORDERED_LINK_DATA = makeSymbol( "MAKE-JOIN-ORDERED-LINK-DATA" );
    $kw21$SLOT = makeKeyword( "SLOT" );
    $kw22$END = makeKeyword( "END" );
    $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-JOIN-ORDERED-LINK-DATA-METHOD" );
    $kw24$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
    $sym25$MAPPED_PROBLEM_P = makeSymbol( "MAPPED-PROBLEM-P" );
    $kw26$FREE = makeKeyword( "FREE" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "BINDINGS-VAR" ), makeSymbol( "PROOF-VAR" ), makeSymbol( "JOIN-ORDERED-LINK" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym28$INDEX = makeUninternedSymbol( "INDEX" );
    $sym29$PROOF_LIST_VAR = makeUninternedSymbol( "PROOF-LIST-VAR" );
    $sym30$CLET = makeSymbol( "CLET" );
    $sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX = makeSymbol( "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX" );
    $sym32$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $sym33$DO_LIST = makeSymbol( "DO-LIST" );
    $sym34$INDEX = makeUninternedSymbol( "INDEX" );
    $sym35$PROOF_LIST_VAR = makeUninternedSymbol( "PROOF-LIST-VAR" );
    $sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX = makeSymbol( "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESTRICTED-NON-FOCAL-PROBLEM-VAR" ), makeSymbol( "JOIN-ORDERED-LINK" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list38 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw39$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw40$DONE = makeKeyword( "DONE" );
    $sym41$LINK_VAR = makeUninternedSymbol( "LINK-VAR" );
    $sym42$RESTRICTION_LINK = makeUninternedSymbol( "RESTRICTION-LINK" );
    $sym43$DO_PROBLEM_ARGUMENT_LINKS = makeSymbol( "DO-PROBLEM-ARGUMENT-LINKS" );
    $sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM = makeSymbol( "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM" );
    $kw45$TYPE = makeKeyword( "TYPE" );
    $kw46$RESTRICTION = makeKeyword( "RESTRICTION" );
    $sym47$PWHEN = makeSymbol( "PWHEN" );
    $sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_ = makeSymbol( "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?" );
    $sym49$PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM = makeSymbol( "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "JOIN-ORDERED-LINK-VAR" ), makeSymbol( "RESTRICTED-NON-FOCAL-PROBLEM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym51$RESTRICTION_LINK = makeUninternedSymbol( "RESTRICTION-LINK" );
    $sym52$NON_FOCAL_PROBLEM = makeUninternedSymbol( "NON-FOCAL-PROBLEM" );
    $sym53$DO_PROBLEM_DEPENDENT_LINKS = makeSymbol( "DO-PROBLEM-DEPENDENT-LINKS" );
    $sym54$PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol( "PROBLEM-LINK-SUPPORTED-PROBLEM" );
    $sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_ = makeSymbol( "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?" );
    $sym56$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS = makeSymbol( "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS" );
    $sym57$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS = makeSymbol( "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS" );
    $str58$Could_not_find_the_tactic_for__a = makeString( "Could not find the tactic for ~a" );
    $sym59$JOIN_ORDERED_LINK_P = makeSymbol( "JOIN-ORDERED-LINK-P" );
    $sym60$PROOF_P = makeSymbol( "PROOF-P" );
    $sym61$RESTRICTION_LINK_P = makeSymbol( "RESTRICTION-LINK-P" );
    $kw62$SKIP = makeKeyword( "SKIP" );
    $sym63$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $kw64$NEG = makeKeyword( "NEG" );
    $kw65$POS = makeKeyword( "POS" );
    $kw66$ANSWER = makeKeyword( "ANSWER" );
    $kw67$UNION = makeKeyword( "UNION" );
    $int68$21200 = makeInteger( 21200 );
    $str69$Too_many_possible_matches_to_chec = makeString( "Too many possible matches to check (~A) for problem ~S" );
    $sym70$DUPLICATES_ = makeSymbol( "DUPLICATES?" );
    $sym71$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $kw72$TACTICAL = makeKeyword( "TACTICAL" );
    $kw73$DOOMED = makeKeyword( "DOOMED" );
    $sym74$STRATEGY_P = makeSymbol( "STRATEGY-P" );
    $list75 = ConsesLow.cons( makeSymbol( "SUBPROOF" ), makeSymbol( "SUB-PROOF-BINDINGS" ) );
    $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT = makeSymbol( "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT" );
    $sym77$_EXIT = makeSymbol( "%EXIT" );
    $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT = makeSymbol( "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT" );
    $str79$Finding_or_creating_a_restricted_ = makeString( "Finding or creating a restricted problem of ~a requires bindings" );
    $str80$Creating_a_restricted_problem_of_ = makeString( "Creating a restricted problem of ~a requires bindings" );
    $list81 = ConsesLow.list( makeSymbol( "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS" ), makeSymbol( "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS" ) );
    $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT = makeSymbol( "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT" );
    $sym83$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym84$VARIABLE_BINDING_VARIABLE = makeSymbol( "VARIABLE-BINDING-VARIABLE" );
    $str85$_a_was_a_rejected_proof = makeString( "~a was a rejected proof" );
    $sym86$PROOF_PROVEN_ = makeSymbol( "PROOF-PROVEN?" );
    $kw87$PREFERRED = makeKeyword( "PREFERRED" );
    $list88 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $const89$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
  }

  public static final class $join_ordered_link_data_native
      extends
        SubLStructNative
  {
    public SubLObject $focal_proof_index;
    public SubLObject $non_focal_proof_index;
    public SubLObject $restricted_non_focal_link_index;
    private static final SubLStructDeclNative structDecl;

    public $join_ordered_link_data_native()
    {
      this.$focal_proof_index = CommonSymbols.NIL;
      this.$non_focal_proof_index = CommonSymbols.NIL;
      this.$restricted_non_focal_link_index = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $join_ordered_link_data_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$focal_proof_index;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$non_focal_proof_index;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$restricted_non_focal_link_index;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$focal_proof_index = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$non_focal_proof_index = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$restricted_non_focal_link_index = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $join_ordered_link_data_native.class, $sym0$JOIN_ORDERED_LINK_DATA, $sym1$JOIN_ORDERED_LINK_DATA_P, $list2, $list3, new String[] { "$focal_proof_index",
        "$non_focal_proof_index", "$restricted_non_focal_link_index"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $join_ordered_link_data_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $join_ordered_link_data_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "JOIN-ORDERED-LINK-DATA-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return join_ordered_link_data_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 587 ms synthetic
 */