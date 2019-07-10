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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.defns;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.disjoint_with;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.wff_macros;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class at_defns extends SubLTranslatedFile {

  //// Constructor

  private at_defns() {}
  public static final SubLFile me = new at_defns();
  public static final String myName = "com.cyc.cycjava_1.cycl.at_defns";

  //// Definitions

  @SubL(source = "cycl/at-defns.lisp", position = 2685) 
  public static final SubLObject clear_suf_defns() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.clrhash(at_vars.$suf_defn_cache$.getDynamicValue(thread));
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 4954) 
  public static final SubLObject clear_suf_quoted_defns() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.clrhash(at_vars.$suf_quoted_defn_cache$.getDynamicValue(thread));
      return NIL;
    }
  }


  /** @return boolean; t iff some sufficient defn of COLLECTION admits TERM; 
   don't generate violation messages */
  @SubL(source = "cycl/at-defns.lisp", position = 26259) 
  public static final SubLObject quiet_sufficient_defns_admitP(SubLObject collection, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_4 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
            result = defns_admitP(collection, v_term, mt);
          } finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_4, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  
  @SubL(source = "cycl/at-defns.lisp", position = 6243) 
  public static SubLSymbol $use_new_defns_functionsP$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 6292) 
  public static final SubLObject defns_admitP(SubLObject collection, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.new_defns_admitP(collection, v_term, mt);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5340");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 6497) 
  public static SubLSymbol $old_defns_admitP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 6497) 
  public static final SubLObject reset_old_defns_admitP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_defns_admitP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $old_defns_admitP_meters$.getDynamicValue(thread), $sym12$OLD_DEFNS_ADMIT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 7341) 
  public static final SubLObject defns_rejectP(SubLObject collection, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.new_defns_rejectP(collection, v_term, mt);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5341");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 7549) 
  public static SubLSymbol $old_defns_rejectP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 7549) 
  public static final SubLObject reset_old_defns_rejectP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_defns_rejectP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $old_defns_rejectP_meters$.getDynamicValue(thread), $sym17$OLD_DEFNS_REJECT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 8702) 
  public static SubLSymbol $defining_defns_status_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 8702) 
  public static final SubLObject reset_defining_defns_status_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $defining_defns_status_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $defining_defns_status_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $defining_defns_status_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $defining_defns_status_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $defining_defns_status_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $defining_defns_status_meters$.getDynamicValue(thread), $sym21$DEFINING_DEFNS_STATUS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 9986) 
  public static SubLSymbol $sufficient_defns_admitP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 9986) 
  public static final SubLObject reset_sufficient_defns_admitP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $sufficient_defns_admitP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $sufficient_defns_admitP_meters$.getDynamicValue(thread), $sym31$SUFFICIENT_DEFNS_ADMIT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 13258) 
  public static SubLSymbol $necessary_defns_rejectP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 13258) 
  public static final SubLObject reset_necessary_defns_rejectP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $necessary_defns_rejectP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $necessary_defns_rejectP_meters$.getDynamicValue(thread), $sym37$NECESSARY_DEFNS_REJECT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 14525) 
  public static final SubLObject denotational_term_admitted_by_defn_via_isaP(SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject admittedP = NIL;
        if ((NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP())) {
          {
            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
              sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
              admittedP = makeBoolean(((NIL != at_denotational_term_p(v_term, UNPROVIDED))
                     && ((NIL != isa.isaP(v_term, collection, mt, UNPROVIDED))
                      || ((NIL != assertions_high.gaf_assertionP(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)))
                         && (NIL != el_utilities.isa_litP(assertions_high.gaf_formula(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))))
                         && v_term.equal(assertions_high.gaf_arg1(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)))
                         && (NIL != genls.genlsP(assertions_high.gaf_arg2(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)), collection, mt, UNPROVIDED)))
                      || ((NIL != wff_macros.within_wffP())
                         && (NIL != control_vars.within_assertP())
                         && (NIL != el_utilities.isa_litP(wff_vars.wff_formula()))
                         && v_term.equal(cycl_utilities.sentence_arg1(wff_vars.wff_formula(), UNPROVIDED))
                         && (NIL != term.el_fort_p(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED)))
                         && (NIL != genls.genlsP(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED), collection, mt, UNPROVIDED))
                         && (NIL == el_utilities.el_negation_p(wff_vars.wff_formula()))))));
              sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
            } finally {
              sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return admittedP;
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 15445) 
  public static SubLSymbol $rejected_by_necessary_defns_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 15445) 
  public static final SubLObject reset_rejected_by_necessary_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), $sym57$REJECTED_BY_NECESSARY_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 18488) 
  public static final SubLObject quoted_defns_admitP(SubLObject collection, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.new_quoted_defns_admitP(collection, v_term, mt);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5346");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 18715) 
  public static SubLSymbol $old_quoted_defns_admitP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 18715) 
  public static final SubLObject reset_old_quoted_defns_admitP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), $sym64$OLD_QUOTED_DEFNS_ADMIT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 19594) 
  public static SubLSymbol $old_quoted_defns_rejectP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 19594) 
  public static final SubLObject reset_old_quoted_defns_rejectP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), $sym68$OLD_QUOTED_DEFNS_REJECT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 20067) 
  public static SubLSymbol $quoted_defining_defns_status_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 20067) 
  public static final SubLObject reset_quoted_defining_defns_status_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $quoted_defining_defns_status_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $quoted_defining_defns_status_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $quoted_defining_defns_status_meters$.getDynamicValue(thread), $sym72$QUOTED_DEFINING_DEFNS_STATUS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 20754) 
  public static SubLSymbol $quoted_sufficient_defns_admitP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 20754) 
  public static final SubLObject reset_quoted_sufficient_defns_admitP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), $sym77$QUOTED_SUFFICIENT_DEFNS_ADMIT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 21143) 
  public static SubLSymbol $quoted_necessary_defns_rejectP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 21143) 
  public static final SubLObject reset_quoted_necessary_defns_rejectP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), $sym81$QUOTED_NECESSARY_DEFNS_REJECT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 21634) 
  public static final SubLObject denotational_term_admitted_by_quoted_defn_via_quoted_isaP(SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject admittedP = NIL;
        if ((NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP())) {
          {
            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
              sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
              admittedP = makeBoolean(((NIL != at_denotational_term_p(v_term, UNPROVIDED))
                     && ((NIL != isa.quoted_isaP(v_term, collection, mt, UNPROVIDED))
                      || ((NIL != assertions_high.gaf_assertionP(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)))
                         && (NIL != el_utilities.quoted_isa_litP(assertions_high.gaf_formula(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))))
                         && v_term.equal(assertions_high.gaf_arg1(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)))
                         && (NIL != genls.genlsP(assertions_high.gaf_arg2(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)), collection, mt, UNPROVIDED)))
                      || ((NIL != wff_macros.within_wffP())
                         && (NIL != control_vars.within_assertP())
                         && (NIL != el_utilities.quoted_isa_litP(wff_vars.wff_formula()))
                         && v_term.equal(cycl_utilities.sentence_arg1(wff_vars.wff_formula(), UNPROVIDED))
                         && (NIL != term.el_fort_p(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED)))
                         && (NIL != genls.genlsP(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED), collection, mt, UNPROVIDED))
                         && (NIL == el_utilities.el_negation_p(wff_vars.wff_formula()))))));
              sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
            } finally {
              sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return admittedP;
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 22587) 
  public static SubLSymbol $rejected_by_quoted_necessary_defns_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 22587) 
  public static final SubLObject reset_rejected_by_quoted_necessary_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), $list10);
      Hashtables.sethash($kw11$FUNCTION, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), $sym86$REJECTED_BY_QUOTED_NECESSARY_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 24033) 
  public static final SubLObject new_defn_stack() {
    return Hashtables.make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/at-defns.lisp", position = 24128) 
  public static final SubLObject defn_stack_push(SubLObject defn, SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return hash_table_utilities.push_hash(defn, v_term, at_vars.$defn_stack$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 24217) 
  public static final SubLObject defn_stack_pop(SubLObject defn, SubLObject expected_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject actual_term = hash_table_utilities.pop_hash(defn, at_vars.$defn_stack$.getDynamicValue(thread));
        if ((!(expected_term.equal(actual_term)))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5301");
        }
        return actual_term;
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 24538) 
  public static final SubLObject recursive_defn_callP(SubLObject defn, SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != misc_utilities.initialized_p(at_vars.$defn_stack$.getDynamicValue(thread)))) {
        {
          SubLObject term_stack = Hashtables.gethash_without_values(defn, at_vars.$defn_stack$.getDynamicValue(thread), UNPROVIDED);
          return subl_promotions.memberP(v_term, term_stack, Symbols.symbol_function(EQUAL), UNPROVIDED);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 25037) 
  public static final SubLObject get_defn_fn_history(SubLObject defn) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        result = Hashtables.gethash_without_values(defn, at_vars.$defn_fn_history$.getDynamicValue(thread), UNPROVIDED);
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 25184) 
  public static final SubLObject set_defn_fn_history(SubLObject defn, SubLObject result) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash(defn, at_vars.$defn_fn_history$.getDynamicValue(thread), result);
      return result;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 25293) 
  public static final SubLObject get_quoted_defn_fn_history(SubLObject defn) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        result = Hashtables.gethash_without_values(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), UNPROVIDED);
        return result;
      }
    }
  }

  /** @return boolean; t iff some defn of COLLECTION admits TERM; 
   don't generate violation messages (e.g., for sufficient defns) */
  @SubL(source = "cycl/at-defns.lisp", position = 25877) 
  public static final SubLObject quiet_defns_admitP(SubLObject collection, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = defns_admitP(collection, v_term, mt);
          } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** see if defn <defn> of collection <collection> admits <term>; 
   don't generate violation messages (e.g., for sufficient defns) */
  @SubL(source = "cycl/at-defns.lisp", position = 26956) 
  public static final SubLObject quiet_defn_admitsP(SubLObject defn, SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = defn_admitsP(defn, v_term, collection, mt);
          } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** does defn <defn> of collection <collection> admit <term>? */
  @SubL(source = "cycl/at-defns.lisp", position = 27320) 
  public static final SubLObject defn_admitsP(SubLObject defn, SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = defn_history(defn);
        if (pcase_var.eql($kw1$ADMITTED)) {
          return T;
        } else if (pcase_var.eql($kw2$REJECTED)) {
          return NIL;
        } else {
          if ((NIL != recursive_defn_callP(defn, v_term))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5302");
            return NIL;
          }
          {
            SubLObject admitsP = NIL;
            {
              SubLObject _prev_bind_0 = at_vars.$defn_stack$.currentBinding(thread);
              try {
                at_vars.$defn_stack$.bind(((NIL != misc_utilities.uninitialized_p(at_vars.$defn_stack$.getDynamicValue(thread))) ? ((SubLObject) new_defn_stack()) : at_vars.$defn_stack$.getDynamicValue(thread)), thread);
                try {
                  defn_stack_push(defn, v_term);
                  {
                    SubLObject mt_var = mt;
                    {
                      SubLObject _prev_bind_0_174 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        admitsP = defn_admits_intP(defn, v_term, collection);
                      } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_174, thread);
                      }
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0_175 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      defn_stack_pop(defn, v_term);
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_175, thread);
                    }
                  }
                }
              } finally {
                at_vars.$defn_stack$.rebind(_prev_bind_0, thread);
              }
            }
            if ((NIL == collection_specific_defnP(defn))) {
              if ((NIL != admitsP)) {
                set_defn_fn_history(defn, $kw1$ADMITTED);
              } else {
                set_defn_fn_history(defn, $kw2$REJECTED);
              }
            }
            return admitsP;
          }
        }
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 28569) 
  public static final SubLObject collection_specific_defnP(SubLObject symbol) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return subl_promotions.memberP(symbol, at_vars.$at_collection_specific_defns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 28678) 
  public static final SubLObject defn_history(SubLObject defn) {
    if ((NIL != viable_defnP(defn, UNPROVIDED))) {
      if ((NIL == collection_specific_defnP(defn))) {
        return get_defn_fn_history(defn);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-defns.lisp", position = 28931) 
  public static SubLSymbol $defn_admits_intP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 28931) 
  public static final SubLObject reset_defn_admits_intP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $defn_admits_intP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $defn_admits_intP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $defn_admits_intP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $defn_admits_intP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $defn_admits_intP_meters$.getDynamicValue(thread), $list93);
      Hashtables.sethash($kw11$FUNCTION, $defn_admits_intP_meters$.getDynamicValue(thread), $sym94$DEFN_ADMITS_INT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 28931) 
  public static final SubLObject defn_admits_intP_metered(SubLObject defn, SubLObject v_term, SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject admitsP = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
          try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            admitsP = makeBoolean(((NIL != denotational_term_admitted_by_defn_via_isaP(v_term, collection, UNPROVIDED))
                  || (NIL != defn_funcall(defn, v_term))));
            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
          } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
          }
        }
        if ((collection == at_vars.$defn_collection$.getDynamicValue(thread))) {
          defn_note(FIVE_INTEGER, $str96$__defn_test__term__s__defn__s_of_, v_term, defn, collection, ((NIL != admitsP) ? ((SubLObject) $kw1$ADMITTED) : $kw2$REJECTED), UNPROVIDED, UNPROVIDED);
        } else {
          defn_note(FIVE_INTEGER, $str97$__defn_test__term__s__defn__s_of_, v_term, defn, collection, at_vars.$defn_collection$.getDynamicValue(thread), ((NIL != admitsP) ? ((SubLObject) $kw1$ADMITTED) : $kw2$REJECTED), UNPROVIDED);
        }
        return admitsP;
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 28931) 
  public static final SubLObject defn_admits_intP(SubLObject defn, SubLObject v_term, SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = defn_admits_intP_metered(defn, v_term, collection);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw5$CALLS, $defn_admits_intP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw5$CALLS, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw6$TIMES, $defn_admits_intP_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw6$TIMES, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw7$RESULTS, $defn_admits_intP_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw7$RESULTS, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw8$ARGS, $defn_admits_intP_meters$.getDynamicValue(thread), cons(list(defn, v_term, collection), Hashtables.gethash($kw8$ARGS, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return defn_admits_intP_metered(defn, v_term, collection);
      }
    }
  }

  /** does defn <defn> of collection <collection> admit <term>? */
  @SubL(source = "cycl/at-defns.lisp", position = 30908) 
  public static final SubLObject quoted_defn_admitsP(SubLObject defn, SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = quoted_defn_history(defn);
        if (pcase_var.eql($kw1$ADMITTED)) {
          return T;
        } else if (pcase_var.eql($kw2$REJECTED)) {
          return NIL;
        } else {
          if ((NIL != recursive_defn_callP(defn, v_term))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5303");
            return NIL;
          }
          {
            SubLObject admitsP = NIL;
            {
              SubLObject _prev_bind_0 = at_vars.$defn_stack$.currentBinding(thread);
              try {
                at_vars.$defn_stack$.bind(((NIL != misc_utilities.uninitialized_p(at_vars.$defn_stack$.getDynamicValue(thread))) ? ((SubLObject) new_defn_stack()) : at_vars.$defn_stack$.getDynamicValue(thread)), thread);
                try {
                  defn_stack_push(defn, v_term);
                  {
                    SubLObject mt_var = mt;
                    {
                      SubLObject _prev_bind_0_176 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        admitsP = quoted_defn_admits_intP(defn, v_term, collection);
                      } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_176, thread);
                      }
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0_177 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      defn_stack_pop(defn, v_term);
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_177, thread);
                    }
                  }
                }
              } finally {
                at_vars.$defn_stack$.rebind(_prev_bind_0, thread);
              }
            }
            if ((NIL == collection_specific_defnP(defn))) {
              if ((NIL != admitsP)) {
                Hashtables.sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), $kw1$ADMITTED);
              } else {
                Hashtables.sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), $kw2$REJECTED);
              }
            }
            return admitsP;
          }
        }
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 32262) 
  public static final SubLObject quoted_defn_history(SubLObject defn) {
    if ((NIL != viable_defnP(defn, UNPROVIDED))) {
      if ((NIL == collection_specific_defnP(defn))) {
        return get_quoted_defn_fn_history(defn);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-defns.lisp", position = 32541) 
  public static SubLSymbol $quoted_defn_admits_intP_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 32541) 
  public static final SubLObject reset_quoted_defn_admits_intP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), $list93);
      Hashtables.sethash($kw11$FUNCTION, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), $sym101$QUOTED_DEFN_ADMITS_INT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 32541) 
  public static final SubLObject quoted_defn_admits_intP_metered(SubLObject defn, SubLObject v_term, SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject admitsP = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
          try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            admitsP = makeBoolean(((NIL != denotational_term_admitted_by_quoted_defn_via_quoted_isaP(v_term, collection, UNPROVIDED))
                  || (NIL != defn_funcall(defn, v_term))));
            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
          } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
          }
        }
        if ((collection == at_vars.$defn_collection$.getDynamicValue(thread))) {
          defn_note(FIVE_INTEGER, $str96$__defn_test__term__s__defn__s_of_, v_term, defn, collection, ((NIL != admitsP) ? ((SubLObject) $kw1$ADMITTED) : $kw2$REJECTED), UNPROVIDED, UNPROVIDED);
        } else {
          defn_note(FIVE_INTEGER, $str97$__defn_test__term__s__defn__s_of_, v_term, defn, collection, at_vars.$defn_collection$.getDynamicValue(thread), ((NIL != admitsP) ? ((SubLObject) $kw1$ADMITTED) : $kw2$REJECTED), UNPROVIDED);
        }
        return admitsP;
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 32541) 
  public static final SubLObject quoted_defn_admits_intP(SubLObject defn, SubLObject v_term, SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = quoted_defn_admits_intP_metered(defn, v_term, collection);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw5$CALLS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw5$CALLS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw6$TIMES, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw6$TIMES, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw7$RESULTS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw7$RESULTS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw8$ARGS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), cons(list(defn, v_term, collection), Hashtables.gethash($kw8$ARGS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return quoted_defn_admits_intP_metered(defn, v_term, collection);
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 33163) 
  private static SubLSymbol $defn_cyc_evaluate_caching_state$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 33163) 
  public static final SubLObject clear_defn_cyc_evaluate() {
    {
      SubLObject cs = $defn_cyc_evaluate_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  /** return T iff DEFN is a valid defn */
  @SubL(source = "cycl/at-defns.lisp", position = 33282) 
  public static final SubLObject valid_defnP(SubLObject defn, SubLObject defn_collection) {
    if ((defn_collection == UNPROVIDED)) {
      defn_collection = NIL;
    }
    if ((NIL != defn)) {
      {
        SubLObject validP = Types.symbolp(defn);
        if ((NIL == validP)) {
          if ((NIL != defn_collection)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5304");
          } else {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5305");
          }
        }
        return validP;
      }
    }
    return NIL;
  }

  /** return T iff DEFN is a viable defn */
  @SubL(source = "cycl/at-defns.lisp", position = 33624) 
  public static final SubLObject viable_defnP(SubLObject defn, SubLObject defn_collection) {
    if ((defn_collection == UNPROVIDED)) {
      defn_collection = NIL;
    }
    if ((NIL != valid_defnP(defn, UNPROVIDED))) {
      {
        SubLObject viableP = eval_in_api.possibly_cyc_api_function_spec_p(defn);
        if ((NIL == viableP)) {
          if ((NIL != defn_collection)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5306");
          } else {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5307");
          }
        }
        return viableP;
      }
    }
    return NIL;
  }

  /** Funcall DEFN on TERM, which returns non-NIL on success. */
  @SubL(source = "cycl/at-defns.lisp", position = 34015) 
  public static final SubLObject defn_funcall(SubLObject defn, SubLObject v_term) {
    return eval_in_api.possibly_cyc_api_funcall_1(defn, v_term);
  }

  @SubL(source = "cycl/at-defns.lisp", position = 34167) 
  public static final SubLObject at_denotational_term_p(SubLObject v_term, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym111$CYC_VAR_);
    }
    return makeBoolean(((NIL != forts.fort_p(v_term))
          || (NIL != term.closed_nautP(v_term, varP))));
  }

  @SubL(source = "cycl/at-defns.lisp", position = 34300) 
  public static final SubLObject clear_defn_space() {
    clear_defn_cyc_evaluate();
    return NIL;
  }

  /** @return booleanp; t iff TERM either isa COLLECTION (via isa sbhl module)
   or admitted by (via defns module) COLLECTION? */
  @SubL(source = "cycl/at-defns.lisp", position = 34798) 
  public static final SubLObject has_typeP(SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != term.ground_nautP(collection, UNPROVIDED))) {
        return has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
      } else if ((NIL != forts.fort_p(collection))) {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
            try {
              at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
              result = makeBoolean(((NIL != isa.isaP(v_term, collection, mt, UNPROVIDED))
                    || (NIL != defns_admitP(collection, v_term, mt))));
            } finally {
              at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
            }
          }
          return result;
        }
      }
      return NIL;
    }
  }

  /** @return booleanp; t iff is TERM isa COLLECTION (via isa sbhl module)
   or admitted by COLLECTION? (via defns module)
   @see has-type? (quiet: generate no violations) */
  @SubL(source = "cycl/at-defns.lisp", position = 35413) 
  public static final SubLObject quiet_has_typeP(SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != term.ground_nautP(collection, UNPROVIDED))) {
        return quiet_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
      } else if ((NIL != forts.fort_p(collection))) {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
            try {
              at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
              result = makeBoolean(((NIL != isa.isaP(v_term, collection, mt, UNPROVIDED))
                    || (NIL != quiet_defns_admitP(collection, v_term, mt))));
            } finally {
              at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
            }
          }
          return result;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 36532) 
  public static final SubLObject quiet_has_type_memoizedP_internal(SubLObject v_term, SubLObject collection, SubLObject mt, SubLObject mt_info) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((mt_info == UNPROVIDED)) {
      mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
    }
    return quiet_has_typeP(v_term, collection, mt);
  }

  @SubL(source = "cycl/at-defns.lisp", position = 36532) 
  public static final SubLObject quiet_has_type_memoizedP(SubLObject v_term, SubLObject collection, SubLObject mt, SubLObject mt_info) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((mt_info == UNPROVIDED)) {
      mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return quiet_has_type_memoizedP_internal(v_term, collection, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym113$QUIET_HAS_TYPE_MEMOIZED_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym113$QUIET_HAS_TYPE_MEMOIZED_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym113$QUIET_HAS_TYPE_MEMOIZED_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, collection, mt, mt_info);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw106$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collection.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args)
                             && (NIL == cached_args.rest())
                             && mt_info.equal(cached_args.first()))) {
                          return memoization_state.caching_results(results2);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(quiet_has_type_memoizedP_internal(v_term, collection, mt, mt_info)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, collection, mt, mt_info));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** hashtable of defns that fail for term */
  @SubL(source = "cycl/at-defns.lisp", position = 47450) 
  private static SubLSymbol $cat_defns_failing$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 49469) 
  public static final SubLObject defn_note(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = NIL;
    }
    if ((arg6 == UNPROVIDED)) {
      arg6 = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
        PrintLow.format(T, format_str, new SubLObject[] {arg1, arg2, arg3, arg4, arg5, arg6});
        return NIL;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 57223) 
  public static final SubLObject any_sufficient_defn_anywhereP(SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.has_suf_defn_somewhereP(collection, NIL);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5338");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 60608) 
  public static SubLSymbol $cache_suf_defn_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 60608) 
  public static final SubLObject reset_cache_suf_defn_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $cache_suf_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $cache_suf_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $cache_suf_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $cache_suf_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $cache_suf_defn_meters$.getDynamicValue(thread), $list166);
      Hashtables.sethash($kw11$FUNCTION, $cache_suf_defn_meters$.getDynamicValue(thread), $sym167$CACHE_SUF_DEFN);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 60722) 
  public static SubLSymbol $uncache_suf_defn_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 60722) 
  public static final SubLObject reset_uncache_suf_defn_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $uncache_suf_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $uncache_suf_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $uncache_suf_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $uncache_suf_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $uncache_suf_defn_meters$.getDynamicValue(thread), $list166);
      Hashtables.sethash($kw11$FUNCTION, $uncache_suf_defn_meters$.getDynamicValue(thread), $sym171$UNCACHE_SUF_DEFN);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 61562) 
  public static final SubLObject handle_added_genl_for_suf_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.new_handle_added_genl_for_suf_defns(spec, genl);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5342");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 61783) 
  public static SubLSymbol $old_handle_added_genl_for_suf_defns_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 61783) 
  public static final SubLObject reset_old_handle_added_genl_for_suf_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), $list177);
      Hashtables.sethash($kw11$FUNCTION, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), $sym178$OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 62060) 
  public static final SubLObject handle_removed_genl_for_suf_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.new_handle_removed_genl_for_suf_defns(spec, genl);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5344");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 62287) 
  public static SubLSymbol $old_handle_removed_genl_for_suf_defns_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 62287) 
  public static final SubLObject reset_old_handle_removed_genl_for_suf_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), $list177);
      Hashtables.sethash($kw11$FUNCTION, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), $sym182$OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 67140) 
  public static final SubLObject any_sufficient_quoted_defn_anywhereP(SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.has_suf_defn_somewhereP(collection, T);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5339");
      }
    }
  }

  /** @return booleanp; t iff TERM either isa COLLECTION (via isa sbhl module)
   or admitted by (via defns module) COLLECTION? */
  @SubL(source = "cycl/at-defns.lisp", position = 67763) 
  public static final SubLObject quoted_has_typeP(SubLObject v_term, SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != term.ground_nautP(collection, UNPROVIDED))) {
      return quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
    } else if ((NIL != forts.fort_p(collection))) {
      return makeBoolean(((NIL != isa.quoted_isaP(v_term, collection, mt, UNPROVIDED))
            || (NIL != quoted_defns_admitP(collection, v_term, mt))));
    }
    return NIL;
  }

  @SubL(source = "cycl/at-defns.lisp", position = 73331) 
  public static SubLSymbol $cache_suf_quoted_defn_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 73331) 
  public static final SubLObject reset_cache_suf_quoted_defn_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), $list166);
      Hashtables.sethash($kw11$FUNCTION, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), $sym202$CACHE_SUF_QUOTED_DEFN);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 73459) 
  public static SubLSymbol $uncache_suf_quoted_defn_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 73459) 
  public static final SubLObject reset_uncache_suf_quoted_defn_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), $list166);
      Hashtables.sethash($kw11$FUNCTION, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), $sym206$UNCACHE_SUF_QUOTED_DEFN);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 74390) 
  public static final SubLObject handle_added_genl_for_suf_quoted_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.new_handle_added_genl_for_suf_quoted_defns(spec, genl);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5343");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 74632) 
  public static SubLSymbol $old_handle_added_genl_for_suf_quoted_defns_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 74632) 
  public static final SubLObject reset_old_handle_added_genl_for_suf_quoted_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list177);
      Hashtables.sethash($kw11$FUNCTION, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $sym213$OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 74930) 
  public static final SubLObject handle_removed_genl_for_suf_quoted_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_new_defns_functionsP$.getDynamicValue(thread))) {
        return defns.new_handle_removed_genl_for_suf_quoted_defns(spec, genl);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5345");
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 75178) 
  public static SubLSymbol $old_handle_removed_genl_for_suf_quoted_defns_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 75178) 
  public static final SubLObject reset_old_handle_removed_genl_for_suf_quoted_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list177);
      Hashtables.sethash($kw11$FUNCTION, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $sym217$OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 78513) 
  public static final SubLObject suf_function_cache(SubLObject type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = type;
        if (pcase_var.eql($kw119$ISA)) {
          return at_vars.$suf_function_cache$.getDynamicValue(thread);
        } else if (pcase_var.eql($kw225$QUOTED_ISA)) {
          return at_vars.$suf_quoted_function_cache$.getDynamicValue(thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 78927) 
  public static final SubLObject get_suf_function_assertions(SubLObject collection, SubLObject type) {
    return Hashtables.gethash(collection, suf_function_cache(type), UNPROVIDED);
  }

  @SubL(source = "cycl/at-defns.lisp", position = 79434) 
  public static final SubLObject suf_function_assertions(SubLObject collection, SubLObject type) {
    if ((NIL != forts.fort_p(collection))) {
      get_suf_function_assertions(collection, type);
    } else if ((NIL != obsolete.reifiable_natP(collection, UNPROVIDED, UNPROVIDED))) {
      return suf_function_assertions(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10323"), type);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-defns.lisp", position = 85402) 
  public static SubLSymbol $cache_suf_function_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 85402) 
  public static final SubLObject reset_cache_suf_function_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $cache_suf_function_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $cache_suf_function_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $cache_suf_function_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $cache_suf_function_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $cache_suf_function_meters$.getDynamicValue(thread), $list238);
      Hashtables.sethash($kw11$FUNCTION, $cache_suf_function_meters$.getDynamicValue(thread), $sym239$CACHE_SUF_FUNCTION);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 85534) 
  public static SubLSymbol $uncache_suf_function_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 85534) 
  public static final SubLObject reset_uncache_suf_function_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $uncache_suf_function_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $uncache_suf_function_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $uncache_suf_function_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $uncache_suf_function_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $uncache_suf_function_meters$.getDynamicValue(thread), $list238);
      Hashtables.sethash($kw11$FUNCTION, $uncache_suf_function_meters$.getDynamicValue(thread), $sym243$UNCACHE_SUF_FUNCTION);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 86941) 
  public static SubLSymbol $handle_added_genl_for_suf_functions_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 86941) 
  public static final SubLObject reset_handle_added_genl_for_suf_functions_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), $list177);
      Hashtables.sethash($kw11$FUNCTION, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), $sym253$HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 86941) 
  public static final SubLObject handle_added_genl_for_suf_functions_metered(SubLObject spec, SubLObject genl) {
    {
      SubLObject cdolist_list_var = $list255;
      SubLObject type = NIL;
      for (type = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), type = cdolist_list_var.first()) {
        {
          SubLObject function_assertions = suf_function_assertions(spec, type);
          if ((NIL != function_assertions)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5353");
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-defns.lisp", position = 86941) 
  public static final SubLObject handle_added_genl_for_suf_functions(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = handle_added_genl_for_suf_functions_metered(spec, genl);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw5$CALLS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw5$CALLS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw6$TIMES, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw6$TIMES, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw7$RESULTS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw7$RESULTS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw8$ARGS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(list(spec, genl), Hashtables.gethash($kw8$ARGS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return handle_added_genl_for_suf_functions_metered(spec, genl);
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 87286) 
  public static SubLSymbol $handle_removed_genl_for_suf_functions_meters$ = null;

  @SubL(source = "cycl/at-defns.lisp", position = 87286) 
  public static final SubLObject reset_handle_removed_genl_for_suf_functions_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw5$CALLS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw6$TIMES, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw7$RESULTS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw8$ARGS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw9$ARG_LIST, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), $list177);
      Hashtables.sethash($kw11$FUNCTION, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), $sym258$HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS);
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 87286) 
  public static final SubLObject handle_removed_genl_for_suf_functions_metered(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym117$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const118$EverythingPSC, thread);
          if ((NIL == genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED))) {
            {
              SubLObject cdolist_list_var = $list255;
              SubLObject type = NIL;
              for (type = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), type = cdolist_list_var.first()) {
                {
                  SubLObject function_assertions = suf_function_assertions(spec, type);
                  if ((NIL != function_assertions)) {
                    {
                      SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                      {
                        SubLObject _prev_bind_0_282 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        SubLObject _prev_bind_1_283 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                          sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                          {
                            SubLObject _prev_bind_0_284 = at_vars.$at_genls_space$.currentBinding(thread);
                            SubLObject _prev_bind_1_285 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                              at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                              Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1466");
                              Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5356");
                            } finally {
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_285, thread);
                              at_vars.$at_genls_space$.rebind(_prev_bind_0_284, thread);
                            }
                          }
                          sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        } finally {
                          sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_283, thread);
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_282, thread);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } finally {
          mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
          mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 87286) 
  public static final SubLObject handle_removed_genl_for_suf_functions(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = handle_removed_genl_for_suf_functions_metered(spec, genl);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw5$CALLS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw5$CALLS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw6$TIMES, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw6$TIMES, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw7$RESULTS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw7$RESULTS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw8$ARGS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(list(spec, genl), Hashtables.gethash($kw8$ARGS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return handle_removed_genl_for_suf_functions_metered(spec, genl);
      }
    }
  }

  @SubL(source = "cycl/at-defns.lisp", position = 92742) 
  public static final SubLObject clear_suf_functions() {
    Hashtables.clrhash(suf_function_cache($kw119$ISA));
    return NIL;
  }

  @SubL(source = "cycl/at-defns.lisp", position = 92999) 
  public static final SubLObject clear_suf_quoted_functions() {
    Hashtables.clrhash(suf_function_cache($kw225$QUOTED_ISA));
    return NIL;
  }

  /** invalid keys of suf-function cache */
  @SubL(source = "cycl/at-defns.lisp", position = 96171) 
  private static SubLSymbol $suf_function_cache_mal_keys$ = null;

  /** keys of suf-function cache that have no value */
  @SubL(source = "cycl/at-defns.lisp", position = 96266) 
  private static SubLSymbol $suf_function_cache_key_wXo_value$ = null;

  /** keys of suf-function cache that have an invalid value */
  @SubL(source = "cycl/at-defns.lisp", position = 96376) 
  private static SubLSymbol $suf_function_cache_key_wXmal_value$ = null;

  /** keys of suf-function cache that have an inappropriate indirect value */
  @SubL(source = "cycl/at-defns.lisp", position = 96496) 
  private static SubLSymbol $suf_function_cache_key_wXstale_value$ = null;

  /** keys of suf-function cache that are missing an indirect value */
  @SubL(source = "cycl/at-defns.lisp", position = 96633) 
  private static SubLSymbol $suf_function_cache_keys_wXo_inerited_value$ = null;

  /** assertions missing as direct values from suf-function cache */
  @SubL(source = "cycl/at-defns.lisp", position = 96769) 
  private static SubLSymbol $suf_function_cache_awol_direct_assertions$ = null;

  public static final SubLObject declare_at_defns_file() {
    //declareFunction(myName, "suf_defn_cache_as_alist", "SUF-DEFN-CACHE-AS-ALIST", 0, 0, false);
    //declareFunction(myName, "suf_defn_cache_get", "SUF-DEFN-CACHE-GET", 1, 0, false);
    //declareFunction(myName, "suf_defn_cache_add", "SUF-DEFN-CACHE-ADD", 2, 0, false);
    //declareFunction(myName, "suf_defn_cache_rem", "SUF-DEFN-CACHE-REM", 2, 0, false);
    //declareFunction(myName, "suf_defn_cache_merge", "SUF-DEFN-CACHE-MERGE", 2, 0, false);
    //declareFunction(myName, "remove_suf_defn_assertions", "REMOVE-SUF-DEFN-ASSERTIONS", 1, 1, false);
    declareFunction(myName, "clear_suf_defns", "CLEAR-SUF-DEFNS", 0, 0, false);
    //declareFunction(myName, "sort_suf_defn_cache", "SORT-SUF-DEFN-CACHE", 0, 0, false);
    //declareFunction(myName, "suf_quoted_defn_cache_as_alist", "SUF-QUOTED-DEFN-CACHE-AS-ALIST", 0, 0, false);
    //declareFunction(myName, "suf_quoted_defn_cache_get", "SUF-QUOTED-DEFN-CACHE-GET", 1, 0, false);
    //declareFunction(myName, "suf_quoted_defn_cache_add", "SUF-QUOTED-DEFN-CACHE-ADD", 2, 0, false);
    //declareFunction(myName, "suf_quoted_defn_cache_rem", "SUF-QUOTED-DEFN-CACHE-REM", 2, 0, false);
    //declareFunction(myName, "suf_quoted_defn_cache_merge", "SUF-QUOTED-DEFN-CACHE-MERGE", 2, 0, false);
    //declareFunction(myName, "remove_suf_quoted_defn_assertions", "REMOVE-SUF-QUOTED-DEFN-ASSERTIONS", 1, 1, false);
    declareFunction(myName, "clear_suf_quoted_defns", "CLEAR-SUF-QUOTED-DEFNS", 0, 0, false);
    //declareFunction(myName, "sort_suf_quoted_defn_cache", "SORT-SUF-QUOTED-DEFN-CACHE", 0, 0, false);
    //declareFunction(myName, "at_defns_admitP", "AT-DEFNS-ADMIT?", 1, 0, false);
    //declareFunction(myName, "at_defns_rejectP", "AT-DEFNS-REJECT?", 1, 0, false);
    declareFunction(myName, "defns_admitP", "DEFNS-ADMIT?", 2, 1, false);
    declareFunction(myName, "reset_old_defns_admitP_meters", "RESET-OLD-DEFNS-ADMIT?-METERS", 0, 0, false);
    //declareFunction(myName, "old_defns_admitP_metered", "OLD-DEFNS-ADMIT?-METERED", 2, 1, false);
    //declareFunction(myName, "old_defns_admitP", "OLD-DEFNS-ADMIT?", 2, 1, false);
    declareFunction(myName, "defns_rejectP", "DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "reset_old_defns_rejectP_meters", "RESET-OLD-DEFNS-REJECT?-METERS", 0, 0, false);
    //declareFunction(myName, "old_defns_rejectP_metered", "OLD-DEFNS-REJECT?-METERED", 2, 1, false);
    //declareFunction(myName, "old_defns_rejectP", "OLD-DEFNS-REJECT?", 2, 1, false);
    //declareFunction(myName, "defining_defns_admitP", "DEFINING-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "defining_defns_rejectP", "DEFINING-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "reset_defining_defns_status_meters", "RESET-DEFINING-DEFNS-STATUS-METERS", 0, 0, false);
    //declareFunction(myName, "defining_defns_status_metered", "DEFINING-DEFNS-STATUS-METERED", 2, 1, false);
    //declareFunction(myName, "defining_defns_status", "DEFINING-DEFNS-STATUS", 2, 1, false);
    //declareFunction(myName, "defining_defn_violation_data", "DEFINING-DEFN-VIOLATION-DATA", 4, 1, false);
    declareFunction(myName, "reset_sufficient_defns_admitP_meters", "RESET-SUFFICIENT-DEFNS-ADMIT?-METERS", 0, 0, false);
    //declareFunction(myName, "sufficient_defns_admitP_metered", "SUFFICIENT-DEFNS-ADMIT?-METERED", 2, 1, false);
    //declareFunction(myName, "sufficient_defns_admitP", "SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "sufficient_defns_admit_int", "SUFFICIENT-DEFNS-ADMIT-INT", 3, 2, false);
    //declareFunction(myName, "why_sufficient_defns_admitP", "WHY-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "sufficient_defn_violation_data", "SUFFICIENT-DEFN-VIOLATION-DATA", 4, 1, false);
    //declareFunction(myName, "necessary_defns_permitP", "NECESSARY-DEFNS-PERMIT?", 2, 1, false);
    declareFunction(myName, "reset_necessary_defns_rejectP_meters", "RESET-NECESSARY-DEFNS-REJECT?-METERS", 0, 0, false);
    //declareFunction(myName, "necessary_defns_rejectP_metered", "NECESSARY-DEFNS-REJECT?-METERED", 2, 1, false);
    //declareFunction(myName, "necessary_defns_rejectP", "NECESSARY-DEFNS-REJECT?", 2, 1, false);
    //declareFunction(myName, "necessary_defns_rejectP_int", "NECESSARY-DEFNS-REJECT?-INT", 5, 1, false);
    declareFunction(myName, "denotational_term_admitted_by_defn_via_isaP", "DENOTATIONAL-TERM-ADMITTED-BY-DEFN-VIA-ISA?", 2, 1, false);
    declareFunction(myName, "reset_rejected_by_necessary_defns_meters", "RESET-REJECTED-BY-NECESSARY-DEFNS-METERS", 0, 0, false);
    //declareFunction(myName, "rejected_by_necessary_defns_metered", "REJECTED-BY-NECESSARY-DEFNS-METERED", 2, 1, false);
    //declareFunction(myName, "rejected_by_necessary_defns", "REJECTED-BY-NECESSARY-DEFNS", 2, 1, false);
    //declareFunction(myName, "why_defns_rejectP", "WHY-DEFNS-REJECT?", 2, 1, false);
    //declareFunction(myName, "necessary_defn_violation_data", "NECESSARY-DEFN-VIOLATION-DATA", 5, 1, false);
    //declareFunction(myName, "at_quoted_defns_admitP", "AT-QUOTED-DEFNS-ADMIT?", 1, 0, false);
    //declareFunction(myName, "at_quoted_defns_rejectP", "AT-QUOTED-DEFNS-REJECT?", 1, 0, false);
    declareFunction(myName, "quoted_defns_admitP", "QUOTED-DEFNS-ADMIT?", 2, 1, false);
    declareFunction(myName, "reset_old_quoted_defns_admitP_meters", "RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS", 0, 0, false);
    //declareFunction(myName, "old_quoted_defns_admitP_metered", "OLD-QUOTED-DEFNS-ADMIT?-METERED", 2, 1, false);
    //declareFunction(myName, "old_quoted_defns_admitP", "OLD-QUOTED-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "quoted_defns_rejectP", "QUOTED-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "reset_old_quoted_defns_rejectP_meters", "RESET-OLD-QUOTED-DEFNS-REJECT?-METERS", 0, 0, false);
    //declareFunction(myName, "old_quoted_defns_rejectP_metered", "OLD-QUOTED-DEFNS-REJECT?-METERED", 2, 1, false);
    //declareFunction(myName, "old_quoted_defns_rejectP", "OLD-QUOTED-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "reset_quoted_defining_defns_status_meters", "RESET-QUOTED-DEFINING-DEFNS-STATUS-METERS", 0, 0, false);
    //declareFunction(myName, "quoted_defining_defns_status_metered", "QUOTED-DEFINING-DEFNS-STATUS-METERED", 2, 1, false);
    //declareFunction(myName, "quoted_defining_defns_status", "QUOTED-DEFINING-DEFNS-STATUS", 2, 1, false);
    declareFunction(myName, "reset_quoted_sufficient_defns_admitP_meters", "RESET-QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS", 0, 0, false);
    //declareFunction(myName, "quoted_sufficient_defns_admitP_metered", "QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERED", 2, 1, false);
    //declareFunction(myName, "quoted_sufficient_defns_admitP", "QUOTED-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "quoted_necessary_defns_permitP", "QUOTED-NECESSARY-DEFNS-PERMIT?", 2, 1, false);
    declareFunction(myName, "reset_quoted_necessary_defns_rejectP_meters", "RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS", 0, 0, false);
    //declareFunction(myName, "quoted_necessary_defns_rejectP_metered", "QUOTED-NECESSARY-DEFNS-REJECT?-METERED", 2, 1, false);
    //declareFunction(myName, "quoted_necessary_defns_rejectP", "QUOTED-NECESSARY-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "denotational_term_admitted_by_quoted_defn_via_quoted_isaP", "DENOTATIONAL-TERM-ADMITTED-BY-QUOTED-DEFN-VIA-QUOTED-ISA?", 2, 1, false);
    declareFunction(myName, "reset_rejected_by_quoted_necessary_defns_meters", "RESET-REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS", 0, 0, false);
    //declareFunction(myName, "rejected_by_quoted_necessary_defns_metered", "REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERED", 2, 1, false);
    //declareFunction(myName, "rejected_by_quoted_necessary_defns", "REJECTED-BY-QUOTED-NECESSARY-DEFNS", 2, 1, false);
    //declareFunction(myName, "why_quoted_defns_rejectP", "WHY-QUOTED-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "new_defn_stack", "NEW-DEFN-STACK", 0, 0, false);
    declareFunction(myName, "defn_stack_push", "DEFN-STACK-PUSH", 2, 0, false);
    declareFunction(myName, "defn_stack_pop", "DEFN-STACK-POP", 2, 0, false);
    declareFunction(myName, "recursive_defn_callP", "RECURSIVE-DEFN-CALL?", 2, 0, false);
    //declareFunction(myName, "get_defn_col_history", "GET-DEFN-COL-HISTORY", 1, 0, false);
    //declareFunction(myName, "set_defn_col_history", "SET-DEFN-COL-HISTORY", 2, 0, false);
    declareFunction(myName, "get_defn_fn_history", "GET-DEFN-FN-HISTORY", 1, 0, false);
    declareFunction(myName, "set_defn_fn_history", "SET-DEFN-FN-HISTORY", 2, 0, false);
    declareFunction(myName, "get_quoted_defn_fn_history", "GET-QUOTED-DEFN-FN-HISTORY", 1, 0, false);
    //declareFunction(myName, "set_quoted_defn_fn_history", "SET-QUOTED-DEFN-FN-HISTORY", 2, 0, false);
    //declareFunction(myName, "get_quoted_defn_col_history", "GET-QUOTED-DEFN-COL-HISTORY", 1, 0, false);
    //declareFunction(myName, "set_quoted_defn_col_history", "SET-QUOTED-DEFN-COL-HISTORY", 2, 0, false);
    declareFunction(myName, "quiet_defns_admitP", "QUIET-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "quiet_sufficient_defns_admitP", "QUIET-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "quiet_defns_rejectP", "QUIET-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "quiet_defn_admitsP", "QUIET-DEFN-ADMITS?", 3, 1, false);
    declareFunction(myName, "defn_admitsP", "DEFN-ADMITS?", 3, 1, false);
    declareFunction(myName, "collection_specific_defnP", "COLLECTION-SPECIFIC-DEFN?", 1, 0, false);
    declareFunction(myName, "defn_history", "DEFN-HISTORY", 1, 0, false);
    declareFunction(myName, "reset_defn_admits_intP_meters", "RESET-DEFN-ADMITS-INT?-METERS", 0, 0, false);
    declareFunction(myName, "defn_admits_intP_metered", "DEFN-ADMITS-INT?-METERED", 3, 0, false);
    declareFunction(myName, "defn_admits_intP", "DEFN-ADMITS-INT?", 3, 0, false);
    //declareFunction(myName, "quiet_quoted_defns_admitP", "QUIET-QUOTED-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "quiet_quoted_sufficient_defns_admitP", "QUIET-QUOTED-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
    //declareFunction(myName, "quiet_quoted_defns_rejectP", "QUIET-QUOTED-DEFNS-REJECT?", 2, 1, false);
    //declareFunction(myName, "quiet_quoted_defn_admitsP", "QUIET-QUOTED-DEFN-ADMITS?", 3, 1, false);
    declareFunction(myName, "quoted_defn_admitsP", "QUOTED-DEFN-ADMITS?", 3, 1, false);
    declareFunction(myName, "quoted_defn_history", "QUOTED-DEFN-HISTORY", 1, 0, false);
    declareFunction(myName, "reset_quoted_defn_admits_intP_meters", "RESET-QUOTED-DEFN-ADMITS-INT?-METERS", 0, 0, false);
    declareFunction(myName, "quoted_defn_admits_intP_metered", "QUOTED-DEFN-ADMITS-INT?-METERED", 3, 0, false);
    declareFunction(myName, "quoted_defn_admits_intP", "QUOTED-DEFN-ADMITS-INT?", 3, 0, false);
    declareFunction(myName, "clear_defn_cyc_evaluate", "CLEAR-DEFN-CYC-EVALUATE", 0, 0, false);
    //declareFunction(myName, "remove_defn_cyc_evaluate", "REMOVE-DEFN-CYC-EVALUATE", 1, 0, false);
    //declareFunction(myName, "defn_cyc_evaluate_internal", "DEFN-CYC-EVALUATE-INTERNAL", 1, 0, false);
    //declareFunction(myName, "defn_cyc_evaluate", "DEFN-CYC-EVALUATE", 1, 0, false);
    declareFunction(myName, "valid_defnP", "VALID-DEFN?", 1, 1, false);
    declareFunction(myName, "viable_defnP", "VIABLE-DEFN?", 1, 1, false);
    declareFunction(myName, "defn_funcall", "DEFN-FUNCALL", 2, 0, false);
    declareFunction(myName, "at_denotational_term_p", "AT-DENOTATIONAL-TERM-P", 1, 1, false);
    declareFunction(myName, "clear_defn_space", "CLEAR-DEFN-SPACE", 0, 0, false);
    //declareFunction(myName, "map_sufficient_defn_cols", "MAP-SUFFICIENT-DEFN-COLS", 1, 0, false);
    declareFunction(myName, "has_typeP", "HAS-TYPE?", 2, 1, false);
    declareFunction(myName, "quiet_has_typeP", "QUIET-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "quiet_has_any_typeP", "QUIET-HAS-ANY-TYPE?", 2, 1, false);
    declareFunction(myName, "quiet_has_type_memoizedP_internal", "QUIET-HAS-TYPE-MEMOIZED?-INTERNAL", 2, 2, false);
    declareFunction(myName, "quiet_has_type_memoizedP", "QUIET-HAS-TYPE-MEMOIZED?", 2, 2, false);
    //declareFunction(myName, "not_has_type_by_extent_knownP", "NOT-HAS-TYPE-BY-EXTENT-KNOWN?", 2, 1, false);
    //declareFunction(myName, "not_has_typeP", "NOT-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "quiet_not_has_typeP", "QUIET-NOT-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "quick_quiet_has_typeP", "QUICK-QUIET-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "quick_quiet_has_typeP_fort", "QUICK-QUIET-HAS-TYPE?-FORT", 3, 0, false);
    //declareFunction(myName, "quick_quiet_has_typeP_naut", "QUICK-QUIET-HAS-TYPE?-NAUT", 3, 0, false);
    //declareFunction(myName, "max_mts_of_admitting_defns", "MAX-MTS-OF-ADMITTING-DEFNS", 2, 0, false);
    //declareFunction(myName, "mts_of_admitting_sufficient_defns", "MTS-OF-ADMITTING-SUFFICIENT-DEFNS", 2, 0, false);
    //declareFunction(myName, "old_mts_of_admitting_sufficient_defns", "OLD-MTS-OF-ADMITTING-SUFFICIENT-DEFNS", 2, 0, false);
    //declareFunction(myName, "max_mts_of_admitting_quoted_defns", "MAX-MTS-OF-ADMITTING-QUOTED-DEFNS", 2, 0, false);
    //declareFunction(myName, "mts_of_admitting_sufficient_quoted_defns", "MTS-OF-ADMITTING-SUFFICIENT-QUOTED-DEFNS", 2, 0, false);
    //declareFunction(myName, "isa_via_defnsP", "ISA-VIA-DEFNS?", 2, 1, false);
    //declareFunction(myName, "hl_justify_isa_via_defns", "HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
    //declareFunction(myName, "old_hl_justify_isa_via_defns", "OLD-HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
    //declareFunction(myName, "not_isa_via_defnsP", "NOT-ISA-VIA-DEFNS?", 2, 1, false);
    //declareFunction(myName, "why_not_isa_via_defnsP", "WHY-NOT-ISA-VIA-DEFNS?", 2, 1, false);
    //declareFunction(myName, "hl_justify_not_isa_via_defns", "HL-JUSTIFY-NOT-ISA-VIA-DEFNS", 2, 1, false);
    //declareFunction(myName, "collection_rejects_via_disjoint_defnsP", "COLLECTION-REJECTS-VIA-DISJOINT-DEFNS?", 2, 1, false);
    //declareFunction(myName, "why_collection_rejects_via_disjoint_defnsP", "WHY-COLLECTION-REJECTS-VIA-DISJOINT-DEFNS?", 2, 1, false);
    //declareFunction(myName, "collections_admitting_term_via_defns", "COLLECTIONS-ADMITTING-TERM-VIA-DEFNS", 1, 0, false);
    //declareFunction(myName, "min_max_collections_admitting_term_via_defns", "MIN-MAX-COLLECTIONS-ADMITTING-TERM-VIA-DEFNS", 1, 1, false);
    //declareFunction(myName, "collections_admitting_term_via_defns_1", "COLLECTIONS-ADMITTING-TERM-VIA-DEFNS-1", 1, 0, false);
    //declareFunction(myName, "gather_collections_admitting_via_defns", "GATHER-COLLECTIONS-ADMITTING-VIA-DEFNS", 1, 0, false);
    declareFunction(myName, "defn_note", "DEFN-NOTE", 2, 6, false);
    //declareFunction(myName, "defn_error", "DEFN-ERROR", 2, 5, false);
    //declareFunction(myName, "defn_cerror", "DEFN-CERROR", 3, 5, false);
    //declareFunction(myName, "defn_warn", "DEFN-WARN", 2, 5, false);
    //declareFunction(myName, "reset_defn_meters", "RESET-DEFN-METERS", 0, 0, false);
    //declareFunction(myName, "report_defn_meters", "REPORT-DEFN-METERS", 0, 1, false);
    //declareFunction(myName, "summarize_defn_meters", "SUMMARIZE-DEFN-METERS", 0, 1, false);
    //declareFunction(myName, "summarize_defn_meter_cache_header", "SUMMARIZE-DEFN-METER-CACHE-HEADER", 0, 2, false);
    //declareFunction(myName, "summarize_defn_meter_cache", "SUMMARIZE-DEFN-METER-CACHE", 1, 2, false);
    //declareFunction(myName, "summarize_defn_meter_cache_trailer", "SUMMARIZE-DEFN-METER-CACHE-TRAILER", 0, 2, false);
    //declareFunction(myName, "report_defn_meter_cache", "REPORT-DEFN-METER-CACHE", 1, 1, false);
    //declareFunction(myName, "report_defn_meter_cache_header", "REPORT-DEFN-METER-CACHE-HEADER", 1, 2, false);
    //declareFunction(myName, "report_defn_meter_cache_trailer", "REPORT-DEFN-METER-CACHE-TRAILER", 1, 2, false);
    //declareFunction(myName, "report_defn_meter_cache_call", "REPORT-DEFN-METER-CACHE-CALL", 2, 2, false);
    //declareFunction(myName, "report_defn_meter_cache_total", "REPORT-DEFN-METER-CACHE-TOTAL", 1, 2, false);
    //declareFunction(myName, "function_col_width", "FUNCTION-COL-WIDTH", 1, 0, false);
    //declareFunction(myName, "meter_col_widths", "METER-COL-WIDTHS", 1, 0, false);
    //declareFunction(myName, "suf_defn_assertions", "SUF-DEFN-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "suf_defnP", "SUF-DEFN?", 2, 0, false);
    //declareFunction(myName, "old_suf_defnP", "OLD-SUF-DEFN?", 2, 0, false);
    declareFunction(myName, "any_sufficient_defn_anywhereP", "ANY-SUFFICIENT-DEFN-ANYWHERE?", 1, 0, false);
    //declareFunction(myName, "old_any_sufficient_defn_anywhereP", "OLD-ANY-SUFFICIENT-DEFN-ANYWHERE?", 1, 0, false);
    //declareFunction(myName, "suf_defn_assertionP", "SUF-DEFN-ASSERTION?", 2, 0, false);
    //declareFunction(myName, "add_suf_defn", "ADD-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "add_iff_defn", "ADD-IFF-DEFN", 2, 0, false);
    //declareFunction(myName, "old_add_suf_defn", "OLD-ADD-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "remove_suf_defn", "REMOVE-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "remove_iff_defn", "REMOVE-IFF-DEFN", 2, 0, false);
    //declareFunction(myName, "old_remove_suf_defn", "OLD-REMOVE-SUF-DEFN", 2, 0, false);
    declareFunction(myName, "reset_cache_suf_defn_meters", "RESET-CACHE-SUF-DEFN-METERS", 0, 0, false);
    //declareFunction(myName, "cache_suf_defn_metered", "CACHE-SUF-DEFN-METERED", 2, 0, false);
    //declareFunction(myName, "cache_suf_defn", "CACHE-SUF-DEFN", 2, 0, false);
    declareFunction(myName, "reset_uncache_suf_defn_meters", "RESET-UNCACHE-SUF-DEFN-METERS", 0, 0, false);
    //declareFunction(myName, "uncache_suf_defn_metered", "UNCACHE-SUF-DEFN-METERED", 2, 0, false);
    //declareFunction(myName, "uncache_suf_defn", "UNCACHE-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "cache_suf_defn_int", "CACHE-SUF-DEFN-INT", 2, 1, false);
    //declareFunction(myName, "uncache_suf_defn_int", "UNCACHE-SUF-DEFN-INT", 2, 1, false);
    declareFunction(myName, "handle_added_genl_for_suf_defns", "HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
    declareFunction(myName, "reset_old_handle_added_genl_for_suf_defns_meters", "RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
    //declareFunction(myName, "old_handle_added_genl_for_suf_defns_metered", "OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
    //declareFunction(myName, "old_handle_added_genl_for_suf_defns", "OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
    declareFunction(myName, "handle_removed_genl_for_suf_defns", "HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
    declareFunction(myName, "reset_old_handle_removed_genl_for_suf_defns_meters", "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
    //declareFunction(myName, "old_handle_removed_genl_for_suf_defns_metered", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
    //declareFunction(myName, "old_handle_removed_genl_for_suf_defns", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
    //declareFunction(myName, "propagate_added_suf_defn", "PROPAGATE-ADDED-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "propagate_removed_suf_defn", "PROPAGATE-REMOVED-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "propagate_added_suf_defns", "PROPAGATE-ADDED-SUF-DEFNS", 2, 0, false);
    //declareFunction(myName, "propagate_removed_suf_defns", "PROPAGATE-REMOVED-SUF-DEFNS", 2, 0, false);
    //declareFunction(myName, "add_suf_defn_assertion", "ADD-SUF-DEFN-ASSERTION", 1, 1, false);
    //declareFunction(myName, "remove_suf_defn_assertion", "REMOVE-SUF-DEFN-ASSERTION", 1, 1, false);
    //declareFunction(myName, "merge_suf_defn_assertions", "MERGE-SUF-DEFN-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "defn_genl_searchedP", "DEFN-GENL-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "arg1_spec_cardinality", "ARG1-SPEC-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "suf_defn_sort", "SUF-DEFN-SORT", 1, 0, false);
    //declareFunction(myName, "reset_col_suf_defns", "RESET-COL-SUF-DEFNS", 1, 0, false);
    //declareFunction(myName, "reset_all_suf_defns", "RESET-ALL-SUF-DEFNS", 0, 2, false);
    //declareFunction(myName, "initialize_sufficient_defns_cache", "INITIALIZE-SUFFICIENT-DEFNS-CACHE", 0, 0, false);
    //declareFunction(myName, "suf_quoted_defn_assertions", "SUF-QUOTED-DEFN-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "suf_quoted_defnP", "SUF-QUOTED-DEFN?", 2, 0, false);
    //declareFunction(myName, "any_sufficient_quoted_defnP", "ANY-SUFFICIENT-QUOTED-DEFN?", 1, 1, false);
    declareFunction(myName, "any_sufficient_quoted_defn_anywhereP", "ANY-SUFFICIENT-QUOTED-DEFN-ANYWHERE?", 1, 0, false);
    //declareFunction(myName, "old_any_sufficient_quoted_defn_anywhereP", "OLD-ANY-SUFFICIENT-QUOTED-DEFN-ANYWHERE?", 1, 0, false);
    //declareFunction(myName, "suf_quoted_defn_assertionP", "SUF-QUOTED-DEFN-ASSERTION?", 2, 0, false);
    declareFunction(myName, "quoted_has_typeP", "QUOTED-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "quiet_quoted_has_typeP", "QUIET-QUOTED-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "not_quoted_has_type_by_extent_knownP", "NOT-QUOTED-HAS-TYPE-BY-EXTENT-KNOWN?", 2, 1, false);
    //declareFunction(myName, "not_quoted_has_typeP", "NOT-QUOTED-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "quiet_not_quoted_has_typeP", "QUIET-NOT-QUOTED-HAS-TYPE?", 2, 1, false);
    //declareFunction(myName, "add_suf_quoted_defn", "ADD-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "add_iff_quoted_defn", "ADD-IFF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "old_add_suf_quoted_defn", "OLD-ADD-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "remove_suf_quoted_defn", "REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "remove_iff_quoted_defn", "REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "old_remove_suf_quoted_defn", "OLD-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
    declareFunction(myName, "reset_cache_suf_quoted_defn_meters", "RESET-CACHE-SUF-QUOTED-DEFN-METERS", 0, 0, false);
    //declareFunction(myName, "cache_suf_quoted_defn_metered", "CACHE-SUF-QUOTED-DEFN-METERED", 2, 0, false);
    //declareFunction(myName, "cache_suf_quoted_defn", "CACHE-SUF-QUOTED-DEFN", 2, 0, false);
    declareFunction(myName, "reset_uncache_suf_quoted_defn_meters", "RESET-UNCACHE-SUF-QUOTED-DEFN-METERS", 0, 0, false);
    //declareFunction(myName, "uncache_suf_quoted_defn_metered", "UNCACHE-SUF-QUOTED-DEFN-METERED", 2, 0, false);
    //declareFunction(myName, "uncache_suf_quoted_defn", "UNCACHE-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "cache_suf_quoted_defn_int", "CACHE-SUF-QUOTED-DEFN-INT", 2, 1, false);
    //declareFunction(myName, "uncache_suf_quoted_defn_int", "UNCACHE-SUF-QUOTED-DEFN-INT", 2, 1, false);
    declareFunction(myName, "handle_added_genl_for_suf_quoted_defns", "HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
    declareFunction(myName, "reset_old_handle_added_genl_for_suf_quoted_defns_meters", "RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
    //declareFunction(myName, "old_handle_added_genl_for_suf_quoted_defns_metered", "OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
    //declareFunction(myName, "old_handle_added_genl_for_suf_quoted_defns", "OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
    declareFunction(myName, "handle_removed_genl_for_suf_quoted_defns", "HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
    declareFunction(myName, "reset_old_handle_removed_genl_for_suf_quoted_defns_meters", "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
    //declareFunction(myName, "old_handle_removed_genl_for_suf_quoted_defns_metered", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
    //declareFunction(myName, "old_handle_removed_genl_for_suf_quoted_defns", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
    //declareFunction(myName, "propagate_added_suf_quoted_defn", "PROPAGATE-ADDED-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "propagate_removed_suf_quoted_defn", "PROPAGATE-REMOVED-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "propagate_added_suf_quoted_defns", "PROPAGATE-ADDED-SUF-QUOTED-DEFNS", 2, 0, false);
    //declareFunction(myName, "propagate_removed_suf_quoted_defns", "PROPAGATE-REMOVED-SUF-QUOTED-DEFNS", 2, 0, false);
    //declareFunction(myName, "add_suf_quoted_defn_assertion", "ADD-SUF-QUOTED-DEFN-ASSERTION", 1, 1, false);
    //declareFunction(myName, "remove_suf_quoted_defn_assertion", "REMOVE-SUF-QUOTED-DEFN-ASSERTION", 1, 1, false);
    //declareFunction(myName, "merge_suf_quoted_defn_assertions", "MERGE-SUF-QUOTED-DEFN-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "reset_col_suf_quoted_defns", "RESET-COL-SUF-QUOTED-DEFNS", 1, 0, false);
    //declareFunction(myName, "reset_all_suf_quoted_defns", "RESET-ALL-SUF-QUOTED-DEFNS", 0, 2, false);
    //declareFunction(myName, "initialize_sufficient_quoted_defns_cache", "INITIALIZE-SUFFICIENT-QUOTED-DEFNS-CACHE", 0, 0, false);
    declareFunction(myName, "suf_function_cache", "SUF-FUNCTION-CACHE", 1, 0, false);
    declareFunction(myName, "get_suf_function_assertions", "GET-SUF-FUNCTION-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "set_suf_function_assertions", "SET-SUF-FUNCTION-ASSERTIONS", 3, 0, false);
    //declareFunction(myName, "rem_suf_function_assertions", "REM-SUF-FUNCTION-ASSERTIONS", 2, 0, false);
    declareFunction(myName, "suf_function_assertions", "SUF-FUNCTION-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "suf_functionP", "SUF-FUNCTION?", 3, 0, false);
    //declareFunction(myName, "any_sufficient_functionP", "ANY-SUFFICIENT-FUNCTION?", 1, 1, false);
    //declareFunction(myName, "any_sufficient_quoted_functionP", "ANY-SUFFICIENT-QUOTED-FUNCTION?", 1, 1, false);
    //declareFunction(myName, "any_sufficient_functionP_int", "ANY-SUFFICIENT-FUNCTION?-INT", 3, 0, false);
    //declareFunction(myName, "any_sufficient_non_reified_functionP", "ANY-SUFFICIENT-NON-REIFIED-FUNCTION?", 2, 1, false);
    //declareFunction(myName, "suf_function_assertionP", "SUF-FUNCTION-ASSERTION?", 3, 0, false);
    //declareFunction(myName, "sufficient_function_of", "SUFFICIENT-FUNCTION-OF", 2, 1, false);
    //declareFunction(myName, "add_suf_function", "ADD-SUF-FUNCTION", 2, 0, false);
    //declareFunction(myName, "remove_suf_function", "REMOVE-SUF-FUNCTION", 2, 0, false);
    //declareFunction(myName, "add_suf_quoted_function", "ADD-SUF-QUOTED-FUNCTION", 2, 0, false);
    //declareFunction(myName, "remove_suf_quoted_function", "REMOVE-SUF-QUOTED-FUNCTION", 2, 0, false);
    //declareFunction(myName, "add_suf_function_int", "ADD-SUF-FUNCTION-INT", 3, 0, false);
    //declareFunction(myName, "remove_suf_function_int", "REMOVE-SUF-FUNCTION-INT", 3, 0, false);
    declareFunction(myName, "reset_cache_suf_function_meters", "RESET-CACHE-SUF-FUNCTION-METERS", 0, 0, false);
    //declareFunction(myName, "cache_suf_function_metered", "CACHE-SUF-FUNCTION-METERED", 3, 0, false);
    //declareFunction(myName, "cache_suf_function", "CACHE-SUF-FUNCTION", 3, 0, false);
    declareFunction(myName, "reset_uncache_suf_function_meters", "RESET-UNCACHE-SUF-FUNCTION-METERS", 0, 0, false);
    //declareFunction(myName, "uncache_suf_function_metered", "UNCACHE-SUF-FUNCTION-METERED", 3, 0, false);
    //declareFunction(myName, "uncache_suf_function", "UNCACHE-SUF-FUNCTION", 3, 0, false);
    //declareFunction(myName, "cache_suf_function_int", "CACHE-SUF-FUNCTION-INT", 3, 1, false);
    //declareFunction(myName, "uncache_suf_function_int", "UNCACHE-SUF-FUNCTION-INT", 3, 1, false);
    declareFunction(myName, "reset_handle_added_genl_for_suf_functions_meters", "RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS", 0, 0, false);
    declareFunction(myName, "handle_added_genl_for_suf_functions_metered", "HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERED", 2, 0, false);
    declareFunction(myName, "handle_added_genl_for_suf_functions", "HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS", 2, 0, false);
    declareFunction(myName, "reset_handle_removed_genl_for_suf_functions_meters", "RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS", 0, 0, false);
    declareFunction(myName, "handle_removed_genl_for_suf_functions_metered", "HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERED", 2, 0, false);
    declareFunction(myName, "handle_removed_genl_for_suf_functions", "HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS", 2, 0, false);
    //declareFunction(myName, "propagate_added_suf_function", "PROPAGATE-ADDED-SUF-FUNCTION", 3, 0, false);
    //declareFunction(myName, "propagate_removed_suf_function", "PROPAGATE-REMOVED-SUF-FUNCTION", 3, 0, false);
    //declareFunction(myName, "propagate_added_suf_functions", "PROPAGATE-ADDED-SUF-FUNCTIONS", 3, 0, false);
    //declareFunction(myName, "propagate_removed_suf_functions", "PROPAGATE-REMOVED-SUF-FUNCTIONS", 3, 0, false);
    //declareFunction(myName, "add_suf_function_assertion", "ADD-SUF-FUNCTION-ASSERTION", 1, 1, false);
    //declareFunction(myName, "remove_suf_function_assertion", "REMOVE-SUF-FUNCTION-ASSERTION", 1, 1, false);
    //declareFunction(myName, "merge_suf_function_assertions", "MERGE-SUF-FUNCTION-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "remove_suf_function_assertions", "REMOVE-SUF-FUNCTION-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "add_suf_quoted_function_assertion", "ADD-SUF-QUOTED-FUNCTION-ASSERTION", 1, 1, false);
    //declareFunction(myName, "remove_suf_quoted_function_assertion", "REMOVE-SUF-QUOTED-FUNCTION-ASSERTION", 1, 1, false);
    //declareFunction(myName, "merge_suf_quoted_function_assertions", "MERGE-SUF-QUOTED-FUNCTION-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "remove_suf_quoted_function_assertions", "REMOVE-SUF-QUOTED-FUNCTION-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "merge_suf_function_assertions_int", "MERGE-SUF-FUNCTION-ASSERTIONS-INT", 3, 0, false);
    //declareFunction(myName, "remove_suf_function_assertions_int", "REMOVE-SUF-FUNCTION-ASSERTIONS-INT", 3, 0, false);
    //declareFunction(myName, "function_genl_searchedP", "FUNCTION-GENL-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "suf_function_sort", "SUF-FUNCTION-SORT", 1, 0, false);
    //declareFunction(myName, "suf_function_sort_pred", "SUF-FUNCTION-SORT-PRED", 2, 0, false);
    declareFunction(myName, "clear_suf_functions", "CLEAR-SUF-FUNCTIONS", 0, 0, false);
    declareFunction(myName, "clear_suf_quoted_functions", "CLEAR-SUF-QUOTED-FUNCTIONS", 0, 0, false);
    //declareFunction(myName, "reset_col_suf_functions", "RESET-COL-SUF-FUNCTIONS", 2, 0, false);
    //declareFunction(myName, "reset_all_suf_functions", "RESET-ALL-SUF-FUNCTIONS", 1, 2, false);
    //declareFunction(myName, "initialize_sufficient_functions_cache", "INITIALIZE-SUFFICIENT-FUNCTIONS-CACHE", 0, 0, false);
    //declareFunction(myName, "initialize_sufficient_quoted_functions_cache", "INITIALIZE-SUFFICIENT-QUOTED-FUNCTIONS-CACHE", 0, 0, false);
    //declareFunction(myName, "sufficient_function_cache_mal_assertions", "SUFFICIENT-FUNCTION-CACHE-MAL-ASSERTIONS", 0, 1, false);
    //declareFunction(myName, "sufficient_function_cache_mal_assertions_coerce", "SUFFICIENT-FUNCTION-CACHE-MAL-ASSERTIONS-COERCE", 0, 1, false);
    //declareFunction(myName, "assertion_referenced_in_sufficient_function_cacheP", "ASSERTION-REFERENCED-IN-SUFFICIENT-FUNCTION-CACHE?", 2, 0, false);
    //declareFunction(myName, "diagnose_sufficient_functions_cache", "DIAGNOSE-SUFFICIENT-FUNCTIONS-CACHE", 1, 2, false);
    //declareFunction(myName, "kbi_sfc_status", "KBI-SFC-STATUS", 0, 1, false);
    //declareFunction(myName, "sfc_cleanup", "SFC-CLEANUP", 1, 0, false);
    //declareFunction(myName, "sfc_mal_assertions", "SFC-MAL-ASSERTIONS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_at_defns_file() {
    $use_new_defns_functionsP$ = defvar("*USE-NEW-DEFNS-FUNCTIONS?*", T);
    $old_defns_admitP_meters$ = defparameter("*OLD-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $old_defns_rejectP_meters$ = defparameter("*OLD-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $defining_defns_status_meters$ = defparameter("*DEFINING-DEFNS-STATUS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $sufficient_defns_admitP_meters$ = defparameter("*SUFFICIENT-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $necessary_defns_rejectP_meters$ = defparameter("*NECESSARY-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $rejected_by_necessary_defns_meters$ = defparameter("*REJECTED-BY-NECESSARY-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $old_quoted_defns_admitP_meters$ = defparameter("*OLD-QUOTED-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $old_quoted_defns_rejectP_meters$ = defparameter("*OLD-QUOTED-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $quoted_defining_defns_status_meters$ = defparameter("*QUOTED-DEFINING-DEFNS-STATUS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $quoted_sufficient_defns_admitP_meters$ = defparameter("*QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $quoted_necessary_defns_rejectP_meters$ = defparameter("*QUOTED-NECESSARY-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $rejected_by_quoted_necessary_defns_meters$ = defparameter("*REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $defn_admits_intP_meters$ = defparameter("*DEFN-ADMITS-INT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $quoted_defn_admits_intP_meters$ = defparameter("*QUOTED-DEFN-ADMITS-INT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $defn_cyc_evaluate_caching_state$ = deflexical("*DEFN-CYC-EVALUATE-CACHING-STATE*", NIL);
    $cat_defns_failing$ = defparameter("*CAT-DEFNS-FAILING*", NIL);
    $cache_suf_defn_meters$ = defparameter("*CACHE-SUF-DEFN-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $uncache_suf_defn_meters$ = defparameter("*UNCACHE-SUF-DEFN-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $old_handle_added_genl_for_suf_defns_meters$ = defparameter("*OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $old_handle_removed_genl_for_suf_defns_meters$ = defparameter("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $cache_suf_quoted_defn_meters$ = defparameter("*CACHE-SUF-QUOTED-DEFN-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $uncache_suf_quoted_defn_meters$ = defparameter("*UNCACHE-SUF-QUOTED-DEFN-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $old_handle_added_genl_for_suf_quoted_defns_meters$ = defparameter("*OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $old_handle_removed_genl_for_suf_quoted_defns_meters$ = defparameter("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $cache_suf_function_meters$ = defparameter("*CACHE-SUF-FUNCTION-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $uncache_suf_function_meters$ = defparameter("*UNCACHE-SUF-FUNCTION-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $handle_added_genl_for_suf_functions_meters$ = defparameter("*HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $handle_removed_genl_for_suf_functions_meters$ = defparameter("*HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $suf_function_cache_mal_keys$ = defparameter("*SUF-FUNCTION-CACHE-MAL-KEYS*", NIL);
    $suf_function_cache_key_wXo_value$ = defparameter("*SUF-FUNCTION-CACHE-KEY-W/O-VALUE*", NIL);
    $suf_function_cache_key_wXmal_value$ = defparameter("*SUF-FUNCTION-CACHE-KEY-W/MAL-VALUE*", NIL);
    $suf_function_cache_key_wXstale_value$ = defparameter("*SUF-FUNCTION-CACHE-KEY-W/STALE-VALUE*", NIL);
    $suf_function_cache_keys_wXo_inerited_value$ = defparameter("*SUF-FUNCTION-CACHE-KEYS-W/O-INERITED-VALUE*", NIL);
    $suf_function_cache_awol_direct_assertions$ = defparameter("*SUF-FUNCTION-CACHE-AWOL-DIRECT-ASSERTIONS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_at_defns_file() {
    // CVS_ID("Id: at-defns.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    {
      SubLObject item_var = $sym3$_OLD_DEFNS_ADMIT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym3$_OLD_DEFNS_ADMIT__METERS_, $str4$metering_cache_for_calls_to_defn_);
    reset_old_defns_admitP_meters();
    Hashtables.sethash($kw13$RESET, $old_defns_admitP_meters$.getDynamicValue(), $sym14$RESET_OLD_DEFNS_ADMIT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym12$OLD_DEFNS_ADMIT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym15$_OLD_DEFNS_REJECT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym15$_OLD_DEFNS_REJECT__METERS_, $str16$metering_cache_for_calls_to_defn_);
    reset_old_defns_rejectP_meters();
    Hashtables.sethash($kw13$RESET, $old_defns_rejectP_meters$.getDynamicValue(), $sym18$RESET_OLD_DEFNS_REJECT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym17$OLD_DEFNS_REJECT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym19$_DEFINING_DEFNS_STATUS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym19$_DEFINING_DEFNS_STATUS_METERS_, $str20$metering_cache_for_calls_to_defn_);
    reset_defining_defns_status_meters();
    Hashtables.sethash($kw13$RESET, $defining_defns_status_meters$.getDynamicValue(), $sym22$RESET_DEFINING_DEFNS_STATUS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym21$DEFINING_DEFNS_STATUS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($defining_defns_status_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym29$_SUFFICIENT_DEFNS_ADMIT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym29$_SUFFICIENT_DEFNS_ADMIT__METERS_, $str30$metering_cache_for_calls_to_defn_);
    reset_sufficient_defns_admitP_meters();
    Hashtables.sethash($kw13$RESET, $sufficient_defns_admitP_meters$.getDynamicValue(), $sym32$RESET_SUFFICIENT_DEFNS_ADMIT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym31$SUFFICIENT_DEFNS_ADMIT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($sufficient_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym35$_NECESSARY_DEFNS_REJECT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym35$_NECESSARY_DEFNS_REJECT__METERS_, $str36$metering_cache_for_calls_to_defn_);
    reset_necessary_defns_rejectP_meters();
    Hashtables.sethash($kw13$RESET, $necessary_defns_rejectP_meters$.getDynamicValue(), $sym38$RESET_NECESSARY_DEFNS_REJECT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym37$NECESSARY_DEFNS_REJECT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($necessary_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym55$_REJECTED_BY_NECESSARY_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym55$_REJECTED_BY_NECESSARY_DEFNS_METERS_, $str56$metering_cache_for_calls_to_defn_);
    reset_rejected_by_necessary_defns_meters();
    Hashtables.sethash($kw13$RESET, $rejected_by_necessary_defns_meters$.getDynamicValue(), $sym58$RESET_REJECTED_BY_NECESSARY_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym57$REJECTED_BY_NECESSARY_DEFNS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($rejected_by_necessary_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym62$_OLD_QUOTED_DEFNS_ADMIT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym62$_OLD_QUOTED_DEFNS_ADMIT__METERS_, $str63$metering_cache_for_calls_to_defn_);
    reset_old_quoted_defns_admitP_meters();
    Hashtables.sethash($kw13$RESET, $old_quoted_defns_admitP_meters$.getDynamicValue(), $sym65$RESET_OLD_QUOTED_DEFNS_ADMIT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym64$OLD_QUOTED_DEFNS_ADMIT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym66$_OLD_QUOTED_DEFNS_REJECT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym66$_OLD_QUOTED_DEFNS_REJECT__METERS_, $str67$metering_cache_for_calls_to_defn_);
    reset_old_quoted_defns_rejectP_meters();
    Hashtables.sethash($kw13$RESET, $old_quoted_defns_rejectP_meters$.getDynamicValue(), $sym69$RESET_OLD_QUOTED_DEFNS_REJECT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym68$OLD_QUOTED_DEFNS_REJECT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym70$_QUOTED_DEFINING_DEFNS_STATUS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym70$_QUOTED_DEFINING_DEFNS_STATUS_METERS_, $str71$metering_cache_for_calls_to_defn_);
    reset_quoted_defining_defns_status_meters();
    Hashtables.sethash($kw13$RESET, $quoted_defining_defns_status_meters$.getDynamicValue(), $sym73$RESET_QUOTED_DEFINING_DEFNS_STATUS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym72$QUOTED_DEFINING_DEFNS_STATUS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_defining_defns_status_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym75$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym75$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_, $str76$metering_cache_for_calls_to_defn_);
    reset_quoted_sufficient_defns_admitP_meters();
    Hashtables.sethash($kw13$RESET, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(), $sym78$RESET_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym77$QUOTED_SUFFICIENT_DEFNS_ADMIT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_sufficient_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym79$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym79$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_, $str80$metering_cache_for_calls_to_defn_);
    reset_quoted_necessary_defns_rejectP_meters();
    Hashtables.sethash($kw13$RESET, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(), $sym82$RESET_QUOTED_NECESSARY_DEFNS_REJECT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym81$QUOTED_NECESSARY_DEFNS_REJECT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_necessary_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym84$_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym84$_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS_, $str85$metering_cache_for_calls_to_defn_);
    reset_rejected_by_quoted_necessary_defns_meters();
    Hashtables.sethash($kw13$RESET, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(), $sym87$RESET_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym86$REJECTED_BY_QUOTED_NECESSARY_DEFNS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($rejected_by_quoted_necessary_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym91$_DEFN_ADMITS_INT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym91$_DEFN_ADMITS_INT__METERS_, $str92$metering_cache_for_calls_to_defn_);
    reset_defn_admits_intP_meters();
    Hashtables.sethash($kw13$RESET, $defn_admits_intP_meters$.getDynamicValue(), $sym95$RESET_DEFN_ADMITS_INT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym94$DEFN_ADMITS_INT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($defn_admits_intP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym99$_QUOTED_DEFN_ADMITS_INT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym99$_QUOTED_DEFN_ADMITS_INT__METERS_, $str100$metering_cache_for_calls_to_defn_);
    reset_quoted_defn_admits_intP_meters();
    Hashtables.sethash($kw13$RESET, $quoted_defn_admits_intP_meters$.getDynamicValue(), $sym102$RESET_QUOTED_DEFN_ADMITS_INT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym101$QUOTED_DEFN_ADMITS_INT_ == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_defn_admits_intP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    memoization_state.note_globally_cached_function($sym103$DEFN_CYC_EVALUATE);
    memoization_state.note_memoized_function($sym113$QUIET_HAS_TYPE_MEMOIZED_);
    utilities_macros.register_kb_function($sym154$ADD_SUF_DEFN);
    utilities_macros.register_kb_function($sym155$ADD_IFF_DEFN);
    utilities_macros.register_kb_function($sym160$OLD_ADD_SUF_DEFN);
    utilities_macros.register_kb_function($sym161$REMOVE_SUF_DEFN);
    utilities_macros.register_kb_function($sym162$REMOVE_IFF_DEFN);
    utilities_macros.register_kb_function($sym163$OLD_REMOVE_SUF_DEFN);
    {
      SubLObject item_var = $sym164$_CACHE_SUF_DEFN_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym164$_CACHE_SUF_DEFN_METERS_, $str165$metering_cache_for_calls_to_defn_);
    reset_cache_suf_defn_meters();
    Hashtables.sethash($kw13$RESET, $cache_suf_defn_meters$.getDynamicValue(), $sym168$RESET_CACHE_SUF_DEFN_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym167$CACHE_SUF_DEFN == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($cache_suf_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym169$_UNCACHE_SUF_DEFN_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym169$_UNCACHE_SUF_DEFN_METERS_, $str170$metering_cache_for_calls_to_defn_);
    reset_uncache_suf_defn_meters();
    Hashtables.sethash($kw13$RESET, $uncache_suf_defn_meters$.getDynamicValue(), $sym172$RESET_UNCACHE_SUF_DEFN_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym171$UNCACHE_SUF_DEFN == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($uncache_suf_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym175$_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym175$_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_, $str176$metering_cache_for_calls_to_defn_);
    reset_old_handle_added_genl_for_suf_defns_meters();
    Hashtables.sethash($kw13$RESET, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), $sym179$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym178$OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym180$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym180$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_, $str181$metering_cache_for_calls_to_defn_);
    reset_old_handle_removed_genl_for_suf_defns_meters();
    Hashtables.sethash($kw13$RESET, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), $sym183$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym182$OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    utilities_macros.register_kb_function($sym193$ADD_SUF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym194$ADD_IFF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym196$OLD_ADD_SUF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym197$REMOVE_SUF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym198$REMOVE_IFF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym199$OLD_REMOVE_SUF_QUOTED_DEFN);
    {
      SubLObject item_var = $sym200$_CACHE_SUF_QUOTED_DEFN_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym200$_CACHE_SUF_QUOTED_DEFN_METERS_, $str201$metering_cache_for_calls_to_defn_);
    reset_cache_suf_quoted_defn_meters();
    Hashtables.sethash($kw13$RESET, $cache_suf_quoted_defn_meters$.getDynamicValue(), $sym203$RESET_CACHE_SUF_QUOTED_DEFN_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym202$CACHE_SUF_QUOTED_DEFN == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($cache_suf_quoted_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym204$_UNCACHE_SUF_QUOTED_DEFN_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym204$_UNCACHE_SUF_QUOTED_DEFN_METERS_, $str205$metering_cache_for_calls_to_defn_);
    reset_uncache_suf_quoted_defn_meters();
    Hashtables.sethash($kw13$RESET, $uncache_suf_quoted_defn_meters$.getDynamicValue(), $sym207$RESET_UNCACHE_SUF_QUOTED_DEFN_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym206$UNCACHE_SUF_QUOTED_DEFN == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($uncache_suf_quoted_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym211$_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym211$_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_, $str212$metering_cache_for_calls_to_defn_);
    reset_old_handle_added_genl_for_suf_quoted_defns_meters();
    Hashtables.sethash($kw13$RESET, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), $sym214$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym213$OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym215$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym215$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_, $str216$metering_cache_for_calls_to_defn_);
    reset_old_handle_removed_genl_for_suf_quoted_defns_meters();
    Hashtables.sethash($kw13$RESET, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), $sym218$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym217$OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    utilities_macros.register_kb_function($sym226$ADD_SUF_FUNCTION);
    utilities_macros.register_kb_function($sym227$REMOVE_SUF_FUNCTION);
    utilities_macros.register_kb_function($sym228$ADD_SUF_QUOTED_FUNCTION);
    utilities_macros.register_kb_function($sym229$REMOVE_SUF_QUOTED_FUNCTION);
    utilities_macros.register_kb_function($sym234$ADD_SUF_FUNCTION_INT);
    utilities_macros.register_kb_function($sym235$REMOVE_SUF_FUNCTION_INT);
    {
      SubLObject item_var = $sym236$_CACHE_SUF_FUNCTION_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym236$_CACHE_SUF_FUNCTION_METERS_, $str237$metering_cache_for_calls_to_defn_);
    reset_cache_suf_function_meters();
    Hashtables.sethash($kw13$RESET, $cache_suf_function_meters$.getDynamicValue(), $sym240$RESET_CACHE_SUF_FUNCTION_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym239$CACHE_SUF_FUNCTION == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($cache_suf_function_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym241$_UNCACHE_SUF_FUNCTION_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym241$_UNCACHE_SUF_FUNCTION_METERS_, $str242$metering_cache_for_calls_to_defn_);
    reset_uncache_suf_function_meters();
    Hashtables.sethash($kw13$RESET, $uncache_suf_function_meters$.getDynamicValue(), $sym244$RESET_UNCACHE_SUF_FUNCTION_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym243$UNCACHE_SUF_FUNCTION == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($uncache_suf_function_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym251$_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym251$_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS_, $str252$metering_cache_for_calls_to_defn_);
    reset_handle_added_genl_for_suf_functions_meters();
    Hashtables.sethash($kw13$RESET, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(), $sym254$RESET_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym253$HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($handle_added_genl_for_suf_functions_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym256$_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym256$_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS_, $str257$metering_cache_for_calls_to_defn_);
    reset_handle_removed_genl_for_suf_functions_meters();
    Hashtables.sethash($kw13$RESET, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(), $sym259$RESET_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym258$HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS == Hashtables.gethash($kw11$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($handle_removed_genl_for_suf_functions_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$___remove_sufficent_defn__a__a_ = makeString("~%(remove-sufficent-defn ~a ~a)");
  public static final SubLSymbol $kw1$ADMITTED = makeKeyword("ADMITTED");
  public static final SubLSymbol $kw2$REJECTED = makeKeyword("REJECTED");
  public static final SubLSymbol $sym3$_OLD_DEFNS_ADMIT__METERS_ = makeSymbol("*OLD-DEFNS-ADMIT?-METERS*");
  public static final SubLString $str4$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-DEFNS-ADMIT?");
  public static final SubLSymbol $kw5$CALLS = makeKeyword("CALLS");
  public static final SubLSymbol $kw6$TIMES = makeKeyword("TIMES");
  public static final SubLSymbol $kw7$RESULTS = makeKeyword("RESULTS");
  public static final SubLSymbol $kw8$ARGS = makeKeyword("ARGS");
  public static final SubLSymbol $kw9$ARG_LIST = makeKeyword("ARG-LIST");
  public static final SubLList $list10 = list(makeSymbol("COLLECTION"), makeSymbol("TERM"), makeSymbol("MT"));
  public static final SubLSymbol $kw11$FUNCTION = makeKeyword("FUNCTION");
  public static final SubLSymbol $sym12$OLD_DEFNS_ADMIT_ = makeSymbol("OLD-DEFNS-ADMIT?");
  public static final SubLSymbol $kw13$RESET = makeKeyword("RESET");
  public static final SubLSymbol $sym14$RESET_OLD_DEFNS_ADMIT__METERS = makeSymbol("RESET-OLD-DEFNS-ADMIT?-METERS");
  public static final SubLSymbol $sym15$_OLD_DEFNS_REJECT__METERS_ = makeSymbol("*OLD-DEFNS-REJECT?-METERS*");
  public static final SubLString $str16$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-DEFNS-REJECT?");
  public static final SubLSymbol $sym17$OLD_DEFNS_REJECT_ = makeSymbol("OLD-DEFNS-REJECT?");
  public static final SubLSymbol $sym18$RESET_OLD_DEFNS_REJECT__METERS = makeSymbol("RESET-OLD-DEFNS-REJECT?-METERS");
  public static final SubLSymbol $sym19$_DEFINING_DEFNS_STATUS_METERS_ = makeSymbol("*DEFINING-DEFNS-STATUS-METERS*");
  public static final SubLString $str20$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function DEFINING-DEFNS-STATUS");
  public static final SubLSymbol $sym21$DEFINING_DEFNS_STATUS = makeSymbol("DEFINING-DEFNS-STATUS");
  public static final SubLSymbol $sym22$RESET_DEFINING_DEFNS_STATUS_METERS = makeSymbol("RESET-DEFINING-DEFNS-STATUS-METERS");
  public static final SubLObject $const23$defnIff = constant_handles.reader_make_constant_shell(makeString("defnIff"));
  public static final SubLSymbol $kw24$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw25$VIA_GENL_PRED = makeKeyword("VIA-GENL-PRED");
  public static final SubLSymbol $kw26$AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");
  public static final SubLSymbol $kw27$MAL_ARG_WRT_QUOTED_IFF_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
  public static final SubLSymbol $kw28$MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");
  public static final SubLSymbol $sym29$_SUFFICIENT_DEFNS_ADMIT__METERS_ = makeSymbol("*SUFFICIENT-DEFNS-ADMIT?-METERS*");
  public static final SubLString $str30$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function SUFFICIENT-DEFNS-ADMIT?");
  public static final SubLSymbol $sym31$SUFFICIENT_DEFNS_ADMIT_ = makeSymbol("SUFFICIENT-DEFNS-ADMIT?");
  public static final SubLSymbol $sym32$RESET_SUFFICIENT_DEFNS_ADMIT__METERS = makeSymbol("RESET-SUFFICIENT-DEFNS-ADMIT?-METERS");
  public static final SubLSymbol $kw33$MAL_ARG_WRT_QUOTED_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
  public static final SubLSymbol $kw34$MAL_ARG_WRT_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
  public static final SubLSymbol $sym35$_NECESSARY_DEFNS_REJECT__METERS_ = makeSymbol("*NECESSARY-DEFNS-REJECT?-METERS*");
  public static final SubLString $str36$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NECESSARY-DEFNS-REJECT?");
  public static final SubLSymbol $sym37$NECESSARY_DEFNS_REJECT_ = makeSymbol("NECESSARY-DEFNS-REJECT?");
  public static final SubLSymbol $sym38$RESET_NECESSARY_DEFNS_REJECT__METERS = makeSymbol("RESET-NECESSARY-DEFNS-REJECT?-METERS");
  public static final SubLSymbol $kw39$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw40$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw41$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym42$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw43$ERROR = makeKeyword("ERROR");
  public static final SubLString $str44$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym45$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw46$CERROR = makeKeyword("CERROR");
  public static final SubLString $str47$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw48$WARN = makeKeyword("WARN");
  public static final SubLString $str49$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const50$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLList $list51 = list(constant_handles.reader_make_constant_shell(makeString("defnIff")), constant_handles.reader_make_constant_shell(makeString("defnNecessary")));
  public static final SubLString $str52$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str53$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw54$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym55$_REJECTED_BY_NECESSARY_DEFNS_METERS_ = makeSymbol("*REJECTED-BY-NECESSARY-DEFNS-METERS*");
  public static final SubLString $str56$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function REJECTED-BY-NECESSARY-DEFNS");
  public static final SubLSymbol $sym57$REJECTED_BY_NECESSARY_DEFNS = makeSymbol("REJECTED-BY-NECESSARY-DEFNS");
  public static final SubLSymbol $sym58$RESET_REJECTED_BY_NECESSARY_DEFNS_METERS = makeSymbol("RESET-REJECTED-BY-NECESSARY-DEFNS-METERS");
  public static final SubLObject $const59$defnNecessary = constant_handles.reader_make_constant_shell(makeString("defnNecessary"));
  public static final SubLSymbol $kw60$MAL_ARG_WRT_QUOTED_NEC_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
  public static final SubLSymbol $kw61$MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");
  public static final SubLSymbol $sym62$_OLD_QUOTED_DEFNS_ADMIT__METERS_ = makeSymbol("*OLD-QUOTED-DEFNS-ADMIT?-METERS*");
  public static final SubLString $str63$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-QUOTED-DEFNS-ADMIT?");
  public static final SubLSymbol $sym64$OLD_QUOTED_DEFNS_ADMIT_ = makeSymbol("OLD-QUOTED-DEFNS-ADMIT?");
  public static final SubLSymbol $sym65$RESET_OLD_QUOTED_DEFNS_ADMIT__METERS = makeSymbol("RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS");
  public static final SubLSymbol $sym66$_OLD_QUOTED_DEFNS_REJECT__METERS_ = makeSymbol("*OLD-QUOTED-DEFNS-REJECT?-METERS*");
  public static final SubLString $str67$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-QUOTED-DEFNS-REJECT?");
  public static final SubLSymbol $sym68$OLD_QUOTED_DEFNS_REJECT_ = makeSymbol("OLD-QUOTED-DEFNS-REJECT?");
  public static final SubLSymbol $sym69$RESET_OLD_QUOTED_DEFNS_REJECT__METERS = makeSymbol("RESET-OLD-QUOTED-DEFNS-REJECT?-METERS");
  public static final SubLSymbol $sym70$_QUOTED_DEFINING_DEFNS_STATUS_METERS_ = makeSymbol("*QUOTED-DEFINING-DEFNS-STATUS-METERS*");
  public static final SubLString $str71$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function QUOTED-DEFINING-DEFNS-STATUS");
  public static final SubLSymbol $sym72$QUOTED_DEFINING_DEFNS_STATUS = makeSymbol("QUOTED-DEFINING-DEFNS-STATUS");
  public static final SubLSymbol $sym73$RESET_QUOTED_DEFINING_DEFNS_STATUS_METERS = makeSymbol("RESET-QUOTED-DEFINING-DEFNS-STATUS-METERS");
  public static final SubLObject $const74$quotedDefnIff = constant_handles.reader_make_constant_shell(makeString("quotedDefnIff"));
  public static final SubLSymbol $sym75$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_ = makeSymbol("*QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS*");
  public static final SubLString $str76$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function QUOTED-SUFFICIENT-DEFNS-ADMIT?");
  public static final SubLSymbol $sym77$QUOTED_SUFFICIENT_DEFNS_ADMIT_ = makeSymbol("QUOTED-SUFFICIENT-DEFNS-ADMIT?");
  public static final SubLSymbol $sym78$RESET_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS = makeSymbol("RESET-QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS");
  public static final SubLSymbol $sym79$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_ = makeSymbol("*QUOTED-NECESSARY-DEFNS-REJECT?-METERS*");
  public static final SubLString $str80$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function QUOTED-NECESSARY-DEFNS-REJECT?");
  public static final SubLSymbol $sym81$QUOTED_NECESSARY_DEFNS_REJECT_ = makeSymbol("QUOTED-NECESSARY-DEFNS-REJECT?");
  public static final SubLSymbol $sym82$RESET_QUOTED_NECESSARY_DEFNS_REJECT__METERS = makeSymbol("RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS");
  public static final SubLList $list83 = list(constant_handles.reader_make_constant_shell(makeString("quotedDefnIff")), constant_handles.reader_make_constant_shell(makeString("quotedDefnNecessary")));
  public static final SubLSymbol $sym84$_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS_ = makeSymbol("*REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS*");
  public static final SubLString $str85$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function REJECTED-BY-QUOTED-NECESSARY-DEFNS");
  public static final SubLSymbol $sym86$REJECTED_BY_QUOTED_NECESSARY_DEFNS = makeSymbol("REJECTED-BY-QUOTED-NECESSARY-DEFNS");
  public static final SubLSymbol $sym87$RESET_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS = makeSymbol("RESET-REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS");
  public static final SubLObject $const88$quotedDefnNecessary = constant_handles.reader_make_constant_shell(makeString("quotedDefnNecessary"));
  public static final SubLString $str89$defn_stack_consistency_error___Ex = makeString("defn-stack consistency error.  Expected ~s to be on the top of the stack, but instead got ~s.");
  public static final SubLString $str90$recursive_call_of_defn__a_with_ar = makeString("recursive call of defn ~a with argument ~a");
  public static final SubLSymbol $sym91$_DEFN_ADMITS_INT__METERS_ = makeSymbol("*DEFN-ADMITS-INT?-METERS*");
  public static final SubLString $str92$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function DEFN-ADMITS-INT?");
  public static final SubLList $list93 = list(makeSymbol("DEFN"), makeSymbol("TERM"), makeSymbol("COLLECTION"));
  public static final SubLSymbol $sym94$DEFN_ADMITS_INT_ = makeSymbol("DEFN-ADMITS-INT?");
  public static final SubLSymbol $sym95$RESET_DEFN_ADMITS_INT__METERS = makeSymbol("RESET-DEFN-ADMITS-INT?-METERS");
  public static final SubLString $str96$__defn_test__term__s__defn__s_of_ = makeString("~%defn test: term ~s; defn ~s of collection ~s: ~s");
  public static final SubLString $str97$__defn_test__term__s__defn__s_of_ = makeString("~%defn test: term ~s; defn ~s of collection ~s (via ~s): ~s");
  public static final SubLString $str98$recursive_call_of_quoted_defn__a_ = makeString("recursive call of quoted defn ~a with argument ~a");
  public static final SubLSymbol $sym99$_QUOTED_DEFN_ADMITS_INT__METERS_ = makeSymbol("*QUOTED-DEFN-ADMITS-INT?-METERS*");
  public static final SubLString $str100$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function QUOTED-DEFN-ADMITS-INT?");
  public static final SubLSymbol $sym101$QUOTED_DEFN_ADMITS_INT_ = makeSymbol("QUOTED-DEFN-ADMITS-INT?");
  public static final SubLSymbol $sym102$RESET_QUOTED_DEFN_ADMITS_INT__METERS = makeSymbol("RESET-QUOTED-DEFN-ADMITS-INT?-METERS");
  public static final SubLSymbol $sym103$DEFN_CYC_EVALUATE = makeSymbol("DEFN-CYC-EVALUATE");
  public static final SubLSymbol $sym104$_DEFN_CYC_EVALUATE_CACHING_STATE_ = makeSymbol("*DEFN-CYC-EVALUATE-CACHING-STATE*");
  public static final SubLInteger $int105$24 = makeInteger(24);
  public static final SubLSymbol $kw106$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str107$_s_has_invalid_defn___s = makeString("~s has invalid defn: ~s");
  public static final SubLString $str108$invalid_defn___s = makeString("invalid defn: ~s");
  public static final SubLString $str109$_s_has_non_viable_defn___s = makeString("~s has non-viable defn: ~s");
  public static final SubLString $str110$non_viable_defn___s = makeString("non-viable defn: ~s");
  public static final SubLSymbol $sym111$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLList $list112 = cons(makeSymbol("COL"), makeSymbol("DEFN-ASSERTIONS"));
  public static final SubLSymbol $sym113$QUIET_HAS_TYPE_MEMOIZED_ = makeSymbol("QUIET-HAS-TYPE-MEMOIZED?");
  public static final SubLObject $const114$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLObject $const115$Function_Denotational = constant_handles.reader_make_constant_shell(makeString("Function-Denotational"));
  public static final SubLObject $const116$SpecsFn = constant_handles.reader_make_constant_shell(makeString("SpecsFn"));
  public static final SubLSymbol $sym117$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const118$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw119$ISA = makeKeyword("ISA");
  public static final SubLObject $const120$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw121$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $kw122$DEFN = makeKeyword("DEFN");
  public static final SubLSymbol $kw123$DISJOINTWITH = makeKeyword("DISJOINTWITH");
  public static final SubLObject $const124$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLInteger $int125$64 = makeInteger(64);
  public static final SubLObject $const126$defnSufficient = constant_handles.reader_make_constant_shell(makeString("defnSufficient"));
  public static final SubLSymbol $sym127$COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1 = makeSymbol("COLLECTIONS-ADMITTING-TERM-VIA-DEFNS-1");
  public static final SubLSymbol $sym128$GATHER_COLLECTIONS_ADMITTING_VIA_DEFNS = makeSymbol("GATHER-COLLECTIONS-ADMITTING-VIA-DEFNS");
  public static final SubLString $str129$__warn__ = makeString("~%warn: ");
  public static final SubLSymbol $sym130$WARN = makeSymbol("WARN");
  public static final SubLString $str131$____defn_module_meters_ = makeString("~%~%defn module meters ");
  public static final SubLInteger $int132$27 = makeInteger(27);
  public static final SubLString $str133$_ = makeString("*");
  public static final SubLString $str134$_____a__ = makeString("~%  ~a :");
  public static final SubLString $str135$function = makeString("function");
  public static final SubLString $str136$___calls___ = makeString(" [ calls ] ");
  public static final SubLString $str137$___total_time___ = makeString(" [ total time ] ");
  public static final SubLString $str138$____avg_time____ = makeString(" [  avg time  ] ");
  public static final SubLString $str139$_s = makeString("~s");
  public static final SubLSymbol $sym140$_ = makeSymbol("+");
  public static final SubLString $str141$____a___ = makeString("   ~a   ");
  public static final SubLString $str142$_a = makeString("~a");
  public static final SubLString $str143$_ = makeString(" ");
  public static final SubLInteger $int144$46 = makeInteger(46);
  public static final SubLString $str145$_s_ = makeString("~s ");
  public static final SubLString $str146$_____a = makeString("~%~%~a");
  public static final SubLInteger $int147$37 = makeInteger(37);
  public static final SubLString $str148$______call__ = makeString("~%  [ call ]");
  public static final SubLString $str149$____a___ = makeString(" [ ~a ] ");
  public static final SubLString $str150$____result____ = makeString(" [  result  ] ");
  public static final SubLString $str151$_____time_____ = makeString(" [   time   ] ");
  public static final SubLString $str152$____a = makeString("~% ~a");
  public static final SubLString $str153$total = makeString("total");
  public static final SubLSymbol $sym154$ADD_SUF_DEFN = makeSymbol("ADD-SUF-DEFN");
  public static final SubLSymbol $sym155$ADD_IFF_DEFN = makeSymbol("ADD-IFF-DEFN");
  public static final SubLSymbol $sym156$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLString $str157$skip_defn_op = makeString("skip defn op");
  public static final SubLString $str158$_s_is_not_a_collection_in__s = makeString("~s is not a collection in ~s");
  public static final SubLString $str159$_s_is_not_a_symbol = makeString("~s is not a symbol");
  public static final SubLSymbol $sym160$OLD_ADD_SUF_DEFN = makeSymbol("OLD-ADD-SUF-DEFN");
  public static final SubLSymbol $sym161$REMOVE_SUF_DEFN = makeSymbol("REMOVE-SUF-DEFN");
  public static final SubLSymbol $sym162$REMOVE_IFF_DEFN = makeSymbol("REMOVE-IFF-DEFN");
  public static final SubLSymbol $sym163$OLD_REMOVE_SUF_DEFN = makeSymbol("OLD-REMOVE-SUF-DEFN");
  public static final SubLSymbol $sym164$_CACHE_SUF_DEFN_METERS_ = makeSymbol("*CACHE-SUF-DEFN-METERS*");
  public static final SubLString $str165$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function CACHE-SUF-DEFN");
  public static final SubLList $list166 = list(makeSymbol("COL"), makeSymbol("ASSERTION"));
  public static final SubLSymbol $sym167$CACHE_SUF_DEFN = makeSymbol("CACHE-SUF-DEFN");
  public static final SubLSymbol $sym168$RESET_CACHE_SUF_DEFN_METERS = makeSymbol("RESET-CACHE-SUF-DEFN-METERS");
  public static final SubLSymbol $sym169$_UNCACHE_SUF_DEFN_METERS_ = makeSymbol("*UNCACHE-SUF-DEFN-METERS*");
  public static final SubLString $str170$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function UNCACHE-SUF-DEFN");
  public static final SubLSymbol $sym171$UNCACHE_SUF_DEFN = makeSymbol("UNCACHE-SUF-DEFN");
  public static final SubLSymbol $sym172$RESET_UNCACHE_SUF_DEFN_METERS = makeSymbol("RESET-UNCACHE-SUF-DEFN-METERS");
  public static final SubLString $str173$___add_sufficent_defn__a__a_ = makeString("~%(add-sufficent-defn ~a ~a)");
  public static final SubLString $str174$removed_sufficient_defn_not_found = makeString("removed sufficient defn not found in cache: ~s");
  public static final SubLSymbol $sym175$_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_ = makeSymbol("*OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*");
  public static final SubLString $str176$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");
  public static final SubLList $list177 = list(makeSymbol("SPEC"), makeSymbol("GENL"));
  public static final SubLSymbol $sym178$OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS = makeSymbol("OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");
  public static final SubLSymbol $sym179$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS");
  public static final SubLSymbol $sym180$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_ = makeSymbol("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*");
  public static final SubLString $str181$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");
  public static final SubLSymbol $sym182$OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS = makeSymbol("OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");
  public static final SubLSymbol $sym183$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS");
  public static final SubLSymbol $sym184$ADD_SUF_DEFN_ASSERTION = makeSymbol("ADD-SUF-DEFN-ASSERTION");
  public static final SubLSymbol $sym185$REMOVE_SUF_DEFN_ASSERTION = makeSymbol("REMOVE-SUF-DEFN-ASSERTION");
  public static final SubLSymbol $sym186$MERGE_SUF_DEFN_ASSERTIONS = makeSymbol("MERGE-SUF-DEFN-ASSERTIONS");
  public static final SubLSymbol $sym187$REMOVE_SUF_DEFN_ASSERTIONS = makeSymbol("REMOVE-SUF-DEFN-ASSERTIONS");
  public static final SubLSymbol $sym188$VALID_ASSERTION = makeSymbol("VALID-ASSERTION");
  public static final SubLSymbol $sym189$_ = makeSymbol(">");
  public static final SubLSymbol $sym190$ARG1_SPEC_CARDINALITY = makeSymbol("ARG1-SPEC-CARDINALITY");
  public static final SubLList $list191 = list(constant_handles.reader_make_constant_shell(makeString("defnIff")), constant_handles.reader_make_constant_shell(makeString("defnSufficient")));
  public static final SubLString $str192$Initializing_sufficient_defns_cac = makeString("Initializing sufficient defns cache...");
  public static final SubLSymbol $sym193$ADD_SUF_QUOTED_DEFN = makeSymbol("ADD-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym194$ADD_IFF_QUOTED_DEFN = makeSymbol("ADD-IFF-QUOTED-DEFN");
  public static final SubLString $str195$skip_quoted_defn_op = makeString("skip quoted defn op");
  public static final SubLSymbol $sym196$OLD_ADD_SUF_QUOTED_DEFN = makeSymbol("OLD-ADD-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym197$REMOVE_SUF_QUOTED_DEFN = makeSymbol("REMOVE-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym198$REMOVE_IFF_QUOTED_DEFN = makeSymbol("REMOVE-IFF-QUOTED-DEFN");
  public static final SubLSymbol $sym199$OLD_REMOVE_SUF_QUOTED_DEFN = makeSymbol("OLD-REMOVE-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym200$_CACHE_SUF_QUOTED_DEFN_METERS_ = makeSymbol("*CACHE-SUF-QUOTED-DEFN-METERS*");
  public static final SubLString $str201$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function CACHE-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym202$CACHE_SUF_QUOTED_DEFN = makeSymbol("CACHE-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym203$RESET_CACHE_SUF_QUOTED_DEFN_METERS = makeSymbol("RESET-CACHE-SUF-QUOTED-DEFN-METERS");
  public static final SubLSymbol $sym204$_UNCACHE_SUF_QUOTED_DEFN_METERS_ = makeSymbol("*UNCACHE-SUF-QUOTED-DEFN-METERS*");
  public static final SubLString $str205$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function UNCACHE-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym206$UNCACHE_SUF_QUOTED_DEFN = makeSymbol("UNCACHE-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym207$RESET_UNCACHE_SUF_QUOTED_DEFN_METERS = makeSymbol("RESET-UNCACHE-SUF-QUOTED-DEFN-METERS");
  public static final SubLString $str208$___add_sufficent_quoted_defn__a__ = makeString("~%(add-sufficent-quoted-defn ~a ~a)");
  public static final SubLString $str209$removed_sufficient_quoted_defn_no = makeString("removed sufficient quoted defn not found in cache: ~s");
  public static final SubLString $str210$___remove_sufficent_quoted_defn__ = makeString("~%(remove-sufficent-quoted-defn ~a ~a)");
  public static final SubLSymbol $sym211$_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = makeSymbol("*OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
  public static final SubLString $str212$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym213$OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym214$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
  public static final SubLSymbol $sym215$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = makeSymbol("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
  public static final SubLString $str216$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym217$OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym218$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
  public static final SubLSymbol $sym219$ADD_SUF_QUOTED_DEFN_ASSERTION = makeSymbol("ADD-SUF-QUOTED-DEFN-ASSERTION");
  public static final SubLSymbol $sym220$REMOVE_SUF_QUOTED_DEFN_ASSERTION = makeSymbol("REMOVE-SUF-QUOTED-DEFN-ASSERTION");
  public static final SubLSymbol $sym221$MERGE_SUF_QUOTED_DEFN_ASSERTIONS = makeSymbol("MERGE-SUF-QUOTED-DEFN-ASSERTIONS");
  public static final SubLSymbol $sym222$REMOVE_SUF_QUOTED_DEFN_ASSERTIONS = makeSymbol("REMOVE-SUF-QUOTED-DEFN-ASSERTIONS");
  public static final SubLList $list223 = list(constant_handles.reader_make_constant_shell(makeString("quotedDefnIff")), constant_handles.reader_make_constant_shell(makeString("quotedDefnSufficient")));
  public static final SubLString $str224$Initializing_sufficient_quoted_de = makeString("Initializing sufficient quoted defns cache...");
  public static final SubLSymbol $kw225$QUOTED_ISA = makeKeyword("QUOTED-ISA");
  public static final SubLSymbol $sym226$ADD_SUF_FUNCTION = makeSymbol("ADD-SUF-FUNCTION");
  public static final SubLSymbol $sym227$REMOVE_SUF_FUNCTION = makeSymbol("REMOVE-SUF-FUNCTION");
  public static final SubLSymbol $sym228$ADD_SUF_QUOTED_FUNCTION = makeSymbol("ADD-SUF-QUOTED-FUNCTION");
  public static final SubLSymbol $sym229$REMOVE_SUF_QUOTED_FUNCTION = makeSymbol("REMOVE-SUF-QUOTED-FUNCTION");
  public static final SubLObject $const230$evaluationResultQuotedIsa = constant_handles.reader_make_constant_shell(makeString("evaluationResultQuotedIsa"));
  public static final SubLString $str231$oh_well___ = makeString("oh well...");
  public static final SubLString $str232$_s_is_not_a_evaluatable_functor_i = makeString("~s is not a evaluatable functor in ~s");
  public static final SubLString $str233$_s_is_not_a_functor_in__s = makeString("~s is not a functor in ~s");
  public static final SubLSymbol $sym234$ADD_SUF_FUNCTION_INT = makeSymbol("ADD-SUF-FUNCTION-INT");
  public static final SubLSymbol $sym235$REMOVE_SUF_FUNCTION_INT = makeSymbol("REMOVE-SUF-FUNCTION-INT");
  public static final SubLSymbol $sym236$_CACHE_SUF_FUNCTION_METERS_ = makeSymbol("*CACHE-SUF-FUNCTION-METERS*");
  public static final SubLString $str237$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function CACHE-SUF-FUNCTION");
  public static final SubLList $list238 = list(makeSymbol("COL"), makeSymbol("ASSERTION"), makeSymbol("TYPE"));
  public static final SubLSymbol $sym239$CACHE_SUF_FUNCTION = makeSymbol("CACHE-SUF-FUNCTION");
  public static final SubLSymbol $sym240$RESET_CACHE_SUF_FUNCTION_METERS = makeSymbol("RESET-CACHE-SUF-FUNCTION-METERS");
  public static final SubLSymbol $sym241$_UNCACHE_SUF_FUNCTION_METERS_ = makeSymbol("*UNCACHE-SUF-FUNCTION-METERS*");
  public static final SubLString $str242$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function UNCACHE-SUF-FUNCTION");
  public static final SubLSymbol $sym243$UNCACHE_SUF_FUNCTION = makeSymbol("UNCACHE-SUF-FUNCTION");
  public static final SubLSymbol $sym244$RESET_UNCACHE_SUF_FUNCTION_METERS = makeSymbol("RESET-UNCACHE-SUF-FUNCTION-METERS");
  public static final SubLString $str245$____a__a__a_ = makeString("~%(~a ~a ~a)");
  public static final SubLString $str246$add_sufficient_function = makeString("add-sufficient-function");
  public static final SubLString $str247$add_sufficient_quoted_function = makeString("add-sufficient-quoted-function");
  public static final SubLString $str248$removed_sufficient_function_not_f = makeString("removed sufficient function not found in cache: ~s");
  public static final SubLString $str249$remove_sufficient_function = makeString("remove-sufficient-function");
  public static final SubLString $str250$remove_sufficient_quoted_function = makeString("remove-sufficient-quoted-function");
  public static final SubLSymbol $sym251$_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS_ = makeSymbol("*HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS*");
  public static final SubLString $str252$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS");
  public static final SubLSymbol $sym253$HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS = makeSymbol("HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS");
  public static final SubLSymbol $sym254$RESET_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS = makeSymbol("RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS");
  public static final SubLList $list255 = list(makeKeyword("ISA"), makeKeyword("QUOTED-ISA"));
  public static final SubLSymbol $sym256$_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS_ = makeSymbol("*HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS*");
  public static final SubLString $str257$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS");
  public static final SubLSymbol $sym258$HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS = makeSymbol("HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS");
  public static final SubLSymbol $sym259$RESET_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS = makeSymbol("RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS");
  public static final SubLSymbol $sym260$ADD_SUF_FUNCTION_ASSERTION = makeSymbol("ADD-SUF-FUNCTION-ASSERTION");
  public static final SubLSymbol $sym261$ADD_SUF_QUOTED_FUNCTION_ASSERTION = makeSymbol("ADD-SUF-QUOTED-FUNCTION-ASSERTION");
  public static final SubLSymbol $sym262$REMOVE_SUF_FUNCTION_ASSERTION = makeSymbol("REMOVE-SUF-FUNCTION-ASSERTION");
  public static final SubLSymbol $sym263$REMOVE_SUF_QUOTED_FUNCTION_ASSERTION = makeSymbol("REMOVE-SUF-QUOTED-FUNCTION-ASSERTION");
  public static final SubLSymbol $sym264$MERGE_SUF_FUNCTION_ASSERTIONS = makeSymbol("MERGE-SUF-FUNCTION-ASSERTIONS");
  public static final SubLSymbol $sym265$MERGE_SUF_QUOTED_FUNCTION_ASSERTIONS = makeSymbol("MERGE-SUF-QUOTED-FUNCTION-ASSERTIONS");
  public static final SubLSymbol $sym266$REMOVE_SUF_FUNCTION_ASSERTIONS = makeSymbol("REMOVE-SUF-FUNCTION-ASSERTIONS");
  public static final SubLSymbol $sym267$REMOVE_SUF_QUOTED_FUNCTION_ASSERTIONS = makeSymbol("REMOVE-SUF-QUOTED-FUNCTION-ASSERTIONS");
  public static final SubLString $str268$___add_sufficent_function__a__a_ = makeString("~%(add-sufficent-function ~a ~a)");
  public static final SubLString $str269$remove_sufficent_function = makeString("remove-sufficent-function");
  public static final SubLSymbol $sym270$SUF_FUNCTION_SORT_PRED = makeSymbol("SUF-FUNCTION-SORT-PRED");
  public static final SubLSymbol $sym271$GAF_ARG2 = makeSymbol("GAF-ARG2");
  public static final SubLList $list272 = list(constant_handles.reader_make_constant_shell(makeString("resultIsa")));
  public static final SubLList $list273 = list(constant_handles.reader_make_constant_shell(makeString("evaluationResultQuotedIsa")), constant_handles.reader_make_constant_shell(makeString("resultQuotedIsa")));
  public static final SubLString $str274$Initializing_sufficient_functions = makeString("Initializing sufficient functions cache...");
  public static final SubLString $str275$Initializing_sufficient_quoted_fu = makeString("Initializing sufficient quoted functions cache...");
  public static final SubLString $str276$cdohash = makeString("cdohash");
  public static final SubLString $str277$stop = makeString("stop");
  public static final SubLSymbol $kw278$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLString $str279$diagnostics__sufficient_functions = makeString("diagnostics: sufficient-functions-cache");
  public static final SubLString $str280$___suf_function_cache_mal_keys___ = makeString("~%*suf-function-cache-mal-keys* : ~a");
  public static final SubLString $str281$___suf_function_cache_key_w_o_val = makeString("~%*suf-function-cache-key-w/o-value* : ~a");
  public static final SubLString $str282$___suf_function_cache_key_w_mal_v = makeString("~%*suf-function-cache-key-w/mal-value* : ~a");
  public static final SubLString $str283$___suf_function_cache_key_w_stale = makeString("~%*suf-function-cache-key-w/stale-value* : ~a");
  public static final SubLString $str284$___suf_function_cache_keys_w_o_in = makeString("~%*suf-function-cache-keys-w/o-inerited-value* : ~a");
  public static final SubLString $str285$___suf_function_cache_awol_direct = makeString("~%*suf-function-cache-awol-direct-assertions* : ~a");
  public static final SubLObject $const286$SkolemFunction = constant_handles.reader_make_constant_shell(makeString("SkolemFunction"));
  public static final SubLString $str287$mapping_skolems = makeString("mapping skolems");
  public static final SubLString $str288$_a_ = makeString("~a ");

  //// Initializers

  public void declareFunctions() {
    declare_at_defns_file();
  }

  public void initializeVariables() {
    init_at_defns_file();
  }

  public void runTopLevelForms() {
    setup_at_defns_file();
  }

}
