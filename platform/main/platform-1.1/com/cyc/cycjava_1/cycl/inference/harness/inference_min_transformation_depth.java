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
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class inference_min_transformation_depth extends SubLTranslatedFile {

  //// Constructor

  private inference_min_transformation_depth() {}
  public static final SubLFile me = new inference_min_transformation_depth();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_min_transformation_depth";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1047)
  public static final SubLObject problem_min_transformation_depth_from_signature(SubLObject problem, SubLObject inference) {
    {
      SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
      return min_transformation_depth_from_signature(signature);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1532)
  public static final SubLObject min_transformation_depth_from_signature(SubLObject signature) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (($kw0$UNDETERMINED == signature)) {
        return $kw0$UNDETERMINED;
      } else if ((inference_datastructures_problem.$transformation_depth_computation$.getDynamicValue(thread) == $kw1$COUNTERINTUITIVE)) {
        return tree_min_number(signature);
      } else {
        return tree_sum(signature);
      }
    }
  }

  /** Propagates transformation depth down via LINK. */
  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 2607)
  public static final SubLObject propagate_min_transformation_depth_signature_via_link(SubLObject link) {
    {
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw3$SKIP))) {
        {
          SubLObject idx_1 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_1, $kw3$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_1);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw3$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw3$SKIP;
                    }
                    propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_2 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_2))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_2);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 3120)
  public static final SubLObject propagate_min_transformation_depth_signature(SubLObject problem, SubLObject mtds, SubLObject inference) {
    {
      SubLObject updatedP = inference_datastructures_problem.note_problem_min_transformation_depth_signature(problem, inference, mtds);
      if ((NIL != updatedP)) {
        {
          SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
                propagate_min_transformation_depth_signature_via_link(link);
              }
            }
          }
        }
      }
      return updatedP;
    }
  }

  /** Propagates transformation depth wrt INFERENCE down via LINK. */
  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 3460)
  public static final SubLObject propagate_min_transformation_depth_signature_via_link_wrt_inference(SubLObject link, SubLObject inference) {
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
      SubLObject parent_mtds = inference_datastructures_problem.problem_min_transformation_depth_signature(supported_problem, inference);
      if (($kw0$UNDETERMINED != parent_mtds)) {
        if ((NIL != inference_worker_transformation.transformation_link_p(link))) {
          return propagate_mtds_via_transformation_link(parent_mtds, link, inference);
        } else if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link))) {
          return propagate_mtds_via_join_ordered_link(parent_mtds, link, inference);
        } else if ((NIL != inference_worker_residual_transformation.residual_transformation_link_p(link))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35423");
        } else if ((NIL != inference_worker_split.split_link_p(link))) {
          return propagate_mtds_via_split_link(parent_mtds, link, inference);
        } else if ((NIL != inference_worker_restriction.restriction_link_p(link))) {
          return propagate_mtds_via_restriction_link(parent_mtds, link, inference);
        } else if ((NIL != inference_worker_union.union_link_p(link))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35424");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 4553)
  public static final SubLObject propagate_mtds_via_transformation_link(SubLObject parent_mtds, SubLObject t_link, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == single_literal_problem_query_depth_signature_p(parent_mtds))) {
          Errors.error($str4$Time_to_support__S_propagation, parent_mtds);
        }
      }
      if ((NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(t_link))) {
        {
          SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(t_link);
          SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
          SubLObject parent_depth = parent_mtds;
          SubLObject child_mtds = new_initial_pqds(supporting_problem_query, number_utilities.f_1X(parent_depth));
          return propagate_min_transformation_depth_signature(supporting_problem, child_mtds, inference);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 6546)
  public static final SubLObject propagate_mtds_via_join_ordered_link(SubLObject parent_mtds, SubLObject jo_link, SubLObject inference) {
    {
      SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
      SubLObject focal_mtds = join_ordered_link_focal_mtds(jo_link, parent_mtds);
      if ((NIL != focal_mtds)) {
        propagate_min_transformation_depth_signature(focal_problem, focal_mtds, inference);
        if ((NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link))) {
          {
            SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link);
            SubLObject non_focal_mtds = join_ordered_link_non_focal_mtds(jo_link, parent_mtds);
            if ((NIL != non_focal_mtds)) {
              propagate_min_transformation_depth_signature(non_focal_problem, non_focal_mtds, inference);
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 7261)
  public static final SubLObject join_ordered_link_focal_mtds(SubLObject jo_link, SubLObject parent_mtds) {
    {
      SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
      if ((NIL != focal_spec)) {
        return new_subclause_pqds(parent_mtds, focal_spec);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 7491)
  public static final SubLObject join_ordered_link_non_focal_mtds(SubLObject jo_link, SubLObject parent_mtds) {
    {
      SubLObject non_focal_spec = inference_worker_join_ordered.join_ordered_link_non_focal_supporting_problem_spec(jo_link);
      if ((NIL != non_focal_spec)) {
        return new_subclause_pqds(parent_mtds, non_focal_spec);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 8010)
  public static final SubLObject propagate_mtds_via_split_link(SubLObject parent_mtds, SubLObject split_link, SubLObject inference) {
    {
      SubLObject split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
      SubLObject link_var = split_link;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
      SubLObject conjunct_mapped_problem = NIL;
      for (conjunct_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), conjunct_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, conjunct_mapped_problem))) {
          {
            SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
            SubLObject conjunct_mtds = split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
            conjunct_mtds = intern_problem_query_depth_signature(conjunct_mtds);
            propagate_min_transformation_depth_signature(conjunct_problem, conjunct_mtds, inference);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9026)
  public static final SubLObject split_problem_conjunct_mtds(SubLObject split_problem, SubLObject conjunct_mapped_problem, SubLObject parent_mtds) {
    {
      SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
      SubLObject literal_map = split_problem_conjunct_literal_map(split_problem, conjunct_mapped_problem);
      SubLObject conjunct_mtds = conses_high.copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(conjunct_problem), $kw7$UNINITIALIZED));
      conjunct_mtds = napply_literal_map(parent_mtds, literal_map, conjunct_mtds);
      return conjunct_mtds;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9501)
  public static final SubLObject split_problem_conjunct_literal_map(SubLObject split_problem, SubLObject conjunct_mapped_problem) {
    {
      SubLObject split_problem_query = inference_datastructures_problem.problem_query(split_problem);
      SubLObject split_problem_clause = split_problem_query.first();
      SubLObject conjunct_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(conjunct_mapped_problem);
      SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
      SubLObject conjunct_problem_query = inference_datastructures_problem.problem_query(conjunct_problem);
      SubLObject conjunct_problem_clause = conjunct_problem_query.first();
      SubLObject conjunct_problem_clause_wrt_split = bindings.apply_bindings(conjunct_variable_map, conjunct_problem_clause);
      return new_subclause_literal_map(split_problem_clause, conjunct_problem_clause_wrt_split, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 10389)
  public static final SubLObject propagate_mtds_via_restriction_link(SubLObject parent_mtds, SubLObject restriction_link, SubLObject inference) {
    {
      SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
      SubLObject restricted_mtds = restriction_link_restricted_mtds(restriction_link, parent_mtds);
      return propagate_min_transformation_depth_signature(restricted_problem, restricted_mtds, inference);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 10777)
  public static final SubLObject restriction_link_restricted_mtds(SubLObject restriction_link, SubLObject parent_mtds) {
    if ((NIL != inference_datastructures_problem.single_literal_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link)))) {
      return parent_mtds;
    }
    {
      SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
      SubLObject literal_map = restriction_link_literal_map(restriction_link);
      SubLObject restricted_mtds = conses_high.copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(restricted_problem), $kw7$UNINITIALIZED));
      restricted_mtds = napply_literal_map(parent_mtds, literal_map, restricted_mtds);
      return restricted_mtds;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 11369)
  public static final SubLObject restriction_link_literal_map(SubLObject restriction_link) {
    {
      SubLObject unrestricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link)).first();
      SubLObject restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
      SubLObject unrestricted_clause_qua_restricted = bindings.apply_bindings(restriction_bindings, unrestricted_clause);
      SubLObject restricted_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
      SubLObject restricted_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
      SubLObject restricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem)).first();
      SubLObject restricted_clause_qua_unrestricted = bindings.apply_bindings(restricted_variable_map, restricted_clause);
      SubLObject literal_map = compute_restricted_clause_literal_map(unrestricted_clause_qua_restricted, restricted_clause_qua_unrestricted);
      return literal_map;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 12684)
  public static final SubLObject compute_restricted_clause_literal_map(SubLObject unrestricted_clause, SubLObject restricted_clause) {
    {
      SubLObject literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
      if (((NIL != list_utilities.member_eqP(NIL, literal_map.first()))
          || (NIL != list_utilities.member_eqP(NIL, conses_high.second(literal_map))))) {
        unrestricted_clause = inference_czer.inference_simplify_contextualized_dnf_clause(conses_high.copy_tree(unrestricted_clause));
        literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
      }
      return literal_map;
    }
  }

  /** Compute a mapping between the literals in the PARENT-CLAUSE to CHILD-CLAUSE. */
  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 13488)
  public static final SubLObject compute_clause_literal_map(SubLObject parent_clause, SubLObject child_clause) {
    {
      SubLObject datum = parent_clause;
      SubLObject current = datum;
      SubLObject parent_neg_lits = NIL;
      SubLObject parent_pos_lits = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
      parent_neg_lits = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
      parent_pos_lits = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject datum_3 = child_clause;
          SubLObject current_4 = datum_3;
          SubLObject child_neg_lits = NIL;
          SubLObject child_pos_lits = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list9);
          child_neg_lits = current_4.first();
          current_4 = current_4.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list9);
          child_pos_lits = current_4.first();
          current_4 = current_4.rest();
          if ((NIL == current_4)) {
            {
              SubLObject neg_lit_map = NIL;
              SubLObject pos_lit_map = NIL;
              {
                SubLObject cdolist_list_var = parent_neg_lits;
                SubLObject parent_neg_lit = NIL;
                for (parent_neg_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), parent_neg_lit = cdolist_list_var.first()) {
                  {
                    SubLObject child_index = Sequences.position(parent_neg_lit, child_neg_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    neg_lit_map = cons(child_index, neg_lit_map);
                  }
                }
              }
              {
                SubLObject cdolist_list_var = parent_pos_lits;
                SubLObject parent_pos_lit = NIL;
                for (parent_pos_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), parent_pos_lit = cdolist_list_var.first()) {
                  {
                    SubLObject child_index = Sequences.position(parent_pos_lit, child_pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    pos_lit_map = cons(child_index, pos_lit_map);
                  }
                }
              }
              pos_lit_map = Sequences.nreverse(pos_lit_map);
              {
                SubLObject literal_map = list(neg_lit_map, pos_lit_map);
                return literal_map;
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum_3, $list9);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list8);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 15527)
  public static final SubLObject single_literal_problem_query_depth_signature_p(SubLObject object) {
    return subl_promotions.non_negative_integer_p(object);
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16219)
  private static SubLSymbol $intern_problem_query_depth_signature_caching_state$ = null;

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16219)
  public static final SubLObject intern_problem_query_depth_signature_internal(SubLObject pqds) {
    checkType(pqds, $sym14$PROBLEM_QUERY_DEPTH_SIGNATURE_P);
    return conses_high.copy_tree(pqds);
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16219)
  public static final SubLObject intern_problem_query_depth_signature(SubLObject pqds) {
    {
      SubLObject caching_state = $intern_problem_query_depth_signature_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE, $sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pqds, $kw16$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw16$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(intern_problem_query_depth_signature_internal(pqds)));
          memoization_state.caching_state_put(caching_state, pqds, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16412)
  public static final SubLObject new_initial_pqds(SubLObject problem_query, SubLObject depth) {
    if ((depth == UNPROVIDED)) {
      depth = ZERO_INTEGER;
    }
    if ((NIL != inference_datastructures_problem_query.single_literal_problem_query_p(problem_query))) {
      return depth;
    } else if ((NIL != list_utilities.singletonP(problem_query))) {
      return new_initial_clause_pqds(problem_query.first(), depth);
    } else {
      {
        SubLObject clause_pqds_list = NIL;
        SubLObject cdolist_list_var = problem_query;
        SubLObject contextualized_clause = NIL;
        for (contextualized_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_clause = cdolist_list_var.first()) {
          clause_pqds_list = cons(new_initial_clause_pqds(contextualized_clause, depth), clause_pqds_list);
        }
        clause_pqds_list = Sequences.nreverse(clause_pqds_list);
        if (depth.isInteger()) {
          clause_pqds_list = intern_problem_query_depth_signature(clause_pqds_list);
        }
        return clause_pqds_list;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 17037)
  public static final SubLObject new_initial_clause_pqds(SubLObject contextualized_clause, SubLObject depth) {
    if ((depth == UNPROVIDED)) {
      depth = ZERO_INTEGER;
    }
    {
      SubLObject pqds = list(ConsesLow.make_list(Sequences.length(clauses.neg_lits(contextualized_clause)), depth), ConsesLow.make_list(Sequences.length(clauses.pos_lits(contextualized_clause)), depth));
      if (depth.isInteger()) {
        pqds = intern_problem_query_depth_signature(pqds);
      }
      return pqds;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 17382)
  public static final SubLObject new_subclause_pqds(SubLObject parent_pqds, SubLObject subclause_spec) {
    checkType(parent_pqds, $sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P);
    {
      SubLObject datum = parent_pqds;
      SubLObject current = datum;
      SubLObject neg_lit_pqds = NIL;
      SubLObject pos_lit_pqds = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
      neg_lit_pqds = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
      pos_lit_pqds = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject datum_5 = subclause_spec;
          SubLObject current_6 = datum_5;
          SubLObject neg_lit_specs = NIL;
          SubLObject pos_lit_specs = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current_6, datum_5, $list18);
          neg_lit_specs = current_6.first();
          current_6 = current_6.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current_6, datum_5, $list18);
          pos_lit_specs = current_6.first();
          current_6 = current_6.rest();
          if ((NIL == current_6)) {
            {
              SubLObject result_neg_lit_pqds = NIL;
              SubLObject result_pos_lit_pqds = NIL;
              {
                SubLObject cdolist_list_var = neg_lit_specs;
                SubLObject neg_lit_spec = NIL;
                for (neg_lit_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), neg_lit_spec = cdolist_list_var.first()) {
                  result_neg_lit_pqds = cons(ConsesLow.nth(neg_lit_spec, neg_lit_pqds), result_neg_lit_pqds);
                }
              }
              {
                SubLObject cdolist_list_var = pos_lit_specs;
                SubLObject pos_lit_spec = NIL;
                for (pos_lit_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pos_lit_spec = cdolist_list_var.first()) {
                  result_pos_lit_pqds = cons(ConsesLow.nth(pos_lit_spec, pos_lit_pqds), result_pos_lit_pqds);
                }
              }
              result_neg_lit_pqds = Sequences.nreverse(result_neg_lit_pqds);
              result_pos_lit_pqds = Sequences.nreverse(result_pos_lit_pqds);
              if (((NIL == result_neg_lit_pqds)
                   && (NIL != list_utilities.singletonP(result_pos_lit_pqds)))) {
                return result_pos_lit_pqds.first();
              }
              if (((NIL == result_pos_lit_pqds)
                   && (NIL != list_utilities.singletonP(result_neg_lit_pqds)))) {
                return result_neg_lit_pqds.first();
              }
              return intern_problem_query_depth_signature(list(result_neg_lit_pqds, result_pos_lit_pqds));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum_5, $list18);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list17);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18428)
  private static SubLSymbol $pqds_depth_caching_state$ = null;

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18689)
  public static final SubLObject pqds_merge(SubLObject pqds1, SubLObject pqds2) {
    if (pqds1.equal(pqds2)) {
      return pqds1;
    } else if ((NIL != single_literal_problem_query_depth_signature_p(pqds1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35425");
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35422"))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35420");
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35418");
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 20168)
  public static final SubLObject new_subclause_literal_map(SubLObject clause, SubLObject subclause, SubLObject missing) {
    if ((missing == UNPROVIDED)) {
      missing = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = clause;
        SubLObject current = datum;
        SubLObject clause_neg_lits = NIL;
        SubLObject clause_pos_lits = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        clause_neg_lits = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        clause_pos_lits = current.first();
        current = current.rest();
        if ((NIL == current)) {
          {
            SubLObject datum_13 = subclause;
            SubLObject current_14 = datum_13;
            SubLObject subclause_neg_lits = NIL;
            SubLObject subclause_pos_lits = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_14, datum_13, $list25);
            subclause_neg_lits = current_14.first();
            current_14 = current_14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_14, datum_13, $list25);
            subclause_pos_lits = current_14.first();
            current_14 = current_14.rest();
            if ((NIL == current_14)) {
              {
                SubLObject map_neg_lits = ConsesLow.make_list(Sequences.length(clause_neg_lits), missing);
                SubLObject map_pos_lits = ConsesLow.make_list(Sequences.length(clause_pos_lits), missing);
                {
                  SubLObject list_var = NIL;
                  SubLObject clause_lit = NIL;
                  SubLObject clause_index = NIL;
                  for (list_var = clause_neg_lits, clause_lit = list_var.first(), clause_index = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), clause_lit = list_var.first(), clause_index = Numbers.add(ONE_INTEGER, clause_index)) {
                    {
                      SubLObject subclause_index = Sequences.position(clause_lit, subclause_neg_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      if (subclause_index.isInteger()) {
                        ConsesLow.set_nth(clause_index, map_neg_lits, subclause_index);
                      }
                    }
                  }
                }
                {
                  SubLObject list_var = NIL;
                  SubLObject clause_lit = NIL;
                  SubLObject clause_index = NIL;
                  for (list_var = clause_pos_lits, clause_lit = list_var.first(), clause_index = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), clause_lit = list_var.first(), clause_index = Numbers.add(ONE_INTEGER, clause_index)) {
                    {
                      SubLObject subclause_index = Sequences.position(clause_lit, subclause_pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      if (subclause_index.isInteger()) {
                        ConsesLow.set_nth(clause_index, map_pos_lits, subclause_index);
                      }
                    }
                  }
                }
                {
                  SubLObject literal_map = list(map_neg_lits, map_pos_lits);
                  if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    if ((NIL == list_utilities.tree_find_if(Symbols.symbol_function($sym26$INTEGERP), literal_map, UNPROVIDED))) {
                      Errors.error($str27$Failed_literal_map__S, literal_map);
                    }
                  }
                  return literal_map;
                }
              }
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum_13, $list25);
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list24);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 21378)
  public static final SubLObject napply_literal_map(SubLObject source_mtds, SubLObject literal_map, SubLObject target_mtds) {
    {
      SubLObject datum = source_mtds;
      SubLObject current = datum;
      SubLObject source_neg_mtds_list = NIL;
      SubLObject source_pos_mtds_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
      source_neg_mtds_list = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
      source_pos_mtds_list = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject datum_15 = literal_map;
          SubLObject current_16 = datum_15;
          SubLObject neg_lit_map = NIL;
          SubLObject pos_lit_map = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current_16, datum_15, $list29);
          neg_lit_map = current_16.first();
          current_16 = current_16.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current_16, datum_15, $list29);
          pos_lit_map = current_16.first();
          current_16 = current_16.rest();
          if ((NIL == current_16)) {
            {
              SubLObject target_neg_mtds_list = (target_mtds.isCons() ? ((SubLObject) target_mtds.first()) : NIL);
              SubLObject target_pos_mtds_list = (target_mtds.isCons() ? ((SubLObject) conses_high.second(target_mtds)) : NIL);
              SubLObject source_neg_mtds = NIL;
              SubLObject source_neg_mtds_17 = NIL;
              SubLObject neg_index = NIL;
              SubLObject neg_index_18 = NIL;
              for (source_neg_mtds = source_neg_mtds_list, source_neg_mtds_17 = source_neg_mtds.first(), neg_index = neg_lit_map, neg_index_18 = neg_index.first(); (!(((NIL == neg_index)
                     && (NIL == source_neg_mtds)))); source_neg_mtds = source_neg_mtds.rest(), source_neg_mtds_17 = source_neg_mtds.first(), neg_index = neg_index.rest(), neg_index_18 = neg_index.first()) {
                if (neg_index_18.isInteger()) {
                  if (target_mtds.isCons()) {
                    ConsesLow.set_nth(neg_index_18, target_neg_mtds_list, source_neg_mtds_17);
                  } else {
                    target_mtds = source_neg_mtds_17;
                  }
                }
              }
              {
                SubLObject source_pos_mtds = NIL;
                SubLObject source_pos_mtds_19 = NIL;
                SubLObject pos_index = NIL;
                SubLObject pos_index_20 = NIL;
                for (source_pos_mtds = source_pos_mtds_list, source_pos_mtds_19 = source_pos_mtds.first(), pos_index = pos_lit_map, pos_index_20 = pos_index.first(); (!(((NIL == pos_index)
                       && (NIL == source_pos_mtds)))); source_pos_mtds = source_pos_mtds.rest(), source_pos_mtds_19 = source_pos_mtds.first(), pos_index = pos_index.rest(), pos_index_20 = pos_index.first()) {
                  if (pos_index_20.isInteger()) {
                    if (target_mtds.isCons()) {
                      ConsesLow.set_nth(pos_index_20, target_pos_mtds_list, source_pos_mtds_19);
                    } else {
                      target_mtds = source_pos_mtds_19;
                    }
                  }
                }
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum_15, $list29);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list28);
      }
    }
    return target_mtds;
  }

  /** Return the sum of all numbers in TREE. */
  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 22288)
  public static final SubLObject tree_sum(SubLObject tree) {
    return tree_sum_recursive(tree, ZERO_INTEGER);
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 22641)
  public static final SubLObject tree_sum_recursive(SubLObject tree, SubLObject accumulator) {
    if (tree.isNumber()) {
      accumulator = Numbers.add(accumulator, tree);
    } else if (tree.isAtom()) {
    } else {
      {
        SubLObject sublist = NIL;
        SubLObject first = NIL;
        for (sublist = tree, first = sublist.first(); (!(sublist.rest().isAtom())); sublist = sublist.rest(), first = sublist.first()) {
          accumulator = tree_sum_recursive(first, accumulator);
        }
        accumulator = tree_sum_recursive(sublist.first(), accumulator);
        accumulator = tree_sum_recursive(sublist.rest(), accumulator);
      }
    }
    return accumulator;
  }

  /** Return the lowest number TREE. */
  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 23128)
  public static final SubLObject tree_min_number(SubLObject tree) {
    return tree_min_number_recursive(tree, $kw30$POSITIVE_INFINITY);
  }

  @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 23300)
  public static final SubLObject tree_min_number_recursive(SubLObject tree, SubLObject lowest) {
    if ((NIL != number_utilities.potentially_infinite_number_p(tree))) {
      lowest = number_utilities.potentially_infinite_number_min(lowest, tree);
    } else if (tree.isAtom()) {
    } else {
      {
        SubLObject sublist = NIL;
        SubLObject first = NIL;
        for (sublist = tree, first = sublist.first(); (!(sublist.rest().isAtom())); sublist = sublist.rest(), first = sublist.first()) {
          lowest = tree_min_number_recursive(first, lowest);
        }
        lowest = tree_min_number_recursive(sublist.first(), lowest);
        lowest = tree_min_number_recursive(sublist.rest(), lowest);
      }
    }
    return lowest;
  }

  public static final SubLObject declare_inference_min_transformation_depth_file() {
    declareFunction(myName, "problem_min_transformation_depth_from_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 2, 0, false);
    declareFunction(myName, "min_transformation_depth_from_signature", "MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 1, 0, false);
    declareFunction(myName, "logical_tactic_lookahead_min_transformation_depth", "LOGICAL-TACTIC-LOOKAHEAD-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
    declareFunction(myName, "propagate_min_transformation_depth_signature_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK", 1, 0, false);
    declareFunction(myName, "propagate_min_transformation_depth_signature", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
    declareFunction(myName, "propagate_min_transformation_depth_signature_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK-WRT-INFERENCE", 2, 0, false);
    declareFunction(myName, "propagate_mtds_via_transformation_link", "PROPAGATE-MTDS-VIA-TRANSFORMATION-LINK", 3, 0, false);
    declareFunction(myName, "propagate_mtds_via_residual_transformation_link", "PROPAGATE-MTDS-VIA-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
    declareFunction(myName, "compute_residual_transformation_mtds", "COMPUTE-RESIDUAL-TRANSFORMATION-MTDS", 2, 0, false);
    declareFunction(myName, "propagate_mtds_via_join_ordered_link", "PROPAGATE-MTDS-VIA-JOIN-ORDERED-LINK", 3, 0, false);
    declareFunction(myName, "join_ordered_link_focal_mtds", "JOIN-ORDERED-LINK-FOCAL-MTDS", 2, 0, false);
    declareFunction(myName, "join_ordered_link_non_focal_mtds", "JOIN-ORDERED-LINK-NON-FOCAL-MTDS", 2, 0, false);
    declareFunction(myName, "join_ordered_tactic_lookahead_mtds", "JOIN-ORDERED-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
    declareFunction(myName, "propagate_mtds_via_split_link", "PROPAGATE-MTDS-VIA-SPLIT-LINK", 3, 0, false);
    declareFunction(myName, "split_tactic_lookahead_mtds", "SPLIT-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
    declareFunction(myName, "split_problem_conjunct_mtds", "SPLIT-PROBLEM-CONJUNCT-MTDS", 3, 0, false);
    declareFunction(myName, "split_problem_conjunct_literal_map", "SPLIT-PROBLEM-CONJUNCT-LITERAL-MAP", 2, 0, false);
    declareFunction(myName, "propagate_mtds_via_restriction_link", "PROPAGATE-MTDS-VIA-RESTRICTION-LINK", 3, 0, false);
    declareFunction(myName, "restriction_link_restricted_mtds", "RESTRICTION-LINK-RESTRICTED-MTDS", 2, 0, false);
    declareFunction(myName, "restriction_link_literal_map", "RESTRICTION-LINK-LITERAL-MAP", 1, 0, false);
    declareFunction(myName, "compute_restricted_clause_literal_map", "COMPUTE-RESTRICTED-CLAUSE-LITERAL-MAP", 2, 0, false);
    declareFunction(myName, "compute_clause_literal_map", "COMPUTE-CLAUSE-LITERAL-MAP", 2, 0, false);
    declareFunction(myName, "propagate_mtds_via_union_link", "PROPAGATE-MTDS-VIA-UNION-LINK", 3, 0, false);
    declareFunction(myName, "union_tactic_lookahead_mtds", "UNION-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
    declareFunction(myName, "problem_query_depth_signature_p", "PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
    declareFunction(myName, "single_literal_problem_query_depth_signature_p", "SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
    declareFunction(myName, "multi_literal_problem_query_depth_signature_p", "MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
    declareFunction(myName, "multi_clause_problem_query_depth_signature_p", "MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
    declareFunction(myName, "clear_intern_problem_query_depth_signature", "CLEAR-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 0, 0, false);
    declareFunction(myName, "remove_intern_problem_query_depth_signature", "REMOVE-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
    declareFunction(myName, "intern_problem_query_depth_signature_internal", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-INTERNAL", 1, 0, false);
    declareFunction(myName, "intern_problem_query_depth_signature", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
    declareFunction(myName, "new_initial_pqds", "NEW-INITIAL-PQDS", 1, 1, false);
    declareFunction(myName, "new_initial_clause_pqds", "NEW-INITIAL-CLAUSE-PQDS", 1, 1, false);
    declareFunction(myName, "new_subclause_pqds", "NEW-SUBCLAUSE-PQDS", 2, 0, false);
    declareFunction(myName, "clear_pqds_depth", "CLEAR-PQDS-DEPTH", 0, 0, false);
    declareFunction(myName, "remove_pqds_depth", "REMOVE-PQDS-DEPTH", 2, 0, false);
    declareFunction(myName, "pqds_depth_internal", "PQDS-DEPTH-INTERNAL", 2, 0, false);
    declareFunction(myName, "pqds_depth", "PQDS-DEPTH", 2, 0, false);
    declareFunction(myName, "pqds_merge", "PQDS-MERGE", 2, 0, false);
    declareFunction(myName, "single_literal_pqds_merge", "SINGLE-LITERAL-PQDS-MERGE", 2, 0, false);
    declareFunction(myName, "multi_literal_pqds_merge", "MULTI-LITERAL-PQDS-MERGE", 2, 0, false);
    declareFunction(myName, "multi_clause_pqds_merge", "MULTI-CLAUSE-PQDS-MERGE", 2, 0, false);
    declareFunction(myName, "new_subclause_literal_map", "NEW-SUBCLAUSE-LITERAL-MAP", 2, 1, false);
    declareFunction(myName, "napply_literal_map", "NAPPLY-LITERAL-MAP", 3, 0, false);
    declareFunction(myName, "tree_sum", "TREE-SUM", 1, 0, false);
    declareFunction(myName, "tree_sum_recursive", "TREE-SUM-RECURSIVE", 2, 0, false);
    declareFunction(myName, "tree_min_number", "TREE-MIN-NUMBER", 1, 0, false);
    declareFunction(myName, "tree_min_number_recursive", "TREE-MIN-NUMBER-RECURSIVE", 2, 0, false);
    declareFunction(myName, "validate_problem_store_wrt_mtsd", "VALIDATE-PROBLEM-STORE-WRT-MTSD", 1, 1, false);
    declareFunction(myName, "validate_min_transformation_depth_signature_propagation", "VALIDATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-PROPAGATION", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_inference_min_transformation_depth_file() {
    $intern_problem_query_depth_signature_caching_state$ = deflexical("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*", NIL);
    $pqds_depth_caching_state$ = deflexical("*PQDS-DEPTH-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_min_transformation_depth_file() {
    // CVS_ID("Id: inference-min-transformation-depth.lisp 126640 2008-12-04 13:39:36Z builder ");
    memoization_state.note_globally_cached_function($sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE);
    memoization_state.note_globally_cached_function($sym19$PQDS_DEPTH);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $kw1$COUNTERINTUITIVE = makeKeyword("COUNTERINTUITIVE");
  public static final SubLString $str2$Unexpected_logical_tactic____S = makeString("Unexpected logical-tactic : ~S");
  public static final SubLSymbol $kw3$SKIP = makeKeyword("SKIP");
  public static final SubLString $str4$Time_to_support__S_propagation = makeString("Time to support ~S propagation");
  public static final SubLSymbol $kw5$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLString $str6$Propagation_error____S = makeString("Propagation error : ~S");
  public static final SubLSymbol $kw7$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLList $list8 = list(makeSymbol("PARENT-NEG-LITS"), makeSymbol("PARENT-POS-LITS"));
  public static final SubLList $list9 = list(makeSymbol("CHILD-NEG-LITS"), makeSymbol("CHILD-POS-LITS"));
  public static final SubLSymbol $sym10$MULTI_CLAUSE_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
  public static final SubLSymbol $sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
  public static final SubLSymbol $sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
  public static final SubLSymbol $sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE = makeSymbol("INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE");
  public static final SubLSymbol $sym14$PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");
  public static final SubLSymbol $sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_ = makeSymbol("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*");
  public static final SubLSymbol $kw16$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list17 = list(makeSymbol("NEG-LIT-PQDS"), makeSymbol("POS-LIT-PQDS"));
  public static final SubLList $list18 = list(makeSymbol("NEG-LIT-SPECS"), makeSymbol("POS-LIT-SPECS"));
  public static final SubLSymbol $sym19$PQDS_DEPTH = makeSymbol("PQDS-DEPTH");
  public static final SubLSymbol $kw20$UNINTUITIVE = makeKeyword("UNINTUITIVE");
  public static final SubLSymbol $kw21$INTUITIVE = makeKeyword("INTUITIVE");
  public static final SubLString $str22$unexpected_mode__S = makeString("unexpected mode ~S");
  public static final SubLSymbol $sym23$_PQDS_DEPTH_CACHING_STATE_ = makeSymbol("*PQDS-DEPTH-CACHING-STATE*");
  public static final SubLList $list24 = list(makeSymbol("CLAUSE-NEG-LITS"), makeSymbol("CLAUSE-POS-LITS"));
  public static final SubLList $list25 = list(makeSymbol("SUBCLAUSE-NEG-LITS"), makeSymbol("SUBCLAUSE-POS-LITS"));
  public static final SubLSymbol $sym26$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str27$Failed_literal_map__S = makeString("Failed literal map ~S");
  public static final SubLList $list28 = list(makeSymbol("SOURCE-NEG-MTDS-LIST"), makeSymbol("SOURCE-POS-MTDS-LIST"));
  public static final SubLList $list29 = list(makeSymbol("NEG-LIT-MAP"), makeSymbol("POS-LIT-MAP"));
  public static final SubLSymbol $kw30$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $sym31$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLString $str32$__old__S_new__S_signature__S___S = makeString("~%old ~S new ~S signature ~S~%~S");
  public static final SubLSymbol $sym33$_ = makeSymbol("<");
  public static final SubLSymbol $sym34$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
  public static final SubLString $str35$___S = makeString("~%~S");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_min_transformation_depth_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_min_transformation_depth_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_min_transformation_depth_file();
  }

}
