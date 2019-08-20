/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$fi_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-CONTROL-VARS
 * source file: /cyc/top/cycl/kb-control-vars.lisp
 * created:     2019/07/03 17:37:18
 */
public final class kb_control_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kb_control_vars();



    // deflexical
    @LispMethod(comment = "The list of KB feature symbols\ndeflexical")
    private static final SubLSymbol $kb_features$ = makeSymbol("*KB-FEATURES*");





































    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $forward_inference_enabledP$ = makeSymbol("*FORWARD-INFERENCE-ENABLED?*");

    // defparameter
    // Do we allow forward propagation from negated gafs.
    /**
     * Do we allow forward propagation from negated gafs.
     */
    @LispMethod(comment = "Do we allow forward propagation from negated gafs.\ndefparameter")
    public static final SubLSymbol $forward_propagate_from_negations$ = makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*");

    // defparameter
    // Do we allow conclusion of negated gafs in forward propagation.
    /**
     * Do we allow conclusion of negated gafs in forward propagation.
     */
    @LispMethod(comment = "Do we allow conclusion of negated gafs in forward propagation.\ndefparameter")
    public static final SubLSymbol $forward_propagate_to_negations$ = makeSymbol("*FORWARD-PROPAGATE-TO-NEGATIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $within_forward_inferenceP$ = makeSymbol("*WITHIN-FORWARD-INFERENCE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $within_assertion_forward_propagationP$ = makeSymbol("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $relax_type_restrictions_for_nats$ = makeSymbol("*RELAX-TYPE-RESTRICTIONS-FOR-NATS*");

    // defparameter
    /**
     * Amount of time we are willing to spend on each forward inference. NIL means
     * unlimited time.
     */
    @LispMethod(comment = "Amount of time we are willing to spend on each forward inference. NIL means\r\nunlimited time.\ndefparameter\nAmount of time we are willing to spend on each forward inference. NIL means\nunlimited time.")
    public static final SubLSymbol $forward_inference_time_cutoff$ = makeSymbol("*FORWARD-INFERENCE-TIME-CUTOFF*");

    // defparameter
    /**
     * When a value other than :all, the list of the only rules allowed for forward
     * inference.
     */
    @LispMethod(comment = "When a value other than :all, the list of the only rules allowed for forward\r\ninference.\ndefparameter\nWhen a value other than :all, the list of the only rules allowed for forward\ninference.")
    public static final SubLSymbol $forward_inference_allowed_rules$ = makeSymbol("*FORWARD-INFERENCE-ALLOWED-RULES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $forward_inference_forbidden_rules$ = makeSymbol("*FORWARD-INFERENCE-FORBIDDEN-RULES*");

    // defparameter
    // Do we give full justifications for ist gafs?
    /**
     * Do we give full justifications for ist gafs?
     */
    @LispMethod(comment = "Do we give full justifications for ist gafs?\ndefparameter")
    public static final SubLSymbol $recursive_ist_justificationsP$ = makeSymbol("*RECURSIVE-IST-JUSTIFICATIONS?*");

    // defparameter
    // Whether the HL storage modules should store the operations they perform
    /**
     * Whether the HL storage modules should store the operations they perform
     */
    @LispMethod(comment = "Whether the HL storage modules should store the operations they perform\ndefparameter")
    public static final SubLSymbol $recording_hl_transcript_operationsP$ = makeSymbol("*RECORDING-HL-TRANSCRIPT-OPERATIONS?*");

    // defparameter
    // A list of the operations noted by the HL storage modules
    /**
     * A list of the operations noted by the HL storage modules
     */
    @LispMethod(comment = "A list of the operations noted by the HL storage modules\ndefparameter")
    public static final SubLSymbol $hl_transcript_operations$ = makeSymbol("*HL-TRANSCRIPT-OPERATIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $backchain_forbidden_unless_arg_chosen$ = makeSymbol("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*");

    private static final SubLObject $const1$backchainForbiddenWhenUnboundInAr = reader_make_constant_shell("backchainForbiddenWhenUnboundInArg");

    static private final SubLString $str2$_a__a__ = makeString("~a ~a~%");

    public static final SubLSymbol $reformulator_kb_loadedP$ = makeSymbol("*REFORMULATOR-KB-LOADED?*");

    public static final SubLSymbol $sksi_kb_loadedP$ = makeSymbol("*SKSI-KB-LOADED?*");

    public static final SubLSymbol $paraphrase_kb_loadedP$ = makeSymbol("*PARAPHRASE-KB-LOADED?*");

    public static final SubLSymbol $nl_kb_loadedP$ = makeSymbol("*NL-KB-LOADED?*");

    public static final SubLSymbol $lexicon_kb_loadedP$ = makeSymbol("*LEXICON-KB-LOADED?*");

    public static final SubLSymbol $rtp_kb_loadedP$ = makeSymbol("*RTP-KB-LOADED?*");

    public static final SubLSymbol $rkf_kb_loadedP$ = makeSymbol("*RKF-KB-LOADED?*");

    public static final SubLSymbol $thesaurus_kb_loadedP$ = makeSymbol("*THESAURUS-KB-LOADED?*");

    public static final SubLSymbol $quant_kb_loadedP$ = makeSymbol("*QUANT-KB-LOADED?*");

    public static final SubLSymbol $time_kb_loadedP$ = makeSymbol("*TIME-KB-LOADED?*");

    public static final SubLSymbol $date_kb_loadedP$ = makeSymbol("*DATE-KB-LOADED?*");

    private static final SubLSymbol $fraction_kb_loadedP$ = makeSymbol("*FRACTION-KB-LOADED?*");

    private static final SubLSymbol $cyc_task_scheduler_kb_loadedP$ = makeSymbol("*CYC-TASK-SCHEDULER-KB-LOADED?*");

    private static final SubLSymbol $wordnet_kb_loadedP$ = makeSymbol("*WORDNET-KB-LOADED?*");

    private static final SubLSymbol $wordnet_import_kb_loadedP$ = makeSymbol("*WORDNET-IMPORT-KB-LOADED?*");

    private static final SubLSymbol $cyc_secure_kb_loadedP$ = makeSymbol("*CYC-SECURE-KB-LOADED?*");

    private static final SubLSymbol $planner_kb_loadedP$ = makeSymbol("*PLANNER-KB-LOADED?*");

    private static final SubLSymbol $kct_kb_loadedP$ = makeSymbol("*KCT-KB-LOADED?*");

    public static final SubLSymbol $forward_inference_environment$ = makeSymbol("*FORWARD-INFERENCE-ENVIRONMENT*");

    private static final SubLSymbol RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol("RECORD-HL-TRANSCRIPT-OPERATION");

    private static final SubLSymbol POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol("POSSIBLY-RECORD-HL-TRANSCRIPT-OPERATION");

    /**
     * A utility function for showing which KB features are active
     */
    @LispMethod(comment = "A utility function for showing which KB features are active")
    public static final SubLObject print_kb_features_alt() {
        {
            SubLObject cdolist_list_var = $kb_features$.getGlobalValue();
            SubLObject feature = NIL;
            for (feature = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , feature = cdolist_list_var.first()) {
                format(T, $str_alt2$_a__a__, symbol_name(feature), symbol_value(feature));
            }
        }
        return NIL;
    }

    /**
     * A utility function for showing which KB features are active
     */
    @LispMethod(comment = "A utility function for showing which KB features are active")
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

    /**
     * Is the portion of the KB necessary for the reformulator loaded?
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the reformulator loaded?")
    public static final SubLObject reformulator_kb_loaded_p_alt() {
        return $reformulator_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for the reformulator loaded?
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the reformulator loaded?")
    public static SubLObject reformulator_kb_loaded_p() {
        return $reformulator_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_reformulator_kb_loaded_alt() {
        $reformulator_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_reformulator_kb_loaded() {
        $reformulator_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_reformulator_kb_loaded_alt() {
        $reformulator_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_reformulator_kb_loaded() {
        $reformulator_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for SKSI loaded?
     */
    @LispMethod(comment = "Is the portion of the KB necessary for SKSI loaded?")
    public static final SubLObject sksi_kb_loaded_p_alt() {
        return $sksi_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for SKSI loaded?
     */
    @LispMethod(comment = "Is the portion of the KB necessary for SKSI loaded?")
    public static SubLObject sksi_kb_loaded_p() {
        return $sksi_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_sksi_kb_loaded_alt() {
        $sksi_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_sksi_kb_loaded() {
        $sksi_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_sksi_kb_loaded_alt() {
        $sksi_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_sksi_kb_loaded() {
        $sksi_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for the paraphrase module loaded?
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the paraphrase module loaded?")
    public static final SubLObject paraphrase_kb_loaded_p_alt() {
        return $paraphrase_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for the paraphrase module loaded?
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the paraphrase module loaded?")
    public static SubLObject paraphrase_kb_loaded_p() {
        return $paraphrase_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_paraphrase_kb_loaded_alt() {
        $paraphrase_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_paraphrase_kb_loaded() {
        $paraphrase_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_paraphrase_kb_loaded_alt() {
        $paraphrase_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_paraphrase_kb_loaded() {
        $paraphrase_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for natural language processing loaded?
     * This is the KB analogue of the #+Cyc-NL feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for natural language processing loaded?\r\nThis is the KB analogue of the #+Cyc-NL feature.\nIs the portion of the KB necessary for natural language processing loaded?\nThis is the KB analogue of the #+Cyc-NL feature.")
    public static final SubLObject nl_kb_loaded_p_alt() {
        return $nl_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for natural language processing loaded?
     * This is the KB analogue of the #+Cyc-NL feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for natural language processing loaded?\r\nThis is the KB analogue of the #+Cyc-NL feature.\nIs the portion of the KB necessary for natural language processing loaded?\nThis is the KB analogue of the #+Cyc-NL feature.")
    public static SubLObject nl_kb_loaded_p() {
        return $nl_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_nl_kb_loaded_alt() {
        $nl_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_nl_kb_loaded() {
        $nl_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_nl_kb_loaded_alt() {
        $nl_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_nl_kb_loaded() {
        $nl_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for lexical lookup loaded?
     * This is the KB analogue of the #+Cyc-Lexicon feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for lexical lookup loaded?\r\nThis is the KB analogue of the #+Cyc-Lexicon feature.\nIs the portion of the KB necessary for lexical lookup loaded?\nThis is the KB analogue of the #+Cyc-Lexicon feature.")
    public static final SubLObject lexicon_kb_loaded_p_alt() {
        return $lexicon_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for lexical lookup loaded?
     * This is the KB analogue of the #+Cyc-Lexicon feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for lexical lookup loaded?\r\nThis is the KB analogue of the #+Cyc-Lexicon feature.\nIs the portion of the KB necessary for lexical lookup loaded?\nThis is the KB analogue of the #+Cyc-Lexicon feature.")
    public static SubLObject lexicon_kb_loaded_p() {
        return $lexicon_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_lexicon_kb_loaded_alt() {
        $lexicon_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_lexicon_kb_loaded() {
        $lexicon_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_lexicon_kb_loaded_alt() {
        $lexicon_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_lexicon_kb_loaded() {
        $lexicon_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for the operation of the recursive template parser loaded?
     * This is the KB analogue of the #+Cyc-RTP feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the operation of the recursive template parser loaded?\r\nThis is the KB analogue of the #+Cyc-RTP feature.\nIs the portion of the KB necessary for the operation of the recursive template parser loaded?\nThis is the KB analogue of the #+Cyc-RTP feature.")
    public static final SubLObject rtp_kb_loaded_p_alt() {
        return $rtp_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for the operation of the recursive template parser loaded?
     * This is the KB analogue of the #+Cyc-RTP feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the operation of the recursive template parser loaded?\r\nThis is the KB analogue of the #+Cyc-RTP feature.\nIs the portion of the KB necessary for the operation of the recursive template parser loaded?\nThis is the KB analogue of the #+Cyc-RTP feature.")
    public static SubLObject rtp_kb_loaded_p() {
        return $rtp_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_rtp_kb_loaded_alt() {
        $rtp_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_rtp_kb_loaded() {
        $rtp_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_rtp_kb_loaded_alt() {
        $rtp_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_rtp_kb_loaded() {
        $rtp_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for rapid knowledge formation loaded?
     * This is the KB analogue of the #+Cyc-RKF feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for rapid knowledge formation loaded?\r\nThis is the KB analogue of the #+Cyc-RKF feature.\nIs the portion of the KB necessary for rapid knowledge formation loaded?\nThis is the KB analogue of the #+Cyc-RKF feature.")
    public static final SubLObject rkf_kb_loaded_p_alt() {
        return $rkf_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for rapid knowledge formation loaded?
     * This is the KB analogue of the #+Cyc-RKF feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for rapid knowledge formation loaded?\r\nThis is the KB analogue of the #+Cyc-RKF feature.\nIs the portion of the KB necessary for rapid knowledge formation loaded?\nThis is the KB analogue of the #+Cyc-RKF feature.")
    public static SubLObject rkf_kb_loaded_p() {
        return $rkf_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_rkf_kb_loaded_alt() {
        $rkf_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_rkf_kb_loaded() {
        $rkf_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_rkf_kb_loaded_alt() {
        $rkf_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_rkf_kb_loaded() {
        $rkf_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for the Thesaurus Manager loaded?
     * This is the KB analogue of the #+Cyc-Thesaurus feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the Thesaurus Manager loaded?\r\nThis is the KB analogue of the #+Cyc-Thesaurus feature.\nIs the portion of the KB necessary for the Thesaurus Manager loaded?\nThis is the KB analogue of the #+Cyc-Thesaurus feature.")
    public static final SubLObject thesaurus_kb_loaded_p_alt() {
        return $thesaurus_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for the Thesaurus Manager loaded?
     * This is the KB analogue of the #+Cyc-Thesaurus feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the Thesaurus Manager loaded?\r\nThis is the KB analogue of the #+Cyc-Thesaurus feature.\nIs the portion of the KB necessary for the Thesaurus Manager loaded?\nThis is the KB analogue of the #+Cyc-Thesaurus feature.")
    public static SubLObject thesaurus_kb_loaded_p() {
        return $thesaurus_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_thesaurus_kb_loaded_alt() {
        $thesaurus_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_thesaurus_kb_loaded() {
        $thesaurus_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_thesaurus_kb_loaded_alt() {
        $thesaurus_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_thesaurus_kb_loaded() {
        $thesaurus_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for numerical quantification loaded?
     * This is the KB analogue of the #+Cyc-Quant feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for numerical quantification loaded?\r\nThis is the KB analogue of the #+Cyc-Quant feature.\nIs the portion of the KB necessary for numerical quantification loaded?\nThis is the KB analogue of the #+Cyc-Quant feature.")
    public static final SubLObject quant_kb_loaded_p_alt() {
        return $quant_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for numerical quantification loaded?
     * This is the KB analogue of the #+Cyc-Quant feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for numerical quantification loaded?\r\nThis is the KB analogue of the #+Cyc-Quant feature.\nIs the portion of the KB necessary for numerical quantification loaded?\nThis is the KB analogue of the #+Cyc-Quant feature.")
    public static SubLObject quant_kb_loaded_p() {
        return $quant_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_quant_kb_loaded_alt() {
        $quant_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_quant_kb_loaded() {
        $quant_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_quant_kb_loaded_alt() {
        $quant_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_quant_kb_loaded() {
        $quant_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for time processing loaded?
     * This is the KB analogue of the #+Cyc-Time feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for time processing loaded?\r\nThis is the KB analogue of the #+Cyc-Time feature.\nIs the portion of the KB necessary for time processing loaded?\nThis is the KB analogue of the #+Cyc-Time feature.")
    public static final SubLObject time_kb_loaded_p_alt() {
        return $time_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for time processing loaded?
     * This is the KB analogue of the #+Cyc-Time feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for time processing loaded?\r\nThis is the KB analogue of the #+Cyc-Time feature.\nIs the portion of the KB necessary for time processing loaded?\nThis is the KB analogue of the #+Cyc-Time feature.")
    public static SubLObject time_kb_loaded_p() {
        return $time_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_time_kb_loaded_alt() {
        $time_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_time_kb_loaded() {
        $time_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_time_kb_loaded_alt() {
        $time_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_time_kb_loaded() {
        $time_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for date processing loaded?
     * This is the KB analogue of the #+Cyc-Date feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for date processing loaded?\r\nThis is the KB analogue of the #+Cyc-Date feature.\nIs the portion of the KB necessary for date processing loaded?\nThis is the KB analogue of the #+Cyc-Date feature.")
    public static final SubLObject date_kb_loaded_p_alt() {
        return $date_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for date processing loaded?
     * This is the KB analogue of the #+Cyc-Date feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for date processing loaded?\r\nThis is the KB analogue of the #+Cyc-Date feature.\nIs the portion of the KB necessary for date processing loaded?\nThis is the KB analogue of the #+Cyc-Date feature.")
    public static SubLObject date_kb_loaded_p() {
        return $date_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_date_kb_loaded_alt() {
        $date_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_date_kb_loaded() {
        $date_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_date_kb_loaded_alt() {
        $date_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
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

    /**
     * Is the portion of the KB used by the Cyc Task Scheduler loaded?
     * There is currently no code analogue of this KB feature.
     */
    @LispMethod(comment = "Is the portion of the KB used by the Cyc Task Scheduler loaded?\r\nThere is currently no code analogue of this KB feature.\nIs the portion of the KB used by the Cyc Task Scheduler loaded?\nThere is currently no code analogue of this KB feature.")
    public static final SubLObject cyc_task_scheduler_kb_loaded_p_alt() {
        return $cyc_task_scheduler_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB used by the Cyc Task Scheduler loaded?
     * There is currently no code analogue of this KB feature.
     */
    @LispMethod(comment = "Is the portion of the KB used by the Cyc Task Scheduler loaded?\r\nThere is currently no code analogue of this KB feature.\nIs the portion of the KB used by the Cyc Task Scheduler loaded?\nThere is currently no code analogue of this KB feature.")
    public static SubLObject cyc_task_scheduler_kb_loaded_p() {
        return $cyc_task_scheduler_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_cyc_task_scheduler_kb_loaded_alt() {
        $cyc_task_scheduler_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_cyc_task_scheduler_kb_loaded() {
        $cyc_task_scheduler_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_cyc_task_scheduler_kb_loaded_alt() {
        $cyc_task_scheduler_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_cyc_task_scheduler_kb_loaded() {
        $cyc_task_scheduler_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for WORDNET loaded?
     * This is the KB analogue of the #+Cyc-Wordnet feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for WORDNET loaded?\r\nThis is the KB analogue of the #+Cyc-Wordnet feature.\nIs the portion of the KB necessary for WORDNET loaded?\nThis is the KB analogue of the #+Cyc-Wordnet feature.")
    public static final SubLObject wordnet_kb_loaded_p_alt() {
        return $wordnet_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for WORDNET loaded?
     * This is the KB analogue of the #+Cyc-Wordnet feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for WORDNET loaded?\r\nThis is the KB analogue of the #+Cyc-Wordnet feature.\nIs the portion of the KB necessary for WORDNET loaded?\nThis is the KB analogue of the #+Cyc-Wordnet feature.")
    public static SubLObject wordnet_kb_loaded_p() {
        return $wordnet_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_wordnet_kb_loaded_alt() {
        $wordnet_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_wordnet_kb_loaded() {
        $wordnet_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_wordnet_kb_loaded_alt() {
        $wordnet_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
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

    /**
     * Is the portion of the KB necessary for CycSecure loaded?
     * This is the KB analogue of the #+Cyc-Secure feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for CycSecure loaded?\r\nThis is the KB analogue of the #+Cyc-Secure feature.\nIs the portion of the KB necessary for CycSecure loaded?\nThis is the KB analogue of the #+Cyc-Secure feature.")
    public static final SubLObject cyc_secure_kb_loaded_p_alt() {
        return $cyc_secure_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for CycSecure loaded?
     * This is the KB analogue of the #+Cyc-Secure feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for CycSecure loaded?\r\nThis is the KB analogue of the #+Cyc-Secure feature.\nIs the portion of the KB necessary for CycSecure loaded?\nThis is the KB analogue of the #+Cyc-Secure feature.")
    public static SubLObject cyc_secure_kb_loaded_p() {
        return $cyc_secure_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_cyc_secure_kb_loaded_alt() {
        $cyc_secure_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_cyc_secure_kb_loaded() {
        $cyc_secure_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_cyc_secure_kb_loaded_alt() {
        $cyc_secure_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_cyc_secure_kb_loaded() {
        $cyc_secure_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for the planner loaded?
     * This is the KB analogue of the #+Cyc-Planner feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the planner loaded?\r\nThis is the KB analogue of the #+Cyc-Planner feature.\nIs the portion of the KB necessary for the planner loaded?\nThis is the KB analogue of the #+Cyc-Planner feature.")
    public static final SubLObject planner_kb_loaded_p_alt() {
        return $planner_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for the planner loaded?
     * This is the KB analogue of the #+Cyc-Planner feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for the planner loaded?\r\nThis is the KB analogue of the #+Cyc-Planner feature.\nIs the portion of the KB necessary for the planner loaded?\nThis is the KB analogue of the #+Cyc-Planner feature.")
    public static SubLObject planner_kb_loaded_p() {
        return $planner_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_planner_kb_loaded_alt() {
        $planner_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_planner_kb_loaded() {
        $planner_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_planner_kb_loaded_alt() {
        $planner_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_planner_kb_loaded() {
        $planner_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Is the portion of the KB necessary for KCTs loaded?
     * There is currently no code analogue of this KB feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for KCTs loaded?\r\nThere is currently no code analogue of this KB feature.\nIs the portion of the KB necessary for KCTs loaded?\nThere is currently no code analogue of this KB feature.")
    public static final SubLObject kct_kb_loaded_p_alt() {
        return $kct_kb_loadedP$.getGlobalValue();
    }

    /**
     * Is the portion of the KB necessary for KCTs loaded?
     * There is currently no code analogue of this KB feature.
     */
    @LispMethod(comment = "Is the portion of the KB necessary for KCTs loaded?\r\nThere is currently no code analogue of this KB feature.\nIs the portion of the KB necessary for KCTs loaded?\nThere is currently no code analogue of this KB feature.")
    public static SubLObject kct_kb_loaded_p() {
        return $kct_kb_loadedP$.getGlobalValue();
    }

    public static final SubLObject set_kct_kb_loaded_alt() {
        $kct_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static SubLObject set_kct_kb_loaded() {
        $kct_kb_loadedP$.setGlobalValue(T);
        return T;
    }

    public static final SubLObject unset_kct_kb_loaded_alt() {
        $kct_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject unset_kct_kb_loaded() {
        $kct_kb_loadedP$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject within_forward_inferenceP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $within_forward_inferenceP$.getDynamicValue(thread);
        }
    }

    public static SubLObject within_forward_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_forward_inferenceP$.getDynamicValue(thread);
    }

    public static final SubLObject record_hl_transcript_operation_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $hl_transcript_operations$.setDynamicValue(cons(form, $hl_transcript_operations$.getDynamicValue(thread)), thread);
            return form;
        }
    }

    public static SubLObject record_hl_transcript_operation(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hl_transcript_operations$.setDynamicValue(cons(form, $hl_transcript_operations$.getDynamicValue(thread)), thread);
        return form;
    }

    public static SubLObject declare_kb_control_vars_file() {
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
        declareFunction("fraction_kb_loaded_p", "FRACTION-KB-LOADED-P", 0, 0, false);
        declareFunction("set_fraction_kb_loaded", "SET-FRACTION-KB-LOADED", 0, 0, false);
        declareFunction("unset_fraction_kb_loaded", "UNSET-FRACTION-KB-LOADED", 0, 0, false);
        declareFunction("cyc_task_scheduler_kb_loaded_p", "CYC-TASK-SCHEDULER-KB-LOADED-P", 0, 0, false);
        declareFunction("set_cyc_task_scheduler_kb_loaded", "SET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false);
        declareFunction("unset_cyc_task_scheduler_kb_loaded", "UNSET-CYC-TASK-SCHEDULER-KB-LOADED", 0, 0, false);
        declareFunction("wordnet_kb_loaded_p", "WORDNET-KB-LOADED-P", 0, 0, false);
        declareFunction("set_wordnet_kb_loaded", "SET-WORDNET-KB-LOADED", 0, 0, false);
        declareFunction("unset_wordnet_kb_loaded", "UNSET-WORDNET-KB-LOADED", 0, 0, false);
        declareFunction("wordnet_import_kb_loaded_p", "WORDNET-IMPORT-KB-LOADED-P", 0, 0, false);
        declareFunction("set_wordnet_import_kb_loaded", "SET-WORDNET-IMPORT-KB-LOADED", 0, 0, false);
        declareFunction("unset_wordnet_import_kb_loaded", "UNSET-WORDNET-IMPORT-KB-LOADED", 0, 0, false);
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

    public static final SubLObject init_kb_control_vars_file_alt() {
        deflexical("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*", NIL != boundp($backchain_forbidden_unless_arg_chosen$) ? ((SubLObject) ($backchain_forbidden_unless_arg_chosen$.getGlobalValue())) : $const1$backchainForbiddenWhenUnboundInAr);
        deflexical("*KB-FEATURES*", NIL);
        deflexical("*REFORMULATOR-KB-LOADED?*", NIL != boundp($reformulator_kb_loadedP$) ? ((SubLObject) ($reformulator_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*SKSI-KB-LOADED?*", NIL != boundp($sksi_kb_loadedP$) ? ((SubLObject) ($sksi_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*PARAPHRASE-KB-LOADED?*", NIL != boundp($paraphrase_kb_loadedP$) ? ((SubLObject) ($paraphrase_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*NL-KB-LOADED?*", NIL != boundp($nl_kb_loadedP$) ? ((SubLObject) ($nl_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*LEXICON-KB-LOADED?*", NIL != boundp($lexicon_kb_loadedP$) ? ((SubLObject) ($lexicon_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*RTP-KB-LOADED?*", NIL != boundp($rtp_kb_loadedP$) ? ((SubLObject) ($rtp_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*RKF-KB-LOADED?*", NIL != boundp($rkf_kb_loadedP$) ? ((SubLObject) ($rkf_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*THESAURUS-KB-LOADED?*", NIL != boundp($thesaurus_kb_loadedP$) ? ((SubLObject) ($thesaurus_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*QUANT-KB-LOADED?*", NIL != boundp($quant_kb_loadedP$) ? ((SubLObject) ($quant_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*TIME-KB-LOADED?*", NIL != boundp($time_kb_loadedP$) ? ((SubLObject) ($time_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*DATE-KB-LOADED?*", NIL != boundp($date_kb_loadedP$) ? ((SubLObject) ($date_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*CYC-TASK-SCHEDULER-KB-LOADED?*", NIL != boundp($cyc_task_scheduler_kb_loadedP$) ? ((SubLObject) ($cyc_task_scheduler_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*WORDNET-KB-LOADED?*", NIL != boundp($wordnet_kb_loadedP$) ? ((SubLObject) ($wordnet_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*CYC-SECURE-KB-LOADED?*", NIL != boundp($cyc_secure_kb_loadedP$) ? ((SubLObject) ($cyc_secure_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*PLANNER-KB-LOADED?*", NIL != boundp($planner_kb_loadedP$) ? ((SubLObject) ($planner_kb_loadedP$.getGlobalValue())) : NIL);
        deflexical("*KCT-KB-LOADED?*", NIL != boundp($kct_kb_loadedP$) ? ((SubLObject) ($kct_kb_loadedP$.getGlobalValue())) : NIL);
        defparameter("*FORWARD-INFERENCE-ENABLED?*", T);
        defparameter("*FORWARD-PROPAGATE-FROM-NEGATIONS*", NIL);
        defparameter("*FORWARD-PROPAGATE-TO-NEGATIONS*", NIL);
        defparameter("*WITHIN-FORWARD-INFERENCE?*", NIL);
        defparameter("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*", NIL);
        defparameter("*RELAX-TYPE-RESTRICTIONS-FOR-NATS*", NIL);
        defparameter("*FORWARD-INFERENCE-TIME-CUTOFF*", NIL);
        defparameter("*FORWARD-INFERENCE-ALLOWED-RULES*", $ALL);
        defparameter("*FORWARD-INFERENCE-ENVIRONMENT*", queues.create_queue());
        defparameter("*RECURSIVE-IST-JUSTIFICATIONS?*", T);
        defparameter("*RECORDING-HL-TRANSCRIPT-OPERATIONS?*", NIL);
        defparameter("*HL-TRANSCRIPT-OPERATIONS*", NIL);
        return NIL;
    }

    public static SubLObject init_kb_control_vars_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*", SubLTrampolineFile.maybeDefault($backchain_forbidden_unless_arg_chosen$, $backchain_forbidden_unless_arg_chosen$, $const1$backchainForbiddenWhenUnboundInAr));
            deflexical("*KB-FEATURES*", NIL);
            deflexical("*REFORMULATOR-KB-LOADED?*", SubLTrampolineFile.maybeDefault($reformulator_kb_loadedP$, $reformulator_kb_loadedP$, NIL));
            deflexical("*SKSI-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sksi_kb_loadedP$, $sksi_kb_loadedP$, NIL));
            deflexical("*PARAPHRASE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($paraphrase_kb_loadedP$, $paraphrase_kb_loadedP$, NIL));
            deflexical("*NL-KB-LOADED?*", SubLTrampolineFile.maybeDefault($nl_kb_loadedP$, $nl_kb_loadedP$, NIL));
            deflexical("*LEXICON-KB-LOADED?*", SubLTrampolineFile.maybeDefault($lexicon_kb_loadedP$, $lexicon_kb_loadedP$, NIL));
            deflexical("*RTP-KB-LOADED?*", SubLTrampolineFile.maybeDefault($rtp_kb_loadedP$, $rtp_kb_loadedP$, NIL));
            deflexical("*RKF-KB-LOADED?*", SubLTrampolineFile.maybeDefault($rkf_kb_loadedP$, $rkf_kb_loadedP$, NIL));
            deflexical("*THESAURUS-KB-LOADED?*", SubLTrampolineFile.maybeDefault($thesaurus_kb_loadedP$, $thesaurus_kb_loadedP$, NIL));
            deflexical("*QUANT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($quant_kb_loadedP$, $quant_kb_loadedP$, NIL));
            deflexical("*TIME-KB-LOADED?*", SubLTrampolineFile.maybeDefault($time_kb_loadedP$, $time_kb_loadedP$, NIL));
            deflexical("*DATE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($date_kb_loadedP$, $date_kb_loadedP$, NIL));
            deflexical("*FRACTION-KB-LOADED?*", SubLTrampolineFile.maybeDefault($fraction_kb_loadedP$, $fraction_kb_loadedP$, NIL));
            deflexical("*CYC-TASK-SCHEDULER-KB-LOADED?*", SubLTrampolineFile.maybeDefault($cyc_task_scheduler_kb_loadedP$, $cyc_task_scheduler_kb_loadedP$, NIL));
            deflexical("*WORDNET-KB-LOADED?*", SubLTrampolineFile.maybeDefault($wordnet_kb_loadedP$, $wordnet_kb_loadedP$, NIL));
            deflexical("*WORDNET-IMPORT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($wordnet_import_kb_loadedP$, $wordnet_import_kb_loadedP$, NIL));
            deflexical("*CYC-SECURE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($cyc_secure_kb_loadedP$, $cyc_secure_kb_loadedP$, NIL));
            deflexical("*PLANNER-KB-LOADED?*", SubLTrampolineFile.maybeDefault($planner_kb_loadedP$, $planner_kb_loadedP$, NIL));
            deflexical("*KCT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($kct_kb_loadedP$, $kct_kb_loadedP$, NIL));
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*", NIL != boundp($backchain_forbidden_unless_arg_chosen$) ? ((SubLObject) ($backchain_forbidden_unless_arg_chosen$.getGlobalValue())) : $const1$backchainForbiddenWhenUnboundInAr);
            deflexical("*REFORMULATOR-KB-LOADED?*", NIL != boundp($reformulator_kb_loadedP$) ? ((SubLObject) ($reformulator_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*SKSI-KB-LOADED?*", NIL != boundp($sksi_kb_loadedP$) ? ((SubLObject) ($sksi_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*PARAPHRASE-KB-LOADED?*", NIL != boundp($paraphrase_kb_loadedP$) ? ((SubLObject) ($paraphrase_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*NL-KB-LOADED?*", NIL != boundp($nl_kb_loadedP$) ? ((SubLObject) ($nl_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*LEXICON-KB-LOADED?*", NIL != boundp($lexicon_kb_loadedP$) ? ((SubLObject) ($lexicon_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*RTP-KB-LOADED?*", NIL != boundp($rtp_kb_loadedP$) ? ((SubLObject) ($rtp_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*RKF-KB-LOADED?*", NIL != boundp($rkf_kb_loadedP$) ? ((SubLObject) ($rkf_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*THESAURUS-KB-LOADED?*", NIL != boundp($thesaurus_kb_loadedP$) ? ((SubLObject) ($thesaurus_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*QUANT-KB-LOADED?*", NIL != boundp($quant_kb_loadedP$) ? ((SubLObject) ($quant_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*TIME-KB-LOADED?*", NIL != boundp($time_kb_loadedP$) ? ((SubLObject) ($time_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*DATE-KB-LOADED?*", NIL != boundp($date_kb_loadedP$) ? ((SubLObject) ($date_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*CYC-TASK-SCHEDULER-KB-LOADED?*", NIL != boundp($cyc_task_scheduler_kb_loadedP$) ? ((SubLObject) ($cyc_task_scheduler_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*WORDNET-KB-LOADED?*", NIL != boundp($wordnet_kb_loadedP$) ? ((SubLObject) ($wordnet_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*CYC-SECURE-KB-LOADED?*", NIL != boundp($cyc_secure_kb_loadedP$) ? ((SubLObject) ($cyc_secure_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*PLANNER-KB-LOADED?*", NIL != boundp($planner_kb_loadedP$) ? ((SubLObject) ($planner_kb_loadedP$.getGlobalValue())) : NIL);
            deflexical("*KCT-KB-LOADED?*", NIL != boundp($kct_kb_loadedP$) ? ((SubLObject) ($kct_kb_loadedP$.getGlobalValue())) : NIL);
            defparameter("*FORWARD-PROPAGATE-FROM-NEGATIONS*", NIL);
            defparameter("*FORWARD-INFERENCE-ENVIRONMENT*", queues.create_queue());
        }
        return NIL;
    }

    public static SubLObject init_kb_control_vars_file_Previous() {
        deflexical("*BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN*", SubLTrampolineFile.maybeDefault($backchain_forbidden_unless_arg_chosen$, $backchain_forbidden_unless_arg_chosen$, $const1$backchainForbiddenWhenUnboundInAr));
        deflexical("*KB-FEATURES*", NIL);
        deflexical("*REFORMULATOR-KB-LOADED?*", SubLTrampolineFile.maybeDefault($reformulator_kb_loadedP$, $reformulator_kb_loadedP$, NIL));
        deflexical("*SKSI-KB-LOADED?*", SubLTrampolineFile.maybeDefault($sksi_kb_loadedP$, $sksi_kb_loadedP$, NIL));
        deflexical("*PARAPHRASE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($paraphrase_kb_loadedP$, $paraphrase_kb_loadedP$, NIL));
        deflexical("*NL-KB-LOADED?*", SubLTrampolineFile.maybeDefault($nl_kb_loadedP$, $nl_kb_loadedP$, NIL));
        deflexical("*LEXICON-KB-LOADED?*", SubLTrampolineFile.maybeDefault($lexicon_kb_loadedP$, $lexicon_kb_loadedP$, NIL));
        deflexical("*RTP-KB-LOADED?*", SubLTrampolineFile.maybeDefault($rtp_kb_loadedP$, $rtp_kb_loadedP$, NIL));
        deflexical("*RKF-KB-LOADED?*", SubLTrampolineFile.maybeDefault($rkf_kb_loadedP$, $rkf_kb_loadedP$, NIL));
        deflexical("*THESAURUS-KB-LOADED?*", SubLTrampolineFile.maybeDefault($thesaurus_kb_loadedP$, $thesaurus_kb_loadedP$, NIL));
        deflexical("*QUANT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($quant_kb_loadedP$, $quant_kb_loadedP$, NIL));
        deflexical("*TIME-KB-LOADED?*", SubLTrampolineFile.maybeDefault($time_kb_loadedP$, $time_kb_loadedP$, NIL));
        deflexical("*DATE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($date_kb_loadedP$, $date_kb_loadedP$, NIL));
        deflexical("*FRACTION-KB-LOADED?*", SubLTrampolineFile.maybeDefault($fraction_kb_loadedP$, $fraction_kb_loadedP$, NIL));
        deflexical("*CYC-TASK-SCHEDULER-KB-LOADED?*", SubLTrampolineFile.maybeDefault($cyc_task_scheduler_kb_loadedP$, $cyc_task_scheduler_kb_loadedP$, NIL));
        deflexical("*WORDNET-KB-LOADED?*", SubLTrampolineFile.maybeDefault($wordnet_kb_loadedP$, $wordnet_kb_loadedP$, NIL));
        deflexical("*WORDNET-IMPORT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($wordnet_import_kb_loadedP$, $wordnet_import_kb_loadedP$, NIL));
        deflexical("*CYC-SECURE-KB-LOADED?*", SubLTrampolineFile.maybeDefault($cyc_secure_kb_loadedP$, $cyc_secure_kb_loadedP$, NIL));
        deflexical("*PLANNER-KB-LOADED?*", SubLTrampolineFile.maybeDefault($planner_kb_loadedP$, $planner_kb_loadedP$, NIL));
        deflexical("*KCT-KB-LOADED?*", SubLTrampolineFile.maybeDefault($kct_kb_loadedP$, $kct_kb_loadedP$, NIL));
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

    public static final SubLObject setup_kb_control_vars_file_alt() {
        declare_defglobal($backchain_forbidden_unless_arg_chosen$);
        declare_defglobal($reformulator_kb_loadedP$);
        {
            SubLObject item_var = $reformulator_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($sksi_kb_loadedP$);
        {
            SubLObject item_var = $sksi_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($paraphrase_kb_loadedP$);
        {
            SubLObject item_var = $paraphrase_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($nl_kb_loadedP$);
        {
            SubLObject item_var = $nl_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($lexicon_kb_loadedP$);
        {
            SubLObject item_var = $lexicon_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($rtp_kb_loadedP$);
        {
            SubLObject item_var = $rtp_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($rkf_kb_loadedP$);
        {
            SubLObject item_var = $rkf_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($thesaurus_kb_loadedP$);
        {
            SubLObject item_var = $thesaurus_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($quant_kb_loadedP$);
        {
            SubLObject item_var = $quant_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($time_kb_loadedP$);
        {
            SubLObject item_var = $time_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($date_kb_loadedP$);
        {
            SubLObject item_var = $date_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($cyc_task_scheduler_kb_loadedP$);
        {
            SubLObject item_var = $cyc_task_scheduler_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($wordnet_kb_loadedP$);
        {
            SubLObject item_var = $wordnet_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($cyc_secure_kb_loadedP$);
        {
            SubLObject item_var = $cyc_secure_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($planner_kb_loadedP$);
        {
            SubLObject item_var = $planner_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        declare_defglobal($kct_kb_loadedP$);
        {
            SubLObject item_var = $kct_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
        }
        register_html_state_variable($forward_inference_environment$);
        {
            SubLObject item_var = $forward_inference_environment$;
            if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
            }
        }
        register_macro_helper(RECORD_HL_TRANSCRIPT_OPERATION, POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION);
        return NIL;
    }

    public static SubLObject setup_kb_control_vars_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($backchain_forbidden_unless_arg_chosen$);
            declare_defglobal($reformulator_kb_loadedP$);
            SubLObject item_var = $reformulator_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($sksi_kb_loadedP$);
            item_var = $sksi_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($paraphrase_kb_loadedP$);
            item_var = $paraphrase_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($nl_kb_loadedP$);
            item_var = $nl_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($lexicon_kb_loadedP$);
            item_var = $lexicon_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($rtp_kb_loadedP$);
            item_var = $rtp_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($rkf_kb_loadedP$);
            item_var = $rkf_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($thesaurus_kb_loadedP$);
            item_var = $thesaurus_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($quant_kb_loadedP$);
            item_var = $quant_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($time_kb_loadedP$);
            item_var = $time_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($date_kb_loadedP$);
            item_var = $date_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($fraction_kb_loadedP$);
            item_var = $fraction_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($cyc_task_scheduler_kb_loadedP$);
            item_var = $cyc_task_scheduler_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($wordnet_kb_loadedP$);
            item_var = $wordnet_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($wordnet_import_kb_loadedP$);
            item_var = $wordnet_import_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($cyc_secure_kb_loadedP$);
            item_var = $cyc_secure_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($planner_kb_loadedP$);
            item_var = $planner_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            declare_defglobal($kct_kb_loadedP$);
            item_var = $kct_kb_loadedP$;
            if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
            }
            register_html_state_variable($forward_inference_environment$);
            item_var = $forward_inference_environment$;
            if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
            }
            register_macro_helper(RECORD_HL_TRANSCRIPT_OPERATION, POSSIBLY_RECORD_HL_TRANSCRIPT_OPERATION);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject item_var = $reformulator_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $sksi_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $paraphrase_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $nl_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $lexicon_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $rtp_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $rkf_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $thesaurus_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $quant_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $time_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $date_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            declare_defglobal($cyc_task_scheduler_kb_loadedP$);
            {
                SubLObject item_var = $cyc_task_scheduler_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            declare_defglobal($wordnet_kb_loadedP$);
            {
                SubLObject item_var = $wordnet_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            declare_defglobal($cyc_secure_kb_loadedP$);
            {
                SubLObject item_var = $cyc_secure_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            declare_defglobal($planner_kb_loadedP$);
            {
                SubLObject item_var = $planner_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            declare_defglobal($kct_kb_loadedP$);
            {
                SubLObject item_var = $kct_kb_loadedP$;
                if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = $forward_inference_environment$;
                if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_kb_control_vars_file_Previous() {
        declare_defglobal($backchain_forbidden_unless_arg_chosen$);
        declare_defglobal($reformulator_kb_loadedP$);
        SubLObject item_var = $reformulator_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($sksi_kb_loadedP$);
        item_var = $sksi_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($paraphrase_kb_loadedP$);
        item_var = $paraphrase_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($nl_kb_loadedP$);
        item_var = $nl_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($lexicon_kb_loadedP$);
        item_var = $lexicon_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($rtp_kb_loadedP$);
        item_var = $rtp_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($rkf_kb_loadedP$);
        item_var = $rkf_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($thesaurus_kb_loadedP$);
        item_var = $thesaurus_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($quant_kb_loadedP$);
        item_var = $quant_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($time_kb_loadedP$);
        item_var = $time_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($date_kb_loadedP$);
        item_var = $date_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($fraction_kb_loadedP$);
        item_var = $fraction_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($cyc_task_scheduler_kb_loadedP$);
        item_var = $cyc_task_scheduler_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($wordnet_kb_loadedP$);
        item_var = $wordnet_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($wordnet_import_kb_loadedP$);
        item_var = $wordnet_import_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($cyc_secure_kb_loadedP$);
        item_var = $cyc_secure_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($planner_kb_loadedP$);
        item_var = $planner_kb_loadedP$;
        if (NIL == member(item_var, $kb_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kb_features$.setGlobalValue(cons(item_var, $kb_features$.getGlobalValue()));
        }
        declare_defglobal($kct_kb_loadedP$);
        item_var = $kct_kb_loadedP$;
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

    static private final SubLString $str_alt2$_a__a__ = makeString("~a ~a~%");

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

}

/**
 * Total time: 276 ms
 */
