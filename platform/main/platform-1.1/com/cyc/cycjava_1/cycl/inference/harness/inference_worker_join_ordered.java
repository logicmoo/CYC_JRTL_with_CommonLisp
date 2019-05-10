/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/
package com.cyc.cycjava_1.cycl.inference.harness;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_utilities;
import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public final class inference_worker_join_ordered
    extends
      SubLTranslatedFile
{
  //// Constructor
  private inference_worker_join_ordered()
  {}
  public static final SubLFile me = new inference_worker_join_ordered();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered";

  //// Definitions
  public static final class $join_ordered_link_data_native
      extends
        SubLStructNative
  {
    @Override
    public SubLStructDecl getStructDecl()
    {
      return structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return $focal_proof_index;
    }

    @Override
    public SubLObject getField3()
    {
      return $non_focal_proof_index;
    }

    @Override
    public SubLObject getField4()
    {
      return $restricted_non_focal_link_index;
    }

    @Override
    public SubLObject setField2(SubLObject value)
    {
      return $focal_proof_index = value;
    }

    @Override
    public SubLObject setField3(SubLObject value)
    {
      return $non_focal_proof_index = value;
    }

    @Override
    public SubLObject setField4(SubLObject value)
    {
      return $restricted_non_focal_link_index = value;
    }
    public SubLObject $focal_proof_index = NIL;
    public SubLObject $non_focal_proof_index = NIL;
    public SubLObject $restricted_non_focal_link_index = NIL;
    private static final SubLStructDeclNative structDecl = Structures.makeStructDeclNative( $join_ordered_link_data_native.class, $sym0$JOIN_ORDERED_LINK_DATA, $sym1$JOIN_ORDERED_LINK_DATA_P, $list2, $list3,
        new String[]
        { "$focal_proof_index", "$non_focal_proof_index", "$restricted_non_focal_link_index"
        }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
  }
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static SubLSymbol $dtp_join_ordered_link_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject join_ordered_link_data_print_function_trampoline(SubLObject object, SubLObject stream)
  {
    compatibility.default_struct_print_function( object, stream, ZERO_INTEGER );
    return NIL;
  }

  public static final class $join_ordered_link_data_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $join_ordered_link_data_p$UnaryFunction()
    {
      super( extractFunctionNamed( "JOIN-ORDERED-LINK-DATA-P" ) );
    }

    @Override
    public SubLObject processItem(SubLObject arg1)
    {
      return Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36364" );
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject jo_link_data_focal_proof_index(SubLObject object)
  {
    checkType( object, $sym1$JOIN_ORDERED_LINK_DATA_P );
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject jo_link_data_non_focal_proof_index(SubLObject object)
  {
    checkType( object, $sym1$JOIN_ORDERED_LINK_DATA_P );
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject jo_link_data_restricted_non_focal_link_index(SubLObject object)
  {
    checkType( object, $sym1$JOIN_ORDERED_LINK_DATA_P );
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject _csetf_jo_link_data_focal_proof_index(SubLObject object, SubLObject value)
  {
    checkType( object, $sym1$JOIN_ORDERED_LINK_DATA_P );
    return object.setField2( value );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject _csetf_jo_link_data_non_focal_proof_index(SubLObject object, SubLObject value)
  {
    checkType( object, $sym1$JOIN_ORDERED_LINK_DATA_P );
    return object.setField3( value );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject _csetf_jo_link_data_restricted_non_focal_link_index(SubLObject object, SubLObject value)
  {
    checkType( object, $sym1$JOIN_ORDERED_LINK_DATA_P );
    return object.setField4( value );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1490)
  public static final SubLObject make_join_ordered_link_data(SubLObject arglist)
  {
    if( ( arglist == UNPROVIDED ) )
    {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $join_ordered_link_data_native();
      SubLObject next = NIL;
      for( next = arglist; ( NIL != next ); next = conses_high.cddr( next ) )
      {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr( next );
          SubLObject pcase_var = current_arg;
          if( pcase_var.eql( $kw14$FOCAL_PROOF_INDEX ) )
          {
            _csetf_jo_link_data_focal_proof_index( v_new, current_value );
          }
          else if( pcase_var.eql( $kw15$NON_FOCAL_PROOF_INDEX ) )
          {
            _csetf_jo_link_data_non_focal_proof_index( v_new, current_value );
          }
          else if( pcase_var.eql( $kw16$RESTRICTED_NON_FOCAL_LINK_INDEX ) )
          {
            _csetf_jo_link_data_restricted_non_focal_link_index( v_new, current_value );
          }
          else
          {
            Errors.error( $str17$Invalid_slot__S_for_construction_, current_arg );
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 2415)
  public static final SubLObject new_join_ordered_link_data()
  {
    {
      SubLObject data = make_join_ordered_link_data( UNPROVIDED );
      _csetf_jo_link_data_focal_proof_index( data, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
      _csetf_jo_link_data_non_focal_proof_index( data, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
      _csetf_jo_link_data_restricted_non_focal_link_index( data, dictionary_contents.new_dictionary_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) ) );
      return data;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3043)
  public static final SubLObject join_ordered_link_p(SubLObject object)
  {
    return makeBoolean( ( ( NIL != inference_datastructures_problem_link.problem_link_p( object ) ) && ( $kw18$JOIN_ORDERED == inference_datastructures_problem_link.problem_link_type( object ) ) ) );
  }

  /**
   * @return join-ordered-link-p, either the already existing one or a new one.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3258)
  public static final SubLObject maybe_new_join_ordered_link(SubLObject supported_problem, SubLObject focal_supporting_mapped_problem, SubLObject non_focal_supporting_mapped_problem)
  {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( supported_problem );
      SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
      SubLObject state = NIL;
      for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents.do_set_contents_update_state(
          state ) )
      {
        {
          SubLObject candidate_link = set_contents.do_set_contents_next( basis_object, state );
          if( ( NIL != set_contents.do_set_contents_element_validP( state, candidate_link ) ) )
          {
            if( ( NIL != inference_datastructures_problem_link.problem_link_has_typeP( candidate_link, $kw18$JOIN_ORDERED ) ) )
            {
              {
                SubLObject candidate_mapped_problem = join_ordered_link_focal_mapped_problem( candidate_link );
                if( ( NIL != inference_datastructures_problem_link.mapped_problem_equal( focal_supporting_mapped_problem, candidate_mapped_problem ) ) )
                {
                  return candidate_link;
                }
              }
            }
          }
        }
      }
    }
    return new_join_ordered_link( supported_problem, focal_supporting_mapped_problem, non_focal_supporting_mapped_problem );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3890)
  public static final SubLObject new_join_ordered_link(SubLObject supported_problem, SubLObject focal_supporting_mapped_problem, SubLObject non_focal_supporting_mapped_problem)
  {
    checkType( focal_supporting_mapped_problem, $sym19$MAPPED_PROBLEM_P );
    if( ( NIL != non_focal_supporting_mapped_problem ) )
    {
      checkType( non_focal_supporting_mapped_problem, $sym19$MAPPED_PROBLEM_P );
    }
    {
      SubLObject link = inference_datastructures_problem_link.new_problem_link( $kw18$JOIN_ORDERED, supported_problem );
      SubLObject data = new_join_ordered_link_data();
      inference_datastructures_problem_link.set_problem_link_data( link, data );
      inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( focal_supporting_mapped_problem, link );
      if( ( NIL != non_focal_supporting_mapped_problem ) )
      {
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( non_focal_supporting_mapped_problem, link );
      }
      inference_worker.propagate_problem_link( link );
      return link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 7869)
  public static final SubLObject join_ordered_link_focal_proof_index(SubLObject join_ordered_link)
  {
    return jo_link_data_focal_proof_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8084)
  public static final SubLObject join_ordered_link_non_focal_proof_index(SubLObject join_ordered_link)
  {
    return jo_link_data_non_focal_proof_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8299)
  public static final SubLObject join_ordered_link_restricted_non_focal_link_index(SubLObject join_ordered_link)
  {
    return jo_link_data_restricted_non_focal_link_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9390)
  public static final SubLObject join_ordered_link_restricted_non_focal_links(SubLObject join_ordered_link)
  {
    return dictionary_contents.dictionary_contents_keys( join_ordered_link_restricted_non_focal_link_index( join_ordered_link ) );
  }

  /**
   * The proof that, when bubbling up to JOIN-ORDERED-LINK, triggered the
   * creation of RESTRICTION-LINK
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9604)
  public static final SubLObject join_ordered_link_restricted_non_focal_triggering_proof(SubLObject join_ordered_link, SubLObject restriction_link)
  {
    {
      SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index( join_ordered_link );
      SubLObject proof = dictionary_contents.dictionary_contents_lookup( dict_contents, restriction_link, Symbols.symbol_function( EQ ), UNPROVIDED );
      if( ( NIL != inference_datastructures_proof.valid_proof_p( proof ) ) )
      {
        return proof;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10041)
  public static final SubLObject join_ordered_link_focal_mapped_problem(SubLObject join_ordered_link)
  {
    return conses_high.last( inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ), UNPROVIDED ).first();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10203)
  public static final SubLObject join_ordered_link_has_non_focal_mapped_problemP(SubLObject join_ordered_link)
  {
    return list_utilities.doubletonP( inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10372)
  public static final SubLObject join_ordered_link_non_focal_mapped_problem(SubLObject join_ordered_link)
  {
    if( ( NIL != join_ordered_link_non_focal_manifestedP( join_ordered_link ) ) )
    {
      return inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ).first();
    }
    else
    {
      return lazily_create_join_ordered_link_non_focal_mapped_problem( join_ordered_link );
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10694)
  public static final SubLObject join_ordered_link_non_focal_manifestedP(SubLObject join_ordered_link)
  {
    return list_utilities.doubletonP( inference_datastructures_problem_link.problem_link_supporting_mapped_problems( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10855)
  public static final SubLObject join_ordered_link_focal_problem(SubLObject join_ordered_link)
  {
    return inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_focal_mapped_problem( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11019)
  public static final SubLObject join_ordered_link_non_focal_problem(SubLObject join_ordered_link)
  {
    return inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_non_focal_mapped_problem( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11682)
  public static final SubLObject join_ordered_link_focal_proofs_lookup(SubLObject join_ordered_link, SubLObject proof_bindings)
  {
    {
      SubLObject index = join_ordered_link_focal_proof_index( join_ordered_link );
      SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings( proof_bindings );
      SubLObject focal_proofs = dictionary.dictionary_lookup_without_values( index, canonical_proof_bindings, UNPROVIDED );
      return focal_proofs;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 12031)
  public static final SubLObject join_ordered_link_non_focal_proofs_lookup(SubLObject join_ordered_link, SubLObject proof_bindings)
  {
    {
      SubLObject index = join_ordered_link_non_focal_proof_index( join_ordered_link );
      SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings( proof_bindings );
      SubLObject non_focal_proofs = dictionary.dictionary_lookup_without_values( index, canonical_proof_bindings, UNPROVIDED );
      return non_focal_proofs;
    }
  }

  /** @return tactic-p; the tactic which created JOIN-ORDERED-LINK */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 12395)
  public static final SubLObject join_ordered_link_tactic(SubLObject join_ordered_link)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( supported_problem );
        SubLObject join_ordered_tactic = NIL;
        for( join_ordered_tactic = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), join_ordered_tactic = cdolist_list_var.first() )
        {
          if( ( NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( join_ordered_tactic, $join_ordered_module$.getDynamicValue( thread ) ) ) )
          {
            if( ( join_ordered_link == join_ordered_tactic_link( join_ordered_tactic ) ) )
            {
              return join_ordered_tactic;
            }
          }
        }
        if( ( NIL == inference_datastructures_problem.tactically_unexamined_problem_p( supported_problem ) ) )
        {
          return Errors.error( $str52$Could_not_find_the_tactic_for__a, join_ordered_link );
        }
      }
      return NIL;
    }
  }

  /**
   * @return booleanp; true iff RESTRICTION-LINK is a restricted non-focal link
   *         of JOIN-ORDERED-LINK
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 12952)
  public static final SubLObject join_ordered_link_restricted_non_focal_linkP(SubLObject join_ordered_link, SubLObject restriction_link)
  {
    return set_contents.set_contents_memberP( restriction_link, join_ordered_link_restricted_non_focal_links( join_ordered_link ), Symbols.symbol_function( EQ ) );
  }

  /** Indexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 13539)
  public static final SubLObject add_join_ordered_link_focal_proof(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof)
  {
    checkType( join_ordered_link, $sym53$JOIN_ORDERED_LINK_P );
    checkType( proof, $sym54$PROOF_P );
    {
      SubLObject index = join_ordered_link_focal_proof_index( join_ordered_link );
      SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
      dictionary_utilities.dictionary_push( index, canonical_bindings, proof );
    }
    return join_ordered_link;
  }

  /** Indexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 14491)
  public static final SubLObject add_join_ordered_link_non_focal_proof(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof)
  {
    checkType( join_ordered_link, $sym53$JOIN_ORDERED_LINK_P );
    checkType( proof, $sym54$PROOF_P );
    {
      SubLObject index = join_ordered_link_non_focal_proof_index( join_ordered_link );
      SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings( v_bindings );
      dictionary_utilities.dictionary_push( index, canonical_bindings, proof );
    }
    return join_ordered_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 15443)
  public static final SubLObject add_join_ordered_link_restricted_non_focal_link(SubLObject join_ordered_link, SubLObject restriction_link, SubLObject trigger_proof)
  {
    checkType( join_ordered_link, $sym53$JOIN_ORDERED_LINK_P );
    checkType( restriction_link, $sym55$RESTRICTION_LINK_P );
    checkType( trigger_proof, $sym54$PROOF_P );
    {
      SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index( join_ordered_link );
      dict_contents = dictionary_contents.dictionary_contents_enter( dict_contents, restriction_link, trigger_proof, Symbols.symbol_function( EQ ) );
      _csetf_jo_link_data_restricted_non_focal_link_index( inference_datastructures_problem_link.problem_link_data( join_ordered_link ), dict_contents );
    }
    return join_ordered_link;
  }

  /**
   * @return subclause-spec-p or nil; the subclause-spec for the focal problem
   *         of JOIN-ORDERED-LINK
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 16669)
  public static final SubLObject join_ordered_link_focal_supporting_problem_spec(SubLObject join_ordered_link)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( supported_problem );
        SubLObject join_ordered_tactic = NIL;
        for( join_ordered_tactic = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), join_ordered_tactic = cdolist_list_var.first() )
        {
          if( ( NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( join_ordered_tactic, $join_ordered_module$.getDynamicValue( thread ) ) ) )
          {
            if( ( join_ordered_link == join_ordered_tactic_link( join_ordered_tactic ) ) )
            {
              return join_ordered_tactic_focal_supporting_problem_spec( join_ordered_tactic );
            }
          }
        }
      }
      return NIL;
    }
  }

  /**
   * @return subclause-spec-p or nil; the subclause-spec for the non-focal
   *         problem of JOIN-ORDERED-LINK
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 17344)
  public static final SubLObject join_ordered_link_non_focal_supporting_problem_spec(SubLObject join_ordered_link)
  {
    {
      SubLObject focal_spec = join_ordered_link_focal_supporting_problem_spec( join_ordered_link );
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
      SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause( supported_problem );
      SubLObject non_focal_spec = clause_utilities.new_complement_subclause_spec( focal_spec, supported_clause );
      return non_focal_spec;
    }
  }
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 17900)
  public static SubLSymbol $join_ordered_module$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18062)
  public static final SubLObject join_ordered_tactic_p(SubLObject object)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean( ( ( NIL != inference_datastructures_tactic.tactic_p( object ) ) && ( $join_ordered_module$.getDynamicValue( thread ) == inference_datastructures_tactic.tactic_hl_module( object ) ) ) );
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18216)
  public static final SubLObject single_focal_literal_join_ordered_tactic_p(SubLObject join_ordered_tactic)
  {
    return makeBoolean( ( ( NIL != join_ordered_tactic_p( join_ordered_tactic ) ) && ( NIL != clause_utilities.single_literal_subclause_specP( join_ordered_tactic_focal_supporting_problem_spec(
        join_ordered_tactic ) ) ) ) );
  }

  /**
   * Create a new :JOIN-ORDERED tactic for PROBLEM in which
   * FOCAL-SUPPORTING-PROBLEM-SPEC specifies the literals of DNF-CLAUSE which
   * should be the focal supporting problem and the remaining literals should be
   * the non-focal supporting problem.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18475)
  public static final SubLObject new_join_ordered_tactic(SubLObject jo_link, SubLObject focal_supporting_problem_spec)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType( jo_link, $sym53$JOIN_ORDERED_LINK_P );
      {
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem( jo_link );
        SubLObject data = list( jo_link, focal_supporting_problem_spec );
        SubLObject tactic = inference_datastructures_tactic.new_tactic( problem, $join_ordered_module$.getDynamicValue( thread ), data );
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store( prob );
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
        if( ( NIL == id_index.id_index_objects_empty_p( idx, $kw56$SKIP ) ) )
        {
          {
            SubLObject idx_3 = idx;
            if( ( NIL == id_index.id_index_old_objects_empty_p( idx_3, $kw56$SKIP ) ) )
            {
              {
                SubLObject vector_var = id_index.id_index_old_objects( idx_3 );
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length( vector_var );
                SubLObject v_iteration = NIL;
                for( v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  {
                    SubLObject id = ( ( NIL != backwardP_var ) ? ( (SubLObject) Numbers.subtract( length, v_iteration, ONE_INTEGER ) ) : v_iteration );
                    SubLObject inference = Vectors.aref( vector_var, id );
                    if( ( !( ( ( NIL != id_index.id_index_tombstone_p( inference ) ) && ( NIL != id_index.id_index_skip_tombstones_p( $kw56$SKIP ) ) ) ) ) )
                    {
                      if( ( NIL != id_index.id_index_tombstone_p( inference ) ) )
                      {
                        inference = $kw56$SKIP;
                      }
                      if( ( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) ) )
                      {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal( inference_datastructures_inference.inference_strategy_set( inference_var ) );
                          SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
                          SubLObject state = NIL;
                          for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
                              .do_set_contents_update_state( state ) )
                          {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next( basis_object, state );
                              if( ( NIL != set_contents.do_set_contents_element_validP( state, strategy ) ) )
                              {
                                inference_tactician.strategy_note_new_tactic( strategy, tactic );
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject idx_4 = idx;
            if( ( NIL == id_index.id_index_new_objects_empty_p( idx_4 ) ) )
            {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects( idx_4 );
                SubLObject id = NIL;
                SubLObject inference = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
                  try
                  {
                    while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                    {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                      id = Hashtables.getEntryKey( cdohash_entry );
                      inference = Hashtables.getEntryValue( cdohash_entry );
                      if( ( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) ) )
                      {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal( inference_datastructures_inference.inference_strategy_set( inference_var ) );
                          SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
                          SubLObject state = NIL;
                          for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
                              .do_set_contents_update_state( state ) )
                          {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next( basis_object, state );
                              if( ( NIL != set_contents.do_set_contents_element_validP( state, strategy ) ) )
                              {
                                inference_tactician.strategy_note_new_tactic( strategy, tactic );
                              }
                            }
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
        }
        return tactic;
      }
    }
  }

  /**
   * @return nil or problem-link-p; the link created by JOIN-ORDERED-TACTIC NIL
   *         should only occur if the tactic has been discarded.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19167)
  public static final SubLObject join_ordered_tactic_link(SubLObject join_ordered_tactic)
  {
    return inference_datastructures_tactic.tactic_data( join_ordered_tactic ).first();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19430)
  public static final SubLObject join_ordered_tactic_focal_supporting_problem_spec(SubLObject join_ordered_tactic)
  {
    return conses_high.second( inference_datastructures_tactic.tactic_data( join_ordered_tactic ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20193)
  public static final SubLObject find_or_create_join_ordered_tactic_focal_mapped_problem(SubLObject tactic)
  {
    {
      SubLObject jo_link = join_ordered_tactic_link( tactic );
      if( ( NIL != jo_link ) )
      {
        return join_ordered_link_focal_mapped_problem( jo_link );
      }
    }
    return NIL;
  }
  /**
   * When a problem has a candidate early removal tactic--one that's
   * join-ordered, who's lookahead problem is complete, and is cheap--don't
   * bother looking for multi literal join ordered tactics (conjunctive removal
   * jo tactics)
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20765)
  public static SubLSymbol $only_add_multi_literal_jo_tactics_when_no_possible_complete_tacticP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 21131)
  public static final SubLObject determine_new_join_ordered_tactics(SubLObject supported_problem, SubLObject dnf_clause)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL == problem_has_a_complete_conjunctive_removal_tacticP( supported_problem ) ) )
      {
        determine_new_single_literal_join_ordered_tactics( supported_problem, dnf_clause );
        {
          SubLObject multi_literal_subclause_specs = NIL;
          {
            SubLObject cdolist_list_var = motivated_followup_multi_literal_subclause_specs_case_1( supported_problem, dnf_clause );
            SubLObject subclause_spec = NIL;
            for( subclause_spec = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first() )
            {
              {
                SubLObject item_var = subclause_spec;
                if( ( NIL == conses_high.member( item_var, multi_literal_subclause_specs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) ) )
                {
                  multi_literal_subclause_specs = cons( item_var, multi_literal_subclause_specs );
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = motivated_followup_multi_literal_subclause_specs_case_2( supported_problem, dnf_clause );
            SubLObject subclause_spec = NIL;
            for( subclause_spec = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first() )
            {
              {
                SubLObject item_var = subclause_spec;
                if( ( NIL == conses_high.member( item_var, multi_literal_subclause_specs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) ) )
                {
                  multi_literal_subclause_specs = cons( item_var, multi_literal_subclause_specs );
                }
              }
            }
          }
          if( ( !( ( ( NIL != $only_add_multi_literal_jo_tactics_when_no_possible_complete_tacticP$.getDynamicValue( thread ) ) && ( NIL != Errors.handleMissingMethodError(
              "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36377" ) ) ) ) ) )
          {
            {
              SubLObject cdolist_list_var = inference_worker_removal.motivated_multi_literal_subclause_specs( dnf_clause );
              SubLObject subclause_spec = NIL;
              for( subclause_spec = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first() )
              {
                {
                  SubLObject item_var = subclause_spec;
                  if( ( NIL == conses_high.member( item_var, multi_literal_subclause_specs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) ) )
                  {
                    multi_literal_subclause_specs = cons( item_var, multi_literal_subclause_specs );
                  }
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = Sequences.nreverse( multi_literal_subclause_specs );
            SubLObject subclause_spec = NIL;
            for( subclause_spec = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first() )
            {
              determine_new_join_ordered_tactic( supported_problem, subclause_spec, dnf_clause );
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 22651)
  public static final SubLObject problem_has_a_complete_conjunctive_removal_tacticP(SubLObject problem)
  {
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
      SubLObject tactic = NIL;
      for( tactic = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first() )
      {
        if( ( ( NIL != inference_datastructures_problem.do_problem_tactics_type_match( tactic, $kw57$REMOVAL_CONJUNCTIVE ) ) && ( NIL != inference_datastructures_problem.do_problem_tactics_completeness_match( tactic,
            $kw58$COMPLETE ) ) ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 23191)
  public static final SubLObject determine_new_single_literal_join_ordered_tactics(SubLObject supported_problem, SubLObject dnf_clause)
  {
    {
      SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP( dnf_clause );
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits( dnf_clause );
        SubLObject contextualized_asent = NIL;
        for( contextualized_asent = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first() )
        {
          {
            SubLObject sense = $kw60$NEG;
            if( ( ( NIL == some_backchain_requiredP ) || ( NIL != inference_trampolines.inference_backchain_required_contextualized_asentP( contextualized_asent ) ) ) )
            {
              determine_new_single_literal_join_ordered_tactic( supported_problem, dnf_clause, sense, index );
            }
          }
          index = Numbers.add( index, ONE_INTEGER );
        }
      }
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits( dnf_clause );
        SubLObject contextualized_asent = NIL;
        for( contextualized_asent = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first() )
        {
          {
            SubLObject sense = $kw61$POS;
            if( ( ( NIL == some_backchain_requiredP ) || ( NIL != inference_trampolines.inference_backchain_required_contextualized_asentP( contextualized_asent ) ) ) )
            {
              determine_new_single_literal_join_ordered_tactic( supported_problem, dnf_clause, sense, index );
            }
          }
          index = Numbers.add( index, ONE_INTEGER );
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 23800)
  public static final SubLObject determine_new_single_literal_join_ordered_tactic(SubLObject supported_problem, SubLObject dnf_clause, SubLObject sense, SubLObject index)
  {
    {
      SubLObject focal_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec( sense, index );
      return determine_new_join_ordered_tactic( supported_problem, focal_supporting_problem_spec, dnf_clause );
    }
  }

  /**
   * @param DNF-CLAUSE; the single clause of SUPPORTED-PROBLEM.
   * @return list of subclause-spec-p; multi-literal subclause specs that should
   *         be considered for the purpose of reusing existing work in the
   *         store.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 24108)
  public static final SubLObject motivated_followup_multi_literal_subclause_specs_case_1(SubLObject supported_problem, SubLObject dnf_clause)
  {
    {
      SubLObject subclause_specs = NIL;
      if( ( NIL != problem_store_followup_query_problem_p( supported_problem ) ) )
      {
        {
          SubLObject store = inference_datastructures_problem.problem_store( supported_problem );
          SubLObject set_contents_var = set.do_set_internal( inference_datastructures_problem_store.problem_store_historical_root_problems( store ) );
          SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
          SubLObject state = NIL;
          for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
              .do_set_contents_update_state( state ) )
          {
            {
              SubLObject other_root_problem = set_contents.do_set_contents_next( basis_object, state );
              if( ( NIL != set_contents.do_set_contents_element_validP( state, other_root_problem ) ) )
              {
                if( ( other_root_problem != supported_problem ) )
                {
                  if( ( NIL != inference_datastructures_problem.multi_literal_problem_p( other_root_problem ) ) )
                  {
                    {
                      SubLObject other_dnf_clause = inference_datastructures_problem.problem_sole_clause( other_root_problem );
                      SubLObject cdolist_list_var = matching_subclause_specs( dnf_clause, other_dnf_clause );
                      SubLObject subclause_spec = NIL;
                      for( subclause_spec = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first() )
                      {
                        {
                          SubLObject item_var = subclause_spec;
                          if( ( NIL == conses_high.member( item_var, subclause_specs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) ) )
                          {
                            subclause_specs = cons( item_var, subclause_specs );
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return subclause_specs;
    }
  }

  /**
   * @return booleanp; whether SUPPORTED-PROBLEM should be considered for
   *         followup-query join-ordered links. Currently we only do this
   *         analysis for root problems when there is at least one other root
   *         problem in the store.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 25100)
  public static final SubLObject problem_store_followup_query_problem_p(SubLObject supported_problem)
  {
    return makeBoolean( ( ( NIL != inference_datastructures_problem.problem_p( supported_problem ) ) && inference_datastructures_problem_store.problem_store_historical_root_problem_count( inference_datastructures_problem
        .problem_store( supported_problem ) ).numGE( TWO_INTEGER ) && ( NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP( supported_problem, $kw62$ANSWER ) ) ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 25613)
  public static final SubLObject motivated_followup_multi_literal_subclause_specs_case_2(SubLObject supported_problem, SubLObject dnf_clause)
  {
    {
      SubLObject subclause_specs = NIL;
      if( ( NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP( dnf_clause ) ) )
      {
        if( ( NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP( supported_problem, $kw63$UNION ) ) )
        {
          {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( supported_problem );
            SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
            SubLObject state = NIL;
            for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
                .do_set_contents_update_state( state ) )
            {
              {
                SubLObject union_link = set_contents.do_set_contents_next( basis_object, state );
                if( ( NIL != set_contents.do_set_contents_element_validP( state, union_link ) ) )
                {
                  if( ( NIL != inference_datastructures_problem_link.problem_link_has_typeP( union_link, $kw63$UNION ) ) )
                  {
                    {
                      SubLObject disjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem( union_link );
                      SubLObject set_contents_var_5 = inference_datastructures_problem.problem_argument_links( disjunction_problem );
                      SubLObject basis_object_6 = set_contents.do_set_contents_basis_object( set_contents_var_5 );
                      SubLObject state_7 = NIL;
                      for( state_7 = set_contents.do_set_contents_initial_state( basis_object_6, set_contents_var_5 ); ( NIL == set_contents.do_set_contents_doneP( basis_object_6, state_7 ) ); state_7 = set_contents
                          .do_set_contents_update_state( state_7 ) )
                      {
                        {
                          SubLObject sibling_union_link = set_contents.do_set_contents_next( basis_object_6, state_7 );
                          if( ( NIL != set_contents.do_set_contents_element_validP( state_7, sibling_union_link ) ) )
                          {
                            if( ( NIL != inference_datastructures_problem_link.problem_link_has_typeP( sibling_union_link, $kw63$UNION ) ) )
                            {
                              if( ( sibling_union_link != union_link ) )
                              {
                                {
                                  SubLObject sibling_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem( sibling_union_link );
                                  if( ( sibling_problem != supported_problem ) )
                                  {
                                    if( ( NIL != inference_datastructures_problem.multi_literal_problem_p( sibling_problem ) ) )
                                    {
                                      {
                                        SubLObject other_dnf_clause = inference_datastructures_problem.problem_sole_clause( sibling_problem );
                                        SubLObject cdolist_list_var = Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36382" );
                                        SubLObject subclause_spec = NIL;
                                        for( subclause_spec = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first() )
                                        {
                                          {
                                            SubLObject subclause = clause_utilities.subclause_specified_by_spec( other_dnf_clause, subclause_spec );
                                            if( ( NIL != inference_worker_split.all_literals_connected_by_shared_varsP( subclause ) ) )
                                            {
                                              {
                                                SubLObject item_var = subclause_spec;
                                                if( ( NIL == conses_high.member( item_var, subclause_specs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) ) )
                                                {
                                                  subclause_specs = cons( item_var, subclause_specs );
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return subclause_specs;
    }
  }

  /**
   * Returns the subclause specs which, if applied to DNF-CLAUSE, would allow it
   * to unify with OTHER-DNF-CLAUSE.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 27088)
  public static final SubLObject matching_subclause_specs(SubLObject dnf_clause, SubLObject other_dnf_clause)
  {
    {
      SubLObject subclause_specs = NIL;
      SubLObject pos_lits = clauses.pos_lits( dnf_clause );
      SubLObject neg_lits = clauses.neg_lits( dnf_clause );
      SubLObject other_pos_lits = clauses.pos_lits( other_dnf_clause );
      SubLObject other_neg_lits = clauses.neg_lits( other_dnf_clause );
      if( ( ( NIL != list_utilities.greater_or_same_length_p( pos_lits, other_pos_lits ) ) && ( NIL != list_utilities.greater_or_same_length_p( neg_lits, other_neg_lits ) ) && ( ( NIL != list_utilities.greater_length_p(
          pos_lits, other_pos_lits ) ) || ( NIL != list_utilities.greater_length_p( neg_lits, other_neg_lits ) ) ) ) )
      {
        {
          SubLObject pos_dict = Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36369" );
          if( ( NIL != pos_dict ) )
          {
            {
              SubLObject neg_dict = Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36370" );
              if( ( NIL != neg_dict ) )
              {
                {
                  SubLObject positive_indices_list = Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36371" );
                  SubLObject negative_indices_list = Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36372" );
                  SubLObject cdolist_list_var = positive_indices_list;
                  SubLObject positive_indices = NIL;
                  for( positive_indices = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), positive_indices = cdolist_list_var.first() )
                  {
                    {
                      SubLObject cdolist_list_var_8 = negative_indices_list;
                      SubLObject negative_indices = NIL;
                      for( negative_indices = cdolist_list_var_8.first(); ( NIL != cdolist_list_var_8 ); cdolist_list_var_8 = cdolist_list_var_8.rest(), negative_indices = cdolist_list_var_8.first() )
                      {
                        {
                          SubLObject candidate_subclause_spec = clause_utilities.new_subclause_spec( negative_indices, positive_indices );
                          SubLObject candidate_subclause = clause_utilities.subclause_specified_by_spec( dnf_clause, candidate_subclause_spec );
                          if( ( NIL != unification.unify( candidate_subclause, other_dnf_clause, UNPROVIDED, UNPROVIDED ) ) )
                          {
                            subclause_specs = cons( candidate_subclause_spec, subclause_specs );
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return subclause_specs;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 30972)
  public static final SubLObject determine_new_join_ordered_tactic(SubLObject supported_problem, SubLObject focal_supporting_problem_spec, SubLObject dnf_clause)
  {
    {
      SubLObject store = inference_datastructures_problem.problem_store( supported_problem );
      SubLObject focal_mapped_problem = find_or_create_join_ordered_focal_mapped_problem( store, dnf_clause, focal_supporting_problem_spec );
      SubLObject non_focal_mapped_problem = NIL;
      SubLObject jo_link = maybe_new_join_ordered_link( supported_problem, focal_mapped_problem, non_focal_mapped_problem );
      new_join_ordered_tactic( jo_link, focal_supporting_problem_spec );
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 31544)
  public static final SubLObject find_or_create_join_ordered_focal_mapped_problem(SubLObject store, SubLObject dnf_clause, SubLObject focal_supporting_problem_spec)
  {
    return inference_worker.find_or_create_problem_from_subclause_spec( store, dnf_clause, focal_supporting_problem_spec );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 31760)
  public static final SubLObject find_or_create_join_ordered_non_focal_mapped_problem(SubLObject store, SubLObject dnf_clause, SubLObject focal_supporting_problem_spec)
  {
    return inference_worker.find_or_create_problem_without_subclause_spec( store, dnf_clause, focal_supporting_problem_spec );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 31983)
  public static final SubLObject lazily_create_join_ordered_link_non_focal_mapped_problem(SubLObject join_ordered_link)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL == inference_datastructures_problem_store.$problem_store_modification_permittedP$.getDynamicValue( thread ) ) )
      {
        return NIL;
      }
      {
        SubLObject focal_openP = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP( join_ordered_link );
        SubLObject store = inference_datastructures_problem_link.problem_link_store( join_ordered_link );
        SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause( inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link ) );
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
        SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause( focal_problem );
        SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
        SubLObject focal_clause_wrt_supported = bindings.apply_bindings( focal_variable_map, focal_clause );
        SubLObject focal_supporting_problem_spec = clause_utilities.subclause_spec_from_clauses( supported_clause, focal_clause_wrt_supported );
        SubLObject non_focal_supporting_mapped_problem = find_or_create_join_ordered_non_focal_mapped_problem( store, supported_clause, focal_supporting_problem_spec );
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( non_focal_supporting_mapped_problem, join_ordered_link );
        if( ( NIL != focal_openP ) )
        {
          inference_datastructures_problem_link.problem_link_close_all( join_ordered_link );
          inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem( join_ordered_link, focal_mapped_problem );
        }
        inference_worker.propagate_problem_link( join_ordered_link );
        return non_focal_supporting_mapped_problem;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 33892)
  public static final SubLObject compute_strategic_properties_of_join_ordered_tactic(SubLObject tactic, SubLObject strategy)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject jo_link = join_ordered_tactic_link( tactic );
        if( ( NIL == preference_modules.preference_level_p( inference_datastructures_tactic.tactic_preference_level( tactic ) ) ) )
        {
          thread.resetMultipleValues();
          {
            SubLObject join_ordered_preference_level = compute_join_ordered_tactic_preference_level( jo_link, $kw65$TACTICAL );
            SubLObject preference_level_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level( tactic, join_ordered_preference_level, preference_level_justification );
          }
        }
        thread.resetMultipleValues();
        {
          SubLObject preference_level = compute_join_ordered_tactic_preference_level( jo_link, strategy );
          SubLObject justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          inference_datastructures_strategy.set_tactic_strategic_preference_level( tactic, strategy, preference_level, justification );
        }
        {
          SubLObject productivity = compute_join_ordered_tactic_productivity( jo_link, strategy );
          inference_datastructures_strategy.set_tactic_strategic_productivity( tactic, strategy, productivity );
        }
      }
      return tactic;
    }
  }

  /**
   * The productivity of a :join-ordered tactic is twice the productivity of its
   * focal subproblem
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 34831)
  public static final SubLObject compute_join_ordered_tactic_productivity(SubLObject jo_link, SubLObject strategy)
  {
    checkType( jo_link, $sym53$JOIN_ORDERED_LINK_P );
    checkType( strategy, $sym66$STRATEGY_P );
    return inference_lookahead_productivity.memoized_problem_max_removal_productivity( join_ordered_link_focal_problem( jo_link ), strategy );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 35190)
  public static final SubLObject compute_join_ordered_tactic_preference_level(SubLObject jo_link, SubLObject strategic_context)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject focal_problem = join_ordered_link_focal_problem( jo_link );
        SubLObject shared_variables = focal_vars_shared_by_non_focal( jo_link );
        thread.resetMultipleValues();
        {
          SubLObject join_ordered_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level( focal_problem, strategic_context, shared_variables );
          SubLObject preference_level_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return Values.values( join_ordered_preference_level, preference_level_justification );
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 35680)
  public static final SubLObject execute_join_ordered_tactic(SubLObject tactic)
  {
    {
      SubLObject focal_mapped_problem = find_or_create_join_ordered_tactic_focal_mapped_problem( tactic );
      SubLObject join_ordered_link = join_ordered_tactic_link( tactic );
      inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem( join_ordered_link, focal_mapped_problem );
      inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_join_ordered_link( join_ordered_link );
    }
    if( ( NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP( tactic, $kw65$TACTICAL ) ) )
    {
      if( ( !( ( ( NIL != inference_tactician.better_term_chosen_handlingP() ) && ( NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP( inference_datastructures_tactic.tactic_store(
          tactic ) ) ) ) ) ) )
      {
        inference_worker.discard_all_other_possible_structural_conjunctive_tactics( tactic );
      }
    }
    consider_strategic_ramifications_of_tactic_preference_level( tactic );
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 36642)
  public static final SubLObject consider_strategic_ramifications_of_tactic_preference_level(SubLObject tactic)
  {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
      SubLObject prob = problem;
      SubLObject store = inference_datastructures_problem.problem_store( prob );
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
      if( ( NIL == id_index.id_index_objects_empty_p( idx, $kw56$SKIP ) ) )
      {
        {
          SubLObject idx_10 = idx;
          if( ( NIL == id_index.id_index_old_objects_empty_p( idx_10, $kw56$SKIP ) ) )
          {
            {
              SubLObject vector_var = id_index.id_index_old_objects( idx_10 );
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length( vector_var );
              SubLObject v_iteration = NIL;
              for( v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                {
                  SubLObject id = ( ( NIL != backwardP_var ) ? ( (SubLObject) Numbers.subtract( length, v_iteration, ONE_INTEGER ) ) : v_iteration );
                  SubLObject inference = Vectors.aref( vector_var, id );
                  if( ( !( ( ( NIL != id_index.id_index_tombstone_p( inference ) ) && ( NIL != id_index.id_index_skip_tombstones_p( $kw56$SKIP ) ) ) ) ) )
                  {
                    if( ( NIL != id_index.id_index_tombstone_p( inference ) ) )
                    {
                      inference = $kw56$SKIP;
                    }
                    if( ( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) ) )
                    {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal( inference_datastructures_inference.inference_strategy_set( inference_var ) );
                        SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
                        SubLObject state = NIL;
                        for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
                            .do_set_contents_update_state( state ) )
                        {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next( basis_object, state );
                            if( ( NIL != set_contents.do_set_contents_element_validP( state, strategy ) ) )
                            {
                              if( ( NIL != inference_datastructures_strategy.tactic_strategically_preferredP( tactic, strategy ) ) )
                              {
                                inference_worker.possibly_note_problem_pending( inference_datastructures_tactic.tactic_problem( tactic ), strategy );
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_11 = idx;
          if( ( NIL == id_index.id_index_new_objects_empty_p( idx_11 ) ) )
          {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects( idx_11 );
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
                try
                {
                  while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                  {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                    id = Hashtables.getEntryKey( cdohash_entry );
                    inference = Hashtables.getEntryValue( cdohash_entry );
                    if( ( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) ) )
                    {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal( inference_datastructures_inference.inference_strategy_set( inference_var ) );
                        SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
                        SubLObject state = NIL;
                        for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
                            .do_set_contents_update_state( state ) )
                        {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next( basis_object, state );
                            if( ( NIL != set_contents.do_set_contents_element_validP( state, strategy ) ) )
                            {
                              if( ( NIL != inference_datastructures_strategy.tactic_strategically_preferredP( tactic, strategy ) ) )
                              {
                                inference_worker.possibly_note_problem_pending( inference_datastructures_tactic.tactic_problem( tactic ), strategy );
                              }
                            }
                          }
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
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 36988)
  public static final SubLObject join_ordered_tactic_lookahead_problem(SubLObject join_ordered_tactic)
  {
    {
      SubLObject focal_mapped_problem = find_or_create_join_ordered_tactic_focal_mapped_problem( join_ordered_tactic );
      return inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
    }
  }

  /**
   * @return 0 proof-p
   * @return 1 whether the returned proof was newly created
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 37294)
  public static final SubLObject new_join_ordered_proof(SubLObject join_ordered_link, SubLObject subproofs_with_sub_bindings)
  {
    return new_conjunctive_proof( join_ordered_link, subproofs_with_sub_bindings );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 37621)
  public static final SubLObject join_ordered_proof_p(SubLObject object)
  {
    return makeBoolean( ( ( NIL != inference_datastructures_proof.proof_p( object ) ) && ( $kw18$JOIN_ORDERED == inference_datastructures_proof.proof_type( object ) ) ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 37748)
  public static final SubLObject connected_conjunction_proof_p(SubLObject object)
  {
    return makeBoolean( ( ( NIL != join_ordered_proof_p( object ) ) || ( NIL != inference_worker_join.join_proof_p( object ) ) ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 37878)
  public static final SubLObject new_conjunctive_proof(SubLObject conjunctive_link, SubLObject subproofs_with_sub_bindings)
  {
    {
      SubLObject proof_bindings = NIL;
      SubLObject subproofs = NIL;
      SubLObject cdolist_list_var = subproofs_with_sub_bindings;
      SubLObject subproof_with_sub_bindings = NIL;
      for( subproof_with_sub_bindings = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), subproof_with_sub_bindings = cdolist_list_var.first() )
      {
        {
          SubLObject datum = subproof_with_sub_bindings;
          SubLObject current = datum;
          SubLObject subproof = NIL;
          SubLObject sub_proof_bindings = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
          subproof = current.first();
          current = current.rest();
          sub_proof_bindings = current;
          proof_bindings = ConsesLow.nconc( conses_high.copy_list( sub_proof_bindings ), proof_bindings );
          subproofs = cons( subproof, subproofs );
        }
      }
      subproofs = Sequences.nreverse( subproofs );
      proof_bindings = inference_worker.ncanonicalize_proof_bindings( proof_bindings );
      return inference_worker.propose_new_proof_with_bindings( conjunctive_link, proof_bindings, subproofs );
    }
  }

  /** @param TRIGGER-PROOF-BINDINGS; trigger problem's variables -> answers */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 38675)
  public static final SubLObject compute_sibling_proof_bindings(SubLObject trigger_proof_bindings, SubLObject join_ordered_link, SubLObject trigger_is_focalP)
  {
    {
      SubLObject trigger_to_sibling_variable_map = trigger_to_sibling_variable_map( join_ordered_link, trigger_is_focalP );
      SubLObject sibling_proof_bindings = bindings.transfer_variable_map_to_bindings_filtered( trigger_to_sibling_variable_map, trigger_proof_bindings );
      return sibling_proof_bindings;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 39314)
  public static final SubLObject focal_to_non_focal_variable_map_internal(SubLObject join_ordered_link)
  {
    {
      SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
      SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem( join_ordered_link );
      SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
      SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( non_focal_mapped_problem );
      SubLObject supported_to_non_focal_variable_map = bindings.invert_bindings( non_focal_variable_map );
      SubLObject focal_to_non_focal_variable_map = bindings.compose_bindings_filtered( focal_variable_map, supported_to_non_focal_variable_map );
      return focal_to_non_focal_variable_map;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 39314)
  public static final SubLObject focal_to_non_focal_variable_map(SubLObject join_ordered_link)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
        SubLObject caching_state = NIL;
        if( ( NIL == v_memoization_state ) )
        {
          return focal_to_non_focal_variable_map_internal( join_ordered_link );
        }
        caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym68$FOCAL_TO_NON_FOCAL_VARIABLE_MAP, UNPROVIDED );
        if( ( NIL == caching_state ) )
        {
          caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym68$FOCAL_TO_NON_FOCAL_VARIABLE_MAP, ONE_INTEGER, NIL, EQ, UNPROVIDED );
          memoization_state.memoization_state_put( v_memoization_state, $sym68$FOCAL_TO_NON_FOCAL_VARIABLE_MAP, caching_state );
        }
        {
          SubLObject results = memoization_state.caching_state_lookup( caching_state, join_ordered_link, $kw69$_MEMOIZED_ITEM_NOT_FOUND_ );
          if( ( results == $kw69$_MEMOIZED_ITEM_NOT_FOUND_ ) )
          {
            results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( focal_to_non_focal_variable_map_internal( join_ordered_link ) ) );
            memoization_state.caching_state_put( caching_state, join_ordered_link, results, UNPROVIDED );
          }
          return memoization_state.caching_results( results );
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40282)
  public static final SubLObject non_focal_to_focal_variable_map_internal(SubLObject join_ordered_link)
  {
    return bindings.invert_bindings( focal_to_non_focal_variable_map( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40282)
  public static final SubLObject non_focal_to_focal_variable_map(SubLObject join_ordered_link)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
        SubLObject caching_state = NIL;
        if( ( NIL == v_memoization_state ) )
        {
          return non_focal_to_focal_variable_map_internal( join_ordered_link );
        }
        caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym70$NON_FOCAL_TO_FOCAL_VARIABLE_MAP, UNPROVIDED );
        if( ( NIL == caching_state ) )
        {
          caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym70$NON_FOCAL_TO_FOCAL_VARIABLE_MAP, ONE_INTEGER, NIL, EQ, UNPROVIDED );
          memoization_state.memoization_state_put( v_memoization_state, $sym70$NON_FOCAL_TO_FOCAL_VARIABLE_MAP, caching_state );
        }
        {
          SubLObject results = memoization_state.caching_state_lookup( caching_state, join_ordered_link, $kw69$_MEMOIZED_ITEM_NOT_FOUND_ );
          if( ( results == $kw69$_MEMOIZED_ITEM_NOT_FOUND_ ) )
          {
            results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( non_focal_to_focal_variable_map_internal( join_ordered_link ) ) );
            memoization_state.caching_state_put( caching_state, join_ordered_link, results, UNPROVIDED );
          }
          return memoization_state.caching_results( results );
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40464)
  public static final SubLObject trigger_to_sibling_variable_map(SubLObject join_ordered_link, SubLObject trigger_is_focalP)
  {
    return ( ( NIL != trigger_is_focalP ) ? ( (SubLObject) focal_to_non_focal_variable_map( join_ordered_link ) ) : non_focal_to_focal_variable_map( join_ordered_link ) );
  }

  /**
   * @return binding-list-p; non-focal-problem-vars -> restriction. i.e. a
   *         transformation of FOCAL-BINDINGS into the space of
   *         JOIN-ORDERED-LINK's non-focal-problem. These will be bindings to
   *         substitute into JOIN-ORDERED-LINK's non-focal-problem to restrict
   *         it.
   * @param FOCAL-RESTRICTION-BINDINGS binding-list-p; focal-problem-vars ->
   *        restriction. i.e. bindings to substitute into JOIN-ORDERED-LINK's
   *        focal problem to restrict it.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40698)
  public static final SubLObject focal_bindings_to_non_focal_bindings(SubLObject focal_restriction_bindings, SubLObject join_ordered_link)
  {
    {
      SubLObject focal_to_non_focal_variable_map = focal_to_non_focal_variable_map( join_ordered_link );
      SubLObject non_focal_restriction_bindings = bindings.transfer_variable_map_to_bindings_filtered( focal_to_non_focal_variable_map, focal_restriction_bindings );
      return non_focal_restriction_bindings;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 42453)
  public static final SubLObject bubble_up_proof_to_join_ordered_link(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_ordered_link)
  {
    {
      SubLObject trigger_is_focalP = mapped_proof_is_focalP( trigger_subproof, variable_map, join_ordered_link );
      add_join_ordered_link_proof( join_ordered_link, trigger_subproof, trigger_is_focalP );
      if( ( NIL == trigger_is_focalP ) )
      {
        bubble_up_proof_to_join_ordered_link_int( trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP );
      }
      else
      {
        {
          SubLObject restricted_non_focal_mapped_problem = trigger_split_restriction( join_ordered_link, trigger_subproof );
          bubble_up_proof_to_join_ordered_link_int( trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP );
          if( ( NIL != restricted_non_focal_mapped_problem ) )
          {
            {
              SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem( restricted_non_focal_mapped_problem );
              SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link );
              SubLObject prob = supported_problem;
              SubLObject store = inference_datastructures_problem.problem_store( prob );
              SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
              if( ( NIL == id_index.id_index_objects_empty_p( idx, $kw56$SKIP ) ) )
              {
                {
                  SubLObject idx_12 = idx;
                  if( ( NIL == id_index.id_index_old_objects_empty_p( idx_12, $kw56$SKIP ) ) )
                  {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects( idx_12 );
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length( vector_var );
                      SubLObject v_iteration = NIL;
                      for( v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                      {
                        {
                          SubLObject id = ( ( NIL != backwardP_var ) ? ( (SubLObject) Numbers.subtract( length, v_iteration, ONE_INTEGER ) ) : v_iteration );
                          SubLObject inference = Vectors.aref( vector_var, id );
                          if( ( !( ( ( NIL != id_index.id_index_tombstone_p( inference ) ) && ( NIL != id_index.id_index_skip_tombstones_p( $kw56$SKIP ) ) ) ) ) )
                          {
                            if( ( NIL != id_index.id_index_tombstone_p( inference ) ) )
                            {
                              inference = $kw56$SKIP;
                            }
                            if( ( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) ) )
                            {
                              {
                                SubLObject inference_var = inference;
                                SubLObject set_contents_var = set.do_set_internal( inference_datastructures_inference.inference_strategy_set( inference_var ) );
                                SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
                                SubLObject state = NIL;
                                for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
                                    .do_set_contents_update_state( state ) )
                                {
                                  {
                                    SubLObject strategy = set_contents.do_set_contents_next( basis_object, state );
                                    if( ( NIL != set_contents.do_set_contents_element_validP( state, strategy ) ) )
                                    {
                                      inference_worker.maybe_possibly_activate_problem( strategy, restricted_non_focal_problem );
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  SubLObject idx_13 = idx;
                  if( ( NIL == id_index.id_index_new_objects_empty_p( idx_13 ) ) )
                  {
                    {
                      SubLObject cdohash_table = id_index.id_index_new_objects( idx_13 );
                      SubLObject id = NIL;
                      SubLObject inference = NIL;
                      {
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
                        try
                        {
                          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                          {
                            final Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                            id = Hashtables.getEntryKey( cdohash_entry );
                            inference = Hashtables.getEntryValue( cdohash_entry );
                            if( ( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) ) )
                            {
                              {
                                SubLObject inference_var = inference;
                                SubLObject set_contents_var = set.do_set_internal( inference_datastructures_inference.inference_strategy_set( inference_var ) );
                                SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
                                SubLObject state = NIL;
                                for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents
                                    .do_set_contents_update_state( state ) )
                                {
                                  {
                                    SubLObject strategy = set_contents.do_set_contents_next( basis_object, state );
                                    if( ( NIL != set_contents.do_set_contents_element_validP( state, strategy ) ) )
                                    {
                                      inference_worker.maybe_possibly_activate_problem( strategy, restricted_non_focal_problem );
                                    }
                                  }
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
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 43635)
  public static final SubLObject trigger_split_restriction(SubLObject join_ordered_link, SubLObject focal_problem_proof)
  {
    if( ( NIL == focal_problem_is_a_single_literal_backchain_requiredP( join_ordered_link ) ) )
    {
      return find_or_create_split_restriction_int( join_ordered_link, focal_problem_proof, T );
    }
    return NIL;
  }

  /**
   * @return mapped-problem-p; a restricted form of JOIN-ORDERED-LINK's
   *         non-focal problem, restricted according to
   *         FOCAL-RESTRICTION-BINDINGS modulo some substitution, with a
   *         variable map of the form: restricted non-focal problem vars ->
   *         non-focal problem vars
   * @param FOCAL-PROBLEM-PROOF; the proof that triggered the split-restriction
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44222)
  public static final SubLObject find_or_create_split_restriction_int(SubLObject join_ordered_link, SubLObject focal_problem_proof, SubLObject createP)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject focal_restriction_bindings = inference_datastructures_proof.proof_bindings( focal_problem_proof );
        SubLObject non_focal_restriction_bindings = focal_bindings_to_non_focal_bindings( focal_restriction_bindings, join_ordered_link );
        thread.resetMultipleValues();
        {
          SubLObject restricted_non_focal_mapped_problem = find_or_create_restricted_non_focal_problem_int( join_ordered_link, non_focal_restriction_bindings, createP );
          SubLObject restricted_non_focal_link = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( ( NIL != restricted_non_focal_link ) )
          {
            add_join_ordered_link_restricted_non_focal_link( join_ordered_link, restricted_non_focal_link, focal_problem_proof );
          }
          return restricted_non_focal_mapped_problem;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 45423)
  public static final SubLObject note_all_triggering_proofs_processed(SubLObject restriction_link)
  {
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( restriction_link );
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( supported_problem );
      SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
      SubLObject state = NIL;
      for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( NIL == set_contents.do_set_contents_doneP( basis_object, state ) ); state = set_contents.do_set_contents_update_state(
          state ) )
      {
        {
          SubLObject join_ordered_link = set_contents.do_set_contents_next( basis_object, state );
          if( ( NIL != set_contents.do_set_contents_element_validP( state, join_ordered_link ) ) )
          {
            if( ( NIL != inference_datastructures_problem_link.problem_link_has_typeP( join_ordered_link, $kw18$JOIN_ORDERED ) ) )
            {
              note_restricted_non_focal_finished( join_ordered_link, restriction_link );
            }
          }
        }
      }
    }
    return NIL;
  }

  /** look up the proof from the index on the jo-link and note it processed */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 45685)
  public static final SubLObject note_restricted_non_focal_finished(SubLObject join_ordered_link, SubLObject restriction_link)
  {
    {
      SubLObject proof = join_ordered_link_restricted_non_focal_triggering_proof( join_ordered_link, restriction_link );
      if( ( NIL != proof ) )
      {
        inference_worker.possibly_note_proof_processed( proof );
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 46473)
  public static final SubLObject find_or_create_restricted_non_focal_problem_int(SubLObject join_ordered_link, SubLObject non_focal_restriction_bindings, SubLObject creation_allowedP)
  {
    {
      SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem( join_ordered_link_non_focal_mapped_problem( join_ordered_link ) );
      return find_or_create_restricted_problem_and_link_int( non_focal_problem, non_focal_restriction_bindings, creation_allowedP );
    }
  }

  /**
   * @param RESTRICTION-BINDINGS binding-list-p; UNRESTRICTED-PROBLEM's vars ->
   *        restriction. i.e. bindings to substitute into UNRESTRICTED-PROBLEM
   *        to restrict it.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 47051)
  public static final SubLObject find_or_create_restricted_problem_and_link_int(SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject creation_allowedP)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) ) )
      {
        if( ( NIL == restriction_bindings ) )
        {
          Errors.error( $str71$Finding_or_creating_a_restricted_, unrestricted_problem );
        }
      }
      {
        SubLObject restricted_mapped_problem = find_or_create_restricted_problem_int( unrestricted_problem, restriction_bindings, creation_allowedP );
        SubLObject restriction_link = NIL;
        if( ( NIL != creation_allowedP ) )
        {
          restriction_link = inference_worker_restriction.maybe_new_restriction_link( unrestricted_problem, restricted_mapped_problem, restriction_bindings, UNPROVIDED, UNPROVIDED );
        }
        return Values.values( restricted_mapped_problem, restriction_link );
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 47842)
  public static final SubLObject find_or_create_restricted_problem(SubLObject unrestricted_problem, SubLObject restriction_bindings)
  {
    return find_or_create_restricted_problem_int( unrestricted_problem, restriction_bindings, T );
  }

  /**
   * @param RESTRICTION-BINDINGS binding-list-p; UNRESTRICTED-PROBLEM's vars ->
   *        restriction. i.e. bindings to substitute into UNRESTRICTED-PROBLEM
   *        to restrict it.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48076)
  public static final SubLObject find_or_create_restricted_problem_int(SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject creation_allowedP)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) ) )
      {
        if( ( NIL == restriction_bindings ) )
        {
          Errors.error( $str72$Creating_a_restricted_problem_of_, unrestricted_problem );
        }
      }
      {
        SubLObject query = inference_datastructures_problem.problem_query( unrestricted_problem );
        SubLObject restricted_query = bindings.apply_bindings( restriction_bindings, query );
        SubLObject store = inference_datastructures_problem.problem_store( unrestricted_problem );
        SubLObject restricted_mapped_problem = ( ( NIL != creation_allowedP ) ? ( (SubLObject) inference_worker.find_or_create_problem( store, restricted_query, UNPROVIDED ) )
            : Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35228" ) );
        return restricted_mapped_problem;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48843)
  public static final SubLObject focal_problem_is_a_single_literal_backchain_requiredP(SubLObject join_ordered_link)
  {
    {
      SubLObject focal_problem = join_ordered_link_focal_problem( join_ordered_link );
      return makeBoolean( ( ( NIL != inference_datastructures_problem.single_literal_problem_p( focal_problem ) ) && ( NIL != inference_trampolines.problem_backchain_requiredP( focal_problem ) ) ) );
    }
  }

  /**
   * @return booleanp; whether RESTRICTION-LINK supports a restricted non-focal
   *         problem wrt JOIN-ORDERED-LINK. It checks this by looking for a
   *         corresponding proof of the focal problem of JOIN-ORDERED-LINK with
   *         the same bindings (modulo variable map) as RESTRICTION-LINK.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 52026)
  public static final SubLObject non_focal_restriction_link_with_corresponding_focal_proofP(SubLObject restriction_link, SubLObject join_ordered_link)
  {
    return join_ordered_link_restricted_non_focal_linkP( join_ordered_link, restriction_link );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 55051)
  public static final SubLObject mapped_proof_is_focalP(SubLObject subproof, SubLObject proof_variable_map, SubLObject join_ordered_link)
  {
    {
      SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
      SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
      SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem( subproof );
      if( ( focal_problem == subproof_supported_problem ) )
      {
        {
          SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
          if( ( NIL != bindings.bindings_equalP( focal_variable_map, proof_variable_map ) ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  /**
   * The variables in the trigger problem of JOIN-ORDERED-LINK which are also
   * shared by the sibling problem (modulo variable maps)
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 55710)
  public static final SubLObject trigger_vars_shared_by_sibling_internal(SubLObject join_ordered_link, SubLObject trigger_is_focalP)
  {
    {
      SubLObject trigger_to_sibling_variable_map = trigger_to_sibling_variable_map( join_ordered_link, trigger_is_focalP );
      return Mapping.mapcar( $sym75$VARIABLE_BINDING_VARIABLE, trigger_to_sibling_variable_map );
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 55710)
  public static final SubLObject trigger_vars_shared_by_sibling(SubLObject join_ordered_link, SubLObject trigger_is_focalP)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
        SubLObject caching_state = NIL;
        if( ( NIL == v_memoization_state ) )
        {
          return trigger_vars_shared_by_sibling_internal( join_ordered_link, trigger_is_focalP );
        }
        caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym74$TRIGGER_VARS_SHARED_BY_SIBLING, UNPROVIDED );
        if( ( NIL == caching_state ) )
        {
          caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym74$TRIGGER_VARS_SHARED_BY_SIBLING, TWO_INTEGER, NIL, EQ, UNPROVIDED );
          memoization_state.memoization_state_put( v_memoization_state, $sym74$TRIGGER_VARS_SHARED_BY_SIBLING, caching_state );
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2( join_ordered_link, trigger_is_focalP );
          SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
          if( ( collisions != $kw69$_MEMOIZED_ITEM_NOT_FOUND_ ) )
          {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for( collision = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first() )
              {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second( collision );
                  if( ( join_ordered_link == cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( ( ( NIL != cached_args ) && ( NIL == cached_args.rest() ) && ( trigger_is_focalP == cached_args.first() ) ) )
                    {
                      return memoization_state.caching_results( results2 );
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( trigger_vars_shared_by_sibling_internal( join_ordered_link, trigger_is_focalP ) ) );
            memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results, list( join_ordered_link, trigger_is_focalP ) );
            return memoization_state.caching_results( results );
          }
        }
      }
    }
  }

  /** This is complicated to avoid unnecessarily manifesting non-focals. */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 56310)
  public static final SubLObject focal_vars_shared_by_non_focal(SubLObject join_ordered_link)
  {
    {
      SubLObject tactic = join_ordered_link_tactic( join_ordered_link );
      SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem( join_ordered_link );
      SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause( inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem ) );
      SubLObject focal_supporting_problem_spec = join_ordered_tactic_focal_supporting_problem_spec( tactic );
      SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause( inference_datastructures_problem_link.problem_link_supported_problem( join_ordered_link ) );
      SubLObject non_focal_clause = clause_utilities.complement_of_subclause_specified_by_spec( dnf_clause, focal_supporting_problem_spec );
      SubLObject non_focal_vars = list_utilities.tree_gather( non_focal_clause, Symbols.symbol_function( $sym76$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject focal_focal_vars = list_utilities.tree_gather( focal_clause, Symbols.symbol_function( $sym76$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject focal_vars = bindings.apply_bindings( inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem ), focal_focal_vars );
      SubLObject shared_vars = conses_high.intersection( focal_vars, non_focal_vars, Symbols.symbol_function( EQ ), UNPROVIDED );
      SubLObject focal_shared_vars = bindings.apply_bindings_backwards( inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem ), shared_vars );
      return focal_shared_vars;
    }
  }

  /**
   * @note TRIGGER-PROOF must be a :proven proof, because otherwise it would not
   *       have bubbled up to JOIN-ORDERED-LINK.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 58803)
  public static final SubLObject add_join_ordered_link_proof(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_is_focalP)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) ) )
      {
        if( ( NIL == inference_datastructures_proof.proof_provenP( trigger_proof ) ) )
        {
          Errors.error( $str77$_a_was_a_rejected_proof, trigger_proof );
        }
      }
      {
        SubLObject shared_trigger_proof_bindings = join_ordered_link_shared_proof_bindings( join_ordered_link, trigger_proof, trigger_is_focalP );
        if( ( NIL != trigger_is_focalP ) )
        {
          add_join_ordered_link_focal_proof( join_ordered_link, shared_trigger_proof_bindings, trigger_proof );
        }
        else
        {
          add_join_ordered_link_non_focal_proof( join_ordered_link, shared_trigger_proof_bindings, trigger_proof );
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 59623)
  public static final SubLObject join_ordered_link_shared_proof_bindings(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_is_focalP)
  {
    {
      SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings( trigger_proof );
      return join_ordered_link_shared_proof_bindings_int( join_ordered_link, trigger_proof_bindings, trigger_is_focalP );
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60879)
  public static final SubLObject join_ordered_link_shared_proof_bindings_int(SubLObject join_ordered_link, SubLObject trigger_proof_bindings, SubLObject trigger_is_focalP)
  {
    {
      SubLObject trigger_vars_shared_by_sibling = trigger_vars_shared_by_sibling( join_ordered_link, trigger_is_focalP );
      SubLObject shared_trigger_proof_bindings = bindings.filter_bindings_by_variables( trigger_proof_bindings, trigger_vars_shared_by_sibling );
      return shared_trigger_proof_bindings;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 61549)
  public static final SubLObject join_ordered_link_sibling_proofs_lookup(SubLObject join_ordered_link, SubLObject sibling_proof_bindings, SubLObject trigger_is_focalP)
  {
    return ( ( NIL != trigger_is_focalP ) ? ( (SubLObject) join_ordered_link_non_focal_proofs_lookup( join_ordered_link, sibling_proof_bindings ) )
        : join_ordered_link_focal_proofs_lookup( join_ordered_link, sibling_proof_bindings ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 61948)
  public static final SubLObject bubble_up_proof_to_join_ordered_link_int(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_ordered_link, SubLObject trigger_is_focalP)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject proofs = NIL;
        SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings( trigger_subproof );
        SubLObject sibling_proof_bindings = compute_sibling_proof_bindings( trigger_proof_bindings, join_ordered_link, trigger_is_focalP );
        SubLObject sibling_proofs = list_utilities.remove_if_not( $sym78$PROOF_PROVEN_, join_ordered_link_sibling_proofs_lookup( join_ordered_link, sibling_proof_bindings, trigger_is_focalP ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED );
        if( ( NIL != sibling_proofs ) )
        {
          {
            SubLObject sibling_mapped_problem = join_ordered_link_sibling_mapped_problem( join_ordered_link, trigger_is_focalP );
            SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( sibling_mapped_problem );
            SubLObject sibling_proofs_with_bindings = NIL;
            {
              SubLObject cdolist_list_var = sibling_proofs;
              SubLObject sibling_proof = NIL;
              for( sibling_proof = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), sibling_proof = cdolist_list_var.first() )
              {
                {
                  SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings( sibling_variable_map, inference_datastructures_proof.proof_bindings( sibling_proof ) );
                  sibling_proofs_with_bindings = cons( cons( sibling_proof, sibling_sub_proof_bindings ), sibling_proofs_with_bindings );
                }
              }
            }
            sibling_proofs_with_bindings = Sequences.nreverse( sibling_proofs_with_bindings );
            {
              SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings( variable_map, trigger_proof_bindings );
              SubLObject supporting_mapped_proof_lists_by_supporting_problem = ( ( NIL != trigger_is_focalP ) ? ( (SubLObject) list( list( cons( trigger_subproof, trigger_sub_proof_bindings ) ),
                  sibling_proofs_with_bindings ) ) : list( sibling_proofs_with_bindings, list( cons( trigger_subproof, trigger_sub_proof_bindings ) ) ) );
              SubLObject mapped_subproof_lists = list_utilities.cartesian_product( supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject cdolist_list_var = mapped_subproof_lists;
              SubLObject mapped_subproof_list = NIL;
              for( mapped_subproof_list = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), mapped_subproof_list = cdolist_list_var.first() )
              {
                thread.resetMultipleValues();
                {
                  SubLObject proof = new_join_ordered_proof( join_ordered_link, mapped_subproof_list );
                  SubLObject newP = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( ( NIL != newP ) )
                  {
                    proofs = cons( proof, proofs );
                  }
                  else
                  {
                    inference_worker.possibly_note_proof_processed( trigger_subproof );
                  }
                }
              }
            }
          }
          proofs = Sequences.nreverse( proofs );
          {
            SubLObject cdolist_list_var = proofs;
            SubLObject proof = NIL;
            for( proof = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first() )
            {
              inference_worker.bubble_up_proof( proof );
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 64249)
  public static final SubLObject join_ordered_link_sibling_mapped_problem(SubLObject join_ordered_link, SubLObject trigger_is_focalP)
  {
    return ( ( NIL != trigger_is_focalP ) ? ( (SubLObject) join_ordered_link_non_focal_mapped_problem( join_ordered_link ) ) : join_ordered_link_focal_mapped_problem( join_ordered_link ) );
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 64510)
  public static final SubLObject join_ordered_link_could_be_finishedP(SubLObject jo_link, SubLObject strategic_context)
  {
    {
      SubLObject unfinishedP = makeBoolean( ( NIL == inference_worker.finished_problem_p( join_ordered_link_focal_problem( jo_link ), strategic_context ) ) );
      if( ( NIL != join_ordered_link_non_focal_manifestedP( jo_link ) ) )
      {
        {
          SubLObject link_var = jo_link;
          SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( join_ordered_link_non_focal_problem( link_var ) );
          SubLObject basis_object = set_contents.do_set_contents_basis_object( set_contents_var );
          SubLObject state = NIL;
          for( state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); ( !( ( ( NIL != unfinishedP ) || ( NIL != set_contents.do_set_contents_doneP( basis_object,
              state ) ) ) ) ); state = set_contents.do_set_contents_update_state( state ) )
          {
            {
              SubLObject restriction_link = set_contents.do_set_contents_next( basis_object, state );
              if( ( NIL != set_contents.do_set_contents_element_validP( state, restriction_link ) ) )
              {
                if( ( NIL != inference_datastructures_problem_link.problem_link_has_typeP( restriction_link, $kw40$RESTRICTION ) ) )
                {
                  if( ( NIL != non_focal_restriction_link_with_corresponding_focal_proofP( restriction_link, link_var ) ) )
                  {
                    {
                      SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem( restriction_link );
                      unfinishedP = makeBoolean( ( NIL == inference_worker.finished_problem_p( restricted_non_focal_problem, strategic_context ) ) );
                    }
                  }
                }
              }
            }
          }
        }
      }
      return makeBoolean( ( NIL == unfinishedP ) );
    }
  }

  /**
   * @return booleanp; whether JOIN-ORDERED-LINK's non-focal problem has an
   *         unbound predicate that would be bound by its focal problem.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 66775)
  public static final SubLObject join_ordered_link_with_non_focal_unbound_predicateP(SubLObject join_ordered_link)
  {
    {
      SubLObject non_focal_problem = join_ordered_link_non_focal_problem( join_ordered_link );
      SubLObject non_focal_query = inference_datastructures_problem.problem_query( non_focal_problem );
      SubLObject cdolist_list_var = non_focal_query;
      SubLObject contextualized_clause = NIL;
      for( contextualized_clause = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), contextualized_clause = cdolist_list_var.first() )
      {
        {
          SubLObject sense = $kw60$NEG;
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_14 = clauses.neg_lits( contextualized_clause );
          SubLObject contextualized_asent = NIL;
          for( contextualized_asent = cdolist_list_var_14.first(); ( NIL != cdolist_list_var_14 ); cdolist_list_var_14 = cdolist_list_var_14.rest(), contextualized_asent = cdolist_list_var_14.first() )
          {
            {
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              asent = current.first();
              current = current.rest();
              if( ( NIL == current ) )
              {
                {
                  SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
                  if( ( NIL != cycl_variables.hl_varP( pred ) ) )
                  {
                    if( ( NIL != list_utilities.member_eqP( pred, Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36373" ) ) ) )
                    {
                      return T;
                    }
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
              }
            }
            index_var = Numbers.add( index_var, ONE_INTEGER );
          }
        }
        {
          SubLObject sense = $kw61$POS;
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_15 = clauses.pos_lits( contextualized_clause );
          SubLObject contextualized_asent = NIL;
          for( contextualized_asent = cdolist_list_var_15.first(); ( NIL != cdolist_list_var_15 ); cdolist_list_var_15 = cdolist_list_var_15.rest(), contextualized_asent = cdolist_list_var_15.first() )
          {
            {
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              asent = current.first();
              current = current.rest();
              if( ( NIL == current ) )
              {
                {
                  SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
                  if( ( NIL != cycl_variables.hl_varP( pred ) ) )
                  {
                    if( ( NIL != list_utilities.member_eqP( pred, Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36374" ) ) ) )
                    {
                      return T;
                    }
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
              }
            }
            index_var = Numbers.add( index_var, ONE_INTEGER );
          }
        }
      }
    }
    return NIL;
  }

  /**
   * @return booleanp; whether JOIN-ORDERED-LINK's non-focal problem is (#$isa
   *         ?var0 ?var1) and the ?var1 is restricted by the focal problem.
   */
  @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 67434)
  public static final SubLObject join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(SubLObject join_ordered_link)
  {
    {
      SubLObject non_focal_problem = join_ordered_link_non_focal_problem( join_ordered_link );
      SubLObject non_focal_query = inference_datastructures_problem.problem_query( non_focal_problem );
      SubLObject cdolist_list_var = non_focal_query;
      SubLObject contextualized_clause = NIL;
      for( contextualized_clause = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), contextualized_clause = cdolist_list_var.first() )
      {
        {
          SubLObject sense = $kw60$NEG;
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_16 = clauses.neg_lits( contextualized_clause );
          SubLObject contextualized_asent = NIL;
          for( contextualized_asent = cdolist_list_var_16.first(); ( NIL != cdolist_list_var_16 ); cdolist_list_var_16 = cdolist_list_var_16.rest(), contextualized_asent = cdolist_list_var_16.first() )
          {
            {
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              asent = current.first();
              current = current.rest();
              if( ( NIL == current ) )
              {
                {
                  SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
                  SubLObject arg1 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
                  SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
                  if( ( ( pred == $const81$isa ) && ( NIL != variables.variable_p( arg1 ) ) && ( NIL != variables.variable_p( arg2 ) ) && ( NIL != list_utilities.member_eqP( arg2, Errors.handleMissingMethodError(
                      "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36375" ) ) ) ) )
                  {
                    return T;
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
              }
            }
            index_var = Numbers.add( index_var, ONE_INTEGER );
          }
        }
        {
          SubLObject sense = $kw61$POS;
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_17 = clauses.pos_lits( contextualized_clause );
          SubLObject contextualized_asent = NIL;
          for( contextualized_asent = cdolist_list_var_17.first(); ( NIL != cdolist_list_var_17 ); cdolist_list_var_17 = cdolist_list_var_17.rest(), contextualized_asent = cdolist_list_var_17.first() )
          {
            {
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
              asent = current.first();
              current = current.rest();
              if( ( NIL == current ) )
              {
                {
                  SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
                  SubLObject arg1 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
                  SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
                  if( ( ( pred == $const81$isa ) && ( NIL != variables.variable_p( arg1 ) ) && ( NIL != variables.variable_p( arg2 ) ) && ( NIL != list_utilities.member_eqP( arg2, Errors.handleMissingMethodError(
                      "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36376" ) ) ) ) )
                  {
                    return T;
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
              }
            }
            index_var = Numbers.add( index_var, ONE_INTEGER );
          }
        }
      }
    }
    return NIL;
  }

  public static final SubLObject declare_inference_worker_join_ordered_file()
  {
    declareFunction( myName, "join_ordered_link_data_print_function_trampoline", "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    declareFunction( myName, "join_ordered_link_data_p", "JOIN-ORDERED-LINK-DATA-P", 1, 0, false );
    new $join_ordered_link_data_p$UnaryFunction();
    declareFunction( myName, "jo_link_data_focal_proof_index", "JO-LINK-DATA-FOCAL-PROOF-INDEX", 1, 0, false );
    declareFunction( myName, "jo_link_data_non_focal_proof_index", "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 1, 0, false );
    declareFunction( myName, "jo_link_data_restricted_non_focal_link_index", "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false );
    declareFunction( myName, "_csetf_jo_link_data_focal_proof_index", "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX", 2, 0, false );
    declareFunction( myName, "_csetf_jo_link_data_non_focal_proof_index", "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 2, 0, false );
    declareFunction( myName, "_csetf_jo_link_data_restricted_non_focal_link_index", "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 2, 0, false );
    declareFunction( myName, "make_join_ordered_link_data", "MAKE-JOIN-ORDERED-LINK-DATA", 0, 1, false );
    declareFunction( myName, "valid_join_ordered_link_data_p", "VALID-JOIN-ORDERED-LINK-DATA-P", 1, 0, false );
    declareFunction( myName, "new_join_ordered_link_data", "NEW-JOIN-ORDERED-LINK-DATA", 0, 0, false );
    declareFunction( myName, "join_ordered_link_p", "JOIN-ORDERED-LINK-P", 1, 0, false );
    declareFunction( myName, "maybe_new_join_ordered_link", "MAYBE-NEW-JOIN-ORDERED-LINK", 3, 0, false );
    declareFunction( myName, "new_join_ordered_link", "NEW-JOIN-ORDERED-LINK", 3, 0, false );
    declareFunction( myName, "destroy_join_ordered_link", "DESTROY-JOIN-ORDERED-LINK", 1, 0, false );
    declareMacro( myName, "do_join_ordered_link_focal_proofs", "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS" );
    declareMacro( myName, "do_join_ordered_link_non_focal_proofs", "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS" );
    declareMacro( myName, "do_join_ordered_link_restricted_non_focal_problems", "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS" );
    declareMacro( myName, "do_virtual_dependent_join_ordered_links", "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS" );
    declareFunction( myName, "join_ordered_link_focal_proof_index", "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX", 1, 0, false );
    declareFunction( myName, "join_ordered_link_non_focal_proof_index", "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX", 1, 0, false );
    declareFunction( myName, "join_ordered_link_restricted_non_focal_link_index", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false );
    declareFunction( myName, "join_ordered_link_triggered_restriction_link", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTION-LINK", 2, 0, false );
    declareFunction( myName, "join_ordered_link_triggered_restricted_non_focal", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTED-NON-FOCAL", 2, 0, false );
    declareFunction( myName, "join_ordered_link_restricted_non_focal_links", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false );
    declareFunction( myName, "join_ordered_link_restricted_non_focal_triggering_proof", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-TRIGGERING-PROOF", 2, 0, false );
    declareFunction( myName, "join_ordered_link_focal_mapped_problem", "JOIN-ORDERED-LINK-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    declareFunction( myName, "join_ordered_link_has_non_focal_mapped_problemP", "JOIN-ORDERED-LINK-HAS-NON-FOCAL-MAPPED-PROBLEM?", 1, 0, false );
    declareFunction( myName, "join_ordered_link_non_focal_mapped_problem", "JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    declareFunction( myName, "join_ordered_link_non_focal_manifestedP", "JOIN-ORDERED-LINK-NON-FOCAL-MANIFESTED?", 1, 0, false );
    declareFunction( myName, "join_ordered_link_focal_problem", "JOIN-ORDERED-LINK-FOCAL-PROBLEM", 1, 0, false );
    declareFunction( myName, "join_ordered_link_non_focal_problem", "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM", 1, 0, false );
    declareFunction( myName, "join_ordered_link_other_mapped_problem", "JOIN-ORDERED-LINK-OTHER-MAPPED-PROBLEM", 2, 0, false );
    declareFunction( myName, "join_ordered_link_focal_proofs_lookup", "JOIN-ORDERED-LINK-FOCAL-PROOFS-LOOKUP", 2, 0, false );
    declareFunction( myName, "join_ordered_link_non_focal_proofs_lookup", "JOIN-ORDERED-LINK-NON-FOCAL-PROOFS-LOOKUP", 2, 0, false );
    declareFunction( myName, "join_ordered_link_tactic", "JOIN-ORDERED-LINK-TACTIC", 1, 0, false );
    declareFunction( myName, "join_ordered_link_restricted_non_focal_linkP", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?", 2, 0, false );
    declareFunction( myName, "join_ordered_link_restricted_non_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-COUNT", 1, 0, false );
    declareFunction( myName, "add_join_ordered_link_focal_proof", "ADD-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false );
    declareFunction( myName, "remove_join_ordered_link_focal_proof", "REMOVE-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false );
    declareFunction( myName, "add_join_ordered_link_non_focal_proof", "ADD-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false );
    declareFunction( myName, "remove_join_ordered_link_non_focal_proof", "REMOVE-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false );
    declareFunction( myName, "add_join_ordered_link_restricted_non_focal_link", "ADD-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 3, 0, false );
    declareFunction( myName, "remove_join_ordered_link_restricted_non_focal_link", "REMOVE-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 2, 0, false );
    declareFunction( myName, "join_ordered_link_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false );
    declareFunction( myName, "join_ordered_link_non_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-NON-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false );
    declareFunction( myName, "join_ordered_tactic_p", "JOIN-ORDERED-TACTIC-P", 1, 0, false );
    declareFunction( myName, "single_focal_literal_join_ordered_tactic_p", "SINGLE-FOCAL-LITERAL-JOIN-ORDERED-TACTIC-P", 1, 0, false );
    declareFunction( myName, "new_join_ordered_tactic", "NEW-JOIN-ORDERED-TACTIC", 2, 0, false );
    declareFunction( myName, "join_ordered_tactic_link", "JOIN-ORDERED-TACTIC-LINK", 1, 0, false );
    declareFunction( myName, "join_ordered_tactic_focal_supporting_problem_spec", "JOIN-ORDERED-TACTIC-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false );
    declareFunction( myName, "join_ordered_tactic_subsumesP", "JOIN-ORDERED-TACTIC-SUBSUMES?", 2, 0, false );
    declareFunction( myName, "find_or_create_join_ordered_tactic_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    declareFunction( myName, "find_or_create_join_ordered_tactic_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    declareFunction( myName, "determine_new_join_ordered_tactics", "DETERMINE-NEW-JOIN-ORDERED-TACTICS", 2, 0, false );
    declareFunction( myName, "problem_has_a_complete_conjunctive_removal_tacticP", "PROBLEM-HAS-A-COMPLETE-CONJUNCTIVE-REMOVAL-TACTIC?", 1, 0, false );
    declareFunction( myName, "problem_has_a_candidate_early_removal_tacticP", "PROBLEM-HAS-A-CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false );
    declareFunction( myName, "determine_new_single_literal_join_ordered_tactics", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false );
    declareFunction( myName, "determine_new_single_literal_join_ordered_tactic", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTIC", 4, 0, false );
    declareFunction( myName, "motivated_followup_multi_literal_subclause_specs_case_1", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-1", 2, 0, false );
    declareFunction( myName, "problem_store_followup_query_problem_p", "PROBLEM-STORE-FOLLOWUP-QUERY-PROBLEM-P", 1, 0, false );
    declareFunction( myName, "motivated_followup_multi_literal_subclause_specs_case_2", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-2", 2, 0, false );
    declareFunction( myName, "matching_subclause_specs", "MATCHING-SUBCLAUSE-SPECS", 2, 0, false );
    declareFunction( myName, "matching_subclause_index_dictionary", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY", 2, 0, false );
    declareFunction( myName, "matching_subclause_index_dictionary_to_indices_list", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY-TO-INDICES-LIST", 1, 0, false );
    declareFunction( myName, "sub_matching_subclause_specs", "SUB-MATCHING-SUBCLAUSE-SPECS", 2, 0, false );
    declareFunction( myName, "determine_new_join_ordered_tactic", "DETERMINE-NEW-JOIN-ORDERED-TACTIC", 3, 0, false );
    declareFunction( myName, "find_or_create_join_ordered_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-FOCAL-MAPPED-PROBLEM", 3, 0, false );
    declareFunction( myName, "find_or_create_join_ordered_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-NON-FOCAL-MAPPED-PROBLEM", 3, 0, false );
    declareFunction( myName, "lazily_create_join_ordered_link_non_focal_mapped_problem", "LAZILY-CREATE-JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false );
    declareFunction( myName, "compute_strategic_properties_of_join_ordered_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-ORDERED-TACTIC", 2, 0, false );
    declareFunction( myName, "compute_join_ordered_tactic_productivity", "COMPUTE-JOIN-ORDERED-TACTIC-PRODUCTIVITY", 2, 0, false );
    declareFunction( myName, "compute_join_ordered_tactic_preference_level", "COMPUTE-JOIN-ORDERED-TACTIC-PREFERENCE-LEVEL", 2, 0, false );
    declareFunction( myName, "execute_join_ordered_tactic", "EXECUTE-JOIN-ORDERED-TACTIC", 1, 0, false );
    declareFunction( myName, "consider_strategic_ramifications_of_tactic_preference_level", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-TACTIC-PREFERENCE-LEVEL", 1, 0, false );
    declareFunction( myName, "join_ordered_tactic_lookahead_problem", "JOIN-ORDERED-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false );
    declareFunction( myName, "new_join_ordered_proof", "NEW-JOIN-ORDERED-PROOF", 2, 0, false );
    declareFunction( myName, "join_ordered_proof_p", "JOIN-ORDERED-PROOF-P", 1, 0, false );
    declareFunction( myName, "connected_conjunction_proof_p", "CONNECTED-CONJUNCTION-PROOF-P", 1, 0, false );
    declareFunction( myName, "new_conjunctive_proof", "NEW-CONJUNCTIVE-PROOF", 2, 0, false );
    declareFunction( myName, "compute_sibling_proof_bindings", "COMPUTE-SIBLING-PROOF-BINDINGS", 3, 0, false );
    declareFunction( myName, "focal_to_non_focal_variable_map_internal", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INTERNAL", 1, 0, false );
    declareFunction( myName, "focal_to_non_focal_variable_map", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP", 1, 0, false );
    declareFunction( myName, "non_focal_to_focal_variable_map_internal", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INTERNAL", 1, 0, false );
    declareFunction( myName, "non_focal_to_focal_variable_map", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP", 1, 0, false );
    declareFunction( myName, "trigger_to_sibling_variable_map", "TRIGGER-TO-SIBLING-VARIABLE-MAP", 2, 0, false );
    declareFunction( myName, "focal_bindings_to_non_focal_bindings", "FOCAL-BINDINGS-TO-NON-FOCAL-BINDINGS", 2, 0, false );
    declareFunction( myName, "non_focal_bindings_to_focal_bindings", "NON-FOCAL-BINDINGS-TO-FOCAL-BINDINGS", 2, 0, false );
    declareFunction( myName, "bubble_up_proof_to_join_ordered_link", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK", 3, 0, false );
    declareFunction( myName, "trigger_split_restriction", "TRIGGER-SPLIT-RESTRICTION", 2, 0, false );
    declareFunction( myName, "find_split_restriction", "FIND-SPLIT-RESTRICTION", 2, 0, false );
    declareFunction( myName, "find_or_create_split_restriction_int", "FIND-OR-CREATE-SPLIT-RESTRICTION-INT", 3, 0, false );
    declareFunction( myName, "note_all_triggering_proofs_processed", "NOTE-ALL-TRIGGERING-PROOFS-PROCESSED", 1, 0, false );
    declareFunction( myName, "note_restricted_non_focal_finished", "NOTE-RESTRICTED-NON-FOCAL-FINISHED", 2, 0, false );
    declareFunction( myName, "find_or_create_restricted_non_focal_problem", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false );
    declareFunction( myName, "find_restricted_non_focal_problem", "FIND-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false );
    declareFunction( myName, "find_or_create_restricted_non_focal_problem_int", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM-INT", 3, 0, false );
    declareFunction( myName, "find_restricted_problem_and_link", "FIND-RESTRICTED-PROBLEM-AND-LINK", 2, 0, false );
    declareFunction( myName, "find_or_create_restricted_problem_and_link_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-AND-LINK-INT", 3, 0, false );
    declareFunction( myName, "find_or_create_restricted_problem", "FIND-OR-CREATE-RESTRICTED-PROBLEM", 2, 0, false );
    declareFunction( myName, "find_or_create_restricted_problem_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-INT", 3, 0, false );
    declareFunction( myName, "focal_problem_is_a_single_literal_backchain_requiredP", "FOCAL-PROBLEM-IS-A-SINGLE-LITERAL-BACKCHAIN-REQUIRED?", 1, 0, false );
    declareFunction( myName, "corresponding_focal_problem", "CORRESPONDING-FOCAL-PROBLEM", 2, 0, false );
    declareFunction( myName, "corresponding_non_focal_problem", "CORRESPONDING-NON-FOCAL-PROBLEM", 2, 0, false );
    declareFunction( myName, "corresponding_restricted_focal_problem", "CORRESPONDING-RESTRICTED-FOCAL-PROBLEM", 2, 0, false );
    declareFunction( myName, "non_focal_restriction_link_with_corresponding_focal_proofP", "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?", 2, 0, false );
    declareFunction( myName, "corresponding_restricted_non_focal_problem", "CORRESPONDING-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false );
    declareFunction( myName, "find_restricted_focal_problem_by_bindings", "FIND-RESTRICTED-FOCAL-PROBLEM-BY-BINDINGS", 2, 0, false );
    declareFunction( myName, "mapped_proof_is_focalP", "MAPPED-PROOF-IS-FOCAL?", 3, 0, false );
    declareFunction( myName, "trigger_vars_shared_by_sibling_internal", "TRIGGER-VARS-SHARED-BY-SIBLING-INTERNAL", 2, 0, false );
    declareFunction( myName, "trigger_vars_shared_by_sibling", "TRIGGER-VARS-SHARED-BY-SIBLING", 2, 0, false );
    declareFunction( myName, "non_focal_vars_shared_by_focal", "NON-FOCAL-VARS-SHARED-BY-FOCAL", 1, 0, false );
    declareFunction( myName, "focal_vars_shared_by_non_focal", "FOCAL-VARS-SHARED-BY-NON-FOCAL", 1, 0, false );
    declareFunction( myName, "join_ordered_link_join_vars", "JOIN-ORDERED-LINK-JOIN-VARS", 1, 0, false );
    declareFunction( myName, "join_ordered_link_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false );
    declareFunction( myName, "join_ordered_link_non_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-NON-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false );
    declareFunction( myName, "add_join_ordered_link_proof", "ADD-JOIN-ORDERED-LINK-PROOF", 3, 0, false );
    declareFunction( myName, "join_ordered_link_shared_proof_bindings", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS", 3, 0, false );
    declareFunction( myName, "remove_join_ordered_link_proof", "REMOVE-JOIN-ORDERED-LINK-PROOF", 4, 0, false );
    declareFunction( myName, "remove_join_ordered_link_proof_both_ways", "REMOVE-JOIN-ORDERED-LINK-PROOF-BOTH-WAYS", 3, 0, false );
    declareFunction( myName, "join_ordered_link_shared_proof_bindings_int", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS-INT", 3, 0, false );
    declareFunction( myName, "join_ordered_link_sibling_proofs_lookup", "JOIN-ORDERED-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false );
    declareFunction( myName, "bubble_up_proof_to_join_ordered_link_int", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK-INT", 4, 0, false );
    declareFunction( myName, "join_ordered_link_sibling_mapped_problem", "JOIN-ORDERED-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false );
    declareFunction( myName, "join_ordered_link_could_be_finishedP", "JOIN-ORDERED-LINK-COULD-BE-FINISHED?", 2, 0, false );
    declareFunction( myName, "join_ordered_link_no_goodP", "JOIN-ORDERED-LINK-NO-GOOD?", 3, 0, false );
    declareFunction( myName, "join_ordered_link_no_good_case_1P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-1?", 3, 0, false );
    declareFunction( myName, "join_ordered_link_no_good_case_2P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-2?", 3, 0, false );
    declareFunction( myName, "join_ordered_link_with_non_focal_unbound_predicateP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-UNBOUND-PREDICATE?", 1, 0, false );
    declareFunction( myName, "join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-ISA-UNBOUND-UNBOUND-WHERE-ARG2-IS-RESTRICTED?", 1, 0, false );
    return NIL;
  }

  public static final SubLObject init_inference_worker_join_ordered_file()
  {
    $dtp_join_ordered_link_data$ = defconstant( "*DTP-JOIN-ORDERED-LINK-DATA*", $sym0$JOIN_ORDERED_LINK_DATA );
    $join_ordered_module$ = defparameter( "*JOIN-ORDERED-MODULE*", inference_modules.inference_structural_module( $kw18$JOIN_ORDERED, UNPROVIDED ) );
    $only_add_multi_literal_jo_tactics_when_no_possible_complete_tacticP$ = defparameter( "*ONLY-ADD-MULTI-LITERAL-JO-TACTICS-WHEN-NO-POSSIBLE-COMPLETE-TACTIC?*", NIL );
    return NIL;
  }

  public static final SubLObject setup_inference_worker_join_ordered_file()
  {
    // CVS_ID("Id: inference-worker-join-ordered.lisp 128924 2009-10-07
    // 17:48:12Z pace ");
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_join_ordered_link_data$.getGlobalValue(), Symbols.symbol_function( $sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE ) );
    Structures.def_csetf( $sym8$JO_LINK_DATA_FOCAL_PROOF_INDEX, $sym9$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX );
    Structures.def_csetf( $sym10$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX, $sym11$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX );
    Structures.def_csetf( $sym12$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX, $sym13$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX );
    Equality.identity( $sym0$JOIN_ORDERED_LINK_DATA );
    access_macros.register_macro_helper( $sym25$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, $sym50$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS );
    access_macros.register_macro_helper( $sym30$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, $sym51$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS );
    memoization_state.note_memoized_function( $sym68$FOCAL_TO_NON_FOCAL_VARIABLE_MAP );
    memoization_state.note_memoized_function( $sym70$NON_FOCAL_TO_FOCAL_VARIABLE_MAP );
    access_macros.register_macro_helper( $sym42$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, $list73 );
    memoization_state.note_memoized_function( $sym74$TRIGGER_VARS_SHARED_BY_SIBLING );
    return NIL;
  }
  //// Internal Constants
  public static final SubLSymbol $sym0$JOIN_ORDERED_LINK_DATA = makeSymbol( "JOIN-ORDERED-LINK-DATA" );
  public static final SubLSymbol $sym1$JOIN_ORDERED_LINK_DATA_P = makeSymbol( "JOIN-ORDERED-LINK-DATA-P" );
  public static final SubLList $list2 = list( makeSymbol( "FOCAL-PROOF-INDEX" ), makeSymbol( "NON-FOCAL-PROOF-INDEX" ), makeSymbol( "RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
  public static final SubLList $list3 = list( makeKeyword( "FOCAL-PROOF-INDEX" ), makeKeyword( "NON-FOCAL-PROOF-INDEX" ), makeKeyword( "RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
  public static final SubLList $list4 = list( makeSymbol( "JO-LINK-DATA-FOCAL-PROOF-INDEX" ), makeSymbol( "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" ), makeSymbol( "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
  public static final SubLList $list5 = list( makeSymbol( "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX" ), makeSymbol( "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" ), makeSymbol(
      "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" ) );
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
  public static final SubLSymbol $sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE" );
  public static final SubLSymbol $sym8$JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol( "JO-LINK-DATA-FOCAL-PROOF-INDEX" );
  public static final SubLSymbol $sym9$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol( "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX" );
  public static final SubLSymbol $sym10$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol( "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" );
  public static final SubLSymbol $sym11$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol( "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX" );
  public static final SubLSymbol $sym12$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol( "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" );
  public static final SubLSymbol $sym13$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol( "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX" );
  public static final SubLSymbol $kw14$FOCAL_PROOF_INDEX = makeKeyword( "FOCAL-PROOF-INDEX" );
  public static final SubLSymbol $kw15$NON_FOCAL_PROOF_INDEX = makeKeyword( "NON-FOCAL-PROOF-INDEX" );
  public static final SubLSymbol $kw16$RESTRICTED_NON_FOCAL_LINK_INDEX = makeKeyword( "RESTRICTED-NON-FOCAL-LINK-INDEX" );
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
  public static final SubLSymbol $kw18$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
  public static final SubLSymbol $sym19$MAPPED_PROBLEM_P = makeSymbol( "MAPPED-PROBLEM-P" );
  public static final SubLSymbol $kw20$FREE = makeKeyword( "FREE" );
  public static final SubLList $list21 = list( list( makeSymbol( "BINDINGS-VAR" ), makeSymbol( "PROOF-VAR" ), makeSymbol( "JOIN-ORDERED-LINK" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  public static final SubLSymbol $sym22$INDEX = makeUninternedSymbol( "INDEX" );
  public static final SubLSymbol $sym23$PROOF_LIST_VAR = makeUninternedSymbol( "PROOF-LIST-VAR" );
  public static final SubLSymbol $sym24$CLET = makeSymbol( "CLET" );
  public static final SubLSymbol $sym25$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX = makeSymbol( "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX" );
  public static final SubLSymbol $sym26$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
  public static final SubLSymbol $sym27$DO_LIST = makeSymbol( "DO-LIST" );
  public static final SubLSymbol $sym28$INDEX = makeUninternedSymbol( "INDEX" );
  public static final SubLSymbol $sym29$PROOF_LIST_VAR = makeUninternedSymbol( "PROOF-LIST-VAR" );
  public static final SubLSymbol $sym30$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX = makeSymbol( "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX" );
  public static final SubLList $list31 = list( list( makeSymbol( "RESTRICTED-NON-FOCAL-PROBLEM-VAR" ), makeSymbol( "JOIN-ORDERED-LINK" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
      "BODY" ) );
  public static final SubLList $list32 = list( makeKeyword( "DONE" ) );
  public static final SubLSymbol $kw33$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
  public static final SubLSymbol $kw34$DONE = makeKeyword( "DONE" );
  public static final SubLSymbol $sym35$LINK_VAR = makeUninternedSymbol( "LINK-VAR" );
  public static final SubLSymbol $sym36$RESTRICTION_LINK = makeUninternedSymbol( "RESTRICTION-LINK" );
  public static final SubLSymbol $sym37$DO_PROBLEM_ARGUMENT_LINKS = makeSymbol( "DO-PROBLEM-ARGUMENT-LINKS" );
  public static final SubLSymbol $sym38$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM = makeSymbol( "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM" );
  public static final SubLSymbol $kw39$TYPE = makeKeyword( "TYPE" );
  public static final SubLSymbol $kw40$RESTRICTION = makeKeyword( "RESTRICTION" );
  public static final SubLSymbol $sym41$PWHEN = makeSymbol( "PWHEN" );
  public static final SubLSymbol $sym42$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_ = makeSymbol( "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?" );
  public static final SubLSymbol $sym43$PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM = makeSymbol( "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM" );
  public static final SubLList $list44 = list( list( makeSymbol( "JOIN-ORDERED-LINK-VAR" ), makeSymbol( "RESTRICTED-NON-FOCAL-PROBLEM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
      "BODY" ) );
  public static final SubLSymbol $sym45$RESTRICTION_LINK = makeUninternedSymbol( "RESTRICTION-LINK" );
  public static final SubLSymbol $sym46$NON_FOCAL_PROBLEM = makeUninternedSymbol( "NON-FOCAL-PROBLEM" );
  public static final SubLSymbol $sym47$DO_PROBLEM_DEPENDENT_LINKS = makeSymbol( "DO-PROBLEM-DEPENDENT-LINKS" );
  public static final SubLSymbol $sym48$PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol( "PROBLEM-LINK-SUPPORTED-PROBLEM" );
  public static final SubLSymbol $sym49$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_ = makeSymbol( "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?" );
  public static final SubLSymbol $sym50$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS = makeSymbol( "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS" );
  public static final SubLSymbol $sym51$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS = makeSymbol( "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS" );
  public static final SubLString $str52$Could_not_find_the_tactic_for__a = makeString( "Could not find the tactic for ~a" );
  public static final SubLSymbol $sym53$JOIN_ORDERED_LINK_P = makeSymbol( "JOIN-ORDERED-LINK-P" );
  public static final SubLSymbol $sym54$PROOF_P = makeSymbol( "PROOF-P" );
  public static final SubLSymbol $sym55$RESTRICTION_LINK_P = makeSymbol( "RESTRICTION-LINK-P" );
  public static final SubLSymbol $kw56$SKIP = makeKeyword( "SKIP" );
  public static final SubLSymbol $kw57$REMOVAL_CONJUNCTIVE = makeKeyword( "REMOVAL-CONJUNCTIVE" );
  public static final SubLSymbol $kw58$COMPLETE = makeKeyword( "COMPLETE" );
  public static final SubLSymbol $sym59$PROBLEM_P = makeSymbol( "PROBLEM-P" );
  public static final SubLSymbol $kw60$NEG = makeKeyword( "NEG" );
  public static final SubLSymbol $kw61$POS = makeKeyword( "POS" );
  public static final SubLSymbol $kw62$ANSWER = makeKeyword( "ANSWER" );
  public static final SubLSymbol $kw63$UNION = makeKeyword( "UNION" );
  public static final SubLSymbol $sym64$DUPLICATES_ = makeSymbol( "DUPLICATES?" );
  public static final SubLSymbol $kw65$TACTICAL = makeKeyword( "TACTICAL" );
  public static final SubLSymbol $sym66$STRATEGY_P = makeSymbol( "STRATEGY-P" );
  public static final SubLList $list67 = cons( makeSymbol( "SUBPROOF" ), makeSymbol( "SUB-PROOF-BINDINGS" ) );
  public static final SubLSymbol $sym68$FOCAL_TO_NON_FOCAL_VARIABLE_MAP = makeSymbol( "FOCAL-TO-NON-FOCAL-VARIABLE-MAP" );
  public static final SubLSymbol $kw69$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword( "&MEMOIZED-ITEM-NOT-FOUND&" );
  public static final SubLSymbol $sym70$NON_FOCAL_TO_FOCAL_VARIABLE_MAP = makeSymbol( "NON-FOCAL-TO-FOCAL-VARIABLE-MAP" );
  public static final SubLString $str71$Finding_or_creating_a_restricted_ = makeString( "Finding or creating a restricted problem of ~a requires bindings" );
  public static final SubLString $str72$Creating_a_restricted_problem_of_ = makeString( "Creating a restricted problem of ~a requires bindings" );
  public static final SubLList $list73 = list( makeSymbol( "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS" ), makeSymbol( "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS" ) );
  public static final SubLSymbol $sym74$TRIGGER_VARS_SHARED_BY_SIBLING = makeSymbol( "TRIGGER-VARS-SHARED-BY-SIBLING" );
  public static final SubLSymbol $sym75$VARIABLE_BINDING_VARIABLE = makeSymbol( "VARIABLE-BINDING-VARIABLE" );
  public static final SubLSymbol $sym76$VARIABLE_P = makeSymbol( "VARIABLE-P" );
  public static final SubLString $str77$_a_was_a_rejected_proof = makeString( "~a was a rejected proof" );
  public static final SubLSymbol $sym78$PROOF_PROVEN_ = makeSymbol( "PROOF-PROVEN?" );
  public static final SubLSymbol $kw79$PREFERRED = makeKeyword( "PREFERRED" );
  public static final SubLList $list80 = list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
  public static final SubLObject $const81$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );

  //// Initializers
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
}
