/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

import java.util.Iterator;
import java.util.Map.Entry;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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

public  final class subl_benchmarks implements SubLFile, CommonSymbols {

  //// Constructor

  private subl_benchmarks() {}
  public static final SubLFile me = new subl_benchmarks();

  //// Internal Constants

  private static final SubLObject[] $constants = new SubLObject[7];

  //// Definitions

  public static SubLSymbol $benchmark_hash_table_verboseP$ = null;

  public static final SubLObject benchmark_hash_table_exerciser(SubLObject thread_count, SubLObject throwaway_thread_n, SubLObject thread_sample_n, SubLObject hash_table_size) {
    {
      SubLObject times = NIL;
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, throwaway_thread_n)); i = Numbers.add(i, ONE_INTEGER)) {
          Storage.gc_ephemeral();
          benchmark_hash_table_exerciser_guts(thread_count, hash_table_size);
        }
      }
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, thread_sample_n)); i = Numbers.add(i, ONE_INTEGER)) {
          Storage.gc_ephemeral();
          times = ConsesLow.cons(benchmark_hash_table_exerciser_guts(thread_count, hash_table_size), times);
        }
      }
      {
        SubLObject median = numeric_median(times);
        return median;
      }
    }
  }

  private static SubLSymbol $benchmark_hash_table_exerciser_lock$ = null;

  private static SubLSymbol $benchmark_hash_table_exerciser_table_size$ = null;

  private static SubLSymbol $benchmark_hash_table_exerciser_finished$ = null;

  private static SubLSymbol $benchmark_hash_table_exerciser_times$ = null;

  public static final SubLObject benchmark_hash_table_exerciser_guts(SubLObject thread_count, SubLObject hash_table_size) {
    {
      SubLObject lock = Symbols.symbol_value($benchmark_hash_table_exerciser_lock$);
      try {
          Locks.seize_lock(lock);
          Symbols.set($benchmark_hash_table_exerciser_table_size$, hash_table_size);
          Symbols.set($benchmark_hash_table_exerciser_finished$, ZERO_INTEGER);
          Symbols.set($benchmark_hash_table_exerciser_times$, NIL);
          {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, thread_count)); i = Numbers.add(i, ONE_INTEGER)) {
              {
                SubLObject process_name = Sequences.cconcatenate($constants[1], print_high.princ_to_string(i));
                Threads.make_process(process_name, $constants[2]);
              }
            }
          }
        } finally {
          Locks.release_lock(lock);
        }
    }
    {
      SubLObject finishedP = NIL;
      for (; (!(SubLNil.toBool(finishedP))); ) {
        Threads.sleep(ONE_INTEGER);
        {
          SubLObject lock = Symbols.symbol_value($benchmark_hash_table_exerciser_lock$);
          try {
              Locks.seize_lock(lock);
              finishedP = Numbers.numE(Symbols.symbol_value($benchmark_hash_table_exerciser_finished$), thread_count);
            } finally {
              Locks.release_lock(lock);
            }
        }
      }
    }
    {
      SubLObject times = NIL;
      SubLObject lock = Symbols.symbol_value($benchmark_hash_table_exerciser_lock$);
      try {
          Locks.seize_lock(lock);
          times = Symbols.symbol_value($benchmark_hash_table_exerciser_times$);
        } finally {
          Locks.release_lock(lock);
        }
      {
        SubLObject median = numeric_median(times);
        return median;
      }
    }
  }

  public static final SubLObject benchmark_hash_table_exerciser_process() {
    {
      SubLObject size = NIL;
      SubLObject time = NIL;
      SubLObject lock = Symbols.symbol_value($benchmark_hash_table_exerciser_lock$);
      try {
          Locks.seize_lock(lock);
          size = Symbols.symbol_value($benchmark_hash_table_exerciser_table_size$);
        } finally {
          Locks.release_lock(lock);
        }
      {
        SubLObject time_var = Time.get_internal_real_time();
        benchmark_hash_table_exerciser_process_int(size);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), Symbols.symbol_value(time_high.$internal_time_units_per_second$));
      }
      {
        SubLObject lock_1 = Symbols.symbol_value($benchmark_hash_table_exerciser_lock$);
        try {
            Locks.seize_lock(lock_1);
            Symbols.set($benchmark_hash_table_exerciser_times$, ConsesLow.cons(time, Symbols.symbol_value($benchmark_hash_table_exerciser_times$)));
            Symbols.set($benchmark_hash_table_exerciser_finished$, Numbers.add(Symbols.symbol_value($benchmark_hash_table_exerciser_finished$), ONE_INTEGER));
          } finally {
            Locks.release_lock(lock_1);
          }
      }
      return time;
    }
  }

  public static final SubLObject test_benchmark_hash_table_exerciser_process(SubLObject size, SubLObject repeat_count) {
    if ((repeat_count == UNPROVIDED)) {
      repeat_count = ONE_INTEGER;
    }
    {
      SubLObject time = NIL;
      SubLObject time_var = Time.get_internal_real_time();
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, repeat_count)); i = Numbers.add(i, ONE_INTEGER)) {
          benchmark_hash_table_exerciser_process_int(size);
        }
      }
      time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), Symbols.symbol_value(time_high.$internal_time_units_per_second$));
      return time;
    }
  }

  public static final SubLObject benchmark_hash_table_exerciser_process_int(SubLObject size) {
    {
      SubLObject doneP = NIL;
      try {
          {
            SubLObject table = NIL;
            table = benchmark_hash_table_exerciser_builder(size);
            benchmark_hash_table_exerciser_sorter(table);
            doneP = T;
          }
        } finally {
        }
    }
    return size;
  }

  public static final SubLObject benchmark_hash_table_exerciser_builder(SubLObject size) {
    {
      SubLObject table = Hashtables.make_hash_table(size, UNPROVIDED, UNPROVIDED);
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, size)); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject code = print_high.princ_to_string(random.random(size));
          Hashtables.sethash(i, table, code);
        }
      }
      return table;
    }
  }

  public static final SubLObject benchmark_hash_table_exerciser_sorter(SubLObject table) {
    {
      SubLObject size = Hashtables.hash_table_count(table);
      SubLObject vector = Vectors.make_vector(size, UNPROVIDED);
      SubLObject cdohash_table = table;
      SubLObject key = NIL;
      SubLObject value = NIL;
      {
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
          Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
          key = Hashtables.getEntryKey(cdohash_entry);
          value = Hashtables.getEntryValue(cdohash_entry);
          Vectors.set_aref(vector, key, value);
        }
      }
      benchmark_hash_table_exerciser_verify_sort(Sort.sort(vector, Symbols.symbol_function($constants[3]), UNPROVIDED));
      return vector;
    }
  }

  public static final SubLObject benchmark_hash_table_exerciser_verify_sort(SubLObject vector) {
    {
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, Numbers.subtract(Sequences.length(vector), ONE_INTEGER))); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject a = Vectors.aref(vector, i);
          SubLObject b = Vectors.aref(vector, Numbers.add(i, ONE_INTEGER));
          if ((!(SubLNil.toBool(Strings.stringLE(a, b))))) {
            Errors.error($constants[4], new SubLObject[] {i, a, Numbers.add(i, ONE_INTEGER), b});
          }
        }
      }
    }
    return T;
  }

  public static final SubLObject numeric_median(SubLObject numbers) {
    numbers.checkType(((SubLSymbol) $constants[5])); // CONSP
    {
      SubLObject length = Sequences.length(numbers);
      SubLObject middle_position = Numbers.integerDivide(length, TWO_INTEGER);
      SubLObject sorted_numbers = Sort.sort(conses_high.copy_list(numbers), Symbols.symbol_function($constants[6]), UNPROVIDED);
      if (SubLNil.toBool(Numbers.oddp(length))) {
        return ConsesLow.nth(middle_position, sorted_numbers);
      } else {
        return Numbers.divide(Numbers.add(ConsesLow.nth(middle_position, sorted_numbers), ConsesLow.nth(Numbers.subtract(middle_position, ONE_INTEGER), sorted_numbers)), TWO_INTEGER);
      }
    }
  }

  public static final SubLObject declare_subl_benchmarks_file() {
    SubLFiles.declareFunction(me, "benchmark_hash_table_exerciser", "BENCHMARK-HASH-TABLE-EXERCISER", 4, 0, false);
    SubLFiles.declareFunction(me, "benchmark_hash_table_exerciser_guts", "BENCHMARK-HASH-TABLE-EXERCISER-GUTS", 2, 0, false);
    SubLFiles.declareFunction(me, "benchmark_hash_table_exerciser_process", "BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", 0, 0, false);
    SubLFiles.declareFunction(me, "test_benchmark_hash_table_exerciser_process", "TEST-BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", 1, 1, false);
    SubLFiles.declareFunction(me, "benchmark_hash_table_exerciser_process_int", "BENCHMARK-HASH-TABLE-EXERCISER-PROCESS-INT", 1, 0, false);
    SubLFiles.declareFunction(me, "benchmark_hash_table_exerciser_builder", "BENCHMARK-HASH-TABLE-EXERCISER-BUILDER", 1, 0, false);
    SubLFiles.declareFunction(me, "benchmark_hash_table_exerciser_sorter", "BENCHMARK-HASH-TABLE-EXERCISER-SORTER", 1, 0, false);
    SubLFiles.declareFunction(me, "benchmark_hash_table_exerciser_verify_sort", "BENCHMARK-HASH-TABLE-EXERCISER-VERIFY-SORT", 1, 0, false);
    SubLFiles.declareFunction(me, "numeric_median", "NUMERIC-MEDIAN", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_subl_benchmarks_file() {
    $constants[0] = SubLObjectFactory.makeString("Hash Table Exerciser Lock");
    $constants[1] = SubLObjectFactory.makeString("Hash Table Exerciser Parallel Thread ");
    $constants[2] = SubLObjectFactory.makeSymbol("BENCHMARK-HASH-TABLE-EXERCISER-PROCESS", "SUBLISP");
    $constants[3] = SubLObjectFactory.makeSublispSymbol("STRING<");
    $constants[4] = SubLObjectFactory.makeString("The array elements ~D (~S) and ~D (~S) are not sorted.");
    $constants[5] = SubLObjectFactory.makeSublispSymbol("CONSP");
    $constants[6] = SubLObjectFactory.makeSublispSymbol("<");
    $benchmark_hash_table_verboseP$ = SubLFiles.defvar(me, "*BENCHMARK-HASH-TABLE-VERBOSE?*", NIL);
    $benchmark_hash_table_exerciser_lock$ = SubLFiles.deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-LOCK*", Locks.make_lock($constants[0]));
    $benchmark_hash_table_exerciser_table_size$ = SubLFiles.deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-TABLE-SIZE*", NIL);
    $benchmark_hash_table_exerciser_finished$ = SubLFiles.deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-FINISHED*", ZERO_INTEGER);
    $benchmark_hash_table_exerciser_times$ = SubLFiles.deflexical(me, "*BENCHMARK-HASH-TABLE-EXERCISER-TIMES*", NIL);
    return NIL;
  }

  public static final SubLObject setup_subl_benchmarks_file() {
        return NIL;
  }

  //// Initializers

  public void declareFunctions() {
    declare_subl_benchmarks_file();
  }

  public void initializeVariables() {
    init_subl_benchmarks_file();
  }

  public void runTopLevelForms() {
    setup_subl_benchmarks_file();
  }

}
