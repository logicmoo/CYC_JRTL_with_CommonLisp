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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.map_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class graph_utilities extends SubLTranslatedFile {

  //// Constructor

  private graph_utilities() {}
  public static final SubLFile me = new graph_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.graph_utilities";

  //// Definitions

  /** Given a list of NODES, and a list of LINKS which relate these nodes,
   categorize the nodes into island-groups, where each group consists of a list of
   connected nodes, and a list of links involving these nodes.
   Returns 3 values :
   CONNECTED-GROUPS -- list of island groups with multiple nodes.
   ISOLATED-GROUPS  -- list of island groups with single nodes and some links.
   NAKED-GROUPS     -- list of island groups with single nodes and no links. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 842) 
  public static final SubLObject categorize_nodes_via_links(SubLObject nodes, SubLObject links, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject all_island_groups = NIL;
      {
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
          all_island_groups = cons(list(list(node), NIL), all_island_groups);
        }
      }
      {
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        for (link = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), link = cdolist_list_var.first()) {
          {
            SubLObject link_nodes = extract_link_nodes(link, nodes, test);
            SubLObject island_groups = extract_island_groups(link_nodes, all_island_groups, test);
            SubLObject island_group = NIL;
            if ((NIL != list_utilities.singletonP(island_groups))) {
              island_group = island_groups.first();
            } else {
              {
                SubLObject merged_island_group = merge_island_groups(island_groups);
                all_island_groups = conses_high.set_difference(all_island_groups, island_groups, UNPROVIDED, UNPROVIDED);
                all_island_groups = cons(merged_island_group, all_island_groups);
                island_group = merged_island_group;
              }
            }
            {
              SubLObject datum = island_group;
              SubLObject current = datum;
              SubLObject group_nodes = NIL;
              SubLObject group_links = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
              group_nodes = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
              group_links = current.first();
              current = current.rest();
              if ((NIL == current)) {
                ConsesLow.set_nth(ONE_INTEGER, island_group, cons(link, group_links));
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
              }
            }
          }
        }
      }
      {
        SubLObject connected_groups = NIL;
        SubLObject isolated_groups = NIL;
        SubLObject naked_groups = NIL;
        SubLObject cdolist_list_var = all_island_groups;
        SubLObject island_group = NIL;
        for (island_group = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), island_group = cdolist_list_var.first()) {
          {
            SubLObject datum = island_group;
            SubLObject current = datum;
            SubLObject group_nodes = NIL;
            SubLObject group_links = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
            group_nodes = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
            group_links = current.first();
            current = current.rest();
            if ((NIL == current)) {
              if ((NIL != list_utilities.singletonP(group_nodes))) {
                if ((NIL == group_links)) {
                  naked_groups = cons(island_group, naked_groups);
                } else {
                  isolated_groups = cons(island_group, isolated_groups);
                }
              } else {
                connected_groups = cons(island_group, connected_groups);
              }
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
            }
          }
        }
        if (ONE_INTEGER.numE(Sequences.length(nodes))) {
          connected_groups = isolated_groups;
          isolated_groups = NIL;
        }
        connected_groups = sort_connected_groups(connected_groups, nodes, links, test);
        isolated_groups = sort_isolated_groups(isolated_groups, nodes, links, test);
        naked_groups = sort_naked_groups(naked_groups, nodes, test);
        return Values.values(connected_groups, isolated_groups, naked_groups);
      }
    }
  }

  @SubL(source = "cycl/graph-utilities.lisp", position = 3695) 
  private static SubLSymbol $extract_link_nodes_nodes$ = null;

  @SubL(source = "cycl/graph-utilities.lisp", position = 3764) 
  private static SubLSymbol $extract_link_nodes_test$ = null;

  /** Extract a subset of CANDIDATE-NODES mentioned in LINK. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 3818) 
  public static final SubLObject extract_link_nodes(SubLObject link, SubLObject candidate_nodes, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = $extract_link_nodes_nodes$.currentBinding(thread);
          SubLObject _prev_bind_1 = $extract_link_nodes_test$.currentBinding(thread);
          try {
            $extract_link_nodes_nodes$.bind(candidate_nodes, thread);
            $extract_link_nodes_test$.bind(test, thread);
            answer = list_utilities.tree_gather(link, $sym1$EXTRACT_LINK_NODES_INT, test, UNPROVIDED, UNPROVIDED);
          } finally {
            $extract_link_nodes_test$.rebind(_prev_bind_1, thread);
            $extract_link_nodes_nodes$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "cycl/graph-utilities.lisp", position = 4160) 
  public static final SubLObject extract_link_nodes_int(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return subl_promotions.memberP(object, $extract_link_nodes_nodes$.getDynamicValue(thread), $extract_link_nodes_test$.getDynamicValue(thread), UNPROVIDED);
    }
  }

  public static final class $extract_link_nodes_int$UnaryFunction extends UnaryFunction {
    public $extract_link_nodes_int$UnaryFunction() { super(extractFunctionNamed("EXTRACT-LINK-NODES-INT")); }
    public SubLObject processItem(SubLObject arg1) { return extract_link_nodes_int(arg1); }
  }

  /** Extract a subset of CANDIDATE-ISLAND-GROUPS whose nodes intersect NODES. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 4288) 
  public static final SubLObject extract_island_groups(SubLObject nodes, SubLObject candidate_island_groups, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject island_groups = NIL;
      SubLObject cdolist_list_var = nodes;
      SubLObject node = NIL;
      for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
        {
          SubLObject island_group = island_group_for_node(node, candidate_island_groups, test);
          SubLObject item_var = island_group;
          if ((NIL == conses_high.member(item_var, island_groups, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            island_groups = cons(item_var, island_groups);
          }
        }
      }
      return island_groups;
    }
  }

  /** Return the associated island-group for NODE from ISLAND-GROUPS. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 4669) 
  public static final SubLObject island_group_for_node(SubLObject node, SubLObject island_groups, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject answer = NIL;
      if ((NIL == answer)) {
        {
          SubLObject csome_list_var = island_groups;
          SubLObject island_group = NIL;
          for (island_group = csome_list_var.first(); (!(((NIL != answer)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), island_group = csome_list_var.first()) {
            {
              SubLObject datum = island_group;
              SubLObject current = datum;
              SubLObject nodes = NIL;
              SubLObject links = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
              nodes = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
              links = current.first();
              current = current.rest();
              if ((NIL == current)) {
                if ((NIL != subl_promotions.memberP(node, nodes, test, UNPROVIDED))) {
                  answer = island_group;
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
              }
            }
          }
        }
      }
      return answer;
    }
  }

  /** Merge every island-group in ISLAND-GROUPS into a single resulting group. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 5041) 
  public static final SubLObject merge_island_groups(SubLObject island_groups) {
    {
      SubLObject merged_group_nodes = NIL;
      SubLObject merged_group_links = NIL;
      SubLObject cdolist_list_var = island_groups;
      SubLObject island_group = NIL;
      for (island_group = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), island_group = cdolist_list_var.first()) {
        {
          SubLObject datum = island_group;
          SubLObject current = datum;
          SubLObject group_nodes = NIL;
          SubLObject group_links = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
          group_nodes = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
          group_links = current.first();
          current = current.rest();
          if ((NIL == current)) {
            {
              SubLObject cdolist_list_var_1 = group_nodes;
              SubLObject node = NIL;
              for (node = cdolist_list_var_1.first(); (NIL != cdolist_list_var_1); cdolist_list_var_1 = cdolist_list_var_1.rest(), node = cdolist_list_var_1.first()) {
                merged_group_nodes = cons(node, merged_group_nodes);
              }
            }
            {
              SubLObject cdolist_list_var_2 = group_links;
              SubLObject link = NIL;
              for (link = cdolist_list_var_2.first(); (NIL != cdolist_list_var_2); cdolist_list_var_2 = cdolist_list_var_2.rest(), link = cdolist_list_var_2.first()) {
                merged_group_links = cons(link, merged_group_links);
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
          }
        }
      }
      {
        SubLObject merged_island_group = list(merged_group_nodes, merged_group_links);
        return merged_island_group;
      }
    }
  }

  /** Sort CONNECTED-GROUPS based on ALL-NODES and ALL-LNIKS. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 5586) 
  public static final SubLObject sort_connected_groups(SubLObject connected_groups, SubLObject all_nodes, SubLObject all_links, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject cdolist_list_var = connected_groups;
      SubLObject island_group = NIL;
      for (island_group = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), island_group = cdolist_list_var.first()) {
        {
          SubLObject datum = island_group;
          SubLObject current = datum;
          SubLObject nodes = NIL;
          SubLObject links = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
          nodes = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
          links = current.first();
          current = current.rest();
          if ((NIL == current)) {
            ConsesLow.set_nth(ZERO_INTEGER, island_group, list_utilities.sort_via_position(nodes, all_nodes, Symbols.symbol_function(EQL), UNPROVIDED));
            ConsesLow.set_nth(ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, Symbols.symbol_function(EQL), UNPROVIDED));
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
          }
        }
      }
    }
    connected_groups = list_utilities.sort_via_position(connected_groups, all_nodes, test, Symbols.symbol_function($sym3$CAAR));
    return Sort.stable_sort(connected_groups, Symbols.symbol_function($sym4$_), Symbols.symbol_function($sym5$LENGTH_FIRST));
  }

  @SubL(source = "cycl/graph-utilities.lisp", position = 6165) 
  public static final SubLObject length_first(SubLObject object) {
    return Sequences.length(object.first());
  }

  public static final class $length_first$UnaryFunction extends UnaryFunction {
    public $length_first$UnaryFunction() { super(extractFunctionNamed("LENGTH-FIRST")); }
    public SubLObject processItem(SubLObject arg1) { return length_first(arg1); }
  }

  /** Sort ISOLATED-GROUPS based on ALL-NODES and ALL-LNIKS. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 6237) 
  public static final SubLObject sort_isolated_groups(SubLObject isolated_groups, SubLObject all_nodes, SubLObject all_links, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject cdolist_list_var = isolated_groups;
      SubLObject island_group = NIL;
      for (island_group = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), island_group = cdolist_list_var.first()) {
        {
          SubLObject datum = island_group;
          SubLObject current = datum;
          SubLObject nodes = NIL;
          SubLObject links = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
          nodes = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
          links = current.first();
          current = current.rest();
          if ((NIL == current)) {
            ConsesLow.set_nth(ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, Symbols.symbol_function(EQL), UNPROVIDED));
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
          }
        }
      }
    }
    return list_utilities.sort_via_position(isolated_groups, all_nodes, test, Symbols.symbol_function($sym3$CAAR));
  }

  /** Sort NAKED-GROUPS based on ALL-NODES. */
  @SubL(source = "cycl/graph-utilities.lisp", position = 6656) 
  public static final SubLObject sort_naked_groups(SubLObject naked_groups, SubLObject all_nodes, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return list_utilities.sort_via_position(naked_groups, all_nodes, test, Symbols.symbol_function($sym3$CAAR));
  }

  public static final SubLObject declare_graph_utilities_file() {
    declareFunction(myName, "categorize_nodes_via_links", "CATEGORIZE-NODES-VIA-LINKS", 2, 1, false);
    declareFunction(myName, "extract_link_nodes", "EXTRACT-LINK-NODES", 2, 1, false);
    declareFunction(myName, "extract_link_nodes_int", "EXTRACT-LINK-NODES-INT", 1, 0, false); new $extract_link_nodes_int$UnaryFunction();
    declareFunction(myName, "extract_island_groups", "EXTRACT-ISLAND-GROUPS", 2, 1, false);
    declareFunction(myName, "island_group_for_node", "ISLAND-GROUP-FOR-NODE", 2, 1, false);
    declareFunction(myName, "merge_island_groups", "MERGE-ISLAND-GROUPS", 1, 0, false);
    declareFunction(myName, "sort_connected_groups", "SORT-CONNECTED-GROUPS", 3, 1, false);
    declareFunction(myName, "length_first", "LENGTH-FIRST", 1, 0, false); new $length_first$UnaryFunction();
    declareFunction(myName, "sort_isolated_groups", "SORT-ISOLATED-GROUPS", 3, 1, false);
    declareFunction(myName, "sort_naked_groups", "SORT-NAKED-GROUPS", 2, 1, false);
    declareMacro(myName, "walk_graph_breadth_first", "WALK-GRAPH-BREADTH-FIRST");
    declareFunction(myName, "compute_graph_rank_estimate", "COMPUTE-GRAPH-RANK-ESTIMATE", 1, 2, false);
    declareFunction(myName, "test_compute_graph_rank_estimate", "TEST-COMPUTE-GRAPH-RANK-ESTIMATE", 2, 1, false);
    declareFunction(myName, "graph_rank_estimates_equalP", "GRAPH-RANK-ESTIMATES-EQUAL?", 2, 0, false);
    declareFunction(myName, "dag_identify_leafs", "DAG-IDENTIFY-LEAFS", 1, 1, false);
    declareFunction(myName, "test_dag_identify_leafs", "TEST-DAG-IDENTIFY-LEAFS", 2, 0, false);
    declareFunction(myName, "dag_identify_roots", "DAG-IDENTIFY-ROOTS", 1, 1, false);
    declareFunction(myName, "test_dag_identify_roots", "TEST-DAG-IDENTIFY-ROOTS", 2, 0, false);
    declareFunction(myName, "dag_transitive_upward_closure", "DAG-TRANSITIVE-UPWARD-CLOSURE", 2, 0, false);
    declareFunction(myName, "dag_elide_from_graph", "DAG-ELIDE-FROM-GRAPH", 2, 2, false);
    declareFunction(myName, "dag_elide_from_graph_internal", "DAG-ELIDE-FROM-GRAPH-INTERNAL", 4, 0, false);
    declareFunction(myName, "test_dag_elide_from_graph", "TEST-DAG-ELIDE-FROM-GRAPH", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_graph_utilities_file() {
    $extract_link_nodes_nodes$ = defparameter("*EXTRACT-LINK-NODES-NODES*", NIL);
    $extract_link_nodes_test$ = defparameter("*EXTRACT-LINK-NODES-TEST*", NIL);
    return NIL;
  }

  public static final SubLObject setup_graph_utilities_file() {
        generic_testing.define_test_case_table_int($sym28$TEST_COMPUTE_GRAPH_RANK_ESTIMATE, list(new SubLObject[] {$kw29$TEST, Symbols.symbol_function(EQUAL), $kw30$OWNER, NIL, $kw31$CLASSES, NIL, $kw32$KB, $kw33$TINY, $kw34$WORKING_, T}), $list35);
    generic_testing.define_test_case_table_int($sym42$TEST_DAG_IDENTIFY_LEAFS, list(new SubLObject[] {$kw29$TEST, NIL, $kw30$OWNER, NIL, $kw31$CLASSES, NIL, $kw32$KB, $kw33$TINY, $kw34$WORKING_, T}), $list43);
    generic_testing.define_test_case_table_int($sym46$TEST_DAG_IDENTIFY_ROOTS, list(new SubLObject[] {$kw29$TEST, NIL, $kw30$OWNER, NIL, $kw31$CLASSES, NIL, $kw32$KB, $kw33$TINY, $kw34$WORKING_, T}), $list47);
    generic_testing.define_test_case_table_int($sym52$TEST_DAG_ELIDE_FROM_GRAPH, list(new SubLObject[] {$kw29$TEST, NIL, $kw30$OWNER, NIL, $kw31$CLASSES, NIL, $kw32$KB, $kw33$TINY, $kw34$WORKING_, T}), $list53);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("GROUP-NODES"), makeSymbol("GROUP-LINKS"));
  public static final SubLSymbol $sym1$EXTRACT_LINK_NODES_INT = makeSymbol("EXTRACT-LINK-NODES-INT");
  public static final SubLList $list2 = list(makeSymbol("NODES"), makeSymbol("LINKS"));
  public static final SubLSymbol $sym3$CAAR = makeSymbol("CAAR");
  public static final SubLSymbol $sym4$_ = makeSymbol("<");
  public static final SubLSymbol $sym5$LENGTH_FIRST = makeSymbol("LENGTH-FIRST");
  public static final SubLList $list6 = list(list(makeSymbol("START"), makeSymbol("CURRENT"), makeSymbol("CHILDREN"), makeSymbol("&KEY"), list(makeSymbol("TESTFN"), list(makeSymbol("QUOTE"), list(makeSymbol("QUOTE"), EQL)))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list7 = list(makeKeyword("TESTFN"));
  public static final SubLSymbol $kw8$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw9$TESTFN = makeKeyword("TESTFN");
  public static final SubLList $list10 = list(makeSymbol("QUOTE"), EQL);
  public static final SubLSymbol $sym11$SEEN = makeUninternedSymbol("SEEN");
  public static final SubLSymbol $sym12$TODO = makeUninternedSymbol("TODO");
  public static final SubLSymbol $sym13$CHILD = makeUninternedSymbol("CHILD");
  public static final SubLSymbol $sym14$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym15$NEW_SET = makeSymbol("NEW-SET");
  public static final SubLList $list16 = list(list(makeSymbol("CREATE-QUEUE")));
  public static final SubLSymbol $sym17$ENQUEUE = makeSymbol("ENQUEUE");
  public static final SubLSymbol $sym18$SET_ADD = makeSymbol("SET-ADD");
  public static final SubLSymbol $sym19$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym20$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym21$QUEUE_EMPTY_P = makeSymbol("QUEUE-EMPTY-P");
  public static final SubLSymbol $sym22$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym23$DEQUEUE = makeSymbol("DEQUEUE");
  public static final SubLSymbol $sym24$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym25$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym26$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym27$SET_MEMBER_ = makeSymbol("SET-MEMBER?");
  public static final SubLSymbol $sym28$TEST_COMPUTE_GRAPH_RANK_ESTIMATE = makeSymbol("TEST-COMPUTE-GRAPH-RANK-ESTIMATE");
  public static final SubLSymbol $kw29$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw30$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw31$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw32$KB = makeKeyword("KB");
  public static final SubLSymbol $kw33$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw34$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list35 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(cons(makeSymbol("A"), SEVEN_INTEGER), cons(makeSymbol("B"), FIVE_INTEGER), cons(makeSymbol("C"), FIVE_INTEGER), cons(makeSymbol("D"), FOUR_INTEGER), cons(makeSymbol("E"), ONE_INTEGER), cons(makeSymbol("F"), ONE_INTEGER), cons(makeSymbol("G"), ONE_INTEGER))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(cons(makeSymbol("A"), TEN_INTEGER), cons(makeSymbol("B"), EIGHT_INTEGER), cons(makeSymbol("C"), EIGHT_INTEGER), cons(makeSymbol("D"), SEVEN_INTEGER), cons(makeSymbol("E"), THREE_INTEGER), cons(makeSymbol("F"), TWO_INTEGER), cons(makeSymbol("G"), ONE_INTEGER)), list(cons(makeSymbol("E"), THREE_INTEGER), cons(makeSymbol("F"), TWO_INTEGER), cons(makeSymbol("G"), ONE_INTEGER))), makeKeyword("SUCCESS")));
  public static final SubLString $str36$The_expected_map_size__A_differs_ = makeString("The expected map size ~A differs from the generated size ~A.");
  public static final SubLList $list37 = list(makeSymbol("NODE"), makeSymbol("EXPECTED-VALUE"));
  public static final SubLString $str38$Expected_rank_estimate__A_for__A_ = makeString("Expected rank estimate ~A for ~A, got ~A.");
  public static final SubLSymbol $kw39$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym40$MAP_P = makeSymbol("MAP-P");
  public static final SubLList $list41 = list(makeSymbol("NODE"), makeSymbol("SUPER-NODES"));
  public static final SubLSymbol $sym42$TEST_DAG_IDENTIFY_LEAFS = makeSymbol("TEST-DAG-IDENTIFY-LEAFS");
  public static final SubLList $list43 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("E"), makeSymbol("F"), makeSymbol("G"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), list(makeSymbol("E"), makeSymbol("F"))), makeKeyword("SUCCESS")));
  public static final SubLString $str44$Expected__A_leafs__got__A_leafs_i = makeString("Expected ~A leafs, got ~A leafs instead.");
  public static final SubLString $str45$The_expected_leaf_set__A_differs_ = makeString("The expected leaf set ~A differs from the computed leaf set ~A.");
  public static final SubLSymbol $sym46$TEST_DAG_IDENTIFY_ROOTS = makeSymbol("TEST-DAG-IDENTIFY-ROOTS");
  public static final SubLList $list47 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("A"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), list(makeSymbol("A"))), list(makeSymbol("A"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), NIL), makeKeyword("SUCCESS")));
  public static final SubLString $str48$Expected__A_roots__got__A_roots_i = makeString("Expected ~A roots, got ~A roots instead.");
  public static final SubLString $str49$The_expected_roots_set__A_differs = makeString("The expected roots set ~A differs from the computed roots set ~A.");
  public static final SubLSymbol $sym50$CONSP = makeSymbol("CONSP");
  public static final SubLList $list51 = list(makeSymbol("NODE"), makeSymbol("SUPERIOR"));
  public static final SubLSymbol $sym52$TEST_DAG_ELIDE_FROM_GRAPH = makeSymbol("TEST-DAG-ELIDE-FROM-GRAPH");
  public static final SubLList $list53 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("D")), list(list(makeSymbol("E"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("F"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("G"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), list(makeSymbol("D"), makeSymbol("G")), list(list(makeSymbol("E"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("F"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C")))), makeKeyword("SUCCESS")), list(list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"))), list(makeSymbol("C")), list(cons(makeSymbol("A"), makeSymbol("B")))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("A")), list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")))), makeKeyword("SUCCESS")));
  public static final SubLString $str54$_A_is_not_of_the_expected_size__A = makeString("~A is not of the expected size ~A, as ~A is.");
  public static final SubLList $list55 = list(makeSymbol("NODE"), makeSymbol("SUPERIORS"));
  public static final SubLString $str56$_A_does_not_contain_the_expected_ = makeString("~A does not contain the expected key ~A, whose value should be ~A.");
  public static final SubLString $str57$The_superiors_for_node__A_are__A_ = makeString("The superiors for node ~A are ~A, not ~A.");
  public static final SubLString $str58$The_superior_for_node__A_is__A__n = makeString("The superior for node ~A is ~A, not ~A.");

  //// Initializers

  public void declareFunctions() {
    declare_graph_utilities_file();
  }

  public void initializeVariables() {
    init_graph_utilities_file();
  }

  public void runTopLevelForms() {
    setup_graph_utilities_file();
  }

}
