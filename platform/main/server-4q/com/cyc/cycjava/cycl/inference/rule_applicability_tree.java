package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rule_applicability_tree extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new rule_applicability_tree();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.rule_applicability_tree";




    private static final SubLSymbol $RULE_BINDING_VALUE_MAP = makeKeyword("RULE-BINDING-VALUE-MAP");

    private static final SubLSymbol $sym1$_ = makeSymbol("=");

    private static final SubLSymbol DICTIONARY_LENGTH = makeSymbol("DICTIONARY-LENGTH");

    private static final SubLSymbol $sym3$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    private static final SubLSymbol KCT_TEST_RUN_QUERY_RUN = makeSymbol("KCT-TEST-RUN-QUERY-RUN");

    private static final SubLString $str5$Saving_rule_variable_map_data_fil = makeString("Saving rule variable map data files");



    private static final SubLList $list7 = list(makeSymbol("RULE"), makeSymbol("TUPLES"));

    private static final SubLString $str8$rule_ = makeString("rule-");

    private static final SubLString $str9$_tuples_txt = makeString("-tuples.txt");



    private static final SubLString $str11$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLString $str13$__file____S = makeString("~%file : ~S");

    private static final SubLString $str14$___A = makeString("~%~A");

    private static final SubLString $str15$___rule_ = makeString("~%<rule>");

    private static final SubLString $str16$____rule_ = makeString("~%</rule>");

    private static final SubLString $str17$___S = makeString("~%~S");



    private static final SubLString $str19$_ = makeString("(");

    private static final SubLString $str20$______ = makeString(" #||# ");

    private static final SubLString $str21$_ = makeString(")");



    private static final SubLString $$$Reading_rule_applicability_trees = makeString("Reading rule applicability trees");

    private static final SubLString $$$cdolist = makeString("cdolist");





    private static final SubLString $str27$file__A____A__ = makeString("file ~A:~%~A~%");



    private static final SubLString $str29$_________ = makeString("_________");

    private static final SubLString $str30$unexpected_form___S = makeString("unexpected form: ~S");

    private static final SubLList $list31 = list(makeKeyword("AND"), makeKeyword("OR"));

    private static final SubLList $list32 = list(makeSymbol("OPERATOR"), makeSymbol("SUBTREES"));

    private static final SubLList $list33 = list(makeSymbol("VARIABLE"), makeSymbol("TERM"), makeSymbol("N1"), makeSymbol("N2"), makeSymbol("N3"), makeSymbol("&OPTIONAL"), makeSymbol("SUBTREE"));

    private static final SubLSymbol $rule_applicability_tree_map$ = makeSymbol("*RULE-APPLICABILITY-TREE-MAP*");



    private static final SubLFloat $float$0_5 = makeDouble(0.5);



    private static final SubLList $list38 = list(makeSymbol("VARIABLE"), makeSymbol("CONSTRAINT"), makeSymbol("SUCCESS"), makeSymbol("FAILURE"), makeSymbol("TOTAL"));

    private static final SubLSymbol GENERALIZED_TRANSFORMATION_LINK_P = makeSymbol("GENERALIZED-TRANSFORMATION-LINK-P");

    private static final SubLString $str40$unexpected_link____S = makeString("unexpected link : ~S");

    private static final SubLSymbol TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");

    private static final SubLSymbol RESIDUAL_TRANSFORMATION_LINK_P = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-P");

    private static final SubLSymbol TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED = makeSymbol("TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED");

    private static final SubLSymbol $sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED");

    private static final SubLList $list45 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLSymbol $sym46$TERM__ = makeSymbol("TERM-<");



    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLList $list49 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    public static SubLObject kbq_extract_collated_rule_variable_bindings_map(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject metric_values = delete(NIL, kbq_query_run.kbq_extract_metric_values(query_set_run, $RULE_BINDING_VALUE_MAP, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject rule_variable_maps = delete(ZERO_INTEGER, metric_values, symbol_function($sym1$_), symbol_function(DICTIONARY_LENGTH), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject collated_rule_variable_map = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = rule_variable_maps;
        SubLObject rule_variable_map = NIL;
        rule_variable_map = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rule_variable_map)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject tuples = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$1 = tuples;
                SubLObject tuple = NIL;
                tuple = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (NIL == list_utilities.tree_find_if(symbol_function($sym3$INVALID_FORT_), tuple, UNPROVIDED)) {
                        dictionary_utilities.dictionary_push(collated_rule_variable_map, rule, tuple);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    tuple = cdolist_list_var_$1.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            rule_variable_map = cdolist_list_var.first();
        } 
        return collated_rule_variable_map;
    }

    public static SubLObject kct_extract_collated_rule_variable_bindings_map(final SubLObject test_set_run) {
        final SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
        final SubLObject query_runs = Mapping.mapcar(symbol_function(KCT_TEST_RUN_QUERY_RUN), test_runs);
        final SubLObject query_set_run = kbq_query_run.kbq_make_query_set_run(query_runs, UNPROVIDED);
        return kbq_extract_collated_rule_variable_bindings_map(query_set_run);
    }

    public static SubLObject save_rule_variable_map_files(final SubLObject collated_rule_variable_map, final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject mess = $str5$Saving_rule_variable_map_data_fil;
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject total_$2 = map_utilities.map_size(collated_rule_variable_map);
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(collated_rule_variable_map);
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject rule = NIL;
                        SubLObject tuples = NIL;
                        destructuring_bind_must_consp(current, datum, $list7);
                        rule = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list7);
                        tuples = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            note_percent_progress(sofar, total_$2);
                            sofar = add(sofar, ONE_INTEGER);
                            final SubLObject id = assertion_handles.assertion_id(rule);
                            final SubLObject filename = cconcatenate($str8$rule_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str9$_tuples_txt });
                            final SubLObject full_filename = cconcatenate(directory, filename);
                            final SubLObject chlid = kb_utilities.compact_hl_external_id_string(rule);
                            final SubLObject formula = uncanonicalizer.assertion_el_ist_formula(rule);
                            final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
                            SubLObject stream = NIL;
                            try {
                                final SubLObject _prev_bind_0_$3 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_text(full_filename, $OUTPUT);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$3, thread);
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str11$Unable_to_open__S, full_filename);
                                }
                                final SubLObject stream_$4 = stream;
                                final SubLObject _prev_bind_0_$4 = $read_default_float_format$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = $print_pretty$.currentBinding(thread);
                                try {
                                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                    $print_pretty$.bind(NIL, thread);
                                    format(stream_$4, $str13$__file____S, filename);
                                    format(stream_$4, $str14$___A, chlid);
                                    format(stream_$4, $str15$___rule_);
                                    format_cycl_expression.format_cycl_expression(formula, stream_$4, ZERO_INTEGER);
                                    format(stream_$4, $str16$____rule_);
                                    format(stream_$4, $str17$___S, el_vars);
                                    SubLObject cdolist_list_var = tuples;
                                    SubLObject tuple = NIL;
                                    tuple = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        tuple = Mapping.mapcar(symbol_function(HL_TO_EL), tuple);
                                        total = add(total, ONE_INTEGER);
                                        terpri(stream_$4);
                                        print_hash_pipe_delimited_list(tuple, stream_$4);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        tuple = cdolist_list_var.first();
                                    } 
                                } finally {
                                    $print_pretty$.rebind(_prev_bind_1_$6, thread);
                                    $read_default_float_format$.rebind(_prev_bind_0_$4, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list7);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject print_hash_pipe_delimited_list(final SubLObject list, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        write_string($str19$_, stream, UNPROVIDED, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject item = NIL;
        SubLObject index = NIL;
        list_var = list;
        item = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , index = add(ONE_INTEGER, index)) {
            if (!index.isZero()) {
                write_string($str20$______, stream, UNPROVIDED, UNPROVIDED);
            }
            prin1(item, stream);
        }
        write_string($str21$_, stream, UNPROVIDED, UNPROVIDED);
        return list;
    }

    public static SubLObject read_rule_applicability_tree_files(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        final SubLObject files = Filesys.directory(directory, UNPROVIDED);
        final SubLObject rule_applicability_tree_map = dictionary.new_dictionary(symbol_function(EQL), length(files));
        final SubLObject list_var = files;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Reading_rule_applicability_trees, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject file = NIL;
                file = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject rule = NIL;
                    SubLObject tree = NIL;
                    SubLObject error_message = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject full_filename = file_utilities.relative_filename(directory, file, UNPROVIDED);
                                thread.resetMultipleValues();
                                final SubLObject rule_$10 = read_rule_applicability_tree_file(full_filename);
                                final SubLObject tree_$11 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                rule = rule_$10;
                                tree = tree_$11;
                                if (NIL != tree) {
                                    tree = list($AND, tree);
                                    tree = canonicalize_rule_applicability_tree_recursive(tree);
                                }
                                if (NIL != rule) {
                                    map_utilities.map_put(rule_applicability_tree_map, rule, tree);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error_message) {
                        Errors.warn($str27$file__A____A__, file, error_message);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    file = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return rule_applicability_tree_map;
    }

    public static SubLObject read_rule_applicability_tree_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule = NIL;
        SubLObject tree = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str11$Unable_to_open__S, filename);
            }
            final SubLObject stream_$13 = stream;
            SubLObject line_number = ZERO_INTEGER;
            SubLObject separators = ZERO_INTEGER;
            SubLObject done_var;
            SubLObject doneP = done_var = NIL;
            thread.resetMultipleValues();
            final SubLObject stream_buffer_var = stream_buffer.do_stream_lines_buffered_initialize(stream_$13, UNPROVIDED);
            final SubLObject line_buffer = thread.secondMultipleValue();
            thread.resetMultipleValues();
            while (NIL == done_var) {
                if (NIL != stream_buffer.do_stream_lines_buffered_next(stream_buffer_var, line_buffer)) {
                    final SubLObject line_string = stream_buffer.string_buffer_string(line_buffer);
                    final SubLObject line_end = stream_buffer.string_buffer_position(line_buffer);
                    if (line_number.numE(ONE_INTEGER)) {
                        final SubLObject rule_id_string = string_utilities.substring(line_string, ZERO_INTEGER, line_end);
                        rule = kb_utilities.find_object_by_compact_hl_external_id_string(rule_id_string);
                    } else
                        if (NIL != search($str29$_________, line_string, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, ZERO_INTEGER, line_end)) {
                            separators = add(separators, ONE_INTEGER);
                            doneP = numE(separators, TWO_INTEGER);
                        }

                    line_number = add(line_number, ONE_INTEGER);
                    done_var = doneP;
                } else {
                    done_var = T;
                }
            } 
            stream_buffer.do_stream_lines_buffered_finalize(line_buffer, stream_buffer_var);
            tree = read(stream_$13, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return values(rule, tree);
    }

    public static SubLObject canonicalize_rule_applicability_tree_recursive(final SubLObject tree) {
        if (NIL != tree) {
            if (!tree.isList()) {
                return Errors.error($str30$unexpected_form___S, tree);
            }
            if (NIL != list_utilities.member_eqP(tree.first(), $list31)) {
                SubLObject operator = NIL;
                SubLObject subtrees = NIL;
                destructuring_bind_must_consp(tree, tree, $list32);
                operator = tree.first();
                SubLObject current = tree.rest();
                destructuring_bind_must_consp(current, tree, $list32);
                subtrees = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject list_var = NIL;
                    SubLObject subtree = NIL;
                    SubLObject index = NIL;
                    list_var = subtrees;
                    subtree = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subtree = list_var.first() , index = add(ONE_INTEGER, index)) {
                        subtree = canonicalize_rule_applicability_tree_recursive(subtree);
                        set_nth(index, subtrees, subtree);
                    }
                } else {
                    cdestructuring_bind_error(tree, $list32);
                }
            } else {
                if (NIL == cycl_variables.el_varP(tree.first())) {
                    return Errors.error($str30$unexpected_form___S, tree);
                }
                SubLObject variable = NIL;
                SubLObject v_term = NIL;
                SubLObject n1 = NIL;
                SubLObject n2 = NIL;
                SubLObject n3 = NIL;
                destructuring_bind_must_consp(tree, tree, $list33);
                variable = tree.first();
                SubLObject current = tree.rest();
                destructuring_bind_must_consp(current, tree, $list33);
                v_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, tree, $list33);
                n1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, tree, $list33);
                n2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, tree, $list33);
                n3 = current.first();
                current = current.rest();
                SubLObject subtree2 = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, tree, $list33);
                current = current.rest();
                if (NIL == current) {
                    v_term = narts_high.nart_substitute(v_term);
                    set_nth(ONE_INTEGER, tree, v_term);
                    if (NIL != subtree2) {
                        subtree2 = canonicalize_rule_applicability_tree_recursive(subtree2);
                        set_nth(FIVE_INTEGER, tree, subtree2);
                    }
                } else {
                    cdestructuring_bind_error(tree, $list33);
                }
            }
        }
        return tree;
    }

    public static SubLObject rule_applicability_tree(final SubLObject rule) {
        if ($UNINITIALIZED != $rule_applicability_tree_map$.getGlobalValue()) {
            return map_utilities.map_get_without_values($rule_applicability_tree_map$.getGlobalValue(), rule, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject rule_has_applicability_treeP(final SubLObject rule) {
        return list_utilities.sublisp_boolean(rule_applicability_tree(rule));
    }

    public static SubLObject generalized_transformation_link_success_probability_estimate(final SubLObject link) {
        final SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
        if (NIL == rule_has_applicability_treeP(rule)) {
            return $float$0_5;
        }
        final SubLObject v_bindings = generalized_transformation_link_bindings_wrt_applicability_tree(link);
        return rule_bindings_success_probability_estimate(rule, v_bindings);
    }

    public static SubLObject rule_bindings_success_probability_estimate(final SubLObject rule, final SubLObject v_bindings) {
        final SubLObject tree = rule_applicability_tree(rule);
        if (NIL == tree) {
            return $float$0_5;
        }
        return rule_bindings_success_probability_estimate_recursive(v_bindings, tree);
    }

    public static SubLObject rule_bindings_success_probability_estimate_recursive(final SubLObject v_bindings, final SubLObject tree) {
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = tree.first();
        if (pcase_var.eql($AND)) {
            final SubLObject subtrees = second(tree);
            SubLObject probability = ONE_INTEGER;
            SubLObject cdolist_list_var = subtrees;
            SubLObject subtree = NIL;
            subtree = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sub_probability = rule_bindings_success_probability_estimate_recursive(v_bindings, subtree);
                probability = multiply(probability, sub_probability);
                cdolist_list_var = cdolist_list_var.rest();
                subtree = cdolist_list_var.first();
            } 
            return probability;
        }
        if (pcase_var.eql($OR)) {
            final SubLObject subtrees = second(tree);
            SubLObject probability = ONE_INTEGER;
            SubLObject cdolist_list_var = subtrees;
            SubLObject subtree = NIL;
            subtree = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sub_probability = rule_bindings_success_probability_estimate_recursive(v_bindings, subtree);
                probability = multiply(probability, subtract(ONE_INTEGER, sub_probability));
                cdolist_list_var = cdolist_list_var.rest();
                subtree = cdolist_list_var.first();
            } 
            return subtract(ONE_INTEGER, probability);
        }
        SubLObject variable = NIL;
        SubLObject constraint = NIL;
        SubLObject success = NIL;
        SubLObject failure = NIL;
        SubLObject total = NIL;
        destructuring_bind_must_consp(tree, tree, $list38);
        variable = tree.first();
        SubLObject current = tree.rest();
        destructuring_bind_must_consp(current, tree, $list38);
        constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tree, $list38);
        success = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tree, $list38);
        failure = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tree, $list38);
        total = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(tree, $list38);
            return NIL;
        }
        final SubLObject value = list_utilities.alist_lookup(v_bindings, variable, UNPROVIDED, UNPROVIDED);
        if (NIL == value) {
            return ONE_INTEGER;
        }
        if (NIL != rule_bindings_value_satisfies_constraintP(value, constraint)) {
            return rule_bindings_match_probability(success, total);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject rule_bindings_value_satisfies_constraintP(final SubLObject value, final SubLObject constraint) {
        return makeBoolean((NIL != kb_utilities.kbeq(value, constraint)) || (NIL != (NIL != fort_types_interface.isa_collection_in_any_mtP(value) ? makeBoolean(NIL == genls.not_genlP(value, constraint, UNPROVIDED, UNPROVIDED)) : makeBoolean(NIL == isa.not_isaP(value, constraint, UNPROVIDED, UNPROVIDED)))));
    }

    public static SubLObject rule_bindings_match_probability(final SubLObject success, final SubLObject total) {
        return divide(success, total);
    }

    public static SubLObject generalized_transformation_link_bindings_wrt_applicability_tree(final SubLObject link) {
        assert NIL != inference_worker_transformation.generalized_transformation_link_p(link) : "inference_worker_transformation.generalized_transformation_link_p(link) " + "CommonSymbols.NIL != inference_worker_transformation.generalized_transformation_link_p(link) " + link;
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            return transformation_link_bindings_wrt_applicability_tree(link);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return residual_transformation_link_bindings_wrt_applicability_tree(link);
        }
        return Errors.error($str40$unexpected_link____S, link);
    }

    public static SubLObject transformation_link_bindings_wrt_applicability_tree(final SubLObject t_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_worker_transformation.transformation_link_p(t_link) : "inference_worker_transformation.transformation_link_p(t_link) " + "CommonSymbols.NIL != inference_worker_transformation.transformation_link_p(t_link) " + t_link;
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = transformation_link_bindings_wrt_applicability_tree_memoized(t_link);
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree(final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link) : "inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + "CommonSymbols.NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + rt_link;
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = residual_transformation_link_bindings_wrt_applicability_tree_memoized(rt_link);
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject transformation_link_bindings_wrt_applicability_tree_memoized_internal(final SubLObject t_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        final SubLObject el_bindings = inference_worker_transformation.transformation_link_el_bindings(t_link);
        final SubLObject applicability_bindings = compute_bindings_wrt_applicability_tree(el_bindings, problem);
        return applicability_bindings;
    }

    public static SubLObject transformation_link_bindings_wrt_applicability_tree_memoized(final SubLObject t_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return transformation_link_bindings_wrt_applicability_tree_memoized_internal(t_link);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, t_link, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(transformation_link_bindings_wrt_applicability_tree_memoized_internal(t_link)));
            memoization_state.caching_state_put(caching_state, t_link, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(final SubLObject rt_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
        final SubLObject el_bindings = inference_worker_residual_transformation.residual_transformation_link_el_bindings(rt_link);
        final SubLObject applicability_bindings = compute_bindings_wrt_applicability_tree(el_bindings, problem);
        return applicability_bindings;
    }

    public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree_memoized(final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(rt_link);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rt_link, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(rt_link)));
            memoization_state.caching_state_put(caching_state, rt_link, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject compute_bindings_wrt_applicability_tree(final SubLObject el_bindings, final SubLObject problem) {
        SubLObject applicability_bindings = NIL;
        SubLObject cdolist_list_var = el_bindings;
        SubLObject el_binding = NIL;
        el_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = el_binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list45);
            variable = current.first();
            current = value = current.rest();
            if (NIL != unification.base_variable_p(value)) {
                value = problem_variable_constraints_wrt_applicability(problem, value);
            }
            applicability_bindings = cons(bindings.make_variable_binding(variable, value), applicability_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            el_binding = cdolist_list_var.first();
        } 
        applicability_bindings = Sort.sort(applicability_bindings, symbol_function($sym46$TERM__), symbol_function(FIRST));
        return applicability_bindings;
    }

    public static SubLObject problem_variable_constraints_wrt_applicability(final SubLObject problem, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
        final SubLObject query_wrt_var = problem_query_wrt_var(problem_query, variable);
        final SubLObject formula = inference_czer.problem_query_formula(query_wrt_var);
        thread.resetMultipleValues();
        final SubLObject subformula = czer_utilities.unwrap_if_ist(formula, $$BaseKB, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject genl_constraints = genls.min_cols(at_var_types.formula_variable_genl_constraints(variable, subformula, mt, UNPROVIDED), mt, UNPROVIDED);
        final SubLObject isa_constraints = (NIL != genl_constraints) ? NIL : genls.min_cols(at_var_types.formula_variable_isa_constraints(variable, subformula, mt, UNPROVIDED), mt, UNPROVIDED);
        final SubLObject genericized_term = defns.genericize_constraints_wrt_types(isa_constraints, genl_constraints, mt);
        return genericized_term;
    }

    public static SubLObject problem_query_wrt_var(final SubLObject problem_query, final SubLObject variable) {
        SubLObject new_clauses = NIL;
        SubLObject cdolist_list_var = problem_query;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = clause;
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            destructuring_bind_must_consp(current, datum, $list49);
            neg_lits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list49);
            pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject new_neg_lits = NIL;
                SubLObject new_pos_lits = NIL;
                SubLObject cdolist_list_var_$16 = neg_lits;
                SubLObject neg_lit = NIL;
                neg_lit = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    if (NIL != list_utilities.simple_tree_find(variable, neg_lit)) {
                        new_neg_lits = cons(neg_lit, new_neg_lits);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    neg_lit = cdolist_list_var_$16.first();
                } 
                new_neg_lits = nreverse(new_neg_lits);
                SubLObject cdolist_list_var_$17 = pos_lits;
                SubLObject pos_lit = NIL;
                pos_lit = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    if (NIL != list_utilities.simple_tree_find(variable, pos_lit)) {
                        new_pos_lits = cons(pos_lit, new_pos_lits);
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    pos_lit = cdolist_list_var_$17.first();
                } 
                new_pos_lits = nreverse(new_pos_lits);
                new_clauses = cons(clauses.make_clause(new_neg_lits, new_pos_lits), new_clauses);
            } else {
                cdestructuring_bind_error(datum, $list49);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(new_clauses);
    }

    public static SubLObject declare_rule_applicability_tree_file() {
        declareFunction("kbq_extract_collated_rule_variable_bindings_map", "KBQ-EXTRACT-COLLATED-RULE-VARIABLE-BINDINGS-MAP", 1, 0, false);
        declareFunction("kct_extract_collated_rule_variable_bindings_map", "KCT-EXTRACT-COLLATED-RULE-VARIABLE-BINDINGS-MAP", 1, 0, false);
        declareFunction("save_rule_variable_map_files", "SAVE-RULE-VARIABLE-MAP-FILES", 2, 0, false);
        declareFunction("print_hash_pipe_delimited_list", "PRINT-HASH-PIPE-DELIMITED-LIST", 1, 1, false);
        declareFunction("read_rule_applicability_tree_files", "READ-RULE-APPLICABILITY-TREE-FILES", 1, 0, false);
        declareFunction("read_rule_applicability_tree_file", "READ-RULE-APPLICABILITY-TREE-FILE", 1, 0, false);
        declareFunction("canonicalize_rule_applicability_tree_recursive", "CANONICALIZE-RULE-APPLICABILITY-TREE-RECURSIVE", 1, 0, false);
        declareFunction("rule_applicability_tree", "RULE-APPLICABILITY-TREE", 1, 0, false);
        declareFunction("rule_has_applicability_treeP", "RULE-HAS-APPLICABILITY-TREE?", 1, 0, false);
        declareFunction("generalized_transformation_link_success_probability_estimate", "GENERALIZED-TRANSFORMATION-LINK-SUCCESS-PROBABILITY-ESTIMATE", 1, 0, false);
        declareFunction("rule_bindings_success_probability_estimate", "RULE-BINDINGS-SUCCESS-PROBABILITY-ESTIMATE", 2, 0, false);
        declareFunction("rule_bindings_success_probability_estimate_recursive", "RULE-BINDINGS-SUCCESS-PROBABILITY-ESTIMATE-RECURSIVE", 2, 0, false);
        declareFunction("rule_bindings_value_satisfies_constraintP", "RULE-BINDINGS-VALUE-SATISFIES-CONSTRAINT?", 2, 0, false);
        declareFunction("rule_bindings_match_probability", "RULE-BINDINGS-MATCH-PROBABILITY", 2, 0, false);
        declareFunction("generalized_transformation_link_bindings_wrt_applicability_tree", "GENERALIZED-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
        declareFunction("transformation_link_bindings_wrt_applicability_tree", "TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
        declareFunction("residual_transformation_link_bindings_wrt_applicability_tree", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
        declareFunction("transformation_link_bindings_wrt_applicability_tree_memoized_internal", "TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("transformation_link_bindings_wrt_applicability_tree_memoized", "TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED", 1, 0, false);
        declareFunction("residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("residual_transformation_link_bindings_wrt_applicability_tree_memoized", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED", 1, 0, false);
        declareFunction("compute_bindings_wrt_applicability_tree", "COMPUTE-BINDINGS-WRT-APPLICABILITY-TREE", 2, 0, false);
        declareFunction("problem_variable_constraints_wrt_applicability", "PROBLEM-VARIABLE-CONSTRAINTS-WRT-APPLICABILITY", 2, 0, false);
        declareFunction("problem_query_wrt_var", "PROBLEM-QUERY-WRT-VAR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rule_applicability_tree_file() {
        deflexical("*RULE-APPLICABILITY-TREE-MAP*", SubLTrampolineFile.maybeDefault($rule_applicability_tree_map$, $rule_applicability_tree_map$, $UNINITIALIZED));
        return NIL;
    }

    public static SubLObject setup_rule_applicability_tree_file() {
        declare_defglobal($rule_applicability_tree_map$);
        memoization_state.note_memoized_function(TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED);
        memoization_state.note_memoized_function($sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rule_applicability_tree_file();
    }

    @Override
    public void initializeVariables() {
        init_rule_applicability_tree_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rule_applicability_tree_file();
    }

    static {




















































    }
}

/**
 * Total time: 312 ms
 */
