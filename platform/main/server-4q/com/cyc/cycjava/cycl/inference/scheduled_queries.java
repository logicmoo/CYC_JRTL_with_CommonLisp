/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.agenda.*;
import static com.cyc.cycjava.cycl.api_control_vars.*;
import static com.cyc.cycjava.cycl.assertions_high.*;
import static com.cyc.cycjava.cycl.cae_query_search.*;
import static com.cyc.cycjava.cycl.cfasl_kernel.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.constants_high.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.date_utilities.*;
import static com.cyc.cycjava.cycl.deck.*;
import static com.cyc.cycjava.cycl.dictionary.*;
import static com.cyc.cycjava.cycl.dictionary_contents.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.file_utilities.*;
import static com.cyc.cycjava.cycl.format_nil.*;
import static com.cyc.cycjava.cycl.formula_pattern_match.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.function_terms.*;
import static com.cyc.cycjava.cycl.genls.*;
import static com.cyc.cycjava.cycl.hlmt_czer.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.integer_sequence_generator.*;
import static com.cyc.cycjava.cycl.isa.*;
import static com.cyc.cycjava.cycl.iteration.*;
import static com.cyc.cycjava.cycl.kb_accessors.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.kb_mapping_macros.*;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.*;
import static com.cyc.cycjava.cycl.ke.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.mail_utilities.*;
import static com.cyc.cycjava.cycl.misc_utilities.*;
import static com.cyc.cycjava.cycl.mt_relevance_macros.*;
import static com.cyc.cycjava.cycl.narts_high.*;
import static com.cyc.cycjava.cycl.numeric_date_utilities.*;
import static com.cyc.cycjava.cycl.obsolete.*;
import static com.cyc.cycjava.cycl.operation_communication.*;
import static com.cyc.cycjava.cycl.operation_queues.*;
import static com.cyc.cycjava.cycl.pph_main.*;
import static com.cyc.cycjava.cycl.query_utilities.*;
import static com.cyc.cycjava.cycl.queues.*;
import static com.cyc.cycjava.cycl.remote_image.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_graphs.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_mt$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_tv$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_links.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_macros.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.cycjava.cycl.transform_list_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_serialization;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.project.ccf.ccf_reports_by_column;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SCHEDULED-QUERIES
 * source file: /cyc/top/cycl/inference/scheduled-queries.lisp
 * created:     2019/07/03 17:37:44
 */
public final class scheduled_queries extends SubLTranslatedFile implements V12 {
    public static final SubLObject try_to_email_scheduled_report_results(SubLObject file_name, SubLObject successP, SubLObject to, SubLObject cc, SubLObject cyclist, SubLObject mime_type, SubLObject log_string) {
        {
            SubLObject sentP = NIL;
            if (NIL == sentP) {
                {
                    SubLObject csome_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindSMTPAccountsForCyclist, cyclist, UNPROVIDED);
                    SubLObject el_list = NIL;
                    for (el_list = csome_list_var.first(); !((NIL != sentP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , el_list = csome_list_var.first()) {
                        if (NIL == sentP) {
                            {
                                SubLObject csome_list_var_41 = el_list_items(el_list);
                                SubLObject smtp_account = NIL;
                                for (smtp_account = csome_list_var_41.first(); !((NIL != sentP) || (NIL == csome_list_var_41)); csome_list_var_41 = csome_list_var_41.rest() , smtp_account = csome_list_var_41.first()) {
                                    if (NIL == sentP) {
                                        {
                                            SubLObject csome_list_var_42 = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindSMTPInfoForAccount, smtp_account, UNPROVIDED);
                                            SubLObject info = NIL;
                                            for (info = csome_list_var_42.first(); !((NIL != sentP) || (NIL == csome_list_var_42)); csome_list_var_42 = csome_list_var_42.rest() , info = csome_list_var_42.first()) {
                                                {
                                                    SubLObject datum = info;
                                                    SubLObject current = datum;
                                                    SubLObject port = NIL;
                                                    SubLObject host = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt177);
                                                    port = current.first();
                                                    current = current.rest();
                                                    host = current;
                                                    sentP = com.cyc.cycjava.cycl.inference.scheduled_queries.email_scheduled_report_results(file_name, successP, to, cc, host, port, mime_type, log_string);
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
            return sentP;
        }
    }

    public static final SubLObject run_scheduled_report(SubLObject kbq, SubLObject query_event_or_series, SubLObject store) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject report_spec = kb_mapping_utilities.fpred_value_in_any_mt(query_event_or_series, $$scheduledReportSpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject ks = kb_mapping_utilities.fpred_value_in_any_mt(report_spec, $$reportSpecificationTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject delimiter_cycl = kb_mapping_utilities.fpred_value_in_any_mt(report_spec, $const122$reportSpecificationDelimiterChara, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject delimiter = com.cyc.cycjava.cycl.inference.scheduled_queries.get_subl_character(delimiter_cycl);
                SubLObject mime_type = com.cyc.cycjava.cycl.inference.scheduled_queries.get_mime_type_for_delimiter(delimiter);
                SubLObject file_name = com.cyc.cycjava.cycl.inference.scheduled_queries.make_unused_report_file_name(report_spec, delimiter);
                SubLObject pathstring = file_utilities.relative_filename(ccf_reports_by_column.reports_directory(), file_name, UNPROVIDED);
                SubLObject selection_clause_quoted = kb_mapping_utilities.fpred_value_in_any_mt(report_spec, $const123$reportSpecificationSelectionSente, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject selection_clause = (NIL != selection_clause_quoted) ? ((SubLObject) (cycl_utilities.formula_arg1(selection_clause_quoted, UNPROVIDED))) : NIL;
                SubLObject range_spec = Mapping.mapcar($sym124$1_, Sort.sort(kb_mapping_utilities.pred_values_in_any_mt(report_spec, $$reportSpecificationFields, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym126$_), UNPROVIDED));
                SubLObject clobber_multiple_valuesP = makeBoolean(!$$False.eql(kb_mapping_utilities.fpred_value_in_any_mt(report_spec, $const128$reportSpecificationClobberMultipl, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                SubLObject placeholder = kb_mapping_utilities.fpred_value_in_any_mt(report_spec, $$reportSpecificationPlaceholder, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject log_string = NIL;
                if (NIL == delimiter) {
                    delimiter = CHAR_comma;
                }
                {
                    SubLObject log_stream = NIL;
                    try {
                        log_stream = make_private_string_output_stream();
                        ccf_reports_by_column.report_by_column_to_file(list(new SubLObject[]{ $REPORT_KNOWLEDGE_SOURCE, ks, $OUTPUT_FILENAME, file_name, $OUTPUT_DIRECTORY, file_utilities.normal_pathstring(ccf_reports_by_column.reports_directory()), $DELIMITER, delimiter, $SELECTION_SENTENCE, selection_clause, $COLUMN_RANGE, range_spec, $kw136$CLOBBER_MULTIPLE_VALUES_, clobber_multiple_valuesP, $PLACEHOLDER, placeholder, $LOG_STREAM, log_stream, $PROBLEM_STORE, store }));
                        log_string = get_output_stream_string(log_stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(log_stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                if (NIL != file_utilities.file_existsP(pathstring)) {
                    successP = T;
                    if (NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series)) {
                        {
                            SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                            try {
                                api_control_vars.$the_cyclist$.bind(NIL, thread);
                                operation_communication.set_the_cyclist($$ScheduledQueryDaemon);
                                ke.ke_assert(list($$reportSpecificationOutputFile, report_spec, pathstring), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                            } finally {
                                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        ke.ke_kill(report_spec);
                    }
                }
                com.cyc.cycjava.cycl.inference.scheduled_queries.maybe_email_scheduled_report_results(query_event_or_series, file_utilities.pathstring_filename(pathstring), successP, mime_type, log_string);
                return successP;
            }
        }
    }

    public static final SubLObject maybe_email_scheduled_report_results(SubLObject query_event_or_series, SubLObject file_name, SubLObject successP, SubLObject mime_type, SubLObject log_string) {
        {
            SubLObject to = com.cyc.cycjava.cycl.inference.scheduled_queries.get_email_recipients_for_scheduled_query_results(query_event_or_series);
            SubLObject cc = com.cyc.cycjava.cycl.inference.scheduled_queries.get_email_cc_for_scheduled_query_results(query_event_or_series);
            SubLObject cyclist = kb_mapping_utilities.fpred_value_in_any_mt(query_event_or_series, $$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != cyclist) && (NIL != list_utilities.non_empty_list_p(to))) {
                com.cyc.cycjava.cycl.inference.scheduled_queries.try_to_email_scheduled_report_results(file_name, successP, to, cc, cyclist, mime_type, log_string);
            }
        }
        return NIL;
    }

    public static final SubLObject make_unused_report_file_name(SubLObject report_spec, SubLObject delimiter) {
        {
            SubLObject extension = com.cyc.cycjava.cycl.inference.scheduled_queries.extension_for_delimiter(delimiter);
            SubLObject date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
            SubLObject second = numeric_date_utilities.get_universal_second(UNPROVIDED);
            SubLObject file_name = cconcatenate($str_alt144$report_, new SubLObject[]{ format_nil.format_nil_d_no_copy(date), $str_alt145$_, format_nil.format_nil_d_no_copy(second), $str_alt146$_, format_nil.format_nil_a_no_copy(extension) });
            SubLObject reports_directory = ccf_reports_by_column.reports_directory();
            SubLObject counter = ZERO_INTEGER;
            while (NIL != file_utilities.file_existsP(cconcatenate(reports_directory, file_name))) {
                counter = add(counter, ONE_INTEGER);
                file_name = cconcatenate($str_alt144$report_, new SubLObject[]{ format_nil.format_nil_d_no_copy(date), $str_alt145$_, format_nil.format_nil_d_no_copy(second), $str_alt145$_, format_nil.format_nil_d_no_copy(counter), $str_alt146$_, format_nil.format_nil_a_no_copy(extension) });
            } 
            return file_name;
        }
    }

    public static final SubLObject make_log_file_name_from_report_file_name(SubLObject file_name) {
        {
            SubLObject log_file_name = file_name;
            log_file_name = cconcatenate($str_alt181$log_, string_utilities.pre_remove(log_file_name, $str_alt144$report_, UNPROVIDED));
            {
                SubLObject dot_position = list_utilities.position_from_end(CHAR_period, log_file_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != dot_position) {
                    log_file_name = string_utilities.substring(log_file_name, ZERO_INTEGER, dot_position);
                }
            }
            log_file_name = cconcatenate(ccf_reports_by_column.reports_directory(), new SubLObject[]{ log_file_name, $str_alt182$_txt });
            return log_file_name;
        }
    }

    public static final SubLObject get_scheduled_report_results_message(SubLObject file_name, SubLObject successP) {
        if (NIL != successP) {
            {
                SubLObject msg = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    format(stream, $str_alt156$The_results_of_your_report_are_at, file_name);
                    format(stream, $str_alt157$___You_can_retrieve_this_file_at_, ccf_reports_by_column.url_to_retrieve_report_file(file_name));
                    msg = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            close(stream, UNPROVIDED);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                return msg;
            }
        } else {
            return $str_alt158$Your_scheduled_report_did_not_run;
        }
    }

    public static final SubLObject email_scheduled_report_results(SubLObject file_name, SubLObject successP, SubLObject to, SubLObject cc, SubLObject host, SubLObject port, SubLObject mime_type, SubLObject log_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message_string = com.cyc.cycjava.cycl.inference.scheduled_queries.get_scheduled_report_results_message(file_name, successP);
                SubLObject subject = com.cyc.cycjava.cycl.inference.scheduled_queries.get_scheduled_report_results_subject(file_name, successP);
                SubLObject message = mail_message.new_message($str_alt178$scheduled_query_daemon_cyc_com, to.first(), subject, message_string, host, port);
                SubLObject attachment = mail_message.new_message_attachment(cconcatenate(ccf_reports_by_column.reports_directory(), file_name), mime_type, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = to.rest();
                    SubLObject other_to = NIL;
                    for (other_to = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_to = cdolist_list_var.first()) {
                        mail_message.message_add_to(message, other_to);
                    }
                }
                {
                    SubLObject cdolist_list_var = cc;
                    SubLObject recpt = NIL;
                    for (recpt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , recpt = cdolist_list_var.first()) {
                        mail_message.message_add_cc(message, recpt);
                    }
                }
                mail_message.message_add_part(message, attachment);
                if (NIL != string_utilities.non_empty_string_p(log_string)) {
                    {
                        SubLObject logfile = com.cyc.cycjava.cycl.inference.scheduled_queries.make_log_file_name_from_report_file_name(file_name);
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_text(logfile, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt180$Unable_to_open__S, logfile);
                            }
                            {
                                SubLObject stream_43 = stream;
                                princ(log_string, stream_43);
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
                        {
                            SubLObject log_attachment = mail_message.new_message_attachment(logfile, $str_alt143$text_plain, UNPROVIDED, UNPROVIDED);
                            mail_message.message_add_part(message, log_attachment);
                        }
                    }
                }
                return mail_message.send_message(message, UNPROVIDED);
            }
        }
    }

    public static final SubLFile me = new scheduled_queries();

 public static final String myName = "com.cyc.cycjava.cycl.inference.scheduled_queries";


    // deflexical
    /**
     * Priority queue of kb-queries to be run, annotated with the next time they
     * should be run.
     */
    @LispMethod(comment = "Priority queue of kb-queries to be run, annotated with the next time they\r\nshould be run.\ndeflexical\nPriority queue of kb-queries to be run, annotated with the next time they\nshould be run.")
    private static final SubLSymbol $scheduled_query_queue$ = makeSymbol("*SCHEDULED-QUERY-QUEUE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $scheduled_query_queue_lock$ = makeSymbol("*SCHEDULED-QUERY-QUEUE-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ut_offset_to_unix_time$ = makeSymbol("*UT-OFFSET-TO-UNIX-TIME*");

    // deflexical
    // LISTP of KBQs currently running or being prepared for running.
    /**
     * LISTP of KBQs currently running or being prepared for running.
     */
    @LispMethod(comment = "LISTP of KBQs currently running or being prepared for running.\ndeflexical")
    private static final SubLSymbol $in_progress_queries$ = makeSymbol("*IN-PROGRESS-QUERIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $completed_queries$ = makeSymbol("*COMPLETED-QUERIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $scheduled_query_cleanup_lock$ = makeSymbol("*SCHEDULED-QUERY-CLEANUP-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $scheduled_query_results_message_template$ = makeSymbol("*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $scheduled_query_computer_info_mt$ = makeSymbol("*SCHEDULED-QUERY-COMPUTER-INFO-MT*");



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $scheduled_query_runner_isg$ = makeSymbol("*SCHEDULED-QUERY-RUNNER-ISG*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sqd_new_forts_to_cleanup$ = makeSymbol("*SQD-NEW-FORTS-TO-CLEANUP*");



    static private final SubLString $str1$__Scheduling_test_query_____ = makeString("~&Scheduling test query...~%");

    static private final SubLString $str2$__Timed_out_after__D_seconds___ = makeString("~&Timed out after ~D seconds.~%");

    static private final SubLString $str3$Failed_to_get_test_query_results_ = makeString("Failed to get test query results.");

    static private final SubLString $str4$__Got_results___S__ = makeString("~&Got results: ~S~%");

    private static final SubLSymbol ADD_RECURRING_QUERY_SCHEDULE = makeSymbol("ADD-RECURRING-QUERY-SCHEDULE");

    static private final SubLString $$$ScheduledQuerySeries = makeString("ScheduledQuerySeries");





    static private final SubLList $list12 = list(reader_make_constant_shell("PeriodicEventSeries"), reader_make_constant_shell("PurposefulAction"));

    private static final SubLObject $const13$resultsShouldBeEmailedToAddress_C = reader_make_constant_shell("resultsShouldBeEmailedToAddress-CC");

    static private final SubLList $list14 = list(reader_make_constant_shell("InformationGathering"));









    private static final SubLSymbol ADD_SINGLE_QUERY_SCHEDULE = makeSymbol("ADD-SINGLE-QUERY-SCHEDULE");

    static private final SubLString $$$ScheduledQuery = makeString("ScheduledQuery");

    static private final SubLList $list21 = list(reader_make_constant_shell("CycQueryRunning"), reader_make_constant_shell("ScheduledAction"));









    static private final SubLList $list26 = list(reader_make_constant_shell("ScheduledQueryDaemon"));



    private static final SubLSymbol REMOVE_RECURRING_QUERY_SCHEDULE = makeSymbol("REMOVE-RECURRING-QUERY-SCHEDULE");

    static private final SubLList $list29 = list(makeSymbol("THIS-CYCLIST"), makeSymbol("QUERY-SERIES"), makeSymbol("THIS-INTERVAL-TYPE"), makeSymbol("THIS-TASK"));

    private static final SubLObject $$KBQ_FindScheduledQuerySeries = reader_make_constant_shell("KBQ-FindScheduledQuerySeries");

    static private final SubLList $list31 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?CYCLIST"), makeSymbol("?SERIES"), makeSymbol("?INTERVAL-TYPE"), makeSymbol("?TASK"))));

    private static final SubLSymbol REMOVE_SINGLE_QUERY_SCHEDULE = makeSymbol("REMOVE-SINGLE-QUERY-SCHEDULE");

    static private final SubLList $list33 = list(makeSymbol("THIS-CYCLIST"), makeSymbol("QUERY-EVENT"), makeSymbol("THIS-DATE"), makeSymbol("THIS-TASK"));

    private static final SubLObject $$KBQ_FindScheduledQueries = reader_make_constant_shell("KBQ-FindScheduledQueries");

    static private final SubLList $list35 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?CYCLIST"), makeSymbol("?QUERY-EVENT"), makeSymbol("?DATE"), makeSymbol("?TASK"))));





    static private final SubLList $list38 = list(reader_make_constant_shell("directingAgent"), reader_make_constant_shell("ScheduledQueryDaemon"));

    static private final SubLList $list40 = list($BIND, makeSymbol("THIS-SCHEDULER"));



    private static final SubLSymbol THIS_SCHEDULER = makeSymbol("THIS-SCHEDULER");





    private static final SubLSymbol GET_CACHED_RESULTS_FOR_CYCL_QUERY = makeSymbol("GET-CACHED-RESULTS-FOR-CYCL-QUERY");









    static private final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol $PROBLEM_STORE_FILE = makeKeyword("PROBLEM-STORE-FILE");

    static private final SubLSymbol $sym56$_COUNT = makeSymbol("?COUNT");



    static private final SubLList $list58 = list(makeSymbol("?COUNT"));



    static private final SubLList $list60 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    static private final SubLSymbol $sym61$_BINDINGS = makeSymbol("?BINDINGS");



    static private final SubLList $list63 = list(makeSymbol("?BINDINGS"));

    private static final SubLSymbol GET_SCHEDULES_FOR_CYCL_QUERY = makeSymbol("GET-SCHEDULES-FOR-CYCL-QUERY");



    private static final SubLSymbol $NEXT_RUN_DATE = makeKeyword("NEXT-RUN-DATE");



    static private final SubLList $list69 = list(reader_make_constant_shell("resultsShouldBeEmailedToAddress-CC"));

    static private final SubLList $list70 = list(makeKeyword("EMAIL-RECIPIENTS"), makeKeyword("EMAIL-CC"));

    private static final SubLSymbol SCHEDULED_QUERY_SCHEDULED_RUN_TIME = makeSymbol("SCHEDULED-QUERY-SCHEDULED-RUN-TIME");

    private static final SubLString $str73$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLString $$$Scheduled_Query_Queue_Lock = makeString("Scheduled Query Queue Lock");

    private static final SubLInteger $int$2208988800 = makeInteger("2208988800");

    private static final SubLSymbol GET_SCHEDULED_QUERY_QUEUE = makeSymbol("GET-SCHEDULED-QUERY-QUEUE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLList $list79 = list(makeSymbol("GET-SCHEDULED-QUERY-QUEUE"), NIL, NIL);

    private static final SubLSymbol $sym80$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    private static final SubLSymbol $SCHEDULED_RUN_TIME_UNIVERSAL = makeKeyword("SCHEDULED-RUN-TIME-UNIVERSAL");

    private static final SubLSymbol $SCHEDULED_RUN_TIME_UNIX = makeKeyword("SCHEDULED-RUN-TIME-UNIX");

    private static final SubLSymbol $SCHEDULED_RUN_TIME_CYCL = makeKeyword("SCHEDULED-RUN-TIME-CYCL");

    private static final SubLSymbol $SCHEDULED_RUN_TIME_DECODED = makeKeyword("SCHEDULED-RUN-TIME-DECODED");





    private static final SubLSymbol $REPORT_TEMPLATE_GLOSS = makeKeyword("REPORT-TEMPLATE-GLOSS");

    private static final SubLSymbol $scheduled_query_index$ = makeSymbol("*SCHEDULED-QUERY-INDEX*");

    private static final SubLSymbol SCHEDULED_QUERY_P = makeSymbol("SCHEDULED-QUERY-P");

    private static final SubLList $list103 = list(makeSymbol("SCHEDULED-QUERY"), makeSymbol("KBQ"));

    private static final SubLObject $$KBQ_FindOneTimeScheduledQueries = reader_make_constant_shell("KBQ-FindOneTimeScheduledQueries");

    private static final SubLList $list105 = list(makeSymbol("SCHEDULED-QUERY-SERIES"), makeSymbol("KBQ"));

    private static final SubLObject $$KBQ_FindRepeatingScheduledQueries = reader_make_constant_shell("KBQ-FindRepeatingScheduledQueries");

    private static final SubLSymbol ADD_SCHEDULED_QUERY = makeSymbol("ADD-SCHEDULED-QUERY");

    private static final SubLList $list108 = list(reader_make_constant_shell("DaysDuration"), SEVEN_INTEGER);

    private static final SubLObject $const109$KBQ_FindNextFutureStartDateForQue = reader_make_constant_shell("KBQ-FindNextFutureStartDateForQueryInSeries");

    private static final SubLObject $const110$KBQ_FindNextStartDateForQueryInSe = reader_make_constant_shell("KBQ-FindNextStartDateForQueryInSeries");

    private static final SubLObject $const111$KBQ_FindStartDateForScheduledQuer = reader_make_constant_shell("KBQ-FindStartDateForScheduledQuery");

    private static final SubLObject $$KBQ_FindScheduledKBQ = reader_make_constant_shell("KBQ-FindScheduledKBQ");

    private static final SubLSymbol $max_number_of_simultaneous_scheduled_queries$ = makeSymbol("*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*");

    private static final SubLSymbol $active_scheduled_queries$ = makeSymbol("*ACTIVE-SCHEDULED-QUERIES*");

    private static final SubLSymbol GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES = makeSymbol("GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES");

    private static final SubLList $list116 = cons(makeSymbol("PACKAGED-QUERY"), makeSymbol("PROBLEM-STORE"));

    private static final SubLSymbol $PROBLEM_STORE_ID = makeKeyword("PROBLEM-STORE-ID");

    private static final SubLSymbol $TIME_SO_FAR = makeKeyword("TIME-SO-FAR");

    private static final SubLSymbol $aborted_scheduled_queries$ = makeSymbol("*ABORTED-SCHEDULED-QUERIES*");

    private static final SubLSymbol ABORT_SCHEDULED_QUERY = makeSymbol("ABORT-SCHEDULED-QUERY");

    private static final SubLSymbol VALID_PROBLEM_STORE_P = makeSymbol("VALID-PROBLEM-STORE-P");

    private static final SubLSymbol PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");

    private static final SubLString $$$Scheduled_Query_Cleanup_Lock = makeString("Scheduled Query Cleanup Lock");



    private static final SubLString $str130$text_csv = makeString("text/csv");

    private static final SubLString $str131$text_tsv = makeString("text/tsv");

    private static final SubLString $str132$text_plain = makeString("text/plain");

    private static final SubLList $list134 = list(reader_make_constant_shell("stringVersionOfCharacter"), reader_make_constant_shell("termStrings"));

    private static final SubLString $str135$6cb141db_9948_4a5b_b7ae_a86899c41 = makeString("6cb141db-9948-4a5b-b7ae-a86899c41036");

    private static final SubLString $str136$The_following_query_has_been_run_ = makeString("The following query has been run:\n\nName: ~S\nParaphrase: ~S\nResults: ~D~%");

    private static final SubLObject $$KBQ_FindGlossForScheduledQuery = reader_make_constant_shell("KBQ-FindGlossForScheduledQuery");

    private static final SubLObject $$KBQ_FindFormulaForScheduledQuery = reader_make_constant_shell("KBQ-FindFormulaForScheduledQuery");

    private static final SubLString $str140$Scheduled_Query_Results__ = makeString("Scheduled Query Results: ");

    private static final SubLString $$$_answers_for_ = makeString(" answers for ");

    private static final SubLString $$$tsv = makeString("tsv");

    private static final SubLString $$$csv = makeString("csv");

    private static final SubLString $$$txt = makeString("txt");

    private static final SubLString $$$Report_run_successfully = makeString("Report run successfully");

    private static final SubLString $str146$Report_generation_failed__ = makeString("Report generation failed (");

    private static final SubLString $str147$_problems_ = makeString(" problems)");

    static private final SubLList $list148 = list(list(makeSymbol("CYCLIST"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list149 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym152$EL_LIST = makeUninternedSymbol("EL-LIST");

    private static final SubLSymbol $sym153$SMTP_ACCOUNT = makeUninternedSymbol("SMTP-ACCOUNT");

    private static final SubLSymbol $sym154$INFO = makeUninternedSymbol("INFO");

    private static final SubLSymbol NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ = makeSymbol("NEW-CYC-QUERY-FROM-INDEXICALIZED-KBQ");

    private static final SubLObject $$KBQ_FindSMTPAccountsForCyclist = reader_make_constant_shell("KBQ-FindSMTPAccountsForCyclist");

    private static final SubLObject $$KBQ_FindSMTPInfoForAccount = reader_make_constant_shell("KBQ-FindSMTPInfoForAccount");

    private static final SubLList $list161 = cons(makeSymbol("PORT"), makeSymbol("HOST"));

    private static final SubLString $str162$scheduled_query_daemon_cyc_com = makeString("scheduled-query-daemon@cyc.com");





    private static final SubLString $str170$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str175$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str176$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str177$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");



    private static final SubLString $str179$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str182$data_problem_stores_ = makeString("data/problem-stores/");

    private static final SubLString $$$0775 = makeString("0775");

    private static final SubLString $str184$_ = makeString("/");

    private static final SubLString $str185$store_ = makeString("store-");

    private static final SubLString $str186$_cfasl = makeString(".cfasl");

    private static final SubLSymbol $scheduled_query_daemon$ = makeSymbol("*SCHEDULED-QUERY-DAEMON*");



    private static final SubLSymbol $run_scheduled_queries_on_this_imageP$ = makeSymbol("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*");



    private static final SubLObject $$ScheduledQueryDaemon_CW = reader_make_constant_shell("ScheduledQueryDaemon-CW");



    private static final SubLSymbol FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES = makeSymbol("FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES");



    private static final SubLString $$$Scheduled_Query_Runner_ = makeString("Scheduled Query Runner ");

    private static final SubLSymbol RUN_PACKAGED_SCHEDULED_QUERY = makeSymbol("RUN-PACKAGED-SCHEDULED-QUERY");

    private static final SubLString $$$Scheduled_Query_Daemon = makeString("Scheduled Query Daemon");

    private static final SubLSymbol RUN_SCHEDULED_QUERIES = makeSymbol("RUN-SCHEDULED-QUERIES");

    private static final SubLSymbol START_DAEMON_AND_SCHEDULE_QUERY_ONCE = makeSymbol("START-DAEMON-AND-SCHEDULE-QUERY-ONCE");

    private static final SubLSymbol TREE_MATCHES_PATTERN = makeSymbol("TREE-MATCHES-PATTERN");

    private static final SubLList $list204 = list(makeSymbol("SCHEDULED-QUERY-TEST-CASE-TABLES"));

    private static final SubLList $list208 = list(list(NIL, list(list($DATE, makeKeyword("ANYTHING"), makeKeyword("ANSWER-COUNT"), ONE_INTEGER, makeKeyword("PROBLEM-STORE-FILE"), makeKeyword("ANYTHING")))));

    private static final SubLSymbol SCHEDULE_QUERY_ONCE_AND_START_DAEMON = makeSymbol("SCHEDULE-QUERY-ONCE-AND-START-DAEMON");

    private static final SubLList $list210 = list(reader_make_constant_shell("TestQueryFn"), reader_make_constant_shell("CST-WhatIsNegativeThreePlusFive"));

    private static final SubLString $str211$Couldn_t_find_valid_test_query__S = makeString("Couldn't find valid test query ~S");

    private static final SubLList $list212 = list(list(makeSymbol("TIMEOUT"), makeSymbol("TIMED-OUT?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list215 = list(list(makeSymbol("*SQD-NEW-FORTS-TO-CLEANUP*"), list(makeSymbol("CREATE-QUEUE"))));

    private static final SubLList $list218 = list(list(makeSymbol("SQD-CLEANUP-NEW-FORTS")));

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLString $str220$___D_existing_result__P___S___D_n = makeString("~&~D existing result~:P: ~S~%~D new result~:P: ~S~%");

    private static final SubLString $str221$Timed_out_after__S_second__P_duri = makeString("Timed out after ~S second~:P during START-DAEMON-AND-SCHEDULE-QUERY-ONCE.");

    private static final SubLString $str222$__Finished_START_DAEMON_AND_SCHED = makeString("~&Finished START-DAEMON-AND-SCHEDULE-QUERY-ONCE in ~A.~%");

    private static final SubLString $str223$Timed_out_after__S_second__P_duri = makeString("Timed out after ~S second~:P during SCHEDULE-QUERY-ONCE-AND-START-DAEMON");

    private static final SubLString $str224$__Finished_SCHEDULE_QUERY_ONCE_AN = makeString("~&Finished SCHEDULE-QUERY-ONCE-AND-START-DAEMON in ~A.~%");

    private static final SubLString $$$no = makeString("no");

    private static final SubLObject $$ScheduledQueryTesting_Allotment = reader_make_constant_shell("ScheduledQueryTesting-Allotment");

    static {
    }

    // Definitions
    /**
     * Set this image as one that runs scheduled queries, and start it doing so.
     */
    @LispMethod(comment = "Set this image as one that runs scheduled queries, and start it doing so.")
    public static final SubLObject start_scheduled_query_processing_alt(SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = $int$30;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject queue_size = com.cyc.cycjava.cycl.inference.scheduled_queries.start_scheduled_query_processing_internal();
                format_nil.force_format(T, $str_alt1$__Scheduling_test_query_____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject kbq = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_test_query();
                    if (NIL != forts.valid_fortP(kbq)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject results = com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_test_query_and_wait_for_results(kbq, timeout);
                            SubLObject timed_outP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != timed_outP) {
                                format_nil.force_format(T, $str_alt2$__Timed_out_after__D_seconds___, timeout, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == results) {
                                    Errors.error($str_alt3$Failed_to_get_test_query_results_);
                                }
                            }
                            format_nil.force_format(T, $str_alt4$__Got_results___S__, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                return queue_size;
            }
        }
    }

    // Definitions
    /**
     * Set this image as one that runs scheduled queries, and start it doing so.
     */
    @LispMethod(comment = "Set this image as one that runs scheduled queries, and start it doing so.")
    public static SubLObject start_scheduled_query_processing(SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = scheduled_queries.$int$30;
        }
        final SubLObject queue_size = scheduled_queries.start_scheduled_query_processing_internal();
        scheduled_queries.maybe_verify_test_query(timeout);
        return queue_size;
    }

    public static SubLObject maybe_verify_test_query(final SubLObject timeout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        force_format(T, scheduled_queries.$str1$__Scheduling_test_query_____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject kbq = scheduled_queries.scheduled_query_test_query();
        if (NIL != valid_fortP(kbq)) {
            thread.resetMultipleValues();
            final SubLObject results = scheduled_queries.schedule_test_query_and_wait_for_results(kbq, timeout);
            final SubLObject timed_outP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != timed_outP) {
                force_format(T, scheduled_queries.$str2$__Timed_out_after__D_seconds___, timeout, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == results)) {
                Errors.error(scheduled_queries.$str3$Failed_to_get_test_query_results_);
            }
            force_format(T, scheduled_queries.$str4$__Got_results___S__, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Set this image as one that does not run scheduled queries, and stop it doing so if it is.
     */
    @LispMethod(comment = "Set this image as one that does not run scheduled queries, and stop it doing so if it is.")
    public static final SubLObject halt_scheduled_query_processing_alt() {
        com.cyc.cycjava.cycl.inference.scheduled_queries.set_scheduled_query_image_flag(NIL);
        com.cyc.cycjava.cycl.inference.scheduled_queries.clear_scheduled_query_queue();
        return NIL;
    }

    /**
     * Set this image as one that does not run scheduled queries, and stop it doing so if it is.
     */
    @LispMethod(comment = "Set this image as one that does not run scheduled queries, and stop it doing so if it is.")
    public static SubLObject halt_scheduled_query_processing() {
        scheduled_queries.set_scheduled_query_image_flag(NIL);
        scheduled_queries.clear_scheduled_query_queue();
        return NIL;
    }

    /**
     * Schedule QUERY to run periodically once every INTERVAL-TYPE.
     *
     * @param EMAIL-RECIPIENTS,
     * 		EMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?
     */
    @LispMethod(comment = "Schedule QUERY to run periodically once every INTERVAL-TYPE.\r\n\r\n@param EMAIL-RECIPIENTS,\r\n\t\tEMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?")
    public static final SubLObject add_recurring_query_schedule_alt(SubLObject query, SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLTrampolineFile.checkType(query, INDEXED_TERM_P);
        {
            SubLObject list_var = email_recipients;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject list_var = email_carbon_copies;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject series = com.cyc.cycjava.cycl.inference.scheduled_queries.make_recurring_query_schedule_assertions(query, interval_type, email_recipients, email_carbon_copies, cyclist, task);
            if (NIL != series) {
                com.cyc.cycjava.cycl.inference.scheduled_queries.note_query_scheduling_complete(series);
            }
            return series;
        }
    }

    /**
     * Schedule QUERY to run periodically once every INTERVAL-TYPE.
     *
     * @param EMAIL-RECIPIENTS,
     * 		EMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?
     */
    @LispMethod(comment = "Schedule QUERY to run periodically once every INTERVAL-TYPE.\r\n\r\n@param EMAIL-RECIPIENTS,\r\n\t\tEMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?")
    public static SubLObject add_recurring_query_schedule(final SubLObject query, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        assert NIL != indexed_term_p(query) : "! kb_indexing_datastructures.indexed_term_p(query) " + ("kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) ") + query;
        SubLObject list_var = email_recipients;
        assert NIL != non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        list_var = email_carbon_copies;
        assert NIL != non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        cdolist_list_var = list_var;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject series = scheduled_queries.make_recurring_query_schedule_assertions(query, interval_type, email_recipients, email_carbon_copies, cyclist, task);
        if (NIL != series) {
            scheduled_queries.note_query_scheduling_complete(series);
        }
        return series;
    }

    public static final SubLObject make_recurring_query_schedule_assertions_alt(SubLObject query, SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = com.cyc.cycjava.cycl.inference.scheduled_queries.get_query_scheduling_mt(cyclist, task);
                SubLObject series = ke.ke_create_now($$$ScheduledQuerySeries, UNPROVIDED);
                SubLObject failP = sublisp_null(series);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist(cyclist);
                        {
                            SubLObject cdolist_list_var = $list_alt12;
                            SubLObject v_isa = NIL;
                            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                ke.ke_assert_now(list($$isa, series, v_isa), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = email_recipients;
                            SubLObject recpt = NIL;
                            for (recpt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , recpt = cdolist_list_var.first()) {
                                ke.ke_assert_now(list(com.cyc.cycjava.cycl.inference.scheduled_queries.results_should_be_emailed_to_address(), series, recpt), mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = email_carbon_copies;
                            SubLObject recpt = NIL;
                            for (recpt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , recpt = cdolist_list_var.first()) {
                                ke.ke_assert_now(list($const13$resultsShouldBeEmailedToAddress_C, series, recpt), mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = list(list($$isa, series, com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_series_type(query, cyclist)), listS($$isa, series, $list_alt14), list($$definingMt, series, mt), list($$intervalTypeOfPeriodicSeries, series, interval_type));
                            SubLObject sentence = NIL;
                            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                                    failP = T;
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != failP ? ((SubLObject) (NIL)) : series;
            }
        }
    }

    public static SubLObject make_recurring_query_schedule_assertions(final SubLObject query, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = scheduled_queries.get_query_scheduling_mt(cyclist, task);
        final SubLObject series = ke_create_now(scheduled_queries.$$$ScheduledQuerySeries, UNPROVIDED);
        SubLObject failP = sublisp_null(series);
        scheduled_queries.sqd_note_new_fort(series);
        final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
        try {
            $the_cyclist$.bind(NIL, thread);
            set_the_cyclist(cyclist);
            SubLObject cdolist_list_var = scheduled_queries.$list12;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke_assert_now(list(scheduled_queries.$$isa, series, v_isa), scheduled_queries.$$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
            cdolist_list_var = email_recipients;
            SubLObject recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke_assert_now(list(scheduled_queries.results_should_be_emailed_to_address(), series, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = email_carbon_copies;
            recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke_assert_now(list(scheduled_queries.$const13$resultsShouldBeEmailedToAddress_C, series, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = list(list(scheduled_queries.$$isa, series, scheduled_queries.scheduled_query_series_type(query, cyclist)), listS(scheduled_queries.$$isa, series, scheduled_queries.$list14), list(scheduled_queries.$$definingMt, series, mt), list(scheduled_queries.$$intervalTypeOfPeriodicSeries, series, interval_type));
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                    failP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            $the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL != failP ? NIL : series;
    }

    public static final SubLObject note_query_scheduling_complete_alt(SubLObject event_or_series) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject failP = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist($$ScheduledQueryDaemon);
                        if (NIL == ke.ke_assert_now(list($$querySchedulingComplete, event_or_series), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
                            failP = T;
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return makeBoolean(NIL == failP);
            }
        }
    }

    public static SubLObject note_query_scheduling_complete(final SubLObject event_or_series) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failP = NIL;
        final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
        try {
            $the_cyclist$.bind(NIL, thread);
            set_the_cyclist(scheduled_queries.$$ScheduledQueryDaemon);
            if (NIL == ke_assert_now(list(scheduled_queries.$$querySchedulingComplete, event_or_series), scheduled_queries.$$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
                failP = T;
            }
        } finally {
            $the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == failP);
    }

    /**
     * Schedule QUERY to run once on DATE.
     *
     * @param EMAIL-RECIPIENTS,
     * 		EMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?
     */
    @LispMethod(comment = "Schedule QUERY to run once on DATE.\r\n\r\n@param EMAIL-RECIPIENTS,\r\n\t\tEMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?")
    public static final SubLObject add_single_query_schedule_alt(SubLObject query, SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLTrampolineFile.checkType(query, INDEXED_TERM_P);
        {
            SubLObject list_var = email_recipients;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject list_var = email_carbon_copies;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject event = com.cyc.cycjava.cycl.inference.scheduled_queries.make_single_query_schedule_assertions(query, date, email_recipients, email_carbon_copies, cyclist, task);
            if (NIL != event) {
                com.cyc.cycjava.cycl.inference.scheduled_queries.note_query_scheduling_complete(event);
            }
            return event;
        }
    }

    /**
     * Schedule QUERY to run once on DATE.
     *
     * @param EMAIL-RECIPIENTS,
     * 		EMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?
     */
    @LispMethod(comment = "Schedule QUERY to run once on DATE.\r\n\r\n@param EMAIL-RECIPIENTS,\r\n\t\tEMAIL-CARBON-COPIES listp of email addresses : Whom should we notify when query has been run?")
    public static SubLObject add_single_query_schedule(final SubLObject query, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        assert NIL != indexed_term_p(query) : "! kb_indexing_datastructures.indexed_term_p(query) " + ("kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) ") + query;
        SubLObject list_var = email_recipients;
        assert NIL != non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        list_var = email_carbon_copies;
        assert NIL != non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        cdolist_list_var = list_var;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject event = scheduled_queries.make_single_query_schedule_assertions(query, date, email_recipients, email_carbon_copies, cyclist, task);
        if (NIL != event) {
            scheduled_queries.note_query_scheduling_complete(event);
        }
        return event;
    }

    public static final SubLObject make_single_query_schedule_assertions_alt(SubLObject query, SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = com.cyc.cycjava.cycl.inference.scheduled_queries.get_query_scheduling_mt(cyclist, task);
                SubLObject scheduled_query = ke.ke_create_now($$$ScheduledQuery, UNPROVIDED);
                SubLObject failP = sublisp_null(scheduled_query);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist(cyclist);
                        {
                            SubLObject cdolist_list_var = $list_alt21;
                            SubLObject v_isa = NIL;
                            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                ke.ke_assert_now(list($$isa, scheduled_query, v_isa), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = email_recipients;
                            SubLObject recpt = NIL;
                            for (recpt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , recpt = cdolist_list_var.first()) {
                                ke.ke_assert_now(list(com.cyc.cycjava.cycl.inference.scheduled_queries.results_should_be_emailed_to_address(), scheduled_query, recpt), mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = email_carbon_copies;
                            SubLObject recpt = NIL;
                            for (recpt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , recpt = cdolist_list_var.first()) {
                                ke.ke_assert_now(list($const13$resultsShouldBeEmailedToAddress_C, scheduled_query, recpt), mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = list(list($$isa, scheduled_query, list($$ScheduledFn, list($$CycQueryRunningFromFn, query))), list($$scheduledStartingDate, scheduled_query, date), list($$definingMt, scheduled_query, mt), listS($$directingAgent, scheduled_query, $list_alt26), list($$scheduledBy, scheduled_query, cyclist));
                            SubLObject sentence = NIL;
                            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                                    failP = T;
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != failP ? ((SubLObject) (NIL)) : scheduled_query;
            }
        }
    }

    public static SubLObject make_single_query_schedule_assertions(final SubLObject query, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = scheduled_queries.get_query_scheduling_mt(cyclist, task);
        final SubLObject scheduled_query = ke_create_now(scheduled_queries.$$$ScheduledQuery, UNPROVIDED);
        SubLObject failP = sublisp_null(scheduled_query);
        scheduled_queries.sqd_note_new_fort(scheduled_query);
        final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
        try {
            $the_cyclist$.bind(NIL, thread);
            set_the_cyclist(cyclist);
            SubLObject cdolist_list_var = scheduled_queries.$list21;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke_assert_now(list(scheduled_queries.$$isa, scheduled_query, v_isa), scheduled_queries.$$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
            cdolist_list_var = email_recipients;
            SubLObject recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke_assert_now(list(scheduled_queries.results_should_be_emailed_to_address(), scheduled_query, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = email_carbon_copies;
            recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke_assert_now(list(scheduled_queries.$const13$resultsShouldBeEmailedToAddress_C, scheduled_query, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = list(list(scheduled_queries.$$isa, scheduled_query, list(scheduled_queries.$$ScheduledFn, list(scheduled_queries.$$CycQueryRunningFromFn, query))), list(scheduled_queries.$$scheduledStartingDate, scheduled_query, date), list(scheduled_queries.$$definingMt, scheduled_query, mt), listS(scheduled_queries.$$directingAgent, scheduled_query, scheduled_queries.$list26), list(scheduled_queries.$$scheduledBy, scheduled_query, cyclist));
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                    failP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            $the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL != failP ? NIL : scheduled_query;
    }

    /**
     * Unschedule QUERY to run periodically once every INTERVAL-TYPE.
     */
    @LispMethod(comment = "Unschedule QUERY to run periodically once every INTERVAL-TYPE.")
    public static final SubLObject remove_recurring_query_schedule_alt(SubLObject query, SubLObject interval_type, SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query, INDEXED_TERM_P);
            {
                SubLObject cdolist_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindScheduledQuerySeries, query, $list_alt31);
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    {
                        SubLObject datum = result;
                        SubLObject current = datum;
                        SubLObject this_cyclist = NIL;
                        SubLObject query_series = NIL;
                        SubLObject this_interval_type = NIL;
                        SubLObject this_task = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt29);
                        this_cyclist = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt29);
                        query_series = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt29);
                        this_interval_type = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt29);
                        this_task = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((this_cyclist.equal(cyclist) && this_task.equal(task)) && this_interval_type.equal(interval_type)) {
                                {
                                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                    try {
                                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                                        operation_communication.set_the_cyclist(cyclist);
                                        ke.ke_kill(query_series);
                                    } finally {
                                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt29);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Unschedule QUERY to run periodically once every INTERVAL-TYPE.
     */
    @LispMethod(comment = "Unschedule QUERY to run periodically once every INTERVAL-TYPE.")
    public static SubLObject remove_recurring_query_schedule(final SubLObject query, final SubLObject interval_type, SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "! kb_indexing_datastructures.indexed_term_p(query) " + ("kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) ") + query;
        SubLObject cdolist_list_var = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindScheduledQuerySeries, query, scheduled_queries.$list31);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject this_cyclist = NIL;
            SubLObject query_series = NIL;
            SubLObject this_interval_type = NIL;
            SubLObject this_task = NIL;
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list29);
            this_cyclist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list29);
            query_series = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list29);
            this_interval_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list29);
            this_task = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((this_cyclist.equal(cyclist) && this_task.equal(task)) && this_interval_type.equal(interval_type)) {
                    scheduled_queries.remove_query_or_series_from_queue(query_series);
                    final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
                    try {
                        $the_cyclist$.bind(NIL, thread);
                        set_the_cyclist(cyclist);
                        ke_kill(query_series);
                    } finally {
                        $the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, scheduled_queries.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Unschedule QUERY to run once on DATE.
     */
    @LispMethod(comment = "Unschedule QUERY to run once on DATE.")
    public static final SubLObject remove_single_query_schedule_alt(SubLObject query, SubLObject date, SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query, INDEXED_TERM_P);
            {
                SubLObject cdolist_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindScheduledQueries, query, $list_alt35);
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    {
                        SubLObject datum = result;
                        SubLObject current = datum;
                        SubLObject this_cyclist = NIL;
                        SubLObject query_event = NIL;
                        SubLObject this_date = NIL;
                        SubLObject this_task = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt33);
                        this_cyclist = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt33);
                        query_event = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt33);
                        this_date = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt33);
                        this_task = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((this_cyclist.equal(cyclist) && this_task.equal(task)) && this_date.equal(date)) {
                                {
                                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                    try {
                                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                                        operation_communication.set_the_cyclist(cyclist);
                                        ke.ke_kill(query_event);
                                    } finally {
                                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt33);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Unschedule QUERY to run once on DATE.
     */
    @LispMethod(comment = "Unschedule QUERY to run once on DATE.")
    public static SubLObject remove_single_query_schedule(final SubLObject query, final SubLObject date, SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "! kb_indexing_datastructures.indexed_term_p(query) " + ("kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) ") + query;
        SubLObject cdolist_list_var = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindScheduledQueries, query, scheduled_queries.$list35);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject this_cyclist = NIL;
            SubLObject query_event = NIL;
            SubLObject this_date = NIL;
            SubLObject this_task = NIL;
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list33);
            this_cyclist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list33);
            query_event = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list33);
            this_date = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list33);
            this_task = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((this_cyclist.equal(cyclist) && this_task.equal(task)) && this_date.equal(date)) {
                    scheduled_queries.remove_query_or_series_from_queue(query_event);
                    final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
                    try {
                        $the_cyclist$.bind(NIL, thread);
                        set_the_cyclist(cyclist);
                        ke_kill(query_event);
                    } finally {
                        $the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, scheduled_queries.$list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject scheduled_query_series_type_alt(SubLObject query, SubLObject cyclist) {
        return list($$SeriesOfTypeFn, listS($$SubcollectionOfWithRelationToFn, list($$SubcollectionOfWithRelationToFn, list($$ScheduledFn, list($$CycQueryRunningFromFn, query)), $$scheduledBy, cyclist), $list_alt38));
    }

    public static SubLObject scheduled_query_series_type(final SubLObject query, final SubLObject cyclist) {
        return list(scheduled_queries.$$SeriesOfTypeFn, listS(scheduled_queries.$$SubcollectionOfWithRelationToFn, list(scheduled_queries.$$SubcollectionOfWithRelationToFn, list(scheduled_queries.$$ScheduledFn, list(scheduled_queries.$$CycQueryRunningFromFn, query)), scheduled_queries.$$scheduledBy, cyclist), scheduled_queries.$list38));
    }

    public static final SubLObject get_series_scheduler_alt(SubLObject series) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_series_type($ANYTHING, $list_alt40);
                SubLObject scheduler = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject v_isa = NIL;
                            SubLObject pred_var = $$isa;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(series, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(series, ONE_INTEGER, pred_var);
                                    SubLObject done_var = scheduler;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_1 = scheduler;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                    if (NIL != valid_3) {
                                                                        v_isa = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_utilities.hl_to_el(v_isa), template);
                                                                            SubLObject v_bindings = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != success) {
                                                                                {
                                                                                    SubLObject this_scheduler = list_utilities.alist_lookup_without_values(v_bindings, THIS_SCHEDULER, UNPROVIDED, UNPROVIDED);
                                                                                    scheduler = this_scheduler;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_1 = makeBoolean((NIL == valid_3) || (NIL != scheduler));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != scheduler));
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
                return scheduler;
            }
        }
    }

    public static SubLObject get_series_scheduler(final SubLObject series) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = scheduled_queries.scheduled_query_series_type($ANYTHING, scheduled_queries.$list40);
        SubLObject scheduler = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(scheduled_queries.$$EverythingPSC, thread);
            SubLObject v_isa = NIL;
            final SubLObject pred_var = scheduled_queries.$$isa;
            if (NIL != do_gaf_arg_index_key_validator(series, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(series, ONE_INTEGER, pred_var);
                SubLObject done_var = scheduler;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$1 = scheduler;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                if (NIL != valid_$3) {
                                    v_isa = gaf_arg(assertion, TWO_INTEGER);
                                    thread.resetMultipleValues();
                                    final SubLObject success = formula_matches_pattern(hl_to_el(v_isa), template);
                                    final SubLObject v_bindings = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != success) {
                                        final SubLObject this_scheduler = scheduler = alist_lookup_without_values(v_bindings, scheduled_queries.THIS_SCHEDULER, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != scheduler));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != scheduler));
                } 
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return scheduler;
    }

    public static final SubLObject get_query_scheduling_mt_alt(SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if ((NIL != cyclist) && (NIL != task)) {
            return hlmt_czer.canonicalize_hlmt(make_binary_formula($$ModelMtByUserAndTaskFn, cyclist, task));
        } else {
            return $$BaseKB;
        }
    }

    public static SubLObject get_query_scheduling_mt(SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        if ((NIL != cyclist) && (NIL != task)) {
            return canonicalize_hlmt(make_binary_formula(scheduled_queries.$$ModelMtByUserAndTaskFn, cyclist, task));
        }
        return scheduled_queries.$$BaseKB;
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P; (:date, :answer-count, :problem-store-file).
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P; (:date, :answer-count, :problem-store-file).")
    public static final SubLObject get_cached_results_for_cycl_query_alt(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query, INDEXED_TERM_P);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject inference = NIL;
                            SubLObject pred_var = $$queryInferences;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_5 = NIL;
                                                            SubLObject token_var_6 = NIL;
                                                            while (NIL == done_var_5) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
                                                                    if (NIL != valid_7) {
                                                                        inference = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                        if (NIL != indexed_term_p(inference)) {
                                                                            {
                                                                                SubLObject start_time = kb_mapping_utilities.fpred_value(inference, $$inferenceStartTime, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                SubLObject answer_count = com.cyc.cycjava.cycl.inference.scheduled_queries.get_reified_inference_answer_count(inference);
                                                                                SubLObject problem_store = kb_mapping_utilities.fpred_value(inference, $$cycProblemStoreInferences, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                                                                SubLObject path = NIL;
                                                                                SubLObject save_date = NIL;
                                                                                SubLObject date = NIL;
                                                                                if ((NIL != indexed_term_p(problem_store)) && answer_count.isInteger()) {
                                                                                    {
                                                                                        SubLObject this_path = NIL;
                                                                                        SubLObject pred_var_8 = $$problemStoreSnapshotPathnames;
                                                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(problem_store, NIL, pred_var_8)) {
                                                                                            {
                                                                                                SubLObject iterator_var_9 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(problem_store, NIL, pred_var_8);
                                                                                                SubLObject done_var_10 = NIL;
                                                                                                SubLObject token_var_11 = NIL;
                                                                                                while (NIL == done_var_10) {
                                                                                                    {
                                                                                                        SubLObject final_index_spec_12 = iteration.iteration_next_without_values_macro_helper(iterator_var_9, token_var_11);
                                                                                                        SubLObject valid_13 = makeBoolean(token_var_11 != final_index_spec_12);
                                                                                                        if (NIL != valid_13) {
                                                                                                            {
                                                                                                                SubLObject final_index_iterator_14 = NIL;
                                                                                                                try {
                                                                                                                    final_index_iterator_14 = kb_mapping_macros.new_final_index_iterator(final_index_spec_12, $GAF, NIL, NIL);
                                                                                                                    {
                                                                                                                        SubLObject done_var_15 = NIL;
                                                                                                                        SubLObject token_var_16 = NIL;
                                                                                                                        while (NIL == done_var_15) {
                                                                                                                            {
                                                                                                                                SubLObject assertion_17 = iteration.iteration_next_without_values_macro_helper(final_index_iterator_14, token_var_16);
                                                                                                                                SubLObject valid_18 = makeBoolean(token_var_16 != assertion_17);
                                                                                                                                if (NIL != valid_18) {
                                                                                                                                    this_path = assertions_high.gaf_arg(assertion_17, TWO_INTEGER);
                                                                                                                                    if (NIL != file_utilities.file_existsP(this_path)) {
                                                                                                                                        {
                                                                                                                                            SubLObject file_write_date = Filesys.file_write_date(this_path);
                                                                                                                                            if (((NIL == path) || (NIL == save_date)) || ((NIL != file_write_date) && file_write_date.numL(save_date))) {
                                                                                                                                                path = this_path;
                                                                                                                                                save_date = file_write_date;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                done_var_15 = makeBoolean(NIL == valid_18);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                            if (NIL != final_index_iterator_14) {
                                                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_14);
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        done_var_10 = makeBoolean(NIL == valid_13);
                                                                                                    }
                                                                                                } 
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (NIL != path) {
                                                                                        {
                                                                                            SubLObject utime = (NIL != save_date) ? ((SubLObject) (save_date)) : NIL != start_time ? ((SubLObject) (date_utilities.cycl_date_to_universal_time(start_time))) : NIL;
                                                                                            if (NIL != utime) {
                                                                                                date = cconcatenate(numeric_date_utilities.datestring(numeric_date_utilities.get_universal_date(utime, UNPROVIDED)), new SubLObject[]{ $str_alt52$_, numeric_date_utilities.secondstring(numeric_date_utilities.get_universal_second(utime)) });
                                                                                            }
                                                                                        }
                                                                                        ans = cons(list($DATE, date, $ANSWER_COUNT, answer_count, $PROBLEM_STORE_FILE, path), ans);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_5 = makeBoolean(NIL == valid_7);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
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
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P; (:date, :answer-count, :problem-store-file).
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P; (:date, :answer-count, :problem-store-file).")
    public static SubLObject get_cached_results_for_cycl_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "! kb_indexing_datastructures.indexed_term_p(query) " + ("kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) ") + query;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(scheduled_queries.$$EverythingPSC, thread);
            SubLObject inference = NIL;
            final SubLObject pred_var = scheduled_queries.$$queryInferences;
            if (NIL != do_gaf_arg_index_key_validator(query, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(query, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$5 = NIL;
                            final SubLObject token_var_$6 = NIL;
                            while (NIL == done_var_$5) {
                                final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                if (NIL != valid_$7) {
                                    inference = gaf_arg(assertion, TWO_INTEGER);
                                    if (NIL != indexed_term_p(inference)) {
                                        final SubLObject start_time = fpred_value(inference, scheduled_queries.$$inferenceStartTime, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        final SubLObject answer_count = scheduled_queries.get_reified_inference_answer_count(inference);
                                        final SubLObject problem_store = fpred_value(inference, scheduled_queries.$$cycProblemStoreInferences, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                        SubLObject path = NIL;
                                        SubLObject save_date = NIL;
                                        SubLObject date = NIL;
                                        if ((NIL != indexed_term_p(problem_store)) && answer_count.isInteger()) {
                                            SubLObject this_path = NIL;
                                            final SubLObject pred_var_$8 = scheduled_queries.$$problemStoreSnapshotPathnames;
                                            if (NIL != do_gaf_arg_index_key_validator(problem_store, NIL, pred_var_$8)) {
                                                final SubLObject iterator_var_$9 = new_gaf_arg_final_index_spec_iterator(problem_store, NIL, pred_var_$8);
                                                SubLObject done_var_$6 = NIL;
                                                final SubLObject token_var_$7 = NIL;
                                                while (NIL == done_var_$6) {
                                                    final SubLObject final_index_spec_$12 = iteration_next_without_values_macro_helper(iterator_var_$9, token_var_$7);
                                                    final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(final_index_spec_$12));
                                                    if (NIL != valid_$8) {
                                                        SubLObject final_index_iterator_$14 = NIL;
                                                        try {
                                                            final_index_iterator_$14 = new_final_index_iterator(final_index_spec_$12, $GAF, NIL, NIL);
                                                            SubLObject done_var_$7 = NIL;
                                                            final SubLObject token_var_$8 = NIL;
                                                            while (NIL == done_var_$7) {
                                                                final SubLObject assertion_$17 = iteration_next_without_values_macro_helper(final_index_iterator_$14, token_var_$8);
                                                                final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion_$17));
                                                                if (NIL != valid_$9) {
                                                                    this_path = gaf_arg(assertion_$17, TWO_INTEGER);
                                                                    if (NIL != file_existsP(this_path)) {
                                                                        final SubLObject file_write_date = Filesys.file_write_date(this_path);
                                                                        if (((NIL == path) || (NIL == save_date)) || ((NIL != file_write_date) && file_write_date.numL(save_date))) {
                                                                            path = this_path;
                                                                            save_date = file_write_date;
                                                                        }
                                                                    }
                                                                }
                                                                done_var_$7 = makeBoolean(NIL == valid_$9);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator_$14) {
                                                                    destroy_final_index_iterator(final_index_iterator_$14);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var_$6 = makeBoolean(NIL == valid_$8);
                                                } 
                                            }
                                            if (NIL != path) {
                                                final SubLObject utime = (NIL != save_date) ? save_date : NIL != start_time ? cycl_date_to_universal_time(start_time) : NIL;
                                                if (NIL != utime) {
                                                    date = cconcatenate(datestring(get_universal_date(utime, UNPROVIDED)), new SubLObject[]{ scheduled_queries.$$$_, secondstring(get_universal_second(utime)) });
                                                }
                                                ans = cons(list($DATE, date, $ANSWER_COUNT, answer_count, scheduled_queries.$PROBLEM_STORE_FILE, path), ans);
                                            }
                                        }
                                    }
                                }
                                done_var_$5 = makeBoolean(NIL == valid_$7);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject get_reified_inference_answer_count_alt(SubLObject inference) {
        {
            SubLObject count = ask_utilities.query_variable($sym56$_COUNT, listS($$inferenceAnswerCount, inference, $list_alt58), $$InferencePSC, $list_alt60).first();
            if (NIL == count) {
                {
                    SubLObject csome_list_var = ask_utilities.query_variable($sym61$_BINDINGS, listS($$inferenceBindings, inference, $list_alt63), $$InferencePSC, $list_alt60);
                    SubLObject v_bindings = NIL;
                    for (v_bindings = csome_list_var.first(); !((NIL != count) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_bindings = csome_list_var.first()) {
                        count = (NIL != el_set_p(v_bindings)) ? ((SubLObject) (length(el_set_items(v_bindings)))) : NIL;
                    }
                }
            }
            return count;
        }
    }

    public static SubLObject get_reified_inference_answer_count(final SubLObject inference) {
        SubLObject count = ask_utilities.query_variable(scheduled_queries.$sym56$_COUNT, listS(scheduled_queries.$$inferenceAnswerCount, inference, scheduled_queries.$list58), scheduled_queries.$$InferencePSC, scheduled_queries.$list60).first();
        if (NIL == count) {
            SubLObject csome_list_var;
            SubLObject v_bindings;
            for (csome_list_var = ask_utilities.query_variable(scheduled_queries.$sym61$_BINDINGS, listS(scheduled_queries.$$inferenceBindings, inference, scheduled_queries.$list63), scheduled_queries.$$InferencePSC, scheduled_queries.$list60), v_bindings = NIL, v_bindings = csome_list_var.first(); (NIL == count) && (NIL != csome_list_var); count = (NIL != el_set_p(v_bindings)) ? length(el_set_items(v_bindings)) : NIL , csome_list_var = csome_list_var.rest() , v_bindings = csome_list_var.first()) {
            }
        }
        return count;
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P; (:next-run-date :recurrence-interval :email-recipients :email-cc).
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P; (:next-run-date :recurrence-interval :email-recipients :email-cc).")
    public static final SubLObject get_schedules_for_cycl_query_alt(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query, INDEXED_TERM_P);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject query_event_or_series = NIL;
                            SubLObject pred_var = $$scheduledQuerySpecification;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query, TWO_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query, TWO_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_21 = NIL;
                                                            SubLObject token_var_22 = NIL;
                                                            while (NIL == done_var_21) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                                                    SubLObject valid_23 = makeBoolean(token_var_22 != assertion);
                                                                    if (NIL != valid_23) {
                                                                        query_event_or_series = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                        {
                                                                            SubLObject cycl_date = com.cyc.cycjava.cycl.inference.scheduled_queries.find_next_scheduled_date(query_event_or_series, NIL);
                                                                            SubLObject plist = NIL;
                                                                            if (NIL != cycl_date) {
                                                                                plist = putf(plist, $NEXT_RUN_DATE, cycl_date);
                                                                                if (NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series)) {
                                                                                    {
                                                                                        SubLObject recurrence_interval = kb_mapping_utilities.fpred_value(query_event_or_series, $$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        if (NIL != recurrence_interval) {
                                                                                            plist = putf(plist, $RECURRENCE_INTERVAL, recurrence_interval);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject pred = NIL;
                                                                                    SubLObject pred_24 = NIL;
                                                                                    SubLObject key = NIL;
                                                                                    SubLObject key_25 = NIL;
                                                                                    for (pred = bq_cons(com.cyc.cycjava.cycl.inference.scheduled_queries.results_should_be_emailed_to_address(), $list_alt69), pred_24 = pred.first(), key = $list_alt70, key_25 = key.first(); !((NIL == key) && (NIL == pred)); pred = pred.rest() , pred_24 = pred.first() , key = key.rest() , key_25 = key.first()) {
                                                                                        {
                                                                                            SubLObject email = kb_mapping_utilities.pred_values(query_event_or_series, pred_24, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                                                                                            if (NIL != list_utilities.non_empty_list_p(email)) {
                                                                                                plist = putf(plist, key_25, email);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ans = cons(plist, ans);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_21 = makeBoolean(NIL == valid_23);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
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
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P; (:next-run-date :recurrence-interval :email-recipients :email-cc).
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P; (:next-run-date :recurrence-interval :email-recipients :email-cc).")
    public static SubLObject get_schedules_for_cycl_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "! kb_indexing_datastructures.indexed_term_p(query) " + ("kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) ") + query;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(scheduled_queries.$$EverythingPSC, thread);
            SubLObject query_event_or_series = NIL;
            final SubLObject pred_var = scheduled_queries.$$scheduledQuerySpecification;
            if (NIL != do_gaf_arg_index_key_validator(query, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(query, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$21 = NIL;
                            final SubLObject token_var_$22 = NIL;
                            while (NIL == done_var_$21) {
                                final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(assertion));
                                if (NIL != valid_$23) {
                                    query_event_or_series = gaf_arg(assertion, ONE_INTEGER);
                                    final SubLObject cycl_date = scheduled_queries.find_next_scheduled_date(query_event_or_series, NIL);
                                    SubLObject plist = NIL;
                                    if (NIL != cycl_date) {
                                        plist = putf(plist, scheduled_queries.$NEXT_RUN_DATE, cycl_date);
                                        if (NIL != isa_in_any_mtP(query_event_or_series, scheduled_queries.$$Series)) {
                                            final SubLObject recurrence_interval = fpred_value(query_event_or_series, scheduled_queries.$$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != recurrence_interval) {
                                                plist = putf(plist, $RECURRENCE_INTERVAL, recurrence_interval);
                                            }
                                        }
                                        SubLObject pred = NIL;
                                        SubLObject pred_$24 = NIL;
                                        SubLObject key = NIL;
                                        SubLObject key_$25 = NIL;
                                        pred = bq_cons(scheduled_queries.results_should_be_emailed_to_address(), scheduled_queries.$list69);
                                        pred_$24 = pred.first();
                                        key = scheduled_queries.$list70;
                                        key_$25 = key.first();
                                        while ((NIL != key) || (NIL != pred)) {
                                            final SubLObject email = pred_values(query_event_or_series, pred_$24, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                                            if (NIL != non_empty_list_p(email)) {
                                                plist = putf(plist, key_$25, email);
                                            }
                                            pred = pred.rest();
                                            pred_$24 = pred.first();
                                            key = key.rest();
                                            key_$25 = key.first();
                                        } 
                                        ans = cons(plist, ans);
                                    }
                                }
                                done_var_$21 = makeBoolean(NIL == valid_$23);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject scheduled_query_queue() {
        if (scheduled_queries.$scheduled_query_queue$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject init_value = queues.create_p_queue(NIL, scheduled_queries.SCHEDULED_QUERY_SCHEDULED_RUN_TIME, UNPROVIDED);
            if (init_value == $UNINITIALIZED) {
                Errors.error(scheduled_queries.$str73$Unable_to_initialize__A__, scheduled_queries.$scheduled_query_queue$.getGlobalValue());
            }
            scheduled_queries.$scheduled_query_queue$.setGlobalValue(init_value);
        }
        return scheduled_queries.$scheduled_query_queue$.getGlobalValue();
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P of queries currently scheduled to be run on MACHINE-NAME at PORT, or on this image if unspecified.
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P of queries currently scheduled to be run on MACHINE-NAME at PORT, or on this image if unspecified.")
    public static final SubLObject get_scheduled_query_queue_alt(SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject queue = NIL;
                if ((NIL != machine_name) && (NIL != port)) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        {
                                            SubLObject connection = remote_image.new_remote_image_connection(remote_image.new_remote_image(machine_name, port, UNPROVIDED));
                                            try {
                                                remote_image.open_remote_image_connection(connection);
                                                {
                                                    SubLObject _prev_bind_0_27 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                                                    try {
                                                        remote_image.$current_remote_image_connection$.bind(connection, thread);
                                                        queue = remote_image.current_remote_image_connection_eval($list_alt77);
                                                    } finally {
                                                        remote_image.$current_remote_image_connection$.rebind(_prev_bind_0_27, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        remote_image.close_remote_image_connection(connection);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                } else {
                    queue = Mapping.mapcar(SCHEDULED_QUERY_PLIST, p_queue_elements($scheduled_query_queue$.getGlobalValue()));
                }
                {
                    SubLObject plists = append(com.cyc.cycjava.cycl.inference.scheduled_queries.get_currently_running_scheduled_queries(machine_name, port), queue);
                    SubLObject cdolist_list_var = plists;
                    SubLObject plist = NIL;
                    for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                        transform_list_utilities.ntransform(plist, $sym79$INVALID_FORT_, symbol_function(NULL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return plists;
                }
            }
        }
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P of queries currently scheduled to be run on MACHINE-NAME at PORT, or on this image if unspecified.
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P of queries currently scheduled to be run on MACHINE-NAME at PORT, or on this image if unspecified.")
    public static SubLObject get_scheduled_query_queue(SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queue = NIL;
        if ((NIL != machine_name) && (NIL != port)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push(scheduled_queries.$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(scheduled_queries.IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject connection = new_remote_image_connection(new_remote_image(machine_name, port, UNPROVIDED));
                        try {
                            open_remote_image_connection(connection);
                            final SubLObject _prev_bind_0_$27 = $current_remote_image_connection$.currentBinding(thread);
                            try {
                                $current_remote_image_connection$.bind(connection, thread);
                                queue = current_remote_image_connection_eval(scheduled_queries.$list79);
                            } finally {
                                $current_remote_image_connection$.rebind(_prev_bind_0_$27, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                close_remote_image_connection(connection);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, scheduled_queries.$IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else {
            SubLObject cdolist_list_var = queues.p_queue_elements(scheduled_queries.scheduled_query_queue());
            SubLObject sq = NIL;
            sq = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == find_if(scheduled_queries.$sym80$INVALID_FORT_, sq, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    queue = cons(scheduled_queries.scheduled_query_plist(sq), queue);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sq = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var2;
        final SubLObject plists = cdolist_list_var2 = append(scheduled_queries.get_currently_running_scheduled_queries(machine_name, port), queue);
        SubLObject plist = NIL;
        plist = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            ntransform(plist, scheduled_queries.$sym80$INVALID_FORT_, symbol_function(NULL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            plist = cdolist_list_var2.first();
        } 
        return delete_duplicates(plists, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_scheduled_query_queue_alt() {
        while (NIL == p_queue_empty_p($scheduled_query_queue$.getGlobalValue())) {
            p_dequeue($scheduled_query_queue$.getGlobalValue(), UNPROVIDED);
        } 
        return $scheduled_query_queue$.getGlobalValue();
    }

    public static SubLObject clear_scheduled_query_queue() {
        while (NIL == queues.p_queue_empty_p(scheduled_queries.scheduled_query_queue())) {
            queues.p_dequeue(scheduled_queries.scheduled_query_queue(), UNPROVIDED);
        } 
        return scheduled_queries.scheduled_query_queue();
    }

    public static final SubLObject scheduled_query_plist_alt(SubLObject sq) {
        {
            SubLObject plist = NIL;
            SubLObject kbq = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_kbq(sq);
            SubLObject scheduled_run_time_universal = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_scheduled_run_time(sq);
            SubLObject scheduled_run_time_cycl = date_utilities.universal_time_to_cycl_date(scheduled_run_time_universal);
            SubLObject scheduled_run_time_decoded = arg2(resetMultipleValues(), multiple_value_list(decode_universal_time(scheduled_run_time_universal, UNPROVIDED)));
            SubLObject event_or_series = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_instance(sq);
            plist = putf(plist, $KBQ, kbq);
            plist = putf(plist, $GLOSS, kb_query.kbq_comments(kbq).first());
            plist = putf(plist, $SCHEDULED_RUN_TIME_UNIVERSAL, scheduled_run_time_universal);
            plist = putf(plist, $SCHEDULED_RUN_TIME_UNIX, subtract(scheduled_run_time_universal, $ut_offset_to_unix_time$.getGlobalValue()));
            plist = putf(plist, $SCHEDULED_RUN_TIME_CYCL, scheduled_run_time_cycl);
            plist = putf(plist, $SCHEDULED_RUN_TIME_DECODED, scheduled_run_time_decoded);
            if (NIL != isa.isa_in_any_mtP(event_or_series, $$Series)) {
                plist = putf(plist, $RECURRING_, T);
                plist = putf(plist, $SCHEDULER, com.cyc.cycjava.cycl.inference.scheduled_queries.get_series_scheduler(event_or_series));
                plist = putf(plist, $SERIES, event_or_series);
                plist = putf(plist, $INTERVAL_TYPE, kb_mapping_utilities.fpred_value_in_any_mt(event_or_series, $$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                plist = putf(plist, $RECURRING_, NIL);
                plist = putf(plist, $EVENT, event_or_series);
                plist = putf(plist, $SCHEDULER, kb_mapping_utilities.fpred_value_in_any_mt(event_or_series, $$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            if (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(event_or_series, $$scheduledReportSpecification, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject report = kb_mapping_utilities.fpred_value_in_any_mt(event_or_series, $$scheduledReportSpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject template = kb_mapping_utilities.fpred_value_in_any_mt(report, $$reportSpecificationTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    plist = putf(plist, $REPORT, report);
                    plist = putf(plist, $REPORT_TEMPLATE, template);
                    plist = putf(plist, $REPORT_TEMPLATE_GLOSS, pph_main.generate_phrase(template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            return plist;
        }
    }

    public static SubLObject scheduled_query_plist(final SubLObject sq) {
        SubLObject plist = NIL;
        final SubLObject kbq = scheduled_queries.scheduled_query_kbq(sq);
        final SubLObject scheduled_run_time_universal = scheduled_queries.scheduled_query_scheduled_run_time(sq);
        final SubLObject scheduled_run_time_cycl = universal_time_to_cycl_date(scheduled_run_time_universal);
        final SubLObject scheduled_run_time_decoded = arg2(resetMultipleValues(), multiple_value_list(decode_universal_time(scheduled_run_time_universal, UNPROVIDED)));
        final SubLObject event_or_series = scheduled_queries.scheduled_query_instance(sq);
        plist = putf(plist, $GUID_STRING, scheduled_queries.index_scheduled_query(sq));
        plist = putf(plist, $KBQ, kbq);
        plist = putf(plist, $GLOSS, kb_query.kbq_comments(kbq).first());
        plist = putf(plist, scheduled_queries.$SCHEDULED_RUN_TIME_UNIVERSAL, scheduled_run_time_universal);
        plist = putf(plist, scheduled_queries.$SCHEDULED_RUN_TIME_UNIX, subtract(scheduled_run_time_universal, scheduled_queries.$ut_offset_to_unix_time$.getGlobalValue()));
        plist = putf(plist, scheduled_queries.$SCHEDULED_RUN_TIME_CYCL, scheduled_run_time_cycl);
        plist = putf(plist, scheduled_queries.$SCHEDULED_RUN_TIME_DECODED, scheduled_run_time_decoded);
        if (NIL != isa_in_any_mtP(event_or_series, scheduled_queries.$$Series)) {
            plist = putf(plist, $RECURRING_, T);
            plist = putf(plist, $SCHEDULER, scheduled_queries.get_series_scheduler(event_or_series));
            plist = putf(plist, $SERIES, event_or_series);
            plist = putf(plist, $INTERVAL_TYPE, fpred_value_in_any_mt(event_or_series, scheduled_queries.$$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            plist = putf(plist, $RECURRING_, NIL);
            plist = putf(plist, $EVENT, event_or_series);
            plist = putf(plist, $SCHEDULER, fpred_value_in_any_mt(event_or_series, scheduled_queries.$$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != some_pred_value_in_any_mt(event_or_series, scheduled_queries.$$scheduledReportSpecification, UNPROVIDED, UNPROVIDED)) {
            final SubLObject report = fpred_value_in_any_mt(event_or_series, scheduled_queries.$$scheduledReportSpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject template = fpred_value_in_any_mt(report, scheduled_queries.$$reportSpecificationTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            plist = putf(plist, $REPORT, report);
            plist = putf(plist, $REPORT_TEMPLATE, template);
            plist = putf(plist, scheduled_queries.$REPORT_TEMPLATE_GLOSS, generate_phrase(template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return plist;
    }

    public static SubLObject index_scheduled_query(final SubLObject sq) {
        final SubLObject guid_string = Guids.guid_to_string(Guids.new_guid());
        dictionary.dictionary_enter(scheduled_queries.$scheduled_query_index$.getGlobalValue(), guid_string, sq);
        return guid_string;
    }

    public static SubLObject lookup_scheduled_query(final SubLObject guid_string) {
        return dictionary.dictionary_lookup_without_values(scheduled_queries.$scheduled_query_index$.getGlobalValue(), guid_string, UNPROVIDED);
    }

    public static final SubLObject scheduled_query_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject scheduled_query_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != lengthE(v_object, THREE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject scheduled_query_kbq_alt(SubLObject sq) {
        SubLTrampolineFile.checkType(sq, SCHEDULED_QUERY_P);
        return sq.first();
    }

    public static SubLObject scheduled_query_kbq(final SubLObject sq) {
        assert NIL != scheduled_queries.scheduled_query_p(sq) : "! scheduled_queries.scheduled_query_p(sq) " + ("scheduled_queries.scheduled_query_p(sq) " + "CommonSymbols.NIL != scheduled_queries.scheduled_query_p(sq) ") + sq;
        return sq.first();
    }

    public static final SubLObject scheduled_query_scheduled_run_time_alt(SubLObject sq) {
        SubLTrampolineFile.checkType(sq, SCHEDULED_QUERY_P);
        return second(sq);
    }

    public static SubLObject scheduled_query_scheduled_run_time(final SubLObject sq) {
        assert NIL != scheduled_queries.scheduled_query_p(sq) : "! scheduled_queries.scheduled_query_p(sq) " + ("scheduled_queries.scheduled_query_p(sq) " + "CommonSymbols.NIL != scheduled_queries.scheduled_query_p(sq) ") + sq;
        return second(sq);
    }

    public static final SubLObject scheduled_query_instance_alt(SubLObject sq) {
        SubLTrampolineFile.checkType(sq, SCHEDULED_QUERY_P);
        return third(sq);
    }

    public static SubLObject scheduled_query_instance(final SubLObject sq) {
        assert NIL != scheduled_queries.scheduled_query_p(sq) : "! scheduled_queries.scheduled_query_p(sq) " + ("scheduled_queries.scheduled_query_p(sq) " + "CommonSymbols.NIL != scheduled_queries.scheduled_query_p(sq) ") + sq;
        return third(sq);
    }

    public static final SubLObject package_scheduled_query_alt(SubLObject kbq, SubLObject time, SubLObject query_event_or_series) {
        SubLTrampolineFile.checkType(kbq, FORT_P);
        SubLTrampolineFile.checkType(time, UNIVERSAL_TIME_P);
        SubLTrampolineFile.checkType(query_event_or_series, FORT_P);
        return list(kbq, time, query_event_or_series);
    }

    public static SubLObject package_scheduled_query(final SubLObject kbq, final SubLObject time, final SubLObject query_event_or_series) {
        assert NIL != fort_p(kbq) : "! forts.fort_p(kbq) " + ("forts.fort_p(kbq) " + "CommonSymbols.NIL != forts.fort_p(kbq) ") + kbq;
        assert NIL != universal_time_p(time) : "! numeric_date_utilities.universal_time_p(time) " + ("numeric_date_utilities.universal_time_p(time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(time) ") + time;
        assert NIL != fort_p(query_event_or_series) : "! forts.fort_p(query_event_or_series) " + ("forts.fort_p(query_event_or_series) " + "CommonSymbols.NIL != forts.fort_p(query_event_or_series) ") + query_event_or_series;
        return list(kbq, time, query_event_or_series);
    }

    public static SubLObject remove_query_or_series_from_queue(final SubLObject query_or_series) {
        SubLObject survivors = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            while (NIL == queues.p_queue_empty_p(scheduled_queries.scheduled_query_queue())) {
                final SubLObject sq = queues.p_dequeue(scheduled_queries.scheduled_query_queue(), UNPROVIDED);
                if (!query_or_series.equal(scheduled_queries.scheduled_query_instance(sq))) {
                    survivors = cons(sq, survivors);
                }
            } 
            SubLObject cdolist_list_var = survivors;
            SubLObject survivor = NIL;
            survivor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                queues.p_enqueue(survivor, scheduled_queries.scheduled_query_queue());
                cdolist_list_var = cdolist_list_var.rest();
                survivor = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return scheduled_queries.scheduled_query_queue();
    }

    public static final SubLObject enqueue_scheduled_query_alt(SubLObject packaged_query) {
        {
            SubLObject query = NIL;
            SubLObject lock = $scheduled_query_queue_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == p_queue_find(packaged_query, $scheduled_query_queue$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)) {
                    query = p_enqueue(packaged_query, $scheduled_query_queue$.getGlobalValue());
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return query;
        }
    }

    public static SubLObject enqueue_scheduled_query(final SubLObject packaged_query) {
        SubLObject query = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            if (NIL == queues.p_queue_find(packaged_query, scheduled_queries.scheduled_query_queue(), symbol_function(EQUAL), UNPROVIDED)) {
                query = queues.p_enqueue(packaged_query, scheduled_queries.scheduled_query_queue());
            }
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject dequeue_scheduled_query_alt() {
        {
            SubLObject query = NIL;
            SubLObject lock = $scheduled_query_queue_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                query = p_dequeue($scheduled_query_queue$.getGlobalValue(), UNPROVIDED);
                com.cyc.cycjava.cycl.inference.scheduled_queries.note_scheduled_query_in_progress(com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_kbq(query));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return query;
        }
    }

    public static SubLObject dequeue_scheduled_query() {
        SubLObject query = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            query = queues.p_dequeue(scheduled_queries.scheduled_query_queue(), UNPROVIDED);
            scheduled_queries.note_scheduled_query_in_progress(scheduled_queries.scheduled_query_kbq(query));
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject next_scheduled_query_alt() {
        {
            SubLObject query = NIL;
            SubLObject lock = $scheduled_query_queue_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                query = p_queue_best($scheduled_query_queue$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return query;
        }
    }

    public static SubLObject next_scheduled_query() {
        SubLObject query = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            query = queues.p_queue_best(scheduled_queries.scheduled_query_queue());
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject populate_scheduled_query_queue_alt() {
        {
            SubLObject lock = $scheduled_query_queue_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                com.cyc.cycjava.cycl.inference.scheduled_queries.clear_scheduled_query_queue();
                {
                    SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq($$KBQ_FindOneTimeScheduledQueries, UNPROVIDED);
                    SubLObject result = NIL;
                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                        {
                            SubLObject datum = result;
                            SubLObject current = datum;
                            SubLObject scheduled_query = NIL;
                            SubLObject kbq = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt100);
                            scheduled_query = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt100);
                            kbq = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_query(kbq, scheduled_query, UNPROVIDED);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt100);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq($$KBQ_FindRepeatingScheduledQueries, UNPROVIDED);
                    SubLObject result = NIL;
                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                        {
                            SubLObject datum = result;
                            SubLObject current = datum;
                            SubLObject scheduled_query_series = NIL;
                            SubLObject kbq = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt102);
                            scheduled_query_series = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt102);
                            kbq = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_query(kbq, scheduled_query_series, UNPROVIDED);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt102);
                            }
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $scheduled_query_queue$.getGlobalValue();
    }

    public static SubLObject populate_scheduled_query_queue() {
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            scheduled_queries.clear_scheduled_query_queue();
            SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq(scheduled_queries.$$KBQ_FindOneTimeScheduledQueries, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject scheduled_query = NIL;
                SubLObject kbq = NIL;
                destructuring_bind_must_consp(current, datum, scheduled_queries.$list103);
                scheduled_query = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, scheduled_queries.$list103);
                kbq = current.first();
                current = current.rest();
                if (NIL == current) {
                    scheduled_queries.schedule_query(kbq, scheduled_query, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, scheduled_queries.$list103);
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
            cdolist_list_var = kb_query.new_cyc_query_from_kbq(scheduled_queries.$$KBQ_FindRepeatingScheduledQueries, UNPROVIDED, UNPROVIDED);
            result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject scheduled_query_series = NIL;
                SubLObject kbq = NIL;
                destructuring_bind_must_consp(current, datum, scheduled_queries.$list105);
                scheduled_query_series = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, scheduled_queries.$list105);
                kbq = current.first();
                current = current.rest();
                if (NIL == current) {
                    scheduled_queries.schedule_query(kbq, scheduled_query_series, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, scheduled_queries.$list105);
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return scheduled_queries.scheduled_query_queue();
    }

    /**
     * Compute the next time KBQ should be run, and schedule it to be run then.
     */
    @LispMethod(comment = "Compute the next time KBQ should be run, and schedule it to be run then.")
    public static final SubLObject schedule_query_alt(SubLObject kbq, SubLObject query_event_or_series, SubLObject just_ranP) {
        if (just_ranP == UNPROVIDED) {
            just_ranP = NIL;
        }
        {
            SubLObject scheduled_time = com.cyc.cycjava.cycl.inference.scheduled_queries.find_next_scheduled_time(query_event_or_series, just_ranP);
            if (NIL != numeric_date_utilities.universal_time_p(scheduled_time)) {
                {
                    SubLObject sq = com.cyc.cycjava.cycl.inference.scheduled_queries.package_scheduled_query(kbq, scheduled_time, query_event_or_series);
                    com.cyc.cycjava.cycl.inference.scheduled_queries.enqueue_scheduled_query(sq);
                }
            }
            return scheduled_time;
        }
    }

    /**
     * Compute the next time KBQ should be run, and schedule it to be run then.
     */
    @LispMethod(comment = "Compute the next time KBQ should be run, and schedule it to be run then.")
    public static SubLObject schedule_query(final SubLObject kbq, final SubLObject query_event_or_series, SubLObject just_ranP) {
        if (just_ranP == UNPROVIDED) {
            just_ranP = NIL;
        }
        final SubLObject scheduled_time = scheduled_queries.find_next_scheduled_time(query_event_or_series, just_ranP);
        if (NIL != universal_time_p(scheduled_time)) {
            final SubLObject sq = scheduled_queries.package_scheduled_query(kbq, scheduled_time, query_event_or_series);
            scheduled_queries.enqueue_scheduled_query(sq);
        }
        return scheduled_time;
    }

    public static final SubLObject add_scheduled_query_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != com.cyc.cycjava.cycl.inference.scheduled_queries.run_scheduled_queries_on_this_imageP()) {
            com.cyc.cycjava.cycl.inference.scheduled_queries.ensure_scheduled_query_daemon_is_running();
            {
                SubLObject query_event_or_series = assertions_high.gaf_arg1(assertion);
                SubLObject kbq = com.cyc.cycjava.cycl.inference.scheduled_queries.kbq_for_query_event_or_series(query_event_or_series);
                if (NIL != kbq) {
                    com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_query(kbq, query_event_or_series, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject add_scheduled_query(final SubLObject argument, final SubLObject assertion) {
        if (NIL != scheduled_queries.run_scheduled_queries_on_this_imageP()) {
            scheduled_queries.ensure_scheduled_query_daemon_is_running();
            final SubLObject query_event_or_series = gaf_arg1(assertion);
            final SubLObject kbq = scheduled_queries.kbq_for_query_event_or_series(query_event_or_series);
            if (NIL != kbq) {
                scheduled_queries.schedule_query(kbq, query_event_or_series, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject find_next_scheduled_time_alt(SubLObject query_event_or_series, SubLObject just_ranP) {
        {
            SubLObject cycl_date = com.cyc.cycjava.cycl.inference.scheduled_queries.find_next_scheduled_date(query_event_or_series, just_ranP);
            return NIL != cycl_date ? ((SubLObject) (date_utilities.cycl_date_to_universal_time(cycl_date))) : NIL;
        }
    }

    public static SubLObject find_next_scheduled_time(final SubLObject query_event_or_series, final SubLObject just_ranP) {
        final SubLObject cycl_date = scheduled_queries.find_next_scheduled_date(query_event_or_series, just_ranP);
        return (NIL != cycl_date) && (NIL == dateL(cycl_date, date_before(indexical_now(), scheduled_queries.$list108))) ? cycl_date_to_universal_time(cycl_date) : NIL;
    }

    public static final SubLObject find_next_scheduled_date_alt(SubLObject query_event_or_series, SubLObject just_ranP) {
        return NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.scheduled_queries.next_run_date_for_query_series(query_event_or_series, just_ranP))) : com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_run_date_for_query(query_event_or_series);
    }

    public static SubLObject find_next_scheduled_date(final SubLObject query_event_or_series, final SubLObject just_ranP) {
        return NIL != isa_in_any_mtP(query_event_or_series, scheduled_queries.$$Series) ? scheduled_queries.next_run_date_for_query_series(query_event_or_series, just_ranP) : scheduled_queries.scheduled_run_date_for_query(query_event_or_series);
    }

    public static final SubLObject next_run_date_for_query_series_alt(SubLObject query_series, SubLObject just_ranP) {
        {
            SubLObject kbq = (NIL != just_ranP) ? ((SubLObject) ($const105$KBQ_FindNextFutureStartDateForQue)) : $const106$KBQ_FindNextStartDateForQueryInSe;
            SubLObject cycl_date = query_utilities.new_cyc_query_from_indexicalized_kbq(kbq, query_series, UNPROVIDED).first();
            return cycl_date;
        }
    }

    public static SubLObject next_run_date_for_query_series(final SubLObject query_series, final SubLObject just_ranP) {
        final SubLObject kbq = (NIL != just_ranP) ? scheduled_queries.$const109$KBQ_FindNextFutureStartDateForQue : scheduled_queries.$const110$KBQ_FindNextStartDateForQueryInSe;
        final SubLObject cycl_date = new_cyc_query_from_indexicalized_kbq(kbq, query_series, UNPROVIDED).first();
        return cycl_date;
    }

    public static final SubLObject scheduled_run_date_for_query_alt(SubLObject query_event) {
        {
            SubLObject cycl_date = query_utilities.new_cyc_query_from_indexicalized_kbq($const107$KBQ_FindStartDateForScheduledQuer, query_event, UNPROVIDED).first();
            return cycl_date;
        }
    }

    public static SubLObject scheduled_run_date_for_query(final SubLObject query_event) {
        final SubLObject cycl_date = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$const111$KBQ_FindStartDateForScheduledQuer, query_event, UNPROVIDED).first();
        return cycl_date;
    }

    public static final SubLObject kbq_for_query_event_or_series_alt(SubLObject query_event_or_series) {
        return query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindScheduledKBQ, query_event_or_series, UNPROVIDED).first();
    }

    public static SubLObject kbq_for_query_event_or_series(final SubLObject query_event_or_series) {
        return new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindScheduledKBQ, query_event_or_series, UNPROVIDED).first();
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P for scheduled queries currently running
    on MACHINE-NAME at PORT, or on this image if unspecified.
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P for scheduled queries currently running\r\non MACHINE-NAME at PORT, or on this image if unspecified.")
    public static final SubLObject get_currently_running_scheduled_queries_alt(SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ((NIL != machine_name) && (NIL != port)) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        {
                                            SubLObject connection = remote_image.new_remote_image_connection(remote_image.new_remote_image(machine_name, port, UNPROVIDED));
                                            try {
                                                remote_image.open_remote_image_connection(connection);
                                                {
                                                    SubLObject _prev_bind_0_29 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                                                    try {
                                                        remote_image.$current_remote_image_connection$.bind(connection, thread);
                                                        ans = com.cyc.cycjava.cycl.inference.scheduled_queries.get_currently_running_scheduled_queries_internal();
                                                    } finally {
                                                        remote_image.$current_remote_image_connection$.rebind(_prev_bind_0_29, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        remote_image.close_remote_image_connection(connection);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                } else {
                    ans = com.cyc.cycjava.cycl.inference.scheduled_queries.get_currently_running_scheduled_queries_internal();
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of PROPERTY-LIST-P for scheduled queries currently running
    on MACHINE-NAME at PORT, or on this image if unspecified.
     */
    @LispMethod(comment = "@return LISTP of PROPERTY-LIST-P for scheduled queries currently running\r\non MACHINE-NAME at PORT, or on this image if unspecified.")
    public static SubLObject get_currently_running_scheduled_queries(SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != machine_name) && (NIL != port)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push(scheduled_queries.$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(scheduled_queries.IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject connection = new_remote_image_connection(new_remote_image(machine_name, port, UNPROVIDED));
                        try {
                            open_remote_image_connection(connection);
                            final SubLObject _prev_bind_0_$29 = $current_remote_image_connection$.currentBinding(thread);
                            try {
                                $current_remote_image_connection$.bind(connection, thread);
                                ans = scheduled_queries.get_currently_running_scheduled_queries_internal();
                            } finally {
                                $current_remote_image_connection$.rebind(_prev_bind_0_$29, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                close_remote_image_connection(connection);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, scheduled_queries.$IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else {
            ans = scheduled_queries.get_currently_running_scheduled_queries_internal();
        }
        return ans;
    }

    public static final SubLObject get_currently_running_scheduled_queries_internal_alt() {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = $active_scheduled_queries$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject kbq = NIL;
                    SubLObject problem_store = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    kbq = current.first();
                    current = current.rest();
                    problem_store = current;
                    if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
                        {
                            SubLObject plist = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_plist(kbq);
                            plist = putf(plist, $PROBLEM_STORE_ID, inference_datastructures_problem_store.problem_store_suid(problem_store));
                            plist = putf(plist, $INFERENCES, com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_problem_store_inferences_plists(problem_store));
                            ans = cons(plist, ans);
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject get_currently_running_scheduled_queries_internal() {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = scheduled_queries.$active_scheduled_queries$.getGlobalValue();
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject packaged_query = NIL;
            SubLObject problem_store = NIL;
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list116);
            packaged_query = current.first();
            current = problem_store = current.rest();
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
                SubLObject plist = scheduled_queries.scheduled_query_plist(packaged_query);
                plist = putf(plist, scheduled_queries.$PROBLEM_STORE_ID, inference_datastructures_problem_store.problem_store_suid(problem_store));
                plist = putf(plist, $INFERENCES, scheduled_queries.scheduled_query_problem_store_inferences_plists(problem_store));
                ans = cons(plist, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject scheduled_query_problem_store_inferences_plists_alt(SubLObject problem_store) {
        {
            SubLObject plists = NIL;
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject inference = NIL;
                    while (NIL != id) {
                        inference = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
                            plists = cons(com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_inference_plist(inference), plists);
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return plists;
        }
    }

    public static SubLObject scheduled_query_problem_store_inferences_plists(final SubLObject problem_store) {
        SubLObject plists = NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$31 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$31);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        plists = cons(scheduled_queries.scheduled_query_inference_plist(inference), plists);
                    }
                }
            }
            final SubLObject idx_$32 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$32)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$32);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        plists = cons(scheduled_queries.scheduled_query_inference_plist(inference2), plists);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return plists;
    }

    public static final SubLObject scheduled_query_inference_plist_alt(SubLObject inference) {
        {
            SubLObject plist = list($INFERENCE_ID, inference_datastructures_inference.inference_suid(inference));
            plist = putf(plist, $TIME_SO_FAR, inference_datastructures_inference.inference_time_so_far(inference, UNPROVIDED));
            plist = putf(plist, $ANSWER_COUNT, inference_datastructures_inference.inference_answer_count(inference));
            plist = putf(plist, $STATUS, inference_datastructures_inference.inference_status(inference));
            return plist;
        }
    }

    public static SubLObject scheduled_query_inference_plist(final SubLObject inference) {
        SubLObject plist = list($INFERENCE_ID, inference_datastructures_inference.inference_suid(inference));
        plist = putf(plist, scheduled_queries.$TIME_SO_FAR, inference_datastructures_inference.inference_time_so_far(inference, UNPROVIDED));
        plist = putf(plist, $ANSWER_COUNT, inference_datastructures_inference.inference_answer_count(inference));
        plist = putf(plist, $STATUS, inference_datastructures_inference.inference_status(inference));
        return plist;
    }

    public static SubLObject abort_scheduled_query(final SubLObject guid_string, SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != machine_name) && (NIL != port)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push(scheduled_queries.$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(scheduled_queries.IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject connection = new_remote_image_connection(new_remote_image(machine_name, port, UNPROVIDED));
                        try {
                            open_remote_image_connection(connection);
                            final SubLObject _prev_bind_0_$33 = $current_remote_image_connection$.currentBinding(thread);
                            try {
                                $current_remote_image_connection$.bind(connection, thread);
                                scheduled_queries.abort_scheduled_query(guid_string, NIL, NIL);
                            } finally {
                                $current_remote_image_connection$.rebind(_prev_bind_0_$33, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                close_remote_image_connection(connection);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, scheduled_queries.$IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject scheduled_query = scheduled_queries.lookup_scheduled_query(guid_string);
            if (NIL != scheduled_query) {
                scheduled_queries.abort_scheduled_query_internal(scheduled_query);
            }
        }
        return NIL;
    }

    public static SubLObject abort_active_scheduled_queries() {
        SubLObject cdolist_list_var = scheduled_queries.$active_scheduled_queries$.getGlobalValue();
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject packaged_query = NIL;
            SubLObject problem_store = NIL;
            destructuring_bind_must_consp(current, datum, scheduled_queries.$list116);
            packaged_query = current.first();
            current = problem_store = current.rest();
            scheduled_queries.abort_scheduled_query_internal(packaged_query);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject abort_scheduled_query_internal(final SubLObject scheduled_query) {
        scheduled_queries.$aborted_scheduled_queries$.setGlobalValue(cons(scheduled_query, scheduled_queries.$aborted_scheduled_queries$.getGlobalValue()));
        final SubLObject problem_store = alist_lookup_without_values(scheduled_queries.$active_scheduled_queries$.getGlobalValue(), scheduled_query, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != problem_store) {
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$35 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$35, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$35);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        inference = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            inference_strategist.inference_abort(inference);
                        }
                    }
                }
                final SubLObject idx_$36 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$36)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$36);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            inference2 = getEntryValue(cdohash_entry);
                            inference_strategist.inference_abort(inference2);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        SubLObject survivors = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            while (NIL == queues.p_queue_empty_p(scheduled_queries.scheduled_query_queue())) {
                final SubLObject sq = queues.p_dequeue(scheduled_queries.scheduled_query_queue(), UNPROVIDED);
                if (!scheduled_query.equal(sq)) {
                    survivors = cons(sq, survivors);
                }
            } 
            SubLObject cdolist_list_var = survivors;
            SubLObject survivor = NIL;
            survivor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                queues.p_enqueue(survivor, scheduled_queries.scheduled_query_queue());
                cdolist_list_var = cdolist_list_var.rest();
                survivor = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject should_skipXabort_scheduled_queryP(final SubLObject scheduled_query) {
        return subl_promotions.memberP(scheduled_query, scheduled_queries.$aborted_scheduled_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject note_scheduled_query_in_progress_alt(SubLObject kbq) {
        $in_progress_queries$.setGlobalValue(cons(kbq, $in_progress_queries$.getGlobalValue()));
        return $in_progress_queries$.getGlobalValue();
    }

    public static SubLObject note_scheduled_query_in_progress(final SubLObject kbq) {
        scheduled_queries.$in_progress_queries$.setGlobalValue(cons(kbq, scheduled_queries.$in_progress_queries$.getGlobalValue()));
        return scheduled_queries.$in_progress_queries$.getGlobalValue();
    }

    public static final SubLObject note_scheduled_query_finished_running_alt(SubLObject kbq) {
        $in_progress_queries$.setGlobalValue(remove(kbq, $in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $active_scheduled_queries$.setGlobalValue(list_utilities.remove_if_not(VALID_PROBLEM_STORE_P, $active_scheduled_queries$.getGlobalValue(), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $completed_queries$.setGlobalValue(cons(kbq, $completed_queries$.getGlobalValue()));
        return $in_progress_queries$.getGlobalValue();
    }

    public static SubLObject note_scheduled_query_finished_running(final SubLObject kbq) {
        scheduled_queries.$in_progress_queries$.setGlobalValue(remove(kbq, scheduled_queries.$in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        scheduled_queries.$active_scheduled_queries$.setGlobalValue(remove_if_not(scheduled_queries.VALID_PROBLEM_STORE_P, scheduled_queries.$active_scheduled_queries$.getGlobalValue(), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        scheduled_queries.$completed_queries$.setGlobalValue(cons(kbq, scheduled_queries.$completed_queries$.getGlobalValue()));
        return scheduled_queries.$in_progress_queries$.getGlobalValue();
    }

    public static final SubLObject scheduled_query_in_progressP_alt(SubLObject kbq) {
        {
            SubLObject ans = NIL;
            SubLObject lock = $scheduled_query_queue_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = memberP(kbq, $in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return ans;
        }
    }

    public static SubLObject scheduled_query_in_progressP(final SubLObject kbq) {
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            ans = subl_promotions.memberP(kbq, scheduled_queries.$in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return ans;
    }

    /**
     * Run PACKAGED-QUERY and re-enqueue it if it is to be run again.
     */
    @LispMethod(comment = "Run PACKAGED-QUERY and re-enqueue it if it is to be run again.")
    public static final SubLObject run_packaged_scheduled_query_alt(SubLObject packaged_query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                if (NIL != packaged_query) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        {
                                            SubLObject kbq = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_kbq(packaged_query);
                                            SubLObject query_event_or_series = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_instance(packaged_query);
                                            if (NIL != forts.valid_fortP(query_event_or_series)) {
                                                {
                                                    SubLObject _prev_bind_0_31 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                                    try {
                                                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                                                        operation_communication.set_the_cyclist($$ScheduledQueryDaemon);
                                                        try {
                                                            {
                                                                SubLObject store = NIL;
                                                                try {
                                                                    store = inference_datastructures_problem_store.new_problem_store(NIL);
                                                                    $active_scheduled_queries$.setGlobalValue(cons(cons(packaged_query, store), $active_scheduled_queries$.getGlobalValue()));
                                                                    successP = com.cyc.cycjava.cycl.inference.scheduled_queries.run_scheduled_query_internal(kbq, query_event_or_series, store);
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            inference_datastructures_problem_store.destroy_problem_store(store);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    com.cyc.cycjava.cycl.inference.scheduled_queries.note_scheduled_query_finished_running(kbq);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                                                }
                                                            }
                                                        }
                                                        if ((NIL == successP) || (NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series))) {
                                                            com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_query(kbq, query_event_or_series, T);
                                                        } else {
                                                            ke.ke_kill(query_event_or_series);
                                                        }
                                                    } finally {
                                                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0_31, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                }
                return successP;
            }
        }
    }

    /**
     * Run PACKAGED-QUERY and re-enqueue it if it is to be run again.
     */
    @LispMethod(comment = "Run PACKAGED-QUERY and re-enqueue it if it is to be run again.")
    public static SubLObject run_packaged_scheduled_query(final SubLObject packaged_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        if (NIL != packaged_query) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push(scheduled_queries.$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(scheduled_queries.IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject kbq = scheduled_queries.scheduled_query_kbq(packaged_query);
                        final SubLObject query_event_or_series = scheduled_queries.scheduled_query_instance(packaged_query);
                        if (NIL != valid_fortP(query_event_or_series)) {
                            final SubLObject _prev_bind_0_$37 = $the_cyclist$.currentBinding(thread);
                            try {
                                $the_cyclist$.bind(NIL, thread);
                                set_the_cyclist(scheduled_queries.$$ScheduledQueryDaemon);
                                if (NIL == scheduled_queries.should_skipXabort_scheduled_queryP(packaged_query)) {
                                    try {
                                        final SubLObject problem_store_properties = filter_plist(kb_query.kbq_query_properties(kbq), scheduled_queries.PROBLEM_STORE_PROPERTY_P);
                                        SubLObject store = NIL;
                                        try {
                                            store = inference_datastructures_problem_store.new_problem_store(problem_store_properties);
                                            scheduled_queries.$active_scheduled_queries$.setGlobalValue(cons(cons(packaged_query, store), scheduled_queries.$active_scheduled_queries$.getGlobalValue()));
                                            successP = scheduled_queries.run_scheduled_query_internal(packaged_query, store);
                                        } finally {
                                            final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                inference_datastructures_problem_store.destroy_problem_store(store);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                            }
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            scheduled_queries.note_scheduled_query_finished_running(kbq);
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                        }
                                    }
                                }
                                if ((NIL == successP) || (NIL != isa_in_any_mtP(query_event_or_series, scheduled_queries.$$Series))) {
                                    scheduled_queries.schedule_query(kbq, query_event_or_series, T);
                                } else {
                                    scheduled_queries.cleanup_scheduled_query(query_event_or_series);
                                }
                            } finally {
                                $the_cyclist$.rebind(_prev_bind_0_$37, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, scheduled_queries.$IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return successP;
    }

    public static SubLObject cleanup_scheduled_query(final SubLObject query_event) {
        SubLObject release = NIL;
        try {
            release = seize_lock(scheduled_queries.$scheduled_query_cleanup_lock$.getGlobalValue());
            if (NIL != valid_fortP(query_event)) {
                ke_kill_now(query_event);
            }
        } finally {
            if (NIL != release) {
                release_lock(scheduled_queries.$scheduled_query_cleanup_lock$.getGlobalValue());
            }
        }
        return query_event;
    }

    public static final SubLObject run_scheduled_query_internal(SubLObject kbq, SubLObject query_event_or_series, SubLObject store) {
        if (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(query_event_or_series, $$scheduledReportSpecification, UNPROVIDED, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.inference.scheduled_queries.run_scheduled_report(kbq, query_event_or_series, store);
        }
        {
            SubLObject successP = NIL;
            SubLObject inference = com.cyc.cycjava.cycl.inference.scheduled_queries.run_scheduled_query(kbq, store);
            SubLObject location = com.cyc.cycjava.cycl.inference.scheduled_queries.new_path_for_scheduled_query_problem_store(store);
            if (NIL != inference) {
                inference_serialization.save_problem_store(store, location, UNPROVIDED);
                ke.ke_assert_now(list($$problemStoreSnapshotPathnames, inference_utilities.cycl_term_for_problem_store(store), location), $$BaseKB, UNPROVIDED, UNPROVIDED);
                inference_utilities.assert_problem_store_data(store, UNPROVIDED);
                inference_utilities.assert_inference_data(inference, UNPROVIDED);
                {
                    SubLObject defining_mt = kb_accessors.defining_mt(query_event_or_series);
                    SubLObject mt = (NIL != defining_mt) ? ((SubLObject) (defining_mt)) : $$BaseKB;
                    SubLObject inference_datastructure = inference_utilities.cycl_term_for_inference(inference);
                    ke.ke_assert_now(list($$queryInferences, kbq, inference_datastructure), mt, UNPROVIDED, UNPROVIDED);
                    if (NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series)) {
                        ke.ke_assert_now(list($$inferenceDatastructure, com.cyc.cycjava.cycl.inference.scheduled_queries.reify_scheduled_query_in_series(query_event_or_series, defining_mt), inference_datastructure), mt, UNPROVIDED, UNPROVIDED);
                    }
                    com.cyc.cycjava.cycl.inference.scheduled_queries.maybe_email_scheduled_query_results(query_event_or_series, inference);
                }
                successP = T;
            }
            return successP;
        }
    }

    public static SubLObject run_scheduled_query_internal(final SubLObject packaged_query, final SubLObject store) {
        final SubLObject kbq = scheduled_queries.scheduled_query_kbq(packaged_query);
        final SubLObject query_event_or_series = scheduled_queries.scheduled_query_instance(packaged_query);
        SubLObject successP = NIL;
        final SubLObject inference = scheduled_queries.run_scheduled_query(kbq, store);
        final SubLObject location = scheduled_queries.new_path_for_scheduled_query_problem_store(store);
        if (NIL != inference) {
            inference_serialization.save_problem_store(store, location, UNPROVIDED);
            final SubLObject defining_mt = defining_mt(query_event_or_series);
            final SubLObject mt = (NIL != defining_mt) ? defining_mt : scheduled_queries.$scheduled_query_computer_info_mt$.getGlobalValue();
            final SubLObject inference_datastructure = inference_utilities.cycl_term_for_inference(inference);
            ke_assert_now(list(scheduled_queries.$$problemStoreSnapshotPathnames, inference_utilities.cycl_term_for_problem_store(store), location), mt, UNPROVIDED, UNPROVIDED);
            inference_utilities.assert_problem_store_data(store, mt, UNPROVIDED);
            inference_utilities.assert_inference_data(inference, mt, UNPROVIDED);
            ke_assert_now(list(scheduled_queries.$$queryInferences, kbq, inference_datastructure), mt, UNPROVIDED, UNPROVIDED);
            if (NIL != isa_in_any_mtP(query_event_or_series, scheduled_queries.$$Series)) {
                ke_assert_now(list(scheduled_queries.$$inferenceDatastructure, scheduled_queries.reify_scheduled_query_in_series(query_event_or_series, defining_mt), inference_datastructure), mt, UNPROVIDED, UNPROVIDED);
            }
            scheduled_queries.maybe_email_scheduled_query_results(query_event_or_series, inference);
            successP = T;
        }
        return successP;
    }

    public static final SubLObject get_mime_type_for_delimiter_alt(SubLObject delimiter) {
        {
            SubLObject pcase_var = delimiter;
            if (pcase_var.eql(CHAR_comma)) {
                return $str_alt141$text_csv;
            } else {
                if (pcase_var.eql(CHAR_tab)) {
                    return $str_alt142$text_tsv;
                } else {
                    return $str_alt143$text_plain;
                }
            }
        }
    }

    public static SubLObject get_mime_type_for_delimiter(final SubLObject delimiter) {
        if (delimiter.eql(CHAR_comma)) {
            return scheduled_queries.$str130$text_csv;
        }
        if (delimiter.eql(CHAR_tab)) {
            return scheduled_queries.$str131$text_tsv;
        }
        return scheduled_queries.$str132$text_plain;
    }

    public static final SubLObject get_subl_character_alt(SubLObject cycl_character) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subl_char = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == subl_char) {
                            {
                                SubLObject csome_list_var = $list_alt148;
                                SubLObject pred = NIL;
                                for (pred = csome_list_var.first(); !((NIL != subl_char) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                    {
                                        SubLObject string = NIL;
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cycl_character, NIL, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cycl_character, NIL, pred_var);
                                                SubLObject done_var = NIL;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                    {
                                                                        SubLObject done_var_34 = NIL;
                                                                        SubLObject token_var_35 = NIL;
                                                                        while (NIL == done_var_34) {
                                                                            {
                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_35);
                                                                                SubLObject valid_36 = makeBoolean(token_var_35 != assertion);
                                                                                if (NIL != valid_36) {
                                                                                    string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                    if (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED)) {
                                                                                        subl_char = string_utilities.first_char(string);
                                                                                    }
                                                                                }
                                                                                done_var_34 = makeBoolean(NIL == valid_36);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
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
                return subl_char;
            }
        }
    }

    public static SubLObject get_subl_character(final SubLObject cycl_character) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subl_char = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(scheduled_queries.$$EverythingPSC, thread);
            if (NIL == subl_char) {
                SubLObject csome_list_var = scheduled_queries.$list134;
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while ((NIL == subl_char) && (NIL != csome_list_var)) {
                    SubLObject string = NIL;
                    final SubLObject pred_var = pred;
                    if (NIL != do_gaf_arg_index_key_validator(cycl_character, NIL, pred_var)) {
                        final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(cycl_character, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$40 = NIL;
                                    final SubLObject token_var_$41 = NIL;
                                    while (NIL == done_var_$40) {
                                        final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                        final SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(assertion));
                                        if (NIL != valid_$42) {
                                            string = gaf_arg(assertion, TWO_INTEGER);
                                            if (NIL != lengthE(string, ONE_INTEGER, UNPROVIDED)) {
                                                subl_char = first_char(string);
                                            }
                                        }
                                        done_var_$40 = makeBoolean(NIL == valid_$42);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                } 
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_char;
    }

    public static final SubLObject maybe_email_scheduled_query_results_alt(SubLObject query_event_or_series, SubLObject inference) {
        {
            SubLObject to = com.cyc.cycjava.cycl.inference.scheduled_queries.get_email_recipients_for_scheduled_query_results(query_event_or_series);
            SubLObject cc = com.cyc.cycjava.cycl.inference.scheduled_queries.get_email_cc_for_scheduled_query_results(query_event_or_series);
            SubLObject cyclist = kb_mapping_utilities.fpred_value_in_any_mt(query_event_or_series, $$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != cyclist) && (NIL != list_utilities.non_empty_list_p(to))) {
                com.cyc.cycjava.cycl.inference.scheduled_queries.try_to_email_scheduled_query_results(query_event_or_series, inference, to, cc, cyclist);
            }
        }
        return NIL;
    }

    public static SubLObject maybe_email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference) {
        final SubLObject to = scheduled_queries.get_email_recipients_for_scheduled_query_results(query_event_or_series);
        final SubLObject cc = scheduled_queries.get_email_cc_for_scheduled_query_results(query_event_or_series);
        final SubLObject cyclist = fpred_value_in_any_mt(query_event_or_series, scheduled_queries.$$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != cyclist) && (NIL != non_empty_list_p(to))) {
            scheduled_queries.try_to_email_scheduled_query_results(query_event_or_series, inference, to, cc, cyclist);
        }
        return NIL;
    }

    public static final SubLObject results_should_be_emailed_to_address_alt() {
        return constants_high.find_constant_by_guid_string($str_alt149$6cb141db_9948_4a5b_b7ae_a86899c41);
    }

    public static SubLObject results_should_be_emailed_to_address() {
        return find_constant_by_guid_string(scheduled_queries.$str135$6cb141db_9948_4a5b_b7ae_a86899c41);
    }

    public static final SubLObject get_email_recipients_for_scheduled_query_results_alt(SubLObject query_event_or_series) {
        return kb_mapping_utilities.pred_values_in_any_mt(query_event_or_series, com.cyc.cycjava.cycl.inference.scheduled_queries.results_should_be_emailed_to_address(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject get_email_recipients_for_scheduled_query_results(final SubLObject query_event_or_series) {
        return pred_values_in_any_mt(query_event_or_series, scheduled_queries.results_should_be_emailed_to_address(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject get_email_cc_for_scheduled_query_results_alt(SubLObject query_event_or_series) {
        return kb_mapping_utilities.pred_values_in_any_mt(query_event_or_series, $const13$resultsShouldBeEmailedToAddress_C, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject get_email_cc_for_scheduled_query_results(final SubLObject query_event_or_series) {
        return pred_values_in_any_mt(query_event_or_series, scheduled_queries.$const13$resultsShouldBeEmailedToAddress_C, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject get_scheduled_query_results_message_alt(SubLObject query_event_or_series, SubLObject inference) {
        {
            SubLObject name = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED).first();
            SubLObject sentence = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindFormulaForScheduledQuery, query_event_or_series, UNPROVIDED).first();
            SubLObject paraphrase = pph_main.generate_text_wXsentential_force(possibly_unquote(sentence), $INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result_count = inference_datastructures_inference.inference_answer_count(inference);
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                format(stream, $scheduled_query_results_message_template$.getGlobalValue(), new SubLObject[]{ name, paraphrase, result_count });
                terpri(stream);
                operation_communication.server_summary(stream);
                result = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject get_scheduled_query_results_message(final SubLObject query_event_or_series, final SubLObject inference) {
        final SubLObject name = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED).first();
        final SubLObject sentence = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindFormulaForScheduledQuery, query_event_or_series, UNPROVIDED).first();
        final SubLObject paraphrase = generate_text_wXsentential_force(possibly_unquote(sentence), $INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject result_count = inference_datastructures_inference.inference_answer_count(inference);
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            format(stream, scheduled_queries.$scheduled_query_results_message_template$.getGlobalValue(), new SubLObject[]{ name, cycl_string.cycl_string_to_utf8_string(paraphrase), result_count });
            terpri(stream);
            server_summary(stream);
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject get_scheduled_query_results_subject_alt(SubLObject query_event_or_series, SubLObject inference) {
        {
            SubLObject name = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED).first();
            SubLObject result_count = inference_datastructures_inference.inference_answer_count(inference);
            return cconcatenate($str_alt154$Scheduled_Query_Results__, new SubLObject[]{ format_nil.format_nil_d_no_copy(result_count), $str_alt155$_answers_for_, format_nil.format_nil_s_no_copy(name) });
        }
    }

    public static SubLObject get_scheduled_query_results_subject(final SubLObject query_event_or_series, final SubLObject inference) {
        final SubLObject name = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED).first();
        final SubLObject result_count = inference_datastructures_inference.inference_answer_count(inference);
        return cconcatenate(scheduled_queries.$str140$Scheduled_Query_Results__, new SubLObject[]{ format_nil_d_no_copy(result_count), scheduled_queries.$$$_answers_for_, format_nil_s_no_copy(name) });
    }

    public static final SubLObject extension_for_delimiter_alt(SubLObject delimiter) {
        {
            SubLObject pcase_var = delimiter;
            if (pcase_var.eql(CHAR_tab)) {
                return $$$tsv;
            } else {
                if (pcase_var.eql(CHAR_comma)) {
                    return $$$csv;
                } else {
                    return $$$txt;
                }
            }
        }
    }

    public static SubLObject extension_for_delimiter(final SubLObject delimiter) {
        if (delimiter.eql(CHAR_tab)) {
            return scheduled_queries.$$$tsv;
        }
        if (delimiter.eql(CHAR_comma)) {
            return scheduled_queries.$$$csv;
        }
        return scheduled_queries.$$$txt;
    }

    public static final SubLObject get_scheduled_report_results_subject(SubLObject file_name, SubLObject successP) {
        return NIL != successP ? ((SubLObject) ($$$Report_run_successfully)) : $$$Report_generation_failed;
    }

    public static SubLObject get_scheduled_report_results_subject(final SubLObject file_name, final SubLObject successP, final SubLObject report_generator) {
        final SubLObject problem_count = sksi_reports_by_column.report_generator_problem_count(report_generator);
        return (NIL != successP) && problem_count.isZero() ? scheduled_queries.$$$Report_run_successfully : cconcatenate(scheduled_queries.$str146$Report_generation_failed__, new SubLObject[]{ format_nil_d_no_copy(problem_count), scheduled_queries.$str147$_problems_ });
    }

    public static final SubLObject do_smtp_accounts_for_cyclist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt164);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cyclist = NIL;
                    SubLObject host = NIL;
                    SubLObject port = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    cyclist = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    host = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    port = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_38 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt164);
                            current_38 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt164);
                            if (NIL == member(current_38, $list_alt165, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_38 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt164);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject el_list = $sym168$EL_LIST;
                                SubLObject smtp_account = $sym169$SMTP_ACCOUNT;
                                SubLObject info = $sym170$INFO;
                                return list(CSOME, list(el_list, list(NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ, $$KBQ_FindSMTPAccountsForCyclist, cyclist), done), list(CSOME, list(smtp_account, list(EL_LIST_ITEMS, el_list), done), list(CSOME, list(info, list(NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ, $$KBQ_FindSMTPInfoForAccount, smtp_account), done), listS(CDESTRUCTURING_BIND, bq_cons(port, host), info, append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_smtp_accounts_for_cyclist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, scheduled_queries.$list148);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyclist = NIL;
        SubLObject host = NIL;
        SubLObject port = NIL;
        destructuring_bind_must_consp(current, datum, scheduled_queries.$list148);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, scheduled_queries.$list148);
        host = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, scheduled_queries.$list148);
        port = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$44 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, scheduled_queries.$list148);
            current_$44 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, scheduled_queries.$list148);
            if (NIL == member(current_$44, scheduled_queries.$list149, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$44 == scheduled_queries.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, scheduled_queries.$list148);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject el_list = scheduled_queries.$sym152$EL_LIST;
        final SubLObject smtp_account = scheduled_queries.$sym153$SMTP_ACCOUNT;
        final SubLObject info = scheduled_queries.$sym154$INFO;
        return list(CSOME, list(el_list, list(scheduled_queries.NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ, scheduled_queries.$$KBQ_FindSMTPAccountsForCyclist, cyclist), done), list(CSOME, list(smtp_account, list(EL_LIST_ITEMS, el_list), done), list(CSOME, list(info, list(scheduled_queries.NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ, scheduled_queries.$$KBQ_FindSMTPInfoForAccount, smtp_account), done), listS(CDESTRUCTURING_BIND, bq_cons(port, host), info, append(body, NIL)))));
    }

    public static final SubLObject try_to_email_scheduled_query_results_alt(SubLObject query_event_or_series, SubLObject inference, SubLObject to, SubLObject cc, SubLObject cyclist) {
        {
            SubLObject sentP = NIL;
            if (NIL == sentP) {
                {
                    SubLObject csome_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindSMTPAccountsForCyclist, cyclist, UNPROVIDED);
                    SubLObject el_list = NIL;
                    for (el_list = csome_list_var.first(); !((NIL != sentP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , el_list = csome_list_var.first()) {
                        if (NIL == sentP) {
                            {
                                SubLObject csome_list_var_39 = el_list_items(el_list);
                                SubLObject smtp_account = NIL;
                                for (smtp_account = csome_list_var_39.first(); !((NIL != sentP) || (NIL == csome_list_var_39)); csome_list_var_39 = csome_list_var_39.rest() , smtp_account = csome_list_var_39.first()) {
                                    if (NIL == sentP) {
                                        {
                                            SubLObject csome_list_var_40 = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindSMTPInfoForAccount, smtp_account, UNPROVIDED);
                                            SubLObject info = NIL;
                                            for (info = csome_list_var_40.first(); !((NIL != sentP) || (NIL == csome_list_var_40)); csome_list_var_40 = csome_list_var_40.rest() , info = csome_list_var_40.first()) {
                                                {
                                                    SubLObject datum = info;
                                                    SubLObject current = datum;
                                                    SubLObject port = NIL;
                                                    SubLObject host = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt177);
                                                    port = current.first();
                                                    current = current.rest();
                                                    host = current;
                                                    sentP = com.cyc.cycjava.cycl.inference.scheduled_queries.email_scheduled_query_results(query_event_or_series, inference, to, cc, host, port);
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
            return sentP;
        }
    }

    public static SubLObject try_to_email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference, final SubLObject to, final SubLObject cc, final SubLObject cyclist) {
        SubLObject sentP = NIL;
        if (NIL == sentP) {
            SubLObject csome_list_var = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindSMTPAccountsForCyclist, cyclist, UNPROVIDED);
            SubLObject el_list = NIL;
            el_list = csome_list_var.first();
            while ((NIL == sentP) && (NIL != csome_list_var)) {
                if (NIL == sentP) {
                    SubLObject csome_list_var_$45 = el_list_items(el_list);
                    SubLObject smtp_account = NIL;
                    smtp_account = csome_list_var_$45.first();
                    while ((NIL == sentP) && (NIL != csome_list_var_$45)) {
                        if (NIL == sentP) {
                            SubLObject csome_list_var_$46 = new_cyc_query_from_indexicalized_kbq(scheduled_queries.$$KBQ_FindSMTPInfoForAccount, smtp_account, UNPROVIDED);
                            SubLObject info = NIL;
                            info = csome_list_var_$46.first();
                            while ((NIL == sentP) && (NIL != csome_list_var_$46)) {
                                SubLObject current;
                                final SubLObject datum = current = info;
                                SubLObject port = NIL;
                                SubLObject host = NIL;
                                destructuring_bind_must_consp(current, datum, scheduled_queries.$list161);
                                port = current.first();
                                current = host = current.rest();
                                sentP = scheduled_queries.email_scheduled_query_results(query_event_or_series, inference, to, cc, host, port);
                                csome_list_var_$46 = csome_list_var_$46.rest();
                                info = csome_list_var_$46.first();
                            } 
                        }
                        csome_list_var_$45 = csome_list_var_$45.rest();
                        smtp_account = csome_list_var_$45.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                el_list = csome_list_var.first();
            } 
        }
        return sentP;
    }

    public static final SubLObject email_scheduled_query_results_alt(SubLObject query_event_or_series, SubLObject inference, SubLObject to, SubLObject cc, SubLObject host, SubLObject port) {
        {
            SubLObject message = com.cyc.cycjava.cycl.inference.scheduled_queries.get_scheduled_query_results_message(query_event_or_series, inference);
            SubLObject subject = com.cyc.cycjava.cycl.inference.scheduled_queries.get_scheduled_query_results_subject(query_event_or_series, inference);
            return mail_utilities.mail_message($str_alt178$scheduled_query_daemon_cyc_com, to, message, subject, host, NIL, port, TEN_INTEGER, cc, NIL);
        }
    }

    public static SubLObject email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference, final SubLObject to, final SubLObject cc, final SubLObject host, final SubLObject port) {
        final SubLObject message = scheduled_queries.get_scheduled_query_results_message(query_event_or_series, inference);
        final SubLObject subject = scheduled_queries.get_scheduled_query_results_subject(query_event_or_series, inference);
        return mail_message(scheduled_queries.$str162$scheduled_query_daemon_cyc_com, to, message, subject, host, NIL, port, TEN_INTEGER, cc, NIL);
    }

    public static final SubLObject reify_scheduled_query_in_series_alt(SubLObject query_series, SubLObject defining_mt) {
        {
            SubLObject query_event = ke.ke_create_now($$$ScheduledQuery, UNPROVIDED);
            ke.ke_assert_now(list($$isa, query_event, com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_series_query_type(query_series)), defining_mt, UNPROVIDED, UNPROVIDED);
            ke.ke_assert_now(list($$seriesMembers, query_series, query_event), defining_mt, UNPROVIDED, UNPROVIDED);
            return query_event;
        }
    }

    public static SubLObject reify_scheduled_query_in_series(final SubLObject query_series, final SubLObject defining_mt) {
        final SubLObject query_event = ke_create_now(scheduled_queries.$$$ScheduledQuery, UNPROVIDED);
        scheduled_queries.sqd_note_new_fort(query_event);
        ke_assert_now(list(scheduled_queries.$$isa, query_event, scheduled_queries.scheduled_query_series_query_type(query_series)), defining_mt, UNPROVIDED, UNPROVIDED);
        ke_assert_now(list(scheduled_queries.$$seriesMembers, query_series, query_event), defining_mt, UNPROVIDED, UNPROVIDED);
        return query_event;
    }

    public static final SubLObject scheduled_query_series_query_type_alt(SubLObject query_series) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = $$CycQueryRunning;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject node_var = query_series;
                            SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_44 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_45 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_46 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt190$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt190$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt190$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt195$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt190$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_47 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_48 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(query_series, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_49 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_50 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    {
                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                        SubLObject module_var = NIL;
                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                    {
                                                                                        SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                            {
                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                if (NIL != d_link) {
                                                                                                    {
                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != mt_links) {
                                                                                                            {
                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(mt_links));
                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    {
                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state_55 = dictionary_contents.do_dictionary_contents_state(dictionary_contents(tv_links));
                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_55)) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_55);
                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_56 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                SubLObject cdolist_list_var_57 = new_list;
                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , node_vars_link_node = cdolist_list_var_57.first()) {
                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_56, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                iteration_state_55 = dictionary_contents.do_dictionary_contents_next(iteration_state_55);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_55);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_54, thread);
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
                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt196$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                {
                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    SubLObject cdolist_list_var_58 = new_list;
                                                                                                    SubLObject generating_fn = NIL;
                                                                                                    for (generating_fn = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , generating_fn = cdolist_list_var_58.first()) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_59 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                {
                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                    SubLObject new_list_60 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                    SubLObject cdolist_list_var_61 = new_list_60;
                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                    for (node_vars_link_node = cdolist_list_var_61.first(); NIL != cdolist_list_var_61; cdolist_list_var_61 = cdolist_list_var_61.rest() , node_vars_link_node = cdolist_list_var_61.first()) {
                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_59, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_53, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_52, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    node_var = deck.deck_pop(recur_deck);
                                                                    {
                                                                        SubLObject _prev_bind_0_62 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_64 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                            while (NIL != node_var) {
                                                                                {
                                                                                    SubLObject col = node_var;
                                                                                    SubLObject this_type = NIL;
                                                                                    SubLObject pred_var = $$seriesOfType;
                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, TWO_INTEGER, pred_var)) {
                                                                                        {
                                                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, TWO_INTEGER, pred_var);
                                                                                            SubLObject done_var = NIL;
                                                                                            SubLObject token_var = NIL;
                                                                                            while (NIL == done_var) {
                                                                                                {
                                                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                    if (NIL != valid) {
                                                                                                        {
                                                                                                            SubLObject final_index_iterator = NIL;
                                                                                                            try {
                                                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                                                {
                                                                                                                    SubLObject done_var_65 = NIL;
                                                                                                                    SubLObject token_var_66 = NIL;
                                                                                                                    while (NIL == done_var_65) {
                                                                                                                        {
                                                                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_66);
                                                                                                                            SubLObject valid_67 = makeBoolean(token_var_66 != assertion);
                                                                                                                            if (NIL != valid_67) {
                                                                                                                                this_type = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                                                                                if ((NIL != genls.genlP(this_type, type, UNPROVIDED, UNPROVIDED)) && (NIL == genls.genlP(type, this_type, UNPROVIDED, UNPROVIDED))) {
                                                                                                                                    type = this_type;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            done_var_65 = makeBoolean(NIL == valid_67);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                }
                                                                                                            } finally {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        if (NIL != final_index_iterator) {
                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_68, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var = makeBoolean(NIL == valid);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_69 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_70 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                        {
                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != d_link) {
                                                                                                                {
                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != mt_links) {
                                                                                                                        {
                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(mt_links));
                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_71 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_72 = dictionary_contents.do_dictionary_contents_state(dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_72)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_72);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_73 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_74 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_74.first(); NIL != cdolist_list_var_74; cdolist_list_var_74 = cdolist_list_var_74.rest() , node_vars_link_node = cdolist_list_var_74.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_73, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_72 = dictionary_contents.do_dictionary_contents_next(iteration_state_72);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_72);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_71, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt196$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_75 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_75.first(); NIL != cdolist_list_var_75; cdolist_list_var_75 = cdolist_list_var_75.rest() , generating_fn = cdolist_list_var_75.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_76 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_77 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_78 = new_list_77;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_78.first(); NIL != cdolist_list_var_78; cdolist_list_var_78 = cdolist_list_var_78.rest() , node_vars_link_node = cdolist_list_var_78.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_76, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_70, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_69, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_64, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_63, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_62, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_51, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_50, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_49, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt198$Node__a_does_not_pass_sbhl_type_t, query_series, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_48, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_47, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_46, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_45, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_44, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return type;
            }
        }
    }

    public static SubLObject scheduled_query_series_query_type(final SubLObject query_series) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = scheduled_queries.$$CycQueryRunning;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(scheduled_queries.$$EverythingPSC, thread);
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = create_deck(deck_type);
            final SubLObject _prev_bind_0_$47 = $sbhl_space$.currentBinding(thread);
            try {
                $sbhl_space$.bind(get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$48 = $sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$49 = $relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        $sbhl_tv$.bind(NIL != tv_var ? tv_var : get_sbhl_true_tv(), thread);
                        $relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = $sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_error(ONE_INTEGER, scheduled_queries.$str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_cerror(ONE_INTEGER, scheduled_queries.$$$continue_anyway, scheduled_queries.$str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn(scheduled_queries.$str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn(scheduled_queries.$str175$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror(scheduled_queries.$$$continue_anyway, scheduled_queries.$str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$49 = $sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$50 = $sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $sbhl_module$.currentBinding(thread);
                        try {
                            $sbhl_search_module$.bind(get_sbhl_module(scheduled_queries.$$isa), thread);
                            $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_module(scheduled_queries.$$isa)), thread);
                            $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_module(scheduled_queries.$$isa)), thread);
                            $genl_inverse_mode_p$.bind(NIL, thread);
                            $sbhl_module$.bind(get_sbhl_module(scheduled_queries.$$isa), thread);
                            if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(query_series, get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$50 = $sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$51 = $sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$54 = $genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    $sbhl_search_direction$.bind(get_sbhl_forward_search_direction(), thread);
                                    $sbhl_link_direction$.bind(get_sbhl_module_forward_direction(get_sbhl_module(UNPROVIDED)), thread);
                                    $genl_inverse_mode_p$.bind(NIL, thread);
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = get_sbhl_accessible_modules(get_sbhl_module(scheduled_queries.$$isa));
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$51 = $sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$52 = $genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            $sbhl_module$.bind(module_var, thread);
                                            $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node = naut_to_nart(query_series);
                                            if (NIL != sbhl_node_object_p(node)) {
                                                final SubLObject d_link = get_sbhl_graph_link(node, get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    final SubLObject mt_links = get_sbhl_mt_links(d_link, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt = do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != relevant_mtP(mt)) {
                                                                final SubLObject _prev_bind_0_$52 = $sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_link_mt$.bind(mt, thread);
                                                                    SubLObject iteration_state_$58;
                                                                    for (iteration_state_$58 = do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == do_dictionary_contents_doneP(iteration_state_$58); iteration_state_$58 = do_dictionary_contents_next(iteration_state_$58)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = do_dictionary_contents_key_value(iteration_state_$58);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$53 = $sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                $sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error(scheduled_queries.$str176$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                $sbhl_link_tv$.rebind(_prev_bind_0_$53, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    do_dictionary_contents_finalize(iteration_state_$58);
                                                                } finally {
                                                                    $sbhl_link_mt$.rebind(_prev_bind_0_$52, thread);
                                                                }
                                                            }
                                                        }
                                                        do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } else {
                                                    sbhl_error(FIVE_INTEGER, scheduled_queries.$str177$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$60;
                                                    final SubLObject new_list = cdolist_list_var_$60 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$60.first();
                                                    while (NIL != cdolist_list_var_$60) {
                                                        final SubLObject _prev_bind_0_$54 = $sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            $sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                        sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error(scheduled_queries.$str176$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            $sbhl_link_generator$.rebind(_prev_bind_0_$54, thread);
                                                        }
                                                        cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                                                        generating_fn = cdolist_list_var_$60.first();
                                                    } 
                                                }

                                        } finally {
                                            $genl_inverse_mode_p$.rebind(_prev_bind_1_$52, thread);
                                            $sbhl_module$.rebind(_prev_bind_0_$51, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    } 
                                    SubLObject node_var = deck_pop(recur_deck);
                                    final SubLObject _prev_bind_0_$55 = $sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$53 = $genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$55 = $sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        $sbhl_module$.bind(get_sbhl_transfers_through_module(get_sbhl_search_module()), thread);
                                        $genl_inverse_mode_p$.bind(NIL, thread);
                                        $sbhl_link_direction$.bind(get_sbhl_module_forward_direction(get_sbhl_module(UNPROVIDED)), thread);
                                        while (NIL != node_var) {
                                            final SubLObject col = node_var;
                                            SubLObject this_type = NIL;
                                            final SubLObject pred_var = scheduled_queries.$$seriesOfType;
                                            if (NIL != do_gaf_arg_index_key_validator(col, TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(col, TWO_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                            SubLObject done_var_$65 = NIL;
                                                            final SubLObject token_var_$66 = NIL;
                                                            while (NIL == done_var_$65) {
                                                                final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                                                final SubLObject valid_$67 = makeBoolean(!token_var_$66.eql(assertion));
                                                                if (NIL != valid_$67) {
                                                                    this_type = gaf_arg(assertion, ONE_INTEGER);
                                                                    if ((NIL != genlP(this_type, type, UNPROVIDED, UNPROVIDED)) && (NIL == genlP(type, this_type, UNPROVIDED, UNPROVIDED))) {
                                                                        type = this_type;
                                                                    }
                                                                }
                                                                done_var_$65 = makeBoolean(NIL == valid_$67);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$57 = $sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$54 = $genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    $sbhl_module$.bind(module_var2, thread);
                                                    $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = naut_to_nart(node_var);
                                                    if (NIL != sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = get_sbhl_graph_link(node2, get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = get_sbhl_mt_links(d_link2, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == do_dictionary_contents_doneP(iteration_state2); iteration_state2 = do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$58 = $sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$59;
                                                                            for (iteration_state_$59 = do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == do_dictionary_contents_doneP(iteration_state_$59); iteration_state_$59 = do_dictionary_contents_next(iteration_state_$59)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = do_dictionary_contents_key_value(iteration_state_$59);
                                                                                final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$59 = $sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        $sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes3;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node5;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                    sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                    deck_push(node_vars_link_node5, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var3 = sol3;
                                                                                                SubLObject node_vars_link_node6 = NIL;
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                                while (NIL != csome_list_var3) {
                                                                                                    if (NIL == sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                        sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                        deck_push(node_vars_link_node6, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error(scheduled_queries.$str176$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        $sbhl_link_tv$.rebind(_prev_bind_0_$59, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            do_dictionary_contents_finalize(iteration_state_$59);
                                                                        } finally {
                                                                            $sbhl_link_mt$.rebind(_prev_bind_0_$58, thread);
                                                                        }
                                                                    }
                                                                }
                                                                do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_error(FIVE_INTEGER, scheduled_queries.$str177$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$61;
                                                            final SubLObject new_list2 = cdolist_list_var_$61 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$61.first();
                                                            while (NIL != cdolist_list_var_$61) {
                                                                final SubLObject _prev_bind_0_$60 = $sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject node_vars_link_node2;
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node2 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node2)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED))) {
                                                                                sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                deck_push(node_vars_link_node2, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var4 = sol4;
                                                                            SubLObject node_vars_link_node7 = NIL;
                                                                            node_vars_link_node7 = csome_list_var4.first();
                                                                            while (NIL != csome_list_var4) {
                                                                                if (NIL == sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED)) {
                                                                                    sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                                    deck_push(node_vars_link_node7, recur_deck);
                                                                                }
                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                node_vars_link_node7 = csome_list_var4.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error(scheduled_queries.$str176$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    $sbhl_link_generator$.rebind(_prev_bind_0_$60, thread);
                                                                }
                                                                cdolist_list_var_$61 = cdolist_list_var_$61.rest();
                                                                generating_fn2 = cdolist_list_var_$61.first();
                                                            } 
                                                        }

                                                } finally {
                                                    $genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                    $sbhl_module$.rebind(_prev_bind_0_$57, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var = deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        $sbhl_link_direction$.rebind(_prev_bind_2_$55, thread);
                                        $genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                        $sbhl_module$.rebind(_prev_bind_0_$55, thread);
                                    }
                                } finally {
                                    $genl_inverse_mode_p$.rebind(_prev_bind_2_$54, thread);
                                    $sbhl_link_direction$.rebind(_prev_bind_1_$51, thread);
                                    $sbhl_search_direction$.rebind(_prev_bind_0_$50, thread);
                                }
                            } else {
                                sbhl_warn(TWO_INTEGER, scheduled_queries.$str179$Node__a_does_not_pass_sbhl_type_t, query_series, get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            $sbhl_module$.rebind(_prev_bind_5, thread);
                            $genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            $sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            $sbhl_search_module_type$.rebind(_prev_bind_1_$50, thread);
                            $sbhl_search_module$.rebind(_prev_bind_0_$49, thread);
                        }
                    } finally {
                        $relevant_sbhl_tv_function$.rebind(_prev_bind_1_$49, thread);
                        $sbhl_tv$.rebind(_prev_bind_0_$48, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        free_sbhl_marking_space($sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                    }
                }
            } finally {
                $sbhl_space$.rebind(_prev_bind_0_$47, thread);
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return type;
    }

    public static final SubLObject run_scheduled_query_alt(SubLObject kbq, SubLObject store) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result = kb_query.new_cyc_query_from_kbq(kbq, list($PROBLEM_STORE, store, $CONTINUABLE_, T));
                SubLObject halt_reason = thread.secondMultipleValue();
                SubLObject inference = thread.thirdMultipleValue();
                SubLObject metric_values = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return inference;
            }
        }
    }

    public static SubLObject run_scheduled_query(final SubLObject kbq, final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = kb_query.new_cyc_query_from_kbq(kbq, list($PROBLEM_STORE, store, $CONTINUABLE_, T), UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metric_values = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return inference;
    }

    public static final SubLObject scheduled_query_problem_store_directory_alt() {
        {
            SubLObject directory = $str_alt200$data_problem_stores_;
            if (NIL == Filesys.directory_p(directory)) {
                file_utilities.make_directory_recursive(directory, NIL, $$$0775);
            }
            return directory;
        }
    }

    public static SubLObject scheduled_query_problem_store_directory() {
        final SubLObject directory = scheduled_queries.$str182$data_problem_stores_;
        if (NIL == Filesys.directory_p(directory)) {
            make_directory_recursive(directory, NIL, scheduled_queries.$$$0775);
        }
        return directory;
    }

    public static final SubLObject new_path_for_scheduled_query_problem_store_alt(SubLObject store) {
        {
            SubLObject directory = cconcatenate(com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_problem_store_directory(), new SubLObject[]{ string_utilities.char_subst(CHAR_slash, CHAR_hyphen, cyc_image_id()), $str_alt202$_ });
            if (NIL == Filesys.directory_p(directory)) {
                file_utilities.make_directory_recursive(directory, NIL, $$$0775);
            }
            return cconcatenate(directory, new SubLObject[]{ $str_alt203$store_, princ_to_string(inference_datastructures_problem_store.problem_store_suid(store)), $str_alt204$_cfasl });
        }
    }

    public static SubLObject new_path_for_scheduled_query_problem_store(final SubLObject store) {
        final SubLObject directory = cconcatenate(scheduled_queries.scheduled_query_problem_store_directory(), new SubLObject[]{ char_subst(CHAR_slash, CHAR_hyphen, cyc_image_id()), scheduled_queries.$str184$_ });
        if (NIL == Filesys.directory_p(directory)) {
            make_directory_recursive(directory, NIL, scheduled_queries.$$$0775);
        }
        return cconcatenate(directory, new SubLObject[]{ scheduled_queries.$str185$store_, princ_to_string(inference_datastructures_problem_store.problem_store_suid(store)), scheduled_queries.$str186$_cfasl });
    }

    public static final SubLObject start_scheduled_query_processing_internal_alt() {
        inference_utilities.ensure_term_for_machine($$QuerySchedulerDaemonComputersMt, $$ScheduledQueryDaemon);
        com.cyc.cycjava.cycl.inference.scheduled_queries.set_scheduled_query_image_flag(T);
        {
            SubLObject queue = com.cyc.cycjava.cycl.inference.scheduled_queries.populate_scheduled_query_queue();
            com.cyc.cycjava.cycl.inference.scheduled_queries.ensure_scheduled_query_daemon_is_running();
            return p_queue_size(queue);
        }
    }

    public static SubLObject start_scheduled_query_processing_internal() {
        inference_utilities.ensure_term_for_machine(scheduled_queries.$scheduled_query_computer_info_mt$.getGlobalValue(), scheduled_queries.$$ScheduledQueryDaemon);
        scheduled_queries.set_scheduled_query_image_flag(T);
        final SubLObject queue = scheduled_queries.populate_scheduled_query_queue();
        scheduled_queries.ensure_scheduled_query_daemon_is_running();
        return queues.p_queue_size(queue);
    }

    public static final SubLObject set_scheduled_query_image_flag_alt(SubLObject runP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $run_scheduled_queries_on_this_imageP$.setGlobalValue(list_utilities.sublisp_boolean(runP));
            {
                SubLObject term_for_machine = inference_utilities.ensure_term_for_machine($$QuerySchedulerDaemonComputersMt, $$ScheduledQueryDaemon);
                SubLObject sentence = list($$programOnPort, $$ScheduledQueryDaemon_CW, $$CFASLProtocol, cfasl_kernel.cfasl_port(), term_for_machine);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist($$ScheduledQueryDaemon);
                        if (NIL != runP) {
                            ke.ke_assert(sentence, $$CycArchitectureMt, UNPROVIDED, UNPROVIDED);
                        } else {
                            ke.ke_unassert(sentence, $$CycArchitectureMt);
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $run_scheduled_queries_on_this_imageP$.getGlobalValue();
        }
    }

    public static SubLObject set_scheduled_query_image_flag(final SubLObject runP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        scheduled_queries.$run_scheduled_queries_on_this_imageP$.setGlobalValue(sublisp_boolean(runP));
        final SubLObject mt = scheduled_queries.$scheduled_query_computer_info_mt$.getGlobalValue();
        final SubLObject term_for_machine = inference_utilities.ensure_term_for_machine(mt, scheduled_queries.$$ScheduledQueryDaemon);
        final SubLObject sentence = list(scheduled_queries.$$programOnPort, scheduled_queries.$$ScheduledQueryDaemon_CW, scheduled_queries.$$CFASLProtocol, cfasl_port(), term_for_machine);
        final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
        try {
            $the_cyclist$.bind(NIL, thread);
            set_the_cyclist(scheduled_queries.$$ScheduledQueryDaemon);
            if (NIL != runP) {
                ke_assert(sentence, mt, UNPROVIDED, UNPROVIDED);
            } else {
                ke_unassert(sentence, mt);
            }
        } finally {
            $the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return scheduled_queries.$run_scheduled_queries_on_this_imageP$.getGlobalValue();
    }

    /**
     *
     *
     * @return LISTP of (MACHINE-NAME . PORT) pairs of machines believed by this Cyc image to be running
    a scheduled query daemon and the ports on which they are believed to be running.
     */
    @LispMethod(comment = "@return LISTP of (MACHINE-NAME . PORT) pairs of machines believed by this Cyc image to be running\r\na scheduled query daemon and the ports on which they are believed to be running.")
    public static final SubLObject find_possible_scheduled_query_daemon_images_alt() {
        return kb_query.new_cyc_query_from_kbq($$FindRunningScheduledQueryDaemons, UNPROVIDED);
    }

    /**
     *
     *
     * @return LISTP of (MACHINE-NAME . PORT) pairs of machines believed by this Cyc image to be running
    a scheduled query daemon and the ports on which they are believed to be running.
     */
    @LispMethod(comment = "@return LISTP of (MACHINE-NAME . PORT) pairs of machines believed by this Cyc image to be running\r\na scheduled query daemon and the ports on which they are believed to be running.")
    public static SubLObject find_possible_scheduled_query_daemon_images() {
        return kb_query.new_cyc_query_from_kbq(scheduled_queries.$$FindRunningScheduledQueryDaemons, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject run_scheduled_queries_on_this_imageP_alt() {
        return list_utilities.sublisp_boolean($run_scheduled_queries_on_this_imageP$.getGlobalValue());
    }

    public static SubLObject run_scheduled_queries_on_this_imageP() {
        return sublisp_boolean(scheduled_queries.$run_scheduled_queries_on_this_imageP$.getGlobalValue());
    }

    public static final SubLObject ensure_scheduled_query_daemon_is_running_alt() {
        if (NIL == valid_process_p($scheduled_query_daemon$.getGlobalValue())) {
            $scheduled_query_daemon$.setGlobalValue(com.cyc.cycjava.cycl.inference.scheduled_queries.launch_scheduled_query_daemon());
        }
        return $scheduled_query_daemon$.getGlobalValue();
    }

    public static SubLObject ensure_scheduled_query_daemon_is_running() {
        if (NIL == valid_process_p(scheduled_queries.$scheduled_query_daemon$.getGlobalValue())) {
            scheduled_queries.$scheduled_query_daemon$.setGlobalValue(scheduled_queries.launch_scheduled_query_daemon());
        }
        return scheduled_queries.$scheduled_query_daemon$.getGlobalValue();
    }

    public static final SubLObject launch_scheduled_query_runner_alt(SubLObject packaged_query) {
        {
            SubLObject id = integer_sequence_generator.integer_sequence_generator_next($scheduled_query_runner_isg$.getGlobalValue());
            SubLObject name = cconcatenate($str_alt214$Scheduled_Query_Runner_, format_nil.format_nil_d_no_copy(id));
            SubLObject runner = process_utilities.make_cyc_server_process_with_args(name, RUN_PACKAGED_SCHEDULED_QUERY, list(packaged_query));
            return runner;
        }
    }

    public static SubLObject launch_scheduled_query_runner(final SubLObject packaged_query) {
        final SubLObject id = integer_sequence_generator_next(scheduled_queries.$scheduled_query_runner_isg$.getGlobalValue());
        final SubLObject name = cconcatenate(scheduled_queries.$$$Scheduled_Query_Runner_, format_nil_d_no_copy(id));
        final SubLObject runner = process_utilities.make_cyc_server_process_with_args(name, scheduled_queries.RUN_PACKAGED_SCHEDULED_QUERY, list(packaged_query));
        return runner;
    }

    public static final SubLObject launch_scheduled_query_daemon_alt() {
        {
            SubLObject name = copy_seq($$$Scheduled_Query_Daemon);
            return process_utilities.make_cyc_server_process(name, RUN_SCHEDULED_QUERIES);
        }
    }

    public static SubLObject launch_scheduled_query_daemon() {
        final SubLObject name = copy_seq(scheduled_queries.$$$Scheduled_Query_Daemon);
        return process_utilities.make_cyc_server_process(name, scheduled_queries.RUN_SCHEDULED_QUERIES);
    }

    public static final SubLObject run_scheduled_queries_alt() {
        while (NIL != com.cyc.cycjava.cycl.inference.scheduled_queries.run_scheduled_queries_on_this_imageP()) {
            while (NIL != p_queue_empty_p($scheduled_query_queue$.getGlobalValue())) {
                sleep(ONE_INTEGER);
            } 
            if (NIL != com.cyc.cycjava.cycl.inference.scheduled_queries.run_scheduled_queries_on_this_imageP()) {
                com.cyc.cycjava.cycl.inference.scheduled_queries.maybe_run_next_scheduled_query();
                sleep(ONE_INTEGER);
            }
        } 
        return NIL;
    }

    public static SubLObject run_scheduled_queries() {
        while (NIL != scheduled_queries.run_scheduled_queries_on_this_imageP()) {
            while (NIL != queues.p_queue_empty_p(scheduled_queries.scheduled_query_queue())) {
                sleep(ONE_INTEGER);
            } 
            if (NIL != scheduled_queries.run_scheduled_queries_on_this_imageP()) {
                scheduled_queries.maybe_run_next_scheduled_query();
                sleep(ONE_INTEGER);
            }
        } 
        return NIL;
    }

    public static final SubLObject maybe_run_next_scheduled_query_alt() {
        if (NIL == list_utilities.lengthGE($active_scheduled_queries$.getGlobalValue(), $max_number_of_simultaneous_scheduled_queries$.getGlobalValue(), UNPROVIDED)) {
            {
                SubLObject lock = $scheduled_query_queue_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject packaged_query = com.cyc.cycjava.cycl.inference.scheduled_queries.next_scheduled_query();
                        if (NIL != packaged_query) {
                            {
                                SubLObject time = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_scheduled_run_time(packaged_query);
                                SubLObject seconds_to_wait = subtract(time, get_universal_time());
                                if (!seconds_to_wait.isPositive()) {
                                    com.cyc.cycjava.cycl.inference.scheduled_queries.launch_scheduled_query_runner(com.cyc.cycjava.cycl.inference.scheduled_queries.dequeue_scheduled_query());
                                }
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject maybe_run_next_scheduled_query() {
        if (NIL == lengthGE(scheduled_queries.$active_scheduled_queries$.getGlobalValue(), scheduled_queries.$max_number_of_simultaneous_scheduled_queries$.getGlobalValue(), UNPROVIDED)) {
            SubLObject release = NIL;
            try {
                release = seize_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
                final SubLObject packaged_query = scheduled_queries.next_scheduled_query();
                if (NIL != packaged_query) {
                    final SubLObject time = scheduled_queries.scheduled_query_scheduled_run_time(packaged_query);
                    final SubLObject seconds_to_wait = subtract(time, get_universal_time());
                    if (!seconds_to_wait.isPositive()) {
                        scheduled_queries.launch_scheduled_query_runner(scheduled_queries.dequeue_scheduled_query());
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(scheduled_queries.$scheduled_query_queue_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject sqd_note_new_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p(scheduled_queries.$sqd_new_forts_to_cleanup$.getDynamicValue(thread)) ? queues.enqueue(fort, scheduled_queries.$sqd_new_forts_to_cleanup$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject sqd_cleanup_new_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p(scheduled_queries.$sqd_new_forts_to_cleanup$.getDynamicValue(thread))) {
            while (NIL == queues.queue_empty_p(scheduled_queries.$sqd_new_forts_to_cleanup$.getDynamicValue(thread))) {
                scheduled_queries.cleanup_scheduled_query(queues.dequeue(scheduled_queries.$sqd_new_forts_to_cleanup$.getDynamicValue(thread)));
            } 
        }
        return scheduled_queries.$sqd_new_forts_to_cleanup$.getDynamicValue(thread);
    }

    public static final SubLObject scheduled_query_test_query_alt() {
        {
            SubLObject test_query_naut = $list_alt230;
            SubLObject kbq = narts_high.find_nart(test_query_naut);
            if (NIL == forts.valid_fortP(kbq)) {
                Errors.warn($str_alt231$Couldn_t_find_valid_test_query__S, test_query_naut);
            }
            return kbq;
        }
    }

    public static SubLObject scheduled_query_test_query() {
        final SubLObject test_query_naut = scheduled_queries.$list210;
        final SubLObject kbq = find_nart(test_query_naut);
        if (NIL == valid_fortP(kbq)) {
            Errors.warn(scheduled_queries.$str211$Couldn_t_find_valid_test_query__S, test_query_naut);
        }
        return kbq;
    }

    public static SubLObject with_sqd_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, scheduled_queries.$list212);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject timeout = NIL;
        SubLObject timed_outP = NIL;
        destructuring_bind_must_consp(current, datum, scheduled_queries.$list212);
        timeout = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, scheduled_queries.$list212);
        timed_outP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_TIMEOUT, list(timeout, timed_outP), list(CLET, scheduled_queries.$list215, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), scheduled_queries.$list218)));
        }
        cdestructuring_bind_error(datum, scheduled_queries.$list212);
        return NIL;
    }

    public static final SubLObject start_daemon_and_schedule_query_once_alt(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = $int$300;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing_results = com.cyc.cycjava.cycl.inference.scheduled_queries.get_cached_results_for_cycl_query(kbq);
                SubLObject new_results = NIL;
                SubLObject timed_outP = NIL;
                SubLObject time = NIL;
                SubLObject tag = with_timeout_make_tag();
                try {
                    {
                        SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            {
                                SubLObject timer = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_79 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            {
                                                SubLObject time_var = get_internal_real_time();
                                                com.cyc.cycjava.cycl.inference.scheduled_queries.start_daemon_and_stop_receiving();
                                                com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_query_and_wait_for_processing(kbq);
                                                new_results = com.cyc.cycjava.cycl.inference.scheduled_queries.get_scheduled_query_results(kbq, existing_results);
                                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_79, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            with_timeout_stop_timer(timer);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_80, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                }
                format(T, $str_alt233$___D_existing_results___S___D_new, new SubLObject[]{ length(existing_results), existing_results, length(new_results), new_results });
                if (NIL != timed_outP) {
                    Errors.warn($str_alt234$Timed_out_after__S_seconds_during, timeout);
                } else {
                    format(T, $str_alt235$__Finished_START_DAEMON_AND_SCHED, time);
                }
                return new_results;
            }
        }
    }

    public static SubLObject start_daemon_and_schedule_query_once(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = scheduled_queries.scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = scheduled_queries.$int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_results = scheduled_queries.get_cached_results_for_cycl_query(kbq);
        SubLObject new_results = NIL;
        SubLObject timed_outP = NIL;
        SubLObject time = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$77 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(timeout, tag);
                        final SubLObject _prev_bind_0_$78 = scheduled_queries.$sqd_new_forts_to_cleanup$.currentBinding(thread);
                        try {
                            scheduled_queries.$sqd_new_forts_to_cleanup$.bind(queues.create_queue(UNPROVIDED), thread);
                            try {
                                final SubLObject time_var = get_internal_real_time();
                                scheduled_queries.start_daemon_and_stop_receiving();
                                scheduled_queries.schedule_query_and_wait_for_processing(kbq);
                                new_results = scheduled_queries.get_scheduled_query_results(kbq, existing_results);
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            } finally {
                                final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    scheduled_queries.sqd_cleanup_new_forts();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                                }
                            }
                        } finally {
                            scheduled_queries.$sqd_new_forts_to_cleanup$.rebind(_prev_bind_0_$78, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$77, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        format(T, scheduled_queries.$str220$___D_existing_result__P___S___D_n, new SubLObject[]{ length(existing_results), existing_results, length(new_results), new_results });
        if (NIL != timed_outP) {
            Errors.warn(scheduled_queries.$str221$Timed_out_after__S_second__P_duri, timeout);
        } else {
            format(T, scheduled_queries.$str222$__Finished_START_DAEMON_AND_SCHED, readable_elapsed_time_string(time, UNPROVIDED));
        }
        return new_results;
    }

    public static final SubLObject schedule_test_query_and_wait_for_results_alt(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = $int$300;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing_results = com.cyc.cycjava.cycl.inference.scheduled_queries.get_cached_results_for_cycl_query(kbq);
                SubLObject timed_outP = NIL;
                SubLObject new_results = NIL;
                SubLObject tag = with_timeout_make_tag();
                try {
                    {
                        SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            {
                                SubLObject timer = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_81 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_query_and_wait_for_processing(kbq);
                                            new_results = com.cyc.cycjava.cycl.inference.scheduled_queries.get_scheduled_query_results(kbq, existing_results);
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_81, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            with_timeout_stop_timer(timer);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_82, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                }
                return values(new_results, timed_outP);
            }
        }
    }

    public static SubLObject schedule_test_query_and_wait_for_results(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = scheduled_queries.scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = scheduled_queries.$int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_results = scheduled_queries.get_cached_results_for_cycl_query(kbq);
        SubLObject timed_outP = NIL;
        SubLObject new_results = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$81 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(timeout, tag);
                        final SubLObject _prev_bind_0_$82 = scheduled_queries.$sqd_new_forts_to_cleanup$.currentBinding(thread);
                        try {
                            scheduled_queries.$sqd_new_forts_to_cleanup$.bind(queues.create_queue(UNPROVIDED), thread);
                            try {
                                scheduled_queries.schedule_query_and_wait_for_processing(kbq);
                                new_results = scheduled_queries.get_scheduled_query_results(kbq, existing_results);
                            } finally {
                                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    scheduled_queries.sqd_cleanup_new_forts();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                        } finally {
                            scheduled_queries.$sqd_new_forts_to_cleanup$.rebind(_prev_bind_0_$82, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$81, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        return values(new_results, timed_outP);
    }

    public static final SubLObject schedule_query_once_and_start_daemon_alt(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = $int$300;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing_results = com.cyc.cycjava.cycl.inference.scheduled_queries.get_cached_results_for_cycl_query(kbq);
                SubLObject new_results = NIL;
                SubLObject timed_outP = NIL;
                SubLObject time = NIL;
                SubLObject tag = with_timeout_make_tag();
                try {
                    {
                        SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            {
                                SubLObject timer = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_83 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            {
                                                SubLObject time_var = get_internal_real_time();
                                                com.cyc.cycjava.cycl.inference.scheduled_queries.halt_scheduled_query_processing();
                                                com.cyc.cycjava.cycl.inference.scheduled_queries.schedule_query_and_wait_for_processing(kbq);
                                                com.cyc.cycjava.cycl.inference.scheduled_queries.start_daemon_and_stop_receiving();
                                                sleep(ONE_INTEGER);
                                                new_results = com.cyc.cycjava.cycl.inference.scheduled_queries.get_scheduled_query_results(kbq, existing_results);
                                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_83, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            with_timeout_stop_timer(timer);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_84, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                }
                format(T, $str_alt233$___D_existing_results___S___D_new, new SubLObject[]{ length(existing_results), existing_results, length(new_results), new_results });
                if (NIL != timed_outP) {
                    Errors.warn($str_alt236$Timed_out_after__S_seconds_during, timeout);
                } else {
                    format(T, $str_alt237$__Finished_SCHEDULE_QUERY_ONCE_AN, time);
                }
                return new_results;
            }
        }
    }

    public static SubLObject schedule_query_once_and_start_daemon(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = scheduled_queries.scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = scheduled_queries.$int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_results = scheduled_queries.get_cached_results_for_cycl_query(kbq);
        SubLObject new_results = NIL;
        SubLObject timed_outP = NIL;
        SubLObject time = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$85 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(timeout, tag);
                        final SubLObject _prev_bind_0_$86 = scheduled_queries.$sqd_new_forts_to_cleanup$.currentBinding(thread);
                        try {
                            scheduled_queries.$sqd_new_forts_to_cleanup$.bind(queues.create_queue(UNPROVIDED), thread);
                            try {
                                final SubLObject time_var = get_internal_real_time();
                                scheduled_queries.halt_scheduled_query_processing();
                                scheduled_queries.schedule_query_and_wait_for_processing(kbq);
                                scheduled_queries.start_daemon_and_stop_receiving();
                                sleep(ONE_INTEGER);
                                new_results = scheduled_queries.get_scheduled_query_results(kbq, existing_results);
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            } finally {
                                final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    scheduled_queries.sqd_cleanup_new_forts();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                                }
                            }
                        } finally {
                            scheduled_queries.$sqd_new_forts_to_cleanup$.rebind(_prev_bind_0_$86, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$85, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        format(T, scheduled_queries.$str220$___D_existing_result__P___S___D_n, new SubLObject[]{ length(existing_results), existing_results, length(new_results), new_results });
        if (NIL != timed_outP) {
            Errors.warn(scheduled_queries.$str223$Timed_out_after__S_second__P_duri, timeout);
        } else {
            format(T, scheduled_queries.$str224$__Finished_SCHEDULE_QUERY_ONCE_AN, readable_elapsed_time_string(time, UNPROVIDED));
        }
        return new_results;
    }

    public static final SubLObject start_daemon_and_stop_receiving_alt() {
        com.cyc.cycjava.cycl.inference.scheduled_queries.start_scheduled_query_processing_internal();
        operation_communication.set_receive_state($$$no);
        while (NIL == agenda.agenda_idleP()) {
            sleep(ONE_INTEGER);
        } 
        return NIL;
    }

    public static SubLObject start_daemon_and_stop_receiving() {
        scheduled_queries.start_scheduled_query_processing_internal();
        set_receive_state(scheduled_queries.$$$no);
        while (NIL == agenda_idleP()) {
            sleep(ONE_INTEGER);
        } 
        return NIL;
    }

    public static final SubLObject schedule_query_and_wait_for_processing_alt(SubLObject kbq) {
        {
            SubLObject already_done_count = count(kbq, $completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.inference.scheduled_queries.add_single_query_schedule(kbq, date_utilities.indexical_now(), NIL, NIL, $$ScheduledQueryDaemon, $$ScheduledQueryTesting_Allotment);
            if (NIL != com.cyc.cycjava.cycl.inference.scheduled_queries.run_scheduled_queries_on_this_imageP()) {
                while (!count(kbq, $completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(already_done_count)) {
                    sleep(ONE_INTEGER);
                } 
            }
        }
        return NIL;
    }

    public static SubLObject schedule_query_and_wait_for_processing(final SubLObject kbq) {
        final SubLObject already_done_count = count(kbq, scheduled_queries.$completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject query_event = scheduled_queries.add_single_query_schedule(kbq, indexical_now(), NIL, NIL, scheduled_queries.$$ScheduledQueryDaemon, scheduled_queries.$$ScheduledQueryTesting_Allotment);
        try {
            if (NIL != scheduled_queries.run_scheduled_queries_on_this_imageP()) {
                while (!count(kbq, scheduled_queries.$completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(already_done_count)) {
                    sleep(ONE_INTEGER);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                scheduled_queries.cleanup_scheduled_query(query_event);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static final SubLObject get_scheduled_query_results_alt(SubLObject kbq, SubLObject existing_results) {
        if (existing_results == UNPROVIDED) {
            existing_results = com.cyc.cycjava.cycl.inference.scheduled_queries.get_cached_results_for_cycl_query(kbq);
        }
        while ((NIL != com.cyc.cycjava.cycl.inference.scheduled_queries.scheduled_query_in_progressP(kbq)) || (NIL == operation_queues.local_queue_empty())) {
            sleep(ONE_INTEGER);
        } 
        return set_difference(com.cyc.cycjava.cycl.inference.scheduled_queries.get_cached_results_for_cycl_query(kbq), existing_results, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject get_scheduled_query_results(final SubLObject kbq, SubLObject existing_results) {
        if (existing_results == UNPROVIDED) {
            existing_results = scheduled_queries.get_cached_results_for_cycl_query(kbq);
        }
        while ((NIL != scheduled_queries.scheduled_query_in_progressP(kbq)) || (NIL == local_queue_empty())) {
            sleep(ONE_INTEGER);
        } 
        return set_difference(scheduled_queries.get_cached_results_for_cycl_query(kbq), existing_results, symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject declare_scheduled_queries_file_alt() {
        declareFunction("start_scheduled_query_processing", "START-SCHEDULED-QUERY-PROCESSING", 0, 1, false);
        declareFunction("halt_scheduled_query_processing", "HALT-SCHEDULED-QUERY-PROCESSING", 0, 0, false);
        declareFunction("add_recurring_query_schedule", "ADD-RECURRING-QUERY-SCHEDULE", 2, 4, false);
        declareFunction("make_recurring_query_schedule_assertions", "MAKE-RECURRING-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
        declareFunction("note_query_scheduling_complete", "NOTE-QUERY-SCHEDULING-COMPLETE", 1, 0, false);
        declareFunction("add_single_query_schedule", "ADD-SINGLE-QUERY-SCHEDULE", 2, 4, false);
        declareFunction("make_single_query_schedule_assertions", "MAKE-SINGLE-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
        declareFunction("remove_recurring_query_schedule", "REMOVE-RECURRING-QUERY-SCHEDULE", 2, 2, false);
        declareFunction("remove_single_query_schedule", "REMOVE-SINGLE-QUERY-SCHEDULE", 2, 2, false);
        declareFunction("scheduled_query_series_type", "SCHEDULED-QUERY-SERIES-TYPE", 2, 0, false);
        declareFunction("get_series_scheduler", "GET-SERIES-SCHEDULER", 1, 0, false);
        declareFunction("get_query_scheduling_mt", "GET-QUERY-SCHEDULING-MT", 0, 2, false);
        declareFunction("get_cached_results_for_cycl_query", "GET-CACHED-RESULTS-FOR-CYCL-QUERY", 1, 0, false);
        declareFunction("get_reified_inference_answer_count", "GET-REIFIED-INFERENCE-ANSWER-COUNT", 1, 0, false);
        declareFunction("get_schedules_for_cycl_query", "GET-SCHEDULES-FOR-CYCL-QUERY", 1, 0, false);
        declareFunction("get_scheduled_query_queue", "GET-SCHEDULED-QUERY-QUEUE", 0, 2, false);
        declareFunction("clear_scheduled_query_queue", "CLEAR-SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction("scheduled_query_plist", "SCHEDULED-QUERY-PLIST", 1, 0, false);
        declareFunction("scheduled_query_p", "SCHEDULED-QUERY-P", 1, 0, false);
        declareFunction("scheduled_query_kbq", "SCHEDULED-QUERY-KBQ", 1, 0, false);
        declareFunction("scheduled_query_scheduled_run_time", "SCHEDULED-QUERY-SCHEDULED-RUN-TIME", 1, 0, false);
        declareFunction("scheduled_query_instance", "SCHEDULED-QUERY-INSTANCE", 1, 0, false);
        declareFunction("package_scheduled_query", "PACKAGE-SCHEDULED-QUERY", 3, 0, false);
        declareFunction("enqueue_scheduled_query", "ENQUEUE-SCHEDULED-QUERY", 1, 0, false);
        declareFunction("dequeue_scheduled_query", "DEQUEUE-SCHEDULED-QUERY", 0, 0, false);
        declareFunction("next_scheduled_query", "NEXT-SCHEDULED-QUERY", 0, 0, false);
        declareFunction("populate_scheduled_query_queue", "POPULATE-SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction("schedule_query", "SCHEDULE-QUERY", 2, 1, false);
        declareFunction("add_scheduled_query", "ADD-SCHEDULED-QUERY", 2, 0, false);
        declareFunction("find_next_scheduled_time", "FIND-NEXT-SCHEDULED-TIME", 2, 0, false);
        declareFunction("find_next_scheduled_date", "FIND-NEXT-SCHEDULED-DATE", 2, 0, false);
        declareFunction("next_run_date_for_query_series", "NEXT-RUN-DATE-FOR-QUERY-SERIES", 2, 0, false);
        declareFunction("scheduled_run_date_for_query", "SCHEDULED-RUN-DATE-FOR-QUERY", 1, 0, false);
        declareFunction("kbq_for_query_event_or_series", "KBQ-FOR-QUERY-EVENT-OR-SERIES", 1, 0, false);
        declareFunction("get_currently_running_scheduled_queries", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES", 0, 2, false);
        declareFunction("get_currently_running_scheduled_queries_internal", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES-INTERNAL", 0, 0, false);
        declareFunction("scheduled_query_problem_store_inferences_plists", "SCHEDULED-QUERY-PROBLEM-STORE-INFERENCES-PLISTS", 1, 0, false);
        declareFunction("scheduled_query_inference_plist", "SCHEDULED-QUERY-INFERENCE-PLIST", 1, 0, false);
        declareFunction("note_scheduled_query_in_progress", "NOTE-SCHEDULED-QUERY-IN-PROGRESS", 1, 0, false);
        declareFunction("note_scheduled_query_finished_running", "NOTE-SCHEDULED-QUERY-FINISHED-RUNNING", 1, 0, false);
        declareFunction("scheduled_query_in_progressP", "SCHEDULED-QUERY-IN-PROGRESS?", 1, 0, false);
        declareFunction("run_packaged_scheduled_query", "RUN-PACKAGED-SCHEDULED-QUERY", 1, 0, false);
        declareFunction("run_scheduled_query_internal", "RUN-SCHEDULED-QUERY-INTERNAL", 3, 0, false);
        declareFunction("run_scheduled_report", "RUN-SCHEDULED-REPORT", 3, 0, false);
        declareFunction("get_mime_type_for_delimiter", "GET-MIME-TYPE-FOR-DELIMITER", 1, 0, false);
        declareFunction("make_unused_report_file_name", "MAKE-UNUSED-REPORT-FILE-NAME", 2, 0, false);
        declareFunction("get_subl_character", "GET-SUBL-CHARACTER", 1, 0, false);
        declareFunction("maybe_email_scheduled_report_results", "MAYBE-EMAIL-SCHEDULED-REPORT-RESULTS", 5, 0, false);
        declareFunction("maybe_email_scheduled_query_results", "MAYBE-EMAIL-SCHEDULED-QUERY-RESULTS", 2, 0, false);
        declareFunction("results_should_be_emailed_to_address", "RESULTS-SHOULD-BE-EMAILED-TO-ADDRESS", 0, 0, false);
        declareFunction("get_email_recipients_for_scheduled_query_results", "GET-EMAIL-RECIPIENTS-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
        declareFunction("get_email_cc_for_scheduled_query_results", "GET-EMAIL-CC-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
        declareFunction("get_scheduled_query_results_message", "GET-SCHEDULED-QUERY-RESULTS-MESSAGE", 2, 0, false);
        declareFunction("get_scheduled_query_results_subject", "GET-SCHEDULED-QUERY-RESULTS-SUBJECT", 2, 0, false);
        declareFunction("get_scheduled_report_results_message", "GET-SCHEDULED-REPORT-RESULTS-MESSAGE", 2, 0, false);
        declareFunction("extension_for_delimiter", "EXTENSION-FOR-DELIMITER", 1, 0, false);
        declareFunction("get_scheduled_report_results_subject", "GET-SCHEDULED-REPORT-RESULTS-SUBJECT", 2, 0, false);
        declareMacro("do_smtp_accounts_for_cyclist", "DO-SMTP-ACCOUNTS-FOR-CYCLIST");
        declareFunction("try_to_email_scheduled_query_results", "TRY-TO-EMAIL-SCHEDULED-QUERY-RESULTS", 5, 0, false);
        declareFunction("try_to_email_scheduled_report_results", "TRY-TO-EMAIL-SCHEDULED-REPORT-RESULTS", 7, 0, false);
        declareFunction("email_scheduled_query_results", "EMAIL-SCHEDULED-QUERY-RESULTS", 6, 0, false);
        declareFunction("email_scheduled_report_results", "EMAIL-SCHEDULED-REPORT-RESULTS", 8, 0, false);
        declareFunction("make_log_file_name_from_report_file_name", "MAKE-LOG-FILE-NAME-FROM-REPORT-FILE-NAME", 1, 0, false);
        declareFunction("reify_scheduled_query_in_series", "REIFY-SCHEDULED-QUERY-IN-SERIES", 2, 0, false);
        declareFunction("scheduled_query_series_query_type", "SCHEDULED-QUERY-SERIES-QUERY-TYPE", 1, 0, false);
        declareFunction("run_scheduled_query", "RUN-SCHEDULED-QUERY", 2, 0, false);
        declareFunction("scheduled_query_problem_store_directory", "SCHEDULED-QUERY-PROBLEM-STORE-DIRECTORY", 0, 0, false);
        declareFunction("new_path_for_scheduled_query_problem_store", "NEW-PATH-FOR-SCHEDULED-QUERY-PROBLEM-STORE", 1, 0, false);
        declareFunction("start_scheduled_query_processing_internal", "START-SCHEDULED-QUERY-PROCESSING-INTERNAL", 0, 0, false);
        declareFunction("set_scheduled_query_image_flag", "SET-SCHEDULED-QUERY-IMAGE-FLAG", 1, 0, false);
        declareFunction("find_possible_scheduled_query_daemon_images", "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES", 0, 0, false);
        declareFunction("run_scheduled_queries_on_this_imageP", "RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?", 0, 0, false);
        declareFunction("ensure_scheduled_query_daemon_is_running", "ENSURE-SCHEDULED-QUERY-DAEMON-IS-RUNNING", 0, 0, false);
        declareFunction("launch_scheduled_query_runner", "LAUNCH-SCHEDULED-QUERY-RUNNER", 1, 0, false);
        declareFunction("launch_scheduled_query_daemon", "LAUNCH-SCHEDULED-QUERY-DAEMON", 0, 0, false);
        declareFunction("run_scheduled_queries", "RUN-SCHEDULED-QUERIES", 0, 0, false);
        declareFunction("maybe_run_next_scheduled_query", "MAYBE-RUN-NEXT-SCHEDULED-QUERY", 0, 0, false);
        declareFunction("scheduled_query_test_query", "SCHEDULED-QUERY-TEST-QUERY", 0, 0, false);
        declareFunction("start_daemon_and_schedule_query_once", "START-DAEMON-AND-SCHEDULE-QUERY-ONCE", 0, 2, false);
        declareFunction("schedule_test_query_and_wait_for_results", "SCHEDULE-TEST-QUERY-AND-WAIT-FOR-RESULTS", 0, 2, false);
        declareFunction("schedule_query_once_and_start_daemon", "SCHEDULE-QUERY-ONCE-AND-START-DAEMON", 0, 2, false);
        declareFunction("start_daemon_and_stop_receiving", "START-DAEMON-AND-STOP-RECEIVING", 0, 0, false);
        declareFunction("schedule_query_and_wait_for_processing", "SCHEDULE-QUERY-AND-WAIT-FOR-PROCESSING", 1, 0, false);
        declareFunction("get_scheduled_query_results", "GET-SCHEDULED-QUERY-RESULTS", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_scheduled_queries_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("start_scheduled_query_processing", "START-SCHEDULED-QUERY-PROCESSING", 0, 1, false);
            declareFunction("maybe_verify_test_query", "MAYBE-VERIFY-TEST-QUERY", 1, 0, false);
            declareFunction("halt_scheduled_query_processing", "HALT-SCHEDULED-QUERY-PROCESSING", 0, 0, false);
            declareFunction("add_recurring_query_schedule", "ADD-RECURRING-QUERY-SCHEDULE", 2, 4, false);
            declareFunction("make_recurring_query_schedule_assertions", "MAKE-RECURRING-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
            declareFunction("note_query_scheduling_complete", "NOTE-QUERY-SCHEDULING-COMPLETE", 1, 0, false);
            declareFunction("add_single_query_schedule", "ADD-SINGLE-QUERY-SCHEDULE", 2, 4, false);
            declareFunction("make_single_query_schedule_assertions", "MAKE-SINGLE-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
            declareFunction("remove_recurring_query_schedule", "REMOVE-RECURRING-QUERY-SCHEDULE", 2, 2, false);
            declareFunction("remove_single_query_schedule", "REMOVE-SINGLE-QUERY-SCHEDULE", 2, 2, false);
            declareFunction("scheduled_query_series_type", "SCHEDULED-QUERY-SERIES-TYPE", 2, 0, false);
            declareFunction("get_series_scheduler", "GET-SERIES-SCHEDULER", 1, 0, false);
            declareFunction("get_query_scheduling_mt", "GET-QUERY-SCHEDULING-MT", 0, 2, false);
            declareFunction("get_cached_results_for_cycl_query", "GET-CACHED-RESULTS-FOR-CYCL-QUERY", 1, 0, false);
            declareFunction("get_reified_inference_answer_count", "GET-REIFIED-INFERENCE-ANSWER-COUNT", 1, 0, false);
            declareFunction("get_schedules_for_cycl_query", "GET-SCHEDULES-FOR-CYCL-QUERY", 1, 0, false);
            declareFunction("scheduled_query_queue", "SCHEDULED-QUERY-QUEUE", 0, 0, false);
            declareFunction("get_scheduled_query_queue", "GET-SCHEDULED-QUERY-QUEUE", 0, 2, false);
            declareFunction("clear_scheduled_query_queue", "CLEAR-SCHEDULED-QUERY-QUEUE", 0, 0, false);
            declareFunction("scheduled_query_plist", "SCHEDULED-QUERY-PLIST", 1, 0, false);
            declareFunction("index_scheduled_query", "INDEX-SCHEDULED-QUERY", 1, 0, false);
            declareFunction("lookup_scheduled_query", "LOOKUP-SCHEDULED-QUERY", 1, 0, false);
            declareFunction("scheduled_query_p", "SCHEDULED-QUERY-P", 1, 0, false);
            declareFunction("scheduled_query_kbq", "SCHEDULED-QUERY-KBQ", 1, 0, false);
            declareFunction("scheduled_query_scheduled_run_time", "SCHEDULED-QUERY-SCHEDULED-RUN-TIME", 1, 0, false);
            declareFunction("scheduled_query_instance", "SCHEDULED-QUERY-INSTANCE", 1, 0, false);
            declareFunction("package_scheduled_query", "PACKAGE-SCHEDULED-QUERY", 3, 0, false);
            declareFunction("remove_query_or_series_from_queue", "REMOVE-QUERY-OR-SERIES-FROM-QUEUE", 1, 0, false);
            declareFunction("enqueue_scheduled_query", "ENQUEUE-SCHEDULED-QUERY", 1, 0, false);
            declareFunction("dequeue_scheduled_query", "DEQUEUE-SCHEDULED-QUERY", 0, 0, false);
            declareFunction("next_scheduled_query", "NEXT-SCHEDULED-QUERY", 0, 0, false);
            declareFunction("populate_scheduled_query_queue", "POPULATE-SCHEDULED-QUERY-QUEUE", 0, 0, false);
            declareFunction("schedule_query", "SCHEDULE-QUERY", 2, 1, false);
            declareFunction("add_scheduled_query", "ADD-SCHEDULED-QUERY", 2, 0, false);
            declareFunction("find_next_scheduled_time", "FIND-NEXT-SCHEDULED-TIME", 2, 0, false);
            declareFunction("find_next_scheduled_date", "FIND-NEXT-SCHEDULED-DATE", 2, 0, false);
            declareFunction("next_run_date_for_query_series", "NEXT-RUN-DATE-FOR-QUERY-SERIES", 2, 0, false);
            declareFunction("scheduled_run_date_for_query", "SCHEDULED-RUN-DATE-FOR-QUERY", 1, 0, false);
            declareFunction("kbq_for_query_event_or_series", "KBQ-FOR-QUERY-EVENT-OR-SERIES", 1, 0, false);
            declareFunction("get_currently_running_scheduled_queries", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES", 0, 2, false);
            declareFunction("get_currently_running_scheduled_queries_internal", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES-INTERNAL", 0, 0, false);
            declareFunction("scheduled_query_problem_store_inferences_plists", "SCHEDULED-QUERY-PROBLEM-STORE-INFERENCES-PLISTS", 1, 0, false);
            declareFunction("scheduled_query_inference_plist", "SCHEDULED-QUERY-INFERENCE-PLIST", 1, 0, false);
            declareFunction("abort_scheduled_query", "ABORT-SCHEDULED-QUERY", 1, 2, false);
            declareFunction("abort_active_scheduled_queries", "ABORT-ACTIVE-SCHEDULED-QUERIES", 0, 0, false);
            declareFunction("abort_scheduled_query_internal", "ABORT-SCHEDULED-QUERY-INTERNAL", 1, 0, false);
            declareFunction("should_skipXabort_scheduled_queryP", "SHOULD-SKIP/ABORT-SCHEDULED-QUERY?", 1, 0, false);
            declareFunction("note_scheduled_query_in_progress", "NOTE-SCHEDULED-QUERY-IN-PROGRESS", 1, 0, false);
            declareFunction("note_scheduled_query_finished_running", "NOTE-SCHEDULED-QUERY-FINISHED-RUNNING", 1, 0, false);
            declareFunction("scheduled_query_in_progressP", "SCHEDULED-QUERY-IN-PROGRESS?", 1, 0, false);
            declareFunction("run_packaged_scheduled_query", "RUN-PACKAGED-SCHEDULED-QUERY", 1, 0, false);
            declareFunction("cleanup_scheduled_query", "CLEANUP-SCHEDULED-QUERY", 1, 0, false);
            declareFunction("run_scheduled_query_internal", "RUN-SCHEDULED-QUERY-INTERNAL", 2, 0, false);
            declareFunction("get_mime_type_for_delimiter", "GET-MIME-TYPE-FOR-DELIMITER", 1, 0, false);
            declareFunction("get_subl_character", "GET-SUBL-CHARACTER", 1, 0, false);
            declareFunction("maybe_email_scheduled_query_results", "MAYBE-EMAIL-SCHEDULED-QUERY-RESULTS", 2, 0, false);
            declareFunction("results_should_be_emailed_to_address", "RESULTS-SHOULD-BE-EMAILED-TO-ADDRESS", 0, 0, false);
            declareFunction("get_email_recipients_for_scheduled_query_results", "GET-EMAIL-RECIPIENTS-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
            declareFunction("get_email_cc_for_scheduled_query_results", "GET-EMAIL-CC-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
            declareFunction("get_scheduled_query_results_message", "GET-SCHEDULED-QUERY-RESULTS-MESSAGE", 2, 0, false);
            declareFunction("get_scheduled_query_results_subject", "GET-SCHEDULED-QUERY-RESULTS-SUBJECT", 2, 0, false);
            declareFunction("extension_for_delimiter", "EXTENSION-FOR-DELIMITER", 1, 0, false);
            declareFunction("get_scheduled_report_results_subject", "GET-SCHEDULED-REPORT-RESULTS-SUBJECT", 3, 0, false);
            declareMacro("do_smtp_accounts_for_cyclist", "DO-SMTP-ACCOUNTS-FOR-CYCLIST");
            declareFunction("try_to_email_scheduled_query_results", "TRY-TO-EMAIL-SCHEDULED-QUERY-RESULTS", 5, 0, false);
            declareFunction("email_scheduled_query_results", "EMAIL-SCHEDULED-QUERY-RESULTS", 6, 0, false);
            declareFunction("reify_scheduled_query_in_series", "REIFY-SCHEDULED-QUERY-IN-SERIES", 2, 0, false);
            declareFunction("scheduled_query_series_query_type", "SCHEDULED-QUERY-SERIES-QUERY-TYPE", 1, 0, false);
            declareFunction("run_scheduled_query", "RUN-SCHEDULED-QUERY", 2, 0, false);
            declareFunction("scheduled_query_problem_store_directory", "SCHEDULED-QUERY-PROBLEM-STORE-DIRECTORY", 0, 0, false);
            declareFunction("new_path_for_scheduled_query_problem_store", "NEW-PATH-FOR-SCHEDULED-QUERY-PROBLEM-STORE", 1, 0, false);
            declareFunction("start_scheduled_query_processing_internal", "START-SCHEDULED-QUERY-PROCESSING-INTERNAL", 0, 0, false);
            declareFunction("set_scheduled_query_image_flag", "SET-SCHEDULED-QUERY-IMAGE-FLAG", 1, 0, false);
            declareFunction("find_possible_scheduled_query_daemon_images", "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES", 0, 0, false);
            declareFunction("run_scheduled_queries_on_this_imageP", "RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?", 0, 0, false);
            declareFunction("ensure_scheduled_query_daemon_is_running", "ENSURE-SCHEDULED-QUERY-DAEMON-IS-RUNNING", 0, 0, false);
            declareFunction("launch_scheduled_query_runner", "LAUNCH-SCHEDULED-QUERY-RUNNER", 1, 0, false);
            declareFunction("launch_scheduled_query_daemon", "LAUNCH-SCHEDULED-QUERY-DAEMON", 0, 0, false);
            declareFunction("run_scheduled_queries", "RUN-SCHEDULED-QUERIES", 0, 0, false);
            declareFunction("maybe_run_next_scheduled_query", "MAYBE-RUN-NEXT-SCHEDULED-QUERY", 0, 0, false);
            declareFunction("sqd_note_new_fort", "SQD-NOTE-NEW-FORT", 1, 0, false);
            declareFunction("sqd_cleanup_new_forts", "SQD-CLEANUP-NEW-FORTS", 0, 0, false);
            declareFunction("scheduled_query_test_query", "SCHEDULED-QUERY-TEST-QUERY", 0, 0, false);
            declareMacro("with_sqd_timeout", "WITH-SQD-TIMEOUT");
            declareFunction("start_daemon_and_schedule_query_once", "START-DAEMON-AND-SCHEDULE-QUERY-ONCE", 0, 2, false);
            declareFunction("schedule_test_query_and_wait_for_results", "SCHEDULE-TEST-QUERY-AND-WAIT-FOR-RESULTS", 0, 2, false);
            declareFunction("schedule_query_once_and_start_daemon", "SCHEDULE-QUERY-ONCE-AND-START-DAEMON", 0, 2, false);
            declareFunction("start_daemon_and_stop_receiving", "START-DAEMON-AND-STOP-RECEIVING", 0, 0, false);
            declareFunction("schedule_query_and_wait_for_processing", "SCHEDULE-QUERY-AND-WAIT-FOR-PROCESSING", 1, 0, false);
            declareFunction("get_scheduled_query_results", "GET-SCHEDULED-QUERY-RESULTS", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("run_scheduled_query_internal", "RUN-SCHEDULED-QUERY-INTERNAL", 3, 0, false);
            declareFunction("run_scheduled_report", "RUN-SCHEDULED-REPORT", 3, 0, false);
            declareFunction("make_unused_report_file_name", "MAKE-UNUSED-REPORT-FILE-NAME", 2, 0, false);
            declareFunction("maybe_email_scheduled_report_results", "MAYBE-EMAIL-SCHEDULED-REPORT-RESULTS", 5, 0, false);
            declareFunction("get_scheduled_report_results_message", "GET-SCHEDULED-REPORT-RESULTS-MESSAGE", 2, 0, false);
            declareFunction("get_scheduled_report_results_subject", "GET-SCHEDULED-REPORT-RESULTS-SUBJECT", 2, 0, false);
            declareFunction("try_to_email_scheduled_report_results", "TRY-TO-EMAIL-SCHEDULED-REPORT-RESULTS", 7, 0, false);
            declareFunction("email_scheduled_report_results", "EMAIL-SCHEDULED-REPORT-RESULTS", 8, 0, false);
            declareFunction("make_log_file_name_from_report_file_name", "MAKE-LOG-FILE-NAME-FROM-REPORT-FILE-NAME", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_scheduled_queries_file_Previous() {
        declareFunction("start_scheduled_query_processing", "START-SCHEDULED-QUERY-PROCESSING", 0, 1, false);
        declareFunction("maybe_verify_test_query", "MAYBE-VERIFY-TEST-QUERY", 1, 0, false);
        declareFunction("halt_scheduled_query_processing", "HALT-SCHEDULED-QUERY-PROCESSING", 0, 0, false);
        declareFunction("add_recurring_query_schedule", "ADD-RECURRING-QUERY-SCHEDULE", 2, 4, false);
        declareFunction("make_recurring_query_schedule_assertions", "MAKE-RECURRING-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
        declareFunction("note_query_scheduling_complete", "NOTE-QUERY-SCHEDULING-COMPLETE", 1, 0, false);
        declareFunction("add_single_query_schedule", "ADD-SINGLE-QUERY-SCHEDULE", 2, 4, false);
        declareFunction("make_single_query_schedule_assertions", "MAKE-SINGLE-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
        declareFunction("remove_recurring_query_schedule", "REMOVE-RECURRING-QUERY-SCHEDULE", 2, 2, false);
        declareFunction("remove_single_query_schedule", "REMOVE-SINGLE-QUERY-SCHEDULE", 2, 2, false);
        declareFunction("scheduled_query_series_type", "SCHEDULED-QUERY-SERIES-TYPE", 2, 0, false);
        declareFunction("get_series_scheduler", "GET-SERIES-SCHEDULER", 1, 0, false);
        declareFunction("get_query_scheduling_mt", "GET-QUERY-SCHEDULING-MT", 0, 2, false);
        declareFunction("get_cached_results_for_cycl_query", "GET-CACHED-RESULTS-FOR-CYCL-QUERY", 1, 0, false);
        declareFunction("get_reified_inference_answer_count", "GET-REIFIED-INFERENCE-ANSWER-COUNT", 1, 0, false);
        declareFunction("get_schedules_for_cycl_query", "GET-SCHEDULES-FOR-CYCL-QUERY", 1, 0, false);
        declareFunction("scheduled_query_queue", "SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction("get_scheduled_query_queue", "GET-SCHEDULED-QUERY-QUEUE", 0, 2, false);
        declareFunction("clear_scheduled_query_queue", "CLEAR-SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction("scheduled_query_plist", "SCHEDULED-QUERY-PLIST", 1, 0, false);
        declareFunction("index_scheduled_query", "INDEX-SCHEDULED-QUERY", 1, 0, false);
        declareFunction("lookup_scheduled_query", "LOOKUP-SCHEDULED-QUERY", 1, 0, false);
        declareFunction("scheduled_query_p", "SCHEDULED-QUERY-P", 1, 0, false);
        declareFunction("scheduled_query_kbq", "SCHEDULED-QUERY-KBQ", 1, 0, false);
        declareFunction("scheduled_query_scheduled_run_time", "SCHEDULED-QUERY-SCHEDULED-RUN-TIME", 1, 0, false);
        declareFunction("scheduled_query_instance", "SCHEDULED-QUERY-INSTANCE", 1, 0, false);
        declareFunction("package_scheduled_query", "PACKAGE-SCHEDULED-QUERY", 3, 0, false);
        declareFunction("remove_query_or_series_from_queue", "REMOVE-QUERY-OR-SERIES-FROM-QUEUE", 1, 0, false);
        declareFunction("enqueue_scheduled_query", "ENQUEUE-SCHEDULED-QUERY", 1, 0, false);
        declareFunction("dequeue_scheduled_query", "DEQUEUE-SCHEDULED-QUERY", 0, 0, false);
        declareFunction("next_scheduled_query", "NEXT-SCHEDULED-QUERY", 0, 0, false);
        declareFunction("populate_scheduled_query_queue", "POPULATE-SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction("schedule_query", "SCHEDULE-QUERY", 2, 1, false);
        declareFunction("add_scheduled_query", "ADD-SCHEDULED-QUERY", 2, 0, false);
        declareFunction("find_next_scheduled_time", "FIND-NEXT-SCHEDULED-TIME", 2, 0, false);
        declareFunction("find_next_scheduled_date", "FIND-NEXT-SCHEDULED-DATE", 2, 0, false);
        declareFunction("next_run_date_for_query_series", "NEXT-RUN-DATE-FOR-QUERY-SERIES", 2, 0, false);
        declareFunction("scheduled_run_date_for_query", "SCHEDULED-RUN-DATE-FOR-QUERY", 1, 0, false);
        declareFunction("kbq_for_query_event_or_series", "KBQ-FOR-QUERY-EVENT-OR-SERIES", 1, 0, false);
        declareFunction("get_currently_running_scheduled_queries", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES", 0, 2, false);
        declareFunction("get_currently_running_scheduled_queries_internal", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES-INTERNAL", 0, 0, false);
        declareFunction("scheduled_query_problem_store_inferences_plists", "SCHEDULED-QUERY-PROBLEM-STORE-INFERENCES-PLISTS", 1, 0, false);
        declareFunction("scheduled_query_inference_plist", "SCHEDULED-QUERY-INFERENCE-PLIST", 1, 0, false);
        declareFunction("abort_scheduled_query", "ABORT-SCHEDULED-QUERY", 1, 2, false);
        declareFunction("abort_active_scheduled_queries", "ABORT-ACTIVE-SCHEDULED-QUERIES", 0, 0, false);
        declareFunction("abort_scheduled_query_internal", "ABORT-SCHEDULED-QUERY-INTERNAL", 1, 0, false);
        declareFunction("should_skipXabort_scheduled_queryP", "SHOULD-SKIP/ABORT-SCHEDULED-QUERY?", 1, 0, false);
        declareFunction("note_scheduled_query_in_progress", "NOTE-SCHEDULED-QUERY-IN-PROGRESS", 1, 0, false);
        declareFunction("note_scheduled_query_finished_running", "NOTE-SCHEDULED-QUERY-FINISHED-RUNNING", 1, 0, false);
        declareFunction("scheduled_query_in_progressP", "SCHEDULED-QUERY-IN-PROGRESS?", 1, 0, false);
        declareFunction("run_packaged_scheduled_query", "RUN-PACKAGED-SCHEDULED-QUERY", 1, 0, false);
        declareFunction("cleanup_scheduled_query", "CLEANUP-SCHEDULED-QUERY", 1, 0, false);
        declareFunction("run_scheduled_query_internal", "RUN-SCHEDULED-QUERY-INTERNAL", 2, 0, false);
        declareFunction("get_mime_type_for_delimiter", "GET-MIME-TYPE-FOR-DELIMITER", 1, 0, false);
        declareFunction("get_subl_character", "GET-SUBL-CHARACTER", 1, 0, false);
        declareFunction("maybe_email_scheduled_query_results", "MAYBE-EMAIL-SCHEDULED-QUERY-RESULTS", 2, 0, false);
        declareFunction("results_should_be_emailed_to_address", "RESULTS-SHOULD-BE-EMAILED-TO-ADDRESS", 0, 0, false);
        declareFunction("get_email_recipients_for_scheduled_query_results", "GET-EMAIL-RECIPIENTS-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
        declareFunction("get_email_cc_for_scheduled_query_results", "GET-EMAIL-CC-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
        declareFunction("get_scheduled_query_results_message", "GET-SCHEDULED-QUERY-RESULTS-MESSAGE", 2, 0, false);
        declareFunction("get_scheduled_query_results_subject", "GET-SCHEDULED-QUERY-RESULTS-SUBJECT", 2, 0, false);
        declareFunction("extension_for_delimiter", "EXTENSION-FOR-DELIMITER", 1, 0, false);
        declareFunction("get_scheduled_report_results_subject", "GET-SCHEDULED-REPORT-RESULTS-SUBJECT", 3, 0, false);
        declareMacro("do_smtp_accounts_for_cyclist", "DO-SMTP-ACCOUNTS-FOR-CYCLIST");
        declareFunction("try_to_email_scheduled_query_results", "TRY-TO-EMAIL-SCHEDULED-QUERY-RESULTS", 5, 0, false);
        declareFunction("email_scheduled_query_results", "EMAIL-SCHEDULED-QUERY-RESULTS", 6, 0, false);
        declareFunction("reify_scheduled_query_in_series", "REIFY-SCHEDULED-QUERY-IN-SERIES", 2, 0, false);
        declareFunction("scheduled_query_series_query_type", "SCHEDULED-QUERY-SERIES-QUERY-TYPE", 1, 0, false);
        declareFunction("run_scheduled_query", "RUN-SCHEDULED-QUERY", 2, 0, false);
        declareFunction("scheduled_query_problem_store_directory", "SCHEDULED-QUERY-PROBLEM-STORE-DIRECTORY", 0, 0, false);
        declareFunction("new_path_for_scheduled_query_problem_store", "NEW-PATH-FOR-SCHEDULED-QUERY-PROBLEM-STORE", 1, 0, false);
        declareFunction("start_scheduled_query_processing_internal", "START-SCHEDULED-QUERY-PROCESSING-INTERNAL", 0, 0, false);
        declareFunction("set_scheduled_query_image_flag", "SET-SCHEDULED-QUERY-IMAGE-FLAG", 1, 0, false);
        declareFunction("find_possible_scheduled_query_daemon_images", "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES", 0, 0, false);
        declareFunction("run_scheduled_queries_on_this_imageP", "RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?", 0, 0, false);
        declareFunction("ensure_scheduled_query_daemon_is_running", "ENSURE-SCHEDULED-QUERY-DAEMON-IS-RUNNING", 0, 0, false);
        declareFunction("launch_scheduled_query_runner", "LAUNCH-SCHEDULED-QUERY-RUNNER", 1, 0, false);
        declareFunction("launch_scheduled_query_daemon", "LAUNCH-SCHEDULED-QUERY-DAEMON", 0, 0, false);
        declareFunction("run_scheduled_queries", "RUN-SCHEDULED-QUERIES", 0, 0, false);
        declareFunction("maybe_run_next_scheduled_query", "MAYBE-RUN-NEXT-SCHEDULED-QUERY", 0, 0, false);
        declareFunction("sqd_note_new_fort", "SQD-NOTE-NEW-FORT", 1, 0, false);
        declareFunction("sqd_cleanup_new_forts", "SQD-CLEANUP-NEW-FORTS", 0, 0, false);
        declareFunction("scheduled_query_test_query", "SCHEDULED-QUERY-TEST-QUERY", 0, 0, false);
        declareMacro("with_sqd_timeout", "WITH-SQD-TIMEOUT");
        declareFunction("start_daemon_and_schedule_query_once", "START-DAEMON-AND-SCHEDULE-QUERY-ONCE", 0, 2, false);
        declareFunction("schedule_test_query_and_wait_for_results", "SCHEDULE-TEST-QUERY-AND-WAIT-FOR-RESULTS", 0, 2, false);
        declareFunction("schedule_query_once_and_start_daemon", "SCHEDULE-QUERY-ONCE-AND-START-DAEMON", 0, 2, false);
        declareFunction("start_daemon_and_stop_receiving", "START-DAEMON-AND-STOP-RECEIVING", 0, 0, false);
        declareFunction("schedule_query_and_wait_for_processing", "SCHEDULE-QUERY-AND-WAIT-FOR-PROCESSING", 1, 0, false);
        declareFunction("get_scheduled_query_results", "GET-SCHEDULED-QUERY-RESULTS", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_scheduled_queries_file_alt() {
        deflexical("*SCHEDULED-QUERY-QUEUE*", create_p_queue(NIL, SCHEDULED_QUERY_SCHEDULED_RUN_TIME, UNPROVIDED));
        deflexical("*SCHEDULED-QUERY-QUEUE-LOCK*", make_lock($$$Scheduled_Query_Queue_Lock));
        deflexical("*UT-OFFSET-TO-UNIX-TIME*", $int$2208988800);
        deflexical("*IN-PROGRESS-QUERIES*", NIL);
        deflexical("*COMPLETED-QUERIES*", NIL);
        deflexical("*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*", NIL != boundp($max_number_of_simultaneous_scheduled_queries$) ? ((SubLObject) ($max_number_of_simultaneous_scheduled_queries$.getGlobalValue())) : ONE_INTEGER);
        deflexical("*ACTIVE-SCHEDULED-QUERIES*", NIL != boundp($active_scheduled_queries$) ? ((SubLObject) ($active_scheduled_queries$.getGlobalValue())) : NIL);
        deflexical("*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*", $str_alt150$The_following_query_has_been_run_);
        deflexical("*SCHEDULED-QUERY-DAEMON*", NIL != boundp($scheduled_query_daemon$) ? ((SubLObject) ($scheduled_query_daemon$.getGlobalValue())) : uninitialized());
        deflexical("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*", NIL != boundp($run_scheduled_queries_on_this_imageP$) ? ((SubLObject) ($run_scheduled_queries_on_this_imageP$.getGlobalValue())) : NIL);
        deflexical("*SCHEDULED-QUERY-RUNNER-ISG*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_scheduled_queries_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SCHEDULED-QUERY-QUEUE*", $UNINITIALIZED);
            deflexical("*SCHEDULED-QUERY-QUEUE-LOCK*", make_lock(scheduled_queries.$$$Scheduled_Query_Queue_Lock));
            deflexical("*UT-OFFSET-TO-UNIX-TIME*", scheduled_queries.$int$2208988800);
            deflexical("*SCHEDULED-QUERY-INDEX*", SubLTrampolineFile.maybeDefault(scheduled_queries.$scheduled_query_index$, scheduled_queries.$scheduled_query_index$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*IN-PROGRESS-QUERIES*", NIL);
            deflexical("*COMPLETED-QUERIES*", NIL);
            deflexical("*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault(scheduled_queries.$max_number_of_simultaneous_scheduled_queries$, scheduled_queries.$max_number_of_simultaneous_scheduled_queries$, ONE_INTEGER));
            deflexical("*ACTIVE-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault(scheduled_queries.$active_scheduled_queries$, scheduled_queries.$active_scheduled_queries$, NIL));
            deflexical("*ABORTED-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault(scheduled_queries.$aborted_scheduled_queries$, scheduled_queries.$aborted_scheduled_queries$, NIL));
            deflexical("*SCHEDULED-QUERY-CLEANUP-LOCK*", make_lock(scheduled_queries.$$$Scheduled_Query_Cleanup_Lock));
            deflexical("*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*", scheduled_queries.$str136$The_following_query_has_been_run_);
            deflexical("*SCHEDULED-QUERY-DAEMON*", SubLTrampolineFile.maybeDefault(scheduled_queries.$scheduled_query_daemon$, scheduled_queries.$scheduled_query_daemon$, () -> misc_utilities.uninitialized()));
            deflexical("*SCHEDULED-QUERY-COMPUTER-INFO-MT*", scheduled_queries.$$QuerySchedulerDaemonComputersMt);
            deflexical("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*", SubLTrampolineFile.maybeDefault(scheduled_queries.$run_scheduled_queries_on_this_imageP$, scheduled_queries.$run_scheduled_queries_on_this_imageP$, NIL));
            deflexical("*SCHEDULED-QUERY-RUNNER-ISG*", new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            defparameter("*SQD-NEW-FORTS-TO-CLEANUP*", misc_utilities.uninitialized());
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SCHEDULED-QUERY-QUEUE*", create_p_queue(NIL, SCHEDULED_QUERY_SCHEDULED_RUN_TIME, UNPROVIDED));
            deflexical("*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*", NIL != boundp($max_number_of_simultaneous_scheduled_queries$) ? ((SubLObject) ($max_number_of_simultaneous_scheduled_queries$.getGlobalValue())) : ONE_INTEGER);
            deflexical("*ACTIVE-SCHEDULED-QUERIES*", NIL != boundp($active_scheduled_queries$) ? ((SubLObject) ($active_scheduled_queries$.getGlobalValue())) : NIL);
            deflexical("*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*", $str_alt150$The_following_query_has_been_run_);
            deflexical("*SCHEDULED-QUERY-DAEMON*", NIL != boundp($scheduled_query_daemon$) ? ((SubLObject) ($scheduled_query_daemon$.getGlobalValue())) : uninitialized());
            deflexical("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*", NIL != boundp($run_scheduled_queries_on_this_imageP$) ? ((SubLObject) ($run_scheduled_queries_on_this_imageP$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_scheduled_queries_file_Previous() {
        deflexical("*SCHEDULED-QUERY-QUEUE*", $UNINITIALIZED);
        deflexical("*SCHEDULED-QUERY-QUEUE-LOCK*", make_lock(scheduled_queries.$$$Scheduled_Query_Queue_Lock));
        deflexical("*UT-OFFSET-TO-UNIX-TIME*", scheduled_queries.$int$2208988800);
        deflexical("*SCHEDULED-QUERY-INDEX*", SubLTrampolineFile.maybeDefault(scheduled_queries.$scheduled_query_index$, scheduled_queries.$scheduled_query_index$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*IN-PROGRESS-QUERIES*", NIL);
        deflexical("*COMPLETED-QUERIES*", NIL);
        deflexical("*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault(scheduled_queries.$max_number_of_simultaneous_scheduled_queries$, scheduled_queries.$max_number_of_simultaneous_scheduled_queries$, ONE_INTEGER));
        deflexical("*ACTIVE-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault(scheduled_queries.$active_scheduled_queries$, scheduled_queries.$active_scheduled_queries$, NIL));
        deflexical("*ABORTED-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault(scheduled_queries.$aborted_scheduled_queries$, scheduled_queries.$aborted_scheduled_queries$, NIL));
        deflexical("*SCHEDULED-QUERY-CLEANUP-LOCK*", make_lock(scheduled_queries.$$$Scheduled_Query_Cleanup_Lock));
        deflexical("*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*", scheduled_queries.$str136$The_following_query_has_been_run_);
        deflexical("*SCHEDULED-QUERY-DAEMON*", SubLTrampolineFile.maybeDefault(scheduled_queries.$scheduled_query_daemon$, scheduled_queries.$scheduled_query_daemon$, () -> misc_utilities.uninitialized()));
        deflexical("*SCHEDULED-QUERY-COMPUTER-INFO-MT*", scheduled_queries.$$QuerySchedulerDaemonComputersMt);
        deflexical("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*", SubLTrampolineFile.maybeDefault(scheduled_queries.$run_scheduled_queries_on_this_imageP$, scheduled_queries.$run_scheduled_queries_on_this_imageP$, NIL));
        deflexical("*SCHEDULED-QUERY-RUNNER-ISG*", new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*SQD-NEW-FORTS-TO-CLEANUP*", misc_utilities.uninitialized());
        return NIL;
    }

    public static final SubLObject setup_scheduled_queries_file_alt() {
        register_external_symbol(ADD_RECURRING_QUERY_SCHEDULE);
        register_external_symbol(ADD_SINGLE_QUERY_SCHEDULE);
        register_external_symbol(REMOVE_RECURRING_QUERY_SCHEDULE);
        register_external_symbol(REMOVE_SINGLE_QUERY_SCHEDULE);
        register_external_symbol(GET_CACHED_RESULTS_FOR_CYCL_QUERY);
        register_external_symbol(GET_SCHEDULES_FOR_CYCL_QUERY);
        register_external_symbol(GET_SCHEDULED_QUERY_QUEUE);
        register_kb_function(ADD_SCHEDULED_QUERY);
        declare_defglobal($max_number_of_simultaneous_scheduled_queries$);
        declare_defglobal($active_scheduled_queries$);
        register_external_symbol(GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES);
        declare_defglobal($scheduled_query_daemon$);
        declare_defglobal($run_scheduled_queries_on_this_imageP$);
        register_external_symbol(FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES);
        define_test_case_table_int(START_DAEMON_AND_SCHEDULE_QUERY_ONCE, list(new SubLObject[]{ $TEST, TREE_MATCHES_PATTERN, $OWNER, $$$baxter, $CLASSES, $list_alt224, $KB, $FULL, $WORKING_, T }), $list_alt228);
        define_test_case_table_int(SCHEDULE_QUERY_ONCE_AND_START_DAEMON, list(new SubLObject[]{ $TEST, TREE_MATCHES_PATTERN, $OWNER, $$$baxter, $CLASSES, $list_alt224, $KB, $FULL, $WORKING_, T }), $list_alt228);
        return NIL;
    }

    public static SubLObject setup_scheduled_queries_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(scheduled_queries.ADD_RECURRING_QUERY_SCHEDULE);
            register_external_symbol(scheduled_queries.ADD_SINGLE_QUERY_SCHEDULE);
            register_external_symbol(scheduled_queries.REMOVE_RECURRING_QUERY_SCHEDULE);
            register_external_symbol(scheduled_queries.REMOVE_SINGLE_QUERY_SCHEDULE);
            register_external_symbol(scheduled_queries.GET_CACHED_RESULTS_FOR_CYCL_QUERY);
            register_external_symbol(scheduled_queries.GET_SCHEDULES_FOR_CYCL_QUERY);
            register_external_symbol(scheduled_queries.GET_SCHEDULED_QUERY_QUEUE);
            declare_defglobal(scheduled_queries.$scheduled_query_index$);
            register_kb_function(scheduled_queries.ADD_SCHEDULED_QUERY);
            declare_defglobal(scheduled_queries.$max_number_of_simultaneous_scheduled_queries$);
            declare_defglobal(scheduled_queries.$active_scheduled_queries$);
            register_external_symbol(scheduled_queries.GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES);
            declare_defglobal(scheduled_queries.$aborted_scheduled_queries$);
            register_external_symbol(scheduled_queries.ABORT_SCHEDULED_QUERY);
            declare_defglobal(scheduled_queries.$scheduled_query_daemon$);
            declare_defglobal(scheduled_queries.$run_scheduled_queries_on_this_imageP$);
            register_external_symbol(scheduled_queries.FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES);
            define_test_case_table_int(scheduled_queries.START_DAEMON_AND_SCHEDULE_QUERY_ONCE, list(new SubLObject[]{ $TEST, scheduled_queries.TREE_MATCHES_PATTERN, $OWNER, NIL, $CLASSES, scheduled_queries.$list204, $KB, $FULL, $WORKING_, NIL }), scheduled_queries.$list208);
            define_test_case_table_int(scheduled_queries.SCHEDULE_QUERY_ONCE_AND_START_DAEMON, list(new SubLObject[]{ $TEST, scheduled_queries.TREE_MATCHES_PATTERN, $OWNER, NIL, $CLASSES, scheduled_queries.$list204, $KB, $FULL, $WORKING_, NIL }), scheduled_queries.$list208);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($run_scheduled_queries_on_this_imageP$);
            define_test_case_table_int(START_DAEMON_AND_SCHEDULE_QUERY_ONCE, list(new SubLObject[]{ $TEST, TREE_MATCHES_PATTERN, $OWNER, $$$baxter, $CLASSES, $list_alt224, $KB, $FULL, $WORKING_, T }), $list_alt228);
            define_test_case_table_int(SCHEDULE_QUERY_ONCE_AND_START_DAEMON, list(new SubLObject[]{ $TEST, TREE_MATCHES_PATTERN, $OWNER, $$$baxter, $CLASSES, $list_alt224, $KB, $FULL, $WORKING_, T }), $list_alt228);
        }
        return NIL;
    }

    public static SubLObject setup_scheduled_queries_file_Previous() {
        register_external_symbol(scheduled_queries.ADD_RECURRING_QUERY_SCHEDULE);
        register_external_symbol(scheduled_queries.ADD_SINGLE_QUERY_SCHEDULE);
        register_external_symbol(scheduled_queries.REMOVE_RECURRING_QUERY_SCHEDULE);
        register_external_symbol(scheduled_queries.REMOVE_SINGLE_QUERY_SCHEDULE);
        register_external_symbol(scheduled_queries.GET_CACHED_RESULTS_FOR_CYCL_QUERY);
        register_external_symbol(scheduled_queries.GET_SCHEDULES_FOR_CYCL_QUERY);
        register_external_symbol(scheduled_queries.GET_SCHEDULED_QUERY_QUEUE);
        declare_defglobal(scheduled_queries.$scheduled_query_index$);
        register_kb_function(scheduled_queries.ADD_SCHEDULED_QUERY);
        declare_defglobal(scheduled_queries.$max_number_of_simultaneous_scheduled_queries$);
        declare_defglobal(scheduled_queries.$active_scheduled_queries$);
        register_external_symbol(scheduled_queries.GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES);
        declare_defglobal(scheduled_queries.$aborted_scheduled_queries$);
        register_external_symbol(scheduled_queries.ABORT_SCHEDULED_QUERY);
        declare_defglobal(scheduled_queries.$scheduled_query_daemon$);
        declare_defglobal(scheduled_queries.$run_scheduled_queries_on_this_imageP$);
        register_external_symbol(scheduled_queries.FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES);
        define_test_case_table_int(scheduled_queries.START_DAEMON_AND_SCHEDULE_QUERY_ONCE, list(new SubLObject[]{ $TEST, scheduled_queries.TREE_MATCHES_PATTERN, $OWNER, NIL, $CLASSES, scheduled_queries.$list204, $KB, $FULL, $WORKING_, NIL }), scheduled_queries.$list208);
        define_test_case_table_int(scheduled_queries.SCHEDULE_QUERY_ONCE_AND_START_DAEMON, list(new SubLObject[]{ $TEST, scheduled_queries.TREE_MATCHES_PATTERN, $OWNER, NIL, $CLASSES, scheduled_queries.$list204, $KB, $FULL, $WORKING_, NIL }), scheduled_queries.$list208);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        scheduled_queries.declare_scheduled_queries_file();
    }

    @Override
    public void initializeVariables() {
        scheduled_queries.init_scheduled_queries_file();
    }

    @Override
    public void runTopLevelForms() {
        scheduled_queries.setup_scheduled_queries_file();
    }

    static private final SubLString $str_alt1$__Scheduling_test_query_____ = makeString("~&Scheduling test query...~%");

    static private final SubLString $str_alt2$__Timed_out_after__D_seconds___ = makeString("~&Timed out after ~D seconds.~%");

    static private final SubLString $str_alt3$Failed_to_get_test_query_results_ = makeString("Failed to get test query results.");

    static private final SubLString $str_alt4$__Got_results___S__ = makeString("~&Got results: ~S~%");

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("PeriodicEventSeries"), reader_make_constant_shell("PurposefulAction"));

    static private final SubLList $list_alt14 = list(reader_make_constant_shell("InformationGathering"));

    static private final SubLList $list_alt21 = list(reader_make_constant_shell("CycQueryRunning"), reader_make_constant_shell("ScheduledAction"));

    static private final SubLList $list_alt26 = list(reader_make_constant_shell("ScheduledQueryDaemon"));

    static private final SubLList $list_alt29 = list(makeSymbol("THIS-CYCLIST"), makeSymbol("QUERY-SERIES"), makeSymbol("THIS-INTERVAL-TYPE"), makeSymbol("THIS-TASK"));

    static private final SubLList $list_alt31 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?CYCLIST"), makeSymbol("?SERIES"), makeSymbol("?INTERVAL-TYPE"), makeSymbol("?TASK"))));

    static private final SubLList $list_alt33 = list(makeSymbol("THIS-CYCLIST"), makeSymbol("QUERY-EVENT"), makeSymbol("THIS-DATE"), makeSymbol("THIS-TASK"));

    static private final SubLList $list_alt35 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?CYCLIST"), makeSymbol("?QUERY-EVENT"), makeSymbol("?DATE"), makeSymbol("?TASK"))));

    static private final SubLList $list_alt38 = list(reader_make_constant_shell("directingAgent"), reader_make_constant_shell("ScheduledQueryDaemon"));

    static private final SubLList $list_alt40 = list($BIND, makeSymbol("THIS-SCHEDULER"));

    static private final SubLString $str_alt52$_ = makeString(" ");

    static private final SubLList $list_alt58 = list(makeSymbol("?COUNT"));

    static private final SubLList $list_alt60 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    static private final SubLList $list_alt63 = list(makeSymbol("?BINDINGS"));

    static private final SubLList $list_alt69 = list(reader_make_constant_shell("resultsShouldBeEmailedToAddress-CC"));

    static private final SubLList $list_alt70 = list(makeKeyword("EMAIL-RECIPIENTS"), makeKeyword("EMAIL-CC"));

    static private final SubLList $list_alt77 = list(makeSymbol("GET-SCHEDULED-QUERY-QUEUE"), NIL, NIL);

    private static final SubLSymbol SCHEDULED_QUERY_PLIST = makeSymbol("SCHEDULED-QUERY-PLIST");

    static private final SubLSymbol $sym79$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    static private final SubLList $list_alt100 = list(makeSymbol("SCHEDULED-QUERY"), makeSymbol("KBQ"));

    static private final SubLList $list_alt102 = list(makeSymbol("SCHEDULED-QUERY-SERIES"), makeSymbol("KBQ"));

    public static final SubLObject $const105$KBQ_FindNextFutureStartDateForQue = reader_make_constant_shell("KBQ-FindNextFutureStartDateForQueryInSeries");

    public static final SubLObject $const106$KBQ_FindNextStartDateForQueryInSe = reader_make_constant_shell("KBQ-FindNextStartDateForQueryInSeries");

    public static final SubLObject $const107$KBQ_FindStartDateForScheduledQuer = reader_make_constant_shell("KBQ-FindStartDateForScheduledQuery");

    static private final SubLList $list_alt112 = cons(makeSymbol("KBQ"), makeSymbol("PROBLEM-STORE"));

    public static final SubLObject $const122$reportSpecificationDelimiterChara = reader_make_constant_shell("reportSpecificationDelimiterCharacter");

    public static final SubLObject $const123$reportSpecificationSelectionSente = reader_make_constant_shell("reportSpecificationSelectionSentence");

    static private final SubLSymbol $sym124$1_ = makeSymbol("1-");



    static private final SubLSymbol $sym126$_ = makeSymbol("<");



    public static final SubLObject $const128$reportSpecificationClobberMultipl = reader_make_constant_shell("reportSpecificationClobberMultipleValues");



    private static final SubLSymbol $REPORT_KNOWLEDGE_SOURCE = makeKeyword("REPORT-KNOWLEDGE-SOURCE");

    private static final SubLSymbol $DELIMITER = makeKeyword("DELIMITER");

    private static final SubLSymbol $SELECTION_SENTENCE = makeKeyword("SELECTION-SENTENCE");

    private static final SubLSymbol $COLUMN_RANGE = makeKeyword("COLUMN-RANGE");

    public static final SubLSymbol $kw136$CLOBBER_MULTIPLE_VALUES_ = makeKeyword("CLOBBER-MULTIPLE-VALUES?");

    private static final SubLSymbol $LOG_STREAM = makeKeyword("LOG-STREAM");



    static private final SubLString $str_alt141$text_csv = makeString("text/csv");

    static private final SubLString $str_alt142$text_tsv = makeString("text/tsv");

    static private final SubLString $str_alt143$text_plain = makeString("text/plain");

    static private final SubLString $str_alt144$report_ = makeString("report-");

    static private final SubLString $str_alt145$_ = makeString("-");

    static private final SubLString $str_alt146$_ = makeString(".");

    static private final SubLList $list_alt148 = list(reader_make_constant_shell("stringVersionOfCharacter"), reader_make_constant_shell("termStrings"));

    static private final SubLString $str_alt149$6cb141db_9948_4a5b_b7ae_a86899c41 = makeString("6cb141db-9948-4a5b-b7ae-a86899c41036");

    static private final SubLString $str_alt150$The_following_query_has_been_run_ = makeString("The following query has been run:\n\nName: ~S\nParaphrase: ~S\nResults: ~D~%");

    static private final SubLString $str_alt154$Scheduled_Query_Results__ = makeString("Scheduled Query Results: ");

    static private final SubLString $str_alt155$_answers_for_ = makeString(" answers for ");

    static private final SubLString $str_alt156$The_results_of_your_report_are_at = makeString("The results of your report are attached and have been saved as ~A.");

    static private final SubLString $str_alt157$___You_can_retrieve_this_file_at_ = makeString("~% You can retrieve this file at the following URL:~% ~A");

    static private final SubLString $str_alt158$Your_scheduled_report_did_not_run = makeString("Your scheduled report did not run successfully.");

    static private final SubLString $$$Report_generation_failed = makeString("Report generation failed");

    static private final SubLList $list_alt164 = list(list(makeSymbol("CYCLIST"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt165 = list($DONE);

    static private final SubLSymbol $sym168$EL_LIST = makeUninternedSymbol("EL-LIST");

    static private final SubLSymbol $sym169$SMTP_ACCOUNT = makeUninternedSymbol("SMTP-ACCOUNT");

    static private final SubLSymbol $sym170$INFO = makeUninternedSymbol("INFO");

    static private final SubLList $list_alt177 = cons(makeSymbol("PORT"), makeSymbol("HOST"));

    static private final SubLString $str_alt178$scheduled_query_daemon_cyc_com = makeString("scheduled-query-daemon@cyc.com");

    static private final SubLString $str_alt180$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt181$log_ = makeString("log-");

    static private final SubLString $str_alt182$_txt = makeString(".txt");

    static private final SubLString $str_alt190$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt195$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt196$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt198$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt200$data_problem_stores_ = makeString("data/problem-stores/");

    static private final SubLString $str_alt202$_ = makeString("/");

    static private final SubLString $str_alt203$store_ = makeString("store-");

    static private final SubLString $str_alt204$_cfasl = makeString(".cfasl");

    
    static private final SubLString $str_alt214$Scheduled_Query_Runner_ = makeString("Scheduled Query Runner ");

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt224 = list(makeSymbol("SCHEDULED-QUERY-TEST-CASE-TABLES"));

    static private final SubLList $list_alt228 = list(list(NIL, list(list($DATE, makeKeyword("ANYTHING"), makeKeyword("ANSWER-COUNT"), ONE_INTEGER, makeKeyword("PROBLEM-STORE-FILE"), makeKeyword("ANYTHING")))));

    static private final SubLList $list_alt230 = list(reader_make_constant_shell("TestQueryFn"), reader_make_constant_shell("CST-WhatIsNegativeThreePlusFive"));

    static private final SubLString $str_alt231$Couldn_t_find_valid_test_query__S = makeString("Couldn't find valid test query ~S");

    static private final SubLString $str_alt233$___D_existing_results___S___D_new = makeString("~&~D existing results: ~S~%~D new results: ~S~%");

    static private final SubLString $str_alt234$Timed_out_after__S_seconds_during = makeString("Timed out after ~S seconds during START-DAEMON-AND-SCHEDULE-QUERY-ONCE.");

    static private final SubLString $str_alt235$__Finished_START_DAEMON_AND_SCHED = makeString("~&Finished START-DAEMON-AND-SCHEDULE-QUERY-ONCE in ~S seconds~%");

    static private final SubLString $str_alt236$Timed_out_after__S_seconds_during = makeString("Timed out after ~S seconds during SCHEDULE-QUERY-ONCE-AND-START-DAEMON");

    static private final SubLString $str_alt237$__Finished_SCHEDULE_QUERY_ONCE_AN = makeString("~&Finished SCHEDULE-QUERY-ONCE-AND-START-DAEMON in ~S seconds~%");
}

