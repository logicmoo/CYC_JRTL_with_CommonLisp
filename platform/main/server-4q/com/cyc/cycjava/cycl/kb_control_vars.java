package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.kb_control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kb_control_vars extends SubLTranslatedFile {
    public static final SubLFile me = new kb_control_vars();

    public static final String myName = "com.cyc.cycjava.cycl.kb_control_vars";

    public static final String myFingerPrint = "daa44b52b07a18c40efd088f61f0a6d9208335c4e0a5482b774aa86929f84058";



    // deflexical
    private static final SubLSymbol $kb_features$ = makeSymbol("*KB-FEATURES*");

    // deflexical
    private static final SubLSymbol $reformulator_kb_loadedP$ = makeSymbol("*REFORMULATOR-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $sksi_kb_loadedP$ = makeSymbol("*SKSI-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $paraphrase_kb_loadedP$ = makeSymbol("*PARAPHRASE-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $nl_kb_loadedP$ = makeSymbol("*NL-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $lexicon_kb_loadedP$ = makeSymbol("*LEXICON-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $rtp_kb_loadedP$ = makeSymbol("*RTP-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $rkf_kb_loadedP$ = makeSymbol("*RKF-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $thesaurus_kb_loadedP$ = makeSymbol("*THESAURUS-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $quant_kb_loadedP$ = makeSymbol("*QUANT-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $time_kb_loadedP$ = makeSymbol("*TIME-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $date_kb_loadedP$ = makeSymbol("*DATE-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $fraction_kb_loadedP$ = makeSymbol("*FRACTION-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $cyc_task_scheduler_kb_loadedP$ = makeSymbol("*CYC-TASK-SCHEDULER-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $wordnet_kb_loadedP$ = makeSymbol("*WORDNET-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $wordnet_import_kb_loadedP$ = makeSymbol("*WORDNET-IMPORT-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $cyc_secure_kb_loadedP$ = makeSymbol("*CYC-SECURE-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $planner_kb_loadedP$ = makeSymbol("*PLANNER-KB-LOADED?*");

    // deflexical
    private static final SubLSymbol $kct_kb_loadedP$ = makeSymbol("*KCT-KB-LOADED?*");

    // defparameter
    public static final SubLSymbol $forward_inference_enabledP$ = makeSymbol("*FORWARD-INFERENCE-ENABLED?*");

    // defparameter
    // Do we allow forward propagation from negated gafs.
    public static final SubLSymbol $forward_propagate_from_negations$ = makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*");

    // defparameter
    // Do we allow conclusion of negated gafs in forward propagation.
    public static final SubLSymbol $forward_propagate_to_negations$ = makeSymbol("*FORWARD-PROPAGATE-TO-NEGATIONS*");

    // defparameter
    public static final SubLSymbol $within_forward_inferenceP$ = makeSymbol("*WITHIN-FORWARD-INFERENCE?*");

    // defparameter
    public static final SubLSymbol $within_assertion_forward_propagationP$ = makeSymbol("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*");

    // defparameter
    public static final SubLSymbol $relax_type_restrictions_for_nats$ = makeSymbol("*RELAX-TYPE-RESTRICTIONS-FOR-NATS*");

    // defparameter
    /**
     * Amount of time we are willing to spend on each forward inference. NIL means
     * unlimited time.
     */
    public static final SubLSymbol $forward_inference_time_cutoff$ = makeSymbol("*FORWARD-INFERENCE-TIME-CUTOFF*");

    // defparameter
    /**
     * When a value other than :all, the list of the only rules allowed for forward
     * inference.
     */
    public static final SubLSymbol $forward_inference_allowed_rules$ = makeSymbol("*FORWARD-INFERENCE-ALLOWED-RULES*");

    // defparameter
    public static final SubLSymbol $forward_inference_forbidden_rules$ = makeSymbol("*FORWARD-INFERENCE-FORBIDDEN-RULES*");



    // defparameter
    // Do we give full justifications for ist gafs?
    public static final SubLSymbol $recursive_ist_justificationsP$ = makeSymbol("*RECURSIVE-IST-JUSTIFICATIONS?*");

    // defparameter
    // Whether the HL storage modules should store the operations they perform
    public static final SubLSymbol $recording_hl_transcript_operationsP$ = makeSymbol("*RECORDING-HL-TRANSCRIPT-OPERATIONS?*");

    // defparameter
    // A list of the operations noted by the HL storage modules
    public static final SubLSymbol $hl_transcript_operations$ = makeSymbol("*HL-TRANSCRIPT-OPERATIONS*");

    // Internal Constants
    public static final SubLSymbol $backchain_forbidden_unless_arg_chosen$ = makeSymbol("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*");

    private static final SubLObject $const1$backchainForbiddenWhenUnboundInAr = reader_make_constant_shell(makeString("backchainForbiddenWhenUnboundInArg"));

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

    private static final SubLSymbol $sym14$_FRACTION_KB_LOADED__ = makeSymbol("*FRACTION-KB-LOADED?*");

    private static final SubLSymbol $sym15$_CYC_TASK_SCHEDULER_KB_LOADED__ = makeSymbol("*CYC-TASK-SCHEDULER-KB-LOADED?*");

    private static final SubLSymbol $sym16$_WORDNET_KB_LOADED__ = makeSymbol("*WORDNET-KB-LOADED?*");

    private static final SubLSymbol $sym17$_WORDNET_IMPORT_KB_LOADED__ = makeSymbol("*WORDNET-IMPORT-KB-LOADED?*");

    private static final SubLSymbol $sym18$_CYC_SECURE_KB_LOADED__ = makeSymbol("*CYC-SECURE-KB-LOADED?*");

    private static final SubLSymbol $sym19$_PLANNER_KB_LOADED__ = makeSymbol("*PLANNER-KB-LOADED?*");

    private static final SubLSymbol $sym20$_KCT_KB_LOADED__ = makeSymbol("*KCT-KB-LOADED?*");







    public static final SubLSymbol $forward_inference_environment$ = makeSymbol("*FORWARD-INFERENCE-ENVIRONMENT*");

    private static final SubLSymbol RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol("RECORD-HL-TRANSCRIPT-OPERATION");

    private static final SubLSymbol POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol("POSSIBLY-RECORD-HL-TRANSCRIPT-OPERATION");

    public static SubLObject print_kb_features() {
        SubLObject cdolist_list_var = $kb_features$.getGlobalValue();
        SubLObject feature = NIL;
        feature = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str2$_a__a__, symbol_name(feature), symbol_value(feature));
            cdolist_list_var = cdolist_list_var.rest();
            feature = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reformulator_kb_loaded_p() {
        return $reformulator_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_reformulator_kb_loaded() {
        $reformulator_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_reformulator_kb_loaded() {
        $reformulator_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject sksi_kb_loaded_p() {
        return $sksi_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_sksi_kb_loaded() {
        $sksi_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_sksi_kb_loaded() {
        $sksi_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject paraphrase_kb_loaded_p() {
        return $paraphrase_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_paraphrase_kb_loaded() {
        $paraphrase_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_paraphrase_kb_loaded() {
        $paraphrase_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject nl_kb_loaded_p() {
        return $nl_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_nl_kb_loaded() {
        $nl_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_nl_kb_loaded() {
        $nl_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject lexicon_kb_loaded_p() {
        return $lexicon_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_lexicon_kb_loaded() {
        $lexicon_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_lexicon_kb_loaded() {
        $lexicon_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject rtp_kb_loaded_p() {
        return $rtp_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_rtp_kb_loaded() {
        $rtp_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_rtp_kb_loaded() {
        $rtp_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject rkf_kb_loaded_p() {
        return $rkf_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_rkf_kb_loaded() {
        $rkf_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_rkf_kb_loaded() {
        $rkf_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject thesaurus_kb_loaded_p() {
        return $thesaurus_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_thesaurus_kb_loaded() {
        $thesaurus_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_thesaurus_kb_loaded() {
        $thesaurus_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject quant_kb_loaded_p() {
        return $quant_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_quant_kb_loaded() {
        $quant_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_quant_kb_loaded() {
        $quant_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject time_kb_loaded_p() {
        return $time_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_time_kb_loaded() {
        $time_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_time_kb_loaded() {
        $time_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject date_kb_loaded_p() {
        return $date_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_date_kb_loaded() {
        $date_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_date_kb_loaded() {
        $date_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject fraction_kb_loaded_p() {
        return $fraction_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_fraction_kb_loaded() {
        $fraction_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_fraction_kb_loaded() {
        $fraction_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject cyc_task_scheduler_kb_loaded_p() {
        return $cyc_task_scheduler_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_cyc_task_scheduler_kb_loaded() {
        $cyc_task_scheduler_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_cyc_task_scheduler_kb_loaded() {
        $cyc_task_scheduler_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject wordnet_kb_loaded_p() {
        return $wordnet_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_wordnet_kb_loaded() {
        $wordnet_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_wordnet_kb_loaded() {
        $wordnet_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject wordnet_import_kb_loaded_p() {
        return $wordnet_import_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_wordnet_import_kb_loaded() {
        $wordnet_import_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_wordnet_import_kb_loaded() {
        $wordnet_import_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject cyc_secure_kb_loaded_p() {
        return $cyc_secure_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_cyc_secure_kb_loaded() {
        $cyc_secure_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_cyc_secure_kb_loaded() {
        $cyc_secure_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject planner_kb_loaded_p() {
        return $planner_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_planner_kb_loaded() {
        $planner_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_planner_kb_loaded() {
        $planner_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject kct_kb_loaded_p() {
        return $kct_kb_loadedP$.getGlobalValue();
    }

    public static SubLObject set_kct_kb_loaded() {
        $kct_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject unset_kct_kb_loaded() {
        $kct_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject within_forward_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_forward_inferenceP$.getDynamicValue(thread);
    }

    public static SubLObject record_hl_transcript_operation(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hl_transcript_operations$.setDynamicValue(cons(form, $hl_transcript_operations$.getDynamicValue(thread)), thread);
        return form;
    }

    public static SubLObject declare_kb_control_vars_file() {
        declareFunction(me, "print_kb_features", "PRINT-KB-FEATURES", 0, 0, false);
        declareFunction(me, "reformulator_kb_loaded_p", "REFORMULATOR-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_reformulator_kb_loaded", "SET-REFORMULATOR-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_reformulator_kb_loaded", "UNSET-REFORMULATOR-KB-LOADED", 0, 0, false);
        declareFunction(me, "sksi_kb_loaded_p", "SKSI-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_sksi_kb_loaded", "SET-SKSI-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_sksi_kb_loaded", "UNSET-SKSI-KB-LOADED", 0, 0, false);
        declareFunction(me, "paraphrase_kb_loaded_p", "PARAPHRASE-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_paraphrase_kb_loaded", "SET-PARAPHRASE-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_paraphrase_kb_loaded", "UNSET-PARAPHRASE-KB-LOADED", 0, 0, false);
        declareFunction(me, "nl_kb_loaded_p", "NL-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_nl_kb_loaded", "SET-NL-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_nl_kb_loaded", "UNSET-NL-KB-LOADED", 0, 0, false);
        declareFunction(me, "lexicon_kb_loaded_p", "LEXICON-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_lexicon_kb_loaded", "SET-LEXICON-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_lexicon_kb_loaded", "UNSET-LEXICON-KB-LOADED", 0, 0, false);
        declareFunction(me, "rtp_kb_loaded_p", "RTP-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_rtp_kb_loaded", "SET-RTP-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_rtp_kb_loaded", "UNSET-RTP-KB-LOADED", 0, 0, false);
        declareFunction(me, "rkf_kb_loaded_p", "RKF-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_rkf_kb_loaded", "SET-RKF-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_rkf_kb_loaded", "UNSET-RKF-KB-LOADED", 0, 0, false);
        declareFunction(me, "thesaurus_kb_loaded_p", "THESAURUS-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_thesaurus_kb_loaded", "SET-THESAURUS-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_thesaurus_kb_loaded", "UNSET-THESAURUS-KB-LOADED", 0, 0, false);
        declareFunction(me, "quant_kb_loaded_p", "QUANT-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_quant_kb_loaded", "SET-QUANT-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_quant_kb_loaded", "UNSET-QUANT-KB-LOADED", 0, 0, false);
        declareFunction(me, "time_kb_loaded_p", "TIME-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_time_kb_loaded", "SET-TIME-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_time_kb_loaded", "UNSET-TIME-KB-LOADED", 0, 0, false);
        declareFunction(me, "date_kb_loaded_p", "DATE-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_date_kb_loaded", "SET-DATE-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_date_kb_loaded", "UNSET-DATE-KB-LOADED", 0, 0, false);
        declareFunction(me, "fraction_kb_loaded_p", "FRACTION-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_fraction_kb_loaded", "SET-FRACTION-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_fraction_kb_loaded", "UNSET-FRACTION-KB-LOADED", 0, 0, false);
        declareFunction(me, "cyc_task_scheduler_kb_loaded_p", "CYC-TASK-SCHEDULER-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_cyc_task_scheduler_kb_loaded", "SET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_cyc_task_scheduler_kb_loaded", "UNSET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false);
        declareFunction(me, "wordnet_kb_loaded_p", "WORDNET-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_wordnet_kb_loaded", "SET-WORDNET-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_wordnet_kb_loaded", "UNSET-WORDNET-KB-LOADED", 0, 0, false);
        declareFunction(me, "wordnet_import_kb_loaded_p", "WORDNET-IMPORT-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_wordnet_import_kb_loaded", "SET-WORDNET-IMPORT-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_wordnet_import_kb_loaded", "UNSET-WORDNET-IMPORT-KB-LOADED", 0, 0, false);
        declareFunction(me, "cyc_secure_kb_loaded_p", "CYC-SECURE-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_cyc_secure_kb_loaded", "SET-CYC-SECURE-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_cyc_secure_kb_loaded", "UNSET-CYC-SECURE-KB-LOADED", 0, 0, false);
        declareFunction(me, "planner_kb_loaded_p", "PLANNER-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_planner_kb_loaded", "SET-PLANNER-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_planner_kb_loaded", "UNSET-PLANNER-KB-LOADED", 0, 0, false);
        declareFunction(me, "kct_kb_loaded_p", "KCT-KB-LOADED-P", 0, 0, false);
        declareFunction(me, "set_kct_kb_loaded", "SET-KCT-KB-LOADED", 0, 0, false);
        declareFunction(me, "unset_kct_kb_loaded", "UNSET-KCT-KB-LOADED", 0, 0, false);
        declareFunction(me, "within_forward_inferenceP", "WITHIN-FORWARD-INFERENCE?", 0, 0, false);
        declareFunction(me, "record_hl_transcript_operation", "RECORD-HL-TRANSCRIPT-OPERATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_control_vars_file() {
        deflexical("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*", SubLTrampolineFile.maybeDefault($backchain_forbidden_unless_arg_chosen$, $backchain_forbidden_unless_arg_chosen$, $const1$backchainForbiddenWhenUnboundInAr));
        deflexical("*KB-FEATURES*", NIL);
        deflexical("*REFORMULATOR-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym3$_REFORMULATOR_KB_LOADED__, $reformulator_kb_loadedP$, NIL));
        deflexical("*SKSI-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym4$_SKSI_KB_LOADED__, $sksi_kb_loadedP$, NIL));
        deflexical("*PARAPHRASE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym5$_PARAPHRASE_KB_LOADED__, $paraphrase_kb_loadedP$, NIL));
        deflexical("*NL-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym6$_NL_KB_LOADED__, $nl_kb_loadedP$, NIL));
        deflexical("*LEXICON-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym7$_LEXICON_KB_LOADED__, $lexicon_kb_loadedP$, NIL));
        deflexical("*RTP-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym8$_RTP_KB_LOADED__, $rtp_kb_loadedP$, NIL));
        deflexical("*RKF-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym9$_RKF_KB_LOADED__, $rkf_kb_loadedP$, NIL));
        deflexical("*THESAURUS-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym10$_THESAURUS_KB_LOADED__, $thesaurus_kb_loadedP$, NIL));
        deflexical("*QUANT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym11$_QUANT_KB_LOADED__, $quant_kb_loadedP$, NIL));
        deflexical("*TIME-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym12$_TIME_KB_LOADED__, $time_kb_loadedP$, NIL));
        deflexical("*DATE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym13$_DATE_KB_LOADED__, $date_kb_loadedP$, NIL));
        deflexical("*FRACTION-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym14$_FRACTION_KB_LOADED__, $fraction_kb_loadedP$, NIL));
        deflexical("*CYC-TASK-SCHEDULER-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym15$_CYC_TASK_SCHEDULER_KB_LOADED__, $cyc_task_scheduler_kb_loadedP$, NIL));
        deflexical("*WORDNET-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym16$_WORDNET_KB_LOADED__, $wordnet_kb_loadedP$, NIL));
        deflexical("*WORDNET-IMPORT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym17$_WORDNET_IMPORT_KB_LOADED__, $wordnet_import_kb_loadedP$, NIL));
        deflexical("*CYC-SECURE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym18$_CYC_SECURE_KB_LOADED__, $cyc_secure_kb_loadedP$, NIL));
        deflexical("*PLANNER-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym19$_PLANNER_KB_LOADED__, $planner_kb_loadedP$, NIL));
        deflexical("*KCT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sym20$_KCT_KB_LOADED__, $kct_kb_loadedP$, NIL));
        defparameter("*FORWARD-INFERENCE-ENABLED?*", T);
        defparameter("*FORWARD-PROPAGATE-FROM-NEGATIONS*", T);
        defparameter("*FORWARD-PROPAGATE-TO-NEGATIONS*", NIL);
        defparameter("*WITHIN-FORWARD-INFERENCE?*", NIL);
        defparameter("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*", NIL);
        defparameter("*RELAX-TYPE-RESTRICTIONS-FOR-NATS*", NIL);
        defparameter("*FORWARD-INFERENCE-TIME-CUTOFF*", NIL);
        defparameter("*FORWARD-INFERENCE-ALLOWED-RULES*", $ALL);
        defparameter("*FORWARD-INFERENCE-FORBIDDEN-RULES*", $NONE);
        defparameter("*FORWARD-INFERENCE-ENVIRONMENT*", $UNINITIALIZED);
        defparameter("*RECURSIVE-IST-JUSTIFICATIONS?*", T);
        defparameter("*RECORDING-HL-TRANSCRIPT-OPERATIONS?*", NIL);
        defparameter("*HL-TRANSCRIPT-OPERATIONS*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_control_vars_file() {
        declare_defglobal($backchain_forbidden_unless_arg_chosen$);
        declare_defglobal($sym3$_REFORMULATOR_KB_LOADED__);
        SubLObject item_var = $sym3$_REFORMULATOR_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym4$_SKSI_KB_LOADED__);
        item_var = $sym4$_SKSI_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym5$_PARAPHRASE_KB_LOADED__);
        item_var = $sym5$_PARAPHRASE_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym6$_NL_KB_LOADED__);
        item_var = $sym6$_NL_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym7$_LEXICON_KB_LOADED__);
        item_var = $sym7$_LEXICON_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym8$_RTP_KB_LOADED__);
        item_var = $sym8$_RTP_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym9$_RKF_KB_LOADED__);
        item_var = $sym9$_RKF_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym10$_THESAURUS_KB_LOADED__);
        item_var = $sym10$_THESAURUS_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym11$_QUANT_KB_LOADED__);
        item_var = $sym11$_QUANT_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym12$_TIME_KB_LOADED__);
        item_var = $sym12$_TIME_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym13$_DATE_KB_LOADED__);
        item_var = $sym13$_DATE_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym14$_FRACTION_KB_LOADED__);
        item_var = $sym14$_FRACTION_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym15$_CYC_TASK_SCHEDULER_KB_LOADED__);
        item_var = $sym15$_CYC_TASK_SCHEDULER_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym16$_WORDNET_KB_LOADED__);
        item_var = $sym16$_WORDNET_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym17$_WORDNET_IMPORT_KB_LOADED__);
        item_var = $sym17$_WORDNET_IMPORT_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym18$_CYC_SECURE_KB_LOADED__);
        item_var = $sym18$_CYC_SECURE_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym19$_PLANNER_KB_LOADED__);
        item_var = $sym19$_PLANNER_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sym20$_KCT_KB_LOADED__);
        item_var = $sym20$_KCT_KB_LOADED__;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        register_html_state_variable($forward_inference_environment$);
        item_var = $forward_inference_environment$;
        if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
        }
        register_macro_helper(RECORD_HL_TRANSCRIPT_OPERATION, POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_control_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_control_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_control_vars_file();
    }

    static {





























































    }
}

/**
 * Total time: 276 ms
 */
