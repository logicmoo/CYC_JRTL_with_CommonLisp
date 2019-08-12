/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_iterators;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      GENERATE-GAFS
 *  source file: /cyc/top/cycl/generate-gafs.lisp
 *  created:     2019/07/03 17:38:58
 */
public final class generate_gafs extends SubLTranslatedFile implements V02 {
    // // Constructor
    private generate_gafs() {
    }

    public static final SubLFile me = new generate_gafs();

    public static final String myName = "com.cyc.cycjava.cycl.generate_gafs";

    // // Definitions
    /**
     * Should the fact-gathering system attempt to create new concepts?
     */
    // defparameter
    public static final SubLSymbol $gg_attempt_unknown_terms$ = makeSymbol("*GG-ATTEMPT-UNKNOWN-TERMS*");



    public static final SubLObject gg_status_message(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(PROGN, $list_alt2, $list_alt3, listS(FORMAT, $gg_status_message_stream$, message_format, append(args, NIL)), $list_alt6);
            }
        }
    }

    /**
     * Provides specified predicate for NL gathering to override the default behavior of
     * obtaining them from #$FactFactoryGatheredGAFVerificationPredicate.
     */
    // deflexical
    public static final SubLSymbol $specified_predicates_for_nl_gathering$ = makeSymbol("*SPECIFIED-PREDICATES-FOR-NL-GATHERING*");

    // deflexical
    private static final SubLSymbol $google_stop_words_unofficial$ = makeSymbol("*GOOGLE-STOP-WORDS-UNOFFICIAL*");

    public static final SubLObject google_stop_words_unofficial() {
        return $google_stop_words_unofficial$.getGlobalValue();
    }

    // deflexical
    private static final SubLSymbol $gg_geographical_skses_registered$ = makeSymbol("*GG-GEOGRAPHICAL-SKSES-REGISTERED*");

    /**
     * the list of observed raw answer strings for a particular incomplete gaf used to prevent
     * processing of duplicates
     */
    // defvar
    private static final SubLSymbol $gg_observed_raw_ans_strings$ = makeSymbol("*GG-OBSERVED-RAW-ANS-STRINGS*");

    /**
     * the indicator that the gaf-gathering process is executing to obtain data for an experiment
     */
    // deflexical
    public static final SubLSymbol $gg_within_an_experimentP$ = makeSymbol("*GG-WITHIN-AN-EXPERIMENT?*");

    /**
     * the gaf-gathering domain mt
     */
    // deflexical
    public static final SubLSymbol $gg_domain_mt$ = makeSymbol("*GG-DOMAIN-MT*");

    /**
     * the indicator for whether answer binding verification is relaxed to include coordinated phrases
     */
    // deflexical
    public static final SubLSymbol $gg_coordinated_phrase_verificationP$ = makeSymbol("*GG-COORDINATED-PHRASE-VERIFICATION?*");

    /**
     * A filename to which to send output that is intended to be used as input to a named entity recognizer
     *
     * @unknown this variable is typically given a value by the init-file used to start the work
    (in /cyc/top/scripts/gaf-gathering/gaf-gathering-worker-init.lisp)
     */
    // deflexical
    public static final SubLSymbol $gg_filename_for_ner_output$ = makeSymbol("*GG-FILENAME-FOR-NER-OUTPUT*");

    /**
     * A boolean gating whether an explanatory header is included in the NER output file (see @xref POSSIBLY-PRINT-NER-OUTPUT-HEADER)
     */
    // defparameter
    public static final SubLSymbol $gg_ner_output_include_explanatory_headerP$ = makeSymbol("*GG-NER-OUTPUT-INCLUDE-EXPLANATORY-HEADER?*");

    // defparameter
    private static final SubLSymbol $gg_filestream_for_ner_output$ = makeSymbol("*GG-FILESTREAM-FOR-NER-OUTPUT*");

    public static final class $kag_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return generate_gafs.$kag_native.structDecl;
        }

        public SubLObject getField2() {
            return $focus;
        }

        public SubLObject getField3() {
            return $constraining_col;
        }

        public SubLObject getField4() {
            return $fact_gathering_process;
        }

        public SubLObject getField5() {
            return $psg_methods;
        }

        public SubLObject setField2(SubLObject value) {
            return $focus = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $constraining_col = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $fact_gathering_process = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $psg_methods = value;
        }

        public SubLObject $focus = Lisp.NIL;

        public SubLObject $constraining_col = Lisp.NIL;

        public SubLObject $fact_gathering_process = Lisp.NIL;

        public SubLObject $psg_methods = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(generate_gafs.$kag_native.class, KAG, KAG_P, $list_alt13, $list_alt14, new String[]{ "$focus", "$constraining_col", "$fact_gathering_process", "$psg_methods" }, $list_alt15, $list_alt16, PRINT_KAG);
    }

    // defconstant
    public static final SubLSymbol $dtp_kag$ = makeSymbol("*DTP-KAG*");

    public static final SubLObject kag_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_kag(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject kag_p(SubLObject v_object) {
        return v_object.getClass() == generate_gafs.$kag_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $kag_p$UnaryFunction extends UnaryFunction {
        public $kag_p$UnaryFunction() {
            super(extractFunctionNamed("KAG-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return kag_p(arg1);
        }
    }

    public static final SubLObject kag_focus(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.getField2();
    }

    public static final SubLObject kag_constraining_col(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.getField3();
    }

    public static final SubLObject kag_fact_gathering_process(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.getField4();
    }

    public static final SubLObject kag_psg_methods(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.getField5();
    }

    public static final SubLObject _csetf_kag_focus(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_kag_constraining_col(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_kag_fact_gathering_process(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_kag_psg_methods(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KAG_P);
        return v_object.setField5(value);
    }

    public static final SubLObject make_kag(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new generate_gafs.$kag_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FOCUS)) {
                        _csetf_kag_focus(v_new, current_value);
                    } else
                        if (pcase_var.eql($CONSTRAINING_COL)) {
                            _csetf_kag_constraining_col(v_new, current_value);
                        } else
                            if (pcase_var.eql($FACT_GATHERING_PROCESS)) {
                                _csetf_kag_fact_gathering_process(v_new, current_value);
                            } else
                                if (pcase_var.eql($PSG_METHODS)) {
                                    _csetf_kag_psg_methods(v_new, current_value);
                                } else {
                                    Errors.error($str_alt31$Invalid_slot__S_for_construction_, current_arg);
                                }



                }
            }
            return v_new;
        }
    }

    /**
     * Creates a new Knowledge Acquisition Goal given a PARTIAL-GAF and a
     * CONSTRAINING-COL for the binding.
     *
     * @param PARTIAL-GAF
     * 		el-sentence-p
     * @param CONSTRAINING-COL
     * 		collection-p
     * @param FACT-GATHERING-PROCESS
     * 		fort-p; instance of
     * 		#$CycBasedFactGatheringProcess
     * @param PSG-METHODS
     * 		listp; of PSG-METHOD-P
     * @return KAG kag-p
     */
    public static final SubLObject new_kag(SubLObject focus, SubLObject constraining_col, SubLObject fact_gathering_process, SubLObject psg_methods) {
        if (constraining_col == UNPROVIDED) {
            constraining_col = NIL;
        }
        if (fact_gathering_process == UNPROVIDED) {
            fact_gathering_process = NIL;
        }
        if (psg_methods == UNPROVIDED) {
            psg_methods = NIL;
        }
        {
            SubLObject kag = make_kag(UNPROVIDED);
            _csetf_kag_focus(kag, focus);
            _csetf_kag_constraining_col(kag, constraining_col);
            _csetf_kag_fact_gathering_process(kag, fact_gathering_process);
            _csetf_kag_psg_methods(kag, psg_methods);
            return kag;
        }
    }

    /**
     * Print a Knowledge Acquisition Goal to STREAM.
     */
    public static final SubLObject print_kag(SubLObject kag, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt32$__KAG___S___S__, kag_focus(kag), kag_constraining_col(kag));
        return kag;
    }

    /**
     * the indicator to the worker that GAF gathering should continue until candidates are exhausted
     */
    // deflexical
    public static final SubLSymbol $gg_doneP$ = makeSymbol("*GG-DONE?*");

    /**
     * the indicator that GAF gathering should continue processing with the next kag when an error is caught.
     */
    // deflexical
    public static final SubLSymbol $gg_continue_on_caught_errorP$ = makeSymbol("*GG-CONTINUE-ON-CAUGHT-ERROR?*");

    /**
     * the Google API daily usage limit beyond which this application will await the new day, and a reset of the count
     */
    // defconstant
    public static final SubLSymbol $gg_google_api_license_daily_usage_limit$ = makeSymbol("*GG-GOOGLE-API-LICENSE-DAILY-USAGE-LIMIT*");

    /**
     * the number of seconds to repeatedly sleep while awaiting the reset of the Google API usage count
     */
    // defconstant
    private static final SubLSymbol $gg_google_license_usage_reset_wait_seconds$ = makeSymbol("*GG-GOOGLE-LICENSE-USAGE-RESET-WAIT-SECONDS*");

    /**
     * A hash table with each entry of the type
     * (complete-gaf -> verification-metrics).  It is re-initialized for every new
     * partial sentence that is being processed.
     */
    // deflexical
    private static final SubLSymbol $gg_tried_to_verify_gafs_table$ = makeSymbol("*GG-TRIED-TO-VERIFY-GAFS-TABLE*");

    /**
     * Runs the gaf gathering application for a worker Cyc image.  MASTER-CYC-HOST and
     * MASTER-CYC-PORT specify the location of the master Cyc image.
     */
    public static final SubLObject process_next_kags(SubLObject master_cyc_host, SubLObject master_cyc_port, SubLObject max_num) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current_wait_time = floor_on_waiting_for_help();
                SubLObject google_server_timed_outP = NIL;
                SubLObject license_count = NIL;
                SubLObject done_count = ZERO_INTEGER;
                SubLObject doneP = $gg_doneP$.getGlobalValue();
                initialize_gaf_gathering_worker_monitor();
                {
                    SubLObject filename_var = $gg_filename_for_ner_output$.getGlobalValue();
                    if (NIL != filename_var) {
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(filename_var, $APPEND, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt36$Unable_to_open__S, filename_var);
                                }
                                {
                                    SubLObject _prev_bind_0 = $gg_filestream_for_ner_output$.currentBinding(thread);
                                    try {
                                        $gg_filestream_for_ner_output$.bind(stream, thread);
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (!$gg_filestream_for_ner_output$.getDynamicValue(thread).isStream()) {
                                                Errors.error($str_alt37$no_NER_output_stream_for__A, $gg_filename_for_ner_output$.getGlobalValue());
                                            }
                                        }
                                        possibly_print_ner_output_header();
                                        {
                                            SubLObject directory = gaf_gathering_metrics.create_new_unique_gaf_gathering_metrics_directory();
                                            SubLObject filename = cconcatenate(directory, $str_alt38$metrics_cfasl);
                                            SubLObject v_metrics_filename = cconcatenate(directory, $str_alt39$verification_metrics_cfasl);
                                            SubLObject stream_1 = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                    try {
                                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                        stream_1 = compatibility.open_binary(filename, $OUTPUT, NIL);
                                                    } finally {
                                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                                if (!stream_1.isStream()) {
                                                    Errors.error($str_alt36$Unable_to_open__S, filename);
                                                }
                                                {
                                                    SubLObject _prev_bind_0_3 = gaf_gathering_metrics.$gg_metrics_cfasl_stream$.currentBinding(thread);
                                                    try {
                                                        gaf_gathering_metrics.$gg_metrics_cfasl_stream$.bind(stream_1, thread);
                                                        {
                                                            SubLObject stream_4 = NIL;
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0_5 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                    try {
                                                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                        stream_4 = compatibility.open_binary(v_metrics_filename, $OUTPUT, NIL);
                                                                    } finally {
                                                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_5, thread);
                                                                    }
                                                                }
                                                                if (!stream_4.isStream()) {
                                                                    Errors.error($str_alt36$Unable_to_open__S, v_metrics_filename);
                                                                }
                                                                {
                                                                    SubLObject _prev_bind_0_6 = gaf_gathering_metrics.$gg_verification_metrics_cfasl_stream$.currentBinding(thread);
                                                                    try {
                                                                        gaf_gathering_metrics.$gg_verification_metrics_cfasl_stream$.bind(stream_4, thread);
                                                                        while (NIL == doneP) {
                                                                            gg_indicate_that_process_is_alive();
                                                                            {
                                                                                SubLObject ignore_errors_tag = NIL;
                                                                                try {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_7 = Errors.$error_handler$.currentBinding(thread);
                                                                                        try {
                                                                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                                            try {
                                                                                                license_count = search_engine.google_license_count();
                                                                                            } catch (Throwable catch_var) {
                                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            Errors.$error_handler$.rebind(_prev_bind_0_7, thread);
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable ccatch_env_var) {
                                                                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                                }
                                                                            }
                                                                            if (NIL == license_count) {
                                                                                license_count = ZERO_INTEGER;
                                                                            }
                                                                            if (license_count.numG($gg_google_api_license_daily_usage_limit$.getGlobalValue())) {
                                                                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt44$Google_API_daily_usage_limit_exce);
                                                                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                                                                                sleep($gg_google_license_usage_reset_wait_seconds$.getGlobalValue());
                                                                            } else {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject google_server_timed_outP_8 = process_next_kags_int(master_cyc_host, master_cyc_port, google_server_timed_outP, current_wait_time);
                                                                                    SubLObject current_wait_time_9 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    google_server_timed_outP = google_server_timed_outP_8;
                                                                                    current_wait_time = current_wait_time_9;
                                                                                }
                                                                            }
                                                                            done_count = add(done_count, ONE_INTEGER);
                                                                            doneP = makeBoolean((NIL != $gg_doneP$.getGlobalValue()) || ((NIL != max_num) && done_count.numG(max_num)));
                                                                        } 
                                                                    } finally {
                                                                        gaf_gathering_metrics.$gg_verification_metrics_cfasl_stream$.rebind(_prev_bind_0_6, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (stream_4.isStream()) {
                                                                            close(stream_4, UNPROVIDED);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        gaf_gathering_metrics.$gg_metrics_cfasl_stream$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (stream_1.isStream()) {
                                                            close(stream_1, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        $gg_filestream_for_ner_output$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject _prev_bind_0 = $gg_filestream_for_ner_output$.currentBinding(thread);
                            try {
                                $gg_filestream_for_ner_output$.bind(NIL, thread);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!$gg_filestream_for_ner_output$.getDynamicValue(thread).isStream()) {
                                        Errors.error($str_alt37$no_NER_output_stream_for__A, $gg_filename_for_ner_output$.getGlobalValue());
                                    }
                                }
                                possibly_print_ner_output_header();
                                {
                                    SubLObject directory = gaf_gathering_metrics.create_new_unique_gaf_gathering_metrics_directory();
                                    SubLObject filename = cconcatenate(directory, $str_alt38$metrics_cfasl);
                                    SubLObject v_metrics_filename = cconcatenate(directory, $str_alt39$verification_metrics_cfasl);
                                    SubLObject stream = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_12 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                        if (!stream.isStream()) {
                                            Errors.error($str_alt36$Unable_to_open__S, filename);
                                        }
                                        {
                                            SubLObject _prev_bind_0_13 = gaf_gathering_metrics.$gg_metrics_cfasl_stream$.currentBinding(thread);
                                            try {
                                                gaf_gathering_metrics.$gg_metrics_cfasl_stream$.bind(stream, thread);
                                                {
                                                    SubLObject stream_14 = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_15 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                            try {
                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                stream_14 = compatibility.open_binary(v_metrics_filename, $OUTPUT, NIL);
                                                            } finally {
                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                        if (!stream_14.isStream()) {
                                                            Errors.error($str_alt36$Unable_to_open__S, v_metrics_filename);
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_16 = gaf_gathering_metrics.$gg_verification_metrics_cfasl_stream$.currentBinding(thread);
                                                            try {
                                                                gaf_gathering_metrics.$gg_verification_metrics_cfasl_stream$.bind(stream_14, thread);
                                                                while (NIL == doneP) {
                                                                    gg_indicate_that_process_is_alive();
                                                                    {
                                                                        SubLObject ignore_errors_tag = NIL;
                                                                        try {
                                                                            {
                                                                                SubLObject _prev_bind_0_17 = Errors.$error_handler$.currentBinding(thread);
                                                                                try {
                                                                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                                    try {
                                                                                        license_count = search_engine.google_license_count();
                                                                                    } catch (Throwable catch_var) {
                                                                                        Errors.handleThrowable(catch_var, NIL);
                                                                                    }
                                                                                } finally {
                                                                                    Errors.$error_handler$.rebind(_prev_bind_0_17, thread);
                                                                                }
                                                                            }
                                                                        } catch (Throwable ccatch_env_var) {
                                                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                        }
                                                                    }
                                                                    if (NIL == license_count) {
                                                                        license_count = ZERO_INTEGER;
                                                                    }
                                                                    if (license_count.numG($gg_google_api_license_daily_usage_limit$.getGlobalValue())) {
                                                                        write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                        write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                        format($gg_status_message_stream$.getDynamicValue(thread), $str_alt44$Google_API_daily_usage_limit_exce);
                                                                        force_output($gg_status_message_stream$.getDynamicValue(thread));
                                                                        sleep($gg_google_license_usage_reset_wait_seconds$.getGlobalValue());
                                                                    } else {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject google_server_timed_outP_18 = process_next_kags_int(master_cyc_host, master_cyc_port, google_server_timed_outP, current_wait_time);
                                                                            SubLObject current_wait_time_19 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            google_server_timed_outP = google_server_timed_outP_18;
                                                                            current_wait_time = current_wait_time_19;
                                                                        }
                                                                    }
                                                                    done_count = add(done_count, ONE_INTEGER);
                                                                    doneP = makeBoolean((NIL != $gg_doneP$.getGlobalValue()) || ((NIL != max_num) && done_count.numG(max_num)));
                                                                } 
                                                            } finally {
                                                                gaf_gathering_metrics.$gg_verification_metrics_cfasl_stream$.rebind(_prev_bind_0_16, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (stream_14.isStream()) {
                                                                    close(stream_14, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                gaf_gathering_metrics.$gg_metrics_cfasl_stream$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream.isStream()) {
                                                    close(stream, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $gg_filestream_for_ner_output$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            $gg_worker_monitor_keep_goingP$.setGlobalValue(NIL);
            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt45$Done_gathering_GAFs___);
            force_output($gg_status_message_stream$.getDynamicValue(thread));
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $gg_catch_errorsP$ = makeSymbol("*GG-CATCH-ERRORS?*");

    public static final SubLObject process_next_kags_int(SubLObject master_cyc_host, SubLObject master_cyc_port, SubLObject google_server_timed_outP, SubLObject current_wait_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == google_server_upP()) {
                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt46$__________Google_server_is_down__, current_wait_time);
                force_output($gg_status_message_stream$.getDynamicValue(thread));
                sleep(current_wait_time);
                current_wait_time = escalate_wait_time_between_searches(current_wait_time);
            } else
                if (NIL != google_server_timed_outP) {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt47$After_Google_API_server_timeout__, current_wait_time);
                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                    sleep(current_wait_time);
                    current_wait_time = escalate_wait_time_between_searches(current_wait_time);
                    google_server_timed_outP = NIL;
                } else {
                    current_wait_time = de_escalate_wait_time_between_searches(current_wait_time);
                    if (NIL != $gg_continue_on_caught_errorP$.getGlobalValue()) {
                        {
                            SubLObject error_message = NIL;
                            if (NIL != error_message) {
                                try {
                                    {
                                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                google_server_timed_outP = process_next_kag(master_cyc_host, master_cyc_port);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    $gg_catch_errorsP$.setDynamicValue(Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue()), thread);
                                }
                            } else {
                                google_server_timed_outP = process_next_kag(master_cyc_host, master_cyc_port);
                            }
                            if (error_message.isString()) {
                                google_server_timed_outP = T;
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt49$Problem___A___, error_message);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }
                        }
                    } else {
                        google_server_timed_outP = process_next_kag(master_cyc_host, master_cyc_port);
                    }
                }

            return values(google_server_timed_outP, current_wait_time);
        }
    }

    /**
     * A special paraphrase mt containing templates appropriate for generating search strings
     */
    // deflexical
    private static final SubLSymbol $gaf_gathering_paraphrase_mt$ = makeSymbol("*GAF-GATHERING-PARAPHRASE-MT*");

    public static final SubLObject gaf_gathering_paraphrase_mt() {
        if ($gaf_gathering_paraphrase_mt$.getGlobalValue() == $UNINITIALIZED) {
            {
                SubLObject init_value = eval(constants_high.find_constant($str_alt51$EnglishParaphraseMt_ButlerTask));
                if (init_value == $UNINITIALIZED) {
                    Errors.error($str_alt52$Unable_to_initialize__A__, $gaf_gathering_paraphrase_mt$.getGlobalValue());
                }
                $gaf_gathering_paraphrase_mt$.setGlobalValue(eval(init_value));
            }
        }
        return $gaf_gathering_paraphrase_mt$.getGlobalValue();
    }

    /**
     * Processes the next partial gaf, returning an indicator whether the Google API
     * server timed-out.  MASTER-CYC-HOST and MASTER-CYC-PORT specify the location
     * of the master Cyc image.
     */
    public static final SubLObject process_next_kag(SubLObject master_cyc_host, SubLObject master_cyc_port) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject google_server_timed_outP = NIL;
                SubLObject paraphrase_mt = gaf_gathering_paraphrase_mt();
                SubLObject kag = NIL;
                kag = (NIL != master_cyc_host) ? ((SubLObject) (gg_remote_eval(list(GET_NEXT_KAG_FOR_GATHERING, Environment.get_machine_name(UNPROVIDED), system_parameters.$base_tcp_port$.getDynamicValue(thread)), master_cyc_host, master_cyc_port))) : gaf_gathering_master.get_next_kag_for_gathering(Environment.get_machine_name(UNPROVIDED), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                if (NIL != kag_p(kag)) {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt54$Considering__A__, kag);
                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                    {
                        SubLObject google_error = NIL;
                        SubLObject error_message = NIL;
                        try {
                            {
                                SubLObject kag_focus = kag_focus(kag);
                                if (NIL != cycl_grammar.cycl_sentence_p(kag_focus)) {
                                    gaf_gathering_metrics.maybe_record_gg_metrics(add_gafs_using_text_corpus_for_kag(kag, paraphrase_mt, T, master_cyc_host, master_cyc_port));
                                    gaf_gathering_master.set_tried_partial_gaf(kag_focus(kag), master_cyc_host, master_cyc_port);
                                } else {
                                    {
                                        SubLObject metrics_list = gather_facts_about_term_kag(kag, paraphrase_mt, T, master_cyc_host, master_cyc_port);
                                        SubLObject cdolist_list_var = metrics_list;
                                        SubLObject metrics = NIL;
                                        for (metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metrics = cdolist_list_var.first()) {
                                            gaf_gathering_metrics.maybe_record_gg_metrics(metrics);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            google_error = Errors.handleThrowable(ccatch_env_var, $GOOGLE_PROBLEM);
                        }
                        if (NIL != list_utilities.sublisp_boolean(google_error)) {
                            google_server_timed_outP = T;
                        }
                        if (error_message.isString()) {
                            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt56$Analyzing__A_caused_the_following, kag, error_message);
                            force_output($gg_status_message_stream$.getDynamicValue(thread));
                        }
                    }
                } else {
                    $gg_doneP$.setGlobalValue(T);
                }
                return google_server_timed_outP;
            }
        }
    }

    /**
     * the gaf-gathering event which is created if any novel bindings are found. Because this
     * object is lazily created, it first contains a list of the arguments to gg-assert-gaf-gathering
     * required to create it.
     */
    // defparameter
    private static final SubLSymbol $gaf_gathering_event$ = makeSymbol("*GAF-GATHERING-EVENT*");

    /**
     * the string-based searching event which is created if any novel bindings are found. Because this
     * object is lazily created, it first contains a list of the arguments to gg-assert-string-based-searching
     * required to create it.
     */
    // defparameter
    private static final SubLSymbol $string_based_searching_event$ = makeSymbol("*STRING-BASED-SEARCHING-EVENT*");

    /**
     * the obtaining a search result event which is created if any novel bindings are found. Because this
     * object is lazily created, it first contains a list of the arguments to gg-assert-obtaining-a-search-result
     * required to create it.
     */
    // defparameter
    private static final SubLSymbol $obtaining_a_search_result_event$ = makeSymbol("*OBTAINING-A-SEARCH-RESULT-EVENT*");

    /**
     * Adds GAFs to the Cyc KB by completing the input incomplete GAF using answer
     * strings found on the Internet.
     *
     * @param KAG
     * 		kag-p; e.g.(#$birthDate #$YassirArafat ?DATE) [#$Date]
     * @param SEARCH-STRING-MT;
     * 		Microtheory that should be used to generate
     * 		search-strings
     * @param SHOW-RESULTS?;
     * 		when T, print pacifier information to STDOUT
     * @param MASTER-CYC-HOST;
     * 		the name of the computer hosting the Cyc image that
     * 		controls the gaf-gather server farm
     * @param MASTER-CYC-PORT;
     * 		the cfasl listening port of the master Cyc image
     * @return GG-METRICS-P
     */
    public static final SubLObject add_gafs_using_text_corpus_for_kag(SubLObject kag, SubLObject search_string_mt, SubLObject show_resultsP, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (search_string_mt == UNPROVIDED) {
            search_string_mt = gaf_gathering_paraphrase_mt();
        }
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(kag, KAG_P);
            SubLTrampolineFile.checkType(search_string_mt, $sym57$ISA_MT_);
            {
                SubLObject partial_gaf = kag_focus(kag);
                SubLObject fact_gathering_process = kag_fact_gathering_process(kag);
                if (NIL == el_grammar.el_sentence_p(partial_gaf)) {
                    {
                        SubLObject transformed = cycl_utilities.transform_hl_to_el(partial_gaf);
                        SubLTrampolineFile.checkType(transformed, EL_SENTENCE_P);
                        partial_gaf = transformed;
                    }
                }
                {
                    SubLObject metrics = list(cycl_utilities.hl_to_el(partial_gaf));
                    $gg_tried_to_verify_gafs_table$.setGlobalValue(make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUAL), UNPROVIDED));
                    {
                        SubLObject _prev_bind_0 = $gaf_gathering_event$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $string_based_searching_event$.currentBinding(thread);
                        try {
                            $gaf_gathering_event$.bind(list(partial_gaf, master_cyc_host, master_cyc_port, fact_gathering_process), thread);
                            $string_based_searching_event$.bind(NIL, thread);
                            {
                                SubLObject search_string_metrics = NIL;
                                SubLObject total_milliseconds = NIL;
                                SubLObject time_var = get_internal_real_time();
                                thread.resetMultipleValues();
                                {
                                    SubLObject raw_search_strings = search_strings(partial_gaf, search_string_mt);
                                    SubLObject invalid_search_strings = thread.secondMultipleValue();
                                    SubLObject generation_milliseconds = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    metrics = cons(generation_milliseconds, metrics);
                                    search_string_metrics = add_gafs_for_search_strings(raw_search_strings, kag, show_resultsP, master_cyc_host, master_cyc_port);
                                    {
                                        SubLObject cdolist_list_var = invalid_search_strings;
                                        SubLObject invalid_search_string = NIL;
                                        for (invalid_search_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , invalid_search_string = cdolist_list_var.first()) {
                                            search_string_metrics = cons(list(ZERO_INTEGER, NIL, $INVALID, invalid_search_string), search_string_metrics);
                                        }
                                    }
                                }
                                total_milliseconds = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                total_milliseconds = truncate(multiply(total_milliseconds, $int$1000), UNPROVIDED);
                                metrics = cons(search_string_metrics, metrics);
                                metrics = cons(total_milliseconds, metrics);
                            }
                        } finally {
                            $string_based_searching_event$.rebind(_prev_bind_1, thread);
                            $gaf_gathering_event$.rebind(_prev_bind_0, thread);
                        }
                    }
                    $gg_tried_to_verify_gafs_table$.setGlobalValue(NIL);
                    return metrics;
                }
            }
        }
    }

    /**
     * Adds GAFs to the Cyc KB by completing the input incomplete GAF using answer
     * strings found on the Internet.
     *
     * @param PARTIAL-GAF
     * 		cycl-sentence-p; e.g.(#$birthDate #$YassirArafat ?X)
     * @param CONSTRAINING-COL
     * 		collection-p; e.g. #$Date.  By default, the #$argIsa
     * 		will be used.
     * @param SEARCH-STRING-MT;
     * 		Microtheory that should be used to generate
     * 		search-strings
     * @param SHOW-RESULTS?;
     * 		when T, print pacifier information to STDOUT
     * @return GG-METRICS-P
     */
    public static final SubLObject add_gafs_using_text_corpus(SubLObject partial_gaf, SubLObject constraining_col, SubLObject search_string_mt, SubLObject show_resultsP) {
        if (constraining_col == UNPROVIDED) {
            constraining_col = NIL;
        }
        if (search_string_mt == UNPROVIDED) {
            search_string_mt = gaf_gathering_paraphrase_mt();
        }
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        if (NIL == el_grammar.el_sentence_p(partial_gaf)) {
            {
                SubLObject transformed = cycl_utilities.transform_hl_to_el(partial_gaf);
                SubLTrampolineFile.checkType(transformed, EL_SENTENCE_P);
                partial_gaf = transformed;
            }
        }
        SubLTrampolineFile.checkType(constraining_col, COLLECTION_P);
        SubLTrampolineFile.checkType(search_string_mt, $sym57$ISA_MT_);
        SubLTrampolineFile.checkType(show_resultsP, BOOLEANP);
        {
            SubLObject gg_metrics = add_gafs_using_text_corpus_for_kag(new_kag(partial_gaf, constraining_col, UNPROVIDED, UNPROVIDED), search_string_mt, show_resultsP, UNPROVIDED, UNPROVIDED);
            SubLObject gafs = NIL;
            SubLObject cdolist_list_var = second(gg_metrics);
            SubLObject search_string_metrics = NIL;
            for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_22 = second(search_string_metrics);
                    SubLObject search_result_metrics = NIL;
                    for (search_result_metrics = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , search_result_metrics = cdolist_list_var_22.first()) {
                        {
                            SubLObject filler_string_metrics = second(search_result_metrics);
                            if (filler_string_metrics != $DUPLICATE) {
                                {
                                    SubLObject cdolist_list_var_23 = filler_string_metrics;
                                    SubLObject one_filler_string_metrics = NIL;
                                    for (one_filler_string_metrics = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , one_filler_string_metrics = cdolist_list_var_23.first()) {
                                        {
                                            SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                            SubLObject cdolist_list_var_24 = complete_gaf_metrics;
                                            SubLObject one_complete_gaf_metrics = NIL;
                                            for (one_complete_gaf_metrics = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , one_complete_gaf_metrics = cdolist_list_var_24.first()) {
                                                {
                                                    SubLObject item_var = gaf_gathering_metrics.gg_one_complete_gaf_metrics_gaf(one_complete_gaf_metrics);
                                                    if (NIL == member(item_var, gafs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        gafs = cons(item_var, gafs);
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
            return gafs;
        }
    }

    public static final SubLObject gg_kags_for_kbq_col(SubLObject kbq_col, SubLObject v_term, SubLObject fact_gathering_process) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kags = NIL;
                SubLObject cdolist_list_var = isa.all_fort_instances(kbq_col, $$InferencePSC, UNPROVIDED);
                SubLObject kbq = NIL;
                for (kbq = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kbq = cdolist_list_var.first()) {
                    {
                        SubLObject sentence = cycl_utilities.expression_subst(v_term, $$TheFactGatheringFocalTerm, kb_query.kbq_sentence(kbq), symbol_function(EQUAL), UNPROVIDED);
                        SubLObject kbq_query_properties = kb_query.kbq_query_properties(kbq);
                        SubLObject inference = inference_kernel.new_continuable_inference(sentence, kb_query.kbq_mt(kbq), inference_datastructures_enumerated_types.extract_query_static_properties(kbq_query_properties));
                        SubLObject inference_iterator = inference_iterators.new_inference_iterator(inference, inference_datastructures_enumerated_types.extract_query_dynamic_properties(kbq_query_properties), DESTROY_INFERENCE_AND_PROBLEM_STORE);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_bindings = iteration.iteration_next(inference_iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject pred = bindings.variable_lookup($sym66$_OPER, v_bindings);
                                        SubLObject value = bindings.variable_lookup($sym67$_VAL, v_bindings);
                                        SubLObject var_pos = bindings.variable_lookup($sym68$_VAR_POS, v_bindings);
                                        SubLObject constraining_collection = bindings.variable_lookup($sym69$_TYPE, v_bindings);
                                        SubLObject kag_ps = NIL;
                                        SubLObject pcase_var = var_pos;
                                        if (pcase_var.eql(ONE_INTEGER)) {
                                            kag_ps = list(pred, $sym70$_X, value);
                                        } else
                                            if (pcase_var.eql(TWO_INTEGER)) {
                                                kag_ps = list(pred, value, $sym70$_X);
                                            } else {
                                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt71$Invalid_variable_position___S_for, var_pos);
                                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                                            }

                                        kags = cons(new_kag(kag_ps, constraining_collection, fact_gathering_process, UNPROVIDED), kags);
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                }
                return kags;
            }
        }
    }

    /**
     * Extracts information about KAG from a corpus (e.g. the World Wide Web). Uses
     * the input partial sentence generation methods (i.e. KAG-PSG-METHODS) to
     * create partial CycL sentences.  Tries to complete these partial sentences
     * using ADD-GAFS-USING-TEXT-CORPUS.  Returns a list of gaf-gathering metrics
     * data-structures.
     *
     * @param KAG
     * 		cycl-term-p
     * @param PSG-METHODS
     * 		listp; of kag-generation-method-p
     * @return listp; of gg-metrics-p
     */
    public static final SubLObject gather_facts_about_term_kag(SubLObject input_kag, SubLObject search_string_mt, SubLObject show_resultsP, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (search_string_mt == UNPROVIDED) {
            search_string_mt = gaf_gathering_paraphrase_mt();
        }
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_kag, KAG_P);
            {
                SubLObject v_term = kag_focus(input_kag);
                SubLObject psg_methods = kag_psg_methods(input_kag);
                SubLObject fact_gathering_process = kag_fact_gathering_process(input_kag);
                SubLObject kags = NIL;
                SubLObject metrics_list = NIL;
                {
                    SubLObject cdolist_list_var = psg_methods;
                    SubLObject psg_method = NIL;
                    for (psg_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psg_method = cdolist_list_var.first()) {
                        {
                            SubLObject pcase_var = psg_method;
                            if (pcase_var.eql($FET)) {
                                kags = union(kags, gg_kags_for_kbq_col($const74$FactGatheringPSQ_CAETemplates_Spe, v_term, fact_gathering_process), UNPROVIDED, UNPROVIDED);
                            } else {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt75$Invalid_partial_sentence_generati, psg_method);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = kags;
                    SubLObject kag = NIL;
                    for (kag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kag = cdolist_list_var.first()) {
                        metrics_list = cons(add_gafs_using_text_corpus_for_kag(kag, search_string_mt, show_resultsP, master_cyc_host, master_cyc_port), metrics_list);
                    }
                }
                return metrics_list;
            }
        }
    }

    /**
     * Extracts information about TERM from a corpus (e.g. the World Wide Web). Uses
     * the input partial sentence generation methods (i.e. PSG-METHODS) to
     * create partial CycL sentences.  Tries to complete these partial sentences
     * using ADD-GAFS-USING-TEXT-CORPUS.  Returns a list of gaf-gathering metrics
     * data-structures.
     *
     * @param TERM
     * 		cycl-term-p
     * @param PSG-METHODS
     * 		listp; of kag-generation-method-p
     * @return listp; of gg-metrics-p
     */
    public static final SubLObject gather_facts_about_term(SubLObject v_term, SubLObject psg_methods, SubLObject search_string_mt, SubLObject show_resultsP) {
        if (psg_methods == UNPROVIDED) {
            psg_methods = list($FET);
        }
        if (search_string_mt == UNPROVIDED) {
            search_string_mt = gaf_gathering_paraphrase_mt();
        }
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        SubLTrampolineFile.checkType(v_term, CYCL_TERM_P);
        SubLTrampolineFile.checkType(psg_methods, LISTP);
        SubLTrampolineFile.checkType(search_string_mt, CYCL_TERM_P);
        SubLTrampolineFile.checkType(show_resultsP, BOOLEANP);
        {
            SubLObject gg_metrics_list = gather_facts_about_term_kag(new_kag(v_term, NIL, NIL, psg_methods), search_string_mt, show_resultsP, UNPROVIDED, UNPROVIDED);
            SubLObject facts = NIL;
            SubLObject cdolist_list_var = gg_metrics_list;
            SubLObject gg_metrics = NIL;
            for (gg_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gg_metrics = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_25 = second(gg_metrics);
                    SubLObject search_string_metrics = NIL;
                    for (search_string_metrics = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , search_string_metrics = cdolist_list_var_25.first()) {
                        {
                            SubLObject cdolist_list_var_26 = second(search_string_metrics);
                            SubLObject search_result_metrics = NIL;
                            for (search_result_metrics = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , search_result_metrics = cdolist_list_var_26.first()) {
                                {
                                    SubLObject filler_string_metrics = second(search_result_metrics);
                                    if (filler_string_metrics != $DUPLICATE) {
                                        {
                                            SubLObject cdolist_list_var_27 = filler_string_metrics;
                                            SubLObject one_filler_string_metrics = NIL;
                                            for (one_filler_string_metrics = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , one_filler_string_metrics = cdolist_list_var_27.first()) {
                                                {
                                                    SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                                    SubLObject cdolist_list_var_28 = complete_gaf_metrics;
                                                    SubLObject one_complete_gaf_metrics = NIL;
                                                    for (one_complete_gaf_metrics = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , one_complete_gaf_metrics = cdolist_list_var_28.first()) {
                                                        {
                                                            SubLObject item_var = gaf_gathering_metrics.gg_one_complete_gaf_metrics_gaf(one_complete_gaf_metrics);
                                                            if (NIL == member(item_var, facts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                facts = cons(item_var, facts);
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
            }
            return facts;
        }
    }

    /**
     *
     *
     * @return GG-SEARCH-STRING-METRICS-P
     */
    public static final SubLObject add_gafs_for_search_strings(SubLObject raw_search_strings, SubLObject kag, SubLObject show_resultsP, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            SubLObject metrics = NIL;
            SubLObject cdolist_list_var = raw_search_strings;
            SubLObject raw_search_string = NIL;
            for (raw_search_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , raw_search_string = cdolist_list_var.first()) {
                gg_indicate_that_process_is_alive();
                {
                    SubLObject search_string_metrics = add_gafs_for_search_string(raw_search_string, kag, show_resultsP, master_cyc_host, master_cyc_port);
                    metrics = cons(search_string_metrics, metrics);
                }
            }
            return metrics;
        }
    }

    /**
     *
     *
     * @return GG-ONE-SEARCH-STRING-METRICS-P
     */
    public static final SubLObject add_gafs_for_search_string(SubLObject raw_search_string, SubLObject kag, SubLObject show_resultsP, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_milliseconds = NIL;
                SubLObject search_results_metrics = NIL;
                SubLObject validity = $VALID;
                SubLObject search_string = NIL;
                SubLObject asserting_milliseconds = NIL;
                SubLObject search_engine_wait_ms = NIL;
                SubLObject massaging_milliseconds = NIL;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject mode = mode_to_parse_answer(raw_search_string);
                    {
                        SubLObject _prev_bind_0 = $gg_observed_raw_ans_strings$.currentBinding(thread);
                        try {
                            $gg_observed_raw_ans_strings$.bind(NIL, thread);
                            {
                                SubLObject time_var_29 = get_internal_real_time();
                                search_string = massage_search_string(raw_search_string);
                                massaging_milliseconds = divide(subtract(get_internal_real_time(), time_var_29), time_high.$internal_time_units_per_second$.getGlobalValue());
                                massaging_milliseconds = truncate(multiply(massaging_milliseconds, $int$1000), UNPROVIDED);
                            }
                            if (NIL != show_resultsP) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt79$__search_with___A__, search_string);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }
                            {
                                SubLObject v_bindings = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                SubLObject search_engine_results = NIL;
                                SubLObject seconds_duration = NIL;
                                {
                                    SubLObject time_var_30 = get_internal_real_time();
                                    search_engine_results = nreverse(search_engine_results(search_string, UNPROVIDED, UNPROVIDED));
                                    seconds_duration = divide(subtract(get_internal_real_time(), time_var_30), time_high.$internal_time_units_per_second$.getGlobalValue());
                                }
                                $string_based_searching_event$.setDynamicValue(list(date_utilities.universal_time_to_cycl_date(get_universal_time()), $$Google_SearchEngine, search_string, length(search_engine_results), list($$SecondsDuration, seconds_duration), master_cyc_host, master_cyc_port), thread);
                                search_engine_wait_ms = truncate(multiply(seconds_duration, $int$1000), UNPROVIDED);
                                search_results_metrics = add_gafs_for_search_results(v_bindings, search_engine_results, kag, search_string, mode, show_resultsP, master_cyc_host, master_cyc_port);
                                {
                                    SubLObject time_var_31 = get_internal_real_time();
                                    {
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_bindings));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject binding = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject statuses = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject nbr_of_supports = NIL;
                                                    SubLObject cdolist_list_var = statuses;
                                                    SubLObject status = NIL;
                                                    for (status = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , status = cdolist_list_var.first()) {
                                                        if (status.isCons()) {
                                                            nbr_of_supports = second(status);
                                                            gg_assert_search_results_support(binding, nbr_of_supports, master_cyc_host, master_cyc_port);
                                                        }
                                                    }
                                                }
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                    asserting_milliseconds = divide(subtract(get_internal_real_time(), time_var_31), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    asserting_milliseconds = truncate(multiply(asserting_milliseconds, $int$1000), UNPROVIDED);
                                }
                            }
                        } finally {
                            $gg_observed_raw_ans_strings$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                total_milliseconds = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                total_milliseconds = truncate(multiply(total_milliseconds, $int$1000), UNPROVIDED);
                {
                    SubLObject search_string_metrics = list(total_milliseconds, search_results_metrics, validity, search_string, asserting_milliseconds, search_engine_wait_ms, massaging_milliseconds);
                    return search_string_metrics;
                }
            }
        }
    }

    public static final SubLObject add_gafs_for_search_results(SubLObject v_bindings, SubLObject search_engine_results, SubLObject kag, SubLObject search_string, SubLObject mode, SubLObject show_resultsP, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            SubLObject metrics = NIL;
            SubLObject cdolist_list_var = search_engine_results;
            SubLObject search_engine_result = NIL;
            for (search_engine_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_engine_result = cdolist_list_var.first()) {
                gg_indicate_that_process_is_alive();
                {
                    SubLObject this_result_metrics = process_one_search_engine_result(v_bindings, search_engine_result, kag, search_string, mode, show_resultsP, master_cyc_host, master_cyc_port);
                    metrics = cons(this_result_metrics, metrics);
                }
            }
            return metrics;
        }
    }

    /**
     * Attempts to find bindings for the PARTIAL-GAF (e.g. (#$totalValueOfAssets #$NewZealand ?X))
     * and SEARCH-STRING (e.g. 'New Zealand is worth *'), learned from the web search engine.
     *
     * @param BINDINGS
     * 		dictionary-p; dictionary of binding --> list of [:refuted | :known | :unverified] symbols,
     * 		except that when verified the value is (:verified nbr-of-supports)
     * @param SEARCH-ENGINE-RESULT
     * 		listp; a list consisting of web page text, offset, host-computer,
     * 		pathname, url, rank and num-hits.
     * @param SEARCH-STRING
     * 		stringp; (e.g. 'New Zealand is worth *')
     * @param MODE
     * 		symbolp; :forward, :backward or :between, derived from the position of the binding
     * 		with respect to the SEARCH-STRING
     * @param SHOW-RESULTS?
     * 		booleanp; indicates logging to the console
     * @param MASTER-CYC-HOST:
     * 		the name of the computer hosting the Cyc image that controls the gaf-gather server farm
     * @param MASTER-CYC-PORT:
     * 		the cfasl listening port of the master Cyc image
     * @return GG-SEARCH-RESULT-METRICS-P
     */
    public static final SubLObject process_one_search_engine_result(SubLObject v_bindings, SubLObject search_engine_result, SubLObject kag, SubLObject search_string, SubLObject mode, SubLObject show_resultsP, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = NIL;
        }
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(search_engine_result, CONSP);
            SubLTrampolineFile.checkType(kag, KAG_P);
            SubLTrampolineFile.checkType(search_string, STRINGP);
            SubLTrampolineFile.checkType(mode, SYMBOLP);
            {
                SubLObject metrics = NIL;
                SubLObject total_milliseconds = NIL;
                SubLObject filler_string_metrics = NIL;
                SubLObject time_var = get_internal_real_time();
                thread.resetMultipleValues();
                {
                    SubLObject raw_ans_string = parse_search_engine_result_set(search_engine_result);
                    SubLObject offset = thread.secondMultipleValue();
                    SubLObject file = thread.thirdMultipleValue();
                    SubLObject cycl_uri = thread.fourthMultipleValue();
                    SubLObject rank_of_result = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    metrics = cons(rank_of_result, metrics);
                    metrics = cons(evaluation_defns.url_string(cycl_uri), metrics);
                    {
                        SubLObject duplicateP = subl_promotions.memberP(raw_ans_string, $gg_observed_raw_ans_strings$.getDynamicValue(thread), symbol_function($sym85$STRING_), UNPROVIDED);
                        if (NIL == duplicateP) {
                            $gg_observed_raw_ans_strings$.setDynamicValue(cons(raw_ans_string, $gg_observed_raw_ans_strings$.getDynamicValue(thread)), thread);
                        } else
                            if (NIL != show_resultsP) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt86$______dup___A__, raw_ans_string);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }

                        if (NIL != duplicateP) {
                            filler_string_metrics = $DUPLICATE;
                        } else
                            if (NIL != is_valid_raw_answer_stringP(raw_ans_string)) {
                                {
                                    SubLObject unquoted_search_string = string_utilities.unquote_string(search_string);
                                    SubLObject filler_strings = massage_answer_string(raw_ans_string, unquoted_search_string, mode);
                                    if (NIL != show_resultsP) {
                                        write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        format($gg_status_message_stream$.getDynamicValue(thread), $str_alt87$_____A__, raw_ans_string);
                                        force_output($gg_status_message_stream$.getDynamicValue(thread));
                                    }
                                    if (NIL != gg_untrue_sentenceP(raw_ans_string, unquoted_search_string, filler_strings, mode)) {
                                        if (NIL != show_resultsP) {
                                            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt88$_________is_untrue__);
                                            force_output($gg_status_message_stream$.getDynamicValue(thread));
                                        }
                                    } else {
                                        {
                                            SubLObject cdolist_list_var = filler_strings;
                                            SubLObject filler_string_tuple = NIL;
                                            for (filler_string_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filler_string_tuple = cdolist_list_var.first()) {
                                                gg_indicate_that_process_is_alive();
                                                {
                                                    SubLObject this_filler_string_metrics = add_gafs_for_filler_string_tuple(filler_string_tuple, unquoted_search_string, kag, mode, show_resultsP, raw_ans_string, v_bindings, cycl_uri, rank_of_result, master_cyc_host, master_cyc_port, filler_strings);
                                                    filler_string_metrics = cons(this_filler_string_metrics, filler_string_metrics);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                format(T, $str_alt89$Could_not_extract_valid_answer_st, search_engine_result);
                            }

                    }
                }
                total_milliseconds = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                total_milliseconds = truncate(multiply(total_milliseconds, $int$1000), UNPROVIDED);
                metrics = cons(filler_string_metrics, metrics);
                metrics = cons(total_milliseconds, metrics);
                return metrics;
            }
        }
    }

    /**
     *
     *
     * @return GG-ONE-FILLER-STRING-METRICS-P
     */
    public static final SubLObject add_gafs_for_filler_string_tuple(SubLObject filler_string_tuple, SubLObject unquoted_search_string, SubLObject kag, SubLObject mode, SubLObject show_resultsP, SubLObject raw_ans_string, SubLObject v_bindings, SubLObject cycl_uri, SubLObject rank_of_result, SubLObject master_cyc_host, SubLObject master_cyc_port, SubLObject filler_strings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject partial_gaf = kag_focus(kag);
                SubLObject domain_mt = $gg_domain_mt$.getGlobalValue();
                SubLObject var_pos = variable_position_in_gaf(partial_gaf);
                SubLObject filler_string = filler_string_tuple.first();
                SubLObject complete_gaf_metrics = NIL;
                SubLObject parsing_ms = NIL;
                SubLObject total_milliseconds = NIL;
                SubLObject ans_cycls = NIL;
                SubLObject all_ans_cycls = NIL;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject time_var_32 = get_internal_real_time();
                    if (NIL == search_result_splits_known_concept(raw_ans_string, unquoted_search_string)) {
                        all_ans_cycls = cycl_terms_for_answer_string(unquoted_search_string, filler_string, kag, mode, show_resultsP, $gg_attempt_unknown_terms$.getDynamicValue(thread), raw_ans_string);
                    }
                    parsing_ms = divide(subtract(get_internal_real_time(), time_var_32), time_high.$internal_time_units_per_second$.getGlobalValue());
                    parsing_ms = truncate(multiply(parsing_ms, $int$1000), UNPROVIDED);
                }
                {
                    SubLObject cdolist_list_var = all_ans_cycls;
                    SubLObject ans_cycl = NIL;
                    for (ans_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans_cycl = cdolist_list_var.first()) {
                        if ((NIL != dictionary.dictionary_lookup(v_bindings, ans_cycl, UNPROVIDED)) || (NIL != subl_promotions.memberP(ans_cycl, ans_cycls, UNPROVIDED, UNPROVIDED))) {
                            if (NIL != show_resultsP) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt90$____________already_processed___A, ans_cycl);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }
                        } else {
                            ans_cycls = cons(ans_cycl, ans_cycls);
                        }
                    }
                }
                if (NIL != ans_cycls) {
                    {
                        SubLObject _prev_bind_0 = $obtaining_a_search_result_event$.currentBinding(thread);
                        try {
                            $obtaining_a_search_result_event$.bind(list(list($$URLReferentFn, cycl_uri), rank_of_result, master_cyc_host, master_cyc_port), thread);
                            {
                                SubLObject cdolist_list_var = ans_cycls;
                                SubLObject ans_cycl = NIL;
                                for (ans_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans_cycl = cdolist_list_var.first()) {
                                    {
                                        SubLObject completed_gaf = el_utilities.replace_formula_arg(var_pos, ans_cycl, partial_gaf);
                                        SubLObject this_complete_gaf_metrics = maybe_add_completed_gaf(completed_gaf, domain_mt, show_resultsP, v_bindings, ans_cycl, filler_string, filler_strings, master_cyc_host, master_cyc_port, unquoted_search_string, partial_gaf);
                                        complete_gaf_metrics = cons(this_complete_gaf_metrics, complete_gaf_metrics);
                                    }
                                }
                            }
                        } finally {
                            $obtaining_a_search_result_event$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                total_milliseconds = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                total_milliseconds = truncate(multiply(total_milliseconds, $int$1000), UNPROVIDED);
                {
                    SubLObject metrics = list(total_milliseconds, complete_gaf_metrics, filler_string, parsing_ms);
                    return metrics;
                }
            }
        }
    }

    public static final SubLObject search_result_splits_known_concept(SubLObject raw_ans_string, SubLObject unquoted_search_string) {
        {
            SubLObject mode = mode_to_parse_answer(unquoted_search_string);
            if (mode == $BETWEEN) {
                return NIL;
            }
            {
                SubLObject tokenized_search_string = tokenize_fact_gathering_string(unquoted_search_string);
                SubLObject tokenized_answer_string = tokenize_fact_gathering_string(raw_ans_string);
                SubLObject pcase_var = mode;
                if (pcase_var.eql($FORWARD)) {
                    if ((NIL != list_utilities.lengthE(tokenized_search_string, TWO_INTEGER, UNPROVIDED)) && (NIL != member(tokenized_search_string.first(), tokenized_answer_string, EQUALP, UNPROVIDED))) {
                        return NIL;
                    }
                    {
                        SubLObject locations = list_utilities.all_positions(tokenized_search_string.first(), tokenized_answer_string, EQUALP, UNPROVIDED, UNPROVIDED);
                        SubLObject next_search_word = second(tokenized_search_string);
                        SubLObject cdolist_list_var = locations;
                        SubLObject location = NIL;
                        for (location = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , location = cdolist_list_var.first()) {
                            {
                                SubLObject next_answer_word = nth(number_utilities.f_1X(location), tokenized_answer_string);
                                if (next_search_word.equalp(next_answer_word)) {
                                    return NIL;
                                }
                            }
                        }
                    }
                    return T;
                } else
                    if (pcase_var.eql($BACKWARD)) {
                        if ((NIL != list_utilities.lengthE(tokenized_search_string, TWO_INTEGER, UNPROVIDED)) && (NIL != member(second(tokenized_search_string), tokenized_answer_string, EQUALP, UNPROVIDED))) {
                            return NIL;
                        }
                        {
                            SubLObject locations = list_utilities.all_positions(last(tokenized_search_string, UNPROVIDED).first(), tokenized_answer_string, EQUALP, UNPROVIDED, UNPROVIDED);
                            SubLObject previous_search_word = list_utilities.safe_nth(subtract(length(tokenized_search_string), TWO_INTEGER), tokenized_search_string);
                            SubLObject cdolist_list_var = locations;
                            SubLObject location = NIL;
                            for (location = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , location = cdolist_list_var.first()) {
                                {
                                    SubLObject previous_answer_word = list_utilities.safe_nth(subtract(location, ONE_INTEGER), tokenized_answer_string);
                                    if (previous_search_word.equalp(previous_answer_word)) {
                                        return NIL;
                                    }
                                }
                            }
                        }
                        return T;
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject tokenize_fact_gathering_string(SubLObject string) {
        {
            SubLObject sentence = methods.funcall_instance_method_with_1_args(get_fact_gathering_lexicon(), LEXIFY_SENTENCE, document.new_sentence(string, UNPROVIDED));
            SubLObject words = NIL;
            SubLObject vector_var = document.sentence_yield(sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    if (document.word_string(word).equalp($str_alt96$_s)) {
                        rplaca(words, cconcatenate(words.first(), document.word_string(word)));
                    } else {
                        words = cons(document.word_string(word), words);
                    }
                }
            }
            return nreverse(words);
        }
    }

    /**
     *
     *
     * @return GG-ONE-COMPLETE-GAF-METRICS-P
     */
    public static final SubLObject maybe_add_completed_gaf(SubLObject completed_gaf, SubLObject domain_mt, SubLObject show_resultsP, SubLObject v_bindings, SubLObject ans_cycl, SubLObject filler_string, SubLObject filler_strings, SubLObject master_cyc_host, SubLObject master_cyc_port, SubLObject unquoted_search_string, SubLObject partial_gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject confirmation_id = ZERO_INTEGER;
                SubLObject total_milliseconds = NIL;
                SubLObject status = NIL;
                SubLObject checking_known_ms = ZERO_INTEGER;
                SubLObject checking_rejected_ms = ZERO_INTEGER;
                SubLObject checking_refuted_ms = ZERO_INTEGER;
                SubLObject web_verifying_ms = ZERO_INTEGER;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject time_var_33 = get_internal_real_time();
                    if (NIL != rkf_query_utilities.rkf_known(completed_gaf, domain_mt, UNPROVIDED)) {
                        status = $KNOWN;
                        if (NIL != show_resultsP) {
                            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt98$____________known___A__, completed_gaf);
                            force_output($gg_status_message_stream$.getDynamicValue(thread));
                        }
                        if (NIL != $gg_within_an_experimentP$.getGlobalValue()) {
                            gg_assert_evinces_known_gaf(filler_string, ans_cycl, completed_gaf, master_cyc_host, master_cyc_port);
                        }
                    }
                    checking_known_ms = divide(subtract(get_internal_real_time(), time_var_33), time_high.$internal_time_units_per_second$.getGlobalValue());
                    checking_known_ms = truncate(multiply(checking_known_ms, $int$1000), UNPROVIDED);
                }
                if (NIL == status) {
                    {
                        SubLObject time_var_34 = get_internal_real_time();
                        if (NIL != rkf_contradiction_finder.rkf_rejected(completed_gaf, domain_mt, UNPROVIDED, UNPROVIDED)) {
                            status = $REJECTED;
                            if (NIL != show_resultsP) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt100$____________rejected___A__, completed_gaf);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }
                            if (NIL != $gg_within_an_experimentP$.getGlobalValue()) {
                                gg_assert_evinces_refutable_gaf(filler_string, ans_cycl, completed_gaf, master_cyc_host, master_cyc_port);
                            }
                        }
                        checking_rejected_ms = divide(subtract(get_internal_real_time(), time_var_34), time_high.$internal_time_units_per_second$.getGlobalValue());
                        checking_rejected_ms = truncate(multiply(checking_rejected_ms, $int$1000), UNPROVIDED);
                    }
                }
                if (NIL == status) {
                    {
                        SubLObject time_var_35 = get_internal_real_time();
                        if (NIL != gg_refuted_gaf(completed_gaf, domain_mt)) {
                            status = $REFUTED;
                            if (NIL != show_resultsP) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt102$____________refuted___A__, completed_gaf);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }
                            if (NIL != $gg_within_an_experimentP$.getGlobalValue()) {
                                gg_assert_evinces_refutable_gaf(filler_string, ans_cycl, completed_gaf, master_cyc_host, master_cyc_port);
                            }
                        }
                        checking_refuted_ms = divide(subtract(get_internal_real_time(), time_var_35), time_high.$internal_time_units_per_second$.getGlobalValue());
                        checking_refuted_ms = truncate(multiply(checking_refuted_ms, $int$1000), UNPROVIDED);
                    }
                }
                if (NIL == status) {
                    {
                        SubLObject time_var_36 = get_internal_real_time();
                        {
                            SubLObject metrics = gethash(completed_gaf, $gg_tried_to_verify_gafs_table$.getGlobalValue(), UNPROVIDED);
                            if (NIL == metrics) {
                                metrics = ((NIL == $gg_coordinated_phrase_verificationP$.getGlobalValue()) || (NIL != list_utilities.singletonP(filler_strings))) ? ((SubLObject) (verify_gaf_via_web_fast(completed_gaf, unquoted_search_string, UNPROVIDED, UNPROVIDED))) : verify_gaf_with_coordinated_phrase(partial_gaf, ans_cycl, unquoted_search_string, UNPROVIDED, UNPROVIDED);
                                sethash(completed_gaf, $gg_tried_to_verify_gafs_table$.getGlobalValue(), metrics);
                            }
                            confirmation_id = gaf_gathering_metrics.gg_gaf_verification_metrics_id(metrics);
                            status = gaf_gathering_metrics.gg_gaf_verification_metrics_status(metrics);
                            gaf_gathering_metrics.maybe_record_gg_verification_metrics(metrics);
                        }
                        if (NIL != gaf_gathering_metrics.gg_complete_gaf_verified_status_p(status)) {
                            if (NIL != show_resultsP) {
                                {
                                    SubLObject nbr_of_supports = second(status);
                                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt103$____________verified___A__with__A, completed_gaf, nbr_of_supports);
                                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                                }
                            }
                            gg_assert_evinces_verified_gaf(filler_string, ans_cycl, completed_gaf, master_cyc_host, master_cyc_port);
                        } else {
                            if (NIL != show_resultsP) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt104$____________unverified___A__, completed_gaf);
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            }
                            gg_assert_evinces_unverified_gaf(filler_string, ans_cycl, completed_gaf, master_cyc_host, master_cyc_port);
                        }
                        web_verifying_ms = divide(subtract(get_internal_real_time(), time_var_36), time_high.$internal_time_units_per_second$.getGlobalValue());
                        web_verifying_ms = truncate(multiply(web_verifying_ms, $int$1000), UNPROVIDED);
                    }
                }
                dictionary_utilities.dictionary_push(v_bindings, ans_cycl, status);
                total_milliseconds = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                total_milliseconds = truncate(multiply(total_milliseconds, $int$1000), UNPROVIDED);
                {
                    SubLObject metrics = list(new SubLObject[]{ total_milliseconds, status, confirmation_id, cycl_utilities.hl_to_el(ans_cycl), cycl_utilities.hl_to_el(completed_gaf), checking_known_ms, checking_rejected_ms, checking_refuted_ms, web_verifying_ms });
                    return metrics;
                }
            }
        }
    }

    public static final SubLObject new_gg_confirmation_id(SubLObject confirmedP) {
        {
            SubLObject isg = get_gg_isg(confirmedP);
            return integer_sequence_generator.integer_sequence_generator_next(isg);
        }
    }





    public static final SubLObject get_gg_isg(SubLObject confirmedP) {
        return NIL != confirmedP ? ((SubLObject) ($gg_confirmed_isg$.getGlobalValue())) : $gg_unconfirmed_isg$.getGlobalValue();
    }

    /**
     * the number of words in the answer string beyond which constitutent parsing is used as a phrase filter.
     */
    // defconstant
    private static final SubLSymbol $gg_constituent_parsing_min_words$ = makeSymbol("*GG-CONSTITUENT-PARSING-MIN-WORDS*");

    /**
     * the maximum number of words considered for parsing
     */
    // defconstant
    private static final SubLSymbol $gg_max_words_in_phrase_for_parsing$ = makeSymbol("*GG-MAX-WORDS-IN-PHRASE-FOR-PARSING*");

    /**
     * the number of seconds before parsing times itself out
     */
    // defconstant
    private static final SubLSymbol $gg_parsing_timeout$ = makeSymbol("*GG-PARSING-TIMEOUT*");

    /**
     * the list of words appearing at either the start or end of a muliword phrase that doom its parse into a concept
     */
    // defconstant
    private static final SubLSymbol $gg_doomed_phrase_start_or_end_words$ = makeSymbol("*GG-DOOMED-PHRASE-START-OR-END-WORDS*");

    /**
     * Returns a list of CycL terms that correspond to ANS-STRING. For answer strings with more than 3 words, this function efficiently filters according to constitutent phrases.
     *
     * @param SEARCH-STRING
     * 		stringp; e.g. "Yasser Arafat was born on *"
     * @param ANS-STRING
     * 		stringp; e.g. "August 24, 1929"
     * @param PARTIAL-GAF;
     * 		e.g. (#$birthDate #$YassirArafat ?X)
     * @param MODE
     * 		keywordp; either :forward or :backward or :between
     * @param SHOW-RESULTS?
     * 		booleanp; indicates verbosity
     * @param CREATE-UNKNOWN-INSTANCES
     * 		booleanp; indicates whether to create unknown instances
     * @return ANS-CYCLS listp
     */
    public static final SubLObject cycl_terms_for_answer_string(SubLObject search_string, SubLObject ans_string, SubLObject kag, SubLObject mode, SubLObject show_resultsP, SubLObject create_unknown_instances, SubLObject raw_ans_string) {
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = NIL;
        }
        if (create_unknown_instances == UNPROVIDED) {
            create_unknown_instances = NIL;
        }
        if (raw_ans_string == UNPROVIDED) {
            raw_ans_string = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject partial_gaf = kag_focus(kag);
                SubLObject domain_mt = $gg_domain_mt$.getGlobalValue();
                SubLObject ans = string_utilities.$empty_string$.getGlobalValue();
                SubLObject counter = ZERO_INTEGER;
                SubLObject ans_sent = string_utilities.string_substitute(ans_string, $str_alt109$_, search_string, UNPROVIDED);
                SubLObject constituents = (string_utilities.number_of_words(ans_string).numG($gg_constituent_parsing_min_words$.getGlobalValue())) ? ((SubLObject) (constituents_of_answer_text(ans_sent))) : NIL;
                SubLObject var_pos = variable_position_in_gaf(partial_gaf);
                SubLObject constraining_collection = (NIL != kag_constraining_col(kag)) ? ((SubLObject) (kag_constraining_col(kag))) : constraining_collection_for_variable(partial_gaf, var_pos);
                SubLObject ans_cycls = NIL;
                SubLObject partial_ans_cycls = NIL;
                SubLObject doneP = string_utilities.substringP($str_alt110$_, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject words = (NIL != doneP) ? ((SubLObject) (NIL)) : gg_words_for_ans_string(ans_string, mode);
                SubLObject parsing_timed_outP = NIL;
                if (NIL == doneP) {
                    doneP = subl_promotions.memberP(words.first(), $gg_doomed_phrase_start_or_end_words$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
                }
                if (NIL == doneP) {
                    if (NIL != file_utilities.stream_designator_p($gg_filestream_for_ner_output$.getDynamicValue(thread))) {
                        {
                            SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                            try {
                                $print_pretty$.bind(NIL, thread);
                                format($gg_filestream_for_ner_output$.getDynamicValue(thread), $str_alt111$_____S___S___S___S___S, new SubLObject[]{ raw_ans_string, ans_sent, ans_string, partial_gaf, constraining_collection });
                            } finally {
                                $print_pretty$.rebind(_prev_bind_0, thread);
                            }
                        }
                        force_output($gg_filestream_for_ner_output$.getDynamicValue(thread));
                    }
                    if (NIL != show_resultsP) {
                        write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        format($gg_status_message_stream$.getDynamicValue(thread), $str_alt112$________A___, ans_string);
                        force_output($gg_status_message_stream$.getDynamicValue(thread));
                    }
                }
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = words;
                        SubLObject word = NIL;
                        for (word = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
                            {
                                SubLObject create_unknown_instances_for_this_string = NIL;
                                if (!word.equalp(string_utilities.$empty_string$.getGlobalValue())) {
                                    {
                                        SubLObject pcase_var = mode;
                                        if (pcase_var.eql($FORWARD)) {
                                            ans = string_utilities.trim_whitespace(cconcatenate(format_nil.format_nil_a_no_copy(ans), new SubLObject[]{ $str_alt43$_, format_nil.format_nil_a_no_copy(word) }));
                                        } else
                                            if (pcase_var.eql($BETWEEN)) {
                                                ans = string_utilities.trim_whitespace(cconcatenate(format_nil.format_nil_a_no_copy(ans), new SubLObject[]{ $str_alt43$_, format_nil.format_nil_a_no_copy(word) }));
                                            } else
                                                if (pcase_var.eql($BACKWARD)) {
                                                    ans = string_utilities.trim_whitespace(cconcatenate(format_nil.format_nil_a_no_copy(word), new SubLObject[]{ $str_alt43$_, format_nil.format_nil_a_no_copy(ans) }));
                                                }


                                    }
                                    if (!(word.equalp(string_utilities.$empty_string$.getGlobalValue()) || (NIL != subl_promotions.memberP(Strings.string_downcase(word, UNPROVIDED, UNPROVIDED), $gg_doomed_phrase_start_or_end_words$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)))) {
                                        if ((NIL != list_utilities.lengthG(word, ONE_INTEGER, UNPROVIDED)) && (NIL != string_utilities.ends_with_punctuation_p(word))) {
                                            ans = string_utilities.strip_final(ans, UNPROVIDED);
                                        }
                                        if ((NIL != create_unknown_instances) && (((NIL == disjoint_with.disjoint_withP(constraining_collection, $$Person, $$InferencePSC, UNPROVIDED)) && (named_entity_recognizer.named_entityP(raw_ans_string, ans) == $$Person)) || ((NIL == disjoint_with.disjoint_withP(constraining_collection, $$GeopoliticalEntity, $$InferencePSC, UNPROVIDED)) && (named_entity_recognizer.named_entityP(raw_ans_string, ans) == $$Place)))) {
                                            create_unknown_instances_for_this_string = T;
                                        }
                                        {
                                            SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                            try {
                                                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time($gg_parsing_timeout$.getGlobalValue()), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                    {
                                                        SubLObject pcase_var = constraining_collection;
                                                        if (pcase_var.eql($$Date)) {
                                                            {
                                                                SubLObject _prev_bind_0_37 = date_utilities.$parse_to_two_digit_years_in_datesP$.currentBinding(thread);
                                                                try {
                                                                    date_utilities.$parse_to_two_digit_years_in_datesP$.bind(NIL, thread);
                                                                    {
                                                                        SubLObject date_cycl = (string_utilities.number_of_words(ans).numL(FIVE_INTEGER)) ? ((SubLObject) (date_utilities.parse_date_from_string(ans))) : NIL;
                                                                        if (NIL != date_cycl) {
                                                                            ans_cycls = date_cycl;
                                                                            counter = add(counter, ONE_INTEGER);
                                                                        }
                                                                        if (counter.numE(TWO_INTEGER)) {
                                                                            doneP = T;
                                                                        }
                                                                    }
                                                                } finally {
                                                                    date_utilities.$parse_to_two_digit_years_in_datesP$.rebind(_prev_bind_0_37, thread);
                                                                }
                                                            }
                                                        } else
                                                            if (pcase_var.eql($$ProperNameString)) {
                                                                ans = string_utilities.remove_substring(ans, $str_alt118$_);
                                                                if (((NIL == constituents) || (NIL != subl_promotions.memberP(ans, constituents, symbol_function(EQUAL), UNPROVIDED))) && (NIL != named_entity_recognizer.named_entityP(ans_string, ans))) {
                                                                    ans_cycls = list(gg_get_constrained_cycl_for_string(ans, constraining_collection, domain_mt, create_unknown_instances_for_this_string, partial_gaf, var_pos).first());
                                                                }
                                                            } else {
                                                                if ((string_utilities.number_of_words(ans).numL($gg_constituent_parsing_min_words$.getGlobalValue()) || (NIL == constituents)) || (NIL != subl_promotions.memberP(ans, constituents, symbol_function(EQUAL), UNPROVIDED))) {
                                                                    partial_ans_cycls = gg_find_cycl(ans, constraining_collection, domain_mt, partial_gaf, var_pos, show_resultsP, create_unknown_instances_for_this_string);
                                                                    if (NIL == partial_ans_cycls) {
                                                                        {
                                                                            SubLObject type = named_entity_recognizer.named_entityP(ans_sent, ans);
                                                                            if ((NIL != type) && (NIL == disjoint_with.disjoint_withP(constraining_collection, type, UNPROVIDED, UNPROVIDED))) {
                                                                                partial_ans_cycls = gg_get_constrained_cycl_for_string(ans, constraining_collection, domain_mt, create_unknown_instances_for_this_string, partial_gaf, var_pos);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (NIL != partial_ans_cycls) {
                                                                        ans_cycls = partial_ans_cycls;
                                                                    } else {
                                                                        if (NIL != ans_cycls) {
                                                                            doneP = T;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                    }
                                                }
                                                parsing_timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                            } finally {
                                                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                                                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        if (NIL != parsing_timed_outP) {
                                            Errors.warn($str_alt119$Timed_out_after__A_trying_to_pars, numeric_date_utilities.readable_elapsed_time_string($gg_parsing_timeout$.getGlobalValue(), UNPROVIDED), ans);
                                        }
                                        if (string_utilities.number_of_words(ans).numGE($gg_max_words_in_phrase_for_parsing$.getGlobalValue())) {
                                            doneP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if ((NIL != show_resultsP) && (NIL != ans_cycls)) {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt120$___________A__, ans_cycls);
                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                }
                ans_cycls = delete_duplicates(ans_cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != file_utilities.stream_designator_p($gg_filestream_for_ner_output$.getDynamicValue(thread))) {
                    {
                        SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                        try {
                            $print_pretty$.bind(NIL, thread);
                            format($gg_filestream_for_ner_output$.getDynamicValue(thread), $str_alt121$___S___S, ans, ans_cycls);
                        } finally {
                            $print_pretty$.rebind(_prev_bind_0, thread);
                        }
                    }
                    force_output($gg_filestream_for_ner_output$.getDynamicValue(thread));
                }
                return ans_cycls;
            }
        }
    }

    public static final SubLObject gg_words_for_ans_string(SubLObject ans_string, SubLObject mode) {
        {
            SubLObject pcase_var = mode;
            if (pcase_var.eql($BETWEEN)) {
                return list(ans_string);
            } else
                if (pcase_var.eql($FORWARD)) {
                    return tokenize_fact_gathering_string(ans_string);
                } else
                    if (pcase_var.eql($BACKWARD)) {
                        return nreverse(tokenize_fact_gathering_string(ans_string));
                    } else {
                        Errors.error($str_alt122$_S_is_not_a_known_ans_string_mode, mode);
                    }


        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $fact_gathering_lexicon$ = makeSymbol("*FACT-GATHERING-LEXICON*");

    public static final SubLObject get_fact_gathering_lexicon() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == term_lexicon.term_lexicon_p($fact_gathering_lexicon$.getDynamicValue(thread))) {
                $fact_gathering_lexicon$.setDynamicValue(term_lexicon.new_term_lexicon(), thread);
                methods.funcall_instance_method_with_1_args($fact_gathering_lexicon$.getDynamicValue(thread), SET_CASE_SENSITIVITY, $OFF);
            }
            return $fact_gathering_lexicon$.getDynamicValue(thread);
        }
    }

    /**
     * It returns CycL bindings that make the completed GAF a WFF.  Thus, it extends
     * GET-CONSTRAINED-CYCL-FOR-STRING.
     *
     * @param ANS
     * 		stringp
     * @param CONSTRAINING-COLLECTION
     * 		isa-collection?
     * @param DOMAIN-MT
     * 		isa-mt?
     * @param FORCE-CREATION-OF-UNKNOWN-INSTANCES
     * 		booleanp; should the system always include
     * 		an InstanceNamedFn-Ternary interpretation in the output?
     * @param PARTIAL-GAF
     * 		el-sentence-p
     * @param VAR-POS
     * 		integerp
     */
    public static final SubLObject gg_get_constrained_cycl_for_string(SubLObject ans, SubLObject constraining_collection, SubLObject domain_mt, SubLObject create_unknown_instancesP, SubLObject partial_gaf, SubLObject var_pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycls = NIL;
                SubLObject ans_cycls = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$npp_use_strings_for_semanticsP$.currentBinding(thread);
                    try {
                        parsing_vars.$npp_use_strings_for_semanticsP$.bind(create_unknown_instancesP, thread);
                        cycls = api_widgets.get_constrained_cycl_for_string_single_answer(ans, constraining_collection, domain_mt, $$EnglishParaphraseMt, $$EnglishMt, create_unknown_instancesP, NIL, T, $NONE, $list_alt127, partial_gaf, list(var_pos), $list_alt128, UNPROVIDED);
                    } finally {
                        parsing_vars.$npp_use_strings_for_semanticsP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = cycls;
                    SubLObject cycl = NIL;
                    for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                        {
                            SubLObject relevant_cycl = second(cycl);
                            SubLObject completed_gaf = NIL;
                            if (((NIL != genls.genlsP(constraining_collection, $$Person, $$EverythingPSC, UNPROVIDED)) || (NIL != isa.isaP(relevant_cycl, $$Person, $$EverythingPSC, UNPROVIDED))) && (NIL != gg_is_person_without_last_nameP(ans, relevant_cycl))) {
                            } else
                                if (NIL != isa.quoted_isaP(relevant_cycl, $$IndexicalConcept, UNPROVIDED, UNPROVIDED)) {
                                } else {
                                    completed_gaf = el_utilities.replace_formula_arg(var_pos, relevant_cycl, partial_gaf);
                                    if (NIL == list_utilities.sublisp_boolean(wff.why_not_wff_assert(completed_gaf, domain_mt, UNPROVIDED))) {
                                        {
                                            SubLObject item_var = relevant_cycl;
                                            if (NIL == member(item_var, ans_cycls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                ans_cycls = cons(item_var, ans_cycls);
                                            }
                                        }
                                    }
                                }

                        }
                    }
                }
                return ans_cycls;
            }
        }
    }

    /**
     * Returns the argument position of the variable in the input gaf.
     *
     * @param GAF
     * 		el-sentence-p; e.g. (#$birthDate #$YassirArafat ?DATE)
     * @return var-pos integerp; e.g. 2
     */
    public static final SubLObject variable_position_in_gaf(SubLObject gaf) {
        {
            SubLObject var_pos = ONE_INTEGER;
            SubLObject cdolist_list_var = cycl_utilities.formula_args(gaf, UNPROVIDED);
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != cycl_grammar.el_variable_p(arg)) {
                    return var_pos;
                } else {
                    var_pos = add(var_pos, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    /**
     * Returns :backward if the web search is to return a phrase at the end of the search string, returns :forward
     * if the web search is to return a phrase at the beginning of the search string, otherwise returns :between
     * which indicates that the web search is to return a phrase within the search string.
     *
     * @param SEARCH-STRING
     * 		stringp
     */
    public static final SubLObject mode_to_parse_answer(SubLObject search_string) {
        if (NIL != member(Strings.sublisp_char(search_string, subtract(length(search_string), ONE_INTEGER)), $list_alt131, UNPROVIDED, UNPROVIDED)) {
            return $FORWARD;
        } else
            if (NIL != member(Strings.sublisp_char(search_string, ZERO_INTEGER), $list_alt131, UNPROVIDED, UNPROVIDED)) {
                return $BACKWARD;
            } else {
                return $BETWEEN;
            }

    }

    // defparameter
    private static final SubLSymbol $search_strings_requiring_strict_verification$ = makeSymbol("*SEARCH-STRINGS-REQUIRING-STRICT-VERIFICATION*");

    public static final SubLObject remove_initial_stop_words(SubLObject string) {
        {
            SubLObject first_token = rkf_concept_harvester.rkf_ch_string_tokenize(string).first();
            if (NIL != subl_promotions.memberP(first_token, google_stop_words_unofficial(), symbol_function(EQUAL), UNPROVIDED)) {
                string = string_utilities.trim_whitespace(string_utilities.strip_header(string, first_token));
            }
        }
        return string;
    }

    /**
     * Returns a list of strings that can be used to perform searches via Google.
     *
     * @param SENTENCE
     * 		el-sentence-p; e.g. (#$birthDate #$YassirArafat ?DATE)
     * @return SEARCH-STRINGS listp; e.g. ("Yasir Arafat was born on" "Yasser
    Arafat was born on" ...)
     */
    public static final SubLObject search_strings(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = gaf_gathering_paraphrase_mt();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject valid_search_strings = NIL;
                SubLObject invalid_search_strings = NIL;
                SubLObject milliseconds = NIL;
                SubLObject time_var = get_internal_real_time();
                thread.resetMultipleValues();
                {
                    SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                    try {
                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                        {
                            SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject _prev_bind_0_38 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                        {
                                            SubLObject new_or_reused = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_39 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    {
                                                        SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                        {
                                                            SubLObject _prev_bind_0_40 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                                {
                                                                    SubLObject original_memoization_process = NIL;
                                                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                        {
                                                                            SubLObject current_proc = current_process();
                                                                            if (NIL == original_memoization_process) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                            } else {
                                                                                if (original_memoization_process != current_proc) {
                                                                                    Errors.error($str_alt133$Invalid_attempt_to_reuse_memoizat);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_41 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
                                                                            try {
                                                                                pph_vars.$select_string_methods_to_omit$.bind($list_alt134, thread);
                                                                                pph_vars.$pph_introduce_anaphorsP$.bind(NIL, thread);
                                                                                {
                                                                                    SubLObject cdolist_list_var = pph_methods_lexicon.all_phrases_for_formula(sentence, mt, UNPROVIDED, UNPROVIDED);
                                                                                    SubLObject search_string = NIL;
                                                                                    for (search_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string = cdolist_list_var.first()) {
                                                                                        search_string = remove_initial_stop_words(string_utilities.string_subst($str_alt135$, $str_alt136$_, search_string, UNPROVIDED));
                                                                                        if (string_utilities.number_of_words(search_string).numL(TEN_INTEGER)) {
                                                                                            {
                                                                                                SubLObject item_var = search_string;
                                                                                                if (NIL == member(item_var, valid_search_strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                    valid_search_strings = cons(item_var, valid_search_strings);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            {
                                                                                                SubLObject item_var = search_string;
                                                                                                if (NIL == member(item_var, invalid_search_strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                    invalid_search_strings = cons(item_var, invalid_search_strings);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_1, thread);
                                                                                pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0_41, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_40, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_39, thread);
                                                }
                                            }
                                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_38, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL == reuseP) {
                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                    }
                }
                milliseconds = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                milliseconds = truncate(multiply(milliseconds, $int$1000), UNPROVIDED);
                return values(valid_search_strings, invalid_search_strings, milliseconds);
            }
        }
    }

    public static final SubLObject massage_search_string(SubLObject search_string) {
        return string_utilities.quote_string(string_utilities.replace_substring(search_string, $str_alt138$______, $str_alt109$_), UNPROVIDED);
    }

    /**
     * the number of retries when a Google server error occurs
     */
    // defconstant
    private static final SubLSymbol $server_retry_limit$ = makeSymbol("*SERVER-RETRY-LIMIT*");

    /**
     * Returns a list of lists, each containing the web page text, offset, host-computer,
     * pathname, url, rank and num-hits.
     *
     * @param SEARCH-STRING
     * 		stringp; e.g. "Yasser Arafat was born on "
     * @return RESULTS listp; e.g. (("... Yasser Arafat was born on ..." 4
    #$Friday-Cyc-Com "/cyc/top/data/somfile.htm"
    (#$URLFn "http://www.israeluniverse.com/"))
    ...)
     */
    public static final SubLObject search_engine_results(SubLObject search_string, SubLObject start, SubLObject hits) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject google_passages = NIL;
                SubLObject server_retry_count = ZERO_INTEGER;
                SubLObject server_doneP = NIL;
                SubLObject results = NIL;
                while (NIL == server_doneP) {
                    google_passages = search_engine.google_search(search_string, start, hits);
                    if (NIL != search_engine.google_error_tokenP(google_passages)) {
                        server_retry_count = add(server_retry_count, ONE_INTEGER);
                        if (server_retry_count.numG($server_retry_limit$.getGlobalValue())) {
                            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt139$____Google_error__S__no_retry____, google_passages);
                            force_output($gg_status_message_stream$.getDynamicValue(thread));
                            sublisp_throw($GOOGLE_PROBLEM, google_passages);
                        } else {
                            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt140$____Google_error__S___will_retry_, google_passages);
                            force_output($gg_status_message_stream$.getDynamicValue(thread));
                        }
                    } else {
                        server_doneP = T;
                    }
                } 
                {
                    SubLObject cdolist_list_var = google_passages;
                    SubLObject google_passage = NIL;
                    for (google_passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , google_passage = cdolist_list_var.first()) {
                        {
                            SubLObject text = search_engine.google_passage_get_full_text_method(google_passage);
                            SubLObject url = search_engine.google_passage_get_url_method(google_passage);
                            SubLObject offset = search_engine.google_passage_get_offset_in_full_text_method(google_passage);
                            SubLObject host_computer = NIL;
                            SubLObject pathname = NIL;
                            SubLObject rank = search_engine.google_passage_get_rank_method(google_passage);
                            SubLObject num_hits = search_engine.google_passage_get_total_for_rank_method(google_passage);
                            if (NIL != string_utilities.substringP(string_utilities.trim_whitespace(string_utilities.remove_substring(string_utilities.unquote_string(search_string), $str_alt109$_)), text, EQUALP, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject item_var = list(text, offset, host_computer, pathname, list($$URLFn, url), rank, num_hits);
                                    if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        results = cons(item_var, results);
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(results);
            }
        }
    }

    public static final SubLObject parse_search_engine_result_set(SubLObject search_engine_result) {
        SubLTrampolineFile.checkType(search_engine_result, CONSP);
        {
            SubLObject ans_string = search_engine_result.first();
            SubLObject offset = second(search_engine_result);
            SubLObject uri = fifth(search_engine_result);
            SubLObject rank = sixth(search_engine_result);
            return values(ans_string, offset, NIL, uri, rank);
        }
    }

    public static final SubLObject is_valid_raw_answer_stringP(SubLObject raw_ans_string) {
        return find_if(symbol_function(ALPHANUMERICP), raw_ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * the list of determiners that should be stripped from constituents to provide further constitutents
     */
    // defconstant
    private static final SubLSymbol $gg_determiners_to_strip_from_constitutent$ = makeSymbol("*GG-DETERMINERS-TO-STRIP-FROM-CONSTITUTENT*");

    /**
     * Returns a list of strings which are the parsed constituents of the sentence
     * ANS-SENT.
     *
     * @param ANS-SENT
     * 		stringp; e.g. "Yasser Arafat was born on August 24, 1929"
     * @return CONSTITUENTS listp; e.g. ("Yasser" "Arafat" "Yasser Arafat"
    "was" "born" "on" "August" "24"
    "," "1929" ...)
     */
    public static final SubLObject constituents_of_answer_text(SubLObject ans_sent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(ans_sent, STRINGP);
            {
                SubLObject cp = parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
                SubLObject constituents = NIL;
                SubLObject stack = stacks.create_stack();
                SubLObject order_var = $DFR2L;
                SubLObject possible_orders = list($DFL2R, $DFR2L);
                SubLObject sub_tree = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED)) {
                        Errors.error($str_alt146$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                }
                stacks.stack_push(methods.funcall_instance_method_with_1_args(cp, PARSE, ans_sent), stack);
                while (NIL == stacks.stack_empty_p(stack)) {
                    sub_tree = stacks.stack_pop(stack);
                    if (NIL != sub_tree) {
                        {
                            SubLObject constituent = methods.funcall_instance_method_with_0_args(sub_tree, GET_STRING);
                            constituent = string_utilities.post_remove(constituent, $str_alt149$_, UNPROVIDED);
                            if (NIL == subl_promotions.memberP(constituent, $list_alt150, symbol_function(EQUAL), UNPROVIDED)) {
                                {
                                    SubLObject cdolist_list_var = $gg_determiners_to_strip_from_constitutent$.getGlobalValue();
                                    SubLObject determiner_to_strip_from_constitutent = NIL;
                                    for (determiner_to_strip_from_constitutent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , determiner_to_strip_from_constitutent = cdolist_list_var.first()) {
                                        if (NIL != string_utilities.starts_with(constituent, determiner_to_strip_from_constitutent)) {
                                            {
                                                SubLObject item_var = string_utilities.pre_remove(constituent, determiner_to_strip_from_constitutent, UNPROVIDED);
                                                if (NIL == member(item_var, constituents, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    constituents = cons(item_var, constituents);
                                                }
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject item_var = constituent;
                                    if (NIL == member(item_var, constituents, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        constituents = cons(item_var, constituents);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != parse_tree.phrase_tree_p(sub_tree)) {
                        {
                            SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub_tree);
                            SubLObject backwardP_var = eq(order_var, $DFL2R);
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject daughter = aref(vector_var, element_num);
                                    stacks.stack_push(daughter, stack);
                                }
                            }
                        }
                    }
                } 
                return constituents;
            }
        }
    }

    public static final SubLObject constraining_collection_for_variable(SubLObject partial_gaf, SubLObject var_pos) {
        {
            SubLObject predicate = cycl_utilities.formula_arg0(partial_gaf);
            return ask_utilities.query_variable($sym70$_X, listS($$argIsa, predicate, var_pos, $list_alt152), UNPROVIDED, UNPROVIDED).first();
        }
    }



    public static final SubLObject clear_given_name_preds() {
        {
            SubLObject cs = $given_name_preds_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_given_name_preds() {
        return memoization_state.caching_state_remove_function_results_with_args($given_name_preds_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject given_name_preds_internal() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = genl_predicates.all_spec_predicates($$givenNames, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject given_name_preds() {
        {
            SubLObject caching_state = $given_name_preds_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GIVEN_NAME_PREDS, $given_name_preds_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw157$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(given_name_preds_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject given_nameP(SubLObject string) {
        {
            SubLObject namestring_preds_of_string = lexicon_utilities.namestring_preds_of_string(string, UNPROVIDED, UNPROVIDED);
            return makeBoolean((NIL != namestring_preds_of_string) && (NIL != keyhash_utilities.fast_intersectP(given_name_preds(), namestring_preds_of_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static final SubLObject gg_finalize_geographical_skses_registration() {
        $gg_geographical_skses_registered$.setGlobalValue(NIL);
        return DONE;
    }

    public static final SubLObject gg_ensure_geographical_skses_registered() {
        if (NIL == $gg_geographical_skses_registered$.getGlobalValue()) {
            sksi_sks_manager.register_sksi_removal_modules_for_skses($list_alt159);
            $gg_geographical_skses_registered$.setGlobalValue(T);
        }
        return T;
    }



    public static final SubLObject clear_gg_verification_for_place_naut() {
        {
            SubLObject cs = $gg_verification_for_place_naut_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_gg_verification_for_place_naut(SubLObject naut) {
        return memoization_state.caching_state_remove_function_results_with_args($gg_verification_for_place_naut_caching_state$.getGlobalValue(), list(naut), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gg_verification_for_place_naut_internal(SubLObject naut) {
        gg_ensure_geographical_skses_registered();
        if (!((NIL != sksi_infrastructure_utilities.sk_source_queryableP($$Usgs_Gnis_KS, UNPROVIDED)) && (NIL != sksi_infrastructure_utilities.sk_source_queryableP($$NGA_Gns_KS, UNPROVIDED)))) {
            Errors.warn($str_alt163$SK_sources__A_and_or__A_cannot_be, $$Usgs_Gnis_KS, $$NGA_Gns_KS);
            return NIL;
        }
        {
            SubLObject place_name = second(naut);
            SubLObject geographical_region = third(naut);
            SubLObject result = NIL;
            result = ask_utilities.query_boolean(list($$sksiSentence, list($$thereExists, $sym166$_PLACE, list($$and, list($$placeName_Standard, $sym166$_PLACE, place_name), listS($$geographicallySubsumes, geographical_region, $list_alt170)))), $list_alt171, $list_alt172);
            return result;
        }
    }

    public static final SubLObject gg_verification_for_place_naut(SubLObject naut) {
        {
            SubLObject caching_state = $gg_verification_for_place_naut_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GG_VERIFICATION_FOR_PLACE_NAUT, $gg_verification_for_place_naut_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, naut, $kw157$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw157$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(gg_verification_for_place_naut_internal(naut)));
                    memoization_state.caching_state_put(caching_state, naut, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     * Returns T IFF the given naut ANS-CYCL is an instance of the CONSTRAINING-COLLECTION.
     *
     * @param ANS-CYCL
     * 		naut-p;
     * @param CONSTRAINING-COLLECTION
     * 		isa-collection?;
     */
    public static final SubLObject gg_valid_nautP(SubLObject ans_cycl, SubLObject constraining_collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$TermLearner_ExperimentalMt;
        }
        if (NIL != isa.isaP(czer_main.canonicalize_term(ans_cycl, UNPROVIDED), constraining_collection, mt, UNPROVIDED)) {
            return T;
        }
        {
            SubLObject verification_function = second(ask_utilities.query_variable($sym70$_X, listS($const175$subLFunctionForNAUTVerification_G, constraining_collection, $list_alt152), mt, UNPROVIDED).first());
            SubLObject result = (NIL != verification_function) ? ((SubLObject) (funcall(verification_function, ans_cycl))) : NIL;
            return result;
        }
    }

    /**
     * Returns T IFF ANS is a person's name for the CYCL person that does not include the last name.
     */
    public static final SubLObject gg_is_person_without_last_nameP(SubLObject ans, SubLObject cycl) {
        {
            SubLObject generated_name = pph_main.generate_phrase(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject last_name_word = list_utilities.last_one(string_utilities.split_string(ans, UNPROVIDED));
            return makeBoolean(NIL == string_utilities.ends_with(generated_name, last_name_word, UNPROVIDED));
        }
    }

    /**
     * Tries to find CycL terms corresponding to the string ANS, that are
     * direct/indirect instances of CONSTRAINING-COLLECTION.
     */
    public static final SubLObject gg_find_cycl(SubLObject ans, SubLObject constraining_collection, SubLObject domain_mt, SubLObject partial_gaf, SubLObject var_pos, SubLObject show_resultsP, SubLObject create_unknown_instances) {
        {
            SubLObject ans_cycls = NIL;
            SubLObject cdolist_list_var = gg_get_constrained_cycl_for_string(ans, constraining_collection, domain_mt, create_unknown_instances, partial_gaf, var_pos);
            SubLObject ans_cycl = NIL;
            for (ans_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans_cycl = cdolist_list_var.first()) {
                if ((NIL != narts_high.naut_p(ans_cycl)) && (NIL == nart_handles.nart_p(czer_main.canonicalize_term(ans_cycl, UNPROVIDED)))) {
                    if (NIL != gg_valid_nautP(ans_cycl, constraining_collection, UNPROVIDED)) {
                        {
                            SubLObject item_var = ans_cycl;
                            if (NIL == member(item_var, ans_cycls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                ans_cycls = cons(item_var, ans_cycls);
                            }
                        }
                    } else {
                        if (NIL != show_resultsP) {
                            Errors.warn($str_alt176$Invalid_NAUT___S_as_a__A__, ans_cycl, constraining_collection);
                        }
                    }
                } else {
                    {
                        SubLObject item_var = ans_cycl;
                        if (NIL == member(item_var, ans_cycls, symbol_function(EQL), symbol_function(IDENTITY))) {
                            ans_cycls = cons(item_var, ans_cycls);
                        }
                    }
                }
            }
            return ans_cycls;
        }
    }

    /**
     * Asserts wff FORMULA in *gg-domain-mt* without forward inference.  If
     * MASTER-CYC-HOST and MASTER-CYC-PORT are non-nil then the operation is
     * forwarded to the specified master Cyc image.
     */
    public static final SubLObject gg_assert(SubLObject formula, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject error = NIL;
                if (NIL != master_cyc_host) {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt177$____________asserting__A__, formula);
                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                    thread.resetMultipleValues();
                    {
                        SubLObject successP_44 = gg_remote_eval(list(GG_ASSERT, list(QUOTE, formula)), master_cyc_host, master_cyc_port);
                        SubLObject error_45 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        successP = successP_44;
                        error = error_45;
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                        SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $gg_status_message_stream$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                            api_control_vars.$the_cyclist$.bind($$BUTLERAgent, thread);
                            $gg_status_message_stream$.bind(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), thread);
                            if (formula.first() == $$evincesVerifiedGAF) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format($gg_status_message_stream$.getDynamicValue(thread), $str_alt182$____Verified____A__, third(formula));
                                force_output($gg_status_message_stream$.getDynamicValue(thread));
                            } else
                                if (formula.first() == $$evincesUnverifiedGAF) {
                                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt184$____Unverified__A__, third(formula));
                                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                                } else
                                    if (formula.first() == $$evincesRefutedGAF) {
                                        write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        format($gg_status_message_stream$.getDynamicValue(thread), $str_alt186$____Refuted__A__, third(formula));
                                        force_output($gg_status_message_stream$.getDynamicValue(thread));
                                    } else
                                        if (formula.first() == $$evincesKnownGAF) {
                                            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt188$____Known__A__, third(formula));
                                            force_output($gg_status_message_stream$.getDynamicValue(thread));
                                        }



                            thread.resetMultipleValues();
                            {
                                SubLObject successP_46 = ke.ke_assert_wff_now(formula, $gg_domain_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                SubLObject error_47 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                successP = successP_46;
                                error = error_47;
                            }
                        } finally {
                            $gg_status_message_stream$.rebind(_prev_bind_2, thread);
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(successP, error);
            }
        }
    }

    /**
     * Creates a unique constant with the given NAME. If MASTER-CYC-HOST and
     * MASTER-CYC-PORT are non-nil then the operation is replicated at the specified
     * master Cyc image.
     */
    public static final SubLObject gg_create_unique(SubLObject name, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            {
                SubLObject constant = NIL;
                SubLObject unique_name = cconcatenate(name, new SubLObject[]{ $str_alt189$_, string_utilities.to_string(random.random($int$10000000000)) });
                if (NIL != master_cyc_host) {
                    constant = fi.fi_create_int(unique_name, UNPROVIDED);
                    unique_name = constants_high.constant_name(constant);
                    gg_remote_eval(list(CLET, $list_alt192, list(KE_CREATE_NOW, unique_name, constants_high.constant_external_id(constant))), master_cyc_host, master_cyc_port);
                } else {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        try {
                            api_control_vars.$the_cyclist$.bind($$BUTLERAgent, thread);
                            constant = ke.ke_create_now(unique_name, UNPROVIDED);
                        } finally {
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return constant;
            }
        }
    }

    /**
     * Lazily creates a unique GAFGathering-NNN constant.
     * Asserts
     * (isa GAFGathering-NNN GAFGathering)
     * (gafGatheringTriggerSentence GAFGathering-NNN (Quote PARTIAL-GAF))
     * (properSubEvents FACT-GATHERING-PROCESS GAFGathering-NNN)
     * and sets the new gaf-gathering-event GAFGathering-NNN. If MASTER-CYC-HOST and
     * MASTER-CYC-PORT are non-nil then the operation is forwarded to the specified
     * master Cyc image.
     */
    public static final SubLObject gg_assert_gaf_gathering() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($gaf_gathering_event$.getDynamicValue(thread), CONSP);
            {
                SubLObject datum = $gaf_gathering_event$.getDynamicValue(thread);
                SubLObject current = datum;
                SubLObject partial_gaf = NIL;
                SubLObject master_cyc_host = NIL;
                SubLObject master_cyc_port = NIL;
                SubLObject fact_gathering_process = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt194);
                partial_gaf = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt194);
                master_cyc_host = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt194);
                master_cyc_port = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt194);
                fact_gathering_process = current.first();
                current = current.rest();
                if (NIL == current) {
                    $gaf_gathering_event$.setDynamicValue(gg_create_unique($$$GAFGathering, master_cyc_host, master_cyc_port), thread);
                    SubLTrampolineFile.checkType($gaf_gathering_event$.getDynamicValue(thread), FORT_P);
                    SubLTrampolineFile.checkType(partial_gaf, CONSP);
                    gg_assert(listS($$isa, $gaf_gathering_event$.getDynamicValue(thread), $list_alt198), master_cyc_host, master_cyc_port);
                    gg_assert(list($$gafGatheringTriggerSentence, $gaf_gathering_event$.getDynamicValue(thread), list($$Quote, partial_gaf)), master_cyc_host, master_cyc_port);
                    gg_assert(list($$properSubEvents, fact_gathering_process, $gaf_gathering_event$.getDynamicValue(thread)), master_cyc_host, master_cyc_port);
                    return NIL;
                } else {
                    cdestructuring_bind_error(datum, $list_alt194);
                }
            }
            return NIL;
        }
    }

    /**
     * Lazily a unique StringBasedSearching-NNN constant.
     * Asserts
     * (isa StringBasedSearching-NNN StringBasedSearching)
     * (properSubEvents GAF-GATHERING-EVENT StringBasedSearching-NNN)
     * (dateOfEvent StringBasedSearching-NNN DATE-OF-EVENT)
     * (searchEngineUsed StringBasedSearching-NNN SEARCH-ENGINE)
     * (searchStringsUsed StringBasedSearching-NNN SEARCH-STRING)
     * (numberOfSearchResultsObtained StringBasedSearching-NNN NBR-SEARCH-RESULTS)
     * (duration StringBasedSearching-NNN SECONDS-DURATION)
     * and sets the new string searching event StringBasedSearching-NNN. If MASTER-CYC-HOST
     * and MASTER-CYC-PORT are non-nil then the operation is forwarded to the specified master Cyc image.
     */
    public static final SubLObject gg_assert_string_based_searching() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($string_based_searching_event$.getDynamicValue(thread), CONSP);
            {
                SubLObject datum = $string_based_searching_event$.getDynamicValue(thread);
                SubLObject current = datum;
                SubLObject date_of_event = NIL;
                SubLObject v_search_engine = NIL;
                SubLObject search_string = NIL;
                SubLObject nbr_search_results = NIL;
                SubLObject seconds_duration = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt202);
                date_of_event = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt202);
                v_search_engine = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt202);
                search_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt202);
                nbr_search_results = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt202);
                seconds_duration = current.first();
                current = current.rest();
                {
                    SubLObject master_cyc_host = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt202);
                    current = current.rest();
                    {
                        SubLObject master_cyc_port = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt202);
                        current = current.rest();
                        if (NIL == current) {
                            $string_based_searching_event$.setDynamicValue(gg_create_unique($$$StringBasedSearching, master_cyc_host, master_cyc_port), thread);
                            SubLTrampolineFile.checkType($string_based_searching_event$.getDynamicValue(thread), FORT_P);
                            if (NIL == forts.fort_p($gaf_gathering_event$.getDynamicValue(thread))) {
                                gg_assert_gaf_gathering();
                            }
                            SubLTrampolineFile.checkType($gaf_gathering_event$.getDynamicValue(thread), FORT_P);
                            SubLTrampolineFile.checkType(date_of_event, CYCL_REPRESENTED_TERM_P);
                            SubLTrampolineFile.checkType(v_search_engine, FORT_P);
                            SubLTrampolineFile.checkType(nbr_search_results, INTEGERP);
                            SubLTrampolineFile.checkType(seconds_duration, CYCL_REPRESENTED_TERM_P);
                            gg_assert(listS($$isa, $string_based_searching_event$.getDynamicValue(thread), $list_alt206), master_cyc_host, master_cyc_port);
                            gg_assert(list($$properSubEvents, $gaf_gathering_event$.getDynamicValue(thread), $string_based_searching_event$.getDynamicValue(thread)), master_cyc_host, master_cyc_port);
                            gg_assert(list($$dateOfEvent, $string_based_searching_event$.getDynamicValue(thread), date_of_event), master_cyc_host, master_cyc_port);
                            gg_assert(list($$searchEngineUsed, $string_based_searching_event$.getDynamicValue(thread), v_search_engine), master_cyc_host, master_cyc_port);
                            gg_assert(list($$searchStringsUsed, $string_based_searching_event$.getDynamicValue(thread), search_string), master_cyc_host, master_cyc_port);
                            gg_assert(list($$numberOfSearchResultsObtained, $string_based_searching_event$.getDynamicValue(thread), nbr_search_results), master_cyc_host, master_cyc_port);
                            gg_assert(list($$duration, $string_based_searching_event$.getDynamicValue(thread), seconds_duration), master_cyc_host, master_cyc_port);
                            return NIL;
                        } else {
                            cdestructuring_bind_error(datum, $list_alt202);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Asserts
     * (numberOfResultsThatSupportBinding STRING-BASED-SEARCHING-EVENT BINDING NBR-OF-SUPPORTS).
     * If MASTER-CYC-HOST and MASTER-CYC-PORT are non-nil then the operation is forwarded to the
     * specified master Cyc image.
     */
    public static final SubLObject gg_assert_search_results_support(SubLObject binding, SubLObject nbr_of_supports, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(binding, CYCL_REPRESENTED_TERM_P);
            SubLTrampolineFile.checkType(nbr_of_supports, INTEGERP);
            SubLTrampolineFile.checkType($string_based_searching_event$.getDynamicValue(thread), FORT_P);
            gg_assert(list($$numberOfResultsThatSupportBinding, $string_based_searching_event$.getDynamicValue(thread), binding, nbr_of_supports), master_cyc_host, master_cyc_port);
            return NIL;
        }
    }

    /**
     * Creates a unique ObtainingASearchResult-NNN constant.
     * Asserts
     * (isa ObtainingASearchResult-NNN ObtainingAStringBasedSearchResult)
     * (properSubEvents STRING-BASED-SEARCHING-EVENT ObtainingASearchResult-NNN)
     * (objectFound ObtainingASearchResult-NNN URL)
     * (rankOfResult ObtainingASearchResult-NNN RANK-OF-RESULT)
     * and sets the new term ObtainingASearchResult-NNN.  If MASTER-CYC-HOST and
     * MASTER-CYC-PORT are non-nil then the operation is forwarded to the specified
     * master Cyc image.
     */
    public static final SubLObject gg_assert_obtaining_a_search_result() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = $obtaining_a_search_result_event$.getDynamicValue(thread);
                SubLObject current = datum;
                SubLObject url = NIL;
                SubLObject rank_of_result = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt213);
                url = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt213);
                rank_of_result = current.first();
                current = current.rest();
                {
                    SubLObject master_cyc_host = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt213);
                    current = current.rest();
                    {
                        SubLObject master_cyc_port = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt213);
                        current = current.rest();
                        if (NIL == current) {
                            $obtaining_a_search_result_event$.setDynamicValue(gg_create_unique($$$ObtainingASearchResult, master_cyc_host, master_cyc_port), thread);
                            SubLTrampolineFile.checkType($obtaining_a_search_result_event$.getDynamicValue(thread), FORT_P);
                            SubLTrampolineFile.checkType(url, CYCL_REPRESENTED_TERM_P);
                            SubLTrampolineFile.checkType(rank_of_result, INTEGERP);
                            if (NIL == forts.fort_p($string_based_searching_event$.getDynamicValue(thread))) {
                                gg_assert_string_based_searching();
                            }
                            SubLTrampolineFile.checkType($string_based_searching_event$.getDynamicValue(thread), FORT_P);
                            gg_assert(listS($$isa, $obtaining_a_search_result_event$.getDynamicValue(thread), $list_alt215), master_cyc_host, master_cyc_port);
                            gg_assert(list($$properSubEvents, $string_based_searching_event$.getDynamicValue(thread), $obtaining_a_search_result_event$.getDynamicValue(thread)), master_cyc_host, master_cyc_port);
                            gg_assert(list($$objectFound, $obtaining_a_search_result_event$.getDynamicValue(thread), url), master_cyc_host, master_cyc_port);
                            gg_assert(list($$rankOfResult, $obtaining_a_search_result_event$.getDynamicValue(thread), rank_of_result), master_cyc_host, master_cyc_port);
                            return NIL;
                        } else {
                            cdestructuring_bind_error(datum, $list_alt213);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Asserts
     * (focalBasisString OBTAINING-A-SEARCH-RESULT-EVENT ANS-STRING)
     * (evincesBinding OBTAINING-A-SEARCH-RESULT-EVENT BINDING)
     * (evincesGAF OBTAINING-A-SEARCH-RESULT-EVENT COMPLETED-GAF)
     * If MASTER-CYC-HOST and MASTER-CYC-PORT are non-nil then the operation
     * is forwarded to the specified master Cyc image. This function will
     * call the other gaf-gathering assertion functions with saved arguments.
     */
    public static final SubLObject gg_assert_evinces_verified_gaf(SubLObject ans_string, SubLObject binding, SubLObject completed_gaf, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(ans_string, STRINGP);
            SubLTrampolineFile.checkType(binding, CYCL_REPRESENTED_TERM_P);
            SubLTrampolineFile.checkType(completed_gaf, CONSP);
            if (NIL == forts.fort_p($obtaining_a_search_result_event$.getDynamicValue(thread))) {
                gg_assert_obtaining_a_search_result();
            }
            SubLTrampolineFile.checkType($obtaining_a_search_result_event$.getDynamicValue(thread), FORT_P);
            gg_assert(list($$focalBasisString, $obtaining_a_search_result_event$.getDynamicValue(thread), ans_string), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesBinding, $obtaining_a_search_result_event$.getDynamicValue(thread), binding), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesVerifiedGAF, $obtaining_a_search_result_event$.getDynamicValue(thread), completed_gaf), master_cyc_host, master_cyc_port);
            return NIL;
        }
    }

    /**
     * Asserts
     * (focalBasisString OBTAINING-A-SEARCH-RESULT-EVENT ANS-STRING)
     * (evincesBinding OBTAINING-A-SEARCH-RESULT-EVENT BINDING)
     * (evincesRefutedGAF OBTAINING-A-SEARCH-RESULT-EVENT COMPLETED-GAF)
     * If MASTER-CYC-HOST and MASTER-CYC-PORT are non-nil then the operation
     * is forwarded to the specified master Cyc image. This function will
     * call the other gaf-gathering assertion functions with saved arguments.
     */
    public static final SubLObject gg_assert_evinces_refutable_gaf(SubLObject ans_string, SubLObject binding, SubLObject completed_gaf, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(ans_string, STRINGP);
            SubLTrampolineFile.checkType(binding, CYCL_REPRESENTED_TERM_P);
            SubLTrampolineFile.checkType(completed_gaf, CONSP);
            if (NIL == forts.fort_p($obtaining_a_search_result_event$.getDynamicValue(thread))) {
                gg_assert_obtaining_a_search_result();
            }
            SubLTrampolineFile.checkType($obtaining_a_search_result_event$.getDynamicValue(thread), FORT_P);
            gg_assert(list($$focalBasisString, $obtaining_a_search_result_event$.getDynamicValue(thread), ans_string), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesBinding, $obtaining_a_search_result_event$.getDynamicValue(thread), binding), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesRefutableGAF, $obtaining_a_search_result_event$.getDynamicValue(thread), completed_gaf), master_cyc_host, master_cyc_port);
            return NIL;
        }
    }

    /**
     * Asserts
     * (focalBasisString OBTAINING-A-SEARCH-RESULT-EVENT ANS-STRING)
     * (evincesBinding OBTAINING-A-SEARCH-RESULT-EVENT BINDING)
     * (evincesUnverifiedGAF OBTAINING-A-SEARCH-RESULT-EVENT COMPLETED-GAF)
     * If MASTER-CYC-HOST and MASTER-CYC-PORT are non-nil then the operation
     * is forwarded to the specified master Cyc image. This function will
     * call the other gaf-gathering assertion functions with saved arguments.
     */
    public static final SubLObject gg_assert_evinces_unverified_gaf(SubLObject ans_string, SubLObject binding, SubLObject completed_gaf, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(ans_string, STRINGP);
            SubLTrampolineFile.checkType(binding, CYCL_REPRESENTED_TERM_P);
            SubLTrampolineFile.checkType(completed_gaf, CONSP);
            if (NIL == forts.fort_p($obtaining_a_search_result_event$.getDynamicValue(thread))) {
                gg_assert_obtaining_a_search_result();
            }
            SubLTrampolineFile.checkType($obtaining_a_search_result_event$.getDynamicValue(thread), FORT_P);
            gg_assert(list($$focalBasisString, $obtaining_a_search_result_event$.getDynamicValue(thread), ans_string), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesBinding, $obtaining_a_search_result_event$.getDynamicValue(thread), binding), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesUnverifiedGAF, $obtaining_a_search_result_event$.getDynamicValue(thread), completed_gaf), master_cyc_host, master_cyc_port);
            return NIL;
        }
    }

    /**
     * Asserts
     * (focalBasisString OBTAINING-A-SEARCH-RESULT-EVENT ANS-STRING)
     * (evincesBinding OBTAINING-A-SEARCH-RESULT-EVENT BINDING)
     * (evincesKnownGAF OBTAINING-A-SEARCH-RESULT-EVENT COMPLETED-GAF)
     * If MASTER-CYC-HOST and MASTER-CYC-PORT are non-nil then the operation
     * is forwarded to the specified master Cyc image. This function will
     * call the other gaf-gathering assertion functions with saved arguments.
     */
    public static final SubLObject gg_assert_evinces_known_gaf(SubLObject ans_string, SubLObject binding, SubLObject completed_gaf, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(ans_string, STRINGP);
            SubLTrampolineFile.checkType(binding, CYCL_REPRESENTED_TERM_P);
            SubLTrampolineFile.checkType(completed_gaf, CONSP);
            if (NIL == forts.fort_p($obtaining_a_search_result_event$.getDynamicValue(thread))) {
                gg_assert_obtaining_a_search_result();
            }
            SubLTrampolineFile.checkType($obtaining_a_search_result_event$.getDynamicValue(thread), FORT_P);
            gg_assert(list($$focalBasisString, $obtaining_a_search_result_event$.getDynamicValue(thread), ans_string), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesBinding, $obtaining_a_search_result_event$.getDynamicValue(thread), binding), master_cyc_host, master_cyc_port);
            gg_assert(list($$evincesKnownGAF, $obtaining_a_search_result_event$.getDynamicValue(thread), completed_gaf), master_cyc_host, master_cyc_port);
            return NIL;
        }
    }

    /**
     * the indicator displaying a diagnostic trace for the function massage-answer-string
     */
    // deflexical
    public static final SubLSymbol $massage_answer_string_traceP$ = makeSymbol("*MASSAGE-ANSWER-STRING-TRACE?*");

    /**
     * Returns the text from the ANS-STRING matching the * in the SEARCH-STRING pattern. Because
     * Google sometimes returns a non-exact answer string, this function may return NIL. Also expands coordinations.
     */
    public static final SubLObject massage_answer_string(SubLObject ans_string, SubLObject search_string, SubLObject mode) {
        if (NIL != $massage_answer_string_traceP$.getGlobalValue()) {
            format(T, $str_alt221$_massage_answer_string__S__S__S__, new SubLObject[]{ ans_string, search_string, mode });
            force_output(T);
        }
        {
            SubLObject sentences = document.sentencify_string(ans_string);
            SubLObject ans_strings = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                {
                    SubLObject offset = NIL;
                    SubLObject massaged_ans_string = NIL;
                    if (NIL == string_utilities.empty_string_p(sentence)) {
                        if (mode == $BETWEEN) {
                            {
                                SubLObject start_tag = string_utilities.string_upto(search_string, CHAR_asterisk);
                                SubLObject end_tag = string_utilities.string_after(search_string, CHAR_asterisk);
                                if (((NIL != start_tag) && (NIL != end_tag)) && (NIL != string_utilities.substringP(end_tag, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    offset = string_utilities.substringP(start_tag, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL != offset) {
                                        {
                                            SubLObject substring_between_tags = string_utilities.get_substring_between_tags(ans_string, start_tag, end_tag, UNPROVIDED, UNPROVIDED);
                                            if (NIL != substring_between_tags) {
                                                massaged_ans_string = gg_remove_backward_words(string_utilities.get_substring_between_tags(ans_string, start_tag, end_tag, UNPROVIDED, UNPROVIDED));
                                                if (NIL != massaged_ans_string) {
                                                    ans_strings = gg_expand_coordinations(massaged_ans_string, mode, ans_strings, offset);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            offset = string_utilities.substringP(string_utilities.trim_whitespace(string_utilities.remove_substring(search_string, $str_alt109$_)), Strings.string_downcase(sentence, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != offset) {
                                {
                                    SubLObject pcase_var = mode;
                                    if (pcase_var.eql($FORWARD)) {
                                        massaged_ans_string = gg_remove_forward_words(string_utilities.substring(sentence, number_utilities.f_1_(add(offset, length(search_string))), NIL));
                                    } else
                                        if (pcase_var.eql($BACKWARD)) {
                                            if (offset.numG(ZERO_INTEGER)) {
                                                massaged_ans_string = gg_remove_backward_words(string_utilities.substring(sentence, ZERO_INTEGER, number_utilities.f_1_(offset)));
                                            }
                                        }

                                }
                                if (NIL != massaged_ans_string) {
                                    ans_strings = gg_expand_coordinations(massaged_ans_string, mode, ans_strings, offset);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(ans_strings);
        }
    }

    /**
     * Returns the given list of ANS-STRINGS, extended by the set of coordinated sub-strings
     * from ANS-STRING, or extended by ANS-STRING if it ANS-STRING does not contain 'and' '&' or 'or'.
     */
    public static final SubLObject gg_expand_coordinations(SubLObject ans_string, SubLObject mode, SubLObject ans_strings, SubLObject offset) {
        SubLTrampolineFile.checkType(ans_string, STRINGP);
        SubLTrampolineFile.checkType(mode, SYMBOLP);
        {
            SubLObject result_strings = ans_strings;
            if (!((((mode == $BETWEEN) || (NIL != string_utilities.substringP($str_alt222$_and_, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.substringP($str_alt223$_or_, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.substringP($str_alt224$___, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                {
                    SubLObject item_var = list(ans_string, offset);
                    if (NIL == member(item_var, result_strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        result_strings = cons(item_var, result_strings);
                    }
                }
                return result_strings;
            }
            {
                SubLObject temp_string = NIL;
                temp_string = string_utilities.string_substitute($str_alt225$_, $str_alt222$_and_, ans_string, UNPROVIDED);
                temp_string = string_utilities.string_substitute($str_alt225$_, $str_alt223$_or_, temp_string, UNPROVIDED);
                temp_string = string_utilities.string_substitute($str_alt225$_, $str_alt224$___, temp_string, UNPROVIDED);
                temp_string = string_utilities.string_substitute($str_alt225$_, $str_alt118$_, temp_string, UNPROVIDED);
                temp_string = string_utilities.string_substitute($str_alt225$_, $str_alt226$__, temp_string, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = string_utilities.split_string(temp_string, $list_alt227);
                    SubLObject coordination_string = NIL;
                    for (coordination_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coordination_string = cdolist_list_var.first()) {
                        coordination_string = string_utilities.trim_whitespace(coordination_string);
                        if (!coordination_string.equal(string_utilities.$empty_string$.getGlobalValue())) {
                            {
                                SubLObject item_var = list(coordination_string, offset);
                                if (NIL == member(item_var, result_strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    result_strings = cons(item_var, result_strings);
                                }
                            }
                        }
                    }
                }
            }
            return result_strings;
        }
    }

    /**
     * the list of case-insensitive words which when ending a :backward mode answer string, doom it.
     */
    // defconstant
    private static final SubLSymbol $gg_doomed_end_words_in_backward_mode$ = makeSymbol("*GG-DOOMED-END-WORDS-IN-BACKWARD-MODE*");

    /**
     * the list of case-insensitive words which can be stripped when ending a :backward or :between mode parse.
     */
    // defconstant
    private static final SubLSymbol $gg_end_words_to_strip_in_backward_mode$ = makeSymbol("*GG-END-WORDS-TO-STRIP-IN-BACKWARD-MODE*");

    /**
     * Returns NIL if the ANS-STRING is doomed, otherwise removes certain words from the end of the string.
     */
    public static final SubLObject gg_remove_backward_words(SubLObject ans_string) {
        SubLTrampolineFile.checkType(ans_string, STRINGP);
        {
            SubLObject words = nreverse(string_utilities.split_string(ans_string, UNPROVIDED));
            SubLObject word = NIL;
            SubLObject downcase_word = NIL;
            SubLObject result_words = NIL;
            SubLObject non_doomed_wordP = NIL;
            if (NIL != string_utilities.ends_with(ans_string, $str_alt110$_, UNPROVIDED)) {
                return NIL;
            }
            while (NIL != words) {
                word = words.first();
                words = words.rest();
                downcase_word = Strings.string_downcase(word, UNPROVIDED, UNPROVIDED);
                if (NIL != string_utilities.starts_with(downcase_word, $str_alt230$_)) {
                    downcase_word = string_utilities.pre_remove(downcase_word, $str_alt230$_, UNPROVIDED);
                }
                if (NIL == non_doomed_wordP) {
                    if (NIL != subl_promotions.memberP(downcase_word, $gg_doomed_end_words_in_backward_mode$.getGlobalValue(), symbol_function($sym85$STRING_), UNPROVIDED)) {
                        return NIL;
                    } else {
                        non_doomed_wordP = T;
                    }
                }
                if (NIL == subl_promotions.memberP(downcase_word, $gg_end_words_to_strip_in_backward_mode$.getGlobalValue(), symbol_function($sym85$STRING_), UNPROVIDED)) {
                    result_words = cons(word, result_words);
                }
            } 
            return string_utilities.bunge(result_words, UNPROVIDED);
        }
    }

    /**
     * the list of case-insensitive words which when starting a :forward mode answer string, doom it.
     */
    // defconstant
    private static final SubLSymbol $gg_doomed_start_words_in_forward_mode$ = makeSymbol("*GG-DOOMED-START-WORDS-IN-FORWARD-MODE*");

    /**
     * the list of case-insensitive words which can be stripped when starting a :forward mode parse.
     */
    // defconstant
    private static final SubLSymbol $gg_start_words_to_strip_in_forward_mode$ = makeSymbol("*GG-START-WORDS-TO-STRIP-IN-FORWARD-MODE*");

    /**
     * Returns NIL if the ANS-STRING is doomed, otherwise removes certain words from the start of the string.
     */
    public static final SubLObject gg_remove_forward_words(SubLObject ans_string) {
        SubLTrampolineFile.checkType(ans_string, STRINGP);
        {
            SubLObject words = string_utilities.split_string(ans_string, UNPROVIDED);
            SubLObject word = NIL;
            SubLObject downcase_word = NIL;
            SubLObject result_words = NIL;
            SubLObject non_doomed_wordP = NIL;
            if (NIL != string_utilities.ends_with(ans_string, $str_alt110$_, UNPROVIDED)) {
                return NIL;
            }
            while (NIL != words) {
                word = words.first();
                words = words.rest();
                downcase_word = Strings.string_downcase(word, UNPROVIDED, UNPROVIDED);
                if (NIL == non_doomed_wordP) {
                    if (NIL != subl_promotions.memberP(downcase_word, $gg_doomed_start_words_in_forward_mode$.getGlobalValue(), symbol_function($sym85$STRING_), UNPROVIDED)) {
                        return NIL;
                    } else {
                        non_doomed_wordP = T;
                    }
                }
                if (NIL == subl_promotions.memberP(downcase_word, $gg_start_words_to_strip_in_forward_mode$.getGlobalValue(), symbol_function($sym85$STRING_), UNPROVIDED)) {
                    result_words = cons(word, result_words);
                }
            } 
            return string_utilities.bunge(nreverse(result_words), UNPROVIDED);
        }
    }

    /**
     * the number of web hits beyond which a completed gaf is considered verified
     */
    // defconstant
    private static final SubLSymbol $gg_web_hit_verified_gaf_threshold$ = makeSymbol("*GG-WEB-HIT-VERIFIED-GAF-THRESHOLD*");

    /**
     * Returns the number of web hits, if over the verification threshold, for the
     * given completed GAF.  The UNQUOTED-SEARCH-STRING was the search string that
     * produced the binding, so similar verification strings should be tried first.
     */
    public static final SubLObject verify_gaf_via_web_fast(SubLObject gaf, SubLObject unquoted_search_string, SubLObject stop_at_thresholdP, SubLObject threshold) {
        if (stop_at_thresholdP == UNPROVIDED) {
            stop_at_thresholdP = NIL;
        }
        if (threshold == UNPROVIDED) {
            threshold = $gg_web_hit_verified_gaf_threshold$.getGlobalValue();
        }
        {
            SubLObject search_strings = search_strings_for_verification(gaf);
            return verify_gaf_via_web_internal(search_strings, unquoted_search_string, stop_at_thresholdP, threshold);
        }
    }

    /**
     * Returns the number of web hits, if over the verification threshold, for the given completed GAF
     * and ANS-CYCL binding.  The UNQUOTED-SEARCH-STRING was the search string that produced the binding, so
     * similar verification strings should be tried first.
     */
    public static final SubLObject verify_gaf_with_coordinated_phrase(SubLObject partial_gaf, SubLObject ans_cycl, SubLObject unquoted_search_string, SubLObject stop_at_thresholdP, SubLObject threshold) {
        if (stop_at_thresholdP == UNPROVIDED) {
            stop_at_thresholdP = NIL;
        }
        if (threshold == UNPROVIDED) {
            threshold = $gg_web_hit_verified_gaf_threshold$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(partial_gaf, CONSP);
        SubLTrampolineFile.checkType(ans_cycl, FORT_P);
        {
            SubLObject mt = gaf_gathering_paraphrase_mt();
            SubLObject search_strings = list(cons(mt, search_strings(partial_gaf, mt)));
            return verify_gaf_via_web_internal(search_strings, unquoted_search_string, stop_at_thresholdP, threshold);
        }
    }

    /**
     *
     *
     * @param SEARCH-STRINGS-W/-MTS
     * 		alist-p ; PPH-MT -> SEARCH-STRINGS
     * @return GG-GAF-VERIFICATION-METRICS-P
     */
    public static final SubLObject verify_gaf_via_web_internal(SubLObject search_strings_wX_mts, SubLObject unquoted_search_string, SubLObject stop_at_thresholdP, SubLObject threshold) {
        {
            SubLObject metrics = verify_search_strings(search_strings_wX_mts, unquoted_search_string, stop_at_thresholdP, threshold);
            SubLObject status = metrics.first();
            SubLObject confirmation_id = new_gg_confirmation_id(gaf_gathering_metrics.gg_complete_gaf_verified_status_p(status));
            metrics = cons(confirmation_id, metrics);
            return metrics;
        }
    }

    public static final SubLObject verify_search_strings(SubLObject search_strings_wX_mts, SubLObject unquoted_search_string, SubLObject stop_at_thresholdP, SubLObject threshold) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cumulative_count = ZERO_INTEGER;
                SubLObject unquoted_search_string_text = remove(CHAR_asterisk, unquoted_search_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject stopP = NIL;
                SubLObject search_strings_metrics = NIL;
                SubLObject total_milliseconds = NIL;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject cdolist_list_var = search_strings_wX_mts;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject pph_mt = NIL;
                            SubLObject search_strings = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt233);
                            pph_mt = current.first();
                            current = current.rest();
                            search_strings = current;
                            search_strings = delete_duplicates(search_strings, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != stop_at_thresholdP) {
                                search_strings = sort_verification_strings_by_similarity_to_search_string(search_strings, unquoted_search_string);
                            }
                            if (NIL == stopP) {
                                {
                                    SubLObject csome_list_var = search_strings;
                                    SubLObject search_string = NIL;
                                    for (search_string = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , search_string = csome_list_var.first()) {
                                        gg_indicate_that_process_is_alive();
                                        {
                                            SubLObject this_one_metrics = list(cycl_utilities.hl_to_el(pph_mt));
                                            SubLObject split_milliseconds = NIL;
                                            SubLObject count = NIL;
                                            SubLObject time_var_48 = get_internal_real_time();
                                            count = gg_google_count(search_string);
                                            if (count.isPositive() && (NIL != string_utilities.substringP(unquoted_search_string_text, search_string, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED))) {
                                                count = subtract(count, ONE_INTEGER);
                                            }
                                            if (NIL != count) {
                                                if (count == ZERO_INTEGER) {
                                                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt234$____________no_support_from___A__, search_string);
                                                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                                                } else {
                                                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt235$_____________A_support_s__from___, count, search_string);
                                                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                                                }
                                                cumulative_count = add(cumulative_count, count);
                                            }
                                            split_milliseconds = divide(subtract(get_internal_real_time(), time_var_48), time_high.$internal_time_units_per_second$.getGlobalValue());
                                            split_milliseconds = truncate(multiply(split_milliseconds, $int$1000), UNPROVIDED);
                                            this_one_metrics = list(split_milliseconds, search_string, count);
                                            search_strings_metrics = cons(this_one_metrics, search_strings_metrics);
                                        }
                                        stopP = makeBoolean((NIL != stop_at_thresholdP) && cumulative_count.numG(threshold));
                                    }
                                }
                            }
                        }
                    }
                }
                total_milliseconds = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                total_milliseconds = truncate(multiply(total_milliseconds, $int$1000), UNPROVIDED);
                {
                    SubLObject status = (cumulative_count.numG(threshold)) ? ((SubLObject) (list($VERIFIED, cumulative_count))) : $UNVERIFIED;
                    return list(status, total_milliseconds, search_strings_metrics);
                }
            }
        }
    }

    /**
     * Returns the given SEARCH-STRINGS sorted in descending order by how many words each has in common with the
     * given UNQUOTED-SEARCH-STRING.
     */
    public static final SubLObject sort_verification_strings_by_similarity_to_search_string(SubLObject search_strings, SubLObject unquoted_search_string) {
        {
            SubLObject sorted_search_strings = NIL;
            SubLObject search_string_infos = NIL;
            {
                SubLObject cdolist_list_var = search_strings;
                SubLObject search_string = NIL;
                for (search_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string = cdolist_list_var.first()) {
                    {
                        SubLObject nbr_of_words_in_common = length(intersection(remove_duplicates(string_utilities.split_string(string_utilities.unquote_string(search_string), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), string_utilities.split_string(unquoted_search_string, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED));
                        search_string_infos = cons(list(nbr_of_words_in_common, search_string), search_string_infos);
                    }
                }
            }
            search_string_infos = Sort.sort(search_string_infos, symbol_function($sym238$_), symbol_function(FIRST));
            {
                SubLObject cdolist_list_var = search_string_infos;
                SubLObject search_string_info = NIL;
                for (search_string_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_info = cdolist_list_var.first()) {
                    sorted_search_strings = cons(second(search_string_info), sorted_search_strings);
                }
            }
            return sorted_search_strings;
        }
    }

    /**
     *
     *
     * @return ALIST-P mapping paraphrase mt -> search strings
     */
    public static final SubLObject search_strings_for_verification(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject search_strings = NIL;
                SubLObject pph_mts = remove_duplicates(list_utilities.remove_if_not(HLMT_P, list(pph_vars.pph_language_mt(), gaf_gathering_paraphrase_mt()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject done_strings = set.new_set(symbol_function(EQUALP), UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                    try {
                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                        {
                            SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject _prev_bind_0_49 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                        {
                                            SubLObject new_or_reused = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_50 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    {
                                                        SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                        {
                                                            SubLObject _prev_bind_0_51 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                                {
                                                                    SubLObject original_memoization_process = NIL;
                                                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                        {
                                                                            SubLObject current_proc = current_process();
                                                                            if (NIL == original_memoization_process) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                            } else {
                                                                                if (original_memoization_process != current_proc) {
                                                                                    Errors.error($str_alt133$Invalid_attempt_to_reuse_memoizat);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject disambiguations = disambiguations_for_gaf_arguments(gaf);
                                                                            SubLObject strings_not_requiring_disambiguation = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject cdolist_list_var = pph_mts;
                                                                                SubLObject pph_mt = NIL;
                                                                                for (pph_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pph_mt = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject cdolist_list_var_52 = search_strings(gaf, pph_mt);
                                                                                        SubLObject raw_search_string = NIL;
                                                                                        for (raw_search_string = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , raw_search_string = cdolist_list_var_52.first()) {
                                                                                            if (NIL == set.set_memberP(raw_search_string, done_strings)) {
                                                                                                set.set_add(raw_search_string, done_strings);
                                                                                                {
                                                                                                    SubLObject search_string = massage_search_string(raw_search_string);
                                                                                                    SubLObject doneP = NIL;
                                                                                                    SubLObject cdolist_list_var_53 = disambiguations;
                                                                                                    SubLObject v_disambiguation = NIL;
                                                                                                    for (v_disambiguation = cdolist_list_var_53.first(); NIL != cdolist_list_var_53; cdolist_list_var_53 = cdolist_list_var_53.rest() , v_disambiguation = cdolist_list_var_53.first()) {
                                                                                                        if ((NIL != string_utilities.subwordP(v_disambiguation.first(), raw_search_string, $list_alt241, UNPROVIDED)) && (NIL == string_contains_one_substring(raw_search_string, strings_containing(strings_not_requiring_disambiguation, v_disambiguation.first())))) {
                                                                                                            search_string = cconcatenate(format_nil.format_nil_a_no_copy(search_string), new SubLObject[]{ $str_alt43$_, format_nil.format_nil_s_no_copy(v_disambiguation.rest()) });
                                                                                                        }
                                                                                                    }
                                                                                                    search_strings = list_utilities.alist_push(search_strings, pph_mt, search_string, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_54, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_51, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_50, thread);
                                                }
                                            }
                                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL == reuseP) {
                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                    }
                }
                return search_strings;
            }
        }
    }

    public static final SubLObject strings_containing(SubLObject string_list, SubLObject possible_substring) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = string_list;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                if (NIL != search(possible_substring, string, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    result = cons(string, result);
                }
            }
            return result;
        }
    }

    public static final SubLObject string_contains_one_substring(SubLObject big_string, SubLObject possible_substrings) {
        {
            SubLObject cdolist_list_var = possible_substrings;
            SubLObject substring = NIL;
            for (substring = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , substring = cdolist_list_var.first()) {
                if (NIL != search(substring, big_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
            }
        }
        return NIL;
    }



    public static final SubLObject clear_gg_google_count() {
        {
            SubLObject cs = $gg_google_count_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_gg_google_count(SubLObject search_string) {
        return memoization_state.caching_state_remove_function_results_with_args($gg_google_count_caching_state$.getGlobalValue(), list(search_string), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gg_google_count_internal(SubLObject search_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = NIL;
                {
                    SubLObject _prev_bind_0 = Errors.$ignore_warnsP$.currentBinding(thread);
                    try {
                        Errors.$ignore_warnsP$.bind(T, thread);
                        count = search_engine.google_count(search_string);
                    } finally {
                        Errors.$ignore_warnsP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != search_engine.google_error_tokenP(count)) {
                    count = ZERO_INTEGER;
                }
                return count;
            }
        }
    }

    public static final SubLObject gg_google_count(SubLObject search_string) {
        {
            SubLObject caching_state = $gg_google_count_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GG_GOOGLE_COUNT, $gg_google_count_caching_state$, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, search_string, $kw157$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw157$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(gg_google_count_internal(search_string)));
                    memoization_state.caching_state_put(caching_state, search_string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     * the list of phrases which indicate that the following sentence could be untrue
     */
    // defconstant
    private static final SubLSymbol $gg_untrue_prefix_phrases$ = makeSymbol("*GG-UNTRUE-PREFIX-PHRASES*");

    /**
     * the list of prefix phrases which indicate that the answer string could be untrue in :between mode
     */
    // defconstant
    private static final SubLSymbol $gg_untrue_between_prefix_phrases$ = makeSymbol("*GG-UNTRUE-BETWEEN-PREFIX-PHRASES*");

    /**
     * the list of suffix phrases which indicate that the answer string could be untrue in :between mode
     */
    // defconstant
    private static final SubLSymbol $gg_untrue_suffix_phrases$ = makeSymbol("*GG-UNTRUE-SUFFIX-PHRASES*");

    /**
     * Returns true IFF the RAW-ANSWER-STRING contains a phrase that indicates that the sentence
     * formed from the SEARCH-STRING and any of the ANS-STRINGS with MODE could be false.
     */
    public static final SubLObject gg_untrue_sentenceP(SubLObject raw_ans_string, SubLObject search_string, SubLObject ans_strings, SubLObject mode) {
        SubLTrampolineFile.checkType(raw_ans_string, STRINGP);
        SubLTrampolineFile.checkType(search_string, STRINGP);
        SubLTrampolineFile.checkType(ans_strings, LISTP);
        SubLTrampolineFile.checkType(mode, SYMBOLP);
        if (mode == $BACKWARD) {
            {
                SubLObject cdolist_list_var = ans_strings;
                SubLObject ans_string = NIL;
                for (ans_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans_string = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_56 = $gg_untrue_prefix_phrases$.getGlobalValue();
                        SubLObject untrue_prefix_phrase = NIL;
                        for (untrue_prefix_phrase = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest() , untrue_prefix_phrase = cdolist_list_var_56.first()) {
                            if (NIL != string_utilities.starts_with(ans_string, cconcatenate(untrue_prefix_phrase, $str_alt43$_))) {
                                return T;
                            }
                        }
                    }
                }
            }
        } else {
            {
                SubLObject temp_search_string = string_utilities.string_upto(search_string, CHAR_asterisk);
                SubLObject temp_string = NIL;
                SubLObject cdolist_list_var = $gg_untrue_prefix_phrases$.getGlobalValue();
                SubLObject untrue_prefix_phrase = NIL;
                for (untrue_prefix_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , untrue_prefix_phrase = cdolist_list_var.first()) {
                    temp_string = cconcatenate(untrue_prefix_phrase, new SubLObject[]{ $str_alt43$_, temp_search_string });
                    if (NIL != string_utilities.substringP(temp_string, raw_ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                }
            }
            if (mode == $BETWEEN) {
                {
                    SubLObject cdolist_list_var = $gg_untrue_between_prefix_phrases$.getGlobalValue();
                    SubLObject untrue_between_prefix_phrase = NIL;
                    for (untrue_between_prefix_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , untrue_between_prefix_phrase = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_57 = ans_strings;
                            SubLObject ans_string = NIL;
                            for (ans_string = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , ans_string = cdolist_list_var_57.first()) {
                                if (NIL != string_utilities.starts_with(ans_string, cconcatenate(untrue_between_prefix_phrase, $str_alt43$_))) {
                                    return T;
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = $gg_untrue_suffix_phrases$.getGlobalValue();
                    SubLObject untrue_suffix_phrase = NIL;
                    for (untrue_suffix_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , untrue_suffix_phrase = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_58 = ans_strings;
                            SubLObject ans_string = NIL;
                            for (ans_string = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , ans_string = cdolist_list_var_58.first()) {
                                if (NIL != string_utilities.ends_with(ans_string, cconcatenate($str_alt43$_, untrue_suffix_phrase), UNPROVIDED)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    // defconstant
    private static final SubLSymbol $gg_refutation_query_properties$ = makeSymbol("*GG-REFUTATION-QUERY-PROPERTIES*");

    // defconstant
    private static final SubLSymbol $gg_refutation_problem_store_name$ = makeSymbol("*GG-REFUTATION-PROBLEM-STORE-NAME*");

    /**
     * the named problem store that is reused for refutation queries
     */
    // defparameter
    private static final SubLSymbol $gg_refutation_problem_store$ = makeSymbol("*GG-REFUTATION-PROBLEM-STORE*");

    /**
     * Creates a named inference problem store for refutation-queries.
     */
    public static final SubLObject gg_create_named_problem_store_for_refutation_queries() {
        inference_datastructures_problem_store.destroy_problem_store_by_name($gg_refutation_problem_store_name$.getGlobalValue());
        $gg_refutation_problem_store$.setDynamicValue(inference_datastructures_problem_store.find_or_create_problem_store_by_name($gg_refutation_problem_store_name$.getGlobalValue(), list_utilities.filter_plist($gg_refutation_query_properties$.getGlobalValue(), PROBLEM_STORE_PROPERTY_P)));
        return NIL;
    }

    /**
     * Returns T IFF the COMPLETED-GAF can be refuten in DOMAIN-MT.
     */
    public static final SubLObject gg_refuted_gaf(SubLObject completed_gaf, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt251$_________refuting__A__, completed_gaf);
            force_output($gg_status_message_stream$.getDynamicValue(thread));
            {
                SubLObject refutedP = gg_refuted_gaf_int(completed_gaf, domain_mt);
                if (NIL != refutedP) {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt252$____________refuted__, completed_gaf);
                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                } else {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt253$____________not_refuted__, completed_gaf);
                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                }
                return refutedP;
            }
        }
    }



    public static final SubLObject clear_gg_refuted_gaf_int() {
        {
            SubLObject cs = $gg_refuted_gaf_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_gg_refuted_gaf_int(SubLObject completed_gaf, SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($gg_refuted_gaf_int_caching_state$.getGlobalValue(), list(completed_gaf, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns T IFF the COMPLETED-GAF can be refuted in DOMAIN-MT.
     */
    public static final SubLObject gg_refuted_gaf_int_internal(SubLObject completed_gaf, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(completed_gaf, CONSP);
            SubLTrampolineFile.checkType(domain_mt, HLMT_P);
            if (NIL == $gg_refutation_problem_store$.getDynamicValue(thread)) {
                gg_create_named_problem_store_for_refutation_queries();
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == $gg_refutation_problem_store$.getDynamicValue(thread)) {
                    Errors.error($str_alt255$could_not_create_inference_proble);
                }
            }
            return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(list($$not, completed_gaf), domain_mt, append($gg_refutation_query_properties$.getGlobalValue(), list($PROBLEM_STORE, $gg_refutation_problem_store$.getDynamicValue(thread)))));
        }
    }

    public static final SubLObject gg_refuted_gaf_int(SubLObject completed_gaf, SubLObject domain_mt) {
        {
            SubLObject caching_state = $gg_refuted_gaf_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GG_REFUTED_GAF_INT, $gg_refuted_gaf_int_caching_state$, $int$100, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(completed_gaf, domain_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw157$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (completed_gaf.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(gg_refuted_gaf_int_internal(completed_gaf, domain_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(completed_gaf, domain_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * Returns #$assertionNthArgBindingDerivedFromString
     */
    public static final SubLObject gg_meta_assert_predicate() {
        return constants_high.find_constant_by_guid(Guids.string_to_guid($str_alt259$b07cb666_95a4_41d9_9af6_9c657a1bc));
    }

    /**
     * Returns all possible GAFs that can be obtained by adding bindings that
     * satisfy the type-constraints of the EL-variable in PARTIAL-GAF.
     */
    public static final SubLObject gg_completed_gafs_for_verification(SubLObject partial_gaf) {
        {
            SubLObject var_pos = variable_position_in_gaf(partial_gaf);
            SubLObject constraining_collection = constraining_collection_for_variable(partial_gaf, var_pos);
            SubLObject var_bindings = isa.all_fort_instances(constraining_collection, UNPROVIDED, UNPROVIDED);
            SubLObject gafs = NIL;
            SubLObject cdolist_list_var = var_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                gafs = cons(el_utilities.replace_formula_arg(var_pos, binding, partial_gaf), gafs);
            }
            return gafs;
        }
    }

    /**
     *
     *
     * @param PRED
     * 		predicate-p
     * @param POS
     * 		integerp
     * @param MT
     * 		hlmt-p
     * @return collection-p ;;which is the minimal collection of candidate
    formula args in position POS for predicate PRED in MT.
     */
    public static final SubLObject noun_learner_arg_isa_for_pred(SubLObject pred, SubLObject pos, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = NIL;
                SubLObject cols = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        assertions = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$argIsa, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject cur_assertion = NIL;
                    for (cur_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_assertion = cdolist_list_var.first()) {
                        if (assertions_high.gaf_arg2(cur_assertion) == pos) {
                            cols = cons(assertions_high.gaf_arg3(cur_assertion), cols);
                        }
                    }
                }
                return genls.min_cols(cols, mt, UNPROVIDED).first();
            }
        }
    }

    /**
     *
     *
     * @param PRED
     * 		predicate-p
     * @param POS
     * 		integerp
     * @param MT
     * 		hlmt-p
     * @return collection-p ;;which is the minimal collection genls to
    candidates for formula args in position POS for predicate PRED in MT.
     */
    public static final SubLObject noun_learner_arg_genls_for_pred(SubLObject pred, SubLObject pos, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = NIL;
                SubLObject cols = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        assertions = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$argGenl, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject cur_assertion = NIL;
                    for (cur_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_assertion = cdolist_list_var.first()) {
                        if (assertions_high.gaf_arg2(cur_assertion) == pos) {
                            cols = cons(assertions_high.gaf_arg3(cur_assertion), cols);
                        }
                    }
                }
                return genls.min_cols(cols, mt, UNPROVIDED).first();
            }
        }
    }

    public static final SubLObject google_server_upP() {
        return search_engine.google_server_aliveP();
    }

    public static final SubLObject google_server_timed_outP() {
        return NIL;
    }

    /**
     * the remote image connection to the master Cyc server for gaf-gathering
     */
    // deflexical
    private static final SubLSymbol $gg_master_remote_image_connection$ = makeSymbol("*GG-MASTER-REMOTE-IMAGE-CONNECTION*");

    /**
     * Evaluates the given SubL API-REQUEST at MASTER-CYC-HOST and MASTER-CYC-PORT.  This facility
     * assumes that only one remote connection will be used for duration of the gaf-gathering operation.
     */
    public static final SubLObject gg_remote_eval(SubLObject api_request, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        {
            SubLObject results_list = NIL;
            SubLObject augmented_api_request = list(PROGN, $list_alt262, list(MULTIPLE_VALUE_LIST, api_request));
            if (NIL == $gg_master_remote_image_connection$.getGlobalValue()) {
                $gg_master_remote_image_connection$.setGlobalValue(remote_image.new_remote_image_connection(remote_image.new_remote_image(master_cyc_host, master_cyc_port, UNPROVIDED)));
                remote_image.open_remote_image_connection($gg_master_remote_image_connection$.getGlobalValue());
            }
            results_list = remote_image.remote_image_connection_eval($gg_master_remote_image_connection$.getGlobalValue(), augmented_api_request);
            return subl_promotions.values_list(results_list);
        }
    }

    /**
     * Closes the remote image connection to the master Cyc server for gaf-gathering.
     */
    public static final SubLObject gg_close_remote_image_connection() {
        if ((NIL != $gg_master_remote_image_connection$.getGlobalValue()) && (NIL != remote_image.remote_image_connection_openP($gg_master_remote_image_connection$.getGlobalValue()))) {
            remote_image.close_remote_image_connection($gg_master_remote_image_connection$.getGlobalValue());
        }
        $gg_master_remote_image_connection$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * How long to sleep at most before trying again, maximum.
     */
    // defparameter
    public static final SubLSymbol $ceiling_on_waiting_for_help$ = makeSymbol("*CEILING-ON-WAITING-FOR-HELP*");

    /**
     * How long to sleep at least before trying again, minimum.
     */
    // defparameter
    public static final SubLSymbol $floor_on_waiting_for_help$ = makeSymbol("*FLOOR-ON-WAITING-FOR-HELP*");

    public static final SubLObject floor_on_waiting_for_help() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $floor_on_waiting_for_help$.getDynamicValue(thread);
        }
    }

    /**
     * How much to multiply the wait by (always less than *ceiling-on-waiting-for-help*)
     */
    // defparameter
    public static final SubLSymbol $escalation_factor_when_waiting_for_help$ = makeSymbol("*ESCALATION-FACTOR-WHEN-WAITING-FOR-HELP*");

    /**
     * Returns the new current wait time after a Google server timeout, after adjusting with the escalation factor.
     */
    public static final SubLObject escalate_wait_time_between_searches(SubLObject current_wait) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return min(floor(multiply(current_wait, $escalation_factor_when_waiting_for_help$.getDynamicValue(thread)), UNPROVIDED), $ceiling_on_waiting_for_help$.getDynamicValue(thread));
        }
    }

    /**
     * Returns the new current wait time after a Google server timeout, after adjusting with the de-escalation factor.
     */
    public static final SubLObject de_escalate_wait_time_between_searches(SubLObject current_wait) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_wait = divide(current_wait, $escalation_factor_when_waiting_for_help$.getDynamicValue(thread));
                return max(new_wait, floor_on_waiting_for_help());
            }
        }
    }

    /**
     * references the process which monitors the gaf-gathering worker.
     */
    // deflexical
    private static final SubLSymbol $gg_worker_monitor$ = makeSymbol("*GG-WORKER-MONITOR*");

    /**
     * the indicator that when NIL, instructs the worker monitor to end
     */
    // deflexical
    private static final SubLSymbol $gg_worker_monitor_keep_goingP$ = makeSymbol("*GG-WORKER-MONITOR-KEEP-GOING?*");

    /**
     * Initialize the process which monitors the gaf-gathering worker.
     */
    public static final SubLObject initialize_gaf_gathering_worker_monitor() {
        if (NIL != $gg_worker_monitor$.getGlobalValue()) {
            $gg_worker_monitor_keep_goingP$.setGlobalValue(NIL);
            sleep(TEN_INTEGER);
        }
        $gg_worker_monitor_keep_goingP$.setGlobalValue(T);
        $gg_worker_monitor$.setGlobalValue(make_process($str_alt265$GAF_gathering_worker_monitor, symbol_function(GG_WORKER_MONITOR)));
        return NIL;
    }

    /**
     * the universal time at which the gaf-gathering worker last requested a partial-gaf
     * for processing from the master Cyc image.
     */
    // deflexical
    private static final SubLSymbol $gg_last_time_worker_known_alive$ = makeSymbol("*GG-LAST-TIME-WORKER-KNOWN-ALIVE*");

    /**
     * Indicates to the gaf-gathering worker monitor that the process is still alive.
     */
    public static final SubLObject gg_indicate_that_process_is_alive() {
        $gg_last_time_worker_known_alive$.setGlobalValue(get_universal_time());
        return NIL;
    }

    /**
     * the timeout beyond which the gaf-gathering worker is deemed un-responsive, which must be
     * greater than the other timeouts specified for this process
     * (e.g. *ceiling-on-waiting-for-help*, *gg-google-license-usage-reset-wait-seconds*
     */
    // defconstant
    private static final SubLSymbol $gg_worker_monitor_timeout_seconds$ = makeSymbol("*GG-WORKER-MONITOR-TIMEOUT-SECONDS*");

    /**
     * This process monitors the gaf-gathering worker.  Periodically it wakes up and
     * checks if the gaf-gathering worker is non-responsive.  If so, it quits this application.
     * It is expected that the shell script that launched this application will then launch
     * another instance.
     */
    public static final SubLObject gg_worker_monitor() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $gg_status_message_stream$.currentBinding(thread);
                try {
                    $gg_status_message_stream$.bind(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
                    $gg_last_time_worker_known_alive$.setGlobalValue(get_universal_time());
                    while (NIL != $gg_worker_monitor_keep_goingP$.getGlobalValue()) {
                        if (subl_promotions.elapsed_universal_time($gg_last_time_worker_known_alive$.getGlobalValue(), UNPROVIDED).numG($gg_worker_monitor_timeout_seconds$.getGlobalValue())) {
                            write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            format($gg_status_message_stream$.getDynamicValue(thread), $str_alt268$____gaf_gathering_worker_appears_);
                            force_output($gg_status_message_stream$.getDynamicValue(thread));
                            Processes.exit(UNPROVIDED);
                        }
                        sleep($int$30);
                    } 
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt43$_, $gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format($gg_status_message_stream$.getDynamicValue(thread), $str_alt269$Exiting_monitor__);
                    force_output($gg_status_message_stream$.getDynamicValue(thread));
                } finally {
                    $gg_status_message_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Outputs the Named Entity Recognition file descriptive header.
     */
    public static final SubLObject possibly_print_ner_output_header() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $gg_ner_output_include_explanatory_headerP$.getDynamicValue(thread)) && (NIL != file_utilities.stream_designator_p($gg_filestream_for_ner_output$.getDynamicValue(thread)))) {
                format($gg_filestream_for_ner_output$.getDynamicValue(thread), $str_alt270$____This_is_a_file_of_GAF_generat, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), system_info.cyc_revision_string());
                force_output($gg_filestream_for_ner_output$.getDynamicValue(thread));
                return T;
            }
            return NIL;
        }
    }



    public static final SubLObject with_gaf_gathering_log_file(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt271);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt271);
                    filename = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($gaf_gathering_log_file$, filename)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt271);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Add assertions in MT by getting CycL terms for the DEFINITIONS and then
     * binding them to the variable in PARTIAL-GAF.
     *
     * @param PARTIAL-GAF
     * 		el-sentence-p; e.g. (#$titleOfPerson #$YassirArafat ?T)
     * @param DEFINITIONS
     * 		listp; list of strings, e.g. ("Mr" ...)
     * @param MT;
     * 		microtheory in which the assertions would be made.
     */
    public static final SubLObject add_gafs_using_definitions(SubLObject partial_gaf, SubLObject definitions, SubLObject mt) {
        SubLTrampolineFile.checkType(partial_gaf, EL_SENTENCE_P);
        SubLTrampolineFile.checkType(definitions, LISTP);
        SubLTrampolineFile.checkType(mt, $sym57$ISA_MT_);
        {
            SubLObject var_pos = variable_position_in_gaf(partial_gaf);
            SubLObject cdolist_list_var = definitions;
            SubLObject definition = NIL;
            for (definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definition = cdolist_list_var.first()) {
                {
                    SubLObject ans_cycls = cycl_terms_for_answer_string($str_alt135$, definition, partial_gaf, $FORWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_59 = ans_cycls;
                    SubLObject ans_cycl = NIL;
                    for (ans_cycl = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , ans_cycl = cdolist_list_var_59.first()) {
                        {
                            SubLObject completed_gaf = el_utilities.replace_formula_arg(var_pos, ans_cycl, partial_gaf);
                            if (NIL != rkf_query_utilities.rkf_known(completed_gaf, mt, UNPROVIDED)) {
                                Errors.warn($str_alt273$_S___We_already_knew_that__but_st, completed_gaf);
                                gaf_generation_assert(completed_gaf, mt);
                                gaf_generation_assert(list(gg_meta_assert_predicate(), list($$ist, mt, completed_gaf), var_pos, definition), mt);
                            } else
                                if (NIL != rkf_contradiction_finder.rkf_rejected(completed_gaf, mt, UNPROVIDED, UNPROVIDED)) {
                                    Errors.warn($str_alt275$_S___Won_t_assert__we_can_prove_o, completed_gaf);
                                } else {
                                    gaf_generation_assert(completed_gaf, mt);
                                    gaf_generation_assert(list(gg_meta_assert_predicate(), list($$ist, mt, completed_gaf), var_pos, definition), mt);
                                }

                        }
                    }
                }
            }
        }
        return partial_gaf;
    }

    /**
     * Add assertions in MT by completing PARTIAL-GAF using all possible bindings
     * and then verifying them using Web search.
     *
     * @param PARTIAL-GAF
     * 		el-sentence-p; e.g. (#$maritalStatus #$YassirArafat ?X)
     * @param MT;
     * 		microtheory in which the assertions would be made.
     */
    public static final SubLObject add_gafs_using_web_verification(SubLObject partial_gaf, SubLObject mt) {
        SubLTrampolineFile.checkType(partial_gaf, EL_SENTENCE_P);
        SubLTrampolineFile.checkType(mt, $sym57$ISA_MT_);
        {
            SubLObject var_pos = variable_position_in_gaf(partial_gaf);
            SubLObject completed_gafs = gg_completed_gafs_for_verification(partial_gaf);
            SubLObject done = NIL;
            SubLObject cdolist_list_var = completed_gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                if (NIL == done) {
                    {
                        SubLObject csome_list_var = search_strings(gaf, UNPROVIDED);
                        SubLObject search_string = NIL;
                        for (search_string = csome_list_var.first(); !((NIL != done) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , search_string = csome_list_var.first()) {
                            if (gg_google_count(string_utilities.quote_string(search_string, UNPROVIDED)).numG(ZERO_INTEGER)) {
                                if (NIL != rkf_query_utilities.rkf_known(gaf, mt, UNPROVIDED)) {
                                    Errors.warn($str_alt273$_S___We_already_knew_that__but_st, gaf);
                                    gaf_generation_assert(gaf, mt);
                                    gaf_generation_assert(list(gg_meta_assert_predicate(), list($$ist, mt, gaf), var_pos, search_string), mt);
                                } else
                                    if (NIL != rkf_contradiction_finder.rkf_rejected(gaf, mt, UNPROVIDED, UNPROVIDED)) {
                                        Errors.warn($str_alt275$_S___Won_t_assert__we_can_prove_o, gaf);
                                    } else {
                                        gaf_generation_assert(gaf, mt);
                                        gaf_generation_assert(list(gg_meta_assert_predicate(), list($$ist, mt, gaf), var_pos, search_string), mt);
                                    }

                                done = T;
                            }
                        }
                    }
                }
            }
        }
        return partial_gaf;
    }

    /**
     * Returns an appropriate list of instances of #$LinguisticTranslationProcess.
     */
    public static final SubLObject translations_in_butler_spindle(SubLObject length_ans_cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject translations = ask_utilities.query_variable($sym70$_X, $list_alt276, $$UniversalVocabularyMt, UNPROVIDED);
                SubLObject number_of_translations = length(translations);
                if (number_of_translations.numG(length_ans_cycls)) {
                    return subseq(translations, ZERO_INTEGER, length_ans_cycls);
                }
                {
                    SubLObject cdotimes_end_var = subtract(length_ans_cycls, number_of_translations);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject translation = cconcatenate($str_alt278$Translation_, format_nil.format_nil_a_no_copy(add(number_of_translations, i)));
                            {
                                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                try {
                                    api_control_vars.$the_cyclist$.bind($$BUTLERAgent, thread);
                                    translation = rkf_term_utilities.create_new_constant(translation, $list_alt279, NIL, $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                                }
                            }
                            assert_in_butler_spindle(list($$subEvents, $$ButlerProject, translation));
                            {
                                SubLObject item_var = translation;
                                if (NIL == member(item_var, translations, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    translations = cons(item_var, translations);
                                }
                            }
                        }
                    }
                }
                return translations;
            }
        }
    }

    public static final SubLObject assert_mt_in_butler_spindle(SubLObject uri, SubLObject translation) {
        {
            SubLObject content_mt_constant = constants_high.find_constant_by_guid(Guids.string_to_guid($str_alt282$b9e43052_3402_41d9_85b1_eca8cb50c));
            SubLObject content_mt = list(content_mt_constant, list($$URLReferentFn, uri), translation);
            gaf_generation_assert(listS($$isa, content_mt, $list_alt283), $$UniversalVocabularyMt);
            assert_in_butler_spindle(list($$mtSpindleMember, $$MachineLearningMtSpindle, content_mt));
            return content_mt;
        }
    }

    public static final SubLObject assert_in_butler_spindle(SubLObject formula) {
        gaf_generation_assert(formula, $$MachineLearningSpindleHeadMt);
        return T;
    }

    public static final SubLObject gaf_generation_assert(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind($$BUTLERAgent, thread);
                        result = rkf_assertion_utilities.rkf_assert_with_implicature(formula, mt, $NOW);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject disambiguations_for_gaf_arguments(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject disambiguation_results = NIL;
                SubLObject unambiguous_results = NIL;
                SubLObject cdolist_list_var = cycl_utilities.formula_args(gaf, UNPROVIDED);
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    {
                        SubLObject big_list = pph_methods_lexicon.all_phrases_for_term(arg, cconcatenate(lexicon_accessors.all_speech_part_preds(UNPROVIDED), pph_vars.$pph_name_string_preds$.getDynamicValue(thread)), $list_alt288, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject small_list = pph_methods_lexicon.all_phrases_for_term(arg, list_utilities.remove_objects_from_list($search_strings_requiring_strict_verification$.getDynamicValue(thread), cconcatenate(lexicon_accessors.all_speech_part_preds(UNPROVIDED), pph_vars.$pph_name_string_preds$.getDynamicValue(thread)), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject need_better_verification = set_difference(big_list, small_list, symbol_function(EQUALP), UNPROVIDED);
                        SubLObject dont_need_better_verification = intersection(big_list, small_list, symbol_function(EQUALP), UNPROVIDED);
                        if (NIL != need_better_verification) {
                            unambiguous_results = cconcatenate(unambiguous_results, dont_need_better_verification);
                            eval_in_api.trace_me(big_list, small_list, need_better_verification, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var_60 = need_better_verification;
                                SubLObject string_to_verify = NIL;
                                for (string_to_verify = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , string_to_verify = cdolist_list_var_60.first()) {
                                    if (NIL != inference_kernel.new_cyc_query(list($$or, list($$termPhrases, arg, $$familyName, string_to_verify), list($$termPhrases, arg, $$lastName, string_to_verify)), $$InferencePSC, UNPROVIDED)) {
                                        disambiguation_results = acons(string_to_verify, pph_main.generate_phrase(arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), disambiguation_results);
                                    } else {
                                        {
                                            SubLObject disambiguating_term = search_disambiguating_term(intersection(big_list, small_list, symbol_function(EQUALP), UNPROVIDED), string_to_verify);
                                            disambiguation_results = acons(string_to_verify, disambiguating_term, disambiguation_results);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(disambiguation_results, unambiguous_results);
            }
        }
    }

    public static final SubLObject search_disambiguating_term(SubLObject search_terms, SubLObject forbidden_term) {
        {
            SubLObject min = $int$1000000000;
            SubLObject result = NIL;
            SubLObject search_tokens = NIL;
            {
                SubLObject cdolist_list_var = search_terms;
                SubLObject search_term = NIL;
                for (search_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_term = cdolist_list_var.first()) {
                    search_tokens = union(search_tokens, rkf_concept_harvester.rkf_ch_string_tokenize(search_term), UNPROVIDED, UNPROVIDED);
                }
            }
            {
                SubLObject cdolist_list_var = search_tokens;
                SubLObject search_token = NIL;
                for (search_token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_token = cdolist_list_var.first()) {
                    if (!search_token.equalp(forbidden_term)) {
                        {
                            SubLObject count = gg_google_count(search_token);
                            if ((NIL != subl_promotions.positive_integer_p(count)) && count.numL(min)) {
                                result = search_token;
                                min = count;
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject verify_gaf_via_web(SubLObject gaf) {
        {
            SubLObject hits = ZERO_INTEGER;
            SubLObject cdolist_list_var = search_strings_for_verification(gaf);
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject pph_mt = NIL;
                    SubLObject search_strings = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt233);
                    pph_mt = current.first();
                    current = current.rest();
                    search_strings = current;
                    {
                        SubLObject cdolist_list_var_61 = search_strings;
                        SubLObject search_string = NIL;
                        for (search_string = cdolist_list_var_61.first(); NIL != cdolist_list_var_61; cdolist_list_var_61 = cdolist_list_var_61.rest() , search_string = cdolist_list_var_61.first()) {
                            {
                                SubLObject count = gg_google_count(search_string);
                                hits = add(hits, count);
                            }
                        }
                    }
                }
            }
            return hits;
        }
    }

    /**
     * Gather certain metrics related to GAF-gathering.
     * IN-FILE is the input file that contains an incomplete GAF on each line.
     * The summary of the GAF-gathering session is written out to OUT-STREAM1.
     * All the GAF-gathering results are written out to OUT-STREAM2.
     */
    public static final SubLObject gg_metrics(SubLObject in_file, SubLObject out_stream1, SubLObject out_stream2) {
        if (out_stream1 == UNPROVIDED) {
            out_stream1 = T;
        }
        if (out_stream2 == UNPROVIDED) {
            out_stream2 = NIL;
        }
        {
            SubLObject num_partial_gafs = ZERO_INTEGER;
            SubLObject num_search_strings = ZERO_INTEGER;
            SubLObject num_search_engine_results = ZERO_INTEGER;
            SubLObject num_ans_strings = ZERO_INTEGER;
            SubLObject num_cycls = ZERO_INTEGER;
            SubLObject time_gg_metrics = NIL;
            SubLObject time_search_strings = NIL;
            SubLObject time_search_engine_results = NIL;
            SubLObject time_process_search_results = NIL;
            SubLObject time_var = get_internal_real_time();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(in_file, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt36$Unable_to_open__S, in_file);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject partial_gaf_string = NIL;
                                for (partial_gaf_string = read_line(infile, NIL, NIL, UNPROVIDED); NIL != partial_gaf_string; partial_gaf_string = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    {
                                        SubLObject partial_gaf = read_from_string(partial_gaf_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject results = list(partial_gaf);
                                        SubLObject search_strings = NIL;
                                        num_partial_gafs = number_utilities.f_1X(num_partial_gafs);
                                        {
                                            SubLObject time_var_62 = get_internal_real_time();
                                            search_strings = search_strings(partial_gaf, UNPROVIDED);
                                            time_search_strings = divide(subtract(get_internal_real_time(), time_var_62), time_high.$internal_time_units_per_second$.getGlobalValue());
                                        }
                                        num_search_strings = add(num_search_strings, length(search_strings));
                                        {
                                            SubLObject time_var_63 = get_internal_real_time();
                                            {
                                                SubLObject cdolist_list_var = search_strings;
                                                SubLObject search_string = NIL;
                                                for (search_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string = cdolist_list_var.first()) {
                                                    results = cons(search_string, results);
                                                    {
                                                        SubLObject mode = mode_to_parse_answer(search_string);
                                                        SubLObject search_engine_results = NIL;
                                                        SubLObject ans_string_cycls_pairs = NIL;
                                                        SubLObject time_var_64 = get_internal_real_time();
                                                        search_engine_results = search_engine_results(massage_search_string(search_string), UNPROVIDED, UNPROVIDED);
                                                        time_search_engine_results = divide(subtract(get_internal_real_time(), time_var_64), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                        num_search_engine_results = add(num_search_engine_results, length(search_engine_results));
                                                        {
                                                            SubLObject cdolist_list_var_65 = search_engine_results;
                                                            SubLObject search_engine_result = NIL;
                                                            for (search_engine_result = cdolist_list_var_65.first(); NIL != cdolist_list_var_65; cdolist_list_var_65 = cdolist_list_var_65.rest() , search_engine_result = cdolist_list_var_65.first()) {
                                                                {
                                                                    SubLObject ans_text = search_engine_result.first();
                                                                    SubLObject modified_search_string = string_utilities.remove_substring(search_string, $str_alt295$_);
                                                                    SubLObject ans_string_tuples = (NIL != is_valid_raw_answer_stringP(ans_text)) ? ((SubLObject) (massage_answer_string(ans_text, modified_search_string, mode))) : NIL;
                                                                    num_ans_strings = add(num_ans_strings, length(ans_string_tuples));
                                                                    {
                                                                        SubLObject cdolist_list_var_66 = ans_string_tuples;
                                                                        SubLObject ans_string_tuple = NIL;
                                                                        for (ans_string_tuple = cdolist_list_var_66.first(); NIL != cdolist_list_var_66; cdolist_list_var_66 = cdolist_list_var_66.rest() , ans_string_tuple = cdolist_list_var_66.first()) {
                                                                            {
                                                                                SubLObject ans_string = ans_string_tuple.first();
                                                                                SubLObject ans_cycls = cycl_terms_for_answer_string(modified_search_string, ans_string, partial_gaf, mode, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                num_cycls = add(num_cycls, length(ans_cycls));
                                                                                ans_string_cycls_pairs = cons(list(ans_string, ans_cycls), ans_string_cycls_pairs);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        results = cons(ans_string_cycls_pairs, results);
                                                    }
                                                }
                                            }
                                            time_process_search_results = divide(subtract(get_internal_real_time(), time_var_63), time_high.$internal_time_units_per_second$.getGlobalValue());
                                        }
                                        if (NIL != out_stream2) {
                                            format(out_stream2, $str_alt296$_A__, reverse(results));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            time_gg_metrics = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            term_learner.write_metrics(list(new SubLObject[]{ numeric_date_utilities.universal_timestring(UNPROVIDED), in_file, time_gg_metrics, num_partial_gafs, num_search_strings, time_search_strings, num_search_engine_results, time_search_engine_results, num_ans_strings, num_cycls, time_process_search_results }), out_stream1);
            return time_gg_metrics;
        }
    }

    public static final SubLObject gg_metrics_definitions(SubLObject in_file, SubLObject out_stream1, SubLObject out_stream2) {
        if (out_stream1 == UNPROVIDED) {
            out_stream1 = T;
        }
        if (out_stream2 == UNPROVIDED) {
            out_stream2 = NIL;
        }
        {
            SubLObject num_partial_gafs = ZERO_INTEGER;
            SubLObject num_def_strings = ZERO_INTEGER;
            SubLObject num_cycls = ZERO_INTEGER;
            SubLObject time_gg_metrics_defns = NIL;
            SubLObject time_var = get_internal_real_time();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(in_file, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt36$Unable_to_open__S, in_file);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject in_string = NIL;
                                for (in_string = read_line(infile, NIL, NIL, UNPROVIDED); NIL != in_string; in_string = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    {
                                        SubLObject in_list = read_from_string(in_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject partial_gaf = in_list.first();
                                        SubLObject def_strings = second(in_list);
                                        SubLObject results = list(partial_gaf);
                                        SubLObject def_string_cycls_pairs = NIL;
                                        num_partial_gafs = number_utilities.f_1X(num_partial_gafs);
                                        num_def_strings = add(num_def_strings, length(def_strings));
                                        {
                                            SubLObject cdolist_list_var = def_strings;
                                            SubLObject def_string = NIL;
                                            for (def_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , def_string = cdolist_list_var.first()) {
                                                {
                                                    SubLObject ans_cycls = cycl_terms_for_answer_string($str_alt135$, def_string, partial_gaf, $FORWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    num_cycls = add(num_cycls, length(ans_cycls));
                                                    def_string_cycls_pairs = cons(list(def_string, ans_cycls), def_string_cycls_pairs);
                                                }
                                            }
                                        }
                                        results = cons(def_string_cycls_pairs, results);
                                        if (NIL != out_stream2) {
                                            format(out_stream2, $str_alt297$_S__, reverse(results));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            time_gg_metrics_defns = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            term_learner.write_metrics(list(numeric_date_utilities.universal_timestring(UNPROVIDED), in_file, time_gg_metrics_defns, num_partial_gafs, num_def_strings, num_cycls), out_stream1);
            return time_gg_metrics_defns;
        }
    }

    public static final SubLObject gg_metrics_web_verification(SubLObject in_file, SubLObject out_stream1, SubLObject out_stream2) {
        if (out_stream1 == UNPROVIDED) {
            out_stream1 = T;
        }
        if (out_stream2 == UNPROVIDED) {
            out_stream2 = NIL;
        }
        {
            SubLObject num_partial_gafs = ZERO_INTEGER;
            SubLObject num_completed_gafs = ZERO_INTEGER;
            SubLObject num_search_strings = ZERO_INTEGER;
            SubLObject num_verified_gafs = ZERO_INTEGER;
            SubLObject time_gg_metrics_web_verifn = NIL;
            SubLObject time_var = get_internal_real_time();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(in_file, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt36$Unable_to_open__S, in_file);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject partial_gaf_string = NIL;
                                for (partial_gaf_string = read_line(infile, NIL, NIL, UNPROVIDED); NIL != partial_gaf_string; partial_gaf_string = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    {
                                        SubLObject partial_gaf = read_from_string(partial_gaf_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject completed_gafs = gg_completed_gafs_for_verification(partial_gaf);
                                        SubLObject results = list(partial_gaf);
                                        SubLObject gaf_search_strings_pairs = NIL;
                                        SubLObject verified_gaf_search_string_pairs = NIL;
                                        num_partial_gafs = number_utilities.f_1X(num_partial_gafs);
                                        num_completed_gafs = add(num_completed_gafs, length(completed_gafs));
                                        {
                                            SubLObject cdolist_list_var = completed_gafs;
                                            SubLObject gaf = NIL;
                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                {
                                                    SubLObject search_strings = search_strings(gaf, UNPROVIDED);
                                                    num_search_strings = add(num_search_strings, length(search_strings));
                                                    gaf_search_strings_pairs = cons(list(gaf, search_strings), gaf_search_strings_pairs);
                                                    {
                                                        SubLObject cdolist_list_var_67 = search_strings;
                                                        SubLObject search_string = NIL;
                                                        for (search_string = cdolist_list_var_67.first(); NIL != cdolist_list_var_67; cdolist_list_var_67 = cdolist_list_var_67.rest() , search_string = cdolist_list_var_67.first()) {
                                                            if (gg_google_count(string_utilities.quote_string(search_string, UNPROVIDED)).numG(ZERO_INTEGER)) {
                                                                num_verified_gafs = number_utilities.f_1X(num_verified_gafs);
                                                                verified_gaf_search_string_pairs = cons(list(gaf, search_string), verified_gaf_search_string_pairs);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        results = cons(gaf_search_strings_pairs, results);
                                        results = cons(verified_gaf_search_string_pairs, results);
                                        if (NIL != out_stream2) {
                                            format(out_stream2, $str_alt297$_S__, reverse(results));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            time_gg_metrics_web_verifn = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            term_learner.write_metrics(list(numeric_date_utilities.universal_timestring(UNPROVIDED), in_file, time_gg_metrics_web_verifn, num_partial_gafs, num_completed_gafs, num_search_strings, num_verified_gafs), out_stream1);
            return time_gg_metrics_web_verifn;
        }
    }

    public static final SubLObject declare_generate_gafs_file() {
        declareMacro("gg_status_message", "GG-STATUS-MESSAGE");
        declareFunction("google_stop_words_unofficial", "GOOGLE-STOP-WORDS-UNOFFICIAL", 0, 0, false);
        declareFunction("kag_print_function_trampoline", "KAG-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kag_p", "KAG-P", 1, 0, false);
        new generate_gafs.$kag_p$UnaryFunction();
        declareFunction("kag_focus", "KAG-FOCUS", 1, 0, false);
        declareFunction("kag_constraining_col", "KAG-CONSTRAINING-COL", 1, 0, false);
        declareFunction("kag_fact_gathering_process", "KAG-FACT-GATHERING-PROCESS", 1, 0, false);
        declareFunction("kag_psg_methods", "KAG-PSG-METHODS", 1, 0, false);
        declareFunction("_csetf_kag_focus", "_CSETF-KAG-FOCUS", 2, 0, false);
        declareFunction("_csetf_kag_constraining_col", "_CSETF-KAG-CONSTRAINING-COL", 2, 0, false);
        declareFunction("_csetf_kag_fact_gathering_process", "_CSETF-KAG-FACT-GATHERING-PROCESS", 2, 0, false);
        declareFunction("_csetf_kag_psg_methods", "_CSETF-KAG-PSG-METHODS", 2, 0, false);
        declareFunction("make_kag", "MAKE-KAG", 0, 1, false);
        declareFunction("new_kag", "NEW-KAG", 1, 3, false);
        declareFunction("print_kag", "PRINT-KAG", 3, 0, false);
        declareFunction("process_next_kags", "PROCESS-NEXT-KAGS", 0, 3, false);
        declareFunction("process_next_kags_int", "PROCESS-NEXT-KAGS-INT", 4, 0, false);
        declareFunction("gaf_gathering_paraphrase_mt", "GAF-GATHERING-PARAPHRASE-MT", 0, 0, false);
        declareFunction("process_next_kag", "PROCESS-NEXT-KAG", 2, 0, false);
        declareFunction("add_gafs_using_text_corpus_for_kag", "ADD-GAFS-USING-TEXT-CORPUS-FOR-KAG", 1, 4, false);
        declareFunction("add_gafs_using_text_corpus", "ADD-GAFS-USING-TEXT-CORPUS", 1, 3, false);
        declareFunction("gg_kags_for_kbq_col", "GG-KAGS-FOR-KBQ-COL", 3, 0, false);
        declareFunction("gather_facts_about_term_kag", "GATHER-FACTS-ABOUT-TERM-KAG", 1, 4, false);
        declareFunction("gather_facts_about_term", "GATHER-FACTS-ABOUT-TERM", 1, 3, false);
        declareFunction("add_gafs_for_search_strings", "ADD-GAFS-FOR-SEARCH-STRINGS", 2, 3, false);
        declareFunction("add_gafs_for_search_string", "ADD-GAFS-FOR-SEARCH-STRING", 2, 3, false);
        declareFunction("add_gafs_for_search_results", "ADD-GAFS-FOR-SEARCH-RESULTS", 5, 3, false);
        declareFunction("process_one_search_engine_result", "PROCESS-ONE-SEARCH-ENGINE-RESULT", 5, 3, false);
        declareFunction("add_gafs_for_filler_string_tuple", "ADD-GAFS-FOR-FILLER-STRING-TUPLE", 12, 0, false);
        declareFunction("search_result_splits_known_concept", "SEARCH-RESULT-SPLITS-KNOWN-CONCEPT", 2, 0, false);
        declareFunction("tokenize_fact_gathering_string", "TOKENIZE-FACT-GATHERING-STRING", 1, 0, false);
        declareFunction("maybe_add_completed_gaf", "MAYBE-ADD-COMPLETED-GAF", 11, 0, false);
        declareFunction("new_gg_confirmation_id", "NEW-GG-CONFIRMATION-ID", 1, 0, false);
        declareFunction("get_gg_isg", "GET-GG-ISG", 1, 0, false);
        declareFunction("cycl_terms_for_answer_string", "CYCL-TERMS-FOR-ANSWER-STRING", 4, 3, false);
        declareFunction("gg_words_for_ans_string", "GG-WORDS-FOR-ANS-STRING", 2, 0, false);
        declareFunction("get_fact_gathering_lexicon", "GET-FACT-GATHERING-LEXICON", 0, 0, false);
        declareFunction("gg_get_constrained_cycl_for_string", "GG-GET-CONSTRAINED-CYCL-FOR-STRING", 6, 0, false);
        declareFunction("variable_position_in_gaf", "VARIABLE-POSITION-IN-GAF", 1, 0, false);
        declareFunction("mode_to_parse_answer", "MODE-TO-PARSE-ANSWER", 1, 0, false);
        declareFunction("remove_initial_stop_words", "REMOVE-INITIAL-STOP-WORDS", 1, 0, false);
        declareFunction("search_strings", "SEARCH-STRINGS", 1, 1, false);
        declareFunction("massage_search_string", "MASSAGE-SEARCH-STRING", 1, 0, false);
        declareFunction("search_engine_results", "SEARCH-ENGINE-RESULTS", 1, 2, false);
        declareFunction("parse_search_engine_result_set", "PARSE-SEARCH-ENGINE-RESULT-SET", 1, 0, false);
        declareFunction("is_valid_raw_answer_stringP", "IS-VALID-RAW-ANSWER-STRING?", 1, 0, false);
        declareFunction("constituents_of_answer_text", "CONSTITUENTS-OF-ANSWER-TEXT", 1, 0, false);
        declareFunction("constraining_collection_for_variable", "CONSTRAINING-COLLECTION-FOR-VARIABLE", 2, 0, false);
        declareFunction("clear_given_name_preds", "CLEAR-GIVEN-NAME-PREDS", 0, 0, false);
        declareFunction("remove_given_name_preds", "REMOVE-GIVEN-NAME-PREDS", 0, 0, false);
        declareFunction("given_name_preds_internal", "GIVEN-NAME-PREDS-INTERNAL", 0, 0, false);
        declareFunction("given_name_preds", "GIVEN-NAME-PREDS", 0, 0, false);
        declareFunction("given_nameP", "GIVEN-NAME?", 1, 0, false);
        declareFunction("gg_finalize_geographical_skses_registration", "GG-FINALIZE-GEOGRAPHICAL-SKSES-REGISTRATION", 0, 0, false);
        declareFunction("gg_ensure_geographical_skses_registered", "GG-ENSURE-GEOGRAPHICAL-SKSES-REGISTERED", 0, 0, false);
        declareFunction("clear_gg_verification_for_place_naut", "CLEAR-GG-VERIFICATION-FOR-PLACE-NAUT", 0, 0, false);
        declareFunction("remove_gg_verification_for_place_naut", "REMOVE-GG-VERIFICATION-FOR-PLACE-NAUT", 1, 0, false);
        declareFunction("gg_verification_for_place_naut_internal", "GG-VERIFICATION-FOR-PLACE-NAUT-INTERNAL", 1, 0, false);
        declareFunction("gg_verification_for_place_naut", "GG-VERIFICATION-FOR-PLACE-NAUT", 1, 0, false);
        declareFunction("gg_valid_nautP", "GG-VALID-NAUT?", 2, 1, false);
        declareFunction("gg_is_person_without_last_nameP", "GG-IS-PERSON-WITHOUT-LAST-NAME?", 2, 0, false);
        declareFunction("gg_find_cycl", "GG-FIND-CYCL", 7, 0, false);
        declareFunction("gg_assert", "GG-ASSERT", 1, 2, false);
        declareFunction("gg_create_unique", "GG-CREATE-UNIQUE", 1, 2, false);
        declareFunction("gg_assert_gaf_gathering", "GG-ASSERT-GAF-GATHERING", 0, 0, false);
        declareFunction("gg_assert_string_based_searching", "GG-ASSERT-STRING-BASED-SEARCHING", 0, 0, false);
        declareFunction("gg_assert_search_results_support", "GG-ASSERT-SEARCH-RESULTS-SUPPORT", 2, 2, false);
        declareFunction("gg_assert_obtaining_a_search_result", "GG-ASSERT-OBTAINING-A-SEARCH-RESULT", 0, 0, false);
        declareFunction("gg_assert_evinces_verified_gaf", "GG-ASSERT-EVINCES-VERIFIED-GAF", 3, 2, false);
        declareFunction("gg_assert_evinces_refutable_gaf", "GG-ASSERT-EVINCES-REFUTABLE-GAF", 3, 2, false);
        declareFunction("gg_assert_evinces_unverified_gaf", "GG-ASSERT-EVINCES-UNVERIFIED-GAF", 3, 2, false);
        declareFunction("gg_assert_evinces_known_gaf", "GG-ASSERT-EVINCES-KNOWN-GAF", 3, 2, false);
        declareFunction("massage_answer_string", "MASSAGE-ANSWER-STRING", 3, 0, false);
        declareFunction("gg_expand_coordinations", "GG-EXPAND-COORDINATIONS", 4, 0, false);
        declareFunction("gg_remove_backward_words", "GG-REMOVE-BACKWARD-WORDS", 1, 0, false);
        declareFunction("gg_remove_forward_words", "GG-REMOVE-FORWARD-WORDS", 1, 0, false);
        declareFunction("verify_gaf_via_web_fast", "VERIFY-GAF-VIA-WEB-FAST", 2, 2, false);
        declareFunction("verify_gaf_with_coordinated_phrase", "VERIFY-GAF-WITH-COORDINATED-PHRASE", 3, 2, false);
        declareFunction("verify_gaf_via_web_internal", "VERIFY-GAF-VIA-WEB-INTERNAL", 4, 0, false);
        declareFunction("verify_search_strings", "VERIFY-SEARCH-STRINGS", 4, 0, false);
        declareFunction("sort_verification_strings_by_similarity_to_search_string", "SORT-VERIFICATION-STRINGS-BY-SIMILARITY-TO-SEARCH-STRING", 2, 0, false);
        declareFunction("search_strings_for_verification", "SEARCH-STRINGS-FOR-VERIFICATION", 1, 0, false);
        declareFunction("strings_containing", "STRINGS-CONTAINING", 2, 0, false);
        declareFunction("string_contains_one_substring", "STRING-CONTAINS-ONE-SUBSTRING", 2, 0, false);
        declareFunction("clear_gg_google_count", "CLEAR-GG-GOOGLE-COUNT", 0, 0, false);
        declareFunction("remove_gg_google_count", "REMOVE-GG-GOOGLE-COUNT", 1, 0, false);
        declareFunction("gg_google_count_internal", "GG-GOOGLE-COUNT-INTERNAL", 1, 0, false);
        declareFunction("gg_google_count", "GG-GOOGLE-COUNT", 1, 0, false);
        declareFunction("gg_untrue_sentenceP", "GG-UNTRUE-SENTENCE?", 4, 0, false);
        declareFunction("gg_create_named_problem_store_for_refutation_queries", "GG-CREATE-NAMED-PROBLEM-STORE-FOR-REFUTATION-QUERIES", 0, 0, false);
        declareFunction("gg_refuted_gaf", "GG-REFUTED-GAF", 2, 0, false);
        declareFunction("clear_gg_refuted_gaf_int", "CLEAR-GG-REFUTED-GAF-INT", 0, 0, false);
        declareFunction("remove_gg_refuted_gaf_int", "REMOVE-GG-REFUTED-GAF-INT", 2, 0, false);
        declareFunction("gg_refuted_gaf_int_internal", "GG-REFUTED-GAF-INT-INTERNAL", 2, 0, false);
        declareFunction("gg_refuted_gaf_int", "GG-REFUTED-GAF-INT", 2, 0, false);
        declareFunction("gg_meta_assert_predicate", "GG-META-ASSERT-PREDICATE", 0, 0, false);
        declareFunction("gg_completed_gafs_for_verification", "GG-COMPLETED-GAFS-FOR-VERIFICATION", 1, 0, false);
        declareFunction("noun_learner_arg_isa_for_pred", "NOUN-LEARNER-ARG-ISA-FOR-PRED", 3, 0, false);
        declareFunction("noun_learner_arg_genls_for_pred", "NOUN-LEARNER-ARG-GENLS-FOR-PRED", 3, 0, false);
        declareFunction("google_server_upP", "GOOGLE-SERVER-UP?", 0, 0, false);
        declareFunction("google_server_timed_outP", "GOOGLE-SERVER-TIMED-OUT?", 0, 0, false);
        declareFunction("gg_remote_eval", "GG-REMOTE-EVAL", 3, 0, false);
        declareFunction("gg_close_remote_image_connection", "GG-CLOSE-REMOTE-IMAGE-CONNECTION", 0, 0, false);
        declareFunction("floor_on_waiting_for_help", "FLOOR-ON-WAITING-FOR-HELP", 0, 0, false);
        declareFunction("escalate_wait_time_between_searches", "ESCALATE-WAIT-TIME-BETWEEN-SEARCHES", 1, 0, false);
        declareFunction("de_escalate_wait_time_between_searches", "DE-ESCALATE-WAIT-TIME-BETWEEN-SEARCHES", 1, 0, false);
        declareFunction("initialize_gaf_gathering_worker_monitor", "INITIALIZE-GAF-GATHERING-WORKER-MONITOR", 0, 0, false);
        declareFunction("gg_indicate_that_process_is_alive", "GG-INDICATE-THAT-PROCESS-IS-ALIVE", 0, 0, false);
        declareFunction("gg_worker_monitor", "GG-WORKER-MONITOR", 0, 0, false);
        declareFunction("possibly_print_ner_output_header", "POSSIBLY-PRINT-NER-OUTPUT-HEADER", 0, 0, false);
        declareMacro("with_gaf_gathering_log_file", "WITH-GAF-GATHERING-LOG-FILE");
        declareFunction("add_gafs_using_definitions", "ADD-GAFS-USING-DEFINITIONS", 3, 0, false);
        declareFunction("add_gafs_using_web_verification", "ADD-GAFS-USING-WEB-VERIFICATION", 2, 0, false);
        declareFunction("translations_in_butler_spindle", "TRANSLATIONS-IN-BUTLER-SPINDLE", 1, 0, false);
        declareFunction("assert_mt_in_butler_spindle", "ASSERT-MT-IN-BUTLER-SPINDLE", 2, 0, false);
        declareFunction("assert_in_butler_spindle", "ASSERT-IN-BUTLER-SPINDLE", 1, 0, false);
        declareFunction("gaf_generation_assert", "GAF-GENERATION-ASSERT", 2, 0, false);
        declareFunction("disambiguations_for_gaf_arguments", "DISAMBIGUATIONS-FOR-GAF-ARGUMENTS", 1, 0, false);
        declareFunction("search_disambiguating_term", "SEARCH-DISAMBIGUATING-TERM", 2, 0, false);
        declareFunction("verify_gaf_via_web", "VERIFY-GAF-VIA-WEB", 1, 0, false);
        declareFunction("gg_metrics", "GG-METRICS", 1, 2, false);
        declareFunction("gg_metrics_definitions", "GG-METRICS-DEFINITIONS", 1, 2, false);
        declareFunction("gg_metrics_web_verification", "GG-METRICS-WEB-VERIFICATION", 1, 2, false);
        return NIL;
    }

    public static final SubLObject init_generate_gafs_file() {
        defparameter("*GG-ATTEMPT-UNKNOWN-TERMS*", NIL);
        defparameter("*GG-STATUS-MESSAGE-STREAM*", T);
        deflexical("*SPECIFIED-PREDICATES-FOR-NL-GATHERING*", NIL);
        deflexical("*GOOGLE-STOP-WORDS-UNOFFICIAL*", $list_alt7);
        deflexical("*GG-GEOGRAPHICAL-SKSES-REGISTERED*", NIL);
        defvar("*GG-OBSERVED-RAW-ANS-STRINGS*", NIL);
        deflexical("*GG-WITHIN-AN-EXPERIMENT?*", T);
        deflexical("*GG-DOMAIN-MT*", $$GAFGatheringExperimentLogMt);
        deflexical("*GG-COORDINATED-PHRASE-VERIFICATION?*", NIL);
        deflexical("*GG-FILENAME-FOR-NER-OUTPUT*", $str_alt9$_dev_null);
        defparameter("*GG-NER-OUTPUT-INCLUDE-EXPLANATORY-HEADER?*", T);
        defparameter("*GG-FILESTREAM-FOR-NER-OUTPUT*", $NONE);
        defconstant("*DTP-KAG*", KAG);
        deflexical("*GG-DONE?*", NIL);
        deflexical("*GG-CONTINUE-ON-CAUGHT-ERROR?*", T);
        defconstant("*GG-GOOGLE-API-LICENSE-DAILY-USAGE-LIMIT*", $int$10000);
        defconstant("*GG-GOOGLE-LICENSE-USAGE-RESET-WAIT-SECONDS*", $int$120);
        deflexical("*GG-TRIED-TO-VERIFY-GAFS-TABLE*", NIL);
        defparameter("*GG-CATCH-ERRORS?*", NIL);
        deflexical("*GAF-GATHERING-PARAPHRASE-MT*", $UNINITIALIZED);
        defparameter("*GAF-GATHERING-EVENT*", NIL);
        defparameter("*STRING-BASED-SEARCHING-EVENT*", NIL);
        defparameter("*OBTAINING-A-SEARCH-RESULT-EVENT*", NIL);
        deflexical("*GG-CONFIRMED-ISG*", NIL != boundp($gg_confirmed_isg$) ? ((SubLObject) ($gg_confirmed_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, NIL, ONE_INTEGER));
        deflexical("*GG-UNCONFIRMED-ISG*", NIL != boundp($gg_unconfirmed_isg$) ? ((SubLObject) ($gg_unconfirmed_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(MINUS_ONE_INTEGER, NIL, MINUS_ONE_INTEGER));
        defconstant("*GG-CONSTITUENT-PARSING-MIN-WORDS*", ELEVEN_INTEGER);
        defconstant("*GG-MAX-WORDS-IN-PHRASE-FOR-PARSING*", FIVE_INTEGER);
        defconstant("*GG-PARSING-TIMEOUT*", $int$30);
        defconstant("*GG-DOOMED-PHRASE-START-OR-END-WORDS*", $list_alt108);
        defparameter("*FACT-GATHERING-LEXICON*", NIL);
        defparameter("*SEARCH-STRINGS-REQUIRING-STRICT-VERIFICATION*", $list_alt132);
        defconstant("*SERVER-RETRY-LIMIT*", TEN_INTEGER);
        defconstant("*GG-DETERMINERS-TO-STRIP-FROM-CONSTITUTENT*", $list_alt143);
        deflexical("*GIVEN-NAME-PREDS-CACHING-STATE*", NIL);
        deflexical("*GG-VERIFICATION-FOR-PLACE-NAUT-CACHING-STATE*", NIL);
        deflexical("*MASSAGE-ANSWER-STRING-TRACE?*", NIL);
        defconstant("*GG-DOOMED-END-WORDS-IN-BACKWARD-MODE*", $list_alt228);
        defconstant("*GG-END-WORDS-TO-STRIP-IN-BACKWARD-MODE*", $list_alt229);
        defconstant("*GG-DOOMED-START-WORDS-IN-FORWARD-MODE*", $list_alt231);
        defconstant("*GG-START-WORDS-TO-STRIP-IN-FORWARD-MODE*", $list_alt232);
        defconstant("*GG-WEB-HIT-VERIFIED-GAF-THRESHOLD*", ZERO_INTEGER);
        deflexical("*GG-GOOGLE-COUNT-CACHING-STATE*", NIL);
        defconstant("*GG-UNTRUE-PREFIX-PHRASES*", $list_alt245);
        defconstant("*GG-UNTRUE-BETWEEN-PREFIX-PHRASES*", $list_alt246);
        defconstant("*GG-UNTRUE-SUFFIX-PHRASES*", $list_alt247);
        defconstant("*GG-REFUTATION-QUERY-PROPERTIES*", $list_alt248);
        defconstant("*GG-REFUTATION-PROBLEM-STORE-NAME*", $str_alt249$gg_refutation_problem_store_name);
        defparameter("*GG-REFUTATION-PROBLEM-STORE*", NIL);
        deflexical("*GG-REFUTED-GAF-INT-CACHING-STATE*", NIL);
        deflexical("*GG-MASTER-REMOTE-IMAGE-CONNECTION*", NIL);
        defparameter("*CEILING-ON-WAITING-FOR-HELP*", $int$300);
        defparameter("*FLOOR-ON-WAITING-FOR-HELP*", TWO_INTEGER);
        defparameter("*ESCALATION-FACTOR-WHEN-WAITING-FOR-HELP*", TWO_INTEGER);
        deflexical("*GG-WORKER-MONITOR*", NIL);
        deflexical("*GG-WORKER-MONITOR-KEEP-GOING?*", NIL);
        deflexical("*GG-LAST-TIME-WORKER-KNOWN-ALIVE*", NIL);
        defconstant("*GG-WORKER-MONITOR-TIMEOUT-SECONDS*", $int$600);
        defparameter("*GAF-GATHERING-LOG-FILE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_generate_gafs_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_kag$.getGlobalValue(), symbol_function(KAG_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(KAG_FOCUS, _CSETF_KAG_FOCUS);
        def_csetf(KAG_CONSTRAINING_COL, _CSETF_KAG_CONSTRAINING_COL);
        def_csetf(KAG_FACT_GATHERING_PROCESS, _CSETF_KAG_FACT_GATHERING_PROCESS);
        def_csetf(KAG_PSG_METHODS, _CSETF_KAG_PSG_METHODS);
        identity(KAG);
        subl_macro_promotions.declare_defglobal($gg_confirmed_isg$);
        subl_macro_promotions.declare_defglobal($gg_unconfirmed_isg$);
        memoization_state.note_globally_cached_function(GIVEN_NAME_PREDS);
        memoization_state.note_globally_cached_function(GG_VERIFICATION_FOR_PLACE_NAUT);
        memoization_state.note_globally_cached_function(GG_GOOGLE_COUNT);
        memoization_state.note_globally_cached_function(GG_REFUTED_GAF_INT);
        generic_testing.define_test_case_table_int(SEARCH_RESULT_SPLITS_KNOWN_CONCEPT, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt306);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("MESSAGE-FORMAT"), makeSymbol("&REST"), makeSymbol("ARGS"));



    static private final SubLList $list_alt2 = list(makeSymbol("WRITE-STRING"), list(makeSymbol("TIMESTRING")), makeSymbol("*GG-STATUS-MESSAGE-STREAM*"));

    static private final SubLList $list_alt3 = list(makeSymbol("WRITE-STRING"), makeString(" "), makeSymbol("*GG-STATUS-MESSAGE-STREAM*"));



    public static final SubLSymbol $gg_status_message_stream$ = makeSymbol("*GG-STATUS-MESSAGE-STREAM*");

    static private final SubLList $list_alt6 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*GG-STATUS-MESSAGE-STREAM*")));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeString("the"), makeString("a"), makeString("about"), makeString("an"), makeString("and"), makeString("are"), makeString("as"), makeString("be"), makeString("by"), makeString("from"), makeString("how"), makeString("i"), makeString("in"), makeString("is"), makeString("it"), makeString("of"), makeString("on"), makeString("or"), makeString("that"), makeString("this"), makeString("to"), makeString("we"), makeString("what"), makeString("when"), makeString("where"), makeString("which"), makeString("why"), makeString("with") });

    public static final SubLObject $$GAFGatheringExperimentLogMt = constant_handles.reader_make_constant_shell(makeString("GAFGatheringExperimentLogMt"));

    static private final SubLString $str_alt9$_dev_null = makeString("/dev/null");



    private static final SubLSymbol KAG = makeSymbol("KAG");

    private static final SubLSymbol KAG_P = makeSymbol("KAG-P");

    static private final SubLList $list_alt13 = list(makeSymbol("FOCUS"), makeSymbol("CONSTRAINING-COL"), makeSymbol("FACT-GATHERING-PROCESS"), makeSymbol("PSG-METHODS"));

    static private final SubLList $list_alt14 = list(makeKeyword("FOCUS"), makeKeyword("CONSTRAINING-COL"), makeKeyword("FACT-GATHERING-PROCESS"), makeKeyword("PSG-METHODS"));

    static private final SubLList $list_alt15 = list(makeSymbol("KAG-FOCUS"), makeSymbol("KAG-CONSTRAINING-COL"), makeSymbol("KAG-FACT-GATHERING-PROCESS"), makeSymbol("KAG-PSG-METHODS"));

    static private final SubLList $list_alt16 = list(makeSymbol("_CSETF-KAG-FOCUS"), makeSymbol("_CSETF-KAG-CONSTRAINING-COL"), makeSymbol("_CSETF-KAG-FACT-GATHERING-PROCESS"), makeSymbol("_CSETF-KAG-PSG-METHODS"));

    private static final SubLSymbol PRINT_KAG = makeSymbol("PRINT-KAG");

    private static final SubLSymbol KAG_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KAG-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol KAG_FOCUS = makeSymbol("KAG-FOCUS");

    public static final SubLSymbol _CSETF_KAG_FOCUS = makeSymbol("_CSETF-KAG-FOCUS");

    private static final SubLSymbol KAG_CONSTRAINING_COL = makeSymbol("KAG-CONSTRAINING-COL");

    public static final SubLSymbol _CSETF_KAG_CONSTRAINING_COL = makeSymbol("_CSETF-KAG-CONSTRAINING-COL");

    private static final SubLSymbol KAG_FACT_GATHERING_PROCESS = makeSymbol("KAG-FACT-GATHERING-PROCESS");

    public static final SubLSymbol _CSETF_KAG_FACT_GATHERING_PROCESS = makeSymbol("_CSETF-KAG-FACT-GATHERING-PROCESS");

    private static final SubLSymbol KAG_PSG_METHODS = makeSymbol("KAG-PSG-METHODS");

    public static final SubLSymbol _CSETF_KAG_PSG_METHODS = makeSymbol("_CSETF-KAG-PSG-METHODS");



    private static final SubLSymbol $CONSTRAINING_COL = makeKeyword("CONSTRAINING-COL");

    private static final SubLSymbol $FACT_GATHERING_PROCESS = makeKeyword("FACT-GATHERING-PROCESS");

    private static final SubLSymbol $PSG_METHODS = makeKeyword("PSG-METHODS");

    static private final SubLString $str_alt31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt32$__KAG___S___S__ = makeString("#<KAG: ~S [~S]>");

    public static final SubLInteger $int$10000 = makeInteger(10000);

    public static final SubLInteger $int$120 = makeInteger(120);



    static private final SubLString $str_alt36$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt37$no_NER_output_stream_for__A = makeString("no NER output stream for ~A");

    static private final SubLString $str_alt38$metrics_cfasl = makeString("metrics.cfasl");

    static private final SubLString $str_alt39$verification_metrics_cfasl = makeString("verification-metrics.cfasl");



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str_alt43$_ = makeString(" ");

    static private final SubLString $str_alt44$Google_API_daily_usage_limit_exce = makeString("Google API daily usage limit exceeded~%");

    static private final SubLString $str_alt45$Done_gathering_GAFs___ = makeString("Done gathering GAFs.~%");

    static private final SubLString $str_alt46$__________Google_server_is_down__ = makeString("********* Google server is down ... wait for ~A seconds!~%");

    static private final SubLString $str_alt47$After_Google_API_server_timeout__ = makeString("After Google API server timeout (or other problem), waiting ~A seconds~%");



    static private final SubLString $str_alt49$Problem___A___ = makeString("Problem: ~A.~%");



    static private final SubLString $str_alt51$EnglishParaphraseMt_ButlerTask = makeString("EnglishParaphraseMt-ButlerTask");

    static private final SubLString $str_alt52$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLSymbol GET_NEXT_KAG_FOR_GATHERING = makeSymbol("GET-NEXT-KAG-FOR-GATHERING");

    static private final SubLString $str_alt54$Considering__A__ = makeString("Considering ~A~%");

    private static final SubLSymbol $GOOGLE_PROBLEM = makeKeyword("GOOGLE-PROBLEM");

    static private final SubLString $str_alt56$Analyzing__A_caused_the_following = makeString("Analyzing ~A caused the following problem: ~A.~%");

    static private final SubLSymbol $sym57$ISA_MT_ = makeSymbol("ISA-MT?");











    private static final SubLSymbol $DUPLICATE = makeKeyword("DUPLICATE");

    public static final SubLObject $$TheFactGatheringFocalTerm = constant_handles.reader_make_constant_shell(makeString("TheFactGatheringFocalTerm"));

    private static final SubLSymbol DESTROY_INFERENCE_AND_PROBLEM_STORE = makeSymbol("DESTROY-INFERENCE-AND-PROBLEM-STORE");

    static private final SubLSymbol $sym66$_OPER = makeSymbol("?OPER");

    static private final SubLSymbol $sym67$_VAL = makeSymbol("?VAL");

    static private final SubLSymbol $sym68$_VAR_POS = makeSymbol("?VAR-POS");

    static private final SubLSymbol $sym69$_TYPE = makeSymbol("?TYPE");

    static private final SubLSymbol $sym70$_X = makeSymbol("?X");

    static private final SubLString $str_alt71$Invalid_variable_position___S_for = makeString("Invalid variable position: ~S for KAG partial sentence.");

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol $FET = makeKeyword("FET");

    public static final SubLObject $const74$FactGatheringPSQ_CAETemplates_Spe = constant_handles.reader_make_constant_shell(makeString("FactGatheringPSQ-CAETemplates-SpecificTerm"));

    static private final SubLString $str_alt75$Invalid_partial_sentence_generati = makeString("Invalid partial-sentence generation method: ~S");







    static private final SubLString $str_alt79$__search_with___A__ = makeString("  search with: ~A~%");

    public static final SubLObject $$Google_SearchEngine = constant_handles.reader_make_constant_shell(makeString("Google-SearchEngine"));

    public static final SubLObject $$SecondsDuration = constant_handles.reader_make_constant_shell(makeString("SecondsDuration"));







    static private final SubLSymbol $sym85$STRING_ = makeSymbol("STRING=");

    static private final SubLString $str_alt86$______dup___A__ = makeString("      dup: ~A~%");

    static private final SubLString $str_alt87$_____A__ = makeString("    ~A~%");

    static private final SubLString $str_alt88$_________is_untrue__ = makeString("      ...is untrue~%");

    static private final SubLString $str_alt89$Could_not_extract_valid_answer_st = makeString("Could not extract valid answer string from ~A.");

    static private final SubLString $str_alt90$____________already_processed___A = makeString("         ...already processed: ~A~%");

    public static final SubLObject $$URLReferentFn = constant_handles.reader_make_constant_shell(makeString("URLReferentFn"));









    static private final SubLString $str_alt96$_s = makeString("'s");



    static private final SubLString $str_alt98$____________known___A__ = makeString("         ...known: ~A~%");



    static private final SubLString $str_alt100$____________rejected___A__ = makeString("         ...rejected: ~A~%");

    private static final SubLSymbol $REFUTED = makeKeyword("REFUTED");

    static private final SubLString $str_alt102$____________refuted___A__ = makeString("         ...refuted: ~A~%");

    static private final SubLString $str_alt103$____________verified___A__with__A = makeString("         ...verified: ~A  with ~A supports~%");

    static private final SubLString $str_alt104$____________unverified___A__ = makeString("         ...unverified: ~A~%");

    public static final SubLSymbol $gg_confirmed_isg$ = makeSymbol("*GG-CONFIRMED-ISG*");

    public static final SubLSymbol $gg_unconfirmed_isg$ = makeSymbol("*GG-UNCONFIRMED-ISG*");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLList $list_alt108 = list(new SubLObject[]{ makeString("in"), makeString("on"), makeString("of"), makeString("as"), makeString("by"), makeString("with"), makeString("but"), makeString("to"), makeString("while"), makeString("because"), makeString("how"), makeString("if"), makeString("when"), makeString("then"), makeString("else"), makeString("therefore"), makeString("is"), makeString("are"), makeString("other"), makeString("this"), makeString("it"), makeString("own"), makeString("one"), makeString("the"), makeString("a"), makeString("an"), makeString("some"), makeString("whose"), makeString("whom") });

    static private final SubLString $str_alt109$_ = makeString("*");

    static private final SubLString $str_alt110$_ = makeString("?");

    static private final SubLString $str_alt111$_____S___S___S___S___S = makeString("~%~%~S~%~S~%~S~%~S~%~S");

    static private final SubLString $str_alt112$________A___ = makeString("      [~A]~%");

    public static final SubLObject $$Person = constant_handles.reader_make_constant_shell(makeString("Person"));

    public static final SubLObject $$GeopoliticalEntity = constant_handles.reader_make_constant_shell(makeString("GeopoliticalEntity"));

    public static final SubLObject $$Place = constant_handles.reader_make_constant_shell(makeString("Place"));

    public static final SubLObject $$Date = constant_handles.reader_make_constant_shell(makeString("Date"));

    public static final SubLObject $$ProperNameString = constant_handles.reader_make_constant_shell(makeString("ProperNameString"));

    static private final SubLString $str_alt118$_ = makeString(",");

    static private final SubLString $str_alt119$Timed_out_after__A_trying_to_pars = makeString("Timed out after ~A trying to parse ~S");

    static private final SubLString $str_alt120$___________A__ = makeString("      --> ~A~%");

    static private final SubLString $str_alt121$___S___S = makeString("~%~S~%~S");

    static private final SubLString $str_alt122$_S_is_not_a_known_ans_string_mode = makeString("~S is not a known ans-string mode");





    public static final SubLObject $$EnglishParaphraseMt = constant_handles.reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

    static private final SubLList $list_alt127 = list(constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic")));

    static private final SubLList $list_alt128 = list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("FALSE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"));

    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$IndexicalConcept = constant_handles.reader_make_constant_shell(makeString("IndexicalConcept"));

    static private final SubLList $list_alt131 = list(CHAR_asterisk, CHAR_underbar);

    static private final SubLList $list_alt132 = list(constant_handles.reader_make_constant_shell(makeString("initialsString")), constant_handles.reader_make_constant_shell(makeString("lastName")), constant_handles.reader_make_constant_shell(makeString("familyName")), constant_handles.reader_make_constant_shell(makeString("acronymString")), constant_handles.reader_make_constant_shell(makeString("initialismString")));

    static private final SubLString $str_alt133$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt134 = list(makeSymbol("ACRONYM-STRING-METHOD"));

    static private final SubLString $str_alt135$ = makeString("");

    static private final SubLString $str_alt136$_ = makeString("\"");



    static private final SubLString $str_alt138$______ = makeString("______");

    static private final SubLString $str_alt139$____Google_error__S__no_retry____ = makeString("    Google error ~S (no retry).~%");

    static private final SubLString $str_alt140$____Google_error__S___will_retry_ = makeString("    Google error ~S. (will retry)~%");

    public static final SubLObject $$URLFn = constant_handles.reader_make_constant_shell(makeString("URLFn"));



    static private final SubLList $list_alt143 = list(makeString("the "), makeString("a "));





    static private final SubLString $str_alt146$_S_is_not_one_of__S = makeString("~S is not one of ~S");





    static private final SubLString $str_alt149$_ = makeString(".");

    static private final SubLList $list_alt150 = list(makeString(","), makeString("."), makeString("("), makeString(")"), makeString(":"), makeString("-"));

    public static final SubLObject $$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));

    static private final SubLList $list_alt152 = list(makeSymbol("?X"));

    private static final SubLSymbol GIVEN_NAME_PREDS = makeSymbol("GIVEN-NAME-PREDS");



    public static final SubLObject $$givenNames = constant_handles.reader_make_constant_shell(makeString("givenNames"));

    public static final SubLSymbol $given_name_preds_caching_state$ = makeSymbol("*GIVEN-NAME-PREDS-CACHING-STATE*");

    public static final SubLSymbol $kw157$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    static private final SubLList $list_alt159 = list(constant_handles.reader_make_constant_shell(makeString("Usgs-Gnis-KS")), constant_handles.reader_make_constant_shell(makeString("NGA-Gns-KS")));

    private static final SubLSymbol GG_VERIFICATION_FOR_PLACE_NAUT = makeSymbol("GG-VERIFICATION-FOR-PLACE-NAUT");

    public static final SubLObject $$Usgs_Gnis_KS = constant_handles.reader_make_constant_shell(makeString("Usgs-Gnis-KS"));

    public static final SubLObject $$NGA_Gns_KS = constant_handles.reader_make_constant_shell(makeString("NGA-Gns-KS"));

    static private final SubLString $str_alt163$SK_sources__A_and_or__A_cannot_be = makeString("SK-sources ~A and/or ~A cannot be queried.");

    public static final SubLObject $$sksiSentence = constant_handles.reader_make_constant_shell(makeString("sksiSentence"));

    public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

    static private final SubLSymbol $sym166$_PLACE = makeSymbol("?PLACE");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$placeName_Standard = constant_handles.reader_make_constant_shell(makeString("placeName-Standard"));

    public static final SubLObject $$geographicallySubsumes = constant_handles.reader_make_constant_shell(makeString("geographicallySubsumes"));

    static private final SubLList $list_alt170 = list(makeSymbol("?PLACE"));

    static private final SubLList $list_alt171 = list(constant_handles.reader_make_constant_shell(makeString("MtUnionFn")), list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("NGA-Gns-KS"))), list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("Usgs-Gnis-KS"))));

    static private final SubLList $list_alt172 = list(new SubLObject[]{ makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    public static final SubLSymbol $gg_verification_for_place_naut_caching_state$ = makeSymbol("*GG-VERIFICATION-FOR-PLACE-NAUT-CACHING-STATE*");

    public static final SubLObject $$TermLearner_ExperimentalMt = constant_handles.reader_make_constant_shell(makeString("TermLearner-ExperimentalMt"));

    public static final SubLObject $const175$subLFunctionForNAUTVerification_G = constant_handles.reader_make_constant_shell(makeString("subLFunctionForNAUTVerification-GG"));

    static private final SubLString $str_alt176$Invalid_NAUT___S_as_a__A__ = makeString("Invalid NAUT: ~S as a ~A~%");

    static private final SubLString $str_alt177$____________asserting__A__ = makeString("            asserting ~A~%");

    private static final SubLSymbol GG_ASSERT = makeSymbol("GG-ASSERT");



    public static final SubLObject $$BUTLERAgent = constant_handles.reader_make_constant_shell(makeString("BUTLERAgent"));

    public static final SubLObject $$evincesVerifiedGAF = constant_handles.reader_make_constant_shell(makeString("evincesVerifiedGAF"));

    static private final SubLString $str_alt182$____Verified____A__ = makeString("    Verified   ~A~%");

    public static final SubLObject $$evincesUnverifiedGAF = constant_handles.reader_make_constant_shell(makeString("evincesUnverifiedGAF"));

    static private final SubLString $str_alt184$____Unverified__A__ = makeString("    Unverified ~A~%");

    public static final SubLObject $$evincesRefutedGAF = constant_handles.reader_make_constant_shell(makeString("evincesRefutedGAF"));

    static private final SubLString $str_alt186$____Refuted__A__ = makeString("    Refuted ~A~%");

    public static final SubLObject $$evincesKnownGAF = constant_handles.reader_make_constant_shell(makeString("evincesKnownGAF"));

    static private final SubLString $str_alt188$____Known__A__ = makeString("    Known ~A~%");

    static private final SubLString $str_alt189$_ = makeString("-");

    public static final SubLInteger $int$10000000000 = makeInteger("10000000000");



    static private final SubLList $list_alt192 = list(list(makeSymbol("*THE-CYCLIST*"), constant_handles.reader_make_constant_shell(makeString("BUTLERAgent"))));

    private static final SubLSymbol KE_CREATE_NOW = makeSymbol("KE-CREATE-NOW");

    static private final SubLList $list_alt194 = list(makeSymbol("PARTIAL-GAF"), makeSymbol("MASTER-CYC-HOST"), makeSymbol("MASTER-CYC-PORT"), makeSymbol("FACT-GATHERING-PROCESS"));

    static private final SubLString $$$GAFGathering = makeString("GAFGathering");



    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt198 = list(constant_handles.reader_make_constant_shell(makeString("GAFGathering")));

    public static final SubLObject $$gafGatheringTriggerSentence = constant_handles.reader_make_constant_shell(makeString("gafGatheringTriggerSentence"));

    public static final SubLObject $$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));

    public static final SubLObject $$properSubEvents = constant_handles.reader_make_constant_shell(makeString("properSubEvents"));

    static private final SubLList $list_alt202 = list(makeSymbol("DATE-OF-EVENT"), makeSymbol("SEARCH-ENGINE"), makeSymbol("SEARCH-STRING"), makeSymbol("NBR-SEARCH-RESULTS"), makeSymbol("SECONDS-DURATION"), makeSymbol("&OPTIONAL"), makeSymbol("MASTER-CYC-HOST"), makeSymbol("MASTER-CYC-PORT"));

    static private final SubLString $$$StringBasedSearching = makeString("StringBasedSearching");

    private static final SubLSymbol CYCL_REPRESENTED_TERM_P = makeSymbol("CYCL-REPRESENTED-TERM-P");



    static private final SubLList $list_alt206 = list(constant_handles.reader_make_constant_shell(makeString("StringBasedSearching")));

    public static final SubLObject $$dateOfEvent = constant_handles.reader_make_constant_shell(makeString("dateOfEvent"));

    public static final SubLObject $$searchEngineUsed = constant_handles.reader_make_constant_shell(makeString("searchEngineUsed"));

    public static final SubLObject $$searchStringsUsed = constant_handles.reader_make_constant_shell(makeString("searchStringsUsed"));

    public static final SubLObject $$numberOfSearchResultsObtained = constant_handles.reader_make_constant_shell(makeString("numberOfSearchResultsObtained"));

    public static final SubLObject $$duration = constant_handles.reader_make_constant_shell(makeString("duration"));

    public static final SubLObject $$numberOfResultsThatSupportBinding = constant_handles.reader_make_constant_shell(makeString("numberOfResultsThatSupportBinding"));

    static private final SubLList $list_alt213 = list(makeSymbol("URL"), makeSymbol("RANK-OF-RESULT"), makeSymbol("&OPTIONAL"), makeSymbol("MASTER-CYC-HOST"), makeSymbol("MASTER-CYC-PORT"));

    static private final SubLString $$$ObtainingASearchResult = makeString("ObtainingASearchResult");

    static private final SubLList $list_alt215 = list(constant_handles.reader_make_constant_shell(makeString("ObtainingAStringBasedSearchResult")));

    public static final SubLObject $$objectFound = constant_handles.reader_make_constant_shell(makeString("objectFound"));

    public static final SubLObject $$rankOfResult = constant_handles.reader_make_constant_shell(makeString("rankOfResult"));

    public static final SubLObject $$focalBasisString = constant_handles.reader_make_constant_shell(makeString("focalBasisString"));

    public static final SubLObject $$evincesBinding = constant_handles.reader_make_constant_shell(makeString("evincesBinding"));

    public static final SubLObject $$evincesRefutableGAF = constant_handles.reader_make_constant_shell(makeString("evincesRefutableGAF"));

    static private final SubLString $str_alt221$_massage_answer_string__S__S__S__ = makeString("(massage-answer-string ~S ~S ~S)~%");

    static private final SubLString $str_alt222$_and_ = makeString(" and ");

    static private final SubLString $str_alt223$_or_ = makeString(" or ");

    static private final SubLString $str_alt224$___ = makeString(" & ");

    static private final SubLString $str_alt225$_ = makeString("~");

    static private final SubLString $str_alt226$__ = makeString("; ");

    static private final SubLList $list_alt227 = list(CHAR_tilde);

    static private final SubLList $list_alt228 = list(new SubLObject[]{ makeString("i"), makeString("it"), makeString("he"), makeString("she"), makeString("they"), makeString("and"), makeString("or"), makeString("but"), makeString("then"), makeString("not"), makeString("why"), makeString("what"), makeString("indeed") });

    static private final SubLList $list_alt229 = list(new SubLObject[]{ makeString("who"), makeString("who's"), makeString("that"), makeString("which"), makeString("also"), makeString("both"), makeString("being"), makeString("is"), makeString("was"), makeString("having"), makeString("has"), makeString("had"), makeString("can"), makeString("could"), makeString("do"), makeString("did"), makeString("would"), makeString("will"), makeString("recently"), makeString("already"), makeString("actually"), makeString("usually"), makeString("reportedly"), makeString("famously"), makeString("currently"), makeString("mostly"), makeString("always"), makeString("nearly always"), makeString("only") });

    static private final SubLString $str_alt230$_ = makeString("(");

    static private final SubLList $list_alt231 = list(new SubLObject[]{ makeString("in"), makeString("to"), makeString("for"), makeString("with"), makeString("but"), makeString("after"), makeString("before"), makeString("which"), makeString("me"), makeString("you"), makeString("them"), makeString("not"), makeString("never"), makeString("no"), makeString("limited"), makeString("an"), makeString("a"), makeString("this"), makeString("that"), makeString("it"), makeString("our"), makeString("my"), makeString("their"), makeString("his"), makeString("her") });

    static private final SubLList $list_alt232 = list(makeString("the"), makeString("only"), makeString("always"), makeString("mostly"), makeString("usually"), makeString("approximately"), makeString("about"));

    static private final SubLList $list_alt233 = cons(makeSymbol("PPH-MT"), makeSymbol("SEARCH-STRINGS"));

    static private final SubLString $str_alt234$____________no_support_from___A__ = makeString("            no support from: ~A~%");

    static private final SubLString $str_alt235$_____________A_support_s__from___ = makeString("            ~A support(s) from: ~A~%");



    private static final SubLSymbol $UNVERIFIED = makeKeyword("UNVERIFIED");

    static private final SubLSymbol $sym238$_ = makeSymbol("<");





    static private final SubLList $list_alt241 = list(CHAR_comma);

    private static final SubLSymbol GG_GOOGLE_COUNT = makeSymbol("GG-GOOGLE-COUNT");

    public static final SubLSymbol $gg_google_count_caching_state$ = makeSymbol("*GG-GOOGLE-COUNT-CACHING-STATE*");



    static private final SubLList $list_alt245 = list(new SubLObject[]{ makeString("if"), makeString("if that"), makeString("wrong that"), makeString("untrue that"), makeString("false that"), makeString("suppose"), makeString("suppose that"), makeString("imagine"), makeString("imagine that"), makeString("doubt"), makeString("doubt that"), makeString("few"), makeString("some"), makeString("no one believes"), makeString("not believe"), makeString("no") });

    static private final SubLList $list_alt246 = list(makeString("no"), makeString("little"));

    static private final SubLList $list_alt247 = list(makeString("dont"), makeString("do not"), makeString("no"));

    static private final SubLList $list_alt248 = list(new SubLObject[]{ makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), T, makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"), makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("ALLOWED-MODULES"), makeKeyword("ALL"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), $NONE, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200), makeKeyword("NEGATION-BY-FAILURE?"), NIL, makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), T, makeKeyword("DIRECTION"), makeKeyword("BACKWARD"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("CZER-EQUAL"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("ALL"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("ALL"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("TRANSFORMATION-ALLOWED?"), T, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("EVALUATE-SUBL-ALLOWED?"), T, makeKeyword("REWRITE-ALLOWED?"), NIL, makeKeyword("ABDUCTION-ALLOWED?"), NIL, makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("ALLOWED-RULES"), makeKeyword("ALL"), makeKeyword("FORBIDDEN-RULES"), $NONE, makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), TEN_INTEGER, makeKeyword("FORWARD-MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000) });

    static private final SubLString $str_alt249$gg_refutation_problem_store_name = makeString("gg-refutation-problem-store-name");

    private static final SubLSymbol PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");

    static private final SubLString $str_alt251$_________refuting__A__ = makeString("         refuting ~A~%");

    static private final SubLString $str_alt252$____________refuted__ = makeString("         ...refuted~%");

    static private final SubLString $str_alt253$____________not_refuted__ = makeString("         ...not-refuted~%");

    private static final SubLSymbol GG_REFUTED_GAF_INT = makeSymbol("GG-REFUTED-GAF-INT");

    static private final SubLString $str_alt255$could_not_create_inference_proble = makeString("could not create inference problem store");

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));



    public static final SubLSymbol $gg_refuted_gaf_int_caching_state$ = makeSymbol("*GG-REFUTED-GAF-INT-CACHING-STATE*");

    static private final SubLString $str_alt259$b07cb666_95a4_41d9_9af6_9c657a1bc = makeString("b07cb666-95a4-41d9-9af6-9c657a1bc4fb");



    public static final SubLObject $$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));

    static private final SubLList $list_alt262 = list(makeSymbol("CSETQ"), makeSymbol("*PERFORM-CFASL-EXTERNALIZATION*"), T);



    public static final SubLInteger $int$300 = makeInteger(300);

    static private final SubLString $str_alt265$GAF_gathering_worker_monitor = makeString("GAF-gathering worker monitor");

    private static final SubLSymbol GG_WORKER_MONITOR = makeSymbol("GG-WORKER-MONITOR");

    public static final SubLInteger $int$600 = makeInteger(600);

    static private final SubLString $str_alt268$____gaf_gathering_worker_appears_ = makeString("~%~%gaf-gathering worker appears unresponsive - quitting~%~%");

    static private final SubLString $str_alt269$Exiting_monitor__ = makeString("Exiting monitor~%");

    static private final SubLString $str_alt270$____This_is_a_file_of_GAF_generat = makeString("\n;; This is a file of GAF-generation output intended as Named Entity Recognizer input.\n;; It is divided into sections, each section corresponding to an attempt to parse\n;; one answer string.\n;;\n;; Each section is separated from the next by a blank line, and is composed\n;; of up to seven lines having the following content, respectively:\n;;\n;; 1) the entire snippet from Google\n;; 2) the part of the snippet that matched the search string\n;; 3) the part of the snippet that matched the asterisk wildcard (\'*\') from the search string\n;; 4) the partial gaf in which we are trying to find bindings for the open variable\n;; 5) the constraining collection (used to filter parse results)\n;; 6) the longest subsequence of (3) that we actually tried to parse\n;; 7) the list of CycL terms that we parsed to\n;;\n;; If a section has less than seven lines, that means we gave up on the string\n;; before trying to parse it\n;; Date: ~A System: ~A\n");

    static private final SubLList $list_alt271 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gaf_gathering_log_file$ = makeSymbol("*GAF-GATHERING-LOG-FILE*");

    static private final SubLString $str_alt273$_S___We_already_knew_that__but_st = makeString("~S : We already knew that, but still asserting it.");

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    static private final SubLString $str_alt275$_S___Won_t_assert__we_can_prove_o = makeString("~S : Won't assert; we can prove ourselves that this is not true.");

    static private final SubLList $list_alt276 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("LinguisticTranslationProcess")));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    static private final SubLString $str_alt278$Translation_ = makeString("Translation-");

    static private final SubLList $list_alt279 = list(constant_handles.reader_make_constant_shell(makeString("LinguisticTranslationProcess")));

    public static final SubLObject $$subEvents = constant_handles.reader_make_constant_shell(makeString("subEvents"));

    public static final SubLObject $$ButlerProject = constant_handles.reader_make_constant_shell(makeString("ButlerProject"));

    static private final SubLString $str_alt282$b9e43052_3402_41d9_85b1_eca8cb50c = makeString("b9e43052-3402-41d9-85b1-eca8cb50cde6");

    static private final SubLList $list_alt283 = list(constant_handles.reader_make_constant_shell(makeString("WebGatheredGAFMicrotheory")));

    public static final SubLObject $$mtSpindleMember = constant_handles.reader_make_constant_shell(makeString("mtSpindleMember"));

    public static final SubLObject $$MachineLearningMtSpindle = constant_handles.reader_make_constant_shell(makeString("MachineLearningMtSpindle"));

    public static final SubLObject $$MachineLearningSpindleHeadMt = constant_handles.reader_make_constant_shell(makeString("MachineLearningSpindleHeadMt"));



    static private final SubLList $list_alt288 = list(makeKeyword("ACRONYMS"), makeKeyword("ABBREVS"));

    public static final SubLObject $$or = constant_handles.reader_make_constant_shell(makeString("or"));

    public static final SubLObject $$termPhrases = constant_handles.reader_make_constant_shell(makeString("termPhrases"));

    public static final SubLObject $$familyName = constant_handles.reader_make_constant_shell(makeString("familyName"));

    public static final SubLObject $$lastName = constant_handles.reader_make_constant_shell(makeString("lastName"));

    public static final SubLInteger $int$1000000000 = makeInteger("1000000000");



    static private final SubLString $str_alt295$_ = makeString("_");

    static private final SubLString $str_alt296$_A__ = makeString("~A~%");

    static private final SubLString $str_alt297$_S__ = makeString("~S~%");

    private static final SubLSymbol SEARCH_RESULT_SPLITS_KNOWN_CONCEPT = makeSymbol("SEARCH-RESULT-SPLITS-KNOWN-CONCEPT");





    static private final SubLString $$$daves = makeString("daves");









    static private final SubLList $list_alt306 = list(list(list(makeString("Nut Butters  Peanut butter goes well with raisins, dates, banana slices, or sprouts. Try almond butter with peach for an exotic treat. ..."), makeString("butter *")), NIL), list(list(makeString("Nut Butters  Peanut butter goes well with raisins, dates, banana slices, or sprouts. Try almond butter with peach for an exotic treat. ..."), makeString("peanut butter *")), NIL), list(list(makeString("Nut Butters  Peanut butter goes well with raisins, dates, banana slices, or sprouts. Try almond butter with peach for an exotic treat. ..."), makeString("peanut *")), T), list(list(makeString("Nut Butters  Peanut butter goes well with raisins, dates, banana slices, or sprouts. Try almond butter with peach for an exotic treat. ..."), makeString("* peanut")), T), list(list(makeString("Nut Butters  Peanut butter goes well with raisins, dates, banana slices, or sprouts. Try almond butter with peach for an exotic treat. ..."), makeString("* peanut butter")), NIL), list(list(makeString("Nut Butters  Peanut butter goes well with raisins, dates, banana slices, or sprouts. Try almond butter with peach for an exotic treat. ..."), makeString("* butter")), NIL));

    // // Initializers
    public void declareFunctions() {
        declare_generate_gafs_file();
    }

    public void initializeVariables() {
        init_generate_gafs_file();
    }

    public void runTopLevelForms() {
        setup_generate_gafs_file();
    }
}

