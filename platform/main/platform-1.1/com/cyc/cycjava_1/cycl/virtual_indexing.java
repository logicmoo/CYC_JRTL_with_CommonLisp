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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class virtual_indexing extends SubLTranslatedFile {

  //// Constructor

  private virtual_indexing() {}
  public static final SubLFile me = new virtual_indexing();
  public static final String myName = "com.cyc.cycjava_1.cycl.virtual_indexing";

  //// Definitions

  @SubL(source = "cycl/virtual-indexing.lisp", position = 920) 
  public static SubLSymbol $index_overlap_enabledP$ = null;

  @SubL(source = "cycl/virtual-indexing.lisp", position = 7665) 
  public static final SubLObject good_term_for_overlap_index_p(SubLObject object) {
    return makeBoolean(((NIL != kb_indexing_datastructures.indexed_term_p(object))
          || ((!(object.isCons()))
             && (NIL != cycl_grammar.subl_atomic_term_p(object)))));
  }

  /** The minimum cost, below which it's not even worth it to try the overlap method. */
  @SubL(source = "cycl/virtual-indexing.lisp", position = 7826) 
  public static SubLSymbol $lookup_overlap_watermark$ = null;

  /** Overlap index is this many times more expensive than other methods, due to additional
   consing and multiple passes.  This value was determined by experiments in August 2005
   and should be periodically updated. */
  @SubL(source = "cycl/virtual-indexing.lisp", position = 8160) 
  private static SubLSymbol $overlap_index_expense_multiplier$ = null;

  /** @return boolean; t iff overlap indexing will probably yield a better-focused
   search than any other kind of indexing.
   @param BEST-COUNT; the smallest count of assertions indexed via the best other index. */
  @SubL(source = "cycl/virtual-indexing.lisp", position = 8503) 
  public static final SubLObject lookup_should_use_index_overlapP(SubLObject formula, SubLObject best_count) {
    if ((best_count == UNPROVIDED)) {
      best_count = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $index_overlap_enabledP$.getDynamicValue(thread))) {
        return NIL;
      } else if (((NIL != best_count)
           && best_count.numL($lookup_overlap_watermark$.getGlobalValue()))) {
        return NIL;
      } else if ((NIL != too_few_terms_for_index_overlapP(formula))) {
        return NIL;
      } else if (((NIL != best_count)
           && (NIL != mt_relevance_macros.all_mts_are_relevantP()))) {
        thread.resetMultipleValues();
        {
          SubLObject fort = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6920");
          SubLObject best_overlap_count = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return Numbers.numL(Numbers.multiply(best_overlap_count, $overlap_index_expense_multiplier$.getGlobalValue()), best_count);
        }
      } else {
        return T;
      }
    }
  }

  @SubL(source = "cycl/virtual-indexing.lisp", position = 9980) 
  public static final SubLObject too_few_terms_for_index_overlapP(SubLObject formula) {
    if ((NIL != el_utilities.contains_subformula_p(formula))) {
      return NIL;
    }
    if ((NIL == kb_indexing_datastructures.indexed_term_p(cycl_utilities.formula_operator(formula)))) {
      return T;
    }
    {
      SubLObject num_indexed_args = ZERO_INTEGER;
      SubLObject args = cycl_utilities.formula_args(formula, $kw15$IGNORE);
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
        if ((NIL != good_term_for_overlap_index_p(arg))) {
          num_indexed_args = Numbers.add(num_indexed_args, ONE_INTEGER);
        }
      }
      return Numbers.numLE(num_indexed_args, ONE_INTEGER);
    }
  }

  public static final SubLObject declare_virtual_indexing_file() {
    //declareFunction(myName, "assertions_mentioning_terms", "ASSERTIONS-MENTIONING-TERMS", 1, 1, false);
    //declareFunction(myName, "amt", "AMT", 1, 2, false);
    //declareFunction(myName, "gather_overlap_index", "GATHER-OVERLAP-INDEX", 1, 1, false);
    //declareFunction(myName, "gather_overlap_index_for_asent", "GATHER-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
    //declareFunction(myName, "gather_overlap_index_for_mt", "GATHER-OVERLAP-INDEX-FOR-MT", 1, 0, false);
    //declareFunction(myName, "num_overlap_index", "NUM-OVERLAP-INDEX", 1, 1, false);
    //declareFunction(myName, "estimated_num_overlap_index", "ESTIMATED-NUM-OVERLAP-INDEX", 1, 1, false);
    //declareFunction(myName, "num_overlap_index_for_asent", "NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
    //declareFunction(myName, "estimated_num_overlap_index_for_asent", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
    //declareFunction(myName, "estimated_num_overlap_index_for_mt", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-MT", 1, 0, false);
    //declareFunction(myName, "estimated_num_overlap_index_for_formula", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA", 1, 1, false);
    //declareFunction(myName, "terms_for_overlap_index", "TERMS-FOR-OVERLAP-INDEX", 1, 0, false);
    //declareFunction(myName, "terms_for_overlap_index_internal", "TERMS-FOR-OVERLAP-INDEX-INTERNAL", 1, 0, false);
    declareFunction(myName, "good_term_for_overlap_index_p", "GOOD-TERM-FOR-OVERLAP-INDEX-P", 1, 0, false);
    declareFunction(myName, "lookup_should_use_index_overlapP", "LOOKUP-SHOULD-USE-INDEX-OVERLAP?", 1, 1, false);
    declareFunction(myName, "too_few_terms_for_index_overlapP", "TOO-FEW-TERMS-FOR-INDEX-OVERLAP?", 1, 0, false);
    //declareFunction(myName, "overlap_greatest_benefit_nart", "OVERLAP-GREATEST-BENEFIT-NART", 0, 1, false);
    //declareFunction(myName, "overlap_benefit_ratio", "OVERLAP-BENEFIT-RATIO", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_virtual_indexing_file() {
    $index_overlap_enabledP$ = defparameter("*INDEX-OVERLAP-ENABLED?*", T);
    $lookup_overlap_watermark$ = deflexical("*LOOKUP-OVERLAP-WATERMARK*", $int16$50);
    $overlap_index_expense_multiplier$ = deflexical("*OVERLAP-INDEX-EXPENSE-MULTIPLIER*", SEVEN_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_virtual_indexing_file() {
        utilities_macros.register_cyc_api_function($sym5$ASSERTIONS_MENTIONING_TERMS, $list6, $str7$Return_a_list_of_assertions_that_, NIL, $list8);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym1$_ = makeSymbol("<");
  public static final SubLSymbol $sym2$NUM_INDEX = makeSymbol("NUM-INDEX");
  public static final SubLSymbol $sym3$ASSERTION_WITH_SEARCH_TERM = makeSymbol("ASSERTION-WITH-SEARCH-TERM");
  public static final SubLSymbol $sym4$ASSERTION_WITHOUT_SEARCH_TERM = makeSymbol("ASSERTION-WITHOUT-SEARCH-TERM");
  public static final SubLSymbol $sym5$ASSERTIONS_MENTIONING_TERMS = makeSymbol("ASSERTIONS-MENTIONING-TERMS");
  public static final SubLList $list6 = list(makeSymbol("TERM-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("INCLUDE-META-ASSERTIONS?"));
  public static final SubLString $str7$Return_a_list_of_assertions_that_ = makeString("Return a list of assertions that mention every term in TERM-LIST.");
  public static final SubLList $list8 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));
  public static final SubLSymbol $sym9$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym10$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const11$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym12$FULLY_INDEXED_TERM_P = makeSymbol("FULLY-INDEXED-TERM-P");
  public static final SubLSymbol $sym13$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $sym14$MIN = makeSymbol("MIN");
  public static final SubLSymbol $kw15$IGNORE = makeKeyword("IGNORE");
  public static final SubLInteger $int16$50 = makeInteger(50);
  public static final SubLString $str17$mapping_Cyc_NARTs = makeString("mapping Cyc NARTs");
  public static final SubLSymbol $sym18$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw19$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw20$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw21$INDEX_TYPE = makeKeyword("INDEX-TYPE");
  public static final SubLList $list22 = list(makeKeyword("FUNCTION-EXTENT"), makeKeyword("NART-ARG"));
  public static final SubLString $str23$_s_vs___s___s__s____ = makeString("~s vs. ~s: ~s ~s~%~%");

  //// Initializers

  public void declareFunctions() {
    declare_virtual_indexing_file();
  }

  public void initializeVariables() {
    init_virtual_indexing_file();
  }

  public void runTopLevelForms() {
    setup_virtual_indexing_file();
  }

}
