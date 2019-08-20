/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PSP-SYNTAX
 * source file: /cyc/top/cycl/psp-syntax.lisp
 * created:     2019/07/03 17:38:25
 */
public final class psp_syntax extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new psp_syntax();



    private static final SubLSymbol PSP_LEXICON_P = makeSymbol("PSP-LEXICON-P");

    private static final SubLSymbol PSP_GAP_CONSTRAINT_P = makeSymbol("PSP-GAP-CONSTRAINT-P");

    private static final SubLSymbol $sym4$INTERVAL_SPAN_PRECEDES_ = makeSymbol("INTERVAL-SPAN-PRECEDES?");

    private static final SubLString $str5$__Doing_lexical_span__S___ = makeString("~&Doing lexical span ~S.~%");

    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_CHART_P = makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P");

    private static final SubLString $str9$___Edges_so_far___S__Completed___ = makeString("~& Edges so far: ~S. Completed: ~S Non-trivial: ~S~%");

    private static final SubLString $str13$__Found_new_edges_starting_with__ = makeString("~&Found new edges starting with ~S:~% ~S.~%");

    private static final SubLString $str14$__Found_new_edges_continued_by__S = makeString("~&Found new edges continued by ~S:~% ~S.~%");

    private static final SubLString $str16$___S___meets_next_dtr_constraints = makeString("~&~S~% meets next-dtr constraints.~%");





    private static final SubLObject $$PSRule_PP = reader_make_constant_shell("PSRule-PP");

    private static final SubLString $str20$__Continued__S_with____S_to_form_ = makeString("~&Continued ~S with~% ~S to form~% ~S, whose head is~% ~S.~%");

    // Definitions
    /**
     *
     *
     * @return PHRASE-STRUCTURE-PARSER-CHART-P populated with edges resulting
    from a syntactic-only parse of INPUT-STRING if DO-SYNTACTIC-PARSING? is non-NIL,
    or just lexical edges if it is NIL.
     */
    @LispMethod(comment = "@return PHRASE-STRUCTURE-PARSER-CHART-P populated with edges resulting\r\nfrom a syntactic-only parse of INPUT-STRING if DO-SYNTACTIC-PARSING? is non-NIL,\r\nor just lexical edges if it is NIL.")
    public static final SubLObject psp_chart_for_string_alt(SubLObject input_string, SubLObject lexicon, SubLObject gap_type, SubLObject do_syntactic_parsingP) {
        if (lexicon == UNPROVIDED) {
            lexicon = psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (gap_type == UNPROVIDED) {
            gap_type = $NONE;
        }
        if (do_syntactic_parsingP == UNPROVIDED) {
            do_syntactic_parsingP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_string, STRINGP);
            SubLTrampolineFile.checkType(lexicon, PSP_LEXICON_P);
            SubLTrampolineFile.checkType(gap_type, PSP_GAP_CONSTRAINT_P);
            {
                SubLObject chart = psp_chart.new_psp_chart(UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_lexicon$.bind(lexicon, thread);
                        {
                            SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, parsing_macros.$psp_sbhl_resourcing_limit$.getGlobalValue()), thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                    psp_rules.psp_check_initializations();
                                    {
                                        SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
                                        {
                                            SubLObject _prev_bind_0_2 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                    Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        psp_chart.initialize_psp_chart(input_string, chart, lexicon, gap_type);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != do_syntactic_parsingP) {
                                                                    com.cyc.cycjava.cycl.psp_syntax.psp_chart_do_syntactic_parsing(chart, UNPROVIDED, UNPROVIDED);
                                                                }
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
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$psp_lexicon$.rebind(_prev_bind_0, thread);
                    }
                }
                return chart;
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @return PHRASE-STRUCTURE-PARSER-CHART-P populated with edges resulting
    from a syntactic-only parse of INPUT-STRING if DO-SYNTACTIC-PARSING? is non-NIL,
    or just lexical edges if it is NIL.
     */
    @LispMethod(comment = "@return PHRASE-STRUCTURE-PARSER-CHART-P populated with edges resulting\r\nfrom a syntactic-only parse of INPUT-STRING if DO-SYNTACTIC-PARSING? is non-NIL,\r\nor just lexical edges if it is NIL.")
    public static SubLObject psp_chart_for_string(final SubLObject input_string, SubLObject lexicon, SubLObject gap_type, SubLObject do_syntactic_parsingP) {
        if (lexicon == UNPROVIDED) {
            lexicon = psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (gap_type == UNPROVIDED) {
            gap_type = $NONE;
        }
        if (do_syntactic_parsingP == UNPROVIDED) {
            do_syntactic_parsingP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(input_string) : "! stringp(input_string) " + ("Types.stringp(input_string) " + "CommonSymbols.NIL != Types.stringp(input_string) ") + input_string;
        assert NIL != psp_lexicon.psp_lexicon_p(lexicon) : "! psp_lexicon.psp_lexicon_p(lexicon) " + ("psp_lexicon.psp_lexicon_p(lexicon) " + "CommonSymbols.NIL != psp_lexicon.psp_lexicon_p(lexicon) ") + lexicon;
        assert NIL != psp_chart.psp_gap_constraint_p(gap_type) : "! psp_chart.psp_gap_constraint_p(gap_type) " + ("psp_chart.psp_gap_constraint_p(gap_type) " + "CommonSymbols.NIL != psp_chart.psp_gap_constraint_p(gap_type) ") + gap_type;
        final SubLObject chart = psp_chart.new_psp_chart(UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_lexicon$.currentBinding(thread);
        try {
            parsing_vars.$psp_lexicon$.bind(lexicon, thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, parsing_macros.$psp_sbhl_resourcing_limit$.getGlobalValue()), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                psp_rules.psp_check_initializations();
                final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
                final SubLObject _prev_bind_0_$2 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        psp_chart.initialize_psp_chart(input_string, chart, lexicon, gap_type);
                        if (NIL != do_syntactic_parsingP) {
                            psp_chart_do_syntactic_parsing(chart, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            parsing_vars.$psp_lexicon$.rebind(_prev_bind_0, thread);
        }
        return chart;
    }

    public static final SubLObject psp_chart_do_syntactic_parsing_alt(SubLObject chart, SubLObject start, SubLObject end) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        if (start == UNPROVIDED) {
            start = parsing_vars.$psp_chart_start_index$.getDynamicValue();
        }
        if (end == UNPROVIDED) {
            end = parsing_vars.$psp_chart_end_index$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sorted_spans = Sort.sort(psp_chart.psp_chart_spans(chart, start, end), $sym5$INTERVAL_SPAN_PRECEDES_, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_chart$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_chart$.bind(chart, thread);
                        {
                            SubLObject report_progressP = NIL;
                            SubLObject stop_working_on_chartP = parsing_macros.parsing_timeout_time_reachedP();
                            SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
                            {
                                SubLObject _prev_bind_0_4 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            if (NIL == stop_working_on_chartP) {
                                                {
                                                    SubLObject csome_list_var = sorted_spans;
                                                    SubLObject span = NIL;
                                                    for (span = csome_list_var.first(); !((NIL != stop_working_on_chartP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , span = csome_list_var.first()) {
                                                        {
                                                            SubLObject stop_working_on_spanP = NIL;
                                                            SubLObject report_spanP = makeBoolean((NIL != report_progressP) && (NIL != psp_chart.psp_span_has_edges_p(span, UNPROVIDED)));
                                                            if (NIL != report_spanP) {
                                                                format(T, $str_alt6$__Doing_lexical_span__S___, span);
                                                            }
                                                            {
                                                                SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                                SubLTrampolineFile.checkType(chart_to_use, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                                if (span == $ANY) {
                                                                    {
                                                                        SubLObject pcase_var = $LEXICAL;
                                                                        if (pcase_var.eql($ANY)) {
                                                                            {
                                                                                SubLObject chart_to_use_5 = (NIL != chart_to_use) ? ((SubLObject) (chart_to_use)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                                                SubLTrampolineFile.checkType(chart_to_use_5, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                                                {
                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_5)));
                                                                                    while (!((NIL != stop_working_on_spanP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                            SubLObject value = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL == stop_working_on_spanP) {
                                                                                                {
                                                                                                    SubLObject csome_list_var_6 = psp_chart.psp_edges_with_span(span_to_do, chart_to_use);
                                                                                                    SubLObject lexical_edge = NIL;
                                                                                                    for (lexical_edge = csome_list_var_6.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var_6)); csome_list_var_6 = csome_list_var_6.rest() , lexical_edge = csome_list_var_6.first()) {
                                                                                                        if (NIL != psp_chart.psp_do_edge_okP(lexical_edge, $ANY, T)) {
                                                                                                            if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                                                                                stop_working_on_spanP = T;
                                                                                                                stop_working_on_chartP = T;
                                                                                                            } else {
                                                                                                                if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                                                                                    stop_working_on_spanP = T;
                                                                                                                } else {
                                                                                                                    if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                                                                        stop_working_on_spanP = T;
                                                                                                                    } else {
                                                                                                                        if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                                                                            stop_working_on_spanP = T;
                                                                                                                            stop_working_on_chartP = T;
                                                                                                                        } else {
                                                                                                                            com.cyc.cycjava.cycl.psp_syntax.psp_process_new_edges_from_edge(lexical_edge);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                        }
                                                                                    } 
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (pcase_var.eql($LEXICAL)) {
                                                                                {
                                                                                    SubLObject chart_to_use_7 = (NIL != chart_to_use) ? ((SubLObject) (chart_to_use)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                                                    SubLTrampolineFile.checkType(chart_to_use_7, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                                                    {
                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_7)));
                                                                                        while (!((NIL != stop_working_on_spanP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                SubLObject value = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL == stop_working_on_spanP) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var_8 = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use);
                                                                                                        SubLObject lexical_edge = NIL;
                                                                                                        for (lexical_edge = csome_list_var_8.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var_8)); csome_list_var_8 = csome_list_var_8.rest() , lexical_edge = csome_list_var_8.first()) {
                                                                                                            if (NIL != psp_chart.psp_do_edge_okP(lexical_edge, $ANY, T)) {
                                                                                                                if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                                                                                    stop_working_on_spanP = T;
                                                                                                                    stop_working_on_chartP = T;
                                                                                                                } else {
                                                                                                                    if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                                                                                        stop_working_on_spanP = T;
                                                                                                                    } else {
                                                                                                                        if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                                                                            stop_working_on_spanP = T;
                                                                                                                        } else {
                                                                                                                            if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                                                                                stop_working_on_spanP = T;
                                                                                                                                stop_working_on_chartP = T;
                                                                                                                            } else {
                                                                                                                                com.cyc.cycjava.cycl.psp_syntax.psp_process_new_edges_from_edge(lexical_edge);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
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
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (NIL != interval_span.interval_span_p(span)) {
                                                                        {
                                                                            SubLObject pcase_var = $LEXICAL;
                                                                            if (pcase_var.eql($ANY)) {
                                                                                if (NIL == stop_working_on_spanP) {
                                                                                    {
                                                                                        SubLObject csome_list_var_9 = psp_chart.psp_edges_with_span(span, chart_to_use);
                                                                                        SubLObject lexical_edge = NIL;
                                                                                        for (lexical_edge = csome_list_var_9.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var_9)); csome_list_var_9 = csome_list_var_9.rest() , lexical_edge = csome_list_var_9.first()) {
                                                                                            if (NIL != psp_chart.psp_do_edge_okP(lexical_edge, $ANY, T)) {
                                                                                                if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                                                                    stop_working_on_spanP = T;
                                                                                                    stop_working_on_chartP = T;
                                                                                                } else {
                                                                                                    if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                                                                        stop_working_on_spanP = T;
                                                                                                    } else {
                                                                                                        if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                                                            stop_working_on_spanP = T;
                                                                                                        } else {
                                                                                                            if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                                                                stop_working_on_spanP = T;
                                                                                                                stop_working_on_chartP = T;
                                                                                                            } else {
                                                                                                                com.cyc.cycjava.cycl.psp_syntax.psp_process_new_edges_from_edge(lexical_edge);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (pcase_var.eql($LEXICAL)) {
                                                                                    if (NIL == stop_working_on_spanP) {
                                                                                        {
                                                                                            SubLObject csome_list_var_10 = psp_chart.psp_lexical_edges_with_span(span, chart_to_use);
                                                                                            SubLObject lexical_edge = NIL;
                                                                                            for (lexical_edge = csome_list_var_10.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var_10)); csome_list_var_10 = csome_list_var_10.rest() , lexical_edge = csome_list_var_10.first()) {
                                                                                                if (NIL != psp_chart.psp_do_edge_okP(lexical_edge, $ANY, T)) {
                                                                                                    if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                                                                        stop_working_on_spanP = T;
                                                                                                        stop_working_on_chartP = T;
                                                                                                    } else {
                                                                                                        if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                                                                            stop_working_on_spanP = T;
                                                                                                        } else {
                                                                                                            if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                                                                stop_working_on_spanP = T;
                                                                                                            } else {
                                                                                                                if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                                                                    stop_working_on_spanP = T;
                                                                                                                    stop_working_on_chartP = T;
                                                                                                                } else {
                                                                                                                    com.cyc.cycjava.cycl.psp_syntax.psp_process_new_edges_from_edge(lexical_edge);
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
                                                            }
                                                            if (NIL == stop_working_on_spanP) {
                                                                psp_chart.note_psp_lexical_span_parsed(span, UNPROVIDED);
                                                            }
                                                            if (NIL != report_spanP) {
                                                                format(T, $str_alt10$___Edges_so_far___S__Completed___, new SubLObject[]{ psp_chart.psp_edge_count(UNPROVIDED), length(psp_chart.psp_all_complete_edges(NIL)), length(psp_chart.psp_all_complete_edges(T)) });
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$psp_chart$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return chart;
        }
    }

    public static SubLObject psp_chart_do_syntactic_parsing(SubLObject chart, SubLObject start, SubLObject end) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        if (start == UNPROVIDED) {
            start = parsing_vars.$psp_chart_start_index$.getDynamicValue();
        }
        if (end == UNPROVIDED) {
            end = parsing_vars.$psp_chart_end_index$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sorted_spans = Sort.sort(psp_chart.psp_chart_spans(chart, start, end), $sym4$INTERVAL_SPAN_PRECEDES_, UNPROVIDED);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_chart$.currentBinding(thread);
        try {
            parsing_vars.$psp_chart$.bind(chart, thread);
            final SubLObject report_progressP = NIL;
            SubLObject stop_working_on_chartP = parsing_macros.parsing_timeout_time_reachedP();
            final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
            final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == stop_working_on_chartP) {
                        SubLObject csome_list_var = sorted_spans;
                        SubLObject span = NIL;
                        span = csome_list_var.first();
                        while ((NIL == stop_working_on_chartP) && (NIL != csome_list_var)) {
                            SubLObject stop_working_on_spanP = NIL;
                            final SubLObject report_spanP = makeBoolean((NIL != report_progressP) && (NIL != psp_chart.psp_span_has_edges_p(span, UNPROVIDED)));
                            if (NIL != report_spanP) {
                                format(T, $str5$__Doing_lexical_span__S___, span);
                            }
                            final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                            assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) ") + chart_to_use;
                            if (span == $ANY) {
                                final SubLObject pcase_var = $LEXICAL;
                                if (pcase_var.eql($ANY)) {
                                    final SubLObject chart_to_use_$5 = (NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                    assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$5) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$5) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$5) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$5) ") + chart_to_use_$5;
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$5))); (NIL == stop_working_on_spanP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject value = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL == stop_working_on_spanP) {
                                            SubLObject csome_list_var_$6 = psp_chart.psp_edges_with_span(span_to_do, chart_to_use);
                                            SubLObject lexical_edge = NIL;
                                            lexical_edge = csome_list_var_$6.first();
                                            while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var_$6)) {
                                                if (NIL != psp_chart.psp_do_edge_okP(lexical_edge, $ANY, T)) {
                                                    if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                        stop_working_on_spanP = T;
                                                        stop_working_on_chartP = T;
                                                    } else
                                                        if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                            stop_working_on_spanP = T;
                                                        } else
                                                            if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                stop_working_on_spanP = T;
                                                            } else
                                                                if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                    stop_working_on_spanP = T;
                                                                    stop_working_on_chartP = T;
                                                                } else {
                                                                    psp_process_new_edges_from_edge(lexical_edge);
                                                                }



                                                }
                                                csome_list_var_$6 = csome_list_var_$6.rest();
                                                lexical_edge = csome_list_var_$6.first();
                                            } 
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                } else
                                    if (pcase_var.eql($LEXICAL)) {
                                        final SubLObject chart_to_use_$6 = (NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                        assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$6) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$6) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$6) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$6) ") + chart_to_use_$6;
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$6))); (NIL == stop_working_on_spanP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject value = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL == stop_working_on_spanP) {
                                                SubLObject csome_list_var_$7 = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use);
                                                SubLObject lexical_edge = NIL;
                                                lexical_edge = csome_list_var_$7.first();
                                                while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var_$7)) {
                                                    if (NIL != psp_chart.psp_do_edge_okP(lexical_edge, $ANY, T)) {
                                                        if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                            stop_working_on_spanP = T;
                                                            stop_working_on_chartP = T;
                                                        } else
                                                            if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                                stop_working_on_spanP = T;
                                                            } else
                                                                if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                    stop_working_on_spanP = T;
                                                                } else
                                                                    if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                        stop_working_on_spanP = T;
                                                                        stop_working_on_chartP = T;
                                                                    } else {
                                                                        psp_process_new_edges_from_edge(lexical_edge);
                                                                    }



                                                    }
                                                    csome_list_var_$7 = csome_list_var_$7.rest();
                                                    lexical_edge = csome_list_var_$7.first();
                                                } 
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }

                            } else
                                if (NIL != interval_span.interval_span_p(span)) {
                                    final SubLObject pcase_var = $LEXICAL;
                                    if (pcase_var.eql($ANY)) {
                                        if (NIL == stop_working_on_spanP) {
                                            SubLObject csome_list_var_$8 = psp_chart.psp_edges_with_span(span, chart_to_use);
                                            SubLObject lexical_edge2 = NIL;
                                            lexical_edge2 = csome_list_var_$8.first();
                                            while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var_$8)) {
                                                if (NIL != psp_chart.psp_do_edge_okP(lexical_edge2, $ANY, T)) {
                                                    if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                        stop_working_on_spanP = T;
                                                        stop_working_on_chartP = T;
                                                    } else
                                                        if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                            stop_working_on_spanP = T;
                                                        } else
                                                            if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                stop_working_on_spanP = T;
                                                            } else
                                                                if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                    stop_working_on_spanP = T;
                                                                    stop_working_on_chartP = T;
                                                                } else {
                                                                    psp_process_new_edges_from_edge(lexical_edge2);
                                                                }



                                                }
                                                csome_list_var_$8 = csome_list_var_$8.rest();
                                                lexical_edge2 = csome_list_var_$8.first();
                                            } 
                                        }
                                    } else
                                        if (pcase_var.eql($LEXICAL) && (NIL == stop_working_on_spanP)) {
                                            SubLObject csome_list_var_$9 = psp_chart.psp_lexical_edges_with_span(span, chart_to_use);
                                            SubLObject lexical_edge2 = NIL;
                                            lexical_edge2 = csome_list_var_$9.first();
                                            while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var_$9)) {
                                                if (NIL != psp_chart.psp_do_edge_okP(lexical_edge2, $ANY, T)) {
                                                    if (NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                        stop_working_on_spanP = T;
                                                        stop_working_on_chartP = T;
                                                    } else
                                                        if (NIL != psp_chart.psp_lexical_span_parsedP(span, UNPROVIDED)) {
                                                            stop_working_on_spanP = T;
                                                        } else
                                                            if (NIL != psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                                                                stop_working_on_spanP = T;
                                                            } else
                                                                if (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED)) {
                                                                    stop_working_on_spanP = T;
                                                                    stop_working_on_chartP = T;
                                                                } else {
                                                                    psp_process_new_edges_from_edge(lexical_edge2);
                                                                }



                                                }
                                                csome_list_var_$9 = csome_list_var_$9.rest();
                                                lexical_edge2 = csome_list_var_$9.first();
                                            } 
                                        }

                                }

                            if (NIL == stop_working_on_spanP) {
                                psp_chart.note_psp_lexical_span_parsed(span, UNPROVIDED);
                            }
                            if (NIL != report_spanP) {
                                format(T, $str9$___Edges_so_far___S__Completed___, new SubLObject[]{ psp_chart.psp_edge_count(UNPROVIDED), length(psp_chart.psp_all_complete_edges(NIL)), length(psp_chart.psp_all_complete_edges(T)) });
                            }
                            csome_list_var = csome_list_var.rest();
                            span = csome_list_var.first();
                        } 
                    }
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            parsing_vars.$psp_chart$.rebind(_prev_bind_0, thread);
        }
        return chart;
    }

    /**
     * Process some newly found edges.
     */
    @LispMethod(comment = "Process some newly found edges.")
    public static final SubLObject psp_process_edges_alt(SubLObject edges) {
        {
            SubLObject stopP = psp_chart.psp_chart_too_many_edgesP(UNPROVIDED);
            if (NIL == stopP) {
                {
                    SubLObject csome_list_var = edges;
                    SubLObject edge = NIL;
                    for (edge = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                        psp_chart.psp_chart_add_edge(edge, UNPROVIDED);
                        stopP = makeBoolean(((($ABORTED == com.cyc.cycjava.cycl.psp_syntax.psp_process_new_edges_from_edge(edge)) || (NIL != parsing_macros.parsing_timeout_time_reachedP())) || (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED))) || (NIL != psp_chart.psp_span_too_many_edgesP(psp_chart.get_psp_edge_span(edge), UNPROVIDED)));
                    }
                }
            }
            return NIL != stopP ? ((SubLObject) ($ABORTED)) : $PROCESSED;
        }
    }

    @LispMethod(comment = "Process some newly found edges.")
    public static SubLObject psp_process_edges(final SubLObject edges) {
        SubLObject stopP = psp_chart.psp_chart_too_many_edgesP(UNPROVIDED);
        if (NIL == stopP) {
            SubLObject csome_list_var;
            SubLObject edge;
            for (csome_list_var = edges, edge = NIL, edge = csome_list_var.first(); (NIL == stopP) && (NIL != csome_list_var); stopP = makeBoolean(((($ABORTED == psp_process_new_edges_from_edge(edge)) || (NIL != parsing_macros.parsing_timeout_time_reachedP())) || (NIL != psp_chart.psp_chart_too_many_edgesP(UNPROVIDED))) || (NIL != psp_chart.psp_span_too_many_edgesP(psp_chart.get_psp_edge_span(edge), UNPROVIDED))) , csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                psp_chart.psp_chart_add_edge(edge, UNPROVIDED);
            }
        }
        return NIL != stopP ? $ABORTED : $PROCESSED;
    }/**
     * Process some newly found edges.
     */


    /**
     * Process new edges derivable from a newly found edge.
     */
    @LispMethod(comment = "Process new edges derivable from a newly found edge.")
    public static final SubLObject psp_process_new_edges_from_edge_alt(SubLObject edge) {
        return com.cyc.cycjava.cycl.psp_syntax.psp_process_edges(com.cyc.cycjava.cycl.psp_syntax.psp_new_edges_from_edge(edge));
    }

    @LispMethod(comment = "Process new edges derivable from a newly found edge.")
    public static SubLObject psp_process_new_edges_from_edge(final SubLObject edge) {
        return psp_process_edges(psp_new_edges_from_edge(edge));
    }/**
     * Process new edges derivable from a newly found edge.
     */


    /**
     *
     *
     * @return LISTP; of all new edges derivable from EDGE.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable from EDGE.")
    public static final SubLObject psp_new_edges_from_edge_alt(SubLObject edge) {
        if (NIL != psp_chart.psp_incomplete_edgeP(edge)) {
            return com.cyc.cycjava.cycl.psp_syntax.psp_new_edges_from_gaps(edge);
        } else {
            return append(com.cyc.cycjava.cycl.psp_syntax.psp_new_edges_from_rules(edge), com.cyc.cycjava.cycl.psp_syntax.psp_new_edges_from_edges(edge));
        }
    }

    /**
     *
     *
     * @return LISTP; of all new edges derivable from EDGE.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable from EDGE.")
    public static SubLObject psp_new_edges_from_edge(final SubLObject edge) {
        if (NIL != psp_chart.psp_incomplete_edgeP(edge)) {
            return psp_new_edges_from_gaps(edge);
        }
        return append(psp_new_edges_from_rules(edge), psp_new_edges_from_edges(edge));
    }

    /**
     *
     *
     * @return LISTP; of all new edges derivable by extending EDGE with a gap.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable by extending EDGE with a gap.")
    public static final SubLObject psp_new_edges_from_gaps_alt(SubLObject edge) {
        if (NIL == psp_chart.psp_gap_allowedP()) {
            return NIL;
        } else {
            if (NIL != psp_chart.psp_edge_already_has_gapP(edge)) {
                return NIL;
            } else {
                {
                    SubLObject new_edge = com.cyc.cycjava.cycl.psp_syntax.psp_extend_old_edge(edge, UNPROVIDED);
                    return NIL != new_edge ? ((SubLObject) (list(new_edge))) : NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return LISTP; of all new edges derivable by extending EDGE with a gap.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable by extending EDGE with a gap.")
    public static SubLObject psp_new_edges_from_gaps(final SubLObject edge) {
        if (NIL == psp_chart.psp_gap_allowedP()) {
            return NIL;
        }
        if (NIL != psp_chart.psp_edge_already_has_gapP(edge)) {
            return NIL;
        }
        final SubLObject new_edge = psp_extend_old_edge(edge, UNPROVIDED);
        return NIL != new_edge ? list(new_edge) : NIL;
    }

    /**
     *
     *
     * @return LISTP; of all new edges derivable from EDGE by using EDGE as the
    first daughter in a phrase licensed by a phrase-structure rule.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable from EDGE by using EDGE as the\r\nfirst daughter in a phrase licensed by a phrase-structure rule.")
    public static final SubLObject psp_new_edges_from_rules_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_edges = NIL;
                SubLObject string = psp_chart.get_psp_edge_string(edge);
                SubLObject span = psp_chart.get_psp_edge_span(edge);
                SubLObject frame = psp_chart.get_psp_edge_frame(edge);
                SubLObject rules = psp_rules.psp_rules_starting_with_edge(edge, UNPROVIDED);
                if (NIL == psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
                    {
                        SubLObject cdolist_list_var = rules;
                        SubLObject rule = NIL;
                        for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                            {
                                SubLObject category = psp_rules.psp_rule_category(rule);
                                SubLObject new_dtr_is_headP = eql(psp_rules.psp_rule_head(rule), ONE_INTEGER);
                                SubLObject pos_pred = (NIL != new_dtr_is_headP) ? ((SubLObject) (psp_chart.get_psp_edge_pos_pred(edge))) : NIL;
                                SubLObject cycls = $NEW;
                                SubLObject new_dtr_constraints = psp_rules.psp_rule_new_dtr_constraints(rule, frame);
                                SubLObject head_dtr = (NIL != new_dtr_is_headP) ? ((SubLObject) (edge)) : NIL;
                                SubLObject non_head_dtrs = (NIL != new_dtr_is_headP) ? ((SubLObject) (NIL)) : list(edge);
                                SubLObject weight = NIL;
                                SubLObject new_edge = psp_chart.new_psp_phrasal_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, string, category, pos_pred, cycls, weight, rule, new_dtr_constraints, head_dtr, non_head_dtrs);
                                new_edges = cons(new_edge, new_edges);
                            }
                        }
                    }
                }
                if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && (NIL != new_edges)) {
                    format(T, $str_alt14$__Found_new_edges_starting_with__, edge, new_edges);
                }
                return new_edges;
            }
        }
    }

    /**
     *
     *
     * @return LISTP; of all new edges derivable from EDGE by using EDGE as the
    first daughter in a phrase licensed by a phrase-structure rule.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable from EDGE by using EDGE as the\r\nfirst daughter in a phrase licensed by a phrase-structure rule.")
    public static SubLObject psp_new_edges_from_rules(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_edges = NIL;
        final SubLObject string = psp_chart.get_psp_edge_string(edge);
        final SubLObject span = psp_chart.get_psp_edge_span(edge);
        final SubLObject frame = psp_chart.get_psp_edge_frame(edge);
        final SubLObject rules = psp_rules.psp_rules_starting_with_edge(edge, UNPROVIDED);
        if (NIL == psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED)) {
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject category = psp_rules.psp_rule_category(rule);
                final SubLObject new_dtr_is_headP = eql(psp_rules.psp_rule_head(rule), ONE_INTEGER);
                final SubLObject pos_pred = (NIL != new_dtr_is_headP) ? psp_chart.get_psp_edge_pos_pred(edge) : NIL;
                final SubLObject cycls = $NEW;
                final SubLObject new_dtr_constraints = psp_rules.psp_rule_new_dtr_constraints(rule, frame);
                final SubLObject head_dtr = (NIL != new_dtr_is_headP) ? edge : NIL;
                final SubLObject non_head_dtrs = (NIL != new_dtr_is_headP) ? NIL : list(edge);
                final SubLObject weight = NIL;
                final SubLObject new_edge = psp_chart.new_psp_phrasal_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, string, category, pos_pred, cycls, weight, rule, new_dtr_constraints, head_dtr, non_head_dtrs);
                new_edges = cons(new_edge, new_edges);
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            } 
        }
        if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && (NIL != new_edges)) {
            format(T, $str13$__Found_new_edges_starting_with__, edge, new_edges);
        }
        return new_edges;
    }

    public static final SubLObject find_psp_edge_with_properties_alt(SubLObject span, SubLObject pos_pred, SubLObject rule, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        {
            SubLObject found = NIL;
            if (NIL == found) {
                {
                    SubLObject csome_list_var = psp_chart.psp_edges_with_span(span, chart);
                    SubLObject edge = NIL;
                    for (edge = csome_list_var.first(); !((NIL != found) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                        if ((psp_chart.get_psp_edge_rule(edge) == rule) && (psp_chart.get_psp_edge_pos_pred(edge) == pos_pred)) {
                            found = edge;
                        }
                    }
                }
            }
            return found;
        }
    }

    public static SubLObject find_psp_edge_with_properties(final SubLObject span, final SubLObject pos_pred, final SubLObject rule, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        SubLObject found = NIL;
        if (NIL == found) {
            SubLObject csome_list_var = psp_chart.psp_edges_with_span(span, chart);
            SubLObject edge = NIL;
            edge = csome_list_var.first();
            while ((NIL == found) && (NIL != csome_list_var)) {
                if (psp_chart.get_psp_edge_rule(edge).eql(rule) && psp_chart.get_psp_edge_pos_pred(edge).eql(pos_pred)) {
                    found = edge;
                }
                csome_list_var = csome_list_var.rest();
                edge = csome_list_var.first();
            } 
        }
        return found;
    }

    public static final SubLObject psp_adjacent_spansP_alt(SubLObject span1, SubLObject span2) {
        return eql(interval_span.interval_span_end(span1), interval_span.interval_span_start(span2));
    }

    public static SubLObject psp_adjacent_spansP(final SubLObject span1, final SubLObject span2) {
        return eql(interval_span.interval_span_end(span1), interval_span.interval_span_start(span2));
    }

    /**
     *
     *
     * @return LISTP; of all new edges derivable from EDGE by using EDGE as the
    next daughter in an existing partial edge.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable from EDGE by using EDGE as the\r\nnext daughter in an existing partial edge.")
    public static final SubLObject psp_new_edges_from_edges_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_edges = NIL;
                SubLObject stop_working_on_edgeP = psp_chart.psp_chart_too_many_edgesP(UNPROVIDED);
                SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                SubLTrampolineFile.checkType(chart_to_use, PHRASE_STRUCTURE_PARSER_CHART_P);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use)));
                    while (!((NIL != stop_working_on_edgeP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                        thread.resetMultipleValues();
                        {
                            SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != com.cyc.cycjava.cycl.psp_syntax.psp_adjacent_spansP(span, psp_chart.get_psp_edge_span(edge))) {
                                {
                                    SubLObject stop_working_on_spanP = psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED);
                                    SubLObject chart_to_use_12 = parsing_vars.$psp_chart$.getDynamicValue(thread);
                                    SubLTrampolineFile.checkType(chart_to_use_12, PHRASE_STRUCTURE_PARSER_CHART_P);
                                    if (span == $ANY) {
                                        {
                                            SubLObject pcase_var = $ANY;
                                            if (pcase_var.eql($ANY)) {
                                                {
                                                    SubLObject chart_to_use_13 = (NIL != chart_to_use_12) ? ((SubLObject) (chart_to_use_12)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                    SubLTrampolineFile.checkType(chart_to_use_13, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                    {
                                                        SubLObject iteration_state_14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_13)));
                                                        while (!((NIL != stop_working_on_spanP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_14)))) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state_14);
                                                                SubLObject value_15 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL == stop_working_on_spanP) {
                                                                    {
                                                                        SubLObject csome_list_var = psp_chart.psp_edges_with_span(span_to_do, chart_to_use_12);
                                                                        SubLObject old_edge = NIL;
                                                                        for (old_edge = csome_list_var.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , old_edge = csome_list_var.first()) {
                                                                            if (NIL != psp_chart.psp_do_edge_okP(old_edge, $ANY, NIL)) {
                                                                                {
                                                                                    SubLObject new_edge = com.cyc.cycjava.cycl.psp_syntax.psp_extend_old_edge(old_edge, edge);
                                                                                    SubLObject var = new_edge;
                                                                                    if (NIL != var) {
                                                                                        new_edges = cons(var, new_edges);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                iteration_state_14 = dictionary_contents.do_dictionary_contents_next(iteration_state_14);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_14);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($LEXICAL)) {
                                                    {
                                                        SubLObject chart_to_use_16 = (NIL != chart_to_use_12) ? ((SubLObject) (chart_to_use_12)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                        SubLTrampolineFile.checkType(chart_to_use_16, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                        {
                                                            SubLObject iteration_state_17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_16)));
                                                            while (!((NIL != stop_working_on_spanP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_17)))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state_17);
                                                                    SubLObject value_18 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL == stop_working_on_spanP) {
                                                                        {
                                                                            SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use_12);
                                                                            SubLObject old_edge = NIL;
                                                                            for (old_edge = csome_list_var.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , old_edge = csome_list_var.first()) {
                                                                                if (NIL != psp_chart.psp_do_edge_okP(old_edge, $ANY, NIL)) {
                                                                                    {
                                                                                        SubLObject new_edge = com.cyc.cycjava.cycl.psp_syntax.psp_extend_old_edge(old_edge, edge);
                                                                                        SubLObject var = new_edge;
                                                                                        if (NIL != var) {
                                                                                            new_edges = cons(var, new_edges);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    iteration_state_17 = dictionary_contents.do_dictionary_contents_next(iteration_state_17);
                                                                }
                                                            } 
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_17);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (NIL != interval_span.interval_span_p(span)) {
                                            {
                                                SubLObject pcase_var = $ANY;
                                                if (pcase_var.eql($ANY)) {
                                                    if (NIL == stop_working_on_spanP) {
                                                        {
                                                            SubLObject csome_list_var = psp_chart.psp_edges_with_span(span, chart_to_use_12);
                                                            SubLObject old_edge = NIL;
                                                            for (old_edge = csome_list_var.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , old_edge = csome_list_var.first()) {
                                                                if (NIL != psp_chart.psp_do_edge_okP(old_edge, $ANY, NIL)) {
                                                                    {
                                                                        SubLObject new_edge = com.cyc.cycjava.cycl.psp_syntax.psp_extend_old_edge(old_edge, edge);
                                                                        SubLObject var = new_edge;
                                                                        if (NIL != var) {
                                                                            new_edges = cons(var, new_edges);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($LEXICAL)) {
                                                        if (NIL == stop_working_on_spanP) {
                                                            {
                                                                SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span, chart_to_use_12);
                                                                SubLObject old_edge = NIL;
                                                                for (old_edge = csome_list_var.first(); !((NIL != stop_working_on_spanP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , old_edge = csome_list_var.first()) {
                                                                    if (NIL != psp_chart.psp_do_edge_okP(old_edge, $ANY, NIL)) {
                                                                        {
                                                                            SubLObject new_edge = com.cyc.cycjava.cycl.psp_syntax.psp_extend_old_edge(old_edge, edge);
                                                                            SubLObject var = new_edge;
                                                                            if (NIL != var) {
                                                                                new_edges = cons(var, new_edges);
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
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && (NIL != new_edges)) {
                    format(T, $str_alt15$__Found_new_edges_continued_by__S, edge, new_edges);
                }
                return new_edges;
            }
        }
    }

    /**
     *
     *
     * @return LISTP; of all new edges derivable from EDGE by using EDGE as the
    next daughter in an existing partial edge.
     */
    @LispMethod(comment = "@return LISTP; of all new edges derivable from EDGE by using EDGE as the\r\nnext daughter in an existing partial edge.")
    public static SubLObject psp_new_edges_from_edges(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_edges = NIL;
        final SubLObject stop_working_on_edgeP = psp_chart.psp_chart_too_many_edgesP(UNPROVIDED);
        final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
        assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) ") + chart_to_use;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use))); (NIL == stop_working_on_edgeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != psp_adjacent_spansP(span, psp_chart.get_psp_edge_span(edge))) {
                final SubLObject stop_working_on_spanP = psp_chart.psp_span_too_many_edgesP(span, UNPROVIDED);
                final SubLObject chart_to_use_$12 = parsing_vars.$psp_chart$.getDynamicValue(thread);
                assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$12) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$12) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$12) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$12) ") + chart_to_use_$12;
                if (span == $ANY) {
                    final SubLObject pcase_var = $ANY;
                    if (pcase_var.eql($ANY)) {
                        final SubLObject chart_to_use_$13 = (NIL != chart_to_use_$12) ? chart_to_use_$12 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                        assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$13) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$13) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$13) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$13) ") + chart_to_use_$13;
                        SubLObject iteration_state_$14;
                        for (iteration_state_$14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$13))); (NIL == stop_working_on_spanP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$14)); iteration_state_$14 = dictionary_contents.do_dictionary_contents_next(iteration_state_$14)) {
                            thread.resetMultipleValues();
                            final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$14);
                            final SubLObject value_$15 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == stop_working_on_spanP) {
                                SubLObject csome_list_var = psp_chart.psp_edges_with_span(span_to_do, chart_to_use_$12);
                                SubLObject old_edge = NIL;
                                old_edge = csome_list_var.first();
                                while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var)) {
                                    if (NIL != psp_chart.psp_do_edge_okP(old_edge, $ANY, NIL)) {
                                        final SubLObject var;
                                        final SubLObject new_edge = var = psp_extend_old_edge(old_edge, edge);
                                        if (NIL != var) {
                                            new_edges = cons(var, new_edges);
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    old_edge = csome_list_var.first();
                                } 
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$14);
                    } else
                        if (pcase_var.eql($LEXICAL)) {
                            final SubLObject chart_to_use_$14 = (NIL != chart_to_use_$12) ? chart_to_use_$12 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                            assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$14) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$14) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$14) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$14) ") + chart_to_use_$14;
                            SubLObject iteration_state_$15;
                            for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$14))); (NIL == stop_working_on_spanP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15)); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                thread.resetMultipleValues();
                                final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                final SubLObject value_$16 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == stop_working_on_spanP) {
                                    SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use_$12);
                                    SubLObject old_edge = NIL;
                                    old_edge = csome_list_var.first();
                                    while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var)) {
                                        if (NIL != psp_chart.psp_do_edge_okP(old_edge, $ANY, NIL)) {
                                            final SubLObject var;
                                            final SubLObject new_edge = var = psp_extend_old_edge(old_edge, edge);
                                            if (NIL != var) {
                                                new_edges = cons(var, new_edges);
                                            }
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        old_edge = csome_list_var.first();
                                    } 
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                        }

                } else
                    if (NIL != interval_span.interval_span_p(span)) {
                        final SubLObject pcase_var = $ANY;
                        if (pcase_var.eql($ANY)) {
                            if (NIL == stop_working_on_spanP) {
                                SubLObject csome_list_var2 = psp_chart.psp_edges_with_span(span, chart_to_use_$12);
                                SubLObject old_edge2 = NIL;
                                old_edge2 = csome_list_var2.first();
                                while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var2)) {
                                    if (NIL != psp_chart.psp_do_edge_okP(old_edge2, $ANY, NIL)) {
                                        final SubLObject var2;
                                        final SubLObject new_edge2 = var2 = psp_extend_old_edge(old_edge2, edge);
                                        if (NIL != var2) {
                                            new_edges = cons(var2, new_edges);
                                        }
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    old_edge2 = csome_list_var2.first();
                                } 
                            }
                        } else
                            if (pcase_var.eql($LEXICAL) && (NIL == stop_working_on_spanP)) {
                                SubLObject csome_list_var2 = psp_chart.psp_lexical_edges_with_span(span, chart_to_use_$12);
                                SubLObject old_edge2 = NIL;
                                old_edge2 = csome_list_var2.first();
                                while ((NIL == stop_working_on_spanP) && (NIL != csome_list_var2)) {
                                    if (NIL != psp_chart.psp_do_edge_okP(old_edge2, $ANY, NIL)) {
                                        final SubLObject var2;
                                        final SubLObject new_edge2 = var2 = psp_extend_old_edge(old_edge2, edge);
                                        if (NIL != var2) {
                                            new_edges = cons(var2, new_edges);
                                        }
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    old_edge2 = csome_list_var2.first();
                                } 
                            }

                    }

            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && (NIL != new_edges)) {
            format(T, $str14$__Found_new_edges_continued_by__S, edge, new_edges);
        }
        return new_edges;
    }

    /**
     * Try to extend OLD-EDGE by using EDGE (or a gap) as the next daughter.
     *
     * @return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL.
     */
    @LispMethod(comment = "Try to extend OLD-EDGE by using EDGE (or a gap) as the next daughter.\r\n\r\n@return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL.")
    public static final SubLObject psp_extend_old_edge_alt(SubLObject old_edge, SubLObject edge) {
        if (edge == UNPROVIDED) {
            edge = $GAP;
        }
        {
            SubLObject new_edge = NIL;
            if (NIL == psp_chart.psp_completed_edgeP(old_edge)) {
                {
                    SubLObject constraints = psp_chart.psp_edge_next_dtr_constraints(old_edge);
                    SubLObject old_edge_rule_fort = psp_chart.psp_edge_rule_fort(old_edge);
                    SubLObject traced_rule_fort = (NIL != psp_rules.psp_traced_ruleP(old_edge_rule_fort)) ? ((SubLObject) (old_edge_rule_fort)) : NIL;
                    if (NIL != psp_rules.psp_edge_meets_syntax_constraintsP(edge, constraints, old_edge, traced_rule_fort)) {
                        if (NIL != traced_rule_fort) {
                            format(T, $str_alt17$___S___meets_next_dtr_constraints, edge);
                        }
                        if (edge == $GAP) {
                            edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), psp_chart.psp_allowed_gap_category());
                        }
                        new_edge = com.cyc.cycjava.cycl.psp_syntax.do_psp_extend_old_edge(old_edge, edge);
                        if (NIL != psp_chart.psp_preposition_gap_edge_p(edge)) {
                            if (NIL != psp_rules.psp_constraints_require_phraseP(constraints)) {
                                {
                                    SubLObject pp_gap_edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), $$PrepositionalPhrase);
                                    SubLObject np_gap_edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), $$NounPhrase);
                                    psp_chart.set_psp_edge_rule(pp_gap_edge, psp_rules.psp_rule_struct_for_rule_fort($$PSRule_PP));
                                    psp_chart.set_psp_edge_head_dtr(pp_gap_edge, edge);
                                    psp_chart.set_psp_edge_non_head_dtrs(pp_gap_edge, list(np_gap_edge));
                                    new_edge = com.cyc.cycjava.cycl.psp_syntax.do_psp_extend_old_edge(old_edge, pp_gap_edge);
                                }
                            } else {
                                {
                                    SubLObject np_gap_edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), $$NounPhrase);
                                    new_edge = com.cyc.cycjava.cycl.psp_syntax.do_psp_extend_old_edge(new_edge, np_gap_edge);
                                }
                            }
                        }
                        if (NIL != traced_rule_fort) {
                            format(T, $str_alt21$__Continued__S_with____S_to_form_, new SubLObject[]{ old_edge, edge, new_edge, psp_chart.get_psp_edge_head_dtr(new_edge) });
                        }
                    }
                }
            }
            return new_edge;
        }
    }

    @LispMethod(comment = "Try to extend OLD-EDGE by using EDGE (or a gap) as the next daughter.\r\n\r\n@return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL.")
    public static SubLObject psp_extend_old_edge(final SubLObject old_edge, SubLObject edge) {
        if (edge == UNPROVIDED) {
            edge = $GAP;
        }
        SubLObject new_edge = NIL;
        if (NIL == psp_chart.psp_completed_edgeP(old_edge)) {
            final SubLObject constraints = psp_chart.psp_edge_next_dtr_constraints(old_edge);
            final SubLObject old_edge_rule_fort = psp_chart.psp_edge_rule_fort(old_edge);
            final SubLObject traced_rule_fort = (NIL != psp_rules.psp_traced_ruleP(old_edge_rule_fort)) ? old_edge_rule_fort : NIL;
            if (NIL != psp_rules.psp_edge_meets_syntax_constraintsP(edge, constraints, old_edge, traced_rule_fort)) {
                if (NIL != traced_rule_fort) {
                    format(T, $str16$___S___meets_next_dtr_constraints, edge);
                }
                if (edge == $GAP) {
                    edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), psp_chart.psp_allowed_gap_category());
                }
                new_edge = do_psp_extend_old_edge(old_edge, edge);
                if (NIL != psp_chart.psp_preposition_gap_edge_p(edge)) {
                    if (NIL != psp_rules.psp_constraints_require_phraseP(constraints)) {
                        final SubLObject pp_gap_edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), $$PrepositionalPhrase);
                        final SubLObject np_gap_edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), $$NounPhrase);
                        psp_chart.set_psp_edge_rule(pp_gap_edge, psp_rules.psp_rule_struct_for_rule_fort($$PSRule_PP));
                        psp_chart.set_psp_edge_head_dtr(pp_gap_edge, edge);
                        psp_chart.set_psp_edge_non_head_dtrs(pp_gap_edge, list(np_gap_edge));
                        new_edge = do_psp_extend_old_edge(old_edge, pp_gap_edge);
                    } else {
                        final SubLObject np_gap_edge2 = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), $$NounPhrase);
                        new_edge = do_psp_extend_old_edge(new_edge, np_gap_edge2);
                    }
                }
                if (NIL != traced_rule_fort) {
                    format(T, $str20$__Continued__S_with____S_to_form_, new SubLObject[]{ old_edge, edge, new_edge, psp_chart.get_psp_edge_head_dtr(new_edge) });
                }
            }
        }
        return new_edge;
    }/**
     * Try to extend OLD-EDGE by using EDGE (or a gap) as the next daughter.
     *
     * @return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL.
     */


    public static final SubLObject do_psp_extend_old_edge_alt(SubLObject old_edge, SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_string = NIL;
                SubLObject new_span = interval_span.get_interval_span(interval_span.interval_span_start(psp_chart.get_psp_edge_span(old_edge)), interval_span.interval_span_end(psp_chart.get_psp_edge_span(edge)));
                SubLObject category = psp_chart.get_psp_edge_category(old_edge);
                SubLObject new_dtr_num = number_utilities.f_1X(psp_chart.psp_edge_dtr_count(old_edge));
                SubLObject rule = psp_chart.psp_edge_rule_struct(old_edge);
                SubLObject new_dtr_is_headP = eql(psp_rules.psp_rule_head(rule), new_dtr_num);
                SubLObject pos_pred = (NIL != new_dtr_is_headP) ? ((SubLObject) (psp_chart.get_psp_edge_pos_pred(edge))) : psp_chart.get_psp_edge_pos_pred(old_edge);
                SubLObject cycls = $NEW;
                SubLObject new_dtr_constraints = psp_chart.psp_edge_later_dtr_constraints(old_edge);
                SubLObject head_dtr = (NIL != new_dtr_is_headP) ? ((SubLObject) (edge)) : psp_chart.get_psp_edge_head_dtr(old_edge);
                SubLObject non_head_dtrs = (NIL != new_dtr_is_headP) ? ((SubLObject) (psp_chart.get_psp_edge_non_head_dtrs(old_edge))) : list_utilities.snoc(edge, psp_chart.get_psp_edge_non_head_dtrs(old_edge));
                SubLObject weight = NIL;
                SubLObject new_edge = psp_chart.new_psp_phrasal_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), new_span, new_string, category, pos_pred, cycls, weight, rule, new_dtr_constraints, head_dtr, non_head_dtrs);
                return new_edge;
            }
        }
    }

    public static SubLObject do_psp_extend_old_edge(final SubLObject old_edge, final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_string = NIL;
        final SubLObject new_span = interval_span.get_interval_span(interval_span.interval_span_start(psp_chart.get_psp_edge_span(old_edge)), interval_span.interval_span_end(psp_chart.get_psp_edge_span(edge)));
        final SubLObject category = psp_chart.get_psp_edge_category(old_edge);
        final SubLObject new_dtr_num = number_utilities.f_1X(psp_chart.psp_edge_dtr_count(old_edge));
        final SubLObject rule = psp_chart.psp_edge_rule_struct(old_edge);
        final SubLObject new_dtr_is_headP = eql(psp_rules.psp_rule_head(rule), new_dtr_num);
        final SubLObject pos_pred = (NIL != new_dtr_is_headP) ? psp_chart.get_psp_edge_pos_pred(edge) : psp_chart.get_psp_edge_pos_pred(old_edge);
        final SubLObject cycls = $NEW;
        final SubLObject new_dtr_constraints = psp_chart.psp_edge_later_dtr_constraints(old_edge);
        final SubLObject head_dtr = (NIL != new_dtr_is_headP) ? edge : psp_chart.get_psp_edge_head_dtr(old_edge);
        final SubLObject non_head_dtrs = (NIL != new_dtr_is_headP) ? psp_chart.get_psp_edge_non_head_dtrs(old_edge) : list_utilities.snoc(edge, psp_chart.get_psp_edge_non_head_dtrs(old_edge));
        final SubLObject weight = NIL;
        final SubLObject new_edge = psp_chart.new_psp_phrasal_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), new_span, new_string, category, pos_pred, cycls, weight, rule, new_dtr_constraints, head_dtr, non_head_dtrs);
        return new_edge;
    }

    public static SubLObject declare_psp_syntax_file() {
        declareFunction("psp_chart_for_string", "PSP-CHART-FOR-STRING", 1, 3, false);
        declareFunction("psp_chart_do_syntactic_parsing", "PSP-CHART-DO-SYNTACTIC-PARSING", 0, 3, false);
        declareFunction("psp_process_edges", "PSP-PROCESS-EDGES", 1, 0, false);
        declareFunction("psp_process_new_edges_from_edge", "PSP-PROCESS-NEW-EDGES-FROM-EDGE", 1, 0, false);
        declareFunction("psp_new_edges_from_edge", "PSP-NEW-EDGES-FROM-EDGE", 1, 0, false);
        declareFunction("psp_new_edges_from_gaps", "PSP-NEW-EDGES-FROM-GAPS", 1, 0, false);
        declareFunction("psp_new_edges_from_rules", "PSP-NEW-EDGES-FROM-RULES", 1, 0, false);
        declareFunction("find_psp_edge_with_properties", "FIND-PSP-EDGE-WITH-PROPERTIES", 3, 1, false);
        declareFunction("psp_adjacent_spansP", "PSP-ADJACENT-SPANS?", 2, 0, false);
        declareFunction("psp_new_edges_from_edges", "PSP-NEW-EDGES-FROM-EDGES", 1, 0, false);
        declareFunction("psp_extend_old_edge", "PSP-EXTEND-OLD-EDGE", 1, 1, false);
        declareFunction("do_psp_extend_old_edge", "DO-PSP-EXTEND-OLD-EDGE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_psp_syntax_file() {
        return NIL;
    }

    public static SubLObject setup_psp_syntax_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_psp_syntax_file();
    }

    @Override
    public void initializeVariables() {
        init_psp_syntax_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_psp_syntax_file();
    }

    static {
    }

    static private final SubLString $str_alt4$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym5$INTERVAL_SPAN_PRECEDES_ = makeSymbol("INTERVAL-SPAN-PRECEDES?");

    static private final SubLString $str_alt6$__Doing_lexical_span__S___ = makeString("~&Doing lexical span ~S.~%");

    static private final SubLString $str_alt10$___Edges_so_far___S__Completed___ = makeString("~& Edges so far: ~S. Completed: ~S Non-trivial: ~S~%");

    static private final SubLString $str_alt14$__Found_new_edges_starting_with__ = makeString("~&Found new edges starting with ~S:~% ~S.~%");

    static private final SubLString $str_alt15$__Found_new_edges_continued_by__S = makeString("~&Found new edges continued by ~S:~% ~S.~%");

    static private final SubLString $str_alt17$___S___meets_next_dtr_constraints = makeString("~&~S~% meets next-dtr constraints.~%");

    static private final SubLString $str_alt21$__Continued__S_with____S_to_form_ = makeString("~&Continued ~S with~% ~S to form~% ~S, whose head is~% ~S.~%");
}

/**
 * Total time: 346 ms
 */
