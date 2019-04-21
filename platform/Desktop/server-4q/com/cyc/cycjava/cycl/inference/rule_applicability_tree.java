package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.defns;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.stream_buffer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rule_applicability_tree extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.rule_applicability_tree";
    public static final String myFingerPrint = "6c18b3c4181f2dc6a93e995231d519f2836ddc675bb0dcd79e0889f9a7defd02";
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 8927L)
    private static SubLSymbol $rule_applicability_tree_map$;
    private static final SubLSymbol $kw0$RULE_BINDING_VALUE_MAP;
    private static final SubLSymbol $sym1$_;
    private static final SubLSymbol $sym2$DICTIONARY_LENGTH;
    private static final SubLSymbol $sym3$INVALID_FORT_;
    private static final SubLSymbol $sym4$KCT_TEST_RUN_QUERY_RUN;
    private static final SubLString $str5$Saving_rule_variable_map_data_fil;
    private static final SubLSymbol $sym6$STRINGP;
    private static final SubLList $list7;
    private static final SubLString $str8$rule_;
    private static final SubLString $str9$_tuples_txt;
    private static final SubLSymbol $kw10$OUTPUT;
    private static final SubLString $str11$Unable_to_open__S;
    private static final SubLSymbol $sym12$DOUBLE_FLOAT;
    private static final SubLString $str13$__file____S;
    private static final SubLString $str14$___A;
    private static final SubLString $str15$___rule_;
    private static final SubLString $str16$____rule_;
    private static final SubLString $str17$___S;
    private static final SubLSymbol $sym18$HL_TO_EL;
    private static final SubLString $str19$_;
    private static final SubLString $str20$______;
    private static final SubLString $str21$_;
    private static final SubLSymbol $sym22$DIRECTORY_P;
    private static final SubLString $str23$Reading_rule_applicability_trees;
    private static final SubLString $str24$cdolist;
    private static final SubLSymbol $sym25$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw26$AND;
    private static final SubLString $str27$file__A____A__;
    private static final SubLSymbol $kw28$INPUT;
    private static final SubLString $str29$_________;
    private static final SubLString $str30$unexpected_form___S;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$_RULE_APPLICABILITY_TREE_MAP_;
    private static final SubLSymbol $kw35$UNINITIALIZED;
    private static final SubLFloat $float36$0_5;
    private static final SubLSymbol $kw37$OR;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$GENERALIZED_TRANSFORMATION_LINK_P;
    private static final SubLString $str40$unexpected_link____S;
    private static final SubLSymbol $sym41$TRANSFORMATION_LINK_P;
    private static final SubLSymbol $sym42$RESIDUAL_TRANSFORMATION_LINK_P;
    private static final SubLSymbol $sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED;
    private static final SubLSymbol $sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$TERM__;
    private static final SubLSymbol $sym47$FIRST;
    private static final SubLObject $const48$BaseKB;
    private static final SubLList $list49;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 1537L)
    public static SubLObject kbq_extract_collated_rule_variable_bindings_map(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject metric_values = Sequences.delete((SubLObject)rule_applicability_tree.NIL, kbq_query_run.kbq_extract_metric_values(query_set_run, (SubLObject)rule_applicability_tree.$kw0$RULE_BINDING_VALUE_MAP, (SubLObject)rule_applicability_tree.UNPROVIDED), (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED);
        final SubLObject rule_variable_maps = Sequences.delete((SubLObject)rule_applicability_tree.ZERO_INTEGER, metric_values, Symbols.symbol_function((SubLObject)rule_applicability_tree.$sym1$_), Symbols.symbol_function((SubLObject)rule_applicability_tree.$sym2$DICTIONARY_LENGTH), (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED);
        final SubLObject collated_rule_variable_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rule_applicability_tree.EQL), (SubLObject)rule_applicability_tree.UNPROVIDED);
        SubLObject cdolist_list_var = rule_variable_maps;
        SubLObject rule_variable_map = (SubLObject)rule_applicability_tree.NIL;
        rule_variable_map = cdolist_list_var.first();
        while (rule_applicability_tree.NIL != cdolist_list_var) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rule_variable_map)); rule_applicability_tree.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject tuples = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$1 = tuples;
                SubLObject tuple = (SubLObject)rule_applicability_tree.NIL;
                tuple = cdolist_list_var_$1.first();
                while (rule_applicability_tree.NIL != cdolist_list_var_$1) {
                    if (rule_applicability_tree.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)rule_applicability_tree.$sym3$INVALID_FORT_), tuple, (SubLObject)rule_applicability_tree.UNPROVIDED)) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 2362L)
    public static SubLObject kct_extract_collated_rule_variable_bindings_map(final SubLObject test_set_run) {
        final SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
        final SubLObject query_runs = Mapping.mapcar(Symbols.symbol_function((SubLObject)rule_applicability_tree.$sym4$KCT_TEST_RUN_QUERY_RUN), test_runs);
        final SubLObject query_set_run = kbq_query_run.kbq_make_query_set_run(query_runs, (SubLObject)rule_applicability_tree.UNPROVIDED);
        return kbq_extract_collated_rule_variable_bindings_map(query_set_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 2695L)
    public static SubLObject save_rule_variable_map_files(final SubLObject collated_rule_variable_map, final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)rule_applicability_tree.ZERO_INTEGER;
        final SubLObject mess = (SubLObject)rule_applicability_tree.$str5$Saving_rule_variable_map_data_fil;
        SubLObject sofar = (SubLObject)rule_applicability_tree.ZERO_INTEGER;
        final SubLObject total_$2 = map_utilities.map_size(collated_rule_variable_map);
        assert rule_applicability_tree.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rule_applicability_tree.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rule_applicability_tree.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rule_applicability_tree.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(collated_rule_variable_map);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)rule_applicability_tree.NIL; rule_applicability_tree.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(rule_applicability_tree.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (rule_applicability_tree.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject rule = (SubLObject)rule_applicability_tree.NIL;
                        SubLObject tuples = (SubLObject)rule_applicability_tree.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_applicability_tree.$list7);
                        rule = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_applicability_tree.$list7);
                        tuples = current.first();
                        current = current.rest();
                        if (rule_applicability_tree.NIL == current) {
                            utilities_macros.note_percent_progress(sofar, total_$2);
                            sofar = Numbers.add(sofar, (SubLObject)rule_applicability_tree.ONE_INTEGER);
                            final SubLObject id = assertion_handles.assertion_id(rule);
                            final SubLObject filename = Sequences.cconcatenate((SubLObject)rule_applicability_tree.$str8$rule_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), rule_applicability_tree.$str9$_tuples_txt });
                            final SubLObject full_filename = Sequences.cconcatenate(directory, filename);
                            final SubLObject chlid = kb_utilities.compact_hl_external_id_string(rule);
                            final SubLObject formula = uncanonicalizer.assertion_el_ist_formula(rule);
                            final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
                            SubLObject stream = (SubLObject)rule_applicability_tree.NIL;
                            try {
                                final SubLObject _prev_bind_0_$3 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind((SubLObject)rule_applicability_tree.NIL, thread);
                                    stream = compatibility.open_text(full_filename, (SubLObject)rule_applicability_tree.$kw10$OUTPUT);
                                }
                                finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$3, thread);
                                }
                                if (!stream.isStream()) {
                                    Errors.error((SubLObject)rule_applicability_tree.$str11$Unable_to_open__S, full_filename);
                                }
                                final SubLObject stream_$4 = stream;
                                final SubLObject _prev_bind_0_$4 = reader.$read_default_float_format$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = print_high.$print_pretty$.currentBinding(thread);
                                try {
                                    reader.$read_default_float_format$.bind((SubLObject)rule_applicability_tree.$sym12$DOUBLE_FLOAT, thread);
                                    print_high.$print_pretty$.bind((SubLObject)rule_applicability_tree.NIL, thread);
                                    PrintLow.format(stream_$4, (SubLObject)rule_applicability_tree.$str13$__file____S, filename);
                                    PrintLow.format(stream_$4, (SubLObject)rule_applicability_tree.$str14$___A, chlid);
                                    PrintLow.format(stream_$4, (SubLObject)rule_applicability_tree.$str15$___rule_);
                                    format_cycl_expression.format_cycl_expression(formula, stream_$4, (SubLObject)rule_applicability_tree.ZERO_INTEGER);
                                    PrintLow.format(stream_$4, (SubLObject)rule_applicability_tree.$str16$____rule_);
                                    PrintLow.format(stream_$4, (SubLObject)rule_applicability_tree.$str17$___S, el_vars);
                                    SubLObject cdolist_list_var = tuples;
                                    SubLObject tuple = (SubLObject)rule_applicability_tree.NIL;
                                    tuple = cdolist_list_var.first();
                                    while (rule_applicability_tree.NIL != cdolist_list_var) {
                                        tuple = Mapping.mapcar(Symbols.symbol_function((SubLObject)rule_applicability_tree.$sym18$HL_TO_EL), tuple);
                                        total = Numbers.add(total, (SubLObject)rule_applicability_tree.ONE_INTEGER);
                                        streams_high.terpri(stream_$4);
                                        print_hash_pipe_delimited_list(tuple, stream_$4);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        tuple = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    print_high.$print_pretty$.rebind(_prev_bind_1_$6, thread);
                                    reader.$read_default_float_format$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_applicability_tree.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (stream.isStream()) {
                                        streams_high.close(stream, (SubLObject)rule_applicability_tree.UNPROVIDED);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rule_applicability_tree.$list7);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_applicability_tree.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 5712L)
    public static SubLObject print_hash_pipe_delimited_list(final SubLObject list, SubLObject stream) {
        if (stream == rule_applicability_tree.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        streams_high.write_string((SubLObject)rule_applicability_tree.$str19$_, stream, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED);
        SubLObject list_var = (SubLObject)rule_applicability_tree.NIL;
        SubLObject item = (SubLObject)rule_applicability_tree.NIL;
        SubLObject index = (SubLObject)rule_applicability_tree.NIL;
        list_var = list;
        item = list_var.first();
        for (index = (SubLObject)rule_applicability_tree.ZERO_INTEGER; rule_applicability_tree.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), index = Numbers.add((SubLObject)rule_applicability_tree.ONE_INTEGER, index)) {
            if (!index.isZero()) {
                streams_high.write_string((SubLObject)rule_applicability_tree.$str20$______, stream, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED);
            }
            print_high.prin1(item, stream);
        }
        streams_high.write_string((SubLObject)rule_applicability_tree.$str21$_, stream, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED);
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 6004L)
    public static SubLObject read_rule_applicability_tree_files(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_applicability_tree.NIL != Filesys.directory_p(directory) : directory;
        final SubLObject files = Filesys.directory(directory, (SubLObject)rule_applicability_tree.UNPROVIDED);
        final SubLObject rule_applicability_tree_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rule_applicability_tree.EQL), Sequences.length(files));
        final SubLObject list_var = files;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rule_applicability_tree.$str23$Reading_rule_applicability_trees, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rule_applicability_tree.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rule_applicability_tree.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rule_applicability_tree.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rule_applicability_tree.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject file = (SubLObject)rule_applicability_tree.NIL;
                file = csome_list_var.first();
                while (rule_applicability_tree.NIL != csome_list_var) {
                    SubLObject rule = (SubLObject)rule_applicability_tree.NIL;
                    SubLObject tree = (SubLObject)rule_applicability_tree.NIL;
                    SubLObject error_message = (SubLObject)rule_applicability_tree.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)rule_applicability_tree.$sym25$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject full_filename = file_utilities.relative_filename(directory, file, (SubLObject)rule_applicability_tree.UNPROVIDED);
                                thread.resetMultipleValues();
                                final SubLObject rule_$10 = read_rule_applicability_tree_file(full_filename);
                                final SubLObject tree_$11 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                rule = rule_$10;
                                tree = tree_$11;
                                if (rule_applicability_tree.NIL != tree) {
                                    tree = (SubLObject)ConsesLow.list((SubLObject)rule_applicability_tree.$kw26$AND, tree);
                                    tree = canonicalize_rule_applicability_tree_recursive(tree);
                                }
                                if (rule_applicability_tree.NIL != rule) {
                                    map_utilities.map_put(rule_applicability_tree_map, rule, tree);
                                }
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)rule_applicability_tree.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (rule_applicability_tree.NIL != error_message) {
                        Errors.warn((SubLObject)rule_applicability_tree.$str27$file__A____A__, file, error_message);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rule_applicability_tree.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    file = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_applicability_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return rule_applicability_tree_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 7208L)
    public static SubLObject read_rule_applicability_tree_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule = (SubLObject)rule_applicability_tree.NIL;
        SubLObject tree = (SubLObject)rule_applicability_tree.NIL;
        SubLObject stream = (SubLObject)rule_applicability_tree.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rule_applicability_tree.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)rule_applicability_tree.$kw28$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rule_applicability_tree.$str11$Unable_to_open__S, filename);
            }
            final SubLObject stream_$13 = stream;
            SubLObject line_number = (SubLObject)rule_applicability_tree.ZERO_INTEGER;
            SubLObject separators = (SubLObject)rule_applicability_tree.ZERO_INTEGER;
            SubLObject done_var;
            SubLObject doneP = done_var = (SubLObject)rule_applicability_tree.NIL;
            thread.resetMultipleValues();
            final SubLObject stream_buffer_var = stream_buffer.do_stream_lines_buffered_initialize(stream_$13, (SubLObject)rule_applicability_tree.UNPROVIDED);
            final SubLObject line_buffer = thread.secondMultipleValue();
            thread.resetMultipleValues();
            while (rule_applicability_tree.NIL == done_var) {
                if (rule_applicability_tree.NIL != stream_buffer.do_stream_lines_buffered_next(stream_buffer_var, line_buffer)) {
                    final SubLObject line_string = stream_buffer.string_buffer_string(line_buffer);
                    final SubLObject line_end = stream_buffer.string_buffer_position(line_buffer);
                    if (line_number.numE((SubLObject)rule_applicability_tree.ONE_INTEGER)) {
                        final SubLObject rule_id_string = string_utilities.substring(line_string, (SubLObject)rule_applicability_tree.ZERO_INTEGER, line_end);
                        rule = kb_utilities.find_object_by_compact_hl_external_id_string(rule_id_string);
                    }
                    else if (rule_applicability_tree.NIL != Sequences.search((SubLObject)rule_applicability_tree.$str29$_________, line_string, Symbols.symbol_function((SubLObject)rule_applicability_tree.EQL), Symbols.symbol_function((SubLObject)rule_applicability_tree.IDENTITY), (SubLObject)rule_applicability_tree.ZERO_INTEGER, (SubLObject)rule_applicability_tree.NIL, (SubLObject)rule_applicability_tree.ZERO_INTEGER, line_end)) {
                        separators = Numbers.add(separators, (SubLObject)rule_applicability_tree.ONE_INTEGER);
                        doneP = Numbers.numE(separators, (SubLObject)rule_applicability_tree.TWO_INTEGER);
                    }
                    line_number = Numbers.add(line_number, (SubLObject)rule_applicability_tree.ONE_INTEGER);
                    done_var = doneP;
                }
                else {
                    done_var = (SubLObject)rule_applicability_tree.T;
                }
            }
            stream_buffer.do_stream_lines_buffered_finalize(line_buffer, stream_buffer_var);
            tree = reader.read(stream_$13, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_applicability_tree.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rule_applicability_tree.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Values.values(rule, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 8090L)
    public static SubLObject canonicalize_rule_applicability_tree_recursive(final SubLObject tree) {
        if (rule_applicability_tree.NIL != tree) {
            if (!tree.isList()) {
                return Errors.error((SubLObject)rule_applicability_tree.$str30$unexpected_form___S, tree);
            }
            if (rule_applicability_tree.NIL != list_utilities.member_eqP(tree.first(), (SubLObject)rule_applicability_tree.$list31)) {
                SubLObject operator = (SubLObject)rule_applicability_tree.NIL;
                SubLObject subtrees = (SubLObject)rule_applicability_tree.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(tree, tree, (SubLObject)rule_applicability_tree.$list32);
                operator = tree.first();
                SubLObject current = tree.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list32);
                subtrees = current.first();
                current = current.rest();
                if (rule_applicability_tree.NIL == current) {
                    SubLObject list_var = (SubLObject)rule_applicability_tree.NIL;
                    SubLObject subtree = (SubLObject)rule_applicability_tree.NIL;
                    SubLObject index = (SubLObject)rule_applicability_tree.NIL;
                    list_var = subtrees;
                    subtree = list_var.first();
                    for (index = (SubLObject)rule_applicability_tree.ZERO_INTEGER; rule_applicability_tree.NIL != list_var; list_var = list_var.rest(), subtree = list_var.first(), index = Numbers.add((SubLObject)rule_applicability_tree.ONE_INTEGER, index)) {
                        subtree = canonicalize_rule_applicability_tree_recursive(subtree);
                        ConsesLow.set_nth(index, subtrees, subtree);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(tree, (SubLObject)rule_applicability_tree.$list32);
                }
            }
            else {
                if (rule_applicability_tree.NIL == cycl_variables.el_varP(tree.first())) {
                    return Errors.error((SubLObject)rule_applicability_tree.$str30$unexpected_form___S, tree);
                }
                SubLObject variable = (SubLObject)rule_applicability_tree.NIL;
                SubLObject v_term = (SubLObject)rule_applicability_tree.NIL;
                SubLObject n1 = (SubLObject)rule_applicability_tree.NIL;
                SubLObject n2 = (SubLObject)rule_applicability_tree.NIL;
                SubLObject n3 = (SubLObject)rule_applicability_tree.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(tree, tree, (SubLObject)rule_applicability_tree.$list33);
                variable = tree.first();
                SubLObject current = tree.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list33);
                v_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list33);
                n1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list33);
                n2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list33);
                n3 = current.first();
                current = current.rest();
                SubLObject subtree2 = (SubLObject)(current.isCons() ? current.first() : rule_applicability_tree.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, tree, (SubLObject)rule_applicability_tree.$list33);
                current = current.rest();
                if (rule_applicability_tree.NIL == current) {
                    v_term = narts_high.nart_substitute(v_term);
                    ConsesLow.set_nth((SubLObject)rule_applicability_tree.ONE_INTEGER, tree, v_term);
                    if (rule_applicability_tree.NIL != subtree2) {
                        subtree2 = canonicalize_rule_applicability_tree_recursive(subtree2);
                        ConsesLow.set_nth((SubLObject)rule_applicability_tree.FIVE_INTEGER, tree, subtree2);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(tree, (SubLObject)rule_applicability_tree.$list33);
                }
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 9042L)
    public static SubLObject rule_applicability_tree(final SubLObject rule) {
        if (rule_applicability_tree.$kw35$UNINITIALIZED != rule_applicability_tree.$rule_applicability_tree_map$.getGlobalValue()) {
            return map_utilities.map_get_without_values(rule_applicability_tree.$rule_applicability_tree_map$.getGlobalValue(), rule, (SubLObject)rule_applicability_tree.UNPROVIDED);
        }
        return (SubLObject)rule_applicability_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 9319L)
    public static SubLObject rule_has_applicability_treeP(final SubLObject rule) {
        return list_utilities.sublisp_boolean(rule_applicability_tree(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 9491L)
    public static SubLObject generalized_transformation_link_success_probability_estimate(final SubLObject link) {
        final SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
        if (rule_applicability_tree.NIL == rule_has_applicability_treeP(rule)) {
            return (SubLObject)rule_applicability_tree.$float36$0_5;
        }
        final SubLObject v_bindings = generalized_transformation_link_bindings_wrt_applicability_tree(link);
        return rule_bindings_success_probability_estimate(rule, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 10497L)
    public static SubLObject rule_bindings_success_probability_estimate(final SubLObject rule, final SubLObject v_bindings) {
        final SubLObject tree = rule_applicability_tree(rule);
        if (rule_applicability_tree.NIL == tree) {
            return (SubLObject)rule_applicability_tree.$float36$0_5;
        }
        return rule_bindings_success_probability_estimate_recursive(v_bindings, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 10756L)
    public static SubLObject rule_bindings_success_probability_estimate_recursive(final SubLObject v_bindings, final SubLObject tree) {
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = tree.first();
        if (pcase_var.eql((SubLObject)rule_applicability_tree.$kw26$AND)) {
            final SubLObject subtrees = conses_high.second(tree);
            SubLObject probability = (SubLObject)rule_applicability_tree.ONE_INTEGER;
            SubLObject cdolist_list_var = subtrees;
            SubLObject subtree = (SubLObject)rule_applicability_tree.NIL;
            subtree = cdolist_list_var.first();
            while (rule_applicability_tree.NIL != cdolist_list_var) {
                final SubLObject sub_probability = rule_bindings_success_probability_estimate_recursive(v_bindings, subtree);
                probability = Numbers.multiply(probability, sub_probability);
                cdolist_list_var = cdolist_list_var.rest();
                subtree = cdolist_list_var.first();
            }
            return probability;
        }
        if (pcase_var.eql((SubLObject)rule_applicability_tree.$kw37$OR)) {
            final SubLObject subtrees = conses_high.second(tree);
            SubLObject probability = (SubLObject)rule_applicability_tree.ONE_INTEGER;
            SubLObject cdolist_list_var = subtrees;
            SubLObject subtree = (SubLObject)rule_applicability_tree.NIL;
            subtree = cdolist_list_var.first();
            while (rule_applicability_tree.NIL != cdolist_list_var) {
                final SubLObject sub_probability = rule_bindings_success_probability_estimate_recursive(v_bindings, subtree);
                probability = Numbers.multiply(probability, Numbers.subtract((SubLObject)rule_applicability_tree.ONE_INTEGER, sub_probability));
                cdolist_list_var = cdolist_list_var.rest();
                subtree = cdolist_list_var.first();
            }
            return Numbers.subtract((SubLObject)rule_applicability_tree.ONE_INTEGER, probability);
        }
        SubLObject variable = (SubLObject)rule_applicability_tree.NIL;
        SubLObject constraint = (SubLObject)rule_applicability_tree.NIL;
        SubLObject success = (SubLObject)rule_applicability_tree.NIL;
        SubLObject failure = (SubLObject)rule_applicability_tree.NIL;
        SubLObject total = (SubLObject)rule_applicability_tree.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tree, tree, (SubLObject)rule_applicability_tree.$list38);
        variable = tree.first();
        SubLObject current = tree.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list38);
        constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list38);
        success = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list38);
        failure = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tree, (SubLObject)rule_applicability_tree.$list38);
        total = current.first();
        current = current.rest();
        if (rule_applicability_tree.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(tree, (SubLObject)rule_applicability_tree.$list38);
            return (SubLObject)rule_applicability_tree.NIL;
        }
        final SubLObject value = list_utilities.alist_lookup(v_bindings, variable, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED);
        if (rule_applicability_tree.NIL == value) {
            return (SubLObject)rule_applicability_tree.ONE_INTEGER;
        }
        if (rule_applicability_tree.NIL != rule_bindings_value_satisfies_constraintP(value, constraint)) {
            return rule_bindings_match_probability(success, total);
        }
        return (SubLObject)rule_applicability_tree.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 12177L)
    public static SubLObject rule_bindings_value_satisfies_constraintP(final SubLObject value, final SubLObject constraint) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rule_applicability_tree.NIL != kb_utilities.kbeq(value, constraint) || rule_applicability_tree.NIL != ((rule_applicability_tree.NIL != fort_types_interface.isa_collection_in_any_mtP(value)) ? SubLObjectFactory.makeBoolean(rule_applicability_tree.NIL == genls.not_genlP(value, constraint, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED)) : SubLObjectFactory.makeBoolean(rule_applicability_tree.NIL == isa.not_isaP(value, constraint, (SubLObject)rule_applicability_tree.UNPROVIDED, (SubLObject)rule_applicability_tree.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 12482L)
    public static SubLObject rule_bindings_match_probability(final SubLObject success, final SubLObject total) {
        return Numbers.divide(success, total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 12574L)
    public static SubLObject generalized_transformation_link_bindings_wrt_applicability_tree(final SubLObject link) {
        assert rule_applicability_tree.NIL != inference_worker_transformation.generalized_transformation_link_p(link) : link;
        if (rule_applicability_tree.NIL != inference_worker_transformation.transformation_link_p(link)) {
            return transformation_link_bindings_wrt_applicability_tree(link);
        }
        if (rule_applicability_tree.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return residual_transformation_link_bindings_wrt_applicability_tree(link);
        }
        return Errors.error((SubLObject)rule_applicability_tree.$str40$unexpected_link____S, link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13006L)
    public static SubLObject transformation_link_bindings_wrt_applicability_tree(final SubLObject t_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_applicability_tree.NIL != inference_worker_transformation.transformation_link_p(t_link) : t_link;
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        SubLObject result = (SubLObject)rule_applicability_tree.NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = transformation_link_bindings_wrt_applicability_tree_memoized(t_link);
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_applicability_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13356L)
    public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree(final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_applicability_tree.NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link) : rt_link;
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
        SubLObject result = (SubLObject)rule_applicability_tree.NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = residual_transformation_link_bindings_wrt_applicability_tree_memoized(rt_link);
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_applicability_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13737L)
    public static SubLObject transformation_link_bindings_wrt_applicability_tree_memoized_internal(final SubLObject t_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        final SubLObject el_bindings = inference_worker_transformation.transformation_link_el_bindings(t_link);
        final SubLObject applicability_bindings = compute_bindings_wrt_applicability_tree(el_bindings, problem);
        return applicability_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13737L)
    public static SubLObject transformation_link_bindings_wrt_applicability_tree_memoized(final SubLObject t_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rule_applicability_tree.NIL;
        if (rule_applicability_tree.NIL == v_memoization_state) {
            return transformation_link_bindings_wrt_applicability_tree_memoized_internal(t_link);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rule_applicability_tree.$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, (SubLObject)rule_applicability_tree.UNPROVIDED);
        if (rule_applicability_tree.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rule_applicability_tree.$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, (SubLObject)rule_applicability_tree.ONE_INTEGER, (SubLObject)rule_applicability_tree.NIL, (SubLObject)rule_applicability_tree.EQL, (SubLObject)rule_applicability_tree.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rule_applicability_tree.$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, t_link, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(transformation_link_bindings_wrt_applicability_tree_memoized_internal(t_link)));
            memoization_state.caching_state_put(caching_state, t_link, results, (SubLObject)rule_applicability_tree.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 14120L)
    public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(final SubLObject rt_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
        final SubLObject el_bindings = inference_worker_residual_transformation.residual_transformation_link_el_bindings(rt_link);
        final SubLObject applicability_bindings = compute_bindings_wrt_applicability_tree(el_bindings, problem);
        return applicability_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 14120L)
    public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree_memoized(final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rule_applicability_tree.NIL;
        if (rule_applicability_tree.NIL == v_memoization_state) {
            return residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(rt_link);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rule_applicability_tree.$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, (SubLObject)rule_applicability_tree.UNPROVIDED);
        if (rule_applicability_tree.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rule_applicability_tree.$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, (SubLObject)rule_applicability_tree.ONE_INTEGER, (SubLObject)rule_applicability_tree.NIL, (SubLObject)rule_applicability_tree.EQL, (SubLObject)rule_applicability_tree.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rule_applicability_tree.$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rt_link, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(rt_link)));
            memoization_state.caching_state_put(caching_state, rt_link, results, (SubLObject)rule_applicability_tree.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 14524L)
    public static SubLObject compute_bindings_wrt_applicability_tree(final SubLObject el_bindings, final SubLObject problem) {
        SubLObject applicability_bindings = (SubLObject)rule_applicability_tree.NIL;
        SubLObject cdolist_list_var = el_bindings;
        SubLObject el_binding = (SubLObject)rule_applicability_tree.NIL;
        el_binding = cdolist_list_var.first();
        while (rule_applicability_tree.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = el_binding;
            SubLObject variable = (SubLObject)rule_applicability_tree.NIL;
            SubLObject value = (SubLObject)rule_applicability_tree.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_applicability_tree.$list45);
            variable = current.first();
            current = (value = current.rest());
            if (rule_applicability_tree.NIL != unification.base_variable_p(value)) {
                value = problem_variable_constraints_wrt_applicability(problem, value);
            }
            applicability_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(variable, value), applicability_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            el_binding = cdolist_list_var.first();
        }
        applicability_bindings = Sort.sort(applicability_bindings, Symbols.symbol_function((SubLObject)rule_applicability_tree.$sym46$TERM__), Symbols.symbol_function((SubLObject)rule_applicability_tree.$sym47$FIRST));
        return applicability_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 15074L)
    public static SubLObject problem_variable_constraints_wrt_applicability(final SubLObject problem, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
        final SubLObject query_wrt_var = problem_query_wrt_var(problem_query, variable);
        final SubLObject formula = inference_czer.problem_query_formula(query_wrt_var);
        thread.resetMultipleValues();
        final SubLObject subformula = czer_utilities.unwrap_if_ist(formula, rule_applicability_tree.$const48$BaseKB, (SubLObject)rule_applicability_tree.UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject genl_constraints = genls.min_cols(at_var_types.formula_variable_genl_constraints(variable, subformula, mt, (SubLObject)rule_applicability_tree.UNPROVIDED), mt, (SubLObject)rule_applicability_tree.UNPROVIDED);
        final SubLObject isa_constraints = (SubLObject)((rule_applicability_tree.NIL != genl_constraints) ? rule_applicability_tree.NIL : genls.min_cols(at_var_types.formula_variable_isa_constraints(variable, subformula, mt, (SubLObject)rule_applicability_tree.UNPROVIDED), mt, (SubLObject)rule_applicability_tree.UNPROVIDED));
        final SubLObject genericized_term = defns.genericize_constraints_wrt_types(isa_constraints, genl_constraints, mt);
        return genericized_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 15832L)
    public static SubLObject problem_query_wrt_var(final SubLObject problem_query, final SubLObject variable) {
        SubLObject new_clauses = (SubLObject)rule_applicability_tree.NIL;
        SubLObject cdolist_list_var = problem_query;
        SubLObject clause = (SubLObject)rule_applicability_tree.NIL;
        clause = cdolist_list_var.first();
        while (rule_applicability_tree.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = clause;
            SubLObject neg_lits = (SubLObject)rule_applicability_tree.NIL;
            SubLObject pos_lits = (SubLObject)rule_applicability_tree.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_applicability_tree.$list49);
            neg_lits = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_applicability_tree.$list49);
            pos_lits = current.first();
            current = current.rest();
            if (rule_applicability_tree.NIL == current) {
                SubLObject new_neg_lits = (SubLObject)rule_applicability_tree.NIL;
                SubLObject new_pos_lits = (SubLObject)rule_applicability_tree.NIL;
                SubLObject cdolist_list_var_$16 = neg_lits;
                SubLObject neg_lit = (SubLObject)rule_applicability_tree.NIL;
                neg_lit = cdolist_list_var_$16.first();
                while (rule_applicability_tree.NIL != cdolist_list_var_$16) {
                    if (rule_applicability_tree.NIL != list_utilities.simple_tree_find(variable, neg_lit)) {
                        new_neg_lits = (SubLObject)ConsesLow.cons(neg_lit, new_neg_lits);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    neg_lit = cdolist_list_var_$16.first();
                }
                new_neg_lits = Sequences.nreverse(new_neg_lits);
                SubLObject cdolist_list_var_$17 = pos_lits;
                SubLObject pos_lit = (SubLObject)rule_applicability_tree.NIL;
                pos_lit = cdolist_list_var_$17.first();
                while (rule_applicability_tree.NIL != cdolist_list_var_$17) {
                    if (rule_applicability_tree.NIL != list_utilities.simple_tree_find(variable, pos_lit)) {
                        new_pos_lits = (SubLObject)ConsesLow.cons(pos_lit, new_pos_lits);
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    pos_lit = cdolist_list_var_$17.first();
                }
                new_pos_lits = Sequences.nreverse(new_pos_lits);
                new_clauses = (SubLObject)ConsesLow.cons(clauses.make_clause(new_neg_lits, new_pos_lits), new_clauses);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rule_applicability_tree.$list49);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_clauses);
    }
    
    public static SubLObject declare_rule_applicability_tree_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "kbq_extract_collated_rule_variable_bindings_map", "KBQ-EXTRACT-COLLATED-RULE-VARIABLE-BINDINGS-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "kct_extract_collated_rule_variable_bindings_map", "KCT-EXTRACT-COLLATED-RULE-VARIABLE-BINDINGS-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "save_rule_variable_map_files", "SAVE-RULE-VARIABLE-MAP-FILES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "print_hash_pipe_delimited_list", "PRINT-HASH-PIPE-DELIMITED-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "read_rule_applicability_tree_files", "READ-RULE-APPLICABILITY-TREE-FILES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "read_rule_applicability_tree_file", "READ-RULE-APPLICABILITY-TREE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "canonicalize_rule_applicability_tree_recursive", "CANONICALIZE-RULE-APPLICABILITY-TREE-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "rule_applicability_tree", "RULE-APPLICABILITY-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "rule_has_applicability_treeP", "RULE-HAS-APPLICABILITY-TREE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "generalized_transformation_link_success_probability_estimate", "GENERALIZED-TRANSFORMATION-LINK-SUCCESS-PROBABILITY-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "rule_bindings_success_probability_estimate", "RULE-BINDINGS-SUCCESS-PROBABILITY-ESTIMATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "rule_bindings_success_probability_estimate_recursive", "RULE-BINDINGS-SUCCESS-PROBABILITY-ESTIMATE-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "rule_bindings_value_satisfies_constraintP", "RULE-BINDINGS-VALUE-SATISFIES-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "rule_bindings_match_probability", "RULE-BINDINGS-MATCH-PROBABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "generalized_transformation_link_bindings_wrt_applicability_tree", "GENERALIZED-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "transformation_link_bindings_wrt_applicability_tree", "TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "residual_transformation_link_bindings_wrt_applicability_tree", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "transformation_link_bindings_wrt_applicability_tree_memoized_internal", "TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "transformation_link_bindings_wrt_applicability_tree_memoized", "TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "residual_transformation_link_bindings_wrt_applicability_tree_memoized", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "compute_bindings_wrt_applicability_tree", "COMPUTE-BINDINGS-WRT-APPLICABILITY-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "problem_variable_constraints_wrt_applicability", "PROBLEM-VARIABLE-CONSTRAINTS-WRT-APPLICABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.rule_applicability_tree", "problem_query_wrt_var", "PROBLEM-QUERY-WRT-VAR", 2, 0, false);
        return (SubLObject)rule_applicability_tree.NIL;
    }
    
    public static SubLObject init_rule_applicability_tree_file() {
        rule_applicability_tree.$rule_applicability_tree_map$ = SubLFiles.deflexical("*RULE-APPLICABILITY-TREE-MAP*", (SubLObject)(maybeDefault((SubLObject)rule_applicability_tree.$sym34$_RULE_APPLICABILITY_TREE_MAP_, rule_applicability_tree.$rule_applicability_tree_map$, rule_applicability_tree.$kw35$UNINITIALIZED)));
        return (SubLObject)rule_applicability_tree.NIL;
    }
    
    public static SubLObject setup_rule_applicability_tree_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rule_applicability_tree.$sym34$_RULE_APPLICABILITY_TREE_MAP_);
        memoization_state.note_memoized_function((SubLObject)rule_applicability_tree.$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rule_applicability_tree.$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO);
        return (SubLObject)rule_applicability_tree.NIL;
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
        me = (SubLFile)new rule_applicability_tree();
        rule_applicability_tree.$rule_applicability_tree_map$ = null;
        $kw0$RULE_BINDING_VALUE_MAP = SubLObjectFactory.makeKeyword("RULE-BINDING-VALUE-MAP");
        $sym1$_ = SubLObjectFactory.makeSymbol("=");
        $sym2$DICTIONARY_LENGTH = SubLObjectFactory.makeSymbol("DICTIONARY-LENGTH");
        $sym3$INVALID_FORT_ = SubLObjectFactory.makeSymbol("INVALID-FORT?");
        $sym4$KCT_TEST_RUN_QUERY_RUN = SubLObjectFactory.makeSymbol("KCT-TEST-RUN-QUERY-RUN");
        $str5$Saving_rule_variable_map_data_fil = SubLObjectFactory.makeString("Saving rule variable map data files");
        $sym6$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("TUPLES"));
        $str8$rule_ = SubLObjectFactory.makeString("rule-");
        $str9$_tuples_txt = SubLObjectFactory.makeString("-tuples.txt");
        $kw10$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str11$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym12$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $str13$__file____S = SubLObjectFactory.makeString("~%file : ~S");
        $str14$___A = SubLObjectFactory.makeString("~%~A");
        $str15$___rule_ = SubLObjectFactory.makeString("~%<rule>");
        $str16$____rule_ = SubLObjectFactory.makeString("~%</rule>");
        $str17$___S = SubLObjectFactory.makeString("~%~S");
        $sym18$HL_TO_EL = SubLObjectFactory.makeSymbol("HL-TO-EL");
        $str19$_ = SubLObjectFactory.makeString("(");
        $str20$______ = SubLObjectFactory.makeString(" #||# ");
        $str21$_ = SubLObjectFactory.makeString(")");
        $sym22$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str23$Reading_rule_applicability_trees = SubLObjectFactory.makeString("Reading rule applicability trees");
        $str24$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym25$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw26$AND = SubLObjectFactory.makeKeyword("AND");
        $str27$file__A____A__ = SubLObjectFactory.makeString("file ~A:~%~A~%");
        $kw28$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str29$_________ = SubLObjectFactory.makeString("_________");
        $str30$unexpected_form___S = SubLObjectFactory.makeString("unexpected form: ~S");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("OR"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREES"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("N1"), (SubLObject)SubLObjectFactory.makeSymbol("N2"), (SubLObject)SubLObjectFactory.makeSymbol("N3"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"));
        $sym34$_RULE_APPLICABILITY_TREE_MAP_ = SubLObjectFactory.makeSymbol("*RULE-APPLICABILITY-TREE-MAP*");
        $kw35$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $float36$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $kw37$OR = SubLObjectFactory.makeKeyword("OR");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAILURE"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL"));
        $sym39$GENERALIZED_TRANSFORMATION_LINK_P = SubLObjectFactory.makeSymbol("GENERALIZED-TRANSFORMATION-LINK-P");
        $str40$unexpected_link____S = SubLObjectFactory.makeString("unexpected link : ~S");
        $sym41$TRANSFORMATION_LINK_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-P");
        $sym42$RESIDUAL_TRANSFORMATION_LINK_P = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-P");
        $sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED = SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED");
        $sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED");
        $list45 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym46$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym47$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $const48$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
    }
}

/*

	Total time: 312 ms
	
*/