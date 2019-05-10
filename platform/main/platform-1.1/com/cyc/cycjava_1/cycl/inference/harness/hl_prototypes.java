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
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_paths;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class hl_prototypes extends SubLTranslatedFile {

  //// Constructor

  private hl_prototypes() {}
  public static final SubLFile me = new hl_prototypes();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.hl_prototypes";

  //// Definitions

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1148) 
  private static SubLSymbol $hl_prototypes_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1276) 
  private static SubLSymbol $gather_hl_prototype_statisticsP$ = null;

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1336) 
  private static SubLSymbol $hl_prototype_hits$ = null;

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1378) 
  private static SubLSymbol $hl_prototype_hit_table$ = null;

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1445) 
  private static SubLSymbol $hl_prototype_misses$ = null;

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1489) 
  public static final SubLObject hl_prototypes_enabledP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $hl_prototypes_enabledP$.getDynamicValue(thread))
             && (NIL != constant_handles.valid_constantP($const3$hlPrototypicalInstance, UNPROVIDED))
             && (NIL != constant_handles.valid_constantP($const4$HLPrototypicalTerm, UNPROVIDED))));
    }
  }

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1741) 
  public static final SubLObject hl_prototype_allowed_forward_rules(SubLObject assertions_found_or_created) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != hl_prototypes_enabledP())) {
        if ((NIL != list_utilities.singletonP(assertions_found_or_created))) {
          {
            SubLObject assertion = assertions_found_or_created.first();
            if ((NIL != possibly_hl_prototype_assertionP(assertion))) {
              {
                SubLObject col = assertions_high.gaf_arg2(assertion);
                SubLObject prototypical_instance = find_or_create_hl_prototypical_instance(col, UNPROVIDED);
                SubLObject rules = relevant_hl_prototype_rules(prototypical_instance);
                if ((NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread))) {
                  $hl_prototype_hits$.setGlobalValue(Numbers.add($hl_prototype_hits$.getGlobalValue(), ONE_INTEGER));
                  dictionary_utilities.dictionary_increment($hl_prototype_hit_table$.getGlobalValue(), col, UNPROVIDED);
                }
                return rules;
              }
            }
          }
        }
      }
      if ((NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread))) {
        $hl_prototype_misses$.setGlobalValue(Numbers.add($hl_prototype_misses$.getGlobalValue(), ONE_INTEGER));
      }
      return forward.forward_inference_allowed_rules();
    }
  }

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2482) 
  public static final SubLObject hl_prototypical_instance_after_adding(SubLObject assertion, SubLObject argument) {
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2892) 
  private static SubLSymbol $the_hl_prototype_ke_irrelevant_rule_caching_state$ = null;

  /** The CNF of the forward rule that implements #$keIrrelevantTerm for HL prototypical instances.
   We don't want to include this in the forward inference allowed rules. */
  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2892) 
  public static final SubLObject the_hl_prototype_ke_irrelevant_rule_internal() {
    return kb_indexing.find_assertion(list(list(listS($const8$quotedIsa, variables.find_variable_by_id(ZERO_INTEGER), $list9)), list(list($const10$keIrrelevantTerm, variables.find_variable_by_id(ZERO_INTEGER)))), $const11$UniversalVocabularyMt);
  }

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2892) 
  public static final SubLObject the_hl_prototype_ke_irrelevant_rule() {
    {
      SubLObject caching_state = $the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym7$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE, $sym12$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if ((results == $kw13$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(the_hl_prototype_ke_irrelevant_rule_internal()));
          memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3339) 
  public static final SubLObject relevant_hl_prototype_rules(SubLObject v_term) {
    {
      SubLObject rules = assertion_utilities.all_forward_rules_relevant_to_term(v_term);
      return Sequences.remove(the_hl_prototype_ke_irrelevant_rule(), rules, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
  }

  /** @return booleanp; whether ASSERTION is of the form (#$isa NEW-TERM COL),
   where NEW-TERM has no assertions other than ASSERTION, and COL is an HL prototype collection */
  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3626) 
  public static final SubLObject possibly_hl_prototype_assertionP(SubLObject assertion) {
    if ((NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $const14$isa))) {
      {
        SubLObject mt = assertions_high.assertion_mt(assertion);
        if (((mt == mt_vars.$anect_mt$.getGlobalValue())
            || (mt == mt_vars.$core_mt_floor$.getGlobalValue()))) {
          {
            SubLObject new_term = assertions_high.gaf_arg1(assertion);
            if ((NIL != number_utilities.onep(kb_indexing.num_index(new_term)))) {
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4182) 
  public static final SubLObject find_or_create_hl_prototypical_instance(SubLObject col, SubLObject use_transcriptP) {
    if ((use_transcriptP == UNPROVIDED)) {
      use_transcriptP = NIL;
    }
    {
      SubLObject prototypical_instance = hl_prototypical_instance(col);
      return ((NIL != prototypical_instance) ? ((SubLObject) prototypical_instance) : create_hl_prototypical_instance(col, use_transcriptP));
    }
  }

  /** @return constant-p; the constant denoting the prototypical instance of COL */
  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4435) 
  public static final SubLObject hl_prototypical_instance(SubLObject col) {
    return kb_mapping_utilities.fpred_value(col, $const3$hlPrototypicalInstance, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
  }

  /** @return constant-p; a newly created prototypical instance of COL */
  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4618) 
  public static final SubLObject create_hl_prototypical_instance(SubLObject col, SubLObject use_transcriptP) {
    if ((use_transcriptP == UNPROVIDED)) {
      use_transcriptP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject name = hl_prototypical_instance_name(col);
        SubLObject v_const = ((NIL != use_transcriptP) ? ((SubLObject) ke.ke_create_now(name, UNPROVIDED)) : cyc_kernel.cyc_create_new_ephemeral(name));
        SubLObject environment = forward.get_forward_inference_environment();
        checkType(environment, $sym15$QUEUE_P);
        {
          SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
          SubLObject _prev_bind_1 = $hl_prototypes_enabledP$.currentBinding(thread);
          try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            $hl_prototypes_enabledP$.bind(NIL, thread);
            {
              SubLObject _prev_bind_0_1 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
              try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(removal_module_utilities.non_null_answer_to_singleton(the_hl_prototype_ke_irrelevant_rule()), thread);
                if ((NIL != use_transcriptP)) {
                  ke.ke_assert_now(listS($const8$quotedIsa, v_const, $list9), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                  cyc_kernel.cyc_assert_wff(listS($const8$quotedIsa, v_const, $list9), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
              } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_1, thread);
              }
            }
            {
              SubLObject _prev_bind_0_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
              try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                if ((NIL != use_transcriptP)) {
                  ke.ke_assert_now(list($const3$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                  cyc_kernel.cyc_assert_wff(list($const3$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
              } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_2, thread);
              }
            }
            {
              SubLObject _prev_bind_0_3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
              try {
                kb_control_vars.$forward_inference_allowed_rules$.bind($kw16$ALL, thread);
                if ((NIL != use_transcriptP)) {
                  ke.ke_assert_now(list($const14$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                  cyc_kernel.cyc_assert_wff(list($const14$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
              } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_3, thread);
              }
            }
          } finally {
            $hl_prototypes_enabledP$.rebind(_prev_bind_1, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
          }
        }
        return v_const;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 5756) 
  public static final SubLObject hl_prototypical_instance_name(SubLObject col) {
    return string_utilities.make_valid_constant_name(Sequences.cconcatenate($str17$ThePrototypical, kb_paths.fort_name(col)), UNPROVIDED);
  }

  public static final SubLObject declare_hl_prototypes_file() {
    declareFunction(myName, "hl_prototypes_enabledP", "HL-PROTOTYPES-ENABLED?", 0, 0, false);
    declareFunction(myName, "hl_prototype_allowed_forward_rules", "HL-PROTOTYPE-ALLOWED-FORWARD-RULES", 1, 0, false);
    declareFunction(myName, "hl_prototypical_instance_after_adding", "HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "hl_prototypical_instance_after_removing", "HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING", 2, 0, false);
    declareFunction(myName, "clear_the_hl_prototype_ke_irrelevant_rule", "CLEAR-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
    declareFunction(myName, "remove_the_hl_prototype_ke_irrelevant_rule", "REMOVE-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
    declareFunction(myName, "the_hl_prototype_ke_irrelevant_rule_internal", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL", 0, 0, false);
    declareFunction(myName, "the_hl_prototype_ke_irrelevant_rule", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
    declareFunction(myName, "relevant_hl_prototype_rules", "RELEVANT-HL-PROTOTYPE-RULES", 1, 0, false);
    declareFunction(myName, "clear_hl_prototype_caches", "CLEAR-HL-PROTOTYPE-CACHES", 0, 0, false);
    declareFunction(myName, "possibly_hl_prototype_assertionP", "POSSIBLY-HL-PROTOTYPE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "find_or_create_hl_prototypical_instance", "FIND-OR-CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
    declareFunction(myName, "hl_prototypical_instance", "HL-PROTOTYPICAL-INSTANCE", 1, 0, false);
    declareFunction(myName, "create_hl_prototypical_instance", "CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
    declareFunction(myName, "hl_prototypical_instance_name", "HL-PROTOTYPICAL-INSTANCE-NAME", 1, 0, false);
    declareFunction(myName, "hl_prototype_collections", "HL-PROTOTYPE-COLLECTIONS", 0, 0, false);
    declareFunction(myName, "hl_prototypical_collection", "HL-PROTOTYPICAL-COLLECTION", 1, 0, false);
    declareFunction(myName, "hl_prototypical_instanceP", "HL-PROTOTYPICAL-INSTANCE?", 1, 0, false);
    declareFunction(myName, "show_hl_prototype_statistics", "SHOW-HL-PROTOTYPE-STATISTICS", 0, 0, false);
    declareFunction(myName, "clear_hl_prototype_statistics", "CLEAR-HL-PROTOTYPE-STATISTICS", 0, 0, false);
    declareFunction(myName, "create_hl_prototypical_instances_for_common_collections", "CREATE-HL-PROTOTYPICAL-INSTANCES-FOR-COMMON-COLLECTIONS", 1, 1, false);
    declareFunction(myName, "n_most_useful_hl_prototype_collections", "N-MOST-USEFUL-HL-PROTOTYPE-COLLECTIONS", 1, 1, false);
    declareFunction(myName, "most_useful_hl_prototypical_instances_dict", "MOST-USEFUL-HL-PROTOTYPICAL-INSTANCES-DICT", 0, 0, false);
    declareFunction(myName, "likely_first_asserted_isa_col", "LIKELY-FIRST-ASSERTED-ISA-COL", 1, 0, false);
    declareFunction(myName, "likely_first_asserted_isa_gaf", "LIKELY-FIRST-ASSERTED-ISA-GAF", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_hl_prototypes_file() {
    $hl_prototypes_enabledP$ = defparameter("*HL-PROTOTYPES-ENABLED?*", T);
    $gather_hl_prototype_statisticsP$ = defparameter("*GATHER-HL-PROTOTYPE-STATISTICS?*", T);
    $hl_prototype_hits$ = deflexical("*HL-PROTOTYPE-HITS*", maybeDefault( $sym0$_HL_PROTOTYPE_HITS_, $hl_prototype_hits$, ()-> (ZERO_INTEGER)));
    $hl_prototype_hit_table$ = deflexical("*HL-PROTOTYPE-HIT-TABLE*", maybeDefault( $sym1$_HL_PROTOTYPE_HIT_TABLE_, $hl_prototype_hit_table$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
    $hl_prototype_misses$ = deflexical("*HL-PROTOTYPE-MISSES*", maybeDefault( $sym2$_HL_PROTOTYPE_MISSES_, $hl_prototype_misses$, ()-> (ZERO_INTEGER)));
    $the_hl_prototype_ke_irrelevant_rule_caching_state$ = deflexical("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_hl_prototypes_file() {
    // CVS_ID("Id: hl-prototypes.lisp 128128 2009-06-24 15:33:11Z daves ");
    subl_macro_promotions.declare_defglobal($sym0$_HL_PROTOTYPE_HITS_);
    subl_macro_promotions.declare_defglobal($sym1$_HL_PROTOTYPE_HIT_TABLE_);
    subl_macro_promotions.declare_defglobal($sym2$_HL_PROTOTYPE_MISSES_);
    utilities_macros.register_kb_function($sym5$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING);
    utilities_macros.register_kb_function($sym6$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING);
    memoization_state.note_globally_cached_function($sym7$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_HL_PROTOTYPE_HITS_ = makeSymbol("*HL-PROTOTYPE-HITS*");
  public static final SubLSymbol $sym1$_HL_PROTOTYPE_HIT_TABLE_ = makeSymbol("*HL-PROTOTYPE-HIT-TABLE*");
  public static final SubLSymbol $sym2$_HL_PROTOTYPE_MISSES_ = makeSymbol("*HL-PROTOTYPE-MISSES*");
  public static final SubLObject $const3$hlPrototypicalInstance = constant_handles.reader_make_constant_shell(makeString("hlPrototypicalInstance"));
  public static final SubLObject $const4$HLPrototypicalTerm = constant_handles.reader_make_constant_shell(makeString("HLPrototypicalTerm"));
  public static final SubLSymbol $sym5$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING");
  public static final SubLSymbol $sym6$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING");
  public static final SubLSymbol $sym7$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE = makeSymbol("THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE");
  public static final SubLObject $const8$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLList $list9 = list(constant_handles.reader_make_constant_shell(makeString("HLPrototypicalTerm")));
  public static final SubLObject $const10$keIrrelevantTerm = constant_handles.reader_make_constant_shell(makeString("keIrrelevantTerm"));
  public static final SubLObject $const11$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLSymbol $sym12$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_ = makeSymbol("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*");
  public static final SubLSymbol $kw13$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLObject $const14$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym15$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLSymbol $kw16$ALL = makeKeyword("ALL");
  public static final SubLString $str17$ThePrototypical = makeString("ThePrototypical");
  public static final SubLSymbol $sym18$GAF_ARG2 = makeSymbol("GAF-ARG2");
  public static final SubLString $str19$Hits_____a__ = makeString("Hits:   ~a~%");
  public static final SubLString $str20$Misses___a__ = makeString("Misses: ~a~%");
  public static final SubLString $str21$Ratio____a___ = makeString("Ratio:  ~a%~%");
  public static final SubLString $str22$cdolist = makeString("cdolist");
  public static final SubLSymbol $sym23$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym24$_ = makeSymbol(">");
  public static final SubLString $str25$mapping_Cyc_constants = makeString("mapping Cyc constants");
  public static final SubLSymbol $sym26$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw27$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw28$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym29$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

  //// Initializers

  public void declareFunctions() {
    declare_hl_prototypes_file();
  }

  public void initializeVariables() {
    init_hl_prototypes_file();
  }

  public void runTopLevelForms() {
    setup_hl_prototypes_file();
  }

}
