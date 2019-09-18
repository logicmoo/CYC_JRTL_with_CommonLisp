/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mail_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      EXPERIMENT-LOOP
 *  source file: /cyc/top/cycl/inference/experiment-loop.lisp
 *  created:     2019/07/03 17:38:04
 */
public final class experiment_loop extends SubLTranslatedFile implements V02 {
    // // Constructor
    private experiment_loop() {
    }

    public static final SubLFile me = new experiment_loop();

    public static final String myName = "com.cyc.cycjava.cycl.inference.experiment_loop";

    // // Definitions
    // deflexical
    private static final SubLSymbol $experiment_type_data_required_properties$ = makeSymbol("*EXPERIMENT-TYPE-DATA-REQUIRED-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $experiment_type_data_optional_properties$ = makeSymbol("*EXPERIMENT-TYPE-DATA-OPTIONAL-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $experiment_type_data_properties$ = makeSymbol("*EXPERIMENT-TYPE-DATA-PROPERTIES*");



    public static final SubLObject declare_experiment_type(SubLObject experiment_type, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $experiment_type_data_required_properties$.getGlobalValue();
                SubLObject required_property = NIL;
                for (required_property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , required_property = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == list_utilities.plist_has_keyP(plist, required_property)) {
                            Errors.error($str_alt3$_s_declaration_is_missing_a_value, experiment_type, required_property);
                        }
                    }
                }
            }
            $experiment_type_data$.setGlobalValue(list_utilities.alist_enter($experiment_type_data$.getGlobalValue(), experiment_type, plist, UNPROVIDED));
            return experiment_type;
        }
    }

    // deflexical
    private static final SubLSymbol $experiment_loop_master_dir$ = makeSymbol("*EXPERIMENT-LOOP-MASTER-DIR*");

    // deflexical
    private static final SubLSymbol $experiment_loop_info_dir$ = makeSymbol("*EXPERIMENT-LOOP-INFO-DIR*");

    // deflexical
    private static final SubLSymbol $experiment_loop_keepalive_dir$ = makeSymbol("*EXPERIMENT-LOOP-KEEPALIVE-DIR*");

    // deflexical
    private static final SubLSymbol $experiment_loop_active_machine_list_filename$ = makeSymbol("*EXPERIMENT-LOOP-ACTIVE-MACHINE-LIST-FILENAME*");

    /**
     * The default number of times it will attempt to rerun one experiment before giving up and moving on to the next.
     */
    // deflexical
    private static final SubLSymbol $experiment_loop_default_max_attempts_per_run$ = makeSymbol("*EXPERIMENT-LOOP-DEFAULT-MAX-ATTEMPTS-PER-RUN*");

    public static final SubLObject experiment_type_p(SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values($experiment_type_data$.getGlobalValue(), v_object, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject experiment_types() {
        return list_utilities.alist_keys($experiment_type_data$.getGlobalValue());
    }

    public static final SubLObject experiment_loop_data_for_type(SubLObject experiment_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data = list_utilities.alist_lookup_without_values($experiment_type_data$.getGlobalValue(), experiment_type, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == data) {
                        Errors.error($str_alt29$_S_is_not_a_recognized_experiment, experiment_type);
                    }
                }
                return data;
            }
        }
    }

    public static final SubLObject experiment_loop_data_property(SubLObject experiment_type, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNSPECIFIED;
        }
        {
            SubLObject data = experiment_loop_data_for_type(experiment_type);
            return getf(data, property, v_default);
        }
    }

    public static final SubLObject experiment_loop_name(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $NAME, UNPROVIDED);
    }

    public static final SubLObject experiment_loop_mode(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $MODE, UNPROVIDED);
    }

    public static final SubLObject experiment_loop_experiment_set(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $EXPERIMENT_SET, UNPROVIDED);
    }

    public static final SubLObject experiment_loop_outlier_timeout(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $OUTLIER_TIMEOUT, UNPROVIDED);
    }

    /**
     * The number of times it will attempt to rerun one experiment before giving up and moving on to the next.
     * If unspecified, will default to *experiment-loop-default-max-attempts-per-run*.
     */
    public static final SubLObject experiment_loop_repeat_count(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $REPEAT_COUNT, $experiment_loop_default_max_attempts_per_run$.getGlobalValue());
    }

    /**
     * A form that will be evaluated each time Cyc starts up to run or continue an EXPERIMENT-TYPE experiment.
     */
    public static final SubLObject experiment_loop_init_form(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $INIT_FORM, UNPROVIDED);
    }

    public static final SubLObject experiment_loop_results_dir(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $RESULTS_DIR, NIL);
    }

    public static final SubLObject experiment_loop_email_from(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $EMAIL_FROM, NIL);
    }

    public static final SubLObject experiment_loop_email_to(SubLObject experiment_type) {
        return experiment_loop_data_property(experiment_type, $EMAIL_TO, NIL);
    }

    /**
     * The main interface to the Experiment Loop.  Called by the Experiment Loop script.
     * 1. If the 'ready for new run' flag is set, set the 'in the middle of a run' flag, then start running the Experiment experiment.
     * 2. If the crash counter is less than 5, increment it and then run it again. It will automatically augment the existing Experiment results file or rerun any erroring queries.
     * 3. If the crash counter is 5 or greater, set the 'ready for new run' flag and halt.
     */
    public static final SubLObject experiment_loop_do_next_step(SubLObject experiment_type) {
        if (experiment_type == UNPROVIDED) {
            experiment_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            agenda.halt_agenda(UNPROVIDED);
            if (NIL == experiment_type) {
                experiment_type = experiment_loop_current_experiment_type();
            }
            if (NIL == experiment_type_p(experiment_type)) {
                experiment_loop_pop_experiment();
                Errors.error($str_alt37$_s_was_not_a_valid_experiment_typ, experiment_type);
            }
            {
                SubLObject repeat_count = experiment_loop_repeat_count(experiment_type);
                SubLObject init_form = experiment_loop_init_form(experiment_type);
                thread.resetMultipleValues();
                {
                    SubLObject counter = experiment_loop_flag();
                    SubLObject results_filename = thread.secondMultipleValue();
                    SubLObject analysis_filename = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == counter) {
                        experiment_loop_start_new_run(experiment_type, init_form);
                    } else
                        if (counter.numL(repeat_count)) {
                            experiment_loop_continue_run(experiment_type, counter, results_filename, analysis_filename, init_form);
                        } else {
                            experiment_loop_give_up(experiment_type, results_filename, analysis_filename);
                        }

                }
            }
            return NIL;
        }
    }

    public static final SubLObject experiment_loop_start_new_run(SubLObject experiment_type, SubLObject init_form) {
        {
            SubLObject date_time = experiment_loop_datestring();
            SubLObject name = experiment_loop_name(experiment_type);
            SubLObject results_dir = experiment_loop_results_dir(experiment_type);
            SubLObject results_filename = (NIL != results_dir) ? ((SubLObject) (cconcatenate(results_dir, new SubLObject[]{ $str_alt38$experiment_, date_time, $str_alt39$_cfasl }))) : NIL;
            SubLObject analysis_filename = (NIL != results_dir) ? ((SubLObject) (cconcatenate(results_dir, new SubLObject[]{ $str_alt40$experiment_analysis_, date_time, $str_alt41$_text }))) : NIL;
            experiment_loop_set_flag(ZERO_INTEGER, results_filename, analysis_filename);
            format(T, $str_alt42$Experiment_Loop__Starting_new__A_, new SubLObject[]{ name, results_filename, analysis_filename });
            return experiment_loop_run_experiment_int(experiment_type, $OVERWRITE, results_filename, analysis_filename, T, init_form);
        }
    }

    public static final SubLObject experiment_loop_continue_run(SubLObject experiment_type, SubLObject counter, SubLObject results_filename, SubLObject analysis_filename, SubLObject init_form) {
        {
            SubLObject name = experiment_loop_name(experiment_type);
            SubLObject new_counter = number_utilities.f_1X(counter);
            experiment_loop_set_flag(new_counter, results_filename, analysis_filename);
            format(T, $str_alt44$Experiment_Loop__Continuing__A_ru, new SubLObject[]{ name, new_counter, results_filename, analysis_filename });
            return experiment_loop_run_experiment_int(experiment_type, $AUGMENT_OR_RERUN_ERRORS, results_filename, analysis_filename, T, init_form);
        }
    }

    public static final SubLObject experiment_loop_give_up(SubLObject experiment_type, SubLObject results_filename, SubLObject analysis_filename) {
        {
            SubLObject name = experiment_loop_name(experiment_type);
            experiment_loop_set_flag(NIL, NIL, NIL);
            experiment_loop_pop_experiment();
            format(T, $str_alt46$Experiment_Loop__Terminating__A_r, new SubLObject[]{ name, results_filename, analysis_filename });
            experiment_loop_send_finished_email_notification(experiment_type, results_filename, analysis_filename);
            experiment_loop_send_results_email_notifications(experiment_type, results_filename, UNPROVIDED);
            if ($KCT_STANDARD == experiment_type) {
                kct_loop_update_graph_files(results_filename);
            }
        }
        return NIL;
    }

    public static final SubLObject experiment_loop_run_experiment_int(SubLObject experiment_type, SubLObject if_file_exists, SubLObject results_filename, SubLObject analysis_filename, SubLObject keepaliveP, SubLObject init_form) {
        if (keepaliveP == UNPROVIDED) {
            keepaliveP = T;
        }
        if (init_form == UNPROVIDED) {
            init_form = NIL;
        }
        eval(init_form);
        {
            SubLObject comment = experiment_loop_comment(experiment_type);
            SubLObject mode = experiment_loop_mode(experiment_type);
            SubLObject experiment_set = experiment_loop_experiment_set(experiment_type);
            SubLObject outlier_timeout = experiment_loop_outlier_timeout(experiment_type);
            SubLObject keepalive_filename = (NIL != keepaliveP) ? ((SubLObject) (experiment_loop_keepalive_filename())) : NIL;
            SubLObject pcase_var = mode;
            if (pcase_var.eql($KCT)) {
                kbq_query_run.run_kct_experiment_internal(list(new SubLObject[]{ $TEST_SPEC_SET, experiment_set, $FILENAME, results_filename, $ANALYSIS_FILENAME, analysis_filename, $KEEPALIVE_FILENAME, keepalive_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, NIL, $OVERRIDING_METRICS, inference_datastructures_enumerated_types.all_arete_query_metrics(), $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, T, $INCLUDE_RESULTS, NIL, $IF_FILE_EXISTS, if_file_exists, $EXPOSE_RUNSTATE, NIL, $RANDOMIZE, NIL, $SKIP, ZERO_INTEGER, $COUNT, NIL }));
            } else
                if (pcase_var.eql($KBQ)) {
                    kbq_query_run.run_kbq_experiment_internal(list(new SubLObject[]{ $QUERY_SPEC_SET, experiment_set, $FILENAME, results_filename, $ANALYSIS_FILENAME, analysis_filename, $KEEPALIVE_FILENAME, keepalive_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, NIL, $METRICS, inference_datastructures_enumerated_types.all_arete_query_metrics(), $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, T, $INCLUDE_RESULTS, NIL, $RANDOMIZE, NIL, $SKIP, ZERO_INTEGER, $COUNT, NIL, $IF_FILE_EXISTS, if_file_exists }));
                } else
                    if (pcase_var.eql($NO_OP)) {
                    } else {
                        Errors.error($str_alt65$Unexpected_experiment_mode__S, mode);
                    }


        }
        return NIL;
    }

    public static final SubLObject experiment_loop_comment(SubLObject experiment_type) {
        {
            SubLObject name = experiment_loop_name(experiment_type);
            SubLObject experiment_set = experiment_loop_experiment_set(experiment_type);
            SubLObject experiment_set_string = string_utilities.str(experiment_set);
            SubLObject subl_type = Environment.lisp_implementation_type();
            SubLObject cyc_revision = system_info.cyc_revision_string();
            SubLObject kb_version = operation_communication.kb_version_string();
            return cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str_alt67$_run, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(experiment_set_string), format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(subl_type), $str_alt68$__System_, format_nil.format_nil_a_no_copy(cyc_revision), $str_alt69$__KB_, format_nil.format_nil_a_no_copy(kb_version) });
        }
    }

    public static final SubLObject experiment_loop_keepalive_filename() {
        {
            SubLObject machine_name = misc_utilities.machine_name();
            SubLObject filename = cconcatenate(format_nil.format_nil_a_no_copy($experiment_loop_keepalive_dir$.getGlobalValue()), new SubLObject[]{ format_nil.format_nil_a_no_copy(machine_name), $str_alt70$_keepalive_txt });
            return filename;
        }
    }

    public static final SubLObject experiment_loop_datestring() {
        {
            SubLObject datestring = remove(CHAR_slash, numeric_date_utilities.datetime_string_from_template(get_universal_time(), $str_alt71$yyyy_mm_dd), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject timestring = remove(CHAR_colon, numeric_date_utilities.datetime_string_from_template(get_universal_time(), $str_alt72$hh_mm_ss), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return cconcatenate(datestring, new SubLObject[]{ $$$t, timestring });
        }
    }

    public static final SubLObject experiment_loop_dir() {
        return cconcatenate($str_alt74$_host_, new SubLObject[]{ misc_utilities.machine_name(), $str_alt75$_experiment_loop_ });
    }

    public static final SubLObject experiment_loop_logs_dir() {
        return cconcatenate(experiment_loop_dir(), $str_alt76$logs_);
    }

    public static final SubLObject experiment_loop_flag_filename() {
        return cconcatenate(experiment_loop_dir(), $str_alt77$flag_txt);
    }

    /**
     *
     *
     * @return nil or integerp; NIL means ready to start a new run,
    an integer indicates that a run is/was in progress and has crashed
    that number of times.
     */
    public static final SubLObject experiment_loop_flag() {
        {
            SubLObject flag_filename = experiment_loop_flag_filename();
            if (NIL != Filesys.probe_file(flag_filename)) {
                {
                    SubLObject string = file_utilities.slurp_file(flag_filename);
                    SubLObject substrings = delete_if(EMPTY_STRING_P, string_utilities.split_string(string, string_utilities.whitespace_chars()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == list_utilities.tripleP(substrings)) {
                        Filesys.delete_file(experiment_loop_flag_filename());
                        Errors.error($str_alt79$____Corrupted_flag_file___a__dele, experiment_loop_flag_filename(), string);
                    }
                    {
                        SubLObject datum = substrings;
                        SubLObject current = datum;
                        SubLObject counter_string = NIL;
                        SubLObject results_filename = NIL;
                        SubLObject analysis_filename = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt80);
                        counter_string = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt80);
                        results_filename = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt80);
                        analysis_filename = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            return values(string_utilities.string_to_integer(counter_string), results_filename, analysis_filename);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt80);
                        }
                    }
                }
            } else {
                return values(NIL, NIL, NIL);
            }
        }
        return NIL;
    }

    public static final SubLObject experiment_loop_set_flag(SubLObject counter, SubLObject results_filename, SubLObject analysis_filename) {
        if (NIL != counter) {
            SubLSystemTrampolineFile.checkType(counter, NON_NEGATIVE_INTEGER_P);
        }
        if (NIL != counter) {
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(experiment_loop_flag_filename(), $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt83$Unable_to_open__S, experiment_loop_flag_filename());
                    }
                    {
                        SubLObject stream_1 = stream;
                        princ(counter, stream_1);
                        princ($str_alt84$_, stream_1);
                        princ(results_filename, stream_1);
                        princ($str_alt84$_, stream_1);
                        princ(analysis_filename, stream_1);
                        terpri(stream_1);
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
        } else {
            Filesys.delete_file(experiment_loop_flag_filename());
        }
        return NIL;
    }

    public static final SubLObject experiment_loop_current_experiment_filename() {
        return cconcatenate(experiment_loop_dir(), $str_alt85$current_experiment_txt);
    }

    public static final SubLObject experiment_loop_current_experiment_index() {
        {
            SubLObject current_experiment_filename = experiment_loop_current_experiment_filename();
            if (NIL == Filesys.probe_file(current_experiment_filename)) {
                experiment_loop_set_current_experiment_index(ZERO_INTEGER);
            }
            {
                SubLObject string = file_utilities.slurp_file(current_experiment_filename);
                SubLObject index = string_utilities.string_to_integer(string);
                SubLSystemTrampolineFile.checkType(index, NON_NEGATIVE_INTEGER_P);
                return index;
            }
        }
    }

    public static final SubLObject experiment_loop_set_current_experiment_index(SubLObject new_index) {
        SubLSystemTrampolineFile.checkType(new_index, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(experiment_loop_current_experiment_filename(), $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt83$Unable_to_open__S, experiment_loop_current_experiment_filename());
                }
                {
                    SubLObject stream_2 = stream;
                    princ(new_index, stream_2);
                    terpri(stream_2);
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
        return NIL;
    }

    public static final SubLObject experiment_loop_active_machine_list_pathname() {
        return cconcatenate($experiment_loop_info_dir$.getGlobalValue(), $experiment_loop_active_machine_list_filename$.getGlobalValue());
    }

    public static final SubLObject experiment_loop_my_experiment_types() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject machine_name = misc_utilities.machine_name();
                SubLObject my_experiment_types = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(experiment_loop_active_machine_list_pathname(), $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt83$Unable_to_open__S, experiment_loop_active_machine_list_pathname());
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject line = NIL;
                                for (line = read_line(infile, NIL, NIL, UNPROVIDED); !((NIL == line) || (NIL != my_experiment_types)); line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    {
                                        SubLObject data = string_utilities.split_string(line, UNPROVIDED);
                                        SubLObject machine_string = data.first();
                                        if (machine_name.equalp(machine_string)) {
                                            my_experiment_types = remove($EOF, Mapping.mapcar(READ_FROM_STRING_IGNORING_ALL_ERRORS, data.rest()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
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
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == my_experiment_types) {
                        Errors.error($str_alt89$Could_not_find_experiment_types_f, machine_name, experiment_loop_active_machine_list_pathname());
                    }
                }
                return my_experiment_types;
            }
        }
    }

    public static final SubLObject experiment_loop_current_experiment_type() {
        {
            SubLObject index = experiment_loop_current_experiment_index();
            SubLObject my_experiment_types = experiment_loop_my_experiment_types();
            return nth(index, my_experiment_types);
        }
    }

    /**
     * Notes that the current experiment is done and that the next experiment will be done next.
     */
    public static final SubLObject experiment_loop_pop_experiment() {
        {
            SubLObject old_index = experiment_loop_current_experiment_index();
            SubLObject total_experiment_count = length(experiment_loop_my_experiment_types());
            SubLObject new_index = number_utilities.f_1X(old_index);
            if (new_index.numGE(total_experiment_count)) {
                new_index = ZERO_INTEGER;
            }
            experiment_loop_set_current_experiment_index(new_index);
        }
        return NIL;
    }

    public static final SubLObject experiment_loop_send_start_email_notification(SubLObject experiment_type, SubLObject results_filename) {
        {
            SubLObject name = experiment_loop_name(experiment_type);
            SubLObject from = experiment_loop_email_from(experiment_type);
            SubLObject to = experiment_loop_email_to(experiment_type);
            if ((NIL != from) && (NIL != to)) {
                {
                    SubLObject subject = cconcatenate($str_alt90$Experiment_Loop__Starting_new_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str_alt91$_run_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring(UNPROVIDED)) });
                    SubLObject body = cconcatenate(format_nil.format_nil_a_no_copy(experiment_loop_comment(experiment_type)), new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt92$Results_will_be_written_to_, format_nil.format_nil_a_no_copy(results_filename), format_nil.$format_nil_percent$.getGlobalValue() });
                    return mail_utilities.mail_message(from, to, body, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject experiment_loop_send_finished_email_notification(SubLObject experiment_type, SubLObject results_filename, SubLObject analysis_filename) {
        {
            SubLObject name = experiment_loop_name(experiment_type);
            SubLObject from = experiment_loop_email_from(experiment_type);
            SubLObject to = experiment_loop_email_to(experiment_type);
            if ((NIL != from) && (NIL != to)) {
                {
                    SubLObject analysis = file_utilities.slurp_file(analysis_filename);
                    SubLObject successP = makeBoolean(NIL == string_utilities.empty_string_p(analysis));
                    SubLObject subject = (NIL != successP) ? ((SubLObject) (cconcatenate($str_alt93$Experiment_Loop__, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str_alt94$_run_completed_successfully_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring(UNPROVIDED)) }))) : cconcatenate($str_alt95$WARNING__Experiment_Loop__, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str_alt96$_run_failed__terminating_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring(UNPROVIDED)) });
                    SubLObject body = experiment_loop_finished_email_body(experiment_type, analysis, successP, results_filename);
                    return mail_utilities.mail_message(from, to, body, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject experiment_loop_finished_email_body(SubLObject experiment_type, SubLObject analysis, SubLObject successP, SubLObject results_filename) {
        if (NIL == successP) {
            return cconcatenate($str_alt97$Check_the_log_files_in_, new SubLObject[]{ format_nil.format_nil_a_no_copy(experiment_loop_logs_dir()), $str_alt98$_to_determine_the_cause_of_failur, format_nil.$format_nil_percent$.getGlobalValue() });
        }
        {
            SubLObject comment = experiment_loop_comment(experiment_type);
            SubLObject graph_comment = $str_alt99$;
            if (experiment_type == $KCT_STANDARD) {
                graph_comment = cconcatenate($str_alt100$Graphs_have_been_updated_at_http_, format_nil.$format_nil_percent$.getGlobalValue());
            }
            return cconcatenate(format_nil.format_nil_a_no_copy(comment), new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue(), $$$Summary, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt102$_______, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(analysis), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt103$Results_have_been_written_to_, format_nil.format_nil_a_no_copy(results_filename), format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(graph_comment) });
        }
    }

    public static final SubLObject experiment_loop_send_results_email_notifications(SubLObject experiment_type, SubLObject results_pathname, SubLObject email_if_no_failuresP) {
        if (email_if_no_failuresP == UNPROVIDED) {
            email_if_no_failuresP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mode = experiment_loop_mode(experiment_type);
                SubLObject pcase_var = mode;
                if (pcase_var.eql($KCT)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject results_dir = file_utilities.partially_deconstruct_path(results_pathname);
                        SubLObject results_file = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return qa_benchmarks.load_and_email_kct_result_summaries(results_file, email_if_no_failuresP, NIL, results_dir);
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject experiment_result_file_p(SubLObject filename) {
        return makeBoolean(((filename.isString() && (NIL != list_utilities.lengthE(filename, $int$32, UNPROVIDED))) && (NIL != string_utilities.starts_with(filename, $str_alt38$experiment_))) && (NIL != string_utilities.ends_with(filename, $str_alt39$_cfasl, UNPROVIDED)));
    }

    public static final SubLObject experiment_result_file_date(SubLObject filename) {
        return string_utilities.string_to_integer(subseq(filename, ELEVEN_INTEGER, NINETEEN_INTEGER));
    }

    /**
     * Called after each successful iteration of the KCT loop.
     *
     * @see kct-loop-regenerate-graph-files
     */
    public static final SubLObject kct_loop_update_graph_files(SubLObject results_pathname) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results_dir = file_utilities.partially_deconstruct_path(results_pathname);
                SubLObject results_file = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject kct_result = qa_benchmarks.qa_load_kct_result(results_file, results_dir);
                    return kct_loop_update_graph_files_int(kct_result);
                }
            }
        }
    }

    // deflexical
    private static final SubLSymbol $kct_loop_graph_dir$ = makeSymbol("*KCT-LOOP-GRAPH-DIR*");

    // deflexical
    private static final SubLSymbol $kct_loop_graph_filename_prefix$ = makeSymbol("*KCT-LOOP-GRAPH-FILENAME-PREFIX*");

    // deflexical
    private static final SubLSymbol $kct_loop_graph_plot_filename_suffix$ = makeSymbol("*KCT-LOOP-GRAPH-PLOT-FILENAME-SUFFIX*");

    // deflexical
    private static final SubLSymbol $kct_loop_graph_data_filename_suffix$ = makeSymbol("*KCT-LOOP-GRAPH-DATA-FILENAME-SUFFIX*");

    // deflexical
    private static final SubLSymbol $kct_loop_graph_image_filename_suffix$ = makeSymbol("*KCT-LOOP-GRAPH-IMAGE-FILENAME-SUFFIX*");

    /**
     * Eventually we'll probably just want the 05/08/2006 start date, since that's when the
     * KCT loop was put in place and the results started becoming reliable.  But for now,
     * we want to generate graphs with three start dates.
     */
    // deflexical
    private static final SubLSymbol $kct_loop_start_dates$ = makeSymbol("*KCT-LOOP-START-DATES*");

    /**
     *
     *
     * @unknown It's silly to hard-code this instead of using the plot generation utilities.
     */
    // deflexical
    private static final SubLSymbol $kct_loop_standard_plot_text$ = makeSymbol("*KCT-LOOP-STANDARD-PLOT-TEXT*");

    public static final SubLObject kct_loop_graph_plot_pathname(SubLObject start_date) {
        return cconcatenate($kct_loop_graph_dir$.getGlobalValue(), kct_loop_graph_plot_filename(start_date));
    }

    public static final SubLObject kct_loop_graph_plot_filename(SubLObject start_date) {
        return cconcatenate($kct_loop_graph_filename_prefix$.getGlobalValue(), new SubLObject[]{ string_utilities.str(start_date), $kct_loop_graph_plot_filename_suffix$.getGlobalValue() });
    }

    public static final SubLObject kct_loop_graph_data_pathname(SubLObject start_date) {
        return cconcatenate($kct_loop_graph_dir$.getGlobalValue(), kct_loop_graph_data_filename(start_date));
    }

    public static final SubLObject kct_loop_graph_data_filename(SubLObject start_date) {
        return cconcatenate($kct_loop_graph_filename_prefix$.getGlobalValue(), new SubLObject[]{ string_utilities.str(start_date), $kct_loop_graph_data_filename_suffix$.getGlobalValue() });
    }

    public static final SubLObject kct_loop_graph_image_pathname(SubLObject start_date) {
        return cconcatenate($kct_loop_graph_dir$.getGlobalValue(), kct_loop_graph_image_filename(start_date));
    }

    public static final SubLObject kct_loop_graph_image_filename(SubLObject start_date) {
        return cconcatenate($kct_loop_graph_filename_prefix$.getGlobalValue(), new SubLObject[]{ string_utilities.str(start_date), $kct_loop_graph_image_filename_suffix$.getGlobalValue() });
    }

    public static final SubLObject kct_loop_update_graph_files_int(SubLObject kct_result) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject date = qa_benchmarks.qa_kct_result_date(kct_result);
            SubLObject cdolist_list_var = $kct_loop_start_dates$.getGlobalValue();
            SubLObject start_date = NIL;
            for (start_date = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , start_date = cdolist_list_var.first()) {
                kct_loop_generate_standard_graph_plot_file(start_date, date);
                kct_loop_append_to_standard_graph_data_file(start_date, kct_result);
                if (NIL != kct_loop_generate_standard_graph_image_file(start_date)) {
                    count = add(count, ONE_INTEGER);
                }
            }
            return count;
        }
    }

    /**
     * This only needs to be run if the files get corrupted or deleted,
     * and of course once to generate the initial versions of the graph plot and data files.
     */
    public static final SubLObject kct_loop_regenerate_graph_files() {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = $kct_loop_start_dates$.getGlobalValue();
            SubLObject start_date = NIL;
            for (start_date = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , start_date = cdolist_list_var.first()) {
                {
                    SubLObject kct_results = butlast(qa_benchmarks.qa_load_kct_results(start_date, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    SubLObject end_date = qa_benchmarks.qa_kct_result_date(list_utilities.last_one(kct_results));
                    kct_loop_generate_standard_graph_plot_file(start_date, end_date);
                    kct_loop_regenerate_standard_graph_data_file(kct_results);
                    if (NIL != kct_loop_generate_standard_graph_image_file(start_date)) {
                        count = add(count, ONE_INTEGER);
                    }
                }
            }
            return count;
        }
    }

    public static final SubLObject kct_loop_generate_standard_graph_plot_file(SubLObject start_date, SubLObject end_date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plot_pathname = kct_loop_graph_plot_pathname(start_date);
                SubLObject data_filename = kct_loop_graph_data_pathname(start_date);
                SubLObject image_filename = kct_loop_graph_image_pathname(start_date);
                SubLObject start_date_string = numeric_date_utilities.datestring(start_date);
                SubLObject end_date_string = numeric_date_utilities.datestring(end_date);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(plot_pathname, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt83$Unable_to_open__S, plot_pathname);
                    }
                    {
                        SubLObject s = stream;
                        format(s, $kct_loop_standard_plot_text$.getGlobalValue(), new SubLObject[]{ start_date_string, end_date_string, start_date.numE($int$20060508) ? ((SubLObject) ($$$left_bottom)) : $$$left, image_filename, data_filename, data_filename, data_filename, data_filename });
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
                return plot_pathname;
            }
        }
    }

    public static final SubLObject kct_loop_regenerate_standard_graph_data_file(SubLObject kct_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start_date = qa_benchmarks.qa_kct_result_date(kct_results.first());
                SubLObject pathname = kct_loop_graph_data_pathname(start_date);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt83$Unable_to_open__S, pathname);
                    }
                    {
                        SubLObject s = stream;
                        SubLObject cdolist_list_var = kct_results;
                        SubLObject kct_result = NIL;
                        for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                            kct_loop_write_one_line_to_standard_graph_data_file(kct_result, s);
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
                return pathname;
            }
        }
    }

    public static final SubLObject kct_loop_append_to_standard_graph_data_file(SubLObject start_date, SubLObject kct_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pathname = kct_loop_graph_data_pathname(start_date);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(pathname, $APPEND, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt83$Unable_to_open__S, pathname);
                    }
                    {
                        SubLObject s = stream;
                        kct_loop_write_one_line_to_standard_graph_data_file(kct_result, s);
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
                return pathname;
            }
        }
    }

    public static final SubLObject kct_loop_write_one_line_to_standard_graph_data_file(SubLObject kct_result, SubLObject stream) {
        {
            SubLObject date = qa_benchmarks.qa_kct_result_date(kct_result);
            SubLObject datestring = numeric_date_utilities.datestring(date);
            SubLObject test_set_run = qa_benchmarks.qa_kct_result_test_set_run(kct_result);
            SubLObject analysis = kbq_query_run.kct_analyze_test_set_run(test_set_run, $list_alt116);
            SubLObject success_count = getf(analysis, $TOTAL_SUCCESS, UNPROVIDED);
            SubLObject failure_count = getf(analysis, $TOTAL_FAILURE, UNPROVIDED);
            SubLObject error_count = getf(analysis, $TOTAL_ERROR, UNPROVIDED);
            SubLObject lumpy_count = getf(analysis, $TOTAL_LUMPY, UNPROVIDED);
            format(stream, $str_alt121$_a__a__a__a__a__a__a__a__, new SubLObject[]{ datestring, error_count, datestring, success_count, datestring, failure_count, datestring, lumpy_count });
        }
        return NIL;
    }

    public static final SubLObject kct_loop_generate_standard_graph_image_file(SubLObject start_date) {
        {
            SubLObject plot_filename = kct_loop_graph_plot_pathname(start_date);
            return plot_generation.save_plot_as_image_successfulP(plot_filename);
        }
    }

    public static final SubLObject sleep_4_hours() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject keepalive_filename = experiment_loop_keepalive_filename();
                utilities_macros.$progress_note$.setDynamicValue($str_alt122$Sleeping_for_4_hours___, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue($int$24, thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                file_utilities.possibly_update_keepalive_file(keepalive_filename);
                                sleep($int$600);
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_experiment_loop_file() {
        declareFunction("declare_experiment_type", "DECLARE-EXPERIMENT-TYPE", 2, 0, false);
        declareFunction("experiment_type_p", "EXPERIMENT-TYPE-P", 1, 0, false);
        declareFunction("experiment_types", "EXPERIMENT-TYPES", 0, 0, false);
        declareFunction("experiment_loop_data_for_type", "EXPERIMENT-LOOP-DATA-FOR-TYPE", 1, 0, false);
        declareFunction("experiment_loop_data_property", "EXPERIMENT-LOOP-DATA-PROPERTY", 2, 1, false);
        declareFunction("experiment_loop_name", "EXPERIMENT-LOOP-NAME", 1, 0, false);
        declareFunction("experiment_loop_mode", "EXPERIMENT-LOOP-MODE", 1, 0, false);
        declareFunction("experiment_loop_experiment_set", "EXPERIMENT-LOOP-EXPERIMENT-SET", 1, 0, false);
        declareFunction("experiment_loop_outlier_timeout", "EXPERIMENT-LOOP-OUTLIER-TIMEOUT", 1, 0, false);
        declareFunction("experiment_loop_repeat_count", "EXPERIMENT-LOOP-REPEAT-COUNT", 1, 0, false);
        declareFunction("experiment_loop_init_form", "EXPERIMENT-LOOP-INIT-FORM", 1, 0, false);
        declareFunction("experiment_loop_results_dir", "EXPERIMENT-LOOP-RESULTS-DIR", 1, 0, false);
        declareFunction("experiment_loop_email_from", "EXPERIMENT-LOOP-EMAIL-FROM", 1, 0, false);
        declareFunction("experiment_loop_email_to", "EXPERIMENT-LOOP-EMAIL-TO", 1, 0, false);
        declareFunction("experiment_loop_do_next_step", "EXPERIMENT-LOOP-DO-NEXT-STEP", 0, 1, false);
        declareFunction("experiment_loop_start_new_run", "EXPERIMENT-LOOP-START-NEW-RUN", 2, 0, false);
        declareFunction("experiment_loop_continue_run", "EXPERIMENT-LOOP-CONTINUE-RUN", 5, 0, false);
        declareFunction("experiment_loop_give_up", "EXPERIMENT-LOOP-GIVE-UP", 3, 0, false);
        declareFunction("experiment_loop_run_experiment_int", "EXPERIMENT-LOOP-RUN-EXPERIMENT-INT", 4, 2, false);
        declareFunction("experiment_loop_comment", "EXPERIMENT-LOOP-COMMENT", 1, 0, false);
        declareFunction("experiment_loop_keepalive_filename", "EXPERIMENT-LOOP-KEEPALIVE-FILENAME", 0, 0, false);
        declareFunction("experiment_loop_datestring", "EXPERIMENT-LOOP-DATESTRING", 0, 0, false);
        declareFunction("experiment_loop_dir", "EXPERIMENT-LOOP-DIR", 0, 0, false);
        declareFunction("experiment_loop_logs_dir", "EXPERIMENT-LOOP-LOGS-DIR", 0, 0, false);
        declareFunction("experiment_loop_flag_filename", "EXPERIMENT-LOOP-FLAG-FILENAME", 0, 0, false);
        declareFunction("experiment_loop_flag", "EXPERIMENT-LOOP-FLAG", 0, 0, false);
        declareFunction("experiment_loop_set_flag", "EXPERIMENT-LOOP-SET-FLAG", 3, 0, false);
        declareFunction("experiment_loop_current_experiment_filename", "EXPERIMENT-LOOP-CURRENT-EXPERIMENT-FILENAME", 0, 0, false);
        declareFunction("experiment_loop_current_experiment_index", "EXPERIMENT-LOOP-CURRENT-EXPERIMENT-INDEX", 0, 0, false);
        declareFunction("experiment_loop_set_current_experiment_index", "EXPERIMENT-LOOP-SET-CURRENT-EXPERIMENT-INDEX", 1, 0, false);
        declareFunction("experiment_loop_active_machine_list_pathname", "EXPERIMENT-LOOP-ACTIVE-MACHINE-LIST-PATHNAME", 0, 0, false);
        declareFunction("experiment_loop_my_experiment_types", "EXPERIMENT-LOOP-MY-EXPERIMENT-TYPES", 0, 0, false);
        declareFunction("experiment_loop_current_experiment_type", "EXPERIMENT-LOOP-CURRENT-EXPERIMENT-TYPE", 0, 0, false);
        declareFunction("experiment_loop_pop_experiment", "EXPERIMENT-LOOP-POP-EXPERIMENT", 0, 0, false);
        declareFunction("experiment_loop_send_start_email_notification", "EXPERIMENT-LOOP-SEND-START-EMAIL-NOTIFICATION", 2, 0, false);
        declareFunction("experiment_loop_send_finished_email_notification", "EXPERIMENT-LOOP-SEND-FINISHED-EMAIL-NOTIFICATION", 3, 0, false);
        declareFunction("experiment_loop_finished_email_body", "EXPERIMENT-LOOP-FINISHED-EMAIL-BODY", 4, 0, false);
        declareFunction("experiment_loop_send_results_email_notifications", "EXPERIMENT-LOOP-SEND-RESULTS-EMAIL-NOTIFICATIONS", 2, 1, false);
        declareFunction("experiment_result_file_p", "EXPERIMENT-RESULT-FILE-P", 1, 0, false);
        declareFunction("experiment_result_file_date", "EXPERIMENT-RESULT-FILE-DATE", 1, 0, false);
        declareFunction("kct_loop_update_graph_files", "KCT-LOOP-UPDATE-GRAPH-FILES", 1, 0, false);
        declareFunction("kct_loop_graph_plot_pathname", "KCT-LOOP-GRAPH-PLOT-PATHNAME", 1, 0, false);
        declareFunction("kct_loop_graph_plot_filename", "KCT-LOOP-GRAPH-PLOT-FILENAME", 1, 0, false);
        declareFunction("kct_loop_graph_data_pathname", "KCT-LOOP-GRAPH-DATA-PATHNAME", 1, 0, false);
        declareFunction("kct_loop_graph_data_filename", "KCT-LOOP-GRAPH-DATA-FILENAME", 1, 0, false);
        declareFunction("kct_loop_graph_image_pathname", "KCT-LOOP-GRAPH-IMAGE-PATHNAME", 1, 0, false);
        declareFunction("kct_loop_graph_image_filename", "KCT-LOOP-GRAPH-IMAGE-FILENAME", 1, 0, false);
        declareFunction("kct_loop_update_graph_files_int", "KCT-LOOP-UPDATE-GRAPH-FILES-INT", 1, 0, false);
        declareFunction("kct_loop_regenerate_graph_files", "KCT-LOOP-REGENERATE-GRAPH-FILES", 0, 0, false);
        declareFunction("kct_loop_generate_standard_graph_plot_file", "KCT-LOOP-GENERATE-STANDARD-GRAPH-PLOT-FILE", 2, 0, false);
        declareFunction("kct_loop_regenerate_standard_graph_data_file", "KCT-LOOP-REGENERATE-STANDARD-GRAPH-DATA-FILE", 1, 0, false);
        declareFunction("kct_loop_append_to_standard_graph_data_file", "KCT-LOOP-APPEND-TO-STANDARD-GRAPH-DATA-FILE", 2, 0, false);
        declareFunction("kct_loop_write_one_line_to_standard_graph_data_file", "KCT-LOOP-WRITE-ONE-LINE-TO-STANDARD-GRAPH-DATA-FILE", 2, 0, false);
        declareFunction("kct_loop_generate_standard_graph_image_file", "KCT-LOOP-GENERATE-STANDARD-GRAPH-IMAGE-FILE", 1, 0, false);
        declareFunction("sleep_4_hours", "SLEEP-4-HOURS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_experiment_loop_file() {
        deflexical("*EXPERIMENT-TYPE-DATA-REQUIRED-PROPERTIES*", $list_alt0);
        deflexical("*EXPERIMENT-TYPE-DATA-OPTIONAL-PROPERTIES*", $list_alt1);
        deflexical("*EXPERIMENT-TYPE-DATA-PROPERTIES*", append($experiment_type_data_required_properties$.getGlobalValue(), $experiment_type_data_optional_properties$.getGlobalValue()));
        deflexical("*EXPERIMENT-TYPE-DATA*", NIL != boundp($experiment_type_data$) ? ((SubLObject) ($experiment_type_data$.getGlobalValue())) : NIL);
        deflexical("*EXPERIMENT-LOOP-MASTER-DIR*", $str_alt27$_cyc_top_data_experiment_loop_);
        deflexical("*EXPERIMENT-LOOP-INFO-DIR*", $experiment_loop_master_dir$.getGlobalValue());
        deflexical("*EXPERIMENT-LOOP-KEEPALIVE-DIR*", $experiment_loop_master_dir$.getGlobalValue());
        deflexical("*EXPERIMENT-LOOP-ACTIVE-MACHINE-LIST-FILENAME*", $str_alt28$active_machine_list_text);
        deflexical("*EXPERIMENT-LOOP-DEFAULT-MAX-ATTEMPTS-PER-RUN*", FIVE_INTEGER);
        deflexical("*KCT-LOOP-GRAPH-DIR*", $str_alt105$data_kct_results_graphs_);
        deflexical("*KCT-LOOP-GRAPH-FILENAME-PREFIX*", $str_alt106$kct_loop_standard_);
        deflexical("*KCT-LOOP-GRAPH-PLOT-FILENAME-SUFFIX*", $str_alt107$_plot_plot);
        deflexical("*KCT-LOOP-GRAPH-DATA-FILENAME-SUFFIX*", $str_alt108$_plot_dat);
        deflexical("*KCT-LOOP-GRAPH-IMAGE-FILENAME-SUFFIX*", $str_alt109$_plot_png);
        deflexical("*KCT-LOOP-START-DATES*", $list_alt110);
        deflexical("*KCT-LOOP-STANDARD-PLOT-TEXT*", $str_alt111$set_title__KB_Content_Test_Result);
        return NIL;
    }

    public static final SubLObject setup_experiment_loop_file() {
                subl_macro_promotions.declare_defglobal($experiment_type_data$);
        declare_experiment_type($KCT_STANDARD, $list_alt5);
        declare_experiment_type($ARETE_BENCHMARK, listS($NAME, new SubLObject[]{ $$$Arete_Benchmark, $MODE, $KBQ, $EXPERIMENT_SET, $$AreteQuery, $OUTLIER_TIMEOUT, arete.$arete_outlier_timeout$.getGlobalValue(), $list_alt14 }));
        declare_experiment_type($LILLIPUT_BENCHMARK, $list_alt16);
        declare_experiment_type($FAE_KCT, $list_alt18);
        declare_experiment_type($EBMT_EARNINGS_REPORTS, $list_alt20);
        declare_experiment_type($CY_FI_EARNINGS_FROM_SENTENCES, $list_alt22);
        declare_experiment_type($SLEEP_4_HOURS, $list_alt24);
        declare_experiment_type($SHORT_TEST, $list_alt26);
        access_macros.register_external_symbol(EXPERIMENT_LOOP_DO_NEXT_STEP);
        utilities_macros.note_funcall_helper_function(EXPERIMENT_LOOP_RUN_EXPERIMENT_INT);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list($NAME, $MODE);

    static private final SubLList $list_alt1 = list(makeKeyword("EXPERIMENT-SET"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("REPEAT-COUNT"), makeKeyword("INIT-FORM"), makeKeyword("RESULTS-DIR"), makeKeyword("EMAIL-FROM"), makeKeyword("EMAIL-TO"));

    public static final SubLSymbol $experiment_type_data$ = makeSymbol("*EXPERIMENT-TYPE-DATA*");

    static private final SubLString $str_alt3$_s_declaration_is_missing_a_value = makeString("~s declaration is missing a value for ~s");

    private static final SubLSymbol $KCT_STANDARD = makeKeyword("KCT-STANDARD");

    static private final SubLList $list_alt5 = list(new SubLObject[]{ $NAME, makeString("KCT Standard"), $MODE, makeKeyword("KCT"), makeKeyword("EXPERIMENT-SET"), list(constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")), list(constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")), constant_handles.reader_make_constant_shell(makeString("KBContentTest-FullySpecified")), constant_handles.reader_make_constant_shell(makeString("SKSIContentTest"))), constant_handles.reader_make_constant_shell(makeString("TextualEntailmentKBContentTest"))), makeKeyword("OUTLIER-TIMEOUT"), makeInteger(60), makeKeyword("RESULTS-DIR"), makeString("data/kct-results/daily/"), makeKeyword("EMAIL-FROM"), makeString("pace@cyc.com"), makeKeyword("EMAIL-TO"), makeString("inference, qa, witbrock, cdeaton") });

    private static final SubLSymbol $ARETE_BENCHMARK = makeKeyword("ARETE-BENCHMARK");



    static private final SubLString $$$Arete_Benchmark = makeString("Arete Benchmark");





    private static final SubLSymbol $EXPERIMENT_SET = makeKeyword("EXPERIMENT-SET");

    public static final SubLObject $$AreteQuery = constant_handles.reader_make_constant_shell(makeString("AreteQuery"));



    static private final SubLList $list_alt14 = list(makeKeyword("RESULTS-DIR"), makeString("data/benchmark-results/daily/"), makeKeyword("EMAIL-FROM"), makeString("pace@cyc.com"), makeKeyword("EMAIL-TO"), makeString("pace, goolsbey"));

    private static final SubLSymbol $LILLIPUT_BENCHMARK = makeKeyword("LILLIPUT-BENCHMARK");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ $NAME, makeString("Lilliput Standard"), $MODE, makeKeyword("KBQ"), makeKeyword("EXPERIMENT-SET"), constant_handles.reader_make_constant_shell(makeString("LilliputQuery")), makeKeyword("OUTLIER-TIMEOUT"), makeInteger(600), makeKeyword("REPEAT-COUNT"), ONE_INTEGER, makeKeyword("RESULTS-DIR"), makeString("data/lilliput-results/daily/"), makeKeyword("EMAIL-FROM"), makeString("pace@cyc.com"), makeKeyword("EMAIL-TO"), makeString("pace, goolsbey") });

    private static final SubLSymbol $FAE_KCT = makeKeyword("FAE-KCT");

    static private final SubLList $list_alt18 = list(new SubLObject[]{ $NAME, makeString("FAE KB Content Regression Test"), $MODE, makeKeyword("KCT"), makeKeyword("EXPERIMENT-SET"), constant_handles.reader_make_constant_shell(makeString("FAETestSpecification")), makeKeyword("OUTLIER-TIMEOUT"), makeInteger(600), makeKeyword("REPEAT-COUNT"), TWO_INTEGER, makeKeyword("INIT-FORM"), list(makeSymbol("LOAD"), makeString("/cyc/projects/cy-fi/subl/cy-fi-init.lisp")), makeKeyword("RESULTS-DIR"), makeString("data/fae-results/daily/"), makeKeyword("EMAIL-FROM"), makeString("pace@cyc.com"), makeKeyword("EMAIL-TO"), makeString("pace, witbrock, jonc") });

    private static final SubLSymbol $EBMT_EARNINGS_REPORTS = makeKeyword("EBMT-EARNINGS-REPORTS");

    static private final SubLList $list_alt20 = list(new SubLObject[]{ $NAME, makeString("End-to-end EBMT Earnings Reports"), $MODE, makeKeyword("NO-OP"), makeKeyword("REPEAT-COUNT"), ZERO_INTEGER, makeKeyword("INIT-FORM"), list(makeSymbol("PROGN"), list(makeSymbol("LOAD"), makeString("/cyc/projects/cy-fi/subl/cy-fi-init.lisp")), list(makeSymbol("RUN-END-TO-END-EBMT-EARNINGS-REPORTS-TESTS"))), makeKeyword("RESULTS-DIR"), makeString("data/ebmt/testing/earnings-reports/"), makeKeyword("EMAIL-FROM"), makeString("pace@cyc.com"), makeKeyword("EMAIL-TO"), makeString("pace") });

    private static final SubLSymbol $CY_FI_EARNINGS_FROM_SENTENCES = makeKeyword("CY-FI-EARNINGS-FROM-SENTENCES");

    static private final SubLList $list_alt22 = list(new SubLObject[]{ $NAME, makeString("Cy-Fi earnings-from-sentences"), $MODE, makeKeyword("NO-OP"), makeKeyword("REPEAT-COUNT"), ZERO_INTEGER, makeKeyword("INIT-FORM"), list(makeSymbol("PROGN"), list(makeSymbol("LOAD"), makeString("/cyc/projects/cy-fi/subl/cy-fi-init.lisp")), list(makeSymbol("RUN-END-TO-END-EARNINGS-FROM-SENTENCES-TESTS"))), makeKeyword("RESULTS-DIR"), makeString("data/cy-fi-earnings-from-sentences/"), makeKeyword("EMAIL-FROM"), makeString("pace@cyc.com"), makeKeyword("EMAIL-TO"), makeString("pace") });

    private static final SubLSymbol $SLEEP_4_HOURS = makeKeyword("SLEEP-4-HOURS");

    static private final SubLList $list_alt24 = list($NAME, makeString("Sleep for 4 hours"), $MODE, makeKeyword("NO-OP"), makeKeyword("REPEAT-COUNT"), ZERO_INTEGER, makeKeyword("INIT-FORM"), list(makeSymbol("SLEEP-4-HOURS")));

    private static final SubLSymbol $SHORT_TEST = makeKeyword("SHORT-TEST");

    static private final SubLList $list_alt26 = list(new SubLObject[]{ $NAME, makeString("Short Test"), $MODE, makeKeyword("KBQ"), makeKeyword("EXPERIMENT-SET"), list(constant_handles.reader_make_constant_shell(makeString("TheSet")), constant_handles.reader_make_constant_shell(makeString("LilliputQuery-OpenGood-35")), constant_handles.reader_make_constant_shell(makeString("LilliputQuery-ClosedNoGood-178"))), makeKeyword("OUTLIER-TIMEOUT"), NIL, makeKeyword("REPEAT-COUNT"), ONE_INTEGER, makeKeyword("RESULTS-DIR"), makeString("data/short-test/"), makeKeyword("EMAIL-FROM"), makeString("goolsbey@cyc.com"), makeKeyword("EMAIL-TO"), makeString("pace, goolsbey") });

    static private final SubLString $str_alt27$_cyc_top_data_experiment_loop_ = makeString("/cyc/top/data/experiment-loop/");

    static private final SubLString $str_alt28$active_machine_list_text = makeString("active-machine-list.text");

    static private final SubLString $str_alt29$_S_is_not_a_recognized_experiment = makeString("~S is not a recognized experiment type");



    private static final SubLSymbol $REPEAT_COUNT = makeKeyword("REPEAT-COUNT");

    private static final SubLSymbol $INIT_FORM = makeKeyword("INIT-FORM");

    private static final SubLSymbol $RESULTS_DIR = makeKeyword("RESULTS-DIR");

    private static final SubLSymbol $EMAIL_FROM = makeKeyword("EMAIL-FROM");

    private static final SubLSymbol $EMAIL_TO = makeKeyword("EMAIL-TO");

    private static final SubLSymbol EXPERIMENT_LOOP_DO_NEXT_STEP = makeSymbol("EXPERIMENT-LOOP-DO-NEXT-STEP");

    static private final SubLString $str_alt37$_s_was_not_a_valid_experiment_typ = makeString("~s was not a valid experiment type");

    static private final SubLString $str_alt38$experiment_ = makeString("experiment-");

    static private final SubLString $str_alt39$_cfasl = makeString(".cfasl");

    static private final SubLString $str_alt40$experiment_analysis_ = makeString("experiment-analysis-");

    static private final SubLString $str_alt41$_text = makeString(".text");

    static private final SubLString $str_alt42$Experiment_Loop__Starting_new__A_ = makeString("Experiment Loop: Starting new ~A run: ~a ~a~%");



    static private final SubLString $str_alt44$Experiment_Loop__Continuing__A_ru = makeString("Experiment Loop: Continuing ~A run for the ~:R time: ~a ~a~%");

    private static final SubLSymbol $AUGMENT_OR_RERUN_ERRORS = makeKeyword("AUGMENT-OR-RERUN-ERRORS");

    static private final SubLString $str_alt46$Experiment_Loop__Terminating__A_r = makeString("Experiment Loop: Terminating ~A run: ~a ~a~%");



    private static final SubLSymbol $TEST_SPEC_SET = makeKeyword("TEST-SPEC-SET");









    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");







    private static final SubLSymbol $IF_FILE_EXISTS = makeKeyword("IF-FILE-EXISTS");









    private static final SubLSymbol $QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");



    private static final SubLSymbol $NO_OP = makeKeyword("NO-OP");

    static private final SubLString $str_alt65$Unexpected_experiment_mode__S = makeString("Unexpected experiment mode ~S");

    private static final SubLSymbol EXPERIMENT_LOOP_RUN_EXPERIMENT_INT = makeSymbol("EXPERIMENT-LOOP-RUN-EXPERIMENT-INT");

    static private final SubLString $str_alt67$_run = makeString(" run");

    static private final SubLString $str_alt68$__System_ = makeString(", System ");

    static private final SubLString $str_alt69$__KB_ = makeString(", KB ");

    static private final SubLString $str_alt70$_keepalive_txt = makeString("-keepalive.txt");

    static private final SubLString $str_alt71$yyyy_mm_dd = makeString("yyyy/mm/dd");

    static private final SubLString $str_alt72$hh_mm_ss = makeString("hh:mm:ss");

    static private final SubLString $$$t = makeString("t");

    static private final SubLString $str_alt74$_host_ = makeString("/host/");

    static private final SubLString $str_alt75$_experiment_loop_ = makeString("/experiment-loop/");

    static private final SubLString $str_alt76$logs_ = makeString("logs/");

    static private final SubLString $str_alt77$flag_txt = makeString("flag.txt");



    static private final SubLString $str_alt79$____Corrupted_flag_file___a__dele = makeString("*** Corrupted flag file: ~a, deleting.  Contents: ~s ***");

    static private final SubLList $list_alt80 = list(makeSymbol("COUNTER-STRING"), makeSymbol("RESULTS-FILENAME"), makeSymbol("ANALYSIS-FILENAME"));





    static private final SubLString $str_alt83$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt84$_ = makeString(" ");

    static private final SubLString $str_alt85$current_experiment_txt = makeString("current-experiment.txt");





    private static final SubLSymbol READ_FROM_STRING_IGNORING_ALL_ERRORS = makeSymbol("READ-FROM-STRING-IGNORING-ALL-ERRORS");

    static private final SubLString $str_alt89$Could_not_find_experiment_types_f = makeString("Could not find experiment types for ~a in ~a");

    static private final SubLString $str_alt90$Experiment_Loop__Starting_new_ = makeString("Experiment Loop: Starting new ");

    static private final SubLString $str_alt91$_run_at_ = makeString(" run at ");

    static private final SubLString $str_alt92$Results_will_be_written_to_ = makeString("Results will be written to ");

    static private final SubLString $str_alt93$Experiment_Loop__ = makeString("Experiment Loop: ");

    static private final SubLString $str_alt94$_run_completed_successfully_at_ = makeString(" run completed successfully at ");

    static private final SubLString $str_alt95$WARNING__Experiment_Loop__ = makeString("WARNING: Experiment Loop: ");

    static private final SubLString $str_alt96$_run_failed__terminating_at_ = makeString(" run failed, terminating at ");

    static private final SubLString $str_alt97$Check_the_log_files_in_ = makeString("Check the log files in ");

    static private final SubLString $str_alt98$_to_determine_the_cause_of_failur = makeString(" to determine the cause of failure.");

    static private final SubLString $str_alt99$ = makeString("");

    static private final SubLString $str_alt100$Graphs_have_been_updated_at_http_ = makeString("Graphs have been updated at http://wiki.cyc.com/wiki/index.php/KCT_Loop#KCT_graphs");

    static private final SubLString $$$Summary = makeString("Summary");

    static private final SubLString $str_alt102$_______ = makeString("-------");

    static private final SubLString $str_alt103$Results_have_been_written_to_ = makeString("Results have been written to ");



    static private final SubLString $str_alt105$data_kct_results_graphs_ = makeString("data/kct-results/graphs/");

    static private final SubLString $str_alt106$kct_loop_standard_ = makeString("kct-loop-standard-");

    static private final SubLString $str_alt107$_plot_plot = makeString("-plot.plot");

    static private final SubLString $str_alt108$_plot_dat = makeString("-plot.dat");

    static private final SubLString $str_alt109$_plot_png = makeString("-plot.png");

    static private final SubLList $list_alt110 = list(makeInteger(20041201), makeInteger(20060107), makeInteger(20060508));

    static private final SubLString $str_alt111$set_title__KB_Content_Test_Result = makeString("set title \"KB Content Test Results Graph\\n~a - ~a\"\nset xlabel \"Date\"\nset ylabel \"# of tests\"\nset key ~a\nset xdata time\nset timefmt \"%m/%d/%Y\"\nset data style linespoints\nset output ~s\nset terminal png color\nplot \"~a\" \\\nusing 1:2 \\\ntitle \"# of erroring tests\"\\\n, \"~a\" \\\nusing 3:4 \\\ntitle \"# of succeeding tests\"\\\n, \"~a\" \\\nusing 5:6 \\\ntitle \"# of failing tests\"\\\n, \"~a\" \\\nusing 7:8 \\\ntitle \"# of lumpy tests\"\\\n");

    public static final SubLInteger $int$20060508 = makeInteger(20060508);

    static private final SubLString $$$left_bottom = makeString("left bottom");

    static private final SubLString $$$left = makeString("left");



    static private final SubLList $list_alt116 = list(makeKeyword("ANSWER-COUNT"));









    static private final SubLString $str_alt121$_a__a__a__a__a__a__a__a__ = makeString("~a ~a ~a ~a ~a ~a ~a ~a~%");

    static private final SubLString $str_alt122$Sleeping_for_4_hours___ = makeString("Sleeping for 4 hours...");

    public static final SubLInteger $int$24 = makeInteger(24);

    public static final SubLInteger $int$600 = makeInteger(600);

    // // Initializers
    public void declareFunctions() {
        declare_experiment_loop_file();
    }

    public void initializeVariables() {
        init_experiment_loop_file();
    }

    public void runTopLevelForms() {
        setup_experiment_loop_file();
    }
}

