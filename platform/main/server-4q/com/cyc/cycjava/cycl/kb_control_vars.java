package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_control_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_control_vars";
  public static final String myFingerPrint = "daa44b52b07a18c40efd088f61f0a6d9208335c4e0a5482b774aa86929f84058";
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 848L)
  public static SubLSymbol $backchain_forbidden_unless_arg_chosen$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1067L)
  private static SubLSymbol $kb_features$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1609L)
  private static SubLSymbol $reformulator_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1723L)
  private static SubLSymbol $sksi_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1816L)
  private static SubLSymbol $paraphrase_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1932L)
  private static SubLSymbol $nl_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2099L)
  private static SubLSymbol $lexicon_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2262L)
  private static SubLSymbol $rtp_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2449L)
  private static SubLSymbol $rkf_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2615L)
  private static SubLSymbol $thesaurus_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2789L)
  private static SubLSymbol $quant_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2958L)
  private static SubLSymbol $time_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3116L)
  private static SubLSymbol $date_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3274L)
  private static SubLSymbol $fraction_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3386L)
  private static SubLSymbol $cyc_task_scheduler_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3564L)
  private static SubLSymbol $wordnet_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3720L)
  private static SubLSymbol $wordnet_import_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3893L)
  private static SubLSymbol $cyc_secure_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4054L)
  private static SubLSymbol $planner_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4214L)
  private static SubLSymbol $kct_kb_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4365L)
  public static SubLSymbol $forward_inference_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4446L)
  public static SubLSymbol $forward_propagate_from_negations$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4561L)
  public static SubLSymbol $forward_propagate_to_negations$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4688L)
  public static SubLSymbol $within_forward_inferenceP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4820L)
  public static SubLSymbol $within_assertion_forward_propagationP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4880L)
  public static SubLSymbol $relax_type_restrictions_for_nats$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4935L)
  public static SubLSymbol $forward_inference_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 5083L)
  public static SubLSymbol $forward_inference_allowed_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 5240L)
  public static SubLSymbol $forward_inference_forbidden_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 5410L)
  public static SubLSymbol $forward_inference_environment$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 5531L)
  public static SubLSymbol $recursive_ist_justificationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 5637L)
  public static SubLSymbol $recording_hl_transcript_operationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 5842L)
  public static SubLSymbol $hl_transcript_operations$;
  private static final SubLSymbol $sym0$_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_;
  private static final SubLObject $const1$backchainForbiddenWhenUnboundInAr;
  private static final SubLString $str2$_a__a__;
  private static final SubLSymbol $sym3$_REFORMULATOR_KB_LOADED__;
  private static final SubLSymbol $sym4$_SKSI_KB_LOADED__;
  private static final SubLSymbol $sym5$_PARAPHRASE_KB_LOADED__;
  private static final SubLSymbol $sym6$_NL_KB_LOADED__;
  private static final SubLSymbol $sym7$_LEXICON_KB_LOADED__;
  private static final SubLSymbol $sym8$_RTP_KB_LOADED__;
  private static final SubLSymbol $sym9$_RKF_KB_LOADED__;
  private static final SubLSymbol $sym10$_THESAURUS_KB_LOADED__;
  private static final SubLSymbol $sym11$_QUANT_KB_LOADED__;
  private static final SubLSymbol $sym12$_TIME_KB_LOADED__;
  private static final SubLSymbol $sym13$_DATE_KB_LOADED__;
  private static final SubLSymbol $sym14$_FRACTION_KB_LOADED__;
  private static final SubLSymbol $sym15$_CYC_TASK_SCHEDULER_KB_LOADED__;
  private static final SubLSymbol $sym16$_WORDNET_KB_LOADED__;
  private static final SubLSymbol $sym17$_WORDNET_IMPORT_KB_LOADED__;
  private static final SubLSymbol $sym18$_CYC_SECURE_KB_LOADED__;
  private static final SubLSymbol $sym19$_PLANNER_KB_LOADED__;
  private static final SubLSymbol $sym20$_KCT_KB_LOADED__;
  private static final SubLSymbol $kw21$ALL;
  private static final SubLSymbol $kw22$NONE;
  private static final SubLSymbol $kw23$UNINITIALIZED;
  private static final SubLSymbol $sym24$_FORWARD_INFERENCE_ENVIRONMENT_;
  private static final SubLSymbol $sym25$RECORD_HL_TRANSCRIPT_OPERATION;
  private static final SubLSymbol $sym26$POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION;

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1388L)
  public static SubLObject print_kb_features()
  {
    SubLObject cdolist_list_var = $kb_features$.getGlobalValue();
    SubLObject feature = NIL;
    feature = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( T, $str2$_a__a__, Symbols.symbol_name( feature ), Symbols.symbol_value( feature ) );
      cdolist_list_var = cdolist_list_var.rest();
      feature = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1609L)
  public static SubLObject reformulator_kb_loaded_p()
  {
    return $reformulator_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1609L)
  public static SubLObject set_reformulator_kb_loaded()
  {
    $reformulator_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1609L)
  public static SubLObject unset_reformulator_kb_loaded()
  {
    $reformulator_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1723L)
  public static SubLObject sksi_kb_loaded_p()
  {
    return $sksi_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1723L)
  public static SubLObject set_sksi_kb_loaded()
  {
    $sksi_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1723L)
  public static SubLObject unset_sksi_kb_loaded()
  {
    $sksi_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1816L)
  public static SubLObject paraphrase_kb_loaded_p()
  {
    return $paraphrase_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1816L)
  public static SubLObject set_paraphrase_kb_loaded()
  {
    $paraphrase_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1816L)
  public static SubLObject unset_paraphrase_kb_loaded()
  {
    $paraphrase_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1932L)
  public static SubLObject nl_kb_loaded_p()
  {
    return $nl_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1932L)
  public static SubLObject set_nl_kb_loaded()
  {
    $nl_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 1932L)
  public static SubLObject unset_nl_kb_loaded()
  {
    $nl_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2099L)
  public static SubLObject lexicon_kb_loaded_p()
  {
    return $lexicon_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2099L)
  public static SubLObject set_lexicon_kb_loaded()
  {
    $lexicon_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2099L)
  public static SubLObject unset_lexicon_kb_loaded()
  {
    $lexicon_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2262L)
  public static SubLObject rtp_kb_loaded_p()
  {
    return $rtp_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2262L)
  public static SubLObject set_rtp_kb_loaded()
  {
    $rtp_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2262L)
  public static SubLObject unset_rtp_kb_loaded()
  {
    $rtp_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2449L)
  public static SubLObject rkf_kb_loaded_p()
  {
    return $rkf_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2449L)
  public static SubLObject set_rkf_kb_loaded()
  {
    $rkf_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2449L)
  public static SubLObject unset_rkf_kb_loaded()
  {
    $rkf_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2615L)
  public static SubLObject thesaurus_kb_loaded_p()
  {
    return $thesaurus_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2615L)
  public static SubLObject set_thesaurus_kb_loaded()
  {
    $thesaurus_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2615L)
  public static SubLObject unset_thesaurus_kb_loaded()
  {
    $thesaurus_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2789L)
  public static SubLObject quant_kb_loaded_p()
  {
    return $quant_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2789L)
  public static SubLObject set_quant_kb_loaded()
  {
    $quant_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2789L)
  public static SubLObject unset_quant_kb_loaded()
  {
    $quant_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2958L)
  public static SubLObject time_kb_loaded_p()
  {
    return $time_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2958L)
  public static SubLObject set_time_kb_loaded()
  {
    $time_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 2958L)
  public static SubLObject unset_time_kb_loaded()
  {
    $time_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3116L)
  public static SubLObject date_kb_loaded_p()
  {
    return $date_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3116L)
  public static SubLObject set_date_kb_loaded()
  {
    $date_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3116L)
  public static SubLObject unset_date_kb_loaded()
  {
    $date_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3274L)
  public static SubLObject fraction_kb_loaded_p()
  {
    return $fraction_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3274L)
  public static SubLObject set_fraction_kb_loaded()
  {
    $fraction_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3274L)
  public static SubLObject unset_fraction_kb_loaded()
  {
    $fraction_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3386L)
  public static SubLObject cyc_task_scheduler_kb_loaded_p()
  {
    return $cyc_task_scheduler_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3386L)
  public static SubLObject set_cyc_task_scheduler_kb_loaded()
  {
    $cyc_task_scheduler_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3386L)
  public static SubLObject unset_cyc_task_scheduler_kb_loaded()
  {
    $cyc_task_scheduler_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3564L)
  public static SubLObject wordnet_kb_loaded_p()
  {
    return $wordnet_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3564L)
  public static SubLObject set_wordnet_kb_loaded()
  {
    $wordnet_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3564L)
  public static SubLObject unset_wordnet_kb_loaded()
  {
    $wordnet_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3720L)
  public static SubLObject wordnet_import_kb_loaded_p()
  {
    return $wordnet_import_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3720L)
  public static SubLObject set_wordnet_import_kb_loaded()
  {
    $wordnet_import_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3720L)
  public static SubLObject unset_wordnet_import_kb_loaded()
  {
    $wordnet_import_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3893L)
  public static SubLObject cyc_secure_kb_loaded_p()
  {
    return $cyc_secure_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3893L)
  public static SubLObject set_cyc_secure_kb_loaded()
  {
    $cyc_secure_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 3893L)
  public static SubLObject unset_cyc_secure_kb_loaded()
  {
    $cyc_secure_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4054L)
  public static SubLObject planner_kb_loaded_p()
  {
    return $planner_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4054L)
  public static SubLObject set_planner_kb_loaded()
  {
    $planner_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4054L)
  public static SubLObject unset_planner_kb_loaded()
  {
    $planner_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4214L)
  public static SubLObject kct_kb_loaded_p()
  {
    return $kct_kb_loadedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4214L)
  public static SubLObject set_kct_kb_loaded()
  {
    $kct_kb_loadedP$.setGlobalValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4214L)
  public static SubLObject unset_kct_kb_loaded()
  {
    $kct_kb_loadedP$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 4736L)
  public static SubLObject within_forward_inferenceP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_forward_inferenceP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-control-vars.lisp", position = 5959L)
  public static SubLObject record_hl_transcript_operation(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $hl_transcript_operations$.setDynamicValue( ConsesLow.cons( form, $hl_transcript_operations$.getDynamicValue( thread ) ), thread );
    return form;
  }

  public static SubLObject declare_kb_control_vars_file()
  {
    SubLFiles.declareFunction( me, "print_kb_features", "PRINT-KB-FEATURES", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_kb_loaded_p", "REFORMULATOR-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_reformulator_kb_loaded", "SET-REFORMULATOR-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_reformulator_kb_loaded", "UNSET-REFORMULATOR-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_kb_loaded_p", "SKSI-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_sksi_kb_loaded", "SET-SKSI-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_sksi_kb_loaded", "UNSET-SKSI-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "paraphrase_kb_loaded_p", "PARAPHRASE-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_paraphrase_kb_loaded", "SET-PARAPHRASE-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_paraphrase_kb_loaded", "UNSET-PARAPHRASE-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_kb_loaded_p", "NL-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_nl_kb_loaded", "SET-NL-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_nl_kb_loaded", "UNSET-NL-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "lexicon_kb_loaded_p", "LEXICON-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_lexicon_kb_loaded", "SET-LEXICON-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_lexicon_kb_loaded", "UNSET-LEXICON-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "rtp_kb_loaded_p", "RTP-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_rtp_kb_loaded", "SET-RTP-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_rtp_kb_loaded", "UNSET-RTP-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_kb_loaded_p", "RKF-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_rkf_kb_loaded", "SET-RKF-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_rkf_kb_loaded", "UNSET-RKF-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "thesaurus_kb_loaded_p", "THESAURUS-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_thesaurus_kb_loaded", "SET-THESAURUS-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_thesaurus_kb_loaded", "UNSET-THESAURUS-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "quant_kb_loaded_p", "QUANT-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_quant_kb_loaded", "SET-QUANT-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_quant_kb_loaded", "UNSET-QUANT-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "time_kb_loaded_p", "TIME-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_time_kb_loaded", "SET-TIME-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_time_kb_loaded", "UNSET-TIME-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "date_kb_loaded_p", "DATE-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_date_kb_loaded", "SET-DATE-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_date_kb_loaded", "UNSET-DATE-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "fraction_kb_loaded_p", "FRACTION-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_fraction_kb_loaded", "SET-FRACTION-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_fraction_kb_loaded", "UNSET-FRACTION-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_task_scheduler_kb_loaded_p", "CYC-TASK-SCHEDULER-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_task_scheduler_kb_loaded", "SET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_cyc_task_scheduler_kb_loaded", "UNSET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "wordnet_kb_loaded_p", "WORDNET-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_wordnet_kb_loaded", "SET-WORDNET-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_wordnet_kb_loaded", "UNSET-WORDNET-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "wordnet_import_kb_loaded_p", "WORDNET-IMPORT-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_wordnet_import_kb_loaded", "SET-WORDNET-IMPORT-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_wordnet_import_kb_loaded", "UNSET-WORDNET-IMPORT-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_secure_kb_loaded_p", "CYC-SECURE-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_secure_kb_loaded", "SET-CYC-SECURE-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_cyc_secure_kb_loaded", "UNSET-CYC-SECURE-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "planner_kb_loaded_p", "PLANNER-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_planner_kb_loaded", "SET-PLANNER-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_planner_kb_loaded", "UNSET-PLANNER-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "kct_kb_loaded_p", "KCT-KB-LOADED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "set_kct_kb_loaded", "SET-KCT-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "unset_kct_kb_loaded", "UNSET-KCT-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "within_forward_inferenceP", "WITHIN-FORWARD-INFERENCE?", 0, 0, false );
    SubLFiles.declareFunction( me, "record_hl_transcript_operation", "RECORD-HL-TRANSCRIPT-OPERATION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_control_vars_file()
  {
    $backchain_forbidden_unless_arg_chosen$ = SubLFiles.deflexical( "*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*", maybeDefault( $sym0$_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_, $backchain_forbidden_unless_arg_chosen$,
        $const1$backchainForbiddenWhenUnboundInAr ) );
    $kb_features$ = SubLFiles.deflexical( "*KB-FEATURES*", NIL );
    $reformulator_kb_loadedP$ = SubLFiles.deflexical( "*REFORMULATOR-KB-LOADED?*", ( maybeDefault( $sym3$_REFORMULATOR_KB_LOADED__, $reformulator_kb_loadedP$, NIL ) ) );
    $sksi_kb_loadedP$ = SubLFiles.deflexical( "*SKSI-KB-LOADED?*", ( maybeDefault( $sym4$_SKSI_KB_LOADED__, $sksi_kb_loadedP$, NIL ) ) );
    $paraphrase_kb_loadedP$ = SubLFiles.deflexical( "*PARAPHRASE-KB-LOADED?*", ( maybeDefault( $sym5$_PARAPHRASE_KB_LOADED__, $paraphrase_kb_loadedP$, NIL ) ) );
    $nl_kb_loadedP$ = SubLFiles.deflexical( "*NL-KB-LOADED?*", ( maybeDefault( $sym6$_NL_KB_LOADED__, $nl_kb_loadedP$, NIL ) ) );
    $lexicon_kb_loadedP$ = SubLFiles.deflexical( "*LEXICON-KB-LOADED?*", ( maybeDefault( $sym7$_LEXICON_KB_LOADED__, $lexicon_kb_loadedP$, NIL ) ) );
    $rtp_kb_loadedP$ = SubLFiles.deflexical( "*RTP-KB-LOADED?*", ( maybeDefault( $sym8$_RTP_KB_LOADED__, $rtp_kb_loadedP$, NIL ) ) );
    $rkf_kb_loadedP$ = SubLFiles.deflexical( "*RKF-KB-LOADED?*", ( maybeDefault( $sym9$_RKF_KB_LOADED__, $rkf_kb_loadedP$, NIL ) ) );
    $thesaurus_kb_loadedP$ = SubLFiles.deflexical( "*THESAURUS-KB-LOADED?*", ( maybeDefault( $sym10$_THESAURUS_KB_LOADED__, $thesaurus_kb_loadedP$, NIL ) ) );
    $quant_kb_loadedP$ = SubLFiles.deflexical( "*QUANT-KB-LOADED?*", ( maybeDefault( $sym11$_QUANT_KB_LOADED__, $quant_kb_loadedP$, NIL ) ) );
    $time_kb_loadedP$ = SubLFiles.deflexical( "*TIME-KB-LOADED?*", ( maybeDefault( $sym12$_TIME_KB_LOADED__, $time_kb_loadedP$, NIL ) ) );
    $date_kb_loadedP$ = SubLFiles.deflexical( "*DATE-KB-LOADED?*", ( maybeDefault( $sym13$_DATE_KB_LOADED__, $date_kb_loadedP$, NIL ) ) );
    $fraction_kb_loadedP$ = SubLFiles.deflexical( "*FRACTION-KB-LOADED?*", ( maybeDefault( $sym14$_FRACTION_KB_LOADED__, $fraction_kb_loadedP$, NIL ) ) );
    $cyc_task_scheduler_kb_loadedP$ = SubLFiles.deflexical( "*CYC-TASK-SCHEDULER-KB-LOADED?*", ( maybeDefault( $sym15$_CYC_TASK_SCHEDULER_KB_LOADED__, $cyc_task_scheduler_kb_loadedP$, NIL ) ) );
    $wordnet_kb_loadedP$ = SubLFiles.deflexical( "*WORDNET-KB-LOADED?*", ( maybeDefault( $sym16$_WORDNET_KB_LOADED__, $wordnet_kb_loadedP$, NIL ) ) );
    $wordnet_import_kb_loadedP$ = SubLFiles.deflexical( "*WORDNET-IMPORT-KB-LOADED?*", ( maybeDefault( $sym17$_WORDNET_IMPORT_KB_LOADED__, $wordnet_import_kb_loadedP$, NIL ) ) );
    $cyc_secure_kb_loadedP$ = SubLFiles.deflexical( "*CYC-SECURE-KB-LOADED?*", ( maybeDefault( $sym18$_CYC_SECURE_KB_LOADED__, $cyc_secure_kb_loadedP$, NIL ) ) );
    $planner_kb_loadedP$ = SubLFiles.deflexical( "*PLANNER-KB-LOADED?*", ( maybeDefault( $sym19$_PLANNER_KB_LOADED__, $planner_kb_loadedP$, NIL ) ) );
    $kct_kb_loadedP$ = SubLFiles.deflexical( "*KCT-KB-LOADED?*", ( maybeDefault( $sym20$_KCT_KB_LOADED__, $kct_kb_loadedP$, NIL ) ) );
    $forward_inference_enabledP$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-ENABLED?*", T );
    $forward_propagate_from_negations$ = SubLFiles.defparameter( "*FORWARD-PROPAGATE-FROM-NEGATIONS*", T );
    $forward_propagate_to_negations$ = SubLFiles.defparameter( "*FORWARD-PROPAGATE-TO-NEGATIONS*", NIL );
    $within_forward_inferenceP$ = SubLFiles.defparameter( "*WITHIN-FORWARD-INFERENCE?*", NIL );
    $within_assertion_forward_propagationP$ = SubLFiles.defparameter( "*WITHIN-ASSERTION-FORWARD-PROPAGATION?*", NIL );
    $relax_type_restrictions_for_nats$ = SubLFiles.defparameter( "*RELAX-TYPE-RESTRICTIONS-FOR-NATS*", NIL );
    $forward_inference_time_cutoff$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-TIME-CUTOFF*", NIL );
    $forward_inference_allowed_rules$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-ALLOWED-RULES*", $kw21$ALL );
    $forward_inference_forbidden_rules$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-FORBIDDEN-RULES*", $kw22$NONE );
    $forward_inference_environment$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-ENVIRONMENT*", $kw23$UNINITIALIZED );
    $recursive_ist_justificationsP$ = SubLFiles.defparameter( "*RECURSIVE-IST-JUSTIFICATIONS?*", T );
    $recording_hl_transcript_operationsP$ = SubLFiles.defparameter( "*RECORDING-HL-TRANSCRIPT-OPERATIONS?*", NIL );
    $hl_transcript_operations$ = SubLFiles.defparameter( "*HL-TRANSCRIPT-OPERATIONS*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_control_vars_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ );
    subl_macro_promotions.declare_defglobal( $sym3$_REFORMULATOR_KB_LOADED__ );
    SubLObject item_var = $sym3$_REFORMULATOR_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym4$_SKSI_KB_LOADED__ );
    item_var = $sym4$_SKSI_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym5$_PARAPHRASE_KB_LOADED__ );
    item_var = $sym5$_PARAPHRASE_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym6$_NL_KB_LOADED__ );
    item_var = $sym6$_NL_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym7$_LEXICON_KB_LOADED__ );
    item_var = $sym7$_LEXICON_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym8$_RTP_KB_LOADED__ );
    item_var = $sym8$_RTP_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym9$_RKF_KB_LOADED__ );
    item_var = $sym9$_RKF_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym10$_THESAURUS_KB_LOADED__ );
    item_var = $sym10$_THESAURUS_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym11$_QUANT_KB_LOADED__ );
    item_var = $sym11$_QUANT_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym12$_TIME_KB_LOADED__ );
    item_var = $sym12$_TIME_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym13$_DATE_KB_LOADED__ );
    item_var = $sym13$_DATE_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym14$_FRACTION_KB_LOADED__ );
    item_var = $sym14$_FRACTION_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym15$_CYC_TASK_SCHEDULER_KB_LOADED__ );
    item_var = $sym15$_CYC_TASK_SCHEDULER_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym16$_WORDNET_KB_LOADED__ );
    item_var = $sym16$_WORDNET_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym17$_WORDNET_IMPORT_KB_LOADED__ );
    item_var = $sym17$_WORDNET_IMPORT_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym18$_CYC_SECURE_KB_LOADED__ );
    item_var = $sym18$_CYC_SECURE_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym19$_PLANNER_KB_LOADED__ );
    item_var = $sym19$_PLANNER_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym20$_KCT_KB_LOADED__ );
    item_var = $sym20$_KCT_KB_LOADED__;
    if( NIL == conses_high.member( item_var, $kb_features$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kb_features$.setGlobalValue( ConsesLow.cons( item_var, $kb_features$.getGlobalValue() ) );
    }
    utilities_macros.register_html_state_variable( $sym24$_FORWARD_INFERENCE_ENVIRONMENT_ );
    item_var = $sym24$_FORWARD_INFERENCE_ENVIRONMENT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$fi_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$fi_state_variables$.getGlobalValue() ) );
    }
    access_macros.register_macro_helper( $sym25$RECORD_HL_TRANSCRIPT_OPERATION, $sym26$POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_control_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_control_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_control_vars_file();
  }
  static
  {
    me = new kb_control_vars();
    $backchain_forbidden_unless_arg_chosen$ = null;
    $kb_features$ = null;
    $reformulator_kb_loadedP$ = null;
    $sksi_kb_loadedP$ = null;
    $paraphrase_kb_loadedP$ = null;
    $nl_kb_loadedP$ = null;
    $lexicon_kb_loadedP$ = null;
    $rtp_kb_loadedP$ = null;
    $rkf_kb_loadedP$ = null;
    $thesaurus_kb_loadedP$ = null;
    $quant_kb_loadedP$ = null;
    $time_kb_loadedP$ = null;
    $date_kb_loadedP$ = null;
    $fraction_kb_loadedP$ = null;
    $cyc_task_scheduler_kb_loadedP$ = null;
    $wordnet_kb_loadedP$ = null;
    $wordnet_import_kb_loadedP$ = null;
    $cyc_secure_kb_loadedP$ = null;
    $planner_kb_loadedP$ = null;
    $kct_kb_loadedP$ = null;
    $forward_inference_enabledP$ = null;
    $forward_propagate_from_negations$ = null;
    $forward_propagate_to_negations$ = null;
    $within_forward_inferenceP$ = null;
    $within_assertion_forward_propagationP$ = null;
    $relax_type_restrictions_for_nats$ = null;
    $forward_inference_time_cutoff$ = null;
    $forward_inference_allowed_rules$ = null;
    $forward_inference_forbidden_rules$ = null;
    $forward_inference_environment$ = null;
    $recursive_ist_justificationsP$ = null;
    $recording_hl_transcript_operationsP$ = null;
    $hl_transcript_operations$ = null;
    $sym0$_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ = makeSymbol( "*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*" );
    $const1$backchainForbiddenWhenUnboundInAr = constant_handles.reader_make_constant_shell( makeString( "backchainForbiddenWhenUnboundInArg" ) );
    $str2$_a__a__ = makeString( "~a ~a~%" );
    $sym3$_REFORMULATOR_KB_LOADED__ = makeSymbol( "*REFORMULATOR-KB-LOADED?*" );
    $sym4$_SKSI_KB_LOADED__ = makeSymbol( "*SKSI-KB-LOADED?*" );
    $sym5$_PARAPHRASE_KB_LOADED__ = makeSymbol( "*PARAPHRASE-KB-LOADED?*" );
    $sym6$_NL_KB_LOADED__ = makeSymbol( "*NL-KB-LOADED?*" );
    $sym7$_LEXICON_KB_LOADED__ = makeSymbol( "*LEXICON-KB-LOADED?*" );
    $sym8$_RTP_KB_LOADED__ = makeSymbol( "*RTP-KB-LOADED?*" );
    $sym9$_RKF_KB_LOADED__ = makeSymbol( "*RKF-KB-LOADED?*" );
    $sym10$_THESAURUS_KB_LOADED__ = makeSymbol( "*THESAURUS-KB-LOADED?*" );
    $sym11$_QUANT_KB_LOADED__ = makeSymbol( "*QUANT-KB-LOADED?*" );
    $sym12$_TIME_KB_LOADED__ = makeSymbol( "*TIME-KB-LOADED?*" );
    $sym13$_DATE_KB_LOADED__ = makeSymbol( "*DATE-KB-LOADED?*" );
    $sym14$_FRACTION_KB_LOADED__ = makeSymbol( "*FRACTION-KB-LOADED?*" );
    $sym15$_CYC_TASK_SCHEDULER_KB_LOADED__ = makeSymbol( "*CYC-TASK-SCHEDULER-KB-LOADED?*" );
    $sym16$_WORDNET_KB_LOADED__ = makeSymbol( "*WORDNET-KB-LOADED?*" );
    $sym17$_WORDNET_IMPORT_KB_LOADED__ = makeSymbol( "*WORDNET-IMPORT-KB-LOADED?*" );
    $sym18$_CYC_SECURE_KB_LOADED__ = makeSymbol( "*CYC-SECURE-KB-LOADED?*" );
    $sym19$_PLANNER_KB_LOADED__ = makeSymbol( "*PLANNER-KB-LOADED?*" );
    $sym20$_KCT_KB_LOADED__ = makeSymbol( "*KCT-KB-LOADED?*" );
    $kw21$ALL = makeKeyword( "ALL" );
    $kw22$NONE = makeKeyword( "NONE" );
    $kw23$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym24$_FORWARD_INFERENCE_ENVIRONMENT_ = makeSymbol( "*FORWARD-INFERENCE-ENVIRONMENT*" );
    $sym25$RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol( "RECORD-HL-TRANSCRIPT-OPERATION" );
    $sym26$POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol( "POSSIBLY-RECORD-HL-TRANSCRIPT-OPERATION" );
  }
}
/*
 * 
 * Total time: 276 ms
 * 
 */