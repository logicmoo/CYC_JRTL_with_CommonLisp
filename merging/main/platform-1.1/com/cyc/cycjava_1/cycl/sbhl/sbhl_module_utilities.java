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

package com.cyc.cycjava_1.cycl.sbhl;
 import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class sbhl_module_utilities extends SubLTranslatedFile {

  //// Constructor

  private sbhl_module_utilities() {}
  public static final SubLFile me = new sbhl_module_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities";

  //// Definitions

  /** Modifier: initialize and store the DATA for PREDICATE. DATA is an alist */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 737) 
  public static final SubLObject init_sbhl_module_data(SubLObject predicate, SubLObject data) {
    checkType(predicate, $sym0$FORT_P);
    {
      SubLObject module = sbhl_module_vars.new_sbhl_module(predicate);
      SubLObject cdolist_list_var = data;
      SubLObject data_association = NIL;
      for (data_association = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), data_association = cdolist_list_var.first()) {
        {
          SubLObject property = data_association.first();
          SubLObject property_data = conses_high.second(data_association);
          sbhl_module_vars.set_sbhl_module_property(module, property, property_data);
        }
      }
      new_sbhl_module_graph(module);
      sbhl_module_vars.add_sbhl_module(predicate, module);
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1590) 
  private static SubLSymbol $get_sbhl_predicates_caching_state$ = null;

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1590) 
  public static final SubLObject clear_get_sbhl_predicates() {
    {
      SubLObject cs = $get_sbhl_predicates_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1590) 
  public static final SubLObject get_sbhl_predicates_internal() {
    return sbhl_module_vars.get_sbhl_predicates_int();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1590) 
  public static final SubLObject get_sbhl_predicates() {
    {
      SubLObject caching_state = $get_sbhl_predicates_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym1$GET_SBHL_PREDICATES, $sym2$_GET_SBHL_PREDICATES_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if ((results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(get_sbhl_predicates_internal()));
          memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  /** @return booleanp; whether PRED is a member of *sbhl-predicates* */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1869) 
  public static final SubLObject sbhl_predicate_p(SubLObject object) {
    return list_utilities.member_eqP(object, get_sbhl_predicates());
  }

  /** @return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 2387) 
  public static final SubLObject sbhl_non_time_predicate_p(SubLObject object) {
    return makeBoolean(((NIL != sbhl_predicate_p(object))
           && (NIL == sbhl_time_module_p(sbhl_module_vars.get_sbhl_module(object)))));
  }

  /** Accessor: @return fortp; the link predicate associated with MODULE / *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 2918) 
  public static final SubLObject get_sbhl_link_pred(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_link_pred(module);
  }

  /** Accessor: @return fortp; whether MODULE / *sbhl-module* entails directed or undirected direction links */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 3359) 
  public static final SubLObject get_sbhl_link_style(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_link_style(module);
  }

  /** Accessor: @return sbhl-module-type-p. The type of module that MODULE / *sbhl-module* is. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 3881) 
  public static final SubLObject get_sbhl_module_type(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_module_type(module);
  }

  /** Accessor: @return functionp; the function determing whether to terminate a search path, associated with MODULE / *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 4105) 
  public static final SubLObject get_sbhl_path_terminating_markP_fn(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_path_terminating_mark(module);
  }

  /** Accessor: @return functionp; the marking function associated with MODULE / *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 4391) 
  public static final SubLObject get_sbhl_marking_fn(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_marking_fn(module);
  }

  /** Accessor: @return functionp; the unmarking function associated with MODULE / *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 4613) 
  public static final SubLObject get_sbhl_unmarking_fn(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_unmarking_fn(module);
  }

  /** Accessor: @return integerp; the number corresponding to the index-arg position for MODULE / *sbhl-module*. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 5100) 
  public static final SubLObject get_sbhl_index_arg(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_index_arg(module);
  }

  /** Accessor: @return functionp; the function applied to a node's marking before pushing it onto the result */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 5567) 
  public static final SubLObject get_sbhl_add_node_to_result_test(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_property(module, $kw7$ADD_NODE_TO_RESULT_TEST);
  }

  /** Accessor: @return function-spec-p; the function used to test the type of objects used in *sbhl-module* / MODULE */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 6141) 
  public static final SubLObject get_sbhl_type_test(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_type_test(module);
  }

  /** Accessor: @return listp; the list of sbhl predicates allowed by MODULE / *sbhl-module* for following links. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 6902) 
  public static final SubLObject get_sbhl_accessible_link_preds(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_accessible_link_preds(module);
  }

  /** Accessor: @return booleanp. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 7249) 
  public static final SubLObject sbhl_module_indicates_predicate_search_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_property(module, $kw11$PREDICATE_SEARCH_P);
  }

  /** Accessor: @return booleanp; whether the current search module is a disjoins module */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 7780) 
  public static final SubLObject sbhl_disjoins_search_p() {
    return sbhl_module_vars.sbhl_disjoins_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
  }

  /** Accessor: @return booleanp; whether the current module is a time module. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 7981) 
  public static final SubLObject sbhl_time_search_p() {
    return sbhl_module_vars.sbhl_time_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
  }

  /** Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy
   @see sbhl-simple-reflexive-module-type-p or @see sbhl-simple-irreflexive-module-type-p. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 9388) 
  public static final SubLObject sbhl_simple_module_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return makeBoolean(((NIL != sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module)))
          || (NIL != sbhl_module_vars.sbhl_simple_non_reflexive_module_type_p(get_sbhl_module_type(module)))));
  }

  /** Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-time-module-type-p. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 9861) 
  public static final SubLObject sbhl_time_module_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.sbhl_time_module_type_p(get_sbhl_module_type(module));
  }

  /** Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transitive-module-type-p */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 10131) 
  public static final SubLObject sbhl_transitive_module_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.sbhl_transitive_module_type_p(get_sbhl_module_type(module));
  }

  /** Accessor: @return booleanp; is MODULE / *sbhl-module* one which is defined by the fact that it inverts the argument order of another module. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 10415) 
  public static final SubLObject sbhl_inverse_module_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return list_utilities.sublisp_boolean(get_sbhl_module_which_this_module_inverts_arguments_of(module));
  }

  /** Accessor: @return sbhl-module-p. The module which MODULE / *sbhl-module* inverts arguments of. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 11937) 
  public static final SubLObject get_sbhl_module_which_this_module_inverts_arguments_of(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module_property(module, $kw13$INVERTS_ARGUMENTS_OF_MODULE);
      if ((NIL != sbhl_module_vars.sbhl_module_p(inverts_arguments_of_module))) {
        return inverts_arguments_of_module;
      } else if ((NIL == inverts_arguments_of_module)) {
        return NIL;
      } else if ((NIL != sbhl_predicate_p(inverts_arguments_of_module))) {
        inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module(inverts_arguments_of_module);
        sbhl_module_vars.set_sbhl_module_property(module, $kw13$INVERTS_ARGUMENTS_OF_MODULE, inverts_arguments_of_module);
        return inverts_arguments_of_module;
      } else {
        return NIL;
      }
    }
  }

  /** Modifier: stores a hash-table in the :graph field of MODULE */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 12997) 
  public static final SubLObject new_sbhl_module_graph(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject graph = sbhl_graphs.make_new_sbhl_graph();
      sbhl_module_vars.set_sbhl_module_property(module, $kw15$GRAPH, graph);
    }
    return module;
  }

  /** Accessor: @return hash-table-p; the table containing the graph corresonding to link predicate of MODULE / *sbhl-module*. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 13263) 
  public static final SubLObject get_sbhl_graph(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.get_sbhl_module_graph(module);
  }

  /** Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-disjoins-module-type-p. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 13773) 
  public static final SubLObject sbhl_disjoins_module_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.sbhl_disjoins_module_type_p(get_sbhl_module_type(module));
  }

  /** Accessor: @return sbhl-module-p. The associated module to MODULE / *sbhl-module* for disjoins. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 14059) 
  public static final SubLObject get_sbhl_disjoins_module(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject disjoins_module = sbhl_module_vars.get_sbhl_module_property(module, $kw16$DISJOINS_MODULE);
      if ((NIL != sbhl_module_vars.sbhl_module_p(disjoins_module))) {
        return disjoins_module;
      } else if ((NIL == disjoins_module)) {
        return NIL;
      } else if ((NIL != sbhl_predicate_p(disjoins_module))) {
        disjoins_module = sbhl_module_vars.get_sbhl_module(disjoins_module);
        sbhl_module_vars.set_sbhl_module_property(module, $kw16$DISJOINS_MODULE, disjoins_module);
        return disjoins_module;
      } else {
        return NIL;
      }
    }
  }

  /** Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transfers-through-module-type-p. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 14717) 
  public static final SubLObject sbhl_transfers_through_module_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.sbhl_transfers_through_module_type_p(get_sbhl_module_type(module));
  }

  /** returns the module, if any, that MODULE uses to transfer through. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 15024) 
  public static final SubLObject get_sbhl_transfers_through_module(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject tt_module = sbhl_module_vars.get_sbhl_module_property(module, $kw17$TRANSFERS_THROUGH_MODULE);
      if ((NIL != sbhl_module_vars.sbhl_module_p(tt_module))) {
        return tt_module;
      } else if ((NIL == tt_module)) {
        return NIL;
      } else if ((NIL != sbhl_predicate_p(tt_module))) {
        tt_module = sbhl_module_vars.get_sbhl_module(tt_module);
        sbhl_module_vars.set_sbhl_module_property(module, $kw17$TRANSFERS_THROUGH_MODULE, tt_module);
        return tt_module;
      } else {
        return NIL;
      }
    }
  }

  /** Accessor: @return booleanp; whether MODULE is for a reflexive predicate or not. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 15626) 
  public static final SubLObject sbhl_reflexive_module_p(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module));
  }

  /** Accessor: @return sbhl-predicate-object-p; If current search is a disjoins search, returns the module it transfers through. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 15889) 
  public static final SubLObject get_sbhl_disjoins_search_tt_module(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return ((NIL != sbhl_disjoins_module_p(module)) ? ((SubLObject) get_sbhl_transfers_through_module(module)) : module);
  }

  /** Accessor: @return sbhl-predicate-object-p; Module for minimizations and maximizations. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 16239) 
  public static final SubLObject get_sbhl_reductions_module(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject tt_module = get_sbhl_transfers_through_module(module);
      SubLObject search_module = ((NIL != module) ? ((SubLObject) module) : sbhl_search_vars.get_sbhl_search_module());
      if ((NIL != tt_module)) {
        return tt_module;
      } else {
        if ((sbhl_module_vars.get_sbhl_module_link_pred(search_module) == $const18$genlInverse)) {
          return sbhl_module_vars.get_sbhl_module($const19$genlPreds);
        } else {
          return search_module;
        }
      }
    }
  }

  /** Accessor: @return sbhl-predicate-object-p; the module corresponding to MODULE to be used for premarking in searches. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 16888) 
  public static final SubLObject get_sbhl_premark_module(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return ((NIL != sbhl_disjoins_module_p(module)) ? ((SubLObject) get_sbhl_transfers_through_module(module)) : module);
  }

  /** Accessor: @return keywordp; the keyword that relates MODULE / *sbhl-module* to either :predicate or :link direction */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 17771) 
  public static final SubLObject get_sbhl_module_forward_direction(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return ((NIL != sbhl_module_directed_linksP(module)) ? ((SubLObject) sbhl_link_vars.get_sbhl_forward_directed_direction()) : sbhl_link_vars.get_sbhl_undirected_direction());
  }

  /** Accessor: @return keywordp; the keyword that relates MODULE to either :inverse or :link direction */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 18121) 
  public static final SubLObject get_sbhl_module_backward_direction(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return ((NIL != sbhl_module_directed_linksP(module)) ? ((SubLObject) sbhl_link_vars.get_sbhl_backward_directed_direction()) : sbhl_link_vars.get_sbhl_undirected_direction());
  }

  /** Accessor: @return booleanp; whether MODULE / *sbhl-module* is a directed or undirected graph */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 19032) 
  public static final SubLObject sbhl_module_directed_linksP(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return sbhl_module_vars.fort_denotes_sbhl_directed_graph_p(get_sbhl_link_style(module));
  }

  /** Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 19319) 
  public static final SubLObject sbhl_search_direction_to_link_direction(SubLObject direction, SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    if ((NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction))) {
      return get_sbhl_module_forward_direction(module);
    } else if ((NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction))) {
      return get_sbhl_module_backward_direction(module);
    } else {
      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$invalid_sbhl_search_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Accessor: @return listp; of the keywords for relevant directions for links of MODULE / *sbhl-module*. if *sbhl-link-direction* is specified, it will return with a list of either the forward-direction for MODULE / *sbhl-module* or the backward-direction for MODULE / *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 20413) 
  public static final SubLObject get_relevant_sbhl_directions(SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    return (((NIL != sbhl_link_vars.get_sbhl_link_direction())
           && (NIL != module)) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2481")) : ((NIL != sbhl_module_directed_linksP(module)) ? ((SubLObject) sbhl_link_vars.get_sbhl_directed_directions()) : sbhl_link_vars.get_sbhl_undirected_direction_as_list()));
  }

  /** The cardinality of NODE with MODULE in the predicate direction */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 21098) 
  public static final SubLObject sbhl_predicate_cardinality(SubLObject module, SubLObject node) {
    checkType(module, $sym4$SBHL_MODULE_P);
    if ((NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
      return ZERO_INTEGER;
    }
    return cardinality_estimates.genl_cardinality(node);
  }

  /** The cardinality of NODE with PRED in the inverse direction */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 21470) 
  public static final SubLObject sbhl_inverse_cardinality(SubLObject module, SubLObject node) {
    checkType(module, $sym4$SBHL_MODULE_P);
    if ((NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
      return ZERO_INTEGER;
    }
    return cardinality_estimates.spec_cardinality(node);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 23076) 
  public static final SubLObject sbhl_pred_get_hl_module(SubLObject pred) {
    checkType(pred, $sym28$SBHL_PREDICATE_P);
    {
      SubLObject pcase_var = pred;
      if (pcase_var.eql($const29$genls)) {
        return $kw30$GENLS;
      } else if (pcase_var.eql($const31$isa)) {
        return $kw33$ISA;
      } else if (pcase_var.eql($const32$quotedIsa)) {
        return $kw33$ISA;
      } else if (pcase_var.eql($const19$genlPreds)) {
        return $kw34$GENLPREDS;
      } else if (pcase_var.eql($const18$genlInverse)) {
        return $kw34$GENLPREDS;
      } else if (pcase_var.eql($const35$genlMt)) {
        return $kw37$GENLMT;
      } else if (pcase_var.eql($const38$disjointWith)) {
        return $kw39$DISJOINTWITH;
      } else if (pcase_var.eql($const40$negationPreds)) {
        return $kw42$NEGATIONPREDS;
      } else if (pcase_var.eql($const41$negationInverse)) {
        return $kw42$NEGATIONPREDS;
      } else if (pcase_var.eql($const36$negationMt)) {
        return $kw37$GENLMT;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25355) 
  public static final SubLObject sbhl_isa_collection_p(SubLObject node) {
    return fort_types_interface.isa_collectionP(function_terms.naut_to_nart(node), UNPROVIDED);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25450) 
  public static final SubLObject sbhl_isa_microtheory_p(SubLObject node) {
    return fort_types_interface.isa_mtP(function_terms.naut_to_nart(node), UNPROVIDED);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25538) 
  public static final SubLObject sbhl_isa_predicate_p(SubLObject node) {
    return fort_types_interface.isa_predicateP(function_terms.naut_to_nart(node), UNPROVIDED);
  }

  /** @hack reduce funcalls. Applies to NODE the @see get-sbhl-module-type-test. */
  @SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25631) 
  public static final SubLObject apply_sbhl_module_type_test(SubLObject node, SubLObject module) {
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject test_fn = get_sbhl_type_test(module);
      if ((NIL != test_fn)) {
        {
          SubLObject pcase_var = test_fn;
          if (pcase_var.eql($sym49$COLLECTION_P)) {
            return sbhl_isa_collection_p(node);
          } else if (pcase_var.eql($sym50$MICROTHEORY_P)) {
            return sbhl_isa_microtheory_p(node);
          } else if (pcase_var.eql($sym51$PREDICATE_P)) {
            return sbhl_isa_predicate_p(node);
          } else {
            return NIL;
          }
        }
      } else {
        return T;
      }
    }
  }

  public static final SubLObject declare_sbhl_module_utilities_file() {
    declareFunction("init_sbhl_module_data", "INIT-SBHL-MODULE-DATA", 2, 0, false);
    declareFunction("clear_get_sbhl_predicates", "CLEAR-GET-SBHL-PREDICATES", 0, 0, false);
    //declareFunction("remove_get_sbhl_predicates", "REMOVE-GET-SBHL-PREDICATES", 0, 0, false);
    declareFunction("get_sbhl_predicates_internal", "GET-SBHL-PREDICATES-INTERNAL", 0, 0, false);
    declareFunction("get_sbhl_predicates", "GET-SBHL-PREDICATES", 0, 0, false);
    declareFunction("sbhl_predicate_p", "SBHL-PREDICATE-P", 1, 0, false);
    //declareFunction("sbhl_module_or_predicate_p", "SBHL-MODULE-OR-PREDICATE-P", 1, 0, false);
    //declareFunction("sbhl_non_time_module_p", "SBHL-NON-TIME-MODULE-P", 1, 0, false);
    declareFunction("sbhl_non_time_predicate_p", "SBHL-NON-TIME-PREDICATE-P", 1, 0, false);
    //declareFunction("sbhl_graph_p", "SBHL-GRAPH-P", 1, 0, false);
    declareFunction("get_sbhl_link_pred", "GET-SBHL-LINK-PRED", 1, 0, false);
    declareFunction("get_sbhl_link_style", "GET-SBHL-LINK-STYLE", 1, 0, false);
    //declareFunction("get_sbhl_module_naut_forward_true_generators", "GET-SBHL-MODULE-NAUT-FORWARD-TRUE-GENERATORS", 1, 0, false);
    declareFunction("get_sbhl_module_type", "GET-SBHL-MODULE-TYPE", 1, 0, false);
    declareFunction("get_sbhl_path_terminating_markP_fn", "GET-SBHL-PATH-TERMINATING-MARK?-FN", 1, 0, false);
    declareFunction("get_sbhl_marking_fn", "GET-SBHL-MARKING-FN", 1, 0, false);
    declareFunction("get_sbhl_unmarking_fn", "GET-SBHL-UNMARKING-FN", 1, 0, false);
    //declareFunction("get_sbhl_module_marking_increment", "GET-SBHL-MODULE-MARKING-INCREMENT", 1, 0, false);
    declareFunction("get_sbhl_index_arg", "GET-SBHL-INDEX-ARG", 1, 0, false);
    //declareFunction("get_sbhl_gather_arg", "GET-SBHL-GATHER-ARG", 1, 0, false);
    declareFunction("get_sbhl_add_node_to_result_test", "GET-SBHL-ADD-NODE-TO-RESULT-TEST", 1, 0, false);
    //declareFunction("get_sbhl_add_unmarked_node_to_result_test", "GET-SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST", 1, 0, false);
    declareFunction("get_sbhl_type_test", "GET-SBHL-TYPE-TEST", 1, 0, false);
    //declareFunction("get_sbhl_module_root", "GET-SBHL-MODULE-ROOT", 1, 0, false);
    //declareFunction("get_sbhl_transfers_via_arg", "GET-SBHL-TRANSFERS-VIA-ARG", 1, 0, false);
    declareFunction("get_sbhl_accessible_link_preds", "GET-SBHL-ACCESSIBLE-LINK-PREDS", 1, 0, false);
    declareFunction("sbhl_module_indicates_predicate_search_p", "SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P", 1, 0, false);
    //declareFunction("get_sbhl_node_modules", "GET-SBHL-NODE-MODULES", 1, 0, false);
    declareFunction("sbhl_disjoins_search_p", "SBHL-DISJOINS-SEARCH-P", 0, 0, false);
    declareFunction("sbhl_time_search_p", "SBHL-TIME-SEARCH-P", 0, 0, false);
    //declareFunction("sbhl_root_p", "SBHL-ROOT-P", 2, 0, false);
    //declareFunction("get_sbhl_inverse_link_module", "GET-SBHL-INVERSE-LINK-MODULE", 1, 0, false);
    //declareFunction("get_sbhl_module_relevant_naut_link_generators", "GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS", 3, 0, false);
    declareFunction("sbhl_simple_module_p", "SBHL-SIMPLE-MODULE-P", 1, 0, false);
    declareFunction("sbhl_time_module_p", "SBHL-TIME-MODULE-P", 1, 0, false);
    declareFunction("sbhl_transitive_module_p", "SBHL-TRANSITIVE-MODULE-P", 1, 0, false);
    declareFunction("sbhl_inverse_module_p", "SBHL-INVERSE-MODULE-P", 1, 0, false);
    //declareFunction("get_sbhl_inverse_module", "GET-SBHL-INVERSE-MODULE", 1, 0, false);
    //declareFunction("get_sbhl_module_with_inverted_arguments", "GET-SBHL-MODULE-WITH-INVERTED-ARGUMENTS", 1, 0, false);
    declareFunction("get_sbhl_module_which_this_module_inverts_arguments_of", "GET-SBHL-MODULE-WHICH-THIS-MODULE-INVERTS-ARGUMENTS-OF", 1, 0, false);
    //declareFunction("get_sbhl_module_tag", "GET-SBHL-MODULE-TAG", 1, 0, false);
    declareFunction("new_sbhl_module_graph", "NEW-SBHL-MODULE-GRAPH", 1, 0, false);
    declareFunction("get_sbhl_graph", "GET-SBHL-GRAPH", 1, 0, false);
    //declareFunction("get_sbhl_graphs", "GET-SBHL-GRAPHS", 0, 0, false);
    declareFunction("sbhl_disjoins_module_p", "SBHL-DISJOINS-MODULE-P", 1, 0, false);
    declareFunction("get_sbhl_disjoins_module", "GET-SBHL-DISJOINS-MODULE", 1, 0, false);
    declareFunction("sbhl_transfers_through_module_p", "SBHL-TRANSFERS-THROUGH-MODULE-P", 1, 0, false);
    declareFunction("get_sbhl_transfers_through_module", "GET-SBHL-TRANSFERS-THROUGH-MODULE", 1, 0, false);
    declareFunction("sbhl_reflexive_module_p", "SBHL-REFLEXIVE-MODULE-P", 1, 0, false);
    declareFunction("get_sbhl_disjoins_search_tt_module", "GET-SBHL-DISJOINS-SEARCH-TT-MODULE", 1, 0, false);
    declareFunction("get_sbhl_reductions_module", "GET-SBHL-REDUCTIONS-MODULE", 1, 0, false);
    declareFunction("get_sbhl_premark_module", "GET-SBHL-PREMARK-MODULE", 1, 0, false);
    //declareFunction("sbhl_search_direction_p", "SBHL-SEARCH-DIRECTION-P", 1, 0, false);
    //declareFunction("sbhl_forward_direction_for_module_p", "SBHL-FORWARD-DIRECTION-FOR-MODULE-P", 2, 0, false);
    declareFunction("get_sbhl_module_forward_direction", "GET-SBHL-MODULE-FORWARD-DIRECTION", 1, 0, false);
    declareFunction("get_sbhl_module_backward_direction", "GET-SBHL-MODULE-BACKWARD-DIRECTION", 1, 0, false);
    //declareFunction("get_sbhl_opposite_search_direction", "GET-SBHL-OPPOSITE-SEARCH-DIRECTION", 0, 1, false);
    declareFunction("sbhl_module_directed_linksP", "SBHL-MODULE-DIRECTED-LINKS?", 1, 0, false);
    declareFunction("sbhl_search_direction_to_link_direction", "SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION", 2, 0, false);
    //declareFunction("sbhl_search_direction_to_opposite_link_direction", "SBHL-SEARCH-DIRECTION-TO-OPPOSITE-LINK-DIRECTION", 2, 0, false);
    declareFunction("get_relevant_sbhl_directions", "GET-RELEVANT-SBHL-DIRECTIONS", 1, 0, false);
    declareFunction("sbhl_predicate_cardinality", "SBHL-PREDICATE-CARDINALITY", 2, 0, false);
    declareFunction("sbhl_inverse_cardinality", "SBHL-INVERSE-CARDINALITY", 2, 0, false);
    //declareFunction("sbhl_module_hl_support_module", "SBHL-MODULE-HL-SUPPORT-MODULE", 1, 0, false);
    //declareFunction("sbhl_pred_hl_support_module", "SBHL-PRED-HL-SUPPORT-MODULE", 1, 0, false);
    //declareFunction("sbhl_old_mode", "SBHL-OLD-MODE", 2, 0, false);
    declareFunction("sbhl_pred_get_hl_module", "SBHL-PRED-GET-HL-MODULE", 1, 0, false);
    //declareFunction("sbhl_old_module", "SBHL-OLD-MODULE", 1, 0, false);
    //declareFunction("sbhl_predicate_for_hl_module", "SBHL-PREDICATE-FOR-HL-MODULE", 1, 0, false);
    //declareFunction("sbhl_predicate_from_fort_type", "SBHL-PREDICATE-FROM-FORT-TYPE", 1, 0, false);
    //declareFunction("sbhl_node_has_type_associated_to_predicate_p", "SBHL-NODE-HAS-TYPE-ASSOCIATED-TO-PREDICATE-P", 2, 0, false);
    //declareFunction("determine_sbhl_predicate_from_fort_type", "DETERMINE-SBHL-PREDICATE-FROM-FORT-TYPE", 1, 1, false);
    //declareFunction("determine_sbhl_module_from_fort_type", "DETERMINE-SBHL-MODULE-FROM-FORT-TYPE", 1, 1, false);
    //declareFunction("sbhl_node_with_any_sbhl_type_p", "SBHL-NODE-WITH-ANY-SBHL-TYPE-P", 1, 1, false);
    //declareFunction("sbhl_fortP", "SBHL-FORT?", 1, 0, false);
    declareFunction("sbhl_isa_collection_p", "SBHL-ISA-COLLECTION-P", 1, 0, false);
    declareFunction("sbhl_isa_microtheory_p", "SBHL-ISA-MICROTHEORY-P", 1, 0, false);
    declareFunction("sbhl_isa_predicate_p", "SBHL-ISA-PREDICATE-P", 1, 0, false);
    declareFunction("apply_sbhl_module_type_test", "APPLY-SBHL-MODULE-TYPE-TEST", 2, 0, false);
    //declareFunction("sbhl_module_meets_requisitesP", "SBHL-MODULE-MEETS-REQUISITES?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_module_utilities_file() {
    $get_sbhl_predicates_caching_state$ = deflexical("*GET-SBHL-PREDICATES-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_module_utilities_file() {
        memoization_state.note_globally_cached_function($sym1$GET_SBHL_PREDICATES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym1$GET_SBHL_PREDICATES = makeSymbol("GET-SBHL-PREDICATES");
  public static final SubLSymbol $sym2$_GET_SBHL_PREDICATES_CACHING_STATE_ = makeSymbol("*GET-SBHL-PREDICATES-CACHING-STATE*");
  public static final SubLSymbol $kw3$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym4$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $kw5$NAUT_FORWARD_TRUE_GENERATORS = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
  public static final SubLSymbol $kw6$MARKING_INCREMENT = makeKeyword("MARKING-INCREMENT");
  public static final SubLSymbol $kw7$ADD_NODE_TO_RESULT_TEST = makeKeyword("ADD-NODE-TO-RESULT-TEST");
  public static final SubLSymbol $kw8$ADD_UNMARKED_NODE_TO_RESULT_TEST = makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");
  public static final SubLSymbol $kw9$ROOT = makeKeyword("ROOT");
  public static final SubLSymbol $kw10$TRANSFERS_VIA_ARG = makeKeyword("TRANSFERS-VIA-ARG");
  public static final SubLSymbol $kw11$PREDICATE_SEARCH_P = makeKeyword("PREDICATE-SEARCH-P");
  public static final SubLSymbol $kw12$MODULE_INVERTS_ARGUMENTS = makeKeyword("MODULE-INVERTS-ARGUMENTS");
  public static final SubLSymbol $kw13$INVERTS_ARGUMENTS_OF_MODULE = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
  public static final SubLSymbol $kw14$MODULE_TAG = makeKeyword("MODULE-TAG");
  public static final SubLSymbol $kw15$GRAPH = makeKeyword("GRAPH");
  public static final SubLSymbol $kw16$DISJOINS_MODULE = makeKeyword("DISJOINS-MODULE");
  public static final SubLSymbol $kw17$TRANSFERS_THROUGH_MODULE = makeKeyword("TRANSFERS-THROUGH-MODULE");
  public static final SubLObject $const18$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLObject $const19$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw20$ERROR = makeKeyword("ERROR");
  public static final SubLString $str21$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym22$SBHL_SEARCH_DIRECTION_P = makeSymbol("SBHL-SEARCH-DIRECTION-P");
  public static final SubLSymbol $kw23$CERROR = makeKeyword("CERROR");
  public static final SubLString $str24$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw25$WARN = makeKeyword("WARN");
  public static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str27$invalid_sbhl_search_direction__a = makeString("invalid sbhl-search-direction ~a");
  public static final SubLSymbol $sym28$SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");
  public static final SubLObject $const29$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw30$GENLS = makeKeyword("GENLS");
  public static final SubLObject $const31$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const32$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $kw33$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw34$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLObject $const35$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLObject $const36$negationMt = constant_handles.reader_make_constant_shell(makeString("negationMt"));
  public static final SubLSymbol $kw37$GENLMT = makeKeyword("GENLMT");
  public static final SubLObject $const38$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLSymbol $kw39$DISJOINTWITH = makeKeyword("DISJOINTWITH");
  public static final SubLObject $const40$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLObject $const41$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $kw42$NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
  public static final SubLSymbol $kw43$NEGATION = makeKeyword("NEGATION");
  public static final SubLSymbol $kw44$SUPERIOR = makeKeyword("SUPERIOR");
  public static final SubLSymbol $kw45$INFERIOR = makeKeyword("INFERIOR");
  public static final SubLObject $const46$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLObject $const47$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));
  public static final SubLObject $const48$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLSymbol $sym49$COLLECTION_P = makeSymbol("COLLECTION-P");
  public static final SubLSymbol $sym50$MICROTHEORY_P = makeSymbol("MICROTHEORY-P");
  public static final SubLSymbol $sym51$PREDICATE_P = makeSymbol("PREDICATE-P");
  public static final SubLSymbol $sym52$FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");
  public static final SubLSymbol $sym53$FUNCTION_SYMBOL_LIST_P = makeSymbol("FUNCTION-SYMBOL-LIST-P");
  public static final SubLString $str54$Data___a__associated_with_propert = makeString("Data, ~a, associated with property, ~a, does not satisfy data test, ~a");
  public static final SubLString $str55$No_data_associated_with_required_ = makeString("No data associated with required property ~a");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_module_utilities_file();
  }

  public void initializeVariables() {
    init_sbhl_module_utilities_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_module_utilities_file();
  }

}
