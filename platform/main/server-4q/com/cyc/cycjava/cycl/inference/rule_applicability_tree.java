package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.defns;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.stream_buffer;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class rule_applicability_tree extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.rule_applicability_tree";
	public static String myFingerPrint = "6c18b3c4181f2dc6a93e995231d519f2836ddc675bb0dcd79e0889f9a7defd02";
	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 8900L)
	private static SubLSymbol $rule_applicability_tree_map$;
	private static SubLSymbol $kw$RULE_BINDING_VALUE_MAP;
	private static SubLSymbol $sym1$_;
	private static SubLSymbol $sym2$DICTIONARY_LENGTH;
	private static SubLSymbol $sym3$INVALID_FORT_;
	private static SubLSymbol $sym4$KCT_TEST_RUN_QUERY_RUN;
	private static SubLString $str5$Saving_rule_variable_map_data_fil;
	private static SubLSymbol $sym6$STRINGP;
	private static SubLList $list7;
	private static SubLString $str8$rule_;
	private static SubLString $str9$_tuples_txt;
	private static SubLSymbol $kw$OUTPUT;
	private static SubLString $str11$Unable_to_open__S;
	private static SubLSymbol $sym12$DOUBLE_FLOAT;
	private static SubLString $str13$__file____S;
	private static SubLString $str14$___A;
	private static SubLString $str15$___rule_;
	private static SubLString $str16$____rule_;
	private static SubLString $str17$___S;
	private static SubLSymbol $sym18$HL_TO_EL;
	private static SubLString $str19$_;
	private static SubLString $str20$______;
	private static SubLString $str21$_;
	private static SubLSymbol $sym22$DIRECTORY_P;
	private static SubLString $str23$Reading_rule_applicability_trees;
	private static SubLString $str24$cdolist;
	private static SubLSymbol $sym25$CATCH_ERROR_MESSAGE_HANDLER;
	private static SubLSymbol $kw$AND;
	private static SubLString $str27$file__A____A__;
	private static SubLSymbol $kw$INPUT;
	private static SubLString $str29$_________;
	private static SubLString $str30$unexpected_form___S;
	private static SubLList $list31;
	private static SubLList $list32;
	private static SubLList $list33;
	private static SubLSymbol $sym34$_RULE_APPLICABILITY_TREE_MAP_;
	private static SubLSymbol $kw$UNINITIALIZED;
	private static SubLFloat $float36$0_5;
	private static SubLSymbol $kw$OR;
	private static SubLList $list38;
	private static SubLSymbol $sym39$GENERALIZED_TRANSFORMATION_LINK_P;
	private static SubLString $str40$unexpected_link____S;
	private static SubLSymbol $sym41$TRANSFORMATION_LINK_P;
	private static SubLSymbol $sym42$RESIDUAL_TRANSFORMATION_LINK_P;
	private static SubLSymbol $sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED;
	private static SubLSymbol $sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO;
	private static SubLList $list45;
	private static SubLSymbol $sym46$TERM__;
	private static SubLSymbol $sym47$FIRST;
	private static SubLObject $const48$BaseKB;
	private static SubLList $list49;

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 1500L)
	public static SubLObject kbq_extract_collated_rule_variable_bindings_map(SubLObject query_set_run) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject metric_values = Sequences.delete(NIL,
				kbq_query_run.kbq_extract_metric_values(query_set_run, $kw$RULE_BINDING_VALUE_MAP, UNPROVIDED),
				UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject rule_variable_maps = Sequences.delete(ZERO_INTEGER, metric_values, Symbols.symbol_function($sym1$_),
				Symbols.symbol_function($sym2$DICTIONARY_LENGTH), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject collated_rule_variable_map = dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED);
		SubLObject cdolist_list_var = rule_variable_maps;
		SubLObject rule_variable_map = NIL;
		rule_variable_map = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject iteration_state;
			for (iteration_state = dictionary_contents.do_dictionary_contents_state(
					dictionary.dictionary_contents(rule_variable_map)); NIL == dictionary_contents
							.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents
									.do_dictionary_contents_next(iteration_state)) {
				thread.resetMultipleValues();
				SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
				SubLObject tuples = thread.secondMultipleValue();
				thread.resetMultipleValues();
				SubLObject cdolist_list_var_$1 = tuples;
				SubLObject tuple = NIL;
				tuple = cdolist_list_var_$1.first();
				while (NIL != cdolist_list_var_$1) {
					if (NIL == list_utilities.tree_find_if(Symbols.symbol_function($sym3$INVALID_FORT_), tuple,
							UNPROVIDED)) {
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

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 2300L)
	public static SubLObject kct_extract_collated_rule_variable_bindings_map(SubLObject test_set_run) {
		SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
		SubLObject query_runs = Mapping.mapcar(Symbols.symbol_function($sym4$KCT_TEST_RUN_QUERY_RUN), test_runs);
		SubLObject query_set_run = kbq_query_run.kbq_make_query_set_run(query_runs, UNPROVIDED);
		return kbq_extract_collated_rule_variable_bindings_map(query_set_run);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 2600L)
	public static SubLObject save_rule_variable_map_files(SubLObject collated_rule_variable_map, SubLObject directory) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject total = ZERO_INTEGER;
		SubLObject mess = $str5$Saving_rule_variable_map_data_fil;
		SubLObject sofar = ZERO_INTEGER;
		SubLObject total_$2 = map_utilities.map_size(collated_rule_variable_map);
		assert NIL != Types.stringp(mess) : mess;
		SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
		try {
			utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
			utilities_macros.$within_noting_percent_progress$.bind(T, thread);
			utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
			try {
				utilities_macros.noting_percent_progress_preamble(mess);
				SubLObject iterator = map_utilities.new_map_iterator(collated_rule_variable_map);
				SubLObject valid;
				for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
					thread.resetMultipleValues();
					SubLObject var = iteration.iteration_next(iterator);
					valid = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != valid) {
						SubLObject current;
						SubLObject datum = current = var;
						SubLObject rule = NIL;
						SubLObject tuples = NIL;
						cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
						rule = current.first();
						current = current.rest();
						cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
						tuples = current.first();
						current = current.rest();
						if (NIL == current) {
							utilities_macros.note_percent_progress(sofar, total_$2);
							sofar = Numbers.add(sofar, ONE_INTEGER);
							SubLObject id = assertion_handles.assertion_id(rule);
							SubLObject filename = Sequences.cconcatenate($str8$rule_,
									new SubLObject[] { format_nil.format_nil_a_no_copy(id), $str9$_tuples_txt });
							SubLObject full_filename = Sequences.cconcatenate(directory, filename);
							SubLObject chlid = kb_utilities.compact_hl_external_id_string(rule);
							SubLObject formula = uncanonicalizer.assertion_el_ist_formula(rule);
							SubLObject el_vars = assertions_high.assertion_el_variables(rule);
							SubLObject stream = NIL;
							try {
								SubLObject _prev_bind_0_$3 = stream_macros.$stream_requires_locking$
										.currentBinding(thread);
								try {
									stream_macros.$stream_requires_locking$.bind(NIL, thread);
									stream = compatibility.open_text(full_filename, $kw$OUTPUT);
								} finally {
									stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$3, thread);
								}
								if (!stream.isStream()) {
									Errors.error($str11$Unable_to_open__S, full_filename);
								}
								SubLObject stream_$4 = stream;
								SubLObject _prev_bind_0_$4 = reader.$read_default_float_format$.currentBinding(thread);
								SubLObject _prev_bind_1_$6 = print_high.$print_pretty$.currentBinding(thread);
								try {
									reader.$read_default_float_format$.bind($sym12$DOUBLE_FLOAT, thread);
									print_high.$print_pretty$.bind(NIL, thread);
									PrintLow.format(stream_$4, $str13$__file____S, filename);
									PrintLow.format(stream_$4, $str14$___A, chlid);
									PrintLow.format(stream_$4, $str15$___rule_);
									format_cycl_expression.format_cycl_expression(formula, stream_$4, ZERO_INTEGER);
									PrintLow.format(stream_$4, $str16$____rule_);
									PrintLow.format(stream_$4, $str17$___S, el_vars);
									SubLObject cdolist_list_var = tuples;
									SubLObject tuple = NIL;
									tuple = cdolist_list_var.first();
									while (NIL != cdolist_list_var) {
										tuple = Mapping.mapcar(Symbols.symbol_function($sym18$HL_TO_EL), tuple);
										total = Numbers.add(total, ONE_INTEGER);
										streams_high.terpri(stream_$4);
										print_hash_pipe_delimited_list(tuple, stream_$4);
										cdolist_list_var = cdolist_list_var.rest();
										tuple = cdolist_list_var.first();
									}
								} finally {
									print_high.$print_pretty$.rebind(_prev_bind_1_$6, thread);
									reader.$read_default_float_format$.rebind(_prev_bind_0_$4, thread);
								}
							} finally {
								SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind(T, thread);
									SubLObject _values = Values.getValuesAsVector();
									if (stream.isStream()) {
										streams_high.close(stream, UNPROVIDED);
									}
									Values.restoreValuesFromVector(_values);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
								}
							}
						} else {
							cdestructuring_bind.cdestructuring_bind_error(datum, $list7);
						}
					}
				}
			} finally {
				SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values2 = Values.getValuesAsVector();
					utilities_macros.noting_percent_progress_postamble();
					Values.restoreValuesFromVector(_values2);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
				}
			}
		} finally {
			utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
			utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
			utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
			utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
		return total;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 5700L)
	public static SubLObject print_hash_pipe_delimited_list(SubLObject list, SubLObject stream) {
		if (stream == UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		streams_high.write_string($str19$_, stream, UNPROVIDED, UNPROVIDED);
		SubLObject list_var = NIL;
		SubLObject item = NIL;
		SubLObject index = NIL;
		list_var = list;
		item = list_var.first();
		for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), index = Numbers
				.add(ONE_INTEGER, index)) {
			if (!index.isZero()) {
				streams_high.write_string($str20$______, stream, UNPROVIDED, UNPROVIDED);
			}
			print_high.prin1(item, stream);
		}
		streams_high.write_string($str21$_, stream, UNPROVIDED, UNPROVIDED);
		return list;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 6000L)
	public static SubLObject read_rule_applicability_tree_files(SubLObject directory) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != Filesys.directory_p(directory) : directory;
		SubLObject files = Filesys.directory(directory, UNPROVIDED);
		SubLObject rule_applicability_tree_map = dictionary.new_dictionary(Symbols.symbol_function(EQL),
				Sequences.length(files));
		SubLObject list_var = files;
		SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
		SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
		SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
		SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
		SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
		try {
			utilities_macros.$progress_note$.bind($str23$Reading_rule_applicability_trees, thread);
			utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
			utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
			utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
			utilities_macros.$within_noting_percent_progress$.bind(T, thread);
			utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
			try {
				utilities_macros
						.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
				SubLObject csome_list_var = list_var;
				SubLObject file = NIL;
				file = csome_list_var.first();
				while (NIL != csome_list_var) {
					SubLObject rule = NIL;
					SubLObject tree = NIL;
					SubLObject error_message = NIL;
					try {
						thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
						SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind($sym25$CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								SubLObject full_filename = file_utilities.relative_filename(directory, file,
										UNPROVIDED);
								thread.resetMultipleValues();
								SubLObject rule_$10 = read_rule_applicability_tree_file(full_filename);
								SubLObject tree_$11 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								rule = rule_$10;
								tree = tree_$11;
								if (NIL != tree) {
									tree = list($kw$AND, tree);
									tree = canonicalize_rule_applicability_tree_recursive(tree);
								}
								if (NIL != rule) {
									map_utilities.map_put(rule_applicability_tree_map, rule, tree);
								}
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
						}
					} catch (Throwable ccatch_env_var) {
						error_message = Errors.handleThrowable(ccatch_env_var,
								subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
					} finally {
						thread.throwStack.pop();
					}
					if (NIL != error_message) {
						Errors.warn($str27$file__A____A__, file, error_message);
					}
					utilities_macros.$progress_sofar$.setDynamicValue(
							Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER),
							thread);
					utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread),
							utilities_macros.$progress_total$.getDynamicValue(thread));
					csome_list_var = csome_list_var.rest();
					file = csome_list_var.first();
				}
			} finally {
				SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values = Values.getValuesAsVector();
					utilities_macros.noting_percent_progress_postamble();
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
				}
			}
		} finally {
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

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 7200L)
	public static SubLObject read_rule_applicability_tree_file(SubLObject filename) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rule = NIL;
		SubLObject tree = NIL;
		SubLObject stream = NIL;
		try {
			SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
			try {
				stream_macros.$stream_requires_locking$.bind(NIL, thread);
				stream = compatibility.open_text(filename, $kw$INPUT);
			} finally {
				stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
			}
			if (!stream.isStream()) {
				Errors.error($str11$Unable_to_open__S, filename);
			}
			SubLObject stream_$13 = stream;
			SubLObject line_number = ZERO_INTEGER;
			SubLObject separators = ZERO_INTEGER;
			SubLObject done_var;
			SubLObject doneP = done_var = NIL;
			thread.resetMultipleValues();
			SubLObject stream_buffer_var = stream_buffer.do_stream_lines_buffered_initialize(stream_$13, UNPROVIDED);
			SubLObject line_buffer = thread.secondMultipleValue();
			thread.resetMultipleValues();
			while (NIL == done_var) {
				if (NIL != stream_buffer.do_stream_lines_buffered_next(stream_buffer_var, line_buffer)) {
					SubLObject line_string = stream_buffer.string_buffer_string(line_buffer);
					SubLObject line_end = stream_buffer.string_buffer_position(line_buffer);
					if (line_number.numE(ONE_INTEGER)) {
						SubLObject rule_id_string = string_utilities.substring(line_string, ZERO_INTEGER, line_end);
						rule = kb_utilities.find_object_by_compact_hl_external_id_string(rule_id_string);
					} else if (NIL != Sequences.search($str29$_________, line_string, Symbols.symbol_function(EQL),
							Symbols.symbol_function(IDENTITY), ZERO_INTEGER, NIL, ZERO_INTEGER, line_end)) {
						separators = Numbers.add(separators, ONE_INTEGER);
						doneP = Numbers.numE(separators, TWO_INTEGER);
					}
					line_number = Numbers.add(line_number, ONE_INTEGER);
					done_var = doneP;
				} else {
					done_var = T;
				}
			}
			stream_buffer.do_stream_lines_buffered_finalize(line_buffer, stream_buffer_var);
			tree = reader.read(stream_$13, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				Threads.$is_thread_performing_cleanupP$.bind(T, thread);
				SubLObject _values = Values.getValuesAsVector();
				if (stream.isStream()) {
					streams_high.close(stream, UNPROVIDED);
				}
				Values.restoreValuesFromVector(_values);
			} finally {
				Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return Values.values(rule, tree);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 8000L)
	public static SubLObject canonicalize_rule_applicability_tree_recursive(SubLObject tree) {
		if (NIL != tree) {
			if (!tree.isList())
				return Errors.error($str30$unexpected_form___S, tree);
			if (NIL != list_utilities.member_eqP(tree.first(), $list31)) {
				SubLObject operator = NIL;
				SubLObject subtrees = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(tree, tree, $list32);
				operator = tree.first();
				SubLObject current = tree.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list32);
				subtrees = current.first();
				current = current.rest();
				if (NIL == current) {
					SubLObject list_var = NIL;
					SubLObject subtree = NIL;
					SubLObject index = NIL;
					list_var = subtrees;
					subtree = list_var.first();
					for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), subtree = list_var
							.first(), index = Numbers.add(ONE_INTEGER, index)) {
						subtree = canonicalize_rule_applicability_tree_recursive(subtree);
						set_nth(index, subtrees, subtree);
					}
				} else {
					cdestructuring_bind.cdestructuring_bind_error(tree, $list32);
				}
			} else {
				if (NIL == cycl_variables.el_varP(tree.first()))
					return Errors.error($str30$unexpected_form___S, tree);
				SubLObject variable = NIL;
				SubLObject v_term = NIL;
				SubLObject n1 = NIL;
				SubLObject n2 = NIL;
				SubLObject n3 = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(tree, tree, $list33);
				variable = tree.first();
				SubLObject current = tree.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list33);
				v_term = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list33);
				n1 = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list33);
				n2 = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list33);
				n3 = current.first();
				current = current.rest();
				SubLObject subtree2 = current.isCons() ? current.first() : NIL;
				cdestructuring_bind.destructuring_bind_must_listp(current, tree, $list33);
				current = current.rest();
				if (NIL == current) {
					v_term = narts_high.nart_substitute(v_term);
					set_nth(ONE_INTEGER, tree, v_term);
					if (NIL != subtree2) {
						subtree2 = canonicalize_rule_applicability_tree_recursive(subtree2);
						set_nth(FIVE_INTEGER, tree, subtree2);
					}
				} else {
					cdestructuring_bind.cdestructuring_bind_error(tree, $list33);
				}
			}
		}
		return tree;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 9000L)
	public static SubLObject rule_applicability_tree(SubLObject rule) {
		if ($kw$UNINITIALIZED != $rule_applicability_tree_map$.getGlobalValue())
			return map_utilities.map_get_without_values($rule_applicability_tree_map$.getGlobalValue(), rule,
					UNPROVIDED);
		return NIL;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 9300L)
	public static SubLObject rule_has_applicability_treeP(SubLObject rule) {
		return list_utilities.sublisp_boolean(rule_applicability_tree(rule));
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 9400L)
	public static SubLObject generalized_transformation_link_success_probability_estimate(SubLObject link) {
		SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
		if (NIL == rule_has_applicability_treeP(rule))
			return $float36$0_5;
		SubLObject v_bindings = generalized_transformation_link_bindings_wrt_applicability_tree(link);
		return rule_bindings_success_probability_estimate(rule, v_bindings);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 10400L)
	public static SubLObject rule_bindings_success_probability_estimate(SubLObject rule, SubLObject v_bindings) {
		SubLObject tree = rule_applicability_tree(rule);
		if (NIL == tree)
			return $float36$0_5;
		return rule_bindings_success_probability_estimate_recursive(v_bindings, tree);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 10700L)
	public static SubLObject rule_bindings_success_probability_estimate_recursive(SubLObject v_bindings,
			SubLObject tree) {
		SubLObject pcase_var;
		SubLObject operator = pcase_var = tree.first();
		if (pcase_var.eql($kw$AND)) {
			SubLObject subtrees = conses_high.second(tree);
			SubLObject probability = ONE_INTEGER;
			SubLObject cdolist_list_var = subtrees;
			SubLObject subtree = NIL;
			subtree = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject sub_probability = rule_bindings_success_probability_estimate_recursive(v_bindings, subtree);
				probability = Numbers.multiply(probability, sub_probability);
				cdolist_list_var = cdolist_list_var.rest();
				subtree = cdolist_list_var.first();
			}
			return probability;
		}
		if (pcase_var.eql($kw$OR)) {
			SubLObject subtrees = conses_high.second(tree);
			SubLObject probability = ONE_INTEGER;
			SubLObject cdolist_list_var = subtrees;
			SubLObject subtree = NIL;
			subtree = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject sub_probability = rule_bindings_success_probability_estimate_recursive(v_bindings, subtree);
				probability = Numbers.multiply(probability, Numbers.subtract(ONE_INTEGER, sub_probability));
				cdolist_list_var = cdolist_list_var.rest();
				subtree = cdolist_list_var.first();
			}
			return Numbers.subtract(ONE_INTEGER, probability);
		}
		SubLObject variable = NIL;
		SubLObject constraint = NIL;
		SubLObject success = NIL;
		SubLObject failure = NIL;
		SubLObject total = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(tree, tree, $list38);
		variable = tree.first();
		SubLObject current = tree.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list38);
		constraint = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list38);
		success = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list38);
		failure = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, tree, $list38);
		total = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(tree, $list38);
			return NIL;
		}
		SubLObject value = list_utilities.alist_lookup(v_bindings, variable, UNPROVIDED, UNPROVIDED);
		if (NIL == value)
			return ONE_INTEGER;
		if (NIL != rule_bindings_value_satisfies_constraintP(value, constraint))
			return rule_bindings_match_probability(success, total);
		return ZERO_INTEGER;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 12100L)
	public static SubLObject rule_bindings_value_satisfies_constraintP(SubLObject value, SubLObject constraint) {
		return makeBoolean((NIL != kb_utilities.kbeq(value, constraint))
				|| (NIL != ((NIL != fort_types_interface.isa_collection_in_any_mtP(value))
						? makeBoolean(NIL == genls.not_genlP(value, constraint, UNPROVIDED, UNPROVIDED))
						: makeBoolean(NIL == isa.not_isaP(value, constraint, UNPROVIDED, UNPROVIDED)))));
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 12400L)
	public static SubLObject rule_bindings_match_probability(SubLObject success, SubLObject total) {
		return Numbers.divide(success, total);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 12500L)
	public static SubLObject generalized_transformation_link_bindings_wrt_applicability_tree(SubLObject link) {
		assert NIL != inference_worker_transformation.generalized_transformation_link_p(link) : link;
		if (NIL != inference_worker_transformation.transformation_link_p(link))
			return transformation_link_bindings_wrt_applicability_tree(link);
		if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link))
			return residual_transformation_link_bindings_wrt_applicability_tree(link);
		return Errors.error($str40$unexpected_link____S, link);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13000L)
	public static SubLObject transformation_link_bindings_wrt_applicability_tree(SubLObject t_link) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != inference_worker_transformation.transformation_link_p(t_link) : t_link;
		SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
		SubLObject result = NIL;
		SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
		SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				result = transformation_link_bindings_wrt_applicability_tree_memoized(t_link);
			} finally {
				SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values = Values.getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state,
							original_memoization_process);
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13300L)
	public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree(SubLObject rt_link) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link) : rt_link;
		SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
		SubLObject result = NIL;
		SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
		SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				result = residual_transformation_link_bindings_wrt_applicability_tree_memoized(rt_link);
			} finally {
				SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values = Values.getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state,
							original_memoization_process);
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13700L)
	public static SubLObject transformation_link_bindings_wrt_applicability_tree_memoized_internal(SubLObject t_link) {
		SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
		SubLObject el_bindings = inference_worker_transformation.transformation_link_el_bindings(t_link);
		SubLObject applicability_bindings = compute_bindings_wrt_applicability_tree(el_bindings, problem);
		return applicability_bindings;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 13700L)
	public static SubLObject transformation_link_bindings_wrt_applicability_tree_memoized(SubLObject t_link) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state)
			return transformation_link_bindings_wrt_applicability_tree_memoized_internal(t_link);
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state,
				$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(
					memoization_state.memoization_state_lock(v_memoization_state),
					$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, ONE_INTEGER, NIL, EQL,
					UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state,
					$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, t_link,
				memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(
					transformation_link_bindings_wrt_applicability_tree_memoized_internal(t_link)));
			memoization_state.caching_state_put(caching_state, t_link, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 14100L)
	public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(
			SubLObject rt_link) {
		SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
		SubLObject el_bindings = inference_worker_residual_transformation
				.residual_transformation_link_el_bindings(rt_link);
		SubLObject applicability_bindings = compute_bindings_wrt_applicability_tree(el_bindings, problem);
		return applicability_bindings;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 14100L)
	public static SubLObject residual_transformation_link_bindings_wrt_applicability_tree_memoized(SubLObject rt_link) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state)
			return residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(rt_link);
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state,
				$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(
					memoization_state.memoization_state_lock(v_memoization_state),
					$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, ONE_INTEGER, NIL, EQL,
					UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state,
					$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, rt_link,
				memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(
					residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal(rt_link)));
			memoization_state.caching_state_put(caching_state, rt_link, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 14500L)
	public static SubLObject compute_bindings_wrt_applicability_tree(SubLObject el_bindings, SubLObject problem) {
		SubLObject applicability_bindings = NIL;
		SubLObject cdolist_list_var = el_bindings;
		SubLObject el_binding = NIL;
		el_binding = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = el_binding;
			SubLObject variable = NIL;
			SubLObject value = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list45);
			variable = current.first();
			current = (value = current.rest());
			if (NIL != unification.base_variable_p(value)) {
				value = problem_variable_constraints_wrt_applicability(problem, value);
			}
			applicability_bindings = cons(bindings.make_variable_binding(variable, value), applicability_bindings);
			cdolist_list_var = cdolist_list_var.rest();
			el_binding = cdolist_list_var.first();
		}
		applicability_bindings = Sort.sort(applicability_bindings, Symbols.symbol_function($sym46$TERM__),
				Symbols.symbol_function($sym47$FIRST));
		return applicability_bindings;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 15000L)
	public static SubLObject problem_variable_constraints_wrt_applicability(SubLObject problem, SubLObject variable) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
		SubLObject query_wrt_var = problem_query_wrt_var(problem_query, variable);
		SubLObject formula = inference_czer.problem_query_formula(query_wrt_var);
		thread.resetMultipleValues();
		SubLObject subformula = czer_utilities.unwrap_if_ist(formula, $const48$BaseKB, UNPROVIDED);
		SubLObject mt = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject genl_constraints = genls.min_cols(
				at_var_types.formula_variable_genl_constraints(variable, subformula, mt, UNPROVIDED), mt, UNPROVIDED);
		SubLObject isa_constraints = (NIL != genl_constraints) ? NIL
				: genls.min_cols(at_var_types.formula_variable_isa_constraints(variable, subformula, mt, UNPROVIDED),
						mt, UNPROVIDED);
		SubLObject genericized_term = defns.genericize_constraints_wrt_types(isa_constraints, genl_constraints, mt);
		return genericized_term;
	}

	@SubL(source = "cycl/inference/rule-applicability-tree.lisp", position = 15800L)
	public static SubLObject problem_query_wrt_var(SubLObject problem_query, SubLObject variable) {
		SubLObject new_clauses = NIL;
		SubLObject cdolist_list_var = problem_query;
		SubLObject clause = NIL;
		clause = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = clause;
			SubLObject neg_lits = NIL;
			SubLObject pos_lits = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list49);
			neg_lits = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list49);
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
				new_neg_lits = Sequences.nreverse(new_neg_lits);
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
				new_pos_lits = Sequences.nreverse(new_pos_lits);
				new_clauses = cons(clauses.make_clause(new_neg_lits, new_pos_lits), new_clauses);
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, $list49);
			}
			cdolist_list_var = cdolist_list_var.rest();
			clause = cdolist_list_var.first();
		}
		return Sequences.nreverse(new_clauses);
	}

	public static SubLObject declare_rule_applicability_tree_file() {
		declareFunction(myName, "kbq_extract_collated_rule_variable_bindings_map",
				"KBQ-EXTRACT-COLLATED-RULE-VARIABLE-BINDINGS-MAP", 1, 0, false);
		declareFunction(myName, "kct_extract_collated_rule_variable_bindings_map",
				"KCT-EXTRACT-COLLATED-RULE-VARIABLE-BINDINGS-MAP", 1, 0, false);
		declareFunction(myName, "save_rule_variable_map_files", "SAVE-RULE-VARIABLE-MAP-FILES", 2, 0, false);
		declareFunction(myName, "print_hash_pipe_delimited_list", "PRINT-HASH-PIPE-DELIMITED-LIST", 1, 1, false);
		declareFunction(myName, "read_rule_applicability_tree_files", "READ-RULE-APPLICABILITY-TREE-FILES", 1, 0,
				false);
		declareFunction(myName, "read_rule_applicability_tree_file", "READ-RULE-APPLICABILITY-TREE-FILE", 1, 0, false);
		declareFunction(myName, "canonicalize_rule_applicability_tree_recursive",
				"CANONICALIZE-RULE-APPLICABILITY-TREE-RECURSIVE", 1, 0, false);
		declareFunction(myName, "rule_applicability_tree", "RULE-APPLICABILITY-TREE", 1, 0, false);
		declareFunction(myName, "rule_has_applicability_treeP", "RULE-HAS-APPLICABILITY-TREE?", 1, 0, false);
		declareFunction(myName, "generalized_transformation_link_success_probability_estimate",
				"GENERALIZED-TRANSFORMATION-LINK-SUCCESS-PROBABILITY-ESTIMATE", 1, 0, false);
		declareFunction(myName, "rule_bindings_success_probability_estimate",
				"RULE-BINDINGS-SUCCESS-PROBABILITY-ESTIMATE", 2, 0, false);
		declareFunction(myName, "rule_bindings_success_probability_estimate_recursive",
				"RULE-BINDINGS-SUCCESS-PROBABILITY-ESTIMATE-RECURSIVE", 2, 0, false);
		declareFunction(myName, "rule_bindings_value_satisfies_constraintP",
				"RULE-BINDINGS-VALUE-SATISFIES-CONSTRAINT?", 2, 0, false);
		declareFunction(myName, "rule_bindings_match_probability", "RULE-BINDINGS-MATCH-PROBABILITY", 2, 0, false);
		declareFunction(myName, "generalized_transformation_link_bindings_wrt_applicability_tree",
				"GENERALIZED-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
		declareFunction(myName, "transformation_link_bindings_wrt_applicability_tree",
				"TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
		declareFunction(myName, "residual_transformation_link_bindings_wrt_applicability_tree",
				"RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE", 1, 0, false);
		declareFunction(myName, "transformation_link_bindings_wrt_applicability_tree_memoized_internal",
				"TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED-INTERNAL", 1, 0, false);
		declareFunction(myName, "transformation_link_bindings_wrt_applicability_tree_memoized",
				"TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED", 1, 0, false);
		declareFunction(myName, "residual_transformation_link_bindings_wrt_applicability_tree_memoized_internal",
				"RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED-INTERNAL", 1, 0, false);
		declareFunction(myName, "residual_transformation_link_bindings_wrt_applicability_tree_memoized",
				"RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED", 1, 0, false);
		declareFunction(myName, "compute_bindings_wrt_applicability_tree", "COMPUTE-BINDINGS-WRT-APPLICABILITY-TREE", 2,
				0, false);
		declareFunction(myName, "problem_variable_constraints_wrt_applicability",
				"PROBLEM-VARIABLE-CONSTRAINTS-WRT-APPLICABILITY", 2, 0, false);
		declareFunction(myName, "problem_query_wrt_var", "PROBLEM-QUERY-WRT-VAR", 2, 0, false);
		return NIL;
	}

	public static SubLObject init_rule_applicability_tree_file() {
		$rule_applicability_tree_map$ = deflexical("*RULE-APPLICABILITY-TREE-MAP*",
				(maybeDefault($sym34$_RULE_APPLICABILITY_TREE_MAP_, $rule_applicability_tree_map$, $kw$UNINITIALIZED)));
		return NIL;
	}

	public static SubLObject setup_rule_applicability_tree_file() {
		subl_macro_promotions.declare_defglobal($sym34$_RULE_APPLICABILITY_TREE_MAP_);
		memoization_state.note_memoized_function($sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED);
		memoization_state
				.note_memoized_function($sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO);
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
		me = new rule_applicability_tree();
		$rule_applicability_tree_map$ = null;
		$kw$RULE_BINDING_VALUE_MAP = makeKeyword("RULE-BINDING-VALUE-MAP");
		$sym1$_ = makeSymbol("=");
		$sym2$DICTIONARY_LENGTH = makeSymbol("DICTIONARY-LENGTH");
		$sym3$INVALID_FORT_ = makeSymbol("INVALID-FORT?");
		$sym4$KCT_TEST_RUN_QUERY_RUN = makeSymbol("KCT-TEST-RUN-QUERY-RUN");
		$str5$Saving_rule_variable_map_data_fil = makeString("Saving rule variable map data files");
		$sym6$STRINGP = makeSymbol("STRINGP");
		$list7 = list(makeSymbol("RULE"), makeSymbol("TUPLES"));
		$str8$rule_ = makeString("rule-");
		$str9$_tuples_txt = makeString("-tuples.txt");
		$kw$OUTPUT = makeKeyword("OUTPUT");
		$str11$Unable_to_open__S = makeString("Unable to open ~S");
		$sym12$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
		$str13$__file____S = makeString("~%file : ~S");
		$str14$___A = makeString("~%~A");
		$str15$___rule_ = makeString("~%<rule>");
		$str16$____rule_ = makeString("~%</rule>");
		$str17$___S = makeString("~%~S");
		$sym18$HL_TO_EL = makeSymbol("HL-TO-EL");
		$str19$_ = makeString("(");
		$str20$______ = makeString(" #||# ");
		$str21$_ = makeString(")");
		$sym22$DIRECTORY_P = makeSymbol("DIRECTORY-P");
		$str23$Reading_rule_applicability_trees = makeString("Reading rule applicability trees");
		$str24$cdolist = makeString("cdolist");
		$sym25$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
		$kw$AND = makeKeyword("AND");
		$str27$file__A____A__ = makeString("file ~A:~%~A~%");
		$kw$INPUT = makeKeyword("INPUT");
		$str29$_________ = makeString("_________");
		$str30$unexpected_form___S = makeString("unexpected form: ~S");
		$list31 = list(makeKeyword("AND"), makeKeyword("OR"));
		$list32 = list(makeSymbol("OPERATOR"), makeSymbol("SUBTREES"));
		$list33 = list(makeSymbol("VARIABLE"), makeSymbol("TERM"), makeSymbol("N1"), makeSymbol("N2"), makeSymbol("N3"),
				makeSymbol("&OPTIONAL"), makeSymbol("SUBTREE"));
		$sym34$_RULE_APPLICABILITY_TREE_MAP_ = makeSymbol("*RULE-APPLICABILITY-TREE-MAP*");
		$kw$UNINITIALIZED = makeKeyword("UNINITIALIZED");
		$float36$0_5 = makeDouble(0.5);
		$kw$OR = makeKeyword("OR");
		$list38 = list(makeSymbol("VARIABLE"), makeSymbol("CONSTRAINT"), makeSymbol("SUCCESS"), makeSymbol("FAILURE"),
				makeSymbol("TOTAL"));
		$sym39$GENERALIZED_TRANSFORMATION_LINK_P = makeSymbol("GENERALIZED-TRANSFORMATION-LINK-P");
		$str40$unexpected_link____S = makeString("unexpected link : ~S");
		$sym41$TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");
		$sym42$RESIDUAL_TRANSFORMATION_LINK_P = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-P");
		$sym43$TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMOIZED = makeSymbol(
				"TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED");
		$sym44$RESIDUAL_TRANSFORMATION_LINK_BINDINGS_WRT_APPLICABILITY_TREE_MEMO = makeSymbol(
				"RESIDUAL-TRANSFORMATION-LINK-BINDINGS-WRT-APPLICABILITY-TREE-MEMOIZED");
		$list45 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
		$sym46$TERM__ = makeSymbol("TERM-<");
		$sym47$FIRST = makeSymbol("FIRST");
		$const48$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
		$list49 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
	}
}
/*
 *
 * Total time: 312 ms
 *
 */