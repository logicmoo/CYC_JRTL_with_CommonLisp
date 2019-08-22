/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSublispSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static org.logicmoo.system.Startup.addSubLFile;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;


public class subl_benchmarks implements SubLFile {
    public static SubLObject benchmark_hash_table_exerciser(SubLObject thread_count, SubLObject throwaway_thread_n, SubLObject thread_sample_n, SubLObject hash_table_size) {
        SubLObject times = SubLNil.NIL;
        SubLObject i;
        for (i = SubLNil.NIL, i = ZERO_INTEGER; SubLNil.toBool(numL(i, throwaway_thread_n)); i = add(i, ONE_INTEGER)) {
            Storage.gc_ephemeral();
            benchmark_hash_table_exerciser_guts(thread_count, hash_table_size);
        }
        for (i = SubLNil.NIL, i = ZERO_INTEGER; SubLNil.toBool(numL(i, thread_sample_n)); i = add(i, ONE_INTEGER)) {
            Storage.gc_ephemeral();
            times = cons(benchmark_hash_table_exerciser_guts(thread_count, hash_table_size), times);
        }
        SubLObject median = numeric_median(times);
        return median;
    }

    public static SubLObject benchmark_hash_table_exerciser_builder(SubLObject size) {
        SubLObject table = make_hash_table(size, UNPROVIDED, UNPROVIDED);
        SubLObject i;
        SubLObject code;
        for (i = SubLNil.NIL, i = ZERO_INTEGER; SubLNil.toBool(numL(i, size)); i = add(i, ONE_INTEGER)) {
            code = princ_to_string(random.random(size));
            sethash(i, table, code);
        }
        return table;
    }

    public static SubLObject benchmark_hash_table_exerciser_guts(SubLObject thread_count, SubLObject hash_table_size) {
        SubLObject lock = symbol_value($benchmark_hash_table_exerciser_lock$);
        try {
            seize_lock(lock);
            set($benchmark_hash_table_exerciser_table_size$, hash_table_size);
            set($benchmark_hash_table_exerciser_finished$, ZERO_INTEGER);
            set($benchmark_hash_table_exerciser_times$, SubLNil.NIL);
            SubLObject i;
            SubLObject process_name;
            for (i = SubLNil.NIL, i = ZERO_INTEGER; SubLNil.toBool(numL(i, thread_count)); i = add(i, ONE_INTEGER)) {
                process_name = cconcatenate($constants[1], princ_to_string(i));
                make_process(process_name, $constants[2]);
            }
        } finally {
            release_lock(lock);
        }
        SubLObject finishedP = SubLNil.NIL;
        while (!SubLNil.toBool(finishedP)) {
            sleep(ONE_INTEGER);
            SubLObject lock2 = symbol_value($benchmark_hash_table_exerciser_lock$);
            try {
                seize_lock(lock2);
                finishedP = numE(symbol_value($benchmark_hash_table_exerciser_finished$), thread_count);
            } finally {
                release_lock(lock2);
            }
        } 
        SubLObject times = SubLNil.NIL;
        SubLObject lock2 = symbol_value($benchmark_hash_table_exerciser_lock$);
        try {
            seize_lock(lock2);
            times = symbol_value($benchmark_hash_table_exerciser_times$);
        } finally {
            release_lock(lock2);
        }
        SubLObject median = numeric_median(times);
        return median;
    }

    public static SubLObject benchmark_hash_table_exerciser_process() {
        SubLObject size = SubLNil.NIL;
        SubLObject time = SubLNil.NIL;
        SubLObject lock = symbol_value($benchmark_hash_table_exerciser_lock$);
        try {
            seize_lock(lock);
            size = symbol_value($benchmark_hash_table_exerciser_table_size$);
        } finally {
            release_lock(lock);
        }
        SubLObject time_var = get_internal_real_time();
        benchmark_hash_table_exerciser_process_int(size);
        time = divide(subtract(get_internal_real_time(), time_var), symbol_value(time_high.$internal_time_units_per_second$));
        SubLObject lock_1 = symbol_value($benchmark_hash_table_exerciser_lock$);
        try {
            seize_lock(lock_1);
            set($benchmark_hash_table_exerciser_times$, cons(time, symbol_value($benchmark_hash_table_exerciser_times$)));
            set($benchmark_hash_table_exerciser_finished$, add(symbol_value($benchmark_hash_table_exerciser_finished$), ONE_INTEGER));
        } finally {
            release_lock(lock_1);
        }
        return time;
    }

    public static SubLObject benchmark_hash_table_exerciser_process_int(SubLObject size) {
        SubLObject doneP = SubLNil.NIL;
        try {
            SubLObject table = SubLNil.NIL;
            table = benchmark_hash_table_exerciser_builder(size);
            benchmark_hash_table_exerciser_sorter(table);
            doneP = T;
        } finally {
        }
        return size;
    }

    public static SubLObject benchmark_hash_table_exerciser_sorter(SubLObject table) {
        SubLObject size = hash_table_count(table);
        SubLObject vector = make_vector(size, UNPROVIDED);
        SubLObject key = SubLNil.NIL;
        SubLObject value = SubLNil.NIL;
        Iterator cdohash_iterator = getEntrySetIterator(table);
        while (iteratorHasNext(cdohash_iterator)) {
            Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
            key = getEntryKey(cdohash_entry);
            value = getEntryValue(cdohash_entry);
            set_aref(vector, key, value);
        } 
        benchmark_hash_table_exerciser_verify_sort(Sort.sort(vector, symbol_function($constants[3]), UNPROVIDED));
        return vector;
    }

    public static SubLObject benchmark_hash_table_exerciser_verify_sort(SubLObject vector) {
        SubLObject i;
        SubLObject a;
        SubLObject b;
        for (i = SubLNil.NIL, i = ZERO_INTEGER; SubLNil.toBool(numL(i, subtract(length(vector), ONE_INTEGER))); i = add(i, ONE_INTEGER)) {
            a = aref(vector, i);
            b = aref(vector, add(i, ONE_INTEGER));
            if (!SubLNil.toBool(Strings.stringLE(a, b)))
                Errors.error($constants[4], new SubLObject[]{ i, a, add(i, ONE_INTEGER), b });

        }
        return T;
    }

    public static SubLObject declare_subl_benchmarks_file() {
        declareFunction(me, "benchmark_hash_table_exerciser", "BENCHMARK-HASH-TABLE-EXERCISER", 4, 0, false);
        declareFunction(me, "benchmark_hash_table_exerciser_guts", "BENCHMARK-HASH-TABLE-EXERCISER-GUTS", 2, 0, false);
        declareFunction(me, "benchmark_hash_table_exerciser_process", "BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", 0, 0, false);
        declareFunction(me, "test_benchmark_hash_table_exerciser_process", "TEST-BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", 1, 1, false);
        declareFunction(me, "benchmark_hash_table_exerciser_process_int", "BENCHMARK-HASH-TABLE-EXERCISER-PROCESS-INT", 1, 0, false);
        declareFunction(me, "benchmark_hash_table_exerciser_builder", "BENCHMARK-HASH-TABLE-EXERCISER-BUILDER", 1, 0, false);
        declareFunction(me, "benchmark_hash_table_exerciser_sorter", "BENCHMARK-HASH-TABLE-EXERCISER-SORTER", 1, 0, false);
        declareFunction(me, "benchmark_hash_table_exerciser_verify_sort", "BENCHMARK-HASH-TABLE-EXERCISER-VERIFY-SORT", 1, 0, false);
        declareFunction(me, "numeric_median", "NUMERIC-MEDIAN", 1, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject init_subl_benchmarks_file() {
        $constants[0] = makeString("Hash Table Exerciser Lock");
        $constants[1] = makeString("Hash Table Exerciser Parallel Thread ");
        $constants[2] = makeSymbol("BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", "SUBLISP");
        $constants[3] = makeSublispSymbol("STRING<");
        $constants[4] = makeString("The array elements ~D (~S) and ~D (~S) are not sorted.");
        $constants[5] = makeSublispSymbol("CONSP");
        $constants[6] = makeSublispSymbol("<");
        defvar(me, "*BENCHMARK-HASH-TABLE-VERBOSE?*", SubLNil.NIL);
        deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-LOCK*", make_lock($constants[0]));
        deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-TABLE-SIZE*", SubLNil.NIL);
        deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-FINISHED*", ZERO_INTEGER);
        deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-TIMES*", SubLNil.NIL);
        return SubLNil.NIL;
    }

    public static SubLObject numeric_median(SubLObject numbers) {
        numbers.checkType(((SubLSymbol) ($constants[5])));
        SubLObject length = length(numbers);
        SubLObject middle_position = integerDivide(length, TWO_INTEGER);
        SubLObject sorted_numbers = Sort.sort(copy_list(numbers), symbol_function($constants[6]), UNPROVIDED);
        if (SubLNil.toBool(oddp(length)))
            return nth(middle_position, sorted_numbers);

        return divide(add(nth(middle_position, sorted_numbers), nth(subtract(middle_position, ONE_INTEGER), sorted_numbers)), TWO_INTEGER);
    }

    public static SubLObject setup_subl_benchmarks_file() {
        return SubLNil.NIL;
    }

    public static SubLObject test_benchmark_hash_table_exerciser_process(SubLObject size, SubLObject repeat_count) {
        if (repeat_count == UNPROVIDED)
            repeat_count = ONE_INTEGER;

        SubLObject time = SubLNil.NIL;
        SubLObject time_var = get_internal_real_time();
        SubLObject i;
        for (i = SubLNil.NIL, i = ZERO_INTEGER; SubLNil.toBool(numL(i, repeat_count)); i = add(i, ONE_INTEGER))
            benchmark_hash_table_exerciser_process_int(size);

        time = divide(subtract(get_internal_real_time(), time_var), symbol_value(time_high.$internal_time_units_per_second$));
        return time;
    }

    public static final SubLFile me = new subl_benchmarks();

    // Internal Constants
    private static final SubLObject[] $constants = new SubLObject[7];

    // defvar
    // Definitions
    public static final SubLSymbol $benchmark_hash_table_verboseP$ = makeSymbol("*BENCHMARK-HASH-TABLE-VERBOSE?*");

    // deflexical
    private static final SubLSymbol $benchmark_hash_table_exerciser_lock$ = makeSymbol("*BENCHMARK-HASH-TABLE-EXERCISER-LOCK*");

    // deflexical
    private static final SubLSymbol $benchmark_hash_table_exerciser_table_size$ = makeSymbol("*BENCHMARK-HASH-TABLE-EXERCISER-TABLE-SIZE*");

    // deflexical
    private static final SubLSymbol $benchmark_hash_table_exerciser_finished$ = makeSymbol("*BENCHMARK-HASH-TABLE-EXERCISER-FINISHED*");

    // deflexical
    private static final SubLSymbol $benchmark_hash_table_exerciser_times$ = makeSymbol("*BENCHMARK-HASH-TABLE-EXERCISER-TIMES*");

    

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
        addSubLFile(this);
    }
}

