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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_control_vars extends SubLTranslatedFile {

  //// Constructor

  private kb_control_vars() {}
  public static final SubLFile me = new kb_control_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_control_vars";

  //// Definitions

  @SubL(source = "cycl/kb-control-vars.lisp", position = 842) 
  public static SubLSymbol $backchain_forbidden_unless_arg_chosen$ = null;

  /** The list of KB feature symbols */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 1061) 
  private static SubLSymbol $kb_features$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 1603) 
  private static SubLSymbol $reformulator_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 1717) 
  private static SubLSymbol $sksi_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 1810) 
  private static SubLSymbol $paraphrase_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 1926) 
  private static SubLSymbol $nl_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 2093) 
  private static SubLSymbol $lexicon_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 2256) 
  private static SubLSymbol $rtp_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 2443) 
  private static SubLSymbol $rkf_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 2609) 
  private static SubLSymbol $thesaurus_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 2783) 
  private static SubLSymbol $quant_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 2952) 
  private static SubLSymbol $time_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 3110) 
  private static SubLSymbol $date_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 3268) 
  private static SubLSymbol $cyc_task_scheduler_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 3446) 
  private static SubLSymbol $wordnet_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 3602) 
  private static SubLSymbol $cyc_secure_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 3762) 
  private static SubLSymbol $planner_kb_loadedP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 3922) 
  private static SubLSymbol $kct_kb_loadedP$ = null;

  /** Is the portion of the KB necessary for KCTs loaded?
   There is currently no code analogue of this KB feature. */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 3922) 
  public static final SubLObject kct_kb_loaded_p() {
    return $kct_kb_loadedP$.getGlobalValue();
  }

  @SubL(source = "cycl/kb-control-vars.lisp", position = 3922) 
  public static final SubLObject unset_kct_kb_loaded() {
    $kct_kb_loadedP$.setGlobalValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/kb-control-vars.lisp", position = 4073) 
  public static SubLSymbol $forward_inference_enabledP$ = null;

  /** Do we allow forward propagation from negated gafs. */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 4154) 
  public static SubLSymbol $forward_propagate_from_negations$ = null;

  /** Do we allow conclusion of negated gafs in forward propagation. */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 4271) 
  public static SubLSymbol $forward_propagate_to_negations$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 4398) 
  public static SubLSymbol $within_forward_inferenceP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 4446) 
  public static final SubLObject within_forward_inferenceP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $within_forward_inferenceP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/kb-control-vars.lisp", position = 4530) 
  public static SubLSymbol $within_assertion_forward_propagationP$ = null;

  @SubL(source = "cycl/kb-control-vars.lisp", position = 4590) 
  public static SubLSymbol $relax_type_restrictions_for_nats$ = null;

  /** Amount of time we are willing to spend on each forward inference.
NIL means unlimited time. */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 4645) 
  public static SubLSymbol $forward_inference_time_cutoff$ = null;

  /** When a value other than :all, the list of the only rules allowed for forward inference. */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 4793) 
  public static SubLSymbol $forward_inference_allowed_rules$ = null;

  /** Environment used for performing forward inference. */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 4950) 
  public static SubLSymbol $forward_inference_environment$ = null;

  /** Do we give full justifications for ist gafs? */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 5160) 
  public static SubLSymbol $recursive_ist_justificationsP$ = null;

  /** Whether the HL storage modules should store the operations they perform */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 5266) 
  public static SubLSymbol $recording_hl_transcript_operationsP$ = null;

  /** A list of the operations noted by the HL storage modules */
  @SubL(source = "cycl/kb-control-vars.lisp", position = 5471) 
  public static SubLSymbol $hl_transcript_operations$ = null;

  public static final SubLObject declare_kb_control_vars_file() {
    declareFunction("print_kb_features", "PRINT-KB-FEATURES", 0, 0, false);
    declareFunction("reformulator_kb_loaded_p", "REFORMULATOR-KB-LOADED-P", 0, 0, false);
    declareFunction("set_reformulator_kb_loaded", "SET-REFORMULATOR-KB-LOADED", 0, 0, false);
    declareFunction("unset_reformulator_kb_loaded", "UNSET-REFORMULATOR-KB-LOADED", 0, 0, false);
    declareFunction("sksi_kb_loaded_p", "SKSI-KB-LOADED-P", 0, 0, false);
    declareFunction("set_sksi_kb_loaded", "SET-SKSI-KB-LOADED", 0, 0, false);
    declareFunction("unset_sksi_kb_loaded", "UNSET-SKSI-KB-LOADED", 0, 0, false);
    declareFunction("paraphrase_kb_loaded_p", "PARAPHRASE-KB-LOADED-P", 0, 0, false);
    declareFunction("set_paraphrase_kb_loaded", "SET-PARAPHRASE-KB-LOADED", 0, 0, false);
    declareFunction("unset_paraphrase_kb_loaded", "UNSET-PARAPHRASE-KB-LOADED", 0, 0, false);
    declareFunction("nl_kb_loaded_p", "NL-KB-LOADED-P", 0, 0, false);
    declareFunction("set_nl_kb_loaded", "SET-NL-KB-LOADED", 0, 0, false);
    declareFunction("unset_nl_kb_loaded", "UNSET-NL-KB-LOADED", 0, 0, false);
    declareFunction("lexicon_kb_loaded_p", "LEXICON-KB-LOADED-P", 0, 0, false);
    declareFunction("set_lexicon_kb_loaded", "SET-LEXICON-KB-LOADED", 0, 0, false);
    declareFunction("unset_lexicon_kb_loaded", "UNSET-LEXICON-KB-LOADED", 0, 0, false);
    declareFunction("rtp_kb_loaded_p", "RTP-KB-LOADED-P", 0, 0, false);
    declareFunction("set_rtp_kb_loaded", "SET-RTP-KB-LOADED", 0, 0, false);
    declareFunction("unset_rtp_kb_loaded", "UNSET-RTP-KB-LOADED", 0, 0, false);
    declareFunction("rkf_kb_loaded_p", "RKF-KB-LOADED-P", 0, 0, false);
    declareFunction("set_rkf_kb_loaded", "SET-RKF-KB-LOADED", 0, 0, false);
    declareFunction("unset_rkf_kb_loaded", "UNSET-RKF-KB-LOADED", 0, 0, false);
    declareFunction("thesaurus_kb_loaded_p", "THESAURUS-KB-LOADED-P", 0, 0, false);
    declareFunction("set_thesaurus_kb_loaded", "SET-THESAURUS-KB-LOADED", 0, 0, false);
    declareFunction("unset_thesaurus_kb_loaded", "UNSET-THESAURUS-KB-LOADED", 0, 0, false);
    declareFunction("quant_kb_loaded_p", "QUANT-KB-LOADED-P", 0, 0, false);
    declareFunction("set_quant_kb_loaded", "SET-QUANT-KB-LOADED", 0, 0, false);
    declareFunction("unset_quant_kb_loaded", "UNSET-QUANT-KB-LOADED", 0, 0, false);
    declareFunction("time_kb_loaded_p", "TIME-KB-LOADED-P", 0, 0, false);
    declareFunction("set_time_kb_loaded", "SET-TIME-KB-LOADED", 0, 0, false);
    declareFunction("unset_time_kb_loaded", "UNSET-TIME-KB-LOADED", 0, 0, false);
    declareFunction("date_kb_loaded_p", "DATE-KB-LOADED-P", 0, 0, false);
    declareFunction("set_date_kb_loaded", "SET-DATE-KB-LOADED", 0, 0, false);
    declareFunction("unset_date_kb_loaded", "UNSET-DATE-KB-LOADED", 0, 0, false);
    declareFunction("cyc_task_scheduler_kb_loaded_p", "CYC-TASK-SCHEDULER-KB-LOADED-P", 0, 0, false);
    declareFunction("set_cyc_task_scheduler_kb_loaded", "SET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false);
    declareFunction("unset_cyc_task_scheduler_kb_loaded", "UNSET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false);
    declareFunction("wordnet_kb_loaded_p", "WORDNET-KB-LOADED-P", 0, 0, false);
    declareFunction("set_wordnet_kb_loaded", "SET-WORDNET-KB-LOADED", 0, 0, false);
    declareFunction("unset_wordnet_kb_loaded", "UNSET-WORDNET-KB-LOADED", 0, 0, false);
    declareFunction("cyc_secure_kb_loaded_p", "CYC-SECURE-KB-LOADED-P", 0, 0, false);
    declareFunction("set_cyc_secure_kb_loaded", "SET-CYC-SECURE-KB-LOADED", 0, 0, false);
    declareFunction("unset_cyc_secure_kb_loaded", "UNSET-CYC-SECURE-KB-LOADED", 0, 0, false);
    declareFunction("planner_kb_loaded_p", "PLANNER-KB-LOADED-P", 0, 0, false);
    declareFunction("set_planner_kb_loaded", "SET-PLANNER-KB-LOADED", 0, 0, false);
    declareFunction("unset_planner_kb_loaded", "UNSET-PLANNER-KB-LOADED", 0, 0, false);
    declareFunction("kct_kb_loaded_p", "KCT-KB-LOADED-P", 0, 0, false);
    declareFunction("set_kct_kb_loaded", "SET-KCT-KB-LOADED", 0, 0, false);
    declareFunction("unset_kct_kb_loaded", "UNSET-KCT-KB-LOADED", 0, 0, false);
    declareFunction("within_forward_inferenceP", "WITHIN-FORWARD-INFERENCE?", 0, 0, false);
    declareFunction("record_hl_transcript_operation", "RECORD-HL-TRANSCRIPT-OPERATION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_control_vars_file() {
    $backchain_forbidden_unless_arg_chosen$ = deflexical("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*", maybeDefault( $sym0$_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_, $backchain_forbidden_unless_arg_chosen$, ()-> ($const1$backchainForbiddenWhenUnboundInAr)));
    $kb_features$ = deflexical("*KB-FEATURES*", NIL);
    $reformulator_kb_loadedP$ = deflexical("*REFORMULATOR-KB-LOADED?*", maybeDefault( $sym3$_REFORMULATOR_KB_LOADED__, $reformulator_kb_loadedP$, NIL));
    $sksi_kb_loadedP$ = deflexical("*SKSI-KB-LOADED?*", maybeDefault( $sym4$_SKSI_KB_LOADED__, $sksi_kb_loadedP$, NIL));
    $paraphrase_kb_loadedP$ = deflexical("*PARAPHRASE-KB-LOADED?*", maybeDefault( $sym5$_PARAPHRASE_KB_LOADED__, $paraphrase_kb_loadedP$, NIL));
    $nl_kb_loadedP$ = deflexical("*NL-KB-LOADED?*", maybeDefault( $sym6$_NL_KB_LOADED__, $nl_kb_loadedP$, NIL));
    $lexicon_kb_loadedP$ = deflexical("*LEXICON-KB-LOADED?*", maybeDefault( $sym7$_LEXICON_KB_LOADED__, $lexicon_kb_loadedP$, NIL));
    $rtp_kb_loadedP$ = deflexical("*RTP-KB-LOADED?*", maybeDefault( $sym8$_RTP_KB_LOADED__, $rtp_kb_loadedP$, NIL));
    $rkf_kb_loadedP$ = deflexical("*RKF-KB-LOADED?*", maybeDefault( $sym9$_RKF_KB_LOADED__, $rkf_kb_loadedP$, NIL));
    $thesaurus_kb_loadedP$ = deflexical("*THESAURUS-KB-LOADED?*", maybeDefault( $sym10$_THESAURUS_KB_LOADED__, $thesaurus_kb_loadedP$, NIL));
    $quant_kb_loadedP$ = deflexical("*QUANT-KB-LOADED?*", maybeDefault( $sym11$_QUANT_KB_LOADED__, $quant_kb_loadedP$, NIL));
    $time_kb_loadedP$ = deflexical("*TIME-KB-LOADED?*", maybeDefault( $sym12$_TIME_KB_LOADED__, $time_kb_loadedP$, NIL));
    $date_kb_loadedP$ = deflexical("*DATE-KB-LOADED?*", maybeDefault( $sym13$_DATE_KB_LOADED__, $date_kb_loadedP$, NIL));
    $cyc_task_scheduler_kb_loadedP$ = deflexical("*CYC-TASK-SCHEDULER-KB-LOADED?*", maybeDefault( $sym14$_CYC_TASK_SCHEDULER_KB_LOADED__, $cyc_task_scheduler_kb_loadedP$, NIL));
    $wordnet_kb_loadedP$ = deflexical("*WORDNET-KB-LOADED?*", maybeDefault( $sym15$_WORDNET_KB_LOADED__, $wordnet_kb_loadedP$, NIL));
    $cyc_secure_kb_loadedP$ = deflexical("*CYC-SECURE-KB-LOADED?*", maybeDefault( $sym16$_CYC_SECURE_KB_LOADED__, $cyc_secure_kb_loadedP$, NIL));
    $planner_kb_loadedP$ = deflexical("*PLANNER-KB-LOADED?*", maybeDefault( $sym17$_PLANNER_KB_LOADED__, $planner_kb_loadedP$, NIL));
    $kct_kb_loadedP$ = deflexical("*KCT-KB-LOADED?*", maybeDefault( $sym18$_KCT_KB_LOADED__, $kct_kb_loadedP$, NIL));
    $forward_inference_enabledP$ = defparameter("*FORWARD-INFERENCE-ENABLED?*", T);
    $forward_propagate_from_negations$ = defparameter("*FORWARD-PROPAGATE-FROM-NEGATIONS*", NIL);
    $forward_propagate_to_negations$ = defparameter("*FORWARD-PROPAGATE-TO-NEGATIONS*", NIL);
    $within_forward_inferenceP$ = defparameter("*WITHIN-FORWARD-INFERENCE?*", NIL);
    $within_assertion_forward_propagationP$ = defparameter("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*", NIL);
    $relax_type_restrictions_for_nats$ = defparameter("*RELAX-TYPE-RESTRICTIONS-FOR-NATS*", NIL);
    $forward_inference_time_cutoff$ = defparameter("*FORWARD-INFERENCE-TIME-CUTOFF*", NIL);
    $forward_inference_allowed_rules$ = defparameter("*FORWARD-INFERENCE-ALLOWED-RULES*", $kw19$ALL);
    $forward_inference_environment$ = defparameter("*FORWARD-INFERENCE-ENVIRONMENT*", queues.create_queue());
    $recursive_ist_justificationsP$ = defparameter("*RECURSIVE-IST-JUSTIFICATIONS?*", T);
    $recording_hl_transcript_operationsP$ = defparameter("*RECORDING-HL-TRANSCRIPT-OPERATIONS?*", NIL);
    $hl_transcript_operations$ = defparameter("*HL-TRANSCRIPT-OPERATIONS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_control_vars_file() {
        subl_macro_promotions.declare_defglobal($sym0$_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_);
    subl_macro_promotions.declare_defglobal($sym3$_REFORMULATOR_KB_LOADED__);
    {
      SubLObject item_var = $sym3$_REFORMULATOR_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym4$_SKSI_KB_LOADED__);
    {
      SubLObject item_var = $sym4$_SKSI_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym5$_PARAPHRASE_KB_LOADED__);
    {
      SubLObject item_var = $sym5$_PARAPHRASE_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym6$_NL_KB_LOADED__);
    {
      SubLObject item_var = $sym6$_NL_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym7$_LEXICON_KB_LOADED__);
    {
      SubLObject item_var = $sym7$_LEXICON_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym8$_RTP_KB_LOADED__);
    {
      SubLObject item_var = $sym8$_RTP_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym9$_RKF_KB_LOADED__);
    {
      SubLObject item_var = $sym9$_RKF_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym10$_THESAURUS_KB_LOADED__);
    {
      SubLObject item_var = $sym10$_THESAURUS_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym11$_QUANT_KB_LOADED__);
    {
      SubLObject item_var = $sym11$_QUANT_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym12$_TIME_KB_LOADED__);
    {
      SubLObject item_var = $sym12$_TIME_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym13$_DATE_KB_LOADED__);
    {
      SubLObject item_var = $sym13$_DATE_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym14$_CYC_TASK_SCHEDULER_KB_LOADED__);
    {
      SubLObject item_var = $sym14$_CYC_TASK_SCHEDULER_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym15$_WORDNET_KB_LOADED__);
    {
      SubLObject item_var = $sym15$_WORDNET_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym16$_CYC_SECURE_KB_LOADED__);
    {
      SubLObject item_var = $sym16$_CYC_SECURE_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym17$_PLANNER_KB_LOADED__);
    {
      SubLObject item_var = $sym17$_PLANNER_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    subl_macro_promotions.declare_defglobal($sym18$_KCT_KB_LOADED__);
    {
      SubLObject item_var = $sym18$_KCT_KB_LOADED__;
      if ((NIL == conses_high.member(item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
      }
    }
    {
      SubLObject item_var = $sym20$_FORWARD_INFERENCE_ENVIRONMENT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$fi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
      }
    }
    access_macros.register_macro_helper($sym21$RECORD_HL_TRANSCRIPT_OPERATION, $sym22$POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ = makeSymbol("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*");
  public static final SubLObject $const1$backchainForbiddenWhenUnboundInAr = constant_handles.reader_make_constant_shell(makeString("backchainForbiddenWhenUnboundInArg"));
  public static final SubLString $str2$_a__a__ = makeString("~a ~a~%");
  public static final SubLSymbol $sym3$_REFORMULATOR_KB_LOADED__ = makeSymbol("*REFORMULATOR-KB-LOADED?*");
  public static final SubLSymbol $sym4$_SKSI_KB_LOADED__ = makeSymbol("*SKSI-KB-LOADED?*");
  public static final SubLSymbol $sym5$_PARAPHRASE_KB_LOADED__ = makeSymbol("*PARAPHRASE-KB-LOADED?*");
  public static final SubLSymbol $sym6$_NL_KB_LOADED__ = makeSymbol("*NL-KB-LOADED?*");
  public static final SubLSymbol $sym7$_LEXICON_KB_LOADED__ = makeSymbol("*LEXICON-KB-LOADED?*");
  public static final SubLSymbol $sym8$_RTP_KB_LOADED__ = makeSymbol("*RTP-KB-LOADED?*");
  public static final SubLSymbol $sym9$_RKF_KB_LOADED__ = makeSymbol("*RKF-KB-LOADED?*");
  public static final SubLSymbol $sym10$_THESAURUS_KB_LOADED__ = makeSymbol("*THESAURUS-KB-LOADED?*");
  public static final SubLSymbol $sym11$_QUANT_KB_LOADED__ = makeSymbol("*QUANT-KB-LOADED?*");
  public static final SubLSymbol $sym12$_TIME_KB_LOADED__ = makeSymbol("*TIME-KB-LOADED?*");
  public static final SubLSymbol $sym13$_DATE_KB_LOADED__ = makeSymbol("*DATE-KB-LOADED?*");
  public static final SubLSymbol $sym14$_CYC_TASK_SCHEDULER_KB_LOADED__ = makeSymbol("*CYC-TASK-SCHEDULER-KB-LOADED?*");
  public static final SubLSymbol $sym15$_WORDNET_KB_LOADED__ = makeSymbol("*WORDNET-KB-LOADED?*");
  public static final SubLSymbol $sym16$_CYC_SECURE_KB_LOADED__ = makeSymbol("*CYC-SECURE-KB-LOADED?*");
  public static final SubLSymbol $sym17$_PLANNER_KB_LOADED__ = makeSymbol("*PLANNER-KB-LOADED?*");
  public static final SubLSymbol $sym18$_KCT_KB_LOADED__ = makeSymbol("*KCT-KB-LOADED?*");
  public static final SubLSymbol $kw19$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym20$_FORWARD_INFERENCE_ENVIRONMENT_ = makeSymbol("*FORWARD-INFERENCE-ENVIRONMENT*");
  public static final SubLSymbol $sym21$RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol("RECORD-HL-TRANSCRIPT-OPERATION");
  public static final SubLSymbol $sym22$POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol("POSSIBLY-RECORD-HL-TRANSCRIPT-OPERATION");

  //// Initializers

  public void declareFunctions() {
    declare_kb_control_vars_file();
  }

  public void initializeVariables() {
    init_kb_control_vars_file();
  }

  public void runTopLevelForms() {
    setup_kb_control_vars_file();
  }

}
