/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.time_has_arrivedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      COLLABORATIVE-SENSE-MAKING-UTILITIES
 *  source file: /cyc/top/cycl/collaborative-sense-making-utilities.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class collaborative_sense_making_utilities extends SubLTranslatedFile implements V02 {
	// // Constructor
	private collaborative_sense_making_utilities() {
	}

	public static final SubLFile me = new collaborative_sense_making_utilities();

	// deflexical
	private static final SubLSymbol $csm_akb_assertions_directory$ = makeSymbol("*CSM-AKB-ASSERTIONS-DIRECTORY*");

	/**
	 * The invariable part of the filename for Collaborative Sense Making
	 * files that contain data dumped primarily for reading by humans.
	 */
	// deflexical
	private static final SubLSymbol $csm_readable_filename$ = makeSymbol("*CSM-READABLE-FILENAME*");

	/**
	 * The invariable part of the filename for Collaborative Sense Making
	 * files that contain HL external ID data dumped for later loading and
	 * analysis.
	 */
	// deflexical
	private static final SubLSymbol $csm_id_filename$ = makeSymbol("*CSM-ID-FILENAME*");

	/**
	 * Gathers the AKB assertions from the KB.
	 */
	public static final SubLObject collect_akb_assertions() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject msg = $$$Collecting_AKB_assertions;
				SubLObject sme_table = set.new_set(symbol_function(EQ), $int$50);
				SubLObject tkb_smes = set_difference(isa.all_fort_instances_in_all_mts($$TKB_SME), list($$ChrisDeaton), UNPROVIDED, UNPROVIDED);
				format(T, $str_alt8$___s_SMEs_collected_, length(tkb_smes));
				{
					SubLObject cdolist_list_var = tkb_smes;
					SubLObject sme = NIL;
					for (sme = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sme = cdolist_list_var.first()) {
						{
							SubLObject sme_id = kb_utilities.hl_external_id_string(sme);
							set.set_add(sme, sme_table);
							sethash(sme_id, $csm_akb_assertions_by_smes$.getGlobalValue(), NIL);
						}
					}
				}
				{
					SubLObject as_count = ZERO_INTEGER;
					SubLObject idx = assertion_handles.do_assertions_table();
					SubLObject total = id_index.id_index_count(idx);
					SubLObject sofar = ZERO_INTEGER;
					SubLSystemTrampolineFile.checkType(msg, STRINGP);
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
							utilities_macros.noting_percent_progress_preamble(msg);
							if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
								{
									SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
									SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
									SubLObject as = NIL;
									while (NIL != id) {
										as = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
										if (NIL != id_index.do_id_index_id_and_object_validP(id, as, $SKIP)) {
											utilities_macros.note_percent_progress(sofar, total);
											sofar = add(sofar, ONE_INTEGER);
											{
												SubLObject cyclist = assertions_high.asserted_by(as);
												if (NIL != set.set_memberP(cyclist, sme_table)) {
													{
														SubLObject cyclist_id = kb_utilities.hl_external_id_string(cyclist);
														if (NIL != cyclist_id) {
															hash_table_utilities.push_hash(cyclist_id, as, $csm_akb_assertions_by_smes$.getGlobalValue());
															as_count = add(as_count, ONE_INTEGER);
															if (as_count.numE($int$100) || mod(as_count, $int$1000).numE(ZERO_INTEGER)) {
																print(as_count, UNPROVIDED);
															}
														}
													}
												}
											}
										}
										id = id_index.do_id_index_next_id(idx, T, id, state_var);
										state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
									}
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
			}
			return NIL;
		}
	}

	public static final SubLObject get_date_string_for_run() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject second = decode_universal_time(get_universal_time(), UNPROVIDED);
				SubLObject minute = thread.secondMultipleValue();
				SubLObject hour = thread.thirdMultipleValue();
				SubLObject day = thread.fourthMultipleValue();
				SubLObject month = thread.fifthMultipleValue();
				SubLObject year = thread.sixthMultipleValue();
				thread.resetMultipleValues();
				return cconcatenate(format_nil.format_nil_a_no_copy(year), new SubLObject[] { $str_alt13$_, format_nil.format_nil_a_no_copy(month), $str_alt13$_, format_nil.format_nil_a_no_copy(day), $str_alt13$_, format_nil.format_nil_a_no_copy(hour), $str_alt13$_, format_nil.format_nil_a_no_copy(minute), $str_alt13$_, format_nil.format_nil_a_no_copy(second) });
			}
		}
	}

	public static final SubLObject get_directory_name_for_run() {
		{
			SubLObject date_string = get_date_string_for_run();
			return cconcatenate(format_nil.format_nil_a_no_copy($csm_akb_assertions_directory$.getGlobalValue()), new SubLObject[] { format_nil.format_nil_a_no_copy(date_string), $str_alt14$_ });
		}
	}

	/**
	 * Writes out the AKB assertions gathered by
	 *
	 * @unknown collect-akb-assertions on disk.
	 */
	public static final SubLObject write_akb_assertions() {
		format(T, $str_alt15$__Mapping_over_assertion_lists);
		{
			SubLObject directory_name = get_directory_name_for_run();
			SubLObject sme_id = NIL;
			SubLObject as_list = NIL;
			{
				final Iterator cdohash_iterator = getEntrySetIterator($csm_akb_assertions_by_smes$.getGlobalValue());
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						sme_id = getEntryKey(cdohash_entry);
						as_list = getEntryValue(cdohash_entry);
						{
							SubLObject sme_constant = kb_utilities.find_object_by_hl_external_id_string(sme_id);
							SubLObject sme_name = constants_high.constant_name(sme_constant);
							SubLObject outfile1 = cconcatenate(format_nil.format_nil_a_no_copy(directory_name), new SubLObject[] { format_nil.format_nil_a_no_copy(sme_name), format_nil.format_nil_a_no_copy($csm_readable_filename$.getGlobalValue()) });
							SubLObject outfile2 = cconcatenate(format_nil.format_nil_a_no_copy(directory_name), new SubLObject[] { format_nil.format_nil_a_no_copy(sme_name), format_nil.format_nil_a_no_copy($csm_id_filename$.getGlobalValue()) });
							SubLObject sorted_as_list = Sort.stable_sort(as_list, symbol_function($sym16$_), ASSERTION_UNIVERSAL_TIME);
							format(T, $str_alt18$__Writing__a, outfile1);
							file_utilities.make_directory_recursive(directory_name, UNPROVIDED, UNPROVIDED);
							{
								SubLObject stream_var = NIL;
								try {
									stream_var = StreamsLow.open(outfile1, new SubLObject[] { $DIRECTION, $OUTPUT, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $CREATE });
									{
										SubLObject out1 = stream_var;
										SubLObject stream_var_1 = NIL;
										try {
											stream_var_1 = StreamsLow.open(outfile2, new SubLObject[] { $DIRECTION, $OUTPUT, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $CREATE });
											{
												SubLObject out2 = stream_var_1;
												format(out1, $str_alt25$_____a__, outfile1);
												format(out1, $str_alt26$______sme_name___date_int___secon);
												format(out2, $str_alt25$_____a__, outfile2);
												format(out2, $str_alt27$______sme_id___assertion_universa);
												{
													SubLObject cdolist_list_var = sorted_as_list;
													SubLObject as = NIL;
													for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), as = cdolist_list_var.first()) {
														{
															SubLObject as_date_int = assertions_high.asserted_when(as);
															SubLObject as_date = (as_date_int.isInteger()) ? ((SubLObject) (as_date_int)) : MINUS_ONE_INTEGER;
															SubLObject as_second_int = assertions_high.asserted_second(as);
															SubLObject as_second = (as_second_int.isInteger()) ? ((SubLObject) (as_second_int)) : MINUS_ONE_INTEGER;
															SubLObject as_time_int = assertion_utilities.assertion_universal_time(as);
															SubLObject as_time = (NIL != numeric_date_utilities.universal_time_p(as_time_int)) ? ((SubLObject) (as_time_int)) : MINUS_ONE_INTEGER;
															SubLObject as_formula = assertions_high.assertion_ist_formula(as);
															SubLObject formula_id = kb_utilities.hl_external_id_string(as_formula);
															SubLObject as_forts = assertions_high.assertion_forts(as, T, T, NIL, UNPROVIDED);
															SubLObject as_fort_ids = Mapping.mapcar(symbol_function(HL_EXTERNAL_ID_STRING), as_forts);
															format(out1, $str_alt29$__s__s__s__s__s___, new SubLObject[] { sme_name, as_date, as_second, as_formula, as_forts });
															format(out2, $str_alt30$__s__s__s__s___, new SubLObject[] { sme_id, as_time, formula_id, as_fort_ids });
														}
													}
												}
											}
										} finally {
											{
												SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
												try {
													bind($is_thread_performing_cleanupP$, T);
													if (NIL != stream_var_1) {
														close(stream_var_1, UNPROVIDED);
													}
												} finally {
													rebind($is_thread_performing_cleanupP$, _prev_bind_0);
												}
											}
										}
									}
								} finally {
									{
										SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
										try {
											bind($is_thread_performing_cleanupP$, T);
											if (NIL != stream_var) {
												close(stream_var, UNPROVIDED);
											}
										} finally {
											rebind($is_thread_performing_cleanupP$, _prev_bind_0);
										}
									}
								}
							}
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return NIL;
	}

	/**
	 * Gathers the AKB assertions from the KB and writes
	 * them out on disk.
	 */
	public static final SubLObject save_akb_assertions_to_files() {
		collect_akb_assertions();
		write_akb_assertions();
		return DONE;
	}

	/**
	 * Analyzes the AKB assertions that are saved out in the SME files
	 * in DIRECTORY-NAME to detect any missed collaboration opportunities.
	 */
	public static final SubLObject analyze_akb_assertions(SubLObject directory_name, SubLObject try_no) {
		if (try_no == UNPROVIDED) {
			try_no = ONE_INTEGER;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject no_of_analyses = ZERO_INTEGER;
				SubLObject state = memoization_state.possibly_new_memoization_state();
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject tkb_smes = set_difference(isa.all_fort_instances_in_all_mts($$TKB_SME), list($$ChrisDeaton), UNPROVIDED, UNPROVIDED);
									SubLObject sme_count = length(tkb_smes);
									SubLObject i = NIL;
									for (i = ZERO_INTEGER; !i.numGE(sme_count); i = number_utilities.f_1X(i)) {
										{
											SubLObject sme1 = nth(i, tkb_smes);
											SubLObject sme1_name = constants_high.constant_name(sme1);
											SubLObject sme1_file = cconcatenate(format_nil.format_nil_a_no_copy(directory_name), new SubLObject[] { format_nil.format_nil_a_no_copy(sme1_name), format_nil.format_nil_a_no_copy($csm_id_filename$.getGlobalValue()) });
											SubLObject j = NIL;
											for (j = number_utilities.f_1X(i); !j.numGE(sme_count); j = number_utilities.f_1X(j)) {
												{
													SubLObject sme2 = nth(j, tkb_smes);
													SubLObject sme2_name = constants_high.constant_name(sme2);
													SubLObject sme2_file = cconcatenate(format_nil.format_nil_a_no_copy(directory_name), new SubLObject[] { format_nil.format_nil_a_no_copy(sme2_name), format_nil.format_nil_a_no_copy($csm_id_filename$.getGlobalValue()) });
													SubLObject outfile = cconcatenate(format_nil.format_nil_a_no_copy(directory_name), new SubLObject[] { format_nil.format_nil_a_no_copy(sme1_name), $str_alt33$_and_, format_nil.format_nil_a_no_copy(sme2_name), $str_alt34$_missed_opportunities_, format_nil.format_nil_a_no_copy(try_no), $str_alt35$_lisp });
													format(T, $str_alt36$__Analyzing_assertions_by__a_and_, sme1_name, sme2_name);
													force_output(UNPROVIDED);
													no_of_analyses = add(no_of_analyses, ONE_INTEGER);
													analyze_sme_assertions(sme1_file, sme2_file, outfile, sme1_name, sme2_name);
												}
											}
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return no_of_analyses;
			}
		}
	}

	/**
	 * Analyzes the AKB assertions that are saved out in files
	 * SME-FILE1 and SME-FILE2 to detect any missed collaboration opportunities.
	 * The results of the analysis is written out in OUTFILE.
	 */
	public static final SubLObject analyze_sme_assertions(SubLObject sme_file1, SubLObject sme_file2, SubLObject outfile, SubLObject sme_name1, SubLObject sme_name2) {
		if (sme_name1 == UNPROVIDED) {
			sme_name1 = NIL;
		}
		if (sme_name2 == UNPROVIDED) {
			sme_name2 = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				SubLObject start_date_1 = NIL;
				SubLObject end_date_1 = NIL;
				SubLObject bag_of_terms_1 = NIL;
				SubLObject topic_list_1 = NIL;
				SubLObject next_start_date_1 = NIL;
				SubLObject next_term_list_1 = NIL;
				SubLObject next_topic_list_1 = NIL;
				SubLObject continue1P = T;
				SubLObject state = memoization_state.possibly_new_memoization_state();
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject stream_var = NIL;
									try {
										stream_var = StreamsLow.open(outfile, new SubLObject[] { $DIRECTION, $OUTPUT, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $CREATE });
										{
											SubLObject out = stream_var;
											if ((NIL != sme_name1) && (NIL != sme_name2)) {
												format(out, $str_alt37$_____a__a__, sme_name1, sme_name2);
											}
											format(out, $str_alt38$______date_int_1___second_int_1__);
											{
												SubLObject stream_var_3 = NIL;
												try {
													stream_var_3 = StreamsLow.open(sme_file1, new SubLObject[] { $DIRECTION, $INPUT });
													{
														SubLObject in1 = stream_var_3;
														read_line(in1, NIL, EOF, UNPROVIDED);
														read_line(in1, NIL, EOF, UNPROVIDED);
														while (NIL != continue1P) {
															thread.resetMultipleValues();
															{
																SubLObject start_date_1_4 = get_bag_of_terms_from_file(in1, next_start_date_1, next_term_list_1, next_topic_list_1);
																SubLObject end_date_1_5 = thread.secondMultipleValue();
																SubLObject bag_of_terms_1_6 = thread.thirdMultipleValue();
																SubLObject topic_list_1_7 = thread.fourthMultipleValue();
																SubLObject next_start_date_1_8 = thread.fifthMultipleValue();
																SubLObject next_term_list_1_9 = thread.sixthMultipleValue();
																SubLObject next_topic_list_1_10 = thread.seventhMultipleValue();
																thread.resetMultipleValues();
																start_date_1 = start_date_1_4;
																end_date_1 = end_date_1_5;
																bag_of_terms_1 = bag_of_terms_1_6;
																topic_list_1 = topic_list_1_7;
																next_start_date_1 = next_start_date_1_8;
																next_term_list_1 = next_term_list_1_9;
																next_topic_list_1 = next_topic_list_1_10;
															}
															if (NIL == next_start_date_1) {
																continue1P = NIL;
															}
															if (NIL != start_date_1) {
																{
																	SubLObject start_date_2 = NIL;
																	SubLObject end_date_2 = NIL;
																	SubLObject bag_of_terms_2 = NIL;
																	SubLObject topic_list_2 = NIL;
																	SubLObject next_start_date_2 = NIL;
																	SubLObject next_term_list_2 = NIL;
																	SubLObject next_topic_list_2 = NIL;
																	SubLObject continue2P = T;
																	SubLObject stream_var_11 = NIL;
																	try {
																		stream_var_11 = StreamsLow.open(sme_file2, new SubLObject[] { $DIRECTION, $INPUT });
																		{
																			SubLObject in2 = stream_var_11;
																			read_line(in2, NIL, EOF, UNPROVIDED);
																			read_line(in2, NIL, EOF, UNPROVIDED);
																			while (NIL != continue2P) {
																				thread.resetMultipleValues();
																				{
																					SubLObject start_date_2_12 = get_bag_of_terms_from_file(in2, next_start_date_2, next_term_list_2, next_topic_list_2);
																					SubLObject end_date_2_13 = thread.secondMultipleValue();
																					SubLObject bag_of_terms_2_14 = thread.thirdMultipleValue();
																					SubLObject topic_list_2_15 = thread.fourthMultipleValue();
																					SubLObject next_start_date_2_16 = thread.fifthMultipleValue();
																					SubLObject next_term_list_2_17 = thread.sixthMultipleValue();
																					SubLObject next_topic_list_2_18 = thread.seventhMultipleValue();
																					thread.resetMultipleValues();
																					start_date_2 = start_date_2_12;
																					end_date_2 = end_date_2_13;
																					bag_of_terms_2 = bag_of_terms_2_14;
																					topic_list_2 = topic_list_2_15;
																					next_start_date_2 = next_start_date_2_16;
																					next_term_list_2 = next_term_list_2_17;
																					next_topic_list_2 = next_topic_list_2_18;
																				}
																				if (NIL == next_start_date_2) {
																					continue2P = NIL;
																				}
																				if (NIL != start_date_2) {
																					if (NIL != temporally_near_date_clustersP(start_date_1, end_date_1, start_date_2, end_date_2)) {
																						{
																							SubLObject related_term_pairs = conceptually_near_bags_of_terms(bag_of_terms_1, bag_of_terms_2, topic_list_1, topic_list_2);
																							if (NIL != related_term_pairs) {
																								thread.resetMultipleValues();
																								{
																									SubLObject date1_date = numeric_date_utilities.universal_date_and_second_from_time(start_date_1);
																									SubLObject date1_second = thread.secondMultipleValue();
																									thread.resetMultipleValues();
																									thread.resetMultipleValues();
																									{
																										SubLObject date2_date = numeric_date_utilities.universal_date_and_second_from_time(start_date_2);
																										SubLObject date2_second = thread.secondMultipleValue();
																										thread.resetMultipleValues();
																										format(out, $str_alt41$__a__a__a__a__a___, new SubLObject[] { date1_date, date1_second, date2_date, date2_second, related_term_pairs });
																										result = cons(list(date1_date, date1_second, date2_date, date2_second, related_term_pairs), result);
																									}
																								}
																							}
																						}
																					} else {
																						if (start_date_2.numG(start_date_1)) {
																							continue2P = NIL;
																						}
																					}
																				} else {
																					continue2P = NIL;
																				}
																			}
																		}
																	} finally {
																		{
																			SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
																			try {
																				$is_thread_performing_cleanupP$.bind(T, thread);
																				if (NIL != stream_var_11) {
																					close(stream_var_11, UNPROVIDED);
																				}
																			} finally {
																				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
																			}
																		}
																	}
																}
															} else {
																continue1P = NIL;
															}
														}
													}
												} finally {
													{
														SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
														try {
															$is_thread_performing_cleanupP$.bind(T, thread);
															if (NIL != stream_var_3) {
																close(stream_var_3, UNPROVIDED);
															}
														} finally {
															$is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
														}
													}
												}
											}
										}
									} finally {
										{
											SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												if (NIL != stream_var) {
													close(stream_var, UNPROVIDED);
												}
											} finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
											}
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return nreverse(result);
			}
		}
	}

	public static final SubLObject get_bag_of_terms_from_file(SubLObject infile, SubLObject start_date, SubLObject start_term_list, SubLObject start_topic_list) {
		if (start_date == UNPROVIDED) {
			start_date = NIL;
		}
		if (start_term_list == UNPROVIDED) {
			start_term_list = NIL;
		}
		if (start_topic_list == UNPROVIDED) {
			start_topic_list = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == start_date) {
				thread.resetMultipleValues();
				{
					SubLObject start_date_23 = get_assertion_date_term_list_from_file(infile, UNPROVIDED);
					SubLObject start_term_list_24 = thread.secondMultipleValue();
					SubLObject start_topic_list_25 = thread.thirdMultipleValue();
					thread.resetMultipleValues();
					start_date = start_date_23;
					start_term_list = start_term_list_24;
					start_topic_list = start_topic_list_25;
				}
			}
			{
				SubLObject bag_of_terms = start_term_list;
				SubLObject topic_list = start_topic_list;
				SubLObject end_date = start_date;
				SubLObject next_start_date = NIL;
				SubLObject next_term_list = NIL;
				SubLObject next_topic_list = NIL;
				SubLObject continueP = T;
				while (NIL != continueP) {
					thread.resetMultipleValues();
					{
						SubLObject date = get_assertion_date_term_list_from_file(infile, UNPROVIDED);
						SubLObject terms = thread.secondMultipleValue();
						SubLObject topics = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						if (NIL != numeric_date_utilities.universal_time_p(date)) {
							if (NIL != date_within_date_clusterP(date, start_date)) {
								bag_of_terms = append(bag_of_terms, terms);
								topic_list = append(topic_list, topics);
								end_date = date;
							} else {
								next_start_date = date;
								next_term_list = terms;
								next_topic_list = topics;
								continueP = NIL;
							}
						} else {
							continueP = NIL;
						}
					}
				}
				topic_list = list_utilities.fast_delete_duplicates(topic_list, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				next_topic_list = list_utilities.fast_delete_duplicates(next_topic_list, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				return values(start_date, end_date, bag_of_terms, topic_list, next_start_date, next_term_list, next_topic_list);
			}
		}
	}

	public static final SubLObject get_term_from_token(SubLObject token) {
		return kb_utilities.find_object_by_hl_external_id_string(Strings.string_trim($list_alt42, token));
	}

	public static final SubLObject get_assertion_date_term_list_from_file(SubLObject file, SubLObject gather_topicsP) {
		if (gather_topicsP == UNPROVIDED) {
			gather_topicsP = NIL;
		}
		{
			SubLObject line = read_line(file, NIL, EOF, UNPROVIDED);
			if (line != EOF) {
				line = Strings.string_trim($list_alt43, line);
				{
					SubLObject token_list = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject date = string_utilities.string_to_integer(second(token_list));
					SubLObject term_list = Mapping.mapcar(GET_TERM_FROM_TOKEN, nthcdr(THREE_INTEGER, token_list));
					SubLObject topic_list = NIL;
					if (NIL != gather_topicsP) {
						topic_list = get_topics_from_sentence_mt(kb_utilities.find_object_by_hl_external_id_string(third(token_list)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					return values(date, term_list, topic_list);
				}
			}
			return values(NIL, NIL, NIL);
		}
	}

	public static final SubLObject conceptually_near_bags_of_terms(SubLObject bag_of_terms_1, SubLObject bag_of_terms_2, SubLObject topic_list_1, SubLObject topic_list_2) {
		{
			SubLObject topics_1 = determine_topics_for_bag_of_terms(bag_of_terms_1);
			SubLObject topics_2 = determine_topics_for_bag_of_terms(bag_of_terms_2);
			topics_1 = union(topics_1, remove_csm_irrelevant_terms(topic_list_1), symbol_function(EQ), UNPROVIDED);
			topics_2 = union(topics_2, remove_csm_irrelevant_terms(topic_list_2), symbol_function(EQ), UNPROVIDED);
			return conceptually_near_term_lists(topics_1, topics_2);
		}
	}

	public static final SubLObject conceptually_near_term_lists(SubLObject list_of_terms_1, SubLObject list_of_terms_2) {
		return get_conceptually_near_term_pairs(list_of_terms_1, list_of_terms_2);
	}

	public static final SubLObject get_conceptually_near_term_pairs(SubLObject list1, SubLObject list2) {
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = list1;
			SubLObject term1 = NIL;
			for (term1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), term1 = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_26 = list2;
					SubLObject term2 = NIL;
					for (term2 = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest(), term2 = cdolist_list_var_26.first()) {
						{
							SubLObject cosine = conceptually_near_termsP(term1, term2, T);
							if (NIL != cosine) {
								result = cons(list(term1, term2, cosine), result);
							}
						}
					}
				}
			}
			return nreverse(list_utilities.fast_delete_duplicates(result, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		}
	}

	public static final SubLObject with_csm_debugging_level(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt45);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject level = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt45);
					level = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return listS(CLET, list(list($csm_debugging_level$, level)), append(body, NIL));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt45);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject with_csm_debugging_output_destination(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt48);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject destination = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt48);
					destination = current.first();
					current = current.rest();
					{
						SubLObject direction = (current.isCons()) ? ((SubLObject) (current.first())) : $APPEND;
						destructuring_bind_must_listp(current, datum, $list_alt48);
						current = current.rest();
						if (NIL == current) {
							current = temp;
							{
								SubLObject body = current;
								SubLObject stream = $sym50$STREAM;
								SubLObject error = $sym51$ERROR;
								return list(CLET, list(stream),
										list(PCOND, list(listS(EQ, destination, $list_alt53), list(CSETQ, stream, destination)), list(list(STREAMP, destination), listS(CSETQ, stream, $list_alt56)),
												list(list(STRINGP, destination), list(CLET, list(error), list(CATCH_ERROR_MESSAGE, list(error), list(CSETQ, stream, list(OPEN_TEXT, destination, direction))), list(PWHEN, error, list(WARN, $str_alt61$__Encountered_the_following_error, destination, error)))), list(T, list(WARN, $str_alt62$__Invalid_destination__a_for_debu, destination))),
										listS(CLET, list(list($csm_debugging_output_destination_stream$, stream)), append(body, NIL)));
							}
						} else {
							cdestructuring_bind_error(datum, $list_alt48);
						}
					}
				}
			}
		}
		return NIL;
	}

	/**
	 * Sets the level that determines how much debugging output should be produced.
	 */
	public static final SubLObject csm_set_debugging_level(SubLObject level) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != number_utilities.non_negative_number_p(level)) {
				$csm_debugging_level$.setDynamicValue(level, thread);
			} else {
				Errors.warn($str_alt64$___a_is_not_a_valid_debugging_lev, level);
			}
			return $csm_debugging_level$.getDynamicValue(thread);
		}
	}

	/**
	 * Sets the destination to which debugging output should be forwarded.
	 * DESTINATION can be T (interpreted as standard output),
	 * a stream or a pathname.
	 */
	public static final SubLObject csm_set_debugging_output_destination(SubLObject destination, SubLObject direction) {
		if (direction == UNPROVIDED) {
			direction = $APPEND;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (destination == T) {
				$csm_debugging_output_destination_stream$.setDynamicValue(destination, thread);
			} else if (destination.isStream()) {
				$csm_debugging_output_destination_stream$.setDynamicValue(destination, thread);
			} else if (destination.isString()) {
				{
					SubLObject error = NIL;
					try {
						{
							SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
							try {
								Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
								try {
									$csm_debugging_output_destination_stream$.setDynamicValue(compatibility.open_text(destination, direction, UNPROVIDED), thread);
								} catch (Throwable catch_var) {
									Errors.handleThrowable(catch_var, NIL);
								}
							} finally {
								Errors.$error_handler$.rebind(_prev_bind_0, thread);
							}
						}
					} catch (Throwable ccatch_env_var) {
						error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
					}
					if (NIL != error) {
						Errors.warn($str_alt61$__Encountered_the_following_error, destination, error);
					}
				}
			} else {
				Errors.warn($str_alt62$__Invalid_destination__a_for_debu, destination);
			}

			return $csm_debugging_output_destination_stream$.getDynamicValue(thread);
		}
	}

	public static final SubLObject csm_note(SubLObject string) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if ($csm_debugging_level$.getDynamicValue(thread).isPositive()) {
				format($csm_debugging_output_destination_stream$.getDynamicValue(thread), $str_alt66$___a__, string);
				force_output($csm_debugging_output_destination_stream$.getDynamicValue(thread));
			}
			return NIL;
		}
	}

	public static final SubLObject csm_note_error(SubLObject function, SubLObject error_message) {
		{
			SubLObject new_message = cconcatenate($str_alt67$The_following_error_was_caught_wi, new SubLObject[] { format_nil.format_nil_a_no_copy(function), format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(error_message) });
			return csm_note(new_message);
		}
	}

	public static final SubLObject with_csm_catch_error_message(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject function = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt68);
			function = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				SubLObject error_message = $sym69$ERROR_MESSAGE;
				return list(CLET, list(error_message), listS(CATCH_ERROR_MESSAGE, list(error_message), append(body, NIL)), list(PWHEN, error_message, list(CSM_NOTE_ERROR, function, error_message)));
			}
		}
	}

	public static final SubLObject alert_users_about_collaboration_opportunities(SubLObject list_of_col_opps, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		csm_note_potential_collaboration_opportunities(list_of_col_opps, reference_time);
		reify_potential_collaboration_opportunities(list_of_col_opps, reference_time);
		return NIL;
	}

	public static final SubLObject csm_note_potential_collaboration_opportunities(SubLObject list_of_col_opps, SubLObject reference_time) {
		{
			SubLObject error_message = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
						try {
							{
								SubLObject message = (NIL != list_of_col_opps)
										? ((SubLObject) (cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(),
												new SubLObject[] { $str_alt71$The_following_collaboration_oppor, format_nil.format_nil_a_no_copy(numeric_date_utilities.get_universal_date(reference_time, UNPROVIDED)), $str_alt72$_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.get_universal_second(reference_time)), $str_alt73$_, format_nil.$format_nil_percent$.getGlobalValue(),
														format_nil.format_nil_a_no_copy(list_of_col_opps), format_nil.$format_nil_percent$.getGlobalValue() })))
										: cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(),
												new SubLObject[] { $str_alt74$No_collaboration_opportunities_ar, format_nil.format_nil_a_no_copy(numeric_date_utilities.get_universal_date(reference_time, UNPROVIDED)), $str_alt72$_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.get_universal_second(reference_time)), $str_alt75$_, format_nil.$format_nil_percent$.getGlobalValue() });
								csm_note(message);
							}
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			}
			if (NIL != error_message) {
				csm_note_error(CSM_NOTE_POTENTIAL_COLLABORATION_OPPORTUNITIES, error_message);
			}
		}
		return NIL;
	}

	public static final SubLObject reify_potential_collaboration_opportunities(SubLObject list_of_col_opps, SubLObject reference_time) {
		{
			SubLObject col_opp_nats = NIL;
			SubLObject error_message = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
						try {
							{
								SubLObject cycl_date = date_utilities.universal_time_to_cycl_date(reference_time);
								SubLObject cdolist_list_var = list_of_col_opps;
								SubLObject col_opps = NIL;
								for (col_opps = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), col_opps = cdolist_list_var.first()) {
									{
										SubLObject datum = col_opps;
										SubLObject current = datum;
										SubLObject user1 = NIL;
										SubLObject user2 = NIL;
										SubLObject concept_lists = NIL;
										destructuring_bind_must_consp(current, datum, $list_alt77);
										user1 = current.first();
										current = current.rest();
										destructuring_bind_must_consp(current, datum, $list_alt77);
										user2 = current.first();
										current = current.rest();
										destructuring_bind_must_consp(current, datum, $list_alt77);
										concept_lists = current.first();
										current = current.rest();
										if (NIL == current) {
											col_opp_nats = append(reify_potential_collaboration_opportunities_for_users(user1, user2, concept_lists, cycl_date), col_opp_nats);
										} else {
											cdestructuring_bind_error(datum, $list_alt77);
										}
									}
								}
							}
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			}
			if (NIL != error_message) {
				csm_note_error(REIFY_POTENTIAL_COLLABORATION_OPPORTUNITIES, error_message);
			}
			return col_opp_nats;
		}
	}

	public static final SubLObject reify_potential_collaboration_opportunities_for_users(SubLObject user1, SubLObject user2, SubLObject concept_lists, SubLObject cycl_date) {
		{
			SubLObject col_opp_nats = NIL;
			SubLObject cdolist_list_var = concept_lists;
			SubLObject concept_list = NIL;
			for (concept_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), concept_list = cdolist_list_var.first()) {
				col_opp_nats = cons(reify_potential_collaboration_opportunity(user1, user2, concept_list, cycl_date), col_opp_nats);
			}
			return col_opp_nats;
		}
	}

	public static final SubLObject reify_potential_collaboration_opportunity(SubLObject user1, SubLObject user2, SubLObject concept_list, SubLObject cycl_date) {
		{
			SubLObject col_opp_nat = NIL;
			SubLObject error_message = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
						try {
							{
								SubLObject datum = concept_list;
								SubLObject current = datum;
								SubLObject concept1 = NIL;
								SubLObject concept2 = NIL;
								SubLObject cosine = NIL;
								SubLObject v_kb_paths = NIL;
								destructuring_bind_must_consp(current, datum, $list_alt79);
								concept1 = current.first();
								current = current.rest();
								destructuring_bind_must_consp(current, datum, $list_alt79);
								concept2 = current.first();
								current = current.rest();
								destructuring_bind_must_consp(current, datum, $list_alt79);
								cosine = current.first();
								current = current.rest();
								destructuring_bind_must_consp(current, datum, $list_alt79);
								v_kb_paths = current.first();
								current = current.rest();
								if (NIL == current) {
									{
										SubLObject user_concept_set = el_utilities.make_el_set(list(el_utilities.make_el_list(list(user1, concept1), UNPROVIDED), el_utilities.make_el_list(list(user2, concept2), UNPROVIDED)), UNPROVIDED);
										SubLObject col_opp_nat_formula = el_utilities.make_el_formula($const80$DetectionOfCollaborationOpportuni, list(user_concept_set, cycl_date), UNPROVIDED);
										col_opp_nat = csm_create_nart(col_opp_nat_formula);
									}
									if (NIL != nart_handles.nart_p(col_opp_nat)) {
										csm_assert(el_utilities.make_el_formula($const81$dateOfPotentialCollaborationOppor, list(col_opp_nat, cycl_date), UNPROVIDED), $$AnalystDatabaseMt);
									}
								} else {
									cdestructuring_bind_error(datum, $list_alt79);
								}
							}
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			}
			if (NIL != error_message) {
				csm_note_error(REIFY_POTENTIAL_COLLABORATION_OPPORTUNITY, error_message);
			}
			return col_opp_nat;
		}
	}

	// defparameter
	private static final SubLSymbol $csm_irrelevant_term_classes$ = makeSymbol("*CSM-IRRELEVANT-TERM-CLASSES*");

	// defparameter
	private static final SubLSymbol $csm_irrelevant_quoted_term_classes$ = makeSymbol("*CSM-IRRELEVANT-QUOTED-TERM-CLASSES*");

	// defparameter
	private static final SubLSymbol $csm_irrelevant_terms$ = makeSymbol("*CSM-IRRELEVANT-TERMS*");

	// defparameter
	private static final SubLSymbol $csm_irrelevant_nat_functions$ = makeSymbol("*CSM-IRRELEVANT-NAT-FUNCTIONS*");

	// defparameter
	private static final SubLSymbol $csm_irrelevant_name_prefixes$ = makeSymbol("*CSM-IRRELEVANT-NAME-PREFIXES*");

	public static final SubLObject csm_initialize_irrelevant_term_table() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = cr_search_tool.$cr_irrelevant_term_classes$.currentBinding(thread);
				SubLObject _prev_bind_1 = cr_search_tool.$cr_irrelevant_quoted_term_classes$.currentBinding(thread);
				SubLObject _prev_bind_2 = cr_search_tool.$cr_irrelevant_nat_functions$.currentBinding(thread);
				SubLObject _prev_bind_3 = cr_search_tool.$cr_irrelevant_terms$.currentBinding(thread);
				SubLObject _prev_bind_4 = cr_search_tool.$cr_irrelevant_name_prefixes$.currentBinding(thread);
				try {
					cr_search_tool.$cr_irrelevant_term_classes$.bind($csm_irrelevant_term_classes$.getDynamicValue(thread), thread);
					cr_search_tool.$cr_irrelevant_quoted_term_classes$.bind($csm_irrelevant_quoted_term_classes$.getDynamicValue(thread), thread);
					cr_search_tool.$cr_irrelevant_nat_functions$.bind($csm_irrelevant_nat_functions$.getDynamicValue(thread), thread);
					cr_search_tool.$cr_irrelevant_terms$.bind($csm_irrelevant_terms$.getDynamicValue(thread), thread);
					cr_search_tool.$cr_irrelevant_name_prefixes$.bind($csm_irrelevant_name_prefixes$.getDynamicValue(thread), thread);
					cr_search_tool.cr_initialize_irrelevant_term_table();
				} finally {
					cr_search_tool.$cr_irrelevant_name_prefixes$.rebind(_prev_bind_4, thread);
					cr_search_tool.$cr_irrelevant_terms$.rebind(_prev_bind_3, thread);
					cr_search_tool.$cr_irrelevant_nat_functions$.rebind(_prev_bind_2, thread);
					cr_search_tool.$cr_irrelevant_quoted_term_classes$.rebind(_prev_bind_1, thread);
					cr_search_tool.$cr_irrelevant_term_classes$.rebind(_prev_bind_0, thread);
				}
			}
			return NIL;
		}
	}

	/**
	 * Terms that have a generality estimate above this threshold
	 * are considered too general to be useful for the purposes
	 * of collaboration detection
	 */
	// deflexical
	private static final SubLSymbol $conceptual_relatedness_generality_estimate_cutoff$ = makeSymbol("*CONCEPTUAL-RELATEDNESS-GENERALITY-ESTIMATE-CUTOFF*");

	public static final SubLObject term_too_general_for_conceptual_relatednessP_internal(SubLObject v_term) {
		return numG(cardinality_estimates.generality_estimate(v_term), $conceptual_relatedness_generality_estimate_cutoff$.getGlobalValue());
	}

	public static final SubLObject term_too_general_for_conceptual_relatednessP(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return term_too_general_for_conceptual_relatednessP_internal(v_term);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym89$TERM_TOO_GENERAL_FOR_CONCEPTUAL_RELATEDNESS_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym89$TERM_TOO_GENERAL_FOR_CONCEPTUAL_RELATEDNESS_, ONE_INTEGER, $int$100, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym89$TERM_TOO_GENERAL_FOR_CONCEPTUAL_RELATEDNESS_, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw90$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(term_too_general_for_conceptual_relatednessP_internal(v_term)));
						memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static final SubLObject term_name_starts_with_an_irrelevant_prefixP(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject successP = NIL;
				if (NIL != constant_handles.constant_p(v_term)) {
					{
						SubLObject name = constants_high.constant_name(v_term);
						if (NIL == successP) {
							{
								SubLObject csome_list_var = $csm_irrelevant_name_prefixes$.getDynamicValue(thread);
								SubLObject prefix = NIL;
								for (prefix = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), prefix = csome_list_var.first()) {
									successP = string_utilities.starts_with(name, prefix);
								}
							}
						}
					}
				}
				return successP;
			}
		}
	}

	public static final SubLObject csm_irrelevant_natP(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_term)) && (NIL != list_utilities.member_eqP(cycl_utilities.nat_functor(v_term), $csm_irrelevant_nat_functions$.getDynamicValue(thread))));
		}
	}

	public static final SubLObject csm_irrelevant_termP(SubLObject v_term) {
		return makeBoolean((((((NIL == forts.fort_p(v_term)) || (NIL != cr_search_tool.cr_irrelevant_term(v_term))) || (NIL != forts.invalid_fortP(v_term))) || (NIL != term_too_general_for_conceptual_relatednessP(v_term))) || (NIL != term_name_starts_with_an_irrelevant_prefixP(v_term))) || (NIL != csm_irrelevant_natP(v_term)));
	}

	public static final SubLObject remove_csm_irrelevant_terms(SubLObject list) {
		return delete_if($sym91$CSM_IRRELEVANT_TERM_, list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject csm_relevant_termP(SubLObject v_term) {
		return makeBoolean(NIL == csm_irrelevant_termP(v_term));
	}

	// defparameter
	private static final SubLSymbol $csm_term_frequency_for_topicality_cutoff$ = makeSymbol("*CSM-TERM-FREQUENCY-FOR-TOPICALITY-CUTOFF*");

	public static final SubLObject determine_topics_for_bag_of_terms(SubLObject bag_of_terms) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject max_frequency = ZERO_INTEGER;
				SubLObject topics = NIL;
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								{
									SubLObject new_bag_of_terms = remove_csm_irrelevant_terms(bag_of_terms);
									SubLObject term_frequencies = dictionary.new_dictionary(symbol_function(EQ), length(new_bag_of_terms));
									{
										SubLObject cdolist_list_var = new_bag_of_terms;
										SubLObject v_term = NIL;
										for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
											{
												SubLObject frequency = dictionary.dictionary_lookup_without_values(term_frequencies, v_term, ZERO_INTEGER);
												frequency = add(frequency, ONE_INTEGER);
												if (frequency.numG(max_frequency)) {
													max_frequency = frequency;
												}
												dictionary.dictionary_enter(term_frequencies, v_term, frequency);
											}
										}
									}
									{
										SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_frequencies));
										while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
											thread.resetMultipleValues();
											{
												SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
												SubLObject frequency = thread.secondMultipleValue();
												thread.resetMultipleValues();
												if ((frequency == max_frequency) || frequency.numGE($csm_term_frequency_for_topicality_cutoff$.getDynamicValue(thread))) {
													topics = cons(v_term, topics);
												}
												iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
											}
										}
										dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error(DETERMINE_TOPICS_FOR_BAG_OF_TERMS, error_message);
				}
				return values(topics, max_frequency);
			}
		}
	}

	// defparameter
	private static final SubLSymbol $conceptually_near_terms_cosine_cutoff$ = makeSymbol("*CONCEPTUALLY-NEAR-TERMS-COSINE-CUTOFF*");

	// defparameter
	private static final SubLSymbol $csm_cache_unsuccessful_cn_resultsP$ = makeSymbol("*CSM-CACHE-UNSUCCESSFUL-CN-RESULTS?*");

	// defparameter
	private static final SubLSymbol $csm_quit_after_first_kb_pathP$ = makeSymbol("*CSM-QUIT-AFTER-FIRST-KB-PATH?*");

	public static final SubLObject csm_maybe_cache_unsuccessful_cn_results(SubLObject term1, SubLObject term2) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != $csm_cache_unsuccessful_cn_resultsP$.getDynamicValue(thread)) {
				return csm_cache_unsuccessful_cn_results(term1, term2);
			}
			return NIL;
		}
	}

	/**
	 * Determines if TERM1 and TERM2 are conceptually near.
	 * The method used is a combination of the statistical cosine method
	 * and an ontology-based search for "interesting" KB paths
	 * between the given terms. According to this method, first
	 * conceptual co-occurrence vectors are computed for TERM1
	 * and TERM2 given the current state of the KB. If the cosine
	 * of the angle between those vectors is above a certain threshold
	 * (as of September 2, 2006, this threshold is 0.24) and one
	 * or more "interesting" KB paths exist between the terms in
	 * question then the terms are considered conceptually near.
	 * The "interestingness" a path is determined by the concepts
	 * that appear as its nodes and the assertions that appear as
	 * its links. For example, paths that contain node concepts
	 * above a certain generality level are deemed uninteresting.
	 */
	public static final SubLObject conceptually_near_termsP(SubLObject term1, SubLObject term2, SubLObject quit_after_first_kb_pathP) {
		if (quit_after_first_kb_pathP == UNPROVIDED) {
			quit_after_first_kb_pathP = $csm_quit_after_first_kb_pathP$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (term1 == term2) {
				return values(T, $IDENTITY);
			}
			if (NIL != csm_terms_known_not_to_be_conceptually_nearP(term1, term2)) {
				return values(NIL, NIL);
			}
			{
				SubLObject cosine = NIL;
				SubLObject justifications = NIL;
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								cosine = compute_cosine_between_term_vectors(term1, term2);
								if (cosine.numG($conceptually_near_terms_cosine_cutoff$.getDynamicValue(thread))) {
									justifications = justify_conceptual_nearness_of_terms(term1, term2, quit_after_first_kb_pathP);
								}
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							Errors.$error_handler$.rebind(_prev_bind_0, thread);
						}
					}
				} catch (Throwable ccatch_env_var) {
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error($sym95$CONCEPTUALLY_NEAR_TERMS_, error_message);
				}
				if (NIL != justifications) {
					return values(cosine, justifications);
				} else {
					csm_maybe_cache_unsuccessful_cn_results(term1, term2);
					return values(NIL, NIL);
				}
			}
		}
	}

	public static final SubLObject compute_cosine_between_term_vectors(SubLObject term1, SubLObject term2) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = ZERO_INTEGER;
				SubLObject state = memoization_state.possibly_new_memoization_state();
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject term1_vector = get_co_occurrence_vector_for_term(term1, UNPROVIDED);
									SubLObject term2_vector = get_co_occurrence_vector_for_term(term2, UNPROVIDED);
									SubLObject term1_vector_length = sparse_vector.svector_length(term1_vector);
									SubLObject term2_vector_length = sparse_vector.svector_length(term2_vector);
									if (!(term1_vector_length.isZero() || term2_vector_length.isZero())) {
										result = divide(sparse_vector.svector_scalar_product(term1_vector, term2_vector), multiply(term1_vector_length, term2_vector_length));
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_27 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_27, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject get_co_occurrence_vector_for_term(SubLObject v_term, SubLObject weightedP) {
		if (weightedP == UNPROVIDED) {
			weightedP = NIL;
		}
		if (NIL != weightedP) {
			return get_weighted_co_occurrence_vector_for_term(v_term, UNPROVIDED);
		} else {
			return get_simple_co_occurrence_vector_for_term(v_term);
		}
	}

	public static final SubLObject get_simple_co_occurrence_vector_for_term_internal(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject vector = sparse_vector.new_sparse_vector(UNPROVIDED, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject cdolist_list_var = gather_csm_relevant_assertions_for_term(v_term);
							SubLObject assertion = NIL;
							for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
								{
									SubLObject formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
									SubLObject cdolist_list_var_28 = cycl_utilities.expression_forts(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									SubLObject fort = NIL;
									for (fort = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest(), fort = cdolist_list_var_28.first()) {
										sparse_vector.svector_set(vector, fort, ONE_INTEGER);
									}
								}
							}
						}
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				return vector;
			}
		}
	}

	public static final SubLObject get_simple_co_occurrence_vector_for_term(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return get_simple_co_occurrence_vector_for_term_internal(v_term);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_SIMPLE_CO_OCCURRENCE_VECTOR_FOR_TERM, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_SIMPLE_CO_OCCURRENCE_VECTOR_FOR_TERM, ONE_INTEGER, $int$200, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, GET_SIMPLE_CO_OCCURRENCE_VECTOR_FOR_TERM, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw90$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(get_simple_co_occurrence_vector_for_term_internal(v_term)));
						memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	// deflexical
	private static final SubLSymbol $inverse_term_frequencies_fht_filename$ = makeSymbol("*INVERSE-TERM-FREQUENCIES-FHT-FILENAME*");

	public static final SubLObject get_weighted_co_occurrence_vector_for_term_internal(SubLObject v_term, SubLObject use_subsumptionP) {
		if (use_subsumptionP == UNPROVIDED) {
			use_subsumptionP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject vector = sparse_vector.new_sparse_vector(UNPROVIDED, UNPROVIDED);
				SubLObject fht = file_hash_table.open_file_hash_table($inverse_term_frequencies_fht_filename$.getGlobalValue(), symbol_function(EQ), $IMAGE_INDEPENDENT_CFASL);
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject cdolist_list_var = gather_csm_relevant_assertions_for_term(v_term);
							SubLObject assertion = NIL;
							for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
								{
									SubLObject formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
									SubLObject cdolist_list_var_29 = cycl_utilities.expression_forts(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									SubLObject fort = NIL;
									for (fort = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest(), fort = cdolist_list_var_29.first()) {
										sparse_vector.svector_set(vector, fort, get_inverse_term_frequency_for_term(fort, fht, UNPROVIDED));
										if (NIL != use_subsumptionP) {
											if (NIL != fort_types_interface.predicate_p(fort)) {
												{
													SubLObject cdolist_list_var_30 = all_genl_predicates_memoized(fort, UNPROVIDED, UNPROVIDED);
													SubLObject genl_pred = NIL;
													for (genl_pred = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest(), genl_pred = cdolist_list_var_30.first()) {
														sparse_vector.svector_set(vector, genl_pred, get_inverse_term_frequency_for_term(genl_pred, fht, UNPROVIDED));
													}
												}
											} else if (NIL != fort_types_interface.collection_p(fort)) {
												{
													SubLObject cdolist_list_var_31 = all_genls_memoized(fort, UNPROVIDED, UNPROVIDED);
													SubLObject genl = NIL;
													for (genl = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest(), genl = cdolist_list_var_31.first()) {
														sparse_vector.svector_set(vector, genl, get_inverse_term_frequency_for_term(genl, fht, UNPROVIDED));
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
				file_hash_table.finalize_file_hash_table(fht);
				return vector;
			}
		}
	}

	public static final SubLObject get_weighted_co_occurrence_vector_for_term(SubLObject v_term, SubLObject use_subsumptionP) {
		if (use_subsumptionP == UNPROVIDED) {
			use_subsumptionP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return get_weighted_co_occurrence_vector_for_term_internal(v_term, use_subsumptionP);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_WEIGHTED_CO_OCCURRENCE_VECTOR_FOR_TERM, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_WEIGHTED_CO_OCCURRENCE_VECTOR_FOR_TERM, TWO_INTEGER, $int$200, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, GET_WEIGHTED_CO_OCCURRENCE_VECTOR_FOR_TERM, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, use_subsumptionP);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term == cached_args.first()) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && (use_subsumptionP == cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(get_weighted_co_occurrence_vector_for_term_internal(v_term, use_subsumptionP)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, use_subsumptionP));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject linked_term_frequencies_for_term_internal(SubLObject v_term) {
		{
			SubLObject frequencies = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
			SubLObject cdolist_list_var = gather_csm_relevant_assertions_for_term(v_term);
			SubLObject assertion = NIL;
			for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
				{
					SubLObject formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
					SubLObject cdolist_list_var_32 = cycl_utilities.expression_forts(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject fort = NIL;
					for (fort = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest(), fort = cdolist_list_var_32.first()) {
						dictionary_utilities.dictionary_increment(frequencies, fort, UNPROVIDED);
					}
				}
			}
			return frequencies;
		}
	}

	public static final SubLObject linked_term_frequencies_for_term(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return linked_term_frequencies_for_term_internal(v_term);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LINKED_TERM_FREQUENCIES_FOR_TERM, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LINKED_TERM_FREQUENCIES_FOR_TERM, ONE_INTEGER, $int$200, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, LINKED_TERM_FREQUENCIES_FOR_TERM, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw90$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(linked_term_frequencies_for_term_internal(v_term)));
						memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static final SubLObject term_cooccurrences(SubLObject v_term) {
		{
			SubLObject cooccurrences = set.new_set(symbol_function(EQ), UNPROVIDED);
			SubLObject cdolist_list_var = gather_csm_relevant_assertions_for_term(v_term);
			SubLObject assertion = NIL;
			for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
				{
					SubLObject formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
					SubLObject cdolist_list_var_33 = cycl_utilities.expression_forts(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject fort = NIL;
					for (fort = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest(), fort = cdolist_list_var_33.first()) {
						set.set_add(fort, cooccurrences);
					}
				}
			}
			return cooccurrences;
		}
	}

	public static final SubLObject count_spec_predicates_internal(SubLObject pred) {
		return length(genl_predicates.all_spec_predicates(pred, UNPROVIDED, UNPROVIDED));
	}

	public static final SubLObject count_spec_predicates(SubLObject pred) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return count_spec_predicates_internal(pred);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COUNT_SPEC_PREDICATES, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COUNT_SPEC_PREDICATES, ONE_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, COUNT_SPEC_PREDICATES, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, $kw90$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(count_spec_predicates_internal(pred)));
						memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static final SubLObject term_frequency(SubLObject v_term, SubLObject use_subsumptionP) {
		if (use_subsumptionP == UNPROVIDED) {
			use_subsumptionP = T;
		}
		{
			SubLObject cooccurrences = term_cooccurrences(v_term);
			SubLObject count = ZERO_INTEGER;
			if (NIL != use_subsumptionP) {
				{
					SubLObject set_contents_var = set.do_set_internal(cooccurrences);
					SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
					SubLObject state = NIL;
					for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
						{
							SubLObject fort = set_contents.do_set_contents_next(basis_object, state);
							if (NIL != set_contents.do_set_contents_element_validP(state, fort)) {
								if (NIL != fort_types_interface.predicate_p(fort)) {
									count = add(count, count_spec_predicates(fort));
								} else if (NIL != fort_types_interface.collection_p(fort)) {
									count = add(count, cardinality_estimates.spec_cardinality(fort));
								} else {
									count = add(count, ONE_INTEGER);
								}

							}
						}
					}
				}
			} else {
				count = add(count, set.set_size(cooccurrences));
			}
			return count;
		}
	}

	// defparameter
	private static final SubLSymbol $max_inverse_term_frequency$ = makeSymbol("*MAX-INVERSE-TERM-FREQUENCY*");

	public static final SubLObject inverse_term_frequency(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject tf = term_frequency(v_term, UNPROVIDED);
				if (tf.isZero()) {
					return $max_inverse_term_frequency$.getDynamicValue(thread);
				}
				return log(divide(forts.fort_count(), tf), TWO_INTEGER);
			}
		}
	}

	public static final SubLObject term_frequency_for_term_pair(SubLObject term1, SubLObject term2) {
		return dictionary.dictionary_lookup_without_values(linked_term_frequencies_for_term(term1), term2, UNPROVIDED);
	}

	public static final SubLObject tf_idf_weight_for_term_pair(SubLObject term1, SubLObject term2) {
		{
			SubLObject tf = term_frequency_for_term_pair(term1, term2);
			SubLObject dfi = inverse_term_frequency(term2);
			return multiply(tf, dfi);
		}
	}

	public static final SubLObject compute_weight_for_term_pair(SubLObject term1, SubLObject term2, SubLObject method) {
		if (method == UNPROVIDED) {
			method = $IDF;
		}
		{
			SubLObject pcase_var = method;
			if (pcase_var.eql($TF)) {
				return term_frequency_for_term_pair(term1, term2);
			} else if (pcase_var.eql($IDF)) {
				return inverse_term_frequency(term2);
			} else if (pcase_var.eql($TF_IDF)) {
				return tf_idf_weight_for_term_pair(term1, term2);
			}

		}
		return NIL;
	}

	public static final SubLObject store_inverse_term_frequencies() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject fht = file_hash_table.create_file_hash_table($inverse_term_frequencies_fht_filename$.getGlobalValue(), forts.fort_count(), file_hash_table.$htfile_default_average_size$.getGlobalValue(), symbol_function(EQ), $IMAGE_INDEPENDENT_CFASL);
				SubLObject state = memoization_state.possibly_new_memoization_state();
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject message = $$$mapping_Cyc_FORTs;
									SubLObject total = forts.fort_count();
									SubLObject sofar = ZERO_INTEGER;
									{
										SubLObject _prev_bind_0_34 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
										SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
										SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
										SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
										try {
											utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
											utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
											utilities_macros.$within_noting_percent_progress$.bind(T, thread);
											utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
											utilities_macros.noting_percent_progress_preamble(message);
											{
												SubLObject cdolist_list_var = forts.do_forts_tables();
												SubLObject table_var = NIL;
												for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), table_var = cdolist_list_var.first()) {
													if (NIL == id_index.do_id_index_empty_p(table_var, $SKIP)) {
														{
															SubLObject id = id_index.do_id_index_next_id(table_var, T, NIL, NIL);
															SubLObject state_var = id_index.do_id_index_next_state(table_var, T, id, NIL);
															SubLObject fort = NIL;
															while (NIL != id) {
																fort = id_index.do_id_index_state_object(table_var, $SKIP, id, state_var);
																if (NIL != id_index.do_id_index_id_and_object_validP(id, fort, $SKIP)) {
																	sofar = add(sofar, ONE_INTEGER);
																	utilities_macros.note_percent_progress(sofar, total);
																	{
																		SubLObject itf = inverse_term_frequency(fort);
																		file_hash_table.put_file_hash_table(fort, fht, itf);
																	}
																}
																id = id_index.do_id_index_next_id(table_var, T, id, state_var);
																state_var = id_index.do_id_index_next_state(table_var, T, id, state_var);
															}
														}
													}
												}
											}
											utilities_macros.noting_percent_progress_postamble();
										} finally {
											utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
											utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
											utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
											utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_34, thread);
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				file_hash_table.finalize_file_hash_table(fht);
				return NIL;
			}
		}
	}

	public static final SubLObject get_inverse_term_frequency_for_term(SubLObject v_term, SubLObject fht, SubLObject compute_non_existent_itfsP) {
		if (fht == UNPROVIDED) {
			fht = NIL;
		}
		if (compute_non_existent_itfsP == UNPROVIDED) {
			compute_non_existent_itfsP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject finalize_fhtP = NIL;
				if (NIL == file_hash_table.file_hash_table_p(fht)) {
					fht = file_hash_table.open_file_hash_table($inverse_term_frequencies_fht_filename$.getGlobalValue(), symbol_function(EQ), $IMAGE_INDEPENDENT_CFASL);
					finalize_fhtP = T;
				}
				{
					SubLObject itf = file_hash_table.get_file_hash_table(v_term, fht, ONE_INTEGER);
					if (NIL == itf) {
						if (NIL != compute_non_existent_itfsP) {
							itf = inverse_term_frequency(v_term);
							file_hash_table.put_file_hash_table(v_term, fht, itf);
						} else {
							itf = $max_inverse_term_frequency$.getDynamicValue(thread);
						}
					}
					if (NIL != finalize_fhtP) {
						file_hash_table.finalize_file_hash_table(fht);
					}
					return itf;
				}
			}
		}
	}

	// defparameter
	private static final SubLSymbol $csm_kb_paths_max_time_cutoff$ = makeSymbol("*CSM-KB-PATHS-MAX-TIME-CUTOFF*");

	// defparameter
	private static final SubLSymbol $csm_kb_paths_max_search_iterations_cutoff$ = makeSymbol("*CSM-KB-PATHS-MAX-SEARCH-ITERATIONS-CUTOFF*");

	// defparameter
	private static final SubLSymbol $csm_kb_paths_max_path_depth_cutoff$ = makeSymbol("*CSM-KB-PATHS-MAX-PATH-DEPTH-CUTOFF*");

	// defparameter
	private static final SubLSymbol $relevant_conceptual_nearness_path_node_classes$ = makeSymbol("*RELEVANT-CONCEPTUAL-NEARNESS-PATH-NODE-CLASSES*");

	// defparameter
	private static final SubLSymbol $irrelevant_conceptual_nearness_path_node_classes$ = makeSymbol("*IRRELEVANT-CONCEPTUAL-NEARNESS-PATH-NODE-CLASSES*");

	// defparameter
	private static final SubLSymbol $preferred_conceptual_nearness_path_node_classes$ = makeSymbol("*PREFERRED-CONCEPTUAL-NEARNESS-PATH-NODE-CLASSES*");

	// defparameter
	private static final SubLSymbol $csm_irrelevant_path_link_predicates$ = makeSymbol("*CSM-IRRELEVANT-PATH-LINK-PREDICATES*");

	// defparameter
	private static final SubLSymbol $csm_irrelevant_path_nodes$ = makeSymbol("*CSM-IRRELEVANT-PATH-NODES*");

	// defparameter
	private static final SubLSymbol $csm_irrelevant_path_link_mts$ = makeSymbol("*CSM-IRRELEVANT-PATH-LINK-MTS*");

	/**
	 * Finds "interesting" KB paths between TERM1 and TERM2
	 * The "interestingness" a path is determined by the concepts
	 * that appear as its nodes and the assertions that appear as
	 * its links. For example, paths that contain node concepts
	 * above a certain generality level are deemed uninteresting.
	 */
	public static final SubLObject justify_conceptual_nearness_of_terms_internal(SubLObject term1, SubLObject term2, SubLObject quit_after_first_kb_pathP) {
		if (quit_after_first_kb_pathP == UNPROVIDED) {
			quit_after_first_kb_pathP = $csm_quit_after_first_kb_pathP$.getDynamicValue();
		}
		{
			SubLObject relevant_paths = NIL;
			SubLObject error_message = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
						try {
							csm_note(cconcatenate($str_alt117$Searching_for_relevant_KB_paths_b, new SubLObject[] { format_nil.format_nil_a_no_copy(term1), $str_alt118$_and_, format_nil.format_nil_a_no_copy(term2), $str_alt119$___ }));
							relevant_paths = justify_conceptual_nearness_of_terms_int(term1, term2, quit_after_first_kb_pathP);
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			}
			if (NIL != error_message) {
				csm_note_error(JUSTIFY_CONCEPTUAL_NEARNESS_OF_TERMS, error_message);
			}
			return relevant_paths;
		}
	}

	public static final SubLObject justify_conceptual_nearness_of_terms(SubLObject term1, SubLObject term2, SubLObject quit_after_first_kb_pathP) {
		if (quit_after_first_kb_pathP == UNPROVIDED) {
			quit_after_first_kb_pathP = $csm_quit_after_first_kb_pathP$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return justify_conceptual_nearness_of_terms_internal(term1, term2, quit_after_first_kb_pathP);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JUSTIFY_CONCEPTUAL_NEARNESS_OF_TERMS, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JUSTIFY_CONCEPTUAL_NEARNESS_OF_TERMS, THREE_INTEGER, $int$50, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JUSTIFY_CONCEPTUAL_NEARNESS_OF_TERMS, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(term1, term2, quit_after_first_kb_pathP);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (term1 == cached_args.first()) {
										cached_args = cached_args.rest();
										if (term2 == cached_args.first()) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && (quit_after_first_kb_pathP == cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(justify_conceptual_nearness_of_terms_internal(term1, term2, quit_after_first_kb_pathP)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(term1, term2, quit_after_first_kb_pathP));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject justify_conceptual_nearness_of_terms_int(SubLObject term1, SubLObject term2, SubLObject quit_after_first_kb_pathP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject relevant_paths = justify_conceptual_nearness_of_terms_int2(term1, term2, quit_after_first_kb_pathP);
				SubLObject invertP = NIL;
				SubLObject justifications = NIL;
				SubLObject paths_by_length = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
				SubLObject max_length = ZERO_INTEGER;
				if (NIL == relevant_paths) {
					relevant_paths = justify_conceptual_nearness_of_terms_int2(term2, term1, quit_after_first_kb_pathP);
					invertP = T;
				}
				{
					SubLObject cdolist_list_var = relevant_paths;
					SubLObject path = NIL;
					for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), path = cdolist_list_var.first()) {
						thread.resetMultipleValues();
						{
							SubLObject assertions = extract_assertions_from_kb_path(path, ZERO_INTEGER);
							SubLObject score = thread.secondMultipleValue();
							thread.resetMultipleValues();
							{
								SubLObject path_length = length(assertions);
								if (path_length.numG(max_length)) {
									max_length = path_length;
								}
								if (NIL != invertP) {
									assertions = nreverse(assertions);
								}
								dictionary_utilities.dictionary_push(paths_by_length, path_length, list(score, assertions));
							}
						}
					}
				}
				{
					SubLObject cdotimes_end_var = number_utilities.f_1X(max_length);
					SubLObject i = NIL;
					for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
						{
							SubLObject paths_of_length = Mapping.mapcar(symbol_function(SECOND), Sort.stable_sort(dictionary.dictionary_lookup_without_values(paths_by_length, i, UNPROVIDED), symbol_function($sym121$_), symbol_function(FIRST)));
							if (NIL != paths_of_length) {
								justifications = append(justifications, paths_of_length);
							}
						}
					}
				}
				return justifications;
			}
		}
	}

	public static final SubLObject extract_assertions_from_kb_path(SubLObject path, SubLObject score) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if ((NIL == path) || (NIL == second(path))) {
				return values(NIL, score);
			}
			if (path.isCons()) {
				thread.resetMultipleValues();
				{
					SubLObject sub_path = extract_assertions_from_kb_path(second(second(path)), score);
					SubLObject new_score = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != subl_promotions.memberP(path.first(), $preferred_conceptual_nearness_path_node_classes$.getDynamicValue(thread), $sym123$ISA_IN_ANY_MT_MEMOIZED_, UNPROVIDED)) {
						new_score = add(new_score, ONE_INTEGER);
					}
					return values(cons(second(path).first(), sub_path), new_score);
				}
			}
			return values(NIL, score);
		}
	}

	public static final SubLObject justify_conceptual_nearness_of_terms_int2(SubLObject term1, SubLObject term2, SubLObject quit_after_first_kb_pathP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject relevant_paths = NIL;
				SubLObject timed_outP = NIL;
				SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
				try {
					{
						SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
						try {
							subl_macro_promotions.$within_with_timeout$.bind(T, thread);
							{
								SubLObject timer = NIL;
								try {
									{
										SubLObject _prev_bind_0_36 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
										try {
											subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
											timer = subl_macro_promotions.with_timeout_start_timer($csm_kb_paths_max_time_cutoff$.getDynamicValue(thread), tag);
											{
												SubLObject _prev_bind_0_37 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
												SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
												SubLObject _prev_bind_2 = kb_paths.$relevant_nodeP$.currentBinding(thread);
												SubLObject _prev_bind_3 = kb_paths.$kbp_restricted_predsP$.currentBinding(thread);
												SubLObject _prev_bind_4 = kb_paths.$kbp_restricted_preds$.currentBinding(thread);
												SubLObject _prev_bind_5 = kb_paths.$kbp_restricted_mtsP$.currentBinding(thread);
												SubLObject _prev_bind_6 = kb_paths.$kbp_restricted_mts$.currentBinding(thread);
												SubLObject _prev_bind_7 = kb_paths.$exclude_nodes$.currentBinding(thread);
												SubLObject _prev_bind_8 = kb_paths.$kbp_quit_with_successP$.currentBinding(thread);
												SubLObject _prev_bind_9 = kb_paths.$limit_path_depthP$.currentBinding(thread);
												SubLObject _prev_bind_10 = kb_paths.$kbp_max_depth$.currentBinding(thread);
												try {
													mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
													mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
													kb_paths.$relevant_nodeP$.bind($sym124$RELEVANT_CONCEPTUAL_NEARNESS_PATH_NODE_, thread);
													kb_paths.$kbp_restricted_predsP$.bind(T, thread);
													kb_paths.$kbp_restricted_preds$.bind($csm_irrelevant_path_link_predicates$.getDynamicValue(thread), thread);
													kb_paths.$kbp_restricted_mtsP$.bind(T, thread);
													kb_paths.$kbp_restricted_mts$.bind($csm_irrelevant_path_link_mts$.getDynamicValue(thread), thread);
													kb_paths.$exclude_nodes$.bind($csm_irrelevant_path_nodes$.getDynamicValue(thread), thread);
													kb_paths.$kbp_quit_with_successP$.bind(quit_after_first_kb_pathP, thread);
													kb_paths.$limit_path_depthP$.bind(T, thread);
													kb_paths.$kbp_max_depth$.bind($csm_kb_paths_max_path_depth_cutoff$.getDynamicValue(thread), thread);
													if ($csm_debugging_output_destination_stream$.getDynamicValue(thread) == T) {
														relevant_paths = kb_paths.kb_paths_n(term1, term2, $csm_kb_paths_max_search_iterations_cutoff$.getDynamicValue(thread));
													} else {
														{
															SubLObject _prev_bind_0_38 = StreamsLow.$standard_output$.currentBinding(thread);
															try {
																StreamsLow.$standard_output$.bind($csm_debugging_output_destination_stream$.getDynamicValue(thread), thread);
																relevant_paths = kb_paths.kb_paths_n(term1, term2, $csm_kb_paths_max_search_iterations_cutoff$.getDynamicValue(thread));
															} finally {
																StreamsLow.$standard_output$.rebind(_prev_bind_0_38, thread);
															}
														}
													}
												} finally {
													kb_paths.$kbp_max_depth$.rebind(_prev_bind_10, thread);
													kb_paths.$limit_path_depthP$.rebind(_prev_bind_9, thread);
													kb_paths.$kbp_quit_with_successP$.rebind(_prev_bind_8, thread);
													kb_paths.$exclude_nodes$.rebind(_prev_bind_7, thread);
													kb_paths.$kbp_restricted_mts$.rebind(_prev_bind_6, thread);
													kb_paths.$kbp_restricted_mtsP$.rebind(_prev_bind_5, thread);
													kb_paths.$kbp_restricted_preds$.rebind(_prev_bind_4, thread);
													kb_paths.$kbp_restricted_predsP$.rebind(_prev_bind_3, thread);
													kb_paths.$relevant_nodeP$.rebind(_prev_bind_2, thread);
													mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
													mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_37, thread);
												}
											}
										} finally {
											subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_36, thread);
										}
									}
								} finally {
									{
										SubLObject _prev_bind_0_39 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											subl_macro_promotions.with_timeout_stop_timer(timer);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_39, thread);
										}
									}
								}
							}
						} finally {
							subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
						}
					}
				} catch (Throwable ccatch_env_var) {
					timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
				}
				return relevant_paths;
			}
		}
	}

	public static final SubLObject relevant_conceptual_nearness_path_nodeP(SubLObject v_term) {
		if (NIL != csm_irrelevant_termP(v_term)) {
			return NIL;
		}
		return relevant_conceptual_nearness_path_node_intP(v_term);
	}

	public static final SubLObject relevant_conceptual_nearness_path_node_intP(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return makeBoolean((NIL != subl_promotions.memberP(v_term, $relevant_conceptual_nearness_path_node_classes$.getDynamicValue(thread), $sym123$ISA_IN_ANY_MT_MEMOIZED_, UNPROVIDED)) && (NIL == subl_promotions.memberP(v_term, $irrelevant_conceptual_nearness_path_node_classes$.getDynamicValue(thread), $sym123$ISA_IN_ANY_MT_MEMOIZED_, UNPROVIDED)));
		}
	}

	/**
	 * two days
	 */
	// defparameter
	private static final SubLSymbol $csm_near_dates_cutoff$ = makeSymbol("*CSM-NEAR-DATES-CUTOFF*");

	public static final SubLObject temporally_near_datesP(SubLObject date1, SubLObject date2) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return numLE(abs(subtract(date1, date2)), $csm_near_dates_cutoff$.getDynamicValue(thread));
		}
	}

	/**
	 * four hours
	 */
	// defparameter
	private static final SubLSymbol $csm_near_dates_cluster_cutoff$ = makeSymbol("*CSM-NEAR-DATES-CLUSTER-CUTOFF*");

	public static final SubLObject temporally_near_date_clustersP(SubLObject start_date_1, SubLObject end_date_1, SubLObject start_date_2, SubLObject end_date_2) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return numLE(abs(subtract(start_date_1, start_date_2)), $csm_near_dates_cutoff$.getDynamicValue(thread));
		}
	}

	public static final SubLObject date_within_date_clusterP(SubLObject date, SubLObject start_date) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return numLE(date, add(start_date, $csm_near_dates_cluster_cutoff$.getDynamicValue(thread)));
		}
	}

	/**
	 * special predicates that indicate topicality of concepts
	 */
	// deflexical
	private static final SubLSymbol $csm_special_topic_predicates$ = makeSymbol("*CSM-SPECIAL-TOPIC-PREDICATES*");

	public static final SubLObject csm_special_topic_predicateP(SubLObject pred) {
		return list_utilities.member_eqP(pred, $csm_special_topic_predicates$.getGlobalValue());
	}

	public static final SubLObject csm_special_topic_sentenceP(SubLObject sentence, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		return csm_special_topic_predicateP(cycl_utilities.formula_operator(sentence));
	}

	public static final SubLObject get_topics_from_sentence_mt(SubLObject sentence, SubLObject mt, SubLObject gather_task_ui_topicsP, SubLObject gather_extra_topicsP) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (gather_task_ui_topicsP == UNPROVIDED) {
			gather_task_ui_topicsP = T;
		}
		if (gather_extra_topicsP == UNPROVIDED) {
			gather_extra_topicsP = NIL;
		}
		{
			SubLObject new_sentence = czer_utilities.unwrap_if_ist_permissive(sentence, UNPROVIDED);
			SubLObject topics = NIL;
			if (NIL != gather_task_ui_topicsP) {
				topics = gather_task_ui_topics_from_sentence_mt(new_sentence, mt);
			}
			if ((NIL != gather_extra_topicsP) && (NIL == csm_special_topic_sentenceP(new_sentence, mt))) {
				topics = remove_csm_irrelevant_terms(cycl_utilities.expression_forts(new_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED));
			}
			return topics;
		}
	}

	public static final SubLObject gather_task_ui_topics_from_sentence_mt(SubLObject sentence, SubLObject mt) {
		{
			SubLObject predicate = cycl_utilities.formula_operator(sentence);
			SubLObject topics = NIL;
			SubLObject pcase_var = predicate;
			if (pcase_var.eql($$objectOfEvaluation) || pcase_var.eql($$evaluee_Direct)) {
				topics = cons(cycl_utilities.formula_arg2(sentence, UNPROVIDED), topics);
			} else if (pcase_var.eql($$topicCycL)) {
				topics = append(topics, cycl_utilities.expression_forts(cycl_utilities.formula_arg2(sentence, UNPROVIDED), NIL, NIL, T));
			} else if (pcase_var.eql($$taskConceptForUser)) {
				topics = cons(cycl_utilities.formula_arg1(sentence, UNPROVIDED), topics);
			}

			return remove_csm_irrelevant_terms(topics);
		}
	}

	public static final SubLObject guess_user_from_sentence_mt(SubLObject sentence, SubLObject mt) {
		{
			SubLObject new_sentence = czer_utilities.unwrap_if_ist_permissive(sentence, UNPROVIDED);
			SubLObject predicate = cycl_utilities.formula_operator(new_sentence);
			SubLObject user = NIL;
			SubLObject pcase_var = predicate;
			if (pcase_var.eql($$objectOfEvaluation)) {
				user = guess_user_from_mt(mt);
			} else if (pcase_var.eql($$topicCycL)) {
				user = guess_user_from_mt(mt);
			} else if (pcase_var.eql($$taskConceptForUser)) {
				user = cycl_utilities.formula_arg2(new_sentence, UNPROVIDED);
			}

			return user;
		}
	}

	public static final SubLObject guess_user_from_mt(SubLObject mt) {
		if (NIL != nart_handles.nart_p(mt)) {
			{
				SubLObject functor = cycl_utilities.nat_functor(mt);
				SubLObject pcase_var = functor;
				if (pcase_var.eql($$ModelMtByUserAndTaskFn)) {
					return cycl_utilities.nat_arg1(mt, UNPROVIDED);
				} else if (pcase_var.eql($const133$RecordMtByUserTaskAndApplicationF)) {
					return cycl_utilities.nat_arg1(mt, UNPROVIDED);
				}

			}
		}
		return NIL;
	}

	/**
	 * Whether collaboration opportunity detection should be performed in the current image
	 */
	// defvar
	private static final SubLSymbol $csm_collaboration_opportunity_detection_onP$ = makeSymbol("*CSM-COLLABORATION-OPPORTUNITY-DETECTION-ON?*");

	/**
	 * Returns whether collaboration opportunity detection is on in the current image.
	 */
	public static final SubLObject csm_collaboration_opportunity_detection_onP() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $csm_collaboration_opportunity_detection_onP$.getDynamicValue(thread);
		}
	}

	public static final SubLObject csm_turn_on_collaboration_opportunity_detection() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$csm_collaboration_opportunity_detection_onP$.setDynamicValue(T, thread);
			return $csm_collaboration_opportunity_detection_onP$.getDynamicValue(thread);
		}
	}

	public static final SubLObject csm_turn_off_collaboration_opportunity_detection() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$csm_collaboration_opportunity_detection_onP$.setDynamicValue(NIL, thread);
			return $csm_collaboration_opportunity_detection_onP$.getDynamicValue(thread);
		}
	}

	/**
	 * Turns collaboration opportunity detection on in the current image
	 * and initializes some relevant datastructures.
	 */
	public static final SubLObject csm_initialize_collaboration_opportunity_detection() {
		if (NIL == csm_collaboration_opportunity_detection_onP()) {
			{
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
						try {
							bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
							try {
								csm_initialize_data_structures();
								csm_initialize_event_listeners();
								csm_turn_on_collaboration_opportunity_detection();
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							rebind(Errors.$error_handler$, _prev_bind_0);
						}
					}
				} catch (Throwable ccatch_env_var) {
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error(CSM_INITIALIZE_COLLABORATION_OPPORTUNITY_DETECTION, error_message);
				}
			}
		}
		return csm_collaboration_opportunity_detection_onP();
	}

	public static final SubLObject csm_initialize_data_structures() {
		csm_initialize_irrelevant_term_table();
		csm_initialize_detected_collaboration_opportunities_cache(UNPROVIDED);
		return NIL;
	}

	/**
	 * Turns collaboration opportunity detection off in the current image
	 * and does some relevant clean-up.
	 */
	public static final SubLObject csm_uninitialize_collaboration_opportunity_detection() {
		if (NIL != csm_collaboration_opportunity_detection_onP()) {
			{
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
						try {
							bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
							try {
								csm_turn_off_collaboration_opportunity_detection();
								csm_deregister_event_listeners();
								csm_clear_user_caches(UNPROVIDED);
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							rebind(Errors.$error_handler$, _prev_bind_0);
						}
					}
				} catch (Throwable ccatch_env_var) {
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error(CSM_INITIALIZE_COLLABORATION_OPPORTUNITY_DETECTION, error_message);
				}
			}
		}
		return csm_collaboration_opportunity_detection_onP();
	}

	public static final class $csm_assertion_info_entry_native extends SubLStructNative {
		@Override
		public SubLStructDecl getStructDecl() {
			return collaborative_sense_making_utilities.$csm_assertion_info_entry_native.structDecl;
		}

		@Override
		public SubLObject getField2() {
			return $owner;
		}

		@Override
		public SubLObject getField3() {
			return $date;
		}

		@Override
		public SubLObject getField4() {
			return $time;
		}

		@Override
		public SubLObject getField5() {
			return $universal_time;
		}

		@Override
		public SubLObject getField6() {
			return $sentence;
		}

		@Override
		public SubLObject getField7() {
			return $mt;
		}

		@Override
		public SubLObject getField8() {
			return $forts;
		}

		@Override
		public SubLObject setField2(SubLObject value) {
			return $owner = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return $date = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return $time = value;
		}

		@Override
		public SubLObject setField5(SubLObject value) {
			return $universal_time = value;
		}

		@Override
		public SubLObject setField6(SubLObject value) {
			return $sentence = value;
		}

		@Override
		public SubLObject setField7(SubLObject value) {
			return $mt = value;
		}

		@Override
		public SubLObject setField8(SubLObject value) {
			return $forts = value;
		}

		public SubLObject $owner = Lisp.NIL;

		public SubLObject $date = Lisp.NIL;

		public SubLObject $time = Lisp.NIL;

		public SubLObject $universal_time = Lisp.NIL;

		public SubLObject $sentence = Lisp.NIL;

		public SubLObject $mt = Lisp.NIL;

		public SubLObject $forts = Lisp.NIL;

		private static final SubLStructDeclNative structDecl = makeStructDeclNative(collaborative_sense_making_utilities.$csm_assertion_info_entry_native.class, CSM_ASSERTION_INFO_ENTRY, CSM_ASSERTION_INFO_ENTRY_P, $list_alt137, $list_alt138, new String[] { "$owner", "$date", "$time", "$universal_time", "$sentence", "$mt", "$forts" }, $list_alt139, $list_alt140, PRINT_CSM_ASSERTION_INFO_ENTRY);
	}

	// defconstant
	public static final SubLSymbol $dtp_csm_assertion_info_entry$ = makeSymbol("*DTP-CSM-ASSERTION-INFO-ENTRY*");

	public static final SubLObject csm_assertion_info_entry_print_function_trampoline(SubLObject v_object, SubLObject stream) {
		print_csm_assertion_info_entry(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static final SubLObject csm_assertion_info_entry_p(SubLObject v_object) {
		return v_object.getJavaClass() ==collaborative_sense_making_utilities.$csm_assertion_info_entry_native.class ? ((SubLObject) (T)) : NIL;
	}

	public static final class $csm_assertion_info_entry_p$UnaryFunction extends UnaryFunction {
		public $csm_assertion_info_entry_p$UnaryFunction() {
			super(extractFunctionNamed("CSM-ASSERTION-INFO-ENTRY-P"));
		}

		@Override
		public SubLObject processItem(SubLObject arg1) {
			return csm_assertion_info_entry_p(arg1);
		}
	}

	public static final SubLObject csm_assertion_owner(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.getField2();
	}

	public static final SubLObject csm_assertion_date(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.getField3();
	}

	public static final SubLObject csm_assertion_time(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.getField4();
	}

	public static final SubLObject csm_assertion_universal_time(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.getField5();
	}

	public static final SubLObject csm_assertion_sentence(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.getField6();
	}

	public static final SubLObject csm_assertion_mt(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.getField7();
	}

	public static final SubLObject csm_assertion_forts(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.getField8();
	}

	public static final SubLObject _csetf_csm_assertion_owner(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.setField2(value);
	}

	public static final SubLObject _csetf_csm_assertion_date(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.setField3(value);
	}

	public static final SubLObject _csetf_csm_assertion_time(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.setField4(value);
	}

	public static final SubLObject _csetf_csm_assertion_universal_time(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.setField5(value);
	}

	public static final SubLObject _csetf_csm_assertion_sentence(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.setField6(value);
	}

	public static final SubLObject _csetf_csm_assertion_mt(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.setField7(value);
	}

	public static final SubLObject _csetf_csm_assertion_forts(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_ASSERTION_INFO_ENTRY_P);
		return v_object.setField8(value);
	}

	public static final SubLObject make_csm_assertion_info_entry(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new collaborative_sense_making_utilities.$csm_assertion_info_entry_native();
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($OWNER)) {
						_csetf_csm_assertion_owner(v_new, current_value);
					} else if (pcase_var.eql($DATE)) {
						_csetf_csm_assertion_date(v_new, current_value);
					} else if (pcase_var.eql($TIME)) {
						_csetf_csm_assertion_time(v_new, current_value);
					} else if (pcase_var.eql($UNIVERSAL_TIME)) {
						_csetf_csm_assertion_universal_time(v_new, current_value);
					} else if (pcase_var.eql($SENTENCE)) {
						_csetf_csm_assertion_sentence(v_new, current_value);
					} else if (pcase_var.eql($MT)) {
						_csetf_csm_assertion_mt(v_new, current_value);
					} else if (pcase_var.eql($FORTS)) {
						_csetf_csm_assertion_forts(v_new, current_value);
					} else {
						Errors.error($str_alt164$Invalid_slot__S_for_construction_, current_arg);
					}

				}
			}
			return v_new;
		}
	}

	public static final SubLObject new_csm_assertion_info_entry(SubLObject assertion, SubLObject v_properties) {
		{
			SubLObject entry = make_csm_assertion_info_entry(UNPROVIDED);
			SubLObject sentence = fi.assertion_hl_formula(assertion, UNPROVIDED);
			SubLObject mt = assertions_high.assertion_mt(assertion);
			SubLObject v_forts = cycl_utilities.expression_forts(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			_csetf_csm_assertion_sentence(entry, sentence);
			_csetf_csm_assertion_mt(entry, mt);
			_csetf_csm_assertion_forts(entry, v_forts);
			{
				SubLObject cdolist_list_var = v_properties;
				SubLObject property = NIL;
				for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), property = cdolist_list_var.first()) {
					{
						SubLObject datum = property;
						SubLObject current = datum;
						SubLObject name = NIL;
						SubLObject value = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt165);
						name = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt165);
						value = current.first();
						current = current.rest();
						if (NIL == current) {
							{
								SubLObject pcase_var = name;
								if (pcase_var.eql($OWNER)) {
									csm_set_assertion_info_entry_owner(entry, value);
								} else if (pcase_var.eql($DATE)) {
									csm_set_assertion_info_entry_date(entry, value);
								} else if (pcase_var.eql($TIME)) {
									csm_set_assertion_info_entry_time(entry, value);
								} else if (pcase_var.eql($UNIVERSAL_TIME)) {
									csm_set_assertion_info_entry_universal_time(entry, value);
								}

							}
						} else {
							cdestructuring_bind_error(datum, $list_alt165);
						}
					}
				}
			}
			return entry;
		}
	}

	public static final SubLObject csm_assertion_info_entry_owner(SubLObject entry) {
		return csm_assertion_owner(entry);
	}

	public static final SubLObject csm_assertion_info_entry_date(SubLObject entry) {
		return csm_assertion_date(entry);
	}

	public static final SubLObject csm_assertion_info_entry_time(SubLObject entry) {
		return csm_assertion_time(entry);
	}

	public static final SubLObject csm_assertion_info_entry_universal_time(SubLObject entry) {
		return csm_assertion_universal_time(entry);
	}

	public static final SubLObject csm_assertion_info_entry_sentence(SubLObject entry) {
		return csm_assertion_sentence(entry);
	}

	public static final SubLObject csm_assertion_info_entry_mt(SubLObject entry) {
		return csm_assertion_mt(entry);
	}

	public static final SubLObject csm_assertion_info_entry_forts(SubLObject entry) {
		return csm_assertion_forts(entry);
	}

	public static final SubLObject csm_set_assertion_info_entry_owner(SubLObject entry, SubLObject owner) {
		_csetf_csm_assertion_owner(entry, owner);
		return entry;
	}

	public static final SubLObject csm_set_assertion_info_entry_date(SubLObject entry, SubLObject date) {
		_csetf_csm_assertion_date(entry, date);
		return entry;
	}

	public static final SubLObject csm_set_assertion_info_entry_time(SubLObject entry, SubLObject time) {
		_csetf_csm_assertion_time(entry, time);
		return entry;
	}

	public static final SubLObject csm_set_assertion_info_entry_universal_time(SubLObject entry, SubLObject universal_time) {
		_csetf_csm_assertion_universal_time(entry, universal_time);
		return entry;
	}

	public static final SubLObject print_csm_assertion_info_entry(SubLObject v_object, SubLObject stream, SubLObject depth) {
		format(stream, $str_alt166$__CSM_ASSERTION_INFO__s__s__s__s_, new SubLObject[] { csm_assertion_info_entry_owner(v_object), csm_assertion_info_entry_date(v_object), csm_assertion_info_entry_time(v_object), csm_assertion_info_entry_universal_time(v_object), csm_assertion_info_entry_sentence(v_object), csm_assertion_info_entry_mt(v_object), csm_assertion_info_entry_forts(v_object) });
		return NIL;
	}

	public static final class $csm_topic_justification_native extends SubLStructNative {
		@Override
		public SubLStructDecl getStructDecl() {
			return collaborative_sense_making_utilities.$csm_topic_justification_native.structDecl;
		}

		@Override
		public SubLObject getField2() {
			return $sentence;
		}

		@Override
		public SubLObject getField3() {
			return $mt;
		}

		@Override
		public SubLObject getField4() {
			return $universal_time;
		}

		@Override
		public SubLObject setField2(SubLObject value) {
			return $sentence = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return $mt = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return $universal_time = value;
		}

		public SubLObject $sentence = Lisp.NIL;

		public SubLObject $mt = Lisp.NIL;

		public SubLObject $universal_time = Lisp.NIL;

		private static final SubLStructDeclNative structDecl = makeStructDeclNative(collaborative_sense_making_utilities.$csm_topic_justification_native.class, CSM_TOPIC_JUSTIFICATION, CSM_TOPIC_JUSTIFICATION_P, $list_alt169, $list_alt170, new String[] { "$sentence", "$mt", "$universal_time" }, $list_alt171, $list_alt172, PRINT_CSM_TOPIC_JUSTIFICATION);
	}

	// defconstant
	public static final SubLSymbol $dtp_csm_topic_justification$ = makeSymbol("*DTP-CSM-TOPIC-JUSTIFICATION*");

	public static final SubLObject csm_topic_justification_print_function_trampoline(SubLObject v_object, SubLObject stream) {
		print_csm_topic_justification(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static final SubLObject csm_topic_justification_p(SubLObject v_object) {
		return v_object.getJavaClass() ==collaborative_sense_making_utilities.$csm_topic_justification_native.class ? ((SubLObject) (T)) : NIL;
	}

	public static final class $csm_topic_justification_p$UnaryFunction extends UnaryFunction {
		public $csm_topic_justification_p$UnaryFunction() {
			super(extractFunctionNamed("CSM-TOPIC-JUSTIFICATION-P"));
		}

		@Override
		public SubLObject processItem(SubLObject arg1) {
			return csm_topic_justification_p(arg1);
		}
	}

	public static final SubLObject csm_topic_just_sentence(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_TOPIC_JUSTIFICATION_P);
		return v_object.getField2();
	}

	public static final SubLObject csm_topic_just_mt(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_TOPIC_JUSTIFICATION_P);
		return v_object.getField3();
	}

	public static final SubLObject csm_topic_just_universal_time(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_TOPIC_JUSTIFICATION_P);
		return v_object.getField4();
	}

	public static final SubLObject _csetf_csm_topic_just_sentence(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_TOPIC_JUSTIFICATION_P);
		return v_object.setField2(value);
	}

	public static final SubLObject _csetf_csm_topic_just_mt(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_TOPIC_JUSTIFICATION_P);
		return v_object.setField3(value);
	}

	public static final SubLObject _csetf_csm_topic_just_universal_time(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, CSM_TOPIC_JUSTIFICATION_P);
		return v_object.setField4(value);
	}

	public static final SubLObject make_csm_topic_justification(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new collaborative_sense_making_utilities.$csm_topic_justification_native();
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($SENTENCE)) {
						_csetf_csm_topic_just_sentence(v_new, current_value);
					} else if (pcase_var.eql($MT)) {
						_csetf_csm_topic_just_mt(v_new, current_value);
					} else if (pcase_var.eql($UNIVERSAL_TIME)) {
						_csetf_csm_topic_just_universal_time(v_new, current_value);
					} else {
						Errors.error($str_alt164$Invalid_slot__S_for_construction_, current_arg);
					}

				}
			}
			return v_new;
		}
	}

	public static final SubLObject new_csm_topic_justification(SubLObject sentence, SubLObject mt, SubLObject universal_time) {
		{
			SubLObject entry = make_csm_topic_justification(UNPROVIDED);
			_csetf_csm_topic_just_sentence(entry, sentence);
			_csetf_csm_topic_just_mt(entry, mt);
			_csetf_csm_topic_just_universal_time(entry, universal_time);
			return entry;
		}
	}

	public static final SubLObject csm_topic_justification_sentence(SubLObject entry) {
		return csm_topic_just_sentence(entry);
	}

	public static final SubLObject csm_topic_justification_mt(SubLObject entry) {
		return csm_topic_just_mt(entry);
	}

	public static final SubLObject csm_topic_justification_universal_time(SubLObject entry) {
		return csm_topic_just_universal_time(entry);
	}

	public static final SubLObject print_csm_topic_justification(SubLObject v_object, SubLObject stream, SubLObject depth) {
		format(stream, $str_alt181$__CSM_TOPIC_JUSTIFICATION__s__s__, new SubLObject[] { csm_topic_justification_sentence(v_object), csm_topic_justification_mt(v_object), csm_topic_justification_universal_time(v_object) });
		return NIL;
	}

	// deflexical
	private static final SubLSymbol $csm_user_assertions_lock$ = makeSymbol("*CSM-USER-ASSERTIONS-LOCK*");

	public static final SubLObject with_csm_user_assertions_writer_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_WRITER_LOCK, $list_alt185, append(body, NIL));
		}
	}

	public static final SubLObject with_csm_user_assertions_reader_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_READER_LOCK, $list_alt185, append(body, NIL));
		}
	}

	public static final SubLObject csm_do_user_assertions(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt187);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject assertion = NIL;
					SubLObject user = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt187);
					assertion = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt187);
					user = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject user_assertions = $sym188$USER_ASSERTIONS;
							return list(CLET, list(list(user_assertions, list(CSM_USER_ASSERTIONS, user))), listS(CDOLIST, list(assertion, user_assertions), append(body, NIL)));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt187);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_user_assertions(SubLObject user) {
		{
			SubLObject result = NIL;
			SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				result = dictionary.dictionary_lookup_without_values($csm_user_assertions$.getGlobalValue(), user, UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			return result;
		}
	}

	public static final SubLObject csm_update_user_assertions_cache(SubLObject user, SubLObject assertion) {
		{
			SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				dictionary_utilities.dictionary_push($csm_user_assertions$.getGlobalValue(), user, assertion);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		csm_mark_recent_user_assertion(user);
		return NIL;
	}

	public static final SubLObject csm_get_average_number_of_assertions_per_user() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject no_of_users = length(csm_current_users());
				SubLObject no_of_assertions = ZERO_INTEGER;
				if (no_of_users.isZero()) {
					csm_note($str_alt191$__The_total_number_users_is_0__Ca);
					return NIL;
				}
				{
					SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
					SubLObject needs_to_releaseP = NIL;
					try {
						needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
						{
							SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_assertions$.getGlobalValue()));
							while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
								thread.resetMultipleValues();
								{
									SubLObject user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
									SubLObject assertions = thread.secondMultipleValue();
									thread.resetMultipleValues();
									no_of_assertions = add(no_of_assertions, length(assertions));
									iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
								}
							}
							dictionary_contents.do_dictionary_contents_finalize(iteration_state);
						}
					} finally {
						if (NIL != needs_to_releaseP) {
							ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
						}
					}
				}
				return divide(no_of_assertions, no_of_users);
			}
		}
	}

	public static final SubLObject csm_get_total_number_of_user_assertions() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject no_of_assertions = ZERO_INTEGER;
				SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
					{
						SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_assertions$.getGlobalValue()));
						while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
							thread.resetMultipleValues();
							{
								SubLObject user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
								SubLObject assertions = thread.secondMultipleValue();
								thread.resetMultipleValues();
								no_of_assertions = add(no_of_assertions, length(assertions));
								iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
							}
						}
						dictionary_contents.do_dictionary_contents_finalize(iteration_state);
					}
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
					}
				}
				return no_of_assertions;
			}
		}
	}

	// deflexical
	private static final SubLSymbol $csm_user_topics_lock$ = makeSymbol("*CSM-USER-TOPICS-LOCK*");

	public static final SubLObject with_csm_user_topics_writer_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_WRITER_LOCK, $list_alt194, append(body, NIL));
		}
	}

	public static final SubLObject with_csm_user_topics_reader_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_READER_LOCK, $list_alt194, append(body, NIL));
		}
	}

	public static final SubLObject csm_get_user_topics(SubLObject user) {
		{
			SubLObject result = NIL;
			SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				result = dictionary.dictionary_lookup_without_values($csm_user_topics$.getGlobalValue(), user, UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			return result;
		}
	}

	public static final SubLObject csm_do_topics(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt195);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject topic = NIL;
					SubLObject justifications = NIL;
					SubLObject user_topics = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt195);
					topic = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt195);
					justifications = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt195);
					user_topics = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return listS(DO_DICTIONARY, list(topic, justifications, user_topics), append(body, NIL));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt195);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_get_average_number_of_topics_per_user() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject no_of_users = length(csm_current_users());
				SubLObject no_of_topics = ZERO_INTEGER;
				if (no_of_users.isZero()) {
					csm_note($str_alt197$__The_total_number_users_is_0__Ca);
					return NIL;
				}
				{
					SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
					SubLObject needs_to_releaseP = NIL;
					try {
						needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
						{
							SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
							while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
								thread.resetMultipleValues();
								{
									SubLObject user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
									SubLObject topics = thread.secondMultipleValue();
									thread.resetMultipleValues();
									no_of_topics = add(no_of_topics, dictionary.dictionary_length(topics));
									iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
								}
							}
							dictionary_contents.do_dictionary_contents_finalize(iteration_state);
						}
					} finally {
						if (NIL != needs_to_releaseP) {
							ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
						}
					}
				}
				return divide(no_of_topics, no_of_users);
			}
		}
	}

	public static final SubLObject csm_get_total_number_of_user_topics() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject no_of_topics = ZERO_INTEGER;
				SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
					{
						SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
						while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
							thread.resetMultipleValues();
							{
								SubLObject user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
								SubLObject topics = thread.secondMultipleValue();
								thread.resetMultipleValues();
								no_of_topics = add(no_of_topics, dictionary.dictionary_length(topics));
								iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
							}
						}
						dictionary_contents.do_dictionary_contents_finalize(iteration_state);
					}
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
					}
				}
				return no_of_topics;
			}
		}
	}

	// deflexical
	private static final SubLSymbol $csm_assertion_info_lock$ = makeSymbol("*CSM-ASSERTION-INFO-LOCK*");

	public static final SubLObject with_csm_assertion_info_writer_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_WRITER_LOCK, $list_alt200, append(body, NIL));
		}
	}

	public static final SubLObject with_csm_assertion_info_reader_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_READER_LOCK, $list_alt200, append(body, NIL));
		}
	}

	public static final SubLObject csm_get_assertion_sentence(SubLObject assertion) {
		{
			SubLObject assertion_info_entry = NIL;
			SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				assertion_info_entry = dictionary.dictionary_lookup_without_values($csm_assertion_info$.getGlobalValue(), assertion, UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			if (NIL != csm_assertion_info_entry_p(assertion_info_entry)) {
				return csm_assertion_sentence(assertion_info_entry);
			}
			return fi.assertion_hl_formula(assertion, UNPROVIDED);
		}
	}

	public static final SubLObject csm_get_assertion_mt(SubLObject assertion) {
		{
			SubLObject assertion_info_entry = NIL;
			SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				assertion_info_entry = dictionary.dictionary_lookup_without_values($csm_assertion_info$.getGlobalValue(), assertion, UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			if (NIL != csm_assertion_info_entry_p(assertion_info_entry)) {
				return csm_assertion_mt(assertion_info_entry);
			}
			return assertions_high.assertion_mt(assertion);
		}
	}

	public static final SubLObject csm_get_assertion_universal_time(SubLObject assertion) {
		{
			SubLObject assertion_info_entry = NIL;
			SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				assertion_info_entry = dictionary.dictionary_lookup_without_values($csm_assertion_info$.getGlobalValue(), assertion, UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			if (NIL != csm_assertion_info_entry_p(assertion_info_entry)) {
				return csm_assertion_universal_time(assertion_info_entry);
			}
			return assertion_utilities.assertion_universal_time(assertion);
		}
	}

	public static final SubLObject csm_get_assertion_forts(SubLObject assertion) {
		{
			SubLObject assertion_info_entry = NIL;
			SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				assertion_info_entry = dictionary.dictionary_lookup_without_values($csm_assertion_info$.getGlobalValue(), assertion, UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			if (NIL != csm_assertion_info_entry_p(assertion_info_entry)) {
				return csm_assertion_forts(assertion_info_entry);
			}
			return assertions_high.assertion_forts(T, T, NIL, assertion, UNPROVIDED);
		}
	}

	// deflexical
	private static final SubLSymbol $csm_recent_user_assertions_lock$ = makeSymbol("*CSM-RECENT-USER-ASSERTIONS-LOCK*");

	public static final SubLObject csm_mark_recent_user_assertion(SubLObject user) {
		{
			SubLObject lock = $csm_recent_user_assertions_lock$.getGlobalValue();
			SubLObject release = NIL;
			try {
				release = seize_lock(lock);
				set.set_add(user, $csm_recent_user_assertions$.getGlobalValue());
			} finally {
				if (NIL != release) {
					release_lock(lock);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_unmark_recent_user_assertion(SubLObject user) {
		{
			SubLObject lock = $csm_recent_user_assertions_lock$.getGlobalValue();
			SubLObject release = NIL;
			try {
				release = seize_lock(lock);
				set.set_remove(user, $csm_recent_user_assertions$.getGlobalValue());
			} finally {
				if (NIL != release) {
					release_lock(lock);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_user_has_recent_assertionP(SubLObject user) {
		{
			SubLObject result = NIL;
			SubLObject lock = $csm_recent_user_assertions_lock$.getGlobalValue();
			SubLObject release = NIL;
			try {
				release = seize_lock(lock);
				result = set.set_memberP(user, $csm_recent_user_assertions$.getGlobalValue());
			} finally {
				if (NIL != release) {
					release_lock(lock);
				}
			}
			return result;
		}
	}

	// deflexical
	private static final SubLSymbol $csm_detected_collaboration_opportunities_lock$ = makeSymbol("*CSM-DETECTED-COLLABORATION-OPPORTUNITIES-LOCK*");

	public static final SubLObject with_csm_detected_collaboration_opportunities_writer_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_WRITER_LOCK, $list_alt205, append(body, NIL));
		}
	}

	public static final SubLObject with_csm_detected_collaboration_opportunities_reader_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_READER_LOCK, $list_alt205, append(body, NIL));
		}
	}

	public static final SubLObject csm_already_detected_collaboration_opportunityP(SubLObject user1, SubLObject user2, SubLObject topic1, SubLObject topic2, SubLObject reference_time) {
		{
			SubLObject successP = NIL;
			SubLObject rw_lock_var = $csm_detected_collaboration_opportunities_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				successP = csm_already_detected_collaboration_opportunity_intP(user1, user2, topic1, topic2, reference_time);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			return successP;
		}
	}

	public static final SubLObject csm_already_detected_collaboration_opportunity_intP(SubLObject user1, SubLObject user2, SubLObject topic1, SubLObject topic2, SubLObject reference_time) {
		{
			SubLObject successP = NIL;
			SubLObject user1_cos = dictionary.dictionary_lookup_without_values($csm_detected_collaboration_opportunities$.getGlobalValue(), user1, UNPROVIDED);
			if (NIL != dictionary.dictionary_p(user1_cos)) {
				{
					SubLObject user1_user2_cos = dictionary.dictionary_lookup_without_values(user1_cos, user2, UNPROVIDED);
					if (NIL != user1_user2_cos) {
						if (NIL == successP) {
							{
								SubLObject csome_list_var = user1_user2_cos;
								SubLObject co = NIL;
								for (co = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), co = csome_list_var.first()) {
									{
										SubLObject datum = co;
										SubLObject current = datum;
										SubLObject topic_list = NIL;
										SubLObject co_time = NIL;
										destructuring_bind_must_consp(current, datum, $list_alt206);
										topic_list = current.first();
										current = current.rest();
										destructuring_bind_must_consp(current, datum, $list_alt206);
										co_time = current.first();
										current = current.rest();
										if (NIL == current) {
											if (NIL != temporally_near_datesP(co_time, reference_time)) {
												{
													SubLObject datum_40 = topic_list;
													SubLObject current_41 = datum_40;
													SubLObject co_topic1 = NIL;
													SubLObject co_topic2 = NIL;
													destructuring_bind_must_consp(current_41, datum_40, $list_alt207);
													co_topic1 = current_41.first();
													current_41 = current_41.rest();
													destructuring_bind_must_consp(current_41, datum_40, $list_alt207);
													co_topic2 = current_41.first();
													current_41 = current_41.rest();
													if (NIL == current_41) {
														if ((topic1 == co_topic1) && (topic2 == co_topic2)) {
															successP = T;
														}
													} else {
														cdestructuring_bind_error(datum_40, $list_alt207);
													}
												}
											}
										} else {
											cdestructuring_bind_error(datum, $list_alt206);
										}
									}
								}
							}
						}
					}
				}
			}
			return successP;
		}
	}

	public static final SubLObject csm_note_detected_collaboration_opportunity(SubLObject user1, SubLObject user2, SubLObject topic1, SubLObject topic2, SubLObject reference_time, SubLObject cosine, SubLObject v_kb_paths) {
		if (cosine == UNPROVIDED) {
			cosine = NIL;
		}
		if (v_kb_paths == UNPROVIDED) {
			v_kb_paths = NIL;
		}
		{
			SubLObject rw_lock_var = $csm_detected_collaboration_opportunities_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				csm_note_detected_collaboration_opportunity_int(user1, user2, topic1, topic2, reference_time, cosine, v_kb_paths);
				csm_note_detected_collaboration_opportunity_int(user2, user1, topic2, topic1, reference_time, cosine, v_kb_paths);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_note_detected_collaboration_opportunity_int(SubLObject user1, SubLObject user2, SubLObject topic1, SubLObject topic2, SubLObject reference_time, SubLObject cosine, SubLObject v_kb_paths) {
		{
			SubLObject user1_cos = dictionary.dictionary_lookup_without_values($csm_detected_collaboration_opportunities$.getGlobalValue(), user1, UNPROVIDED);
			if (NIL != dictionary.dictionary_p(user1_cos)) {
				dictionary_utilities.dictionary_push(user1_cos, user2, list(list(topic1, topic2), reference_time));
			} else {
				{
					SubLObject user1_cos_42 = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
					dictionary_utilities.dictionary_push(user1_cos_42, user2, list(list(topic1, topic2), reference_time));
					dictionary.dictionary_enter($csm_detected_collaboration_opportunities$.getGlobalValue(), user1, user1_cos_42);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_unnote_detected_collaboration_opportunity(SubLObject user1, SubLObject user2, SubLObject topic1, SubLObject topic2, SubLObject reference_time, SubLObject cosine, SubLObject v_kb_paths) {
		{
			SubLObject rw_lock_var = $csm_detected_collaboration_opportunities_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				csm_unnote_detected_collaboration_opportunity_int(user1, user2, topic1, topic2, reference_time, cosine, v_kb_paths);
				csm_unnote_detected_collaboration_opportunity_int(user2, user1, topic2, topic1, reference_time, cosine, v_kb_paths);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_unnote_detected_collaboration_opportunity_int(SubLObject user1, SubLObject user2, SubLObject topic1, SubLObject topic2, SubLObject reference_time, SubLObject cosine, SubLObject v_kb_paths) {
		{
			SubLObject user1_cos = dictionary.dictionary_lookup_without_values($csm_detected_collaboration_opportunities$.getGlobalValue(), user1, UNPROVIDED);
			if (NIL != dictionary.dictionary_p(user1_cos)) {
				dictionary_utilities.dictionary_remove_from_value(user1_cos, user2, list(topic1, topic2), symbol_function(EQUAL), symbol_function(CAR));
			}
		}
		return NIL;
	}

	public static final SubLObject csm_get_total_number_of_detected_collaboration_opportunities() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject count = ZERO_INTEGER;
				SubLObject user_count = ZERO_INTEGER;
				SubLObject rw_lock_var = $csm_detected_collaboration_opportunities_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
					{
						SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_detected_collaboration_opportunities$.getGlobalValue()));
						while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
							thread.resetMultipleValues();
							{
								SubLObject user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
								SubLObject coll_opps_for_user = thread.secondMultipleValue();
								thread.resetMultipleValues();
								user_count = add(user_count, ONE_INTEGER);
								{
									SubLObject iteration_state_43 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(coll_opps_for_user));
									while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_43)) {
										thread.resetMultipleValues();
										{
											SubLObject other_user = dictionary_contents.do_dictionary_contents_key_value(iteration_state_43);
											SubLObject user_other_user_coll_opps = thread.secondMultipleValue();
											thread.resetMultipleValues();
											count = add(count, length(user_other_user_coll_opps));
											iteration_state_43 = dictionary_contents.do_dictionary_contents_next(iteration_state_43);
										}
									}
									dictionary_contents.do_dictionary_contents_finalize(iteration_state_43);
								}
								iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
							}
						}
						dictionary_contents.do_dictionary_contents_finalize(iteration_state);
					}
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
					}
				}
				return values(divide(count, TWO_INTEGER), user_count);
			}
		}
	}

	public static final SubLObject csm_initialize_detected_collaboration_opportunities_cache(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		if (NIL != kb_mapping_macros.do_function_extent_index_key_validator($const80$DetectionOfCollaborationOpportuni)) {
			{
				SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec($const80$DetectionOfCollaborationOpportuni);
				SubLObject final_index_iterator = NIL;
				try {
					final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
					{
						SubLObject done_var = NIL;
						SubLObject token_var = NIL;
						while (NIL == done_var) {
							{
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
								SubLObject valid = makeBoolean(token_var != assertion);
								if (NIL != valid) {
									{
										SubLObject coll_opp_nart = cycl_utilities.sentence_arg1(assertion, UNPROVIDED);
										SubLObject time = get_potential_collaboration_opportunity_detection_time(coll_opp_nart);
										if ((NIL != numeric_date_utilities.universal_time_p(time)) && (NIL != temporally_near_datesP(time, reference_time))) {
											{
												SubLObject pcc_gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt(coll_opp_nart, $$potentialCollaboratorConcept, ONE_INTEGER, $TRUE);
												if (NIL != list_utilities.lengthE(pcc_gafs, TWO_INTEGER, UNPROVIDED)) {
													{
														SubLObject user1 = assertions_high.gaf_arg2(pcc_gafs.first());
														SubLObject topic1 = assertions_high.gaf_arg3(pcc_gafs.first());
														SubLObject user2 = assertions_high.gaf_arg2(second(pcc_gafs));
														SubLObject topic2 = assertions_high.gaf_arg3(second(pcc_gafs));
														csm_note_detected_collaboration_opportunity(user1, user2, topic1, topic2, time, UNPROVIDED, UNPROVIDED);
													}
												}
											}
										}
									}
								}
								done_var = makeBoolean(NIL == valid);
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							if (NIL != final_index_iterator) {
								kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
							}
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			}
		}
		return NIL;
	}

	// deflexical
	private static final SubLSymbol $csm_unsuccessful_cn_results_lock$ = makeSymbol("*CSM-UNSUCCESSFUL-CN-RESULTS-LOCK*");

	public static final SubLObject with_csm_unsuccessful_cn_results_writer_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_WRITER_LOCK, $list_alt214, append(body, NIL));
		}
	}

	public static final SubLObject with_csm_unsuccessful_cn_results_reader_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_READER_LOCK, $list_alt214, append(body, NIL));
		}
	}

	public static final SubLObject csm_cache_unsuccessful_cn_results(SubLObject term1, SubLObject term2) {
		if (NIL != csm_terms_known_not_to_be_conceptually_nearP(term1, term2)) {
			return NIL;
		}
		{
			SubLObject rw_lock_var = $csm_unsuccessful_cn_results_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				csm_cache_unsuccessful_cn_results_int(term1, term2);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_cache_unsuccessful_cn_results_int(SubLObject term1, SubLObject term2) {
		{
			SubLObject term1_results = dictionary.dictionary_lookup_without_values($csm_unsuccessful_cn_results$.getGlobalValue(), term1, UNPROVIDED);
			if (NIL == set.set_p(term1_results)) {
				term1_results = set.new_set(symbol_function(EQ), UNPROVIDED);
			}
			set.set_add(term2, term1_results);
			return dictionary.dictionary_enter($csm_unsuccessful_cn_results$.getGlobalValue(), term1, term1_results);
		}
	}

	public static final SubLObject csm_terms_known_not_to_be_conceptually_nearP(SubLObject term1, SubLObject term2) {
		{
			SubLObject result = NIL;
			SubLObject rw_lock_var = $csm_unsuccessful_cn_results_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				result = csm_terms_known_not_to_be_conceptually_near_intP(term1, term2);
				if (NIL == result) {
					result = csm_terms_known_not_to_be_conceptually_near_intP(term2, term1);
				}
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
			return result;
		}
	}

	public static final SubLObject csm_terms_known_not_to_be_conceptually_near_intP(SubLObject term1, SubLObject term2) {
		{
			SubLObject term1_results = dictionary.dictionary_lookup_without_values($csm_unsuccessful_cn_results$.getGlobalValue(), term1, UNPROVIDED);
			if (NIL != set.set_p(term1_results)) {
				return set.set_memberP(term2, term1_results);
			}
		}
		return NIL;
	}

	public static final SubLObject csm_current_users() {
		{
			SubLObject users_from_assertions = NIL;
			SubLObject users_from_topics = NIL;
			{
				SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
					users_from_assertions = dictionary.dictionary_keys($csm_user_assertions$.getGlobalValue());
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
					}
				}
			}
			{
				SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
					users_from_topics = dictionary.dictionary_keys($csm_user_topics$.getGlobalValue());
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
					}
				}
			}
			return union(users_from_assertions, users_from_topics, symbol_function(EQ), UNPROVIDED);
		}
	}

	public static final SubLObject csm_print_user_caches(SubLObject print_unsuccessful_cn_resultsP) {
		if (print_unsuccessful_cn_resultsP == UNPROVIDED) {
			print_unsuccessful_cn_resultsP = NIL;
		}
		format(T, $str_alt215$__ASSERTION_INFO_CACHE___);
		{
			SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				dictionary_utilities.print_dictionary_contents($csm_assertion_info$.getGlobalValue(), UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
		}
		format(T, $str_alt216$__USER_ASSERTIONS_CACHE___);
		{
			SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				dictionary_utilities.print_dictionary_contents($csm_user_assertions$.getGlobalValue(), UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
		}
		format(T, $str_alt217$__USER_TOPICS_CACHE___);
		{
			SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				dictionary_utilities.print_dictionary_contents_wX_dictionary_values($csm_user_topics$.getGlobalValue(), UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
		}
		format(T, $str_alt218$__DETECTED_COLLABORATION_OPPORTUN);
		{
			SubLObject rw_lock_var = $csm_detected_collaboration_opportunities_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
				dictionary_utilities.print_dictionary_contents_wX_dictionary_values($csm_detected_collaboration_opportunities$.getGlobalValue(), UNPROVIDED);
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
				}
			}
		}
		if (NIL != print_unsuccessful_cn_resultsP) {
			format(T, $str_alt219$__UNSUCCESSFUL_CONCEPTUAL_NEARNES);
			{
				SubLObject rw_lock_var = $csm_unsuccessful_cn_results_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
					dictionary_utilities.print_dictionary_contents_wX_dictionary_values($csm_unsuccessful_cn_results$.getGlobalValue(), UNPROVIDED);
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_clear_user_caches(SubLObject clear_unsuccessful_cn_resultsP) {
		if (clear_unsuccessful_cn_resultsP == UNPROVIDED) {
			clear_unsuccessful_cn_resultsP = NIL;
		}
		{
			SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				dictionary.clear_dictionary($csm_assertion_info$.getGlobalValue());
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		{
			SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				dictionary.clear_dictionary($csm_user_assertions$.getGlobalValue());
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		{
			SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				dictionary.clear_dictionary($csm_user_topics$.getGlobalValue());
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		{
			SubLObject lock = $csm_recent_user_assertions_lock$.getGlobalValue();
			SubLObject release = NIL;
			try {
				release = seize_lock(lock);
				set.clear_set($csm_recent_user_assertions$.getGlobalValue());
			} finally {
				if (NIL != release) {
					release_lock(lock);
				}
			}
		}
		{
			SubLObject rw_lock_var = $csm_detected_collaboration_opportunities_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				dictionary.clear_dictionary($csm_detected_collaboration_opportunities$.getGlobalValue());
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		if (NIL != clear_unsuccessful_cn_resultsP) {
			{
				SubLObject rw_lock_var = $csm_unsuccessful_cn_results_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
					dictionary.clear_dictionary($csm_unsuccessful_cn_results$.getGlobalValue());
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject recent_topic_for_userP(SubLObject user, SubLObject topic, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			SubLObject user_topics = csm_get_user_topics(user);
			SubLObject justifications = (NIL != dictionary.dictionary_p(user_topics)) ? ((SubLObject) (dictionary.dictionary_lookup_without_values(user_topics, topic, UNPROVIDED))) : NIL;
			return temporally_near_topicP(reference_time, justifications);
		}
	}

	public static final SubLObject csm_update_user_topics_cache(SubLObject user, SubLObject topics, SubLObject justifications, SubLObject detect_collaboration_opportunitiesP, SubLObject reference_time) {
		if (detect_collaboration_opportunitiesP == UNPROVIDED) {
			detect_collaboration_opportunitiesP = NIL;
		}
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			SubLObject new_topics = NIL;
			if (NIL != detect_collaboration_opportunitiesP) {
				{
					SubLObject cdolist_list_var = topics;
					SubLObject topic = NIL;
					for (topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), topic = cdolist_list_var.first()) {
						if (NIL == recent_topic_for_userP(user, topic, reference_time)) {
							new_topics = cons(topic, new_topics);
						}
					}
				}
			}
			{
				SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
					{
						SubLObject current_user_topics = dictionary.dictionary_lookup_without_values($csm_user_topics$.getGlobalValue(), user, UNPROVIDED);
						if (NIL == dictionary.dictionary_p(current_user_topics)) {
							current_user_topics = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
						}
						{
							SubLObject cdolist_list_var = topics;
							SubLObject topic = NIL;
							for (topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), topic = cdolist_list_var.first()) {
								dictionary_utilities.dictionary_push(current_user_topics, topic, justifications);
							}
						}
						dictionary.dictionary_enter($csm_user_topics$.getGlobalValue(), user, current_user_topics);
					}
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
					}
				}
			}
			if ((NIL != detect_collaboration_opportunitiesP) && (NIL != new_topics)) {
				identify_temporally_near_collaboration_opportunities_for_user_topics(user, nreverse(new_topics), justifications, reference_time);
			}
		}
		return NIL;
	}

	public static final SubLObject guess_user_from_assertion(SubLObject assertion) {
		return guess_user_from_sentence_mt(fi.assertion_hl_formula(assertion, UNPROVIDED), assertions_high.assertion_mt(assertion));
	}

	public static final SubLObject csm_update_user_assertions_cache_with_assertion(SubLObject user, SubLObject assertion) {
		if (NIL == user) {
			user = guess_user_from_assertion(assertion);
		}
		if ((NIL != user) && (NIL == csm_irrelevant_userP(user))) {
			return csm_update_user_assertions_cache(user, assertion);
		}
		return NIL;
	}

	public static final SubLObject csm_update_user_topics_cache_with_assertion(SubLObject user, SubLObject assertion, SubLObject universal_time) {
		{
			SubLObject topics = get_topics_from_sentence_mt(fi.assertion_hl_formula(assertion, UNPROVIDED), assertions_high.assertion_mt(assertion), T, NIL);
			if (NIL != topics) {
				if (NIL == user) {
					user = guess_user_from_assertion(assertion);
				}
				if ((NIL != user) && (NIL == csm_irrelevant_userP(user))) {
					csm_update_user_topics_cache(user, topics, list(assertion), T, universal_time);
				}
			}
			return topics;
		}
	}

	public static final SubLObject csm_update_user_topics_cache_with_sentence_mt(SubLObject sentence, SubLObject mt, SubLObject universal_time) {
		{
			SubLObject topics = get_topics_from_sentence_mt(sentence, mt, T, NIL);
			if (NIL != topics) {
				{
					SubLObject user = guess_user_from_sentence_mt(sentence, mt);
					if ((NIL != user) && (NIL == csm_irrelevant_userP(user))) {
						csm_update_user_topics_cache(user, topics, list(new_csm_topic_justification(sentence, mt, universal_time)), T, universal_time);
					}
					return values(topics, user);
				}
			}
			return values(NIL, NIL);
		}
	}

	public static final SubLObject csm_update_assertion_info_cache(SubLObject assertion, SubLObject info_type, SubLObject info) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if ((info_type == $OWNER) && (NIL == info)) {
				info = guess_user_from_assertion(assertion);
			}
			{
				SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
					{
						SubLObject current_record = dictionary.dictionary_lookup_without_values($csm_assertion_info$.getGlobalValue(), assertion, UNPROVIDED);
						if (NIL != csm_assertion_info_entry_p(current_record)) {
							{
								SubLObject pcase_var = info_type;
								if (pcase_var.eql($OWNER)) {
									csm_set_assertion_info_entry_owner(current_record, info);
								} else if (pcase_var.eql($DATE)) {
									{
										SubLObject time = csm_assertion_info_entry_time(current_record);
										csm_set_assertion_info_entry_date(current_record, info);
										if (NIL != time) {
											csm_set_assertion_info_entry_universal_time(current_record, numeric_date_utilities.universal_time_from_date_and_second(info, time));
										}
									}
								} else if (pcase_var.eql($TIME)) {
									{
										SubLObject date = csm_assertion_info_entry_date(current_record);
										csm_set_assertion_info_entry_time(current_record, info);
										if (NIL != date) {
											csm_set_assertion_info_entry_universal_time(current_record, numeric_date_utilities.universal_time_from_date_and_second(date, info));
										}
									}
								} else if (pcase_var.eql($UNIVERSAL_TIME)) {
									thread.resetMultipleValues();
									{
										SubLObject date = numeric_date_utilities.universal_date_and_second_from_time(info);
										SubLObject time = thread.secondMultipleValue();
										thread.resetMultipleValues();
										csm_set_assertion_info_entry_date(current_record, date);
										csm_set_assertion_info_entry_time(current_record, time);
									}
									csm_set_assertion_info_entry_universal_time(current_record, info);
								}

							}
						} else {
							current_record = new_csm_assertion_info_entry(assertion, list(list(info_type, info)));
						}
						dictionary.dictionary_enter($csm_assertion_info$.getGlobalValue(), assertion, current_record);
					}
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject csm_update_caches_with_removed_sentence_mt(SubLObject sentence, SubLObject mt) {
		return NIL;
	}

	public static final SubLObject csm_kb_modify_create_assertion_action(SubLObject event, SubLObject param) {
		if (param == UNPROVIDED) {
			param = NIL;
		}
		{
			SubLObject v_class = event_model.event_class(event);
			SubLObject event_info = event_model.event_message(event);
			SubLObject source = event_model.event_source(event);
			SubLObject timestamp = event_model.event_timestamp(event);
			if (event_info.isList()) {
				{
					SubLObject assertion_sentence = clauses.cnf_formula(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event)), UNPROVIDED);
					SubLObject assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event)));
					SubLObject error_message = NIL;
					try {
						{
							SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
							try {
								bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
								try {
									if ((NIL != csm_relevant_sentenceP(assertion_sentence, assertion_mt)) && (NIL != csm_create_assertion_topic_relevant_sentenceP(assertion_sentence, assertion_mt))) {
										csm_update_user_topics_cache_with_sentence_mt(assertion_sentence, assertion_mt, timestamp);
									}
								} catch (Throwable catch_var) {
									Errors.handleThrowable(catch_var, NIL);
								}
							} finally {
								rebind(Errors.$error_handler$, _prev_bind_0);
							}
						}
					} catch (Throwable ccatch_env_var) {
						error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
					}
					if (NIL != error_message) {
						csm_note_error(CSM_KB_MODIFY_CREATE_ASSERTION_ACTION, error_message);
					}
					return values(v_class, event_info, source, timestamp, assertion_sentence, assertion_mt);
				}
			}
			return values(v_class, event_info, source, timestamp, NIL, NIL);
		}
	}

	public static final SubLObject csm_kb_modify_remove_assertion_action(SubLObject event, SubLObject param) {
		if (param == UNPROVIDED) {
			param = NIL;
		}
		{
			SubLObject v_class = event_model.event_class(event);
			SubLObject event_info = event_model.event_message(event);
			SubLObject source = event_model.event_source(event);
			SubLObject timestamp = event_model.event_timestamp(event);
			if (event_info.isList()) {
				{
					SubLObject assertion_sentence = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
					SubLObject assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event)));
					SubLObject error_message = NIL;
					try {
						{
							SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
							try {
								bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
								try {
									if (NIL != csm_relevant_sentenceP(assertion_sentence, assertion_mt)) {
										csm_update_caches_with_removed_sentence_mt(assertion_sentence, assertion_mt);
									}
								} catch (Throwable catch_var) {
									Errors.handleThrowable(catch_var, NIL);
								}
							} finally {
								rebind(Errors.$error_handler$, _prev_bind_0);
							}
						}
					} catch (Throwable ccatch_env_var) {
						error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
					}
					if (NIL != error_message) {
						csm_note_error(CSM_KB_MODIFY_REMOVE_ASSERTION_ACTION, error_message);
					}
					return values(v_class, event_info, source, timestamp, assertion_sentence, assertion_mt);
				}
			}
			return values(v_class, event_info, source, timestamp, NIL, NIL);
		}
	}

	public static final SubLObject csm_kb_modify_set_assertion_asserted_by_action(SubLObject event, SubLObject param) {
		if (param == UNPROVIDED) {
			param = NIL;
		}
		{
			SubLObject v_class = event_model.event_class(event);
			SubLObject event_info = event_model.event_message(event);
			SubLObject source = event_model.event_source(event);
			SubLObject timestamp = event_model.event_timestamp(event);
			if (event_info.isList()) {
				{
					SubLObject assertion = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_by_retrieve_assertion(event));
					if (NIL != csm_relevant_assertionP(assertion)) {
						{
							SubLObject old_asserted_by = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_by_retrieve_old_asserted_by(event));
							SubLObject new_asserted_by = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_by_retrieve_new_asserted_by(event));
							SubLObject error_message = NIL;
							try {
								{
									SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
									try {
										bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
										try {
											if (NIL == csm_irrelevant_userP(new_asserted_by)) {
												csm_update_assertion_info_cache(assertion, $OWNER, new_asserted_by);
												if (NIL != csm_special_topic_sentenceP(fi.assertion_hl_formula(assertion, UNPROVIDED), UNPROVIDED)) {
													csm_update_user_topics_cache_with_assertion(new_asserted_by, assertion, timestamp);
												} else {
													csm_update_user_assertions_cache_with_assertion(new_asserted_by, assertion);
												}
											}
										} catch (Throwable catch_var) {
											Errors.handleThrowable(catch_var, NIL);
										}
									} finally {
										rebind(Errors.$error_handler$, _prev_bind_0);
									}
								}
							} catch (Throwable ccatch_env_var) {
								error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
							}
							if (NIL != error_message) {
								csm_note_error(CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_BY_ACTION, error_message);
							}
							return values(v_class, event_info, source, timestamp, assertion, old_asserted_by, new_asserted_by);
						}
					}
				}
			}
			return values(v_class, event_info, source, timestamp, NIL, NIL, NIL);
		}
	}

	public static final SubLObject csm_kb_modify_set_assertion_asserted_when_action(SubLObject event, SubLObject param) {
		if (param == UNPROVIDED) {
			param = NIL;
		}
		{
			SubLObject v_class = event_model.event_class(event);
			SubLObject event_info = event_model.event_message(event);
			SubLObject source = event_model.event_source(event);
			SubLObject timestamp = event_model.event_timestamp(event);
			if (event_info.isList()) {
				{
					SubLObject assertion = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_when_retrieve_assertion(event));
					if (NIL != csm_relevant_assertionP(assertion)) {
						{
							SubLObject old_asserted_when = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_when_retrieve_old_asserted_when(event));
							SubLObject new_asserted_when = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_when_retrieve_new_asserted_when(event));
							SubLObject error_message = NIL;
							try {
								{
									SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
									try {
										bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
										try {
											csm_update_assertion_info_cache(assertion, $DATE, new_asserted_when);
										} catch (Throwable catch_var) {
											Errors.handleThrowable(catch_var, NIL);
										}
									} finally {
										rebind(Errors.$error_handler$, _prev_bind_0);
									}
								}
							} catch (Throwable ccatch_env_var) {
								error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
							}
							if (NIL != error_message) {
								csm_note_error(CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN_ACTION, error_message);
							}
							return values(v_class, event_info, source, timestamp, assertion, old_asserted_when, new_asserted_when);
						}
					}
				}
			}
			return values(v_class, event_info, source, timestamp, NIL, NIL, NIL);
		}
	}

	public static final SubLObject csm_kb_modify_set_assertion_asserted_second_action(SubLObject event, SubLObject param) {
		if (param == UNPROVIDED) {
			param = NIL;
		}
		{
			SubLObject v_class = event_model.event_class(event);
			SubLObject event_info = event_model.event_message(event);
			SubLObject source = event_model.event_source(event);
			SubLObject timestamp = event_model.event_timestamp(event);
			if (event_info.isList()) {
				{
					SubLObject assertion = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_second_retrieve_assertion(event));
					if (NIL != csm_relevant_assertionP(assertion)) {
						{
							SubLObject old_asserted_second = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_second_retrieve_old_asserted_second(event));
							SubLObject new_asserted_second = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_set_assertion_asserted_second_retrieve_new_asserted_second(event));
							SubLObject error_message = NIL;
							try {
								{
									SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
									try {
										bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
										try {
											csm_update_assertion_info_cache(assertion, $TIME, new_asserted_second);
										} catch (Throwable catch_var) {
											Errors.handleThrowable(catch_var, NIL);
										}
									} finally {
										rebind(Errors.$error_handler$, _prev_bind_0);
									}
								}
							} catch (Throwable ccatch_env_var) {
								error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
							}
							if (NIL != error_message) {
								csm_note_error(CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND_ACTION, error_message);
							}
							return values(v_class, event_info, source, timestamp, assertion, old_asserted_second, new_asserted_second);
						}
					}
				}
			}
			return values(v_class, event_info, source, timestamp, NIL, NIL, NIL);
		}
	}

	public static final SubLObject csm_initialize_event_listeners() {
		$csm_kb_modify_create_assertion_event_listener$.setGlobalValue(event_broker.describe_funcall_listener($KB_MODIFY_CREATE_ASSERTION, CSM_KB_MODIFY_CREATE_ASSERTION_ACTION, UNPROVIDED, UNPROVIDED));
		kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_create_assertion_event_listener$.getGlobalValue());
		$csm_kb_modify_set_assertion_asserted_by_event_listener$.setGlobalValue(event_broker.describe_funcall_listener($KB_MODIFY_SET_ASSERTION_ASSERTED_BY, CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_BY_ACTION, UNPROVIDED, UNPROVIDED));
		kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_set_assertion_asserted_by_event_listener$.getGlobalValue());
		$csm_kb_modify_set_assertion_asserted_when_event_listener$.setGlobalValue(event_broker.describe_funcall_listener($KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN, CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN_ACTION, UNPROVIDED, UNPROVIDED));
		kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_set_assertion_asserted_when_event_listener$.getGlobalValue());
		$csm_kb_modify_set_assertion_asserted_second_event_listener$.setGlobalValue(event_broker.describe_funcall_listener($KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND, CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND_ACTION, UNPROVIDED, UNPROVIDED));
		kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_set_assertion_asserted_second_event_listener$.getGlobalValue());
		kb_modification_event.ensure_kb_modifications_event_dispatcher_running();
		return NIL;
	}

	public static final SubLObject csm_deregister_event_listeners() {
		kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_create_assertion_event_listener$.getGlobalValue());
		kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_set_assertion_asserted_by_event_listener$.getGlobalValue());
		kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_set_assertion_asserted_when_event_listener$.getGlobalValue());
		kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher($csm_kb_modify_set_assertion_asserted_second_event_listener$.getGlobalValue());
		return NIL;
	}

	// deflexical
	private static final SubLSymbol $csm_implementational_constants$ = makeSymbol("*CSM-IMPLEMENTATIONAL-CONSTANTS*");

	public static final SubLObject csm_relevant_assertionP(SubLObject assertion) {
		return makeBoolean(((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) && (NIL != fi.assertion_hl_formula(assertion, UNPROVIDED))) && (NIL == list_utilities.member_eqP(cycl_utilities.formula_operator(fi.assertion_hl_formula(assertion, UNPROVIDED)), $csm_implementational_constants$.getGlobalValue())));
	}

	public static final SubLObject csm_relevant_sentenceP(SubLObject sentence, SubLObject mt) {
		return makeBoolean(NIL == list_utilities.member_eqP(cycl_utilities.formula_operator(sentence), $csm_implementational_constants$.getGlobalValue()));
	}

	public static final SubLObject csm_create_assertion_topic_relevant_sentenceP(SubLObject sentence, SubLObject mt) {
		{
			SubLObject operator = cycl_utilities.formula_operator(sentence);
			return list_utilities.member_eqP(operator, $list_alt235);
		}
	}

	// deflexical
	private static final SubLSymbol $csm_irrelevant_userP_caching_state$ = makeSymbol("*CSM-IRRELEVANT-USER?-CACHING-STATE*");

	public static final SubLObject clear_csm_irrelevant_userP() {
		{
			SubLObject cs = $csm_irrelevant_userP_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_csm_irrelevant_userP(SubLObject user) {
		return memoization_state.caching_state_remove_function_results_with_args($csm_irrelevant_userP_caching_state$.getGlobalValue(), list(user), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject csm_irrelevant_userP_internal(SubLObject user) {
		return isa.quoted_isa_in_any_mtP(user, $$IndeterminateTerm);
	}

	public static final SubLObject csm_irrelevant_userP(SubLObject user) {
		{
			SubLObject caching_state = $csm_irrelevant_userP_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name($sym236$CSM_IRRELEVANT_USER_, $sym238$_CSM_IRRELEVANT_USER__CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, user, $kw90$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(csm_irrelevant_userP_internal(user)));
					memoization_state.caching_state_put(caching_state, user, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_between_users(SubLObject user1, SubLObject user2, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			SubLObject topics1 = csm_get_user_topics(user1);
			SubLObject topics2 = csm_get_user_topics(user2);
			return identify_temporally_near_collaboration_opportunities_between_users_int(user1, user2, topics1, topics2, reference_time);
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_between_users_int(SubLObject user1, SubLObject user2, SubLObject topics1, SubLObject topics2, SubLObject reference_time) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(topics1));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject topic1 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject justifications1 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (NIL != temporally_near_topicP(reference_time, justifications1)) {
							{
								SubLObject iteration_state_44 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(topics2));
								while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_44)) {
									thread.resetMultipleValues();
									{
										SubLObject topic2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_44);
										SubLObject justifications2 = thread.secondMultipleValue();
										thread.resetMultipleValues();
										if ((NIL != temporally_near_topicP(reference_time, justifications2)) && (NIL == csm_already_detected_collaboration_opportunityP(user1, user2, topic1, topic2, reference_time))) {
											thread.resetMultipleValues();
											{
												SubLObject cosine = conceptually_near_termsP(topic1, topic2, $csm_quit_after_first_kb_pathP$.getDynamicValue(thread));
												SubLObject v_kb_paths = thread.secondMultipleValue();
												thread.resetMultipleValues();
												if (NIL != cosine) {
													result = cons(list(topic1, topic2, cosine, v_kb_paths), result);
													csm_note_detected_collaboration_opportunity(user1, user2, topic1, topic2, reference_time, cosine, v_kb_paths);
												}
											}
										}
										iteration_state_44 = dictionary_contents.do_dictionary_contents_next(iteration_state_44);
									}
								}
								dictionary_contents.do_dictionary_contents_finalize(iteration_state_44);
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				alert_users_about_collaboration_opportunities(result, reference_time);
				return result;
			}
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				SubLObject i = ZERO_INTEGER;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject user1 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject topics1 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						{
							SubLObject j = ZERO_INTEGER;
							SubLObject iteration_state_45 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
							while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_45)) {
								thread.resetMultipleValues();
								{
									SubLObject user2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_45);
									SubLObject topics2 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (!i.numGE(j)) {
										{
											SubLObject sub_result = identify_temporally_near_collaboration_opportunities_between_users_int(user1, user2, topics1, topics2, reference_time);
											if (NIL != sub_result) {
												result = cons(list(user1, user2, sub_result), result);
											}
										}
									}
									j = add(j, ONE_INTEGER);
									iteration_state_45 = dictionary_contents.do_dictionary_contents_next(iteration_state_45);
								}
							}
							dictionary_contents.do_dictionary_contents_finalize(iteration_state_45);
						}
						i = add(i, ONE_INTEGER);
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				alert_users_about_collaboration_opportunities(result, reference_time);
				return result;
			}
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_for_user(SubLObject user, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject user_topics = dictionary.dictionary_lookup_without_values($csm_user_topics$.getGlobalValue(), user, UNPROVIDED);
				SubLObject result = NIL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject other_user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject other_topics = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (user != other_user) {
							{
								SubLObject sub_result = identify_temporally_near_collaboration_opportunities_between_users_int(user, other_user, user_topics, other_topics, reference_time);
								if (NIL != sub_result) {
									result = cons(list(user, other_user, sub_result), result);
								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				alert_users_about_collaboration_opportunities(result, reference_time);
				return result;
			}
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_for_user_topic(SubLObject user, SubLObject topic, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject other_user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject other_topics = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (user != other_user) {
							{
								SubLObject other_user_result = NIL;
								SubLObject iteration_state_46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(other_topics));
								while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_46)) {
									thread.resetMultipleValues();
									{
										SubLObject other_topic = dictionary_contents.do_dictionary_contents_key_value(iteration_state_46);
										SubLObject other_justifications = thread.secondMultipleValue();
										thread.resetMultipleValues();
										if ((NIL != temporally_near_topicP(reference_time, other_justifications)) && (NIL == csm_already_detected_collaboration_opportunityP(user, other_user, topic, other_topic, reference_time))) {
											thread.resetMultipleValues();
											{
												SubLObject cosine = conceptually_near_termsP(topic, other_topic, $csm_quit_after_first_kb_pathP$.getDynamicValue(thread));
												SubLObject v_kb_paths = thread.secondMultipleValue();
												thread.resetMultipleValues();
												if (NIL != cosine) {
													other_user_result = cons(list(topic, other_topic, cosine, v_kb_paths), other_user_result);
													csm_note_detected_collaboration_opportunity(user, other_user, topic, other_topic, reference_time, cosine, v_kb_paths);
												}
											}
										}
										iteration_state_46 = dictionary_contents.do_dictionary_contents_next(iteration_state_46);
									}
								}
								dictionary_contents.do_dictionary_contents_finalize(iteration_state_46);
								if (NIL != other_user_result) {
									result = cons(list(user, other_user, other_user_result), result);
								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				alert_users_about_collaboration_opportunities(result, reference_time);
				return result;
			}
		}
	}

	public static final SubLObject temporally_near_topicP(SubLObject reference_time, SubLObject topic_justifications) {
		{
			SubLObject successP = NIL;
			if (NIL == successP) {
				{
					SubLObject csome_list_var = topic_justifications;
					SubLObject justification_list = NIL;
					for (justification_list = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), justification_list = csome_list_var.first()) {
						if (NIL == successP) {
							{
								SubLObject csome_list_var_47 = justification_list;
								SubLObject justification_part = NIL;
								for (justification_part = csome_list_var_47.first(); !((NIL != successP) || (NIL == csome_list_var_47)); csome_list_var_47 = csome_list_var_47.rest(), justification_part = csome_list_var_47.first()) {
									if (NIL != temporally_near_topic_justificationP(justification_part, reference_time)) {
										successP = T;
									}
								}
							}
						}
					}
				}
			}
			return successP;
		}
	}

	public static final SubLObject temporally_near_topic_justificationP(SubLObject justification, SubLObject reference_time) {
		{
			SubLObject just_time = NIL;
			if (NIL != assertion_handles.assertion_p(justification)) {
				just_time = csm_get_assertion_universal_time(justification);
			} else if (NIL != csm_topic_justification_p(justification)) {
				just_time = csm_topic_justification_universal_time(justification);
			}

			if (NIL != numeric_date_utilities.universal_time_p(just_time)) {
				return temporally_near_datesP(reference_time, just_time);
			}
		}
		return NIL;
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_for_user_topics(SubLObject user, SubLObject topics, SubLObject justifications, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			csm_note(cconcatenate($str_alt239$Searching_for_collaboration_oppor, new SubLObject[] { format_nil.format_nil_a_no_copy(user), $str_alt240$_and_topics_, format_nil.format_nil_a_no_copy(topics), $str_alt119$___ }));
			{
				SubLObject result = NIL;
				SubLObject state = memoization_state.possibly_new_memoization_state();
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject other_user_topics_to_be_checked = identify_temporally_near_collaboration_opportunities_for_user_topics_int1(user, reference_time);
									result = identify_temporally_near_collaboration_opportunities_for_user_topics_int2(user, topics, other_user_topics_to_be_checked, reference_time);
									alert_users_about_collaboration_opportunities(result, reference_time);
								}
							} finally {
								{
									SubLObject _prev_bind_0_48 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_48, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_for_user_topics_int1(SubLObject user, SubLObject reference_time) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject other_user_topics_to_be_checked = NIL;
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								{
									SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
									SubLObject needs_to_releaseP = NIL;
									try {
										needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
										{
											SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
											while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
												thread.resetMultipleValues();
												{
													SubLObject other_user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
													SubLObject other_topics = thread.secondMultipleValue();
													thread.resetMultipleValues();
													if (user != other_user) {
														{
															SubLObject other_user_result = identify_temporally_near_collaboration_opportunities_for_user_topics_int1_int(other_topics, reference_time);
															if (NIL != other_user_result) {
																other_user_topics_to_be_checked = cons(list(other_user, other_user_result), other_user_topics_to_be_checked);
															}
														}
													}
													iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
												}
											}
											dictionary_contents.do_dictionary_contents_finalize(iteration_state);
										}
									} finally {
										if (NIL != needs_to_releaseP) {
											ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
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
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error($sym241$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP, error_message);
				}
				return other_user_topics_to_be_checked;
			}
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_for_user_topics_int1_int(SubLObject other_topics, SubLObject reference_time) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject other_user_result = NIL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(other_topics));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject other_topic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject other_justifications = thread.secondMultipleValue();
						thread.resetMultipleValues();
						{
							SubLObject error_message = NIL;
							try {
								{
									SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
									try {
										Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
										try {
											if (NIL != temporally_near_topicP(reference_time, other_justifications)) {
												other_user_result = cons(other_topic, other_user_result);
											}
										} catch (Throwable catch_var) {
											Errors.handleThrowable(catch_var, NIL);
										}
									} finally {
										Errors.$error_handler$.rebind(_prev_bind_0, thread);
									}
								}
							} catch (Throwable ccatch_env_var) {
								error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
							}
							if (NIL != error_message) {
								csm_note_error($sym242$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP, error_message);
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				return other_user_result;
			}
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_for_user_topics_int2(SubLObject user, SubLObject topics, SubLObject other_user_topics_to_be_checked, SubLObject reference_time) {
		{
			SubLObject result = NIL;
			SubLObject error_message = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
						try {
							{
								SubLObject cdolist_list_var = other_user_topics_to_be_checked;
								SubLObject other_user_and_topics = NIL;
								for (other_user_and_topics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), other_user_and_topics = cdolist_list_var.first()) {
									{
										SubLObject datum = other_user_and_topics;
										SubLObject current = datum;
										SubLObject other_user = NIL;
										SubLObject other_user_topics = NIL;
										destructuring_bind_must_consp(current, datum, $list_alt243);
										other_user = current.first();
										current = current.rest();
										destructuring_bind_must_consp(current, datum, $list_alt243);
										other_user_topics = current.first();
										current = current.rest();
										if (NIL == current) {
											{
												SubLObject other_user_result = identify_temporally_near_collaboration_opportunities_for_user_topics_int2_int(user, topics, other_user, other_user_topics, reference_time);
												if (NIL != other_user_result) {
													result = cons(list(user, other_user, other_user_result), result);
												}
											}
										} else {
											cdestructuring_bind_error(datum, $list_alt243);
										}
									}
								}
							}
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			}
			if (NIL != error_message) {
				csm_note_error($sym244$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP, error_message);
			}
			return result;
		}
	}

	public static final SubLObject identify_temporally_near_collaboration_opportunities_for_user_topics_int2_int(SubLObject user, SubLObject topics, SubLObject other_user, SubLObject other_user_topics, SubLObject reference_time) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject other_user_result = NIL;
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								{
									SubLObject cdolist_list_var = other_user_topics;
									SubLObject other_topic = NIL;
									for (other_topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), other_topic = cdolist_list_var.first()) {
										csm_note(cconcatenate($str_alt245$Considering_user_, new SubLObject[] { format_nil.format_nil_a_no_copy(other_user), $str_alt246$_and_topic_, format_nil.format_nil_a_no_copy(other_topic), $str_alt119$___ }));
										{
											SubLObject cdolist_list_var_49 = topics;
											SubLObject topic = NIL;
											for (topic = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest(), topic = cdolist_list_var_49.first()) {
												if (NIL == csm_already_detected_collaboration_opportunityP(user, other_user, topic, other_topic, reference_time)) {
													thread.resetMultipleValues();
													{
														SubLObject cosine = conceptually_near_termsP(topic, other_topic, $csm_quit_after_first_kb_pathP$.getDynamicValue(thread));
														SubLObject v_kb_paths = thread.secondMultipleValue();
														thread.resetMultipleValues();
														if (NIL != cosine) {
															other_user_result = cons(list(topic, other_topic, cosine, v_kb_paths), other_user_result);
															csm_note_detected_collaboration_opportunity(user, other_user, topic, other_topic, reference_time, cosine, v_kb_paths);
														}
													}
												}
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
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error($sym247$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP, error_message);
				}
				return other_user_result;
			}
		}
	}

	public static final SubLObject csm_identify_new_topics_for_user(SubLObject user, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		csm_note(cconcatenate($str_alt248$Identifying_new_topics_for_user_, new SubLObject[] { format_nil.format_nil_a_no_copy(user), $str_alt119$___ }));
		{
			SubLObject bag_of_terms = NIL;
			SubLObject topics = NIL;
			SubLObject justifications = NIL;
			SubLObject error_message = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
						try {
							{
								SubLObject user_assertions = csm_user_assertions(user);
								SubLObject cdolist_list_var = user_assertions;
								SubLObject assertion = NIL;
								for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
									{
										SubLObject assertion_time = csm_get_assertion_universal_time(assertion);
										if ((NIL != numeric_date_utilities.universal_time_p(assertion_time)) && (NIL != date_within_date_clusterP(assertion_time, reference_time))) {
											{
												SubLObject sentence = csm_get_assertion_sentence(assertion);
												SubLObject mt = csm_get_assertion_mt(assertion);
												SubLObject terms = get_topics_from_sentence_mt(sentence, mt, NIL, T);
												if (NIL != terms) {
													bag_of_terms = append(bag_of_terms, terms);
													justifications = cons(assertion, justifications);
												}
											}
										}
									}
								}
							}
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			}
			if (NIL != error_message) {
				csm_note_error(CSM_IDENTIFY_NEW_TOPICS_FOR_USER, error_message);
			}
			topics = determine_topics_for_bag_of_terms(bag_of_terms);
			csm_note(cconcatenate($str_alt250$The_following_topics_were_identif, new SubLObject[] { format_nil.format_nil_a_no_copy(user), $str_alt251$__, format_nil.format_nil_a_no_copy(topics), $str_alt119$___ }));
			return values(topics, justifications);
		}
	}

	public static final SubLObject csm_update_topics_for_user(SubLObject user, SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject topics = NIL;
				SubLObject justifications = NIL;
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								thread.resetMultipleValues();
								{
									SubLObject topics_50 = csm_identify_new_topics_for_user(user, reference_time);
									SubLObject justifications_51 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									topics = topics_50;
									justifications = justifications_51;
								}
								if (NIL != topics) {
									csm_update_user_topics_cache(user, topics, justifications, NIL, reference_time);
								}
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							Errors.$error_handler$.rebind(_prev_bind_0, thread);
						}
					}
				} catch (Throwable ccatch_env_var) {
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error(CSM_UPDATE_TOPICS_FOR_USER, error_message);
				}
				return values(topics, justifications);
			}
		}
	}

	public static final SubLObject csm_update_user_topics(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			csm_note(cconcatenate($str_alt253$Identifying_new_topics_for_users_, new SubLObject[] { format_nil.format_nil_a_no_copy(numeric_date_utilities.get_universal_date(reference_time, UNPROVIDED)), $str_alt72$_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.get_universal_second(reference_time)), $str_alt119$___ }));
			{
				SubLObject users = csm_current_users();
				SubLObject result = NIL;
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								{
									SubLObject cdolist_list_var = users;
									SubLObject user = NIL;
									for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), user = cdolist_list_var.first()) {
										if (NIL != csm_user_has_recent_assertionP(user)) {
											thread.resetMultipleValues();
											{
												SubLObject topics = csm_update_topics_for_user(user, reference_time);
												SubLObject justifications = thread.secondMultipleValue();
												thread.resetMultipleValues();
												if (NIL != topics) {
													result = cons(list(user, topics, justifications), result);
												}
											}
											csm_unmark_recent_user_assertion(user);
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
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error(CSM_UPDATE_USER_TOPICS, error_message);
				}
				csm_note(copy_seq($str_alt255$Done_with_identifying_new_topics_));
				csm_display_cost_effectiveness_data(NIL);
				return result;
			}
		}
	}

	/**
	 * Updates topics for users by analyzing user assertions to
	 * determine the concepts that are more indicative of the topic(s)
	 * of the assertions made by a given user in a relatively short
	 * time frame by comparing the frequencies of the concepts
	 * mentioned in the assertions in question. Any topics thus
	 * computed are compared with the topics for other users for
	 * potential temporally near collaboration opportunities.
	 */
	public static final SubLObject csm_update_and_analyze_user_topics(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								{
									SubLObject state = memoization_state.possibly_new_memoization_state();
									SubLObject local_state = state;
									{
										SubLObject _prev_bind_0_52 = memoization_state.$memoization_state$.currentBinding(thread);
										try {
											memoization_state.$memoization_state$.bind(local_state, thread);
											{
												final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
												try {
													{
														SubLObject new_user_topics_list = csm_update_user_topics(reference_time);
														SubLObject cdolist_list_var = new_user_topics_list;
														SubLObject new_user_topics = NIL;
														for (new_user_topics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), new_user_topics = cdolist_list_var.first()) {
															{
																SubLObject datum = new_user_topics;
																SubLObject current = datum;
																SubLObject user = NIL;
																SubLObject topics = NIL;
																SubLObject justifications = NIL;
																destructuring_bind_must_consp(current, datum, $list_alt256);
																user = current.first();
																current = current.rest();
																destructuring_bind_must_consp(current, datum, $list_alt256);
																topics = current.first();
																current = current.rest();
																destructuring_bind_must_consp(current, datum, $list_alt256);
																justifications = current.first();
																current = current.rest();
																if (NIL == current) {
																	identify_temporally_near_collaboration_opportunities_for_user_topics(user, topics, justifications, reference_time);
																} else {
																	cdestructuring_bind_error(datum, $list_alt256);
																}
															}
														}
													}
												} finally {
													{
														SubLObject _prev_bind_0_53 = $is_thread_performing_cleanupP$.currentBinding(thread);
														try {
															$is_thread_performing_cleanupP$.bind(T, thread);
															if ((NIL != local_state) && (NIL == original_memoization_process)) {
																memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
															}
														} finally {
															$is_thread_performing_cleanupP$.rebind(_prev_bind_0_53, thread);
														}
													}
												}
											}
										} finally {
											memoization_state.$memoization_state$.rebind(_prev_bind_0_52, thread);
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
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error(CSM_UPDATE_AND_ANALYZE_USER_TOPICS, error_message);
				}
			}
			return NIL;
		}
	}

	/**
	 * Reviews user caches (that store user topics and assertions,
	 * among other things, to remove any topics/assertions that
	 * are too old to be useful in the detection of temporally
	 * near collaboration opportunities in real time.
	 */
	public static final SubLObject csm_clean_up_user_caches(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject error_message = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								{
									SubLObject state = memoization_state.possibly_new_memoization_state();
									SubLObject local_state = state;
									{
										SubLObject _prev_bind_0_54 = memoization_state.$memoization_state$.currentBinding(thread);
										try {
											memoization_state.$memoization_state$.bind(local_state, thread);
											{
												final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
												try {
													csm_clean_up_user_topics_cache(reference_time);
												} finally {
													{
														SubLObject _prev_bind_0_55 = $is_thread_performing_cleanupP$.currentBinding(thread);
														try {
															$is_thread_performing_cleanupP$.bind(T, thread);
															csm_clean_up_user_assertions_cache(reference_time);
															csm_clean_up_assertion_info_cache(reference_time);
															csm_clean_up_detected_collaboration_opportunities_cache(reference_time);
															csm_mark_irrelevant_detection_of_potential_colloboration_opportunity_narts(reference_time);
															if ((NIL != local_state) && (NIL == original_memoization_process)) {
																memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
															}
														} finally {
															$is_thread_performing_cleanupP$.rebind(_prev_bind_0_55, thread);
														}
													}
												}
											}
										} finally {
											memoization_state.$memoization_state$.rebind(_prev_bind_0_54, thread);
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
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error_message) {
					csm_note_error(CSM_CLEAN_UP_USER_CACHES, error_message);
				}
			}
			return NIL;
		}
	}

	public static final SubLObject csm_clean_up_user_topics_cache(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject rw_lock_var = $csm_user_topics_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
					{
						SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_user_topics$.getGlobalValue()));
						while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
							thread.resetMultipleValues();
							{
								SubLObject user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
								SubLObject topics = thread.secondMultipleValue();
								thread.resetMultipleValues();
								{
									SubLObject topics_alist = dictionary_utilities.dictionary_to_alist(topics);
									SubLObject cdolist_list_var = topics_alist;
									SubLObject cons = NIL;
									for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
										{
											SubLObject datum = cons;
											SubLObject current = datum;
											SubLObject topic = NIL;
											SubLObject justifications = NIL;
											destructuring_bind_must_consp(current, datum, $list_alt259);
											topic = current.first();
											current = current.rest();
											justifications = current;
											if (NIL != forts.valid_fortP(topic)) {
												{
													SubLObject new_justifications = NIL;
													SubLObject cdolist_list_var_56 = justifications;
													SubLObject justification_list = NIL;
													for (justification_list = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest(), justification_list = cdolist_list_var_56.first()) {
														{
															SubLObject new_subjustification = NIL;
															SubLObject cdolist_list_var_57 = justification_list;
															SubLObject justification_part = NIL;
															for (justification_part = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest(), justification_part = cdolist_list_var_57.first()) {
																if (NIL != temporally_near_topic_justificationP(justification_part, reference_time)) {
																	new_subjustification = cons(justification_part, new_subjustification);
																}
															}
															if (NIL != new_subjustification) {
																new_justifications = cons(nreverse(new_subjustification), new_justifications);
															}
														}
													}
													if (NIL != new_justifications) {
														dictionary.dictionary_enter(topics, topic, nreverse(new_justifications));
													} else {
														dictionary.dictionary_remove(topics, topic);
													}
												}
											} else {
												dictionary.dictionary_remove(topics, topic);
											}
										}
									}
								}
								iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
							}
						}
						dictionary_contents.do_dictionary_contents_finalize(iteration_state);
					}
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject csm_clean_up_user_assertions_cache(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			SubLObject rw_lock_var = $csm_user_assertions_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				{
					SubLObject user_assertions_alist = dictionary_utilities.dictionary_to_alist($csm_user_assertions$.getGlobalValue());
					SubLObject cdolist_list_var = user_assertions_alist;
					SubLObject cons = NIL;
					for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
						{
							SubLObject datum = cons;
							SubLObject current = datum;
							SubLObject user = NIL;
							SubLObject assertions = NIL;
							destructuring_bind_must_consp(current, datum, $list_alt260);
							user = current.first();
							current = current.rest();
							assertions = current;
							{
								SubLObject new_assertions = NIL;
								SubLObject cdolist_list_var_58 = assertions;
								SubLObject assertion = NIL;
								for (assertion = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest(), assertion = cdolist_list_var_58.first()) {
									if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
										{
											SubLObject assertion_time = csm_get_assertion_universal_time(assertion);
											if ((NIL != numeric_date_utilities.universal_time_p(assertion_time)) && (NIL != temporally_near_datesP(reference_time, assertion_time))) {
												new_assertions = cons(assertion, new_assertions);
											} else {
												{
													SubLObject rw_lock_var_59 = $csm_assertion_info_lock$.getGlobalValue();
													SubLObject needs_to_releaseP_60 = NIL;
													try {
														needs_to_releaseP_60 = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var_59);
														dictionary.dictionary_remove($csm_assertion_info$.getGlobalValue(), assertion);
													} finally {
														if (NIL != needs_to_releaseP_60) {
															ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var_59);
														}
													}
												}
											}
										}
									} else {
										{
											SubLObject rw_lock_var_61 = $csm_assertion_info_lock$.getGlobalValue();
											SubLObject needs_to_releaseP_62 = NIL;
											try {
												needs_to_releaseP_62 = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var_61);
												dictionary.dictionary_remove($csm_assertion_info$.getGlobalValue(), assertion);
											} finally {
												if (NIL != needs_to_releaseP_62) {
													ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var_61);
												}
											}
										}
									}
								}
								dictionary.dictionary_enter($csm_user_assertions$.getGlobalValue(), user, nreverse(new_assertions));
							}
						}
					}
				}
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_clean_up_assertion_info_cache(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			SubLObject rw_lock_var = $csm_assertion_info_lock$.getGlobalValue();
			SubLObject needs_to_releaseP = NIL;
			try {
				needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
				{
					SubLObject assertion_info_alist = dictionary_utilities.dictionary_to_alist($csm_assertion_info$.getGlobalValue());
					SubLObject cdolist_list_var = assertion_info_alist;
					SubLObject cons = NIL;
					for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
						{
							SubLObject datum = cons;
							SubLObject current = datum;
							SubLObject assertion = NIL;
							SubLObject info = NIL;
							destructuring_bind_must_consp(current, datum, $list_alt261);
							assertion = current.first();
							current = current.rest();
							info = current;
							if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) && (NIL != csm_assertion_info_entry_p(info))) {
								{
									SubLObject assertion_time = csm_assertion_info_entry_universal_time(info);
									if (NIL == numeric_date_utilities.universal_time_p(assertion_time)) {
										assertion_time = assertion_utilities.assertion_universal_time(assertion);
									}
									if (!((NIL != numeric_date_utilities.universal_time_p(assertion_time)) && (NIL != temporally_near_datesP(reference_time, assertion_time)))) {
										dictionary.dictionary_remove($csm_assertion_info$.getGlobalValue(), assertion);
									}
								}
							} else {
								dictionary.dictionary_remove($csm_assertion_info$.getGlobalValue(), assertion);
							}
						}
					}
				}
			} finally {
				if (NIL != needs_to_releaseP) {
					ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject csm_clean_up_detected_collaboration_opportunities_cache(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject rw_lock_var = $csm_detected_collaboration_opportunities_lock$.getGlobalValue();
				SubLObject needs_to_releaseP = NIL;
				try {
					needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
					{
						SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($csm_detected_collaboration_opportunities$.getGlobalValue()));
						while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
							thread.resetMultipleValues();
							{
								SubLObject user = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
								SubLObject user_cos = thread.secondMultipleValue();
								thread.resetMultipleValues();
								{
									SubLObject user_cos_alist = dictionary_utilities.dictionary_to_alist(user_cos);
									SubLObject cdolist_list_var = user_cos_alist;
									SubLObject cons = NIL;
									for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
										{
											SubLObject datum = cons;
											SubLObject current = datum;
											SubLObject other_user = NIL;
											SubLObject cos = NIL;
											destructuring_bind_must_consp(current, datum, $list_alt262);
											other_user = current.first();
											current = current.rest();
											cos = current;
											{
												SubLObject new_cos = NIL;
												SubLObject cdolist_list_var_63 = cos;
												SubLObject co = NIL;
												for (co = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest(), co = cdolist_list_var_63.first()) {
													{
														SubLObject datum_64 = co;
														SubLObject current_65 = datum_64;
														SubLObject topic_list = NIL;
														SubLObject co_time = NIL;
														destructuring_bind_must_consp(current_65, datum_64, $list_alt206);
														topic_list = current_65.first();
														current_65 = current_65.rest();
														destructuring_bind_must_consp(current_65, datum_64, $list_alt206);
														co_time = current_65.first();
														current_65 = current_65.rest();
														if (NIL == current_65) {
															if (NIL != temporally_near_datesP(co_time, reference_time)) {
																new_cos = cons(co, new_cos);
															}
														} else {
															cdestructuring_bind_error(datum_64, $list_alt206);
														}
													}
												}
												if (NIL != new_cos) {
													dictionary.dictionary_enter(user_cos, other_user, nreverse(new_cos));
												} else {
													dictionary.dictionary_remove(user_cos, other_user);
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
				} finally {
					if (NIL != needs_to_releaseP) {
						ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject get_potential_collaboration_opportunity_detection_time(SubLObject coll_opp_nart) {
		{
			SubLObject cycl_date = kb_mapping_utilities.fpred_value_in_any_mt(coll_opp_nart, $const81$dateOfPotentialCollaborationOppor, ONE_INTEGER, TWO_INTEGER, $TRUE);
			if (NIL != cycl_date) {
				return date_utilities.cycl_date_to_universal_time(cycl_date);
			}
			return NIL;
		}
	}

	public static final SubLObject get_potential_collaboration_opportunity_detection_users(SubLObject coll_opp_nart) {
		return kb_mapping_utilities.pred_values_in_any_mt(coll_opp_nart, $$potentialCollaboratorConcept, ONE_INTEGER, TWO_INTEGER, $TRUE);
	}

	public static final SubLObject potential_collaboration_opportunity_detection_irrelevant_to_userP(SubLObject coll_opp, SubLObject user) {
		return list_utilities.sublisp_boolean(kb_mapping_utilities.pred_u_v_holds_in_any_mt($const263$irrelevantPotentialCollaborationO, coll_opp, user, ONE_INTEGER, TWO_INTEGER, $TRUE));
	}

	public static final SubLObject csm_mark_irrelevant_detection_of_potential_colloboration_opportunity_narts(SubLObject reference_time) {
		if (reference_time == UNPROVIDED) {
			reference_time = get_universal_time();
		}
		if (NIL != kb_mapping_macros.do_function_extent_index_key_validator($const80$DetectionOfCollaborationOpportuni)) {
			{
				SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec($const80$DetectionOfCollaborationOpportuni);
				SubLObject final_index_iterator = NIL;
				try {
					final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
					{
						SubLObject done_var = NIL;
						SubLObject token_var = NIL;
						while (NIL == done_var) {
							{
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
								SubLObject valid = makeBoolean(token_var != assertion);
								if (NIL != valid) {
									{
										SubLObject coll_opp_nart = cycl_utilities.sentence_arg1(assertion, UNPROVIDED);
										SubLObject time = get_potential_collaboration_opportunity_detection_time(coll_opp_nart);
										if (!((NIL != numeric_date_utilities.universal_time_p(time)) && (NIL != temporally_near_datesP(time, reference_time)))) {
											{
												SubLObject users = get_potential_collaboration_opportunity_detection_users(coll_opp_nart);
												SubLObject cdolist_list_var = users;
												SubLObject user = NIL;
												for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), user = cdolist_list_var.first()) {
													if (NIL == potential_collaboration_opportunity_detection_irrelevant_to_userP(coll_opp_nart, user)) {
														csm_assert(el_utilities.make_el_formula($const263$irrelevantPotentialCollaborationO, list(coll_opp_nart, user), UNPROVIDED), $$AnalystDatabaseMt);
													}
												}
											}
										}
									}
								}
								done_var = makeBoolean(NIL == valid);
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							if (NIL != final_index_iterator) {
								kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
							}
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			}
		}
		return NIL;
	}

	/**
	 * Gathers the AKB assertions from the KB.
	 */
	public static final SubLObject collect_akb_assertions_for_scalability_experiments() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$csm_akb_assertions$.setGlobalValue(set.new_set(symbol_function(EQ), $int$205600));
			{
				SubLObject msg = $$$Collecting_AKB_assertions;
				SubLObject tkb_smes = set_difference(isa.all_fort_instances_in_all_mts($$TKB_SME), list($$ChrisDeaton), UNPROVIDED, UNPROVIDED);
				SubLObject sme_table = set_utilities.construct_set_from_list(tkb_smes, symbol_function(EQ), UNPROVIDED);
				format(T, $str_alt8$___s_SMEs_collected_, length(tkb_smes));
				{
					SubLObject as_count = ZERO_INTEGER;
					SubLObject idx = assertion_handles.do_assertions_table();
					SubLObject total = id_index.id_index_count(idx);
					SubLObject sofar = ZERO_INTEGER;
					SubLSystemTrampolineFile.checkType(msg, STRINGP);
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
							utilities_macros.noting_percent_progress_preamble(msg);
							if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
								{
									SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
									SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
									SubLObject as = NIL;
									while (NIL != id) {
										as = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
										if (NIL != id_index.do_id_index_id_and_object_validP(id, as, $SKIP)) {
											utilities_macros.note_percent_progress(sofar, total);
											sofar = add(sofar, ONE_INTEGER);
											{
												SubLObject cyclist = assertions_high.asserted_by(as);
												if (NIL != set.set_memberP(cyclist, sme_table)) {
													set.set_add(as, $csm_akb_assertions$.getGlobalValue());
													as_count = add(as_count, ONE_INTEGER);
													if (as_count.numE($int$100) || mod(as_count, $int$1000).numE(ZERO_INTEGER)) {
														print(as_count, UNPROVIDED);
													}
												}
											}
										}
										id = id_index.do_id_index_next_id(idx, T, id, state_var);
										state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
									}
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
					$csm_akb_assertion_count$.setGlobalValue(as_count);
				}
			}
			return NIL;
		}
	}

	/**
	 * Constructs a transcript by randomly reasserting N AKB
	 * assertions.
	 */
	public static final SubLObject csm_generate_akb_assertion_transcript(SubLObject n, SubLObject restart_new_tsP) {
		if (restart_new_tsP == UNPROVIDED) {
			restart_new_tsP = T;
		}
		transcript_utilities.new_local_transcript();
		{
			SubLObject ts = transcript_utilities.local_transcript();
			csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $$$Generating_transcript_file, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt268$_, format_nil.format_nil_a_no_copy(ts), format_nil.$format_nil_percent$.getGlobalValue() }));
			{
				SubLObject i = NIL;
				for (i = ZERO_INTEGER; !i.numE(n); i = i) {
					{
						SubLObject assertion = get_random_akb_assertion();
						SubLObject successP = NIL;
						SubLObject error = NIL;
						try {
							{
								SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
								try {
									bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
									try {
										successP = csm_reassert_assertion(assertion);
									} catch (Throwable catch_var) {
										Errors.handleThrowable(catch_var, NIL);
									}
								} finally {
									rebind(Errors.$error_handler$, _prev_bind_0);
								}
							}
						} catch (Throwable ccatch_env_var) {
							error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
						}
						if (!((NIL == successP) || (NIL != error))) {
							i = add(i, ONE_INTEGER);
						}
					}
				}
			}
			csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $$$Done_with_transcript_file, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt268$_, format_nil.format_nil_a_no_copy(ts), format_nil.$format_nil_percent$.getGlobalValue() }));
			if (NIL != restart_new_tsP) {
				transcript_utilities.new_local_transcript();
			}
			return ts;
		}
	}

	public static final SubLObject get_random_akb_assertion() {
		return set.set_random_element($csm_akb_assertions$.getGlobalValue());
	}

	/**
	 * Gathers AKB assertions from the KB (if necessary). Generates N transcripts each containing M assertions.
	 */
	public static final SubLObject csm_generate_akb_assertion_transcripts(SubLObject n, SubLObject m) {
		if (NIL == set.set_p($csm_akb_assertions$.getGlobalValue())) {
			collect_akb_assertions_for_scalability_experiments();
		}
		{
			SubLObject transcripts = NIL;
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
				transcripts = cons(csm_generate_akb_assertion_transcript(m, NIL), transcripts);
			}
			transcript_utilities.new_local_transcript();
			return transcripts;
		}
	}

	/**
	 * two days
	 */
	// defparameter
	private static final SubLSymbol $csm_max_wait_time_for_idle_agenda$ = makeSymbol("*CSM-MAX-WAIT-TIME-FOR-IDLE-AGENDA*");

	public static final SubLObject csm_load_transcript_file_with_timing_data(SubLObject filename, SubLObject queue) {
		if (queue == UNPROVIDED) {
			queue = $AUX;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			wait_for_agenda_idle(queue, $csm_max_wait_time_for_idle_agenda$.getDynamicValue(thread));
			{
				SubLObject start_time = NIL;
				SubLObject end_time = NIL;
				SubLObject delta_time = NIL;
				SubLObject no_of_ops = ZERO_INTEGER;
				csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt272$Machine_name__, format_nil.format_nil_a_no_copy(Environment.get_network_name(Environment.get_machine_name($$$unknown))), format_nil.$format_nil_percent$.getGlobalValue() }));
				csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt274$Transcript_file__, format_nil.format_nil_a_no_copy(filename), format_nil.$format_nil_percent$.getGlobalValue() }));
				no_of_ops = operation_communication.load_transcript_file(filename, NIL, queue, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
				csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt275$Number_of_operations__, format_nil.format_nil_a_no_copy(no_of_ops), format_nil.$format_nil_percent$.getGlobalValue() }));
				csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt276$Number_of_assertions__, format_nil.format_nil_a_no_copy(floor(divide(no_of_ops, THREE_INTEGER), UNPROVIDED)), format_nil.$format_nil_percent$.getGlobalValue() }));
				wait_for_agenda_busy(queue, $csm_max_wait_time_for_idle_agenda$.getDynamicValue(thread));
				start_time = get_universal_time();
				thread.resetMultipleValues();
				{
					SubLObject start_date = numeric_date_utilities.universal_date_and_second_from_time(start_time);
					SubLObject start_second = thread.secondMultipleValue();
					thread.resetMultipleValues();
					csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt277$Start_time__, format_nil.format_nil_a_no_copy(start_date), $str_alt268$_, format_nil.format_nil_a_no_copy(start_second), format_nil.$format_nil_percent$.getGlobalValue() }));
				}
				wait_for_agenda_idle(queue, $csm_max_wait_time_for_idle_agenda$.getDynamicValue(thread));
				end_time = get_universal_time();
				delta_time = subtract(end_time, start_time);
				thread.resetMultipleValues();
				{
					SubLObject end_date = numeric_date_utilities.universal_date_and_second_from_time(end_time);
					SubLObject end_second = thread.secondMultipleValue();
					thread.resetMultipleValues();
					csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt278$End_time__, format_nil.format_nil_a_no_copy(end_date), $str_alt268$_, format_nil.format_nil_a_no_copy(end_second), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt279$Total_time__, format_nil.format_nil_a_no_copy(delta_time), format_nil.$format_nil_percent$.getGlobalValue() }));
				}
				return delta_time;
			}
		}
	}

	public static final SubLObject wait_for_agenda_idle(SubLObject queue, SubLObject wait_time) {
		if (queue == UNPROVIDED) {
			queue = $AUX;
		}
		if (wait_time == UNPROVIDED) {
			wait_time = ONE_INTEGER;
		}
		{
			SubLObject time = numeric_date_utilities.time_from_now(wait_time);
			for (; !(((NIL == agenda.agenda_running()) || ((NIL != agenda.agenda_idleP()) && (NIL != operation_queue_emptyP(queue)))) || (NIL != time_has_arrivedP(time)));) {
				sleep(ONE_INTEGER);
			}
		}
		return agenda.agenda_idleP();
	}

	public static final SubLObject wait_for_agenda_busy(SubLObject queue, SubLObject wait_time) {
		if (queue == UNPROVIDED) {
			queue = $AUX;
		}
		if (wait_time == UNPROVIDED) {
			wait_time = ONE_INTEGER;
		}
		{
			SubLObject time = numeric_date_utilities.time_from_now(wait_time);
			for (; !(((NIL == agenda.agenda_running()) || ((NIL != agenda.agenda_busyP()) && (NIL == operation_queue_emptyP(queue)))) || (NIL != time_has_arrivedP(time)));) {
				sleep(ONE_INTEGER);
			}
		}
		return agenda.agenda_busyP();
	}

	public static final SubLObject operation_queue_emptyP(SubLObject queue) {
		{
			SubLObject pcase_var = queue;
			if (pcase_var.eql($AUX)) {
				return operation_queues.auxiliary_queue_empty();
			} else if (pcase_var.eql($LOCAL)) {
				return operation_queues.local_queue_empty();
			}

		}
		return NIL;
	}

	// deflexical
	private static final SubLSymbol $csm_scalability_experiments_transcripts_directory$ = makeSymbol("*CSM-SCALABILITY-EXPERIMENTS-TRANSCRIPTS-DIRECTORY*");

	// deflexical
	private static final SubLSymbol $csm_scalability_experiments_phase_one_debugging_output_directory$ = makeSymbol("*CSM-SCALABILITY-EXPERIMENTS-PHASE-ONE-DEBUGGING-OUTPUT-DIRECTORY*");

	// deflexical
	private static final SubLSymbol $csm_scalability_experiments_phase_two_debugging_output_directory$ = makeSymbol("*CSM-SCALABILITY-EXPERIMENTS-PHASE-TWO-DEBUGGING-OUTPUT-DIRECTORY*");

	// deflexical
	private static final SubLSymbol $csm_scalability_experiments_machine_ts_associations_directory$ = makeSymbol("*CSM-SCALABILITY-EXPERIMENTS-MACHINE-TS-ASSOCIATIONS-DIRECTORY*");

	public static final SubLObject csm_select_an_akb_transcript_for_loading() {
		return cconcatenate($csm_scalability_experiments_transcripts_directory$.getGlobalValue(), list_utilities.random_element(Filesys.directory($csm_scalability_experiments_transcripts_directory$.getGlobalValue(), UNPROVIDED)));
	}

	public static final SubLObject csm_get_image_debugging_output_file(SubLObject phase) {
		return cconcatenate(phase == ONE_INTEGER ? ((SubLObject) ($csm_scalability_experiments_phase_one_debugging_output_directory$.getGlobalValue())) : $csm_scalability_experiments_phase_two_debugging_output_directory$.getGlobalValue(), new SubLObject[] { control_vars.cyc_image_id(), $str_alt285$_txt });
	}

	public static final SubLObject csm_note_machine_transcript_association(SubLObject ts) {
		{
			SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
			SubLObject filename = cconcatenate($csm_scalability_experiments_machine_ts_associations_directory$.getGlobalValue(), machine_name);
			SubLObject stream_var = NIL;
			try {
				stream_var = StreamsLow.open(filename, new SubLObject[] { $DIRECTION, $OUTPUT, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $CREATE });
				{
					SubLObject out = stream_var;
					format(out, $str_alt286$_A, ts);
				}
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						if (NIL != stream_var) {
							close(stream_var, UNPROVIDED);
						}
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject csm_unnote_machine_transcript_association() {
		{
			SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
			SubLObject outfilename = cconcatenate($csm_scalability_experiments_machine_ts_associations_directory$.getGlobalValue(), machine_name);
			if (NIL != Filesys.probe_file(outfilename)) {
				Filesys.delete_file(outfilename);
			}
			return NIL;
		}
	}

	public static final SubLObject csm_get_machine_transcript_association() {
		{
			SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
			SubLObject filename = cconcatenate($csm_scalability_experiments_machine_ts_associations_directory$.getGlobalValue(), machine_name);
			SubLObject ts = NIL;
			if (NIL != Filesys.probe_file(filename)) {
				{
					SubLObject stream_var = NIL;
					try {
						stream_var = StreamsLow.open(filename, new SubLObject[] { $DIRECTION, $INPUT });
						{
							SubLObject in = stream_var;
							ts = read_line(in, NIL, EOF, UNPROVIDED);
						}
					} finally {
						{
							SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
							try {
								bind($is_thread_performing_cleanupP$, T);
								if (NIL != stream_var) {
									close(stream_var, UNPROVIDED);
								}
							} finally {
								rebind($is_thread_performing_cleanupP$, _prev_bind_0);
							}
						}
					}
				}
			}
			return ts;
		}
	}

	public static final SubLObject csm_run_scalability_experiment_step_one(SubLObject ts) {
		if (ts == UNPROVIDED) {
			ts = NIL;
		}
		{
			SubLObject debugging_file = csm_get_image_debugging_output_file(ONE_INTEGER);
			SubLObject note_tsP = NIL;
			SubLObject unnote_tsP = NIL;
			if (NIL == ts) {
				ts = csm_get_machine_transcript_association();
				if (NIL != ts) {
					unnote_tsP = T;
				}
			}
			if (NIL == ts) {
				ts = csm_select_an_akb_transcript_for_loading();
				note_tsP = T;
			}
			csm_set_debugging_output_destination(debugging_file, UNPROVIDED);
			csm_set_debugging_level(ONE_INTEGER);
			agenda.set_agenda_error_mode($IGNORE);
			csm_load_transcript_file_with_timing_data(ts, UNPROVIDED);
			if (NIL != unnote_tsP) {
				csm_unnote_machine_transcript_association();
			}
			if (NIL != note_tsP) {
				csm_note_machine_transcript_association(ts);
			}
			return ts;
		}
	}

	public static final SubLObject csm_run_scalability_experiment_step_two(SubLObject ts) {
		if (ts == UNPROVIDED) {
			ts = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject debugging_file = csm_get_image_debugging_output_file(TWO_INTEGER);
				SubLObject note_tsP = NIL;
				SubLObject unnote_tsP = NIL;
				SubLObject start_time = NIL;
				SubLObject end_time = NIL;
				if (NIL == ts) {
					ts = csm_get_machine_transcript_association();
					if (NIL != ts) {
						unnote_tsP = T;
					}
				}
				if (NIL == ts) {
					ts = csm_select_an_akb_transcript_for_loading();
					note_tsP = T;
				}
				agenda.set_agenda_error_mode($IGNORE);
				csm_set_debugging_output_destination(debugging_file, UNPROVIDED);
				csm_set_debugging_level(ONE_INTEGER);
				$csm_near_dates_cluster_cutoff$.setDynamicValue(multiply(TWO_INTEGER, $int$14400), thread);
				csm_initialize_collaboration_opportunity_detection();
				start_time = get_universal_time();
				thread.resetMultipleValues();
				{
					SubLObject start_date = numeric_date_utilities.universal_date_and_second_from_time(start_time);
					SubLObject start_second = thread.secondMultipleValue();
					thread.resetMultipleValues();
					csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt288$Experiment_start_time__, format_nil.format_nil_a_no_copy(start_date), $str_alt268$_, format_nil.format_nil_a_no_copy(start_second), format_nil.$format_nil_percent$.getGlobalValue() }));
				}
				{
					SubLObject _prev_bind_0 = $csm_cache_unsuccessful_cn_resultsP$.currentBinding(thread);
					try {
						$csm_cache_unsuccessful_cn_resultsP$.bind(T, thread);
						csm_load_transcript_file_with_timing_data(ts, UNPROVIDED);
						csm_display_cost_effectiveness_data(UNPROVIDED);
						csm_update_and_analyze_user_topics(UNPROVIDED);
					} finally {
						$csm_cache_unsuccessful_cn_resultsP$.rebind(_prev_bind_0, thread);
					}
				}
				end_time = get_universal_time();
				thread.resetMultipleValues();
				{
					SubLObject end_date = numeric_date_utilities.universal_date_and_second_from_time(end_time);
					SubLObject end_second = thread.secondMultipleValue();
					thread.resetMultipleValues();
					csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt289$Experiment_end_time__, format_nil.format_nil_a_no_copy(end_date), $str_alt268$_, format_nil.format_nil_a_no_copy(end_second), format_nil.$format_nil_percent$.getGlobalValue() }));
				}
				csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt290$Experiment_total_time__, format_nil.format_nil_a_no_copy(subtract(end_time, start_time)), $str_alt268$_, format_nil.format_nil_a_no_copy(NIL), format_nil.$format_nil_percent$.getGlobalValue() }));
				csm_display_cost_effectiveness_data(UNPROVIDED);
				if (NIL != unnote_tsP) {
					csm_unnote_machine_transcript_association();
				}
				if (NIL != note_tsP) {
					csm_note_machine_transcript_association(ts);
				}
				return ts;
			}
		}
	}

	public static final SubLObject csm_display_cost_effectiveness_data(SubLObject display_pcosP) {
		if (display_pcosP == UNPROVIDED) {
			display_pcosP = T;
		}
		{
			SubLObject no_of_users = length(csm_current_users());
			SubLObject total_no_of_assertions = csm_get_total_number_of_user_assertions();
			SubLObject total_no_of_topics = csm_get_total_number_of_user_topics();
			SubLObject total_no_of_pcos_from_narts = ZERO_INTEGER;
			csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt291$Total_number_of_users__, format_nil.format_nil_a_no_copy(no_of_users), format_nil.$format_nil_percent$.getGlobalValue() }));
			csm_note(cconcatenate($str_alt292$Total_number_of_user_assertions__, new SubLObject[] { format_nil.format_nil_a_no_copy(total_no_of_assertions), format_nil.$format_nil_percent$.getGlobalValue() }));
			csm_note(cconcatenate($str_alt293$Total_number_of_user_topics__, new SubLObject[] { format_nil.format_nil_a_no_copy(total_no_of_topics), format_nil.$format_nil_percent$.getGlobalValue() }));
			if (!no_of_users.isZero()) {
				csm_note(cconcatenate($str_alt294$Average_number_of_assertions_per_, new SubLObject[] { format_nil.format_nil_a_no_copy(divide(total_no_of_assertions, no_of_users)), format_nil.$format_nil_percent$.getGlobalValue() }));
				csm_note(cconcatenate($str_alt295$Average_number_of_topics_per_user, new SubLObject[] { format_nil.format_nil_a_no_copy(divide(total_no_of_topics, no_of_users)), format_nil.$format_nil_percent$.getGlobalValue() }));
			}
			if (NIL != display_pcosP) {
				csm_note(cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt296$The_following_potential_collabora, format_nil.$format_nil_percent$.getGlobalValue() }));
				if (NIL != kb_mapping_macros.do_function_extent_index_key_validator($const80$DetectionOfCollaborationOpportuni)) {
					{
						SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec($const80$DetectionOfCollaborationOpportuni);
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
							{
								SubLObject done_var = NIL;
								SubLObject token_var = NIL;
								while (NIL == done_var) {
									{
										SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
										SubLObject valid = makeBoolean(token_var != assertion);
										if (NIL != valid) {
											total_no_of_pcos_from_narts = add(total_no_of_pcos_from_narts, ONE_INTEGER);
											csm_note(cconcatenate(format_nil.format_nil_a_no_copy(cycl_utilities.sentence_arg2(assertion, UNPROVIDED)), format_nil.$format_nil_percent$.getGlobalValue()));
										}
										done_var = makeBoolean(NIL == valid);
									}
								}
							}
						} finally {
							{
								SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
								try {
									bind($is_thread_performing_cleanupP$, T);
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
								} finally {
									rebind($is_thread_performing_cleanupP$, _prev_bind_0);
								}
							}
						}
					}
				}
				csm_note(cconcatenate($str_alt297$Total_number_of_detected_potentia, new SubLObject[] { format_nil.format_nil_a_no_copy(total_no_of_pcos_from_narts), format_nil.$format_nil_percent$.getGlobalValue() }));
				if (!no_of_users.isZero()) {
					csm_note(cconcatenate($str_alt298$Average_number_of_detected_potent, new SubLObject[] { format_nil.format_nil_a_no_copy(divide(total_no_of_pcos_from_narts, no_of_users)), format_nil.$format_nil_percent$.getGlobalValue() }));
				}
			}
			return NIL;
		}
	}

	public static final SubLObject csm_create_nart(SubLObject formula) {
		return czer_main.cyc_find_or_create_nart(formula, UNPROVIDED);
	}

	public static final SubLObject csm_assert(SubLObject formula, SubLObject mt) {
		return ke.ke_assert_now(formula, mt, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject csm_reassert_assertion(SubLObject assertion) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
				SubLObject mt = assertions_high.assertion_mt(assertion);
				SubLObject strength = assertions_high.assertion_strength(assertion);
				SubLObject direction = assertions_high.assertion_direction(assertion);
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = system_parameters.$allow_guest_to_editP$.currentBinding(thread);
					try {
						system_parameters.$allow_guest_to_editP$.bind(T, thread);
						{
							SubLObject assertion_var = assertion;
							{
								SubLObject _prev_bind_0_66 = api_control_vars.$the_cyclist$.currentBinding(thread);
								SubLObject _prev_bind_1 = fi.$the_date$.currentBinding(thread);
								SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
								SubLObject _prev_bind_3 = fi.$the_second$.currentBinding(thread);
								SubLObject _prev_bind_4 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
								try {
									api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(assertion_var), thread);
									fi.$the_date$.bind(assertions_high.asserted_when(assertion_var), thread);
									api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(assertion_var), thread);
									fi.$the_second$.bind(assertions_high.asserted_second(assertion_var), thread);
									cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
									ke.ke_unassert_now(sentence, mt);
									result = ke.ke_assert_now(sentence, mt, strength, direction);
								} finally {
									cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_4, thread);
									fi.$the_second$.rebind(_prev_bind_3, thread);
									api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
									fi.$the_date$.rebind(_prev_bind_1, thread);
									api_control_vars.$the_cyclist$.rebind(_prev_bind_0_66, thread);
								}
							}
						}
					} finally {
						system_parameters.$allow_guest_to_editP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject get_image_url_for_user(SubLObject user) {
		{
			SubLObject path = kb_mapping_utilities.fpred_value_in_any_mt(user, $$tinyIconTermImagePathname, ONE_INTEGER, TWO_INTEGER, $TRUE);
			if (!path.isString()) {
				path = kb_mapping_utilities.fpred_value_in_any_mt($$TKB_SME, $const301$defaultTinyIconTermImagePathnameF, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return cconcatenate(proof_view.get_tkb_image_root(), path);
		}
	}

	public static final SubLObject get_detected_potential_collaboration_opportunities_for_user(SubLObject user) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject pred_var = $$potentialCollaboratorConcept;
							if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(user, TWO_INTEGER, pred_var)) {
								{
									SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(user, TWO_INTEGER, pred_var);
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
															SubLObject done_var_67 = NIL;
															SubLObject token_var_68 = NIL;
															while (NIL == done_var_67) {
																{
																	SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_68);
																	SubLObject valid_69 = makeBoolean(token_var_68 != assertion);
																	if (NIL != valid_69) {
																		{
																			SubLObject coll_op = assertions_high.gaf_arg1(assertion);
																			SubLObject user_concept = assertions_high.gaf_arg3(assertion);
																			if (NIL == potential_collaboration_opportunity_detection_irrelevant_to_userP(coll_op, user)) {
																				{
																					SubLObject time = get_potential_collaboration_opportunity_detection_time(coll_op);
																					if (NIL != numeric_date_utilities.universal_time_p(time)) {
																						{
																							SubLObject pred_var_70 = $$potentialCollaboratorConcept;
																							if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(coll_op, ONE_INTEGER, pred_var_70)) {
																								{
																									SubLObject iterator_var_71 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(coll_op, ONE_INTEGER, pred_var_70);
																									SubLObject done_var_72 = NIL;
																									SubLObject token_var_73 = NIL;
																									while (NIL == done_var_72) {
																										{
																											SubLObject final_index_spec_74 = iteration.iteration_next_without_values_macro_helper(iterator_var_71, token_var_73);
																											SubLObject valid_75 = makeBoolean(token_var_73 != final_index_spec_74);
																											if (NIL != valid_75) {
																												{
																													SubLObject final_index_iterator_76 = NIL;
																													try {
																														final_index_iterator_76 = kb_mapping_macros.new_final_index_iterator(final_index_spec_74, $GAF, $TRUE, NIL);
																														{
																															SubLObject done_var_77 = NIL;
																															SubLObject token_var_78 = NIL;
																															while (NIL == done_var_77) {
																																{
																																	SubLObject other_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator_76, token_var_78);
																																	SubLObject valid_79 = makeBoolean(token_var_78 != other_assertion);
																																	if (NIL != valid_79) {
																																		{
																																			SubLObject other_user = assertions_high.gaf_arg2(other_assertion);
																																			SubLObject other_concept = assertions_high.gaf_arg3(other_assertion);
																																			if (user != other_user) {
																																				result = cons(list(coll_op, time, user, user_concept, other_user, other_concept), result);
																																			}
																																		}
																																	}
																																	done_var_77 = makeBoolean(NIL == valid_79);
																																}
																															}
																														}
																													} finally {
																														{
																															SubLObject _prev_bind_0_80 = $is_thread_performing_cleanupP$.currentBinding(thread);
																															try {
																																$is_thread_performing_cleanupP$.bind(T, thread);
																																if (NIL != final_index_iterator_76) {
																																	kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_76);
																																}
																															} finally {
																																$is_thread_performing_cleanupP$.rebind(_prev_bind_0_80, thread);
																															}
																														}
																													}
																												}
																											}
																											done_var_72 = makeBoolean(NIL == valid_75);
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
																	done_var_67 = makeBoolean(NIL == valid_69);
																}
															}
														}
													} finally {
														{
															SubLObject _prev_bind_0_81 = $is_thread_performing_cleanupP$.currentBinding(thread);
															try {
																$is_thread_performing_cleanupP$.bind(T, thread);
																if (NIL != final_index_iterator) {
																	kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
																}
															} finally {
																$is_thread_performing_cleanupP$.rebind(_prev_bind_0_81, thread);
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
				result = Sort.stable_sort(result, symbol_function($sym121$_), symbol_function(SECOND));
				return result;
			}
		}
	}

	public static final SubLObject all_genls_memoized_internal(SubLObject col, SubLObject mt, SubLObject tv) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (tv == UNPROVIDED) {
			tv = NIL;
		}
		return genls.all_genls(col, mt, tv);
	}

	public static final SubLObject all_genls_memoized(SubLObject col, SubLObject mt, SubLObject tv) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (tv == UNPROVIDED) {
			tv = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return all_genls_memoized_internal(col, mt, tv);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_GENLS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_GENLS_MEMOIZED, THREE_INTEGER, $int$200, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, ALL_GENLS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(col, mt, tv);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (col == cached_args.first()) {
										cached_args = cached_args.rest();
										if (mt == cached_args.first()) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && (tv == cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(all_genls_memoized_internal(col, mt, tv)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt, tv));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject all_genl_predicates_memoized_internal(SubLObject pred, SubLObject mt, SubLObject tv) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (tv == UNPROVIDED) {
			tv = NIL;
		}
		return genl_predicates.all_genl_predicates(pred, mt, tv);
	}

	public static final SubLObject all_genl_predicates_memoized(SubLObject pred, SubLObject mt, SubLObject tv) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (tv == UNPROVIDED) {
			tv = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return all_genl_predicates_memoized_internal(pred, mt, tv);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_GENL_PREDICATES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_GENL_PREDICATES_MEMOIZED, THREE_INTEGER, $int$200, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, ALL_GENL_PREDICATES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, tv);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (pred == cached_args.first()) {
										cached_args = cached_args.rest();
										if (mt == cached_args.first()) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && (tv == cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(all_genl_predicates_memoized_internal(pred, mt, tv)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, mt, tv));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject isa_in_any_mt_memoizedP_internal(SubLObject v_term, SubLObject collection) {
		return isa.isa_in_any_mtP(v_term, collection);
	}

	public static final SubLObject isa_in_any_mt_memoizedP(SubLObject v_term, SubLObject collection) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return isa_in_any_mt_memoizedP_internal(v_term, collection);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym123$ISA_IN_ANY_MT_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym123$ISA_IN_ANY_MT_MEMOIZED_, TWO_INTEGER, $int$500, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym123$ISA_IN_ANY_MT_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, collection);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw90$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term == cached_args.first()) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && (collection == cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(isa_in_any_mt_memoizedP_internal(v_term, collection)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, collection));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject clear_all_csm_caches() {
		return NIL;
	}

	public static final SubLObject gather_csm_relevant_assertions_for_term(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						result = kb_mapping.gather_term_assertions(v_term, UNPROVIDED);
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject display_cosine_info_for_term_assertions(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject state = memoization_state.possibly_new_memoization_state();
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject _prev_bind_0_82 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
									SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
									try {
										mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
										mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
										{
											SubLObject cdolist_list_var = kb_mapping.gather_term_assertions(v_term, UNPROVIDED);
											SubLObject assertion = NIL;
											for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
												{
													SubLObject formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
													if (NIL == internal_cyc_termP(cycl_utilities.formula_operator(formula))) {
														format(T, $str_alt306$_a__, assertion);
														{
															SubLObject cdolist_list_var_83 = cycl_utilities.expression_forts(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
															SubLObject fort = NIL;
															for (fort = cdolist_list_var_83.first(); NIL != cdolist_list_var_83; cdolist_list_var_83 = cdolist_list_var_83.rest(), fort = cdolist_list_var_83.first()) {
																if (!((fort == v_term) || (NIL != csm_irrelevant_termP(fort)))) {
																	format(T, $str_alt307$_a__a____cosine___a__, new SubLObject[] { v_term, fort, compute_cosine_between_term_vectors(v_term, fort) });
																}
															}
														}
													}
												}
												format(T, $str_alt308$__);
											}
										}
									} finally {
										mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
										mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_82, thread);
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_84 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_84, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject internal_cyc_termP(SubLObject v_term) {
		return kb_mapping_utilities.some_pred_value_in_any_mt(v_term, $$keIrrelevantTerm_InternalCycTerm, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject blast_assertions_by_cyclist(SubLObject cyclist) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = system_parameters.$allow_guest_to_editP$.currentBinding(thread);
				try {
					system_parameters.$allow_guest_to_editP$.bind(T, thread);
					{
						SubLObject msg = cconcatenate($str_alt310$Blasting_KB_assertions_by_, format_nil.format_nil_a_no_copy(cyclist));
						SubLObject idx = assertion_handles.do_assertions_table();
						SubLObject total = id_index.id_index_count(idx);
						SubLObject sofar = ZERO_INTEGER;
						SubLSystemTrampolineFile.checkType(msg, STRINGP);
						{
							SubLObject _prev_bind_0_85 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
							SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
							SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
							SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
							try {
								utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
								utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
								utilities_macros.$within_noting_percent_progress$.bind(T, thread);
								utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
								utilities_macros.noting_percent_progress_preamble(msg);
								if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
									{
										SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
										SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
										SubLObject as = NIL;
										while (NIL != id) {
											as = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
											if (NIL != id_index.do_id_index_id_and_object_validP(id, as, $SKIP)) {
												utilities_macros.note_percent_progress(sofar, total);
												sofar = add(sofar, ONE_INTEGER);
												{
													SubLObject owner = assertions_high.asserted_by(as);
													if (cyclist == owner) {
														ke.ke_blast_assertion(as);
													}
												}
											}
											id = id_index.do_id_index_next_id(idx, T, id, state_var);
											state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
										}
									}
								}
								utilities_macros.noting_percent_progress_postamble();
							} finally {
								utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
								utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
								utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
								utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_85, thread);
							}
						}
					}
				} finally {
					system_parameters.$allow_guest_to_editP$.rebind(_prev_bind_0, thread);
				}
			}
			return NIL;
		}
	}

	public static final SubLObject clean_up_detection_of_potential_colloboration_opportunity_narts_for_cyclist(SubLObject cyclist) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = system_parameters.$allow_guest_to_editP$.currentBinding(thread);
				try {
					system_parameters.$allow_guest_to_editP$.bind(T, thread);
					{
						SubLObject cyclist_coll_opps = kb_mapping_utilities.pred_values_in_any_mt(cyclist, $$potentialCollaboratorConcept, TWO_INTEGER, ONE_INTEGER, $TRUE);
						SubLObject cdolist_list_var = cyclist_coll_opps;
						SubLObject col_op = NIL;
						for (col_op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), col_op = cdolist_list_var.first()) {
							ke.ke_kill(col_op);
						}
					}
				} finally {
					system_parameters.$allow_guest_to_editP$.rebind(_prev_bind_0, thread);
				}
			}
			return NIL;
		}
	}

	public static final SubLObject declare_collaborative_sense_making_utilities_file() {
		declareFunction("collect_akb_assertions", "COLLECT-AKB-ASSERTIONS", 0, 0, false);
		declareFunction("get_date_string_for_run", "GET-DATE-STRING-FOR-RUN", 0, 0, false);
		declareFunction("get_directory_name_for_run", "GET-DIRECTORY-NAME-FOR-RUN", 0, 0, false);
		declareFunction("write_akb_assertions", "WRITE-AKB-ASSERTIONS", 0, 0, false);
		declareFunction("save_akb_assertions_to_files", "SAVE-AKB-ASSERTIONS-TO-FILES", 0, 0, false);
		declareFunction("analyze_akb_assertions", "ANALYZE-AKB-ASSERTIONS", 1, 1, false);
		declareFunction("analyze_sme_assertions", "ANALYZE-SME-ASSERTIONS", 3, 2, false);
		declareFunction("get_bag_of_terms_from_file", "GET-BAG-OF-TERMS-FROM-FILE", 1, 3, false);
		declareFunction("get_term_from_token", "GET-TERM-FROM-TOKEN", 1, 0, false);
		declareFunction("get_assertion_date_term_list_from_file", "GET-ASSERTION-DATE-TERM-LIST-FROM-FILE", 1, 1, false);
		declareFunction("conceptually_near_bags_of_terms", "CONCEPTUALLY-NEAR-BAGS-OF-TERMS", 4, 0, false);
		declareFunction("conceptually_near_term_lists", "CONCEPTUALLY-NEAR-TERM-LISTS", 2, 0, false);
		declareFunction("get_conceptually_near_term_pairs", "GET-CONCEPTUALLY-NEAR-TERM-PAIRS", 2, 0, false);
		declareMacro("with_csm_debugging_level", "WITH-CSM-DEBUGGING-LEVEL");
		declareMacro("with_csm_debugging_output_destination", "WITH-CSM-DEBUGGING-OUTPUT-DESTINATION");
		declareFunction("csm_set_debugging_level", "CSM-SET-DEBUGGING-LEVEL", 1, 0, false);
		declareFunction("csm_set_debugging_output_destination", "CSM-SET-DEBUGGING-OUTPUT-DESTINATION", 1, 1, false);
		declareFunction("csm_note", "CSM-NOTE", 1, 0, false);
		declareFunction("csm_note_error", "CSM-NOTE-ERROR", 2, 0, false);
		declareMacro("with_csm_catch_error_message", "WITH-CSM-CATCH-ERROR-MESSAGE");
		declareFunction("alert_users_about_collaboration_opportunities", "ALERT-USERS-ABOUT-COLLABORATION-OPPORTUNITIES", 1, 1, false);
		declareFunction("csm_note_potential_collaboration_opportunities", "CSM-NOTE-POTENTIAL-COLLABORATION-OPPORTUNITIES", 2, 0, false);
		declareFunction("reify_potential_collaboration_opportunities", "REIFY-POTENTIAL-COLLABORATION-OPPORTUNITIES", 2, 0, false);
		declareFunction("reify_potential_collaboration_opportunities_for_users", "REIFY-POTENTIAL-COLLABORATION-OPPORTUNITIES-FOR-USERS", 4, 0, false);
		declareFunction("reify_potential_collaboration_opportunity", "REIFY-POTENTIAL-COLLABORATION-OPPORTUNITY", 4, 0, false);
		declareFunction("csm_initialize_irrelevant_term_table", "CSM-INITIALIZE-IRRELEVANT-TERM-TABLE", 0, 0, false);
		declareFunction("term_too_general_for_conceptual_relatednessP_internal", "TERM-TOO-GENERAL-FOR-CONCEPTUAL-RELATEDNESS?-INTERNAL", 1, 0, false);
		declareFunction("term_too_general_for_conceptual_relatednessP", "TERM-TOO-GENERAL-FOR-CONCEPTUAL-RELATEDNESS?", 1, 0, false);
		declareFunction("term_name_starts_with_an_irrelevant_prefixP", "TERM-NAME-STARTS-WITH-AN-IRRELEVANT-PREFIX?", 1, 0, false);
		declareFunction("csm_irrelevant_natP", "CSM-IRRELEVANT-NAT?", 1, 0, false);
		declareFunction("csm_irrelevant_termP", "CSM-IRRELEVANT-TERM?", 1, 0, false);
		declareFunction("remove_csm_irrelevant_terms", "REMOVE-CSM-IRRELEVANT-TERMS", 1, 0, false);
		declareFunction("csm_relevant_termP", "CSM-RELEVANT-TERM?", 1, 0, false);
		declareFunction("determine_topics_for_bag_of_terms", "DETERMINE-TOPICS-FOR-BAG-OF-TERMS", 1, 0, false);
		declareFunction("csm_maybe_cache_unsuccessful_cn_results", "CSM-MAYBE-CACHE-UNSUCCESSFUL-CN-RESULTS", 2, 0, false);
		declareFunction("conceptually_near_termsP", "CONCEPTUALLY-NEAR-TERMS?", 2, 1, false);
		declareFunction("compute_cosine_between_term_vectors", "COMPUTE-COSINE-BETWEEN-TERM-VECTORS", 2, 0, false);
		declareFunction("get_co_occurrence_vector_for_term", "GET-CO-OCCURRENCE-VECTOR-FOR-TERM", 1, 1, false);
		declareFunction("get_simple_co_occurrence_vector_for_term_internal", "GET-SIMPLE-CO-OCCURRENCE-VECTOR-FOR-TERM-INTERNAL", 1, 0, false);
		declareFunction("get_simple_co_occurrence_vector_for_term", "GET-SIMPLE-CO-OCCURRENCE-VECTOR-FOR-TERM", 1, 0, false);
		declareFunction("get_weighted_co_occurrence_vector_for_term_internal", "GET-WEIGHTED-CO-OCCURRENCE-VECTOR-FOR-TERM-INTERNAL", 1, 1, false);
		declareFunction("get_weighted_co_occurrence_vector_for_term", "GET-WEIGHTED-CO-OCCURRENCE-VECTOR-FOR-TERM", 1, 1, false);
		declareFunction("linked_term_frequencies_for_term_internal", "LINKED-TERM-FREQUENCIES-FOR-TERM-INTERNAL", 1, 0, false);
		declareFunction("linked_term_frequencies_for_term", "LINKED-TERM-FREQUENCIES-FOR-TERM", 1, 0, false);
		declareFunction("term_cooccurrences", "TERM-COOCCURRENCES", 1, 0, false);
		declareFunction("count_spec_predicates_internal", "COUNT-SPEC-PREDICATES-INTERNAL", 1, 0, false);
		declareFunction("count_spec_predicates", "COUNT-SPEC-PREDICATES", 1, 0, false);
		declareFunction("term_frequency", "TERM-FREQUENCY", 1, 1, false);
		declareFunction("inverse_term_frequency", "INVERSE-TERM-FREQUENCY", 1, 0, false);
		declareFunction("term_frequency_for_term_pair", "TERM-FREQUENCY-FOR-TERM-PAIR", 2, 0, false);
		declareFunction("tf_idf_weight_for_term_pair", "TF-IDF-WEIGHT-FOR-TERM-PAIR", 2, 0, false);
		declareFunction("compute_weight_for_term_pair", "COMPUTE-WEIGHT-FOR-TERM-PAIR", 2, 1, false);
		declareFunction("store_inverse_term_frequencies", "STORE-INVERSE-TERM-FREQUENCIES", 0, 0, false);
		declareFunction("get_inverse_term_frequency_for_term", "GET-INVERSE-TERM-FREQUENCY-FOR-TERM", 1, 2, false);
		declareFunction("justify_conceptual_nearness_of_terms_internal", "JUSTIFY-CONCEPTUAL-NEARNESS-OF-TERMS-INTERNAL", 2, 1, false);
		declareFunction("justify_conceptual_nearness_of_terms", "JUSTIFY-CONCEPTUAL-NEARNESS-OF-TERMS", 2, 1, false);
		declareFunction("justify_conceptual_nearness_of_terms_int", "JUSTIFY-CONCEPTUAL-NEARNESS-OF-TERMS-INT", 3, 0, false);
		declareFunction("extract_assertions_from_kb_path", "EXTRACT-ASSERTIONS-FROM-KB-PATH", 2, 0, false);
		declareFunction("justify_conceptual_nearness_of_terms_int2", "JUSTIFY-CONCEPTUAL-NEARNESS-OF-TERMS-INT2", 3, 0, false);
		declareFunction("relevant_conceptual_nearness_path_nodeP", "RELEVANT-CONCEPTUAL-NEARNESS-PATH-NODE?", 1, 0, false);
		declareFunction("relevant_conceptual_nearness_path_node_intP", "RELEVANT-CONCEPTUAL-NEARNESS-PATH-NODE-INT?", 1, 0, false);
		declareFunction("temporally_near_datesP", "TEMPORALLY-NEAR-DATES?", 2, 0, false);
		declareFunction("temporally_near_date_clustersP", "TEMPORALLY-NEAR-DATE-CLUSTERS?", 4, 0, false);
		declareFunction("date_within_date_clusterP", "DATE-WITHIN-DATE-CLUSTER?", 2, 0, false);
		declareFunction("csm_special_topic_predicateP", "CSM-SPECIAL-TOPIC-PREDICATE?", 1, 0, false);
		declareFunction("csm_special_topic_sentenceP", "CSM-SPECIAL-TOPIC-SENTENCE?", 1, 1, false);
		declareFunction("get_topics_from_sentence_mt", "GET-TOPICS-FROM-SENTENCE-MT", 1, 3, false);
		declareFunction("gather_task_ui_topics_from_sentence_mt", "GATHER-TASK-UI-TOPICS-FROM-SENTENCE-MT", 2, 0, false);
		declareFunction("guess_user_from_sentence_mt", "GUESS-USER-FROM-SENTENCE-MT", 2, 0, false);
		declareFunction("guess_user_from_mt", "GUESS-USER-FROM-MT", 1, 0, false);
		declareFunction("csm_collaboration_opportunity_detection_onP", "CSM-COLLABORATION-OPPORTUNITY-DETECTION-ON?", 0, 0, false);
		declareFunction("csm_turn_on_collaboration_opportunity_detection", "CSM-TURN-ON-COLLABORATION-OPPORTUNITY-DETECTION", 0, 0, false);
		declareFunction("csm_turn_off_collaboration_opportunity_detection", "CSM-TURN-OFF-COLLABORATION-OPPORTUNITY-DETECTION", 0, 0, false);
		declareFunction("csm_initialize_collaboration_opportunity_detection", "CSM-INITIALIZE-COLLABORATION-OPPORTUNITY-DETECTION", 0, 0, false);
		declareFunction("csm_initialize_data_structures", "CSM-INITIALIZE-DATA-STRUCTURES", 0, 0, false);
		declareFunction("csm_uninitialize_collaboration_opportunity_detection", "CSM-UNINITIALIZE-COLLABORATION-OPPORTUNITY-DETECTION", 0, 0, false);
		declareFunction("csm_assertion_info_entry_print_function_trampoline", "CSM-ASSERTION-INFO-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("csm_assertion_info_entry_p", "CSM-ASSERTION-INFO-ENTRY-P", 1, 0, false);
		new collaborative_sense_making_utilities.$csm_assertion_info_entry_p$UnaryFunction();
		declareFunction("csm_assertion_owner", "CSM-ASSERTION-OWNER", 1, 0, false);
		declareFunction("csm_assertion_date", "CSM-ASSERTION-DATE", 1, 0, false);
		declareFunction("csm_assertion_time", "CSM-ASSERTION-TIME", 1, 0, false);
		declareFunction("csm_assertion_universal_time", "CSM-ASSERTION-UNIVERSAL-TIME", 1, 0, false);
		declareFunction("csm_assertion_sentence", "CSM-ASSERTION-SENTENCE", 1, 0, false);
		declareFunction("csm_assertion_mt", "CSM-ASSERTION-MT", 1, 0, false);
		declareFunction("csm_assertion_forts", "CSM-ASSERTION-FORTS", 1, 0, false);
		declareFunction("_csetf_csm_assertion_owner", "_CSETF-CSM-ASSERTION-OWNER", 2, 0, false);
		declareFunction("_csetf_csm_assertion_date", "_CSETF-CSM-ASSERTION-DATE", 2, 0, false);
		declareFunction("_csetf_csm_assertion_time", "_CSETF-CSM-ASSERTION-TIME", 2, 0, false);
		declareFunction("_csetf_csm_assertion_universal_time", "_CSETF-CSM-ASSERTION-UNIVERSAL-TIME", 2, 0, false);
		declareFunction("_csetf_csm_assertion_sentence", "_CSETF-CSM-ASSERTION-SENTENCE", 2, 0, false);
		declareFunction("_csetf_csm_assertion_mt", "_CSETF-CSM-ASSERTION-MT", 2, 0, false);
		declareFunction("_csetf_csm_assertion_forts", "_CSETF-CSM-ASSERTION-FORTS", 2, 0, false);
		declareFunction("make_csm_assertion_info_entry", "MAKE-CSM-ASSERTION-INFO-ENTRY", 0, 1, false);
		declareFunction("new_csm_assertion_info_entry", "NEW-CSM-ASSERTION-INFO-ENTRY", 2, 0, false);
		declareFunction("csm_assertion_info_entry_owner", "CSM-ASSERTION-INFO-ENTRY-OWNER", 1, 0, false);
		declareFunction("csm_assertion_info_entry_date", "CSM-ASSERTION-INFO-ENTRY-DATE", 1, 0, false);
		declareFunction("csm_assertion_info_entry_time", "CSM-ASSERTION-INFO-ENTRY-TIME", 1, 0, false);
		declareFunction("csm_assertion_info_entry_universal_time", "CSM-ASSERTION-INFO-ENTRY-UNIVERSAL-TIME", 1, 0, false);
		declareFunction("csm_assertion_info_entry_sentence", "CSM-ASSERTION-INFO-ENTRY-SENTENCE", 1, 0, false);
		declareFunction("csm_assertion_info_entry_mt", "CSM-ASSERTION-INFO-ENTRY-MT", 1, 0, false);
		declareFunction("csm_assertion_info_entry_forts", "CSM-ASSERTION-INFO-ENTRY-FORTS", 1, 0, false);
		declareFunction("csm_set_assertion_info_entry_owner", "CSM-SET-ASSERTION-INFO-ENTRY-OWNER", 2, 0, false);
		declareFunction("csm_set_assertion_info_entry_date", "CSM-SET-ASSERTION-INFO-ENTRY-DATE", 2, 0, false);
		declareFunction("csm_set_assertion_info_entry_time", "CSM-SET-ASSERTION-INFO-ENTRY-TIME", 2, 0, false);
		declareFunction("csm_set_assertion_info_entry_universal_time", "CSM-SET-ASSERTION-INFO-ENTRY-UNIVERSAL-TIME", 2, 0, false);
		declareFunction("print_csm_assertion_info_entry", "PRINT-CSM-ASSERTION-INFO-ENTRY", 3, 0, false);
		declareFunction("csm_topic_justification_print_function_trampoline", "CSM-TOPIC-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("csm_topic_justification_p", "CSM-TOPIC-JUSTIFICATION-P", 1, 0, false);
		new collaborative_sense_making_utilities.$csm_topic_justification_p$UnaryFunction();
		declareFunction("csm_topic_just_sentence", "CSM-TOPIC-JUST-SENTENCE", 1, 0, false);
		declareFunction("csm_topic_just_mt", "CSM-TOPIC-JUST-MT", 1, 0, false);
		declareFunction("csm_topic_just_universal_time", "CSM-TOPIC-JUST-UNIVERSAL-TIME", 1, 0, false);
		declareFunction("_csetf_csm_topic_just_sentence", "_CSETF-CSM-TOPIC-JUST-SENTENCE", 2, 0, false);
		declareFunction("_csetf_csm_topic_just_mt", "_CSETF-CSM-TOPIC-JUST-MT", 2, 0, false);
		declareFunction("_csetf_csm_topic_just_universal_time", "_CSETF-CSM-TOPIC-JUST-UNIVERSAL-TIME", 2, 0, false);
		declareFunction("make_csm_topic_justification", "MAKE-CSM-TOPIC-JUSTIFICATION", 0, 1, false);
		declareFunction("new_csm_topic_justification", "NEW-CSM-TOPIC-JUSTIFICATION", 3, 0, false);
		declareFunction("csm_topic_justification_sentence", "CSM-TOPIC-JUSTIFICATION-SENTENCE", 1, 0, false);
		declareFunction("csm_topic_justification_mt", "CSM-TOPIC-JUSTIFICATION-MT", 1, 0, false);
		declareFunction("csm_topic_justification_universal_time", "CSM-TOPIC-JUSTIFICATION-UNIVERSAL-TIME", 1, 0, false);
		declareFunction("print_csm_topic_justification", "PRINT-CSM-TOPIC-JUSTIFICATION", 3, 0, false);
		declareMacro("with_csm_user_assertions_writer_lock", "WITH-CSM-USER-ASSERTIONS-WRITER-LOCK");
		declareMacro("with_csm_user_assertions_reader_lock", "WITH-CSM-USER-ASSERTIONS-READER-LOCK");
		declareMacro("csm_do_user_assertions", "CSM-DO-USER-ASSERTIONS");
		declareFunction("csm_user_assertions", "CSM-USER-ASSERTIONS", 1, 0, false);
		declareFunction("csm_update_user_assertions_cache", "CSM-UPDATE-USER-ASSERTIONS-CACHE", 2, 0, false);
		declareFunction("csm_get_average_number_of_assertions_per_user", "CSM-GET-AVERAGE-NUMBER-OF-ASSERTIONS-PER-USER", 0, 0, false);
		declareFunction("csm_get_total_number_of_user_assertions", "CSM-GET-TOTAL-NUMBER-OF-USER-ASSERTIONS", 0, 0, false);
		declareMacro("with_csm_user_topics_writer_lock", "WITH-CSM-USER-TOPICS-WRITER-LOCK");
		declareMacro("with_csm_user_topics_reader_lock", "WITH-CSM-USER-TOPICS-READER-LOCK");
		declareFunction("csm_get_user_topics", "CSM-GET-USER-TOPICS", 1, 0, false);
		declareMacro("csm_do_topics", "CSM-DO-TOPICS");
		declareFunction("csm_get_average_number_of_topics_per_user", "CSM-GET-AVERAGE-NUMBER-OF-TOPICS-PER-USER", 0, 0, false);
		declareFunction("csm_get_total_number_of_user_topics", "CSM-GET-TOTAL-NUMBER-OF-USER-TOPICS", 0, 0, false);
		declareMacro("with_csm_assertion_info_writer_lock", "WITH-CSM-ASSERTION-INFO-WRITER-LOCK");
		declareMacro("with_csm_assertion_info_reader_lock", "WITH-CSM-ASSERTION-INFO-READER-LOCK");
		declareFunction("csm_get_assertion_sentence", "CSM-GET-ASSERTION-SENTENCE", 1, 0, false);
		declareFunction("csm_get_assertion_mt", "CSM-GET-ASSERTION-MT", 1, 0, false);
		declareFunction("csm_get_assertion_universal_time", "CSM-GET-ASSERTION-UNIVERSAL-TIME", 1, 0, false);
		declareFunction("csm_get_assertion_forts", "CSM-GET-ASSERTION-FORTS", 1, 0, false);
		declareFunction("csm_mark_recent_user_assertion", "CSM-MARK-RECENT-USER-ASSERTION", 1, 0, false);
		declareFunction("csm_unmark_recent_user_assertion", "CSM-UNMARK-RECENT-USER-ASSERTION", 1, 0, false);
		declareFunction("csm_user_has_recent_assertionP", "CSM-USER-HAS-RECENT-ASSERTION?", 1, 0, false);
		declareMacro("with_csm_detected_collaboration_opportunities_writer_lock", "WITH-CSM-DETECTED-COLLABORATION-OPPORTUNITIES-WRITER-LOCK");
		declareMacro("with_csm_detected_collaboration_opportunities_reader_lock", "WITH-CSM-DETECTED-COLLABORATION-OPPORTUNITIES-READER-LOCK");
		declareFunction("csm_already_detected_collaboration_opportunityP", "CSM-ALREADY-DETECTED-COLLABORATION-OPPORTUNITY?", 5, 0, false);
		declareFunction("csm_already_detected_collaboration_opportunity_intP", "CSM-ALREADY-DETECTED-COLLABORATION-OPPORTUNITY-INT?", 5, 0, false);
		declareFunction("csm_note_detected_collaboration_opportunity", "CSM-NOTE-DETECTED-COLLABORATION-OPPORTUNITY", 5, 2, false);
		declareFunction("csm_note_detected_collaboration_opportunity_int", "CSM-NOTE-DETECTED-COLLABORATION-OPPORTUNITY-INT", 7, 0, false);
		declareFunction("csm_unnote_detected_collaboration_opportunity", "CSM-UNNOTE-DETECTED-COLLABORATION-OPPORTUNITY", 7, 0, false);
		declareFunction("csm_unnote_detected_collaboration_opportunity_int", "CSM-UNNOTE-DETECTED-COLLABORATION-OPPORTUNITY-INT", 7, 0, false);
		declareFunction("csm_get_total_number_of_detected_collaboration_opportunities", "CSM-GET-TOTAL-NUMBER-OF-DETECTED-COLLABORATION-OPPORTUNITIES", 0, 0, false);
		declareFunction("csm_initialize_detected_collaboration_opportunities_cache", "CSM-INITIALIZE-DETECTED-COLLABORATION-OPPORTUNITIES-CACHE", 0, 1, false);
		declareMacro("with_csm_unsuccessful_cn_results_writer_lock", "WITH-CSM-UNSUCCESSFUL-CN-RESULTS-WRITER-LOCK");
		declareMacro("with_csm_unsuccessful_cn_results_reader_lock", "WITH-CSM-UNSUCCESSFUL-CN-RESULTS-READER-LOCK");
		declareFunction("csm_cache_unsuccessful_cn_results", "CSM-CACHE-UNSUCCESSFUL-CN-RESULTS", 2, 0, false);
		declareFunction("csm_cache_unsuccessful_cn_results_int", "CSM-CACHE-UNSUCCESSFUL-CN-RESULTS-INT", 2, 0, false);
		declareFunction("csm_terms_known_not_to_be_conceptually_nearP", "CSM-TERMS-KNOWN-NOT-TO-BE-CONCEPTUALLY-NEAR?", 2, 0, false);
		declareFunction("csm_terms_known_not_to_be_conceptually_near_intP", "CSM-TERMS-KNOWN-NOT-TO-BE-CONCEPTUALLY-NEAR-INT?", 2, 0, false);
		declareFunction("csm_current_users", "CSM-CURRENT-USERS", 0, 0, false);
		declareFunction("csm_print_user_caches", "CSM-PRINT-USER-CACHES", 0, 1, false);
		declareFunction("csm_clear_user_caches", "CSM-CLEAR-USER-CACHES", 0, 1, false);
		declareFunction("recent_topic_for_userP", "RECENT-TOPIC-FOR-USER?", 2, 1, false);
		declareFunction("csm_update_user_topics_cache", "CSM-UPDATE-USER-TOPICS-CACHE", 3, 2, false);
		declareFunction("guess_user_from_assertion", "GUESS-USER-FROM-ASSERTION", 1, 0, false);
		declareFunction("csm_update_user_assertions_cache_with_assertion", "CSM-UPDATE-USER-ASSERTIONS-CACHE-WITH-ASSERTION", 2, 0, false);
		declareFunction("csm_update_user_topics_cache_with_assertion", "CSM-UPDATE-USER-TOPICS-CACHE-WITH-ASSERTION", 3, 0, false);
		declareFunction("csm_update_user_topics_cache_with_sentence_mt", "CSM-UPDATE-USER-TOPICS-CACHE-WITH-SENTENCE-MT", 3, 0, false);
		declareFunction("csm_update_assertion_info_cache", "CSM-UPDATE-ASSERTION-INFO-CACHE", 3, 0, false);
		declareFunction("csm_update_caches_with_removed_sentence_mt", "CSM-UPDATE-CACHES-WITH-REMOVED-SENTENCE-MT", 2, 0, false);
		declareFunction("csm_kb_modify_create_assertion_action", "CSM-KB-MODIFY-CREATE-ASSERTION-ACTION", 1, 1, false);
		declareFunction("csm_kb_modify_remove_assertion_action", "CSM-KB-MODIFY-REMOVE-ASSERTION-ACTION", 1, 1, false);
		declareFunction("csm_kb_modify_set_assertion_asserted_by_action", "CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-BY-ACTION", 1, 1, false);
		declareFunction("csm_kb_modify_set_assertion_asserted_when_action", "CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-ACTION", 1, 1, false);
		declareFunction("csm_kb_modify_set_assertion_asserted_second_action", "CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-ACTION", 1, 1, false);
		declareFunction("csm_initialize_event_listeners", "CSM-INITIALIZE-EVENT-LISTENERS", 0, 0, false);
		declareFunction("csm_deregister_event_listeners", "CSM-DEREGISTER-EVENT-LISTENERS", 0, 0, false);
		declareFunction("csm_relevant_assertionP", "CSM-RELEVANT-ASSERTION?", 1, 0, false);
		declareFunction("csm_relevant_sentenceP", "CSM-RELEVANT-SENTENCE?", 2, 0, false);
		declareFunction("csm_create_assertion_topic_relevant_sentenceP", "CSM-CREATE-ASSERTION-TOPIC-RELEVANT-SENTENCE?", 2, 0, false);
		declareFunction("clear_csm_irrelevant_userP", "CLEAR-CSM-IRRELEVANT-USER?", 0, 0, false);
		declareFunction("remove_csm_irrelevant_userP", "REMOVE-CSM-IRRELEVANT-USER?", 1, 0, false);
		declareFunction("csm_irrelevant_userP_internal", "CSM-IRRELEVANT-USER?-INTERNAL", 1, 0, false);
		declareFunction("csm_irrelevant_userP", "CSM-IRRELEVANT-USER?", 1, 0, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_between_users", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-BETWEEN-USERS", 2, 1, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_between_users_int", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-BETWEEN-USERS-INT", 5, 0, false);
		declareFunction("identify_temporally_near_collaboration_opportunities", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES", 0, 1, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_for_user", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER", 1, 1, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_for_user_topic", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPIC", 2, 1, false);
		declareFunction("temporally_near_topicP", "TEMPORALLY-NEAR-TOPIC?", 2, 0, false);
		declareFunction("temporally_near_topic_justificationP", "TEMPORALLY-NEAR-TOPIC-JUSTIFICATION?", 2, 0, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_for_user_topics", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS", 3, 1, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_for_user_topics_int1", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT1", 2, 0, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_for_user_topics_int1_int", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT1-INT", 2, 0, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_for_user_topics_int2", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT2", 4, 0, false);
		declareFunction("identify_temporally_near_collaboration_opportunities_for_user_topics_int2_int", "IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT2-INT", 5, 0, false);
		declareFunction("csm_identify_new_topics_for_user", "CSM-IDENTIFY-NEW-TOPICS-FOR-USER", 1, 1, false);
		declareFunction("csm_update_topics_for_user", "CSM-UPDATE-TOPICS-FOR-USER", 1, 1, false);
		declareFunction("csm_update_user_topics", "CSM-UPDATE-USER-TOPICS", 0, 1, false);
		declareFunction("csm_update_and_analyze_user_topics", "CSM-UPDATE-AND-ANALYZE-USER-TOPICS", 0, 1, false);
		declareFunction("csm_clean_up_user_caches", "CSM-CLEAN-UP-USER-CACHES", 0, 1, false);
		declareFunction("csm_clean_up_user_topics_cache", "CSM-CLEAN-UP-USER-TOPICS-CACHE", 0, 1, false);
		declareFunction("csm_clean_up_user_assertions_cache", "CSM-CLEAN-UP-USER-ASSERTIONS-CACHE", 0, 1, false);
		declareFunction("csm_clean_up_assertion_info_cache", "CSM-CLEAN-UP-ASSERTION-INFO-CACHE", 0, 1, false);
		declareFunction("csm_clean_up_detected_collaboration_opportunities_cache", "CSM-CLEAN-UP-DETECTED-COLLABORATION-OPPORTUNITIES-CACHE", 0, 1, false);
		declareFunction("get_potential_collaboration_opportunity_detection_time", "GET-POTENTIAL-COLLABORATION-OPPORTUNITY-DETECTION-TIME", 1, 0, false);
		declareFunction("get_potential_collaboration_opportunity_detection_users", "GET-POTENTIAL-COLLABORATION-OPPORTUNITY-DETECTION-USERS", 1, 0, false);
		declareFunction("potential_collaboration_opportunity_detection_irrelevant_to_userP", "POTENTIAL-COLLABORATION-OPPORTUNITY-DETECTION-IRRELEVANT-TO-USER?", 2, 0, false);
		declareFunction("csm_mark_irrelevant_detection_of_potential_colloboration_opportunity_narts", "CSM-MARK-IRRELEVANT-DETECTION-OF-POTENTIAL-COLLOBORATION-OPPORTUNITY-NARTS", 0, 1, false);
		declareFunction("collect_akb_assertions_for_scalability_experiments", "COLLECT-AKB-ASSERTIONS-FOR-SCALABILITY-EXPERIMENTS", 0, 0, false);
		declareFunction("csm_generate_akb_assertion_transcript", "CSM-GENERATE-AKB-ASSERTION-TRANSCRIPT", 1, 1, false);
		declareFunction("get_random_akb_assertion", "GET-RANDOM-AKB-ASSERTION", 0, 0, false);
		declareFunction("csm_generate_akb_assertion_transcripts", "CSM-GENERATE-AKB-ASSERTION-TRANSCRIPTS", 2, 0, false);
		declareFunction("csm_load_transcript_file_with_timing_data", "CSM-LOAD-TRANSCRIPT-FILE-WITH-TIMING-DATA", 1, 1, false);
		declareFunction("wait_for_agenda_idle", "WAIT-FOR-AGENDA-IDLE", 0, 2, false);
		declareFunction("wait_for_agenda_busy", "WAIT-FOR-AGENDA-BUSY", 0, 2, false);
		declareFunction("operation_queue_emptyP", "OPERATION-QUEUE-EMPTY?", 1, 0, false);
		declareFunction("csm_select_an_akb_transcript_for_loading", "CSM-SELECT-AN-AKB-TRANSCRIPT-FOR-LOADING", 0, 0, false);
		declareFunction("csm_get_image_debugging_output_file", "CSM-GET-IMAGE-DEBUGGING-OUTPUT-FILE", 1, 0, false);
		declareFunction("csm_note_machine_transcript_association", "CSM-NOTE-MACHINE-TRANSCRIPT-ASSOCIATION", 1, 0, false);
		declareFunction("csm_unnote_machine_transcript_association", "CSM-UNNOTE-MACHINE-TRANSCRIPT-ASSOCIATION", 0, 0, false);
		declareFunction("csm_get_machine_transcript_association", "CSM-GET-MACHINE-TRANSCRIPT-ASSOCIATION", 0, 0, false);
		declareFunction("csm_run_scalability_experiment_step_one", "CSM-RUN-SCALABILITY-EXPERIMENT-STEP-ONE", 0, 1, false);
		declareFunction("csm_run_scalability_experiment_step_two", "CSM-RUN-SCALABILITY-EXPERIMENT-STEP-TWO", 0, 1, false);
		declareFunction("csm_display_cost_effectiveness_data", "CSM-DISPLAY-COST-EFFECTIVENESS-DATA", 0, 1, false);
		declareFunction("csm_create_nart", "CSM-CREATE-NART", 1, 0, false);
		declareFunction("csm_assert", "CSM-ASSERT", 2, 0, false);
		declareFunction("csm_reassert_assertion", "CSM-REASSERT-ASSERTION", 1, 0, false);
		declareFunction("get_image_url_for_user", "GET-IMAGE-URL-FOR-USER", 1, 0, false);
		declareFunction("get_detected_potential_collaboration_opportunities_for_user", "GET-DETECTED-POTENTIAL-COLLABORATION-OPPORTUNITIES-FOR-USER", 1, 0, false);
		declareFunction("all_genls_memoized_internal", "ALL-GENLS-MEMOIZED-INTERNAL", 1, 2, false);
		declareFunction("all_genls_memoized", "ALL-GENLS-MEMOIZED", 1, 2, false);
		declareFunction("all_genl_predicates_memoized_internal", "ALL-GENL-PREDICATES-MEMOIZED-INTERNAL", 1, 2, false);
		declareFunction("all_genl_predicates_memoized", "ALL-GENL-PREDICATES-MEMOIZED", 1, 2, false);
		declareFunction("isa_in_any_mt_memoizedP_internal", "ISA-IN-ANY-MT-MEMOIZED?-INTERNAL", 2, 0, false);
		declareFunction("isa_in_any_mt_memoizedP", "ISA-IN-ANY-MT-MEMOIZED?", 2, 0, false);
		declareFunction("clear_all_csm_caches", "CLEAR-ALL-CSM-CACHES", 0, 0, false);
		declareFunction("gather_csm_relevant_assertions_for_term", "GATHER-CSM-RELEVANT-ASSERTIONS-FOR-TERM", 1, 0, false);
		declareFunction("display_cosine_info_for_term_assertions", "DISPLAY-COSINE-INFO-FOR-TERM-ASSERTIONS", 1, 0, false);
		declareFunction("internal_cyc_termP", "INTERNAL-CYC-TERM?", 1, 0, false);
		declareFunction("blast_assertions_by_cyclist", "BLAST-ASSERTIONS-BY-CYCLIST", 1, 0, false);
		declareFunction("clean_up_detection_of_potential_colloboration_opportunity_narts_for_cyclist", "CLEAN-UP-DETECTION-OF-POTENTIAL-COLLOBORATION-OPPORTUNITY-NARTS-FOR-CYCLIST", 1, 0, false);
		return NIL;
	}

	public static final SubLObject init_collaborative_sense_making_utilities_file() {
		deflexical("*CSM-AKB-ASSERTIONS-BY-SMES*", NIL != boundp($csm_akb_assertions_by_smes$) ? ((SubLObject) ($csm_akb_assertions_by_smes$.getGlobalValue())) : make_hash_table($int$50, symbol_function(EQUAL), UNPROVIDED));
		deflexical("*CSM-AKB-ASSERTIONS-DIRECTORY*", $str_alt2$_cyc_projects_csm_sbir_scratch_ak);
		deflexical("*CSM-READABLE-FILENAME*", $str_alt3$_assertion_data_lisp);
		deflexical("*CSM-ID-FILENAME*", $str_alt4$_assertion_id_data_lisp);
		defvar("*CSM-DEBUGGING-LEVEL*", ZERO_INTEGER);
		defvar("*CSM-DEBUGGING-OUTPUT-DESTINATION-STREAM*", T);
		defparameter("*CSM-IRRELEVANT-TERM-CLASSES*", $list_alt84);
		defparameter("*CSM-IRRELEVANT-QUOTED-TERM-CLASSES*", $list_alt85);
		defparameter("*CSM-IRRELEVANT-TERMS*", $list_alt86);
		defparameter("*CSM-IRRELEVANT-NAT-FUNCTIONS*", $list_alt87);
		defparameter("*CSM-IRRELEVANT-NAME-PREFIXES*", $list_alt88);
		deflexical("*CONCEPTUAL-RELATEDNESS-GENERALITY-ESTIMATE-CUTOFF*", FIVE_INTEGER);
		defparameter("*CSM-TERM-FREQUENCY-FOR-TOPICALITY-CUTOFF*", FIVE_INTEGER);
		defparameter("*CONCEPTUALLY-NEAR-TERMS-COSINE-CUTOFF*", $float$0_24);
		defparameter("*CSM-CACHE-UNSUCCESSFUL-CN-RESULTS?*", NIL);
		defparameter("*CSM-QUIT-AFTER-FIRST-KB-PATH?*", T);
		deflexical("*INVERSE-TERM-FREQUENCIES-FHT-FILENAME*", $str_alt100$_cyc_projects_csm_sbir_scratch_in);
		defparameter("*MAX-INVERSE-TERM-FREQUENCY*", FOUR_INTEGER);
		defparameter("*CSM-KB-PATHS-MAX-TIME-CUTOFF*", $int$60);
		defparameter("*CSM-KB-PATHS-MAX-SEARCH-ITERATIONS-CUTOFF*", TWO_INTEGER);
		defparameter("*CSM-KB-PATHS-MAX-PATH-DEPTH-CUTOFF*", FOUR_INTEGER);
		defparameter("*RELEVANT-CONCEPTUAL-NEARNESS-PATH-NODE-CLASSES*", $list_alt110);
		defparameter("*IRRELEVANT-CONCEPTUAL-NEARNESS-PATH-NODE-CLASSES*", $list_alt111);
		defparameter("*PREFERRED-CONCEPTUAL-NEARNESS-PATH-NODE-CLASSES*", $list_alt112);
		defparameter("*CSM-IRRELEVANT-PATH-LINK-PREDICATES*", $list_alt113);
		defparameter("*CSM-IRRELEVANT-PATH-NODES*", $list_alt114);
		defparameter("*CSM-IRRELEVANT-PATH-LINK-MTS*", $list_alt115);
		defparameter("*CSM-NEAR-DATES-CUTOFF*", $int$172800);
		defparameter("*CSM-NEAR-DATES-CLUSTER-CUTOFF*", $int$14400);
		deflexical("*CSM-SPECIAL-TOPIC-PREDICATES*", $list_alt127);
		defvar("*CSM-COLLABORATION-OPPORTUNITY-DETECTION-ON?*", NIL);
		defconstant("*DTP-CSM-ASSERTION-INFO-ENTRY*", CSM_ASSERTION_INFO_ENTRY);
		defconstant("*DTP-CSM-TOPIC-JUSTIFICATION*", CSM_TOPIC_JUSTIFICATION);
		deflexical("*CSM-USER-ASSERTIONS*", NIL != boundp($csm_user_assertions$) ? ((SubLObject) ($csm_user_assertions$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		deflexical("*CSM-USER-ASSERTIONS-LOCK*", ReadWriteLocks.new_rw_lock($$$CSM_User_Assertions_Cache_Lock));
		deflexical("*CSM-USER-TOPICS*", NIL != boundp($csm_user_topics$) ? ((SubLObject) ($csm_user_topics$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		deflexical("*CSM-USER-TOPICS-LOCK*", ReadWriteLocks.new_rw_lock($$$CSM_User_Topics_Cache_Lock));
		deflexical("*CSM-ASSERTION-INFO*", NIL != boundp($csm_assertion_info$) ? ((SubLObject) ($csm_assertion_info$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		deflexical("*CSM-ASSERTION-INFO-LOCK*", ReadWriteLocks.new_rw_lock($$$CSM_Assertion_Info_Cache_Lock));
		deflexical("*CSM-RECENT-USER-ASSERTIONS*", NIL != boundp($csm_recent_user_assertions$) ? ((SubLObject) ($csm_recent_user_assertions$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
		deflexical("*CSM-RECENT-USER-ASSERTIONS-LOCK*", make_lock($$$CSM_Current_User_Assertions));
		deflexical("*CSM-DETECTED-COLLABORATION-OPPORTUNITIES*", NIL != boundp($csm_detected_collaboration_opportunities$) ? ((SubLObject) ($csm_detected_collaboration_opportunities$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		deflexical("*CSM-DETECTED-COLLABORATION-OPPORTUNITIES-LOCK*", ReadWriteLocks.new_rw_lock($str_alt204$CSM_Detected_Collaboration_Opport));
		deflexical("*CSM-UNSUCCESSFUL-CN-RESULTS*", NIL != boundp($csm_unsuccessful_cn_results$) ? ((SubLObject) ($csm_unsuccessful_cn_results$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		deflexical("*CSM-UNSUCCESSFUL-CN-RESULTS-LOCK*", ReadWriteLocks.new_rw_lock($str_alt213$CSM_Unsuccessful_Conceptual_Nearn));
		deflexical("*CSM-KB-MODIFY-CREATE-ASSERTION-EVENT-LISTENER*", NIL != boundp($csm_kb_modify_create_assertion_event_listener$) ? ((SubLObject) ($csm_kb_modify_create_assertion_event_listener$.getGlobalValue())) : NIL);
		deflexical("*CSM-KB-MODIFY-REMOVE-ASSERTION-EVENT-LISTENER*", NIL != boundp($csm_kb_modify_remove_assertion_event_listener$) ? ((SubLObject) ($csm_kb_modify_remove_assertion_event_listener$.getGlobalValue())) : NIL);
		deflexical("*CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-BY-EVENT-LISTENER*", NIL != boundp($csm_kb_modify_set_assertion_asserted_by_event_listener$) ? ((SubLObject) ($csm_kb_modify_set_assertion_asserted_by_event_listener$.getGlobalValue())) : NIL);
		deflexical("*CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-EVENT-LISTENER*", NIL != boundp($csm_kb_modify_set_assertion_asserted_when_event_listener$) ? ((SubLObject) ($csm_kb_modify_set_assertion_asserted_when_event_listener$.getGlobalValue())) : NIL);
		deflexical("*CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-EVENT-LISTENER*", NIL != boundp($csm_kb_modify_set_assertion_asserted_second_event_listener$) ? ((SubLObject) ($csm_kb_modify_set_assertion_asserted_second_event_listener$.getGlobalValue())) : NIL);
		deflexical("*CSM-IMPLEMENTATIONAL-CONSTANTS*", $list_alt234);
		deflexical("*CSM-IRRELEVANT-USER?-CACHING-STATE*", NIL);
		deflexical("*CSM-AKB-ASSERTIONS*", NIL != boundp($csm_akb_assertions$) ? ((SubLObject) ($csm_akb_assertions$.getGlobalValue())) : NIL);
		deflexical("*CSM-AKB-ASSERTION-COUNT*", NIL != boundp($csm_akb_assertion_count$) ? ((SubLObject) ($csm_akb_assertion_count$.getGlobalValue())) : ZERO_INTEGER);
		defparameter("*CSM-MAX-WAIT-TIME-FOR-IDLE-AGENDA*", multiply(new SubLObject[] { TWO_INTEGER, $int$24, $int$60, $int$60 }));
		deflexical("*CSM-SCALABILITY-EXPERIMENTS-TRANSCRIPTS-DIRECTORY*", $str_alt281$_cyc_projects_csm_sbir_scratch_sc);
		deflexical("*CSM-SCALABILITY-EXPERIMENTS-PHASE-ONE-DEBUGGING-OUTPUT-DIRECTORY*", $str_alt282$_cyc_projects_csm_sbir_scratch_sc);
		deflexical("*CSM-SCALABILITY-EXPERIMENTS-PHASE-TWO-DEBUGGING-OUTPUT-DIRECTORY*", $str_alt283$_cyc_projects_csm_sbir_scratch_sc);
		deflexical("*CSM-SCALABILITY-EXPERIMENTS-MACHINE-TS-ASSOCIATIONS-DIRECTORY*", $str_alt284$_cyc_projects_csm_sbir_scratch_sc);
		return NIL;
	}

	public static final SubLObject setup_collaborative_sense_making_utilities_file() {
		$csm_collaboration_opportunity_detection_onP$.setGlobalValue(NIL);

		subl_macro_promotions.declare_defglobal($csm_akb_assertions_by_smes$);
		memoization_state.note_memoized_function($sym89$TERM_TOO_GENERAL_FOR_CONCEPTUAL_RELATEDNESS_);
		memoization_state.note_memoized_function(GET_SIMPLE_CO_OCCURRENCE_VECTOR_FOR_TERM);
		memoization_state.note_memoized_function(GET_WEIGHTED_CO_OCCURRENCE_VECTOR_FOR_TERM);
		memoization_state.note_memoized_function(LINKED_TERM_FREQUENCIES_FOR_TERM);
		memoization_state.note_memoized_function(COUNT_SPEC_PREDICATES);
		memoization_state.note_memoized_function(JUSTIFY_CONCEPTUAL_NEARNESS_OF_TERMS);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_csm_assertion_info_entry$.getGlobalValue(), symbol_function(CSM_ASSERTION_INFO_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(CSM_ASSERTION_OWNER, _CSETF_CSM_ASSERTION_OWNER);
		def_csetf(CSM_ASSERTION_DATE, _CSETF_CSM_ASSERTION_DATE);
		def_csetf(CSM_ASSERTION_TIME, _CSETF_CSM_ASSERTION_TIME);
		def_csetf(CSM_ASSERTION_UNIVERSAL_TIME, _CSETF_CSM_ASSERTION_UNIVERSAL_TIME);
		def_csetf(CSM_ASSERTION_SENTENCE, _CSETF_CSM_ASSERTION_SENTENCE);
		def_csetf(CSM_ASSERTION_MT, _CSETF_CSM_ASSERTION_MT);
		def_csetf(CSM_ASSERTION_FORTS, _CSETF_CSM_ASSERTION_FORTS);
		identity(CSM_ASSERTION_INFO_ENTRY);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_csm_topic_justification$.getGlobalValue(), symbol_function(CSM_TOPIC_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(CSM_TOPIC_JUST_SENTENCE, _CSETF_CSM_TOPIC_JUST_SENTENCE);
		def_csetf(CSM_TOPIC_JUST_MT, _CSETF_CSM_TOPIC_JUST_MT);
		def_csetf(CSM_TOPIC_JUST_UNIVERSAL_TIME, _CSETF_CSM_TOPIC_JUST_UNIVERSAL_TIME);
		identity(CSM_TOPIC_JUSTIFICATION);
		subl_macro_promotions.declare_defglobal($csm_user_assertions$);
		subl_macro_promotions.declare_defglobal($csm_user_topics$);
		subl_macro_promotions.declare_defglobal($csm_assertion_info$);
		subl_macro_promotions.declare_defglobal($csm_recent_user_assertions$);
		subl_macro_promotions.declare_defglobal($csm_detected_collaboration_opportunities$);
		subl_macro_promotions.declare_defglobal($csm_unsuccessful_cn_results$);
		subl_macro_promotions.declare_defglobal($csm_kb_modify_create_assertion_event_listener$);
		subl_macro_promotions.declare_defglobal($csm_kb_modify_remove_assertion_event_listener$);
		subl_macro_promotions.declare_defglobal($csm_kb_modify_set_assertion_asserted_by_event_listener$);
		subl_macro_promotions.declare_defglobal($csm_kb_modify_set_assertion_asserted_when_event_listener$);
		subl_macro_promotions.declare_defglobal($csm_kb_modify_set_assertion_asserted_second_event_listener$);
		memoization_state.note_globally_cached_function($sym236$CSM_IRRELEVANT_USER_);
		subl_macro_promotions.declare_defglobal($csm_akb_assertions$);
		subl_macro_promotions.declare_defglobal($csm_akb_assertion_count$);
		access_macros.register_external_symbol(GET_IMAGE_URL_FOR_USER);
		access_macros.register_external_symbol(GET_DETECTED_POTENTIAL_COLLABORATION_OPPORTUNITIES_FOR_USER);
		memoization_state.note_memoized_function(ALL_GENLS_MEMOIZED);
		memoization_state.note_memoized_function(ALL_GENL_PREDICATES_MEMOIZED);
		memoization_state.note_memoized_function($sym123$ISA_IN_ANY_MT_MEMOIZED_);
		return NIL;
	}

	// // Internal Constants
	public static final SubLSymbol $csm_akb_assertions_by_smes$ = makeSymbol("*CSM-AKB-ASSERTIONS-BY-SMES*");

	public static final SubLInteger $int$50 = makeInteger(50);

	static private final SubLString $str_alt2$_cyc_projects_csm_sbir_scratch_ak = makeString("/cyc/projects/csm-sbir/scratch/akb-assertions/");

	static private final SubLString $str_alt3$_assertion_data_lisp = makeString("-assertion-data.lisp");

	static private final SubLString $str_alt4$_assertion_id_data_lisp = makeString("-assertion-id-data.lisp");

	static private final SubLString $$$Collecting_AKB_assertions = makeString("Collecting AKB assertions");

	public static final SubLObject $$TKB_SME = constant_handles.reader_make_constant_shell(makeString("TKB-SME"));

	public static final SubLObject $$ChrisDeaton = constant_handles.reader_make_constant_shell(makeString("ChrisDeaton"));

	static private final SubLString $str_alt8$___s_SMEs_collected_ = makeString("~%~s SMEs collected.");

	static private final SubLString $str_alt13$_ = makeString("-");

	static private final SubLString $str_alt14$_ = makeString("/");

	static private final SubLString $str_alt15$__Mapping_over_assertion_lists = makeString("~%Mapping over assertion lists");

	static private final SubLSymbol $sym16$_ = makeSymbol("<");

	private static final SubLSymbol ASSERTION_UNIVERSAL_TIME = makeSymbol("ASSERTION-UNIVERSAL-TIME");

	static private final SubLString $str_alt18$__Writing__a = makeString("~%Writing ~a");

	private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

	static private final SubLString $str_alt25$_____a__ = makeString(";;; ~a~%");

	static private final SubLString $str_alt26$______sme_name___date_int___secon = makeString(";;; (<sme-name> <date-int> <second-int> <formula> (<assertion-sentence-forts>))~%");

	static private final SubLString $str_alt27$______sme_id___assertion_universa = makeString(";;; (<sme-id> <assertion-universal-time> <formula-id> (<assertion-sentence-fort-ids>))~%");

	private static final SubLSymbol HL_EXTERNAL_ID_STRING = makeSymbol("HL-EXTERNAL-ID-STRING");

	static private final SubLString $str_alt29$__s__s__s__s__s___ = makeString("(~s ~s ~s ~s ~s)~%");

	static private final SubLString $str_alt30$__s__s__s__s___ = makeString("(~s ~s ~s ~s)~%");

	static private final SubLString $str_alt32$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

	static private final SubLString $str_alt33$_and_ = makeString("-and-");

	static private final SubLString $str_alt34$_missed_opportunities_ = makeString("-missed-opportunities-");

	static private final SubLString $str_alt35$_lisp = makeString(".lisp");

	static private final SubLString $str_alt36$__Analyzing_assertions_by__a_and_ = makeString("~%Analyzing assertions by ~a and ~a...~%");

	static private final SubLString $str_alt37$_____a__a__ = makeString(";;; ~a ~a~%");

	static private final SubLString $str_alt38$______date_int_1___second_int_1__ = makeString(";;; (<date-int-1> <second-int-1> <date-int-2> <second-int-2> (<related-terms>))~%");

	private static final SubLSymbol EOF = makeSymbol("EOF");

	static private final SubLString $str_alt41$__a__a__a__a__a___ = makeString("(~a ~a ~a ~a ~a)~%");

	static private final SubLList $list_alt42 = list(CHAR_lparen, CHAR_quotation);

	static private final SubLList $list_alt43 = list(CHAR_rparen, CHAR_lparen);

	private static final SubLSymbol GET_TERM_FROM_TOKEN = makeSymbol("GET-TERM-FROM-TOKEN");

	static private final SubLList $list_alt45 = list(list(makeSymbol("LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $csm_debugging_level$ = makeSymbol("*CSM-DEBUGGING-LEVEL*");

	static private final SubLList $list_alt48 = list(list(makeSymbol("DESTINATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("DIRECTION"), makeKeyword("APPEND"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym50$STREAM = makeUninternedSymbol("STREAM");

	static private final SubLSymbol $sym51$ERROR = makeUninternedSymbol("ERROR");

	static private final SubLList $list_alt53 = list(T);

	static private final SubLList $list_alt56 = list(makeSymbol("DESTINATION"));

	static private final SubLString $str_alt61$__Encountered_the_following_error = makeString("~%Encountered the following error while trying to open ~a as a text file:~%~a~%Please provide a valid pathname for debugging output.~%");

	static private final SubLString $str_alt62$__Invalid_destination__a_for_debu = makeString("~%Invalid destination ~a for debugging output.~%Please provide a valid destination (i.e., t, nil, a stream or a pathname) for debugging output.~%");

	public static final SubLSymbol $csm_debugging_output_destination_stream$ = makeSymbol("*CSM-DEBUGGING-OUTPUT-DESTINATION-STREAM*");

	static private final SubLString $str_alt64$___a_is_not_a_valid_debugging_lev = makeString("~%~a is not a valid debugging level. The debugging level needs to be a non-negative number.~%");

	static private final SubLString $str_alt66$___a__ = makeString("~%~a~%");

	static private final SubLString $str_alt67$The_following_error_was_caught_wi = makeString("The following error was caught within function ");

	static private final SubLList $list_alt68 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym69$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");

	private static final SubLSymbol CSM_NOTE_ERROR = makeSymbol("CSM-NOTE-ERROR");

	static private final SubLString $str_alt71$The_following_collaboration_oppor = makeString("The following collaboration opportunities are detected on ");

	static private final SubLString $str_alt72$_at_ = makeString(" at ");

	static private final SubLString $str_alt73$_ = makeString(":");

	static private final SubLString $str_alt74$No_collaboration_opportunities_ar = makeString("No collaboration opportunities are detected on ");

	static private final SubLString $str_alt75$_ = makeString(".");

	private static final SubLSymbol CSM_NOTE_POTENTIAL_COLLABORATION_OPPORTUNITIES = makeSymbol("CSM-NOTE-POTENTIAL-COLLABORATION-OPPORTUNITIES");

	static private final SubLList $list_alt77 = list(makeSymbol("USER1"), makeSymbol("USER2"), makeSymbol("CONCEPT-LISTS"));

	private static final SubLSymbol REIFY_POTENTIAL_COLLABORATION_OPPORTUNITIES = makeSymbol("REIFY-POTENTIAL-COLLABORATION-OPPORTUNITIES");

	static private final SubLList $list_alt79 = list(makeSymbol("CONCEPT1"), makeSymbol("CONCEPT2"), makeSymbol("COSINE"), makeSymbol("KB-PATHS"));

	public static final SubLObject $const80$DetectionOfCollaborationOpportuni = constant_handles.reader_make_constant_shell(makeString("DetectionOfCollaborationOpportunityFn"));

	public static final SubLObject $const81$dateOfPotentialCollaborationOppor = constant_handles.reader_make_constant_shell(makeString("dateOfPotentialCollaborationOpportunityDetection"));

	public static final SubLObject $$AnalystDatabaseMt = constant_handles.reader_make_constant_shell(makeString("AnalystDatabaseMt"));

	private static final SubLSymbol REIFY_POTENTIAL_COLLABORATION_OPPORTUNITY = makeSymbol("REIFY-POTENTIAL-COLLABORATION-OPPORTUNITY");

	static private final SubLList $list_alt84 = list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("CAEAnalysisTask")), constant_handles.reader_make_constant_shell(makeString("Cyc-BasedProject")), constant_handles.reader_make_constant_shell(makeString("CycKBSubsetCollection")), constant_handles.reader_make_constant_shell(makeString("CycLExpressionType")),
			constant_handles.reader_make_constant_shell(makeString("Cyclist")), constant_handles.reader_make_constant_shell(makeString("EnglishWord")), constant_handles.reader_make_constant_shell(makeString("DisplayingACycQueryJustification")), constant_handles.reader_make_constant_shell(makeString("DocumentationConstant")), constant_handles.reader_make_constant_shell(makeString("FETIntermediateYesOrNoAnswer")),
			constant_handles.reader_make_constant_shell(makeString("GenericQuantity")), constant_handles.reader_make_constant_shell(makeString("GregorianMonthType")), constant_handles.reader_make_constant_shell(makeString("KBContentRegressionTest")), constant_handles.reader_make_constant_shell(makeString("KEInteractionResource")), constant_handles.reader_make_constant_shell(makeString("KnowledgeBase")),
			constant_handles.reader_make_constant_shell(makeString("Language")), constant_handles.reader_make_constant_shell(makeString("LinguisticObjectType")), constant_handles.reader_make_constant_shell(makeString("LinguisticTranslationProcess")), constant_handles.reader_make_constant_shell(makeString("MicrotheorySpindle")), constant_handles.reader_make_constant_shell(makeString("PersonByStudentStatus")),
			constant_handles.reader_make_constant_shell(makeString("ProgramSpecification")), constant_handles.reader_make_constant_shell(makeString("Relation")), constant_handles.reader_make_constant_shell(makeString("ScalarOrVectorInterval")), constant_handles.reader_make_constant_shell(makeString("Schema-LogicalOrPhysical")), constant_handles.reader_make_constant_shell(makeString("SocialQuantityType")),
			constant_handles.reader_make_constant_shell(makeString("StructuredKnowledgeSource")), constant_handles.reader_make_constant_shell(makeString("Template")), constant_handles.reader_make_constant_shell(makeString("TestingConstant")), constant_handles.reader_make_constant_shell(makeString("TimePoint")), constant_handles.reader_make_constant_shell(makeString("UsingTheFactEntryTool")) });

	static private final SubLList $list_alt85 = list(constant_handles.reader_make_constant_shell(makeString("InterfaceModifierType")), constant_handles.reader_make_constant_shell(makeString("TestQueryConstant")), constant_handles.reader_make_constant_shell(makeString("TheTerm")), constant_handles.reader_make_constant_shell(makeString("TimeDimensionRelatedConstant")));

	static private final SubLList $list_alt86 = list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("CycAnalyticEnvironment-TheProgram")), constant_handles.reader_make_constant_shell(makeString("CycNounLearnerTool")), constant_handles.reader_make_constant_shell(makeString("DeemingAConceptRelevant")),
			constant_handles.reader_make_constant_shell(makeString("DisplayingACycQueryJustification")), constant_handles.reader_make_constant_shell(makeString("DisplayingFactSheetForConcept")), constant_handles.reader_make_constant_shell(makeString("SearchingForACycLTerm")), constant_handles.reader_make_constant_shell(makeString("UsingTheFactEntryTool")),
			constant_handles.reader_make_constant_shell(makeString("UsingTheQueryLibraryTool")), constant_handles.reader_make_constant_shell(makeString("LebaneseHizballah")) });

	static private final SubLList $list_alt87 = list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("DetectionOfCollaborationOpportunityFn")), constant_handles.reader_make_constant_shell(makeString("RecordMtByUserTaskAndApplicationFn")), constant_handles.reader_make_constant_shell(makeString("UserKEInteractionFolderForTaskFn")),
			constant_handles.reader_make_constant_shell(makeString("ModelMtByUserAndTaskFn")), constant_handles.reader_make_constant_shell(makeString("EvaluatingFn")), constant_handles.reader_make_constant_shell(makeString("TestQueryFn")), constant_handles.reader_make_constant_shell(makeString("TemplateFromTestQueryFn")), constant_handles.reader_make_constant_shell(makeString("ThingDescribableAsFn")),
			constant_handles.reader_make_constant_shell(makeString("WorkEventOnSpecificationFn")), constant_handles.reader_make_constant_shell(makeString("MeaningInSystemFn")), constant_handles.reader_make_constant_shell(makeString("STIF")), constant_handles.reader_make_constant_shell(makeString("STIB")) });

	static private final SubLList $list_alt88 = list(new SubLObject[] { makeString("ConceptDisplay-"), makeString("DeemingRelevant-"), makeString("EditingConcept-"), makeString("FETEvaluation-"), makeString("JustificationDisplay-"), makeString("QuerySearch-"), makeString("QueryAsked-"), makeString("RKF-ClonedQuery-"), makeString("TaskDisplay-"), makeString("WebSearch-"), makeString("WebBrowsing-"),
			makeString("ResearchAbduction-"), makeString("HYP-"), makeString("TMP-"), makeString("KS-") });

	static private final SubLSymbol $sym89$TERM_TOO_GENERAL_FOR_CONCEPTUAL_RELATEDNESS_ = makeSymbol("TERM-TOO-GENERAL-FOR-CONCEPTUAL-RELATEDNESS?");

	public static final SubLSymbol $kw90$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

	static private final SubLSymbol $sym91$CSM_IRRELEVANT_TERM_ = makeSymbol("CSM-IRRELEVANT-TERM?");

	private static final SubLSymbol DETERMINE_TOPICS_FOR_BAG_OF_TERMS = makeSymbol("DETERMINE-TOPICS-FOR-BAG-OF-TERMS");

	public static final SubLFloat $float$0_24 = makeDouble(0.24);

	static private final SubLSymbol $sym95$CONCEPTUALLY_NEAR_TERMS_ = makeSymbol("CONCEPTUALLY-NEAR-TERMS?");

	private static final SubLSymbol GET_SIMPLE_CO_OCCURRENCE_VECTOR_FOR_TERM = makeSymbol("GET-SIMPLE-CO-OCCURRENCE-VECTOR-FOR-TERM");

	public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

	public static final SubLInteger $int$200 = makeInteger(200);

	static private final SubLString $str_alt100$_cyc_projects_csm_sbir_scratch_in = makeString("/cyc/projects/csm-sbir/scratch/inverse-term-frequencies.fht");

	private static final SubLSymbol GET_WEIGHTED_CO_OCCURRENCE_VECTOR_FOR_TERM = makeSymbol("GET-WEIGHTED-CO-OCCURRENCE-VECTOR-FOR-TERM");

	private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

	private static final SubLSymbol LINKED_TERM_FREQUENCIES_FOR_TERM = makeSymbol("LINKED-TERM-FREQUENCIES-FOR-TERM");

	private static final SubLSymbol COUNT_SPEC_PREDICATES = makeSymbol("COUNT-SPEC-PREDICATES");

	private static final SubLSymbol $IDF = makeKeyword("IDF");

	private static final SubLSymbol $TF = makeKeyword("TF");

	private static final SubLSymbol $TF_IDF = makeKeyword("TF-IDF");

	static private final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");

	public static final SubLInteger $int$60 = makeInteger(60);

	static private final SubLList $list_alt110 = list(constant_handles.reader_make_constant_shell(makeString("Person")), constant_handles.reader_make_constant_shell(makeString("Organization")));

	static private final SubLList $list_alt111 = list(constant_handles.reader_make_constant_shell(makeString("Place")));

	static private final SubLList $list_alt112 = list(constant_handles.reader_make_constant_shell(makeString("Person")));

	static private final SubLList $list_alt113 = list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("assertionProducedByReformulation")), constant_handles.reader_make_constant_shell(makeString("dateOfPotentialCollaborationOpportunityDetection")), constant_handles.reader_make_constant_shell(makeString("ebmtNLToCycLTrainingExample")),
			constant_handles.reader_make_constant_shell(makeString("evaluationOutputSentences")), constant_handles.reader_make_constant_shell(makeString("excludeFromChoicesForPredPopTask")), constant_handles.reader_make_constant_shell(makeString("exemptFromEBMT")), constant_handles.reader_make_constant_shell(makeString("formulaTemplateExample")),
			constant_handles.reader_make_constant_shell(makeString("includeInChoicesForPredPopTask")), constant_handles.reader_make_constant_shell(makeString("irrelevantPotentialCollaborationOpportunityDetection")), constant_handles.reader_make_constant_shell(makeString("kEInteractionFolderOfUserForTask")), constant_handles.reader_make_constant_shell(makeString("kEInteractionFolderOfUserForTaskWRTConcept")),
			constant_handles.reader_make_constant_shell(makeString("notIdentical-AlreadyReviewed")), constant_handles.reader_make_constant_shell(makeString("noVerificationPerformedOnSentence")), constant_handles.reader_make_constant_shell(makeString("possiblyIdentical-NeedToReview")), constant_handles.reader_make_constant_shell(makeString("potentialCollaboratorConcept")),
			constant_handles.reader_make_constant_shell(makeString("presumedDifferentDespiteSharedLexification")), constant_handles.reader_make_constant_shell(makeString("recordMtByUserTaskAndApplication")), constant_handles.reader_make_constant_shell(makeString("reviewFromRequestedBy")), constant_handles.reader_make_constant_shell(makeString("sentenceParameterValueInSpecification")),
			constant_handles.reader_make_constant_shell(makeString("suggestedRule")), constant_handles.reader_make_constant_shell(makeString("suggestedSentence")), constant_handles.reader_make_constant_shell(makeString("suggestedSentenceReviewed")), constant_handles.reader_make_constant_shell(makeString("taskConceptForUser")), constant_handles.reader_make_constant_shell(makeString("termOfUnit")),
			constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Exact")), constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-NotWanted")), constant_handles.reader_make_constant_shell(makeString("testAnswersCycLUnimportant")), constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Wanted")),
			constant_handles.reader_make_constant_shell(makeString("tkbAptimaTieAssertion")), constant_handles.reader_make_constant_shell(makeString("topicCycL")), constant_handles.reader_make_constant_shell(makeString("unverifiedSentence")), constant_handles.reader_make_constant_shell(makeString("verificationFailedOnSentence")),
			constant_handles.reader_make_constant_shell(makeString("verificationSucceededOnSentence")), constant_handles.reader_make_constant_shell(makeString("verificationPerformedOnSentence")), constant_handles.reader_make_constant_shell(makeString("candidateReplacementForPosition")), constant_handles.reader_make_constant_shell(makeString("excludeReplacementOptionForFormulaTemplate")),
			constant_handles.reader_make_constant_shell(makeString("excludeReplacementOptionForFormulaTemplatePosition")), constant_handles.reader_make_constant_shell(makeString("exemptFromEBMT")), constant_handles.reader_make_constant_shell(makeString("formulaTemplateFollowUp")), constant_handles.reader_make_constant_shell(makeString("formulaTemplateGloss")),
			constant_handles.reader_make_constant_shell(makeString("positionInFormulaTemplateIsReplaceable")), constant_handles.reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate")), constant_handles.reader_make_constant_shell(makeString("clumpSyntaxList")), constant_handles.reader_make_constant_shell(makeString("evaluationOfByOn")),
			constant_handles.reader_make_constant_shell(makeString("evaluee-Direct")), constant_handles.reader_make_constant_shell(makeString("objectOfEvaluation")), constant_handles.reader_make_constant_shell(makeString("temporallyIntersects")), constant_handles.reader_make_constant_shell(makeString("firstPublicationDateForStyleAndRendering")),
			constant_handles.reader_make_constant_shell(makeString("publisherForStyleAndRendering")), constant_handles.reader_make_constant_shell(makeString("infoTransferred-Prop")) });

	static private final SubLList $list_alt114 = list(constant_handles.reader_make_constant_shell(makeString("LebaneseHizballah")));

	static private final SubLList $list_alt115 = list(constant_handles.reader_make_constant_shell(makeString("EnglishMt")), constant_handles.reader_make_constant_shell(makeString("TKB-FETSourceDocumentsMt")));

	private static final SubLSymbol JUSTIFY_CONCEPTUAL_NEARNESS_OF_TERMS = makeSymbol("JUSTIFY-CONCEPTUAL-NEARNESS-OF-TERMS");

	static private final SubLString $str_alt117$Searching_for_relevant_KB_paths_b = makeString("Searching for relevant KB paths between ");

	static private final SubLString $str_alt118$_and_ = makeString(" and ");

	static private final SubLString $str_alt119$___ = makeString("...");

	static private final SubLSymbol $sym121$_ = makeSymbol(">");

	static private final SubLSymbol $sym123$ISA_IN_ANY_MT_MEMOIZED_ = makeSymbol("ISA-IN-ANY-MT-MEMOIZED?");

	static private final SubLSymbol $sym124$RELEVANT_CONCEPTUAL_NEARNESS_PATH_NODE_ = makeSymbol("RELEVANT-CONCEPTUAL-NEARNESS-PATH-NODE?");

	public static final SubLInteger $int$172800 = makeInteger(172800);

	public static final SubLInteger $int$14400 = makeInteger(14400);

	static private final SubLList $list_alt127 = list(constant_handles.reader_make_constant_shell(makeString("objectOfEvaluation")), constant_handles.reader_make_constant_shell(makeString("evaluee-Direct")), constant_handles.reader_make_constant_shell(makeString("topicCycL")), constant_handles.reader_make_constant_shell(makeString("taskConceptForUser")),
			constant_handles.reader_make_constant_shell(makeString("mostRecentImportantConceptEvent")));

	public static final SubLObject $$objectOfEvaluation = constant_handles.reader_make_constant_shell(makeString("objectOfEvaluation"));

	public static final SubLObject $$evaluee_Direct = constant_handles.reader_make_constant_shell(makeString("evaluee-Direct"));

	public static final SubLObject $$topicCycL = constant_handles.reader_make_constant_shell(makeString("topicCycL"));

	public static final SubLObject $$taskConceptForUser = constant_handles.reader_make_constant_shell(makeString("taskConceptForUser"));

	public static final SubLObject $$ModelMtByUserAndTaskFn = constant_handles.reader_make_constant_shell(makeString("ModelMtByUserAndTaskFn"));

	public static final SubLObject $const133$RecordMtByUserTaskAndApplicationF = constant_handles.reader_make_constant_shell(makeString("RecordMtByUserTaskAndApplicationFn"));

	private static final SubLSymbol CSM_INITIALIZE_COLLABORATION_OPPORTUNITY_DETECTION = makeSymbol("CSM-INITIALIZE-COLLABORATION-OPPORTUNITY-DETECTION");

	private static final SubLSymbol CSM_ASSERTION_INFO_ENTRY = makeSymbol("CSM-ASSERTION-INFO-ENTRY");

	private static final SubLSymbol CSM_ASSERTION_INFO_ENTRY_P = makeSymbol("CSM-ASSERTION-INFO-ENTRY-P");

	static private final SubLList $list_alt137 = list(makeSymbol("OWNER"), makeSymbol("DATE"), makeSymbol("TIME"), makeSymbol("UNIVERSAL-TIME"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("FORTS"));

	static private final SubLList $list_alt138 = list(makeKeyword("OWNER"), $DATE, $TIME, makeKeyword("UNIVERSAL-TIME"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("FORTS"));

	static private final SubLList $list_alt139 = list(makeSymbol("CSM-ASSERTION-OWNER"), makeSymbol("CSM-ASSERTION-DATE"), makeSymbol("CSM-ASSERTION-TIME"), makeSymbol("CSM-ASSERTION-UNIVERSAL-TIME"), makeSymbol("CSM-ASSERTION-SENTENCE"), makeSymbol("CSM-ASSERTION-MT"), makeSymbol("CSM-ASSERTION-FORTS"));

	static private final SubLList $list_alt140 = list(makeSymbol("_CSETF-CSM-ASSERTION-OWNER"), makeSymbol("_CSETF-CSM-ASSERTION-DATE"), makeSymbol("_CSETF-CSM-ASSERTION-TIME"), makeSymbol("_CSETF-CSM-ASSERTION-UNIVERSAL-TIME"), makeSymbol("_CSETF-CSM-ASSERTION-SENTENCE"), makeSymbol("_CSETF-CSM-ASSERTION-MT"), makeSymbol("_CSETF-CSM-ASSERTION-FORTS"));

	private static final SubLSymbol PRINT_CSM_ASSERTION_INFO_ENTRY = makeSymbol("PRINT-CSM-ASSERTION-INFO-ENTRY");

	private static final SubLSymbol CSM_ASSERTION_INFO_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CSM-ASSERTION-INFO-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLSymbol CSM_ASSERTION_OWNER = makeSymbol("CSM-ASSERTION-OWNER");

	public static final SubLSymbol _CSETF_CSM_ASSERTION_OWNER = makeSymbol("_CSETF-CSM-ASSERTION-OWNER");

	private static final SubLSymbol CSM_ASSERTION_DATE = makeSymbol("CSM-ASSERTION-DATE");

	public static final SubLSymbol _CSETF_CSM_ASSERTION_DATE = makeSymbol("_CSETF-CSM-ASSERTION-DATE");

	private static final SubLSymbol CSM_ASSERTION_TIME = makeSymbol("CSM-ASSERTION-TIME");

	public static final SubLSymbol _CSETF_CSM_ASSERTION_TIME = makeSymbol("_CSETF-CSM-ASSERTION-TIME");

	private static final SubLSymbol CSM_ASSERTION_UNIVERSAL_TIME = makeSymbol("CSM-ASSERTION-UNIVERSAL-TIME");

	public static final SubLSymbol _CSETF_CSM_ASSERTION_UNIVERSAL_TIME = makeSymbol("_CSETF-CSM-ASSERTION-UNIVERSAL-TIME");

	private static final SubLSymbol CSM_ASSERTION_SENTENCE = makeSymbol("CSM-ASSERTION-SENTENCE");

	public static final SubLSymbol _CSETF_CSM_ASSERTION_SENTENCE = makeSymbol("_CSETF-CSM-ASSERTION-SENTENCE");

	private static final SubLSymbol CSM_ASSERTION_MT = makeSymbol("CSM-ASSERTION-MT");

	public static final SubLSymbol _CSETF_CSM_ASSERTION_MT = makeSymbol("_CSETF-CSM-ASSERTION-MT");

	private static final SubLSymbol CSM_ASSERTION_FORTS = makeSymbol("CSM-ASSERTION-FORTS");

	public static final SubLSymbol _CSETF_CSM_ASSERTION_FORTS = makeSymbol("_CSETF-CSM-ASSERTION-FORTS");

	private static final SubLSymbol $UNIVERSAL_TIME = makeKeyword("UNIVERSAL-TIME");

	static private final SubLString $str_alt164$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	static private final SubLList $list_alt165 = list(makeSymbol("NAME"), makeSymbol("VALUE"));

	static private final SubLString $str_alt166$__CSM_ASSERTION_INFO__s__s__s__s_ = makeString("#<CSM-ASSERTION-INFO:~s:~s:~s:~s:~s:~s:~s>");

	private static final SubLSymbol CSM_TOPIC_JUSTIFICATION = makeSymbol("CSM-TOPIC-JUSTIFICATION");

	private static final SubLSymbol CSM_TOPIC_JUSTIFICATION_P = makeSymbol("CSM-TOPIC-JUSTIFICATION-P");

	static private final SubLList $list_alt169 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("UNIVERSAL-TIME"));

	static private final SubLList $list_alt170 = list(makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("UNIVERSAL-TIME"));

	static private final SubLList $list_alt171 = list(makeSymbol("CSM-TOPIC-JUST-SENTENCE"), makeSymbol("CSM-TOPIC-JUST-MT"), makeSymbol("CSM-TOPIC-JUST-UNIVERSAL-TIME"));

	static private final SubLList $list_alt172 = list(makeSymbol("_CSETF-CSM-TOPIC-JUST-SENTENCE"), makeSymbol("_CSETF-CSM-TOPIC-JUST-MT"), makeSymbol("_CSETF-CSM-TOPIC-JUST-UNIVERSAL-TIME"));

	private static final SubLSymbol PRINT_CSM_TOPIC_JUSTIFICATION = makeSymbol("PRINT-CSM-TOPIC-JUSTIFICATION");

	private static final SubLSymbol CSM_TOPIC_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CSM-TOPIC-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLSymbol CSM_TOPIC_JUST_SENTENCE = makeSymbol("CSM-TOPIC-JUST-SENTENCE");

	public static final SubLSymbol _CSETF_CSM_TOPIC_JUST_SENTENCE = makeSymbol("_CSETF-CSM-TOPIC-JUST-SENTENCE");

	private static final SubLSymbol CSM_TOPIC_JUST_MT = makeSymbol("CSM-TOPIC-JUST-MT");

	public static final SubLSymbol _CSETF_CSM_TOPIC_JUST_MT = makeSymbol("_CSETF-CSM-TOPIC-JUST-MT");

	private static final SubLSymbol CSM_TOPIC_JUST_UNIVERSAL_TIME = makeSymbol("CSM-TOPIC-JUST-UNIVERSAL-TIME");

	public static final SubLSymbol _CSETF_CSM_TOPIC_JUST_UNIVERSAL_TIME = makeSymbol("_CSETF-CSM-TOPIC-JUST-UNIVERSAL-TIME");

	static private final SubLString $str_alt181$__CSM_TOPIC_JUSTIFICATION__s__s__ = makeString("#<CSM-TOPIC-JUSTIFICATION:~s:~s:~s>");

	public static final SubLSymbol $csm_user_assertions$ = makeSymbol("*CSM-USER-ASSERTIONS*");

	static private final SubLString $$$CSM_User_Assertions_Cache_Lock = makeString("CSM User Assertions Cache Lock");

	private static final SubLSymbol WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");

	static private final SubLList $list_alt185 = list(makeSymbol("*CSM-USER-ASSERTIONS-LOCK*"));

	private static final SubLSymbol WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

	static private final SubLList $list_alt187 = list(list(makeSymbol("ASSERTION"), makeSymbol("USER")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym188$USER_ASSERTIONS = makeUninternedSymbol("USER-ASSERTIONS");

	private static final SubLSymbol CSM_USER_ASSERTIONS = makeSymbol("CSM-USER-ASSERTIONS");

	static private final SubLString $str_alt191$__The_total_number_users_is_0__Ca = makeString("~%The total number users is 0. Cannot compute the average number of assertions per user.~%");

	public static final SubLSymbol $csm_user_topics$ = makeSymbol("*CSM-USER-TOPICS*");

	static private final SubLString $$$CSM_User_Topics_Cache_Lock = makeString("CSM User Topics Cache Lock");

	static private final SubLList $list_alt194 = list(makeSymbol("*CSM-USER-TOPICS-LOCK*"));

	static private final SubLList $list_alt195 = list(list(makeSymbol("TOPIC"), makeSymbol("JUSTIFICATIONS"), makeSymbol("USER-TOPICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLString $str_alt197$__The_total_number_users_is_0__Ca = makeString("~%The total number users is 0. Cannot compute the average number of topics per user.~%");

	public static final SubLSymbol $csm_assertion_info$ = makeSymbol("*CSM-ASSERTION-INFO*");

	static private final SubLString $$$CSM_Assertion_Info_Cache_Lock = makeString("CSM Assertion Info Cache Lock");

	static private final SubLList $list_alt200 = list(makeSymbol("*CSM-ASSERTION-INFO-LOCK*"));

	public static final SubLSymbol $csm_recent_user_assertions$ = makeSymbol("*CSM-RECENT-USER-ASSERTIONS*");

	static private final SubLString $$$CSM_Current_User_Assertions = makeString("CSM Current User Assertions");

	public static final SubLSymbol $csm_detected_collaboration_opportunities$ = makeSymbol("*CSM-DETECTED-COLLABORATION-OPPORTUNITIES*");

	static private final SubLString $str_alt204$CSM_Detected_Collaboration_Opport = makeString("CSM Detected Collaboration Opportunities Cache Lock");

	static private final SubLList $list_alt205 = list(makeSymbol("*CSM-DETECTED-COLLABORATION-OPPORTUNITIES-LOCK*"));

	static private final SubLList $list_alt206 = list(makeSymbol("TOPIC-LIST"), makeSymbol("CO-TIME"));

	static private final SubLList $list_alt207 = list(makeSymbol("CO-TOPIC1"), makeSymbol("CO-TOPIC2"));

	public static final SubLObject $$potentialCollaboratorConcept = constant_handles.reader_make_constant_shell(makeString("potentialCollaboratorConcept"));

	public static final SubLSymbol $csm_unsuccessful_cn_results$ = makeSymbol("*CSM-UNSUCCESSFUL-CN-RESULTS*");

	static private final SubLString $str_alt213$CSM_Unsuccessful_Conceptual_Nearn = makeString("CSM Unsuccessful Conceptual Nearness Results Lock");

	static private final SubLList $list_alt214 = list(makeSymbol("*CSM-UNSUCCESSFUL-CN-RESULTS-LOCK*"));

	static private final SubLString $str_alt215$__ASSERTION_INFO_CACHE___ = makeString("~%ASSERTION INFO CACHE:~%");

	static private final SubLString $str_alt216$__USER_ASSERTIONS_CACHE___ = makeString("~%USER ASSERTIONS CACHE:~%");

	static private final SubLString $str_alt217$__USER_TOPICS_CACHE___ = makeString("~%USER TOPICS CACHE:~%");

	static private final SubLString $str_alt218$__DETECTED_COLLABORATION_OPPORTUN = makeString("~%DETECTED COLLABORATION OPPORTUNITIES CACHE:~%");

	static private final SubLString $str_alt219$__UNSUCCESSFUL_CONCEPTUAL_NEARNES = makeString("~%UNSUCCESSFUL CONCEPTUAL NEARNESS RESULTS CACHE:~%");

	private static final SubLSymbol CSM_KB_MODIFY_CREATE_ASSERTION_ACTION = makeSymbol("CSM-KB-MODIFY-CREATE-ASSERTION-ACTION");

	public static final SubLSymbol $csm_kb_modify_create_assertion_event_listener$ = makeSymbol("*CSM-KB-MODIFY-CREATE-ASSERTION-EVENT-LISTENER*");

	private static final SubLSymbol CSM_KB_MODIFY_REMOVE_ASSERTION_ACTION = makeSymbol("CSM-KB-MODIFY-REMOVE-ASSERTION-ACTION");

	public static final SubLSymbol $csm_kb_modify_remove_assertion_event_listener$ = makeSymbol("*CSM-KB-MODIFY-REMOVE-ASSERTION-EVENT-LISTENER*");

	private static final SubLSymbol CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_BY_ACTION = makeSymbol("CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-BY-ACTION");

	public static final SubLSymbol $csm_kb_modify_set_assertion_asserted_by_event_listener$ = makeSymbol("*CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-BY-EVENT-LISTENER*");

	private static final SubLSymbol CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN_ACTION = makeSymbol("CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-ACTION");

	public static final SubLSymbol $csm_kb_modify_set_assertion_asserted_when_event_listener$ = makeSymbol("*CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-EVENT-LISTENER*");

	private static final SubLSymbol CSM_KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND_ACTION = makeSymbol("CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-ACTION");

	public static final SubLSymbol $csm_kb_modify_set_assertion_asserted_second_event_listener$ = makeSymbol("*CSM-KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-EVENT-LISTENER*");

	private static final SubLSymbol $KB_MODIFY_CREATE_ASSERTION = makeKeyword("KB-MODIFY-CREATE-ASSERTION");

	private static final SubLSymbol $KB_MODIFY_SET_ASSERTION_ASSERTED_BY = makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-BY");

	private static final SubLSymbol $KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN = makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN");

	private static final SubLSymbol $KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND = makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND");

	static private final SubLList $list_alt234 = list(constant_handles.reader_make_constant_shell(makeString("dateOfPotentialCollaborationOpportunityDetection")), constant_handles.reader_make_constant_shell(makeString("irrelevantPotentialCollaborationOpportunityDetection")), constant_handles.reader_make_constant_shell(makeString("kEInteractionFolderOfUserForTask")),
			constant_handles.reader_make_constant_shell(makeString("kEInteractionFolderOfUserForTaskWRTConcept")), constant_handles.reader_make_constant_shell(makeString("potentialCollaboratorConcept")), constant_handles.reader_make_constant_shell(makeString("recordMtByUserTaskAndApplication")), constant_handles.reader_make_constant_shell(makeString("termOfUnit")));

	static private final SubLList $list_alt235 = list(constant_handles.reader_make_constant_shell(makeString("objectOfEvaluation")), constant_handles.reader_make_constant_shell(makeString("taskConceptForUser")));

	static private final SubLSymbol $sym236$CSM_IRRELEVANT_USER_ = makeSymbol("CSM-IRRELEVANT-USER?");

	public static final SubLObject $$IndeterminateTerm = constant_handles.reader_make_constant_shell(makeString("IndeterminateTerm"));

	static private final SubLSymbol $sym238$_CSM_IRRELEVANT_USER__CACHING_STATE_ = makeSymbol("*CSM-IRRELEVANT-USER?-CACHING-STATE*");

	static private final SubLString $str_alt239$Searching_for_collaboration_oppor = makeString("Searching for collaboration opportunities for user ");

	static private final SubLString $str_alt240$_and_topics_ = makeString(" and topics ");

	static private final SubLSymbol $sym241$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP = makeSymbol("IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT1");

	static private final SubLSymbol $sym242$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP = makeSymbol("IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT1-INT");

	static private final SubLList $list_alt243 = list(makeSymbol("OTHER-USER"), makeSymbol("OTHER-USER-TOPICS"));

	static private final SubLSymbol $sym244$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP = makeSymbol("IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT2");

	static private final SubLString $str_alt245$Considering_user_ = makeString("Considering user ");

	static private final SubLString $str_alt246$_and_topic_ = makeString(" and topic ");

	static private final SubLSymbol $sym247$IDENTIFY_TEMPORALLY_NEAR_COLLABORATION_OPPORTUNITIES_FOR_USER_TOP = makeSymbol("IDENTIFY-TEMPORALLY-NEAR-COLLABORATION-OPPORTUNITIES-FOR-USER-TOPICS-INT3");

	static private final SubLString $str_alt248$Identifying_new_topics_for_user_ = makeString("Identifying new topics for user ");

	private static final SubLSymbol CSM_IDENTIFY_NEW_TOPICS_FOR_USER = makeSymbol("CSM-IDENTIFY-NEW-TOPICS-FOR-USER");

	static private final SubLString $str_alt250$The_following_topics_were_identif = makeString("The following topics were identified for user ");

	static private final SubLString $str_alt251$__ = makeString(": ");

	private static final SubLSymbol CSM_UPDATE_TOPICS_FOR_USER = makeSymbol("CSM-UPDATE-TOPICS-FOR-USER");

	static private final SubLString $str_alt253$Identifying_new_topics_for_users_ = makeString("Identifying new topics for users on ");

	private static final SubLSymbol CSM_UPDATE_USER_TOPICS = makeSymbol("CSM-UPDATE-USER-TOPICS");

	static private final SubLString $str_alt255$Done_with_identifying_new_topics_ = makeString("Done with identifying new topics for users...");

	static private final SubLList $list_alt256 = list(makeSymbol("USER"), makeSymbol("TOPICS"), makeSymbol("JUSTIFICATIONS"));

	private static final SubLSymbol CSM_UPDATE_AND_ANALYZE_USER_TOPICS = makeSymbol("CSM-UPDATE-AND-ANALYZE-USER-TOPICS");

	private static final SubLSymbol CSM_CLEAN_UP_USER_CACHES = makeSymbol("CSM-CLEAN-UP-USER-CACHES");

	static private final SubLList $list_alt259 = cons(makeSymbol("TOPIC"), makeSymbol("JUSTIFICATIONS"));

	static private final SubLList $list_alt260 = cons(makeSymbol("USER"), makeSymbol("ASSERTIONS"));

	static private final SubLList $list_alt261 = cons(makeSymbol("ASSERTION"), makeSymbol("INFO"));

	static private final SubLList $list_alt262 = cons(makeSymbol("OTHER-USER"), makeSymbol("COS"));

	public static final SubLObject $const263$irrelevantPotentialCollaborationO = constant_handles.reader_make_constant_shell(makeString("irrelevantPotentialCollaborationOpportunityDetection"));

	public static final SubLSymbol $csm_akb_assertions$ = makeSymbol("*CSM-AKB-ASSERTIONS*");

	public static final SubLSymbol $csm_akb_assertion_count$ = makeSymbol("*CSM-AKB-ASSERTION-COUNT*");

	public static final SubLInteger $int$205600 = makeInteger(205600);

	static private final SubLString $$$Generating_transcript_file = makeString("Generating transcript file");

	static private final SubLString $str_alt268$_ = makeString(" ");

	static private final SubLString $$$Done_with_transcript_file = makeString("Done with transcript file");

	public static final SubLInteger $int$24 = makeInteger(24);

	static private final SubLString $str_alt272$Machine_name__ = makeString("Machine name: ");

	static private final SubLString $$$unknown = makeString("unknown");

	static private final SubLString $str_alt274$Transcript_file__ = makeString("Transcript file: ");

	static private final SubLString $str_alt275$Number_of_operations__ = makeString("Number of operations: ");

	static private final SubLString $str_alt276$Number_of_assertions__ = makeString("Number of assertions: ");

	static private final SubLString $str_alt277$Start_time__ = makeString("Start time: ");

	static private final SubLString $str_alt278$End_time__ = makeString("End time: ");

	static private final SubLString $str_alt279$Total_time__ = makeString("Total time: ");

	static private final SubLString $str_alt281$_cyc_projects_csm_sbir_scratch_sc = makeString("/cyc/projects/csm-sbir/scratch/scalability-experiments/akb-assertion-transcripts/");

	static private final SubLString $str_alt282$_cyc_projects_csm_sbir_scratch_sc = makeString("/cyc/projects/csm-sbir/scratch/scalability-experiments/debugging-output/phase1/");

	static private final SubLString $str_alt283$_cyc_projects_csm_sbir_scratch_sc = makeString("/cyc/projects/csm-sbir/scratch/scalability-experiments/debugging-output/phase2/");

	static private final SubLString $str_alt284$_cyc_projects_csm_sbir_scratch_sc = makeString("/cyc/projects/csm-sbir/scratch/scalability-experiments/machine-transcript-associations/");

	static private final SubLString $str_alt285$_txt = makeString(".txt");

	static private final SubLString $str_alt286$_A = makeString("~A");

	static private final SubLString $str_alt288$Experiment_start_time__ = makeString("Experiment start time: ");

	static private final SubLString $str_alt289$Experiment_end_time__ = makeString("Experiment end time: ");

	static private final SubLString $str_alt290$Experiment_total_time__ = makeString("Experiment total time: ");

	static private final SubLString $str_alt291$Total_number_of_users__ = makeString("Total number of users: ");

	static private final SubLString $str_alt292$Total_number_of_user_assertions__ = makeString("Total number of user assertions: ");

	static private final SubLString $str_alt293$Total_number_of_user_topics__ = makeString("Total number of user topics: ");

	static private final SubLString $str_alt294$Average_number_of_assertions_per_ = makeString("Average number of assertions per user: ");

	static private final SubLString $str_alt295$Average_number_of_topics_per_user = makeString("Average number of topics per user: ");

	static private final SubLString $str_alt296$The_following_potential_collabora = makeString("The following potential collaboration opportunities have been detected:");

	static private final SubLString $str_alt297$Total_number_of_detected_potentia = makeString("Total number of detected potential collaboration opportunities (from NARTs): ");

	static private final SubLString $str_alt298$Average_number_of_detected_potent = makeString("Average number of detected potential collaboration opportunities per user (from NARTs): ");

	private static final SubLSymbol GET_IMAGE_URL_FOR_USER = makeSymbol("GET-IMAGE-URL-FOR-USER");

	public static final SubLObject $$tinyIconTermImagePathname = constant_handles.reader_make_constant_shell(makeString("tinyIconTermImagePathname"));

	public static final SubLObject $const301$defaultTinyIconTermImagePathnameF = constant_handles.reader_make_constant_shell(makeString("defaultTinyIconTermImagePathnameForType"));

	private static final SubLSymbol GET_DETECTED_POTENTIAL_COLLABORATION_OPPORTUNITIES_FOR_USER = makeSymbol("GET-DETECTED-POTENTIAL-COLLABORATION-OPPORTUNITIES-FOR-USER");

	private static final SubLSymbol ALL_GENLS_MEMOIZED = makeSymbol("ALL-GENLS-MEMOIZED");

	private static final SubLSymbol ALL_GENL_PREDICATES_MEMOIZED = makeSymbol("ALL-GENL-PREDICATES-MEMOIZED");

	public static final SubLInteger $int$500 = makeInteger(500);

	static private final SubLString $str_alt306$_a__ = makeString("~a~%");

	static private final SubLString $str_alt307$_a__a____cosine___a__ = makeString("~a ~a -- cosine: ~a~%");

	static private final SubLString $str_alt308$__ = makeString("~%");

	public static final SubLObject $$keIrrelevantTerm_InternalCycTerm = constant_handles.reader_make_constant_shell(makeString("keIrrelevantTerm-InternalCycTerm"));

	static private final SubLString $str_alt310$Blasting_KB_assertions_by_ = makeString("Blasting KB assertions by ");

	// // Initializers
	@Override
	public void declareFunctions() {
		declare_collaborative_sense_making_utilities_file();
	}

	@Override
	public void initializeVariables() {
		init_collaborative_sense_making_utilities_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_collaborative_sense_making_utilities_file();
	}
}
