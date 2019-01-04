//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class subl_benchmarks implements SubLFile {
	public static SubLObject benchmark_hash_table_exerciser(SubLObject thread_count, SubLObject throwaway_thread_n,
			SubLObject thread_sample_n, SubLObject hash_table_size) {
		SubLObject times = SubLNil.NIL;
		SubLObject i;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; SubLNil
				.toBool(Numbers.numL(i, throwaway_thread_n)); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			Storage.gc_ephemeral();
			benchmark_hash_table_exerciser_guts(thread_count, hash_table_size);
		}
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; SubLNil
				.toBool(Numbers.numL(i, thread_sample_n)); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			Storage.gc_ephemeral();
			times = ConsesLow.cons(benchmark_hash_table_exerciser_guts(thread_count, hash_table_size), times);
		}
		SubLObject median = numeric_median(times);
		return median;
	}

	public static SubLObject benchmark_hash_table_exerciser_builder(SubLObject size) {
		SubLObject table = Hashtables.make_hash_table(size, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		SubLObject i;
		SubLObject code;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; SubLNil
				.toBool(Numbers.numL(i, size)); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			code = print_high.princ_to_string(random.random(size));
			Hashtables.sethash(i, table, code);
		}
		return table;
	}

	public static SubLObject benchmark_hash_table_exerciser_guts(SubLObject thread_count, SubLObject hash_table_size) {
		SubLObject lock = Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_lock$);
		try {
			Locks.seize_lock(lock);
			Symbols.set(subl_benchmarks.$benchmark_hash_table_exerciser_table_size$, hash_table_size);
			Symbols.set(subl_benchmarks.$benchmark_hash_table_exerciser_finished$, CommonSymbols.ZERO_INTEGER);
			Symbols.set(subl_benchmarks.$benchmark_hash_table_exerciser_times$, SubLNil.NIL);
			SubLObject i;
			SubLObject process_name;
			for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; SubLNil
					.toBool(Numbers.numL(i, thread_count)); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				process_name = Sequences.cconcatenate(subl_benchmarks.$constants[1], print_high.princ_to_string(i));
				Threads.make_process(process_name, subl_benchmarks.$constants[2]);
			}
		} finally {
			Locks.release_lock(lock);
		}
		SubLObject finishedP = SubLNil.NIL;
		while (!SubLNil.toBool(finishedP)) {
			Threads.sleep(CommonSymbols.ONE_INTEGER);
			SubLObject lock2 = Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_lock$);
			try {
				Locks.seize_lock(lock2);
				finishedP = Numbers.numE(
						Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_finished$), thread_count);
			} finally {
				Locks.release_lock(lock2);
			}
		}
		SubLObject times = SubLNil.NIL;
		SubLObject lock2 = Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_lock$);
		try {
			Locks.seize_lock(lock2);
			times = Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_times$);
		} finally {
			Locks.release_lock(lock2);
		}
		SubLObject median = numeric_median(times);
		return median;
	}

	public static SubLObject benchmark_hash_table_exerciser_process() {
		SubLObject size = SubLNil.NIL;
		SubLObject time = SubLNil.NIL;
		SubLObject lock = Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_lock$);
		try {
			Locks.seize_lock(lock);
			size = Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_table_size$);
		} finally {
			Locks.release_lock(lock);
		}
		SubLObject time_var = Time.get_internal_real_time();
		benchmark_hash_table_exerciser_process_int(size);
		time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var),
				Symbols.symbol_value(time_high.$internal_time_units_per_second$));
		SubLObject lock_1 = Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_lock$);
		try {
			Locks.seize_lock(lock_1);
			Symbols.set(subl_benchmarks.$benchmark_hash_table_exerciser_times$,
					ConsesLow.cons(time, Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_times$)));
			Symbols.set(subl_benchmarks.$benchmark_hash_table_exerciser_finished$,
					Numbers.add(Symbols.symbol_value(subl_benchmarks.$benchmark_hash_table_exerciser_finished$),
							CommonSymbols.ONE_INTEGER));
		} finally {
			Locks.release_lock(lock_1);
		}
		return time;
	}

	public static SubLObject benchmark_hash_table_exerciser_process_int(SubLObject size) {
		SubLObject doneP = SubLNil.NIL;
		try {
			SubLObject table = SubLNil.NIL;
			table = benchmark_hash_table_exerciser_builder(size);
			benchmark_hash_table_exerciser_sorter(table);
			doneP = CommonSymbols.T;
		} finally {
		}
		return size;
	}

	public static SubLObject benchmark_hash_table_exerciser_sorter(SubLObject table) {
		SubLObject size = Hashtables.hash_table_count(table);
		SubLObject vector = Vectors.make_vector(size, CommonSymbols.UNPROVIDED);
		SubLObject key = SubLNil.NIL;
		SubLObject value = SubLNil.NIL;
		Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
		while (Hashtables.iteratorHasNext(cdohash_iterator)) {
			Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
			key = Hashtables.getEntryKey(cdohash_entry);
			value = Hashtables.getEntryValue(cdohash_entry);
			Vectors.set_aref(vector, key, value);
		}
		benchmark_hash_table_exerciser_verify_sort(
				Sort.sort(vector, Symbols.symbol_function(subl_benchmarks.$constants[3]), CommonSymbols.UNPROVIDED));
		return vector;
	}

	public static SubLObject benchmark_hash_table_exerciser_verify_sort(SubLObject vector) {
		SubLObject i;
		SubLObject a;
		SubLObject b;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; SubLNil.toBool(
				Numbers.numL(i, Numbers.subtract(Sequences.length(vector), CommonSymbols.ONE_INTEGER))); i = Numbers
						.add(i, CommonSymbols.ONE_INTEGER)) {
			a = Vectors.aref(vector, i);
			b = Vectors.aref(vector, Numbers.add(i, CommonSymbols.ONE_INTEGER));
			if (!SubLNil.toBool(Strings.stringLE(a, b)))
				Errors.error(subl_benchmarks.$constants[4],
						new SubLObject[] { i, a, Numbers.add(i, CommonSymbols.ONE_INTEGER), b });
		}
		return CommonSymbols.T;
	}

	public static SubLObject declare_subl_benchmarks_file() {
		SubLFiles.declareFunction(subl_benchmarks.me, "benchmark_hash_table_exerciser",
				"BENCHMARK-HASH-TABLE-EXERCISER", 4, 0, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "benchmark_hash_table_exerciser_guts",
				"BENCHMARK-HASH-TABLE-EXERCISER-GUTS", 2, 0, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "benchmark_hash_table_exerciser_process",
				"BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", 0, 0, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "test_benchmark_hash_table_exerciser_process",
				"TEST-BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", 1, 1, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "benchmark_hash_table_exerciser_process_int",
				"BENCHMARK-HASH-TABLE-EXERCISER-PROCESS-INT", 1, 0, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "benchmark_hash_table_exerciser_builder",
				"BENCHMARK-HASH-TABLE-EXERCISER-BUILDER", 1, 0, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "benchmark_hash_table_exerciser_sorter",
				"BENCHMARK-HASH-TABLE-EXERCISER-SORTER", 1, 0, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "benchmark_hash_table_exerciser_verify_sort",
				"BENCHMARK-HASH-TABLE-EXERCISER-VERIFY-SORT", 1, 0, false);
		SubLFiles.declareFunction(subl_benchmarks.me, "numeric_median", "NUMERIC-MEDIAN", 1, 0, false);
		return SubLNil.NIL;
	}

	public static SubLObject init_subl_benchmarks_file() {
		subl_benchmarks.$constants[0] = SubLObjectFactory.makeString("Hash Table Exerciser Lock");
		subl_benchmarks.$constants[1] = SubLObjectFactory.makeString("Hash Table Exerciser Parallel Thread ");
		subl_benchmarks.$constants[2] = SubLObjectFactory.makeSymbol("BENCHMARK-HASH-TABLE-EXERCISER-PROCESS",
				"SUBLISP");
		subl_benchmarks.$constants[3] = SubLObjectFactory.makeSublispSymbol("STRING<");
		subl_benchmarks.$constants[4] = SubLObjectFactory
				.makeString("The array elements ~D (~S) and ~D (~S) are not sorted.");
		subl_benchmarks.$constants[5] = SubLObjectFactory.makeSublispSymbol("CONSP");
		subl_benchmarks.$constants[6] = SubLObjectFactory.makeSublispSymbol("<");
		subl_benchmarks.$benchmark_hash_table_verboseP$ = SubLFiles.defvar(subl_benchmarks.me,
				"*BENCHMARK-HASH-TABLE-VERBOSE?*", SubLNil.NIL);
		subl_benchmarks.$benchmark_hash_table_exerciser_lock$ = SubLFiles.deflexical(subl_benchmarks.me,
				"*BENCHMARK-HASH-TABLE-EXERCISER-LOCK*", Locks.make_lock(subl_benchmarks.$constants[0]));
		subl_benchmarks.$benchmark_hash_table_exerciser_table_size$ = SubLFiles.deflexical(subl_benchmarks.me,
				"*BENCHMARK-HASH-TABLE-EXERCISER-TABLE-SIZE*", SubLNil.NIL);
		subl_benchmarks.$benchmark_hash_table_exerciser_finished$ = SubLFiles.deflexical(subl_benchmarks.me,
				"*BENCHMARK-HASH-TABLE-EXERCISER-FINISHED*", CommonSymbols.ZERO_INTEGER);
		subl_benchmarks.$benchmark_hash_table_exerciser_times$ = SubLFiles.deflexical(subl_benchmarks.me,
				"*BENCHMARK-HASH-TABLE-EXERCISER-TIMES*", SubLNil.NIL);
		return SubLNil.NIL;
	}

	public static SubLObject numeric_median(SubLObject numbers) {
		numbers.checkType((SubLSymbol) subl_benchmarks.$constants[5]);
		SubLObject length = Sequences.length(numbers);
		SubLObject middle_position = Numbers.integerDivide(length, CommonSymbols.TWO_INTEGER);
		SubLObject sorted_numbers = Sort.sort(conses_high.copy_list(numbers),
				Symbols.symbol_function(subl_benchmarks.$constants[6]), CommonSymbols.UNPROVIDED);
		if (SubLNil.toBool(Numbers.oddp(length)))
			return ConsesLow.nth(middle_position, sorted_numbers);
		return Numbers.divide(
				Numbers.add(ConsesLow.nth(middle_position, sorted_numbers),
						ConsesLow.nth(Numbers.subtract(middle_position, CommonSymbols.ONE_INTEGER), sorted_numbers)),
				CommonSymbols.TWO_INTEGER);
	}

	public static SubLObject setup_subl_benchmarks_file() {
		return SubLNil.NIL;
	}

	public static SubLObject test_benchmark_hash_table_exerciser_process(SubLObject size, SubLObject repeat_count) {
		if (repeat_count == CommonSymbols.UNPROVIDED)
			repeat_count = CommonSymbols.ONE_INTEGER;
		SubLObject time = SubLNil.NIL;
		SubLObject time_var = Time.get_internal_real_time();
		SubLObject i;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; SubLNil
				.toBool(Numbers.numL(i, repeat_count)); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
			benchmark_hash_table_exerciser_process_int(size);
		time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var),
				Symbols.symbol_value(time_high.$internal_time_units_per_second$));
		return time;
	}

	public static SubLFile me;
	private static SubLObject[] $constants;
	public static SubLSymbol $benchmark_hash_table_verboseP$;
	private static SubLSymbol $benchmark_hash_table_exerciser_lock$;
	private static SubLSymbol $benchmark_hash_table_exerciser_table_size$;
	private static SubLSymbol $benchmark_hash_table_exerciser_finished$;
	private static SubLSymbol $benchmark_hash_table_exerciser_times$;
	static {
		me = new subl_benchmarks();
		$constants = new SubLObject[7];
		subl_benchmarks.$benchmark_hash_table_verboseP$ = null;
		subl_benchmarks.$benchmark_hash_table_exerciser_lock$ = null;
		subl_benchmarks.$benchmark_hash_table_exerciser_table_size$ = null;
		subl_benchmarks.$benchmark_hash_table_exerciser_finished$ = null;
		subl_benchmarks.$benchmark_hash_table_exerciser_times$ = null;
	}

	@Override
	public void declareFunctions() {
		declare_subl_benchmarks_file();
	}

	@Override
	public void initializeVariables() {
		init_subl_benchmarks_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_subl_benchmarks_file();
	}

	public subl_benchmarks() {
		PrologSync.addSingleton(this);
	}
}
