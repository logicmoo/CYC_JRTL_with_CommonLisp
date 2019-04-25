package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_syntax extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.psp_syntax";
    public static final String myFingerPrint = "829b64ce7fdd428881b1f9422e1f8100af391d7d49b2cc2f4ad28f7e0a53269d";
    private static final SubLSymbol $kw0$NONE;
    private static final SubLSymbol $sym1$STRINGP;
    private static final SubLSymbol $sym2$PSP_LEXICON_P;
    private static final SubLSymbol $sym3$PSP_GAP_CONSTRAINT_P;
    private static final SubLSymbol $sym4$INTERVAL_SPAN_PRECEDES_;
    private static final SubLString $str5$__Doing_lexical_span__S___;
    private static final SubLSymbol $sym6$PHRASE_STRUCTURE_PARSER_CHART_P;
    private static final SubLSymbol $kw7$ANY;
    private static final SubLSymbol $kw8$LEXICAL;
    private static final SubLString $str9$___Edges_so_far___S__Completed___;
    private static final SubLSymbol $kw10$ABORTED;
    private static final SubLSymbol $kw11$PROCESSED;
    private static final SubLSymbol $kw12$NEW;
    private static final SubLString $str13$__Found_new_edges_starting_with__;
    private static final SubLString $str14$__Found_new_edges_continued_by__S;
    private static final SubLSymbol $kw15$GAP;
    private static final SubLString $str16$___S___meets_next_dtr_constraints;
    private static final SubLObject $const17$PrepositionalPhrase;
    private static final SubLObject $const18$NounPhrase;
    private static final SubLObject $const19$PSRule_PP;
    private static final SubLString $str20$__Continued__S_with____S_to_form_;
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 888L)
    public static SubLObject psp_chart_for_string(final SubLObject input_string, SubLObject lexicon, SubLObject gap_type, SubLObject do_syntactic_parsingP) {
        if (lexicon == psp_syntax.UNPROVIDED) {
            lexicon = psp_lexicon.get_default_psp_lexicon((SubLObject)psp_syntax.UNPROVIDED, (SubLObject)psp_syntax.UNPROVIDED, (SubLObject)psp_syntax.UNPROVIDED);
        }
        if (gap_type == psp_syntax.UNPROVIDED) {
            gap_type = (SubLObject)psp_syntax.$kw0$NONE;
        }
        if (do_syntactic_parsingP == psp_syntax.UNPROVIDED) {
            do_syntactic_parsingP = (SubLObject)psp_syntax.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert psp_syntax.NIL != Types.stringp(input_string) : input_string;
        assert psp_syntax.NIL != psp_lexicon.psp_lexicon_p(lexicon) : lexicon;
        assert psp_syntax.NIL != psp_chart.psp_gap_constraint_p(gap_type) : gap_type;
        final SubLObject chart = psp_chart.new_psp_chart((SubLObject)psp_syntax.UNPROVIDED, (SubLObject)psp_syntax.UNPROVIDED);
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
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)psp_syntax.T, thread);
                psp_rules.psp_check_initializations();
                final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
                final SubLObject _prev_bind_0_$2 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        psp_chart.initialize_psp_chart(input_string, chart, lexicon, gap_type);
                        if (psp_syntax.NIL != do_syntactic_parsingP) {
                            psp_chart_do_syntactic_parsing(chart, (SubLObject)psp_syntax.UNPROVIDED, (SubLObject)psp_syntax.UNPROVIDED);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_syntax.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$2, thread);
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            parsing_vars.$psp_lexicon$.rebind(_prev_bind_0, thread);
        }
        return chart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 1796L)
    public static SubLObject psp_chart_do_syntactic_parsing(SubLObject chart, SubLObject start, SubLObject end) {
        if (chart == psp_syntax.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        if (start == psp_syntax.UNPROVIDED) {
            start = parsing_vars.$psp_chart_start_index$.getDynamicValue();
        }
        if (end == psp_syntax.UNPROVIDED) {
            end = parsing_vars.$psp_chart_end_index$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sorted_spans = Sort.sort(psp_chart.psp_chart_spans(chart, start, end), (SubLObject)psp_syntax.$sym4$INTERVAL_SPAN_PRECEDES_, (SubLObject)psp_syntax.UNPROVIDED);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_chart$.currentBinding(thread);
        try {
            parsing_vars.$psp_chart$.bind(chart, thread);
            final SubLObject report_progressP = (SubLObject)psp_syntax.NIL;
            SubLObject stop_working_on_chartP = parsing_macros.parsing_timeout_time_reachedP();
            final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
            final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (psp_syntax.NIL == stop_working_on_chartP) {
                        SubLObject csome_list_var = sorted_spans;
                        SubLObject span = (SubLObject)psp_syntax.NIL;
                        span = csome_list_var.first();
                        while (psp_syntax.NIL == stop_working_on_chartP && psp_syntax.NIL != csome_list_var) {
                            SubLObject stop_working_on_spanP = (SubLObject)psp_syntax.NIL;
                            final SubLObject report_spanP = (SubLObject)SubLObjectFactory.makeBoolean(psp_syntax.NIL != report_progressP && psp_syntax.NIL != psp_chart.psp_span_has_edges_p(span, (SubLObject)psp_syntax.UNPROVIDED));
                            if (psp_syntax.NIL != report_spanP) {
                                PrintLow.format((SubLObject)psp_syntax.T, (SubLObject)psp_syntax.$str5$__Doing_lexical_span__S___, span);
                            }
                            final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                            assert psp_syntax.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) : chart_to_use;
                            if (span == psp_syntax.$kw7$ANY) {
                                final SubLObject pcase_var = (SubLObject)psp_syntax.$kw8$LEXICAL;
                                if (pcase_var.eql((SubLObject)psp_syntax.$kw7$ANY)) {
                                    final SubLObject chart_to_use_$5 = (psp_syntax.NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                    assert psp_syntax.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$5) : chart_to_use_$5;
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$5))); psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject value = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (psp_syntax.NIL == stop_working_on_spanP) {
                                            SubLObject csome_list_var_$6 = psp_chart.psp_edges_with_span(span_to_do, chart_to_use);
                                            SubLObject lexical_edge = (SubLObject)psp_syntax.NIL;
                                            lexical_edge = csome_list_var_$6.first();
                                            while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var_$6) {
                                                if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(lexical_edge, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.T)) {
                                                    if (psp_syntax.NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                        stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else if (psp_syntax.NIL != psp_chart.psp_lexical_span_parsedP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else if (psp_syntax.NIL != psp_chart.psp_span_too_many_edgesP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else if (psp_syntax.NIL != psp_chart.psp_chart_too_many_edgesP((SubLObject)psp_syntax.UNPROVIDED)) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                        stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else {
                                                        psp_process_new_edges_from_edge(lexical_edge);
                                                    }
                                                }
                                                csome_list_var_$6 = csome_list_var_$6.rest();
                                                lexical_edge = csome_list_var_$6.first();
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                                else if (pcase_var.eql((SubLObject)psp_syntax.$kw8$LEXICAL)) {
                                    final SubLObject chart_to_use_$6 = (psp_syntax.NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                    assert psp_syntax.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$6) : chart_to_use_$6;
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$6))); psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject value = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (psp_syntax.NIL == stop_working_on_spanP) {
                                            SubLObject csome_list_var_$7 = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use);
                                            SubLObject lexical_edge = (SubLObject)psp_syntax.NIL;
                                            lexical_edge = csome_list_var_$7.first();
                                            while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var_$7) {
                                                if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(lexical_edge, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.T)) {
                                                    if (psp_syntax.NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                        stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else if (psp_syntax.NIL != psp_chart.psp_lexical_span_parsedP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else if (psp_syntax.NIL != psp_chart.psp_span_too_many_edgesP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else if (psp_syntax.NIL != psp_chart.psp_chart_too_many_edgesP((SubLObject)psp_syntax.UNPROVIDED)) {
                                                        stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                        stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                                    }
                                                    else {
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
                            }
                            else if (psp_syntax.NIL != interval_span.interval_span_p(span)) {
                                final SubLObject pcase_var = (SubLObject)psp_syntax.$kw8$LEXICAL;
                                if (pcase_var.eql((SubLObject)psp_syntax.$kw7$ANY)) {
                                    if (psp_syntax.NIL == stop_working_on_spanP) {
                                        SubLObject csome_list_var_$8 = psp_chart.psp_edges_with_span(span, chart_to_use);
                                        SubLObject lexical_edge2 = (SubLObject)psp_syntax.NIL;
                                        lexical_edge2 = csome_list_var_$8.first();
                                        while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var_$8) {
                                            if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(lexical_edge2, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.T)) {
                                                if (psp_syntax.NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                    stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                    stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                                }
                                                else if (psp_syntax.NIL != psp_chart.psp_lexical_span_parsedP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                    stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                }
                                                else if (psp_syntax.NIL != psp_chart.psp_span_too_many_edgesP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                    stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                }
                                                else if (psp_syntax.NIL != psp_chart.psp_chart_too_many_edgesP((SubLObject)psp_syntax.UNPROVIDED)) {
                                                    stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                    stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                                }
                                                else {
                                                    psp_process_new_edges_from_edge(lexical_edge2);
                                                }
                                            }
                                            csome_list_var_$8 = csome_list_var_$8.rest();
                                            lexical_edge2 = csome_list_var_$8.first();
                                        }
                                    }
                                }
                                else if (pcase_var.eql((SubLObject)psp_syntax.$kw8$LEXICAL) && psp_syntax.NIL == stop_working_on_spanP) {
                                    SubLObject csome_list_var_$9 = psp_chart.psp_lexical_edges_with_span(span, chart_to_use);
                                    SubLObject lexical_edge2 = (SubLObject)psp_syntax.NIL;
                                    lexical_edge2 = csome_list_var_$9.first();
                                    while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var_$9) {
                                        if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(lexical_edge2, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.T)) {
                                            if (psp_syntax.NIL != parsing_macros.parsing_timeout_time_reachedP()) {
                                                stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                            }
                                            else if (psp_syntax.NIL != psp_chart.psp_lexical_span_parsedP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                            }
                                            else if (psp_syntax.NIL != psp_chart.psp_span_too_many_edgesP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
                                                stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                            }
                                            else if (psp_syntax.NIL != psp_chart.psp_chart_too_many_edgesP((SubLObject)psp_syntax.UNPROVIDED)) {
                                                stop_working_on_spanP = (SubLObject)psp_syntax.T;
                                                stop_working_on_chartP = (SubLObject)psp_syntax.T;
                                            }
                                            else {
                                                psp_process_new_edges_from_edge(lexical_edge2);
                                            }
                                        }
                                        csome_list_var_$9 = csome_list_var_$9.rest();
                                        lexical_edge2 = csome_list_var_$9.first();
                                    }
                                }
                            }
                            if (psp_syntax.NIL == stop_working_on_spanP) {
                                psp_chart.note_psp_lexical_span_parsed(span, (SubLObject)psp_syntax.UNPROVIDED);
                            }
                            if (psp_syntax.NIL != report_spanP) {
                                PrintLow.format((SubLObject)psp_syntax.T, (SubLObject)psp_syntax.$str9$___Edges_so_far___S__Completed___, new SubLObject[] { psp_chart.psp_edge_count((SubLObject)psp_syntax.UNPROVIDED), Sequences.length(psp_chart.psp_all_complete_edges((SubLObject)psp_syntax.NIL)), Sequences.length(psp_chart.psp_all_complete_edges((SubLObject)psp_syntax.T)) });
                            }
                            csome_list_var = csome_list_var.rest();
                            span = csome_list_var.first();
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_syntax.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            parsing_vars.$psp_chart$.rebind(_prev_bind_0, thread);
        }
        return chart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 3412L)
    public static SubLObject psp_process_edges(final SubLObject edges) {
        SubLObject stopP = psp_chart.psp_chart_too_many_edgesP((SubLObject)psp_syntax.UNPROVIDED);
        if (psp_syntax.NIL == stopP) {
            SubLObject csome_list_var;
            SubLObject edge;
            for (csome_list_var = edges, edge = (SubLObject)psp_syntax.NIL, edge = csome_list_var.first(); psp_syntax.NIL == stopP && psp_syntax.NIL != csome_list_var; stopP = (SubLObject)SubLObjectFactory.makeBoolean(psp_syntax.$kw10$ABORTED == psp_process_new_edges_from_edge(edge) || psp_syntax.NIL != parsing_macros.parsing_timeout_time_reachedP() || psp_syntax.NIL != psp_chart.psp_chart_too_many_edgesP((SubLObject)psp_syntax.UNPROVIDED) || psp_syntax.NIL != psp_chart.psp_span_too_many_edgesP(psp_chart.get_psp_edge_span(edge), (SubLObject)psp_syntax.UNPROVIDED)), csome_list_var = csome_list_var.rest(), edge = csome_list_var.first()) {
                psp_chart.psp_chart_add_edge(edge, (SubLObject)psp_syntax.UNPROVIDED);
            }
        }
        return (SubLObject)((psp_syntax.NIL != stopP) ? psp_syntax.$kw10$ABORTED : psp_syntax.$kw11$PROCESSED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 3844L)
    public static SubLObject psp_process_new_edges_from_edge(final SubLObject edge) {
        return psp_process_edges(psp_new_edges_from_edge(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 4017L)
    public static SubLObject psp_new_edges_from_edge(final SubLObject edge) {
        if (psp_syntax.NIL != psp_chart.psp_incomplete_edgeP(edge)) {
            return psp_new_edges_from_gaps(edge);
        }
        return ConsesLow.append(psp_new_edges_from_rules(edge), psp_new_edges_from_edges(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 4301L)
    public static SubLObject psp_new_edges_from_gaps(final SubLObject edge) {
        if (psp_syntax.NIL == psp_chart.psp_gap_allowedP()) {
            return (SubLObject)psp_syntax.NIL;
        }
        if (psp_syntax.NIL != psp_chart.psp_edge_already_has_gapP(edge)) {
            return (SubLObject)psp_syntax.NIL;
        }
        final SubLObject new_edge = psp_extend_old_edge(edge, (SubLObject)psp_syntax.UNPROVIDED);
        return (SubLObject)((psp_syntax.NIL != new_edge) ? ConsesLow.list(new_edge) : psp_syntax.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 4619L)
    public static SubLObject psp_new_edges_from_rules(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_edges = (SubLObject)psp_syntax.NIL;
        final SubLObject string = psp_chart.get_psp_edge_string(edge);
        final SubLObject span = psp_chart.get_psp_edge_span(edge);
        final SubLObject frame = psp_chart.get_psp_edge_frame(edge);
        final SubLObject rules = psp_rules.psp_rules_starting_with_edge(edge, (SubLObject)psp_syntax.UNPROVIDED);
        if (psp_syntax.NIL == psp_chart.psp_span_too_many_edgesP(span, (SubLObject)psp_syntax.UNPROVIDED)) {
            SubLObject cdolist_list_var = rules;
            SubLObject rule = (SubLObject)psp_syntax.NIL;
            rule = cdolist_list_var.first();
            while (psp_syntax.NIL != cdolist_list_var) {
                final SubLObject category = psp_rules.psp_rule_category(rule);
                final SubLObject new_dtr_is_headP = Equality.eql(psp_rules.psp_rule_head(rule), (SubLObject)psp_syntax.ONE_INTEGER);
                final SubLObject pos_pred = (SubLObject)((psp_syntax.NIL != new_dtr_is_headP) ? psp_chart.get_psp_edge_pos_pred(edge) : psp_syntax.NIL);
                final SubLObject cycls = (SubLObject)psp_syntax.$kw12$NEW;
                final SubLObject new_dtr_constraints = psp_rules.psp_rule_new_dtr_constraints(rule, frame);
                final SubLObject head_dtr = (SubLObject)((psp_syntax.NIL != new_dtr_is_headP) ? edge : psp_syntax.NIL);
                final SubLObject non_head_dtrs = (SubLObject)((psp_syntax.NIL != new_dtr_is_headP) ? psp_syntax.NIL : ConsesLow.list(edge));
                final SubLObject weight = (SubLObject)psp_syntax.NIL;
                final SubLObject new_edge = psp_chart.new_psp_phrasal_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, string, category, pos_pred, cycls, weight, rule, new_dtr_constraints, head_dtr, non_head_dtrs);
                new_edges = (SubLObject)ConsesLow.cons(new_edge, new_edges);
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        }
        if (psp_syntax.NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread) && psp_syntax.NIL != new_edges) {
            PrintLow.format((SubLObject)psp_syntax.T, (SubLObject)psp_syntax.$str13$__Found_new_edges_starting_with__, edge, new_edges);
        }
        return new_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 5808L)
    public static SubLObject find_psp_edge_with_properties(final SubLObject span, final SubLObject pos_pred, final SubLObject rule, SubLObject chart) {
        if (chart == psp_syntax.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        SubLObject found = (SubLObject)psp_syntax.NIL;
        if (psp_syntax.NIL == found) {
            SubLObject csome_list_var = psp_chart.psp_edges_with_span(span, chart);
            SubLObject edge = (SubLObject)psp_syntax.NIL;
            edge = csome_list_var.first();
            while (psp_syntax.NIL == found && psp_syntax.NIL != csome_list_var) {
                if (psp_chart.get_psp_edge_rule(edge).eql(rule) && psp_chart.get_psp_edge_pos_pred(edge).eql(pos_pred)) {
                    found = edge;
                }
                csome_list_var = csome_list_var.rest();
                edge = csome_list_var.first();
            }
        }
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 6130L)
    public static SubLObject psp_adjacent_spansP(final SubLObject span1, final SubLObject span2) {
        return Equality.eql(interval_span.interval_span_end(span1), interval_span.interval_span_start(span2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 6255L)
    public static SubLObject psp_new_edges_from_edges(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_edges = (SubLObject)psp_syntax.NIL;
        final SubLObject stop_working_on_edgeP = psp_chart.psp_chart_too_many_edgesP((SubLObject)psp_syntax.UNPROVIDED);
        final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
        assert psp_syntax.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) : chart_to_use;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use))); psp_syntax.NIL == stop_working_on_edgeP && psp_syntax.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (psp_syntax.NIL != psp_adjacent_spansP(span, psp_chart.get_psp_edge_span(edge))) {
                final SubLObject stop_working_on_spanP = psp_chart.psp_span_too_many_edgesP(span, (SubLObject)psp_syntax.UNPROVIDED);
                final SubLObject chart_to_use_$12 = parsing_vars.$psp_chart$.getDynamicValue(thread);
                assert psp_syntax.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$12) : chart_to_use_$12;
                if (span == psp_syntax.$kw7$ANY) {
                    final SubLObject pcase_var = (SubLObject)psp_syntax.$kw7$ANY;
                    if (pcase_var.eql((SubLObject)psp_syntax.$kw7$ANY)) {
                        final SubLObject chart_to_use_$13 = (psp_syntax.NIL != chart_to_use_$12) ? chart_to_use_$12 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                        assert psp_syntax.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$13) : chart_to_use_$13;
                        SubLObject iteration_state_$14;
                        for (iteration_state_$14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$13))); psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$14); iteration_state_$14 = dictionary_contents.do_dictionary_contents_next(iteration_state_$14)) {
                            thread.resetMultipleValues();
                            final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$14);
                            final SubLObject value_$15 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (psp_syntax.NIL == stop_working_on_spanP) {
                                SubLObject csome_list_var = psp_chart.psp_edges_with_span(span_to_do, chart_to_use_$12);
                                SubLObject old_edge = (SubLObject)psp_syntax.NIL;
                                old_edge = csome_list_var.first();
                                while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var) {
                                    if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(old_edge, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.NIL)) {
                                        final SubLObject var;
                                        final SubLObject new_edge = var = psp_extend_old_edge(old_edge, edge);
                                        if (psp_syntax.NIL != var) {
                                            new_edges = (SubLObject)ConsesLow.cons(var, new_edges);
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    old_edge = csome_list_var.first();
                                }
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$14);
                    }
                    else if (pcase_var.eql((SubLObject)psp_syntax.$kw8$LEXICAL)) {
                        final SubLObject chart_to_use_$14 = (psp_syntax.NIL != chart_to_use_$12) ? chart_to_use_$12 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                        assert psp_syntax.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$14) : chart_to_use_$14;
                        SubLObject iteration_state_$15;
                        for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$14))); psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                            thread.resetMultipleValues();
                            final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                            final SubLObject value_$16 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (psp_syntax.NIL == stop_working_on_spanP) {
                                SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use_$12);
                                SubLObject old_edge = (SubLObject)psp_syntax.NIL;
                                old_edge = csome_list_var.first();
                                while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var) {
                                    if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(old_edge, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.NIL)) {
                                        final SubLObject var;
                                        final SubLObject new_edge = var = psp_extend_old_edge(old_edge, edge);
                                        if (psp_syntax.NIL != var) {
                                            new_edges = (SubLObject)ConsesLow.cons(var, new_edges);
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    old_edge = csome_list_var.first();
                                }
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                    }
                }
                else if (psp_syntax.NIL != interval_span.interval_span_p(span)) {
                    final SubLObject pcase_var = (SubLObject)psp_syntax.$kw7$ANY;
                    if (pcase_var.eql((SubLObject)psp_syntax.$kw7$ANY)) {
                        if (psp_syntax.NIL == stop_working_on_spanP) {
                            SubLObject csome_list_var2 = psp_chart.psp_edges_with_span(span, chart_to_use_$12);
                            SubLObject old_edge2 = (SubLObject)psp_syntax.NIL;
                            old_edge2 = csome_list_var2.first();
                            while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var2) {
                                if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(old_edge2, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.NIL)) {
                                    final SubLObject var2;
                                    final SubLObject new_edge2 = var2 = psp_extend_old_edge(old_edge2, edge);
                                    if (psp_syntax.NIL != var2) {
                                        new_edges = (SubLObject)ConsesLow.cons(var2, new_edges);
                                    }
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                old_edge2 = csome_list_var2.first();
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)psp_syntax.$kw8$LEXICAL) && psp_syntax.NIL == stop_working_on_spanP) {
                        SubLObject csome_list_var2 = psp_chart.psp_lexical_edges_with_span(span, chart_to_use_$12);
                        SubLObject old_edge2 = (SubLObject)psp_syntax.NIL;
                        old_edge2 = csome_list_var2.first();
                        while (psp_syntax.NIL == stop_working_on_spanP && psp_syntax.NIL != csome_list_var2) {
                            if (psp_syntax.NIL != psp_chart.psp_do_edge_okP(old_edge2, (SubLObject)psp_syntax.$kw7$ANY, (SubLObject)psp_syntax.NIL)) {
                                final SubLObject var2;
                                final SubLObject new_edge2 = var2 = psp_extend_old_edge(old_edge2, edge);
                                if (psp_syntax.NIL != var2) {
                                    new_edges = (SubLObject)ConsesLow.cons(var2, new_edges);
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
        if (psp_syntax.NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread) && psp_syntax.NIL != new_edges) {
            PrintLow.format((SubLObject)psp_syntax.T, (SubLObject)psp_syntax.$str14$__Found_new_edges_continued_by__S, edge, new_edges);
        }
        return new_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 7015L)
    public static SubLObject psp_extend_old_edge(final SubLObject old_edge, SubLObject edge) {
        if (edge == psp_syntax.UNPROVIDED) {
            edge = (SubLObject)psp_syntax.$kw15$GAP;
        }
        SubLObject new_edge = (SubLObject)psp_syntax.NIL;
        if (psp_syntax.NIL == psp_chart.psp_completed_edgeP(old_edge)) {
            final SubLObject constraints = psp_chart.psp_edge_next_dtr_constraints(old_edge);
            final SubLObject old_edge_rule_fort = psp_chart.psp_edge_rule_fort(old_edge);
            final SubLObject traced_rule_fort = (SubLObject)((psp_syntax.NIL != psp_rules.psp_traced_ruleP(old_edge_rule_fort)) ? old_edge_rule_fort : psp_syntax.NIL);
            if (psp_syntax.NIL != psp_rules.psp_edge_meets_syntax_constraintsP(edge, constraints, old_edge, traced_rule_fort)) {
                if (psp_syntax.NIL != traced_rule_fort) {
                    PrintLow.format((SubLObject)psp_syntax.T, (SubLObject)psp_syntax.$str16$___S___meets_next_dtr_constraints, edge);
                }
                if (edge == psp_syntax.$kw15$GAP) {
                    edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), psp_chart.psp_allowed_gap_category());
                }
                new_edge = do_psp_extend_old_edge(old_edge, edge);
                if (psp_syntax.NIL != psp_chart.psp_preposition_gap_edge_p(edge)) {
                    if (psp_syntax.NIL != psp_rules.psp_constraints_require_phraseP(constraints)) {
                        final SubLObject pp_gap_edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), psp_syntax.$const17$PrepositionalPhrase);
                        final SubLObject np_gap_edge = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), psp_syntax.$const18$NounPhrase);
                        psp_chart.set_psp_edge_rule(pp_gap_edge, psp_rules.psp_rule_struct_for_rule_fort(psp_syntax.$const19$PSRule_PP));
                        psp_chart.set_psp_edge_head_dtr(pp_gap_edge, edge);
                        psp_chart.set_psp_edge_non_head_dtrs(pp_gap_edge, (SubLObject)ConsesLow.list(np_gap_edge));
                        new_edge = do_psp_extend_old_edge(old_edge, pp_gap_edge);
                    }
                    else {
                        final SubLObject np_gap_edge2 = psp_chart.new_psp_gap_edge(psp_chart.psp_edge_end_index(old_edge), psp_syntax.$const18$NounPhrase);
                        new_edge = do_psp_extend_old_edge(new_edge, np_gap_edge2);
                    }
                }
                if (psp_syntax.NIL != traced_rule_fort) {
                    PrintLow.format((SubLObject)psp_syntax.T, (SubLObject)psp_syntax.$str20$__Continued__S_with____S_to_form_, new SubLObject[] { old_edge, edge, new_edge, psp_chart.get_psp_edge_head_dtr(new_edge) });
                }
            }
        }
        return new_edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-syntax.lisp", position = 8883L)
    public static SubLObject do_psp_extend_old_edge(final SubLObject old_edge, final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_string = (SubLObject)psp_syntax.NIL;
        final SubLObject new_span = interval_span.get_interval_span(interval_span.interval_span_start(psp_chart.get_psp_edge_span(old_edge)), interval_span.interval_span_end(psp_chart.get_psp_edge_span(edge)));
        final SubLObject category = psp_chart.get_psp_edge_category(old_edge);
        final SubLObject new_dtr_num = number_utilities.f_1X(psp_chart.psp_edge_dtr_count(old_edge));
        final SubLObject rule = psp_chart.psp_edge_rule_struct(old_edge);
        final SubLObject new_dtr_is_headP = Equality.eql(psp_rules.psp_rule_head(rule), new_dtr_num);
        final SubLObject pos_pred = (psp_syntax.NIL != new_dtr_is_headP) ? psp_chart.get_psp_edge_pos_pred(edge) : psp_chart.get_psp_edge_pos_pred(old_edge);
        final SubLObject cycls = (SubLObject)psp_syntax.$kw12$NEW;
        final SubLObject new_dtr_constraints = psp_chart.psp_edge_later_dtr_constraints(old_edge);
        final SubLObject head_dtr = (psp_syntax.NIL != new_dtr_is_headP) ? edge : psp_chart.get_psp_edge_head_dtr(old_edge);
        final SubLObject non_head_dtrs = (psp_syntax.NIL != new_dtr_is_headP) ? psp_chart.get_psp_edge_non_head_dtrs(old_edge) : list_utilities.snoc(edge, psp_chart.get_psp_edge_non_head_dtrs(old_edge));
        final SubLObject weight = (SubLObject)psp_syntax.NIL;
        final SubLObject new_edge = psp_chart.new_psp_phrasal_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), new_span, new_string, category, pos_pred, cycls, weight, rule, new_dtr_constraints, head_dtr, non_head_dtrs);
        return new_edge;
    }
    
    public static SubLObject declare_psp_syntax_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_chart_for_string", "PSP-CHART-FOR-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_chart_do_syntactic_parsing", "PSP-CHART-DO-SYNTACTIC-PARSING", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_process_edges", "PSP-PROCESS-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_process_new_edges_from_edge", "PSP-PROCESS-NEW-EDGES-FROM-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_new_edges_from_edge", "PSP-NEW-EDGES-FROM-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_new_edges_from_gaps", "PSP-NEW-EDGES-FROM-GAPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_new_edges_from_rules", "PSP-NEW-EDGES-FROM-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "find_psp_edge_with_properties", "FIND-PSP-EDGE-WITH-PROPERTIES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_adjacent_spansP", "PSP-ADJACENT-SPANS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_new_edges_from_edges", "PSP-NEW-EDGES-FROM-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "psp_extend_old_edge", "PSP-EXTEND-OLD-EDGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_syntax", "do_psp_extend_old_edge", "DO-PSP-EXTEND-OLD-EDGE", 2, 0, false);
        return (SubLObject)psp_syntax.NIL;
    }
    
    public static SubLObject init_psp_syntax_file() {
        return (SubLObject)psp_syntax.NIL;
    }
    
    public static SubLObject setup_psp_syntax_file() {
        return (SubLObject)psp_syntax.NIL;
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
        me = (SubLFile)new psp_syntax();
        $kw0$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym1$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym2$PSP_LEXICON_P = SubLObjectFactory.makeSymbol("PSP-LEXICON-P");
        $sym3$PSP_GAP_CONSTRAINT_P = SubLObjectFactory.makeSymbol("PSP-GAP-CONSTRAINT-P");
        $sym4$INTERVAL_SPAN_PRECEDES_ = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-PRECEDES?");
        $str5$__Doing_lexical_span__S___ = SubLObjectFactory.makeString("~&Doing lexical span ~S.~%");
        $sym6$PHRASE_STRUCTURE_PARSER_CHART_P = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P");
        $kw7$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw8$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $str9$___Edges_so_far___S__Completed___ = SubLObjectFactory.makeString("~& Edges so far: ~S. Completed: ~S Non-trivial: ~S~%");
        $kw10$ABORTED = SubLObjectFactory.makeKeyword("ABORTED");
        $kw11$PROCESSED = SubLObjectFactory.makeKeyword("PROCESSED");
        $kw12$NEW = SubLObjectFactory.makeKeyword("NEW");
        $str13$__Found_new_edges_starting_with__ = SubLObjectFactory.makeString("~&Found new edges starting with ~S:~% ~S.~%");
        $str14$__Found_new_edges_continued_by__S = SubLObjectFactory.makeString("~&Found new edges continued by ~S:~% ~S.~%");
        $kw15$GAP = SubLObjectFactory.makeKeyword("GAP");
        $str16$___S___meets_next_dtr_constraints = SubLObjectFactory.makeString("~&~S~% meets next-dtr constraints.~%");
        $const17$PrepositionalPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase"));
        $const18$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $const19$PSRule_PP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSRule-PP"));
        $str20$__Continued__S_with____S_to_form_ = SubLObjectFactory.makeString("~&Continued ~S with~% ~S to form~% ~S, whose head is~% ~S.~%");
    }
}

/*

	Total time: 346 ms
	
*/