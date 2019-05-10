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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.at_defns;
import com.cyc.cycjava_1.cycl.at_macros;
import com.cyc.cycjava_1.cycl.at_routines;
import com.cyc.cycjava_1.cycl.at_utilities;
import com.cyc.cycjava_1.cycl.at_vars;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.wff_vars;

public  final class defns extends SubLTranslatedFile {

  //// Constructor

  private defns() {}
  public static final SubLFile me = new defns();
  public static final String myName = "com.cyc.cycjava_1.cycl.defns";

  //// Definitions

  @SubL(source = "cycl/defns.lisp", position = 4523) 
  private static SubLSymbol $has_suf_defn_cache$ = null;

  @SubL(source = "cycl/defns.lisp", position = 4726) 
  private static SubLSymbol $has_quoted_suf_defn_cache$ = null;

  @SubL(source = "cycl/defns.lisp", position = 4775) 
  public static final SubLObject suf_defn_count(SubLObject col, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != $has_suf_defn_cache$.getDynamicValue(thread))
            || (NIL != $has_quoted_suf_defn_cache$.getDynamicValue(thread)))))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10597");
      }
      if ((NIL != quotedP)) {
        return Hashtables.gethash(col, $has_quoted_suf_defn_cache$.getDynamicValue(thread), UNPROVIDED);
      } else {
        return Hashtables.gethash(col, $has_suf_defn_cache$.getDynamicValue(thread), UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 5065) 
  public static final SubLObject has_suf_defn_somewhereP(SubLObject col, SubLObject quotedP) {
    return list_utilities.sublisp_boolean(suf_defn_count(col, quotedP));
  }

  @SubL(source = "cycl/defns.lisp", position = 5800) 
  private static SubLSymbol $iff_defns$ = null;

  @SubL(source = "cycl/defns.lisp", position = 5834) 
  private static SubLSymbol $quoted_iff_defns$ = null;

  @SubL(source = "cycl/defns.lisp", position = 5874) 
  public static final SubLObject iff_defn(SubLObject col, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != $iff_defns$.getDynamicValue(thread))
            || (NIL != $quoted_iff_defns$.getDynamicValue(thread)))))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10600");
      }
      if ((NIL != quotedP)) {
        return Hashtables.gethash(col, $quoted_iff_defns$.getDynamicValue(thread), UNPROVIDED);
      } else {
        return Hashtables.gethash(col, $iff_defns$.getDynamicValue(thread), UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 6376) 
  private static SubLSymbol $suf_defns$ = null;

  @SubL(source = "cycl/defns.lisp", position = 6410) 
  private static SubLSymbol $quoted_suf_defns$ = null;

  @SubL(source = "cycl/defns.lisp", position = 6450) 
  public static final SubLObject suf_defns(SubLObject col, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != $suf_defns$.getDynamicValue(thread))
            || (NIL != $quoted_suf_defns$.getDynamicValue(thread)))))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10602");
      }
      if ((NIL != quotedP)) {
        return Hashtables.gethash(col, $quoted_suf_defns$.getDynamicValue(thread), UNPROVIDED);
      } else {
        return Hashtables.gethash(col, $suf_defns$.getDynamicValue(thread), UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 7315) 
  private static SubLSymbol $nec_defns$ = null;

  @SubL(source = "cycl/defns.lisp", position = 7349) 
  private static SubLSymbol $quoted_nec_defns$ = null;

  @SubL(source = "cycl/defns.lisp", position = 7389) 
  public static final SubLObject nec_defns(SubLObject col, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != $nec_defns$.getDynamicValue(thread))
            || (NIL != $quoted_nec_defns$.getDynamicValue(thread)))))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10604");
      }
      if ((NIL != quotedP)) {
        return Hashtables.gethash(col, $quoted_nec_defns$.getDynamicValue(thread), UNPROVIDED);
      } else {
        return Hashtables.gethash(col, $nec_defns$.getDynamicValue(thread), UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 7949) 
  private static SubLSymbol $defn_term$ = null;

  @SubL(source = "cycl/defns.lisp", position = 7983) 
  private static SubLSymbol $org_collection$ = null;

  @SubL(source = "cycl/defns.lisp", position = 8021) 
  private static SubLSymbol $failing_suf_defns$ = null;

  @SubL(source = "cycl/defns.lisp", position = 8062) 
  public static final SubLObject has_some_defnP(SubLObject col, SubLObject quotedP) {
    return makeBoolean(((NIL != iff_defn(col, quotedP))
          || (NIL != suf_defns(col, quotedP))
          || (NIL != nec_defns(col, quotedP))));
  }

  @SubL(source = "cycl/defns.lisp", position = 8204) 
  public static SubLSymbol $new_defns_admitP_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 8204) 
  public static final SubLObject reset_new_defns_admitP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_defns_admitP_meters$.getDynamicValue(thread), $list7);
      Hashtables.sethash($kw8$FUNCTION, $new_defns_admitP_meters$.getDynamicValue(thread), $sym9$NEW_DEFNS_ADMIT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 8204) 
  public static final SubLObject new_defns_admitP_metered(SubLObject col, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return defns_admitP_int(col, v_term, mt, NIL);
  }

  @SubL(source = "cycl/defns.lisp", position = 8204) 
  public static final SubLObject new_defns_admitP(SubLObject col, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = new_defns_admitP_metered(col, v_term, mt);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), Hashtables.gethash($kw5$ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return new_defns_admitP_metered(col, v_term, mt);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 8470) 
  public static final SubLObject defns_admitP_int(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED))) {
        col = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10336");
      }
      if ((NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP())) {
        if ((NIL != quotedP)) {
          if ((NIL != isa.quoted_isaP(v_term, col, mt, UNPROVIDED))) {
            return T;
          }
        } else {
          if ((NIL != isa.isaP(v_term, col, mt, UNPROVIDED))) {
            return T;
          }
        }
      }
      if ((!(((NIL != forts.fort_p(col))
            || (NIL != has_suf_defn_somewhereP(col, quotedP)))))) {
        return NIL;
      }
      {
        SubLObject admittedP = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
          SubLObject _prev_bind_2 = at_vars.$defn_col_history$.currentBinding(thread);
          SubLObject _prev_bind_3 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
          try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
              {
                SubLObject pcase_var = initial_check_defn_admit_status(col, v_term, mt, quotedP);
                if (pcase_var.eql($kw12$ADMITTED)) {
                  admittedP = T;
                } else if (pcase_var.eql($kw13$REJECTED)) {
                  admittedP = NIL;
                } else {
                  if ((NIL != defns_walk_admitP(col, v_term, mt, quotedP))) {
                    admittedP = T;
                  } else {
                    if (((NIL == quotedP)
                         && (NIL != cycl_grammar.fast_quote_term_p(v_term)))) {
                      {
                        SubLObject denoted_term = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31111");
                        if (((NIL != denoted_term)
                             && (NIL != at_defns.quoted_defns_admitP(col, denoted_term, mt)))) {
                          admittedP = T;
                        }
                      }
                    }
                  }
                }
              }
            } finally {
              {
                SubLObject _prev_bind_0_1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                  at_defns.clear_defn_space();
                } finally {
                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                }
              }
            }
          } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_2, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_1, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
          }
        }
        return admittedP;
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 9388) 
  public static SubLSymbol $new_defns_rejectP_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 9388) 
  public static final SubLObject reset_new_defns_rejectP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_defns_rejectP_meters$.getDynamicValue(thread), $list7);
      Hashtables.sethash($kw8$FUNCTION, $new_defns_rejectP_meters$.getDynamicValue(thread), $sym16$NEW_DEFNS_REJECT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 9388) 
  public static final SubLObject new_defns_rejectP_metered(SubLObject col, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return defns_rejectP_int(col, v_term, mt, NIL);
  }

  @SubL(source = "cycl/defns.lisp", position = 9388) 
  public static final SubLObject new_defns_rejectP(SubLObject col, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = new_defns_rejectP_metered(col, v_term, mt);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), Hashtables.gethash($kw5$ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return new_defns_rejectP_metered(col, v_term, mt);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 9504) 
  public static final SubLObject defns_rejectP_int(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED))) {
        col = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10337");
      }
      if ((NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP())) {
        if ((NIL != quotedP)) {
          if ((NIL != isa.quoted_isaP(v_term, col, mt, UNPROVIDED))) {
            return NIL;
          }
        } else {
          if ((NIL != isa.isaP(v_term, col, mt, UNPROVIDED))) {
            return NIL;
          }
        }
      }
      if ((NIL == forts.fort_p(col))) {
        return NIL;
      }
      {
        SubLObject rejectedP = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
          SubLObject _prev_bind_2 = at_vars.$defn_col_history$.currentBinding(thread);
          SubLObject _prev_bind_3 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
          try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
              {
                SubLObject pcase_var = initial_check_defn_admit_status(col, v_term, mt, quotedP);
                if (pcase_var.eql($kw12$ADMITTED)) {
                  rejectedP = NIL;
                } else if (pcase_var.eql($kw13$REJECTED)) {
                  rejectedP = T;
                } else {
                  if ((NIL != nec_defn_rejectsP(col, v_term, mt, quotedP, UNPROVIDED))) {
                    rejectedP = T;
                  } else {
                    if (((NIL == quotedP)
                         && (NIL != cycl_grammar.fast_quote_term_p(v_term)))) {
                      {
                        SubLObject denoted_term = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31112");
                        if (((NIL != denoted_term)
                             && (NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5429")))) {
                          rejectedP = T;
                        }
                      }
                    }
                  }
                }
              }
            } finally {
              {
                SubLObject _prev_bind_0_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                  at_defns.clear_defn_space();
                } finally {
                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                }
              }
            }
          } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_2, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_1, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
          }
        }
        return rejectedP;
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 10382) 
  public static SubLSymbol $new_quoted_defns_admitP_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 10382) 
  public static final SubLObject reset_new_quoted_defns_admitP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), $list7);
      Hashtables.sethash($kw8$FUNCTION, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), $sym20$NEW_QUOTED_DEFNS_ADMIT_);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 10382) 
  public static final SubLObject new_quoted_defns_admitP_metered(SubLObject col, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return defns_admitP_int(col, v_term, mt, T);
  }

  @SubL(source = "cycl/defns.lisp", position = 10382) 
  public static final SubLObject new_quoted_defns_admitP(SubLObject col, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = new_quoted_defns_admitP_metered(col, v_term, mt);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), Hashtables.gethash($kw5$ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return new_quoted_defns_admitP_metered(col, v_term, mt);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 10660) 
  public static SubLSymbol $new_quoted_defns_rejectP_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 10660) 
  public static final SubLObject reset_new_quoted_defns_rejectP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), $list7);
      Hashtables.sethash($kw8$FUNCTION, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), $sym24$NEW_QUOTED_DEFNS_REJECT_);
      return NIL;
    }
  }

  /** If the defnIff of the COL explicitly admits or rejects TERM, return result.  
Otherwise, return :rejected if a  necessaryDefn of genls of COL rejects the TERM. 
Will delegate to the correct defns checks for quoted/non-quoted using QUOTED? */
  @SubL(source = "cycl/defns.lisp", position = 10781) 
  public static final SubLObject initial_check_defn_admit_status(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject admit_status = defining_defns_admitsP(col, v_term, mt, quotedP);
        SubLObject doneP = NIL;
        SubLObject pcase_var = admit_status;
        if (pcase_var.eql($kw12$ADMITTED)) {
        } else if (pcase_var.eql($kw13$REJECTED)) {
        } else {
          if ((NIL != at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread))) {
            {
              SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
              try {
                at_vars.$defn_collection$.bind(col, thread);
                if ((NIL == doneP)) {
                  {
                    SubLObject node_var = col;
                    SubLObject deck_type = (false ? ((SubLObject) $kw27$QUEUE) : $kw28$STACK);
                    SubLObject recur_deck = deck.create_deck(deck_type);
                    {
                      SubLObject _prev_bind_0_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                          SubLObject mt_var = mt;
                          {
                            SubLObject _prev_bind_0_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                              {
                                SubLObject tv_var = NIL;
                                {
                                  SubLObject _prev_bind_0_5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                  SubLObject _prev_bind_1_6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                  try {
                                    sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if ((NIL != tv_var)) {
                                      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                        if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                          {
                                            SubLObject pcase_var_7 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var_7.eql($kw30$ERROR)) {
                                              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else if (pcase_var_7.eql($kw33$CERROR)) {
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2106");
                                            } else if (pcase_var_7.eql($kw35$WARN)) {
                                              Errors.warn($str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P);
                                            } else {
                                              Errors.warn($str36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                              Errors.cerror($str34$continue_anyway, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P);
                                            }
                                          }
                                        }
                                      }
                                    }
                                    {
                                      SubLObject _prev_bind_0_8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                      SubLObject _prev_bind_1_9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                      SubLObject _prev_bind_2_10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                      SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                      SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                      try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const37$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const37$genls), thread);
                                        if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                            || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                          {
                                            SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            SubLObject _prev_bind_1_12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            SubLObject _prev_bind_2_13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                              sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                                              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                              sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                              while (((NIL != node_var)
                                                   && (NIL == doneP))) {
                                                {
                                                  SubLObject genl = node_var;
                                                  if ((genl != col)) {
                                                    if ((NIL != nec_defn_rejectsP(genl, v_term, mt, quotedP, T))) {
                                                      doneP = T;
                                                      admit_status = $kw13$REJECTED;
                                                    }
                                                  }
                                                }
                                                {
                                                  SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const37$genls));
                                                  SubLObject rest = NIL;
                                                  for (rest = accessible_modules; (!(((NIL != doneP)
                                                        || (NIL == rest)))); rest = rest.rest()) {
                                                    {
                                                      SubLObject module_var = rest.first();
                                                      {
                                                        SubLObject _prev_bind_0_14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                          sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                          {
                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                            if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                              {
                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if ((NIL != d_link)) {
                                                                  {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if ((NIL != mt_links)) {
                                                                      {
                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                        while ((!(((NIL != doneP)
                                                                              || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                          thread.resetMultipleValues();
                                                                          {
                                                                            SubLObject mt_16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if ((NIL != mt_relevance_macros.relevant_mtP(mt_16))) {
                                                                              {
                                                                                SubLObject _prev_bind_0_17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                  sbhl_link_vars.$sbhl_link_mt$.bind(mt_16, thread);
                                                                                  {
                                                                                    SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                    while ((!(((NIL != doneP)
                                                                                          || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)))))) {
                                                                                      thread.resetMultipleValues();
                                                                                      {
                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                          {
                                                                                            SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                              sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                              {
                                                                                                SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9240")) : link_nodes);
                                                                                                SubLObject rest_20 = NIL;
                                                                                                for (rest_20 = new_list; (!(((NIL != doneP)
                                                                                                      || (NIL == rest_20)))); rest_20 = rest_20.rest()) {
                                                                                                  {
                                                                                                    SubLObject node_vars_link_node = rest_20.first();
                                                                                                    if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                      sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                      deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } finally {
                                                                                              sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_19, thread);
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                                                                                      }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                                                                                  }
                                                                                } finally {
                                                                                  sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_17, thread);
                                                                                }
                                                                              }
                                                                            }
                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                          }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                              }
                                                            } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                              {
                                                                SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9241")) : Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2523"));
                                                                SubLObject rest_21 = NIL;
                                                                for (rest_21 = new_list; (!(((NIL != doneP)
                                                                      || (NIL == rest_21)))); rest_21 = rest_21.rest()) {
                                                                  {
                                                                    SubLObject generating_fn = rest_21.first();
                                                                    {
                                                                      SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                      try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        {
                                                                          SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                          SubLObject new_list_23 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9242")) : link_nodes);
                                                                          SubLObject rest_24 = NIL;
                                                                          for (rest_24 = new_list_23; (!(((NIL != doneP)
                                                                                || (NIL == rest_24)))); rest_24 = rest_24.rest()) {
                                                                            {
                                                                              SubLObject node_vars_link_node = rest_24.first();
                                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_22, thread);
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } finally {
                                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_15, thread);
                                                          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_13, thread);
                                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_12, thread);
                                              sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_11, thread);
                                            }
                                          }
                                        } else {
                                          sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str39$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                      } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_10, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_9, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_8, thread);
                                      }
                                    }
                                  } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_6, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_5, thread);
                                  }
                                }
                              }
                            } finally {
                              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                              mt_relevance_macros.$mt$.rebind(_prev_bind_0_4, thread);
                            }
                          }
                          sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                      } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_3, thread);
                      }
                    }
                  }
                }
              } finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return admit_status;
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 11820) 
  public static final SubLObject defns_walk_admitP(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $defn_term$.currentBinding(thread);
          SubLObject _prev_bind_1 = $org_collection$.currentBinding(thread);
          SubLObject _prev_bind_2 = $failing_suf_defns$.currentBinding(thread);
          try {
            $defn_term$.bind(v_term, thread);
            $org_collection$.bind(col, thread);
            $failing_suf_defns$.bind(NIL, thread);
            if ((NIL != quotedP)) {
              result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($const37$genls), col, Symbols.symbol_function($sym40$COL_QUOTED_DEFN_ADMITS_), mt, UNPROVIDED, UNPROVIDED);
            } else {
              result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($const37$genls), col, Symbols.symbol_function($sym41$COL_DEFN_ADMITS_), mt, UNPROVIDED, UNPROVIDED);
            }
            if (((NIL == result)
                 && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))
                 && (NIL != wff_vars.$include_suf_defn_violationsP$.getDynamicValue(thread))
                 && (NIL != $failing_suf_defns$.getDynamicValue(thread)))) {
              if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7223"))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11308");
              }
            }
          } finally {
            $failing_suf_defns$.rebind(_prev_bind_2, thread);
            $org_collection$.rebind(_prev_bind_1, thread);
            $defn_term$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 13737) 
  public static final SubLObject col_defn_admitsP(SubLObject col) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return col_defn_admitsP_int(col, $defn_term$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), NIL);
    }
  }

  public static final class $col_defn_admitsP$UnaryFunction extends UnaryFunction {
    public $col_defn_admitsP$UnaryFunction() { super(extractFunctionNamed("COL-DEFN-ADMITS?")); }
    public SubLObject processItem(SubLObject arg1) { return col_defn_admitsP(arg1); }
  }

  @SubL(source = "cycl/defns.lisp", position = 13940) 
  public static final SubLObject col_defn_admitsP_int(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == has_suf_defn_somewhereP(col, quotedP))) {
        return list(NIL, T);
      }
      if ((NIL == has_some_defnP(col, quotedP))) {
        return list(NIL, NIL);
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        SubLObject pcase_var = (($org_collection$.getDynamicValue(thread) == col) ? ((SubLObject) T) : defining_defns_admitsP(col, v_term, mt, quotedP));
        if (pcase_var.eql($kw12$ADMITTED)) {
          result = T;
          doneP = T;
        } else if (pcase_var.eql($kw13$REJECTED)) {
          result = NIL;
          doneP = T;
        } else {
          if ((NIL != nec_defn_permitsP(col, v_term, mt, quotedP, NIL))) {
            if ((NIL != suf_defn_admitsP(col, v_term, mt, quotedP))) {
              result = T;
              doneP = T;
            }
          } else {
            result = NIL;
            doneP = T;
          }
        }
        return list(result, doneP);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 14674) 
  public static final SubLObject defining_defns_admitsP(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject iff_defn = iff_defn(col, quotedP);
        SubLObject admit_status = NIL;
        if ((NIL == iff_defn)) {
          return NIL;
        }
        {
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              if (((NIL != assertions_high.valid_assertion(iff_defn, UNPROVIDED))
                   && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(iff_defn))))) {
                {
                  SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(iff_defn));
                  {
                    SubLObject _prev_bind_0_25 = at_vars.$defn_collection$.currentBinding(thread);
                    try {
                      at_vars.$defn_collection$.bind(col, thread);
                      if ((NIL != at_defns.viable_defnP(defn, col))) {
                        if ((NIL != ((NIL != quotedP) ? ((SubLObject) at_defns.quoted_defn_admitsP(defn, v_term, col, mt)) : at_defns.defn_admitsP(defn, v_term, col, mt)))) {
                          admit_status = $kw12$ADMITTED;
                        } else {
                          admit_status = $kw13$REJECTED;
                          if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11309");
                          }
                        }
                      }
                    } finally {
                      at_vars.$defn_collection$.rebind(_prev_bind_0_25, thread);
                    }
                  }
                }
              }
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return admit_status;
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 16610) 
  public static final SubLObject suf_defn_admitsP(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject suf_defns = suf_defns(col, quotedP);
        SubLObject admittedP = NIL;
        SubLObject doneP = NIL;
        if ((NIL == suf_defns)) {
          return NIL;
        }
        {
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              if ((NIL == doneP)) {
                {
                  SubLObject csome_list_var = suf_defns;
                  SubLObject suf_defn = NIL;
                  for (suf_defn = csome_list_var.first(); (!(((NIL != doneP)
                        || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), suf_defn = csome_list_var.first()) {
                    if (((NIL != assertions_high.valid_assertion(suf_defn, UNPROVIDED))
                         && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(suf_defn))))) {
                      {
                        SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suf_defn));
                        {
                          SubLObject _prev_bind_0_26 = at_vars.$defn_collection$.currentBinding(thread);
                          try {
                            at_vars.$defn_collection$.bind(col, thread);
                            if ((NIL != at_defns.viable_defnP(defn, col))) {
                              if ((NIL != ((NIL != quotedP) ? ((SubLObject) Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5365")) : at_defns.quiet_defn_admitsP(defn, v_term, col, mt)))) {
                                admittedP = T;
                                doneP = T;
                              } else {
                                admittedP = NIL;
                                doneP = NIL;
                                if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                  {
                                    SubLObject item_var = defn;
                                    if ((NIL == conses_high.member(item_var, $failing_suf_defns$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                      $failing_suf_defns$.setDynamicValue(cons(item_var, $failing_suf_defns$.getDynamicValue(thread)), thread);
                                    }
                                  }
                                }
                              }
                            }
                          } finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_26, thread);
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
        }
        return admittedP;
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 17450) 
  public static final SubLObject nec_defn_permitsP(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP, SubLObject consider_iff_as_necP) {
    if ((consider_iff_as_necP == UNPROVIDED)) {
      consider_iff_as_necP = NIL;
    }
    return makeBoolean((NIL == nec_defn_rejectsP(col, v_term, mt, quotedP, consider_iff_as_necP)));
  }

  @SubL(source = "cycl/defns.lisp", position = 17615) 
  public static SubLSymbol $nec_defn_rejectsP_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 17615) 
  public static final SubLObject reset_nec_defn_rejectsP_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $nec_defn_rejectsP_meters$.getDynamicValue(thread), $list50);
      Hashtables.sethash($kw8$FUNCTION, $nec_defn_rejectsP_meters$.getDynamicValue(thread), $sym51$NEC_DEFN_REJECTS_);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 17615) 
  public static final SubLObject nec_defn_rejectsP_metered(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP, SubLObject consider_iff_as_necP) {
    if ((consider_iff_as_necP == UNPROVIDED)) {
      consider_iff_as_necP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject nec_defns = nec_defns(col, quotedP);
        SubLObject rejectedP = NIL;
        SubLObject doneP = NIL;
        if ((NIL == nec_defns)) {
          if ((NIL != consider_iff_as_necP)) {
            nec_defns = list(iff_defn(col, quotedP));
          }
          if ((NIL == nec_defns)) {
            return NIL;
          }
        }
        {
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              if ((NIL == doneP)) {
                {
                  SubLObject csome_list_var = nec_defns;
                  SubLObject nec_defn = NIL;
                  for (nec_defn = csome_list_var.first(); (!(((NIL != doneP)
                        || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), nec_defn = csome_list_var.first()) {
                    if (((NIL != assertions_high.valid_assertion(nec_defn, UNPROVIDED))
                         && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(nec_defn))))) {
                      {
                        SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(nec_defn));
                        {
                          SubLObject _prev_bind_0_27 = at_vars.$defn_collection$.currentBinding(thread);
                          try {
                            at_vars.$defn_collection$.bind(col, thread);
                            if ((NIL != at_defns.viable_defnP(defn, col))) {
                              if ((NIL != ((NIL != quotedP) ? ((SubLObject) at_defns.quoted_defn_admitsP(defn, v_term, col, mt)) : at_defns.defn_admitsP(defn, v_term, col, mt)))) {
                                rejectedP = NIL;
                                doneP = NIL;
                              } else {
                                rejectedP = T;
                                doneP = T;
                                if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11310");
                                }
                              }
                            }
                          } finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_27, thread);
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
        }
        return rejectedP;
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 17615) 
  public static final SubLObject nec_defn_rejectsP(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP, SubLObject consider_iff_as_necP) {
    if ((consider_iff_as_necP == UNPROVIDED)) {
      consider_iff_as_necP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt, quotedP, consider_iff_as_necP), Hashtables.gethash($kw5$ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
      }
    }
  }

  public static final class $admitting_defn_assertions$UnaryFunction extends UnaryFunction {
    public $admitting_defn_assertions$UnaryFunction() { super(extractFunctionNamed("ADMITTING-DEFN-ASSERTIONS")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10582"); }
  }

  @SubL(source = "cycl/defns.lisp", position = 26461) 
  private static SubLSymbol $min_defn_admits_map$ = null;

  @SubL(source = "cycl/defns.lisp", position = 27722) 
  private static SubLSymbol $min_quoted_defn_admits_map$ = null;

  @SubL(source = "cycl/defns.lisp", position = 31093) 
  public static final SubLObject handle_added_genl_for_suf_defns_int(SubLObject spec, SubLObject genl, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject spec_suf_count = suf_defn_count(spec, quotedP);
        if ((spec_suf_count.isInteger()
             && spec_suf_count.numG(ZERO_INTEGER))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym84$RELEVANT_MT_IS_EVERYTHING, thread);
              mt_relevance_macros.$mt$.bind($const55$EverythingPSC, thread);
              {
                SubLObject node_var = genl;
                SubLObject deck_type = (false ? ((SubLObject) $kw27$QUEUE) : $kw28$STACK);
                SubLObject recur_deck = deck.create_deck(deck_type);
                {
                  SubLObject _prev_bind_0_54 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    {
                      SubLObject tv_var = NIL;
                      {
                        SubLObject _prev_bind_0_55 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_56 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw30$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw33$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2108");
                                  } else if (pcase_var.eql($kw35$WARN)) {
                                    Errors.warn($str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str34$continue_anyway, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_57 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_58 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const37$genls), thread);
                              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                              sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const37$genls), thread);
                              if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                  || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                {
                                  SubLObject _prev_bind_0_59 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                  SubLObject _prev_bind_1_60 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                  SubLObject _prev_bind_2_61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                  try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while ((NIL != node_var)) {
                                      {
                                        SubLObject genl_col = node_var;
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10594");
                                      }
                                      {
                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const37$genls));
                                        SubLObject cdolist_list_var = accessible_modules;
                                        SubLObject module_var = NIL;
                                        for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
                                          {
                                            SubLObject _prev_bind_0_62 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                              sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                              sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                              {
                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                  {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if ((NIL != d_link)) {
                                                      {
                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if ((NIL != mt_links)) {
                                                          {
                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                                              thread.resetMultipleValues();
                                                              {
                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                  {
                                                                    SubLObject _prev_bind_0_64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                      sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                      {
                                                                        SubLObject iteration_state_65 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_65))) {
                                                                          thread.resetMultipleValues();
                                                                          {
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_65);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                              {
                                                                                SubLObject _prev_bind_0_66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                  {
                                                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9246")) : link_nodes);
                                                                                    SubLObject cdolist_list_var_67 = new_list;
                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                    for (node_vars_link_node = cdolist_list_var_67.first(); (NIL != cdolist_list_var_67); cdolist_list_var_67 = cdolist_list_var_67.rest(), node_vars_link_node = cdolist_list_var_67.first()) {
                                                                                      if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } finally {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_66, thread);
                                                                                }
                                                                              }
                                                                            }
                                                                            iteration_state_65 = dictionary_contents.do_dictionary_contents_next(iteration_state_65);
                                                                          }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_65);
                                                                      }
                                                                    } finally {
                                                                      sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_64, thread);
                                                                    }
                                                                  }
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                              }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                  }
                                                } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                  {
                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9247")) : Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2527"));
                                                    SubLObject cdolist_list_var_68 = new_list;
                                                    SubLObject generating_fn = NIL;
                                                    for (generating_fn = cdolist_list_var_68.first(); (NIL != cdolist_list_var_68); cdolist_list_var_68 = cdolist_list_var_68.rest(), generating_fn = cdolist_list_var_68.first()) {
                                                      {
                                                        SubLObject _prev_bind_0_69 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                          sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                          {
                                                            SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                            SubLObject new_list_70 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9248")) : link_nodes);
                                                            SubLObject cdolist_list_var_71 = new_list_70;
                                                            SubLObject node_vars_link_node = NIL;
                                                            for (node_vars_link_node = cdolist_list_var_71.first(); (NIL != cdolist_list_var_71); cdolist_list_var_71 = cdolist_list_var_71.rest(), node_vars_link_node = cdolist_list_var_71.first()) {
                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                              }
                                                            }
                                                          }
                                                        } finally {
                                                          sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_69, thread);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_63, thread);
                                              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_62, thread);
                                            }
                                          }
                                        }
                                      }
                                      node_var = deck.deck_pop(recur_deck);
                                    }
                                  } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_61, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_60, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_59, thread);
                                  }
                                }
                              } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str39$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                              }
                            } finally {
                              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                              sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_58, thread);
                              sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_57, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_56, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_55, thread);
                        }
                      }
                      sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    }
                  } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_54, thread);
                  }
                }
              }
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 31479) 
  public static SubLSymbol $new_handle_added_genl_for_suf_defns_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 31479) 
  public static final SubLObject reset_new_handle_added_genl_for_suf_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), $list87);
      Hashtables.sethash($kw8$FUNCTION, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), $sym88$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 31479) 
  public static final SubLObject new_handle_added_genl_for_suf_defns_metered(SubLObject spec, SubLObject genl) {
    return handle_added_genl_for_suf_defns_int(spec, genl, NIL);
  }

  @SubL(source = "cycl/defns.lisp", position = 31479) 
  public static final SubLObject new_handle_added_genl_for_suf_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = new_handle_added_genl_for_suf_defns_metered(spec, genl);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), Hashtables.gethash($kw5$ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return new_handle_added_genl_for_suf_defns_metered(spec, genl);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 31649) 
  public static SubLSymbol $new_handle_added_genl_for_suf_quoted_defns_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 31649) 
  public static final SubLObject reset_new_handle_added_genl_for_suf_quoted_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list87);
      Hashtables.sethash($kw8$FUNCTION, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $sym92$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 31649) 
  public static final SubLObject new_handle_added_genl_for_suf_quoted_defns_metered(SubLObject spec, SubLObject genl) {
    return handle_added_genl_for_suf_defns_int(spec, genl, T);
  }

  @SubL(source = "cycl/defns.lisp", position = 31649) 
  public static final SubLObject new_handle_added_genl_for_suf_quoted_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), Hashtables.gethash($kw5$ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 31824) 
  public static final SubLObject handle_removed_genl_for_suf_defns_int(SubLObject spec, SubLObject genl, SubLObject quotedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym84$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const55$EverythingPSC, thread);
          if ((NIL == genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED))) {
            {
              SubLObject spec_suf_count = suf_defn_count(spec, quotedP);
              if ((spec_suf_count.isInteger()
                   && spec_suf_count.numG(ZERO_INTEGER))) {
                {
                  SubLObject node_var = genl;
                  SubLObject deck_type = (false ? ((SubLObject) $kw27$QUEUE) : $kw28$STACK);
                  SubLObject recur_deck = deck.create_deck(deck_type);
                  {
                    SubLObject _prev_bind_0_72 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                      sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                      {
                        SubLObject tv_var = NIL;
                        {
                          SubLObject _prev_bind_0_73 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                          SubLObject _prev_bind_1_74 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if ((NIL != tv_var)) {
                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                  {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($kw30$ERROR)) {
                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($kw33$CERROR)) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2109");
                                    } else if (pcase_var.eql($kw35$WARN)) {
                                      Errors.warn($str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P);
                                    } else {
                                      Errors.warn($str36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                      Errors.cerror($str34$continue_anyway, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P);
                                    }
                                  }
                                }
                              }
                            }
                            {
                              SubLObject _prev_bind_0_75 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                              SubLObject _prev_bind_1_76 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                              SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                              SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                              SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                              try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const37$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const37$genls), thread);
                                if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                    || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                  {
                                    SubLObject _prev_bind_0_77 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_1_78 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                      sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                      sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($const37$genls)), thread);
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                      sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                      while ((NIL != node_var)) {
                                        {
                                          SubLObject genl_col = node_var;
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10590");
                                        }
                                        {
                                          SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const37$genls));
                                          SubLObject cdolist_list_var = accessible_modules;
                                          SubLObject module_var = NIL;
                                          for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
                                            {
                                              SubLObject _prev_bind_0_80 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                              SubLObject _prev_bind_1_81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                              try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                {
                                                  SubLObject node = function_terms.naut_to_nart(node_var);
                                                  if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                    {
                                                      SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                      if ((NIL != d_link)) {
                                                        {
                                                          SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                          if ((NIL != mt_links)) {
                                                            {
                                                              SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                              while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                  SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                  SubLObject tv_links = thread.secondMultipleValue();
                                                                  thread.resetMultipleValues();
                                                                  if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                    {
                                                                      SubLObject _prev_bind_0_82 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                      try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        {
                                                                          SubLObject iteration_state_83 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                          while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_83))) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                              SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_83);
                                                                              SubLObject link_nodes = thread.secondMultipleValue();
                                                                              thread.resetMultipleValues();
                                                                              if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                {
                                                                                  SubLObject _prev_bind_0_84 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                  try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    {
                                                                                      SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9249")) : link_nodes);
                                                                                      SubLObject cdolist_list_var_85 = new_list;
                                                                                      SubLObject node_vars_link_node = NIL;
                                                                                      for (node_vars_link_node = cdolist_list_var_85.first(); (NIL != cdolist_list_var_85); cdolist_list_var_85 = cdolist_list_var_85.rest(), node_vars_link_node = cdolist_list_var_85.first()) {
                                                                                        if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                          sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                          deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_84, thread);
                                                                                  }
                                                                                }
                                                                              }
                                                                              iteration_state_83 = dictionary_contents.do_dictionary_contents_next(iteration_state_83);
                                                                            }
                                                                          }
                                                                          dictionary_contents.do_dictionary_contents_finalize(iteration_state_83);
                                                                        }
                                                                      } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_82, thread);
                                                                      }
                                                                    }
                                                                  }
                                                                  iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                }
                                                              }
                                                              dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                      }
                                                    }
                                                  } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                    {
                                                      SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9250")) : Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2529"));
                                                      SubLObject cdolist_list_var_86 = new_list;
                                                      SubLObject generating_fn = NIL;
                                                      for (generating_fn = cdolist_list_var_86.first(); (NIL != cdolist_list_var_86); cdolist_list_var_86 = cdolist_list_var_86.rest(), generating_fn = cdolist_list_var_86.first()) {
                                                        {
                                                          SubLObject _prev_bind_0_87 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                          try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            {
                                                              SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                              SubLObject new_list_88 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9251")) : link_nodes);
                                                              SubLObject cdolist_list_var_89 = new_list_88;
                                                              SubLObject node_vars_link_node = NIL;
                                                              for (node_vars_link_node = cdolist_list_var_89.first(); (NIL != cdolist_list_var_89); cdolist_list_var_89 = cdolist_list_var_89.rest(), node_vars_link_node = cdolist_list_var_89.first()) {
                                                                if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                  deck.deck_push(node_vars_link_node, recur_deck);
                                                                }
                                                              }
                                                            }
                                                          } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_87, thread);
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_81, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_80, thread);
                                              }
                                            }
                                          }
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                      }
                                    } finally {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_79, thread);
                                      sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_78, thread);
                                      sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_77, thread);
                                    }
                                  }
                                } else {
                                  sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str39$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                              } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_76, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_75, thread);
                              }
                            }
                          } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_74, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_73, thread);
                          }
                        }
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                      }
                    } finally {
                      sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_72, thread);
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

  @SubL(source = "cycl/defns.lisp", position = 32249) 
  public static SubLSymbol $new_handle_removed_genl_for_suf_defns_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 32249) 
  public static final SubLObject reset_new_handle_removed_genl_for_suf_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), $list87);
      Hashtables.sethash($kw8$FUNCTION, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), $sym96$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 32249) 
  public static final SubLObject new_handle_removed_genl_for_suf_defns_metered(SubLObject spec, SubLObject genl) {
    return handle_removed_genl_for_suf_defns_int(spec, genl, NIL);
  }

  @SubL(source = "cycl/defns.lisp", position = 32249) 
  public static final SubLObject new_handle_removed_genl_for_suf_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = new_handle_removed_genl_for_suf_defns_metered(spec, genl);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), Hashtables.gethash($kw5$ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return new_handle_removed_genl_for_suf_defns_metered(spec, genl);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 32423) 
  public static SubLSymbol $new_handle_removed_genl_for_suf_quoted_defns_meters$ = null;

  @SubL(source = "cycl/defns.lisp", position = 32423) 
  public static final SubLObject reset_new_handle_removed_genl_for_suf_quoted_defns_meters() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Hashtables.sethash($kw2$CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
      Hashtables.sethash($kw3$TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw4$RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw5$ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
      Hashtables.sethash($kw6$ARG_LIST, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list87);
      Hashtables.sethash($kw8$FUNCTION, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $sym100$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS);
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 32423) 
  public static final SubLObject new_handle_removed_genl_for_suf_quoted_defns_metered(SubLObject spec, SubLObject genl) {
    return handle_removed_genl_for_suf_defns_int(spec, genl, T);
  }

  @SubL(source = "cycl/defns.lisp", position = 32423) 
  public static final SubLObject new_handle_removed_genl_for_suf_quoted_defns(SubLObject spec, SubLObject genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$defn_metersP$.getDynamicValue(thread))) {
        {
          SubLObject result = NIL;
          SubLObject run_time = NIL;
          SubLObject time_var = Time.get_internal_real_time();
          result = new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
          run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
          Hashtables.sethash($kw2$CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash($kw2$CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
          Hashtables.sethash($kw3$TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, Hashtables.gethash($kw3$TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw4$RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, Hashtables.gethash($kw4$RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          Hashtables.sethash($kw5$ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), Hashtables.gethash($kw5$ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
          return result;
        }
      } else {
        return new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
      }
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 32602) 
  public static final SubLObject clear_defns() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue(thread))) {
        return NIL;
      }
      if ((NIL != $has_suf_defn_cache$.getDynamicValue(thread))) {
        Hashtables.clrhash($has_suf_defn_cache$.getDynamicValue(thread));
      }
      if ((NIL != $iff_defns$.getDynamicValue(thread))) {
        Hashtables.clrhash($iff_defns$.getDynamicValue(thread));
      }
      if ((NIL != $suf_defns$.getDynamicValue(thread))) {
        Hashtables.clrhash($suf_defns$.getDynamicValue(thread));
      }
      if ((NIL != $nec_defns$.getDynamicValue(thread))) {
        Hashtables.clrhash($nec_defns$.getDynamicValue(thread));
      }
      if ((NIL != $has_quoted_suf_defn_cache$.getDynamicValue(thread))) {
        Hashtables.clrhash($has_quoted_suf_defn_cache$.getDynamicValue(thread));
      }
      if ((NIL != $quoted_iff_defns$.getDynamicValue(thread))) {
        Hashtables.clrhash($quoted_iff_defns$.getDynamicValue(thread));
      }
      if ((NIL != $quoted_suf_defns$.getDynamicValue(thread))) {
        Hashtables.clrhash($quoted_suf_defns$.getDynamicValue(thread));
      }
      if ((NIL != $quoted_nec_defns$.getDynamicValue(thread))) {
        Hashtables.clrhash($quoted_nec_defns$.getDynamicValue(thread));
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 36898) 
  public static final SubLObject defns_cache_unbuiltP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((!(($has_suf_defn_cache$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p($has_suf_defn_cache$.getDynamicValue(thread)))
               && $iff_defns$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p($iff_defns$.getDynamicValue(thread)))
               && $suf_defns$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p($suf_defns$.getDynamicValue(thread)))
               && $nec_defns$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p($nec_defns$.getDynamicValue(thread)))
               && $has_quoted_suf_defn_cache$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p($has_quoted_suf_defn_cache$.getDynamicValue(thread)))
               && $quoted_iff_defns$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p($quoted_iff_defns$.getDynamicValue(thread)))
               && $quoted_suf_defns$.getDynamicValue(thread).isHashtable()
               && $quoted_nec_defns$.getDynamicValue(thread).isHashtable()
               && at_vars.$suf_defn_cache$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p(at_vars.$suf_defn_cache$.getDynamicValue(thread)))
               && at_vars.$suf_quoted_defn_cache$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p(at_vars.$suf_quoted_defn_cache$.getDynamicValue(thread)))
               && at_vars.$suf_function_cache$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p(at_vars.$suf_function_cache$.getDynamicValue(thread)))
               && at_vars.$suf_quoted_function_cache$.getDynamicValue(thread).isHashtable()
               && (NIL == hash_table_utilities.hash_table_empty_p(at_vars.$suf_quoted_function_cache$.getDynamicValue(thread)))))));
    }
  }

  @SubL(source = "cycl/defns.lisp", position = 38123) 
  public static final SubLObject clear_defns_cache() {
    clear_defns();
    at_defns.clear_suf_defns();
    at_defns.clear_suf_quoted_defns();
    at_defns.clear_suf_functions();
    at_defns.clear_suf_quoted_functions();
    return NIL;
  }

  @SubL(source = "cycl/defns.lisp", position = 39389) 
  public static final SubLObject load_defns_cache_from_stream(SubLObject stream) {
    {
      SubLObject dummy = NIL;
      $has_suf_defn_cache$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $iff_defns$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $suf_defns$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $nec_defns$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $has_quoted_suf_defn_cache$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $quoted_iff_defns$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $quoted_suf_defns$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $quoted_nec_defns$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      at_vars.$suf_defn_cache$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      at_vars.$suf_quoted_defn_cache$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      at_vars.$suf_function_cache$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      at_vars.$suf_quoted_function_cache$.setDynamicValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      dummy = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      dummy = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      dummy = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  public static final SubLObject declare_defns_file() {
    declareFunction(myName, "suf_defn_count", "SUF-DEFN-COUNT", 2, 0, false);
    declareFunction(myName, "has_suf_defn_somewhereP", "HAS-SUF-DEFN-SOMEWHERE?", 2, 0, false);
    //declareFunction(myName, "set_suf_defn_count", "SET-SUF-DEFN-COUNT", 3, 0, false);
    //declareFunction(myName, "rem_suf_defn_count", "REM-SUF-DEFN-COUNT", 2, 0, false);
    declareFunction(myName, "iff_defn", "IFF-DEFN", 2, 0, false);
    //declareFunction(myName, "rem_iff_defn", "REM-IFF-DEFN", 2, 0, false);
    declareFunction(myName, "suf_defns", "SUF-DEFNS", 2, 0, false);
    //declareFunction(myName, "rem_suf_defn", "REM-SUF-DEFN", 3, 0, false);
    //declareFunction(myName, "new_suf_defnP", "NEW-SUF-DEFN?", 2, 1, false);
    declareFunction(myName, "nec_defns", "NEC-DEFNS", 2, 0, false);
    //declareFunction(myName, "rem_nec_defn", "REM-NEC-DEFN", 3, 0, false);
    declareFunction(myName, "has_some_defnP", "HAS-SOME-DEFN?", 2, 0, false);
    declareFunction(myName, "reset_new_defns_admitP_meters", "RESET-NEW-DEFNS-ADMIT?-METERS", 0, 0, false);
    declareFunction(myName, "new_defns_admitP_metered", "NEW-DEFNS-ADMIT?-METERED", 2, 1, false);
    declareFunction(myName, "new_defns_admitP", "NEW-DEFNS-ADMIT?", 2, 1, false);
    declareFunction(myName, "defns_admitP_int", "DEFNS-ADMIT?-INT", 4, 0, false);
    declareFunction(myName, "reset_new_defns_rejectP_meters", "RESET-NEW-DEFNS-REJECT?-METERS", 0, 0, false);
    declareFunction(myName, "new_defns_rejectP_metered", "NEW-DEFNS-REJECT?-METERED", 2, 1, false);
    declareFunction(myName, "new_defns_rejectP", "NEW-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "defns_rejectP_int", "DEFNS-REJECT?-INT", 4, 0, false);
    declareFunction(myName, "reset_new_quoted_defns_admitP_meters", "RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS", 0, 0, false);
    declareFunction(myName, "new_quoted_defns_admitP_metered", "NEW-QUOTED-DEFNS-ADMIT?-METERED", 2, 1, false);
    declareFunction(myName, "new_quoted_defns_admitP", "NEW-QUOTED-DEFNS-ADMIT?", 2, 1, false);
    declareFunction(myName, "reset_new_quoted_defns_rejectP_meters", "RESET-NEW-QUOTED-DEFNS-REJECT?-METERS", 0, 0, false);
    //declareFunction(myName, "new_quoted_defns_rejectP_metered", "NEW-QUOTED-DEFNS-REJECT?-METERED", 2, 1, false);
    //declareFunction(myName, "new_quoted_defns_rejectP", "NEW-QUOTED-DEFNS-REJECT?", 2, 1, false);
    declareFunction(myName, "initial_check_defn_admit_status", "INITIAL-CHECK-DEFN-ADMIT-STATUS", 4, 0, false);
    declareFunction(myName, "defns_walk_admitP", "DEFNS-WALK-ADMIT?", 4, 0, false);
    //declareFunction(myName, "sufficient_defn_violations", "SUFFICIENT-DEFN-VIOLATIONS", 5, 0, false);
    //declareFunction(myName, "sufficient_defn_violation", "SUFFICIENT-DEFN-VIOLATION", 6, 0, false);
    declareFunction(myName, "col_defn_admitsP", "COL-DEFN-ADMITS?", 1, 0, false); new $col_defn_admitsP$UnaryFunction();
    //declareFunction(myName, "col_quoted_defn_admitsP", "COL-QUOTED-DEFN-ADMITS?", 1, 0, false);
    declareFunction(myName, "col_defn_admitsP_int", "COL-DEFN-ADMITS?-INT", 4, 0, false);
    declareFunction(myName, "defining_defns_admitsP", "DEFINING-DEFNS-ADMITS?", 4, 0, false);
    //declareFunction(myName, "defining_defn_violations", "DEFINING-DEFN-VIOLATIONS", 5, 0, false);
    //declareFunction(myName, "defining_defn_violation", "DEFINING-DEFN-VIOLATION", 6, 0, false);
    declareFunction(myName, "suf_defn_admitsP", "SUF-DEFN-ADMITS?", 4, 0, false);
    declareFunction(myName, "nec_defn_permitsP", "NEC-DEFN-PERMITS?", 4, 1, false);
    declareFunction(myName, "reset_nec_defn_rejectsP_meters", "RESET-NEC-DEFN-REJECTS?-METERS", 0, 0, false);
    declareFunction(myName, "nec_defn_rejectsP_metered", "NEC-DEFN-REJECTS?-METERED", 4, 1, false);
    declareFunction(myName, "nec_defn_rejectsP", "NEC-DEFN-REJECTS?", 4, 1, false);
    //declareFunction(myName, "necessary_defn_violations", "NECESSARY-DEFN-VIOLATIONS", 6, 0, false);
    //declareFunction(myName, "necessary_defn_violation", "NECESSARY-DEFN-VIOLATION", 7, 0, false);
    //declareFunction(myName, "new_mts_of_admitting_defns", "NEW-MTS-OF-ADMITTING-DEFNS", 2, 0, false);
    //declareFunction(myName, "mts_of_admitting_quoted_defns", "MTS-OF-ADMITTING-QUOTED-DEFNS", 2, 0, false);
    //declareFunction(myName, "new_hl_justify_isa_via_defns", "NEW-HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
    //declareFunction(myName, "hl_justify_quoted_isa_via_defns", "HL-JUSTIFY-QUOTED-ISA-VIA-DEFNS", 2, 1, false);
    //declareFunction(myName, "assertions_of_admitting_defns", "ASSERTIONS-OF-ADMITTING-DEFNS", 5, 0, false);
    //declareFunction(myName, "mts_from_defn_assertions", "MTS-FROM-DEFN-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "initial_check_admit_defn", "INITIAL-CHECK-ADMIT-DEFN", 3, 0, false);
    //declareFunction(myName, "defns_of_admitting_sufficient_defns", "DEFNS-OF-ADMITTING-SUFFICIENT-DEFNS", 4, 0, false);
    //declareFunction(myName, "admitting_defn_assertions", "ADMITTING-DEFN-ASSERTIONS", 1, 0, false); new $admitting_defn_assertions$UnaryFunction();
    //declareFunction(myName, "admitting_quoted_defn_assertions", "ADMITTING-QUOTED-DEFN-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "admitting_defn_assertion", "ADMITTING-DEFN-ASSERTION", 1, 0, false);
    //declareFunction(myName, "admitting_quoted_defn_assertion", "ADMITTING-QUOTED-DEFN-ASSERTION", 1, 0, false);
    //declareFunction(myName, "admitting_defn_assertions_int", "ADMITTING-DEFN-ASSERTIONS-INT", 4, 0, false);
    //declareFunction(myName, "suf_admitting_defns", "SUF-ADMITTING-DEFNS", 4, 0, false);
    //declareFunction(myName, "min_defn_admits", "MIN-DEFN-ADMITS", 1, 1, false);
    //declareFunction(myName, "all_defn_admits", "ALL-DEFN-ADMITS", 1, 1, false);
    //declareFunction(myName, "min_quoted_defn_admits", "MIN-QUOTED-DEFN-ADMITS", 1, 1, false);
    //declareFunction(myName, "all_quoted_defn_admits", "ALL-QUOTED-DEFN-ADMITS", 1, 1, false);
    //declareFunction(myName, "update_iff_or_suf_defn", "UPDATE-IFF-OR-SUF-DEFN", 4, 0, false);
    //declareFunction(myName, "update_nec_defn", "UPDATE-NEC-DEFN", 3, 0, false);
    //declareFunction(myName, "new_add_iff_defn", "NEW-ADD-IFF-DEFN", 2, 0, false);
    //declareFunction(myName, "new_remove_iff_defn", "NEW-REMOVE-IFF-DEFN", 2, 0, false);
    //declareFunction(myName, "new_add_suf_defn", "NEW-ADD-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "new_remove_suf_defn", "NEW-REMOVE-SUF-DEFN", 2, 0, false);
    //declareFunction(myName, "add_nec_defn", "ADD-NEC-DEFN", 2, 0, false);
    //declareFunction(myName, "remove_nec_defn", "REMOVE-NEC-DEFN", 2, 0, false);
    //declareFunction(myName, "new_add_iff_quoted_defn", "NEW-ADD-IFF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "new_remove_iff_quoted_defn", "NEW-REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "new_add_suf_quoted_defn", "NEW-ADD-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "new_remove_suf_quoted_defn", "NEW-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "add_nec_quoted_defn", "ADD-NEC-QUOTED-DEFN", 2, 0, false);
    //declareFunction(myName, "remove_nec_quoted_defn", "REMOVE-NEC-QUOTED-DEFN", 2, 0, false);
    declareFunction(myName, "handle_added_genl_for_suf_defns_int", "HANDLE-ADDED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false);
    declareFunction(myName, "reset_new_handle_added_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
    declareFunction(myName, "new_handle_added_genl_for_suf_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
    declareFunction(myName, "new_handle_added_genl_for_suf_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
    declareFunction(myName, "reset_new_handle_added_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
    declareFunction(myName, "new_handle_added_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
    declareFunction(myName, "new_handle_added_genl_for_suf_quoted_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
    declareFunction(myName, "handle_removed_genl_for_suf_defns_int", "HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false);
    declareFunction(myName, "reset_new_handle_removed_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
    declareFunction(myName, "new_handle_removed_genl_for_suf_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
    declareFunction(myName, "new_handle_removed_genl_for_suf_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
    declareFunction(myName, "reset_new_handle_removed_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
    declareFunction(myName, "new_handle_removed_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
    declareFunction(myName, "new_handle_removed_genl_for_suf_quoted_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
    declareFunction(myName, "clear_defns", "CLEAR-DEFNS", 0, 0, false);
    //declareFunction(myName, "initialize_defns_cache", "INITIALIZE-DEFNS-CACHE", 0, 0, false);
    //declareFunction(myName, "initialize_defns", "INITIALIZE-DEFNS", 0, 0, false);
    //declareFunction(myName, "inc_suf_defn_count", "INC-SUF-DEFN-COUNT", 2, 1, false);
    //declareFunction(myName, "dec_suf_defn_count", "DEC-SUF-DEFN-COUNT", 2, 1, false);
    //declareFunction(myName, "update_suf_defn_cache", "UPDATE-SUF-DEFN-CACHE", 3, 0, false);
    //declareFunction(myName, "update_defns", "UPDATE-DEFNS", 4, 0, false);
    declareFunction(myName, "defns_cache_unbuiltP", "DEFNS-CACHE-UNBUILT?", 0, 0, false);
    declareFunction(myName, "clear_defns_cache", "CLEAR-DEFNS-CACHE", 0, 0, false);
    //declareFunction(myName, "rebuild_defns_cache", "REBUILD-DEFNS-CACHE", 0, 0, false);
    //declareFunction(myName, "dump_defns_cache_to_stream", "DUMP-DEFNS-CACHE-TO-STREAM", 1, 0, false);
    declareFunction(myName, "load_defns_cache_from_stream", "LOAD-DEFNS-CACHE-FROM-STREAM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_defns_file() {
    $has_suf_defn_cache$ = defvar("*HAS-SUF-DEFN-CACHE*", NIL);
    $has_quoted_suf_defn_cache$ = defvar("*HAS-QUOTED-SUF-DEFN-CACHE*", NIL);
    $iff_defns$ = defvar("*IFF-DEFNS*", NIL);
    $quoted_iff_defns$ = defvar("*QUOTED-IFF-DEFNS*", NIL);
    $suf_defns$ = defvar("*SUF-DEFNS*", NIL);
    $quoted_suf_defns$ = defvar("*QUOTED-SUF-DEFNS*", NIL);
    $nec_defns$ = defvar("*NEC-DEFNS*", NIL);
    $quoted_nec_defns$ = defvar("*QUOTED-NEC-DEFNS*", NIL);
    $defn_term$ = defvar("*DEFN-TERM*", NIL);
    $org_collection$ = defvar("*ORG-COLLECTION*", NIL);
    $failing_suf_defns$ = defvar("*FAILING-SUF-DEFNS*", NIL);
    $new_defns_admitP_meters$ = defparameter("*NEW-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $new_defns_rejectP_meters$ = defparameter("*NEW-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $new_quoted_defns_admitP_meters$ = defparameter("*NEW-QUOTED-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $new_quoted_defns_rejectP_meters$ = defparameter("*NEW-QUOTED-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $nec_defn_rejectsP_meters$ = defparameter("*NEC-DEFN-REJECTS?-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $min_defn_admits_map$ = deflexical("*MIN-DEFN-ADMITS-MAP*", $list61);
    $min_quoted_defn_admits_map$ = deflexical("*MIN-QUOTED-DEFN-ADMITS-MAP*", $list64);
    $new_handle_added_genl_for_suf_defns_meters$ = defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $new_handle_added_genl_for_suf_quoted_defns_meters$ = defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $new_handle_removed_genl_for_suf_defns_meters$ = defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    $new_handle_removed_genl_for_suf_quoted_defns_meters$ = defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
    return NIL;
  }

  public static final SubLObject setup_defns_file() {
    // CVS_ID("Id: defns.lisp 126660 2008-12-06 00:38:39Z goolsbey ");
    {
      SubLObject item_var = $sym0$_NEW_DEFNS_ADMIT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym0$_NEW_DEFNS_ADMIT__METERS_, $str1$metering_cache_for_calls_to_defn_);
    reset_new_defns_admitP_meters();
    Hashtables.sethash($kw10$RESET, $new_defns_admitP_meters$.getDynamicValue(), $sym11$RESET_NEW_DEFNS_ADMIT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym9$NEW_DEFNS_ADMIT_ == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym14$_NEW_DEFNS_REJECT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym14$_NEW_DEFNS_REJECT__METERS_, $str15$metering_cache_for_calls_to_defn_);
    reset_new_defns_rejectP_meters();
    Hashtables.sethash($kw10$RESET, $new_defns_rejectP_meters$.getDynamicValue(), $sym17$RESET_NEW_DEFNS_REJECT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym16$NEW_DEFNS_REJECT_ == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_, $str19$metering_cache_for_calls_to_defn_);
    reset_new_quoted_defns_admitP_meters();
    Hashtables.sethash($kw10$RESET, $new_quoted_defns_admitP_meters$.getDynamicValue(), $sym21$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym20$NEW_QUOTED_DEFNS_ADMIT_ == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_, $str23$metering_cache_for_calls_to_defn_);
    reset_new_quoted_defns_rejectP_meters();
    Hashtables.sethash($kw10$RESET, $new_quoted_defns_rejectP_meters$.getDynamicValue(), $sym25$RESET_NEW_QUOTED_DEFNS_REJECT__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym24$NEW_QUOTED_DEFNS_REJECT_ == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym48$_NEC_DEFN_REJECTS__METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym48$_NEC_DEFN_REJECTS__METERS_, $str49$metering_cache_for_calls_to_defn_);
    reset_nec_defn_rejectsP_meters();
    Hashtables.sethash($kw10$RESET, $nec_defn_rejectsP_meters$.getDynamicValue(), $sym52$RESET_NEC_DEFN_REJECTS__METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym51$NEC_DEFN_REJECTS_ == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($nec_defn_rejectsP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    utilities_macros.register_kb_function($sym67$NEW_ADD_IFF_DEFN);
    utilities_macros.register_kb_function($sym68$NEW_REMOVE_IFF_DEFN);
    utilities_macros.register_kb_function($sym70$NEW_ADD_SUF_DEFN);
    utilities_macros.register_kb_function($sym71$NEW_REMOVE_SUF_DEFN);
    utilities_macros.register_kb_function($sym73$ADD_NEC_DEFN);
    utilities_macros.register_kb_function($sym74$REMOVE_NEC_DEFN);
    utilities_macros.register_kb_function($sym76$NEW_ADD_IFF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym77$NEW_REMOVE_IFF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym79$NEW_ADD_SUF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym80$NEW_REMOVE_SUF_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym82$ADD_NEC_QUOTED_DEFN);
    utilities_macros.register_kb_function($sym83$REMOVE_NEC_QUOTED_DEFN);
    {
      SubLObject item_var = $sym85$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym85$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_, $str86$metering_cache_for_calls_to_defn_);
    reset_new_handle_added_genl_for_suf_defns_meters();
    Hashtables.sethash($kw10$RESET, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), $sym89$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym88$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym90$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym90$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_, $str91$metering_cache_for_calls_to_defn_);
    reset_new_handle_added_genl_for_suf_quoted_defns_meters();
    Hashtables.sethash($kw10$RESET, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), $sym93$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym92$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym94$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym94$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_, $str95$metering_cache_for_calls_to_defn_);
    reset_new_handle_removed_genl_for_suf_defns_meters();
    Hashtables.sethash($kw10$RESET, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), $sym97$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym96$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    {
      SubLObject item_var = $sym98$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym98$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_, $str99$metering_cache_for_calls_to_defn_);
    reset_new_handle_removed_genl_for_suf_quoted_defns_meters();
    Hashtables.sethash($kw10$RESET, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), $sym101$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
    {
      SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
      SubLObject v_cache = NIL;
      for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
        if (($sym100$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash($kw8$FUNCTION, v_cache, UNPROVIDED))) {
          at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          Hashtables.clrhash(v_cache);
        }
      }
    }
    at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_NEW_DEFNS_ADMIT__METERS_ = makeSymbol("*NEW-DEFNS-ADMIT?-METERS*");
  public static final SubLString $str1$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-DEFNS-ADMIT?");
  public static final SubLSymbol $kw2$CALLS = makeKeyword("CALLS");
  public static final SubLSymbol $kw3$TIMES = makeKeyword("TIMES");
  public static final SubLSymbol $kw4$RESULTS = makeKeyword("RESULTS");
  public static final SubLSymbol $kw5$ARGS = makeKeyword("ARGS");
  public static final SubLSymbol $kw6$ARG_LIST = makeKeyword("ARG-LIST");
  public static final SubLList $list7 = list(makeSymbol("COL"), makeSymbol("TERM"), makeSymbol("MT"));
  public static final SubLSymbol $kw8$FUNCTION = makeKeyword("FUNCTION");
  public static final SubLSymbol $sym9$NEW_DEFNS_ADMIT_ = makeSymbol("NEW-DEFNS-ADMIT?");
  public static final SubLSymbol $kw10$RESET = makeKeyword("RESET");
  public static final SubLSymbol $sym11$RESET_NEW_DEFNS_ADMIT__METERS = makeSymbol("RESET-NEW-DEFNS-ADMIT?-METERS");
  public static final SubLSymbol $kw12$ADMITTED = makeKeyword("ADMITTED");
  public static final SubLSymbol $kw13$REJECTED = makeKeyword("REJECTED");
  public static final SubLSymbol $sym14$_NEW_DEFNS_REJECT__METERS_ = makeSymbol("*NEW-DEFNS-REJECT?-METERS*");
  public static final SubLString $str15$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-DEFNS-REJECT?");
  public static final SubLSymbol $sym16$NEW_DEFNS_REJECT_ = makeSymbol("NEW-DEFNS-REJECT?");
  public static final SubLSymbol $sym17$RESET_NEW_DEFNS_REJECT__METERS = makeSymbol("RESET-NEW-DEFNS-REJECT?-METERS");
  public static final SubLSymbol $sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_ = makeSymbol("*NEW-QUOTED-DEFNS-ADMIT?-METERS*");
  public static final SubLString $str19$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-QUOTED-DEFNS-ADMIT?");
  public static final SubLSymbol $sym20$NEW_QUOTED_DEFNS_ADMIT_ = makeSymbol("NEW-QUOTED-DEFNS-ADMIT?");
  public static final SubLSymbol $sym21$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS = makeSymbol("RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS");
  public static final SubLSymbol $sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_ = makeSymbol("*NEW-QUOTED-DEFNS-REJECT?-METERS*");
  public static final SubLString $str23$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-QUOTED-DEFNS-REJECT?");
  public static final SubLSymbol $sym24$NEW_QUOTED_DEFNS_REJECT_ = makeSymbol("NEW-QUOTED-DEFNS-REJECT?");
  public static final SubLSymbol $sym25$RESET_NEW_QUOTED_DEFNS_REJECT__METERS = makeSymbol("RESET-NEW-QUOTED-DEFNS-REJECT?-METERS");
  public static final SubLSymbol $kw26$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw27$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw28$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw30$ERROR = makeKeyword("ERROR");
  public static final SubLString $str31$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym32$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw33$CERROR = makeKeyword("CERROR");
  public static final SubLString $str34$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw35$WARN = makeKeyword("WARN");
  public static final SubLString $str36$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const37$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLString $str38$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str39$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym40$COL_QUOTED_DEFN_ADMITS_ = makeSymbol("COL-QUOTED-DEFN-ADMITS?");
  public static final SubLSymbol $sym41$COL_DEFN_ADMITS_ = makeSymbol("COL-DEFN-ADMITS?");
  public static final SubLList $list42 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"), makeSymbol("CONSTRAINT-GAF"));
  public static final SubLSymbol $kw43$AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");
  public static final SubLSymbol $kw44$MAL_ARG_WRT_QUOTED_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
  public static final SubLSymbol $kw45$MAL_ARG_WRT_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
  public static final SubLSymbol $kw46$MAL_ARG_WRT_QUOTED_IFF_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
  public static final SubLSymbol $kw47$MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");
  public static final SubLSymbol $sym48$_NEC_DEFN_REJECTS__METERS_ = makeSymbol("*NEC-DEFN-REJECTS?-METERS*");
  public static final SubLString $str49$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEC-DEFN-REJECTS?");
  public static final SubLList $list50 = list(makeSymbol("COL"), makeSymbol("TERM"), makeSymbol("MT"), makeSymbol("QUOTED?"), makeSymbol("CONSIDER-IFF-AS-NEC?"));
  public static final SubLSymbol $sym51$NEC_DEFN_REJECTS_ = makeSymbol("NEC-DEFN-REJECTS?");
  public static final SubLSymbol $sym52$RESET_NEC_DEFN_REJECTS__METERS = makeSymbol("RESET-NEC-DEFN-REJECTS?-METERS");
  public static final SubLSymbol $kw53$MAL_ARG_WRT_QUOTED_NEC_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
  public static final SubLSymbol $kw54$MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");
  public static final SubLObject $const55$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw56$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $sym57$ADMITTING_QUOTED_DEFN_ASSERTION = makeSymbol("ADMITTING-QUOTED-DEFN-ASSERTION");
  public static final SubLSymbol $sym58$ADMITTING_DEFN_ASSERTION = makeSymbol("ADMITTING-DEFN-ASSERTION");
  public static final SubLSymbol $sym59$ADMITTING_QUOTED_DEFN_ASSERTIONS = makeSymbol("ADMITTING-QUOTED-DEFN-ASSERTIONS");
  public static final SubLSymbol $sym60$ADMITTING_DEFN_ASSERTIONS = makeSymbol("ADMITTING-DEFN-ASSERTIONS");
  public static final SubLList $list61 = list(list(makeSymbol("STRINGP"), constant_handles.reader_make_constant_shell(makeString("CharacterString"))), list(makeSymbol("POSITIVE-INTEGER-P"), constant_handles.reader_make_constant_shell(makeString("PositiveInteger"))), list(makeSymbol("NON-NEGATIVE-INTEGER-P"), constant_handles.reader_make_constant_shell(makeString("NonNegativeInteger"))), list(makeSymbol("INTEGERP"), constant_handles.reader_make_constant_shell(makeString("Integer"))), list(makeSymbol("FLOATP"), constant_handles.reader_make_constant_shell(makeString("RealNumber"))), list(makeSymbol("TRUE"), constant_handles.reader_make_constant_shell(makeString("Thing"))));
  public static final SubLList $list62 = list(makeSymbol("DEFN"), makeSymbol("COLLECTION"));
  public static final SubLSymbol $kw63$ASCENDING = makeKeyword("ASCENDING");
  public static final SubLList $list64 = list(list(makeSymbol("STRINGP"), constant_handles.reader_make_constant_shell(makeString("SubLString"))), list(makeSymbol("INTEGERP"), constant_handles.reader_make_constant_shell(makeString("SubLInteger"))), list(makeSymbol("FLOATP"), constant_handles.reader_make_constant_shell(makeString("SubLRealNumber"))), list(makeSymbol("SYMBOLP"), constant_handles.reader_make_constant_shell(makeString("SubLSymbol"))), list(makeSymbol("CONSTANT-P"), constant_handles.reader_make_constant_shell(makeString("CycLConstant"))), list(makeSymbol("NART-P"), constant_handles.reader_make_constant_shell(makeString("CycLNonAtomicReifiedTerm"))), list(makeSymbol("ASSERTION-P"), constant_handles.reader_make_constant_shell(makeString("CycLAssertion"))), list(makeSymbol("TRUE"), constant_handles.reader_make_constant_shell(makeString("CycLExpression"))));
  public static final SubLList $list65 = list(makeSymbol("QUOTED-DEFN"), makeSymbol("COLLECTION"));
  public static final SubLSymbol $kw66$IFF = makeKeyword("IFF");
  public static final SubLSymbol $sym67$NEW_ADD_IFF_DEFN = makeSymbol("NEW-ADD-IFF-DEFN");
  public static final SubLSymbol $sym68$NEW_REMOVE_IFF_DEFN = makeSymbol("NEW-REMOVE-IFF-DEFN");
  public static final SubLSymbol $kw69$SUF = makeKeyword("SUF");
  public static final SubLSymbol $sym70$NEW_ADD_SUF_DEFN = makeSymbol("NEW-ADD-SUF-DEFN");
  public static final SubLSymbol $sym71$NEW_REMOVE_SUF_DEFN = makeSymbol("NEW-REMOVE-SUF-DEFN");
  public static final SubLSymbol $kw72$NEC = makeKeyword("NEC");
  public static final SubLSymbol $sym73$ADD_NEC_DEFN = makeSymbol("ADD-NEC-DEFN");
  public static final SubLSymbol $sym74$REMOVE_NEC_DEFN = makeSymbol("REMOVE-NEC-DEFN");
  public static final SubLSymbol $kw75$QIFF = makeKeyword("QIFF");
  public static final SubLSymbol $sym76$NEW_ADD_IFF_QUOTED_DEFN = makeSymbol("NEW-ADD-IFF-QUOTED-DEFN");
  public static final SubLSymbol $sym77$NEW_REMOVE_IFF_QUOTED_DEFN = makeSymbol("NEW-REMOVE-IFF-QUOTED-DEFN");
  public static final SubLSymbol $kw78$QSUF = makeKeyword("QSUF");
  public static final SubLSymbol $sym79$NEW_ADD_SUF_QUOTED_DEFN = makeSymbol("NEW-ADD-SUF-QUOTED-DEFN");
  public static final SubLSymbol $sym80$NEW_REMOVE_SUF_QUOTED_DEFN = makeSymbol("NEW-REMOVE-SUF-QUOTED-DEFN");
  public static final SubLSymbol $kw81$QNEC = makeKeyword("QNEC");
  public static final SubLSymbol $sym82$ADD_NEC_QUOTED_DEFN = makeSymbol("ADD-NEC-QUOTED-DEFN");
  public static final SubLSymbol $sym83$REMOVE_NEC_QUOTED_DEFN = makeSymbol("REMOVE-NEC-QUOTED-DEFN");
  public static final SubLSymbol $sym84$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLSymbol $sym85$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_ = makeSymbol("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*");
  public static final SubLString $str86$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");
  public static final SubLList $list87 = list(makeSymbol("SPEC"), makeSymbol("GENL"));
  public static final SubLSymbol $sym88$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS = makeSymbol("NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");
  public static final SubLSymbol $sym89$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS");
  public static final SubLSymbol $sym90$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = makeSymbol("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
  public static final SubLString $str91$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym92$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym93$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
  public static final SubLSymbol $sym94$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_ = makeSymbol("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*");
  public static final SubLString $str95$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");
  public static final SubLSymbol $sym96$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS = makeSymbol("NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");
  public static final SubLSymbol $sym97$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS");
  public static final SubLSymbol $sym98$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = makeSymbol("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
  public static final SubLString $str99$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym100$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");
  public static final SubLSymbol $sym101$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
  public static final SubLInteger $int102$400 = makeInteger(400);
  public static final SubLInteger $int103$100 = makeInteger(100);
  public static final SubLString $str104$Initializing_defns___ = makeString("Initializing defns...");
  public static final SubLObject $const105$defnIff = constant_handles.reader_make_constant_shell(makeString("defnIff"));
  public static final SubLSymbol $kw106$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw107$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const108$defnSufficient = constant_handles.reader_make_constant_shell(makeString("defnSufficient"));
  public static final SubLObject $const109$defnNecessary = constant_handles.reader_make_constant_shell(makeString("defnNecessary"));
  public static final SubLObject $const110$quotedDefnIff = constant_handles.reader_make_constant_shell(makeString("quotedDefnIff"));
  public static final SubLObject $const111$quotedDefnSufficient = constant_handles.reader_make_constant_shell(makeString("quotedDefnSufficient"));
  public static final SubLObject $const112$quotedDefnNecessary = constant_handles.reader_make_constant_shell(makeString("quotedDefnNecessary"));

  //// Initializers

  public void declareFunctions() {
    declare_defns_file();
  }

  public void initializeVariables() {
    init_defns_file();
  }

  public void runTopLevelForms() {
    setup_defns_file();
  }

}
