/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.project.ccf;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.pairlis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.cae_query_search;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.http_kernel;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mail_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.scheduled_queries;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CCF-REPORTS-BY-COLUMN
 *  source file: /cyc/top/cycl/project/ccf/ccf-reports-by-column.lisp
 *  created:     2019/07/03 17:39:00
 */
public final class ccf_reports_by_column extends SubLTranslatedFile implements V02 {
    // // Constructor
    private ccf_reports_by_column() {
    }

    public static final SubLFile me = new ccf_reports_by_column();

    public static final String myName = "com.cyc.cycjava.cycl.project.ccf.ccf_reports_by_column";

    // // Definitions
    public static final SubLObject with_text_file_or_backup_stream(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream_var = NIL;
                    SubLObject filename = NIL;
                    SubLObject backup_stream = NIL;
                    SubLObject direction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    stream_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    backup_stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    direction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, filename, listS(WITH_TEXT_FILE, list(stream_var, filename, direction), append(body, NIL)), listS(CLET, list(list(stream_var, backup_stream)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Schedule a report based on KS to be run on DATE.
     *
     * @see ADD-SINGLE-QUERY-SCHEDULE and REPORT-BY-COLUMN-HASHTABLE-RESULTS regarding function arguments.
     */
    public static final SubLObject schedule_report(SubLObject ks, SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task, SubLObject delimiter, SubLObject selection_sentence, SubLObject range_spec, SubLObject clobber_multiple_valuesP, SubLObject placeholder) {
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
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (selection_sentence == UNPROVIDED) {
            selection_sentence = $sts_selection_sentence$.getGlobalValue();
        }
        if (range_spec == UNPROVIDED) {
            range_spec = $list_alt5;
        }
        if (clobber_multiple_valuesP == UNPROVIDED) {
            clobber_multiple_valuesP = NIL;
        }
        if (placeholder == UNPROVIDED) {
            placeholder = $str_alt6$;
        }
        {
            SubLObject query = a_possibly_open_query_from_ks(ks, UNPROVIDED);
            SubLObject scheduled_event = scheduled_queries.make_single_query_schedule_assertions(query, date, email_recipients, email_carbon_copies, cyclist, task);
            SubLObject report_spec = add_report_specification_to_scheduled_query(scheduled_event, ks, cyclist, task, delimiter, selection_sentence, range_spec, clobber_multiple_valuesP, placeholder);
            if (NIL != report_spec) {
                scheduled_queries.note_query_scheduling_complete(scheduled_event);
            }
            return report_spec;
        }
    }

    /**
     * Schedule a report based on KS to be run once every INTERVAL-TYPE.
     *
     * @see ADD-RECURRING-QUERY-SCHEDULE and REPORT-BY-COLUMN-HASHTABLE-RESULTS regarding function arguments.
     */
    public static final SubLObject schedule_recurring_report(SubLObject ks, SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task, SubLObject delimiter, SubLObject selection_sentence, SubLObject range_spec, SubLObject clobber_multiple_valuesP, SubLObject placeholder) {
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
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (selection_sentence == UNPROVIDED) {
            selection_sentence = $sts_selection_sentence$.getGlobalValue();
        }
        if (range_spec == UNPROVIDED) {
            range_spec = $list_alt5;
        }
        if (clobber_multiple_valuesP == UNPROVIDED) {
            clobber_multiple_valuesP = NIL;
        }
        if (placeholder == UNPROVIDED) {
            placeholder = $str_alt6$;
        }
        {
            SubLObject query = a_possibly_open_query_from_ks(ks, UNPROVIDED);
            SubLObject scheduled_event = scheduled_queries.make_recurring_query_schedule_assertions(query, interval_type, email_recipients, email_carbon_copies, cyclist, task);
            SubLObject report_spec = add_report_specification_to_scheduled_query(scheduled_event, ks, cyclist, task, delimiter, selection_sentence, range_spec, clobber_multiple_valuesP, placeholder);
            if (NIL != report_spec) {
                scheduled_queries.note_query_scheduling_complete(scheduled_event);
            }
            return report_spec;
        }
    }

    public static final SubLObject add_report_specification_to_scheduled_query(SubLObject scheduled_event, SubLObject ks, SubLObject cyclist, SubLObject task, SubLObject delimiter, SubLObject selection_sentence, SubLObject range_spec, SubLObject clobber_multiple_valuesP, SubLObject placeholder) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = get_report_specification_mt(cyclist, task);
                SubLObject report_spec = ke.ke_create_now($str_alt8$ReportGeneratorReportSpecificatio, UNPROVIDED);
                SubLObject failP = sublisp_null(report_spec);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist(cyclist);
                        {
                            SubLObject cdolist_list_var = $list_alt11;
                            SubLObject v_isa = NIL;
                            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                if (NIL == ke.ke_assert_now(list($$isa, report_spec, v_isa), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
                                    failP = T;
                                }
                            }
                        }
                        if (NIL == failP) {
                            {
                                SubLObject csome_list_var = list(list($$definingMt, report_spec, mt), list($$reportSpecificationTemplate, report_spec, ks), list($const14$reportSpecificationClobberMultipl, report_spec, NIL == clobber_multiple_valuesP ? ((SubLObject) ($$False)) : $$True), list($$reportSpecificationPlaceholder, report_spec, placeholder), list($const18$reportSpecificationSelectionSente, report_spec, list($$Quote, selection_sentence)));
                                SubLObject sentence = NIL;
                                for (sentence = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sentence = csome_list_var.first()) {
                                    if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                                        failP = T;
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cycl_delimiter_character = get_cycl_character(delimiter);
                            SubLObject sentence = list($const20$reportSpecificationDelimiterChara, report_spec, NIL != cycl_delimiter_character ? ((SubLObject) (cycl_delimiter_character)) : $$Comma_TheSymbol);
                            if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                                failP = T;
                            }
                        }
                        if (NIL == failP) {
                            {
                                SubLObject csome_list_var = parse_number_range_specifier(range_spec, UNPROVIDED);
                                SubLObject num = NIL;
                                for (num = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , num = csome_list_var.first()) {
                                    if (NIL == ke.ke_assert(list($$reportSpecificationFields, report_spec, number_utilities.f_1X(num)), mt, UNPROVIDED, UNPROVIDED)) {
                                        failP = T;
                                    }
                                }
                            }
                        }
                        if (NIL == failP) {
                            if (NIL == ke.ke_assert_now(list($$scheduledReportSpecification, scheduled_event, report_spec), mt, UNPROVIDED, UNPROVIDED)) {
                                failP = T;
                            }
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != failP ? ((SubLObject) (NIL)) : report_spec;
            }
        }
    }

    public static final SubLObject get_report_specification_mt(SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if ((NIL != cyclist) && (NIL != task)) {
            return hlmt_czer.canonicalize_hlmt(el_utilities.make_binary_formula($$ModelMtByUserAndTaskFn, cyclist, task));
        } else {
            return $$BaseKB;
        }
    }

    public static final SubLObject get_cycl_character(SubLObject subl_char) {
        {
            SubLObject char_string = Strings.make_string(ONE_INTEGER, subl_char);
            SubLObject cycl_character = NIL;
            if (NIL == cycl_character) {
                {
                    SubLObject csome_list_var = $list_alt27;
                    SubLObject pred = NIL;
                    for (pred = csome_list_var.first(); !((NIL != cycl_character) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                        cycl_character = kb_mapping_utilities.fpred_value_in_any_mt(char_string, pred, TWO_INTEGER, ONE_INTEGER, $TRUE);
                    }
                }
            }
            return cycl_character;
        }
    }

    public static final SubLObject reports_directory() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cconcatenate(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), new SubLObject[]{ system_parameters.$cyc_documentation_url$.getDynamicValue(thread), $str_alt28$reports_ });
        }
    }

    /**
     *
     *
     * @return a URL to retrieve the text file FILENAME in the reports directory via this Cyc server
     */
    public static final SubLObject url_to_retrieve_report_file(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject host = misc_utilities.machine_name();
                if (NIL == find(CHAR_period, host, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    host = cconcatenate(host, new SubLObject[]{ $str_alt29$_, mail_utilities.get_tcp_domain_name() });
                }
                return cconcatenate($str_alt30$http___, new SubLObject[]{ host, $str_alt31$_, princ_to_string(http_kernel.http_port()), string_utilities.pre_remove(reports_directory(), system_parameters.$http_htdocs_directory$.getDynamicValue(thread), UNPROVIDED), filename });
            }
        }
    }

    /**
     * Run a report column-by-column style, and output the results to the given :output-filename  as delimited text
     * (e.g. CSV, tab-delimited). File will be overwritten if it already exists. @see report-by-column-hashtable-results
     * for more information
     */
    public static final SubLObject report_by_column_to_file(SubLObject report_props) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject full_report_props = list_utilities.augment_plist_with_defaults(report_props, $default_report_properties$.getGlobalValue());
                SubLObject file_name = get_full_filename_for_report(full_report_props);
                SubLObject maybe_log_file = get_full_logfilename_for_report(full_report_props);
                SubLObject log_stream = list_utilities.plist_lookup(full_report_props, $LOG_STREAM, UNPROVIDED);
                file_utilities.prepare_to_possibly_overwrite_file(file_name, UNPROVIDED);
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(file_name, $OUTPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt35$Unable_to_open__S, file_name);
                        }
                        {
                            SubLObject out_stream = stream;
                            if (NIL != maybe_log_file) {
                                file_utilities.prepare_to_possibly_overwrite_file(maybe_log_file, UNPROVIDED);
                            }
                            if (NIL != maybe_log_file) {
                                {
                                    SubLObject stream_1 = NIL;
                                    try {
                                        stream_1 = compatibility.open_text(maybe_log_file, $OUTPUT, NIL);
                                        if (!stream_1.isStream()) {
                                            Errors.error($str_alt35$Unable_to_open__S, maybe_log_file);
                                        }
                                        {
                                            SubLObject real_log_stream = stream_1;
                                            {
                                                SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
                                                try {
                                                    StreamsLow.$error_output$.bind(real_log_stream, thread);
                                                    StreamsLow.$standard_output$.bind(real_log_stream, thread);
                                                    report_by_column_to_stream(full_report_props, out_stream);
                                                } finally {
                                                    StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
                                                    StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream_1.isStream()) {
                                                    close(stream_1, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject real_log_stream = log_stream;
                                    {
                                        SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
                                        try {
                                            StreamsLow.$error_output$.bind(real_log_stream, thread);
                                            StreamsLow.$standard_output$.bind(real_log_stream, thread);
                                            report_by_column_to_stream(full_report_props, out_stream);
                                        } finally {
                                            StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
                                            StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
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
                }
                return list_utilities.plist_lookup(full_report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
            }
        }
    }

    public static final SubLObject report_by_column_to_stream(SubLObject report_props, SubLObject stream) {
        {
            SubLObject full_report_props = list_utilities.augment_plist_with_defaults(report_props, $default_report_properties$.getGlobalValue());
            SubLObject ks = list_utilities.plist_lookup(full_report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
            SubLObject range_spec = list_utilities.plist_lookup(full_report_props, $COLUMN_RANGE, UNPROVIDED);
            SubLObject delimiter = list_utilities.plist_lookup(full_report_props, $DELIMITER, UNPROVIDED);
            list_utilities.print_list_as_delimited_line(apply_range_specifier_to_sequence(ccf_report_generation.reportgen_schema_field_name_list(ks), range_spec), delimiter, stream);
            terpri(stream);
            print_hashtable_of_vectors_as_delimited_lines(report_by_column_hashtable_results(full_report_props), delimiter, stream);
            return ks;
        }
    }

    public static final SubLObject report_property_p(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_enumerated_types.query_property_p(v_object)) || (NIL != list_utilities.member_eqP(v_object, $report_specific_properties$.getGlobalValue())));
    }

    /**
     * Use the report-props to construct a full absolute pathname for the report output.  It is an error if
     * report-props does not contain enough information to make an absolute pathname.
     */
    public static final SubLObject get_full_filename_for_report(SubLObject report_props) {
        return construct_full_path_from_prop_values(report_props, $OUTPUT_FILENAME, $OUTPUT_DIRECTORY);
    }

    /**
     * Use the report-props to construct a full absolute pathname for the logfile.
     */
    public static final SubLObject get_full_logfilename_for_report(SubLObject report_props) {
        if (NIL == list_utilities.plist_lookup(report_props, $LOG_FILE, UNPROVIDED)) {
            return NIL;
        }
        return construct_full_path_from_prop_values(report_props, $LOG_FILE, $OUTPUT_DIRECTORY);
    }

    /**
     * Look in plist PROPS for the values corresponding to FILE-KEY and DIR-KEY; either the file value should be
     * an absolute pathname, or the file value should be a relative pathname and the dir value an absolute path.
     * Combine the two (if necessary) and return a full absolute path.
     */
    public static final SubLObject construct_full_path_from_prop_values(SubLObject props, SubLObject file_key, SubLObject dir_key) {
        {
            SubLObject filename = list_utilities.plist_lookup(props, file_key, UNPROVIDED);
            SubLObject dirname = list_utilities.plist_lookup(props, dir_key, UNPROVIDED);
            SubLObject result = absolute_path_from_absolute_or_relative(filename, dirname);
            if (NIL != result) {
                return result;
            }
            Errors.error($str_alt43$Cannot_understand_filename__bad__, dir_key, file_key, filename);
        }
        return NIL;
    }

    /**
     * If path is already absolute, just return it.  Otherwise interpret it as relative to directory absolute-dir
     * and return the resulting absolute path.  Return NIL if anything goes wrong.
     */
    public static final SubLObject absolute_path_from_absolute_or_relative(SubLObject path, SubLObject absolute_dir) {
        if (NIL != file_utilities.absolute_pathP(path)) {
            return path;
        }
        if (length(absolute_dir).numE(ZERO_INTEGER) || (NIL == file_utilities.absolute_pathP(absolute_dir))) {
            return NIL;
        }
        return file_utilities.make_path_absolute_relative_to(file_utilities.possibly_append_path_separator_char(absolute_dir), path);
    }

    /**
     * Returns a two-item list, (QUERY-PROPERTIES NON-QUERY-PROPERTIES), where each item is a plist.  As one might
     * expect, the first is a plist of all the report-props which are query properties, and the second is everything
     * left over.
     */
    public static final SubLObject split_report_properties(SubLObject report_props) {
        {
            SubLObject query_props = NIL;
            SubLObject non_query_props = NIL;
            SubLObject remainder = NIL;
            for (remainder = report_props; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject property = remainder.first();
                    SubLObject value = cadr(remainder);
                    if (NIL != inference_datastructures_enumerated_types.query_property_p(property)) {
                        query_props = putf(query_props, property, value);
                    } else {
                        non_query_props = putf(non_query_props, property, value);
                    }
                }
            }
            return list(query_props, non_query_props);
        }
    }

    public static final SubLObject query_properties_from_report_properties(SubLObject report_props) {
        return split_report_properties(report_props).first();
    }

    /**
     * Supplement properties in REPORT-PROPS with the default overriding values for other properties.
     */
    public static final SubLObject merge_in_default_overriding_properties(SubLObject report_props) {
        return list_utilities.merge_plist(get_rgbc_overriding_properties(), report_props);
    }

    // defconstant
    private static final SubLSymbol $rgbc_default_overriding_properties$ = makeSymbol("*RGBC-DEFAULT-OVERRIDING-PROPERTIES*");



    // deflexical
    private static final SubLSymbol $rgbc_overriding_properties_lock$ = makeSymbol("*RGBC-OVERRIDING-PROPERTIES-LOCK*");

    /**
     * Get (a copy of) the global properties used to override query properties for report generator queries.
     */
    public static final SubLObject get_rgbc_overriding_properties() {
        {
            SubLObject props = NIL;
            SubLObject rw_lock_var = $rgbc_overriding_properties_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                props = copy_list($rgbc_locked_overriding_properties$.getGlobalValue());
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return props;
        }
    }

    /**
     * Alter the global properties used to override query properties for report generator queries.  The given properties in PLIST will be
     * merged with the existing global properties (so existing properties that are not mentioned in PLIST will remain unchanged).
     */
    public static final SubLObject add_to_rgbc_overriding_properties(SubLObject plist) {
        {
            SubLObject old_props = get_rgbc_overriding_properties();
            SubLObject new_props = inference_datastructures_enumerated_types.merge_query_properties(old_props, plist);
            if (!old_props.equal(new_props)) {
                {
                    SubLObject rw_lock_var = $rgbc_overriding_properties_lock$.getGlobalValue();
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        $rgbc_locked_overriding_properties$.setGlobalValue(new_props);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                }
            }
            return new_props;
        }
    }

    public static final SubLObject update_rgbc_max_time(SubLObject seconds) {
        return add_to_rgbc_overriding_properties(list($MAX_TIME, seconds));
    }

    public static final SubLObject reset_rgbc_overriding_properties() {
        {
            SubLObject rw_lock_var = $rgbc_overriding_properties_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                $rgbc_locked_overriding_properties$.setGlobalValue($rgbc_default_overriding_properties$.getGlobalValue());
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return $rgbc_default_overriding_properties$.getGlobalValue();
    }

    /**
     * Run a report column-by-column style.  Return the results in the form of a hashtable.  The keys are not guaranteed to have a
     * persistent meaning.  Each hashtable value is a vector of the results for the proper columns, in order.
     *
     * @param REPORT-PROPS:
     * 		a plist of the properties for this report.  Assumes that any defaults have already been
     * 		explicitly specified by caller.
     * @unknown HASH-TABLE-P of resultant rows for the report. The rows are the values; the keys are not guaranteed to have any
    particular useful meaning.  Each 'row' is a VECTORP with exactly the requested number of columns.
     */
    public static final SubLObject report_by_column_hashtable_results(SubLObject report_props) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
                SubLObject range_spec = list_utilities.plist_lookup(report_props, $COLUMN_RANGE, UNPROVIDED);
                SubLObject results_table = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt48$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                                    {
                                        SubLObject _prev_bind_0_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                            {
                                                SubLObject pfs = apply_range_specifier_to_sequence(ccf_report_generation.reportgen_schema_field_list(ks), range_spec);
                                                SubLObject merged_props = merge_in_default_overriding_properties(report_props);
                                                results_table = initialized_report_hashtable(merged_props, pfs);
                                                {
                                                    SubLObject list_var = NIL;
                                                    SubLObject pf = NIL;
                                                    SubLObject n = NIL;
                                                    for (list_var = pfs, pf = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pf = list_var.first() , n = add(ONE_INTEGER, n)) {
                                                        results_table = add_final_column_answers_to_hashtable(results_table, pf, n, merged_props);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return results_table;
            }
        }
    }

    public static final SubLObject print_hashtable_of_vectors_as_delimited_lines(SubLObject hashtable, SubLObject delimiter, SubLObject stream) {
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject key = NIL;
            SubLObject vector = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        vector = getEntryValue(cdohash_entry);
                        vector_utilities.print_vector_as_delimited_line(vector, delimiter, stream);
                        terpri(stream);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return hashtable;
    }

    /**
     * Load and parse a report batch definition file and run the batch job.  See sample-batch-run.ini in the directory of this
     * source file for an example of the format the file uses.
     */
    public static final SubLObject run_batch_reports_from_definition_file(SubLObject filename) {
        {
            SubLObject definition = read_batch_definition_from_file(filename);
            SubLObject global_props = get_global_batch_report_props_from_definition(definition);
            SubLObject report_props_alist = get_batch_properties_for_all_reports_from_definition(definition);
            SubLObject cdolist_list_var = report_props_alist;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject props = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    key = current.first();
                    current = current.rest();
                    props = current;
                    props = list_utilities.merge_plist(global_props, props);
                    report_by_column_to_file(props);
                }
            }
        }
        return filename;
    }

    /**
     * Read a definition file for a batch of reports and return the definition.  The exact format of this definition may
     * change over time; access with get-global-batch-report-props-from-definition and get-batch-properties-for-all-reports-from-definition.
     */
    public static final SubLObject read_batch_definition_from_file(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject definition = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt35$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject in_stream = stream;
                        definition = read_ignoring_errors(in_stream, UNPROVIDED, UNPROVIDED);
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
                return definition;
            }
        }
    }

    /**
     * Return plist of global report properties from the definition.  Also @see read-batch-definition-from-file
     */
    public static final SubLObject get_global_batch_report_props_from_definition(SubLObject definition) {
        return list_utilities.plist_lookup(definition, $GLOBAL, UNPROVIDED);
    }

    /**
     * Return an alist where each key is a string identifier and the corresponding value is the plist of report properties
     * specific to that report.
     */
    public static final SubLObject get_batch_properties_for_all_reports_from_definition(SubLObject definition) {
        {
            SubLObject just_reports = remf(copy_list(definition), $GLOBAL);
            SubLObject report_identifiers = Mapping.mapcar(SYMBOL_NAME, list_utilities.plist_keys(just_reports));
            SubLObject report_values = list_utilities.plist_values(just_reports);
            return pairlis(report_identifiers, report_values, UNPROVIDED);
        }
    }

    /**
     * The RANGE-SPEC denotes a set of non-negative integers, which are interpreted as positions.  Return a new sequence, of
     * the same type as SEQ, which has as its elements precisely the elements found at these postitions in SEQ
     */
    public static final SubLObject apply_range_specifier_to_sequence(SubLObject seq, SubLObject range_spec) {
        return list_utilities.sequence_elements(seq, parse_number_range_specifier(range_spec, number_utilities.f_1_(length(seq))));
    }

    /**
     * Given a specifier for a list of numbers, return the list of numbers.  Every element of the specifier is either a nonnegative
     * integer or a list of two nonnegative integers, the first smaller than the second.  A single number just 'expands' to itself;
     * a list of two numbers 'expands' to all the numbers between the first and the last.  If LAST is given then anywhere NIL is
     * given instead of a number in the spec it will be interpreted as the number LAST.
     * E.g.  (parse-number-range-specifier '(1 3 (4 7) (10 13) (17 NIL)) 19) returns (1 3 4 5 6 7 10 11 12 13 17 18 19)
     */
    public static final SubLObject parse_number_range_specifier(SubLObject spec, SubLObject last) {
        if (last == UNPROVIDED) {
            last = NIL;
        }
        if (NIL != last) {
            spec = list_utilities.tree_substitute(spec, NIL, last);
        }
        {
            SubLObject list_var = spec;
            SubLSystemTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLSystemTrampolineFile.checkType(elem, RANGE_SPECIFIER_ITEM_P);
                }
            }
        }
        return Mapping.mapcan(symbol_function(EXPAND_RANGE_SPECIFIER_ITEM), spec, EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static final SubLObject range_specifier_item_p(SubLObject item) {
        if (NIL != subl_promotions.non_negative_integer_p(item)) {
            return T;
        } else
            if (NIL != list_utilities.doubletonP(item)) {
                {
                    SubLObject start = item.first();
                    SubLObject end = second(item);
                    return makeBoolean(((NIL != subl_promotions.non_negative_integer_p(start)) && (NIL != subl_promotions.non_negative_integer_p(end))) && end.numGE(start));
                }
            } else {
                return NIL;
            }

    }

    /**
     * Expand a single specifier item.  E.g.
     * (expand-range-specifier-item 5) => (5)
     * (expand-range-specifier-item '(4 7)) => (4 5 6 7)
     */
    public static final SubLObject expand_range_specifier_item(SubLObject item) {
        SubLSystemTrampolineFile.checkType(item, RANGE_SPECIFIER_ITEM_P);
        if (item.isAtom()) {
            return list(item);
        } else {
            {
                SubLObject start = item.first();
                SubLObject end = second(item);
                return list_utilities.new_num_list(number_utilities.f_1X(subtract(end, start)), start);
            }
        }
    }

    public static final SubLObject gafs_from_ks_internal(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gafs = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = ccf_report_generation.reportgen_schema_field_list(ks);
                            SubLObject pf = NIL;
                            for (pf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pf = cdolist_list_var.first()) {
                                gafs = cons(binding_gaf_from_pf(pf, ks), gafs);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return gafs;
            }
        }
    }

    public static final SubLObject gafs_from_ks(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return gafs_from_ks_internal(ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GAFS_FROM_KS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GAFS_FROM_KS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GAFS_FROM_KS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, ks, $kw58$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw58$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(gafs_from_ks_internal(ks)));
                        memoization_state.caching_state_put(caching_state, ks, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    // defconstant
    private static final SubLSymbol $rgbc_initial_value_for_pfs$ = makeSymbol("*RGBC-INITIAL-VALUE-FOR-PFS*");

    public static final SubLObject initialized_report_hashtable(SubLObject report_props, SubLObject physical_fields) {
        if (physical_fields == UNPROVIDED) {
            physical_fields = NIL;
        }
        {
            SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
            if (NIL == physical_fields) {
                physical_fields = ccf_report_generation.reportgen_schema_field_list(ks);
            }
            {
                SubLObject hashtable = hash_table_utilities.hash_list_elements(all_selected_entities(report_props), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                SubLObject key = NIL;
                SubLObject value = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            sethash(key, hashtable, make_vector(length(physical_fields), $rgbc_initial_value_for_pfs$.getGlobalValue()));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return hashtable;
            }
        }
    }

    /**
     * Store the physical values for COLUMN-NUM of PF in HASHTABLE.
     */
    public static final SubLObject add_final_column_answers_to_hashtable(SubLObject hashtable, SubLObject pf, SubLObject column_num, SubLObject report_props) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
                SubLObject bind_gaf = NIL;
                {
                    SubLObject message_var = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    bind_gaf = binding_gaf_from_pf(pf, ks);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (message_var.isString()) {
                        Errors.warn($str_alt60$_A, message_var);
                    }
                }
                if (NIL == bind_gaf) {
                    return hashtable;
                }
                {
                    SubLObject message_var = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject closed_queryP = ccf_report_generation.binding_gaf_for_closed_queryP(bind_gaf);
                                        SubLObject logical_true = ccf_report_generation.convert_to_boolean_kb_constant(T);
                                        SubLObject raw_answer_dictionary = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                                        SubLObject cdolist_list_var = run_modified_query_for_answer_list(report_props, bind_gaf);
                                        SubLObject v_answer = NIL;
                                        for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject key = unpack_column_answer(v_answer, closed_queryP, logical_true);
                                                SubLObject value = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                dictionary_utilities.dictionary_pushnew(raw_answer_dictionary, key, value, symbol_function(EQUALP), UNPROVIDED);
                                            }
                                        }
                                        {
                                            SubLObject any_multiplesP = store_encoded_answers(raw_answer_dictionary, hashtable, pf, column_num, report_props);
                                            if (NIL != any_multiplesP) {
                                                warn_about_multiple_values(bind_gaf);
                                            }
                                        }
                                        hashtable = fill_in_default_values_for_report_column(hashtable, pf, column_num, bind_gaf, report_props);
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (message_var.isString()) {
                        Errors.warn($str_alt60$_A, message_var);
                    }
                }
            }
            return hashtable;
        }
    }

    /**
     * Encode answers from RAW-ANSWER-DICTIONARY and store them in HASHTABLE.
     *
     * @param RAW-ANSWER-DICTIONARY;
     * 		map from row keys to lists of logical answers for COLUMN-NUM for that row.
     */
    public static final SubLObject store_encoded_answers(SubLObject raw_answer_dictionary, SubLObject hashtable, SubLObject pf, SubLObject column_num, SubLObject report_props) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
                SubLObject clobber_multiple_valuesP = list_utilities.plist_lookup(report_props, $kw61$CLOBBER_MULTIPLE_VALUES_, UNPROVIDED);
                SubLObject any_multiplesP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject encoding_expression = ccf_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
                    SubLObject collect_multiple_valuesP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(raw_answer_dictionary));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject logical_values = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject curr_vector = gethash(key, hashtable, UNPROVIDED);
                                    SubLObject physical_value = encode_logical_answer(logical_values, clobber_multiple_valuesP, collect_multiple_valuesP, pf, ks, encoding_expression);
                                    set_aref(curr_vector, column_num, physical_value);
                                }
                                if ((NIL == clobber_multiple_valuesP) && (NIL != list_utilities.lengthG(logical_values, ONE_INTEGER, UNPROVIDED))) {
                                    any_multiplesP = T;
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return any_multiplesP;
            }
        }
    }

    /**
     * Transform LOGICAL-VALUES into a single physical value.
     */
    public static final SubLObject encode_logical_answer(SubLObject logical_values, SubLObject clobber_multiple_valuesP, SubLObject collect_multiple_valuesP, SubLObject pf, SubLObject ks, SubLObject encoding_expression) {
        if (NIL != collect_multiple_valuesP) {
            {
                SubLObject logical_value = el_utilities.make_el_formula($$TheSet, logical_values, UNPROVIDED);
                SubLObject physical_value = apply_encoding_for_pf(pf, logical_value, ks, encoding_expression);
                return physical_value;
            }
        } else
            if ((NIL != clobber_multiple_valuesP) && (NIL != list_utilities.lengthG(logical_values, ONE_INTEGER, UNPROVIDED))) {
                return $MULTIPLE_ANSWERS;
            } else {
                {
                    SubLObject logical_value = logical_values.first();
                    SubLObject physical_value = apply_encoding_for_pf(pf, logical_value, ks, UNPROVIDED);
                    return physical_value;
                }
            }

    }

    public static final SubLObject unpack_column_answer(SubLObject v_answer, SubLObject closed_queryP, SubLObject logical_true) {
        if (NIL != closed_queryP) {
            return values(v_answer, logical_true);
        } else {
            return values(v_answer.first(), v_answer.rest());
        }
    }

    public static final SubLObject warn_about_multiple_values(SubLObject bind_gaf) {
        {
            SubLObject datum = cycl_utilities.formula_args(bind_gaf, UNPROVIDED);
            SubLObject current = datum;
            SubLObject base_query = NIL;
            SubLObject get_thing_argpos = NIL;
            SubLObject final_query = NIL;
            SubLObject entity_argpos = NIL;
            SubLObject lfi = NIL;
            SubLObject final_answer_argpos = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt64);
            base_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            get_thing_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            final_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            entity_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            lfi = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            final_answer_argpos = current.first();
            current = current.rest();
            if (NIL == current) {
                Errors.warn($str_alt65$Some_rows_unexpectedly_returned_m, final_query, lfi, kb_query.kbq_sentence(final_query));
            } else {
                cdestructuring_bind_error(datum, $list_alt64);
            }
        }
        return NIL;
    }

    public static final SubLObject apply_encoding_for_pf_internal(SubLObject pf, SubLObject logical_value, SubLObject ks, SubLObject expr) {
        if (expr == UNPROVIDED) {
            expr = ccf_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        }
        {
            SubLObject lfi = ccf_report_generation.encoding_logical_field_indexical(expr);
            return my_sksi_apply_encoding_and_reformulate(list(bq_cons(lfi, logical_value)), expr, ks);
        }
    }

    public static final SubLObject apply_encoding_for_pf(SubLObject pf, SubLObject logical_value, SubLObject ks, SubLObject expr) {
        if (expr == UNPROVIDED) {
            expr = ccf_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return apply_encoding_for_pf_internal(pf, logical_value, ks, expr);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, APPLY_ENCODING_FOR_PF, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), APPLY_ENCODING_FOR_PF, FOUR_INTEGER, NIL, EQUALP, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, APPLY_ENCODING_FOR_PF, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(pf, logical_value, ks, expr);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw58$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pf.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (logical_value.equalp(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (ks.equalp(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && expr.equalp(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(apply_encoding_for_pf_internal(pf, logical_value, ks, expr)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pf, logical_value, ks, expr));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject my_sksi_apply_encoding_and_reformulate(SubLObject alist, SubLObject encoding, SubLObject sks) {
        {
            SubLObject result = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(alist, encoding, sks, UNPROVIDED);
            return result;
        }
    }

    public static final SubLObject rgbc_compute_modified_query_properties(SubLObject query_spec, SubLObject report_props) {
        {
            SubLObject new_properties = list_utilities.merge_plist(kb_query.kbq_query_properties(query_spec), query_properties_from_report_properties(report_props));
            return new_properties;
        }
    }

    public static final SubLObject run_modified_query_for_answer_list(SubLObject report_props, SubLObject bind_gaf) {
        {
            SubLObject datum = cycl_utilities.formula_args(bind_gaf, UNPROVIDED);
            SubLObject current = datum;
            SubLObject base_query = NIL;
            SubLObject get_thing_argpos = NIL;
            SubLObject query_spec = NIL;
            SubLObject entity_argpos = NIL;
            SubLObject lfi = NIL;
            SubLObject final_answer_argpos = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            base_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt67);
            get_thing_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt67);
            query_spec = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt67);
            entity_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt67);
            lfi = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt67);
            final_answer_argpos = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject selection_sentence = list_utilities.plist_lookup(report_props, $SELECTION_SENTENCE, UNPROVIDED);
                    SubLObject datum_4 = create_modified_query_sentence(selection_sentence, query_spec, entity_argpos);
                    SubLObject current_5 = datum_4;
                    SubLObject new_entity_var = NIL;
                    SubLObject new_sentence = NIL;
                    destructuring_bind_must_consp(current_5, datum_4, $list_alt69);
                    new_entity_var = current_5.first();
                    current_5 = current_5.rest();
                    destructuring_bind_must_consp(current_5, datum_4, $list_alt69);
                    new_sentence = current_5.first();
                    current_5 = current_5.rest();
                    if (NIL == current_5) {
                        {
                            SubLObject template = (NIL != ccf_report_generation.binding_gaf_for_closed_queryP(bind_gaf)) ? ((SubLObject) (new_entity_var)) : bq_cons(new_entity_var, cycl_utilities.formula_cycl_arg_position(kb_query.kbq_sentence(query_spec), final_answer_argpos, UNPROVIDED));
                            return my_rgbc_query_template(template, new_sentence, kb_query.kbq_mt(query_spec), rgbc_compute_modified_query_properties(query_spec, report_props), query_spec, lfi);
                        }
                    } else {
                        cdestructuring_bind_error(datum_4, $list_alt69);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt67);
            }
        }
        return NIL;
    }

    public static final SubLObject my_rgbc_query_template(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject props, SubLObject query_spec, SubLObject lfi) {
        if (query_spec == UNPROVIDED) {
            query_spec = NIL;
        }
        if (lfi == UNPROVIDED) {
            lfi = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results = ask_utilities.query_template(template, sentence, mt, props);
                SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL == results) || (halt_reason != $EXHAUST_TOTAL)) {
                    Errors.warn($str_alt71$Query_halted_unusually_with__D_re, new SubLObject[]{ length(results), halt_reason, query_spec, lfi, sentence, mt, props });
                }
                return values(results, halt_reason);
            }
        }
    }

    /**
     * Use the query sentence with associated entity arg-position and combine it with the selection-sentence to make a suitable query
     * sentence for getting all relevant answers at once.
     *
     * @return LISTP first item is the free variable corresponding to the entity in the modified query sentence; second item is
    the sentence itself.
     */
    public static final SubLObject create_modified_query_sentence(SubLObject selection_sentence, SubLObject query_spec, SubLObject entity_argpos) {
        {
            SubLObject original_sentence = kb_query.kbq_sentence(query_spec);
            SubLObject free_var_from_selection_sentence = el_utilities.sentence_free_variables(selection_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            SubLObject free_var_from_query_sentence = cycl_utilities.formula_cycl_arg_position(original_sentence, entity_argpos, UNPROVIDED);
            SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(selection_sentence, original_sentence), UNPROVIDED);
            return list(new_var, list($$and, cycl_utilities.expression_subst(new_var, free_var_from_selection_sentence, selection_sentence, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_subst(new_var, free_var_from_query_sentence, original_sentence, UNPROVIDED, UNPROVIDED)));
        }
    }

    /**
     * After running the query in gaf and entering the results in the hashtable, fill in the default value in the nth column answer
     * field in hashtable, for any row that does not already have another value. If gaf is NIL use placeholder as default answer.
     *
     * @return hashtable
     */
    public static final SubLObject fill_in_default_values_for_report_column(SubLObject hashtable, SubLObject pf, SubLObject n, SubLObject gaf, SubLObject report_props) {
        {
            SubLObject default_answer = rgbc_default_value_for_pf(pf, gaf, report_props);
            SubLObject key = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        if (aref(value, n).equal($rgbc_initial_value_for_pfs$.getGlobalValue())) {
                            set_aref(value, n, default_answer);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return hashtable;
        }
    }

    /**
     * Return the default value for the physical field pf in report specified by report-props, possibly appealing to the
     * #$bindingInPositionFromUsedInPositionInFor GAF gaf.  Return the placeholder for the report if no other
     * value for the physical field can be determined.
     */
    public static final SubLObject rgbc_default_value_for_pf(SubLObject pf, SubLObject gaf, SubLObject report_props) {
        {
            SubLObject ps = sksi_kb_accessors.physical_field_schema(pf);
            if (NIL == sksi_kb_accessors.null_default_physical_field_valueP(pf, ps)) {
                return sksi_kb_accessors.physical_field_default_value(pf, ps, UNPROVIDED);
            } else
                if ((NIL != gaf) && (NIL != ccf_report_generation.binding_gaf_for_closed_queryP(gaf))) {
                    return apply_encoding_for_pf(pf, ccf_report_generation.convert_to_boolean_kb_constant(NIL), list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED), UNPROVIDED);
                } else {
                    return list_utilities.plist_lookup(report_props, $PLACEHOLDER, UNPROVIDED);
                }

        }
    }

    public static final SubLObject test_default_value_for_pf(SubLObject pf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ks = sksi_kb_accessors.physical_schema_sk_sources(sksi_kb_accessors.physical_field_schema(pf)).first();
                SubLObject value = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        value = rgbc_default_value_for_pf(pf, binding_gaf_from_pf(pf, ks), list($REPORT_KNOWLEDGE_SOURCE, ks, $PLACEHOLDER, $str_alt29$_));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return value;
            }
        }
    }

    public static final SubLObject sentence_with_one_free_var_p(SubLObject obj) {
        return list_utilities.exactly_one_distinct_memberP(el_utilities.sentence_free_variables(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    // defvar
    private static final SubLSymbol $all_selected_entities_time_multiplier$ = makeSymbol("*ALL-SELECTED-ENTITIES-TIME-MULTIPLIER*");

    /**
     * Use the selection sentence from report-props to get all entities of interest.
     *
     * @unknown LISTP of desired entities, as returned by query-template.
     */
    public static final SubLObject all_selected_entities(SubLObject report_props) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
                SubLObject selection_sentence = list_utilities.plist_lookup(report_props, $SELECTION_SENTENCE, UNPROVIDED);
                SubLObject some_query = a_possibly_open_query_from_ks(ks, UNPROVIDED);
                SubLObject query_properties = rgbc_compute_modified_query_properties(some_query, report_props);
                SubLObject current_max_time = inference_datastructures_enumerated_types.inference_properties_max_time(query_properties);
                if (NIL != current_max_time) {
                    query_properties = putf(query_properties, $MAX_TIME, multiply($all_selected_entities_time_multiplier$.getDynamicValue(thread), current_max_time));
                }
                return my_rgbc_query_template(el_utilities.sentence_free_variables(selection_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED).first(), selection_sentence, kb_query.kbq_mt(some_query), query_properties, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Just get one query which is open (i.e. has a free variable) associated with this report.  If there is no such query
     * possibly return a closed query.
     *
     * @param KS;
     * 		The SKSI knowledge source that represents the report.
     * @param OPEN-REQUIRED?;
     * 		If true, fail if there is no open query available.
     * @unknown a #$CycLQuerySpecification for some such query.
     * @unknown This query here below should be factored into pieces and perhaps the pieces used elsewhere
    in the report generator code.
     */
    public static final SubLObject a_possibly_open_query_from_ks(SubLObject ks, SubLObject open_requiredP) {
        if (open_requiredP == UNPROVIDED) {
            open_requiredP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject find_query_sentence = listS($$and, list($$logicalSchemaSourceMap, $sym75$_LS, ks), $list_alt76);
                SubLObject results = ask_utilities.query_variable($sym77$_QUERY, listS($$and, find_query_sentence, $list_alt78), sksi_kb_accessors.sk_source_mapping_mt(ks), $list_alt79);
                if ((NIL == results) && (NIL == open_requiredP)) {
                    results = ask_utilities.query_variable($sym77$_QUERY, find_query_sentence, sksi_kb_accessors.sk_source_mapping_mt(ks), $list_alt79);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == results) {
                        Errors.error($str_alt80$Can_t_find_any_useful_queries_ass, ks);
                    }
                }
                return results.first();
            }
        }
    }

    /**
     * Given a pf and a report ks, just get the one lfi that goes with the pf  This calls functions that will error
     * out if there is not just one result.
     */
    public static final SubLObject reportgen_lfi_from_pf(SubLObject pf, SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject enc_expr = NIL;
                SubLObject lfi = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        enc_expr = ccf_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
                        lfi = ccf_report_generation.encoding_logical_field_indexical(enc_expr);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return lfi;
            }
        }
    }

    /**
     * Given a pf and a report ks, just get the one binding gaf that goes with the pf  This calls functions that will error
     * out if there is not just one result.
     */
    public static final SubLObject binding_gaf_from_pf(SubLObject pf, SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lfi = NIL;
                SubLObject bgaf = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        lfi = reportgen_lfi_from_pf(pf, ks);
                        bgaf = ccf_report_generation.binding_position_gaf_from_logical_indexical(lfi);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return bgaf;
            }
        }
    }

    /**
     * Properties that a run of a report may have which are not inherited from query-properties (see ALL-QUERY-PROPERTIES).
     */
    // deflexical
    private static final SubLSymbol $report_specific_properties$ = makeSymbol("*REPORT-SPECIFIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $default_report_properties$ = makeSymbol("*DEFAULT-REPORT-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $sts_selection_sentence$ = makeSymbol("*STS-SELECTION-SENTENCE*");

    public static final SubLObject declare_ccf_reports_by_column_file() {
        declareMacro("with_text_file_or_backup_stream", "WITH-TEXT-FILE-OR-BACKUP-STREAM");
        declareFunction("schedule_report", "SCHEDULE-REPORT", 2, 9, false);
        declareFunction("schedule_recurring_report", "SCHEDULE-RECURRING-REPORT", 2, 9, false);
        declareFunction("add_report_specification_to_scheduled_query", "ADD-REPORT-SPECIFICATION-TO-SCHEDULED-QUERY", 9, 0, false);
        declareFunction("get_report_specification_mt", "GET-REPORT-SPECIFICATION-MT", 0, 2, false);
        declareFunction("get_cycl_character", "GET-CYCL-CHARACTER", 1, 0, false);
        declareFunction("reports_directory", "REPORTS-DIRECTORY", 0, 0, false);
        declareFunction("url_to_retrieve_report_file", "URL-TO-RETRIEVE-REPORT-FILE", 1, 0, false);
        declareFunction("report_by_column_to_file", "REPORT-BY-COLUMN-TO-FILE", 1, 0, false);
        declareFunction("report_by_column_to_stream", "REPORT-BY-COLUMN-TO-STREAM", 2, 0, false);
        declareFunction("report_property_p", "REPORT-PROPERTY-P", 1, 0, false);
        declareFunction("get_full_filename_for_report", "GET-FULL-FILENAME-FOR-REPORT", 1, 0, false);
        declareFunction("get_full_logfilename_for_report", "GET-FULL-LOGFILENAME-FOR-REPORT", 1, 0, false);
        declareFunction("construct_full_path_from_prop_values", "CONSTRUCT-FULL-PATH-FROM-PROP-VALUES", 3, 0, false);
        declareFunction("absolute_path_from_absolute_or_relative", "ABSOLUTE-PATH-FROM-ABSOLUTE-OR-RELATIVE", 2, 0, false);
        declareFunction("split_report_properties", "SPLIT-REPORT-PROPERTIES", 1, 0, false);
        declareFunction("query_properties_from_report_properties", "QUERY-PROPERTIES-FROM-REPORT-PROPERTIES", 1, 0, false);
        declareFunction("merge_in_default_overriding_properties", "MERGE-IN-DEFAULT-OVERRIDING-PROPERTIES", 1, 0, false);
        declareFunction("get_rgbc_overriding_properties", "GET-RGBC-OVERRIDING-PROPERTIES", 0, 0, false);
        declareFunction("add_to_rgbc_overriding_properties", "ADD-TO-RGBC-OVERRIDING-PROPERTIES", 1, 0, false);
        declareFunction("update_rgbc_max_time", "UPDATE-RGBC-MAX-TIME", 1, 0, false);
        declareFunction("reset_rgbc_overriding_properties", "RESET-RGBC-OVERRIDING-PROPERTIES", 0, 0, false);
        declareFunction("report_by_column_hashtable_results", "REPORT-BY-COLUMN-HASHTABLE-RESULTS", 1, 0, false);
        declareFunction("print_hashtable_of_vectors_as_delimited_lines", "PRINT-HASHTABLE-OF-VECTORS-AS-DELIMITED-LINES", 1, 2, false);
        declareFunction("run_batch_reports_from_definition_file", "RUN-BATCH-REPORTS-FROM-DEFINITION-FILE", 1, 0, false);
        declareFunction("read_batch_definition_from_file", "READ-BATCH-DEFINITION-FROM-FILE", 1, 0, false);
        declareFunction("get_global_batch_report_props_from_definition", "GET-GLOBAL-BATCH-REPORT-PROPS-FROM-DEFINITION", 1, 0, false);
        declareFunction("get_batch_properties_for_all_reports_from_definition", "GET-BATCH-PROPERTIES-FOR-ALL-REPORTS-FROM-DEFINITION", 1, 0, false);
        declareFunction("apply_range_specifier_to_sequence", "APPLY-RANGE-SPECIFIER-TO-SEQUENCE", 2, 0, false);
        declareFunction("parse_number_range_specifier", "PARSE-NUMBER-RANGE-SPECIFIER", 1, 1, false);
        declareFunction("range_specifier_item_p", "RANGE-SPECIFIER-ITEM-P", 1, 0, false);
        declareFunction("expand_range_specifier_item", "EXPAND-RANGE-SPECIFIER-ITEM", 1, 0, false);
        declareFunction("gafs_from_ks_internal", "GAFS-FROM-KS-INTERNAL", 1, 0, false);
        declareFunction("gafs_from_ks", "GAFS-FROM-KS", 1, 0, false);
        declareFunction("initialized_report_hashtable", "INITIALIZED-REPORT-HASHTABLE", 1, 1, false);
        declareFunction("add_final_column_answers_to_hashtable", "ADD-FINAL-COLUMN-ANSWERS-TO-HASHTABLE", 4, 0, false);
        declareFunction("store_encoded_answers", "STORE-ENCODED-ANSWERS", 5, 0, false);
        declareFunction("encode_logical_answer", "ENCODE-LOGICAL-ANSWER", 6, 0, false);
        declareFunction("unpack_column_answer", "UNPACK-COLUMN-ANSWER", 3, 0, false);
        declareFunction("warn_about_multiple_values", "WARN-ABOUT-MULTIPLE-VALUES", 1, 0, false);
        declareFunction("apply_encoding_for_pf_internal", "APPLY-ENCODING-FOR-PF-INTERNAL", 3, 1, false);
        declareFunction("apply_encoding_for_pf", "APPLY-ENCODING-FOR-PF", 3, 1, false);
        declareFunction("my_sksi_apply_encoding_and_reformulate", "MY-SKSI-APPLY-ENCODING-AND-REFORMULATE", 3, 0, false);
        declareFunction("rgbc_compute_modified_query_properties", "RGBC-COMPUTE-MODIFIED-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("run_modified_query_for_answer_list", "RUN-MODIFIED-QUERY-FOR-ANSWER-LIST", 2, 0, false);
        declareFunction("my_rgbc_query_template", "MY-RGBC-QUERY-TEMPLATE", 4, 2, false);
        declareFunction("create_modified_query_sentence", "CREATE-MODIFIED-QUERY-SENTENCE", 3, 0, false);
        declareFunction("fill_in_default_values_for_report_column", "FILL-IN-DEFAULT-VALUES-FOR-REPORT-COLUMN", 5, 0, false);
        declareFunction("rgbc_default_value_for_pf", "RGBC-DEFAULT-VALUE-FOR-PF", 3, 0, false);
        declareFunction("test_default_value_for_pf", "TEST-DEFAULT-VALUE-FOR-PF", 1, 0, false);
        declareFunction("sentence_with_one_free_var_p", "SENTENCE-WITH-ONE-FREE-VAR-P", 1, 0, false);
        declareFunction("all_selected_entities", "ALL-SELECTED-ENTITIES", 1, 0, false);
        declareFunction("a_possibly_open_query_from_ks", "A-POSSIBLY-OPEN-QUERY-FROM-KS", 1, 1, false);
        declareFunction("reportgen_lfi_from_pf", "REPORTGEN-LFI-FROM-PF", 2, 0, false);
        declareFunction("binding_gaf_from_pf", "BINDING-GAF-FROM-PF", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_ccf_reports_by_column_file() {
        defconstant("*RGBC-DEFAULT-OVERRIDING-PROPERTIES*", $list_alt44);
        deflexical("*RGBC-LOCKED-OVERRIDING-PROPERTIES*", NIL != boundp($rgbc_locked_overriding_properties$) ? ((SubLObject) ($rgbc_locked_overriding_properties$.getGlobalValue())) : $rgbc_default_overriding_properties$.getGlobalValue());
        deflexical("*RGBC-OVERRIDING-PROPERTIES-LOCK*", ReadWriteLocks.new_rw_lock($$$RGBC_OVERRIDING_PROPERTIES));
        defconstant("*RGBC-INITIAL-VALUE-FOR-PFS*", NIL);
        defvar("*ALL-SELECTED-ENTITIES-TIME-MULTIPLIER*", THREE_INTEGER);
        deflexical("*REPORT-SPECIFIC-PROPERTIES*", $list_alt81);
        deflexical("*DEFAULT-REPORT-PROPERTIES*", list(new SubLObject[]{ $DELIMITER, CHAR_comma, $SELECTION_SENTENCE, $list_alt82, $COLUMN_RANGE, $list_alt5, $PLACEHOLDER, $str_alt6$, $kw61$CLOBBER_MULTIPLE_VALUES_, NIL, $LOG_STREAM, StreamsLow.$standard_output$.getDynamicValue() }));
        deflexical("*STS-SELECTION-SENTENCE*", list_utilities.plist_lookup($default_report_properties$.getGlobalValue(), $SELECTION_SENTENCE, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_ccf_reports_by_column_file() {
                access_macros.register_external_symbol(SCHEDULE_REPORT);
        access_macros.register_external_symbol(SCHEDULE_RECURRING_REPORT);
        access_macros.register_external_symbol(REPORT_BY_COLUMN_TO_FILE);
        access_macros.register_external_symbol(REPORT_BY_COLUMN_TO_STREAM);
        subl_macro_promotions.declare_defglobal($rgbc_locked_overriding_properties$);
        access_macros.register_external_symbol(RUN_BATCH_REPORTS_FROM_DEFINITION_FILE);
        memoization_state.note_memoized_function(GAFS_FROM_KS);
        memoization_state.note_memoized_function(APPLY_ENCODING_FOR_PF);
        generic_testing.define_test_case_table_int(APPLY_RANGE_SPECIFIER_TO_SEQUENCE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$sbrown, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt91);
        generic_testing.define_test_case_table_int(ABSOLUTE_PATH_FROM_ABSOLUTE_OR_RELATIVE, list(new SubLObject[]{ $TEST, symbol_function(EQUALP), $OWNER, $$$sbrown, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt93);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("FILENAME"), makeSymbol("BACKUP-STREAM"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));







    private static final SubLSymbol SCHEDULE_REPORT = makeSymbol("SCHEDULE-REPORT");

    static private final SubLList $list_alt5 = list(list(ZERO_INTEGER, NIL));

    static private final SubLString $str_alt6$ = makeString("");

    private static final SubLSymbol SCHEDULE_RECURRING_REPORT = makeSymbol("SCHEDULE-RECURRING-REPORT");

    static private final SubLString $str_alt8$ReportGeneratorReportSpecificatio = makeString("ReportGeneratorReportSpecification");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    static private final SubLList $list_alt11 = list(constant_handles.reader_make_constant_shell(makeString("ReportGeneratorReportSpecification")));

    public static final SubLObject $$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));

    public static final SubLObject $$reportSpecificationTemplate = constant_handles.reader_make_constant_shell(makeString("reportSpecificationTemplate"));

    public static final SubLObject $const14$reportSpecificationClobberMultipl = constant_handles.reader_make_constant_shell(makeString("reportSpecificationClobberMultipleValues"));

    public static final SubLObject $$False = constant_handles.reader_make_constant_shell(makeString("False"));

    public static final SubLObject $$True = constant_handles.reader_make_constant_shell(makeString("True"));

    public static final SubLObject $$reportSpecificationPlaceholder = constant_handles.reader_make_constant_shell(makeString("reportSpecificationPlaceholder"));

    public static final SubLObject $const18$reportSpecificationSelectionSente = constant_handles.reader_make_constant_shell(makeString("reportSpecificationSelectionSentence"));

    public static final SubLObject $$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));

    public static final SubLObject $const20$reportSpecificationDelimiterChara = constant_handles.reader_make_constant_shell(makeString("reportSpecificationDelimiterCharacter"));

    public static final SubLObject $$Comma_TheSymbol = constant_handles.reader_make_constant_shell(makeString("Comma-TheSymbol"));

    public static final SubLObject $$reportSpecificationFields = constant_handles.reader_make_constant_shell(makeString("reportSpecificationFields"));

    public static final SubLObject $$scheduledReportSpecification = constant_handles.reader_make_constant_shell(makeString("scheduledReportSpecification"));

    public static final SubLObject $$ModelMtByUserAndTaskFn = constant_handles.reader_make_constant_shell(makeString("ModelMtByUserAndTaskFn"));

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));



    static private final SubLList $list_alt27 = list(constant_handles.reader_make_constant_shell(makeString("stringVersionOfCharacter")), constant_handles.reader_make_constant_shell(makeString("termStrings")));

    static private final SubLString $str_alt28$reports_ = makeString("reports/");

    static private final SubLString $str_alt29$_ = makeString(".");

    static private final SubLString $str_alt30$http___ = makeString("http://");

    static private final SubLString $str_alt31$_ = makeString(":");

    private static final SubLSymbol REPORT_BY_COLUMN_TO_FILE = makeSymbol("REPORT-BY-COLUMN-TO-FILE");

    private static final SubLSymbol $LOG_STREAM = makeKeyword("LOG-STREAM");



    static private final SubLString $str_alt35$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $REPORT_KNOWLEDGE_SOURCE = makeKeyword("REPORT-KNOWLEDGE-SOURCE");

    private static final SubLSymbol REPORT_BY_COLUMN_TO_STREAM = makeSymbol("REPORT-BY-COLUMN-TO-STREAM");

    private static final SubLSymbol $COLUMN_RANGE = makeKeyword("COLUMN-RANGE");

    private static final SubLSymbol $DELIMITER = makeKeyword("DELIMITER");





    private static final SubLSymbol $LOG_FILE = makeKeyword("LOG-FILE");

    static private final SubLString $str_alt43$Cannot_understand_filename__bad__ = makeString("Cannot understand filename: bad ~A and ~A ~A is not absolute~%");

    static private final SubLList $list_alt44 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), makeInteger(1500), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), NIL, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("BROWSABLE?"), NIL });

    public static final SubLSymbol $rgbc_locked_overriding_properties$ = makeSymbol("*RGBC-LOCKED-OVERRIDING-PROPERTIES*");

    static private final SubLString $$$RGBC_OVERRIDING_PROPERTIES = makeString("RGBC OVERRIDING PROPERTIES");



    static private final SubLString $str_alt48$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    private static final SubLSymbol RUN_BATCH_REPORTS_FROM_DEFINITION_FILE = makeSymbol("RUN-BATCH-REPORTS-FROM-DEFINITION-FILE");

    static private final SubLList $list_alt50 = cons(makeUninternedSymbol("KEY"), makeSymbol("PROPS"));









    private static final SubLSymbol RANGE_SPECIFIER_ITEM_P = makeSymbol("RANGE-SPECIFIER-ITEM-P");

    private static final SubLSymbol EXPAND_RANGE_SPECIFIER_ITEM = makeSymbol("EXPAND-RANGE-SPECIFIER-ITEM");

    private static final SubLSymbol GAFS_FROM_KS = makeSymbol("GAFS-FROM-KS");

    public static final SubLSymbol $kw58$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    static private final SubLString $str_alt60$_A = makeString("~A");

    public static final SubLSymbol $kw61$CLOBBER_MULTIPLE_VALUES_ = makeKeyword("CLOBBER-MULTIPLE-VALUES?");

    public static final SubLObject $$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));

    private static final SubLSymbol $MULTIPLE_ANSWERS = makeKeyword("MULTIPLE-ANSWERS");

    static private final SubLList $list_alt64 = list(makeSymbol("BASE-QUERY"), makeSymbol("GET-THING-ARGPOS"), makeSymbol("FINAL-QUERY"), makeSymbol("ENTITY-ARGPOS"), makeSymbol("LFI"), makeSymbol("FINAL-ANSWER-ARGPOS"));

    static private final SubLString $str_alt65$Some_rows_unexpectedly_returned_m = makeString("Some rows unexpectedly returned multiple answers for query ~A.~%LFI: ~A~%Original sentence: ~A~%");

    private static final SubLSymbol APPLY_ENCODING_FOR_PF = makeSymbol("APPLY-ENCODING-FOR-PF");

    static private final SubLList $list_alt67 = list(makeSymbol("BASE-QUERY"), makeSymbol("GET-THING-ARGPOS"), makeSymbol("QUERY-SPEC"), makeSymbol("ENTITY-ARGPOS"), makeSymbol("LFI"), makeSymbol("FINAL-ANSWER-ARGPOS"));

    private static final SubLSymbol $SELECTION_SENTENCE = makeKeyword("SELECTION-SENTENCE");

    static private final SubLList $list_alt69 = list(makeSymbol("NEW-ENTITY-VAR"), makeSymbol("NEW-SENTENCE"));



    static private final SubLString $str_alt71$Query_halted_unusually_with__D_re = makeString("Query halted unusually with ~D results for reason ~A:~%~A~%~A~%~A~%~A~%~A~%");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));



    public static final SubLObject $$logicalSchemaSourceMap = constant_handles.reader_make_constant_shell(makeString("logicalSchemaSourceMap"));

    static private final SubLSymbol $sym75$_LS = makeSymbol("?LS");

    static private final SubLList $list_alt76 = list(list(constant_handles.reader_make_constant_shell(makeString("logicalFieldIndexicals")), makeSymbol("?LS"), makeSymbol("?LFI")), list(constant_handles.reader_make_constant_shell(makeString("bindingInPositionFromUsedInPositionInFor")), makeSymbol("??DC1"), makeSymbol("??DC2"), makeSymbol("?QUERY"), makeSymbol("??DC3"), makeSymbol("?LFI"), makeSymbol("?RESULTPOS")));

    static private final SubLSymbol $sym77$_QUERY = makeSymbol("?QUERY");

    static private final SubLList $list_alt78 = list(list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("equalSymbols")), makeSymbol("?RESULTPOS"), list(constant_handles.reader_make_constant_shell(makeString("TheList"))))));

    static private final SubLList $list_alt79 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLString $str_alt80$Can_t_find_any_useful_queries_ass = makeString("Can't find any useful queries associated with report ~A!~%");

    static private final SubLList $list_alt81 = list(new SubLObject[]{ makeKeyword("REPORT-KNOWLEDGE-SOURCE"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("LOG-FILE"), makeKeyword("LOG-STREAM"), makeKeyword("DELIMITER"), makeKeyword("SELECTION-SENTENCE"), makeKeyword("COLUMN-RANGE"), makeKeyword("PLACEHOLDER"), makeKeyword("CLOBBER-MULTIPLE-VALUES?") });

    static private final SubLList $list_alt82 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?INDEX"), constant_handles.reader_make_constant_shell(makeString("CVIRQualifyingOperation")));

    private static final SubLSymbol APPLY_RANGE_SPECIFIER_TO_SEQUENCE = makeSymbol("APPLY-RANGE-SPECIFIER-TO-SEQUENCE");





    static private final SubLString $$$sbrown = makeString("sbrown");









    static private final SubLList $list_alt91 = list(list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(FOUR_INTEGER)), list(makeSymbol("E"))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(ONE_INTEGER, FOUR_INTEGER)), list(makeSymbol("B"), makeSymbol("E"))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(list(ONE_INTEGER, FOUR_INTEGER))), list(makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(list(ZERO_INTEGER, NIL))), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"))), list(list(list(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"), makeSymbol("F"), makeSymbol("G"), makeSymbol("H"), makeSymbol("I"), makeSymbol("J") }), list(ZERO_INTEGER, list(TWO_INTEGER, FOUR_INTEGER), SIX_INTEGER, list(EIGHT_INTEGER, NIL))), list(makeSymbol("A"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"), makeSymbol("G"), makeSymbol("I"), makeSymbol("J"))));

    private static final SubLSymbol ABSOLUTE_PATH_FROM_ABSOLUTE_OR_RELATIVE = makeSymbol("ABSOLUTE-PATH-FROM-ABSOLUTE-OR-RELATIVE");

    static private final SubLList $list_alt93 = list(new SubLObject[]{ list(list(NIL, NIL), NIL), list(list(makeString(""), makeString("")), NIL), list(list(makeString("foo.txt"), makeString("")), NIL), list(list(makeString("/home/foo.txt"), makeString("")), makeString("/home/foo.txt")), list(list(makeString("/home/foo.txt"), makeString(":\\/$# nblah")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("/home")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("/home/")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("home")), NIL), list(list(makeString("../foo.txt"), makeString("/home/bar")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("C:\\")), makeString("C:\\foo.txt")), list(list(makeString("foo.txt"), makeString("C:\\Documents and Settings")), makeString("C:\\Documents and Settings\\foo.txt")), list(list(makeString("C:\\Documents and Settings\\foo.txt"), makeString(":\\/$# nblah")), makeString("C:\\Documents and Settings\\foo.txt")), list(list(makeString("foo.txt"), makeString("\\\\windows\\share")), makeString("\\\\windows\\share\\foo.txt")) });

    // // Initializers
    public void declareFunctions() {
        declare_ccf_reports_by_column_file();
    }

    public void initializeVariables() {
        init_ccf_reports_by_column_file();
    }

    public void runTopLevelForms() {
        setup_ccf_reports_by_column_file();
    }
}

