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

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_implied_relations;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class disjoint_with extends SubLTranslatedFile {

  //// Constructor

  private disjoint_with() {}
  public static final SubLFile me = new disjoint_with();
  public static final String myName = "com.cyc.cycjava_1.cycl.disjoint_with";

  //// Definitions

  /** Returns a pair of disjoint elements of COLS (if any exist) */
  @SubL(source = "cycl/disjoint-with.lisp", position = 3547) 
  public static final SubLObject any_disjoint_collection_pair(SubLObject cols, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(cols, $sym1$LISTP);
    {
      SubLObject disjoint = NIL;
      SubLObject n = ZERO_INTEGER;
      if ((NIL == disjoint)) {
        {
          SubLObject csome_list_var = cols;
          SubLObject col_1 = NIL;
          for (col_1 = csome_list_var.first(); (!(((NIL != disjoint)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col_1 = csome_list_var.first()) {
            n = Numbers.add(n, ONE_INTEGER);
            if ((NIL == disjoint)) {
              {
                SubLObject csome_list_var_1 = conses_high.nthcdr(n, cols);
                SubLObject col_2 = NIL;
                for (col_2 = csome_list_var_1.first(); (!(((NIL != disjoint)
                      || (NIL == csome_list_var_1)))); csome_list_var_1 = csome_list_var_1.rest(), col_2 = csome_list_var_1.first()) {
                  if ((NIL != disjoint_withP(col_1, col_2, mt, UNPROVIDED))) {
                    disjoint = list(col_1, col_2);
                  }
                }
              }
            }
          }
        }
      }
      return disjoint;
    }
  }

  /** are collections <c1> and <c2> disjoint? */
  @SubL(source = "cycl/disjoint-with.lisp", position = 5863) 
  public static final SubLObject disjoint_withP(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((NIL != term.first_order_nautP(c1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10979");
    } else {
      return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($const0$disjointWith), c1, c2, mt, tv);
    }
  }

  /** is any c1 in <c1s> disjoint with c2? */
  @SubL(source = "cycl/disjoint-with.lisp", position = 6640) 
  public static final SubLObject any_disjoint_withP(SubLObject c1s, SubLObject c2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_any_with_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($const0$disjointWith), c1s, c2, mt, tv);
  }

  @SubL(source = "cycl/disjoint-with.lisp", position = 14275) 
  private static SubLSymbol $maximal_consistent_subsets$ = null;

  @SubL(source = "cycl/disjoint-with.lisp", position = 14424) 
  private static SubLSymbol $maximal_consistent_subsets_visited_subsets$ = null;

  public static final SubLObject declare_disjoint_with_file() {
    //declareFunction(myName, "local_disjoint_with", "LOCAL-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "local_max_disjoint_with", "LOCAL-MAX-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "local_not_disjoint_with", "LOCAL-NOT-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "local_min_not_disjoint_with", "LOCAL-MIN-NOT-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "all_disjoint_with", "ALL-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "all_not_disjoint_with", "ALL-NOT-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "max_all_disjoint_with", "MAX-ALL-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "max_all_disjoint_with_no_sdc", "MAX-ALL-DISJOINT-WITH-NO-SDC", 1, 2, false);
    //declareFunction(myName, "min_all_not_disjoint_with", "MIN-ALL-NOT-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "min_implied_not_disjoint_with", "MIN-IMPLIED-NOT-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "min_all_asserted_not_disjoint_with", "MIN-ALL-ASSERTED-NOT-DISJOINT-WITH", 1, 2, false);
    declareFunction(myName, "any_disjoint_collection_pair", "ANY-DISJOINT-COLLECTION-PAIR", 1, 1, false);
    //declareFunction(myName, "sbhl_record_max_true_disjoint_with", "SBHL-RECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "sbhl_unrecord_max_true_disjoint_with", "SBHL-UNRECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
    //declareFunction(myName, "instances_of_disjoint_collectionsP", "INSTANCES-OF-DISJOINT-COLLECTIONS?", 2, 2, false);
    //declareFunction(myName, "why_instances_of_disjoint_collections", "WHY-INSTANCES-OF-DISJOINT-COLLECTIONS", 2, 2, false);
    declareFunction(myName, "disjoint_withP", "DISJOINT-WITH?", 2, 2, false);
    //declareFunction(myName, "nat_disjoint_withP", "NAT-DISJOINT-WITH?", 2, 2, false);
    declareFunction(myName, "any_disjoint_withP", "ANY-DISJOINT-WITH?", 2, 2, false);
    //declareFunction(myName, "any_disjoint_with_anyP", "ANY-DISJOINT-WITH-ANY?", 2, 2, false);
    //declareFunction(myName, "not_disjoint_withP", "NOT-DISJOINT-WITH?", 2, 2, false);
    //declareFunction(myName, "disjoint_with_specsP", "DISJOINT-WITH-SPECS?", 2, 1, false);
    //declareFunction(myName, "any_disjoint_collection_pairP", "ANY-DISJOINT-COLLECTION-PAIR?", 1, 1, false);
    //declareFunction(myName, "collections_disjointP", "COLLECTIONS-DISJOINT?", 2, 1, false);
    //declareFunction(myName, "basis_for_not_mdwP", "BASIS-FOR-NOT-MDW?", 2, 2, false);
    //declareFunction(myName, "why_disjoint_withP", "WHY-DISJOINT-WITH?", 2, 3, false);
    //declareFunction(myName, "why_collections_disjointP", "WHY-COLLECTIONS-DISJOINT?", 2, 1, false);
    //declareFunction(myName, "why_not_disjoint_withP", "WHY-NOT-DISJOINT-WITH?", 2, 3, false);
    //declareFunction(myName, "max_floor_mts_of_disjoint_with_paths", "MAX-FLOOR-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_disjoint_with_paths", "MIN-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_not_disjoint_with_paths", "MAX-FLOOR-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_not_disjoint_with_paths", "MIN-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
    //declareFunction(myName, "disjoint_with_mts", "DISJOINT-WITH-MTS", 1, 0, false);
    //declareFunction(myName, "asserted_disjoint_with", "ASSERTED-DISJOINT-WITH", 1, 1, false);
    //declareFunction(myName, "asserted_not_disjoint_with", "ASSERTED-NOT-DISJOINT-WITH", 1, 1, false);
    //declareFunction(myName, "supported_disjoint_with", "SUPPORTED-DISJOINT-WITH", 1, 1, false);
    //declareFunction(myName, "supported_not_disjoint_with", "SUPPORTED-NOT-DISJOINT-WITH", 1, 1, false);
    //declareFunction(myName, "mdw_after_adding", "MDW-AFTER-ADDING", 2, 0, false);
    //declareFunction(myName, "mdw_after_removing", "MDW-AFTER-REMOVING", 2, 0, false);
    //declareFunction(myName, "clear_mdw_graph", "CLEAR-MDW-GRAPH", 0, 0, false);
    //declareFunction(myName, "clear_node_mdw_links", "CLEAR-NODE-MDW-LINKS", 1, 0, false);
    //declareFunction(myName, "reset_mdw_links", "RESET-MDW-LINKS", 1, 0, false);
    //declareFunction(myName, "reset_mdw_links_in_mt", "RESET-MDW-LINKS-IN-MT", 2, 0, false);
    //declareFunction(myName, "reset_mdw_graph", "RESET-MDW-GRAPH", 0, 1, false);
    //declareFunction(myName, "maximal_consistent_subsets", "MAXIMAL-CONSISTENT-SUBSETS", 1, 0, false);
    //declareFunction(myName, "maximal_consistent_subsetP", "MAXIMAL-CONSISTENT-SUBSET?", 2, 0, false);
    //declareFunction(myName, "maximal_consistent_subsets_recursive", "MAXIMAL-CONSISTENT-SUBSETS-RECURSIVE", 2, 0, false);
    //declareFunction(myName, "disjointness_map", "DISJOINTNESS-MAP", 1, 0, false);
    //declareFunction(myName, "first_disjointness", "FIRST-DISJOINTNESS", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_disjoint_with_file() {
    $maximal_consistent_subsets$ = defparameter("*MAXIMAL-CONSISTENT-SUBSETS*", NIL);
    $maximal_consistent_subsets_visited_subsets$ = defparameter("*MAXIMAL-CONSISTENT-SUBSETS-VISITED-SUBSETS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_disjoint_with_file() {
        utilities_macros.register_cyc_api_function($sym2$ANY_DISJOINT_COLLECTION_PAIR, $list3, $str4$Returns_a_pair_of_disjoint_elemen, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym11$ANY_DISJOINT_COLLECTION_PAIR_, $list3, $str12$Are_any_two_collections_in_COLS_d, $list5, $list13);
    utilities_macros.register_obsolete_cyc_api_function($sym15$COLLECTIONS_DISJOINT_, $list16, $list17, $str18$_see_disjoint_with_, $list19, $list13);
    utilities_macros.register_obsolete_cyc_api_function($sym20$WHY_COLLECTIONS_DISJOINT_, $list21, $list22, $str23$_see_why_disjoint_with_, $list24, $list25);
    utilities_macros.register_kb_function($sym26$MDW_AFTER_ADDING);
    utilities_macros.register_kb_function($sym27$MDW_AFTER_REMOVING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLSymbol $sym1$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym2$ANY_DISJOINT_COLLECTION_PAIR = makeSymbol("ANY-DISJOINT-COLLECTION-PAIR");
  public static final SubLList $list3 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str4$Returns_a_pair_of_disjoint_elemen = makeString("Returns a pair of disjoint elements of COLS (if any exist)");
  public static final SubLList $list5 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));
  public static final SubLList $list6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));
  public static final SubLObject $const7$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw8$ISA = makeKeyword("ISA");
  public static final SubLObject $const9$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw10$DISJOINTWITH = makeKeyword("DISJOINTWITH");
  public static final SubLSymbol $sym11$ANY_DISJOINT_COLLECTION_PAIR_ = makeSymbol("ANY-DISJOINT-COLLECTION-PAIR?");
  public static final SubLString $str12$Are_any_two_collections_in_COLS_d = makeString("Are any two collections in COLS disjoint?");
  public static final SubLList $list13 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym14$EL_FORT_P = makeSymbol("EL-FORT-P");
  public static final SubLSymbol $sym15$COLLECTIONS_DISJOINT_ = makeSymbol("COLLECTIONS-DISJOINT?");
  public static final SubLList $list16 = list(makeSymbol("DISJOINT-WITH?"));
  public static final SubLList $list17 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str18$_see_disjoint_with_ = makeString("@see disjoint-with?");
  public static final SubLList $list19 = list(list(makeSymbol("COL-1"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-2"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym20$WHY_COLLECTIONS_DISJOINT_ = makeSymbol("WHY-COLLECTIONS-DISJOINT?");
  public static final SubLList $list21 = list(makeSymbol("WHY-DISJOINT-WITH?"));
  public static final SubLList $list22 = list(makeSymbol("C1"), makeSymbol("C2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str23$_see_why_disjoint_with_ = makeString("@see why-disjoint-with?");
  public static final SubLList $list24 = list(list(makeSymbol("C1"), makeSymbol("EL-FORT-P")), list(makeSymbol("C2"), makeSymbol("EL-FORT-P")));
  public static final SubLList $list25 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym26$MDW_AFTER_ADDING = makeSymbol("MDW-AFTER-ADDING");
  public static final SubLSymbol $sym27$MDW_AFTER_REMOVING = makeSymbol("MDW-AFTER-REMOVING");
  public static final SubLSymbol $sym28$SUPERSETP = makeSymbol("SUPERSETP");
  public static final SubLSymbol $sym29$SUBSETP = makeSymbol("SUBSETP");

  //// Initializers

  public void declareFunctions() {
    declare_disjoint_with_file();
  }

  public void initializeVariables() {
    init_disjoint_with_file();
  }

  public void runTopLevelForms() {
    setup_disjoint_with_file();
  }

}
