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
import com.cyc.cycjava_1.cycl.arg_type;
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.arity;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.at_admitted;
import com.cyc.cycjava_1.cycl.at_defns;
import com.cyc.cycjava_1.cycl.at_macros;
import com.cyc.cycjava_1.cycl.at_var_types;
import com.cyc.cycjava_1.cycl.at_vars;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.collection_defns;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.cycl_variables;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.czer_meta;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.czer_vars;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.deduction_handles;
import com.cyc.cycjava_1.cycl.deductions_high;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.disjoint_with;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.fi;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
import com.cyc.cycjava_1.cycl.kb_macros;
import com.cyc.cycjava_1.cycl.kb_mapping;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.simplifier;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.wff;
import com.cyc.cycjava_1.cycl.wff_macros;
import com.cyc.cycjava_1.cycl.wff_vars;

public  final class at_utilities extends SubLTranslatedFile {

  //// Constructor

  private at_utilities() {}
  public static final SubLFile me = new at_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.at_utilities";

  //// Definitions

  @SubL(source = "cycl/at-utilities.lisp", position = 723) 
  public static final SubLObject arg_type_mt(SubLObject relation, SubLObject args, SubLObject argnum, SubLObject mt) {
    if ((argnum.numE(TWO_INTEGER)
         && (NIL != fort_types_interface.mtP(args.first()))
         && (NIL != term.mt_designating_relationP(relation)))) {
      return args.first();
    } else {
      return mt;
    }
  }
  

  @SubL(source = "cycl/at-utilities.lisp", position = 42575) 
  public static final SubLObject violation_type(SubLObject violation) {
    if (violation.isCons()) {
      return violation.first();
    }
    return NIL;
  }



  /** is OBJECT a formula-denoting functional expression? */
  @SubL(source = "cycl/at-utilities.lisp", position = 10282) 
  public static final SubLObject formula_denoting_functionP(SubLObject object, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != el_utilities.relation_expressionP(object))) {
      return formula_functorP(cycl_utilities.nat_functor(object), mt);
    }
    return NIL;
  }


  /** does FUNCTOR a return a formula? */
  @SubL(source = "cycl/at-utilities.lisp", position = 10497) 
  public static final SubLObject formula_functorP(SubLObject functor, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != term.nautP(functor, UNPROVIDED))) {
      return formula_functorP(narts_high.find_nart(functor), mt);
    } else if ((NIL != forts.fort_p(functor))) {
      {
        SubLObject formula_functorP = NIL;
        if ((NIL == formula_functorP)) {
          {
            SubLObject csome_list_var = kb_accessors.result_isa(functor, mt);
            SubLObject result_isa = NIL;
            for (result_isa = csome_list_var.first(); (!(((NIL != formula_functorP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), result_isa = csome_list_var.first()) {
              formula_functorP = el_utilities.formula_denoting_collectionP(result_isa);
            }
          }
        }
        return formula_functorP;
      }
    }
    return NIL;
  }

  
  @SubL(source = "cycl/at-utilities.lisp", position = 37119) 
  public static final SubLObject note_at_violation(SubLObject note) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != wff_vars.wff_debugP())) {
        print_high.print(note, UNPROVIDED);
      }
      if ((NIL != note_at_violationP())) {
        at_vars.$current_at_violation$.setDynamicValue(note, thread);
        if ((NIL == recursive_violationP(note))) {
          {
            SubLObject item_var = note;
            if ((NIL == conses_high.member(item_var, at_vars.$at_violations$.getDynamicValue(thread), Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
              at_vars.$at_violations$.setDynamicValue(cons(item_var, at_vars.$at_violations$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      return at_vars.$at_violations$.getDynamicValue(thread);
    }
  }

  

  @SubL(source = "cycl/at-utilities.lisp", position = 37387) 
  public static final SubLObject recursive_violationP(SubLObject note) {
    {
      SubLObject pcase_var = note.first();
      if (pcase_var.eql($kw98$MAL_ARG_WRT_COL_DEFN)) {
        return Equality.eq(conses_high.fifth(note), $const99$CycLSentence_Assertible);
      } else if (pcase_var.eql($kw100$MAL_ARG_WRT_NEC_DEFN)) {
        return Equality.eq(conses_high.third(note), $const99$CycLSentence_Assertible);
      }
    }
    return NIL;
  }


  @SubL(source = "cycl/at-utilities.lisp", position = 36967) 
  public static final SubLObject note_at_violationP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))
             && ((NIL == at_vars.$at_violations$.getDynamicValue(thread))
              || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)))));
    }
  }


  @SubL(source = "cycl/at-utilities.lisp", position = 36833) 
  public static final SubLObject semantic_violations() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Sequences.nreverse(Sequences.cconcatenate(wff_vars.$arity_violations$.getDynamicValue(thread), new SubLObject[] {at_vars.$at_violations$.getDynamicValue(thread), czer_vars.$semantic_violations$.getDynamicValue(thread)}));
    }
  }


  /** Association list of number -> generic-arg mappings. */
  @SubL(source = "cycl/at-utilities.lisp", position = 950) 
  private static SubLSymbol $generic_arg_store$ = null;

  @SubL(source = "cycl/at-utilities.lisp", position = 2972) 
  public static final SubLObject inter_arg_isa_pred(SubLObject ind_arg, SubLObject dep_arg) {
    {
      SubLObject pcase_var = ind_arg;
      if (pcase_var.eql(ONE_INTEGER)) {
        {
          SubLObject pcase_var_1 = dep_arg;
          if (pcase_var_1.eql(TWO_INTEGER)) {
            return $const8$interArgIsa1_2;
          } else if (pcase_var_1.eql(THREE_INTEGER)) {
            return $const9$interArgIsa1_3;
          } else if (pcase_var_1.eql(FOUR_INTEGER)) {
            return $const10$interArgIsa1_4;
          } else if (pcase_var_1.eql(FIVE_INTEGER)) {
            return $const11$interArgIsa1_5;
          } else {
            el_utilities.el_error(THREE_INTEGER, $str12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
          }
        }
      } else if (pcase_var.eql(TWO_INTEGER)) {
        {
          SubLObject pcase_var_2 = dep_arg;
          if (pcase_var_2.eql(ONE_INTEGER)) {
            return $const13$interArgIsa2_1;
          } else if (pcase_var_2.eql(THREE_INTEGER)) {
            return $const14$interArgIsa2_3;
          } else if (pcase_var_2.eql(FOUR_INTEGER)) {
            return $const15$interArgIsa2_4;
          } else if (pcase_var_2.eql(FIVE_INTEGER)) {
            return $const16$interArgIsa2_5;
          } else {
            el_utilities.el_error(THREE_INTEGER, $str12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
          }
        }
      } else if (pcase_var.eql(THREE_INTEGER)) {
        {
          SubLObject pcase_var_3 = dep_arg;
          if (pcase_var_3.eql(ONE_INTEGER)) {
            return $const17$interArgIsa3_1;
          } else if (pcase_var_3.eql(TWO_INTEGER)) {
            return $const18$interArgIsa3_2;
          } else if (pcase_var_3.eql(FOUR_INTEGER)) {
            return $const19$interArgIsa3_4;
          } else if (pcase_var_3.eql(FIVE_INTEGER)) {
            return $const20$interArgIsa3_5;
          } else {
            el_utilities.el_error(THREE_INTEGER, $str12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
          }
        }
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        {
          SubLObject pcase_var_4 = dep_arg;
          if (pcase_var_4.eql(ONE_INTEGER)) {
            return $const21$interArgIsa4_1;
          } else if (pcase_var_4.eql(TWO_INTEGER)) {
            return $const22$interArgIsa4_2;
          } else if (pcase_var_4.eql(THREE_INTEGER)) {
            return $const23$interArgIsa4_3;
          } else if (pcase_var_4.eql(FIVE_INTEGER)) {
            return $const24$interArgIsa4_5;
          } else {
            el_utilities.el_error(THREE_INTEGER, $str12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
          }
        }
      } else if (pcase_var.eql(FIVE_INTEGER)) {
        {
          SubLObject pcase_var_5 = dep_arg;
          if (pcase_var_5.eql(ONE_INTEGER)) {
            return $const25$interArgIsa5_1;
          } else if (pcase_var_5.eql(TWO_INTEGER)) {
            return $const26$interArgIsa5_2;
          } else if (pcase_var_5.eql(THREE_INTEGER)) {
            return $const27$interArgIsa5_3;
          } else if (pcase_var_5.eql(FOUR_INTEGER)) {
            return $const28$interArgIsa5_4;
          } else {
            el_utilities.el_error(THREE_INTEGER, $str12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
          }
        }
      } else {
        el_utilities.el_error(THREE_INTEGER, $str12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** Returns the appropriate inter-arg-isa predicate for constraining the inverse of IND-ARG and DEP-ARG . */
  @SubL(source = "cycl/at-utilities.lisp", position = 4220) 
  public static final SubLObject inter_arg_isa_inverse(SubLObject ind_arg, SubLObject dep_arg) {
    if (((NIL != subl_promotions.memberP(ind_arg, $list29, UNPROVIDED, UNPROVIDED))
         && (NIL != subl_promotions.memberP(dep_arg, $list29, UNPROVIDED, UNPROVIDED)))) {
      return inter_arg_isa_pred(dep_arg, ind_arg);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 7825) 
  public static final SubLObject implication_opP(SubLObject symbol) {
    return subl_promotions.memberP(symbol, czer_vars.$implication_operators$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED);
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 7947) 
  public static final SubLObject logical_opP(SubLObject symbol) {
    return makeBoolean(((NIL != fort_types_interface.isa_logical_connectiveP(symbol, mt_vars.$anect_mt$.getGlobalValue()))
          || (NIL != fort_types_interface.isa_quantifierP(symbol,mt_vars.$anect_mt$.getGlobalValue()))));
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 8181) 
  public static final SubLObject initialize_all_arg_type_predicate_caches() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject count = ZERO_INTEGER;
        {
          SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding(thread);
          try {
            utilities_macros.$noting_progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.noting_progress_preamble($str37$Initializing_all_arg_type_predica);
            count = Numbers.add(count, initialize_some_inter_arg_isa_assertion_somewhere_cache());
            count = Numbers.add(count, initialize_some_inter_arg_format_assertion_somewhere_cache());
            utilities_macros.noting_progress_postamble();
          } finally {
            utilities_macros.$noting_progress_start_time$.rebind(_prev_bind_0, thread);
          }
        }
        return count;
      }
    }
  }


  @SubL(source = "cycl/at-utilities.lisp", position = 8540) 
  public static final SubLObject clear_all_arg_type_predicate_caches() {
    clear_some_inter_arg_isa_assertion_somewhere_cache();
    clear_some_inter_arg_format_assertion_somewhere_cache();
    return NIL;
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 22863) 
  private static SubLSymbol $some_inter_arg_isa_assertion_somewhere_cache$ = null;

  @SubL(source = "cycl/at-utilities.lisp", position = 23344) 
  public static final SubLObject inter_arg_isa_cache_initializedP() {
    return set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 23490) 
  public static final SubLObject some_inter_arg_isa_assertion_somewhere_cache_add_int(SubLObject reln) {
    return set.set_add(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 24758) 
  public static final SubLObject clear_some_inter_arg_isa_assertion_somewhere_cache() {
    if ((NIL != set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue()))) {
      set.clear_set($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    } else {
      $some_inter_arg_isa_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQ, UNPROVIDED));
    }
    return NIL;
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 25067) 
  public static final SubLObject initialize_some_inter_arg_isa_assertion_somewhere_cache() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      clear_some_inter_arg_isa_assertion_somewhere_cache();
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym59$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const60$EverythingPSC, thread);
          {
            SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            utilities_macros.$progress_note$.setDynamicValue($str61$Initializing___interArgIsa_cache, thread);
            utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.setDynamicValue(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            {
              SubLObject _prev_bind_0_77 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
              SubLObject _prev_bind_1_78 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
              SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
              SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
              try {
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                {
                  SubLObject csome_list_var = list_var;
                  SubLObject ind_argnum = NIL;
                  for (ind_argnum = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), ind_argnum = csome_list_var.first()) {
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    {
                      SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                      SubLObject dep_argnum = NIL;
                      for (dep_argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), dep_argnum = cdolist_list_var.first()) {
                        if ((!(ind_argnum.eql(dep_argnum)))) {
                          {
                            SubLObject inter_arg_isa_pred = inter_arg_isa_pred(ind_argnum, dep_argnum);
                            if ((NIL != inter_arg_isa_pred)) {
                              {
                                SubLObject pred_var = inter_arg_isa_pred;
                                if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var))) {
                                  {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while ((NIL == done_var)) {
                                      {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean((token_var != final_index_spec));
                                        if ((NIL != valid)) {
                                          {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw62$GAF, $kw57$TRUE, NIL);
                                              {
                                                SubLObject done_var_79 = NIL;
                                                SubLObject token_var_80 = NIL;
                                                while ((NIL == done_var_79)) {
                                                  {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_80);
                                                    SubLObject valid_81 = makeBoolean((token_var_80 != ass));
                                                    if ((NIL != valid_81)) {
                                                      {
                                                        SubLObject reln = assertions_high.gaf_arg1(ass);
                                                        some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
                                                      }
                                                    }
                                                    done_var_79 = makeBoolean((NIL == valid_81));
                                                  }
                                                }
                                              }
                                            } finally {
                                              {
                                                SubLObject _prev_bind_0_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                  if ((NIL != final_index_iterator)) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                  }
                                                } finally {
                                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_82, thread);
                                                }
                                              }
                                            }
                                          }
                                        }
                                        done_var = makeBoolean((NIL == valid));
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
                utilities_macros.noting_percent_progress_postamble();
              } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_78, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_77, thread);
              }
            }
          }
        } finally {
          mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
          mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
      }
      return set.set_size($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 25731) 
  public static final SubLObject some_inter_arg_isa_assertion_somewhereP(SubLObject reln) {
    return set.set_memberP(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 25870) 
  public static final SubLObject some_inter_arg_isa_constraint_somewhereP(SubLObject reln) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject found_oneP = NIL;
        if ((NIL != fort_types_interface.predicateP(reln))) {
          if ((NIL == found_oneP)) {
            {
              SubLObject module = sbhl_module_vars.get_sbhl_module($const63$genlPreds);
              SubLObject node_var = reln;
              SubLObject deck_type = (($kw64$DEPTH == $kw64$DEPTH) ? ((SubLObject) $kw65$STACK) : $kw66$QUEUE);
              SubLObject recur_deck = deck.create_deck(deck_type);
              SubLObject node_and_predicate_mode = NIL;
              {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                  sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                  {
                    SubLObject tv_var = NIL;
                    {
                      SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw68$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw71$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2099");
                                } else if (pcase_var.eql($kw73$WARN)) {
                                  Errors.warn($str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str74$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_84 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                          SubLObject _prev_bind_1_85 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                            if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                              {
                                SubLObject _prev_bind_0_86 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                SubLObject _prev_bind_1_87 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                SubLObject _prev_bind_2_88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                  sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                  sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                  node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p());
                                  while (((NIL != node_and_predicate_mode)
                                       && (NIL == found_oneP))) {
                                    {
                                      SubLObject node_var_89 = node_and_predicate_mode.first();
                                      SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                      SubLObject genl_pred = node_var_89;
                                      {
                                        SubLObject _prev_bind_0_90 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                          {
                                            SubLObject inverse_mode = predicate_mode;
                                            if ((NIL != some_inter_arg_isa_assertion_somewhereP(genl_pred))) {
                                              found_oneP = T;
                                            }
                                            {
                                              SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                              SubLObject rest = NIL;
                                              for (rest = accessible_modules; (!(((NIL != found_oneP)
                                                    || (NIL == rest)))); rest = rest.rest()) {
                                                {
                                                  SubLObject module_var = rest.first();
                                                  {
                                                    SubLObject _prev_bind_0_91 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                      sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                      {
                                                        SubLObject node = function_terms.naut_to_nart(node_var_89);
                                                        if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                          {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if ((NIL != d_link)) {
                                                              {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if ((NIL != mt_links)) {
                                                                  {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while ((!(((NIL != found_oneP)
                                                                          || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                      thread.resetMultipleValues();
                                                                      {
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                          {
                                                                            SubLObject _prev_bind_0_93 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                              sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                              {
                                                                                SubLObject iteration_state_94 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                while ((!(((NIL != found_oneP)
                                                                                      || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_94)))))) {
                                                                                  thread.resetMultipleValues();
                                                                                  {
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_94);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                      {
                                                                                        SubLObject _prev_bind_0_95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                          {
                                                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9234")) : link_nodes);
                                                                                            SubLObject rest_96 = NIL;
                                                                                            for (rest_96 = new_list; (!(((NIL != found_oneP)
                                                                                                  || (NIL == rest_96)))); rest_96 = rest_96.rest()) {
                                                                                              {
                                                                                                SubLObject node_vars_link_node = rest_96.first();
                                                                                                if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                  deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } finally {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_95, thread);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    iteration_state_94 = dictionary_contents.do_dictionary_contents_next(iteration_state_94);
                                                                                  }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_94);
                                                                              }
                                                                            } finally {
                                                                              sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_93, thread);
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
                                                              sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str75$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                          }
                                                        } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                          {
                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9235")) : Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2509"));
                                                            SubLObject rest_97 = NIL;
                                                            for (rest_97 = new_list; (!(((NIL != found_oneP)
                                                                  || (NIL == rest_97)))); rest_97 = rest_97.rest()) {
                                                              {
                                                                SubLObject generating_fn = rest_97.first();
                                                                {
                                                                  SubLObject _prev_bind_0_98 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                  try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    {
                                                                      SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                      SubLObject new_list_99 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9236")) : link_nodes);
                                                                      SubLObject rest_100 = NIL;
                                                                      for (rest_100 = new_list_99; (!(((NIL != found_oneP)
                                                                            || (NIL == rest_100)))); rest_100 = rest_100.rest()) {
                                                                        {
                                                                          SubLObject node_vars_link_node = rest_100.first();
                                                                          if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_98, thread);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_92, thread);
                                                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_91, thread);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_90, thread);
                                        }
                                      }
                                    }
                                    node_and_predicate_mode = deck.deck_pop(recur_deck);
                                  }
                                } finally {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_88, thread);
                                  sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_87, thread);
                                  sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_86, thread);
                                }
                              }
                            } else {
                              sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str76$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                          } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_85, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_84, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_83, thread);
                      }
                    }
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                  }
                } finally {
                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        } else {
          found_oneP = some_inter_arg_isa_assertion_somewhereP(reln);
        }
        return found_oneP;
      }
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 26341) 
  private static SubLSymbol $some_inter_arg_format_assertion_somewhere_cache$ = null;

  @SubL(source = "cycl/at-utilities.lisp", position = 26441) 
  public static final SubLObject inter_arg_format_cache_initializedP() {
    return set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 27909) 
  public static final SubLObject clear_some_inter_arg_format_assertion_somewhere_cache() {
    if ((NIL != set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue()))) {
      set.clear_set($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    } else {
      $some_inter_arg_format_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQ, UNPROVIDED));
    }
    return NIL;
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 28230) 
  public static final SubLObject initialize_some_inter_arg_format_assertion_somewhere_cache() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      clear_some_inter_arg_format_assertion_somewhere_cache();
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym59$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const60$EverythingPSC, thread);
          {
            SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            utilities_macros.$progress_note$.setDynamicValue($str78$Initializing___interArgFormat_cac, thread);
            utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.setDynamicValue(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            {
              SubLObject _prev_bind_0_102 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
              SubLObject _prev_bind_1_103 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
              SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
              SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
              try {
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                {
                  SubLObject csome_list_var = list_var;
                  SubLObject ind_argnum = NIL;
                  for (ind_argnum = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), ind_argnum = csome_list_var.first()) {
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    {
                      SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                      SubLObject dep_argnum = NIL;
                      for (dep_argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), dep_argnum = cdolist_list_var.first()) {
                        {
                          SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                          if ((NIL != inter_arg_format_pred)) {
                            {
                              SubLObject pred_var = inter_arg_format_pred;
                              if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var))) {
                                {
                                  SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                  SubLObject done_var = NIL;
                                  SubLObject token_var = NIL;
                                  while ((NIL == done_var)) {
                                    {
                                      SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                      SubLObject valid = makeBoolean((token_var != final_index_spec));
                                      if ((NIL != valid)) {
                                        {
                                          SubLObject final_index_iterator = NIL;
                                          try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw62$GAF, $kw57$TRUE, NIL);
                                            {
                                              SubLObject done_var_104 = NIL;
                                              SubLObject token_var_105 = NIL;
                                              while ((NIL == done_var_104)) {
                                                {
                                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_105);
                                                  SubLObject valid_106 = makeBoolean((token_var_105 != ass));
                                                  if ((NIL != valid_106)) {
                                                    {
                                                      SubLObject reln = assertions_high.gaf_arg1(ass);
                                                      Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7243");
                                                    }
                                                  }
                                                  done_var_104 = makeBoolean((NIL == valid_106));
                                                }
                                              }
                                            }
                                          } finally {
                                            {
                                              SubLObject _prev_bind_0_107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                              try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != final_index_iterator)) {
                                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                              } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_107, thread);
                                              }
                                            }
                                          }
                                        }
                                      }
                                      done_var = makeBoolean((NIL == valid));
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
                utilities_macros.noting_percent_progress_postamble();
              } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_103, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_102, thread);
              }
            }
          }
        } finally {
          mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
          mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
      }
      return set.set_size($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 28879) 
  public static final SubLObject some_inter_arg_format_assertion_somewhereP(SubLObject reln) {
    return set.set_memberP(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 29024) 
  public static final SubLObject some_inter_arg_format_constraint_somewhereP(SubLObject reln) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject found_oneP = NIL;
        if ((NIL != fort_types_interface.predicateP(reln))) {
          if ((NIL == found_oneP)) {
            {
              SubLObject module = sbhl_module_vars.get_sbhl_module($const63$genlPreds);
              SubLObject node_var = reln;
              SubLObject deck_type = (($kw64$DEPTH == $kw64$DEPTH) ? ((SubLObject) $kw65$STACK) : $kw66$QUEUE);
              SubLObject recur_deck = deck.create_deck(deck_type);
              SubLObject node_and_predicate_mode = NIL;
              {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                  sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                  {
                    SubLObject tv_var = NIL;
                    {
                      SubLObject _prev_bind_0_108 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw68$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw71$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2100");
                                } else if (pcase_var.eql($kw73$WARN)) {
                                  Errors.warn($str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str74$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                          SubLObject _prev_bind_1_110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                            if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                              {
                                SubLObject _prev_bind_0_111 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                SubLObject _prev_bind_1_112 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                SubLObject _prev_bind_2_113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                  sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                  sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                  node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p());
                                  while (((NIL != node_and_predicate_mode)
                                       && (NIL == found_oneP))) {
                                    {
                                      SubLObject node_var_114 = node_and_predicate_mode.first();
                                      SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                      SubLObject genl_pred = node_var_114;
                                      {
                                        SubLObject _prev_bind_0_115 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                          {
                                            SubLObject inverse_mode = predicate_mode;
                                            if ((NIL != some_inter_arg_format_assertion_somewhereP(genl_pred))) {
                                              found_oneP = T;
                                            }
                                            {
                                              SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                              SubLObject rest = NIL;
                                              for (rest = accessible_modules; (!(((NIL != found_oneP)
                                                    || (NIL == rest)))); rest = rest.rest()) {
                                                {
                                                  SubLObject module_var = rest.first();
                                                  {
                                                    SubLObject _prev_bind_0_116 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                      sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                      {
                                                        SubLObject node = function_terms.naut_to_nart(node_var_114);
                                                        if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                          {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if ((NIL != d_link)) {
                                                              {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if ((NIL != mt_links)) {
                                                                  {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while ((!(((NIL != found_oneP)
                                                                          || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                      thread.resetMultipleValues();
                                                                      {
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                          {
                                                                            SubLObject _prev_bind_0_118 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                              sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                              {
                                                                                SubLObject iteration_state_119 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                while ((!(((NIL != found_oneP)
                                                                                      || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_119)))))) {
                                                                                  thread.resetMultipleValues();
                                                                                  {
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_119);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                      {
                                                                                        SubLObject _prev_bind_0_120 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                          {
                                                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9237")) : link_nodes);
                                                                                            SubLObject rest_121 = NIL;
                                                                                            for (rest_121 = new_list; (!(((NIL != found_oneP)
                                                                                                  || (NIL == rest_121)))); rest_121 = rest_121.rest()) {
                                                                                              {
                                                                                                SubLObject node_vars_link_node = rest_121.first();
                                                                                                if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                  deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } finally {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_120, thread);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    iteration_state_119 = dictionary_contents.do_dictionary_contents_next(iteration_state_119);
                                                                                  }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_119);
                                                                              }
                                                                            } finally {
                                                                              sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_118, thread);
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
                                                              sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str75$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                          }
                                                        } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                          {
                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9238")) : Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2511"));
                                                            SubLObject rest_122 = NIL;
                                                            for (rest_122 = new_list; (!(((NIL != found_oneP)
                                                                  || (NIL == rest_122)))); rest_122 = rest_122.rest()) {
                                                              {
                                                                SubLObject generating_fn = rest_122.first();
                                                                {
                                                                  SubLObject _prev_bind_0_123 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                  try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    {
                                                                      SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                      SubLObject new_list_124 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9239")) : link_nodes);
                                                                      SubLObject rest_125 = NIL;
                                                                      for (rest_125 = new_list_124; (!(((NIL != found_oneP)
                                                                            || (NIL == rest_125)))); rest_125 = rest_125.rest()) {
                                                                        {
                                                                          SubLObject node_vars_link_node = rest_125.first();
                                                                          if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_123, thread);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_117, thread);
                                                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_116, thread);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_115, thread);
                                        }
                                      }
                                    }
                                    node_and_predicate_mode = deck.deck_pop(recur_deck);
                                  }
                                } finally {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_113, thread);
                                  sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_112, thread);
                                  sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_111, thread);
                                }
                              }
                            } else {
                              sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str76$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                          } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_110, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_109, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_108, thread);
                      }
                    }
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                  }
                } finally {
                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        } else {
          found_oneP = some_inter_arg_format_assertion_somewhereP(reln);
        }
        return found_oneP;
      }
    }
  }

  /** Returns the arg-type constraint argnum of the arg constraint predicate PRED.
   @owner pace
   @note assumes that #$ArgTypeBinaryPredicate and #$ArgTypeTernaryPredicate are ANECTs */
  @SubL(source = "cycl/at-utilities.lisp", position = 30625) 
  public static final SubLObject constraint_pred_constraint_argnum(SubLObject pred) {
    if (((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))
        || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))
        || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))
        || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)))) {
      return TWO_INTEGER;
    } else if (((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))
        || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))
        || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))
        || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)))) {
      return THREE_INTEGER;
    } else if (((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29137"))
        || (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29135"))
        || (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29133")))) {
      return TWO_INTEGER;
    } else if (((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29138"))
        || (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29136"))
        || (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29134")))) {
      return THREE_INTEGER;
    } else {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7148");
    }
    return NIL;
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 32713) 
  public static final SubLObject gather_at_data_assertion(SubLObject assertion, SubLObject type, SubLObject v_term) {
    if ((type == UNPROVIDED)) {
      type = at_vars.$at_constraint_type$.getDynamicValue();
    }
    if ((v_term == UNPROVIDED)) {
      v_term = at_vars.$at_arg$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread))) {
        gather_at_assertion(assertion, type, v_term);
        if (control_vars.$mapping_gather_arg$.getDynamicValue(thread).isInteger()) {
          {
            SubLObject constraint = assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread));
            if ((NIL != forts.fort_p(constraint))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7182");
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 33814) 
  public static final SubLObject gather_at_assertion(SubLObject constraint, SubLObject type, SubLObject v_term) {
    if ((type == UNPROVIDED)) {
      type = $kw47$ISA;
    }
    if ((v_term == UNPROVIDED)) {
      v_term = at_vars.$at_arg$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != at_vars.$gather_at_assertionsP$.getDynamicValue(thread))
           && ((NIL == at_vars.$at_profile_term$.getDynamicValue(thread))
            || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread))))) {
        {
          SubLObject pcase_var = type;
          if (pcase_var.eql($kw47$ISA)) {
            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_assertions$.getDynamicValue(thread));
          } else if (pcase_var.eql($kw50$GENLS)) {
            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_assertions$.getDynamicValue(thread));
          } else if (pcase_var.eql($kw82$FORMAT)) {
            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_assertions$.getDynamicValue(thread));
          } else if (pcase_var.eql($kw83$DIFFERENT)) {
            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 34448) 
  public static final SubLObject at_finishedP(SubLObject at_violationsP) {
    if ((at_violationsP == UNPROVIDED)) {
      at_violationsP = at_vars.$at_result$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != at_violationsP)
             && (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))
             && (NIL == at_vars.$gather_at_constraintsP$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 37613) 
  public static final SubLObject reset_at_violations(SubLObject do_itP) {
    if ((do_itP == UNPROVIDED)) {
      do_itP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != do_itP)) {
        at_vars.$at_violations$.setDynamicValue(NIL, thread);
      } else if ((NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
      } else if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
        at_vars.$at_violations$.setDynamicValue(NIL, thread);
      }
      return at_vars.$at_violations$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 37832) 
  public static final SubLObject reset_arity_violations(SubLObject do_itP) {
    if ((do_itP == UNPROVIDED)) {
      do_itP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != do_itP)) {
        wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
      } else if ((NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
      } else if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
        wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 38047) 
  public static final SubLObject reset_semantic_violations(SubLObject do_itP) {
    if ((do_itP == UNPROVIDED)) {
      do_itP = NIL;
    }
    czer_vars.$semantic_violations$.setDynamicValue(NIL);
    reset_at_violations(do_itP);
    reset_arity_violations(do_itP);
    return NIL;
  }

  @SubL(source = "cycl/at-utilities.lisp", position = 38225) 
  public static final SubLObject reset_at_state() {
    reset_arity_violations(T);
    reset_at_violations(T);
    return NIL;
  }

  /** max number of mts that will be considered while trying to suggest mts in which non-wf formula might be wf */
  @SubL(source = "cycl/at-utilities.lisp", position = 42702) 
  private static SubLSymbol $mts_cutoff_for_mts_accommodating_formula_wrt_types$ = null;

  @SubL(source = "cycl/at-utilities.lisp", position = 44430) 
  private static SubLSymbol $max_floor_mts_of_nat_exceptions$ = null;

  @SubL(source = "cycl/at-utilities.lisp", position = 49043) 
  private static SubLSymbol $cached_max_floor_mts_of_nat_caching_state$ = null;

  @SubL(source = "cycl/at-utilities.lisp", position = 49726) 
  private static SubLSymbol $max_floor_mts_of_nat_recursionP$ = null;

  public static final SubLObject declare_at_utilities_file() {
    //declareFunction(myName, "arg_n_predicate", "ARG-N-PREDICATE", 1, 0, false);
    declareFunction(myName, "arg_type_mt", "ARG-TYPE-MT", 4, 0, false);
    //declareFunction(myName, "find_generic_arg_by_id", "FIND-GENERIC-ARG-BY-ID", 1, 0, false);
    //declareFunction(myName, "find_generic_arg_id", "FIND-GENERIC-ARG-ID", 1, 0, false);
    //declareFunction(myName, "store_generic_arg", "STORE-GENERIC-ARG", 2, 0, false);
    //declareFunction(myName, "stored_generic_arg_p", "STORED-GENERIC-ARG-P", 1, 0, false);
    //declareFunction(myName, "get_generic_arg", "GET-GENERIC-ARG", 1, 0, false);
    //declareFunction(myName, "generic_arg_num", "GENERIC-ARG-NUM", 1, 0, false);
    //declareFunction(myName, "generic_argP", "GENERIC-ARG?", 1, 0, false);
    declareFunction(myName, "inter_arg_isa_pred", "INTER-ARG-ISA-PRED", 2, 0, false);
    declareFunction(myName, "inter_arg_isa_inverse", "INTER-ARG-ISA-INVERSE", 2, 0, false);
    //declareFunction(myName, "inter_arg_not_isa_pred", "INTER-ARG-NOT-ISA-PRED", 2, 0, false);
    //declareFunction(myName, "inter_arg_not_isa_inverse", "INTER-ARG-NOT-ISA-INVERSE", 2, 0, false);
    //declareFunction(myName, "inter_arg_genl_pred", "INTER-ARG-GENL-PRED", 2, 0, false);
    //declareFunction(myName, "inter_arg_genl_inverse", "INTER-ARG-GENL-INVERSE", 2, 0, false);
    declareFunction(myName, "implication_opP", "IMPLICATION-OP?", 1, 0, false);
    declareFunction(myName, "logical_opP", "LOGICAL-OP?", 1, 0, false);
    //declareFunction(myName, "truth_functionP", "TRUTH-FUNCTION?", 1, 0, false);
    declareFunction(myName, "initialize_all_arg_type_predicate_caches", "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
    declareFunction(myName, "clear_all_arg_type_predicate_caches", "CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
    //declareFunction(myName, "arg_isa_binary_predP", "ARG-ISA-BINARY-PRED?", 1, 1, false);
    //declareFunction(myName, "arg_isa_ternary_predP", "ARG-ISA-TERNARY-PRED?", 1, 1, false);
    //declareFunction(myName, "arg_isa_predicateP", "ARG-ISA-PREDICATE?", 1, 1, false);
    //declareFunction(myName, "arg_genl_binary_predP", "ARG-GENL-BINARY-PRED?", 1, 1, false);
    //declareFunction(myName, "arg_genl_ternary_predP", "ARG-GENL-TERNARY-PRED?", 1, 1, false);
    //declareFunction(myName, "arg_genl_predicateP", "ARG-GENL-PREDICATE?", 1, 1, false);
    //declareFunction(myName, "formula_denoting_functionP", "FORMULA-DENOTING-FUNCTION?", 1, 1, false);
    //declareFunction(myName, "formula_functorP", "FORMULA-FUNCTOR?", 1, 1, false);
    //declareFunction(myName, "sentence_denoting_functionP", "SENTENCE-DENOTING-FUNCTION?", 1, 1, false);
    //declareFunction(myName, "sentence_functorP", "SENTENCE-FUNCTOR?", 1, 1, false);
    //declareFunction(myName, "argn_type_levelP", "ARGN-TYPE-LEVEL?", 2, 1, false);
    //declareFunction(myName, "min_genl_preds_admitting_fort_as_arg", "MIN-GENL-PREDS-ADMITTING-FORT-AS-ARG", 3, 1, false);
    //declareFunction(myName, "forts_admitted_as_arg", "FORTS-ADMITTED-AS-ARG", 3, 3, false);
    //declareFunction(myName, "min_implicit_types", "MIN-IMPLICIT-TYPES", 1, 1, false);
    //declareFunction(myName, "term_requires_isa_in_relations", "TERM-REQUIRES-ISA-IN-RELATIONS", 2, 2, false);
    //declareFunction(myName, "term_requires_genl_in_relations", "TERM-REQUIRES-GENL-IN-RELATIONS", 2, 2, false);
    //declareFunction(myName, "term_requires_types_in_relations", "TERM-REQUIRES-TYPES-IN-RELATIONS", 2, 2, false);
    //declareFunction(myName, "term_requires_isa_in_clause", "TERM-REQUIRES-ISA-IN-CLAUSE", 2, 1, false);
    //declareFunction(myName, "term_requires_isa_in_relation", "TERM-REQUIRES-ISA-IN-RELATION", 2, 1, false);
    //declareFunction(myName, "term_requires_isa_in_formula", "TERM-REQUIRES-ISA-IN-FORMULA", 2, 2, false);
    //declareFunction(myName, "term_requires_genl_in_relation", "TERM-REQUIRES-GENL-IN-RELATION", 2, 1, false);
    //declareFunction(myName, "get_sub_expression_for_term_position", "GET-SUB-EXPRESSION-FOR-TERM-POSITION", 2, 0, false);
    //declareFunction(myName, "term_position_requires_types_in_relation", "TERM-POSITION-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
    //declareFunction(myName, "term_requires_types_in_relation", "TERM-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
    //declareFunction(myName, "arg_requires_isa_in_relation", "ARG-REQUIRES-ISA-IN-RELATION", 2, 1, false);
    //declareFunction(myName, "pred_arg_isa_requires_other_arg_isa", "PRED-ARG-ISA-REQUIRES-OTHER-ARG-ISA", 3, 1, false);
    //declareFunction(myName, "make_el_query_literal", "MAKE-EL-QUERY-LITERAL", 1, 0, false);
    //declareFunction(myName, "arg_isa_applicable_gafs", "ARG-ISA-APPLICABLE-GAFS", 1, 0, false);
    //declareFunction(myName, "gather_via_map_pred_index", "GATHER-VIA-MAP-PRED-INDEX", 1, 0, false);
    declareFunction(myName, "inter_arg_isa_cache_initializedP", "INTER-ARG-ISA-CACHE-INITIALIZED?", 0, 0, false);
    declareFunction(myName, "some_inter_arg_isa_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_isa_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_isa_assertion_somewhere_cache_add", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_isa_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
    declareFunction(myName, "clear_some_inter_arg_isa_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
    declareFunction(myName, "initialize_some_inter_arg_isa_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
    declareFunction(myName, "some_inter_arg_isa_assertion_somewhereP", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "some_inter_arg_isa_constraint_somewhereP", "SOME-INTER-ARG-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "inter_arg_format_cache_initializedP", "INTER-ARG-FORMAT-CACHE-INITIALIZED?", 0, 0, false);
    //declareFunction(myName, "some_inter_arg_format_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_format_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_format_assertion_somewhere_cache_add", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_format_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
    declareFunction(myName, "clear_some_inter_arg_format_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
    declareFunction(myName, "initialize_some_inter_arg_format_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
    declareFunction(myName, "some_inter_arg_format_assertion_somewhereP", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "some_inter_arg_format_constraint_somewhereP", "SOME-INTER-ARG-FORMAT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "reln_permits_generic_arg_variablesP", "RELN-PERMITS-GENERIC-ARG-VARIABLES?", 2, 0, false);
    //declareFunction(myName, "reln_permits_keyword_variablesP", "RELN-PERMITS-KEYWORD-VARIABLES?", 2, 0, false);
    //declareFunction(myName, "reln_constrained_to_be_collectionP", "RELN-CONSTRAINED-TO-BE-COLLECTION?", 3, 0, false);
    declareFunction(myName, "constraint_pred_constraint_argnum", "CONSTRAINT-PRED-CONSTRAINT-ARGNUM", 1, 0, false);
    //declareFunction(myName, "gaf_arg_type_constraint", "GAF-ARG-TYPE-CONSTRAINT", 1, 0, false);
    //declareFunction(myName, "gather_at_data", "GATHER-AT-DATA", 2, 2, false);
    declareFunction(myName, "gather_at_data_assertion", "GATHER-AT-DATA-ASSERTION", 1, 2, false);
    //declareFunction(myName, "gather_at_constraint", "GATHER-AT-CONSTRAINT", 1, 2, false);
    declareFunction(myName, "gather_at_assertion", "GATHER-AT-ASSERTION", 1, 2, false);
    declareFunction(myName, "at_finishedP", "AT-FINISHED?", 0, 1, false);
    //declareFunction(myName, "at_finished", "AT-FINISHED", 0, 1, false);
    //declareFunction(myName, "at_mapping_finished", "AT-MAPPING-FINISHED", 0, 0, false);
    //declareFunction(myName, "at_handle_mal_constraint", "AT-HANDLE-MAL-CONSTRAINT", 1, 0, false);
    //declareFunction(myName, "at_mal_arg_msg", "AT-MAL-ARG-MSG", 1, 0, false);
    //declareFunction(myName, "predicate_isa_violation_data", "PREDICATE-ISA-VIOLATION-DATA", 1, 1, false);
    //declareFunction(myName, "meta_predicate_violation_data", "META-PREDICATE-VIOLATION-DATA", 1, 1, false);
    //declareFunction(myName, "semantic_violations", "SEMANTIC-VIOLATIONS", 0, 0, false);
    //declareFunction(myName, "note_at_violationP", "NOTE-AT-VIOLATION?", 0, 0, false);
    //declareFunction(myName, "note_at_violation", "NOTE-AT-VIOLATION", 1, 0, false);
    //declareFunction(myName, "recursive_violationP", "RECURSIVE-VIOLATION?", 1, 0, false);
    declareFunction(myName, "reset_at_violations", "RESET-AT-VIOLATIONS", 0, 1, false);
    declareFunction(myName, "reset_arity_violations", "RESET-ARITY-VIOLATIONS", 0, 1, false);
    declareFunction(myName, "reset_semantic_violations", "RESET-SEMANTIC-VIOLATIONS", 0, 1, false);
    declareFunction(myName, "reset_at_state", "RESET-AT-STATE", 0, 0, false);
    //declareFunction(myName, "suggest_formula_fix_for_at_violation", "SUGGEST-FORMULA-FIX-FOR-AT-VIOLATION", 2, 0, false);
    //declareFunction(myName, "assertion_arg_violations_among", "ASSERTION-ARG-VIOLATIONS-AMONG", 1, 0, false);
    //declareFunction(myName, "sef_violations_among", "SEF-VIOLATIONS-AMONG", 1, 0, false);
    //declareFunction(myName, "predicate_violations_among", "PREDICATE-VIOLATIONS-AMONG", 1, 0, false);
    //declareFunction(myName, "assertion_arg_violationP", "ASSERTION-ARG-VIOLATION?", 1, 0, false);
    //declareFunction(myName, "assertion_collectionP", "ASSERTION-COLLECTION?", 1, 1, false);
    //declareFunction(myName, "sef_violationP", "SEF-VIOLATION?", 1, 0, false);
    //declareFunction(myName, "predicate_violationP", "PREDICATE-VIOLATION?", 1, 0, false);
    //declareFunction(myName, "assertion_arg_violation_fix", "ASSERTION-ARG-VIOLATION-FIX", 1, 0, false);
    //declareFunction(myName, "strip_mt_literals", "STRIP-MT-LITERALS", 1, 1, false);
    //declareFunction(myName, "sef_violation_fix", "SEF-VIOLATION-FIX", 1, 0, false);
    //declareFunction(myName, "predicate_violation_fix", "PREDICATE-VIOLATION-FIX", 1, 0, false);
    //declareFunction(myName, "violation_type", "VIOLATION-TYPE", 1, 0, false);
    //declareFunction(myName, "mts_accommodating_formula_wrt_types", "MTS-ACCOMMODATING-FORMULA-WRT-TYPES", 1, 0, false);
    //declareFunction(myName, "nat_wf_in_some_mtP", "NAT-WF-IN-SOME-MT?", 1, 2, false);
    //declareFunction(myName, "nat_wf_in_some_mt", "NAT-WF-IN-SOME-MT", 1, 2, false);
    //declareFunction(myName, "nat_wf_default_mts", "NAT-WF-DEFAULT-MTS", 1, 2, false);
    //declareFunction(myName, "formula_forts_isa_mts", "FORMULA-FORTS-ISA-MTS", 1, 1, false);
    //declareFunction(myName, "at_mt_mt_relevantP", "AT-MT-MT-RELEVANT?", 1, 0, false);
    //declareFunction(myName, "mts_accommodating_nat", "MTS-ACCOMMODATING-NAT", 1, 2, false);
    //declareFunction(myName, "nat_wf_in_mts", "NAT-WF-IN-MTS", 1, 3, false);
    //declareFunction(myName, "clear_cached_max_floor_mts_of_nat", "CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT", 0, 0, false);
    //declareFunction(myName, "remove_cached_max_floor_mts_of_nat", "REMOVE-CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
    //declareFunction(myName, "cached_max_floor_mts_of_nat_internal", "CACHED-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 4, 0, false);
    //declareFunction(myName, "cached_max_floor_mts_of_nat", "CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
    //declareFunction(myName, "fast_max_floor_mts_of_nat", "FAST-MAX-FLOOR-MTS-OF-NAT", 1, 1, false);
    //declareFunction(myName, "max_floor_mts_of_nat", "MAX-FLOOR-MTS-OF-NAT", 1, 3, false);
    //declareFunction(myName, "max_floor_mts_of_naut", "MAX-FLOOR-MTS-OF-NAUT", 4, 0, false);
    //declareFunction(myName, "max_floor_mts_of_naut_int", "MAX-FLOOR-MTS-OF-NAUT-INT", 3, 0, false);
    //declareFunction(myName, "admitted_arg_candidate_mt_sets", "ADMITTED-ARG-CANDIDATE-MT-SETS", 3, 1, false);
    //declareFunction(myName, "result_of_max_floor_mts_of_nat", "RESULT-OF-MAX-FLOOR-MTS-OF-NAT", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_admitted_arg", "MAX-FLOOR-MTS-OF-ADMITTED-ARG", 3, 1, false);
    //declareFunction(myName, "max_floor_mts_of_nat_benchmark", "MAX-FLOOR-MTS-OF-NAT-BENCHMARK", 1, 0, false);
    //declareFunction(myName, "get_random_nart_set", "GET-RANDOM-NART-SET", 1, 0, false);
    //declareFunction(myName, "max_floor_mts_of_admitted_arg_benchmark", "MAX-FLOOR-MTS-OF-ADMITTED-ARG-BENCHMARK", 0, 1, false);
    //declareFunction(myName, "get_admitted_by_supports", "GET-ADMITTED-BY-SUPPORTS", 0, 0, false);
    //declareFunction(myName, "nat_formula_arg_wff_mts", "NAT-FORMULA-ARG-WFF-MTS", 1, 0, false);
    //declareFunction(myName, "nat_function_wff_mts", "NAT-FUNCTION-WFF-MTS", 1, 0, false);
    //declareFunction(myName, "relation_wff_mts", "RELATION-WFF-MTS", 1, 0, false);
    //declareFunction(myName, "candidate_mts_wrt", "CANDIDATE-MTS-WRT", 2, 0, false);
    //declareFunction(myName, "nat_arg_wff_wrt_arg_isa_mts", "NAT-ARG-WFF-WRT-ARG-ISA-MTS", 2, 0, false);
    //declareFunction(myName, "nat_arg_wff_wrt_arg_genls_mts", "NAT-ARG-WFF-WRT-ARG-GENLS-MTS", 2, 0, false);
    //declareFunction(myName, "filter_excepted_nat_wff_mts", "FILTER-EXCEPTED-NAT-WFF-MTS", 1, 0, false);
    //declareFunction(myName, "at_note", "AT-NOTE", 2, 5, false);
    //declareFunction(myName, "at_error", "AT-ERROR", 2, 5, false);
    //declareFunction(myName, "at_cerror", "AT-CERROR", 3, 5, false);
    //declareFunction(myName, "at_warn", "AT-WARN", 2, 5, false);
    //declareFunction(myName, "min_anects", "MIN-ANECTS", 1, 1, false);
    //declareFunction(myName, "union_min_anects", "UNION-MIN-ANECTS", 1, 1, false);
    //declareFunction(myName, "relation_arg_constraint_sentences", "RELATION-ARG-CONSTRAINT-SENTENCES", 2, 1, false);
    //declareFunction(myName, "variable_arity_relation_arg_constraint_sentences", "VARIABLE-ARITY-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
    //declareFunction(myName, "all_relation_arg_constraint_sentences", "ALL-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
    //declareFunction(myName, "all_relation_constraint_sentences", "ALL-RELATION-CONSTRAINT-SENTENCES", 1, 1, false);
    //declareFunction(myName, "relation_term_arg_constraints", "RELATION-TERM-ARG-CONSTRAINTS", 3, 1, false);
    //declareFunction(myName, "formula_arg_constraints_cycl", "FORMULA-ARG-CONSTRAINTS-CYCL", 1, 1, false);
    //declareFunction(myName, "formula_variable_isa_constraint_alist", "FORMULA-VARIABLE-ISA-CONSTRAINT-ALIST", 2, 0, false);
    //declareFunction(myName, "constraint_sentence_isa_constraints", "CONSTRAINT-SENTENCE-ISA-CONSTRAINTS", 2, 0, false);
    //declareFunction(myName, "possible_followup_variable_binding_sets", "POSSIBLE-FOLLOWUP-VARIABLE-BINDING-SETS", 2, 1, false);
    //declareFunction(myName, "variable_binding_set_item_comparator", "VARIABLE-BINDING-SET-ITEM-COMPARATOR", 2, 0, false);
    //declareFunction(myName, "calc_possible_followup_binding_sets", "CALC-POSSIBLE-FOLLOWUP-BINDING-SETS", 3, 0, false);
    //declareFunction(myName, "count_followup_bindings", "COUNT-FOLLOWUP-BINDINGS", 1, 0, false);
    //declareFunction(myName, "similarity_for_variable_binding_set", "SIMILARITY-FOR-VARIABLE-BINDING-SET", 3, 1, false);
    //declareFunction(myName, "constraint_similarity", "CONSTRAINT-SIMILARITY", 2, 1, false);
    //declareFunction(myName, "isa_constraint_similarity", "ISA-CONSTRAINT-SIMILARITY", 2, 1, false);
    //declareFunction(myName, "genls_constraint_similarity", "GENLS-CONSTRAINT-SIMILARITY", 2, 1, false);
    //declareFunction(myName, "isas_and_genls_similarity", "ISAS-AND-GENLS-SIMILARITY", 5, 0, false);
    //declareFunction(myName, "more_specific_p", "MORE-SPECIFIC-P", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_at_utilities_file() {
    $generic_arg_store$ = deflexical("*GENERIC-ARG-STORE*", ((NIL != Symbols.boundp($sym5$_GENERIC_ARG_STORE_)) ? ((SubLObject) $generic_arg_store$.getGlobalValue()) : NIL));
    $some_inter_arg_isa_assertion_somewhere_cache$ = deflexical("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*", ((NIL != Symbols.boundp($sym58$_SOME_INTER_ARG_ISA_ASSERTION_SOMEWHERE_CACHE_)) ? ((SubLObject) $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue()) : NIL));
    $some_inter_arg_format_assertion_somewhere_cache$ = deflexical("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*", ((NIL != Symbols.boundp($sym77$_SOME_INTER_ARG_FORMAT_ASSERTION_SOMEWHERE_CACHE_)) ? ((SubLObject) $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue()) : NIL));
    $mts_cutoff_for_mts_accommodating_formula_wrt_types$ = defparameter("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*", $int119$40);
    $max_floor_mts_of_nat_exceptions$ = defparameter("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*", NIL);
    $cached_max_floor_mts_of_nat_caching_state$ = deflexical("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*", NIL);
    $max_floor_mts_of_nat_recursionP$ = defparameter("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_at_utilities_file() {
    // CVS_ID("Id: at-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym5$_GENERIC_ARG_STORE_);
    subl_macro_promotions.declare_defglobal($sym58$_SOME_INTER_ARG_ISA_ASSERTION_SOMEWHERE_CACHE_);
    subl_macro_promotions.declare_defglobal($sym77$_SOME_INTER_ARG_FORMAT_ASSERTION_SOMEWHERE_CACHE_);
    memoization_state.note_globally_cached_function($sym123$CACHED_MAX_FLOOR_MTS_OF_NAT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));
  public static final SubLObject $const1$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));
  public static final SubLObject $const2$arg3Isa = constant_handles.reader_make_constant_shell(makeString("arg3Isa"));
  public static final SubLObject $const3$arg4Isa = constant_handles.reader_make_constant_shell(makeString("arg4Isa"));
  public static final SubLObject $const4$arg5Isa = constant_handles.reader_make_constant_shell(makeString("arg5Isa"));
  public static final SubLSymbol $sym5$_GENERIC_ARG_STORE_ = makeSymbol("*GENERIC-ARG-STORE*");
  public static final SubLString $str6$ARG = makeString("ARG");
  public static final SubLString $str7$_S = makeString("~S");
  public static final SubLObject $const8$interArgIsa1_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-2"));
  public static final SubLObject $const9$interArgIsa1_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-3"));
  public static final SubLObject $const10$interArgIsa1_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-4"));
  public static final SubLObject $const11$interArgIsa1_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-5"));
  public static final SubLString $str12$invalid_arg_isa_pred_index___s__s = makeString("invalid arg-isa-pred index: ~s-~s");
  public static final SubLObject $const13$interArgIsa2_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-1"));
  public static final SubLObject $const14$interArgIsa2_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-3"));
  public static final SubLObject $const15$interArgIsa2_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-4"));
  public static final SubLObject $const16$interArgIsa2_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-5"));
  public static final SubLObject $const17$interArgIsa3_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-1"));
  public static final SubLObject $const18$interArgIsa3_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-2"));
  public static final SubLObject $const19$interArgIsa3_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-4"));
  public static final SubLObject $const20$interArgIsa3_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-5"));
  public static final SubLObject $const21$interArgIsa4_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-1"));
  public static final SubLObject $const22$interArgIsa4_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-2"));
  public static final SubLObject $const23$interArgIsa4_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-3"));
  public static final SubLObject $const24$interArgIsa4_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-5"));
  public static final SubLObject $const25$interArgIsa5_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-1"));
  public static final SubLObject $const26$interArgIsa5_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-2"));
  public static final SubLObject $const27$interArgIsa5_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-3"));
  public static final SubLObject $const28$interArgIsa5_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-4"));
  public static final SubLList $list29 = list(ONE_INTEGER, TWO_INTEGER);
  public static final SubLObject $const30$interArgNotIsa1_2 = constant_handles.reader_make_constant_shell(makeString("interArgNotIsa1-2"));
  public static final SubLString $str31$invalid_arg_not_isa_pred_index___ = makeString("invalid arg-not-isa-pred index: ~s-~s");
  public static final SubLObject $const32$interArgNotIsa2_1 = constant_handles.reader_make_constant_shell(makeString("interArgNotIsa2-1"));
  public static final SubLObject $const33$interArgGenl1_2 = constant_handles.reader_make_constant_shell(makeString("interArgGenl1-2"));
  public static final SubLString $str34$invalid_arg_genl_pred_index___s__ = makeString("invalid arg-genl-pred index: ~s-~s");
  public static final SubLObject $const35$interArgGenl2_1 = constant_handles.reader_make_constant_shell(makeString("interArgGenl2-1"));
  public static final SubLObject $const36$TruthFunction = constant_handles.reader_make_constant_shell(makeString("TruthFunction"));
  public static final SubLString $str37$Initializing_all_arg_type_predica = makeString("Initializing all arg type predicate caches...");
  public static final SubLObject $const38$ArgIsaBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgIsaBinaryPredicate"));
  public static final SubLObject $const39$ArgIsaTernaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgIsaTernaryPredicate"));
  public static final SubLObject $const40$ArgIsaPredicate = constant_handles.reader_make_constant_shell(makeString("ArgIsaPredicate"));
  public static final SubLObject $const41$ArgGenlBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgGenlBinaryPredicate"));
  public static final SubLObject $const42$ArgGenlTernaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgGenlTernaryPredicate"));
  public static final SubLObject $const43$ArgGenlPredicate = constant_handles.reader_make_constant_shell(makeString("ArgGenlPredicate"));
  public static final SubLSymbol $sym44$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLObject $const45$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLSymbol $kw46$STRONG_FORT = makeKeyword("STRONG-FORT");
  public static final SubLSymbol $kw47$ISA = makeKeyword("ISA");
  public static final SubLObject $const48$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const49$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $kw50$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $sym51$TREE_POSITION_P = makeSymbol("TREE-POSITION-P");
  public static final SubLSymbol $sym52$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");
  public static final SubLSymbol $kw53$EL_VAR = makeKeyword("EL-VAR");
  public static final SubLSymbol $sym54$RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");
  public static final SubLSymbol $sym55$GATHER_VIA_MAP_PRED_INDEX = makeSymbol("GATHER-VIA-MAP-PRED-INDEX");
  public static final SubLSymbol $sym56$GATHER_ASSERTIONS = makeSymbol("GATHER-ASSERTIONS");
  public static final SubLSymbol $kw57$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym58$_SOME_INTER_ARG_ISA_ASSERTION_SOMEWHERE_CACHE_ = makeSymbol("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*");
  public static final SubLSymbol $sym59$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const60$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLString $str61$Initializing___interArgIsa_cache = makeString("Initializing #$interArgIsa cache");
  public static final SubLSymbol $kw62$GAF = makeKeyword("GAF");
  public static final SubLObject $const63$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw64$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw65$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw66$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw68$ERROR = makeKeyword("ERROR");
  public static final SubLString $str69$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym70$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw71$CERROR = makeKeyword("CERROR");
  public static final SubLString $str72$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw73$WARN = makeKeyword("WARN");
  public static final SubLString $str74$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str75$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str76$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym77$_SOME_INTER_ARG_FORMAT_ASSERTION_SOMEWHERE_CACHE_ = makeSymbol("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*");
  public static final SubLString $str78$Initializing___interArgFormat_cac = makeString("Initializing #$interArgFormat cache");
  public static final SubLObject $const79$GenericArgTemplate = constant_handles.reader_make_constant_shell(makeString("GenericArgTemplate"));
  public static final SubLObject $const80$KeywordVariableTemplate = constant_handles.reader_make_constant_shell(makeString("KeywordVariableTemplate"));
  public static final SubLString $str81$got_an_arg_type_predicate___s__th = makeString("got an arg-type predicate (~s) that's neither binary nor ternary in ~s");
  public static final SubLSymbol $kw82$FORMAT = makeKeyword("FORMAT");
  public static final SubLSymbol $kw83$DIFFERENT = makeKeyword("DIFFERENT");
  public static final SubLSymbol $kw84$AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");
  public static final SubLSymbol $sym85$AT_ERROR = makeSymbol("AT-ERROR");
  public static final SubLSymbol $sym86$AT_NOTE = makeSymbol("AT-NOTE");
  public static final SubLString $str87$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s");
  public static final SubLString $str88$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s for arg ~s of reln ~s");
  public static final SubLSymbol $kw89$IRREFLEXIVE_PREDICATE = makeKeyword("IRREFLEXIVE-PREDICATE");
  public static final SubLSymbol $kw90$ASYMMETRIC_PREDICATE = makeKeyword("ASYMMETRIC-PREDICATE");
  public static final SubLSymbol $kw91$ANTI_SYMMETRIC_PREDICATE = makeKeyword("ANTI-SYMMETRIC-PREDICATE");
  public static final SubLSymbol $kw92$ANTI_TRANSITIVE_PREDICATE = makeKeyword("ANTI-TRANSITIVE-PREDICATE");
  public static final SubLSymbol $kw93$NEGATION_PREDS = makeKeyword("NEGATION-PREDS");
  public static final SubLSymbol $kw94$NEGATION_INVERSES = makeKeyword("NEGATION-INVERSES");
  public static final SubLString $str95$illegal_value_of__at_mode____s = makeString("illegal value of *at-mode*: ~s");
  public static final SubLSymbol $kw96$PREDICATE_ISA_VIOLATION = makeKeyword("PREDICATE-ISA-VIOLATION");
  public static final SubLSymbol $kw97$META_PREDICATE_VIOLATION = makeKeyword("META-PREDICATE-VIOLATION");
  public static final SubLSymbol $kw98$MAL_ARG_WRT_COL_DEFN = makeKeyword("MAL-ARG-WRT-COL-DEFN");
  public static final SubLObject $const99$CycLSentence_Assertible = constant_handles.reader_make_constant_shell(makeString("CycLSentence-Assertible"));
  public static final SubLSymbol $kw100$MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");
  public static final SubLSymbol $kw101$CHANGE_MT = makeKeyword("CHANGE-MT");
  public static final SubLSymbol $sym102$ASSERTION_ARG_VIOLATION_ = makeSymbol("ASSERTION-ARG-VIOLATION?");
  public static final SubLSymbol $sym103$SEF_VIOLATION_ = makeSymbol("SEF-VIOLATION?");
  public static final SubLSymbol $sym104$PREDICATE_VIOLATION_ = makeSymbol("PREDICATE-VIOLATION?");
  public static final SubLSymbol $kw105$MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");
  public static final SubLList $list106 = listS(makeSymbol("ARG"), new SubLObject[] {makeSymbol("RELN"), makeSymbol("ARGNUM"), makeSymbol("COL"), makeSymbol("DEFN"), makeSymbol("MT"), makeSymbol("DATA")});
  public static final SubLSymbol $sym107$CYC_ASSERTION = makeSymbol("CYC-ASSERTION");
  public static final SubLObject $const108$CycLAssertion = constant_handles.reader_make_constant_shell(makeString("CycLAssertion"));
  public static final SubLSymbol $kw109$MAL_ARG_WRT_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
  public static final SubLSymbol $kw110$MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
  public static final SubLSymbol $kw111$REPLACE_TERM = makeKeyword("REPLACE-TERM");
  public static final SubLObject $const112$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLList $list113 = list(makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));
  public static final SubLSymbol $kw114$ASSERT = makeKeyword("ASSERT");
  public static final SubLObject $const115$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLList $list116 = list(new SubLObject[] {makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA")});
  public static final SubLList $list117 = list(makeSymbol("PREDICATE"), makeSymbol("ISA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));
  public static final SubLSymbol $kw118$UNASSERT = makeKeyword("UNASSERT");
  public static final SubLInteger $int119$40 = makeInteger(40);
  public static final SubLSymbol $sym120$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym121$_ = makeSymbol(">");
  public static final SubLSymbol $sym122$SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");
  public static final SubLSymbol $sym123$CACHED_MAX_FLOOR_MTS_OF_NAT = makeSymbol("CACHED-MAX-FLOOR-MTS-OF-NAT");
  public static final SubLSymbol $sym124$_CACHED_MAX_FLOOR_MTS_OF_NAT_CACHING_STATE_ = makeSymbol("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*");
  public static final SubLInteger $int125$64 = makeInteger(64);
  public static final SubLSymbol $kw126$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLObject $const127$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLSymbol $kw128$IGNORE = makeKeyword("IGNORE");
  public static final SubLObject $const129$Kappa = constant_handles.reader_make_constant_shell(makeString("Kappa"));
  public static final SubLSymbol $sym130$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLString $str131$___S_____S_____s__ = makeString("~&~S~%  ~S~%  ~s~%");
  public static final SubLString $str132$mapping_Cyc_arguments = makeString("mapping Cyc arguments");
  public static final SubLSymbol $sym133$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw134$SKIP = makeKeyword("SKIP");
  public static final SubLObject $const135$admittedArgument = constant_handles.reader_make_constant_shell(makeString("admittedArgument"));
  public static final SubLObject $const136$Function_Denotational = constant_handles.reader_make_constant_shell(makeString("Function-Denotational"));
  public static final SubLObject $const137$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLSymbol $sym138$WARN = makeSymbol("WARN");
  public static final SubLObject $const139$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell(makeString("AtemporalNecessarilyEssentialCollectionType"));
  public static final SubLObject $const140$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));
  public static final SubLObject $const141$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));
  public static final SubLSymbol $sym142$VARIABLE_ARITY_RELATION_P = makeSymbol("VARIABLE-ARITY-RELATION-P");
  public static final SubLObject $const143$argsIsa = constant_handles.reader_make_constant_shell(makeString("argsIsa"));
  public static final SubLObject $const144$argsGenl = constant_handles.reader_make_constant_shell(makeString("argsGenl"));
  public static final SubLSymbol $sym145$RELATION_P = makeSymbol("RELATION-P");
  public static final SubLSymbol $sym146$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym147$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLObject $const148$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list149 = list(constant_handles.reader_make_constant_shell(makeString("Relation")));
  public static final SubLSymbol $sym150$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym151$VARIABLE_BINDING_SET_ITEM_COMPARATOR = makeSymbol("VARIABLE-BINDING-SET-ITEM-COMPARATOR");
  public static final SubLInteger $int152$100 = makeInteger(100);
  public static final SubLFloat $float153$0_01 = makeDouble(0.01);
  public static final SubLObject $const154$Number_General = constant_handles.reader_make_constant_shell(makeString("Number-General"));

  //// Initializers

  public void declareFunctions() {
    declare_at_utilities_file();
  }

  public void initializeVariables() {
    init_at_utilities_file();
  }

  public void runTopLevelForms() {
    setup_at_utilities_file();
  }

}
